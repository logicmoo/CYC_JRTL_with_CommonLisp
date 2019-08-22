package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.formula_has_arg_position_p;
import static com.cyc.cycjava.cycl.el_utilities.term_occurs_as_formula_argument;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_gaf_components extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_gaf_components();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_gaf_components";


    // deflexical
    private static final SubLSymbol $default_gaf_predicate_check_cost$ = makeSymbol("*DEFAULT-GAF-PREDICATE-CHECK-COST*");



    // deflexical
    private static final SubLSymbol $gaf_predicate_code_rule$ = makeSymbol("*GAF-PREDICATE-CODE-RULE*");

    // deflexical
    private static final SubLSymbol $default_gaf_argument_check_cost$ = makeSymbol("*DEFAULT-GAF-ARGUMENT-CHECK-COST*");



    // deflexical
    private static final SubLSymbol $gaf_argument_code_rule$ = makeSymbol("*GAF-ARGUMENT-CODE-RULE*");

    private static final SubLObject $$gafPredicate = reader_make_constant_shell(makeString("gafPredicate"));



    public static final SubLSymbol $gaf_predicate_defining_mt$ = makeSymbol("*GAF-PREDICATE-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLList $list4 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("assertedSentence")), makeSymbol("?ASENT")), list(reader_make_constant_shell(makeString("operatorFormulas")), makeSymbol("?PRED"), makeSymbol("?ASENT"))), list(reader_make_constant_shell(makeString("gafPredicate")), makeSymbol("?ASENT"), makeSymbol("?PRED")));





    private static final SubLSymbol $REMOVAL_GAF_PREDICATE_PRUNE_ON_GAF_POS = makeKeyword("REMOVAL-GAF-PREDICATE-PRUNE-ON-GAF-POS");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("gafPredicate")), list(makeKeyword("OR"), list(makeKeyword("NOT"), makeKeyword("SENTENCE")), list(makeKeyword("AND"), makeKeyword("SENTENCE"), list(makeKeyword("NOT"), list($TEST, makeSymbol("FIND-GAF-IN-RELEVANT-MT"))))), makeKeyword("ANYTHING"))), makeKeyword("DOCUMENTATION"), makeString("(#$gafPredicate <fully-bound> <anything>) \nwhere there is no existing GAF matching ARG1"), makeKeyword("EXAMPLE"), makeString("(#$gafPredicate (#$arity #$isa 3) #$arity)\n    (#$gafPredicate #$isa #$isa)") });

    private static final SubLSymbol $REMOVAL_GAF_PREDICATE_PRUNE_ON_PREDICATE_POS = makeKeyword("REMOVAL-GAF-PREDICATE-PRUNE-ON-PREDICATE-POS");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafPredicate")), cons(list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($BIND, makeSymbol("PRED"))), makeKeyword("ANYTHING")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), list(makeKeyword("VALUE"), makeSymbol("PRED"))))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$gafPredicate <fully-bound> <anything>) \n   where operator of formula in ARG1 doesn\'t match ARG2"), makeKeyword("EXAMPLE"), makeString("(#$gafPredicate (#$arity #$isa 2) #$isa)") });

    private static final SubLSymbol $REMOVAL_GAF_PREDICATE_CHECK_POS = makeKeyword("REMOVAL-GAF-PREDICATE-CHECK-POS");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GAF-PREDICATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafPredicate")), list($BIND, makeSymbol("FORMULA")), list($BIND, makeSymbol("PREDICATE"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("PREDICATE")), list($CALL, makeSymbol("FORMULA-HAS-OPERATOR?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafPredicate <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafPredicate (#$arity #$isa 2) #$arity)\n   Estimate: 0.50; Actual: 1\n   Vijay: Should we leave it at that. Since it a check module? Should we try to match\n   Actual to estimate or vice-versa, to be accurate always.") });

    private static final SubLSymbol $REMOVAL_GAF_PREDICATE_BOUND_UNBOUND_POS = makeKeyword("REMOVAL-GAF-PREDICATE-BOUND-UNBOUND-POS");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafPredicate")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($BIND, makeSymbol("FORMULA"))), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GAF-PREDICATE-BOUND-UNBOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafPredicate")), list($BIND, makeSymbol("FORMULA")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA")), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("FORMULA-ARG0"), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("gafPredicate")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafPredicate <sentence> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafPredicate (#$arity #$isa 2) ?WHAT)\n   Estimate: 2; Actual: 1\n   @todo: We could improve count-all-gafs to be mt relevant?") });

    private static final SubLSymbol $REMOVAL_GAF_PREDICATE_UNBOUND_BOUND_POS = makeKeyword("REMOVAL-GAF-PREDICATE-UNBOUND-BOUND-POS");

    private static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GAF-PREDICATE-UNBOUND-BOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("PREDICATE"))), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PREDICATE")), list($CALL, makeSymbol("GATHER-PREDICATE-EXTENT-INDEX"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")))), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("gafPredicate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafPredicate <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafPredicate ?WHAT #$defnSufficient) BaseKB KB 1174\n   Estimate: 328; Actual: 328\n   (#$gafPredicate ?WHAT #$defnSufficient) LogicalTruthImplementationMt\n   Estimate: 2; Actual: 2") });

    private static final SubLObject $$gafArgument = reader_make_constant_shell(makeString("gafArgument"));

    public static final SubLSymbol $gaf_argument_defining_mt$ = makeSymbol("*GAF-ARGUMENT-DEFINING-MT*");

    private static final SubLList $list19 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("assertedSentence")), makeSymbol("?ASENT")), list(reader_make_constant_shell(makeString("argN")), makeSymbol("?TERM"), makeSymbol("?N"), makeSymbol("?ASENT"))), list(reader_make_constant_shell(makeString("gafArgument")), makeSymbol("?ASENT"), makeSymbol("?N"), makeSymbol("?TERM")));

    private static final SubLSymbol $REMOVAL_GAF_ARGUMENT_PRUNE_POS = makeKeyword("REMOVAL-GAF-ARGUMENT-PRUNE-POS");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafArgument")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("gafArgument")), list(makeKeyword("OR"), list(makeKeyword("NOT"), makeKeyword("SENTENCE")), list(makeKeyword("AND"), makeKeyword("SENTENCE"), list(makeKeyword("NOT"), list($TEST, makeSymbol("FIND-GAF-IN-RELEVANT-MT"))))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("ANYTHING"), list(makeKeyword("AND"), list(makeKeyword("NOT"), makeKeyword("INTEGER")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$gafArgument <fully-bound> <anything> <anything>) \n    where there is no existing GAF matching ARG1"), makeKeyword("EXAMPLE"), makeString("(#$gafArgument (#$arity #$isa 3) 2 #$isa)\n    ;; Vijay: Is it possible for inference engine to try non-semantic / non-syntactic\n    ;; WFF bindings? If we are guaranteed to not encounter a case where a non-integer\n    ;; is placed in integer position, we can probably simplify the pruning.\n    (#$gafArgument (#$arity #$isa 3) #$isa #$isa)\n    (#$gafArgument #$isa 1 #$isa)") });

    private static final SubLSymbol $REMOVAL_GAF_ARGUMENT_CHECK_POS = makeKeyword("REMOVAL-GAF-ARGUMENT-CHECK-POS");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GAF-ARGUMENT-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafArgument")), list($BIND, makeSymbol("FORMULA")), list($BIND, makeSymbol("ARG-POS")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARG-POS")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARG-POS"), makeSymbol("TERM")), list($CALL, makeSymbol("EL-FORMULA-HAS-ARG?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARG-POS")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafArgument <sentence> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafArgument (#$isa #$Muffet #$Poodle) 2 #$Poodle)\n    Estimate: 0.50; Actual: 1; Its a check module. Still should we match?\n    (#$gafArgument (#$isa #$Muffet #$Dog) 2 #$Dog) - false") });

    private static final SubLSymbol $REMOVAL_GAF_ARGUMENT_BOUND_BOUND_UNBOUND_POS = makeKeyword("REMOVAL-GAF-ARGUMENT-BOUND-BOUND-UNBOUND-POS");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GAF-ARGUMENT-BOUND-BOUND-UNBOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafArgument")), list($BIND, makeSymbol("FORMULA")), list($BIND, makeSymbol("ARG-POS")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARG-POS")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARG-POS")), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("EL-FORMULA-ARG"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARG-POS"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARG-POS")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafArgument <sentence> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafArgument (#$isa #$Muffet #$Poodle) 2 ?WHAT) - CyclistsMt KB 1174\n    Estimate: 1; Actual: 1 \n    (#$gafArgument (#$isa #$Muffet #$Poodle) 3 ?WHAT) - CyclistMt KB 1174\n    Estimate: 0; Actual: 0\n    (#$gafArgument (#$isa #$Muffet #$Dog) 2 ?WHAT) : False") });

    private static final SubLSymbol $REMOVAL_GAF_ARGUMENT_BOUND_UNBOUND_UNBOUND_POS = makeKeyword("REMOVAL-GAF-ARGUMENT-BOUND-UNBOUND-UNBOUND-POS");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-GAF-ARGUMENT-BOUND-UNBOUND-UNBOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafArgument")), list($BIND, makeSymbol("FORMULA")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("TERM-ARG-POS-FOR-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ARGNUM"), makeSymbol("TERM")), list(reader_make_constant_shell(makeString("gafArgument")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafArgument <sentence> <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafArgument (#$isa #$Muffet #$Poodle) ?X ?WHAT) - InferencePSC KB 1174\n    Estimate: 3; Actual 3; \n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X ?WHAT) - UniversalVocabularyMt KB 1174\n    Estimate: 0; Actual 0;\n    Vijay: Why is the estimate zero? Where is count-all-gafs considering relevant mt? \n\n    (#$gafArgument (#$isa #$Muffet #$Dog) ?X ?WHAT) : False   \n    Use CyclistsMt so check if some code path is looking in just-mt\n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X #$Poodle) - CyclistsMt KB 1174\n    Estimate: 1; Actual: 1;\n\n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X #$Dog) - term-occurs-as.. CyclistsMt KB 1174\n    Estimate: 0; Actual: 0;  \n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X #$genls) - formula-has-operator?\n    Estimate: 0; Actual: 0;\n\n    (#$gafArgument (#$isa #$Muffet #$Dog) ?X #$Dog) : False\n   ") });



    private static final SubLSymbol $REMOVAL_GAF_ARGUMENT_UNBOUND_BOUND_BOUND_POS = makeKeyword("REMOVAL-GAF-ARGUMENT-UNBOUND-BOUND-BOUND-POS");

    private static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER")), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("ARGNUM")), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-GAFS-WITH-TERM-ARGNUM"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafArgument <not-fully-bound> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafArgument ?GAF 2 #$Dog) in BiologyVocabularyMt KB: 1174\n   Estimate: 188; Actual: 183\n   (#$gafArgument ?WHAT 0 #$defnSufficient) in UniversalVocabularyMt KB: 1174\n   Estimate: 328; Actual: 328") });



    private static final SubLSymbol $REMOVAL_GAF_ARGUMENT_UNBOUND_UNBOUND_BOUND_POS = makeKeyword("REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-POS");

    private static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("gafArgument")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("gafArgument")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("TERM"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("GET-GAF-ARGNUM-TUPLE-WITH-TERM"), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("GAF"), makeSymbol("ARGNUM")), list(reader_make_constant_shell(makeString("gafArgument")), list(makeKeyword("VALUE"), makeSymbol("GAF")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GAF"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$gafArgument <not-fully-bound> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$gafArgument ?GAF ?X #$Dog) in BiologyVocabularyMt KB: 1174\n   Estimate: 272; Actual: 263") });

    public static SubLObject make_gaf_predicate_code_rule_support() {
        return arguments.make_hl_support($CODE, $gaf_predicate_code_rule$.getGlobalValue(), $gaf_predicate_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_gaf_predicate_bound_unbound_cost(final SubLObject asent) {
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return kb_indexing.count_all_gafs(formula);
    }

    public static SubLObject removal_gaf_predicate_unbound_bound_cost(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return kb_indexing.relevant_num_predicate_extent_index(pred);
    }

    public static SubLObject make_gaf_argument_code_rule_support() {
        return arguments.make_hl_support($CODE, $gaf_argument_code_rule$.getGlobalValue(), $gaf_argument_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_gaf_argument_bound_bound_unbound_cost(final SubLObject asent) {
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != formula_has_arg_position_p(formula, list(argnum))) {
            return kb_indexing.count_all_gafs(formula);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject removal_gaf_argument_bound_unbound_unbound_cost(final SubLObject asent) {
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if (NIL != variables.variable_p(v_term)) {
            return multiply(kb_indexing.count_all_gafs(formula), length(formula));
        }
        if ((NIL == term_occurs_as_formula_argument(v_term, formula)) && (NIL == removal_modules_formula_arg_n.formula_has_operatorP(formula, v_term))) {
            return ZERO_INTEGER;
        }
        return kb_indexing.count_all_gafs(formula);
    }

    public static SubLObject term_arg_pos_for_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.current_mt_relevance_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject terms = cycl_utilities.formula_terms(formula, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject term_var = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            term_var = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , term_var = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                v_bindings = cons(list(argnum, term_var), v_bindings);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_bindings;
    }

    public static SubLObject removal_gaf_argument_unbound_unbound_bound_cost(final SubLObject asent) {
        final SubLObject fort = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject argnum = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != variables.variable_p(argnum)) {
            return kb_indexing.relevant_num_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED);
        }
        if (argnum.isZero()) {
            return kb_indexing.relevant_num_predicate_extent_index(fort);
        }
        return kb_indexing.relevant_num_gaf_arg_index(fort, argnum, UNPROVIDED);
    }

    public static SubLObject get_gafs_with_term_argnum(final SubLObject v_term, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.current_mt_relevance_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (argnum.isZero()) {
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(v_term)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$1 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$2 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(v_term);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                                        if (NIL != valid_$6) {
                                            gafs = cons(assertions_high.gaf_el_formula(ass), gafs);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$2, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            } else {
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            SubLObject final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                SubLObject done_var_$5 = NIL;
                                final SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(ass2));
                                    if (NIL != valid_$7) {
                                        gafs = cons(assertions_high.gaf_el_formula(ass2), gafs);
                                    }
                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gafs;
    }

    public static SubLObject get_gaf_argnum_tuple_with_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.current_mt_relevance_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$12 = NIL;
                            final SubLObject token_var_$13 = NIL;
                            while (NIL == done_var_$12) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(ass));
                                if (NIL != valid_$14) {
                                    final SubLObject terms = cycl_utilities.formula_terms(ass, $IGNORE);
                                    SubLObject list_var = NIL;
                                    SubLObject term_var = NIL;
                                    SubLObject argnum = NIL;
                                    list_var = terms;
                                    term_var = list_var.first();
                                    for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , term_var = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                                        if (v_term.eql(term_var)) {
                                            gafs = cons(list(assertions_high.gaf_el_formula(ass), argnum), gafs);
                                        }
                                    }
                                }
                                done_var_$12 = makeBoolean(NIL == valid_$14);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gafs;
    }

    public static SubLObject declare_removal_modules_gaf_components_file() {
        declareFunction("make_gaf_predicate_code_rule_support", "MAKE-GAF-PREDICATE-CODE-RULE-SUPPORT", 0, 0, false);
        declareFunction("removal_gaf_predicate_bound_unbound_cost", "REMOVAL-GAF-PREDICATE-BOUND-UNBOUND-COST", 1, 0, false);
        declareFunction("removal_gaf_predicate_unbound_bound_cost", "REMOVAL-GAF-PREDICATE-UNBOUND-BOUND-COST", 1, 0, false);
        declareFunction("make_gaf_argument_code_rule_support", "MAKE-GAF-ARGUMENT-CODE-RULE-SUPPORT", 0, 0, false);
        declareFunction("removal_gaf_argument_bound_bound_unbound_cost", "REMOVAL-GAF-ARGUMENT-BOUND-BOUND-UNBOUND-COST", 1, 0, false);
        declareFunction("removal_gaf_argument_bound_unbound_unbound_cost", "REMOVAL-GAF-ARGUMENT-BOUND-UNBOUND-UNBOUND-COST", 1, 0, false);
        declareFunction("term_arg_pos_for_formula", "TERM-ARG-POS-FOR-FORMULA", 1, 0, false);
        declareFunction("removal_gaf_argument_unbound_unbound_bound_cost", "REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-COST", 1, 0, false);
        declareFunction("get_gafs_with_term_argnum", "GET-GAFS-WITH-TERM-ARGNUM", 2, 0, false);
        declareFunction("get_gaf_argnum_tuple_with_term", "GET-GAF-ARGNUM-TUPLE-WITH-TERM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_gaf_components_file() {
        deflexical("*DEFAULT-GAF-PREDICATE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*GAF-PREDICATE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($gaf_predicate_defining_mt$, $gaf_predicate_defining_mt$, $$BaseKB));
        deflexical("*GAF-PREDICATE-CODE-RULE*", $list4);
        deflexical("*DEFAULT-GAF-ARGUMENT-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*GAF-ARGUMENT-DEFINING-MT*", SubLTrampolineFile.maybeDefault($gaf_argument_defining_mt$, $gaf_argument_defining_mt$, $$BaseKB));
        deflexical("*GAF-ARGUMENT-CODE-RULE*", $list19);
        return NIL;
    }

    public static SubLObject setup_removal_modules_gaf_components_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$gafPredicate);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$gafPredicate);
        declare_defglobal($gaf_predicate_defining_mt$);
        mt_vars.note_mt_var($gaf_predicate_defining_mt$, $$gafPredicate);
        inference_modules.inference_removal_pruning_module($REMOVAL_GAF_PREDICATE_PRUNE_ON_GAF_POS, $list8);
        inference_modules.inference_removal_pruning_module($REMOVAL_GAF_PREDICATE_PRUNE_ON_PREDICATE_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_GAF_PREDICATE_CHECK_POS, $list12);
        inference_modules.inference_removal_module($REMOVAL_GAF_PREDICATE_BOUND_UNBOUND_POS, $list14);
        inference_modules.inference_removal_module($REMOVAL_GAF_PREDICATE_UNBOUND_BOUND_POS, $list16);
        inference_modules.register_solely_specific_removal_module_predicate($$gafArgument);
        declare_defglobal($gaf_argument_defining_mt$);
        mt_vars.note_mt_var($gaf_argument_defining_mt$, $$gafArgument);
        inference_modules.inference_removal_pruning_module($REMOVAL_GAF_ARGUMENT_PRUNE_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_GAF_ARGUMENT_CHECK_POS, $list23);
        inference_modules.inference_removal_module($REMOVAL_GAF_ARGUMENT_BOUND_BOUND_UNBOUND_POS, $list25);
        inference_modules.inference_removal_module($REMOVAL_GAF_ARGUMENT_BOUND_UNBOUND_UNBOUND_POS, $list27);
        inference_modules.inference_removal_module($REMOVAL_GAF_ARGUMENT_UNBOUND_BOUND_BOUND_POS, $list30);
        inference_modules.inference_removal_module($REMOVAL_GAF_ARGUMENT_UNBOUND_UNBOUND_BOUND_POS, $list33);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_gaf_components_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_gaf_components_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_gaf_components_file();
    }

    
}

/**
 * Total time: 274 ms
 */
