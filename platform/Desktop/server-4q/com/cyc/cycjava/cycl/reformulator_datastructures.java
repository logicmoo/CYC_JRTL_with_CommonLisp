package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_datastructures";
  public static final String myFingerPrint = "978520eb13c7aa9f31b5c5c9a6af61d706b2306d6e7a8417fd07cdc4953d6760";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 3436L)
  private static SubLSymbol $reformulator_initialization_success_ratio$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 4180L)
  private static SubLSymbol $reformulator_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 7564L)
  private static SubLSymbol $default_reformulator_mode_precedence$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8007L)
  private static SubLSymbol $default_reformulation_directions_in_modes_for_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8227L)
  private static SubLSymbol $default_reformulation_recursion_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8427L)
  private static SubLSymbol $reformulator_irrelevant_forts$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8551L)
  private static SubLSymbol $reformulator_relevant_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8712L)
  private static SubLSymbol $reformulator_rule_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 8861L)
  private static SubLSymbol $reformulator_rule_spec_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9033L)
  private static SubLSymbol $reformulator_print_verbosity_level$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9199L)
  public static SubLSymbol $reformulator_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9415L)
  public static SubLSymbol $reformulator_memoization_state$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 20439L)
  private static SubLSymbol $reformulator_setting_keywords$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
  private static SubLSymbol $all_kb_reformulator_modes_caching_state$;
  private static final SubLFloat $float0$0_9;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$VALID_CONSTANT_;
  private static final SubLString $str3$A_KB_dependent_reformulator_funct;
  private static final SubLSymbol $sym4$REFORMULATOR_RELEVANT_ASSERTION_;
  private static final SubLSymbol $sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_;
  private static final SubLSymbol $sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_;
  private static final SubLInteger $int7$35;
  private static final SubLSymbol $sym8$_REFORMULATOR_IRRELEVANT_FORTS_;
  private static final SubLSymbol $sym9$_REFORMULATOR_RELEVANT_PREDICATES_;
  private static final SubLSymbol $sym10$_REFORMULATOR_RULE_PREDICATES_;
  private static final SubLSymbol $sym11$_REFORMULATOR_RULE_SPEC_PREDS_;
  private static final SubLString $str12$Reformulator_Initialization_Updat;
  private static final SubLSymbol $kw13$UNINITIALIZED;
  private static final SubLSymbol $sym14$WITH_REFORMULATOR_MEMOIZATION_STATE;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$MEMOIZATION_STATE;
  private static final SubLSymbol $sym19$CLET;
  private static final SubLSymbol $sym20$CHECK_TYPE;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$WITH_REFORMULATOR_MEMOIZATION_STATE_INTERNAL;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$_REFORMULATOR_MEMOIZATION_STATE_;
  private static final SubLSymbol $sym25$WITH_MEMOIZATION_STATE;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$FIND_OR_CREATE_REFORMULATOR_MEMOIZATION_STATE;
  private static final SubLSymbol $sym28$WITH_REFORMULATOR_MEMOIZATION;
  private static final SubLSymbol $kw29$REUSED;
  private static final SubLSymbol $kw30$NEW;
  private static final SubLObject $const31$reformulationPrecondition;
  private static final SubLObject $const32$reformulationDirectionInMode;
  private static final SubLObject $const33$defaultReformulationDirectionInMo;
  private static final SubLObject $const34$reformulatorRuleProperties;
  private static final SubLObject $const35$defaultReformulatorModePrecedence;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$CDOHASH;
  private static final SubLSymbol $sym38$KEY;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLString $str42$Found_an_invalid_setting___s___ig;
  private static final SubLSymbol $kw43$REFORMULATE_SUBFORMULAS_;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$RECURSION_LIMIT;
  private static final SubLSymbol $kw46$MODES;
  private static final SubLSymbol $sym47$ALL_KB_REFORMULATOR_MODES;
  private static final SubLObject $const48$ReformulatorMode;
  private static final SubLSymbol $sym49$_ALL_KB_REFORMULATOR_MODES_CACHING_STATE_;
  private static final SubLString $str50$Found_invalid_reformulation_mode_;
  private static final SubLSymbol $kw51$WFF_ENFORCEMENT;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$USE_KB_REFORMULATOR_RULES_;
  private static final SubLSymbol $kw54$REFORMULATOR_RULES;
  private static final SubLString $str55$Found_invalid_reformulator_rule__;
  private static final SubLString $str56$Expected_a_list_of_reformulator_r;
  private static final SubLSymbol $kw57$SKIP_ASSERTIONS;
  private static final SubLSymbol $kw58$SKIP_SENTENCES;
  private static final SubLString $str59$Found_invalid_reformulator_rule_a;
  private static final SubLString $str60$Found_sentence_to_skip__s_which_d;
  private static final SubLSymbol $kw61$META_PREDICATES;
  private static final SubLObject $const62$UnaryPredicate;
  private static final SubLString $str63$Found_a_reformulator_meta_predica;
  private static final SubLSymbol $kw64$PRECONDITION_CHECKING;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$SEARCH_STRATEGY;
  private static final SubLList $list67;
  private static final SubLSymbol $kw68$FOCUS;
  private static final SubLString $str69$Found_invalid_reformulation_focus;
  private static final SubLSymbol $kw70$IGNORE_RL_MODULES;
  private static final SubLString $str71$Found_invalid__ignore_rl_modules_;
  private static final SubLSymbol $kw72$APPLY_FIRST_RECURSIVELY;
  private static final SubLString $str73$Found_invalid__apply_first_recurs;
  private static final SubLSymbol $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_;
  private static final SubLSymbol $kw75$CLEAR_CACHES_;
  private static final SubLSymbol $kw76$REFORMULATE_ATOMS_;
  private static final SubLList $list77;
  private static final SubLSymbol $kw78$MAX_TIME;
  private static final SubLSymbol $kw79$COMPUTE_DEFAULT;
  private static final SubLString $str80$Found_invalid_value__s_for_settin;
  private static final SubLSymbol $kw81$TRUE;
  private static final SubLSymbol $kw82$KB;
  private static final SubLSymbol $kw83$REMOVAL_ONLY_ASK;
  private static final SubLSymbol $kw84$NO_SEARCH;
  private static final SubLSymbol $kw85$FALSE;
  private static final SubLString $str86$Tried_to_get_an_undefined_default;
  private static final SubLSymbol $sym87$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const88$EverythingPSC;
  private static final SubLObject $const89$ReformulatorIrrelevantFORT;
  private static final SubLObject $const90$ReformulatorDirectivePredicate;
  private static final SubLObject $const91$CycLReformulationRulePredicate;
  private static final SubLObject $const92$reformulatorRule;
  private static final SubLSymbol $sym93$GENL_MT_;
  private static final SubLSymbol $sym94$SECOND;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 1910L)
  public static SubLObject ensure_reformulator_initialized()
  {
    if( NIL != reformulator_initializedP() )
    {
      return ZERO_INTEGER;
    }
    return initialize_reformulator();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 2614L)
  public static SubLObject reformulator_initializedP()
  {
    return makeBoolean( NIL != reformulator_rules_initializedP() && NIL != reformulator_variables_initializedP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 2823L)
  public static SubLObject reformulator_rules_initializedP()
  {
    return makeBoolean( NIL != kb_control_vars.reformulator_kb_loaded_p() && NIL != reformulator_rule_unifier_datastructures.reformulator_rules() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 2947L)
  public static SubLObject reformulator_variables_initializedP()
  {
    return makeBoolean( NIL != kb_control_vars.reformulator_kb_loaded_p() && NIL != reformulator_irrelevant_forts() && NIL != default_reformulation_directions_in_modes_for_preds() && NIL != reformulator_rule_predicates()
        && NIL != reformulator_rule_spec_preds() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 3835L)
  public static SubLObject reformulator_fully_initializedP()
  {
    if( NIL != reformulator_initializedP() )
    {
      final SubLObject expected_count = reformulator_rule_unifier_datastructures.expected_reformulator_rule_count();
      final SubLObject actual_count = reformulator_rule_count();
      final SubLObject ratio = Numbers.divide( actual_count, expected_count );
      if( ratio.numGE( $reformulator_initialization_success_ratio$.getGlobalValue() ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 4405L)
  public static SubLObject initialize_reformulator_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym2$VALID_CONSTANT_, $reformulator_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_reformulator_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_reformulator_kb_loaded();
    }
    return kb_control_vars.reformulator_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 4740L)
  public static SubLObject initialize_reformulator()
  {
    if( NIL == kb_control_vars.reformulator_kb_loaded_p() )
    {
      Errors.error( $str3$A_KB_dependent_reformulator_funct );
    }
    clear_reformulator_caches();
    return sync_reformulator_to_kb();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5218L)
  public static SubLObject reformulator_rule_count()
  {
    if( NIL != kb_control_vars.reformulator_kb_loaded_p() )
    {
      return Hashtables.hash_table_count( reformulator_rule_unifier_datastructures.reformulator_rules() );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5563L)
  public static SubLObject unassociated_reformulator_rule_count()
  {
    if( NIL != kb_control_vars.reformulator_kb_loaded_p() )
    {
      return Sequences.length( reformulator_rule_unifier_datastructures.unassociated_reformulator_rules() );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5729L)
  public static SubLObject assertion_in_reformulatorP(final SubLObject assertion)
  {
    if( NIL != kb_control_vars.reformulator_kb_loaded_p() )
    {
      return list_utilities.sublisp_boolean( find_reformulator_rule_for_rule_assertion( assertion ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 5999L)
  public static SubLObject reformulator_relevant_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_pred_listP( assertion, reformulator_relevant_predicates() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 6678L)
  public static SubLObject add_reformulation_assertion(final SubLObject assertion)
  {
    if( NIL != assertions_high.code_assertionP( assertion ) )
    {
      return NIL;
    }
    assert NIL != reformulator_relevant_assertionP( assertion ) : assertion;
    ensure_reformulator_initialized();
    clear_reformulator_caches();
    return add_reformulation_assertion_int( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 7065L)
  public static SubLObject remove_reformulation_assertion(final SubLObject assertion)
  {
    assert NIL != reformulator_relevant_assertionP( assertion ) : assertion;
    ensure_reformulator_initialized();
    clear_reformulator_caches();
    return remove_reformulation_assertion_int( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9596L)
  public static SubLObject with_reformulator_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym14$WITH_REFORMULATOR_MEMOIZATION_STATE, $list15, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 9937L)
  public static SubLObject with_new_reformulator_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym14$WITH_REFORMULATOR_MEMOIZATION_STATE, $list16, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 10177L)
  public static SubLObject with_reformulator_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject memoization_state_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    memoization_state_form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_memoization_state = $sym18$MEMOIZATION_STATE;
      return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( v_memoization_state, memoization_state_form ) ), ConsesLow.listS( $sym20$CHECK_TYPE, v_memoization_state, $list21 ), ConsesLow.listS(
          $sym22$WITH_REFORMULATOR_MEMOIZATION_STATE_INTERNAL, ConsesLow.list( v_memoization_state ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 10612L)
  public static SubLObject with_reformulator_memoization_state_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_memoization_state = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    v_memoization_state = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( $sym24$_REFORMULATOR_MEMOIZATION_STATE_, v_memoization_state ) ), ConsesLow.listS( $sym25$WITH_MEMOIZATION_STATE, $list26, ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 10875L)
  public static SubLObject find_or_create_reformulator_memoization_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != memoization_state.memoization_state_p( $reformulator_memoization_state$.getDynamicValue( thread ) ) ) ? Values.values( $reformulator_memoization_state$.getDynamicValue( thread ), $kw29$REUSED )
        : Values.values( memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $kw30$NEW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 11155L)
  public static SubLObject add_reformulation_assertion_int(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != reformulator_rule_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.add_reformulator_rule_assertion( assertion, $reformulator_lock$.getDynamicValue( thread ) );
    }
    else if( NIL != reformulator_precondition_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.add_reformulator_precondition_assertion( assertion );
    }
    else if( NIL != reformulation_direction_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.add_reformulation_direction_assertion( assertion );
    }
    else if( NIL != default_reformulation_direction_for_pred_assertionP( assertion ) )
    {
      result = add_default_reformulation_direction_for_pred_assertion( assertion );
    }
    else if( NIL != reformulator_rule_property_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.add_reformulator_rule_property_assertion( assertion );
    }
    else if( NIL != default_reformulator_mode_precedence_assertionP( assertion ) )
    {
      result = add_default_reformulator_mode_precedence_assertion( assertion );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 12367L)
  public static SubLObject add_default_reformulation_direction_for_pred_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = default_direction_in_mode_for_pred_assertion_direction_arg( assertion );
    final SubLObject mode = default_direction_in_mode_for_pred_assertion_mode_arg( assertion );
    final SubLObject rule_pred = default_direction_in_mode_for_pred_assertion_rule_pred_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject direction_struct = reformulator_rule_unifier_datastructures.construct_reformulation_direction_struct( direction, mt );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
      $default_reformulation_directions_in_modes_for_preds$.setGlobalValue( add_default_direction_struct_in_mode_for_pred( rule_pred, mode, direction_struct, $default_reformulation_directions_in_modes_for_preds$
          .getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 13182L)
  public static SubLObject add_default_reformulator_mode_precedence_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode_precedence = default_reformulator_mode_precedence_assertion_modes_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject mode_precedence_struct = construct_default_mode_precedence_struct( mode_precedence, mt );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
      $default_reformulator_mode_precedence$.setGlobalValue( add_reformulator_info( mode_precedence_struct, $default_reformulator_mode_precedence$.getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 13760L)
  public static SubLObject remove_reformulation_assertion_int(final SubLObject assertion)
  {
    SubLObject result = NIL;
    if( NIL != reformulator_rule_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.remove_reformulator_rule_assertion( assertion );
    }
    else if( NIL != reformulator_precondition_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.remove_reformulator_precondition_assertion( assertion );
    }
    else if( NIL != reformulation_direction_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.remove_reformulation_direction_assertion( assertion );
    }
    else if( NIL != default_reformulation_direction_for_pred_assertionP( assertion ) )
    {
      result = remove_default_reformulation_direction_for_pred_assertion( assertion );
    }
    else if( NIL != reformulator_rule_property_assertionP( assertion ) )
    {
      result = reformulator_rule_unifier_datastructures.remove_reformulator_rule_property_assertion( assertion );
    }
    else if( NIL != default_reformulator_mode_precedence_assertionP( assertion ) )
    {
      result = remove_default_reformulator_mode_precedence_assertion( assertion );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 14979L)
  public static SubLObject remove_default_reformulation_direction_for_pred_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = default_direction_in_mode_for_pred_assertion_direction_arg( assertion );
    final SubLObject mode = default_direction_in_mode_for_pred_assertion_mode_arg( assertion );
    final SubLObject rule_pred = default_direction_in_mode_for_pred_assertion_rule_pred_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject direction_struct = reformulator_rule_unifier_datastructures.construct_reformulation_direction_struct( direction, mt );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
      $default_reformulation_directions_in_modes_for_preds$.setGlobalValue( remove_default_direction_struct_in_mode_for_pred( rule_pred, mode, direction_struct, $default_reformulation_directions_in_modes_for_preds$
          .getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 15811L)
  public static SubLObject remove_default_reformulator_mode_precedence_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode_precedence = default_reformulator_mode_precedence_assertion_modes_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject mode_precedence_struct = construct_default_mode_precedence_struct( mode_precedence, mt );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
      $default_reformulator_mode_precedence$.setGlobalValue( remove_reformulator_info( mode_precedence_struct, $default_reformulator_mode_precedence$.getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 16407L)
  public static SubLObject reformulator_rule_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_pred_listP( assertion, reformulator_rule_predicates() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 16710L)
  public static SubLObject reformulator_precondition_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_single_predP( assertion, $const31$reformulationPrecondition );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 16871L)
  public static SubLObject reformulation_direction_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_single_predP( assertion, $const32$reformulationDirectionInMode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17033L)
  public static SubLObject default_reformulation_direction_for_pred_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_single_predP( assertion, $const33$defaultReformulationDirectionInMo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17226L)
  public static SubLObject reformulator_rule_property_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_single_predP( assertion, $const34$reformulatorRuleProperties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17389L)
  public static SubLObject default_reformulator_mode_precedence_assertionP(final SubLObject assertion)
  {
    return reformulator_relevant_assertion_single_predP( assertion, $const35$defaultReformulatorModePrecedence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17569L)
  public static SubLObject reformulator_relevant_assertion_pred_listP(final SubLObject assertion, final SubLObject pred_list)
  {
    return assertion_utilities.gaf_assertion_with_any_of_preds_p( assertion, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 17819L)
  public static SubLObject reformulator_relevant_assertion_single_predP(final SubLObject assertion, final SubLObject pred)
  {
    return assertion_utilities.gaf_assertion_with_pred_p( assertion, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 18029L)
  public static SubLObject default_reformulation_recursion_limit()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $default_reformulation_recursion_limit$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 18474L)
  public static SubLObject default_reformulator_mode_precedence(final SubLObject mt)
  {
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var = $default_reformulator_mode_precedence$.getGlobalValue();
      SubLObject mode_precedence_struct = NIL;
      mode_precedence_struct = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        if( NIL != reformulator_mode_precedence_accessible_from_mtP( mode_precedence_struct, mt ) )
        {
          result = mode_precedence_struct_modes( mode_precedence_struct );
        }
        csome_list_var = csome_list_var.rest();
        mode_precedence_struct = csome_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 18911L)
  public static SubLObject reformulator_mode_precedence_accessible_from_mtP(final SubLObject mode_precedence_struct, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      result = mt_relevance_macros.relevant_mtP( mode_precedence_struct_mt( mode_precedence_struct ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19152L)
  public static SubLObject default_reformulation_directions_in_modes_for_preds()
  {
    return $default_reformulation_directions_in_modes_for_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19290L)
  public static SubLObject reformulator_irrelevant_forts()
  {
    return $reformulator_irrelevant_forts$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19386L)
  public static SubLObject reformulator_relevant_predicates()
  {
    return $reformulator_relevant_predicates$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19486L)
  public static SubLObject reformulator_rule_predicates()
  {
    return $reformulator_rule_predicates$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19578L)
  public static SubLObject reformulator_rule_spec_preds()
  {
    return $reformulator_rule_spec_preds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19670L)
  public static SubLObject reformulator_print_verbosity_level()
  {
    return $reformulator_print_verbosity_level$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 19774L)
  public static SubLObject do_reformulator_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rr = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    rr = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym37$CDOHASH, ConsesLow.listS( $sym38$KEY, rr, $list39 ), $list40, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 20139L)
  public static SubLObject find_reformulator_rule_for_rule_assertion(final SubLObject assertion)
  {
    if( NIL != reformulator_initializedP() )
    {
      return Hashtables.gethash( assertion, reformulator_rule_unifier_datastructures.reformulator_rules(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 21098L)
  public static SubLObject valid_reformulator_setting_keyword_p(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.member( keyword, $reformulator_setting_keywords$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 21343L)
  public static SubLObject fix_invalid_settings(final SubLObject settings, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fixed_settings = conses_high.copy_list( settings );
    SubLObject list_var = NIL;
    SubLObject element = NIL;
    SubLObject index = NIL;
    list_var = settings;
    element = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), element = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      if( NIL != Numbers.evenp( index ) && NIL == subl_promotions.memberP( element, $reformulator_setting_keywords$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
      {
        reformulator_hub.ref_warn( ZERO_INTEGER, $str42$Found_an_invalid_setting___s___ig, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        fixed_settings = conses_high.remf( fixed_settings, element );
      }
    }
    fixed_settings = fix_reformulate_subformulasP( fixed_settings );
    fixed_settings = fix_recursion_limit( fixed_settings );
    fixed_settings = fix_reformulator_modes( fixed_settings, mt );
    fixed_settings = fix_wff_enforcement( fixed_settings );
    fixed_settings = fix_use_kb_reformulator_rulesP( fixed_settings );
    fixed_settings = fix_reformulator_rules( fixed_settings );
    fixed_settings = fix_skip_assertions( fixed_settings, mt );
    fixed_settings = fix_reformulator_meta_predicates( fixed_settings, mt );
    fixed_settings = fix_precondition_checking( fixed_settings );
    fixed_settings = fix_search_strategy( fixed_settings );
    fixed_settings = fix_reformulation_focus( fixed_settings );
    fixed_settings = fix_ignore_rl_modules( fixed_settings );
    fixed_settings = fix_apply_first_recursively( fixed_settings );
    fixed_settings = fix_eliminate_transitivity_in_reformulation_historyP( fixed_settings );
    fixed_settings = fix_clear_reformulator_cachesP( fixed_settings );
    fixed_settings = fix_reformulate_atomsP( fixed_settings );
    return fixed_settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 22956L)
  public static SubLObject get_reformulate_subformulasP(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw43$REFORMULATE_SUBFORMULAS_, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23175L)
  public static SubLObject fix_reformulate_subformulasP(SubLObject settings)
  {
    final SubLObject result = get_reformulate_subformulasP( settings );
    if( NIL == subl_promotions.memberP( result, $list44, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw43$REFORMULATE_SUBFORMULAS_, result );
      settings = conses_high.remf( settings, $kw43$REFORMULATE_SUBFORMULAS_ );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23493L)
  public static SubLObject get_recursion_limit(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw45$RECURSION_LIMIT, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23630L)
  public static SubLObject fix_recursion_limit(SubLObject settings)
  {
    final SubLObject result = get_recursion_limit( settings );
    if( !result.isInteger() && !result.numGE( ZERO_INTEGER ) )
    {
      invalid_setting_value_warning( $kw45$RECURSION_LIMIT, result );
      settings = conses_high.remf( settings, $kw45$RECURSION_LIMIT );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 23921L)
  public static SubLObject get_reformulator_modes(final SubLObject settings, final SubLObject mt)
  {
    return get_reformulator_setting_for( $kw46$MODES, settings, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
  public static SubLObject clear_all_kb_reformulator_modes()
  {
    final SubLObject cs = $all_kb_reformulator_modes_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
  public static SubLObject remove_all_kb_reformulator_modes()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $all_kb_reformulator_modes_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
  public static SubLObject all_kb_reformulator_modes_internal()
  {
    return isa.all_fort_instances_in_all_mts( $const48$ReformulatorMode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24047L)
  public static SubLObject all_kb_reformulator_modes()
  {
    SubLObject caching_state = $all_kb_reformulator_modes_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym47$ALL_KB_REFORMULATOR_MODES, $sym49$_ALL_KB_REFORMULATOR_MODES_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( all_kb_reformulator_modes_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24171L)
  public static SubLObject fix_reformulator_modes(SubLObject settings, final SubLObject mt)
  {
    final SubLObject temp_result = get_reformulator_modes( settings, mt );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = temp_result;
    SubLObject mode = NIL;
    mode = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( mode, all_kb_reformulator_modes(), UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( mode, result );
      }
      else
      {
        reformulator_hub.ref_warn( ZERO_INTEGER, $str50$Found_invalid_reformulation_mode_, mode, temp_result, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mode = cdolist_list_var.first();
    }
    if( NIL != result )
    {
      settings = conses_high.putf( settings, $kw46$MODES, Sequences.nreverse( result ) );
    }
    else
    {
      settings = conses_high.remf( settings, $kw46$MODES );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24704L)
  public static SubLObject reformulator_primary_mode(final SubLObject modes)
  {
    return modes.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24780L)
  public static SubLObject reformulator_secondary_mode(final SubLObject modes)
  {
    return conses_high.second( modes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24859L)
  public static SubLObject reformulator_tertiary_mode(final SubLObject modes)
  {
    return conses_high.third( modes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 24936L)
  public static SubLObject get_wff_enforcement(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw51$WFF_ENFORCEMENT, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25077L)
  public static SubLObject fix_wff_enforcement(SubLObject settings)
  {
    final SubLObject result = get_wff_enforcement( settings );
    if( NIL == subl_promotions.memberP( result, $list52, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw51$WFF_ENFORCEMENT, result );
      settings = conses_high.remf( settings, $kw51$WFF_ENFORCEMENT );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25370L)
  public static SubLObject get_use_kb_reformulator_rulesP(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw53$USE_KB_REFORMULATOR_RULES_, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25540L)
  public static SubLObject fix_use_kb_reformulator_rulesP(SubLObject settings)
  {
    final SubLObject result = get_use_kb_reformulator_rulesP( settings );
    if( NIL == subl_promotions.memberP( result, $list44, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw53$USE_KB_REFORMULATOR_RULES_, result );
      settings = conses_high.remf( settings, $kw53$USE_KB_REFORMULATOR_RULES_ );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 25868L)
  public static SubLObject get_reformulator_rules(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw54$REFORMULATOR_RULES, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26014L)
  public static SubLObject fix_reformulator_rules(SubLObject settings)
  {
    final SubLObject explicit_reformulator_rules = get_reformulator_rules( settings );
    if( NIL != explicit_reformulator_rules )
    {
      final SubLObject fixed_rules = check_explicit_reformulator_rules( explicit_reformulator_rules );
      settings = conses_high.putf( settings, $kw54$REFORMULATOR_RULES, fixed_rules );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26357L)
  public static SubLObject check_explicit_reformulator_rules(final SubLObject reformulator_rules)
  {
    if( reformulator_rules.isList() )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = reformulator_rules;
      SubLObject rr = NIL;
      rr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p( rr ) )
        {
          result = ConsesLow.cons( rr, result );
        }
        else
        {
          reformulator_hub.ref_warn( ZERO_INTEGER, $str55$Found_invalid_reformulator_rule__, rr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        rr = cdolist_list_var.first();
      }
      return Sequences.nreverse( result );
    }
    reformulator_hub.ref_warn( ZERO_INTEGER, $str56$Expected_a_list_of_reformulator_r, reformulator_rules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26817L)
  public static SubLObject get_reformulator_rule_skip_assertions(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw57$SKIP_ASSERTIONS, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 26972L)
  public static SubLObject fix_skip_assertions(SubLObject settings, final SubLObject mt)
  {
    SubLObject skip_assertions = get_reformulator_rule_skip_assertions( settings );
    final SubLObject skip_sentences = get_reformulator_setting_for( $kw58$SKIP_SENTENCES, settings, UNPROVIDED, UNPROVIDED );
    if( NIL != skip_sentences )
    {
      skip_assertions = ConsesLow.append( skip_assertions, find_assertions_for_sentences_to_be_skipped( skip_sentences, mt ) );
    }
    if( NIL != skip_assertions )
    {
      skip_assertions = check_skip_assertions( skip_assertions );
      settings = conses_high.putf( settings, $kw57$SKIP_ASSERTIONS, skip_assertions );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 27575L)
  public static SubLObject check_skip_assertions(final SubLObject assertions)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != reformulator_rule_assertionP( assertion ) )
      {
        result = ConsesLow.cons( assertion, result );
      }
      else
      {
        reformulator_hub.ref_warn( ZERO_INTEGER, $str59$Found_invalid_reformulator_rule_a, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 27933L)
  public static SubLObject find_assertions_for_sentences_to_be_skipped(final SubLObject sentences, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assertion = czer_meta.find_visible_assertion_cycl( sentence, mt );
      if( NIL != assertion )
      {
        result = ConsesLow.cons( assertion, result );
      }
      else
      {
        reformulator_hub.ref_warn( ZERO_INTEGER, $str60$Found_sentence_to_skip__s_which_d, sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 28341L)
  public static SubLObject get_reformulator_meta_predicates(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw61$META_PREDICATES, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 28491L)
  public static SubLObject fix_reformulator_meta_predicates(SubLObject settings, final SubLObject mt)
  {
    final SubLObject meta_predicates = get_reformulator_meta_predicates( settings );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = meta_predicates;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isaP( pred, $const62$UnaryPredicate, mt, UNPROVIDED ) )
      {
        result = ConsesLow.cons( pred, result );
      }
      else
      {
        reformulator_hub.ref_warn( ZERO_INTEGER, $str63$Found_a_reformulator_meta_predica, pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    if( NIL != result )
    {
      settings = conses_high.putf( settings, $kw61$META_PREDICATES, Sequences.nreverse( result ) );
    }
    else
    {
      settings = conses_high.remf( settings, $kw61$META_PREDICATES );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29028L)
  public static SubLObject get_precondition_checking(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw64$PRECONDITION_CHECKING, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29183L)
  public static SubLObject fix_precondition_checking(SubLObject settings)
  {
    final SubLObject result = get_precondition_checking( settings );
    if( NIL == subl_promotions.memberP( result, $list65, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw64$PRECONDITION_CHECKING, result );
      settings = conses_high.remf( settings, $kw64$PRECONDITION_CHECKING );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29530L)
  public static SubLObject get_search_strategy(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw66$SEARCH_STRATEGY, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29667L)
  public static SubLObject fix_search_strategy(SubLObject settings)
  {
    final SubLObject result = get_search_strategy( settings );
    if( NIL == subl_promotions.memberP( result, $list67, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw66$SEARCH_STRATEGY, result );
      settings = conses_high.remf( settings, $kw66$SEARCH_STRATEGY );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 29983L)
  public static SubLObject get_reformulation_focus(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw68$FOCUS, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 30104L)
  public static SubLObject fix_reformulation_focus(SubLObject settings)
  {
    final SubLObject result = get_reformulation_focus( settings );
    if( NIL != result && NIL == subl_promotions.memberP( result, reformulator_module_harness.rl_module_names(), UNPROVIDED, UNPROVIDED ) )
    {
      reformulator_hub.ref_warn( ZERO_INTEGER, $str69$Found_invalid_reformulation_focus, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      settings = conses_high.remf( settings, $kw68$FOCUS );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 30425L)
  public static SubLObject get_ignore_rl_modules(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw70$IGNORE_RL_MODULES, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 30568L)
  public static SubLObject fix_ignore_rl_modules(SubLObject settings)
  {
    final SubLObject result = get_ignore_rl_modules( settings );
    SubLObject errorP = NIL;
    if( result.isList() )
    {
      if( NIL == errorP )
      {
        SubLObject csome_list_var = result;
        SubLObject rl_module_name = NIL;
        rl_module_name = csome_list_var.first();
        while ( NIL == errorP && NIL != csome_list_var)
        {
          if( NIL == subl_promotions.memberP( rl_module_name, reformulator_module_harness.rl_module_names(), UNPROVIDED, UNPROVIDED ) )
          {
            errorP = T;
          }
          csome_list_var = csome_list_var.rest();
          rl_module_name = csome_list_var.first();
        }
      }
    }
    else
    {
      errorP = T;
    }
    if( NIL != errorP )
    {
      reformulator_hub.ref_warn( ZERO_INTEGER, $str71$Found_invalid__ignore_rl_modules_, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      settings = conses_high.remf( settings, $kw70$IGNORE_RL_MODULES );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31032L)
  public static SubLObject get_apply_first_recursively(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw72$APPLY_FIRST_RECURSIVELY, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31193L)
  public static SubLObject fix_apply_first_recursively(SubLObject settings)
  {
    final SubLObject result = get_apply_first_recursively( settings );
    SubLObject errorP = NIL;
    if( result.isList() )
    {
      if( NIL == errorP )
      {
        SubLObject csome_list_var = result;
        SubLObject rl_module_name = NIL;
        rl_module_name = csome_list_var.first();
        while ( NIL == errorP && NIL != csome_list_var)
        {
          if( NIL == subl_promotions.memberP( rl_module_name, reformulator_module_harness.rl_module_names(), UNPROVIDED, UNPROVIDED ) )
          {
            errorP = T;
          }
          csome_list_var = csome_list_var.rest();
          rl_module_name = csome_list_var.first();
        }
      }
    }
    else
    {
      errorP = T;
    }
    if( NIL != errorP )
    {
      reformulator_hub.ref_warn( ZERO_INTEGER, $str73$Found_invalid__apply_first_recurs, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      settings = conses_high.remf( settings, $kw72$APPLY_FIRST_RECURSIVELY );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31681L)
  public static SubLObject get_eliminate_transitivity_in_reformulation_historyP(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 31917L)
  public static SubLObject fix_eliminate_transitivity_in_reformulation_historyP(SubLObject settings)
  {
    final SubLObject result = get_eliminate_transitivity_in_reformulation_historyP( settings );
    if( NIL == subl_promotions.memberP( result, $list44, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_, result );
      settings = conses_high.remf( settings, $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_ );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32331L)
  public static SubLObject get_clear_reformulator_cachesP(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw75$CLEAR_CACHES_, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32488L)
  public static SubLObject fix_clear_reformulator_cachesP(SubLObject settings)
  {
    final SubLObject result = get_clear_reformulator_cachesP( settings );
    if( NIL == subl_promotions.memberP( result, $list44, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw75$CLEAR_CACHES_, result );
      settings = conses_high.remf( settings, $kw75$CLEAR_CACHES_ );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32788L)
  public static SubLObject get_reformulate_atomsP(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw76$REFORMULATE_ATOMS_, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 32934L)
  public static SubLObject fix_reformulate_atomsP(SubLObject settings)
  {
    final SubLObject result = get_reformulator_setting_for( $kw76$REFORMULATE_ATOMS_, settings, UNPROVIDED, UNPROVIDED );
    if( NIL == subl_promotions.memberP( result, $list77, UNPROVIDED, UNPROVIDED ) )
    {
      invalid_setting_value_warning( $kw76$REFORMULATE_ATOMS_, result );
      settings = conses_high.remf( settings, $kw76$REFORMULATE_ATOMS_ );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33273L)
  public static SubLObject get_max_time(final SubLObject settings)
  {
    return get_reformulator_setting_for( $kw78$MAX_TIME, settings, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33390L)
  public static SubLObject fix_max_time(SubLObject settings)
  {
    final SubLObject result = get_max_time( settings );
    if( NIL != result && ( !result.isInteger() || !result.numGE( ZERO_INTEGER ) ) )
    {
      invalid_setting_value_warning( $kw78$MAX_TIME, result );
      settings = conses_high.remf( settings, $kw78$MAX_TIME );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33691L)
  public static SubLObject get_reformulator_setting_for(final SubLObject indicator, final SubLObject settings, SubLObject mt, SubLObject v_default)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_default == UNPROVIDED )
    {
      v_default = $kw79$COMPUTE_DEFAULT;
    }
    return conses_high.getf( settings, indicator, v_default.eql( $kw79$COMPUTE_DEFAULT ) ? reformulator_default_for_setting( indicator, mt ) : v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 33980L)
  public static SubLObject invalid_setting_value_warning(final SubLObject setting, final SubLObject value)
  {
    reformulator_hub.ref_warn( ZERO_INTEGER, $str80$Found_invalid_value__s_for_settin, value, setting, reformulator_default_for_setting( setting, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 34208L)
  public static SubLObject reformulator_default_for_setting(final SubLObject indicator, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( indicator.eql( $kw45$RECURSION_LIMIT ) )
    {
      return default_reformulation_recursion_limit();
    }
    if( indicator.eql( $kw43$REFORMULATE_SUBFORMULAS_ ) )
    {
      return $kw81$TRUE;
    }
    if( indicator.eql( $kw46$MODES ) )
    {
      return default_reformulator_mode_precedence( mt );
    }
    if( indicator.eql( $kw51$WFF_ENFORCEMENT ) )
    {
      return $kw82$KB;
    }
    if( indicator.eql( $kw53$USE_KB_REFORMULATOR_RULES_ ) )
    {
      return $kw81$TRUE;
    }
    if( indicator.eql( $kw54$REFORMULATOR_RULES ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw57$SKIP_ASSERTIONS ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw58$SKIP_SENTENCES ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw61$META_PREDICATES ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw64$PRECONDITION_CHECKING ) )
    {
      return $kw83$REMOVAL_ONLY_ASK;
    }
    if( indicator.eql( $kw66$SEARCH_STRATEGY ) )
    {
      return $kw84$NO_SEARCH;
    }
    if( indicator.eql( $kw68$FOCUS ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw70$IGNORE_RL_MODULES ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw72$APPLY_FIRST_RECURSIVELY ) )
    {
      return NIL;
    }
    if( indicator.eql( $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_ ) )
    {
      return $kw85$FALSE;
    }
    if( indicator.eql( $kw75$CLEAR_CACHES_ ) )
    {
      return $kw85$FALSE;
    }
    if( indicator.eql( $kw76$REFORMULATE_ATOMS_ ) )
    {
      return $kw81$TRUE;
    }
    if( indicator.eql( $kw78$MAX_TIME ) )
    {
      return NIL;
    }
    reformulator_hub.ref_warn( TWO_INTEGER, $str86$Tried_to_get_an_undefined_default, indicator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 35160L)
  public static SubLObject sync_reformulator_to_kb()
  {
    initialize_reformulator_variables();
    return reformulator_rule_unifier_datastructures.initialize_reformulator_rules();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 36053L)
  public static SubLObject clear_reformulator_caches()
  {
    clear_all_kb_reformulator_modes();
    reformulator_hub.clear_all_kb_modal_operators();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 36182L)
  public static SubLObject initialize_reformulator_variables()
  {
    initialize_reformulator_irrelevant_forts();
    initialize_reformulator_relevant_predicates();
    initialize_reformulator_rule_predicates();
    initialize_reformulator_rule_spec_preds();
    gather_default_reformulator_mode_precedence_from_kb();
    gather_default_reformulation_directions_in_modes_for_preds_from_kb();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 36870L)
  public static SubLObject initialize_reformulator_irrelevant_forts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
        $reformulator_irrelevant_forts$.setGlobalValue( isa.all_fort_instances( $const89$ReformulatorIrrelevantFORT, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37199L)
  public static SubLObject initialize_reformulator_relevant_predicates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
        $reformulator_relevant_predicates$.setGlobalValue( isa.all_fort_instances( $const90$ReformulatorDirectivePredicate, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37535L)
  public static SubLObject initialize_reformulator_rule_predicates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
        $reformulator_rule_predicates$.setGlobalValue( isa.all_fort_instances( $const91$CycLReformulationRulePredicate, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37767L)
  public static SubLObject initialize_reformulator_rule_spec_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
        $reformulator_rule_spec_preds$.setGlobalValue( genl_predicates.all_spec_preds( $const92$reformulatorRule, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 37983L)
  public static SubLObject gather_default_reformulator_mode_precedence_from_kb()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $default_reformulator_mode_precedence$.setGlobalValue( NIL );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
      SubLObject cdolist_list_var;
      final SubLObject all_mode_precedence_assertions = cdolist_list_var = kb_mapping.gather_predicate_extent_index( $const35$defaultReformulatorModePrecedence, UNPROVIDED, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL == assertions_high.code_assertionP( assertion ) )
        {
          final SubLObject mode_precedence = default_reformulator_mode_precedence_assertion_modes_arg( assertion );
          final SubLObject mt = assertions_high.assertion_mt( assertion );
          final SubLObject mode_precedence_struct = construct_default_mode_precedence_struct( mode_precedence, mt );
          SubLObject release = NIL;
          try
          {
            release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
            $default_reformulator_mode_precedence$.setGlobalValue( add_reformulator_info( mode_precedence_struct, $default_reformulator_mode_precedence$.getGlobalValue() ) );
          }
          finally
          {
            if( NIL != release )
            {
              Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 38960L)
  public static SubLObject construct_default_mode_precedence_struct(final SubLObject mode_precedence, final SubLObject mt)
  {
    return ConsesLow.list( mode_precedence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39074L)
  public static SubLObject default_reformulator_mode_precedence_assertion_modes_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_args( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39190L)
  public static SubLObject mode_precedence_struct_modes(final SubLObject mode_precedence_struct)
  {
    return mode_precedence_struct.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39301L)
  public static SubLObject mode_precedence_struct_mt(final SubLObject mode_precedence_struct)
  {
    return conses_high.second( mode_precedence_struct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 39410L)
  public static SubLObject gather_default_reformulation_directions_in_modes_for_preds_from_kb()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $default_reformulation_directions_in_modes_for_preds$.setGlobalValue( NIL );
    SubLObject cdolist_list_var = reformulator_rule_predicates();
    SubLObject rule_pred = NIL;
    rule_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
        final SubLObject all_default_direction_assertions = kb_mapping.gather_gaf_arg_index( rule_pred, THREE_INTEGER, $const33$defaultReformulationDirectionInMo, UNPROVIDED, UNPROVIDED );
        SubLObject default_directions_for_pred = NIL;
        SubLObject cdolist_list_var_$1 = all_default_direction_assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL == assertions_high.code_assertionP( assertion ) )
          {
            final SubLObject direction = default_direction_in_mode_for_pred_assertion_direction_arg( assertion );
            final SubLObject mode = default_direction_in_mode_for_pred_assertion_mode_arg( assertion );
            final SubLObject mt = assertions_high.assertion_mt( assertion );
            final SubLObject direction_struct = reformulator_rule_unifier_datastructures.construct_reformulation_direction_struct( direction, mt );
            default_directions_for_pred = reformulator_rule_unifier_datastructures.add_direction_struct_for_mode( mode, direction_struct, default_directions_for_pred );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          assertion = cdolist_list_var_$1.first();
        }
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( $reformulator_lock$.getDynamicValue( thread ) );
          $default_reformulation_directions_in_modes_for_preds$.setGlobalValue( conses_high.putf( $default_reformulation_directions_in_modes_for_preds$.getGlobalValue(), rule_pred, default_directions_for_pred ) );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( $reformulator_lock$.getDynamicValue( thread ) );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule_pred = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 40780L)
  public static SubLObject default_direction_in_mode_for_pred_assertion_direction_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg1( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 40899L)
  public static SubLObject default_direction_in_mode_for_pred_assertion_mode_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg2( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 41012L)
  public static SubLObject default_direction_in_mode_for_pred_assertion_rule_pred_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg3( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 41130L)
  public static SubLObject add_default_direction_struct_in_mode_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list)
  {
    SubLObject current_mode_directions_for_pred = mode_directions_for_pred( pred, mode, current_direction_list );
    current_mode_directions_for_pred = add_reformulator_info( direction_struct, current_mode_directions_for_pred );
    current_direction_list = substitute_mode_directions_for_pred( pred, mode, current_mode_directions_for_pred, current_direction_list );
    return current_direction_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 41767L)
  public static SubLObject remove_default_direction_struct_in_mode_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list)
  {
    SubLObject current_mode_directions_for_pred = mode_directions_for_pred( pred, mode, current_direction_list );
    if( NIL != current_mode_directions_for_pred )
    {
      current_mode_directions_for_pred = remove_reformulator_info( direction_struct, current_mode_directions_for_pred );
      current_direction_list = substitute_mode_directions_for_pred( pred, mode, current_mode_directions_for_pred, current_direction_list );
    }
    return current_direction_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 42461L)
  public static SubLObject substitute_mode_directions_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject new_mode_directions_for_pred, final SubLObject direction_list)
  {
    SubLObject current_directions_for_pred = directions_for_pred( pred, direction_list );
    current_directions_for_pred = reformulator_rule_unifier_datastructures.substitute_directions_for_mode( mode, new_mode_directions_for_pred, current_directions_for_pred );
    return conses_high.putf( conses_high.remf( direction_list, pred ), pred, current_directions_for_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 42978L)
  public static SubLObject mode_directions_for_pred(final SubLObject pred, final SubLObject mode, final SubLObject directions)
  {
    return reformulator_rule_unifier_datastructures.directions_for_mode( mode, directions_for_pred( pred, directions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 43120L)
  public static SubLObject directions_for_pred(final SubLObject pred, final SubLObject directions)
  {
    return conses_high.getf( directions, pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 43208L)
  public static SubLObject add_reformulator_info(final SubLObject ref_struct, final SubLObject struct_list)
  {
    return list_utilities.sort_adjoin( ref_struct, struct_list, Symbols.symbol_function( EQL ), $sym93$GENL_MT_, Symbols.symbol_function( $sym94$SECOND ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-datastructures.lisp", position = 43380L)
  public static SubLObject remove_reformulator_info(final SubLObject ref_struct, final SubLObject struct_list)
  {
    return Sequences.delete( ref_struct, struct_list, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_reformulator_datastructures_file()
  {
    SubLFiles.declareFunction( me, "ensure_reformulator_initialized", "ENSURE-REFORMULATOR-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_initializedP", "REFORMULATOR-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rules_initializedP", "REFORMULATOR-RULES-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_variables_initializedP", "REFORMULATOR-VARIABLES-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_fully_initializedP", "REFORMULATOR-FULLY-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_kb_feature", "INITIALIZE-REFORMULATOR-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator", "INITIALIZE-REFORMULATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_count", "REFORMULATOR-RULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "unassociated_reformulator_rule_count", "UNASSOCIATED-REFORMULATOR-RULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "assertion_in_reformulatorP", "ASSERTION-IN-REFORMULATOR?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_relevant_assertionP", "REFORMULATOR-RELEVANT-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "add_reformulation_assertion", "ADD-REFORMULATION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulation_assertion", "REMOVE-REFORMULATION-ASSERTION", 1, 0, false );
    SubLFiles.declareMacro( me, "with_reformulator_memoization", "WITH-REFORMULATOR-MEMOIZATION" );
    SubLFiles.declareMacro( me, "with_new_reformulator_memoization_state", "WITH-NEW-REFORMULATOR-MEMOIZATION-STATE" );
    SubLFiles.declareMacro( me, "with_reformulator_memoization_state", "WITH-REFORMULATOR-MEMOIZATION-STATE" );
    SubLFiles.declareMacro( me, "with_reformulator_memoization_state_internal", "WITH-REFORMULATOR-MEMOIZATION-STATE-INTERNAL" );
    SubLFiles.declareFunction( me, "find_or_create_reformulator_memoization_state", "FIND-OR-CREATE-REFORMULATOR-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "add_reformulation_assertion_int", "ADD-REFORMULATION-ASSERTION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "add_default_reformulation_direction_for_pred_assertion", "ADD-DEFAULT-REFORMULATION-DIRECTION-FOR-PRED-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_default_reformulator_mode_precedence_assertion", "ADD-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulation_assertion_int", "REMOVE-REFORMULATION-ASSERTION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_default_reformulation_direction_for_pred_assertion", "REMOVE-DEFAULT-REFORMULATION-DIRECTION-FOR-PRED-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_default_reformulator_mode_precedence_assertion", "REMOVE-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_assertionP", "REFORMULATOR-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_precondition_assertionP", "REFORMULATOR-PRECONDITION-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulation_direction_assertionP", "REFORMULATION-DIRECTION-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "default_reformulation_direction_for_pred_assertionP", "DEFAULT-REFORMULATION-DIRECTION-FOR-PRED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_property_assertionP", "REFORMULATOR-RULE-PROPERTY-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "default_reformulator_mode_precedence_assertionP", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_relevant_assertion_pred_listP", "REFORMULATOR-RELEVANT-ASSERTION-PRED-LIST?", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_relevant_assertion_single_predP", "REFORMULATOR-RELEVANT-ASSERTION-SINGLE-PRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "default_reformulation_recursion_limit", "DEFAULT-REFORMULATION-RECURSION-LIMIT", 0, 0, false );
    SubLFiles.declareFunction( me, "default_reformulator_mode_precedence", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_mode_precedence_accessible_from_mtP", "REFORMULATOR-MODE-PRECEDENCE-ACCESSIBLE-FROM-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "default_reformulation_directions_in_modes_for_preds", "DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_irrelevant_forts", "REFORMULATOR-IRRELEVANT-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_relevant_predicates", "REFORMULATOR-RELEVANT-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_predicates", "REFORMULATOR-RULE-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_spec_preds", "REFORMULATOR-RULE-SPEC-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_print_verbosity_level", "REFORMULATOR-PRINT-VERBOSITY-LEVEL", 0, 0, false );
    SubLFiles.declareMacro( me, "do_reformulator_rules", "DO-REFORMULATOR-RULES" );
    SubLFiles.declareFunction( me, "find_reformulator_rule_for_rule_assertion", "FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_reformulator_setting_keyword_p", "VALID-REFORMULATOR-SETTING-KEYWORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_invalid_settings", "FIX-INVALID-SETTINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_reformulate_subformulasP", "GET-REFORMULATE-SUBFORMULAS?", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_reformulate_subformulasP", "FIX-REFORMULATE-SUBFORMULAS?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_recursion_limit", "GET-RECURSION-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_recursion_limit", "FIX-RECURSION-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reformulator_modes", "GET-REFORMULATOR-MODES", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_all_kb_reformulator_modes", "CLEAR-ALL-KB-REFORMULATOR-MODES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_all_kb_reformulator_modes", "REMOVE-ALL-KB-REFORMULATOR-MODES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_kb_reformulator_modes_internal", "ALL-KB-REFORMULATOR-MODES-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "all_kb_reformulator_modes", "ALL-KB-REFORMULATOR-MODES", 0, 0, false );
    SubLFiles.declareFunction( me, "fix_reformulator_modes", "FIX-REFORMULATOR-MODES", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_primary_mode", "REFORMULATOR-PRIMARY-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_secondary_mode", "REFORMULATOR-SECONDARY-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_tertiary_mode", "REFORMULATOR-TERTIARY-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_wff_enforcement", "GET-WFF-ENFORCEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_wff_enforcement", "FIX-WFF-ENFORCEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_use_kb_reformulator_rulesP", "GET-USE-KB-REFORMULATOR-RULES?", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_use_kb_reformulator_rulesP", "FIX-USE-KB-REFORMULATOR-RULES?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reformulator_rules", "GET-REFORMULATOR-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_reformulator_rules", "FIX-REFORMULATOR-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "check_explicit_reformulator_rules", "CHECK-EXPLICIT-REFORMULATOR-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reformulator_rule_skip_assertions", "GET-REFORMULATOR-RULE-SKIP-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_skip_assertions", "FIX-SKIP-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "check_skip_assertions", "CHECK-SKIP-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_for_sentences_to_be_skipped", "FIND-ASSERTIONS-FOR-SENTENCES-TO-BE-SKIPPED", 2, 0, false );
    SubLFiles.declareFunction( me, "get_reformulator_meta_predicates", "GET-REFORMULATOR-META-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_reformulator_meta_predicates", "FIX-REFORMULATOR-META-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_precondition_checking", "GET-PRECONDITION-CHECKING", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_precondition_checking", "FIX-PRECONDITION-CHECKING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_search_strategy", "GET-SEARCH-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_search_strategy", "FIX-SEARCH-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reformulation_focus", "GET-REFORMULATION-FOCUS", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_reformulation_focus", "FIX-REFORMULATION-FOCUS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ignore_rl_modules", "GET-IGNORE-RL-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_ignore_rl_modules", "FIX-IGNORE-RL-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_apply_first_recursively", "GET-APPLY-FIRST-RECURSIVELY", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_apply_first_recursively", "FIX-APPLY-FIRST-RECURSIVELY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_eliminate_transitivity_in_reformulation_historyP", "GET-ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_eliminate_transitivity_in_reformulation_historyP", "FIX-ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_clear_reformulator_cachesP", "GET-CLEAR-REFORMULATOR-CACHES?", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_clear_reformulator_cachesP", "FIX-CLEAR-REFORMULATOR-CACHES?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reformulate_atomsP", "GET-REFORMULATE-ATOMS?", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_reformulate_atomsP", "FIX-REFORMULATE-ATOMS?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_max_time", "GET-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_max_time", "FIX-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reformulator_setting_for", "GET-REFORMULATOR-SETTING-FOR", 2, 2, false );
    SubLFiles.declareFunction( me, "invalid_setting_value_warning", "INVALID-SETTING-VALUE-WARNING", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_default_for_setting", "REFORMULATOR-DEFAULT-FOR-SETTING", 1, 1, false );
    SubLFiles.declareFunction( me, "sync_reformulator_to_kb", "SYNC-REFORMULATOR-TO-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_reformulator_caches", "CLEAR-REFORMULATOR-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_variables", "INITIALIZE-REFORMULATOR-VARIABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_irrelevant_forts", "INITIALIZE-REFORMULATOR-IRRELEVANT-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_relevant_predicates", "INITIALIZE-REFORMULATOR-RELEVANT-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_rule_predicates", "INITIALIZE-REFORMULATOR-RULE-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_rule_spec_preds", "INITIALIZE-REFORMULATOR-RULE-SPEC-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_default_reformulator_mode_precedence_from_kb", "GATHER-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-FROM-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "construct_default_mode_precedence_struct", "CONSTRUCT-DEFAULT-MODE-PRECEDENCE-STRUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "default_reformulator_mode_precedence_assertion_modes_arg", "DEFAULT-REFORMULATOR-MODE-PRECEDENCE-ASSERTION-MODES-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "mode_precedence_struct_modes", "MODE-PRECEDENCE-STRUCT-MODES", 1, 0, false );
    SubLFiles.declareFunction( me, "mode_precedence_struct_mt", "MODE-PRECEDENCE-STRUCT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_default_reformulation_directions_in_modes_for_preds_from_kb", "GATHER-DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS-FROM-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "default_direction_in_mode_for_pred_assertion_direction_arg", "DEFAULT-DIRECTION-IN-MODE-FOR-PRED-ASSERTION-DIRECTION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "default_direction_in_mode_for_pred_assertion_mode_arg", "DEFAULT-DIRECTION-IN-MODE-FOR-PRED-ASSERTION-MODE-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "default_direction_in_mode_for_pred_assertion_rule_pred_arg", "DEFAULT-DIRECTION-IN-MODE-FOR-PRED-ASSERTION-RULE-PRED-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "add_default_direction_struct_in_mode_for_pred", "ADD-DEFAULT-DIRECTION-STRUCT-IN-MODE-FOR-PRED", 4, 0, false );
    SubLFiles.declareFunction( me, "remove_default_direction_struct_in_mode_for_pred", "REMOVE-DEFAULT-DIRECTION-STRUCT-IN-MODE-FOR-PRED", 4, 0, false );
    SubLFiles.declareFunction( me, "substitute_mode_directions_for_pred", "SUBSTITUTE-MODE-DIRECTIONS-FOR-PRED", 4, 0, false );
    SubLFiles.declareFunction( me, "mode_directions_for_pred", "MODE-DIRECTIONS-FOR-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "directions_for_pred", "DIRECTIONS-FOR-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "add_reformulator_info", "ADD-REFORMULATOR-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulator_info", "REMOVE-REFORMULATOR-INFO", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_datastructures_file()
  {
    $reformulator_initialization_success_ratio$ = SubLFiles.deflexical( "*REFORMULATOR-INITIALIZATION-SUCCESS-RATIO*", $float0$0_9 );
    $reformulator_core_constants$ = SubLFiles.deflexical( "*REFORMULATOR-CORE-CONSTANTS*", $list1 );
    $default_reformulator_mode_precedence$ = SubLFiles.deflexical( "*DEFAULT-REFORMULATOR-MODE-PRECEDENCE*", ( maybeDefault( $sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_, $default_reformulator_mode_precedence$,
        NIL ) ) );
    $default_reformulation_directions_in_modes_for_preds$ = SubLFiles.deflexical( "*DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS*", ( maybeDefault( $sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_,
        $default_reformulation_directions_in_modes_for_preds$, NIL ) ) );
    $default_reformulation_recursion_limit$ = SubLFiles.defparameter( "*DEFAULT-REFORMULATION-RECURSION-LIMIT*", $int7$35 );
    $reformulator_irrelevant_forts$ = SubLFiles.deflexical( "*REFORMULATOR-IRRELEVANT-FORTS*", ( maybeDefault( $sym8$_REFORMULATOR_IRRELEVANT_FORTS_, $reformulator_irrelevant_forts$, NIL ) ) );
    $reformulator_relevant_predicates$ = SubLFiles.deflexical( "*REFORMULATOR-RELEVANT-PREDICATES*", ( maybeDefault( $sym9$_REFORMULATOR_RELEVANT_PREDICATES_, $reformulator_relevant_predicates$, NIL ) ) );
    $reformulator_rule_predicates$ = SubLFiles.deflexical( "*REFORMULATOR-RULE-PREDICATES*", ( maybeDefault( $sym10$_REFORMULATOR_RULE_PREDICATES_, $reformulator_rule_predicates$, NIL ) ) );
    $reformulator_rule_spec_preds$ = SubLFiles.deflexical( "*REFORMULATOR-RULE-SPEC-PREDS*", ( maybeDefault( $sym11$_REFORMULATOR_RULE_SPEC_PREDS_, $reformulator_rule_spec_preds$, NIL ) ) );
    $reformulator_print_verbosity_level$ = SubLFiles.deflexical( "*REFORMULATOR-PRINT-VERBOSITY-LEVEL*", ONE_INTEGER );
    $reformulator_lock$ = SubLFiles.defparameter( "*REFORMULATOR-LOCK*", Locks.make_lock( $str12$Reformulator_Initialization_Updat ) );
    $reformulator_memoization_state$ = SubLFiles.defparameter( "*REFORMULATOR-MEMOIZATION-STATE*", $kw13$UNINITIALIZED );
    $reformulator_setting_keywords$ = SubLFiles.defparameter( "*REFORMULATOR-SETTING-KEYWORDS*", $list41 );
    $all_kb_reformulator_modes_caching_state$ = SubLFiles.deflexical( "*ALL-KB-REFORMULATOR-MODES-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_reformulator_datastructures_file()
  {
    subl_macro_promotions.declare_defglobal( $sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_ );
    subl_macro_promotions.declare_defglobal( $sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_ );
    subl_macro_promotions.declare_defglobal( $sym8$_REFORMULATOR_IRRELEVANT_FORTS_ );
    subl_macro_promotions.declare_defglobal( $sym9$_REFORMULATOR_RELEVANT_PREDICATES_ );
    subl_macro_promotions.declare_defglobal( $sym10$_REFORMULATOR_RULE_PREDICATES_ );
    subl_macro_promotions.declare_defglobal( $sym11$_REFORMULATOR_RULE_SPEC_PREDS_ );
    access_macros.register_macro_helper( $sym27$FIND_OR_CREATE_REFORMULATOR_MEMOIZATION_STATE, $sym28$WITH_REFORMULATOR_MEMOIZATION );
    memoization_state.note_globally_cached_function( $sym47$ALL_KB_REFORMULATOR_MODES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_datastructures_file();
  }
  static
  {
    me = new reformulator_datastructures();
    $reformulator_initialization_success_ratio$ = null;
    $reformulator_core_constants$ = null;
    $default_reformulator_mode_precedence$ = null;
    $default_reformulation_directions_in_modes_for_preds$ = null;
    $default_reformulation_recursion_limit$ = null;
    $reformulator_irrelevant_forts$ = null;
    $reformulator_relevant_predicates$ = null;
    $reformulator_rule_predicates$ = null;
    $reformulator_rule_spec_preds$ = null;
    $reformulator_print_verbosity_level$ = null;
    $reformulator_lock$ = null;
    $reformulator_memoization_state$ = null;
    $reformulator_setting_keywords$ = null;
    $all_kb_reformulator_modes_caching_state$ = null;
    $float0$0_9 = makeDouble( 0.9 );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "reformulatorRule" ) ), constant_handles.reader_make_constant_shell( makeString( "reformulatorEquals" ) ), constant_handles
        .reader_make_constant_shell( makeString( "reformulatorEquiv" ) ), constant_handles.reader_make_constant_shell( makeString( "reformulationPrecondition" ) ), constant_handles.reader_make_constant_shell( makeString(
            "reformulatorRuleProperties" ) ), constant_handles.reader_make_constant_shell( makeString( "ReformulatorDirectivePredicate" ) ) );
    $sym2$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $str3$A_KB_dependent_reformulator_funct = makeString( "A KB-dependent reformulator function was called, but the current Cyc KB does not contain knowledge necessary for reformulation." );
    $sym4$REFORMULATOR_RELEVANT_ASSERTION_ = makeSymbol( "REFORMULATOR-RELEVANT-ASSERTION?" );
    $sym5$_DEFAULT_REFORMULATOR_MODE_PRECEDENCE_ = makeSymbol( "*DEFAULT-REFORMULATOR-MODE-PRECEDENCE*" );
    $sym6$_DEFAULT_REFORMULATION_DIRECTIONS_IN_MODES_FOR_PREDS_ = makeSymbol( "*DEFAULT-REFORMULATION-DIRECTIONS-IN-MODES-FOR-PREDS*" );
    $int7$35 = makeInteger( 35 );
    $sym8$_REFORMULATOR_IRRELEVANT_FORTS_ = makeSymbol( "*REFORMULATOR-IRRELEVANT-FORTS*" );
    $sym9$_REFORMULATOR_RELEVANT_PREDICATES_ = makeSymbol( "*REFORMULATOR-RELEVANT-PREDICATES*" );
    $sym10$_REFORMULATOR_RULE_PREDICATES_ = makeSymbol( "*REFORMULATOR-RULE-PREDICATES*" );
    $sym11$_REFORMULATOR_RULE_SPEC_PREDS_ = makeSymbol( "*REFORMULATOR-RULE-SPEC-PREDS*" );
    $str12$Reformulator_Initialization_Updat = makeString( "Reformulator Initialization/Update" );
    $kw13$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym14$WITH_REFORMULATOR_MEMOIZATION_STATE = makeSymbol( "WITH-REFORMULATOR-MEMOIZATION-STATE" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIND-OR-CREATE-REFORMULATOR-MEMOIZATION-STATE" ) ) );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-MEMOIZATION-STATE" ) ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "MEMOIZATION-STATE-FORM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym18$MEMOIZATION_STATE = makeUninternedSymbol( "MEMOIZATION-STATE" );
    $sym19$CLET = makeSymbol( "CLET" );
    $sym20$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list21 = ConsesLow.list( makeSymbol( "MEMOIZATION-STATE-P" ) );
    $sym22$WITH_REFORMULATOR_MEMOIZATION_STATE_INTERNAL = makeSymbol( "WITH-REFORMULATOR-MEMOIZATION-STATE-INTERNAL" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "MEMOIZATION-STATE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym24$_REFORMULATOR_MEMOIZATION_STATE_ = makeSymbol( "*REFORMULATOR-MEMOIZATION-STATE*" );
    $sym25$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $list26 = ConsesLow.list( makeSymbol( "*REFORMULATOR-MEMOIZATION-STATE*" ) );
    $sym27$FIND_OR_CREATE_REFORMULATOR_MEMOIZATION_STATE = makeSymbol( "FIND-OR-CREATE-REFORMULATOR-MEMOIZATION-STATE" );
    $sym28$WITH_REFORMULATOR_MEMOIZATION = makeSymbol( "WITH-REFORMULATOR-MEMOIZATION" );
    $kw29$REUSED = makeKeyword( "REUSED" );
    $kw30$NEW = makeKeyword( "NEW" );
    $const31$reformulationPrecondition = constant_handles.reader_make_constant_shell( makeString( "reformulationPrecondition" ) );
    $const32$reformulationDirectionInMode = constant_handles.reader_make_constant_shell( makeString( "reformulationDirectionInMode" ) );
    $const33$defaultReformulationDirectionInMo = constant_handles.reader_make_constant_shell( makeString( "defaultReformulationDirectionInModeForPred" ) );
    $const34$reformulatorRuleProperties = constant_handles.reader_make_constant_shell( makeString( "reformulatorRuleProperties" ) );
    $const35$defaultReformulatorModePrecedence = constant_handles.reader_make_constant_shell( makeString( "defaultReformulatorModePrecedence" ) );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "RR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym37$CDOHASH = makeSymbol( "CDOHASH" );
    $sym38$KEY = makeSymbol( "KEY" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "REFORMULATOR-RULES" ) ) );
    $list40 = ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEY" ) );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "REFORMULATE-SUBFORMULAS?" ), makeKeyword( "RECURSION-LIMIT" ), makeKeyword( "MODES" ), makeKeyword( "WFF-ENFORCEMENT" ), makeKeyword(
        "USE-KB-REFORMULATOR-RULES?" ), makeKeyword( "REFORMULATOR-RULES" ), makeKeyword( "SKIP-ASSERTIONS" ), makeKeyword( "SKIP-SENTENCES" ), makeKeyword( "META-PREDICATES" ), makeKeyword( "PRECONDITION-CHECKING" ),
      makeKeyword( "SEARCH-STRATEGY" ), makeKeyword( "FOCUS" ), makeKeyword( "IGNORE-RL-MODULES" ), makeKeyword( "APPLY-FIRST-RECURSIVELY" ), makeKeyword( "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?" ),
      makeKeyword( "CLEAR-CACHES?" ), makeKeyword( "REFORMULATE-ATOMS?" ), makeKeyword( "MAX-TIME" )
    } );
    $str42$Found_an_invalid_setting___s___ig = makeString( "Found an invalid setting: ~s - ignoring it~%" );
    $kw43$REFORMULATE_SUBFORMULAS_ = makeKeyword( "REFORMULATE-SUBFORMULAS?" );
    $list44 = ConsesLow.list( makeKeyword( "TRUE" ), makeKeyword( "FALSE" ) );
    $kw45$RECURSION_LIMIT = makeKeyword( "RECURSION-LIMIT" );
    $kw46$MODES = makeKeyword( "MODES" );
    $sym47$ALL_KB_REFORMULATOR_MODES = makeSymbol( "ALL-KB-REFORMULATOR-MODES" );
    $const48$ReformulatorMode = constant_handles.reader_make_constant_shell( makeString( "ReformulatorMode" ) );
    $sym49$_ALL_KB_REFORMULATOR_MODES_CACHING_STATE_ = makeSymbol( "*ALL-KB-REFORMULATOR-MODES-CACHING-STATE*" );
    $str50$Found_invalid_reformulation_mode_ = makeString( "Found invalid reformulation mode ~s within reformulation mode precedence list ~s - ignoring the invalid mode" );
    $kw51$WFF_ENFORCEMENT = makeKeyword( "WFF-ENFORCEMENT" );
    $list52 = ConsesLow.list( makeKeyword( "ALL" ), makeKeyword( "ARITY" ), makeKeyword( "KB" ), makeKeyword( "NONE" ) );
    $kw53$USE_KB_REFORMULATOR_RULES_ = makeKeyword( "USE-KB-REFORMULATOR-RULES?" );
    $kw54$REFORMULATOR_RULES = makeKeyword( "REFORMULATOR-RULES" );
    $str55$Found_invalid_reformulator_rule__ = makeString( "Found invalid reformulator rule ~s among the rules explicitly specified - ignoring it" );
    $str56$Expected_a_list_of_reformulator_r = makeString( "Expected a list of reformulator rules, got ~s" );
    $kw57$SKIP_ASSERTIONS = makeKeyword( "SKIP-ASSERTIONS" );
    $kw58$SKIP_SENTENCES = makeKeyword( "SKIP-SENTENCES" );
    $str59$Found_invalid_reformulator_rule_a = makeString( "Found invalid reformulator rule assertion ~s among the assertions explicitly specified to be skipped -- ignoring it" );
    $str60$Found_sentence_to_skip__s_which_d = makeString( "Found sentence to skip ~s which did not correspond to a CycL assertion visible in mt ~s -- ignoring it~%" );
    $kw61$META_PREDICATES = makeKeyword( "META-PREDICATES" );
    $const62$UnaryPredicate = constant_handles.reader_make_constant_shell( makeString( "UnaryPredicate" ) );
    $str63$Found_a_reformulator_meta_predica = makeString( "Found a reformulator meta-predicate ~s which is not a unary predicate in mt ~s -- ignoring it~%" );
    $kw64$PRECONDITION_CHECKING = makeKeyword( "PRECONDITION-CHECKING" );
    $list65 = ConsesLow.list( makeKeyword( "REMOVAL-ONLY-ASK" ) );
    $kw66$SEARCH_STRATEGY = makeKeyword( "SEARCH-STRATEGY" );
    $list67 = ConsesLow.list( makeKeyword( "NO-SEARCH" ) );
    $kw68$FOCUS = makeKeyword( "FOCUS" );
    $str69$Found_invalid_reformulation_focus = makeString( "Found invalid reformulation focus ~s - ignoring it" );
    $kw70$IGNORE_RL_MODULES = makeKeyword( "IGNORE-RL-MODULES" );
    $str71$Found_invalid__ignore_rl_modules_ = makeString( "Found invalid :ignore-rl-modules setting ~s - ignoring it" );
    $kw72$APPLY_FIRST_RECURSIVELY = makeKeyword( "APPLY-FIRST-RECURSIVELY" );
    $str73$Found_invalid__apply_first_recurs = makeString( "Found invalid :apply-first-recursively setting ~s - ignoring it" );
    $kw74$ELIMINATE_TRANSITIVITY_IN_REFORMULATION_HISTORY_ = makeKeyword( "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY?" );
    $kw75$CLEAR_CACHES_ = makeKeyword( "CLEAR-CACHES?" );
    $kw76$REFORMULATE_ATOMS_ = makeKeyword( "REFORMULATE-ATOMS?" );
    $list77 = ConsesLow.list( makeKeyword( "TRUE" ), makeKeyword( "FALSE" ), makeKeyword( "UNLESS-REWRITE-OF" ) );
    $kw78$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw79$COMPUTE_DEFAULT = makeKeyword( "COMPUTE-DEFAULT" );
    $str80$Found_invalid_value__s_for_settin = makeString( "Found invalid value ~s for setting ~s - using the default value ~s instead~%" );
    $kw81$TRUE = makeKeyword( "TRUE" );
    $kw82$KB = makeKeyword( "KB" );
    $kw83$REMOVAL_ONLY_ASK = makeKeyword( "REMOVAL-ONLY-ASK" );
    $kw84$NO_SEARCH = makeKeyword( "NO-SEARCH" );
    $kw85$FALSE = makeKeyword( "FALSE" );
    $str86$Tried_to_get_an_undefined_default = makeString( "Tried to get an undefined default for setting ~s" );
    $sym87$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const88$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const89$ReformulatorIrrelevantFORT = constant_handles.reader_make_constant_shell( makeString( "ReformulatorIrrelevantFORT" ) );
    $const90$ReformulatorDirectivePredicate = constant_handles.reader_make_constant_shell( makeString( "ReformulatorDirectivePredicate" ) );
    $const91$CycLReformulationRulePredicate = constant_handles.reader_make_constant_shell( makeString( "CycLReformulationRulePredicate" ) );
    $const92$reformulatorRule = constant_handles.reader_make_constant_shell( makeString( "reformulatorRule" ) );
    $sym93$GENL_MT_ = makeSymbol( "GENL-MT?" );
    $sym94$SECOND = makeSymbol( "SECOND" );
  }
}
/*
 * 
 * Total time: 316 ms
 * 
 */