package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_assertion_mt extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_assertion_mt();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt";

    public static final String myFingerPrint = "fd3dcbdf4cd97e08f6d9d3ed09ca256013fc5f87b41ba6479e9ccd00254fed9e";



    // defparameter
    private static final SubLSymbol $default_assertion_mt_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*");



    // defparameter
    private static final SubLSymbol $default_assertion_sentence_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_assertion_sentence_lookup_cost$ = makeSymbol("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*");



    // defparameter
    private static final SubLSymbol $default_assertion_id_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*");

    // deflexical
    // The CycL terms for the HL assertion directions.
    private static final SubLSymbol $cycl_directions$ = makeSymbol("*CYCL-DIRECTIONS*");



    // defparameter
    private static final SubLSymbol $default_assertion_direction_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*");

    // deflexical
    // The CycL terms for the HL justification strengths.
    private static final SubLSymbol $cycl_strengths$ = makeSymbol("*CYCL-STRENGTHS*");



    // defparameter
    private static final SubLSymbol $default_assertion_strength_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*");

    // deflexical
    // The CycL terms for the HL justification truths.
    private static final SubLSymbol $cycl_truths$ = makeSymbol("*CYCL-TRUTHS*");



    // defparameter
    private static final SubLSymbol $default_assertion_truth_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*");



    // defparameter
    private static final SubLSymbol $default_assertion_just_att_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*");



    // defparameter
    private static final SubLSymbol $default_assertion_assert_by_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*");



    // defparameter
    private static final SubLSymbol $default_assertion_assert_time_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*");

    // deflexical
    // The earliest recorded asserted-when for an assertion in Cyc.
    private static final SubLSymbol $earliest_known_asserted_when$ = makeSymbol("*EARLIEST-KNOWN-ASSERTED-WHEN*");



    // defparameter
    private static final SubLSymbol $default_assertion_assert_purpose_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*");



    // defparameter
    private static final SubLSymbol $default_assertion_assert_date_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*");

    // deflexical
    private static final SubLSymbol $removal_assertion_asserted_by_between_dates_date_comparison_predicates$ = makeSymbol("*REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-PREDICATES*");

    // Internal Constants
    public static final SubLSymbol ASSERTION_EL_IST_FORMULA = makeSymbol("ASSERTION-EL-IST-FORMULA");

    private static final SubLObject $$assertionMt = reader_make_constant_shell(makeString("assertionMt"));





    public static final SubLSymbol $assertion_mt_defining_mt$ = makeSymbol("*ASSERTION-MT-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));





    private static final SubLSymbol $REMOVAL_ASSERTION_MT_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-MT-CHECK-POS");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("ASSERTION"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionMt")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("MT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("MT")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-MT?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <assertion> <hlmt-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$LogicalTruthMt)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_MT_PRUNE_POS = makeKeyword("REMOVAL-ASSERTION-MT-PRUNE-POS");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("assertionMt")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("ASSERTION"))), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("CLOSED-HLMT"))))), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });

    private static final SubLSymbol $REMOVAL_ASSERTION_MT_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-MT-CHECK-NEG");

    public static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("ASSERTION"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-MT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionMt")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("MT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("MT")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-MT?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("MT"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionMt <assertion> <hlmt-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not \n      (#$assertionMt \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        #$BookkeepingMt))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_MT_UNIFY = makeKeyword("REMOVAL-ASSERTION-MT-UNIFY");

    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionMt")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-MT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionMt")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <assertion> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_MT_LOOKUP = makeKeyword("REMOVAL-ASSERTION-MT-LOOKUP");

    private static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("VARIABLE"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTION-MT-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("MT"))), list(makeKeyword("VALUE"), makeSymbol("MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GATHER-MT-INDEX"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionMt")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("MT"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-MT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionMt <variable> <hlmt-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionMt ?ASSERTION #$LogicalTruthMt)") });

    private static final SubLObject $$assertionSentence = reader_make_constant_shell(makeString("assertionSentence"));

    public static final SubLSymbol $assertion_sentence_defining_mt$ = makeSymbol("*ASSERTION-SENTENCE-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_FORMULA_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-POS");

    public static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionSentence")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("SENTENCE")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-SENTENCE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence \n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      (#$isa #$Thing #$Collection))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_FORMULA_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-FORMULA-CHECK-NEG");

    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionSentence")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("SENTENCE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-SENTENCE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionSentence <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$assertionSentence \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        (#$genls #$Collection #$Thing)))") });

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym26$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $REMOVAL_ASSERTION_FORMULA_UNIFY = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNIFY");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionSentence")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-FI-FORMULA-ROBUST"), makeKeyword("INPUT"), T)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?WHAT)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_FORMULA_LOOKUP = makeKeyword("REMOVAL-ASSERTION-FORMULA-LOOKUP");

    private static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("SENTENCE"))), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), makeKeyword("INPUT"), reader_make_constant_shell(makeString("EverythingPSC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SENTENCE"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-SENTENCE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (#$isa #$Thing #$Collection))") });



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));









    private static final SubLSymbol $REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-PRED-LOOKUP");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("VARIABLE"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> (<predicate> ...)) \n    using only GAF indexing of assertions indexed by <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (#$interArgIsa1-3 ?PRED ?COL1 ?COL2))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP = makeKeyword("REMOVAL-ASSERTION-FORMULA-UNBOUND-ASSERTION-ARG-LOOKUP");

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionSentence")), makeKeyword("VARIABLE"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionSentence <variable> (<not fully-bound> ... <fort> ...)) \n     using only KB GAF indexing of assertions indexed by <fort>."), makeKeyword("EXAMPLE"), makeString("(#$assertionSentence ?ASSERTION (?PRED ?ARG1 ?ARG2 #$ShowerHead))") });

    private static final SubLObject $$assertionID = reader_make_constant_shell(makeString("assertionID"));

    public static final SubLSymbol $assertion_id_defining_mt$ = makeSymbol("*ASSERTION-ID-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_ID_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ID-CHECK-POS");

    public static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionID")), makeKeyword("ASSERTION"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionID")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ID"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ID")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-ID?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <assertion> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      163059)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ID_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ID-CHECK-NEG");

    public static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionID")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ID-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionID")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ID"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ID")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-ID?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ID"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionID <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$assertionID \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n        123456))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ID_UNIFY = makeKeyword("REMOVAL-ASSERTION-ID-UNIFY");

    public static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionID")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionID")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionID")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <assertion> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ID)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ID_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ID-LOOKUP");

    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionID")), makeKeyword("VARIABLE"), makeKeyword("INTEGER")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ID"))), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-ASSERTION-BY-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-ID-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionID <not-fully-bound> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionID ?ASSERTION 123456)") });

    private static final SubLObject $$assertionDirection = reader_make_constant_shell(makeString("assertionDirection"));

    private static final SubLList $list52 = list(reader_make_constant_shell(makeString("Forward-AssertionDirection")), reader_make_constant_shell(makeString("Backward-AssertionDirection")), reader_make_constant_shell(makeString("Code-AssertionDirection")));



    private static final SubLObject $$Forward_AssertionDirection = reader_make_constant_shell(makeString("Forward-AssertionDirection"));



    private static final SubLObject $$Backward_AssertionDirection = reader_make_constant_shell(makeString("Backward-AssertionDirection"));



    private static final SubLObject $$Code_AssertionDirection = reader_make_constant_shell(makeString("Code-AssertionDirection"));

    private static final SubLString $str59$_S_was_not_a_direction_p = makeString("~S was not a direction-p");

    private static final SubLString $str60$_S_was_not_a_cycl_direction_p = makeString("~S was not a cycl-direction-p");

    public static final SubLSymbol $assertion_direction_defining_mt$ = makeSymbol("*ASSERTION-DIRECTION-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_DIRECTION_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-POS");

    public static final SubLList $list63 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-DIRECTION-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionDirection")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DIRECTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DIRECTION")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-DIRECTION-TO-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DIRECTION")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DIRECTION")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDirection <assertion> <constant>)\n    where <constant> is a CycL direction"), makeKeyword("EXAMPLE"), makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Forward-AssertionDirection)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_DIRECTION_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-DIRECTION-CHECK-NEG");

    public static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-DIRECTION-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionDirection")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DIRECTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DIRECTION")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-DIRECTION-TO-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DIRECTION"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DIRECTION")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-DIRECTION"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DIRECTION"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionDirection <assertion> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Backward-AssertionDirection))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_DIRECTION_UNIFY = makeKeyword("REMOVAL-ASSERTION-DIRECTION-UNIFY");

    private static final SubLList $list67 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionDirection")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionDirection")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-DIRECTION"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("DIRECTION-TO-CYCL-DIRECTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionDirection")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-DIRECTION-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDirection <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDirection \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?DIRECTION)") });

    private static final SubLObject $$assertionStrength = reader_make_constant_shell(makeString("assertionStrength"));

    private static final SubLList $list69 = list(reader_make_constant_shell(makeString("Default-JustificationStrength")), reader_make_constant_shell(makeString("Monotonic-JustificationStrength")));



    private static final SubLObject $$Default_JustificationStrength = reader_make_constant_shell(makeString("Default-JustificationStrength"));



    private static final SubLObject $$Monotonic_JustificationStrength = reader_make_constant_shell(makeString("Monotonic-JustificationStrength"));

    private static final SubLString $str74$_S_was_not_a_el_strength_p = makeString("~S was not a el-strength-p");

    private static final SubLString $str75$_S_was_not_a_cycl_strength_p = makeString("~S was not a cycl-strength-p");





    public static final SubLSymbol $assertion_strength_defining_mt$ = makeSymbol("*ASSERTION-STRENGTH-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_STRENGTH_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-POS");

    public static final SubLList $list80 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionStrength")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-STRENGTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionStrength")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-STRENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-STRENGTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-STRENGTH-TO-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("STRENGTH")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("STRENGTH")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionStrength <assertion> <constant>)\n    where <constant> is a CycL justification strength"), makeKeyword("EXAMPLE"), makeString("(#$assertionStrength\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Monotonic-JustificationStrength)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_STRENGTH_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-STRENGTH-CHECK-NEG");

    public static final SubLList $list82 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionStrength")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-STRENGTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionStrength")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-STRENGTH"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-STRENGTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-STRENGTH-TO-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STRENGTH"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("STRENGTH")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-STRENGTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("STRENGTH"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionStrength <assertion> <constant>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Default-JustificationStrength))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_STRENGTH_UNIFY = makeKeyword("REMOVAL-ASSERTION-STRENGTH-UNIFY");

    private static final SubLList $list84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionStrength")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionStrength")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionStrength")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-STRENGTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRENGTH-TO-CYCL-STRENGTH"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionStrength")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-STRENGTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionStength <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionStrength \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?STRENGTH)") });

    private static final SubLObject $$assertionTruth = reader_make_constant_shell(makeString("assertionTruth"));

    private static final SubLList $list86 = list(reader_make_constant_shell(makeString("True-JustificationTruth")), reader_make_constant_shell(makeString("False-JustificationTruth")), reader_make_constant_shell(makeString("Unknown-JustificationTruth")));



    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));



    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell(makeString("False-JustificationTruth"));



    private static final SubLObject $$Unknown_JustificationTruth = reader_make_constant_shell(makeString("Unknown-JustificationTruth"));

    private static final SubLString $str93$_S_was_not_a_truth_p = makeString("~S was not a truth-p");

    private static final SubLString $str94$_S_was_not_a_cycl_truth_p = makeString("~S was not a cycl-truth-p");

    public static final SubLSymbol $assertion_truth_defining_mt$ = makeSymbol("*ASSERTION-TRUTH-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_TRUTH_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-POS");

    public static final SubLList $list97 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionTruth")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-TRUTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionTruth")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-TRUTH"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-TRUTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-TRUTH-TO-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("TRUTH")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("TRUTH")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionTruth <assertion> <constant>)\n    where <constant> is a CycL justification truth"), makeKeyword("EXAMPLE"), makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$True-JustificationTruth)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_TRUTH_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-TRUTH-CHECK-NEG");

    private static final SubLList $list99 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionTruth")), makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("CONSTANT"), list(makeKeyword("TEST"), makeSymbol("CYCL-TRUTH-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionTruth")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-TRUTH"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-TRUTH")), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("CALL"), makeSymbol("CYCL-TRUTH-TO-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("CYCL-TRUTH"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("TRUTH")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HAS-TRUTH"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("TRUTH"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionTruth <assertion> <constant>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionTruth \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$False-JustificationTruth))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_TRUTH_UNIFY = makeKeyword("REMOVAL-ASSERTION-TRUTH-UNIFY");

    private static final SubLList $list101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionTruth")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionTruth")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionTruth")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-TRUTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("TRUTH-TO-CYCL-TRUTH"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionTruth")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-TRUTH-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionTruth <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionTruth\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?TRUTH)") });

    private static final SubLObject $$assertionJustificationAttribute = reader_make_constant_shell(makeString("assertionJustificationAttribute"));



    private static final SubLObject $$AssertedBelief = reader_make_constant_shell(makeString("AssertedBelief"));

    private static final SubLObject $$SupportedByMaterialImplication = reader_make_constant_shell(makeString("SupportedByMaterialImplication"));

    public static final SubLSymbol $assertion_just_att_defining_mt$ = makeSymbol("*ASSERTION-JUST-ATT-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_JUST_ATT_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-POS");

    public static final SubLList $list108 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), makeKeyword("ASSERTION"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ATT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ATT")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-ASSERTION-JUST-ATT"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionJustificationAttribute <assertion> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n      #$AssertedBelief)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-CHECK-NEG");

    private static final SubLList $list110 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), makeKeyword("ASSERTION"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ATT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ATT")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-ASSERTION-JUST-ATT"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ATT"))))), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionJustificationAttribute <assertion> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$assertionJustificationAttribute \n        (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection))\n        #$SupportedByMaterialImplication))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_JUST_ATT_UNIFY = makeKeyword("REMOVAL-ASSERTION-JUST-ATT-UNIFY");

    private static final SubLList $list112 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionJustificationAttribute")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), makeKeyword("ASSERTION"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-ALL-ASSERTION-JUST-ATT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionJustificationAttribute")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-ASSERTION-JUST-ATT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionJustificationAttribute <assertion> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionJustificationAttribute\n      (#$ist #$LogicalTruthMt (#$isa #$Thing #$Collection)) \n      ?ATT)") });

    private static final SubLObject $$assertionAssertBy = reader_make_constant_shell(makeString("assertionAssertBy"));

    public static final SubLSymbol $assertion_assert_by_defining_mt$ = makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*");

    private static final SubLString $str115$Computing_assertions_asserted_by_ = makeString("Computing assertions asserted by ~S");







    private static final SubLSymbol $sym119$ASSERTION_ASSERTED_BY_ = makeSymbol("ASSERTION-ASSERTED-BY?");



    private static final SubLString $str121$_S_was_not_one_of__latency_or__to = makeString("~S was not one of :latency or :total-time");

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-POS");

    public static final SubLList $list123 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertBy")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCLIST")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-BY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Pace)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-CHECK-NEG");

    private static final SubLList $list125 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertBy")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCLIST")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-BY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCLIST"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertBy <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$Lenat))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-UNIFY");

    private static final SubLList $list127 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertBy")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTED-BY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHO)") });

    private static final SubLObject $$HumanCyclist = reader_make_constant_shell(makeString("HumanCyclist"));

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP");

    private static final SubLList $list130 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("CYCLIST")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCLIST"))), list(makeKeyword("VALUE"), makeSymbol("CYCLIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCLIST"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-BY-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertBy <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertBy ?ASSERTION #$Lenat)") });

    private static final SubLSymbol $DISPREFER_ASSERTION_ASSERT_BY_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-BY-LOOKUP");

    private static final SubLList $list132 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLObject $$assertionAssertTime = reader_make_constant_shell(makeString("assertionAssertTime"));

    public static final SubLSymbol $assertion_assert_time_defining_mt$ = makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*");



    private static final SubLString $str136$Computing_assertions_asserted_on_ = makeString("Computing assertions asserted on ~A");

    private static final SubLSymbol $sym137$ASSERTION_ASSERTED_WHEN_ = makeSymbol("ASSERTION-ASSERTED-WHEN?");

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-POS");

    public static final SubLList $list139 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertTime")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("INTEGER"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("UNIVERSAL-DATE")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHEN?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <assertion> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      20020411)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-CHECK-NEG");

    private static final SubLList $list141 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertTime")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("AND"), makeKeyword("INTEGER"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("UNIVERSAL-DATE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHEN?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertTime <assertion> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      19950524))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-UNIFY");

    private static final SubLList $list143 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertTime")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTED-WHEN"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)") });

    private static final SubLInteger $int$19950522 = makeInteger(19950522);

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP");

    private static final SubLList $list146 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("UNIVERSAL-DATE"))), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE"))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("AND"), makeKeyword("INTEGER"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("UNIVERSAL-DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-TIME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertTime <variable> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertTime ?ASSERTION 19950524)") });

    private static final SubLSymbol $DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-TIME-LOOKUP");

    private static final SubLList $list148 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertTime")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLObject $$assertionAssertPurpose = reader_make_constant_shell(makeString("assertionAssertPurpose"));

    public static final SubLSymbol $assertion_assert_purpose_defining_mt$ = makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*");

    private static final SubLString $str151$Computing_assertions_asserted_for = makeString("Computing assertions asserted for ~S");

    private static final SubLSymbol $sym152$ASSERTION_ASSERTED_WHY_ = makeSymbol("ASSERTION-ASSERTED-WHY?");

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-POS");

    public static final SubLList $list154 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("REASON"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("REASON")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <assertion> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$GeneralCycKE)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-CHECK-NEG");

    private static final SubLList $list156 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("REASON"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), makeKeyword("ANYTHING")), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("REASON")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-WHY?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("REASON"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertPurpose <assertion> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      #$HPKBProject))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-UNIFY");

    private static final SubLList $list158 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTED-WHY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose \n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?WHY)") });

    private static final SubLObject $$Cyc_BasedProject = reader_make_constant_shell(makeString("Cyc-BasedProject"));

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP");

    private static final SubLList $list161 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("REASON"))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("REASON")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("REASON"))), list(makeKeyword("VALUE"), makeSymbol("REASON"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("REASON"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertPurpose <variable> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertPurpose ?ASSERTION #$HPKBProject)\n    (#$thereExists ?ASSERTION\n      (#$assertionAssertPurpose ?ASSERTION #$GeneralCycKE))") });

    private static final SubLSymbol $DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-PURPOSE-LOOKUP");

    public static final SubLList $list163 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertPurpose")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLObject $$assertionAssertDate = reader_make_constant_shell(makeString("assertionAssertDate"));

    public static final SubLSymbol $assertion_assert_date_defining_mt$ = makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-POS");

    public static final SubLList $list167 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertDate")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("TEST"), makeSymbol("GENERALIZED-DATE-P"))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DATE")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-DATE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <assertion> <cycl-date>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 11 (#$MonthFn #$April (#$YearFn 2002))))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-CHECK-NEG");

    public static final SubLList $list169 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertDate")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("ASSERTION"), list(makeKeyword("TEST"), makeSymbol("GENERALIZED-DATE-P"))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("CYCL-DATE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ASSERTED-DATE?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionAssertDate <assertion> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995)))))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_UNIFY = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-UNIFY");

    public static final SubLList $list171 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertDate")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ASSERTION"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-DATE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      ?WHEN)\n    (#$assertionAssertDate \n      (#$ist #$LogicalTruthMt (#$disjointWith #$Collection #$Individual))\n      (#$DayFn ?DATE ?MONTH))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP = makeKeyword("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP");

    public static final SubLList $list173 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE")))), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-DATE"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE"))), makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("TEST"), makeSymbol("GENERALIZED-DATE-P")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NEW-ASSERTION-ASSERTED-DATE-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCL-DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*ASSERTION-ASSERT-DATE-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertionAssertDate <variable> <cycl-date>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionAssertDate ?ASSERTION (#$DayFn 24 (#$MonthFn #$May (#$YearFn 1995))))") });

    private static final SubLSymbol $DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP = makeKeyword("DISPREFER-ASSERTION-ASSERT-DATE-LOOKUP");

    private static final SubLList $list175 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("assertionAssertDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE = makeKeyword("REMOVAL-ASSERTION-ASSERT-BY-AND-TIME-CONJUNCTIVE");

    private static final SubLList $list177 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell(makeString("assertionAssertBy")), reader_make_constant_shell(makeString("assertionAssertTime"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <fully-bound>))\n    or\n    (#$and (#$assertionAssertBy <not-fully-bound 0> <fort-p>)\n           (#$assertionAssertTime <not-fully-bound 0> <not-fully-bound 0>)\n           [(<number comparison pred> <not-fully-bound 0> <fully-bound>)]..."), makeKeyword("EXAMPLE"), makeString("(#$and (#$assertionAssertBy ?ASSERTION #$Guest)\n           (#$assertionAssertTime ?ASSERTION ?TIME)\n           (#$greaterThanOrEqualTo ?TIME 19000101)\n           (#$lessThan ?TIME 20000101)") });

    private static final SubLList $list178 = list(reader_make_constant_shell(makeString("lessThanOrEqualTo")), reader_make_constant_shell(makeString("lessThan")), reader_make_constant_shell(makeString("greaterThanOrEqualTo")), reader_make_constant_shell(makeString("greaterThan")));

    private static final SubLSymbol CONTEXTUALIZED_ASENT_ASENT = makeSymbol("CONTEXTUALIZED-ASENT-ASENT");

    private static final SubLSymbol $sym180$_ = makeSymbol("<");

    private static final SubLSymbol $sym181$ASSERTION_ASSERTED_BY_ASENT_ = makeSymbol("ASSERTION-ASSERTED-BY-ASENT?");

    private static final SubLSymbol $sym182$ASSERTION_ASSERT_TIME_ASENT_ = makeSymbol("ASSERTION-ASSERT-TIME-ASENT?");

    private static final SubLSymbol $sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT = makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?");





    private static final SubLSymbol $ASSERT_TIME_ARG2 = makeKeyword("ASSERT-TIME-ARG2");

    private static final SubLSymbol $TIME_COMPARISON_ASENTS = makeKeyword("TIME-COMPARISON-ASENTS");



    private static final SubLSymbol $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T = makeSymbol("REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM");

    public static SubLObject hl_assertion_support_sentence_to_el(SubLObject support_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind(ASSERTION_EL_IST_FORMULA, thread);
            support_sentence = cycl_utilities.hl_to_el(support_sentence);
        } finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return support_sentence;
    }

    public static SubLObject make_assertion_mt_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_mt_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject removal_assertion_mt_lookup_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject mt = literal_arg2(literal, UNPROVIDED);
        if (NIL != kb_indexing.broad_mtP(mt)) {
            return assertion_handles.assertion_count();
        }
        return kb_indexing.num_mt_index(mt);
    }

    public static SubLObject assertion_sentenceP(final SubLObject assertion, final SubLObject sentence) {
        return equal(sentence, assertions_high.assertion_formula(assertion));
    }

    public static SubLObject make_assertion_sentence_support_from_assertion(final SubLObject assertion, final SubLObject formula, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        SubLObject support_sentence = make_binary_formula($$assertionSentence, assertion, formula);
        if (NIL != negateP) {
            support_sentence = cycl_utilities.negate(support_sentence);
        }
        return make_assertion_sentence_support(support_sentence, UNPROVIDED);
    }

    public static SubLObject make_assertion_sentence_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_sentence_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject assertion_fi_formula_robust(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == UNPROVIDED) {
            substitute_varsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    return fi.assertion_fi_formula(assertion, substitute_varsP);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject removal_assertion_sentence_unbound_assertion_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_formula = literal_arg2(literal, UNPROVIDED);
        SubLObject total = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            total = inference_trampolines.inference_num_gaf_lookup_index(hl_formula, $POS);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject removal_assertion_sentence_expand_internal_1(final SubLObject assertion, final SubLObject assertion_var, final SubLObject hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject assertion_bindings = unification_utilities.term_unify(assertion_var, assertion, T, T);
            final SubLObject assertion_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != assertion_bindings) {
                thread.resetMultipleValues();
                final SubLObject literal_bindings = unification_utilities.gaf_asent_unify(hl_formula, gaf_formula, T, T);
                final SubLObject literal_gaf_asent = thread.secondMultipleValue();
                final SubLObject literal_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != literal_bindings) && (NIL == bindings.some_variable_with_conflicting_bindings(assertion_bindings, literal_bindings))) {
                    backward.removal_add_node(make_assertion_sentence_support_from_assertion(assertion, gaf_formula, NIL), nconc(assertion_bindings, literal_bindings), append(assertion_justification, literal_justification));
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_assertion_sentence_unbound_assertion_cost(literal, UNPROVIDED);
    }

    public static SubLObject removal_assertion_sentence_unbound_assertion_pred_lookup_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_var = literal_arg1(literal, UNPROVIDED);
        final SubLObject hl_formula = literal_arg2(literal, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(hl_formula, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$1 = NIL;
                                        final SubLObject token_var_$2 = NIL;
                                        while (NIL == done_var_$1) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                            if (NIL != valid_$3) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$1 = makeBoolean(NIL == valid_$3);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$2 = NIL;
                                        final SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                            if (NIL != valid_$4) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$2 = makeBoolean(NIL == valid_$4);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$3 = NIL;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                            if (NIL != valid_$5) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                            if (NIL != valid_$6) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$8 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$5 = NIL;
                                        final SubLObject token_var_$6 = NIL;
                                        while (NIL == done_var_$5) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                            final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                            if (NIL != valid_$7) {
                                                removal_assertion_sentence_expand_internal_1(assertion2, assertion_var, hl_formula);
                                            }
                                            done_var_$5 = makeBoolean(NIL == valid_$7);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                                removal_assertion_sentence_expand_internal_1(assertion3, assertion_var, hl_formula);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion3 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_assertion_sentence_unbound_assertion_cost(literal, UNPROVIDED);
    }

    public static SubLObject removal_assertion_sentence_unbound_assertion_arg_lookup_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_var = literal_arg1(literal, UNPROVIDED);
        final SubLObject hl_formula = literal_arg2(literal, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(hl_formula, $POS);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$23 = NIL;
                                        final SubLObject token_var_$24 = NIL;
                                        while (NIL == done_var_$23) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                            final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion));
                                            if (NIL != valid_$25) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$23 = makeBoolean(NIL == valid_$25);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$24 = NIL;
                                        final SubLObject token_var_$25 = NIL;
                                        while (NIL == done_var_$24) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                            final SubLObject valid_$26 = makeBoolean(!token_var_$25.eql(assertion));
                                            if (NIL != valid_$26) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$24 = makeBoolean(NIL == valid_$26);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != predicate) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$25 = NIL;
                                        final SubLObject token_var_$26 = NIL;
                                        while (NIL == done_var_$25) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                            final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                            if (NIL != valid_$27) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$25 = makeBoolean(NIL == valid_$27);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else {
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$26 = NIL;
                                        final SubLObject token_var_$27 = NIL;
                                        while (NIL == done_var_$26) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                            final SubLObject valid_$28 = makeBoolean(!token_var_$27.eql(assertion));
                                            if (NIL != valid_$28) {
                                                removal_assertion_sentence_expand_internal_1(assertion, assertion_var, hl_formula);
                                            }
                                            done_var_$26 = makeBoolean(NIL == valid_$28);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }

            } else
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$30 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$40 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                        SubLObject done_var_$27 = NIL;
                                        final SubLObject token_var_$28 = NIL;
                                        while (NIL == done_var_$27) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$28);
                                            final SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(assertion2));
                                            if (NIL != valid_$29) {
                                                removal_assertion_sentence_expand_internal_1(assertion2, assertion_var, hl_formula);
                                            }
                                            done_var_$27 = makeBoolean(NIL == valid_$29);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$40, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                                removal_assertion_sentence_expand_internal_1(assertion3, assertion_var, hl_formula);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion3 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject assertion_has_idP(final SubLObject assertion, final SubLObject id) {
        return equal(id, assertion_handles.assertion_id(assertion));
    }

    public static SubLObject make_assertion_id_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_id_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject cycl_direction_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cycl_directions$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject direction_to_cycl_direction(final SubLObject direction) {
        if (direction.eql($FORWARD)) {
            return $$Forward_AssertionDirection;
        }
        if (direction.eql($BACKWARD)) {
            return $$Backward_AssertionDirection;
        }
        if (direction.eql($CODE)) {
            return $$Code_AssertionDirection;
        }
        Errors.error($str59$_S_was_not_a_direction_p, direction);
        return NIL;
    }

    public static SubLObject cycl_direction_to_direction(final SubLObject cycl_direction) {
        if (cycl_direction.eql($$Forward_AssertionDirection)) {
            return $FORWARD;
        }
        if (cycl_direction.eql($$Backward_AssertionDirection)) {
            return $BACKWARD;
        }
        if (cycl_direction.eql($$Code_AssertionDirection)) {
            return $CODE;
        }
        Errors.error($str60$_S_was_not_a_cycl_direction_p, cycl_direction);
        return NIL;
    }

    public static SubLObject make_assertion_direction_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_direction_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject cycl_strength_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cycl_strengths$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject strength_to_cycl_strength(final SubLObject strength) {
        if (strength.eql($DEFAULT)) {
            return $$Default_JustificationStrength;
        }
        if (strength.eql($MONOTONIC)) {
            return $$Monotonic_JustificationStrength;
        }
        Errors.error($str74$_S_was_not_a_el_strength_p, strength);
        return NIL;
    }

    public static SubLObject cycl_strength_to_strength(final SubLObject cycl_strength) {
        if (cycl_strength.eql($$Default_JustificationStrength)) {
            return $DEFAULT;
        }
        if (cycl_strength.eql($$Monotonic_JustificationStrength)) {
            return $MONOTONIC;
        }
        Errors.error($str75$_S_was_not_a_cycl_strength_p, cycl_strength);
        return NIL;
    }

    public static SubLObject assertion_has_strength(final SubLObject assertion, final SubLObject strength) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != enumeration_types.el_strength_p(strength) : "enumeration_types.el_strength_p(strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(strength) " + strength;
        return eql(strength, assertions_high.assertion_strength(assertion));
    }

    public static SubLObject make_assertion_strength_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_strength_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject cycl_truth_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cycl_truths$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject truth_to_cycl_truth(final SubLObject truth) {
        if (truth.eql($TRUE)) {
            return $$True_JustificationTruth;
        }
        if (truth.eql($FALSE)) {
            return $$False_JustificationTruth;
        }
        if (truth.eql($UNKNOWN)) {
            return $$Unknown_JustificationTruth;
        }
        Errors.error($str93$_S_was_not_a_truth_p, truth);
        return NIL;
    }

    public static SubLObject cycl_truth_to_truth(final SubLObject cycl_truth) {
        if (cycl_truth.eql($$True_JustificationTruth)) {
            return $TRUE;
        }
        if (cycl_truth.eql($$False_JustificationTruth)) {
            return $FALSE;
        }
        if (cycl_truth.eql($$Unknown_JustificationTruth)) {
            return $UNKNOWN;
        }
        Errors.error($str94$_S_was_not_a_cycl_truth_p, cycl_truth);
        return NIL;
    }

    public static SubLObject make_assertion_truth_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_truth_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject inference_assertion_just_att(final SubLObject assertion, final SubLObject att) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != forts.fort_p(att) : "forts.fort_p(att) " + "CommonSymbols.NIL != forts.fort_p(att) " + att;
        if (att.eql($$AssertedBelief)) {
            return assertions_high.asserted_assertionP(assertion);
        }
        if (att.eql($$SupportedByMaterialImplication)) {
            return assertions_high.deduced_assertionP(assertion);
        }
        return NIL;
    }

    public static SubLObject inference_all_assertion_just_att(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        SubLObject attributes = NIL;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            attributes = cons($$AssertedBelief, attributes);
        }
        if (NIL != assertions_high.deduced_assertionP(assertion)) {
            attributes = cons($$SupportedByMaterialImplication, attributes);
        }
        return nreverse(attributes);
    }

    public static SubLObject make_assertion_just_att_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        support_sentence = hl_assertion_support_sentence_to_el(support_sentence);
        support_mt = $assertion_just_att_defining_mt$.getGlobalValue();
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_sentence, support_mt, $TRUE_MON);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject assertion_asserted_byP(final SubLObject assertion, final SubLObject cyclist) {
        return equal(cyclist, assertions_high.asserted_by(assertion));
    }

    public static SubLObject all_assertions_asserted_by(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_message = format(NIL, $str115$Computing_assertions_asserted_by_, cyclist);
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = progress_message;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$45 = idx;
                if (NIL == id_index_objects_empty_p(idx_$45, $SKIP)) {
                    final SubLObject idx_$46 = idx_$45;
                    if (NIL == id_index_dense_objects_empty_p(idx_$46, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$46);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_asserted_byP(ass, cyclist)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$47 = idx_$45;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$47)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$47);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$47);
                        final SubLObject end_id = id_index_next_id(idx_$47);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_asserted_byP(ass2, cyclist)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject new_assertion_asserted_by_iterator(final SubLObject cyclist, SubLObject optimize) {
        if (optimize == UNPROVIDED) {
            optimize = $LATENCY;
        }
        final SubLObject pcase_var = optimize;
        if (pcase_var.eql($LATENCY)) {
            final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            final SubLObject filter_args = list(cyclist);
            return iteration.new_filter_iterator(input_iterator, $sym119$ASSERTION_ASSERTED_BY_, filter_args);
        }
        if (pcase_var.eql($TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_by(cyclist));
        }
        return Errors.error($str121$_S_was_not_one_of__latency_or__to, optimize);
    }

    public static SubLObject current_inference_exhaustiveP() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        return makeBoolean((NIL == inference) || (NIL != inference_datastructures_inference.inference_dynamic_properties_exhaustiveP(inference)));
    }

    public static SubLObject estimated_average_assertions_per_cyclist() {
        return integerDivide(assertion_handles.assertion_count(), max(ONE_INTEGER, cardinality_estimates.instance_cardinality($$HumanCyclist)));
    }

    public static SubLObject removal_assertion_assert_by_lookup_cost(final SubLObject cyclist) {
        return number_utilities.f_2X(estimated_average_assertions_per_cyclist());
    }

    public static SubLObject removal_assertion_asserted_by_iterator(final SubLObject cyclist) {
        final SubLObject optimize = (NIL != current_inference_exhaustiveP()) ? $TOTAL_TIME : $LATENCY;
        return new_assertion_asserted_by_iterator(cyclist, optimize);
    }

    public static SubLObject assertion_asserted_whenP(final SubLObject assertion, final SubLObject universal_date) {
        return eql(universal_date, assertions_high.asserted_when(assertion));
    }

    public static SubLObject all_assertions_asserted_when(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numeric_date_utilities.universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        final SubLObject progress_message = format(NIL, $str136$Computing_assertions_asserted_on_, numeric_date_utilities.datestring(universal_date));
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = progress_message;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$49 = idx;
                if (NIL == id_index_objects_empty_p(idx_$49, $SKIP)) {
                    final SubLObject idx_$50 = idx_$49;
                    if (NIL == id_index_dense_objects_empty_p(idx_$50, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$50);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_asserted_whenP(ass, universal_date)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$51 = idx_$49;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$51)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$51);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$51);
                        final SubLObject end_id = id_index_next_id(idx_$51);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_asserted_whenP(ass2, universal_date)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject new_assertion_asserted_when_iterator(final SubLObject universal_date, SubLObject optimize) {
        if (optimize == UNPROVIDED) {
            optimize = $LATENCY;
        }
        assert NIL != numeric_date_utilities.universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        final SubLObject pcase_var = optimize;
        if (pcase_var.eql($LATENCY)) {
            final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            final SubLObject filter_args = list(universal_date);
            return iteration.new_filter_iterator(input_iterator, $sym137$ASSERTION_ASSERTED_WHEN_, filter_args);
        }
        if (pcase_var.eql($TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_when(universal_date));
        }
        return Errors.error($str121$_S_was_not_one_of__latency_or__to, optimize);
    }

    public static SubLObject estimated_average_assertions_per_date() {
        return integerDivide(assertion_handles.assertion_count(), integerDivide(subtract(numeric_date_utilities.universal_time_from_date_and_second(numeric_date_utilities.today(), UNPROVIDED), numeric_date_utilities.universal_time_from_date_and_second($earliest_known_asserted_when$.getGlobalValue(), UNPROVIDED)), numeric_date_utilities.$seconds_in_a_day$.getGlobalValue()));
    }

    public static SubLObject removal_assertion_assert_time_lookup_cost(final SubLObject universal_date) {
        return number_utilities.f_2X(estimated_average_assertions_per_date());
    }

    public static SubLObject removal_assertion_asserted_when_iterator(final SubLObject universal_date) {
        final SubLObject optimize = (NIL != current_inference_exhaustiveP()) ? $TOTAL_TIME : $LATENCY;
        return new_assertion_asserted_when_iterator(universal_date, optimize);
    }

    public static SubLObject assertion_asserted_whyP(final SubLObject assertion, final SubLObject reason) {
        return equal(reason, assertions_high.asserted_why(assertion));
    }

    public static SubLObject all_assertions_asserted_why(final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject progress_message = format(NIL, $str151$Computing_assertions_asserted_for, reason);
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = progress_message;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$53 = idx;
                if (NIL == id_index_objects_empty_p(idx_$53, $SKIP)) {
                    final SubLObject idx_$54 = idx_$53;
                    if (NIL == id_index_dense_objects_empty_p(idx_$54, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$54);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_asserted_whyP(ass, reason)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$55 = idx_$53;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$55)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$55);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$55);
                        final SubLObject end_id = id_index_next_id(idx_$55);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_asserted_whyP(ass2, reason)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject new_assertion_asserted_why_iterator(final SubLObject reason, SubLObject optimize) {
        if (optimize == UNPROVIDED) {
            optimize = $LATENCY;
        }
        final SubLObject pcase_var = optimize;
        if (pcase_var.eql($LATENCY)) {
            final SubLObject input_iterator = assertion_handles.new_assertions_iterator();
            final SubLObject filter_args = list(reason);
            return iteration.new_filter_iterator(input_iterator, $sym152$ASSERTION_ASSERTED_WHY_, filter_args);
        }
        if (pcase_var.eql($TOTAL_TIME)) {
            return iteration.new_list_iterator(all_assertions_asserted_why(reason));
        }
        return Errors.error($str121$_S_was_not_one_of__latency_or__to, optimize);
    }

    public static SubLObject estimated_average_assertions_per_purpose() {
        return integerDivide(assertion_handles.assertion_count(), max(ONE_INTEGER, cardinality_estimates.instance_cardinality($$Cyc_BasedProject)));
    }

    public static SubLObject removal_assertion_assert_purpose_lookup_cost(final SubLObject reason) {
        return number_utilities.f_2X(estimated_average_assertions_per_purpose());
    }

    public static SubLObject removal_assertion_asserted_why_iterator(final SubLObject reason) {
        final SubLObject optimize = (NIL != current_inference_exhaustiveP()) ? $TOTAL_TIME : $LATENCY;
        return new_assertion_asserted_why_iterator(reason, optimize);
    }

    public static SubLObject removal_assertion_assert_date_lookup_cost(final SubLObject cycl_date) {
        return number_utilities.f_2X(estimated_average_assertions_per_date());
    }

    public static SubLObject removal_assertion_asserted_by_between_dates_cost(final SubLObject contextualized_dnf_clause) {
        return SEVENTEEN_INTEGER;
    }

    public static SubLObject removal_assertion_asserted_by_between_dates_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLObject asents = Mapping.mapcar(CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_dnf_clause));
        SubLObject clause_numbers = NIL;
        SubLObject list_var = NIL;
        SubLObject asent_1 = NIL;
        SubLObject clause_number_1 = NIL;
        list_var = asents;
        asent_1 = list_var.first();
        for (clause_number_1 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , asent_1 = list_var.first() , clause_number_1 = add(ONE_INTEGER, clause_number_1)) {
            if ((NIL != forts.fort_p(cycl_utilities.formula_arg2(asent_1, UNPROVIDED))) && (NIL != assertion_asserted_by_asentP(asent_1))) {
                final SubLObject asserted_by_variable = cycl_utilities.formula_arg1(asent_1, UNPROVIDED);
                if (NIL != variables.variable_p(asserted_by_variable)) {
                    SubLObject list_var_$57 = NIL;
                    SubLObject asent_2 = NIL;
                    SubLObject clause_number_2 = NIL;
                    list_var_$57 = asents;
                    asent_2 = list_var_$57.first();
                    for (clause_number_2 = ZERO_INTEGER; NIL != list_var_$57; list_var_$57 = list_var_$57.rest() , asent_2 = list_var_$57.first() , clause_number_2 = add(ONE_INTEGER, clause_number_2)) {
                        if ((NIL != assertion_assert_time_asentP(asent_2)) && cycl_utilities.formula_arg1(asent_2, UNPROVIDED).eql(asserted_by_variable)) {
                            SubLObject pos_lit_numbers = list(clause_number_1, clause_number_2);
                            final SubLObject time_variable = cycl_utilities.formula_arg2(asent_2, UNPROVIDED);
                            if ((NIL != variables.variable_p(time_variable)) && (!time_variable.eql(asserted_by_variable))) {
                                SubLObject list_var_$58 = NIL;
                                SubLObject asent_3 = NIL;
                                SubLObject clause_number_3 = NIL;
                                list_var_$58 = asents;
                                asent_3 = list_var_$58.first();
                                for (clause_number_3 = ZERO_INTEGER; NIL != list_var_$58; list_var_$58 = list_var_$58.rest() , asent_3 = list_var_$58.first() , clause_number_3 = add(ONE_INTEGER, clause_number_3)) {
                                    if ((NIL != removal_assertion_asserted_by_between_dates_date_comparison_asentP(asent_3)) && ((cycl_utilities.formula_arg2(asent_3, UNPROVIDED).isInteger() && cycl_utilities.formula_arg1(asent_3, UNPROVIDED).eql(time_variable)) || (cycl_utilities.formula_arg1(asent_3, UNPROVIDED).isInteger() && cycl_utilities.formula_arg2(asent_3, UNPROVIDED).eql(time_variable)))) {
                                        pos_lit_numbers = cons(clause_number_3, pos_lit_numbers);
                                    }
                                }
                                clause_numbers = cons(list(NIL, Sort.sort(pos_lit_numbers, symbol_function($sym180$_), UNPROVIDED)), clause_numbers);
                            }
                        }
                    }
                }
            }
        }
        return clause_numbers;
    }

    public static SubLObject assertion_asserted_by_asentP(final SubLObject asent) {
        return eql(cycl_utilities.formula_arg0(asent), $$assertionAssertBy);
    }

    public static SubLObject assertion_assert_time_asentP(final SubLObject asent) {
        return eql(cycl_utilities.formula_arg0(asent), $$assertionAssertTime);
    }

    public static SubLObject removal_assertion_asserted_by_between_dates_date_comparison_asentP(final SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.formula_arg0(asent), $removal_assertion_asserted_by_between_dates_date_comparison_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_assertion_asserted_by_between_dates_expand_iterator(final SubLObject contextualized_dnf_clause) {
        final SubLObject asents = Mapping.mapcar(CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_dnf_clause));
        final SubLObject asserted_by_asent = find_if($sym181$ASSERTION_ASSERTED_BY_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject assert_time_asent = find_if($sym182$ASSERTION_ASSERT_TIME_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject time_comparison_asents = list_utilities.find_all_if($sym183$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_DATE_COMPARISON_ASENT, asents, UNPROVIDED);
        final SubLObject assertion_var = cycl_utilities.formula_arg1(asserted_by_asent, UNPROVIDED);
        final SubLObject cyclist = cycl_utilities.formula_arg2(asserted_by_asent, UNPROVIDED);
        final SubLObject assert_time_arg2 = cycl_utilities.formula_arg2(assert_time_asent, UNPROVIDED);
        final SubLObject filter_and_transform_args = list(list_utilities.make_plist(list($CYCLIST, $ASSERTION_VAR, $ASSERT_TIME_ARG2, $TIME_COMPARISON_ASENTS, $ASENTS), list(cyclist, assertion_var, assert_time_arg2, time_comparison_asents, asents)));
        return iteration.new_filter_and_transform_iterator(assertion_handles.new_assertions_iterator(), $sym189$REMOVAL_ASSERTION_ASSERTED_BY_BETWEEN_DATES_ITERATOR_FILTER_AND_T, filter_and_transform_args);
    }

    public static SubLObject removal_assertion_asserted_by_between_dates_iterator_filter_and_transform(final SubLObject assertion, final SubLObject filter_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = getf(filter_args, $CYCLIST, UNPROVIDED);
        final SubLObject assertion_var = getf(filter_args, $ASSERTION_VAR, UNPROVIDED);
        final SubLObject assert_time_arg2 = getf(filter_args, $ASSERT_TIME_ARG2, UNPROVIDED);
        final SubLObject time_comparison_asents = getf(filter_args, $TIME_COMPARISON_ASENTS, UNPROVIDED);
        final SubLObject asents = getf(filter_args, $ASENTS, UNPROVIDED);
        final SubLObject assertion_cyclist = assertions_high.asserted_by(assertion);
        final SubLObject assertion_date = assertions_high.asserted_when(assertion);
        if (assert_time_arg2.isInteger()) {
            if (assertion_cyclist.eql(cyclist) && assertion_date.eql(assert_time_arg2)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(assertion_var, assertion, T, T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject justifications = list(listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(list($$assertionAssertBy, assertion, assertion_cyclist)), removal_modules_bookkeeping.make_bookkeeping_hl_support(list($$assertionAssertTime, assertion, assertion_date)), unify_justification));
                return values(list(v_bindings, justifications), T);
            }
        } else
            if (assertion_cyclist.eql(cyclist)) {
                SubLObject failureP = NIL;
                if (NIL == failureP) {
                    SubLObject csome_list_var = time_comparison_asents;
                    SubLObject time_comparison_asent = NIL;
                    time_comparison_asent = csome_list_var.first();
                    while ((NIL == failureP) && (NIL != csome_list_var)) {
                        final SubLObject bound_time_comparison_asent = cycl_utilities.expression_subst(assertion_date, assert_time_arg2, time_comparison_asent, UNPROVIDED, UNPROVIDED);
                        if (NIL == relation_evaluation.cyc_evaluate(bound_time_comparison_asent)) {
                            failureP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        time_comparison_asent = csome_list_var.first();
                    } 
                }
                if (NIL == failureP) {
                    thread.resetMultipleValues();
                    final SubLObject bindings1 = unification_utilities.term_unify(assertion_var, assertion, UNPROVIDED, UNPROVIDED);
                    final SubLObject unify_justification2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    final SubLObject bindings2 = unification_utilities.term_unify(assert_time_arg2, assertion_date, UNPROVIDED, UNPROVIDED);
                    final SubLObject unify_justification3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject v_bindings2 = append(bindings1, bindings2);
                    final SubLObject unify_justification4 = append(unify_justification2, unify_justification3);
                    SubLObject justifications2 = NIL;
                    SubLObject cdolist_list_var = asents;
                    SubLObject asent = NIL;
                    asent = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (cycl_utilities.formula_arg0(asent).eql($$assertionAssertTime)) {
                            justifications2 = cons(listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(make_binary_formula($$assertionAssertTime, assertion, assertion_date)), unify_justification4), justifications2);
                        } else
                            if (cycl_utilities.formula_arg0(asent).eql($$assertionAssertBy)) {
                                justifications2 = cons(listS(removal_modules_bookkeeping.make_bookkeeping_hl_support(make_binary_formula($$assertionAssertBy, assertion, assertion_cyclist)), unify_justification4), justifications2);
                            } else {
                                justifications2 = cons(listS(removal_modules_evaluation.make_eval_support(bindings.apply_bindings(v_bindings2, asent), UNPROVIDED), unify_justification4), justifications2);
                            }

                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    } 
                    justifications2 = nreverse(justifications2);
                    return values(list(v_bindings2, justifications2), T);
                }
            }

        return values(NIL, NIL);
    }

    public static SubLObject declare_removal_modules_assertion_mt_file() {
        declareFunction(me, "hl_assertion_support_sentence_to_el", "HL-ASSERTION-SUPPORT-SENTENCE-TO-EL", 1, 0, false);
        declareFunction(me, "make_assertion_mt_support", "MAKE-ASSERTION-MT-SUPPORT", 1, 1, false);
        declareFunction(me, "removal_assertion_mt_lookup_cost", "REMOVAL-ASSERTION-MT-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "assertion_sentenceP", "ASSERTION-SENTENCE?", 2, 0, false);
        declareFunction(me, "make_assertion_sentence_support_from_assertion", "MAKE-ASSERTION-SENTENCE-SUPPORT-FROM-ASSERTION", 2, 1, false);
        declareFunction(me, "make_assertion_sentence_support", "MAKE-ASSERTION-SENTENCE-SUPPORT", 1, 1, false);
        declareFunction(me, "assertion_fi_formula_robust", "ASSERTION-FI-FORMULA-ROBUST", 1, 1, false);
        declareFunction(me, "removal_assertion_sentence_unbound_assertion_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-COST", 1, 1, false);
        declareFunction(me, "removal_assertion_sentence_expand_internal_1", "REMOVAL-ASSERTION-SENTENCE-EXPAND-INTERNAL-1", 3, 0, false);
        declareFunction(me, "removal_assertion_sentence_unbound_assertion_pred_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "removal_assertion_sentence_unbound_assertion_pred_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-PRED-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(me, "removal_assertion_sentence_unbound_assertion_arg_lookup_cost", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "removal_assertion_sentence_unbound_assertion_arg_lookup_expand", "REMOVAL-ASSERTION-SENTENCE-UNBOUND-ASSERTION-ARG-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(me, "assertion_has_idP", "ASSERTION-HAS-ID?", 2, 0, false);
        declareFunction(me, "make_assertion_id_support", "MAKE-ASSERTION-ID-SUPPORT", 1, 1, false);
        declareFunction(me, "cycl_direction_p", "CYCL-DIRECTION-P", 1, 0, false);
        declareFunction(me, "direction_to_cycl_direction", "DIRECTION-TO-CYCL-DIRECTION", 1, 0, false);
        declareFunction(me, "cycl_direction_to_direction", "CYCL-DIRECTION-TO-DIRECTION", 1, 0, false);
        declareFunction(me, "make_assertion_direction_support", "MAKE-ASSERTION-DIRECTION-SUPPORT", 1, 1, false);
        declareFunction(me, "cycl_strength_p", "CYCL-STRENGTH-P", 1, 0, false);
        declareFunction(me, "strength_to_cycl_strength", "STRENGTH-TO-CYCL-STRENGTH", 1, 0, false);
        declareFunction(me, "cycl_strength_to_strength", "CYCL-STRENGTH-TO-STRENGTH", 1, 0, false);
        declareFunction(me, "assertion_has_strength", "ASSERTION-HAS-STRENGTH", 2, 0, false);
        declareFunction(me, "make_assertion_strength_support", "MAKE-ASSERTION-STRENGTH-SUPPORT", 1, 1, false);
        declareFunction(me, "cycl_truth_p", "CYCL-TRUTH-P", 1, 0, false);
        declareFunction(me, "truth_to_cycl_truth", "TRUTH-TO-CYCL-TRUTH", 1, 0, false);
        declareFunction(me, "cycl_truth_to_truth", "CYCL-TRUTH-TO-TRUTH", 1, 0, false);
        declareFunction(me, "make_assertion_truth_support", "MAKE-ASSERTION-TRUTH-SUPPORT", 1, 1, false);
        declareFunction(me, "inference_assertion_just_att", "INFERENCE-ASSERTION-JUST-ATT", 2, 0, false);
        declareFunction(me, "inference_all_assertion_just_att", "INFERENCE-ALL-ASSERTION-JUST-ATT", 1, 0, false);
        declareFunction(me, "make_assertion_just_att_support", "MAKE-ASSERTION-JUST-ATT-SUPPORT", 1, 1, false);
        declareFunction(me, "assertion_asserted_byP", "ASSERTION-ASSERTED-BY?", 2, 0, false);
        declareFunction(me, "all_assertions_asserted_by", "ALL-ASSERTIONS-ASSERTED-BY", 1, 0, false);
        declareFunction(me, "new_assertion_asserted_by_iterator", "NEW-ASSERTION-ASSERTED-BY-ITERATOR", 1, 1, false);
        declareFunction(me, "current_inference_exhaustiveP", "CURRENT-INFERENCE-EXHAUSTIVE?", 0, 0, false);
        declareFunction(me, "estimated_average_assertions_per_cyclist", "ESTIMATED-AVERAGE-ASSERTIONS-PER-CYCLIST", 0, 0, false);
        declareFunction(me, "removal_assertion_assert_by_lookup_cost", "REMOVAL-ASSERTION-ASSERT-BY-LOOKUP-COST", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_by_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-ITERATOR", 1, 0, false);
        declareFunction(me, "assertion_asserted_whenP", "ASSERTION-ASSERTED-WHEN?", 2, 0, false);
        declareFunction(me, "all_assertions_asserted_when", "ALL-ASSERTIONS-ASSERTED-WHEN", 1, 0, false);
        declareFunction(me, "new_assertion_asserted_when_iterator", "NEW-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 1, false);
        declareFunction(me, "estimated_average_assertions_per_date", "ESTIMATED-AVERAGE-ASSERTIONS-PER-DATE", 0, 0, false);
        declareFunction(me, "removal_assertion_assert_time_lookup_cost", "REMOVAL-ASSERTION-ASSERT-TIME-LOOKUP-COST", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_when_iterator", "REMOVAL-ASSERTION-ASSERTED-WHEN-ITERATOR", 1, 0, false);
        declareFunction(me, "assertion_asserted_whyP", "ASSERTION-ASSERTED-WHY?", 2, 0, false);
        declareFunction(me, "all_assertions_asserted_why", "ALL-ASSERTIONS-ASSERTED-WHY", 1, 0, false);
        declareFunction(me, "new_assertion_asserted_why_iterator", "NEW-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 1, false);
        declareFunction(me, "estimated_average_assertions_per_purpose", "ESTIMATED-AVERAGE-ASSERTIONS-PER-PURPOSE", 0, 0, false);
        declareFunction(me, "removal_assertion_assert_purpose_lookup_cost", "REMOVAL-ASSERTION-ASSERT-PURPOSE-LOOKUP-COST", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_why_iterator", "REMOVAL-ASSERTION-ASSERTED-WHY-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_assertion_assert_date_lookup_cost", "REMOVAL-ASSERTION-ASSERT-DATE-LOOKUP-COST", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_by_between_dates_cost", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-COST", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_by_between_dates_applicability", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-APPLICABILITY", 1, 0, false);
        declareFunction(me, "assertion_asserted_by_asentP", "ASSERTION-ASSERTED-BY-ASENT?", 1, 0, false);
        declareFunction(me, "assertion_assert_time_asentP", "ASSERTION-ASSERT-TIME-ASENT?", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_by_between_dates_date_comparison_asentP", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-ASENT?", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_by_between_dates_expand_iterator", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-EXPAND-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_assertion_asserted_by_between_dates_iterator_filter_and_transform", "REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-ITERATOR-FILTER-AND-TRANSFORM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_assertion_mt_file() {
        deflexical("*ASSERTION-MT-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_mt_defining_mt$, $assertion_mt_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-MT-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ASSERTION-SENTENCE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_sentence_defining_mt$, $assertion_sentence_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-SENTENCE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-ASSERTION-SENTENCE-LOOKUP-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ASSERTION-ID-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_id_defining_mt$, $assertion_id_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-ID-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*CYCL-DIRECTIONS*", $list52);
        deflexical("*ASSERTION-DIRECTION-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_direction_defining_mt$, $assertion_direction_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-DIRECTION-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*CYCL-STRENGTHS*", $list69);
        deflexical("*ASSERTION-STRENGTH-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_strength_defining_mt$, $assertion_strength_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-STRENGTH-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*CYCL-TRUTHS*", $list86);
        deflexical("*ASSERTION-TRUTH-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_truth_defining_mt$, $assertion_truth_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-TRUTH-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ASSERTION-JUST-ATT-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_just_att_defining_mt$, $assertion_just_att_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-JUST-ATT-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ASSERTION-ASSERT-BY-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_assert_by_defining_mt$, $assertion_assert_by_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-ASSERT-BY-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ASSERTION-ASSERT-TIME-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_assert_time_defining_mt$, $assertion_assert_time_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-ASSERT-TIME-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*EARLIEST-KNOWN-ASSERTED-WHEN*", $int$19950522);
        deflexical("*ASSERTION-ASSERT-PURPOSE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_assert_purpose_defining_mt$, $assertion_assert_purpose_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-ASSERT-PURPOSE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*ASSERTION-ASSERT-DATE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($assertion_assert_date_defining_mt$, $assertion_assert_date_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-ASSERTION-ASSERT-DATE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*REMOVAL-ASSERTION-ASSERTED-BY-BETWEEN-DATES-DATE-COMPARISON-PREDICATES*", $list178);
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_mt_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionMt);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionMt);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionMt);
        declare_defglobal($assertion_mt_defining_mt$);
        mt_vars.note_mt_var($assertion_mt_defining_mt$, $$assertionMt);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_CHECK_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_PRUNE_POS, $list11);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_CHECK_NEG, $list13);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_UNIFY, $list15);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_MT_LOOKUP, $list17);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionSentence);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionSentence);
        declare_defglobal($assertion_sentence_defining_mt$);
        mt_vars.note_mt_var($assertion_sentence_defining_mt$, $$assertionSentence);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_CHECK_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_CHECK_NEG, $list23);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_UNIFY, $list28);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_LOOKUP, $list30);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_PRED_LOOKUP, $list38);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_FORMULA_UNBOUND_ASSERTION_ARG_LOOKUP, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionID);
        declare_defglobal($assertion_id_defining_mt$);
        mt_vars.note_mt_var($assertion_id_defining_mt$, $$assertionID);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_CHECK_POS, $list44);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_CHECK_NEG, $list46);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_UNIFY, $list48);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ID_LOOKUP, $list50);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionDirection);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionDirection, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionDirection);
        declare_defglobal($assertion_direction_defining_mt$);
        mt_vars.note_mt_var($assertion_direction_defining_mt$, $$assertionDirection);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DIRECTION_CHECK_POS, $list63);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DIRECTION_CHECK_NEG, $list65);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DIRECTION_UNIFY, $list67);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionStrength);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionStrength, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionStrength);
        declare_defglobal($assertion_strength_defining_mt$);
        mt_vars.note_mt_var($assertion_strength_defining_mt$, $$assertionStrength);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_STRENGTH_CHECK_POS, $list80);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_STRENGTH_CHECK_NEG, $list82);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_STRENGTH_UNIFY, $list84);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionTruth);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionTruth, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionTruth);
        declare_defglobal($assertion_truth_defining_mt$);
        mt_vars.note_mt_var($assertion_truth_defining_mt$, $$assertionTruth);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_TRUTH_CHECK_POS, $list97);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_TRUTH_CHECK_NEG, $list99);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_TRUTH_UNIFY, $list101);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionJustificationAttribute);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionJustificationAttribute, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionJustificationAttribute);
        declare_defglobal($assertion_just_att_defining_mt$);
        mt_vars.note_mt_var($assertion_just_att_defining_mt$, $$assertionJustificationAttribute);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_JUST_ATT_CHECK_POS, $list108);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_JUST_ATT_CHECK_NEG, $list110);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_JUST_ATT_UNIFY, $list112);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertBy);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertBy);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertBy);
        declare_defglobal($assertion_assert_by_defining_mt$);
        mt_vars.note_mt_var($assertion_assert_by_defining_mt$, $$assertionAssertBy);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_CHECK_POS, $list123);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_CHECK_NEG, $list125);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_UNIFY, $list127);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_BY_LOOKUP, $list130);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_BY_LOOKUP, $list132);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertTime);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertTime);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertTime);
        declare_defglobal($assertion_assert_time_defining_mt$);
        mt_vars.note_mt_var($assertion_assert_time_defining_mt$, $$assertionAssertTime);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_CHECK_POS, $list139);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_CHECK_NEG, $list141);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_UNIFY, $list143);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_TIME_LOOKUP, $list146);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_TIME_LOOKUP, $list148);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertPurpose);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertPurpose);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertPurpose);
        declare_defglobal($assertion_assert_purpose_defining_mt$);
        mt_vars.note_mt_var($assertion_assert_purpose_defining_mt$, $$assertionAssertPurpose);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_POS, $list154);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_CHECK_NEG, $list156);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_UNIFY, $list158);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_PURPOSE_LOOKUP, $list161);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_PURPOSE_LOOKUP, $list163);
        inference_modules.register_solely_specific_removal_module_predicate($$assertionAssertDate);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$assertionAssertDate);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionAssertDate);
        declare_defglobal($assertion_assert_date_defining_mt$);
        mt_vars.note_mt_var($assertion_assert_date_defining_mt$, $$assertionAssertDate);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_CHECK_POS, $list167);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_CHECK_NEG, $list169);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_UNIFY, $list171);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ASSERT_DATE_LOOKUP, $list173);
        preference_modules.inference_preference_module($DISPREFER_ASSERTION_ASSERT_DATE_LOOKUP, $list175);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_ASSERTION_ASSERT_BY_AND_TIME_CONJUNCTIVE, $list177);
        return NIL;
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

    
}

/**
 * Total time: 1652 ms
 */
