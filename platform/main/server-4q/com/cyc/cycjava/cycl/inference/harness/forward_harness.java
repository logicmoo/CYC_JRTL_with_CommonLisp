package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.forward_harness;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.inference.harness.forward_harness.*;
import static com.cyc.cycjava.cycl.utilities_macros.$current_forward_problem_store$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class forward_harness extends SubLTranslatedFile {
    public static final SubLFile me = new forward_harness();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.forward_harness";

    public static final String myFingerPrint = "a4ab7139be5f1262430b4441ee2ba044c74a482b2c4eced600bb28815c3679f9";

    // defconstant
    public static final SubLSymbol $dtp_forward_propagation_state$ = makeSymbol("*DTP-FORWARD-PROPAGATION-STATE*");

    // defconstant
    public static final SubLSymbol $dtp_forward_triggering$ = makeSymbol("*DTP-FORWARD-TRIGGERING*");

    // defconstant
    public static final SubLSymbol $dtp_skeletal_proof$ = makeSymbol("*DTP-SKELETAL-PROOF*");

    // defconstant
    public static final SubLSymbol $dtp_placeable_proof$ = makeSymbol("*DTP-PLACEABLE-PROOF*");

    // defparameter
    private static final SubLSymbol $forward_propagation_generated_triggerings$ = makeSymbol("*FORWARD-PROPAGATION-GENERATED-TRIGGERINGS*");

    // defparameter
    private static final SubLSymbol $forward_propagation_generated_skeletal_proofs$ = makeSymbol("*FORWARD-PROPAGATION-GENERATED-SKELETAL-PROOFS*");

    private static final SubLSymbol FORWARD_PROPAGATION_STATE = makeSymbol("FORWARD-PROPAGATION-STATE");

    private static final SubLSymbol FORWARD_PROPAGATION_STATE_P = makeSymbol("FORWARD-PROPAGATION-STATE-P");

    private static final SubLList $list2 = list(makeSymbol("ASSERTIONS-WORKING-SET"), makeSymbol("TRIGGERINGS-WORKING-SET"), makeSymbol("SKELETAL-PROOFS-WORKING-SET"), makeSymbol("PLACEABLE-PROOFS-WORKING-SET"), makeSymbol("PROPAGATION-MT"));

    private static final SubLList $list3 = list(makeKeyword("ASSERTIONS-WORKING-SET"), makeKeyword("TRIGGERINGS-WORKING-SET"), makeKeyword("SKELETAL-PROOFS-WORKING-SET"), makeKeyword("PLACEABLE-PROOFS-WORKING-SET"), makeKeyword("PROPAGATION-MT"));

    private static final SubLList $list4 = list(makeSymbol("FORWARD-PS-ASSERTIONS-WORKING-SET"), makeSymbol("FORWARD-PS-TRIGGERINGS-WORKING-SET"), makeSymbol("FORWARD-PS-SKELETAL-PROOFS-WORKING-SET"), makeSymbol("FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET"), makeSymbol("FORWARD-PS-PROPAGATION-MT"));

    private static final SubLList $list5 = list(makeSymbol("_CSETF-FORWARD-PS-ASSERTIONS-WORKING-SET"), makeSymbol("_CSETF-FORWARD-PS-TRIGGERINGS-WORKING-SET"), makeSymbol("_CSETF-FORWARD-PS-SKELETAL-PROOFS-WORKING-SET"), makeSymbol("_CSETF-FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET"), makeSymbol("_CSETF-FORWARD-PS-PROPAGATION-MT"));

    private static final SubLSymbol PRINT_FORWARD_PROPAGATION_STATE = makeSymbol("PRINT-FORWARD-PROPAGATION-STATE");

    private static final SubLSymbol FORWARD_PROPAGATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-PROPAGATION-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-PROPAGATION-STATE-P"));

    private static final SubLSymbol FORWARD_PS_ASSERTIONS_WORKING_SET = makeSymbol("FORWARD-PS-ASSERTIONS-WORKING-SET");

    private static final SubLSymbol _CSETF_FORWARD_PS_ASSERTIONS_WORKING_SET = makeSymbol("_CSETF-FORWARD-PS-ASSERTIONS-WORKING-SET");

    private static final SubLSymbol FORWARD_PS_TRIGGERINGS_WORKING_SET = makeSymbol("FORWARD-PS-TRIGGERINGS-WORKING-SET");

    private static final SubLSymbol _CSETF_FORWARD_PS_TRIGGERINGS_WORKING_SET = makeSymbol("_CSETF-FORWARD-PS-TRIGGERINGS-WORKING-SET");

    private static final SubLSymbol FORWARD_PS_SKELETAL_PROOFS_WORKING_SET = makeSymbol("FORWARD-PS-SKELETAL-PROOFS-WORKING-SET");

    private static final SubLSymbol _CSETF_FORWARD_PS_SKELETAL_PROOFS_WORKING_SET = makeSymbol("_CSETF-FORWARD-PS-SKELETAL-PROOFS-WORKING-SET");

    private static final SubLSymbol FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET = makeSymbol("FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET");

    private static final SubLSymbol _CSETF_FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET = makeSymbol("_CSETF-FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET");

    private static final SubLSymbol FORWARD_PS_PROPAGATION_MT = makeSymbol("FORWARD-PS-PROPAGATION-MT");

    private static final SubLSymbol _CSETF_FORWARD_PS_PROPAGATION_MT = makeSymbol("_CSETF-FORWARD-PS-PROPAGATION-MT");

    private static final SubLSymbol $ASSERTIONS_WORKING_SET = makeKeyword("ASSERTIONS-WORKING-SET");

    private static final SubLSymbol $TRIGGERINGS_WORKING_SET = makeKeyword("TRIGGERINGS-WORKING-SET");

    private static final SubLSymbol $SKELETAL_PROOFS_WORKING_SET = makeKeyword("SKELETAL-PROOFS-WORKING-SET");

    private static final SubLSymbol $PLACEABLE_PROOFS_WORKING_SET = makeKeyword("PLACEABLE-PROOFS-WORKING-SET");



    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FORWARD_PROPAGATION_STATE = makeSymbol("MAKE-FORWARD-PROPAGATION-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATION_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATION-STATE-METHOD");

    private static final SubLString $str30$__A__A__A__A_ = makeString("(~A,~A,~A,~A)");







    private static final SubLSymbol FORWARD_TRIGGERING = makeSymbol("FORWARD-TRIGGERING");

    private static final SubLSymbol FORWARD_TRIGGERING_P = makeSymbol("FORWARD-TRIGGERING-P");

    private static final SubLList $list36 = list(new SubLObject[]{ makeSymbol("RULE"), makeSymbol("SOURCE-ASENT"), makeSymbol("SOURCE-TRUTH"), makeSymbol("TARGET-ASENT"), makeSymbol("TARGET-TRUTH"), makeSymbol("QUERY-DNF"), makeSymbol("PRAGMATIC-DNF"), makeSymbol("PROPAGATION-MT"), makeSymbol("RESTRICTED-EXAMINE-ASENT"), makeSymbol("TRIGGER-BINDINGS"), makeSymbol("TRIGGER-SUPPORTS") });

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("RULE"), makeKeyword("SOURCE-ASENT"), makeKeyword("SOURCE-TRUTH"), makeKeyword("TARGET-ASENT"), makeKeyword("TARGET-TRUTH"), makeKeyword("QUERY-DNF"), makeKeyword("PRAGMATIC-DNF"), makeKeyword("PROPAGATION-MT"), makeKeyword("RESTRICTED-EXAMINE-ASENT"), makeKeyword("TRIGGER-BINDINGS"), makeKeyword("TRIGGER-SUPPORTS") });

    private static final SubLList $list38 = list(new SubLObject[]{ makeSymbol("FORWARD-TRIG-RULE"), makeSymbol("FORWARD-TRIG-SOURCE-ASENT"), makeSymbol("FORWARD-TRIG-SOURCE-TRUTH"), makeSymbol("FORWARD-TRIG-TARGET-ASENT"), makeSymbol("FORWARD-TRIG-TARGET-TRUTH"), makeSymbol("FORWARD-TRIG-QUERY-DNF"), makeSymbol("FORWARD-TRIG-PRAGMATIC-DNF"), makeSymbol("FORWARD-TRIG-PROPAGATION-MT"), makeSymbol("FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT"), makeSymbol("FORWARD-TRIG-TRIGGER-BINDINGS"), makeSymbol("FORWARD-TRIG-TRIGGER-SUPPORTS") });

    private static final SubLList $list39 = list(new SubLObject[]{ makeSymbol("_CSETF-FORWARD-TRIG-RULE"), makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-ASENT"), makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-TRUTH"), makeSymbol("_CSETF-FORWARD-TRIG-TARGET-ASENT"), makeSymbol("_CSETF-FORWARD-TRIG-TARGET-TRUTH"), makeSymbol("_CSETF-FORWARD-TRIG-QUERY-DNF"), makeSymbol("_CSETF-FORWARD-TRIG-PRAGMATIC-DNF"), makeSymbol("_CSETF-FORWARD-TRIG-PROPAGATION-MT"), makeSymbol("_CSETF-FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT"), makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-BINDINGS"), makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-SUPPORTS") });

    private static final SubLSymbol PRINT_FORWARD_TRIGGERING = makeSymbol("PRINT-FORWARD-TRIGGERING");

    private static final SubLSymbol FORWARD_TRIGGERING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-TRIGGERING-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list42 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-TRIGGERING-P"));

    private static final SubLSymbol FORWARD_TRIG_RULE = makeSymbol("FORWARD-TRIG-RULE");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_RULE = makeSymbol("_CSETF-FORWARD-TRIG-RULE");

    private static final SubLSymbol FORWARD_TRIG_SOURCE_ASENT = makeSymbol("FORWARD-TRIG-SOURCE-ASENT");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_SOURCE_ASENT = makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-ASENT");

    private static final SubLSymbol FORWARD_TRIG_SOURCE_TRUTH = makeSymbol("FORWARD-TRIG-SOURCE-TRUTH");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_SOURCE_TRUTH = makeSymbol("_CSETF-FORWARD-TRIG-SOURCE-TRUTH");

    private static final SubLSymbol FORWARD_TRIG_TARGET_ASENT = makeSymbol("FORWARD-TRIG-TARGET-ASENT");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_TARGET_ASENT = makeSymbol("_CSETF-FORWARD-TRIG-TARGET-ASENT");

    private static final SubLSymbol FORWARD_TRIG_TARGET_TRUTH = makeSymbol("FORWARD-TRIG-TARGET-TRUTH");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_TARGET_TRUTH = makeSymbol("_CSETF-FORWARD-TRIG-TARGET-TRUTH");

    private static final SubLSymbol FORWARD_TRIG_QUERY_DNF = makeSymbol("FORWARD-TRIG-QUERY-DNF");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_QUERY_DNF = makeSymbol("_CSETF-FORWARD-TRIG-QUERY-DNF");

    private static final SubLSymbol FORWARD_TRIG_PRAGMATIC_DNF = makeSymbol("FORWARD-TRIG-PRAGMATIC-DNF");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_PRAGMATIC_DNF = makeSymbol("_CSETF-FORWARD-TRIG-PRAGMATIC-DNF");

    private static final SubLSymbol FORWARD_TRIG_PROPAGATION_MT = makeSymbol("FORWARD-TRIG-PROPAGATION-MT");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_PROPAGATION_MT = makeSymbol("_CSETF-FORWARD-TRIG-PROPAGATION-MT");

    private static final SubLSymbol FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT = makeSymbol("FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT = makeSymbol("_CSETF-FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT");

    private static final SubLSymbol FORWARD_TRIG_TRIGGER_BINDINGS = makeSymbol("FORWARD-TRIG-TRIGGER-BINDINGS");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_TRIGGER_BINDINGS = makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-BINDINGS");

    private static final SubLSymbol FORWARD_TRIG_TRIGGER_SUPPORTS = makeSymbol("FORWARD-TRIG-TRIGGER-SUPPORTS");

    private static final SubLSymbol _CSETF_FORWARD_TRIG_TRIGGER_SUPPORTS = makeSymbol("_CSETF-FORWARD-TRIG-TRIGGER-SUPPORTS");



    private static final SubLSymbol $SOURCE_ASENT = makeKeyword("SOURCE-ASENT");

    private static final SubLSymbol $SOURCE_TRUTH = makeKeyword("SOURCE-TRUTH");





    private static final SubLSymbol $QUERY_DNF = makeKeyword("QUERY-DNF");

    private static final SubLSymbol $PRAGMATIC_DNF = makeKeyword("PRAGMATIC-DNF");

    private static final SubLSymbol $RESTRICTED_EXAMINE_ASENT = makeKeyword("RESTRICTED-EXAMINE-ASENT");





    private static final SubLSymbol MAKE_FORWARD_TRIGGERING = makeSymbol("MAKE-FORWARD-TRIGGERING");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORWARD_TRIGGERING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-TRIGGERING-METHOD");

    private static final SubLInteger $int$213 = makeInteger(213);

    private static final SubLSymbol SXHASH_FORWARD_TRIGGERING_METHOD = makeSymbol("SXHASH-FORWARD-TRIGGERING-METHOD");

    private static final SubLString $$$TRIG_ = makeString("TRIG ");

    private static final SubLString $str80$rule__S_ = makeString("rule ~S:");

    private static final SubLString $str81$__A_S = makeString(" ~A~S");



    private static final SubLString $str83$ = makeString("");

    private static final SubLString $str84$__not_ = makeString("#$not ");

    private static final SubLString $str85$_to__A_S = makeString(" to ~A~S");

    private static final SubLSymbol SKELETAL_PROOF = makeSymbol("SKELETAL-PROOF");

    private static final SubLSymbol SKELETAL_PROOF_P = makeSymbol("SKELETAL-PROOF-P");

    private static final SubLList $list88 = list(makeSymbol("CONCLUDED-ASENT"), makeSymbol("CONCLUDED-TRUTH"), makeSymbol("TRIGGER-BINDINGS"), makeSymbol("INFERENCE-BINDINGS"), makeSymbol("CONCLUDED-SUPPORTS"), makeSymbol("PRAGMATIC-SUPPORTS"), makeSymbol("RULE"), makeSymbol("PROPAGATION-MT"));

    private static final SubLList $list89 = list(makeKeyword("CONCLUDED-ASENT"), makeKeyword("CONCLUDED-TRUTH"), makeKeyword("TRIGGER-BINDINGS"), makeKeyword("INFERENCE-BINDINGS"), makeKeyword("CONCLUDED-SUPPORTS"), makeKeyword("PRAGMATIC-SUPPORTS"), makeKeyword("RULE"), makeKeyword("PROPAGATION-MT"));

    private static final SubLList $list90 = list(makeSymbol("SKEL-PROOF-CONCLUDED-ASENT"), makeSymbol("SKEL-PROOF-CONCLUDED-TRUTH"), makeSymbol("SKEL-PROOF-TRIGGER-BINDINGS"), makeSymbol("SKEL-PROOF-INFERENCE-BINDINGS"), makeSymbol("SKEL-PROOF-CONCLUDED-SUPPORTS"), makeSymbol("SKEL-PROOF-PRAGMATIC-SUPPORTS"), makeSymbol("SKEL-PROOF-RULE"), makeSymbol("SKEL-PROOF-PROPAGATION-MT"));

    private static final SubLList $list91 = list(makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-ASENT"), makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-TRUTH"), makeSymbol("_CSETF-SKEL-PROOF-TRIGGER-BINDINGS"), makeSymbol("_CSETF-SKEL-PROOF-INFERENCE-BINDINGS"), makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-SUPPORTS"), makeSymbol("_CSETF-SKEL-PROOF-PRAGMATIC-SUPPORTS"), makeSymbol("_CSETF-SKEL-PROOF-RULE"), makeSymbol("_CSETF-SKEL-PROOF-PROPAGATION-MT"));

    private static final SubLSymbol PRINT_SKELETAL_PROOF = makeSymbol("PRINT-SKELETAL-PROOF");

    private static final SubLSymbol SKELETAL_PROOF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SKELETAL-PROOF-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list94 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SKELETAL-PROOF-P"));

    private static final SubLSymbol SKEL_PROOF_CONCLUDED_ASENT = makeSymbol("SKEL-PROOF-CONCLUDED-ASENT");

    private static final SubLSymbol _CSETF_SKEL_PROOF_CONCLUDED_ASENT = makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-ASENT");

    private static final SubLSymbol SKEL_PROOF_CONCLUDED_TRUTH = makeSymbol("SKEL-PROOF-CONCLUDED-TRUTH");

    private static final SubLSymbol _CSETF_SKEL_PROOF_CONCLUDED_TRUTH = makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-TRUTH");

    private static final SubLSymbol SKEL_PROOF_TRIGGER_BINDINGS = makeSymbol("SKEL-PROOF-TRIGGER-BINDINGS");

    private static final SubLSymbol _CSETF_SKEL_PROOF_TRIGGER_BINDINGS = makeSymbol("_CSETF-SKEL-PROOF-TRIGGER-BINDINGS");

    private static final SubLSymbol SKEL_PROOF_INFERENCE_BINDINGS = makeSymbol("SKEL-PROOF-INFERENCE-BINDINGS");

    private static final SubLSymbol _CSETF_SKEL_PROOF_INFERENCE_BINDINGS = makeSymbol("_CSETF-SKEL-PROOF-INFERENCE-BINDINGS");

    private static final SubLSymbol SKEL_PROOF_CONCLUDED_SUPPORTS = makeSymbol("SKEL-PROOF-CONCLUDED-SUPPORTS");

    private static final SubLSymbol _CSETF_SKEL_PROOF_CONCLUDED_SUPPORTS = makeSymbol("_CSETF-SKEL-PROOF-CONCLUDED-SUPPORTS");

    private static final SubLSymbol SKEL_PROOF_PRAGMATIC_SUPPORTS = makeSymbol("SKEL-PROOF-PRAGMATIC-SUPPORTS");

    private static final SubLSymbol _CSETF_SKEL_PROOF_PRAGMATIC_SUPPORTS = makeSymbol("_CSETF-SKEL-PROOF-PRAGMATIC-SUPPORTS");

    private static final SubLSymbol SKEL_PROOF_RULE = makeSymbol("SKEL-PROOF-RULE");

    private static final SubLSymbol _CSETF_SKEL_PROOF_RULE = makeSymbol("_CSETF-SKEL-PROOF-RULE");

    private static final SubLSymbol SKEL_PROOF_PROPAGATION_MT = makeSymbol("SKEL-PROOF-PROPAGATION-MT");

    private static final SubLSymbol _CSETF_SKEL_PROOF_PROPAGATION_MT = makeSymbol("_CSETF-SKEL-PROOF-PROPAGATION-MT");

    private static final SubLSymbol $CONCLUDED_ASENT = makeKeyword("CONCLUDED-ASENT");

    private static final SubLSymbol $CONCLUDED_TRUTH = makeKeyword("CONCLUDED-TRUTH");

    private static final SubLSymbol $INFERENCE_BINDINGS = makeKeyword("INFERENCE-BINDINGS");

    private static final SubLSymbol $CONCLUDED_SUPPORTS = makeKeyword("CONCLUDED-SUPPORTS");



    private static final SubLSymbol MAKE_SKELETAL_PROOF = makeSymbol("MAKE-SKELETAL-PROOF");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SKELETAL_PROOF_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKELETAL-PROOF-METHOD");

    private static final SubLInteger $int$217 = makeInteger(217);

    private static final SubLSymbol SXHASH_SKELETAL_PROOF_METHOD = makeSymbol("SXHASH-SKELETAL-PROOF-METHOD");

    private static final SubLString $str120$_A_S = makeString("~A~S");

    private static final SubLSymbol PLACEABLE_PROOF = makeSymbol("PLACEABLE-PROOF");

    private static final SubLSymbol PLACEABLE_PROOF_P = makeSymbol("PLACEABLE-PROOF-P");

    private static final SubLList $list123 = list(makeSymbol("CONCLUDED-ASENT"), makeSymbol("CONCLUDED-MT"), makeSymbol("CONCLUDED-TRUTH"), makeSymbol("ASSERTIBLE"));

    private static final SubLList $list124 = list(makeKeyword("CONCLUDED-ASENT"), makeKeyword("CONCLUDED-MT"), makeKeyword("CONCLUDED-TRUTH"), makeKeyword("ASSERTIBLE"));

    private static final SubLList $list125 = list(makeSymbol("PLAC-PROOF-CONCLUDED-ASENT"), makeSymbol("PLAC-PROOF-CONCLUDED-MT"), makeSymbol("PLAC-PROOF-CONCLUDED-TRUTH"), makeSymbol("PLAC-PROOF-ASSERTIBLE"));

    private static final SubLList $list126 = list(makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-ASENT"), makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-MT"), makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-TRUTH"), makeSymbol("_CSETF-PLAC-PROOF-ASSERTIBLE"));

    private static final SubLSymbol PRINT_PLACEABLE_PROOF = makeSymbol("PRINT-PLACEABLE-PROOF");

    private static final SubLSymbol PLACEABLE_PROOF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PLACEABLE-PROOF-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list129 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PLACEABLE-PROOF-P"));

    private static final SubLSymbol PLAC_PROOF_CONCLUDED_ASENT = makeSymbol("PLAC-PROOF-CONCLUDED-ASENT");

    private static final SubLSymbol _CSETF_PLAC_PROOF_CONCLUDED_ASENT = makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-ASENT");

    private static final SubLSymbol PLAC_PROOF_CONCLUDED_MT = makeSymbol("PLAC-PROOF-CONCLUDED-MT");

    private static final SubLSymbol _CSETF_PLAC_PROOF_CONCLUDED_MT = makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-MT");

    private static final SubLSymbol PLAC_PROOF_CONCLUDED_TRUTH = makeSymbol("PLAC-PROOF-CONCLUDED-TRUTH");

    private static final SubLSymbol _CSETF_PLAC_PROOF_CONCLUDED_TRUTH = makeSymbol("_CSETF-PLAC-PROOF-CONCLUDED-TRUTH");

    private static final SubLSymbol PLAC_PROOF_ASSERTIBLE = makeSymbol("PLAC-PROOF-ASSERTIBLE");

    private static final SubLSymbol _CSETF_PLAC_PROOF_ASSERTIBLE = makeSymbol("_CSETF-PLAC-PROOF-ASSERTIBLE");



    private static final SubLSymbol $ASSERTIBLE = makeKeyword("ASSERTIBLE");

    private static final SubLSymbol MAKE_PLACEABLE_PROOF = makeSymbol("MAKE-PLACEABLE-PROOF");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PLACEABLE_PROOF_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PLACEABLE-PROOF-METHOD");

    private static final SubLInteger $int$219 = makeInteger(219);

    private static final SubLSymbol SXHASH_PLACEABLE_PROOF_METHOD = makeSymbol("SXHASH-PLACEABLE-PROOF-METHOD");

    private static final SubLString $str144$_A_S_in__S = makeString("~A~S in ~S");



    private static final SubLSymbol FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING = makeSymbol("FORWARD-PROPAGATE-NOTE-GENERATED-TRIGGERING");

    private static final SubLSymbol FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF = makeSymbol("FORWARD-PROPAGATE-NOTE-GENERATED-SKELETAL-PROOF");

    private static final SubLSymbol PLACEABLE_PROOF_ASSERTIBLE = makeSymbol("PLACEABLE-PROOF-ASSERTIBLE");

    public static SubLObject forward_propagation_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_forward_propagation_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject forward_propagation_state_p(final SubLObject v_object) {
        return v_object.getClass() == forward_harness.$forward_propagation_state_native.class ? T : NIL;
    }

    public static SubLObject forward_ps_assertions_working_set(final SubLObject v_object) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject forward_ps_triggerings_working_set(final SubLObject v_object) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject forward_ps_skeletal_proofs_working_set(final SubLObject v_object) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject forward_ps_placeable_proofs_working_set(final SubLObject v_object) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject forward_ps_propagation_mt(final SubLObject v_object) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_forward_ps_assertions_working_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_forward_ps_triggerings_working_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_forward_ps_skeletal_proofs_working_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_forward_ps_placeable_proofs_working_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_forward_ps_propagation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_propagation_state_p(v_object) : "forward_harness.forward_propagation_state_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_forward_propagation_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new forward_harness.$forward_propagation_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ASSERTIONS_WORKING_SET)) {
                _csetf_forward_ps_assertions_working_set(v_new, current_value);
            } else
                if (pcase_var.eql($TRIGGERINGS_WORKING_SET)) {
                    _csetf_forward_ps_triggerings_working_set(v_new, current_value);
                } else
                    if (pcase_var.eql($SKELETAL_PROOFS_WORKING_SET)) {
                        _csetf_forward_ps_skeletal_proofs_working_set(v_new, current_value);
                    } else
                        if (pcase_var.eql($PLACEABLE_PROOFS_WORKING_SET)) {
                            _csetf_forward_ps_placeable_proofs_working_set(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROPAGATION_MT)) {
                                _csetf_forward_ps_propagation_mt(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_forward_propagation_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORWARD_PROPAGATION_STATE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ASSERTIONS_WORKING_SET, forward_ps_assertions_working_set(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIGGERINGS_WORKING_SET, forward_ps_triggerings_working_set(obj));
        funcall(visitor_fn, obj, $SLOT, $SKELETAL_PROOFS_WORKING_SET, forward_ps_skeletal_proofs_working_set(obj));
        funcall(visitor_fn, obj, $SLOT, $PLACEABLE_PROOFS_WORKING_SET, forward_ps_placeable_proofs_working_set(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPAGATION_MT, forward_ps_propagation_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORWARD_PROPAGATION_STATE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_forward_propagation_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_propagation_state(obj, visitor_fn);
    }

    public static SubLObject print_forward_propagation_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            final SubLObject assertions_count = forward_propagation_state_assertions_size(v_object);
            final SubLObject triggerings_count = forward_propagation_state_triggerings_size(v_object);
            final SubLObject skeletal_count = forward_propagation_state_skeletal_proofs_size(v_object);
            final SubLObject placeable_count = forward_propagation_state_placeable_proofs_size(v_object);
            format(stream, $str30$__A__A__A__A_, new SubLObject[]{ assertions_count, triggerings_count, skeletal_count, placeable_count });
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_forward_propagation_state(SubLObject initial_assertions, SubLObject propagation_mt) {
        if (initial_assertions == UNPROVIDED) {
            initial_assertions = NIL;
        }
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLObject list_var = initial_assertions;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != hlmt.possibly_hlmt_p(propagation_mt) : "hlmt.possibly_hlmt_p(propagation_mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(propagation_mt) " + propagation_mt;
        final SubLObject forward_ps = make_forward_propagation_state(UNPROVIDED);
        final SubLObject initial_size = length(initial_assertions);
        _csetf_forward_ps_assertions_working_set(forward_ps, set_utilities.make_set_from_list(initial_assertions, symbol_function(EQL)));
        _csetf_forward_ps_triggerings_working_set(forward_ps, set.new_set(symbol_function(EQ), initial_size));
        _csetf_forward_ps_skeletal_proofs_working_set(forward_ps, set.new_set(symbol_function(EQ), initial_size));
        _csetf_forward_ps_placeable_proofs_working_set(forward_ps, set.new_set(symbol_function(EQ), initial_size));
        _csetf_forward_ps_propagation_mt(forward_ps, propagation_mt);
        return forward_ps;
    }

    public static SubLObject forward_propagation_state_propagation_mt(final SubLObject forward_state) {
        assert NIL != forward_propagation_state_p(forward_state) : "forward_harness.forward_propagation_state_p(forward_state) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(forward_state) " + forward_state;
        return forward_ps_propagation_mt(forward_state);
    }

    public static SubLObject forward_propagation_state_assertions_size(final SubLObject forward_state) {
        assert NIL != forward_propagation_state_p(forward_state) : "forward_harness.forward_propagation_state_p(forward_state) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(forward_state) " + forward_state;
        return set.set_size(forward_ps_assertions_working_set(forward_state));
    }

    public static SubLObject forward_propagation_some_assertionsP(final SubLObject forward_ps) {
        return makeBoolean(!forward_propagation_state_assertions_size(forward_ps).isZero());
    }

    public static SubLObject forward_propagation_state_triggerings_size(final SubLObject forward_state) {
        assert NIL != forward_propagation_state_p(forward_state) : "forward_harness.forward_propagation_state_p(forward_state) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(forward_state) " + forward_state;
        return set.set_size(forward_ps_triggerings_working_set(forward_state));
    }

    public static SubLObject forward_propagation_some_triggeringsP(final SubLObject forward_ps) {
        return makeBoolean(!forward_propagation_state_triggerings_size(forward_ps).isZero());
    }

    public static SubLObject forward_propagation_state_skeletal_proofs_size(final SubLObject forward_state) {
        assert NIL != forward_propagation_state_p(forward_state) : "forward_harness.forward_propagation_state_p(forward_state) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(forward_state) " + forward_state;
        return set.set_size(forward_ps_skeletal_proofs_working_set(forward_state));
    }

    public static SubLObject forward_propagation_some_skeletal_proofsP(final SubLObject forward_ps) {
        return makeBoolean(!forward_propagation_state_skeletal_proofs_size(forward_ps).isZero());
    }

    public static SubLObject forward_propagation_state_placeable_proofs_size(final SubLObject forward_state) {
        assert NIL != forward_propagation_state_p(forward_state) : "forward_harness.forward_propagation_state_p(forward_state) " + "CommonSymbols.NIL != forward_harness.forward_propagation_state_p(forward_state) " + forward_state;
        return set.set_size(forward_ps_placeable_proofs_working_set(forward_state));
    }

    public static SubLObject forward_propagation_some_placeable_proofsP(final SubLObject forward_ps) {
        return makeBoolean(!forward_propagation_state_placeable_proofs_size(forward_ps).isZero());
    }

    public static SubLObject forward_propagation_add_assertions(final SubLObject forward_ps, final SubLObject new_assertions) {
        return set_utilities.set_add_all(new_assertions, forward_ps_assertions_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_remove_assertions(final SubLObject forward_ps, final SubLObject assertions_to_process_next) {
        return set_utilities.set_remove_all(assertions_to_process_next, forward_ps_assertions_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_add_triggerings(final SubLObject forward_ps, final SubLObject new_triggerings) {
        return set_utilities.set_add_all(new_triggerings, forward_ps_triggerings_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_remove_triggerings(final SubLObject forward_ps, final SubLObject triggerings_to_process_next) {
        return set_utilities.set_remove_all(triggerings_to_process_next, forward_ps_triggerings_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_add_skeletal_proofs(final SubLObject forward_ps, final SubLObject new_skeletal_proofs) {
        return set_utilities.set_add_all(new_skeletal_proofs, forward_ps_skeletal_proofs_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_remove_skeletal_proofs(final SubLObject forward_ps, final SubLObject skeletal_proofs_to_process_next) {
        return set_utilities.set_remove_all(skeletal_proofs_to_process_next, forward_ps_skeletal_proofs_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_add_placeable_proofs(final SubLObject forward_ps, final SubLObject new_placeable_proofs) {
        return set_utilities.set_add_all(new_placeable_proofs, forward_ps_placeable_proofs_working_set(forward_ps));
    }

    public static SubLObject forward_propagation_remove_placeable_proofs(final SubLObject forward_ps, final SubLObject placeable_proofs_to_process_next) {
        return set_utilities.set_remove_all(placeable_proofs_to_process_next, forward_ps_placeable_proofs_working_set(forward_ps));
    }

    public static SubLObject forward_triggering_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_forward_triggering(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject forward_triggering_p(final SubLObject v_object) {
        return v_object.getClass() == forward_harness.$forward_triggering_native.class ? T : NIL;
    }

    public static SubLObject forward_trig_rule(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject forward_trig_source_asent(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject forward_trig_source_truth(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject forward_trig_target_asent(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject forward_trig_target_truth(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject forward_trig_query_dnf(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject forward_trig_pragmatic_dnf(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject forward_trig_propagation_mt(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject forward_trig_restricted_examine_asent(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject forward_trig_trigger_bindings(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject forward_trig_trigger_supports(final SubLObject v_object) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject _csetf_forward_trig_rule(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_forward_trig_source_asent(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_forward_trig_source_truth(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_forward_trig_target_asent(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_forward_trig_target_truth(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_forward_trig_query_dnf(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_forward_trig_pragmatic_dnf(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_forward_trig_propagation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_forward_trig_restricted_examine_asent(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_forward_trig_trigger_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_forward_trig_trigger_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != forward_triggering_p(v_object) : "forward_harness.forward_triggering_p(v_object) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject make_forward_triggering(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new forward_harness.$forward_triggering_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RULE)) {
                _csetf_forward_trig_rule(v_new, current_value);
            } else
                if (pcase_var.eql($SOURCE_ASENT)) {
                    _csetf_forward_trig_source_asent(v_new, current_value);
                } else
                    if (pcase_var.eql($SOURCE_TRUTH)) {
                        _csetf_forward_trig_source_truth(v_new, current_value);
                    } else
                        if (pcase_var.eql($TARGET_ASENT)) {
                            _csetf_forward_trig_target_asent(v_new, current_value);
                        } else
                            if (pcase_var.eql($TARGET_TRUTH)) {
                                _csetf_forward_trig_target_truth(v_new, current_value);
                            } else
                                if (pcase_var.eql($QUERY_DNF)) {
                                    _csetf_forward_trig_query_dnf(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PRAGMATIC_DNF)) {
                                        _csetf_forward_trig_pragmatic_dnf(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PROPAGATION_MT)) {
                                            _csetf_forward_trig_propagation_mt(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RESTRICTED_EXAMINE_ASENT)) {
                                                _csetf_forward_trig_restricted_examine_asent(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($TRIGGER_BINDINGS)) {
                                                    _csetf_forward_trig_trigger_bindings(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TRIGGER_SUPPORTS)) {
                                                        _csetf_forward_trig_trigger_supports(v_new, current_value);
                                                    } else {
                                                        Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                                                    }










        }
        return v_new;
    }

    public static SubLObject visit_defstruct_forward_triggering(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORWARD_TRIGGERING, ELEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RULE, forward_trig_rule(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_ASENT, forward_trig_source_asent(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_TRUTH, forward_trig_source_truth(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET_ASENT, forward_trig_target_asent(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET_TRUTH, forward_trig_target_truth(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_DNF, forward_trig_query_dnf(obj));
        funcall(visitor_fn, obj, $SLOT, $PRAGMATIC_DNF, forward_trig_pragmatic_dnf(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPAGATION_MT, forward_trig_propagation_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $RESTRICTED_EXAMINE_ASENT, forward_trig_restricted_examine_asent(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIGGER_BINDINGS, forward_trig_trigger_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIGGER_SUPPORTS, forward_trig_trigger_supports(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORWARD_TRIGGERING, ELEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_forward_triggering_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_forward_triggering(obj, visitor_fn);
    }

    public static SubLObject sxhash_forward_triggering_method(final SubLObject v_object) {
        final SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$213;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(forward_trig_rule(v_object))), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(forward_trig_source_asent(v_object))), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(forward_trig_target_asent(v_object))), composite_state), composite_hash);
        return sxhash;
    }

    public static SubLObject print_forward_triggering(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = forward_trig_rule(v_object);
        final SubLObject rule_id = assertion_handles.assertion_id(rule);
        final SubLObject source_asent = forward_trig_source_asent(v_object);
        final SubLObject source_truth = forward_trig_source_truth(v_object);
        final SubLObject target_asent = forward_trig_target_asent(v_object);
        final SubLObject target_truth = forward_trig_target_truth(v_object);
        final SubLObject source_pred = (NIL != source_asent) ? cycl_utilities.atomic_sentence_predicate(source_asent) : NIL;
        final SubLObject target_pred = (NIL != target_asent) ? cycl_utilities.atomic_sentence_predicate(target_asent) : NIL;
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, NIL, NIL);
            format(stream, $$$TRIG_);
            format(stream, $str80$rule__S_, rule_id);
            if (NIL != source_pred) {
                format(stream, $str81$__A_S, $TRUE == source_truth ? $str83$ : $str84$__not_, source_pred);
            }
            format(stream, $str85$_to__A_S, $TRUE == target_truth ? $str83$ : $str84$__not_, target_pred);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_forward_triggering(final SubLObject rule, final SubLObject source_asent, final SubLObject source_truth, final SubLObject target_asent, final SubLObject target_truth, final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject restricted_examine_asent, final SubLObject trigger_bindings, final SubLObject trigger_supports) {
        return make_forward_triggering(list(new SubLObject[]{ $RULE, rule, $SOURCE_ASENT, source_asent, $SOURCE_TRUTH, source_truth, $TARGET_ASENT, target_asent, $TARGET_TRUTH, target_truth, $QUERY_DNF, query_dnf, $PRAGMATIC_DNF, pragmatic_dnf, $PROPAGATION_MT, propagation_mt, $RESTRICTED_EXAMINE_ASENT, restricted_examine_asent, $TRIGGER_BINDINGS, trigger_bindings, $TRIGGER_SUPPORTS, trigger_supports }));
    }

    public static SubLObject forward_triggering_rule(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_rule(triggering);
    }

    public static SubLObject forward_triggering_source_asent(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_source_asent(triggering);
    }

    public static SubLObject forward_triggering_source_truth(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_source_truth(triggering);
    }

    public static SubLObject forward_triggering_target_asent(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_target_asent(triggering);
    }

    public static SubLObject forward_triggering_target_truth(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_target_truth(triggering);
    }

    public static SubLObject forward_triggering_query_dnf(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_query_dnf(triggering);
    }

    public static SubLObject forward_triggering_pragmatic_dnf(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_pragmatic_dnf(triggering);
    }

    public static SubLObject forward_triggering_propagation_mt(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_propagation_mt(triggering);
    }

    public static SubLObject forward_triggering_restricted_examine_asent(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_restricted_examine_asent(triggering);
    }

    public static SubLObject forward_triggering_trigger_bindings(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_trigger_bindings(triggering);
    }

    public static SubLObject forward_triggering_trigger_supports(final SubLObject triggering) {
        assert NIL != forward_triggering_p(triggering) : "forward_harness.forward_triggering_p(triggering) " + "CommonSymbols.NIL != forward_harness.forward_triggering_p(triggering) " + triggering;
        return forward_trig_trigger_supports(triggering);
    }

    public static SubLObject skeletal_proof_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_skeletal_proof(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject skeletal_proof_p(final SubLObject v_object) {
        return v_object.getClass() == forward_harness.$skeletal_proof_native.class ? T : NIL;
    }

    public static SubLObject skel_proof_concluded_asent(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject skel_proof_concluded_truth(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject skel_proof_trigger_bindings(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject skel_proof_inference_bindings(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject skel_proof_concluded_supports(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject skel_proof_pragmatic_supports(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject skel_proof_rule(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject skel_proof_propagation_mt(final SubLObject v_object) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_skel_proof_concluded_asent(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_skel_proof_concluded_truth(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_skel_proof_trigger_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_skel_proof_inference_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_skel_proof_concluded_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_skel_proof_pragmatic_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_skel_proof_rule(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_skel_proof_propagation_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != skeletal_proof_p(v_object) : "forward_harness.skeletal_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_skeletal_proof(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new forward_harness.$skeletal_proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONCLUDED_ASENT)) {
                _csetf_skel_proof_concluded_asent(v_new, current_value);
            } else
                if (pcase_var.eql($CONCLUDED_TRUTH)) {
                    _csetf_skel_proof_concluded_truth(v_new, current_value);
                } else
                    if (pcase_var.eql($TRIGGER_BINDINGS)) {
                        _csetf_skel_proof_trigger_bindings(v_new, current_value);
                    } else
                        if (pcase_var.eql($INFERENCE_BINDINGS)) {
                            _csetf_skel_proof_inference_bindings(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONCLUDED_SUPPORTS)) {
                                _csetf_skel_proof_concluded_supports(v_new, current_value);
                            } else
                                if (pcase_var.eql($PRAGMATIC_SUPPORTS)) {
                                    _csetf_skel_proof_pragmatic_supports(v_new, current_value);
                                } else
                                    if (pcase_var.eql($RULE)) {
                                        _csetf_skel_proof_rule(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PROPAGATION_MT)) {
                                            _csetf_skel_proof_propagation_mt(v_new, current_value);
                                        } else {
                                            Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_skeletal_proof(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SKELETAL_PROOF, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONCLUDED_ASENT, skel_proof_concluded_asent(obj));
        funcall(visitor_fn, obj, $SLOT, $CONCLUDED_TRUTH, skel_proof_concluded_truth(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIGGER_BINDINGS, skel_proof_trigger_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $INFERENCE_BINDINGS, skel_proof_inference_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $CONCLUDED_SUPPORTS, skel_proof_concluded_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $PRAGMATIC_SUPPORTS, skel_proof_pragmatic_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $RULE, skel_proof_rule(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPAGATION_MT, skel_proof_propagation_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_SKELETAL_PROOF, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_skeletal_proof_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_skeletal_proof(obj, visitor_fn);
    }

    public static SubLObject sxhash_skeletal_proof_method(final SubLObject v_object) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$217;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(skel_proof_concluded_asent(v_object))), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(skel_proof_rule(v_object))), composite_state), composite_hash);
        return sxhash;
    }

    public static SubLObject print_skeletal_proof(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concluded_asent = skel_proof_concluded_asent(v_object);
        final SubLObject concluded_truth = skel_proof_concluded_truth(v_object);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, $str120$_A_S, $TRUE == concluded_truth ? $str83$ : $str84$__not_, concluded_asent);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_skeletal_proof(final SubLObject concluded_asent, final SubLObject concluded_truth, final SubLObject trigger_bindings, final SubLObject inference_bindings, final SubLObject concluded_supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject propagation_mt) {
        return make_skeletal_proof(list(new SubLObject[]{ $CONCLUDED_ASENT, concluded_asent, $CONCLUDED_TRUTH, concluded_truth, $TRIGGER_BINDINGS, trigger_bindings, $INFERENCE_BINDINGS, inference_bindings, $CONCLUDED_SUPPORTS, concluded_supports, $PRAGMATIC_SUPPORTS, pragmatic_supports, $RULE, rule, $PROPAGATION_MT, propagation_mt }));
    }

    public static SubLObject skeletal_proof_concluded_asent(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_concluded_asent(skeletal_proof);
    }

    public static SubLObject skeletal_proof_concluded_truth(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_concluded_truth(skeletal_proof);
    }

    public static SubLObject skeletal_proof_trigger_bindings(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_trigger_bindings(skeletal_proof);
    }

    public static SubLObject skeletal_proof_inference_bindings(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_inference_bindings(skeletal_proof);
    }

    public static SubLObject skeletal_proof_concluded_supports(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_concluded_supports(skeletal_proof);
    }

    public static SubLObject skeletal_proof_pragmatic_supports(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_pragmatic_supports(skeletal_proof);
    }

    public static SubLObject skeletal_proof_rule(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_rule(skeletal_proof);
    }

    public static SubLObject skeletal_proof_propagation_mt(final SubLObject skeletal_proof) {
        assert NIL != skeletal_proof_p(skeletal_proof) : "forward_harness.skeletal_proof_p(skeletal_proof) " + "CommonSymbols.NIL != forward_harness.skeletal_proof_p(skeletal_proof) " + skeletal_proof;
        return skel_proof_propagation_mt(skeletal_proof);
    }

    public static SubLObject placeable_proof_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_placeable_proof(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject placeable_proof_p(final SubLObject v_object) {
        return v_object.getClass() == forward_harness.$placeable_proof_native.class ? T : NIL;
    }

    public static SubLObject plac_proof_concluded_asent(final SubLObject v_object) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject plac_proof_concluded_mt(final SubLObject v_object) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject plac_proof_concluded_truth(final SubLObject v_object) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject plac_proof_assertible(final SubLObject v_object) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_plac_proof_concluded_asent(final SubLObject v_object, final SubLObject value) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_plac_proof_concluded_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_plac_proof_concluded_truth(final SubLObject v_object, final SubLObject value) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_plac_proof_assertible(final SubLObject v_object, final SubLObject value) {
        assert NIL != placeable_proof_p(v_object) : "forward_harness.placeable_proof_p(v_object) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_placeable_proof(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new forward_harness.$placeable_proof_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONCLUDED_ASENT)) {
                _csetf_plac_proof_concluded_asent(v_new, current_value);
            } else
                if (pcase_var.eql($CONCLUDED_MT)) {
                    _csetf_plac_proof_concluded_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($CONCLUDED_TRUTH)) {
                        _csetf_plac_proof_concluded_truth(v_new, current_value);
                    } else
                        if (pcase_var.eql($ASSERTIBLE)) {
                            _csetf_plac_proof_assertible(v_new, current_value);
                        } else {
                            Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_placeable_proof(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PLACEABLE_PROOF, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONCLUDED_ASENT, plac_proof_concluded_asent(obj));
        funcall(visitor_fn, obj, $SLOT, $CONCLUDED_MT, plac_proof_concluded_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $CONCLUDED_TRUTH, plac_proof_concluded_truth(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTIBLE, plac_proof_assertible(obj));
        funcall(visitor_fn, obj, $END, MAKE_PLACEABLE_PROOF, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_placeable_proof_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_placeable_proof(obj, visitor_fn);
    }

    public static SubLObject sxhash_placeable_proof_method(final SubLObject v_object) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$219;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(plac_proof_concluded_asent(v_object))), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(Sxhash.sxhash(plac_proof_concluded_mt(v_object))), composite_state), composite_hash);
        return sxhash;
    }

    public static SubLObject print_placeable_proof(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concluded_asent = plac_proof_concluded_asent(v_object);
        final SubLObject concluded_mt = plac_proof_concluded_mt(v_object);
        final SubLObject concluded_truth = plac_proof_concluded_truth(v_object);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, $str144$_A_S_in__S, new SubLObject[]{ $TRUE == concluded_truth ? $str83$ : $str84$__not_, concluded_asent, concluded_mt });
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_placeable_proof_from_assertible(final SubLObject assertible) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject argument_spec = hl_storage_modules.hl_assertible_argument_spec(assertible);
        final SubLObject hl_assertion_spec_var_$1;
        final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$1 = hl_storage_modules.hl_assertible_hl_assertion_spec(assertible);
        final SubLObject cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$1);
        final SubLObject concluded_mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$1);
        thread.resetMultipleValues();
        final SubLObject concluded_asent = clause_utilities.asent_truth_from_atomic_clause(cnf);
        final SubLObject concluded_truth = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return make_placeable_proof(list($CONCLUDED_ASENT, concluded_asent, $CONCLUDED_MT, concluded_mt, $CONCLUDED_TRUTH, concluded_truth, $ASSERTIBLE, assertible));
    }

    public static SubLObject placeable_proof_concluded_asent(final SubLObject placeable_proof) {
        assert NIL != placeable_proof_p(placeable_proof) : "forward_harness.placeable_proof_p(placeable_proof) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(placeable_proof) " + placeable_proof;
        return plac_proof_concluded_asent(placeable_proof);
    }

    public static SubLObject placeable_proof_concluded_mt(final SubLObject placeable_proof) {
        assert NIL != placeable_proof_p(placeable_proof) : "forward_harness.placeable_proof_p(placeable_proof) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(placeable_proof) " + placeable_proof;
        return plac_proof_concluded_mt(placeable_proof);
    }

    public static SubLObject placeable_proof_concluded_truth(final SubLObject placeable_proof) {
        assert NIL != placeable_proof_p(placeable_proof) : "forward_harness.placeable_proof_p(placeable_proof) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(placeable_proof) " + placeable_proof;
        return plac_proof_concluded_truth(placeable_proof);
    }

    public static SubLObject placeable_proof_assertible(final SubLObject placeable_proof) {
        assert NIL != placeable_proof_p(placeable_proof) : "forward_harness.placeable_proof_p(placeable_proof) " + "CommonSymbols.NIL != forward_harness.placeable_proof_p(placeable_proof) " + placeable_proof;
        return plac_proof_assertible(placeable_proof);
    }

    public static SubLObject forward_propagate_assertion_to_quiescence(final SubLObject assertion, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return forward_propagate_assertions_to_quiescence(list(assertion), propagation_mt);
    }

    public static SubLObject forward_propagate_assertions_to_quiescence(final SubLObject assertions, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = forward.$default_forward_propagation_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(assertions) : "list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) " + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject forward_ps = new_forward_propagation_state(assertions, propagation_mt);
        SubLObject total_triggerings = ZERO_INTEGER;
        SubLObject total_skeletal_proofs = ZERO_INTEGER;
        SubLObject total_placeable_proofs = ZERO_INTEGER;
        SubLObject total_new_assertions = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind(T, thread);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
            final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                $current_forward_problem_store$.bind(NIL, thread);
                try {
                    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                    final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                        try {
                            final SubLObject local_state;
                            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    while (NIL == forward_propagation_state_exhaustedP(forward_ps)) {
                                        if (NIL != forward_propagation_some_placeable_proofsP(forward_ps)) {
                                            total_new_assertions = add(total_new_assertions, forward_propagation_process_some_placeable_proofs(forward_ps));
                                        } else
                                            if (NIL != forward_propagation_some_skeletal_proofsP(forward_ps)) {
                                                total_placeable_proofs = add(total_placeable_proofs, forward_propagation_process_some_skeletal_proofs(forward_ps));
                                            } else
                                                if (NIL != forward_propagation_some_triggeringsP(forward_ps)) {
                                                    total_skeletal_proofs = add(total_skeletal_proofs, forward_propagation_process_some_triggerings(forward_ps));
                                                } else {
                                                    total_triggerings = add(total_triggerings, forward_propagation_process_some_assertions(forward_ps));
                                                }


                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$4, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        forward.clear_current_forward_problem_store();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                $current_forward_problem_store$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return list(total_new_assertions, total_triggerings, total_skeletal_proofs, total_placeable_proofs);
    }

    public static SubLObject forward_propagation_state_exhaustedP(final SubLObject forward_ps) {
        return makeBoolean((((NIL == forward_propagation_some_assertionsP(forward_ps)) && (NIL == forward_propagation_some_triggeringsP(forward_ps))) && (NIL == forward_propagation_some_skeletal_proofsP(forward_ps))) && (NIL == forward_propagation_some_placeable_proofsP(forward_ps)));
    }

    public static SubLObject forward_propagation_process_some_assertions(final SubLObject forward_ps) {
        SubLObject assertions_to_process_next = forward_propagation_select_next_assertions(forward_ps);
        SubLObject total_added = ZERO_INTEGER;
        assertions_to_process_next = forward_propatation_sort_assertions(assertions_to_process_next);
        forward_propagation_remove_assertions(forward_ps, assertions_to_process_next);
        SubLObject cdolist_list_var = assertions_to_process_next;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject triggerings = forward_propagation_generate_triggerings(forward_ps, assertion);
            if (NIL != triggerings) {
                forward_propagation_add_triggerings(forward_ps, triggerings);
                total_added = add(total_added, length(triggerings));
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return total_added;
    }

    public static SubLObject forward_propagation_select_next_assertions(final SubLObject forward_ps) {
        final SubLObject next_assertions = set.set_element_list(forward_ps_assertions_working_set(forward_ps));
        return next_assertions;
    }

    public static SubLObject forward_propatation_sort_assertions(final SubLObject assertions_to_process_next) {
        return assertion_utilities.sort_assertions(assertions_to_process_next);
    }

    public static SubLObject forward_propagation_generate_triggerings(final SubLObject forward_ps, final SubLObject source_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject propagation_mt = forward_propagation_state_propagation_mt(forward_ps);
        SubLObject triggerings = NIL;
        final SubLObject _prev_bind_0 = $forward_propagation_generated_triggerings$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$handle_one_forward_propagation_callback$.currentBinding(thread);
        try {
            $forward_propagation_generated_triggerings$.bind(NIL, thread);
            forward.$handle_one_forward_propagation_callback$.bind(FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING, thread);
            if (NIL != assertions_high.rule_assertionP(source_support)) {
                forward.forward_propagate_rule(source_support, propagation_mt);
            } else {
                forward.forward_propagate_asent_support(source_support, propagation_mt);
            }
            triggerings = nreverse($forward_propagation_generated_triggerings$.getDynamicValue(thread));
        } finally {
            forward.$handle_one_forward_propagation_callback$.rebind(_prev_bind_2, thread);
            $forward_propagation_generated_triggerings$.rebind(_prev_bind_0, thread);
        }
        return triggerings;
    }

    public static SubLObject forward_propagate_note_generated_triggering(final SubLObject query_dnf, final SubLObject pragmatic_dnf, final SubLObject propagation_mt, final SubLObject target_asent, final SubLObject target_truth, final SubLObject trigger_bindings, final SubLObject rule, final SubLObject trigger_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_support = (NIL != trigger_supports) ? trigger_supports.first() : NIL;
        final SubLObject source_asent = (NIL != source_support) ? arguments.support_sentence(source_support) : NIL;
        final SubLObject source_truth = (NIL != source_support) ? arguments.support_truth(source_support) : NIL;
        final SubLObject restricted_examine_asent = forward.$forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread);
        final SubLObject triggering = new_forward_triggering(rule, source_asent, source_truth, target_asent, target_truth, query_dnf, pragmatic_dnf, propagation_mt, restricted_examine_asent, trigger_bindings, trigger_supports);
        $forward_propagation_generated_triggerings$.setDynamicValue(cons(triggering, $forward_propagation_generated_triggerings$.getDynamicValue(thread)), thread);
        return triggering;
    }

    public static SubLObject forward_propagation_process_some_triggerings(final SubLObject forward_ps) {
        SubLObject triggerings_to_process_next = forward_propagation_select_next_triggerings(forward_ps);
        SubLObject total_added = ZERO_INTEGER;
        triggerings_to_process_next = forward_propatation_sort_triggerings(triggerings_to_process_next);
        forward_propagation_remove_triggerings(forward_ps, triggerings_to_process_next);
        SubLObject cdolist_list_var = triggerings_to_process_next;
        SubLObject triggering = NIL;
        triggering = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject skeletal_proofs = forward_propagation_generate_skeletal_proofs(triggering);
            if (NIL != skeletal_proofs) {
                forward_propagation_add_skeletal_proofs(forward_ps, skeletal_proofs);
                total_added = add(total_added, length(skeletal_proofs));
            }
            cdolist_list_var = cdolist_list_var.rest();
            triggering = cdolist_list_var.first();
        } 
        return total_added;
    }

    public static SubLObject forward_propagation_select_next_triggerings(final SubLObject forward_ps) {
        final SubLObject next_triggerings = set.set_element_list(forward_ps_triggerings_working_set(forward_ps));
        return next_triggerings;
    }

    public static SubLObject forward_propatation_sort_triggerings(final SubLObject triggerings_to_process_next) {
        return triggerings_to_process_next;
    }

    public static SubLObject forward_propagation_generate_skeletal_proofs(final SubLObject triggering) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = forward_triggering_rule(triggering);
        final SubLObject target_asent = forward_triggering_target_asent(triggering);
        final SubLObject target_truth = forward_triggering_target_truth(triggering);
        final SubLObject query_dnf = forward_triggering_query_dnf(triggering);
        final SubLObject pragmatic_dnf = forward_triggering_pragmatic_dnf(triggering);
        final SubLObject propagation_mt = forward_triggering_propagation_mt(triggering);
        final SubLObject restricted_examine_asent = forward_triggering_restricted_examine_asent(triggering);
        final SubLObject trigger_bindings = forward_triggering_trigger_bindings(triggering);
        final SubLObject trigger_supports = forward_triggering_trigger_supports(triggering);
        SubLObject skeletal_proofs = NIL;
        final SubLObject _prev_bind_0 = $forward_propagation_generated_skeletal_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$forward_non_trigger_literal_restricted_examine_asent$.currentBinding(thread);
        final SubLObject _prev_bind_3 = forward.$add_forward_deductions_from_supports_callback$.currentBinding(thread);
        try {
            $forward_propagation_generated_skeletal_proofs$.bind(NIL, thread);
            forward.$forward_non_trigger_literal_restricted_examine_asent$.bind(restricted_examine_asent, thread);
            forward.$add_forward_deductions_from_supports_callback$.bind(FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF, thread);
            forward.handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports);
            skeletal_proofs = nreverse($forward_propagation_generated_skeletal_proofs$.getDynamicValue(thread));
        } finally {
            forward.$add_forward_deductions_from_supports_callback$.rebind(_prev_bind_3, thread);
            forward.$forward_non_trigger_literal_restricted_examine_asent$.rebind(_prev_bind_2, thread);
            $forward_propagation_generated_skeletal_proofs$.rebind(_prev_bind_0, thread);
        }
        return skeletal_proofs;
    }

    public static SubLObject forward_propagate_note_generated_skeletal_proof(final SubLObject propagation_mt, final SubLObject concluded_asent, final SubLObject concluded_truth, final SubLObject concluded_supports, final SubLObject pragmatic_supports, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject skeletal_proof = new_skeletal_proof(concluded_asent, concluded_truth, trigger_bindings, inference_bindings, concluded_supports, pragmatic_supports, rule, propagation_mt);
        $forward_propagation_generated_skeletal_proofs$.setDynamicValue(cons(skeletal_proof, $forward_propagation_generated_skeletal_proofs$.getDynamicValue(thread)), thread);
        return skeletal_proof;
    }

    public static SubLObject forward_propagation_process_some_skeletal_proofs(final SubLObject forward_ps) {
        SubLObject skeletal_proofs_to_process_next = forward_propagation_select_next_skeletal_proofs(forward_ps);
        SubLObject total_added = ZERO_INTEGER;
        skeletal_proofs_to_process_next = forward_propatation_sort_skeletal_proofs(skeletal_proofs_to_process_next);
        forward_propagation_remove_skeletal_proofs(forward_ps, skeletal_proofs_to_process_next);
        SubLObject cdolist_list_var = skeletal_proofs_to_process_next;
        SubLObject skeletal_proof = NIL;
        skeletal_proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject placeable_proofs = forward_propagation_generate_placeable_proofs(skeletal_proof);
            if (NIL != placeable_proofs) {
                forward_propagation_add_placeable_proofs(forward_ps, placeable_proofs);
                total_added = add(total_added, length(placeable_proofs));
            }
            cdolist_list_var = cdolist_list_var.rest();
            skeletal_proof = cdolist_list_var.first();
        } 
        return total_added;
    }

    public static SubLObject forward_propagation_select_next_skeletal_proofs(final SubLObject forward_ps) {
        final SubLObject next_skeletal_proofs = set.set_element_list(forward_ps_skeletal_proofs_working_set(forward_ps));
        return next_skeletal_proofs;
    }

    public static SubLObject forward_propatation_sort_skeletal_proofs(final SubLObject skeletal_proofs_to_process_next) {
        return skeletal_proofs_to_process_next;
    }

    public static SubLObject forward_propagation_generate_placeable_proofs(final SubLObject skeletal_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concluded_asent = skeletal_proof_concluded_asent(skeletal_proof);
        final SubLObject concluded_truth = skeletal_proof_concluded_truth(skeletal_proof);
        final SubLObject trigger_bindings = skeletal_proof_trigger_bindings(skeletal_proof);
        final SubLObject inference_bindings = skeletal_proof_inference_bindings(skeletal_proof);
        final SubLObject concluded_supports = skeletal_proof_concluded_supports(skeletal_proof);
        final SubLObject pragmatic_supports = skeletal_proof_pragmatic_supports(skeletal_proof);
        final SubLObject rule = skeletal_proof_rule(skeletal_proof);
        final SubLObject propagation_mt = skeletal_proof_propagation_mt(skeletal_proof);
        SubLObject placeable_proofs = NIL;
        final SubLObject _prev_bind_0 = forward.$forward_inference_assertibles_queue$.currentBinding(thread);
        try {
            forward.$forward_inference_assertibles_queue$.bind(queues.create_queue(UNPROVIDED), thread);
            forward.add_forward_deductions_from_supports(propagation_mt, concluded_asent, concluded_truth, concluded_supports, pragmatic_supports, rule, trigger_bindings, inference_bindings);
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(forward.$forward_inference_assertibles_queue$.getDynamicValue(thread));
            SubLObject assertible = NIL;
            assertible = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject placeable_proof = new_placeable_proof_from_assertible(assertible);
                placeable_proofs = cons(placeable_proof, placeable_proofs);
                cdolist_list_var = cdolist_list_var.rest();
                assertible = cdolist_list_var.first();
            } 
        } finally {
            forward.$forward_inference_assertibles_queue$.rebind(_prev_bind_0, thread);
        }
        return nreverse(placeable_proofs);
    }

    public static SubLObject forward_propagation_process_some_placeable_proofs(final SubLObject forward_ps) {
        SubLObject placeable_proofs_to_process_next = forward_propagation_select_next_placeable_proofs(forward_ps);
        SubLObject total_added = ZERO_INTEGER;
        placeable_proofs_to_process_next = forward_propatation_sort_placeable_proofs(placeable_proofs_to_process_next);
        forward_propagation_remove_placeable_proofs(forward_ps, placeable_proofs_to_process_next);
        final SubLObject assertibles_queue = forward_propagation_assertibles_queue_from_placeable_proofs(placeable_proofs_to_process_next);
        final SubLObject new_assertions = forward.forward_propagate_handle_batched_assertibles(assertibles_queue, T);
        if (NIL != new_assertions) {
            memoization_state.clear_all_current_memoization();
            forward_propagation_add_assertions(forward_ps, new_assertions);
            total_added = add(total_added, length(new_assertions));
        }
        return total_added;
    }

    public static SubLObject forward_propagation_select_next_placeable_proofs(final SubLObject forward_ps) {
        final SubLObject next_placeable_proofs = set.set_element_list(forward_ps_placeable_proofs_working_set(forward_ps));
        return next_placeable_proofs;
    }

    public static SubLObject forward_propatation_sort_placeable_proofs(final SubLObject placeable_proofs_to_process_next) {
        return placeable_proofs_to_process_next;
    }

    public static SubLObject forward_propagation_assertibles_queue_from_placeable_proofs(final SubLObject placeable_proofs) {
        final SubLObject assertibles = Mapping.mapcar(symbol_function(PLACEABLE_PROOF_ASSERTIBLE), placeable_proofs);
        final SubLObject assertibles_queue = queues.create_queue(assertibles);
        return assertibles_queue;
    }

    public static SubLObject declare_forward_harness_file() {
        declareFunction(me, "forward_propagation_state_print_function_trampoline", "FORWARD-PROPAGATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "forward_propagation_state_p", "FORWARD-PROPAGATION-STATE-P", 1, 0, false);
        new forward_harness.$forward_propagation_state_p$UnaryFunction();
        declareFunction(me, "forward_ps_assertions_working_set", "FORWARD-PS-ASSERTIONS-WORKING-SET", 1, 0, false);
        declareFunction(me, "forward_ps_triggerings_working_set", "FORWARD-PS-TRIGGERINGS-WORKING-SET", 1, 0, false);
        declareFunction(me, "forward_ps_skeletal_proofs_working_set", "FORWARD-PS-SKELETAL-PROOFS-WORKING-SET", 1, 0, false);
        declareFunction(me, "forward_ps_placeable_proofs_working_set", "FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET", 1, 0, false);
        declareFunction(me, "forward_ps_propagation_mt", "FORWARD-PS-PROPAGATION-MT", 1, 0, false);
        declareFunction(me, "_csetf_forward_ps_assertions_working_set", "_CSETF-FORWARD-PS-ASSERTIONS-WORKING-SET", 2, 0, false);
        declareFunction(me, "_csetf_forward_ps_triggerings_working_set", "_CSETF-FORWARD-PS-TRIGGERINGS-WORKING-SET", 2, 0, false);
        declareFunction(me, "_csetf_forward_ps_skeletal_proofs_working_set", "_CSETF-FORWARD-PS-SKELETAL-PROOFS-WORKING-SET", 2, 0, false);
        declareFunction(me, "_csetf_forward_ps_placeable_proofs_working_set", "_CSETF-FORWARD-PS-PLACEABLE-PROOFS-WORKING-SET", 2, 0, false);
        declareFunction(me, "_csetf_forward_ps_propagation_mt", "_CSETF-FORWARD-PS-PROPAGATION-MT", 2, 0, false);
        declareFunction(me, "make_forward_propagation_state", "MAKE-FORWARD-PROPAGATION-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_forward_propagation_state", "VISIT-DEFSTRUCT-FORWARD-PROPAGATION-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_forward_propagation_state_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATION-STATE-METHOD", 2, 0, false);
        declareFunction(me, "print_forward_propagation_state", "PRINT-FORWARD-PROPAGATION-STATE", 3, 0, false);
        declareFunction(me, "new_forward_propagation_state", "NEW-FORWARD-PROPAGATION-STATE", 0, 2, false);
        declareFunction(me, "forward_propagation_state_propagation_mt", "FORWARD-PROPAGATION-STATE-PROPAGATION-MT", 1, 0, false);
        declareFunction(me, "forward_propagation_state_assertions_size", "FORWARD-PROPAGATION-STATE-ASSERTIONS-SIZE", 1, 0, false);
        declareFunction(me, "forward_propagation_some_assertionsP", "FORWARD-PROPAGATION-SOME-ASSERTIONS?", 1, 0, false);
        declareFunction(me, "forward_propagation_state_triggerings_size", "FORWARD-PROPAGATION-STATE-TRIGGERINGS-SIZE", 1, 0, false);
        declareFunction(me, "forward_propagation_some_triggeringsP", "FORWARD-PROPAGATION-SOME-TRIGGERINGS?", 1, 0, false);
        declareFunction(me, "forward_propagation_state_skeletal_proofs_size", "FORWARD-PROPAGATION-STATE-SKELETAL-PROOFS-SIZE", 1, 0, false);
        declareFunction(me, "forward_propagation_some_skeletal_proofsP", "FORWARD-PROPAGATION-SOME-SKELETAL-PROOFS?", 1, 0, false);
        declareFunction(me, "forward_propagation_state_placeable_proofs_size", "FORWARD-PROPAGATION-STATE-PLACEABLE-PROOFS-SIZE", 1, 0, false);
        declareFunction(me, "forward_propagation_some_placeable_proofsP", "FORWARD-PROPAGATION-SOME-PLACEABLE-PROOFS?", 1, 0, false);
        declareFunction(me, "forward_propagation_add_assertions", "FORWARD-PROPAGATION-ADD-ASSERTIONS", 2, 0, false);
        declareFunction(me, "forward_propagation_remove_assertions", "FORWARD-PROPAGATION-REMOVE-ASSERTIONS", 2, 0, false);
        declareFunction(me, "forward_propagation_add_triggerings", "FORWARD-PROPAGATION-ADD-TRIGGERINGS", 2, 0, false);
        declareFunction(me, "forward_propagation_remove_triggerings", "FORWARD-PROPAGATION-REMOVE-TRIGGERINGS", 2, 0, false);
        declareFunction(me, "forward_propagation_add_skeletal_proofs", "FORWARD-PROPAGATION-ADD-SKELETAL-PROOFS", 2, 0, false);
        declareFunction(me, "forward_propagation_remove_skeletal_proofs", "FORWARD-PROPAGATION-REMOVE-SKELETAL-PROOFS", 2, 0, false);
        declareFunction(me, "forward_propagation_add_placeable_proofs", "FORWARD-PROPAGATION-ADD-PLACEABLE-PROOFS", 2, 0, false);
        declareFunction(me, "forward_propagation_remove_placeable_proofs", "FORWARD-PROPAGATION-REMOVE-PLACEABLE-PROOFS", 2, 0, false);
        declareFunction(me, "forward_triggering_print_function_trampoline", "FORWARD-TRIGGERING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "forward_triggering_p", "FORWARD-TRIGGERING-P", 1, 0, false);
        new forward_harness.$forward_triggering_p$UnaryFunction();
        declareFunction(me, "forward_trig_rule", "FORWARD-TRIG-RULE", 1, 0, false);
        declareFunction(me, "forward_trig_source_asent", "FORWARD-TRIG-SOURCE-ASENT", 1, 0, false);
        declareFunction(me, "forward_trig_source_truth", "FORWARD-TRIG-SOURCE-TRUTH", 1, 0, false);
        declareFunction(me, "forward_trig_target_asent", "FORWARD-TRIG-TARGET-ASENT", 1, 0, false);
        declareFunction(me, "forward_trig_target_truth", "FORWARD-TRIG-TARGET-TRUTH", 1, 0, false);
        declareFunction(me, "forward_trig_query_dnf", "FORWARD-TRIG-QUERY-DNF", 1, 0, false);
        declareFunction(me, "forward_trig_pragmatic_dnf", "FORWARD-TRIG-PRAGMATIC-DNF", 1, 0, false);
        declareFunction(me, "forward_trig_propagation_mt", "FORWARD-TRIG-PROPAGATION-MT", 1, 0, false);
        declareFunction(me, "forward_trig_restricted_examine_asent", "FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT", 1, 0, false);
        declareFunction(me, "forward_trig_trigger_bindings", "FORWARD-TRIG-TRIGGER-BINDINGS", 1, 0, false);
        declareFunction(me, "forward_trig_trigger_supports", "FORWARD-TRIG-TRIGGER-SUPPORTS", 1, 0, false);
        declareFunction(me, "_csetf_forward_trig_rule", "_CSETF-FORWARD-TRIG-RULE", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_source_asent", "_CSETF-FORWARD-TRIG-SOURCE-ASENT", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_source_truth", "_CSETF-FORWARD-TRIG-SOURCE-TRUTH", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_target_asent", "_CSETF-FORWARD-TRIG-TARGET-ASENT", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_target_truth", "_CSETF-FORWARD-TRIG-TARGET-TRUTH", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_query_dnf", "_CSETF-FORWARD-TRIG-QUERY-DNF", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_pragmatic_dnf", "_CSETF-FORWARD-TRIG-PRAGMATIC-DNF", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_propagation_mt", "_CSETF-FORWARD-TRIG-PROPAGATION-MT", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_restricted_examine_asent", "_CSETF-FORWARD-TRIG-RESTRICTED-EXAMINE-ASENT", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_trigger_bindings", "_CSETF-FORWARD-TRIG-TRIGGER-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_forward_trig_trigger_supports", "_CSETF-FORWARD-TRIG-TRIGGER-SUPPORTS", 2, 0, false);
        declareFunction(me, "make_forward_triggering", "MAKE-FORWARD-TRIGGERING", 0, 1, false);
        declareFunction(me, "visit_defstruct_forward_triggering", "VISIT-DEFSTRUCT-FORWARD-TRIGGERING", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_forward_triggering_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-TRIGGERING-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_forward_triggering_method", "SXHASH-FORWARD-TRIGGERING-METHOD", 1, 0, false);
        declareFunction(me, "print_forward_triggering", "PRINT-FORWARD-TRIGGERING", 3, 0, false);
        declareFunction(me, "new_forward_triggering", "NEW-FORWARD-TRIGGERING", 11, 0, false);
        declareFunction(me, "forward_triggering_rule", "FORWARD-TRIGGERING-RULE", 1, 0, false);
        declareFunction(me, "forward_triggering_source_asent", "FORWARD-TRIGGERING-SOURCE-ASENT", 1, 0, false);
        declareFunction(me, "forward_triggering_source_truth", "FORWARD-TRIGGERING-SOURCE-TRUTH", 1, 0, false);
        declareFunction(me, "forward_triggering_target_asent", "FORWARD-TRIGGERING-TARGET-ASENT", 1, 0, false);
        declareFunction(me, "forward_triggering_target_truth", "FORWARD-TRIGGERING-TARGET-TRUTH", 1, 0, false);
        declareFunction(me, "forward_triggering_query_dnf", "FORWARD-TRIGGERING-QUERY-DNF", 1, 0, false);
        declareFunction(me, "forward_triggering_pragmatic_dnf", "FORWARD-TRIGGERING-PRAGMATIC-DNF", 1, 0, false);
        declareFunction(me, "forward_triggering_propagation_mt", "FORWARD-TRIGGERING-PROPAGATION-MT", 1, 0, false);
        declareFunction(me, "forward_triggering_restricted_examine_asent", "FORWARD-TRIGGERING-RESTRICTED-EXAMINE-ASENT", 1, 0, false);
        declareFunction(me, "forward_triggering_trigger_bindings", "FORWARD-TRIGGERING-TRIGGER-BINDINGS", 1, 0, false);
        declareFunction(me, "forward_triggering_trigger_supports", "FORWARD-TRIGGERING-TRIGGER-SUPPORTS", 1, 0, false);
        declareFunction(me, "skeletal_proof_print_function_trampoline", "SKELETAL-PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "skeletal_proof_p", "SKELETAL-PROOF-P", 1, 0, false);
        new forward_harness.$skeletal_proof_p$UnaryFunction();
        declareFunction(me, "skel_proof_concluded_asent", "SKEL-PROOF-CONCLUDED-ASENT", 1, 0, false);
        declareFunction(me, "skel_proof_concluded_truth", "SKEL-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        declareFunction(me, "skel_proof_trigger_bindings", "SKEL-PROOF-TRIGGER-BINDINGS", 1, 0, false);
        declareFunction(me, "skel_proof_inference_bindings", "SKEL-PROOF-INFERENCE-BINDINGS", 1, 0, false);
        declareFunction(me, "skel_proof_concluded_supports", "SKEL-PROOF-CONCLUDED-SUPPORTS", 1, 0, false);
        declareFunction(me, "skel_proof_pragmatic_supports", "SKEL-PROOF-PRAGMATIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "skel_proof_rule", "SKEL-PROOF-RULE", 1, 0, false);
        declareFunction(me, "skel_proof_propagation_mt", "SKEL-PROOF-PROPAGATION-MT", 1, 0, false);
        declareFunction(me, "_csetf_skel_proof_concluded_asent", "_CSETF-SKEL-PROOF-CONCLUDED-ASENT", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_concluded_truth", "_CSETF-SKEL-PROOF-CONCLUDED-TRUTH", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_trigger_bindings", "_CSETF-SKEL-PROOF-TRIGGER-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_inference_bindings", "_CSETF-SKEL-PROOF-INFERENCE-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_concluded_supports", "_CSETF-SKEL-PROOF-CONCLUDED-SUPPORTS", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_pragmatic_supports", "_CSETF-SKEL-PROOF-PRAGMATIC-SUPPORTS", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_rule", "_CSETF-SKEL-PROOF-RULE", 2, 0, false);
        declareFunction(me, "_csetf_skel_proof_propagation_mt", "_CSETF-SKEL-PROOF-PROPAGATION-MT", 2, 0, false);
        declareFunction(me, "make_skeletal_proof", "MAKE-SKELETAL-PROOF", 0, 1, false);
        declareFunction(me, "visit_defstruct_skeletal_proof", "VISIT-DEFSTRUCT-SKELETAL-PROOF", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_skeletal_proof_method", "VISIT-DEFSTRUCT-OBJECT-SKELETAL-PROOF-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_skeletal_proof_method", "SXHASH-SKELETAL-PROOF-METHOD", 1, 0, false);
        declareFunction(me, "print_skeletal_proof", "PRINT-SKELETAL-PROOF", 3, 0, false);
        declareFunction(me, "new_skeletal_proof", "NEW-SKELETAL-PROOF", 8, 0, false);
        declareFunction(me, "skeletal_proof_concluded_asent", "SKELETAL-PROOF-CONCLUDED-ASENT", 1, 0, false);
        declareFunction(me, "skeletal_proof_concluded_truth", "SKELETAL-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        declareFunction(me, "skeletal_proof_trigger_bindings", "SKELETAL-PROOF-TRIGGER-BINDINGS", 1, 0, false);
        declareFunction(me, "skeletal_proof_inference_bindings", "SKELETAL-PROOF-INFERENCE-BINDINGS", 1, 0, false);
        declareFunction(me, "skeletal_proof_concluded_supports", "SKELETAL-PROOF-CONCLUDED-SUPPORTS", 1, 0, false);
        declareFunction(me, "skeletal_proof_pragmatic_supports", "SKELETAL-PROOF-PRAGMATIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "skeletal_proof_rule", "SKELETAL-PROOF-RULE", 1, 0, false);
        declareFunction(me, "skeletal_proof_propagation_mt", "SKELETAL-PROOF-PROPAGATION-MT", 1, 0, false);
        declareFunction(me, "placeable_proof_print_function_trampoline", "PLACEABLE-PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "placeable_proof_p", "PLACEABLE-PROOF-P", 1, 0, false);
        new forward_harness.$placeable_proof_p$UnaryFunction();
        declareFunction(me, "plac_proof_concluded_asent", "PLAC-PROOF-CONCLUDED-ASENT", 1, 0, false);
        declareFunction(me, "plac_proof_concluded_mt", "PLAC-PROOF-CONCLUDED-MT", 1, 0, false);
        declareFunction(me, "plac_proof_concluded_truth", "PLAC-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        declareFunction(me, "plac_proof_assertible", "PLAC-PROOF-ASSERTIBLE", 1, 0, false);
        declareFunction(me, "_csetf_plac_proof_concluded_asent", "_CSETF-PLAC-PROOF-CONCLUDED-ASENT", 2, 0, false);
        declareFunction(me, "_csetf_plac_proof_concluded_mt", "_CSETF-PLAC-PROOF-CONCLUDED-MT", 2, 0, false);
        declareFunction(me, "_csetf_plac_proof_concluded_truth", "_CSETF-PLAC-PROOF-CONCLUDED-TRUTH", 2, 0, false);
        declareFunction(me, "_csetf_plac_proof_assertible", "_CSETF-PLAC-PROOF-ASSERTIBLE", 2, 0, false);
        declareFunction(me, "make_placeable_proof", "MAKE-PLACEABLE-PROOF", 0, 1, false);
        declareFunction(me, "visit_defstruct_placeable_proof", "VISIT-DEFSTRUCT-PLACEABLE-PROOF", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_placeable_proof_method", "VISIT-DEFSTRUCT-OBJECT-PLACEABLE-PROOF-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_placeable_proof_method", "SXHASH-PLACEABLE-PROOF-METHOD", 1, 0, false);
        declareFunction(me, "print_placeable_proof", "PRINT-PLACEABLE-PROOF", 3, 0, false);
        declareFunction(me, "new_placeable_proof_from_assertible", "NEW-PLACEABLE-PROOF-FROM-ASSERTIBLE", 1, 0, false);
        declareFunction(me, "placeable_proof_concluded_asent", "PLACEABLE-PROOF-CONCLUDED-ASENT", 1, 0, false);
        declareFunction(me, "placeable_proof_concluded_mt", "PLACEABLE-PROOF-CONCLUDED-MT", 1, 0, false);
        declareFunction(me, "placeable_proof_concluded_truth", "PLACEABLE-PROOF-CONCLUDED-TRUTH", 1, 0, false);
        declareFunction(me, "placeable_proof_assertible", "PLACEABLE-PROOF-ASSERTIBLE", 1, 0, false);
        declareFunction(me, "forward_propagate_assertion_to_quiescence", "FORWARD-PROPAGATE-ASSERTION-TO-QUIESCENCE", 1, 1, false);
        declareFunction(me, "forward_propagate_assertions_to_quiescence", "FORWARD-PROPAGATE-ASSERTIONS-TO-QUIESCENCE", 1, 1, false);
        declareFunction(me, "forward_propagation_state_exhaustedP", "FORWARD-PROPAGATION-STATE-EXHAUSTED?", 1, 0, false);
        declareFunction(me, "forward_propagation_process_some_assertions", "FORWARD-PROPAGATION-PROCESS-SOME-ASSERTIONS", 1, 0, false);
        declareFunction(me, "forward_propagation_select_next_assertions", "FORWARD-PROPAGATION-SELECT-NEXT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "forward_propatation_sort_assertions", "FORWARD-PROPATATION-SORT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "forward_propagation_generate_triggerings", "FORWARD-PROPAGATION-GENERATE-TRIGGERINGS", 2, 0, false);
        declareFunction(me, "forward_propagate_note_generated_triggering", "FORWARD-PROPAGATE-NOTE-GENERATED-TRIGGERING", 8, 0, false);
        declareFunction(me, "forward_propagation_process_some_triggerings", "FORWARD-PROPAGATION-PROCESS-SOME-TRIGGERINGS", 1, 0, false);
        declareFunction(me, "forward_propagation_select_next_triggerings", "FORWARD-PROPAGATION-SELECT-NEXT-TRIGGERINGS", 1, 0, false);
        declareFunction(me, "forward_propatation_sort_triggerings", "FORWARD-PROPATATION-SORT-TRIGGERINGS", 1, 0, false);
        declareFunction(me, "forward_propagation_generate_skeletal_proofs", "FORWARD-PROPAGATION-GENERATE-SKELETAL-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propagate_note_generated_skeletal_proof", "FORWARD-PROPAGATE-NOTE-GENERATED-SKELETAL-PROOF", 8, 0, false);
        declareFunction(me, "forward_propagation_process_some_skeletal_proofs", "FORWARD-PROPAGATION-PROCESS-SOME-SKELETAL-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propagation_select_next_skeletal_proofs", "FORWARD-PROPAGATION-SELECT-NEXT-SKELETAL-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propatation_sort_skeletal_proofs", "FORWARD-PROPATATION-SORT-SKELETAL-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propagation_generate_placeable_proofs", "FORWARD-PROPAGATION-GENERATE-PLACEABLE-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propagation_process_some_placeable_proofs", "FORWARD-PROPAGATION-PROCESS-SOME-PLACEABLE-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propagation_select_next_placeable_proofs", "FORWARD-PROPAGATION-SELECT-NEXT-PLACEABLE-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propatation_sort_placeable_proofs", "FORWARD-PROPATATION-SORT-PLACEABLE-PROOFS", 1, 0, false);
        declareFunction(me, "forward_propagation_assertibles_queue_from_placeable_proofs", "FORWARD-PROPAGATION-ASSERTIBLES-QUEUE-FROM-PLACEABLE-PROOFS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_forward_harness_file() {
        defconstant("*DTP-FORWARD-PROPAGATION-STATE*", FORWARD_PROPAGATION_STATE);
        defconstant("*DTP-FORWARD-TRIGGERING*", FORWARD_TRIGGERING);
        defconstant("*DTP-SKELETAL-PROOF*", SKELETAL_PROOF);
        defconstant("*DTP-PLACEABLE-PROOF*", PLACEABLE_PROOF);
        defparameter("*FORWARD-PROPAGATION-GENERATED-TRIGGERINGS*", NIL);
        defparameter("*FORWARD-PROPAGATION-GENERATED-SKELETAL-PROOFS*", NIL);
        return NIL;
    }

    public static SubLObject setup_forward_harness_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_forward_propagation_state$.getGlobalValue(), symbol_function(FORWARD_PROPAGATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FORWARD_PS_ASSERTIONS_WORKING_SET, _CSETF_FORWARD_PS_ASSERTIONS_WORKING_SET);
        def_csetf(FORWARD_PS_TRIGGERINGS_WORKING_SET, _CSETF_FORWARD_PS_TRIGGERINGS_WORKING_SET);
        def_csetf(FORWARD_PS_SKELETAL_PROOFS_WORKING_SET, _CSETF_FORWARD_PS_SKELETAL_PROOFS_WORKING_SET);
        def_csetf(FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET, _CSETF_FORWARD_PS_PLACEABLE_PROOFS_WORKING_SET);
        def_csetf(FORWARD_PS_PROPAGATION_MT, _CSETF_FORWARD_PS_PROPAGATION_MT);
        identity(FORWARD_PROPAGATION_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_propagation_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATION_STATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_forward_triggering$.getGlobalValue(), symbol_function(FORWARD_TRIGGERING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list42);
        def_csetf(FORWARD_TRIG_RULE, _CSETF_FORWARD_TRIG_RULE);
        def_csetf(FORWARD_TRIG_SOURCE_ASENT, _CSETF_FORWARD_TRIG_SOURCE_ASENT);
        def_csetf(FORWARD_TRIG_SOURCE_TRUTH, _CSETF_FORWARD_TRIG_SOURCE_TRUTH);
        def_csetf(FORWARD_TRIG_TARGET_ASENT, _CSETF_FORWARD_TRIG_TARGET_ASENT);
        def_csetf(FORWARD_TRIG_TARGET_TRUTH, _CSETF_FORWARD_TRIG_TARGET_TRUTH);
        def_csetf(FORWARD_TRIG_QUERY_DNF, _CSETF_FORWARD_TRIG_QUERY_DNF);
        def_csetf(FORWARD_TRIG_PRAGMATIC_DNF, _CSETF_FORWARD_TRIG_PRAGMATIC_DNF);
        def_csetf(FORWARD_TRIG_PROPAGATION_MT, _CSETF_FORWARD_TRIG_PROPAGATION_MT);
        def_csetf(FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT, _CSETF_FORWARD_TRIG_RESTRICTED_EXAMINE_ASENT);
        def_csetf(FORWARD_TRIG_TRIGGER_BINDINGS, _CSETF_FORWARD_TRIG_TRIGGER_BINDINGS);
        def_csetf(FORWARD_TRIG_TRIGGER_SUPPORTS, _CSETF_FORWARD_TRIG_TRIGGER_SUPPORTS);
        identity(FORWARD_TRIGGERING);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_triggering$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORWARD_TRIGGERING_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_forward_triggering$.getGlobalValue(), symbol_function(SXHASH_FORWARD_TRIGGERING_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_skeletal_proof$.getGlobalValue(), symbol_function(SKELETAL_PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list94);
        def_csetf(SKEL_PROOF_CONCLUDED_ASENT, _CSETF_SKEL_PROOF_CONCLUDED_ASENT);
        def_csetf(SKEL_PROOF_CONCLUDED_TRUTH, _CSETF_SKEL_PROOF_CONCLUDED_TRUTH);
        def_csetf(SKEL_PROOF_TRIGGER_BINDINGS, _CSETF_SKEL_PROOF_TRIGGER_BINDINGS);
        def_csetf(SKEL_PROOF_INFERENCE_BINDINGS, _CSETF_SKEL_PROOF_INFERENCE_BINDINGS);
        def_csetf(SKEL_PROOF_CONCLUDED_SUPPORTS, _CSETF_SKEL_PROOF_CONCLUDED_SUPPORTS);
        def_csetf(SKEL_PROOF_PRAGMATIC_SUPPORTS, _CSETF_SKEL_PROOF_PRAGMATIC_SUPPORTS);
        def_csetf(SKEL_PROOF_RULE, _CSETF_SKEL_PROOF_RULE);
        def_csetf(SKEL_PROOF_PROPAGATION_MT, _CSETF_SKEL_PROOF_PROPAGATION_MT);
        identity(SKELETAL_PROOF);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_skeletal_proof$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SKELETAL_PROOF_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_skeletal_proof$.getGlobalValue(), symbol_function(SXHASH_SKELETAL_PROOF_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_placeable_proof$.getGlobalValue(), symbol_function(PLACEABLE_PROOF_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list129);
        def_csetf(PLAC_PROOF_CONCLUDED_ASENT, _CSETF_PLAC_PROOF_CONCLUDED_ASENT);
        def_csetf(PLAC_PROOF_CONCLUDED_MT, _CSETF_PLAC_PROOF_CONCLUDED_MT);
        def_csetf(PLAC_PROOF_CONCLUDED_TRUTH, _CSETF_PLAC_PROOF_CONCLUDED_TRUTH);
        def_csetf(PLAC_PROOF_ASSERTIBLE, _CSETF_PLAC_PROOF_ASSERTIBLE);
        identity(PLACEABLE_PROOF);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_placeable_proof$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PLACEABLE_PROOF_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_placeable_proof$.getGlobalValue(), symbol_function(SXHASH_PLACEABLE_PROOF_METHOD));
        note_funcall_helper_function(FORWARD_PROPAGATE_NOTE_GENERATED_TRIGGERING);
        note_funcall_helper_function(FORWARD_PROPAGATE_NOTE_GENERATED_SKELETAL_PROOF);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_forward_harness_file();
    }

    @Override
    public void initializeVariables() {
        init_forward_harness_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forward_harness_file();
    }

    static {




























































































































































    }

    public static final class $forward_propagation_state_native extends SubLStructNative {
        public SubLObject $assertions_working_set;

        public SubLObject $triggerings_working_set;

        public SubLObject $skeletal_proofs_working_set;

        public SubLObject $placeable_proofs_working_set;

        public SubLObject $propagation_mt;

        private static final SubLStructDeclNative structDecl;

        public $forward_propagation_state_native() {
            this.$assertions_working_set = Lisp.NIL;
            this.$triggerings_working_set = Lisp.NIL;
            this.$skeletal_proofs_working_set = Lisp.NIL;
            this.$placeable_proofs_working_set = Lisp.NIL;
            this.$propagation_mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$assertions_working_set;
        }

        @Override
        public SubLObject getField3() {
            return this.$triggerings_working_set;
        }

        @Override
        public SubLObject getField4() {
            return this.$skeletal_proofs_working_set;
        }

        @Override
        public SubLObject getField5() {
            return this.$placeable_proofs_working_set;
        }

        @Override
        public SubLObject getField6() {
            return this.$propagation_mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$assertions_working_set = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$triggerings_working_set = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$skeletal_proofs_working_set = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$placeable_proofs_working_set = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$propagation_mt = value;
        }

        static {
            structDecl = makeStructDeclNative(forward_harness.$forward_propagation_state_native.class, FORWARD_PROPAGATION_STATE, FORWARD_PROPAGATION_STATE_P, $list2, $list3, new String[]{ "$assertions_working_set", "$triggerings_working_set", "$skeletal_proofs_working_set", "$placeable_proofs_working_set", "$propagation_mt" }, $list4, $list5, PRINT_FORWARD_PROPAGATION_STATE);
        }
    }

    public static final class $forward_propagation_state_p$UnaryFunction extends UnaryFunction {
        public $forward_propagation_state_p$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-PROPAGATION-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_propagation_state_p(arg1);
        }
    }

    public static final class $forward_triggering_native extends SubLStructNative {
        public SubLObject $rule;

        public SubLObject $source_asent;

        public SubLObject $source_truth;

        public SubLObject $target_asent;

        public SubLObject $target_truth;

        public SubLObject $query_dnf;

        public SubLObject $pragmatic_dnf;

        public SubLObject $propagation_mt;

        public SubLObject $restricted_examine_asent;

        public SubLObject $trigger_bindings;

        public SubLObject $trigger_supports;

        private static final SubLStructDeclNative structDecl;

        public $forward_triggering_native() {
            this.$rule = Lisp.NIL;
            this.$source_asent = Lisp.NIL;
            this.$source_truth = Lisp.NIL;
            this.$target_asent = Lisp.NIL;
            this.$target_truth = Lisp.NIL;
            this.$query_dnf = Lisp.NIL;
            this.$pragmatic_dnf = Lisp.NIL;
            this.$propagation_mt = Lisp.NIL;
            this.$restricted_examine_asent = Lisp.NIL;
            this.$trigger_bindings = Lisp.NIL;
            this.$trigger_supports = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$rule;
        }

        @Override
        public SubLObject getField3() {
            return this.$source_asent;
        }

        @Override
        public SubLObject getField4() {
            return this.$source_truth;
        }

        @Override
        public SubLObject getField5() {
            return this.$target_asent;
        }

        @Override
        public SubLObject getField6() {
            return this.$target_truth;
        }

        @Override
        public SubLObject getField7() {
            return this.$query_dnf;
        }

        @Override
        public SubLObject getField8() {
            return this.$pragmatic_dnf;
        }

        @Override
        public SubLObject getField9() {
            return this.$propagation_mt;
        }

        @Override
        public SubLObject getField10() {
            return this.$restricted_examine_asent;
        }

        @Override
        public SubLObject getField11() {
            return this.$trigger_bindings;
        }

        @Override
        public SubLObject getField12() {
            return this.$trigger_supports;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$rule = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$source_asent = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$source_truth = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$target_asent = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$target_truth = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$query_dnf = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$pragmatic_dnf = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$propagation_mt = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$restricted_examine_asent = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$trigger_bindings = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$trigger_supports = value;
        }

        static {
            structDecl = makeStructDeclNative(forward_harness.$forward_triggering_native.class, FORWARD_TRIGGERING, FORWARD_TRIGGERING_P, $list36, $list37, new String[]{ "$rule", "$source_asent", "$source_truth", "$target_asent", "$target_truth", "$query_dnf", "$pragmatic_dnf", "$propagation_mt", "$restricted_examine_asent", "$trigger_bindings", "$trigger_supports" }, $list38, $list39, PRINT_FORWARD_TRIGGERING);
        }
    }

    public static final class $forward_triggering_p$UnaryFunction extends UnaryFunction {
        public $forward_triggering_p$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-TRIGGERING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return forward_triggering_p(arg1);
        }
    }

    public static final class $skeletal_proof_native extends SubLStructNative {
        public SubLObject $concluded_asent;

        public SubLObject $concluded_truth;

        public SubLObject $trigger_bindings;

        public SubLObject $inference_bindings;

        public SubLObject $concluded_supports;

        public SubLObject $pragmatic_supports;

        public SubLObject $rule;

        public SubLObject $propagation_mt;

        private static final SubLStructDeclNative structDecl;

        public $skeletal_proof_native() {
            this.$concluded_asent = Lisp.NIL;
            this.$concluded_truth = Lisp.NIL;
            this.$trigger_bindings = Lisp.NIL;
            this.$inference_bindings = Lisp.NIL;
            this.$concluded_supports = Lisp.NIL;
            this.$pragmatic_supports = Lisp.NIL;
            this.$rule = Lisp.NIL;
            this.$propagation_mt = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$concluded_asent;
        }

        @Override
        public SubLObject getField3() {
            return this.$concluded_truth;
        }

        @Override
        public SubLObject getField4() {
            return this.$trigger_bindings;
        }

        @Override
        public SubLObject getField5() {
            return this.$inference_bindings;
        }

        @Override
        public SubLObject getField6() {
            return this.$concluded_supports;
        }

        @Override
        public SubLObject getField7() {
            return this.$pragmatic_supports;
        }

        @Override
        public SubLObject getField8() {
            return this.$rule;
        }

        @Override
        public SubLObject getField9() {
            return this.$propagation_mt;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$concluded_asent = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$concluded_truth = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$trigger_bindings = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$inference_bindings = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$concluded_supports = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$pragmatic_supports = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$rule = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$propagation_mt = value;
        }

        static {
            structDecl = makeStructDeclNative(forward_harness.$skeletal_proof_native.class, SKELETAL_PROOF, SKELETAL_PROOF_P, $list88, $list89, new String[]{ "$concluded_asent", "$concluded_truth", "$trigger_bindings", "$inference_bindings", "$concluded_supports", "$pragmatic_supports", "$rule", "$propagation_mt" }, $list90, $list91, PRINT_SKELETAL_PROOF);
        }
    }

    public static final class $skeletal_proof_p$UnaryFunction extends UnaryFunction {
        public $skeletal_proof_p$UnaryFunction() {
            super(extractFunctionNamed("SKELETAL-PROOF-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return skeletal_proof_p(arg1);
        }
    }

    public static final class $placeable_proof_native extends SubLStructNative {
        public SubLObject $concluded_asent;

        public SubLObject $concluded_mt;

        public SubLObject $concluded_truth;

        public SubLObject $assertible;

        private static final SubLStructDeclNative structDecl;

        public $placeable_proof_native() {
            this.$concluded_asent = Lisp.NIL;
            this.$concluded_mt = Lisp.NIL;
            this.$concluded_truth = Lisp.NIL;
            this.$assertible = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$concluded_asent;
        }

        @Override
        public SubLObject getField3() {
            return this.$concluded_mt;
        }

        @Override
        public SubLObject getField4() {
            return this.$concluded_truth;
        }

        @Override
        public SubLObject getField5() {
            return this.$assertible;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$concluded_asent = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$concluded_mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$concluded_truth = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$assertible = value;
        }

        static {
            structDecl = makeStructDeclNative(forward_harness.$placeable_proof_native.class, PLACEABLE_PROOF, PLACEABLE_PROOF_P, $list123, $list124, new String[]{ "$concluded_asent", "$concluded_mt", "$concluded_truth", "$assertible" }, $list125, $list126, PRINT_PLACEABLE_PROOF);
        }
    }

    public static final class $placeable_proof_p$UnaryFunction extends UnaryFunction {
        public $placeable_proof_p$UnaryFunction() {
            super(extractFunctionNamed("PLACEABLE-PROOF-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return placeable_proof_p(arg1);
        }
    }
}

/**
 * Total time: 983 ms
 */
