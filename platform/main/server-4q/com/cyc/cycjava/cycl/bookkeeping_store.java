package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class bookkeeping_store
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.bookkeeping_store";
  public static final String myFingerPrint = "bb198128e7f32a4b997447d099a967836be467d3d29b96794b731a59465e28e1";
  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 11925L)
  private static SubLSymbol $bookkeeping_predicates_for_hl_store$;
  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 12575L)
  private static SubLSymbol $arg2_indexed_bookkeeping_predicates_for_hl_store$;
  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 16268L)
  private static SubLSymbol $bookkeeping_binary_gaf_store$;
  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 16542L)
  private static SubLSymbol $bookkeeping_binary_gaf_arg2_index$;
  private static final SubLSymbol $sym0$FORT_P;
  private static final SubLSymbol $sym1$HLMT_P;
  private static final SubLSymbol $sym2$HL_ASSERT_BOOKKEEPING_BINARY_GAF;
  private static final SubLSymbol $sym3$QUOTE;
  private static final SubLSymbol $sym4$_EXIT;
  private static final SubLList $list5;
  private static final SubLString $str6$Assert__PRED_ARG1_ARG2__in_MT_to_;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$HL_UNASSERT_BOOKKEEPING_BINARY_GAF;
  private static final SubLString $str10$Unassert__PRED_ARG1_ARG2__in_MT_f;
  private static final SubLObject $const11$BookkeepingMt;
  private static final SubLSymbol $sym12$ASSERTED_ARGUMENT_SPEC_P;
  private static final SubLSymbol $kw13$MONOTONIC;
  private static final SubLSymbol $kw14$STRENGTH;
  private static final SubLSymbol $kw15$BACKWARD;
  private static final SubLSymbol $kw16$DIRECTION;
  private static final SubLObject $const17$myCreator;
  private static final SubLSymbol $kw18$MY_CREATOR;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLObject $const21$myCreationTime;
  private static final SubLSymbol $kw22$MY_CREATION_TIME;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLObject $const25$myCreationPurpose;
  private static final SubLSymbol $kw26$MY_CREATION_PURPOSE;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLObject $const29$myCreationSecond;
  private static final SubLSymbol $kw30$MY_CREATION_SECOND;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLObject $const33$myCreationDate;
  private static final SubLSymbol $kw34$MY_CREATION_DATE;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$DO_ALIST;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$DO_DICTIONARY;
  private static final SubLSymbol $sym44$_BOOKKEEPING_BINARY_GAF_STORE_;
  private static final SubLSymbol $sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$DO_BOOKKEEPING_TOP_LEVEL_INDEX;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$DO_BOOKKEEPING_INTERMEDIATE_INDEX;
  private static final SubLSymbol $sym51$CREATOR;
  private static final SubLList $list52;
  private static final SubLString $str53$Identify_the_cyclist_who_created_;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$CREATION_TIME;
  private static final SubLString $str57$Identify_when_FORT_was_created_;
  private static final SubLList $list58;
  private static final SubLInteger $int59$1000000;
  private static final SubLSymbol $sym60$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC;
  private static final SubLSymbol $sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$SUBINDEX;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$SUBINDEX;
  private static final SubLSymbol $sym67$PRED;
  private static final SubLSymbol $sym68$ARG1;
  private static final SubLSymbol $sym69$ARG2;
  private static final SubLSymbol $sym70$CLET;
  private static final SubLSymbol $sym71$MAKE_BINARY_FORMULA;
  private static final SubLSymbol $kw72$UNKNOWN;
  private static final SubLObject $const73$different;
  private static final SubLObject $const74$arg2Format;
  private static final SubLList $list75;
  private static final SubLObject $const76$unknownSentence;
  private static final SubLObject $const77$completeExtentEnumerable;
  private static final SubLString $str78$Gathering_all__s_assertions;
  private static final SubLString $str79$___forgetting___S__S__S___;
  private static final SubLString $str80$Reindexing_all_;
  private static final SubLString $str81$_assertions;
  private static final SubLString $str82$cdolist;
  private static final SubLList $list83;
  private static final SubLString $str84$Gathering_invalid_bookkeeping_ass;
  private static final SubLList $list85;
  private static final SubLString $str86$Removing_;
  private static final SubLString $str87$_invalid_bookkeeping_assertions;
  private static final SubLString $str88$__Killed___S__S__S___;
  private static final SubLString $str89$__Could_not_kill___S__S__S___;

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 1052L)
  public static SubLObject hl_assert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym0$FORT_P );
    enforceType( mt, $sym1$HLMT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym2$HL_ASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym2$HL_ASSERT_BOOKKEEPING_BINARY_GAF, ConsesLow.list( $sym3$QUOTE, pred ), ConsesLow.list( $sym3$QUOTE, arg1 ), ConsesLow.list(
          $sym3$QUOTE, arg2 ), ConsesLow.list( $sym3$QUOTE, mt ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          return assert_bookkeeping_binary_gaf( pred, arg1, arg2, mt );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 1415L)
  public static SubLObject hl_unassert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym0$FORT_P );
    enforceType( mt, $sym1$HLMT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym9$HL_UNASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym9$HL_UNASSERT_BOOKKEEPING_BINARY_GAF, ConsesLow.list( $sym3$QUOTE, pred ), ConsesLow.list( $sym3$QUOTE, arg1 ), ConsesLow.list(
          $sym3$QUOTE, arg2 ), ConsesLow.list( $sym3$QUOTE, mt ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          return unassert_bookkeeping_binary_gaf( pred, arg1, arg2, mt );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 1731L)
  public static SubLObject bookkeeping_predicate_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != clause_utilities.pos_atomic_cnf_p( cnf ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      if( NIL != el_utilities.el_binary_formula_p( asent ) && NIL == el_utilities.sequence_term( asent ) && NIL != hlmt.hlmt_equal( mt, $const11$BookkeepingMt ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 2313L)
  public static SubLObject bookkeeping_predicate_hl_storage_module_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    assert NIL != arguments.asserted_argument_spec_p( argument_spec ) : argument_spec;
    SubLObject incompleteness = NIL;
    final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec( argument_spec );
    if( $kw13$MONOTONIC != strength_spec )
    {
      incompleteness = ConsesLow.cons( $kw14$STRENGTH, incompleteness );
    }
    if( $kw15$BACKWARD != direction )
    {
      incompleteness = ConsesLow.cons( $kw16$DIRECTION, incompleteness );
    }
    return incompleteness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 2807L)
  public static SubLObject bookkeeping_predicate_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
    hl_transcript_tracing.note_hlt_assert_bookkeeping_sentence( asent, mt );
    return hl_assert_bookkeeping_binary_gaf( pred, arg1, arg2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 3227L)
  public static SubLObject bookkeeping_predicate_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt)
  {
    final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
    hl_transcript_tracing.note_hlt_unassert_bookkeeping_sentence( asent, mt );
    return hl_unassert_bookkeeping_binary_gaf( pred, arg1, arg2, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 4523L)
  public static SubLObject my_creator_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != bookkeeping_predicate_hl_storage_module_applicableP( argument_spec, cnf, mt, direction, variable_map ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return formula_pattern_match.pattern_matches_formula( $list20, asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 5827L)
  public static SubLObject my_creation_time_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != bookkeeping_predicate_hl_storage_module_applicableP( argument_spec, cnf, mt, direction, variable_map ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return formula_pattern_match.pattern_matches_formula( $list24, asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 7108L)
  public static SubLObject my_creation_purpose_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != bookkeeping_predicate_hl_storage_module_applicableP( argument_spec, cnf, mt, direction, variable_map ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return formula_pattern_match.pattern_matches_formula( $list28, asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 8388L)
  public static SubLObject my_creation_second_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != bookkeeping_predicate_hl_storage_module_applicableP( argument_spec, cnf, mt, direction, variable_map ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return formula_pattern_match.pattern_matches_formula( $list32, asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 8877L)
  public static SubLObject my_creation_date_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != bookkeeping_predicate_hl_storage_module_applicableP( argument_spec, cnf, mt, direction, variable_map ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return formula_pattern_match.pattern_matches_formula( $list36, asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 8877L)
  public static SubLObject my_creation_date_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
    final SubLObject cycl_date = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
    final SubLObject univ_time = date_utilities.cycl_date_to_universal_time( cycl_date );
    if( NIL != numeric_date_utilities.universal_time_p( univ_time ) )
    {
      thread.resetMultipleValues();
      final SubLObject univ_date = numeric_date_utilities.universal_date_and_second_from_time( univ_time );
      final SubLObject univ_second = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return makeBoolean( univ_date.isPositive() && NIL != hl_assert_bookkeeping_binary_gaf( $const21$myCreationTime, arg1, univ_date, mt ) && ( !univ_second.isPositive() || NIL != hl_assert_bookkeeping_binary_gaf(
          $const29$myCreationSecond, arg1, univ_second, mt ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 8877L)
  public static SubLObject my_creation_date_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
    final SubLObject cycl_date = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
    final SubLObject univ_time = date_utilities.cycl_date_to_universal_time( cycl_date );
    if( NIL != numeric_date_utilities.universal_time_p( univ_time ) )
    {
      thread.resetMultipleValues();
      final SubLObject univ_date = numeric_date_utilities.universal_date_and_second_from_time( univ_time );
      final SubLObject univ_second = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return makeBoolean( univ_date.isPositive() && NIL != hl_unassert_bookkeeping_binary_gaf( $const21$myCreationTime, arg1, univ_date, mt ) && ( !univ_second.isPositive() || NIL != hl_unassert_bookkeeping_binary_gaf(
          $const29$myCreationSecond, arg1, univ_second, mt ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 12682L)
  public static SubLObject do_bookkeeping_top_level_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject subindex = NIL;
    SubLObject top_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    top_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym40$DO_ALIST, ConsesLow.list( key, subindex, top_index ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 12831L)
  public static SubLObject bookkeeping_predicates_for_hl_store()
  {
    return conses_high.copy_list( $bookkeeping_predicates_for_hl_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 12948L)
  public static SubLObject arg2_indexed_bookkeeping_predicates_for_hl_store()
  {
    return conses_high.copy_list( $arg2_indexed_bookkeeping_predicates_for_hl_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 13091L)
  public static SubLObject arg2_indexed_bookkeeping_predP(final SubLObject pred)
  {
    return subl_promotions.memberP( pred, arg2_indexed_bookkeeping_predicates_for_hl_store(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 13221L)
  public static SubLObject new_bookkeeping_top_level_index(final SubLObject top_level_keys)
  {
    SubLObject top_index = NIL;
    SubLObject cdolist_list_var = top_level_keys;
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = new_bookkeeping_intermediate_index();
      top_index = ConsesLow.cons( ConsesLow.cons( key, value ), top_index );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return Sequences.nreverse( top_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 13476L)
  public static SubLObject bookkeeping_top_level_index_lookup(final SubLObject index, final SubLObject key)
  {
    return conses_high.assoc( key, index, UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 13573L)
  public static SubLObject bookkeeping_top_level_index_insert(final SubLObject index, final SubLObject top_key, final SubLObject mid_key, final SubLObject leaf, final SubLObject single_entryP)
  {
    final SubLObject intermediate_index = bookkeeping_top_level_index_lookup( index, top_key );
    return bookkeeping_intermediate_index_insert( intermediate_index, mid_key, leaf, single_entryP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 13848L)
  public static SubLObject bookkeeping_top_level_index_delete(final SubLObject index, final SubLObject top_key, final SubLObject mid_key, final SubLObject leaf, final SubLObject single_entryP)
  {
    final SubLObject intermediate_index = bookkeeping_top_level_index_lookup( index, top_key );
    return bookkeeping_intermediate_index_delete( intermediate_index, mid_key, leaf, single_entryP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14123L)
  public static SubLObject bookkeeping_top_level_index_count(final SubLObject index)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = index;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject subindex = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
      pred = current.first();
      current = ( subindex = current.rest() );
      count = Numbers.add( count, bookkeeping_intermediate_index_count( subindex ) );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14368L)
  public static SubLObject do_bookkeeping_intermediate_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
    index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym43$DO_DICTIONARY, ConsesLow.list( key, value, index ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14547L)
  public static SubLObject new_bookkeeping_intermediate_index()
  {
    return dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14633L)
  public static SubLObject bookkeeping_intermediate_index_lookup(final SubLObject index, final SubLObject key)
  {
    return dictionary.dictionary_lookup( index, key, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14739L)
  public static SubLObject bookkeeping_intermediate_index_num_keys(final SubLObject index)
  {
    return dictionary.dictionary_length( index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14839L)
  public static SubLObject bookkeeping_intermediate_index_set(final SubLObject index, final SubLObject key, final SubLObject value)
  {
    return dictionary.dictionary_enter( index, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 14953L)
  public static SubLObject bookkeeping_intermediate_index_push(final SubLObject index, final SubLObject key, final SubLObject value)
  {
    SubLObject v_set = bookkeeping_intermediate_index_lookup( index, key );
    if( NIL == v_set )
    {
      v_set = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    set.set_add( value, v_set );
    dictionary.dictionary_enter( index, key, v_set );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 15268L)
  public static SubLObject bookkeeping_intermediate_index_delete_key(final SubLObject index, final SubLObject key)
  {
    return dictionary.dictionary_remove( index, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 15378L)
  public static SubLObject bookkeeping_intermediate_index_insert(final SubLObject index, final SubLObject key, final SubLObject value, final SubLObject single_entryP)
  {
    if( NIL != single_entryP )
    {
      return bookkeeping_intermediate_index_set( index, key, value );
    }
    return bookkeeping_intermediate_index_push( index, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 15671L)
  public static SubLObject bookkeeping_intermediate_index_delete(final SubLObject index, final SubLObject key, final SubLObject value, final SubLObject single_entryP)
  {
    final SubLObject lookup_value = bookkeeping_intermediate_index_lookup( index, key );
    if( NIL != lookup_value )
    {
      if( NIL == single_entryP )
      {
        return set.set_remove( value, lookup_value );
      }
      if( lookup_value.eql( value ) )
      {
        bookkeeping_intermediate_index_delete_key( index, key );
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 16171L)
  public static SubLObject bookkeeping_intermediate_index_count(final SubLObject index)
  {
    return dictionary.dictionary_length( index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 16760L)
  public static SubLObject clear_bookkeeping_binary_gaf_store()
  {
    $bookkeeping_binary_gaf_store$.setGlobalValue( new_bookkeeping_top_level_index( $bookkeeping_predicates_for_hl_store$.getGlobalValue() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 16972L)
  public static SubLObject dumper_num_top_level_index()
  {
    return Sequences.length( dumper_bookkeeping_binary_gaf_store() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17112L)
  public static SubLObject dumper_do_bookkeeping_top_level_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred = NIL;
    SubLObject subindex = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    subindex = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym47$DO_BOOKKEEPING_TOP_LEVEL_INDEX, ConsesLow.listS( pred, subindex, $list48 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17309L)
  public static SubLObject dumper_num_intermediate_index(final SubLObject index)
  {
    return bookkeeping_intermediate_index_num_keys( index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17423L)
  public static SubLObject dumper_do_bookkeeping_intermediate_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    SubLObject index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    arg2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym50$DO_BOOKKEEPING_INTERMEDIATE_INDEX, ConsesLow.list( arg1, arg2, index ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17593L)
  public static SubLObject dumper_bookkeeping_binary_gaf_store()
  {
    return bookkeeping_binary_gaf_store();
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17691L)
  public static SubLObject dumper_clear_bookkeeping_binary_gaf_store()
  {
    return clear_bookkeeping_binary_gaf_store();
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17801L)
  public static SubLObject dumper_load_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    return assert_bookkeeping_binary_gaf_int( pred, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 17973L)
  public static SubLObject dumper_dumpable_bookkeeping_index()
  {
    return bookkeeping_binary_gaf_arg2_index();
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 18087L)
  public static SubLObject dumper_load_bookkeeping_index(final SubLObject index)
  {
    $bookkeeping_binary_gaf_arg2_index$.setGlobalValue( index );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 18209L)
  public static SubLObject bookkeeping_binary_gaf_store()
  {
    return $bookkeeping_binary_gaf_store$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 18315L)
  public static SubLObject bookkeeping_binary_gaf_arg2_index()
  {
    return $bookkeeping_binary_gaf_arg2_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 18414L)
  public static SubLObject assert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt)
  {
    if( NIL == hlmt.hlmt_equal( mt, $const11$BookkeepingMt ) )
    {
      return NIL;
    }
    final SubLObject old_value = bookkeeping_fpred_value( pred, arg1, UNPROVIDED );
    if( NIL != old_value && !arg2.equal( old_value ) )
    {
      return NIL;
    }
    return makeBoolean( NIL != assert_bookkeeping_binary_gaf_int( pred, arg1, arg2 ) && NIL != add_bookkeeping_binary_gaf_indices( pred, arg1, arg2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 18954L)
  public static SubLObject assert_bookkeeping_binary_gaf_int(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    return bookkeeping_top_level_index_insert( bookkeeping_binary_gaf_store(), pred, arg1, arg2, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 19116L)
  public static SubLObject add_bookkeeping_binary_gaf_indices(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    return makeBoolean( NIL == arg2_indexed_bookkeeping_predP( pred ) || NIL != bookkeeping_top_level_index_insert( bookkeeping_binary_gaf_arg2_index(), pred, arg2, arg1, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 19338L)
  public static SubLObject unassert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt)
  {
    if( NIL != hlmt.hlmt_equal( mt, $const11$BookkeepingMt ) )
    {
      return makeBoolean( NIL != unassert_bookkeeping_binary_gaf_int( pred, arg1, arg2 ) && NIL != remove_bookkeeping_binary_gaf_indices( pred, arg1, arg2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 19668L)
  public static SubLObject unassert_bookkeeping_binary_gaf_int(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    return bookkeeping_top_level_index_delete( bookkeeping_binary_gaf_store(), pred, arg1, arg2, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 19832L)
  public static SubLObject remove_bookkeeping_binary_gaf_indices(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    return makeBoolean( NIL == arg2_indexed_bookkeeping_predP( pred ) || NIL != bookkeeping_top_level_index_delete( bookkeeping_binary_gaf_arg2_index(), pred, arg2, arg1, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 20057L)
  public static SubLObject unassert_all_bookkeeping_gafs_on_term(final SubLObject v_term)
  {
    SubLObject successP = T;
    SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject subindex = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
      pred = current.first();
      current = ( subindex = current.rest() );
      final SubLObject arg2 = bookkeeping_intermediate_index_lookup( subindex, v_term );
      if( NIL != arg2 && NIL == hl_unassert_bookkeeping_binary_gaf( pred, v_term, arg2, $const11$BookkeepingMt ) )
      {
        successP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    SubLObject created_terms = cdolist_list_var2 = terms_created_by( v_term, UNPROVIDED );
    SubLObject created_term = NIL;
    created_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL == hl_unassert_bookkeeping_binary_gaf( $const17$myCreator, created_term, v_term, $const11$BookkeepingMt ) )
      {
        successP = NIL;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      created_term = cdolist_list_var2.first();
    }
    created_terms = ( cdolist_list_var2 = terms_created_for( v_term, UNPROVIDED ) );
    created_term = NIL;
    created_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL == hl_unassert_bookkeeping_binary_gaf( $const25$myCreationPurpose, created_term, v_term, $const11$BookkeepingMt ) )
      {
        successP = NIL;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      created_term = cdolist_list_var2.first();
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 21079L)
  public static SubLObject unassert_all_bookkeeping_gafs_for_pred(final SubLObject pred)
  {
    return dictionary.clear_dictionary( bookkeeping_top_level_index_lookup( bookkeeping_binary_gaf_store(), pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 21266L)
  public static SubLObject creator(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    enforceType( fort, $sym0$FORT_P );
    enforceType( mt, $sym1$HLMT_P );
    return bookkeeping_fpred_value( $const17$myCreator, fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 21550L)
  public static SubLObject creation_time(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    enforceType( fort, $sym0$FORT_P );
    enforceType( mt, $sym1$HLMT_P );
    return bookkeeping_fpred_value( $const21$myCreationTime, fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 21795L)
  public static SubLObject creation_date(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return creation_time( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 21937L)
  public static SubLObject creation_purpose(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return bookkeeping_fpred_value( $const25$myCreationPurpose, fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 22109L)
  public static SubLObject creation_second(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return bookkeeping_fpred_value( $const29$myCreationSecond, fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 22289L)
  public static SubLObject created_when(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    final SubLObject date = creation_time( fort, mt );
    final SubLObject second = creation_second( fort, mt );
    if( second.isInteger() && date.isInteger() )
    {
      return Numbers.add( Numbers.multiply( $int59$1000000, date ), second );
    }
    if( date.isInteger() )
    {
      return Numbers.multiply( $int59$1000000, date );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 22703L)
  public static SubLObject creation_date_cycl(final SubLObject fort)
  {
    return removal_modules_bookkeeping.my_creation_date_arg2_lookup( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 22927L)
  public static SubLObject terms_created_by(final SubLObject cyclist, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return bookkeeping_arg1_pred_values( $const17$myCreator, cyclist, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 23064L)
  public static SubLObject terms_created_for(final SubLObject purpose, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return bookkeeping_arg1_pred_values( $const25$myCreationPurpose, purpose, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 23210L)
  public static SubLObject num_terms_created_by(final SubLObject cyclist, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return bookkeeping_arg1_assertion_count( $const17$myCreator, cyclist, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 23355L)
  public static SubLObject num_terms_created_for(final SubLObject purpose, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    return bookkeeping_arg1_assertion_count( $const25$myCreationPurpose, purpose, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 23509L)
  public static SubLObject bookkeeping_asents_on_term(final SubLObject v_term)
  {
    SubLObject asents = NIL;
    SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject subindex = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
      pred = current.first();
      current = ( subindex = current.rest() );
      final SubLObject arg2 = bookkeeping_intermediate_index_lookup( subindex, v_term );
      if( NIL != arg2 )
      {
        final SubLObject asent = el_utilities.make_binary_formula( pred, v_term, arg2 );
        asents = ConsesLow.cons( asent, asents );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 23857L)
  public static SubLObject bookkeeping_assertibles_on_term(final SubLObject v_term)
  {
    SubLObject assertibles = NIL;
    SubLObject cdolist_list_var;
    final SubLObject asents = cdolist_list_var = bookkeeping_asents_on_term( v_term );
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cnf = clause_utilities.make_gaf_cnf( asent );
      final SubLObject mt = $const11$BookkeepingMt;
      final SubLObject strength = $kw13$MONOTONIC;
      final SubLObject direction = $kw15$BACKWARD;
      final SubLObject variable_map = NIL;
      final SubLObject assertible = ConsesLow.list( cnf, mt, strength, direction, variable_map );
      assertibles = ConsesLow.cons( assertible, assertibles );
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    return assertibles;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 24396L)
  public static SubLObject bookkeeping_hl_assertion_specs_on_term(final SubLObject v_term)
  {
    final SubLObject asents = bookkeeping_asents_on_term( v_term );
    return Mapping.mapcar( $sym60$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC, asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 24582L)
  public static SubLObject bookkeeping_hl_assertibles_on_term(final SubLObject v_term)
  {
    final SubLObject asents = bookkeeping_asents_on_term( v_term );
    return Mapping.mapcar( $sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE, asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 24760L)
  public static SubLObject bookkeeping_asent_to_hl_assertion_spec(final SubLObject asent)
  {
    final SubLObject cnf = clause_utilities.make_gaf_cnf( asent );
    final SubLObject mt = $const11$BookkeepingMt;
    final SubLObject direction = $kw15$BACKWARD;
    final SubLObject variable_map = NIL;
    final SubLObject hl_assertion_spec = hl_storage_modules.new_hl_assertion_spec( cnf, mt, direction, variable_map );
    return hl_assertion_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 25035L)
  public static SubLObject bookkeeping_asent_to_hl_assertible(final SubLObject asent)
  {
    final SubLObject hl_assertion_spec = bookkeeping_asent_to_hl_assertion_spec( asent );
    final SubLObject strength = $kw13$MONOTONIC;
    final SubLObject argument_spec = arguments.create_asserted_argument_spec( strength );
    final SubLObject assertible = hl_storage_modules.new_hl_assertible( hl_assertion_spec, argument_spec );
    return assertible;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 25345L)
  public static SubLObject bookkeeping_assertion_count()
  {
    return bookkeeping_top_level_index_count( bookkeeping_binary_gaf_store() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 25648L)
  public static SubLObject num_bookkeeping_binary_gafs_on_term(final SubLObject v_term)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject subindex = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
      pred = current.first();
      current = ( subindex = current.rest() );
      if( NIL != bookkeeping_intermediate_index_lookup( subindex, v_term ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 26030L)
  public static SubLObject any_bookkeeping_assertions_on_termP(final SubLObject v_term)
  {
    SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject subindex = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
      pred = current.first();
      current = ( subindex = current.rest() );
      if( NIL != bookkeeping_intermediate_index_lookup( subindex, v_term ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 26282L)
  public static SubLObject do_bookkeeping_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred = NIL;
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject subindex = $sym63$SUBINDEX;
      return ConsesLow.list( $sym47$DO_BOOKKEEPING_TOP_LEVEL_INDEX, ConsesLow.listS( pred, subindex, $list64 ), ConsesLow.listS( $sym50$DO_BOOKKEEPING_INTERMEDIATE_INDEX, ConsesLow.list( arg1, arg2, subindex ), ConsesLow
          .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 26883L)
  public static SubLObject do_bookkeeping_asents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject asent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    asent = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject subindex = $sym66$SUBINDEX;
      final SubLObject pred = $sym67$PRED;
      final SubLObject arg1 = $sym68$ARG1;
      final SubLObject arg2 = $sym69$ARG2;
      return ConsesLow.list( $sym47$DO_BOOKKEEPING_TOP_LEVEL_INDEX, ConsesLow.listS( pred, subindex, $list64 ), ConsesLow.list( $sym50$DO_BOOKKEEPING_INTERMEDIATE_INDEX, ConsesLow.list( arg1, arg2, subindex ), ConsesLow
          .listS( $sym70$CLET, ConsesLow.list( ConsesLow.list( asent, ConsesLow.list( $sym71$MAKE_BINARY_FORMULA, pred, arg1, arg2 ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 27384L)
  public static SubLObject total_num_assertions_on_term(final SubLObject v_term)
  {
    SubLObject count = ZERO_INTEGER;
    count = Numbers.add( count, kb_indexing.num_index( v_term ) );
    count = Numbers.add( count, num_bookkeeping_binary_gafs_on_term( v_term ) );
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 27719L)
  public static SubLObject bookkeeping_asent_truth(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject predicate = el_utilities.unmake_binary_formula( asent );
    final SubLObject arg1 = thread.secondMultipleValue();
    final SubLObject arg2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return bookkeeping_assertion_truth( predicate, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 27939L)
  public static SubLObject bookkeeping_assertion_truth(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2)
  {
    if( predicate.eql( $const17$myCreator ) )
    {
      return enumeration_types.boolean_truth( Equality.eq( arg2, creator( arg1, UNPROVIDED ) ) );
    }
    if( predicate.eql( $const25$myCreationPurpose ) )
    {
      return enumeration_types.boolean_truth( Equality.eq( arg2, creation_purpose( arg1, UNPROVIDED ) ) );
    }
    if( predicate.eql( $const21$myCreationTime ) )
    {
      return enumeration_types.boolean_truth( Equality.eql( arg2, creation_time( arg1, UNPROVIDED ) ) );
    }
    if( predicate.eql( $const29$myCreationSecond ) )
    {
      return enumeration_types.boolean_truth( Equality.eql( arg2, creation_second( arg1, UNPROVIDED ) ) );
    }
    return $kw72$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 28390L)
  public static SubLObject indexed_terms_mentioned_in_bookkeeping_assertions_of_term(final SubLObject v_term)
  {
    SubLObject indexed_terms = NIL;
    indexed_terms = ConsesLow.cons( $const11$BookkeepingMt, indexed_terms );
    SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject pred = NIL;
      SubLObject subindex = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
      pred = current.first();
      current = ( subindex = current.rest() );
      if( NIL != kb_indexing_datastructures.indexed_term_p( pred ) )
      {
        indexed_terms = ConsesLow.cons( pred, indexed_terms );
      }
      final SubLObject arg2 = bookkeeping_intermediate_index_lookup( subindex, v_term );
      if( NIL != kb_indexing_datastructures.indexed_term_p( arg2 ) )
      {
        indexed_terms = ConsesLow.cons( arg2, indexed_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( indexed_terms, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 28889L)
  public static SubLObject why_not_bookkeeping_asent(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject predicate = el_utilities.unmake_binary_formula( asent );
    final SubLObject arg1 = thread.secondMultipleValue();
    final SubLObject arg2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject true_arg2 = NIL;
    final SubLObject pcase_var = predicate;
    if( pcase_var.eql( $const17$myCreator ) )
    {
      true_arg2 = creator( arg1, UNPROVIDED );
    }
    else if( pcase_var.eql( $const25$myCreationPurpose ) )
    {
      true_arg2 = creation_purpose( arg1, UNPROVIDED );
    }
    else if( pcase_var.eql( $const21$myCreationTime ) )
    {
      true_arg2 = creation_time( arg1, UNPROVIDED );
    }
    else if( pcase_var.eql( $const29$myCreationSecond ) )
    {
      true_arg2 = creation_second( arg1, UNPROVIDED );
    }
    if( NIL != true_arg2 )
    {
      final SubLObject its_something_else = el_utilities.replace_formula_arg( TWO_INTEGER, true_arg2, asent );
      final SubLObject youre_different = ConsesLow.list( $const73$different, arg2, true_arg2 );
      final SubLObject there_can_be_only_one = ConsesLow.listS( $const74$arg2Format, predicate, $list75 );
      return ConsesLow.list( its_something_else, youre_different, there_can_be_only_one );
    }
    final SubLObject its_unknown = ConsesLow.list( $const76$unknownSentence, asent );
    final SubLObject complete_extent = ConsesLow.list( $const77$completeExtentEnumerable, predicate );
    return ConsesLow.list( its_unknown, complete_extent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 29869L)
  public static SubLObject bookkeeping_fpred_value(final SubLObject pred, final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    if( NIL != hlmt.hlmt_equal( mt, $const11$BookkeepingMt ) )
    {
      return bookkeeping_fpred_value_int( pred, arg1 );
    }
    return kb_mapping_utilities.fpred_value_in_mt( arg1, pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 30127L)
  public static SubLObject bookkeeping_fpred_value_int(final SubLObject pred, final SubLObject arg1)
  {
    final SubLObject arg1_subindex = bookkeeping_top_level_index_lookup( bookkeeping_binary_gaf_store(), pred );
    if( NIL != arg1_subindex )
    {
      final SubLObject arg2 = bookkeeping_intermediate_index_lookup( arg1_subindex, arg1 );
      return arg2;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 30416L)
  public static SubLObject bookkeeping_arg1_pred_values(final SubLObject pred, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    if( NIL != hlmt.hlmt_equal( mt, $const11$BookkeepingMt ) )
    {
      return bookkeeping_arg1_pred_values_int( pred, arg2 );
    }
    return kb_mapping_utilities.pred_values_in_mt( arg2, pred, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 30654L)
  public static SubLObject bookkeeping_arg1_pred_values_int(final SubLObject pred, final SubLObject arg2)
  {
    final SubLObject arg2_subindex = bookkeeping_top_level_index_lookup( bookkeeping_binary_gaf_arg2_index(), pred );
    if( NIL == arg2_subindex )
    {
      return NIL;
    }
    final SubLObject arg1_set = bookkeeping_intermediate_index_lookup( arg2_subindex, arg2 );
    if( NIL != arg1_set )
    {
      return set.set_element_list( arg1_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 31005L)
  public static SubLObject bookkeeping_arg1_assertion_count(final SubLObject pred, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const11$BookkeepingMt;
    }
    if( NIL != hlmt.hlmt_equal( mt, $const11$BookkeepingMt ) )
    {
      return bookkeeping_arg1_assertion_count_int( pred, arg2 );
    }
    return kb_indexing.num_predicate_extent_index( pred, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 31335L)
  public static SubLObject bookkeeping_arg1_assertion_count_int(final SubLObject pred, final SubLObject arg2)
  {
    final SubLObject arg2_subindex = bookkeeping_top_level_index_lookup( bookkeeping_binary_gaf_arg2_index(), pred );
    if( NIL == arg2_subindex )
    {
      return NIL;
    }
    final SubLObject arg1_set = bookkeeping_intermediate_index_lookup( arg2_subindex, arg2 );
    if( NIL != arg1_set )
    {
      return set.set_size( arg1_set );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 31680L)
  public static SubLObject reindex_all_bookkeeping_assertions()
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = bookkeeping_predicates_for_hl_store();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, reindex_all_bookkeeping_assertions_for_pred( pred ) );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 31929L)
  public static SubLObject reindex_all_bookkeeping_assertions_for_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1_subindex = bookkeeping_top_level_index_lookup( bookkeeping_binary_gaf_store(), pred );
    SubLObject bookkeeping_pairs = NIL;
    utilities_macros.$progress_note$.setDynamicValue( PrintLow.format( NIL, $str78$Gathering_all__s_assertions, pred ), thread );
    utilities_macros.$progress_total$.setDynamicValue( bookkeeping_intermediate_index_num_keys( arg1_subindex ), thread );
    utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( arg1_subindex ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject arg1 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject arg2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != kb_indexing_datastructures.valid_indexed_termP( arg1 ) && NIL != kb_indexing_datastructures.valid_indexed_termP( arg2 ) )
      {
        bookkeeping_pairs = ConsesLow.cons( ConsesLow.list( arg1, arg2 ), bookkeeping_pairs );
      }
      else
      {
        PrintLow.format( T, $str79$___forgetting___S__S__S___, new SubLObject[] { pred, arg1, arg2
        } );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    unassert_all_bookkeeping_gafs_for_pred( pred );
    final SubLObject list_var = bookkeeping_pairs;
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
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str80$Reindexing_all_, new SubLObject[] { format_nil.format_nil_s_no_copy( pred ), $str81$_assertions
      } ) ) ? Sequences.cconcatenate( $str80$Reindexing_all_, new SubLObject[] { format_nil.format_nil_s_no_copy( pred ), $str81$_assertions
      } ) : $str82$cdolist, thread );
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
        SubLObject pair = NIL;
        pair = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = pair;
          SubLObject arg3 = NIL;
          SubLObject arg4 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
          arg3 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
          arg4 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            hl_assert_bookkeeping_binary_gaf( pred, arg3, arg4, $const11$BookkeepingMt );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          pair = csome_list_var.first();
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
    return Sequences.length( bookkeeping_pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/bookkeeping-store.lisp", position = 32967L)
  public static SubLObject forget_invalid_bookkeeping_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject invalid_bookkeeping_triples = NIL;
    final SubLObject str = $str84$Gathering_invalid_bookkeeping_ass;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
      SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject pred = NIL;
        SubLObject subindex = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
        pred = current.first();
        current = ( subindex = current.rest() );
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( subindex ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject arg1 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject arg2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == kb_indexing_datastructures.valid_indexed_termP( arg1 ) || NIL == kb_indexing_datastructures.valid_indexed_termP( arg2 ) )
          {
            invalid_bookkeeping_triples = ConsesLow.cons( ConsesLow.list( pred, arg1, arg2 ), invalid_bookkeeping_triples );
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
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
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    final SubLObject list_var = invalid_bookkeeping_triples;
    final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str86$Removing_, new SubLObject[] { format_nil.format_nil_s_no_copy( Sequences.length( invalid_bookkeeping_triples ) ),
        $str87$_invalid_bookkeeping_assertions
      } ) ) ? Sequences.cconcatenate( $str86$Removing_, new SubLObject[] { format_nil.format_nil_s_no_copy( Sequences.length( invalid_bookkeeping_triples ) ), $str87$_invalid_bookkeeping_assertions
      } ) : $str82$cdolist, thread );
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
        SubLObject invalid_bookkeeping_triple = NIL;
        invalid_bookkeeping_triple = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject pred2 = invalid_bookkeeping_triple.first();
          final SubLObject arg3 = conses_high.second( invalid_bookkeeping_triple );
          final SubLObject arg4 = conses_high.third( invalid_bookkeeping_triple );
          if( NIL != unassert_bookkeeping_binary_gaf( pred2, arg3, arg4, $const11$BookkeepingMt ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
            if( NIL == utilities_macros.$silent_progressP$.getDynamicValue( thread ) )
            {
              PrintLow.format( T, $str88$__Killed___S__S__S___, new SubLObject[] { pred2, arg3, arg4
              } );
            }
          }
          else
          {
            PrintLow.format( T, $str89$__Could_not_kill___S__S__S___, new SubLObject[] { pred2, arg3, arg4
            } );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          invalid_bookkeeping_triple = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    return count;
  }

  public static SubLObject declare_bookkeeping_store_file()
  {
    SubLFiles.declareFunction( me, "hl_assert_bookkeeping_binary_gaf", "HL-ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false );
    SubLFiles.declareFunction( me, "hl_unassert_bookkeeping_binary_gaf", "HL-UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_predicate_hl_storage_module_applicableP", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_predicate_hl_storage_module_incompleteness", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_predicate_hl_storage_module_assert", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_predicate_hl_storage_module_unassert", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false );
    SubLFiles.declareFunction( me, "my_creator_hl_storage_module_applicableP", "MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "my_creation_time_hl_storage_module_applicableP", "MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "my_creation_purpose_hl_storage_module_applicableP", "MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "my_creation_second_hl_storage_module_applicableP", "MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "my_creation_date_hl_storage_module_applicableP", "MY-CREATION-DATE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "my_creation_date_hl_storage_module_assert", "MY-CREATION-DATE-HL-STORAGE-MODULE-ASSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "my_creation_date_hl_storage_module_unassert", "MY-CREATION-DATE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false );
    SubLFiles.declareMacro( me, "do_bookkeeping_top_level_index", "DO-BOOKKEEPING-TOP-LEVEL-INDEX" );
    SubLFiles.declareFunction( me, "bookkeeping_predicates_for_hl_store", "BOOKKEEPING-PREDICATES-FOR-HL-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "arg2_indexed_bookkeeping_predicates_for_hl_store", "ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "arg2_indexed_bookkeeping_predP", "ARG2-INDEXED-BOOKKEEPING-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_bookkeeping_top_level_index", "NEW-BOOKKEEPING-TOP-LEVEL-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_top_level_index_lookup", "BOOKKEEPING-TOP-LEVEL-INDEX-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_top_level_index_insert", "BOOKKEEPING-TOP-LEVEL-INDEX-INSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_top_level_index_delete", "BOOKKEEPING-TOP-LEVEL-INDEX-DELETE", 5, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_top_level_index_count", "BOOKKEEPING-TOP-LEVEL-INDEX-COUNT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_bookkeeping_intermediate_index", "DO-BOOKKEEPING-INTERMEDIATE-INDEX" );
    SubLFiles.declareFunction( me, "new_bookkeeping_intermediate_index", "NEW-BOOKKEEPING-INTERMEDIATE-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_lookup", "BOOKKEEPING-INTERMEDIATE-INDEX-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_num_keys", "BOOKKEEPING-INTERMEDIATE-INDEX-NUM-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_set", "BOOKKEEPING-INTERMEDIATE-INDEX-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_push", "BOOKKEEPING-INTERMEDIATE-INDEX-PUSH", 3, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_delete_key", "BOOKKEEPING-INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_insert", "BOOKKEEPING-INTERMEDIATE-INDEX-INSERT", 4, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_delete", "BOOKKEEPING-INTERMEDIATE-INDEX-DELETE", 4, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_intermediate_index_count", "BOOKKEEPING-INTERMEDIATE-INDEX-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_bookkeeping_binary_gaf_store", "CLEAR-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "dumper_num_top_level_index", "DUMPER-NUM-TOP-LEVEL-INDEX", 0, 0, false );
    SubLFiles.declareMacro( me, "dumper_do_bookkeeping_top_level_index", "DUMPER-DO-BOOKKEEPING-TOP-LEVEL-INDEX" );
    SubLFiles.declareFunction( me, "dumper_num_intermediate_index", "DUMPER-NUM-INTERMEDIATE-INDEX", 1, 0, false );
    SubLFiles.declareMacro( me, "dumper_do_bookkeeping_intermediate_index", "DUMPER-DO-BOOKKEEPING-INTERMEDIATE-INDEX" );
    SubLFiles.declareFunction( me, "dumper_bookkeeping_binary_gaf_store", "DUMPER-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "dumper_clear_bookkeeping_binary_gaf_store", "DUMPER-CLEAR-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "dumper_load_bookkeeping_binary_gaf", "DUMPER-LOAD-BOOKKEEPING-BINARY-GAF", 3, 0, false );
    SubLFiles.declareFunction( me, "dumper_dumpable_bookkeeping_index", "DUMPER-DUMPABLE-BOOKKEEPING-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "dumper_load_bookkeeping_index", "DUMPER-LOAD-BOOKKEEPING-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_binary_gaf_store", "BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_binary_gaf_arg2_index", "BOOKKEEPING-BINARY-GAF-ARG2-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "assert_bookkeeping_binary_gaf", "ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false );
    SubLFiles.declareFunction( me, "assert_bookkeeping_binary_gaf_int", "ASSERT-BOOKKEEPING-BINARY-GAF-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "add_bookkeeping_binary_gaf_indices", "ADD-BOOKKEEPING-BINARY-GAF-INDICES", 3, 0, false );
    SubLFiles.declareFunction( me, "unassert_bookkeeping_binary_gaf", "UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false );
    SubLFiles.declareFunction( me, "unassert_bookkeeping_binary_gaf_int", "UNASSERT-BOOKKEEPING-BINARY-GAF-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_bookkeeping_binary_gaf_indices", "REMOVE-BOOKKEEPING-BINARY-GAF-INDICES", 3, 0, false );
    SubLFiles.declareFunction( me, "unassert_all_bookkeeping_gafs_on_term", "UNASSERT-ALL-BOOKKEEPING-GAFS-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "unassert_all_bookkeeping_gafs_for_pred", "UNASSERT-ALL-BOOKKEEPING-GAFS-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "creator", "CREATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "creation_time", "CREATION-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "creation_date", "CREATION-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "creation_purpose", "CREATION-PURPOSE", 1, 1, false );
    SubLFiles.declareFunction( me, "creation_second", "CREATION-SECOND", 1, 1, false );
    SubLFiles.declareFunction( me, "created_when", "CREATED-WHEN", 1, 1, false );
    SubLFiles.declareFunction( me, "creation_date_cycl", "CREATION-DATE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "terms_created_by", "TERMS-CREATED-BY", 1, 1, false );
    SubLFiles.declareFunction( me, "terms_created_for", "TERMS-CREATED-FOR", 1, 1, false );
    SubLFiles.declareFunction( me, "num_terms_created_by", "NUM-TERMS-CREATED-BY", 1, 1, false );
    SubLFiles.declareFunction( me, "num_terms_created_for", "NUM-TERMS-CREATED-FOR", 1, 1, false );
    SubLFiles.declareFunction( me, "bookkeeping_asents_on_term", "BOOKKEEPING-ASENTS-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_assertibles_on_term", "BOOKKEEPING-ASSERTIBLES-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_hl_assertion_specs_on_term", "BOOKKEEPING-HL-ASSERTION-SPECS-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_hl_assertibles_on_term", "BOOKKEEPING-HL-ASSERTIBLES-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_asent_to_hl_assertion_spec", "BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_asent_to_hl_assertible", "BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_assertion_count", "BOOKKEEPING-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "num_bookkeeping_binary_gafs_on_term", "NUM-BOOKKEEPING-BINARY-GAFS-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "any_bookkeeping_assertions_on_termP", "ANY-BOOKKEEPING-ASSERTIONS-ON-TERM?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_bookkeeping_assertions", "DO-BOOKKEEPING-ASSERTIONS" );
    SubLFiles.declareMacro( me, "do_bookkeeping_asents", "DO-BOOKKEEPING-ASENTS" );
    SubLFiles.declareFunction( me, "total_num_assertions_on_term", "TOTAL-NUM-ASSERTIONS-ON-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_asent_truth", "BOOKKEEPING-ASENT-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_assertion_truth", "BOOKKEEPING-ASSERTION-TRUTH", 3, 0, false );
    SubLFiles.declareFunction( me, "indexed_terms_mentioned_in_bookkeeping_assertions_of_term", "INDEXED-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "why_not_bookkeeping_asent", "WHY-NOT-BOOKKEEPING-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_fpred_value", "BOOKKEEPING-FPRED-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "bookkeeping_fpred_value_int", "BOOKKEEPING-FPRED-VALUE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_arg1_pred_values", "BOOKKEEPING-ARG1-PRED-VALUES", 2, 1, false );
    SubLFiles.declareFunction( me, "bookkeeping_arg1_pred_values_int", "BOOKKEEPING-ARG1-PRED-VALUES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_arg1_assertion_count", "BOOKKEEPING-ARG1-ASSERTION-COUNT", 2, 1, false );
    SubLFiles.declareFunction( me, "bookkeeping_arg1_assertion_count_int", "BOOKKEEPING-ARG1-ASSERTION-COUNT-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "reindex_all_bookkeeping_assertions", "REINDEX-ALL-BOOKKEEPING-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "reindex_all_bookkeeping_assertions_for_pred", "REINDEX-ALL-BOOKKEEPING-ASSERTIONS-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "forget_invalid_bookkeeping_assertions", "FORGET-INVALID-BOOKKEEPING-ASSERTIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_bookkeeping_store_file()
  {
    $bookkeeping_predicates_for_hl_store$ = SubLFiles.deflexical( "*BOOKKEEPING-PREDICATES-FOR-HL-STORE*", $list37 );
    $arg2_indexed_bookkeeping_predicates_for_hl_store$ = SubLFiles.deflexical( "*ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE*", $list38 );
    $bookkeeping_binary_gaf_store$ = SubLFiles.deflexical( "*BOOKKEEPING-BINARY-GAF-STORE*", maybeDefault( $sym44$_BOOKKEEPING_BINARY_GAF_STORE_, $bookkeeping_binary_gaf_store$, () -> ( new_bookkeeping_top_level_index(
        $bookkeeping_predicates_for_hl_store$.getGlobalValue() ) ) ) );
    $bookkeeping_binary_gaf_arg2_index$ = SubLFiles.deflexical( "*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*", maybeDefault( $sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_, $bookkeeping_binary_gaf_arg2_index$,
        () -> ( new_bookkeeping_top_level_index( $arg2_indexed_bookkeeping_predicates_for_hl_store$.getGlobalValue() ) ) ) );
    return NIL;
  }

  public static SubLObject setup_bookkeeping_store_file()
  {
    utilities_macros.register_cyc_api_function( $sym2$HL_ASSERT_BOOKKEEPING_BINARY_GAF, $list5, $str6$Assert__PRED_ARG1_ARG2__in_MT_to_, $list7, $list8 );
    utilities_macros.register_cyc_api_function( $sym9$HL_UNASSERT_BOOKKEEPING_BINARY_GAF, $list5, $str10$Unassert__PRED_ARG1_ARG2__in_MT_f, $list7, $list8 );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const17$myCreator );
    hl_storage_modules.hl_storage_module( $kw18$MY_CREATOR, $list19 );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const21$myCreationTime );
    hl_storage_modules.hl_storage_module( $kw22$MY_CREATION_TIME, $list23 );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const25$myCreationPurpose );
    hl_storage_modules.hl_storage_module( $kw26$MY_CREATION_PURPOSE, $list27 );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const29$myCreationSecond );
    hl_storage_modules.hl_storage_module( $kw30$MY_CREATION_SECOND, $list31 );
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate( $const33$myCreationDate );
    hl_storage_modules.hl_storage_module( $kw34$MY_CREATION_DATE, $list35 );
    subl_macro_promotions.declare_defglobal( $sym44$_BOOKKEEPING_BINARY_GAF_STORE_ );
    subl_macro_promotions.declare_defglobal( $sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_ );
    utilities_macros.register_cyc_api_function( $sym51$CREATOR, $list52, $str53$Identify_the_cyclist_who_created_, $list54, $list55 );
    utilities_macros.register_cyc_api_function( $sym56$CREATION_TIME, $list52, $str57$Identify_when_FORT_was_created_, $list54, $list58 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_bookkeeping_store_file();
  }

  @Override
  public void initializeVariables()
  {
    init_bookkeeping_store_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_bookkeeping_store_file();
  }
  static
  {
    me = new bookkeeping_store();
    $bookkeeping_predicates_for_hl_store$ = null;
    $arg2_indexed_bookkeeping_predicates_for_hl_store$ = null;
    $bookkeeping_binary_gaf_store$ = null;
    $bookkeeping_binary_gaf_arg2_index$ = null;
    $sym0$FORT_P = makeSymbol( "FORT-P" );
    $sym1$HLMT_P = makeSymbol( "HLMT-P" );
    $sym2$HL_ASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol( "HL-ASSERT-BOOKKEEPING-BINARY-GAF" );
    $sym3$QUOTE = makeSymbol( "QUOTE" );
    $sym4$_EXIT = makeSymbol( "%EXIT" );
    $list5 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "MT" ) );
    $str6$Assert__PRED_ARG1_ARG2__in_MT_to_ = makeString( "Assert (PRED ARG1 ARG2) in MT to the bookkeeping store." );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ) );
    $list8 = ConsesLow.list( makeSymbol( "BOOLEAN" ) );
    $sym9$HL_UNASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol( "HL-UNASSERT-BOOKKEEPING-BINARY-GAF" );
    $str10$Unassert__PRED_ARG1_ARG2__in_MT_f = makeString( "Unassert (PRED ARG1 ARG2) in MT from the bookkeeping store." );
    $const11$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $sym12$ASSERTED_ARGUMENT_SPEC_P = makeSymbol( "ASSERTED-ARGUMENT-SPEC-P" );
    $kw13$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw14$STRENGTH = makeKeyword( "STRENGTH" );
    $kw15$BACKWARD = makeKeyword( "BACKWARD" );
    $kw16$DIRECTION = makeKeyword( "DIRECTION" );
    $const17$myCreator = constant_handles.reader_make_constant_shell( makeString( "myCreator" ) );
    $kw18$MY_CREATOR = makeKeyword( "MY-CREATOR" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRETTY-NAME" ), makeString( "myCreator" ), makeKeyword( "ARGUMENT-TYPE" ), makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "PREDICATE" ), constant_handles
        .reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "APPLICABILITY" ), makeSymbol( "MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?" ), makeKeyword( "INCOMPLETENESS" ), makeSymbol(
            "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS" ), makeKeyword( "ADD" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT" ), makeKeyword( "REMOVE" ), makeSymbol(
                "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" ), makeKeyword( "REMOVE-ALL" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" )
    } );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) );
    $const21$myCreationTime = constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) );
    $kw22$MY_CREATION_TIME = makeKeyword( "MY-CREATION-TIME" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRETTY-NAME" ), makeString( "myCreationTime" ), makeKeyword( "ARGUMENT-TYPE" ), makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "PREDICATE" ),
      constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword( "APPLICABILITY" ), makeSymbol( "MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?" ), makeKeyword( "INCOMPLETENESS" ),
      makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS" ), makeKeyword( "ADD" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT" ), makeKeyword( "REMOVE" ), makeSymbol(
          "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" ), makeKeyword( "REMOVE-ALL" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" )
    } );
    $list24 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "UNIVERSAL-DATE-P" ) ) );
    $const25$myCreationPurpose = constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) );
    $kw26$MY_CREATION_PURPOSE = makeKeyword( "MY-CREATION-PURPOSE" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRETTY-NAME" ), makeString( "myCreationPurpose" ), makeKeyword( "ARGUMENT-TYPE" ), makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "PREDICATE" ),
      constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "APPLICABILITY" ), makeSymbol( "MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?" ), makeKeyword( "INCOMPLETENESS" ),
      makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS" ), makeKeyword( "ADD" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT" ), makeKeyword( "REMOVE" ), makeSymbol(
          "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" ), makeKeyword( "REMOVE-ALL" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" )
    } );
    $list28 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) );
    $const29$myCreationSecond = constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) );
    $kw30$MY_CREATION_SECOND = makeKeyword( "MY-CREATION-SECOND" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRETTY-NAME" ), makeString( "myCreationSecond" ), makeKeyword( "ARGUMENT-TYPE" ), makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "PREDICATE" ),
      constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword( "APPLICABILITY" ), makeSymbol( "MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?" ), makeKeyword( "INCOMPLETENESS" ),
      makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS" ), makeKeyword( "ADD" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT" ), makeKeyword( "REMOVE" ), makeSymbol(
          "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" ), makeKeyword( "REMOVE-ALL" ), makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT" )
    } );
    $list32 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "UNIVERSAL-SECOND-P" ) ) );
    $const33$myCreationDate = constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) );
    $kw34$MY_CREATION_DATE = makeKeyword( "MY-CREATION-DATE" );
    $list35 = ConsesLow.list( new SubLObject[] { makeKeyword( "PRETTY-NAME" ), makeString( "myCreationDate" ), makeKeyword( "ARGUMENT-TYPE" ), makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "PREDICATE" ),
      constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword( "APPLICABILITY" ), makeSymbol( "MY-CREATION-DATE-HL-STORAGE-MODULE-APPLICABLE?" ), makeKeyword( "INCOMPLETENESS" ),
      makeSymbol( "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS" ), makeKeyword( "ADD" ), makeSymbol( "MY-CREATION-DATE-HL-STORAGE-MODULE-ASSERT" ), makeKeyword( "REMOVE" ), makeSymbol(
          "MY-CREATION-DATE-HL-STORAGE-MODULE-UNASSERT" ), makeKeyword( "REMOVE-ALL" ), makeSymbol( "MY-CREATION-DATE-HL-STORAGE-MODULE-UNASSERT" )
    } );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-P" ) ) );
    $list37 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), constant_handles
        .reader_make_constant_shell( makeString( "myCreationTime" ) ), constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ) );
    $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ) );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "SUBINDEX" ), makeSymbol( "TOP-INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym40$DO_ALIST = makeSymbol( "DO-ALIST" );
    $list41 = ConsesLow.cons( makeSymbol( "PRED" ), makeSymbol( "SUBINDEX" ) );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym43$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $sym44$_BOOKKEEPING_BINARY_GAF_STORE_ = makeSymbol( "*BOOKKEEPING-BINARY-GAF-STORE*" );
    $sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_ = makeSymbol( "*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "SUBINDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym47$DO_BOOKKEEPING_TOP_LEVEL_INDEX = makeSymbol( "DO-BOOKKEEPING-TOP-LEVEL-INDEX" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "DUMPER-BOOKKEEPING-BINARY-GAF-STORE" ) ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$DO_BOOKKEEPING_INTERMEDIATE_INDEX = makeSymbol( "DO-BOOKKEEPING-INTERMEDIATE-INDEX" );
    $sym51$CREATOR = makeSymbol( "CREATOR" );
    $list52 = ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) ) ) );
    $str53$Identify_the_cyclist_who_created_ = makeString( "Identify the cyclist who created FORT." );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ) );
    $list55 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $sym56$CREATION_TIME = makeSymbol( "CREATION-TIME" );
    $str57$Identify_when_FORT_was_created_ = makeString( "Identify when FORT was created." );
    $list58 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $int59$1000000 = makeInteger( 1000000 );
    $sym60$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC = makeSymbol( "BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC" );
    $sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE = makeSymbol( "BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym63$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "BOOKKEEPING-BINARY-GAF-STORE" ) ) );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASENT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym66$SUBINDEX = makeUninternedSymbol( "SUBINDEX" );
    $sym67$PRED = makeUninternedSymbol( "PRED" );
    $sym68$ARG1 = makeUninternedSymbol( "ARG1" );
    $sym69$ARG2 = makeUninternedSymbol( "ARG2" );
    $sym70$CLET = makeSymbol( "CLET" );
    $sym71$MAKE_BINARY_FORMULA = makeSymbol( "MAKE-BINARY-FORMULA" );
    $kw72$UNKNOWN = makeKeyword( "UNKNOWN" );
    $const73$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $const74$arg2Format = constant_handles.reader_make_constant_shell( makeString( "arg2Format" ) );
    $list75 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) ) );
    $const76$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $const77$completeExtentEnumerable = constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerable" ) );
    $str78$Gathering_all__s_assertions = makeString( "Gathering all ~s assertions" );
    $str79$___forgetting___S__S__S___ = makeString( "~& forgetting (~S ~S ~S)~%" );
    $str80$Reindexing_all_ = makeString( "Reindexing all " );
    $str81$_assertions = makeString( " assertions" );
    $str82$cdolist = makeString( "cdolist" );
    $list83 = ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $str84$Gathering_invalid_bookkeeping_ass = makeString( "Gathering invalid bookkeeping assertions" );
    $list85 = ConsesLow.cons( makeSymbol( "PRED" ), makeUninternedSymbol( "SUBINDEX" ) );
    $str86$Removing_ = makeString( "Removing " );
    $str87$_invalid_bookkeeping_assertions = makeString( " invalid bookkeeping assertions" );
    $str88$__Killed___S__S__S___ = makeString( "~&Killed (~S ~S ~S)~%" );
    $str89$__Could_not_kill___S__S__S___ = makeString( "~&Could not kill (~S ~S ~S)~%" );
  }
}
/*
 * 
 * Total time: 419 ms
 * 
 */