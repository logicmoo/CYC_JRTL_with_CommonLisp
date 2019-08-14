package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.control_vars.within_queryP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class plausibility_utilities extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new plausibility_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.plausibility_utilities";

    // defparameter
    private static final SubLSymbol $default_plausibility_check_mt$ = makeSymbol("*DEFAULT-PLAUSIBILITY-CHECK-MT*");

    // deflexical
    private static final SubLSymbol $implausibility_properties$ = makeSymbol("*IMPLAUSIBILITY-PROPERTIES*");

    // defparameter
    private static final SubLSymbol $debug_implausibilityP$ = makeSymbol("*DEBUG-IMPLAUSIBILITY?*");

    // defparameter
    private static final SubLSymbol $debug_implausibility_wf_checksP$ = makeSymbol("*DEBUG-IMPLAUSIBILITY-WF-CHECKS?*");

    // defparameter
    private static final SubLSymbol $implausibility_override_properties$ = makeSymbol("*IMPLAUSIBILITY-OVERRIDE-PROPERTIES*");

    // defparameter
    private static final SubLSymbol $implausibility_stats_table$ = makeSymbol("*IMPLAUSIBILITY-STATS-TABLE*");

    // defparameter
    private static final SubLSymbol $default_plausibility_percent_cutoff$ = makeSymbol("*DEFAULT-PLAUSIBILITY-PERCENT-CUTOFF*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_completely_implausible$ = makeSymbol("*PLAUSIBILITY-FACTOR-COMPLETELY-IMPLAUSIBLE*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_non_wff$ = makeSymbol("*PLAUSIBILITY-FACTOR-NON-WFF*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_type_violation$ = makeSymbol("*PLAUSIBILITY-FACTOR-TYPE-VIOLATION*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_arg_violation$ = makeSymbol("*PLAUSIBILITY-FACTOR-ARG-VIOLATION*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_arg_disjointness$ = makeSymbol("*PLAUSIBILITY-FACTOR-ARG-DISJOINTNESS*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_not_isa_or_genls$ = makeSymbol("*PLAUSIBILITY-FACTOR-NOT-ISA-OR-GENLS*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_inter_sentential_contradiction$ = makeSymbol("*PLAUSIBILITY-FACTOR-INTER-SENTENTIAL-CONTRADICTION*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_implied_arg_restriction$ = makeSymbol("*PLAUSIBILITY-FACTOR-IMPLIED-ARG-RESTRICTION*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_no_type_restriction$ = makeSymbol("*PLAUSIBILITY-FACTOR-NO-TYPE-RESTRICTION*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_typical_volume_violation$ = makeSymbol("*PLAUSIBILITY-FACTOR-TYPICAL-VOLUME-VIOLATION*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_esoteric_term$ = makeSymbol("*PLAUSIBILITY-FACTOR-ESOTERIC-TERM*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_splitting_hairs_cutoff$ = makeSymbol("*PLAUSIBILITY-FACTOR-SPLITTING-HAIRS-CUTOFF*");

    // defparameter
    private static final SubLSymbol $plausibility_factor_completely_plausible$ = makeSymbol("*PLAUSIBILITY-FACTOR-COMPLETELY-PLAUSIBLE*");

    // defparameter
    private static final SubLSymbol $default_sentence_plausibility_score_properties$ = makeSymbol("*DEFAULT-SENTENCE-PLAUSIBILITY-SCORE-PROPERTIES*");

    // defparameter
    private static final SubLSymbol $typical_volume_applicable_predicates$ = makeSymbol("*TYPICAL-VOLUME-APPLICABLE-PREDICATES*");

    // defparameter
    private static final SubLSymbol $typical_volume_applicable_pred_inverses$ = makeSymbol("*TYPICAL-VOLUME-APPLICABLE-PRED-INVERSES*");

    // deflexical
    private static final SubLSymbol $implausible_admitted_argumentP_caching_state$ = makeSymbol("*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*");

    private static final SubLObject $$PlausibilityQueryMt = reader_make_constant_shell(makeString("PlausibilityQueryMt"));

    private static final SubLList $list1 = list(new SubLObject[] { makeKeyword("JUSTIFY?"), makeKeyword("RETURN-BOOLEAN?"), makeKeyword("PERCENT-CUTOFF"), makeKeyword("PERCENT-CLIPPING?"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("CLEAR-CACHES?"), makeKeyword("GATHER-STATS?"),
	    makeKeyword("SUPPRESS-WFF-CHECKS?"), makeKeyword("WFF-CHECK-TYPE"), makeKeyword("SUPPRESS-WFT-CHECKS?"), makeKeyword("WFT-CHECK-TYPE"), makeKeyword("SUPPRESS-WF-CHECKS?"), makeKeyword("SUPPRESS-PLAUSIBLE-NART?"), makeKeyword("FORCE-GENLS-TRUTH-CHECK?") });

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLFloat $float$0_02 = makeDouble(0.02);

    private static final SubLFloat $float$0_03 = makeDouble(0.03);

    private static final SubLFloat $float$0_04 = makeDouble(0.04);

    private static final SubLFloat $float$0_05 = makeDouble(0.05);

    private static final SubLFloat $float$0_055 = makeDouble(0.055);

    private static final SubLFloat $float$0_06 = makeDouble(0.06);

    private static final SubLFloat $float$0_07 = makeDouble(0.07);

    private static final SubLFloat $float$0_08 = makeDouble(0.08);

    private static final SubLFloat $float$0_09 = makeDouble(0.09);

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol $PERCENT_CUTOFF = makeKeyword("PERCENT-CUTOFF");

    private static final SubLSymbol $kw18$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    private static final SubLSymbol $kw19$SUPPRESS_PLAUSIBLE_NART_ = makeKeyword("SUPPRESS-PLAUSIBLE-NART?");

    private static final SubLSymbol $kw21$GATHER_STATS_ = makeKeyword("GATHER-STATS?");

    private static final SubLSymbol $kw22$TIMED_OUT_ = makeKeyword("TIMED-OUT?");

    private static final SubLSymbol $kw23$IMPLAUSIBLE_ = makeKeyword("IMPLAUSIBLE?");

    private static final SubLSymbol $kw24$PLAUSIBLE_ = makeKeyword("PLAUSIBLE?");

    private static final SubLString $str25$Bad_justification_ = makeString("Bad justification!");

    private static final SubLSymbol $kw26$PERCENT_CLIPPING_ = makeKeyword("PERCENT-CLIPPING?");

    private static final SubLSymbol $kw27$RETURN_BOOLEAN_ = makeKeyword("RETURN-BOOLEAN?");

    private static final SubLSymbol $EAGER = makeKeyword("EAGER");

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLSymbol $kw31$FORCE_GENLS_TRUTH_CHECK_ = makeKeyword("FORCE-GENLS-TRUTH-CHECK?");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list33 = list(makeSymbol("GENLS"), makeSymbol("COL1"), makeSymbol("COL2"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list35 = list(makeSymbol("ISA"), makeSymbol("INST"), makeSymbol("COL"));

    private static final SubLObject $$admittedArgument = reader_make_constant_shell(makeString("admittedArgument"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$wffViolation = reader_make_constant_shell(makeString("wffViolation"));

    private static final SubLString $str41$Sentence_contains_contradictory_c = makeString("Sentence contains contradictory conjuncts");

    private static final SubLSymbol $LAZY = makeKeyword("LAZY");

    private static final SubLSymbol $RELATION_DIRECTION = makeKeyword("RELATION-DIRECTION");

    private static final SubLSymbol $COL_ARG = makeKeyword("COL-ARG");

    private static final SubLList $list46 = list(makeSymbol("COL-ARG"), makeSymbol("PRED"), makeSymbol("TYPE"));

    private static final SubLSymbol $ARG_ORDER = makeKeyword("ARG-ORDER");

    private static final SubLSymbol $TYPE_COL_PRED = makeKeyword("TYPE-COL-PRED");

    private static final SubLList $list49 = list(makeSymbol("COL-ARG"), makeSymbol("PRED"), makeSymbol("THING"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLList $list51 = list(makeSymbol("COL1"), makeSymbol("COL2"));

    private static final SubLObject $$CollectionUnionFn = reader_make_constant_shell(makeString("CollectionUnionFn"));

    private static final SubLSymbol POSSIBLY_FIND_NART = makeSymbol("POSSIBLY-FIND-NART");

    private static final SubLSymbol CATEGORIZE_SUBCOLLECTION_PREDICATE = makeSymbol("CATEGORIZE-SUBCOLLECTION-PREDICATE");

    private static final SubLObject $const55$SubcollectionOfWithRelationToType = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn"));

    private static final SubLList $list56 = list(makeKeyword("RELATION-DIRECTION"), makeKeyword("TO"), makeKeyword("COL-ARG"), T);

    private static final SubLObject $const57$SubcollectionOfWithRelationFromTy = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn"));

    private static final SubLList $list58 = list(makeKeyword("RELATION-DIRECTION"), $FROM, makeKeyword("COL-ARG"), T);

    private static final SubLObject $const59$SubcollectionOfWithoutRelationToT = reader_make_constant_shell(makeString("SubcollectionOfWithoutRelationToTypeFn"));

    private static final SubLList $list60 = list(makeKeyword("RELATION-DIRECTION"), makeKeyword("TO"), makeKeyword("COL-ARG"), T, makeKeyword("INVERSE-SUBSET"), T);

    private static final SubLObject $const61$SubcollectionOfWithoutRelationFro = reader_make_constant_shell(makeString("SubcollectionOfWithoutRelationFromTypeFn"));

    private static final SubLList $list62 = list(makeKeyword("RELATION-DIRECTION"), $FROM, makeKeyword("COL-ARG"), T, makeKeyword("INVERSE-SUBSET"), T);

    private static final SubLObject $const63$SitTypeSpecWithTypeRestrictionOnR = reader_make_constant_shell(makeString("SitTypeSpecWithTypeRestrictionOnRolePlayerFn"));

    private static final SubLList $list64 = list(makeKeyword("RELATION-DIRECTION"), makeKeyword("TO"), makeKeyword("COL-ARG"), T, makeKeyword("TEMPORALLY-SANE?"), T);

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLList $list66 = list(makeKeyword("RELATION-DIRECTION"), makeKeyword("TO"), makeKeyword("COL-ARG"), NIL);

    private static final SubLObject $$SubcollectionOfWithRelationFromFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn"));

    private static final SubLList $list68 = list(makeKeyword("RELATION-DIRECTION"), $FROM, makeKeyword("COL-ARG"), NIL);

    private static final SubLObject $const69$SubcollectionOfWithoutRelationToF = reader_make_constant_shell(makeString("SubcollectionOfWithoutRelationToFn"));

    private static final SubLList $list70 = list(makeKeyword("RELATION-DIRECTION"), makeKeyword("TO"), makeKeyword("COL-ARG"), NIL, makeKeyword("INVERSE-SUBSET"), T);

    private static final SubLObject $const71$SubcollectionOfWithoutRelationFro = reader_make_constant_shell(makeString("SubcollectionOfWithoutRelationFromFn"));

    private static final SubLList $list72 = list(makeKeyword("RELATION-DIRECTION"), $FROM, makeKeyword("COL-ARG"), NIL, makeKeyword("INVERSE-SUBSET"), T);

    private static final SubLObject $$UsingAForFn = reader_make_constant_shell(makeString("UsingAForFn"));

    private static final SubLList $list74 = list(makeKeyword("RELATION-DIRECTION"), makeKeyword("TO"), makeKeyword("COL-ARG"), T, makeKeyword("ARG-ORDER"), makeKeyword("TYPE-COL-PRED"));

    private static final SubLObject $$ReifiableFunction = reader_make_constant_shell(makeString("ReifiableFunction"));

    private static final SubLSymbol $kw76$SUPPRESS_WFF_CHECKS_ = makeKeyword("SUPPRESS-WFF-CHECKS?");

    private static final SubLSymbol $kw77$SUPPRESS_WF_CHECKS_ = makeKeyword("SUPPRESS-WF-CHECKS?");

    private static final SubLString $str78$__implausible_sentence_wrt_variab = makeString("~&implausible-sentence-wrt-variable-arguments: ~S~%");

    private static final SubLString $str79$Variable_types_are_disjoint_ = makeString("Variable types are disjoint.");

    private static final SubLSymbol $kw80$SUPPRESS_WFT_CHECKS_ = makeKeyword("SUPPRESS-WFT-CHECKS?");

    private static final SubLSymbol $WFT_CHECK_TYPE = makeKeyword("WFT-CHECK-TYPE");

    private static final SubLString $str82$__implausible_term_wrt_wft___S__ = makeString("~&implausible-term-wrt-wft: ~S~%");

    private static final SubLList $list83 = list(makeKeyword("IO-MODE"), makeKeyword("NL"));

    private static final SubLSymbol $WFF_CHECK_TYPE = makeKeyword("WFF-CHECK-TYPE");

    private static final SubLString $str85$__implausible_sentence_wrt_wff___ = makeString("~&implausible-sentence-wrt-wff: ~S~%");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLList $list87 = list(reader_make_constant_shell(makeString("Collection")));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLList $list89 = list(reader_make_constant_shell(makeString("CycLReifiedDenotationalTerm")));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLList $list91 = list(reader_make_constant_shell(makeString("CycLClosedDenotationalTerm")));

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLObject $$argSometimesIsa = reader_make_constant_shell(makeString("argSometimesIsa"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLSymbol $MIN_CEILING_COLS = makeKeyword("MIN-CEILING-COLS");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLList $list99 = list(reader_make_constant_shell(makeString("genls")));

    private static final SubLList $list100 = list(reader_make_constant_shell(makeString("isa")));

    private static final SubLList $list101 = list(reader_make_constant_shell(makeString("physicalDecompositions")));

    private static final SubLList $list102 = list(reader_make_constant_shell(makeString("objectFoundInLocation")));

    private static final SubLObject $$typicallyMoreVoluminousThan = reader_make_constant_shell(makeString("typicallyMoreVoluminousThan"));

    private static final SubLSymbol $sym106$CLOSED_ = makeSymbol("CLOSED?");

    private static final SubLSymbol $sym107$ESOTERIC_TERM_ = makeSymbol("ESOTERIC-TERM?");

    private static final SubLList $list108 = list(reader_make_constant_shell(makeString("EsotericTerm")));

    private static final SubLObject $$EsotericTerm = reader_make_constant_shell(makeString("EsotericTerm"));

    private static final SubLObject $$ExotericTerm = reader_make_constant_shell(makeString("ExotericTerm"));

    private static final SubLSymbol CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS = makeSymbol("CLEAR-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS");

    private static final SubLSymbol CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED = makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED");

    private static final SubLSymbol CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED = makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED");

    private static final SubLSymbol CLEAR_TVA_CHECK_CACHED = makeSymbol("CLEAR-TVA-CHECK-CACHED");

    private static final SubLSymbol $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_ = makeSymbol("CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?");

    private static final SubLSymbol CLEAR_DO_TVA_QUERY_TYPE_TYPE = makeSymbol("CLEAR-DO-TVA-QUERY-TYPE-TYPE");

    private static final SubLSymbol CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH = makeSymbol("CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH");

    private static final SubLString $str118$__tweak_implausibility_type_restr = makeString("~&tweak-implausibility-type-restrictions: ~A~%");

    private static final SubLSymbol $tweak_implausibility_type_restrictions_caching_state$ = makeSymbol("*TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-CACHING-STATE*");

    private static final SubLString $str120$__implied_argn_type_requirements_ = makeString("~&implied-argn-type-requirements-for-pred: ~A~%");

    private static final SubLSymbol $implied_argn_type_requirements_for_pred_caching_state$ = makeSymbol("*IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-CACHING-STATE*");

    private static final SubLString $str122$__implied_argn_type_restrictions_ = makeString("~&implied-argn-type-restrictions-for-pred: ~A~%");

    private static final SubLSymbol $implied_argn_type_restrictions_for_pred_caching_state$ = makeSymbol("*IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-CACHING-STATE*");

    private static final SubLString $str124$__tva_check_cached___A__ = makeString("~&tva-check-cached: ~A~%");

    private static final SubLSymbol $tva_check_cached_caching_state$ = makeSymbol("*TVA-CHECK-CACHED-CACHING-STATE*");

    private static final SubLString $str126$__implausible_admitted_argument__ = makeString("~&implausible-admitted-argument?: ~A~%");

    private static final SubLSymbol $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_ = makeSymbol("*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*");

    private static final SubLString $str128$__do_tva_query_type_type___A__ = makeString("~&do-tva-query-type-type: ~A~%");

    private static final SubLSymbol $do_tva_query_type_type_caching_state$ = makeSymbol("*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*");

    private static final SubLString $str130$__do_tva_query_type_disjoint_with = makeString("~&do-tva-query-type-disjoint-with: ~A~%");

    private static final SubLSymbol $do_tva_query_type_disjoint_with_caching_state$ = makeSymbol("*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*");

    private static final SubLSymbol TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS = makeSymbol("TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS");

    private static final SubLSymbol IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED = makeSymbol("IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED");

    private static final SubLObject $$relationNotExistsExists = reader_make_constant_shell(makeString("relationNotExistsExists"));

    private static final SubLSymbol IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED = makeSymbol("IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED");

    private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLObject $$someTypePlaysRoleInSituationType = reader_make_constant_shell(makeString("someTypePlaysRoleInSituationType"));

    private static final SubLList $list139 = list(reader_make_constant_shell(makeString("PartiallyTangible")));

    private static final SubLList $list141 = list(makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATION"));

    private static final SubLSymbol TVA_CHECK_CACHED = makeSymbol("TVA-CHECK-CACHED");

    private static final SubLSymbol $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_ = makeSymbol("IMPLAUSIBLE-ADMITTED-ARGUMENT?");

    private static final SubLInteger $int$8192 = makeInteger(8192);

    private static final SubLString $str146$hl_justify_asent_not_legal_to_cal = makeString("hl-justify-asent not legal to call within inference to avoid infinite recursion");

    private static final SubLList $list147 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("SUPPORTS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $kw148$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLString $str149$Could_not_find_hl_support_for__S_ = makeString("Could not find hl-support for ~S in ~S, using :OPAQUE");

    public static SubLObject sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
	if (mt == UNPROVIDED) {
	    mt = $default_plausibility_check_mt$.getDynamicValue();
	}
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	v_properties = list_utilities.merge_plist($default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
	return implausible_sentenceP(sentence, mt, v_properties, UNPROVIDED);
    }

    public static SubLObject why_sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
	if (mt == UNPROVIDED) {
	    mt = $default_plausibility_check_mt$.getDynamicValue();
	}
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	v_properties = list_utilities.merge_plist($default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
	v_properties = putf(v_properties, $JUSTIFY_, T);
	return implausible_sentenceP(sentence, mt, v_properties, UNPROVIDED);
    }

    public static SubLObject sentence_plausibility_score(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
	if (mt == UNPROVIDED) {
	    mt = $default_plausibility_check_mt$.getDynamicValue();
	}
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	v_properties = list_utilities.merge_plist($default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
	thread.resetMultipleValues();
	final SubLObject plausibility_factor = implausible_sentenceP(sentence, mt, v_properties, UNPROVIDED);
	final SubLObject justifications = thread.secondMultipleValue();
	thread.resetMultipleValues();
	return values(floor(multiply($int$100, plausibility_factor), UNPROVIDED), justifications);
    }

    public static SubLObject why_sentence_plausibility_score(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
	if (mt == UNPROVIDED) {
	    mt = $default_plausibility_check_mt$.getDynamicValue();
	}
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	v_properties = list_utilities.merge_plist($default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
	v_properties = putf(v_properties, $JUSTIFY_, T);
	thread.resetMultipleValues();
	final SubLObject plausibility_factor = implausible_sentenceP(sentence, mt, v_properties, UNPROVIDED);
	final SubLObject justifications = thread.secondMultipleValue();
	thread.resetMultipleValues();
	return values(floor(multiply($int$100, plausibility_factor), UNPROVIDED), justifications);
    }

    public static SubLObject implausible_sentenceP(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject depth) {
	if (mt == UNPROVIDED) {
	    mt = $default_plausibility_check_mt$.getDynamicValue();
	}
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject justifyP = get_implausibility_property($JUSTIFY_, v_properties, UNPROVIDED);
	final SubLObject max_time = get_implausibility_property($MAX_TIME, v_properties, UNPROVIDED);
	final SubLObject percent_cutoff = get_implausibility_property($PERCENT_CUTOFF, v_properties, $default_plausibility_percent_cutoff$.getDynamicValue(thread));
	if (v_properties == T) {
	    v_properties = NIL;
	}
	if (NIL != get_implausibility_property($kw18$CLEAR_CACHES_, v_properties, UNPROVIDED)) {
	    clear_plausibility_caches();
	}
	if (NIL != $debug_implausibilityP$.getDynamicValue(thread)) {
	    v_properties = putf(v_properties, $JUSTIFY_, T);
	}
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	SubLObject timed_outP = NIL;
	final SubLObject start_time = get_internal_real_time();
	SubLObject actual_time = NIL;
	final SubLObject tag = with_timeout_make_tag();
	try {
	    thread.throwStack.push(tag);
	    final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
	    try {
		$within_with_timeout$.bind(T, thread);
		SubLObject timer = NIL;
		try {
		    final SubLObject _prev_bind_0_$1 = $with_timeout_nesting_depth$.currentBinding(thread);
		    try {
			$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
			timer = with_timeout_start_timer(max_time, tag);
			final SubLObject _prev_bind_0_$2 = sdc.$ignoring_sdcP$.currentBinding(thread);
			try {
			    sdc.$ignoring_sdcP$.bind(T, thread);
			    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
			    final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
			    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
			    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
			    try {
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, EIGHT_INTEGER), thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
				final SubLObject local_state;
				final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
				try {
				    memoization_state.$memoization_state$.bind(local_state, thread);
				    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				    try {
					thread.resetMultipleValues();
					final SubLObject plausibility_factor_$5 = implausible_sentenceP_recursive(sentence, mt, justifyP, v_properties, depth);
					final SubLObject justification_$6 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					plausibility_factor = plausibility_factor_$5;
					justification = justification_$6;
					if (((NIL == plausibility_factor) && (NIL == get_implausibility_property($kw19$SUPPRESS_PLAUSIBLE_NART_, v_properties, UNPROVIDED))) && (!percent_cutoff.numLE($plausibility_factor_splitting_hairs_cutoff$.getDynamicValue(thread)))) {
					    final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					    final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
					    try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
						mt_relevance_macros.$mt$.bind(mt, thread);
						thread.resetMultipleValues();
						final SubLObject plausibility_factor_$6 = plausible_narts.plausibility_of_sentence(sentence, justifyP, mt);
						final SubLObject justification_$7 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						plausibility_factor = plausibility_factor_$6;
						justification = justification_$7;
					    } finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1_$8, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$5, thread);
					    }
					    if (plausibility_factor.isNumber() && plausibility_factor.numLE($plausibility_factor_splitting_hairs_cutoff$.getDynamicValue(thread))) {
						plausibility_factor = add($float$0_01, $plausibility_factor_splitting_hairs_cutoff$.getDynamicValue(thread));
					    }
					}
				    } finally {
					final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
					    $is_thread_performing_cleanupP$.bind(T, thread);
					    final SubLObject _values = getValuesAsVector();
					    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					    restoreValuesFromVector(_values);
					} finally {
					    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
					}
				    }
				} finally {
				    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
				}
			    } finally {
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$3, thread);
			    }
			} finally {
			    sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$2, thread);
			}
		    } finally {
			$with_timeout_nesting_depth$.rebind(_prev_bind_0_$1, thread);
		    }
		} finally {
		    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values2 = getValuesAsVector();
			with_timeout_stop_timer(timer);
			restoreValuesFromVector(_values2);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
		    }
		}
	    } finally {
		$within_with_timeout$.rebind(_prev_bind_0, thread);
	    }
	} catch (final Throwable ccatch_env_var) {
	    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
	} finally {
	    thread.throwStack.pop();
	}
	if (NIL == plausibility_factor) {
	    plausibility_factor = $plausibility_factor_completely_plausible$.getDynamicValue(thread);
	}
	actual_time = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(numeric_date_utilities.elapsed_internal_real_time(start_time, get_internal_real_time()));
	if ((NIL != get_implausibility_property($kw21$GATHER_STATS_, v_properties, UNPROVIDED)) && $implausibility_stats_table$.getDynamicValue(thread).isHashtable()) {
	    if ((NIL != timed_outP) || ((max_time.isNumber() && actual_time.isNumber()) && actual_time.numG(max_time))) {
		hash_table_utilities.cinc_hash($kw22$TIMED_OUT_, $implausibility_stats_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
	    } else if (plausibility_factor.numL(percent_cutoff)) {
		hash_table_utilities.cinc_hash($kw23$IMPLAUSIBLE_, $implausibility_stats_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
	    } else {
		hash_table_utilities.cinc_hash($kw24$PLAUSIBLE_, $implausibility_stats_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
	    }

	}
	if ((NIL != $debug_implausibilityP$.getDynamicValue(thread)) && (NIL == arguments.hl_justification_p(justification))) {
	    format_nil.print_one_per_line(justification, UNPROVIDED);
	    Errors.sublisp_break($str25$Bad_justification_, EMPTY_SUBL_OBJECT_ARRAY);
	}
	if ((((NIL != get_implausibility_property($kw26$PERCENT_CLIPPING_, v_properties, UNPROVIDED)) && percent_cutoff.isNumber()) && plausibility_factor.isNumber()) && plausibility_factor.numLE(percent_cutoff)) {
	    plausibility_factor = $plausibility_factor_completely_implausible$.getDynamicValue(thread);
	}
	if ((NIL != get_implausibility_property($kw27$RETURN_BOOLEAN_, v_properties, UNPROVIDED)) && plausibility_factor.isNumber()) {
	    plausibility_factor = numL(plausibility_factor, percent_cutoff);
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_nautP(final SubLObject naut, SubLObject mt, SubLObject v_properties, SubLObject depth) {
	if (mt == UNPROVIDED) {
	    mt = $default_plausibility_check_mt$.getDynamicValue();
	}
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	return implausible_sentenceP(naut, mt, v_properties, depth);
    }

    public static SubLObject get_implausibility_property(final SubLObject property, final SubLObject v_properties, SubLObject v_default) {
	if (v_default == UNPROVIDED) {
	    v_default = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = v_default;
	if (T == v_properties) {
	    return property == $JUSTIFY_ ? T : v_default;
	}
	if (NIL != list_utilities.property_list_p(v_properties)) {
	    result = getf(v_properties, property, result);
	}
	if (NIL != list_utilities.property_list_p($implausibility_override_properties$.getDynamicValue(thread))) {
	    result = getf($implausibility_override_properties$.getDynamicValue(thread), property, result);
	}
	return result;
    }

    public static SubLObject implausible_sentenceP_recursive(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != cycl_grammar.cycl_nat_p(sentence)) {
	    return implausible_nautP_recursive(sentence, mt, justifyP, v_properties, depth);
	}
	if (NIL == possibly_sentence_p(sentence)) {
	    return values(NIL, NIL);
	}
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (NIL == plausibility_factor) {
	    thread.resetMultipleValues();
	    final SubLObject plausibility_factor_$13 = implausible_sentence_wrt_wff(sentence, mt, justifyP, $EAGER, v_properties);
	    final SubLObject justification_$14 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    plausibility_factor = plausibility_factor_$13;
	    justification = justification_$14;
	}
	if (NIL == plausibility_factor) {
	    final SubLObject depth_increment = (((NIL != el_formula_with_operator_p(sentence, $$equalSymbols)) || (NIL != el_formula_with_operator_p(sentence, $$equals))) || (NIL != el_conjunction_p(sentence))) ? ZERO_INTEGER : ONE_INTEGER;
	    if (NIL == plausibility_factor) {
		SubLObject csome_list_var = sentence;
		SubLObject arg = NIL;
		arg = csome_list_var.first();
		while ((NIL == plausibility_factor) && (NIL != csome_list_var)) {
		    thread.resetMultipleValues();
		    final SubLObject plausibility_factor_$14 = implausible_sentenceP_recursive(arg, mt, justifyP, v_properties, add(depth, depth_increment));
		    final SubLObject justification_$15 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    plausibility_factor = plausibility_factor_$14;
		    justification = justification_$15;
		    csome_list_var = csome_list_var.rest();
		    arg = csome_list_var.first();
		}
	    }
	}
	if (((NIL != get_implausibility_property($kw31$FORCE_GENLS_TRUTH_CHECK_, v_properties, UNPROVIDED)) && (NIL == plausibility_factor)) && (NIL != el_formula_with_operator_p(sentence, $$genls))) {
	    SubLObject v_genls = NIL;
	    SubLObject col1 = NIL;
	    SubLObject col2 = NIL;
	    destructuring_bind_must_consp(sentence, sentence, $list33);
	    v_genls = sentence.first();
	    SubLObject current = sentence.rest();
	    destructuring_bind_must_consp(current, sentence, $list33);
	    col1 = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, sentence, $list33);
	    col2 = current.first();
	    current = current.rest();
	    if (NIL == current) {
		thread.resetMultipleValues();
		final SubLObject plausibility_factor_$15 = implausible_genlsP(col1, col2, mt, justifyP, depth);
		final SubLObject justification_$16 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		plausibility_factor = plausibility_factor_$15;
		justification = justification_$16;
	    } else {
		cdestructuring_bind_error(sentence, $list33);
	    }
	}
	if ((NIL == plausibility_factor) && (NIL != el_formula_with_operator_p(sentence, $$isa))) {
	    SubLObject v_isa = NIL;
	    SubLObject inst = NIL;
	    SubLObject col3 = NIL;
	    destructuring_bind_must_consp(sentence, sentence, $list35);
	    v_isa = sentence.first();
	    SubLObject current = sentence.rest();
	    destructuring_bind_must_consp(current, sentence, $list35);
	    inst = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, sentence, $list35);
	    col3 = current.first();
	    current = current.rest();
	    if (NIL == current) {
		thread.resetMultipleValues();
		final SubLObject plausibility_factor_$16 = implausible_isaP(inst, col3, mt, justifyP, depth);
		final SubLObject justification_$17 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		plausibility_factor = plausibility_factor_$16;
		justification = justification_$17;
	    } else {
		cdestructuring_bind_error(sentence, $list35);
	    }
	}
	if (NIL == plausibility_factor) {
	    SubLObject predicate = cycl_utilities.formula_operator(sentence);
	    predicate = possibly_find_nart(predicate);
	    SubLObject argnum = ZERO_INTEGER;
	    SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
	    SubLObject rest;
	    SubLObject arg2;
	    for (rest = NIL, rest = args; (NIL == plausibility_factor) && (NIL != rest); rest = rest.rest()) {
		arg2 = rest.first();
		argnum = add(argnum, ONE_INTEGER);
		if (NIL == implausible_admitted_argumentP(arg2, argnum, predicate, mt)) {
		    plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			justification = append(justification, hl_justify_asent_fast(make_negation(make_ternary_formula($$admittedArgument, arg2, argnum, predicate)), mt));
		    }
		}
	    }
	    argnum = ZERO_INTEGER;
	    args = cycl_utilities.formula_args(sentence, $IGNORE);
	    for (rest = NIL, rest = args; (NIL == plausibility_factor) && (NIL != rest); rest = rest.rest()) {
		arg2 = rest.first();
		argnum = add(argnum, ONE_INTEGER);
		if (NIL == implausible_admitted_argument_to_formulaP(arg2, argnum, predicate, sentence, mt)) {
		    plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			justification = append(justification, hl_justify_asent_fast(make_negation(make_ternary_formula($$admittedArgument, arg2, argnum, predicate)), mt));
		    }
		}
	    }
	}
	final SubLObject _prev_bind_0 = czer_vars.$simplify_contradictionsP$.currentBinding(thread);
	try {
	    czer_vars.$simplify_contradictionsP$.bind(T, thread);
	    final SubLObject simplification = simplifier.fast_simplify_cycl_sentence(sentence, mt, UNPROVIDED);
	    if ($$False.eql(simplification)) {
		plausibility_factor = $plausibility_factor_inter_sentential_contradiction$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    justification = list(arguments.make_hl_support($OPAQUE, make_binary_formula($$wffViolation, sentence, $str41$Sentence_contains_contradictory_c), UNPROVIDED, UNPROVIDED));
		}
	    }
	} finally {
	    czer_vars.$simplify_contradictionsP$.rebind(_prev_bind_0, thread);
	}
	if (NIL == plausibility_factor) {
	    thread.resetMultipleValues();
	    final SubLObject plausibility_factor_$17 = implausible_sentence_wrt_wff(sentence, mt, justifyP, $LAZY, v_properties);
	    final SubLObject justification_$18 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    plausibility_factor = plausibility_factor_$17;
	    justification = justification_$18;
	}
	if (NIL == plausibility_factor) {
	    thread.resetMultipleValues();
	    final SubLObject plausibility_factor_$18 = implausible_sentence_wrt_variable_argumentsP(sentence, mt, justifyP, v_properties);
	    final SubLObject justification_$19 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    plausibility_factor = plausibility_factor_$18;
	    justification = justification_$19;
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_nautP_recursive(final SubLObject v_object, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == narts_high.naut_p(v_object)) {
	    return values(NIL, NIL);
	}
	final SubLObject functor = cycl_utilities.naut_functor(v_object);
	final SubLObject functor_categories = categorize_subcollection_predicate(functor);
	final SubLObject argnum = ($FROM == getf(functor_categories, $RELATION_DIRECTION, UNPROVIDED)) ? ONE_INTEGER : TWO_INTEGER;
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (NIL == plausibility_factor) {
	    thread.resetMultipleValues();
	    final SubLObject plausibility_factor_$25 = implausible_term_wrt_wft(v_object, mt, justifyP, $EAGER, v_properties);
	    final SubLObject justification_$26 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    plausibility_factor = plausibility_factor_$25;
	    justification = justification_$26;
	}
	if (NIL == plausibility_factor) {
	    if (T == getf(functor_categories, $COL_ARG, UNPROVIDED)) {
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.naut_args(v_object, UNPROVIDED);
		SubLObject col_arg = NIL;
		SubLObject pred = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list46);
		col_arg = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list46);
		pred = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list46);
		type = current.first();
		current = current.rest();
		if (NIL == current) {
		    if (getf(functor_categories, $ARG_ORDER, UNPROVIDED) == $TYPE_COL_PRED) {
			final SubLObject arg1 = col_arg;
			final SubLObject arg2 = pred;
			final SubLObject arg3 = type;
			col_arg = arg2;
			type = arg1;
			pred = arg3;
		    }
		    col_arg = possibly_find_nart(col_arg);
		    pred = possibly_find_nart(pred);
		    type = possibly_find_nart(type);
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$26 = implausible_typeP(col_arg, mt, justifyP);
			final SubLObject justification_$27 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$26;
			justification = justification_$27;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$27 = implausible_typeP(type, mt, justifyP);
			final SubLObject justification_$28 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$27;
			justification = justification_$28;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$28 = implausible_col_wrt_arg_isa_constraintP(pred, misc_utilities.other_binary_arg(argnum), col_arg, mt, justifyP);
			final SubLObject justification_$29 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$28;
			justification = justification_$29;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$29 = implausible_col_wrt_arg_isa_constraintP(pred, argnum, type, mt, justifyP);
			final SubLObject justification_$30 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$29;
			justification = justification_$30;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$30 = implausible_col_wrt_arg_sometimes_isa_constraintP(pred, argnum, type, mt, justifyP);
			final SubLObject justification_$31 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$30;
			justification = justification_$31;
		    }
		    if ((NIL == plausibility_factor) && (NIL == plausibility_factor)) {
			SubLObject csome_list_var = possible_naut_genls(col_arg);
			SubLObject col = NIL;
			col = csome_list_var.first();
			while ((NIL == plausibility_factor) && (NIL != csome_list_var)) {
			    if (NIL == plausibility_factor) {
				thread.resetMultipleValues();
				final SubLObject plausibility_factor_$31 = implausible_col_wrt_implied_argn_type_requirements_for_predP(pred, argnum, col, type, mt, justifyP);
				final SubLObject justification_$32 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				plausibility_factor = plausibility_factor_$31;
				justification = justification_$32;
			    }
			    if (NIL == plausibility_factor) {
				thread.resetMultipleValues();
				final SubLObject plausibility_factor_$32 = implausible_col_wrt_implied_argn_type_restrictions_for_predP(pred, argnum, col, type, mt, justifyP);
				final SubLObject justification_$33 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				plausibility_factor = plausibility_factor_$32;
				justification = justification_$33;
			    }
			    csome_list_var = csome_list_var.rest();
			    col = csome_list_var.first();
			}
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$33 = implausible_col_wrt_typical_volumeP(pred, argnum, col_arg, type, mt, justifyP);
			final SubLObject justification_$34 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$33;
			justification = justification_$34;
		    }
		} else {
		    cdestructuring_bind_error(datum, $list46);
		}
	    } else if ((NIL != functor_categories) && (NIL == getf(functor_categories, $COL_ARG, UNPROVIDED))) {
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.naut_args(v_object, UNPROVIDED);
		SubLObject col_arg = NIL;
		SubLObject pred = NIL;
		SubLObject thing = NIL;
		destructuring_bind_must_consp(current, datum, $list49);
		col_arg = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list49);
		pred = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list49);
		thing = current.first();
		current = current.rest();
		if (NIL == current) {
		    col_arg = possibly_find_nart(col_arg);
		    pred = possibly_find_nart(pred);
		    thing = possibly_find_nart(thing);
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$34 = implausible_typeP(col_arg, mt, justifyP);
			final SubLObject justification_$35 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$34;
			justification = justification_$35;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$35 = implausible_col_wrt_arg_isa_constraintP(pred, misc_utilities.other_binary_arg(argnum), col_arg, mt, justifyP);
			final SubLObject justification_$36 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$35;
			justification = justification_$36;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$36 = implausible_thing_wrt_arg_isa_constraintP(pred, argnum, thing, mt, justifyP);
			final SubLObject justification_$37 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$36;
			justification = justification_$37;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$37 = implausible_thing_wrt_arg_sometimes_isa_constraintP(pred, argnum, thing, mt, justifyP);
			final SubLObject justification_$38 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$37;
			justification = justification_$38;
		    }
		    if (NIL == plausibility_factor) {
			final SubLObject cols = possible_naut_genls(col_arg);
			if (NIL == plausibility_factor) {
			    SubLObject csome_list_var2 = cols;
			    SubLObject col2 = NIL;
			    col2 = csome_list_var2.first();
			    while ((NIL == plausibility_factor) && (NIL != csome_list_var2)) {
				if (NIL == plausibility_factor) {
				    thread.resetMultipleValues();
				    final SubLObject plausibility_factor_$38 = implausible_thing_wrt_implied_argn_type_requirements_for_predP(pred, argnum, col2, thing, mt, justifyP);
				    final SubLObject justification_$39 = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    plausibility_factor = plausibility_factor_$38;
				    justification = justification_$39;
				}
				if (NIL == plausibility_factor) {
				    thread.resetMultipleValues();
				    final SubLObject plausibility_factor_$39 = implausible_thing_wrt_implied_argn_type_restrictions_for_predP(pred, argnum, col2, thing, mt, justifyP);
				    final SubLObject justification_$40 = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    plausibility_factor = plausibility_factor_$39;
				    justification = justification_$40;
				}
				csome_list_var2 = csome_list_var2.rest();
				col2 = csome_list_var2.first();
			    }
			}
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$40 = implausible_col_wrt_genls_pred_disjointnessP(pred, argnum, col_arg, thing, mt, justifyP);
			final SubLObject justification_$41 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$40;
			justification = justification_$41;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$41 = implausible_col_wrt_isa_pred_disjointnessP(pred, argnum, col_arg, thing, mt, justifyP);
			final SubLObject justification_$42 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$41;
			justification = justification_$42;
		    }
		} else {
		    cdestructuring_bind_error(datum, $list49);
		}
	    } else if (NIL != kb_utilities.kbeq(functor, $$CollectionIntersection2Fn)) {
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.naut_args(v_object, UNPROVIDED);
		SubLObject col3 = NIL;
		SubLObject col4 = NIL;
		destructuring_bind_must_consp(current, datum, $list51);
		col3 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list51);
		col4 = current.first();
		current = current.rest();
		if (NIL == current) {
		    col3 = possibly_find_nart(col3);
		    col4 = possibly_find_nart(col4);
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$42 = implausible_typeP(col3, mt, justifyP);
			final SubLObject justification_$43 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$42;
			justification = justification_$43;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$43 = implausible_typeP(col4, mt, justifyP);
			final SubLObject justification_$44 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$43;
			justification = justification_$44;
		    }
		    if (NIL == plausibility_factor) {
			thread.resetMultipleValues();
			final SubLObject plausibility_factor_$44 = implausible_intersection_of_two_colsP(col3, col4, mt, justifyP);
			final SubLObject justification_$45 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			plausibility_factor = plausibility_factor_$44;
			justification = justification_$45;
		    }
		} else {
		    cdestructuring_bind_error(datum, $list51);
		}
	    } else if (NIL != kb_utilities.kbeq(functor, $$CollectionUnionFn)) {
		SubLObject cols2 = el_set_items(cycl_utilities.naut_arg1(v_object, UNPROVIDED));
		cols2 = Mapping.mapcar(POSSIBLY_FIND_NART, cols2);
		if (NIL == plausibility_factor) {
		    thread.resetMultipleValues();
		    final SubLObject plausibility_factor_$45 = implausible_union_of_colsP(cols2, mt, justifyP);
		    final SubLObject justification_$46 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    plausibility_factor = plausibility_factor_$45;
		    justification = justification_$46;
		}
	    } else {
		SubLObject functor_$67 = cycl_utilities.formula_operator(v_object);
		functor_$67 = possibly_find_nart(functor_$67);
		SubLObject argnum_$68 = ZERO_INTEGER;
		SubLObject args = cycl_utilities.formula_args(v_object, $IGNORE);
		SubLObject rest;
		SubLObject arg4;
		for (rest = NIL, rest = args; (NIL == plausibility_factor) && (NIL != rest); rest = rest.rest()) {
		    arg4 = rest.first();
		    argnum_$68 = add(argnum_$68, ONE_INTEGER);
		    if (NIL == implausible_admitted_argumentP(arg4, argnum_$68, functor_$67, mt)) {
			plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
			if (NIL != justifyP) {
			    justification = append(justification, hl_justify_asent_fast(make_negation(make_ternary_formula($$admittedArgument, arg4, argnum_$68, functor_$67)), mt));
			}
		    }
		}
		SubLObject argnum_$69 = ZERO_INTEGER;
		args = cycl_utilities.formula_args(v_object, $IGNORE);
		for (rest = NIL, rest = args; (NIL == plausibility_factor) && (NIL != rest); rest = rest.rest()) {
		    arg4 = rest.first();
		    argnum_$69 = add(argnum_$69, ONE_INTEGER);
		    if (NIL == implausible_admitted_argument_to_formulaP(arg4, argnum_$69, functor_$67, v_object, mt)) {
			plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
			if (NIL != justifyP) {
			    justification = append(justification, hl_justify_asent_fast(make_negation(make_ternary_formula($$admittedArgument, arg4, argnum_$69, functor_$67)), mt));
			}
		    }
		}
	    }

	}
	if (NIL == plausibility_factor) {
	    final SubLObject args2 = cycl_utilities.formula_args(v_object, $IGNORE);
	    SubLObject rest2;
	    SubLObject arg5;
	    SubLObject sub_plausibility_factor;
	    SubLObject sub_justification;
	    for (rest2 = NIL, rest2 = args2; (NIL == plausibility_factor) && (NIL != rest2); rest2 = rest2.rest()) {
		arg5 = rest2.first();
		thread.resetMultipleValues();
		sub_plausibility_factor = implausible_sentenceP_recursive(arg5, mt, justifyP, v_properties, add(depth, ONE_INTEGER));
		sub_justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != sub_plausibility_factor) {
		    plausibility_factor = sub_plausibility_factor;
		    justification = append(justification, sub_justification);
		}
	    }
	}
	if (NIL == plausibility_factor) {
	    thread.resetMultipleValues();
	    final SubLObject plausibility_factor_$46 = implausible_term_wrt_wft(v_object, mt, justifyP, $LAZY, v_properties);
	    final SubLObject justification_$47 = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    plausibility_factor = plausibility_factor_$46;
	    justification = justification_$47;
	}
	return values(plausibility_factor, list_utilities.remove_duplicates_sorted(justification, UNPROVIDED));
    }

    public static SubLObject categorize_subcollection_predicate_internal(final SubLObject pred) {
	return pred.eql($const55$SubcollectionOfWithRelationToType) ? $list56
		: pred.eql($const57$SubcollectionOfWithRelationFromTy) ? $list58
			: pred.eql($const59$SubcollectionOfWithoutRelationToT) ? $list60
				: pred.eql($const61$SubcollectionOfWithoutRelationFro) ? $list62
					: pred.eql($const63$SitTypeSpecWithTypeRestrictionOnR) ? $list64
						: pred.eql($$SubcollectionOfWithRelationToFn) ? $list66
							: pred.eql($$SubcollectionOfWithRelationFromFn) ? $list68 : pred.eql($const69$SubcollectionOfWithoutRelationToF) ? $list70 : pred.eql($const71$SubcollectionOfWithoutRelationFro) ? $list72 : pred.eql($$UsingAForFn) ? $list74 : NIL;
    }

    public static SubLObject categorize_subcollection_predicate(final SubLObject pred) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return categorize_subcollection_predicate_internal(pred);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CATEGORIZE_SUBCOLLECTION_PREDICATE, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CATEGORIZE_SUBCOLLECTION_PREDICATE, ONE_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, CATEGORIZE_SUBCOLLECTION_PREDICATE, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(categorize_subcollection_predicate_internal(pred)));
	    memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject possibly_find_nart(final SubLObject v_object) {
	final SubLObject possible_nart = ((NIL != possibly_naut_p(v_object)) && (NIL != isa.isa_in_any_mtP(cycl_utilities.el_formula_operator(v_object), $$ReifiableFunction))) ? narts_high.find_nart(v_object) : NIL;
	return NIL != possible_nart ? possible_nart : v_object;
    }

    public static SubLObject possible_naut_genls(final SubLObject col) {
	return NIL != narts_high.naut_p(col) ? genls.min_cols(genls.naut_genls(col, UNPROVIDED), UNPROVIDED, UNPROVIDED) : list(col);
    }

    public static SubLObject implausible_sentence_wrt_variable_argumentsP(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL == get_implausibility_property($kw76$SUPPRESS_WFF_CHECKS_, v_properties, UNPROVIDED)) && (NIL == get_implausibility_property($kw77$SUPPRESS_WF_CHECKS_, v_properties, UNPROVIDED))) && (NIL == cyclifier.variable_arguments_okP(sentence, mt))) {
	    plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
	    if (NIL != $debug_implausibility_wf_checksP$.getDynamicValue(thread)) {
		format(T, $str78$__implausible_sentence_wrt_variab, sentence);
	    }
	    if (NIL != justifyP) {
		justification = list(arguments.make_hl_support($OPAQUE, make_binary_formula($$wffViolation, sentence, $str79$Variable_types_are_disjoint_), UNPROVIDED, UNPROVIDED));
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_term_wrt_wft(final SubLObject v_term, final SubLObject mt, final SubLObject justifyP, final SubLObject check_type, final SubLObject v_properties) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL == get_implausibility_property($kw80$SUPPRESS_WFT_CHECKS_, v_properties, UNPROVIDED)) && (NIL == get_implausibility_property($kw77$SUPPRESS_WF_CHECKS_, v_properties, UNPROVIDED))) && check_type.eql(get_implausibility_property($WFT_CHECK_TYPE, v_properties, UNPROVIDED))) {
	    final SubLObject _prev_bind_0 = at_vars.$at_check_not_sdcP$.currentBinding(thread);
	    try {
		at_vars.$at_check_not_sdcP$.bind(NIL, thread);
		if (NIL == wff.el_wft_fast_in_mtP(v_term, mt)) {
		    plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
		    if (NIL != $debug_implausibility_wf_checksP$.getDynamicValue(thread)) {
			format(T, $str82$__implausible_term_wrt_wft___S__, v_term);
		    }
		    if (NIL != justifyP) {
			final SubLObject string = wff.explanation_of_why_not_wft(v_term, mt, $list83);
			justification = list(arguments.make_hl_support($OPAQUE, make_binary_formula($$wffViolation, v_term, string), UNPROVIDED, UNPROVIDED));
		    }
		}
	    } finally {
		at_vars.$at_check_not_sdcP$.rebind(_prev_bind_0, thread);
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_sentence_wrt_wff(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject check_type, final SubLObject v_properties) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL == get_implausibility_property($kw76$SUPPRESS_WFF_CHECKS_, v_properties, UNPROVIDED)) && (NIL == get_implausibility_property($kw77$SUPPRESS_WF_CHECKS_, v_properties, UNPROVIDED))) && check_type.eql(get_implausibility_property($WFF_CHECK_TYPE, v_properties, UNPROVIDED))) {
	    final SubLObject _prev_bind_0 = at_vars.$at_check_not_sdcP$.currentBinding(thread);
	    try {
		at_vars.$at_check_not_sdcP$.bind(NIL, thread);
		if (NIL == wff.el_lenient_wff_assertibleP(sentence, mt, UNPROVIDED)) {
		    plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue(thread);
		    if (NIL != $debug_implausibility_wf_checksP$.getDynamicValue(thread)) {
			format(T, $str85$__implausible_sentence_wrt_wff___, sentence);
		    }
		    if (NIL != justifyP) {
			final SubLObject string = wff.explanation_of_why_not_lenient_wff_assert(sentence, mt, $list83);
			justification = list(arguments.make_hl_support($OPAQUE, make_binary_formula($$wffViolation, sentence, string), UNPROVIDED, UNPROVIDED));
		    }
		}
	    } finally {
		at_vars.$at_check_not_sdcP$.rebind(_prev_bind_0, thread);
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_genlsP(SubLObject col1, SubLObject col2, final SubLObject mt, final SubLObject justifyP, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(col1, UNPROVIDED)) && (NIL != closedP(col2, UNPROVIDED))) {
	    col1 = possibly_find_nart(col1);
	    col2 = possibly_find_nart(col2);
	    if (NIL == plausibility_factor) {
		thread.resetMultipleValues();
		final SubLObject plausibility_factor_$72 = implausible_typeP(col1, mt, justifyP);
		final SubLObject justification_$73 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		plausibility_factor = plausibility_factor_$72;
		justification = justification_$73;
	    }
	    if (NIL == plausibility_factor) {
		thread.resetMultipleValues();
		final SubLObject plausibility_factor_$73 = implausible_typeP(col2, mt, justifyP);
		final SubLObject justification_$74 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		plausibility_factor = plausibility_factor_$73;
		justification = justification_$74;
	    }
	    if (NIL == plausibility_factor) {
		final SubLObject col1_order = fort_types_interface.collection_order(col1);
		final SubLObject col2_order = fort_types_interface.collection_order(col2);
		if ((col1_order.isInteger() && col2_order.isInteger()) && (!col1_order.numE(col2_order))) {
		    plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			justification = append(justification, hl_justify_asent_fast(list($$not, list($$genls, col1, col2)), mt));
		    }
		}
	    }
	    if ((NIL == plausibility_factor) && depth.numE(ZERO_INTEGER)) {
		final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
		try {
		    sdc.$ignoring_sdcP$.bind(T, thread);
		    if (NIL != genls.not_genlP(col1, col2, mt, UNPROVIDED)) {
			plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
			if (NIL != justifyP) {
			    justification = append(justification, hl_justify_asent_fast(list($$not, list($$genls, col1, col2)), mt));
			}
		    }
		} finally {
		    sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_isaP(SubLObject inst, SubLObject col, final SubLObject mt, final SubLObject justifyP, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(inst, UNPROVIDED)) && (NIL != closedP(col, UNPROVIDED))) {
	    inst = possibly_find_nart(inst);
	    col = possibly_find_nart(col);
	    if (NIL == plausibility_factor) {
		thread.resetMultipleValues();
		final SubLObject plausibility_factor_$76 = implausible_typeP(col, mt, justifyP);
		final SubLObject justification_$77 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		plausibility_factor = plausibility_factor_$76;
		justification = justification_$77;
	    }
	    if (NIL == plausibility_factor) {
		final SubLObject inst_order = fort_types_interface.collection_order(inst);
		final SubLObject col_order = fort_types_interface.collection_order(col);
		if ((inst_order.isInteger() && col_order.isInteger()) && (!add(inst_order, ONE_INTEGER).numE(col_order))) {
		    plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			justification = append(justification, hl_justify_asent_fast(list($$not, list($$isa, inst, col)), mt));
		    }
		}
	    }
	    if (((NIL == plausibility_factor) && (NIL != indexed_term_p(inst))) && (NIL == plausibility_factor)) {
		SubLObject csome_list_var = possible_naut_genls(col);
		SubLObject genl = NIL;
		genl = csome_list_var.first();
		while ((NIL == plausibility_factor) && (NIL != csome_list_var)) {
		    if (NIL != genls.genlP(inst, genl, mt, UNPROVIDED)) {
			plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
			if (NIL != justifyP) {
			    justification = append(justification, hl_justify_asent_fast(list($$genls, inst, genl), mt));
			}
		    }
		    csome_list_var = csome_list_var.rest();
		    genl = csome_list_var.first();
		}
	    }
	    if (((((NIL == plausibility_factor) && depth.numE(ZERO_INTEGER)) && (NIL != indexed_term_p(col))) && (NIL == isa.isaP(inst, col, mt, UNPROVIDED))) && (NIL != isa.not_isaP(inst, col, mt, UNPROVIDED))) {
		plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    justification = append(justification, hl_justify_asent_fast(list($$not, list($$isa, inst, col)), mt));
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_typeP(final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (NIL != closedP(type, UNPROVIDED)) {
	    if ((NIL == plausibility_factor) && ((NIL != cycl_grammar.cycl_unrepresented_term_p(type)) || (NIL != cycl_grammar.cycl_variable_p(type)))) {
		plausibility_factor = $plausibility_factor_type_violation$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    justification = append(justification, hl_justify_asent_fast(list($$not, listS($$isa, type, $list87)), mt));
		}
	    }
	    if (((NIL == plausibility_factor) && (NIL != forts.fort_p(type))) && (NIL == fort_types_interface.collectionP(type))) {
		plausibility_factor = $plausibility_factor_type_violation$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    justification = append(justification, hl_justify_asent_fast(listS($$quotedIsa, type, $list89), mt));
		    justification = append(justification, hl_justify_asent_fast(list($$not, listS($$isa, type, $list87)), mt));
		}
	    }
	    if (((NIL == plausibility_factor) && (NIL != narts_high.naut_p(type))) && (NIL == isa.nat_isaP(type, $$Collection, UNPROVIDED, UNPROVIDED))) {
		plausibility_factor = $plausibility_factor_type_violation$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    justification = append(justification, hl_justify_asent_fast(listS($$quotedIsa, type, $list91), mt));
		    justification = append(justification, hl_justify_asent_fast(list($$not, listS($$isa, type, $list87)), mt));
		}
	    }
	    return values(plausibility_factor, justification);
	}
	return NIL;
    }

    public static SubLObject implausible_col_wrt_arg_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(type, UNPROVIDED))) {
	    final SubLObject type_isa_constraints = kb_accessors.argn_isa(pred, argnum, mt);
	    if ((NIL != type_isa_constraints) && (NIL != disjoint_with.any_disjoint_with_anyP_memoized(list(type), type_isa_constraints, mt, UNPROVIDED, UNPROVIDED))) {
		plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject cdolist_list_var = type_isa_constraints;
		    SubLObject type_isa_constraint = NIL;
		    type_isa_constraint = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			if (NIL != disjoint_with.disjoint_withP(type, type_isa_constraint, mt, UNPROVIDED)) {
			    justification = append(justification, hl_justify_asent_fast(list($$argIsa, pred, argnum, type_isa_constraint), mt));
			    justification = append(justification, hl_justify_asent_fast(list($$disjointWith, type, type_isa_constraint), mt));
			}
			cdolist_list_var = cdolist_list_var.rest();
			type_isa_constraint = cdolist_list_var.first();
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_col_wrt_arg_sometimes_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(type, UNPROVIDED))) {
	    final SubLObject type_isa_constraints = kb_accessors.argn_sometimes_isa(pred, argnum, mt);
	    final SubLObject anytime_mt = hlmt.replace_time_dimension(mt, $$AnytimePSC, UNPROVIDED);
	    if ((NIL != type_isa_constraints) && (NIL == genls.all_genlP(type, type_isa_constraints, anytime_mt, UNPROVIDED))) {
		plausibility_factor = $plausibility_factor_arg_violation$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject cdolist_list_var = type_isa_constraints;
		    SubLObject type_isa_constraint = NIL;
		    type_isa_constraint = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			if (NIL == genls.genlP(type, type_isa_constraint, mt, UNPROVIDED)) {
			    justification = append(justification, hl_justify_asent_fast(list($$argSometimesIsa, pred, argnum, type_isa_constraint), mt));
			    justification = append(justification, hl_justify_asent_fast(list($$unknownSentence, list($$genls, type, type_isa_constraint)), anytime_mt));
			}
			cdolist_list_var = cdolist_list_var.rest();
			type_isa_constraint = cdolist_list_var.first();
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_thing_wrt_arg_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(thing, UNPROVIDED))) {
	    final SubLObject thing_isa_constraints = kb_accessors.argn_isa(pred, argnum, mt);
	    if ((NIL != thing_isa_constraints) && (NIL != (NIL != cycl_grammar.cycl_unrepresented_term_p(thing) ? makeBoolean(NIL == at_defns.quiet_has_any_typeP(thing, thing_isa_constraints, mt))
		    : disjoint_with.any_disjoint_with_anyP_memoized(isa.isa(thing, mt, UNPROVIDED), thing_isa_constraints, mt, UNPROVIDED, UNPROVIDED)))) {
		plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject doneP = NIL;
		    if (NIL == doneP) {
			SubLObject csome_list_var = thing_isa_constraints;
			SubLObject thing_isa_constraint = NIL;
			thing_isa_constraint = csome_list_var.first();
			while ((NIL == doneP) && (NIL != csome_list_var)) {
			    if (NIL == doneP) {
				SubLObject csome_list_var_$78 = isa.isa(thing, mt, UNPROVIDED);
				SubLObject thing_isa = NIL;
				thing_isa = csome_list_var_$78.first();
				while ((NIL == doneP) && (NIL != csome_list_var_$78)) {
				    if (NIL != disjoint_with.disjoint_withP(thing_isa, thing_isa_constraint, mt, UNPROVIDED)) {
					doneP = T;
					justification = append(justification, hl_justify_asent_fast(list($$argIsa, pred, argnum, thing_isa_constraint), mt));
					justification = append(justification, hl_justify_asent_fast(list($$isa, thing, thing_isa), mt));
					justification = append(justification, hl_justify_asent_fast(list($$disjointWith, thing_isa, thing_isa_constraint), mt));
				    }
				    csome_list_var_$78 = csome_list_var_$78.rest();
				    thing_isa = csome_list_var_$78.first();
				}
			    }
			    csome_list_var = csome_list_var.rest();
			    thing_isa_constraint = csome_list_var.first();
			}
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_thing_wrt_arg_sometimes_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(thing, UNPROVIDED))) {
	    final SubLObject thing_isa_constraints = kb_accessors.argn_sometimes_isa(pred, argnum, mt);
	    final SubLObject anytime_mt = hlmt.replace_time_dimension(mt, $$AnytimePSC, UNPROVIDED);
	    if ((NIL != thing_isa_constraints) && (NIL != (NIL != cycl_grammar.cycl_unrepresented_term_p(thing) ? makeBoolean(NIL == at_defns.quiet_has_any_typeP(thing, thing_isa_constraints, anytime_mt)) : makeBoolean(NIL == isa.all_isaP(thing, thing_isa_constraints, anytime_mt, UNPROVIDED))))) {
		plausibility_factor = $plausibility_factor_arg_violation$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject cdolist_list_var = thing_isa_constraints;
		    SubLObject thing_isa_constraint = NIL;
		    thing_isa_constraint = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			if (NIL == isa.isaP(thing, thing_isa_constraint, anytime_mt, UNPROVIDED)) {
			    justification = append(justification, hl_justify_asent_fast(list($$argSometimesIsa, pred, argnum, thing_isa_constraint), mt));
			    justification = append(justification, hl_justify_asent_fast(list($$unknownSentence, list($$isa, thing, thing_isa_constraint)), anytime_mt));
			}
			cdolist_list_var = cdolist_list_var.rest();
			thing_isa_constraint = cdolist_list_var.first();
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_col_wrt_implied_argn_type_requirements_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(col, UNPROVIDED))) && (NIL != closedP(type, UNPROVIDED))) {
	    thread.resetMultipleValues();
	    final SubLObject type_requirements = implied_argn_type_requirements_for_pred(pred, argnum, col, mt, justifyP);
	    final SubLObject tr_justifications = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL != genls.any_genlP(type, type_requirements, mt, UNPROVIDED)) {
		plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject type_requirement = NIL;
		    SubLObject type_requirement_$79 = NIL;
		    SubLObject tr_justification = NIL;
		    SubLObject tr_justification_$80 = NIL;
		    type_requirement = type_requirements;
		    type_requirement_$79 = type_requirement.first();
		    tr_justification = tr_justifications;
		    tr_justification_$80 = tr_justification.first();
		    while ((NIL != tr_justification) || (NIL != type_requirement)) {
			if (NIL != genls.genlP(type, type_requirement_$79, mt, UNPROVIDED)) {
			    justification = append(justification, tr_justification_$80);
			    justification = append(justification, hl_justify_asent_fast(list($$genls, type, type_requirement_$79), mt));
			}
			type_requirement = type_requirement.rest();
			type_requirement_$79 = type_requirement.first();
			tr_justification = tr_justification.rest();
			tr_justification_$80 = tr_justification.first();
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_thing_wrt_implied_argn_type_requirements_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(col, UNPROVIDED))) && (NIL != closedP(thing, UNPROVIDED))) {
	    thread.resetMultipleValues();
	    final SubLObject type_requirements = implied_argn_type_requirements_for_pred(pred, argnum, col, mt, justifyP);
	    final SubLObject tr_justifications = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL != isa.any_isaP(thing, type_requirements, mt, UNPROVIDED)) {
		plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject type_requirement = NIL;
		    SubLObject type_requirement_$81 = NIL;
		    SubLObject tr_justification = NIL;
		    SubLObject tr_justification_$82 = NIL;
		    type_requirement = type_requirements;
		    type_requirement_$81 = type_requirement.first();
		    tr_justification = tr_justifications;
		    tr_justification_$82 = tr_justification.first();
		    while ((NIL != tr_justification) || (NIL != type_requirement)) {
			if (NIL != isa.isaP(thing, type_requirement_$81, mt, UNPROVIDED)) {
			    justification = append(justification, tr_justification_$82);
			    justification = append(justification, hl_justify_asent_fast(list($$isa, thing, type_requirement_$81), mt));
			}
			type_requirement = type_requirement.rest();
			type_requirement_$81 = type_requirement.first();
			tr_justification = tr_justification.rest();
			tr_justification_$82 = tr_justification.first();
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_col_wrt_implied_argn_type_restrictions_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL == closedP(pred, UNPROVIDED)) || (NIL == closedP(col, UNPROVIDED))) || (NIL == closedP(type, UNPROVIDED))) {
	    return NIL;
	}
	thread.resetMultipleValues();
	final SubLObject type_restrictions = implied_argn_type_restrictions_for_pred(pred, argnum, col, mt, justifyP);
	final SubLObject tr_justifications = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL != genls.any_genlP(type, type_restrictions, mt, UNPROVIDED)) {
	    return NIL;
	}
	if (NIL == type_restrictions) {
	    return NIL;
	}
	if ((NIL == plausibility_factor) && (NIL == genls.any_genlP(type, type_restrictions, mt, UNPROVIDED))) {
	    plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
	    if (NIL != justifyP) {
		SubLObject cdolist_list_var = type_restrictions;
		SubLObject type_restriction = NIL;
		type_restriction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    justification = append(justification, hl_justify_asent_fast(list($$unknownSentence, list($$genls, type, type_restriction)), mt));
		    cdolist_list_var = cdolist_list_var.rest();
		    type_restriction = cdolist_list_var.first();
		}
		cdolist_list_var = tr_justifications;
		SubLObject tr_justification = NIL;
		tr_justification = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    justification = append(justification, tr_justification);
		    cdolist_list_var = cdolist_list_var.rest();
		    tr_justification = cdolist_list_var.first();
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_thing_wrt_implied_argn_type_restrictions_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(col, UNPROVIDED))) && (NIL != closedP(thing, UNPROVIDED))) {
	    thread.resetMultipleValues();
	    final SubLObject type_restrictions = implied_argn_type_restrictions_for_pred(pred, argnum, col, mt, justifyP);
	    final SubLObject tr_justifications = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL != isa.any_isaP(thing, type_restrictions, mt, UNPROVIDED)) {
		return NIL;
	    }
	    if (NIL == type_restrictions) {
		return NIL;
	    }
	    if (NIL == plausibility_factor) {
		thread.resetMultipleValues();
		final SubLObject tweaked_type_restrictions = tweak_implausibility_type_restrictions(type_restrictions, mt);
		final SubLObject tweak_method = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != constraint_filters.any_not_isaP(tweaked_type_restrictions, thing, mt)) {
		    plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			SubLObject doneP = NIL;
			if (NIL == doneP) {
			    SubLObject type_restriction = NIL;
			    SubLObject type_restriction_$83 = NIL;
			    SubLObject tr_justification = NIL;
			    SubLObject tr_justification_$84 = NIL;
			    type_restriction = tweaked_type_restrictions;
			    type_restriction_$83 = type_restriction.first();
			    tr_justification = tr_justifications;
			    tr_justification_$84 = tr_justification.first();
			    while ((NIL == doneP) && ((NIL != tr_justification) || (NIL != type_restriction))) {
				if (NIL != isa.not_isaP(thing, type_restriction_$83, mt, UNPROVIDED)) {
				    doneP = T;
				    justification = append(justification, hl_justify_asent_fast(list($$not, list($$isa, thing, type_restriction_$83)), mt));
				    justification = append(justification, tr_justification_$84);
				    if (tweak_method == $MIN_CEILING_COLS) {
					SubLObject found_genlsP = NIL;
					if (NIL == found_genlsP) {
					    SubLObject csome_list_var = type_restrictions;
					    SubLObject type = NIL;
					    type = csome_list_var.first();
					    while ((NIL == found_genlsP) && (NIL != csome_list_var)) {
						if (NIL != genls.genlsP(type, type_restriction_$83, UNPROVIDED, UNPROVIDED)) {
						    found_genlsP = T;
						    justification = append(justification, hl_justify_asent_fast(list($$genls, type, type_restriction_$83), mt));
						}
						csome_list_var = csome_list_var.rest();
						type = csome_list_var.first();
					    }
					}
				    }
				}
				type_restriction = type_restriction.rest();
				type_restriction_$83 = type_restriction.first();
				tr_justification = tr_justification.rest();
				tr_justification_$84 = tr_justification.first();
			    }
			}
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_col_wrt_genls_pred_disjointnessP(final SubLObject pred, final SubLObject argnum, final SubLObject col_arg, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(col_arg, UNPROVIDED))) && (NIL != closedP(type, UNPROVIDED))) && (NIL != forts.fort_p(pred))) {
	    final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
	    try {
		sdc.$ignoring_sdcP$.bind(NIL, thread);
		if ((NIL != genl_predicates.genl_predP(pred, $$genls, mt, UNPROVIDED)) && (NIL != disjoint_with.disjoint_withP(col_arg, type, UNPROVIDED, UNPROVIDED))) {
		    plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			justification = append(justification, hl_justify_asent_fast(listS($$genlPreds, pred, $list99), mt));
			justification = append(justification, hl_justify_asent_fast(list($$disjointWith, col_arg, type), mt));
		    }
		}
	    } finally {
		sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_col_wrt_isa_pred_disjointnessP(final SubLObject pred, final SubLObject argnum, final SubLObject col_arg, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(col_arg, UNPROVIDED))) && (NIL != closedP(type, UNPROVIDED))) && (NIL != forts.fort_p(pred))) {
	    final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
	    try {
		sdc.$ignoring_sdcP$.bind(NIL, thread);
		if ((argnum.eql(TWO_INTEGER) && (NIL != genl_predicates.genl_predP(pred, $$isa, mt, UNPROVIDED))) && (NIL != disjoint_with.disjoint_withP(col_arg, type, UNPROVIDED, UNPROVIDED))) {
		    plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			justification = append(justification, hl_justify_asent_fast(listS($$genlPreds, pred, $list100), mt));
			justification = append(justification, hl_justify_asent_fast(list($$disjointWith, col_arg, type), mt));
		    }
		}
	    } finally {
		sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_col_wrt_typical_volumeP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((((NIL != closedP(pred, UNPROVIDED)) && (NIL != closedP(col, UNPROVIDED))) && (NIL != closedP(type, UNPROVIDED))) && (NIL != forts.fort_p(pred))) {
	    SubLObject arg_order = NIL;
	    if ((NIL != genl_predicates.any_genl_predP(pred, $typical_volume_applicable_predicates$.getDynamicValue(thread), mt, UNPROVIDED)) || (NIL != genl_predicates.any_genl_inverseP(pred, $typical_volume_applicable_pred_inverses$.getDynamicValue(thread), mt, UNPROVIDED))) {
		arg_order = $PRED;
	    }
	    if ((NIL != genl_predicates.any_genl_predP(pred, $typical_volume_applicable_pred_inverses$.getDynamicValue(thread), mt, UNPROVIDED)) || (NIL != genl_predicates.any_genl_inverseP(pred, $typical_volume_applicable_predicates$.getDynamicValue(thread), mt, UNPROVIDED))) {
		arg_order = $INVERSE;
	    }
	    if (NIL != arg_order) {
		final SubLObject cols = possible_naut_genls(type);
		final SubLObject types = possible_naut_genls(col);
		if (NIL == plausibility_factor) {
		    SubLObject csome_list_var = cols;
		    SubLObject this_col = NIL;
		    this_col = csome_list_var.first();
		    while ((NIL == plausibility_factor) && (NIL != csome_list_var)) {
			if (NIL == plausibility_factor) {
			    SubLObject csome_list_var_$85 = types;
			    SubLObject this_type = NIL;
			    this_type = csome_list_var_$85.first();
			    while ((NIL == plausibility_factor) && (NIL != csome_list_var_$85)) {
				final SubLObject tva_sentence = ((argnum.eql(ONE_INTEGER) && (arg_order == $PRED)) || (argnum.eql(TWO_INTEGER) && (arg_order == $INVERSE))) ? make_binary_formula($$typicallyMoreVoluminousThan, this_type, this_col)
					: (argnum.eql(ONE_INTEGER) && (arg_order == $INVERSE)) || (argnum.eql(TWO_INTEGER) && (arg_order == $PRED)) ? make_binary_formula($$typicallyMoreVoluminousThan, this_col, this_type) : NIL;
				if ((NIL != tva_sentence) && (NIL != tva_check_cached(tva_sentence, mt))) {
				    plausibility_factor = $plausibility_factor_typical_volume_violation$.getDynamicValue(thread);
				    if (NIL != justifyP) {
					justification = removal_modules_tva_lookup.tva_justify(tva_sentence, mt);
				    }
				}
				csome_list_var_$85 = csome_list_var_$85.rest();
				this_type = csome_list_var_$85.first();
			    }
			}
			csome_list_var = csome_list_var.rest();
			this_col = csome_list_var.first();
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_intersection_of_two_colsP(final SubLObject col1, final SubLObject col2, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if ((NIL != closedP(col1, UNPROVIDED)) && (NIL != closedP(col2, UNPROVIDED))) {
	    final SubLObject cols_1 = possible_naut_genls(col1);
	    final SubLObject cols_2 = possible_naut_genls(col2);
	    final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
	    try {
		sdc.$ignoring_sdcP$.bind(NIL, thread);
		if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(cols_1, cols_2, mt, UNPROVIDED, UNPROVIDED)) {
		    plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue(thread);
		    if (NIL != justifyP) {
			final SubLObject doneP = NIL;
			if (NIL == doneP) {
			    SubLObject csome_list_var = cols_1;
			    SubLObject this_col_1 = NIL;
			    this_col_1 = csome_list_var.first();
			    while ((NIL == doneP) && (NIL != csome_list_var)) {
				if (NIL == doneP) {
				    SubLObject csome_list_var_$86 = cols_2;
				    SubLObject this_col_2 = NIL;
				    this_col_2 = csome_list_var_$86.first();
				    while ((NIL == doneP) && (NIL != csome_list_var_$86)) {
					if (NIL != disjoint_with.disjoint_withP(this_col_1, this_col_2, mt, UNPROVIDED)) {
					    if (NIL == equals.equalsP(col1, this_col_1, UNPROVIDED, UNPROVIDED)) {
						justification = append(justification, hl_justify_asent_fast(list($$genls, col1, this_col_1), mt));
					    }
					    if (NIL == equals.equalsP(col2, this_col_2, UNPROVIDED, UNPROVIDED)) {
						justification = append(justification, hl_justify_asent_fast(list($$genls, col2, this_col_2), mt));
					    }
					    justification = append(justification, hl_justify_asent_fast(list($$disjointWith, this_col_1, this_col_2), mt));
					}
					csome_list_var_$86 = csome_list_var_$86.rest();
					this_col_2 = csome_list_var_$86.first();
				    }
				}
				csome_list_var = csome_list_var.rest();
				this_col_1 = csome_list_var.first();
			    }
			}
		    }
		}
	    } finally {
		sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject implausible_union_of_colsP(final SubLObject cols, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject plausibility_factor = NIL;
	SubLObject justification = NIL;
	if (NIL != list_utilities.every_in_list($sym106$CLOSED_, cols, UNPROVIDED)) {
	    SubLObject check_cols = NIL;
	    SubLObject expanded_cols = NIL;
	    SubLObject cdolist_list_var = cols;
	    SubLObject col = NIL;
	    col = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cdolist_list_var_$87 = possible_naut_genls(col);
		SubLObject check_col = NIL;
		check_col = cdolist_list_var_$87.first();
		while (NIL != cdolist_list_var_$87) {
		    if (NIL == list_utilities.member_kbeqP(col, cols)) {
			final SubLObject item_var = check_col;
			if (NIL == member(item_var, expanded_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
			    expanded_cols = cons(item_var, expanded_cols);
			}
		    }
		    final SubLObject item_var = check_col;
		    if (NIL == member(item_var, check_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
			check_cols = cons(item_var, check_cols);
		    }
		    cdolist_list_var_$87 = cdolist_list_var_$87.rest();
		    check_col = cdolist_list_var_$87.first();
		}
		cdolist_list_var = cdolist_list_var.rest();
		col = cdolist_list_var.first();
	    }
	    final SubLObject min_ceiling_cols = genls.min_ceiling_cols(check_cols, NIL, mt, UNPROVIDED);
	    if (NIL != find_if($sym107$ESOTERIC_TERM_, min_ceiling_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		plausibility_factor = $plausibility_factor_esoteric_term$.getDynamicValue(thread);
		if (NIL != justifyP) {
		    SubLObject doneP = NIL;
		    if (NIL == doneP) {
			SubLObject csome_list_var = min_ceiling_cols;
			SubLObject min_ceiling_col = NIL;
			min_ceiling_col = csome_list_var.first();
			while ((NIL == doneP) && (NIL != csome_list_var)) {
			    if (NIL != esoteric_termP(min_ceiling_col)) {
				doneP = T;
				justification = append(justification, hl_justify_asent_fast(listS($$quotedIsa, min_ceiling_col, $list108), mt));
				SubLObject cdolist_list_var2 = cols;
				SubLObject col2 = NIL;
				col2 = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
				    justification = append(justification, hl_justify_asent_fast(list($$genls, col2, min_ceiling_col), mt));
				    cdolist_list_var2 = cdolist_list_var2.rest();
				    col2 = cdolist_list_var2.first();
				}
			    }
			    csome_list_var = csome_list_var.rest();
			    min_ceiling_col = csome_list_var.first();
			}
		    }
		}
	    }
	}
	return values(plausibility_factor, justification);
    }

    public static SubLObject esoteric_termP(final SubLObject v_term) {
	return isa.quoted_isa_in_any_mtP(v_term, $$EsotericTerm);
    }

    public static SubLObject exoteric_termP(final SubLObject v_term) {
	return isa.quoted_isa_in_any_mtP(v_term, $$ExotericTerm);
    }

    public static SubLObject clear_plausibility_caches() {
	funcall(CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS);
	funcall(CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED);
	funcall(CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED);
	funcall(CLEAR_TVA_CHECK_CACHED);
	funcall($sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_);
	funcall(CLEAR_DO_TVA_QUERY_TYPE_TYPE);
	funcall(CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH);
	return NIL;
    }

    public static SubLObject print_plausibility_cache_sizes() {
	format(T, $str118$__tweak_implausibility_type_restr, NIL != boundp($tweak_implausibility_type_restrictions_caching_state$) ? memoization_state.caching_state_size(symbol_value($tweak_implausibility_type_restrictions_caching_state$), UNPROVIDED) : NIL);
	format(T, $str120$__implied_argn_type_requirements_, NIL != boundp($implied_argn_type_requirements_for_pred_caching_state$) ? memoization_state.caching_state_size(symbol_value($implied_argn_type_requirements_for_pred_caching_state$), UNPROVIDED) : NIL);
	format(T, $str122$__implied_argn_type_restrictions_, NIL != boundp($implied_argn_type_restrictions_for_pred_caching_state$) ? memoization_state.caching_state_size(symbol_value($implied_argn_type_restrictions_for_pred_caching_state$), UNPROVIDED) : NIL);
	format(T, $str124$__tva_check_cached___A__, NIL != boundp($tva_check_cached_caching_state$) ? memoization_state.caching_state_size(symbol_value($tva_check_cached_caching_state$), UNPROVIDED) : NIL);
	format(T, $str126$__implausible_admitted_argument__, NIL != boundp($sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_) ? memoization_state.caching_state_size(symbol_value($sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_), UNPROVIDED) : NIL);
	format(T, $str128$__do_tva_query_type_type___A__, NIL != boundp($do_tva_query_type_type_caching_state$) ? memoization_state.caching_state_size(symbol_value($do_tva_query_type_type_caching_state$), UNPROVIDED) : NIL);
	format(T, $str130$__do_tva_query_type_disjoint_with, NIL != boundp($do_tva_query_type_disjoint_with_caching_state$) ? memoization_state.caching_state_size(symbol_value($do_tva_query_type_disjoint_with_caching_state$), UNPROVIDED) : NIL);
	return NIL;
    }

    public static SubLObject clear_tweak_implausibility_type_restrictions() {
	final SubLObject cs = $tweak_implausibility_type_restrictions_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static SubLObject remove_tweak_implausibility_type_restrictions(final SubLObject type_restrictions, final SubLObject mt) {
	return memoization_state.caching_state_remove_function_results_with_args($tweak_implausibility_type_restrictions_caching_state$.getGlobalValue(), list(type_restrictions, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tweak_implausibility_type_restrictions_internal(final SubLObject type_restrictions, final SubLObject mt) {
	if (NIL != disjoint_with.any_disjoint_with_anyP_memoized(type_restrictions, type_restrictions, mt, UNPROVIDED, UNPROVIDED)) {
	    return values(genls.min_ceiling_cols(type_restrictions, NIL, mt, UNPROVIDED), $MIN_CEILING_COLS);
	}
	return values(type_restrictions, NIL);
    }

    public static SubLObject tweak_implausibility_type_restrictions(final SubLObject type_restrictions, final SubLObject mt) {
	SubLObject caching_state = $tweak_implausibility_type_restrictions_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS, $tweak_implausibility_type_restrictions_caching_state$, $int$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER);
	    memoization_state.register_hl_store_cache_clear_callback(CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(type_restrictions, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (type_restrictions.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(tweak_implausibility_type_restrictions_internal(type_restrictions, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(type_restrictions, mt));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_implied_argn_type_requirements_for_pred() {
	final SubLObject cs = $implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static SubLObject remove_implied_argn_type_requirements_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
	return memoization_state.caching_state_remove_function_results_with_args($implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue(), list(pred, argnum, col, mt, justifyP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject implied_argn_type_requirements_for_pred_internal(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
	final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
	return argnum.eql(TWO_INTEGER) ? tva_unify_with_variable_lookup_and_values(list($$relationNotExistsExists, pred, col, var0), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED)
		: argnum.eql(ONE_INTEGER) ? tva_unify_with_variable_lookup_and_values(list($$relationNotExistsExists, pred, var0, col), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject implied_argn_type_requirements_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
	SubLObject caching_state = $implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED, $implied_argn_type_requirements_for_pred_caching_state$, $int$4096, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
	    memoization_state.register_hl_store_cache_clear_callback(CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, argnum, col, mt, justifyP);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (pred.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (argnum.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (col.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (mt.equal(cached_args.first())) {
				cached_args = cached_args.rest();
				if (((NIL != cached_args) && (NIL == cached_args.rest())) && justifyP.equal(cached_args.first())) {
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
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(implied_argn_type_requirements_for_pred_internal(pred, argnum, col, mt, justifyP)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, argnum, col, mt, justifyP));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_implied_argn_type_restrictions_for_pred() {
	final SubLObject cs = $implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static SubLObject remove_implied_argn_type_restrictions_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
	return memoization_state.caching_state_remove_function_results_with_args($implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue(), list(pred, argnum, col, mt, justifyP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject implied_argn_type_restrictions_for_pred_internal(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	SubLObject justifications = NIL;
	final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
	thread.resetMultipleValues();
	SubLObject this_result = (argnum.eql(TWO_INTEGER)) ? tva_unify_with_variable_lookup_and_values(list($$relationAllExists, pred, col, var0), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
	SubLObject this_justifications = thread.secondMultipleValue();
	thread.resetMultipleValues();
	result = append(result, this_result);
	justifications = append(justifications, this_justifications);
	thread.resetMultipleValues();
	this_result = (argnum.eql(TWO_INTEGER)) ? tva_unify_with_variable_lookup_and_values(list($$someTypePlaysRoleInSituationType, col, var0, pred), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
	this_justifications = thread.secondMultipleValue();
	thread.resetMultipleValues();
	result = append(result, this_result);
	justifications = append(justifications, this_justifications);
	SubLObject min_result = genls.min_cols(copy_list(result), mt, UNPROVIDED);
	SubLObject unique_result = NIL;
	SubLObject unique_justifications = NIL;
	SubLObject cdolist_list_var = $list139;
	SubLObject too_general_col = NIL;
	too_general_col = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == list_utilities.singletonP(min_result)) {
		min_result = set_difference(min_result, genls.all_genls_among(too_general_col, result, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    too_general_col = cdolist_list_var.first();
	}
	SubLObject this_result2 = NIL;
	SubLObject this_result_$88 = NIL;
	SubLObject this_justification = NIL;
	SubLObject this_justification_$89 = NIL;
	this_result2 = result;
	this_result_$88 = this_result2.first();
	this_justification = justifications;
	this_justification_$89 = this_justification.first();
	while ((NIL != this_justification) || (NIL != this_result2)) {
	    if ((NIL != list_utilities.member_kbeqP(this_result_$88, min_result)) && (NIL == list_utilities.member_kbeqP(this_result_$88, unique_result))) {
		unique_result = cons(this_result_$88, unique_result);
		unique_justifications = cons(this_justification_$89, unique_justifications);
	    }
	    this_result2 = this_result2.rest();
	    this_result_$88 = this_result2.first();
	    this_justification = this_justification.rest();
	    this_justification_$89 = this_justification.first();
	}
	result = nreverse(unique_result);
	justifications = nreverse(unique_justifications);
	return values(result, justifications);
    }

    public static SubLObject implied_argn_type_restrictions_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
	SubLObject caching_state = $implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED, $implied_argn_type_restrictions_for_pred_caching_state$, $int$4096, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
	    memoization_state.register_hl_store_cache_clear_callback(CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, argnum, col, mt, justifyP);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (pred.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (argnum.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (col.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (mt.equal(cached_args.first())) {
				cached_args = cached_args.rest();
				if (((NIL != cached_args) && (NIL == cached_args.rest())) && justifyP.equal(cached_args.first())) {
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
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(implied_argn_type_restrictions_for_pred_internal(pred, argnum, col, mt, justifyP)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, argnum, col, mt, justifyP));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject tva_unify_with_variable_lookup_and_values(final SubLObject asent, final SubLObject var, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p, SubLObject closure_mode, SubLObject checking_spec_preds_for_cache_resultsP,
	    SubLObject prove_negationP) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	if (return_one_answer_p == UNPROVIDED) {
	    return_one_answer_p = NIL;
	}
	if (compute_justifications_p == UNPROVIDED) {
	    compute_justifications_p = NIL;
	}
	if (closure_mode == UNPROVIDED) {
	    closure_mode = $NONE;
	}
	if (checking_spec_preds_for_cache_resultsP == UNPROVIDED) {
	    checking_spec_preds_for_cache_resultsP = T;
	}
	if (prove_negationP == UNPROVIDED) {
	    prove_negationP = NIL;
	}
	final SubLObject bindings_justifications = tva_inference.tva_unify(asent, mt, return_one_answer_p, compute_justifications_p, closure_mode, checking_spec_preds_for_cache_resultsP, prove_negationP);
	SubLObject result = NIL;
	SubLObject justifications = NIL;
	SubLObject cdolist_list_var = bindings_justifications;
	SubLObject bindings_justification = NIL;
	bindings_justification = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject current;
	    final SubLObject datum = current = bindings_justification;
	    SubLObject v_bindings = NIL;
	    SubLObject justification = NIL;
	    destructuring_bind_must_consp(current, datum, $list141);
	    v_bindings = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list141);
	    justification = current.first();
	    current = current.rest();
	    if (NIL == current) {
		result = cons(bindings.variable_lookup(var, v_bindings), result);
		justifications = cons(justification, justifications);
	    } else {
		cdestructuring_bind_error(datum, $list141);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    bindings_justification = cdolist_list_var.first();
	}
	return values(result, justifications);
    }

    public static SubLObject clear_tva_check_cached() {
	final SubLObject cs = $tva_check_cached_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static SubLObject remove_tva_check_cached(final SubLObject sentence, final SubLObject mt) {
	return memoization_state.caching_state_remove_function_results_with_args($tva_check_cached_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tva_check_cached_internal(final SubLObject sentence, final SubLObject mt) {
	return removal_modules_tva_lookup.tva_check(sentence, mt, UNPROVIDED);
    }

    public static SubLObject tva_check_cached(final SubLObject sentence, final SubLObject mt) {
	SubLObject caching_state = $tva_check_cached_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(TVA_CHECK_CACHED, $tva_check_cached_caching_state$, $int$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER);
	    memoization_state.register_hl_store_cache_clear_callback(CLEAR_TVA_CHECK_CACHED);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (sentence.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(tva_check_cached_internal(sentence, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_implausible_admitted_argumentP() {
	final SubLObject cs = $implausible_admitted_argumentP_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static SubLObject remove_implausible_admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	return memoization_state.caching_state_remove_function_results_with_args($implausible_admitted_argumentP_caching_state$.getGlobalValue(), list(v_term, argnum, relation, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject implausible_admitted_argumentP_internal(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
	if ((NIL == closedP(relation, UNPROVIDED)) || (NIL == closedP(v_term, UNPROVIDED))) {
	    return T;
	}
	SubLObject admittedP = NIL;
	final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
	final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding(thread);
	final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding(thread);
	final SubLObject _prev_bind_8 = at_vars.$at_argnum$.currentBinding(thread);
	final SubLObject _prev_bind_9 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
	final SubLObject _prev_bind_10 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
	final SubLObject _prev_bind_11 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
	final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
	final SubLObject _prev_bind_13 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_14 = at_vars.$at_check_arg_not_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_15 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_16 = at_vars.$at_check_not_isa_disjointP$.currentBinding(thread);
	final SubLObject _prev_bind_17 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding(thread);
	final SubLObject _prev_bind_18 = at_vars.$at_check_not_genls_disjointP$.currentBinding(thread);
	final SubLObject _prev_bind_19 = at_vars.$at_check_inter_arg_differentP$.currentBinding(thread);
	final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_21 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
	final SubLObject _prev_bind_22 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding(thread);
	final SubLObject _prev_bind_23 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding(thread);
	final SubLObject _prev_bind_24 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_25 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
	final SubLObject _prev_bind_26 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
	final SubLObject _prev_bind_27 = at_vars.$at_some_arg_isa_requiredP$.currentBinding(thread);
	final SubLObject _prev_bind_28 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
	final SubLObject _prev_bind_29 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_30 = czer_vars.$within_negationP$.currentBinding(thread);
	final SubLObject _prev_bind_31 = at_vars.$within_functionP$.currentBinding(thread);
	final SubLObject _prev_bind_32 = at_vars.$within_predicateP$.currentBinding(thread);
	final SubLObject _prev_bind_33 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
	try {
	    at_vars.$noting_at_violationsP$.bind(NIL, thread);
	    at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
	    wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
	    wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
	    wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
	    at_vars.$at_reln$.bind(relation, thread);
	    at_vars.$at_arg$.bind(v_term, thread);
	    at_vars.$at_argnum$.bind(argnum, thread);
	    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
	    at_vars.$at_check_defining_mtsP$.bind(NIL, thread);
	    at_vars.$at_check_arg_genlsP$.bind(T, thread);
	    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
	    at_vars.$at_check_arg_isaP$.bind(T, thread);
	    at_vars.$at_check_arg_not_isaP$.bind(NIL, thread);
	    at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
	    at_vars.$at_check_not_isa_disjointP$.bind(T, thread);
	    at_vars.$at_check_not_quoted_isa_disjointP$.bind(NIL, thread);
	    at_vars.$at_check_not_genls_disjointP$.bind(T, thread);
	    at_vars.$at_check_inter_arg_differentP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_genlP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_not_genlP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_isa_genlP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_genl_isaP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_formatP$.bind(NIL, thread);
	    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
	    at_vars.$at_some_arg_isa_requiredP$.bind(NIL, thread);
	    at_vars.$gather_at_constraintsP$.bind(NIL, thread);
	    czer_vars.$accumulating_semantic_violationsP$.bind(NIL, thread);
	    czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
	    at_vars.$within_functionP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
	    at_vars.$within_predicateP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
	    czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
	    admittedP = implausible_admitted_argument_intP(v_term, argnum, relation, mt);
	} finally {
	    czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_33, thread);
	    at_vars.$within_predicateP$.rebind(_prev_bind_32, thread);
	    at_vars.$within_functionP$.rebind(_prev_bind_31, thread);
	    czer_vars.$within_negationP$.rebind(_prev_bind_30, thread);
	    czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_29, thread);
	    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_28, thread);
	    at_vars.$at_some_arg_isa_requiredP$.rebind(_prev_bind_27, thread);
	    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_26, thread);
	    at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_25, thread);
	    at_vars.$at_check_inter_arg_genl_isaP$.rebind(_prev_bind_24, thread);
	    at_vars.$at_check_inter_arg_isa_genlP$.rebind(_prev_bind_23, thread);
	    at_vars.$at_check_inter_arg_not_genlP$.rebind(_prev_bind_22, thread);
	    at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_21, thread);
	    at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_20, thread);
	    at_vars.$at_check_inter_arg_differentP$.rebind(_prev_bind_19, thread);
	    at_vars.$at_check_not_genls_disjointP$.rebind(_prev_bind_18, thread);
	    at_vars.$at_check_not_quoted_isa_disjointP$.rebind(_prev_bind_17, thread);
	    at_vars.$at_check_not_isa_disjointP$.rebind(_prev_bind_16, thread);
	    at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_15, thread);
	    at_vars.$at_check_arg_not_isaP$.rebind(_prev_bind_14, thread);
	    at_vars.$at_check_arg_isaP$.rebind(_prev_bind_13, thread);
	    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
	    at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_11, thread);
	    at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_10, thread);
	    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_9, thread);
	    at_vars.$at_argnum$.rebind(_prev_bind_8, thread);
	    at_vars.$at_arg$.rebind(_prev_bind_7, thread);
	    at_vars.$at_reln$.rebind(_prev_bind_6, thread);
	    wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
	    wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
	    wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
	    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
	    at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
	}
	return admittedP;
    }

    public static SubLObject implausible_admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	SubLObject caching_state = $implausible_admitted_argumentP_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name($sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_, $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_, $int$8192, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
	    memoization_state.register_hl_store_cache_clear_callback($sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, argnum, relation, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (v_term.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (argnum.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (relation.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
				return memoization_state.caching_results(results2);
			    }
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(implausible_admitted_argumentP_internal(v_term, argnum, relation, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, argnum, relation, mt));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject implausible_admitted_argument_intP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_arity = (NIL != wff_utilities.$check_arityP$.getDynamicValue(thread)) ? arity.max_arity(relation) : NIL;
	return makeBoolean(
		(((NIL != kb_accessors.relationP(relation)) && ((!v_arity.isNumber()) || v_arity.numGE(argnum))) && (argnum.numG(ZERO_INTEGER) || (argnum.numE(ZERO_INTEGER) && (NIL != kb_utilities.kbeq(v_term, relation))))) && (NIL != arg_type.relation_arg_okP(relation, v_term, argnum, mt)));
    }

    public static SubLObject implausible_admitted_argument_to_formulaP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject formula, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
	if ((NIL == closedP(relation, UNPROVIDED)) || (NIL == closedP(v_term, UNPROVIDED))) {
	    return T;
	}
	SubLObject admittedP = NIL;
	final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
	final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding(thread);
	final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding(thread);
	final SubLObject _prev_bind_8 = at_vars.$at_formula$.currentBinding(thread);
	final SubLObject _prev_bind_9 = at_vars.$at_argnum$.currentBinding(thread);
	final SubLObject _prev_bind_10 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
	final SubLObject _prev_bind_11 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
	final SubLObject _prev_bind_12 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
	final SubLObject _prev_bind_13 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
	final SubLObject _prev_bind_14 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_15 = at_vars.$at_check_arg_not_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_16 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_17 = at_vars.$at_check_not_isa_disjointP$.currentBinding(thread);
	final SubLObject _prev_bind_18 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding(thread);
	final SubLObject _prev_bind_19 = at_vars.$at_check_not_genls_disjointP$.currentBinding(thread);
	final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_differentP$.currentBinding(thread);
	final SubLObject _prev_bind_21 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_22 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
	final SubLObject _prev_bind_23 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding(thread);
	final SubLObject _prev_bind_24 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding(thread);
	final SubLObject _prev_bind_25 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding(thread);
	final SubLObject _prev_bind_26 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
	final SubLObject _prev_bind_27 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
	final SubLObject _prev_bind_28 = at_vars.$at_some_arg_isa_requiredP$.currentBinding(thread);
	final SubLObject _prev_bind_29 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
	final SubLObject _prev_bind_30 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
	final SubLObject _prev_bind_31 = czer_vars.$within_negationP$.currentBinding(thread);
	final SubLObject _prev_bind_32 = at_vars.$within_functionP$.currentBinding(thread);
	final SubLObject _prev_bind_33 = at_vars.$within_predicateP$.currentBinding(thread);
	final SubLObject _prev_bind_34 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
	try {
	    at_vars.$noting_at_violationsP$.bind(NIL, thread);
	    at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
	    wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
	    wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
	    wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
	    at_vars.$at_reln$.bind(relation, thread);
	    at_vars.$at_arg$.bind(v_term, thread);
	    at_vars.$at_formula$.bind(formula, thread);
	    at_vars.$at_argnum$.bind(argnum, thread);
	    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
	    at_vars.$at_check_defining_mtsP$.bind(NIL, thread);
	    at_vars.$at_check_arg_genlsP$.bind(T, thread);
	    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
	    at_vars.$at_check_arg_isaP$.bind(NIL, thread);
	    at_vars.$at_check_arg_not_isaP$.bind(NIL, thread);
	    at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
	    at_vars.$at_check_not_isa_disjointP$.bind(NIL, thread);
	    at_vars.$at_check_not_quoted_isa_disjointP$.bind(NIL, thread);
	    at_vars.$at_check_not_genls_disjointP$.bind(T, thread);
	    at_vars.$at_check_inter_arg_differentP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_genlP$.bind(T, thread);
	    at_vars.$at_check_inter_arg_not_genlP$.bind(T, thread);
	    at_vars.$at_check_inter_arg_isa_genlP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_genl_isaP$.bind(NIL, thread);
	    at_vars.$at_check_inter_arg_formatP$.bind(NIL, thread);
	    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
	    at_vars.$at_some_arg_isa_requiredP$.bind(NIL, thread);
	    at_vars.$gather_at_constraintsP$.bind(NIL, thread);
	    czer_vars.$accumulating_semantic_violationsP$.bind(NIL, thread);
	    czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
	    at_vars.$within_functionP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
	    at_vars.$within_predicateP$.bind(makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) && (NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)))), thread);
	    czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
	    admittedP = implausible_admitted_argument_intP(v_term, argnum, relation, mt);
	} finally {
	    czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_34, thread);
	    at_vars.$within_predicateP$.rebind(_prev_bind_33, thread);
	    at_vars.$within_functionP$.rebind(_prev_bind_32, thread);
	    czer_vars.$within_negationP$.rebind(_prev_bind_31, thread);
	    czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_30, thread);
	    at_vars.$gather_at_constraintsP$.rebind(_prev_bind_29, thread);
	    at_vars.$at_some_arg_isa_requiredP$.rebind(_prev_bind_28, thread);
	    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_27, thread);
	    at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_26, thread);
	    at_vars.$at_check_inter_arg_genl_isaP$.rebind(_prev_bind_25, thread);
	    at_vars.$at_check_inter_arg_isa_genlP$.rebind(_prev_bind_24, thread);
	    at_vars.$at_check_inter_arg_not_genlP$.rebind(_prev_bind_23, thread);
	    at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_22, thread);
	    at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_21, thread);
	    at_vars.$at_check_inter_arg_differentP$.rebind(_prev_bind_20, thread);
	    at_vars.$at_check_not_genls_disjointP$.rebind(_prev_bind_19, thread);
	    at_vars.$at_check_not_quoted_isa_disjointP$.rebind(_prev_bind_18, thread);
	    at_vars.$at_check_not_isa_disjointP$.rebind(_prev_bind_17, thread);
	    at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_16, thread);
	    at_vars.$at_check_arg_not_isaP$.rebind(_prev_bind_15, thread);
	    at_vars.$at_check_arg_isaP$.rebind(_prev_bind_14, thread);
	    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_13, thread);
	    at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_12, thread);
	    at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_11, thread);
	    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_10, thread);
	    at_vars.$at_argnum$.rebind(_prev_bind_9, thread);
	    at_vars.$at_formula$.rebind(_prev_bind_8, thread);
	    at_vars.$at_arg$.rebind(_prev_bind_7, thread);
	    at_vars.$at_reln$.rebind(_prev_bind_6, thread);
	    wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
	    wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
	    wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
	    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
	    at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
	}
	return admittedP;
    }

    public static SubLObject hl_justify_asent_fast(final SubLObject sentence, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
	try {
	    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
	    result = hl_justify_asent(sentence, mt);
	} finally {
	    czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
	}
	return result;
    }

    public static SubLObject hl_justify_asent(final SubLObject sentence, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != within_queryP()) {
	    Errors.error($str146$hl_justify_asent_not_legal_to_cal);
	}
	SubLObject query_properties = $list147;
	SubLObject result = NIL;
	thread.resetMultipleValues();
	final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
	final SubLObject right_mt = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL != el_implication_p(right_sentence)) {
	    query_properties = putf(query_properties, $kw148$CONDITIONAL_SENTENCE_, T);
	}
	result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
	result = result.first();
	if (NIL == result) {
	    if (NIL != $debug_implausibilityP$.getDynamicValue(thread)) {
		Errors.warn($str149$Could_not_find_hl_support_for__S_, sentence, mt);
	    }
	    result = list(arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED));
	}
	return result;
    }

    public static SubLObject declare_plausibility_utilities_file() {
	declareFunction("sentence_plausibility_factor", "SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false);
	declareFunction("why_sentence_plausibility_factor", "WHY-SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false);
	declareFunction("sentence_plausibility_score", "SENTENCE-PLAUSIBILITY-SCORE", 1, 2, false);
	declareFunction("why_sentence_plausibility_score", "WHY-SENTENCE-PLAUSIBILITY-SCORE", 1, 2, false);
	declareFunction("implausible_sentenceP", "IMPLAUSIBLE-SENTENCE?", 1, 3, false);
	declareFunction("implausible_nautP", "IMPLAUSIBLE-NAUT?", 1, 3, false);
	declareFunction("get_implausibility_property", "GET-IMPLAUSIBILITY-PROPERTY", 2, 1, false);
	declareFunction("implausible_sentenceP_recursive", "IMPLAUSIBLE-SENTENCE?-RECURSIVE", 5, 0, false);
	declareFunction("implausible_nautP_recursive", "IMPLAUSIBLE-NAUT?-RECURSIVE", 5, 0, false);
	declareFunction("categorize_subcollection_predicate_internal", "CATEGORIZE-SUBCOLLECTION-PREDICATE-INTERNAL", 1, 0, false);
	declareFunction("categorize_subcollection_predicate", "CATEGORIZE-SUBCOLLECTION-PREDICATE", 1, 0, false);
	declareFunction("possibly_find_nart", "POSSIBLY-FIND-NART", 1, 0, false);
	declareFunction("possible_naut_genls", "POSSIBLE-NAUT-GENLS", 1, 0, false);
	declareFunction("implausible_sentence_wrt_variable_argumentsP", "IMPLAUSIBLE-SENTENCE-WRT-VARIABLE-ARGUMENTS?", 4, 0, false);
	declareFunction("implausible_term_wrt_wft", "IMPLAUSIBLE-TERM-WRT-WFT", 5, 0, false);
	declareFunction("implausible_sentence_wrt_wff", "IMPLAUSIBLE-SENTENCE-WRT-WFF", 5, 0, false);
	declareFunction("implausible_genlsP", "IMPLAUSIBLE-GENLS?", 5, 0, false);
	declareFunction("implausible_isaP", "IMPLAUSIBLE-ISA?", 5, 0, false);
	declareFunction("implausible_typeP", "IMPLAUSIBLE-TYPE?", 3, 0, false);
	declareFunction("implausible_col_wrt_arg_isa_constraintP", "IMPLAUSIBLE-COL-WRT-ARG-ISA-CONSTRAINT?", 5, 0, false);
	declareFunction("implausible_col_wrt_arg_sometimes_isa_constraintP", "IMPLAUSIBLE-COL-WRT-ARG-SOMETIMES-ISA-CONSTRAINT?", 5, 0, false);
	declareFunction("implausible_thing_wrt_arg_isa_constraintP", "IMPLAUSIBLE-THING-WRT-ARG-ISA-CONSTRAINT?", 5, 0, false);
	declareFunction("implausible_thing_wrt_arg_sometimes_isa_constraintP", "IMPLAUSIBLE-THING-WRT-ARG-SOMETIMES-ISA-CONSTRAINT?", 5, 0, false);
	declareFunction("implausible_col_wrt_implied_argn_type_requirements_for_predP", "IMPLAUSIBLE-COL-WRT-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED?", 6, 0, false);
	declareFunction("implausible_thing_wrt_implied_argn_type_requirements_for_predP", "IMPLAUSIBLE-THING-WRT-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED?", 6, 0, false);
	declareFunction("implausible_col_wrt_implied_argn_type_restrictions_for_predP", "IMPLAUSIBLE-COL-WRT-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED?", 6, 0, false);
	declareFunction("implausible_thing_wrt_implied_argn_type_restrictions_for_predP", "IMPLAUSIBLE-THING-WRT-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED?", 6, 0, false);
	declareFunction("implausible_col_wrt_genls_pred_disjointnessP", "IMPLAUSIBLE-COL-WRT-GENLS-PRED-DISJOINTNESS?", 6, 0, false);
	declareFunction("implausible_col_wrt_isa_pred_disjointnessP", "IMPLAUSIBLE-COL-WRT-ISA-PRED-DISJOINTNESS?", 6, 0, false);
	declareFunction("implausible_col_wrt_typical_volumeP", "IMPLAUSIBLE-COL-WRT-TYPICAL-VOLUME?", 6, 0, false);
	declareFunction("implausible_intersection_of_two_colsP", "IMPLAUSIBLE-INTERSECTION-OF-TWO-COLS?", 4, 0, false);
	declareFunction("implausible_union_of_colsP", "IMPLAUSIBLE-UNION-OF-COLS?", 3, 0, false);
	declareFunction("esoteric_termP", "ESOTERIC-TERM?", 1, 0, false);
	declareFunction("exoteric_termP", "EXOTERIC-TERM?", 1, 0, false);
	declareFunction("clear_plausibility_caches", "CLEAR-PLAUSIBILITY-CACHES", 0, 0, false);
	declareFunction("print_plausibility_cache_sizes", "PRINT-PLAUSIBILITY-CACHE-SIZES", 0, 0, false);
	declareFunction("clear_tweak_implausibility_type_restrictions", "CLEAR-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 0, 0, false);
	declareFunction("remove_tweak_implausibility_type_restrictions", "REMOVE-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 2, 0, false);
	declareFunction("tweak_implausibility_type_restrictions_internal", "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-INTERNAL", 2, 0, false);
	declareFunction("tweak_implausibility_type_restrictions", "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 2, 0, false);
	declareFunction("clear_implied_argn_type_requirements_for_pred", "CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 0, 0, false);
	declareFunction("remove_implied_argn_type_requirements_for_pred", "REMOVE-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 5, 0, false);
	declareFunction("implied_argn_type_requirements_for_pred_internal", "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-INTERNAL", 5, 0, false);
	declareFunction("implied_argn_type_requirements_for_pred", "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 5, 0, false);
	declareFunction("clear_implied_argn_type_restrictions_for_pred", "CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 0, 0, false);
	declareFunction("remove_implied_argn_type_restrictions_for_pred", "REMOVE-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 5, 0, false);
	declareFunction("implied_argn_type_restrictions_for_pred_internal", "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-INTERNAL", 5, 0, false);
	declareFunction("implied_argn_type_restrictions_for_pred", "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 5, 0, false);
	declareFunction("tva_unify_with_variable_lookup_and_values", "TVA-UNIFY-WITH-VARIABLE-LOOKUP-AND-VALUES", 2, 6, false);
	declareFunction("clear_tva_check_cached", "CLEAR-TVA-CHECK-CACHED", 0, 0, false);
	declareFunction("remove_tva_check_cached", "REMOVE-TVA-CHECK-CACHED", 2, 0, false);
	declareFunction("tva_check_cached_internal", "TVA-CHECK-CACHED-INTERNAL", 2, 0, false);
	declareFunction("tva_check_cached", "TVA-CHECK-CACHED", 2, 0, false);
	declareFunction("clear_implausible_admitted_argumentP", "CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?", 0, 0, false);
	declareFunction("remove_implausible_admitted_argumentP", "REMOVE-IMPLAUSIBLE-ADMITTED-ARGUMENT?", 3, 1, false);
	declareFunction("implausible_admitted_argumentP_internal", "IMPLAUSIBLE-ADMITTED-ARGUMENT?-INTERNAL", 4, 0, false);
	declareFunction("implausible_admitted_argumentP", "IMPLAUSIBLE-ADMITTED-ARGUMENT?", 3, 1, false);
	declareFunction("implausible_admitted_argument_intP", "IMPLAUSIBLE-ADMITTED-ARGUMENT-INT?", 4, 0, false);
	declareFunction("implausible_admitted_argument_to_formulaP", "IMPLAUSIBLE-ADMITTED-ARGUMENT-TO-FORMULA?", 4, 1, false);
	declareFunction("hl_justify_asent_fast", "HL-JUSTIFY-ASENT-FAST", 2, 0, false);
	declareFunction("hl_justify_asent", "HL-JUSTIFY-ASENT", 2, 0, false);
	return NIL;
    }

    public static SubLObject init_plausibility_utilities_file() {
	defparameter("*DEFAULT-PLAUSIBILITY-CHECK-MT*", $$PlausibilityQueryMt);
	deflexical("*IMPLAUSIBILITY-PROPERTIES*", $list1);
	defparameter("*DEBUG-IMPLAUSIBILITY?*", NIL);
	defparameter("*DEBUG-IMPLAUSIBILITY-WF-CHECKS?*", NIL);
	defparameter("*IMPLAUSIBILITY-OVERRIDE-PROPERTIES*", NIL);
	defparameter("*IMPLAUSIBILITY-STATS-TABLE*", NIL);
	defparameter("*DEFAULT-PLAUSIBILITY-PERCENT-CUTOFF*", $float$0_5);
	defparameter("*PLAUSIBILITY-FACTOR-COMPLETELY-IMPLAUSIBLE*", ZERO_INTEGER);
	defparameter("*PLAUSIBILITY-FACTOR-NON-WFF*", $float$0_01);
	defparameter("*PLAUSIBILITY-FACTOR-TYPE-VIOLATION*", $float$0_02);
	defparameter("*PLAUSIBILITY-FACTOR-ARG-VIOLATION*", $float$0_03);
	defparameter("*PLAUSIBILITY-FACTOR-ARG-DISJOINTNESS*", $float$0_04);
	defparameter("*PLAUSIBILITY-FACTOR-NOT-ISA-OR-GENLS*", $float$0_05);
	defparameter("*PLAUSIBILITY-FACTOR-INTER-SENTENTIAL-CONTRADICTION*", $float$0_055);
	defparameter("*PLAUSIBILITY-FACTOR-IMPLIED-ARG-RESTRICTION*", $float$0_06);
	defparameter("*PLAUSIBILITY-FACTOR-NO-TYPE-RESTRICTION*", $float$0_07);
	defparameter("*PLAUSIBILITY-FACTOR-TYPICAL-VOLUME-VIOLATION*", $float$0_08);
	defparameter("*PLAUSIBILITY-FACTOR-ESOTERIC-TERM*", $float$0_09);
	defparameter("*PLAUSIBILITY-FACTOR-SPLITTING-HAIRS-CUTOFF*", $float$0_1);
	defparameter("*PLAUSIBILITY-FACTOR-COMPLETELY-PLAUSIBLE*", ONE_INTEGER);
	defparameter("*DEFAULT-SENTENCE-PLAUSIBILITY-SCORE-PROPERTIES*", NIL);
	defparameter("*TYPICAL-VOLUME-APPLICABLE-PREDICATES*", $list101);
	defparameter("*TYPICAL-VOLUME-APPLICABLE-PRED-INVERSES*", $list102);
	deflexical("*TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-CACHING-STATE*", NIL);
	deflexical("*IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-CACHING-STATE*", NIL);
	deflexical("*IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-CACHING-STATE*", NIL);
	deflexical("*TVA-CHECK-CACHED-CACHING-STATE*", NIL);
	deflexical("*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*", NIL);
	return NIL;
    }

    public static SubLObject setup_plausibility_utilities_file() {
	memoization_state.note_memoized_function(CATEGORIZE_SUBCOLLECTION_PREDICATE);
	memoization_state.note_globally_cached_function(TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS);
	memoization_state.note_globally_cached_function(IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED);
	memoization_state.note_globally_cached_function(IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED);
	memoization_state.note_globally_cached_function(TVA_CHECK_CACHED);
	memoization_state.note_globally_cached_function($sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_plausibility_utilities_file();
    }

    @Override
    public void initializeVariables() {
	init_plausibility_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_plausibility_utilities_file();
    }

    static {

    }
}

/**
 * Total time: 1045 ms
 */
