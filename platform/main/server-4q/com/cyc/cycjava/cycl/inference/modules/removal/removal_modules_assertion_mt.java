package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_assertion_mt
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt";
  public static final String myFingerPrint = "fd3dcbdf4cd97e08f6d9d3ed09ca256013fc5f87b41ba6479e9ccd00254fed9e";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 1627L)
  public static SubLSymbol $assertion_mt_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 2053L)
  private static SubLSymbol $default_assertion_mt_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6756L)
  public static SubLSymbol $assertion_sentence_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 7537L)
  private static SubLSymbol $default_assertion_sentence_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 10540L)
  private static SubLSymbol $default_assertion_sentence_lookup_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16630L)
  public static SubLSymbol $assertion_id_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 17056L)
  private static SubLSymbol $default_assertion_id_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 20716L)
  private static SubLSymbol $cycl_directions$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21780L)
  public static SubLSymbol $assertion_direction_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 22234L)
  private static SubLSymbol $default_assertion_direction_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26143L)
  private static SubLSymbol $cycl_strengths$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27357L)
  public static SubLSymbol $assertion_strength_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27807L)
  private static SubLSymbol $default_assertion_strength_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31540L)
  private static SubLSymbol $cycl_truths$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32551L)
  public static SubLSymbol $assertion_truth_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32989L)
  private static SubLSymbol $default_assertion_truth_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37253L)
  public static SubLSymbol $assertion_just_att_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37717L)
  private static SubLSymbol $default_assertion_just_att_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41061L)
  public static SubLSymbol $assertion_assert_by_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 42736L)
  private static SubLSymbol $default_assertion_assert_by_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 48744L)
  public static SubLSymbol $assertion_assert_time_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 50635L)
  private static SubLSymbol $default_assertion_assert_time_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 54011L)
  private static SubLSymbol $earliest_known_asserted_when$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57453L)
  public static SubLSymbol $assertion_assert_purpose_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 59165L)
  private static SubLSymbol $default_assertion_assert_purpose_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 65193L)
  public static SubLSymbol $assertion_assert_date_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 65280L)
  private static SubLSymbol $default_assertion_assert_date_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 72075L)
  private static SubLSymbol $removal_assertion_asserted_by_between_dates_date_comparison_predicates$;
  private static final SubLSymbol $sym0$ASSERTION_EL_IST_FORMULA;
  private static final SubLObject $const1$assertionMt;
  private static final SubLSymbol $kw2$POS;
  private static final SubLSymbol $kw3$NEG;
  private static final SubLSymbol $sym4$_ASSERTION_MT_DEFINING_MT_;
  private static final SubLObject $const5$BaseKB;
  private static final SubLSymbol $kw6$OPAQUE;
  private static final SubLSymbol $kw7$TRUE_MON;
  private static final SubLSymbol $kw8$REMOVAL_ASSERTION_MT_CHECK_POS;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$REMOVAL_ASSERTION_MT_PRUNE_POS;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$REMOVAL_ASSERTION_MT_CHECK_NEG;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$REMOVAL_ASSERTION_MT_UNIFY;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$REMOVAL_ASSERTION_MT_LOOKUP;
  private static final SubLList $list17;
  private static final SubLObject $const18$assertionSentence;
  private static final SubLSymbol $sym19$_ASSERTION_SENTENCE_DEFINING_MT_;
  private static final SubLSymbol $kw20$REMOVAL_ASSERTION_FORMULA_CHECK_POS;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$REMOVAL_ASSERTION_FORMULA_CHECK_NEG;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym25$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym26$_EXIT;
  private static final SubLSymbol $kw27$REMOVAL_ASSERTION_FORMULA_UNIFY;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$REMOVAL_ASSERTION_FORMULA_LOOKUP;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const32$EverythingPSC;
  private static final SubLSymbol $kw33$GAF_ARG;
  private static final SubLSymbol $kw34$GAF;
  private static final SubLSymbol $kw35$PREDICATE_EXTENT;
  private static final SubLSymbol $kw36$OVERLAP;
  private static final SubLSymbol $kw37$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP;
  private static final SubLList $list40;
  private static final SubLObject $const41$assertionID;
  private static final SubLSymbol $sym42$_ASSERTION_ID_DEFINING_MT_;
  private static final SubLSymbol $kw43$REMOVAL_ASSERTION_ID_CHECK_POS;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$REMOVAL_ASSERTION_ID_CHECK_NEG;
  private static final SubLList $list46;
  private static final SubLSymbol $kw47$REMOVAL_ASSERTION_ID_UNIFY;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$REMOVAL_ASSERTION_ID_LOOKUP;
  private static final SubLList $list50;
  private static final SubLObject $const51$assertionDirection;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$FORWARD;
  private static final SubLObject $const54$Forward_AssertionDirection;
  private static final SubLSymbol $kw55$BACKWARD;
  private static final SubLObject $const56$Backward_AssertionDirection;
  private static final SubLSymbol $kw57$CODE;
  private static final SubLObject $const58$Code_AssertionDirection;
  private static final SubLString $str59$_S_was_not_a_direction_p;
  private static final SubLString $str60$_S_was_not_a_cycl_direction_p;
  private static final SubLSymbol $sym61$_ASSERTION_DIRECTION_DEFINING_MT_;
  private static final SubLSymbol $kw62$REMOVAL_ASSERTION_DIRECTION_CHECK_POS;
  private static final SubLList $list63;
  private static final SubLSymbol $kw64$REMOVAL_ASSERTION_DIRECTION_CHECK_NEG;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$REMOVAL_ASSERTION_DIRECTION_UNIFY;
  private static final SubLList $list67;
  private static final SubLObject $const68$assertionStrength;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$DEFAULT;
  private static final SubLObject $const71$Default_JustificationStrength;
  private static final SubLSymbol $kw72$MONOTONIC;
  private static final SubLObject $const73$Monotonic_JustificationStrength;
  private static final SubLString $str74$_S_was_not_a_el_strength_p;
  private static final SubLString $str75$_S_was_not_a_cycl_strength_p;
  private static final SubLSymbol $sym76$ASSERTION_P;
  private static final SubLSymbol $sym77$EL_STRENGTH_P;
  private static final SubLSymbol $sym78$_ASSERTION_STRENGTH_DEFINING_MT_;
  private static final SubLSymbol $kw79$REMOVAL_ASSERTION_STRENGTH_CHECK_POS;
  private static final SubLList $list80;
  private static final SubLSymbol $kw81$REMOVAL_ASSERTION_STRENGTH_CHECK_NEG;
  private static final SubLList $list82;
  private static final SubLSymbol $kw83$REMOVAL_ASSERTION_STRENGTH_UNIFY;
  private static final SubLList $list84;
  private static final SubLObject $const85$assertionTruth;
  private static final SubLList $list86;
  private static final SubLSymbol $kw87$TRUE;
  private static final SubLObject $const88$True_JustificationTruth;
  private static final SubLSymbol $kw89$FALSE;
  private static final SubLObject $const90$False_JustificationTruth;
  private static final SubLSymbol $kw91$UNKNOWN;
  private static final SubLObject $const92$Unknown_JustificationTruth;
  private static final SubLString $str93$_S_was_not_a_truth_p;
  private static final SubLString $str94$_S_was_not_a_cycl_truth_p;
  private static final SubLSymbol $sym95$_ASSERTION_TRUTH_DEFINING_MT_;
  private static final SubLSymbol $kw96$REMOVAL_ASSERTION_TRUTH_CHECK_POS;
  private static final SubLList $list97;
  private static final SubLSymbol $kw98$REMOVAL_ASSERTION_TRUTH_CHECK_NEG;
  private static final SubLList $list99;
  private static final SubLSymbol $kw100$REMOVAL_ASSERTION_TRUTH_UNIFY;
  private static final SubLList $list101;
  private static final SubLObject $const102$assertionJustificationAttribute;
  private static final SubLSymbol $sym103$FORT_P;
  private static final SubLObject $const104$AssertedBelief;
  private static final SubLObject $const105$SupportedByMaterialImplication;
  private static final SubLSymbol $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_;
  private static final SubLSymbol $kw107$REMOVAL_ASSERTION_JUST_ATT_CHECK_POS;
  private static final SubLList $list108;
  private static final SubLSymbol $kw109$REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG;
  private static final SubLList $list110;
  private static final SubLSymbol $kw111$REMOVAL_ASSERTION_JUST_ATT_UNIFY;
  private static final SubLList $list112;
  private static final SubLObject $const113$assertionAssertBy;
  private static final SubLSymbol $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_;
  private static final SubLString $str115$Computing_assertions_asserted_by_;
  private static final SubLSymbol $sym116$STRINGP;
  private static final SubLSymbol $kw117$SKIP;
  private static final SubLSymbol $kw118$LATENCY;
  private static final SubLSymbol $sym119$ASSERTION_ASSERTED_BY_;
  private static final SubLSymbol $kw120$TOTAL_TIME;
  private static final SubLString $str121$_S_was_not_one_of__latency_or__to;
  private static final SubLSymbol $kw122$REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG;
  private static final SubLList $list125;
  private static final SubLSymbol $kw126$REMOVAL_ASSERTION_ASSERT_BY_UNIFY;
  private static final SubLList $list127;
  private static final SubLObject $const128$HumanCyclist;
  private static final SubLSymbol $kw129$REMOVAL_ASSERTION_ASSERT_BY_LOOKUP;
  private static final SubLList $list130;
  private static final SubLSymbol $kw131$DISPREFER_ASSERTION_ASSERT_BY_LOOKUP;
  private static final SubLList $list132;
  private static final SubLObject $const133$assertionAssertTime;
  private static final SubLSymbol $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_;
  private static final SubLSymbol $sym135$UNIVERSAL_DATE_P;
  private static final SubLString $str136$Computing_assertions_asserted_on_;
  private static final SubLSymbol $sym137$ASSERTION_ASSERTED_WHEN_;
  private static final SubLSymbol $kw138$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS;
  private static final SubLList $list139;
  private static final SubLSymbol $kw140$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG;
  private static final SubLList $list141;
  private static final SubLSymbol $kw142$REMOVAL_ASSERTION_ASSERT_TIME_UNIFY;
  private static final SubLList $list143;
  private static final SubLInteger $int144$19950522;
  private static final SubLSymbol $kw145$REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP;
  private static final SubLList $list146;
  private static final SubLSymbol $kw147$DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP;
  private static final SubLList $list148;
  private static final SubLObject $const149$assertionAssertPurpose;
  private static final SubLSymbol $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_;
  private static final SubLString $str151$Computing_assertions_asserted_for;
  private static final SubLSymbol $sym152$ASSERTION_ASSERTED_WHY_;
  private static final SubLSymbol $kw153$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS;
  private static final SubLList $list154;
  private static final SubLSymbol $kw155$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG;
  private static final SubLList $list156;
  private static final SubLSymbol $kw157$REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY;
  private static final SubLList $list158;
  private static final SubLObject $const159$Cyc_BasedProject;
  private static final SubLSymbol $kw160$REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP;
  private static final SubLList $list161;
  private static final SubLSymbol $kw162$DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP;
  private static final SubLList $list163;
  private static final SubLObject $const164$assertionAssertDate;
  private static final SubLSymbol $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_;
  private static final SubLSymbol $kw166$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS;
  private static final SubLList $list167;
  private static final SubLSymbol $kw168$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG;
  private static final SubLList $list169;
  private static final SubLSymbol $kw170$REMOVAL_ASSERTION_ASSERT_DATE_UNIFY;
  private static final SubLList $list171;
  private static final SubLSymbol $kw172$REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP;
  private static final SubLList $list173;
  private static final SubLSymbol $kw174$DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP;
  private static final SubLList $list175;
  private static final SubLSymbol $kw176$REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$CONTEXTUALIZED_ASENT_ASENT;
  private static final SubLSymbol $sym180$_;
  private static final SubLSymbol $sym181$ASSERTION_ASSERTED_BY_ASENT_;
  private static final SubLSymbol $sym182$ASSERTION_ASSERT_TIME_ASENT_;
  private static final SubLSymbol $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT;
  private static final SubLSymbol $kw184$CYCLIST;
  private static final SubLSymbol $kw185$ASSERTION_VAR;
  private static final SubLSymbol $kw186$ASSERT_TIME_ARG2;
  private static final SubLSymbol $kw187$TIME_COMPARISON_ASENTS;
  private static final SubLSymbol $kw188$ASENTS;
  private static final SubLSymbol $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 771L)
  public static SubLObject hl_assertion_support_sentence_to_el(SubLObject support_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding( thread );
    try
    {
      czer_vars.$assertion_key$.bind( $sym0$ASSERTION_EL_IST_FORMULA, thread );
      support_sentence = cycl_utilities.hl_to_el( support_sentence );
    }
    finally
    {
      czer_vars.$assertion_key$.rebind( _prev_bind_0, thread );
    }
    return support_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 1697L)
  public static SubLObject make_assertion_mt_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_mt_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 5206L)
  public static SubLObject removal_assertion_mt_lookup_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject mt = el_utilities.literal_arg2( literal, UNPROVIDED );
    if( NIL != kb_indexing.broad_mtP( mt ) )
    {
      return assertion_handles.assertion_count();
    }
    return kb_indexing.num_mt_index( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6504L)
  public static SubLObject assertion_sentenceP(final SubLObject assertion, final SubLObject sentence)
  {
    return Equality.equal( sentence, assertions_high.assertion_formula( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6838L)
  public static SubLObject make_assertion_sentence_support_from_assertion(final SubLObject assertion, final SubLObject formula, SubLObject negateP)
  {
    if( negateP == UNPROVIDED )
    {
      negateP = NIL;
    }
    SubLObject support_sentence = el_utilities.make_binary_formula( $const18$assertionSentence, assertion, formula );
    if( NIL != negateP )
    {
      support_sentence = cycl_utilities.negate( support_sentence );
    }
    return make_assertion_sentence_support( support_sentence, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 7169L)
  public static SubLObject make_assertion_sentence_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_sentence_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 9474L)
  public static SubLObject assertion_fi_formula_robust(final SubLObject assertion, SubLObject substitute_varsP)
  {
    if( substitute_varsP == UNPROVIDED )
    {
      substitute_varsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw24$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym25$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          return fi.assertion_fi_formula( assertion, substitute_varsP );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw24$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 11523L)
  public static SubLObject removal_assertion_sentence_unbound_assertion_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_formula = el_utilities.literal_arg2( literal, UNPROVIDED );
    SubLObject total = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym31$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const32$EverythingPSC, thread );
      total = inference_trampolines.inference_num_gaf_lookup_index( hl_formula, $kw2$POS );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 11959L)
  public static SubLObject removal_assertion_sentence_expand_internal_1(final SubLObject assertion, final SubLObject assertion_var, final SubLObject hl_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward_utilities.direction_is_relevant( assertion ) )
    {
      final SubLObject gaf_formula = assertions_high.gaf_formula( assertion );
      thread.resetMultipleValues();
      final SubLObject assertion_bindings = unification_utilities.term_unify( assertion_var, assertion, T, T );
      final SubLObject assertion_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != assertion_bindings )
      {
        thread.resetMultipleValues();
        final SubLObject literal_bindings = unification_utilities.gaf_asent_unify( hl_formula, gaf_formula, T, T );
        final SubLObject literal_gaf_asent = thread.secondMultipleValue();
        final SubLObject literal_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != literal_bindings && NIL == bindings.some_variable_with_conflicting_bindings( assertion_bindings, literal_bindings ) )
        {
          backward.removal_add_node( make_assertion_sentence_support_from_assertion( assertion, gaf_formula, NIL ), ConsesLow.nconc( assertion_bindings, literal_bindings ), ConsesLow.append( assertion_justification,
              literal_justification ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 12951L)
  public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_assertion_sentence_unbound_assertion_cost( literal, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 13323L)
  public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion_var = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject hl_formula = el_utilities.literal_arg2( literal, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym31$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const32$EverythingPSC, thread );
      final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( hl_formula, $kw2$POS );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
      if( pcase_var.eql( $kw33$GAF_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != predicate )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                    SubLObject done_var_$1 = NIL;
                    final SubLObject token_var_$2 = NIL;
                    while ( NIL == done_var_$1)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                      final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                      if( NIL != valid_$3 )
                      {
                        removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                      }
                      done_var_$1 = makeBoolean( NIL == valid_$3 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          else
          {
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                    SubLObject done_var_$2 = NIL;
                    final SubLObject token_var_$3 = NIL;
                    while ( NIL == done_var_$2)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                      final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( assertion ) );
                      if( NIL != valid_$4 )
                      {
                        removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                      }
                      done_var_$2 = makeBoolean( NIL == valid_$4 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                  SubLObject done_var_$3 = NIL;
                  final SubLObject token_var_$4 = NIL;
                  while ( NIL == done_var_$3)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                    final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( assertion ) );
                    if( NIL != valid_$5 )
                    {
                      removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                    }
                    done_var_$3 = makeBoolean( NIL == valid_$5 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion ) );
                    if( NIL != valid_$6 )
                    {
                      removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw35$PREDICATE_EXTENT ) )
      {
        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                  SubLObject done_var_$5 = NIL;
                  final SubLObject token_var_$6 = NIL;
                  while ( NIL == done_var_$5)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$6 );
                    final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion2 ) );
                    if( NIL != valid_$7 )
                    {
                      removal_assertion_sentence_expand_internal_1( assertion2, assertion_var, hl_formula );
                    }
                    done_var_$5 = makeBoolean( NIL == valid_$7 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
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
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$18, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$8, thread );
          }
        }
      }
      else if( pcase_var.eql( $kw36$OVERLAP ) )
      {
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
        SubLObject assertion3 = NIL;
        assertion3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == enumeration_types.sense_truth( $kw2$POS ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( $kw2$POS ) ) )
          {
            removal_assertion_sentence_expand_internal_1( assertion3, assertion_var, hl_formula );
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion3 = cdolist_list_var.first();
        }
      }
      else
      {
        kb_mapping_macros.do_gli_method_error( l_index, method );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 14495L)
  public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_assertion_sentence_unbound_assertion_cost( literal, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 14865L)
  public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion_var = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject hl_formula = el_utilities.literal_arg2( literal, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym31$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const32$EverythingPSC, thread );
      final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( hl_formula, $kw2$POS );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
      if( pcase_var.eql( $kw33$GAF_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != predicate )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                    SubLObject done_var_$23 = NIL;
                    final SubLObject token_var_$24 = NIL;
                    while ( NIL == done_var_$23)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$24 );
                      final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( assertion ) );
                      if( NIL != valid_$25 )
                      {
                        removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                      }
                      done_var_$23 = makeBoolean( NIL == valid_$25 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          else
          {
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                    SubLObject done_var_$24 = NIL;
                    final SubLObject token_var_$25 = NIL;
                    while ( NIL == done_var_$24)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$25 );
                      final SubLObject valid_$26 = makeBoolean( !token_var_$25.eql( assertion ) );
                      if( NIL != valid_$26 )
                      {
                        removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                      }
                      done_var_$24 = makeBoolean( NIL == valid_$26 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                  SubLObject done_var_$25 = NIL;
                  final SubLObject token_var_$26 = NIL;
                  while ( NIL == done_var_$25)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
                    final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( assertion ) );
                    if( NIL != valid_$27 )
                    {
                      removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                    }
                    done_var_$25 = makeBoolean( NIL == valid_$27 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                  SubLObject done_var_$26 = NIL;
                  final SubLObject token_var_$27 = NIL;
                  while ( NIL == done_var_$26)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$27 );
                    final SubLObject valid_$28 = makeBoolean( !token_var_$27.eql( assertion ) );
                    if( NIL != valid_$28 )
                    {
                      removal_assertion_sentence_expand_internal_1( assertion, assertion_var, hl_formula );
                    }
                    done_var_$26 = makeBoolean( NIL == valid_$28 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw35$PREDICATE_EXTENT ) )
      {
        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$30 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$40 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw34$GAF, enumeration_types.sense_truth( $kw2$POS ), NIL );
                  SubLObject done_var_$27 = NIL;
                  final SubLObject token_var_$28 = NIL;
                  while ( NIL == done_var_$27)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$28 );
                    final SubLObject valid_$29 = makeBoolean( !token_var_$28.eql( assertion2 ) );
                    if( NIL != valid_$29 )
                    {
                      removal_assertion_sentence_expand_internal_1( assertion2, assertion_var, hl_formula );
                    }
                    done_var_$27 = makeBoolean( NIL == valid_$29 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
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
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$40, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$30, thread );
          }
        }
      }
      else if( pcase_var.eql( $kw36$OVERLAP ) )
      {
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
        SubLObject assertion3 = NIL;
        assertion3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == enumeration_types.sense_truth( $kw2$POS ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( $kw2$POS ) ) )
          {
            removal_assertion_sentence_expand_internal_1( assertion3, assertion_var, hl_formula );
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion3 = cdolist_list_var.first();
        }
      }
      else
      {
        kb_mapping_macros.do_gli_method_error( l_index, method );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16494L)
  public static SubLObject assertion_has_idP(final SubLObject assertion, final SubLObject id)
  {
    return Equality.equal( id, assertion_handles.assertion_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16700L)
  public static SubLObject make_assertion_id_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_id_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 20904L)
  public static SubLObject cycl_direction_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cycl_directions$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21066L)
  public static SubLObject direction_to_cycl_direction(final SubLObject direction)
  {
    if( direction.eql( $kw53$FORWARD ) )
    {
      return $const54$Forward_AssertionDirection;
    }
    if( direction.eql( $kw55$BACKWARD ) )
    {
      return $const56$Backward_AssertionDirection;
    }
    if( direction.eql( $kw57$CODE ) )
    {
      return $const58$Code_AssertionDirection;
    }
    Errors.error( $str59$_S_was_not_a_direction_p, direction );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21413L)
  public static SubLObject cycl_direction_to_direction(final SubLObject cycl_direction)
  {
    if( cycl_direction.eql( $const54$Forward_AssertionDirection ) )
    {
      return $kw53$FORWARD;
    }
    if( cycl_direction.eql( $const56$Backward_AssertionDirection ) )
    {
      return $kw55$BACKWARD;
    }
    if( cycl_direction.eql( $const58$Code_AssertionDirection ) )
    {
      return $kw57$CODE;
    }
    Errors.error( $str60$_S_was_not_a_cycl_direction_p, cycl_direction );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21864L)
  public static SubLObject make_assertion_direction_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_direction_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26314L)
  public static SubLObject cycl_strength_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cycl_strengths$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26473L)
  public static SubLObject strength_to_cycl_strength(final SubLObject strength)
  {
    if( strength.eql( $kw70$DEFAULT ) )
    {
      return $const71$Default_JustificationStrength;
    }
    if( strength.eql( $kw72$MONOTONIC ) )
    {
      return $const73$Monotonic_JustificationStrength;
    }
    Errors.error( $str74$_S_was_not_a_el_strength_p, strength );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26790L)
  public static SubLObject cycl_strength_to_strength(final SubLObject cycl_strength)
  {
    if( cycl_strength.eql( $const71$Default_JustificationStrength ) )
    {
      return $kw70$DEFAULT;
    }
    if( cycl_strength.eql( $const73$Monotonic_JustificationStrength ) )
    {
      return $kw72$MONOTONIC;
    }
    Errors.error( $str75$_S_was_not_a_cycl_strength_p, cycl_strength );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27110L)
  public static SubLObject assertion_has_strength(final SubLObject assertion, final SubLObject strength)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != enumeration_types.el_strength_p( strength ) : strength;
    return Equality.eql( strength, assertions_high.assertion_strength( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27439L)
  public static SubLObject make_assertion_strength_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_strength_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31721L)
  public static SubLObject cycl_truth_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cycl_truths$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31871L)
  public static SubLObject truth_to_cycl_truth(final SubLObject truth)
  {
    if( truth.eql( $kw87$TRUE ) )
    {
      return $const88$True_JustificationTruth;
    }
    if( truth.eql( $kw89$FALSE ) )
    {
      return $const90$False_JustificationTruth;
    }
    if( truth.eql( $kw91$UNKNOWN ) )
    {
      return $const92$Unknown_JustificationTruth;
    }
    Errors.error( $str93$_S_was_not_a_truth_p, truth );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32207L)
  public static SubLObject cycl_truth_to_truth(final SubLObject cycl_truth)
  {
    if( cycl_truth.eql( $const88$True_JustificationTruth ) )
    {
      return $kw87$TRUE;
    }
    if( cycl_truth.eql( $const90$False_JustificationTruth ) )
    {
      return $kw89$FALSE;
    }
    if( cycl_truth.eql( $const92$Unknown_JustificationTruth ) )
    {
      return $kw91$UNKNOWN;
    }
    Errors.error( $str94$_S_was_not_a_cycl_truth_p, cycl_truth );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32627L)
  public static SubLObject make_assertion_truth_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_truth_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 36603L)
  public static SubLObject inference_assertion_just_att(final SubLObject assertion, final SubLObject att)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != forts.fort_p( att ) : att;
    if( att.eql( $const104$AssertedBelief ) )
    {
      return assertions_high.asserted_assertionP( assertion );
    }
    if( att.eql( $const105$SupportedByMaterialImplication ) )
    {
      return assertions_high.deduced_assertionP( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 36904L)
  public static SubLObject inference_all_assertion_just_att(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject attributes = NIL;
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      attributes = ConsesLow.cons( $const104$AssertedBelief, attributes );
    }
    if( NIL != assertions_high.deduced_assertionP( assertion ) )
    {
      attributes = ConsesLow.cons( $const105$SupportedByMaterialImplication, attributes );
    }
    return Sequences.nreverse( attributes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37349L)
  public static SubLObject make_assertion_just_att_support(SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    support_sentence = hl_assertion_support_sentence_to_el( support_sentence );
    support_mt = $assertion_just_att_defining_mt$.getGlobalValue();
    final SubLObject support = arguments.make_hl_support( $kw6$OPAQUE, support_sentence, support_mt, $kw7$TRUE_MON );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41144L)
  public static SubLObject assertion_asserted_byP(final SubLObject assertion, final SubLObject cyclist)
  {
    return Equality.equal( cyclist, assertions_high.asserted_by( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41337L)
  public static SubLObject all_assertions_asserted_by(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject progress_message = PrintLow.format( NIL, $str115$Computing_assertions_asserted_by_, cyclist );
    SubLObject result = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = progress_message;
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
        final SubLObject idx_$45 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$45, $kw117$SKIP ) )
        {
          final SubLObject idx_$46 = idx_$45;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$46, $kw117$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$46 );
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
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw117$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_asserted_byP( ass, cyclist ) )
                {
                  result = ConsesLow.cons( ass, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$47 = idx_$45;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$47 ) || NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$47 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$47 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$47 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw117$SKIP ) ) ? NIL : $kw117$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_asserted_byP( ass2, cyclist ) )
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
        final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41994L)
  public static SubLObject new_assertion_asserted_by_iterator(final SubLObject cyclist, SubLObject optimize)
  {
    if( optimize == UNPROVIDED )
    {
      optimize = $kw118$LATENCY;
    }
    final SubLObject pcase_var = optimize;
    if( pcase_var.eql( $kw118$LATENCY ) )
    {
      final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
      final SubLObject filter_args = ConsesLow.list( cyclist );
      return iteration.new_filter_iterator( input_iterator, $sym119$ASSERTION_ASSERTED_BY_, filter_args );
    }
    if( pcase_var.eql( $kw120$TOTAL_TIME ) )
    {
      return iteration.new_list_iterator( all_assertions_asserted_by( cyclist ) );
    }
    return Errors.error( $str121$_S_was_not_one_of__latency_or__to, optimize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 45907L)
  public static SubLObject current_inference_exhaustiveP()
  {
    final SubLObject inference = inference_macros.current_controlling_inference();
    return makeBoolean( NIL == inference || NIL != inference_datastructures_inference.inference_dynamic_properties_exhaustiveP( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46353L)
  public static SubLObject estimated_average_assertions_per_cyclist()
  {
    return Numbers.integerDivide( assertion_handles.assertion_count(), Numbers.max( ONE_INTEGER, cardinality_estimates.instance_cardinality( $const128$HumanCyclist ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46544L)
  public static SubLObject removal_assertion_assert_by_lookup_cost(final SubLObject cyclist)
  {
    return number_utilities.f_2X( estimated_average_assertions_per_cyclist() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46926L)
  public static SubLObject removal_assertion_asserted_by_iterator(final SubLObject cyclist)
  {
    final SubLObject optimize = ( NIL != current_inference_exhaustiveP() ) ? $kw120$TOTAL_TIME : $kw118$LATENCY;
    return new_assertion_asserted_by_iterator( cyclist, optimize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 48831L)
  public static SubLObject assertion_asserted_whenP(final SubLObject assertion, final SubLObject universal_date)
  {
    return Equality.eql( universal_date, assertions_high.asserted_when( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 49058L)
  public static SubLObject all_assertions_asserted_when(final SubLObject universal_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != numeric_date_utilities.universal_date_p( universal_date ) : universal_date;
    final SubLObject progress_message = PrintLow.format( NIL, $str136$Computing_assertions_asserted_on_, numeric_date_utilities.datestring( universal_date ) );
    SubLObject result = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = progress_message;
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
        final SubLObject idx_$49 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$49, $kw117$SKIP ) )
        {
          final SubLObject idx_$50 = idx_$49;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$50, $kw117$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$50 );
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
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw117$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_asserted_whenP( ass, universal_date ) )
                {
                  result = ConsesLow.cons( ass, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$51 = idx_$49;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$51 ) || NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$51 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$51 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$51 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw117$SKIP ) ) ? NIL : $kw117$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_asserted_whenP( ass2, universal_date ) )
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
        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 49815L)
  public static SubLObject new_assertion_asserted_when_iterator(final SubLObject universal_date, SubLObject optimize)
  {
    if( optimize == UNPROVIDED )
    {
      optimize = $kw118$LATENCY;
    }
    assert NIL != numeric_date_utilities.universal_date_p( universal_date ) : universal_date;
    final SubLObject pcase_var = optimize;
    if( pcase_var.eql( $kw118$LATENCY ) )
    {
      final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
      final SubLObject filter_args = ConsesLow.list( universal_date );
      return iteration.new_filter_iterator( input_iterator, $sym137$ASSERTION_ASSERTED_WHEN_, filter_args );
    }
    if( pcase_var.eql( $kw120$TOTAL_TIME ) )
    {
      return iteration.new_list_iterator( all_assertions_asserted_when( universal_date ) );
    }
    return Errors.error( $str121$_S_was_not_one_of__latency_or__to, optimize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 54709L)
  public static SubLObject estimated_average_assertions_per_date()
  {
    return Numbers.integerDivide( assertion_handles.assertion_count(), Numbers.integerDivide( Numbers.subtract( numeric_date_utilities.universal_time_from_date_and_second( numeric_date_utilities.today(), UNPROVIDED ),
        numeric_date_utilities.universal_time_from_date_and_second( $earliest_known_asserted_when$.getGlobalValue(), UNPROVIDED ) ), numeric_date_utilities.$seconds_in_a_day$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 55072L)
  public static SubLObject removal_assertion_assert_time_lookup_cost(final SubLObject universal_date)
  {
    return number_utilities.f_2X( estimated_average_assertions_per_date() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 55476L)
  public static SubLObject removal_assertion_asserted_when_iterator(final SubLObject universal_date)
  {
    final SubLObject optimize = ( NIL != current_inference_exhaustiveP() ) ? $kw120$TOTAL_TIME : $kw118$LATENCY;
    return new_assertion_asserted_when_iterator( universal_date, optimize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57546L)
  public static SubLObject assertion_asserted_whyP(final SubLObject assertion, final SubLObject reason)
  {
    return Equality.equal( reason, assertions_high.asserted_why( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57752L)
  public static SubLObject all_assertions_asserted_why(final SubLObject reason)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject progress_message = PrintLow.format( NIL, $str151$Computing_assertions_asserted_for, reason );
    SubLObject result = NIL;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = progress_message;
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
        final SubLObject idx_$53 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$53, $kw117$SKIP ) )
        {
          final SubLObject idx_$54 = idx_$53;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$54, $kw117$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$54 );
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
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw117$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_asserted_whyP( ass, reason ) )
                {
                  result = ConsesLow.cons( ass, result );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$55 = idx_$53;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$55 ) || NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$55 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$55 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$55 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw117$SKIP ) ) ? NIL : $kw117$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw117$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_asserted_whyP( ass2, reason ) )
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
        final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 58422L)
  public static SubLObject new_assertion_asserted_why_iterator(final SubLObject reason, SubLObject optimize)
  {
    if( optimize == UNPROVIDED )
    {
      optimize = $kw118$LATENCY;
    }
    final SubLObject pcase_var = optimize;
    if( pcase_var.eql( $kw118$LATENCY ) )
    {
      final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
      final SubLObject filter_args = ConsesLow.list( reason );
      return iteration.new_filter_iterator( input_iterator, $sym152$ASSERTION_ASSERTED_WHY_, filter_args );
    }
    if( pcase_var.eql( $kw120$TOTAL_TIME ) )
    {
      return iteration.new_list_iterator( all_assertions_asserted_why( reason ) );
    }
    return Errors.error( $str121$_S_was_not_one_of__latency_or__to, optimize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 62505L)
  public static SubLObject estimated_average_assertions_per_purpose()
  {
    return Numbers.integerDivide( assertion_handles.assertion_count(), Numbers.max( ONE_INTEGER, cardinality_estimates.instance_cardinality( $const159$Cyc_BasedProject ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 62833L)
  public static SubLObject removal_assertion_assert_purpose_lookup_cost(final SubLObject reason)
  {
    return number_utilities.f_2X( estimated_average_assertions_per_purpose() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 63218L)
  public static SubLObject removal_assertion_asserted_why_iterator(final SubLObject reason)
  {
    final SubLObject optimize = ( NIL != current_inference_exhaustiveP() ) ? $kw120$TOTAL_TIME : $kw118$LATENCY;
    return new_assertion_asserted_why_iterator( reason, optimize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 68801L)
  public static SubLObject removal_assertion_assert_date_lookup_cost(final SubLObject cycl_date)
  {
    return number_utilities.f_2X( estimated_average_assertions_per_date() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 71921L)
  public static SubLObject removal_assertion_asserted_by_between_dates_cost(final SubLObject contextualized_dnf_clause)
  {
    return SEVENTEEN_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 72264L)
  public static SubLObject removal_assertion_asserted_by_between_dates_applicability(final SubLObject contextualized_dnf_clause)
  {
    final SubLObject asents = Mapping.mapcar( $sym179$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits( contextualized_dnf_clause ) );
    SubLObject clause_numbers = NIL;
    SubLObject list_var = NIL;
    SubLObject asent_1 = NIL;
    SubLObject clause_number_1 = NIL;
    list_var = asents;
    asent_1 = list_var.first();
    for( clause_number_1 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), asent_1 = list_var.first(), clause_number_1 = Numbers.add( ONE_INTEGER, clause_number_1 ) )
    {
      if( NIL != forts.fort_p( cycl_utilities.formula_arg2( asent_1, UNPROVIDED ) ) && NIL != assertion_asserted_by_asentP( asent_1 ) )
      {
        final SubLObject asserted_by_variable = cycl_utilities.formula_arg1( asent_1, UNPROVIDED );
        if( NIL != variables.variable_p( asserted_by_variable ) )
        {
          SubLObject list_var_$57 = NIL;
          SubLObject asent_2 = NIL;
          SubLObject clause_number_2 = NIL;
          list_var_$57 = asents;
          asent_2 = list_var_$57.first();
          for( clause_number_2 = ZERO_INTEGER; NIL != list_var_$57; list_var_$57 = list_var_$57.rest(), asent_2 = list_var_$57.first(), clause_number_2 = Numbers.add( ONE_INTEGER, clause_number_2 ) )
          {
            if( NIL != assertion_assert_time_asentP( asent_2 ) && cycl_utilities.formula_arg1( asent_2, UNPROVIDED ).eql( asserted_by_variable ) )
            {
              SubLObject pos_lit_numbers = ConsesLow.list( clause_number_1, clause_number_2 );
              final SubLObject time_variable = cycl_utilities.formula_arg2( asent_2, UNPROVIDED );
              if( NIL != variables.variable_p( time_variable ) && !time_variable.eql( asserted_by_variable ) )
              {
                SubLObject list_var_$58 = NIL;
                SubLObject asent_3 = NIL;
                SubLObject clause_number_3 = NIL;
                list_var_$58 = asents;
                asent_3 = list_var_$58.first();
                for( clause_number_3 = ZERO_INTEGER; NIL != list_var_$58; list_var_$58 = list_var_$58.rest(), asent_3 = list_var_$58.first(), clause_number_3 = Numbers.add( ONE_INTEGER, clause_number_3 ) )
                {
                  if( NIL != removal_assertion_asserted_by_between_dates_date_comparison_asentP( asent_3 ) && ( ( cycl_utilities.formula_arg2( asent_3, UNPROVIDED ).isInteger() && cycl_utilities.formula_arg1( asent_3,
                      UNPROVIDED ).eql( time_variable ) ) || ( cycl_utilities.formula_arg1( asent_3, UNPROVIDED ).isInteger() && cycl_utilities.formula_arg2( asent_3, UNPROVIDED ).eql( time_variable ) ) ) )
                  {
                    pos_lit_numbers = ConsesLow.cons( clause_number_3, pos_lit_numbers );
                  }
                }
                clause_numbers = ConsesLow.cons( ConsesLow.list( NIL, Sort.sort( pos_lit_numbers, Symbols.symbol_function( $sym180$_ ), UNPROVIDED ) ), clause_numbers );
              }
            }
          }
        }
      }
    }
    return clause_numbers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73639L)
  public static SubLObject assertion_asserted_by_asentP(final SubLObject asent)
  {
    return Equality.eql( cycl_utilities.formula_arg0( asent ), $const113$assertionAssertBy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73752L)
  public static SubLObject assertion_assert_time_asentP(final SubLObject asent)
  {
    return Equality.eql( cycl_utilities.formula_arg0( asent ), $const133$assertionAssertTime );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73866L)
  public static SubLObject removal_assertion_asserted_by_between_dates_date_comparison_asentP(final SubLObject asent)
  {
    return subl_promotions.memberP( cycl_utilities.formula_arg0( asent ), $removal_assertion_asserted_by_between_dates_date_comparison_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 74071L)
  public static SubLObject removal_assertion_asserted_by_between_dates_expand_iterator(final SubLObject contextualized_dnf_clause)
  {
    final SubLObject asents = Mapping.mapcar( $sym179$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits( contextualized_dnf_clause ) );
    final SubLObject asserted_by_asent = Sequences.find_if( $sym181$ASSERTION_ASSERTED_BY_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject assert_time_asent = Sequences.find_if( $sym182$ASSERTION_ASSERT_TIME_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject time_comparison_asents = list_utilities.find_all_if( $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT, asents, UNPROVIDED );
    final SubLObject assertion_var = cycl_utilities.formula_arg1( asserted_by_asent, UNPROVIDED );
    final SubLObject cyclist = cycl_utilities.formula_arg2( asserted_by_asent, UNPROVIDED );
    final SubLObject assert_time_arg2 = cycl_utilities.formula_arg2( assert_time_asent, UNPROVIDED );
    final SubLObject filter_and_transform_args = ConsesLow.list( list_utilities.make_plist( ConsesLow.list( $kw184$CYCLIST, $kw185$ASSERTION_VAR, $kw186$ASSERT_TIME_ARG2, $kw187$TIME_COMPARISON_ASENTS, $kw188$ASENTS ),
        ConsesLow.list( cyclist, assertion_var, assert_time_arg2, time_comparison_asents, asents ) ) );
    return iteration.new_filter_and_transform_iterator( assertion_handles.new_assertions_iterator(), $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T, filter_and_transform_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 75301L)
  public static SubLObject removal_assertion_asserted_by_between_dates_iterator_filter_and_transform(final SubLObject assertion, final SubLObject filter_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cyclist = conses_high.getf( filter_args, $kw184$CYCLIST, UNPROVIDED );
    final SubLObject assertion_var = conses_high.getf( filter_args, $kw185$ASSERTION_VAR, UNPROVIDED );
    final SubLObject assert_time_arg2 = conses_high.getf( filter_args, $kw186$ASSERT_TIME_ARG2, UNPROVIDED );
    final SubLObject time_comparison_asents = conses_high.getf( filter_args, $kw187$TIME_COMPARISON_ASENTS, UNPROVIDED );
    final SubLObject asents = conses_high.getf( filter_args, $kw188$ASENTS, UNPROVIDED );
    final SubLObject assertion_cyclist = assertions_high.asserted_by( assertion );
    final SubLObject assertion_date = assertions_high.asserted_when( assertion );
    if( assert_time_arg2.isInteger() )
    {
      if( assertion_cyclist.eql( cyclist ) && assertion_date.eql( assert_time_arg2 ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( assertion_var, assertion, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject justifications = ConsesLow.list( ConsesLow.listS( removal_modules_bookkeeping.make_bookkeeping_hl_support( ConsesLow.list( $const113$assertionAssertBy, assertion, assertion_cyclist ) ),
            removal_modules_bookkeeping.make_bookkeeping_hl_support( ConsesLow.list( $const133$assertionAssertTime, assertion, assertion_date ) ), unify_justification ) );
        return Values.values( ConsesLow.list( v_bindings, justifications ), T );
      }
    }
    else if( assertion_cyclist.eql( cyclist ) )
    {
      SubLObject failureP = NIL;
      if( NIL == failureP )
      {
        SubLObject csome_list_var = time_comparison_asents;
        SubLObject time_comparison_asent = NIL;
        time_comparison_asent = csome_list_var.first();
        while ( NIL == failureP && NIL != csome_list_var)
        {
          final SubLObject bound_time_comparison_asent = cycl_utilities.expression_subst( assertion_date, assert_time_arg2, time_comparison_asent, UNPROVIDED, UNPROVIDED );
          if( NIL == relation_evaluation.cyc_evaluate( bound_time_comparison_asent ) )
          {
            failureP = T;
          }
          csome_list_var = csome_list_var.rest();
          time_comparison_asent = csome_list_var.first();
        }
      }
      if( NIL == failureP )
      {
        thread.resetMultipleValues();
        final SubLObject bindings1 = unification_utilities.term_unify( assertion_var, assertion, UNPROVIDED, UNPROVIDED );
        final SubLObject unify_justification2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject bindings2 = unification_utilities.term_unify( assert_time_arg2, assertion_date, UNPROVIDED, UNPROVIDED );
        final SubLObject unify_justification3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings2 = ConsesLow.append( bindings1, bindings2 );
        final SubLObject unify_justification4 = ConsesLow.append( unify_justification2, unify_justification3 );
        SubLObject justifications2 = NIL;
        SubLObject cdolist_list_var = asents;
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( cycl_utilities.formula_arg0( asent ).eql( $const133$assertionAssertTime ) )
          {
            justifications2 = ConsesLow.cons( ConsesLow.listS( removal_modules_bookkeeping.make_bookkeeping_hl_support( el_utilities.make_binary_formula( $const133$assertionAssertTime, assertion, assertion_date ) ),
                unify_justification4 ), justifications2 );
          }
          else if( cycl_utilities.formula_arg0( asent ).eql( $const113$assertionAssertBy ) )
          {
            justifications2 = ConsesLow.cons( ConsesLow.listS( removal_modules_bookkeeping.make_bookkeeping_hl_support( el_utilities.make_binary_formula( $const113$assertionAssertBy, assertion, assertion_cyclist ) ),
                unify_justification4 ), justifications2 );
          }
          else
          {
            justifications2 = ConsesLow.cons( ConsesLow.listS( removal_modules_evaluation.make_eval_support( bindings.apply_bindings( v_bindings2, asent ), UNPROVIDED ), unify_justification4 ), justifications2 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          asent = cdolist_list_var.first();
        }
        justifications2 = Sequences.nreverse( justifications2 );
        return Values.values( ConsesLow.list( v_bindings2, justifications2 ), T );
      }
    }
    return Values.values( NIL, NIL );
  }

  public static SubLObject declare_removal_modules_assertion_mt_file()
  {
    SubLFiles.declareFunction( me, "hl_assertion_support_sentence_to_el", "HL-ASSERTION-SUPPORT-SENTENCE-TO-EL", 1, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_mt_support", "MAKE-ASSERTION-MT-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_assertion_mt_lookup_cost", "REMOVAL-ASSERTION-MT-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_sentenceP", "ASSERTION-SENTENCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_sentence_support_from_assertion", "MAKE-ASSERTION-SENTENCE-SUPPORT-FROM-ASSERTION", 2, 1, false );
    SubLFiles.declareFunction( me, "make_assertion_sentence_support", "MAKE-ASSERTION-SENTENCE-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_fi_formula_robust", "ASSERTION-FI-FORMULA-ROBUST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_assertion_sentence_unbound_assertion_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_assertion_sentence_expand_internal_1", "REMOVAL-ASSERTION-SENTENCE-EXPAND-INTERNAL-1", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_sentence_unbound_assertion_pred_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_assertion_sentence_unbound_assertion_pred_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_assertion_sentence_unbound_assertion_arg_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_assertion_sentence_unbound_assertion_arg_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_has_idP", "ASSERTION-HAS-ID?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_id_support", "MAKE-ASSERTION-ID-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cycl_direction_p", "CYCL-DIRECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "direction_to_cycl_direction", "DIRECTION-TO-CYCL-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_direction_to_direction", "CYCL-DIRECTION-TO-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_direction_support", "MAKE-ASSERTION-DIRECTION-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cycl_strength_p", "CYCL-STRENGTH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strength_to_cycl_strength", "STRENGTH-TO-CYCL-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_strength_to_strength", "CYCL-STRENGTH-TO-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_has_strength", "ASSERTION-HAS-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_strength_support", "MAKE-ASSERTION-STRENGTH-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cycl_truth_p", "CYCL-TRUTH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "truth_to_cycl_truth", "TRUTH-TO-CYCL-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_truth_to_truth", "CYCL-TRUTH-TO-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_truth_support", "MAKE-ASSERTION-TRUTH-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_assertion_just_att", "INFERENCE-ASSERTION-JUST-ATT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_assertion_just_att", "INFERENCE-ALL-ASSERTION-JUST-ATT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_assertion_just_att_support", "MAKE-ASSERTION-JUST-ATT-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_asserted_byP", "ASSERTION-ASSERTED-BY?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_assertions_asserted_by", "ALL-ASSERTIONS-ASSERTED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_assertion_asserted_by_iterator", "NEW-ASSERTION-ASSERTED-BY-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "current_inference_exhaustiveP", "CURRENT-INFERENCE-EXHAUSTIVE?", 0, 0, false );
    SubLFiles.declareFunction( me, "estimated_average_assertions_per_cyclist", "ESTIMATED-AVERAGE-ASSERTIONS-PER-CYCLIST", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_assert_by_lookup_cost", "REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_by_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_asserted_whenP", "ASSERTION-ASSERTED-WHEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_assertions_asserted_when", "ALL-ASSERTIONS-ASSERTED-WHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "new_assertion_asserted_when_iterator", "NEW-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "estimated_average_assertions_per_date", "ESTIMATED-AVERAGE-ASSERTIONS-PER-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_assert_time_lookup_cost", "REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_when_iterator", "REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_asserted_whyP", "ASSERTION-ASSERTED-WHY?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_assertions_asserted_why", "ALL-ASSERTIONS-ASSERTED-WHY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_assertion_asserted_why_iterator", "NEW-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "estimated_average_assertions_per_purpose", "ESTIMATED-AVERAGE-ASSERTIONS-PER-PURPOSE", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_assert_purpose_lookup_cost", "REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_why_iterator", "REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_assert_date_lookup_cost", "REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_by_between_dates_cost", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_by_between_dates_applicability", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_asserted_by_asentP", "ASSERTION-ASSERTED-BY-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_assert_time_asentP", "ASSERTION-ASSERT-TIME-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_by_between_dates_date_comparison_asentP", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_by_between_dates_expand_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_asserted_by_between_dates_iterator_filter_and_transform", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_assertion_mt_file()
  {
    $assertion_mt_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-MT-DEFINING-MT*", maybeDefault( $sym4$_ASSERTION_MT_DEFINING_MT_, $assertion_mt_defining_mt$, $const5$BaseKB ) );
    $default_assertion_mt_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-MT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $assertion_sentence_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-SENTENCE-DEFINING-MT*", maybeDefault( $sym19$_ASSERTION_SENTENCE_DEFINING_MT_, $assertion_sentence_defining_mt$, $const5$BaseKB ) );
    $default_assertion_sentence_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_assertion_sentence_lookup_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $assertion_id_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-ID-DEFINING-MT*", maybeDefault( $sym42$_ASSERTION_ID_DEFINING_MT_, $assertion_id_defining_mt$, $const5$BaseKB ) );
    $default_assertion_id_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-ID-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $cycl_directions$ = SubLFiles.deflexical( "*CYCL-DIRECTIONS*", $list52 );
    $assertion_direction_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-DIRECTION-DEFINING-MT*", maybeDefault( $sym61$_ASSERTION_DIRECTION_DEFINING_MT_, $assertion_direction_defining_mt$, $const5$BaseKB ) );
    $default_assertion_direction_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $cycl_strengths$ = SubLFiles.deflexical( "*CYCL-STRENGTHS*", $list69 );
    $assertion_strength_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-STRENGTH-DEFINING-MT*", maybeDefault( $sym78$_ASSERTION_STRENGTH_DEFINING_MT_, $assertion_strength_defining_mt$, $const5$BaseKB ) );
    $default_assertion_strength_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $cycl_truths$ = SubLFiles.deflexical( "*CYCL-TRUTHS*", $list86 );
    $assertion_truth_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-TRUTH-DEFINING-MT*", maybeDefault( $sym95$_ASSERTION_TRUTH_DEFINING_MT_, $assertion_truth_defining_mt$, $const5$BaseKB ) );
    $default_assertion_truth_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-TRUTH-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $assertion_just_att_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-JUST-ATT-DEFINING-MT*", maybeDefault( $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_, $assertion_just_att_defining_mt$, $const5$BaseKB ) );
    $default_assertion_just_att_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $assertion_assert_by_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-ASSERT-BY-DEFINING-MT*", maybeDefault( $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_, $assertion_assert_by_defining_mt$, $const5$BaseKB ) );
    $default_assertion_assert_by_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $assertion_assert_time_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-ASSERT-TIME-DEFINING-MT*", maybeDefault( $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_, $assertion_assert_time_defining_mt$, $const5$BaseKB ) );
    $default_assertion_assert_time_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $earliest_known_asserted_when$ = SubLFiles.deflexical( "*EARLIEST-KNOWN-ASSERTED-WHEN*", $int144$19950522 );
    $assertion_assert_purpose_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*", maybeDefault( $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_, $assertion_assert_purpose_defining_mt$,
        $const5$BaseKB ) );
    $default_assertion_assert_purpose_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $assertion_assert_date_defining_mt$ = SubLFiles.deflexical( "*ASSERTION-ASSERT-DATE-DEFINING-MT*", maybeDefault( $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_, $assertion_assert_date_defining_mt$, $const5$BaseKB ) );
    $default_assertion_assert_date_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = SubLFiles.deflexical( "*REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-PREDICATES*", $list178 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_assertion_mt_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const1$assertionMt );
    preference_modules.doomed_unless_either_arg_bindable( $kw2$POS, $const1$assertionMt );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const1$assertionMt );
    subl_macro_promotions.declare_defglobal( $sym4$_ASSERTION_MT_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym4$_ASSERTION_MT_DEFINING_MT_, $const1$assertionMt );
    inference_modules.inference_removal_module( $kw8$REMOVAL_ASSERTION_MT_CHECK_POS, $list9 );
    inference_modules.inference_removal_module( $kw10$REMOVAL_ASSERTION_MT_PRUNE_POS, $list11 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_ASSERTION_MT_CHECK_NEG, $list13 );
    inference_modules.inference_removal_module( $kw14$REMOVAL_ASSERTION_MT_UNIFY, $list15 );
    inference_modules.inference_removal_module( $kw16$REMOVAL_ASSERTION_MT_LOOKUP, $list17 );
    inference_modules.register_solely_specific_removal_module_predicate( $const18$assertionSentence );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const18$assertionSentence );
    subl_macro_promotions.declare_defglobal( $sym19$_ASSERTION_SENTENCE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym19$_ASSERTION_SENTENCE_DEFINING_MT_, $const18$assertionSentence );
    inference_modules.inference_removal_module( $kw20$REMOVAL_ASSERTION_FORMULA_CHECK_POS, $list21 );
    inference_modules.inference_removal_module( $kw22$REMOVAL_ASSERTION_FORMULA_CHECK_NEG, $list23 );
    inference_modules.inference_removal_module( $kw27$REMOVAL_ASSERTION_FORMULA_UNIFY, $list28 );
    inference_modules.inference_removal_module( $kw29$REMOVAL_ASSERTION_FORMULA_LOOKUP, $list30 );
    inference_modules.inference_removal_module( $kw37$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP, $list38 );
    inference_modules.inference_removal_module( $kw39$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP, $list40 );
    inference_modules.register_solely_specific_removal_module_predicate( $const41$assertionID );
    preference_modules.doomed_unless_either_arg_bindable( $kw2$POS, $const41$assertionID );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const41$assertionID );
    subl_macro_promotions.declare_defglobal( $sym42$_ASSERTION_ID_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym42$_ASSERTION_ID_DEFINING_MT_, $const41$assertionID );
    inference_modules.inference_removal_module( $kw43$REMOVAL_ASSERTION_ID_CHECK_POS, $list44 );
    inference_modules.inference_removal_module( $kw45$REMOVAL_ASSERTION_ID_CHECK_NEG, $list46 );
    inference_modules.inference_removal_module( $kw47$REMOVAL_ASSERTION_ID_UNIFY, $list48 );
    inference_modules.inference_removal_module( $kw49$REMOVAL_ASSERTION_ID_LOOKUP, $list50 );
    inference_modules.register_solely_specific_removal_module_predicate( $const51$assertionDirection );
    preference_modules.doomed_unless_arg_bindable( $kw2$POS, $const51$assertionDirection, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const51$assertionDirection );
    subl_macro_promotions.declare_defglobal( $sym61$_ASSERTION_DIRECTION_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym61$_ASSERTION_DIRECTION_DEFINING_MT_, $const51$assertionDirection );
    inference_modules.inference_removal_module( $kw62$REMOVAL_ASSERTION_DIRECTION_CHECK_POS, $list63 );
    inference_modules.inference_removal_module( $kw64$REMOVAL_ASSERTION_DIRECTION_CHECK_NEG, $list65 );
    inference_modules.inference_removal_module( $kw66$REMOVAL_ASSERTION_DIRECTION_UNIFY, $list67 );
    inference_modules.register_solely_specific_removal_module_predicate( $const68$assertionStrength );
    preference_modules.doomed_unless_arg_bindable( $kw2$POS, $const68$assertionStrength, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const68$assertionStrength );
    subl_macro_promotions.declare_defglobal( $sym78$_ASSERTION_STRENGTH_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym78$_ASSERTION_STRENGTH_DEFINING_MT_, $const68$assertionStrength );
    inference_modules.inference_removal_module( $kw79$REMOVAL_ASSERTION_STRENGTH_CHECK_POS, $list80 );
    inference_modules.inference_removal_module( $kw81$REMOVAL_ASSERTION_STRENGTH_CHECK_NEG, $list82 );
    inference_modules.inference_removal_module( $kw83$REMOVAL_ASSERTION_STRENGTH_UNIFY, $list84 );
    inference_modules.register_solely_specific_removal_module_predicate( $const85$assertionTruth );
    preference_modules.doomed_unless_arg_bindable( $kw2$POS, $const85$assertionTruth, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const85$assertionTruth );
    subl_macro_promotions.declare_defglobal( $sym95$_ASSERTION_TRUTH_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym95$_ASSERTION_TRUTH_DEFINING_MT_, $const85$assertionTruth );
    inference_modules.inference_removal_module( $kw96$REMOVAL_ASSERTION_TRUTH_CHECK_POS, $list97 );
    inference_modules.inference_removal_module( $kw98$REMOVAL_ASSERTION_TRUTH_CHECK_NEG, $list99 );
    inference_modules.inference_removal_module( $kw100$REMOVAL_ASSERTION_TRUTH_UNIFY, $list101 );
    inference_modules.register_solely_specific_removal_module_predicate( $const102$assertionJustificationAttribute );
    preference_modules.doomed_unless_arg_bindable( $kw2$POS, $const102$assertionJustificationAttribute, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const102$assertionJustificationAttribute );
    subl_macro_promotions.declare_defglobal( $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_, $const102$assertionJustificationAttribute );
    inference_modules.inference_removal_module( $kw107$REMOVAL_ASSERTION_JUST_ATT_CHECK_POS, $list108 );
    inference_modules.inference_removal_module( $kw109$REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG, $list110 );
    inference_modules.inference_removal_module( $kw111$REMOVAL_ASSERTION_JUST_ATT_UNIFY, $list112 );
    inference_modules.register_solely_specific_removal_module_predicate( $const113$assertionAssertBy );
    preference_modules.doomed_unless_either_arg_bindable( $kw2$POS, $const113$assertionAssertBy );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const113$assertionAssertBy );
    subl_macro_promotions.declare_defglobal( $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_, $const113$assertionAssertBy );
    inference_modules.inference_removal_module( $kw122$REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS, $list123 );
    inference_modules.inference_removal_module( $kw124$REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG, $list125 );
    inference_modules.inference_removal_module( $kw126$REMOVAL_ASSERTION_ASSERT_BY_UNIFY, $list127 );
    inference_modules.inference_removal_module( $kw129$REMOVAL_ASSERTION_ASSERT_BY_LOOKUP, $list130 );
    preference_modules.inference_preference_module( $kw131$DISPREFER_ASSERTION_ASSERT_BY_LOOKUP, $list132 );
    inference_modules.register_solely_specific_removal_module_predicate( $const133$assertionAssertTime );
    preference_modules.doomed_unless_either_arg_bindable( $kw2$POS, $const133$assertionAssertTime );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const133$assertionAssertTime );
    subl_macro_promotions.declare_defglobal( $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_, $const133$assertionAssertTime );
    inference_modules.inference_removal_module( $kw138$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS, $list139 );
    inference_modules.inference_removal_module( $kw140$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG, $list141 );
    inference_modules.inference_removal_module( $kw142$REMOVAL_ASSERTION_ASSERT_TIME_UNIFY, $list143 );
    inference_modules.inference_removal_module( $kw145$REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP, $list146 );
    preference_modules.inference_preference_module( $kw147$DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP, $list148 );
    inference_modules.register_solely_specific_removal_module_predicate( $const149$assertionAssertPurpose );
    preference_modules.doomed_unless_either_arg_bindable( $kw2$POS, $const149$assertionAssertPurpose );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const149$assertionAssertPurpose );
    subl_macro_promotions.declare_defglobal( $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_, $const149$assertionAssertPurpose );
    inference_modules.inference_removal_module( $kw153$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS, $list154 );
    inference_modules.inference_removal_module( $kw155$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG, $list156 );
    inference_modules.inference_removal_module( $kw157$REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY, $list158 );
    inference_modules.inference_removal_module( $kw160$REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP, $list161 );
    preference_modules.inference_preference_module( $kw162$DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP, $list163 );
    inference_modules.register_solely_specific_removal_module_predicate( $const164$assertionAssertDate );
    preference_modules.doomed_unless_either_arg_bindable( $kw2$POS, $const164$assertionAssertDate );
    preference_modules.doomed_unless_all_args_bindable( $kw3$NEG, $const164$assertionAssertDate );
    subl_macro_promotions.declare_defglobal( $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_, $const164$assertionAssertDate );
    inference_modules.inference_removal_module( $kw166$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS, $list167 );
    inference_modules.inference_removal_module( $kw168$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG, $list169 );
    inference_modules.inference_removal_module( $kw170$REMOVAL_ASSERTION_ASSERT_DATE_UNIFY, $list171 );
    inference_modules.inference_removal_module( $kw172$REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP, $list173 );
    preference_modules.inference_preference_module( $kw174$DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP, $list175 );
    inference_modules.inference_conjunctive_removal_module( $kw176$REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE, $list177 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_assertion_mt_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_assertion_mt_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_assertion_mt_file();
  }
  static
  {
    me = new removal_modules_assertion_mt();
    $assertion_mt_defining_mt$ = null;
    $default_assertion_mt_check_cost$ = null;
    $assertion_sentence_defining_mt$ = null;
    $default_assertion_sentence_check_cost$ = null;
    $default_assertion_sentence_lookup_cost$ = null;
    $assertion_id_defining_mt$ = null;
    $default_assertion_id_check_cost$ = null;
    $cycl_directions$ = null;
    $assertion_direction_defining_mt$ = null;
    $default_assertion_direction_check_cost$ = null;
    $cycl_strengths$ = null;
    $assertion_strength_defining_mt$ = null;
    $default_assertion_strength_check_cost$ = null;
    $cycl_truths$ = null;
    $assertion_truth_defining_mt$ = null;
    $default_assertion_truth_check_cost$ = null;
    $assertion_just_att_defining_mt$ = null;
    $default_assertion_just_att_check_cost$ = null;
    $assertion_assert_by_defining_mt$ = null;
    $default_assertion_assert_by_check_cost$ = null;
    $assertion_assert_time_defining_mt$ = null;
    $default_assertion_assert_time_check_cost$ = null;
    $earliest_known_asserted_when$ = null;
    $assertion_assert_purpose_defining_mt$ = null;
    $default_assertion_assert_purpose_check_cost$ = null;
    $assertion_assert_date_defining_mt$ = null;
    $default_assertion_assert_date_check_cost$ = null;
    $removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = null;
    $sym0$ASSERTION_EL_IST_FORMULA = makeSymbol( "ASSERTION-EL-IST-FORMULA" );
    $const1$assertionMt = constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) );
    $kw2$POS = makeKeyword( "POS" );
    $kw3$NEG = makeKeyword( "NEG" );
    $sym4$_ASSERTION_MT_DEFINING_MT_ = makeSymbol( "*ASSERTION-MT-DEFINING-MT*" );
    $const5$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw6$OPAQUE = makeKeyword( "OPAQUE" );
    $kw7$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw8$REMOVAL_ASSERTION_MT_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-MT-CHECK-POS" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "CLOSED-HLMT" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-ASSERTION-MT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT" ) ) ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "MT" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HAS-MT?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-MT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$assertionMt <assertion> <hlmt-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$LogicalTruthMt)" )
    } );
    $kw10$REMOVAL_ASSERTION_MT_PRUNE_POS = makeKeyword( "REMOVAL-ASSERTION-MT-PRUNE-POS" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "ASSERTION" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ),
                makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "CLOSED-HLMT" ) ) ) ) ), makeKeyword( "COST-EXPRESSION" ),
      ZERO_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" )
    } );
    $kw12$REMOVAL_ASSERTION_MT_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-MT-CHECK-NEG" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "CLOSED-HLMT" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-ASSERTION-MT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT" ) ) ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "MT" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "ASSERTION-HAS-MT?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ) ) ) ), makeKeyword( "SUPPORT" ),
      makeSymbol( "MAKE-ASSERTION-MT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionMt <assertion> <hlmt-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not \n      (#$assertionMt \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        #$BookkeepingMt))" )
    } );
    $kw14$REMOVAL_ASSERTION_MT_UNIFY = makeKeyword( "REMOVAL-ASSERTION-MT-UNIFY" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "assertionMt" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-MT" ), makeKeyword(
          "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-MT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionMt <assertion> <not-fully-bound>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)" )
    } );
    $kw16$REMOVAL_ASSERTION_MT_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-MT-LOOKUP" );
    $list17 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "CLOSED-HLMT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ASSERTION-MT-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword(
                    "VALUE" ), makeSymbol( "MT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GATHER-MT-INDEX" ), makeKeyword( "INPUT" ) ), makeKeyword(
                        "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionMt" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ),
                            makeSymbol( "MT" ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-MT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionMt <variable> <hlmt-p>)" ), makeKeyword(
                                "EXAMPLE" ), makeString( "(#$assertionMt ?ASSERTION #$LogicalTruthMt)" )
    } );
    $const18$assertionSentence = constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) );
    $sym19$_ASSERTION_SENTENCE_DEFINING_MT_ = makeSymbol( "*ASSERTION-SENTENCE-DEFINING-MT*" );
    $kw20$REMOVAL_ASSERTION_FORMULA_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-FORMULA-CHECK-POS" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "SENTENCE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "SENTENCE" ) ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "ASSERTION-SENTENCE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "SENTENCE" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-SENTENCE-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                    "(#$assertionSentence <assertion> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$assertionSentence \n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      (#$isa #$Thing #$Collection))" )
    } );
    $kw22$REMOVAL_ASSERTION_FORMULA_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-FORMULA-CHECK-NEG" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "SENTENCE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "SENTENCE" ) ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-SENTENCE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SENTENCE" ) ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-SENTENCE-SUPPORT" ), makeKeyword(
                                    "DOCUMENTATION" ), makeString( "(#$not (#$assertionSentence <assertion> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$not\n      (#$assertionSentence \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        (#$genls #$Collection #$Thing)))" )
    } );
    $kw24$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym25$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym26$_EXIT = makeSymbol( "%EXIT" );
    $kw27$REMOVAL_ASSERTION_FORMULA_UNIFY = makeKeyword( "REMOVAL-ASSERTION-FORMULA-UNIFY" );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "assertionSentence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "ASSERTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ),
                        makeSymbol( "ASSERTION-FI-FORMULA-ROBUST" ), makeKeyword( "INPUT" ), T ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "assertionSentence" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT" ), makeSymbol(
                                "MAKE-ASSERTION-SENTENCE-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionSentence <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$assertionSentence\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)" )
    } );
    $kw29$REMOVAL_ASSERTION_FORMULA_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-FORMULA-LOOKUP" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "SENTENCE" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FIND-VISIBLE-ASSERTIONS-CYCL" ), makeKeyword( "INPUT" ),
                  constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "assertionSentence" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SENTENCE" ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-SENTENCE-SUPPORT" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionSentence <variable> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$assertionSentence ?ASSERTION (#$isa #$Thing #$Collection))" )
    } );
    $sym31$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const32$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw33$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw34$GAF = makeKeyword( "GAF" );
    $kw35$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $kw36$OVERLAP = makeKeyword( "OVERLAP" );
    $kw37$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-PRED-LOOKUP" );
    $list38 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "VARIABLE" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
            "NOT-FULLY-BOUND" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$assertionSentence <variable> (<predicate> ...)) \n    using only GAF indexing of assertions indexed by <predicate>" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$assertionSentence ?ASSERTION (#$interArgIsa1-3 ?PRED ?COL1 ?COL2))" )
    } );
    $kw39$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-ARG-LOOKUP" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionSentence" ) ), makeKeyword( "VARIABLE" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( ConsesLow
            .list( makeKeyword( "NOT" ), makeKeyword( "FORT" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ASENT-HAS-FORT-ARG-P" ) ) ) ), makeKeyword( "COST" ), makeSymbol(
                "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                    "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(#$assertionSentence <variable> (<not fully-bound> ... <fort> ...)) \n     using only KB GAF indexing of assertions indexed by <fort>." ), makeKeyword( "EXAMPLE" ), makeString(
                            "(#$assertionSentence ?ASSERTION (?PRED ?ARG1 ?ARG2 #$ShowerHead))" )
    } );
    $const41$assertionID = constant_handles.reader_make_constant_shell( makeString( "assertionID" ) );
    $sym42$_ASSERTION_ID_DEFINING_MT_ = makeSymbol( "*ASSERTION-ID-DEFINING-MT*" );
    $kw43$REMOVAL_ASSERTION_ID_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-ID-CHECK-POS" );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "INTEGER" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-ASSERTION-ID-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ID" ) ) ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ID" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ID" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HAS-ID?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ID" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-ID-SUPPORT" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$assertionID <assertion> <integer>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      163059)" )
    } );
    $kw45$REMOVAL_ASSERTION_ID_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-ID-CHECK-NEG" );
    $list46 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-ASSERTION-ID-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ID" ) ) ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ID" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ID" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "ASSERTION-HAS-ID?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ID" ) ) ) ) ), makeKeyword( "SUPPORT" ),
      makeSymbol( "MAKE-ASSERTION-ID-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionID <assertion> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not\n      (#$assertionID \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        123456))" )
    } );
    $kw47$REMOVAL_ASSERTION_ID_UNIFY = makeKeyword( "REMOVAL-ASSERTION-ID-UNIFY" );
    $list48 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "assertionID" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-ID" ), makeKeyword(
          "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-ID-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionID <assertion> <not-fully-bound>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ID)" )
    } );
    $kw49$REMOVAL_ASSERTION_ID_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-ID-LOOKUP" );
    $list50 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "INTEGER" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "assertionID" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ID" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ID" ) ) ), makeKeyword(
              "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FIND-ASSERTION-BY-ID" ), makeKeyword(
                  "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionID" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword(
                      "VALUE" ), makeSymbol( "ID" ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-ID-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionID <not-fully-bound> <integer>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$assertionID ?ASSERTION 123456)" )
    } );
    $const51$assertionDirection = constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) );
    $list52 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Forward-AssertionDirection" ) ), constant_handles.reader_make_constant_shell( makeString( "Backward-AssertionDirection" ) ),
        constant_handles.reader_make_constant_shell( makeString( "Code-AssertionDirection" ) ) );
    $kw53$FORWARD = makeKeyword( "FORWARD" );
    $const54$Forward_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Forward-AssertionDirection" ) );
    $kw55$BACKWARD = makeKeyword( "BACKWARD" );
    $const56$Backward_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Backward-AssertionDirection" ) );
    $kw57$CODE = makeKeyword( "CODE" );
    $const58$Code_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Code-AssertionDirection" ) );
    $str59$_S_was_not_a_direction_p = makeString( "~S was not a direction-p" );
    $str60$_S_was_not_a_cycl_direction_p = makeString( "~S was not a cycl-direction-p" );
    $sym61$_ASSERTION_DIRECTION_DEFINING_MT_ = makeSymbol( "*ASSERTION-DIRECTION-DEFINING-MT*" );
    $kw62$REMOVAL_ASSERTION_DIRECTION_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-DIRECTION-CHECK-POS" );
    $list63 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "CONSTANT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-DIRECTION-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "assertionDirection" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-DIRECTION" ) ) ), ConsesLow.list( ConsesLow.list(
                        makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-DIRECTION" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                            makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "CYCL-DIRECTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ),
                                ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-DIRECTION-TO-DIRECTION" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-DIRECTION" ) ) ) ) ), makeKeyword(
                                    "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "DIRECTION" ) ), ConsesLow.list( makeKeyword( "CALL" ),
                                        makeSymbol( "ASSERTION-HAS-DIRECTION" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                            "DIRECTION" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-DIRECTION-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                "(#$assertionDirection <assertion> <constant>)\n    where <constant> is a CycL direction" ), makeKeyword( "EXAMPLE" ), makeString(
                                                    "(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Forward-AssertionDirection)" )
    } );
    $kw64$REMOVAL_ASSERTION_DIRECTION_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-DIRECTION-CHECK-NEG" );
    $list65 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "CONSTANT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-DIRECTION-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "assertionDirection" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-DIRECTION" ) ) ), ConsesLow.list( ConsesLow.list(
                        makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-DIRECTION" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                            makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "CYCL-DIRECTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ),
                                ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-DIRECTION-TO-DIRECTION" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-DIRECTION" ) ) ) ) ), makeKeyword(
                                    "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "DIRECTION" ) ), ConsesLow.list( makeKeyword( "CALL" ),
                                        makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HAS-DIRECTION" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                            "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DIRECTION" ) ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-DIRECTION-SUPPORT" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionDirection <assertion> <fort>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not\n     (#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Backward-AssertionDirection))" )
    } );
    $kw66$REMOVAL_ASSERTION_DIRECTION_UNIFY = makeKeyword( "REMOVAL-ASSERTION-DIRECTION-UNIFY" );
    $list67 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "assertionDirection" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-DIRECTION" ), makeKeyword(
          "INPUT" ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "DIRECTION-TO-CYCL-DIRECTION" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDirection" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
          "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-DIRECTION-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionDirection <assertion> <variable>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?DIRECTION)" )
    } );
    $const68$assertionStrength = constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Default-JustificationStrength" ) ), constant_handles.reader_make_constant_shell( makeString(
        "Monotonic-JustificationStrength" ) ) );
    $kw70$DEFAULT = makeKeyword( "DEFAULT" );
    $const71$Default_JustificationStrength = constant_handles.reader_make_constant_shell( makeString( "Default-JustificationStrength" ) );
    $kw72$MONOTONIC = makeKeyword( "MONOTONIC" );
    $const73$Monotonic_JustificationStrength = constant_handles.reader_make_constant_shell( makeString( "Monotonic-JustificationStrength" ) );
    $str74$_S_was_not_a_el_strength_p = makeString( "~S was not a el-strength-p" );
    $str75$_S_was_not_a_cycl_strength_p = makeString( "~S was not a cycl-strength-p" );
    $sym76$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym77$EL_STRENGTH_P = makeSymbol( "EL-STRENGTH-P" );
    $sym78$_ASSERTION_STRENGTH_DEFINING_MT_ = makeSymbol( "*ASSERTION-STRENGTH-DEFINING-MT*" );
    $kw79$REMOVAL_ASSERTION_STRENGTH_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-STRENGTH-CHECK-POS" );
    $list80 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "CONSTANT" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-STRENGTH-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STRENGTH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STRENGTH" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "ASSERTION" ), makeSymbol( "CYCL-STRENGTH" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "CYCL-STRENGTH-TO-STRENGTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STRENGTH" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                          .list( makeSymbol( "ASSERTION" ), makeSymbol( "STRENGTH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HAS-STRENGTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRENGTH" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-STRENGTH-SUPPORT" ), makeKeyword(
                                  "DOCUMENTATION" ), makeString( "(#$assertionStrength <assertion> <constant>)\n    where <constant> is a CycL justification strength" ), makeKeyword( "EXAMPLE" ), makeString(
                                      "(#$assertionStrength\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Monotonic-JustificationStrength)" )
    } );
    $kw81$REMOVAL_ASSERTION_STRENGTH_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-STRENGTH-CHECK-NEG" );
    $list82 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "CONSTANT" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-STRENGTH-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STRENGTH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STRENGTH" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "ASSERTION" ), makeSymbol( "CYCL-STRENGTH" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "CYCL-STRENGTH-TO-STRENGTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STRENGTH" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                          .list( makeSymbol( "ASSERTION" ), makeSymbol( "STRENGTH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                              "ASSERTION-HAS-STRENGTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRENGTH" ) ) ) ) ), makeKeyword(
                                  "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-STRENGTH-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionStrength <assertion> <constant>))" ), makeKeyword(
                                      "EXAMPLE" ), makeString( "(#$not\n     (#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Default-JustificationStrength))" )
    } );
    $kw83$REMOVAL_ASSERTION_STRENGTH_UNIFY = makeKeyword( "REMOVAL-ASSERTION-STRENGTH-UNIFY" );
    $list84 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "assertionStrength" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-STRENGTH" ), makeKeyword(
          "INPUT" ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STRENGTH-TO-CYCL-STRENGTH" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionStrength" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
          "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-STRENGTH-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionStength <assertion> <variable>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?STRENGTH)" )
    } );
    $const85$assertionTruth = constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) );
    $list86 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) ), constant_handles.reader_make_constant_shell( makeString( "False-JustificationTruth" ) ),
        constant_handles.reader_make_constant_shell( makeString( "Unknown-JustificationTruth" ) ) );
    $kw87$TRUE = makeKeyword( "TRUE" );
    $const88$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $kw89$FALSE = makeKeyword( "FALSE" );
    $const90$False_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "False-JustificationTruth" ) );
    $kw91$UNKNOWN = makeKeyword( "UNKNOWN" );
    $const92$Unknown_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "Unknown-JustificationTruth" ) );
    $str93$_S_was_not_a_truth_p = makeString( "~S was not a truth-p" );
    $str94$_S_was_not_a_cycl_truth_p = makeString( "~S was not a cycl-truth-p" );
    $sym95$_ASSERTION_TRUTH_DEFINING_MT_ = makeSymbol( "*ASSERTION-TRUTH-DEFINING-MT*" );
    $kw96$REMOVAL_ASSERTION_TRUTH_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-TRUTH-CHECK-POS" );
    $list97 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "CONSTANT" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-TRUTH-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-TRUTH-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), ConsesLow
                    .list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-TRUTH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-TRUTH" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                            makeSymbol( "ASSERTION" ), makeSymbol( "CYCL-TRUTH" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "CYCL-TRUTH-TO-TRUTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-TRUTH" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                                    ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TRUTH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HAS-TRUTH" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TRUTH" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-TRUTH-SUPPORT" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionTruth <assertion> <constant>)\n    where <constant> is a CycL justification truth" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$True-JustificationTruth)" )
    } );
    $kw98$REMOVAL_ASSERTION_TRUTH_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-TRUTH-CHECK-NEG" );
    $list99 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "CONSTANT" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-TRUTH-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-TRUTH-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), ConsesLow
                    .list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-TRUTH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-TRUTH" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                            makeSymbol( "ASSERTION" ), makeSymbol( "CYCL-TRUTH" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "CYCL-TRUTH-TO-TRUTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-TRUTH" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                                    ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TRUTH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ),
                                        makeSymbol( "ASSERTION-HAS-TRUTH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TRUTH" ) ) ) ) ),
      makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-TRUTH-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionTruth <assertion> <constant>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not\n     (#$assertionTruth \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$False-JustificationTruth))" )
    } );
    $kw100$REMOVAL_ASSERTION_TRUTH_UNIFY = makeKeyword( "REMOVAL-ASSERTION-TRUTH-UNIFY" );
    $list101 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "assertionTruth" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-TRUTH" ), makeKeyword(
          "INPUT" ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TRUTH-TO-CYCL-TRUTH" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "assertionTruth" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT" ),
      makeSymbol( "MAKE-ASSERTION-TRUTH-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionTruth <assertion> <variable>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?TRUTH)" )
    } );
    $const102$assertionJustificationAttribute = constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) );
    $sym103$FORT_P = makeSymbol( "FORT-P" );
    $const104$AssertedBelief = constant_handles.reader_make_constant_shell( makeString( "AssertedBelief" ) );
    $const105$SupportedByMaterialImplication = constant_handles.reader_make_constant_shell( makeString( "SupportedByMaterialImplication" ) );
    $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_ = makeSymbol( "*ASSERTION-JUST-ATT-DEFINING-MT*" );
    $kw107$REMOVAL_ASSERTION_JUST_ATT_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-JUST-ATT-CHECK-POS" );
    $list108 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FORT" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
              "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow
                  .list( makeKeyword( "BIND" ), makeSymbol( "ATT" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "ATT" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ATT" ) ), ConsesLow.list( makeKeyword( "CALL" ),
                          makeSymbol( "INFERENCE-ASSERTION-JUST-ATT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ATT" ) ) ) ), makeKeyword(
                              "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-JUST-ATT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionJustificationAttribute <assertion> <fort>)" ), makeKeyword(
                                  "EXAMPLE" ), makeString( "(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$AssertedBelief)" )
    } );
    $kw109$REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-JUST-ATT-CHECK-NEG" );
    $list110 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FORT" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
              "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow
                  .list( makeKeyword( "BIND" ), makeSymbol( "ATT" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "ATT" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ATT" ) ), ConsesLow.list( makeKeyword( "CALL" ),
                          makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-ASSERTION-JUST-ATT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ),
                              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ATT" ) ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-JUST-ATT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                  "(#$not (#$assertionJustificationAttribute <assertion> <fort>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                      "(#$not\n      (#$assertionJustificationAttribute \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        #$SupportedByMaterialImplication))" )
    } );
    $kw111$REMOVAL_ASSERTION_JUST_ATT_UNIFY = makeKeyword( "REMOVAL-ASSERTION-JUST-ATT-UNIFY" );
    $list112 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "VARIABLE" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-ALL-ASSERTION-JUST-ATT" ), makeKeyword(
                  "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionJustificationAttribute" ) ), ConsesLow.list( makeKeyword(
                      "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ASSERTION-JUST-ATT-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$assertionJustificationAttribute <assertion> <variable>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ATT)" )
    } );
    $const113$assertionAssertBy = constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) );
    $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_ = makeSymbol( "*ASSERTION-ASSERT-BY-DEFINING-MT*" );
    $str115$Computing_assertions_asserted_by_ = makeString( "Computing assertions asserted by ~S" );
    $sym116$STRINGP = makeSymbol( "STRINGP" );
    $kw117$SKIP = makeKeyword( "SKIP" );
    $kw118$LATENCY = makeKeyword( "LATENCY" );
    $sym119$ASSERTION_ASSERTED_BY_ = makeSymbol( "ASSERTION-ASSERTED-BY?" );
    $kw120$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $str121$_S_was_not_one_of__latency_or__to = makeString( "~S was not one of :latency or :total-time" );
    $kw122$REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-ASSERT-BY-CHECK-POS" );
    $list123 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "CYCLIST" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "CYCLIST" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
                            makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "CYCLIST" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-ASSERTED-BY?" ), ConsesLow.list(
                                makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCLIST" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ),
      makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-BY-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$assertionAssertBy <assertion> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Pace)" )
    } );
    $kw124$REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-ASSERT-BY-CHECK-NEG" );
    $list125 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "CYCLIST" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "CYCLIST" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
                            makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "CYCLIST" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list(
                                makeKeyword( "CALL" ), makeSymbol( "ASSERTION-ASSERTED-BY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                    "CYCLIST" ) ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-BY-DEFINING-MT*" ), makeKeyword(
                                        "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionAssertBy <assertion> <fully-bound>))" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$not\n     (#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Lenat))" )
    } );
    $kw126$REMOVAL_ASSERTION_ASSERT_BY_UNIFY = makeKeyword( "REMOVAL-ASSERTION-ASSERT-BY-UNIFY" );
    $list127 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "assertionAssertBy" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "ASSERTION" ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), makeKeyword( "ASSERTION" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTED-BY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-BY-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionAssertBy <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHO)" )
    } );
    $const128$HumanCyclist = constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) );
    $kw129$REMOVAL_ASSERTION_ASSERT_BY_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-ASSERT-BY-LOOKUP" );
    $list130 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list(
                makeKeyword( "BIND" ), makeSymbol( "CYCLIST" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                    "CYCLIST" ) ) ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCLIST" ) ) ), ConsesLow.list( makeKeyword(
                            "VALUE" ), makeSymbol( "CYCLIST" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR" ), makeKeyword(
                                "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "INPUT" ), ConsesLow
                                    .list( makeKeyword( "VALUE" ), makeSymbol( "CYCLIST" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                                        "*ASSERTION-ASSERT-BY-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$assertionAssertBy <variable> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$assertionAssertBy ?ASSERTION #$Lenat)" )
    } );
    $kw131$DISPREFER_ASSERTION_ASSERT_BY_LOOKUP = makeKeyword( "DISPREFER-ASSERTION-ASSERT-BY-LOOKUP" );
    $list132 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertBy" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $const133$assertionAssertTime = constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) );
    $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_ = makeSymbol( "*ASSERTION-ASSERT-TIME-DEFINING-MT*" );
    $sym135$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $str136$Computing_assertions_asserted_on_ = makeString( "Computing assertions asserted on ~A" );
    $sym137$ASSERTION_ASSERTED_WHEN_ = makeSymbol( "ASSERTION-ASSERTED-WHEN?" );
    $kw138$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-ASSERT-TIME-CHECK-POS" );
    $list139 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "UNIVERSAL-DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "UNIVERSAL-DATE" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "INTEGER" ), ConsesLow.list(
                            makeKeyword( "TEST" ), makeSymbol( "UNIVERSAL-DATE-P" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ),
                                makeSymbol( "UNIVERSAL-DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-ASSERTED-WHEN?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ),
                                    ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIVERSAL-DATE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                                        "*ASSERTION-ASSERT-TIME-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$assertionAssertTime <assertion> <integer>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      20020411)" )
    } );
    $kw140$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-ASSERT-TIME-CHECK-NEG" );
    $list141 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "UNIVERSAL-DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "UNIVERSAL-DATE" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "INTEGER" ), ConsesLow.list(
                            makeKeyword( "TEST" ), makeSymbol( "UNIVERSAL-DATE-P" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ),
                                makeSymbol( "UNIVERSAL-DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                    "ASSERTION-ASSERTED-WHEN?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIVERSAL-DATE" ) ) ) ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-TIME-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionAssertTime <assertion> <integer>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not\n     (#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      19950524))" )
    } );
    $kw142$REMOVAL_ASSERTION_ASSERT_TIME_UNIFY = makeKeyword( "REMOVAL-ASSERTION-ASSERT-TIME-UNIFY" );
    $list143 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "assertionAssertTime" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "ASSERTION" ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), makeKeyword( "ASSERTION" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTED-WHEN" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-TIME-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                    "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionAssertTime <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)" )
    } );
    $int144$19950522 = makeInteger( 19950522 );
    $kw145$REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP" );
    $list146 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list(
                makeKeyword( "BIND" ), makeSymbol( "UNIVERSAL-DATE" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST" ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "UNIVERSAL-DATE" ) ) ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "UNIVERSAL-DATE" ) ) ), ConsesLow
                            .list( makeKeyword( "VALUE" ), makeSymbol( "UNIVERSAL-DATE" ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "INTEGER" ), ConsesLow.list(
                                makeKeyword( "TEST" ), makeSymbol( "UNIVERSAL-DATE-P" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                    "REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                        makeString( "assertionAssertTime" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIVERSAL-DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-TIME-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$assertionAssertTime <variable> <integer>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$assertionAssertTime ?ASSERTION 19950524)" )
    } );
    $kw147$DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP = makeKeyword( "DISPREFER-ASSERTION-ASSERT-TIME-LOOKUP" );
    $list148 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $const149$assertionAssertPurpose = constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) );
    $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_ = makeSymbol( "*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*" );
    $str151$Computing_assertions_asserted_for = makeString( "Computing assertions asserted for ~S" );
    $sym152$ASSERTION_ASSERTED_WHY_ = makeSymbol( "ASSERTION-ASSERTED-WHY?" );
    $kw153$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-POS" );
    $list154 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
              "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                  makeKeyword( "BIND" ), makeSymbol( "REASON" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "REASON" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword(
                          "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "REASON" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-ASSERTED-WHY?" ), ConsesLow.list( makeKeyword(
                              "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REASON" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword(
                                  "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$assertionAssertPurpose <assertion> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                          "(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$GeneralCycKE)" )
    } );
    $kw155$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-NEG" );
    $list156 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
              "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                  makeKeyword( "BIND" ), makeSymbol( "REASON" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "REASON" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword(
                          "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "REASON" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword(
                              "CALL" ), makeSymbol( "ASSERTION-ASSERTED-WHY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                  "REASON" ) ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*" ), makeKeyword(
                                      "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$assertionAssertPurpose <assertion> <fully-bound>))" ), makeKeyword(
                                          "EXAMPLE" ), makeString( "(#$not\n     (#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$HPKBProject))" )
    } );
    $kw157$REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY = makeKeyword( "REMOVAL-ASSERTION-ASSERT-PURPOSE-UNIFY" );
    $list158 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), makeKeyword( "ASSERTION" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTED-WHY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                          "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionAssertPurpose <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHY)" )
    } );
    $const159$Cyc_BasedProject = constant_handles.reader_make_constant_shell( makeString( "Cyc-BasedProject" ) );
    $kw160$REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP" );
    $list161 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "REASON" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "REASON" ) ) ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REASON" ) ) ), ConsesLow.list( makeKeyword(
                      "VALUE" ), makeSymbol( "REASON" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR" ), makeKeyword(
                          "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "INPUT" ), ConsesLow
                              .list( makeKeyword( "VALUE" ), makeSymbol( "REASON" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                                  "*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$assertionAssertPurpose <variable> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                          "(#$assertionAssertPurpose ?ASSERTION #$HPKBProject)\n    (#$thereExists ?ASSERTION\n      (#$assertionAssertPurpose ?ASSERTION #$GeneralCycKE))" )
    } );
    $kw162$DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP = makeKeyword( "DISPREFER-ASSERTION-ASSERT-PURPOSE-LOOKUP" );
    $list163 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertPurpose" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $const164$assertionAssertDate = constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) );
    $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_ = makeSymbol( "*ASSERTION-ASSERT-DATE-DEFINING-MT*" );
    $kw166$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-ASSERT-DATE-CHECK-POS" );
    $list167 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "CYCL-DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "CYCL-DATE" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "GENERALIZED-DATE-P" ) ) ), makeKeyword(
                            "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "CYCL-DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "ASSERTION-ASSERTED-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-DATE" ) ) ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-DATE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                        "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionAssertDate <assertion> <cycl-date>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                            "(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 11 (#$MonthFn #$April (#$YearFn 2002))))" )
    } );
    $kw168$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-ASSERT-DATE-CHECK-NEG" );
    $list169 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "CYCL-DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "CYCL-DATE" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "ASSERTION" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "GENERALIZED-DATE-P" ) ) ), makeKeyword(
                            "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "CYCL-DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-ASSERTED-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow
                                    .list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-DATE" ) ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                                        "*ASSERTION-ASSERT-DATE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$not (#$assertionAssertDate <assertion> <integer>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$not\n     (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995)))))" )
    } );
    $kw170$REMOVAL_ASSERTION_ASSERT_DATE_UNIFY = makeKeyword( "REMOVAL-ASSERTION-ASSERT-DATE-UNIFY" );
    $list171 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "assertionAssertDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "ASSERTION" ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), makeKeyword( "ASSERTION" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-DATE" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ASSERTION-ASSERT-DATE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                    "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionAssertDate <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)\n    (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn ?DATE ?MONTH))" )
    } );
    $kw172$REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP = makeKeyword( "REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP" );
    $list173 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list(
                makeKeyword( "BIND" ), makeSymbol( "CYCL-DATE" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                    "CYCL-DATE" ) ) ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-DATE" ) ) ), ConsesLow.list( makeKeyword(
                            "VALUE" ), makeSymbol( "CYCL-DATE" ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "GENERALIZED-DATE-P" ) ), makeKeyword(
                                "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NEW-ASSERTION-ASSERTED-DATE-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword(
                                        "VALUE" ), makeSymbol( "CYCL-DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                                            "*ASSERTION-ASSERT-DATE-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                "(#$assertionAssertDate <variable> <cycl-date>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                    "(#$assertionAssertDate ?ASSERTION (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995))))" )
    } );
    $kw174$DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP = makeKeyword( "DISPREFER-ASSERTION-ASSERT-DATE-LOOKUP" );
    $list175 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionAssertDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw176$REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE = makeKeyword( "REMOVAL-ASSERTION-ASSERT-BY-AND-TIME-CONJUNCTIVE" );
    $list177 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "EVERY-PREDICATES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "assertionAssertBy" ) ), constant_handles.reader_make_constant_shell( makeString( "assertionAssertTime" ) ) ), makeKeyword( "APPLICABILITY" ), makeSymbol(
            "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "EXPAND-ITERATIVE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <fully-bound>))\n    or\n    (#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <not-fully-bound 0>)\n           [(<number comparison pred> <not-fully-bound 0> <fully-bound>)]..." ),
      makeKeyword( "EXAMPLE" ), makeString(
          "(#$and (#$assertionAssertBy ?ASSERTION #$Guest)\n           (#$assertionAssertTime ?ASSERTION ?TIME)\n           (#$greaterThanOrEqualTo ?TIME 19000101)\n           (#$lessThan ?TIME 20000101)" )
    } );
    $list178 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) ), constant_handles.reader_make_constant_shell( makeString( "lessThan" ) ), constant_handles
        .reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ) );
    $sym179$CONTEXTUALIZED_ASENT_ASENT = makeSymbol( "CONTEXTUALIZED-ASENT-ASENT" );
    $sym180$_ = makeSymbol( "<" );
    $sym181$ASSERTION_ASSERTED_BY_ASENT_ = makeSymbol( "ASSERTION-ASSERTED-BY-ASENT?" );
    $sym182$ASSERTION_ASSERT_TIME_ASENT_ = makeSymbol( "ASSERTION-ASSERT-TIME-ASENT?" );
    $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT = makeSymbol( "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?" );
    $kw184$CYCLIST = makeKeyword( "CYCLIST" );
    $kw185$ASSERTION_VAR = makeKeyword( "ASSERTION-VAR" );
    $kw186$ASSERT_TIME_ARG2 = makeKeyword( "ASSERT-TIME-ARG2" );
    $kw187$TIME_COMPARISON_ASENTS = makeKeyword( "TIME-COMPARISON-ASENTS" );
    $kw188$ASENTS = makeKeyword( "ASENTS" );
    $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T = makeSymbol( "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM" );
  }
}
/*
 * 
 * Total time: 1652 ms
 * 
 */