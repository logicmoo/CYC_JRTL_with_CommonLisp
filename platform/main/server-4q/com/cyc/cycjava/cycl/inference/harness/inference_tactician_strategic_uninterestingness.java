package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_tactician_strategic_uninterestingness
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness";
  public static final String myFingerPrint = "33aa3f7c02c62ff8c92773c38c9ce8e12fe62c464a67221918c222c35f78faf7";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1156L)
  private static SubLSymbol $strategy_uninterestingness_explanation$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1410L)
  private static SubLSymbol $the_unknown_strategy_uninterestingness_explanation$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2245L)
  public static SubLSymbol $strategy_gathering_uninterestingness_explanationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3868L)
  private static SubLSymbol $strategy_uninterestingness_explanation_table$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION;
  private static final SubLSymbol $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION;
  private static final SubLSymbol $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw11$PROBLEM;
  private static final SubLSymbol $kw12$TACTIC;
  private static final SubLSymbol $kw13$LINK;
  private static final SubLSymbol $kw14$SUBEXPLANATION;
  private static final SubLSymbol $sym15$PWHEN;
  private static final SubLSymbol $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P;
  private static final SubLSymbol $sym20$PROBLEM_P;
  private static final SubLSymbol $sym21$TACTIC_P;
  private static final SubLSymbol $sym22$PROBLEM_LINK_P;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$THROW_AWAY_PROBLEM;
  private static final SubLSymbol $kw25$THROW_AWAY_TACTIC;
  private static final SubLSymbol $kw26$SET_ASIDE_PROBLEM;
  private static final SubLSymbol $kw27$SET_ASIDE_TACTIC;
  private static final SubLString $str28$problem_is_tactically_uninteresti;
  private static final SubLString $str29$strategy_has_enough_proofs_for_pr;
  private static final SubLString $str30$inference_is_not_continuable__and;
  private static final SubLString $str31$tactic_is_discarded;
  private static final SubLString $str32$non_good_problem_has_already_exec;
  private static final SubLString $str33$rewrite_tactic_is_redundant;
  private static final SubLString $str34$HL_module_is_forbidden;
  private static final SubLString $str35$the_rule_for_this_tactic_has_an_i;
  private static final SubLSymbol $kw36$GENERALIZED_REMOVAL;
  private static final SubLString $str37$problem_is_strategically_no_good;
  private static final SubLString $str38$tactic_exceeds_productivity_limit;
  private static final SubLSymbol $sym39$STRATEGIC_CONTEXT_P;
  private static final SubLSymbol $kw40$TRANSFORMATION;
  private static final SubLString $str41$problem_exceeds_max_proof_depth;
  private static final SubLString $str42$proof_checker_mode_is_enabled_and;
  private static final SubLSymbol $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_;
  private static final SubLString $str44$problem_uses_an_HL_predicate__HL_;
  private static final SubLString $str45$problem_uses_an_evaluatable_predi;
  private static final SubLSymbol $kw46$REWRITE;
  private static final SubLString $str47$problem_exceeds_max_transformatio;
  private static final SubLSymbol $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_;
  private static final SubLString $str49$proof_checker_mode_is_enabled__an;
  private static final SubLString $str50$tactic_requires_HL_predicate_tran;
  private static final SubLString $str51$tactic_requires_unbound_predicate;
  private static final SubLString $str52$tactic_requires_evaluatable_predi;
  private static final SubLList $list53;
  private static final SubLObject $const54$isa;
  private static final SubLObject $const55$genls;
  private static final SubLSymbol $kw56$COMPLETE;
  private static final SubLSymbol $kw57$INCOMPLETE;
  private static final SubLSymbol $kw58$IMPOSSIBLE;
  private static final SubLSymbol $kw59$PREFERRED;
  private static final SubLSymbol $kw60$DISPREFERRED;
  private static final SubLSymbol $kw61$DISALLOWED;
  private static final SubLSymbol $kw62$DOOMED;
  private static final SubLSymbol $kw63$CONTENT;
  private static final SubLSymbol $kw64$EXECUTED;
  private static final SubLSymbol $kw65$JOIN_ORDERED;
  private static final SubLSymbol $kw66$JOIN;
  private static final SubLSymbol $kw67$LOGICAL;
  private static final SubLSymbol $kw68$ANYTHING;
  private static final SubLSymbol $kw69$NOTHING;
  private static final SubLString $str70$Time_to_support_proof_spec_admitt;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLObject $const77$ist;
  private static final SubLObject $const78$not;
  private static final SubLSymbol $kw79$POS;
  private static final SubLSymbol $kw80$NEG;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1520L)
  public static SubLObject the_unknown_strategy_uninterestingness_explanation_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1675L)
  public static SubLObject strategy_last_uninterestingness_explanation()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $strategy_uninterestingness_explanation$.getDynamicValue( thread ) ) ? $strategy_uninterestingness_explanation$.getDynamicValue( thread )
        : $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 1855L)
  public static SubLObject with_strategy_uninterestingness_explanations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list3, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2075L)
  public static SubLObject without_strategy_uninterestingness_explanations(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2462L)
  public static SubLObject strategy_note_uninterestingness_explanation(final SubLObject explanation_type, final SubLObject problem, final SubLObject tactic, final SubLObject link, final SubLObject subexplanation)
  {
    final SubLObject explanation = make_strategy_uninterestingness_explanation( explanation_type, problem, tactic, link, subexplanation );
    assert NIL != strategy_uninterestingness_explanation_p( explanation ) : explanation;
    $strategy_uninterestingness_explanation$.setDynamicValue( explanation );
    return explanation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 2927L)
  public static SubLObject strategy_possibly_note_exact_uninterestingness_explanation(final SubLObject explanation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $strategy_gathering_uninterestingness_explanationsP$.getDynamicValue( thread ) )
    {
      $strategy_uninterestingness_explanation$.setDynamicValue( explanation, thread );
    }
    return explanation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3212L)
  public static SubLObject strategy_possibly_note_uninterestingness_explanation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject explanation_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    explanation_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list8 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list8 );
      if( NIL == conses_high.member( current_$1, $list9, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw10$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    }
    final SubLObject problem_tail = cdestructuring_bind.property_list_member( $kw11$PROBLEM, current );
    final SubLObject problem = ( NIL != problem_tail ) ? conses_high.cadr( problem_tail ) : NIL;
    final SubLObject tactic_tail = cdestructuring_bind.property_list_member( $kw12$TACTIC, current );
    final SubLObject tactic = ( NIL != tactic_tail ) ? conses_high.cadr( tactic_tail ) : NIL;
    final SubLObject link_tail = cdestructuring_bind.property_list_member( $kw13$LINK, current );
    final SubLObject link = ( NIL != link_tail ) ? conses_high.cadr( link_tail ) : NIL;
    final SubLObject subexplanation_tail = cdestructuring_bind.property_list_member( $kw14$SUBEXPLANATION, current );
    final SubLObject subexplanation = ( NIL != subexplanation_tail ) ? conses_high.cadr( subexplanation_tail ) : NIL;
    current = temp;
    if( NIL == current )
    {
      return ConsesLow.list( $sym15$PWHEN, $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__, ConsesLow.list( $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, explanation_type, problem, tactic, link,
          subexplanation ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3608L)
  public static SubLObject strategy_possibly_un_note_uninterestingness_explanation()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $strategy_gathering_uninterestingness_explanationsP$.getDynamicValue( thread ) )
    {
      $strategy_uninterestingness_explanation$.setDynamicValue( $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue(), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9477L)
  public static SubLObject strategy_uninterestingness_explanation_string(final SubLObject explanation_type)
  {
    return conses_high.second( conses_high.assoc( explanation_type, $strategy_uninterestingness_explanation_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9742L)
  public static SubLObject strategy_uninterestingness_explanation_type_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() || ( v_object.isKeyword() && NIL != conses_high.assoc( v_object, $strategy_uninterestingness_explanation_table$.getGlobalValue(), Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 10126L)
  public static SubLObject strategy_uninterestingness_explanation_p(final SubLObject v_object)
  {
    if( v_object.isCons() && NIL != list_utilities.lengthE( v_object, FIVE_INTEGER, UNPROVIDED ) )
    {
      SubLObject type = NIL;
      SubLObject problem = NIL;
      SubLObject tactic = NIL;
      SubLObject link = NIL;
      SubLObject subexplanation = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list18 );
      type = v_object.first();
      SubLObject current = v_object.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list18 );
      problem = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list18 );
      tactic = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list18 );
      link = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list18 );
      subexplanation = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return makeBoolean( NIL != strategy_uninterestingness_explanation_type_p( type ) && ( NIL == problem || NIL != inference_datastructures_problem.problem_p( problem ) ) && ( NIL == tactic
            || NIL != inference_datastructures_tactic.tactic_p( tactic ) ) && ( NIL == link || NIL != inference_datastructures_problem_link.problem_link_p( link ) ) && ( NIL == subexplanation
                || NIL != strategy_uninterestingness_explanation_p( subexplanation ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( v_object, $list18 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 10844L)
  public static SubLObject strategy_uninterestingness_subexplanation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || NIL != strategy_uninterestingness_explanation_p( v_object ) || NIL != list_utilities.list_of_type_p( $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11145L)
  public static SubLObject make_strategy_uninterestingness_explanation(final SubLObject explanation_type, SubLObject problem, SubLObject tactic, SubLObject link, SubLObject subexplanation)
  {
    if( problem == UNPROVIDED )
    {
      problem = NIL;
    }
    if( tactic == UNPROVIDED )
    {
      tactic = NIL;
    }
    if( link == UNPROVIDED )
    {
      link = NIL;
    }
    if( subexplanation == UNPROVIDED )
    {
      subexplanation = NIL;
    }
    assert NIL != strategy_uninterestingness_explanation_type_p( explanation_type ) : explanation_type;
    if( NIL != problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem.problem_p( problem ) )
    {
      throw new AssertionError( problem );
    }
    if( NIL != tactic && !assertionsDisabledInClass && NIL == inference_datastructures_tactic.tactic_p( tactic ) )
    {
      throw new AssertionError( tactic );
    }
    if( NIL != link && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.problem_link_p( link ) )
    {
      throw new AssertionError( link );
    }
    if( NIL != subexplanation && !assertionsDisabledInClass && NIL == strategy_uninterestingness_explanation_p( subexplanation ) )
    {
      throw new AssertionError( subexplanation );
    }
    return ConsesLow.list( explanation_type, problem, tactic, link, subexplanation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11664L)
  public static SubLObject strategy_uninterestingness_explanation_type(final SubLObject explanation)
  {
    assert NIL != strategy_uninterestingness_explanation_p( explanation ) : explanation;
    return explanation.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11838L)
  public static SubLObject strategic_uninterestingness_reason_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list23, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12146L)
  public static SubLObject strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem, SubLObject motivation)
  {
    if( motivation == UNPROVIDED )
    {
      motivation = NIL;
    }
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw24$THROW_AWAY_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12377L)
  public static SubLObject why_strategy_chooses_to_throw_away_problem(final SubLObject strategy, final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reason = NIL;
    final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding( thread );
    try
    {
      $strategy_uninterestingness_explanation$.bind( NIL, thread );
      $strategy_gathering_uninterestingness_explanationsP$.bind( T, thread );
      strategy_chooses_to_throw_away_problemP( strategy, problem, UNPROVIDED );
      reason = strategy_last_uninterestingness_explanation();
    }
    finally
    {
      $strategy_gathering_uninterestingness_explanationsP$.rebind( _prev_bind_2, thread );
      $strategy_uninterestingness_explanation$.rebind( _prev_bind_0, thread );
    }
    return reason;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12700L)
  public static SubLObject strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw25$THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12954L)
  public static SubLObject legacy_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation)
  {
    if( motivation == UNPROVIDED )
    {
      motivation = NIL;
    }
    return simple_strategy_chooses_to_throw_away_tacticP( strategy, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13131L)
  public static SubLObject legacy_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation)
  {
    if( motivation == UNPROVIDED )
    {
      motivation = NIL;
    }
    return simple_strategy_chooses_to_ignore_tacticP( strategy, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13300L)
  public static SubLObject why_strategy_chooses_to_throw_away_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reason = NIL;
    final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding( thread );
    try
    {
      $strategy_uninterestingness_explanation$.bind( NIL, thread );
      $strategy_gathering_uninterestingness_explanationsP$.bind( T, thread );
      strategy_chooses_to_throw_away_tacticP( strategy, tactic, NIL, NIL );
      reason = strategy_last_uninterestingness_explanation();
    }
    finally
    {
      $strategy_gathering_uninterestingness_explanationsP$.rebind( _prev_bind_2, thread );
      $strategy_uninterestingness_explanation$.rebind( _prev_bind_0, thread );
    }
    return reason;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13604L)
  public static SubLObject strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw26$SET_ASIDE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13809L)
  public static SubLObject why_strategy_chooses_to_set_aside_problem(final SubLObject strategy, final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reason = NIL;
    final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding( thread );
    try
    {
      $strategy_uninterestingness_explanation$.bind( NIL, thread );
      $strategy_gathering_uninterestingness_explanationsP$.bind( T, thread );
      strategy_chooses_to_set_aside_problemP( strategy, problem );
      reason = strategy_last_uninterestingness_explanation();
    }
    finally
    {
      $strategy_gathering_uninterestingness_explanationsP$.rebind( _prev_bind_2, thread );
      $strategy_uninterestingness_explanation$.rebind( _prev_bind_0, thread );
    }
    return reason;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14130L)
  public static SubLObject strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw27$SET_ASIDE_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14382L)
  public static SubLObject legacy_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation)
  {
    if( motivation == UNPROVIDED )
    {
      motivation = NIL;
    }
    return simple_strategy_chooses_to_set_aside_tacticP( strategy, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14580L)
  public static SubLObject why_strategy_chooses_to_set_aside_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject reason = NIL;
    final SubLObject _prev_bind_0 = $strategy_uninterestingness_explanation$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $strategy_gathering_uninterestingness_explanationsP$.currentBinding( thread );
    try
    {
      $strategy_uninterestingness_explanation$.bind( NIL, thread );
      $strategy_gathering_uninterestingness_explanationsP$.bind( T, thread );
      strategy_chooses_to_set_aside_tacticP( strategy, tactic, NIL, NIL );
      reason = strategy_last_uninterestingness_explanation();
    }
    finally
    {
      $strategy_gathering_uninterestingness_explanationsP$.rebind( _prev_bind_2, thread );
      $strategy_uninterestingness_explanation$.rebind( _prev_bind_0, thread );
    }
    return reason;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 14882L)
  public static SubLObject strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject motivation)
  {
    if( motivation == UNPROVIDED )
    {
      motivation = NIL;
    }
    return simple_strategy_chooses_to_ignore_tacticP( strategy, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15075L)
  public static SubLObject simple_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem)
  {
    return simple_strategy_chooses_to_throw_away_problem_int( strategy, problem, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15485L)
  public static SubLObject why_simple_strategy_chooses_to_throw_away_problem(final SubLObject strategy, final SubLObject problem)
  {
    return simple_strategy_chooses_to_throw_away_problem_int( strategy, problem, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15653L)
  public static SubLObject simple_strategy_chooses_to_throw_away_problem_int(final SubLObject strategy, final SubLObject problem, final SubLObject justifyP)
  {
    if( NIL != tactically_uninteresting_problem_p( problem ) )
    {
      if( NIL != justifyP )
      {
        return $str28$problem_is_tactically_uninteresti;
      }
      return T;
    }
    else if( NIL != strategy_has_enough_proofs_for_problemP( strategy, problem ) )
    {
      if( NIL != justifyP )
      {
        return $str29$strategy_has_enough_proofs_for_pr;
      }
      return T;
    }
    else
    {
      final SubLObject inference_chooses_to_throw_away_problem_reason = why_inference_chooses_to_throw_away_problem( inference_datastructures_strategy.strategy_inference( strategy ), problem );
      if( NIL == inference_chooses_to_throw_away_problem_reason )
      {
        if( NIL == inference_datastructures_inference.inference_continuableP( inference_datastructures_strategy.strategy_inference( strategy ) ) && NIL != inference_tactician
            .strategy_set_aside_non_continuable_implies_throw_awayP( strategy ) )
        {
          final SubLObject set_aside_reason = why_simple_strategy_chooses_to_set_aside_problem( strategy, problem );
          if( NIL != set_aside_reason )
          {
            if( NIL != justifyP )
            {
              return Sequences.cconcatenate( $str30$inference_is_not_continuable__and, set_aside_reason );
            }
            return T;
          }
        }
        return NIL;
      }
      if( NIL != justifyP )
      {
        return inference_chooses_to_throw_away_problem_reason;
      }
      return T;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 16892L)
  public static SubLObject simple_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic)
  {
    return simple_strategy_chooses_to_throw_away_tactic_int( strategy, tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17078L)
  public static SubLObject why_simple_strategy_chooses_to_throw_away_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    return simple_strategy_chooses_to_throw_away_tactic_int( strategy, tactic, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17242L)
  public static SubLObject simple_strategy_chooses_to_throw_away_tactic_int(final SubLObject strategy, final SubLObject tactic, final SubLObject justifyP)
  {
    if( NIL != inference_datastructures_tactic.tactic_discardedP( tactic ) && NIL == transformation_tactician_datastructures.transformation_strategy_p( strategy ) )
    {
      if( NIL != justifyP )
      {
        return $str31$tactic_is_discarded;
      }
      return T;
    }
    else if( NIL == inference_worker.good_problem_p( inference_datastructures_tactic.tactic_problem( tactic ), strategy ) && NIL != problem_has_executed_a_complete_removal_tacticP( inference_datastructures_tactic
        .tactic_problem( tactic ), strategy ) )
    {
      if( NIL != justifyP )
      {
        return $str32$non_good_problem_has_already_exec;
      }
      return T;
    }
    else if( NIL != simple_strategy_deems_rewrite_tactic_redundantP( strategy, tactic ) )
    {
      if( NIL != justifyP )
      {
        return $str33$rewrite_tactic_is_redundant;
      }
      return T;
    }
    else if( NIL != inference_worker_transformation.transformation_tactic_p( tactic ) && NIL != simple_strategy_chooses_to_throw_away_transformation_tacticP( strategy, tactic ) )
    {
      if( NIL != justifyP )
      {
        return why_simple_strategy_chooses_to_throw_away_transformation_tactic( strategy, tactic );
      }
      return T;
    }
    else
    {
      if( NIL != strategy_allows_use_of_tactic_hl_moduleP( strategy, tactic ) )
      {
        if( NIL == inference_datastructures_inference.inference_continuableP( inference_datastructures_strategy.strategy_inference( strategy ) ) )
        {
          if( NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP( strategy ) )
          {
            final SubLObject strategy_chooses_to_set_aside_tactic_reason = why_simple_strategy_chooses_to_set_aside_tactic( strategy, tactic );
            if( NIL != strategy_chooses_to_set_aside_tactic_reason )
            {
              if( NIL != justifyP )
              {
                return Sequences.cconcatenate( $str30$inference_is_not_continuable__and, strategy_chooses_to_set_aside_tactic_reason );
              }
              return T;
            }
          }
          else if( NIL != inference_worker_transformation.transformation_tactic_p( tactic ) )
          {
            final SubLObject rule = inference_worker_transformation.transformation_tactic_rule( tactic );
            if( NIL != rule && NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP( rule, inference_datastructures_strategy.strategy_inference( strategy ) ) )
            {
              if( NIL != justifyP )
              {
                return $str35$the_rule_for_this_tactic_has_an_i;
              }
              return T;
            }
          }
        }
        return NIL;
      }
      if( NIL != justifyP )
      {
        return $str34$HL_module_is_forbidden;
      }
      return T;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 19747L)
  public static SubLObject problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context)
  {
    return problem_has_executed_a_complete_tacticP( problem, strategic_context, $kw36$GENERALIZED_REMOVAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 19940L)
  public static SubLObject lookahead_problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context)
  {
    return lookahead_problem_has_executed_a_complete_tacticP( problem, strategic_context, $kw36$GENERALIZED_REMOVAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20153L)
  public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context)
  {
    return problem_or_lookahead_problem_has_executed_a_complete_tacticP( problem, strategic_context, $kw36$GENERALIZED_REMOVAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20388L)
  public static SubLObject problem_has_executed_a_generalized_removal_tacticP(final SubLObject problem)
  {
    return problem_has_executed_a_tactic_of_typeP( problem, $kw36$GENERALIZED_REMOVAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20547L)
  public static SubLObject strategy_allows_use_of_tactic_hl_moduleP(final SubLObject strategy, final SubLObject tactic)
  {
    return strategy_allows_use_of_hl_moduleP( strategy, inference_datastructures_tactic.tactic_hl_module( tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20705L)
  public static SubLObject strategy_allows_use_of_hl_moduleP(final SubLObject strategy, final SubLObject hl_module)
  {
    return inference_datastructures_inference.inference_allows_use_of_moduleP( inference_datastructures_strategy.strategy_inference( strategy ), hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20862L)
  public static SubLObject simple_strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem)
  {
    return simple_strategy_chooses_to_set_aside_problem_int( strategy, problem, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21090L)
  public static SubLObject why_simple_strategy_chooses_to_set_aside_problem(final SubLObject strategy, final SubLObject problem)
  {
    return simple_strategy_chooses_to_set_aside_problem_int( strategy, problem, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21258L)
  public static SubLObject simple_strategy_chooses_to_set_aside_problem_int(final SubLObject strategy, final SubLObject problem, final SubLObject justifyP)
  {
    if( NIL != inference_datastructures_strategy.strategically_totally_no_good_problem_p( problem, strategy ) )
    {
      if( NIL != justifyP )
      {
        return $str37$problem_is_strategically_no_good;
      }
      return T;
    }
    else
    {
      final SubLObject inference_chooses_to_set_aside_problem_reason = why_inference_chooses_to_set_aside_problem( inference_datastructures_strategy.strategy_inference( strategy ), problem );
      if( NIL == inference_chooses_to_set_aside_problem_reason )
      {
        return NIL;
      }
      if( NIL != justifyP )
      {
        return inference_chooses_to_set_aside_problem_reason;
      }
      return T;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21955L)
  public static SubLObject simple_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic)
  {
    return simple_strategy_chooses_to_set_aside_tactic_int( strategy, tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22138L)
  public static SubLObject why_simple_strategy_chooses_to_set_aside_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    return simple_strategy_chooses_to_set_aside_tactic_int( strategy, tactic, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22300L)
  public static SubLObject simple_strategy_chooses_to_set_aside_tactic_int(final SubLObject strategy, final SubLObject tactic, final SubLObject justifyP)
  {
    if( ( NIL == inference_worker.content_tactic_p( tactic ) && NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP( inference_datastructures_strategy.strategy_problem_store(
        strategy ) ) ) || NIL == tactic_exceeds_productivity_limitP( tactic, strategy ) )
    {
      if( NIL != inference_worker_transformation.transformation_tactic_p( tactic ) )
      {
        final SubLObject strategy_chooses_to_set_aside_transformation_tactic_reason = why_simple_strategy_chooses_to_set_aside_transformation_tactic( strategy, tactic );
        if( NIL != strategy_chooses_to_set_aside_transformation_tactic_reason )
        {
          if( NIL != justifyP )
          {
            return strategy_chooses_to_set_aside_transformation_tactic_reason;
          }
          return T;
        }
      }
      return NIL;
    }
    if( NIL != justifyP )
    {
      return $str38$tactic_exceeds_productivity_limit;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 23492L)
  public static SubLObject simple_strategy_chooses_to_ignore_problemP(final SubLObject strategy, final SubLObject problem)
  {
    return makeBoolean( NIL != simple_strategy_chooses_to_throw_away_problemP( strategy, problem ) || ( ( NIL != inference_datastructures_inference.inference_continuableP( inference_datastructures_strategy
        .strategy_inference( strategy ) ) || NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP( strategy ) ) && NIL != simple_strategy_chooses_to_set_aside_problemP( strategy,
            problem ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24010L)
  public static SubLObject simple_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic)
  {
    return makeBoolean( NIL != simple_strategy_chooses_to_throw_away_tacticP( strategy, tactic ) || ( ( NIL != inference_datastructures_inference.inference_continuableP( inference_datastructures_strategy
        .strategy_inference( strategy ) ) || NIL == inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP( strategy ) ) && NIL != simple_strategy_chooses_to_set_aside_tacticP( strategy, tactic ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24490L)
  public static SubLObject problem_strategically_pendingP(final SubLObject problem, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    if( NIL != inference_datastructures_strategy.strategy_p( strategic_context ) )
    {
      return T;
    }
    return inference_datastructures_problem.problem_no_tactics_possibleP( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25036L)
  public static SubLObject strategy_deems_problem_tactically_uninterestingP(final SubLObject strategy, final SubLObject problem)
  {
    return makeBoolean( NIL != tactically_uninteresting_problem_p( problem ) || NIL != strategy_has_enough_proofs_for_problemP( strategy, problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25247L)
  public static SubLObject strategy_has_enough_proofs_for_problemP(final SubLObject strategy, final SubLObject problem)
  {
    return makeBoolean( NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && ( NIL != inference_datastructures_strategy.strategy_wants_one_answerP( strategy )
        || ( NIL != inference_datastructures_strategy.strategy_unique_wrt_bindingsP( strategy ) && ( NIL != inference_datastructures_problem.closed_problem_p( problem ) || ( problem.eql( inference_datastructures_strategy
            .strategy_root_problem( strategy ) ) && NIL != inference_datastructures_inference.inference_no_free_hl_varsP( inference_datastructures_strategy.strategy_inference( strategy ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25919L)
  public static SubLObject tactically_uninteresting_problem_p(final SubLObject problem)
  {
    return makeBoolean( NIL != inference_datastructures_problem.tactically_no_good_problem_p( problem ) || NIL != inference_datastructures_problem.tactically_examined_problem_p( problem )
        || ( NIL != inference_datastructures_problem.tactically_unexamined_problem_p( problem ) && NIL != inference_datastructures_problem.tactically_good_problem_p( problem ) && NIL != inference_datastructures_problem
            .closed_problem_p( problem ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26656L)
  public static SubLObject strategy_deems_problem_strategically_uninterestingP(final SubLObject strategy, final SubLObject problem)
  {
    return strategically_uninteresting_problem_p( problem, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26848L)
  public static SubLObject strategically_uninteresting_problem_p(final SubLObject problem, final SubLObject strategy)
  {
    return makeBoolean( NIL != inference_datastructures_strategy.strategically_no_good_problem_p( problem, strategy ) || NIL != inference_datastructures_strategy.strategically_pending_problem_p( problem, strategy )
        || NIL != inference_datastructures_strategy.strategically_examined_problem_p( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27133L)
  public static SubLObject problem_has_relevant_supporting_problemP(final SubLObject problem, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    if( NIL != inference_datastructures_strategy.strategy_p( strategic_context ) )
    {
      final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( problem );
      SubLObject basis_object;
      SubLObject state;
      SubLObject argument_link;
      SubLObject link_var;
      SubLObject cdolist_list_var;
      SubLObject supporting_mapped_problem;
      SubLObject supporting_problem;
      SubLObject variable_map;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        argument_link = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, argument_link ) && ( NIL != consider_transformation_tacticsP || NIL == inference_worker_transformation.transformation_link_p( argument_link ) ) )
        {
          link_var = argument_link;
          cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link_var );
          supporting_mapped_problem = NIL;
          supporting_mapped_problem = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link_var, supporting_mapped_problem ) )
            {
              supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
              variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
              if( NIL != inference_datastructures_problem.problem_relevant_to_strategyP( supporting_problem, strategic_context ) )
              {
                return T;
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
          }
        }
      }
      return NIL;
    }
    return inference_datastructures_problem.problem_has_argument_link_p( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27802L)
  public static SubLObject problem_has_interesting_transformation_tacticsP(final SubLObject problem, final SubLObject strategic_context)
  {
    assert NIL != inference_worker.strategic_context_p( strategic_context ) : strategic_context;
    if( NIL != inference_datastructures_strategy.strategy_p( strategic_context ) )
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
      SubLObject tactic = NIL;
      tactic = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( tactic, $kw40$TRANSFORMATION ) && NIL == simple_strategy_chooses_to_ignore_tacticP( strategic_context, tactic ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        tactic = cdolist_list_var.first();
      }
      return NIL;
    }
    return inference_datastructures_problem.problem_has_transformation_tacticsP( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28235L)
  public static SubLObject problem_no_tactics_strategically_possibleP(final SubLObject strategy, final SubLObject problem)
  {
    return Numbers.zerop( inference_datastructures_strategy.problem_strategically_possible_tactic_count( problem, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28524L)
  public static SubLObject inference_chooses_to_set_aside_problemP(final SubLObject inference, final SubLObject problem)
  {
    return inference_chooses_to_set_aside_problem_int( inference, problem, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28677L)
  public static SubLObject why_inference_chooses_to_set_aside_problem(final SubLObject inference, final SubLObject problem)
  {
    return inference_chooses_to_set_aside_problem_int( inference, problem, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28831L)
  public static SubLObject inference_chooses_to_set_aside_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP)
  {
    if( NIL != inference_worker.problem_strictly_within_max_proof_depthP( inference, problem ) )
    {
      return NIL;
    }
    if( NIL != justifyP )
    {
      return $str41$problem_exceeds_max_proof_depth;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29078L)
  public static SubLObject inference_chooses_to_throw_away_problemP(final SubLObject inference, final SubLObject problem)
  {
    return inference_chooses_to_throw_away_problem_int( inference, problem, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29233L)
  public static SubLObject why_inference_chooses_to_throw_away_problem(final SubLObject inference, final SubLObject problem)
  {
    return inference_chooses_to_throw_away_problem_int( inference, problem, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29389L)
  public static SubLObject inference_chooses_to_throw_away_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP)
  {
    if( NIL != inference_datastructures_inference.inference_allows_use_of_all_rulesP( inference ) || NIL == inference_datastructures_problem.problem_has_dependent_link_p( problem )
        || NIL == all_dependent_links_are_forbidden_transformationsP( problem, inference ) )
    {
      return NIL;
    }
    if( NIL != justifyP )
    {
      return $str42$proof_checker_mode_is_enabled_and;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 29813L)
  public static SubLObject all_dependent_links_are_forbidden_transformationsP(final SubLObject problem, final SubLObject inference)
  {
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, link ) && ( NIL == inference_worker_transformation.transformation_link_p( link ) || NIL == transformation_forbidden_by_inferenceP( link,
          inference ) ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30140L)
  public static SubLObject transformation_forbidden_by_inferenceP(final SubLObject transformation_link, final SubLObject inference)
  {
    final SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion( transformation_link );
    return makeBoolean( NIL == inference_datastructures_inference.inference_allows_use_of_ruleP( inference, rule ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30368L)
  public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_internal(final SubLObject inference, final SubLObject problem)
  {
    return inference_chooses_to_throw_away_all_transformations_on_problem_int( inference, problem, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30368L)
  public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP(final SubLObject inference, final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_chooses_to_throw_away_all_transformations_on_problemP_internal( inference, problem );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, TWO_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( inference, problem );
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
        if( inference.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && problem.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_chooses_to_throw_away_all_transformations_on_problemP_internal( inference, problem ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( inference, problem ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30602L)
  public static SubLObject why_inference_chooses_to_throw_away_all_transformations_on_problem(final SubLObject inference, final SubLObject problem)
  {
    return inference_chooses_to_throw_away_all_transformations_on_problem_int( inference, problem, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 30804L)
  public static SubLObject inference_chooses_to_throw_away_all_transformations_on_problem_int(final SubLObject inference, final SubLObject problem, final SubLObject justifyP)
  {
    final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP( inference );
    final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP( inference );
    final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP( inference );
    if( NIL == allow_unbound_predicate_transformationP )
    {
      if( NIL == allow_hl_predicate_transformationP && NIL != problem_uses_hl_predicateP( problem ) && NIL == collection_backchain_encouraged_problemP( problem ) )
      {
        if( NIL != justifyP )
        {
          return $str44$problem_uses_an_HL_predicate__HL_;
        }
        return T;
      }
      else if( NIL == allow_evaluatable_predicate_transformationP && NIL != problem_uses_evaluatable_predicateP( problem ) )
      {
        if( NIL != justifyP )
        {
          return $str45$problem_uses_an_evaluatable_predi;
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32030L)
  public static SubLObject collection_backchain_encouraged_problemP(final SubLObject problem)
  {
    final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence( problem );
    final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt( problem );
    return collection_backchain_encouraged_asentP( asent, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32356L)
  public static SubLObject problem_uses_hl_predicateP(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
    {
      final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate( problem );
      return hl_supports.hl_predicate_p( predicate );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32565L)
  public static SubLObject problem_uses_evaluatable_predicateP(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
    {
      final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate( problem );
      return makeBoolean( NIL != forts.fort_p( predicate ) && NIL != inference_trampolines.inference_evaluatable_predicateP( predicate ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32828L)
  public static SubLObject simple_strategy_deems_rewrite_tactic_redundantP(final SubLObject strategy, final SubLObject tactic)
  {
    if( NIL != inference_worker_rewrite.rewrite_tactic_p( tactic ) )
    {
      final SubLObject inference = inference_datastructures_strategy.strategy_inference( strategy );
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
      final SubLObject new_module = inference_datastructures_tactic.tactic_hl_module( tactic );
      if( NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
      {
        SubLObject redundantP = NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( problem );
        SubLObject basis_object;
        SubLObject state;
        SubLObject rewrite_link;
        SubLObject old_tactic;
        SubLObject old_module;
        SubLObject supported_problem;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == redundantP
            && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          rewrite_link = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, rewrite_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( rewrite_link, $kw46$REWRITE ) )
          {
            old_tactic = inference_worker_rewrite.rewrite_link_tactic( rewrite_link );
            old_module = inference_datastructures_tactic.tactic_hl_module( old_tactic );
            if( old_module.eql( new_module ) )
            {
              supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( rewrite_link );
              if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( supported_problem, inference ) )
              {
                redundantP = T;
              }
            }
          }
        }
        return redundantP;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 33795L)
  public static SubLObject tactic_exceeds_productivity_limitP(final SubLObject tactic, final SubLObject strategic_context)
  {
    if( NIL == inference_datastructures_strategy.strategy_p( strategic_context ) )
    {
      return NIL;
    }
    final SubLObject productivity_limit = inference_datastructures_strategy.strategy_productivity_limit( strategic_context );
    if( NIL != inference_datastructures_enumerated_types.infinite_productivity_p( productivity_limit ) )
    {
      return NIL;
    }
    final SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic, strategic_context );
    return inference_datastructures_enumerated_types.productivity_G( productivity, productivity_limit );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34304L)
  public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tacticP(final SubLObject strategy, final SubLObject transformation_tactic)
  {
    return simple_strategy_chooses_to_set_aside_transformation_tactic_int( strategy, transformation_tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34523L)
  public static SubLObject why_simple_strategy_chooses_to_set_aside_transformation_tactic(final SubLObject strategy, final SubLObject transformation_tactic)
  {
    return simple_strategy_chooses_to_set_aside_transformation_tactic_int( strategy, transformation_tactic, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34743L)
  public static SubLObject simple_strategy_chooses_to_set_aside_transformation_tactic_int(final SubLObject strategy, final SubLObject transformation_tactic, final SubLObject justifyP)
  {
    final SubLObject inference = inference_datastructures_strategy.strategy_inference( strategy );
    if( NIL != justifyP )
    {
      return why_inference_chooses_to_set_aside_transformation_tactic( inference, transformation_tactic );
    }
    return inference_chooses_to_set_aside_transformation_tacticP( inference, transformation_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35133L)
  public static SubLObject inference_chooses_to_set_aside_transformation_tacticP(final SubLObject inference, final SubLObject transformation_tactic)
  {
    return inference_chooses_to_set_aside_transformation_tactic_int( inference, transformation_tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35342L)
  public static SubLObject why_inference_chooses_to_set_aside_transformation_tactic(final SubLObject inference, final SubLObject transformation_tactic)
  {
    return inference_chooses_to_set_aside_transformation_tactic_int( inference, transformation_tactic, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35552L)
  public static SubLObject inference_chooses_to_set_aside_transformation_tactic_int(final SubLObject inference, final SubLObject transformation_tactic, final SubLObject justifyP)
  {
    final SubLObject rule = inference_worker_transformation.transformation_tactic_rule( transformation_tactic );
    if( NIL != rule && NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP( rule, inference ) )
    {
      if( NIL != justifyP )
      {
        return $str35$the_rule_for_this_tactic_has_an_i;
      }
      return T;
    }
    else
    {
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( transformation_tactic );
      if( NIL != inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP( inference, problem ) )
      {
        return NIL;
      }
      if( NIL != justifyP )
      {
        return $str47$problem_exceeds_max_transformatio;
      }
      return T;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36297L)
  public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(final SubLObject strategy, final SubLObject transformation_tactic)
  {
    return simple_strategy_chooses_to_throw_away_transformation_tactic_int( strategy, transformation_tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36297L)
  public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP(final SubLObject strategy, final SubLObject transformation_tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return simple_strategy_chooses_to_throw_away_transformation_tacticP_internal( strategy, transformation_tactic );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, TWO_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( strategy, transformation_tactic );
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
        if( strategy.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && transformation_tactic.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( simple_strategy_chooses_to_throw_away_transformation_tacticP_internal( strategy, transformation_tactic ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( strategy, transformation_tactic ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36551L)
  public static SubLObject why_simple_strategy_chooses_to_throw_away_transformation_tactic(final SubLObject strategy, final SubLObject transformation_tactic)
  {
    return simple_strategy_chooses_to_throw_away_transformation_tactic_int( strategy, transformation_tactic, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 36773L)
  public static SubLObject simple_strategy_chooses_to_throw_away_transformation_tactic_int(final SubLObject strategy, final SubLObject transformation_tactic, final SubLObject justifyP)
  {
    final SubLObject inference = inference_datastructures_strategy.strategy_inference( strategy );
    if( NIL != justifyP )
    {
      return why_inference_chooses_to_throw_away_transformation_tactic( inference, transformation_tactic );
    }
    return inference_chooses_to_throw_away_transformation_tacticP( inference, transformation_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37166L)
  public static SubLObject inference_chooses_to_throw_away_transformation_tacticP(final SubLObject inference, final SubLObject transformation_tactic)
  {
    return inference_chooses_to_throw_away_transformation_tactic_int( inference, transformation_tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37377L)
  public static SubLObject why_inference_chooses_to_throw_away_transformation_tactic(final SubLObject inference, final SubLObject transformation_tactic)
  {
    return inference_chooses_to_throw_away_transformation_tactic_int( inference, transformation_tactic, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37589L)
  public static SubLObject inference_chooses_to_throw_away_transformation_tactic_int(final SubLObject inference, final SubLObject transformation_tactic, final SubLObject justifyP)
  {
    final SubLObject rule = inference_worker_transformation.transformation_tactic_rule( transformation_tactic );
    if( NIL != rule && NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP( inference ) && NIL == inference_datastructures_inference.inference_allows_use_of_ruleP( inference, rule ) )
    {
      if( NIL != justifyP )
      {
        return $str49$proof_checker_mode_is_enabled__an;
      }
      return T;
    }
    else
    {
      if( NIL != inference_worker_transformation.meta_transformation_tactic_p( transformation_tactic ) )
      {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem( transformation_tactic );
        if( NIL != inference_chooses_to_throw_away_all_transformations_on_problemP( inference, problem ) )
        {
          if( NIL != justifyP )
          {
            return why_inference_chooses_to_throw_away_all_transformations_on_problem( inference, problem );
          }
          return T;
        }
      }
      final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP( inference );
      if( NIL == allow_hl_predicate_transformationP && NIL != tactic_requires_hl_predicate_transformationP( transformation_tactic ) )
      {
        if( NIL != justifyP )
        {
          return $str50$tactic_requires_HL_predicate_tran;
        }
        return T;
      }
      else
      {
        final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP( inference );
        if( NIL == allow_unbound_predicate_transformationP && NIL != tactic_requires_unbound_predicate_transformationP( transformation_tactic ) )
        {
          if( NIL != justifyP )
          {
            return $str51$tactic_requires_unbound_predicate;
          }
          return T;
        }
        else
        {
          final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP( inference );
          if( NIL != allow_evaluatable_predicate_transformationP || NIL == tactic_requires_evaluatable_predicate_transformationP( transformation_tactic ) )
          {
            return NIL;
          }
          if( NIL != justifyP )
          {
            return $str52$tactic_requires_evaluatable_predi;
          }
          return T;
        }
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 39817L)
  public static SubLObject strategy_disallows_use_of_hl_module_on_problemP(final SubLObject strategy, final SubLObject hl_module, final SubLObject problem)
  {
    final SubLObject inference = inference_datastructures_strategy.strategy_inference( strategy );
    final SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP( inference );
    if( NIL == allow_hl_predicate_transformationP && NIL != hl_module_requires_hl_predicate_transformationP( hl_module, problem ) )
    {
      return T;
    }
    final SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP( inference );
    if( NIL == allow_unbound_predicate_transformationP && NIL != hl_module_requires_unbound_predicate_transformationP( hl_module ) )
    {
      return T;
    }
    final SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP( inference );
    if( NIL == allow_evaluatable_predicate_transformationP && NIL != problem_uses_evaluatable_predicateP( problem ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 40797L)
  public static SubLObject tactic_requires_hl_predicate_transformationP(final SubLObject tactic)
  {
    final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module( tactic );
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    return hl_module_requires_hl_predicate_transformationP( hl_module, problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41034L)
  public static SubLObject hl_module_requires_hl_predicate_transformationP(final SubLObject hl_module, final SubLObject problem)
  {
    if( NIL == inference_modules.transformation_module_p( hl_module ) )
    {
      return NIL;
    }
    if( NIL != hl_module_only_applies_to_hl_predicatesP( hl_module ) )
    {
      return makeBoolean( NIL == inference_datastructures_problem.single_literal_problem_p( problem ) || NIL == collection_backchain_encouraged_problemP( problem ) );
    }
    if( NIL != problem_uses_hl_predicateP( problem ) )
    {
      return makeBoolean( NIL == inference_modules.meta_transformation_module_p( hl_module ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41488L)
  public static SubLObject collection_backchain_encouraged_tacticP(final SubLObject tactic)
  {
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    if( NIL != inference_datastructures_problem.single_literal_problem_p( problem ) )
    {
      return collection_backchain_encouraged_problemP( problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 41748L)
  public static SubLObject collection_backchain_encouraged_asentP(final SubLObject asent, final SubLObject mt)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject resultP = NIL;
    if( NIL != subl_promotions.memberP( predicate, $list53, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
      if( NIL != forts.fort_p( collection ) )
      {
        if( predicate.eql( $const54$isa ) )
        {
          resultP = makeBoolean( NIL != inference_trampolines.inference_collection_backchain_encouragedP( collection, mt ) || NIL != inference_trampolines.inference_collection_isa_backchain_encouragedP( collection,
              mt ) );
        }
        else if( predicate.eql( $const55$genls ) )
        {
          resultP = makeBoolean( NIL != inference_trampolines.inference_collection_backchain_encouragedP( collection, mt ) || NIL != inference_trampolines.inference_collection_genls_backchain_encouragedP( collection,
              mt ) );
        }
      }
      return resultP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42508L)
  public static SubLObject tactic_problem_uses_hl_predicateP(final SubLObject tactic)
  {
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    return problem_uses_hl_predicateP( problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42661L)
  public static SubLObject transformation_tactic_only_applies_to_hl_predicatesP(final SubLObject tactic)
  {
    return hl_module_only_applies_to_hl_predicatesP( inference_datastructures_tactic.tactic_hl_module( tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42818L)
  public static SubLObject hl_module_only_applies_to_hl_predicatesP(final SubLObject hl_module)
  {
    final SubLObject predicate = inference_modules.hl_module_predicate( hl_module );
    return hl_supports.hl_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 42981L)
  public static SubLObject tactic_requires_unbound_predicate_transformationP(final SubLObject tactic)
  {
    if( NIL != inference_worker_transformation.transformation_tactic_p( tactic ) )
    {
      final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module( tactic );
      return hl_module_requires_unbound_predicate_transformationP( hl_module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43229L)
  public static SubLObject hl_module_requires_unbound_predicate_transformationP(final SubLObject hl_module)
  {
    return transformation_modules.trans_unbound_predicate_module_p( hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43365L)
  public static SubLObject tactic_requires_evaluatable_predicate_transformationP(final SubLObject tactic)
  {
    if( NIL != inference_worker_transformation.transformation_tactic_p( tactic ) )
    {
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
      return problem_uses_evaluatable_predicateP( problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43594L)
  public static SubLObject tactic_completeP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw56$COMPLETE, inference_datastructures_strategy.tactic_strategic_completeness( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43738L)
  public static SubLObject tactic_incompleteP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw57$INCOMPLETE, inference_datastructures_strategy.tactic_strategic_completeness( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 43886L)
  public static SubLObject tactic_impossibleP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw58$IMPOSSIBLE, inference_datastructures_strategy.tactic_strategic_completeness( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44034L)
  public static SubLObject tactic_preferredP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw59$PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44184L)
  public static SubLObject tactic_dispreferredP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw60$DISPREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44340L)
  public static SubLObject tactic_disallowedP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw61$DISALLOWED, inference_datastructures_strategy.tactic_strategic_preference_level( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44492L)
  public static SubLObject tactic_doomedP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return Equality.eq( $kw62$DOOMED, inference_datastructures_strategy.tactic_strategic_preference_level( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44636L)
  public static SubLObject tactic_disallowed_or_doomedP(final SubLObject tactic, final SubLObject strategic_context)
  {
    return makeBoolean( NIL != tactic_disallowedP( tactic, strategic_context ) || NIL != tactic_doomedP( tactic, strategic_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 44819L)
  public static SubLObject problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw63$CONTENT;
    }
    if( NIL == inference_datastructures_problem_store.problem_store_removal_allowedP( inference_datastructures_problem.problem_store( problem ) ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( tactic, type ) && NIL != inference_datastructures_problem.do_problem_tactics_status_match( tactic, $kw64$EXECUTED )
          && NIL != tactic_completeP( tactic, strategic_context ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 45205L)
  public static SubLObject lookahead_problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw63$CONTENT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject jo_tactic = NIL;
    jo_tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( jo_tactic, $kw65$JOIN_ORDERED ) && NIL != problem_has_executed_a_complete_tacticP( inference_worker_join_ordered
          .join_ordered_tactic_lookahead_problem( jo_tactic ), strategic_context, type ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      jo_tactic = cdolist_list_var.first();
    }
    cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject join_tactic = NIL;
    join_tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( join_tactic, $kw66$JOIN ) )
      {
        thread.resetMultipleValues();
        final SubLObject lookahead_1 = inference_worker_join.join_tactic_lookahead_problems( join_tactic );
        final SubLObject lookahead_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != problem_has_executed_a_complete_tacticP( lookahead_1, strategic_context, type ) || NIL != problem_has_executed_a_complete_tacticP( lookahead_2, strategic_context, type ) )
        {
          return T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      join_tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46017L)
  public static SubLObject problem_or_lookahead_problem_has_executed_a_complete_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw63$CONTENT;
    }
    return makeBoolean( NIL != problem_has_executed_a_complete_tacticP( problem, strategic_context, type ) || NIL != lookahead_problem_has_executed_a_complete_tacticP( problem, strategic_context, type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46327L)
  public static SubLObject problem_has_executed_a_preferred_tacticP(final SubLObject problem, final SubLObject strategic_context, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw67$LOGICAL;
    }
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( tactic, type ) && NIL != inference_datastructures_problem.do_problem_tactics_status_match( tactic, $kw64$EXECUTED )
          && NIL != tactic_preferredP( tactic, strategic_context ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46594L)
  public static SubLObject problem_has_executed_a_tactic_of_typeP(final SubLObject problem, final SubLObject type)
  {
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( tactic, type ) && NIL != inference_datastructures_problem.do_problem_tactics_status_match( tactic, $kw64$EXECUTED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 46761L)
  public static SubLObject strategy_admits_tactic_wrt_proof_specP(final SubLObject strategy, final SubLObject tactic)
  {
    if( NIL != strategy_admits_all_tactics_wrt_proof_specP( strategy ) )
    {
      return T;
    }
    final SubLObject proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec( strategy, inference_datastructures_tactic.tactic_problem( tactic ) );
    return proof_spec_admits_tacticP( proof_spec, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 47085L)
  public static SubLObject strategy_admits_all_tactics_wrt_proof_specP(final SubLObject strategy)
  {
    return Equality.eq( $kw68$ANYTHING, inference_datastructures_strategy.strategy_proof_spec( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 47213L)
  public static SubLObject proof_spec_admits_tacticP(final SubLObject proof_spec, final SubLObject tactic)
  {
    if( $kw68$ANYTHING == proof_spec )
    {
      return T;
    }
    if( $kw69$NOTHING == proof_spec )
    {
      return NIL;
    }
    if( NIL != inference_proof_spec.or_pattern_p( proof_spec ) )
    {
      return disjunctive_proof_spec_admits_tacticP( proof_spec, tactic );
    }
    if( NIL != meta_tactic_p( tactic ) )
    {
      return T;
    }
    if( NIL != inference_worker_removal.removal_tactic_p( tactic ) )
    {
      return proof_spec_admits_removal_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_join_ordered.join_ordered_tactic_p( tactic ) )
    {
      return proof_spec_admits_join_ordered_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_join.join_tactic_p( tactic ) )
    {
      return proof_spec_admits_join_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_split.meta_split_tactic_p( tactic ) )
    {
      return T;
    }
    if( NIL != inference_worker_split.split_tactic_p( tactic ) )
    {
      return proof_spec_admits_split_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_restriction.simplification_tactic_p( tactic ) )
    {
      return proof_spec_admits_simplification_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_removal.conjunctive_removal_tactic_p( tactic ) )
    {
      return proof_spec_admits_conjuctive_removal_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_transformation.transformation_tactic_p( tactic ) )
    {
      return proof_spec_admits_transformation_tacticP( proof_spec, tactic );
    }
    if( NIL != inference_worker_union.union_tactic_p( tactic ) )
    {
      return proof_spec_admits_union_tacticP( proof_spec, tactic );
    }
    return Errors.error( $str70$Time_to_support_proof_spec_admitt, inference_datastructures_tactic.tactic_type( tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48537L)
  public static SubLObject meta_tactic_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_tactic.tactic_p( v_object ) && ( NIL != inference_worker_removal.meta_removal_tactic_p( v_object ) || NIL != inference_worker_transformation
        .meta_transformation_tactic_p( v_object ) || NIL != inference_worker_split.meta_split_tactic_p( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48775L)
  public static SubLObject disjunctive_proof_spec_admits_tacticP(final SubLObject proof_spec, final SubLObject tactic)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( proof_spec, proof_spec, $list71 );
    operator = proof_spec.first();
    final SubLObject current = proof_spec.rest();
    SubLObject cdolist_list_var;
    final SubLObject sub_specs = cdolist_list_var = current;
    SubLObject sub_spec = NIL;
    sub_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != proof_spec_admits_tacticP( sub_spec, tactic ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_spec = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49049L)
  public static SubLObject proof_spec_admits_removal_tacticP(final SubLObject proof_spec, final SubLObject removal_tactic)
  {
    if( NIL != inference_proof_spec.removal_proof_spec_p( proof_spec ) )
    {
      return removal_proof_spec_admits_removal_tacticP( proof_spec, removal_tactic );
    }
    if( NIL != inference_proof_spec.restriction_proof_spec_p( proof_spec ) )
    {
      return restriction_proof_spec_admits_removal_tacticP( proof_spec, removal_tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49385L)
  public static SubLObject proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic)
  {
    if( NIL != inference_proof_spec.join_ordered_proof_spec_p( proof_spec ) )
    {
      return join_ordered_proof_spec_admits_join_ordered_tacticP( proof_spec, join_ordered_tactic );
    }
    if( NIL != inference_proof_spec.residual_transformation_proof_spec_p( proof_spec ) )
    {
      return residual_transformation_proof_spec_admits_join_ordered_tacticP( proof_spec, join_ordered_tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49785L)
  public static SubLObject proof_spec_admits_join_tacticP(final SubLObject proof_spec, final SubLObject join_tactic)
  {
    if( NIL != inference_proof_spec.join_proof_spec_p( proof_spec ) )
    {
      return join_proof_spec_admits_join_tacticP( proof_spec, join_tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49971L)
  public static SubLObject proof_spec_admits_split_tacticP(final SubLObject proof_spec, final SubLObject split_tactic)
  {
    if( NIL != inference_proof_spec.split_proof_spec_p( proof_spec ) )
    {
      return split_proof_spec_admits_split_proof_tacticP( proof_spec, split_tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50169L)
  public static SubLObject proof_spec_admits_simplification_tacticP(final SubLObject proof_spec, final SubLObject tactic)
  {
    if( NIL != inference_proof_spec.restriction_proof_spec_p( proof_spec ) )
    {
      return restriction_proof_spec_admits_simplification_tacticP( proof_spec, tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50379L)
  public static SubLObject proof_spec_admits_conjuctive_removal_tacticP(final SubLObject proof_spec, final SubLObject tactic)
  {
    if( NIL != inference_proof_spec.conjunctive_removal_proof_spec_p( proof_spec ) )
    {
      return conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP( proof_spec, tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50615L)
  public static SubLObject proof_spec_admits_transformation_tacticP(final SubLObject proof_spec, final SubLObject tactic)
  {
    if( NIL != inference_proof_spec.transformation_proof_spec_p( proof_spec ) )
    {
      return transformation_proof_spec_admits_transformation_tacticP( proof_spec, tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50832L)
  public static SubLObject proof_spec_admits_union_tacticP(final SubLObject proof_spec, final SubLObject union_tactic)
  {
    if( NIL != inference_proof_spec.union_proof_spec_p( proof_spec ) )
    {
      return union_proof_spec_admits_union_tacticP( proof_spec, union_tactic );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51024L)
  public static SubLObject removal_proof_spec_admits_removal_tacticP(final SubLObject removal_proof_spec, final SubLObject removal_tactic)
  {
    SubLObject removal_token = NIL;
    SubLObject literal_spec = NIL;
    SubLObject removal_module_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( removal_proof_spec, removal_proof_spec, $list72 );
    removal_token = removal_proof_spec.first();
    SubLObject current = removal_proof_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, removal_proof_spec, $list72 );
    literal_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, removal_proof_spec, $list72 );
    removal_module_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( removal_tactic );
      final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module( removal_tactic );
      return makeBoolean( NIL != literal_spec_admits_single_literal_problemP( literal_spec, problem ) && NIL != removal_module_spec_admits_removal_module( removal_module_spec, hl_module ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( removal_proof_spec, $list72 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51523L)
  public static SubLObject restriction_proof_spec_admits_removal_tacticP(final SubLObject restriction_proof_spec, final SubLObject removal_tactic)
  {
    SubLObject restriction_token = NIL;
    SubLObject sub_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( restriction_proof_spec, restriction_proof_spec, $list73 );
    restriction_token = restriction_proof_spec.first();
    SubLObject current = restriction_proof_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, restriction_proof_spec, $list73 );
    sub_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return proof_spec_admits_tacticP( sub_spec, removal_tactic );
    }
    cdestructuring_bind.cdestructuring_bind_error( restriction_proof_spec, $list73 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 51861L)
  public static SubLObject split_proof_spec_admits_split_proof_tacticP(final SubLObject split_proof_spec, final SubLObject split_tactic)
  {
    final SubLObject split_link = inference_worker_split.split_tactic_link( split_tactic );
    final SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs( split_proof_spec );
    SubLObject matchedP = NIL;
    final SubLObject link_var = split_link;
    SubLObject rest;
    SubLObject supporting_mapped_problem;
    SubLObject supporting_problem;
    SubLObject variable_map;
    SubLObject csome_list_var;
    SubLObject sub_proof_spec;
    SubLObject csome_list_var_$2;
    SubLObject tactic;
    for( rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link_var ); NIL == matchedP && NIL != rest; rest = rest.rest() )
    {
      supporting_mapped_problem = rest.first();
      if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link_var, supporting_mapped_problem ) )
      {
        supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
        variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
        if( NIL == matchedP )
        {
          csome_list_var = split_sub_proof_specs;
          sub_proof_spec = NIL;
          sub_proof_spec = csome_list_var.first();
          while ( NIL == matchedP && NIL != csome_list_var)
          {
            if( NIL == matchedP )
            {
              for( csome_list_var_$2 = inference_datastructures_problem.problem_tactics( supporting_problem ), tactic = NIL, tactic = csome_list_var_$2.first(); NIL == matchedP
                  && NIL != csome_list_var_$2; matchedP = proof_spec_admits_tacticP( sub_proof_spec, tactic ), csome_list_var_$2 = csome_list_var_$2.rest(), tactic = csome_list_var_$2.first() )
              {
              }
            }
            csome_list_var = csome_list_var.rest();
            sub_proof_spec = csome_list_var.first();
          }
        }
      }
    }
    return matchedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 52751L)
  public static SubLObject restriction_proof_spec_admits_simplification_tacticP(final SubLObject proof_spec, final SubLObject simplification_tactic)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 52922L)
  public static SubLObject conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP(final SubLObject proof_spec, final SubLObject conjunctive_removal_tactic)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53115L)
  public static SubLObject join_ordered_proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic)
  {
    final SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec( proof_spec );
    final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem( join_ordered_tactic );
    return inference_proof_spec.proof_spec_possibly_admits_problemP( focal_proof_spec, focal_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53462L)
  public static SubLObject union_proof_spec_admits_union_tacticP(final SubLObject proof_spec, final SubLObject union_tactic)
  {
    final SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec( proof_spec );
    final SubLObject disjunct_problem = inference_worker_union.union_tactic_lookahead_problem( union_tactic );
    return inference_proof_spec.proof_spec_possibly_admits_problemP( disjunct_proof_spec, disjunct_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53782L)
  public static SubLObject residual_transformation_proof_spec_admits_join_ordered_tacticP(final SubLObject proof_spec, final SubLObject join_ordered_tactic)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 53958L)
  public static SubLObject join_proof_spec_admits_join_tacticP(final SubLObject proof_spec, final SubLObject join_tactic)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 54091L)
  public static SubLObject transformation_proof_spec_admits_transformation_tacticP(final SubLObject transformation_proof_spec, final SubLObject transformation_tactic)
  {
    SubLObject transformation_token = NIL;
    SubLObject literal_spec = NIL;
    SubLObject transformation_module_spec = NIL;
    SubLObject rule_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( transformation_proof_spec, transformation_proof_spec, $list74 );
    transformation_token = transformation_proof_spec.first();
    SubLObject current = transformation_proof_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, transformation_proof_spec, $list74 );
    literal_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, transformation_proof_spec, $list74 );
    transformation_module_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, transformation_proof_spec, $list74 );
    rule_spec = current.first();
    current = current.rest();
    final SubLObject sub_spec = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, transformation_proof_spec, $list74 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( transformation_tactic );
      final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module( transformation_tactic );
      final SubLObject rule = inference_worker_transformation.transformation_tactic_rule( transformation_tactic );
      return makeBoolean( NIL != literal_spec_admits_single_literal_problemP( literal_spec, problem ) && NIL != transformation_module_spec_admits_transformation_module( transformation_module_spec, hl_module )
          && ( NIL == rule || NIL != rule_spec_admits_rule( rule_spec, rule ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( transformation_proof_spec, $list74 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 54838L)
  public static SubLObject ist_sentences_from_clause(final SubLObject clause)
  {
    SubLObject ist_sentences = NIL;
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( clause, clause, $list75 );
    neg_lits = clause.first();
    SubLObject current = clause.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, clause, $list75 );
    pos_lits = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var = neg_lits;
      SubLObject neg_lit = NIL;
      neg_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$4;
        final SubLObject datum_$3 = current_$4 = neg_lit;
        SubLObject mt = NIL;
        SubLObject sentence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$4, datum_$3, $list76 );
        mt = current_$4.first();
        current_$4 = current_$4.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$4, datum_$3, $list76 );
        sentence = current_$4.first();
        current_$4 = current_$4.rest();
        if( NIL == current_$4 )
        {
          ist_sentences = ConsesLow.cons( ConsesLow.list( $const77$ist, mt, ConsesLow.list( $const78$not, sentence ) ), ist_sentences );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$3, $list76 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        neg_lit = cdolist_list_var.first();
      }
      cdolist_list_var = pos_lits;
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$5;
        final SubLObject datum_$4 = current_$5 = pos_lit;
        SubLObject mt = NIL;
        SubLObject sentence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$5, datum_$4, $list76 );
        mt = current_$5.first();
        current_$5 = current_$5.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$5, datum_$4, $list76 );
        sentence = current_$5.first();
        current_$5 = current_$5.rest();
        if( NIL == current_$5 )
        {
          ist_sentences = ConsesLow.cons( ConsesLow.list( $const77$ist, mt, sentence ), ist_sentences );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$4, $list76 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( clause, $list75 );
    }
    return Sequences.nreverse( ist_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55333L)
  public static SubLObject single_literal_pattern_p(final SubLObject proof_spec_pattern)
  {
    return el_utilities.ist_sentence_p( proof_spec_pattern, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55445L)
  public static SubLObject literal_spec_admits_single_literal_problemP(final SubLObject literal_spec, final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject problem_mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem( problem );
    final SubLObject problem_asent = thread.secondMultipleValue();
    final SubLObject problem_sense = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject spec_mt = mt_asent_sense_from_ist_literal( literal_spec );
    final SubLObject spec_asent = thread.secondMultipleValue();
    final SubLObject spec_sense = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( problem_sense.eql( spec_sense ) && NIL != proof_spec_mt_spec_admits_mtP( spec_mt, problem_mt ) && NIL != proof_spec_asent_spec_admits_asentP( spec_asent, problem_asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 55955L)
  public static SubLObject mt_asent_sense_from_ist_literal(final SubLObject ist_literal)
  {
    final SubLObject mt = cycl_utilities.formula_arg1( ist_literal, UNPROVIDED );
    SubLObject asent = cycl_utilities.formula_arg2( ist_literal, UNPROVIDED );
    SubLObject sense = $kw79$POS;
    if( NIL != el_utilities.el_negation_p( asent ) )
    {
      sense = $kw80$NEG;
      asent = cycl_utilities.formula_arg1( asent, UNPROVIDED );
    }
    return Values.values( mt, asent, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56253L)
  public static SubLObject removal_module_spec_admits_removal_module(final SubLObject removal_module_spec, final SubLObject hl_module)
  {
    return makeBoolean( NIL != inference_modules.removal_module_p( hl_module ) && NIL != hl_module_spec_admits_hl_module( removal_module_spec, hl_module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56459L)
  public static SubLObject transformation_module_spec_admits_transformation_module(final SubLObject transformation_module_spec, final SubLObject hl_module)
  {
    return makeBoolean( NIL != inference_modules.transformation_module_p( hl_module ) && NIL != hl_module_spec_admits_hl_module( transformation_module_spec, hl_module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56700L)
  public static SubLObject proof_spec_mt_spec_admits_mtP(final SubLObject spec_mt, final SubLObject mt)
  {
    return makeBoolean( NIL != unification.unify_possible( spec_mt, mt ) || NIL != formula_pattern_match.pattern_matches_formula( spec_mt, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 56891L)
  public static SubLObject proof_spec_asent_spec_admits_asentP(final SubLObject spec_asent, final SubLObject problem_asent)
  {
    return makeBoolean( NIL != unification.unify_possible( spec_asent, problem_asent ) || NIL != formula_pattern_match.pattern_matches_formula( spec_asent, problem_asent ) || NIL != unification.unify_possible(
        conses_high.subst( variables.get_variable( ZERO_INTEGER ), $kw68$ANYTHING, spec_asent, UNPROVIDED, UNPROVIDED ), problem_asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 57257L)
  public static SubLObject hl_module_spec_admits_hl_module(final SubLObject hl_module_spec, final SubLObject hl_module)
  {
    if( NIL != inference_modules.hl_module_p( hl_module ) )
    {
      final SubLObject module_name = inference_modules.hl_module_name( hl_module );
      return pattern_match.pattern_matches_tree( hl_module_spec, module_name );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 57486L)
  public static SubLObject rule_spec_admits_rule(final SubLObject rule_spec, final SubLObject rule)
  {
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      return pattern_match.pattern_matches_tree( rule_spec, rule );
    }
    return NIL;
  }

  public static SubLObject declare_inference_tactician_strategic_uninterestingness_file()
  {
    SubLFiles.declareFunction( me, "the_unknown_strategy_uninterestingness_explanation_p", "THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_last_uninterestingness_explanation", "STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false );
    SubLFiles.declareMacro( me, "with_strategy_uninterestingness_explanations", "WITH-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS" );
    SubLFiles.declareMacro( me, "without_strategy_uninterestingness_explanations", "WITHOUT-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS" );
    SubLFiles.declareFunction( me, "strategy_note_uninterestingness_explanation", "STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false );
    SubLFiles.declareFunction( me, "strategy_possibly_note_exact_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-EXACT-UNINTERESTINGNESS-EXPLANATION", 1, 0, false );
    SubLFiles.declareMacro( me, "strategy_possibly_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION" );
    SubLFiles.declareFunction( me, "strategy_possibly_un_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-UN-NOTE-UNINTERESTINGNESS-EXPLANATION", 0, 0, false );
    SubLFiles.declareFunction( me, "strategy_uninterestingness_explanation_string", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_uninterestingness_explanation_type_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_uninterestingness_explanation_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_uninterestingness_subexplanation_p", "STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_strategy_uninterestingness_explanation", "MAKE-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false );
    SubLFiles.declareFunction( me, "strategy_uninterestingness_explanation_type", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategic_uninterestingness_reason_p", "STRATEGIC-UNINTERESTINGNESS-REASON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_chooses_to_throw_away_problemP", "STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_strategy_chooses_to_throw_away_problem", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_chooses_to_throw_away_tacticP", "STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false );
    SubLFiles.declareFunction( me, "legacy_strategy_chooses_to_throw_away_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "legacy_strategy_chooses_to_ignore_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_strategy_chooses_to_throw_away_tactic", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_chooses_to_set_aside_problemP", "STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_strategy_chooses_to_set_aside_problem", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_chooses_to_set_aside_tacticP", "STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false );
    SubLFiles.declareFunction( me, "legacy_strategy_chooses_to_set_aside_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_strategy_chooses_to_set_aside_tactic", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_chooses_to_ignore_tacticP", "STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_simple_strategy_chooses_to_throw_away_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_simple_strategy_chooses_to_throw_away_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "problem_has_executed_a_complete_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "lookahead_problem_has_executed_a_complete_removal_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_has_executed_a_generalized_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-GENERALIZED-REMOVAL-TACTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_allows_use_of_tactic_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-TACTIC-HL-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_allows_use_of_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-HL-MODULE?", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_set_aside_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_simple_strategy_chooses_to_set_aside_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_set_aside_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_set_aside_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_simple_strategy_chooses_to_set_aside_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_set_aside_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_ignore_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_ignore_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_strategically_pendingP", "PROBLEM-STRATEGICALLY-PENDING?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_deems_problem_tactically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-TACTICALLY-UNINTERESTING?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_has_enough_proofs_for_problemP", "STRATEGY-HAS-ENOUGH-PROOFS-FOR-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactically_uninteresting_problem_p", "TACTICALLY-UNINTERESTING-PROBLEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_deems_problem_strategically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-STRATEGICALLY-UNINTERESTING?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategically_uninteresting_problem_p", "STRATEGICALLY-UNINTERESTING-PROBLEM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_has_relevant_supporting_problemP", "PROBLEM-HAS-RELEVANT-SUPPORTING-PROBLEM?", 3, 0, false );
    SubLFiles.declareFunction( me, "problem_has_interesting_transformation_tacticsP", "PROBLEM-HAS-INTERESTING-TRANSFORMATION-TACTICS?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_no_tactics_strategically_possibleP", "PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_set_aside_problemP", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_inference_chooses_to_set_aside_problem", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_set_aside_problem_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_inference_chooses_to_throw_away_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "all_dependent_links_are_forbidden_transformationsP", "ALL-DEPENDENT-LINKS-ARE-FORBIDDEN-TRANSFORMATIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_forbidden_by_inferenceP", "TRANSFORMATION-FORBIDDEN-BY-INFERENCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_all_transformations_on_problemP_internal", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_all_transformations_on_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_inference_chooses_to_throw_away_all_transformations_on_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_all_transformations_on_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "collection_backchain_encouraged_problemP", "COLLECTION-BACKCHAIN-ENCOURAGED-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_uses_hl_predicateP", "PROBLEM-USES-HL-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_uses_evaluatable_predicateP", "PROBLEM-USES-EVALUATABLE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_deems_rewrite_tactic_redundantP", "SIMPLE-STRATEGY-DEEMS-REWRITE-TACTIC-REDUNDANT?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_exceeds_productivity_limitP", "TACTIC-EXCEEDS-PRODUCTIVITY-LIMIT?", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_set_aside_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_simple_strategy_chooses_to_set_aside_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_set_aside_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_set_aside_transformation_tacticP", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_inference_chooses_to_set_aside_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_set_aside_transformation_tactic_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_transformation_tacticP_internal", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_simple_strategy_chooses_to_throw_away_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_strategy_chooses_to_throw_away_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_transformation_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_inference_chooses_to_throw_away_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_chooses_to_throw_away_transformation_tactic_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "strategy_disallows_use_of_hl_module_on_problemP", "STRATEGY-DISALLOWS-USE-OF-HL-MODULE-ON-PROBLEM?", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_requires_hl_predicate_transformationP", "TACTIC-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_requires_hl_predicate_transformationP", "HL-MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "collection_backchain_encouraged_tacticP", "COLLECTION-BACKCHAIN-ENCOURAGED-TACTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_backchain_encouraged_asentP", "COLLECTION-BACKCHAIN-ENCOURAGED-ASENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_problem_uses_hl_predicateP", "TACTIC-PROBLEM-USES-HL-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_tactic_only_applies_to_hl_predicatesP", "TRANSFORMATION-TACTIC-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_only_applies_to_hl_predicatesP", "HL-MODULE-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false );
    SubLFiles.declareFunction( me, "tactic_requires_unbound_predicate_transformationP", "TACTIC-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_requires_unbound_predicate_transformationP", "HL-MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "tactic_requires_evaluatable_predicate_transformationP", "TACTIC-REQUIRES-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "tactic_completeP", "TACTIC-COMPLETE?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_incompleteP", "TACTIC-INCOMPLETE?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_impossibleP", "TACTIC-IMPOSSIBLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_preferredP", "TACTIC-PREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_dispreferredP", "TACTIC-DISPREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_disallowedP", "TACTIC-DISALLOWED?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_doomedP", "TACTIC-DOOMED?", 2, 0, false );
    SubLFiles.declareFunction( me, "tactic_disallowed_or_doomedP", "TACTIC-DISALLOWED-OR-DOOMED?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_has_executed_a_complete_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "lookahead_problem_has_executed_a_complete_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "problem_or_lookahead_problem_has_executed_a_complete_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "problem_has_executed_a_preferred_tacticP", "PROBLEM-HAS-EXECUTED-A-PREFERRED-TACTIC?", 2, 1, false );
    SubLFiles.declareFunction( me, "problem_has_executed_a_tactic_of_typeP", "PROBLEM-HAS-EXECUTED-A-TACTIC-OF-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_admits_tactic_wrt_proof_specP", "STRATEGY-ADMITS-TACTIC-WRT-PROOF-SPEC?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_admits_all_tactics_wrt_proof_specP", "STRATEGY-ADMITS-ALL-TACTICS-WRT-PROOF-SPEC?", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_tacticP", "PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "meta_tactic_p", "META-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "disjunctive_proof_spec_admits_tacticP", "DISJUNCTIVE-PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_removal_tacticP", "PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_join_ordered_tacticP", "PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_join_tacticP", "PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_split_tacticP", "PROOF-SPEC-ADMITS-SPLIT-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_simplification_tacticP", "PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_conjuctive_removal_tacticP", "PROOF-SPEC-ADMITS-CONJUCTIVE-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_transformation_tacticP", "PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_admits_union_tacticP", "PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_proof_spec_admits_removal_tacticP", "REMOVAL-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "restriction_proof_spec_admits_removal_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "split_proof_spec_admits_split_proof_tacticP", "SPLIT-PROOF-SPEC-ADMITS-SPLIT-PROOF-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "restriction_proof_spec_admits_simplification_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-ADMITS-CONJUNCTIVE-REMOVAL-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_proof_spec_admits_join_ordered_tacticP", "JOIN-ORDERED-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "union_proof_spec_admits_union_tacticP", "UNION-PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "residual_transformation_proof_spec_admits_join_ordered_tacticP", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "join_proof_spec_admits_join_tacticP", "JOIN-PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_proof_spec_admits_transformation_tacticP", "TRANSFORMATION-PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "ist_sentences_from_clause", "IST-SENTENCES-FROM-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "single_literal_pattern_p", "SINGLE-LITERAL-PATTERN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_spec_admits_single_literal_problemP", "LITERAL-SPEC-ADMITS-SINGLE-LITERAL-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_asent_sense_from_ist_literal", "MT-ASENT-SENSE-FROM-IST-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_module_spec_admits_removal_module", "REMOVAL-MODULE-SPEC-ADMITS-REMOVAL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "transformation_module_spec_admits_transformation_module", "TRANSFORMATION-MODULE-SPEC-ADMITS-TRANSFORMATION-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_mt_spec_admits_mtP", "PROOF-SPEC-MT-SPEC-ADMITS-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_spec_asent_spec_admits_asentP", "PROOF-SPEC-ASENT-SPEC-ADMITS-ASENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_module_spec_admits_hl_module", "HL-MODULE-SPEC-ADMITS-HL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "rule_spec_admits_rule", "RULE-SPEC-ADMITS-RULE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_tactician_strategic_uninterestingness_file()
  {
    $strategy_uninterestingness_explanation$ = SubLFiles.defparameter( "*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $kw0$UNINITIALIZED );
    $the_unknown_strategy_uninterestingness_explanation$ = SubLFiles.deflexical( "*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list1 );
    $strategy_gathering_uninterestingness_explanationsP$ = SubLFiles.defparameter( "*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL );
    $strategy_uninterestingness_explanation_table$ = SubLFiles.deflexical( "*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list17 );
    return NIL;
  }

  public static SubLObject setup_inference_tactician_strategic_uninterestingness_file()
  {
    access_macros.register_macro_helper( $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION );
    memoization_state.note_memoized_function( $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ );
    memoization_state.note_memoized_function( $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_tactician_strategic_uninterestingness_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_tactician_strategic_uninterestingness_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_tactician_strategic_uninterestingness_file();
  }
  static
  {
    me = new inference_tactician_strategic_uninterestingness();
    $strategy_uninterestingness_explanation$ = null;
    $the_unknown_strategy_uninterestingness_explanation$ = null;
    $strategy_gathering_uninterestingness_explanationsP$ = null;
    $strategy_uninterestingness_explanation_table$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list1 = ConsesLow.list( makeKeyword( "UNKNOWN-REASON" ), NIL, NIL, NIL, NIL );
    $sym2$CLET = makeSymbol( "CLET" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*STRATEGY-UNINTERESTINGNESS-EXPLANATION*" ), NIL ), ConsesLow.list( makeSymbol( "*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*" ), T ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*" ), NIL ) );
    $sym5$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol( "STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION" );
    $sym6$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol( "STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION" );
    $sym7$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = makeSymbol( "STRATEGY-UNINTERESTINGNESS-EXPLANATION-P" );
    $list8 = ConsesLow.list( makeSymbol( "EXPLANATION-TYPE" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "PROBLEM" ), makeSymbol( "TACTIC" ), makeSymbol( "LINK" ), makeSymbol( "SUBEXPLANATION" ) ) );
    $list9 = ConsesLow.list( makeKeyword( "PROBLEM" ), makeKeyword( "TACTIC" ), makeKeyword( "LINK" ), makeKeyword( "SUBEXPLANATION" ) );
    $kw10$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw11$PROBLEM = makeKeyword( "PROBLEM" );
    $kw12$TACTIC = makeKeyword( "TACTIC" );
    $kw13$LINK = makeKeyword( "LINK" );
    $kw14$SUBEXPLANATION = makeKeyword( "SUBEXPLANATION" );
    $sym15$PWHEN = makeSymbol( "PWHEN" );
    $sym16$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__ = makeSymbol( "*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*" );
    $list17 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION" ), makeString( ":strategy does not permit transformation at all" ) ), ConsesLow.list( makeKeyword(
        "STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION" ), makeString( ":strategy does not permit transformation with the current resource constraints" ) ), ConsesLow.list( makeKeyword( "PROBLEM-ALREADY-THROWN-AWAY" ),
            makeString( ":problem was already noted to be pending" ) ), ConsesLow.list( makeKeyword( "PROBLEM-HAS-NO-TRANSFORMATION-TACTICS" ), makeString( ":problem has no transformation tactics" ) ), ConsesLow.list(
                makeKeyword( "PROBLEM-STRATEGY-NOT-CONTINUABLE" ), makeString( ":strategy is not continuable, and :problem was set aside because :subexplanation" ) ), ConsesLow.list( makeKeyword(
                    "PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS" ), makeString( ":problem has deactivated all its active removal strategems" ) ), ConsesLow.list( makeKeyword(
                        "PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS" ), makeString( ":problem has deactivated all its active transformation strategems" ) ), ConsesLow.list( makeKeyword(
                            "PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS" ), makeString( "when determining removal strategems for :problem, :strategy found none it wished to activate" ) ), ConsesLow.list( makeKeyword(
                                "PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS" ), makeString( "when determining transformation strategems for :problem, :strategy found none it wished to activate" ) ), ConsesLow
                                    .list( makeKeyword( "PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK" ), makeString(
                                        "rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm" ) ), ConsesLow.list( makeKeyword(
                                            "DONT-DO-ABDUCTION-ON-GOOD-PROBLEM" ), makeString( "problem :problem already deemed good so :strategy discarded the abduction strategm" ) ), ConsesLow.list( makeKeyword(
                                                "DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM" ), makeString( "problem :problem has an abduced term so :strategy discarded problem wrt transformation" ) ), ConsesLow.list(
                                                    makeKeyword( "ALL-TACTICS-THROWN-AWAY" ), makeString( "all of :problem's tactics are thrown away" ) ), ConsesLow.list( makeKeyword( "NEW-ROOT-PENDING-WRT-MOTIVATION" ),
                                                        makeString( ":problem has already propagated both R and T" ) ), ConsesLow.list( makeKeyword( "PROBLEM-ALREADY-SET-ASIDE" ), makeString(
                                                            ":problem was already noted to be set aside" ) ), ConsesLow.list( makeKeyword( "ALL-TACTICS-SET-ASIDE" ), makeString(
                                                                "all of :problem's tactics are set aside" ) ), ConsesLow.list( makeKeyword( "TACTIC-ALREADY-THROWN-AWAY" ), makeString(
                                                                    ":tactic was already noted to be finished" ) ), ConsesLow.list( makeKeyword( "TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY" ), makeString(
                                                                        ":tactic is thrown away because :subexplanation" ) ), ConsesLow.list( makeKeyword( "TACTIC-HL-MODULE-THROWN-AWAY" ), makeString(
                                                                            ":tactic uses module :tactic-hl-module, which is always thrown away" ) ), ConsesLow.list( makeKeyword(
                                                                                "TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY" ), makeString(
                                                                                    "executing :tactic would motivate a problem that is thrown away because :subexplanation" ) ), ConsesLow.list( makeKeyword(
                                                                                        "SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY" ), makeString(
                                                                                            ":tactic has a sibling split tactic that is thrown away because :subexplanation" ) ), ConsesLow.list( makeKeyword(
                                                                                                "TACTIC-STRATEGY-NOT-CONTINUABLE" ), makeString(
                                                                                                    ":strategy is not continuable, and :tactic was set aside because :subexplanation" ) ), ConsesLow.list( makeKeyword(
                                                                                                        "META-REMOVAL-TACTIC-THROWN-AWAY" ), makeString(
                                                                                                            ":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed" ) ),
      ConsesLow.list( makeKeyword( "TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL" ), makeString( ":tactic has a sibling conjunctive removal tactic that is complete" ) ), ConsesLow.list( makeKeyword(
          "TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED" ), makeString( ":tactic has a sibling join-ordered tactic that focuses on a backchain required problem" ) ), ConsesLow.list( makeKeyword(
              "TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION" ), makeString( ":tactic has a sibling tactic that is a simplification" ) ), ConsesLow.list( makeKeyword(
                  "TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-HAS-EARLY-REMOVAL" ), makeString( ":tactic is thrown away because the problem has an early removal tactic" ) ), ConsesLow.list( makeKeyword(
                      "TACTIC-ALREADY-SET-ASIDE" ), makeString( ":tactic was already noted to be set aside" ) ), ConsesLow.list( makeKeyword( "TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE" ), makeString(
                          ":tactic is set aside because :subexplanation" ) ), ConsesLow.list( makeKeyword( "TACTIC-GENERATED-ENOUGH" ), makeString( ":tactic has already generated enough transformation tactics" ) ),
      ConsesLow.list( makeKeyword( "TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE" ), makeString( "executing :tactic would motivate a problem that is set aside because :subexplanation" ) ), ConsesLow.list(
          makeKeyword( "SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY" ), makeString( ":tactic has a sibling split tactic that is thrown away because :subexplanation" ) ), ConsesLow.list( makeKeyword(
              "SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE" ), makeString( ":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation" ) ), ConsesLow
                  .list( makeKeyword( "LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH" ), makeString( ":tactic leads past the :max-transformation-depth" ) ), ConsesLow.list( makeKeyword(
                      "JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS" ), makeString( ":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside" ) ), ConsesLow.list(
                          makeKeyword( "LINK-SUPPORTED-PROBLEM-THROWN-AWAY" ), makeString( ":link's supported problem is thrown away because :subexplanation" ) ), ConsesLow.list( makeKeyword(
                              "SIBLING-EARLY-REMOVAL-LINK" ), makeString( ":link has a sibling link :subexplanation" ) ), ConsesLow.list( makeKeyword( "EARLY-REMOVAL-LINK" ), makeString(
                                  ":link, which is an early removal link" ) ), ConsesLow.list( makeKeyword( "LINK-RULE-DISALLOWED" ), makeString( ":link uses a disallowed rule" ) ), ConsesLow.list( makeKeyword(
                                      "LINK-SUPPORTED-PROBLEM-SET-ASIDE" ), makeString( ":link's supported problem is set aside because :subexplanation" ) ), ConsesLow.list( makeKeyword(
                                          "LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH" ), makeString( ":link leads past the :max-transformation-depth" ) ), ConsesLow.list( makeKeyword( "UNKNOWN-REASON" ), makeString(
                                              "an unknown reason" ) )
    } );
    $list18 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "PROBLEM" ), makeSymbol( "TACTIC" ), makeSymbol( "LINK" ), makeSymbol( "SUBEXPLANATION" ) );
    $sym19$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = makeSymbol( "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P" );
    $sym20$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym21$TACTIC_P = makeSymbol( "TACTIC-P" );
    $sym22$PROBLEM_LINK_P = makeSymbol( "PROBLEM-LINK-P" );
    $list23 = ConsesLow.list( NIL, makeKeyword( "SET-ASIDE" ), makeKeyword( "THROW-AWAY" ), makeKeyword( "IRRELEVANT" ) );
    $kw24$THROW_AWAY_PROBLEM = makeKeyword( "THROW-AWAY-PROBLEM" );
    $kw25$THROW_AWAY_TACTIC = makeKeyword( "THROW-AWAY-TACTIC" );
    $kw26$SET_ASIDE_PROBLEM = makeKeyword( "SET-ASIDE-PROBLEM" );
    $kw27$SET_ASIDE_TACTIC = makeKeyword( "SET-ASIDE-TACTIC" );
    $str28$problem_is_tactically_uninteresti = makeString( "problem is tactically uninteresting" );
    $str29$strategy_has_enough_proofs_for_pr = makeString( "strategy has enough proofs for problem" );
    $str30$inference_is_not_continuable__and = makeString( "inference is not continuable, and " );
    $str31$tactic_is_discarded = makeString( "tactic is discarded" );
    $str32$non_good_problem_has_already_exec = makeString( "non-good problem has already executed a complete removal tactic" );
    $str33$rewrite_tactic_is_redundant = makeString( "rewrite tactic is redundant" );
    $str34$HL_module_is_forbidden = makeString( "HL module is forbidden" );
    $str35$the_rule_for_this_tactic_has_an_i = makeString( "the rule for this tactic has an insuffiently high historical utility" );
    $kw36$GENERALIZED_REMOVAL = makeKeyword( "GENERALIZED-REMOVAL" );
    $str37$problem_is_strategically_no_good = makeString( "problem is strategically no-good" );
    $str38$tactic_exceeds_productivity_limit = makeString( "tactic exceeds productivity limit" );
    $sym39$STRATEGIC_CONTEXT_P = makeSymbol( "STRATEGIC-CONTEXT-P" );
    $kw40$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $str41$problem_exceeds_max_proof_depth = makeString( "problem exceeds max proof depth" );
    $str42$proof_checker_mode_is_enabled_and = makeString( "proof checker mode is enabled and no allowed rules were used to link to this problem" );
    $sym43$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ = makeSymbol( "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?" );
    $str44$problem_uses_an_HL_predicate__HL_ = makeString( "problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply" );
    $str45$problem_uses_an_evaluatable_predi = makeString( "problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden" );
    $kw46$REWRITE = makeKeyword( "REWRITE" );
    $str47$problem_exceeds_max_transformatio = makeString( "problem exceeds max transformation depth" );
    $sym48$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ = makeSymbol( "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?" );
    $str49$proof_checker_mode_is_enabled__an = makeString( "proof checker mode is enabled, and the rule for this tactic is forbidden" );
    $str50$tactic_requires_HL_predicate_tran = makeString( "tactic requires HL predicate transformation, which is forbidden" );
    $str51$tactic_requires_unbound_predicate = makeString( "tactic requires unbound predicate transformation, which is forbidden" );
    $str52$tactic_requires_evaluatable_predi = makeString( "tactic requires evaluatable predicate transformation, which is forbidden" );
    $list53 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $const54$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const55$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw56$COMPLETE = makeKeyword( "COMPLETE" );
    $kw57$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw58$IMPOSSIBLE = makeKeyword( "IMPOSSIBLE" );
    $kw59$PREFERRED = makeKeyword( "PREFERRED" );
    $kw60$DISPREFERRED = makeKeyword( "DISPREFERRED" );
    $kw61$DISALLOWED = makeKeyword( "DISALLOWED" );
    $kw62$DOOMED = makeKeyword( "DOOMED" );
    $kw63$CONTENT = makeKeyword( "CONTENT" );
    $kw64$EXECUTED = makeKeyword( "EXECUTED" );
    $kw65$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $kw66$JOIN = makeKeyword( "JOIN" );
    $kw67$LOGICAL = makeKeyword( "LOGICAL" );
    $kw68$ANYTHING = makeKeyword( "ANYTHING" );
    $kw69$NOTHING = makeKeyword( "NOTHING" );
    $str70$Time_to_support_proof_spec_admitt = makeString( "Time to support proof-spec admittance on ~S tactics" );
    $list71 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "SUB-SPECS" ) );
    $list72 = ConsesLow.list( makeSymbol( "REMOVAL-TOKEN" ), makeSymbol( "LITERAL-SPEC" ), makeSymbol( "REMOVAL-MODULE-SPEC" ) );
    $list73 = ConsesLow.list( makeSymbol( "RESTRICTION-TOKEN" ), makeSymbol( "SUB-SPEC" ) );
    $list74 = ConsesLow.list( makeSymbol( "TRANSFORMATION-TOKEN" ), makeSymbol( "LITERAL-SPEC" ), makeSymbol( "TRANSFORMATION-MODULE-SPEC" ), makeSymbol( "RULE-SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
        "SUB-SPEC" ) );
    $list75 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $list76 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "SENTENCE" ) );
    $const77$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const78$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $kw79$POS = makeKeyword( "POS" );
    $kw80$NEG = makeKeyword( "NEG" );
  }
}
/*
 * 
 * Total time: 401 ms synthetic
 */