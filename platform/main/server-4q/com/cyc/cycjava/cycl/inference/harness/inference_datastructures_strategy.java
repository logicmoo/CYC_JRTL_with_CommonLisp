package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_strategy
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy";
  public static final String myFingerPrint = "acfc3b6e921153d7bd731030e625c4d800c4e3d0fee004e0fd0d73204ebf5fed";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLSymbol $dtp_strategy$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13708L)
  public static SubLSymbol $current_strategy_wrt_memoization$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 26417L)
  private static SubLSymbol $strategy_type_store$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27759L)
  private static SubLSymbol $uninterestingness_cache_lookup_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLSymbol $dtp_problem_strategic_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLSymbol $dtp_tactic_strategic_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62643L)
  private static SubLSymbol $default_uninterestingness_cache_value$;
  private static final SubLSymbol $sym0$STRATEGY;
  private static final SubLSymbol $sym1$STRATEGY_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_STRATEGY;
  private static final SubLSymbol $sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$STRAT_SUID;
  private static final SubLSymbol $sym10$_CSETF_STRAT_SUID;
  private static final SubLSymbol $sym11$STRAT_INFERENCE;
  private static final SubLSymbol $sym12$_CSETF_STRAT_INFERENCE;
  private static final SubLSymbol $sym13$STRAT_RESULT_UNIQUENESS_CRITERION;
  private static final SubLSymbol $sym14$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION;
  private static final SubLSymbol $sym15$STRAT_ACTIVE_PROBLEMS;
  private static final SubLSymbol $sym16$_CSETF_STRAT_ACTIVE_PROBLEMS;
  private static final SubLSymbol $sym17$STRAT_MOTIVATED_PROBLEMS;
  private static final SubLSymbol $sym18$_CSETF_STRAT_MOTIVATED_PROBLEMS;
  private static final SubLSymbol $sym19$STRAT_SET_ASIDE_PROBLEMS;
  private static final SubLSymbol $sym20$_CSETF_STRAT_SET_ASIDE_PROBLEMS;
  private static final SubLSymbol $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_;
  private static final SubLSymbol $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_;
  private static final SubLSymbol $sym23$STRAT_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $sym24$_CSETF_STRAT_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $sym25$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $sym26$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $sym27$STRAT_PROOF_SPEC;
  private static final SubLSymbol $sym28$_CSETF_STRAT_PROOF_SPEC;
  private static final SubLSymbol $sym29$STRAT_PROBLEM_PROOF_SPEC_INDEX;
  private static final SubLSymbol $sym30$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX;
  private static final SubLSymbol $sym31$STRAT_PROBLEM_STRATEGIC_INDEX;
  private static final SubLSymbol $sym32$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX;
  private static final SubLSymbol $sym33$STRAT_MEMOIZATION_STATE;
  private static final SubLSymbol $sym34$_CSETF_STRAT_MEMOIZATION_STATE;
  private static final SubLSymbol $sym35$STRAT_STEP_COUNT;
  private static final SubLSymbol $sym36$_CSETF_STRAT_STEP_COUNT;
  private static final SubLSymbol $sym37$STRAT_TYPE;
  private static final SubLSymbol $sym38$_CSETF_STRAT_TYPE;
  private static final SubLSymbol $sym39$STRAT_DATA;
  private static final SubLSymbol $sym40$_CSETF_STRAT_DATA;
  private static final SubLSymbol $kw41$SUID;
  private static final SubLSymbol $kw42$INFERENCE;
  private static final SubLSymbol $kw43$RESULT_UNIQUENESS_CRITERION;
  private static final SubLSymbol $kw44$ACTIVE_PROBLEMS;
  private static final SubLSymbol $kw45$MOTIVATED_PROBLEMS;
  private static final SubLSymbol $kw46$SET_ASIDE_PROBLEMS;
  private static final SubLSymbol $kw47$SHOULD_RECONSIDER_SET_ASIDES_;
  private static final SubLSymbol $kw48$PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw50$PROOF_SPEC;
  private static final SubLSymbol $kw51$PROBLEM_PROOF_SPEC_INDEX;
  private static final SubLSymbol $kw52$PROBLEM_STRATEGIC_INDEX;
  private static final SubLSymbol $kw53$MEMOIZATION_STATE;
  private static final SubLSymbol $kw54$STEP_COUNT;
  private static final SubLSymbol $kw55$TYPE;
  private static final SubLSymbol $kw56$DATA;
  private static final SubLString $str57$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw58$BEGIN;
  private static final SubLSymbol $sym59$MAKE_STRATEGY;
  private static final SubLSymbol $kw60$SLOT;
  private static final SubLSymbol $kw61$END;
  private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD;
  private static final SubLSymbol $kw63$FREE;
  private static final SubLString $str64$_Invalid_STRATEGY__s_;
  private static final SubLString $str65$__a_STRATEGY__a__a_for_inference_;
  private static final SubLSymbol $sym66$SXHASH_STRATEGY_METHOD;
  private static final SubLSymbol $sym67$STRATEGY_TYPE_P;
  private static final SubLSymbol $sym68$INFERENCE_P;
  private static final SubLString $str69$strategy_memoization_state;
  private static final SubLSymbol $kw70$CONSTRUCTOR;
  private static final SubLSymbol $sym71$STRATEGY_ACTIVE_PROBLEMS;
  private static final SubLSymbol $sym72$DO_STRATEGY_ACTIVE_PROBLEMS;
  private static final SubLSymbol $sym73$STRATEGY_MOTIVATED_PROBLEMS;
  private static final SubLSymbol $sym74$DO_STRATEGY_MOTIVATED_PROBLEMS;
  private static final SubLSymbol $sym75$STRATEGY_SET_ASIDE_PROBLEMS;
  private static final SubLSymbol $sym76$DO_STRATEGY_SET_ASIDE_PROBLEMS;
  private static final SubLSymbol $sym77$RESULT_UNIQUENESS_CRITERION_P;
  private static final SubLSymbol $sym78$PRODUCTIVITY_P;
  private static final SubLSymbol $sym79$PROOF_SPEC_P;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $kw82$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw83$DONE;
  private static final SubLSymbol $sym84$DO_SET;
  private static final SubLSymbol $sym85$DO_SET_CONTENTS;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$STRATEGY_VAR;
  private static final SubLSymbol $sym88$STATE_VAR;
  private static final SubLSymbol $sym89$CLET;
  private static final SubLSymbol $sym90$STRATEGY_MEMOIZATION_STATE;
  private static final SubLSymbol $sym91$_CURRENT_STRATEGY_WRT_MEMOIZATION_;
  private static final SubLSymbol $sym92$WITH_MEMOIZATION_STATE;
  private static final SubLSymbol $sym93$WITH_STRATEGY_MEMOIZATION_STATE;
  private static final SubLSymbol $sym94$CURRENT_STRATEGY_WRT_MEMOIZATION;
  private static final SubLSymbol $sym95$VALID_PROBLEM_P;
  private static final SubLSymbol $kw96$PROOF;
  private static final SubLSymbol $kw97$BINDINGS;
  private static final SubLSymbol $sym98$PROBLEM_P;
  private static final SubLSymbol $kw99$ANYTHING;
  private static final SubLSymbol $sym100$STRATEGY_PROPERTY_P;
  private static final SubLString $str101$Unexpected_strategy_property__s_w;
  private static final SubLSymbol $sym102$STRATEGY_PROPERTIES_P;
  private static final SubLSymbol $kw103$SUBSTRATEGY_STRATEGEM_MOTIVATED;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$STRATEGY_VAR;
  private static final SubLSymbol $sym106$PROBLEM_VAR;
  private static final SubLSymbol $sym107$STRATEGY_NOTE_PROBLEM_ACTIVE;
  private static final SubLSymbol $sym108$STRATEGY_NOTE_PROBLEM_INACTIVE;
  private static final SubLSymbol $sym109$POSSIBLY_REACTIVATE_PROBLEM;
  private static final SubLSymbol $kw110$NOTHING;
  private static final SubLString $str111$balancing_tactician_does_not_impl;
  private static final SubLString $str112$Unexpected_strategy_type__a;
  private static final SubLSymbol $sym113$_STRATEGY_TYPE_STORE_;
  private static final SubLSymbol $sym114$PROPERTY_LIST_P;
  private static final SubLSymbol $sym115$STRATEGY_TYPE_PROPERTY_P;
  private static final SubLSymbol $kw116$RECOMPUTE;
  private static final SubLSymbol $sym117$PROBLEM_STRATEGIC_PROPERTIES;
  private static final SubLSymbol $sym118$PROBLEM_STRATEGIC_PROPERTIES_P;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym124$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$PROB_STRATEGIC_PROPERTIES_STATUS;
  private static final SubLSymbol $sym127$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS;
  private static final SubLSymbol $sym128$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX;
  private static final SubLSymbol $sym129$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX;
  private static final SubLSymbol $sym130$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT;
  private static final SubLSymbol $sym131$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT;
  private static final SubLSymbol $sym132$PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
  private static final SubLSymbol $sym133$_CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
  private static final SubLSymbol $kw134$STATUS;
  private static final SubLSymbol $kw135$TACTIC_STRATEGIC_PROPERTY_INDEX;
  private static final SubLSymbol $kw136$POSSIBLE_TACTIC_COUNT;
  private static final SubLSymbol $kw137$UNINTERESTINGNESS;
  private static final SubLSymbol $sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES;
  private static final SubLSymbol $sym139$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD;
  private static final SubLSymbol $kw140$NEW;
  private static final SubLSymbol $kw141$UNEXAMINED;
  private static final SubLSymbol $kw142$FINISHED;
  private static final SubLSymbol $kw143$NEUTRAL;
  private static final SubLSymbol $kw144$NO_GOOD;
  private static final SubLSymbol $sym145$STRATEGIC_CONTEXT_P;
  private static final SubLString $str146$poking_good_status__s_into_proble;
  private static final SubLSymbol $kw147$POSSIBLE_NO_GOOD;
  private static final SubLString $str148$_possible_no_good__s_wrt__s;
  private static final SubLSymbol $kw149$EXAMINED;
  private static final SubLSymbol $kw150$POSSIBLE;
  private static final SubLSymbol $kw151$PENDING;
  private static final SubLSymbol $sym152$UNINTERESTINGNESS_CACHE_VALUE_P;
  private static final SubLSymbol $kw153$ALL;
  private static final SubLSymbol $sym154$TACTIC_STRATEGIC_PROPERTIES;
  private static final SubLSymbol $sym155$TACTIC_STRATEGIC_PROPERTIES_P;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list161;
  private static final SubLSymbol $sym162$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL;
  private static final SubLSymbol $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL;
  private static final SubLSymbol $sym164$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION;
  private static final SubLSymbol $sym165$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION;
  private static final SubLSymbol $sym166$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY;
  private static final SubLSymbol $sym167$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY;
  private static final SubLSymbol $sym168$TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
  private static final SubLSymbol $sym169$_CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS;
  private static final SubLSymbol $kw170$PREFERENCE_LEVEL;
  private static final SubLSymbol $kw171$PREFERENCE_LEVEL_JUSTIFICATION;
  private static final SubLSymbol $kw172$PRODUCTIVITY;
  private static final SubLSymbol $sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES;
  private static final SubLSymbol $sym174$VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD;
  private static final SubLString $str175$;
  private static final SubLSymbol $sym176$TACTIC_P;
  private static final SubLSymbol $kw177$TACTICAL;
  private static final SubLString $str178$structural_tactic__s_cannot_have_;
  private static final SubLString $str179$content_tactic__s_cannot_have_a_p;
  private static final SubLString $str180$content_tactic__s_cannot_have_a_p;
  private static final SubLSymbol $sym181$GENERALIZED_CONJUNCTIVE_TACTIC_P;
  private static final SubLSymbol $kw182$PREFERRED;
  private static final SubLSymbol $sym183$PREFERENCE_LEVEL_P;
  private static final SubLSymbol $sym184$UNINTERESTINGNESS_CACHE_CONDITIONS_P;
  private static final SubLSymbol $sym185$BOOLEANP;
  private static final SubLSymbol $kw186$SKIP;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strategy_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_strategy( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strategy_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $strategy_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_suid(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_inference(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_result_uniqueness_criterion(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_active_problems(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_motivated_problems(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_set_aside_problems(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_should_reconsider_set_asidesP(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_productivity_limit(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_removal_backtracking_productivity_limit(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_proof_spec(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_problem_proof_spec_index(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_problem_strategic_index(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_memoization_state(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_step_count(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_type(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject strat_data(final SubLObject v_object)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_suid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_inference(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_result_uniqueness_criterion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_active_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_motivated_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_set_aside_problems(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_should_reconsider_set_asidesP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_productivity_limit(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_removal_backtracking_productivity_limit(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_proof_spec(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_problem_proof_spec_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_problem_strategic_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_memoization_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_step_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject _csetf_strat_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != strategy_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject make_strategy(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $strategy_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw41$SUID ) )
      {
        _csetf_strat_suid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$INFERENCE ) )
      {
        _csetf_strat_inference( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$RESULT_UNIQUENESS_CRITERION ) )
      {
        _csetf_strat_result_uniqueness_criterion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$ACTIVE_PROBLEMS ) )
      {
        _csetf_strat_active_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$MOTIVATED_PROBLEMS ) )
      {
        _csetf_strat_motivated_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$SET_ASIDE_PROBLEMS ) )
      {
        _csetf_strat_set_aside_problems( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$SHOULD_RECONSIDER_SET_ASIDES_ ) )
      {
        _csetf_strat_should_reconsider_set_asidesP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$PRODUCTIVITY_LIMIT ) )
      {
        _csetf_strat_productivity_limit( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT ) )
      {
        _csetf_strat_removal_backtracking_productivity_limit( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$PROOF_SPEC ) )
      {
        _csetf_strat_proof_spec( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$PROBLEM_PROOF_SPEC_INDEX ) )
      {
        _csetf_strat_problem_proof_spec_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$PROBLEM_STRATEGIC_INDEX ) )
      {
        _csetf_strat_problem_strategic_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$MEMOIZATION_STATE ) )
      {
        _csetf_strat_memoization_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$STEP_COUNT ) )
      {
        _csetf_strat_step_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$TYPE ) )
      {
        _csetf_strat_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$DATA ) )
      {
        _csetf_strat_data( v_new, current_value );
      }
      else
      {
        Errors.error( $str57$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject visit_defstruct_strategy(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw58$BEGIN, $sym59$MAKE_STRATEGY, SIXTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw41$SUID, strat_suid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw42$INFERENCE, strat_inference( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw43$RESULT_UNIQUENESS_CRITERION, strat_result_uniqueness_criterion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw44$ACTIVE_PROBLEMS, strat_active_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw45$MOTIVATED_PROBLEMS, strat_motivated_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw46$SET_ASIDE_PROBLEMS, strat_set_aside_problems( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw47$SHOULD_RECONSIDER_SET_ASIDES_, strat_should_reconsider_set_asidesP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw48$PRODUCTIVITY_LIMIT, strat_productivity_limit( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, strat_removal_backtracking_productivity_limit( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw50$PROOF_SPEC, strat_proof_spec( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw51$PROBLEM_PROOF_SPEC_INDEX, strat_problem_proof_spec_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw52$PROBLEM_STRATEGIC_INDEX, strat_problem_strategic_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw53$MEMOIZATION_STATE, strat_memoization_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw54$STEP_COUNT, strat_step_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw55$TYPE, strat_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw56$DATA, strat_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$END, $sym59$MAKE_STRATEGY, SIXTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1840L)
  public static SubLObject visit_defstruct_object_strategy_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_strategy( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4140L)
  public static SubLObject valid_strategy_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != strategy_p( v_object ) && NIL == strategy_invalid_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4262L)
  public static SubLObject strategy_invalid_p(final SubLObject strategy)
  {
    return Equality.eq( $kw63$FREE, strategy_type( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4392L)
  public static SubLObject print_strategy(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != strategy_invalid_p( v_object ) )
    {
      PrintLow.format( stream, $str64$_Invalid_STRATEGY__s_, strat_suid( v_object ) );
    }
    else
    {
      final SubLObject strategy_type = strategy_type( v_object );
      final SubLObject strategy_id = strategy_suid( v_object );
      final SubLObject inference = strategy_inference( v_object );
      final SubLObject inference_id = ( NIL != inference ) ? inference_datastructures_inference.inference_suid( inference ) : NIL;
      final SubLObject store = ( NIL != inference ) ? inference_datastructures_inference.inference_problem_store( inference ) : NIL;
      final SubLObject store_id = ( NIL != store ) ? inference_datastructures_problem_store.problem_store_suid( store ) : NIL;
      PrintLow.format( stream, $str65$__a_STRATEGY__a__a_for_inference_, new SubLObject[] { strategy_type, store_id, strategy_id, store_id, inference_id
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 5080L)
  public static SubLObject sxhash_strategy_method(final SubLObject v_object)
  {
    return strat_suid( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 5152L)
  public static SubLObject new_strategy(final SubLObject type, final SubLObject inference)
  {
    assert NIL != strategy_type_p( type ) : type;
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject suid = inference_datastructures_problem_store.problem_store_new_strategy_id( store );
    final SubLObject strategy = make_strategy( UNPROVIDED );
    _csetf_strat_suid( strategy, suid );
    _csetf_strat_inference( strategy, inference );
    _csetf_strat_result_uniqueness_criterion( strategy, NIL );
    _csetf_strat_active_problems( strategy, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_strat_motivated_problems( strategy, set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) ) );
    _csetf_strat_set_aside_problems( strategy, set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_strat_problem_proof_spec_index( strategy, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_strat_should_reconsider_set_asidesP( strategy, NIL );
    _csetf_strat_productivity_limit( strategy, inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue() );
    _csetf_strat_removal_backtracking_productivity_limit( strategy, inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue() );
    _csetf_strat_proof_spec( strategy, inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue() );
    _csetf_strat_problem_strategic_index( strategy, Hashtables.make_hash_table( ONE_INTEGER, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_strat_memoization_state( strategy, memoization_state.new_memoization_state( $str69$strategy_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    _csetf_strat_step_count( strategy, ZERO_INTEGER );
    _csetf_strat_type( strategy, type );
    _csetf_strat_data( strategy, NIL );
    final SubLObject subconstructor = strategy_type_property( type, $kw70$CONSTRUCTOR );
    Functions.funcall( subconstructor, strategy );
    inference_datastructures_problem_store.add_problem_store_strategy( store, strategy );
    inference_datastructures_inference.add_inference_strategy( inference, strategy );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 6770L)
  public static SubLObject destroy_strategy(final SubLObject strategy)
  {
    if( NIL != valid_strategy_p( strategy ) )
    {
      note_strategy_invalid( strategy );
      inference_datastructures_problem_store.remove_problem_store_strategy( strategy_problem_store( strategy ), strategy );
      inference_datastructures_inference.remove_inference_strategy( strategy_inference( strategy ), strategy );
      return destroy_strategy_int( strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7155L)
  public static SubLObject destroy_problem_store_strategy(final SubLObject strategy)
  {
    if( NIL != valid_strategy_p( strategy ) )
    {
      note_strategy_invalid( strategy );
      return destroy_strategy_int( strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7420L)
  public static SubLObject destroy_inference_strategy(final SubLObject strategy)
  {
    if( NIL != valid_strategy_p( strategy ) )
    {
      note_strategy_invalid( strategy );
      inference_datastructures_problem_store.remove_problem_store_strategy( strategy_problem_store( strategy ), strategy );
      return destroy_strategy_int( strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7745L)
  public static SubLObject destroy_strategy_int(final SubLObject strategy)
  {
    _csetf_strat_data( strategy, $kw63$FREE );
    _csetf_strat_proof_spec( strategy, $kw63$FREE );
    _csetf_strat_removal_backtracking_productivity_limit( strategy, $kw63$FREE );
    _csetf_strat_productivity_limit( strategy, $kw63$FREE );
    _csetf_strat_should_reconsider_set_asidesP( strategy, $kw63$FREE );
    memoization_state.clear_all_memoization( strategy_memoization_state( strategy ) );
    _csetf_strat_memoization_state( strategy, $kw63$FREE );
    dictionary.clear_dictionary( strat_problem_proof_spec_index( strategy ) );
    _csetf_strat_problem_proof_spec_index( strategy, $kw63$FREE );
    Hashtables.clrhash( strat_problem_strategic_index( strategy ) );
    _csetf_strat_problem_strategic_index( strategy, $kw63$FREE );
    set.clear_set( strat_set_aside_problems( strategy ) );
    _csetf_strat_set_aside_problems( strategy, $kw63$FREE );
    set.clear_set( strat_active_problems( strategy ) );
    _csetf_strat_active_problems( strategy, $kw63$FREE );
    set_contents.clear_set_contents( strat_motivated_problems( strategy ) );
    _csetf_strat_motivated_problems( strategy, $kw63$FREE );
    _csetf_strat_result_uniqueness_criterion( strategy, $kw63$FREE );
    _csetf_strat_inference( strategy, $kw63$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 8964L)
  public static SubLObject note_strategy_invalid(final SubLObject strategy)
  {
    _csetf_strat_type( strategy, $kw63$FREE );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9070L)
  public static SubLObject remove_strategy_problem(final SubLObject strategy, final SubLObject problem)
  {
    strategy_note_problem_inactive( strategy, problem );
    strategy_note_problem_unmotivated( strategy, problem );
    strategy_clear_problem_set_aside( strategy, problem );
    remove_problem_strategic_properties( problem, strategy );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9363L)
  public static SubLObject strategy_suid(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_suid( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9485L)
  public static SubLObject strategy_inference(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_inference( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9605L)
  public static SubLObject strategy_local_result_uniqueness_criterion(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_result_uniqueness_criterion( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9765L)
  public static SubLObject strategy_problem_strategic_index(final SubLObject strategy)
  {
    return strat_problem_strategic_index( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9876L)
  public static SubLObject strategy_type(final SubLObject strategy)
  {
    return strat_type( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9987L)
  public static SubLObject strategy_data(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_data( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10097L)
  public static SubLObject strategy_active_problems(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_active_problems( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10271L)
  public static SubLObject strategy_motivated_problems(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_motivated_problems( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10454L)
  public static SubLObject strategy_set_aside_problems(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_set_aside_problems( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10637L)
  public static SubLObject strategy_should_reconsider_set_asidesP(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_should_reconsider_set_asidesP( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10797L)
  public static SubLObject strategy_productivity_limit(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_productivity_limit( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11058L)
  public static SubLObject strategy_removal_backtracking_productivity_limit(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_removal_backtracking_productivity_limit( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11373L)
  public static SubLObject strategy_proof_spec(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_proof_spec( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11575L)
  public static SubLObject strategy_problem_proof_spec_index(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_problem_proof_spec_index( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11782L)
  public static SubLObject strategy_step_count(final SubLObject strategy)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    return strat_step_count( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11904L)
  public static SubLObject set_strategy_result_uniqueness_criterion(final SubLObject strategy, final SubLObject result_uniqueness_criterion)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p( result_uniqueness_criterion ) : result_uniqueness_criterion;
    _csetf_strat_result_uniqueness_criterion( strategy, result_uniqueness_criterion );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12222L)
  public static SubLObject set_strategy_productivity_limit(final SubLObject strategy, final SubLObject productivity_limit)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_enumerated_types.productivity_p( productivity_limit ) : productivity_limit;
    _csetf_strat_productivity_limit( strategy, productivity_limit );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12470L)
  public static SubLObject set_strategy_removal_backtracking_productivity_limit(final SubLObject strategy, final SubLObject productivity_limit)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_enumerated_types.productivity_p( productivity_limit ) : productivity_limit;
    _csetf_strat_removal_backtracking_productivity_limit( strategy, productivity_limit );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12760L)
  public static SubLObject set_strategy_proof_spec(final SubLObject strategy, final SubLObject proof_spec)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != inference_proof_spec.proof_spec_p( proof_spec ) : proof_spec;
    _csetf_strat_proof_spec( strategy, proof_spec );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12966L)
  public static SubLObject set_strategy_data(final SubLObject strategy, final SubLObject data)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    _csetf_strat_data( strategy, data );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13109L)
  public static SubLObject do_strategy_active_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    strategy = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      if( NIL == conses_high.member( current_$1, $list81, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw82$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw83$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym84$DO_SET, ConsesLow.list( problem_var, ConsesLow.list( $sym71$STRATEGY_ACTIVE_PROBLEMS, strategy ), $kw83$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13311L)
  public static SubLObject do_strategy_motivated_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    strategy = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      if( NIL == conses_high.member( current_$2, $list81, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw82$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw83$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym85$DO_SET_CONTENTS, ConsesLow.list( problem_var, ConsesLow.list( $sym73$STRATEGY_MOTIVATED_PROBLEMS, strategy ), $kw83$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13514L)
  public static SubLObject do_strategy_set_aside_problems(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject problem_var = NIL;
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    strategy = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      if( NIL == conses_high.member( current_$3, $list81, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw82$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw83$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym84$DO_SET, ConsesLow.list( problem_var, ConsesLow.list( $sym75$STRATEGY_SET_ASIDE_PROBLEMS, strategy ), $kw83$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13898L)
  public static SubLObject with_strategy_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject strategy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
    strategy = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject strategy_var = $sym87$STRATEGY_VAR;
    final SubLObject state_var = $sym88$STATE_VAR;
    return ConsesLow.list( $sym89$CLET, ConsesLow.list( ConsesLow.list( strategy_var, strategy ), ConsesLow.list( state_var, ConsesLow.list( $sym90$STRATEGY_MEMOIZATION_STATE, strategy_var ) ), ConsesLow.list(
        $sym91$_CURRENT_STRATEGY_WRT_MEMOIZATION_, strategy_var ) ), ConsesLow.listS( $sym92$WITH_MEMOIZATION_STATE, ConsesLow.list( state_var ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14234L)
  public static SubLObject strategy_memoization_state(final SubLObject strategy)
  {
    return strat_memoization_state( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14417L)
  public static SubLObject current_strategy_wrt_memoization()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_strategy_wrt_memoization$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14562L)
  public static SubLObject strategic_context_inference(final SubLObject strategic_context)
  {
    return ( NIL != strategy_p( strategic_context ) ) ? strategy_inference( strategic_context ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14730L)
  public static SubLObject strategy_answer_link(final SubLObject strategy)
  {
    return inference_datastructures_inference.inference_root_link( strategy_inference( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14951L)
  public static SubLObject strategy_answer_link_propagatedP(final SubLObject strategy)
  {
    return inference_worker_answer.answer_link_propagatedP( strategy_answer_link( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 15238L)
  public static SubLObject strategy_should_propagate_answer_linkP(final SubLObject strategy)
  {
    if( NIL != strategy_answer_link_propagatedP( strategy ) )
    {
      return NIL;
    }
    if( NIL != inference_worker.inference_deems_answer_link_should_be_closedP( strategy_inference( strategy ), strategy_answer_link( strategy ) ) && NIL != inference_datastructures_inference.inference_has_some_answerP(
        strategy_inference( strategy ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16020L)
  public static SubLObject strategy_root_problem(final SubLObject strategy)
  {
    return inference_datastructures_inference.inference_root_problem( strategy_inference( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16242L)
  public static SubLObject strategy_continuableP(final SubLObject strategy)
  {
    return inference_datastructures_inference.inference_continuableP( strategy_inference( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16358L)
  public static SubLObject problem_active_in_strategyP(final SubLObject problem, final SubLObject strategy)
  {
    return set.set_memberP( problem, strategy_active_problems( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16491L)
  public static SubLObject problem_motivatedP(final SubLObject problem, final SubLObject strategy)
  {
    return set_contents.set_contents_memberP( problem, strategy_motivated_problems( strategy ), Symbols.symbol_function( EQ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16632L)
  public static SubLObject problem_set_aside_in_strategyP(final SubLObject problem, final SubLObject strategy)
  {
    return set.set_memberP( problem, strategy_set_aside_problems( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16772L)
  public static SubLObject strategy_has_some_set_aside_problemsP(final SubLObject strategy)
  {
    return makeBoolean( NIL == set.set_emptyP( strategy_set_aside_problems( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16908L)
  public static SubLObject strategy_all_valid_set_aside_problems(final SubLObject strategy)
  {
    return list_utilities.delete_if_not( $sym95$VALID_PROBLEM_P, set.set_element_list( strategy_set_aside_problems( strategy ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17076L)
  public static SubLObject strategy_problem_store(final SubLObject strategy)
  {
    return inference_datastructures_inference.inference_problem_store( strategy_inference( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17195L)
  public static SubLObject strategy_result_uniqueness_criterion(final SubLObject strategy)
  {
    final SubLObject local_criterion = strategy_local_result_uniqueness_criterion( strategy );
    if( NIL != local_criterion )
    {
      return local_criterion;
    }
    final SubLObject inference = strategy_inference( strategy );
    return inference_datastructures_inference.inference_result_uniqueness_criterion( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17618L)
  public static SubLObject strategy_unique_wrt_proofsP(final SubLObject strategy)
  {
    return Equality.eq( $kw96$PROOF, strategy_result_uniqueness_criterion( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17745L)
  public static SubLObject strategy_unique_wrt_bindingsP(final SubLObject strategy)
  {
    return Equality.eq( $kw97$BINDINGS, strategy_result_uniqueness_criterion( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17877L)
  public static SubLObject strategy_wants_one_answerP(final SubLObject strategy)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18049L)
  public static SubLObject strategy_active_problem_count(final SubLObject strategy)
  {
    return set.set_size( strategy_active_problems( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18165L)
  public static SubLObject strategy_motivated_problem_count(final SubLObject strategy)
  {
    return set_contents.set_contents_size( strategy_motivated_problems( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18296L)
  public static SubLObject strategy_set_aside_problem_count(final SubLObject strategy)
  {
    return set.set_size( strategy_set_aside_problems( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18418L)
  public static SubLObject strategy_problem_proof_spec(final SubLObject strategy, final SubLObject problem)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return dictionary.dictionary_lookup_without_values( strategy_problem_proof_spec_index( strategy ), problem, $kw99$ANYTHING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18683L)
  public static SubLObject set_strategy_property(final SubLObject strategy, final SubLObject property, final SubLObject value)
  {
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_enumerated_types.strategy_property_p( property ) : property;
    if( property.eql( $kw48$PRODUCTIVITY_LIMIT ) )
    {
      set_strategy_productivity_limit( strategy, value );
    }
    else if( property.eql( $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT ) )
    {
      set_strategy_removal_backtracking_productivity_limit( strategy, value );
    }
    else if( property.eql( $kw50$PROOF_SPEC ) )
    {
      set_strategy_proof_spec( strategy, value );
    }
    else
    {
      Errors.error( $str101$Unexpected_strategy_property__s_w, property, value );
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19246L)
  public static SubLObject copy_strategy_properties(final SubLObject source_strategy, final SubLObject target_strategy)
  {
    set_strategy_productivity_limit( target_strategy, strategy_productivity_limit( source_strategy ) );
    set_strategy_removal_backtracking_productivity_limit( target_strategy, strategy_removal_backtracking_productivity_limit( source_strategy ) );
    set_strategy_proof_spec( target_strategy, strategy_proof_spec( source_strategy ) );
    return target_strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19728L)
  public static SubLObject set_strategy_properties(final SubLObject strategy, final SubLObject strategy_properties)
  {
    assert NIL != inference_datastructures_enumerated_types.strategy_properties_p( strategy_properties ) : strategy_properties;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = strategy_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      set_strategy_property( strategy, property, value );
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19979L)
  public static SubLObject strategy_note_problem_active(final SubLObject strategy, final SubLObject problem)
  {
    set.set_add( problem, strategy_active_problems( strategy ) );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20152L)
  public static SubLObject strategy_note_problem_inactive(final SubLObject strategy, final SubLObject problem)
  {
    set.set_remove( problem, strategy_active_problems( strategy ) );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20298L)
  public static SubLObject strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem)
  {
    final SubLObject motivated_problems = strategy_motivated_problems( strategy );
    _csetf_strat_motivated_problems( strategy, set_contents.set_contents_add( problem, motivated_problems, Symbols.symbol_function( EQ ) ) );
    controlling_strategy_callback( strategy, $kw103$SUBSTRATEGY_STRATEGEM_MOTIVATED, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20640L)
  public static SubLObject strategy_note_problem_unmotivated(final SubLObject strategy, final SubLObject problem)
  {
    set_contents.set_contents_delete( problem, strategy_motivated_problems( strategy ), Symbols.symbol_function( EQ ) );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20806L)
  public static SubLObject strategy_note_problem_set_aside(final SubLObject strategy, final SubLObject problem)
  {
    set.set_add( problem, strategy_set_aside_problems( strategy ) );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20954L)
  public static SubLObject strategy_clear_problem_set_aside(final SubLObject strategy, final SubLObject problem)
  {
    set.set_remove( problem, strategy_set_aside_problems( strategy ) );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21105L)
  public static SubLObject strategy_clear_set_asides(final SubLObject strategy)
  {
    set.clear_set( strategy_set_aside_problems( strategy ) );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21232L)
  public static SubLObject note_strategy_should_reconsider_set_asides(final SubLObject strategy)
  {
    _csetf_strat_should_reconsider_set_asidesP( strategy, T );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21383L)
  public static SubLObject clear_strategy_should_reconsider_set_asides(final SubLObject strategy)
  {
    _csetf_strat_should_reconsider_set_asidesP( strategy, NIL );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 21536L)
  public static SubLObject with_strategically_active_problem(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject strategy = NIL;
    SubLObject problem = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    strategy = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    problem = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject strategy_var = $sym105$STRATEGY_VAR;
      final SubLObject problem_var = $sym106$PROBLEM_VAR;
      return ConsesLow.listS( $sym89$CLET, ConsesLow.list( ConsesLow.list( strategy_var, strategy ), ConsesLow.list( problem_var, problem ) ), ConsesLow.list( $sym107$STRATEGY_NOTE_PROBLEM_ACTIVE, strategy_var,
          problem_var ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym108$STRATEGY_NOTE_PROBLEM_INACTIVE, strategy_var, problem_var ), ConsesLow.list( $sym109$POSSIBLY_REACTIVATE_PROBLEM, strategy_var,
              problem_var ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list104 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 22094L)
  public static SubLObject strategy_note_problem_proof_spec(final SubLObject strategy, final SubLObject problem, final SubLObject proof_spec)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject old_value = dictionary.dictionary_lookup_without_values( strategy_problem_proof_spec_index( strategy ), problem, $kw110$NOTHING );
    final SubLObject new_value = inference_proof_spec.merge_2_proof_specs( old_value, proof_spec );
    if( !new_value.equal( old_value ) )
    {
      dictionary.dictionary_enter( strategy_problem_proof_spec_index( strategy ), problem, new_value );
      set_problem_recompute_thrown_away( problem, strategy );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 22853L)
  public static SubLObject increment_strategy_step_count(final SubLObject strategy)
  {
    SubLObject step_count = strat_step_count( strategy );
    step_count = Numbers.add( step_count, ONE_INTEGER );
    _csetf_strat_step_count( strategy, step_count );
    return step_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 23060L)
  public static SubLObject strategy_dispatch(final SubLObject strategy, final SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    final SubLObject arg1_providedP = makeBoolean( arg1 != UNPROVIDED );
    final SubLObject arg2_providedP = makeBoolean( arg2 != UNPROVIDED );
    final SubLObject arg3_providedP = makeBoolean( arg3 != UNPROVIDED );
    final SubLObject arg4_providedP = makeBoolean( arg4 != UNPROVIDED );
    final SubLObject arg5_providedP = makeBoolean( arg5 != UNPROVIDED );
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    SubLObject handler_func = strategy_dispatch_handler( strategy, method_type );
    if( NIL == handler_func )
    {
      handler_func = inference_datastructures_enumerated_types.strategy_default_method_handler( method_type );
    }
    if( NIL == handler_func && NIL != balancing_tactician.balancing_tactician_p( strategy ) )
    {
      return Errors.error( $str111$balancing_tactician_does_not_impl, method_type );
    }
    if( NIL != arg5_providedP )
    {
      return strategy_dispatch_funcall_5( handler_func, strategy, arg1, arg2, arg3, arg4, arg5 );
    }
    if( NIL != arg4_providedP )
    {
      return strategy_dispatch_funcall_4( handler_func, strategy, arg1, arg2, arg3, arg4 );
    }
    if( NIL != arg3_providedP )
    {
      return strategy_dispatch_funcall_3( handler_func, strategy, arg1, arg2, arg3 );
    }
    if( NIL != arg2_providedP )
    {
      return strategy_dispatch_funcall_2( handler_func, strategy, arg1, arg2 );
    }
    if( NIL != arg1_providedP )
    {
      return strategy_dispatch_funcall_1( handler_func, strategy, arg1 );
    }
    return strategy_dispatch_funcall_0( handler_func, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24236L)
  public static SubLObject strategy_dispatch_handler(final SubLObject strategy, final SubLObject method_type)
  {
    final SubLObject strategy_type = strategy_type( strategy );
    return inference_tactician.strategy_type_dispatch_handler( strategy_type, method_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24424L)
  public static SubLObject strategy_dispatch_funcall_0(final SubLObject func, final SubLObject strategy)
  {
    return Functions.funcall( func, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24546L)
  public static SubLObject strategy_dispatch_funcall_1(final SubLObject func, final SubLObject strategy, final SubLObject arg1)
  {
    return Functions.funcall( func, strategy, arg1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24678L)
  public static SubLObject strategy_dispatch_funcall_2(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2)
  {
    return Functions.funcall( func, strategy, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24826L)
  public static SubLObject strategy_dispatch_funcall_3(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    return Functions.funcall( func, strategy, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 24984L)
  public static SubLObject strategy_dispatch_funcall_4(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    return Functions.funcall( func, strategy, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25152L)
  public static SubLObject strategy_dispatch_funcall_5(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    return Functions.funcall( func, strategy, arg1, arg2, arg3, arg4, arg5 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25330L)
  public static SubLObject strategy_dispatch_unexpected_strategy_type_error(final SubLObject strategy)
  {
    return Errors.error( $str112$Unexpected_strategy_type__a, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25498L)
  public static SubLObject controlling_strategy_callback(final SubLObject substrategy, final SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    final SubLObject arg1_providedP = makeBoolean( arg1 != UNPROVIDED );
    final SubLObject arg2_providedP = makeBoolean( arg2 != UNPROVIDED );
    final SubLObject arg3_providedP = makeBoolean( arg3 != UNPROVIDED );
    final SubLObject arg4_providedP = makeBoolean( arg4 != UNPROVIDED );
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    final SubLObject controlling_strategy = inference_tactician.controlling_strategy( substrategy );
    if( substrategy.eql( controlling_strategy ) )
    {
      return NIL;
    }
    if( NIL != arg4_providedP )
    {
      return strategy_dispatch( controlling_strategy, method_type, substrategy, arg1, arg2, arg3, arg4 );
    }
    if( NIL != arg3_providedP )
    {
      return strategy_dispatch( controlling_strategy, method_type, substrategy, arg1, arg2, arg3, UNPROVIDED );
    }
    if( NIL != arg2_providedP )
    {
      return strategy_dispatch( controlling_strategy, method_type, substrategy, arg1, arg2, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != arg1_providedP )
    {
      return strategy_dispatch( controlling_strategy, method_type, substrategy, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return strategy_dispatch( controlling_strategy, method_type, substrategy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 26754L)
  public static SubLObject strategy_type_p(final SubLObject v_object)
  {
    return dictionary.dictionary_lookup( $strategy_type_store$.getGlobalValue(), v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 26856L)
  public static SubLObject new_strategy_type(final SubLObject type, final SubLObject plist)
  {
    assert NIL != list_utilities.property_list_p( plist ) : plist;
    deregister_strategy_type( type );
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      set_strategy_type_property( type, property, value );
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27104L)
  public static SubLObject deregister_strategy_type(final SubLObject type)
  {
    return dictionary.dictionary_remove( $strategy_type_store$.getGlobalValue(), type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27225L)
  public static SubLObject clear_strategy_type_store()
  {
    dictionary.clear_dictionary( $strategy_type_store$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27327L)
  public static SubLObject strategy_type_property(final SubLObject type, final SubLObject property)
  {
    return dictionary_utilities.dictionary_getf( $strategy_type_store$.getGlobalValue(), type, property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27549L)
  public static SubLObject set_strategy_type_property(final SubLObject type, final SubLObject property, final SubLObject value)
  {
    assert NIL != inference_datastructures_enumerated_types.strategy_type_property_p( property ) : property;
    return dictionary_utilities.dictionary_putf( $strategy_type_store$.getGlobalValue(), type, property, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27861L)
  public static SubLObject default_uninterestingness_cache_value()
  {
    return Vectors.make_vector( TWO_INTEGER, $kw116$RECOMPUTE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject problem_strategic_properties_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject problem_strategic_properties_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $problem_strategic_properties_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject prob_strategic_properties_status(final SubLObject v_object)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject prob_strategic_properties_possible_tactic_count(final SubLObject v_object)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject prob_strategic_properties_uninterestingness(final SubLObject v_object)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject _csetf_prob_strategic_properties_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject _csetf_prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject _csetf_prob_strategic_properties_possible_tactic_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject _csetf_prob_strategic_properties_uninterestingness(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_strategic_properties_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject make_problem_strategic_properties(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $problem_strategic_properties_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw134$STATUS ) )
      {
        _csetf_prob_strategic_properties_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw135$TACTIC_STRATEGIC_PROPERTY_INDEX ) )
      {
        _csetf_prob_strategic_properties_tactic_strategic_property_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw136$POSSIBLE_TACTIC_COUNT ) )
      {
        _csetf_prob_strategic_properties_possible_tactic_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw137$UNINTERESTINGNESS ) )
      {
        _csetf_prob_strategic_properties_uninterestingness( v_new, current_value );
      }
      else
      {
        Errors.error( $str57$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject visit_defstruct_problem_strategic_properties(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw58$BEGIN, $sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw134$STATUS, prob_strategic_properties_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw135$TACTIC_STRATEGIC_PROPERTY_INDEX, prob_strategic_properties_tactic_strategic_property_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw136$POSSIBLE_TACTIC_COUNT, prob_strategic_properties_possible_tactic_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw137$UNINTERESTINGNESS, prob_strategic_properties_uninterestingness( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$END, $sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28314L)
  public static SubLObject visit_defstruct_object_problem_strategic_properties_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_problem_strategic_properties( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28899L)
  public static SubLObject new_problem_strategic_properties()
  {
    final SubLObject problem_strategic_properties = make_problem_strategic_properties( UNPROVIDED );
    _csetf_prob_strategic_properties_status( problem_strategic_properties, $kw140$NEW );
    _csetf_prob_strategic_properties_tactic_strategic_property_index( problem_strategic_properties, NIL );
    _csetf_prob_strategic_properties_possible_tactic_count( problem_strategic_properties, ZERO_INTEGER );
    _csetf_prob_strategic_properties_uninterestingness( problem_strategic_properties, default_uninterestingness_cache_value() );
    return problem_strategic_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29560L)
  public static SubLObject problem_strategic_properties_int(final SubLObject problem, final SubLObject strategy)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    assert NIL != strategy_p( strategy ) : strategy;
    final SubLObject problem_strategic_properties = Hashtables.gethash_without_values( problem, strategy_problem_strategic_index( strategy ), UNPROVIDED );
    return problem_strategic_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29938L)
  public static SubLObject set_problem_strategic_properties(final SubLObject problem, final SubLObject strategy, final SubLObject v_properties)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != problem_strategic_properties_p( v_properties ) : v_properties;
    final SubLObject hash = strategy_problem_strategic_index( strategy );
    Hashtables.sethash( problem, hash, v_properties );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30272L)
  public static SubLObject remove_problem_strategic_properties(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject hash = strategy_problem_strategic_index( strategy );
    Hashtables.remhash( problem, hash );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30450L)
  public static SubLObject problem_strategic_properties(final SubLObject problem, final SubLObject strategy)
  {
    SubLObject problem_strategic_properties = problem_strategic_properties_int( problem, strategy );
    if( NIL == problem_strategic_properties_p( problem_strategic_properties ) )
    {
      problem_strategic_properties = new_problem_strategic_properties();
      set_problem_strategic_properties( problem, strategy, problem_strategic_properties );
    }
    return problem_strategic_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31006L)
  public static SubLObject problem_strategic_properties_tactic_strategic_property_index(final SubLObject problem, final SubLObject problem_strategic_properties)
  {
    SubLObject tactic_properties_vector = prob_strategic_properties_tactic_strategic_property_index( problem_strategic_properties );
    if( !tactic_properties_vector.isVector() )
    {
      tactic_properties_vector = Vectors.make_vector( inference_datastructures_problem.problem_tactic_count( problem ), UNPROVIDED );
      _csetf_prob_strategic_properties_tactic_strategic_property_index( problem_strategic_properties, tactic_properties_vector );
    }
    if( Sequences.length( tactic_properties_vector ).numL( inference_datastructures_problem.problem_tactic_count( problem ) ) )
    {
      tactic_properties_vector = vector_utilities.extend_vector_to( tactic_properties_vector, inference_datastructures_problem.problem_tactic_count( problem ), UNPROVIDED );
      _csetf_prob_strategic_properties_tactic_strategic_property_index( problem_strategic_properties, tactic_properties_vector );
    }
    return tactic_properties_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32428L)
  public static SubLObject problem_dwimmed_strategic_status(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject strategic_status = problem_raw_strategic_status( problem, strategy );
    if( NIL != inference_worker.problem_goodP( problem ) )
    {
      final SubLObject dwimmed_status = inference_worker.good_version_of_problem_status( strategic_status );
      return dwimmed_status;
    }
    return strategic_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32773L)
  public static SubLObject problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    final SubLObject strategic_status = prob_strategic_properties_status( problem_strategic_properties );
    if( $kw140$NEW == strategic_status && $kw140$NEW != inference_datastructures_problem.problem_status( problem ) )
    {
      return $kw141$UNEXAMINED;
    }
    return strategic_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33236L)
  public static SubLObject problem_weak_strategic_status(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject status = problem_raw_strategic_status( problem, strategy );
    final SubLObject weak_tactical_status = inference_datastructures_enumerated_types.tactical_status_from_problem_status( status );
    return weak_tactical_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33474L)
  public static SubLObject problem_strategic_status(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject weak_tactical_status = problem_weak_strategic_status( problem, strategy );
    if( NIL != inference_datastructures_problem.tactically_finished_problem_p( problem ) )
    {
      return $kw142$FINISHED;
    }
    return weak_tactical_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33798L)
  public static SubLObject problem_strategic_provability_status(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject status = problem_dwimmed_strategic_status( problem, strategy );
    final SubLObject weak_provability_status = inference_datastructures_enumerated_types.provability_status_from_problem_status( status );
    if( $kw143$NEUTRAL == weak_provability_status && NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) )
    {
      return $kw144$NO_GOOD;
    }
    return weak_provability_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 34248L)
  public static SubLObject problem_tactical_or_strategic_status(final SubLObject problem, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    return ( NIL != strategy_p( strategic_context ) ) ? problem_strategic_status( problem, strategic_context ) : inference_datastructures_problem.problem_tactical_status( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 34685L)
  public static SubLObject problem_provability_status(final SubLObject problem, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    return ( NIL != strategy_p( strategic_context ) ) ? problem_strategic_provability_status( problem, strategic_context ) : inference_datastructures_problem.problem_tactical_provability_status( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35160L)
  public static SubLObject set_problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy, final SubLObject status)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != inference_datastructures_enumerated_types.good_problem_status_p( status ) )
    {
      Errors.error( $str146$poking_good_status__s_into_proble, status, problem, strategy );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw147$POSSIBLE_NO_GOOD == status )
    {
      Errors.error( $str148$_possible_no_good__s_wrt__s, problem, strategy );
    }
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    _csetf_prob_strategic_properties_status( problem_strategic_properties, status );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35754L)
  public static SubLObject strategically_unexamined_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw141$UNEXAMINED, problem_strategic_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35911L)
  public static SubLObject strategically_examined_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw149$EXAMINED, problem_strategic_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36050L)
  public static SubLObject strategically_possible_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw150$POSSIBLE, problem_strategic_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36189L)
  public static SubLObject strategically_pending_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw151$PENDING, problem_strategic_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36326L)
  public static SubLObject strategically_finished_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw142$FINISHED, problem_strategic_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36465L)
  public static SubLObject strategically_no_good_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw144$NO_GOOD, problem_strategic_provability_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36614L)
  public static SubLObject strategically_neutral_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return Equality.eq( $kw143$NEUTRAL, problem_strategic_provability_status( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36763L)
  public static SubLObject strategically_good_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return inference_worker.problem_goodP( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36883L)
  public static SubLObject strategically_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return makeBoolean( NIL != strategically_possible_problem_p( problem, strategy ) || NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37080L)
  public static SubLObject strategically_not_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return makeBoolean( NIL != strategically_examined_problem_p( problem, strategy ) || NIL != strategically_pending_problem_p( problem, strategy ) || NIL != strategically_finished_problem_p( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37348L)
  public static SubLObject strategically_totally_no_good_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return strategically_no_good_problem_p( problem, inference_tactician.controlling_strategy( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37509L)
  public static SubLObject problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    return prob_strategic_properties_uninterestingness( problem_strategic_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37821L)
  public static SubLObject set_problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy, final SubLObject uninterestingness)
  {
    assert NIL != uninterestingness_cache_value_p( uninterestingness ) : uninterestingness;
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    _csetf_prob_strategic_properties_uninterestingness( problem_strategic_properties, uninterestingness );
    return uninterestingness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38202L)
  public static SubLObject set_just_problem_thrown_away(final SubLObject problem, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = problem_strategic_uninterestingness( problem, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value( uninterestingness, T, conditions );
    return set_problem_strategic_uninterestingness( problem, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38562L)
  public static SubLObject set_just_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = problem_strategic_uninterestingness( problem, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value( uninterestingness, NIL, conditions );
    return set_problem_strategic_uninterestingness( problem, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38928L)
  public static SubLObject set_just_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject uninterestingness = problem_strategic_uninterestingness( problem, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value( uninterestingness, $kw116$RECOMPUTE, $kw153$ALL );
    return set_problem_strategic_uninterestingness( problem, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 39338L)
  public static SubLObject set_just_problem_set_aside(final SubLObject problem, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = problem_strategic_uninterestingness( problem, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value( uninterestingness, T, conditions );
    return set_problem_strategic_uninterestingness( problem, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 39694L)
  public static SubLObject set_just_problem_not_set_aside(final SubLObject problem, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = problem_strategic_uninterestingness( problem, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value( uninterestingness, NIL, conditions );
    return set_problem_strategic_uninterestingness( problem, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40056L)
  public static SubLObject set_just_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject uninterestingness = problem_strategic_uninterestingness( problem, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value( uninterestingness, $kw116$RECOMPUTE, $kw153$ALL );
    return set_problem_strategic_uninterestingness( problem, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40414L)
  public static SubLObject problem_thrown_away_cache_status(final SubLObject problem, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return thrown_away_cache_status_from_uninterestingness( problem_strategic_uninterestingness( problem, strategy ), conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40686L)
  public static SubLObject problem_set_aside_cache_status(final SubLObject problem, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_aside_cache_status_from_uninterestingness( problem_strategic_uninterestingness( problem, strategy ), conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40940L)
  public static SubLObject set_problem_thrown_away(final SubLObject problem, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_just_problem_thrown_away( problem, strategy, conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41545L)
  public static SubLObject set_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_just_problem_not_thrown_away( problem, strategy, conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41711L)
  public static SubLObject set_problem_set_aside(final SubLObject problem, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    set_just_problem_set_aside( problem, strategy, conditions );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42041L)
  public static SubLObject set_problem_not_set_aside(final SubLObject problem, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_just_problem_not_set_aside( problem, strategy, conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42203L)
  public static SubLObject set_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy)
  {
    return set_just_problem_recompute_thrown_away( problem, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42342L)
  public static SubLObject set_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy)
  {
    return set_just_problem_recompute_set_aside( problem, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject tactic_strategic_properties_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject tactic_strategic_properties_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $tactic_strategic_properties_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject tact_strategic_properties_preference_level(final SubLObject v_object)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject tact_strategic_properties_preference_level_justification(final SubLObject v_object)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject tact_strategic_properties_productivity(final SubLObject v_object)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject tact_strategic_properties_uninterestingness(final SubLObject v_object)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject _csetf_tact_strategic_properties_preference_level(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject _csetf_tact_strategic_properties_preference_level_justification(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject _csetf_tact_strategic_properties_productivity(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject _csetf_tact_strategic_properties_uninterestingness(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tactic_strategic_properties_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject make_tactic_strategic_properties(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $tactic_strategic_properties_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw170$PREFERENCE_LEVEL ) )
      {
        _csetf_tact_strategic_properties_preference_level( v_new, current_value );
      }
      else if( pcase_var.eql( $kw171$PREFERENCE_LEVEL_JUSTIFICATION ) )
      {
        _csetf_tact_strategic_properties_preference_level_justification( v_new, current_value );
      }
      else if( pcase_var.eql( $kw172$PRODUCTIVITY ) )
      {
        _csetf_tact_strategic_properties_productivity( v_new, current_value );
      }
      else if( pcase_var.eql( $kw137$UNINTERESTINGNESS ) )
      {
        _csetf_tact_strategic_properties_uninterestingness( v_new, current_value );
      }
      else
      {
        Errors.error( $str57$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject visit_defstruct_tactic_strategic_properties(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw58$BEGIN, $sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw170$PREFERENCE_LEVEL, tact_strategic_properties_preference_level( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw171$PREFERENCE_LEVEL_JUSTIFICATION, tact_strategic_properties_preference_level_justification( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw172$PRODUCTIVITY, tact_strategic_properties_productivity( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw137$UNINTERESTINGNESS, tact_strategic_properties_uninterestingness( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$END, $sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42838L)
  public static SubLObject visit_defstruct_object_tactic_strategic_properties_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_tactic_strategic_properties( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43453L)
  public static SubLObject new_tactic_strategic_properties()
  {
    final SubLObject tactic_strategic_properties = make_tactic_strategic_properties( UNPROVIDED );
    _csetf_tact_strategic_properties_preference_level( tactic_strategic_properties, preference_modules.$default_preference_level$.getGlobalValue() );
    _csetf_tact_strategic_properties_preference_level_justification( tactic_strategic_properties, $str175$ );
    _csetf_tact_strategic_properties_productivity( tactic_strategic_properties, number_utilities.positive_infinity() );
    _csetf_tact_strategic_properties_uninterestingness( tactic_strategic_properties, default_uninterestingness_cache_value() );
    return tactic_strategic_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 44123L)
  public static SubLObject tactic_strategic_properties_int(final SubLObject tactic, final SubLObject strategy)
  {
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    assert NIL != strategy_p( strategy ) : strategy;
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    if( NIL != problem_strategic_properties_p( problem_strategic_properties ) )
    {
      final SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index( problem, problem_strategic_properties );
      if( tactic_properties_vector.isVector() )
      {
        final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid( tactic );
        return Vectors.aref( tactic_properties_vector, tactic_suid );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 44835L)
  public static SubLObject set_tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy, final SubLObject v_properties)
  {
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    assert NIL != strategy_p( strategy ) : strategy;
    assert NIL != tactic_strategic_properties_p( v_properties ) : v_properties;
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    final SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index( problem, problem_strategic_properties );
    final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid( tactic );
    Vectors.set_aref( tactic_properties_vector, tactic_suid, v_properties );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 45437L)
  public static SubLObject tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy)
  {
    SubLObject tactic_strategic_properties = tactic_strategic_properties_int( tactic, strategy );
    if( NIL == tactic_strategic_properties_p( tactic_strategic_properties ) )
    {
      tactic_strategic_properties = new_tactic_strategic_properties();
      set_tactic_strategic_properties( tactic, strategy, tactic_strategic_properties );
    }
    return tactic_strategic_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 45979L)
  public static SubLObject tactic_strategic_completeness(final SubLObject tactic, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    if( $kw177$TACTICAL == strategic_context )
    {
      return inference_datastructures_tactic.tactic_completeness( tactic );
    }
    if( NIL != inference_worker.content_tactic_p( tactic ) )
    {
      return inference_datastructures_tactic.tactic_completeness( tactic );
    }
    return Errors.error( $str178$structural_tactic__s_cannot_have_, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 46498L)
  public static SubLObject tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    if( $kw177$TACTICAL == strategic_context )
    {
      return inference_datastructures_tactic.tactic_preference_level( tactic );
    }
    if( NIL != inference_worker.generalized_structural_tactic_p( tactic ) )
    {
      final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategic_context );
      return tact_strategic_properties_preference_level( tactic_strategic_properties );
    }
    return Errors.error( $str179$content_tactic__s_cannot_have_a_p, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47106L)
  public static SubLObject tactic_strategic_preference_level_justification(final SubLObject tactic, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    if( $kw177$TACTICAL == strategic_context )
    {
      return inference_datastructures_tactic.tactic_preference_level_justification( tactic );
    }
    if( NIL != inference_worker.generalized_structural_tactic_p( tactic ) )
    {
      final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategic_context );
      return tact_strategic_properties_preference_level_justification( tactic_strategic_properties );
    }
    return Errors.error( $str180$content_tactic__s_cannot_have_a_p, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47770L)
  public static SubLObject tactic_strategic_dwimmed_completeness(final SubLObject tactic, final SubLObject strategic_context)
  {
    if( NIL != inference_worker.content_tactic_p( tactic ) )
    {
      return tactic_strategic_completeness( tactic, strategic_context );
    }
    return preference_modules.preference_level_to_completeness( tactic_strategic_preference_level( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48078L)
  public static SubLObject conjunctive_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.generalized_conjunctive_tactic_p( tactic ) : tactic;
    if( NIL != inference_worker_removal.conjunctive_removal_tactic_p( tactic ) )
    {
      return preference_modules.completeness_to_preference_level( tactic_strategic_completeness( tactic, strategic_context ) );
    }
    return tactic_strategic_preference_level( tactic, strategic_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48451L)
  public static SubLObject conjunctive_tactic_strategic_preference_level_justification(final SubLObject tactic, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.generalized_conjunctive_tactic_p( tactic ) : tactic;
    if( NIL != inference_worker_removal.conjunctive_removal_tactic_p( tactic ) )
    {
      return string_utilities.str( tactic_strategic_completeness( tactic, strategic_context ) );
    }
    return tactic_strategic_preference_level_justification( tactic, strategic_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48823L)
  public static SubLObject tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategic_context)
  {
    if( $kw177$TACTICAL == strategic_context )
    {
      return inference_datastructures_tactic.tactic_productivity( tactic );
    }
    if( NIL != inference_worker.content_tactic_p( tactic ) )
    {
      return inference_datastructures_tactic.tactic_productivity( tactic );
    }
    final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategic_context );
    return tact_strategic_properties_productivity( tactic_strategic_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 49393L)
  public static SubLObject tactic_strategically_preferredP(final SubLObject tactic, final SubLObject strategy)
  {
    return Equality.eq( $kw182$PREFERRED, tactic_strategic_preference_level( tactic, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 49539L)
  public static SubLObject set_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategy, final SubLObject preference_level, final SubLObject justification)
  {
    assert NIL != preference_modules.preference_level_p( preference_level ) : preference_level;
    final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategy );
    _csetf_tact_strategic_properties_preference_level( tactic_strategic_properties, preference_level );
    _csetf_tact_strategic_properties_preference_level_justification( tactic_strategic_properties, justification );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 50501L)
  public static SubLObject set_tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategy, final SubLObject productivity)
  {
    final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategy );
    _csetf_tact_strategic_properties_productivity( tactic_strategic_properties, productivity );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 51253L)
  public static SubLObject problem_strategically_possible_tactic_count(final SubLObject problem, final SubLObject strategy)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    assert NIL != strategy_p( strategy ) : strategy;
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    return prob_strategic_properties_possible_tactic_count( problem_strategic_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 51644L)
  public static SubLObject problem_note_tactic_strategically_possible(final SubLObject problem, final SubLObject tactic, final SubLObject strategy)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    assert NIL != strategy_p( strategy ) : strategy;
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    _csetf_prob_strategic_properties_possible_tactic_count( problem_strategic_properties, Numbers.add( prob_strategic_properties_possible_tactic_count( problem_strategic_properties ), ONE_INTEGER ) );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52055L)
  public static SubLObject problem_note_tactic_not_strategically_possible(final SubLObject problem, final SubLObject tactic, final SubLObject strategy)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    assert NIL != strategy_p( strategy ) : strategy;
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    _csetf_prob_strategic_properties_possible_tactic_count( problem_strategic_properties, Numbers.subtract( prob_strategic_properties_possible_tactic_count( problem_strategic_properties ), ONE_INTEGER ) );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52446L)
  public static SubLObject problem_note_all_tactics_not_strategically_possible(final SubLObject problem, final SubLObject strategy)
  {
    final SubLObject problem_strategic_properties = problem_strategic_properties( problem, strategy );
    _csetf_prob_strategic_properties_possible_tactic_count( problem_strategic_properties, ZERO_INTEGER );
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52736L)
  public static SubLObject tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy)
  {
    final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategy );
    return tact_strategic_properties_uninterestingness( tactic_strategic_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53041L)
  public static SubLObject set_tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy, final SubLObject uninterestingness)
  {
    assert NIL != uninterestingness_cache_value_p( uninterestingness ) : uninterestingness;
    final SubLObject tactic_strategic_properties = tactic_strategic_properties( tactic, strategy );
    _csetf_tact_strategic_properties_uninterestingness( tactic_strategic_properties, uninterestingness );
    return uninterestingness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53416L)
  public static SubLObject thrown_away_cache_status_from_uninterestingness(final SubLObject uninterestingness, final SubLObject conditions)
  {
    return cache_status_for_conditions( Vectors.aref( uninterestingness, ZERO_INTEGER ), conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53706L)
  public static SubLObject set_aside_cache_status_from_uninterestingness(final SubLObject uninterestingness, final SubLObject conditions)
  {
    return cache_status_for_conditions( Vectors.aref( uninterestingness, ONE_INTEGER ), conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53877L)
  public static SubLObject note_uninterestingness_cache_thrown_away_value(final SubLObject uninterestingness, final SubLObject value, final SubLObject conditions)
  {
    assert NIL != uninterestingness_cache_conditions_p( conditions ) : conditions;
    SubLObject cache_status = Vectors.aref( uninterestingness, ZERO_INTEGER );
    cache_status = modify_cache_status_for_value_and_conditions( cache_status, value, conditions );
    Vectors.set_aref( uninterestingness, ZERO_INTEGER, cache_status );
    return uninterestingness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54316L)
  public static SubLObject note_uninterestingness_cache_set_aside_value(final SubLObject uninterestingness, final SubLObject value, final SubLObject conditions)
  {
    assert NIL != uninterestingness_cache_conditions_p( conditions ) : conditions;
    SubLObject cache_status = Vectors.aref( uninterestingness, ONE_INTEGER );
    cache_status = modify_cache_status_for_value_and_conditions( cache_status, value, conditions );
    Vectors.set_aref( uninterestingness, ONE_INTEGER, cache_status );
    return uninterestingness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54710L)
  public static SubLObject uninterestingness_cache_value_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isVector() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != thrown_away_cache_value_p( Vectors.aref( v_object, ZERO_INTEGER ) )
        && NIL != set_aside_cache_value_p( Vectors.aref( v_object, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54924L)
  public static SubLObject uninterestingness_cache_conditions_p(final SubLObject v_object)
  {
    return makeBoolean( $kw153$ALL == v_object || ( v_object.isCons() && NIL != list_utilities.every_in_list( $sym185$BOOLEANP, v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55083L)
  public static SubLObject uninterestingness_cache_conditions_list_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && NIL != list_utilities.every_in_list( $sym184$UNINTERESTINGNESS_CACHE_CONDITIONS_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55249L)
  public static SubLObject thrown_away_cache_value_p(final SubLObject v_object)
  {
    return ignore_cache_value_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55340L)
  public static SubLObject set_aside_cache_value_p(final SubLObject v_object)
  {
    return ignore_cache_value_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55429L)
  public static SubLObject ignore_cache_value_p(final SubLObject v_object)
  {
    return makeBoolean( $kw116$RECOMPUTE == v_object || ( NIL != list_utilities.doubletonP( v_object ) && NIL != uninterestingness_cache_conditions_list_p( v_object.first() )
        && NIL != uninterestingness_cache_conditions_list_p( conses_high.second( v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55673L)
  public static SubLObject set_just_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = tactic_strategic_uninterestingness( tactic, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value( uninterestingness, T, conditions );
    return set_tactic_strategic_uninterestingness( tactic, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56027L)
  public static SubLObject set_just_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = tactic_strategic_uninterestingness( tactic, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value( uninterestingness, NIL, conditions );
    return set_tactic_strategic_uninterestingness( tactic, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56387L)
  public static SubLObject set_just_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy)
  {
    final SubLObject uninterestingness = tactic_strategic_uninterestingness( tactic, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value( uninterestingness, $kw116$RECOMPUTE, $kw153$ALL );
    return set_tactic_strategic_uninterestingness( tactic, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56791L)
  public static SubLObject set_just_tactic_set_aside(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = tactic_strategic_uninterestingness( tactic, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value( uninterestingness, T, conditions );
    return set_tactic_strategic_uninterestingness( tactic, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57141L)
  public static SubLObject set_just_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions)
  {
    final SubLObject uninterestingness = tactic_strategic_uninterestingness( tactic, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value( uninterestingness, NIL, conditions );
    return set_tactic_strategic_uninterestingness( tactic, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57497L)
  public static SubLObject set_just_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy)
  {
    final SubLObject uninterestingness = tactic_strategic_uninterestingness( tactic, strategy );
    final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value( uninterestingness, $kw116$RECOMPUTE, $kw153$ALL );
    return set_tactic_strategic_uninterestingness( tactic, strategy, new_uninterestingness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57849L)
  public static SubLObject tactic_thrown_away_cache_status(final SubLObject tactic, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return thrown_away_cache_status_from_uninterestingness( tactic_strategic_uninterestingness( tactic, strategy ), conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58117L)
  public static SubLObject tactic_set_aside_cache_status(final SubLObject tactic, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_aside_cache_status_from_uninterestingness( tactic_strategic_uninterestingness( tactic, strategy ), conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58367L)
  public static SubLObject set_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    set_just_tactic_thrown_away( tactic, strategy, conditions );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58918L)
  public static SubLObject set_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_just_tactic_not_thrown_away( tactic, strategy, conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59080L)
  public static SubLObject set_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy)
  {
    set_just_tactic_recompute_thrown_away( tactic, strategy );
    set_just_problem_recompute_thrown_away( inference_datastructures_tactic.tactic_problem( tactic ), strategy );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59607L)
  public static SubLObject set_tactic_set_aside(final SubLObject tactic, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    set_just_tactic_set_aside( tactic, strategy, conditions );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59931L)
  public static SubLObject set_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy, SubLObject conditions)
  {
    if( conditions == UNPROVIDED )
    {
      conditions = $kw153$ALL;
    }
    return set_just_tactic_not_set_aside( tactic, strategy, conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 60089L)
  public static SubLObject set_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy)
  {
    set_just_tactic_recompute_set_aside( tactic, strategy );
    if( NIL == strategy_continuableP( strategy ) && NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP( strategy ) )
    {
      set_just_tactic_recompute_thrown_away( tactic, strategy );
    }
    set_just_problem_recompute_set_aside( inference_datastructures_tactic.tactic_problem( tactic ), strategy );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 60831L)
  public static SubLObject set_problem_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem)
  {
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw186$SKIP ) )
    {
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$4, $kw186$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw186$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw186$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  set_problem_recompute_thrown_away( problem, strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$5 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$5 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$5 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  set_problem_recompute_thrown_away( problem, strategy2 );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61060L)
  public static SubLObject set_problem_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem)
  {
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw186$SKIP ) )
    {
      final SubLObject idx_$6 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw186$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw186$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw186$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  set_problem_recompute_set_aside( problem, strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$7 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$7 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  set_problem_recompute_set_aside( problem, strategy2 );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61271L)
  public static SubLObject set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject tactic)
  {
    final SubLObject prob = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject store = inference_datastructures_problem.problem_store( prob );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw186$SKIP ) )
    {
      final SubLObject idx_$8 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$8, $kw186$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$8 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw186$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw186$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  set_tactic_recompute_thrown_away( tactic, strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$9 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$9 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$9 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  set_tactic_recompute_thrown_away( tactic, strategy2 );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61480L)
  public static SubLObject set_tactic_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject tactic)
  {
    final SubLObject prob = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject store = inference_datastructures_problem.problem_store( prob );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw186$SKIP ) )
    {
      final SubLObject idx_$10 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$10, $kw186$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$10 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw186$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw186$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  set_tactic_recompute_set_aside( tactic, strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$11 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$11 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$11 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  set_tactic_recompute_set_aside( tactic, strategy2 );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61685L)
  public static SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem)
  {
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw186$SKIP ) )
    {
      final SubLObject idx_$12 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$12, $kw186$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$12 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw186$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw186$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  set_problem_tactics_recompute_thrown_away( problem, strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$13 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$13 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$13 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  set_problem_tactics_recompute_thrown_away( problem, strategy2 );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61916L)
  public static SubLObject set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem)
  {
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw186$SKIP ) )
    {
      final SubLObject idx_$14 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw186$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw186$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw186$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  set_problem_tactics_recompute_set_aside( problem, strategy );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$15 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$15 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  set_problem_tactics_recompute_set_aside( problem, strategy2 );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62143L)
  public static SubLObject set_problem_tactics_recompute_thrown_away(final SubLObject problem, final SubLObject strategy)
  {
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set_just_tactic_recompute_thrown_away( tactic, strategy );
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    set_just_problem_recompute_thrown_away( problem, strategy );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62396L)
  public static SubLObject set_problem_tactics_recompute_set_aside(final SubLObject problem, final SubLObject strategy)
  {
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set_just_tactic_recompute_set_aside( tactic, strategy );
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    set_just_problem_recompute_set_aside( problem, strategy );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62906L)
  public static SubLObject cache_status_known_for_conditionsP(final SubLObject cache_status, final SubLObject value, final SubLObject conditions)
  {
    return Equality.eq( value, cache_status_for_conditions( cache_status, conditions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 63150L)
  public static SubLObject cache_status_for_conditions(final SubLObject cache_status, final SubLObject conditions)
  {
    if( cache_status == $kw116$RECOMPUTE )
    {
      return $kw116$RECOMPUTE;
    }
    if( cache_status.eql( $default_uninterestingness_cache_value$.getGlobalValue() ) )
    {
      return $kw116$RECOMPUTE;
    }
    if( NIL != any_conditions_implyP( ConsesLow.nth( ZERO_INTEGER, cache_status ), conditions, NIL ) )
    {
      return T;
    }
    if( NIL != any_conditions_implyP( ConsesLow.nth( ONE_INTEGER, cache_status ), conditions, T ) )
    {
      return NIL;
    }
    return $kw116$RECOMPUTE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 63624L)
  public static SubLObject modify_cache_status_for_value_and_conditions(SubLObject cache_status, final SubLObject value, final SubLObject conditions)
  {
    if( value == $kw116$RECOMPUTE )
    {
      cache_status = $default_uninterestingness_cache_value$.getGlobalValue();
    }
    else if( NIL == cache_status_known_for_conditionsP( cache_status, value, conditions ) )
    {
      if( cache_status == $kw116$RECOMPUTE || cache_status.eql( $default_uninterestingness_cache_value$.getGlobalValue() ) )
      {
        cache_status = conses_high.copy_list( $default_uninterestingness_cache_value$.getGlobalValue() );
      }
      final SubLObject conditions_nth = ( NIL != value ) ? ZERO_INTEGER : ONE_INTEGER;
      final SubLObject current_conditions_list = ConsesLow.nth( conditions_nth, cache_status );
      SubLObject new_conditions_list = NIL;
      if( conditions == $kw153$ALL )
      {
        new_conditions_list = ConsesLow.list( $kw153$ALL );
      }
      else
      {
        new_conditions_list = ConsesLow.cons( conditions, new_conditions_list );
        SubLObject cdolist_list_var = current_conditions_list;
        SubLObject current_conditions = NIL;
        current_conditions = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == conditions_implyP( conditions, current_conditions, makeBoolean( NIL == value ) ) )
          {
            new_conditions_list = ConsesLow.cons( current_conditions, new_conditions_list );
          }
          cdolist_list_var = cdolist_list_var.rest();
          current_conditions = cdolist_list_var.first();
        }
      }
      ConsesLow.set_nth( conditions_nth, cache_status, new_conditions_list );
    }
    return cache_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 64845L)
  public static SubLObject any_conditions_implyP(final SubLObject p_conditions_list, final SubLObject q_conditions, final SubLObject negP)
  {
    SubLObject cdolist_list_var = p_conditions_list;
    SubLObject p_conditions = NIL;
    p_conditions = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conditions_implyP( p_conditions, q_conditions, negP ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      p_conditions = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 65277L)
  public static SubLObject conditions_implyP(final SubLObject p_conditions, final SubLObject q_conditions, SubLObject negP)
  {
    if( negP == UNPROVIDED )
    {
      negP = NIL;
    }
    if( p_conditions == $kw153$ALL )
    {
      return T;
    }
    if( q_conditions == $kw153$ALL )
    {
      return NIL;
    }
    return ( NIL == negP ) ? conditions_booleanly_implyP( p_conditions, q_conditions ) : conditions_booleanly_implyP( q_conditions, p_conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 66074L)
  public static SubLObject conditions_booleanly_implyP(final SubLObject p_conditions, final SubLObject q_conditions)
  {
    SubLObject p_condition = NIL;
    SubLObject p_condition_$16 = NIL;
    SubLObject q_condition = NIL;
    SubLObject q_condition_$17 = NIL;
    p_condition = p_conditions;
    p_condition_$16 = p_condition.first();
    q_condition = q_conditions;
    q_condition_$17 = q_condition.first();
    while ( NIL != q_condition || NIL != p_condition)
    {
      if( NIL != p_condition_$16 && NIL == q_condition_$17 )
      {
        return NIL;
      }
      p_condition = p_condition.rest();
      p_condition_$16 = p_condition.first();
      q_condition = q_condition.rest();
      q_condition_$17 = q_condition.first();
    }
    return T;
  }

  public static SubLObject declare_inference_datastructures_strategy_file()
  {
    SubLFiles.declareFunction( me, "strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_p", "STRATEGY-P", 1, 0, false );
    new $strategy_p$UnaryFunction();
    SubLFiles.declareFunction( me, "strat_suid", "STRAT-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_inference", "STRAT-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_removal_backtracking_productivity_limit", "STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_step_count", "STRAT-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_type", "STRAT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "strat_data", "STRAT-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_removal_backtracking_productivity_limit", "_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_step_count", "_CSETF-STRAT-STEP-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_strategy", "MAKE-STRATEGY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_strategy", "VISIT-DEFSTRUCT-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_strategy_method", "VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_strategy", "PRINT-STRATEGY", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false );
    new $sxhash_strategy_method$UnaryFunction();
    SubLFiles.declareFunction( me, "new_strategy", "NEW-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "destroy_strategy", "DESTROY-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_suid", "STRATEGY-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_inference", "STRATEGY-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_type", "STRATEGY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_data", "STRATEGY-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_removal_backtracking_productivity_limit", "STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_step_count", "STRATEGY-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_removal_backtracking_productivity_limit", "SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false );
    SubLFiles.declareMacro( me, "do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS" );
    SubLFiles.declareMacro( me, "do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS" );
    SubLFiles.declareMacro( me, "do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS" );
    SubLFiles.declareMacro( me, "with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE" );
    SubLFiles.declareFunction( me, "strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false );
    SubLFiles.declareFunction( me, "strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "copy_strategy_properties", "COPY-STRATEGY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false );
    SubLFiles.declareFunction( me, "note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_strategy_should_reconsider_set_asides", "CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false );
    SubLFiles.declareMacro( me, "with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM" );
    SubLFiles.declareFunction( me, "strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "increment_strategy_step_count", "INCREMENT-STRATEGY-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false );
    SubLFiles.declareFunction( me, "strategy_dispatch_unexpected_strategy_type_error", "STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false );
    SubLFiles.declareFunction( me, "strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "default_uninterestingness_cache_value", "DEFAULT-UNINTERESTINGNESS-CACHE-VALUE", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_properties_print_function_trampoline", "PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false );
    new $problem_strategic_properties_p$UnaryFunction();
    SubLFiles.declareFunction( me, "prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_strategic_properties_tactic_strategic_property_index", "PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_strategic_properties_possible_tactic_count", "PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_strategic_properties_uninterestingness", "PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_strategic_properties_tactic_strategic_property_index", "_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_strategic_properties_possible_tactic_count", "_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_strategic_properties_uninterestingness", "_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_problem_strategic_properties", "VISIT-DEFSTRUCT-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_problem_strategic_properties_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_properties_tactic_strategic_property_index", "PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_dwimmed_strategic_status", "PROBLEM-DWIMMED-STRATEGIC-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_weak_strategic_status", "PROBLEM-WEAK-STRATEGIC-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false );
    SubLFiles.declareFunction( me, "strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_potentially_possible_problem_p", "STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_not_potentially_possible_problem_p", "STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategic_uninterestingness", "PROBLEM-STRATEGIC-UNINTERESTINGNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_strategic_uninterestingness", "SET-PROBLEM-STRATEGIC-UNINTERESTINGNESS", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_problem_thrown_away", "SET-JUST-PROBLEM-THROWN-AWAY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_problem_not_thrown_away", "SET-JUST-PROBLEM-NOT-THROWN-AWAY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_problem_recompute_thrown_away", "SET-JUST-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_just_problem_set_aside", "SET-JUST-PROBLEM-SET-ASIDE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_problem_not_set_aside", "SET-JUST-PROBLEM-NOT-SET-ASIDE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_problem_recompute_set_aside", "SET-JUST-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 1, false );
    SubLFiles.declareFunction( me, "problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 1, false );
    SubLFiles.declareFunction( me, "set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 1, false );
    SubLFiles.declareFunction( me, "set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 1, false );
    SubLFiles.declareFunction( me, "set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 1, false );
    SubLFiles.declareFunction( me, "set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 1, false );
    SubLFiles.declareFunction( me, "set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_properties_print_function_trampoline", "TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false );
    new $tactic_strategic_properties_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "tact_strategic_properties_preference_level_justification", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "tact_strategic_properties_uninterestingness", "TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tact_strategic_properties_preference_level", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tact_strategic_properties_preference_level_justification", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tact_strategic_properties_productivity", "_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tact_strategic_properties_uninterestingness", "_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_tactic_strategic_properties", "VISIT-DEFSTRUCT-TACTIC-STRATEGIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_tactic_strategic_properties_method", "VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_preference_level_justification", "TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_tactic_strategic_preference_level", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_tactic_strategic_preference_level_justification", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false );
    SubLFiles.declareFunction( me, "problem_strategically_possible_tactic_count", "PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "problem_note_tactic_not_strategically_possible", "PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "problem_note_all_tactics_not_strategically_possible", "PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_strategic_uninterestingness", "TACTIC-STRATEGIC-UNINTERESTINGNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_strategic_uninterestingness", "SET-TACTIC-STRATEGIC-UNINTERESTINGNESS", 3, 0, false );
    SubLFiles.declareFunction( me, "thrown_away_cache_status_from_uninterestingness", "THROWN-AWAY-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_aside_cache_status_from_uninterestingness", "SET-ASIDE-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "note_uninterestingness_cache_thrown_away_value", "NOTE-UNINTERESTINGNESS-CACHE-THROWN-AWAY-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "note_uninterestingness_cache_set_aside_value", "NOTE-UNINTERESTINGNESS-CACHE-SET-ASIDE-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "uninterestingness_cache_value_p", "UNINTERESTINGNESS-CACHE-VALUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "uninterestingness_cache_conditions_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "uninterestingness_cache_conditions_list_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "thrown_away_cache_value_p", "THROWN-AWAY-CACHE-VALUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_aside_cache_value_p", "SET-ASIDE-CACHE-VALUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ignore_cache_value_p", "IGNORE-CACHE-VALUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_just_tactic_thrown_away", "SET-JUST-TACTIC-THROWN-AWAY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_tactic_not_thrown_away", "SET-JUST-TACTIC-NOT-THROWN-AWAY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_tactic_recompute_thrown_away", "SET-JUST-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_just_tactic_set_aside", "SET-JUST-TACTIC-SET-ASIDE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_tactic_not_set_aside", "SET-JUST-TACTIC-NOT-SET-ASIDE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_just_tactic_recompute_set_aside", "SET-JUST-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 1, false );
    SubLFiles.declareFunction( me, "tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 1, false );
    SubLFiles.declareFunction( me, "set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 1, false );
    SubLFiles.declareFunction( me, "set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 1, false );
    SubLFiles.declareFunction( me, "set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 1, false );
    SubLFiles.declareFunction( me, "set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 1, false );
    SubLFiles.declareFunction( me, "set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_recompute_thrown_away_wrt_all_relevant_strategies", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_problem_recompute_set_aside_wrt_all_relevant_strategies", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_recompute_thrown_away_wrt_all_relevant_strategies", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tactic_recompute_set_aside_wrt_all_relevant_strategies", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_problem_tactics_recompute_thrown_away", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY", 2, 0, false );
    SubLFiles.declareFunction( me, "set_problem_tactics_recompute_set_aside", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_status_known_for_conditionsP", "CACHE-STATUS-KNOWN-FOR-CONDITIONS?", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_status_for_conditions", "CACHE-STATUS-FOR-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "modify_cache_status_for_value_and_conditions", "MODIFY-CACHE-STATUS-FOR-VALUE-AND-CONDITIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "any_conditions_implyP", "ANY-CONDITIONS-IMPLY?", 3, 0, false );
    SubLFiles.declareFunction( me, "conditions_implyP", "CONDITIONS-IMPLY?", 2, 1, false );
    SubLFiles.declareFunction( me, "conditions_booleanly_implyP", "CONDITIONS-BOOLEANLY-IMPLY?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_datastructures_strategy_file()
  {
    $dtp_strategy$ = SubLFiles.defconstant( "*DTP-STRATEGY*", $sym0$STRATEGY );
    $current_strategy_wrt_memoization$ = SubLFiles.defparameter( "*CURRENT-STRATEGY-WRT-MEMOIZATION*", NIL );
    $strategy_type_store$ = SubLFiles.deflexical( "*STRATEGY-TYPE-STORE*", maybeDefault( $sym113$_STRATEGY_TYPE_STORE_, $strategy_type_store$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ),
        FIVE_INTEGER ) ) ) );
    $uninterestingness_cache_lookup_enabledP$ = SubLFiles.defparameter( "*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", T );
    $dtp_problem_strategic_properties$ = SubLFiles.defconstant( "*DTP-PROBLEM-STRATEGIC-PROPERTIES*", $sym117$PROBLEM_STRATEGIC_PROPERTIES );
    $dtp_tactic_strategic_properties$ = SubLFiles.defconstant( "*DTP-TACTIC-STRATEGIC-PROPERTIES*", $sym154$TACTIC_STRATEGIC_PROPERTIES );
    $default_uninterestingness_cache_value$ = SubLFiles.deflexical( "*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*", ConsesLow.list( NIL, NIL ) );
    return NIL;
  }

  public static SubLObject setup_inference_datastructures_strategy_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), Symbols.symbol_function( $sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$STRAT_SUID, $sym10$_CSETF_STRAT_SUID );
    Structures.def_csetf( $sym11$STRAT_INFERENCE, $sym12$_CSETF_STRAT_INFERENCE );
    Structures.def_csetf( $sym13$STRAT_RESULT_UNIQUENESS_CRITERION, $sym14$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION );
    Structures.def_csetf( $sym15$STRAT_ACTIVE_PROBLEMS, $sym16$_CSETF_STRAT_ACTIVE_PROBLEMS );
    Structures.def_csetf( $sym17$STRAT_MOTIVATED_PROBLEMS, $sym18$_CSETF_STRAT_MOTIVATED_PROBLEMS );
    Structures.def_csetf( $sym19$STRAT_SET_ASIDE_PROBLEMS, $sym20$_CSETF_STRAT_SET_ASIDE_PROBLEMS );
    Structures.def_csetf( $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_, $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ );
    Structures.def_csetf( $sym23$STRAT_PRODUCTIVITY_LIMIT, $sym24$_CSETF_STRAT_PRODUCTIVITY_LIMIT );
    Structures.def_csetf( $sym25$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, $sym26$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT );
    Structures.def_csetf( $sym27$STRAT_PROOF_SPEC, $sym28$_CSETF_STRAT_PROOF_SPEC );
    Structures.def_csetf( $sym29$STRAT_PROBLEM_PROOF_SPEC_INDEX, $sym30$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX );
    Structures.def_csetf( $sym31$STRAT_PROBLEM_STRATEGIC_INDEX, $sym32$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX );
    Structures.def_csetf( $sym33$STRAT_MEMOIZATION_STATE, $sym34$_CSETF_STRAT_MEMOIZATION_STATE );
    Structures.def_csetf( $sym35$STRAT_STEP_COUNT, $sym36$_CSETF_STRAT_STEP_COUNT );
    Structures.def_csetf( $sym37$STRAT_TYPE, $sym38$_CSETF_STRAT_TYPE );
    Structures.def_csetf( $sym39$STRAT_DATA, $sym40$_CSETF_STRAT_DATA );
    Equality.identity( $sym0$STRATEGY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), Symbols.symbol_function( $sym62$VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), Symbols.symbol_function( $sym66$SXHASH_STRATEGY_METHOD ) );
    access_macros.register_macro_helper( $sym71$STRATEGY_ACTIVE_PROBLEMS, $sym72$DO_STRATEGY_ACTIVE_PROBLEMS );
    access_macros.register_macro_helper( $sym73$STRATEGY_MOTIVATED_PROBLEMS, $sym74$DO_STRATEGY_MOTIVATED_PROBLEMS );
    access_macros.register_macro_helper( $sym75$STRATEGY_SET_ASIDE_PROBLEMS, $sym76$DO_STRATEGY_SET_ASIDE_PROBLEMS );
    access_macros.register_macro_helper( $sym90$STRATEGY_MEMOIZATION_STATE, $sym93$WITH_STRATEGY_MEMOIZATION_STATE );
    access_macros.register_macro_helper( $sym94$CURRENT_STRATEGY_WRT_MEMOIZATION, $sym93$WITH_STRATEGY_MEMOIZATION_STATE );
    subl_macro_promotions.declare_defglobal( $sym113$_STRATEGY_TYPE_STORE_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_strategic_properties$.getGlobalValue(), Symbols.symbol_function(
        $sym124$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list125 );
    Structures.def_csetf( $sym126$PROB_STRATEGIC_PROPERTIES_STATUS, $sym127$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS );
    Structures.def_csetf( $sym128$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX, $sym129$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX );
    Structures.def_csetf( $sym130$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT, $sym131$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT );
    Structures.def_csetf( $sym132$PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS, $sym133$_CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS );
    Equality.identity( $sym117$PROBLEM_STRATEGIC_PROPERTIES );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_strategic_properties$.getGlobalValue(), Symbols.symbol_function(
        $sym139$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_tactic_strategic_properties$.getGlobalValue(), Symbols.symbol_function(
        $sym160$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list161 );
    Structures.def_csetf( $sym162$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL, $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL );
    Structures.def_csetf( $sym164$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION, $sym165$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION );
    Structures.def_csetf( $sym166$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY, $sym167$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY );
    Structures.def_csetf( $sym168$TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS, $sym169$_CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS );
    Equality.identity( $sym154$TACTIC_STRATEGIC_PROPERTIES );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tactic_strategic_properties$.getGlobalValue(), Symbols.symbol_function(
        $sym174$VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_datastructures_strategy_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_datastructures_strategy_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_datastructures_strategy_file();
  }
  static
  {
    me = new inference_datastructures_strategy();
    $dtp_strategy$ = null;
    $current_strategy_wrt_memoization$ = null;
    $strategy_type_store$ = null;
    $uninterestingness_cache_lookup_enabledP$ = null;
    $dtp_problem_strategic_properties$ = null;
    $dtp_tactic_strategic_properties$ = null;
    $default_uninterestingness_cache_value$ = null;
    $sym0$STRATEGY = makeSymbol( "STRATEGY" );
    $sym1$STRATEGY_P = makeSymbol( "STRATEGY-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "SUID" ), makeSymbol( "INFERENCE" ), makeSymbol( "RESULT-UNIQUENESS-CRITERION" ), makeSymbol( "ACTIVE-PROBLEMS" ), makeSymbol( "MOTIVATED-PROBLEMS" ),
      makeSymbol( "SET-ASIDE-PROBLEMS" ), makeSymbol( "SHOULD-RECONSIDER-SET-ASIDES?" ), makeSymbol( "PRODUCTIVITY-LIMIT" ), makeSymbol( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeSymbol( "PROOF-SPEC" ),
      makeSymbol( "PROBLEM-PROOF-SPEC-INDEX" ), makeSymbol( "PROBLEM-STRATEGIC-INDEX" ), makeSymbol( "MEMOIZATION-STATE" ), makeSymbol( "STEP-COUNT" ), makeSymbol( "TYPE" ), makeSymbol( "DATA" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SUID" ), makeKeyword( "INFERENCE" ), makeKeyword( "RESULT-UNIQUENESS-CRITERION" ), makeKeyword( "ACTIVE-PROBLEMS" ), makeKeyword( "MOTIVATED-PROBLEMS" ),
      makeKeyword( "SET-ASIDE-PROBLEMS" ), makeKeyword( "SHOULD-RECONSIDER-SET-ASIDES?" ), makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeKeyword( "PROOF-SPEC" ),
      makeKeyword( "PROBLEM-PROOF-SPEC-INDEX" ), makeKeyword( "PROBLEM-STRATEGIC-INDEX" ), makeKeyword( "MEMOIZATION-STATE" ), makeKeyword( "STEP-COUNT" ), makeKeyword( "TYPE" ), makeKeyword( "DATA" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "STRAT-SUID" ), makeSymbol( "STRAT-INFERENCE" ), makeSymbol( "STRAT-RESULT-UNIQUENESS-CRITERION" ), makeSymbol( "STRAT-ACTIVE-PROBLEMS" ), makeSymbol(
        "STRAT-MOTIVATED-PROBLEMS" ), makeSymbol( "STRAT-SET-ASIDE-PROBLEMS" ), makeSymbol( "STRAT-SHOULD-RECONSIDER-SET-ASIDES?" ), makeSymbol( "STRAT-PRODUCTIVITY-LIMIT" ), makeSymbol(
            "STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeSymbol( "STRAT-PROOF-SPEC" ), makeSymbol( "STRAT-PROBLEM-PROOF-SPEC-INDEX" ), makeSymbol( "STRAT-PROBLEM-STRATEGIC-INDEX" ), makeSymbol(
                "STRAT-MEMOIZATION-STATE" ), makeSymbol( "STRAT-STEP-COUNT" ), makeSymbol( "STRAT-TYPE" ), makeSymbol( "STRAT-DATA" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-STRAT-SUID" ), makeSymbol( "_CSETF-STRAT-INFERENCE" ), makeSymbol( "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION" ), makeSymbol(
        "_CSETF-STRAT-ACTIVE-PROBLEMS" ), makeSymbol( "_CSETF-STRAT-MOTIVATED-PROBLEMS" ), makeSymbol( "_CSETF-STRAT-SET-ASIDE-PROBLEMS" ), makeSymbol( "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?" ), makeSymbol(
            "_CSETF-STRAT-PRODUCTIVITY-LIMIT" ), makeSymbol( "_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeSymbol( "_CSETF-STRAT-PROOF-SPEC" ), makeSymbol( "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX" ),
      makeSymbol( "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX" ), makeSymbol( "_CSETF-STRAT-MEMOIZATION-STATE" ), makeSymbol( "_CSETF-STRAT-STEP-COUNT" ), makeSymbol( "_CSETF-STRAT-TYPE" ), makeSymbol( "_CSETF-STRAT-DATA" )
    } );
    $sym6$PRINT_STRATEGY = makeSymbol( "PRINT-STRATEGY" );
    $sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "STRATEGY-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "STRATEGY-P" ) );
    $sym9$STRAT_SUID = makeSymbol( "STRAT-SUID" );
    $sym10$_CSETF_STRAT_SUID = makeSymbol( "_CSETF-STRAT-SUID" );
    $sym11$STRAT_INFERENCE = makeSymbol( "STRAT-INFERENCE" );
    $sym12$_CSETF_STRAT_INFERENCE = makeSymbol( "_CSETF-STRAT-INFERENCE" );
    $sym13$STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol( "STRAT-RESULT-UNIQUENESS-CRITERION" );
    $sym14$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol( "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION" );
    $sym15$STRAT_ACTIVE_PROBLEMS = makeSymbol( "STRAT-ACTIVE-PROBLEMS" );
    $sym16$_CSETF_STRAT_ACTIVE_PROBLEMS = makeSymbol( "_CSETF-STRAT-ACTIVE-PROBLEMS" );
    $sym17$STRAT_MOTIVATED_PROBLEMS = makeSymbol( "STRAT-MOTIVATED-PROBLEMS" );
    $sym18$_CSETF_STRAT_MOTIVATED_PROBLEMS = makeSymbol( "_CSETF-STRAT-MOTIVATED-PROBLEMS" );
    $sym19$STRAT_SET_ASIDE_PROBLEMS = makeSymbol( "STRAT-SET-ASIDE-PROBLEMS" );
    $sym20$_CSETF_STRAT_SET_ASIDE_PROBLEMS = makeSymbol( "_CSETF-STRAT-SET-ASIDE-PROBLEMS" );
    $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol( "STRAT-SHOULD-RECONSIDER-SET-ASIDES?" );
    $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol( "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?" );
    $sym23$STRAT_PRODUCTIVITY_LIMIT = makeSymbol( "STRAT-PRODUCTIVITY-LIMIT" );
    $sym24$_CSETF_STRAT_PRODUCTIVITY_LIMIT = makeSymbol( "_CSETF-STRAT-PRODUCTIVITY-LIMIT" );
    $sym25$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol( "STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" );
    $sym26$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol( "_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" );
    $sym27$STRAT_PROOF_SPEC = makeSymbol( "STRAT-PROOF-SPEC" );
    $sym28$_CSETF_STRAT_PROOF_SPEC = makeSymbol( "_CSETF-STRAT-PROOF-SPEC" );
    $sym29$STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol( "STRAT-PROBLEM-PROOF-SPEC-INDEX" );
    $sym30$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol( "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX" );
    $sym31$STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol( "STRAT-PROBLEM-STRATEGIC-INDEX" );
    $sym32$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol( "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX" );
    $sym33$STRAT_MEMOIZATION_STATE = makeSymbol( "STRAT-MEMOIZATION-STATE" );
    $sym34$_CSETF_STRAT_MEMOIZATION_STATE = makeSymbol( "_CSETF-STRAT-MEMOIZATION-STATE" );
    $sym35$STRAT_STEP_COUNT = makeSymbol( "STRAT-STEP-COUNT" );
    $sym36$_CSETF_STRAT_STEP_COUNT = makeSymbol( "_CSETF-STRAT-STEP-COUNT" );
    $sym37$STRAT_TYPE = makeSymbol( "STRAT-TYPE" );
    $sym38$_CSETF_STRAT_TYPE = makeSymbol( "_CSETF-STRAT-TYPE" );
    $sym39$STRAT_DATA = makeSymbol( "STRAT-DATA" );
    $sym40$_CSETF_STRAT_DATA = makeSymbol( "_CSETF-STRAT-DATA" );
    $kw41$SUID = makeKeyword( "SUID" );
    $kw42$INFERENCE = makeKeyword( "INFERENCE" );
    $kw43$RESULT_UNIQUENESS_CRITERION = makeKeyword( "RESULT-UNIQUENESS-CRITERION" );
    $kw44$ACTIVE_PROBLEMS = makeKeyword( "ACTIVE-PROBLEMS" );
    $kw45$MOTIVATED_PROBLEMS = makeKeyword( "MOTIVATED-PROBLEMS" );
    $kw46$SET_ASIDE_PROBLEMS = makeKeyword( "SET-ASIDE-PROBLEMS" );
    $kw47$SHOULD_RECONSIDER_SET_ASIDES_ = makeKeyword( "SHOULD-RECONSIDER-SET-ASIDES?" );
    $kw48$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $kw49$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" );
    $kw50$PROOF_SPEC = makeKeyword( "PROOF-SPEC" );
    $kw51$PROBLEM_PROOF_SPEC_INDEX = makeKeyword( "PROBLEM-PROOF-SPEC-INDEX" );
    $kw52$PROBLEM_STRATEGIC_INDEX = makeKeyword( "PROBLEM-STRATEGIC-INDEX" );
    $kw53$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $kw54$STEP_COUNT = makeKeyword( "STEP-COUNT" );
    $kw55$TYPE = makeKeyword( "TYPE" );
    $kw56$DATA = makeKeyword( "DATA" );
    $str57$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw58$BEGIN = makeKeyword( "BEGIN" );
    $sym59$MAKE_STRATEGY = makeSymbol( "MAKE-STRATEGY" );
    $kw60$SLOT = makeKeyword( "SLOT" );
    $kw61$END = makeKeyword( "END" );
    $sym62$VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD" );
    $kw63$FREE = makeKeyword( "FREE" );
    $str64$_Invalid_STRATEGY__s_ = makeString( "<Invalid STRATEGY ~s>" );
    $str65$__a_STRATEGY__a__a_for_inference_ = makeString( "<~a STRATEGY ~a.~a for inference ~a.~a>" );
    $sym66$SXHASH_STRATEGY_METHOD = makeSymbol( "SXHASH-STRATEGY-METHOD" );
    $sym67$STRATEGY_TYPE_P = makeSymbol( "STRATEGY-TYPE-P" );
    $sym68$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $str69$strategy_memoization_state = makeString( "strategy memoization state" );
    $kw70$CONSTRUCTOR = makeKeyword( "CONSTRUCTOR" );
    $sym71$STRATEGY_ACTIVE_PROBLEMS = makeSymbol( "STRATEGY-ACTIVE-PROBLEMS" );
    $sym72$DO_STRATEGY_ACTIVE_PROBLEMS = makeSymbol( "DO-STRATEGY-ACTIVE-PROBLEMS" );
    $sym73$STRATEGY_MOTIVATED_PROBLEMS = makeSymbol( "STRATEGY-MOTIVATED-PROBLEMS" );
    $sym74$DO_STRATEGY_MOTIVATED_PROBLEMS = makeSymbol( "DO-STRATEGY-MOTIVATED-PROBLEMS" );
    $sym75$STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol( "STRATEGY-SET-ASIDE-PROBLEMS" );
    $sym76$DO_STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol( "DO-STRATEGY-SET-ASIDE-PROBLEMS" );
    $sym77$RESULT_UNIQUENESS_CRITERION_P = makeSymbol( "RESULT-UNIQUENESS-CRITERION-P" );
    $sym78$PRODUCTIVITY_P = makeSymbol( "PRODUCTIVITY-P" );
    $sym79$PROOF_SPEC_P = makeSymbol( "PROOF-SPEC-P" );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-VAR" ), makeSymbol( "STRATEGY" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list81 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw82$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw83$DONE = makeKeyword( "DONE" );
    $sym84$DO_SET = makeSymbol( "DO-SET" );
    $sym85$DO_SET_CONTENTS = makeSymbol( "DO-SET-CONTENTS" );
    $list86 = ConsesLow.list( makeSymbol( "STRATEGY" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym87$STRATEGY_VAR = makeUninternedSymbol( "STRATEGY-VAR" );
    $sym88$STATE_VAR = makeUninternedSymbol( "STATE-VAR" );
    $sym89$CLET = makeSymbol( "CLET" );
    $sym90$STRATEGY_MEMOIZATION_STATE = makeSymbol( "STRATEGY-MEMOIZATION-STATE" );
    $sym91$_CURRENT_STRATEGY_WRT_MEMOIZATION_ = makeSymbol( "*CURRENT-STRATEGY-WRT-MEMOIZATION*" );
    $sym92$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $sym93$WITH_STRATEGY_MEMOIZATION_STATE = makeSymbol( "WITH-STRATEGY-MEMOIZATION-STATE" );
    $sym94$CURRENT_STRATEGY_WRT_MEMOIZATION = makeSymbol( "CURRENT-STRATEGY-WRT-MEMOIZATION" );
    $sym95$VALID_PROBLEM_P = makeSymbol( "VALID-PROBLEM-P" );
    $kw96$PROOF = makeKeyword( "PROOF" );
    $kw97$BINDINGS = makeKeyword( "BINDINGS" );
    $sym98$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $kw99$ANYTHING = makeKeyword( "ANYTHING" );
    $sym100$STRATEGY_PROPERTY_P = makeSymbol( "STRATEGY-PROPERTY-P" );
    $str101$Unexpected_strategy_property__s_w = makeString( "Unexpected strategy property ~s with value ~s" );
    $sym102$STRATEGY_PROPERTIES_P = makeSymbol( "STRATEGY-PROPERTIES-P" );
    $kw103$SUBSTRATEGY_STRATEGEM_MOTIVATED = makeKeyword( "SUBSTRATEGY-STRATEGEM-MOTIVATED" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRATEGY" ), makeSymbol( "PROBLEM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym105$STRATEGY_VAR = makeUninternedSymbol( "STRATEGY-VAR" );
    $sym106$PROBLEM_VAR = makeUninternedSymbol( "PROBLEM-VAR" );
    $sym107$STRATEGY_NOTE_PROBLEM_ACTIVE = makeSymbol( "STRATEGY-NOTE-PROBLEM-ACTIVE" );
    $sym108$STRATEGY_NOTE_PROBLEM_INACTIVE = makeSymbol( "STRATEGY-NOTE-PROBLEM-INACTIVE" );
    $sym109$POSSIBLY_REACTIVATE_PROBLEM = makeSymbol( "POSSIBLY-REACTIVATE-PROBLEM" );
    $kw110$NOTHING = makeKeyword( "NOTHING" );
    $str111$balancing_tactician_does_not_impl = makeString( "balancing tactician does not implement ~a" );
    $str112$Unexpected_strategy_type__a = makeString( "Unexpected strategy type ~a" );
    $sym113$_STRATEGY_TYPE_STORE_ = makeSymbol( "*STRATEGY-TYPE-STORE*" );
    $sym114$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym115$STRATEGY_TYPE_PROPERTY_P = makeSymbol( "STRATEGY-TYPE-PROPERTY-P" );
    $kw116$RECOMPUTE = makeKeyword( "RECOMPUTE" );
    $sym117$PROBLEM_STRATEGIC_PROPERTIES = makeSymbol( "PROBLEM-STRATEGIC-PROPERTIES" );
    $sym118$PROBLEM_STRATEGIC_PROPERTIES_P = makeSymbol( "PROBLEM-STRATEGIC-PROPERTIES-P" );
    $list119 = ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "TACTIC-STRATEGIC-PROPERTY-INDEX" ), makeSymbol( "POSSIBLE-TACTIC-COUNT" ), makeSymbol( "UNINTERESTINGNESS" ) );
    $list120 = ConsesLow.list( makeKeyword( "STATUS" ), makeKeyword( "TACTIC-STRATEGIC-PROPERTY-INDEX" ), makeKeyword( "POSSIBLE-TACTIC-COUNT" ), makeKeyword( "UNINTERESTINGNESS" ) );
    $list121 = ConsesLow.list( makeSymbol( "PROB-STRATEGIC-PROPERTIES-STATUS" ), makeSymbol( "PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX" ), makeSymbol( "PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT" ),
        makeSymbol( "PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" ) );
    $list122 = ConsesLow.list( makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS" ), makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX" ), makeSymbol(
        "_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT" ), makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" ) );
    $sym123$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym124$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE" );
    $list125 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROBLEM-STRATEGIC-PROPERTIES-P" ) );
    $sym126$PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol( "PROB-STRATEGIC-PROPERTIES-STATUS" );
    $sym127$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS" );
    $sym128$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol( "PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX" );
    $sym129$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX" );
    $sym130$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol( "PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT" );
    $sym131$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT" );
    $sym132$PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol( "PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" );
    $sym133$_CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol( "_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" );
    $kw134$STATUS = makeKeyword( "STATUS" );
    $kw135$TACTIC_STRATEGIC_PROPERTY_INDEX = makeKeyword( "TACTIC-STRATEGIC-PROPERTY-INDEX" );
    $kw136$POSSIBLE_TACTIC_COUNT = makeKeyword( "POSSIBLE-TACTIC-COUNT" );
    $kw137$UNINTERESTINGNESS = makeKeyword( "UNINTERESTINGNESS" );
    $sym138$MAKE_PROBLEM_STRATEGIC_PROPERTIES = makeSymbol( "MAKE-PROBLEM-STRATEGIC-PROPERTIES" );
    $sym139$VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD" );
    $kw140$NEW = makeKeyword( "NEW" );
    $kw141$UNEXAMINED = makeKeyword( "UNEXAMINED" );
    $kw142$FINISHED = makeKeyword( "FINISHED" );
    $kw143$NEUTRAL = makeKeyword( "NEUTRAL" );
    $kw144$NO_GOOD = makeKeyword( "NO-GOOD" );
    $sym145$STRATEGIC_CONTEXT_P = makeSymbol( "STRATEGIC-CONTEXT-P" );
    $str146$poking_good_status__s_into_proble = makeString( "poking good status ~s into problem ~s wrt strategy ~s" );
    $kw147$POSSIBLE_NO_GOOD = makeKeyword( "POSSIBLE-NO-GOOD" );
    $str148$_possible_no_good__s_wrt__s = makeString( ":possible-no-good ~s wrt ~s" );
    $kw149$EXAMINED = makeKeyword( "EXAMINED" );
    $kw150$POSSIBLE = makeKeyword( "POSSIBLE" );
    $kw151$PENDING = makeKeyword( "PENDING" );
    $sym152$UNINTERESTINGNESS_CACHE_VALUE_P = makeSymbol( "UNINTERESTINGNESS-CACHE-VALUE-P" );
    $kw153$ALL = makeKeyword( "ALL" );
    $sym154$TACTIC_STRATEGIC_PROPERTIES = makeSymbol( "TACTIC-STRATEGIC-PROPERTIES" );
    $sym155$TACTIC_STRATEGIC_PROPERTIES_P = makeSymbol( "TACTIC-STRATEGIC-PROPERTIES-P" );
    $list156 = ConsesLow.list( makeSymbol( "PREFERENCE-LEVEL" ), makeSymbol( "PREFERENCE-LEVEL-JUSTIFICATION" ), makeSymbol( "PRODUCTIVITY" ), makeSymbol( "UNINTERESTINGNESS" ) );
    $list157 = ConsesLow.list( makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "PREFERENCE-LEVEL-JUSTIFICATION" ), makeKeyword( "PRODUCTIVITY" ), makeKeyword( "UNINTERESTINGNESS" ) );
    $list158 = ConsesLow.list( makeSymbol( "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL" ), makeSymbol( "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION" ), makeSymbol( "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY" ),
        makeSymbol( "TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" ) );
    $list159 = ConsesLow.list( makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL" ), makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION" ), makeSymbol(
        "_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY" ), makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" ) );
    $sym160$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE" );
    $list161 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TACTIC-STRATEGIC-PROPERTIES-P" ) );
    $sym162$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol( "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL" );
    $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL" );
    $sym164$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol( "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION" );
    $sym165$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION" );
    $sym166$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol( "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY" );
    $sym167$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY" );
    $sym168$TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol( "TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" );
    $sym169$_CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol( "_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS" );
    $kw170$PREFERENCE_LEVEL = makeKeyword( "PREFERENCE-LEVEL" );
    $kw171$PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword( "PREFERENCE-LEVEL-JUSTIFICATION" );
    $kw172$PRODUCTIVITY = makeKeyword( "PRODUCTIVITY" );
    $sym173$MAKE_TACTIC_STRATEGIC_PROPERTIES = makeSymbol( "MAKE-TACTIC-STRATEGIC-PROPERTIES" );
    $sym174$VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD" );
    $str175$ = makeString( "" );
    $sym176$TACTIC_P = makeSymbol( "TACTIC-P" );
    $kw177$TACTICAL = makeKeyword( "TACTICAL" );
    $str178$structural_tactic__s_cannot_have_ = makeString( "structural tactic ~s cannot have a completeness" );
    $str179$content_tactic__s_cannot_have_a_p = makeString( "content tactic ~s cannot have a preference level" );
    $str180$content_tactic__s_cannot_have_a_p = makeString( "content tactic ~s cannot have a preference level justification" );
    $sym181$GENERALIZED_CONJUNCTIVE_TACTIC_P = makeSymbol( "GENERALIZED-CONJUNCTIVE-TACTIC-P" );
    $kw182$PREFERRED = makeKeyword( "PREFERRED" );
    $sym183$PREFERENCE_LEVEL_P = makeSymbol( "PREFERENCE-LEVEL-P" );
    $sym184$UNINTERESTINGNESS_CACHE_CONDITIONS_P = makeSymbol( "UNINTERESTINGNESS-CACHE-CONDITIONS-P" );
    $sym185$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw186$SKIP = makeKeyword( "SKIP" );
  }

  public static final class $strategy_native
      extends
        SubLStructNative
  {
    public SubLObject $suid;
    public SubLObject $inference;
    public SubLObject $result_uniqueness_criterion;
    public SubLObject $active_problems;
    public SubLObject $motivated_problems;
    public SubLObject $set_aside_problems;
    public SubLObject $should_reconsider_set_asidesP;
    public SubLObject $productivity_limit;
    public SubLObject $removal_backtracking_productivity_limit;
    public SubLObject $proof_spec;
    public SubLObject $problem_proof_spec_index;
    public SubLObject $problem_strategic_index;
    public SubLObject $memoization_state;
    public SubLObject $step_count;
    public SubLObject $type;
    public SubLObject $data;
    private static final SubLStructDeclNative structDecl;

    public $strategy_native()
    {
      this.$suid = CommonSymbols.NIL;
      this.$inference = CommonSymbols.NIL;
      this.$result_uniqueness_criterion = CommonSymbols.NIL;
      this.$active_problems = CommonSymbols.NIL;
      this.$motivated_problems = CommonSymbols.NIL;
      this.$set_aside_problems = CommonSymbols.NIL;
      this.$should_reconsider_set_asidesP = CommonSymbols.NIL;
      this.$productivity_limit = CommonSymbols.NIL;
      this.$removal_backtracking_productivity_limit = CommonSymbols.NIL;
      this.$proof_spec = CommonSymbols.NIL;
      this.$problem_proof_spec_index = CommonSymbols.NIL;
      this.$problem_strategic_index = CommonSymbols.NIL;
      this.$memoization_state = CommonSymbols.NIL;
      this.$step_count = CommonSymbols.NIL;
      this.$type = CommonSymbols.NIL;
      this.$data = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $strategy_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$suid;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$inference;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$result_uniqueness_criterion;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$active_problems;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$motivated_problems;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$set_aside_problems;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$should_reconsider_set_asidesP;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$productivity_limit;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$removal_backtracking_productivity_limit;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$proof_spec;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$problem_proof_spec_index;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$problem_strategic_index;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$memoization_state;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$step_count;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$data;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$suid = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$inference = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$result_uniqueness_criterion = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$active_problems = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$motivated_problems = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$set_aside_problems = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$should_reconsider_set_asidesP = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$productivity_limit = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$removal_backtracking_productivity_limit = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$proof_spec = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$problem_proof_spec_index = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$problem_strategic_index = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$memoization_state = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$step_count = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$data = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $strategy_native.class, $sym0$STRATEGY, $sym1$STRATEGY_P, $list2, $list3, new String[] { "$suid", "$inference", "$result_uniqueness_criterion", "$active_problems",
        "$motivated_problems", "$set_aside_problems", "$should_reconsider_set_asidesP", "$productivity_limit", "$removal_backtracking_productivity_limit", "$proof_spec", "$problem_proof_spec_index",
        "$problem_strategic_index", "$memoization_state", "$step_count", "$type", "$data"
      }, $list4, $list5, $sym6$PRINT_STRATEGY );
    }
  }

  public static final class $strategy_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $strategy_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STRATEGY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return strategy_p( arg1 );
    }
  }

  public static final class $sxhash_strategy_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $sxhash_strategy_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-STRATEGY-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_strategy_method( arg1 );
    }
  }

  public static final class $problem_strategic_properties_native
      extends
        SubLStructNative
  {
    public SubLObject $status;
    public SubLObject $tactic_strategic_property_index;
    public SubLObject $possible_tactic_count;
    public SubLObject $uninterestingness;
    private static final SubLStructDeclNative structDecl;

    public $problem_strategic_properties_native()
    {
      this.$status = CommonSymbols.NIL;
      this.$tactic_strategic_property_index = CommonSymbols.NIL;
      this.$possible_tactic_count = CommonSymbols.NIL;
      this.$uninterestingness = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $problem_strategic_properties_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$status;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$tactic_strategic_property_index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$possible_tactic_count;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$uninterestingness;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$status = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$tactic_strategic_property_index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$possible_tactic_count = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$uninterestingness = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $problem_strategic_properties_native.class, $sym117$PROBLEM_STRATEGIC_PROPERTIES, $sym118$PROBLEM_STRATEGIC_PROPERTIES_P, $list119, $list120, new String[] { "$status",
        "$tactic_strategic_property_index", "$possible_tactic_count", "$uninterestingness"
      }, $list121, $list122, $sym123$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $problem_strategic_properties_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $problem_strategic_properties_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROBLEM-STRATEGIC-PROPERTIES-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return problem_strategic_properties_p( arg1 );
    }
  }

  public static final class $tactic_strategic_properties_native
      extends
        SubLStructNative
  {
    public SubLObject $preference_level;
    public SubLObject $preference_level_justification;
    public SubLObject $productivity;
    public SubLObject $uninterestingness;
    private static final SubLStructDeclNative structDecl;

    public $tactic_strategic_properties_native()
    {
      this.$preference_level = CommonSymbols.NIL;
      this.$preference_level_justification = CommonSymbols.NIL;
      this.$productivity = CommonSymbols.NIL;
      this.$uninterestingness = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $tactic_strategic_properties_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$preference_level;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$preference_level_justification;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$productivity;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$uninterestingness;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$preference_level = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$preference_level_justification = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$productivity = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$uninterestingness = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $tactic_strategic_properties_native.class, $sym154$TACTIC_STRATEGIC_PROPERTIES, $sym155$TACTIC_STRATEGIC_PROPERTIES_P, $list156, $list157, new String[] {
        "$preference_level", "$preference_level_justification", "$productivity", "$uninterestingness"
      }, $list158, $list159, $sym123$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $tactic_strategic_properties_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $tactic_strategic_properties_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TACTIC-STRATEGIC-PROPERTIES-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return tactic_strategic_properties_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 824 ms
 * 
 */