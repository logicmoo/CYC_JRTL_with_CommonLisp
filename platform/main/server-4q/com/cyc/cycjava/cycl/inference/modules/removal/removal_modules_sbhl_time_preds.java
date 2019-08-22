package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_sbhl_time_preds extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_sbhl_time_preds();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sbhl_time_preds";

    public static final String myFingerPrint = "aa6643f08706fb8a53cc36e2e015181027d5ec0821c86a902a110d83ab1bb7df";

    // deflexical
    // Definitions
    private static final SubLSymbol $sbhl_time_generic_modules$ = makeSymbol("*SBHL-TIME-GENERIC-MODULES*");

    // defparameter
    private static final SubLSymbol $default_temporal_relation_check_cost$ = makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_all_temporal_relation_cost$ = makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*");

    // defparameter
    private static final SubLSymbol $default_all_temporal_relation_inverse_cost$ = makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*");

    // defparameter
    private static final SubLSymbol $default_not_temporal_relation_check_cost$ = makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ makeKeyword("REMOVAL-LOOKUP-POS"), makeKeyword("REMOVAL-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS"), makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS"), makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG"), makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS"), makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS"), makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG"), makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP"), makeKeyword("REMOVAL-NEGATIONINVERSE-LOOKUP"), makeKeyword("REMOVAL-REFLEXIVE-MAP"), makeKeyword("REMOVAL-IRREFLEXIVE-ONE-ARG"), makeKeyword("REMOVAL-IRREFLEXIVE-MAP"), makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-CHECK"), makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-UNIFY"), makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-CHECK"), makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-UNIFY"), makeKeyword("REMOVAL-REFLEXIVE-BOTH"), makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG"), makeKeyword("REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS") });

    private static final SubLSymbol $SBHL_TIME_TOTAL_EXCLUSIVITY_POS = makeKeyword("SBHL-TIME-TOTAL-EXCLUSIVITY-POS");









    public static final SubLList $list6 = list(makeKeyword("OR"), list(list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P"))), list(list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))));







    public static final SubLList $list10 = list(makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("An exclusivity module that identifies when SBHL time will totally handle a problem."));

    public static final SubLList $list11 = list(new SubLObject[]{ reader_make_constant_shell(makeString("startsAfterStartingOf")), reader_make_constant_shell(makeString("startsAfterEndingOf")), reader_make_constant_shell(makeString("endsAfterStartingOf")), reader_make_constant_shell(makeString("endsAfterEndingOf")), reader_make_constant_shell(makeString("temporallySubsumes")), reader_make_constant_shell(makeString("dateOfEvent")), reader_make_constant_shell(makeString("cotemporal")), reader_make_constant_shell(makeString("temporallyIntersects")), reader_make_constant_shell(makeString("temporallyDisjoint")), reader_make_constant_shell(makeString("temporalBoundsContain")), reader_make_constant_shell(makeString("temporalBoundsSubsume")), reader_make_constant_shell(makeString("temporalBoundsIdentical")), reader_make_constant_shell(makeString("temporalBoundsIntersect")), reader_make_constant_shell(makeString("temporallyCooriginating")), reader_make_constant_shell(makeString("temporallyCoterminal")), reader_make_constant_shell(makeString("contiguousAfter")), reader_make_constant_shell(makeString("startsDuring")), reader_make_constant_shell(makeString("endsDuring")), reader_make_constant_shell(makeString("startingDate")), reader_make_constant_shell(makeString("endingDate")), reader_make_constant_shell(makeString("birthDate")), reader_make_constant_shell(makeString("dateOfDeath")), reader_make_constant_shell(makeString("temporallyStartedBy")), reader_make_constant_shell(makeString("temporallyFinishedBy")), reader_make_constant_shell(makeString("overlapsStart")) });

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLObject $$startsAfterStartingOf = reader_make_constant_shell(makeString("startsAfterStartingOf"));

    private static final SubLSymbol $REMOVAL_STARTS_AFTER_STARTING_OF = makeKeyword("REMOVAL-STARTS-AFTER-STARTING-OF");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("STARTS-AFTER-STARTING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTS_AFTER_STARTING_OF = makeKeyword("REMOVAL-ALL-STARTS-AFTER-STARTING-OF");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_STARTS_AFTER_STARTING_OF_POS = makeKeyword("ALL-STARTS-AFTER-STARTING-OF-POS");

    private static final SubLList $list20 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE = makeKeyword("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS = makeKeyword("ALL-STARTS-AFTER-STARTING-OF-INVERSE-POS");

    private static final SubLList $list25 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));





    private static final SubLSymbol $REMOVAL_NOT_STARTS_AFTER_STARTING_OF = makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTS-AFTER-STARTING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startsAfterStartingOf <TemporalThing> <TemporalThing>))") });

    private static final SubLObject $$startsAfterEndingOf = reader_make_constant_shell(makeString("startsAfterEndingOf"));

    private static final SubLSymbol $REMOVAL_STARTS_AFTER_ENDING_OF = makeKeyword("REMOVAL-STARTS-AFTER-ENDING-OF");

    private static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("STARTS-AFTER-ENDING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTS_AFTER_ENDING_OF = makeKeyword("REMOVAL-ALL-STARTS-AFTER-ENDING-OF");

    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_STARTS_AFTER_ENDING_OF_POS = makeKeyword("ALL-STARTS-AFTER-ENDING-OF-POS");

    private static final SubLList $list37 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE = makeKeyword("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE");

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS = makeKeyword("ALL-STARTS-AFTER-ENDING-OF-INVERSE-POS");

    public static final SubLList $list42 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_STARTS_AFTER_ENDING_OF = makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF");

    public static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTS-AFTER-ENDING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startsAfterEndingOf <TemporalThing> <TemporalThing>))") });

    private static final SubLObject $$endsAfterStartingOf = reader_make_constant_shell(makeString("endsAfterStartingOf"));

    private static final SubLSymbol $REMOVAL_ENDS_AFTER_STARTING_OF = makeKeyword("REMOVAL-ENDS-AFTER-STARTING-OF");

    public static final SubLList $list47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("ENDS-AFTER-STARTING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDS_AFTER_STARTING_OF = makeKeyword("REMOVAL-ALL-ENDS-AFTER-STARTING-OF");

    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_ENDS_AFTER_STARTING_OF_POS = makeKeyword("ALL-ENDS-AFTER-STARTING-OF-POS");

    public static final SubLList $list52 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE = makeKeyword("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE");

    private static final SubLList $list55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS = makeKeyword("ALL-ENDS-AFTER-STARTING-OF-INVERSE-POS");

    private static final SubLList $list57 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_ENDS_AFTER_STARTING_OF = makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF");

    private static final SubLList $list59 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ENDS-AFTER-STARTING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endsAfterStartingOf <TemporalThing> <TemporalThing>))") });

    private static final SubLObject $$endsAfterEndingOf = reader_make_constant_shell(makeString("endsAfterEndingOf"));

    private static final SubLSymbol $REMOVAL_ENDS_AFTER_ENDING_OF = makeKeyword("REMOVAL-ENDS-AFTER-ENDING-OF");

    private static final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("ENDS-AFTER-ENDING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDS_AFTER_ENDING_OF = makeKeyword("REMOVAL-ALL-ENDS-AFTER-ENDING-OF");

    private static final SubLList $list65 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_ENDS_AFTER_ENDING_OF_POS = makeKeyword("ALL-ENDS-AFTER-ENDING-OF-POS");

    private static final SubLList $list67 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE = makeKeyword("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE");

    public static final SubLList $list70 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS = makeKeyword("ALL-ENDS-AFTER-ENDING-OF-INVERSE-POS");

    public static final SubLList $list72 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_ENDS_AFTER_ENDING_OF = makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF");

    private static final SubLList $list74 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ENDS-AFTER-ENDING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endsAfterEndingOf <TemporalThing> <TemporalThing>))") });

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES");

    public static final SubLList $list77 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-SUBSUMES?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_SUBSUMES = makeKeyword("REMOVAL-ALL-TEMPORALLY-SUBSUMES");

    public static final SubLList $list80 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_SUBSUMES_POS = makeKeyword("ALL-TEMPORALLY-SUBSUMES-POS");

    public static final SubLList $list82 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE");

    private static final SubLList $list85 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_SUBSUMES_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-SUBSUMES-INVERSE-POS");

    private static final SubLList $list87 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_SUBSUMES = makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES");

    public static final SubLList $list89 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-SUBSUMES-EXPAND") });

    private static final SubLObject $$dateOfEvent = reader_make_constant_shell(makeString("dateOfEvent"));

    private static final SubLSymbol $REMOVAL_DATE_OF_EVENT = makeKeyword("REMOVAL-DATE-OF-EVENT");

    private static final SubLList $list92 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfEvent")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dateOfEvent")), list(makeKeyword("BIND"), makeSymbol("EVENT")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("EVENT")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EVENT"), makeSymbol("DATE")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("EVENT"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EVENT"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("DATE-OF-EVENT?"), list(makeKeyword("VALUE"), makeSymbol("EVENT")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfEvent <Event> <Date>)") });

    private static final SubLSymbol REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_DATE_OF_EVENT_INVERSE = makeKeyword("REMOVAL-ALL-DATE-OF-EVENT-INVERSE");

    public static final SubLList $list95 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfEvent <not-fully-bound> <Date>)") });

    private static final SubLSymbol $ALL_DATE_OF_EVENT_INVERSE_POS = makeKeyword("ALL-DATE-OF-EVENT-INVERSE-POS");

    public static final SubLList $list97 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_DATE_OF_EVENT = makeKeyword("REMOVAL-NOT-DATE-OF-EVENT");

    public static final SubLList $list99 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfEvent")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-DATE-OF-EVENT-EXPAND") });

    private static final SubLSymbol $REMOVAL_DATE_OF_EVENT_DELAY = makeKeyword("REMOVAL-DATE-OF-EVENT-DELAY");

    private static final SubLList $list101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfEvent")), makeKeyword("VARIABLE"), makeKeyword("VARIABLE")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$dateOfEvent <variable> <variable>)\n    is not worked on"), makeKeyword("EXAMPLE"), makeString("(#$dateOfEvent ?X ?Y)") });

    private static final SubLObject $$cotemporal = reader_make_constant_shell(makeString("cotemporal"));



    public static final SubLList $list104 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cotemporal")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cotemporal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("COTEMPORAL?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_COTEMPORAL = makeKeyword("REMOVAL-ALL-COTEMPORAL");

    private static final SubLList $list107 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cotemporal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_COTEMPORAL_POS = makeKeyword("ALL-COTEMPORAL-POS");

    private static final SubLList $list109 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_COTEMPORAL_INVERSE = makeKeyword("REMOVAL-ALL-COTEMPORAL-INVERSE");

    public static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cotemporal")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_COTEMPORAL_INVERSE_POS = makeKeyword("ALL-COTEMPORAL-INVERSE-POS");

    public static final SubLList $list113 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_COTEMPORAL = makeKeyword("REMOVAL-NOT-COTEMPORAL");

    private static final SubLList $list115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cotemporal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-COTEMPORAL-EXPAND") });

    private static final SubLObject $$temporallyIntersects = reader_make_constant_shell(makeString("temporallyIntersects"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_INTERSECTS = makeKeyword("REMOVAL-TEMPORALLY-INTERSECTS");

    public static final SubLList $list118 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-INTERSECTS?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_INTERSECTS = makeKeyword("REMOVAL-ALL-TEMPORALLY-INTERSECTS");

    private static final SubLList $list121 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_INTERSECTS_POS = makeKeyword("ALL-TEMPORALLY-INTERSECTS-POS");

    private static final SubLList $list123 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-INTERSECTS-INVERSE");

    public static final SubLList $list125 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_INTERSECTS_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-INTERSECTS-INVERSE-POS");

    public static final SubLList $list127 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_INTERSECTS = makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS");

    private static final SubLList $list129 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-INTERSECTS-EXPAND") });

    private static final SubLObject $$temporallyDisjoint = reader_make_constant_shell(makeString("temporallyDisjoint"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_DISJOINT = makeKeyword("REMOVAL-TEMPORALLY-DISJOINT");

    public static final SubLList $list132 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-DISJOINT?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_DISJOINT = makeKeyword("REMOVAL-ALL-TEMPORALLY-DISJOINT");

    private static final SubLList $list135 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_DISJOINT_POS = makeKeyword("ALL-TEMPORALLY-DISJOINT-POS");

    private static final SubLList $list137 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-DISJOINT-INVERSE");

    public static final SubLList $list139 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_DISJOINT_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-DISJOINT-INVERSE-POS");

    public static final SubLList $list141 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_DISJOINT = makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT");

    private static final SubLList $list143 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyDisjoint")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-DISJOINT-EXPAND") });

    private static final SubLObject $$temporalBoundsContain = reader_make_constant_shell(makeString("temporalBoundsContain"));

    private static final SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_CONTAIN = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-CONTAIN");

    public static final SubLList $list146 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN");

    public static final SubLList $list149 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_CONTAIN_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-CONTAIN-POS");

    public static final SubLList $list151 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE");

    private static final SubLList $list154 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-POS");

    private static final SubLList $list156 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN");

    public static final SubLList $list158 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsContain")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN-EXPAND") });

    private static final SubLObject $$temporalBoundsSubsume = reader_make_constant_shell(makeString("temporalBoundsSubsume"));

    private static final SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_SUBSUME = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-SUBSUME");

    private static final SubLList $list161 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-SUBSUME?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME");

    private static final SubLList $list164 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_SUBSUME_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-SUBSUME-POS");

    private static final SubLList $list166 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE");

    public static final SubLList $list169 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-POS");

    private static final SubLList $list171 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME");

    private static final SubLList $list173 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsSubsume")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME-EXPAND") });

    private static final SubLObject $$temporalBoundsIdentical = reader_make_constant_shell(makeString("temporalBoundsIdentical"));

    private static final SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-IDENTICAL");

    public static final SubLList $list176 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL");

    private static final SubLList $list179 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_IDENTICAL_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-IDENTICAL-POS");

    public static final SubLList $list181 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE");

    public static final SubLList $list183 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE-POS");

    private static final SubLList $list185 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL");

    private static final SubLList $list187 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIdentical")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL-EXPAND") });

    private static final SubLObject $$temporalBoundsIntersect = reader_make_constant_shell(makeString("temporalBoundsIntersect"));

    private static final SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_INTERSECT = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-INTERSECT");

    public static final SubLList $list190 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT");

    private static final SubLList $list193 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_INTERSECT_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-INTERSECT-POS");

    public static final SubLList $list195 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE");

    public static final SubLList $list197 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE-POS");

    private static final SubLList $list199 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT");

    private static final SubLList $list201 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporalBoundsIntersect")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT-EXPAND") });

    private static final SubLObject $$temporallyCooriginating = reader_make_constant_shell(makeString("temporallyCooriginating"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_COORIGINATING = makeKeyword("REMOVAL-TEMPORALLY-COORIGINATING");

    public static final SubLList $list204 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-COORIGINATING?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_COORIGINATING = makeKeyword("REMOVAL-ALL-TEMPORALLY-COORIGINATING");

    private static final SubLList $list207 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <TemporalThing> <not-fully-bound>") });

    private static final SubLSymbol $ALL_TEMPORALLY_COORIGINATING_POS = makeKeyword("ALL-TEMPORALLY-COORIGINATING-POS");

    public static final SubLList $list209 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-COORIGINATING-INVERSE");

    public static final SubLList $list211 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_COORIGINATING_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-COORIGINATING-INVERSE-POS");

    private static final SubLList $list213 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_COORIGINATING = makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING");

    private static final SubLList $list215 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCooriginating")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-COORIGINATING-EXPAND") });

    private static final SubLObject $$temporallyCoterminal = reader_make_constant_shell(makeString("temporallyCoterminal"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_COTERMINAL = makeKeyword("REMOVAL-TEMPORALLY-COTERMINAL");

    public static final SubLList $list218 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-COTERMINAL?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_COTERMINAL = makeKeyword("REMOVAL-ALL-TEMPORALLY-COTERMINAL");

    private static final SubLList $list221 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <TemporalThing> <not-fully-bound>") });

    private static final SubLSymbol $ALL_TEMPORALLY_COTERMINAL_POS = makeKeyword("ALL-TEMPORALLY-COTERMINAL-POS");

    public static final SubLList $list223 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-COTERMINAL-INVERSE");

    public static final SubLList $list225 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_COTERMINAL_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-COTERMINAL-INVERSE-POS");

    private static final SubLList $list227 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_COTERMINAL = makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL");

    private static final SubLList $list229 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyCoterminal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-COTERMINAL-EXPAND") });

    private static final SubLObject $$contiguousAfter = reader_make_constant_shell(makeString("contiguousAfter"));

    private static final SubLSymbol $REMOVAL_CONTIGUOUS_AFTER = makeKeyword("REMOVAL-CONTIGUOUS-AFTER");

    private static final SubLList $list232 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("contiguousAfter")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("CONTIGUOUS-AFTER?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_CONTIGUOUS_AFTER = makeKeyword("REMOVAL-ALL-CONTIGUOUS-AFTER");

    public static final SubLList $list235 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("contiguousAfter")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_CONTIGUOUS_AFTER_POS = makeKeyword("ALL-CONTIGUOUS-AFTER-POS");

    public static final SubLList $list237 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE = makeKeyword("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE");

    private static final SubLList $list240 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_CONTIGUOUS_AFTER_INVERSE_POS = makeKeyword("ALL-CONTIGUOUS-AFTER-INVERSE-POS");

    public static final SubLList $list242 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_CONTIGUOUS_AFTER = makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER");

    public static final SubLList $list244 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("contiguousAfter")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-CONTIGUOUS-AFTER-EXPAND") });

    private static final SubLObject $$startsDuring = reader_make_constant_shell(makeString("startsDuring"));

    private static final SubLSymbol $REMOVAL_STARTS_DURING = makeKeyword("REMOVAL-STARTS-DURING");

    public static final SubLList $list247 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsDuring")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsDuring")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("STARTS-DURING?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTS_DURING = makeKeyword("REMOVAL-ALL-STARTS-DURING");

    private static final SubLList $list250 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsDuring")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_STARTS_DURING_POS = makeKeyword("ALL-STARTS-DURING-POS");

    private static final SubLList $list252 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTS_DURING_INVERSE = makeKeyword("REMOVAL-ALL-STARTS-DURING-INVERSE");

    private static final SubLList $list255 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startsDuring")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_STARTS_DURING_INVERSE_POS = makeKeyword("ALL-STARTS-DURING-INVERSE-POS");

    private static final SubLList $list257 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_STARTS_DURING = makeKeyword("REMOVAL-NOT-STARTS-DURING");

    private static final SubLList $list259 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTS-DURING-EXPAND") });

    private static final SubLObject $$endsDuring = reader_make_constant_shell(makeString("endsDuring"));

    private static final SubLSymbol $REMOVAL_ENDS_DURING = makeKeyword("REMOVAL-ENDS-DURING");

    private static final SubLList $list262 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsDuring")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsDuring")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("ENDS-DURING?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDS_DURING = makeKeyword("REMOVAL-ALL-ENDS-DURING");

    public static final SubLList $list265 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsDuring")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_ENDS_DURING_POS = makeKeyword("ALL-ENDS-DURING-POS");

    public static final SubLList $list267 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDS_DURING_INVERSE = makeKeyword("REMOVAL-ALL-ENDS-DURING-INVERSE");

    public static final SubLList $list270 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endsDuring")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_ENDS_DURING_INVERSE_POS = makeKeyword("ALL-ENDS-DURING-INVERSE-POS");

    public static final SubLList $list272 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_ENDS_DURING = makeKeyword("REMOVAL-NOT-ENDS-DURING");

    public static final SubLList $list274 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ENDS-DURING-EXPAND") });

    private static final SubLObject $$startingDate = reader_make_constant_shell(makeString("startingDate"));

    private static final SubLSymbol $REMOVAL_STARTING_DATE = makeKeyword("REMOVAL-STARTING-DATE");

    private static final SubLList $list277 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startingDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startingDate")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("STARTING-DATE?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate <TemporalThing> <Date>)") });

    private static final SubLSymbol REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_STARTING_DATE_INVERSE = makeKeyword("REMOVAL-ALL-STARTING-DATE-INVERSE");

    private static final SubLList $list280 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startingDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startingDate")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startingDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startingDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate <not-fully-bound> <Date>)") });

    private static final SubLSymbol $ALL_STARTING_DATE_INVERSE_POS = makeKeyword("ALL-STARTING-DATE-INVERSE-POS");

    private static final SubLList $list282 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startingDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startingDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_STARTING_DATE = makeKeyword("REMOVAL-NOT-STARTING-DATE");

    private static final SubLList $list284 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startingDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTING-DATE-EXPAND") });

    private static final SubLObject $$endingDate = reader_make_constant_shell(makeString("endingDate"));

    private static final SubLSymbol $REMOVAL_ENDING_DATE = makeKeyword("REMOVAL-ENDING-DATE");

    private static final SubLList $list287 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endingDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endingDate")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("ENDING-DATE?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate <TemporalThing> <Date>)") });

    private static final SubLSymbol REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_ENDING_DATE_INVERSE = makeKeyword("REMOVAL-ALL-ENDING-DATE-INVERSE");

    public static final SubLList $list290 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endingDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endingDate")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("endingDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("endingDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate <not-fully-bound> <Date>)") });

    private static final SubLSymbol $ALL_ENDING_DATE_INVERSE_POS = makeKeyword("ALL-ENDING-DATE-INVERSE-POS");

    public static final SubLList $list292 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endingDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endingDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_ENDING_DATE = makeKeyword("REMOVAL-NOT-ENDING-DATE");

    public static final SubLList $list294 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endingDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ENDING-DATE-EXPAND") });

    private static final SubLObject $$birthDate = reader_make_constant_shell(makeString("birthDate"));

    private static final SubLSymbol $REMOVAL_BIRTH_DATE = makeKeyword("REMOVAL-BIRTH-DATE");

    public static final SubLList $list297 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("birthDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("birthDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("birthDate")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("BIRTH-DATE?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$birthDate <TemporalThing> <Date>)") });

    private static final SubLSymbol REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_BIRTH_DATE_INVERSE = makeKeyword("REMOVAL-ALL-BIRTH-DATE-INVERSE");

    private static final SubLList $list300 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("birthDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("birthDate")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("birthDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("birthDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$birthDate <not-fully-bound> <Date>)") });

    private static final SubLSymbol $ALL_BIRTH_DATE_INVERSE_POS = makeKeyword("ALL-BIRTH-DATE-INVERSE-POS");

    private static final SubLList $list302 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("birthDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("birthDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_BIRTH_DATE = makeKeyword("REMOVAL-NOT-BIRTH-DATE");

    private static final SubLList $list304 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("birthDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("birthDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-BIRTH-DATE-EXPAND") });

    private static final SubLObject $$dateOfDeath = reader_make_constant_shell(makeString("dateOfDeath"));

    private static final SubLSymbol $REMOVAL_DATE_OF_DEATH = makeKeyword("REMOVAL-DATE-OF-DEATH");

    private static final SubLList $list307 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfDeath")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dateOfDeath")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("DATE-OF-DEATH?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfDeath <TemporalThing> <Date>)") });

    private static final SubLSymbol REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_DATE_OF_DEATH_INVERSE = makeKeyword("REMOVAL-ALL-DATE-OF-DEATH-INVERSE");

    private static final SubLList $list310 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfDeath <not-fully-bound> <Date>)") });

    private static final SubLSymbol $ALL_DATE_OF_DEATH_INVERSE_POS = makeKeyword("ALL-DATE-OF-DEATH-INVERSE-POS");

    private static final SubLList $list312 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_DATE_OF_DEATH = makeKeyword("REMOVAL-NOT-DATE-OF-DEATH");

    private static final SubLList $list314 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dateOfDeath")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-DATE-OF-DEATH-EXPAND") });

    private static final SubLObject $$temporallyStartedBy = reader_make_constant_shell(makeString("temporallyStartedBy"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_STARTED_BY = makeKeyword("REMOVAL-TEMPORALLY-STARTED-BY");

    public static final SubLList $list317 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-STARTED-BY?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_STARTED_BY = makeKeyword("REMOVAL-ALL-TEMPORALLY-STARTED-BY");

    public static final SubLList $list320 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_STARTED_BY_POS = makeKeyword("ALL-TEMPORALLY-STARTED-BY-POS");

    public static final SubLList $list322 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE");

    public static final SubLList $list325 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_STARTED_BY_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-STARTED-BY-INVERSE-POS");

    public static final SubLList $list327 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_STARTED_BY = makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY");

    public static final SubLList $list329 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyStartedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-STARTED-BY-EXPAND") });

    private static final SubLObject $$temporallyFinishedBy = reader_make_constant_shell(makeString("temporallyFinishedBy"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_FINISHED_BY = makeKeyword("REMOVAL-TEMPORALLY-FINISHED-BY");

    private static final SubLList $list332 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-FINISHED-BY?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_FINISHED_BY = makeKeyword("REMOVAL-ALL-TEMPORALLY-FINISHED-BY");

    private static final SubLList $list335 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_FINISHED_BY_POS = makeKeyword("ALL-TEMPORALLY-FINISHED-BY-POS");

    private static final SubLList $list337 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE");

    private static final SubLList $list340 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-FINISHED-BY-INVERSE-POS");

    private static final SubLList $list342 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_TEMPORALLY_FINISHED_BY = makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY");

    private static final SubLList $list344 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-FINISHED-BY-EXPAND") });

    private static final SubLObject $$overlapsStart = reader_make_constant_shell(makeString("overlapsStart"));

    private static final SubLSymbol $REMOVAL_OVERLAPS_START = makeKeyword("REMOVAL-OVERLAPS-START");

    private static final SubLList $list347 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("overlapsStart")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("OVERLAPS-START?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <TemporalThing> <TemporalThing>)") });

    private static final SubLSymbol REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_OVERLAPS_START = makeKeyword("REMOVAL-ALL-OVERLAPS-START");

    private static final SubLList $list350 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("overlapsStart")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <TemporalThing> <not-fully-bound>)") });

    private static final SubLSymbol $ALL_OVERLAPS_START_POS = makeKeyword("ALL-OVERLAPS-START-POS");

    private static final SubLList $list352 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_ALL_OVERLAPS_START_INVERSE = makeKeyword("REMOVAL-ALL-OVERLAPS-START-INVERSE");

    private static final SubLList $list355 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <not-fully-bound> <TemporalThing>)") });

    private static final SubLSymbol $ALL_OVERLAPS_START_INVERSE_POS = makeKeyword("ALL-OVERLAPS-START-INVERSE-POS");

    private static final SubLList $list357 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_NOT_OVERLAPS_START = makeKeyword("REMOVAL-NOT-OVERLAPS-START");

    private static final SubLList $list359 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("overlapsStart")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-OVERLAPS-START-EXPAND") });

    public static SubLObject removal_all_starts_after_starting_of_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_starting_of(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_starts_after_starting_of_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_starting_of_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_starts_after_starting_of_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.starts_after_starting_ofP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_starts_after_starting_ofP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_starts_after_ending_of_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_ending_of(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_starts_after_ending_of_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_ending_of_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_starts_after_ending_of_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.starts_after_ending_ofP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_starts_after_ending_ofP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_ends_after_starting_of_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_starting_of(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_ends_after_starting_of_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_starting_of_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_ends_after_starting_of_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.ends_after_starting_ofP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_ends_after_starting_ofP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_ends_after_ending_of_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_ending_of(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_ends_after_ending_of_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_ending_of_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_ends_after_ending_of_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.ends_after_ending_ofP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_ends_after_ending_ofP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_subsumes_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_subsumes(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_temporally_subsumes_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_subsumes_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_subsumes_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_subsumesP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_subsumesP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_date_of_event_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_date_of_event_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_date_of_event_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.date_of_eventP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_date_of_eventP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_cotemporal_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_cotemporal(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_cotemporal_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.cotemporalP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$cotemporal, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_cotemporalP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$cotemporal, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_intersects_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_intersects(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_intersects_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_intersectsP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyIntersects, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_intersectsP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyIntersects, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_disjoint_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_disjoint(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_disjoint_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_disjointP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyDisjoint, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_disjointP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyDisjoint, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporal_bounds_contain_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_contain(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_temporal_bounds_contain_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_contain_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporal_bounds_contain_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporal_bounds_containP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporal_bounds_containP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporal_bounds_subsume_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_subsume(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_temporal_bounds_subsume_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_subsume_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporal_bounds_subsume_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporal_bounds_subsumeP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporal_bounds_subsumeP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporal_bounds_identical_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_identical(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporal_bounds_identical_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporal_bounds_identicalP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIdentical, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporal_bounds_identicalP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIdentical, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporal_bounds_intersect_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_intersect(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporal_bounds_intersect_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporal_bounds_intersectP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIntersect, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporal_bounds_intersectP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIntersect, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_cooriginating_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_cooriginating(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_cooriginating_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_cooriginatingP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCooriginating, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_cooriginatingP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCooriginating, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_coterminal_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_coterminal(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_coterminal_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_coterminalP(arg1, arg2, UNPROVIDED))) {
            final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCoterminal, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_coterminalP(arg1, arg2, UNPROVIDED)) {
                final SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCoterminal, list(arg1, arg2)));
                backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_contiguous_after_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_contiguous_after(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_contiguous_after_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_contiguous_after_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_contiguous_after_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.contiguous_afterP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_contiguous_afterP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_starts_during_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_during(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_starts_during_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_during_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_starts_during_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.starts_duringP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_starts_duringP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_ends_during_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_during(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_ends_during_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_during_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_ends_during_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.ends_duringP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_ends_duringP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_starting_date_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starting_date_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_starting_date_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.starting_dateP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_starting_dateP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_ending_date_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ending_date_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_ending_date_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.ending_dateP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_ending_dateP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_birth_date_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_birth_date_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_birth_date_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.birth_dateP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_birth_dateP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_date_of_death_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_date_of_death_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_date_of_death_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.date_of_deathP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_date_of_deathP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_started_by_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_started_by(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_temporally_started_by_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_started_by_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_started_by_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_started_byP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_started_byP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_temporally_finished_by_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_finished_by(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_temporally_finished_by_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_finished_by_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_temporally_finished_by_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.temporally_finished_byP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_temporally_finished_byP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject removal_all_overlaps_start_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_overlaps_start(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_all_overlaps_start_inverse_output_generate(final SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_overlaps_start_inverse(temporal_thing, UNPROVIDED));
    }

    public static SubLObject removal_not_overlaps_start_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        final SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == sbhl_time_modules.overlaps_startP(arg1, arg2, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != sbhl_time_modules.not_overlaps_startP(arg1, arg2, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject declare_removal_modules_sbhl_time_preds_file() {
        declareFunction(me, "removal_all_starts_after_starting_of_output_generate", "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_starts_after_starting_of_inverse_output_generate", "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_starts_after_starting_of_expand", "REMOVAL-NOT-STARTS-AFTER-STARTING-OF-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_starts_after_ending_of_output_generate", "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_starts_after_ending_of_inverse_output_generate", "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_starts_after_ending_of_expand", "REMOVAL-NOT-STARTS-AFTER-ENDING-OF-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_ends_after_starting_of_output_generate", "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_ends_after_starting_of_inverse_output_generate", "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_ends_after_starting_of_expand", "REMOVAL-NOT-ENDS-AFTER-STARTING-OF-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_ends_after_ending_of_output_generate", "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_ends_after_ending_of_inverse_output_generate", "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_ends_after_ending_of_expand", "REMOVAL-NOT-ENDS-AFTER-ENDING-OF-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_subsumes_output_generate", "REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_temporally_subsumes_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_subsumes_expand", "REMOVAL-NOT-TEMPORALLY-SUBSUMES-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_date_of_event_inverse_output_generate", "REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_date_of_event_expand", "REMOVAL-NOT-DATE-OF-EVENT-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_cotemporal_output_generate", "REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_cotemporal_expand", "REMOVAL-NOT-COTEMPORAL-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_intersects_output_generate", "REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_intersects_expand", "REMOVAL-NOT-TEMPORALLY-INTERSECTS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_disjoint_output_generate", "REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_disjoint_expand", "REMOVAL-NOT-TEMPORALLY-DISJOINT-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporal_bounds_contain_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_temporal_bounds_contain_inverse_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporal_bounds_contain_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporal_bounds_subsume_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_temporal_bounds_subsume_inverse_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporal_bounds_subsume_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporal_bounds_identical_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporal_bounds_identical_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporal_bounds_intersect_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporal_bounds_intersect_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_cooriginating_output_generate", "REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_cooriginating_expand", "REMOVAL-NOT-TEMPORALLY-COORIGINATING-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_coterminal_output_generate", "REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_coterminal_expand", "REMOVAL-NOT-TEMPORALLY-COTERMINAL-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_contiguous_after_output_generate", "REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_contiguous_after_inverse_output_generate", "REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_contiguous_after_expand", "REMOVAL-NOT-CONTIGUOUS-AFTER-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_starts_during_output_generate", "REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_starts_during_inverse_output_generate", "REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_starts_during_expand", "REMOVAL-NOT-STARTS-DURING-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_ends_during_output_generate", "REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_ends_during_inverse_output_generate", "REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_ends_during_expand", "REMOVAL-NOT-ENDS-DURING-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_starting_date_inverse_output_generate", "REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_starting_date_expand", "REMOVAL-NOT-STARTING-DATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_ending_date_inverse_output_generate", "REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_ending_date_expand", "REMOVAL-NOT-ENDING-DATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_birth_date_inverse_output_generate", "REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_birth_date_expand", "REMOVAL-NOT-BIRTH-DATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_date_of_death_inverse_output_generate", "REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_date_of_death_expand", "REMOVAL-NOT-DATE-OF-DEATH-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_started_by_output_generate", "REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_temporally_started_by_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_started_by_expand", "REMOVAL-NOT-TEMPORALLY-STARTED-BY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_temporally_finished_by_output_generate", "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_temporally_finished_by_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_temporally_finished_by_expand", "REMOVAL-NOT-TEMPORALLY-FINISHED-BY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_overlaps_start_output_generate", "REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_all_overlaps_start_inverse_output_generate", "REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(me, "removal_not_overlaps_start_expand", "REMOVAL-NOT-OVERLAPS-START-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_sbhl_time_preds_file() {
        deflexical("*SBHL-TIME-GENERIC-MODULES*", $list0);
        defparameter("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-ALL-TEMPORAL-RELATION-COST*", $int$200);
        defparameter("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*", $int$200);
        defparameter("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_sbhl_time_preds_file() {
        inference_modules.inference_removal_module($SBHL_TIME_TOTAL_EXCLUSIVITY_POS, listS($SENSE, new SubLObject[]{ $POS, $ARITY, TWO_INTEGER, $REQUIRED_PATTERN, $list6, $EXCLUSIVE, TRUE, $SUPPLANTS, copy_list($sbhl_time_generic_modules$.getGlobalValue()), $list10 }));
        final SubLObject predicates = $list11;
        final SubLObject removal_modules = $sbhl_time_generic_modules$.getGlobalValue();
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_modules.inference_removal_module_use_generic(pred, $SBHL_TIME_TOTAL_EXCLUSIVITY_POS);
            SubLObject cdolist_list_var_$1 = removal_modules;
            SubLObject module = NIL;
            module = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                inference_modules.inference_removal_module_use_generic(pred, module);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                module = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        inference_modules.register_solely_specific_removal_module_predicate($$startsAfterStartingOf);
        inference_modules.inference_removal_module($REMOVAL_STARTS_AFTER_STARTING_OF, $list15);
        note_funcall_helper_function(REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_STARTING_OF, $list18);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_STARTING_OF_POS, $list20);
        note_funcall_helper_function(REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE, $list23);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS, $list25);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTS_AFTER_STARTING_OF, $list29);
        inference_modules.register_solely_specific_removal_module_predicate($$startsAfterEndingOf);
        inference_modules.inference_removal_module($REMOVAL_STARTS_AFTER_ENDING_OF, $list32);
        note_funcall_helper_function(REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_ENDING_OF, $list35);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_ENDING_OF_POS, $list37);
        note_funcall_helper_function(REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE, $list40);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS, $list42);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTS_AFTER_ENDING_OF, $list44);
        inference_modules.register_solely_specific_removal_module_predicate($$endsAfterStartingOf);
        inference_modules.inference_removal_module($REMOVAL_ENDS_AFTER_STARTING_OF, $list47);
        note_funcall_helper_function(REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_STARTING_OF, $list50);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_STARTING_OF_POS, $list52);
        note_funcall_helper_function(REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE, $list55);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS, $list57);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDS_AFTER_STARTING_OF, $list59);
        inference_modules.register_solely_specific_removal_module_predicate($$endsAfterEndingOf);
        inference_modules.inference_removal_module($REMOVAL_ENDS_AFTER_ENDING_OF, $list62);
        note_funcall_helper_function(REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_ENDING_OF, $list65);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_ENDING_OF_POS, $list67);
        note_funcall_helper_function(REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE, $list70);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS, $list72);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDS_AFTER_ENDING_OF, $list74);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallySubsumes);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES, $list77);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_SUBSUMES, $list80);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_SUBSUMES_POS, $list82);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE, $list85);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_SUBSUMES_INVERSE_POS, $list87);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_SUBSUMES, $list89);
        inference_modules.register_solely_specific_removal_module_predicate($$dateOfEvent);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$dateOfEvent);
        inference_modules.inference_removal_module($REMOVAL_DATE_OF_EVENT, $list92);
        note_funcall_helper_function(REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_DATE_OF_EVENT_INVERSE, $list95);
        preference_modules.inference_preference_module($ALL_DATE_OF_EVENT_INVERSE_POS, $list97);
        inference_modules.inference_removal_module($REMOVAL_NOT_DATE_OF_EVENT, $list99);
        inference_modules.inference_removal_module($REMOVAL_DATE_OF_EVENT_DELAY, $list101);
        inference_modules.register_solely_specific_removal_module_predicate($$cotemporal);
        inference_modules.inference_removal_module($REMOVAL_COTEMPORAL, $list104);
        note_funcall_helper_function(REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_COTEMPORAL, $list107);
        preference_modules.inference_preference_module($ALL_COTEMPORAL_POS, $list109);
        inference_modules.inference_removal_module($REMOVAL_ALL_COTEMPORAL_INVERSE, $list111);
        preference_modules.inference_preference_module($ALL_COTEMPORAL_INVERSE_POS, $list113);
        inference_modules.inference_removal_module($REMOVAL_NOT_COTEMPORAL, $list115);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyIntersects);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_INTERSECTS, $list118);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_INTERSECTS, $list121);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_INTERSECTS_POS, $list123);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE, $list125);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_INTERSECTS_INVERSE_POS, $list127);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_INTERSECTS, $list129);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyDisjoint);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_DISJOINT, $list132);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_DISJOINT, $list135);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_DISJOINT_POS, $list137);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE, $list139);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_DISJOINT_INVERSE_POS, $list141);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_DISJOINT, $list143);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsContain);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_CONTAIN, $list146);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN, $list149);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_CONTAIN_POS, $list151);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE, $list154);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS, $list156);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN, $list158);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsSubsume);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_SUBSUME, $list161);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME, $list164);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_SUBSUME_POS, $list166);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE, $list169);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS, $list171);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME, $list173);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsIdentical);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_IDENTICAL, $list176);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL, $list179);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_IDENTICAL_POS, $list181);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE, $list183);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS, $list185);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL, $list187);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsIntersect);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_INTERSECT, $list190);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT, $list193);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_INTERSECT_POS, $list195);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE, $list197);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS, $list199);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT, $list201);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyCooriginating);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_COORIGINATING, $list204);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COORIGINATING, $list207);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COORIGINATING_POS, $list209);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE, $list211);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COORIGINATING_INVERSE_POS, $list213);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_COORIGINATING, $list215);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyCoterminal);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_COTERMINAL, $list218);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COTERMINAL, $list221);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COTERMINAL_POS, $list223);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE, $list225);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COTERMINAL_INVERSE_POS, $list227);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_COTERMINAL, $list229);
        inference_modules.register_solely_specific_removal_module_predicate($$contiguousAfter);
        inference_modules.inference_removal_module($REMOVAL_CONTIGUOUS_AFTER, $list232);
        note_funcall_helper_function(REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_CONTIGUOUS_AFTER, $list235);
        preference_modules.inference_preference_module($ALL_CONTIGUOUS_AFTER_POS, $list237);
        note_funcall_helper_function(REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE, $list240);
        preference_modules.inference_preference_module($ALL_CONTIGUOUS_AFTER_INVERSE_POS, $list242);
        inference_modules.inference_removal_module($REMOVAL_NOT_CONTIGUOUS_AFTER, $list244);
        inference_modules.register_solely_specific_removal_module_predicate($$startsDuring);
        inference_modules.inference_removal_module($REMOVAL_STARTS_DURING, $list247);
        note_funcall_helper_function(REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_DURING, $list250);
        preference_modules.inference_preference_module($ALL_STARTS_DURING_POS, $list252);
        note_funcall_helper_function(REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_DURING_INVERSE, $list255);
        preference_modules.inference_preference_module($ALL_STARTS_DURING_INVERSE_POS, $list257);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTS_DURING, $list259);
        inference_modules.register_solely_specific_removal_module_predicate($$endsDuring);
        inference_modules.inference_removal_module($REMOVAL_ENDS_DURING, $list262);
        note_funcall_helper_function(REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_DURING, $list265);
        preference_modules.inference_preference_module($ALL_ENDS_DURING_POS, $list267);
        note_funcall_helper_function(REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_DURING_INVERSE, $list270);
        preference_modules.inference_preference_module($ALL_ENDS_DURING_INVERSE_POS, $list272);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDS_DURING, $list274);
        inference_modules.register_solely_specific_removal_module_predicate($$startingDate);
        inference_modules.inference_removal_module($REMOVAL_STARTING_DATE, $list277);
        note_funcall_helper_function(REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTING_DATE_INVERSE, $list280);
        preference_modules.inference_preference_module($ALL_STARTING_DATE_INVERSE_POS, $list282);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTING_DATE, $list284);
        inference_modules.register_solely_specific_removal_module_predicate($$endingDate);
        inference_modules.inference_removal_module($REMOVAL_ENDING_DATE, $list287);
        note_funcall_helper_function(REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDING_DATE_INVERSE, $list290);
        preference_modules.inference_preference_module($ALL_ENDING_DATE_INVERSE_POS, $list292);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDING_DATE, $list294);
        inference_modules.register_solely_specific_removal_module_predicate($$birthDate);
        inference_modules.inference_removal_module($REMOVAL_BIRTH_DATE, $list297);
        note_funcall_helper_function(REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_BIRTH_DATE_INVERSE, $list300);
        preference_modules.inference_preference_module($ALL_BIRTH_DATE_INVERSE_POS, $list302);
        inference_modules.inference_removal_module($REMOVAL_NOT_BIRTH_DATE, $list304);
        inference_modules.register_solely_specific_removal_module_predicate($$dateOfDeath);
        inference_modules.inference_removal_module($REMOVAL_DATE_OF_DEATH, $list307);
        note_funcall_helper_function(REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_DATE_OF_DEATH_INVERSE, $list310);
        preference_modules.inference_preference_module($ALL_DATE_OF_DEATH_INVERSE_POS, $list312);
        inference_modules.inference_removal_module($REMOVAL_NOT_DATE_OF_DEATH, $list314);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyStartedBy);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_STARTED_BY, $list317);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_STARTED_BY, $list320);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_STARTED_BY_POS, $list322);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE, $list325);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_STARTED_BY_INVERSE_POS, $list327);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_STARTED_BY, $list329);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyFinishedBy);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_FINISHED_BY, $list332);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_FINISHED_BY, $list335);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_FINISHED_BY_POS, $list337);
        note_funcall_helper_function(REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE, $list340);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS, $list342);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_FINISHED_BY, $list344);
        inference_modules.register_solely_specific_removal_module_predicate($$overlapsStart);
        inference_modules.inference_removal_module($REMOVAL_OVERLAPS_START, $list347);
        note_funcall_helper_function(REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_OVERLAPS_START, $list350);
        preference_modules.inference_preference_module($ALL_OVERLAPS_START_POS, $list352);
        note_funcall_helper_function(REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_OVERLAPS_START_INVERSE, $list355);
        preference_modules.inference_preference_module($ALL_OVERLAPS_START_INVERSE_POS, $list357);
        inference_modules.inference_removal_module($REMOVAL_NOT_OVERLAPS_START, $list359);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_sbhl_time_preds_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_sbhl_time_preds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_sbhl_time_preds_file();
    }

    
}

/**
 * Total time: 3094 ms
 */
