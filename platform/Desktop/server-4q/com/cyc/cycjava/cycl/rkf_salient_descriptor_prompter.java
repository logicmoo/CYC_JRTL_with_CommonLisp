package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_salient_descriptor_prompter extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter";
    public static final String myFingerPrint = "411a21b8bd9fbb9758d31334d69aefd4a75b400483be94b020ce87a9cc06301a";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 13390L)
    private static SubLSymbol $rkf_sd_strings_for_tactics$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 15603L)
    private static SubLSymbol $rkf_prompter_sort_prompter$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27736L)
    public static SubLSymbol $rkf_sd_seed_term_tactics_table$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49129L)
    private static SubLSymbol $rkf_sd_suppress_rarely_known_prompt_formulasP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49204L)
    private static SubLSymbol $rkf_sd_suppress_formula_percent_min$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49267L)
    private static SubLSymbol $rkf_sd_suppress_formula_count_min$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 64563L)
    private static SubLSymbol $rkf_sd_seed_term$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70325L)
    private static SubLSymbol $rkf_sd_rule_score_tests$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 78888L)
    private static SubLSymbol $rkf_unparseable_arg_types$;
    private static final SubLSymbol $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER_P;
    private static final SubLSymbol $kw1$GENERATOR_THREAD;
    private static final SubLSymbol $kw2$NONE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$LOCK;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLSymbol $sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$WITH_LOCK_HELD;
    private static final SubLSymbol $kw9$WHOSTATE;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$STATE;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym14$_RKF_SD_PROBLEM_STORE_;
    private static final SubLSymbol $sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE;
    private static final SubLSymbol $sym16$REUSING_RKF_SD_PROBLEM_STORE;
    private static final SubLSymbol $sym17$WITH_RKF_SD_PROMPTER_PROBLEM_STORE;
    private static final SubLSymbol $kw18$PROBLEM_STORE;
    private static final SubLSymbol $kw19$DONE;
    private static final SubLSymbol $kw20$MEMOIZATION_STATE;
    private static final SubLSymbol $kw21$REMOVED;
    private static final SubLSymbol $kw22$TACTIC_DONE;
    private static final SubLSymbol $kw23$LOCK;
    private static final SubLSymbol $kw24$BEST_PROMPT;
    private static final SubLSymbol $kw25$RECOMPUTE;
    private static final SubLSymbol $sym26$RKF_SALIENT_DESCRIPTOR_PROMPT_P;
    private static final SubLSymbol $kw27$LAST_TACTIC;
    private static final SubLList $list28;
    private static final SubLString $str29$None;
    private static final SubLString $str30$Unknown;
    private static final SubLSymbol $kw31$BAD;
    private static final SubLSymbol $sym32$RKF_SD_BETTER_PROMPT_;
    private static final SubLSymbol $sym33$INTEGERP;
    private static final SubLSymbol $kw34$EXAMPLE_INSTANCE;
    private static final SubLSymbol $kw35$SPECIFY;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$EL_VAR_;
    private static final SubLSymbol $kw38$ADDED;
    private static final SubLSymbol $kw39$ALREADY_PRESENT;
    private static final SubLSymbol $sym40$STRINGP;
    private static final SubLSymbol $sym41$SUPPORT_MT;
    private static final SubLSymbol $sym42$UNIVERSAL_DATE_P;
    private static final SubLSymbol $sym43$ASSERTED_WHEN;
    private static final SubLSymbol $sym44$ASSERTION_P;
    private static final SubLSymbol $kw45$IGNORE;
    private static final SubLSymbol $sym46$_;
    private static final SubLSymbol $sym47$RKF_SD_TERM_GENERALITY;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$PROGN;
    private static final SubLSymbol $sym51$CHECK_TYPE;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_;
    private static final SubLObject $const54$Microtheory;
    private static final SubLSymbol $kw55$MT;
    private static final SubLSymbol $kw56$FORT;
    private static final SubLSymbol $kw57$UNKNOWN;
    private static final SubLSymbol $kw58$GAF;
    private static final SubLSymbol $kw59$RULE;
    private static final SubLSymbol $sym60$FORT_P;
    private static final SubLString $str61$Couldn_t_find__S_in__S_;
    private static final SubLSymbol $kw62$TEMPLATE;
    private static final SubLObject $const63$focalTermPositionForFormulaTempla;
    private static final SubLObject $const64$formulaForFormulaTemplate;
    private static final SubLObject $const65$formulaTemplateExample;
    private static final SubLInteger $int66$100;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLObject $const69$SpecsFn;
    private static final SubLObject $const70$templateReplacementsInvisibleForP;
    private static final SubLObject $const71$candidateReplacementForPosition;
    private static final SubLObject $const72$glossForFormulaTemplate;
    private static final SubLObject $const73$formulaTemplateArgExplanation;
    private static final SubLObject $const74$assertMtForFormulaTemplate;
    private static final SubLObject $const75$assertionFormatForFormulaTemplate;
    private static final SubLObject $const76$SingleAssertionEntry;
    private static final SubLObject $const77$MultipleAssertionEntry;
    private static final SubLObject $const78$DataForNLMt;
    private static final SubLSymbol $sym79$SUGGEST_MT;
    private static final SubLSymbol $sym80$QUOTE;
    private static final SubLSymbol $sym81$_MT;
    private static final SubLObject $const82$defaultDefiningMtForSentence;
    private static final SubLSymbol $kw83$MAX_NUMBER;
    private static final SubLSymbol $kw84$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw85$MAX_TIME;
    private static final SubLInteger $int86$30;
    private static final SubLSymbol $kw87$RETURN;
    private static final SubLObject $const88$GKEFormulaTemplatesMt;
    private static final SubLList $list89;
    private static final SubLObject $const90$InferencePSC;
    private static final SubLObject $const91$FormulaTemplate;
    private static final SubLObject $const92$isa;
    private static final SubLList $list93;
    private static final SubLObject $const94$formulaTemplateHasType;
    private static final SubLString $str95$constantNameAutoGeneratedFromColl;
    private static final SubLObject $const96$BaseKB;
    private static final SubLSymbol $sym97$RKF_GENERIC_EXAMPLE_P;
    private static final SubLSymbol $kw98$ANYTHING;
    private static final SubLSymbol $kw99$FOCAL_TERM;
    private static final SubLObject $const100$SomeExampleFn;
    private static final SubLObject $const101$focalTermTypeForInducedTemplateTy;
    private static final SubLSymbol $sym102$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const103$EverythingPSC;
    private static final SubLSymbol $kw104$BREADTH;
    private static final SubLSymbol $kw105$QUEUE;
    private static final SubLSymbol $kw106$STACK;
    private static final SubLObject $const107$True_JustificationTruth;
    private static final SubLSymbol $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw109$ERROR;
    private static final SubLString $str110$_A_is_not_a__A;
    private static final SubLSymbol $sym111$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw112$CERROR;
    private static final SubLString $str113$continue_anyway;
    private static final SubLSymbol $kw114$WARN;
    private static final SubLString $str115$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const116$genls;
    private static final SubLString $str117$Redundant_with__S_____S_on__S;
    private static final SubLString $str118$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str119$attempting_to_bind_direction_link;
    private static final SubLString $str120$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLList $list121;
    private static final SubLString $str122$Hey_ho___S_has_got_to_go___;
    private static final SubLSymbol $sym123$ISA_COLLECTION_;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$ALIST_P;
    private static final SubLSymbol $kw126$EXHAUSTED;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$TACTICS_FOR_SEED_TERM_TYPE;
    private static final SubLSymbol $sym129$TACTICS_TABLE_COPY;
    private static final SubLSymbol $sym130$REMOVE;
    private static final SubLSymbol $sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$ALIST_ENTER;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$TACTICS_FOR_SEED_TERM_TYPE;
    private static final SubLSymbol $sym137$TACTICS_TABLE_COPY;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$ORDERED_SET_DIFFERENCE;
    private static final SubLObject $const140$keSuggestion;
    private static final SubLObject $const141$keRequirement;
    private static final SubLObject $const142$keInteractionRequirement;
    private static final SubLObject $const143$keInteractionStrongSuggestion;
    private static final SubLList $list144;
    private static final SubLSymbol $kw145$KE_DRIVEN_PROMPTS;
    private static final SubLSymbol $sym146$RKF_NEIGHBOR_SUGGESTIONS;
    private static final SubLSymbol $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_;
    private static final SubLSymbol $kw148$RESULTS_QUEUE;
    private static final SubLList $list149;
    private static final SubLString $str150$Timed_out_after__S_seconds_gettin;
    private static final SubLSymbol $kw151$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLString $str152$P_A_D__getting__S_for__S___;
    private static final SubLSymbol $kw153$EXHAUST_TOTAL;
    private static final SubLString $str154$_S_is_not_continuable____Exit_con;
    private static final SubLSymbol $sym155$_SEED_TERM;
    private static final SubLString $str156$Suppressing_SD_prompt_for__S_____;
    private static final SubLSymbol $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY;
    private static final SubLSymbol $kw158$CACHED_INFERENCES;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$_FORMULA;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$_SOURCE_TERM;
    private static final SubLSymbol $kw164$ANALOGOUS_TERMS;
    private static final SubLObject $const165$similarTo;
    private static final SubLList $list166;
    private static final SubLSymbol $kw167$PRECEDENT;
    private static final SubLObject $const168$Predicate;
    private static final SubLSymbol $sym169$_X;
    private static final SubLSymbol $kw170$ANALOGY_SUGGESTIONS;
    private static final SubLObject $const171$unknownSentence;
    private static final SubLSymbol $kw172$USE_RULES_;
    private static final SubLSymbol $kw173$FALSE;
    private static final SubLSymbol $kw174$RULE_TABLE;
    private static final SubLSymbol $kw175$TRUE;
    private static final SubLSymbol $sym176$EL_EXPRESSION_EQUAL_;
    private static final SubLSymbol $sym177$RKF_SD_PROMPTER_RULES_FOR_TERM;
    private static final SubLSymbol $kw178$NEG;
    private static final SubLSymbol $kw179$POS;
    private static final SubLSymbol $sym180$RKF_SD_RULE_TUPLE__;
    private static final SubLSymbol $sym181$RKF_SD_PREFER_RULE_TUPLE_;
    private static final SubLSymbol $sym182$RKF_SD_LOW_SCORING_TUPLE_P;
    private static final SubLSymbol $sym183$RKF_SD_SCORE_RULE_TUPLE;
    private static final SubLList $list184;
    private static final SubLList $list185;
    private static final SubLList $list186;
    private static final SubLSymbol $kw187$BETTER;
    private static final SubLSymbol $kw188$WORSE;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$RKF_SD_TERM_TOO_GENERAL_;
    private static final SubLInteger $int191$5000;
    private static final SubLObject $const192$keStrongSuggestion;
    private static final SubLObject $const193$keWeakSuggestion;
    private static final SubLSymbol $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_;
    private static final SubLSymbol $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_;
    private static final SubLSymbol $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_;
    private static final SubLList $list197;
    private static final SubLList $list198;
    private static final SubLObject $const199$defnSufficient;
    private static final SubLObject $const200$defnIff;
    private static final SubLObject $const201$resultIsa;
    private static final SubLObject $const202$CoaDiagramObject;
    private static final SubLList $list203;
    private static final SubLSymbol $sym204$RKF_SD_PROMPTER_FIND_RULE_PROMPTS;
    private static final SubLSymbol $sym205$RKF_SD_EL_FULLY_BOUND_P;
    private static final SubLSymbol $kw206$STRONG;
    private static final SubLSymbol $kw207$WEAK;
    private static final SubLList $list208;
    private static final SubLSymbol $kw209$ISA;
    private static final SubLSymbol $kw210$BIN_PRED;
    private static final SubLSymbol $sym211$RKF_SD_PROMPT_EXAMPLE_INSTANCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1271L)
    public static SubLObject rkf_salient_descriptor_prompter_prune_unused_prompts(final SubLObject prompter) {
        assert rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) : prompter;
        rkf_sd_prompter_prune_bad_prompts(prompter);
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1476L)
    public static SubLObject rkf_salient_descriptor_prompter_prompt_count(final SubLObject prompter) {
        final SubLObject unused_prompts = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        if (rkf_salient_descriptor_prompter.NIL != set.set_p(unused_prompts)) {
            return set.set_size(unused_prompts);
        }
        return (SubLObject)rkf_salient_descriptor_prompter.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1697L)
    public static SubLObject rkf_salient_descriptor_prompter_note_generator_thread(final SubLObject prompter, final SubLObject generator_thread) {
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw1$GENERATOR_THREAD, generator_thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1886L)
    public static SubLObject rkf_salient_descriptor_prompter_clear_generator_thread(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw1$GENERATOR_THREAD, (SubLObject)rkf_salient_descriptor_prompter.$kw2$NONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2048L)
    public static SubLObject rkf_salient_descriptor_candidate_p(final SubLObject v_object) {
        final SubLObject seed_term_type = rkf_sd_prompter_compute_seed_term_type(v_object);
        final SubLObject tactics = rkf_sd_prompter_tactics_for_seed_term_type(seed_term_type);
        return list_utilities.sublisp_boolean(tactics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2354L)
    public static SubLObject with_rkf_sd_prompter_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompter = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject whostate = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list3);
        prompter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list3);
        whostate = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject lock = (SubLObject)rkf_salient_descriptor_prompter.$sym4$LOCK;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(lock, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, (SubLObject)rkf_salient_descriptor_prompter.$list7))), (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym8$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock, (SubLObject)rkf_salient_descriptor_prompter.$kw9$WHOSTATE, whostate), ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_prompter.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list3);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2613L)
    public static SubLObject with_rkf_sd_prompter_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompter = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list10);
        prompter = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject state = (SubLObject)rkf_salient_descriptor_prompter.$sym11$STATE;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(state, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, (SubLObject)rkf_salient_descriptor_prompter.$list12))), (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym13$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state), ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_prompter.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list10);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2916L)
    public static SubLObject with_rkf_sd_prompter_problem_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompter = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list10);
        prompter = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym14$_RKF_SD_PROBLEM_STORE_, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, prompter))), reader.bq_cons((SubLObject)rkf_salient_descriptor_prompter.$sym16$REUSING_RKF_SD_PROBLEM_STORE, ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_prompter.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list10);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 3138L)
    public static SubLObject rkf_sd_examples_for_prompt(final SubLObject prompt, final SubLObject bad_example_num, final SubLObject bad_examples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_justification(prompt);
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter(prompt);
        final SubLObject v_term = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_prompter_mt(prompter);
        final SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(v_term, justification);
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
        final SubLObject subprompt = ConsesLow.nth(bad_example_num, subprompts);
        final SubLObject formula = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject new_examples = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject _prev_bind_0 = rkf_macros.$rkf_ok_to_generate_examplesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_macros.$rkf_ok_to_generate_examplesP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$1 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    new_examples = rkf_salient_descriptor.rkf_sd_examples(formula, v_term, mt, salient_property_sentence, bad_examples, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_2, thread);
            rkf_macros.$rkf_ok_to_generate_examplesP$.rebind(_prev_bind_0, thread);
        }
        return new_examples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 3999L)
    public static SubLObject rkf_sd_prompter_find_or_set_problem_store(final SubLObject prompter) {
        SubLObject problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_sd_problem_store_okP(problem_store)) {
            problem_store = rkf_salient_descriptor_prompter_reset_problem_store(prompter);
        }
        return problem_store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 4383L)
    public static SubLObject rkf_salient_descriptor_prompter_reset_problem_store(final SubLObject prompter) {
        final SubLObject old_problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject new_problem_store = rkf_salient_descriptor.rkf_sd_make_problem_store();
        if (rkf_salient_descriptor_prompter.NIL != inference_datastructures_problem_store.problem_store_p(old_problem_store)) {
            rkf_salient_descriptor.rkf_sd_free_problem_store(old_problem_store);
        }
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, new_problem_store);
        return new_problem_store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 4862L)
    public static SubLObject rkf_salient_descriptor_prompter_next(final SubLObject prompter, SubLObject chosen_prompt) {
        if (chosen_prompt == rkf_salient_descriptor_prompter.UNPROVIDED) {
            chosen_prompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        final SubLObject use_generator_threadP = rkf_salient_descriptor_prompter_has_generator_thread_p(prompter);
        while (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(chosen_prompt) && rkf_salient_descriptor_prompter.NIL == rkf_sd_prompter_exhausted_p(prompter)) {
            if (rkf_salient_descriptor_prompter.NIL == use_generator_threadP) {
                rkf_salient_descriptor_prompter_generate_prompt(prompter, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            }
            else if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_prompter_has_generator_thread_p(prompter)) {
                rkf_salient_descriptor_prompter_generate_prompt(prompter, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            }
            else {
                rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
                Threads.sleep((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER);
            }
            chosen_prompt = rkf_sd_prompter_best_prompt(prompter);
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(chosen_prompt)) {
            rkf_sd_prompter_mark_prompt_used(prompter, chosen_prompt);
        }
        else {
            chosen_prompt = (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
            rkf_salient_descriptor_prompter_finalize(prompter);
        }
        return chosen_prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 6151L)
    public static SubLObject rkf_salient_descriptor_prompter_finalize(final SubLObject prompter) {
        final SubLObject v_memoization_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw20$MEMOIZATION_STATE, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL != memoization_state.memoization_state_p(v_memoization_state)) {
            memoization_state.clear_all_memoization(v_memoization_state);
        }
        final SubLObject problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL != inference_datastructures_problem_store.problem_store_p(problem_store)) {
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 6617L)
    public static SubLObject rkf_sd_prompter_mark_prompt_used(final SubLObject prompter, final SubLObject prompt) {
        rkf_sd_prompter_remove_unused_prompt(prompter, prompt);
        set.set_add(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter));
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 6819L)
    public static SubLObject rkf_sd_prompter_remove_unused_prompt(final SubLObject prompter, final SubLObject prompt) {
        set.set_remove(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
        return (SubLObject)rkf_salient_descriptor_prompter.$kw21$REMOVED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 7043L)
    public static SubLObject rkf_salient_descriptor_prompter_has_generator_thread_p(final SubLObject prompter) {
        final SubLObject generator_thread = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw1$GENERATOR_THREAD, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        return Threads.valid_process_p(generator_thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 7269L)
    public static SubLObject rkf_salient_descriptor_prompter_unblock_generator_thread(final SubLObject prompter) {
        final SubLObject generator_thread = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw1$GENERATOR_THREAD, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL != Threads.valid_process_p(generator_thread)) {
            Threads.process_unblock(generator_thread);
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 7557L)
    public static SubLObject rkf_salient_descriptor_prompter_generate_prompt(final SubLObject prompter, SubLObject allow_tactic_rolloverP) {
        if (allow_tactic_rolloverP == rkf_salient_descriptor_prompter.UNPROVIDED) {
            allow_tactic_rolloverP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_count = set.set_size(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        SubLObject result = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state());
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while (!set.set_size(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter)).numG(start_count) && result != rkf_salient_descriptor_prompter.$kw19$DONE && (rkf_salient_descriptor_prompter.NIL != allow_tactic_rolloverP || result != rkf_salient_descriptor_prompter.$kw22$TACTIC_DONE)) {
                    result = rkf_sd_prompter_apply_tactics(prompter);
                }
                if (!start_count.eql(set.set_size(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter)))) {
                    rkf_sd_prompter_update_best_prompt(prompter);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 8339L)
    public static SubLObject rkf_salient_descriptor_prompter_remove_prompt(final SubLObject prompter, final SubLObject prompt) {
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw23$LOCK, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            if (best_prompt.eql(prompt)) {
                rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.$kw25$RECOMPUTE);
            }
            rkf_sd_prompter_remove_unused_prompt(prompter, prompt);
        }
        finally {
            if (rkf_salient_descriptor_prompter.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 8791L)
    public static SubLObject rkf_salient_descriptor_prompter_replace_prompt(final SubLObject prompter, final SubLObject prompt) {
        assert rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) : prompter;
        assert rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) : prompt;
        set.set_remove(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter));
        return rkf_sd_prompter_add_to_unused_prompts(prompter, prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 9181L)
    public static SubLObject rkf_salient_descriptor_prompter_mt(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 9323L)
    public static SubLObject rkf_salient_descriptor_prompter_seed_term(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 9495L)
    public static SubLObject rkf_salient_descriptor_prompter_pop_prompt_tactic(final SubLObject prompter, final SubLObject prompt) {
        final SubLObject tactic_to_pop = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(prompt);
        if (tactic_to_pop.eql(rkf_salient_descriptor_prompter_current_tactic(prompter))) {
            rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics(prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).rest());
        }
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw23$LOCK, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(best_prompt) && tactic_to_pop.eql(rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(best_prompt))) {
                rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.$kw25$RECOMPUTE);
            }
            rkf_sd_prompter_prune_tactic_prompts(prompter, tactic_to_pop);
        }
        finally {
            if (rkf_salient_descriptor_prompter.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 10375L)
    public static SubLObject rkf_sd_prompter_prune_tactic_prompts(final SubLObject prompter, final SubLObject tactic_to_pop) {
        final SubLObject bad_prompts = set.new_set((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt) && tactic_to_pop.eql(rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(prompt))) {
                set.set_add(prompt, bad_prompts);
            }
        }
        final SubLObject set_contents_var2 = set.do_set_internal(bad_prompts);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject bad_prompt;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            bad_prompt = set_contents.do_set_contents_next(basis_object2, state2);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state2, bad_prompt)) {
                rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
            }
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 10768L)
    public static SubLObject rkf_sd_prompter_prune_bad_prompts(final SubLObject prompter) {
        final SubLObject bad_prompts = set.new_set((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt) && rkf_salient_descriptor_prompter.NIL != rkf_sd_bad_promptP(prompt)) {
                set.set_add(prompt, bad_prompts);
            }
        }
        final SubLObject set_contents_var2 = set.do_set_internal(bad_prompts);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject bad_prompt;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            bad_prompt = set_contents.do_set_contents_next(basis_object2, state2);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state2, bad_prompt)) {
                rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
            }
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 11122L)
    public static SubLObject rkf_sd_bad_promptP(final SubLObject prompt) {
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
        SubLObject badP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts));
        if (rkf_salient_descriptor_prompter.NIL == badP) {
            final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(prompt));
            if (rkf_salient_descriptor_prompter.NIL != arguments.supports_p(justification) && rkf_salient_descriptor_prompter.NIL == badP) {
                SubLObject csome_list_var;
                SubLObject support;
                for (csome_list_var = justification, support = (SubLObject)rkf_salient_descriptor_prompter.NIL, support = csome_list_var.first(); rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var; badP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == rkf_sd_ok_support_p(support, mt)), csome_list_var = csome_list_var.rest(), support = csome_list_var.first()) {}
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 11591L)
    public static SubLObject rkf_sd_ok_support_p(final SubLObject support, final SubLObject mt) {
        if (rkf_salient_descriptor_prompter.NIL != assertion_handles.assertion_p(support)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != assertions_high.valid_assertion(support, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) && rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_deprecated_sd_ruleP(support, mt));
        }
        if (rkf_salient_descriptor_prompter.NIL != arguments.hl_support_p(support)) {
            return hl_supports.hl_verify(support);
        }
        return (SubLObject)rkf_salient_descriptor_prompter.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 11847L)
    public static SubLObject rkf_salient_descriptor_prompter_last_tactic(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw27$LAST_TACTIC, (SubLObject)rkf_salient_descriptor_prompter.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12077L)
    public static SubLObject rkf_salient_descriptor_prompter_current_tactic(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12295L)
    public static SubLObject rkf_salient_descriptor_prompter_next_tactic(final SubLObject prompter) {
        return conses_high.second(rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12529L)
    public static SubLObject rkf_salient_descriptor_prompter_current_tactic_string(final SubLObject prompter, final SubLObject language_mt) {
        final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic(prompter);
        return rkf_sd_string_for_tactic(tactic, language_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12832L)
    public static SubLObject rkf_salient_descriptor_prompter_next_tactic_string(final SubLObject prompter, final SubLObject language_mt) {
        final SubLObject tactic = rkf_salient_descriptor_prompter_next_tactic(prompter);
        return rkf_sd_string_for_tactic(tactic, language_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 13146L)
    public static SubLObject rkf_salient_descriptor_prompt_tactic_string(final SubLObject prompt, final SubLObject language_mt) {
        final SubLObject tactic = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(prompt);
        return rkf_sd_string_for_tactic(tactic, language_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 14069L)
    public static SubLObject rkf_sd_string_for_tactic(final SubLObject tactic, final SubLObject language_mt) {
        if (rkf_salient_descriptor_prompter.NIL == tactic) {
            return (SubLObject)rkf_salient_descriptor_prompter.$str29$None;
        }
        return list_utilities.alist_lookup(rkf_salient_descriptor_prompter.$rkf_sd_strings_for_tactics$.getGlobalValue(), tactic, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQL), (SubLObject)rkf_salient_descriptor_prompter.$str30$Unknown);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 14277L)
    public static SubLObject rkf_sd_prompter_best_prompt(final SubLObject prompter) {
        SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.$kw25$RECOMPUTE);
        if (best_prompt == rkf_salient_descriptor_prompter.$kw25$RECOMPUTE) {
            best_prompt = rkf_sd_prompter_update_best_prompt(prompter);
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(best_prompt)) {
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.$kw25$RECOMPUTE);
        }
        else {
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, (SubLObject)rkf_salient_descriptor_prompter.$kw2$NONE);
        }
        return best_prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 14773L)
    public static SubLObject rkf_sd_prompter_update_best_prompt(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_prompt;
        final SubLObject v_default = best_prompt = (SubLObject)rkf_salient_descriptor_prompter.$kw2$NONE;
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw23$LOCK, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject prompt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                prompt = set_contents.do_set_contents_next(basis_object, state);
                if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt) && rkf_salient_descriptor_prompter.NIL != rkf_sd_prompter_prefer_promptP(prompter, prompt, best_prompt, v_default)) {
                    best_prompt = prompt;
                }
            }
            if (!v_default.eql(best_prompt)) {
                final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                    final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$4 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            rkf_sd_prompt_maybe_compute_subprompts(best_prompt);
                            if (rkf_salient_descriptor_prompter.$kw31$BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(best_prompt)) {
                                rkf_sd_prompter_remove_unused_prompt(prompter, best_prompt);
                                best_prompt = rkf_sd_prompter_update_best_prompt(prompter);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                                    rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            if (rkf_salient_descriptor_prompter.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw24$BEST_PROMPT, best_prompt);
        return best_prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 15660L)
    public static SubLObject rkf_salient_descriptor_prompter_sorted_unused_prompts(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unused_prompts = set.set_element_list(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        SubLObject ans = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor_prompter.$rkf_prompter_sort_prompter$.currentBinding(thread);
        try {
            rkf_salient_descriptor_prompter.$rkf_prompter_sort_prompter$.bind(prompter, thread);
            ans = Sort.stable_sort(unused_prompts, (SubLObject)rkf_salient_descriptor_prompter.$sym32$RKF_SD_BETTER_PROMPT_, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        }
        finally {
            rkf_salient_descriptor_prompter.$rkf_prompter_sort_prompter$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 15977L)
    public static SubLObject rkf_sd_better_promptP(final SubLObject prompt1, final SubLObject prompt2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_sd_prompter_prefer_promptP(rkf_salient_descriptor_prompter.$rkf_prompter_sort_prompter$.getDynamicValue(thread), prompt1, prompt2, (SubLObject)rkf_salient_descriptor_prompter.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 16136L)
    public static SubLObject rkf_sd_prompter_knownP(final SubLObject prompter, final SubLObject sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$6 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    ans = rkf_salient_descriptor.rkf_sd_known(sentence, mt, exclude_indeterminatesP);
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 16376L)
    public static SubLObject rkf_salient_descriptor_prompter_find_prompt_by_id(final SubLObject prompter, final SubLObject id) {
        assert rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) : prompter;
        assert rkf_salient_descriptor_prompter.NIL != Types.integerp(id) : id;
        SubLObject ans = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == ans && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt) && id.eql(rkf_salient_descriptor_datastructures.rkf_sd_prompt_id(prompt))) {
                ans = prompt;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 16795L)
    public static SubLObject rkf_sd_prompt_maybe_compute_subprompts(final SubLObject prompt) {
        final SubLObject cached_subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
        if (rkf_salient_descriptor_prompter.NIL == cached_subprompts) {
            rkf_sd_prompt_compute_subprompts(prompt);
        }
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 17023L)
    public static SubLObject rkf_sd_prompt_compute_subprompts(final SubLObject prompt) {
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(prompt);
        if (rkf_salient_descriptor_prompter.NIL == el_utilities.el_formula_p(rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt)) && rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt)) {
            final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence(prompt, rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(seed_term, rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt)));
        }
        final SubLObject sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula(prompt);
        final SubLObject seed_term2 = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject seed_term_type = rkf_sd_prompter_compute_seed_term_type(seed_term2);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject confirmedP = (SubLObject)((rkf_salient_descriptor_prompter.$kw34$EXAMPLE_INSTANCE == seed_term_type || rkf_salient_descriptor_prompter.NIL == el_utilities.el_existential_p(sentence)) ? rkf_salient_descriptor_prompter.NIL : rkf_sd_prompter_knownP(prompter, sentence, mt, (SubLObject)rkf_salient_descriptor_prompter.NIL));
        final SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt);
        SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts(sentence, seed_term2, mt, confirmedP, salient_property_sentence);
        if (rkf_salient_descriptor_prompter.NIL != confirmedP && rkf_salient_descriptor_prompter.NIL != collection_defns.el_sentence_askableP(sentence)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(prompt, rkf_salient_descriptor.rkf_sd_existentially_unbind(sentence));
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_bad_subpromptsP(prompt, subprompts)) {
            subprompts = (SubLObject)rkf_salient_descriptor_prompter.$kw31$BAD;
        }
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts(prompt, subprompts);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 18564L)
    public static SubLObject rkf_sd_prompt_missing_examplesP(final SubLObject prompt) {
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts) && rkf_salient_descriptor_prompter.NIL == badP) {
            SubLObject csome_list_var = subprompts;
            SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            subprompt = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                final SubLObject pcase_var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt);
                if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw35$SPECIFY)) {
                    badP = Types.sublisp_null(rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt));
                }
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 18963L)
    public static SubLObject rkf_salient_descriptor_followup_prompt_via_prompter(final SubLObject prompter, final SubLObject old_prompt, final SubLObject confirmed_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state());
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = rkf_salient_descriptor_followup_prompt(old_prompt, prompter, confirmed_sentence);
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 19353L)
    public static SubLObject rkf_salient_descriptor_followup_prompt(final SubLObject old_prompt, final SubLObject prompter, final SubLObject assert_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(old_prompt);
        final SubLObject tactic = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(old_prompt);
        final SubLObject deducible_cnfs = rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(old_prompt);
        final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(old_prompt);
        SubLObject new_prompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL != el_utilities.el_negation_p(assert_sentence) && rkf_salient_descriptor_prompter.NIL != positive_gaf_cnfs_p(deducible_cnfs)) {
            final SubLObject consequent = clauses.pos_lits(deducible_cnfs.first()).first();
            new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, el_utilities.make_negation(consequent));
        }
        if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(new_prompt)) {
            final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                final SubLObject _prev_bind_0_$9 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                    final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                    try {
                        final SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts(assert_sentence, v_term, mt, (SubLObject)rkf_salient_descriptor_prompter.T, salient_property_sentence);
                        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                            new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
                            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts(new_prompt, subprompts);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                                rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
            }
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(new_prompt)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
            rkf_sd_prompter_add_prompt(prompter, new_prompt);
            rkf_sd_prompter_mark_prompt_used(prompter, new_prompt);
        }
        return new_prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 20850L)
    public static SubLObject positive_gaf_cnfs_p(final SubLObject cnfs) {
        SubLObject ans = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL != list_utilities.singletonP(cnfs)) {
            final SubLObject cnf = cnfs.first();
            SubLObject current;
            final SubLObject datum = current = cnf;
            SubLObject neg_lits = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject pos_lits = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list36);
            neg_lits = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list36);
            pos_lits = current.first();
            current = current.rest();
            if (rkf_salient_descriptor_prompter.NIL == current) {
                if (rkf_salient_descriptor_prompter.NIL == neg_lits && rkf_salient_descriptor_prompter.NIL != list_utilities.singletonP(pos_lits) && rkf_salient_descriptor_prompter.NIL != el_utilities.groundP(pos_lits.first(), (SubLObject)rkf_salient_descriptor_prompter.$sym37$EL_VAR_)) {
                    ans = (SubLObject)rkf_salient_descriptor_prompter.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list36);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 21169L)
    public static SubLObject rkf_sd_prompter_add_prompt(final SubLObject prompter, final SubLObject new_prompt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(rkf_salient_descriptor_datastructures.rkf_sd_prompter_isg(prompter));
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_id(new_prompt, id);
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter(new_prompt, prompter);
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$11 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    rkf_sd_prompt_maybe_compute_subprompts(new_prompt);
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$11, thread);
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        SubLObject foundP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == foundP && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                foundP = rkf_sd_prompt_E(prompt, new_prompt);
            }
        }
        set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == foundP && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                foundP = rkf_sd_prompt_E(prompt, new_prompt);
            }
        }
        if (rkf_salient_descriptor_prompter.NIL == foundP) {
            rkf_sd_prompter_add_to_unused_prompts(prompter, new_prompt);
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 21917L)
    public static SubLObject rkf_sd_prompter_add_to_unused_prompts(final SubLObject prompter, final SubLObject new_prompt) {
        if (!rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(new_prompt).eql(prompter)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter(new_prompt, prompter);
        }
        final SubLObject addedP = set.set_add(new_prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        return (SubLObject)((rkf_salient_descriptor_prompter.NIL != addedP) ? rkf_salient_descriptor_prompter.$kw38$ADDED : rkf_salient_descriptor_prompter.$kw39$ALREADY_PRESENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22244L)
    public static SubLObject rkf_sd_prompt_E(final SubLObject prompt1, final SubLObject prompt2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_formula_E(rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula(prompt1), rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula(prompt2)) || (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt1) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt1).equal(rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22542L)
    public static SubLObject rkf_sd_prompt_formula_E(final SubLObject formula1, final SubLObject formula2) {
        final SubLObject equalP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != el_utilities.same_formula_arity_p(formula1, formula2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) && rkf_salient_descriptor_prompter.NIL != czer_utilities.equals_elP(formula1, formula2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
        return equalP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22805L)
    public static SubLObject rkf_sd_prompter_find_prompt_by_id_string(final SubLObject prompter, final SubLObject id_string) {
        assert rkf_salient_descriptor_prompter.NIL != Types.stringp(id_string) : id_string;
        return rkf_sd_prompter_find_prompt_by_id(prompter, reader.parse_integer(id_string, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22999L)
    public static SubLObject rkf_sd_prompter_find_prompt_by_id(final SubLObject prompter, final SubLObject prompt_id) {
        SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt) && rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_id(prompt).eql(prompt_id)) {
                return prompt;
            }
        }
        set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_id(prompt).eql(prompt_id)) {
                return prompt;
            }
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 23419L)
    public static SubLObject rkf_sd_prompter_prefer_promptP(final SubLObject prompter, final SubLObject contender, final SubLObject champ, final SubLObject v_default) {
        if (champ.eql(v_default)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (contender.eql(v_default)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(champ)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(contender)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        if (rkf_salient_descriptor_prompter.$kw31$BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(champ)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (rkf_salient_descriptor_prompter.$kw31$BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(contender)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_localityG(prompter, contender, champ)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_localityG(prompter, champ, contender)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_generalityL(contender, champ)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_generalityL(champ, contender)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_fewer_lits_p(contender, champ)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_fewer_lits_p(champ, contender)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        if (rkf_salient_descriptor_prompter.NIL == rkf_sd_prompt_missing_examplesP(contender) && rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_missing_examplesP(champ)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (rkf_salient_descriptor_prompter.NIL == rkf_sd_prompt_missing_examplesP(champ) && rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_missing_examplesP(contender)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 24817L)
    public static SubLObject rkf_sd_prompt_localityG(final SubLObject prompter, final SubLObject prompt1, final SubLObject prompt2) {
        final SubLObject local_mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject local_supports1 = rkf_sd_prompt_local_supports(local_mt, prompt1);
        final SubLObject local_supports2 = rkf_sd_prompt_local_supports(local_mt, prompt2);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != hlmt.hlmt_p(local_mt) && ((rkf_salient_descriptor_prompter.NIL != local_supports1 && rkf_salient_descriptor_prompter.NIL == local_supports2) || rkf_salient_descriptor_prompter.NIL != rkf_sd_more_recent_supportsP(local_supports1, local_supports2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 25238L)
    public static SubLObject rkf_sd_prompt_local_supports(final SubLObject local_mt, final SubLObject prompt) {
        final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt);
        final SubLObject supports = (SubLObject)((rkf_salient_descriptor_prompter.NIL != arguments.supports_p(justification)) ? justification : rkf_salient_descriptor_prompter.NIL);
        return list_utilities.find_all(local_mt, supports, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQ), (SubLObject)rkf_salient_descriptor_prompter.$sym41$SUPPORT_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 25485L)
    public static SubLObject rkf_sd_more_recent_supportsP(final SubLObject supports1, final SubLObject supports2) {
        final SubLObject times1 = list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor_prompter.$sym42$UNIVERSAL_DATE_P, Mapping.mapcar((SubLObject)rkf_salient_descriptor_prompter.$sym43$ASSERTED_WHEN, list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor_prompter.$sym44$ASSERTION_P, supports1, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject times2 = list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor_prompter.$sym42$UNIVERSAL_DATE_P, Mapping.mapcar((SubLObject)rkf_salient_descriptor_prompter.$sym43$ASSERTED_WHEN, list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor_prompter.$sym44$ASSERTION_P, supports2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != times1 && rkf_salient_descriptor_prompter.NIL != times2 && number_utilities.maximum(times1, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED).numG(number_utilities.maximum(times2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 25874L)
    public static SubLObject rkf_sd_prompt_generalityL(final SubLObject prompt1, final SubLObject prompt2) {
        final SubLObject sentence1 = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt1);
        final SubLObject sentence2 = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt2);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != el_utilities.el_formula_p(sentence1) && rkf_salient_descriptor_prompter.NIL != el_utilities.el_formula_p(sentence2) && rkf_salient_descriptor_prompter.NIL != rkf_sd_sentence_generalityL(sentence1, sentence2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26206L)
    public static SubLObject rkf_sd_sentence_generalityL(final SubLObject sentence1, final SubLObject sentence2) {
        SubLObject terms1 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject terms2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject cdolist_list_var;
        SubLObject terms3 = cdolist_list_var = cycl_utilities.formula_terms(sentence1, (SubLObject)rkf_salient_descriptor_prompter.$kw45$IGNORE);
        SubLObject term1 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        term1 = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor_prompter.NIL == cycl_utilities.expression_find(term1, sentence2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                final SubLObject item_var = term1;
                if (rkf_salient_descriptor_prompter.NIL == conses_high.member(item_var, terms1, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.IDENTITY))) {
                    terms1 = (SubLObject)ConsesLow.cons(item_var, terms1);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            term1 = cdolist_list_var.first();
        }
        terms3 = (cdolist_list_var = cycl_utilities.formula_terms(sentence2, (SubLObject)rkf_salient_descriptor_prompter.$kw45$IGNORE));
        SubLObject term2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        term2 = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor_prompter.NIL == cycl_utilities.expression_find(term2, sentence1, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                final SubLObject item_var = term2;
                if (rkf_salient_descriptor_prompter.NIL == conses_high.member(item_var, terms2, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQL), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.IDENTITY))) {
                    terms2 = (SubLObject)ConsesLow.cons(item_var, terms2);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            term2 = cdolist_list_var.first();
        }
        return Numbers.numL(rkf_sd_terms_generality(terms1), rkf_sd_terms_generality(terms2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26740L)
    public static SubLObject rkf_sd_sentence_generality(final SubLObject sentence) {
        return Functions.apply(Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.$sym46$_), Mapping.mapcar((SubLObject)rkf_salient_descriptor_prompter.$sym47$RKF_SD_TERM_GENERALITY, cycl_utilities.formula_args(sentence, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26873L)
    public static SubLObject rkf_sd_terms_generality(final SubLObject terms) {
        return Functions.apply(Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.$sym46$_), Mapping.mapcar((SubLObject)rkf_salient_descriptor_prompter.$sym47$RKF_SD_TERM_GENERALITY, terms));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26982L)
    public static SubLObject rkf_sd_term_generality(final SubLObject v_term) {
        return cardinality_estimates.generality_estimate(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27065L)
    public static SubLObject rkf_sd_prompt_fewer_lits_p(final SubLObject prompt1, final SubLObject prompt2) {
        final SubLObject count1 = rkf_sd_prompt_min_lit_count(prompt1);
        final SubLObject count2 = rkf_sd_prompt_min_lit_count(prompt2);
        return (SubLObject)SubLObjectFactory.makeBoolean(count1.isInteger() && (!count2.isInteger() || count1.numL(count2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27325L)
    public static SubLObject rkf_sd_prompt_min_lit_count(final SubLObject prompt) {
        SubLObject min = (SubLObject)rkf_salient_descriptor_prompter.$kw2$NONE;
        SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt);
        SubLObject cnf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cnf = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            final SubLObject count = rkf_sd_cnf_lit_count(cnf);
            if (count.isInteger() && (min == rkf_salient_descriptor_prompter.$kw2$NONE || count.numL(min))) {
                min = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        }
        return min;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27627L)
    public static SubLObject rkf_sd_cnf_lit_count(final SubLObject cnf) {
        return Numbers.add(Sequences.length(clauses.pos_lits(cnf)), Sequences.length(clauses.neg_lits(cnf)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 28555L)
    public static SubLObject with_rkf_salient_descriptor_seed_term_tactics_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject table = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list49);
        table = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym50$PROGN, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym51$CHECK_TYPE, table, (SubLObject)rkf_salient_descriptor_prompter.$list52), (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_, table)), ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_prompter.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list49);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 28818L)
    public static SubLObject rkf_sd_prompter_tactics_for_seed_term_type(final SubLObject seed_term_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.getDynamicValue(thread), seed_term_type, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 28969L)
    public static SubLObject rkf_sd_prompter_compute_seed_term_type(final SubLObject seed_term) {
        if (rkf_salient_descriptor_prompter.NIL != isa.isaP(seed_term, rkf_salient_descriptor_prompter.$const54$Microtheory, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw55$MT;
        }
        if (rkf_salient_descriptor_prompter.NIL != forts.fort_p(seed_term)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw56$FORT;
        }
        if (rkf_salient_descriptor_prompter.NIL != rkf_domain_examples.rkf_generic_example_p(seed_term)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw34$EXAMPLE_INSTANCE;
        }
        if (rkf_salient_descriptor_prompter.NIL == assertion_handles.assertion_p(seed_term)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw57$UNKNOWN;
        }
        if (rkf_salient_descriptor_prompter.NIL != assertions_high.gaf_assertionP(seed_term)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw58$GAF;
        }
        return (SubLObject)rkf_salient_descriptor_prompter.$kw59$RULE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 29328L)
    public static SubLObject formula_template_fort_for_rkf_salient_descriptor_prompt(final SubLObject prompt, final SubLObject topic_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) : prompt;
        assert rkf_salient_descriptor_prompter.NIL != forts.fort_p(topic_id) : topic_id;
        final SubLObject raw_formula = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula(prompt);
        final SubLObject formula = rkf_salient_descriptor.rkf_sd_existentially_unbind(raw_formula);
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter(prompt);
        final SubLObject focal_term = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject el_focal_term = cycl_utilities.hl_to_el(focal_term);
        SubLObject example_sentences = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject data_assert_mt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject single_entryP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$13 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    final SubLObject prompter_mt = rkf_salient_descriptor_prompter_mt(prompter);
                    example_sentences = rkf_sd_prompt_get_precedent_example_sentences(prompt, focal_term);
                    data_assert_mt = rkf_sd_fet_data_assert_mt(formula, prompter_mt);
                    single_entryP = rkf_sd_single_entry_promptP(prompt, prompter_mt);
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$13, thread);
            }
        }
        finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        return find_or_create_formula_template_fort(topic_id, el_focal_term, formula, example_sentences, data_assert_mt, single_entryP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 30390L)
    public static SubLObject find_or_create_formula_template_fort(final SubLObject topic_id, final SubLObject el_focal_term, final SubLObject formula, final SubLObject example_sentences, final SubLObject data_assert_mt, final SubLObject single_entryP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focal_term_arg_position = cycl_utilities.arg_positions_bfs(el_focal_term, formula, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQUAL)).first();
        final SubLObject candidate_replacement_info = rkf_sd_candidate_replacement_info(focal_term_arg_position, formula);
        if (rkf_salient_descriptor_prompter.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && rkf_salient_descriptor_prompter.NIL == cycl_utilities.arg_position_p(focal_term_arg_position)) {
            Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str61$Couldn_t_find__S_in__S_, el_focal_term, formula);
        }
        thread.resetMultipleValues();
        final SubLObject definitional_properties = formula_template_definitional_properties(focal_term_arg_position, topic_id, candidate_replacement_info, formula, example_sentences, single_entryP, data_assert_mt);
        final SubLObject match_properties = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject template_fort = rkf_sd_fet_find_match(match_properties, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL == template_fort) {
            template_fort = rkf_sd_new_formula_template_fort(topic_id);
            SubLObject cdolist_list_var = definitional_properties;
            SubLObject property = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            property = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                final SubLObject sentence = properties.property_to_sentence(property, template_fort);
                rkf_sd_fet_assert(sentence);
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            }
        }
        return template_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 31502L)
    public static SubLObject formula_template_definitional_properties(final SubLObject focal_term_arg_position, final SubLObject topic_id, final SubLObject candidate_replacement_info, final SubLObject formula, final SubLObject example_sentences, final SubLObject single_entryP, final SubLObject data_assert_mt) {
        SubLObject definitional_properties = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject match_properties = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject template = (SubLObject)rkf_salient_descriptor_prompter.$kw62$TEMPLATE;
        definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const63$focalTermPositionForFormulaTempla, template, cycl_utilities.make_cycl_arg_position(focal_term_arg_position), topic_id), template), definitional_properties);
        definitional_properties = (match_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const64$formulaForFormulaTemplate, template, formula), template), definitional_properties));
        SubLObject cdolist_list_var = example_sentences;
        SubLObject example_sentence = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        example_sentence = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const65$formulaTemplateExample, template, example_sentence), template), definitional_properties);
            cdolist_list_var = cdolist_list_var.rest();
            example_sentence = cdolist_list_var.first();
        }
        SubLObject order = (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER;
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor_prompter.$int66$100;
        SubLObject cdolist_list_var2 = candidate_replacement_info;
        SubLObject cons = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cons = cdolist_list_var2.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject arg_pos = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject info = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list67);
            arg_pos = current.first();
            current = (info = current.rest());
            final SubLObject cycl_arg_pos = cycl_utilities.make_cycl_arg_position(arg_pos);
            SubLObject current_$16;
            final SubLObject datum_$15 = current_$16 = info;
            SubLObject gloss = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject collection = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject explanation = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$15, (SubLObject)rkf_salient_descriptor_prompter.$list68);
            gloss = current_$16.first();
            current_$16 = current_$16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$15, (SubLObject)rkf_salient_descriptor_prompter.$list68);
            collection = current_$16.first();
            current_$16 = current_$16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$15, (SubLObject)rkf_salient_descriptor_prompter.$list68);
            explanation = current_$16.first();
            current_$16 = current_$16.rest();
            if (rkf_salient_descriptor_prompter.NIL == current_$16) {
                if (cardinality_estimates.generality_estimate(collection).numG(generality_cutoff) || (rkf_salient_descriptor_prompter.NIL != el_utilities.el_formula_with_operator_p(collection, rkf_salient_descriptor_prompter.$const69$SpecsFn) && cardinality_estimates.generality_estimate(cycl_utilities.nat_arg1(collection, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)).numG(generality_cutoff))) {
                    definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const70$templateReplacementsInvisibleForP, template, cycl_arg_pos), template), definitional_properties);
                }
                else {
                    definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const71$candidateReplacementForPosition, template, cycl_arg_pos, collection), template), definitional_properties);
                }
                definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const72$glossForFormulaTemplate, template, topic_id, cycl_arg_pos, gloss, order), template), definitional_properties);
                definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const73$formulaTemplateArgExplanation, template, topic_id, cycl_arg_pos, explanation), template), definitional_properties);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$15, (SubLObject)rkf_salient_descriptor_prompter.$list68);
            }
            order = Numbers.add(order, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        }
        definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const74$assertMtForFormulaTemplate, template, data_assert_mt), template), definitional_properties);
        definitional_properties = (SubLObject)ConsesLow.cons(properties.sentence_to_property((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const75$assertionFormatForFormulaTemplate, template, (rkf_salient_descriptor_prompter.NIL != single_entryP) ? rkf_salient_descriptor_prompter.$const76$SingleAssertionEntry : rkf_salient_descriptor_prompter.$const77$MultipleAssertionEntry, topic_id), template), definitional_properties);
        return Values.values(definitional_properties, match_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 34036L)
    public static SubLObject rkf_sd_fet_data_assert_mt(final SubLObject formula, final SubLObject prompter_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject principled_mt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject unprincipled_mt = rkf_salient_descriptor_prompter.$const78$DataForNLMt;
        if (rkf_salient_descriptor_prompter.NIL != Symbols.fboundp((SubLObject)rkf_salient_descriptor_prompter.$sym79$SUGGEST_MT)) {
            principled_mt = Eval.eval((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym79$SUGGEST_MT, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym80$QUOTE, formula)));
        }
        else {
            final SubLObject mt_var = (SubLObject)rkf_salient_descriptor_prompter.$sym81$_MT;
            principled_mt = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const82$defaultDefiningMtForSentence, formula, mt_var), prompter_mt, (SubLObject)ConsesLow.list(new SubLObject[] { rkf_salient_descriptor_prompter.$kw83$MAX_NUMBER, rkf_salient_descriptor_prompter.ONE_INTEGER, rkf_salient_descriptor_prompter.$kw84$MAX_TRANSFORMATION_DEPTH, rkf_salient_descriptor_prompter.ONE_INTEGER, rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread), rkf_salient_descriptor_prompter.$kw85$MAX_TIME, rkf_salient_descriptor_prompter.$int86$30, rkf_salient_descriptor_prompter.$kw87$RETURN, ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$kw62$TEMPLATE, mt_var) })).first();
        }
        return (rkf_salient_descriptor_prompter.NIL != principled_mt) ? principled_mt : unprincipled_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 34750L)
    public static SubLObject rkf_sd_fet_find_match(final SubLObject definitional_properties, SubLObject mt) {
        if (mt == rkf_salient_descriptor_prompter.UNPROVIDED) {
            mt = rkf_salient_descriptor_prompter.$const88$GKEFormulaTemplatesMt;
        }
        SubLObject definitional_lits = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject template_var = variables.get_variable((SubLObject)rkf_salient_descriptor_prompter.ZERO_INTEGER);
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject match = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == badP) {
            SubLObject csome_list_var = definitional_properties;
            SubLObject property = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            property = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                final SubLObject sentence = properties.property_to_sentence(property, template_var);
                if (rkf_salient_descriptor_prompter.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
                    definitional_lits = (SubLObject)ConsesLow.cons(sentence, definitional_lits);
                }
                else {
                    badP = (SubLObject)rkf_salient_descriptor_prompter.T;
                }
                csome_list_var = csome_list_var.rest();
                property = csome_list_var.first();
            }
        }
        if (rkf_salient_descriptor_prompter.NIL == badP) {
            final SubLObject neg_lits = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            final SubLObject dnf = clauses.make_clause(neg_lits, definitional_lits);
            final SubLObject answers = inference_kernel.new_cyc_query_from_dnf(dnf, mt, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$kw87$RETURN, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$kw62$TEMPLATE, template_var), (SubLObject)rkf_salient_descriptor_prompter.$list89));
            match = answers.first();
        }
        return match;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 35521L)
    public static SubLObject rkf_sd_fet_assert(final SubLObject sentence) {
        SubLObject result = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject template_info_mt = rkf_salient_descriptor_prompter.$const88$GKEFormulaTemplatesMt;
        result = rkf_assertion_utilities.rkf_assert_now(sentence, template_info_mt);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 35784L)
    public static SubLObject rkf_sd_new_formula_template_fort(final SubLObject topic_id) {
        final SubLObject focal_term_type = formula_template_utilities.focal_term_type_for_topic_type(topic_id, rkf_salient_descriptor_prompter.$const90$InferencePSC);
        final SubLObject collection = (rkf_salient_descriptor_prompter.NIL != forts.fort_p(focal_term_type)) ? focal_term_type : ((rkf_salient_descriptor_prompter.NIL != forts.fort_p(topic_id)) ? topic_id : rkf_salient_descriptor_prompter.$const91$FormulaTemplate);
        final SubLObject name = rkf_term_utilities.rkf_new_constant_name_from_collection(collection);
        final SubLObject template_id = ke.ke_create_now(name, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL != constant_handles.valid_constantP(template_id, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
            rkf_sd_fet_assert((SubLObject)ConsesLow.listS(rkf_salient_descriptor_prompter.$const92$isa, template_id, (SubLObject)rkf_salient_descriptor_prompter.$list93));
            rkf_sd_fet_assert((SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const94$formulaTemplateHasType, template_id, topic_id));
            final SubLObject pred = constants_high.find_constant((SubLObject)rkf_salient_descriptor_prompter.$str95$constantNameAutoGeneratedFromColl);
            if (rkf_salient_descriptor_prompter.NIL != pred) {
                rkf_assertion_utilities.rkf_assert_now(el_utilities.make_ternary_formula(pred, template_id, collection, name), rkf_salient_descriptor_prompter.$const96$BaseKB);
            }
        }
        return template_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 36558L)
    public static SubLObject rkf_sd_candidate_replacement_info(final SubLObject focal_term_arg_position, final SubLObject formula) {
        SubLObject ans = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject focal_term = cycl_utilities.formula_arg_position(formula, focal_term_arg_position, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_if_bfs((SubLObject)rkf_salient_descriptor_prompter.$sym97$RKF_GENERIC_EXAMPLE_P, formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject arg_position = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        arg_position = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            final SubLObject v_term = cycl_utilities.formula_arg_position(formula, arg_position, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            if (!v_term.equal(focal_term)) {
                final SubLObject gloss = formula_template_utilities.make_fet_gloss_for_arg_position(arg_position, formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                final SubLObject explanation = formula_template_utilities.make_fet_explanation_for_arg_position(arg_position, focal_term_arg_position, formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                final SubLObject collection = cycl_utilities.nat_arg1(v_term, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                ans = list_utilities.alist_enter(ans, arg_position, (SubLObject)ConsesLow.list(gloss, collection, explanation), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_position = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 37306L)
    public static SubLObject rkf_sd_prompt_get_var_arg_positions(final SubLObject prompt, final SubLObject formula) {
        SubLObject arg_positions = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
        SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        subprompt = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
            if (rkf_salient_descriptor_prompter.NIL != cycl_variables.el_varP(var)) {
                final SubLObject var_arg_positions = cycl_utilities.arg_positions_bfs(var, formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                arg_positions = ConsesLow.append(arg_positions, var_arg_positions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subprompt = cdolist_list_var.first();
        }
        return arg_positions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 37732L)
    public static SubLObject rkf_sd_prompt_get_precedent_example_sentences(final SubLObject prompt, final SubLObject focal_term) {
        SubLObject example_sentences = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
        SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        subprompt = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            final SubLObject examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
            if (examples.isList()) {
                final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                final SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, (SubLObject)rkf_salient_descriptor_prompter.$kw98$ANYTHING, var);
                SubLObject cdolist_list_var_$17 = examples;
                SubLObject example = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                example = cdolist_list_var_$17.first();
                while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var_$17) {
                    if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_sd_precedent_example_p(example)) {
                        final SubLObject type = rkf_salient_descriptor_datastructures.rkf_sd_example_type(example);
                        final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
                        final SubLObject supports = rkf_salient_descriptor_datastructures.rkf_sd_example_supports(example);
                        final SubLObject focus_term_analog = rkf_salient_descriptor_datastructures.rkf_sd_example_focus_term_analog(example);
                        final SubLObject template = cycl_utilities.expression_subst(focus_term_analog, focal_term, assert_sentence_template, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                        SubLObject cdolist_list_var_$18 = supports;
                        SubLObject support = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                        support = cdolist_list_var_$18.first();
                        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var_$18) {
                            if (rkf_salient_descriptor_prompter.NIL != formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), template)) {
                                example_sentences = (SubLObject)ConsesLow.cons(arguments.support_sentence(support), example_sentences);
                            }
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            support = cdolist_list_var_$18.first();
                        }
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    example = cdolist_list_var_$17.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subprompt = cdolist_list_var.first();
        }
        return example_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 38689L)
    public static SubLObject rkf_sd_single_entry_promptP(final SubLObject prompt, final SubLObject mt) {
        SubLObject failP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == failP) {
            SubLObject csome_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            subprompt = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == failP && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                final SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, (SubLObject)rkf_salient_descriptor_prompter.$kw99$FOCAL_TERM, var);
                final SubLObject single_entryP = rkf_salient_descriptor.rkf_salient_descriptor_single_entry_varP(var, assert_sentence_template, mt);
                failP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == single_entryP);
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 39193L)
    public static SubLObject rkf_sd_hide_specs_fn_replacements(final SubLObject template_fort) {
        final SubLObject formula = kb_mapping_utilities.fpred_value_in_any_mt(template_fort, rkf_salient_descriptor_prompter.$const64$formulaForFormulaTemplate, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject specs_fn_positions = cdolist_list_var = (SubLObject)((rkf_salient_descriptor_prompter.NIL != el_utilities.elf_p(formula)) ? cycl_utilities.arg_positions_bfs(rkf_salient_descriptor_prompter.$const69$SpecsFn, formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) : rkf_salient_descriptor_prompter.NIL);
        SubLObject specs_fn_position = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        specs_fn_position = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor_prompter.NIL != list_utilities.lengthG(specs_fn_position, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) && rkf_salient_descriptor_prompter.NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.formula_arg_position(formula, conses_high.butlast(specs_fn_position, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED), rkf_salient_descriptor_prompter.$const100$SomeExampleFn)) {
                final SubLObject type = cycl_utilities.formula_arg_position(formula, list_utilities.replace_last(specs_fn_position, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                if (rkf_salient_descriptor_prompter.NIL != forts.fort_p(type)) {
                    if (!cardinality_estimates.generality_estimate(type).numL((SubLObject)rkf_salient_descriptor_prompter.$int66$100)) {
                        final SubLObject type_pos = cycl_utilities.make_cycl_arg_position(conses_high.butlast(specs_fn_position, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER));
                        final SubLObject sentence = (SubLObject)ConsesLow.list(rkf_salient_descriptor_prompter.$const70$templateReplacementsInvisibleForP, template_fort, type_pos);
                        if (rkf_salient_descriptor_prompter.NIL == kb_indexing.find_assertion_any_mt((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)ConsesLow.list(sentence)))) {
                            rkf_sd_fet_assert(sentence);
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            specs_fn_position = cdolist_list_var.first();
        }
        return template_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 40222L)
    public static SubLObject prune_rkf_sd_formula_template_topic(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focal_term_type = kb_mapping_utilities.fpred_value_in_any_mt(topic, rkf_salient_descriptor_prompter.$const101$focalTermTypeForInducedTemplateTy, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL != focal_term_type) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_salient_descriptor_prompter.$sym102$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rkf_salient_descriptor_prompter.$const103$EverythingPSC, thread);
                SubLObject cdolist_list_var = (SubLObject)rkf_salient_descriptor_prompter.$list121;
                SubLObject pred = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                pred = cdolist_list_var.first();
                while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                    final SubLObject pred_var = pred;
                    if (rkf_salient_descriptor_prompter.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                        final SubLObject token_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                        while (rkf_salient_descriptor_prompter.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (rkf_salient_descriptor_prompter.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor_prompter.$kw58$GAF, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                    SubLObject done_var_$19 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    final SubLObject token_var_$20 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    while (rkf_salient_descriptor_prompter.NIL == done_var_$19) {
                                        final SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(template_gaf));
                                        if (rkf_salient_descriptor_prompter.NIL != valid_$21) {
                                            final SubLObject template = assertions_high.gaf_arg1(template_gaf);
                                            final SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt(template, rkf_salient_descriptor_prompter.$const64$formulaForFormulaTemplate, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                            final SubLObject bin_pred = (SubLObject)((rkf_salient_descriptor_prompter.NIL != template_formula) ? cycl_utilities.formula_arg0(template_formula) : rkf_salient_descriptor_prompter.NIL);
                                            if (rkf_salient_descriptor_prompter.NIL != kb_accessors.binary_predicateP(bin_pred)) {
                                                SubLObject found_genlP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                if (rkf_salient_descriptor_prompter.NIL == found_genlP) {
                                                    SubLObject node_var = focal_term_type;
                                                    final SubLObject deck_type = (SubLObject)rkf_salient_descriptor_prompter.$kw106$STACK;
                                                    final SubLObject recur_deck = deck.create_deck(deck_type);
                                                    final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        try {
                                                            final SubLObject tv_var = rkf_salient_descriptor_prompter.$const107$True_JustificationTruth;
                                                            final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor_prompter.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != tv_var) ? rkf_salient_descriptor_prompter.$sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                                if (rkf_salient_descriptor_prompter.NIL != tv_var && rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw109$ERROR)) {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                    }
                                                                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw112$CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                    }
                                                                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw114$WARN)) {
                                                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                                                    }
                                                                    else {
                                                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                        Errors.cerror((SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                                                    }
                                                                }
                                                                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor_prompter.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(focal_term_type, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) {
                                                                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                            while (rkf_salient_descriptor_prompter.NIL != node_var && rkf_salient_descriptor_prompter.NIL == found_genlP) {
                                                                                final SubLObject genl = node_var;
                                                                                if (!genl.eql(focal_term_type) && rkf_salient_descriptor_prompter.NIL != focal_term_type_has_template_with_bin_predP(genl, bin_pred)) {
                                                                                    found_genlP = (SubLObject)rkf_salient_descriptor_prompter.T;
                                                                                    Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str117$Redundant_with__S_____S_on__S, genl, bin_pred, focal_term_type);
                                                                                }
                                                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls));
                                                                                SubLObject rest;
                                                                                SubLObject module_var;
                                                                                SubLObject _prev_bind_0_$26;
                                                                                SubLObject _prev_bind_1_$27;
                                                                                SubLObject node;
                                                                                SubLObject d_link;
                                                                                SubLObject mt_links;
                                                                                SubLObject iteration_state;
                                                                                SubLObject mt;
                                                                                SubLObject tv_links;
                                                                                SubLObject _prev_bind_0_$27;
                                                                                SubLObject iteration_state_$33;
                                                                                SubLObject tv;
                                                                                SubLObject link_nodes;
                                                                                SubLObject _prev_bind_0_$28;
                                                                                SubLObject sol;
                                                                                SubLObject set_contents_var;
                                                                                SubLObject basis_object;
                                                                                SubLObject state;
                                                                                SubLObject node_vars_link_node;
                                                                                SubLObject csome_list_var;
                                                                                SubLObject node_vars_link_node2;
                                                                                SubLObject new_list;
                                                                                SubLObject rest_$35;
                                                                                SubLObject generating_fn;
                                                                                SubLObject _prev_bind_0_$29;
                                                                                SubLObject sol2;
                                                                                SubLObject link_nodes2;
                                                                                SubLObject set_contents_var2;
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                SubLObject csome_list_var2;
                                                                                SubLObject node_vars_link_node4;
                                                                                for (rest = (SubLObject)rkf_salient_descriptor_prompter.NIL, rest = accessible_modules; rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL != rest; rest = rest.rest()) {
                                                                                    module_var = rest.first();
                                                                                    _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                                        node = function_terms.naut_to_nart(node_var);
                                                                                        if (rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                                                            if (rkf_salient_descriptor_prompter.NIL != d_link) {
                                                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                                                                if (rkf_salient_descriptor_prompter.NIL != mt_links) {
                                                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                        tv_links = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (rkf_salient_descriptor_prompter.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                            _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                        _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                            sol = link_nodes;
                                                                                                                            if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol)) {
                                                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                                    if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            else if (sol.isList()) {
                                                                                                                                if (rkf_salient_descriptor_prompter.NIL == found_genlP) {
                                                                                                                                    csome_list_var = sol;
                                                                                                                                    node_vars_link_node2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                                    while (rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                                                                                                                                        if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                                        }
                                                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            else {
                                                                                                                                Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                                                                                            }
                                                                                                            finally {
                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str119$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                        else if (rkf_salient_descriptor_prompter.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                            new_list = ((rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
                                                                                            for (rest_$35 = (SubLObject)rkf_salient_descriptor_prompter.NIL, rest_$35 = new_list; rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL != rest_$35; rest_$35 = rest_$35.rest()) {
                                                                                                generating_fn = rest_$35.first();
                                                                                                _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                                                    if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol2)) {
                                                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol2.isList()) {
                                                                                                        if (rkf_salient_descriptor_prompter.NIL == found_genlP) {
                                                                                                            csome_list_var2 = sol2;
                                                                                                            node_vars_link_node4 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                                            while (rkf_salient_descriptor_prompter.NIL == found_genlP && rkf_salient_descriptor_prompter.NIL != csome_list_var2) {
                                                                                                                if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$25, thread);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str120$Node__a_does_not_pass_sbhl_type_t, focal_term_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$24, thread);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$24, thread);
                                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$23, thread);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$22, thread);
                                                    }
                                                }
                                                if (rkf_salient_descriptor_prompter.NIL != found_genlP) {
                                                    rkf_term_utilities.rkf_kill(template);
                                                }
                                            }
                                        }
                                        done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid_$21);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (rkf_salient_descriptor_prompter.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (rkf_salient_descriptor_prompter.NIL == formula_templates.fet_topic_fort_has_templatesP(topic, rkf_salient_descriptor_prompter.$const90$InferencePSC)) {
                Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str122$Hey_ho___S_has_got_to_go___, topic);
                rkf_term_utilities.rkf_kill(topic);
            }
        }
        return topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 41385L)
    public static SubLObject focal_term_type_has_template_with_bin_predP(final SubLObject type, final SubLObject bin_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject topic = formula_template_utilities.induction_topic_type_for_collection(type);
        if (rkf_salient_descriptor_prompter.NIL != nart_handles.nart_p(topic)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_salient_descriptor_prompter.$sym102$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rkf_salient_descriptor_prompter.$const103$EverythingPSC, thread);
                SubLObject cdolist_list_var = (SubLObject)rkf_salient_descriptor_prompter.$list121;
                SubLObject pred = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                pred = cdolist_list_var.first();
                while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                    final SubLObject pred_var = pred;
                    if (rkf_salient_descriptor_prompter.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, pred_var);
                        SubLObject done_var = foundP;
                        final SubLObject token_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                        while (rkf_salient_descriptor_prompter.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (rkf_salient_descriptor_prompter.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor_prompter.$kw58$GAF, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                    SubLObject done_var_$39 = foundP;
                                    final SubLObject token_var_$40 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    while (rkf_salient_descriptor_prompter.NIL == done_var_$39) {
                                        final SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        final SubLObject valid_$41 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$40.eql(template_gaf));
                                        if (rkf_salient_descriptor_prompter.NIL != valid_$41) {
                                            final SubLObject template = assertions_high.gaf_arg1(template_gaf);
                                            final SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt(template, rkf_salient_descriptor_prompter.$const64$formulaForFormulaTemplate, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                            final SubLObject this_bin_pred = (SubLObject)((rkf_salient_descriptor_prompter.NIL != template_formula) ? cycl_utilities.formula_arg0(template_formula) : rkf_salient_descriptor_prompter.NIL);
                                            foundP = Equality.eql(bin_pred, this_bin_pred);
                                        }
                                        done_var_$39 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid_$41 || rkf_salient_descriptor_prompter.NIL != foundP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (rkf_salient_descriptor_prompter.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid || rkf_salient_descriptor_prompter.NIL != foundP);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 42108L)
    public static SubLObject rkf_induced_salient_descriptor_prompts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_salient_descriptor_prompter.NIL != fort_types_interface.isa_collectionP(focal_term_type, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) : focal_term_type;
        SubLObject prompts = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject table = (SubLObject)rkf_salient_descriptor_prompter.$list124;
        assert rkf_salient_descriptor_prompter.NIL != list_utilities.alist_p(table) : table;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.currentBinding(thread);
        try {
            rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.bind(table, thread);
            prompts = rkf_salient_descriptor_prompts_for_focal_term_type(focal_term_type, elmt);
        }
        finally {
            rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$.rebind(_prev_bind_0, thread);
        }
        return prompts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 42703L)
    public static SubLObject rkf_salient_descriptor_prompts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt) {
        assert rkf_salient_descriptor_prompter.NIL != fort_types_interface.isa_collectionP(focal_term_type, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) : focal_term_type;
        final SubLObject focal_term = rkf_domain_examples.rkf_generic_example_for_collection(focal_term_type);
        final SubLObject prompter = rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter(focal_term, elmt);
        SubLObject prompts = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        for (SubLObject prompt = rkf_salient_descriptor_prompter_next(prompter, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED); rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt); prompt = rkf_salient_descriptor_prompter_next(prompter, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
            prompts = (SubLObject)ConsesLow.cons(prompt, prompts);
        }
        return Sequences.nreverse(prompts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 43333L)
    public static SubLObject rkf_sd_prompter_apply_tactics(final SubLObject prompter) {
        SubLObject result = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw23$LOCK, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        try {
            release = Locks.seize_lock(lock);
            if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompter_tactics_exhausted_p(prompter)) {
                result = (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
            }
            else {
                final SubLObject tactic = rkf_sd_prompter_tactics_next(prompter);
                result = rkf_sd_prompter_apply_tactic(prompter, tactic);
            }
        }
        finally {
            if (rkf_salient_descriptor_prompter.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 43801L)
    public static SubLObject rkf_sd_prompter_exhausted_p(final SubLObject prompter) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter) && rkf_salient_descriptor_prompter.NIL != set.set_emptyP(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44035L)
    public static SubLObject rkf_sd_prompter_tactics_exhausted_p(final SubLObject prompter) {
        return Types.sublisp_null(rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44150L)
    public static SubLObject rkf_sd_prompter_tactics_next(final SubLObject prompter) {
        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompter_tactics_exhausted_p(prompter)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw126$EXHAUSTED;
        }
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44343L)
    public static SubLObject rkf_sd_prompter_apply_tactic(final SubLObject prompter, final SubLObject tactic) {
        if (rkf_salient_descriptor_prompter.NIL == Symbols.fboundp(tactic)) {
            rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics(prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).rest());
        }
        else {
            final SubLObject result = Functions.funcall(tactic, prompter);
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw27$LAST_TACTIC, tactic);
            if (rkf_salient_descriptor_prompter.$kw19$DONE == result) {
                rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics(prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).rest());
                return (SubLObject)rkf_salient_descriptor_prompter.$kw22$TACTIC_DONE;
            }
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44843L)
    public static SubLObject with_sd_tactic_disabled_for_seed_term_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list127);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject seed_term_type = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject tactic = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list127);
        seed_term_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list127);
        tactic = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tactics_for_seed_term_type = (SubLObject)rkf_salient_descriptor_prompter.$sym128$TACTICS_FOR_SEED_TERM_TYPE;
            final SubLObject tactics_table_copy = (SubLObject)rkf_salient_descriptor_prompter.$sym129$TACTICS_TABLE_COPY;
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tactics_for_seed_term_type, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym130$REMOVE, tactic, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type), (SubLObject)rkf_salient_descriptor_prompter.$list132)), reader.bq_cons(tactics_table_copy, (SubLObject)rkf_salient_descriptor_prompter.$list133), (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym134$ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, (SubLObject)rkf_salient_descriptor_prompter.$list132))), ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_prompter.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list127);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 45346L)
    public static SubLObject with_sd_tactics_disabled_for_seed_term_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list135);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject seed_term_type = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject tactics = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list135);
        seed_term_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list135);
        tactics = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tactics_for_seed_term_type = (SubLObject)rkf_salient_descriptor_prompter.$sym136$TACTICS_FOR_SEED_TERM_TYPE;
            final SubLObject tactics_table_copy = (SubLObject)rkf_salient_descriptor_prompter.$sym137$TACTICS_TABLE_COPY;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym50$PROGN, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym51$CHECK_TYPE, tactics, (SubLObject)rkf_salient_descriptor_prompter.$list138), (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tactics_for_seed_term_type, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym139$ORDERED_SET_DIFFERENCE, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type), tactics, (SubLObject)rkf_salient_descriptor_prompter.$list132)), reader.bq_cons(tactics_table_copy, (SubLObject)rkf_salient_descriptor_prompter.$list133), (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_, (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_prompter.$sym134$ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, (SubLObject)rkf_salient_descriptor_prompter.$list132))), ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_prompter.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list135);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 45931L)
    public static SubLObject rkf_sd_prompter_suggestion(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, rkf_salient_descriptor_prompter.$const140$keSuggestion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46059L)
    public static SubLObject rkf_sd_prompter_required(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, rkf_salient_descriptor_prompter.$const141$keRequirement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46186L)
    public static SubLObject rkf_sd_prompter_interaction_context_required(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, rkf_salient_descriptor_prompter.$const142$keInteractionRequirement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46344L)
    public static SubLObject rkf_sd_prompter_interaction_context_strong(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, rkf_salient_descriptor_prompter.$const143$keInteractionStrongSuggestion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46505L)
    public static SubLObject rkf_sd_prompter_add_ke_driven_prompts(final SubLObject prompter, final SubLObject salience_pred) {
        SubLObject fodder_to_add = rkf_sd_prompter_ke_driven_prompt_fodder(prompter, salience_pred);
        if (!fodder_to_add.isList()) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
        }
        if (rkf_salient_descriptor_prompter.NIL == fodder_to_add) {
            fodder_to_add = rkf_sd_prompter_compute_ke_driven_prompt_fodder(prompter, salience_pred);
            if (!fodder_to_add.isList()) {
                return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
            }
        }
        SubLObject current;
        final SubLObject datum = current = fodder_to_add;
        SubLObject formulas = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject justifications = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list144);
        formulas = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list144);
        justifications = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
            final SubLObject formula = formulas.first();
            final SubLObject justification = justifications.first();
            final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic(prompter);
            SubLObject remaining_fodder = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            if (rkf_salient_descriptor_prompter.NIL != formulas.rest()) {
                remaining_fodder = (SubLObject)ConsesLow.list(formulas.rest(), justifications.rest());
            }
            else if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompter_iterative_prompt_method_p(salience_pred)) {
                remaining_fodder = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            }
            else {
                remaining_fodder = (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
            }
            rkf_sd_prompter_update_ke_driven_prompts(prompter, salience_pred, remaining_fodder);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, formula);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
            rkf_sd_prompter_add_prompt(prompter, new_prompt);
            return prompter;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list144);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 47909L)
    public static SubLObject rkf_sd_prompter_ke_driven_prompt_fodder(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLObject alist = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw145$KE_DRIVEN_PROMPTS, (SubLObject)rkf_salient_descriptor_prompter.NIL);
        return list_utilities.alist_lookup(alist, salience_pred, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 48131L)
    public static SubLObject rkf_sd_prompter_update_ke_driven_prompts(final SubLObject prompter, final SubLObject salience_pred, final SubLObject fodder) {
        final SubLObject old_alist = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw145$KE_DRIVEN_PROMPTS, (SubLObject)rkf_salient_descriptor_prompter.NIL);
        final SubLObject new_alist = list_utilities.alist_enter(old_alist, salience_pred, fodder, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw145$KE_DRIVEN_PROMPTS, new_alist);
        return fodder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 48476L)
    public static SubLObject rkf_sd_prompter_compute_ke_driven_prompt_fodder(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject formulas = rkf_sd_prompter_get_ke_driven_prompt_formulas(prompter, salience_pred);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)((rkf_salient_descriptor_prompter.NIL != formulas) ? ConsesLow.list(formulas, justifications) : rkf_salient_descriptor_prompter.$kw19$DONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 48758L)
    public static SubLObject rkf_sd_prompter_iterative_prompt_method_p(final SubLObject obj) {
        if (rkf_salient_descriptor_prompter.NIL != constant_handles.valid_constantP(obj, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
            return (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        if (obj == rkf_salient_descriptor_prompter.$sym146$RKF_NEIGHBOR_SUGGESTIONS) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49328L)
    public static SubLObject rkf_sd_prompter_get_ke_driven_prompt_formulas(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject justifications = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject _prev_bind_0 = rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$.currentBinding(thread);
        try {
            rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$.bind(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_, rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue(thread)), thread);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
            if (salience_pred.isFunctionSpec()) {
                thread.resetMultipleValues();
                final SubLObject formulas_$43 = Functions.funcall(salience_pred, seed_term, mt);
                final SubLObject justifications_$44 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                formulas = formulas_$43;
                justifications = justifications_$44;
            }
            else if (rkf_salient_descriptor_prompter.NIL != constant_handles.valid_constantP(salience_pred, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                SubLObject results_queue = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw148$RESULTS_QUEUE, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                SubLObject no_more_bindingsP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                final SubLObject _prev_bind_0_$45 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                    final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$46 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            SubLObject current;
                            final SubLObject datum = current = rkf_sd_prompter_ke_driven_inference_and_var(prompter, salience_pred);
                            SubLObject inference = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                            SubLObject formula_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list149);
                            inference = current.first();
                            current = (formula_var = current.rest());
                            while (rkf_salient_descriptor_prompter.NIL == formulas && rkf_salient_descriptor_prompter.NIL == no_more_bindingsP) {
                                final SubLObject max_depth_max = rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$.getDynamicValue(thread);
                                final SubLObject inference_max_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
                                final SubLObject max_depth = (rkf_salient_descriptor_prompter.NIL != inference_datastructures_inference.exhausted_inference_p(inference)) ? number_utilities.f_1X(inference_max_depth) : inference_max_depth;
                                no_more_bindingsP = Numbers.numG(max_depth, max_depth_max);
                                if (rkf_salient_descriptor_prompter.NIL == no_more_bindingsP) {
                                    thread.resetMultipleValues();
                                    final SubLObject new_formulas = rkf_salient_descriptor.rkf_salient_descriptor_formulas_one_batch(inference, max_depth, mt, formula_var, results_queue);
                                    final SubLObject new_justs = thread.secondMultipleValue();
                                    final SubLObject exit_condition = thread.thirdMultipleValue();
                                    final SubLObject more_results = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    results_queue = more_results;
                                    SubLObject new_formula = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    SubLObject new_formula_$47 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    SubLObject new_just = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    SubLObject new_just_$48 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                    new_formula = new_formulas;
                                    new_formula_$47 = new_formula.first();
                                    new_just = new_justs;
                                    new_just_$48 = new_just.first();
                                    while (rkf_salient_descriptor_prompter.NIL != new_just || rkf_salient_descriptor_prompter.NIL != new_formula) {
                                        if (rkf_salient_descriptor_prompter.NIL == rkf_sd_suppress_formula_for_seed_termP(new_formula_$47, seed_term, new_just_$48, mt)) {
                                            formulas = (SubLObject)ConsesLow.cons(new_formula_$47, formulas);
                                            justifications = (SubLObject)ConsesLow.cons(new_just_$48, justifications);
                                        }
                                        new_formula = new_formula.rest();
                                        new_formula_$47 = new_formula.first();
                                        new_just = new_just.rest();
                                        new_just_$48 = new_just.first();
                                    }
                                    if (rkf_salient_descriptor_prompter.$kw85$MAX_TIME == exit_condition) {
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str150$Timed_out_after__S_seconds_gettin, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), salience_pred, seed_term);
                                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor_prompter.T;
                                    }
                                    else if (rkf_salient_descriptor_prompter.$kw151$PROBABLY_APPROXIMATELY_DONE == exit_condition) {
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str152$P_A_D__getting__S_for__S___, salience_pred, seed_term);
                                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor_prompter.T;
                                    }
                                    else if (rkf_salient_descriptor_prompter.$kw153$EXHAUST_TOTAL == exit_condition) {
                                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor_prompter.T;
                                    }
                                    else {
                                        if (rkf_salient_descriptor_prompter.NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                                            continue;
                                        }
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str154$_S_is_not_continuable____Exit_con, inference, exit_condition);
                                        no_more_bindingsP = (SubLObject)rkf_salient_descriptor_prompter.T;
                                    }
                                }
                            }
                            if (rkf_salient_descriptor_prompter.NIL == formulas) {
                                inference_datastructures_inference.destroy_inference(inference);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                                    rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                            }
                        }
                    }
                    finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$46, thread);
                    }
                }
                finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$45, thread);
                }
                rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw148$RESULTS_QUEUE, results_queue);
            }
        }
        finally {
            rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(formulas, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 52058L)
    public static SubLObject rkf_sd_suppress_formula_for_seed_termP(final SubLObject formula, final SubLObject seed_term, final SubLObject justification, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject suppressP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue(thread)) {
            final SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(seed_term, justification);
            if (rkf_salient_descriptor_prompter.NIL != el_utilities.possibly_sentence_p(salient_property_sentence)) {
                final SubLObject seed_term_sentence = simplifier.conjoin((SubLObject)ConsesLow.list(salient_property_sentence, formula), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                final SubLObject seed_term_var = czer_utilities.unique_el_var_wrt_expression(seed_term_sentence, (SubLObject)rkf_salient_descriptor_prompter.$sym155$_SEED_TERM);
                final SubLObject query_formula = cycl_utilities.expression_subst(seed_term_var, seed_term, seed_term_sentence, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                final SubLObject threshold = rkf_sd_suppress_formula_threshold(salient_property_sentence, seed_term, mt);
                final SubLObject v_bindings = rkf_sd_suppress_formula_test_query(query_formula, mt, threshold);
                suppressP = list_utilities.lengthL(v_bindings, threshold, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                if (rkf_salient_descriptor_prompter.NIL != suppressP) {
                    Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str156$Suppressing_SD_prompt_for__S_____, seed_term, formula, threshold);
                }
            }
        }
        return suppressP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53099L)
    public static SubLObject rkf_sd_suppress_formula_threshold(final SubLObject salient_property_sentence, final SubLObject seed_term, final SubLObject mt) {
        final SubLObject salient_property = properties.sentence_to_property(salient_property_sentence, seed_term);
        return rkf_sd_suppress_formula_threshold_for_property(salient_property, mt, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53360L)
    public static SubLObject rkf_sd_suppress_formula_threshold_for_property_internal(final SubLObject salient_property, final SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count) {
        if (problem_store == rkf_salient_descriptor_prompter.UNPROVIDED) {
            problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
        }
        if (min_percent == rkf_salient_descriptor_prompter.UNPROVIDED) {
            min_percent = rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_percent_min$.getDynamicValue();
        }
        if (min_count == rkf_salient_descriptor_prompter.UNPROVIDED) {
            min_count = rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_count_min$.getDynamicValue();
        }
        final SubLObject salient_property_extent = properties.property_extent(salient_property, mt, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, problem_store));
        final SubLObject threshold_via_percent = Numbers.integerDivide(Numbers.multiply(Sequences.length(salient_property_extent), min_percent), (SubLObject)rkf_salient_descriptor_prompter.$int66$100);
        return Numbers.max(threshold_via_percent, min_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53360L)
    public static SubLObject rkf_sd_suppress_formula_threshold_for_property(final SubLObject salient_property, final SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count) {
        if (problem_store == rkf_salient_descriptor_prompter.UNPROVIDED) {
            problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
        }
        if (min_percent == rkf_salient_descriptor_prompter.UNPROVIDED) {
            min_percent = rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_percent_min$.getDynamicValue();
        }
        if (min_count == rkf_salient_descriptor_prompter.UNPROVIDED) {
            min_count = rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_count_min$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == v_memoization_state) {
            return rkf_sd_suppress_formula_threshold_for_property_internal(salient_property, mt, problem_store, min_percent, min_count);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor_prompter.$sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, (SubLObject)rkf_salient_descriptor_prompter.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.EQUAL, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(salient_property, mt, problem_store, min_percent, min_count);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (salient_property.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (problem_store.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (min_percent.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (rkf_salient_descriptor_prompter.NIL != cached_args && rkf_salient_descriptor_prompter.NIL == cached_args.rest() && min_count.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_suppress_formula_threshold_for_property_internal(salient_property, mt, problem_store, min_percent, min_count)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(salient_property, mt, problem_store, min_percent, min_count));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53924L)
    public static SubLObject rkf_sd_suppress_formula_test_query(final SubLObject query_formula, final SubLObject mt, final SubLObject threshold) {
        return inference_kernel.new_cyc_query(query_formula, mt, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.$kw83$MAX_NUMBER, threshold, (SubLObject)rkf_salient_descriptor_prompter.$kw18$PROBLEM_STORE, rkf_salient_descriptor.rkf_sd_find_or_make_problem_store()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 54137L)
    public static SubLObject rkf_sd_prompter_ke_driven_inference_and_var(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject cached_inferences = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw158$CACHED_INFERENCES, dictionary.new_dictionary((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
        SubLObject inference_and_var = dictionary.dictionary_lookup(cached_inferences, salience_pred, (SubLObject)rkf_salient_descriptor_prompter.$list159);
        SubLObject current;
        final SubLObject datum = current = inference_and_var;
        SubLObject inference = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list160);
        inference = current.first();
        current = (var = current.rest());
        if (rkf_salient_descriptor_prompter.NIL == inference_datastructures_inference.valid_inference_p(inference)) {
            final SubLObject formula_var = (SubLObject)rkf_salient_descriptor_prompter.$sym161$_FORMULA;
            final SubLObject inference_$50 = rkf_salient_descriptor.rkf_salient_descriptor_formulas_inference(seed_term, formula_var, salience_pred, mt);
            inference_and_var = (SubLObject)ConsesLow.cons(inference_$50, formula_var);
            dictionary.dictionary_enter(cached_inferences, salience_pred, inference_and_var);
        }
        return inference_and_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 54963L)
    public static SubLObject rkf_sd_prompter_analogize(final SubLObject prompter) {
        final SubLObject analogous_terms_results = rkf_sd_prompter_get_analogous_terms(prompter);
        while (rkf_salient_descriptor_prompter.NIL == queues.queue_empty_p(analogous_terms_results)) {
            final SubLObject result = queues.queue_peek(analogous_terms_results);
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject v_bindings = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject supports = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list162);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list162);
            supports = current.first();
            current = current.rest();
            if (rkf_salient_descriptor_prompter.NIL == current) {
                final SubLObject source_term_var = (SubLObject)rkf_salient_descriptor_prompter.$sym163$_SOURCE_TERM;
                final SubLObject source_term = bindings.variable_lookup(source_term_var, v_bindings);
                final SubLObject result_$51 = rkf_sd_prompter_add_analogy_prompt(prompter, source_term, supports);
                if (rkf_salient_descriptor_prompter.$kw19$DONE != result_$51) {
                    return result_$51;
                }
                queues.dequeue(analogous_terms_results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list162);
            }
        }
        rkf_sd_prompter_clear_analogous_terms(prompter);
        return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 55656L)
    public static SubLObject rkf_sd_prompter_get_analogous_terms(final SubLObject prompter) {
        final SubLObject analogous_terms_field = (SubLObject)rkf_salient_descriptor_prompter.$kw164$ANALOGOUS_TERMS;
        SubLObject analogous_terms = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, analogous_terms_field, (SubLObject)rkf_salient_descriptor_prompter.NIL);
        if (rkf_salient_descriptor_prompter.NIL == queues.queue_p(analogous_terms)) {
            final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
            final SubLObject source_term_var = (SubLObject)rkf_salient_descriptor_prompter.$sym163$_SOURCE_TERM;
            final SubLObject query_formula = el_utilities.make_binary_formula(rkf_salient_descriptor_prompter.$const165$similarTo, seed_term, source_term_var);
            final SubLObject query_results = rkf_query_utilities.rkf_ask(query_formula, mt, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            analogous_terms = queues.create_queue((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            SubLObject cdolist_list_var = query_results;
            SubLObject result = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            result = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                queues.enqueue(result, analogous_terms);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            }
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, analogous_terms_field, analogous_terms);
        }
        return analogous_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 56421L)
    public static SubLObject rkf_sd_prompter_clear_analogous_terms(final SubLObject prompter) {
        final SubLObject analogous_terms_field = (SubLObject)rkf_salient_descriptor_prompter.$kw164$ANALOGOUS_TERMS;
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear(prompter, analogous_terms_field);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 56621L)
    public static SubLObject rkf_sd_prompter_add_analogy_prompt(final SubLObject prompter, final SubLObject source_term, final SubLObject analogosity_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formulas = rkf_sd_prompter_get_analogy_suggestions(prompter, source_term);
        final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic(prompter);
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject salient_property_sentence = el_utilities.make_binary_formula(rkf_salient_descriptor_prompter.$const165$similarTo, seed_term, source_term);
        while (rkf_salient_descriptor_prompter.NIL == queues.queue_empty_p(formulas)) {
            final SubLObject ground_formula = queues.queue_peek(formulas);
            thread.resetMultipleValues();
            final SubLObject formula = rkf_sd_prompter_loosen_analogy_formula(seed_term, ground_formula);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            queues.dequeue(formulas);
            final SubLObject justifications = rkf_sd_analogy_justifications(prompter, source_term, ground_formula, formula);
            if (rkf_salient_descriptor_prompter.NIL != list_utilities.doubletonP(justifications)) {
                SubLObject current;
                final SubLObject datum = current = justifications;
                SubLObject source_justification = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                SubLObject unknown_justification = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list166);
                source_justification = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list166);
                unknown_justification = current.first();
                current = current.rest();
                if (rkf_salient_descriptor_prompter.NIL == current) {
                    final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
                    final SubLObject justification = ConsesLow.append(analogosity_supports, source_justification);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, formula);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence(new_prompt, salient_property_sentence);
                    rkf_sd_prompter_add_prompt(prompter, new_prompt);
                    rkf_sd_prompt_add_analogy_examples(new_prompt, source_term, v_bindings, source_justification);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list166);
                }
                if (rkf_salient_descriptor_prompter.NIL != queues.queue_empty_p(formulas)) {
                    rkf_sd_prompter_clear_analogy_suggestions(prompter);
                    return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
                }
                return prompter;
            }
        }
        rkf_sd_prompter_clear_analogy_suggestions(prompter);
        return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 58375L)
    public static SubLObject rkf_sd_prompt_add_analogy_examples(final SubLObject new_prompt, final SubLObject source_term, final SubLObject v_bindings, final SubLObject source_justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_examples_to_show$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_examples_to_show$.bind(number_utilities.maximum((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.ZERO_INTEGER, number_utilities.f_1_(rkf_salient_descriptor.$rkf_examples_to_show$.getDynamicValue(thread))), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED), thread);
            rkf_sd_prompt_compute_subprompts(new_prompt);
        }
        finally {
            rkf_salient_descriptor.$rkf_examples_to_show$.rebind(_prev_bind_0, thread);
        }
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(new_prompt);
        if (rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
            SubLObject cdolist_list_var = subprompts;
            SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            subprompt = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                final SubLObject precedent = bindings.variable_lookup(var, v_bindings);
                if (rkf_salient_descriptor_prompter.NIL != precedent) {
                    final SubLObject new_example = rkf_salient_descriptor_datastructures.new_rkf_sd_example((SubLObject)rkf_salient_descriptor_prompter.$kw167$PRECEDENT, precedent, source_justification, source_term);
                    final SubLObject existing = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
                    final SubLObject new_examples = (SubLObject)ConsesLow.cons(new_example, existing);
                    rkf_salient_descriptor.rkf_salient_descriptor_subprompt_set_examples(subprompt, new_examples);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subprompt = cdolist_list_var.first();
            }
        }
        return new_prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 59346L)
    public static SubLObject rkf_sd_prompter_loosen_analogy_formula(final SubLObject seed_term, final SubLObject ground_formula) {
        if (rkf_salient_descriptor_prompter.NIL != forts.fort_p(seed_term) && rkf_salient_descriptor_prompter.NIL != el_utilities.el_formula_p(ground_formula)) {
            SubLObject argnum = (SubLObject)rkf_salient_descriptor_prompter.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(ground_formula, (SubLObject)rkf_salient_descriptor_prompter.$kw45$IGNORE);
            SubLObject arg = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            arg = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                argnum = Numbers.add(argnum, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER);
                if (rkf_salient_descriptor_prompter.NIL == rkf_sd_prompter_uneditable_analogy_argP(arg, seed_term)) {
                    final SubLObject var = rkf_sd_prompter_analogy_var(ground_formula, argnum);
                    final SubLObject loose = el_utilities.make_existential(var, el_utilities.replace_formula_arg(argnum, var, ground_formula));
                    final SubLObject v_bindings = (SubLObject)ConsesLow.list(bindings.make_variable_binding(var, arg));
                    return Values.values(loose, v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return Values.values(ground_formula, (SubLObject)rkf_salient_descriptor_prompter.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 59921L)
    public static SubLObject rkf_sd_prompter_uneditable_analogy_argP(final SubLObject arg, final SubLObject seed_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arg.eql(seed_term) || rkf_salient_descriptor_prompter.NIL != isa.isaP(arg, rkf_salient_descriptor_prompter.$const168$Predicate, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 60137L)
    public static SubLObject rkf_sd_prompter_analogy_var(final SubLObject ground_formula, final SubLObject argnum) {
        return (SubLObject)rkf_salient_descriptor_prompter.$sym169$_X;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 60407L)
    public static SubLObject rkf_sd_prompter_get_analogy_suggestions(final SubLObject prompter, final SubLObject source_term) {
        final SubLObject analogy_suggestions_field = (SubLObject)rkf_salient_descriptor_prompter.$kw170$ANALOGY_SUGGESTIONS;
        SubLObject suggestions = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, analogy_suggestions_field, (SubLObject)rkf_salient_descriptor_prompter.NIL);
        if (rkf_salient_descriptor_prompter.NIL == queues.queue_p(suggestions)) {
            final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
            final SubLObject formulas = rkf_analogy_developer.rkf_analogous_formulas(seed_term, source_term, mt);
            suggestions = queues.create_queue((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            SubLObject cdolist_list_var = formulas;
            SubLObject formula = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            formula = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                queues.enqueue(formula, suggestions);
                cdolist_list_var = cdolist_list_var.rest();
                formula = cdolist_list_var.first();
            }
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, analogy_suggestions_field, suggestions);
        }
        return suggestions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 61067L)
    public static SubLObject rkf_sd_prompter_clear_analogy_suggestions(final SubLObject prompter) {
        final SubLObject analogy_suggestions_field = (SubLObject)rkf_salient_descriptor_prompter.$kw170$ANALOGY_SUGGESTIONS;
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear(prompter, analogy_suggestions_field);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 61284L)
    public static SubLObject rkf_sd_analogy_justifications(final SubLObject prompter, final SubLObject source_term, final SubLObject ground_formula, final SubLObject formula) {
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject source_formula = cycl_utilities.expression_subst(source_term, seed_term, ground_formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject source_formula_justification = rkf_query_utilities.rkf_justify(source_formula, mt).first();
        if (rkf_salient_descriptor_prompter.NIL != arguments.supports_p(source_formula_justification)) {
            final SubLObject unknown_formula = rkf_salient_descriptor.rkf_sd_conjoin((SubLObject)ConsesLow.list(el_utilities.make_unary_formula(rkf_salient_descriptor_prompter.$const171$unknownSentence, formula), el_utilities.make_unary_formula(rkf_salient_descriptor_prompter.$const171$unknownSentence, el_utilities.make_negation(formula))), (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
            final SubLObject unknown_justification = rkf_query_utilities.rkf_justify(unknown_formula, mt).first();
            return (SubLObject)((rkf_salient_descriptor_prompter.NIL != arguments.supports_p(unknown_justification)) ? ConsesLow.list(source_formula_justification, unknown_justification) : rkf_salient_descriptor_prompter.NIL);
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 62075L)
    public static SubLObject rkf_sd_prompter_rules_for_term(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject allowedP = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw172$USE_RULES_, (SubLObject)rkf_salient_descriptor_prompter.$kw173$FALSE);
        SubLObject rule_table = (SubLObject)((rkf_salient_descriptor_prompter.NIL != allowedP) ? rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw174$RULE_TABLE, (SubLObject)rkf_salient_descriptor_prompter.$kw57$UNKNOWN) : rkf_salient_descriptor_prompter.NIL);
        if (allowedP != rkf_salient_descriptor_prompter.$kw175$TRUE) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
        }
        if (rkf_salient_descriptor_prompter.$kw57$UNKNOWN == rule_table) {
            rule_table = rkf_sd_prompter_rule_table(seed_term, mt);
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw174$RULE_TABLE, rule_table);
        }
        SubLObject cnfs = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject gaf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject gaf_lit = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject rule = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject doneP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject unbound_var_max = (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state());
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$52 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                    final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$53 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            while (rkf_salient_descriptor_prompter.NIL == cnfs && rkf_salient_descriptor_prompter.NIL == doneP) {
                                final SubLObject rule_info = rkf_sd_prompter_rule_table_pop(rule_table);
                                if (rkf_salient_descriptor_prompter.NIL != rule_info) {
                                    final SubLObject datum_evaluated_var = list_utilities.first_n((SubLObject)rkf_salient_descriptor_prompter.FOUR_INTEGER, rule_info);
                                    gaf = datum_evaluated_var.first();
                                    gaf_lit = conses_high.cadr(datum_evaluated_var);
                                    rule = conses_high.cddr(datum_evaluated_var).first();
                                    v_bindings = conses_high.cadr(conses_high.cddr(datum_evaluated_var));
                                    cnfs = inference_utilities.unsatisfied_cnfs_for_rule(rule, v_bindings, unbound_var_max, mt, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                }
                                else {
                                    doneP = (SubLObject)rkf_salient_descriptor_prompter.T;
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rkf_salient_descriptor_prompter.NIL == reuse_existingP) {
                                    rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                            }
                        }
                    }
                    finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$53, thread);
                    }
                }
                finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$52, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (rkf_salient_descriptor_prompter.NIL == cnfs) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
        }
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cnf = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state_$56;
            SubLObject prompt;
            SubLObject subprompts;
            SubLObject new_cnf;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$56 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state_$56 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state_$56); state_$56 = set_contents.do_set_contents_update_state(state_$56)) {
                prompt = set_contents.do_set_contents_next(basis_object, state_$56);
                if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state_$56, prompt)) {
                    subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
                    if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt) && rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                        new_cnf = rkf_sd_subprompts_matches_cnfP(subprompts, cnf);
                        if (rkf_salient_descriptor_prompter.NIL != new_cnf) {
                            item_var = new_cnf;
                            if (rkf_salient_descriptor_prompter.NIL == conses_high.member(item_var, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt), (SubLObject)rkf_salient_descriptor_prompter.$sym176$EL_EXPRESSION_EQUAL_, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.IDENTITY))) {
                                rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs(prompt, (SubLObject)ConsesLow.cons(item_var, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt)));
                            }
                        }
                    }
                }
            }
            final SubLObject prompt2 = rkf_sd_prompt_from_cnf(cnf, seed_term);
            final SubLObject justification = Sequences.nreverse((SubLObject)ConsesLow.cons(rule, rkf_sd_prompt_justification_from_sentence(gaf_lit, assertions_high.assertion_mt(gaf))));
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(prompt2, justification);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(prompt2, (SubLObject)rkf_salient_descriptor_prompter.$sym177$RKF_SD_PROMPTER_RULES_FOR_TERM);
            rkf_sd_prompter_add_prompt(prompter, prompt2);
            rkf_sd_prompt_compute_subprompts(prompt2);
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        }
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 64369L)
    public static SubLObject rkf_sd_prompter_rule_table_pop(final SubLObject rule_table) {
        final SubLObject top = queues.queue_peek(rule_table);
        queues.dequeue(rule_table);
        return top;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 64673L)
    public static SubLObject rkf_sd_prompter_rule_table(final SubLObject seed_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject items = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject done_isas = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject done_genls = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor_prompter.$rkf_sd_seed_term$.currentBinding(thread);
        try {
            rkf_salient_descriptor_prompter.$rkf_sd_seed_term$.bind(seed_term, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$58 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$60 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$61 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor_prompter.SIX_INTEGER), thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                            final SubLObject pred_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                            if (rkf_salient_descriptor_prompter.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(seed_term, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(seed_term, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, pred_var);
                                SubLObject done_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                final SubLObject token_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                while (rkf_salient_descriptor_prompter.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (rkf_salient_descriptor_prompter.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor_prompter.$kw58$GAF, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                            SubLObject done_var_$62 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                            final SubLObject token_var_$63 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                            while (rkf_salient_descriptor_prompter.NIL == done_var_$62) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                                final SubLObject valid_$64 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$63.eql(gaf));
                                                if (rkf_salient_descriptor_prompter.NIL != valid_$64 && rkf_salient_descriptor_prompter.NIL != rkf_sd_gaf_okP(gaf) && rkf_salient_descriptor_prompter.NIL == rkf_argument_communicator.rkf_irrelevant_support_p(gaf)) {
                                                    final SubLObject rule_sense = (SubLObject)((rkf_salient_descriptor_prompter.$kw175$TRUE == assertions_high.assertion_truth(gaf)) ? rkf_salient_descriptor_prompter.$kw178$NEG : rkf_salient_descriptor_prompter.$kw179$POS);
                                                    final SubLObject pcase_var;
                                                    final SubLObject pred = pcase_var = assertions_high.gaf_arg0(gaf);
                                                    if (pcase_var.eql(rkf_salient_descriptor_prompter.$const92$isa)) {
                                                        final SubLObject col = assertions_high.gaf_arg2(gaf);
                                                        thread.resetMultipleValues();
                                                        final SubLObject new_items = rkf_sd_get_isa_rules(seed_term, gaf, col, done_isas, mt);
                                                        final SubLObject new_done_isas = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        done_isas = new_done_isas;
                                                        items = conses_high.union(items, new_items, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.$sym180$RKF_SD_RULE_TUPLE__), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                    }
                                                    else if (pcase_var.eql(rkf_salient_descriptor_prompter.$const116$genls)) {
                                                        final SubLObject col = assertions_high.gaf_arg2(gaf);
                                                        thread.resetMultipleValues();
                                                        final SubLObject new_items = rkf_sd_get_genls_rules(seed_term, gaf, col, done_genls, mt);
                                                        final SubLObject new_done_genls = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        done_genls = new_done_genls;
                                                        items = conses_high.union(items, new_items, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.$sym180$RKF_SD_RULE_TUPLE__), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                    }
                                                    else {
                                                        final SubLObject new_items2 = rkf_sd_get_other_rules(pred, rule_sense, gaf, mt);
                                                        items = conses_high.union(items, new_items2, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.$sym180$RKF_SD_RULE_TUPLE__), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                    }
                                                }
                                                done_var_$62 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid_$64);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (rkf_salient_descriptor_prompter.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$61, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$60, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$59, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$58, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$57, thread);
            }
            items = rkf_sd_score_rule_tuples(items);
            items = rkf_sd_remove_low_scoring_tuples(items);
            items = rkf_sd_sort_rule_tuples(items);
        }
        finally {
            rkf_salient_descriptor_prompter.$rkf_sd_seed_term$.rebind(_prev_bind_0, thread);
        }
        final SubLObject table = queues.create_queue((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        item = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            queues.enqueue(item, table);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66186L)
    public static SubLObject rkf_sd_sort_rule_tuples(final SubLObject rule_tuples) {
        return Sort.sort(rule_tuples, (SubLObject)rkf_salient_descriptor_prompter.$sym181$RKF_SD_PREFER_RULE_TUPLE_, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66296L)
    public static SubLObject rkf_sd_remove_low_scoring_tuples(final SubLObject rule_tuples) {
        return Sequences.remove_if((SubLObject)rkf_salient_descriptor_prompter.$sym182$RKF_SD_LOW_SCORING_TUPLE_P, rule_tuples, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66421L)
    public static SubLObject rkf_sd_low_scoring_tuple_p(final SubLObject rule_tuple) {
        final SubLObject score = conses_high.fifth(rule_tuple);
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(score)) {
            badP = (SubLObject)rkf_salient_descriptor_prompter.T;
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66719L)
    public static SubLObject rkf_sd_score_rule_tuples(final SubLObject rule_tuples) {
        return Mapping.mapcar((SubLObject)rkf_salient_descriptor_prompter.$sym183$RKF_SD_SCORE_RULE_TUPLE, rule_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66830L)
    public static SubLObject rkf_sd_get_other_rules(final SubLObject pred, final SubLObject sense, final SubLObject gaf, final SubLObject mt) {
        SubLObject new_items = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject cutoff = (SubLObject)rkf_salient_descriptor_prompter.TEN_INTEGER;
        final SubLObject strictP = Numbers.numG(kb_indexing.num_predicate_rule_index(pred, (SubLObject)rkf_salient_descriptor_prompter.$kw178$NEG, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED), cutoff);
        if (rkf_salient_descriptor_prompter.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, (SubLObject)rkf_salient_descriptor_prompter.NIL)) {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, (SubLObject)rkf_salient_descriptor_prompter.NIL);
            SubLObject done_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            final SubLObject token_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            while (rkf_salient_descriptor_prompter.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (rkf_salient_descriptor_prompter.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor_prompter.$kw59$RULE, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                        SubLObject done_var_$67 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                        final SubLObject token_var_$68 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                        while (rkf_salient_descriptor_prompter.NIL == done_var_$67) {
                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                            final SubLObject valid_$69 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$68.eql(rule));
                            if (rkf_salient_descriptor_prompter.NIL != valid_$69) {
                                final SubLObject v_bindings = rkf_sd_gaf_rule_bindings(gaf, rule, sense, strictP);
                                if (rkf_salient_descriptor_prompter.NIL != v_bindings && rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt)) {
                                    final SubLObject item_var = (SubLObject)ConsesLow.list(gaf, assertions_high.gaf_formula(gaf), rule, v_bindings);
                                    if (rkf_salient_descriptor_prompter.NIL == conses_high.member(item_var, new_items, (SubLObject)rkf_salient_descriptor_prompter.$sym180$RKF_SD_RULE_TUPLE__, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.IDENTITY))) {
                                        new_items = (SubLObject)ConsesLow.cons(item_var, new_items);
                                    }
                                }
                            }
                            done_var_$67 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid_$69);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)rkf_salient_descriptor_prompter.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (rkf_salient_descriptor_prompter.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid);
            }
        }
        return new_items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 67290L)
    public static SubLObject rkf_sd_get_isa_rules(final SubLObject seed_term, final SubLObject gaf, final SubLObject col, SubLObject done_genls, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_sense = (SubLObject)((rkf_salient_descriptor_prompter.$kw175$TRUE == assertions_high.assertion_truth(gaf)) ? rkf_salient_descriptor_prompter.$kw178$NEG : rkf_salient_descriptor_prompter.$kw179$POS);
        SubLObject new_items = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$70 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor_prompter.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    SubLObject node_var = col;
                    final SubLObject deck_type = (SubLObject)rkf_salient_descriptor_prompter.$kw106$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                            final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor_prompter.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != tv_var) ? rkf_salient_descriptor_prompter.$sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (rkf_salient_descriptor_prompter.NIL != tv_var && rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw109$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw112$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw114$WARN)) {
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$76 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor_prompter.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                            while (rkf_salient_descriptor_prompter.NIL != node_var) {
                                                final SubLObject genl = node_var;
                                                if (rkf_salient_descriptor_prompter.NIL == conses_high.member(genl, done_genls, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                    if (rkf_salient_descriptor_prompter.NIL != rkf_sd_term_too_generalP(genl)) {
                                                        done_genls = (SubLObject)ConsesLow.cons(genl, done_genls);
                                                    }
                                                    else {
                                                        final SubLObject gaf_lit = el_utilities.make_binary_formula(rkf_salient_descriptor_prompter.$const92$isa, seed_term, genl);
                                                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                                        final SubLObject _prev_bind_0_$75 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$76 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$78 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                            if (rkf_salient_descriptor_prompter.NIL != kb_mapping_macros.do_isa_rule_index_key_validator(genl, rule_sense, (SubLObject)rkf_salient_descriptor_prompter.NIL)) {
                                                                final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(genl, rule_sense, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                                                SubLObject done_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                final SubLObject token_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                while (rkf_salient_descriptor_prompter.NIL == done_var) {
                                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                    if (rkf_salient_descriptor_prompter.NIL != valid) {
                                                                        SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor_prompter.$kw59$RULE, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                                                            SubLObject done_var_$83 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                            final SubLObject token_var_$84 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                            while (rkf_salient_descriptor_prompter.NIL == done_var_$83) {
                                                                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                                                                final SubLObject valid_$85 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$84.eql(rule));
                                                                                if (rkf_salient_descriptor_prompter.NIL != valid_$85) {
                                                                                    final SubLObject v_bindings = rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                    if (rkf_salient_descriptor_prompter.NIL != v_bindings && rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt)) {
                                                                                        final SubLObject item_var = (SubLObject)ConsesLow.list(gaf, gaf_lit, rule, v_bindings);
                                                                                        if (rkf_salient_descriptor_prompter.NIL == conses_high.member(item_var, new_items, (SubLObject)rkf_salient_descriptor_prompter.$sym180$RKF_SD_RULE_TUPLE__, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.IDENTITY))) {
                                                                                            new_items = (SubLObject)ConsesLow.cons(item_var, new_items);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_$83 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid_$85);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                                if (rkf_salient_descriptor_prompter.NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                                Values.restoreValuesFromVector(_values);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$78, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$76, thread);
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$75, thread);
                                                        }
                                                        done_genls = (SubLObject)ConsesLow.cons(genl, done_genls);
                                                    }
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls));
                                                SubLObject module_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                            if (rkf_salient_descriptor_prompter.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                                if (rkf_salient_descriptor_prompter.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$89 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (rkf_salient_descriptor_prompter.NIL != mt_relevance_macros.relevant_mtP(mt_$89)) {
                                                                            final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$89, thread);
                                                                                SubLObject iteration_state_$91;
                                                                                for (iteration_state_$91 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$91); iteration_state_$91 = dictionary_contents.do_dictionary_contents_next(iteration_state_$91)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$91);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state_$93;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$93 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state_$93 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state_$93); state_$93 = set_contents.do_set_contents_update_state(state_$93)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state_$93);
                                                                                                    if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state_$93, node_vars_link_node) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                                                                                                    if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$91);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str119$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (rkf_salient_descriptor_prompter.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$94;
                                                            final SubLObject new_list = cdolist_list_var_$94 = ((rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                            generating_fn = cdolist_list_var_$94.first();
                                                            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var_$94) {
                                                                final SubLObject _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state_$94;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$94 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state_$94 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object2, state_$94); state_$94 = set_contents.do_set_contents_update_state(state_$94)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state_$94);
                                                                            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state_$94, node_vars_link_node3) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (rkf_salient_descriptor_prompter.NIL != csome_list_var2) {
                                                                            if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$80, thread);
                                                                }
                                                                cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                                                generating_fn = cdolist_list_var_$94.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$77, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$77, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$77, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$75, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$74, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$76, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$74, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$73, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$73, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$70, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(new_items, done_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 68072L)
    public static SubLObject rkf_sd_get_genls_rules(final SubLObject seed_term, final SubLObject gaf, final SubLObject col, SubLObject done_genls, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_sense = (SubLObject)((rkf_salient_descriptor_prompter.$kw175$TRUE == assertions_high.assertion_truth(gaf)) ? rkf_salient_descriptor_prompter.$kw178$NEG : rkf_salient_descriptor_prompter.$kw179$POS);
        SubLObject new_items = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor_prompter.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    SubLObject node_var = col;
                    final SubLObject deck_type = (SubLObject)rkf_salient_descriptor_prompter.$kw106$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                            final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor_prompter.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != tv_var) ? rkf_salient_descriptor_prompter.$sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (rkf_salient_descriptor_prompter.NIL != tv_var && rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw109$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw112$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw114$WARN)) {
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$103 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor_prompter.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$103 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$104 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                            while (rkf_salient_descriptor_prompter.NIL != node_var) {
                                                final SubLObject genl = node_var;
                                                if (rkf_salient_descriptor_prompter.NIL == conses_high.member(genl, done_genls, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                    if (rkf_salient_descriptor_prompter.NIL != rkf_sd_term_too_generalP(genl)) {
                                                        done_genls = (SubLObject)ConsesLow.cons(genl, done_genls);
                                                    }
                                                    else {
                                                        final SubLObject gaf_lit = el_utilities.make_binary_formula(rkf_salient_descriptor_prompter.$const116$genls, seed_term, genl);
                                                        if (rkf_salient_descriptor_prompter.NIL != kb_mapping_macros.do_genls_rule_index_key_validator(genl, rule_sense, (SubLObject)rkf_salient_descriptor_prompter.NIL)) {
                                                            final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(genl, rule_sense, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                                            SubLObject done_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                            final SubLObject token_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                            while (rkf_salient_descriptor_prompter.NIL == done_var) {
                                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                if (rkf_salient_descriptor_prompter.NIL != valid) {
                                                                    SubLObject final_index_iterator = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_salient_descriptor_prompter.$kw59$RULE, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.NIL);
                                                                        SubLObject done_var_$109 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                        final SubLObject token_var_$110 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                        while (rkf_salient_descriptor_prompter.NIL == done_var_$109) {
                                                                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$110);
                                                                            final SubLObject valid_$111 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$110.eql(rule));
                                                                            if (rkf_salient_descriptor_prompter.NIL != valid_$111) {
                                                                                final SubLObject v_bindings = rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                if (rkf_salient_descriptor_prompter.NIL != v_bindings && rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt)) {
                                                                                    final SubLObject item_var = (SubLObject)ConsesLow.list(gaf, gaf_lit, rule, v_bindings);
                                                                                    if (rkf_salient_descriptor_prompter.NIL == conses_high.member(item_var, new_items, (SubLObject)rkf_salient_descriptor_prompter.$sym180$RKF_SD_RULE_TUPLE__, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.IDENTITY))) {
                                                                                        new_items = (SubLObject)ConsesLow.cons(item_var, new_items);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_$109 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid_$111);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                                                            final SubLObject _values = Values.getValuesAsVector();
                                                                            if (rkf_salient_descriptor_prompter.NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                            Values.restoreValuesFromVector(_values);
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == valid);
                                                            }
                                                        }
                                                        done_genls = (SubLObject)ConsesLow.cons(genl, done_genls);
                                                    }
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls));
                                                SubLObject module_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$105 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                            if (rkf_salient_descriptor_prompter.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                                if (rkf_salient_descriptor_prompter.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$115 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (rkf_salient_descriptor_prompter.NIL != mt_relevance_macros.relevant_mtP(mt_$115)) {
                                                                            final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$115, thread);
                                                                                SubLObject iteration_state_$117;
                                                                                for (iteration_state_$117 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$117); iteration_state_$117 = dictionary_contents.do_dictionary_contents_next(iteration_state_$117)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$117);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state_$119;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$119 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state_$119 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state_$119); state_$119 = set_contents.do_set_contents_update_state(state_$119)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state_$119);
                                                                                                    if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state_$119, node_vars_link_node) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                                                                                                    if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$107, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$117);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$106, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str119$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (rkf_salient_descriptor_prompter.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$120;
                                                            final SubLObject new_list = cdolist_list_var_$120 = ((rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                            generating_fn = cdolist_list_var_$120.first();
                                                            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var_$120) {
                                                                final SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state_$120;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$120 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state_$120 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object2, state_$120); state_$120 = set_contents.do_set_contents_update_state(state_$120)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state_$120);
                                                                            if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state_$120, node_vars_link_node3) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (rkf_salient_descriptor_prompter.NIL != csome_list_var2) {
                                                                            if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$108, thread);
                                                                }
                                                                cdolist_list_var_$120 = cdolist_list_var_$120.rest();
                                                                generating_fn = cdolist_list_var_$120.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$105, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$105, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$104, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$103, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$105, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$103, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$102, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$102, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$100, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$99, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(new_items, done_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 68819L)
    public static SubLObject rkf_sd_rule_tuple_E(final SubLObject tuple1, final SubLObject tuple2) {
        SubLObject gaf1 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject gaf_lit1 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject rule1 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject bindings1 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple1, tuple1, (SubLObject)rkf_salient_descriptor_prompter.$list184);
        gaf1 = tuple1.first();
        SubLObject current = tuple1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple1, (SubLObject)rkf_salient_descriptor_prompter.$list184);
        gaf_lit1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple1, (SubLObject)rkf_salient_descriptor_prompter.$list184);
        rule1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple1, (SubLObject)rkf_salient_descriptor_prompter.$list184);
        bindings1 = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            SubLObject gaf2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject gaf_lit2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject rule2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject bindings2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(tuple2, tuple2, (SubLObject)rkf_salient_descriptor_prompter.$list185);
            gaf2 = tuple2.first();
            SubLObject current_$126 = tuple2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$126, tuple2, (SubLObject)rkf_salient_descriptor_prompter.$list185);
            gaf_lit2 = current_$126.first();
            current_$126 = current_$126.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$126, tuple2, (SubLObject)rkf_salient_descriptor_prompter.$list185);
            rule2 = current_$126.first();
            current_$126 = current_$126.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$126, tuple2, (SubLObject)rkf_salient_descriptor_prompter.$list185);
            bindings2 = current_$126.first();
            current_$126 = current_$126.rest();
            if (rkf_salient_descriptor_prompter.NIL == current_$126) {
                return (SubLObject)SubLObjectFactory.makeBoolean(gaf1.eql(gaf2) && rule1.eql(rule2) && gaf_lit1.equal(gaf_lit2) && bindings1.equal(bindings2));
            }
            cdestructuring_bind.cdestructuring_bind_error(tuple2, (SubLObject)rkf_salient_descriptor_prompter.$list185);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(tuple1, (SubLObject)rkf_salient_descriptor_prompter.$list184);
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 69115L)
    public static SubLObject rkf_sd_score_rule_tuple(SubLObject tuple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = rkf_sd_el_cnf_from_rule_tuple(tuple);
        final SubLObject score = rkf_salient_descriptor_datastructures.new_rkf_sd_rule_info_score();
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(score, list_utilities.sublisp_boolean(list_utilities.tree_find(rkf_salient_descriptor_prompter.$rkf_sd_seed_term$.getDynamicValue(thread), clauses.pos_lits(cnf), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(score, list_utilities.sublisp_boolean(list_utilities.tree_find(rkf_salient_descriptor_prompter.$rkf_sd_seed_term$.getDynamicValue(thread), clauses.neg_lits(cnf), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_var_count(score, list_utilities.tree_count_if((SubLObject)rkf_salient_descriptor_prompter.$sym37$EL_VAR_, cnf, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_neg_lit_count(score, Sequences.length(clauses.neg_lits(cnf)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_count(score, Sequences.length(clauses.pos_lits(cnf)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_quality_score(score, rkf_sd_cnf_rule_count(cnf));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_mt_generality_score(score, rkf_sd_tuple_mt_generality(tuple));
        tuple = ConsesLow.nconc(tuple, (SubLObject)ConsesLow.list(score));
        return tuple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70095L)
    public static SubLObject rkf_sd_prefer_rule_tupleP(final SubLObject tuple1, final SubLObject tuple2) {
        final SubLObject score1 = conses_high.fifth(tuple1);
        final SubLObject score2 = conses_high.fifth(tuple2);
        return rkf_sd_rule_info_score_G(score1, score2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70605L)
    public static SubLObject rkf_sd_rule_info_score_G(final SubLObject score1, final SubLObject score2) {
        SubLObject test_result = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == test_result) {
            SubLObject csome_list_var = rkf_salient_descriptor_prompter.$rkf_sd_rule_score_tests$.getGlobalValue();
            SubLObject test = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            test = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == test_result && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                if (test.isFunctionSpec()) {
                    test_result = rkf_sd_rule_score_do_test(test, score1, score2);
                }
                csome_list_var = csome_list_var.rest();
                test = csome_list_var.first();
            }
        }
        return Equality.eq((SubLObject)rkf_salient_descriptor_prompter.$kw187$BETTER, test_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70949L)
    public static SubLObject rkf_sd_rule_score_do_test(final SubLObject test, final SubLObject score1, final SubLObject score2) {
        if (rkf_salient_descriptor_prompter.NIL != Functions.funcall(test, score1, score2)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw187$BETTER;
        }
        if (rkf_salient_descriptor_prompter.NIL != Functions.funcall(test, score2, score1)) {
            return (SubLObject)rkf_salient_descriptor_prompter.$kw188$WORSE;
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71221L)
    public static SubLObject rkf_sd_rst_seed_term_in_pos_lits(final SubLObject score1, final SubLObject score2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(score1) && rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(score2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71539L)
    public static SubLObject rkf_sd_rst_seed_term_in_neg_lits(final SubLObject score1, final SubLObject score2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP(score1) && rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP(score2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71744L)
    public static SubLObject rkf_sd_rst_var_count(final SubLObject score1, final SubLObject score2) {
        return Numbers.numL(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count(score1), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count(score2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71898L)
    public static SubLObject rkf_sd_rst_neg_lit_count(final SubLObject score1, final SubLObject score2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count(score1).isPositive() && rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count(score1).numL(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count(score2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72130L)
    public static SubLObject rkf_sd_rst_pos_lit_count(final SubLObject score1, final SubLObject score2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count(score1).isPositive() && rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count(score1).numL(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count(score2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72362L)
    public static SubLObject rkf_sd_rst_mt_generality(final SubLObject score1, final SubLObject score2) {
        return Numbers.numG(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score(score1), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score(score2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72540L)
    public static SubLObject rkf_sd_rst_pos_lit_quality(final SubLObject score1, final SubLObject score2) {
        return Numbers.numG(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score(score1), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score(score2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72724L)
    public static SubLObject rkf_sd_tuple_mt_generality(final SubLObject tuple) {
        SubLObject gaf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject gaf_lit = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject rule = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        gaf = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        gaf_lit = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        v_bindings = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            return number_utilities.minimum((SubLObject)ConsesLow.list(cardinality_estimates.generality_estimate(assertions_high.assertion_mt(gaf)), cardinality_estimates.generality_estimate(assertions_high.assertion_mt(rule))), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72980L)
    public static SubLObject rkf_sd_cnf_rule_count(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_count = (SubLObject)rkf_salient_descriptor_prompter.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_salient_descriptor_prompter.$sym102$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_salient_descriptor_prompter.$const103$EverythingPSC, thread);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            pos_lit = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                rule_count = Numbers.add(rule_count, kb_indexing.num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(pos_lit), (SubLObject)rkf_salient_descriptor_prompter.$kw178$NEG, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rule_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 73230L)
    public static SubLObject rkf_sd_el_cnf_from_rule_tuple(final SubLObject tuple) {
        SubLObject gaf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject gaf_lit = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject rule = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        gaf = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        gaf_lit = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        v_bindings = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_prompter.NIL == current) {
            final SubLObject hl_cnf = conses_high.copy_tree(assertions_high.assertion_cnf(rule));
            final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
            final SubLObject rule_sense = (SubLObject)((rkf_salient_descriptor_prompter.$kw175$TRUE == assertions_high.assertion_truth(gaf)) ? rkf_salient_descriptor_prompter.$kw178$NEG : rkf_salient_descriptor_prompter.$kw179$POS);
            final SubLObject lits = clauses.clause_sense_lits(hl_cnf, rule_sense);
            final SubLObject match = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            if (rkf_salient_descriptor_prompter.NIL != v_bindings) {
                final SubLObject new_lits = Sequences.remove(match, lits, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQUAL), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                final SubLObject new_neg_lits = (rkf_salient_descriptor_prompter.$kw178$NEG == rule_sense) ? new_lits : clauses.neg_lits(hl_cnf);
                final SubLObject new_pos_lits = (rkf_salient_descriptor_prompter.$kw179$POS == rule_sense) ? new_lits : clauses.pos_lits(hl_cnf);
                SubLObject new_hl_cnf = clauses.make_clause(new_neg_lits, new_pos_lits);
                new_hl_cnf = bindings.subst_bindings(v_bindings, new_hl_cnf);
                return rkf_salient_descriptor.rkf_sd_el_cnf_of_hl_cnf(new_hl_cnf, el_vars);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)rkf_salient_descriptor_prompter.$list189);
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74007L)
    public static SubLObject rkf_sd_gaf_okP(final SubLObject gaf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != assertions_high.asserted_assertionP(gaf) && rkf_salient_descriptor_prompter.NIL != rkf_sd_gaf_generality_okP(gaf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74126L)
    public static SubLObject rkf_sd_gaf_generality_okP(final SubLObject gaf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == cycl_utilities.expression_find_if((SubLObject)rkf_salient_descriptor_prompter.$sym190$RKF_SD_TERM_TOO_GENERAL_, assertions_high.gaf_args(gaf), (SubLObject)rkf_salient_descriptor_prompter.T, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74255L)
    public static SubLObject rkf_sd_term_too_generalP(final SubLObject v_term) {
        final SubLObject generality_cutoff = (SubLObject)rkf_salient_descriptor_prompter.$int191$5000;
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != forts.fort_p(v_term) && cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74429L)
    public static SubLObject rkf_sd_gaf_rule_bindings(final SubLObject gaf, final SubLObject rule, final SubLObject rule_sense, SubLObject strictP) {
        if (strictP == rkf_salient_descriptor_prompter.UNPROVIDED) {
            strictP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        final SubLObject gaf_lit = assertions_high.gaf_formula(gaf);
        return rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, strictP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74624L)
    public static SubLObject rkf_sd_gaf_lit_rule_bindings(final SubLObject gaf_lit, final SubLObject rule, final SubLObject sense, SubLObject strictP) {
        if (strictP == rkf_salient_descriptor_prompter.UNPROVIDED) {
            strictP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject rule_lits = (rkf_salient_descriptor_prompter.$kw178$NEG == sense) ? clauses.neg_lits(cnf) : clauses.pos_lits(cnf);
        SubLObject v_bindings = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == v_bindings) {
            SubLObject csome_list_var = rule_lits;
            SubLObject rule_lit = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            rule_lit = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == v_bindings && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                if (rkf_salient_descriptor_prompter.NIL == strictP || rkf_salient_descriptor_prompter.NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg2(rule_lit, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) {
                    v_bindings = unification_utilities.asent_unify(gaf_lit, rule_lit, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                rule_lit = csome_list_var.first();
            }
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 75030L)
    public static SubLObject rkf_sd_subprompts_matches_cnfP(final SubLObject subprompts, final SubLObject cnf) {
        SubLObject new_cnf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == new_cnf) {
            SubLObject csome_list_var = subprompts;
            SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            subprompt = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == new_cnf && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                final SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                new_cnf = rkf_sd_assert_sentence_matches_cnfP(assert_sentence, cnf);
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            }
        }
        return new_cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 75351L)
    public static SubLObject rkf_sd_assert_sentence_matches_cnfP(final SubLObject assert_sentence, final SubLObject cnf) {
        SubLObject new_cnf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == new_cnf) {
            SubLObject csome_list_var = clauses.neg_lits(cnf);
            SubLObject neg_lit = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            neg_lit = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == new_cnf && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                if (rkf_salient_descriptor_prompter.NIL != rkf_sd_assert_sentence_matches_neg_litP(assert_sentence, neg_lit)) {
                    final SubLObject new_neg_lits = Sequences.remove(neg_lit, clauses.neg_lits(cnf), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQUAL), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                    new_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf));
                }
                csome_list_var = csome_list_var.rest();
                neg_lit = csome_list_var.first();
            }
        }
        return new_cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 75721L)
    public static SubLObject rkf_sd_assert_sentence_matches_neg_litP(final SubLObject assert_sentence, final SubLObject neg_lit) {
        SubLObject mismatchP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == el_utilities.same_formula_arity_p(assert_sentence, neg_lit, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
        final SubLObject terms = cycl_utilities.formula_terms(assert_sentence, (SubLObject)rkf_salient_descriptor_prompter.$kw45$IGNORE);
        SubLObject list_var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject v_term = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        SubLObject argnum = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = (SubLObject)rkf_salient_descriptor_prompter.ZERO_INTEGER; rkf_salient_descriptor_prompter.NIL == mismatchP && rkf_salient_descriptor_prompter.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (rkf_salient_descriptor_prompter.NIL == cycl_variables.el_varP(v_term) && !v_term.equal(cycl_utilities.formula_arg(neg_lit, argnum, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) {
                mismatchP = (SubLObject)rkf_salient_descriptor_prompter.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == mismatchP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76092L)
    public static SubLObject rkf_sd_prompter_strong(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, rkf_salient_descriptor_prompter.$const192$keStrongSuggestion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76222L)
    public static SubLObject rkf_sd_prompter_induced(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, (SubLObject)rkf_salient_descriptor_prompter.$sym146$RKF_NEIGHBOR_SUGGESTIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76358L)
    public static SubLObject rkf_sd_prompter_weak(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, rkf_salient_descriptor_prompter.$const193$keWeakSuggestion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76484L)
    public static SubLObject rkf_sd_prompter_compute_subpromptss(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_prompts = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)rkf_salient_descriptor_prompter.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
            final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject prompt;
            SubLObject cached_subprompts;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                prompt = set_contents.do_set_contents_next(basis_object, state);
                if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                    cached_subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
                    if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(cached_subprompts)) {
                        rkf_sd_prompt_compute_subprompts(prompt);
                        if (rkf_salient_descriptor_prompter.NIL != rkf_sd_prompt_bad_subpromptsP(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt))) {
                            bad_prompts = (SubLObject)ConsesLow.cons(prompt, bad_prompts);
                        }
                    }
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = bad_prompts;
        SubLObject bad_prompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        bad_prompt = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
            cdolist_list_var = cdolist_list_var.rest();
            bad_prompt = cdolist_list_var.first();
        }
        return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77104L)
    public static SubLObject rkf_sd_prompt_bad_subpromptsP(final SubLObject prompt, final SubLObject subprompts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(prompt);
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL != prompter) {
            final SubLObject local_state;
            final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state());
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                        badP = (SubLObject)rkf_salient_descriptor_prompter.T;
                    }
                    else if (rkf_salient_descriptor_prompter.NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompts.first(), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                        badP = (SubLObject)rkf_salient_descriptor_prompter.T;
                    }
                    else if (rkf_salient_descriptor_prompter.NIL != rkf_sd_not_assertible_subpromptsP(subprompts)) {
                        badP = (SubLObject)rkf_salient_descriptor_prompter.T;
                    }
                    else if (rkf_salient_descriptor_prompter.NIL != rkf_sd_unparseable_subpromptsP(subprompts)) {
                        badP = (SubLObject)rkf_salient_descriptor_prompter.T;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77716L)
    public static SubLObject rkf_sd_not_assertible_subpromptsP_internal(final SubLObject subprompts) {
        final SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompts.first(), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        return rkf_salient_descriptor.rkf_salient_descriptor_not_assertible_sentenceP(assert_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77716L)
    public static SubLObject rkf_sd_not_assertible_subpromptsP(final SubLObject subprompts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == v_memoization_state) {
            return rkf_sd_not_assertible_subpromptsP_internal(subprompts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor_prompter.$sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.EQUAL, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, subprompts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_not_assertible_subpromptsP_internal(subprompts)));
            memoization_state.caching_state_put(caching_state, subprompts, results, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77975L)
    public static SubLObject rkf_sd_unparseable_subpromptsP_internal(final SubLObject subprompts) {
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == badP) {
            SubLObject csome_list_var = subprompts;
            SubLObject subprompt = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            subprompt = csome_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                if (rkf_salient_descriptor_prompter.$kw35$SPECIFY == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt)) {
                    final SubLObject var = conses_high.second(subprompt);
                    final SubLObject constraint_formula = conses_high.third(subprompt);
                    if (rkf_salient_descriptor_prompter.NIL != el_utilities.el_conjunction_p(constraint_formula)) {
                        if (rkf_salient_descriptor_prompter.NIL == badP) {
                            SubLObject csome_list_var_$128;
                            SubLObject conjunct;
                            for (csome_list_var_$128 = cycl_utilities.formula_args(constraint_formula, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED), conjunct = (SubLObject)rkf_salient_descriptor_prompter.NIL, conjunct = csome_list_var_$128.first(); rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var_$128; badP = rkf_sd_unparseable_prompt_litP(conjunct, var), csome_list_var_$128 = csome_list_var_$128.rest(), conjunct = csome_list_var_$128.first()) {}
                        }
                    }
                    else if (rkf_salient_descriptor_prompter.NIL != rkf_sd_unparseable_prompt_litP(constraint_formula, var)) {
                        badP = (SubLObject)rkf_salient_descriptor_prompter.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77975L)
    public static SubLObject rkf_sd_unparseable_subpromptsP(final SubLObject subprompts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == v_memoization_state) {
            return rkf_sd_unparseable_subpromptsP_internal(subprompts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor_prompter.$sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.EQUAL, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, subprompts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_unparseable_subpromptsP_internal(subprompts)));
            memoization_state.caching_state_put(caching_state, subprompts, results, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 78559L)
    public static SubLObject rkf_sd_unparseable_prompt_litP_internal(final SubLObject conjunct, final SubLObject var) {
        if (rkf_salient_descriptor_prompter.NIL != formula_pattern_match.formula_matches_pattern(conjunct, (SubLObject)ConsesLow.listS(rkf_salient_descriptor_prompter.$const92$isa, var, (SubLObject)rkf_salient_descriptor_prompter.$list197))) {
            final SubLObject target_type = cycl_utilities.formula_arg2(conjunct, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            if (rkf_salient_descriptor_prompter.NIL != rkf_unparseable_arg_typeP(target_type) || rkf_salient_descriptor_prompter.NIL != rkf_no_instances_arg_typeP(target_type)) {
                return (SubLObject)rkf_salient_descriptor_prompter.T;
            }
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 78559L)
    public static SubLObject rkf_sd_unparseable_prompt_litP(final SubLObject conjunct, final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == v_memoization_state) {
            return rkf_sd_unparseable_prompt_litP_internal(conjunct, var);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rkf_salient_descriptor_prompter.$sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.NIL, (SubLObject)rkf_salient_descriptor_prompter.EQUAL, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rkf_salient_descriptor_prompter.$sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(conjunct, var);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            collision = cdolist_list_var.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (conjunct.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_salient_descriptor_prompter.NIL != cached_args && rkf_salient_descriptor_prompter.NIL == cached_args.rest() && var.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_sd_unparseable_prompt_litP_internal(conjunct, var)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(conjunct, var));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79034L)
    public static SubLObject rkf_unparseable_arg_typeP(final SubLObject v_arg_type) {
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == badP) {
            SubLObject csome_list_var;
            SubLObject bad_arg_type;
            for (csome_list_var = rkf_salient_descriptor_prompter.$rkf_unparseable_arg_types$.getGlobalValue(), bad_arg_type = (SubLObject)rkf_salient_descriptor_prompter.NIL, bad_arg_type = csome_list_var.first(); rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var; badP = genls.genl_in_any_mtP(v_arg_type, bad_arg_type), csome_list_var = csome_list_var.rest(), bad_arg_type = csome_list_var.first()) {}
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79245L)
    public static SubLObject rkf_no_instances_arg_typeP(final SubLObject v_arg_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_salient_descriptor_prompter.$sym102$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_salient_descriptor_prompter.$const103$EverythingPSC, thread);
            if (rkf_salient_descriptor_prompter.NIL == okP) {
                SubLObject node_var = v_arg_type;
                final SubLObject deck_type = (SubLObject)rkf_salient_descriptor_prompter.$kw106$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$129 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = rkf_salient_descriptor_prompter.$const107$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$130 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$131 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((rkf_salient_descriptor_prompter.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != tv_var) ? rkf_salient_descriptor_prompter.$sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (rkf_salient_descriptor_prompter.NIL != tv_var && rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw109$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw112$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_prompter.$kw114$WARN)) {
                                    Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)rkf_salient_descriptor_prompter.$str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)rkf_salient_descriptor_prompter.$str113$continue_anyway, (SubLObject)rkf_salient_descriptor_prompter.$str110$_A_is_not_a__A, tv_var, (SubLObject)rkf_salient_descriptor_prompter.$sym111$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$131 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$132 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls), thread);
                                if (rkf_salient_descriptor_prompter.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || rkf_salient_descriptor_prompter.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_arg_type, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$132 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$133 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)rkf_salient_descriptor_prompter.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                        while (rkf_salient_descriptor_prompter.NIL != node_var && rkf_salient_descriptor_prompter.NIL == okP) {
                                            final SubLObject spec = node_var;
                                            okP = rkf_direct_instances_arg_typeP(spec);
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(rkf_salient_descriptor_prompter.$const116$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$133;
                                            SubLObject _prev_bind_1_$134;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$134;
                                            SubLObject iteration_state_$140;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$135;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$142;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$136;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)rkf_salient_descriptor_prompter.NIL, rest = accessible_modules; rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$134 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                        if (rkf_salient_descriptor_prompter.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
                                                            if (rkf_salient_descriptor_prompter.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (rkf_salient_descriptor_prompter.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$134 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$140 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$140); iteration_state_$140 = dictionary_contents.do_dictionary_contents_next(iteration_state_$140)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$140);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (rkf_salient_descriptor_prompter.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rkf_salient_descriptor_prompter.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (rkf_salient_descriptor_prompter.NIL == okP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL != csome_list_var) {
                                                                                                    if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$135, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$140);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$134, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)rkf_salient_descriptor_prompter.FIVE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str119$attempting_to_bind_direction_link, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (rkf_salient_descriptor_prompter.NIL != obsolete.cnat_p(node, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                        new_list = ((rkf_salient_descriptor_prompter.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)));
                                                        for (rest_$142 = (SubLObject)rkf_salient_descriptor_prompter.NIL, rest_$142 = new_list; rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL != rest_$142; rest_$142 = rest_$142.rest()) {
                                                            generating_fn = rest_$142.first();
                                                            _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (rkf_salient_descriptor_prompter.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)rkf_salient_descriptor_prompter.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (rkf_salient_descriptor_prompter.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (rkf_salient_descriptor_prompter.NIL == okP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (rkf_salient_descriptor_prompter.NIL == okP && rkf_salient_descriptor_prompter.NIL != csome_list_var2) {
                                                                            if (rkf_salient_descriptor_prompter.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)rkf_salient_descriptor_prompter.$str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$136, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$134, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$133, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$136, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$133, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$132, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$str120$Node__a_does_not_pass_sbhl_type_t, v_arg_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED)), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$132, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$131, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$131, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$130, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_salient_descriptor_prompter.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$129, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL == okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79572L)
    public static SubLObject rkf_direct_instances_arg_typeP(final SubLObject v_arg_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_prompter.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, rkf_salient_descriptor_prompter.$const92$isa, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$kw175$TRUE) || rkf_salient_descriptor_prompter.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, rkf_salient_descriptor_prompter.$const199$defnSufficient, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$kw175$TRUE) || rkf_salient_descriptor_prompter.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, rkf_salient_descriptor_prompter.$const200$defnIff, (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$kw175$TRUE) || rkf_salient_descriptor_prompter.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, rkf_salient_descriptor_prompter.$const201$resultIsa, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.$kw175$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79886L)
    public static SubLObject rkf_sd_prompter_find_rule_prompts(final SubLObject prompter) {
        final SubLObject rule = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        SubLObject cdolist_list_var;
        final SubLObject local_terms = cdolist_list_var = ConsesLow.append(rkf_term_utilities.rkf_terms_created_in_interaction_mt(mt), isa.all_fort_instances(rkf_salient_descriptor_prompter.$const202$CoaDiagramObject, mt, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED));
        SubLObject local_term = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        local_term = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$145 = rkf_salient_descriptor.rkf_rule_cnfs_for_term(rule, local_term, mt);
            SubLObject cnf_pair = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cnf_pair = cdolist_list_var_$145.first();
            while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var_$145) {
                SubLObject current;
                final SubLObject datum = current = cnf_pair;
                SubLObject unknown_cnf = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                SubLObject just_sentence = (SubLObject)rkf_salient_descriptor_prompter.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list203);
                unknown_cnf = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list203);
                just_sentence = current.first();
                current = current.rest();
                if (rkf_salient_descriptor_prompter.NIL == current) {
                    final SubLObject prompt = rkf_sd_prompt_from_cnf(unknown_cnf, local_term);
                    final SubLObject justification = rkf_sd_prompt_justification_from_sentence(just_sentence, mt);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(prompt, justification);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(prompt, (SubLObject)rkf_salient_descriptor_prompter.$sym204$RKF_SD_PROMPTER_FIND_RULE_PROMPTS);
                    rkf_sd_prompter_add_prompt(prompter, prompt);
                    rkf_sd_prompt_compute_subprompts(prompt);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_prompter.$list203);
                }
                cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                cnf_pair = cdolist_list_var_$145.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            local_term = cdolist_list_var.first();
        }
        return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 80858L)
    public static SubLObject rkf_sd_prompt_justification_from_sentence(final SubLObject just_sentence, final SubLObject mt) {
        final SubLObject ask_results = ask_utilities.ask_justified(just_sentence, mt, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        if (rkf_salient_descriptor_prompter.NIL != cyc_kernel.closed_query_justified_success_result_p(ask_results)) {
            final SubLObject result = ask_results.first();
            final SubLObject ask_justification = conses_high.second(result);
            return ask_justification;
        }
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 81184L)
    public static SubLObject rkf_sd_prompt_from_cnf(final SubLObject cnf, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
        thread.resetMultipleValues();
        final SubLObject formula = rkf_sd_prompt_formula_for_cnf(cnf, v_term);
        final SubLObject new_cnf = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rkf_salient_descriptor_prompter.NIL != el_utilities.el_formula_p(formula)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(prompt, formula);
            rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs(prompt, (SubLObject)ConsesLow.cons(new_cnf, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt)));
        }
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 81516L)
    public static SubLObject rkf_sd_prompt_formula_for_cnf(final SubLObject cnf, final SubLObject v_term) {
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject bound_neg_lits = list_utilities.remove_if_not((SubLObject)rkf_salient_descriptor_prompter.$sym205$RKF_SD_EL_FULLY_BOUND_P, neg_lits, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject unbound_neg_lits = (rkf_salient_descriptor_prompter.NIL != bound_neg_lits) ? conses_high.set_difference(neg_lits, bound_neg_lits, Symbols.symbol_function((SubLObject)rkf_salient_descriptor_prompter.EQUAL), (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED) : neg_lits;
        final SubLObject conjunction = rkf_salient_descriptor.rkf_sd_conjoin((rkf_salient_descriptor_prompter.NIL != bound_neg_lits) ? bound_neg_lits : unbound_neg_lits, (SubLObject)rkf_salient_descriptor_prompter.T, (SubLObject)rkf_salient_descriptor_prompter.NIL);
        final SubLObject formula = rkf_sd_prompt_formula_for_lit(conjunction);
        final SubLObject new_neg_lits = (SubLObject)((rkf_salient_descriptor_prompter.NIL != bound_neg_lits) ? unbound_neg_lits : rkf_salient_descriptor_prompter.NIL);
        final SubLObject new_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf));
        return Values.values(formula, new_cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82109L)
    public static SubLObject rkf_sd_prompt_formula_for_lit(final SubLObject lit) {
        SubLObject formula = lit;
        SubLObject cdolist_list_var = el_utilities.sentence_free_variables(lit, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject var = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        var = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            formula = el_utilities.make_existential(var, formula);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82309L)
    public static SubLObject rkf_sd_prompter_example_instance_induced_strong(final SubLObject prompter) {
        return rkf_sd_prompter_example_instance_induced(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw206$STRONG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82508L)
    public static SubLObject rkf_sd_prompter_example_instance_induced_weak(final SubLObject prompter) {
        return rkf_sd_prompter_example_instance_induced(prompter, (SubLObject)rkf_salient_descriptor_prompter.$kw207$WEAK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82649L)
    public static SubLObject rkf_sd_prompter_example_instance_induced(final SubLObject prompter, final SubLObject strength) {
        final SubLObject example_instance = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject arg1 = cycl_utilities.nat_arg1(example_instance, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject collection = (rkf_salient_descriptor_prompter.NIL != rkf_domain_examples.rkf_generic_example_instance_level_p(example_instance)) ? arg1 : el_utilities.make_specs_fn(arg1);
        final SubLObject mt = rkf_salient_descriptor_prompter_mt(prompter);
        SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_induced_salient_descriptor_binary_preds(mt, collection, (SubLObject)rkf_salient_descriptor_prompter.$kw209$ISA, (SubLObject)rkf_salient_descriptor_prompter.TEN_INTEGER, strength, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        SubLObject cons = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        cons = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject binary_pred = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            SubLObject count = (SubLObject)rkf_salient_descriptor_prompter.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_prompter.$list208);
            binary_pred = current.first();
            current = (count = current.rest());
            if (rkf_salient_descriptor_prompter.NIL != rkf_sd_binary_pred_ok_for_promptsP(binary_pred)) {
                final SubLObject prompt = rkf_sd_prompt_example_instance_prompt(binary_pred, collection, mt);
                rkf_sd_prompter_add_prompt(prompter, prompt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 83442L)
    public static SubLObject rkf_sd_prompter_example_instance_noninduced(final SubLObject prompter) {
        final SubLObject example_instance = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject collection = cycl_utilities.nat_arg1(example_instance, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED);
        final SubLObject mt = rkf_salient_descriptor_prompter_mt(prompter);
        SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_noninduced_salient_descriptor_binary_preds(mt, collection, (SubLObject)rkf_salient_descriptor_prompter.$kw209$ISA);
        SubLObject binary_pred = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        binary_pred = cdolist_list_var.first();
        while (rkf_salient_descriptor_prompter.NIL != cdolist_list_var) {
            if (rkf_salient_descriptor_prompter.NIL != rkf_sd_binary_pred_ok_for_promptsP(binary_pred)) {
                final SubLObject prompt = rkf_sd_prompt_example_instance_prompt(binary_pred, collection, mt);
                rkf_sd_prompter_add_prompt(prompter, prompt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binary_pred = cdolist_list_var.first();
        }
        return (SubLObject)rkf_salient_descriptor_prompter.$kw19$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 84090L)
    public static SubLObject rkf_sd_binary_pred_ok_for_promptsP(final SubLObject binary_pred) {
        if (rkf_salient_descriptor_prompter.NIL != rkf_binary_pred_arg2_unparseableP(binary_pred)) {
            return (SubLObject)rkf_salient_descriptor_prompter.NIL;
        }
        return (SubLObject)rkf_salient_descriptor_prompter.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 84249L)
    public static SubLObject rkf_binary_pred_arg2_unparseableP(final SubLObject binary_pred) {
        SubLObject badP = (SubLObject)rkf_salient_descriptor_prompter.NIL;
        if (rkf_salient_descriptor_prompter.NIL == badP) {
            SubLObject csome_list_var;
            SubLObject v_arg_type;
            for (csome_list_var = kb_accessors.argn_isa(binary_pred, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, (SubLObject)rkf_salient_descriptor_prompter.UNPROVIDED), v_arg_type = (SubLObject)rkf_salient_descriptor_prompter.NIL, v_arg_type = csome_list_var.first(); rkf_salient_descriptor_prompter.NIL == badP && rkf_salient_descriptor_prompter.NIL != csome_list_var; badP = rkf_unparseable_arg_typeP(v_arg_type), csome_list_var = csome_list_var.rest(), v_arg_type = csome_list_var.first()) {}
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 84461L)
    public static SubLObject rkf_sd_prompt_example_instance_prompt(final SubLObject binary_pred, final SubLObject collection, final SubLObject mt) {
        final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
        final SubLObject v_term = rkf_domain_examples.rkf_generic_example_for_collection(collection);
        final SubLObject formula = rkf_sd_prompt_example_instance_sentence(binary_pred, v_term, mt);
        final SubLObject rule_spec = rkf_salient_descriptor.new_rkf_salient_descriptor_rule_spec((SubLObject)rkf_salient_descriptor_prompter.$kw210$BIN_PRED, (SubLObject)rkf_salient_descriptor_prompter.$kw209$ISA, collection, binary_pred);
        final SubLObject justification = rkf_salient_descriptor.rkf_rule_spec_supports(v_term, rule_spec, mt);
        final SubLObject tactic = (SubLObject)rkf_salient_descriptor_prompter.$sym211$RKF_SD_PROMPT_EXAMPLE_INSTANCE;
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, formula);
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
        return new_prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 85104L)
    public static SubLObject rkf_sd_prompt_example_instance_sentence(final SubLObject binary_pred, final SubLObject v_term, final SubLObject mt) {
        final SubLObject arg2_collection = rkf_concept_clarifier.rkf_salient_argn_isa(binary_pred, (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER, mt);
        final SubLObject arg2 = rkf_domain_examples.rkf_generic_example_for_collection(arg2_collection);
        final SubLObject sentence = el_utilities.make_binary_formula(binary_pred, cycl_utilities.hl_to_el(v_term), arg2);
        return sentence;
    }
    
    public static SubLObject declare_rkf_salient_descriptor_prompter_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_prune_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRUNE-UNUSED-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_prompt_count", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PROMPT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_note_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NOTE-GENERATOR-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_clear_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CLEAR-GENERATOR-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_candidate_p", "RKF-SALIENT-DESCRIPTOR-CANDIDATE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "with_rkf_sd_prompter_lock_held", "WITH-RKF-SD-PROMPTER-LOCK-HELD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "with_rkf_sd_prompter_memoization_state", "WITH-RKF-SD-PROMPTER-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "with_rkf_sd_prompter_problem_store", "WITH-RKF-SD-PROMPTER-PROBLEM-STORE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_examples_for_prompt", "RKF-SD-EXAMPLES-FOR-PROMPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_find_or_set_problem_store", "RKF-SD-PROMPTER-FIND-OR-SET-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_reset_problem_store", "RKF-SALIENT-DESCRIPTOR-PROMPTER-RESET-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_next", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_finalize", "RKF-SALIENT-DESCRIPTOR-PROMPTER-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_mark_prompt_used", "RKF-SD-PROMPTER-MARK-PROMPT-USED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_remove_unused_prompt", "RKF-SD-PROMPTER-REMOVE-UNUSED-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_has_generator_thread_p", "RKF-SALIENT-DESCRIPTOR-PROMPTER-HAS-GENERATOR-THREAD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_unblock_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-UNBLOCK-GENERATOR-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_generate_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-GENERATE-PROMPT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_remove_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-REMOVE-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_replace_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-REPLACE-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_mt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_seed_term", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SEED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_pop_prompt_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-POP-PROMPT-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_prune_tactic_prompts", "RKF-SD-PROMPTER-PRUNE-TACTIC-PROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_prune_bad_prompts", "RKF-SD-PROMPTER-PRUNE-BAD-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_bad_promptP", "RKF-SD-BAD-PROMPT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_ok_support_p", "RKF-SD-OK-SUPPORT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_last_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-LAST-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_current_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CURRENT-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_next_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_current_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CURRENT-TACTIC-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_next_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT-TACTIC-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompt_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPT-TACTIC-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_string_for_tactic", "RKF-SD-STRING-FOR-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_best_prompt", "RKF-SD-PROMPTER-BEST-PROMPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_update_best_prompt", "RKF-SD-PROMPTER-UPDATE-BEST-PROMPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_sorted_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SORTED-UNUSED-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_better_promptP", "RKF-SD-BETTER-PROMPT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_knownP", "RKF-SD-PROMPTER-KNOWN?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompter_find_prompt_by_id", "RKF-SALIENT-DESCRIPTOR-PROMPTER-FIND-PROMPT-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_maybe_compute_subprompts", "RKF-SD-PROMPT-MAYBE-COMPUTE-SUBPROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_compute_subprompts", "RKF-SD-PROMPT-COMPUTE-SUBPROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_missing_examplesP", "RKF-SD-PROMPT-MISSING-EXAMPLES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_followup_prompt_via_prompter", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-PROMPT-VIA-PROMPTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_followup_prompt", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-PROMPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "positive_gaf_cnfs_p", "POSITIVE-GAF-CNFS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_add_prompt", "RKF-SD-PROMPTER-ADD-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_add_to_unused_prompts", "RKF-SD-PROMPTER-ADD-TO-UNUSED-PROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_E", "RKF-SD-PROMPT-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_formula_E", "RKF-SD-PROMPT-FORMULA-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_find_prompt_by_id_string", "RKF-SD-PROMPTER-FIND-PROMPT-BY-ID-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_find_prompt_by_id", "RKF-SD-PROMPTER-FIND-PROMPT-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_prefer_promptP", "RKF-SD-PROMPTER-PREFER-PROMPT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_localityG", "RKF-SD-PROMPT-LOCALITY>", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_local_supports", "RKF-SD-PROMPT-LOCAL-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_more_recent_supportsP", "RKF-SD-MORE-RECENT-SUPPORTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_generalityL", "RKF-SD-PROMPT-GENERALITY<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_sentence_generalityL", "RKF-SD-SENTENCE-GENERALITY<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_sentence_generality", "RKF-SD-SENTENCE-GENERALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_terms_generality", "RKF-SD-TERMS-GENERALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_term_generality", "RKF-SD-TERM-GENERALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_fewer_lits_p", "RKF-SD-PROMPT-FEWER-LITS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_min_lit_count", "RKF-SD-PROMPT-MIN-LIT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_cnf_lit_count", "RKF-SD-CNF-LIT-COUNT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "with_rkf_salient_descriptor_seed_term_tactics_table", "WITH-RKF-SALIENT-DESCRIPTOR-SEED-TERM-TACTICS-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_tactics_for_seed_term_type", "RKF-SD-PROMPTER-TACTICS-FOR-SEED-TERM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_compute_seed_term_type", "RKF-SD-PROMPTER-COMPUTE-SEED-TERM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "formula_template_fort_for_rkf_salient_descriptor_prompt", "FORMULA-TEMPLATE-FORT-FOR-RKF-SALIENT-DESCRIPTOR-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "find_or_create_formula_template_fort", "FIND-OR-CREATE-FORMULA-TEMPLATE-FORT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "formula_template_definitional_properties", "FORMULA-TEMPLATE-DEFINITIONAL-PROPERTIES", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_fet_data_assert_mt", "RKF-SD-FET-DATA-ASSERT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_fet_find_match", "RKF-SD-FET-FIND-MATCH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_fet_assert", "RKF-SD-FET-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_new_formula_template_fort", "RKF-SD-NEW-FORMULA-TEMPLATE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_candidate_replacement_info", "RKF-SD-CANDIDATE-REPLACEMENT-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_get_var_arg_positions", "RKF-SD-PROMPT-GET-VAR-ARG-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_get_precedent_example_sentences", "RKF-SD-PROMPT-GET-PRECEDENT-EXAMPLE-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_single_entry_promptP", "RKF-SD-SINGLE-ENTRY-PROMPT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_hide_specs_fn_replacements", "RKF-SD-HIDE-SPECS-FN-REPLACEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "prune_rkf_sd_formula_template_topic", "PRUNE-RKF-SD-FORMULA-TEMPLATE-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "focal_term_type_has_template_with_bin_predP", "FOCAL-TERM-TYPE-HAS-TEMPLATE-WITH-BIN-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_induced_salient_descriptor_prompts_for_focal_term_type", "RKF-INDUCED-SALIENT-DESCRIPTOR-PROMPTS-FOR-FOCAL-TERM-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_salient_descriptor_prompts_for_focal_term_type", "RKF-SALIENT-DESCRIPTOR-PROMPTS-FOR-FOCAL-TERM-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_apply_tactics", "RKF-SD-PROMPTER-APPLY-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_exhausted_p", "RKF-SD-PROMPTER-EXHAUSTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_tactics_exhausted_p", "RKF-SD-PROMPTER-TACTICS-EXHAUSTED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_tactics_next", "RKF-SD-PROMPTER-TACTICS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_apply_tactic", "RKF-SD-PROMPTER-APPLY-TACTIC", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "with_sd_tactic_disabled_for_seed_term_type", "WITH-SD-TACTIC-DISABLED-FOR-SEED-TERM-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "with_sd_tactics_disabled_for_seed_term_type", "WITH-SD-TACTICS-DISABLED-FOR-SEED-TERM-TYPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_suggestion", "RKF-SD-PROMPTER-SUGGESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_required", "RKF-SD-PROMPTER-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_interaction_context_required", "RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_interaction_context_strong", "RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_add_ke_driven_prompts", "RKF-SD-PROMPTER-ADD-KE-DRIVEN-PROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_ke_driven_prompt_fodder", "RKF-SD-PROMPTER-KE-DRIVEN-PROMPT-FODDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_update_ke_driven_prompts", "RKF-SD-PROMPTER-UPDATE-KE-DRIVEN-PROMPTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_compute_ke_driven_prompt_fodder", "RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_iterative_prompt_method_p", "RKF-SD-PROMPTER-ITERATIVE-PROMPT-METHOD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_get_ke_driven_prompt_formulas", "RKF-SD-PROMPTER-GET-KE-DRIVEN-PROMPT-FORMULAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_suppress_formula_for_seed_termP", "RKF-SD-SUPPRESS-FORMULA-FOR-SEED-TERM?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_suppress_formula_threshold", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_suppress_formula_threshold_for_property_internal", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY-INTERNAL", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_suppress_formula_threshold_for_property", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_suppress_formula_test_query", "RKF-SD-SUPPRESS-FORMULA-TEST-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_ke_driven_inference_and_var", "RKF-SD-PROMPTER-KE-DRIVEN-INFERENCE-AND-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_analogize", "RKF-SD-PROMPTER-ANALOGIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_get_analogous_terms", "RKF-SD-PROMPTER-GET-ANALOGOUS-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_clear_analogous_terms", "RKF-SD-PROMPTER-CLEAR-ANALOGOUS-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_add_analogy_prompt", "RKF-SD-PROMPTER-ADD-ANALOGY-PROMPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_add_analogy_examples", "RKF-SD-PROMPT-ADD-ANALOGY-EXAMPLES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_loosen_analogy_formula", "RKF-SD-PROMPTER-LOOSEN-ANALOGY-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_uneditable_analogy_argP", "RKF-SD-PROMPTER-UNEDITABLE-ANALOGY-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_analogy_var", "RKF-SD-PROMPTER-ANALOGY-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_get_analogy_suggestions", "RKF-SD-PROMPTER-GET-ANALOGY-SUGGESTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_clear_analogy_suggestions", "RKF-SD-PROMPTER-CLEAR-ANALOGY-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_analogy_justifications", "RKF-SD-ANALOGY-JUSTIFICATIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_rules_for_term", "RKF-SD-PROMPTER-RULES-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_rule_table_pop", "RKF-SD-PROMPTER-RULE-TABLE-POP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_rule_table", "RKF-SD-PROMPTER-RULE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_sort_rule_tuples", "RKF-SD-SORT-RULE-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_remove_low_scoring_tuples", "RKF-SD-REMOVE-LOW-SCORING-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_low_scoring_tuple_p", "RKF-SD-LOW-SCORING-TUPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_score_rule_tuples", "RKF-SD-SCORE-RULE-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_get_other_rules", "RKF-SD-GET-OTHER-RULES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_get_isa_rules", "RKF-SD-GET-ISA-RULES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_get_genls_rules", "RKF-SD-GET-GENLS-RULES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rule_tuple_E", "RKF-SD-RULE-TUPLE-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_score_rule_tuple", "RKF-SD-SCORE-RULE-TUPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prefer_rule_tupleP", "RKF-SD-PREFER-RULE-TUPLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rule_info_score_G", "RKF-SD-RULE-INFO-SCORE->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rule_score_do_test", "RKF-SD-RULE-SCORE-DO-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_seed_term_in_pos_lits", "RKF-SD-RST-SEED-TERM-IN-POS-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_seed_term_in_neg_lits", "RKF-SD-RST-SEED-TERM-IN-NEG-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_var_count", "RKF-SD-RST-VAR-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_neg_lit_count", "RKF-SD-RST-NEG-LIT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_pos_lit_count", "RKF-SD-RST-POS-LIT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_mt_generality", "RKF-SD-RST-MT-GENERALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_rst_pos_lit_quality", "RKF-SD-RST-POS-LIT-QUALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_tuple_mt_generality", "RKF-SD-TUPLE-MT-GENERALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_cnf_rule_count", "RKF-SD-CNF-RULE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_el_cnf_from_rule_tuple", "RKF-SD-EL-CNF-FROM-RULE-TUPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_gaf_okP", "RKF-SD-GAF-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_gaf_generality_okP", "RKF-SD-GAF-GENERALITY-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_term_too_generalP", "RKF-SD-TERM-TOO-GENERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_gaf_rule_bindings", "RKF-SD-GAF-RULE-BINDINGS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_gaf_lit_rule_bindings", "RKF-SD-GAF-LIT-RULE-BINDINGS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_subprompts_matches_cnfP", "RKF-SD-SUBPROMPTS-MATCHES-CNF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_assert_sentence_matches_cnfP", "RKF-SD-ASSERT-SENTENCE-MATCHES-CNF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_assert_sentence_matches_neg_litP", "RKF-SD-ASSERT-SENTENCE-MATCHES-NEG-LIT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_strong", "RKF-SD-PROMPTER-STRONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_induced", "RKF-SD-PROMPTER-INDUCED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_weak", "RKF-SD-PROMPTER-WEAK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_compute_subpromptss", "RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_bad_subpromptsP", "RKF-SD-PROMPT-BAD-SUBPROMPTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_not_assertible_subpromptsP_internal", "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_not_assertible_subpromptsP", "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_unparseable_subpromptsP_internal", "RKF-SD-UNPARSEABLE-SUBPROMPTS?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_unparseable_subpromptsP", "RKF-SD-UNPARSEABLE-SUBPROMPTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_unparseable_prompt_litP_internal", "RKF-SD-UNPARSEABLE-PROMPT-LIT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_unparseable_prompt_litP", "RKF-SD-UNPARSEABLE-PROMPT-LIT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_unparseable_arg_typeP", "RKF-UNPARSEABLE-ARG-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_no_instances_arg_typeP", "RKF-NO-INSTANCES-ARG-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_direct_instances_arg_typeP", "RKF-DIRECT-INSTANCES-ARG-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_find_rule_prompts", "RKF-SD-PROMPTER-FIND-RULE-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_justification_from_sentence", "RKF-SD-PROMPT-JUSTIFICATION-FROM-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_from_cnf", "RKF-SD-PROMPT-FROM-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_formula_for_cnf", "RKF-SD-PROMPT-FORMULA-FOR-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_formula_for_lit", "RKF-SD-PROMPT-FORMULA-FOR-LIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_example_instance_induced_strong", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_example_instance_induced_weak", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_example_instance_induced", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompter_example_instance_noninduced", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_binary_pred_ok_for_promptsP", "RKF-SD-BINARY-PRED-OK-FOR-PROMPTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_binary_pred_arg2_unparseableP", "RKF-BINARY-PRED-ARG2-UNPARSEABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_example_instance_prompt", "RKF-SD-PROMPT-EXAMPLE-INSTANCE-PROMPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter", "rkf_sd_prompt_example_instance_sentence", "RKF-SD-PROMPT-EXAMPLE-INSTANCE-SENTENCE", 3, 0, false);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    public static SubLObject init_rkf_salient_descriptor_prompter_file() {
        rkf_salient_descriptor_prompter.$rkf_sd_strings_for_tactics$ = SubLFiles.deflexical("*RKF-SD-STRINGS-FOR-TACTICS*", (SubLObject)rkf_salient_descriptor_prompter.$list28);
        rkf_salient_descriptor_prompter.$rkf_prompter_sort_prompter$ = SubLFiles.defparameter("*RKF-PROMPTER-SORT-PROMPTER*", (SubLObject)rkf_salient_descriptor_prompter.NIL);
        rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$ = SubLFiles.defparameter("*RKF-SD-SEED-TERM-TACTICS-TABLE*", (SubLObject)rkf_salient_descriptor_prompter.$list48);
        rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$ = SubLFiles.defparameter("*RKF-SD-SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?*", (SubLObject)rkf_salient_descriptor_prompter.T);
        rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_percent_min$ = SubLFiles.defparameter("*RKF-SD-SUPPRESS-FORMULA-PERCENT-MIN*", (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER);
        rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_count_min$ = SubLFiles.defparameter("*RKF-SD-SUPPRESS-FORMULA-COUNT-MIN*", (SubLObject)rkf_salient_descriptor_prompter.TWO_INTEGER);
        rkf_salient_descriptor_prompter.$rkf_sd_seed_term$ = SubLFiles.defparameter("*RKF-SD-SEED-TERM*", (SubLObject)rkf_salient_descriptor_prompter.NIL);
        rkf_salient_descriptor_prompter.$rkf_sd_rule_score_tests$ = SubLFiles.deflexical("*RKF-SD-RULE-SCORE-TESTS*", (SubLObject)rkf_salient_descriptor_prompter.$list186);
        rkf_salient_descriptor_prompter.$rkf_unparseable_arg_types$ = SubLFiles.defconstant("*RKF-UNPARSEABLE-ARG-TYPES*", (SubLObject)rkf_salient_descriptor_prompter.$list198);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    public static SubLObject setup_rkf_salient_descriptor_prompter_file() {
        access_macros.register_macro_helper((SubLObject)rkf_salient_descriptor_prompter.$sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, (SubLObject)rkf_salient_descriptor_prompter.$sym17$WITH_RKF_SD_PROMPTER_PROBLEM_STORE);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor_prompter.$sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor_prompter.$sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor_prompter.$sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_);
        memoization_state.note_memoized_function((SubLObject)rkf_salient_descriptor_prompter.$sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_);
        return (SubLObject)rkf_salient_descriptor_prompter.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_salient_descriptor_prompter_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_salient_descriptor_prompter_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_salient_descriptor_prompter_file();
    }
    
    static {
        me = (SubLFile)new rkf_salient_descriptor_prompter();
        rkf_salient_descriptor_prompter.$rkf_sd_strings_for_tactics$ = null;
        rkf_salient_descriptor_prompter.$rkf_prompter_sort_prompter$ = null;
        rkf_salient_descriptor_prompter.$rkf_sd_seed_term_tactics_table$ = null;
        rkf_salient_descriptor_prompter.$rkf_sd_suppress_rarely_known_prompt_formulasP$ = null;
        rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_percent_min$ = null;
        rkf_salient_descriptor_prompter.$rkf_sd_suppress_formula_count_min$ = null;
        rkf_salient_descriptor_prompter.$rkf_sd_seed_term$ = null;
        rkf_salient_descriptor_prompter.$rkf_sd_rule_score_tests$ = null;
        rkf_salient_descriptor_prompter.$rkf_unparseable_arg_types$ = null;
        $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P");
        $kw1$GENERATOR_THREAD = SubLObjectFactory.makeKeyword("GENERATOR-THREAD");
        $kw2$NONE = SubLObjectFactory.makeKeyword("NONE");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROMPTER"), (SubLObject)SubLObjectFactory.makeSymbol("WHOSTATE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym4$LOCK = SubLObjectFactory.makeUninternedSymbol("LOCK");
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-LOOKUP");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"));
        $sym8$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $kw9$WHOSTATE = SubLObjectFactory.makeKeyword("WHOSTATE");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROMPTER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MEMOIZATION-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-MEMOIZATION-STATE")));
        $sym13$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $sym14$_RKF_SD_PROBLEM_STORE_ = SubLObjectFactory.makeSymbol("*RKF-SD-PROBLEM-STORE*");
        $sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-FIND-OR-SET-PROBLEM-STORE");
        $sym16$REUSING_RKF_SD_PROBLEM_STORE = SubLObjectFactory.makeSymbol("REUSING-RKF-SD-PROBLEM-STORE");
        $sym17$WITH_RKF_SD_PROMPTER_PROBLEM_STORE = SubLObjectFactory.makeSymbol("WITH-RKF-SD-PROMPTER-PROBLEM-STORE");
        $kw18$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw19$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw20$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $kw21$REMOVED = SubLObjectFactory.makeKeyword("REMOVED");
        $kw22$TACTIC_DONE = SubLObjectFactory.makeKeyword("TACTIC-DONE");
        $kw23$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw24$BEST_PROMPT = SubLObjectFactory.makeKeyword("BEST-PROMPT");
        $kw25$RECOMPUTE = SubLObjectFactory.makeKeyword("RECOMPUTE");
        $sym26$RKF_SALIENT_DESCRIPTOR_PROMPT_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");
        $kw27$LAST_TACTIC = SubLObjectFactory.makeKeyword("LAST-TACTIC");
        $list28 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM"), (SubLObject)SubLObjectFactory.makeString("Rules for Term")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-ANALOGIZE"), (SubLObject)SubLObjectFactory.makeString("Analogy")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-INDUCED"), (SubLObject)SubLObjectFactory.makeString("Induced Interview Questions")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS"), (SubLObject)SubLObjectFactory.makeString("Flesh out Precomputed Questions")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-REQUIRED"), (SubLObject)SubLObjectFactory.makeString("Required Knowledge")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-STRONG"), (SubLObject)SubLObjectFactory.makeString("Strong Suggestions")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-WEAK"), (SubLObject)SubLObjectFactory.makeString("Weak Suggestions")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-INTERACTION-CONTEXT-REQUIRED"), (SubLObject)SubLObjectFactory.makeString("Required Interaction Context Refinements")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RKF-INTERACTION-CONTEXT-STRONG"), (SubLObject)SubLObjectFactory.makeString("Strongly Suggested Interaction Context Refinements")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FOLLOW-UP"), (SubLObject)SubLObjectFactory.makeString("Follow-up Prompt")) });
        $str29$None = SubLObjectFactory.makeString("None");
        $str30$Unknown = SubLObjectFactory.makeString("Unknown");
        $kw31$BAD = SubLObjectFactory.makeKeyword("BAD");
        $sym32$RKF_SD_BETTER_PROMPT_ = SubLObjectFactory.makeSymbol("RKF-SD-BETTER-PROMPT?");
        $sym33$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw34$EXAMPLE_INSTANCE = SubLObjectFactory.makeKeyword("EXAMPLE-INSTANCE");
        $kw35$SPECIFY = SubLObjectFactory.makeKeyword("SPECIFY");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $sym37$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $kw38$ADDED = SubLObjectFactory.makeKeyword("ADDED");
        $kw39$ALREADY_PRESENT = SubLObjectFactory.makeKeyword("ALREADY-PRESENT");
        $sym40$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym41$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $sym42$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $sym43$ASSERTED_WHEN = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $sym44$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $kw45$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym46$_ = SubLObjectFactory.makeSymbol("+");
        $sym47$RKF_SD_TERM_GENERALITY = SubLObjectFactory.makeSymbol("RKF-SD-TERM-GENERALITY");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-SUGGESTION"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-ANALOGIZE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-INDUCED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-SUGGESTION"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GAF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-FIND-RULE-PROMPTS")));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym50$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym51$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-P"));
        $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_ = SubLObjectFactory.makeSymbol("*RKF-SD-SEED-TERM-TACTICS-TABLE*");
        $const54$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $kw55$MT = SubLObjectFactory.makeKeyword("MT");
        $kw56$FORT = SubLObjectFactory.makeKeyword("FORT");
        $kw57$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw58$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw59$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym60$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str61$Couldn_t_find__S_in__S_ = SubLObjectFactory.makeString("Couldn't find ~S in ~S.");
        $kw62$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $const63$focalTermPositionForFormulaTempla = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("focalTermPositionForFormulaTemplate"));
        $const64$formulaForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaForFormulaTemplate"));
        $const65$formulaTemplateExample = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateExample"));
        $int66$100 = SubLObjectFactory.makeInteger(100);
        $list67 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ARG-POS"), (SubLObject)SubLObjectFactory.makeSymbol("INFO"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("EXPLANATION"));
        $const69$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $const70$templateReplacementsInvisibleForP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("templateReplacementsInvisibleForPosition"));
        $const71$candidateReplacementForPosition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateReplacementForPosition"));
        $const72$glossForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("glossForFormulaTemplate"));
        $const73$formulaTemplateArgExplanation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateArgExplanation"));
        $const74$assertMtForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertMtForFormulaTemplate"));
        $const75$assertionFormatForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionFormatForFormulaTemplate"));
        $const76$SingleAssertionEntry = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleAssertionEntry"));
        $const77$MultipleAssertionEntry = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultipleAssertionEntry"));
        $const78$DataForNLMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DataForNLMt"));
        $sym79$SUGGEST_MT = SubLObjectFactory.makeSymbol("SUGGEST-MT");
        $sym80$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym81$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const82$defaultDefiningMtForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDefiningMtForSentence"));
        $kw83$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw84$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw85$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int86$30 = SubLObjectFactory.makeInteger(30);
        $kw87$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $const88$GKEFormulaTemplatesMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GKEFormulaTemplatesMt"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)rkf_salient_descriptor_prompter.ONE_INTEGER);
        $const90$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const91$FormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplate"));
        $const92$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list93 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplate")));
        $const94$formulaTemplateHasType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasType"));
        $str95$constantNameAutoGeneratedFromColl = SubLObjectFactory.makeString("constantNameAutoGeneratedFromCollection");
        $const96$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym97$RKF_GENERIC_EXAMPLE_P = SubLObjectFactory.makeSymbol("RKF-GENERIC-EXAMPLE-P");
        $kw98$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw99$FOCAL_TERM = SubLObjectFactory.makeKeyword("FOCAL-TERM");
        $const100$SomeExampleFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeExampleFn"));
        $const101$focalTermTypeForInducedTemplateTy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("focalTermTypeForInducedTemplateType"));
        $sym102$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const103$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw104$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw105$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw106$STACK = SubLObjectFactory.makeKeyword("STACK");
        $const107$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw109$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str110$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym111$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw112$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str113$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw114$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str115$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const116$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str117$Redundant_with__S_____S_on__S = SubLObjectFactory.makeString("Redundant with ~S:~% ~S on ~S");
        $str118$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str119$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str120$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $list121 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasType")));
        $str122$Hey_ho___S_has_got_to_go___ = SubLObjectFactory.makeString("Hey ho. ~S has got to go.~%");
        $sym123$ISA_COLLECTION_ = SubLObjectFactory.makeSymbol("ISA-COLLECTION?");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK")));
        $sym125$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $kw126$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEED-TERM-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TACTIC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym128$TACTICS_FOR_SEED_TERM_TYPE = SubLObjectFactory.makeUninternedSymbol("TACTICS-FOR-SEED-TERM-TYPE");
        $sym129$TACTICS_TABLE_COPY = SubLObjectFactory.makeUninternedSymbol("TACTICS-TABLE-COPY");
        $sym130$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-TACTICS-FOR-SEED-TERM-TYPE");
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)rkf_salient_descriptor_prompter.EQ));
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("*RKF-SD-SEED-TERM-TACTICS-TABLE*")));
        $sym134$ALIST_ENTER = SubLObjectFactory.makeSymbol("ALIST-ENTER");
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEED-TERM-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TACTICS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym136$TACTICS_FOR_SEED_TERM_TYPE = SubLObjectFactory.makeUninternedSymbol("TACTICS-FOR-SEED-TERM-TYPE");
        $sym137$TACTICS_TABLE_COPY = SubLObjectFactory.makeUninternedSymbol("TACTICS-TABLE-COPY");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P"));
        $sym139$ORDERED_SET_DIFFERENCE = SubLObjectFactory.makeSymbol("ORDERED-SET-DIFFERENCE");
        $const140$keSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keSuggestion"));
        $const141$keRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRequirement"));
        $const142$keInteractionRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInteractionRequirement"));
        $const143$keInteractionStrongSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keInteractionStrongSuggestion"));
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATIONS"));
        $kw145$KE_DRIVEN_PROMPTS = SubLObjectFactory.makeKeyword("KE-DRIVEN-PROMPTS");
        $sym146$RKF_NEIGHBOR_SUGGESTIONS = SubLObjectFactory.makeSymbol("RKF-NEIGHBOR-SUGGESTIONS");
        $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_ = SubLObjectFactory.makeKeyword("SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?");
        $kw148$RESULTS_QUEUE = SubLObjectFactory.makeKeyword("RESULTS-QUEUE");
        $list149 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-VAR"));
        $str150$Timed_out_after__S_seconds_gettin = SubLObjectFactory.makeString("Timed out after ~S seconds getting ~S for ~S.~%");
        $kw151$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $str152$P_A_D__getting__S_for__S___ = SubLObjectFactory.makeString("P.A.D. getting ~S for ~S.~%");
        $kw153$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $str154$_S_is_not_continuable____Exit_con = SubLObjectFactory.makeString("~S is not continuable.~% Exit condition: ~S~%");
        $sym155$_SEED_TERM = SubLObjectFactory.makeSymbol("?SEED-TERM");
        $str156$Suppressing_SD_prompt_for__S_____ = SubLObjectFactory.makeString("Suppressing SD prompt for ~S:~% ~S~% Couldn't find the minimum ~S similar terms about which that is known.~%");
        $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY = SubLObjectFactory.makeSymbol("RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY");
        $kw158$CACHED_INFERENCES = SubLObjectFactory.makeKeyword("CACHED-INFERENCES");
        $list159 = ConsesLow.list((SubLObject)rkf_salient_descriptor_prompter.NIL);
        $list160 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"));
        $sym161$_FORMULA = SubLObjectFactory.makeSymbol("?FORMULA");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym163$_SOURCE_TERM = SubLObjectFactory.makeSymbol("?SOURCE-TERM");
        $kw164$ANALOGOUS_TERMS = SubLObjectFactory.makeKeyword("ANALOGOUS-TERMS");
        $const165$similarTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("similarTo"));
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-JUSTIFICATION"));
        $kw167$PRECEDENT = SubLObjectFactory.makeKeyword("PRECEDENT");
        $const168$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $sym169$_X = SubLObjectFactory.makeSymbol("?X");
        $kw170$ANALOGY_SUGGESTIONS = SubLObjectFactory.makeKeyword("ANALOGY-SUGGESTIONS");
        $const171$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw172$USE_RULES_ = SubLObjectFactory.makeKeyword("USE-RULES?");
        $kw173$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw174$RULE_TABLE = SubLObjectFactory.makeKeyword("RULE-TABLE");
        $kw175$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym176$EL_EXPRESSION_EQUAL_ = SubLObjectFactory.makeSymbol("EL-EXPRESSION-EQUAL?");
        $sym177$RKF_SD_PROMPTER_RULES_FOR_TERM = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM");
        $kw178$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw179$POS = SubLObjectFactory.makeKeyword("POS");
        $sym180$RKF_SD_RULE_TUPLE__ = SubLObjectFactory.makeSymbol("RKF-SD-RULE-TUPLE-=");
        $sym181$RKF_SD_PREFER_RULE_TUPLE_ = SubLObjectFactory.makeSymbol("RKF-SD-PREFER-RULE-TUPLE?");
        $sym182$RKF_SD_LOW_SCORING_TUPLE_P = SubLObjectFactory.makeSymbol("RKF-SD-LOW-SCORING-TUPLE-P");
        $sym183$RKF_SD_SCORE_RULE_TUPLE = SubLObjectFactory.makeSymbol("RKF-SD-SCORE-RULE-TUPLE");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF1"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-LIT1"), (SubLObject)SubLObjectFactory.makeSymbol("RULE1"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS1"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF2"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-LIT2"), (SubLObject)SubLObjectFactory.makeSymbol("RULE2"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS2"));
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-SEED-TERM-IN-POS-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-SEED-TERM-IN-NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-VAR-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-NEG-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-POS-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-MT-GENERALITY"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RST-POS-LIT-QUALITY"));
        $kw187$BETTER = SubLObjectFactory.makeKeyword("BETTER");
        $kw188$WORSE = SubLObjectFactory.makeKeyword("WORSE");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-LIT"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"));
        $sym190$RKF_SD_TERM_TOO_GENERAL_ = SubLObjectFactory.makeSymbol("RKF-SD-TERM-TOO-GENERAL?");
        $int191$5000 = SubLObjectFactory.makeInteger(5000);
        $const192$keStrongSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keStrongSuggestion"));
        $const193$keWeakSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keWeakSuggestion"));
        $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_ = SubLObjectFactory.makeSymbol("RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?");
        $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_ = SubLObjectFactory.makeSymbol("RKF-SD-UNPARSEABLE-SUBPROMPTS?");
        $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_ = SubLObjectFactory.makeSymbol("RKF-SD-UNPARSEABLE-PROMPT-LIT?");
        $list197 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list198 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion")));
        $const199$defnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $const200$defnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $const201$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $const202$CoaDiagramObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoaDiagramObject"));
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("JUST-SENTENCE"));
        $sym204$RKF_SD_PROMPTER_FIND_RULE_PROMPTS = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-FIND-RULE-PROMPTS");
        $sym205$RKF_SD_EL_FULLY_BOUND_P = SubLObjectFactory.makeSymbol("RKF-SD-EL-FULLY-BOUND-P");
        $kw206$STRONG = SubLObjectFactory.makeKeyword("STRONG");
        $kw207$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $list208 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BINARY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $kw209$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw210$BIN_PRED = SubLObjectFactory.makeKeyword("BIN-PRED");
        $sym211$RKF_SD_PROMPT_EXAMPLE_INSTANCE = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-EXAMPLE-INSTANCE");
    }
}

/*

	Total time: 2896 ms
	
*/