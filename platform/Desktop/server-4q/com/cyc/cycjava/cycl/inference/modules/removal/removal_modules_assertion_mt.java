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

public final class removal_modules_assertion_mt extends SubLTranslatedFile
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
    public static SubLObject hl_assertion_support_sentence_to_el(SubLObject support_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind((SubLObject)removal_modules_assertion_mt.$sym0$ASSERTION_EL_IST_FORMULA, thread);
            support_sentence = cycl_utilities.hl_to_el(support_sentence);
        }
        finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return support_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 1697L)
    public static SubLObject make_assertion_mt_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_mt_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 5206L)
    public static SubLObject removal_assertion_mt_lookup_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_assertion_mt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        final SubLObject mt = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        if (removal_modules_assertion_mt.NIL != kb_indexing.broad_mtP(mt)) {
            return assertion_handles.assertion_count();
        }
        return kb_indexing.num_mt_index(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6504L)
    public static SubLObject assertion_sentenceP(final SubLObject assertion, final SubLObject sentence) {
        return Equality.equal(sentence, assertions_high.assertion_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 6838L)
    public static SubLObject make_assertion_sentence_support_from_assertion(final SubLObject assertion, final SubLObject formula, SubLObject negateP) {
        if (negateP == removal_modules_assertion_mt.UNPROVIDED) {
            negateP = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        SubLObject support_sentence = el_utilities.make_binary_formula(removal_modules_assertion_mt.$const18$assertionSentence, assertion, formula);
        if (removal_modules_assertion_mt.NIL != negateP) {
            support_sentence = cycl_utilities.negate(support_sentence);
        }
        return make_assertion_sentence_support(support_sentence, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 7169L)
    public static SubLObject make_assertion_sentence_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_sentence_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 9474L)
    public static SubLObject assertion_fi_formula_robust(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == removal_modules_assertion_mt.UNPROVIDED) {
            substitute_varsP = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)removal_modules_assertion_mt.NIL;
        try {
            thread.throwStack.push(removal_modules_assertion_mt.$kw24$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)removal_modules_assertion_mt.$sym25$IGNORE_ERRORS_HANDLER), thread);
                try {
                    return fi.assertion_fi_formula(assertion, substitute_varsP);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)removal_modules_assertion_mt.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_modules_assertion_mt.$kw24$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 11523L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_assertion_mt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_formula = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        SubLObject total = (SubLObject)removal_modules_assertion_mt.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_assertion_mt.$sym31$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_assertion_mt.$const32$EverythingPSC, thread);
            total = inference_trampolines.inference_num_gaf_lookup_index(hl_formula, (SubLObject)removal_modules_assertion_mt.$kw2$POS);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 11959L)
    public static SubLObject removal_assertion_sentence_expand_internal_1(final SubLObject assertion, final SubLObject assertion_var, final SubLObject hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_assertion_mt.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject assertion_bindings = unification_utilities.term_unify(assertion_var, assertion, (SubLObject)removal_modules_assertion_mt.T, (SubLObject)removal_modules_assertion_mt.T);
            final SubLObject assertion_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_assertion_mt.NIL != assertion_bindings) {
                thread.resetMultipleValues();
                final SubLObject literal_bindings = unification_utilities.gaf_asent_unify(hl_formula, gaf_formula, (SubLObject)removal_modules_assertion_mt.T, (SubLObject)removal_modules_assertion_mt.T);
                final SubLObject literal_gaf_asent = thread.secondMultipleValue();
                final SubLObject literal_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_assertion_mt.NIL != literal_bindings && removal_modules_assertion_mt.NIL == bindings.some_variable_with_conflicting_bindings(assertion_bindings, literal_bindings)) {
                    backward.removal_add_node(make_assertion_sentence_support_from_assertion(assertion, gaf_formula, (SubLObject)removal_modules_assertion_mt.NIL), ConsesLow.nconc(assertion_bindings, literal_bindings), ConsesLow.append(assertion_justification, literal_justification));
                }
            }
        }
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 12951L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_assertion_mt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        return removal_assertion_sentence_unbound_assertion_cost(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 13323L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_assertion_mt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_var = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject hl_formula = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_assertion_mt.$sym31$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_assertion_mt.$const32$EverythingPSC, thread);
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(hl_formula, (SubLObject)removal_modules_assertion_mt.$kw2$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw33$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_assertion_mt.NIL != argnum) {
                    if (removal_modules_assertion_mt.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            while (removal_modules_assertion_mt.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_assertion_mt.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                        SubLObject done_var_$1 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        final SubLObject token_var_$2 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        while (removal_modules_assertion_mt.NIL == done_var_$1) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                            if (removal_modules_assertion_mt.NIL != valid_$3) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$3);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            while (removal_modules_assertion_mt.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_assertion_mt.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                        SubLObject done_var_$2 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        final SubLObject token_var_$3 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        while (removal_modules_assertion_mt.NIL == done_var_$2) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                            if (removal_modules_assertion_mt.NIL != valid_$4) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$4);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_assertion_mt.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        while (removal_modules_assertion_mt.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_assertion_mt.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                    SubLObject done_var_$3 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    while (removal_modules_assertion_mt.NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                        if (removal_modules_assertion_mt.NIL != valid_$5) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_assertion_mt.NIL;
                    if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        while (removal_modules_assertion_mt.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_assertion_mt.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                    SubLObject done_var_$4 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    final SubLObject token_var_$5 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    while (removal_modules_assertion_mt.NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                        if (removal_modules_assertion_mt.NIL != valid_$6) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$6);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw35$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_assertion_mt.NIL;
                    final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_assertion_mt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_assertion_mt.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_assertion_mt.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_assertion_mt.NIL;
                        while (removal_modules_assertion_mt.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_assertion_mt.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_assertion_mt.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                    SubLObject done_var_$5 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    final SubLObject token_var_$6 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    while (removal_modules_assertion_mt.NIL == done_var_$5) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion2));
                                        if (removal_modules_assertion_mt.NIL != valid_$7) {
                                            removal_assertion_sentence_expand_internal_1(assertion2, assertion_var, hl_formula);
                                        }
                                        done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$7);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_assertion_mt.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw36$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                SubLObject assertion3 = (SubLObject)removal_modules_assertion_mt.NIL;
                assertion3 = cdolist_list_var.first();
                while (removal_modules_assertion_mt.NIL != cdolist_list_var) {
                    if (removal_modules_assertion_mt.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS) || removal_modules_assertion_mt.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS))) {
                        removal_assertion_sentence_expand_internal_1(assertion3, assertion_var, hl_formula);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 14495L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_cost(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_assertion_mt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        return removal_assertion_sentence_unbound_assertion_cost(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 14865L)
    public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_expand(final SubLObject literal, SubLObject sense) {
        if (sense == removal_modules_assertion_mt.UNPROVIDED) {
            sense = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_var = el_utilities.literal_arg1(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject hl_formula = el_utilities.literal_arg2(literal, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_assertion_mt.$sym31$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_assertion_mt.$const32$EverythingPSC, thread);
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(hl_formula, (SubLObject)removal_modules_assertion_mt.$kw2$POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw33$GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_assertion_mt.NIL != argnum) {
                    if (removal_modules_assertion_mt.NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            while (removal_modules_assertion_mt.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_assertion_mt.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                        SubLObject done_var_$23 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        final SubLObject token_var_$24 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        while (removal_modules_assertion_mt.NIL == done_var_$23) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                            final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(assertion));
                                            if (removal_modules_assertion_mt.NIL != valid_$25) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$25);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                            while (removal_modules_assertion_mt.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_assertion_mt.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                        SubLObject done_var_$24 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        final SubLObject token_var_$25 = (SubLObject)removal_modules_assertion_mt.NIL;
                                        while (removal_modules_assertion_mt.NIL == done_var_$24) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                            final SubLObject valid_$26 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$25.eql(assertion));
                                            if (removal_modules_assertion_mt.NIL != valid_$26) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$24 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$26);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                            }
                        }
                    }
                }
                else if (removal_modules_assertion_mt.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        while (removal_modules_assertion_mt.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_assertion_mt.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                    SubLObject done_var_$25 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    final SubLObject token_var_$26 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    while (removal_modules_assertion_mt.NIL == done_var_$25) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                        final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(assertion));
                                        if (removal_modules_assertion_mt.NIL != valid_$27) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$27);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_assertion_mt.NIL;
                    if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_assertion_mt.NIL, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        while (removal_modules_assertion_mt.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_assertion_mt.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_assertion_mt.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                    SubLObject done_var_$26 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    final SubLObject token_var_$27 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    while (removal_modules_assertion_mt.NIL == done_var_$26) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                        final SubLObject valid_$28 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$27.eql(assertion));
                                        if (removal_modules_assertion_mt.NIL != valid_$28) {
                                            removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                        }
                                        done_var_$26 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$28);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (removal_modules_assertion_mt.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw35$PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (removal_modules_assertion_mt.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = (SubLObject)removal_modules_assertion_mt.NIL;
                    final SubLObject _prev_bind_0_$30 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$40 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_assertion_mt.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_assertion_mt.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_assertion_mt.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_assertion_mt.NIL;
                        while (removal_modules_assertion_mt.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_assertion_mt.NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_assertion_mt.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_assertion_mt.$kw34$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS), (SubLObject)removal_modules_assertion_mt.NIL);
                                    SubLObject done_var_$27 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    final SubLObject token_var_$28 = (SubLObject)removal_modules_assertion_mt.NIL;
                                    while (removal_modules_assertion_mt.NIL == done_var_$27) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$28);
                                        final SubLObject valid_$29 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$28.eql(assertion2));
                                        if (removal_modules_assertion_mt.NIL != valid_$29) {
                                            removal_assertion_sentence_expand_internal_1(assertion2, assertion_var, hl_formula);
                                        }
                                        done_var_$27 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid_$29);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        if (removal_modules_assertion_mt.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$40, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw36$OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                SubLObject assertion3 = (SubLObject)removal_modules_assertion_mt.NIL;
                assertion3 = cdolist_list_var.first();
                while (removal_modules_assertion_mt.NIL != cdolist_list_var) {
                    if (removal_modules_assertion_mt.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS) || removal_modules_assertion_mt.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_assertion_mt.$kw2$POS))) {
                        removal_assertion_sentence_expand_internal_1(assertion3, assertion_var, hl_formula);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion3 = cdolist_list_var.first();
                }
            }
            else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16494L)
    public static SubLObject assertion_has_idP(final SubLObject assertion, final SubLObject id) {
        return Equality.equal(id, assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 16700L)
    public static SubLObject make_assertion_id_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_id_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 20904L)
    public static SubLObject cycl_direction_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, removal_modules_assertion_mt.$cycl_directions$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_modules_assertion_mt.EQL), (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21066L)
    public static SubLObject direction_to_cycl_direction(final SubLObject direction) {
        if (direction.eql((SubLObject)removal_modules_assertion_mt.$kw53$FORWARD)) {
            return removal_modules_assertion_mt.$const54$Forward_AssertionDirection;
        }
        if (direction.eql((SubLObject)removal_modules_assertion_mt.$kw55$BACKWARD)) {
            return removal_modules_assertion_mt.$const56$Backward_AssertionDirection;
        }
        if (direction.eql((SubLObject)removal_modules_assertion_mt.$kw57$CODE)) {
            return removal_modules_assertion_mt.$const58$Code_AssertionDirection;
        }
        Errors.error((SubLObject)removal_modules_assertion_mt.$str59$_S_was_not_a_direction_p, direction);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21413L)
    public static SubLObject cycl_direction_to_direction(final SubLObject cycl_direction) {
        if (cycl_direction.eql(removal_modules_assertion_mt.$const54$Forward_AssertionDirection)) {
            return (SubLObject)removal_modules_assertion_mt.$kw53$FORWARD;
        }
        if (cycl_direction.eql(removal_modules_assertion_mt.$const56$Backward_AssertionDirection)) {
            return (SubLObject)removal_modules_assertion_mt.$kw55$BACKWARD;
        }
        if (cycl_direction.eql(removal_modules_assertion_mt.$const58$Code_AssertionDirection)) {
            return (SubLObject)removal_modules_assertion_mt.$kw57$CODE;
        }
        Errors.error((SubLObject)removal_modules_assertion_mt.$str60$_S_was_not_a_cycl_direction_p, cycl_direction);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 21864L)
    public static SubLObject make_assertion_direction_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_direction_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26314L)
    public static SubLObject cycl_strength_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, removal_modules_assertion_mt.$cycl_strengths$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_modules_assertion_mt.EQL), (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26473L)
    public static SubLObject strength_to_cycl_strength(final SubLObject strength) {
        if (strength.eql((SubLObject)removal_modules_assertion_mt.$kw70$DEFAULT)) {
            return removal_modules_assertion_mt.$const71$Default_JustificationStrength;
        }
        if (strength.eql((SubLObject)removal_modules_assertion_mt.$kw72$MONOTONIC)) {
            return removal_modules_assertion_mt.$const73$Monotonic_JustificationStrength;
        }
        Errors.error((SubLObject)removal_modules_assertion_mt.$str74$_S_was_not_a_el_strength_p, strength);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 26790L)
    public static SubLObject cycl_strength_to_strength(final SubLObject cycl_strength) {
        if (cycl_strength.eql(removal_modules_assertion_mt.$const71$Default_JustificationStrength)) {
            return (SubLObject)removal_modules_assertion_mt.$kw70$DEFAULT;
        }
        if (cycl_strength.eql(removal_modules_assertion_mt.$const73$Monotonic_JustificationStrength)) {
            return (SubLObject)removal_modules_assertion_mt.$kw72$MONOTONIC;
        }
        Errors.error((SubLObject)removal_modules_assertion_mt.$str75$_S_was_not_a_cycl_strength_p, cycl_strength);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27110L)
    public static SubLObject assertion_has_strength(final SubLObject assertion, final SubLObject strength) {
        assert removal_modules_assertion_mt.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert removal_modules_assertion_mt.NIL != enumeration_types.el_strength_p(strength) : strength;
        return Equality.eql(strength, assertions_high.assertion_strength(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 27439L)
    public static SubLObject make_assertion_strength_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_strength_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31721L)
    public static SubLObject cycl_truth_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, removal_modules_assertion_mt.$cycl_truths$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_modules_assertion_mt.EQL), (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 31871L)
    public static SubLObject truth_to_cycl_truth(final SubLObject truth) {
        if (truth.eql((SubLObject)removal_modules_assertion_mt.$kw87$TRUE)) {
            return removal_modules_assertion_mt.$const88$True_JustificationTruth;
        }
        if (truth.eql((SubLObject)removal_modules_assertion_mt.$kw89$FALSE)) {
            return removal_modules_assertion_mt.$const90$False_JustificationTruth;
        }
        if (truth.eql((SubLObject)removal_modules_assertion_mt.$kw91$UNKNOWN)) {
            return removal_modules_assertion_mt.$const92$Unknown_JustificationTruth;
        }
        Errors.error((SubLObject)removal_modules_assertion_mt.$str93$_S_was_not_a_truth_p, truth);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32207L)
    public static SubLObject cycl_truth_to_truth(final SubLObject cycl_truth) {
        if (cycl_truth.eql(removal_modules_assertion_mt.$const88$True_JustificationTruth)) {
            return (SubLObject)removal_modules_assertion_mt.$kw87$TRUE;
        }
        if (cycl_truth.eql(removal_modules_assertion_mt.$const90$False_JustificationTruth)) {
            return (SubLObject)removal_modules_assertion_mt.$kw89$FALSE;
        }
        if (cycl_truth.eql(removal_modules_assertion_mt.$const92$Unknown_JustificationTruth)) {
            return (SubLObject)removal_modules_assertion_mt.$kw91$UNKNOWN;
        }
        Errors.error((SubLObject)removal_modules_assertion_mt.$str94$_S_was_not_a_cycl_truth_p, cycl_truth);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 32627L)
    public static SubLObject make_assertion_truth_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_truth_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 36603L)
    public static SubLObject inference_assertion_just_att(final SubLObject assertion, final SubLObject att) {
        assert removal_modules_assertion_mt.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert removal_modules_assertion_mt.NIL != forts.fort_p(att) : att;
        if (att.eql(removal_modules_assertion_mt.$const104$AssertedBelief)) {
            return assertions_high.asserted_assertionP(assertion);
        }
        if (att.eql(removal_modules_assertion_mt.$const105$SupportedByMaterialImplication)) {
            return assertions_high.deduced_assertionP(assertion);
        }
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 36904L)
    public static SubLObject inference_all_assertion_just_att(final SubLObject assertion) {
        assert removal_modules_assertion_mt.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject attributes = (SubLObject)removal_modules_assertion_mt.NIL;
        if (removal_modules_assertion_mt.NIL != assertions_high.asserted_assertionP(assertion)) {
            attributes = (SubLObject)ConsesLow.cons(removal_modules_assertion_mt.$const104$AssertedBelief, attributes);
        }
        if (removal_modules_assertion_mt.NIL != assertions_high.deduced_assertionP(assertion)) {
            attributes = (SubLObject)ConsesLow.cons(removal_modules_assertion_mt.$const105$SupportedByMaterialImplication, attributes);
        }
        return Sequences.nreverse(attributes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 37349L)
    public static SubLObject make_assertion_just_att_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_assertion_mt.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_assertion_mt.NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = removal_modules_assertion_mt.$assertion_just_att_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_assertion_mt.$kw6$OPAQUE, support_sentence, support_mt, (SubLObject)removal_modules_assertion_mt.$kw7$TRUE_MON);
        final SubLObject more_supports = (SubLObject)removal_modules_assertion_mt.NIL;
        return Values.values(support, more_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41144L)
    public static SubLObject assertion_asserted_byP(final SubLObject assertion, final SubLObject cyclist) {
        return Equality.equal(cyclist, assertions_high.asserted_by(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41337L)
    public static SubLObject all_assertions_asserted_by(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_message = PrintLow.format((SubLObject)removal_modules_assertion_mt.NIL, (SubLObject)removal_modules_assertion_mt.$str115$Computing_assertions_asserted_by_, cyclist);
        SubLObject result = (SubLObject)removal_modules_assertion_mt.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = progress_message;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER;
        assert removal_modules_assertion_mt.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)removal_modules_assertion_mt.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$45 = idx;
                if (removal_modules_assertion_mt.NIL == id_index.id_index_objects_empty_p(idx_$45, (SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                    final SubLObject idx_$46 = idx_$45;
                    if (removal_modules_assertion_mt.NIL == id_index.id_index_dense_objects_empty_p(idx_$46, (SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$46);
                        final SubLObject backwardP_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_assertion_mt.NIL, v_iteration = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER)) {
                            a_id = ((removal_modules_assertion_mt.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (removal_modules_assertion_mt.NIL == id_index.id_index_tombstone_p(a_handle) || removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                                if (removal_modules_assertion_mt.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)removal_modules_assertion_mt.$kw117$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (removal_modules_assertion_mt.NIL != assertion_asserted_byP(ass, cyclist)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$47 = idx_$45;
                    if (removal_modules_assertion_mt.NIL == id_index.id_index_sparse_objects_empty_p(idx_$47) || removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$47);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$47);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$47);
                        final SubLObject v_default = (SubLObject)((removal_modules_assertion_mt.NIL != id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) ? removal_modules_assertion_mt.NIL : removal_modules_assertion_mt.$kw117$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP) || removal_modules_assertion_mt.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (removal_modules_assertion_mt.NIL != assertion_asserted_byP(ass2, cyclist)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 41994L)
    public static SubLObject new_assertion_asserted_by_iterator(final SubLObject cyclist, SubLObject optimize) {
        if (optimize == removal_modules_assertion_mt.UNPROVIDED) {
            optimize = (SubLObject)removal_modules_assertion_mt.$kw118$LATENCY;
        }
        final SubLObject pcase_var = optimize;
        if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw118$LATENCY)) {
            final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            final SubLObject filter_args = (SubLObject)ConsesLow.list(cyclist);
            return iteration.new_filter_iterator(input_iterator, (SubLObject)removal_modules_assertion_mt.$sym119$ASSERTION_ASSERTED_BY_, filter_args);
        }
        if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw120$TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_by(cyclist));
        }
        return Errors.error((SubLObject)removal_modules_assertion_mt.$str121$_S_was_not_one_of__latency_or__to, optimize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 45907L)
    public static SubLObject current_inference_exhaustiveP() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_assertion_mt.NIL == inference || removal_modules_assertion_mt.NIL != inference_datastructures_inference.inference_dynamic_properties_exhaustiveP(inference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46353L)
    public static SubLObject estimated_average_assertions_per_cyclist() {
        return Numbers.integerDivide(assertion_handles.assertion_count(), Numbers.max((SubLObject)removal_modules_assertion_mt.ONE_INTEGER, cardinality_estimates.instance_cardinality(removal_modules_assertion_mt.$const128$HumanCyclist)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46544L)
    public static SubLObject removal_assertion_assert_by_lookup_cost(final SubLObject cyclist) {
        return number_utilities.f_2X(estimated_average_assertions_per_cyclist());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 46926L)
    public static SubLObject removal_assertion_asserted_by_iterator(final SubLObject cyclist) {
        final SubLObject optimize = (SubLObject)((removal_modules_assertion_mt.NIL != current_inference_exhaustiveP()) ? removal_modules_assertion_mt.$kw120$TOTAL_TIME : removal_modules_assertion_mt.$kw118$LATENCY);
        return new_assertion_asserted_by_iterator(cyclist, optimize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 48831L)
    public static SubLObject assertion_asserted_whenP(final SubLObject assertion, final SubLObject universal_date) {
        return Equality.eql(universal_date, assertions_high.asserted_when(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 49058L)
    public static SubLObject all_assertions_asserted_when(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_assertion_mt.NIL != numeric_date_utilities.universal_date_p(universal_date) : universal_date;
        final SubLObject progress_message = PrintLow.format((SubLObject)removal_modules_assertion_mt.NIL, (SubLObject)removal_modules_assertion_mt.$str136$Computing_assertions_asserted_on_, numeric_date_utilities.datestring(universal_date));
        SubLObject result = (SubLObject)removal_modules_assertion_mt.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = progress_message;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER;
        assert removal_modules_assertion_mt.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)removal_modules_assertion_mt.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$49 = idx;
                if (removal_modules_assertion_mt.NIL == id_index.id_index_objects_empty_p(idx_$49, (SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                    final SubLObject idx_$50 = idx_$49;
                    if (removal_modules_assertion_mt.NIL == id_index.id_index_dense_objects_empty_p(idx_$50, (SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$50);
                        final SubLObject backwardP_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_assertion_mt.NIL, v_iteration = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER)) {
                            a_id = ((removal_modules_assertion_mt.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (removal_modules_assertion_mt.NIL == id_index.id_index_tombstone_p(a_handle) || removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                                if (removal_modules_assertion_mt.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)removal_modules_assertion_mt.$kw117$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (removal_modules_assertion_mt.NIL != assertion_asserted_whenP(ass, universal_date)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$51 = idx_$49;
                    if (removal_modules_assertion_mt.NIL == id_index.id_index_sparse_objects_empty_p(idx_$51) || removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$51);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$51);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$51);
                        final SubLObject v_default = (SubLObject)((removal_modules_assertion_mt.NIL != id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) ? removal_modules_assertion_mt.NIL : removal_modules_assertion_mt.$kw117$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP) || removal_modules_assertion_mt.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (removal_modules_assertion_mt.NIL != assertion_asserted_whenP(ass2, universal_date)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 49815L)
    public static SubLObject new_assertion_asserted_when_iterator(final SubLObject universal_date, SubLObject optimize) {
        if (optimize == removal_modules_assertion_mt.UNPROVIDED) {
            optimize = (SubLObject)removal_modules_assertion_mt.$kw118$LATENCY;
        }
        assert removal_modules_assertion_mt.NIL != numeric_date_utilities.universal_date_p(universal_date) : universal_date;
        final SubLObject pcase_var = optimize;
        if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw118$LATENCY)) {
            final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            final SubLObject filter_args = (SubLObject)ConsesLow.list(universal_date);
            return iteration.new_filter_iterator(input_iterator, (SubLObject)removal_modules_assertion_mt.$sym137$ASSERTION_ASSERTED_WHEN_, filter_args);
        }
        if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw120$TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_when(universal_date));
        }
        return Errors.error((SubLObject)removal_modules_assertion_mt.$str121$_S_was_not_one_of__latency_or__to, optimize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 54709L)
    public static SubLObject estimated_average_assertions_per_date() {
        return Numbers.integerDivide(assertion_handles.assertion_count(), Numbers.integerDivide(Numbers.subtract(numeric_date_utilities.universal_time_from_date_and_second(numeric_date_utilities.today(), (SubLObject)removal_modules_assertion_mt.UNPROVIDED), numeric_date_utilities.universal_time_from_date_and_second(removal_modules_assertion_mt.$earliest_known_asserted_when$.getGlobalValue(), (SubLObject)removal_modules_assertion_mt.UNPROVIDED)), numeric_date_utilities.$seconds_in_a_day$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 55072L)
    public static SubLObject removal_assertion_assert_time_lookup_cost(final SubLObject universal_date) {
        return number_utilities.f_2X(estimated_average_assertions_per_date());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 55476L)
    public static SubLObject removal_assertion_asserted_when_iterator(final SubLObject universal_date) {
        final SubLObject optimize = (SubLObject)((removal_modules_assertion_mt.NIL != current_inference_exhaustiveP()) ? removal_modules_assertion_mt.$kw120$TOTAL_TIME : removal_modules_assertion_mt.$kw118$LATENCY);
        return new_assertion_asserted_when_iterator(universal_date, optimize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57546L)
    public static SubLObject assertion_asserted_whyP(final SubLObject assertion, final SubLObject reason) {
        return Equality.equal(reason, assertions_high.asserted_why(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 57752L)
    public static SubLObject all_assertions_asserted_why(final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_message = PrintLow.format((SubLObject)removal_modules_assertion_mt.NIL, (SubLObject)removal_modules_assertion_mt.$str151$Computing_assertions_asserted_for, reason);
        SubLObject result = (SubLObject)removal_modules_assertion_mt.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = progress_message;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER;
        assert removal_modules_assertion_mt.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)removal_modules_assertion_mt.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)removal_modules_assertion_mt.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$53 = idx;
                if (removal_modules_assertion_mt.NIL == id_index.id_index_objects_empty_p(idx_$53, (SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                    final SubLObject idx_$54 = idx_$53;
                    if (removal_modules_assertion_mt.NIL == id_index.id_index_dense_objects_empty_p(idx_$54, (SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$54);
                        final SubLObject backwardP_var = (SubLObject)removal_modules_assertion_mt.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_assertion_mt.NIL, v_iteration = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER)) {
                            a_id = ((removal_modules_assertion_mt.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (removal_modules_assertion_mt.NIL == id_index.id_index_tombstone_p(a_handle) || removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                                if (removal_modules_assertion_mt.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)removal_modules_assertion_mt.$kw117$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (removal_modules_assertion_mt.NIL != assertion_asserted_whyP(ass, reason)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$55 = idx_$53;
                    if (removal_modules_assertion_mt.NIL == id_index.id_index_sparse_objects_empty_p(idx_$55) || removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$55);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$55);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$55);
                        final SubLObject v_default = (SubLObject)((removal_modules_assertion_mt.NIL != id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP)) ? removal_modules_assertion_mt.NIL : removal_modules_assertion_mt.$kw117$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (removal_modules_assertion_mt.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_assertion_mt.$kw117$SKIP) || removal_modules_assertion_mt.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (removal_modules_assertion_mt.NIL != assertion_asserted_whyP(ass2, reason)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_assertion_mt.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 58422L)
    public static SubLObject new_assertion_asserted_why_iterator(final SubLObject reason, SubLObject optimize) {
        if (optimize == removal_modules_assertion_mt.UNPROVIDED) {
            optimize = (SubLObject)removal_modules_assertion_mt.$kw118$LATENCY;
        }
        final SubLObject pcase_var = optimize;
        if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw118$LATENCY)) {
            final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            final SubLObject filter_args = (SubLObject)ConsesLow.list(reason);
            return iteration.new_filter_iterator(input_iterator, (SubLObject)removal_modules_assertion_mt.$sym152$ASSERTION_ASSERTED_WHY_, filter_args);
        }
        if (pcase_var.eql((SubLObject)removal_modules_assertion_mt.$kw120$TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_why(reason));
        }
        return Errors.error((SubLObject)removal_modules_assertion_mt.$str121$_S_was_not_one_of__latency_or__to, optimize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 62505L)
    public static SubLObject estimated_average_assertions_per_purpose() {
        return Numbers.integerDivide(assertion_handles.assertion_count(), Numbers.max((SubLObject)removal_modules_assertion_mt.ONE_INTEGER, cardinality_estimates.instance_cardinality(removal_modules_assertion_mt.$const159$Cyc_BasedProject)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 62833L)
    public static SubLObject removal_assertion_assert_purpose_lookup_cost(final SubLObject reason) {
        return number_utilities.f_2X(estimated_average_assertions_per_purpose());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 63218L)
    public static SubLObject removal_assertion_asserted_why_iterator(final SubLObject reason) {
        final SubLObject optimize = (SubLObject)((removal_modules_assertion_mt.NIL != current_inference_exhaustiveP()) ? removal_modules_assertion_mt.$kw120$TOTAL_TIME : removal_modules_assertion_mt.$kw118$LATENCY);
        return new_assertion_asserted_why_iterator(reason, optimize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 68801L)
    public static SubLObject removal_assertion_assert_date_lookup_cost(final SubLObject cycl_date) {
        return number_utilities.f_2X(estimated_average_assertions_per_date());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 71921L)
    public static SubLObject removal_assertion_asserted_by_between_dates_cost(final SubLObject contextualized_dnf_clause) {
        return (SubLObject)removal_modules_assertion_mt.SEVENTEEN_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 72264L)
    public static SubLObject removal_assertion_asserted_by_between_dates_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLObject asents = Mapping.mapcar((SubLObject)removal_modules_assertion_mt.$sym179$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_dnf_clause));
        SubLObject clause_numbers = (SubLObject)removal_modules_assertion_mt.NIL;
        SubLObject list_var = (SubLObject)removal_modules_assertion_mt.NIL;
        SubLObject asent_1 = (SubLObject)removal_modules_assertion_mt.NIL;
        SubLObject clause_number_1 = (SubLObject)removal_modules_assertion_mt.NIL;
        list_var = asents;
        asent_1 = list_var.first();
        for (clause_number_1 = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER; removal_modules_assertion_mt.NIL != list_var; list_var = list_var.rest(), asent_1 = list_var.first(), clause_number_1 = Numbers.add((SubLObject)removal_modules_assertion_mt.ONE_INTEGER, clause_number_1)) {
            if (removal_modules_assertion_mt.NIL != forts.fort_p(cycl_utilities.formula_arg2(asent_1, (SubLObject)removal_modules_assertion_mt.UNPROVIDED)) && removal_modules_assertion_mt.NIL != assertion_asserted_by_asentP(asent_1)) {
                final SubLObject asserted_by_variable = cycl_utilities.formula_arg1(asent_1, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                if (removal_modules_assertion_mt.NIL != variables.variable_p(asserted_by_variable)) {
                    SubLObject list_var_$57 = (SubLObject)removal_modules_assertion_mt.NIL;
                    SubLObject asent_2 = (SubLObject)removal_modules_assertion_mt.NIL;
                    SubLObject clause_number_2 = (SubLObject)removal_modules_assertion_mt.NIL;
                    list_var_$57 = asents;
                    asent_2 = list_var_$57.first();
                    for (clause_number_2 = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER; removal_modules_assertion_mt.NIL != list_var_$57; list_var_$57 = list_var_$57.rest(), asent_2 = list_var_$57.first(), clause_number_2 = Numbers.add((SubLObject)removal_modules_assertion_mt.ONE_INTEGER, clause_number_2)) {
                        if (removal_modules_assertion_mt.NIL != assertion_assert_time_asentP(asent_2) && cycl_utilities.formula_arg1(asent_2, (SubLObject)removal_modules_assertion_mt.UNPROVIDED).eql(asserted_by_variable)) {
                            SubLObject pos_lit_numbers = (SubLObject)ConsesLow.list(clause_number_1, clause_number_2);
                            final SubLObject time_variable = cycl_utilities.formula_arg2(asent_2, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                            if (removal_modules_assertion_mt.NIL != variables.variable_p(time_variable) && !time_variable.eql(asserted_by_variable)) {
                                SubLObject list_var_$58 = (SubLObject)removal_modules_assertion_mt.NIL;
                                SubLObject asent_3 = (SubLObject)removal_modules_assertion_mt.NIL;
                                SubLObject clause_number_3 = (SubLObject)removal_modules_assertion_mt.NIL;
                                list_var_$58 = asents;
                                asent_3 = list_var_$58.first();
                                for (clause_number_3 = (SubLObject)removal_modules_assertion_mt.ZERO_INTEGER; removal_modules_assertion_mt.NIL != list_var_$58; list_var_$58 = list_var_$58.rest(), asent_3 = list_var_$58.first(), clause_number_3 = Numbers.add((SubLObject)removal_modules_assertion_mt.ONE_INTEGER, clause_number_3)) {
                                    if (removal_modules_assertion_mt.NIL != removal_assertion_asserted_by_between_dates_date_comparison_asentP(asent_3) && ((cycl_utilities.formula_arg2(asent_3, (SubLObject)removal_modules_assertion_mt.UNPROVIDED).isInteger() && cycl_utilities.formula_arg1(asent_3, (SubLObject)removal_modules_assertion_mt.UNPROVIDED).eql(time_variable)) || (cycl_utilities.formula_arg1(asent_3, (SubLObject)removal_modules_assertion_mt.UNPROVIDED).isInteger() && cycl_utilities.formula_arg2(asent_3, (SubLObject)removal_modules_assertion_mt.UNPROVIDED).eql(time_variable)))) {
                                        pos_lit_numbers = (SubLObject)ConsesLow.cons(clause_number_3, pos_lit_numbers);
                                    }
                                }
                                clause_numbers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)removal_modules_assertion_mt.NIL, Sort.sort(pos_lit_numbers, Symbols.symbol_function((SubLObject)removal_modules_assertion_mt.$sym180$_), (SubLObject)removal_modules_assertion_mt.UNPROVIDED)), clause_numbers);
                            }
                        }
                    }
                }
            }
        }
        return clause_numbers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73639L)
    public static SubLObject assertion_asserted_by_asentP(final SubLObject asent) {
        return Equality.eql(cycl_utilities.formula_arg0(asent), removal_modules_assertion_mt.$const113$assertionAssertBy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73752L)
    public static SubLObject assertion_assert_time_asentP(final SubLObject asent) {
        return Equality.eql(cycl_utilities.formula_arg0(asent), removal_modules_assertion_mt.$const133$assertionAssertTime);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 73866L)
    public static SubLObject removal_assertion_asserted_by_between_dates_date_comparison_asentP(final SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.formula_arg0(asent), removal_modules_assertion_mt.$removal_assertion_asserted_by_between_dates_date_comparison_predicates$.getGlobalValue(), (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 74071L)
    public static SubLObject removal_assertion_asserted_by_between_dates_expand_iterator(final SubLObject contextualized_dnf_clause) {
        final SubLObject asents = Mapping.mapcar((SubLObject)removal_modules_assertion_mt.$sym179$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_dnf_clause));
        final SubLObject asserted_by_asent = Sequences.find_if((SubLObject)removal_modules_assertion_mt.$sym181$ASSERTION_ASSERTED_BY_ASENT_, asents, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject assert_time_asent = Sequences.find_if((SubLObject)removal_modules_assertion_mt.$sym182$ASSERTION_ASSERT_TIME_ASENT_, asents, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject time_comparison_asents = list_utilities.find_all_if((SubLObject)removal_modules_assertion_mt.$sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT, asents, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject assertion_var = cycl_utilities.formula_arg1(asserted_by_asent, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject cyclist = cycl_utilities.formula_arg2(asserted_by_asent, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject assert_time_arg2 = cycl_utilities.formula_arg2(assert_time_asent, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject filter_and_transform_args = (SubLObject)ConsesLow.list(list_utilities.make_plist((SubLObject)ConsesLow.list((SubLObject)removal_modules_assertion_mt.$kw184$CYCLIST, (SubLObject)removal_modules_assertion_mt.$kw185$ASSERTION_VAR, (SubLObject)removal_modules_assertion_mt.$kw186$ASSERT_TIME_ARG2, (SubLObject)removal_modules_assertion_mt.$kw187$TIME_COMPARISON_ASENTS, (SubLObject)removal_modules_assertion_mt.$kw188$ASENTS), (SubLObject)ConsesLow.list(cyclist, assertion_var, assert_time_arg2, time_comparison_asents, asents)));
        return iteration.new_filter_and_transform_iterator(assertion_handles.new_assertions_iterator(), (SubLObject)removal_modules_assertion_mt.$sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T, filter_and_transform_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-mt.lisp", position = 75301L)
    public static SubLObject removal_assertion_asserted_by_between_dates_iterator_filter_and_transform(final SubLObject assertion, final SubLObject filter_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = conses_high.getf(filter_args, (SubLObject)removal_modules_assertion_mt.$kw184$CYCLIST, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject assertion_var = conses_high.getf(filter_args, (SubLObject)removal_modules_assertion_mt.$kw185$ASSERTION_VAR, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject assert_time_arg2 = conses_high.getf(filter_args, (SubLObject)removal_modules_assertion_mt.$kw186$ASSERT_TIME_ARG2, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject time_comparison_asents = conses_high.getf(filter_args, (SubLObject)removal_modules_assertion_mt.$kw187$TIME_COMPARISON_ASENTS, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject asents = conses_high.getf(filter_args, (SubLObject)removal_modules_assertion_mt.$kw188$ASENTS, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
        final SubLObject assertion_cyclist = assertions_high.asserted_by(assertion);
        final SubLObject assertion_date = assertions_high.asserted_when(assertion);
        if (assert_time_arg2.isInteger()) {
            if (assertion_cyclist.eql(cyclist) && assertion_date.eql(assert_time_arg2)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(assertion_var, assertion, (SubLObject)removal_modules_assertion_mt.T, (SubLObject)removal_modules_assertion_mt.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject justifications = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(removal_modules_bookkeeping.make_bookkeeping_hl_support((SubLObject)ConsesLow.list(removal_modules_assertion_mt.$const113$assertionAssertBy, assertion, assertion_cyclist)), removal_modules_bookkeeping.make_bookkeeping_hl_support((SubLObject)ConsesLow.list(removal_modules_assertion_mt.$const133$assertionAssertTime, assertion, assertion_date)), unify_justification));
                return Values.values((SubLObject)ConsesLow.list(v_bindings, justifications), (SubLObject)removal_modules_assertion_mt.T);
            }
        }
        else if (assertion_cyclist.eql(cyclist)) {
            SubLObject failureP = (SubLObject)removal_modules_assertion_mt.NIL;
            if (removal_modules_assertion_mt.NIL == failureP) {
                SubLObject csome_list_var = time_comparison_asents;
                SubLObject time_comparison_asent = (SubLObject)removal_modules_assertion_mt.NIL;
                time_comparison_asent = csome_list_var.first();
                while (removal_modules_assertion_mt.NIL == failureP && removal_modules_assertion_mt.NIL != csome_list_var) {
                    final SubLObject bound_time_comparison_asent = cycl_utilities.expression_subst(assertion_date, assert_time_arg2, time_comparison_asent, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                    if (removal_modules_assertion_mt.NIL == relation_evaluation.cyc_evaluate(bound_time_comparison_asent)) {
                        failureP = (SubLObject)removal_modules_assertion_mt.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    time_comparison_asent = csome_list_var.first();
                }
            }
            if (removal_modules_assertion_mt.NIL == failureP) {
                thread.resetMultipleValues();
                final SubLObject bindings1 = unification_utilities.term_unify(assertion_var, assertion, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                final SubLObject unify_justification2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject bindings2 = unification_utilities.term_unify(assert_time_arg2, assertion_date, (SubLObject)removal_modules_assertion_mt.UNPROVIDED, (SubLObject)removal_modules_assertion_mt.UNPROVIDED);
                final SubLObject unify_justification3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject v_bindings2 = ConsesLow.append(bindings1, bindings2);
                final SubLObject unify_justification4 = ConsesLow.append(unify_justification2, unify_justification3);
                SubLObject justifications2 = (SubLObject)removal_modules_assertion_mt.NIL;
                SubLObject cdolist_list_var = asents;
                SubLObject asent = (SubLObject)removal_modules_assertion_mt.NIL;
                asent = cdolist_list_var.first();
                while (removal_modules_assertion_mt.NIL != cdolist_list_var) {
                    if (cycl_utilities.formula_arg0(asent).eql(removal_modules_assertion_mt.$const133$assertionAssertTime)) {
                        justifications2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(el_utilities.make_binary_formula(removal_modules_assertion_mt.$const133$assertionAssertTime, assertion, assertion_date)), unify_justification4), justifications2);
                    }
                    else if (cycl_utilities.formula_arg0(asent).eql(removal_modules_assertion_mt.$const113$assertionAssertBy)) {
                        justifications2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(el_utilities.make_binary_formula(removal_modules_assertion_mt.$const113$assertionAssertBy, assertion, assertion_cyclist)), unify_justification4), justifications2);
                    }
                    else {
                        justifications2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(removal_modules_evaluation.make_eval_support(bindings.apply_bindings(v_bindings2, asent), (SubLObject)removal_modules_assertion_mt.UNPROVIDED), unify_justification4), justifications2);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    asent = cdolist_list_var.first();
                }
                justifications2 = Sequences.nreverse(justifications2);
                return Values.values((SubLObject)ConsesLow.list(v_bindings2, justifications2), (SubLObject)removal_modules_assertion_mt.T);
            }
        }
        return Values.values((SubLObject)removal_modules_assertion_mt.NIL, (SubLObject)removal_modules_assertion_mt.NIL);
    }
    
    public static SubLObject declare_removal_modules_assertion_mt_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "hl_assertion_support_sentence_to_el", "HL-ASSERTION-SUPPORT-SENTENCE-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_mt_support", "MAKE-ASSERTION-MT-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_mt_lookup_cost", "REMOVAL-ASSERTION-MT-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_sentenceP", "ASSERTION-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_sentence_support_from_assertion", "MAKE-ASSERTION-SENTENCE-SUPPORT-FROM-ASSERTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_sentence_support", "MAKE-ASSERTION-SENTENCE-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_fi_formula_robust", "ASSERTION-FI-FORMULA-ROBUST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_sentence_unbound_assertion_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_sentence_expand_internal_1", "REMOVAL-ASSERTION-SENTENCE-EXPAND-INTERNAL-1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_sentence_unbound_assertion_pred_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_sentence_unbound_assertion_pred_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_sentence_unbound_assertion_arg_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_sentence_unbound_assertion_arg_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_has_idP", "ASSERTION-HAS-ID?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_id_support", "MAKE-ASSERTION-ID-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "cycl_direction_p", "CYCL-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "direction_to_cycl_direction", "DIRECTION-TO-CYCL-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "cycl_direction_to_direction", "CYCL-DIRECTION-TO-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_direction_support", "MAKE-ASSERTION-DIRECTION-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "cycl_strength_p", "CYCL-STRENGTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "strength_to_cycl_strength", "STRENGTH-TO-CYCL-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "cycl_strength_to_strength", "CYCL-STRENGTH-TO-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_has_strength", "ASSERTION-HAS-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_strength_support", "MAKE-ASSERTION-STRENGTH-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "cycl_truth_p", "CYCL-TRUTH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "truth_to_cycl_truth", "TRUTH-TO-CYCL-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "cycl_truth_to_truth", "CYCL-TRUTH-TO-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_truth_support", "MAKE-ASSERTION-TRUTH-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "inference_assertion_just_att", "INFERENCE-ASSERTION-JUST-ATT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "inference_all_assertion_just_att", "INFERENCE-ALL-ASSERTION-JUST-ATT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "make_assertion_just_att_support", "MAKE-ASSERTION-JUST-ATT-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_asserted_byP", "ASSERTION-ASSERTED-BY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "all_assertions_asserted_by", "ALL-ASSERTIONS-ASSERTED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "new_assertion_asserted_by_iterator", "NEW-ASSERTION-ASSERTED-BY-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "current_inference_exhaustiveP", "CURRENT-INFERENCE-EXHAUSTIVE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "estimated_average_assertions_per_cyclist", "ESTIMATED-AVERAGE-ASSERTIONS-PER-CYCLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_assert_by_lookup_cost", "REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_by_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_asserted_whenP", "ASSERTION-ASSERTED-WHEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "all_assertions_asserted_when", "ALL-ASSERTIONS-ASSERTED-WHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "new_assertion_asserted_when_iterator", "NEW-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "estimated_average_assertions_per_date", "ESTIMATED-AVERAGE-ASSERTIONS-PER-DATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_assert_time_lookup_cost", "REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_when_iterator", "REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_asserted_whyP", "ASSERTION-ASSERTED-WHY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "all_assertions_asserted_why", "ALL-ASSERTIONS-ASSERTED-WHY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "new_assertion_asserted_why_iterator", "NEW-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "estimated_average_assertions_per_purpose", "ESTIMATED-AVERAGE-ASSERTIONS-PER-PURPOSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_assert_purpose_lookup_cost", "REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_why_iterator", "REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_assert_date_lookup_cost", "REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_by_between_dates_cost", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_by_between_dates_applicability", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_asserted_by_asentP", "ASSERTION-ASSERTED-BY-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "assertion_assert_time_asentP", "ASSERTION-ASSERT-TIME-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_by_between_dates_date_comparison_asentP", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_by_between_dates_expand_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt", "removal_assertion_asserted_by_between_dates_iterator_filter_and_transform", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM", 2, 0, false);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    public static SubLObject init_removal_modules_assertion_mt_file() {
        removal_modules_assertion_mt.$assertion_mt_defining_mt$ = SubLFiles.deflexical("*ASSERTION-MT-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym4$_ASSERTION_MT_DEFINING_MT_, removal_modules_assertion_mt.$assertion_mt_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_mt_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-MT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$assertion_sentence_defining_mt$ = SubLFiles.deflexical("*ASSERTION-SENTENCE-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym19$_ASSERTION_SENTENCE_DEFINING_MT_, removal_modules_assertion_mt.$assertion_sentence_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_sentence_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$default_assertion_sentence_lookup_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$assertion_id_defining_mt$ = SubLFiles.deflexical("*ASSERTION-ID-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym42$_ASSERTION_ID_DEFINING_MT_, removal_modules_assertion_mt.$assertion_id_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_id_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-ID-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$cycl_directions$ = SubLFiles.deflexical("*CYCL-DIRECTIONS*", (SubLObject)removal_modules_assertion_mt.$list52);
        removal_modules_assertion_mt.$assertion_direction_defining_mt$ = SubLFiles.deflexical("*ASSERTION-DIRECTION-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym61$_ASSERTION_DIRECTION_DEFINING_MT_, removal_modules_assertion_mt.$assertion_direction_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_direction_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$cycl_strengths$ = SubLFiles.deflexical("*CYCL-STRENGTHS*", (SubLObject)removal_modules_assertion_mt.$list69);
        removal_modules_assertion_mt.$assertion_strength_defining_mt$ = SubLFiles.deflexical("*ASSERTION-STRENGTH-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym78$_ASSERTION_STRENGTH_DEFINING_MT_, removal_modules_assertion_mt.$assertion_strength_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_strength_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$cycl_truths$ = SubLFiles.deflexical("*CYCL-TRUTHS*", (SubLObject)removal_modules_assertion_mt.$list86);
        removal_modules_assertion_mt.$assertion_truth_defining_mt$ = SubLFiles.deflexical("*ASSERTION-TRUTH-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym95$_ASSERTION_TRUTH_DEFINING_MT_, removal_modules_assertion_mt.$assertion_truth_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_truth_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$assertion_just_att_defining_mt$ = SubLFiles.deflexical("*ASSERTION-JUST-ATT-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym106$_ASSERTION_JUST_ATT_DEFINING_MT_, removal_modules_assertion_mt.$assertion_just_att_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_just_att_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$assertion_assert_by_defining_mt$ = SubLFiles.deflexical("*ASSERTION-ASSERT-BY-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_, removal_modules_assertion_mt.$assertion_assert_by_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_assert_by_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$assertion_assert_time_defining_mt$ = SubLFiles.deflexical("*ASSERTION-ASSERT-TIME-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_, removal_modules_assertion_mt.$assertion_assert_time_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_assert_time_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$earliest_known_asserted_when$ = SubLFiles.deflexical("*EARLIEST-KNOWN-ASSERTED-WHEN*", (SubLObject)removal_modules_assertion_mt.$int144$19950522);
        removal_modules_assertion_mt.$assertion_assert_purpose_defining_mt$ = SubLFiles.deflexical("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_, removal_modules_assertion_mt.$assertion_assert_purpose_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_assert_purpose_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$assertion_assert_date_defining_mt$ = SubLFiles.deflexical("*ASSERTION-ASSERT-DATE-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_assertion_mt.$sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_, removal_modules_assertion_mt.$assertion_assert_date_defining_mt$, removal_modules_assertion_mt.$const5$BaseKB));
        removal_modules_assertion_mt.$default_assertion_assert_date_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_mt.$removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = SubLFiles.deflexical("*REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-PREDICATES*", (SubLObject)removal_modules_assertion_mt.$list178);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    public static SubLObject setup_removal_modules_assertion_mt_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const1$assertionMt);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const1$assertionMt);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const1$assertionMt);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym4$_ASSERTION_MT_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym4$_ASSERTION_MT_DEFINING_MT_, removal_modules_assertion_mt.$const1$assertionMt);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw8$REMOVAL_ASSERTION_MT_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list9);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw10$REMOVAL_ASSERTION_MT_PRUNE_POS, (SubLObject)removal_modules_assertion_mt.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw12$REMOVAL_ASSERTION_MT_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list13);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw14$REMOVAL_ASSERTION_MT_UNIFY, (SubLObject)removal_modules_assertion_mt.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw16$REMOVAL_ASSERTION_MT_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list17);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const18$assertionSentence);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const18$assertionSentence);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym19$_ASSERTION_SENTENCE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym19$_ASSERTION_SENTENCE_DEFINING_MT_, removal_modules_assertion_mt.$const18$assertionSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw20$REMOVAL_ASSERTION_FORMULA_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list21);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw22$REMOVAL_ASSERTION_FORMULA_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw27$REMOVAL_ASSERTION_FORMULA_UNIFY, (SubLObject)removal_modules_assertion_mt.$list28);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw29$REMOVAL_ASSERTION_FORMULA_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list30);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw37$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list38);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw39$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list40);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const41$assertionID);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const41$assertionID);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const41$assertionID);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym42$_ASSERTION_ID_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym42$_ASSERTION_ID_DEFINING_MT_, removal_modules_assertion_mt.$const41$assertionID);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw43$REMOVAL_ASSERTION_ID_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list44);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw45$REMOVAL_ASSERTION_ID_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list46);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw47$REMOVAL_ASSERTION_ID_UNIFY, (SubLObject)removal_modules_assertion_mt.$list48);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw49$REMOVAL_ASSERTION_ID_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list50);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const51$assertionDirection);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const51$assertionDirection, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const51$assertionDirection);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym61$_ASSERTION_DIRECTION_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym61$_ASSERTION_DIRECTION_DEFINING_MT_, removal_modules_assertion_mt.$const51$assertionDirection);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw62$REMOVAL_ASSERTION_DIRECTION_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list63);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw64$REMOVAL_ASSERTION_DIRECTION_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list65);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw66$REMOVAL_ASSERTION_DIRECTION_UNIFY, (SubLObject)removal_modules_assertion_mt.$list67);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const68$assertionStrength);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const68$assertionStrength, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const68$assertionStrength);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym78$_ASSERTION_STRENGTH_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym78$_ASSERTION_STRENGTH_DEFINING_MT_, removal_modules_assertion_mt.$const68$assertionStrength);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw79$REMOVAL_ASSERTION_STRENGTH_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list80);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw81$REMOVAL_ASSERTION_STRENGTH_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list82);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw83$REMOVAL_ASSERTION_STRENGTH_UNIFY, (SubLObject)removal_modules_assertion_mt.$list84);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const85$assertionTruth);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const85$assertionTruth, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const85$assertionTruth);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym95$_ASSERTION_TRUTH_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym95$_ASSERTION_TRUTH_DEFINING_MT_, removal_modules_assertion_mt.$const85$assertionTruth);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw96$REMOVAL_ASSERTION_TRUTH_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list97);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw98$REMOVAL_ASSERTION_TRUTH_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list99);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw100$REMOVAL_ASSERTION_TRUTH_UNIFY, (SubLObject)removal_modules_assertion_mt.$list101);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const102$assertionJustificationAttribute);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const102$assertionJustificationAttribute, (SubLObject)removal_modules_assertion_mt.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const102$assertionJustificationAttribute);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym106$_ASSERTION_JUST_ATT_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym106$_ASSERTION_JUST_ATT_DEFINING_MT_, removal_modules_assertion_mt.$const102$assertionJustificationAttribute);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw107$REMOVAL_ASSERTION_JUST_ATT_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list108);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw109$REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list110);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw111$REMOVAL_ASSERTION_JUST_ATT_UNIFY, (SubLObject)removal_modules_assertion_mt.$list112);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const113$assertionAssertBy);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const113$assertionAssertBy);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const113$assertionAssertBy);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_, removal_modules_assertion_mt.$const113$assertionAssertBy);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw122$REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list123);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw124$REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list125);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw126$REMOVAL_ASSERTION_ASSERT_BY_UNIFY, (SubLObject)removal_modules_assertion_mt.$list127);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw129$REMOVAL_ASSERTION_ASSERT_BY_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list130);
        preference_modules.inference_preference_module((SubLObject)removal_modules_assertion_mt.$kw131$DISPREFER_ASSERTION_ASSERT_BY_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list132);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const133$assertionAssertTime);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const133$assertionAssertTime);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const133$assertionAssertTime);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_, removal_modules_assertion_mt.$const133$assertionAssertTime);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw138$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list139);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw140$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list141);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw142$REMOVAL_ASSERTION_ASSERT_TIME_UNIFY, (SubLObject)removal_modules_assertion_mt.$list143);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw145$REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list146);
        preference_modules.inference_preference_module((SubLObject)removal_modules_assertion_mt.$kw147$DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list148);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const149$assertionAssertPurpose);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const149$assertionAssertPurpose);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const149$assertionAssertPurpose);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_, removal_modules_assertion_mt.$const149$assertionAssertPurpose);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw153$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list154);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw155$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list156);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw157$REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY, (SubLObject)removal_modules_assertion_mt.$list158);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw160$REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list161);
        preference_modules.inference_preference_module((SubLObject)removal_modules_assertion_mt.$kw162$DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list163);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_mt.$const164$assertionAssertDate);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_assertion_mt.$kw2$POS, removal_modules_assertion_mt.$const164$assertionAssertDate);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_mt.$kw3$NEG, removal_modules_assertion_mt.$const164$assertionAssertDate);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_assertion_mt.$sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_assertion_mt.$sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_, removal_modules_assertion_mt.$const164$assertionAssertDate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw166$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS, (SubLObject)removal_modules_assertion_mt.$list167);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw168$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG, (SubLObject)removal_modules_assertion_mt.$list169);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw170$REMOVAL_ASSERTION_ASSERT_DATE_UNIFY, (SubLObject)removal_modules_assertion_mt.$list171);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_mt.$kw172$REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list173);
        preference_modules.inference_preference_module((SubLObject)removal_modules_assertion_mt.$kw174$DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP, (SubLObject)removal_modules_assertion_mt.$list175);
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_assertion_mt.$kw176$REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE, (SubLObject)removal_modules_assertion_mt.$list177);
        return (SubLObject)removal_modules_assertion_mt.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_assertion_mt_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_assertion_mt_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_assertion_mt_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_assertion_mt();
        removal_modules_assertion_mt.$assertion_mt_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_mt_check_cost$ = null;
        removal_modules_assertion_mt.$assertion_sentence_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_sentence_check_cost$ = null;
        removal_modules_assertion_mt.$default_assertion_sentence_lookup_cost$ = null;
        removal_modules_assertion_mt.$assertion_id_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_id_check_cost$ = null;
        removal_modules_assertion_mt.$cycl_directions$ = null;
        removal_modules_assertion_mt.$assertion_direction_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_direction_check_cost$ = null;
        removal_modules_assertion_mt.$cycl_strengths$ = null;
        removal_modules_assertion_mt.$assertion_strength_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_strength_check_cost$ = null;
        removal_modules_assertion_mt.$cycl_truths$ = null;
        removal_modules_assertion_mt.$assertion_truth_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_truth_check_cost$ = null;
        removal_modules_assertion_mt.$assertion_just_att_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_just_att_check_cost$ = null;
        removal_modules_assertion_mt.$assertion_assert_by_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_assert_by_check_cost$ = null;
        removal_modules_assertion_mt.$assertion_assert_time_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_assert_time_check_cost$ = null;
        removal_modules_assertion_mt.$earliest_known_asserted_when$ = null;
        removal_modules_assertion_mt.$assertion_assert_purpose_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_assert_purpose_check_cost$ = null;
        removal_modules_assertion_mt.$assertion_assert_date_defining_mt$ = null;
        removal_modules_assertion_mt.$default_assertion_assert_date_check_cost$ = null;
        removal_modules_assertion_mt.$removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = null;
        $sym0$ASSERTION_EL_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-EL-IST-FORMULA");
        $const1$assertionMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt"));
        $kw2$POS = SubLObjectFactory.makeKeyword("POS");
        $kw3$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym4$_ASSERTION_MT_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-MT-DEFINING-MT*");
        $const5$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw6$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw7$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw8$REMOVAL_ASSERTION_MT_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-MT-CHECK-POS");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-MT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionMt <assertion> <hlmt-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$LogicalTruthMt)") });
        $kw10$REMOVAL_ASSERTION_MT_PRUNE_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-MT-PRUNE-POS");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE") });
        $kw12$REMOVAL_ASSERTION_MT_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-MT-CHECK-NEG");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-MT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionMt <assertion> <hlmt-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not \n      (#$assertionMt \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        #$BookkeepingMt))") });
        $kw14$REMOVAL_ASSERTION_MT_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-MT-UNIFY");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionMt <assertion> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });
        $kw16$REMOVAL_ASSERTION_MT_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-MT-LOOKUP");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-MT-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionMt")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionMt <variable> <hlmt-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionMt ?ASSERTION #$LogicalTruthMt)") });
        $const18$assertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $sym19$_ASSERTION_SENTENCE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-SENTENCE-DEFINING-MT*");
        $kw20$REMOVAL_ASSERTION_FORMULA_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-POS");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SENTENCE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionSentence <assertion> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionSentence \n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      (#$isa #$Thing #$Collection))") });
        $kw22$REMOVAL_ASSERTION_FORMULA_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-NEG");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SENTENCE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionSentence <assertion> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n      (#$assertionSentence \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        (#$genls #$Collection #$Thing)))") });
        $kw24$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym25$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym26$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw27$REMOVAL_ASSERTION_FORMULA_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-FORMULA-UNIFY");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA-ROBUST"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)removal_modules_assertion_mt.T)), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionSentence <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionSentence\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });
        $kw29$REMOVAL_ASSERTION_FORMULA_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-FORMULA-LOOKUP");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionSentence <variable> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionSentence ?ASSERTION (#$isa #$Thing #$Collection))") });
        $sym31$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const32$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw33$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw34$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw35$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw36$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $kw37$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-PRED-LOOKUP");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionSentence <variable> (<predicate> ...)) \n    using only GAF indexing of assertions indexed by <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionSentence ?ASSERTION (#$interArgIsa1-3 ?PRED ?COL1 ?COL2))") });
        $kw39$REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-ARG-LOOKUP");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT-HAS-FORT-ARG-P")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionSentence <variable> (<not fully-bound> ... <fort> ...)) \n     using only KB GAF indexing of assertions indexed by <fort>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionSentence ?ASSERTION (?PRED ?ARG1 ?ARG2 #$ShowerHead))") });
        $const41$assertionID = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID"));
        $sym42$_ASSERTION_ID_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-ID-DEFINING-MT*");
        $kw43$REMOVAL_ASSERTION_ID_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ID-CHECK-POS");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-ID?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionID <assertion> <integer>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      163059)") });
        $kw45$REMOVAL_ASSERTION_ID_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ID-CHECK-NEG");
        $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-ID?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionID <assertion> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n      (#$assertionID \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        123456))") });
        $kw47$REMOVAL_ASSERTION_ID_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ID-UNIFY");
        $list48 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionID <assertion> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ID)") });
        $kw49$REMOVAL_ASSERTION_ID_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ID-LOOKUP");
        $list50 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionID")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionID <not-fully-bound> <integer>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionID ?ASSERTION 123456)") });
        $const51$assertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection"));
        $list52 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forward-AssertionDirection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Backward-AssertionDirection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Code-AssertionDirection")));
        $kw53$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const54$Forward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forward-AssertionDirection"));
        $kw55$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $const56$Backward_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Backward-AssertionDirection"));
        $kw57$CODE = SubLObjectFactory.makeKeyword("CODE");
        $const58$Code_AssertionDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Code-AssertionDirection"));
        $str59$_S_was_not_a_direction_p = SubLObjectFactory.makeString("~S was not a direction-p");
        $str60$_S_was_not_a_cycl_direction_p = SubLObjectFactory.makeString("~S was not a cycl-direction-p");
        $sym61$_ASSERTION_DIRECTION_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-DIRECTION-DEFINING-MT*");
        $kw62$REMOVAL_ASSERTION_DIRECTION_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-POS");
        $list63 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION-TO-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionDirection <assertion> <constant>)\n    where <constant> is a CycL direction"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Forward-AssertionDirection)") });
        $kw64$REMOVAL_ASSERTION_DIRECTION_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-NEG");
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION-TO-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DIRECTION"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionDirection <assertion> <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Backward-AssertionDirection))") });
        $kw66$REMOVAL_ASSERTION_DIRECTION_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-DIRECTION-UNIFY");
        $list67 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-TO-CYCL-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirection")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionDirection <assertion> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?DIRECTION)") });
        $const68$assertionStrength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength"));
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Default-JustificationStrength")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Monotonic-JustificationStrength")));
        $kw70$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const71$Default_JustificationStrength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Default-JustificationStrength"));
        $kw72$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $const73$Monotonic_JustificationStrength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Monotonic-JustificationStrength"));
        $str74$_S_was_not_a_el_strength_p = SubLObjectFactory.makeString("~S was not a el-strength-p");
        $str75$_S_was_not_a_cycl_strength_p = SubLObjectFactory.makeString("~S was not a cycl-strength-p");
        $sym76$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym77$EL_STRENGTH_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $sym78$_ASSERTION_STRENGTH_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-STRENGTH-DEFINING-MT*");
        $kw79$REMOVAL_ASSERTION_STRENGTH_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-POS");
        $list80 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH-TO-STRENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-STRENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionStrength <assertion> <constant>)\n    where <constant> is a CycL justification strength"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionStrength\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Monotonic-JustificationStrength)") });
        $kw81$REMOVAL_ASSERTION_STRENGTH_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-NEG");
        $list82 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH-TO-STRENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRENGTH"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-STRENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionStrength <assertion> <constant>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Default-JustificationStrength))") });
        $kw83$REMOVAL_ASSERTION_STRENGTH_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-STRENGTH-UNIFY");
        $list84 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH-TO-CYCL-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionStrength")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionStength <assertion> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?STRENGTH)") });
        $const85$assertionTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth"));
        $list86 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unknown-JustificationTruth")));
        $kw87$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const88$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $kw89$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $const90$False_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"));
        $kw91$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const92$Unknown_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unknown-JustificationTruth"));
        $str93$_S_was_not_a_truth_p = SubLObjectFactory.makeString("~S was not a truth-p");
        $str94$_S_was_not_a_cycl_truth_p = SubLObjectFactory.makeString("~S was not a cycl-truth-p");
        $sym95$_ASSERTION_TRUTH_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-TRUTH-DEFINING-MT*");
        $kw96$REMOVAL_ASSERTION_TRUTH_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-POS");
        $list97 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH-TO-TRUTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionTruth <assertion> <constant>)\n    where <constant> is a CycL justification truth"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$True-JustificationTruth)") });
        $kw98$REMOVAL_ASSERTION_TRUTH_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-NEG");
        $list99 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH")))), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH-TO-TRUTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TRUTH"))))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionTruth <assertion> <constant>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionTruth \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$False-JustificationTruth))") });
        $kw100$REMOVAL_ASSERTION_TRUTH_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-TRUTH-UNIFY");
        $list101 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-TO-CYCL-TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTruth")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionTruth <assertion> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?TRUTH)") });
        $const102$assertionJustificationAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute"));
        $sym103$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const104$AssertedBelief = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssertedBelief"));
        $const105$SupportedByMaterialImplication = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupportedByMaterialImplication"));
        $sym106$_ASSERTION_JUST_ATT_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-JUST-ATT-DEFINING-MT*");
        $kw107$REMOVAL_ASSERTION_JUST_ATT_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-POS");
        $list108 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ATT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ATT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ATT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ASSERTION-JUST-ATT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ATT")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionJustificationAttribute <assertion> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$AssertedBelief)") });
        $kw109$REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-NEG");
        $list110 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ATT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ATT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ATT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ASSERTION-JUST-ATT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ATT"))))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionJustificationAttribute <assertion> <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n      (#$assertionJustificationAttribute \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        #$SupportedByMaterialImplication))") });
        $kw111$REMOVAL_ASSERTION_JUST_ATT_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-JUST-ATT-UNIFY");
        $list112 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ALL-ASSERTION-JUST-ATT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionJustificationAttribute")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionJustificationAttribute <assertion> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ATT)") });
        $const113$assertionAssertBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy"));
        $sym114$_ASSERTION_ASSERT_BY_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*");
        $str115$Computing_assertions_asserted_by_ = SubLObjectFactory.makeString("Computing assertions asserted by ~S");
        $sym116$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw117$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw118$LATENCY = SubLObjectFactory.makeKeyword("LATENCY");
        $sym119$ASSERTION_ASSERTED_BY_ = SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-BY?");
        $kw120$TOTAL_TIME = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $str121$_S_was_not_one_of__latency_or__to = SubLObjectFactory.makeString("~S was not one of :latency or :total-time");
        $kw122$REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-POS");
        $list123 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-BY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertBy <assertion> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Pace)") });
        $kw124$REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-NEG");
        $list125 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-BY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionAssertBy <assertion> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Lenat))") });
        $kw126$REMOVAL_ASSERTION_ASSERT_BY_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-UNIFY");
        $list127 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-BY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertBy <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHO)") });
        $const128$HumanCyclist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanCyclist"));
        $kw129$REMOVAL_ASSERTION_ASSERT_BY_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP");
        $list130 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertBy <variable> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertBy ?ASSERTION #$Lenat)") });
        $kw131$DISPREFER_ASSERTION_ASSERT_BY_LOOKUP = SubLObjectFactory.makeKeyword("DISPREFER-ASSERTION-ASSERT-BY-LOOKUP");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $const133$assertionAssertTime = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime"));
        $sym134$_ASSERTION_ASSERT_TIME_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*");
        $sym135$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $str136$Computing_assertions_asserted_on_ = SubLObjectFactory.makeString("Computing assertions asserted on ~A");
        $sym137$ASSERTION_ASSERTED_WHEN_ = SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-WHEN?");
        $kw138$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-POS");
        $list139 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-WHEN?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertTime <assertion> <integer>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      20020411)") });
        $kw140$REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-NEG");
        $list141 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-WHEN?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionAssertTime <assertion> <integer>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      19950524))") });
        $kw142$REMOVAL_ASSERTION_ASSERT_TIME_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-UNIFY");
        $list143 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-WHEN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertTime <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)") });
        $int144$19950522 = SubLObjectFactory.makeInteger(19950522);
        $kw145$REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP");
        $list146 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE")))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIVERSAL-DATE"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertTime <variable> <integer>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertTime ?ASSERTION 19950524)") });
        $kw147$DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP = SubLObjectFactory.makeKeyword("DISPREFER-ASSERTION-ASSERT-TIME-LOOKUP");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $const149$assertionAssertPurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose"));
        $sym150$_ASSERTION_ASSERT_PURPOSE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*");
        $str151$Computing_assertions_asserted_for = SubLObjectFactory.makeString("Computing assertions asserted for ~S");
        $sym152$ASSERTION_ASSERTED_WHY_ = SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-WHY?");
        $kw153$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-POS");
        $list154 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("REASON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-WHY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertPurpose <assertion> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$GeneralCycKE)") });
        $kw155$REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-NEG");
        $list156 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("REASON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-WHY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionAssertPurpose <assertion> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$HPKBProject))") });
        $kw157$REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-UNIFY");
        $list158 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-WHY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertPurpose <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHY)") });
        $const159$Cyc_BasedProject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $kw160$REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP");
        $list161 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON")))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REASON"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertPurpose <variable> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertPurpose ?ASSERTION #$HPKBProject)\n    (#$thereExists ?ASSERTION\n      (#$assertionAssertPurpose ?ASSERTION #$GeneralCycKE))") });
        $kw162$DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP = SubLObjectFactory.makeKeyword("DISPREFER-ASSERTION-ASSERT-PURPOSE-LOOKUP");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $const164$assertionAssertDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate"));
        $sym165$_ASSERTION_ASSERT_DATE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*");
        $kw166$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-POS");
        $list167 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GENERALIZED-DATE-P"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertDate <assertion> <cycl-date>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 11 (#$MonthFn #$April (#$YearFn 2002))))") });
        $kw168$REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-NEG");
        $list169 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE")))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GENERALIZED-DATE-P"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionAssertDate <assertion> <integer>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995)))))") });
        $kw170$REMOVAL_ASSERTION_ASSERT_DATE_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-UNIFY");
        $list171 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_mt.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-DATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertDate <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)\n    (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn ?DATE ?MONTH))") });
        $kw172$REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP");
        $list173 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE")))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GENERALIZED-DATE-P")), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION-ASSERTED-DATE-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionAssertDate <variable> <cycl-date>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionAssertDate ?ASSERTION (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995))))") });
        $kw174$DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP = SubLObjectFactory.makeKeyword("DISPREFER-ASSERTION-ASSERT-DATE-LOOKUP");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw176$REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-AND-TIME-CONJUNCTIVE");
        $list177 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionAssertTime"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <fully-bound>))\n    or\n    (#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <not-fully-bound 0>)\n           [(<number comparison pred> <not-fully-bound 0> <fully-bound>)]..."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and (#$assertionAssertBy ?ASSERTION #$Guest)\n           (#$assertionAssertTime ?ASSERTION ?TIME)\n           (#$greaterThanOrEqualTo ?TIME 19000101)\n           (#$lessThan ?TIME 20000101)") });
        $list178 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")));
        $sym179$CONTEXTUALIZED_ASENT_ASENT = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
        $sym180$_ = SubLObjectFactory.makeSymbol("<");
        $sym181$ASSERTION_ASSERTED_BY_ASENT_ = SubLObjectFactory.makeSymbol("ASSERTION-ASSERTED-BY-ASENT?");
        $sym182$ASSERTION_ASSERT_TIME_ASENT_ = SubLObjectFactory.makeSymbol("ASSERTION-ASSERT-TIME-ASENT?");
        $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT = SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?");
        $kw184$CYCLIST = SubLObjectFactory.makeKeyword("CYCLIST");
        $kw185$ASSERTION_VAR = SubLObjectFactory.makeKeyword("ASSERTION-VAR");
        $kw186$ASSERT_TIME_ARG2 = SubLObjectFactory.makeKeyword("ASSERT-TIME-ARG2");
        $kw187$TIME_COMPARISON_ASENTS = SubLObjectFactory.makeKeyword("TIME-COMPARISON-ASENTS");
        $kw188$ASENTS = SubLObjectFactory.makeKeyword("ASENTS");
        $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T = SubLObjectFactory.makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM");
    }
}

/*

	Total time: 1652 ms
	
*/