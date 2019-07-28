package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_datastructures_strategy extends SubLTranslatedFile {
    public static final SubLFile me = new inference_datastructures_strategy();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy";

    public static final String myFingerPrint = "acfc3b6e921153d7bd731030e625c4d800c4e3d0fee004e0fd0d73204ebf5fed";

    // defconstant
    public static final SubLSymbol $dtp_strategy$ = makeSymbol("*DTP-STRATEGY*");





    // defparameter
    private static final SubLSymbol $uninterestingness_cache_lookup_enabledP$ = makeSymbol("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*");

    // defconstant
    public static final SubLSymbol $dtp_problem_strategic_properties$ = makeSymbol("*DTP-PROBLEM-STRATEGIC-PROPERTIES*");

    // defconstant
    public static final SubLSymbol $dtp_tactic_strategic_properties$ = makeSymbol("*DTP-TACTIC-STRATEGIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $default_uninterestingness_cache_value$ = makeSymbol("*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*");



    public static final SubLSymbol STRATEGY_P = makeSymbol("STRATEGY-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("SUID"), makeSymbol("INFERENCE"), makeSymbol("RESULT-UNIQUENESS-CRITERION"), makeSymbol("ACTIVE-PROBLEMS"), makeSymbol("MOTIVATED-PROBLEMS"), makeSymbol("SET-ASIDE-PROBLEMS"), makeSymbol("SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("PRODUCTIVITY-LIMIT"), makeSymbol("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("PROOF-SPEC"), makeSymbol("PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("PROBLEM-STRATEGIC-INDEX"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("STEP-COUNT"), makeSymbol("TYPE"), makeSymbol("DATA") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SUID"), makeKeyword("INFERENCE"), makeKeyword("RESULT-UNIQUENESS-CRITERION"), makeKeyword("ACTIVE-PROBLEMS"), makeKeyword("MOTIVATED-PROBLEMS"), makeKeyword("SET-ASIDE-PROBLEMS"), makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PROOF-SPEC"), makeKeyword("PROBLEM-PROOF-SPEC-INDEX"), makeKeyword("PROBLEM-STRATEGIC-INDEX"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("STEP-COUNT"), makeKeyword("TYPE"), makeKeyword("DATA") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("STRAT-SUID"), makeSymbol("STRAT-INFERENCE"), makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION"), makeSymbol("STRAT-ACTIVE-PROBLEMS"), makeSymbol("STRAT-MOTIVATED-PROBLEMS"), makeSymbol("STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("STRAT-PRODUCTIVITY-LIMIT"), makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("STRAT-PROOF-SPEC"), makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX"), makeSymbol("STRAT-MEMOIZATION-STATE"), makeSymbol("STRAT-STEP-COUNT"), makeSymbol("STRAT-TYPE"), makeSymbol("STRAT-DATA") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-STRAT-SUID"), makeSymbol("_CSETF-STRAT-INFERENCE"), makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION"), makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS"), makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS"), makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT"), makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("_CSETF-STRAT-PROOF-SPEC"), makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX"), makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE"), makeSymbol("_CSETF-STRAT-STEP-COUNT"), makeSymbol("_CSETF-STRAT-TYPE"), makeSymbol("_CSETF-STRAT-DATA") });

    public static final SubLSymbol PRINT_STRATEGY = makeSymbol("PRINT-STRATEGY");

    public static final SubLSymbol STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRATEGY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STRATEGY-P"));

    private static final SubLSymbol STRAT_SUID = makeSymbol("STRAT-SUID");

    private static final SubLSymbol _CSETF_STRAT_SUID = makeSymbol("_CSETF-STRAT-SUID");

    private static final SubLSymbol STRAT_INFERENCE = makeSymbol("STRAT-INFERENCE");

    private static final SubLSymbol _CSETF_STRAT_INFERENCE = makeSymbol("_CSETF-STRAT-INFERENCE");

    private static final SubLSymbol STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION");

    private static final SubLSymbol _CSETF_STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION");

    private static final SubLSymbol STRAT_ACTIVE_PROBLEMS = makeSymbol("STRAT-ACTIVE-PROBLEMS");

    private static final SubLSymbol _CSETF_STRAT_ACTIVE_PROBLEMS = makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS");

    private static final SubLSymbol STRAT_MOTIVATED_PROBLEMS = makeSymbol("STRAT-MOTIVATED-PROBLEMS");

    private static final SubLSymbol _CSETF_STRAT_MOTIVATED_PROBLEMS = makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS");

    private static final SubLSymbol STRAT_SET_ASIDE_PROBLEMS = makeSymbol("STRAT-SET-ASIDE-PROBLEMS");

    private static final SubLSymbol _CSETF_STRAT_SET_ASIDE_PROBLEMS = makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS");

    private static final SubLSymbol $sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?");

    private static final SubLSymbol $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?");

    private static final SubLSymbol STRAT_PRODUCTIVITY_LIMIT = makeSymbol("STRAT-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol _CSETF_STRAT_PRODUCTIVITY_LIMIT = makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol _CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

    private static final SubLSymbol STRAT_PROOF_SPEC = makeSymbol("STRAT-PROOF-SPEC");

    private static final SubLSymbol _CSETF_STRAT_PROOF_SPEC = makeSymbol("_CSETF-STRAT-PROOF-SPEC");

    private static final SubLSymbol STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX");

    private static final SubLSymbol _CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX");

    private static final SubLSymbol STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX");

    private static final SubLSymbol _CSETF_STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX");

    private static final SubLSymbol STRAT_MEMOIZATION_STATE = makeSymbol("STRAT-MEMOIZATION-STATE");

    private static final SubLSymbol _CSETF_STRAT_MEMOIZATION_STATE = makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE");

    private static final SubLSymbol STRAT_STEP_COUNT = makeSymbol("STRAT-STEP-COUNT");

    private static final SubLSymbol _CSETF_STRAT_STEP_COUNT = makeSymbol("_CSETF-STRAT-STEP-COUNT");

    private static final SubLSymbol STRAT_TYPE = makeSymbol("STRAT-TYPE");

    private static final SubLSymbol _CSETF_STRAT_TYPE = makeSymbol("_CSETF-STRAT-TYPE");

    private static final SubLSymbol STRAT_DATA = makeSymbol("STRAT-DATA");

    private static final SubLSymbol _CSETF_STRAT_DATA = makeSymbol("_CSETF-STRAT-DATA");





    private static final SubLSymbol $RESULT_UNIQUENESS_CRITERION = makeKeyword("RESULT-UNIQUENESS-CRITERION");





    private static final SubLSymbol $SET_ASIDE_PROBLEMS = makeKeyword("SET-ASIDE-PROBLEMS");

    private static final SubLSymbol $kw47$SHOULD_RECONSIDER_SET_ASIDES_ = makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?");



    private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");



    private static final SubLSymbol $PROBLEM_PROOF_SPEC_INDEX = makeKeyword("PROBLEM-PROOF-SPEC-INDEX");

    private static final SubLSymbol $PROBLEM_STRATEGIC_INDEX = makeKeyword("PROBLEM-STRATEGIC-INDEX");









    private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_STRATEGY = makeSymbol("MAKE-STRATEGY");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD");



    private static final SubLString $str64$_Invalid_STRATEGY__s_ = makeString("<Invalid STRATEGY ~s>");

    private static final SubLString $str65$__a_STRATEGY__a__a_for_inference_ = makeString("<~a STRATEGY ~a.~a for inference ~a.~a>");

    private static final SubLSymbol SXHASH_STRATEGY_METHOD = makeSymbol("SXHASH-STRATEGY-METHOD");

    private static final SubLSymbol STRATEGY_TYPE_P = makeSymbol("STRATEGY-TYPE-P");



    private static final SubLString $$$strategy_memoization_state = makeString("strategy memoization state");



    private static final SubLSymbol STRATEGY_ACTIVE_PROBLEMS = makeSymbol("STRATEGY-ACTIVE-PROBLEMS");

    private static final SubLSymbol DO_STRATEGY_ACTIVE_PROBLEMS = makeSymbol("DO-STRATEGY-ACTIVE-PROBLEMS");

    private static final SubLSymbol STRATEGY_MOTIVATED_PROBLEMS = makeSymbol("STRATEGY-MOTIVATED-PROBLEMS");

    private static final SubLSymbol DO_STRATEGY_MOTIVATED_PROBLEMS = makeSymbol("DO-STRATEGY-MOTIVATED-PROBLEMS");

    private static final SubLSymbol STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol("STRATEGY-SET-ASIDE-PROBLEMS");

    private static final SubLSymbol DO_STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol("DO-STRATEGY-SET-ASIDE-PROBLEMS");

    private static final SubLSymbol RESULT_UNIQUENESS_CRITERION_P = makeSymbol("RESULT-UNIQUENESS-CRITERION-P");

    private static final SubLSymbol PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");

    private static final SubLSymbol PROOF_SPEC_P = makeSymbol("PROOF-SPEC-P");

    private static final SubLList $list80 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list81 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLList $list86 = list(makeSymbol("STRATEGY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym87$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");

    private static final SubLSymbol $sym88$STATE_VAR = makeUninternedSymbol("STATE-VAR");



    private static final SubLSymbol STRATEGY_MEMOIZATION_STATE = makeSymbol("STRATEGY-MEMOIZATION-STATE");

    public static final SubLSymbol $current_strategy_wrt_memoization$ = makeSymbol("*CURRENT-STRATEGY-WRT-MEMOIZATION*");



    private static final SubLSymbol WITH_STRATEGY_MEMOIZATION_STATE = makeSymbol("WITH-STRATEGY-MEMOIZATION-STATE");

    private static final SubLSymbol CURRENT_STRATEGY_WRT_MEMOIZATION = makeSymbol("CURRENT-STRATEGY-WRT-MEMOIZATION");

    private static final SubLSymbol VALID_PROBLEM_P = makeSymbol("VALID-PROBLEM-P");









    private static final SubLSymbol STRATEGY_PROPERTY_P = makeSymbol("STRATEGY-PROPERTY-P");

    private static final SubLString $str101$Unexpected_strategy_property__s_w = makeString("Unexpected strategy property ~s with value ~s");

    private static final SubLSymbol STRATEGY_PROPERTIES_P = makeSymbol("STRATEGY-PROPERTIES-P");

    private static final SubLSymbol $SUBSTRATEGY_STRATEGEM_MOTIVATED = makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");

    private static final SubLList $list104 = list(list(makeSymbol("STRATEGY"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym105$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");

    private static final SubLSymbol $sym106$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");

    private static final SubLSymbol STRATEGY_NOTE_PROBLEM_ACTIVE = makeSymbol("STRATEGY-NOTE-PROBLEM-ACTIVE");

    private static final SubLSymbol STRATEGY_NOTE_PROBLEM_INACTIVE = makeSymbol("STRATEGY-NOTE-PROBLEM-INACTIVE");

    private static final SubLSymbol POSSIBLY_REACTIVATE_PROBLEM = makeSymbol("POSSIBLY-REACTIVATE-PROBLEM");



    private static final SubLString $str111$balancing_tactician_does_not_impl = makeString("balancing tactician does not implement ~a");

    private static final SubLString $str112$Unexpected_strategy_type__a = makeString("Unexpected strategy type ~a");

    private static final SubLSymbol $strategy_type_store$ = makeSymbol("*STRATEGY-TYPE-STORE*");



    private static final SubLSymbol STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");



    private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES");

    private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_P = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P");

    private static final SubLList $list119 = list(makeSymbol("STATUS"), makeSymbol("TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("POSSIBLE-TACTIC-COUNT"), makeSymbol("UNINTERESTINGNESS"));

    private static final SubLList $list120 = list(makeKeyword("STATUS"), makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX"), makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("UNINTERESTINGNESS"));

    private static final SubLList $list121 = list(makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS"), makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"), makeSymbol("PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

    private static final SubLList $list122 = list(makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS"), makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"), makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));



    private static final SubLSymbol PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list125 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P"));

    private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS");

    private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS");

    private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");

    private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");

    private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");

    private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");

    private static final SubLSymbol PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol("PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");

    private static final SubLSymbol _CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");



    private static final SubLSymbol $TACTIC_STRATEGIC_PROPERTY_INDEX = makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX");

    private static final SubLSymbol $POSSIBLE_TACTIC_COUNT = makeKeyword("POSSIBLE-TACTIC-COUNT");



    private static final SubLSymbol MAKE_PROBLEM_STRATEGIC_PROPERTIES = makeSymbol("MAKE-PROBLEM-STRATEGIC-PROPERTIES");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD");











    private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");

    private static final SubLString $str146$poking_good_status__s_into_proble = makeString("poking good status ~s into problem ~s wrt strategy ~s");

    private static final SubLSymbol $POSSIBLE_NO_GOOD = makeKeyword("POSSIBLE-NO-GOOD");

    private static final SubLString $str148$_possible_no_good__s_wrt__s = makeString(":possible-no-good ~s wrt ~s");







    private static final SubLSymbol UNINTERESTINGNESS_CACHE_VALUE_P = makeSymbol("UNINTERESTINGNESS-CACHE-VALUE-P");



    private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES = makeSymbol("TACTIC-STRATEGIC-PROPERTIES");

    private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_P = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P");

    private static final SubLList $list156 = list(makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("UNINTERESTINGNESS"));

    private static final SubLList $list157 = list(makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("UNINTERESTINGNESS"));

    private static final SubLList $list158 = list(makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"), makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), makeSymbol("TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

    private static final SubLList $list159 = list(makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"), makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS"));

    private static final SubLSymbol TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list161 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P"));

    private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");

    private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");

    private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");

    private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");

    private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");

    private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");

    private static final SubLSymbol TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol("TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");

    private static final SubLSymbol _CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS");



    private static final SubLSymbol $PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");



    private static final SubLSymbol MAKE_TACTIC_STRATEGIC_PROPERTIES = makeSymbol("MAKE-TACTIC-STRATEGIC-PROPERTIES");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD");

    private static final SubLString $str175$ = makeString("");





    private static final SubLString $str178$structural_tactic__s_cannot_have_ = makeString("structural tactic ~s cannot have a completeness");

    private static final SubLString $str179$content_tactic__s_cannot_have_a_p = makeString("content tactic ~s cannot have a preference level");

    private static final SubLString $str180$content_tactic__s_cannot_have_a_p = makeString("content tactic ~s cannot have a preference level justification");

    private static final SubLSymbol GENERALIZED_CONJUNCTIVE_TACTIC_P = makeSymbol("GENERALIZED-CONJUNCTIVE-TACTIC-P");



    private static final SubLSymbol PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");

    private static final SubLSymbol UNINTERESTINGNESS_CACHE_CONDITIONS_P = makeSymbol("UNINTERESTINGNESS-CACHE-CONDITIONS-P");





    public static SubLObject strategy_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_strategy(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject strategy_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_strategy.$strategy_native.class ? T : NIL;
    }

    public static SubLObject strat_suid(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject strat_inference(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject strat_result_uniqueness_criterion(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject strat_active_problems(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject strat_motivated_problems(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject strat_set_aside_problems(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject strat_should_reconsider_set_asidesP(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject strat_productivity_limit(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject strat_removal_backtracking_productivity_limit(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject strat_proof_spec(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject strat_problem_proof_spec_index(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject strat_problem_strategic_index(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject strat_memoization_state(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField14();
    }

    public static SubLObject strat_step_count(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField15();
    }

    public static SubLObject strat_type(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField16();
    }

    public static SubLObject strat_data(final SubLObject v_object) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.getField17();
    }

    public static SubLObject _csetf_strat_suid(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_strat_inference(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_strat_result_uniqueness_criterion(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_strat_active_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_strat_motivated_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_strat_set_aside_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_strat_should_reconsider_set_asidesP(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_strat_productivity_limit(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_strat_removal_backtracking_productivity_limit(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_strat_proof_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_strat_problem_proof_spec_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_strat_problem_strategic_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_strat_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_strat_step_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_strat_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_strat_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != strategy_p(v_object) : "inference_datastructures_strategy.strategy_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(v_object) " + v_object;
        return v_object.setField17(value);
    }

    public static SubLObject make_strategy(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_strategy.$strategy_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_strat_suid(v_new, current_value);
            } else
                if (pcase_var.eql($INFERENCE)) {
                    _csetf_strat_inference(v_new, current_value);
                } else
                    if (pcase_var.eql($RESULT_UNIQUENESS_CRITERION)) {
                        _csetf_strat_result_uniqueness_criterion(v_new, current_value);
                    } else
                        if (pcase_var.eql($ACTIVE_PROBLEMS)) {
                            _csetf_strat_active_problems(v_new, current_value);
                        } else
                            if (pcase_var.eql($MOTIVATED_PROBLEMS)) {
                                _csetf_strat_motivated_problems(v_new, current_value);
                            } else
                                if (pcase_var.eql($SET_ASIDE_PROBLEMS)) {
                                    _csetf_strat_set_aside_problems(v_new, current_value);
                                } else
                                    if (pcase_var.eql($kw47$SHOULD_RECONSIDER_SET_ASIDES_)) {
                                        _csetf_strat_should_reconsider_set_asidesP(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PRODUCTIVITY_LIMIT)) {
                                            _csetf_strat_productivity_limit(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
                                                _csetf_strat_removal_backtracking_productivity_limit(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PROOF_SPEC)) {
                                                    _csetf_strat_proof_spec(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($PROBLEM_PROOF_SPEC_INDEX)) {
                                                        _csetf_strat_problem_proof_spec_index(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($PROBLEM_STRATEGIC_INDEX)) {
                                                            _csetf_strat_problem_strategic_index(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($MEMOIZATION_STATE)) {
                                                                _csetf_strat_memoization_state(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($STEP_COUNT)) {
                                                                    _csetf_strat_step_count(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($TYPE)) {
                                                                        _csetf_strat_type(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($DATA)) {
                                                                            _csetf_strat_data(v_new, current_value);
                                                                        } else {
                                                                            Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                                                                        }















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_strategy(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_STRATEGY, SIXTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUID, strat_suid(obj));
        funcall(visitor_fn, obj, $SLOT, $INFERENCE, strat_inference(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT_UNIQUENESS_CRITERION, strat_result_uniqueness_criterion(obj));
        funcall(visitor_fn, obj, $SLOT, $ACTIVE_PROBLEMS, strat_active_problems(obj));
        funcall(visitor_fn, obj, $SLOT, $MOTIVATED_PROBLEMS, strat_motivated_problems(obj));
        funcall(visitor_fn, obj, $SLOT, $SET_ASIDE_PROBLEMS, strat_set_aside_problems(obj));
        funcall(visitor_fn, obj, $SLOT, $kw47$SHOULD_RECONSIDER_SET_ASIDES_, strat_should_reconsider_set_asidesP(obj));
        funcall(visitor_fn, obj, $SLOT, $PRODUCTIVITY_LIMIT, strat_productivity_limit(obj));
        funcall(visitor_fn, obj, $SLOT, $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, strat_removal_backtracking_productivity_limit(obj));
        funcall(visitor_fn, obj, $SLOT, $PROOF_SPEC, strat_proof_spec(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_PROOF_SPEC_INDEX, strat_problem_proof_spec_index(obj));
        funcall(visitor_fn, obj, $SLOT, $PROBLEM_STRATEGIC_INDEX, strat_problem_strategic_index(obj));
        funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, strat_memoization_state(obj));
        funcall(visitor_fn, obj, $SLOT, $STEP_COUNT, strat_step_count(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, strat_type(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, strat_data(obj));
        funcall(visitor_fn, obj, $END, MAKE_STRATEGY, SIXTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_strategy_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_strategy(obj, visitor_fn);
    }

    public static SubLObject valid_strategy_p(final SubLObject v_object) {
        return makeBoolean((NIL != strategy_p(v_object)) && (NIL == strategy_invalid_p(v_object)));
    }

    public static SubLObject strategy_invalid_p(final SubLObject strategy) {
        return eq($FREE, strategy_type(strategy));
    }

    public static SubLObject print_strategy(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != strategy_invalid_p(v_object)) {
            format(stream, $str64$_Invalid_STRATEGY__s_, strat_suid(v_object));
        } else {
            final SubLObject strategy_type = strategy_type(v_object);
            final SubLObject strategy_id = strategy_suid(v_object);
            final SubLObject inference = strategy_inference(v_object);
            final SubLObject inference_id = (NIL != inference) ? inference_datastructures_inference.inference_suid(inference) : NIL;
            final SubLObject store = (NIL != inference) ? inference_datastructures_inference.inference_problem_store(inference) : NIL;
            final SubLObject store_id = (NIL != store) ? inference_datastructures_problem_store.problem_store_suid(store) : NIL;
            format(stream, $str65$__a_STRATEGY__a__a_for_inference_, new SubLObject[]{ strategy_type, store_id, strategy_id, store_id, inference_id });
        }
        return NIL;
    }

    public static SubLObject sxhash_strategy_method(final SubLObject v_object) {
        return strat_suid(v_object);
    }

    public static SubLObject new_strategy(final SubLObject type, final SubLObject inference) {
        assert NIL != strategy_type_p(type) : "inference_datastructures_strategy.strategy_type_p(type) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_type_p(type) " + type;
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_strategy_id(store);
        final SubLObject strategy = make_strategy(UNPROVIDED);
        _csetf_strat_suid(strategy, suid);
        _csetf_strat_inference(strategy, inference);
        _csetf_strat_result_uniqueness_criterion(strategy, NIL);
        _csetf_strat_active_problems(strategy, set.new_set(symbol_function(EQ), UNPROVIDED));
        _csetf_strat_motivated_problems(strategy, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
        _csetf_strat_set_aside_problems(strategy, set.new_set(symbol_function(EQ), UNPROVIDED));
        _csetf_strat_problem_proof_spec_index(strategy, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
        _csetf_strat_productivity_limit(strategy, inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue());
        _csetf_strat_removal_backtracking_productivity_limit(strategy, inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue());
        _csetf_strat_proof_spec(strategy, inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue());
        _csetf_strat_problem_strategic_index(strategy, make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED));
        _csetf_strat_memoization_state(strategy, memoization_state.new_memoization_state($$$strategy_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_strat_step_count(strategy, ZERO_INTEGER);
        _csetf_strat_type(strategy, type);
        _csetf_strat_data(strategy, NIL);
        final SubLObject subconstructor = strategy_type_property(type, $CONSTRUCTOR);
        funcall(subconstructor, strategy);
        inference_datastructures_problem_store.add_problem_store_strategy(store, strategy);
        inference_datastructures_inference.add_inference_strategy(inference, strategy);
        return strategy;
    }

    public static SubLObject destroy_strategy(final SubLObject strategy) {
        if (NIL != valid_strategy_p(strategy)) {
            note_strategy_invalid(strategy);
            inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy), strategy);
            inference_datastructures_inference.remove_inference_strategy(strategy_inference(strategy), strategy);
            return destroy_strategy_int(strategy);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_store_strategy(final SubLObject strategy) {
        if (NIL != valid_strategy_p(strategy)) {
            note_strategy_invalid(strategy);
            return destroy_strategy_int(strategy);
        }
        return NIL;
    }

    public static SubLObject destroy_inference_strategy(final SubLObject strategy) {
        if (NIL != valid_strategy_p(strategy)) {
            note_strategy_invalid(strategy);
            inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy), strategy);
            return destroy_strategy_int(strategy);
        }
        return NIL;
    }

    public static SubLObject destroy_strategy_int(final SubLObject strategy) {
        _csetf_strat_data(strategy, $FREE);
        _csetf_strat_proof_spec(strategy, $FREE);
        _csetf_strat_removal_backtracking_productivity_limit(strategy, $FREE);
        _csetf_strat_productivity_limit(strategy, $FREE);
        _csetf_strat_should_reconsider_set_asidesP(strategy, $FREE);
        memoization_state.clear_all_memoization(strategy_memoization_state(strategy));
        _csetf_strat_memoization_state(strategy, $FREE);
        dictionary.clear_dictionary(strat_problem_proof_spec_index(strategy));
        _csetf_strat_problem_proof_spec_index(strategy, $FREE);
        clrhash(strat_problem_strategic_index(strategy));
        _csetf_strat_problem_strategic_index(strategy, $FREE);
        set.clear_set(strat_set_aside_problems(strategy));
        _csetf_strat_set_aside_problems(strategy, $FREE);
        set.clear_set(strat_active_problems(strategy));
        _csetf_strat_active_problems(strategy, $FREE);
        set_contents.clear_set_contents(strat_motivated_problems(strategy));
        _csetf_strat_motivated_problems(strategy, $FREE);
        _csetf_strat_result_uniqueness_criterion(strategy, $FREE);
        _csetf_strat_inference(strategy, $FREE);
        return NIL;
    }

    public static SubLObject note_strategy_invalid(final SubLObject strategy) {
        _csetf_strat_type(strategy, $FREE);
        return strategy;
    }

    public static SubLObject remove_strategy_problem(final SubLObject strategy, final SubLObject problem) {
        strategy_note_problem_inactive(strategy, problem);
        strategy_note_problem_unmotivated(strategy, problem);
        strategy_clear_problem_set_aside(strategy, problem);
        remove_problem_strategic_properties(problem, strategy);
        return NIL;
    }

    public static SubLObject strategy_suid(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_suid(strategy);
    }

    public static SubLObject strategy_inference(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_inference(strategy);
    }

    public static SubLObject strategy_local_result_uniqueness_criterion(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_result_uniqueness_criterion(strategy);
    }

    public static SubLObject strategy_problem_strategic_index(final SubLObject strategy) {
        return strat_problem_strategic_index(strategy);
    }

    public static SubLObject strategy_type(final SubLObject strategy) {
        return strat_type(strategy);
    }

    public static SubLObject strategy_data(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_data(strategy);
    }

    public static SubLObject strategy_active_problems(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_active_problems(strategy);
    }

    public static SubLObject strategy_motivated_problems(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_motivated_problems(strategy);
    }

    public static SubLObject strategy_set_aside_problems(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_set_aside_problems(strategy);
    }

    public static SubLObject strategy_should_reconsider_set_asidesP(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_should_reconsider_set_asidesP(strategy);
    }

    public static SubLObject strategy_productivity_limit(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_productivity_limit(strategy);
    }

    public static SubLObject strategy_removal_backtracking_productivity_limit(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_removal_backtracking_productivity_limit(strategy);
    }

    public static SubLObject strategy_proof_spec(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_proof_spec(strategy);
    }

    public static SubLObject strategy_problem_proof_spec_index(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_problem_proof_spec_index(strategy);
    }

    public static SubLObject strategy_step_count(final SubLObject strategy) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        return strat_step_count(strategy);
    }

    public static SubLObject set_strategy_result_uniqueness_criterion(final SubLObject strategy, final SubLObject result_uniqueness_criterion) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) : "inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.result_uniqueness_criterion_p(result_uniqueness_criterion) " + result_uniqueness_criterion;
        _csetf_strat_result_uniqueness_criterion(strategy, result_uniqueness_criterion);
        return strategy;
    }

    public static SubLObject set_strategy_productivity_limit(final SubLObject strategy, final SubLObject productivity_limit) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) : "inference_datastructures_enumerated_types.productivity_p(productivity_limit) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) " + productivity_limit;
        _csetf_strat_productivity_limit(strategy, productivity_limit);
        return strategy;
    }

    public static SubLObject set_strategy_removal_backtracking_productivity_limit(final SubLObject strategy, final SubLObject productivity_limit) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) : "inference_datastructures_enumerated_types.productivity_p(productivity_limit) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_limit) " + productivity_limit;
        _csetf_strat_removal_backtracking_productivity_limit(strategy, productivity_limit);
        return strategy;
    }

    public static SubLObject set_strategy_proof_spec(final SubLObject strategy, final SubLObject proof_spec) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != inference_proof_spec.proof_spec_p(proof_spec) : "inference_proof_spec.proof_spec_p(proof_spec) " + "CommonSymbols.NIL != inference_proof_spec.proof_spec_p(proof_spec) " + proof_spec;
        _csetf_strat_proof_spec(strategy, proof_spec);
        return strategy;
    }

    public static SubLObject set_strategy_data(final SubLObject strategy, final SubLObject data) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        _csetf_strat_data(strategy, data);
        return strategy;
    }

    public static SubLObject do_strategy_active_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list80);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list80);
            if (NIL == member(current_$1, $list81, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list80);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(problem_var, list(STRATEGY_ACTIVE_PROBLEMS, strategy), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_strategy_motivated_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list80);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list80);
            if (NIL == member(current_$2, $list81, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list80);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET_CONTENTS, list(problem_var, list(STRATEGY_MOTIVATED_PROBLEMS, strategy), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_strategy_set_aside_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_var = NIL;
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        strategy = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list80);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list80);
            if (NIL == member(current_$3, $list81, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list80);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(problem_var, list(STRATEGY_SET_ASIDE_PROBLEMS, strategy), $DONE, done), append(body, NIL));
    }

    public static SubLObject with_strategy_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, $list86);
        strategy = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject strategy_var = $sym87$STRATEGY_VAR;
        final SubLObject state_var = $sym88$STATE_VAR;
        return list(CLET, list(list(strategy_var, strategy), list(state_var, list(STRATEGY_MEMOIZATION_STATE, strategy_var)), list($current_strategy_wrt_memoization$, strategy_var)), listS(WITH_MEMOIZATION_STATE, list(state_var), append(body, NIL)));
    }

    public static SubLObject strategy_memoization_state(final SubLObject strategy) {
        return strat_memoization_state(strategy);
    }

    public static SubLObject current_strategy_wrt_memoization() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_strategy_wrt_memoization$.getDynamicValue(thread);
    }

    public static SubLObject strategic_context_inference(final SubLObject strategic_context) {
        return NIL != strategy_p(strategic_context) ? strategy_inference(strategic_context) : NIL;
    }

    public static SubLObject strategy_answer_link(final SubLObject strategy) {
        return inference_datastructures_inference.inference_root_link(strategy_inference(strategy));
    }

    public static SubLObject strategy_answer_link_propagatedP(final SubLObject strategy) {
        return inference_worker_answer.answer_link_propagatedP(strategy_answer_link(strategy));
    }

    public static SubLObject strategy_should_propagate_answer_linkP(final SubLObject strategy) {
        if (NIL != strategy_answer_link_propagatedP(strategy)) {
            return NIL;
        }
        if ((NIL != inference_worker.inference_deems_answer_link_should_be_closedP(strategy_inference(strategy), strategy_answer_link(strategy))) && (NIL != inference_datastructures_inference.inference_has_some_answerP(strategy_inference(strategy)))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject strategy_root_problem(final SubLObject strategy) {
        return inference_datastructures_inference.inference_root_problem(strategy_inference(strategy));
    }

    public static SubLObject strategy_continuableP(final SubLObject strategy) {
        return inference_datastructures_inference.inference_continuableP(strategy_inference(strategy));
    }

    public static SubLObject problem_active_in_strategyP(final SubLObject problem, final SubLObject strategy) {
        return set.set_memberP(problem, strategy_active_problems(strategy));
    }

    public static SubLObject problem_motivatedP(final SubLObject problem, final SubLObject strategy) {
        return set_contents.set_contents_memberP(problem, strategy_motivated_problems(strategy), symbol_function(EQ));
    }

    public static SubLObject problem_set_aside_in_strategyP(final SubLObject problem, final SubLObject strategy) {
        return set.set_memberP(problem, strategy_set_aside_problems(strategy));
    }

    public static SubLObject strategy_has_some_set_aside_problemsP(final SubLObject strategy) {
        return makeBoolean(NIL == set.set_emptyP(strategy_set_aside_problems(strategy)));
    }

    public static SubLObject strategy_all_valid_set_aside_problems(final SubLObject strategy) {
        return list_utilities.delete_if_not(VALID_PROBLEM_P, set.set_element_list(strategy_set_aside_problems(strategy)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_problem_store(final SubLObject strategy) {
        return inference_datastructures_inference.inference_problem_store(strategy_inference(strategy));
    }

    public static SubLObject strategy_result_uniqueness_criterion(final SubLObject strategy) {
        final SubLObject local_criterion = strategy_local_result_uniqueness_criterion(strategy);
        if (NIL != local_criterion) {
            return local_criterion;
        }
        final SubLObject inference = strategy_inference(strategy);
        return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
    }

    public static SubLObject strategy_unique_wrt_proofsP(final SubLObject strategy) {
        return eq($PROOF, strategy_result_uniqueness_criterion(strategy));
    }

    public static SubLObject strategy_unique_wrt_bindingsP(final SubLObject strategy) {
        return eq($BINDINGS, strategy_result_uniqueness_criterion(strategy));
    }

    public static SubLObject strategy_wants_one_answerP(final SubLObject strategy) {
        return NIL;
    }

    public static SubLObject strategy_active_problem_count(final SubLObject strategy) {
        return set.set_size(strategy_active_problems(strategy));
    }

    public static SubLObject strategy_motivated_problem_count(final SubLObject strategy) {
        return set_contents.set_contents_size(strategy_motivated_problems(strategy));
    }

    public static SubLObject strategy_set_aside_problem_count(final SubLObject strategy) {
        return set.set_size(strategy_set_aside_problems(strategy));
    }

    public static SubLObject strategy_problem_proof_spec(final SubLObject strategy, final SubLObject problem) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return dictionary.dictionary_lookup_without_values(strategy_problem_proof_spec_index(strategy), problem, $ANYTHING);
    }

    public static SubLObject set_strategy_property(final SubLObject strategy, final SubLObject property, final SubLObject value) {
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_enumerated_types.strategy_property_p(property) : "inference_datastructures_enumerated_types.strategy_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_property_p(property) " + property;
        if (property.eql($PRODUCTIVITY_LIMIT)) {
            set_strategy_productivity_limit(strategy, value);
        } else
            if (property.eql($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
                set_strategy_removal_backtracking_productivity_limit(strategy, value);
            } else
                if (property.eql($PROOF_SPEC)) {
                    set_strategy_proof_spec(strategy, value);
                } else {
                    Errors.error($str101$Unexpected_strategy_property__s_w, property, value);
                }


        return strategy;
    }

    public static SubLObject copy_strategy_properties(final SubLObject source_strategy, final SubLObject target_strategy) {
        set_strategy_productivity_limit(target_strategy, strategy_productivity_limit(source_strategy));
        set_strategy_removal_backtracking_productivity_limit(target_strategy, strategy_removal_backtracking_productivity_limit(source_strategy));
        set_strategy_proof_spec(target_strategy, strategy_proof_spec(source_strategy));
        return target_strategy;
    }

    public static SubLObject set_strategy_properties(final SubLObject strategy, final SubLObject strategy_properties) {
        assert NIL != inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) : "inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_properties_p(strategy_properties) " + strategy_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = strategy_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            set_strategy_property(strategy, property, value);
        }
        return strategy;
    }

    public static SubLObject strategy_note_problem_active(final SubLObject strategy, final SubLObject problem) {
        set.set_add(problem, strategy_active_problems(strategy));
        return strategy;
    }

    public static SubLObject strategy_note_problem_inactive(final SubLObject strategy, final SubLObject problem) {
        set.set_remove(problem, strategy_active_problems(strategy));
        return strategy;
    }

    public static SubLObject strategy_note_problem_motivated(final SubLObject strategy, final SubLObject problem) {
        final SubLObject motivated_problems = strategy_motivated_problems(strategy);
        _csetf_strat_motivated_problems(strategy, set_contents.set_contents_add(problem, motivated_problems, symbol_function(EQ)));
        controlling_strategy_callback(strategy, $SUBSTRATEGY_STRATEGEM_MOTIVATED, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return strategy;
    }

    public static SubLObject strategy_note_problem_unmotivated(final SubLObject strategy, final SubLObject problem) {
        set_contents.set_contents_delete(problem, strategy_motivated_problems(strategy), symbol_function(EQ));
        return strategy;
    }

    public static SubLObject strategy_note_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
        set.set_add(problem, strategy_set_aside_problems(strategy));
        return strategy;
    }

    public static SubLObject strategy_clear_problem_set_aside(final SubLObject strategy, final SubLObject problem) {
        set.set_remove(problem, strategy_set_aside_problems(strategy));
        return strategy;
    }

    public static SubLObject strategy_clear_set_asides(final SubLObject strategy) {
        set.clear_set(strategy_set_aside_problems(strategy));
        return strategy;
    }

    public static SubLObject note_strategy_should_reconsider_set_asides(final SubLObject strategy) {
        _csetf_strat_should_reconsider_set_asidesP(strategy, T);
        return strategy;
    }

    public static SubLObject clear_strategy_should_reconsider_set_asides(final SubLObject strategy) {
        _csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
        return strategy;
    }

    public static SubLObject with_strategically_active_problem(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list104);
        strategy = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject strategy_var = $sym105$STRATEGY_VAR;
            final SubLObject problem_var = $sym106$PROBLEM_VAR;
            return listS(CLET, list(list(strategy_var, strategy), list(problem_var, problem)), list(STRATEGY_NOTE_PROBLEM_ACTIVE, strategy_var, problem_var), append(body, list(list(STRATEGY_NOTE_PROBLEM_INACTIVE, strategy_var, problem_var), list(POSSIBLY_REACTIVATE_PROBLEM, strategy_var, problem_var))));
        }
        cdestructuring_bind_error(datum, $list104);
        return NIL;
    }

    public static SubLObject strategy_note_problem_proof_spec(final SubLObject strategy, final SubLObject problem, final SubLObject proof_spec) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        final SubLObject old_value = dictionary.dictionary_lookup_without_values(strategy_problem_proof_spec_index(strategy), problem, $NOTHING);
        final SubLObject new_value = inference_proof_spec.merge_2_proof_specs(old_value, proof_spec);
        if (!new_value.equal(old_value)) {
            dictionary.dictionary_enter(strategy_problem_proof_spec_index(strategy), problem, new_value);
            set_problem_recompute_thrown_away(problem, strategy);
            return T;
        }
        return NIL;
    }

    public static SubLObject increment_strategy_step_count(final SubLObject strategy) {
        SubLObject step_count = strat_step_count(strategy);
        step_count = add(step_count, ONE_INTEGER);
        _csetf_strat_step_count(strategy, step_count);
        return step_count;
    }

    public static SubLObject strategy_dispatch(final SubLObject strategy, final SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        final SubLObject arg1_providedP = makeBoolean(arg1 != UNPROVIDED);
        final SubLObject arg2_providedP = makeBoolean(arg2 != UNPROVIDED);
        final SubLObject arg3_providedP = makeBoolean(arg3 != UNPROVIDED);
        final SubLObject arg4_providedP = makeBoolean(arg4 != UNPROVIDED);
        final SubLObject arg5_providedP = makeBoolean(arg5 != UNPROVIDED);
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        SubLObject handler_func = strategy_dispatch_handler(strategy, method_type);
        if (NIL == handler_func) {
            handler_func = inference_datastructures_enumerated_types.strategy_default_method_handler(method_type);
        }
        if ((NIL == handler_func) && (NIL != balancing_tactician.balancing_tactician_p(strategy))) {
            return Errors.error($str111$balancing_tactician_does_not_impl, method_type);
        }
        if (NIL != arg5_providedP) {
            return strategy_dispatch_funcall_5(handler_func, strategy, arg1, arg2, arg3, arg4, arg5);
        }
        if (NIL != arg4_providedP) {
            return strategy_dispatch_funcall_4(handler_func, strategy, arg1, arg2, arg3, arg4);
        }
        if (NIL != arg3_providedP) {
            return strategy_dispatch_funcall_3(handler_func, strategy, arg1, arg2, arg3);
        }
        if (NIL != arg2_providedP) {
            return strategy_dispatch_funcall_2(handler_func, strategy, arg1, arg2);
        }
        if (NIL != arg1_providedP) {
            return strategy_dispatch_funcall_1(handler_func, strategy, arg1);
        }
        return strategy_dispatch_funcall_0(handler_func, strategy);
    }

    public static SubLObject strategy_dispatch_handler(final SubLObject strategy, final SubLObject method_type) {
        final SubLObject strategy_type = strategy_type(strategy);
        return inference_tactician.strategy_type_dispatch_handler(strategy_type, method_type);
    }

    public static SubLObject strategy_dispatch_funcall_0(final SubLObject func, final SubLObject strategy) {
        return funcall(func, strategy);
    }

    public static SubLObject strategy_dispatch_funcall_1(final SubLObject func, final SubLObject strategy, final SubLObject arg1) {
        return funcall(func, strategy, arg1);
    }

    public static SubLObject strategy_dispatch_funcall_2(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2) {
        return funcall(func, strategy, arg1, arg2);
    }

    public static SubLObject strategy_dispatch_funcall_3(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        return funcall(func, strategy, arg1, arg2, arg3);
    }

    public static SubLObject strategy_dispatch_funcall_4(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        return funcall(func, strategy, arg1, arg2, arg3, arg4);
    }

    public static SubLObject strategy_dispatch_funcall_5(final SubLObject func, final SubLObject strategy, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        return funcall(func, strategy, arg1, arg2, arg3, arg4, arg5);
    }

    public static SubLObject strategy_dispatch_unexpected_strategy_type_error(final SubLObject strategy) {
        return Errors.error($str112$Unexpected_strategy_type__a, strategy);
    }

    public static SubLObject controlling_strategy_callback(final SubLObject substrategy, final SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        final SubLObject arg1_providedP = makeBoolean(arg1 != UNPROVIDED);
        final SubLObject arg2_providedP = makeBoolean(arg2 != UNPROVIDED);
        final SubLObject arg3_providedP = makeBoolean(arg3 != UNPROVIDED);
        final SubLObject arg4_providedP = makeBoolean(arg4 != UNPROVIDED);
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLObject controlling_strategy = inference_tactician.controlling_strategy(substrategy);
        if (substrategy.eql(controlling_strategy)) {
            return NIL;
        }
        if (NIL != arg4_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, arg4);
        }
        if (NIL != arg3_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, UNPROVIDED);
        }
        if (NIL != arg2_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != arg1_providedP) {
            return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return strategy_dispatch(controlling_strategy, method_type, substrategy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_type_p(final SubLObject v_object) {
        return dictionary.dictionary_lookup($strategy_type_store$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static SubLObject new_strategy_type(final SubLObject type, final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        deregister_strategy_type(type);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            set_strategy_type_property(type, property, value);
        }
        return type;
    }

    public static SubLObject deregister_strategy_type(final SubLObject type) {
        return dictionary.dictionary_remove($strategy_type_store$.getGlobalValue(), type);
    }

    public static SubLObject clear_strategy_type_store() {
        dictionary.clear_dictionary($strategy_type_store$.getGlobalValue());
        return NIL;
    }

    public static SubLObject strategy_type_property(final SubLObject type, final SubLObject property) {
        return dictionary_utilities.dictionary_getf($strategy_type_store$.getGlobalValue(), type, property, UNPROVIDED);
    }

    public static SubLObject set_strategy_type_property(final SubLObject type, final SubLObject property, final SubLObject value) {
        assert NIL != inference_datastructures_enumerated_types.strategy_type_property_p(property) : "inference_datastructures_enumerated_types.strategy_type_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.strategy_type_property_p(property) " + property;
        return dictionary_utilities.dictionary_putf($strategy_type_store$.getGlobalValue(), type, property, value);
    }

    public static SubLObject default_uninterestingness_cache_value() {
        return make_vector(TWO_INTEGER, $RECOMPUTE);
    }

    public static SubLObject problem_strategic_properties_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject problem_strategic_properties_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_strategy.$problem_strategic_properties_native.class ? T : NIL;
    }

    public static SubLObject prob_strategic_properties_status(final SubLObject v_object) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject prob_strategic_properties_possible_tactic_count(final SubLObject v_object) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject prob_strategic_properties_uninterestingness(final SubLObject v_object) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_prob_strategic_properties_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_prob_strategic_properties_tactic_strategic_property_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_prob_strategic_properties_possible_tactic_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_prob_strategic_properties_uninterestingness(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_strategic_properties_p(v_object) : "inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_problem_strategic_properties(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_strategy.$problem_strategic_properties_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATUS)) {
                _csetf_prob_strategic_properties_status(v_new, current_value);
            } else
                if (pcase_var.eql($TACTIC_STRATEGIC_PROPERTY_INDEX)) {
                    _csetf_prob_strategic_properties_tactic_strategic_property_index(v_new, current_value);
                } else
                    if (pcase_var.eql($POSSIBLE_TACTIC_COUNT)) {
                        _csetf_prob_strategic_properties_possible_tactic_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($UNINTERESTINGNESS)) {
                            _csetf_prob_strategic_properties_uninterestingness(v_new, current_value);
                        } else {
                            Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_problem_strategic_properties(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PROBLEM_STRATEGIC_PROPERTIES, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATUS, prob_strategic_properties_status(obj));
        funcall(visitor_fn, obj, $SLOT, $TACTIC_STRATEGIC_PROPERTY_INDEX, prob_strategic_properties_tactic_strategic_property_index(obj));
        funcall(visitor_fn, obj, $SLOT, $POSSIBLE_TACTIC_COUNT, prob_strategic_properties_possible_tactic_count(obj));
        funcall(visitor_fn, obj, $SLOT, $UNINTERESTINGNESS, prob_strategic_properties_uninterestingness(obj));
        funcall(visitor_fn, obj, $END, MAKE_PROBLEM_STRATEGIC_PROPERTIES, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_problem_strategic_properties_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem_strategic_properties(obj, visitor_fn);
    }

    public static SubLObject new_problem_strategic_properties() {
        final SubLObject problem_strategic_properties = make_problem_strategic_properties(UNPROVIDED);
        _csetf_prob_strategic_properties_status(problem_strategic_properties, $NEW);
        _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, NIL);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
        _csetf_prob_strategic_properties_uninterestingness(problem_strategic_properties, default_uninterestingness_cache_value());
        return problem_strategic_properties;
    }

    public static SubLObject problem_strategic_properties_int(final SubLObject problem, final SubLObject strategy) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject problem_strategic_properties = gethash_without_values(problem, strategy_problem_strategic_index(strategy), UNPROVIDED);
        return problem_strategic_properties;
    }

    public static SubLObject set_problem_strategic_properties(final SubLObject problem, final SubLObject strategy, final SubLObject v_properties) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != problem_strategic_properties_p(v_properties) : "inference_datastructures_strategy.problem_strategic_properties_p(v_properties) " + "CommonSymbols.NIL != inference_datastructures_strategy.problem_strategic_properties_p(v_properties) " + v_properties;
        final SubLObject hash = strategy_problem_strategic_index(strategy);
        sethash(problem, hash, v_properties);
        return problem;
    }

    public static SubLObject remove_problem_strategic_properties(final SubLObject problem, final SubLObject strategy) {
        final SubLObject hash = strategy_problem_strategic_index(strategy);
        remhash(problem, hash);
        return problem;
    }

    public static SubLObject problem_strategic_properties(final SubLObject problem, final SubLObject strategy) {
        SubLObject problem_strategic_properties = problem_strategic_properties_int(problem, strategy);
        if (NIL == problem_strategic_properties_p(problem_strategic_properties)) {
            problem_strategic_properties = new_problem_strategic_properties();
            set_problem_strategic_properties(problem, strategy, problem_strategic_properties);
        }
        return problem_strategic_properties;
    }

    public static SubLObject problem_strategic_properties_tactic_strategic_property_index(final SubLObject problem, final SubLObject problem_strategic_properties) {
        SubLObject tactic_properties_vector = prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties);
        if (!tactic_properties_vector.isVector()) {
            tactic_properties_vector = make_vector(inference_datastructures_problem.problem_tactic_count(problem), UNPROVIDED);
            _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, tactic_properties_vector);
        }
        if (length(tactic_properties_vector).numL(inference_datastructures_problem.problem_tactic_count(problem))) {
            tactic_properties_vector = vector_utilities.extend_vector_to(tactic_properties_vector, inference_datastructures_problem.problem_tactic_count(problem), UNPROVIDED);
            _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, tactic_properties_vector);
        }
        return tactic_properties_vector;
    }

    public static SubLObject problem_dwimmed_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject strategic_status = problem_raw_strategic_status(problem, strategy);
        if (NIL != inference_worker.problem_goodP(problem)) {
            final SubLObject dwimmed_status = inference_worker.good_version_of_problem_status(strategic_status);
            return dwimmed_status;
        }
        return strategic_status;
    }

    public static SubLObject problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        final SubLObject strategic_status = prob_strategic_properties_status(problem_strategic_properties);
        if (($NEW == strategic_status) && ($NEW != inference_datastructures_problem.problem_status(problem))) {
            return $UNEXAMINED;
        }
        return strategic_status;
    }

    public static SubLObject problem_weak_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject status = problem_raw_strategic_status(problem, strategy);
        final SubLObject weak_tactical_status = inference_datastructures_enumerated_types.tactical_status_from_problem_status(status);
        return weak_tactical_status;
    }

    public static SubLObject problem_strategic_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject weak_tactical_status = problem_weak_strategic_status(problem, strategy);
        if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
            return $FINISHED;
        }
        return weak_tactical_status;
    }

    public static SubLObject problem_strategic_provability_status(final SubLObject problem, final SubLObject strategy) {
        final SubLObject status = problem_dwimmed_strategic_status(problem, strategy);
        final SubLObject weak_provability_status = inference_datastructures_enumerated_types.provability_status_from_problem_status(status);
        if (($NEUTRAL == weak_provability_status) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
            return $NO_GOOD;
        }
        return weak_provability_status;
    }

    public static SubLObject problem_tactical_or_strategic_status(final SubLObject problem, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        return NIL != strategy_p(strategic_context) ? problem_strategic_status(problem, strategic_context) : inference_datastructures_problem.problem_tactical_status(problem);
    }

    public static SubLObject problem_provability_status(final SubLObject problem, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        return NIL != strategy_p(strategic_context) ? problem_strategic_provability_status(problem, strategic_context) : inference_datastructures_problem.problem_tactical_provability_status(problem);
    }

    public static SubLObject set_problem_raw_strategic_status(final SubLObject problem, final SubLObject strategy, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != inference_datastructures_enumerated_types.good_problem_status_p(status))) {
            Errors.error($str146$poking_good_status__s_into_proble, status, problem, strategy);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($POSSIBLE_NO_GOOD == status)) {
            Errors.error($str148$_possible_no_good__s_wrt__s, problem, strategy);
        }
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_status(problem_strategic_properties, status);
        return problem;
    }

    public static SubLObject strategically_unexamined_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($UNEXAMINED, problem_strategic_status(problem, strategy));
    }

    public static SubLObject strategically_examined_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($EXAMINED, problem_strategic_status(problem, strategy));
    }

    public static SubLObject strategically_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($POSSIBLE, problem_strategic_status(problem, strategy));
    }

    public static SubLObject strategically_pending_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($PENDING, problem_strategic_status(problem, strategy));
    }

    public static SubLObject strategically_finished_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($FINISHED, problem_strategic_status(problem, strategy));
    }

    public static SubLObject strategically_no_good_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($NO_GOOD, problem_strategic_provability_status(problem, strategy));
    }

    public static SubLObject strategically_neutral_problem_p(final SubLObject problem, final SubLObject strategy) {
        return eq($NEUTRAL, problem_strategic_provability_status(problem, strategy));
    }

    public static SubLObject strategically_good_problem_p(final SubLObject problem, final SubLObject strategy) {
        return inference_worker.problem_goodP(problem);
    }

    public static SubLObject strategically_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
        return makeBoolean((NIL != strategically_possible_problem_p(problem, strategy)) || (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)));
    }

    public static SubLObject strategically_not_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategy) {
        return makeBoolean(((NIL != strategically_examined_problem_p(problem, strategy)) || (NIL != strategically_pending_problem_p(problem, strategy))) || (NIL != strategically_finished_problem_p(problem, strategy)));
    }

    public static SubLObject strategically_totally_no_good_problem_p(final SubLObject problem, final SubLObject strategy) {
        return strategically_no_good_problem_p(problem, inference_tactician.controlling_strategy(strategy));
    }

    public static SubLObject problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy) {
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        return prob_strategic_properties_uninterestingness(problem_strategic_properties);
    }

    public static SubLObject set_problem_strategic_uninterestingness(final SubLObject problem, final SubLObject strategy, final SubLObject uninterestingness) {
        assert NIL != uninterestingness_cache_value_p(uninterestingness) : "inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) " + "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) " + uninterestingness;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_uninterestingness(problem_strategic_properties, uninterestingness);
        return uninterestingness;
    }

    public static SubLObject set_just_problem_thrown_away(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, T, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, NIL, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, $RECOMPUTE, $ALL);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_problem_set_aside(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, T, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_problem_not_set_aside(final SubLObject problem, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, NIL, conditions);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
        final SubLObject uninterestingness = problem_strategic_uninterestingness(problem, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, $RECOMPUTE, $ALL);
        return set_problem_strategic_uninterestingness(problem, strategy, new_uninterestingness);
    }

    public static SubLObject problem_thrown_away_cache_status(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return thrown_away_cache_status_from_uninterestingness(problem_strategic_uninterestingness(problem, strategy), conditions);
    }

    public static SubLObject problem_set_aside_cache_status(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_aside_cache_status_from_uninterestingness(problem_strategic_uninterestingness(problem, strategy), conditions);
    }

    public static SubLObject set_problem_thrown_away(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_just_problem_thrown_away(problem, strategy, conditions);
    }

    public static SubLObject set_problem_not_thrown_away(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_just_problem_not_thrown_away(problem, strategy, conditions);
    }

    public static SubLObject set_problem_set_aside(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        set_just_problem_set_aside(problem, strategy, conditions);
        return NIL;
    }

    public static SubLObject set_problem_not_set_aside(final SubLObject problem, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_just_problem_not_set_aside(problem, strategy, conditions);
    }

    public static SubLObject set_problem_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
        return set_just_problem_recompute_thrown_away(problem, strategy);
    }

    public static SubLObject set_problem_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
        return set_just_problem_recompute_set_aside(problem, strategy);
    }

    public static SubLObject tactic_strategic_properties_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tactic_strategic_properties_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_strategy.$tactic_strategic_properties_native.class ? T : NIL;
    }

    public static SubLObject tact_strategic_properties_preference_level(final SubLObject v_object) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject tact_strategic_properties_preference_level_justification(final SubLObject v_object) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject tact_strategic_properties_productivity(final SubLObject v_object) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject tact_strategic_properties_uninterestingness(final SubLObject v_object) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_tact_strategic_properties_preference_level(final SubLObject v_object, final SubLObject value) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tact_strategic_properties_preference_level_justification(final SubLObject v_object, final SubLObject value) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tact_strategic_properties_productivity(final SubLObject v_object, final SubLObject value) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tact_strategic_properties_uninterestingness(final SubLObject v_object, final SubLObject value) {
        assert NIL != tactic_strategic_properties_p(v_object) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_tactic_strategic_properties(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_strategy.$tactic_strategic_properties_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PREFERENCE_LEVEL)) {
                _csetf_tact_strategic_properties_preference_level(v_new, current_value);
            } else
                if (pcase_var.eql($PREFERENCE_LEVEL_JUSTIFICATION)) {
                    _csetf_tact_strategic_properties_preference_level_justification(v_new, current_value);
                } else
                    if (pcase_var.eql($PRODUCTIVITY)) {
                        _csetf_tact_strategic_properties_productivity(v_new, current_value);
                    } else
                        if (pcase_var.eql($UNINTERESTINGNESS)) {
                            _csetf_tact_strategic_properties_uninterestingness(v_new, current_value);
                        } else {
                            Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tactic_strategic_properties(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TACTIC_STRATEGIC_PROPERTIES, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PREFERENCE_LEVEL, tact_strategic_properties_preference_level(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFERENCE_LEVEL_JUSTIFICATION, tact_strategic_properties_preference_level_justification(obj));
        funcall(visitor_fn, obj, $SLOT, $PRODUCTIVITY, tact_strategic_properties_productivity(obj));
        funcall(visitor_fn, obj, $SLOT, $UNINTERESTINGNESS, tact_strategic_properties_uninterestingness(obj));
        funcall(visitor_fn, obj, $END, MAKE_TACTIC_STRATEGIC_PROPERTIES, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tactic_strategic_properties_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tactic_strategic_properties(obj, visitor_fn);
    }

    public static SubLObject new_tactic_strategic_properties() {
        final SubLObject tactic_strategic_properties = make_tactic_strategic_properties(UNPROVIDED);
        _csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, preference_modules.$default_preference_level$.getGlobalValue());
        _csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, $str175$);
        _csetf_tact_strategic_properties_productivity(tactic_strategic_properties, number_utilities.positive_infinity());
        _csetf_tact_strategic_properties_uninterestingness(tactic_strategic_properties, default_uninterestingness_cache_value());
        return tactic_strategic_properties;
    }

    public static SubLObject tactic_strategic_properties_int(final SubLObject tactic, final SubLObject strategy) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        if (NIL != problem_strategic_properties_p(problem_strategic_properties)) {
            final SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
            if (tactic_properties_vector.isVector()) {
                final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
                return aref(tactic_properties_vector, tactic_suid);
            }
        }
        return NIL;
    }

    public static SubLObject set_tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy, final SubLObject v_properties) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        assert NIL != tactic_strategic_properties_p(v_properties) : "inference_datastructures_strategy.tactic_strategic_properties_p(v_properties) " + "CommonSymbols.NIL != inference_datastructures_strategy.tactic_strategic_properties_p(v_properties) " + v_properties;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        final SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
        final SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
        set_aref(tactic_properties_vector, tactic_suid, v_properties);
        return tactic;
    }

    public static SubLObject tactic_strategic_properties(final SubLObject tactic, final SubLObject strategy) {
        SubLObject tactic_strategic_properties = tactic_strategic_properties_int(tactic, strategy);
        if (NIL == tactic_strategic_properties_p(tactic_strategic_properties)) {
            tactic_strategic_properties = new_tactic_strategic_properties();
            set_tactic_strategic_properties(tactic, strategy, tactic_strategic_properties);
        }
        return tactic_strategic_properties;
    }

    public static SubLObject tactic_strategic_completeness(final SubLObject tactic, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        if ($TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_completeness(tactic);
        }
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return inference_datastructures_tactic.tactic_completeness(tactic);
        }
        return Errors.error($str178$structural_tactic__s_cannot_have_, tactic);
    }

    public static SubLObject tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        if ($TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_preference_level(tactic);
        }
        if (NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
            final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
            return tact_strategic_properties_preference_level(tactic_strategic_properties);
        }
        return Errors.error($str179$content_tactic__s_cannot_have_a_p, tactic);
    }

    public static SubLObject tactic_strategic_preference_level_justification(final SubLObject tactic, final SubLObject strategic_context) {
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        if ($TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_preference_level_justification(tactic);
        }
        if (NIL != inference_worker.generalized_structural_tactic_p(tactic)) {
            final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
            return tact_strategic_properties_preference_level_justification(tactic_strategic_properties);
        }
        return Errors.error($str180$content_tactic__s_cannot_have_a_p, tactic);
    }

    public static SubLObject tactic_strategic_dwimmed_completeness(final SubLObject tactic, final SubLObject strategic_context) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return tactic_strategic_completeness(tactic, strategic_context);
        }
        return preference_modules.preference_level_to_completeness(tactic_strategic_preference_level(tactic, strategic_context));
    }

    public static SubLObject conjunctive_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategic_context) {
        assert NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) : "inference_worker.generalized_conjunctive_tactic_p(tactic) " + "CommonSymbols.NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) " + tactic;
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return preference_modules.completeness_to_preference_level(tactic_strategic_completeness(tactic, strategic_context));
        }
        return tactic_strategic_preference_level(tactic, strategic_context);
    }

    public static SubLObject conjunctive_tactic_strategic_preference_level_justification(final SubLObject tactic, final SubLObject strategic_context) {
        assert NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) : "inference_worker.generalized_conjunctive_tactic_p(tactic) " + "CommonSymbols.NIL != inference_worker.generalized_conjunctive_tactic_p(tactic) " + tactic;
        if (NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return string_utilities.str(tactic_strategic_completeness(tactic, strategic_context));
        }
        return tactic_strategic_preference_level_justification(tactic, strategic_context);
    }

    public static SubLObject tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategic_context) {
        if ($TACTICAL == strategic_context) {
            return inference_datastructures_tactic.tactic_productivity(tactic);
        }
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return inference_datastructures_tactic.tactic_productivity(tactic);
        }
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
        return tact_strategic_properties_productivity(tactic_strategic_properties);
    }

    public static SubLObject tactic_strategically_preferredP(final SubLObject tactic, final SubLObject strategy) {
        return eq($PREFERRED, tactic_strategic_preference_level(tactic, strategy));
    }

    public static SubLObject set_tactic_strategic_preference_level(final SubLObject tactic, final SubLObject strategy, final SubLObject preference_level, final SubLObject justification) {
        assert NIL != preference_modules.preference_level_p(preference_level) : "preference_modules.preference_level_p(preference_level) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level) " + preference_level;
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        _csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, preference_level);
        _csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, justification);
        return tactic;
    }

    public static SubLObject set_tactic_strategic_productivity(final SubLObject tactic, final SubLObject strategy, final SubLObject productivity) {
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        _csetf_tact_strategic_properties_productivity(tactic_strategic_properties, productivity);
        return tactic;
    }

    public static SubLObject problem_strategically_possible_tactic_count(final SubLObject problem, final SubLObject strategy) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        return prob_strategic_properties_possible_tactic_count(problem_strategic_properties);
    }

    public static SubLObject problem_note_tactic_strategically_possible(final SubLObject problem, final SubLObject tactic, final SubLObject strategy) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, add(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
        return problem;
    }

    public static SubLObject problem_note_tactic_not_strategically_possible(final SubLObject problem, final SubLObject tactic, final SubLObject strategy) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        assert NIL != strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, subtract(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
        return problem;
    }

    public static SubLObject problem_note_all_tactics_not_strategically_possible(final SubLObject problem, final SubLObject strategy) {
        final SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
        _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
        return problem;
    }

    public static SubLObject tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy) {
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        return tact_strategic_properties_uninterestingness(tactic_strategic_properties);
    }

    public static SubLObject set_tactic_strategic_uninterestingness(final SubLObject tactic, final SubLObject strategy, final SubLObject uninterestingness) {
        assert NIL != uninterestingness_cache_value_p(uninterestingness) : "inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) " + "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_value_p(uninterestingness) " + uninterestingness;
        final SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
        _csetf_tact_strategic_properties_uninterestingness(tactic_strategic_properties, uninterestingness);
        return uninterestingness;
    }

    public static SubLObject thrown_away_cache_status_from_uninterestingness(final SubLObject uninterestingness, final SubLObject conditions) {
        return cache_status_for_conditions(aref(uninterestingness, ZERO_INTEGER), conditions);
    }

    public static SubLObject set_aside_cache_status_from_uninterestingness(final SubLObject uninterestingness, final SubLObject conditions) {
        return cache_status_for_conditions(aref(uninterestingness, ONE_INTEGER), conditions);
    }

    public static SubLObject note_uninterestingness_cache_thrown_away_value(final SubLObject uninterestingness, final SubLObject value, final SubLObject conditions) {
        assert NIL != uninterestingness_cache_conditions_p(conditions) : "inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) " + "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) " + conditions;
        SubLObject cache_status = aref(uninterestingness, ZERO_INTEGER);
        cache_status = modify_cache_status_for_value_and_conditions(cache_status, value, conditions);
        set_aref(uninterestingness, ZERO_INTEGER, cache_status);
        return uninterestingness;
    }

    public static SubLObject note_uninterestingness_cache_set_aside_value(final SubLObject uninterestingness, final SubLObject value, final SubLObject conditions) {
        assert NIL != uninterestingness_cache_conditions_p(conditions) : "inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) " + "CommonSymbols.NIL != inference_datastructures_strategy.uninterestingness_cache_conditions_p(conditions) " + conditions;
        SubLObject cache_status = aref(uninterestingness, ONE_INTEGER);
        cache_status = modify_cache_status_for_value_and_conditions(cache_status, value, conditions);
        set_aref(uninterestingness, ONE_INTEGER, cache_status);
        return uninterestingness;
    }

    public static SubLObject uninterestingness_cache_value_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isVector() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != thrown_away_cache_value_p(aref(v_object, ZERO_INTEGER)))) && (NIL != set_aside_cache_value_p(aref(v_object, ONE_INTEGER))));
    }

    public static SubLObject uninterestingness_cache_conditions_p(final SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (v_object.isCons() && (NIL != list_utilities.every_in_list(BOOLEANP, v_object, UNPROVIDED))));
    }

    public static SubLObject uninterestingness_cache_conditions_list_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != list_utilities.every_in_list(UNINTERESTINGNESS_CACHE_CONDITIONS_P, v_object, UNPROVIDED)));
    }

    public static SubLObject thrown_away_cache_value_p(final SubLObject v_object) {
        return ignore_cache_value_p(v_object);
    }

    public static SubLObject set_aside_cache_value_p(final SubLObject v_object) {
        return ignore_cache_value_p(v_object);
    }

    public static SubLObject ignore_cache_value_p(final SubLObject v_object) {
        return makeBoolean(($RECOMPUTE == v_object) || (((NIL != list_utilities.doubletonP(v_object)) && (NIL != uninterestingness_cache_conditions_list_p(v_object.first()))) && (NIL != uninterestingness_cache_conditions_list_p(second(v_object)))));
    }

    public static SubLObject set_just_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, T, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, NIL, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_thrown_away_value(uninterestingness, $RECOMPUTE, $ALL);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_tactic_set_aside(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, T, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy, final SubLObject conditions) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, NIL, conditions);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }

    public static SubLObject set_just_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy) {
        final SubLObject uninterestingness = tactic_strategic_uninterestingness(tactic, strategy);
        final SubLObject new_uninterestingness = note_uninterestingness_cache_set_aside_value(uninterestingness, $RECOMPUTE, $ALL);
        return set_tactic_strategic_uninterestingness(tactic, strategy, new_uninterestingness);
    }

    public static SubLObject tactic_thrown_away_cache_status(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return thrown_away_cache_status_from_uninterestingness(tactic_strategic_uninterestingness(tactic, strategy), conditions);
    }

    public static SubLObject tactic_set_aside_cache_status(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_aside_cache_status_from_uninterestingness(tactic_strategic_uninterestingness(tactic, strategy), conditions);
    }

    public static SubLObject set_tactic_thrown_away(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        set_just_tactic_thrown_away(tactic, strategy, conditions);
        return NIL;
    }

    public static SubLObject set_tactic_not_thrown_away(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_just_tactic_not_thrown_away(tactic, strategy, conditions);
    }

    public static SubLObject set_tactic_recompute_thrown_away(final SubLObject tactic, final SubLObject strategy) {
        set_just_tactic_recompute_thrown_away(tactic, strategy);
        set_just_problem_recompute_thrown_away(inference_datastructures_tactic.tactic_problem(tactic), strategy);
        return NIL;
    }

    public static SubLObject set_tactic_set_aside(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        set_just_tactic_set_aside(tactic, strategy, conditions);
        return NIL;
    }

    public static SubLObject set_tactic_not_set_aside(final SubLObject tactic, final SubLObject strategy, SubLObject conditions) {
        if (conditions == UNPROVIDED) {
            conditions = $ALL;
        }
        return set_just_tactic_not_set_aside(tactic, strategy, conditions);
    }

    public static SubLObject set_tactic_recompute_set_aside(final SubLObject tactic, final SubLObject strategy) {
        set_just_tactic_recompute_set_aside(tactic, strategy);
        if ((NIL == strategy_continuableP(strategy)) && (NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy))) {
            set_just_tactic_recompute_thrown_away(tactic, strategy);
        }
        set_just_problem_recompute_set_aside(inference_datastructures_tactic.tactic_problem(tactic), strategy);
        return NIL;
    }

    public static SubLObject set_problem_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$4 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$4);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_recompute_thrown_away(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$5 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$5)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$5);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_recompute_thrown_away(problem, strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_problem_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$6 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$6);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_recompute_set_aside(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$7 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$7)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$7);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_recompute_set_aside(problem, strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_tactic_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject tactic) {
        final SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$8 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$8);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_tactic_recompute_thrown_away(tactic, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$9 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$9)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$9);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_tactic_recompute_thrown_away(tactic, strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_tactic_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject tactic) {
        final SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$10 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$10);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_tactic_recompute_set_aside(tactic, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$11 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$11)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$11);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_tactic_recompute_set_aside(tactic, strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$12 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$12);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_tactics_recompute_thrown_away(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$13 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$13)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$13);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_tactics_recompute_thrown_away(problem, strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$14 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$14);
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
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    set_problem_tactics_recompute_set_aside(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$15 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$15)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$15);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    set_problem_tactics_recompute_set_aside(problem, strategy2);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_problem_tactics_recompute_thrown_away(final SubLObject problem, final SubLObject strategy) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_just_tactic_recompute_thrown_away(tactic, strategy);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        set_just_problem_recompute_thrown_away(problem, strategy);
        return NIL;
    }

    public static SubLObject set_problem_tactics_recompute_set_aside(final SubLObject problem, final SubLObject strategy) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_just_tactic_recompute_set_aside(tactic, strategy);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        set_just_problem_recompute_set_aside(problem, strategy);
        return NIL;
    }

    public static SubLObject cache_status_known_for_conditionsP(final SubLObject cache_status, final SubLObject value, final SubLObject conditions) {
        return eq(value, cache_status_for_conditions(cache_status, conditions));
    }

    public static SubLObject cache_status_for_conditions(final SubLObject cache_status, final SubLObject conditions) {
        if (cache_status == $RECOMPUTE) {
            return $RECOMPUTE;
        }
        if (cache_status.eql($default_uninterestingness_cache_value$.getGlobalValue())) {
            return $RECOMPUTE;
        }
        if (NIL != any_conditions_implyP(nth(ZERO_INTEGER, cache_status), conditions, NIL)) {
            return T;
        }
        if (NIL != any_conditions_implyP(nth(ONE_INTEGER, cache_status), conditions, T)) {
            return NIL;
        }
        return $RECOMPUTE;
    }

    public static SubLObject modify_cache_status_for_value_and_conditions(SubLObject cache_status, final SubLObject value, final SubLObject conditions) {
        if (value == $RECOMPUTE) {
            cache_status = $default_uninterestingness_cache_value$.getGlobalValue();
        } else
            if (NIL == cache_status_known_for_conditionsP(cache_status, value, conditions)) {
                if ((cache_status == $RECOMPUTE) || cache_status.eql($default_uninterestingness_cache_value$.getGlobalValue())) {
                    cache_status = copy_list($default_uninterestingness_cache_value$.getGlobalValue());
                }
                final SubLObject conditions_nth = (NIL != value) ? ZERO_INTEGER : ONE_INTEGER;
                final SubLObject current_conditions_list = nth(conditions_nth, cache_status);
                SubLObject new_conditions_list = NIL;
                if (conditions == $ALL) {
                    new_conditions_list = list($ALL);
                } else {
                    new_conditions_list = cons(conditions, new_conditions_list);
                    SubLObject cdolist_list_var = current_conditions_list;
                    SubLObject current_conditions = NIL;
                    current_conditions = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == conditions_implyP(conditions, current_conditions, makeBoolean(NIL == value))) {
                            new_conditions_list = cons(current_conditions, new_conditions_list);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        current_conditions = cdolist_list_var.first();
                    } 
                }
                set_nth(conditions_nth, cache_status, new_conditions_list);
            }

        return cache_status;
    }

    public static SubLObject any_conditions_implyP(final SubLObject p_conditions_list, final SubLObject q_conditions, final SubLObject negP) {
        SubLObject cdolist_list_var = p_conditions_list;
        SubLObject p_conditions = NIL;
        p_conditions = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != conditions_implyP(p_conditions, q_conditions, negP)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            p_conditions = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject conditions_implyP(final SubLObject p_conditions, final SubLObject q_conditions, SubLObject negP) {
        if (negP == UNPROVIDED) {
            negP = NIL;
        }
        if (p_conditions == $ALL) {
            return T;
        }
        if (q_conditions == $ALL) {
            return NIL;
        }
        return NIL == negP ? conditions_booleanly_implyP(p_conditions, q_conditions) : conditions_booleanly_implyP(q_conditions, p_conditions);
    }

    public static SubLObject conditions_booleanly_implyP(final SubLObject p_conditions, final SubLObject q_conditions) {
        SubLObject p_condition = NIL;
        SubLObject p_condition_$16 = NIL;
        SubLObject q_condition = NIL;
        SubLObject q_condition_$17 = NIL;
        p_condition = p_conditions;
        p_condition_$16 = p_condition.first();
        q_condition = q_conditions;
        q_condition_$17 = q_condition.first();
        while ((NIL != q_condition) || (NIL != p_condition)) {
            if ((NIL != p_condition_$16) && (NIL == q_condition_$17)) {
                return NIL;
            }
            p_condition = p_condition.rest();
            p_condition_$16 = p_condition.first();
            q_condition = q_condition.rest();
            q_condition_$17 = q_condition.first();
        } 
        return T;
    }

    public static SubLObject declare_inference_datastructures_strategy_file() {
        declareFunction(me, "strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "strategy_p", "STRATEGY-P", 1, 0, false);
        new inference_datastructures_strategy.$strategy_p$UnaryFunction();
        declareFunction(me, "strat_suid", "STRAT-SUID", 1, 0, false);
        declareFunction(me, "strat_inference", "STRAT-INFERENCE", 1, 0, false);
        declareFunction(me, "strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(me, "strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false);
        declareFunction(me, "strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false);
        declareFunction(me, "strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false);
        declareFunction(me, "strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        declareFunction(me, "strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "strat_removal_backtracking_productivity_limit", "STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false);
        declareFunction(me, "strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
        declareFunction(me, "strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
        declareFunction(me, "strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "strat_step_count", "STRAT-STEP-COUNT", 1, 0, false);
        declareFunction(me, "strat_type", "STRAT-TYPE", 1, 0, false);
        declareFunction(me, "strat_data", "STRAT-DATA", 1, 0, false);
        declareFunction(me, "_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false);
        declareFunction(me, "_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false);
        declareFunction(me, "_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
        declareFunction(me, "_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false);
        declareFunction(me, "_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false);
        declareFunction(me, "_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false);
        declareFunction(me, "_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 2, 0, false);
        declareFunction(me, "_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false);
        declareFunction(me, "_csetf_strat_removal_backtracking_productivity_limit", "_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
        declareFunction(me, "_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false);
        declareFunction(me, "_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false);
        declareFunction(me, "_csetf_strat_step_count", "_CSETF-STRAT-STEP-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false);
        declareFunction(me, "make_strategy", "MAKE-STRATEGY", 0, 1, false);
        declareFunction(me, "visit_defstruct_strategy", "VISIT-DEFSTRUCT-STRATEGY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_strategy_method", "VISIT-DEFSTRUCT-OBJECT-STRATEGY-METHOD", 2, 0, false);
        declareFunction(me, "valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false);
        declareFunction(me, "strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false);
        declareFunction(me, "print_strategy", "PRINT-STRATEGY", 3, 0, false);
        declareFunction(me, "sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false);
        new inference_datastructures_strategy.$sxhash_strategy_method$UnaryFunction();
        declareFunction(me, "new_strategy", "NEW-STRATEGY", 2, 0, false);
        declareFunction(me, "destroy_strategy", "DESTROY-STRATEGY", 1, 0, false);
        declareFunction(me, "destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false);
        declareFunction(me, "destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false);
        declareFunction(me, "destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false);
        declareFunction(me, "note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false);
        declareFunction(me, "remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false);
        declareFunction(me, "strategy_suid", "STRATEGY-SUID", 1, 0, false);
        declareFunction(me, "strategy_inference", "STRATEGY-INFERENCE", 1, 0, false);
        declareFunction(me, "strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(me, "strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
        declareFunction(me, "strategy_type", "STRATEGY-TYPE", 1, 0, false);
        declareFunction(me, "strategy_data", "STRATEGY-DATA", 1, 0, false);
        declareFunction(me, "strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false);
        declareFunction(me, "strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false);
        declareFunction(me, "strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false);
        declareFunction(me, "strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
        declareFunction(me, "strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "strategy_removal_backtracking_productivity_limit", "STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
        declareFunction(me, "strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false);
        declareFunction(me, "strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
        declareFunction(me, "strategy_step_count", "STRATEGY-STEP-COUNT", 1, 0, false);
        declareFunction(me, "set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
        declareFunction(me, "set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false);
        declareFunction(me, "set_strategy_removal_backtracking_productivity_limit", "SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
        declareFunction(me, "set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false);
        declareFunction(me, "set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false);
        declareMacro(me, "do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS");
        declareMacro(me, "do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS");
        declareMacro(me, "do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS");
        declareMacro(me, "with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE");
        declareFunction(me, "strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false);
        declareFunction(me, "strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false);
        declareFunction(me, "strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false);
        declareFunction(me, "strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false);
        declareFunction(me, "strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0, false);
        declareFunction(me, "strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false);
        declareFunction(me, "strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false);
        declareFunction(me, "problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false);
        declareFunction(me, "problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false);
        declareFunction(me, "problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false);
        declareFunction(me, "strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0, false);
        declareFunction(me, "strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0, false);
        declareFunction(me, "strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
        declareFunction(me, "strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false);
        declareFunction(me, "strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false);
        declareFunction(me, "strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false);
        declareFunction(me, "strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false);
        declareFunction(me, "set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false);
        declareFunction(me, "copy_strategy_properties", "COPY-STRATEGY-PROPERTIES", 2, 0, false);
        declareFunction(me, "set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false);
        declareFunction(me, "strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false);
        declareFunction(me, "strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false);
        declareFunction(me, "strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
        declareFunction(me, "strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false);
        declareFunction(me, "strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false);
        declareFunction(me, "strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false);
        declareFunction(me, "strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false);
        declareFunction(me, "note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction(me, "clear_strategy_should_reconsider_set_asides", "CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareMacro(me, "with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM");
        declareFunction(me, "strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false);
        declareFunction(me, "increment_strategy_step_count", "INCREMENT-STRATEGY-STEP-COUNT", 1, 0, false);
        declareFunction(me, "strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false);
        declareFunction(me, "strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false);
        declareFunction(me, "strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false);
        declareFunction(me, "strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false);
        declareFunction(me, "strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false);
        declareFunction(me, "strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false);
        declareFunction(me, "strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false);
        declareFunction(me, "strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false);
        declareFunction(me, "strategy_dispatch_unexpected_strategy_type_error", "STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false);
        declareFunction(me, "controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false);
        declareFunction(me, "strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false);
        declareFunction(me, "new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false);
        declareFunction(me, "deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false);
        declareFunction(me, "clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false);
        declareFunction(me, "strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false);
        declareFunction(me, "set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false);
        declareFunction(me, "default_uninterestingness_cache_value", "DEFAULT-UNINTERESTINGNESS-CACHE-VALUE", 0, 0, false);
        declareFunction(me, "problem_strategic_properties_print_function_trampoline", "PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false);
        new inference_datastructures_strategy.$problem_strategic_properties_p$UnaryFunction();
        declareFunction(me, "prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false);
        declareFunction(me, "prob_strategic_properties_tactic_strategic_property_index", "PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false);
        declareFunction(me, "prob_strategic_properties_possible_tactic_count", "PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false);
        declareFunction(me, "prob_strategic_properties_uninterestingness", "PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false);
        declareFunction(me, "_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_prob_strategic_properties_tactic_strategic_property_index", "_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_prob_strategic_properties_possible_tactic_count", "_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_prob_strategic_properties_uninterestingness", "_CSETF-PROB-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
        declareFunction(me, "make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false);
        declareFunction(me, "visit_defstruct_problem_strategic_properties", "VISIT-DEFSTRUCT-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_problem_strategic_properties_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
        declareFunction(me, "new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false);
        declareFunction(me, "set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false);
        declareFunction(me, "remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "problem_strategic_properties_tactic_strategic_property_index", "PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
        declareFunction(me, "problem_dwimmed_strategic_status", "PROBLEM-DWIMMED-STRATEGIC-STATUS", 2, 0, false);
        declareFunction(me, "problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false);
        declareFunction(me, "problem_weak_strategic_status", "PROBLEM-WEAK-STRATEGIC-STATUS", 2, 0, false);
        declareFunction(me, "problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false);
        declareFunction(me, "problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0, false);
        declareFunction(me, "problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
        declareFunction(me, "problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false);
        declareFunction(me, "set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false);
        declareFunction(me, "strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_potentially_possible_problem_p", "STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_not_potentially_possible_problem_p", "STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        declareFunction(me, "strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
        declareFunction(me, "problem_strategic_uninterestingness", "PROBLEM-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
        declareFunction(me, "set_problem_strategic_uninterestingness", "SET-PROBLEM-STRATEGIC-UNINTERESTINGNESS", 3, 0, false);
        declareFunction(me, "set_just_problem_thrown_away", "SET-JUST-PROBLEM-THROWN-AWAY", 3, 0, false);
        declareFunction(me, "set_just_problem_not_thrown_away", "SET-JUST-PROBLEM-NOT-THROWN-AWAY", 3, 0, false);
        declareFunction(me, "set_just_problem_recompute_thrown_away", "SET-JUST-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "set_just_problem_set_aside", "SET-JUST-PROBLEM-SET-ASIDE", 3, 0, false);
        declareFunction(me, "set_just_problem_not_set_aside", "SET-JUST-PROBLEM-NOT-SET-ASIDE", 3, 0, false);
        declareFunction(me, "set_just_problem_recompute_set_aside", "SET-JUST-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
        declareFunction(me, "problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
        declareFunction(me, "problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 1, false);
        declareFunction(me, "set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 1, false);
        declareFunction(me, "set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 1, false);
        declareFunction(me, "set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 1, false);
        declareFunction(me, "set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 1, false);
        declareFunction(me, "set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
        declareFunction(me, "tactic_strategic_properties_print_function_trampoline", "TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false);
        new inference_datastructures_strategy.$tactic_strategic_properties_p$UnaryFunction();
        declareFunction(me, "tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(me, "tact_strategic_properties_preference_level_justification", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "tact_strategic_properties_uninterestingness", "TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 1, 0, false);
        declareFunction(me, "_csetf_tact_strategic_properties_preference_level", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(me, "_csetf_tact_strategic_properties_preference_level_justification", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "_csetf_tact_strategic_properties_productivity", "_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false);
        declareFunction(me, "_csetf_tact_strategic_properties_uninterestingness", "_CSETF-TACT-STRATEGIC-PROPERTIES-UNINTERESTINGNESS", 2, 0, false);
        declareFunction(me, "make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false);
        declareFunction(me, "visit_defstruct_tactic_strategic_properties", "VISIT-DEFSTRUCT-TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_tactic_strategic_properties_method", "VISIT-DEFSTRUCT-OBJECT-TACTIC-STRATEGIC-PROPERTIES-METHOD", 2, 0, false);
        declareFunction(me, "new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false);
        declareFunction(me, "tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false);
        declareFunction(me, "set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false);
        declareFunction(me, "tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false);
        declareFunction(me, "tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(me, "tactic_strategic_preference_level_justification", "TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0, false);
        declareFunction(me, "conjunctive_tactic_strategic_preference_level", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(me, "conjunctive_tactic_strategic_preference_level_justification", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
        declareFunction(me, "tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false);
        declareFunction(me, "set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0, false);
        declareFunction(me, "set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false);
        declareFunction(me, "problem_strategically_possible_tactic_count", "PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2, 0, false);
        declareFunction(me, "problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE", 3, 0, false);
        declareFunction(me, "problem_note_tactic_not_strategically_possible", "PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false);
        declareFunction(me, "problem_note_all_tactics_not_strategically_possible", "PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction(me, "tactic_strategic_uninterestingness", "TACTIC-STRATEGIC-UNINTERESTINGNESS", 2, 0, false);
        declareFunction(me, "set_tactic_strategic_uninterestingness", "SET-TACTIC-STRATEGIC-UNINTERESTINGNESS", 3, 0, false);
        declareFunction(me, "thrown_away_cache_status_from_uninterestingness", "THROWN-AWAY-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
        declareFunction(me, "set_aside_cache_status_from_uninterestingness", "SET-ASIDE-CACHE-STATUS-FROM-UNINTERESTINGNESS", 2, 0, false);
        declareFunction(me, "note_uninterestingness_cache_thrown_away_value", "NOTE-UNINTERESTINGNESS-CACHE-THROWN-AWAY-VALUE", 3, 0, false);
        declareFunction(me, "note_uninterestingness_cache_set_aside_value", "NOTE-UNINTERESTINGNESS-CACHE-SET-ASIDE-VALUE", 3, 0, false);
        declareFunction(me, "uninterestingness_cache_value_p", "UNINTERESTINGNESS-CACHE-VALUE-P", 1, 0, false);
        declareFunction(me, "uninterestingness_cache_conditions_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-P", 1, 0, false);
        declareFunction(me, "uninterestingness_cache_conditions_list_p", "UNINTERESTINGNESS-CACHE-CONDITIONS-LIST-P", 1, 0, false);
        declareFunction(me, "thrown_away_cache_value_p", "THROWN-AWAY-CACHE-VALUE-P", 1, 0, false);
        declareFunction(me, "set_aside_cache_value_p", "SET-ASIDE-CACHE-VALUE-P", 1, 0, false);
        declareFunction(me, "ignore_cache_value_p", "IGNORE-CACHE-VALUE-P", 1, 0, false);
        declareFunction(me, "set_just_tactic_thrown_away", "SET-JUST-TACTIC-THROWN-AWAY", 3, 0, false);
        declareFunction(me, "set_just_tactic_not_thrown_away", "SET-JUST-TACTIC-NOT-THROWN-AWAY", 3, 0, false);
        declareFunction(me, "set_just_tactic_recompute_thrown_away", "SET-JUST-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "set_just_tactic_set_aside", "SET-JUST-TACTIC-SET-ASIDE", 3, 0, false);
        declareFunction(me, "set_just_tactic_not_set_aside", "SET-JUST-TACTIC-NOT-SET-ASIDE", 3, 0, false);
        declareFunction(me, "set_just_tactic_recompute_set_aside", "SET-JUST-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
        declareFunction(me, "tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 1, false);
        declareFunction(me, "tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 1, false);
        declareFunction(me, "set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 1, false);
        declareFunction(me, "set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 1, false);
        declareFunction(me, "set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 1, false);
        declareFunction(me, "set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 1, false);
        declareFunction(me, "set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
        declareFunction(me, "set_problem_recompute_thrown_away_wrt_all_relevant_strategies", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "set_problem_recompute_set_aside_wrt_all_relevant_strategies", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "set_tactic_recompute_thrown_away_wrt_all_relevant_strategies", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "set_tactic_recompute_set_aside_wrt_all_relevant_strategies", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "set_problem_tactics_recompute_thrown_away", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY", 2, 0, false);
        declareFunction(me, "set_problem_tactics_recompute_set_aside", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE", 2, 0, false);
        declareFunction(me, "cache_status_known_for_conditionsP", "CACHE-STATUS-KNOWN-FOR-CONDITIONS?", 3, 0, false);
        declareFunction(me, "cache_status_for_conditions", "CACHE-STATUS-FOR-CONDITIONS", 2, 0, false);
        declareFunction(me, "modify_cache_status_for_value_and_conditions", "MODIFY-CACHE-STATUS-FOR-VALUE-AND-CONDITIONS", 3, 0, false);
        declareFunction(me, "any_conditions_implyP", "ANY-CONDITIONS-IMPLY?", 3, 0, false);
        declareFunction(me, "conditions_implyP", "CONDITIONS-IMPLY?", 2, 1, false);
        declareFunction(me, "conditions_booleanly_implyP", "CONDITIONS-BOOLEANLY-IMPLY?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_strategy_file() {
        defconstant("*DTP-STRATEGY*", STRATEGY);
        defparameter("*CURRENT-STRATEGY-WRT-MEMOIZATION*", NIL);
        deflexical("*STRATEGY-TYPE-STORE*", SubLTrampolineFile.maybeDefault($strategy_type_store$, $strategy_type_store$, () -> dictionary.new_dictionary(symbol_function(EQ), FIVE_INTEGER)));
        defparameter("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", T);
        defconstant("*DTP-PROBLEM-STRATEGIC-PROPERTIES*", PROBLEM_STRATEGIC_PROPERTIES);
        defconstant("*DTP-TACTIC-STRATEGIC-PROPERTIES*", TACTIC_STRATEGIC_PROPERTIES);
        deflexical("*DEFAULT-UNINTERESTINGNESS-CACHE-VALUE*", list(NIL, NIL));
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_strategy_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), symbol_function(STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(STRAT_SUID, _CSETF_STRAT_SUID);
        def_csetf(STRAT_INFERENCE, _CSETF_STRAT_INFERENCE);
        def_csetf(STRAT_RESULT_UNIQUENESS_CRITERION, _CSETF_STRAT_RESULT_UNIQUENESS_CRITERION);
        def_csetf(STRAT_ACTIVE_PROBLEMS, _CSETF_STRAT_ACTIVE_PROBLEMS);
        def_csetf(STRAT_MOTIVATED_PROBLEMS, _CSETF_STRAT_MOTIVATED_PROBLEMS);
        def_csetf(STRAT_SET_ASIDE_PROBLEMS, _CSETF_STRAT_SET_ASIDE_PROBLEMS);
        def_csetf($sym21$STRAT_SHOULD_RECONSIDER_SET_ASIDES_, $sym22$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
        def_csetf(STRAT_PRODUCTIVITY_LIMIT, _CSETF_STRAT_PRODUCTIVITY_LIMIT);
        def_csetf(STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, _CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT);
        def_csetf(STRAT_PROOF_SPEC, _CSETF_STRAT_PROOF_SPEC);
        def_csetf(STRAT_PROBLEM_PROOF_SPEC_INDEX, _CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX);
        def_csetf(STRAT_PROBLEM_STRATEGIC_INDEX, _CSETF_STRAT_PROBLEM_STRATEGIC_INDEX);
        def_csetf(STRAT_MEMOIZATION_STATE, _CSETF_STRAT_MEMOIZATION_STATE);
        def_csetf(STRAT_STEP_COUNT, _CSETF_STRAT_STEP_COUNT);
        def_csetf(STRAT_TYPE, _CSETF_STRAT_TYPE);
        def_csetf(STRAT_DATA, _CSETF_STRAT_DATA);
        identity(STRATEGY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STRATEGY_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), symbol_function(SXHASH_STRATEGY_METHOD));
        register_macro_helper(STRATEGY_ACTIVE_PROBLEMS, DO_STRATEGY_ACTIVE_PROBLEMS);
        register_macro_helper(STRATEGY_MOTIVATED_PROBLEMS, DO_STRATEGY_MOTIVATED_PROBLEMS);
        register_macro_helper(STRATEGY_SET_ASIDE_PROBLEMS, DO_STRATEGY_SET_ASIDE_PROBLEMS);
        register_macro_helper(STRATEGY_MEMOIZATION_STATE, WITH_STRATEGY_MEMOIZATION_STATE);
        register_macro_helper(CURRENT_STRATEGY_WRT_MEMOIZATION, WITH_STRATEGY_MEMOIZATION_STATE);
        declare_defglobal($strategy_type_store$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_strategic_properties$.getGlobalValue(), symbol_function(PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list125);
        def_csetf(PROB_STRATEGIC_PROPERTIES_STATUS, _CSETF_PROB_STRATEGIC_PROPERTIES_STATUS);
        def_csetf(PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX, _CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX);
        def_csetf(PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT, _CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT);
        def_csetf(PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS, _CSETF_PROB_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
        identity(PROBLEM_STRATEGIC_PROPERTIES);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_strategic_properties$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROBLEM_STRATEGIC_PROPERTIES_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tactic_strategic_properties$.getGlobalValue(), symbol_function(TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list161);
        def_csetf(TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL, _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL);
        def_csetf(TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION, _CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION);
        def_csetf(TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY, _CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY);
        def_csetf(TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS, _CSETF_TACT_STRATEGIC_PROPERTIES_UNINTERESTINGNESS);
        identity(TACTIC_STRATEGIC_PROPERTIES);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tactic_strategic_properties$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TACTIC_STRATEGIC_PROPERTIES_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_strategy_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_strategy_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_strategy_file();
    }

    static {



































































































































































































    }

    public static final class $strategy_native extends SubLStructNative {
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

        public $strategy_native() {
            this.$suid = Lisp.NIL;
            this.$inference = Lisp.NIL;
            this.$result_uniqueness_criterion = Lisp.NIL;
            this.$active_problems = Lisp.NIL;
            this.$motivated_problems = Lisp.NIL;
            this.$set_aside_problems = Lisp.NIL;
            this.$should_reconsider_set_asidesP = Lisp.NIL;
            this.$productivity_limit = Lisp.NIL;
            this.$removal_backtracking_productivity_limit = Lisp.NIL;
            this.$proof_spec = Lisp.NIL;
            this.$problem_proof_spec_index = Lisp.NIL;
            this.$problem_strategic_index = Lisp.NIL;
            this.$memoization_state = Lisp.NIL;
            this.$step_count = Lisp.NIL;
            this.$type = Lisp.NIL;
            this.$data = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return this.$inference;
        }

        @Override
        public SubLObject getField4() {
            return this.$result_uniqueness_criterion;
        }

        @Override
        public SubLObject getField5() {
            return this.$active_problems;
        }

        @Override
        public SubLObject getField6() {
            return this.$motivated_problems;
        }

        @Override
        public SubLObject getField7() {
            return this.$set_aside_problems;
        }

        @Override
        public SubLObject getField8() {
            return this.$should_reconsider_set_asidesP;
        }

        @Override
        public SubLObject getField9() {
            return this.$productivity_limit;
        }

        @Override
        public SubLObject getField10() {
            return this.$removal_backtracking_productivity_limit;
        }

        @Override
        public SubLObject getField11() {
            return this.$proof_spec;
        }

        @Override
        public SubLObject getField12() {
            return this.$problem_proof_spec_index;
        }

        @Override
        public SubLObject getField13() {
            return this.$problem_strategic_index;
        }

        @Override
        public SubLObject getField14() {
            return this.$memoization_state;
        }

        @Override
        public SubLObject getField15() {
            return this.$step_count;
        }

        @Override
        public SubLObject getField16() {
            return this.$type;
        }

        @Override
        public SubLObject getField17() {
            return this.$data;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$result_uniqueness_criterion = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$active_problems = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$motivated_problems = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$set_aside_problems = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$should_reconsider_set_asidesP = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$productivity_limit = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$removal_backtracking_productivity_limit = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$proof_spec = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$problem_proof_spec_index = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$problem_strategic_index = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$memoization_state = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$step_count = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$data = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_strategy.$strategy_native.class, STRATEGY, STRATEGY_P, $list2, $list3, new String[]{ "$suid", "$inference", "$result_uniqueness_criterion", "$active_problems", "$motivated_problems", "$set_aside_problems", "$should_reconsider_set_asidesP", "$productivity_limit", "$removal_backtracking_productivity_limit", "$proof_spec", "$problem_proof_spec_index", "$problem_strategic_index", "$memoization_state", "$step_count", "$type", "$data" }, $list4, $list5, PRINT_STRATEGY);
        }
    }

    public static final class $strategy_p$UnaryFunction extends UnaryFunction {
        public $strategy_p$UnaryFunction() {
            super(extractFunctionNamed("STRATEGY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return strategy_p(arg1);
        }
    }

    public static final class $sxhash_strategy_method$UnaryFunction extends UnaryFunction {
        public $sxhash_strategy_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-STRATEGY-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_strategy_method(arg1);
        }
    }

    public static final class $problem_strategic_properties_native extends SubLStructNative {
        public SubLObject $status;

        public SubLObject $tactic_strategic_property_index;

        public SubLObject $possible_tactic_count;

        public SubLObject $uninterestingness;

        private static final SubLStructDeclNative structDecl;

        public $problem_strategic_properties_native() {
            this.$status = Lisp.NIL;
            this.$tactic_strategic_property_index = Lisp.NIL;
            this.$possible_tactic_count = Lisp.NIL;
            this.$uninterestingness = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$status;
        }

        @Override
        public SubLObject getField3() {
            return this.$tactic_strategic_property_index;
        }

        @Override
        public SubLObject getField4() {
            return this.$possible_tactic_count;
        }

        @Override
        public SubLObject getField5() {
            return this.$uninterestingness;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$tactic_strategic_property_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$possible_tactic_count = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$uninterestingness = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_strategy.$problem_strategic_properties_native.class, PROBLEM_STRATEGIC_PROPERTIES, PROBLEM_STRATEGIC_PROPERTIES_P, $list119, $list120, new String[]{ "$status", "$tactic_strategic_property_index", "$possible_tactic_count", "$uninterestingness" }, $list121, $list122, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $problem_strategic_properties_p$UnaryFunction extends UnaryFunction {
        public $problem_strategic_properties_p$UnaryFunction() {
            super(extractFunctionNamed("PROBLEM-STRATEGIC-PROPERTIES-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return problem_strategic_properties_p(arg1);
        }
    }

    public static final class $tactic_strategic_properties_native extends SubLStructNative {
        public SubLObject $preference_level;

        public SubLObject $preference_level_justification;

        public SubLObject $productivity;

        public SubLObject $uninterestingness;

        private static final SubLStructDeclNative structDecl;

        public $tactic_strategic_properties_native() {
            this.$preference_level = Lisp.NIL;
            this.$preference_level_justification = Lisp.NIL;
            this.$productivity = Lisp.NIL;
            this.$uninterestingness = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$preference_level;
        }

        @Override
        public SubLObject getField3() {
            return this.$preference_level_justification;
        }

        @Override
        public SubLObject getField4() {
            return this.$productivity;
        }

        @Override
        public SubLObject getField5() {
            return this.$uninterestingness;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$preference_level = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$preference_level_justification = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$productivity = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$uninterestingness = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_strategy.$tactic_strategic_properties_native.class, TACTIC_STRATEGIC_PROPERTIES, TACTIC_STRATEGIC_PROPERTIES_P, $list156, $list157, new String[]{ "$preference_level", "$preference_level_justification", "$productivity", "$uninterestingness" }, $list158, $list159, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $tactic_strategic_properties_p$UnaryFunction extends UnaryFunction {
        public $tactic_strategic_properties_p$UnaryFunction() {
            super(extractFunctionNamed("TACTIC-STRATEGIC-PROPERTIES-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tactic_strategic_properties_p(arg1);
        }
    }
}

/**
 * Total time: 824 ms
 */
