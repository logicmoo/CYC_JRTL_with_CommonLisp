//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertion_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertion_utilities";
  public static final String myFingerPrint = "0ab08b0403205f3813b3cec84279d3ea6a45638e5b2a623b98936e7c7864caea";
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16957L)
  public static SubLSymbol $excepted_assertion_max_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20669L)
  public static SubLSymbol $excepted_assertion_shallow_max_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20994L)
  public static SubLSymbol $doomed_assertion_max_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 26659L)
  private static SubLSymbol $assertion_mentions_any_of_terms_set_watermark$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 27514L)
  private static SubLSymbol $assertion_mentions_any_of_terms_set_lambda$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 28237L)
  private static SubLSymbol $assertion_mentions_any_of_terms_dict_lambda$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 38482L)
  private static SubLSymbol $newest_constant_of_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
  private static SubLSymbol $cached_self_looping_rule_assertionP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
  private static SubLSymbol $cached_self_expanding_rule_assertionP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 47186L)
  private static SubLSymbol $all_forward_rules_relevant_to_term_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 47527L)
  private static SubLSymbol $within_safe_all_forward_rules_relevant_to_termP$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50132L)
  private static SubLSymbol $all_forward_rules_relevant_to_term_argument_set$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50250L)
  private static SubLSymbol $all_forward_rules_relevant_to_term_dependent_set$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50371L)
  private static SubLSymbol $all_forward_rules_relevant_to_term_nart_set$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50489L)
  private static SubLSymbol $all_forward_rules_relevant_to_term_result_set$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 53760L)
  private static SubLSymbol $deduction_asserted_assertion_supports_deductions_processed$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 53976L)
  private static SubLSymbol $deduction_asserted_assertion_counts$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63205L)
  private static SubLSymbol $rarest_term$;
  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63294L)
  private static SubLSymbol $rarest_count$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$PROGRESS_MESSAGE;
  private static final SubLString $str4$mapping_Cyc_rules;
  private static final SubLSymbol $kw5$DONE;
  private static final SubLSymbol $sym6$DO_ITERATOR;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$MESSAGE_VAR;
  private static final SubLSymbol $sym9$TOTAL;
  private static final SubLSymbol $sym10$SOFAR;
  private static final SubLSymbol $sym11$CLET;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym15$DO_RULES;
  private static final SubLSymbol $sym16$CINC;
  private static final SubLSymbol $sym17$NOTE_PERCENT_PROGRESS;
  private static final SubLList $list18;
  private static final SubLString $str19$mapping_Cyc_GAFs;
  private static final SubLSymbol $sym20$DO_ASSERTIONS;
  private static final SubLSymbol $sym21$PWHEN;
  private static final SubLSymbol $sym22$GAF_ASSERTION_;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$PROGRESS_MESSAGE_VAR;
  private static final SubLSymbol $sym25$DO_ASSERTIONS_BACKWARDS;
  private static final SubLSymbol $sym26$SOFAR_VAR;
  private static final SubLSymbol $sym27$TOTAL_VAR;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$ID_VAR;
  private static final SubLSymbol $sym30$DO_NUMBERS;
  private static final SubLSymbol $kw31$START;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$END;
  private static final SubLSymbol $kw34$DELTA;
  private static final SubLSymbol $sym35$FIND_ASSERTION_BY_ID;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$DEDUCTION;
  private static final SubLSymbol $sym38$DO_ASSERTION_DEPENDENTS;
  private static final SubLSymbol $sym39$DEDUCTION_ASSERTION;
  private static final SubLSymbol $sym40$ASSERTION_P;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$ARGUMENT;
  private static final SubLSymbol $sym44$DO_ASSERTION_ARGUMENTS;
  private static final SubLSymbol $sym45$DEDUCTION_P;
  private static final SubLSymbol $sym46$DO_DEDUCTION_SUPPORTS;
  private static final SubLString $str47$Gathering_mt_relevant_dependents_;
  private static final SubLString $str48$_assertions;
  private static final SubLObject $const49$except;
  private static final SubLString $str50$Removing_;
  private static final SubLString $str51$_mt_relevant_dependents;
  private static final SubLString $str52$Deduction__A_supporting_missing_K;
  private static final SubLString $str53$deduction_dependent_deductions_ca;
  private static final SubLSymbol $kw54$TRUE;
  private static final SubLSymbol $kw55$FALSE;
  private static final SubLSymbol $kw56$UNKNOWN;
  private static final SubLObject $const57$NLSemanticPredicate;
  private static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const59$EverythingPSC;
  private static final SubLSymbol $sym60$_EXIT;
  private static final SubLObject $const61$obsoleteRule;
  private static final SubLObject $const62$isa;
  private static final SubLObject $const63$genls;
  private static final SubLSymbol $sym64$ABNORMAL_ASSERTION_P;
  private static final SubLObject $const65$exceptMt;
  private static final SubLSymbol $sym66$SUPPORT_P;
  private static final SubLObject $const67$assertedMoreSpecifically;
  private static final SubLInteger $int68$30;
  private static final SubLSymbol $sym69$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA;
  private static final SubLSymbol $sym70$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA;
  private static final SubLInteger $int71$10000;
  private static final SubLSymbol $kw72$GAF;
  private static final SubLSymbol $kw73$RULE;
  private static final SubLSymbol $sym74$ASSERTED_WHEN;
  private static final SubLSymbol $sym75$INTEGERP;
  private static final SubLSymbol $sym76$ASSERTED_SECOND;
  private static final SubLSymbol $sym77$EL_VAR_NAME;
  private static final SubLObject $const78$knownSentence;
  private static final SubLObject $const79$unknownSentence;
  private static final SubLSymbol $sym80$FORWARD_ASSERTION_;
  private static final SubLSymbol $sym81$ASSERTION_DEPENDENT_COUNT;
  private static final SubLString $str82$Sorting_newest_constants___Part_2;
  private static final SubLSymbol $sym83$STRINGP;
  private static final SubLSymbol $kw84$SKIP;
  private static final SubLString $str85$Computing_newest_constants;
  private static final SubLString $str86$Sorting_newest_constants___Part_1;
  private static final SubLSymbol $sym87$ASSERTION_HAS_META_ASSERTIONS_;
  private static final SubLList $list88;
  private static final SubLString $str89$Return_T_iff_ASSERTION_has_some_m;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$ALL_META_ASSERTIONS;
  private static final SubLSymbol $sym93$RULE_ASSERTION_;
  private static final SubLObject $const94$meetsPragmaticRequirement;
  private static final SubLSymbol $sym95$META_ASSERTION_P;
  private static final SubLSymbol $sym96$HLMT_P;
  private static final SubLSymbol $sym97$ASSERTION_LIST_P;
  private static final SubLSymbol $sym98$ASSERTION_MT;
  private static final SubLSymbol $sym99$SAFE__;
  private static final SubLSymbol $sym100$ASSERTION_ID;
  private static final SubLSymbol $sym101$TERM__;
  private static final SubLSymbol $sym102$DEFINITIONAL_PRED__;
  private static final SubLSymbol $sym103$GAF_PREDICATE;
  private static final SubLSymbol $sym104$GAF_ARG1;
  private static final SubLSymbol $sym105$ISA_HL_VAR_THING_LIT_;
  private static final SubLString $str106$Type_constraint__Mt_should_be_can;
  private static final SubLString $str107$Expected_a_single_DNF_clause_of_c;
  private static final SubLSymbol $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_;
  private static final SubLSymbol $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_;
  private static final SubLSymbol $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_;
  private static final SubLSymbol $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_;
  private static final SubLInteger $int112$212;
  private static final SubLSymbol $sym113$FORT_P;
  private static final SubLSymbol $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED;
  private static final SubLSymbol $sym115$_;
  private static final SubLSymbol $kw116$ALL;
  private static final SubLSymbol $sym117$NON_DOTTED_LIST_P;
  private static final SubLList $list118;
  private static final SubLObject $const119$trueRule;
  private static final SubLSymbol $kw120$ARGUMENT_;
  private static final SubLSymbol $kw121$DEPENDENT_;
  private static final SubLString $str122$can_t_handle_argument__S_yet;
  private static final SubLString $str123$can_t_handle_sub_support__S_yet;
  private static final SubLString $str124$gathering_exception_rules;
  private static final SubLString $str125$gathering_pragma_rules;
  private static final SubLString $str126$gathering_lifting_rules;
  private static final SubLObject $const127$ist;
  private static final SubLObject $const128$universalLiftingRule;
  private static final SubLString $str129$__;
  private static final SubLSymbol $sym130$FALSE;
  private static final SubLString $str131$Verifying_that_all_embedded_asser;
  private static final SubLString $str132$Looking_for_assertions_with_no_ar;
  private static final SubLString $str133$mapping_Cyc_assertions;
  private static final SubLSymbol $kw134$UNSPECIFIED;
  private static final SubLSymbol $sym135$UPDATE_RAREST_TERM;
  private static final SubLSymbol $sym136$_;
  private static final SubLSymbol $sym137$MEMOIZED_ASSERTION_TERM_RARITY;

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 996L)
  public static SubLObject do_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rule_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    rule_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str4$mapping_Cyc_rules;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw5$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == progress_message )
    {
      return ConsesLow.listS( $sym6$DO_ITERATOR, ConsesLow.list( rule_var, $list7, $kw5$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject message_var = $sym8$MESSAGE_VAR;
    final SubLObject total = $sym9$TOTAL;
    final SubLObject sofar = $sym10$SOFAR;
    return ConsesLow.list( $sym11$CLET, ConsesLow.list( ConsesLow.list( message_var, progress_message ), reader.bq_cons( total, $list12 ), reader.bq_cons( sofar, $list13 ) ), ConsesLow.list(
        $sym14$NOTING_PERCENT_PROGRESS, message_var, ConsesLow.listS( $sym15$DO_RULES, ConsesLow.list( rule_var, $kw3$PROGRESS_MESSAGE, NIL, $kw5$DONE, done ), ConsesLow.list( $sym16$CINC, sofar ), ConsesLow.list(
            $sym17$NOTE_PERCENT_PROGRESS, sofar, total ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 1994L)
  public static SubLObject do_gafs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gaf_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    gaf_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list18 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list18 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str19$mapping_Cyc_GAFs;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw5$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym20$DO_ASSERTIONS, ConsesLow.list( gaf_var, progress_message, $kw5$DONE, done ), ConsesLow.listS( $sym21$PWHEN, ConsesLow.list( $sym22$GAF_ASSERTION_, gaf_var ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 2421L)
  public static SubLObject do_assertions_backwards(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    assertion_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list23 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list23 );
      if( NIL == conses_high.member( current_$3, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw3$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw5$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !progress_message.isAtom() )
    {
      final SubLObject progress_message_var = $sym24$PROGRESS_MESSAGE_VAR;
      return ConsesLow.list( $sym11$CLET, ConsesLow.list( ConsesLow.list( progress_message_var, progress_message ) ), ConsesLow.listS( $sym25$DO_ASSERTIONS_BACKWARDS, ConsesLow.list( assertion_var, $kw3$PROGRESS_MESSAGE,
          progress_message_var, $kw5$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    if( NIL != progress_message )
    {
      final SubLObject sofar_var = $sym26$SOFAR_VAR;
      final SubLObject total_var = $sym27$TOTAL_VAR;
      return ConsesLow.list( $sym11$CLET, ConsesLow.list( reader.bq_cons( total_var, $list28 ), reader.bq_cons( sofar_var, $list13 ) ), ConsesLow.list( $sym14$NOTING_PERCENT_PROGRESS, progress_message, ConsesLow.listS(
          $sym25$DO_ASSERTIONS_BACKWARDS, ConsesLow.list( assertion_var, $kw5$DONE, done ), ConsesLow.list( $sym17$NOTE_PERCENT_PROGRESS, sofar_var, total_var ), ConsesLow.list( $sym16$CINC, sofar_var ), ConsesLow
              .append( body, NIL ) ) ) );
    }
    final SubLObject id_var = $sym29$ID_VAR;
    return ConsesLow.list( $sym30$DO_NUMBERS, ConsesLow.list( new SubLObject[] { id_var, $kw31$START, $list32, $kw33$END, MINUS_ONE_INTEGER, $kw34$DELTA, MINUS_ONE_INTEGER, $kw5$DONE, done
    } ), ConsesLow.list( $sym11$CLET, ConsesLow.list( ConsesLow.list( assertion_var, ConsesLow.list( $sym35$FIND_ASSERTION_BY_ID, id_var ) ) ), ConsesLow.listS( $sym21$PWHEN, assertion_var, ConsesLow.append( body,
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 3435L)
  public static SubLObject do_assertion_dependent_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dependent_assertion = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    dependent_assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
    assertion = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject deduction = $sym37$DEDUCTION;
      return ConsesLow.list( $sym38$DO_ASSERTION_DEPENDENTS, ConsesLow.list( deduction, assertion ), ConsesLow.list( $sym11$CLET, ConsesLow.list( ConsesLow.list( dependent_assertion, ConsesLow.list(
          $sym39$DEDUCTION_ASSERTION, deduction ) ) ), ConsesLow.listS( $sym21$PWHEN, ConsesLow.list( $sym40$ASSERTION_P, dependent_assertion ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 3754L)
  public static SubLObject do_assertion_supporting_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject supporting_assertion = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    supporting_assertion = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    assertion = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list41 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list41 );
      if( NIL == conses_high.member( current_$4, $list42, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw5$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject argument = $sym43$ARGUMENT;
    return ConsesLow.list( $sym44$DO_ASSERTION_ARGUMENTS, ConsesLow.list( argument, assertion, $kw5$DONE, done ), ConsesLow.list( $sym21$PWHEN, ConsesLow.list( $sym45$DEDUCTION_P, argument ), ConsesLow.list(
        $sym46$DO_DEDUCTION_SUPPORTS, ConsesLow.list( supporting_assertion, argument, $kw5$DONE, done ), ConsesLow.listS( $sym21$PWHEN, ConsesLow.list( $sym40$ASSERTION_P, supporting_assertion ), ConsesLow.append( body,
            NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 4136L)
  public static SubLObject assertion_list_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == assertion_handles.assertion_p( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 4472L)
  public static SubLObject list_of_rule_assertion_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.non_dotted_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject subobject = NIL;
      subobject = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == assertions_high.rule_assertionP( subobject ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        subobject = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 4727L)
  public static SubLObject assertion_dependent_assertions(final SubLObject assertion)
  {
    if( NIL != assertions_high.assertion_has_dependents_p( assertion ) )
    {
      SubLObject result_set = set_contents.new_set_contents( assertions_high.assertion_dependent_count( assertion ), Symbols.symbol_function( EQL ) );
      final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
      SubLObject basis_object;
      SubLObject state;
      SubLObject deduction;
      SubLObject dependent_supported_object;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        deduction = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
        {
          dependent_supported_object = deductions_high.deduction_supported_object( deduction );
          if( NIL != assertion_handles.assertion_p( dependent_supported_object ) )
          {
            result_set = set_contents.set_contents_add( dependent_supported_object, result_set, Symbols.symbol_function( EQL ) );
          }
        }
      }
      return set_contents.set_contents_element_list( result_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 5374L)
  public static SubLObject remove_relevant_assertion_dependents(final SubLObject assertion, final SubLObject possibly_relevant_mt)
  {
    return remove_relevant_assertions_dependents( ConsesLow.list( assertion ), possibly_relevant_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 5647L)
  public static SubLObject remove_relevant_assertions_dependents(final SubLObject assertions, final SubLObject possibly_relevant_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject checked_deduction_count = ZERO_INTEGER;
    SubLObject removed_deduction_count = ZERO_INTEGER;
    SubLObject checked_deductions = set_contents.new_set_contents( UNPROVIDED, UNPROVIDED );
    SubLObject deductions_to_check = NIL;
    SubLObject deductions_to_remove = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
      SubLObject basis_object;
      SubLObject state;
      SubLObject dependent;
      SubLObject item_var;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        dependent = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, dependent ) )
        {
          item_var = dependent;
          if( NIL == conses_high.member( item_var, deductions_to_check, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            deductions_to_check = ConsesLow.cons( item_var, deductions_to_check );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    SubLObject _prev_bind_0 = utilities_macros.$percent_progress_delayed_mode_seconds$.currentBinding( thread );
    SubLObject _prev_bind_2 = utilities_macros.$percent_progress_delayed_mode_string$.currentBinding( thread );
    SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    SubLObject _prev_bind_5 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    SubLObject _prev_bind_6 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$percent_progress_delayed_mode_seconds$.bind( THREE_INTEGER, thread );
      utilities_macros.$percent_progress_delayed_mode_string$.bind( Sequences.cconcatenate( $str47$Gathering_mt_relevant_dependents_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( assertions ) ),
        $str48$_assertions
      } ), thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str47$Gathering_mt_relevant_dependents_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( assertions ) ),
          $str48$_assertions
        } ) );
        while ( NIL != deductions_to_check)
        {
          final SubLObject deduction = deductions_to_check.first();
          deductions_to_check = deductions_to_check.rest();
          if( NIL != assertion_handles.assertion_p( deductions_high.deduction_supported_object( deduction ) ) && NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP( deductions_high.deduction_mt(
              deduction ), possibly_relevant_mt, UNPROVIDED ) )
          {
            final SubLObject possible_assertion = deductions_high.deduction_supported_object( deduction );
            SubLObject deduction_excepting_its_own_supportP = NIL;
            if( NIL != assertion_handles.assertion_p( possible_assertion ) && NIL != gaf_assertion_with_pred_p( possible_assertion, $const49$except ) && NIL != list_utilities.member_equalP( assertions_high.gaf_arg1(
                possible_assertion ), deductions_high.deduction_supports( deduction ) ) )
            {
              deduction_excepting_its_own_supportP = T;
            }
            if( NIL == deduction_excepting_its_own_supportP )
            {
              deductions_to_remove = ConsesLow.cons( deduction, deductions_to_remove );
            }
          }
          SubLObject cdolist_list_var2 = deduction_dependent_deductions( deduction );
          SubLObject sub_deduction = NIL;
          sub_deduction = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( NIL == set_contents.set_contents_memberP( sub_deduction, checked_deductions, UNPROVIDED ) )
            {
              deductions_to_check = ConsesLow.cons( sub_deduction, deductions_to_check );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            sub_deduction = cdolist_list_var2.first();
          }
          checked_deductions = set_contents.set_contents_add( deduction, checked_deductions, UNPROVIDED );
          checked_deduction_count = Numbers.add( checked_deduction_count, ONE_INTEGER );
          utilities_macros.note_percent_progress( set_contents.set_contents_size( checked_deductions ), Numbers.add( set_contents.set_contents_size( checked_deductions ), Sequences.length( deductions_to_check ) ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_6, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_5, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_4, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_3, thread );
      utilities_macros.$percent_progress_delayed_mode_string$.rebind( _prev_bind_2, thread );
      utilities_macros.$percent_progress_delayed_mode_seconds$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = utilities_macros.$percent_progress_delayed_mode_seconds$.currentBinding( thread );
    _prev_bind_2 = utilities_macros.$percent_progress_delayed_mode_string$.currentBinding( thread );
    _prev_bind_3 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    _prev_bind_4 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    _prev_bind_5 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    _prev_bind_6 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$percent_progress_delayed_mode_seconds$.bind( THREE_INTEGER, thread );
      utilities_macros.$percent_progress_delayed_mode_string$.bind( Sequences.cconcatenate( $str50$Removing_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( deductions_to_remove ) ),
        $str51$_mt_relevant_dependents
      } ), thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str50$Removing_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( deductions_to_remove ) ),
          $str51$_mt_relevant_dependents
        } ) );
        SubLObject cdolist_list_var3 = deductions_to_remove;
        SubLObject deduction2 = NIL;
        deduction2 = cdolist_list_var3.first();
        while ( NIL != cdolist_list_var3)
        {
          if( NIL != deduction_handles.valid_deductionP( deduction2, UNPROVIDED ) )
          {
            tms.tms_remove_deduction( deduction2 );
            removed_deduction_count = Numbers.add( removed_deduction_count, ONE_INTEGER );
          }
          cdolist_list_var3 = cdolist_list_var3.rest();
          deduction2 = cdolist_list_var3.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_6, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_5, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_4, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_3, thread );
      utilities_macros.$percent_progress_delayed_mode_string$.rebind( _prev_bind_2, thread );
      utilities_macros.$percent_progress_delayed_mode_seconds$.rebind( _prev_bind_0, thread );
    }
    return removed_deduction_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 8337L)
  public static SubLObject deduction_dependent_deductions(final SubLObject deduction)
  {
    final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
    if( NIL != assertion_handles.assertion_p( supported_object ) )
    {
      return assertions_high.assertion_dependent_list( supported_object );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( supported_object ) )
    {
      return kb_hl_supports_interface.kb_kb_hl_support_dependents( supported_object );
    }
    if( NIL == arguments.hl_support_p( supported_object ) )
    {
      Errors.warn( $str53$deduction_dependent_deductions_ca, deduction_handles.deduction_id( deduction ), supported_object );
      return NIL;
    }
    final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support( supported_object );
    if( NIL == kb_hl_support )
    {
      Errors.warn( $str52$Deduction__A_supporting_missing_K, deduction, supported_object );
      return NIL;
    }
    return kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 9183L)
  public static SubLObject assertion_dependent_supported_object_counts(final SubLObject assertion)
  {
    if( NIL != assertions_high.assertion_has_dependents_p( assertion ) )
    {
      SubLObject assertion_set = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQL ) );
      SubLObject kb_hl_support_set = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) );
      SubLObject clause_struct_set = set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQL ) );
      final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
      SubLObject basis_object;
      SubLObject state;
      SubLObject deduction;
      SubLObject dependent_supported_object;
      SubLObject clause_struct;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        deduction = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
        {
          dependent_supported_object = deductions_high.deduction_supported_object( deduction );
          if( NIL != assertion_handles.assertion_p( dependent_supported_object ) )
          {
            assertion_set = set_contents.set_contents_add( dependent_supported_object, assertion_set, Symbols.symbol_function( EQL ) );
            clause_struct = assertions_low.assertion_clause_struc( dependent_supported_object );
            if( NIL != clause_struct )
            {
              clause_struct_set = set_contents.set_contents_add( clause_struct, clause_struct_set, UNPROVIDED );
            }
            else
            {
              clause_struct_set = set_contents.set_contents_add( dependent_supported_object, clause_struct_set, UNPROVIDED );
            }
          }
          else if( NIL != kb_hl_support_handles.kb_hl_support_p( dependent_supported_object ) )
          {
            kb_hl_support_set = set_contents.set_contents_add( dependent_supported_object, kb_hl_support_set, Symbols.symbol_function( EQUAL ) );
          }
          else if( NIL != arguments.hl_support_p( dependent_supported_object ) )
          {
            kb_hl_support_set = set_contents.set_contents_add( dependent_supported_object, kb_hl_support_set, Symbols.symbol_function( EQUAL ) );
          }
        }
      }
      return Values.values( set_contents.set_contents_size( assertion_set ), set_contents.set_contents_size( kb_hl_support_set ), set_contents.set_contents_size( clause_struct_set ) );
    }
    return Values.values( ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 10990L)
  public static SubLObject true_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.assertion_has_truthP( assertion, $kw54$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11119L)
  public static SubLObject false_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.assertion_has_truthP( assertion, $kw55$FALSE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11250L)
  public static SubLObject unknown_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.assertion_has_truthP( assertion, $kw56$UNKNOWN ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11385L)
  public static SubLObject true_gaf_assertionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( v_object ) && NIL != true_assertionP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11501L)
  public static SubLObject false_gaf_assertionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( v_object ) && NIL != false_assertionP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11619L)
  public static SubLObject nl_semantic_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != isa.isa_in_any_mtP( cycl_utilities.formula_operator( assertions_high.assertion_formula( assertion ) ), $const57$NLSemanticPredicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 11890L)
  public static SubLObject obsolete_ruleP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      return Numbers.numG( kb_indexing.num_gaf_arg_index( assertion, ONE_INTEGER, $const61$obsoleteRule, UNPROVIDED ), ZERO_INTEGER );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12014L)
  public static SubLObject assertion_matches_typeP(final SubLObject assertion, final SubLObject type_spec)
  {
    return makeBoolean( NIL == type_spec || NIL != assertions_high.assertion_has_typeP( assertion, type_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12155L)
  public static SubLObject assertion_matches_truthP(final SubLObject assertion, final SubLObject truth_spec)
  {
    return makeBoolean( NIL == truth_spec || NIL != assertions_high.assertion_has_truth( assertion, truth_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12300L)
  public static SubLObject assertion_matches_directionP(final SubLObject assertion, final SubLObject direction_spec)
  {
    return makeBoolean( NIL == direction_spec || NIL != assertions_high.assertion_has_direction( assertion, direction_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12465L)
  public static SubLObject assertion_matches_truth_and_directionP(final SubLObject assertion, final SubLObject truth_spec, final SubLObject direction_spec)
  {
    return makeBoolean( NIL != assertion_matches_truthP( assertion, truth_spec ) && NIL != assertion_matches_directionP( assertion, direction_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12684L)
  public static SubLObject assertion_matches_type_truth_and_directionP(final SubLObject assertion, final SubLObject type_spec, final SubLObject truth_spec, final SubLObject direction_spec)
  {
    return makeBoolean( NIL != assertion_matches_typeP( assertion, type_spec ) && NIL != assertion_matches_truthP( assertion, truth_spec ) && NIL != assertion_matches_directionP( assertion, direction_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 12970L)
  public static SubLObject gaf_has_term_in_argnumP(final SubLObject assertion, final SubLObject v_term, final SubLObject argnum)
  {
    final SubLObject arg = assertions_high.gaf_arg( assertion, argnum );
    return Equality.equal( v_term, arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 13106L)
  public static SubLObject gaf_has_term_in_some_argnumP(final SubLObject assertion, final SubLObject v_term)
  {
    return el_utilities.term_is_one_of_argsP( v_term, assertions_high.gaf_formula( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 13313L)
  public static SubLObject true_gaf_assertion_with_pred_p(final SubLObject assertion, final SubLObject pred)
  {
    return makeBoolean( NIL != true_assertionP( assertion ) && pred.eql( assertions_high.gaf_predicate( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 13700L)
  public static SubLObject gaf_assertion_with_pred_p(final SubLObject assertion, final SubLObject pred)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && pred.eql( assertions_high.gaf_predicate( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 14021L)
  public static SubLObject gaf_assertion_has_pred_p(final SubLObject gaf_assertion, final SubLObject pred)
  {
    return Equality.eql( pred, assertions_high.gaf_predicate( gaf_assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 14279L)
  public static SubLObject gaf_assertion_with_any_of_preds_p(final SubLObject assertion, final SubLObject pred_list)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return subl_promotions.memberP( assertions_high.gaf_predicate( assertion ), pred_list, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 14589L)
  public static SubLObject isa_gaf_p(final SubLObject assertion)
  {
    return gaf_assertion_with_pred_p( assertion, $const62$isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15130L)
  public static SubLObject genls_gaf_p(final SubLObject assertion)
  {
    return gaf_assertion_with_pred_p( assertion, $const63$genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15297L)
  public static SubLObject assertion_cnf_with_el_vars_only(final SubLObject assertion)
  {
    return cycl_utilities.cnf_sublis_el_variables( assertions_high.assertion_cnf( assertion ), assertions_high.assertion_el_variables( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15546L)
  public static SubLObject except_when_rule_p(final SubLObject v_object)
  {
    if( NIL != assertions_high.rule_assertionP( v_object ) )
    {
      SubLObject cdolist_list_var = clauses.pos_lits( assertions_high.assertion_cnf( v_object ) );
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_abnormal_p( pos_lit ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 15876L)
  public static SubLObject except_for_gaf_p(final SubLObject v_object)
  {
    if( NIL != assertions_high.gaf_assertionP( v_object ) && NIL != el_utilities.el_abnormal_p( assertions_high.gaf_formula( v_object ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16172L)
  public static SubLObject abnormal_assertion_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != except_when_rule_p( v_object ) || NIL != except_for_gaf_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16292L)
  public static SubLObject abnormal_literal_from_assertion(final SubLObject assertion)
  {
    assert NIL != abnormal_assertion_p( assertion ) : assertion;
    if( NIL != except_for_gaf_p( assertion ) )
    {
      return clause_utilities.gaf_cnf_literal( assertions_high.assertion_cnf( assertion ) );
    }
    SubLObject cdolist_list_var = clauses.pos_lits( assertions_high.assertion_cnf( assertion ) );
    SubLObject pos_lit = NIL;
    pos_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_abnormal_p( pos_lit ) )
      {
        return pos_lit;
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 16652L)
  public static SubLObject somewhere_excepted_assertionP(final SubLObject assertion, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      result = excepted_assertionP_int( assertion, NIL, justifyP, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 17018L)
  public static SubLObject excepted_assertionP(final SubLObject assertion, SubLObject justifyP, SubLObject depth)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = $excepted_assertion_max_depth$.getDynamicValue();
    }
    if( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() )
    {
      return NIL;
    }
    return excepted_assertionP_int( assertion, NIL, justifyP, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 17455L)
  public static SubLObject excepted_assertion_in_any_mtP(final SubLObject assertion, SubLObject justifyP, SubLObject depth)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = $excepted_assertion_max_depth$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      return excepted_assertionP_int( assertion, NIL, justifyP, depth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 17654L)
  public static SubLObject excepted_assertionP_int(final SubLObject assertion, SubLObject checked_assertions, SubLObject justifyP, SubLObject depth)
  {
    if( checked_assertions == UNPROVIDED )
    {
      checked_assertions = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( depth.isInteger() && depth.numLE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( NIL == assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == checked_assertions )
    {
      checked_assertions = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
    }
    if( NIL != set.set_memberP( assertion, checked_assertions ) )
    {
      return NIL;
    }
    set.set_add( assertion, checked_assertions );
    SubLObject excepted_assertionP = NIL;
    SubLObject justification = NIL;
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    if( NIL != forts.fort_p( mt ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const65$exceptMt, mt, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject exceptions = kb_mapping_utilities.pred_value_gafs( mt, $const65$exceptMt, ONE_INTEGER, UNPROVIDED );
      if( NIL == excepted_assertionP )
      {
        SubLObject csome_list_var = exceptions;
        SubLObject exception = NIL;
        exception = csome_list_var.first();
        while ( NIL == excepted_assertionP && NIL != csome_list_var)
        {
          if( NIL == excepted_assertionP_int( exception, checked_assertions, NIL, depth.isInteger() ? Numbers.subtract( depth, ONE_INTEGER ) : NIL ) )
          {
            excepted_assertionP = T;
            final SubLObject item_var = exception;
            if( NIL == conses_high.member( item_var, justification, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              justification = ConsesLow.cons( item_var, justification );
            }
          }
          csome_list_var = csome_list_var.rest();
          exception = csome_list_var.first();
        }
      }
    }
    if( NIL == excepted_assertionP && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const49$except, assertion, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject exceptions = kb_mapping_utilities.pred_value_gafs( assertion, $const49$except, ONE_INTEGER, UNPROVIDED );
      if( NIL == excepted_assertionP )
      {
        SubLObject csome_list_var = exceptions;
        SubLObject exception = NIL;
        exception = csome_list_var.first();
        while ( NIL == excepted_assertionP && NIL != csome_list_var)
        {
          if( NIL == excepted_assertionP_int( exception, checked_assertions, NIL, depth.isInteger() ? Numbers.subtract( depth, ONE_INTEGER ) : NIL ) )
          {
            excepted_assertionP = T;
            final SubLObject item_var = exception;
            if( NIL == conses_high.member( item_var, justification, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              justification = ConsesLow.cons( item_var, justification );
            }
          }
          csome_list_var = csome_list_var.rest();
          exception = csome_list_var.first();
        }
      }
    }
    if( NIL == excepted_assertionP )
    {
      SubLObject non_excepted_support_foundP = NIL;
      SubLObject some_excepted_support_justification = NIL;
      SubLObject rest;
      SubLObject argument;
      SubLObject excepted_support_foundP;
      SubLObject rest_$7;
      SubLObject support;
      SubLObject excepted_supportP;
      for( rest = NIL, rest = assertions_high.assertion_arguments( assertion ); NIL == non_excepted_support_foundP && NIL != rest; rest = rest.rest() )
      {
        argument = rest.first();
        if( NIL != arguments.asserted_argument_p( argument ) )
        {
          non_excepted_support_foundP = T;
        }
        else
        {
          for( excepted_support_foundP = NIL, rest_$7 = NIL, rest_$7 = deductions_high.deduction_supports( argument ); NIL == excepted_support_foundP && NIL != rest_$7; rest_$7 = rest_$7.rest() )
          {
            support = rest_$7.first();
            if( NIL != assertion_handles.assertion_p( support ) )
            {
              excepted_supportP = excepted_assertionP_int( support, checked_assertions, justifyP, depth.isInteger() ? Numbers.subtract( depth, ONE_INTEGER ) : NIL );
              if( NIL != excepted_supportP )
              {
                excepted_support_foundP = T;
                some_excepted_support_justification = excepted_supportP;
              }
            }
          }
          if( NIL == excepted_support_foundP )
          {
            non_excepted_support_foundP = T;
          }
        }
      }
      excepted_assertionP = makeBoolean( NIL == non_excepted_support_foundP && NIL != some_excepted_support_justification );
      if( NIL != excepted_assertionP && NIL != justifyP )
      {
        justification = some_excepted_support_justification;
      }
    }
    return ( NIL != justifyP ) ? justification : excepted_assertionP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20446L)
  public static SubLObject excepted_assertion_in_mtP(final SubLObject assertion, final SubLObject mt, SubLObject justifyP, SubLObject depth)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = excepted_assertionP( assertion, justifyP, depth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 20736L)
  public static SubLObject excepted_assertion_in_mtP_shallow(final SubLObject assertion, final SubLObject mt, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = excepted_assertionP( assertion, justifyP, $excepted_assertion_shallow_max_depth$.getDynamicValue( thread ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 21217L)
  public static SubLObject doomed_assertionP(final SubLObject assertion, SubLObject justifyP, SubLObject depth)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = $doomed_assertion_max_depth$.getDynamicValue();
    }
    if( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() )
    {
      return NIL;
    }
    return doomed_assertionP_int( assertion, NIL, justifyP, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 21648L)
  public static SubLObject doomed_assertionP_int(final SubLObject assertion, SubLObject checked_assertions, SubLObject justifyP, SubLObject depth)
  {
    if( checked_assertions == UNPROVIDED )
    {
      checked_assertions = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( depth.isInteger() && depth.numLE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( NIL == assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == checked_assertions )
    {
      checked_assertions = set.new_set( Symbols.symbol_function( EQL ), ZERO_INTEGER );
    }
    if( NIL != set.set_memberP( assertion, checked_assertions ) )
    {
      return NIL;
    }
    set.set_add( assertion, checked_assertions );
    SubLObject doomed_assertionP = NIL;
    SubLObject justification = NIL;
    if( NIL == doomed_assertionP && NIL == assertions_high.assertion_arguments( assertion ) )
    {
      doomed_assertionP = T;
      if( NIL == conses_high.member( assertion, justification, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        justification = ConsesLow.cons( assertion, justification );
      }
    }
    if( NIL == doomed_assertionP && NIL == doomed_assertionP )
    {
      SubLObject csome_list_var = cycl_utilities.expression_gather( assertions_high.assertion_cnf( assertion ), $sym40$ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject sub_assertion = NIL;
      sub_assertion = csome_list_var.first();
      while ( NIL == doomed_assertionP && NIL != csome_list_var)
      {
        final SubLObject doomed_supportP = doomed_assertionP_int( sub_assertion, checked_assertions, justifyP, depth.isInteger() ? Numbers.subtract( depth, ONE_INTEGER ) : NIL );
        if( NIL != doomed_supportP )
        {
          doomed_assertionP = T;
          final SubLObject item_var = sub_assertion;
          if( NIL == conses_high.member( item_var, justification, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            justification = ConsesLow.cons( item_var, justification );
          }
        }
        csome_list_var = csome_list_var.rest();
        sub_assertion = csome_list_var.first();
      }
    }
    if( NIL == doomed_assertionP )
    {
      SubLObject non_doomed_support_foundP = NIL;
      SubLObject some_doomed_support_justification = NIL;
      SubLObject rest;
      SubLObject argument;
      SubLObject doomed_support_foundP;
      SubLObject rest_$8;
      SubLObject support;
      SubLObject doomed_supportP2;
      for( rest = NIL, rest = assertions_high.assertion_arguments( assertion ); NIL == non_doomed_support_foundP && NIL != rest; rest = rest.rest() )
      {
        argument = rest.first();
        if( NIL != arguments.asserted_argument_p( argument ) )
        {
          non_doomed_support_foundP = T;
        }
        else
        {
          for( doomed_support_foundP = NIL, rest_$8 = NIL, rest_$8 = deductions_high.deduction_supports( argument ); NIL == doomed_support_foundP && NIL != rest_$8; rest_$8 = rest_$8.rest() )
          {
            support = rest_$8.first();
            if( NIL != assertion_handles.assertion_p( support ) )
            {
              doomed_supportP2 = doomed_assertionP_int( support, checked_assertions, justifyP, depth.isInteger() ? Numbers.subtract( depth, ONE_INTEGER ) : NIL );
              if( NIL != doomed_supportP2 )
              {
                doomed_support_foundP = T;
                some_doomed_support_justification = doomed_supportP2;
              }
            }
          }
          if( NIL == doomed_support_foundP )
          {
            non_doomed_support_foundP = T;
          }
        }
      }
      doomed_assertionP = makeBoolean( NIL == non_doomed_support_foundP && NIL != some_doomed_support_justification );
      if( NIL != doomed_assertionP && NIL != justifyP )
      {
        justification = some_doomed_support_justification;
      }
    }
    return ( NIL != justifyP ) ? justification : doomed_assertionP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 23974L)
  public static SubLObject assertion_matches_mtP(final SubLObject assertion)
  {
    return mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24155L)
  public static SubLObject assertion_has_argumentsP(final SubLObject assertion)
  {
    return list_utilities.sublisp_boolean( assertions_high.assertion_arguments( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24358L)
  public static SubLObject assertion_argument_count(final SubLObject assertion)
  {
    return Sequences.length( assertions_high.assertion_arguments( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24461L)
  public static SubLObject assertion_has_deduction_with_supportP(final SubLObject assertion, final SubLObject support)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.support_p( support ) : support;
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject deduction = NIL;
    deduction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.deduction_p( deduction ) )
      {
        SubLObject cdolist_list_var_$9 = deductions_high.deduction_supports( deduction );
        SubLObject deduction_support = NIL;
        deduction_support = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          if( NIL != arguments.support_equal( deduction_support, support ) )
          {
            return T;
          }
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          deduction_support = cdolist_list_var_$9.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      deduction = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 24903L)
  public static SubLObject assertion_has_dependent_with_supportP(final SubLObject assertion, final SubLObject support)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.support_p( support ) : support;
    final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
    SubLObject basis_object;
    SubLObject state;
    SubLObject deduction;
    SubLObject cdolist_list_var;
    SubLObject deduction_support;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
      {
        cdolist_list_var = deductions_high.deduction_supports( deduction );
        deduction_support = NIL;
        deduction_support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != arguments.support_equal( deduction_support, support ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          deduction_support = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 25351L)
  public static SubLObject assertion_has_dependent_with_supportP_kb_hl_support_aware_version(final SubLObject assertion, final SubLObject support)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.support_p( support ) : support;
    SubLObject deductions_to_check = NIL;
    final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
    SubLObject basis_object;
    SubLObject state;
    SubLObject deduction;
    SubLObject supported_object;
    SubLObject item_var;
    SubLObject cdolist_list_var;
    SubLObject dependent_deduction;
    SubLObject item_var2;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      deduction = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
      {
        supported_object = deductions_high.deduction_supported_object( deduction );
        if( NIL != assertion_handles.assertion_p( supported_object ) )
        {
          item_var = deduction;
          if( NIL == conses_high.member( item_var, deductions_to_check, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            deductions_to_check = ConsesLow.cons( item_var, deductions_to_check );
          }
        }
        else
        {
          cdolist_list_var = deduction_dependent_deductions( deduction );
          dependent_deduction = NIL;
          dependent_deduction = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            item_var2 = dependent_deduction;
            if( NIL == conses_high.member( item_var2, deductions_to_check, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              deductions_to_check = ConsesLow.cons( item_var2, deductions_to_check );
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent_deduction = cdolist_list_var.first();
          }
        }
      }
    }
    SubLObject cdolist_list_var2 = deductions_to_check;
    SubLObject deduction_to_check = NIL;
    deduction_to_check = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject cdolist_list_var_$10 = deductions_high.deduction_supports( deduction_to_check );
      SubLObject deduction_support = NIL;
      deduction_support = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        if( NIL != arguments.support_equal( deduction_support, support ) )
        {
          return T;
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        deduction_support = cdolist_list_var_$10.first();
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      deduction_to_check = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 26376L)
  public static SubLObject assertion_mentions_asserted_more_specificallyP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != cycl_utilities.assertion_find( $const67$assertedMoreSpecifically, assertion, NIL, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 26873L)
  public static SubLObject assertion_mentions_any_of_termsP(final SubLObject assertion, final SubLObject terms)
  {
    if( NIL != list_utilities.lengthG( terms, $assertion_mentions_any_of_terms_set_watermark$.getGlobalValue(), UNPROVIDED ) )
    {
      final SubLObject term_set = set_utilities.construct_set_from_list( terms, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      return assertion_mentions_any_of_terms_in_setP( assertion, term_set );
    }
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.assertion_mentions_termP( assertion, v_term ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 27587L)
  public static SubLObject assertion_mentions_any_of_terms_in_set_lambda(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return set.set_memberP( v_object, $assertion_mentions_any_of_terms_set_lambda$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 27734L)
  public static SubLObject assertion_mentions_any_of_terms_in_setP(final SubLObject assertion, final SubLObject term_set)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject resultP = NIL;
    final SubLObject _prev_bind_0 = $assertion_mentions_any_of_terms_set_lambda$.currentBinding( thread );
    try
    {
      $assertion_mentions_any_of_terms_set_lambda$.bind( term_set, thread );
      resultP = list_utilities.sublisp_boolean( cycl_utilities.assertion_find_if( $sym69$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA, assertion, T, UNPROVIDED ) );
    }
    finally
    {
      $assertion_mentions_any_of_terms_set_lambda$.rebind( _prev_bind_0, thread );
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 28311L)
  public static SubLObject assertion_mentions_any_of_terms_in_dict_lambda(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary_utilities.dictionary_has_keyP( $assertion_mentions_any_of_terms_dict_lambda$.getDynamicValue( thread ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 28468L)
  public static SubLObject assertion_mentions_any_of_terms_in_dictionary_keysP(final SubLObject assertion, final SubLObject term_dictionary)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject resultP = NIL;
    final SubLObject _prev_bind_0 = $assertion_mentions_any_of_terms_dict_lambda$.currentBinding( thread );
    try
    {
      $assertion_mentions_any_of_terms_dict_lambda$.bind( term_dictionary, thread );
      resultP = list_utilities.sublisp_boolean( cycl_utilities.assertion_find_if( $sym70$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA, assertion, T, UNPROVIDED ) );
    }
    finally
    {
      $assertion_mentions_any_of_terms_dict_lambda$.rebind( _prev_bind_0, thread );
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 29016L)
  public static SubLObject random_gaf_with_pred(final SubLObject pred)
  {
    return random_gaf_with_predicate( pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 29102L)
  public static SubLObject random_gaf_with_predicate(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ).numG( $int71$10000 ) )
    {
      while ( NIL == gaf_assertion_with_pred_p( result, pred ))
      {
        result = assertions_high.random_assertion( UNPROVIDED );
      }
    }
    else
    {
      final SubLObject total = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
      final SubLObject i = random.random( total );
      SubLObject count = ZERO_INTEGER;
      SubLObject result_$11 = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$13 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
            SubLObject done_var = result_$11;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw72$GAF, NIL, NIL );
                  SubLObject done_var_$14 = result_$11;
                  final SubLObject token_var_$15 = NIL;
                  while ( NIL == done_var_$14)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$15 );
                    final SubLObject valid_$16 = makeBoolean( !token_var_$15.eql( gaf ) );
                    if( NIL != valid_$16 )
                    {
                      if( i.numE( count ) )
                      {
                        result_$11 = gaf;
                      }
                      else
                      {
                        count = Numbers.add( count, ONE_INTEGER );
                      }
                    }
                    done_var_$14 = makeBoolean( NIL == valid_$16 || NIL != result_$11 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != result_$11 );
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
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$13, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 29621L)
  public static SubLObject random_gaf_with_predicate_and_arg(final SubLObject pred, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total = kb_indexing.num_gaf_arg_index( arg, argnum, pred, UNPROVIDED );
    final SubLObject i = random.random( total );
    SubLObject count = ZERO_INTEGER;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg, argnum, pred ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg, argnum, pred );
        SubLObject done_var = result;
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw72$GAF, NIL, NIL );
              SubLObject done_var_$18 = result;
              final SubLObject token_var_$19 = NIL;
              while ( NIL == done_var_$18)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$19 );
                final SubLObject valid_$20 = makeBoolean( !token_var_$19.eql( gaf ) );
                if( NIL != valid_$20 )
                {
                  if( i.numE( count ) )
                  {
                    result = gaf;
                  }
                  else
                  {
                    count = Numbers.add( count, ONE_INTEGER );
                  }
                }
                done_var_$18 = makeBoolean( NIL == valid_$20 || NIL != result );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != result );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30047L)
  public static SubLObject random_rule_mentioning(final SubLObject fort)
  {
    return list_utilities.random_element( rules_mentioning( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30143L)
  public static SubLObject rules_mentioning(final SubLObject fort)
  {
    SubLObject result = NIL;
    if( NIL != kb_mapping_macros.do_term_index_key_validator( fort, $kw73$RULE ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( fort, $kw73$RULE );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw73$RULE, NIL, NIL );
            SubLObject done_var_$22 = NIL;
            final SubLObject token_var_$23 = NIL;
            while ( NIL == done_var_$22)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$23 );
              final SubLObject valid_$24 = makeBoolean( !token_var_$23.eql( ass ) );
              if( NIL != valid_$24 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( ass, final_index_spec ) )
              {
                result = ConsesLow.cons( ass, result );
              }
              done_var_$22 = makeBoolean( NIL == valid_$24 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30303L)
  public static SubLObject rule_count_mentioning(final SubLObject fort)
  {
    SubLObject count = ZERO_INTEGER;
    if( NIL != kb_mapping_macros.do_term_index_key_validator( fort, $kw73$RULE ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( fort, $kw73$RULE );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw73$RULE, NIL, NIL );
            SubLObject done_var_$25 = NIL;
            final SubLObject token_var_$26 = NIL;
            while ( NIL == done_var_$25)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
              final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( ass ) );
              if( NIL != valid_$27 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( ass, final_index_spec ) )
              {
                count = Numbers.add( count, ONE_INTEGER );
              }
              done_var_$25 = makeBoolean( NIL == valid_$27 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30529L)
  public static SubLObject random_assertions(final SubLObject n)
  {
    SubLObject result = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      result = ConsesLow.cons( assertions_high.random_assertion( UNPROVIDED ), result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 30686L)
  public static SubLObject assertion_earlierP(final SubLObject assertion1, final SubLObject assertion2)
  {
    final SubLObject date1 = assertions_high.asserted_when( assertion1 );
    final SubLObject date2 = assertions_high.asserted_when( assertion2 );
    if( NIL == date1 )
    {
      return NIL;
    }
    if( NIL == date2 )
    {
      return NIL;
    }
    if( date1.numL( date2 ) )
    {
      return T;
    }
    if( date1.numG( date2 ) )
    {
      return NIL;
    }
    final SubLObject second1 = assertions_high.asserted_second( assertion1 );
    final SubLObject second2 = assertions_high.asserted_second( assertion2 );
    if( NIL == second1 )
    {
      return NIL;
    }
    if( NIL == second2 )
    {
      return NIL;
    }
    if( second1.numL( second2 ) )
    {
      return T;
    }
    if( second1.numG( second2 ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 31446L)
  public static SubLObject assertion_laterP(final SubLObject assertion1, final SubLObject assertion2)
  {
    final SubLObject date1 = assertions_high.asserted_when( assertion1 );
    final SubLObject date2 = assertions_high.asserted_when( assertion2 );
    if( NIL == date1 )
    {
      return NIL;
    }
    if( NIL == date2 )
    {
      return NIL;
    }
    if( date1.numG( date2 ) )
    {
      return T;
    }
    if( date1.numL( date2 ) )
    {
      return NIL;
    }
    final SubLObject second1 = assertions_high.asserted_second( assertion1 );
    final SubLObject second2 = assertions_high.asserted_second( assertion2 );
    if( NIL == second1 )
    {
      return NIL;
    }
    if( NIL == second2 )
    {
      return NIL;
    }
    if( second1.numG( second2 ) )
    {
      return T;
    }
    if( second1.numL( second2 ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 32202L)
  public static SubLObject earliest_assertion(final SubLObject assertions)
  {
    if( NIL == assertions )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( assertions ) )
    {
      return assertions.first();
    }
    final SubLObject dates = Mapping.mapcar( $sym74$ASSERTED_WHEN, assertions );
    if( NIL == list_utilities.every_in_list( $sym75$INTEGERP, dates, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject earliest_date = number_utilities.minimum( dates, UNPROVIDED );
    SubLObject earliest_date_assertions = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( earliest_date.numE( assertions_high.asserted_when( ass ) ) )
      {
        earliest_date_assertions = ConsesLow.cons( ass, earliest_date_assertions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    if( NIL != list_utilities.singletonP( earliest_date_assertions ) )
    {
      return earliest_date_assertions.first();
    }
    final SubLObject times = Mapping.mapcar( $sym76$ASSERTED_SECOND, earliest_date_assertions );
    if( NIL == list_utilities.every_in_list( $sym75$INTEGERP, times, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject earliest_time = number_utilities.minimum( times, UNPROVIDED );
    SubLObject earliest_time_assertions = NIL;
    SubLObject cdolist_list_var2 = earliest_date_assertions;
    SubLObject ass2 = NIL;
    ass2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( earliest_time.numE( assertions_high.asserted_second( ass2 ) ) )
      {
        earliest_time_assertions = ConsesLow.cons( ass2, earliest_time_assertions );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      ass2 = cdolist_list_var2.first();
    }
    if( NIL != list_utilities.singletonP( earliest_time_assertions ) )
    {
      return earliest_time_assertions.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 33367L)
  public static SubLObject rename_assertion_variables(final SubLObject assertion, final SubLObject rename_variable_map)
  {
    final SubLObject assertion_old_el_variables = assertions_high.assertion_el_variables( assertion );
    final SubLObject assertion_new_el_variables = bindings.apply_bindings( rename_variable_map, assertion_old_el_variables );
    final SubLObject assertion_new_el_variable_names = Mapping.mapcar( $sym77$EL_VAR_NAME, assertion_new_el_variables );
    assertions_interface.kb_set_assertion_variable_names( assertion, assertion_new_el_variable_names );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 34221L)
  public static SubLObject possibly_rename_assertion_variables(final SubLObject assertion, final SubLObject rename_variable_alist)
  {
    if( NIL != el_utilities.simple_variable_rename_impossibleP( assertion, rename_variable_alist ) )
    {
      return NIL;
    }
    return rename_assertion_variables( assertion, rename_variable_alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 34754L)
  public static SubLObject assertion_antecedent_query_formula(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject antecedent_lits = clauses.neg_lits( assertions_high.assertion_cnf( assertion ) );
    final SubLObject antecedent_dnf = clauses.make_dnf( NIL, antecedent_lits );
    final SubLObject antecedent_hl_formula = clauses.dnf_formula( antecedent_dnf );
    return fi.perform_fi_substitutions( conses_high.copy_tree( antecedent_hl_formula ), assertions_high.assertion_el_variables( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 35202L)
  public static SubLObject assertion_known_extent_query_formula(final SubLObject assertion)
  {
    return assertion_known_extent_query_formula_int( assertion, $const78$knownSentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 35419L)
  public static SubLObject assertion_unknown_extent_query_formula(final SubLObject assertion)
  {
    return assertion_known_extent_query_formula_int( assertion, $const79$unknownSentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 35644L)
  public static SubLObject assertion_known_extent_query_formula_int(final SubLObject assertion, final SubLObject known_pred)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject antecedent_lits = clauses.neg_lits( assertions_high.assertion_cnf( assertion ) );
    final SubLObject antecedent_dnf = clauses.make_dnf( NIL, antecedent_lits );
    final SubLObject antecedent_hl_formula = clauses.dnf_formula( antecedent_dnf );
    final SubLObject consequent_lits = clauses.pos_lits( assertions_high.assertion_cnf( assertion ) );
    final SubLObject consequent_dnf = clauses.make_dnf( NIL, consequent_lits );
    final SubLObject consequent_hl_formula = clauses.dnf_formula( consequent_dnf );
    final SubLObject known_consequent_formula = el_utilities.make_unary_formula( known_pred, consequent_hl_formula );
    final SubLObject query_hl_formula = simplifier.simplify_cycl_sentence( el_utilities.make_conjunction( ConsesLow.list( antecedent_hl_formula, known_consequent_formula ) ), UNPROVIDED );
    return fi.perform_fi_substitutions( conses_high.copy_tree( query_hl_formula ), assertions_high.assertion_el_variables( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 36418L)
  public static SubLObject assertion_info(final SubLObject assertion)
  {
    return ConsesLow.list( fi.assertion_hl_formula( assertion, UNPROVIDED ), assertions_high.assertion_mt( assertion ), assertions_high.cyc_assertion_tv( assertion ), assertions_high.assertion_direction( assertion ),
        assertions_high.assertion_arguments( assertion ), assertions_high.gaf_assertionP( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 36741L)
  public static SubLObject assertion_literal_count(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return ONE_INTEGER;
    }
    return rule_literal_count( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 36888L)
  public static SubLObject rule_literal_count(final SubLObject rule)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    return clause_utilities.clause_literal_count( cnf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37006L)
  public static SubLObject assertion_supporting_assertions(final SubLObject assertion)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.deduction_p( argument ) )
      {
        SubLObject cdolist_list_var_$28 = deductions_high.deduction_supports( argument );
        SubLObject supporting_assertion = NIL;
        supporting_assertion = cdolist_list_var_$28.first();
        while ( NIL != cdolist_list_var_$28)
        {
          if( NIL != assertion_handles.assertion_p( supporting_assertion ) )
          {
            result = ConsesLow.cons( supporting_assertion, result );
          }
          cdolist_list_var_$28 = cdolist_list_var_$28.rest();
          supporting_assertion = cdolist_list_var_$28.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37234L)
  public static SubLObject assertion_supporting_forward_assertions(final SubLObject assertion)
  {
    return list_utilities.remove_if_not( $sym80$FORWARD_ASSERTION_, assertion_supporting_assertions( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37391L)
  public static SubLObject assertion_cheapest_forward_supporting_assertion(final SubLObject assertion)
  {
    final SubLObject supporting_forward_assertions = assertion_supporting_forward_assertions( assertion );
    return ( NIL != supporting_forward_assertions ) ? number_utilities.minimum( supporting_forward_assertions, $sym81$ASSERTION_DEPENDENT_COUNT ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 37911L)
  public static SubLObject assertion_universal_time(final SubLObject assertion)
  {
    final SubLObject universal_second = assertions_high.asserted_second( assertion );
    if( NIL != universal_second )
    {
      final SubLObject universal_date = assertions_high.asserted_when( assertion );
      if( NIL != universal_date )
      {
        return numeric_date_utilities.universal_time_from_date_and_second( universal_date, universal_second );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 38723L)
  public static SubLObject all_assertions_sorted_by_creation_time_estimate()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = $newest_constant_of_assertions$.currentBinding( thread );
    try
    {
      $newest_constant_of_assertions$.bind( NIL, thread );
      initialize_newest_constant_table();
      final SubLObject idx = constant_handles.do_constants_table();
      final SubLObject mess = $str82$Sorting_newest_constants___Part_2;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0_$29 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$30 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$30, $kw84$SKIP ) )
          {
            final SubLObject idx_$31 = idx_$30;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$31, $kw84$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$31 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject constant;
              SubLObject cdolist_list_var;
              SubLObject assertions;
              SubLObject ass;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                constant = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( constant ) )
                  {
                    constant = $kw84$SKIP;
                  }
                  assertions = ( cdolist_list_var = Hashtables.gethash( constant, $newest_constant_of_assertions$.getDynamicValue( thread ), NIL ) );
                  ass = NIL;
                  ass = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    v_answer = ConsesLow.cons( ass, v_answer );
                    cdolist_list_var = cdolist_list_var.rest();
                    ass = cdolist_list_var.first();
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$32 = idx_$30;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$32 ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$32 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$32 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$32 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw84$SKIP ) ) ? NIL : $kw84$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
                {
                  SubLObject cdolist_list_var2;
                  final SubLObject assertions2 = cdolist_list_var2 = Hashtables.gethash( constant2, $newest_constant_of_assertions$.getDynamicValue( thread ), NIL );
                  SubLObject ass2 = NIL;
                  ass2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    v_answer = ConsesLow.cons( ass2, v_answer );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ass2 = cdolist_list_var2.first();
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$29, thread );
      }
    }
    finally
    {
      $newest_constant_of_assertions$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 39219L)
  public static SubLObject assertion_newest_constant(final SubLObject assertion)
  {
    SubLObject newest_suid = MINUS_ONE_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject constants = cdolist_list_var = assertions_high.assertion_constants( assertion );
    SubLObject constant = NIL;
    constant = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
      {
        final SubLObject suid = constant_handles.constant_suid( constant );
        if( suid.numG( newest_suid ) )
        {
          newest_suid = suid;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constant = cdolist_list_var.first();
    }
    return constant_handles.find_constant_by_suid( newest_suid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 39738L)
  public static SubLObject initialize_newest_constant_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $newest_constant_of_assertions$.setDynamicValue( Hashtables.make_hash_table( constant_handles.constant_count(), Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str85$Computing_newest_constants;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$34 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$34, $kw84$SKIP ) )
        {
          final SubLObject idx_$35 = idx_$34;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$35, $kw84$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$35 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            SubLObject newest_constant;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw84$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                newest_constant = assertion_newest_constant( ass );
                Hashtables.sethash( newest_constant, $newest_constant_of_assertions$.getDynamicValue( thread ), ConsesLow.cons( ass, Hashtables.gethash( newest_constant, $newest_constant_of_assertions$.getDynamicValue(
                    thread ), NIL ) ) );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$36 = idx_$34;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$36 ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$36 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$36 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$36 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw84$SKIP ) ) ? NIL : $kw84$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                final SubLObject newest_constant2 = assertion_newest_constant( ass2 );
                Hashtables.sethash( newest_constant2, $newest_constant_of_assertions$.getDynamicValue( thread ), ConsesLow.cons( ass2, Hashtables.gethash( newest_constant2, $newest_constant_of_assertions$
                    .getDynamicValue( thread ), NIL ) ) );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    final SubLObject table_var = $newest_constant_of_assertions$.getDynamicValue( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str86$Sorting_newest_constants___Part_1, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject constant = NIL;
        SubLObject assertions = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            constant = Hashtables.getEntryKey( cdohash_entry );
            assertions = Hashtables.getEntryValue( cdohash_entry );
            Hashtables.sethash( constant, $newest_constant_of_assertions$.getDynamicValue( thread ), Sequences.nreverse( assertions ) );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_8, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_5, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 40294L)
  public static SubLObject assertion_has_meta_assertionsP(final SubLObject assertion)
  {
    enforceType( assertion, $sym40$ASSERTION_P );
    return list_utilities.sublisp_boolean( assertions_low.assertion_index( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 40637L)
  public static SubLObject all_meta_assertions(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == assertion_has_meta_assertionsP( assertion ) )
    {
      return NIL;
    }
    final SubLObject meta_assertions = kb_accessors.all_term_assertions( assertion, UNPROVIDED );
    return Sequences.delete_duplicates( ConsesLow.nconc( meta_assertions, Mapping.mapcan( Symbols.symbol_function( $sym92$ALL_META_ASSERTIONS ), meta_assertions, EMPTY_SUBL_OBJECT_ARRAY ) ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 41272L)
  public static SubLObject meta_assertion_list_for_editing(final SubLObject assertion)
  {
    final SubLObject meta_assertions = all_meta_assertions( assertion );
    SubLObject meta_assertion_list = NIL;
    SubLObject cdolist_list_var = meta_assertions;
    SubLObject meta_assertion = NIL;
    meta_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      meta_assertion_list = ConsesLow.cons( ConsesLow.list( meta_assertion, assertions_high.assertion_mt( meta_assertion ) ), meta_assertion_list );
      cdolist_list_var = cdolist_list_var.rest();
      meta_assertion = cdolist_list_var.first();
    }
    return Sequences.nreverse( meta_assertion_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 41605L)
  public static SubLObject meta_assertion_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != cycl_utilities.assertion_find_if( $sym40$ASSERTION_P, assertion, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 41808L)
  public static SubLObject rule_meta_assertion_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != cycl_utilities.assertion_find_if( $sym93$RULE_ASSERTION_, assertion, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 42012L)
  public static SubLObject pragmatic_requirement_rule_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertions_high.rule_assertionP( assertion ) && NIL != rule_meta_assertion_p( assertion ) && NIL != removal_modules_formula_arg_n.formula_has_operatorP( clauses.pos_lits( assertions_high
        .assertion_cnf( assertion ) ).first(), $const94$meetsPragmaticRequirement ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 42330L)
  public static SubLObject meta_assertion_el_formula(final SubLObject meta_assertion, final SubLObject assertion, final SubLObject assertion_indexical)
  {
    assert NIL != meta_assertion_p( meta_assertion ) : meta_assertion;
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject meta_assertion_el_formula = uncanonicalizer.assertion_el_formula( meta_assertion );
    if( NIL != cycl_utilities.expression_find( assertion, assertions_high.assertion_cons( meta_assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != hlmt.hlmt_equal( assertions_high.assertion_mt( assertion ), assertions_high.assertion_mt( meta_assertion ) ) )
      {
        final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula( assertion );
        meta_assertion_el_formula = cycl_utilities.expression_subst( assertion_indexical, assertion_el_formula, meta_assertion_el_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      else
      {
        final SubLObject assertion_el_ist_formula = uncanonicalizer.assertion_el_ist_formula( assertion );
        meta_assertion_el_formula = cycl_utilities.expression_subst( assertion_indexical, assertion_el_ist_formula, meta_assertion_el_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
    }
    return meta_assertion_el_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 43375L)
  public static SubLObject mt_of_assertions_p(final SubLObject mt, final SubLObject assertions)
  {
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != assertion_list_p( assertions ) : assertions;
    SubLObject mal_mtP = NIL;
    if( NIL == mal_mtP )
    {
      SubLObject csome_list_var;
      SubLObject assertion;
      for( csome_list_var = assertions, assertion = NIL, assertion = csome_list_var.first(); NIL == mal_mtP && NIL != csome_list_var; mal_mtP = makeBoolean( NIL == hlmt.hlmt_equal( mt, assertions_high.assertion_mt(
          assertion ) ) ), csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL == mal_mtP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 43769L)
  public static SubLObject assertions_of_mt(final SubLObject assertions, final SubLObject mt)
  {
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != assertion_list_p( assertions ) : assertions;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != hlmt.hlmt_equal( mt, assertions_high.assertion_mt( assertion ) ) )
      {
        result = ConsesLow.cons( assertion, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44130L)
  public static SubLObject mts_of_assertions(final SubLObject assertions)
  {
    assert NIL != assertion_list_p( assertions ) : assertions;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( assertions_high.assertion_mt( assertion ), result );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44482L)
  public static SubLObject assertions_min_mt(final SubLObject assertions)
  {
    final SubLObject mts = genl_mts.min_mts( Mapping.mapcar( $sym98$ASSERTION_MT, assertions ), UNPROVIDED );
    if( NIL != list_utilities.singletonP( mts ) )
    {
      return list_utilities.only_one( mts );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44765L)
  public static SubLObject sort_assertions(final SubLObject assertions)
  {
    return Sort.sort( assertions, Symbols.symbol_function( $sym99$SAFE__ ), Symbols.symbol_function( $sym100$ASSERTION_ID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 44979L)
  public static SubLObject sort_gafs_by_term(SubLObject gafs, SubLObject term_sort_func, SubLObject pred_sort_func)
  {
    if( term_sort_func == UNPROVIDED )
    {
      term_sort_func = $sym101$TERM__;
    }
    if( pred_sort_func == UNPROVIDED )
    {
      pred_sort_func = $sym102$DEFINITIONAL_PRED__;
    }
    gafs = sort_assertions( gafs );
    gafs = Sort.stable_sort( gafs, pred_sort_func, Symbols.symbol_function( $sym103$GAF_PREDICATE ) );
    gafs = Sort.stable_sort( gafs, term_sort_func, Symbols.symbol_function( $sym104$GAF_ARG1 ) );
    return gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 45274L)
  public static SubLObject rule_type_constraints(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    final SubLObject mt = assertions_high.assertion_mt( rule );
    SubLObject constraints = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_check_inter_arg_genlP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_inter_arg_isaP$.bind( T, thread );
      at_vars.$at_check_inter_arg_genlP$.bind( T, thread );
      constraints = at_var_types.hl_cnf_variables_arg_constraints( cnf, mt );
    }
    finally
    {
      at_vars.$at_check_inter_arg_genlP$.rebind( _prev_bind_2, thread );
      at_vars.$at_check_inter_arg_isaP$.rebind( _prev_bind_0, thread );
    }
    constraints = Sequences.remove_if( $sym105$ISA_HL_VAR_THING_LIT_, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != constraints && NIL != cycl_utilities.formula_args( constraints, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject dnf_constraint_clauses = clausifier.dnf_clausal_form( constraints, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == hlmt.hlmt_equal( new_mt, mt ) )
      {
        Errors.warn( $str106$Type_constraint__Mt_should_be_can, mt, new_mt );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( dnf_constraint_clauses ) )
      {
        Errors.error( $str107$Expected_a_single_DNF_clause_of_c, rule, dnf_constraint_clauses );
      }
      return dnf_constraint_clauses.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46238L)
  public static SubLObject self_looping_ruleP(final SubLObject rule)
  {
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      return cached_self_looping_rule_assertionP( rule );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
  public static SubLObject clear_cached_self_looping_rule_assertionP()
  {
    final SubLObject cs = $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
  public static SubLObject remove_cached_self_looping_rule_assertionP(final SubLObject rule)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue(), ConsesLow.list( rule ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
  public static SubLObject cached_self_looping_rule_assertionP_internal(final SubLObject rule)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    SubLObject cdolist_list_var = clauses.pos_lits( cnf );
    SubLObject pos_lit = NIL;
    pos_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$39 = clauses.neg_lits( cnf );
      SubLObject neg_lit = NIL;
      neg_lit = cdolist_list_var_$39.first();
      while ( NIL != cdolist_list_var_$39)
      {
        if( NIL != unification.unify_possible( pos_lit, neg_lit ) )
        {
          return T;
        }
        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
        neg_lit = cdolist_list_var_$39.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos_lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46389L)
  public static SubLObject cached_self_looping_rule_assertionP(final SubLObject rule)
  {
    SubLObject caching_state = $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_, $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_self_looping_rule_assertionP_internal( rule ) ) );
      memoization_state.caching_state_put( caching_state, rule, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46643L)
  public static SubLObject self_expanding_ruleP(final SubLObject rule)
  {
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      return cached_self_expanding_rule_assertionP( rule );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
  public static SubLObject clear_cached_self_expanding_rule_assertionP()
  {
    final SubLObject cs = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
  public static SubLObject remove_cached_self_expanding_rule_assertionP(final SubLObject rule)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue(), ConsesLow.list( rule ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
  public static SubLObject cached_self_expanding_rule_assertionP_internal(final SubLObject rule)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    SubLObject witness;
    SubLObject rest;
    SubLObject pos_lit;
    SubLObject count;
    SubLObject cdolist_list_var;
    SubLObject neg_lit;
    for( witness = NIL, rest = NIL, rest = clauses.pos_lits( cnf ); NIL == witness && NIL != rest; rest = rest.rest() )
    {
      pos_lit = rest.first();
      count = ZERO_INTEGER;
      cdolist_list_var = clauses.neg_lits( cnf );
      neg_lit = NIL;
      neg_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != unification.unify_possible( pos_lit, neg_lit ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        neg_lit = cdolist_list_var.first();
      }
      if( count.numGE( TWO_INTEGER ) )
      {
        witness = pos_lit;
      }
    }
    return list_utilities.sublisp_boolean( witness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 46800L)
  public static SubLObject cached_self_expanding_rule_assertionP(final SubLObject rule)
  {
    SubLObject caching_state = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_, $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_self_expanding_rule_assertionP_internal( rule ) ) );
      memoization_state.caching_state_put( caching_state, rule, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 47666L)
  public static SubLObject safe_all_forward_rules_relevant_to_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject rules = NIL;
    SubLObject threshold_exceededP = NIL;
    try
    {
      thread.throwStack.push( $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED );
      final SubLObject _prev_bind_0 = $within_safe_all_forward_rules_relevant_to_termP$.currentBinding( thread );
      try
      {
        $within_safe_all_forward_rules_relevant_to_termP$.bind( T, thread );
        rules = all_forward_rules_relevant_to_term_int( fort );
      }
      finally
      {
        $within_safe_all_forward_rules_relevant_to_termP$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      threshold_exceededP = Errors.handleThrowable( ccatch_env_var, $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED );
    }
    finally
    {
      thread.throwStack.pop();
    }
    rules = Sort.sort( rules, Symbols.symbol_function( $sym115$_ ), Symbols.symbol_function( $sym81$ASSERTION_DEPENDENT_COUNT ) );
    if( NIL != threshold_exceededP )
    {
      return $kw116$ALL;
    }
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 48276L)
  public static SubLObject all_forward_rules_relevant_to_term(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject rules = all_forward_rules_relevant_to_term_int( fort );
    rules = Sort.sort( rules, Symbols.symbol_function( $sym115$_ ), Symbols.symbol_function( $sym81$ASSERTION_DEPENDENT_COUNT ) );
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 48738L)
  public static SubLObject safe_all_forward_rules_relevant_to_terms(final SubLObject v_forts)
  {
    return possibly_safe_all_forward_rules_relevant_to_terms( v_forts, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 48872L)
  public static SubLObject all_forward_rules_relevant_to_terms(final SubLObject v_forts)
  {
    return possibly_safe_all_forward_rules_relevant_to_terms( v_forts, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 49003L)
  public static SubLObject possibly_safe_all_forward_rules_relevant_to_term(final SubLObject fort, final SubLObject safeP)
  {
    return ( NIL != safeP ) ? safe_all_forward_rules_relevant_to_term( fort ) : all_forward_rules_relevant_to_term( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 49216L)
  public static SubLObject possibly_safe_all_forward_rules_relevant_to_terms(final SubLObject v_forts, final SubLObject safeP)
  {
    assert NIL != list_utilities.non_dotted_list_p( v_forts ) : v_forts;
    SubLObject cdolist_list_var = v_forts;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject rules = NIL;
    cdolist_list_var = v_forts;
    SubLObject fort = NIL;
    fort = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$40 = possibly_safe_all_forward_rules_relevant_to_term( fort, safeP );
      SubLObject rule = NIL;
      rule = cdolist_list_var_$40.first();
      while ( NIL != cdolist_list_var_$40)
      {
        final SubLObject item_var = rule;
        if( NIL == conses_high.member( item_var, rules, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          rules = ConsesLow.cons( item_var, rules );
        }
        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
        rule = cdolist_list_var_$40.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      fort = cdolist_list_var.first();
    }
    rules = Sort.sort( rules, Symbols.symbol_function( $sym115$_ ), Symbols.symbol_function( $sym81$ASSERTION_DEPENDENT_COUNT ) );
    return rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 49826L)
  public static SubLObject deduction_forward_rule_supports(final SubLObject deduction)
  {
    SubLObject forward_rules = NIL;
    SubLObject cdolist_list_var = deductions_high.deduction_supports( deduction );
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.forward_ruleP( support ) )
      {
        forward_rules = ConsesLow.cons( support, forward_rules );
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return Sequences.nreverse( forward_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 50604L)
  public static SubLObject all_forward_rules_relevant_to_term_int(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rules = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $all_forward_rules_relevant_to_term_argument_set$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $all_forward_rules_relevant_to_term_dependent_set$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $all_forward_rules_relevant_to_term_nart_set$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $all_forward_rules_relevant_to_term_result_set$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      $all_forward_rules_relevant_to_term_argument_set$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      $all_forward_rules_relevant_to_term_dependent_set$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      $all_forward_rules_relevant_to_term_nart_set$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      $all_forward_rules_relevant_to_term_result_set$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      compute_all_forward_rules_relevant_to_term( fort, $list118 );
      rules = $all_forward_rules_relevant_to_term_result_set$.getDynamicValue( thread );
    }
    finally
    {
      $all_forward_rules_relevant_to_term_result_set$.rebind( _prev_bind_6, thread );
      $all_forward_rules_relevant_to_term_nart_set$.rebind( _prev_bind_5, thread );
      $all_forward_rules_relevant_to_term_dependent_set$.rebind( _prev_bind_4, thread );
      $all_forward_rules_relevant_to_term_argument_set$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 51216L)
  public static SubLObject compute_all_forward_rules_relevant_to_term(final SubLObject fort, final SubLObject walk_directions)
  {
    if( NIL != kb_mapping_macros.do_term_index_key_validator( fort, NIL ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( fort, NIL );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
            SubLObject done_var_$41 = NIL;
            final SubLObject token_var_$42 = NIL;
            while ( NIL == done_var_$41)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$42 );
              final SubLObject valid_$43 = makeBoolean( !token_var_$42.eql( assertion ) );
              if( NIL != valid_$43 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( assertion, final_index_spec ) )
              {
                SubLObject cdolist_list_var = walk_directions;
                SubLObject walk_direction = NIL;
                walk_direction = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  compute_all_forward_rules_relevant_to_assertion( assertion, walk_direction );
                  cdolist_list_var = cdolist_list_var.rest();
                  walk_direction = cdolist_list_var.first();
                }
              }
              done_var_$41 = makeBoolean( NIL == valid_$43 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 51475L)
  public static SubLObject compute_all_forward_rules_relevant_to_assertion(final SubLObject assertion, final SubLObject walk_direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != gaf_assertion_with_pred_p( assertion, $const119$trueRule ) )
    {
      return NIL;
    }
    if( NIL == assertions_high.forward_deduced_assertionP( assertion, NIL ) )
    {
      return NIL;
    }
    if( walk_direction.eql( $kw120$ARGUMENT_ ) )
    {
      if( NIL != set.set_memberP( assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue( thread ) ) )
      {
        return NIL;
      }
      set.set_add( assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue( thread ) );
    }
    else if( walk_direction.eql( $kw121$DEPENDENT_ ) )
    {
      if( NIL != set.set_memberP( assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue( thread ) ) )
      {
        return NIL;
      }
      set.set_add( assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue( thread ) );
    }
    SubLObject cdolist_list_var = cycl_utilities.expression_narts( assertion, T, UNPROVIDED );
    SubLObject nart = NIL;
    nart = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == set.set_memberP( nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue( thread ) ) )
      {
        set.set_add( nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue( thread ) );
        if( NIL != kb_accessors.skolemize_forwardP( cycl_utilities.nat_functor( nart ), assertions_high.assertion_mt( assertion ) ) )
        {
          compute_all_forward_rules_relevant_to_term( nart, ConsesLow.list( walk_direction ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      nart = cdolist_list_var.first();
    }
    compute_all_forward_rules_relevant_to_assertion_int( assertion, walk_direction );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 52752L)
  public static SubLObject compute_all_forward_rules_relevant_to_assertion_int(final SubLObject assertion, final SubLObject walk_direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.deduction_p( argument ) )
      {
        final SubLObject supports = deduction_forward_rule_supports( argument );
        set_utilities.set_add_all( supports, $all_forward_rules_relevant_to_term_result_set$.getDynamicValue( thread ) );
        if( NIL != $within_safe_all_forward_rules_relevant_to_termP$.getDynamicValue( thread ) )
        {
          final SubLObject size = set.set_size( $all_forward_rules_relevant_to_term_result_set$.getDynamicValue( thread ) );
          if( size.numG( $all_forward_rules_relevant_to_term_threshold$.getDynamicValue( thread ) ) )
          {
            Dynamic.sublisp_throw( $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED, size );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    if( walk_direction.eql( $kw120$ARGUMENT_ ) )
    {
      SubLObject cdolist_list_var2 = assertions_high.assertion_arguments( assertion );
      SubLObject argument2 = NIL;
      argument2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != deduction_handles.deduction_p( argument2 ) )
        {
          SubLObject cdolist_list_var_$44 = deductions_high.deduction_supports( argument2 );
          SubLObject supporting_assertion = NIL;
          supporting_assertion = cdolist_list_var_$44.first();
          while ( NIL != cdolist_list_var_$44)
          {
            if( NIL != assertion_handles.assertion_p( supporting_assertion ) )
            {
              compute_all_forward_rules_relevant_to_assertion( supporting_assertion, walk_direction );
            }
            cdolist_list_var_$44 = cdolist_list_var_$44.rest();
            supporting_assertion = cdolist_list_var_$44.first();
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        argument2 = cdolist_list_var2.first();
      }
    }
    else if( walk_direction.eql( $kw121$DEPENDENT_ ) )
    {
      final SubLObject set_contents_var = assertions_high.assertion_dependents( assertion );
      SubLObject basis_object;
      SubLObject state;
      SubLObject deduction;
      SubLObject dependent_assertion;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        deduction = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
        {
          dependent_assertion = deductions_high.deduction_assertion( deduction );
          if( NIL != assertion_handles.assertion_p( dependent_assertion ) )
          {
            compute_all_forward_rules_relevant_to_assertion( dependent_assertion, walk_direction );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 54041L)
  public static SubLObject deduction_asserted_assertion_supports(final SubLObject deduction, SubLObject depth_limit)
  {
    if( depth_limit == UNPROVIDED )
    {
      depth_limit = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $deduction_asserted_assertion_supports_deductions_processed$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $deduction_asserted_assertion_counts$.currentBinding( thread );
    try
    {
      $deduction_asserted_assertion_supports_deductions_processed$.bind( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
      $deduction_asserted_assertion_counts$.bind( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
      deduction_asserted_assertion_supports_int( deduction, depth_limit );
      return dictionary_utilities.copy_dictionary( $deduction_asserted_assertion_counts$.getDynamicValue( thread ) );
    }
    finally
    {
      $deduction_asserted_assertion_counts$.rebind( _prev_bind_2, thread );
      $deduction_asserted_assertion_supports_deductions_processed$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 54677L)
  public static SubLObject deduction_asserted_assertion_supports_int(final SubLObject deduction, final SubLObject depth_limit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != dictionary.dictionary_lookup( $deduction_asserted_assertion_supports_deductions_processed$.getDynamicValue( thread ), deduction, UNPROVIDED ) )
    {
      return NIL;
    }
    dictionary.dictionary_enter( $deduction_asserted_assertion_supports_deductions_processed$.getDynamicValue( thread ), deduction, T );
    SubLObject supports_to_descend = deductions_high.deduction_supports( deduction );
    SubLObject deductions_to_descend = NIL;
    SubLObject done_supports = NIL;
    SubLObject support = NIL;
    while ( NIL != supports_to_descend)
    {
      support = supports_to_descend.first();
      supports_to_descend = supports_to_descend.rest();
      if( NIL != assertion_handles.assertion_p( support ) && NIL != assertions_high.asserted_assertionP( support ) )
      {
        dictionary_utilities.dictionary_increment( $deduction_asserted_assertion_counts$.getDynamicValue( thread ), support, UNPROVIDED );
      }
      else if( NIL != assertion_handles.assertion_p( support ) && NIL != assertions_high.deduced_assertionP( support ) )
      {
        SubLObject cdolist_list_var = assertions_high.assertion_arguments( support );
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != assertion_handles.assertion_p( argument ) && NIL != assertions_high.asserted_assertionP( argument ) )
          {
            dictionary_utilities.dictionary_increment( $deduction_asserted_assertion_counts$.getDynamicValue( thread ), support, UNPROVIDED );
          }
          else if( NIL != deduction_handles.deduction_p( argument ) )
          {
            final SubLObject item_var = argument;
            if( NIL == conses_high.member( item_var, deductions_to_descend, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              deductions_to_descend = ConsesLow.cons( item_var, deductions_to_descend );
            }
          }
          else
          {
            Errors.sublisp_break( $str122$can_t_handle_argument__S_yet, new SubLObject[] { argument
            } );
          }
          cdolist_list_var = cdolist_list_var.rest();
          argument = cdolist_list_var.first();
        }
      }
      else
      {
        SubLObject cdolist_list_var = arguments.support_justification( support );
        SubLObject sub_support = NIL;
        sub_support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != deduction_handles.deduction_p( sub_support ) )
          {
            final SubLObject item_var = sub_support;
            if( NIL == conses_high.member( item_var, deductions_to_descend, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              deductions_to_descend = ConsesLow.cons( item_var, deductions_to_descend );
            }
          }
          else if( NIL != arguments.support_p( sub_support ) )
          {
            if( NIL == list_utilities.member_equalP( sub_support, done_supports ) )
            {
              final SubLObject item_var = sub_support;
              if( NIL == conses_high.member( item_var, supports_to_descend, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                supports_to_descend = ConsesLow.cons( item_var, supports_to_descend );
              }
            }
          }
          else
          {
            Errors.sublisp_break( $str123$can_t_handle_sub_support__S_yet, new SubLObject[] { sub_support
            } );
          }
          cdolist_list_var = cdolist_list_var.rest();
          sub_support = cdolist_list_var.first();
        }
      }
      final SubLObject item_var2 = support;
      if( NIL == conses_high.member( item_var2, done_supports, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        done_supports = ConsesLow.cons( item_var2, done_supports );
      }
    }
    if( !depth_limit.eql( ONE_INTEGER ) )
    {
      SubLObject cdolist_list_var = deductions_to_descend;
      SubLObject deduction_to_descend = NIL;
      deduction_to_descend = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        deduction_asserted_assertion_supports_int( deduction_to_descend, Numbers.subtract( depth_limit, ONE_INTEGER ) );
        cdolist_list_var = cdolist_list_var.rest();
        deduction_to_descend = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 56422L)
  public static SubLObject assertion_asserted_assertion_supports(final SubLObject assertion, SubLObject depth_limit)
  {
    if( depth_limit == UNPROVIDED )
    {
      depth_limit = ZERO_INTEGER;
    }
    final SubLObject result = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = assertions_high.assertion_deductions( assertion );
    SubLObject deduction = NIL;
    deduction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assertion_supports = deduction_asserted_assertion_supports( deduction, depth_limit );
      set_utilities.set_add_all( dictionary.dictionary_keys( assertion_supports ), result );
      cdolist_list_var = cdolist_list_var.rest();
      deduction = cdolist_list_var.first();
    }
    return set.set_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 57158L)
  public static SubLObject gather_all_exception_rules(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject exceptions = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject message_var = $str124$gathering_exception_rules;
      final SubLObject total = assertions_low.rule_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$45 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$46 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_2_$47 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject iterator_var = kb_iterators.new_rule_iterator();
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject rule = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              sofar = Numbers.add( sofar, ONE_INTEGER );
              utilities_macros.note_percent_progress( sofar, total );
              if( NIL != abnormal.rule_has_exceptionsP( rule ) && NIL != kb_mapping_macros.do_exception_rule_index_key_validator( rule, NIL ) )
              {
                final SubLObject iterator_var_$48 = kb_mapping_macros.new_exception_rule_final_index_spec_iterator( rule, NIL );
                SubLObject done_var_$49 = NIL;
                final SubLObject token_var = NIL;
                while ( NIL == done_var_$49)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var_$48, token_var );
                  final SubLObject valid_$50 = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid_$50 )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw73$RULE, NIL, NIL );
                      SubLObject done_var_$50 = NIL;
                      final SubLObject token_var_$52 = NIL;
                      while ( NIL == done_var_$50)
                      {
                        final SubLObject except = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$52 );
                        final SubLObject valid_$51 = makeBoolean( !token_var_$52.eql( except ) );
                        if( NIL != valid_$51 )
                        {
                          set.set_add( except, exceptions );
                        }
                        done_var_$50 = makeBoolean( NIL == valid_$51 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
                      }
                    }
                  }
                  done_var_$49 = makeBoolean( NIL == valid_$50 );
                }
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$47, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$46, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$45, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sort_assertions( set.set_element_list( exceptions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 57741L)
  public static SubLObject gather_all_pragma_rules(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pragmas = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject message_var = $str125$gathering_pragma_rules;
      final SubLObject total = assertions_low.rule_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$56 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$57 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_2_$58 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject iterator_var = kb_iterators.new_rule_iterator();
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject rule = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              sofar = Numbers.add( sofar, ONE_INTEGER );
              utilities_macros.note_percent_progress( sofar, total );
              if( NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP( rule, UNPROVIDED ) && NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, NIL ) )
              {
                final SubLObject iterator_var_$59 = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, NIL );
                SubLObject done_var_$60 = NIL;
                final SubLObject token_var = NIL;
                while ( NIL == done_var_$60)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var_$59, token_var );
                  final SubLObject valid_$61 = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid_$61 )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw73$RULE, NIL, NIL );
                      SubLObject done_var_$61 = NIL;
                      final SubLObject token_var_$63 = NIL;
                      while ( NIL == done_var_$61)
                      {
                        final SubLObject pragma = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$63 );
                        final SubLObject valid_$62 = makeBoolean( !token_var_$63.eql( pragma ) );
                        if( NIL != valid_$62 )
                        {
                          set.set_add( pragma, pragmas );
                        }
                        done_var_$61 = makeBoolean( NIL == valid_$62 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
                      }
                    }
                  }
                  done_var_$60 = makeBoolean( NIL == valid_$61 );
                }
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$58, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$57, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$56, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sort_assertions( set.set_element_list( pragmas ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 58253L)
  public static SubLObject gather_all_lifting_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lifting_rules = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      final SubLObject message_var = $str126$gathering_lifting_rules;
      final SubLObject total = assertions_low.rule_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$67 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$68 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message_var );
          final SubLObject iterator_var = kb_iterators.new_rule_iterator();
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject rule = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              sofar = Numbers.add( sofar, ONE_INTEGER );
              utilities_macros.note_percent_progress( sofar, total );
              if( NIL != lifting_ruleP( rule ) )
              {
                set.set_add( rule, lifting_rules );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$68, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$67, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return sort_assertions( set.set_element_list( lifting_rules ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 58591L)
  public static SubLObject lifting_ruleP(final SubLObject rule)
  {
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( rule );
      SubLObject cdolist_list_var = clauses.neg_lits( cnf );
      SubLObject neg_lit = NIL;
      neg_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_formula_with_operator_p( neg_lit, $const127$ist ) )
        {
          return neg_lit;
        }
        cdolist_list_var = cdolist_list_var.rest();
        neg_lit = cdolist_list_var.first();
      }
      cdolist_list_var = clauses.pos_lits( cnf );
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_formula_with_operator_p( pos_lit, $const127$ist ) )
        {
          return pos_lit;
        }
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 58965L)
  public static SubLObject lifting_consequent_ruleP(final SubLObject rule)
  {
    if( NIL != assertions_high.rule_assertionP( rule ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( rule );
      SubLObject cdolist_list_var = clauses.pos_lits( cnf );
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_formula_with_operator_p( pos_lit, $const127$ist ) )
        {
          return pos_lit;
        }
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 59251L)
  public static SubLObject universal_lifting_ruleP(final SubLObject rule)
  {
    return makeBoolean( NIL != lifting_consequent_ruleP( rule ) && NIL != kb_mapping_utilities.fpred_value_in_any_mt( rule, $const128$universalLiftingRule, ONE_INTEGER, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 59413L)
  public static SubLObject rule_has_unlabelled_dont_care_variableP(final SubLObject rule)
  {
    assert NIL != assertions_high.rule_assertionP( rule ) : rule;
    if( NIL != assertions_high.single_literal_ruleP( rule ) )
    {
      return NIL;
    }
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    final SubLObject names = assertions_high.assertion_variable_names( rule );
    SubLObject list_var = NIL;
    SubLObject name = NIL;
    SubLObject id = NIL;
    list_var = names;
    name = list_var.first();
    for( id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), name = list_var.first(), id = Numbers.add( ONE_INTEGER, id ) )
    {
      final SubLObject variable = variables.find_variable_by_id( id );
      SubLObject lit_count = ZERO_INTEGER;
      SubLObject cdolist_list_var = clauses.neg_lits( cnf );
      SubLObject lit = NIL;
      lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cycl_utilities.expression_find( variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          lit_count = Numbers.add( lit_count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        lit = cdolist_list_var.first();
      }
      cdolist_list_var = clauses.pos_lits( cnf );
      lit = NIL;
      lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cycl_utilities.expression_find( variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          lit_count = Numbers.add( lit_count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        lit = cdolist_list_var.first();
      }
      if( ONE_INTEGER.numE( lit_count ) && NIL == string_utilities.starts_with( name, $str129$__ ) )
      {
        return variable;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 60133L)
  public static SubLObject rule_unlabelled_dont_care_variables(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertions_high.rule_assertionP( rule ) : rule;
    if( NIL != assertions_high.single_literal_ruleP( rule ) )
    {
      return NIL;
    }
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    final SubLObject names = assertions_high.assertion_variable_names( rule );
    SubLObject unlabelled_dont_care_variables = NIL;
    final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
    try
    {
      cycl_utilities.$opaque_arg_function$.bind( $sym130$FALSE, thread );
      SubLObject list_var = NIL;
      SubLObject name = NIL;
      SubLObject id = NIL;
      list_var = names;
      name = list_var.first();
      for( id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), name = list_var.first(), id = Numbers.add( ONE_INTEGER, id ) )
      {
        final SubLObject variable = variables.find_variable_by_id( id );
        SubLObject lit_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits( cnf );
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != cycl_utilities.expression_find( variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            lit_count = Numbers.add( lit_count, ONE_INTEGER );
          }
          cdolist_list_var = cdolist_list_var.rest();
          lit = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits( cnf );
        lit = NIL;
        lit = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != cycl_utilities.expression_find( variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            lit_count = Numbers.add( lit_count, ONE_INTEGER );
          }
          cdolist_list_var = cdolist_list_var.rest();
          lit = cdolist_list_var.first();
        }
        if( ONE_INTEGER.numE( lit_count ) && NIL == string_utilities.starts_with( name, $str129$__ ) )
        {
          unlabelled_dont_care_variables = ConsesLow.cons( variable, unlabelled_dont_care_variables );
        }
      }
    }
    finally
    {
      cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( unlabelled_dont_care_variables );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 60956L)
  public static SubLObject assertion_findable_by_idP(final SubLObject assertion)
  {
    return Equality.eql( assertion, assertion_handles.find_assertion_by_id( assertion_handles.assertion_id( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 61173L)
  public static SubLObject embedded_assertions(final SubLObject assertion, SubLObject include_selfP, SubLObject penetrate_hl_structuresP)
  {
    if( include_selfP == UNPROVIDED )
    {
      include_selfP = NIL;
    }
    if( penetrate_hl_structuresP == UNPROVIDED )
    {
      penetrate_hl_structuresP = NIL;
    }
    final SubLObject embedded_assertions = ( NIL != include_selfP ) ? cycl_utilities.expression_gather( assertion, $sym40$ASSERTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : cycl_utilities.expression_gather( fi.assertion_hl_formula( assertion, UNPROVIDED ), $sym40$ASSERTION_P, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return embedded_assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 61504L)
  public static SubLObject embedded_assertions_findable_by_idP(final SubLObject assertion, SubLObject include_selfP)
  {
    if( include_selfP == UNPROVIDED )
    {
      include_selfP = NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject embedded_assertions = cdolist_list_var = embedded_assertions( assertion, include_selfP, UNPROVIDED );
    SubLObject embedded_assertion = NIL;
    embedded_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == assertion_findable_by_idP( embedded_assertion ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      embedded_assertion = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62011L)
  public static SubLObject assertions_containing_assertions_not_findable_by_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hosed_assertions = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str131$Verifying_that_all_embedded_asser;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$70 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$70, $kw84$SKIP ) )
        {
          final SubLObject idx_$71 = idx_$70;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$71, $kw84$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$71 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw84$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != meta_assertion_p( ass ) && NIL == embedded_assertions_findable_by_idP( ass, NIL ) )
                {
                  hosed_assertions = ConsesLow.cons( ass, hosed_assertions );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$72 = idx_$70;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$72 ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$72 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$72 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$72 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw84$SKIP ) ) ? NIL : $kw84$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != meta_assertion_p( ass2 ) && NIL == embedded_assertions_findable_by_idP( ass2, NIL ) )
                {
                  hosed_assertions = ConsesLow.cons( ass2, hosed_assertions );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$73, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( hosed_assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62367L)
  public static SubLObject assertions_with_no_arguments(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str132$Looking_for_assertions_with_no_ar;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$74 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$74, $kw84$SKIP ) )
        {
          final SubLObject idx_$75 = idx_$74;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$75, $kw84$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$75 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw84$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL == assertions_high.assertion_arguments( ass ) )
                {
                  if( NIL != verboseP )
                  {
                    print_high.print( ass, UNPROVIDED );
                    streams_high.force_output( UNPROVIDED );
                  }
                  assertions = ConsesLow.cons( ass, assertions );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$76 = idx_$74;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$76 ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$76 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$76 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$76 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw84$SKIP ) ) ? NIL : $kw84$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL == assertions_high.assertion_arguments( ass2 ) )
                {
                  if( NIL != verboseP )
                  {
                    print_high.print( ass2, UNPROVIDED );
                    streams_high.force_output( UNPROVIDED );
                  }
                  assertions = ConsesLow.cons( ass2, assertions );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$77, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62683L)
  public static SubLObject syntactically_ill_formed_assertion_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str133$mapping_Cyc_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$78 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$78, $kw84$SKIP ) )
        {
          final SubLObject idx_$79 = idx_$78;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$79, $kw84$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$79 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw84$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != syntactically_ill_formed_assertionP( ass ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$80 = idx_$78;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$80 ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$80 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$80 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$80 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw84$SKIP ) ) ? NIL : $kw84$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != syntactically_ill_formed_assertionP( ass2 ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 62877L)
  public static SubLObject syntactically_ill_formed_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str133$mapping_Cyc_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$82 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$82, $kw84$SKIP ) )
        {
          final SubLObject idx_$83 = idx_$82;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$83, $kw84$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$83 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw84$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != syntactically_ill_formed_assertionP( ass ) )
                {
                  result = ConsesLow.cons( ass, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$84 = idx_$82;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$84 ) || NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$84 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$84 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$84 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw84$SKIP ) ) ? NIL : $kw84$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw84$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != syntactically_ill_formed_assertionP( ass2 ) )
                {
                  result = ConsesLow.cons( ass2, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$85, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63086L)
  public static SubLObject syntactically_ill_formed_assertionP(final SubLObject ass)
  {
    return makeBoolean( NIL == cycl_grammar.cycl_sentence_p( fi.assertion_hl_formula( ass, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63336L)
  public static SubLObject assertion_rarest_term(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_term = NIL;
    SubLObject count = NIL;
    final SubLObject _prev_bind_0 = $rarest_term$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $rarest_count$.currentBinding( thread );
    try
    {
      $rarest_term$.bind( $kw134$UNSPECIFIED, thread );
      $rarest_count$.bind( Numbers.$most_positive_fixnum$.getGlobalValue(), thread );
      cycl_utilities.assertion_map( Symbols.symbol_function( $sym135$UPDATE_RAREST_TERM ), assertion, UNPROVIDED, UNPROVIDED );
      v_term = $rarest_term$.getDynamicValue( thread );
      count = $rarest_count$.getDynamicValue( thread );
    }
    finally
    {
      $rarest_count$.rebind( _prev_bind_2, thread );
      $rarest_term$.rebind( _prev_bind_0, thread );
    }
    return Values.values( v_term, count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 63760L)
  public static SubLObject assertion_term_rarity(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_term = assertion_rarest_term( assertion );
    final SubLObject count = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( count, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64059L)
  public static SubLObject sort_assertions_via_term_rarity(SubLObject assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        assertions = Sort.stable_sort( assertions, Symbols.symbol_function( $sym136$_ ), Symbols.symbol_function( $sym137$MEMOIZED_ASSERTION_TERM_RARITY ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$86, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64330L)
  public static SubLObject update_rarest_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) )
    {
      final SubLObject count = kb_indexing.num_index( v_term );
      if( count.numL( $rarest_count$.getDynamicValue( thread ) ) )
      {
        $rarest_term$.setDynamicValue( v_term, thread );
        $rarest_count$.setDynamicValue( count, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64568L)
  public static SubLObject memoized_assertion_term_rarity_internal(final SubLObject assertion)
  {
    return assertion_term_rarity( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertion-utilities.lisp", position = 64568L)
  public static SubLObject memoized_assertion_term_rarity(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_assertion_term_rarity_internal( assertion );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym137$MEMOIZED_ASSERTION_TERM_RARITY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym137$MEMOIZED_ASSERTION_TERM_RARITY, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym137$MEMOIZED_ASSERTION_TERM_RARITY, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_assertion_term_rarity_internal( assertion ) ) );
      memoization_state.caching_state_put( caching_state, assertion, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_assertion_utilities_file()
  {
    SubLFiles.declareMacro(me, "do_rules", "DO-RULES" );
    SubLFiles.declareMacro(me, "do_gafs", "DO-GAFS" );
    SubLFiles.declareMacro(me, "do_assertions_backwards", "DO-ASSERTIONS-BACKWARDS" );
    SubLFiles.declareMacro(me, "do_assertion_dependent_assertions", "DO-ASSERTION-DEPENDENT-ASSERTIONS" );
    SubLFiles.declareMacro(me, "do_assertion_supporting_assertions", "DO-ASSERTION-SUPPORTING-ASSERTIONS" );
    SubLFiles.declareFunction(me, "assertion_list_p", "ASSERTION-LIST-P", 1, 0, false );
    SubLFiles.declareFunction(me, "list_of_rule_assertion_p", "LIST-OF-RULE-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_dependent_assertions", "ASSERTION-DEPENDENT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "remove_relevant_assertion_dependents", "REMOVE-RELEVANT-ASSERTION-DEPENDENTS", 2, 0, false );
    SubLFiles.declareFunction(me, "remove_relevant_assertions_dependents", "REMOVE-RELEVANT-ASSERTIONS-DEPENDENTS", 2, 0, false );
    SubLFiles.declareFunction(me, "deduction_dependent_deductions", "DEDUCTION-DEPENDENT-DEDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_dependent_supported_object_counts", "ASSERTION-DEPENDENT-SUPPORTED-OBJECT-COUNTS", 1, 0, false );
    SubLFiles.declareFunction(me, "true_assertionP", "TRUE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "false_assertionP", "FALSE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "unknown_assertionP", "UNKNOWN-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "true_gaf_assertionP", "TRUE-GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "false_gaf_assertionP", "FALSE-GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "nl_semantic_assertionP", "NL-SEMANTIC-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "obsolete_ruleP", "OBSOLETE-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_matches_typeP", "ASSERTION-MATCHES-TYPE?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_matches_truthP", "ASSERTION-MATCHES-TRUTH?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_matches_directionP", "ASSERTION-MATCHES-DIRECTION?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_matches_truth_and_directionP", "ASSERTION-MATCHES-TRUTH-AND-DIRECTION?", 3, 0, false );
    SubLFiles.declareFunction(me, "assertion_matches_type_truth_and_directionP", "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?", 4, 0, false );
    SubLFiles.declareFunction(me, "gaf_has_term_in_argnumP", "GAF-HAS-TERM-IN-ARGNUM?", 3, 0, false );
    SubLFiles.declareFunction(me, "gaf_has_term_in_some_argnumP", "GAF-HAS-TERM-IN-SOME-ARGNUM?", 2, 0, false );
    SubLFiles.declareFunction(me, "true_gaf_assertion_with_pred_p", "TRUE-GAF-ASSERTION-WITH-PRED-P", 2, 0, false );
    SubLFiles.declareFunction(me, "gaf_assertion_with_pred_p", "GAF-ASSERTION-WITH-PRED-P", 2, 0, false );
    SubLFiles.declareFunction(me, "gaf_assertion_has_pred_p", "GAF-ASSERTION-HAS-PRED-P", 2, 0, false );
    SubLFiles.declareFunction(me, "gaf_assertion_with_any_of_preds_p", "GAF-ASSERTION-WITH-ANY-OF-PREDS-P", 2, 0, false );
    SubLFiles.declareFunction(me, "isa_gaf_p", "ISA-GAF-P", 1, 0, false );
    SubLFiles.declareFunction(me, "genls_gaf_p", "GENLS-GAF-P", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_cnf_with_el_vars_only", "ASSERTION-CNF-WITH-EL-VARS-ONLY", 1, 0, false );
    SubLFiles.declareFunction(me, "except_when_rule_p", "EXCEPT-WHEN-RULE-P", 1, 0, false );
    SubLFiles.declareFunction(me, "except_for_gaf_p", "EXCEPT-FOR-GAF-P", 1, 0, false );
    SubLFiles.declareFunction(me, "abnormal_assertion_p", "ABNORMAL-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction(me, "abnormal_literal_from_assertion", "ABNORMAL-LITERAL-FROM-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "somewhere_excepted_assertionP", "SOMEWHERE-EXCEPTED-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction(me, "excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 2, false );
    SubLFiles.declareFunction(me, "excepted_assertion_in_any_mtP", "EXCEPTED-ASSERTION-IN-ANY-MT?", 1, 2, false );
    SubLFiles.declareFunction(me, "excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 3, false );
    SubLFiles.declareFunction(me, "excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 2, false );
    SubLFiles.declareFunction(me, "excepted_assertion_in_mtP_shallow", "EXCEPTED-ASSERTION-IN-MT?-SHALLOW", 2, 1, false );
    SubLFiles.declareFunction(me, "doomed_assertionP", "DOOMED-ASSERTION?", 1, 2, false );
    SubLFiles.declareFunction(me, "doomed_assertionP_int", "DOOMED-ASSERTION?-INT", 1, 3, false );
    SubLFiles.declareFunction(me, "assertion_matches_mtP", "ASSERTION-MATCHES-MT?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_argumentsP", "ASSERTION-HAS-ARGUMENTS?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_argument_count", "ASSERTION-ARGUMENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_deduction_with_supportP", "ASSERTION-HAS-DEDUCTION-WITH-SUPPORT?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_dependent_with_supportP", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_dependent_with_supportP_kb_hl_support_aware_version", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_asserted_more_specificallyP", "ASSERTION-MENTIONS-ASSERTED-MORE-SPECIFICALLY?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_any_of_termsP", "ASSERTION-MENTIONS-ANY-OF-TERMS?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_any_of_terms_in_set_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_any_of_terms_in_setP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_any_of_terms_in_dict_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_mentions_any_of_terms_in_dictionary_keysP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICTIONARY-KEYS?", 2, 0, false );
    SubLFiles.declareFunction(me, "random_gaf_with_pred", "RANDOM-GAF-WITH-PRED", 1, 0, false );
    SubLFiles.declareFunction(me, "random_gaf_with_predicate", "RANDOM-GAF-WITH-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction(me, "random_gaf_with_predicate_and_arg", "RANDOM-GAF-WITH-PREDICATE-AND-ARG", 3, 0, false );
    SubLFiles.declareFunction(me, "random_rule_mentioning", "RANDOM-RULE-MENTIONING", 1, 0, false );
    SubLFiles.declareFunction(me, "rules_mentioning", "RULES-MENTIONING", 1, 0, false );
    SubLFiles.declareFunction(me, "rule_count_mentioning", "RULE-COUNT-MENTIONING", 1, 0, false );
    SubLFiles.declareFunction(me, "random_assertions", "RANDOM-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_earlierP", "ASSERTION-EARLIER?", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_laterP", "ASSERTION-LATER?", 2, 0, false );
    SubLFiles.declareFunction(me, "earliest_assertion", "EARLIEST-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "rename_assertion_variables", "RENAME-ASSERTION-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction(me, "possibly_rename_assertion_variables", "POSSIBLY-RENAME-ASSERTION-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_antecedent_query_formula", "ASSERTION-ANTECEDENT-QUERY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_known_extent_query_formula", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_unknown_extent_query_formula", "ASSERTION-UNKNOWN-EXTENT-QUERY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_known_extent_query_formula_int", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_info", "ASSERTION-INFO", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_literal_count", "ASSERTION-LITERAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction(me, "rule_literal_count", "RULE-LITERAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_supporting_assertions", "ASSERTION-SUPPORTING-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_supporting_forward_assertions", "ASSERTION-SUPPORTING-FORWARD-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_cheapest_forward_supporting_assertion", "ASSERTION-CHEAPEST-FORWARD-SUPPORTING-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_universal_time", "ASSERTION-UNIVERSAL-TIME", 1, 0, false );
    SubLFiles.declareFunction(me, "all_assertions_sorted_by_creation_time_estimate", "ALL-ASSERTIONS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction(me, "assertion_newest_constant", "ASSERTION-NEWEST-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction(me, "initialize_newest_constant_table", "INITIALIZE-NEWEST-CONSTANT-TABLE", 0, 0, false );
    SubLFiles.declareFunction(me, "assertion_has_meta_assertionsP", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false );
    SubLFiles.declareFunction(me, "all_meta_assertions", "ALL-META-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "meta_assertion_list_for_editing", "META-ASSERTION-LIST-FOR-EDITING", 1, 0, false );
    SubLFiles.declareFunction(me, "meta_assertion_p", "META-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction(me, "rule_meta_assertion_p", "RULE-META-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction(me, "pragmatic_requirement_rule_p", "PRAGMATIC-REQUIREMENT-RULE-P", 1, 0, false );
    SubLFiles.declareFunction(me, "meta_assertion_el_formula", "META-ASSERTION-EL-FORMULA", 3, 0, false );
    SubLFiles.declareFunction(me, "mt_of_assertions_p", "MT-OF-ASSERTIONS-P", 2, 0, false );
    SubLFiles.declareFunction(me, "assertions_of_mt", "ASSERTIONS-OF-MT", 2, 0, false );
    SubLFiles.declareFunction(me, "mts_of_assertions", "MTS-OF-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "assertions_min_mt", "ASSERTIONS-MIN-MT", 1, 0, false );
    SubLFiles.declareFunction(me, "sort_assertions", "SORT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction(me, "sort_gafs_by_term", "SORT-GAFS-BY-TERM", 1, 2, false );
    SubLFiles.declareFunction(me, "rule_type_constraints", "RULE-TYPE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction(me, "self_looping_ruleP", "SELF-LOOPING-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "clear_cached_self_looping_rule_assertionP", "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?", 0, 0, false );
    SubLFiles.declareFunction(me, "remove_cached_self_looping_rule_assertionP", "REMOVE-CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "cached_self_looping_rule_assertionP_internal", "CACHED-SELF-LOOPING-RULE-ASSERTION?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "cached_self_looping_rule_assertionP", "CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "self_expanding_ruleP", "SELF-EXPANDING-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "clear_cached_self_expanding_rule_assertionP", "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 0, 0, false );
    SubLFiles.declareFunction(me, "remove_cached_self_expanding_rule_assertionP", "REMOVE-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "cached_self_expanding_rule_assertionP_internal", "CACHED-SELF-EXPANDING-RULE-ASSERTION?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "cached_self_expanding_rule_assertionP", "CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "safe_all_forward_rules_relevant_to_term", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false );
    SubLFiles.declareFunction(me, "all_forward_rules_relevant_to_term", "ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false );
    SubLFiles.declareFunction(me, "safe_all_forward_rules_relevant_to_terms", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false );
    SubLFiles.declareFunction(me, "all_forward_rules_relevant_to_terms", "ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false );
    SubLFiles.declareFunction(me, "possibly_safe_all_forward_rules_relevant_to_term", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false );
    SubLFiles.declareFunction(me, "possibly_safe_all_forward_rules_relevant_to_terms", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 2, 0, false );
    SubLFiles.declareFunction(me, "deduction_forward_rule_supports", "DEDUCTION-FORWARD-RULE-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction(me, "all_forward_rules_relevant_to_term_int", "ALL-FORWARD-RULES-RELEVANT-TO-TERM-INT", 1, 0, false );
    SubLFiles.declareFunction(me, "compute_all_forward_rules_relevant_to_term", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false );
    SubLFiles.declareFunction(me, "compute_all_forward_rules_relevant_to_assertion", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction(me, "compute_all_forward_rules_relevant_to_assertion_int", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "deduction_asserted_assertion_supports", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false );
    SubLFiles.declareFunction(me, "deduction_asserted_assertion_supports_int", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_asserted_assertion_supports", "ASSERTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false );
    SubLFiles.declareFunction(me, "gather_all_exception_rules", "GATHER-ALL-EXCEPTION-RULES", 0, 1, false );
    SubLFiles.declareFunction(me, "gather_all_pragma_rules", "GATHER-ALL-PRAGMA-RULES", 0, 1, false );
    SubLFiles.declareFunction(me, "gather_all_lifting_rules", "GATHER-ALL-LIFTING-RULES", 0, 0, false );
    SubLFiles.declareFunction(me, "lifting_ruleP", "LIFTING-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "lifting_consequent_ruleP", "LIFTING-CONSEQUENT-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "universal_lifting_ruleP", "UNIVERSAL-LIFTING-RULE?", 1, 0, false );
    SubLFiles.declareFunction(me, "rule_has_unlabelled_dont_care_variableP", "RULE-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction(me, "rule_unlabelled_dont_care_variables", "RULE-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_findable_by_idP", "ASSERTION-FINDABLE-BY-ID?", 1, 0, false );
    SubLFiles.declareFunction(me, "embedded_assertions", "EMBEDDED-ASSERTIONS", 1, 2, false );
    SubLFiles.declareFunction(me, "embedded_assertions_findable_by_idP", "EMBEDDED-ASSERTIONS-FINDABLE-BY-ID?", 1, 1, false );
    SubLFiles.declareFunction(me, "assertions_containing_assertions_not_findable_by_id", "ASSERTIONS-CONTAINING-ASSERTIONS-NOT-FINDABLE-BY-ID", 0, 0, false );
    SubLFiles.declareFunction(me, "assertions_with_no_arguments", "ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false );
    SubLFiles.declareFunction(me, "syntactically_ill_formed_assertion_count", "SYNTACTICALLY-ILL-FORMED-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction(me, "syntactically_ill_formed_assertions", "SYNTACTICALLY-ILL-FORMED-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction(me, "syntactically_ill_formed_assertionP", "SYNTACTICALLY-ILL-FORMED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_rarest_term", "ASSERTION-RAREST-TERM", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_term_rarity", "ASSERTION-TERM-RARITY", 1, 0, false );
    SubLFiles.declareFunction(me, "sort_assertions_via_term_rarity", "SORT-ASSERTIONS-VIA-TERM-RARITY", 1, 0, false );
    SubLFiles.declareFunction(me, "update_rarest_term", "UPDATE-RAREST-TERM", 1, 0, false );
    SubLFiles.declareFunction(me, "memoized_assertion_term_rarity_internal", "MEMOIZED-ASSERTION-TERM-RARITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "memoized_assertion_term_rarity", "MEMOIZED-ASSERTION-TERM-RARITY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_assertion_utilities_file()
  {
    $excepted_assertion_max_depth$ = SubLFiles.defparameter( "*EXCEPTED-ASSERTION-MAX-DEPTH*", NIL );
    $excepted_assertion_shallow_max_depth$ = SubLFiles.defparameter( "*EXCEPTED-ASSERTION-SHALLOW-MAX-DEPTH*", FIVE_INTEGER );
    $doomed_assertion_max_depth$ = SubLFiles.defparameter( "*DOOMED-ASSERTION-MAX-DEPTH*", NIL );
    $assertion_mentions_any_of_terms_set_watermark$ = SubLFiles.deflexical( "*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-WATERMARK*", $int68$30 );
    $assertion_mentions_any_of_terms_set_lambda$ = SubLFiles.defparameter( "*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-LAMBDA*", NIL );
    $assertion_mentions_any_of_terms_dict_lambda$ = SubLFiles.defparameter( "*ASSERTION-MENTIONS-ANY-OF-TERMS-DICT-LAMBDA*", NIL );
    $newest_constant_of_assertions$ = SubLFiles.defparameter( "*NEWEST-CONSTANT-OF-ASSERTIONS*", NIL );
    $cached_self_looping_rule_assertionP_caching_state$ = SubLFiles.deflexical( "*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*", NIL );
    $cached_self_expanding_rule_assertionP_caching_state$ = SubLFiles.deflexical( "*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*", NIL );
    $all_forward_rules_relevant_to_term_threshold$ = SubLFiles.defparameter( "*ALL-FORWARD-RULES-RELEVANT-TO-TERM-THRESHOLD*", $int112$212 );
    $within_safe_all_forward_rules_relevant_to_termP$ = SubLFiles.defparameter( "*WITHIN-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM?*", NIL );
    $all_forward_rules_relevant_to_term_argument_set$ = SubLFiles.defparameter( "*ALL-FORWARD-RULES-RELEVANT-TO-TERM-ARGUMENT-SET*", NIL );
    $all_forward_rules_relevant_to_term_dependent_set$ = SubLFiles.defparameter( "*ALL-FORWARD-RULES-RELEVANT-TO-TERM-DEPENDENT-SET*", NIL );
    $all_forward_rules_relevant_to_term_nart_set$ = SubLFiles.defparameter( "*ALL-FORWARD-RULES-RELEVANT-TO-TERM-NART-SET*", NIL );
    $all_forward_rules_relevant_to_term_result_set$ = SubLFiles.defparameter( "*ALL-FORWARD-RULES-RELEVANT-TO-TERM-RESULT-SET*", NIL );
    $deduction_asserted_assertion_supports_deductions_processed$ = SubLFiles.defparameter( "*DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-DEDUCTIONS-PROCESSED*", NIL );
    $deduction_asserted_assertion_counts$ = SubLFiles.defparameter( "*DEDUCTION-ASSERTED-ASSERTION-COUNTS*", NIL );
    $rarest_term$ = SubLFiles.defparameter( "*RAREST-TERM*", NIL );
    $rarest_count$ = SubLFiles.defparameter( "*RAREST-COUNT*", NIL );
    return NIL;
  }

  public static SubLObject setup_assertion_utilities_file()
  {
    utilities_macros.register_cyc_api_function( $sym87$ASSERTION_HAS_META_ASSERTIONS_, $list88, $str89$Return_T_iff_ASSERTION_has_some_m, $list90, $list91 );
    memoization_state.note_globally_cached_function( $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_ );
    memoization_state.note_globally_cached_function( $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_ );
    memoization_state.note_memoized_function( $sym137$MEMOIZED_ASSERTION_TERM_RARITY );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_assertion_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_assertion_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_assertion_utilities_file();
  }
  static
  {
    me = new assertion_utilities();
    $excepted_assertion_max_depth$ = null;
    $excepted_assertion_shallow_max_depth$ = null;
    $doomed_assertion_max_depth$ = null;
    $assertion_mentions_any_of_terms_set_watermark$ = null;
    $assertion_mentions_any_of_terms_set_lambda$ = null;
    $assertion_mentions_any_of_terms_dict_lambda$ = null;
    $newest_constant_of_assertions$ = null;
    $cached_self_looping_rule_assertionP_caching_state$ = null;
    $cached_self_expanding_rule_assertionP_caching_state$ = null;
    $all_forward_rules_relevant_to_term_threshold$ = null;
    $within_safe_all_forward_rules_relevant_to_termP$ = null;
    $all_forward_rules_relevant_to_term_argument_set$ = null;
    $all_forward_rules_relevant_to_term_dependent_set$ = null;
    $all_forward_rules_relevant_to_term_nart_set$ = null;
    $all_forward_rules_relevant_to_term_result_set$ = null;
    $deduction_asserted_assertion_supports_deductions_processed$ = null;
    $deduction_asserted_assertion_counts$ = null;
    $rarest_term$ = null;
    $rarest_count$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "RULE-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping Cyc rules" ) ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str4$mapping_Cyc_rules = makeString( "mapping Cyc rules" );
    $kw5$DONE = makeKeyword( "DONE" );
    $sym6$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $list7 = ConsesLow.list( makeSymbol( "NEW-RULE-ITERATOR" ) );
    $sym8$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym9$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym10$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym11$CLET = makeSymbol( "CLET" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "RULE-COUNT" ) ) );
    $list13 = ConsesLow.list( ZERO_INTEGER );
    $sym14$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym15$DO_RULES = makeSymbol( "DO-RULES" );
    $sym16$CINC = makeSymbol( "CINC" );
    $sym17$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "GAF-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping Cyc GAFs" ) ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $str19$mapping_Cyc_GAFs = makeString( "mapping Cyc GAFs" );
    $sym20$DO_ASSERTIONS = makeSymbol( "DO-ASSERTIONS" );
    $sym21$PWHEN = makeSymbol( "PWHEN" );
    $sym22$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "&KEY" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym24$PROGRESS_MESSAGE_VAR = makeUninternedSymbol( "PROGRESS-MESSAGE-VAR" );
    $sym25$DO_ASSERTIONS_BACKWARDS = makeSymbol( "DO-ASSERTIONS-BACKWARDS" );
    $sym26$SOFAR_VAR = makeUninternedSymbol( "SOFAR-VAR" );
    $sym27$TOTAL_VAR = makeUninternedSymbol( "TOTAL-VAR" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-COUNT" ) ) );
    $sym29$ID_VAR = makeUninternedSymbol( "ID-VAR" );
    $sym30$DO_NUMBERS = makeSymbol( "DO-NUMBERS" );
    $kw31$START = makeKeyword( "START" );
    $list32 = ConsesLow.list( makeSymbol( "NEXT-ASSERTION-ID" ) );
    $kw33$END = makeKeyword( "END" );
    $kw34$DELTA = makeKeyword( "DELTA" );
    $sym35$FIND_ASSERTION_BY_ID = makeSymbol( "FIND-ASSERTION-BY-ID" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEPENDENT-ASSERTION" ), makeSymbol( "ASSERTION" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym37$DEDUCTION = makeUninternedSymbol( "DEDUCTION" );
    $sym38$DO_ASSERTION_DEPENDENTS = makeSymbol( "DO-ASSERTION-DEPENDENTS" );
    $sym39$DEDUCTION_ASSERTION = makeSymbol( "DEDUCTION-ASSERTION" );
    $sym40$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORTING-ASSERTION" ), makeSymbol( "ASSERTION" ), SubLObjectFactory.makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list42 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym43$ARGUMENT = makeUninternedSymbol( "ARGUMENT" );
    $sym44$DO_ASSERTION_ARGUMENTS = makeSymbol( "DO-ASSERTION-ARGUMENTS" );
    $sym45$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $sym46$DO_DEDUCTION_SUPPORTS = makeSymbol( "DO-DEDUCTION-SUPPORTS" );
    $str47$Gathering_mt_relevant_dependents_ = makeString( "Gathering mt-relevant dependents from root set of " );
    $str48$_assertions = makeString( " assertions" );
    $const49$except = constant_handles.reader_make_constant_shell( makeString( "except" ) );
    $str50$Removing_ = makeString( "Removing " );
    $str51$_mt_relevant_dependents = makeString( " mt-relevant dependents" );
    $str52$Deduction__A_supporting_missing_K = makeString( "Deduction ~A supporting missing KB HL support?! ~A~%" );
    $str53$deduction_dependent_deductions_ca = makeString( "deduction-dependent-deductions called on deduction ~A supporting invalid object ~A" );
    $kw54$TRUE = makeKeyword( "TRUE" );
    $kw55$FALSE = makeKeyword( "FALSE" );
    $kw56$UNKNOWN = makeKeyword( "UNKNOWN" );
    $const57$NLSemanticPredicate = constant_handles.reader_make_constant_shell( makeString( "NLSemanticPredicate" ) );
    $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const59$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym60$_EXIT = makeSymbol( "%EXIT" );
    $const61$obsoleteRule = constant_handles.reader_make_constant_shell( makeString( "obsoleteRule" ) );
    $const62$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const63$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym64$ABNORMAL_ASSERTION_P = makeSymbol( "ABNORMAL-ASSERTION-P" );
    $const65$exceptMt = constant_handles.reader_make_constant_shell( makeString( "exceptMt" ) );
    $sym66$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $const67$assertedMoreSpecifically = constant_handles.reader_make_constant_shell( makeString( "assertedMoreSpecifically" ) );
    $int68$30 = makeInteger( 30 );
    $sym69$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA = makeSymbol( "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA" );
    $sym70$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA = makeSymbol( "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA" );
    $int71$10000 = makeInteger( 10000 );
    $kw72$GAF = makeKeyword( "GAF" );
    $kw73$RULE = makeKeyword( "RULE" );
    $sym74$ASSERTED_WHEN = makeSymbol( "ASSERTED-WHEN" );
    $sym75$INTEGERP = makeSymbol( "INTEGERP" );
    $sym76$ASSERTED_SECOND = makeSymbol( "ASSERTED-SECOND" );
    $sym77$EL_VAR_NAME = makeSymbol( "EL-VAR-NAME" );
    $const78$knownSentence = constant_handles.reader_make_constant_shell( makeString( "knownSentence" ) );
    $const79$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $sym80$FORWARD_ASSERTION_ = makeSymbol( "FORWARD-ASSERTION?" );
    $sym81$ASSERTION_DEPENDENT_COUNT = makeSymbol( "ASSERTION-DEPENDENT-COUNT" );
    $str82$Sorting_newest_constants___Part_2 = makeString( "Sorting newest constants : Part 2" );
    $sym83$STRINGP = makeSymbol( "STRINGP" );
    $kw84$SKIP = makeKeyword( "SKIP" );
    $str85$Computing_newest_constants = makeString( "Computing newest constants" );
    $str86$Sorting_newest_constants___Part_1 = makeString( "Sorting newest constants : Part 1" );
    $sym87$ASSERTION_HAS_META_ASSERTIONS_ = makeSymbol( "ASSERTION-HAS-META-ASSERTIONS?" );
    $list88 = ConsesLow.list( makeSymbol( "ASSERTION" ) );
    $str89$Return_T_iff_ASSERTION_has_some_m = makeString( "Return T iff ASSERTION has some meta-assertions." );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ) );
    $list91 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym92$ALL_META_ASSERTIONS = makeSymbol( "ALL-META-ASSERTIONS" );
    $sym93$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $const94$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "meetsPragmaticRequirement" ) );
    $sym95$META_ASSERTION_P = makeSymbol( "META-ASSERTION-P" );
    $sym96$HLMT_P = makeSymbol( "HLMT-P" );
    $sym97$ASSERTION_LIST_P = makeSymbol( "ASSERTION-LIST-P" );
    $sym98$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $sym99$SAFE__ = makeSymbol( "SAFE-<" );
    $sym100$ASSERTION_ID = makeSymbol( "ASSERTION-ID" );
    $sym101$TERM__ = makeSymbol( "TERM-<" );
    $sym102$DEFINITIONAL_PRED__ = makeSymbol( "DEFINITIONAL-PRED-<" );
    $sym103$GAF_PREDICATE = makeSymbol( "GAF-PREDICATE" );
    $sym104$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $sym105$ISA_HL_VAR_THING_LIT_ = makeSymbol( "ISA-HL-VAR-THING-LIT?" );
    $str106$Type_constraint__Mt_should_be_can = makeString( "Type constraint: Mt should be canonical ~a, but isn't ~a" );
    $str107$Expected_a_single_DNF_clause_of_c = makeString( "Expected a single DNF clause of constraints for ~a but got more than one: ~a" );
    $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_ = makeSymbol( "CACHED-SELF-LOOPING-RULE-ASSERTION?" );
    $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol( "*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*" );
    $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_ = makeSymbol( "CACHED-SELF-EXPANDING-RULE-ASSERTION?" );
    $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol( "*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*" );
    $int112$212 = makeInteger( 212 );
    $sym113$FORT_P = makeSymbol( "FORT-P" );
    $kw114$ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED = makeKeyword( "ALL-FORWARD-RULES-RELEVANT-TO-TERMS-THRESHOLD-EXCEEDED" );
    $sym115$_ = makeSymbol( ">" );
    $kw116$ALL = makeKeyword( "ALL" );
    $sym117$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $list118 = ConsesLow.list( makeKeyword( "ARGUMENT*" ), makeKeyword( "DEPENDENT*" ) );
    $const119$trueRule = constant_handles.reader_make_constant_shell( makeString( "trueRule" ) );
    $kw120$ARGUMENT_ = makeKeyword( "ARGUMENT*" );
    $kw121$DEPENDENT_ = makeKeyword( "DEPENDENT*" );
    $str122$can_t_handle_argument__S_yet = makeString( "can't handle argument ~S yet" );
    $str123$can_t_handle_sub_support__S_yet = makeString( "can't handle sub-support ~S yet" );
    $str124$gathering_exception_rules = makeString( "gathering exception rules" );
    $str125$gathering_pragma_rules = makeString( "gathering pragma rules" );
    $str126$gathering_lifting_rules = makeString( "gathering lifting rules" );
    $const127$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const128$universalLiftingRule = constant_handles.reader_make_constant_shell( makeString( "universalLiftingRule" ) );
    $str129$__ = makeString( "??" );
    $sym130$FALSE = makeSymbol( "FALSE" );
    $str131$Verifying_that_all_embedded_asser = makeString( "Verifying that all embedded assertions are findable via ID" );
    $str132$Looking_for_assertions_with_no_ar = makeString( "Looking for assertions with no arguments" );
    $str133$mapping_Cyc_assertions = makeString( "mapping Cyc assertions" );
    $kw134$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $sym135$UPDATE_RAREST_TERM = makeSymbol( "UPDATE-RAREST-TERM" );
    $sym136$_ = makeSymbol( "<" );
    $sym137$MEMOIZED_ASSERTION_TERM_RARITY = makeSymbol( "MEMOIZED-ASSERTION-TERM-RARITY" );
  }
}
