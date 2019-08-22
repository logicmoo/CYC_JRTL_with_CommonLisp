package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_nearest_isa extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_nearest_isa();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa";

    public static final String myFingerPrint = "9e3f0a3e445d87b0f97e6721a343bfab5ed5e84fece6de986126c7a1325cb89a";

    // defparameter
    private static final SubLSymbol $default_nearest_isa_check_cost$ = makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*");

    // deflexical
    // Average number of nearest #$isa collections for a NAUT.
    private static final SubLSymbol $average_naut_nearest_isa_count$ = makeSymbol("*AVERAGE-NAUT-NEAREST-ISA-COUNT*");

    // deflexical
    private static final SubLSymbol $default_nearest_isa_naut_generate_cost$ = makeSymbol("*DEFAULT-NEAREST-ISA-NAUT-GENERATE-COST*");

    // defparameter
    private static final SubLSymbol $default_nearest_genls_check_cost$ = makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*");

    // deflexical
    // Average number of nearest #$genls collections for a NAUT.
    private static final SubLSymbol $average_naut_nearest_genls_count$ = makeSymbol("*AVERAGE-NAUT-NEAREST-GENLS-COUNT*");

    // deflexical
    private static final SubLSymbol $default_nearest_genls_naut_generate_cost$ = makeSymbol("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*");

    // defparameter
    private static final SubLSymbol $default_nearest_genl_mts_check_cost$ = makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_nearest_genl_preds_check_cost$ = makeSymbol("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_nearest_common_isa_check_cost$ = makeSymbol("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $average_nearest_common_isa_count$ = makeSymbol("*AVERAGE-NEAREST-COMMON-ISA-COUNT*");

    // defparameter
    private static final SubLSymbol $default_nearest_common_genls_check_cost$ = makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $average_nearest_common_genls_count$ = makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*");

    // defparameter
    private static final SubLSymbol $default_nearest_common_specs_check_cost$ = makeSymbol("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $average_nearest_common_specs_count$ = makeSymbol("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*");

    // defparameter
    private static final SubLSymbol $default_nearest_common_genl_mts_check_cost$ = makeSymbol("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $average_nearest_common_genl_mts_count$ = makeSymbol("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*");

    // defparameter
    private static final SubLSymbol $default_nearest_common_spec_mts_check_cost$ = makeSymbol("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $average_nearest_common_spec_mts_count$ = makeSymbol("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*");

    // defparameter
    private static final SubLSymbol $default_nearest_different_isa_check_cost$ = makeSymbol("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_nearest_different_genls_check_cost$ = makeSymbol("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*");

    // defparameter
    public static final SubLSymbol $near_narrow_specs_generality_cutoff$ = makeSymbol("*NEAR-NARROW-SPECS-GENERALITY-CUTOFF*");

    // defparameter
    public static final SubLSymbol $near_narrow_specs_completeness_cutoff$ = makeSymbol("*NEAR-NARROW-SPECS-COMPLETENESS-CUTOFF*");

    private static final SubLObject $$nearestIsa = reader_make_constant_shell(makeString("nearestIsa"));





    private static final SubLList $list3 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym6$_NEARER = makeSymbol("?NEARER");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$differentSymbols = reader_make_constant_shell(makeString("differentSymbols"));

    private static final SubLList $list9 = list(makeSymbol("?NEARER"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$knownSentence = reader_make_constant_shell(makeString("knownSentence"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));



    private static final SubLSymbol $REMOVAL_NEAREST_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-ISA-CHECK");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-ISA-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa #$Canada #$IndependentCountry)\n(#$nearestIsa (#$YearFn 2001) #$CalendarYear)") });

    private static final SubLSymbol $REMOVAL_NEAREST_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-ISA-GENERATE");

    private static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ISA-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestIsa")), list(makeKeyword("BIND"), makeSymbol("OBJECT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ISA"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsa")), list(makeKeyword("VALUE"), makeSymbol("OBJECT")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <fort> <non fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa #$Canada ?WHAT)\n(#$nearestIsa (#$YearFn 2001) ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NEAREST_INSTANCES_GENERATE = makeKeyword("REMOVAL-NEAREST-INSTANCES-GENERATE");

    private static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsa")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-INSTANCES-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-INSTANCES"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsa <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsa ?WHAT #$IndependentCountry)") });

    private static final SubLObject $$nearestGenls = reader_make_constant_shell(makeString("nearestGenls"));



    private static final SubLSymbol $REMOVAL_NEAREST_GENLS_FORT_CHECK = makeKeyword("REMOVAL-NEAREST-GENLS-FORT-CHECK");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls #$Wine #$AlcoholicBeverage)") });

    private static final SubLSymbol $REMOVAL_NEAREST_GENLS_NAUT_CHECK = makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-CHECK");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls (<fort> . <fully-bound>) <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) #$JuvenileAnimal)") });

    private static final SubLSymbol $REMOVAL_NEAREST_GENLS_FORT_GENERATE = makeKeyword("REMOVAL-NEAREST-GENLS-FORT-GENERATE");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENLS-FORT-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenls")), list(makeKeyword("BIND"), makeSymbol("SPEC")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), list(makeKeyword("VALUE"), makeSymbol("SPEC")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <fort> <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls #$Wine ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NEAREST_GENLS_NAUT_GENERATE = makeKeyword("REMOVAL-NEAREST-GENLS-NAUT-GENERATE");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenls")), list(makeKeyword("BIND"), makeSymbol("SPEC")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), list(makeKeyword("VALUE"), makeSymbol("SPEC")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls (<fort> . <fully-bound>) <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls (#$JuvenileFn #$Cougar) ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NEAREST_SPECS_GENERATE = makeKeyword("REMOVAL-NEAREST-SPECS-GENERATE");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPECS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL"))), list(makeKeyword("VALUE"), makeSymbol("GENL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-SPECS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenls")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenls <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenls ?SPEC #$AlcoholicBeverage)") });

    private static final SubLObject $$nearestGenlMt = reader_make_constant_shell(makeString("nearestGenlMt"));

    private static final SubLSymbol $REMOVAL_NEAREST_GENL_MTS_CHECK = makeKeyword("REMOVAL-NEAREST-GENL-MTS-CHECK");

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENL-MT-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLSymbol $REMOVAL_NEAREST_GENL_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-GENL-MTS-GENERATE");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenlMt")), list(makeKeyword("BIND"), makeSymbol("SPEC-MT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENL-MTS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), list(makeKeyword("VALUE"), makeSymbol("SPEC-MT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NEAREST_SPEC_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-SPEC-MTS-GENERATE");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL-MT"))), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-SPEC-MTS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <non-fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt #$PerceptionMt)") });

    public static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-GENL-MTS-GENERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt #$HumanPerceptionMt ?WHAT)") });

    public static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlMt")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-SPEC-MTS-GENERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlMt <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlMt ?SPEC #$PerceptionMt)") });

    private static final SubLObject $$nearestGenlPreds = reader_make_constant_shell(makeString("nearestGenlPreds"));

    private static final SubLSymbol $REMOVAL_NEAREST_GENL_PREDS_CHECK = makeKeyword("REMOVAL-NEAREST-GENL-PREDS-CHECK");

    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-GENL-PREDS-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds #$performedBy #$doneBy)") });

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLSymbol $REMOVAL_NEAREST_GENL_PREDS_GENERATE = makeKeyword("REMOVAL-NEAREST-GENL-PREDS-GENERATE");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENL-PREDS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), list(makeKeyword("BIND"), makeSymbol("OBJECT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENL-PREDS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), list(makeKeyword("VALUE"), makeSymbol("OBJECT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds #$performedBy ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NEAREST_SPEC_PREDS_GENERATE = makeKeyword("REMOVAL-NEAREST-SPEC-PREDS-GENERATE");

    private static final SubLList $list51 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-SPEC-PREDS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("OBJECT"))), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-SPEC-PREDS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlPreds")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("OBJECT"))), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlPreds <whatever> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlPreds ?WHAT #$doneBy)") });

    private static final SubLObject $$nearestCommonIsa = reader_make_constant_shell(makeString("nearestCommonIsa"));

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-ISA-CHECK");

    private static final SubLList $list54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonIsa")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-ISA-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonIsa <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonIsa #$France #$Spain #$IndependentCountry)") });

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-ISA-GENERATE");

    private static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonIsa")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-ISA-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonIsa")), list(makeKeyword("BIND"), makeSymbol("OBJECT1")), list(makeKeyword("BIND"), makeSymbol("OBJECT2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("OBJECT1")), list(makeKeyword("VALUE"), makeSymbol("OBJECT2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-ISA"), list(makeKeyword("VALUE"), makeSymbol("OBJECT1")), list(makeKeyword("VALUE"), makeSymbol("OBJECT2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonIsa")), list(makeKeyword("VALUE"), makeSymbol("OBJECT1")), list(makeKeyword("VALUE"), makeSymbol("OBJECT2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonIsa <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonIsa #$France #$Spain ?WHAT)") });

    private static final SubLObject $$nearestCommonGenls = reader_make_constant_shell(makeString("nearestCommonGenls"));

    private static final SubLList $list58 = list(makeSymbol("COL1"), makeSymbol("COL2"), makeSymbol("COL3"));

    private static final SubLSymbol $sym59$_COL = makeSymbol("?COL");

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));



    private static final SubLSymbol MAKE_NEAREST_COMMON_GENLS_SUPPORT = makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT");

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-CHECK");

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenls")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenls <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenls #$Beer #$Wine #$AlcoholicBeverage)") });

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-GENERATE");

    private static final SubLList $list66 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenls")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonGenls")), list(makeKeyword("BIND"), makeSymbol("COL1")), list(makeKeyword("BIND"), makeSymbol("COL2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("COL1"), makeSymbol("COL2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-GENLS"), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenls")), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenls <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenls #$Beer #$Wine ?WHAT)") });

    private static final SubLObject $$nearestCommonGenlsOfSet = reader_make_constant_shell(makeString("nearestCommonGenlsOfSet"));

    private static final SubLList $list68 = list(makeSymbol("SET"), makeSymbol("GENL"));

    private static final SubLSymbol MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT = makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT");

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK");

    private static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P")), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("COL"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("COL")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK"), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), list(makeKeyword("VALUE"), makeSymbol("SET"))), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlsOfSet <set> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) #$AlcoholicBeverage)") });

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-GENLS-OF-SET-GENERATE");

    private static final SubLList $list73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NEAREST-COMMON-GENLS"), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenlsOfSet")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlsOfSet <set> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlsOfSet (#$TheSet #$Beer #$Wine) ?WHAT)") });

    private static final SubLObject $$nearestCommonSpecs = reader_make_constant_shell(makeString("nearestCommonSpecs"));

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_SPECS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-CHECK");

    private static final SubLList $list76 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonSpecs")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-SPECS-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonSpecs <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal #$AdultMalePerson)") });

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_SPECS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-SPECS-GENERATE");

    private static final SubLList $list78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonSpecs")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonSpecs")), list(makeKeyword("BIND"), makeSymbol("COL1")), list(makeKeyword("BIND"), makeSymbol("COL2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("COL1"), makeSymbol("COL2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-SPECS"), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonSpecs")), list(makeKeyword("VALUE"), makeSymbol("COL1")), list(makeKeyword("VALUE"), makeSymbol("COL2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonSpecs <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecs #$HumanAdult #$MaleAnimal ?WHAT)") });

    private static final SubLObject $$nearestCommonGenlMt = reader_make_constant_shell(makeString("nearestCommonGenlMt"));

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK");

    private static final SubLList $list81 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenlMt")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK-EXPAND"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlMt <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt #$GeneralLexiconMt)") });

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-GENL-MTS-GENERATE");

    private static final SubLList $list83 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonGenlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenlMt")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonGenlMt")), list(makeKeyword("BIND"), makeSymbol("MT1")), list(makeKeyword("BIND"), makeSymbol("MT2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("MT1"), makeSymbol("MT2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-GENL-MTS"), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonGenlMt")), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonGenlMt <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonGenlMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });

    private static final SubLObject $$nearestCommonSpecMt = reader_make_constant_shell(makeString("nearestCommonSpecMt"));

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK = makeKeyword("REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK");

    private static final SubLList $list86 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonSpecMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonSpecMt")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK-EXPAND"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonSpecMt <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecMt #$FrenchLexicalMt #$GermanLexicalMt #$AllLexicalMicrotheoryPSC)") });

    private static final SubLSymbol $REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE = makeKeyword("REMOVAL-NEAREST-COMMON-SPEC-MTS-GENERATE");

    private static final SubLList $list88 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestCommonSpecMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonSpecMt")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestCommonSpecMt")), list(makeKeyword("BIND"), makeSymbol("MT1")), list(makeKeyword("BIND"), makeSymbol("MT2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("MT1"), makeSymbol("MT2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-COMMON-SPEC-MTS"), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestCommonSpecMt")), list(makeKeyword("VALUE"), makeSymbol("MT1")), list(makeKeyword("VALUE"), makeSymbol("MT2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestCommonSpecMt <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestCommonSpecMt #$FrenchLexicalMt #$GermanLexicalMt ?MT)") });

    private static final SubLObject $$nearestDifferentIsa = reader_make_constant_shell(makeString("nearestDifferentIsa"));

    private static final SubLSymbol $REMOVAL_NEAREST_DIFFERENT_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK");

    private static final SubLList $list91 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestDifferentIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestDifferentIsa")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-ISA-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentIsa <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State #$IndependentCountry)") });

    private static final SubLSymbol $REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE");

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestDifferentIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestDifferentIsa")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestDifferentIsa")), list(makeKeyword("BIND"), makeSymbol("OBJ1")), list(makeKeyword("BIND"), makeSymbol("OBJ2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("OBJ1"), makeSymbol("OBJ2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-DIFFERENT-ISA"), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestDifferentIsa")), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentIsa <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentIsa #$Canada #$Minnesota-State ?WHAT)") });

    private static final SubLObject $$nearestDifferentGenls = reader_make_constant_shell(makeString("nearestDifferentGenls"));

    private static final SubLSymbol $REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK = makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK");

    private static final SubLList $list96 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestDifferentGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestDifferentGenls")), makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentGenls <fort> <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentGenls #$Wine #$Milk #$AlcoholicBeverage)") });

    private static final SubLSymbol $REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE = makeKeyword("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE");

    private static final SubLList $list98 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestDifferentGenls")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestDifferentGenls")), makeKeyword("FORT"), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestDifferentGenls")), list(makeKeyword("BIND"), makeSymbol("OBJ1")), list(makeKeyword("BIND"), makeSymbol("OBJ2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("OBJ1"), makeSymbol("OBJ2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-DIFFERENT-GENLS"), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestDifferentGenls")), list(makeKeyword("VALUE"), makeSymbol("OBJ1")), list(makeKeyword("VALUE"), makeSymbol("OBJ2")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearestDifferentGenls <fort> <fort> <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestDifferentGenls #$Wine #$Milk ?WHAT)") });

    private static final SubLObject $$nearestIsaOfType = reader_make_constant_shell(makeString("nearestIsaOfType"));

    private static final SubLSymbol $REMOVAL_NEAREST_ISA_OF_TYPE_CHECK = makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-CHECK");

    private static final SubLList $list101 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestIsaOfType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsaOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-ISA-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestIsaOfType")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("COL"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("TYPE"), makeSymbol("COL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ISA-OF-TYPE-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-OF-TYPE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation #$Writer)") });

    private static final SubLSymbol $REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE = makeKeyword("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE");

    private static final SubLList $list103 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestIsaOfType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsaOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestIsaOfType")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("TYPE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ISAS-OF-TYPE"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestIsaOfType")), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ISA-OF-TYPE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestIsaOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestIsaOfType #$ThomasPynchon #$PersonTypeByOccupation ?WHAT)") });

    private static final SubLObject $$nearestGenlsOfType = reader_make_constant_shell(makeString("nearestGenlsOfType"));

    private static final SubLSymbol $REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK = makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-CHECK");

    public static final SubLList $list106 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlsOfType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlsOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NEAREST-GENLS-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenlsOfType")), list(makeKeyword("BIND"), makeSymbol("SPEC")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("GENL"))), list(list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("GENL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SPEC"), makeSymbol("TYPE"), makeSymbol("GENL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS-OF-TYPE-CHECK"), list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("GENL")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlsOfType #$Wine #$TangibleStuffCompositionType #$AlcoholicBeverage)") });

    private static final SubLSymbol $REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE = makeKeyword("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE");

    public static final SubLList $list108 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestGenlsOfType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlsOfType")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestGenlsOfType")), list(makeKeyword("BIND"), makeSymbol("SPEC")), list(makeKeyword("BIND"), makeSymbol("TYPE")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SPEC"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-GENLS-OF-TYPE"), list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestGenlsOfType")), list(makeKeyword("VALUE"), makeSymbol("SPEC")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestGenlsOfType <fort-or-naut> <fort-or-naut> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestGenlsOfType #$Wine #$PharmacyProductType ?WHAT)") });

    private static final SubLObject $$nearestArgIsa = reader_make_constant_shell(makeString("nearestArgIsa"));

    private static final SubLSymbol $NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS = makeKeyword("NEAREST-ARG-ISA-UNBOUND-RELATION-AND-COLLECTION-POS");

    private static final SubLList $list111 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG3"));

    private static final SubLSymbol $REMOVAL_NEAREST_ARG_ISA_CHECK = makeKeyword("REMOVAL-NEAREST-ARG-ISA-CHECK");

    private static final SubLList $list113 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestArgIsa")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("ARG-ISA"))), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-ISA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM"), makeSymbol("ARG-ISA")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-ISA-CHECK"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-ISA")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <fort> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa #$geographicallySubsumes 1 #$GeographicalThing)") });

    private static final SubLSymbol $REMOVAL_NEAREST_ARG_ISA_GENERATE = makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE");

    private static final SubLList $list115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-ISA-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestArgIsa")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-ISA"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgIsa")), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <fort> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa #$geographicallySubsumes 1 ?WHAT)") });

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));



    private static final SubLSymbol $REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE = makeKeyword("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE");

    public static final SubLList $list119 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("COL"))), list(list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ARG-NUM"), makeSymbol("COL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgIsa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-ISA-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgIsa <not-fully-bound> <integer> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgIsa ?WHAT 1 #$GeographicalThing)") });

    private static final SubLSymbol INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE = makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-DONE");

    private static final SubLSymbol INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT = makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-NEXT");

    private static final SubLSymbol INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE = makeSymbol("INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-FINALIZE");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    public static final SubLList $list124 = list(makeSymbol("PRED-ITERATOR"), makeSymbol("ARG-NUM"), makeSymbol("COL"));

    private static final SubLObject $$nearestArgGenl = reader_make_constant_shell(makeString("nearestArgGenl"));

    private static final SubLSymbol $NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS = makeKeyword("NEAREST-ARG-GENL-UNBOUND-RELATION-AND-COLLECTION-POS");

    private static final SubLList $list127 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1-OR-ARG3"));

    private static final SubLSymbol $REMOVAL_NEAREST_ARG_GENL_CHECK = makeKeyword("REMOVAL-NEAREST-ARG-GENL-CHECK");

    private static final SubLList $list129 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestArgGenl")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("ARG-GENL"))), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-GENL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM"), makeSymbol("ARG-GENL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-GENL-CHECK"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("ARG-GENL")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <fort> <integer> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl #$transportees-Type 1 #$GeographicalThing)") });

    private static final SubLSymbol $REMOVAL_NEAREST_ARG_GENL_GENERATE = makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE");

    private static final SubLList $list131 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-GENL-GENERATE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestArgGenl")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("ARG-NUM")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-GENL"), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgGenl")), list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <fort> <integer> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl #$transportees-Type 1 ?WHAT)") });

    private static final SubLObject $$argGenl = reader_make_constant_shell(makeString("argGenl"));

    private static final SubLSymbol $REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE = makeKeyword("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE");

    private static final SubLList $list134 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG-NUM")), list(makeKeyword("BIND"), makeSymbol("COL"))), list(list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ARG-NUM"), makeSymbol("COL")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearestArgGenl")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARG-NUM")), list(makeKeyword("VALUE"), makeSymbol("COL"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-NEAREST-ARG-GENL-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestArgGenl <not-fully-bound> <integer> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$nearestArgGenl ?WHAT 1 #$GeographicalThing)") });

    private static final SubLSymbol INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE = makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-DONE");

    private static final SubLSymbol INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT = makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-NEXT");

    private static final SubLSymbol INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE = makeSymbol("INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-FINALIZE");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLInteger $int$212 = makeInteger(212);



    private static final SubLObject $$nearNarrowSpecs = reader_make_constant_shell(makeString("nearNarrowSpecs"));

    private static final SubLSymbol $NEAR_NARROW_SPECS_GENERATE_POS = makeKeyword("NEAR-NARROW-SPECS-GENERATE-POS");

    private static final SubLList $list143 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearNarrowSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1"));

    private static final SubLList $list144 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearNarrowSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NEAR-NARROW-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("nearNarrowSpecs")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEAR-NARROW-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("nearNarrowSpecs")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$nearNarrowSpecs <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearNarrowSpecs #$Animal ?WHAT)") });

    private static final SubLSymbol $NEAR_NARROW_SPECS_CHECK_POS = makeKeyword("NEAR-NARROW-SPECS-CHECK-POS");

    private static final SubLList $list146 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearNarrowSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearNarrowSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAR-NARROW-SPECS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearNarrowSpecs <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$nearNarrowSpecs #$Animal #$Dog)") });

    private static final SubLObject $$thresholdSpecs = reader_make_constant_shell(makeString("thresholdSpecs"));

    private static final SubLList $list148 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("thresholdSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1"));

    private static final SubLObject $$includeInThresholdSpecs = reader_make_constant_shell(makeString("includeInThresholdSpecs"));

    private static final SubLObject $$excludeFromThresholdSpecs = reader_make_constant_shell(makeString("excludeFromThresholdSpecs"));

    private static final SubLSymbol $THRESHOLD_SPECS_GENERATE_POS = makeKeyword("THRESHOLD-SPECS-GENERATE-POS");

    private static final SubLList $list152 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("thresholdSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-THRESHOLD-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("thresholdSpecs")), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-THRESHOLD-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("thresholdSpecs")), list(makeKeyword("VALUE"), makeSymbol("COLLECTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$thresholdSpecs <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$thresholdSpecs #$Animal ?WHAT)") });

    private static final SubLSymbol $THRESHOLD_SPECS_CHECK_POS = makeKeyword("THRESHOLD-SPECS-CHECK-POS");

    private static final SubLList $list154 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("thresholdSpecs")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("thresholdSpecs")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-THRESHOLD-SPECS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$thresholdSpecs <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$thresholdSpecs #$Animal #$Dog)") });

    public static SubLObject inference_nearest_isa_check(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nearest_items = inference_nearest_isa(v_term, mt);
        return subl_promotions.memberP(col, nearest_items, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_isa(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.min_isa(v_term, mt, UNPROVIDED);
    }

    public static SubLObject inference_nearest_instances(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nearest_instances = isa.instances(col, mt, UNPROVIDED);
        return nearest_instances;
    }

    public static SubLObject make_nearest_isa_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject isa_support = arguments.make_hl_support($ISA, support_sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(isa_support, more_supports);
    }

    public static SubLObject hl_verify_nearest_isa(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return T;
        }
        final SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        final SubLObject col = literal_arg2(literal, UNPROVIDED);
        return inference_nearest_isa_check(v_term, col, mt);
    }

    public static SubLObject hl_justify_nearest_isa(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return list(support);
        }
        final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject isa_asent = make_binary_formula($$isa, arg1, arg2);
        final SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, arg2), listS($$isa, arg1, $list9), list($$genls, $sym6$_NEARER, arg2)));
        SubLObject code_literal = NIL;
        SubLObject support_$1 = NIL;
        SubLObject code_support = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            literal = cycl_utilities.negate(isa_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            literal = isa_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        support_$1 = arguments.make_hl_support($ISA, literal, mt, tv);
        code_support = arguments.make_hl_support($OPAQUE, code_literal, mt, tv);
        return list(support_$1, code_support);
    }

    public static SubLObject removal_nearest_isa_check(final SubLObject asent) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_isa_check(v_object, collection, UNPROVIDED);
    }

    public static SubLObject removal_nearest_isa_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return add(removal_nearest_isa_generate_cost_via_indexing(asent, UNPROVIDED), NIL != possibly_naut_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)) ? $average_naut_nearest_isa_count$.getGlobalValue() : ZERO_INTEGER);
    }

    public static SubLObject removal_nearest_isa_generate_cost_via_indexing(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$isa);
    }

    public static SubLObject removal_nearest_instances_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return NIL != variables.fully_bound_p(asent) ? $typical_hl_module_check_cost$.getGlobalValue() : kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$isa);
    }

    public static SubLObject inference_nearest_genls_check(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nearest_genls = inference_nearest_genls(spec, mt);
        return subl_promotions.memberP(genl, nearest_genls, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.min_genls(col, mt, UNPROVIDED);
    }

    public static SubLObject inference_nearest_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.max_specs(col, mt, UNPROVIDED);
    }

    public static SubLObject make_nearest_genls_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject genls_support = arguments.make_hl_support($GENLS, support_sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(genls_support, more_supports);
    }

    public static SubLObject hl_verify_nearest_genls(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return T;
        }
        final SubLObject spec = literal_arg1(literal, UNPROVIDED);
        final SubLObject genl = literal_arg2(literal, UNPROVIDED);
        return inference_nearest_genls_check(spec, genl, mt);
    }

    public static SubLObject hl_justify_nearest_genls(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return list(support);
        }
        final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject genls_asent = make_binary_formula($$genls, arg1, arg2);
        final SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, arg2), listS($$genls, arg1, $list9), list($$genls, $sym6$_NEARER, arg2)));
        SubLObject code_literal = NIL;
        SubLObject support_$2 = NIL;
        SubLObject code_support = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            literal = cycl_utilities.negate(genls_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            literal = genls_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        support_$2 = arguments.make_hl_support($GENLS, literal, mt, tv);
        code_support = arguments.make_hl_support($OPAQUE, code_literal, mt, tv);
        return list(support_$2, code_support);
    }

    public static SubLObject removal_nearest_genls_check(final SubLObject asent) {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_genls_check(spec, genl, UNPROVIDED);
    }

    public static SubLObject removal_nearest_genls_fort_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genls);
    }

    public static SubLObject removal_nearest_specs_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genls);
    }

    public static SubLObject inference_nearest_genl_mt_check(final SubLObject spec_mt, final SubLObject genl_mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        final SubLObject all_nearest_genl_mts = inference_nearest_genl_mts(spec_mt, mt_mt);
        return subl_promotions.memberP(genl_mt, all_nearest_genl_mts, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_genl_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return genl_mts.min_genl_mts(mt, mt_mt, UNPROVIDED);
    }

    public static SubLObject inference_nearest_spec_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = NIL;
        }
        return genl_mts.max_spec_mts(mt, mt_mt, UNPROVIDED);
    }

    public static SubLObject removal_nearest_genl_mt_check(final SubLObject asent) {
        final SubLObject spec_mt = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_genl_mt_check(spec_mt, genl_mt, UNPROVIDED);
    }

    public static SubLObject removal_nearest_genl_mts_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genlMt);
    }

    public static SubLObject removal_nearest_spec_mts_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genlMt);
    }

    public static SubLObject removal_nearest_genl_mts_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_genl_mts(spec, UNPROVIDED);
        if (NIL != subl_promotions.memberP(genl, nearest_items, symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_nearest_genl_mts_generate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject nearest_items = cdolist_list_var = inference_nearest_genl_mts(spec, UNPROVIDED);
        SubLObject nearest_item = NIL;
        nearest_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, nearest_item, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nearest_item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_nearest_spec_mts_generate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject nearest_items = cdolist_list_var = inference_nearest_spec_mts(genl, UNPROVIDED);
        SubLObject nearest_item = NIL;
        nearest_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, nearest_item, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject support_formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nearest_item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_nearest_genl_preds_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return add(kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genlPreds), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genlInverse));
    }

    public static SubLObject removal_nearest_genl_preds_check(final SubLObject asent) {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_nearest_genl_preds_check(spec, genl);
    }

    public static SubLObject inference_nearest_genl_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nearest_items = genl_predicates.min_genl_predicates(pred, mt, UNPROVIDED);
        return genl_predicates.min_predicates(nearest_items, mt, UNPROVIDED);
    }

    public static SubLObject inference_nearest_genl_preds_check(final SubLObject spec, final SubLObject genl) {
        final SubLObject nearest_gps = inference_nearest_genl_preds(spec, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_gps, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject removal_nearest_spec_preds_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return add(kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genlPreds), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), TWO_INTEGER, $$genlInverse));
    }

    public static SubLObject inference_nearest_spec_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genl_predicates.max_spec_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject removal_nearest_common_isa_check(final SubLObject asent) {
        final SubLObject object1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject object2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_common_isa(object1, object2, UNPROVIDED);
        return subl_promotions.memberP(collection, nearest_items, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_common_isa(final SubLObject object1, final SubLObject object2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.min_ceiling_isa(list(object1, object2), NIL, mt, UNPROVIDED);
    }

    public static SubLObject make_nearest_common_genls_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(support_sentence, UNPROVIDED);
        SubLObject col1 = NIL;
        SubLObject col2 = NIL;
        SubLObject col3 = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        col1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        col2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        col3 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject genl_sentence1 = make_binary_formula($$genls, col1, col3);
            final SubLObject genl_support1 = arguments.make_hl_support($GENLS, genl_sentence1, support_mt, UNPROVIDED);
            final SubLObject genl_sentence2 = make_binary_formula($$genls, col2, col3);
            final SubLObject genl_support2 = arguments.make_hl_support($GENLS, genl_sentence2, support_mt, UNPROVIDED);
            final SubLObject col_var = $sym59$_COL;
            final SubLObject not_genl_sentences = list(make_binary_formula($$different, col_var, col3), make_binary_formula($$genls, col_var, col3), make_binary_formula($$genls, col1, col_var), make_binary_formula($$genls, col2, col_var));
            final SubLObject unknown_sentence = make_unary_formula($$unknownSentence, make_binary_formula($$thereExists, col_var, simplifier.conjoin(not_genl_sentences, UNPROVIDED)));
            final SubLObject unknown_support = arguments.make_hl_support($CODE, unknown_sentence, support_mt, UNPROVIDED);
            return values(unknown_support, list(genl_support1, genl_support2));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static SubLObject removal_nearest_common_genls_check(final SubLObject asent) {
        final SubLObject col1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject col2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject common_genl = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return subl_promotions.memberP(common_genl, inference_nearest_common_genls(col1, col2, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_nearest_common_genls(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.nearest_common_genls(list(col1, col2), NIL, mt, UNPROVIDED);
    }

    public static SubLObject make_nearest_common_genls_of_set_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(support_sentence, UNPROVIDED);
        SubLObject v_set = NIL;
        SubLObject genl = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        v_set = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        genl = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject specs = el_extensional_set_elements(v_set);
            final SubLObject col_var = $sym59$_COL;
            SubLObject not_genl_sentences = list(make_binary_formula($$genls, col_var, genl), make_binary_formula($$different, col_var, genl));
            SubLObject genl_supports = NIL;
            SubLObject cdolist_list_var = specs;
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject genl_support_sentence = make_binary_formula($$genls, spec, genl);
                genl_supports = cons(arguments.make_hl_support($GENLS, genl_support_sentence, support_mt, UNPROVIDED), genl_supports);
                final SubLObject not_genl_sentence = make_binary_formula($$genls, spec, col_var);
                not_genl_sentences = cons(not_genl_sentence, not_genl_sentences);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            } 
            final SubLObject not_genl_support_sentence = make_unary_formula($$unknownSentence, make_binary_formula($$thereExists, col_var, simplifier.conjoin(not_genl_sentences, UNPROVIDED)));
            final SubLObject not_genl_support = arguments.make_hl_support($CODE, not_genl_support_sentence, support_mt, UNPROVIDED);
            return values(not_genl_support, genl_supports);
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject removal_nearest_common_genls_of_set_check(final SubLObject v_set, final SubLObject col) {
        return list_utilities.member_equalP(col, genls.nearest_common_genls(v_set, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_nearest_common_specs_check(final SubLObject asent) {
        final SubLObject col1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject col2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject common_spec = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return subl_promotions.memberP(common_spec, inference_nearest_common_specs(col1, col2, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_nearest_common_specs(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return genls.nearest_common_specs(list(col1, col2), NIL, mt, UNPROVIDED);
    }

    public static SubLObject removal_nearest_common_genl_mts_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject spec1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject spec2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_common_genl_mts(spec1, spec2, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_items, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_common_genl_mts(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mts.min_ceiling_mts(list(mt1, mt2), NIL, mt_mt);
    }

    public static SubLObject removal_nearest_common_spec_mts_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject genl1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject spec = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_common_spec_mts(genl1, genl2, UNPROVIDED);
        return subl_promotions.memberP(spec, nearest_items, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_common_spec_mts(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return genl_mts.max_floor_mts(list(mt1, mt2), NIL, mt_mt);
    }

    public static SubLObject removal_nearest_different_isa_check(final SubLObject asent) {
        final SubLObject obj = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject not_obj = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_different_isa(obj, not_obj, UNPROVIDED);
        return subl_promotions.memberP(collection, nearest_items, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_different_isa(final SubLObject v_object, final SubLObject not_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_object.equal(not_object)) {
            return NIL;
        }
        final SubLObject include = isa.all_isa(v_object, mt, UNPROVIDED);
        final SubLObject skip = isa.all_isa(not_object, mt, UNPROVIDED);
        final SubLObject different = set_difference(include, skip, symbol_function(EQUAL), UNPROVIDED);
        if (NIL == different) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(different)) {
            return different;
        }
        final SubLObject nearest = genls.min_cols(different, mt, UNPROVIDED);
        return nearest;
    }

    public static SubLObject removal_nearest_different_isa_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$isa);
    }

    public static SubLObject removal_nearest_different_genls_check(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject col = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject not_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject nearest_items = inference_nearest_different_genls(col, not_col, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_items, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_different_genls(final SubLObject collection, final SubLObject not_collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (collection.equal(not_collection)) {
            return NIL;
        }
        final SubLObject include = genls.all_genls(collection, mt, UNPROVIDED);
        final SubLObject skip = cons(collection, genls.all_genls(not_collection, mt, UNPROVIDED));
        final SubLObject different = set_difference(include, skip, symbol_function(EQUAL), UNPROVIDED);
        if (NIL == different) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(different)) {
            return different;
        }
        final SubLObject nearest = genls.min_cols(different, mt, UNPROVIDED);
        return nearest;
    }

    public static SubLObject removal_nearest_different_genls_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$genls);
    }

    public static SubLObject inference_nearest_isa_of_type_check(final SubLObject v_term, final SubLObject type, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nearest_isas_of_type = inference_nearest_isas_of_type(v_term, type, mt);
        return subl_promotions.memberP(col, nearest_isas_of_type, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_isas_of_type(final SubLObject v_term, final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.min_isas_of_type(v_term, type, mt, UNPROVIDED);
    }

    public static SubLObject make_nearest_isa_of_type_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject isa_support = arguments.make_hl_support($ISA, support_sentence, support_mt, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(isa_support, more_supports);
    }

    public static SubLObject hl_verify_nearest_isa_of_type(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return T;
        }
        final SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        final SubLObject type = literal_arg2(literal, UNPROVIDED);
        final SubLObject col = literal_arg3(literal, UNPROVIDED);
        return inference_nearest_isa_of_type_check(v_term, type, col, mt);
    }

    public static SubLObject hl_justify_nearest_isa_of_type(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $ISA) {
            return list(support);
        }
        final SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        final SubLObject type = literal_arg2(literal, UNPROVIDED);
        final SubLObject col = literal_arg3(literal, UNPROVIDED);
        final SubLObject col_asent = make_binary_formula($$isa, v_term, col);
        final SubLObject type_asent = make_binary_formula($$isa, col, type);
        final SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, col), listS($$isa, v_term, $list9), list($$genls, $sym6$_NEARER, col), list($$isa, $sym6$_NEARER, type)));
        SubLObject col_literal = NIL;
        SubLObject type_literal = NIL;
        SubLObject code_literal = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            col_literal = cycl_utilities.negate(col_asent);
            type_literal = cycl_utilities.negate(type_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            col_literal = col_asent;
            type_literal = type_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        final SubLObject col_support = arguments.make_hl_support($ISA, col_literal, mt, tv);
        final SubLObject type_support = arguments.make_hl_support($ISA, type_literal, mt, tv);
        final SubLObject code_support = arguments.make_hl_support($CODE, code_literal, mt, tv);
        return list(col_support, type_support, code_support);
    }

    public static SubLObject removal_nearest_isa_of_type_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return NIL != forts.fort_p(v_term) ? removal_nearest_isa_generate_cost_via_indexing(asent, sense) : $default_nearest_isa_naut_generate_cost$.getGlobalValue();
    }

    public static SubLObject inference_nearest_genls_of_type_check(final SubLObject spec, final SubLObject type, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nearest_genls_of_type = inference_nearest_genls_of_type(spec, type, mt, UNPROVIDED);
        return subl_promotions.memberP(genl, nearest_genls_of_type, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject inference_nearest_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject all_genls = remove(col, genls.all_genls(col, mt, tv), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return genls.min_cols(genls_of_type, mt, tv);
    }

    public static SubLObject make_nearest_genls_of_type_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject genls_support = arguments.make_hl_support($GENLS, support_sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(genls_support, more_supports);
    }

    public static SubLObject hl_verify_nearest_genls_of_type(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return T;
        }
        final SubLObject spec = literal_arg1(literal, UNPROVIDED);
        final SubLObject type = literal_arg2(literal, UNPROVIDED);
        final SubLObject genl = literal_arg3(literal, UNPROVIDED);
        return inference_nearest_genls_of_type_check(spec, type, genl, mt);
    }

    public static SubLObject hl_justify_nearest_genls_of_type(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list3);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list3);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list3);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list3);
            return NIL;
        }
        if (hl_module != $GENLS) {
            return list(support);
        }
        final SubLObject spec = literal_arg1(literal, UNPROVIDED);
        final SubLObject type = literal_arg2(literal, UNPROVIDED);
        final SubLObject genl = literal_arg3(literal, UNPROVIDED);
        final SubLObject genls_asent = make_binary_formula($$genls, spec, genl);
        final SubLObject isa_asent = make_binary_formula($$isa, genl, type);
        final SubLObject thereexists_literal = list($$thereExists, $sym6$_NEARER, list($$and, list($$differentSymbols, $sym6$_NEARER, genl), listS($$genls, spec, $list9), list($$genls, $sym6$_NEARER, genl), list($$isa, $sym6$_NEARER, type)));
        SubLObject genls_literal = NIL;
        SubLObject isa_literal = NIL;
        SubLObject code_literal = NIL;
        if (NIL != cycl_utilities.negatedP(literal)) {
            genls_literal = cycl_utilities.negate(genls_asent);
            isa_literal = cycl_utilities.negate(isa_asent);
            code_literal = list($$knownSentence, thereexists_literal);
        } else {
            genls_literal = genls_asent;
            isa_literal = isa_asent;
            code_literal = list($$unknownSentence, thereexists_literal);
        }
        final SubLObject genls_support = arguments.make_hl_support($GENLS, genls_literal, mt, tv);
        final SubLObject isa_support = arguments.make_hl_support($ISA, isa_literal, mt, tv);
        final SubLObject code_support = arguments.make_hl_support($CODE, code_literal, mt, tv);
        return list(genls_support, isa_support, code_support);
    }

    public static SubLObject removal_nearest_genls_of_type_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return NIL != forts.fort_p(spec) ? removal_nearest_genls_fort_generate_cost(asent, sense) : $default_nearest_genls_naut_generate_cost$.getGlobalValue();
    }

    public static SubLObject inference_nearest_arg_isa_check(final SubLObject relation, final SubLObject arg_num, final SubLObject arg_isa) {
        return subl_promotions.memberP(arg_isa, kb_accessors.min_argn_isa(relation, arg_num, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject removal_nearest_arg_isa_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject relation = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        final SubLObject pred_var = $$argIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$3 = NIL;
                        final SubLObject token_var_$4 = NIL;
                        while (NIL == done_var_$3) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                            if (((NIL != valid_$5) && (NIL != assertions_high.gaf_assertionP(assertion))) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = add(count, ONE_INTEGER);
                            }
                            done_var_$3 = makeBoolean(NIL == valid_$5);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return max(count, ONE_INTEGER);
    }

    public static SubLObject inference_nearest_arg_isa(final SubLObject relation, final SubLObject arg_num) {
        return iteration.new_list_iterator(kb_accessors.min_argn_isa(relation, arg_num, UNPROVIDED));
    }

    public static SubLObject make_nearest_arg_isa_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        return values(arguments.make_hl_support($OPAQUE, support_sentence, support_mt, UNPROVIDED), NIL);
    }

    public static SubLObject removal_nearest_arg_isa_generate_reverse_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject col = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        final SubLObject pred_var = $$argIsa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, THREE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$6 = NIL;
                        final SubLObject token_var_$7 = NIL;
                        while (NIL == done_var_$6) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion));
                            if (((NIL != valid_$8) && (NIL != assertions_high.gaf_assertionP(assertion))) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = add(count, ONE_INTEGER);
                            }
                            done_var_$6 = makeBoolean(NIL == valid_$8);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return count;
    }

    public static SubLObject inference_nearest_arg_isa_reverse(final SubLObject arg_num, final SubLObject col) {
        return new_inference_nearest_arg_isa_reverse_iterator(arg_num, col);
    }

    public static SubLObject new_inference_nearest_arg_isa_reverse_iterator(final SubLObject arg_num, final SubLObject col) {
        return iteration.new_iterator(inference_nearest_arg_isa_reverse_iterator_state(arg_num, col), INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_DONE, INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_NEXT, INFERENCE_NEAREST_ARG_ISA_REVERSE_ITERATOR_FINALIZE);
    }

    public static SubLObject inference_nearest_arg_isa_reverse_iterator_state(final SubLObject arg_num, final SubLObject col) {
        return list(iteration.new_list_iterator(isa.all_fort_instances($$Relation, UNPROVIDED, UNPROVIDED)), arg_num, col);
    }

    public static SubLObject inference_nearest_arg_isa_reverse_iterator_done(final SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(pred_iterator);
        }
        cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    public static SubLObject inference_nearest_arg_isa_reverse_iterator_next(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject invalidP = NIL;
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            while ((NIL == result) && (NIL == invalidP)) {
                final SubLObject pred = iteration.iteration_next(pred_iterator);
                if (NIL != pred) {
                    if (NIL == subl_promotions.memberP(col, kb_accessors.min_argn_isa(pred, arg_num, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        continue;
                    }
                    result = pred;
                } else {
                    invalidP = T;
                }
            } 
        } else {
            cdestructuring_bind_error(state, $list124);
        }
        return values(result, state, invalidP);
    }

    public static SubLObject inference_nearest_arg_isa_reverse_iterator_finalize(final SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(pred_iterator);
        }
        cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    public static SubLObject inference_nearest_arg_genl_check(final SubLObject relation, final SubLObject arg_num, final SubLObject arg_genl) {
        return subl_promotions.memberP(arg_genl, kb_accessors.min_argn_genl(relation, arg_num, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject removal_nearest_arg_genl_generate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject relation = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        final SubLObject pred_var = $$argGenl;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$9 = NIL;
                        final SubLObject token_var_$10 = NIL;
                        while (NIL == done_var_$9) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                            if (((NIL != valid_$11) && (NIL != assertions_high.gaf_assertionP(assertion))) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = add(count, ONE_INTEGER);
                            }
                            done_var_$9 = makeBoolean(NIL == valid_$11);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return max(count, ONE_INTEGER);
    }

    public static SubLObject inference_nearest_arg_genl(final SubLObject relation, final SubLObject arg_num) {
        return iteration.new_list_iterator(kb_accessors.min_argn_genl(relation, arg_num, UNPROVIDED));
    }

    public static SubLObject make_nearest_arg_genl_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        return values(arguments.make_hl_support($OPAQUE, support_sentence, support_mt, UNPROVIDED), NIL);
    }

    public static SubLObject removal_nearest_arg_genl_generate_reverse_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg_num = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject col = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        final SubLObject pred_var = $$argGenl;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, THREE_INTEGER, pred_var);
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
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                            final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(assertion));
                            if (((NIL != valid_$14) && (NIL != assertions_high.gaf_assertionP(assertion))) && arg_num.eql(assertions_high.gaf_arg2(assertion))) {
                                count = add(count, ONE_INTEGER);
                            }
                            done_var_$12 = makeBoolean(NIL == valid_$14);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return count;
    }

    public static SubLObject inference_nearest_arg_genl_reverse(final SubLObject arg_num, final SubLObject col) {
        return new_inference_nearest_arg_genl_reverse_iterator(arg_num, col);
    }

    public static SubLObject new_inference_nearest_arg_genl_reverse_iterator(final SubLObject arg_num, final SubLObject col) {
        return iteration.new_iterator(inference_nearest_arg_genl_reverse_iterator_state(arg_num, col), INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_DONE, INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_NEXT, INFERENCE_NEAREST_ARG_GENL_REVERSE_ITERATOR_FINALIZE);
    }

    public static SubLObject inference_nearest_arg_genl_reverse_iterator_state(final SubLObject arg_num, final SubLObject col) {
        return list(iteration.new_list_iterator(isa.all_fort_instances($$Relation, UNPROVIDED, UNPROVIDED)), arg_num, col);
    }

    public static SubLObject inference_nearest_arg_genl_reverse_iterator_done(final SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(pred_iterator);
        }
        cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    public static SubLObject inference_nearest_arg_genl_reverse_iterator_next(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject invalidP = NIL;
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            while ((NIL == result) && (NIL == invalidP)) {
                final SubLObject pred = iteration.iteration_next(pred_iterator);
                if (NIL != pred) {
                    if (NIL == subl_promotions.memberP(col, kb_accessors.min_argn_genl(pred, arg_num, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        continue;
                    }
                    result = pred;
                } else {
                    invalidP = T;
                }
            } 
        } else {
            cdestructuring_bind_error(state, $list124);
        }
        return values(result, state, invalidP);
    }

    public static SubLObject inference_nearest_arg_genl_reverse_iterator_finalize(final SubLObject state) {
        SubLObject pred_iterator = NIL;
        SubLObject arg_num = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(state, state, $list124);
        pred_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list124);
        arg_num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list124);
        col = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(pred_iterator);
        }
        cdestructuring_bind_error(state, $list124);
        return NIL;
    }

    public static SubLObject near_narrow_specs(final SubLObject v_term, SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = $near_narrow_specs_completeness_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numberp(cutoff) : "Types.numberp(cutoff) " + "CommonSymbols.NIL != Types.numberp(cutoff) " + cutoff;
        if (NIL == fort_types_interface.collection_p(v_term)) {
            return NIL;
        }
        if (cutoff.numL(ONE_INTEGER)) {
            return NIL;
        }
        if (cutoff.numL(TWO_INTEGER)) {
            return list(v_term);
        }
        if (cardinality_estimates.generality_estimate(v_term).numG($near_narrow_specs_generality_cutoff$.getDynamicValue(thread))) {
            return NIL;
        }
        if (cardinality_estimates.generality_estimate(v_term).numL(cutoff)) {
            return genls.all_specs(v_term, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == genls.asserted_specs(v_term, UNPROVIDED)) {
            return list(v_term);
        }
        final SubLObject recurse_cutoff = multiply(TWO_INTEGER, divide(cutoff, length(genls.max_specs(v_term, UNPROVIDED, UNPROVIDED))));
        SubLObject result = NIL;
        if (NIL == member(v_term, result, symbol_function(EQL), symbol_function(IDENTITY))) {
            result = cons(v_term, result);
        }
        SubLObject cdolist_list_var = genls.max_specs(v_term, UNPROVIDED, UNPROVIDED);
        SubLObject max_specs = NIL;
        max_specs = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = near_narrow_specs(max_specs, recurse_cutoff);
            SubLObject near_narrow_spec = NIL;
            near_narrow_spec = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                final SubLObject item_var = near_narrow_spec;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                near_narrow_spec = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            max_specs = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject removal_near_narrow_specs_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
    }

    public static SubLObject removal_near_narrow_specs_iterator(final SubLObject collection) {
        return iteration.new_list_iterator(near_narrow_specs(collection, UNPROVIDED));
    }

    public static SubLObject removal_near_narrow_specs_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject genl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != subl_promotions.memberP(spec, near_narrow_specs(genl, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_threshold_specs_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
    }

    public static SubLObject collection_below_specs_threshholdP(final SubLObject collection) {
        final SubLObject include_cols = kb_mapping_utilities.pred_refs($$includeInThresholdSpecs, ONE_INTEGER, UNPROVIDED);
        final SubLObject exclude_cols = kb_mapping_utilities.pred_refs($$excludeFromThresholdSpecs, ONE_INTEGER, UNPROVIDED);
        if (NIL != subl_promotions.memberP(collection, include_cols, symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        if (NIL != subl_promotions.memberP(collection, exclude_cols, symbol_function(EQUAL), UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != genls.any_genlP(collection, include_cols, UNPROVIDED, UNPROVIDED)) || (NIL == genls.any_specP(collection, exclude_cols, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject removal_threshold_specs_iterator(final SubLObject collection) {
        if (NIL != collection_below_specs_threshholdP(collection)) {
            return iteration.new_list_iterator(removal_modules_genls.inference_all_specs(collection, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject removal_threshold_specs_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject genl = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject spec = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != collection_below_specs_threshholdP(genl)) && (NIL != genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_nearest_isa_file() {
        declareFunction(me, "inference_nearest_isa_check", "INFERENCE-NEAREST-ISA-CHECK", 2, 1, false);
        declareFunction(me, "inference_nearest_isa", "INFERENCE-NEAREST-ISA", 1, 1, false);
        declareFunction(me, "inference_nearest_instances", "INFERENCE-NEAREST-INSTANCES", 1, 1, false);
        declareFunction(me, "make_nearest_isa_support", "MAKE-NEAREST-ISA-SUPPORT", 1, 1, false);
        declareFunction(me, "hl_verify_nearest_isa", "HL-VERIFY-NEAREST-ISA", 1, 0, false);
        declareFunction(me, "hl_justify_nearest_isa", "HL-JUSTIFY-NEAREST-ISA", 1, 0, false);
        declareFunction(me, "removal_nearest_isa_check", "REMOVAL-NEAREST-ISA-CHECK", 1, 0, false);
        declareFunction(me, "removal_nearest_isa_generate_cost", "REMOVAL-NEAREST-ISA-GENERATE-COST", 1, 1, false);
        declareFunction(me, "removal_nearest_isa_generate_cost_via_indexing", "REMOVAL-NEAREST-ISA-GENERATE-COST-VIA-INDEXING", 1, 1, false);
        declareFunction(me, "removal_nearest_instances_generate_cost", "REMOVAL-NEAREST-INSTANCES-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_genls_check", "INFERENCE-NEAREST-GENLS-CHECK", 2, 1, false);
        declareFunction(me, "inference_nearest_genls", "INFERENCE-NEAREST-GENLS", 1, 1, false);
        declareFunction(me, "inference_nearest_specs", "INFERENCE-NEAREST-SPECS", 1, 1, false);
        declareFunction(me, "make_nearest_genls_support", "MAKE-NEAREST-GENLS-SUPPORT", 1, 1, false);
        declareFunction(me, "hl_verify_nearest_genls", "HL-VERIFY-NEAREST-GENLS", 1, 0, false);
        declareFunction(me, "hl_justify_nearest_genls", "HL-JUSTIFY-NEAREST-GENLS", 1, 0, false);
        declareFunction(me, "removal_nearest_genls_check", "REMOVAL-NEAREST-GENLS-CHECK", 1, 0, false);
        declareFunction(me, "removal_nearest_genls_fort_generate_cost", "REMOVAL-NEAREST-GENLS-FORT-GENERATE-COST", 1, 1, false);
        declareFunction(me, "removal_nearest_specs_generate_cost", "REMOVAL-NEAREST-SPECS-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_genl_mt_check", "INFERENCE-NEAREST-GENL-MT-CHECK", 2, 1, false);
        declareFunction(me, "inference_nearest_genl_mts", "INFERENCE-NEAREST-GENL-MTS", 1, 1, false);
        declareFunction(me, "inference_nearest_spec_mts", "INFERENCE-NEAREST-SPEC-MTS", 1, 1, false);
        declareFunction(me, "removal_nearest_genl_mt_check", "REMOVAL-NEAREST-GENL-MT-CHECK", 1, 0, false);
        declareFunction(me, "removal_nearest_genl_mts_generate_cost", "REMOVAL-NEAREST-GENL-MTS-GENERATE-COST", 1, 1, false);
        declareFunction(me, "removal_nearest_spec_mts_generate_cost", "REMOVAL-NEAREST-SPEC-MTS-GENERATE-COST", 1, 1, false);
        declareFunction(me, "removal_nearest_genl_mts_check_expand", "REMOVAL-NEAREST-GENL-MTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nearest_genl_mts_generate_expand", "REMOVAL-NEAREST-GENL-MTS-GENERATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nearest_spec_mts_generate_expand", "REMOVAL-NEAREST-SPEC-MTS-GENERATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nearest_genl_preds_generate_cost", "REMOVAL-NEAREST-GENL-PREDS-GENERATE-COST", 1, 1, false);
        declareFunction(me, "removal_nearest_genl_preds_check", "REMOVAL-NEAREST-GENL-PREDS-CHECK", 1, 0, false);
        declareFunction(me, "inference_nearest_genl_preds", "INFERENCE-NEAREST-GENL-PREDS", 1, 1, false);
        declareFunction(me, "inference_nearest_genl_preds_check", "INFERENCE-NEAREST-GENL-PREDS-CHECK", 2, 0, false);
        declareFunction(me, "removal_nearest_spec_preds_generate_cost", "REMOVAL-NEAREST-SPEC-PREDS-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_spec_preds", "INFERENCE-NEAREST-SPEC-PREDS", 1, 1, false);
        declareFunction(me, "removal_nearest_common_isa_check", "REMOVAL-NEAREST-COMMON-ISA-CHECK", 1, 0, false);
        declareFunction(me, "inference_nearest_common_isa", "INFERENCE-NEAREST-COMMON-ISA", 2, 1, false);
        declareFunction(me, "make_nearest_common_genls_support", "MAKE-NEAREST-COMMON-GENLS-SUPPORT", 1, 1, false);
        declareFunction(me, "removal_nearest_common_genls_check", "REMOVAL-NEAREST-COMMON-GENLS-CHECK", 1, 0, false);
        declareFunction(me, "inference_nearest_common_genls", "INFERENCE-NEAREST-COMMON-GENLS", 2, 1, false);
        declareFunction(me, "make_nearest_common_genls_of_set_support", "MAKE-NEAREST-COMMON-GENLS-OF-SET-SUPPORT", 1, 1, false);
        declareFunction(me, "removal_nearest_common_genls_of_set_check", "REMOVAL-NEAREST-COMMON-GENLS-OF-SET-CHECK", 2, 0, false);
        declareFunction(me, "removal_nearest_common_specs_check", "REMOVAL-NEAREST-COMMON-SPECS-CHECK", 1, 0, false);
        declareFunction(me, "inference_nearest_common_specs", "INFERENCE-NEAREST-COMMON-SPECS", 2, 1, false);
        declareFunction(me, "removal_nearest_common_genl_mts_check_expand", "REMOVAL-NEAREST-COMMON-GENL-MTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "inference_nearest_common_genl_mts", "INFERENCE-NEAREST-COMMON-GENL-MTS", 2, 1, false);
        declareFunction(me, "removal_nearest_common_spec_mts_check_expand", "REMOVAL-NEAREST-COMMON-SPEC-MTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "inference_nearest_common_spec_mts", "INFERENCE-NEAREST-COMMON-SPEC-MTS", 2, 1, false);
        declareFunction(me, "removal_nearest_different_isa_check", "REMOVAL-NEAREST-DIFFERENT-ISA-CHECK", 1, 0, false);
        declareFunction(me, "inference_nearest_different_isa", "INFERENCE-NEAREST-DIFFERENT-ISA", 2, 1, false);
        declareFunction(me, "removal_nearest_different_isa_generate_cost", "REMOVAL-NEAREST-DIFFERENT-ISA-GENERATE-COST", 1, 1, false);
        declareFunction(me, "removal_nearest_different_genls_check", "REMOVAL-NEAREST-DIFFERENT-GENLS-CHECK", 1, 1, false);
        declareFunction(me, "inference_nearest_different_genls", "INFERENCE-NEAREST-DIFFERENT-GENLS", 2, 1, false);
        declareFunction(me, "removal_nearest_different_genls_generate_cost", "REMOVAL-NEAREST-DIFFERENT-GENLS-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_isa_of_type_check", "INFERENCE-NEAREST-ISA-OF-TYPE-CHECK", 3, 1, false);
        declareFunction(me, "inference_nearest_isas_of_type", "INFERENCE-NEAREST-ISAS-OF-TYPE", 2, 1, false);
        declareFunction(me, "make_nearest_isa_of_type_support", "MAKE-NEAREST-ISA-OF-TYPE-SUPPORT", 1, 1, false);
        declareFunction(me, "hl_verify_nearest_isa_of_type", "HL-VERIFY-NEAREST-ISA-OF-TYPE", 1, 0, false);
        declareFunction(me, "hl_justify_nearest_isa_of_type", "HL-JUSTIFY-NEAREST-ISA-OF-TYPE", 1, 0, false);
        declareFunction(me, "removal_nearest_isa_of_type_generate_cost", "REMOVAL-NEAREST-ISA-OF-TYPE-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_genls_of_type_check", "INFERENCE-NEAREST-GENLS-OF-TYPE-CHECK", 3, 1, false);
        declareFunction(me, "inference_nearest_genls_of_type", "INFERENCE-NEAREST-GENLS-OF-TYPE", 2, 2, false);
        declareFunction(me, "make_nearest_genls_of_type_support", "MAKE-NEAREST-GENLS-OF-TYPE-SUPPORT", 1, 1, false);
        declareFunction(me, "hl_verify_nearest_genls_of_type", "HL-VERIFY-NEAREST-GENLS-OF-TYPE", 1, 0, false);
        declareFunction(me, "hl_justify_nearest_genls_of_type", "HL-JUSTIFY-NEAREST-GENLS-OF-TYPE", 1, 0, false);
        declareFunction(me, "removal_nearest_genls_of_type_generate_cost", "REMOVAL-NEAREST-GENLS-OF-TYPE-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_arg_isa_check", "INFERENCE-NEAREST-ARG-ISA-CHECK", 3, 0, false);
        declareFunction(me, "removal_nearest_arg_isa_generate_cost", "REMOVAL-NEAREST-ARG-ISA-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_arg_isa", "INFERENCE-NEAREST-ARG-ISA", 2, 0, false);
        declareFunction(me, "make_nearest_arg_isa_support", "MAKE-NEAREST-ARG-ISA-SUPPORT", 1, 1, false);
        declareFunction(me, "removal_nearest_arg_isa_generate_reverse_cost", "REMOVAL-NEAREST-ARG-ISA-GENERATE-REVERSE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_arg_isa_reverse", "INFERENCE-NEAREST-ARG-ISA-REVERSE", 2, 0, false);
        declareFunction(me, "new_inference_nearest_arg_isa_reverse_iterator", "NEW-INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR", 2, 0, false);
        declareFunction(me, "inference_nearest_arg_isa_reverse_iterator_state", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "inference_nearest_arg_isa_reverse_iterator_done", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "inference_nearest_arg_isa_reverse_iterator_next", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "inference_nearest_arg_isa_reverse_iterator_finalize", "INFERENCE-NEAREST-ARG-ISA-REVERSE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "inference_nearest_arg_genl_check", "INFERENCE-NEAREST-ARG-GENL-CHECK", 3, 0, false);
        declareFunction(me, "removal_nearest_arg_genl_generate_cost", "REMOVAL-NEAREST-ARG-GENL-GENERATE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_arg_genl", "INFERENCE-NEAREST-ARG-GENL", 2, 0, false);
        declareFunction(me, "make_nearest_arg_genl_support", "MAKE-NEAREST-ARG-GENL-SUPPORT", 1, 1, false);
        declareFunction(me, "removal_nearest_arg_genl_generate_reverse_cost", "REMOVAL-NEAREST-ARG-GENL-GENERATE-REVERSE-COST", 1, 1, false);
        declareFunction(me, "inference_nearest_arg_genl_reverse", "INFERENCE-NEAREST-ARG-GENL-REVERSE", 2, 0, false);
        declareFunction(me, "new_inference_nearest_arg_genl_reverse_iterator", "NEW-INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR", 2, 0, false);
        declareFunction(me, "inference_nearest_arg_genl_reverse_iterator_state", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "inference_nearest_arg_genl_reverse_iterator_done", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "inference_nearest_arg_genl_reverse_iterator_next", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "inference_nearest_arg_genl_reverse_iterator_finalize", "INFERENCE-NEAREST-ARG-GENL-REVERSE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "near_narrow_specs", "NEAR-NARROW-SPECS", 1, 1, false);
        declareFunction(me, "removal_near_narrow_specs_cost", "REMOVAL-NEAR-NARROW-SPECS-COST", 1, 1, false);
        declareFunction(me, "removal_near_narrow_specs_iterator", "REMOVAL-NEAR-NARROW-SPECS-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_near_narrow_specs_check_pos_expand", "REMOVAL-NEAR-NARROW-SPECS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_threshold_specs_cost", "REMOVAL-THRESHOLD-SPECS-COST", 1, 1, false);
        declareFunction(me, "collection_below_specs_threshholdP", "COLLECTION-BELOW-SPECS-THRESHHOLD?", 1, 0, false);
        declareFunction(me, "removal_threshold_specs_iterator", "REMOVAL-THRESHOLD-SPECS-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_threshold_specs_check_pos_expand", "REMOVAL-THRESHOLD-SPECS-CHECK-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_nearest_isa_file() {
        defparameter("*DEFAULT-NEAREST-ISA-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*AVERAGE-NAUT-NEAREST-ISA-COUNT*", ONE_INTEGER);
        deflexical("*DEFAULT-NEAREST-ISA-NAUT-GENERATE-COST*", $average_naut_nearest_isa_count$.getGlobalValue());
        defparameter("*DEFAULT-NEAREST-GENLS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*AVERAGE-NAUT-NEAREST-GENLS-COUNT*", ONE_INTEGER);
        deflexical("*DEFAULT-NEAREST-GENLS-NAUT-GENERATE-COST*", $average_naut_nearest_genls_count$.getGlobalValue());
        defparameter("*DEFAULT-NEAREST-GENL-MTS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NEAREST-GENL-PREDS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NEAREST-COMMON-ISA-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*AVERAGE-NEAREST-COMMON-ISA-COUNT*", ONE_INTEGER);
        defparameter("*DEFAULT-NEAREST-COMMON-GENLS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*AVERAGE-NEAREST-COMMON-GENLS-COUNT*", ONE_INTEGER);
        defparameter("*DEFAULT-NEAREST-COMMON-SPECS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*AVERAGE-NEAREST-COMMON-SPECS-COUNT*", TWO_INTEGER);
        defparameter("*DEFAULT-NEAREST-COMMON-GENL-MTS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*AVERAGE-NEAREST-COMMON-GENL-MTS-COUNT*", ONE_INTEGER);
        defparameter("*DEFAULT-NEAREST-COMMON-SPEC-MTS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*AVERAGE-NEAREST-COMMON-SPEC-MTS-COUNT*", ONE_INTEGER);
        defparameter("*DEFAULT-NEAREST-DIFFERENT-ISA-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NEAREST-DIFFERENT-GENLS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*NEAR-NARROW-SPECS-GENERALITY-CUTOFF*", $int$10000);
        defparameter("*NEAR-NARROW-SPECS-COMPLETENESS-CUTOFF*", $int$212);
        return NIL;
    }

    public static SubLObject setup_removal_modules_nearest_isa_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$nearestIsa);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestIsa);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_CHECK, $list15);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_GENERATE, $list17);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_INSTANCES_GENERATE, $list19);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenls);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestGenls);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_FORT_CHECK, $list23);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_NAUT_CHECK, $list25);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_FORT_GENERATE, $list27);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_NAUT_GENERATE, $list29);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPECS_GENERATE, $list31);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenlMt);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestGenlMt);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_CHECK, $list34);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_GENERATE, $list37);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPEC_MTS_GENERATE, $list39);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_CHECK, $list40);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_MTS_GENERATE, $list41);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPEC_MTS_GENERATE, $list42);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenlPreds);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$nearestGenlPreds);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_PREDS_CHECK, $list45);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENL_PREDS_GENERATE, $list49);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_SPEC_PREDS_GENERATE, $list51);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonIsa);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonIsa, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonIsa, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_ISA_CHECK, $list54);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_ISA_GENERATE, $list56);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonGenls);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenls, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenls, TWO_INTEGER);
        note_funcall_helper_function(MAKE_NEAREST_COMMON_GENLS_SUPPORT);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_CHECK, $list64);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_GENERATE, $list66);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonGenlsOfSet);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenlsOfSet, ONE_INTEGER);
        note_funcall_helper_function(MAKE_NEAREST_COMMON_GENLS_OF_SET_SUPPORT);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_OF_SET_CHECK, $list71);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENLS_OF_SET_GENERATE, $list73);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonSpecs);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecs, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecs, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPECS_CHECK, $list76);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPECS_GENERATE, $list78);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonGenlMt);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenlMt, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonGenlMt, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENL_MTS_CHECK, $list81);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_GENL_MTS_GENERATE, $list83);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestCommonSpecMt);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecMt, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestCommonSpecMt, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPEC_MTS_CHECK, $list86);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_COMMON_SPEC_MTS_GENERATE, $list88);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestDifferentIsa);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentIsa, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentIsa, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_ISA_CHECK, $list91);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_ISA_GENERATE, $list93);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestDifferentGenls);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentGenls, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestDifferentGenls, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_GENLS_CHECK, $list96);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_DIFFERENT_GENLS_GENERATE, $list98);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestIsaOfType);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestIsaOfType, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestIsaOfType, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_OF_TYPE_CHECK, $list101);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ISA_OF_TYPE_GENERATE, $list103);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestGenlsOfType);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestGenlsOfType, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestGenlsOfType, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_OF_TYPE_CHECK, $list106);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_GENLS_OF_TYPE_GENERATE, $list108);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestArgIsa);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestArgIsa, TWO_INTEGER);
        preference_modules.inference_preference_module($NEAREST_ARG_ISA_UNBOUND_RELATION_AND_COLLECTION_POS, $list111);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_ISA_CHECK, $list113);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_ISA_GENERATE, $list115);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_ISA_GENERATE_REVERSE, $list119);
        inference_modules.register_solely_specific_removal_module_predicate($$nearestArgGenl);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearestArgGenl, TWO_INTEGER);
        preference_modules.inference_preference_module($NEAREST_ARG_GENL_UNBOUND_RELATION_AND_COLLECTION_POS, $list127);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_GENL_CHECK, $list129);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_GENL_GENERATE, $list131);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_ARG_GENL_GENERATE_REVERSE, $list134);
        inference_modules.register_solely_specific_removal_module_predicate($$nearNarrowSpecs);
        preference_modules.inference_preference_module($NEAR_NARROW_SPECS_GENERATE_POS, $list143);
        preference_modules.doomed_unless_arg_bindable($POS, $$nearNarrowSpecs, ONE_INTEGER);
        inference_modules.inference_removal_module($NEAR_NARROW_SPECS_GENERATE_POS, $list144);
        inference_modules.inference_removal_module($NEAR_NARROW_SPECS_CHECK_POS, $list146);
        inference_modules.register_solely_specific_removal_module_predicate($$thresholdSpecs);
        preference_modules.inference_preference_module($NEAR_NARROW_SPECS_GENERATE_POS, $list148);
        preference_modules.doomed_unless_arg_bindable($POS, $$thresholdSpecs, ONE_INTEGER);
        inference_modules.inference_removal_module($THRESHOLD_SPECS_GENERATE_POS, $list152);
        inference_modules.inference_removal_module($THRESHOLD_SPECS_CHECK_POS, $list154);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_nearest_isa_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_nearest_isa_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_nearest_isa_file();
    }

    
}

/**
 * Total time: 1008 ms
 */
