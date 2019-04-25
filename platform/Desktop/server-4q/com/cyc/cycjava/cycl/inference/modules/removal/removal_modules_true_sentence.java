package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.proof_view_populator;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.proof_view_summary;
import com.cyc.cycjava.cycl.proof_view;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_true_sentence extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence";
    public static final String myFingerPrint = "1b9c37a58217121b1f0178f7d11aa2dbe5705595b1dfc192113c8bfb43328957";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 3186L)
    private static SubLSymbol $default_known_sentence_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 4689L)
    public static SubLSymbol $known_sentence_lookahead_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 11166L)
    private static SubLSymbol $default_check_sentence_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 12761L)
    private static SubLSymbol $default_unknown_sentence_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23784L)
    private static SubLSymbol $default_true_sentence_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 44670L)
    private static SubLSymbol $removal_sentence_justifications_max_justifications_count$;
    private static final SubLObject $const0$unknownSentence;
    private static final SubLSymbol $kw1$OPAQUE;
    private static final SubLSymbol $kw2$QUERY;
    private static final SubLObject $const3$knownSentence;
    private static final SubLSymbol $kw4$KNOWN_SENTENCE_POS_GAF;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$PREFERRED;
    private static final SubLSymbol $kw8$POS;
    private static final SubLSymbol $kw9$DISPREFERRED;
    private static final SubLSymbol $sym10$KNOWN_SENTENCE_POS_GAF_PREFERENCE;
    private static final SubLSymbol $kw11$REMOVAL_KNOWN_SENTENCE_CHECK;
    private static final SubLList $list12;
    private static final SubLFloat $float13$0_1;
    private static final SubLSymbol $kw14$REMOVAL_KNOWN_SENTENCE_POS_GAF;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$COMPLETE;
    private static final SubLSymbol $kw17$INCOMPLETE;
    private static final SubLSymbol $kw18$TRUE;
    private static final SubLSymbol $kw19$NEG;
    private static final SubLSymbol $kw20$REMOVAL_KNOWN_SENTENCE_NEG_GAF;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$FALSE;
    private static final SubLObject $const23$checkSentence;
    private static final SubLSymbol $kw24$CHECK_SENTENCE_SIBLING;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$CHECK_SENTENCE_SIBLING_REQUIRED;
    private static final SubLSymbol $kw28$REMOVAL_CHECK_SENTENCE_CHECK;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$REMOVAL_CHECK_SENTENCE_CHECK_QUERY;
    private static final SubLSymbol $kw31$NEGATIONPREDS;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$REMOVAL_UNKNOWN_SENTENCE_CHECK;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$REMOVAL_UNKNOWN_SENTENCE_POS_GAF;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$REMOVAL_UNKNOWN_SENTENCE_NEG_GAF;
    private static final SubLList $list40;
    private static final SubLObject $const41$unknownSentenceWRTInferenceMode;
    private static final SubLObject $const42$Shallow_CycInferenceMode;
    private static final SubLObject $const43$Minimal_CycInferenceMode;
    private static final SubLObject $const44$Extended_CycInferenceMode;
    private static final SubLInteger $int45$100;
    private static final SubLInteger $int46$1000;
    private static final SubLSymbol $kw47$SHALLOW;
    private static final SubLSymbol $kw48$MINIMAL;
    private static final SubLSymbol $kw49$EXTENDED;
    private static final SubLObject $const50$Maximal_CycInferenceMode;
    private static final SubLSymbol $kw51$MAXIMAL;
    private static final SubLSymbol $kw52$REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK;
    private static final SubLList $list53;
    private static final SubLObject $const54$SpecifiedInferenceModeCluster;
    private static final SubLObject $const55$trueSentence;
    private static final SubLSymbol $kw56$TRUE_SENTENCE_POS_GAF;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$TRUE_SENTENCE_POS_GAF_PREFERENCE;
    private static final SubLSymbol $kw59$REMOVAL_TRUE_SENTENCE_CHECK;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$REMOVAL_TRUE_SENTENCE_POS_GAF;
    private static final SubLList $list62;
    private static final SubLSymbol $kw63$REMOVAL_TRUE_SENTENCE_NEG_GAF;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$REMOVAL_TRUE_SENTENCE_NEG_FALSE;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$IGNORE;
    private static final SubLSymbol $sym70$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED;
    private static final SubLSymbol $sym71$APPEND;
    private static final SubLSymbol $sym72$SENTENCE_FREE_VARIABLES;
    private static final SubLSymbol $sym73$NEGATE;
    private static final SubLObject $const74$implies;
    private static final SubLObject $const75$and;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND;
    private static final SubLSymbol $kw78$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION;
    private static final SubLList $list79;
    private static final SubLObject $const80$memberOfList;
    private static final SubLSymbol $sym81$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED;
    private static final SubLSymbol $sym82$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND;
    private static final SubLSymbol $kw83$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_;
    private static final SubLSymbol $kw86$TRUE_DEF;
    private static final SubLSymbol $sym87$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND;
    private static final SubLSymbol $kw88$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLObject $const89$sentenceJustifications_Simple;
    private static final SubLSymbol $kw90$REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$SKIP;
    private static final SubLSymbol $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY;
    private static final SubLSymbol $kw94$RESULT_UNIQUENESS;
    private static final SubLSymbol $kw95$PROOF;
    private static final SubLSymbol $kw96$CONTINUABLE_;
    private static final SubLSymbol $kw97$MAX_NUMBER;
    private static final SubLSymbol $kw98$COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static final SubLSymbol $kw99$MAX_TIME;
    private static final SubLSymbol $kw100$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw101$ALLOWED_RULES;
    private static final SubLSymbol $kw102$ALLOWED_MODULES;
    private static final SubLSymbol $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS;
    private static final SubLInteger $int104$1024;
    private static final SubLObject $const105$sentenceJustifications_ProofViewS;
    private static final SubLSymbol $kw106$REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS;
    private static final SubLObject $const109$tautologyJustification;
    private static final SubLSymbol $kw110$REMOVAL_TAUTOLOGY_JUSTIFICATION;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw113$BROWSABLE_;
    private static final SubLSymbol $kw114$TAUTOLOGY;
    private static final SubLObject $const115$knownSentenceWithProofView;
    private static final SubLSymbol $kw116$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW;
    private static final SubLObject $const119$CycProofViewFn;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 791L)
    public static SubLObject removal_complete_asentP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_completeness_utilities.inference_complete_asentP(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 890L)
    public static SubLObject make_truth_sentence_support(final SubLObject truth_predicate, final SubLObject sentence) {
        if (truth_predicate.eql(removal_modules_true_sentence.$const0$unknownSentence)) {
            final SubLObject truth_sentence_formula = el_utilities.make_unary_formula(truth_predicate, sentence);
            final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw1$OPAQUE, truth_sentence_formula, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            return support;
        }
        return arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw2$QUERY, sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 1273L)
    public static SubLObject make_truth_sentence_supports(final SubLObject truth_asent) {
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(truth_asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        return (SubLObject)ConsesLow.list(make_known_sentence_support(gaf_sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 1455L)
    public static SubLObject known_sentence_literal_removal_cost(SubLObject asent, SubLObject mt, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER;
        if (removal_modules_true_sentence.NIL != el_utilities.ist_of_atomic_sentence_p(asent)) {
            thread.resetMultipleValues();
            final SubLObject asent_$1 = czer_utilities.unwrap_if_ist_permissive(asent, mt);
            final SubLObject mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            asent = asent_$1;
            mt = mt_$2;
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = inference_utilities.literal_removal_cost(asent, sense, mt, removal_modules_abduction.abductive_modules_not_allowed_spec());
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 2231L)
    public static SubLObject known_sentence_pos_gaf_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)removal_modules_true_sentence.$list6, gaf_sentence)) {
            return (SubLObject)removal_modules_true_sentence.$kw7$PREFERRED;
        }
        final SubLObject lookahead_preference_level = preference_modules.literal_preference_level_wrt_modules(gaf_sentence, (SubLObject)removal_modules_true_sentence.$kw8$POS, bindable_vars, strategic_context);
        if (removal_modules_true_sentence.NIL != preference_modules.preference_level_L(lookahead_preference_level, (SubLObject)removal_modules_true_sentence.$kw9$DISPREFERRED)) {
            return lookahead_preference_level;
        }
        return (SubLObject)removal_modules_true_sentence.$kw7$PREFERRED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 3066L)
    public static SubLObject make_known_sentence_support(final SubLObject sentence) {
        return make_truth_sentence_support(removal_modules_true_sentence.$const3$knownSentence, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 3425L)
    public static SubLObject removal_known_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL != removal_known_sentence_check_query(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) {
            final SubLObject hl_support = make_known_sentence_support(sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 4526L)
    public static SubLObject removal_known_sentence_check_query(final SubLObject sentence, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 4983L)
    public static SubLObject removal_known_sentence_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        SubLObject cost = known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_true_sentence.$kw8$POS);
        if (!cost.isZero()) {
            cost = Numbers.add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        if (removal_modules_true_sentence.NIL != variables.fully_bound_p(asent)) {
            cost = Numbers.min(cost, removal_modules_true_sentence.$default_known_sentence_check_cost$.getDynamicValue(thread));
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 5395L)
    public static SubLObject removal_known_sentence_pos_gaf_iterator(final SubLObject gaf_sentence) {
        return iteration.new_list_iterator(removal_known_sentence_pos_gaf_query(gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 6567L)
    public static SubLObject removal_known_sentence_completeness(final SubLObject gaf_sentence, final SubLObject sense) {
        if (removal_modules_true_sentence.NIL != variables.fully_bound_p(gaf_sentence)) {
            return (SubLObject)removal_modules_true_sentence.$kw16$COMPLETE;
        }
        if (removal_modules_true_sentence.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)removal_modules_true_sentence.$list6, gaf_sentence)) {
            return (SubLObject)removal_modules_true_sentence.$kw16$COMPLETE;
        }
        final SubLObject lookahead_completeness = inference_utilities.literal_removal_completeness(gaf_sentence, sense, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL != inference_datastructures_enumerated_types.completeness_L(lookahead_completeness, (SubLObject)removal_modules_true_sentence.$kw17$INCOMPLETE)) {
            return lookahead_completeness;
        }
        return (SubLObject)removal_modules_true_sentence.$kw16$COMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 7537L)
    public static SubLObject removal_known_sentence_pos_gaf_query(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, (SubLObject)removal_modules_true_sentence.$kw18$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 7698L)
    public static SubLObject removal_known_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        SubLObject cost = known_sentence_literal_removal_cost(gaf_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_true_sentence.$kw19$NEG);
        if (!cost.isZero()) {
            cost = Numbers.add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        cost = Numbers.min(cost, removal_modules_true_sentence.$default_known_sentence_check_cost$.getDynamicValue(thread));
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 8280L)
    public static SubLObject removal_known_sentence_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL != removal_known_sentence_neg_gaf_query(gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) {
            final SubLObject hl_support = make_known_sentence_support(negated_gaf_sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 9309L)
    public static SubLObject removal_known_sentence_neg_gaf_query(final SubLObject asent, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_removal_query(asent, mt, (SubLObject)removal_modules_true_sentence.$kw22$FALSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 9991L)
    public static SubLObject check_sentence_sibling_required(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_true_sentence.NIL == el_utilities.el_formula_with_operator_p(asent, removal_modules_true_sentence.$const23$checkSentence)) {
            final SubLObject tactic = inference_worker.currently_considered_tactic();
            if (removal_modules_true_sentence.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
                final SubLObject join_ordered_link = inference_worker_join_ordered.join_ordered_tactic_link(tactic);
                final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
                final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                final SubLObject asent_wrt_supported = bindings.apply_bindings(focal_variable_map, asent);
                final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
                final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
                if (removal_modules_true_sentence.NIL != list_utilities.simple_tree_find(removal_modules_true_sentence.$const23$checkSentence, supported_query)) {
                    SubLObject cdolist_list_var = supported_query;
                    SubLObject contextualized_clause = (SubLObject)removal_modules_true_sentence.NIL;
                    contextualized_clause = cdolist_list_var.first();
                    while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                        SubLObject sibling_sense = (SubLObject)removal_modules_true_sentence.$kw19$NEG;
                        SubLObject index_var = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER;
                        SubLObject cdolist_list_var_$3 = clauses.neg_lits(contextualized_clause);
                        SubLObject contextualized_asent = (SubLObject)removal_modules_true_sentence.NIL;
                        contextualized_asent = cdolist_list_var_$3.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var_$3) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject sibling_mt = (SubLObject)removal_modules_true_sentence.NIL;
                            SubLObject sibling_asent = (SubLObject)removal_modules_true_sentence.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_true_sentence.$list26);
                            sibling_mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_true_sentence.$list26);
                            sibling_asent = current.first();
                            current = current.rest();
                            if (removal_modules_true_sentence.NIL == current) {
                                if (removal_modules_true_sentence.$kw8$POS == sibling_sense && removal_modules_true_sentence.NIL != el_utilities.el_formula_with_operator_p(sibling_asent, removal_modules_true_sentence.$const23$checkSentence) && asent_wrt_supported.equal(cycl_utilities.el_formula_arg1(sibling_asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) && removal_modules_true_sentence.NIL != hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), sibling_mt)) {
                                    return sibling_asent;
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_true_sentence.$list26);
                            }
                            index_var = Numbers.add(index_var, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            contextualized_asent = cdolist_list_var_$3.first();
                        }
                        sibling_sense = (SubLObject)removal_modules_true_sentence.$kw8$POS;
                        index_var = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER;
                        SubLObject cdolist_list_var_$4 = clauses.pos_lits(contextualized_clause);
                        contextualized_asent = (SubLObject)removal_modules_true_sentence.NIL;
                        contextualized_asent = cdolist_list_var_$4.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var_$4) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_asent;
                            SubLObject sibling_mt = (SubLObject)removal_modules_true_sentence.NIL;
                            SubLObject sibling_asent = (SubLObject)removal_modules_true_sentence.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_true_sentence.$list26);
                            sibling_mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_true_sentence.$list26);
                            sibling_asent = current.first();
                            current = current.rest();
                            if (removal_modules_true_sentence.NIL == current) {
                                if (removal_modules_true_sentence.$kw8$POS == sibling_sense && removal_modules_true_sentence.NIL != el_utilities.el_formula_with_operator_p(sibling_asent, removal_modules_true_sentence.$const23$checkSentence) && asent_wrt_supported.equal(cycl_utilities.el_formula_arg1(sibling_asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) && removal_modules_true_sentence.NIL != hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), sibling_mt)) {
                                    return sibling_asent;
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_true_sentence.$list26);
                            }
                            index_var = Numbers.add(index_var, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            contextualized_asent = cdolist_list_var_$4.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        contextualized_clause = cdolist_list_var.first();
                    }
                }
            }
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 12151L)
    public static SubLObject removal_check_sentence_check_query(final SubLObject sentence, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_known_sentence_recursive_query(sentence, mt, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 12635L)
    public static SubLObject make_unknown_sentence_support(final SubLObject sentence) {
        return make_truth_sentence_support(removal_modules_true_sentence.$const0$unknownSentence, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 13065L)
    public static SubLObject removal_unknown_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_known_sentence_check_query(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sense == removal_modules_true_sentence.$kw8$POS && removal_modules_true_sentence.NIL == results && removal_modules_true_sentence.NIL != validP) {
            final SubLObject hl_support = make_unknown_sentence_support(sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        if (sense == removal_modules_true_sentence.$kw19$NEG && removal_modules_true_sentence.NIL != results) {
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw2$QUERY, el_utilities.make_unary_formula(removal_modules_true_sentence.$const3$knownSentence, cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED)), (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject negation_preds_support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw31$NEGATIONPREDS, (SubLObject)removal_modules_true_sentence.$list32, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.NIL, (SubLObject)ConsesLow.list(negation_preds_support));
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 15263L)
    public static SubLObject removal_unknown_sentence_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.min(removal_modules_true_sentence.$default_unknown_sentence_check_cost$.getDynamicValue(thread), removal_known_sentence_pos_gaf_cost(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 15668L)
    public static SubLObject removal_unknown_sentence_pos_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_known_sentence_pos_gaf_query(gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_true_sentence.NIL == results && removal_modules_true_sentence.NIL != validP) {
            final SubLObject hl_support = make_unknown_sentence_support(gaf_sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 16668L)
    public static SubLObject removal_unknown_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.min(removal_modules_true_sentence.$default_unknown_sentence_check_cost$.getDynamicValue(thread), removal_known_sentence_neg_gaf_cost(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 17073L)
    public static SubLObject removal_unknown_sentence_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL == removal_known_sentence_neg_gaf_query(gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) {
            final SubLObject hl_support = make_unknown_sentence_support(negated_gaf_sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 20387L)
    public static SubLObject make_unknown_sentence_wrt_inference_mode_support(final SubLObject sentence) {
        return make_truth_sentence_support(removal_modules_true_sentence.$const41$unknownSentenceWRTInferenceMode, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 20548L)
    public static SubLObject removal_unknown_sentence_wrt_inference_mode_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (mode.eql(removal_modules_true_sentence.$const42$Shallow_CycInferenceMode)) {
            return Numbers.multiply((SubLObject)removal_modules_true_sentence.ONE_INTEGER, removal_modules_true_sentence.$default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        if (mode.eql(removal_modules_true_sentence.$const43$Minimal_CycInferenceMode)) {
            return Numbers.multiply((SubLObject)removal_modules_true_sentence.TEN_INTEGER, removal_modules_true_sentence.$default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        if (mode.eql(removal_modules_true_sentence.$const44$Extended_CycInferenceMode)) {
            return Numbers.multiply((SubLObject)removal_modules_true_sentence.$int45$100, removal_modules_true_sentence.$default_unknown_sentence_check_cost$.getDynamicValue(thread));
        }
        return Numbers.multiply((SubLObject)removal_modules_true_sentence.$int46$1000, removal_modules_true_sentence.$default_unknown_sentence_check_cost$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 21304L)
    public static SubLObject removal_unknown_sentence_wrt_inference_mode_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject _prev_bind_0 = inference_trampolines.$recursive_query_override_properties$.currentBinding(thread);
        try {
            inference_trampolines.$recursive_query_override_properties$.bind((SubLObject)(mode.eql(removal_modules_true_sentence.$const42$Shallow_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode((SubLObject)removal_modules_true_sentence.$kw47$SHALLOW) : (mode.eql(removal_modules_true_sentence.$const43$Minimal_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode((SubLObject)removal_modules_true_sentence.$kw48$MINIMAL) : (mode.eql(removal_modules_true_sentence.$const44$Extended_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode((SubLObject)removal_modules_true_sentence.$kw49$EXTENDED) : (mode.eql(removal_modules_true_sentence.$const50$Maximal_CycInferenceMode) ? inference_parameters.query_properties_for_inference_mode((SubLObject)removal_modules_true_sentence.$kw51$MAXIMAL) : removal_modules_true_sentence.NIL)))), thread);
            final SubLObject sentence = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject results = removal_known_sentence_check_query(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_true_sentence.NIL == results && removal_modules_true_sentence.NIL != validP) {
                final SubLObject hl_support = make_unknown_sentence_support(sentence);
                backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            }
        }
        finally {
            inference_trampolines.$recursive_query_override_properties$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 22968L)
    public static SubLObject inference_mode_term_p(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, removal_modules_true_sentence.$const54$SpecifiedInferenceModeCluster);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23485L)
    public static SubLObject true_sentence_pos_gaf_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return known_sentence_pos_gaf_preference(asent, bindable_vars, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23666L)
    public static SubLObject make_true_sentence_support(final SubLObject sentence) {
        return make_truth_sentence_support(removal_modules_true_sentence.$const55$trueSentence, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 23984L)
    public static SubLObject removal_true_sentence_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL != removal_true_sentence_check_query(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) {
            final SubLObject hl_support = make_true_sentence_support(sentence);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 25167L)
    public static SubLObject removal_true_sentence_check_query(final SubLObject sentence, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_true_sentence_recursive_query(sentence, mt, (SubLObject)removal_modules_true_sentence.ONE_INTEGER, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 25328L)
    public static SubLObject removal_true_sentence_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        return removal_known_sentence_pos_gaf_cost(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 25657L)
    public static SubLObject removal_true_sentence_pos_gaf_iterator(final SubLObject gaf_sentence) {
        return iteration.new_list_iterator(removal_known_sentence_pos_gaf_query(gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 26873L)
    public static SubLObject removal_true_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        return removal_known_sentence_neg_gaf_cost(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 27209L)
    public static SubLObject removal_true_sentence_neg_gaf_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLObject negated_gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject gaf_sentence = cycl_utilities.sentence_arg1(negated_gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject results = removal_known_sentence_neg_gaf_query(gaf_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = (SubLObject)removal_modules_true_sentence.NIL;
            v_bindings = cdolist_list_var.first();
            while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                final SubLObject substituted_gaf_sentence = bindings.subst_bindings(v_bindings, gaf_sentence);
                final SubLObject hl_support = make_true_sentence_support(cycl_utilities.negate(substituted_gaf_sentence));
                backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 29708L)
    public static SubLObject removal_true_sentence_universal_disjunction_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (removal_modules_true_sentence.NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        subsentence = inference_czer.inference_el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt(), (SubLObject)removal_modules_true_sentence.T);
        if (removal_modules_true_sentence.NIL == el_utilities.formula_with_sequence_varP(subsentence) && removal_modules_true_sentence.NIL != el_utilities.el_disjunction_p(subsentence) && removal_modules_true_sentence.NIL == el_utilities.formula_with_sequence_varP(subsentence)) {
            final SubLObject disjunction = subsentence;
            SubLObject literal_disjunct_count = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER;
            SubLObject found_a_non_literalP = (SubLObject)removal_modules_true_sentence.NIL;
            final SubLObject args = cycl_utilities.formula_args(disjunction, (SubLObject)removal_modules_true_sentence.$kw69$IGNORE);
            SubLObject rest;
            SubLObject disjunct;
            for (rest = (SubLObject)removal_modules_true_sentence.NIL, rest = args; removal_modules_true_sentence.NIL == found_a_non_literalP && removal_modules_true_sentence.NIL != rest; rest = rest.rest()) {
                disjunct = rest.first();
                if (removal_modules_true_sentence.NIL != cycl_grammar.cycl_literal_p(disjunct)) {
                    literal_disjunct_count = Numbers.add(literal_disjunct_count, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
                }
                else {
                    found_a_non_literalP = (SubLObject)removal_modules_true_sentence.T;
                }
            }
            if (removal_modules_true_sentence.NIL == found_a_non_literalP && literal_disjunct_count.numGE((SubLObject)removal_modules_true_sentence.TWO_INTEGER)) {
                return (SubLObject)removal_modules_true_sentence.T;
            }
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 31000L)
    public static SubLObject removal_true_sentence_universal_disjunction_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (removal_modules_true_sentence.NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject disjunction = clausifier.el_dnf(subsentence, mt_relevance_macros.current_mt_relevance_mt());
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(disjunction, (SubLObject)removal_modules_true_sentence.$kw69$IGNORE);
        SubLObject consequent_disjunct = (SubLObject)removal_modules_true_sentence.NIL;
        consequent_disjunct = cdolist_list_var.first();
        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
            final SubLObject antecedent_disjuncts = Sequences.remove(consequent_disjunct, cycl_utilities.formula_args(disjunction, (SubLObject)removal_modules_true_sentence.UNPROVIDED), (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject consequent_vars = el_utilities.sentence_free_variables(consequent_disjunct, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject antecedent_vars = Functions.apply(Symbols.symbol_function((SubLObject)removal_modules_true_sentence.$sym71$APPEND), Mapping.mapcar((SubLObject)removal_modules_true_sentence.$sym72$SENTENCE_FREE_VARIABLES, antecedent_disjuncts));
            SubLObject cdolist_list_var_$5;
            final SubLObject vars_to_quantify = cdolist_list_var_$5 = conses_high.set_difference(consequent_vars, antecedent_vars, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            SubLObject var = (SubLObject)removal_modules_true_sentence.NIL;
            var = cdolist_list_var_$5.first();
            while (removal_modules_true_sentence.NIL != cdolist_list_var_$5) {
                consequent_disjunct = el_utilities.make_universal(var, consequent_disjunct);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                var = cdolist_list_var_$5.first();
            }
            final SubLObject antecedent_negated_disjuncts = Mapping.mapcar((SubLObject)removal_modules_true_sentence.$sym73$NEGATE, antecedent_disjuncts);
            final SubLObject recursive_sentence = (SubLObject)ConsesLow.list(removal_modules_true_sentence.$const74$implies, reader.bq_cons(removal_modules_true_sentence.$const75$and, ConsesLow.append(antecedent_negated_disjuncts, (SubLObject)removal_modules_true_sentence.NIL)), consequent_disjunct);
            thread.resetMultipleValues();
            final SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, (SubLObject)removal_modules_true_sentence.$list76);
            final SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_true_sentence.NIL == inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) && removal_modules_true_sentence.NIL != results) {
                final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw2$QUERY, recursive_sentence, mt, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                backward.removal_add_node(support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            consequent_disjunct = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 33959L)
    public static SubLObject removal_true_sentence_member_of_list_implication_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (removal_modules_true_sentence.NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        if (removal_modules_true_sentence.NIL != el_utilities.el_implication_p(subsentence)) {
            subsentence = cycl_utilities.formula_arg1(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            if (cycl_utilities.formula_arg0(subsentence).eql(removal_modules_true_sentence.$const80$memberOfList) && removal_modules_true_sentence.NIL != cycl_grammar.el_variable_p(cycl_utilities.formula_arg1(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) && removal_modules_true_sentence.NIL != el_utilities.el_list_p(cycl_utilities.formula_arg2(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED))) {
                return (SubLObject)removal_modules_true_sentence.T;
            }
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 34930L)
    public static SubLObject removal_true_sentence_member_of_list_implication_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject el_list = (SubLObject)removal_modules_true_sentence.NIL;
        SubLObject el_var = (SubLObject)removal_modules_true_sentence.NIL;
        SubLObject subquery = (SubLObject)removal_modules_true_sentence.NIL;
        SubLObject recursive_sentences = (SubLObject)removal_modules_true_sentence.NIL;
        thread.resetMultipleValues();
        final SubLObject truesentence = el_utilities.unmake_unary_formula(asent);
        SubLObject subsentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (removal_modules_true_sentence.NIL != el_utilities.el_universal_p(subsentence)) {
            subsentence = el_utilities.quantified_sub_sentence(subsentence);
        }
        if (removal_modules_true_sentence.NIL != el_utilities.el_implication_p(subsentence)) {
            subquery = cycl_utilities.formula_arg2(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            subsentence = cycl_utilities.formula_arg1(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            if (cycl_utilities.formula_arg0(subsentence).eql(removal_modules_true_sentence.$const80$memberOfList)) {
                el_var = cycl_utilities.formula_arg1(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                el_list = cycl_utilities.formula_arg2(subsentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = el_utilities.el_list_items(el_list);
        SubLObject el_term = (SubLObject)removal_modules_true_sentence.NIL;
        el_term = cdolist_list_var.first();
        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
            final SubLObject recursive_sentence = bindings.apply_bindings(bindings.make_variable_bindings((SubLObject)ConsesLow.list(el_var), (SubLObject)ConsesLow.list(el_term)), subquery);
            thread.resetMultipleValues();
            final SubLObject results = ask_utilities.inference_recursive_query(recursive_sentence, mt, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_true_sentence.NIL != inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) || removal_modules_true_sentence.NIL == results) {
                return (SubLObject)removal_modules_true_sentence.NIL;
            }
            recursive_sentences = (SubLObject)ConsesLow.cons(recursive_sentence, recursive_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            el_term = cdolist_list_var.first();
        }
        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw2$QUERY, el_utilities.make_conjunction(recursive_sentences), mt, (SubLObject)removal_modules_true_sentence.UNPROVIDED), (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 37152L)
    public static SubLObject inference_enumerable_universal_implication_sentenceP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject universal_el_vars = destructure_universal_implication(sentence);
        SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_true_sentence.NIL != antecedent && removal_modules_true_sentence.NIL != consequent) {
            final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
            antecedent = possibly_canonicalize_sentence_wrt_universal_el_vars(antecedent, universal_el_vars);
            return inference_at_least_backchain_enumerable_sentenceP(antecedent, mt);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 37624L)
    public static SubLObject destructure_universal_implication(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject universal_el_vars = destructure_universal_implication_recursive(sentence, (SubLObject)removal_modules_true_sentence.NIL);
        final SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(Sequences.nreverse(universal_el_vars), antecedent, consequent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 37922L)
    public static SubLObject destructure_universal_implication_recursive(final SubLObject sentence, final SubLObject universal_el_vars) {
        if (removal_modules_true_sentence.NIL != el_utilities.el_implication_p(sentence)) {
            final SubLObject antecedent = cycl_utilities.formula_arg1(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject consequent = cycl_utilities.formula_arg2(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            return Values.values(universal_el_vars, antecedent, consequent);
        }
        if (removal_modules_true_sentence.NIL != el_utilities.el_universal_p(sentence)) {
            final SubLObject universal_el_var = cycl_utilities.formula_arg1(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject subsentence = cycl_utilities.formula_arg2(sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            return destructure_universal_implication_recursive(subsentence, (SubLObject)ConsesLow.cons(universal_el_var, universal_el_vars));
        }
        return Values.values((SubLObject)removal_modules_true_sentence.NIL, (SubLObject)removal_modules_true_sentence.NIL, (SubLObject)removal_modules_true_sentence.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 38497L)
    public static SubLObject removal_true_sentence_enumerable_universal_implication_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject universal_implication = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject universal_el_vars = destructure_universal_implication(universal_implication);
        final SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject antecedent_query_properties = determine_enumeration_query_properties(antecedent, mt);
        final SubLObject consequent_query_properties = determine_decision_query_properties(consequent, mt);
        SubLObject cdolist_list_var;
        final SubLObject enumeration_cases = cdolist_list_var = ask_utilities.inference_recursive_query_unique_bindings(antecedent, mt, antecedent_query_properties);
        SubLObject case_bindings = (SubLObject)removal_modules_true_sentence.NIL;
        case_bindings = cdolist_list_var.first();
        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
            final SubLObject case_consequent = bindings.apply_bindings(case_bindings, consequent);
            if (removal_modules_true_sentence.NIL == ask_utilities.inference_recursive_query_unique_bindings(case_consequent, mt, consequent_query_properties)) {
                return (SubLObject)removal_modules_true_sentence.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            case_bindings = cdolist_list_var.first();
        }
        final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw1$OPAQUE, asent, mt, (SubLObject)removal_modules_true_sentence.$kw86$TRUE_DEF);
        backward.removal_add_node(support, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 39565L)
    public static SubLObject determine_enumeration_query_properties(final SubLObject sentence, final SubLObject mt) {
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw88$ALLOW_INDETERMINATE_RESULTS_, (SubLObject)removal_modules_true_sentence.NIL);
        return query_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 39840L)
    public static SubLObject determine_decision_query_properties(final SubLObject sentence, final SubLObject mt) {
        return determine_enumeration_query_properties(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 39979L)
    public static SubLObject inference_at_least_backchain_enumerable_sentenceP(final SubLObject sentence, final SubLObject mt) {
        if (removal_modules_true_sentence.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return inference_at_least_backchain_enumerable_asentP(sentence, mt);
        }
        if (removal_modules_true_sentence.NIL != el_utilities.el_conjunction_p(sentence) && removal_modules_true_sentence.NIL != inference_at_least_backchain_enumerable_conjunctionP(sentence, mt)) {
            return (SubLObject)removal_modules_true_sentence.T;
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 40507L)
    public static SubLObject inference_at_least_backchain_enumerable_asentP(final SubLObject asent, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_true_sentence.$kw16$COMPLETE == inference_utilities.literal_removal_completeness(asent, (SubLObject)removal_modules_true_sentence.$kw8$POS, mt) || removal_modules_true_sentence.NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP(asent, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 40726L)
    public static SubLObject inference_at_least_backchain_enumerable_conjunctionP(final SubLObject el_conjunction, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject conjuncts = cdolist_list_var = cycl_utilities.sentence_args(el_conjunction, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        SubLObject conjunct = (SubLObject)removal_modules_true_sentence.NIL;
        conjunct = cdolist_list_var.first();
        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
            if (removal_modules_true_sentence.NIL != inference_at_least_backchain_enumerable_sentenceP(conjunct, mt)) {
                final SubLObject other_conjuncts = Sequences.remove(conjunct, conjuncts, Symbols.symbol_function((SubLObject)removal_modules_true_sentence.EQL), (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                final SubLObject bound_variables = variables.gather_hl_variables(conjunct);
                SubLObject non_complete_witness = (SubLObject)removal_modules_true_sentence.NIL;
                if (removal_modules_true_sentence.NIL == non_complete_witness) {
                    SubLObject csome_list_var = other_conjuncts;
                    SubLObject other_conjunct = (SubLObject)removal_modules_true_sentence.NIL;
                    other_conjunct = csome_list_var.first();
                    while (removal_modules_true_sentence.NIL == non_complete_witness && removal_modules_true_sentence.NIL != csome_list_var) {
                        if (removal_modules_true_sentence.NIL == inference_at_least_backchain_enumerable_sentenceP(other_conjunct, mt) && removal_modules_true_sentence.NIL == fully_bound_assuming_bindings_p(other_conjunct, bound_variables)) {
                            non_complete_witness = other_conjunct;
                        }
                        csome_list_var = csome_list_var.rest();
                        other_conjunct = csome_list_var.first();
                    }
                }
                if (removal_modules_true_sentence.NIL == non_complete_witness) {
                    return (SubLObject)removal_modules_true_sentence.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 41468L)
    public static SubLObject possibly_canonicalize_sentence_wrt_universal_el_vars(SubLObject sentence, final SubLObject universal_el_vars) {
        final SubLObject variable_map = new_el_variable_to_non_base_hl_variable_map(universal_el_vars);
        if (removal_modules_true_sentence.NIL != variable_map) {
            sentence = bindings.apply_bindings(variable_map, sentence);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 41785L)
    public static SubLObject new_el_variable_to_non_base_hl_variable_map(final SubLObject el_vars) {
        SubLObject v_bindings = (SubLObject)removal_modules_true_sentence.NIL;
        SubLObject list_var = (SubLObject)removal_modules_true_sentence.NIL;
        SubLObject el_var = (SubLObject)removal_modules_true_sentence.NIL;
        SubLObject index = (SubLObject)removal_modules_true_sentence.NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (index = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER; removal_modules_true_sentence.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), index = Numbers.add((SubLObject)removal_modules_true_sentence.ONE_INTEGER, index)) {
            final SubLObject hl_var = variables.get_variable(index);
            v_bindings = bindings.add_variable_binding(el_var, hl_var, v_bindings);
        }
        return unification.non_base_variable_transform(Sequences.nreverse(v_bindings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 42097L)
    public static SubLObject fully_bound_assuming_bindings_p(final SubLObject formula, final SubLObject bound_vars) {
        final SubLObject formula_vars = variables.gather_hl_variables(formula);
        return conses_high.subsetp(formula_vars, bound_vars, Symbols.symbol_function((SubLObject)removal_modules_true_sentence.EQL), (SubLObject)removal_modules_true_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 43263L)
    public static SubLObject removal_sentence_justifications_simple_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_sentence_justifications_recursive_query(query_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject justification_sentences = (SubLObject)removal_modules_true_sentence.NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (removal_modules_true_sentence.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
            final SubLObject idx_$6 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                final SubLObject backwardP_var = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject original_supports;
                SubLObject supports;
                SubLObject support;
                SubLObject support_sentence;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_true_sentence.NIL, v_iteration = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER)) {
                    id = ((removal_modules_true_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER) : v_iteration);
                    this_answer = Vectors.aref(vector_var, id);
                    if (removal_modules_true_sentence.NIL == id_index.id_index_tombstone_p(this_answer) || removal_modules_true_sentence.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                        if (removal_modules_true_sentence.NIL != id_index.id_index_tombstone_p(this_answer)) {
                            this_answer = (SubLObject)removal_modules_true_sentence.$kw92$SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = (SubLObject)removal_modules_true_sentence.NIL;
                        this_justification = cdolist_list_var.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                            original_supports = inference_datastructures_inference.inference_answer_justification_supports(this_justification);
                            supports = conses_high.copy_list(original_supports);
                            while (removal_modules_true_sentence.NIL != supports) {
                                support = supports.first();
                                supports = supports.rest();
                                support_sentence = ((removal_modules_true_sentence.NIL != assertion_handles.assertion_p(support)) ? uncanonicalizer.assertion_el_formula(support) : arguments.support_sentence(support));
                                if (removal_modules_true_sentence.NIL == assertion_handles.assertion_p(support) && removal_modules_true_sentence.NIL != czer_utilities.equals_elP(query_sentence, support_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) {
                                    supports = ConsesLow.append(arguments.support_justification(support), supports);
                                }
                                else {
                                    justification_sentences = (SubLObject)ConsesLow.cons(support_sentence, justification_sentences);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            final SubLObject idx_$7 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                SubLObject id2 = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject this_answer2 = (SubLObject)removal_modules_true_sentence.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = (SubLObject)removal_modules_true_sentence.NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var2) {
                            final SubLObject original_supports2 = inference_datastructures_inference.inference_answer_justification_supports(this_justification2);
                            SubLObject supports2 = conses_high.copy_list(original_supports2);
                            while (removal_modules_true_sentence.NIL != supports2) {
                                final SubLObject support2 = supports2.first();
                                supports2 = supports2.rest();
                                final SubLObject support_sentence2 = (removal_modules_true_sentence.NIL != assertion_handles.assertion_p(support2)) ? uncanonicalizer.assertion_el_formula(support2) : arguments.support_sentence(support2);
                                if (removal_modules_true_sentence.NIL == assertion_handles.assertion_p(support2) && removal_modules_true_sentence.NIL != czer_utilities.equals_elP(query_sentence, support_sentence2, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED)) {
                                    supports2 = ConsesLow.append(arguments.support_justification(support2), supports2);
                                }
                                else {
                                    justification_sentences = (SubLObject)ConsesLow.cons(support_sentence2, justification_sentences);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (removal_modules_true_sentence.NIL != justification_sentences) {
            final SubLObject answer_sentence = (SubLObject)ConsesLow.list(removal_modules_true_sentence.$const89$sentenceJustifications_Simple, query_sentence, el_utilities.make_el_extensional_set(justification_sentences));
            final SubLObject v_bindings = unification.unify(asent, answer_sentence, (SubLObject)removal_modules_true_sentence.T, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw1$OPAQUE, answer_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 44816L)
    public static SubLObject removal_sentence_justifications_recursive_query_internal(final SubLObject sentence, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = inference_macros.current_controlling_inference();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw94$RESULT_UNIQUENESS, (SubLObject)removal_modules_true_sentence.$kw95$PROOF);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw96$CONTINUABLE_, (SubLObject)removal_modules_true_sentence.T);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw97$MAX_NUMBER, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw98$COMPUTE_ANSWER_JUSTIFICATIONS_, (SubLObject)removal_modules_true_sentence.T);
        if (removal_modules_true_sentence.NIL != inference) {
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw99$MAX_TIME, inference_utilities.inference_property_lookup(inference, (SubLObject)removal_modules_true_sentence.$kw99$MAX_TIME, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw100$MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup(inference, (SubLObject)removal_modules_true_sentence.$kw100$MAX_TRANSFORMATION_DEPTH, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw101$ALLOWED_RULES, inference_datastructures_inference.inference_allowed_rules_list(inference));
            query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw102$ALLOWED_MODULES, inference_datastructures_inference.inference_allowed_modules(inference));
        }
        else {
            query_properties = inference_datastructures_enumerated_types.merge_query_properties(inference_utilities.current_query_properties(), query_properties);
        }
        SubLObject continue_count = (SubLObject)removal_modules_true_sentence.ONE_INTEGER;
        thread.resetMultipleValues();
        SubLObject results = ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject recursive_inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        while (continue_count.numL(removal_modules_true_sentence.$removal_sentence_justifications_max_justifications_count$.getDynamicValue(thread)) && removal_modules_true_sentence.NIL == removal_sentence_justifications_inference_has_good_proofP(recursive_inference) && removal_modules_true_sentence.NIL != inference_datastructures_inference.continuable_inference_p(recursive_inference)) {
            continue_count = Numbers.add(continue_count, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
            thread.resetMultipleValues();
            final SubLObject results_$8 = inference_kernel.continue_inference(recursive_inference, query_properties);
            final SubLObject halt_reason_$9 = thread.secondMultipleValue();
            final SubLObject inference_$10 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            results = results_$8;
            halt_reason = halt_reason_$9;
            inference = inference_$10;
        }
        return Values.values(results, halt_reason, recursive_inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 44816L)
    public static SubLObject removal_sentence_justifications_recursive_query(final SubLObject sentence, SubLObject mt) {
        if (mt == removal_modules_true_sentence.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_true_sentence.NIL;
        if (removal_modules_true_sentence.NIL == v_memoization_state) {
            return removal_sentence_justifications_recursive_query_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_true_sentence.$sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_true_sentence.$sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, (SubLObject)removal_modules_true_sentence.TWO_INTEGER, (SubLObject)removal_modules_true_sentence.NIL, (SubLObject)removal_modules_true_sentence.EQUAL, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_true_sentence.$sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_modules_true_sentence.NIL;
            collision = cdolist_list_var.first();
            while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (removal_modules_true_sentence.NIL != cached_args && removal_modules_true_sentence.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_sentence_justifications_recursive_query_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 46699L)
    public static SubLObject removal_sentence_justifications_inference_has_good_proofP(final SubLObject inference) {
        SubLObject good_proof_foundP = (SubLObject)removal_modules_true_sentence.NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (removal_modules_true_sentence.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
            final SubLObject idx_$11 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_dense_objects_empty_p(idx_$11, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$11);
                final SubLObject backwardP_var = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject cdolist_list_var_$12;
                SubLObject this_proof;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_true_sentence.NIL, v_iteration = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER)) {
                    id = ((removal_modules_true_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER) : v_iteration);
                    this_answer = Vectors.aref(vector_var, id);
                    if (removal_modules_true_sentence.NIL == id_index.id_index_tombstone_p(this_answer) || removal_modules_true_sentence.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                        if (removal_modules_true_sentence.NIL != id_index.id_index_tombstone_p(this_answer)) {
                            this_answer = (SubLObject)removal_modules_true_sentence.$kw92$SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = (SubLObject)removal_modules_true_sentence.NIL;
                        this_justification = cdolist_list_var.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                            cdolist_list_var_$12 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
                            this_proof = (SubLObject)removal_modules_true_sentence.NIL;
                            this_proof = cdolist_list_var_$12.first();
                            while (removal_modules_true_sentence.NIL != cdolist_list_var_$12) {
                                if (removal_modules_true_sentence.NIL == good_proof_foundP) {
                                    good_proof_foundP = list_utilities.sublisp_boolean(removal_sentence_justifications_get_proof_summary_items(this_proof, this_answer));
                                }
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                this_proof = cdolist_list_var_$12.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            final SubLObject idx_$12 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_sparse_objects_empty_p(idx_$12)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$12);
                SubLObject id2 = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject this_answer2 = (SubLObject)removal_modules_true_sentence.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = (SubLObject)removal_modules_true_sentence.NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$13 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
                            SubLObject this_proof2 = (SubLObject)removal_modules_true_sentence.NIL;
                            this_proof2 = cdolist_list_var_$13.first();
                            while (removal_modules_true_sentence.NIL != cdolist_list_var_$13) {
                                if (removal_modules_true_sentence.NIL == good_proof_foundP) {
                                    good_proof_foundP = list_utilities.sublisp_boolean(removal_sentence_justifications_get_proof_summary_items(this_proof2, this_answer2));
                                }
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                this_proof2 = cdolist_list_var_$13.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return good_proof_foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 47200L)
    public static SubLObject removal_sentence_justifications_get_proof_summary_items_internal(final SubLObject proof, final SubLObject v_answer) {
        return proof_view_summary.proof_view_get_proof_summary_items(proof_view.construct_inference_proof_view(proof, v_answer, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 47200L)
    public static SubLObject removal_sentence_justifications_get_proof_summary_items(final SubLObject proof, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_true_sentence.NIL;
        if (removal_modules_true_sentence.NIL == v_memoization_state) {
            return removal_sentence_justifications_get_proof_summary_items_internal(proof, v_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_true_sentence.$sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_true_sentence.$sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, (SubLObject)removal_modules_true_sentence.TWO_INTEGER, (SubLObject)removal_modules_true_sentence.$int104$1024, (SubLObject)removal_modules_true_sentence.EQL, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_true_sentence.$sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, v_answer);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_modules_true_sentence.NIL;
            collision = cdolist_list_var.first();
            while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (proof.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (removal_modules_true_sentence.NIL != cached_args && removal_modules_true_sentence.NIL == cached_args.rest() && v_answer.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_sentence_justifications_get_proof_summary_items_internal(proof, v_answer)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(proof, v_answer));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 48477L)
    public static SubLObject removal_sentence_justifications_proof_view_summary_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject results = removal_sentence_justifications_recursive_query(query_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject justification_sentences = (SubLObject)removal_modules_true_sentence.NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (removal_modules_true_sentence.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
            final SubLObject idx_$15 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_dense_objects_empty_p(idx_$15, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$15);
                final SubLObject backwardP_var = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject this_answer;
                SubLObject cdolist_list_var;
                SubLObject this_justification;
                SubLObject cdolist_list_var_$16;
                SubLObject this_proof;
                SubLObject raw_items;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_true_sentence.NIL, v_iteration = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER)) {
                    id = ((removal_modules_true_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER) : v_iteration);
                    this_answer = Vectors.aref(vector_var, id);
                    if (removal_modules_true_sentence.NIL == id_index.id_index_tombstone_p(this_answer) || removal_modules_true_sentence.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                        if (removal_modules_true_sentence.NIL != id_index.id_index_tombstone_p(this_answer)) {
                            this_answer = (SubLObject)removal_modules_true_sentence.$kw92$SKIP;
                        }
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(this_answer);
                        this_justification = (SubLObject)removal_modules_true_sentence.NIL;
                        this_justification = cdolist_list_var.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                            cdolist_list_var_$16 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification);
                            this_proof = (SubLObject)removal_modules_true_sentence.NIL;
                            this_proof = cdolist_list_var_$16.first();
                            while (removal_modules_true_sentence.NIL != cdolist_list_var_$16) {
                                if (removal_modules_true_sentence.NIL == justification_sentences) {
                                    raw_items = removal_sentence_justifications_get_proof_summary_items(this_proof, this_answer);
                                    justification_sentences = Mapping.mapcar((SubLObject)removal_modules_true_sentence.$sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, raw_items);
                                }
                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                this_proof = cdolist_list_var_$16.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            this_justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            final SubLObject idx_$16 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_sparse_objects_empty_p(idx_$16)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$16);
                SubLObject id2 = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject this_answer2 = (SubLObject)removal_modules_true_sentence.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        this_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(this_answer2);
                        SubLObject this_justification2 = (SubLObject)removal_modules_true_sentence.NIL;
                        this_justification2 = cdolist_list_var2.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$17 = inference_datastructures_inference.inference_answer_justification_proofs(this_justification2);
                            SubLObject this_proof2 = (SubLObject)removal_modules_true_sentence.NIL;
                            this_proof2 = cdolist_list_var_$17.first();
                            while (removal_modules_true_sentence.NIL != cdolist_list_var_$17) {
                                if (removal_modules_true_sentence.NIL == justification_sentences) {
                                    final SubLObject raw_items2 = removal_sentence_justifications_get_proof_summary_items(this_proof2, this_answer2);
                                    justification_sentences = Mapping.mapcar((SubLObject)removal_modules_true_sentence.$sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS, raw_items2);
                                }
                                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                this_proof2 = cdolist_list_var_$17.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            this_justification2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (removal_modules_true_sentence.NIL != justification_sentences) {
            final SubLObject answer_sentence = (SubLObject)ConsesLow.list(removal_modules_true_sentence.$const105$sentenceJustifications_ProofViewS, query_sentence, el_utilities.make_el_list(justification_sentences, (SubLObject)removal_modules_true_sentence.UNPROVIDED));
            final SubLObject v_bindings = unification.unify(asent, answer_sentence, (SubLObject)removal_modules_true_sentence.T, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw1$OPAQUE, answer_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 50508L)
    public static SubLObject removal_tautology_justification_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject unquoted_query_sentence = czer_main.unquote_quoted_term(query_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject justification_sentence = removal_tautology_justification_recursive_query(unquoted_query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
        thread.resetMultipleValues();
        if (removal_modules_true_sentence.NIL != justification_sentence) {
            final SubLObject answer_sentence = (SubLObject)ConsesLow.list(removal_modules_true_sentence.$const109$tautologyJustification, query_sentence, justification_sentence);
            final SubLObject v_bindings = unification.unify(asent, answer_sentence, (SubLObject)removal_modules_true_sentence.T, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw2$QUERY, answer_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 51162L)
    public static SubLObject removal_tautology_justification_recursive_query(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(sentence, mt);
        SubLObject result = (SubLObject)removal_modules_true_sentence.NIL;
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw112$CONDITIONAL_SENTENCE_, (SubLObject)removal_modules_true_sentence.T);
        query_properties = conses_high.putf(query_properties, (SubLObject)removal_modules_true_sentence.$kw113$BROWSABLE_, (SubLObject)removal_modules_true_sentence.T);
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.inference_recursive_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject recursive_inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_true_sentence.$kw114$TAUTOLOGY == halt_reason) {
            final SubLObject inference_suspend_status = inference_datastructures_inference.inference_suspend_status(recursive_inference);
            result = el_utilities.quotify_cycl_term(variables.uncanonicalize_hl_vars(conses_high.second(conses_high.second(inference_suspend_status).first())));
        }
        if (removal_modules_true_sentence.NIL != inference_datastructures_inference.inference_p(recursive_inference)) {
            inference_datastructures_inference.destroy_inference(recursive_inference);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 52981L)
    public static SubLObject removal_knownsentencewithproofview_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_true_sentence.UNPROVIDED) {
            sense = (SubLObject)removal_modules_true_sentence.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject query_pv_specification = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject query_pv = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)removal_modules_true_sentence.$kw113$BROWSABLE_, (SubLObject)removal_modules_true_sentence.T);
        thread.resetMultipleValues();
        final SubLObject results = ask_utilities.inference_recursive_query_unique_bindings(query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), v_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (removal_modules_true_sentence.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
            final SubLObject idx_$19 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_dense_objects_empty_p(idx_$19, (SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$19);
                final SubLObject backwardP_var = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject v_bindings;
                SubLObject cdolist_list_var;
                SubLObject justification;
                SubLObject cdolist_list_var_$20;
                SubLObject proof;
                SubLObject raw_pv;
                SubLObject pv_bindings;
                SubLObject all_bindings;
                SubLObject answer_sentence;
                SubLObject hl_support;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_true_sentence.NIL, v_iteration = (SubLObject)removal_modules_true_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER)) {
                    id = ((removal_modules_true_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_true_sentence.ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (removal_modules_true_sentence.NIL == id_index.id_index_tombstone_p(v_answer) || removal_modules_true_sentence.NIL == id_index.id_index_skip_tombstones_p((SubLObject)removal_modules_true_sentence.$kw92$SKIP)) {
                        if (removal_modules_true_sentence.NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = (SubLObject)removal_modules_true_sentence.$kw92$SKIP;
                        }
                        v_bindings = variables.canonicalize_default_el_vars(inference_datastructures_inference.inference_answer_bindings(v_answer));
                        cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                        justification = (SubLObject)removal_modules_true_sentence.NIL;
                        justification = cdolist_list_var.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                            cdolist_list_var_$20 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                            proof = (SubLObject)removal_modules_true_sentence.NIL;
                            proof = cdolist_list_var_$20.first();
                            while (removal_modules_true_sentence.NIL != cdolist_list_var_$20) {
                                raw_pv = removal_knownsentencewithproofview_get_cyc_proof_view(proof, v_answer, query_pv_specification);
                                pv_bindings = unification_utilities.term_unify(query_pv, raw_pv, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                                all_bindings = ConsesLow.append(v_bindings, pv_bindings);
                                answer_sentence = bindings.apply_bindings(all_bindings, asent);
                                hl_support = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw1$OPAQUE, answer_sentence, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                                backward.removal_add_node(hl_support, all_bindings, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                proof = cdolist_list_var_$20.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            final SubLObject idx_$20 = idx;
            if (removal_modules_true_sentence.NIL == id_index.id_index_sparse_objects_empty_p(idx_$20)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$20);
                SubLObject id2 = (SubLObject)removal_modules_true_sentence.NIL;
                SubLObject v_answer2 = (SubLObject)removal_modules_true_sentence.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject v_bindings2 = variables.canonicalize_default_el_vars(inference_datastructures_inference.inference_answer_bindings(v_answer2));
                        SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                        SubLObject justification2 = (SubLObject)removal_modules_true_sentence.NIL;
                        justification2 = cdolist_list_var2.first();
                        while (removal_modules_true_sentence.NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$21 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                            SubLObject proof2 = (SubLObject)removal_modules_true_sentence.NIL;
                            proof2 = cdolist_list_var_$21.first();
                            while (removal_modules_true_sentence.NIL != cdolist_list_var_$21) {
                                final SubLObject raw_pv2 = removal_knownsentencewithproofview_get_cyc_proof_view(proof2, v_answer2, query_pv_specification);
                                final SubLObject pv_bindings2 = unification_utilities.term_unify(query_pv, raw_pv2, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                                final SubLObject all_bindings2 = ConsesLow.append(v_bindings2, pv_bindings2);
                                final SubLObject answer_sentence2 = bindings.apply_bindings(all_bindings2, asent);
                                final SubLObject hl_support2 = arguments.make_hl_support((SubLObject)removal_modules_true_sentence.$kw1$OPAQUE, answer_sentence2, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                                backward.removal_add_node(hl_support2, all_bindings2, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                proof2 = cdolist_list_var_$21.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            justification2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 54160L)
    public static SubLObject removal_knownsentencewithproofview_get_cyc_proof_view_internal(final SubLObject proof, final SubLObject v_answer, final SubLObject pv_specification) {
        final SubLObject v_proof_view = proof_view.get_new_empty_proof_view(v_answer, proof);
        proof_view.proof_view_set_parameters_from_specification(v_proof_view, pv_specification);
        proof_view_populator.proof_view_populate(v_proof_view, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        return el_utilities.make_unary_formula(removal_modules_true_sentence.$const119$CycProofViewFn, proof_view.proof_view_get_id(v_proof_view));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-true-sentence.lisp", position = 54160L)
    public static SubLObject removal_knownsentencewithproofview_get_cyc_proof_view(final SubLObject proof, final SubLObject v_answer, final SubLObject pv_specification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)removal_modules_true_sentence.NIL;
        if (removal_modules_true_sentence.NIL == v_memoization_state) {
            return removal_knownsentencewithproofview_get_cyc_proof_view_internal(proof, v_answer, pv_specification);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)removal_modules_true_sentence.$sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (removal_modules_true_sentence.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)removal_modules_true_sentence.$sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, (SubLObject)removal_modules_true_sentence.THREE_INTEGER, (SubLObject)removal_modules_true_sentence.$int104$1024, (SubLObject)removal_modules_true_sentence.EQUAL, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)removal_modules_true_sentence.$sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(proof, v_answer, pv_specification);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)removal_modules_true_sentence.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)removal_modules_true_sentence.NIL;
            collision = cdolist_list_var.first();
            while (removal_modules_true_sentence.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_answer.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (removal_modules_true_sentence.NIL != cached_args && removal_modules_true_sentence.NIL == cached_args.rest() && pv_specification.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_knownsentencewithproofview_get_cyc_proof_view_internal(proof, v_answer, pv_specification)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(proof, v_answer, pv_specification));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_removal_modules_true_sentence_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_complete_asentP", "REMOVAL-COMPLETE-ASENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "make_truth_sentence_support", "MAKE-TRUTH-SENTENCE-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "make_truth_sentence_supports", "MAKE-TRUTH-SENTENCE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "known_sentence_literal_removal_cost", "KNOWN-SENTENCE-LITERAL-REMOVAL-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "known_sentence_pos_gaf_preference", "KNOWN-SENTENCE-POS-GAF-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "make_known_sentence_support", "MAKE-KNOWN-SENTENCE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_check_expand", "REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_check_query", "REMOVAL-KNOWN-SENTENCE-CHECK-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_pos_gaf_cost", "REMOVAL-KNOWN-SENTENCE-POS-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_pos_gaf_iterator", "REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_completeness", "REMOVAL-KNOWN-SENTENCE-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_pos_gaf_query", "REMOVAL-KNOWN-SENTENCE-POS-GAF-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_neg_gaf_cost", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_neg_gaf_expand", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_known_sentence_neg_gaf_query", "REMOVAL-KNOWN-SENTENCE-NEG-GAF-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "check_sentence_sibling_required", "CHECK-SENTENCE-SIBLING-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_check_sentence_check_query", "REMOVAL-CHECK-SENTENCE-CHECK-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "make_unknown_sentence_support", "MAKE-UNKNOWN-SENTENCE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_check_expand", "REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_pos_gaf_cost", "REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_pos_gaf_expand", "REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_neg_gaf_cost", "REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_neg_gaf_expand", "REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "make_unknown_sentence_wrt_inference_mode_support", "MAKE-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_wrt_inference_mode_check_cost", "REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_unknown_sentence_wrt_inference_mode_check_expand", "REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "inference_mode_term_p", "INFERENCE-MODE-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "true_sentence_pos_gaf_preference", "TRUE-SENTENCE-POS-GAF-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "make_true_sentence_support", "MAKE-TRUE-SENTENCE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_check_expand", "REMOVAL-TRUE-SENTENCE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_check_query", "REMOVAL-TRUE-SENTENCE-CHECK-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_pos_gaf_cost", "REMOVAL-TRUE-SENTENCE-POS-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_pos_gaf_iterator", "REMOVAL-TRUE-SENTENCE-POS-GAF-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_neg_gaf_cost", "REMOVAL-TRUE-SENTENCE-NEG-GAF-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_neg_gaf_expand", "REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_universal_disjunction_required", "REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_universal_disjunction_expand", "REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_member_of_list_implication_required", "REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_member_of_list_implication_expand", "REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "inference_enumerable_universal_implication_sentenceP", "INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "destructure_universal_implication", "DESTRUCTURE-UNIVERSAL-IMPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "destructure_universal_implication_recursive", "DESTRUCTURE-UNIVERSAL-IMPLICATION-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_true_sentence_enumerable_universal_implication_expand", "REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "determine_enumeration_query_properties", "DETERMINE-ENUMERATION-QUERY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "determine_decision_query_properties", "DETERMINE-DECISION-QUERY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "inference_at_least_backchain_enumerable_sentenceP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "inference_at_least_backchain_enumerable_asentP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "inference_at_least_backchain_enumerable_conjunctionP", "INFERENCE-AT-LEAST-BACKCHAIN-ENUMERABLE-CONJUNCTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "possibly_canonicalize_sentence_wrt_universal_el_vars", "POSSIBLY-CANONICALIZE-SENTENCE-WRT-UNIVERSAL-EL-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "new_el_variable_to_non_base_hl_variable_map", "NEW-EL-VARIABLE-TO-NON-BASE-HL-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "fully_bound_assuming_bindings_p", "FULLY-BOUND-ASSUMING-BINDINGS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_simple_expand", "REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_recursive_query_internal", "REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_recursive_query", "REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_inference_has_good_proofP", "REMOVAL-SENTENCE-JUSTIFICATIONS-INFERENCE-HAS-GOOD-PROOF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_get_proof_summary_items_internal", "REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_get_proof_summary_items", "REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_sentence_justifications_proof_view_summary_expand", "REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_tautology_justification_expand", "REMOVAL-TAUTOLOGY-JUSTIFICATION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_tautology_justification_recursive_query", "REMOVAL-TAUTOLOGY-JUSTIFICATION-RECURSIVE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_knownsentencewithproofview_expand", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_knownsentencewithproofview_get_cyc_proof_view_internal", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence", "removal_knownsentencewithproofview_get_cyc_proof_view", "REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW", 3, 0, false);
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    public static SubLObject init_removal_modules_true_sentence_file() {
        removal_modules_true_sentence.$default_known_sentence_check_cost$ = SubLFiles.defparameter("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        removal_modules_true_sentence.$known_sentence_lookahead_cost$ = SubLFiles.defparameter("*KNOWN-SENTENCE-LOOKAHEAD-COST*", (SubLObject)removal_modules_true_sentence.$float13$0_1);
        removal_modules_true_sentence.$default_check_sentence_check_cost$ = SubLFiles.defparameter("*DEFAULT-CHECK-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        removal_modules_true_sentence.$default_unknown_sentence_check_cost$ = SubLFiles.defparameter("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*", removal_modules_true_sentence.$default_known_sentence_check_cost$.getDynamicValue());
        removal_modules_true_sentence.$default_true_sentence_check_cost$ = SubLFiles.defparameter("*DEFAULT-TRUE-SENTENCE-CHECK-COST*", removal_modules_true_sentence.$default_known_sentence_check_cost$.getDynamicValue());
        removal_modules_true_sentence.$removal_sentence_justifications_max_justifications_count$ = SubLFiles.defparameter("*REMOVAL-SENTENCE-JUSTIFICATIONS-MAX-JUSTIFICATIONS-COUNT*", (SubLObject)removal_modules_true_sentence.TWO_INTEGER);
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    public static SubLObject setup_removal_modules_true_sentence_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const3$knownSentence);
        preference_modules.inference_preference_module((SubLObject)removal_modules_true_sentence.$kw4$KNOWN_SENTENCE_POS_GAF, (SubLObject)removal_modules_true_sentence.$list5);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym10$KNOWN_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw11$REMOVAL_KNOWN_SENTENCE_CHECK, (SubLObject)removal_modules_true_sentence.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw14$REMOVAL_KNOWN_SENTENCE_POS_GAF, (SubLObject)removal_modules_true_sentence.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw20$REMOVAL_KNOWN_SENTENCE_NEG_GAF, (SubLObject)removal_modules_true_sentence.$list21);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const23$checkSentence);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const23$checkSentence);
        preference_modules.inference_preference_module((SubLObject)removal_modules_true_sentence.$kw24$CHECK_SENTENCE_SIBLING, (SubLObject)removal_modules_true_sentence.$list25);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym27$CHECK_SENTENCE_SIBLING_REQUIRED);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw28$REMOVAL_CHECK_SENTENCE_CHECK, (SubLObject)removal_modules_true_sentence.$list29);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym30$REMOVAL_CHECK_SENTENCE_CHECK_QUERY);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const0$unknownSentence);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const0$unknownSentence);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw33$REMOVAL_UNKNOWN_SENTENCE_CHECK, (SubLObject)removal_modules_true_sentence.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw35$REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG, (SubLObject)removal_modules_true_sentence.$list36);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw37$REMOVAL_UNKNOWN_SENTENCE_POS_GAF, (SubLObject)removal_modules_true_sentence.$list38);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw39$REMOVAL_UNKNOWN_SENTENCE_NEG_GAF, (SubLObject)removal_modules_true_sentence.$list40);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const41$unknownSentenceWRTInferenceMode);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const41$unknownSentenceWRTInferenceMode);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw52$REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK, (SubLObject)removal_modules_true_sentence.$list53);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const55$trueSentence);
        preference_modules.inference_preference_module((SubLObject)removal_modules_true_sentence.$kw56$TRUE_SENTENCE_POS_GAF, (SubLObject)removal_modules_true_sentence.$list57);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym58$TRUE_SENTENCE_POS_GAF_PREFERENCE);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw59$REMOVAL_TRUE_SENTENCE_CHECK, (SubLObject)removal_modules_true_sentence.$list60);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw61$REMOVAL_TRUE_SENTENCE_POS_GAF, (SubLObject)removal_modules_true_sentence.$list62);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw63$REMOVAL_TRUE_SENTENCE_NEG_GAF, (SubLObject)removal_modules_true_sentence.$list64);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw65$REMOVAL_TRUE_SENTENCE_NEG_FALSE, (SubLObject)removal_modules_true_sentence.$list66);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw67$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION, (SubLObject)removal_modules_true_sentence.$list68);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym70$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym77$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw78$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION, (SubLObject)removal_modules_true_sentence.$list79);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym81$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym82$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw83$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION, (SubLObject)removal_modules_true_sentence.$list84);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_true_sentence.$sym87$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const89$sentenceJustifications_Simple);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const89$sentenceJustifications_Simple, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw90$REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE, (SubLObject)removal_modules_true_sentence.$list91);
        memoization_state.note_memoized_function((SubLObject)removal_modules_true_sentence.$sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY);
        memoization_state.note_memoized_function((SubLObject)removal_modules_true_sentence.$sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const105$sentenceJustifications_ProofViewS);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const105$sentenceJustifications_ProofViewS, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw106$REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY, (SubLObject)removal_modules_true_sentence.$list107);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const109$tautologyJustification);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const109$tautologyJustification, (SubLObject)removal_modules_true_sentence.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw110$REMOVAL_TAUTOLOGY_JUSTIFICATION, (SubLObject)removal_modules_true_sentence.$list111);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_true_sentence.$const115$knownSentenceWithProofView);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_true_sentence.$kw8$POS, removal_modules_true_sentence.$const115$knownSentenceWithProofView, (SubLObject)removal_modules_true_sentence.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_true_sentence.$kw116$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW, (SubLObject)removal_modules_true_sentence.$list117);
        memoization_state.note_memoized_function((SubLObject)removal_modules_true_sentence.$sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW);
        return (SubLObject)removal_modules_true_sentence.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_true_sentence_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_true_sentence_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_true_sentence_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_true_sentence();
        removal_modules_true_sentence.$default_known_sentence_check_cost$ = null;
        removal_modules_true_sentence.$known_sentence_lookahead_cost$ = null;
        removal_modules_true_sentence.$default_check_sentence_check_cost$ = null;
        removal_modules_true_sentence.$default_unknown_sentence_check_cost$ = null;
        removal_modules_true_sentence.$default_true_sentence_check_cost$ = null;
        removal_modules_true_sentence.$removal_sentence_justifications_max_justifications_count$ = null;
        $const0$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw1$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw2$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const3$knownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $kw4$KNOWN_SENTENCE_POS_GAF = SubLObjectFactory.makeKeyword("KNOWN-SENTENCE-POS-GAF");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE"));
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ADMITTING-DEFNS?")))));
        $kw7$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $kw8$POS = SubLObjectFactory.makeKeyword("POS");
        $kw9$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $sym10$KNOWN_SENTENCE_POS_GAF_PREFERENCE = SubLObjectFactory.makeSymbol("KNOWN-SENTENCE-POS-GAF-PREFERENCE");
        $kw11$REMOVAL_KNOWN_SENTENCE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-KNOWN-SENTENCE-CHECK");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-KNOWN-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$knownSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $float13$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $kw14$REMOVAL_KNOWN_SENTENCE_POS_GAF = SubLObjectFactory.makeKeyword("REMOVAL-KNOWN-SENTENCE-POS-GAF");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE")), (SubLObject)SubLObjectFactory.makeKeyword("POS"))), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$knownSentence \n     (#$genls ?SPEC #$BinaryRelation))") });
        $kw16$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw17$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw18$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw19$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw20$REMOVAL_KNOWN_SENTENCE_NEG_GAF = SubLObjectFactory.makeKeyword("REMOVAL-KNOWN-SENTENCE-NEG-GAF");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-NEG-GAF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$knownSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $kw22$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $const23$checkSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("checkSentence"));
        $kw24$CHECK_SENTENCE_SIBLING = SubLObjectFactory.makeKeyword("CHECK-SENTENCE-SIBLING");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-SENTENCE-SIBLING-REQUIRED")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIBLING-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SIBLING-ASENT"));
        $sym27$CHECK_SENTENCE_SIBLING_REQUIRED = SubLObjectFactory.makeSymbol("CHECK-SENTENCE-SIBLING-REQUIRED");
        $kw28$REMOVAL_CHECK_SENTENCE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-CHECK-SENTENCE-CHECK");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("checkSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("checkSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-CHECK-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("checkSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CHECK-SENTENCE-CHECK-QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$checkSentence <sentence>)\n    by recursively querying sentence\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$checkSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $sym30$REMOVAL_CHECK_SENTENCE_CHECK_QUERY = SubLObjectFactory.makeSymbol("REMOVAL-CHECK-SENTENCE-CHECK-QUERY");
        $kw31$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")));
        $kw33$REMOVAL_UNKNOWN_SENTENCE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query fails"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentence\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $kw35$REMOVAL_UNKNOWN_SENTENCE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-CHECK-NEG");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-UNKNOWN-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$unknownSentence (<non-predicate> . <fully-bound>)))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not\n     (#$unknownSentence\n      (#$thereExists ?PRED\n       (?PRED #$Collection #$Predicate))))") });
        $kw37$REMOVAL_UNKNOWN_SENTENCE_POS_GAF = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-POS-GAF");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-POS-GAF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentence (<predicate> . <fully-bound>))\n    by recursively querying sentence (<predicate> . <fully-bound>)\n    and succeeding if it fails"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentence\n     (#$arg1Isa #$isa #$Microtheory))") });
        $kw39$REMOVAL_UNKNOWN_SENTENCE_NEG_GAF = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-NEG-GAF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    and succeeding if it fails"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentence\n     (#$not (#$isa #$myCreator #$DefaultMonotonicPredicate)))") });
        $const41$unknownSentenceWRTInferenceMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentenceWRTInferenceMode"));
        $const42$Shallow_CycInferenceMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Shallow-CycInferenceMode"));
        $const43$Minimal_CycInferenceMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Minimal-CycInferenceMode"));
        $const44$Extended_CycInferenceMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Extended-CycInferenceMode"));
        $int45$100 = SubLObjectFactory.makeInteger(100);
        $int46$1000 = SubLObjectFactory.makeInteger(1000);
        $kw47$SHALLOW = SubLObjectFactory.makeKeyword("SHALLOW");
        $kw48$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw49$EXTENDED = SubLObjectFactory.makeKeyword("EXTENDED");
        $const50$Maximal_CycInferenceMode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Maximal-CycInferenceMode"));
        $kw51$MAXIMAL = SubLObjectFactory.makeKeyword("MAXIMAL");
        $kw52$REMOVAL_UNKNOWN_SENTENCE_WRT_INFERENCE_MODE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK");
        $list53 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentenceWRTInferenceMode")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentenceWRTInferenceMode")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-MODE-TERM-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-UNKNOWN-SENTENCE-WRT-INFERENCE-MODE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unknownSentenceWRTInferenceMode <inference-mode-term-p> <fully-bound>)\n    by recursively querying sentence <fully-bound> using the provided inference mode."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$unknownSentenceWRTInferenceMode #$Shallow-CycInferenceMode\n     (#$thereExists ?PRED\n      (?PRED #$Collection #$Predicate)))") });
        $const54$SpecifiedInferenceModeCluster = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecifiedInferenceModeCluster"));
        $const55$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $kw56$TRUE_SENTENCE_POS_GAF = SubLObjectFactory.makeKeyword("TRUE-SENTENCE-POS-GAF");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE"));
        $sym58$TRUE_SENTENCE_POS_GAF_PREFERENCE = SubLObjectFactory.makeSymbol("TRUE-SENTENCE-POS-GAF-PREFERENCE");
        $kw59$REMOVAL_TRUE_SENTENCE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK");
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TRUE-SENTENCE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence (<non-predicate> . <fully-bound>))\n    by recursively querying sentence\n    and succeeding if the query succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$trueSentence\n     (#$thereExists ?COL\n      (#$disjointWith #$Collection ?COL)))") });
        $kw61$REMOVAL_TRUE_SENTENCE_POS_GAF = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-POS-GAF");
        $list62 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-POS-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-COMPLETENESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE")), (SubLObject)SubLObjectFactory.makeKeyword("POS"))), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-KNOWN-SENTENCE-POS-GAF-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-SENTENCE")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$trueSentence \n     (#$isa #$Predicate ?WHAT))") });
        $kw63$REMOVAL_TRUE_SENTENCE_NEG_GAF = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-GAF");
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-NEG-GAF-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$trueSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $kw65$REMOVAL_TRUE_SENTENCE_NEG_FALSE = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-NEG-FALSE");
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"))), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_true_sentence.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), removal_modules_true_sentence.T, SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-TRUTH-SENTENCE-SUPPORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$trueSentence #$False)") });
        $kw67$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION");
        $list68 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence \n      (#$not \n       (#$thereExists ?EATER \n        (#$thereExists ?EATING \n         (#$and \n          (#$isa ?EATING #$EatingEvent) \n          (#$consumedObject ?EATING ?EATER) \n          (#$doneBy ?EATING ?EATER)))))))") });
        $kw69$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym70$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-REQUIRED");
        $sym71$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym72$SENTENCE_FREE_VARIABLES = SubLObjectFactory.makeSymbol("SENTENCE-FREE-VARIABLES");
        $sym73$NEGATE = SubLObjectFactory.makeSymbol("NEGATE");
        $const74$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const75$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?"), (SubLObject)removal_modules_true_sentence.T);
        $sym77$REMOVAL_TRUE_SENTENCE_UNIVERSAL_DISJUNCTION_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-EXPAND");
        $kw78$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION");
        $list79 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-CHECK")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$CurrentWorldDataCollectorMt-NonHomocentric\n     (#$trueSentence\n      (#$forAll ?PRED\n       (#$implies\n        (#$memberOfList ?PRED\n         (#$TheList #$fieldsOfCompetence \n \t\t    #$primarySupervisor\n \t\t    (#$IsaPredFn #$ProjectManager)\n \t\t    (#$IsaPredFn #$OntologicalEngineer)\n \t\t    (#$IsaPredFn #$ComputerProgrammer) #$fieldsOfCompetence))\n        (#$thereExists ?CONSTRAINT\n \t (#$thereExists ?M\n          (#$argIsa ?PRED ?M ?CONSTRAINT)))))))") });
        $const80$memberOfList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $sym81$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-REQUIRED");
        $sym82$REMOVAL_TRUE_SENTENCE_MEMBER_OF_LIST_IMPLICATION_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-MEMBER-OF-LIST-IMPLICATION-EXPAND");
        $kw83$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION = SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION");
        $list84 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$trueSentence\n      (#$forAll ?N\n       (#$implies\n        (#$elementOf ?N (#$TheSet 0 1))\n        (#$evaluate ?N (#$TimesFn ?N ?N))))))") });
        $sym85$INFERENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_SENTENCE_ = SubLObjectFactory.makeSymbol("INFERENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-SENTENCE?");
        $kw86$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $sym87$REMOVAL_TRUE_SENTENCE_ENUMERABLE_UNIVERSAL_IMPLICATION_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-TRUE-SENTENCE-ENUMERABLE-UNIVERSAL-IMPLICATION-EXPAND");
        $kw88$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $const89$sentenceJustifications_Simple = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-Simple"));
        $kw90$REMOVAL_SENTENCE_JUSTIFICATIONS_SIMPLE = SubLObjectFactory.makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE");
        $list91 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-Simple")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-Simple")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-SIMPLE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentenceJustifications-Simple <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-Simple (#$genls #$Dog #$Animal) ?WHY))") });
        $kw92$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym93$REMOVAL_SENTENCE_JUSTIFICATIONS_RECURSIVE_QUERY = SubLObjectFactory.makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-RECURSIVE-QUERY");
        $kw94$RESULT_UNIQUENESS = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $kw95$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw96$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw97$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw98$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $kw99$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw100$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw101$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $kw102$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $sym103$REMOVAL_SENTENCE_JUSTIFICATIONS_GET_PROOF_SUMMARY_ITEMS = SubLObjectFactory.makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-GET-PROOF-SUMMARY-ITEMS");
        $int104$1024 = SubLObjectFactory.makeInteger(1024);
        $const105$sentenceJustifications_ProofViewS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-ProofViewSummary"));
        $kw106$REMOVAL_SENTENCE_JUSTIFICATIONS_PROOF_VIEW_SUMMARY = SubLObjectFactory.makeKeyword("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY");
        $list107 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-ProofViewSummary")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceJustifications-ProofViewSummary")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SENTENCE-JUSTIFICATIONS-PROOF-VIEW-SUMMARY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentenceJustifications-ProofViewSummary <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$sentenceJustifications-ProofViewSummary (#$genls #$Dog #$Animal) ?WHY))") });
        $sym108$PROOF_VIEW_FACT_SENTENCE_WITH_HL_TERMS = SubLObjectFactory.makeSymbol("PROOF-VIEW-FACT-SENTENCE-WITH-HL-TERMS");
        $const109$tautologyJustification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tautologyJustification"));
        $kw110$REMOVAL_TAUTOLOGY_JUSTIFICATION = SubLObjectFactory.makeKeyword("REMOVAL-TAUTOLOGY-JUSTIFICATION");
        $list111 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tautologyJustification")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tautologyJustification")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TAUTOLOGY-JUSTIFICATION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$tautologyJustification <fully-bound-p> ?JUSTIFICATIONS)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$tautologyJustification (#$genls #$Dog #$Animal) ?WHY))") });
        $kw112$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw113$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw114$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $const115$knownSentenceWithProofView = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentenceWithProofView"));
        $kw116$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW = SubLObjectFactory.makeKeyword("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW");
        $list117 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentenceWithProofView")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentenceWithProofView")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_true_sentence.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$knownSentenceWithProofView <anything> <fully-bound-p> <anything>)\n    recursively queries sentence <fully-bound-p> and binds ?JUSTIFICATIONS to the HL justifications of the first proof found."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$UniversalVocabularyMt\n     (#$knownSentenceWithProofView (#$genls #$Dog #$Animal) ?WHY))") });
        $sym118$REMOVAL_KNOWNSENTENCEWITHPROOFVIEW_GET_CYC_PROOF_VIEW = SubLObjectFactory.makeSymbol("REMOVAL-KNOWNSENTENCEWITHPROOFVIEW-GET-CYC-PROOF-VIEW");
        $const119$CycProofViewFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewFn"));
    }
}

/*

	Total time: 563 ms
	
*/