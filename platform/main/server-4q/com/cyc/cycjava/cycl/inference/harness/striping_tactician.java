package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_browser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class striping_tactician extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new striping_tactician();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.harness.striping_tactician";


    // defconstant
    public static final SubLSymbol $dtp_striping_tactician_data$ = makeSymbol("*DTP-STRIPING-TACTICIAN-DATA*");

    // defconstant
    public static final SubLSymbol $dtp_new_root_metrics$ = makeSymbol("*DTP-NEW-ROOT-METRICS*");

    // defparameter
    private static final SubLSymbol $new_root_answerability_expectation$ = makeSymbol("*NEW-ROOT-ANSWERABILITY-EXPECTATION*");

    // defparameter
    private static final SubLSymbol $new_root_freshness_threshold$ = makeSymbol("*NEW-ROOT-FRESHNESS-THRESHOLD*");

    // defparameter
    private static final SubLSymbol $striping_tactician_one_stripe_modeP$ = makeSymbol("*STRIPING-TACTICIAN-ONE-STRIPE-MODE?*");

    // defvar
    private static final SubLSymbol $striping_tactician_early_removal_productivity_limit$ = makeSymbol("*STRIPING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*");

    // defparameter
    private static final SubLSymbol $striping_tactician_self_looping_rule_fix_enabledP$ = makeSymbol("*STRIPING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*");

    // defvar
    public static final SubLSymbol $striping_tactician_new_roots_check_for_t_on_jo_linkP$ = makeSymbol("*STRIPING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*");

    // defparameter
    private static final SubLSymbol $striping_tactician_new_roots_triggered_by_t_on_jo_linkP$ = makeSymbol("*STRIPING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*");

    // defparameter
    private static final SubLSymbol $striping_tactician_is_tactically_hardcoreP$ = makeSymbol("*STRIPING-TACTICIAN-IS-TACTICALLY-HARDCORE?*");

    private static final SubLSymbol $STRIPING = makeKeyword("STRIPING");

    private static final SubLList $list1 = list(new SubLObject[] { $NAME, makeString("Striping Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and multiple removal tacticians."),
	    makeKeyword("CONSTRUCTOR"), makeSymbol("STRIPING-TACTICIAN-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("STRIPING-TACTICIAN-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("STRIPING-TACTICIAN-DO-ONE-STEP"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"),
	    makeSymbol("STRIPING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("STRIPING-TACTICIAN-INITIALIZE-PROPERTIES"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("STRIPING-TACTICIAN-UPDATE-PROPERTIES"),
	    makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("STRIPING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("STRIPING-TACTICIAN-CONTINUATION-POSSIBLE?"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"),
	    makeSymbol("STRIPING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("STRIPING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("STRIPING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"),
	    makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?"), makeKeyword("THROW-AWAY-TACTIC"),
	    makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("STRIPING-TACTICIAN-NOTE-ARGUMENT-LINK"), makeKeyword("NEW-TACTIC"),
	    makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("FALSE"),
	    makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("STRIPING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"),
	    makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("STRIPING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("STRIPING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE") });

    private static final SubLSymbol STRIPING_TACTICIAN_DATA = makeSymbol("STRIPING-TACTICIAN-DATA");

    private static final SubLSymbol STRIPING_TACTICIAN_DATA_P = makeSymbol("STRIPING-TACTICIAN-DATA-P");

    private static final SubLList $list4 = list(makeSymbol("NEW-ROOT-SUBSTRATEGY"), makeSymbol("TRANSFORMATION-SUBSTRATEGY"), makeSymbol("REMOVAL-SUBSTRATEGIES"), makeSymbol("NEW-ROOT-R-MAP"), makeSymbol("NEW-ROOT-PROOFINESS-MAP"), makeSymbol("NEW-ROOT-DELAY-MAP"),
	    makeSymbol("NEW-ROOT-METRICS-MAP"));

    private static final SubLList $list5 = list(makeKeyword("NEW-ROOT-SUBSTRATEGY"), makeKeyword("TRANSFORMATION-SUBSTRATEGY"), makeKeyword("REMOVAL-SUBSTRATEGIES"), makeKeyword("NEW-ROOT-R-MAP"), makeKeyword("NEW-ROOT-PROOFINESS-MAP"), makeKeyword("NEW-ROOT-DELAY-MAP"),
	    makeKeyword("NEW-ROOT-METRICS-MAP"));

    private static final SubLList $list6 = list(makeSymbol("STR-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("STR-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("STR-TAC-DATA-REMOVAL-SUBSTRATEGIES"), makeSymbol("STR-TAC-DATA-NEW-ROOT-R-MAP"), makeSymbol("STR-TAC-DATA-NEW-ROOT-PROOFINESS-MAP"),
	    makeSymbol("STR-TAC-DATA-NEW-ROOT-DELAY-MAP"), makeSymbol("STR-TAC-DATA-NEW-ROOT-METRICS-MAP"));

    private static final SubLList $list7 = list(makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("_CSETF-STR-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("_CSETF-STR-TAC-DATA-REMOVAL-SUBSTRATEGIES"), makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-R-MAP"),
	    makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-PROOFINESS-MAP"), makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-DELAY-MAP"), makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-METRICS-MAP"));

    private static final SubLSymbol STRIPING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRIPING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STRIPING-TACTICIAN-DATA-P"));

    private static final SubLSymbol STR_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("STR-TAC-DATA-NEW-ROOT-SUBSTRATEGY");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-SUBSTRATEGY");

    private static final SubLSymbol STR_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("STR-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("_CSETF-STR-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");

    private static final SubLSymbol STR_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("STR-TAC-DATA-REMOVAL-SUBSTRATEGIES");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("_CSETF-STR-TAC-DATA-REMOVAL-SUBSTRATEGIES");

    private static final SubLSymbol STR_TAC_DATA_NEW_ROOT_R_MAP = makeSymbol("STR-TAC-DATA-NEW-ROOT-R-MAP");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_NEW_ROOT_R_MAP = makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-R-MAP");

    private static final SubLSymbol STR_TAC_DATA_NEW_ROOT_PROOFINESS_MAP = makeSymbol("STR-TAC-DATA-NEW-ROOT-PROOFINESS-MAP");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_NEW_ROOT_PROOFINESS_MAP = makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-PROOFINESS-MAP");

    private static final SubLSymbol STR_TAC_DATA_NEW_ROOT_DELAY_MAP = makeSymbol("STR-TAC-DATA-NEW-ROOT-DELAY-MAP");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_NEW_ROOT_DELAY_MAP = makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-DELAY-MAP");

    private static final SubLSymbol STR_TAC_DATA_NEW_ROOT_METRICS_MAP = makeSymbol("STR-TAC-DATA-NEW-ROOT-METRICS-MAP");

    private static final SubLSymbol _CSETF_STR_TAC_DATA_NEW_ROOT_METRICS_MAP = makeSymbol("_CSETF-STR-TAC-DATA-NEW-ROOT-METRICS-MAP");

    private static final SubLSymbol $NEW_ROOT_SUBSTRATEGY = makeKeyword("NEW-ROOT-SUBSTRATEGY");

    private static final SubLSymbol $NEW_ROOT_R_MAP = makeKeyword("NEW-ROOT-R-MAP");

    private static final SubLSymbol $NEW_ROOT_PROOFINESS_MAP = makeKeyword("NEW-ROOT-PROOFINESS-MAP");

    private static final SubLSymbol $NEW_ROOT_DELAY_MAP = makeKeyword("NEW-ROOT-DELAY-MAP");

    private static final SubLSymbol $NEW_ROOT_METRICS_MAP = makeKeyword("NEW-ROOT-METRICS-MAP");

    private static final SubLString $str32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_STRIPING_TACTICIAN_DATA = makeSymbol("MAKE-STRIPING-TACTICIAN-DATA");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STRIPING_TACTICIAN_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRIPING-TACTICIAN-DATA-METHOD");

    private static final SubLList $list38 = list(makeKeyword("STRIPING"));

    private static final SubLList $list39 = list(list(makeSymbol("SUBSTRATEGY-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list40 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol STRIPING_TACTICIAN_ALL_SUBSTRATEGIES = makeSymbol("STRIPING-TACTICIAN-ALL-SUBSTRATEGIES");

    private static final SubLSymbol DO_STRIPING_TACTICIAN_SUBSTRATEGIES = makeSymbol("DO-STRIPING-TACTICIAN-SUBSTRATEGIES");

    private static final SubLSymbol STRIPING_TACTICIAN_SPINELESS_SUBSTRATEGY_P = makeSymbol("STRIPING-TACTICIAN-SPINELESS-SUBSTRATEGY-P");

    private static final SubLSymbol STRIPING_TACTICIAN_REMOVAL_SUBSTRATEGIES = makeSymbol("STRIPING-TACTICIAN-REMOVAL-SUBSTRATEGIES");

    private static final SubLSymbol $sym50$STRATEGY_DONE_ = makeSymbol("STRATEGY-DONE?");

    private static final SubLSymbol STRIPING_TACTICIAN_INITIALIZE = makeSymbol("STRIPING-TACTICIAN-INITIALIZE");

    private static final SubLSymbol STRIPING_TACTICIAN_P = makeSymbol("STRIPING-TACTICIAN-P");

    private static final SubLString $str57$_a_already_has_a_removal_substrat = makeString("~a already has a removal substrategy ~a");

    private static final SubLString $str59$Creating_a_throwaway_removal_subs = makeString("Creating a throwaway removal substrategy of ~a");

    private static final SubLSymbol REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");

    private static final SubLSymbol NEW_ROOT_METRICS = makeSymbol("NEW-ROOT-METRICS");

    private static final SubLSymbol NEW_ROOT_METRICS_P = makeSymbol("NEW-ROOT-METRICS-P");

    private static final SubLList $list64 = list(makeSymbol("START-INFERENCE-STEP-COUNT"), makeSymbol("INDEX"), makeSymbol("START-TIME"), makeSymbol("TIME-TO-FIRST-ANSWER"), makeSymbol("STEPS-TO-FIRST-ANSWER"), makeSymbol("TIME-TO-LAST-ANSWER"), makeSymbol("STEPS-TO-LAST-ANSWER"),
	    makeSymbol("ANSWER-COUNT"));

    private static final SubLList $list65 = list(makeKeyword("START-INFERENCE-STEP-COUNT"), makeKeyword("INDEX"), makeKeyword("START-TIME"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("STEPS-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("STEPS-TO-LAST-ANSWER"),
	    makeKeyword("ANSWER-COUNT"));

    private static final SubLList $list66 = list(makeSymbol("NR-METRICS-START-INFERENCE-STEP-COUNT"), makeSymbol("NR-METRICS-INDEX"), makeSymbol("NR-METRICS-START-TIME"), makeSymbol("NR-METRICS-TIME-TO-FIRST-ANSWER"), makeSymbol("NR-METRICS-STEPS-TO-FIRST-ANSWER"),
	    makeSymbol("NR-METRICS-TIME-TO-LAST-ANSWER"), makeSymbol("NR-METRICS-STEPS-TO-LAST-ANSWER"), makeSymbol("NR-METRICS-ANSWER-COUNT"));

    private static final SubLList $list67 = list(makeSymbol("_CSETF-NR-METRICS-START-INFERENCE-STEP-COUNT"), makeSymbol("_CSETF-NR-METRICS-INDEX"), makeSymbol("_CSETF-NR-METRICS-START-TIME"), makeSymbol("_CSETF-NR-METRICS-TIME-TO-FIRST-ANSWER"), makeSymbol("_CSETF-NR-METRICS-STEPS-TO-FIRST-ANSWER"),
	    makeSymbol("_CSETF-NR-METRICS-TIME-TO-LAST-ANSWER"), makeSymbol("_CSETF-NR-METRICS-STEPS-TO-LAST-ANSWER"), makeSymbol("_CSETF-NR-METRICS-ANSWER-COUNT"));

    private static final SubLSymbol NEW_ROOT_METRICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-ROOT-METRICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list69 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NEW-ROOT-METRICS-P"));

    private static final SubLSymbol NR_METRICS_START_INFERENCE_STEP_COUNT = makeSymbol("NR-METRICS-START-INFERENCE-STEP-COUNT");

    private static final SubLSymbol _CSETF_NR_METRICS_START_INFERENCE_STEP_COUNT = makeSymbol("_CSETF-NR-METRICS-START-INFERENCE-STEP-COUNT");

    private static final SubLSymbol NR_METRICS_INDEX = makeSymbol("NR-METRICS-INDEX");

    private static final SubLSymbol _CSETF_NR_METRICS_INDEX = makeSymbol("_CSETF-NR-METRICS-INDEX");

    private static final SubLSymbol NR_METRICS_START_TIME = makeSymbol("NR-METRICS-START-TIME");

    private static final SubLSymbol _CSETF_NR_METRICS_START_TIME = makeSymbol("_CSETF-NR-METRICS-START-TIME");

    private static final SubLSymbol NR_METRICS_TIME_TO_FIRST_ANSWER = makeSymbol("NR-METRICS-TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol _CSETF_NR_METRICS_TIME_TO_FIRST_ANSWER = makeSymbol("_CSETF-NR-METRICS-TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol NR_METRICS_STEPS_TO_FIRST_ANSWER = makeSymbol("NR-METRICS-STEPS-TO-FIRST-ANSWER");

    private static final SubLSymbol _CSETF_NR_METRICS_STEPS_TO_FIRST_ANSWER = makeSymbol("_CSETF-NR-METRICS-STEPS-TO-FIRST-ANSWER");

    private static final SubLSymbol NR_METRICS_TIME_TO_LAST_ANSWER = makeSymbol("NR-METRICS-TIME-TO-LAST-ANSWER");

    private static final SubLSymbol _CSETF_NR_METRICS_TIME_TO_LAST_ANSWER = makeSymbol("_CSETF-NR-METRICS-TIME-TO-LAST-ANSWER");

    private static final SubLSymbol NR_METRICS_STEPS_TO_LAST_ANSWER = makeSymbol("NR-METRICS-STEPS-TO-LAST-ANSWER");

    private static final SubLSymbol _CSETF_NR_METRICS_STEPS_TO_LAST_ANSWER = makeSymbol("_CSETF-NR-METRICS-STEPS-TO-LAST-ANSWER");

    private static final SubLSymbol NR_METRICS_ANSWER_COUNT = makeSymbol("NR-METRICS-ANSWER-COUNT");

    private static final SubLSymbol _CSETF_NR_METRICS_ANSWER_COUNT = makeSymbol("_CSETF-NR-METRICS-ANSWER-COUNT");

    private static final SubLSymbol $START_INFERENCE_STEP_COUNT = makeKeyword("START-INFERENCE-STEP-COUNT");

    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol $STEPS_TO_FIRST_ANSWER = makeKeyword("STEPS-TO-FIRST-ANSWER");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");

    private static final SubLSymbol $STEPS_TO_LAST_ANSWER = makeKeyword("STEPS-TO-LAST-ANSWER");

    private static final SubLSymbol MAKE_NEW_ROOT_METRICS = makeSymbol("MAKE-NEW-ROOT-METRICS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_METRICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-METRICS-METHOD");

    private static final SubLSymbol $NEW_ROOT_START_INFERENCE_STEP_COUNT = makeKeyword("NEW-ROOT-START-INFERENCE-STEP-COUNT");

    private static final SubLSymbol $NEW_ROOT_START_TIME = makeKeyword("NEW-ROOT-START-TIME");

    private static final SubLSymbol $NEW_ROOT_TIME_TO_FIRST_ANSWER = makeKeyword("NEW-ROOT-TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol $NEW_ROOT_STEPS_TO_FIRST_ANSWER = makeKeyword("NEW-ROOT-STEPS-TO-FIRST-ANSWER");

    private static final SubLSymbol $NEW_ROOT_TIME_TO_LAST_ANSWER = makeKeyword("NEW-ROOT-TIME-TO-LAST-ANSWER");

    private static final SubLSymbol $NEW_ROOT_STEPS_TO_LAST_ANSWER = makeKeyword("NEW-ROOT-STEPS-TO-LAST-ANSWER");

    private static final SubLSymbol $NEW_ROOT_ANSWER_COUNT = makeKeyword("NEW-ROOT-ANSWER-COUNT");

    private static final SubLSymbol $NEW_ROOT_STEP_COUNT = makeKeyword("NEW-ROOT-STEP-COUNT");

    private static final SubLSymbol $kw104$NEW_ROOT_EXHAUSTED_ = makeKeyword("NEW-ROOT-EXHAUSTED?");

    private static final SubLSymbol $sym105$STRIPING_TACTICIAN_DONE_ = makeSymbol("STRIPING-TACTICIAN-DONE?");

    private static final SubLSymbol STRIPING_TACTICIAN_DO_ONE_STEP = makeSymbol("STRIPING-TACTICIAN-DO-ONE-STEP");

    private static final SubLInteger $int$33 = makeInteger(33);

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLSymbol $RECONSIDER_SET_ASIDES = makeKeyword("RECONSIDER-SET-ASIDES");

    private static final SubLSymbol $PROPAGATE_ANSWER_LINK = makeKeyword("PROPAGATE-ANSWER-LINK");

    private static final SubLSymbol $ONE_STRIPE = makeKeyword("ONE-STRIPE");

    private static final SubLSymbol $PROOFINESS = makeKeyword("PROOFINESS");

    private static final SubLSymbol $ROOT_MOTIVATION = makeKeyword("ROOT-MOTIVATION");

    private static final SubLSymbol $FAVOR_ANSWERABLE_NEW_ROOTS = makeKeyword("FAVOR-ANSWERABLE-NEW-ROOTS");

    private static final SubLString $str119$_a_do_one_step___a__ = makeString("~a do-one-step: ~a~%");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLInteger $int$11000 = makeInteger(11000);

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLInteger $int$81 = makeInteger(81);

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol $sym128$STRIPING_TACTICIAN_CONTINUATION_POSSIBLE_ = makeSymbol("STRIPING-TACTICIAN-CONTINUATION-POSSIBLE?");

    private static final SubLSymbol $sym129$STRIPING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_ = makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?");

    private static final SubLSymbol $sym130$STRIPING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_ = makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?");

    private static final SubLSymbol $sym131$STRIPING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_ = makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?");

    private static final SubLSymbol $sym132$STRIPING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_ = makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?");

    private static final SubLSymbol STRIPING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES = makeSymbol("STRIPING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES");

    private static final SubLSymbol STRIPING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol("STRIPING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");

    private static final SubLSymbol STRIPING_TACTICIAN_INITIALIZE_PROPERTIES = makeSymbol("STRIPING-TACTICIAN-INITIALIZE-PROPERTIES");

    private static final SubLSymbol STRIPING_TACTICIAN_UPDATE_PROPERTIES = makeSymbol("STRIPING-TACTICIAN-UPDATE-PROPERTIES");

    private static final SubLSymbol STRIPING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES = makeSymbol("STRIPING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES");

    private static final SubLSymbol STRIPING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM = makeSymbol("STRIPING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM");

    private static final SubLSymbol STRIPING_TACTICIAN_NOTE_ARGUMENT_LINK = makeSymbol("STRIPING-TACTICIAN-NOTE-ARGUMENT-LINK");

    private static final SubLSymbol STRIPING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeSymbol("STRIPING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol STRIPING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED = makeSymbol("STRIPING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED");

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");

    private static final SubLSymbol CONNECTED_CONJUNCTION_TACTIC_P = makeSymbol("CONNECTED-CONJUNCTION-TACTIC-P");

    private static final SubLSymbol SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");

    private static final SubLSymbol $sym153$STRIPING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOVA = makeSymbol("STRIPING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?");

    private static final SubLSymbol $sym154$STRIPING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_ = makeSymbol("STRIPING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?");

    private static final SubLSymbol $COMPLETE_REMOVAL_TACTIC_NO_GOOD = makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");

    private static final SubLSymbol STRIPING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE = makeSymbol("STRIPING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE");

    private static final SubLString $str165$Active_Removal_Substrategies_ = makeString("Active Removal Substrategies:");

    private static final SubLString $str166$Inactive_Removal_Substrategies_ = makeString("Inactive Removal Substrategies:");

    private static final SubLSymbol $NEW_ROOT_METRICS = makeKeyword("NEW-ROOT-METRICS");

    private static final SubLSymbol $sym170$ANSWERABLE_NEW_ROOT_METRIC_ = makeSymbol("ANSWERABLE-NEW-ROOT-METRIC?");

    private static final SubLSymbol NEW_ROOT_METRIC_STEPS_TO_FIRST_ANSWER = makeSymbol("NEW-ROOT-METRIC-STEPS-TO-FIRST-ANSWER");

    private static final SubLSymbol $sym172$_ = makeSymbol("<");

    private static final SubLSymbol NEW_ROOT_METRIC_STEP_COUNT = makeSymbol("NEW-ROOT-METRIC-STEP-COUNT");

    private static final SubLSymbol NEW_ROOT_METRIC_START_INFERENCE_STEP_COUNT = makeSymbol("NEW-ROOT-METRIC-START-INFERENCE-STEP-COUNT");

    public static SubLObject striping_tactician_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject striping_tactician_data_p(final SubLObject v_object) {
	return v_object.getClass() == $striping_tactician_data_native.class ? T : NIL;
    }

    public static SubLObject str_tac_data_new_root_substrategy(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject str_tac_data_transformation_substrategy(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject str_tac_data_removal_substrategies(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject str_tac_data_new_root_r_map(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject str_tac_data_new_root_proofiness_map(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField6();
    }

    public static SubLObject str_tac_data_new_root_delay_map(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField7();
    }

    public static SubLObject str_tac_data_new_root_metrics_map(final SubLObject v_object) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.getField8();
    }

    public static SubLObject _csetf_str_tac_data_new_root_substrategy(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_str_tac_data_transformation_substrategy(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_str_tac_data_removal_substrategies(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_str_tac_data_new_root_r_map(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_str_tac_data_new_root_proofiness_map(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_str_tac_data_new_root_delay_map(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_str_tac_data_new_root_metrics_map(final SubLObject v_object, final SubLObject value) {
	assert NIL != striping_tactician_data_p(v_object) : "striping_tactician.striping_tactician_data_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static SubLObject make_striping_tactician_data(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $striping_tactician_data_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($NEW_ROOT_SUBSTRATEGY)) {
		_csetf_str_tac_data_new_root_substrategy(v_new, current_value);
	    } else if (pcase_var.eql($TRANSFORMATION_SUBSTRATEGY)) {
		_csetf_str_tac_data_transformation_substrategy(v_new, current_value);
	    } else if (pcase_var.eql($REMOVAL_SUBSTRATEGIES)) {
		_csetf_str_tac_data_removal_substrategies(v_new, current_value);
	    } else if (pcase_var.eql($NEW_ROOT_R_MAP)) {
		_csetf_str_tac_data_new_root_r_map(v_new, current_value);
	    } else if (pcase_var.eql($NEW_ROOT_PROOFINESS_MAP)) {
		_csetf_str_tac_data_new_root_proofiness_map(v_new, current_value);
	    } else if (pcase_var.eql($NEW_ROOT_DELAY_MAP)) {
		_csetf_str_tac_data_new_root_delay_map(v_new, current_value);
	    } else if (pcase_var.eql($NEW_ROOT_METRICS_MAP)) {
		_csetf_str_tac_data_new_root_metrics_map(v_new, current_value);
	    } else {
		Errors.error($str32$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_striping_tactician_data(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_STRIPING_TACTICIAN_DATA, SEVEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_SUBSTRATEGY, str_tac_data_new_root_substrategy(obj));
	funcall(visitor_fn, obj, $SLOT, $TRANSFORMATION_SUBSTRATEGY, str_tac_data_transformation_substrategy(obj));
	funcall(visitor_fn, obj, $SLOT, $REMOVAL_SUBSTRATEGIES, str_tac_data_removal_substrategies(obj));
	funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_R_MAP, str_tac_data_new_root_r_map(obj));
	funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_PROOFINESS_MAP, str_tac_data_new_root_proofiness_map(obj));
	funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_DELAY_MAP, str_tac_data_new_root_delay_map(obj));
	funcall(visitor_fn, obj, $SLOT, $NEW_ROOT_METRICS_MAP, str_tac_data_new_root_metrics_map(obj));
	funcall(visitor_fn, obj, $END, MAKE_STRIPING_TACTICIAN_DATA, SEVEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_striping_tactician_data_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_striping_tactician_data(obj, visitor_fn);
    }

    public static SubLObject striping_tactician_p(final SubLObject v_object) {
	return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL != list_utilities.member_eqP(inference_datastructures_strategy.strategy_type(v_object), $list38)));
    }

    public static SubLObject do_striping_tactician_substrategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject substrategy_var = NIL;
	SubLObject strategy = NIL;
	destructuring_bind_must_consp(current, datum, $list39);
	substrategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	strategy = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list39);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list39);
	    if (NIL == member(current_$1, $list40, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list39);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(CSOME, list(substrategy_var, list(STRIPING_TACTICIAN_ALL_SUBSTRATEGIES, strategy), done), append(body, NIL));
    }

    public static SubLObject do_striping_tactician_spineful_substrategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject substrategy_var = NIL;
	SubLObject strategy = NIL;
	destructuring_bind_must_consp(current, datum, $list39);
	substrategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	strategy = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$2 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list39);
	    current_$2 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list39);
	    if (NIL == member(current_$2, $list40, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$2 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list39);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return list(DO_STRIPING_TACTICIAN_SUBSTRATEGIES, list(substrategy_var, strategy, $DONE, done), listS(PUNLESS, list(STRIPING_TACTICIAN_SPINELESS_SUBSTRATEGY_P, substrategy_var), append(body, NIL)));
    }

    public static SubLObject do_striping_tactician_removal_substrategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject substrategy_var = NIL;
	SubLObject strategy = NIL;
	destructuring_bind_must_consp(current, datum, $list39);
	substrategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	strategy = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$3 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list39);
	    current_$3 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list39);
	    if (NIL == member(current_$3, $list40, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$3 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list39);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(DO_LIST, list(substrategy_var, list(STRIPING_TACTICIAN_REMOVAL_SUBSTRATEGIES, strategy), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_striping_tactician_active_removal_substrategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject substrategy_var = NIL;
	SubLObject strategy = NIL;
	destructuring_bind_must_consp(current, datum, $list39);
	substrategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	strategy = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$4 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list39);
	    current_$4 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list39);
	    if (NIL == member(current_$4, $list40, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$4 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list39);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return list(DO_LIST, list(substrategy_var, list(STRIPING_TACTICIAN_REMOVAL_SUBSTRATEGIES, strategy), $DONE, done), listS(PUNLESS, list($sym50$STRATEGY_DONE_, substrategy_var), append(body, NIL)));
    }

    public static SubLObject do_striping_tactician_inactive_removal_substrategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject substrategy_var = NIL;
	SubLObject strategy = NIL;
	destructuring_bind_must_consp(current, datum, $list39);
	substrategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list39);
	strategy = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$5 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list39);
	    current_$5 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list39);
	    if (NIL == member(current_$5, $list40, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$5 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list39);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return list(DO_LIST, list(substrategy_var, list(STRIPING_TACTICIAN_REMOVAL_SUBSTRATEGIES, strategy), $DONE, done), listS(PWHEN, list($sym50$STRATEGY_DONE_, substrategy_var), append(body, NIL)));
    }

    public static SubLObject new_striping_tactician_data(final SubLObject new_root_substrategy, final SubLObject transformation_substrategy) {
	final SubLObject data = make_striping_tactician_data(UNPROVIDED);
	_csetf_str_tac_data_new_root_substrategy(data, new_root_substrategy);
	_csetf_str_tac_data_transformation_substrategy(data, transformation_substrategy);
	_csetf_str_tac_data_removal_substrategies(data, NIL);
	_csetf_str_tac_data_new_root_r_map(data, bijection.new_bijection(symbol_function(EQ), UNPROVIDED));
	_csetf_str_tac_data_new_root_proofiness_map(data, make_hash_table(EIGHT_INTEGER, symbol_function(EQ), UNPROVIDED));
	_csetf_str_tac_data_new_root_delay_map(data, make_hash_table(EIGHT_INTEGER, symbol_function(EQ), UNPROVIDED));
	_csetf_str_tac_data_new_root_metrics_map(data, make_hash_table(EIGHT_INTEGER, symbol_function(EQ), UNPROVIDED));
	return data;
    }

    public static SubLObject striping_tactician_initialize(final SubLObject strategy) {
	inference_datastructures_strategy.set_strategy_data(strategy, new_striping_tactician_data_from_inference(inference_datastructures_strategy.strategy_inference(strategy)));
	return strategy;
    }

    public static SubLObject new_striping_tactician_data_from_inference(final SubLObject inference) {
	final SubLObject new_root_substrategy = inference_datastructures_strategy.new_strategy($NEW_ROOT, inference);
	final SubLObject transformation_substrategy = inference_datastructures_strategy.new_strategy($TRANSFORMATION, inference);
	return new_striping_tactician_data(new_root_substrategy, transformation_substrategy);
    }

    public static SubLObject striping_tactician_new_root_substrategy(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_new_root_substrategy(data);
    }

    public static SubLObject striping_tactician_transformation_substrategy(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_transformation_substrategy(data);
    }

    public static SubLObject striping_tactician_removal_substrategies(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_removal_substrategies(data);
    }

    public static SubLObject striping_tactician_new_root_r_map(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_new_root_r_map(data);
    }

    public static SubLObject striping_tactician_new_root_proofiness_map(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_new_root_proofiness_map(data);
    }

    public static SubLObject striping_tactician_new_root_delay_map(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_new_root_delay_map(data);
    }

    public static SubLObject striping_tactician_new_root_metrics_map(final SubLObject strategy) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	return str_tac_data_new_root_metrics_map(data);
    }

    public static SubLObject striping_tactician_new_removal_substrategy(final SubLObject strategy, final SubLObject new_root) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != inference_datastructures_problem.problem_p(new_root) : "inference_datastructures_problem.problem_p(new_root) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(new_root) " + new_root;
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	final SubLObject map = striping_tactician_new_root_r_map(strategy);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != bijection.bijection_lookup(map, new_root, UNPROVIDED))) {
	    Errors.error($str57$_a_already_has_a_removal_substrat, new_root, bijection.bijection_lookup(map, new_root, UNPROVIDED));
	}
	final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
	final SubLObject r_strat = inference_datastructures_strategy.new_strategy($REMOVAL, inference);
	inference_datastructures_strategy.copy_strategy_properties(strategy, r_strat);
	striping_tactician_initialize_new_root_metrics_from_inference(strategy, r_strat, inference);
	_csetf_str_tac_data_removal_substrategies(data, cons(r_strat, str_tac_data_removal_substrategies(data)));
	bijection.bijection_enter(map, new_root, r_strat);
	return r_strat;
    }

    public static SubLObject striping_tactician_new_throwaway_removal_substrategy(final SubLObject strategy) {
	Errors.warn($str59$Creating_a_throwaway_removal_subs, strategy);
	final SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
	final SubLObject r_strat = inference_datastructures_strategy.new_strategy($REMOVAL, inference_datastructures_strategy.strategy_inference(strategy));
	inference_datastructures_strategy.copy_strategy_properties(strategy, r_strat);
	_csetf_str_tac_data_removal_substrategies(data, cons(r_strat, str_tac_data_removal_substrategies(data)));
	return r_strat;
    }

    public static SubLObject set_striping_tactician_new_root_metrics(final SubLObject strategy, final SubLObject r_strat, final SubLObject metrics) {
	final SubLObject map = striping_tactician_new_root_metrics_map(strategy);
	return sethash(r_strat, map, metrics);
    }

    public static SubLObject set_new_root_proofiness(final SubLObject r_strat, final SubLObject proofiness) {
	assert NIL != removal_tactician.removal_strategy_p(r_strat) : "removal_tactician.removal_strategy_p(r_strat) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(r_strat) " + r_strat;
	assert NIL != subl_promotions.non_negative_integer_p(proofiness) : "subl_promotions.non_negative_integer_p(proofiness) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(proofiness) " + proofiness;
	return sethash(r_strat, striping_tactician_new_root_proofiness_map(inference_tactician.controlling_strategy(r_strat)), proofiness);
    }

    public static SubLObject decrement_new_root_proofiness(final SubLObject r_strat) {
	final SubLObject old_proofiness = new_root_proofiness(r_strat);
	final SubLObject new_proofiness = number_utilities.f_1_(old_proofiness);
	set_new_root_proofiness(r_strat, new_proofiness);
	return new_proofiness;
    }

    public static SubLObject set_new_root_delay(final SubLObject r_strat, final SubLObject delay) {
	assert NIL != removal_tactician.removal_strategy_p(r_strat) : "removal_tactician.removal_strategy_p(r_strat) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(r_strat) " + r_strat;
	assert NIL != subl_promotions.non_negative_integer_p(delay) : "subl_promotions.non_negative_integer_p(delay) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(delay) " + delay;
	return sethash(r_strat, striping_tactician_new_root_delay_map(inference_tactician.controlling_strategy(r_strat)), delay);
    }

    public static SubLObject decrement_new_root_delay(final SubLObject r_strat, final SubLObject dec) {
	assert NIL != removal_tactician.removal_strategy_p(r_strat) : "removal_tactician.removal_strategy_p(r_strat) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(r_strat) " + r_strat;
	assert NIL != subl_promotions.non_negative_integer_p(dec) : "subl_promotions.non_negative_integer_p(dec) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(dec) " + dec;
	if (dec.isPositive()) {
	    final SubLObject old_delay = new_root_delay(r_strat);
	    final SubLObject map = striping_tactician_new_root_delay_map(inference_tactician.controlling_strategy(r_strat));
	    SubLObject new_delay = subtract(old_delay, dec);
	    if (NIL == subl_promotions.non_negative_integer_p(new_delay)) {
		new_delay = ZERO_INTEGER;
	    }
	    return sethash(r_strat, map, new_delay);
	}
	return NIL;
    }

    public static SubLObject striping_tactician_all_substrategies(final SubLObject strategy) {
	return listS(striping_tactician_new_root_substrategy(strategy), striping_tactician_transformation_substrategy(strategy), striping_tactician_removal_substrategies(strategy));
    }

    public static SubLObject striping_tactician_removal_substrategy_count(final SubLObject strategy) {
	SubLObject count = ZERO_INTEGER;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    count = add(count, ONE_INTEGER);
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return count;
    }

    public static SubLObject striping_tactician_problem_motivated_wrt_nP(final SubLObject strategy, final SubLObject problem) {
	return inference_datastructures_strategy.problem_motivatedP(problem, striping_tactician_new_root_substrategy(strategy));
    }

    public static SubLObject striping_tactician_problem_motivated_wrt_any_rP(final SubLObject strategy, final SubLObject problem) {
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != inference_datastructures_strategy.problem_motivatedP(problem, r_strat)) {
		return T;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_problem_motivated_wrt_tP(final SubLObject strategy, final SubLObject problem) {
	return inference_datastructures_strategy.problem_motivatedP(problem, striping_tactician_transformation_substrategy(strategy));
    }

    public static SubLObject striping_tactician_link_head_motivated_wrt_any_rP(final SubLObject strategy, final SubLObject link_head) {
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != inference_tactician.substrategy_link_head_motivatedP(r_strat, link_head)) {
		return T;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_substrategy_p(final SubLObject v_object) {
	return makeBoolean((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL != striping_tactician_p(inference_tactician.controlling_strategy(v_object))));
    }

    public static SubLObject striping_tactician_proper_substrategy_p(final SubLObject v_object) {
	return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(v_object)) && (NIL == striping_tactician_p(v_object))) && (NIL != striping_tactician_p(inference_tactician.controlling_strategy(v_object))));
    }

    public static SubLObject striping_tactician_spineless_substrategy_p(final SubLObject v_object) {
	return new_root_tactician.new_root_strategy_p(v_object);
    }

    public static SubLObject striping_tactician_new_root_removal_strategy(final SubLObject strategy, final SubLObject new_root) {
	assert NIL != inference_datastructures_problem.problem_p(new_root) : "inference_datastructures_problem.problem_p(new_root) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(new_root) " + new_root;
	return bijection.bijection_lookup(striping_tactician_new_root_r_map(strategy), new_root, UNPROVIDED);
    }

    public static SubLObject striping_tactician_removal_strategy_new_root(final SubLObject strategy, final SubLObject r_strat) {
	assert NIL != removal_tactician.removal_strategy_p(r_strat) : "removal_tactician.removal_strategy_p(r_strat) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(r_strat) " + r_strat;
	return bijection.bijection_inverse_lookup(striping_tactician_new_root_r_map(strategy), r_strat, UNPROVIDED);
    }

    public static SubLObject new_root_proofiness(final SubLObject r_strat) {
	return gethash_without_values(r_strat, striping_tactician_new_root_proofiness_map(inference_tactician.controlling_strategy(r_strat)), ZERO_INTEGER);
    }

    public static SubLObject new_root_delay(final SubLObject r_strat) {
	return gethash_without_values(r_strat, striping_tactician_new_root_delay_map(inference_tactician.controlling_strategy(r_strat)), ZERO_INTEGER);
    }

    public static SubLObject new_root_metrics(final SubLObject r_strat) {
	return gethash_without_values(r_strat, striping_tactician_new_root_metrics_map(inference_tactician.controlling_strategy(r_strat)), UNPROVIDED);
    }

    public static SubLObject new_root_metrics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject new_root_metrics_p(final SubLObject v_object) {
	return v_object.getClass() == $new_root_metrics_native.class ? T : NIL;
    }

    public static SubLObject nr_metrics_start_inference_step_count(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject nr_metrics_index(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject nr_metrics_start_time(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject nr_metrics_time_to_first_answer(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject nr_metrics_steps_to_first_answer(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField6();
    }

    public static SubLObject nr_metrics_time_to_last_answer(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField7();
    }

    public static SubLObject nr_metrics_steps_to_last_answer(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField8();
    }

    public static SubLObject nr_metrics_answer_count(final SubLObject v_object) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.getField9();
    }

    public static SubLObject _csetf_nr_metrics_start_inference_step_count(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_nr_metrics_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_nr_metrics_start_time(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_nr_metrics_time_to_first_answer(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_nr_metrics_steps_to_first_answer(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_nr_metrics_time_to_last_answer(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_nr_metrics_steps_to_last_answer(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_nr_metrics_answer_count(final SubLObject v_object, final SubLObject value) {
	assert NIL != new_root_metrics_p(v_object) : "striping_tactician.new_root_metrics_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static SubLObject make_new_root_metrics(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $new_root_metrics_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($START_INFERENCE_STEP_COUNT)) {
		_csetf_nr_metrics_start_inference_step_count(v_new, current_value);
	    } else if (pcase_var.eql($INDEX)) {
		_csetf_nr_metrics_index(v_new, current_value);
	    } else if (pcase_var.eql($START_TIME)) {
		_csetf_nr_metrics_start_time(v_new, current_value);
	    } else if (pcase_var.eql($TIME_TO_FIRST_ANSWER)) {
		_csetf_nr_metrics_time_to_first_answer(v_new, current_value);
	    } else if (pcase_var.eql($STEPS_TO_FIRST_ANSWER)) {
		_csetf_nr_metrics_steps_to_first_answer(v_new, current_value);
	    } else if (pcase_var.eql($TIME_TO_LAST_ANSWER)) {
		_csetf_nr_metrics_time_to_last_answer(v_new, current_value);
	    } else if (pcase_var.eql($STEPS_TO_LAST_ANSWER)) {
		_csetf_nr_metrics_steps_to_last_answer(v_new, current_value);
	    } else if (pcase_var.eql($ANSWER_COUNT)) {
		_csetf_nr_metrics_answer_count(v_new, current_value);
	    } else {
		Errors.error($str32$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_new_root_metrics(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_NEW_ROOT_METRICS, EIGHT_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $START_INFERENCE_STEP_COUNT, nr_metrics_start_inference_step_count(obj));
	funcall(visitor_fn, obj, $SLOT, $INDEX, nr_metrics_index(obj));
	funcall(visitor_fn, obj, $SLOT, $START_TIME, nr_metrics_start_time(obj));
	funcall(visitor_fn, obj, $SLOT, $TIME_TO_FIRST_ANSWER, nr_metrics_time_to_first_answer(obj));
	funcall(visitor_fn, obj, $SLOT, $STEPS_TO_FIRST_ANSWER, nr_metrics_steps_to_first_answer(obj));
	funcall(visitor_fn, obj, $SLOT, $TIME_TO_LAST_ANSWER, nr_metrics_time_to_last_answer(obj));
	funcall(visitor_fn, obj, $SLOT, $STEPS_TO_LAST_ANSWER, nr_metrics_steps_to_last_answer(obj));
	funcall(visitor_fn, obj, $SLOT, $ANSWER_COUNT, nr_metrics_answer_count(obj));
	funcall(visitor_fn, obj, $END, MAKE_NEW_ROOT_METRICS, EIGHT_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_new_root_metrics_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_new_root_metrics(obj, visitor_fn);
    }

    public static SubLObject striping_tactician_initialize_new_root_metrics_from_inference(final SubLObject strategy, final SubLObject r_strat, final SubLObject inference) {
	final SubLObject step_count = inference_datastructures_inference.inference_cumulative_step_count(inference);
	final SubLObject start_time = inference_datastructures_inference.inference_cumulative_time_so_far(inference, NIL);
	final SubLObject new_root_index = striping_tactician_removal_substrategy_count(strategy);
	final SubLObject metrics = make_new_root_metrics(UNPROVIDED);
	_csetf_nr_metrics_start_inference_step_count(metrics, step_count);
	_csetf_nr_metrics_index(metrics, new_root_index);
	_csetf_nr_metrics_start_time(metrics, start_time);
	_csetf_nr_metrics_time_to_first_answer(metrics, NIL);
	_csetf_nr_metrics_steps_to_first_answer(metrics, NIL);
	_csetf_nr_metrics_time_to_last_answer(metrics, NIL);
	_csetf_nr_metrics_steps_to_last_answer(metrics, NIL);
	_csetf_nr_metrics_answer_count(metrics, ZERO_INTEGER);
	return set_striping_tactician_new_root_metrics(strategy, r_strat, metrics);
    }

    public static SubLObject new_root_start_inference_step_count(final SubLObject r_strat) {
	return nr_metrics_start_inference_step_count(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_index(final SubLObject r_strat) {
	return nr_metrics_index(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_start_time(final SubLObject r_strat) {
	return nr_metrics_start_time(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_time_to_first_answer(final SubLObject r_strat) {
	return nr_metrics_time_to_first_answer(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_steps_to_first_answer(final SubLObject r_strat) {
	return nr_metrics_steps_to_first_answer(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_time_to_last_answer(final SubLObject r_strat) {
	return nr_metrics_time_to_last_answer(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_steps_to_last_answer(final SubLObject r_strat) {
	return nr_metrics_steps_to_last_answer(new_root_metrics(r_strat));
    }

    public static SubLObject new_root_answer_count(final SubLObject r_strat) {
	return nr_metrics_answer_count(new_root_metrics(r_strat));
    }

    public static SubLObject set_new_root_time_to_first_answer(final SubLObject r_strat, final SubLObject time_to_first_answer) {
	final SubLObject metrics = new_root_metrics(r_strat);
	_csetf_nr_metrics_time_to_first_answer(metrics, time_to_first_answer);
	return time_to_first_answer;
    }

    public static SubLObject set_new_root_steps_to_first_answer(final SubLObject r_strat, final SubLObject steps_to_first_answer) {
	final SubLObject metrics = new_root_metrics(r_strat);
	_csetf_nr_metrics_steps_to_first_answer(metrics, steps_to_first_answer);
	return steps_to_first_answer;
    }

    public static SubLObject set_new_root_time_to_last_answer(final SubLObject r_strat, final SubLObject time_to_last_answer) {
	final SubLObject metrics = new_root_metrics(r_strat);
	_csetf_nr_metrics_time_to_last_answer(metrics, time_to_last_answer);
	return time_to_last_answer;
    }

    public static SubLObject set_new_root_steps_to_last_answer(final SubLObject r_strat, final SubLObject steps_to_last_answer) {
	final SubLObject metrics = new_root_metrics(r_strat);
	_csetf_nr_metrics_steps_to_last_answer(metrics, steps_to_last_answer);
	return steps_to_last_answer;
    }

    public static SubLObject set_new_root_answer_count(final SubLObject r_strat, final SubLObject answer_count) {
	final SubLObject metrics = new_root_metrics(r_strat);
	_csetf_nr_metrics_answer_count(metrics, answer_count);
	return answer_count;
    }

    public static SubLObject new_root_metrics_plist(final SubLObject r_strat) {
	return construct_new_root_metrics_plist(new_root_start_inference_step_count(r_strat), new_root_start_time(r_strat), new_root_time_to_first_answer(r_strat), new_root_steps_to_first_answer(r_strat), new_root_time_to_last_answer(r_strat), new_root_steps_to_last_answer(r_strat),
		new_root_answer_count(r_strat), inference_datastructures_strategy.strategy_step_count(r_strat), inference_tactician.strategy_doneP(r_strat));
    }

    public static SubLObject construct_new_root_metrics_plist(final SubLObject start_inference_step_count, final SubLObject start_time, final SubLObject time_to_first_answer, final SubLObject steps_to_first_answer, final SubLObject time_to_last_answer, final SubLObject steps_to_last_answer,
	    final SubLObject answer_count, final SubLObject step_count, final SubLObject exhaustedP) {
	return list(new SubLObject[] { $NEW_ROOT_START_INFERENCE_STEP_COUNT, start_inference_step_count, $NEW_ROOT_START_TIME, start_time, $NEW_ROOT_TIME_TO_FIRST_ANSWER, time_to_first_answer, $NEW_ROOT_STEPS_TO_FIRST_ANSWER, steps_to_first_answer, $NEW_ROOT_TIME_TO_LAST_ANSWER, time_to_last_answer,
		$NEW_ROOT_STEPS_TO_LAST_ANSWER, steps_to_last_answer, $NEW_ROOT_ANSWER_COUNT, answer_count, $NEW_ROOT_STEP_COUNT, step_count, $kw104$NEW_ROOT_EXHAUSTED_, exhaustedP });
    }

    public static SubLObject striping_tactician_new_root_metrics(final SubLObject strategy) {
	SubLObject metrics = NIL;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    metrics = cons(new_root_metrics_plist(r_strat), metrics);
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return nreverse(metrics);
    }

    public static SubLObject striping_tactician_remember_new_root_metrics(final SubLObject r_strat) {
	SubLObject last_answer_id = NIL;
	final SubLObject inference = inference_datastructures_strategy.strategy_inference(r_strat);
	last_answer_id = inference_datastructures_inference.inference_last_answer_id(inference);
	return last_answer_id;
    }

    public static SubLObject new_root_answerableP(final SubLObject r_strat) {
	return plusp(new_root_answer_count(r_strat));
    }

    public static SubLObject new_root_unanswerableP(final SubLObject r_strat) {
	return zerop(new_root_answer_count(r_strat));
    }

    public static SubLObject increment_new_root_answer_count(final SubLObject r_strat, final SubLObject increment) {
	SubLObject answer_count = new_root_answer_count(r_strat);
	answer_count = add(answer_count, increment);
	set_new_root_answer_count(r_strat, answer_count);
	return answer_count;
    }

    public static SubLObject striping_tactician_update_new_root_metrics(final SubLObject r_strat, SubLObject old_last_answer_suid) {
	final SubLObject inference = inference_datastructures_strategy.strategy_inference(r_strat);
	final SubLObject new_last_answer_suid = inference_datastructures_inference.inference_last_answer_id(inference);
	if (NIL == old_last_answer_suid) {
	    old_last_answer_suid = MINUS_ONE_INTEGER;
	}
	if ((NIL != new_last_answer_suid) && new_last_answer_suid.numG(old_last_answer_suid)) {
	    final SubLObject first_new_answer_id = number_utilities.f_1X(old_last_answer_suid);
	    if (NIL == new_root_time_to_first_answer(r_strat)) {
		final SubLObject first_answer = inference_datastructures_inference.inference_first_answer_with_id_or_greater(inference, first_new_answer_id);
		final SubLObject answer_steps = inference_datastructures_strategy.strategy_step_count(r_strat);
		final SubLObject answer_time = inference_datastructures_inference.inference_answer_elapsed_time(first_answer, NIL);
		final SubLObject answer_elapsed_time = subtract(answer_time, new_root_start_time(r_strat));
		set_new_root_time_to_first_answer(r_strat, answer_elapsed_time);
		set_new_root_steps_to_first_answer(r_strat, answer_steps);
	    }
	    final SubLObject last_answer = inference_datastructures_inference.inference_last_answer(inference);
	    final SubLObject answer_steps = inference_datastructures_strategy.strategy_step_count(r_strat);
	    final SubLObject answer_time = inference_datastructures_inference.inference_answer_elapsed_time(last_answer, NIL);
	    final SubLObject answer_elapsed_time = subtract(answer_time, new_root_start_time(r_strat));
	    set_new_root_time_to_last_answer(r_strat, answer_elapsed_time);
	    set_new_root_steps_to_last_answer(r_strat, answer_steps);
	    SubLObject start_id = first_new_answer_id;
	    SubLObject new_answer_count = ZERO_INTEGER;
	    final SubLObject inf = inference;
	    final SubLObject start_id_$6 = start_id;
	    SubLObject end_id;
	    SubLObject id;
	    SubLObject v_answer;
	    for (end_id = inference_datastructures_inference.inference_next_new_answer_id(inference), id = NIL, id = start_id_$6; !id.numGE(end_id); id = number_utilities.f_1X(id)) {
		v_answer = inference_datastructures_inference.find_inference_answer_by_id(inf, id);
		new_answer_count = add(new_answer_count, ONE_INTEGER);
	    }
	    start_id = end_id;
	    increment_new_root_answer_count(r_strat, new_answer_count);
	}
	return NIL;
    }

    public static SubLObject striping_tactician_doneP(final SubLObject strategy) {
	SubLObject not_yet_doneP = NIL;
	if (NIL == not_yet_doneP) {
	    SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	    SubLObject substrategy = NIL;
	    substrategy = csome_list_var.first();
	    while ((NIL == not_yet_doneP) && (NIL != csome_list_var)) {
		if (NIL == inference_tactician.strategy_doneP(substrategy)) {
		    not_yet_doneP = T;
		}
		csome_list_var = csome_list_var.rest();
		substrategy = csome_list_var.first();
	    }
	}
	return makeBoolean(NIL == not_yet_doneP);
    }

    public static SubLObject striping_tactician_do_one_step(final SubLObject strategy) {
	SubLObject result;
	for (result = $UNINTERESTING; $UNINTERESTING == result; result = striping_tactician_do_one_step_int(strategy)) {
	}
	return eq($DONE, result);
    }

    public static SubLObject striping_tactician_do_one_step_int(final SubLObject strategy) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	SubLObject action = NIL;
	if (NIL != striping_tactician_should_reconsider_set_asidesP(strategy)) {
	    striping_tactician_reconsider_set_asides(strategy);
	    action = $RECONSIDER_SET_ASIDES;
	    result = $UNINTERESTING;
	} else if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
	    final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference_datastructures_strategy.strategy_inference(strategy));
	    final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
	    final SubLObject n_strategy = striping_tactician_new_root_substrategy(strategy);
	    inference_tactician.substrategy_motivate_strategem(n_strategy, root_problem);
	    striping_tactician_new_removal_substrategy(strategy, root_problem);
	    inference_worker.possibly_propagate_answer_link(answer_link);
	    action = $PROPAGATE_ANSWER_LINK;
	    result = $INTERESTING;
	} else if ((NIL != $striping_tactician_one_stripe_modeP$.getDynamicValue(thread)) && (NIL != striping_tactician_has_some_removal_to_doP(strategy))) {
	    final SubLObject r_strat = striping_tactician_first_active_removal_substrategy(strategy);
	    action = list(r_strat, $ONE_STRIPE);
	    result = striping_tactician_new_root_do_one_step(r_strat);
	} else {
	    thread.resetMultipleValues();
	    final SubLObject proofy_r_strat = striping_tactician_new_root_with_highest_proofiness(strategy);
	    final SubLObject proofiness = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL != subl_promotions.positive_integer_p(proofiness)) {
		action = list(proofy_r_strat, $PROOFINESS, proofiness);
		result = striping_tactician_new_root_do_one_step(proofy_r_strat);
		decrement_new_root_proofiness(proofy_r_strat);
	    } else if (NIL != striping_tactician_chooses_to_do_removalP(strategy)) {
		thread.resetMultipleValues();
		final SubLObject next_r_strat = striping_tactician_unanswerable_new_root_with_lowest_delay(strategy);
		final SubLObject delay = thread.secondMultipleValue();
		thread.resetMultipleValues();
		action = list(next_r_strat, $DELAY, delay);
		result = striping_tactician_new_root_do_one_step(next_r_strat);
		striping_tactician_favor_answerable_new_roots(strategy);
		striping_tactician_reset_delay(next_r_strat);
		striping_tactician_decrement_all_unanswerable_new_root_delays_except(strategy, next_r_strat, delay);
	    } else if (NIL != striping_tactician_chooses_to_focus_on_a_new_rootP(strategy)) {
		final SubLObject n_strategy = striping_tactician_new_root_substrategy(strategy);
		final SubLObject t_strategy = striping_tactician_transformation_substrategy(strategy);
		final SubLObject new_root = inference_tactician.substrategy_peek_next_strategem(n_strategy);
		action = n_strategy;
		result = inference_tactician.substrategy_do_one_step(n_strategy);
		SubLObject re_addP = NIL;
		if (NIL == striping_tactician_problem_motivated_wrt_any_rP(strategy, inference_datastructures_strategy.strategy_root_problem(strategy))) {
		    re_addP = T;
		    final SubLObject root_problem2 = inference_datastructures_strategy.strategy_root_problem(strategy);
		    final SubLObject root_removal_strategy = striping_tactician_new_root_removal_strategy(strategy, root_problem2);
		    action = list($ROOT_MOTIVATION, root_removal_strategy, inference_datastructures_strategy.strategy_root_problem(strategy));
		    inference_tactician.substrategy_motivate_strategem(root_removal_strategy, root_problem2);
		} else if (NIL != new_root_needs_removal_motivationP(new_root, strategy)) {
		    re_addP = T;
		    SubLObject r_strategy = striping_tactician_new_root_removal_strategy(strategy, new_root);
		    if (NIL == r_strategy) {
			r_strategy = striping_tactician_new_removal_substrategy(strategy, new_root);
		    }
		    action = list($MOTIVATION, r_strategy, new_root);
		    inference_tactician.substrategy_motivate_strategem(r_strategy, new_root);
		} else if ((NIL == striping_tactician_problem_motivated_wrt_tP(strategy, new_root)) && (NIL == inference_tactician.strategy_throws_away_all_transformationP(t_strategy))) {
		    re_addP = T;
		    action = list($MOTIVATION, t_strategy, new_root);
		    inference_tactician.substrategy_motivate_strategem(t_strategy, new_root);
		}

		if (NIL != re_addP) {
		    inference_tactician.substrategy_activate_strategem(n_strategy, new_root);
		}
	    } else if (NIL == inference_tactician.strategy_doneP(striping_tactician_transformation_substrategy(strategy))) {
		action = striping_tactician_transformation_substrategy(strategy);
		result = balancing_tactician.substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(striping_tactician_transformation_substrategy(strategy)));
	    } else if (NIL == striping_tactician_doneP(strategy)) {
		action = $FAVOR_ANSWERABLE_NEW_ROOTS;
		result = $UNINTERESTING;
		striping_tactician_favor_answerable_new_roots(strategy);
	    } else {
		action = $DONE;
		result = $DONE;
	    }

	}

	if ($inference_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
	    format_nil.force_format(T, $str119$_a_do_one_step___a__, strategy, action, NIL, NIL, NIL, NIL, NIL, NIL);
	}
	return result;
    }

    public static SubLObject new_root_needs_removal_motivationP(final SubLObject new_root, final SubLObject strategy) {
	return makeBoolean((NIL == striping_tactician_problem_motivated_wrt_any_rP(strategy, new_root)) && (NIL == striping_tactician_new_root_removal_strategy(strategy, new_root)));
    }

    public static SubLObject striping_tactician_should_reconsider_set_asidesP(final SubLObject strategy) {
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(substrategy)) {
		return T;
	    }
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_reconsider_set_asides(final SubLObject strategy) {
	SubLObject count = ZERO_INTEGER;
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    count = add(count, inference_tactician.strategy_reconsider_set_asides(substrategy));
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	return count;
    }

    public static SubLObject striping_tactician_new_root_with_highest_proofiness(final SubLObject strategy) {
	SubLObject proofiest_r_strat = NIL;
	SubLObject highest_proofiness = ZERO_INTEGER;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == inference_tactician.strategy_doneP(r_strat)) {
		final SubLObject proofiness = new_root_proofiness(r_strat);
		if (proofiness.numG(highest_proofiness)) {
		    proofiest_r_strat = r_strat;
		    highest_proofiness = proofiness;
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return values(proofiest_r_strat, highest_proofiness);
    }

    public static SubLObject striping_tactician_chooses_to_do_removalP(final SubLObject strategy) {
	SubLObject some_unanswerable_removal_leftP = NIL;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL == inference_tactician.strategy_doneP(r_strat)) && (NIL != new_root_unanswerableP(r_strat))) {
		some_unanswerable_removal_leftP = T;
		if (NIL != new_root_freshP(r_strat)) {
		    return T;
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return makeBoolean(((NIL != some_unanswerable_removal_leftP) && (NIL != inference_tactician.strategy_doneP(striping_tactician_transformation_substrategy(strategy)))) && (NIL != inference_tactician.strategy_doneP(striping_tactician_new_root_substrategy(strategy))));
    }

    public static SubLObject striping_tactician_chooses_to_focus_on_a_new_rootP(final SubLObject strategy) {
	if (NIL != inference_tactician.strategy_doneP(striping_tactician_new_root_substrategy(strategy))) {
	    return NIL;
	}
	if (NIL != inference_tactician.strategy_doneP(striping_tactician_transformation_substrategy(strategy))) {
	    return T;
	}
	if (NIL != striping_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_strategy.strategy_root_problem(strategy))) {
	    return T;
	}
	return zerop(mod(inference_datastructures_strategy.strategy_step_count(strategy), THREE_INTEGER));
    }

    public static SubLObject new_root_freshP(final SubLObject r_strat) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return numLE(inference_datastructures_strategy.strategy_step_count(r_strat), $new_root_freshness_threshold$.getDynamicValue(thread));
    }

    public static SubLObject striping_tactician_unanswerable_new_root_with_lowest_delay(final SubLObject strategy) {
	SubLObject soonest_r_strat = NIL;
	SubLObject lowest_delay = number_utilities.positive_infinity();
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL == inference_tactician.strategy_doneP(r_strat)) && (NIL != new_root_unanswerableP(r_strat))) {
		final SubLObject delay = new_root_delay(r_strat);
		if (NIL != number_utilities.potentially_infinite_integer_L(delay, lowest_delay)) {
		    soonest_r_strat = r_strat;
		    lowest_delay = delay;
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return values(soonest_r_strat, lowest_delay);
    }

    public static SubLObject striping_tactician_favor_answerable_new_roots(final SubLObject strategy) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject count = ZERO_INTEGER;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL == inference_tactician.strategy_doneP(r_strat)) && (NIL != new_root_answerableP(r_strat))) {
		set_new_root_proofiness(r_strat, $new_root_answerability_expectation$.getDynamicValue(thread));
		count = add(count, ONE_INTEGER);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return count;
    }

    public static SubLObject striping_tactician_reset_delay(final SubLObject just_stepped_r_strat) {
	final SubLObject delay = striping_tactician_compute_new_root_delay(just_stepped_r_strat);
	set_new_root_delay(just_stepped_r_strat, delay);
	return delay;
    }

    public static SubLObject striping_tactician_compute_new_root_delay(final SubLObject just_stepped_r_strat) {
	final SubLObject step_count = inference_datastructures_strategy.strategy_step_count(just_stepped_r_strat);
	final SubLObject new_root_index = new_root_index(just_stepped_r_strat);
	return multiply(striping_tactician_compute_new_root_delay_based_on_step_count(step_count), striping_tactician_compute_new_root_delay_based_on_index(new_root_index));
    }

    public static SubLObject striping_tactician_compute_new_root_delay_based_on_step_count(final SubLObject step_count) {
	if (step_count.numL(TEN_INTEGER)) {
	    return ONE_INTEGER;
	}
	if (step_count.numL($int$40)) {
	    return THREE_INTEGER;
	}
	if (step_count.numL($int$300)) {
	    return NINE_INTEGER;
	}
	if (step_count.numL($int$11000)) {
	    return $int$27;
	}
	return $int$81;
    }

    public static SubLObject striping_tactician_compute_new_root_delay_based_on_index(final SubLObject new_root_index) {
	if (new_root_index.numL(TWO_INTEGER)) {
	    return ONE_INTEGER;
	}
	if (new_root_index.numL($int$120)) {
	    return TEN_INTEGER;
	}
	if (new_root_index.numL($int$500)) {
	    return $int$100;
	}
	return $int$1000;
    }

    public static SubLObject striping_tactician_decrement_all_unanswerable_new_root_delays_except(final SubLObject strategy, final SubLObject next_r_strat, final SubLObject dec) {
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (((NIL == inference_tactician.strategy_doneP(r_strat)) && (!r_strat.eql(next_r_strat))) && (NIL != new_root_unanswerableP(r_strat))) {
		decrement_new_root_delay(r_strat, dec);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_new_root_do_one_step(final SubLObject r_strat) {
	SubLObject result = NIL;
	final SubLObject last_answer_id = striping_tactician_remember_new_root_metrics(r_strat);
	result = balancing_tactician.substrategy_do_one_step_interestingness(inference_tactician.substrategy_do_one_step(r_strat));
	striping_tactician_update_new_root_metrics(r_strat, last_answer_id);
	return result;
    }

    public static SubLObject striping_tactician_active_removal_strategies(final SubLObject strategy) {
	SubLObject result = NIL;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == inference_tactician.strategy_doneP(r_strat)) {
		result = cons(r_strat, result);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return nreverse(result);
    }

    public static SubLObject striping_tactician_has_some_removal_to_doP(final SubLObject strategy) {
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == inference_tactician.strategy_doneP(r_strat)) {
		return T;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_first_active_removal_substrategy(final SubLObject strategy) {
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == inference_tactician.strategy_doneP(r_strat)) {
		return r_strat;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_continuation_possibleP(final SubLObject strategy) {
	SubLObject continuation_possibleP = NIL;
	if (NIL == continuation_possibleP) {
	    SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	    SubLObject substrategy = NIL;
	    substrategy = csome_list_var.first();
	    while ((NIL == continuation_possibleP) && (NIL != csome_list_var)) {
		if (NIL != inference_tactician.strategy_continuation_possibleP(substrategy)) {
		    continuation_possibleP = T;
		}
		csome_list_var = csome_list_var.rest();
		substrategy = csome_list_var.first();
	    }
	}
	return continuation_possibleP;
    }

    public static SubLObject striping_tactician_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem) {
	final SubLObject t_strat = striping_tactician_transformation_substrategy(strategy);
	final SubLObject t_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_problemP(t_strat, problem, UNPROVIDED);
	if (NIL == t_says_ditchP) {
	    return NIL;
	}
	final SubLObject r_strat = striping_tactician_arbitrary_relevant_removal_substrategy(strategy, problem);
	final SubLObject r_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_problemP(r_strat, problem, UNPROVIDED);
	if (NIL == r_says_ditchP) {
	    return NIL;
	}
	return T;
    }

    public static SubLObject striping_tactician_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem) {
	final SubLObject t_strat = striping_tactician_transformation_substrategy(strategy);
	final SubLObject t_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_problemP(t_strat, problem);
	if (NIL == t_says_ditchP) {
	    return NIL;
	}
	final SubLObject r_strat = striping_tactician_arbitrary_relevant_removal_substrategy(strategy, problem);
	final SubLObject r_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_problemP(r_strat, problem);
	if (NIL == r_says_ditchP) {
	    return NIL;
	}
	return T;
    }

    public static SubLObject striping_tactician_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
	final SubLObject t_strat = striping_tactician_transformation_substrategy(strategy);
	final SubLObject t_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(t_strat, tactic, problem_already_consideredP, siblings_already_consideredP);
	if (NIL == t_says_ditchP) {
	    return NIL;
	}
	final SubLObject r_strat = striping_tactician_arbitrary_relevant_removal_substrategy(strategy, inference_datastructures_tactic.tactic_problem(tactic));
	final SubLObject r_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(r_strat, tactic, problem_already_consideredP, siblings_already_consideredP);
	if (NIL == r_says_ditchP) {
	    return NIL;
	}
	return T;
    }

    public static SubLObject striping_tactician_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
	final SubLObject t_strat = striping_tactician_transformation_substrategy(strategy);
	final SubLObject t_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_tacticP(t_strat, tactic, problem_already_consideredP, siblings_already_consideredP);
	if (NIL == t_says_ditchP) {
	    return NIL;
	}
	final SubLObject r_strat = striping_tactician_arbitrary_relevant_removal_substrategy(strategy, inference_datastructures_tactic.tactic_problem(tactic));
	final SubLObject r_says_ditchP = inference_tactician_strategic_uninterestingness.strategy_chooses_to_set_aside_tacticP(r_strat, tactic, problem_already_consideredP, siblings_already_consideredP);
	if (NIL == r_says_ditchP) {
	    return NIL;
	}
	return T;
    }

    public static SubLObject striping_tactician_throw_away_uninteresting_set_asides(final SubLObject strategy) {
	SubLObject count = ZERO_INTEGER;
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    count = add(count, inference_tactician.strategy_throw_away_uninteresting_set_asides(substrategy));
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	return count;
    }

    public static SubLObject striping_tactician_note_inference_dynamic_properties_updated(final SubLObject strategy) {
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    inference_tactician.strategy_note_inference_dynamic_properties_updated(substrategy);
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties) {
	inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    inference_tactician.strategy_initialize_properties(substrategy, strategy_static_properties);
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties) {
	inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    inference_tactician.strategy_update_properties(substrategy, strategy_dynamic_properties);
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_initial_relevant_strategies(final SubLObject strategy) {
	return striping_tactician_all_substrategies(strategy);
    }

    public static SubLObject striping_tactician_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
	if (NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
	    if (NIL != striping_tactician_problem_is_the_rest_of_an_early_removalP(strategy, problem)) {
		striping_tactician_possibly_make_new_root(strategy, problem);
	    } else if (NIL != striping_tactician_problem_is_the_result_of_a_simplificationP(strategy, problem)) {
		striping_tactician_possibly_make_new_root(strategy, problem);
	    }

	}
	return NIL;
    }

    public static SubLObject striping_tactician_problem_is_the_rest_of_an_early_removalP(final SubLObject strategy, final SubLObject problem) {
	final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
	SubLObject basis_object;
	SubLObject state;
	SubLObject restriction_link;
	SubLObject non_focal_problem;
	SubLObject set_contents_var_$7;
	SubLObject basis_object_$8;
	SubLObject state_$9;
	SubLObject join_ordered_link;
	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		state); state = set_contents.do_set_contents_update_state(state)) {
	    restriction_link = set_contents.do_set_contents_next(basis_object, state);
	    if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) {
		non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
		set_contents_var_$7 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
		for (basis_object_$8 = set_contents.do_set_contents_basis_object(set_contents_var_$7), state_$9 = NIL, state_$9 = set_contents.do_set_contents_initial_state(basis_object_$8, set_contents_var_$7); NIL == set_contents.do_set_contents_doneP(basis_object_$8,
			state_$9); state_$9 = set_contents.do_set_contents_update_state(state_$9)) {
		    join_ordered_link = set_contents.do_set_contents_next(basis_object_$8, state_$9);
		    if (((((NIL != set_contents.do_set_contents_element_validP(state_$9, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)))
			    && (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)))
			    && (NIL != striping_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link))) {
			return T;
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(final SubLObject strategy, final SubLObject problem, final SubLObject join_ordered_link) {
	if (NIL != striping_tactician_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link)) {
	    return T;
	}
	if (NIL != striping_tactician_early_removal_linkP(strategy, join_ordered_link)) {
	    return T;
	}
	return NIL;
    }

    public static SubLObject striping_tactician_treats_restricted_non_focal_as_new_rootP(final SubLObject strategy, final SubLObject join_ordered_link) {
	return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link)) || (NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link)));
    }

    public static SubLObject striping_tactician_early_removal_linkP(final SubLObject strategy, final SubLObject link) {
	assert NIL != striping_tactician_p(strategy) : "striping_tactician.striping_tactician_p(strategy) " + "CommonSymbols.NIL != striping_tactician.striping_tactician_p(strategy) " + strategy;
	assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) " + link;
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strategy = NIL;
	r_strategy = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((((((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_datastructures_problem_link.problem_link_openP(link))) && (NIL != balancing_tactician.substrategy_connected_conjunction_link_motivatedP(r_strategy, link)))
		    && (NIL != striping_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))))
		    && ($COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), r_strategy)))
		    && (NIL != inference_tactician.join_ordered_link_early_removal_cheapP(link, strategy))) {
		return T;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strategy = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_problem_is_the_result_of_a_simplificationP(final SubLObject strategy, final SubLObject problem) {
	if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
	    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
	    SubLObject basis_object;
	    SubLObject state;
	    SubLObject simplification_link;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		simplification_link = set_contents.do_set_contents_next(basis_object, state);
		if (((NIL != set_contents.do_set_contents_element_validP(state, simplification_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(simplification_link, $SIMPLIFICATION)))
			&& (NIL != striping_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(simplification_link)))) {
		    return T;
		}
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_note_argument_link(final SubLObject strategy, final SubLObject link) {
	if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
	    final SubLObject t_strategy = striping_tactician_transformation_substrategy(strategy);
	    final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
	    if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
		striping_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
	    }
	    return NIL;
	}
	return NIL;
    }

    public static SubLObject striping_tactician_early_removal_productivity_limit(final SubLObject strategy) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $striping_tactician_early_removal_productivity_limit$.getDynamicValue(thread);
    }

    public static SubLObject striping_tactician_substrategy_strategem_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject strategem) {
	if (NIL != inference_datastructures_problem.problem_p(strategem)) {
	    return striping_tactician_substrategy_problem_motivated(strategy, substrategy, strategem);
	}
	if (NIL != inference_datastructures_problem_link.problem_link_p(strategem)) {
	    return striping_tactician_substrategy_link_motivated(strategy, substrategy, strategem);
	}
	if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
	    return striping_tactician_substrategy_tactic_motivated(strategy, substrategy, strategem);
	}
	return NIL;
    }

    public static SubLObject striping_tactician_substrategy_problem_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject problem) {
	inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
	if (NIL != new_root_tactician.new_root_strategy_p(substrategy)) {
	    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
	    SubLObject basis_object;
	    SubLObject state;
	    SubLObject split_link;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		split_link = set_contents.do_set_contents_next(basis_object, state);
		if ((NIL != set_contents.do_set_contents_element_validP(state, split_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT))) {
		    striping_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, split_link);
		}
	    }
	    set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
	    SubLObject union_link;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		union_link = set_contents.do_set_contents_next(basis_object, state);
		if ((NIL != set_contents.do_set_contents_element_validP(state, union_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION))) {
		    striping_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, union_link);
		}
	    }
	    set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
	    SubLObject link;
	    SubLObject link_var;
	    SubLObject set_contents_var_$10;
	    SubLObject basis_object_$11;
	    SubLObject state_$12;
	    SubLObject restriction_link;
	    SubLObject restricted_non_focal_problem;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		link = set_contents.do_set_contents_next(basis_object, state);
		if (((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $JOIN_ORDERED))) && (NIL != striping_tactician_early_removal_linkP(strategy, link))) {
		    link_var = link;
		    set_contents_var_$10 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
		    for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); NIL == set_contents.do_set_contents_doneP(basis_object_$11,
			    state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
			restriction_link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
			if (((NIL != set_contents.do_set_contents_element_validP(state_$12, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)))
				&& (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var))) {
			    restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
			    striping_tactician_possibly_make_new_root(strategy, restricted_non_focal_problem);
			}
		    }
		}
	    }
	} else if (NIL != removal_tactician.removal_strategy_p(substrategy)) {
	    final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
	    SubLObject basis_object;
	    SubLObject state;
	    SubLObject t_link;
	    SubLObject residual_problem;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		t_link = set_contents.do_set_contents_next(basis_object, state);
		if (((NIL != set_contents.do_set_contents_element_validP(state, t_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(t_link, $TRANSFORMATION))) && (NIL != striping_tactician_chooses_to_make_d_a_new_rootP(strategy, t_link))) {
		    residual_problem = inference_worker_transformation.transformation_link_supporting_problem(t_link);
		    return striping_tactician_possibly_make_new_root(strategy, residual_problem);
		}
	    }
	}

	return NIL;
    }

    public static SubLObject striping_tactician_substrategy_link_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject link) {
	assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : "transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) "
		+ substrategy;
	assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) " + link;
	if (NIL != inference_worker_transformation.transformation_link_p(link)) {
	    if (NIL == striping_tactician_chooses_to_make_d_a_new_rootP(strategy, link)) {
		SubLObject count = ZERO_INTEGER;
		SubLObject cdolist_list_var = striping_tactician_transformation_new_root_candidates(strategy, link);
		SubLObject new_root = NIL;
		new_root = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    if (NIL != striping_tactician_possibly_make_new_root(strategy, new_root)) {
			count = add(count, ONE_INTEGER);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    new_root = cdolist_list_var.first();
		}
		return count;
	    }
	    if (NIL != striping_tactician_problem_motivated_wrt_any_rP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))) {
		final SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(link);
		return striping_tactician_possibly_make_new_root(strategy, residual_problem);
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_chooses_to_make_d_a_new_rootP(final SubLObject strategy, final SubLObject t_link) {
	return sublisp_null(striping_tactician_residual_conjunction_new_root_candidates(strategy, t_link));
    }

    public static SubLObject striping_tactician_residual_conjunction_new_root_candidates(final SubLObject strategy, final SubLObject t_link) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject t_strategy = striping_tactician_transformation_substrategy(strategy);
	SubLObject new_roots = NIL;
	if ((NIL == $striping_tactician_self_looping_rule_fix_enabledP$.getDynamicValue(thread)) || (NIL == assertion_utilities.self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link)))) {
	    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
	    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
	    SubLObject basis_object;
	    SubLObject state;
	    SubLObject jo_link_var;
	    SubLObject jo_link_var_$13;
	    SubLObject motivating_conjunction_problem;
	    SubLObject set_contents_var_$14;
	    SubLObject basis_object_$15;
	    SubLObject state_$16;
	    SubLObject rt_link;
	    SubLObject candidate_new_root;
	    SubLObject jo_link;
	    SubLObject jo_tactic;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		jo_link_var = set_contents.do_set_contents_next(basis_object, state);
		if ((NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED))) {
		    jo_link_var_$13 = jo_link_var;
		    motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$13);
		    set_contents_var_$14 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
		    for (basis_object_$15 = set_contents.do_set_contents_basis_object(set_contents_var_$14), state_$16 = NIL, state_$16 = set_contents.do_set_contents_initial_state(basis_object_$15, set_contents_var_$14); NIL == set_contents.do_set_contents_doneP(basis_object_$15,
			    state_$16); state_$16 = set_contents.do_set_contents_update_state(state_$16)) {
			rt_link = set_contents.do_set_contents_next(basis_object_$15, state_$16);
			if ((((NIL != set_contents.do_set_contents_element_validP(state_$16, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)))
				&& (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$13)))
				&& (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link))) {
			    candidate_new_root = inference_worker_residual_transformation.residual_transformation_link_supporting_problem(rt_link);
			    if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, t_strategy)) || (NIL != inference_datastructures_strategy.problem_motivatedP(candidate_new_root, t_strategy))) {
				jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
				jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
				if ((NIL == $striping_tactician_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread)) || (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, jo_tactic))) {
				    new_roots = cons(candidate_new_root, new_roots);
				}
			    }
			}
		    }
		}
	    }
	}
	return nreverse(new_roots);
    }

    public static SubLObject striping_tactician_transformation_new_root_candidates(final SubLObject strategy, final SubLObject t_link) {
	if (NIL != inference_tactician.transformation_link_leads_to_term_chosen_dead_endP(t_link)) {
	    return inference_tactician.all_restricted_non_focals_around_transformation_link(t_link);
	}
	return striping_tactician_residual_conjunction_new_root_candidates(strategy, t_link);
    }

    public static SubLObject striping_tactician_possibly_make_new_root(final SubLObject strategy, final SubLObject problem) {
	return inference_tactician.substrategy_motivate_strategem(striping_tactician_new_root_substrategy(strategy), problem);
    }

    public static SubLObject striping_tactician_substrategy_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject tactic) {
	if (NIL != inference_worker.connected_conjunction_tactic_p(tactic)) {
	    return striping_tactician_substrategy_connected_conjunction_tactic_motivated(strategy, substrategy, tactic);
	}
	if (NIL != inference_worker_split.split_tactic_p(tactic)) {
	    return striping_tactician_substrategy_split_tactic_motivated(strategy, substrategy, tactic);
	}
	return NIL;
    }

    public static SubLObject striping_tactician_substrategy_connected_conjunction_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject cc_tactic) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : "transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) "
		+ substrategy;
	assert NIL != inference_worker.connected_conjunction_tactic_p(cc_tactic) : "inference_worker.connected_conjunction_tactic_p(cc_tactic) " + "CommonSymbols.NIL != inference_worker.connected_conjunction_tactic_p(cc_tactic) " + cc_tactic;
	if (NIL != $striping_tactician_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread)) {
	    final SubLObject link = inference_worker.connected_conjunction_tactic_link(cc_tactic);
	    if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
		final SubLObject jo_link_var = link;
		final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
		final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
		SubLObject basis_object;
		SubLObject state;
		SubLObject rt_link;
		for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
			state); state = set_contents.do_set_contents_update_state(state)) {
		    rt_link = set_contents.do_set_contents_next(basis_object, state);
		    if (((NIL != set_contents.do_set_contents_element_validP(state, rt_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)))
			    && (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var))) {
			striping_tactician_possibly_motivate_new_root_via_residual_transformation_link(strategy, rt_link);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_possibly_motivate_new_root_via_residual_transformation_link(final SubLObject strategy, final SubLObject rt_link) {
	final SubLObject t_strategy = striping_tactician_transformation_substrategy(strategy);
	final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
	if (NIL != inference_tactician.substrategy_link_head_motivatedP(t_strategy, t_link)) {
	    return striping_tactician_substrategy_link_motivated(strategy, t_strategy, t_link);
	}
	return NIL;
    }

    public static SubLObject striping_tactician_substrategy_split_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject split_tactic) {
	assert NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) : "transformation_tactician_datastructures.transformation_strategy_p(substrategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy) "
		+ substrategy;
	assert NIL != inference_worker_split.split_tactic_p(split_tactic) : "inference_worker_split.split_tactic_p(split_tactic) " + "CommonSymbols.NIL != inference_worker_split.split_tactic_p(split_tactic) " + split_tactic;
	final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	SubLObject r_strategy = NIL;
	r_strategy = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, r_strategy);
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strategy = cdolist_list_var.first();
	}
	striping_tactician_possibly_propagate_new_root_motivation_down_split_link(strategy, inference_worker_split.split_tactic_link(split_tactic));
	cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	r_strategy = NIL;
	r_strategy = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != inference_datastructures_strategy.problem_motivatedP(problem, r_strategy)) {
		inference_tactician.substrategy_reconsider_split_set_asides(r_strategy, split_tactic);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strategy = cdolist_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_possibly_propagate_new_root_motivation_down_split_link(final SubLObject strategy, final SubLObject split_link) {
	SubLObject count = ZERO_INTEGER;
	if (NIL != striping_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(split_link))) {
	    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
	    SubLObject supporting_mapped_problem = NIL;
	    supporting_mapped_problem = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
		    final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
		    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
		    if ((NIL != striping_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) && (NIL != inference_tactician.substrategy_motivate_strategem(striping_tactician_new_root_substrategy(strategy), supporting_problem))) {
			count = add(count, ONE_INTEGER);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		supporting_mapped_problem = cdolist_list_var.first();
	    }
	}
	return count;
    }

    public static SubLObject striping_tactician_substrategy_union_tactic_motivated(final SubLObject strategy, final SubLObject substrategy, final SubLObject union_tactic) {
	if (NIL != transformation_tactician_datastructures.transformation_strategy_p(substrategy)) {
	    return striping_tactician_possibly_propagate_new_root_motivation_down_union_link(strategy, inference_worker_union.union_tactic_link(union_tactic));
	}
	return NIL;
    }

    public static SubLObject striping_tactician_possibly_propagate_new_root_motivation_down_union_link(final SubLObject strategy, final SubLObject union_link) {
	if (NIL != striping_tactician_problem_motivated_wrt_nP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
	    final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
	    if (NIL != striping_tactician_problem_motivated_wrt_tP(strategy, supporting_problem)) {
		return striping_tactician_possibly_make_new_root(strategy, supporting_problem);
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP(final SubLObject strategy, final SubLObject substrategy, final SubLObject split_tactic) {
	assert NIL != removal_tactician.removal_strategy_p(substrategy) : "removal_tactician.removal_strategy_p(substrategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(substrategy) " + substrategy;
	return makeBoolean(NIL == inference_tactician.substrategy_link_head_motivatedP(striping_tactician_transformation_substrategy(strategy), split_tactic));
    }

    public static SubLObject striping_tactician_chooses_to_totally_throw_away_tacticP(final SubLObject strategy, final SubLObject substrategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP) {
	return striping_tactician_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
    }

    public static SubLObject striping_tactician_substrategy_problem_status_change(final SubLObject strategy, final SubLObject substrategy, final SubLObject problem, final SubLObject old_status, final SubLObject new_status) {
	striping_tactician_recompute_problem_status(strategy, problem);
	if ((((NIL != removal_tactician.removal_strategy_p(substrategy)) && (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, substrategy))) && (NIL == inference_datastructures_enumerated_types.no_good_problem_status_p(old_status)))
		&& (NIL != inference_datastructures_enumerated_types.no_good_problem_status_p(new_status))) {
	    striping_tactician_make_problem_no_good(strategy, problem);
	    return $COMPLETE_REMOVAL_TACTIC_NO_GOOD;
	}
	return NIL;
    }

    public static SubLObject striping_tactician_recompute_problem_status(final SubLObject strategy, final SubLObject problem) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject weakest_strategic_status = $FINISHED;
	SubLObject most_sensible_provability_status = $NO_GOOD;
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject substrategy = NIL;
	substrategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    if (NIL == striping_tactician_spineless_substrategy_p(substrategy)) {
		final SubLObject strategic_status = inference_datastructures_strategy.problem_strategic_status(problem, substrategy);
		if (NIL != inference_datastructures_enumerated_types.tactical_status_unionP(strategic_status, weakest_strategic_status)) {
		    weakest_strategic_status = strategic_status;
		}
		final SubLObject pcase_var;
		final SubLObject provability_status = pcase_var = inference_datastructures_strategy.problem_provability_status(problem, substrategy);
		if (!pcase_var.eql($NO_GOOD)) {
		    if (pcase_var.eql($GOOD)) {
			most_sensible_provability_status = $NEUTRAL;
		    } else if (pcase_var.eql($NEUTRAL)) {
			most_sensible_provability_status = $NEUTRAL;
		    }

		}
	    }
	    csome_list_var = csome_list_var.rest();
	    substrategy = csome_list_var.first();
	}
	if (($POSSIBLE == weakest_strategic_status) && ($NO_GOOD == most_sensible_provability_status)) {
	    weakest_strategic_status = $PENDING;
	}
	if (($FINISHED == weakest_strategic_status) && (NIL == inference_worker.finished_problem_p(problem, strategy))) {
	    striping_tactician_recompute_uninterestingness_for_sibling_split_tactics(strategy, problem);
	}
	final SubLObject status = inference_datastructures_enumerated_types.problem_status_from_tactical_status_and_provability_status(weakest_strategic_status, most_sensible_provability_status);
	inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategy, status);
	if (((NIL != $striping_tactician_is_tactically_hardcoreP$.getDynamicValue(thread)) && (NIL != inference_tactician.strategy_controls_problem_storeP(strategy))) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) {
	    striping_tactician_possibly_propagate_strategic_status_to_tactical_status(problem, most_sensible_provability_status, weakest_strategic_status);
	}
	return status;
    }

    public static SubLObject striping_tactician_recompute_uninterestingness_for_sibling_split_tactics(final SubLObject strategy, final SubLObject lookahead_problem) {
	final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(lookahead_problem);
	SubLObject basis_object;
	SubLObject state;
	SubLObject split_link;
	SubLObject problem;
	SubLObject cdolist_list_var;
	SubLObject split_tactic;
	SubLObject cdolist_list_var_$17;
	SubLObject r_strategy;
	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		state); state = set_contents.do_set_contents_update_state(state)) {
	    split_link = set_contents.do_set_contents_next(basis_object, state);
	    if ((NIL != set_contents.do_set_contents_element_validP(state, split_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT))) {
		problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
		cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
		split_tactic = NIL;
		split_tactic = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, $SPLIT)) {
			cdolist_list_var_$17 = striping_tactician_removal_substrategies(strategy);
			r_strategy = NIL;
			r_strategy = cdolist_list_var_$17.first();
			while (NIL != cdolist_list_var_$17) {
			    inference_datastructures_strategy.set_tactic_recompute_set_aside(split_tactic, r_strategy);
			    inference_datastructures_strategy.set_tactic_recompute_thrown_away(split_tactic, r_strategy);
			    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
			    r_strategy = cdolist_list_var_$17.first();
			}
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    split_tactic = cdolist_list_var.first();
		}
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_possibly_propagate_strategic_status_to_tactical_status(final SubLObject problem, final SubLObject most_sensible_provability_status, final SubLObject weakest_strategic_status) {
	if ($NO_GOOD == most_sensible_provability_status) {
	    inference_worker.make_problem_no_good(problem, NIL, $TACTICAL);
	}
	if ($PENDING == weakest_strategic_status) {
	    inference_worker.discard_all_possible_tactics(problem);
	    inference_worker.possibly_note_problem_pending(problem, $TACTICAL);
	}
	if ($FINISHED == weakest_strategic_status) {
	    inference_worker.possibly_note_problem_finished(problem, $TACTICAL);
	}
	return problem;
    }

    public static SubLObject striping_tactician_make_problem_no_good(final SubLObject strategy, final SubLObject problem) {
	inference_worker.make_problem_no_good(problem, NIL, strategy);
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject sub_strategy = NIL;
	sub_strategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    inference_worker.make_problem_no_good(problem, NIL, sub_strategy);
	    csome_list_var = csome_list_var.rest();
	    sub_strategy = csome_list_var.first();
	}
	return NIL;
    }

    public static SubLObject striping_tactician_make_problem_pending(final SubLObject strategy, final SubLObject problem) {
	SubLObject csome_list_var = striping_tactician_all_substrategies(strategy);
	SubLObject sub_strategy = NIL;
	sub_strategy = csome_list_var.first();
	while (NIL != csome_list_var) {
	    inference_worker.possibly_note_problem_pending(problem, sub_strategy);
	    csome_list_var = csome_list_var.rest();
	    sub_strategy = csome_list_var.first();
	}
	final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
	SubLObject basis_object;
	SubLObject state;
	SubLObject link;
	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		state); state = set_contents.do_set_contents_update_state(state)) {
	    link = set_contents.do_set_contents_next(basis_object, state);
	    if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $CONNECTED_CONJUNCTION))) {
		striping_tactician_make_problem_pending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link));
	    }
	}
	return NIL;
    }

    public static SubLObject striping_tactician_arbitrary_relevant_removal_substrategy(final SubLObject striping_strategy, final SubLObject problem) {
	final SubLObject r_strat_for_new_root = striping_tactician_new_root_removal_strategy(striping_strategy, problem);
	if (NIL != r_strat_for_new_root) {
	    return r_strat_for_new_root;
	}
	SubLObject cdolist_list_var = striping_tactician_removal_substrategies(striping_strategy);
	SubLObject r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != inference_datastructures_strategy.problem_motivatedP(problem, r_strat)) {
		return r_strat;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	cdolist_list_var = striping_tactician_removal_substrategies(striping_strategy);
	r_strat = NIL;
	r_strat = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, r_strat)) {
		return r_strat;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    r_strat = cdolist_list_var.first();
	}
	return striping_tactician_removal_substrategies(striping_strategy).first();
    }

    public static SubLObject sibling_removal_strategy(final SubLObject strategy, final SubLObject problem) {
	final SubLObject bal_strategy = inference_tactician.controlling_strategy(strategy);
	if (NIL != striping_tactician_p(bal_strategy)) {
	    return striping_tactician_arbitrary_relevant_removal_substrategy(bal_strategy, problem);
	}
	if (NIL != balancing_tactician.balancing_tactician_p(bal_strategy)) {
	    return balancing_tactician.balancing_tactician_sole_removal_substrategy(bal_strategy);
	}
	return NIL;
    }

    public static SubLObject sibling_transformation_strategy(final SubLObject strategy) {
	final SubLObject bal_strategy = inference_tactician.controlling_strategy(strategy);
	if (NIL != striping_tactician_p(bal_strategy)) {
	    return striping_tactician_transformation_substrategy(bal_strategy);
	}
	if (NIL != balancing_tactician.balancing_tactician_p(bal_strategy)) {
	    return balancing_tactician.balancing_tactician_transformation_substrategy(bal_strategy);
	}
	return NIL;
    }

    public static SubLObject cb_show_striping_tactician_stripes(final SubLObject strategy) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_newline(UNPROVIDED);
	html_princ_strong($str165$Active_Removal_Substrategies_);
	html_markup(html_macros.$html_table_head$.getGlobalValue());
	html_markup(html_macros.$html_table_border$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(ONE_INTEGER);
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(TWO_INTEGER);
	html_char(CHAR_quotation, UNPROVIDED);
	html_char(CHAR_greater, UNPROVIDED);
	SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	    SubLObject r_strat = NIL;
	    r_strat = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL == inference_tactician.strategy_doneP(r_strat)) {
		    cb_show_striping_tactician_one_stripe(strategy, r_strat);
		}
		cdolist_list_var = cdolist_list_var.rest();
		r_strat = cdolist_list_var.first();
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_table_tail$.getGlobalValue());
	html_newline(TWO_INTEGER);
	html_princ_strong($str166$Inactive_Removal_Substrategies_);
	html_markup(html_macros.$html_table_head$.getGlobalValue());
	html_markup(html_macros.$html_table_border$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(ONE_INTEGER);
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(TWO_INTEGER);
	html_char(CHAR_quotation, UNPROVIDED);
	html_char(CHAR_greater, UNPROVIDED);
	_prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    SubLObject cdolist_list_var = striping_tactician_removal_substrategies(strategy);
	    SubLObject r_strat = NIL;
	    r_strat = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != inference_tactician.strategy_doneP(r_strat)) {
		    cb_show_striping_tactician_one_stripe(strategy, r_strat);
		}
		cdolist_list_var = cdolist_list_var.rest();
		r_strat = cdolist_list_var.first();
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_table_tail$.getGlobalValue());
	return NIL;
    }

    public static SubLObject cb_show_striping_tactician_one_stripe(final SubLObject strategy, final SubLObject r_strat) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_table_row_head$.getGlobalValue());
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		final SubLObject strong_var = makeBoolean(NIL == inference_tactician.strategy_doneP(r_strat));
		final SubLObject head = (NIL != strong_var) ? html_macros.$html_strong_head$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
		final SubLObject tail = (NIL != strong_var) ? html_macros.$html_strong_tail$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
		html_markup(head);
		cb_link($STRATEGY, r_strat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		html_markup(tail);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
	    }
	    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
	    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		html_princ(inference_datastructures_strategy.strategy_step_count(r_strat));
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
	    }
	    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
	    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		final SubLObject new_root_problem = striping_tactician_removal_strategy_new_root(strategy, r_strat);
		cb_link($PROBLEM, new_root_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		html_newline(UNPROVIDED);
		cb_inference_browser.cb_show_problem_query(inference_datastructures_problem.problem_query(new_root_problem), NIL);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
	    }
	    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
	html_source_readability_terpri(UNPROVIDED);
	return NIL;
    }

    public static SubLObject all_new_root_metrics_from_kbq_experiment(final SubLObject query_set_run) {
	SubLObject result = NIL;
	SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
	SubLObject query_run = NIL;
	query_run = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$21;
	    final SubLObject new_root_metrics = cdolist_list_var_$21 = kbq_query_run.kbq_query_run_property_value(query_run, $NEW_ROOT_METRICS, UNPROVIDED);
	    SubLObject one_new_root_metric = NIL;
	    one_new_root_metric = cdolist_list_var_$21.first();
	    while (NIL != cdolist_list_var_$21) {
		result = cons(one_new_root_metric, result);
		cdolist_list_var_$21 = cdolist_list_var_$21.rest();
		one_new_root_metric = cdolist_list_var_$21.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    query_run = cdolist_list_var.first();
	}
	return nreverse(result);
    }

    public static SubLObject answerable_new_root_metrics(final SubLObject new_root_metrics) {
	return list_utilities.remove_if_not($sym170$ANSWERABLE_NEW_ROOT_METRIC_, new_root_metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject answerable_new_root_metrics_count(final SubLObject new_root_metrics) {
	return count_if($sym170$ANSWERABLE_NEW_ROOT_METRIC_, new_root_metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject unanswerable_new_root_metrics(final SubLObject new_root_metrics) {
	return remove_if($sym170$ANSWERABLE_NEW_ROOT_METRIC_, new_root_metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject answerable_new_root_metricP(final SubLObject new_root_metric) {
	return plusp(getf(new_root_metric, $NEW_ROOT_ANSWER_COUNT, UNPROVIDED));
    }

    public static SubLObject new_root_metric_step_count(final SubLObject new_root_metric) {
	return getf(new_root_metric, $NEW_ROOT_STEP_COUNT, UNPROVIDED);
    }

    public static SubLObject new_root_metric_exhaustedP(final SubLObject new_root_metric) {
	return getf(new_root_metric, $kw104$NEW_ROOT_EXHAUSTED_, UNPROVIDED);
    }

    public static SubLObject new_root_metric_start_inference_step_count(final SubLObject new_root_metric) {
	return getf(new_root_metric, $NEW_ROOT_START_INFERENCE_STEP_COUNT, UNPROVIDED);
    }

    public static SubLObject new_root_metric_steps_to_first_answer(final SubLObject new_root_metric) {
	return getf(new_root_metric, $NEW_ROOT_STEPS_TO_FIRST_ANSWER, UNPROVIDED);
    }

    public static SubLObject answerable_new_root_steps_to_first_answer(final SubLObject new_root_metrics) {
	return Sort.sort(Mapping.mapcar(NEW_ROOT_METRIC_STEPS_TO_FIRST_ANSWER, answerable_new_root_metrics(new_root_metrics)), symbol_function($sym172$_), UNPROVIDED);
    }

    public static SubLObject unanswerable_new_root_step_counts(final SubLObject new_root_metrics) {
	return Sort.sort(Mapping.mapcar(NEW_ROOT_METRIC_STEP_COUNT, unanswerable_new_root_metrics(new_root_metrics)), symbol_function($sym172$_), UNPROVIDED);
    }

    public static SubLObject compute_new_root_answerability_expectation(final SubLObject query_set_run) {
	final SubLObject new_root_metrics = all_new_root_metrics_from_kbq_experiment(query_set_run);
	final SubLObject new_root_count = length(new_root_metrics);
	final SubLObject answerable_new_root_count = answerable_new_root_metrics_count(new_root_metrics);
	return round(divide(new_root_count, answerable_new_root_count), UNPROVIDED);
    }

    public static SubLObject exhausted_new_root_answerability_probabilities_by_order(final SubLObject query_set_run) {
	final SubLObject total_counts = dictionary.new_dictionary(symbol_function(EQ), $int$1000);
	final SubLObject answerable_counts = dictionary.new_dictionary(symbol_function(EQ), $int$1000);
	SubLObject max_index = ZERO_INTEGER;
	SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
	SubLObject query_run = NIL;
	query_run = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject new_root_metrics = kbq_query_run.kbq_query_run_property_value(query_run, $NEW_ROOT_METRICS, UNPROVIDED);
	    final SubLObject sorted_new_root_metrics = Sort.sort(copy_list(new_root_metrics), symbol_function($sym172$_), NEW_ROOT_METRIC_START_INFERENCE_STEP_COUNT);
	    SubLObject list_var = NIL;
	    SubLObject new_root_metric = NIL;
	    SubLObject i = NIL;
	    list_var = sorted_new_root_metrics;
	    new_root_metric = list_var.first();
	    for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), new_root_metric = list_var.first(), i = add(ONE_INTEGER, i)) {
		if (i.numG(max_index)) {
		    max_index = i;
		}
		if (NIL != new_root_metric_exhaustedP(new_root_metric)) {
		    dictionary_utilities.dictionary_increment(total_counts, i, UNPROVIDED);
		    if (NIL != answerable_new_root_metricP(new_root_metric)) {
			dictionary_utilities.dictionary_increment(answerable_counts, i, UNPROVIDED);
		    }
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    query_run = cdolist_list_var.first();
	}
	SubLObject probability_list = NIL;
	SubLObject counts_list = NIL;
	SubLObject cdotimes_end_var;
	SubLObject j;
	SubLObject total_count;
	SubLObject answerable_count;
	SubLObject probability;
	for (cdotimes_end_var = number_utilities.f_1X(max_index), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
	    total_count = dictionary.dictionary_lookup_without_values(total_counts, j, ZERO_INTEGER);
	    answerable_count = dictionary.dictionary_lookup_without_values(answerable_counts, j, ZERO_INTEGER);
	    probability = (total_count.isZero()) ? ZERO_INTEGER : divide(answerable_count, total_count);
	    probability_list = cons(probability, probability_list);
	    counts_list = cons(total_count, counts_list);
	}
	return values(nreverse(probability_list), nreverse(counts_list));
    }

    public static SubLObject declare_striping_tactician_file() {
	declareFunction("striping_tactician_data_print_function_trampoline", "STRIPING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("striping_tactician_data_p", "STRIPING-TACTICIAN-DATA-P", 1, 0, false);
	new striping_tactician.$striping_tactician_data_p$UnaryFunction();
	declareFunction("str_tac_data_new_root_substrategy", "STR-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
	declareFunction("str_tac_data_transformation_substrategy", "STR-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
	declareFunction("str_tac_data_removal_substrategies", "STR-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
	declareFunction("str_tac_data_new_root_r_map", "STR-TAC-DATA-NEW-ROOT-R-MAP", 1, 0, false);
	declareFunction("str_tac_data_new_root_proofiness_map", "STR-TAC-DATA-NEW-ROOT-PROOFINESS-MAP", 1, 0, false);
	declareFunction("str_tac_data_new_root_delay_map", "STR-TAC-DATA-NEW-ROOT-DELAY-MAP", 1, 0, false);
	declareFunction("str_tac_data_new_root_metrics_map", "STR-TAC-DATA-NEW-ROOT-METRICS-MAP", 1, 0, false);
	declareFunction("_csetf_str_tac_data_new_root_substrategy", "_CSETF-STR-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
	declareFunction("_csetf_str_tac_data_transformation_substrategy", "_CSETF-STR-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
	declareFunction("_csetf_str_tac_data_removal_substrategies", "_CSETF-STR-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
	declareFunction("_csetf_str_tac_data_new_root_r_map", "_CSETF-STR-TAC-DATA-NEW-ROOT-R-MAP", 2, 0, false);
	declareFunction("_csetf_str_tac_data_new_root_proofiness_map", "_CSETF-STR-TAC-DATA-NEW-ROOT-PROOFINESS-MAP", 2, 0, false);
	declareFunction("_csetf_str_tac_data_new_root_delay_map", "_CSETF-STR-TAC-DATA-NEW-ROOT-DELAY-MAP", 2, 0, false);
	declareFunction("_csetf_str_tac_data_new_root_metrics_map", "_CSETF-STR-TAC-DATA-NEW-ROOT-METRICS-MAP", 2, 0, false);
	declareFunction("make_striping_tactician_data", "MAKE-STRIPING-TACTICIAN-DATA", 0, 1, false);
	declareFunction("visit_defstruct_striping_tactician_data", "VISIT-DEFSTRUCT-STRIPING-TACTICIAN-DATA", 2, 0, false);
	declareFunction("visit_defstruct_object_striping_tactician_data_method", "VISIT-DEFSTRUCT-OBJECT-STRIPING-TACTICIAN-DATA-METHOD", 2, 0, false);
	declareFunction("striping_tactician_p", "STRIPING-TACTICIAN-P", 1, 0, false);
	declareMacro("do_striping_tactician_substrategies", "DO-STRIPING-TACTICIAN-SUBSTRATEGIES");
	declareMacro("do_striping_tactician_spineful_substrategies", "DO-STRIPING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
	declareMacro("do_striping_tactician_removal_substrategies", "DO-STRIPING-TACTICIAN-REMOVAL-SUBSTRATEGIES");
	declareMacro("do_striping_tactician_active_removal_substrategies", "DO-STRIPING-TACTICIAN-ACTIVE-REMOVAL-SUBSTRATEGIES");
	declareMacro("do_striping_tactician_inactive_removal_substrategies", "DO-STRIPING-TACTICIAN-INACTIVE-REMOVAL-SUBSTRATEGIES");
	declareFunction("new_striping_tactician_data", "NEW-STRIPING-TACTICIAN-DATA", 2, 0, false);
	declareFunction("striping_tactician_initialize", "STRIPING-TACTICIAN-INITIALIZE", 1, 0, false);
	declareFunction("new_striping_tactician_data_from_inference", "NEW-STRIPING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
	declareFunction("striping_tactician_new_root_substrategy", "STRIPING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
	declareFunction("striping_tactician_transformation_substrategy", "STRIPING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
	declareFunction("striping_tactician_removal_substrategies", "STRIPING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
	declareFunction("striping_tactician_new_root_r_map", "STRIPING-TACTICIAN-NEW-ROOT-R-MAP", 1, 0, false);
	declareFunction("striping_tactician_new_root_proofiness_map", "STRIPING-TACTICIAN-NEW-ROOT-PROOFINESS-MAP", 1, 0, false);
	declareFunction("striping_tactician_new_root_delay_map", "STRIPING-TACTICIAN-NEW-ROOT-DELAY-MAP", 1, 0, false);
	declareFunction("striping_tactician_new_root_metrics_map", "STRIPING-TACTICIAN-NEW-ROOT-METRICS-MAP", 1, 0, false);
	declareFunction("striping_tactician_new_removal_substrategy", "STRIPING-TACTICIAN-NEW-REMOVAL-SUBSTRATEGY", 2, 0, false);
	declareFunction("striping_tactician_new_throwaway_removal_substrategy", "STRIPING-TACTICIAN-NEW-THROWAWAY-REMOVAL-SUBSTRATEGY", 1, 0, false);
	declareFunction("set_striping_tactician_new_root_metrics", "SET-STRIPING-TACTICIAN-NEW-ROOT-METRICS", 3, 0, false);
	declareFunction("set_new_root_proofiness", "SET-NEW-ROOT-PROOFINESS", 2, 0, false);
	declareFunction("decrement_new_root_proofiness", "DECREMENT-NEW-ROOT-PROOFINESS", 1, 0, false);
	declareFunction("set_new_root_delay", "SET-NEW-ROOT-DELAY", 2, 0, false);
	declareFunction("decrement_new_root_delay", "DECREMENT-NEW-ROOT-DELAY", 2, 0, false);
	declareFunction("striping_tactician_all_substrategies", "STRIPING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
	declareFunction("striping_tactician_removal_substrategy_count", "STRIPING-TACTICIAN-REMOVAL-SUBSTRATEGY-COUNT", 1, 0, false);
	declareFunction("striping_tactician_problem_motivated_wrt_nP", "STRIPING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
	declareFunction("striping_tactician_problem_motivated_wrt_any_rP", "STRIPING-TACTICIAN-PROBLEM-MOTIVATED-WRT-ANY-R?", 2, 0, false);
	declareFunction("striping_tactician_problem_motivated_wrt_tP", "STRIPING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
	declareFunction("striping_tactician_link_head_motivated_wrt_any_rP", "STRIPING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-ANY-R?", 2, 0, false);
	declareFunction("striping_tactician_substrategy_p", "STRIPING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
	declareFunction("striping_tactician_proper_substrategy_p", "STRIPING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
	declareFunction("striping_tactician_spineless_substrategy_p", "STRIPING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
	declareFunction("striping_tactician_new_root_removal_strategy", "STRIPING-TACTICIAN-NEW-ROOT-REMOVAL-STRATEGY", 2, 0, false);
	declareFunction("striping_tactician_removal_strategy_new_root", "STRIPING-TACTICIAN-REMOVAL-STRATEGY-NEW-ROOT", 2, 0, false);
	declareFunction("new_root_proofiness", "NEW-ROOT-PROOFINESS", 1, 0, false);
	declareFunction("new_root_delay", "NEW-ROOT-DELAY", 1, 0, false);
	declareFunction("new_root_metrics", "NEW-ROOT-METRICS", 1, 0, false);
	declareFunction("new_root_metrics_print_function_trampoline", "NEW-ROOT-METRICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("new_root_metrics_p", "NEW-ROOT-METRICS-P", 1, 0, false);
	new striping_tactician.$new_root_metrics_p$UnaryFunction();
	declareFunction("nr_metrics_start_inference_step_count", "NR-METRICS-START-INFERENCE-STEP-COUNT", 1, 0, false);
	declareFunction("nr_metrics_index", "NR-METRICS-INDEX", 1, 0, false);
	declareFunction("nr_metrics_start_time", "NR-METRICS-START-TIME", 1, 0, false);
	declareFunction("nr_metrics_time_to_first_answer", "NR-METRICS-TIME-TO-FIRST-ANSWER", 1, 0, false);
	declareFunction("nr_metrics_steps_to_first_answer", "NR-METRICS-STEPS-TO-FIRST-ANSWER", 1, 0, false);
	declareFunction("nr_metrics_time_to_last_answer", "NR-METRICS-TIME-TO-LAST-ANSWER", 1, 0, false);
	declareFunction("nr_metrics_steps_to_last_answer", "NR-METRICS-STEPS-TO-LAST-ANSWER", 1, 0, false);
	declareFunction("nr_metrics_answer_count", "NR-METRICS-ANSWER-COUNT", 1, 0, false);
	declareFunction("_csetf_nr_metrics_start_inference_step_count", "_CSETF-NR-METRICS-START-INFERENCE-STEP-COUNT", 2, 0, false);
	declareFunction("_csetf_nr_metrics_index", "_CSETF-NR-METRICS-INDEX", 2, 0, false);
	declareFunction("_csetf_nr_metrics_start_time", "_CSETF-NR-METRICS-START-TIME", 2, 0, false);
	declareFunction("_csetf_nr_metrics_time_to_first_answer", "_CSETF-NR-METRICS-TIME-TO-FIRST-ANSWER", 2, 0, false);
	declareFunction("_csetf_nr_metrics_steps_to_first_answer", "_CSETF-NR-METRICS-STEPS-TO-FIRST-ANSWER", 2, 0, false);
	declareFunction("_csetf_nr_metrics_time_to_last_answer", "_CSETF-NR-METRICS-TIME-TO-LAST-ANSWER", 2, 0, false);
	declareFunction("_csetf_nr_metrics_steps_to_last_answer", "_CSETF-NR-METRICS-STEPS-TO-LAST-ANSWER", 2, 0, false);
	declareFunction("_csetf_nr_metrics_answer_count", "_CSETF-NR-METRICS-ANSWER-COUNT", 2, 0, false);
	declareFunction("make_new_root_metrics", "MAKE-NEW-ROOT-METRICS", 0, 1, false);
	declareFunction("visit_defstruct_new_root_metrics", "VISIT-DEFSTRUCT-NEW-ROOT-METRICS", 2, 0, false);
	declareFunction("visit_defstruct_object_new_root_metrics_method", "VISIT-DEFSTRUCT-OBJECT-NEW-ROOT-METRICS-METHOD", 2, 0, false);
	declareFunction("striping_tactician_initialize_new_root_metrics_from_inference", "STRIPING-TACTICIAN-INITIALIZE-NEW-ROOT-METRICS-FROM-INFERENCE", 3, 0, false);
	declareFunction("new_root_start_inference_step_count", "NEW-ROOT-START-INFERENCE-STEP-COUNT", 1, 0, false);
	declareFunction("new_root_index", "NEW-ROOT-INDEX", 1, 0, false);
	declareFunction("new_root_start_time", "NEW-ROOT-START-TIME", 1, 0, false);
	declareFunction("new_root_time_to_first_answer", "NEW-ROOT-TIME-TO-FIRST-ANSWER", 1, 0, false);
	declareFunction("new_root_steps_to_first_answer", "NEW-ROOT-STEPS-TO-FIRST-ANSWER", 1, 0, false);
	declareFunction("new_root_time_to_last_answer", "NEW-ROOT-TIME-TO-LAST-ANSWER", 1, 0, false);
	declareFunction("new_root_steps_to_last_answer", "NEW-ROOT-STEPS-TO-LAST-ANSWER", 1, 0, false);
	declareFunction("new_root_answer_count", "NEW-ROOT-ANSWER-COUNT", 1, 0, false);
	declareFunction("set_new_root_time_to_first_answer", "SET-NEW-ROOT-TIME-TO-FIRST-ANSWER", 2, 0, false);
	declareFunction("set_new_root_steps_to_first_answer", "SET-NEW-ROOT-STEPS-TO-FIRST-ANSWER", 2, 0, false);
	declareFunction("set_new_root_time_to_last_answer", "SET-NEW-ROOT-TIME-TO-LAST-ANSWER", 2, 0, false);
	declareFunction("set_new_root_steps_to_last_answer", "SET-NEW-ROOT-STEPS-TO-LAST-ANSWER", 2, 0, false);
	declareFunction("set_new_root_answer_count", "SET-NEW-ROOT-ANSWER-COUNT", 2, 0, false);
	declareFunction("new_root_metrics_plist", "NEW-ROOT-METRICS-PLIST", 1, 0, false);
	declareFunction("construct_new_root_metrics_plist", "CONSTRUCT-NEW-ROOT-METRICS-PLIST", 9, 0, false);
	declareFunction("striping_tactician_new_root_metrics", "STRIPING-TACTICIAN-NEW-ROOT-METRICS", 1, 0, false);
	declareFunction("striping_tactician_remember_new_root_metrics", "STRIPING-TACTICIAN-REMEMBER-NEW-ROOT-METRICS", 1, 0, false);
	declareFunction("new_root_answerableP", "NEW-ROOT-ANSWERABLE?", 1, 0, false);
	declareFunction("new_root_unanswerableP", "NEW-ROOT-UNANSWERABLE?", 1, 0, false);
	declareFunction("increment_new_root_answer_count", "INCREMENT-NEW-ROOT-ANSWER-COUNT", 2, 0, false);
	declareFunction("striping_tactician_update_new_root_metrics", "STRIPING-TACTICIAN-UPDATE-NEW-ROOT-METRICS", 2, 0, false);
	declareFunction("striping_tactician_doneP", "STRIPING-TACTICIAN-DONE?", 1, 0, false);
	declareFunction("striping_tactician_do_one_step", "STRIPING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
	declareFunction("striping_tactician_do_one_step_int", "STRIPING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
	declareFunction("new_root_needs_removal_motivationP", "NEW-ROOT-NEEDS-REMOVAL-MOTIVATION?", 2, 0, false);
	declareFunction("striping_tactician_should_reconsider_set_asidesP", "STRIPING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
	declareFunction("striping_tactician_reconsider_set_asides", "STRIPING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
	declareFunction("striping_tactician_new_root_with_highest_proofiness", "STRIPING-TACTICIAN-NEW-ROOT-WITH-HIGHEST-PROOFINESS", 1, 0, false);
	declareFunction("striping_tactician_chooses_to_do_removalP", "STRIPING-TACTICIAN-CHOOSES-TO-DO-REMOVAL?", 1, 0, false);
	declareFunction("striping_tactician_chooses_to_focus_on_a_new_rootP", "STRIPING-TACTICIAN-CHOOSES-TO-FOCUS-ON-A-NEW-ROOT?", 1, 0, false);
	declareFunction("new_root_freshP", "NEW-ROOT-FRESH?", 1, 0, false);
	declareFunction("striping_tactician_unanswerable_new_root_with_lowest_delay", "STRIPING-TACTICIAN-UNANSWERABLE-NEW-ROOT-WITH-LOWEST-DELAY", 1, 0, false);
	declareFunction("striping_tactician_favor_answerable_new_roots", "STRIPING-TACTICIAN-FAVOR-ANSWERABLE-NEW-ROOTS", 1, 0, false);
	declareFunction("striping_tactician_reset_delay", "STRIPING-TACTICIAN-RESET-DELAY", 1, 0, false);
	declareFunction("striping_tactician_compute_new_root_delay", "STRIPING-TACTICIAN-COMPUTE-NEW-ROOT-DELAY", 1, 0, false);
	declareFunction("striping_tactician_compute_new_root_delay_based_on_step_count", "STRIPING-TACTICIAN-COMPUTE-NEW-ROOT-DELAY-BASED-ON-STEP-COUNT", 1, 0, false);
	declareFunction("striping_tactician_compute_new_root_delay_based_on_index", "STRIPING-TACTICIAN-COMPUTE-NEW-ROOT-DELAY-BASED-ON-INDEX", 1, 0, false);
	declareFunction("striping_tactician_decrement_all_unanswerable_new_root_delays_except", "STRIPING-TACTICIAN-DECREMENT-ALL-UNANSWERABLE-NEW-ROOT-DELAYS-EXCEPT", 3, 0, false);
	declareFunction("striping_tactician_new_root_do_one_step", "STRIPING-TACTICIAN-NEW-ROOT-DO-ONE-STEP", 1, 0, false);
	declareFunction("striping_tactician_active_removal_strategies", "STRIPING-TACTICIAN-ACTIVE-REMOVAL-STRATEGIES", 1, 0, false);
	declareFunction("striping_tactician_has_some_removal_to_doP", "STRIPING-TACTICIAN-HAS-SOME-REMOVAL-TO-DO?", 1, 0, false);
	declareFunction("striping_tactician_first_active_removal_substrategy", "STRIPING-TACTICIAN-FIRST-ACTIVE-REMOVAL-SUBSTRATEGY", 1, 0, false);
	declareFunction("striping_tactician_continuation_possibleP", "STRIPING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
	declareFunction("striping_tactician_chooses_to_throw_away_problemP", "STRIPING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
	declareFunction("striping_tactician_chooses_to_set_aside_problemP", "STRIPING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
	declareFunction("striping_tactician_chooses_to_throw_away_tacticP", "STRIPING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
	declareFunction("striping_tactician_chooses_to_set_aside_tacticP", "STRIPING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
	declareFunction("striping_tactician_throw_away_uninteresting_set_asides", "STRIPING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
	declareFunction("striping_tactician_note_inference_dynamic_properties_updated", "STRIPING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
	declareFunction("striping_tactician_initialize_properties", "STRIPING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
	declareFunction("striping_tactician_update_properties", "STRIPING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
	declareFunction("striping_tactician_initial_relevant_strategies", "STRIPING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
	declareFunction("striping_tactician_possibly_activate_problem", "STRIPING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
	declareFunction("striping_tactician_problem_is_the_rest_of_an_early_removalP", "STRIPING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
	declareFunction("striping_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "STRIPING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
	declareFunction("striping_tactician_treats_restricted_non_focal_as_new_rootP", "STRIPING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
	declareFunction("striping_tactician_early_removal_linkP", "STRIPING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
	declareFunction("striping_tactician_problem_is_the_result_of_a_simplificationP", "STRIPING-TACTICIAN-PROBLEM-IS-THE-RESULT-OF-A-SIMPLIFICATION?", 2, 0, false);
	declareFunction("striping_tactician_note_argument_link", "STRIPING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
	declareFunction("striping_tactician_early_removal_productivity_limit", "STRIPING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
	declareFunction("striping_tactician_substrategy_strategem_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_substrategy_problem_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_substrategy_link_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_chooses_to_make_d_a_new_rootP", "STRIPING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
	declareFunction("striping_tactician_residual_conjunction_new_root_candidates", "STRIPING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
	declareFunction("striping_tactician_transformation_new_root_candidates", "STRIPING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
	declareFunction("striping_tactician_possibly_make_new_root", "STRIPING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
	declareFunction("striping_tactician_substrategy_tactic_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_substrategy_connected_conjunction_tactic_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_possibly_motivate_new_root_via_residual_transformation_link", "STRIPING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
	declareFunction("striping_tactician_substrategy_split_tactic_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_possibly_propagate_new_root_motivation_down_split_link", "STRIPING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
	declareFunction("striping_tactician_substrategy_union_tactic_motivated", "STRIPING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
	declareFunction("striping_tactician_possibly_propagate_new_root_motivation_down_union_link", "STRIPING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
	declareFunction("striping_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "STRIPING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
	declareFunction("striping_tactician_chooses_to_totally_throw_away_tacticP", "STRIPING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
	declareFunction("striping_tactician_substrategy_problem_status_change", "STRIPING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
	declareFunction("striping_tactician_recompute_problem_status", "STRIPING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
	declareFunction("striping_tactician_recompute_uninterestingness_for_sibling_split_tactics", "STRIPING-TACTICIAN-RECOMPUTE-UNINTERESTINGNESS-FOR-SIBLING-SPLIT-TACTICS", 2, 0, false);
	declareFunction("striping_tactician_possibly_propagate_strategic_status_to_tactical_status", "STRIPING-TACTICIAN-POSSIBLY-PROPAGATE-STRATEGIC-STATUS-TO-TACTICAL-STATUS", 3, 0, false);
	declareFunction("striping_tactician_make_problem_no_good", "STRIPING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
	declareFunction("striping_tactician_make_problem_pending", "STRIPING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
	declareFunction("striping_tactician_arbitrary_relevant_removal_substrategy", "STRIPING-TACTICIAN-ARBITRARY-RELEVANT-REMOVAL-SUBSTRATEGY", 2, 0, false);
	declareFunction("sibling_removal_strategy", "SIBLING-REMOVAL-STRATEGY", 2, 0, false);
	declareFunction("sibling_transformation_strategy", "SIBLING-TRANSFORMATION-STRATEGY", 1, 0, false);
	declareFunction("cb_show_striping_tactician_stripes", "CB-SHOW-STRIPING-TACTICIAN-STRIPES", 1, 0, false);
	declareFunction("cb_show_striping_tactician_one_stripe", "CB-SHOW-STRIPING-TACTICIAN-ONE-STRIPE", 2, 0, false);
	declareFunction("all_new_root_metrics_from_kbq_experiment", "ALL-NEW-ROOT-METRICS-FROM-KBQ-EXPERIMENT", 1, 0, false);
	declareFunction("answerable_new_root_metrics", "ANSWERABLE-NEW-ROOT-METRICS", 1, 0, false);
	declareFunction("answerable_new_root_metrics_count", "ANSWERABLE-NEW-ROOT-METRICS-COUNT", 1, 0, false);
	declareFunction("unanswerable_new_root_metrics", "UNANSWERABLE-NEW-ROOT-METRICS", 1, 0, false);
	declareFunction("answerable_new_root_metricP", "ANSWERABLE-NEW-ROOT-METRIC?", 1, 0, false);
	declareFunction("new_root_metric_step_count", "NEW-ROOT-METRIC-STEP-COUNT", 1, 0, false);
	declareFunction("new_root_metric_exhaustedP", "NEW-ROOT-METRIC-EXHAUSTED?", 1, 0, false);
	declareFunction("new_root_metric_start_inference_step_count", "NEW-ROOT-METRIC-START-INFERENCE-STEP-COUNT", 1, 0, false);
	declareFunction("new_root_metric_steps_to_first_answer", "NEW-ROOT-METRIC-STEPS-TO-FIRST-ANSWER", 1, 0, false);
	declareFunction("answerable_new_root_steps_to_first_answer", "ANSWERABLE-NEW-ROOT-STEPS-TO-FIRST-ANSWER", 1, 0, false);
	declareFunction("unanswerable_new_root_step_counts", "UNANSWERABLE-NEW-ROOT-STEP-COUNTS", 1, 0, false);
	declareFunction("compute_new_root_answerability_expectation", "COMPUTE-NEW-ROOT-ANSWERABILITY-EXPECTATION", 1, 0, false);
	declareFunction("exhausted_new_root_answerability_probabilities_by_order", "EXHAUSTED-NEW-ROOT-ANSWERABILITY-PROBABILITIES-BY-ORDER", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_striping_tactician_file() {
	defconstant("*DTP-STRIPING-TACTICIAN-DATA*", STRIPING_TACTICIAN_DATA);
	defconstant("*DTP-NEW-ROOT-METRICS*", NEW_ROOT_METRICS);
	defparameter("*NEW-ROOT-ANSWERABILITY-EXPECTATION*", $int$33);
	defparameter("*NEW-ROOT-FRESHNESS-THRESHOLD*", $int$40);
	defparameter("*STRIPING-TACTICIAN-ONE-STRIPE-MODE?*", NIL);
	defvar("*STRIPING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
	defparameter("*STRIPING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*", T);
	defvar("*STRIPING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", T);
	defparameter("*STRIPING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", T);
	defparameter("*STRIPING-TACTICIAN-IS-TACTICALLY-HARDCORE?*", NIL);
	return NIL;
    }

    public static SubLObject setup_striping_tactician_file() {
	inference_tactician.inference_strategy_type($STRIPING, $list1);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_striping_tactician_data$.getGlobalValue(), symbol_function(STRIPING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list10);
	def_csetf(STR_TAC_DATA_NEW_ROOT_SUBSTRATEGY, _CSETF_STR_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
	def_csetf(STR_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, _CSETF_STR_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
	def_csetf(STR_TAC_DATA_REMOVAL_SUBSTRATEGIES, _CSETF_STR_TAC_DATA_REMOVAL_SUBSTRATEGIES);
	def_csetf(STR_TAC_DATA_NEW_ROOT_R_MAP, _CSETF_STR_TAC_DATA_NEW_ROOT_R_MAP);
	def_csetf(STR_TAC_DATA_NEW_ROOT_PROOFINESS_MAP, _CSETF_STR_TAC_DATA_NEW_ROOT_PROOFINESS_MAP);
	def_csetf(STR_TAC_DATA_NEW_ROOT_DELAY_MAP, _CSETF_STR_TAC_DATA_NEW_ROOT_DELAY_MAP);
	def_csetf(STR_TAC_DATA_NEW_ROOT_METRICS_MAP, _CSETF_STR_TAC_DATA_NEW_ROOT_METRICS_MAP);
	identity(STRIPING_TACTICIAN_DATA);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_striping_tactician_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STRIPING_TACTICIAN_DATA_METHOD));
	note_funcall_helper_function(STRIPING_TACTICIAN_INITIALIZE);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_new_root_metrics$.getGlobalValue(), symbol_function(NEW_ROOT_METRICS_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list69);
	def_csetf(NR_METRICS_START_INFERENCE_STEP_COUNT, _CSETF_NR_METRICS_START_INFERENCE_STEP_COUNT);
	def_csetf(NR_METRICS_INDEX, _CSETF_NR_METRICS_INDEX);
	def_csetf(NR_METRICS_START_TIME, _CSETF_NR_METRICS_START_TIME);
	def_csetf(NR_METRICS_TIME_TO_FIRST_ANSWER, _CSETF_NR_METRICS_TIME_TO_FIRST_ANSWER);
	def_csetf(NR_METRICS_STEPS_TO_FIRST_ANSWER, _CSETF_NR_METRICS_STEPS_TO_FIRST_ANSWER);
	def_csetf(NR_METRICS_TIME_TO_LAST_ANSWER, _CSETF_NR_METRICS_TIME_TO_LAST_ANSWER);
	def_csetf(NR_METRICS_STEPS_TO_LAST_ANSWER, _CSETF_NR_METRICS_STEPS_TO_LAST_ANSWER);
	def_csetf(NR_METRICS_ANSWER_COUNT, _CSETF_NR_METRICS_ANSWER_COUNT);
	identity(NEW_ROOT_METRICS);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_new_root_metrics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NEW_ROOT_METRICS_METHOD));
	note_funcall_helper_function($sym105$STRIPING_TACTICIAN_DONE_);
	note_funcall_helper_function(STRIPING_TACTICIAN_DO_ONE_STEP);
	note_funcall_helper_function($sym128$STRIPING_TACTICIAN_CONTINUATION_POSSIBLE_);
	note_funcall_helper_function($sym129$STRIPING_TACTICIAN_CHOOSES_TO_THROW_AWAY_PROBLEM_);
	note_funcall_helper_function($sym130$STRIPING_TACTICIAN_CHOOSES_TO_SET_ASIDE_PROBLEM_);
	note_funcall_helper_function($sym131$STRIPING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
	note_funcall_helper_function($sym132$STRIPING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
	note_funcall_helper_function(STRIPING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
	note_funcall_helper_function(STRIPING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
	note_funcall_helper_function(STRIPING_TACTICIAN_INITIALIZE_PROPERTIES);
	note_funcall_helper_function(STRIPING_TACTICIAN_UPDATE_PROPERTIES);
	note_funcall_helper_function(STRIPING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
	note_funcall_helper_function(STRIPING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
	note_funcall_helper_function(STRIPING_TACTICIAN_NOTE_ARGUMENT_LINK);
	note_funcall_helper_function(STRIPING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
	note_funcall_helper_function(STRIPING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
	note_funcall_helper_function($sym153$STRIPING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOVA);
	note_funcall_helper_function($sym154$STRIPING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
	note_funcall_helper_function(STRIPING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
	note_funcall_helper_function($sym170$ANSWERABLE_NEW_ROOT_METRIC_);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_striping_tactician_file();
    }

    @Override
    public void initializeVariables() {
	init_striping_tactician_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_striping_tactician_file();
    }

    static {

    }

    public static final class $striping_tactician_data_native extends SubLStructNative {
	public SubLObject $new_root_substrategy;

	public SubLObject $transformation_substrategy;

	public SubLObject $removal_substrategies;

	public SubLObject $new_root_r_map;

	public SubLObject $new_root_proofiness_map;

	public SubLObject $new_root_delay_map;

	public SubLObject $new_root_metrics_map;

	private static final SubLStructDeclNative structDecl;

	private $striping_tactician_data_native() {
	    this.$new_root_substrategy = Lisp.NIL;
	    this.$transformation_substrategy = Lisp.NIL;
	    this.$removal_substrategies = Lisp.NIL;
	    this.$new_root_r_map = Lisp.NIL;
	    this.$new_root_proofiness_map = Lisp.NIL;
	    this.$new_root_delay_map = Lisp.NIL;
	    this.$new_root_metrics_map = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$new_root_substrategy;
	}

	@Override
	public SubLObject getField3() {
	    return this.$transformation_substrategy;
	}

	@Override
	public SubLObject getField4() {
	    return this.$removal_substrategies;
	}

	@Override
	public SubLObject getField5() {
	    return this.$new_root_r_map;
	}

	@Override
	public SubLObject getField6() {
	    return this.$new_root_proofiness_map;
	}

	@Override
	public SubLObject getField7() {
	    return this.$new_root_delay_map;
	}

	@Override
	public SubLObject getField8() {
	    return this.$new_root_metrics_map;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$new_root_substrategy = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$transformation_substrategy = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$removal_substrategies = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$new_root_r_map = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return this.$new_root_proofiness_map = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return this.$new_root_delay_map = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return this.$new_root_metrics_map = value;
	}

	static {
	    structDecl = makeStructDeclNative($striping_tactician_data_native.class, STRIPING_TACTICIAN_DATA, STRIPING_TACTICIAN_DATA_P, $list4, $list5,
		    new String[] { "$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies", "$new_root_r_map", "$new_root_proofiness_map", "$new_root_delay_map", "$new_root_metrics_map" }, $list6, $list7, DEFAULT_STRUCT_PRINT_FUNCTION);
	}
    }

    public static final class $striping_tactician_data_p$UnaryFunction extends UnaryFunction {
	public $striping_tactician_data_p$UnaryFunction() {
	    super(extractFunctionNamed("STRIPING-TACTICIAN-DATA-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return striping_tactician_data_p(arg1);
	}
    }

    public static final class $new_root_metrics_native extends SubLStructNative {
	public SubLObject $start_inference_step_count;

	public SubLObject $index;

	public SubLObject $start_time;

	public SubLObject $time_to_first_answer;

	public SubLObject $steps_to_first_answer;

	public SubLObject $time_to_last_answer;

	public SubLObject $steps_to_last_answer;

	public SubLObject $answer_count;

	private static final SubLStructDeclNative structDecl;

	private $new_root_metrics_native() {
	    this.$start_inference_step_count = Lisp.NIL;
	    this.$index = Lisp.NIL;
	    this.$start_time = Lisp.NIL;
	    this.$time_to_first_answer = Lisp.NIL;
	    this.$steps_to_first_answer = Lisp.NIL;
	    this.$time_to_last_answer = Lisp.NIL;
	    this.$steps_to_last_answer = Lisp.NIL;
	    this.$answer_count = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$start_inference_step_count;
	}

	@Override
	public SubLObject getField3() {
	    return this.$index;
	}

	@Override
	public SubLObject getField4() {
	    return this.$start_time;
	}

	@Override
	public SubLObject getField5() {
	    return this.$time_to_first_answer;
	}

	@Override
	public SubLObject getField6() {
	    return this.$steps_to_first_answer;
	}

	@Override
	public SubLObject getField7() {
	    return this.$time_to_last_answer;
	}

	@Override
	public SubLObject getField8() {
	    return this.$steps_to_last_answer;
	}

	@Override
	public SubLObject getField9() {
	    return this.$answer_count;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$start_inference_step_count = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$index = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$start_time = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$time_to_first_answer = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return this.$steps_to_first_answer = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return this.$time_to_last_answer = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return this.$steps_to_last_answer = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return this.$answer_count = value;
	}

	static {
	    structDecl = makeStructDeclNative($new_root_metrics_native.class, NEW_ROOT_METRICS, NEW_ROOT_METRICS_P, $list64, $list65,
		    new String[] { "$start_inference_step_count", "$index", "$start_time", "$time_to_first_answer", "$steps_to_first_answer", "$time_to_last_answer", "$steps_to_last_answer", "$answer_count" }, $list66, $list67, DEFAULT_STRUCT_PRINT_FUNCTION);
	}
    }

    public static final class $new_root_metrics_p$UnaryFunction extends UnaryFunction {
	public $new_root_metrics_p$UnaryFunction() {
	    super(extractFunctionNamed("NEW-ROOT-METRICS-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return new_root_metrics_p(arg1);
	}
    }
}

/**
 * Total time: 672 ms
 */
