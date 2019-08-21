package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.constrained_parsing;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.quirk.definitional_question;
import com.cyc.cycjava.cycl.quirk.question;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.constrained_parsing.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.constrained_parsing.*; 
 public final class constrained_parsing extends SubLTranslatedFile {
    public static final SubLFile me = new constrained_parsing();

    public static final String myName = "com.cyc.cycjava.cycl.constrained_parsing";

    public static final String myFingerPrint = "d5e1cd29a368a344766ea5c3a6c6021ef28cc1c096ba406a7c7534cfa8185f6d";



    // defparameter
    private static final SubLSymbol $constrained_parsing_without_assertingP$ = makeSymbol("*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*");

    // defparameter
    public static final SubLSymbol $constrained_parsing_tracking_stringsP$ = makeSymbol("*CONSTRAINED-PARSING-TRACKING-STRINGS?*");

    // defparameter
    public static final SubLSymbol $constrained_parsing_tracking_substringsP$ = makeSymbol("*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*");





    // defparameter
    private static final SubLSymbol $constrained_parsing_case_sensitiveP$ = makeSymbol("*CONSTRAINED-PARSING-CASE-SENSITIVE?*");

    // defparameter
    private static final SubLSymbol $constrained_parsing_assert_into_mt$ = makeSymbol("*CONSTRAINED-PARSING-ASSERT-INTO-MT*");

    // defparameter
    private static final SubLSymbol $constrained_parsing_consider_adjectivesP$ = makeSymbol("*CONSTRAINED-PARSING-CONSIDER-ADJECTIVES?*");

    // defparameter
    private static final SubLSymbol $constrained_parsing_cardinality_known$ = makeSymbol("*CONSTRAINED-PARSING-CARDINALITY-KNOWN*");

    // defparameter
    private static final SubLSymbol $constrained_parsing_allow_group_coercionP$ = makeSymbol("*CONSTRAINED-PARSING-ALLOW-GROUP-COERCION?*");

    // defparameter
    private static final SubLSymbol $new_isa_permissiveness_principles$ = makeSymbol("*NEW-ISA-PERMISSIVENESS-PRINCIPLES*");

    // defparameter
    private static final SubLSymbol $parsing_flow_control_principles$ = makeSymbol("*PARSING-FLOW-CONTROL-PRINCIPLES*");

    // defconstant
    public static final SubLSymbol $dtp_parsing_faithfulness_filter$ = makeSymbol("*DTP-PARSING-FAITHFULNESS-FILTER*");

    // defparameter
    /**
     * As in 'faithfulness to the KB' - establishes where 'is this ok to assert?'
     * queries are asked
     */
    private static final SubLSymbol $parsing_faithfulness_filter_types$ = makeSymbol("*PARSING-FAITHFULNESS-FILTER-TYPES*");

    // defparameter
    private static final SubLSymbol $default_faithfulness_filter$ = makeSymbol("*DEFAULT-FAITHFULNESS-FILTER*");

    // defparameter
    private static final SubLSymbol $default_definitional_faithfulness_filter$ = makeSymbol("*DEFAULT-DEFINITIONAL-FAITHFULNESS-FILTER*");

    // defconstant
    public static final SubLSymbol $dtp_parsing_arbitrary_filter$ = makeSymbol("*DTP-PARSING-ARBITRARY-FILTER*");

    // defparameter
    private static final SubLSymbol $parsing_arbitrary_filter_types$ = makeSymbol("*PARSING-ARBITRARY-FILTER-TYPES*");

    // defparameter
    private static final SubLSymbol $default_assertion_filter$ = makeSymbol("*DEFAULT-ASSERTION-FILTER*");

    // defparameter
    private static final SubLSymbol $default_definitional_assertion_filter$ = makeSymbol("*DEFAULT-DEFINITIONAL-ASSERTION-FILTER*");

    // defparameter
    private static final SubLSymbol $bug_avoidance_principles$ = makeSymbol("*BUG-AVOIDANCE-PRINCIPLES*");

    // defparameter
    public static final SubLSymbol $constrained_parsing_query_max_transformation_depth$ = makeSymbol("*CONSTRAINED-PARSING-QUERY-MAX-TRANSFORMATION-DEPTH*");

    // defparameter
    public static final SubLSymbol $constrained_parsing_query_max_time$ = makeSymbol("*CONSTRAINED-PARSING-QUERY-MAX-TIME*");

    // defparameter
    public static final SubLSymbol $constrained_parsing_query_productivity_limit$ = makeSymbol("*CONSTRAINED-PARSING-QUERY-PRODUCTIVITY-LIMIT*");

    // defparameter
    private static final SubLSymbol $trace_new_cyc_queryP$ = makeSymbol("*TRACE-NEW-CYC-QUERY?*");

    // defparameter
    private static final SubLSymbol $debug_new_cyc_queryP$ = makeSymbol("*DEBUG-NEW-CYC-QUERY?*");

    // defparameter
    private static final SubLSymbol $constrained_parsing_rewrite_backtrackingP$ = makeSymbol("*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*");

    // defparameter
    private static final SubLSymbol $with_faithfulness_cutoffP$ = makeSymbol("*WITH-FAITHFULNESS-CUTOFF?*");

    // defparameter
    private static final SubLSymbol $skip_definitional_faithfulnessP$ = makeSymbol("*SKIP-DEFINITIONAL-FAITHFULNESS?*");

    // defparameter
    private static final SubLSymbol $with_arbitrary_filter_cutoffP$ = makeSymbol("*WITH-ARBITRARY-FILTER-CUTOFF?*");

    // defparameter
    private static final SubLSymbol $with_bug_avoidance_cutoffP$ = makeSymbol("*WITH-BUG-AVOIDANCE-CUTOFF?*");

    // defparameter
    private static final SubLSymbol $constrained_parsing_show_inference_metricsP$ = makeSymbol("*CONSTRAINED-PARSING-SHOW-INFERENCE-METRICS?*");

    // defparameter
    private static final SubLSymbol $acquaint_highly_relevant_cutoff$ = makeSymbol("*ACQUAINT-HIGHLY-RELEVANT-CUTOFF*");

    // defparameter
    private static final SubLSymbol $acquaint_demo_assertion_filter$ = makeSymbol("*ACQUAINT-DEMO-ASSERTION-FILTER*");

    // defparameter
    private static final SubLSymbol $acquaint_demo_lexical_assertion_filter$ = makeSymbol("*ACQUAINT-DEMO-LEXICAL-ASSERTION-FILTER*");

    private static final SubLObject $$SubcollectionDenotingFunction = reader_make_constant_shell(makeString("SubcollectionDenotingFunction"));

    public static final SubLSymbol $constrained_parsing_rankings$ = makeSymbol("*CONSTRAINED-PARSING-RANKINGS*");



    public static final SubLList $list3 = list(list(makeSymbol("*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*"), T));

    public static final SubLList $list4 = list(list(makeSymbol("*CONSTRAINED-PARSING-TRACKING-STRINGS?*"), T));

    public static final SubLList $list5 = list(list(makeSymbol("*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*"), T));

    public static final SubLList $list6 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLSymbol $sym8$__ = makeSymbol(">=");

    public static final SubLSymbol $constrained_parsing_trace_level$ = makeSymbol("*CONSTRAINED-PARSING-TRACE-LEVEL*");



    public static final SubLSymbol $constrained_parsing_action_log$ = makeSymbol("*CONSTRAINED-PARSING-ACTION-LOG*");



































    public static final SubLSymbol PARSING_FAITHFULNESS_FILTER = makeSymbol("PARSING-FAITHFULNESS-FILTER");

    public static final SubLSymbol PARSING_FAITHFULNESS_FILTER_P = makeSymbol("PARSING-FAITHFULNESS-FILTER-P");

    public static final SubLList $list31 = list(makeSymbol("TYPE"), makeSymbol("MT"));

    public static final SubLList $list32 = list(makeKeyword("TYPE"), makeKeyword("MT"));

    public static final SubLList $list33 = list(makeSymbol("PARSING-FAITHFULNESS-FILTER-TYPE"), makeSymbol("PARSING-FAITHFULNESS-FILTER-MT"));

    public static final SubLList $list34 = list(makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE"), makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-MT"));

    public static final SubLSymbol PPRINT_FAITHFULNESS_FILTER = makeSymbol("PPRINT-FAITHFULNESS-FILTER");

    public static final SubLSymbol PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARSING-FAITHFULNESS-FILTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list37 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARSING-FAITHFULNESS-FILTER-P"));

    private static final SubLSymbol PARSING_FAITHFULNESS_FILTER_TYPE = makeSymbol("PARSING-FAITHFULNESS-FILTER-TYPE");

    private static final SubLSymbol _CSETF_PARSING_FAITHFULNESS_FILTER_TYPE = makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE");

    private static final SubLSymbol PARSING_FAITHFULNESS_FILTER_MT = makeSymbol("PARSING-FAITHFULNESS-FILTER-MT");

    private static final SubLSymbol _CSETF_PARSING_FAITHFULNESS_FILTER_MT = makeSymbol("_CSETF-PARSING-FAITHFULNESS-FILTER-MT");





    private static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PARSING_FAITHFULNESS_FILTER = makeSymbol("MAKE-PARSING-FAITHFULNESS-FILTER");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSING-FAITHFULNESS-FILTER-METHOD");

    private static final SubLString $str50$__PARSING_FAITHFULNESS_FILTER__A_ = makeString("#<PARSING-FAITHFULNESS-FILTER ~A ~A>");







    private static final SubLSymbol PARSING_FAITHFULNESS_FILTER_TYPE_P = makeSymbol("PARSING-FAITHFULNESS-FILTER-TYPE-P");

    private static final SubLSymbol $sym55$MT_IN_ANY_MT_ = makeSymbol("MT-IN-ANY-MT?");

    private static final SubLSymbol PARSING_ARBITRARY_FILTER = makeSymbol("PARSING-ARBITRARY-FILTER");

    private static final SubLSymbol PARSING_ARBITRARY_FILTER_P = makeSymbol("PARSING-ARBITRARY-FILTER-P");

    private static final SubLList $list58 = list(makeSymbol("TYPE"), makeSymbol("DETAILS"), makeSymbol("MT"));

    private static final SubLList $list59 = list(makeKeyword("TYPE"), makeKeyword("DETAILS"), makeKeyword("MT"));

    private static final SubLList $list60 = list(makeSymbol("PARSING-ARBITRARY-FILTER-TYPE"), makeSymbol("PARSING-ARBITRARY-FILTER-DETAILS"), makeSymbol("PARSING-ARBITRARY-FILTER-MT"));

    private static final SubLList $list61 = list(makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-TYPE"), makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-DETAILS"), makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-MT"));

    private static final SubLSymbol PPRINT_ARBITRARY_FILTER = makeSymbol("PPRINT-ARBITRARY-FILTER");

    private static final SubLSymbol PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARSING-ARBITRARY-FILTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list64 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARSING-ARBITRARY-FILTER-P"));

    private static final SubLSymbol PARSING_ARBITRARY_FILTER_TYPE = makeSymbol("PARSING-ARBITRARY-FILTER-TYPE");

    private static final SubLSymbol _CSETF_PARSING_ARBITRARY_FILTER_TYPE = makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-TYPE");

    private static final SubLSymbol PARSING_ARBITRARY_FILTER_DETAILS = makeSymbol("PARSING-ARBITRARY-FILTER-DETAILS");

    private static final SubLSymbol _CSETF_PARSING_ARBITRARY_FILTER_DETAILS = makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-DETAILS");

    private static final SubLSymbol PARSING_ARBITRARY_FILTER_MT = makeSymbol("PARSING-ARBITRARY-FILTER-MT");

    private static final SubLSymbol _CSETF_PARSING_ARBITRARY_FILTER_MT = makeSymbol("_CSETF-PARSING-ARBITRARY-FILTER-MT");



    private static final SubLSymbol MAKE_PARSING_ARBITRARY_FILTER = makeSymbol("MAKE-PARSING-ARBITRARY-FILTER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSING-ARBITRARY-FILTER-METHOD");

    private static final SubLString $str74$__PARSING_ARBITRARY_FILTER__A__A_ = makeString("#<PARSING-ARBITRARY-FILTER ~A ~A ~A>");







    private static final SubLSymbol PARSING_ARBITRARY_FILTER_TYPE_P = makeSymbol("PARSING-ARBITRARY-FILTER-TYPE-P");









    private static final SubLList $list83 = list(list(makeSymbol("CONSTRAINT")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list85 = list(list(makeSymbol("CURRENT-PARSING-CONSTRAINT-RANKINGS")));

    private static final SubLList $list86 = list(list(makeSymbol("PRINCIPLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CONSTRAINED_PARSING_PRINCIPLE_P = makeSymbol("CONSTRAINED-PARSING-PRINCIPLE-P");

    private static final SubLList $list88 = list(list(makeSymbol("FILTER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PARSING_FILTER_P = makeSymbol("PARSING-FILTER-P");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLObject $$GrandLiftPredicate = reader_make_constant_shell(makeString("GrandLiftPredicate"));

    private static final SubLSymbol PARSING_CONSTRAINT_P = makeSymbol("PARSING-CONSTRAINT-P");

    private static final SubLString $str95$A_constraint_can_t_outrank_itself = makeString("A constraint can't outrank itself!");





    private static final SubLString $str98$_A_and_or__A_missing_from_ranking = makeString("~A and/or ~A missing from rankings:~%~A~%");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLInteger $int$2000000 = makeInteger(2000000);

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");





    private static final SubLList $list104 = list(list(makeSymbol("*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*"), NIL));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));















    private static final SubLString $str116$_S_in__A_may_have_had_more_answer = makeString("~S in ~A may have had more answers available");

    private static final SubLString $str117$_S_in__A_exited_abnormally___A = makeString("~S in ~A exited abnormally: ~A");

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));



    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym121$_RELN = makeSymbol("?RELN");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$argN = reader_make_constant_shell(makeString("argN"));

    public static final SubLList $list124 = list(reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?RELN"), reader_make_constant_shell(makeString("isa")));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLList $list126 = list(reader_make_constant_shell(makeString("Group")));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list129 = list(reader_make_constant_shell(makeString("Person")));

    private static final SubLSymbol $sym130$_KNOWN_TO_BE = makeSymbol("?KNOWN-TO-BE");

    private static final SubLObject $$operatorFormulas = reader_make_constant_shell(makeString("operatorFormulas"));

    private static final SubLObject $$GroupOfCardinalityFn = reader_make_constant_shell(makeString("GroupOfCardinalityFn"));

    private static final SubLList $list133 = list(makeSymbol("?KNOWN-TO-BE"));

    private static final SubLList $list134 = list(reader_make_constant_shell(makeString("operatorFormulas")), reader_make_constant_shell(makeString("GroupOfCardinalityFn")), makeSymbol("?KNOWN-TO-BE"));

    private static final SubLList $list135 = list(reader_make_constant_shell(makeString("argN")), makeSymbol("?COL1"), ONE_INTEGER, makeSymbol("?KNOWN-TO-BE"));

    private static final SubLSymbol $sym136$_COL2 = makeSymbol("?COL2");

    private static final SubLList $list137 = list(list(reader_make_constant_shell(makeString("equals")), makeSymbol("?COL1"), makeSymbol("?COL2")));

    private static final SubLSymbol $sym138$_Y = makeSymbol("?Y");

    private static final SubLSymbol $sym139$_X = makeSymbol("?X");

    public static final SubLList $list140 = list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?Y"), makeSymbol("?X"))));



    private static final SubLString $str142$____investigating__A_faithfulness = makeString("*** investigating ~A faithfulness cutoff? ~A arbitrary filter cutoff? ~A~%");



    private static final SubLString $str144$_____S_will_be_asserted_into__A__ = makeString("*** ~S will be asserted into ~A, if at all~%");

    private static final SubLSymbol $sym145$_COL = makeSymbol("?COL");



    private static final SubLSymbol UNASSERT = makeSymbol("UNASSERT");



    private static final SubLList $list149 = list(makeSymbol("PRED"), makeSymbol("THE-TERM"), makeSymbol("ARG2"));

    private static final SubLObject $$Group = reader_make_constant_shell(makeString("Group"));

    private static final SubLObject $$GroupFn = reader_make_constant_shell(makeString("GroupFn"));

    public static final SubLList $list152 = list(makeSymbol("THIS-ISA"), makeSymbol("THIS-MT"));

    private static final SubLObject $$hypothesizedIsaCoercedInto = reader_make_constant_shell(makeString("hypothesizedIsaCoercedInto"));

    private static final SubLList $list154 = list(makeSymbol("?COL"), makeSymbol("?ANYWHERE"));

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLSymbol $sym156$_ANYWHERE = makeSymbol("?ANYWHERE");

    private static final SubLList $list157 = list(makeSymbol("?COL"));

    private static final SubLObject $$sourceOfTerm = reader_make_constant_shell(makeString("sourceOfTerm"));



    private static final SubLSymbol FI_ASSERT_INT = makeSymbol("FI-ASSERT-INT");

    private static final SubLList $list161 = list(makeSymbol("GAF"), makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("MT"), makeKeyword("DEFAULT")), list(makeSymbol("SOURCE"), NIL), list(makeSymbol("RECORD-FILTER"), NIL), list(makeSymbol("RECORD-NULL"), NIL));

    private static final SubLList $list162 = list(makeKeyword("MT"), makeKeyword("SOURCE"), makeKeyword("RECORD-FILTER"), makeKeyword("RECORD-NULL"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLSymbol $sym167$CHANNEL_SAYS = makeUninternedSymbol("CHANNEL-SAYS");

    private static final SubLSymbol CONSTRAINED_PARSING_POSSIBLY_ASSERT = makeSymbol("CONSTRAINED-PARSING-POSSIBLY-ASSERT");







    private static final SubLList $list172 = list(makeKeyword("WORK-DONE"));



    private static final SubLObject $$PositiveIntegerExtent = reader_make_constant_shell(makeString("PositiveIntegerExtent"));

    private static final SubLList $list175 = list(makeSymbol("TERM"), makeSymbol("COL"), makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("SOURCE"));

    public static final SubLList $list176 = list(makeKeyword("SOURCE"));

    private static final SubLSymbol $sym177$GROUP_COL = makeUninternedSymbol("GROUP-COL");

    private static final SubLSymbol CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS = makeSymbol("CONSTRAINED-PARSING-ASSERT-THROUGH-CHANNELS");



    private static final SubLString $$$of = makeString("of");

    private static final SubLSymbol $sym181$_WU = makeSymbol("?WU");

    private static final SubLObject $$prepositionStrings = reader_make_constant_shell(makeString("prepositionStrings"));

    private static final SubLObject $$partOfSpeech = reader_make_constant_shell(makeString("partOfSpeech"));

    private static final SubLSymbol $sym184$_POS = makeSymbol("?POS");

    public static final SubLList $list185 = list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?POS"), reader_make_constant_shell(makeString("Complementizer"))), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?POS"), reader_make_constant_shell(makeString("WHPronoun")))));







    private static final SubLSymbol SUBCOLLECTION_NAUT_P = makeSymbol("SUBCOLLECTION-NAUT-P");

    private static final SubLString $str190$____rejected_potential_parse_of__ = makeString("*** rejected potential parse of ~A for ~A");

    private static final SubLObject $$nounStrings = reader_make_constant_shell(makeString("nounStrings"));



    private static final SubLObject $$termPhrases = reader_make_constant_shell(makeString("termPhrases"));

    public static final SubLList $list194 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COL"), reader_make_constant_shell(makeString("Collection"))));

    private static final SubLString $str195$____remaining_parses_are__A_w_car = makeString("*** remaining parses are ~A w/cardinality ~A~%");



    private static final SubLSymbol $sym197$_COL_TYPE = makeSymbol("?COL-TYPE");

    private static final SubLSymbol $sym198$_FACETING_COL = makeSymbol("?FACETING-COL");

    private static final SubLSymbol $sym199$_SOMEWHERE = makeSymbol("?SOMEWHERE");

    private static final SubLSymbol $sym200$_TERM_COL = makeSymbol("?TERM-COL");

    private static final SubLList $list201 = list(makeSymbol("?COL-TYPE"));

    private static final SubLList $list202 = list(reader_make_constant_shell(makeString("genls")), makeSymbol("?COL-TYPE"), makeSymbol("?FACETING-COL"));

    private static final SubLList $list203 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?FACETING-COL"), reader_make_constant_shell(makeString("FacetingCollectionType")));

    private static final SubLList $list204 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COL"), makeSymbol("?TERM-COL")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?TERM-COL"), makeSymbol("?FACETING-COL")));

    public static final SubLList $list205 = list(makeSymbol("CARDINALITY"), makeSymbol("STRINGS"));



    private static final SubLObject $$adjStrings = reader_make_constant_shell(makeString("adjStrings"));





    private static final SubLString $str210$_ = makeString(",");

    private static final SubLSymbol $sym211$_DENOT = makeSymbol("?DENOT");

    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLList $list214 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("PositiveInteger"))));

    public static final SubLList $list215 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("PositiveIntegerExtent"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("PositiveInteger")))));

    private static final SubLList $list216 = list(reader_make_constant_shell(makeString("PositiveIntegerExtent")));

    public static final SubLList $list217 = list(makeSymbol("?STRING"));

    private static final SubLList $list218 = list(list(reader_make_constant_shell(makeString("termStrings")), makeSymbol("?DENOT"), makeSymbol("?STRING")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?DENOT"), reader_make_constant_shell(makeString("PositiveInteger"))));

    private static final SubLObject $$preferredNameString = reader_make_constant_shell(makeString("preferredNameString"));

    private static final SubLString $str220$____found__at_least___A_and__A_as = makeString("*** found (at least) ~A and ~A as rewrite possibilities for ~A");

    private static final SubLString $str221$____setting_rewrite_option_to__S = makeString("*** setting rewrite option to ~S");

    private static final SubLSymbol $sym222$_WHO = makeSymbol("?WHO");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    public static final SubLList $list224 = list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?CORE"), list(reader_make_constant_shell(makeString("rewriteOf")), makeSymbol("?CORE"), makeSymbol("?WHO"))));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    public static final SubLList $list226 = list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?WHO"), makeSymbol("?COL"))));





    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$subFields = reader_make_constant_shell(makeString("subFields"));

    private static final SubLObject $$admittedArgument = reader_make_constant_shell(makeString("admittedArgument"));

    private static final SubLObject $$wordStrings = reader_make_constant_shell(makeString("wordStrings"));

    public static final SubLList $list233 = list(reader_make_constant_shell(makeString("denotationRelatedTo")), makeSymbol("?WU"), makeSymbol("??POS"), makeSymbol("??WS"), makeSymbol("?DENOT"));

    private static final SubLSymbol $sym234$_FUNC = makeSymbol("?FUNC");

    public static final SubLList $list235 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?FUNC"), reader_make_constant_shell(makeString("ReifiableFunction"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?FUNC"), reader_make_constant_shell(makeString("UnaryFunction"))));

    private static final SubLObject $$RelationParaphraseMt = reader_make_constant_shell(makeString("RelationParaphraseMt"));

    private static final SubLList $list237 = list(reader_make_constant_shell(makeString("CollectionDenotingFunction")));

    private static final SubLList $list238 = list(makeSymbol("PRED"), makeSymbol("COL1"), makeSymbol("COL2"));

    private static final SubLObject $$relationExistsInstance = reader_make_constant_shell(makeString("relationExistsInstance"));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    public static final SubLList $list241 = list(reader_make_constant_shell(makeString("denotationRelatedTo")), makeSymbol("?WU"), makeSymbol("?POS"), makeSymbol("?WS"), makeSymbol("?DENOT"));

    private static final SubLList $list242 = list(makeSymbol("?PRED"), makeSymbol("?COL1"), makeSymbol("?COL2"));

    private static final SubLSymbol $sym243$_PRED = makeSymbol("?PRED");

    private static final SubLList $list244 = list(TWO_INTEGER, makeSymbol("?PRED"));

    private static final SubLList $list245 = list(list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?SOMEWHERE"), list(reader_make_constant_shell(makeString("arg1Isa")), makeSymbol("?PRED"), makeSymbol("?COL1"))), list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?ANYWHERE"), list(reader_make_constant_shell(makeString("arg2Isa")), makeSymbol("?PRED"), makeSymbol("?COL2"))));

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    private static final SubLObject $$Organization = reader_make_constant_shell(makeString("Organization"));

    private static final SubLObject $$GeopoliticalEntity = reader_make_constant_shell(makeString("GeopoliticalEntity"));

    public static final SubLList $list249 = list(reader_make_constant_shell(makeString("Business")));

    private static final SubLList $list250 = list(reader_make_constant_shell(makeString("Organization")));

    private static final SubLObject $$substring = reader_make_constant_shell(makeString("substring"));

    private static final SubLString $str252$___Co = makeString(" & Co");

    private static final SubLString $$$_Company = makeString(" Company");

    private static final SubLString $$$_Plc = makeString(" Plc");

    private static final SubLString $$$_Ltd = makeString(" Ltd");

    private static final SubLObject $$Business = reader_make_constant_shell(makeString("Business"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list258 = list(reader_make_constant_shell(makeString("HomoSapiens")));

    private static final SubLSymbol $sym259$_CONSTANT = makeSymbol("?CONSTANT");

    private static final SubLList $list260 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CONSTANT"), reader_make_constant_shell(makeString("HumanGivenName")));

    private static final SubLObject $$nameSpelling = reader_make_constant_shell(makeString("nameSpelling"));

    private static final SubLObject $$givenNames = reader_make_constant_shell(makeString("givenNames"));

    private static final SubLList $list263 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CONSTANT"), reader_make_constant_shell(makeString("HumanSurname")));

    private static final SubLObject $$familyName = reader_make_constant_shell(makeString("familyName"));

    private static final SubLSymbol $sym265$_SALUT = makeSymbol("?SALUT");

    private static final SubLObject $$codeMapping = reader_make_constant_shell(makeString("codeMapping"));

    private static final SubLObject $$SalutationMapping = reader_make_constant_shell(makeString("SalutationMapping"));

    private static final SubLList $list268 = list(makeSymbol("?SALUT"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLObject $$salutation = reader_make_constant_shell(makeString("salutation"));

    private static final SubLObject $$BBN_CDE_StrengthenedMt = reader_make_constant_shell(makeString("BBN-CDE-StrengthenedMt"));

    private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

    private static final SubLString $str273$____DEMO__initializing_rankings_w = makeString("*** DEMO: initializing rankings with :AvoidRedundantFacets suppressed");

    private static final SubLString $str274$____DEMO__reverting_to_standard_c = makeString("*** DEMO: reverting to standard constraint rankings (and our mt preferences)");

    private static final SubLSymbol GET_RELEVANCE = makeSymbol("GET-RELEVANCE");

    private static final SubLSymbol CAPITALIZED_STRING_P = makeSymbol("CAPITALIZED-STRING-P");

    private static final SubLString $str277$Who_is__A_ = makeString("Who is ~A?");

    private static final SubLSymbol DEFINITIONAL_QUESTION_P = makeSymbol("DEFINITIONAL-QUESTION-P");

    private static final SubLString $str279$____processing__A = makeString("*** processing ~A");





    private static final SubLString $str282$_S__ = makeString("~S~%");

    private static final SubLString $str283$____DEMO_____isa__A__A__wasn_t_fo = makeString("*** DEMO: (#$isa ~A ~A) wasn't found");

    private static final SubLString $$$Tony_Blair = makeString("Tony Blair");

    private static final SubLObject $$TonyBlair = reader_make_constant_shell(makeString("TonyBlair"));

    private static final SubLSymbol $sym286$_WHERE = makeSymbol("?WHERE");

    private static final SubLList $list287 = list(reader_make_constant_shell(makeString("primeMinister")), makeSymbol("?WHERE"), reader_make_constant_shell(makeString("TonyBlair")));

    private static final SubLString $str288$____DEMO_____primeMinister_WHATEV = makeString("*** DEMO: (#$primeMinister WHATEVER #$TonyBlair) apparently wasn't added");

    private static final SubLObject $$Warrior = reader_make_constant_shell(makeString("Warrior"));

    private static final SubLString $str290$____DEMO____TonyBlair_was_mistake = makeString("*** DEMO: #$TonyBlair was mistakenly asserted to be a #$Warrior");

    private static final SubLString $$$Saddam_Hussein = makeString("Saddam Hussein");

    private static final SubLObject $$SaddamHusseinAl_Takriti = reader_make_constant_shell(makeString("SaddamHusseinAl-Takriti"));

    private static final SubLObject $$Vicious = reader_make_constant_shell(makeString("Vicious"));

    private static final SubLObject $$PresidentFn = reader_make_constant_shell(makeString("PresidentFn"));

    private static final SubLObject $$Iraq = reader_make_constant_shell(makeString("Iraq"));

    private static final SubLString $$$Bill_Clinton = makeString("Bill Clinton");

    private static final SubLObject $$BillClinton = reader_make_constant_shell(makeString("BillClinton"));

    private static final SubLObject $$UnitedStatesOfAmerica = reader_make_constant_shell(makeString("UnitedStatesOfAmerica"));

    private static final SubLString $$$Osama = makeString("Osama");

    private static final SubLObject $$OsamaBinLaden = reader_make_constant_shell(makeString("OsamaBinLaden"));

    private static final SubLString $str301$____DEMO_____isa___SaddamHusseinA = makeString("*** DEMO: (#$isa #$SaddamHusseinAl-Takriti ~A) is missing!");

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject list_of_not_disjoint_collections_p(final SubLObject the_list) {
        SubLObject cdolist_list_var = the_list;
        SubLObject this_item = NIL;
        this_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == fort_types_interface.collection_in_any_mtP(this_item)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        } 
        return makeBoolean(NIL == disjoint_with.any_disjoint_collection_pairP(the_list, UNPROVIDED));
    }

    public static SubLObject subcollection_naut_p(final SubLObject candidate) {
        return makeBoolean((NIL != list_utilities.proper_list_p(candidate)) && (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(candidate), $$SubcollectionDenotingFunction)));
    }

    public static SubLObject list_elements_preceding(final SubLObject v_object, final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject appearing_before = NIL;
        SubLObject found_itP = NIL;
        if (NIL == found_itP) {
            SubLObject csome_list_var = list;
            SubLObject this_one = NIL;
            this_one = csome_list_var.first();
            while ((NIL == found_itP) && (NIL != csome_list_var)) {
                if (NIL != funcall(test, this_one, v_object)) {
                    found_itP = T;
                } else {
                    appearing_before = cons(this_one, appearing_before);
                }
                csome_list_var = csome_list_var.rest();
                this_one = csome_list_var.first();
            } 
        }
        if (NIL != found_itP) {
            return reverse(appearing_before);
        }
        return NIL;
    }

    public static SubLObject rotate_list_around_pivot(final SubLObject list, final SubLObject the_pivot, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        SubLObject new_list = NIL;
        SubLObject the_copy;
        SubLObject found_pivotP;
        for (the_copy = copy_list(list), found_pivotP = NIL; (NIL != the_copy) && (NIL == found_pivotP); the_copy = the_copy.rest()) {
            if (NIL != funcall(test, the_copy.first(), the_pivot)) {
                found_pivotP = T;
            } else {
                new_list = cons(the_copy.first(), new_list);
            }
        }
        if (NIL == found_pivotP) {
            return list;
        }
        new_list = reverse(new_list);
        SubLObject cdolist_list_var = reverse(the_copy);
        SubLObject this_item = NIL;
        this_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_list = cons(this_item, new_list);
            cdolist_list_var = cdolist_list_var.rest();
            this_item = cdolist_list_var.first();
        } 
        return new_list;
    }

    public static SubLObject current_parsing_constraint_rankings() {
        return copy_list($constrained_parsing_rankings$.getGlobalValue());
    }

    public static SubLObject without_asserting_gafs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    public static SubLObject constrained_parsing_assert_gafsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $constrained_parsing_without_assertingP$.getDynamicValue(thread));
    }

    public static SubLObject while_tracking_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static SubLObject constrained_parsing_tracking_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $constrained_parsing_tracking_stringsP$.getDynamicValue(thread);
    }

    public static SubLObject while_tracking_substrings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static SubLObject constrained_parsing_tracking_substringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $constrained_parsing_tracking_substringsP$.getDynamicValue(thread);
    }

    public static SubLObject constrained_parsing_choose_string_sources(final SubLObject full, final SubLObject partial) {
        if (NIL != constrained_parsing_tracking_stringsP()) {
            return full;
        }
        if (NIL != constrained_parsing_tracking_substringsP()) {
            return partial;
        }
        return NIL;
    }

    public static SubLObject constrained_parsing_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, list($sym8$__, $constrained_parsing_trace_level$, level), listS(WARN, format_str, append(args, NIL)));
    }

    public static SubLObject constrained_parsing_get_actions() {
        return reverse($constrained_parsing_action_log$.getGlobalValue());
    }

    public static SubLObject constrained_parsing_clear_actions() {
        $constrained_parsing_action_log$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject constrained_parsing_record_action(final SubLObject function, final SubLObject args) {
        final SubLObject push_me = cons(function, args);
        $constrained_parsing_action_log$.setGlobalValue(cons(push_me, $constrained_parsing_action_log$.getGlobalValue()));
        return $constrained_parsing_action_log$.getGlobalValue();
    }

    public static SubLObject get_new_isa_permissiveness_principles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($new_isa_permissiveness_principles$.getDynamicValue(thread));
    }

    public static SubLObject new_isa_permissiveness_principle_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(candidate.isKeyword() && (NIL != subl_promotions.memberP(candidate, $new_isa_permissiveness_principles$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject get_parsing_flow_control_principles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($parsing_flow_control_principles$.getDynamicValue(thread));
    }

    public static SubLObject parsing_flow_control_principle_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(candidate.isKeyword() && (NIL != subl_promotions.memberP(candidate, $parsing_flow_control_principles$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject parsing_faithfulness_filter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_faithfulness_filter(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parsing_faithfulness_filter_p(final SubLObject v_object) {
        return v_object.getClass() == $parsing_faithfulness_filter_native.class ? T : NIL;
    }

    public static SubLObject parsing_faithfulness_filter_type(final SubLObject v_object) {
        assert NIL != parsing_faithfulness_filter_p(v_object) : "constrained_parsing.parsing_faithfulness_filter_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject parsing_faithfulness_filter_mt(final SubLObject v_object) {
        assert NIL != parsing_faithfulness_filter_p(v_object) : "constrained_parsing.parsing_faithfulness_filter_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_parsing_faithfulness_filter_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != parsing_faithfulness_filter_p(v_object) : "constrained_parsing.parsing_faithfulness_filter_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_parsing_faithfulness_filter_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != parsing_faithfulness_filter_p(v_object) : "constrained_parsing.parsing_faithfulness_filter_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_parsing_faithfulness_filter(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $parsing_faithfulness_filter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_parsing_faithfulness_filter_type(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_parsing_faithfulness_filter_mt(v_new, current_value);
                } else {
                    Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_parsing_faithfulness_filter(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARSING_FAITHFULNESS_FILTER, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, parsing_faithfulness_filter_type(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, parsing_faithfulness_filter_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARSING_FAITHFULNESS_FILTER, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_parsing_faithfulness_filter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parsing_faithfulness_filter(obj, visitor_fn);
    }

    public static SubLObject pprint_faithfulness_filter(final SubLObject filter, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str50$__PARSING_FAITHFULNESS_FILTER__A_, parsing_faithfulness_filter_type(filter), parsing_faithfulness_filter_mt(filter));
        return NIL;
    }

    public static SubLObject get_parsing_faithfulness_filter_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($parsing_faithfulness_filter_types$.getDynamicValue(thread));
    }

    public static SubLObject parsing_faithfulness_filter_type_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(candidate, $parsing_faithfulness_filter_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_parsing_faithfulness_filters() {
        return list_utilities.find_all_if(PARSING_FAITHFULNESS_FILTER_P, current_parsing_constraint_rankings(), UNPROVIDED);
    }

    public static SubLObject new_parsing_faithfulness_filter(final SubLObject filter, final SubLObject mt) {
        assert NIL != parsing_faithfulness_filter_type_p(filter) : "constrained_parsing.parsing_faithfulness_filter_type_p(filter) " + "CommonSymbols.NIL != constrained_parsing.parsing_faithfulness_filter_type_p(filter) " + filter;
        assert NIL != fort_types_interface.mt_in_any_mtP(mt) : "fort_types_interface.mt_in_any_mtP(mt) " + "CommonSymbols.NIL != fort_types_interface.mt_in_any_mtP(mt) " + mt;
        return make_parsing_faithfulness_filter(list($TYPE, filter, $MT, mt));
    }

    public static SubLObject parsing_arbitrary_filter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_arbitrary_filter(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parsing_arbitrary_filter_p(final SubLObject v_object) {
        return v_object.getClass() == $parsing_arbitrary_filter_native.class ? T : NIL;
    }

    public static SubLObject parsing_arbitrary_filter_type(final SubLObject v_object) {
        assert NIL != parsing_arbitrary_filter_p(v_object) : "constrained_parsing.parsing_arbitrary_filter_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject parsing_arbitrary_filter_details(final SubLObject v_object) {
        assert NIL != parsing_arbitrary_filter_p(v_object) : "constrained_parsing.parsing_arbitrary_filter_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject parsing_arbitrary_filter_mt(final SubLObject v_object) {
        assert NIL != parsing_arbitrary_filter_p(v_object) : "constrained_parsing.parsing_arbitrary_filter_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_parsing_arbitrary_filter_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != parsing_arbitrary_filter_p(v_object) : "constrained_parsing.parsing_arbitrary_filter_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_parsing_arbitrary_filter_details(final SubLObject v_object, final SubLObject value) {
        assert NIL != parsing_arbitrary_filter_p(v_object) : "constrained_parsing.parsing_arbitrary_filter_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_parsing_arbitrary_filter_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != parsing_arbitrary_filter_p(v_object) : "constrained_parsing.parsing_arbitrary_filter_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_parsing_arbitrary_filter(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $parsing_arbitrary_filter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_parsing_arbitrary_filter_type(v_new, current_value);
            } else
                if (pcase_var.eql($DETAILS)) {
                    _csetf_parsing_arbitrary_filter_details(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_parsing_arbitrary_filter_mt(v_new, current_value);
                    } else {
                        Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_parsing_arbitrary_filter(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARSING_ARBITRARY_FILTER, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, parsing_arbitrary_filter_type(obj));
        funcall(visitor_fn, obj, $SLOT, $DETAILS, parsing_arbitrary_filter_details(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, parsing_arbitrary_filter_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARSING_ARBITRARY_FILTER, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_parsing_arbitrary_filter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parsing_arbitrary_filter(obj, visitor_fn);
    }

    public static SubLObject pprint_arbitrary_filter(final SubLObject filter, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str74$__PARSING_ARBITRARY_FILTER__A__A_, new SubLObject[]{ parsing_arbitrary_filter_type(filter), parsing_arbitrary_filter_details(filter), parsing_arbitrary_filter_mt(filter) });
        return NIL;
    }

    public static SubLObject get_parsing_arbitrary_filter_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($parsing_arbitrary_filter_types$.getDynamicValue(thread));
    }

    public static SubLObject parsing_arbitrary_filter_type_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(candidate, $parsing_arbitrary_filter_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_parsing_arbitrary_filters() {
        return list_utilities.find_all_if(PARSING_ARBITRARY_FILTER_P, current_parsing_constraint_rankings(), UNPROVIDED);
    }

    public static SubLObject new_parsing_arbitrary_filter(final SubLObject filter, final SubLObject details, final SubLObject mt) {
        assert NIL != parsing_arbitrary_filter_type_p(filter) : "constrained_parsing.parsing_arbitrary_filter_type_p(filter) " + "CommonSymbols.NIL != constrained_parsing.parsing_arbitrary_filter_type_p(filter) " + filter;
        assert NIL != fort_types_interface.mt_in_any_mtP(mt) : "fort_types_interface.mt_in_any_mtP(mt) " + "CommonSymbols.NIL != fort_types_interface.mt_in_any_mtP(mt) " + mt;
        return make_parsing_arbitrary_filter(list($TYPE, filter, $DETAILS, details, $MT, mt));
    }

    public static SubLObject get_bug_avoidance_principles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($bug_avoidance_principles$.getDynamicValue(thread));
    }

    public static SubLObject bug_avoidance_principle_p(final SubLObject candidate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(candidate.isKeyword() && (NIL != subl_promotions.memberP(candidate, $bug_avoidance_principles$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject parsing_principle_p(final SubLObject candidate) {
        return makeBoolean(((NIL != new_isa_permissiveness_principle_p(candidate)) || (NIL != parsing_flow_control_principle_p(candidate))) || (NIL != bug_avoidance_principle_p(candidate)));
    }

    public static SubLObject parsing_filter_p(final SubLObject candidate) {
        return makeBoolean((NIL != parsing_faithfulness_filter_p(candidate)) || (NIL != parsing_arbitrary_filter_p(candidate)));
    }

    public static SubLObject parsing_filter_type_p(final SubLObject candidate) {
        return makeBoolean((NIL != parsing_faithfulness_filter_type_p(candidate)) || (NIL != parsing_arbitrary_filter_type_p(candidate)));
    }

    public static SubLObject get_all_parsing_principles() {
        return list_utilities.flatten(list(get_parsing_flow_control_principles(), get_new_isa_permissiveness_principles(), get_bug_avoidance_principles()));
    }

    public static SubLObject get_all_parsing_filter_types() {
        return list_utilities.flatten(list(get_parsing_faithfulness_filter_types(), get_parsing_arbitrary_filter_types()));
    }

    public static SubLObject get_all_parsing_filters() {
        return list_utilities.flatten(list(get_parsing_faithfulness_filters(), get_parsing_arbitrary_filters()));
    }

    public static SubLObject get_all_parsing_constraints() {
        return list_utilities.flatten(list(get_all_parsing_principles(), get_all_parsing_filter_types(), get_all_parsing_filters()));
    }

    public static SubLObject parsing_constraint_p(final SubLObject candidate) {
        return makeBoolean(((NIL != parsing_principle_p(candidate)) || (NIL != parsing_filter_type_p(candidate))) || (NIL != parsing_filter_p(candidate)));
    }

    public static SubLObject do_constrained_parsing_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint = NIL;
        destructuring_bind_must_consp(current, datum, $list83);
        constraint = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, bq_cons(constraint, $list85), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list83);
        return NIL;
    }

    public static SubLObject do_constrained_parsing_principles(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject principle = NIL;
        destructuring_bind_must_consp(current, datum, $list86);
        principle = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CDOLIST, bq_cons(principle, $list85), listS(PWHEN, list(CONSTRAINED_PARSING_PRINCIPLE_P, principle), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list86);
        return NIL;
    }

    public static SubLObject do_constrained_parsing_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filter = NIL;
        destructuring_bind_must_consp(current, datum, $list88);
        filter = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CDOLIST, bq_cons(filter, $list85), listS(PWHEN, list(PARSING_FILTER_P, filter), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list88);
        return NIL;
    }

    public static SubLObject initialize_constrained_parsing(SubLObject skip_gafsP, SubLObject skip_safety_netP) {
        if (skip_gafsP == UNPROVIDED) {
            skip_gafsP = NIL;
        }
        if (skip_safety_netP == UNPROVIDED) {
            skip_safety_netP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $constrained_parsing_rankings$.setGlobalValue(NIL);
        order_parsing_constraints($FAITHFULNESSFILTERCUTOFF, $MINIMALTIMEPARSE, UNPROVIDED);
        order_parsing_constraints($ARBITRARYFILTERCUTOFF, $FAITHFULNESSFILTERCUTOFF, UNPROVIDED);
        order_parsing_constraints($PERMISSIVENESSCUTOFF, $MINIMALTIMEPARSE, UNPROVIDED);
        order_parsing_constraints($MINIMALTIMEPARSE, $BUGAVOIDANCECUTOFF, UNPROVIDED);
        order_parsing_constraints($MINIMALTIMEPARSE, $PERMITALLNONDISJOINTISAS, UNPROVIDED);
        order_parsing_constraints($MINIMALTIMEPARSE, $PERMITPPCOMPPARSES, UNPROVIDED);
        order_parsing_constraints($MINIMALTIMEPARSE, $PERMITRELATIVECLAUSEPARSES, UNPROVIDED);
        order_parsing_constraints($NARROWSCOPEPRECISION, $MINIMALTIMEPARSE, UNPROVIDED);
        frontload_parsing_constraint($WIDESCOPEPRECISION);
        order_parsing_constraints($STRIPCARDINALITY, $WIDESCOPEPRECISION, UNPROVIDED);
        order_parsing_constraints($CASESENSITIVELEXICON, $WIDESCOPEPRECISION, UNPROVIDED);
        order_parsing_constraints($NARROWSCOPEPRECISION, $CASEINSENSITIVELEXICON, UNPROVIDED);
        order_parsing_constraints($RELATIONALLINSTANCEPARSE, $PERMISSIVENESSCUTOFF, UNPROVIDED);
        order_parsing_constraints($PERMITNARTISAS, $RELATIONALLINSTANCEPARSE, UNPROVIDED);
        order_parsing_constraints($WIDESCOPEPRECISION, $PERMITADJECTIVEPARSES, UNPROVIDED);
        order_parsing_constraints($AVOIDREDUNDANTFACETS, $PERMITADJECTIVEPARSES, UNPROVIDED);
        order_parsing_constraints($PROHIBITSUBCOLLECTIONFNS, $RELATIONALLINSTANCEPARSE, UNPROVIDED);
        order_parsing_constraints($PROHIBITAMBIGUOUSGAFS, $RELATIONALLINSTANCEPARSE, UNPROVIDED);
        order_parsing_constraints($BUGAVOIDANCECUTOFF, $AVOIDREWRITEPARSES, UNPROVIDED);
        order_parsing_constraints($BUGAVOIDANCECUTOFF, $AVOIDNAMESTRINGPARSES, UNPROVIDED);
        if (NIL == $default_definitional_faithfulness_filter$.getDynamicValue(thread)) {
            $default_definitional_faithfulness_filter$.setDynamicValue(new_parsing_faithfulness_filter($OBEYISASINMT, $$UniversalVocabularyMt), thread);
        }
        if (NIL == $default_faithfulness_filter$.getDynamicValue(thread)) {
            $default_faithfulness_filter$.setDynamicValue(new_parsing_faithfulness_filter($OBEYGAFSINMT, $$BaseKB), thread);
        }
        if (NIL == skip_safety_netP) {
            frontload_parsing_constraint($default_faithfulness_filter$.getDynamicValue(thread));
            frontload_parsing_constraint($default_definitional_faithfulness_filter$.getDynamicValue(thread));
        }
        frontload_parsing_constraint($COMPENSATEFORISAPROBLEMS);
        if (NIL == $default_assertion_filter$.getDynamicValue(thread)) {
            $default_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter($ASSERTINTOMT, $$Relation, $$BaseKB), thread);
        }
        if (NIL == $default_definitional_assertion_filter$.getDynamicValue(thread)) {
            $default_definitional_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter($ASSERTINTOMT, $$GrandLiftPredicate, $$UniversalVocabularyMt), thread);
        }
        if (NIL == skip_gafsP) {
            frontload_parsing_constraint($default_assertion_filter$.getDynamicValue(thread));
            order_parsing_constraints($default_definitional_assertion_filter$.getDynamicValue(thread), $default_assertion_filter$.getDynamicValue(thread), UNPROVIDED);
        }
        return current_parsing_constraint_rankings();
    }

    public static SubLObject parsing_constraint_outranksP(final SubLObject a, final SubLObject b) {
        final SubLObject indexa = position(a, current_parsing_constraint_rankings(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject indexb = position(b, current_parsing_constraint_rankings(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return makeBoolean(indexa.isNumber() && ((!indexb.isNumber()) || indexa.numL(indexb)));
    }

    public static SubLObject which_constraints_outrank(final SubLObject constraint) {
        if (NIL == parsing_constraint_p(constraint)) {
            return NIL;
        }
        return list_elements_preceding(constraint, current_parsing_constraint_rankings(), UNPROVIDED);
    }

    public static SubLObject order_parsing_constraints(final SubLObject wins, final SubLObject loses, SubLObject come_togetherP) {
        if (come_togetherP == UNPROVIDED) {
            come_togetherP = NIL;
        }
        assert NIL != parsing_constraint_p(wins) : "constrained_parsing.parsing_constraint_p(wins) " + "CommonSymbols.NIL != constrained_parsing.parsing_constraint_p(wins) " + wins;
        assert NIL != parsing_constraint_p(loses) : "constrained_parsing.parsing_constraint_p(loses) " + "CommonSymbols.NIL != constrained_parsing.parsing_constraint_p(loses) " + loses;
        if (wins.eql(loses)) {
            Errors.error($str95$A_constraint_can_t_outrank_itself);
        } else {
            final SubLObject before = current_parsing_constraint_rankings();
            if (NIL == before) {
                $constrained_parsing_rankings$.setGlobalValue(list(wins, loses));
            } else
                if ((NIL == subl_promotions.memberP(wins, before, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(loses, before, UNPROVIDED, UNPROVIDED))) {
                    if (come_togetherP.eql($PROMOTE)) {
                        $constrained_parsing_rankings$.setGlobalValue(cons(loses, $constrained_parsing_rankings$.getGlobalValue()));
                        $constrained_parsing_rankings$.setGlobalValue(cons(wins, $constrained_parsing_rankings$.getGlobalValue()));
                    } else {
                        $constrained_parsing_rankings$.setGlobalValue(append($constrained_parsing_rankings$.getGlobalValue(), list(wins, loses)));
                    }
                } else {
                    final SubLObject winner_at = position(wins, before, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject loser_at = position(loses, before, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == winner_at) {
                        if (loser_at.numE(ZERO_INTEGER)) {
                            $constrained_parsing_rankings$.setGlobalValue(cons(wins, $constrained_parsing_rankings$.getGlobalValue()));
                        } else {
                            list_utilities.ninsert_by_position(wins, $constrained_parsing_rankings$.getGlobalValue(), loser_at);
                        }
                    } else
                        if (NIL == loser_at) {
                            list_utilities.ninsert_by_position(loses, $constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X(winner_at));
                        } else
                            if (loser_at.numL(winner_at)) {
                                if (come_togetherP.eql($PROMOTE)) {
                                    list_utilities.remove_nth(winner_at, $constrained_parsing_rankings$.getGlobalValue());
                                    list_utilities.ninsert_by_position(wins, $constrained_parsing_rankings$.getGlobalValue(), loser_at);
                                } else {
                                    $constrained_parsing_rankings$.setGlobalValue(list_utilities.remove_nth(loser_at, $constrained_parsing_rankings$.getGlobalValue()));
                                    list_utilities.ninsert_by_position(loses, $constrained_parsing_rankings$.getGlobalValue(), winner_at);
                                }
                            } else
                                if (come_togetherP.eql($PROMOTE)) {
                                    list_utilities.remove_nth(loser_at, $constrained_parsing_rankings$.getGlobalValue());
                                    list_utilities.ninsert_by_position(loses, $constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X(winner_at));
                                } else
                                    if (come_togetherP.eql($DEMOTE)) {
                                        list_utilities.ninsert_by_position(wins, $constrained_parsing_rankings$.getGlobalValue(), number_utilities.f_1X(loser_at));
                                        list_utilities.remove_nth(winner_at, $constrained_parsing_rankings$.getGlobalValue());
                                    }




                }

        }
        final SubLObject after = current_parsing_constraint_rankings();
        if ((NIL == subl_promotions.memberP(wins, after, UNPROVIDED, UNPROVIDED)) || (NIL == subl_promotions.memberP(loses, after, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str98$_A_and_or__A_missing_from_ranking, wins, loses, after);
        }
        return after;
    }

    public static SubLObject frontload_parsing_constraint(final SubLObject constraint) {
        assert NIL != parsing_constraint_p(constraint) : "constrained_parsing.parsing_constraint_p(constraint) " + "CommonSymbols.NIL != constrained_parsing.parsing_constraint_p(constraint) " + constraint;
        if (NIL != subl_promotions.memberP(constraint, $constrained_parsing_rankings$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) {
            $constrained_parsing_rankings$.setGlobalValue(list_utilities.move_to_front(constraint, $constrained_parsing_rankings$.getGlobalValue(), symbol_function(EQUAL)));
        } else {
            $constrained_parsing_rankings$.setGlobalValue(cons(constraint, $constrained_parsing_rankings$.getGlobalValue()));
        }
        return current_parsing_constraint_rankings();
    }

    public static SubLObject constrained_parsing_query_defaults() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($MAX_TRANSFORMATION_DEPTH, $constrained_parsing_query_max_transformation_depth$.getDynamicValue(thread), $MAX_TIME, $constrained_parsing_query_max_time$.getDynamicValue(thread), $PRODUCTIVITY_LIMIT, $constrained_parsing_query_productivity_limit$.getDynamicValue(thread));
    }

    public static SubLObject without_rewrite_backtracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list104, append(body, NIL));
    }

    public static SubLObject constrained_parsing_rewrite_backtracking(final SubLObject raw_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $constrained_parsing_rewrite_backtrackingP$.getDynamicValue(thread)) {
            return raw_query;
        }
        SubLObject revised_query = NIL;
        SubLObject cdolist_list_var = raw_query;
        SubLObject this_term = NIL;
        this_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (this_term.isList()) {
                revised_query = cons(constrained_parsing_rewrite_backtracking(this_term), revised_query);
            } else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject extent = kb_mapping.gather_gaf_arg_index(this_term, TWO_INTEGER, $$rewriteOf, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.singletonP(extent)) {
                        revised_query = cons(cycl_utilities.formula_arg1(assertions_high.assertion_formula(extent.first()), UNPROVIDED), revised_query);
                    } else {
                        revised_query = cons(this_term, revised_query);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_term = cdolist_list_var.first();
        } 
        return reverse(revised_query);
    }

    public static SubLObject constrained_parsing_query(final SubLObject answer_type, final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sentence) {
            return NIL;
        }
        SubLObject the_answer = NIL;
        SubLObject problem_store = NIL;
        try {
            problem_store = inference_datastructures_problem_store.new_problem_store(NIL);
            final SubLObject the_sentence = (NIL != $constrained_parsing_rewrite_backtrackingP$.getDynamicValue(thread)) ? constrained_parsing_rewrite_backtracking(sentence) : sentence;
            final SubLObject query_properties = append(putf(putf(putf(constrained_parsing_query_defaults(), $PROBLEM_STORE, problem_store), $RETURN, answer_type.isKeyword() ? answer_type : list($TEMPLATE, answer_type)), $BROWSABLE_, T), v_properties);
            SubLObject inference_suspend_status = NIL;
            final SubLObject undo_traceP = NIL;
            thread.resetMultipleValues();
            final SubLObject the_answer_$1 = inference_kernel.new_cyc_query(the_sentence, mt.eql($DEFAULT) ? $$InferencePSC : mt, query_properties);
            final SubLObject inference_suspend_status_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            the_answer = the_answer_$1;
            inference_suspend_status = inference_suspend_status_$2;
            if (NIL != $debug_new_cyc_queryP$.getDynamicValue(thread)) {
                if (!inference_suspend_status.eql($EXHAUST_TOTAL)) {
                    if (inference_suspend_status.eql($MAX_NUMBER)) {
                        if ($constrained_parsing_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                            Errors.warn($str116$_S_in__A_may_have_had_more_answer, the_sentence, mt);
                        }
                    } else {
                        Errors.sublisp_break($str117$_S_in__A_exited_abnormally___A, new SubLObject[]{ the_sentence, mt, inference_suspend_status });
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(problem_store);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return answer_type.isKeyword() ? cyc_kernel.closed_query_success_result_p(the_answer) : the_answer;
    }

    public static SubLObject constrained_parsing_query_lexical(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return constrained_parsing_query(template, sentence, mt, v_properties);
    }

    public static SubLObject constrained_parsing_query_successP(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $DEFAULT;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return constrained_parsing_query($BINDINGS, sentence, mt, v_properties);
    }

    public static SubLObject constrained_parse_involves_group_coercionP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $DEFAULT;
        }
        if (NIL == el_binary_formula_p(gaf)) {
            return NIL;
        }
        if (NIL == constrained_parsing_query_successP(list($$thereExists, $sym121$_RELN, list($$and, list($$argN, $sym121$_RELN, ZERO_INTEGER, gaf), $list124, listS($$genls, cycl_utilities.formula_arg2(gaf, UNPROVIDED), $list126))), mt, UNPROVIDED)) {
            return T;
        }
        if (NIL != constrained_parsing_query_successP(list($$not, listS($$isa, cycl_utilities.formula_arg1(gaf, UNPROVIDED), $list126)), mt, UNPROVIDED)) {
            return T;
        }
        if (NIL != constrained_parsing_query_successP(listS($$isa, cycl_utilities.formula_arg1(gaf, UNPROVIDED), $list129), mt, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject constrained_parsing_illegal_isa_workaroundP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $DEFAULT;
        }
        if (NIL == constrained_parsing_query_successP(list($$thereExists, $sym121$_RELN, list($$and, list($$argN, $sym121$_RELN, ZERO_INTEGER, gaf), $list124, listS($$genls, cycl_utilities.formula_arg2(gaf, UNPROVIDED), $list126))), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject relevant_isas = cdolist_list_var = constrained_parsing_query($sym130$_KNOWN_TO_BE, listS($$and, new SubLObject[]{ list($$operatorFormulas, $$GroupOfCardinalityFn, cycl_utilities.formula_arg2(gaf, UNPROVIDED)), listS($$isa, cycl_utilities.formula_arg1(gaf, UNPROVIDED), $list133), $list134, $list135, list($$argN, $sym136$_COL2, ONE_INTEGER, cycl_utilities.formula_arg2(gaf, UNPROVIDED)), $list137 }), mt, UNPROVIDED);
        SubLObject this_isa = NIL;
        this_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constrained_parsing_query_successP(list($$thereExists, $sym138$_Y, list($$thereExists, $sym139$_X, listS($$and, list($$argN, $sym139$_X, TWO_INTEGER, this_isa), list($$argN, $sym138$_Y, TWO_INTEGER, cycl_utilities.formula_arg2(gaf, UNPROVIDED)), $list140))), mt, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_isa = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject constrained_parsing_gaf_fails_constraintsP_int(final SubLObject gaf, final SubLObject passed_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = which_constraints_outrank($MINIMALTIMEPARSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == constraints) {
            return NIL;
        }
        SubLObject v_answer = $NEEDED;
        final SubLObject focal_constraint = constraints.first();
        if ($constrained_parsing_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            Errors.warn($str142$____investigating__A_faithfulness, focal_constraint, $with_faithfulness_cutoffP$.getDynamicValue(thread), $with_arbitrary_filter_cutoffP$.getDynamicValue(thread));
        }
        final SubLObject pcase_var = focal_constraint;
        if (pcase_var.eql($FAITHFULNESSFILTERCUTOFF)) {
            final SubLObject _prev_bind_0 = $with_faithfulness_cutoffP$.currentBinding(thread);
            try {
                $with_faithfulness_cutoffP$.bind(T, thread);
                v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
            } finally {
                $with_faithfulness_cutoffP$.rebind(_prev_bind_0, thread);
            }
        } else
            if (pcase_var.eql($ARBITRARYFILTERCUTFF)) {
                final SubLObject _prev_bind_0 = $with_arbitrary_filter_cutoffP$.currentBinding(thread);
                try {
                    $with_arbitrary_filter_cutoffP$.bind(T, thread);
                    v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
                } finally {
                    $with_arbitrary_filter_cutoffP$.rebind(_prev_bind_0, thread);
                }
            } else
                if (pcase_var.eql($BUGAVOIDANCECUTOFF)) {
                    final SubLObject _prev_bind_0 = $with_bug_avoidance_cutoffP$.currentBinding(thread);
                    try {
                        $with_bug_avoidance_cutoffP$.bind(T, thread);
                        v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
                    } finally {
                        $with_bug_avoidance_cutoffP$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (pcase_var.eql($PROHIBITGROUPCOERCION)) {
                        if (NIL != constrained_parse_involves_group_coercionP(gaf, passed_mt)) {
                            v_answer = focal_constraint;
                        } else {
                            v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
                        }
                    } else
                        if (NIL != parsing_faithfulness_filter_p(focal_constraint)) {
                            if (NIL == $with_faithfulness_cutoffP$.getDynamicValue(thread)) {
                                SubLObject filter_mt = parsing_faithfulness_filter_mt(focal_constraint);
                                final SubLObject filter_type = parsing_faithfulness_filter_type(focal_constraint);
                                if (NIL != genl_mts.genl_mtP(passed_mt, filter_mt, UNPROVIDED, UNPROVIDED)) {
                                    filter_mt = passed_mt;
                                }
                                final SubLObject pcase_var_$3 = filter_type;
                                if (pcase_var_$3.eql($OBEYISASINMT)) {
                                    if ((NIL != genl_predicates.genl_predicate_in_any_mtP(cycl_utilities.formula_arg0(gaf), $$isa)) && (NIL != constrained_parsing_query_successP(list($$not, gaf), filter_mt, UNPROVIDED))) {
                                        v_answer = focal_constraint;
                                    }
                                } else
                                    if ((pcase_var_$3.eql($OBEYGAFSINMT) && (NIL == genl_predicates.genl_predicate_in_any_mtP(cycl_utilities.formula_arg0(gaf), $$isa))) && (NIL != constrained_parsing_query_successP(list($$not, gaf), filter_mt, UNPROVIDED))) {
                                        v_answer = focal_constraint;
                                    }

                            }
                        } else
                            if (NIL != parsing_arbitrary_filter_p(focal_constraint)) {
                                if (NIL == $with_arbitrary_filter_cutoffP$.getDynamicValue(thread)) {
                                    final SubLObject filter_mt = parsing_arbitrary_filter_mt(focal_constraint);
                                    if (passed_mt.eql($DEFAULT) || (NIL != genl_mts.genl_mtP(passed_mt, filter_mt, UNPROVIDED, UNPROVIDED))) {
                                        final SubLObject pcase_var_$4 = parsing_arbitrary_filter_type(focal_constraint);
                                        if (pcase_var_$4.eql($ASSERTINTOMT)) {
                                            final SubLObject restriction = parsing_arbitrary_filter_details(focal_constraint);
                                            final SubLObject gaf_operator = cycl_utilities.formula_arg0(gaf);
                                            SubLObject into_mt = $constrained_parsing_assert_into_mt$.getDynamicValue(thread);
                                            if (NIL == $constrained_parsing_assert_into_mt$.getDynamicValue(thread)) {
                                                if (NIL != fort_types_interface.predicate_in_any_mtP(restriction)) {
                                                    if (NIL != genl_predicates.genl_predicateP(gaf_operator, restriction, filter_mt, UNPROVIDED)) {
                                                        into_mt = filter_mt;
                                                    }
                                                } else
                                                    if ((NIL != fort_types_interface.collection_in_any_mtP(restriction)) && (NIL != isa.isaP(gaf_operator, restriction, filter_mt, UNPROVIDED))) {
                                                        into_mt = filter_mt;
                                                    }

                                                if (NIL != genl_mts.genl_mtP(passed_mt, into_mt, UNPROVIDED, UNPROVIDED)) {
                                                    into_mt = passed_mt;
                                                }
                                                if ((NIL != into_mt) && $constrained_parsing_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    Errors.warn($str144$_____S_will_be_asserted_into__A__, gaf, into_mt);
                                                }
                                            }
                                            final SubLObject _prev_bind_2 = $constrained_parsing_assert_into_mt$.currentBinding(thread);
                                            try {
                                                $constrained_parsing_assert_into_mt$.bind(into_mt, thread);
                                                v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
                                                if ((NIL != $constrained_parsing_assert_into_mt$.getDynamicValue(thread)) && (NIL == parsing_constraint_p(v_answer))) {
                                                    v_answer = $constrained_parsing_assert_into_mt$.getDynamicValue(thread);
                                                }
                                            } finally {
                                                $constrained_parsing_assert_into_mt$.rebind(_prev_bind_2, thread);
                                            }
                                        } else
                                            if (pcase_var_$4.eql($NOISASARESPECS) && (NIL != constrained_parsing_query_successP(list($$and, list($$argN, $$isa, ZERO_INTEGER, gaf), list($$argN, $sym145$_COL, TWO_INTEGER, gaf), list($$not, list($$genls, $sym145$_COL, parsing_arbitrary_filter_details(focal_constraint)))), passed_mt, UNPROVIDED))) {
                                                v_answer = focal_constraint;
                                            }

                                    }
                                }
                            } else
                                if ((focal_constraint.eql($COMPENSATEFORISAPROBLEMS) && (NIL == $with_bug_avoidance_cutoffP$.getDynamicValue(thread))) && (NIL != constrained_parsing_illegal_isa_workaroundP(gaf, passed_mt))) {
                                    v_answer = focal_constraint;
                                }






        if (v_answer.eql($NEEDED)) {
            v_answer = constrained_parsing_gaf_fails_constraintsP_int(gaf, passed_mt, constraints.rest());
        }
        return v_answer;
    }

    public static SubLObject constrained_parsing_gaf_fails_constraintsP(final SubLObject gaf, final SubLObject in_mt) {
        assert NIL != el_formula_p(gaf) : "el_utilities.el_formula_p(gaf) " + "CommonSymbols.NIL != el_utilities.el_formula_p(gaf) " + gaf;
        if (((!in_mt.eql($DEFAULT)) && (!assertionsDisabledSynth)) && (NIL == fort_types_interface.mt_in_any_mtP(in_mt))) {
            throw new AssertionError(in_mt);
        }
        return constrained_parsing_gaf_fails_constraintsP_int(gaf, in_mt, which_constraints_outrank($MINIMALTIMEPARSE));
    }

    public static SubLObject constrained_parsing_unassert(final SubLObject gaf, final SubLObject mt) {
        constrained_parsing_record_action(UNASSERT, list(gaf, mt));
        if (NIL != constrained_parsing_assert_gafsP()) {
            return fi.fi_unassert_int(gaf, mt);
        }
        return NIL;
    }

    public static SubLObject constrained_parsing_possibly_assert(final SubLObject gaf, SubLObject mt, SubLObject source_string) {
        if (source_string == UNPROVIDED) {
            source_string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(gaf) : "el_utilities.el_formula_p(gaf) " + "CommonSymbols.NIL != el_utilities.el_formula_p(gaf) " + gaf;
        if (((!mt.eql($DEFAULT)) && (!assertionsDisabledSynth)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (NIL != constrained_parsing_query_successP(gaf, mt, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject diagnosis = constrained_parsing_gaf_fails_constraintsP(gaf, mt);
        if (NIL != parsing_constraint_p(diagnosis)) {
            return diagnosis;
        }
        if (NIL != fort_types_interface.mt_in_any_mtP(diagnosis)) {
            if (mt.eql($DEFAULT)) {
                mt = diagnosis;
            }
        } else
            if (mt.eql($DEFAULT)) {
                return NIL;
            }

        if (NIL != el_binary_formula_p(gaf)) {
            SubLObject pred = NIL;
            SubLObject the_term = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(gaf, gaf, $list149);
            pred = gaf.first();
            SubLObject current = gaf.rest();
            destructuring_bind_must_consp(current, gaf, $list149);
            the_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, gaf, $list149);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((((NIL != isa.isa_in_any_mtP(arg2, $$Group)) || cycl_utilities.formula_arg0(arg2).eql($$GroupFn)) || cycl_utilities.formula_arg0(arg2).eql($$GroupOfCardinalityFn)) && (NIL == isa.isa_in_any_mtP(the_term, $$Group))) {
                    SubLObject cdolist_list_var = constrained_parsing_query($list154, list($$ist_Asserted, $sym156$_ANYWHERE, listS($$isa, the_term, $list157)), UNPROVIDED, UNPROVIDED);
                    SubLObject this_answer = NIL;
                    this_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current_$6;
                        final SubLObject datum_$5 = current_$6 = this_answer;
                        SubLObject this_isa = NIL;
                        SubLObject this_mt = NIL;
                        destructuring_bind_must_consp(current_$6, datum_$5, $list152);
                        this_isa = current_$6.first();
                        current_$6 = current_$6.rest();
                        destructuring_bind_must_consp(current_$6, datum_$5, $list152);
                        this_mt = current_$6.first();
                        current_$6 = current_$6.rest();
                        if (NIL == current_$6) {
                            if (NIL == genls.genl_in_any_mtP(this_isa, $$Group)) {
                                constrained_parsing_unassert(list($$isa, the_term, this_isa), this_mt);
                                constrained_parsing_possibly_assert(list($$hypothesizedIsaCoercedInto, the_term, this_isa, arg2), this_mt, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind_error(datum_$5, $list152);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        this_answer = cdolist_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(gaf, $list149);
            }
        }
        SubLObject gafs_produced = list(list(gaf, mt));
        final SubLObject strength = (cycl_utilities.formula_arg0(gaf).eql($$sourceOfTerm)) ? $MONOTONIC : $DEFAULT;
        constrained_parsing_record_action(FI_ASSERT_INT, gafs_produced.first());
        if (NIL != constrained_parsing_assert_gafsP()) {
            if (NIL != $constrained_parsing_show_inference_metricsP$.getDynamicValue(thread)) {
                final SubLObject undo_traceP = NIL;
                inference_metrics.clear_forward_inference_metrics();
                final SubLObject _prev_bind_0 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $browse_forward_inferencesP$.currentBinding(thread);
                try {
                    inference_metrics.$gathering_forward_inference_metricsP$.bind(T, thread);
                    $browse_forward_inferencesP$.bind(NIL, thread);
                    fi.fi_assert_int(gaf, mt, strength, UNPROVIDED);
                    inference_metrics.show_forward_inference_metrics(FOUR_INTEGER, UNPROVIDED);
                    inference_metrics.finalize_forward_inference_metrics_inference_index();
                } finally {
                    $browse_forward_inferencesP$.rebind(_prev_bind_2, thread);
                    inference_metrics.$gathering_forward_inference_metricsP$.rebind(_prev_bind_0, thread);
                }
            } else {
                fi.fi_assert_int(gaf, mt, strength, UNPROVIDED);
            }
        }
        if ((NIL != source_string) && ((NIL != constrained_parsing_tracking_stringsP()) || (NIL != constrained_parsing_tracking_substringsP()))) {
            gafs_produced = cons(constrained_parsing_possibly_assert(list($$sourceOfTerm, gaf, source_string), mt, UNPROVIDED).first(), gafs_produced);
        }
        return reverse(gafs_produced);
    }

    public static SubLObject constrained_parsing_assert_through_channels(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject gaf = NIL;
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list161);
        gaf = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list161);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list161);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list161);
            if (NIL == member(current_$7, $list162, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list161);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $DEFAULT;
        final SubLObject source_tail = property_list_member($SOURCE, current);
        final SubLObject source = (NIL != source_tail) ? cadr(source_tail) : NIL;
        final SubLObject record_filter_tail = property_list_member($RECORD_FILTER, current);
        final SubLObject record_filter = (NIL != record_filter_tail) ? cadr(record_filter_tail) : NIL;
        final SubLObject record_null_tail = property_list_member($RECORD_NULL, current);
        final SubLObject record_null = (NIL != record_null_tail) ? cadr(record_null_tail) : NIL;
        final SubLObject channel_says = $sym167$CHANNEL_SAYS;
        return list(CLET, list(list(channel_says, list(CONSTRAINED_PARSING_POSSIBLY_ASSERT, gaf, mt, source))), list(PWHEN, list(CAND, channel_says, list(CNOT, record_filter)), listS(CSETQ, channel_says, $list172)), list(PWHEN, list(COR, channel_says, record_null), list(CSETQ, var, channel_says)));
    }

    public static SubLObject constrained_parsing_coerce_to_group(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($constrained_parsing_cardinality_known$.getDynamicValue(thread).isNumber() || (NIL != constrained_parsing_query_successP(list($$isa, $constrained_parsing_cardinality_known$.getDynamicValue(thread), $$PositiveIntegerExtent), UNPROVIDED, UNPROVIDED))) {
            return list($$GroupOfCardinalityFn, col, $constrained_parsing_cardinality_known$.getDynamicValue(thread));
        }
        if (NIL != $constrained_parsing_cardinality_known$.getDynamicValue(thread)) {
            return list($$GroupFn, col);
        }
        return col;
    }

    public static SubLObject constrained_parsing_note_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = NIL;
        SubLObject col = NIL;
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list175);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list175);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list175);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list175);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list175);
            if (NIL == member(current_$8, $list176, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list175);
        }
        final SubLObject source_tail = property_list_member($SOURCE, current);
        final SubLObject source = (NIL != source_tail) ? cadr(source_tail) : NIL;
        final SubLObject group_col = $sym177$GROUP_COL;
        return list(CLET, list(list(group_col, col)), list(CONSTRAINED_PARSING_ASSERT_THROUGH_CHANNELS, list(LIST, $$isa, v_term, group_col), var, $SOURCE, source));
    }

    public static SubLObject constrained_parse_explode_np_string(final SubLObject string, SubLObject calling_constraint) {
        if (calling_constraint == UNPROVIDED) {
            calling_constraint = $MINIMALTIMEPARSE;
        }
        SubLObject exploded = NIL;
        final SubLObject do_clausesP = parsing_constraint_outranksP($PERMITRELATIVECLAUSEPARSES, calling_constraint);
        final SubLObject do_ppP = parsing_constraint_outranksP($PERMITPPCOMPPARSES, calling_constraint);
        SubLObject abortP = NIL;
        if (NIL == abortP) {
            SubLObject csome_list_var = string_utilities.split_string(string, UNPROVIDED);
            SubLObject this_word = NIL;
            this_word = csome_list_var.first();
            while ((NIL == abortP) && (NIL != csome_list_var)) {
                if (((NIL == do_ppP) && (NIL == Strings.stringE(this_word, $$$of, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != constrained_parsing_query_lexical($sym181$_WU, list($$prepositionStrings, $sym181$_WU, this_word), UNPROVIDED, UNPROVIDED))) {
                    abortP = T;
                } else
                    if ((NIL == do_clausesP) && (NIL != constrained_parsing_query_lexical($sym181$_WU, listS($$and, list($$partOfSpeech, $sym181$_WU, $sym184$_POS, this_word), $list185), UNPROVIDED, UNPROVIDED))) {
                        abortP = T;
                    } else {
                        exploded = cons(this_word, exploded);
                    }

                csome_list_var = csome_list_var.rest();
                this_word = csome_list_var.first();
            } 
        }
        return reverse(exploded);
    }

    public static SubLObject constrained_parse_of_strings_for_term(final SubLObject the_term, final SubLObject the_strings) {
        assert NIL != forts.fort_p(the_term) : "forts.fort_p(the_term) " + "CommonSymbols.NIL != forts.fort_p(the_term) " + the_term;
        assert NIL != list_utilities.non_dotted_list_p(the_strings) : "list_utilities.non_dotted_list_p(the_strings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(the_strings) " + the_strings;
        SubLObject cdolist_list_var = the_strings;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject problemsP = NIL;
        cdolist_list_var = the_strings;
        SubLObject this_string = NIL;
        this_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == constrained_parse_of_string_for_term(the_term, this_string)) {
                problemsP = T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_string = cdolist_list_var.first();
        } 
        return problemsP;
    }

    public static SubLObject constrained_parsing_get_acceptable_isas(final SubLObject the_term, SubLObject isa_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != parsing_constraint_outranksP($PROHIBITSUBCOLLECTIONFNS, $PERMITALLNONDISJOINTISAS)) {
            isa_list = remove_if(SUBCOLLECTION_NAUT_P, isa_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != $constrained_parsing_cardinality_known$.getDynamicValue(thread)) {
            SubLObject tmp_list = NIL;
            SubLObject cdolist_list_var = isa_list;
            SubLObject this_isa = NIL;
            this_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tmp_list = cons(constrained_parsing_coerce_to_group(this_isa), tmp_list);
                cdolist_list_var = cdolist_list_var.rest();
                this_isa = cdolist_list_var.first();
            } 
            isa_list = reverse(tmp_list);
            if (NIL != constrained_parsing_query_successP(list($$not, listS($$isa, the_term, $list126)), UNPROVIDED, UNPROVIDED)) {
                return isa_list;
            }
        }
        SubLObject list_of_ok = NIL;
        SubLObject cdolist_list_var = isa_list;
        SubLObject this_isa = NIL;
        this_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constrained_parsing_query_successP(list($$not, list($$isa, the_term, this_isa)), UNPROVIDED, UNPROVIDED)) {
                Errors.warn($str190$____rejected_potential_parse_of__, this_isa, the_term);
            } else {
                list_of_ok = cons(this_isa, list_of_ok);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_isa = cdolist_list_var.first();
        } 
        return reverse(list_of_ok);
    }

    public static SubLObject constrained_parse_of_substrings_for_term(final SubLObject the_term, final SubLObject substrings, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = $$nounStrings;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bunged = string_utilities.bunge(substrings, UNPROVIDED);
        SubLObject did_workP = $NADA;
        final SubLObject cols = constrained_parsing_get_acceptable_isas(the_term, constrained_parsing_query_lexical($sym145$_COL, listS($$and, list($$termPhrases, $sym145$_COL, predicate, bunged), $list194), UNPROVIDED, UNPROVIDED));
        if ($constrained_parsing_trace_level$.getDynamicValue(thread).numGE(NIL != cols ? ZERO_INTEGER : TWO_INTEGER)) {
            Errors.warn($str195$____remaining_parses_are__A_w_car, cols, $constrained_parsing_cardinality_known$.getDynamicValue(thread));
        }
        if (cols.isCons() && ((NIL != list_utilities.singletonP(cols)) || (NIL != parsing_constraint_outranksP($PERMITALLNONDISJOINTISAS, $PROHIBITAMBIGUOUSGAFS)))) {
            SubLObject cdolist_list_var = cols;
            SubLObject this_col = NIL;
            this_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL == constrained_parsing_query_successP(list($$not, list($$isa, the_term, this_col)), UNPROVIDED, UNPROVIDED)) && (NIL == constrained_parsing_query_successP(list($$isa, the_term, this_col), UNPROVIDED, UNPROVIDED))) && (NIL == constrained_parsing_faceting_violationP(the_term, this_col, $PERMITALLNONDISJOINTISAS))) {
                    final SubLObject group_col = this_col;
                    SubLObject channel_says = constrained_parsing_possibly_assert(list($$isa, the_term, group_col), $DEFAULT, bunged);
                    if (NIL != channel_says) {
                        channel_says = $WORK_DONE;
                    }
                    if (NIL != channel_says) {
                        did_workP = channel_says;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_col = cdolist_list_var.first();
            } 
        }
        return did_workP;
    }

    public static SubLObject constrained_parsing_faceting_violationP(final SubLObject the_term, final SubLObject wrt_col, final SubLObject key_constraint) {
        if (NIL != parsing_constraint_outranksP(key_constraint, $AVOIDREDUNDANTFACETS)) {
            return NIL;
        }
        return constrained_parsing_query_successP(list($$thereExists, $sym145$_COL, list($$thereExists, $sym197$_COL_TYPE, list($$thereExists, $sym198$_FACETING_COL, list($$thereExists, $sym199$_SOMEWHERE, list($$thereExists, $sym156$_ANYWHERE, list($$thereExists, $sym200$_TERM_COL, listS($$and, list($$ist_Asserted, $sym199$_SOMEWHERE, listS($$isa, wrt_col, $list201)), $list202, $list203, list($$ist_Asserted, $sym156$_ANYWHERE, listS($$isa, the_term, $list157)), $list204))))))), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject constrained_parse_of_string_for_term(final SubLObject the_term, final SubLObject the_string) {
        if (NIL != string_utilities.capitalized_string_p(the_string)) {
            return constrained_parse_of_namestring_for_term(the_term, the_string);
        }
        return constrained_parse_of_string_for_term_int(the_term, constrained_parse_explode_np_string(the_string, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject constrained_parse_of_string_for_term_int(final SubLObject the_term, SubLObject exploded, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = which_constraints_outrank($MINIMALTIMEPARSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == exploded) || (NIL == constraints)) {
            return NIL;
        }
        SubLObject diagnosis = NIL;
        final SubLObject focal_constraint = constraints.first();
        final SubLObject cdrstraints = constraints.rest();
        if (NIL != parsing_flow_control_principle_p(focal_constraint)) {
            final SubLObject pcase_var = focal_constraint;
            if (pcase_var.eql($STRIPCARDINALITY)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, UNPROVIDED);
                }
                SubLObject current;
                final SubLObject datum = current = constrained_parse_extract_cardinality(exploded);
                SubLObject cardinality = NIL;
                SubLObject strings = NIL;
                destructuring_bind_must_consp(current, datum, $list205);
                cardinality = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list205);
                strings = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject _prev_bind_0 = $constrained_parsing_cardinality_known$.currentBinding(thread);
                    try {
                        $constrained_parsing_cardinality_known$.bind(cardinality, thread);
                        if (((NIL != cardinality) && (NIL == $constrained_parsing_allow_group_coercionP$.getDynamicValue(thread))) && (NIL != constrained_parsing_query_successP(list($$not, listS($$isa, the_term, $list126)), UNPROVIDED, UNPROVIDED))) {
                            diagnosis = $PROHIBITGROUPCOERCION;
                        } else {
                            diagnosis = constrained_parse_of_string_for_term_int(the_term, strings, cdrstraints);
                        }
                    } finally {
                        $constrained_parsing_cardinality_known$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list205);
                }
                return diagnosis;
            }
            if (pcase_var.eql($WIDESCOPEPRECISION)) {
                if (exploded.isString()) {
                    exploded = constrained_parse_explode_np_string(focal_constraint, UNPROVIDED);
                }
                for (SubLObject workspace = exploded; (!diagnosis.eql($ERROR)) && (NIL != workspace); workspace = workspace.rest()) {
                    diagnosis = constrained_parse_of_substrings_for_term(the_term, workspace, UNPROVIDED);
                    if ((NIL != $constrained_parsing_consider_adjectivesP$.getDynamicValue(thread)) && (!diagnosis.eql($ERROR))) {
                        diagnosis = constrained_parse_of_substrings_for_term(the_term, workspace, $$adjStrings);
                    }
                }
            } else
                if (pcase_var.eql($NARROWSCOPEPRECISION)) {
                    if (exploded.isString()) {
                        exploded = constrained_parse_explode_np_string(focal_constraint, UNPROVIDED);
                    }
                    for (SubLObject workspace = reverse(exploded); (NIL != workspace) && (!diagnosis.eql($ERROR)); workspace = workspace.rest()) {
                        diagnosis = constrained_parse_of_substrings_for_term(the_term, list(workspace.first()), UNPROVIDED);
                        if ((NIL != $constrained_parsing_consider_adjectivesP$.getDynamicValue(thread)) && (!diagnosis.eql($ERROR))) {
                            diagnosis = constrained_parse_of_substrings_for_term(the_term, list(workspace.first()), $$adjStrings);
                        }
                    }
                } else
                    if (pcase_var.eql($PERMITNARTISAS)) {
                        if (exploded.isString()) {
                            exploded = constrained_parse_explode_np_string(focal_constraint, UNPROVIDED);
                        }
                        diagnosis = constrained_parse_of_nart_isas(the_term, exploded);
                    } else
                        if (pcase_var.eql($RELATIONALLINSTANCEPARSE)) {
                            if (exploded.isString()) {
                                exploded = constrained_parse_explode_np_string(focal_constraint, UNPROVIDED);
                            }
                            diagnosis = constrained_parse_via_relation_all_instance(the_term, exploded);
                        } else {
                            if (pcase_var.eql($PROHIBITGROUPCOERCION)) {
                                final SubLObject _prev_bind_2 = $constrained_parsing_allow_group_coercionP$.currentBinding(thread);
                                try {
                                    $constrained_parsing_allow_group_coercionP$.bind(NIL, thread);
                                    diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                                } finally {
                                    $constrained_parsing_allow_group_coercionP$.rebind(_prev_bind_2, thread);
                                }
                                return diagnosis;
                            }
                            if (pcase_var.eql($PERMITADJECTIVEPARSES)) {
                                final SubLObject _prev_bind_2 = $constrained_parsing_consider_adjectivesP$.currentBinding(thread);
                                try {
                                    $constrained_parsing_consider_adjectivesP$.bind(T, thread);
                                    diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                                } finally {
                                    $constrained_parsing_consider_adjectivesP$.rebind(_prev_bind_2, thread);
                                }
                                return diagnosis;
                            }
                            if (pcase_var.eql($CASESENSITIVELEXICON)) {
                                final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                                try {
                                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
                                    diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                                } finally {
                                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                                }
                                return diagnosis;
                            }
                            if (pcase_var.eql($CASEINSENSITIVELEXICON)) {
                                final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                                try {
                                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($OFF, thread);
                                    diagnosis = constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
                                } finally {
                                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                                }
                                return diagnosis;
                            }
                        }



        }
        if (diagnosis.eql($ERROR)) {
            return diagnosis;
        }
        return constrained_parse_of_string_for_term_int(the_term, exploded, cdrstraints);
    }

    public static SubLObject constrained_parse_extract_cardinality(final SubLObject exploded) {
        assert NIL != list_utilities.non_dotted_list_p(exploded) : "list_utilities.non_dotted_list_p(exploded) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(exploded) " + exploded;
        SubLObject cdolist_list_var = exploded;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject post_strings = exploded;
        SubLObject workspace = NIL;
        SubLObject as_integer = NIL;
        SubLObject this_many = NIL;
        SubLObject doneP = NIL;
        SubLObject pre_strings = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = exploded;
            SubLObject this_word = NIL;
            this_word = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                as_integer = string_utilities.string_to_integer(string_utilities.remove_substring(this_word, $str210$_));
                if (NIL != as_integer) {
                    workspace = list(as_integer);
                } else {
                    workspace = constrained_parsing_query_lexical($sym211$_DENOT, list($$termPhrases, $sym211$_DENOT, $$Determiner, this_word), UNPROVIDED, UNPROVIDED);
                }
                if (NIL == workspace) {
                    workspace = constrained_parsing_query_lexical($sym211$_DENOT, listS($$and, list($$termStrings, $sym211$_DENOT, this_word), $list214), UNPROVIDED, UNPROVIDED);
                }
                if (NIL == workspace) {
                    workspace = constrained_parsing_query_lexical($sym211$_DENOT, listS($$and, list($$termStrings, $sym211$_DENOT, this_word), $list215), UNPROVIDED, UNPROVIDED);
                }
                final SubLObject the_number = workspace.first();
                if (NIL == workspace) {
                    doneP = T;
                } else
                    if (((NIL != list_utilities.singletonP(workspace)) && (NIL != the_number)) && (NIL != constrained_parsing_query_successP(listS($$isa, the_number, $list216), $$EnglishMt, UNPROVIDED))) {
                        if (NIL == this_many) {
                            this_many = the_number;
                        } else
                            if (this_many.isNumber()) {
                                this_many = multiply(the_number, this_many);
                            } else {
                                this_many = multiply(this_many, constrained_parsing_query_lexical($sym211$_DENOT, listS($$and, listS($$termStrings, the_number, $list217), $list218), UNPROVIDED, UNPROVIDED).first());
                            }

                    } else {
                        pre_strings = cons(this_word, pre_strings);
                        doneP = list_utilities.sublisp_boolean(this_many);
                    }

                if (NIL == doneP) {
                    post_strings = post_strings.rest();
                }
                csome_list_var = csome_list_var.rest();
                this_word = csome_list_var.first();
            } 
        }
        return NIL != this_many ? list(this_many, list_utilities.flatten(list(reverse(pre_strings), post_strings))) : list(NIL, exploded);
    }

    public static SubLObject constrained_parse_search_for_rewrites(final SubLObject the_term, final SubLObject the_string, SubLObject search_predicate) {
        if (search_predicate == UNPROVIDED) {
            search_predicate = $$preferredNameString;
        }
        if (NIL != parsing_constraint_outranksP($AVOIDREWRITEPARSES, $BUGAVOIDANCECUTOFF)) {
            return $NADA;
        }
        SubLObject found_rewrite = NIL;
        SubLObject cdolist_list_var = constrained_parsing_query_lexical($sym222$_WHO, list($$and, list(search_predicate, $sym222$_WHO, the_string), list($$not, list($$equals, $sym222$_WHO, the_term)), $list224, list($$unknownSentence, list($$thereExists, $sym145$_COL, listS($$and, list($$ist_Asserted, $sym156$_ANYWHERE, listS($$isa, the_term, $list157)), $list226)))), UNPROVIDED, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != found_rewrite) {
                Errors.warn($str220$____found__at_least___A_and__A_as, found_rewrite, v_answer, the_term);
                return $NADA;
            }
            SubLObject collisionP = NIL;
            if (NIL == collisionP) {
                SubLObject csome_list_var;
                SubLObject this_col;
                for (csome_list_var = constrained_parsing_query($sym145$_COL, list($$ist_Asserted, $sym156$_ANYWHERE, listS($$isa, v_answer, $list157)), UNPROVIDED, UNPROVIDED), this_col = NIL, this_col = csome_list_var.first(); (NIL == collisionP) && (NIL != csome_list_var); collisionP = constrained_parsing_faceting_violationP(the_term, this_col, $MINIMALTIMEPARSE) , csome_list_var = csome_list_var.rest() , this_col = csome_list_var.first()) {
                }
            }
            if (NIL == collisionP) {
                Errors.warn($str221$____setting_rewrite_option_to__S, v_answer);
                found_rewrite = v_answer;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        if (NIL != found_rewrite) {
            SubLObject did_workP = $NADA;
            SubLObject channel_says = constrained_parsing_possibly_assert(list($$rewriteOf, found_rewrite, the_term), $DEFAULT, the_string);
            if (NIL != channel_says) {
                channel_says = $WORK_DONE;
            }
            if (NIL != channel_says) {
                did_workP = channel_says;
            }
            return did_workP;
        }
        return NIL;
    }

    public static SubLObject frontload_genitive_if_any(final SubLObject string_list) {
        return rotate_list_around_pivot(string_list, $$$of, UNPROVIDED);
    }

    public static SubLObject eliminate_redundant_narts(final SubLObject nart_list) {
        if (NIL == list_utilities.lengthG(nart_list, ONE_INTEGER, UNPROVIDED)) {
            return nart_list;
        }
        assert NIL != list_utilities.non_dotted_list_p(nart_list) : "list_utilities.non_dotted_list_p(nart_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(nart_list) " + nart_list;
        SubLObject cdolist_list_var = nart_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject reduced = NIL;
        cdolist_list_var = nart_list;
        SubLObject this_nart = NIL;
        this_nart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject found_narrowerP = NIL;
            if (NIL == found_narrowerP) {
                SubLObject csome_list_var = nart_list;
                SubLObject other_nart = NIL;
                other_nart = csome_list_var.first();
                while ((NIL == found_narrowerP) && (NIL != csome_list_var)) {
                    if ((!other_nart.equal(this_nart)) && cycl_utilities.formula_arg0(this_nart).eql(cycl_utilities.formula_arg0(other_nart))) {
                        SubLObject n = ZERO_INTEGER;
                        final SubLObject args = cycl_utilities.formula_args(this_nart, $IGNORE);
                        SubLObject rest;
                        SubLObject this_arg;
                        for (rest = NIL, rest = args; (NIL == found_narrowerP) && (NIL != rest); found_narrowerP = constrained_parsing_query_successP(list($$or, list($$genls, cycl_utilities.formula_arg(other_nart, n, UNPROVIDED), this_arg), list($$subFields, this_arg, cycl_utilities.formula_arg(other_nart, n, UNPROVIDED))), UNPROVIDED, UNPROVIDED) , rest = rest.rest()) {
                            this_arg = rest.first();
                            n = add(n, ONE_INTEGER);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    other_nart = csome_list_var.first();
                } 
            }
            if (NIL == found_narrowerP) {
                reduced = cons(this_nart, reduced);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_nart = cdolist_list_var.first();
        } 
        return reduced;
    }

    public static SubLObject constrained_parse_of_nart_isas(final SubLObject the_term, final SubLObject the_strings) {
        SubLObject np_core = NIL;
        SubLObject all_matches = NIL;
        SubLObject strings_left = frontload_genitive_if_any(the_strings);
        final SubLObject enough_work_doneP = NIL;
        SubLObject any_work_doneP = $NADA;
        if (NIL == enough_work_doneP) {
            SubLObject csome_list_var = reverse(strings_left);
            SubLObject this_word = NIL;
            this_word = csome_list_var.first();
            while ((NIL == enough_work_doneP) && (NIL != csome_list_var)) {
                np_core = cons(this_word, np_core);
                strings_left = list_utilities.remove_last(strings_left);
                SubLObject cdolist_list_var = constrained_parsing_query($sym234$_FUNC, listS($$and, list($$termStrings, $sym234$_FUNC, string_utilities.bunge(np_core, UNPROVIDED)), $list235), $$RelationParaphraseMt, UNPROVIDED);
                SubLObject possible_func = NIL;
                possible_func = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject mod_core = NIL;
                    if (NIL == enough_work_doneP) {
                        SubLObject csome_list_var_$9 = reverse(strings_left);
                        SubLObject this_modifier = NIL;
                        this_modifier = csome_list_var_$9.first();
                        while ((NIL == enough_work_doneP) && (NIL != csome_list_var_$9)) {
                            mod_core = cons(this_modifier, mod_core);
                            SubLObject answers = constrained_parsing_query_lexical($sym211$_DENOT, list($$and, list($$termStrings, $sym211$_DENOT, string_utilities.bunge(mod_core, UNPROVIDED)), list($$admittedArgument, $sym211$_DENOT, ONE_INTEGER, possible_func)), UNPROVIDED, UNPROVIDED);
                            if (NIL != list_utilities.singletonP(answers)) {
                                all_matches = cons(list(possible_func, answers.first()), all_matches);
                            }
                            answers = constrained_parsing_query_lexical($sym211$_DENOT, list($$and, list($$wordStrings, $sym181$_WU, string_utilities.bunge(mod_core, UNPROVIDED)), $list233, list($$admittedArgument, $sym211$_DENOT, ONE_INTEGER, possible_func)), UNPROVIDED, UNPROVIDED);
                            if (NIL != list_utilities.singletonP(answers)) {
                                all_matches = cons(list(possible_func, answers.first()), all_matches);
                            }
                            csome_list_var_$9 = csome_list_var_$9.rest();
                            this_modifier = csome_list_var_$9.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    possible_func = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                this_word = csome_list_var.first();
            } 
        }
        all_matches = eliminate_redundant_narts(all_matches);
        if ((NIL == all_matches) || ((NIL != list_utilities.lengthG(all_matches, ONE_INTEGER, UNPROVIDED)) && (NIL != parsing_constraint_outranksP($PROHIBITAMBIGUOUSGAFS, $MINIMALTIMEPARSE)))) {
            return $NADA;
        }
        SubLObject cdolist_list_var2 = all_matches;
        SubLObject this_match = NIL;
        this_match = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != constrained_parsing_query_successP(listS($$isa, cycl_utilities.formula_arg0(this_match), $list237), UNPROVIDED, UNPROVIDED)) {
                final SubLObject group_col = this_match;
                SubLObject channel_says = constrained_parsing_possibly_assert(list($$isa, the_term, group_col), $DEFAULT, string_utilities.bunge(the_strings, UNPROVIDED));
                if (NIL != channel_says) {
                    channel_says = $WORK_DONE;
                }
                if (NIL != channel_says) {
                    any_work_doneP = channel_says;
                }
            } else {
                SubLObject channel_says2 = constrained_parsing_possibly_assert(list($$rewriteOf, this_match, the_term), $DEFAULT, string_utilities.bunge(the_strings, UNPROVIDED));
                if (NIL != channel_says2) {
                    channel_says2 = $WORK_DONE;
                }
                if (NIL != channel_says2) {
                    any_work_doneP = channel_says2;
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_match = cdolist_list_var2.first();
        } 
        return any_work_doneP;
    }

    public static SubLObject constrained_parse_via_relation_all_instance(final SubLObject the_term, final SubLObject the_strings) {
        SubLObject head = NIL;
        SubLObject work_doneP = $NADA;
        SubLObject string_copies = copy_list(the_strings);
        while (NIL != list_utilities.lengthG(string_copies, ONE_INTEGER, UNPROVIDED)) {
            if (NIL == head) {
                head = list(list_utilities.last_one(string_copies));
            } else {
                head = cons(list_utilities.last_one(string_copies), head);
            }
            string_copies = list_utilities.remove_last(string_copies);
            SubLObject cdolist_list_var = constrained_parsing_query($list242, listS($$and, list($$termPhrases, $sym243$_PRED, $$Noun, string_utilities.bunge(head, UNPROVIDED)), listS($$admittedArgument, the_term, $list244), $list245), UNPROVIDED, UNPROVIDED);
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = v_answer;
                SubLObject pred = NIL;
                SubLObject col1 = NIL;
                SubLObject col2 = NIL;
                destructuring_bind_must_consp(current, datum, $list238);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list238);
                col1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list238);
                col2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject source_string = constrained_parsing_choose_string_sources(string_utilities.bunge(the_strings, UNPROVIDED), string_utilities.bunge(string_copies, UNPROVIDED));
                    if (NIL != constrained_parsing_query_successP(list($$isa, the_term, col2), UNPROVIDED, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$10 = constrained_parsing_query_lexical($sym211$_DENOT, list($$and, list($$termPhrases, $sym211$_DENOT, $$Noun, list_utilities.last_one(string_copies)), list($$genls, $sym211$_DENOT, col1)), UNPROVIDED, UNPROVIDED);
                        SubLObject denot = NIL;
                        denot = cdolist_list_var_$10.first();
                        while (NIL != cdolist_list_var_$10) {
                            SubLObject channel_says = constrained_parsing_possibly_assert(list($$relationExistsInstance, pred, denot, the_term), $DEFAULT, source_string);
                            if (NIL != channel_says) {
                                channel_says = $WORK_DONE;
                            }
                            if (NIL != channel_says) {
                                work_doneP = channel_says;
                            }
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            denot = cdolist_list_var_$10.first();
                        } 
                        SubLObject cdolist_list_var_$11 = constrained_parsing_query_lexical($sym211$_DENOT, list($$and, list($$wordStrings, $sym181$_WU, list_utilities.last_one(string_copies)), $list241, list($$isa, $sym211$_DENOT, col1)), UNPROVIDED, UNPROVIDED);
                        denot = NIL;
                        denot = cdolist_list_var_$11.first();
                        while (NIL != cdolist_list_var_$11) {
                            SubLObject channel_says = constrained_parsing_possibly_assert(list(pred, denot, the_term), $DEFAULT, source_string);
                            if (NIL != channel_says) {
                                channel_says = $WORK_DONE;
                            }
                            if (NIL != channel_says) {
                                work_doneP = channel_says;
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            denot = cdolist_list_var_$11.first();
                        } 
                        SubLObject cdolist_list_var_$12 = constrained_parsing_query_lexical($sym211$_DENOT, list($$and, list($$wordStrings, $sym181$_WU, list_utilities.last_one(string_copies)), $list241, list($$genls, $sym211$_DENOT, col1)), UNPROVIDED, UNPROVIDED);
                        denot = NIL;
                        denot = cdolist_list_var_$12.first();
                        while (NIL != cdolist_list_var_$12) {
                            SubLObject channel_says = constrained_parsing_possibly_assert(list($$relationExistsInstance, pred, denot, the_term), $DEFAULT, source_string);
                            if (NIL != channel_says) {
                                channel_says = $WORK_DONE;
                            }
                            if (NIL != channel_says) {
                                work_doneP = channel_says;
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            denot = cdolist_list_var_$12.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list238);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            } 
        } 
        return work_doneP;
    }

    public static SubLObject constrained_parse_of_namestring_for_term(final SubLObject the_term, final SubLObject namestring) {
        if (NIL != parsing_constraint_outranksP($AVOIDNAMESTRINGPARSES, $BUGAVOIDANCECUTOFF)) {
            return $NADA;
        }
        if ((NIL != isa.isaP(the_term, $$Person, UNPROVIDED, UNPROVIDED)) && constrained_parse_search_for_rewrites(the_term, namestring, $$preferredNameString).eql($WORK_DONE)) {
            return $WORK_DONE;
        }
        if (((NIL != isa.isaP(the_term, $$Organization, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(the_term, $$GeopoliticalEntity, UNPROVIDED, UNPROVIDED))) && constrained_parse_search_for_rewrites(the_term, namestring, $$termStrings).eql($WORK_DONE)) {
            return $WORK_DONE;
        }
        final SubLObject namesP = constrained_parse_of_first_and_last_names(the_term, namestring);
        if (!namesP.eql($NADA)) {
            return namesP;
        }
        final SubLObject businessP = constrained_parse_of_business_suffix(the_term, namestring);
        if (!businessP.eql($NADA)) {
            return businessP;
        }
        return $NADA;
    }

    public static SubLObject constrained_parse_of_business_suffix(final SubLObject the_term, final SubLObject namestring) {
        SubLObject work_doneP = $NADA;
        if (((NIL == constrained_parsing_query_successP(listS($$isa, the_term, $list249), UNPROVIDED, UNPROVIDED)) && (NIL != constrained_parsing_query_successP(listS($$isa, the_term, $list250), UNPROVIDED, UNPROVIDED))) && (NIL != constrained_parsing_query_successP(list($$or, list($$substring, $str252$___Co, namestring), list($$substring, $$$_Company, namestring), list($$substring, $$$_Plc, namestring), list($$substring, $$$_Ltd, namestring)), UNPROVIDED, UNPROVIDED))) {
            final SubLObject group_col = $$Business;
            SubLObject channel_says = constrained_parsing_possibly_assert(list($$isa, the_term, group_col), $DEFAULT, namestring);
            if (NIL != channel_says) {
                channel_says = $WORK_DONE;
            }
            if (NIL != channel_says) {
                work_doneP = channel_says;
            }
        }
        return work_doneP;
    }

    public static SubLObject constrained_parse_of_first_and_last_names(final SubLObject the_term, final SubLObject namestring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != string_utilities.substringP($$$_, namestring, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != constrained_parsing_query_successP(list($$or, listS($$isa, the_term, $list129), listS($$isa, the_term, $list258)), UNPROVIDED, UNPROVIDED))) {
            SubLObject saved_given_name = NIL;
            SubLObject saved_family_name = NIL;
            final SubLObject known_family_nameP = NIL;
            SubLObject searchspace = string_utilities.split_string(namestring, UNPROVIDED);
            SubLObject this_name = NIL;
            SubLObject name_list = NIL;
            while (NIL != list_utilities.lengthG(searchspace, ONE_INTEGER, UNPROVIDED)) {
                this_name = searchspace.first();
                if (NIL != list_utilities.proper_list_p(name_list)) {
                    name_list = list_utilities.flatten(list(name_list, this_name));
                } else
                    if ((NIL == name_list) && constrained_parse_of_salutation_if_any(the_term, this_name).eql($NADA)) {
                        name_list = list(this_name);
                    }

                searchspace = searchspace.rest();
                final SubLObject bunged_given_name = string_utilities.bunge(name_list, UNPROVIDED);
                if (NIL != constrained_parsing_query_successP(list($$thereExists, $sym259$_CONSTANT, list($$or, list($$and, $list260, list($$nameSpelling, $sym259$_CONSTANT, bunged_given_name)), list($$givenNames, $sym259$_CONSTANT, bunged_given_name))), UNPROVIDED, UNPROVIDED)) {
                    final SubLObject bunged_family_name = string_utilities.bunge(searchspace, UNPROVIDED);
                    final SubLObject found_familyP = constrained_parsing_query_successP(list($$thereExists, $sym259$_CONSTANT, list($$or, list($$and, $list263, list($$nameSpelling, $sym259$_CONSTANT, bunged_family_name)), list($$familyName, $sym259$_CONSTANT, bunged_family_name))), UNPROVIDED, UNPROVIDED);
                    if ((NIL != found_familyP) && (NIL != known_family_nameP)) {
                        return $NADA;
                    }
                    if (NIL != found_familyP) {
                        saved_given_name = bunged_given_name;
                        saved_family_name = bunged_family_name;
                    } else {
                        if (NIL != saved_given_name) {
                            continue;
                        }
                        saved_given_name = bunged_given_name;
                        saved_family_name = bunged_family_name;
                    }
                }
            } 
            if ((NIL != saved_given_name) && (NIL != saved_family_name)) {
                SubLObject work_doneP = $NADA;
                final SubLObject _prev_bind_0 = $constrained_parsing_assert_into_mt$.currentBinding(thread);
                try {
                    $constrained_parsing_assert_into_mt$.bind($$EnglishMt, thread);
                    final SubLObject possible_source = constrained_parsing_choose_string_sources(namestring, NIL);
                    SubLObject channel_says = constrained_parsing_possibly_assert(list($$givenNames, the_term, saved_given_name), $DEFAULT, possible_source);
                    if (NIL != channel_says) {
                        channel_says = $WORK_DONE;
                    }
                    if (NIL != channel_says) {
                        work_doneP = channel_says;
                    }
                    channel_says = constrained_parsing_possibly_assert(list($$familyName, the_term, saved_family_name), $DEFAULT, possible_source);
                    if (NIL != channel_says) {
                        channel_says = $WORK_DONE;
                    }
                    if (NIL != channel_says) {
                        work_doneP = channel_says;
                    }
                } finally {
                    $constrained_parsing_assert_into_mt$.rebind(_prev_bind_0, thread);
                }
                return work_doneP;
            }
        }
        return $NADA;
    }

    public static SubLObject constrained_parse_of_salutation_if_any(final SubLObject the_term, final SubLObject the_string) {
        final SubLObject answers = constrained_parsing_query($sym265$_SALUT, listS($$codeMapping, $$SalutationMapping, the_string, $list268), UNPROVIDED, UNPROVIDED);
        SubLObject assert_these = NIL;
        SubLObject work_doneP = $NADA;
        if (NIL != list_utilities.singletonP(answers)) {
            final SubLObject first_pass = constrained_parsing_query($sym145$_COL, list($$relationAllInstance, $$salutation, $sym145$_COL, answers.first()), UNPROVIDED, UNPROVIDED);
            if (NIL != list_of_not_disjoint_collections_p(first_pass)) {
                SubLObject cdolist_list_var = first_pass;
                SubLObject this_col = NIL;
                this_col = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == constrained_parsing_query_successP(list($$not, list($$isa, the_term, this_col)), UNPROVIDED, UNPROVIDED)) {
                        assert_these = cons(this_col, assert_these);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    this_col = cdolist_list_var.first();
                } 
            }
        }
        SubLObject cdolist_list_var2 = assert_these;
        SubLObject this_col2 = NIL;
        this_col2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject group_col = this_col2;
            SubLObject channel_says = constrained_parsing_possibly_assert(list($$isa, the_term, group_col), $DEFAULT, the_string);
            if (NIL != channel_says) {
                channel_says = $WORK_DONE;
            }
            if (NIL != channel_says) {
                work_doneP = channel_says;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            this_col2 = cdolist_list_var2.first();
        } 
        return work_doneP;
    }

    public static SubLObject acquaint_demo_rank_assertion_mts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $acquaint_demo_assertion_filter$.getDynamicValue(thread)) {
            $acquaint_demo_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter($ASSERTINTOMT, $$Relation, $$BBN_CDE_StrengthenedMt), thread);
        }
        if (NIL == $acquaint_demo_lexical_assertion_filter$.getDynamicValue(thread)) {
            $acquaint_demo_lexical_assertion_filter$.setDynamicValue(new_parsing_arbitrary_filter($ASSERTINTOMT, $$nameString, $$EnglishMt), thread);
        }
        frontload_parsing_constraint($acquaint_demo_assertion_filter$.getDynamicValue(thread));
        frontload_parsing_constraint($acquaint_demo_lexical_assertion_filter$.getDynamicValue(thread));
        return current_parsing_constraint_rankings();
    }

    public static SubLObject initialize_acquaint_highly_relevant_rankings() {
        Errors.warn($str273$____DEMO__initializing_rankings_w);
        initialize_constrained_parsing(T, UNPROVIDED);
        acquaint_demo_rank_assertion_mts();
        order_parsing_constraints($MINIMALTIMEPARSE, $AVOIDREDUNDANTFACETS, $DEMOTE);
        return current_parsing_constraint_rankings();
    }

    public static SubLObject initialize_acquaint_sort_of_relevant_rankings() {
        Errors.warn($str274$____DEMO__reverting_to_standard_c);
        initialize_constrained_parsing(T, UNPROVIDED);
        acquaint_demo_rank_assertion_mts();
        return current_parsing_constraint_rankings();
    }

    public static SubLObject highly_relevant_acquaint_answerP(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numGE(methods.funcall_instance_method_with_0_args(v_answer, GET_RELEVANCE), $acquaint_highly_relevant_cutoff$.getDynamicValue(thread));
    }

    public static SubLObject acquaint_demo_who_is(final SubLObject name, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.capitalized_string_p(name) : "string_utilities.capitalized_string_p(name) " + "CommonSymbols.NIL != string_utilities.capitalized_string_p(name) " + name;
        final SubLObject questions = list(format(NIL, $str277$Who_is__A_, name));
        initialize_acquaint_highly_relevant_rankings();
        SubLObject cdolist_list_var = questions;
        SubLObject q = NIL;
        q = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_query = question.new_question(q, UNPROVIDED, UNPROVIDED);
            SubLObject re_initializedP = NIL;
            assert NIL != definitional_question.definitional_question_p(this_query) : "definitional_question.definitional_question_p(this_query) " + "CommonSymbols.NIL != definitional_question.definitional_question_p(this_query) " + this_query;
            SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args(this_query, ANSWER);
            SubLObject this_answer = NIL;
            this_answer = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                if ((NIL == re_initializedP) && (NIL == highly_relevant_acquaint_answerP(this_answer))) {
                    re_initializedP = initialize_acquaint_sort_of_relevant_rankings();
                }
                Errors.warn($str279$____processing__A, this_answer);
                final SubLObject _prev_bind_0 = $constrained_parsing_tracking_stringsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $constrained_parsing_show_inference_metricsP$.currentBinding(thread);
                try {
                    $constrained_parsing_tracking_stringsP$.bind(T, thread);
                    $constrained_parsing_show_inference_metricsP$.bind(T, thread);
                    constrained_parse_of_strings_for_term(v_term, list(methods.funcall_instance_method_with_0_args(this_answer, GET_CONTENT)));
                } finally {
                    $constrained_parsing_show_inference_metricsP$.rebind(_prev_bind_2, thread);
                    $constrained_parsing_tracking_stringsP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                this_answer = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            q = cdolist_list_var.first();
        } 
        cdolist_list_var = constrained_parsing_get_actions();
        SubLObject this_action = NIL;
        this_action = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str282$_S__, this_action);
            cdolist_list_var = cdolist_list_var.rest();
            this_action = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject acquaint_demo_verify_isas(final SubLObject v_term, final SubLObject isas) {
        SubLObject successP = T;
        SubLObject cdolist_list_var = isas;
        SubLObject should_be = NIL;
        should_be = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == isa.isa_in_any_mtP(v_term, narts_high.nart_substitute(should_be))) {
                Errors.warn($str283$____DEMO_____isa__A__A__wasn_t_fo, v_term, should_be);
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            should_be = cdolist_list_var.first();
        } 
        return successP;
    }

    public static SubLObject acquaint_blair_demo() {
        acquaint_demo_who_is($$$Tony_Blair, $$TonyBlair);
        if (NIL == list_utilities.lengthE(constrained_parsing_query($sym286$_WHERE, $list287, $$BBN_CDE_StrengthenedMt, UNPROVIDED), TWO_INTEGER, UNPROVIDED)) {
            Errors.warn($str288$____DEMO_____primeMinister_WHATEV);
            return NIL;
        }
        if (NIL != isa.isa_in_any_mtP($$TonyBlair, $$Warrior)) {
            Errors.warn($str290$____DEMO____TonyBlair_was_mistake);
            return NIL;
        }
        return T;
    }

    public static SubLObject acquaint_hussein_demo() {
        acquaint_demo_who_is($$$Saddam_Hussein, $$SaddamHusseinAl_Takriti);
        return acquaint_demo_verify_isas($$SaddamHusseinAl_Takriti, list($$Vicious, list($$PresidentFn, $$Iraq)));
    }

    public static SubLObject acquaint_clinton_demo() {
        acquaint_demo_who_is($$$Bill_Clinton, $$BillClinton);
        return acquaint_demo_verify_isas($$BillClinton, list(list($$PresidentFn, $$UnitedStatesOfAmerica)));
    }

    public static SubLObject acquaint_osama_demo() {
        acquaint_demo_who_is($$$Osama, $$OsamaBinLaden);
        SubLObject successP = T;
        SubLObject cdolist_list_var = list(list($$PresidentFn, $$UnitedStatesOfAmerica));
        SubLObject should_be = NIL;
        should_be = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == isa.isa_in_any_mtP($$SaddamHusseinAl_Takriti, narts_high.nart_substitute(should_be))) {
                Errors.warn($str301$____DEMO_____isa___SaddamHusseinA, should_be);
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            should_be = cdolist_list_var.first();
        } 
        return successP;
    }

    public static SubLObject declare_constrained_parsing_file() {
        declareFunction(me, "list_of_not_disjoint_collections_p", "LIST-OF-NOT-DISJOINT-COLLECTIONS-P", 1, 0, false);
        declareFunction(me, "subcollection_naut_p", "SUBCOLLECTION-NAUT-P", 1, 0, false);
        declareFunction(me, "list_elements_preceding", "LIST-ELEMENTS-PRECEDING", 2, 1, false);
        declareFunction(me, "rotate_list_around_pivot", "ROTATE-LIST-AROUND-PIVOT", 2, 1, false);
        declareFunction(me, "current_parsing_constraint_rankings", "CURRENT-PARSING-CONSTRAINT-RANKINGS", 0, 0, false);
        declareMacro(me, "without_asserting_gafs", "WITHOUT-ASSERTING-GAFS");
        declareFunction(me, "constrained_parsing_assert_gafsP", "CONSTRAINED-PARSING-ASSERT-GAFS?", 0, 0, false);
        declareMacro(me, "while_tracking_strings", "WHILE-TRACKING-STRINGS");
        declareFunction(me, "constrained_parsing_tracking_stringsP", "CONSTRAINED-PARSING-TRACKING-STRINGS?", 0, 0, false);
        declareMacro(me, "while_tracking_substrings", "WHILE-TRACKING-SUBSTRINGS");
        declareFunction(me, "constrained_parsing_tracking_substringsP", "CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?", 0, 0, false);
        declareFunction(me, "constrained_parsing_choose_string_sources", "CONSTRAINED-PARSING-CHOOSE-STRING-SOURCES", 2, 0, false);
        declareMacro(me, "constrained_parsing_warn", "CONSTRAINED-PARSING-WARN");
        declareFunction(me, "constrained_parsing_get_actions", "CONSTRAINED-PARSING-GET-ACTIONS", 0, 0, false);
        declareFunction(me, "constrained_parsing_clear_actions", "CONSTRAINED-PARSING-CLEAR-ACTIONS", 0, 0, false);
        declareFunction(me, "constrained_parsing_record_action", "CONSTRAINED-PARSING-RECORD-ACTION", 2, 0, false);
        declareFunction(me, "get_new_isa_permissiveness_principles", "GET-NEW-ISA-PERMISSIVENESS-PRINCIPLES", 0, 0, false);
        declareFunction(me, "new_isa_permissiveness_principle_p", "NEW-ISA-PERMISSIVENESS-PRINCIPLE-P", 1, 0, false);
        declareFunction(me, "get_parsing_flow_control_principles", "GET-PARSING-FLOW-CONTROL-PRINCIPLES", 0, 0, false);
        declareFunction(me, "parsing_flow_control_principle_p", "PARSING-FLOW-CONTROL-PRINCIPLE-P", 1, 0, false);
        declareFunction(me, "parsing_faithfulness_filter_print_function_trampoline", "PARSING-FAITHFULNESS-FILTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "parsing_faithfulness_filter_p", "PARSING-FAITHFULNESS-FILTER-P", 1, 0, false);
        new constrained_parsing.$parsing_faithfulness_filter_p$UnaryFunction();
        declareFunction(me, "parsing_faithfulness_filter_type", "PARSING-FAITHFULNESS-FILTER-TYPE", 1, 0, false);
        declareFunction(me, "parsing_faithfulness_filter_mt", "PARSING-FAITHFULNESS-FILTER-MT", 1, 0, false);
        declareFunction(me, "_csetf_parsing_faithfulness_filter_type", "_CSETF-PARSING-FAITHFULNESS-FILTER-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_parsing_faithfulness_filter_mt", "_CSETF-PARSING-FAITHFULNESS-FILTER-MT", 2, 0, false);
        declareFunction(me, "make_parsing_faithfulness_filter", "MAKE-PARSING-FAITHFULNESS-FILTER", 0, 1, false);
        declareFunction(me, "visit_defstruct_parsing_faithfulness_filter", "VISIT-DEFSTRUCT-PARSING-FAITHFULNESS-FILTER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_parsing_faithfulness_filter_method", "VISIT-DEFSTRUCT-OBJECT-PARSING-FAITHFULNESS-FILTER-METHOD", 2, 0, false);
        declareFunction(me, "pprint_faithfulness_filter", "PPRINT-FAITHFULNESS-FILTER", 1, 2, false);
        declareFunction(me, "get_parsing_faithfulness_filter_types", "GET-PARSING-FAITHFULNESS-FILTER-TYPES", 0, 0, false);
        declareFunction(me, "parsing_faithfulness_filter_type_p", "PARSING-FAITHFULNESS-FILTER-TYPE-P", 1, 0, false);
        declareFunction(me, "get_parsing_faithfulness_filters", "GET-PARSING-FAITHFULNESS-FILTERS", 0, 0, false);
        declareFunction(me, "new_parsing_faithfulness_filter", "NEW-PARSING-FAITHFULNESS-FILTER", 2, 0, false);
        declareFunction(me, "parsing_arbitrary_filter_print_function_trampoline", "PARSING-ARBITRARY-FILTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "parsing_arbitrary_filter_p", "PARSING-ARBITRARY-FILTER-P", 1, 0, false);
        new constrained_parsing.$parsing_arbitrary_filter_p$UnaryFunction();
        declareFunction(me, "parsing_arbitrary_filter_type", "PARSING-ARBITRARY-FILTER-TYPE", 1, 0, false);
        declareFunction(me, "parsing_arbitrary_filter_details", "PARSING-ARBITRARY-FILTER-DETAILS", 1, 0, false);
        declareFunction(me, "parsing_arbitrary_filter_mt", "PARSING-ARBITRARY-FILTER-MT", 1, 0, false);
        declareFunction(me, "_csetf_parsing_arbitrary_filter_type", "_CSETF-PARSING-ARBITRARY-FILTER-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_parsing_arbitrary_filter_details", "_CSETF-PARSING-ARBITRARY-FILTER-DETAILS", 2, 0, false);
        declareFunction(me, "_csetf_parsing_arbitrary_filter_mt", "_CSETF-PARSING-ARBITRARY-FILTER-MT", 2, 0, false);
        declareFunction(me, "make_parsing_arbitrary_filter", "MAKE-PARSING-ARBITRARY-FILTER", 0, 1, false);
        declareFunction(me, "visit_defstruct_parsing_arbitrary_filter", "VISIT-DEFSTRUCT-PARSING-ARBITRARY-FILTER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_parsing_arbitrary_filter_method", "VISIT-DEFSTRUCT-OBJECT-PARSING-ARBITRARY-FILTER-METHOD", 2, 0, false);
        declareFunction(me, "pprint_arbitrary_filter", "PPRINT-ARBITRARY-FILTER", 1, 2, false);
        declareFunction(me, "get_parsing_arbitrary_filter_types", "GET-PARSING-ARBITRARY-FILTER-TYPES", 0, 0, false);
        declareFunction(me, "parsing_arbitrary_filter_type_p", "PARSING-ARBITRARY-FILTER-TYPE-P", 1, 0, false);
        declareFunction(me, "get_parsing_arbitrary_filters", "GET-PARSING-ARBITRARY-FILTERS", 0, 0, false);
        declareFunction(me, "new_parsing_arbitrary_filter", "NEW-PARSING-ARBITRARY-FILTER", 3, 0, false);
        declareFunction(me, "get_bug_avoidance_principles", "GET-BUG-AVOIDANCE-PRINCIPLES", 0, 0, false);
        declareFunction(me, "bug_avoidance_principle_p", "BUG-AVOIDANCE-PRINCIPLE-P", 1, 0, false);
        declareFunction(me, "parsing_principle_p", "PARSING-PRINCIPLE-P", 1, 0, false);
        declareFunction(me, "parsing_filter_p", "PARSING-FILTER-P", 1, 0, false);
        declareFunction(me, "parsing_filter_type_p", "PARSING-FILTER-TYPE-P", 1, 0, false);
        declareFunction(me, "get_all_parsing_principles", "GET-ALL-PARSING-PRINCIPLES", 0, 0, false);
        declareFunction(me, "get_all_parsing_filter_types", "GET-ALL-PARSING-FILTER-TYPES", 0, 0, false);
        declareFunction(me, "get_all_parsing_filters", "GET-ALL-PARSING-FILTERS", 0, 0, false);
        declareFunction(me, "get_all_parsing_constraints", "GET-ALL-PARSING-CONSTRAINTS", 0, 0, false);
        declareFunction(me, "parsing_constraint_p", "PARSING-CONSTRAINT-P", 1, 0, false);
        declareMacro(me, "do_constrained_parsing_constraints", "DO-CONSTRAINED-PARSING-CONSTRAINTS");
        declareMacro(me, "do_constrained_parsing_principles", "DO-CONSTRAINED-PARSING-PRINCIPLES");
        declareMacro(me, "do_constrained_parsing_filters", "DO-CONSTRAINED-PARSING-FILTERS");
        declareFunction(me, "initialize_constrained_parsing", "INITIALIZE-CONSTRAINED-PARSING", 0, 2, false);
        declareFunction(me, "parsing_constraint_outranksP", "PARSING-CONSTRAINT-OUTRANKS?", 2, 0, false);
        declareFunction(me, "which_constraints_outrank", "WHICH-CONSTRAINTS-OUTRANK", 1, 0, false);
        declareFunction(me, "order_parsing_constraints", "ORDER-PARSING-CONSTRAINTS", 2, 1, false);
        declareFunction(me, "frontload_parsing_constraint", "FRONTLOAD-PARSING-CONSTRAINT", 1, 0, false);
        declareFunction(me, "constrained_parsing_query_defaults", "CONSTRAINED-PARSING-QUERY-DEFAULTS", 0, 0, false);
        declareMacro(me, "without_rewrite_backtracking", "WITHOUT-REWRITE-BACKTRACKING");
        declareFunction(me, "constrained_parsing_rewrite_backtracking", "CONSTRAINED-PARSING-REWRITE-BACKTRACKING", 1, 0, false);
        declareFunction(me, "constrained_parsing_query", "CONSTRAINED-PARSING-QUERY", 2, 2, false);
        declareFunction(me, "constrained_parsing_query_lexical", "CONSTRAINED-PARSING-QUERY-LEXICAL", 2, 2, false);
        declareFunction(me, "constrained_parsing_query_successP", "CONSTRAINED-PARSING-QUERY-SUCCESS?", 1, 2, false);
        declareFunction(me, "constrained_parse_involves_group_coercionP", "CONSTRAINED-PARSE-INVOLVES-GROUP-COERCION?", 1, 1, false);
        declareFunction(me, "constrained_parsing_illegal_isa_workaroundP", "CONSTRAINED-PARSING-ILLEGAL-ISA-WORKAROUND?", 1, 1, false);
        declareFunction(me, "constrained_parsing_gaf_fails_constraintsP_int", "CONSTRAINED-PARSING-GAF-FAILS-CONSTRAINTS?-INT", 2, 1, false);
        declareFunction(me, "constrained_parsing_gaf_fails_constraintsP", "CONSTRAINED-PARSING-GAF-FAILS-CONSTRAINTS?", 2, 0, false);
        declareFunction(me, "constrained_parsing_unassert", "CONSTRAINED-PARSING-UNASSERT", 2, 0, false);
        declareFunction(me, "constrained_parsing_possibly_assert", "CONSTRAINED-PARSING-POSSIBLY-ASSERT", 2, 1, false);
        declareMacro(me, "constrained_parsing_assert_through_channels", "CONSTRAINED-PARSING-ASSERT-THROUGH-CHANNELS");
        declareFunction(me, "constrained_parsing_coerce_to_group", "CONSTRAINED-PARSING-COERCE-TO-GROUP", 1, 0, false);
        declareMacro(me, "constrained_parsing_note_isa", "CONSTRAINED-PARSING-NOTE-ISA");
        declareFunction(me, "constrained_parse_explode_np_string", "CONSTRAINED-PARSE-EXPLODE-NP-STRING", 1, 1, false);
        declareFunction(me, "constrained_parse_of_strings_for_term", "CONSTRAINED-PARSE-OF-STRINGS-FOR-TERM", 2, 0, false);
        declareFunction(me, "constrained_parsing_get_acceptable_isas", "CONSTRAINED-PARSING-GET-ACCEPTABLE-ISAS", 2, 0, false);
        declareFunction(me, "constrained_parse_of_substrings_for_term", "CONSTRAINED-PARSE-OF-SUBSTRINGS-FOR-TERM", 2, 1, false);
        declareFunction(me, "constrained_parsing_faceting_violationP", "CONSTRAINED-PARSING-FACETING-VIOLATION?", 3, 0, false);
        declareFunction(me, "constrained_parse_of_string_for_term", "CONSTRAINED-PARSE-OF-STRING-FOR-TERM", 2, 0, false);
        declareFunction(me, "constrained_parse_of_string_for_term_int", "CONSTRAINED-PARSE-OF-STRING-FOR-TERM-INT", 2, 1, false);
        declareFunction(me, "constrained_parse_extract_cardinality", "CONSTRAINED-PARSE-EXTRACT-CARDINALITY", 1, 0, false);
        declareFunction(me, "constrained_parse_search_for_rewrites", "CONSTRAINED-PARSE-SEARCH-FOR-REWRITES", 2, 1, false);
        declareFunction(me, "frontload_genitive_if_any", "FRONTLOAD-GENITIVE-IF-ANY", 1, 0, false);
        declareFunction(me, "eliminate_redundant_narts", "ELIMINATE-REDUNDANT-NARTS", 1, 0, false);
        declareFunction(me, "constrained_parse_of_nart_isas", "CONSTRAINED-PARSE-OF-NART-ISAS", 2, 0, false);
        declareFunction(me, "constrained_parse_via_relation_all_instance", "CONSTRAINED-PARSE-VIA-RELATION-ALL-INSTANCE", 2, 0, false);
        declareFunction(me, "constrained_parse_of_namestring_for_term", "CONSTRAINED-PARSE-OF-NAMESTRING-FOR-TERM", 2, 0, false);
        declareFunction(me, "constrained_parse_of_business_suffix", "CONSTRAINED-PARSE-OF-BUSINESS-SUFFIX", 2, 0, false);
        declareFunction(me, "constrained_parse_of_first_and_last_names", "CONSTRAINED-PARSE-OF-FIRST-AND-LAST-NAMES", 2, 0, false);
        declareFunction(me, "constrained_parse_of_salutation_if_any", "CONSTRAINED-PARSE-OF-SALUTATION-IF-ANY", 2, 0, false);
        declareFunction(me, "acquaint_demo_rank_assertion_mts", "ACQUAINT-DEMO-RANK-ASSERTION-MTS", 0, 0, false);
        declareFunction(me, "initialize_acquaint_highly_relevant_rankings", "INITIALIZE-ACQUAINT-HIGHLY-RELEVANT-RANKINGS", 0, 0, false);
        declareFunction(me, "initialize_acquaint_sort_of_relevant_rankings", "INITIALIZE-ACQUAINT-SORT-OF-RELEVANT-RANKINGS", 0, 0, false);
        declareFunction(me, "highly_relevant_acquaint_answerP", "HIGHLY-RELEVANT-ACQUAINT-ANSWER?", 1, 0, false);
        declareFunction(me, "acquaint_demo_who_is", "ACQUAINT-DEMO-WHO-IS", 2, 0, false);
        declareFunction(me, "acquaint_demo_verify_isas", "ACQUAINT-DEMO-VERIFY-ISAS", 2, 0, false);
        declareFunction(me, "acquaint_blair_demo", "ACQUAINT-BLAIR-DEMO", 0, 0, false);
        declareFunction(me, "acquaint_hussein_demo", "ACQUAINT-HUSSEIN-DEMO", 0, 0, false);
        declareFunction(me, "acquaint_clinton_demo", "ACQUAINT-CLINTON-DEMO", 0, 0, false);
        declareFunction(me, "acquaint_osama_demo", "ACQUAINT-OSAMA-DEMO", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_constrained_parsing_file() {
        deflexical("*CONSTRAINED-PARSING-RANKINGS*", SubLTrampolineFile.maybeDefault($constrained_parsing_rankings$, $constrained_parsing_rankings$, NIL));
        defparameter("*CONSTRAINED-PARSING-WITHOUT-ASSERTING?*", NIL);
        defparameter("*CONSTRAINED-PARSING-TRACKING-STRINGS?*", NIL);
        defparameter("*CONSTRAINED-PARSING-TRACKING-SUBSTRINGS?*", NIL);
        defparameter("*CONSTRAINED-PARSING-TRACE-LEVEL*", ZERO_INTEGER);
        deflexical("*CONSTRAINED-PARSING-ACTION-LOG*", SubLTrampolineFile.maybeDefault($constrained_parsing_action_log$, $constrained_parsing_action_log$, NIL));
        defparameter("*CONSTRAINED-PARSING-CASE-SENSITIVE?*", NIL);
        defparameter("*CONSTRAINED-PARSING-ASSERT-INTO-MT*", NIL);
        defparameter("*CONSTRAINED-PARSING-CONSIDER-ADJECTIVES?*", NIL);
        defparameter("*CONSTRAINED-PARSING-CARDINALITY-KNOWN*", NIL);
        defparameter("*CONSTRAINED-PARSING-ALLOW-GROUP-COERCION?*", T);
        defparameter("*NEW-ISA-PERMISSIVENESS-PRINCIPLES*", list($AVOIDREDUNDANTFACETS, $PROHIBITSUBCOLLECTIONFNS, $PROHIBITAMBIGUOUSGAFS, $PERMISSIVENESSCUTOFF, $PERMITALLNONDISJOINTISAS, $PROHIBITGROUPCOERCION));
        defparameter("*PARSING-FLOW-CONTROL-PRINCIPLES*", list(new SubLObject[]{ $STRIPCARDINALITY, $CASESENSITIVELEXICON, $WIDESCOPEPRECISION, $PERMITADJECTIVEPARSES, $PERMITNARTISAS, $RELATIONALLINSTANCEPARSE, $NARROWSCOPEPRECISION, $CASEINSENSITIVELEXICON, $MINIMALTIMEPARSE, $PERMITRELATIVECLAUSEPARSES, $PERMITPPCOMPPARSES }));
        defconstant("*DTP-PARSING-FAITHFULNESS-FILTER*", PARSING_FAITHFULNESS_FILTER);
        defparameter("*PARSING-FAITHFULNESS-FILTER-TYPES*", list($OBEYISASINMT, $OBEYGAFSINMT, $FAITHFULNESSFILTERCUTOFF));
        defparameter("*DEFAULT-FAITHFULNESS-FILTER*", NIL);
        defparameter("*DEFAULT-DEFINITIONAL-FAITHFULNESS-FILTER*", NIL);
        defconstant("*DTP-PARSING-ARBITRARY-FILTER*", PARSING_ARBITRARY_FILTER);
        defparameter("*PARSING-ARBITRARY-FILTER-TYPES*", list($NOISASARESPECS, $ASSERTINTOMT, $ARBITRARYFILTERCUTOFF));
        defparameter("*DEFAULT-ASSERTION-FILTER*", NIL);
        defparameter("*DEFAULT-DEFINITIONAL-ASSERTION-FILTER*", NIL);
        defparameter("*BUG-AVOIDANCE-PRINCIPLES*", list($COMPENSATEFORISAPROBLEMS, $BUGAVOIDANCECUTOFF, $AVOIDREWRITEPARSES, $AVOIDNAMESTRINGPARSES));
        defparameter("*CONSTRAINED-PARSING-QUERY-MAX-TRANSFORMATION-DEPTH*", ZERO_INTEGER);
        defparameter("*CONSTRAINED-PARSING-QUERY-MAX-TIME*", $int$30);
        defparameter("*CONSTRAINED-PARSING-QUERY-PRODUCTIVITY-LIMIT*", $int$2000000);
        defparameter("*TRACE-NEW-CYC-QUERY?*", NIL);
        defparameter("*DEBUG-NEW-CYC-QUERY?*", NIL);
        defparameter("*CONSTRAINED-PARSING-REWRITE-BACKTRACKING?*", T);
        defparameter("*WITH-FAITHFULNESS-CUTOFF?*", NIL);
        defparameter("*SKIP-DEFINITIONAL-FAITHFULNESS?*", NIL);
        defparameter("*WITH-ARBITRARY-FILTER-CUTOFF?*", NIL);
        defparameter("*WITH-BUG-AVOIDANCE-CUTOFF?*", NIL);
        defparameter("*CONSTRAINED-PARSING-SHOW-INFERENCE-METRICS?*", NIL);
        defparameter("*ACQUAINT-HIGHLY-RELEVANT-CUTOFF*", TEN_INTEGER);
        defparameter("*ACQUAINT-DEMO-ASSERTION-FILTER*", NIL);
        defparameter("*ACQUAINT-DEMO-LEXICAL-ASSERTION-FILTER*", NIL);
        return NIL;
    }

    public static SubLObject setup_constrained_parsing_file() {
        declare_defglobal($constrained_parsing_rankings$);
        declare_defglobal($constrained_parsing_action_log$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parsing_faithfulness_filter$.getGlobalValue(), symbol_function(PARSING_FAITHFULNESS_FILTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list37);
        def_csetf(PARSING_FAITHFULNESS_FILTER_TYPE, _CSETF_PARSING_FAITHFULNESS_FILTER_TYPE);
        def_csetf(PARSING_FAITHFULNESS_FILTER_MT, _CSETF_PARSING_FAITHFULNESS_FILTER_MT);
        identity(PARSING_FAITHFULNESS_FILTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parsing_faithfulness_filter$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSING_FAITHFULNESS_FILTER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parsing_arbitrary_filter$.getGlobalValue(), symbol_function(PARSING_ARBITRARY_FILTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list64);
        def_csetf(PARSING_ARBITRARY_FILTER_TYPE, _CSETF_PARSING_ARBITRARY_FILTER_TYPE);
        def_csetf(PARSING_ARBITRARY_FILTER_DETAILS, _CSETF_PARSING_ARBITRARY_FILTER_DETAILS);
        def_csetf(PARSING_ARBITRARY_FILTER_MT, _CSETF_PARSING_ARBITRARY_FILTER_MT);
        identity(PARSING_ARBITRARY_FILTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parsing_arbitrary_filter$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARSING_ARBITRARY_FILTER_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constrained_parsing_file();
    }

    @Override
    public void initializeVariables() {
        init_constrained_parsing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constrained_parsing_file();
    }

    static {



















































































































































































































































































































































    }

    public static final class $parsing_faithfulness_filter_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $mt;

        private static final SubLStructDeclNative structDecl;

        private $parsing_faithfulness_filter_native() {
            this.$type = Lisp.NIL;
            this.$mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }

        static {
            structDecl = makeStructDeclNative($parsing_faithfulness_filter_native.class, PARSING_FAITHFULNESS_FILTER, PARSING_FAITHFULNESS_FILTER_P, $list31, $list32, new String[]{ "$type", "$mt" }, $list33, $list34, PPRINT_FAITHFULNESS_FILTER);
        }
    }

    public static final class $parsing_faithfulness_filter_p$UnaryFunction extends UnaryFunction {
        public $parsing_faithfulness_filter_p$UnaryFunction() {
            super(extractFunctionNamed("PARSING-FAITHFULNESS-FILTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parsing_faithfulness_filter_p(arg1);
        }
    }

    public static final class $parsing_arbitrary_filter_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $details;

        public SubLObject $mt;

        private static final SubLStructDeclNative structDecl;

        private $parsing_arbitrary_filter_native() {
            this.$type = Lisp.NIL;
            this.$details = Lisp.NIL;
            this.$mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$details;
        }

        @Override
        public SubLObject getField4() {
            return this.$mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$details = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }

        static {
            structDecl = makeStructDeclNative($parsing_arbitrary_filter_native.class, PARSING_ARBITRARY_FILTER, PARSING_ARBITRARY_FILTER_P, $list58, $list59, new String[]{ "$type", "$details", "$mt" }, $list60, $list61, PPRINT_ARBITRARY_FILTER);
        }
    }

    public static final class $parsing_arbitrary_filter_p$UnaryFunction extends UnaryFunction {
        public $parsing_arbitrary_filter_p$UnaryFunction() {
            super(extractFunctionNamed("PARSING-ARBITRARY-FILTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parsing_arbitrary_filter_p(arg1);
        }
    }
}

/**
 * Total time: 1001 ms synthetic
 */
