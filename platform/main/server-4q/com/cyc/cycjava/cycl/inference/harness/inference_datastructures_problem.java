package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_datastructures_problem extends SubLTranslatedFile {
    public static final SubLFile me = new inference_datastructures_problem();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem";

    public static final String myFingerPrint = "661d4c2903a9af8f683fbd01675f83c5f8edb5f42cb25891f30e37778b08c7d3";

    // defconstant
    public static final SubLSymbol $dtp_problem$ = makeSymbol("*DTP-PROBLEM*");



    // deflexical
    /**
     * Generalized tactic types which specify more than one actual tactic-type-p.
     */
    private static final SubLSymbol $generalized_tactic_types$ = makeSymbol("*GENERALIZED-TACTIC-TYPES*");

    // defvar
    /**
     * :intuitive or :counterintuitive. :intuitive means that any transformation or
     * residual transformation link increments the transformation depth by 1. This
     * corresponds to the number of times that the problem has been transformed.
     * :counterintuitive means that transformation-depth indicates the maximum
     * number of times that any /literal/ in the problem has been transformed.
     */
    public static final SubLSymbol $transformation_depth_computation$ = makeSymbol("*TRANSFORMATION-DEPTH-COMPUTATION*");

    // defparameter
    /**
     * Temporary control variable; when non-nil min-transformation-depth is computed
     * from the min-transformation-depth-signature. Should eventually stay T.
     */
    public static final SubLSymbol $problem_min_transformation_depth_from_signature_enabledP$ = makeSymbol("*PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE-ENABLED?*");

    // deflexical
    /**
     * The maximum number of tactics (of any status) that can be on a single
     * problem. Attempting to add an additional tactic after this number yields an
     * error.
     */
    public static final SubLSymbol $max_problem_tactics$ = makeSymbol("*MAX-PROBLEM-TACTICS*");





    private static final SubLInteger $int$212 = makeInteger(212);

    public static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("SUID"), makeSymbol("STORE"), makeSymbol("QUERY"), makeSymbol("FREE-HL-VARS"), makeSymbol("STATUS"), makeSymbol("DEPENDENT-LINKS"), makeSymbol("ARGUMENT-LINKS"), makeSymbol("TACTICS"), makeSymbol("PROOF-BINDINGS-INDEX"), makeSymbol("ARGUMENT-LINK-BINDINGS-INDEX"), makeSymbol("BACKCHAIN-REQUIRED"), makeSymbol("MEMOIZATION-STATE") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SUID"), makeKeyword("STORE"), makeKeyword("QUERY"), makeKeyword("FREE-HL-VARS"), makeKeyword("STATUS"), makeKeyword("DEPENDENT-LINKS"), makeKeyword("ARGUMENT-LINKS"), makeKeyword("TACTICS"), makeKeyword("PROOF-BINDINGS-INDEX"), makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX"), makeKeyword("BACKCHAIN-REQUIRED"), makeKeyword("MEMOIZATION-STATE") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("PROB-SUID"), makeSymbol("PROB-STORE"), makeSymbol("PROB-QUERY"), makeSymbol("PROB-FREE-HL-VARS"), makeSymbol("PROB-STATUS"), makeSymbol("PROB-DEPENDENT-LINKS"), makeSymbol("PROB-ARGUMENT-LINKS"), makeSymbol("PROB-TACTICS"), makeSymbol("PROB-PROOF-BINDINGS-INDEX"), makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX"), makeSymbol("PROB-BACKCHAIN-REQUIRED"), makeSymbol("PROB-MEMOIZATION-STATE") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-PROB-SUID"), makeSymbol("_CSETF-PROB-STORE"), makeSymbol("_CSETF-PROB-QUERY"), makeSymbol("_CSETF-PROB-FREE-HL-VARS"), makeSymbol("_CSETF-PROB-STATUS"), makeSymbol("_CSETF-PROB-DEPENDENT-LINKS"), makeSymbol("_CSETF-PROB-ARGUMENT-LINKS"), makeSymbol("_CSETF-PROB-TACTICS"), makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX"), makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX"), makeSymbol("_CSETF-PROB-BACKCHAIN-REQUIRED"), makeSymbol("_CSETF-PROB-MEMOIZATION-STATE") });

    public static final SubLSymbol PRINT_PROBLEM = makeSymbol("PRINT-PROBLEM");

    public static final SubLSymbol PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-P"));

    private static final SubLSymbol PROB_SUID = makeSymbol("PROB-SUID");

    private static final SubLSymbol _CSETF_PROB_SUID = makeSymbol("_CSETF-PROB-SUID");

    private static final SubLSymbol PROB_STORE = makeSymbol("PROB-STORE");

    private static final SubLSymbol _CSETF_PROB_STORE = makeSymbol("_CSETF-PROB-STORE");

    private static final SubLSymbol PROB_QUERY = makeSymbol("PROB-QUERY");

    private static final SubLSymbol _CSETF_PROB_QUERY = makeSymbol("_CSETF-PROB-QUERY");

    private static final SubLSymbol PROB_FREE_HL_VARS = makeSymbol("PROB-FREE-HL-VARS");

    private static final SubLSymbol _CSETF_PROB_FREE_HL_VARS = makeSymbol("_CSETF-PROB-FREE-HL-VARS");

    private static final SubLSymbol PROB_STATUS = makeSymbol("PROB-STATUS");

    private static final SubLSymbol _CSETF_PROB_STATUS = makeSymbol("_CSETF-PROB-STATUS");

    private static final SubLSymbol PROB_DEPENDENT_LINKS = makeSymbol("PROB-DEPENDENT-LINKS");

    private static final SubLSymbol _CSETF_PROB_DEPENDENT_LINKS = makeSymbol("_CSETF-PROB-DEPENDENT-LINKS");

    private static final SubLSymbol PROB_ARGUMENT_LINKS = makeSymbol("PROB-ARGUMENT-LINKS");

    private static final SubLSymbol _CSETF_PROB_ARGUMENT_LINKS = makeSymbol("_CSETF-PROB-ARGUMENT-LINKS");

    private static final SubLSymbol PROB_TACTICS = makeSymbol("PROB-TACTICS");

    private static final SubLSymbol _CSETF_PROB_TACTICS = makeSymbol("_CSETF-PROB-TACTICS");

    private static final SubLSymbol PROB_PROOF_BINDINGS_INDEX = makeSymbol("PROB-PROOF-BINDINGS-INDEX");

    private static final SubLSymbol _CSETF_PROB_PROOF_BINDINGS_INDEX = makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX");

    private static final SubLSymbol PROB_ARGUMENT_LINK_BINDINGS_INDEX = makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX");

    private static final SubLSymbol _CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX = makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX");

    private static final SubLSymbol PROB_BACKCHAIN_REQUIRED = makeSymbol("PROB-BACKCHAIN-REQUIRED");

    private static final SubLSymbol _CSETF_PROB_BACKCHAIN_REQUIRED = makeSymbol("_CSETF-PROB-BACKCHAIN-REQUIRED");

    private static final SubLSymbol PROB_MEMOIZATION_STATE = makeSymbol("PROB-MEMOIZATION-STATE");

    private static final SubLSymbol _CSETF_PROB_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-MEMOIZATION-STATE");







    private static final SubLSymbol $FREE_HL_VARS = makeKeyword("FREE-HL-VARS");









    private static final SubLSymbol $PROOF_BINDINGS_INDEX = makeKeyword("PROOF-BINDINGS-INDEX");

    private static final SubLSymbol $ARGUMENT_LINK_BINDINGS_INDEX = makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX");





    private static final SubLString $str46$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PROBLEM = makeSymbol("MAKE-PROBLEM");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-METHOD");



    private static final SubLString $str53$_Invalid_PROBLEM__s_ = makeString("<Invalid PROBLEM ~s>");

    private static final SubLString $str54$__a_PROBLEM__a__a__s_a_ = makeString("<~a PROBLEM ~a.~a:~s~a>");

    private static final SubLString $str55$_free_ = makeString(" free=");

    private static final SubLSymbol VARIABLE_ID = makeSymbol("VARIABLE-ID");

    private static final SubLString $str57$ = makeString("");

    private static final SubLSymbol SXHASH_PROBLEM_METHOD = makeSymbol("SXHASH-PROBLEM-METHOD");



    private static final SubLSymbol CONTEXTUALIZED_DNF_CLAUSES_P = makeSymbol("CONTEXTUALIZED-DNF-CLAUSES-P");

    private static final SubLString $$$Ignore_the_crazy_problems = makeString("Ignore the crazy problems");

    private static final SubLString $str62$Crazy_amount_of_problems___a__in_ = makeString("Crazy amount of problems (~a) in store ~a");





    private static final SubLString $$$problem_memoization_state = makeString("problem memoization state");

    public static final SubLSymbol $empty_clauses$ = makeSymbol("*EMPTY-CLAUSES*");

    private static final SubLList $list67 = list(list(makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol PROBLEM_MEMOIZATION_STATE = makeSymbol("PROBLEM-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_PROBLEM_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-MEMOIZATION-STATE");

    private static final SubLList $list71 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list72 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol DO_PROBLEM_QUERY_LITERALS = makeSymbol("DO-PROBLEM-QUERY-LITERALS");

    private static final SubLSymbol PROBLEM_QUERY = makeSymbol("PROBLEM-QUERY");

    private static final SubLList $list77 = list(list(new SubLObject[]{ makeSymbol("TACTIC-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list78 = list(makeKeyword("DONE"), makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), makeKeyword("TYPE"), makeKeyword("PRODUCTIVITY"));











    private static final SubLSymbol DO_PROBLEM_TACTICS_TYPE_MATCH = makeSymbol("DO-PROBLEM-TACTICS-TYPE-MATCH");

    private static final SubLSymbol DO_PROBLEM_TACTICS_STATUS_MATCH = makeSymbol("DO-PROBLEM-TACTICS-STATUS-MATCH");

    private static final SubLSymbol DO_PROBLEM_TACTICS_COMPLETENESS_MATCH = makeSymbol("DO-PROBLEM-TACTICS-COMPLETENESS-MATCH");

    private static final SubLSymbol DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH = makeSymbol("DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH");

    private static final SubLSymbol DO_PROBLEM_TACTICS_HL_MODULE_MATCH = makeSymbol("DO-PROBLEM-TACTICS-HL-MODULE-MATCH");

    private static final SubLSymbol DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH = makeSymbol("DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH");



    private static final SubLSymbol PROBLEM_TACTICS = makeSymbol("PROBLEM-TACTICS");

    private static final SubLSymbol DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");





    private static final SubLSymbol COMPLETENESS_P = makeSymbol("COMPLETENESS-P");

    private static final SubLSymbol PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");

    private static final SubLSymbol PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");



    private static final SubLList $list99 = list(new SubLObject[]{ makeKeyword("NON-TRANSFORMATION"), makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("CONJUNCTIVE"), makeKeyword("DISJUNCTIVE"), makeKeyword("LOGICAL"), makeKeyword("LOGICAL-CONJUNCTIVE"), makeKeyword("STRUCTURAL-CONJUNCTIVE"), makeKeyword("META-STRUCTURAL"), makeKeyword("CONTENT"), makeKeyword("UNION"), makeKeyword("SPLIT"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN") });

    private static final SubLSymbol GENERALIZED_TACTIC_TYPE_P = makeSymbol("GENERALIZED-TACTIC-TYPE-P");





    private static final SubLSymbol $GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");

























    private static final SubLSymbol PROBLEM_ARGUMENT_LINKS = makeSymbol("PROBLEM-ARGUMENT-LINKS");

    private static final SubLSymbol DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");

    private static final SubLList $list118 = list(list(makeSymbol("LINK-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list119 = list(makeKeyword("TYPE"), makeKeyword("DONE"));



    private static final SubLSymbol PROBLEM_DEPENDENT_LINKS = makeSymbol("PROBLEM-DEPENDENT-LINKS");

    private static final SubLSymbol DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");

    private static final SubLSymbol $sym123$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");

    private static final SubLList $list124 = list(list(makeSymbol("LINK-VAR"), makeSymbol("MAPPED-PROBLEM-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list125 = list(makeKeyword("TYPE"), makeKeyword("OPEN?"), makeKeyword("DONE"));



    private static final SubLSymbol $sym127$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");



    private static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");

    private static final SubLSymbol MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");

    public static final SubLList $list131 = list(list(makeSymbol("SUPPORTED-PROBLEM-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym132$LINK = makeUninternedSymbol("LINK");

    private static final SubLSymbol PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");

    private static final SubLList $list134 = list(list(makeSymbol("SUPPORTED-INFERENCE-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym135$LINK = makeUninternedSymbol("LINK");

    private static final SubLSymbol PROBLEM_LINK_SUPPORTED_INFERENCE = makeSymbol("PROBLEM-LINK-SUPPORTED-INFERENCE");

    public static final SubLList $list137 = list(list(makeSymbol("SUPPORTING-PROBLEM-VAR"), makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym138$LINK = makeUninternedSymbol("LINK");

    private static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");

    private static final SubLList $list140 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list141 = list(makeKeyword("PROOF-STATUS"), makeKeyword("DONE"));



    private static final SubLSymbol $sym143$PROOF_LIST = makeUninternedSymbol("PROOF-LIST");

    private static final SubLSymbol $sym144$BINDINGS = makeUninternedSymbol("BINDINGS");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");

    private static final SubLSymbol PROBLEM_PROOF_BINDINGS_INDEX = makeSymbol("PROBLEM-PROOF-BINDINGS-INDEX");



    private static final SubLSymbol $sym148$STATUS_VAR = makeUninternedSymbol("STATUS-VAR");

    private static final SubLSymbol DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");

    private static final SubLSymbol $sym150$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");

    private static final SubLList $list151 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym152$STRATEGY = makeUninternedSymbol("STRATEGY");

    private static final SubLSymbol DO_PROBLEM_ACTIVE_STRATEGIES = makeSymbol("DO-PROBLEM-ACTIVE-STRATEGIES");

    private static final SubLSymbol STRATEGY_INFERENCE = makeSymbol("STRATEGY-INFERENCE");

    private static final SubLList $list155 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym156$STORE = makeUninternedSymbol("STORE");

    private static final SubLSymbol $sym157$PROB = makeUninternedSymbol("PROB");

    private static final SubLSymbol PROBLEM_STORE = makeSymbol("PROBLEM-STORE");

    private static final SubLSymbol DO_PROBLEM_STORE_INFERENCES = makeSymbol("DO-PROBLEM-STORE-INFERENCES");

    private static final SubLSymbol $sym160$PROBLEM_RELEVANT_TO_INFERENCE_ = makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?");

    private static final SubLList $list161 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym162$STORE = makeUninternedSymbol("STORE");

    private static final SubLSymbol $sym163$PROB = makeUninternedSymbol("PROB");

    private static final SubLSymbol DO_PROBLEM_STORE_STRATEGIES = makeSymbol("DO-PROBLEM-STORE-STRATEGIES");

    private static final SubLSymbol $sym165$PROBLEM_ACTIVE_IN_STRATEGY_ = makeSymbol("PROBLEM-ACTIVE-IN-STRATEGY?");

    private static final SubLList $list166 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym167$INFERENCE = makeUninternedSymbol("INFERENCE");

    private static final SubLSymbol DO_PROBLEM_RELEVANT_INFERENCES = makeSymbol("DO-PROBLEM-RELEVANT-INFERENCES");

    private static final SubLSymbol DO_INFERENCE_STRATEGIES = makeSymbol("DO-INFERENCE-STRATEGIES");

    private static final SubLList $list170 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list172 = list(makeKeyword("TACTICAL"));

    private static final SubLSymbol DO_PROBLEM_RELEVANT_STRATEGIES = makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");



    private static final SubLSymbol PROBLEM_STATUS_P = makeSymbol("PROBLEM-STATUS-P");

    private static final SubLString $str176$poking_good_status__s_into_proble = makeString("poking good status ~s into problem ~s");



    private static final SubLList $list178 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLString $str182$The_problem__S_did_not_have_a_sin = makeString("The problem ~S did not have a single-clause query.");

    private static final SubLList $list183 = list(makeSymbol("DNF-CLAUSE"));

    private static final SubLString $str184$Found_more_than_one__a_argument_l = makeString("Found more than one ~a argument link on ~a");

    private static final SubLString $str185$Expected__a_to_have_a__a_argument = makeString("Expected ~a to have a ~a argument link");

    private static final SubLSymbol PROBLEM_LINK_TYPE_P = makeSymbol("PROBLEM-LINK-TYPE-P");

    private static final SubLSymbol $sym187$_ = makeSymbol("<");



    private static final SubLString $str189$_a_had_more_than_one_dependent_li = makeString("~a had more than one dependent link");

    private static final SubLString $str190$_a_had_no_dependent_links = makeString("~a had no dependent links");





    private static final SubLSymbol $sym193$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");

    private static final SubLSymbol $sym194$TACTIC_EXECUTED_ = makeSymbol("TACTIC-EXECUTED?");

    private static final SubLSymbol $sym195$TACTIC_DISCARDED_ = makeSymbol("TACTIC-DISCARDED?");







    private static final SubLSymbol TACTIC_STATUS_P = makeSymbol("TACTIC-STATUS-P");

    private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");



    private static final SubLSymbol $sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");















    private static final SubLSymbol $sym210$_EXIT = makeSymbol("%EXIT");



    private static final SubLInteger $int$10000 = makeInteger(10000);



    private static final SubLString $str214$Tried_to_add__s_to__s__which_woul = makeString("Tried to add ~s to ~s, which would result in more than ~s tactics on ~s");



    private static final SubLSymbol BINDINGS_P = makeSymbol("BINDINGS-P");





    private static final SubLSymbol PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");

    private static final SubLSymbol $sym220$_ = makeSymbol(">");



    public static SubLObject problem_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_problem(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject problem_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_problem.$problem_native.class ? T : NIL;
    }

    public static SubLObject prob_suid(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject prob_store(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject prob_query(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject prob_free_hl_vars(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject prob_status(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject prob_dependent_links(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject prob_argument_links(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject prob_tactics(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject prob_proof_bindings_index(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject prob_argument_link_bindings_index(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject prob_backchain_required(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject prob_memoization_state(final SubLObject v_object) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_prob_suid(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_prob_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_prob_query(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_prob_free_hl_vars(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_prob_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_prob_dependent_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_prob_argument_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_prob_tactics(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_prob_proof_bindings_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_prob_argument_link_bindings_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_prob_backchain_required(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_prob_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != problem_p(v_object) : "inference_datastructures_problem.problem_p(v_object) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_problem(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_problem.$problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_prob_suid(v_new, current_value);
            } else
                if (pcase_var.eql($STORE)) {
                    _csetf_prob_store(v_new, current_value);
                } else
                    if (pcase_var.eql($QUERY)) {
                        _csetf_prob_query(v_new, current_value);
                    } else
                        if (pcase_var.eql($FREE_HL_VARS)) {
                            _csetf_prob_free_hl_vars(v_new, current_value);
                        } else
                            if (pcase_var.eql($STATUS)) {
                                _csetf_prob_status(v_new, current_value);
                            } else
                                if (pcase_var.eql($DEPENDENT_LINKS)) {
                                    _csetf_prob_dependent_links(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARGUMENT_LINKS)) {
                                        _csetf_prob_argument_links(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TACTICS)) {
                                            _csetf_prob_tactics(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PROOF_BINDINGS_INDEX)) {
                                                _csetf_prob_proof_bindings_index(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ARGUMENT_LINK_BINDINGS_INDEX)) {
                                                    _csetf_prob_argument_link_bindings_index(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($BACKCHAIN_REQUIRED)) {
                                                        _csetf_prob_backchain_required(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MEMOIZATION_STATE)) {
                                                            _csetf_prob_memoization_state(v_new, current_value);
                                                        } else {
                                                            Errors.error($str46$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_problem(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PROBLEM, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUID, prob_suid(obj));
        funcall(visitor_fn, obj, $SLOT, $STORE, prob_store(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY, prob_query(obj));
        funcall(visitor_fn, obj, $SLOT, $FREE_HL_VARS, prob_free_hl_vars(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, prob_status(obj));
        funcall(visitor_fn, obj, $SLOT, $DEPENDENT_LINKS, prob_dependent_links(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGUMENT_LINKS, prob_argument_links(obj));
        funcall(visitor_fn, obj, $SLOT, $TACTICS, prob_tactics(obj));
        funcall(visitor_fn, obj, $SLOT, $PROOF_BINDINGS_INDEX, prob_proof_bindings_index(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGUMENT_LINK_BINDINGS_INDEX, prob_argument_link_bindings_index(obj));
        funcall(visitor_fn, obj, $SLOT, $BACKCHAIN_REQUIRED, prob_backchain_required(obj));
        funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, prob_memoization_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_PROBLEM, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_problem_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem(obj, visitor_fn);
    }

    public static SubLObject valid_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != problem_p(v_object)) && (NIL == problem_invalid_p(v_object)));
    }

    public static SubLObject problem_invalid_p(final SubLObject problem) {
        return eq($FREE, problem_status(problem));
    }

    public static SubLObject print_problem(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != problem_invalid_p(v_object)) {
            format(stream, $str53$_Invalid_PROBLEM__s_, prob_suid(v_object));
        } else {
            format(stream, $str54$__a_PROBLEM__a__a__s_a_, new SubLObject[]{ problem_status(v_object), inference_datastructures_problem_store.problem_store_suid(problem_store(v_object)), problem_suid(v_object), problem_query(v_object), NIL != problem_free_hl_vars(v_object) ? cconcatenate($str55$_free_, format_nil.format_nil_a_no_copy(Mapping.mapcar(VARIABLE_ID, problem_free_hl_vars(v_object)))) : $str57$ });
        }
        return NIL;
    }

    public static SubLObject sxhash_problem_method(final SubLObject v_object) {
        return prob_suid(v_object);
    }

    public static SubLObject new_problem(final SubLObject store, final SubLObject query, SubLObject free_hl_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        SubLTrampolineFile.enforceType(query, CONTEXTUALIZED_DNF_CLAUSES_P);
        if (NIL == inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) {
            free_hl_vars = NIL;
        }
        leviathan.note_new_problem_created();
        if ((NIL != $inference_debugP$.getDynamicValue(thread)) && (NIL != inference_datastructures_problem_store.problem_store_crazy_max_problem_count_exactly_reachedP(store))) {
            Errors.cerror($$$Ignore_the_crazy_problems, $str62$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
        }
        final SubLObject problem = make_problem(UNPROVIDED);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_problem_id(store);
        inference_metrics.increment_problem_historical_count();
        if (NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(query)) {
            inference_metrics.increment_single_literal_problem_historical_count();
        }
        _csetf_prob_suid(problem, suid);
        _csetf_prob_store(problem, store);
        _csetf_prob_query(problem, query);
        _csetf_prob_free_hl_vars(problem, free_hl_vars);
        set_problem_status(problem, $NEW);
        _csetf_prob_argument_links(problem, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
        _csetf_prob_dependent_links(problem, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
        _csetf_prob_tactics(problem, NIL);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, symbol_function(EQUAL)));
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, symbol_function(EQUAL)));
        _csetf_prob_backchain_required(problem, $UNDETERMINED);
        _csetf_prob_memoization_state(problem, memoization_state.new_memoization_state($$$problem_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        inference_datastructures_problem_store.add_problem_store_problem(store, problem);
        inference_worker.note_problem_created(problem);
        return problem;
    }

    public static SubLObject with_problem_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list67);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_MEMOIZATION_STATE, list(list(PROBLEM_MEMOIZATION_STATE, problem)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list67);
        return NIL;
    }

    public static SubLObject problem_memoization_state(final SubLObject problem) {
        return prob_memoization_state(problem);
    }

    public static SubLObject do_problem_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list71);
        asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list71);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list71);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list71);
            if (NIL == member(current_$1, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list71);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_PROBLEM_QUERY_LITERALS, list(asent_var, mt_var, sense_var, list(PROBLEM_QUERY, problem), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_problem_tactics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        tactic_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$2, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject status_tail = property_list_member($STATUS, current);
        final SubLObject status = (NIL != status_tail) ? cadr(status_tail) : NIL;
        final SubLObject completeness_tail = property_list_member($COMPLETENESS, current);
        final SubLObject completeness = (NIL != completeness_tail) ? cadr(completeness_tail) : NIL;
        final SubLObject preference_level_tail = property_list_member($PREFERENCE_LEVEL, current);
        final SubLObject preference_level = (NIL != preference_level_tail) ? cadr(preference_level_tail) : NIL;
        final SubLObject hl_module_tail = property_list_member($HL_MODULE, current);
        final SubLObject hl_module = (NIL != hl_module_tail) ? cadr(hl_module_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject productivity_tail = property_list_member($PRODUCTIVITY, current);
        final SubLObject productivity = (NIL != productivity_tail) ? cadr(productivity_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject filter_forms = NIL;
        if (NIL != type) {
            filter_forms = cons(list(DO_PROBLEM_TACTICS_TYPE_MATCH, tactic_var, type), filter_forms);
        }
        if (NIL != status) {
            filter_forms = cons(list(DO_PROBLEM_TACTICS_STATUS_MATCH, tactic_var, status), filter_forms);
        }
        if (NIL != completeness) {
            filter_forms = cons(list(DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, tactic_var, completeness), filter_forms);
        }
        if (NIL != preference_level) {
            filter_forms = cons(list(DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, tactic_var, preference_level), filter_forms);
        }
        if (NIL != hl_module) {
            filter_forms = cons(list(DO_PROBLEM_TACTICS_HL_MODULE_MATCH, tactic_var, hl_module), filter_forms);
        }
        if (NIL != productivity) {
            filter_forms = cons(list(DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, tactic_var, productivity), filter_forms);
        }
        filter_forms = nreverse(filter_forms);
        if (NIL == filter_forms) {
            return listS(DO_LIST, list(tactic_var, list(PROBLEM_TACTICS, problem), $DONE, done), append(body, NIL));
        }
        return list(DO_PROBLEM_TACTICS, list(tactic_var, problem, $DONE, done), listS(PWHEN, NIL != list_utilities.singletonP(filter_forms) ? filter_forms.first() : bq_cons(CAND, append(filter_forms, NIL)), append(body, NIL)));
    }

    public static SubLObject problem_tactics(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return prob_tactics(problem);
    }

    public static SubLObject do_problem_tactics_status_match(final SubLObject tactic, final SubLObject status_spec) {
        return makeBoolean((NIL == status_spec) || (NIL != inference_datastructures_tactic.tactic_has_statusP(tactic, status_spec)));
    }

    public static SubLObject do_problem_tactics_completeness_match(final SubLObject tactic, final SubLObject completeness_spec) {
        if (NIL == completeness_spec) {
            return T;
        }
        assert NIL != inference_datastructures_enumerated_types.completeness_p(completeness_spec) : "inference_datastructures_enumerated_types.completeness_p(completeness_spec) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.completeness_p(completeness_spec) " + completeness_spec;
        return eq(completeness_spec, inference_datastructures_tactic.tactic_completeness(tactic));
    }

    public static SubLObject do_problem_tactics_preference_level_match(final SubLObject tactic, final SubLObject preference_level_spec) {
        if (NIL == preference_level_spec) {
            return T;
        }
        assert NIL != preference_modules.preference_level_p(preference_level_spec) : "preference_modules.preference_level_p(preference_level_spec) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level_spec) " + preference_level_spec;
        return eq(preference_level_spec, inference_datastructures_tactic.tactic_preference_level(tactic));
    }

    public static SubLObject do_problem_tactics_productivity_match(final SubLObject tactic, final SubLObject productivity_spec) {
        if (NIL == productivity_spec) {
            return T;
        }
        assert NIL != inference_datastructures_enumerated_types.productivity_p(productivity_spec) : "inference_datastructures_enumerated_types.productivity_p(productivity_spec) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_spec) " + productivity_spec;
        return inference_datastructures_enumerated_types.productivity_E(productivity_spec, inference_datastructures_tactic.tactic_productivity(tactic));
    }

    public static SubLObject do_problem_tactics_hl_module_match(final SubLObject tactic, final SubLObject hl_module_spec) {
        if (NIL == hl_module_spec) {
            return T;
        }
        assert NIL != inference_modules.hl_module_p(hl_module_spec) : "inference_modules.hl_module_p(hl_module_spec) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module_spec) " + hl_module_spec;
        return eq(hl_module_spec, inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    public static SubLObject generalized_tactic_type_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_enumerated_types.tactic_type_p(v_object)) || (NIL != list_utilities.member_eqP(v_object, $generalized_tactic_types$.getGlobalValue())));
    }

    public static SubLObject do_problem_tactics_type_match(final SubLObject tactic, final SubLObject type_spec) {
        return tactic_matches_type_specP(tactic, type_spec);
    }

    public static SubLObject tactic_matches_type_specP(final SubLObject tactic, final SubLObject type_spec) {
        if (NIL == type_spec) {
            return T;
        }
        assert NIL != generalized_tactic_type_p(type_spec) : "inference_datastructures_problem.generalized_tactic_type_p(type_spec) " + "CommonSymbols.NIL != inference_datastructures_problem.generalized_tactic_type_p(type_spec) " + type_spec;
        if (type_spec.eql($NON_TRANSFORMATION)) {
            return makeBoolean(NIL == inference_worker_transformation.transformation_tactic_p(tactic));
        }
        if (type_spec.eql($GENERALIZED_REMOVAL)) {
            return inference_worker_removal.generalized_removal_tactic_p(tactic);
        }
        if (type_spec.eql($GENERALIZED_REMOVAL_OR_REWRITE)) {
            return makeBoolean((NIL != inference_worker_removal.generalized_removal_tactic_p(tactic)) || (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)));
        }
        if (type_spec.eql($CONNECTED_CONJUNCTION)) {
            return inference_worker.connected_conjunction_tactic_p(tactic);
        }
        if (type_spec.eql($CONJUNCTIVE)) {
            return inference_worker.conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($DISJUNCTIVE)) {
            return inference_worker.disjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($LOGICAL)) {
            return inference_worker.logical_tactic_p(tactic);
        }
        if (type_spec.eql($LOGICAL_CONJUNCTIVE)) {
            return inference_worker.logical_conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($STRUCTURAL_CONJUNCTIVE)) {
            return inference_worker.logical_conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($META_STRUCTURAL)) {
            return inference_worker.meta_structural_tactic_p(tactic);
        }
        if (type_spec.eql($CONTENT)) {
            return inference_worker.content_tactic_p(tactic);
        }
        if (type_spec.eql($UNION)) {
            return inference_worker_union.union_tactic_p(tactic);
        }
        if (type_spec.eql($SPLIT)) {
            return inference_worker_split.split_tactic_p(tactic);
        }
        if (type_spec.eql($JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_p(tactic);
        }
        if (type_spec.eql($JOIN)) {
            return inference_worker_join.join_tactic_p(tactic);
        }
        return eq(type_spec, inference_datastructures_tactic.tactic_type(tactic));
    }

    public static SubLObject tactic_matches_any_of_type_specsP(final SubLObject tactic, final SubLObject type_specs) {
        SubLObject cdolist_list_var = type_specs;
        SubLObject type_spec = NIL;
        type_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != tactic_matches_type_specP(tactic, type_spec)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type_spec = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject problem_argument_links(final SubLObject problem) {
        return prob_argument_links(problem);
    }

    public static SubLObject problem_all_argument_links(final SubLObject problem) {
        return set_contents.set_contents_element_list(prob_argument_links(problem));
    }

    public static SubLObject do_problem_dependent_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list118);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list118);
        link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list118);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list118);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list118);
            if (NIL == member(current_$3, $list119, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list118);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == type) {
            return listS(DO_SET_CONTENTS, list(link_var, list(PROBLEM_DEPENDENT_LINKS, problem), $DONE, done), append(body, NIL));
        }
        return list(DO_PROBLEM_DEPENDENT_LINKS, list(link_var, problem, $DONE, done), listS(PWHEN, list($sym123$PROBLEM_LINK_HAS_TYPE_, link_var, type), append(body, NIL)));
    }

    public static SubLObject problem_dependent_links(final SubLObject problem) {
        return prob_dependent_links(problem);
    }

    public static SubLObject problem_all_dependent_links(final SubLObject problem) {
        return set_contents.set_contents_element_list(problem_dependent_links(problem));
    }

    public static SubLObject do_problem_dependent_link_interpretations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject mapped_problem_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        mapped_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list124);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list124);
            if (NIL == member(current_$4, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list124);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject problem_var = $sym127$PROBLEM_VAR;
        return list(CLET, list(list(problem_var, problem)), list(DO_PROBLEM_DEPENDENT_LINKS, list(link_var, problem, $TYPE, type, $DONE, done), list(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(mapped_problem_var, link_var, $OPEN_, openP, $DONE, done), listS(PWHEN, list(EQ, problem_var, list(MAPPED_PROBLEM_PROBLEM, mapped_problem_var)), append(body, NIL)))));
    }

    public static SubLObject do_problem_supported_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supported_problem_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list131);
        supported_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list131);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list131);
            if (NIL == member(current_$5, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list131);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject link = $sym132$LINK;
        return list(DO_PROBLEM_DEPENDENT_LINKS, list(link, problem, $DONE, done), list(CLET, list(list(supported_problem_var, list(PROBLEM_LINK_SUPPORTED_PROBLEM, link))), listS(PWHEN, supported_problem_var, append(body, NIL))));
    }

    public static SubLObject do_problem_supported_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supported_inference_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list134);
        supported_inference_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link = $sym135$LINK;
            return list(DO_PROBLEM_DEPENDENT_LINKS, list(link, problem), list(CLET, list(list(supported_inference_var, list(PROBLEM_LINK_SUPPORTED_INFERENCE, link))), listS(PWHEN, supported_inference_var, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list134);
        return NIL;
    }

    public static SubLObject do_problem_supporting_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_problem_var = NIL;
        SubLObject variable_map_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        supporting_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        variable_map_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link = $sym138$LINK;
            return list(DO_PROBLEM_ARGUMENT_LINKS, list(link, problem), listS(DO_PROBLEM_LINK_SUPPORTING_PROBLEMS, list(supporting_problem_var, variable_map_var, link), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list137);
        return NIL;
    }

    public static SubLObject do_problem_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list140);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list140);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list140);
            if (NIL == member(current_$6, $list141, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list140);
        }
        final SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
        final SubLObject proof_status = (NIL != proof_status_tail) ? cadr(proof_status_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject proof_list = $sym143$PROOF_LIST;
        final SubLObject v_bindings = $sym144$BINDINGS;
        if (NIL == proof_status) {
            return list(DO_DICTIONARY_CONTENTS, list(v_bindings, proof_list, list(PROBLEM_PROOF_BINDINGS_INDEX, problem), $DONE, done), list(IGNORE, v_bindings), listS(DO_LIST, list(proof_var, proof_list, $DONE, done), append(body, NIL)));
        }
        final SubLObject status_var = $sym148$STATUS_VAR;
        return list(CLET, list(list(status_var, proof_status)), list(DO_PROBLEM_PROOFS, list(proof_var, problem, $DONE, done), listS(PWHEN, list($sym150$PROOF_HAS_STATUS_, proof_var, status_var), append(body, NIL))));
    }

    public static SubLObject problem_proof_bindings_index(final SubLObject problem) {
        return prob_proof_bindings_index(problem);
    }

    public static SubLObject proof_has_statusP(final SubLObject proof, final SubLObject status) {
        if (NIL == status) {
            return T;
        }
        return eq(status, inference_datastructures_proof.proof_status(proof));
    }

    public static SubLObject do_problem_active_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list151);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list151);
        inference_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list151);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject strategy = $sym152$STRATEGY;
            return list(DO_PROBLEM_ACTIVE_STRATEGIES, list(strategy, problem), listS(CLET, list(list(inference_var, list(STRATEGY_INFERENCE, strategy))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list151);
        return NIL;
    }

    public static SubLObject do_problem_relevant_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list155);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list155);
        inference_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list155);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list155);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list155);
            if (NIL == member(current_$7, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list155);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject store = $sym156$STORE;
        final SubLObject prob = $sym157$PROB;
        return list(CLET, list(list(prob, problem), list(store, list(PROBLEM_STORE, prob))), list(DO_PROBLEM_STORE_INFERENCES, list(inference_var, store, $DONE, done), listS(PWHEN, list($sym160$PROBLEM_RELEVANT_TO_INFERENCE_, prob, inference_var), append(body, NIL))));
    }

    public static SubLObject do_problem_active_strategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list161);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list161);
        strategy_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list161);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject store = $sym162$STORE;
            final SubLObject prob = $sym163$PROB;
            return list(CLET, list(list(prob, problem), list(store, list(PROBLEM_STORE, prob))), list(DO_PROBLEM_STORE_STRATEGIES, list(strategy_var, store), listS(PWHEN, list($sym165$PROBLEM_ACTIVE_IN_STRATEGY_, prob, strategy_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list161);
        return NIL;
    }

    public static SubLObject do_problem_relevant_strategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list166);
        strategy_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list166);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list166);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list166);
            if (NIL == member(current_$8, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list166);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject inference = $sym167$INFERENCE;
        return list(DO_PROBLEM_RELEVANT_INFERENCES, list(inference, problem, $DONE, done), listS(DO_INFERENCE_STRATEGIES, list(strategy_var, inference), append(body, NIL)));
    }

    public static SubLObject do_problem_relevant_strategic_contexts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list170);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategic_context_var = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, $list170);
        strategic_context_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list170);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list170);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list170);
            if (NIL == member(current_$9, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list170);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, listS(CLET, list(bq_cons(strategic_context_var, $list172)), append(body, NIL)), listS(DO_PROBLEM_RELEVANT_STRATEGIES, list(strategic_context_var, problem, $DONE, done), append(body, NIL)));
    }

    public static SubLObject destroy_problem(final SubLObject problem) {
        if (NIL != valid_problem_p(problem)) {
            note_problem_invalid(problem);
            SubLObject set_contents_var = problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link)) && (NIL != inference_datastructures_problem_link.valid_problem_link_p(argument_link))) {
                    inference_datastructures_problem_link.destroy_problem_link(argument_link);
                }
            }
            set_contents_var = problem_dependent_links(problem);
            SubLObject dependent_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                dependent_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                    if (NIL != inference_worker_restriction.restriction_link_p(dependent_link)) {
                        inference_worker_join_ordered.note_all_triggering_proofs_processed(dependent_link);
                    }
                    if (NIL != inference_datastructures_problem_link.valid_problem_link_p(dependent_link)) {
                        inference_datastructures_problem_link.destroy_problem_link(dependent_link);
                    }
                }
            }
            if (NIL != problem_potentially_processedP(problem)) {
                inference_datastructures_problem_store.problem_store_note_problem_unprocessed(problem_store(problem), problem);
            }
            final SubLObject store = problem_store(problem);
            inference_datastructures_problem_store.remove_problem_store_problem(store, problem);
            final SubLObject store2 = problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store2);
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
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject strategy;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        inference = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var2 = set.do_set_internal(set_var);
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy)) {
                                        inference_datastructures_strategy.remove_strategy_problem(strategy, problem);
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
                            if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var3 = set.do_set_internal(set_var2);
                                SubLObject basis_object3;
                                SubLObject state3;
                                SubLObject strategy2;
                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object3, state3);
                                    if (NIL != set_contents.do_set_contents_element_validP(state3, strategy2)) {
                                        inference_datastructures_strategy.remove_strategy_problem(strategy2, problem);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return destroy_problem_int(problem);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_store_problem(final SubLObject problem) {
        if (NIL != valid_problem_p(problem)) {
            note_problem_invalid(problem);
            return destroy_problem_int(problem);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_int(final SubLObject problem) {
        dictionary_contents.clear_dictionary_contents(prob_argument_link_bindings_index(problem));
        _csetf_prob_argument_link_bindings_index(problem, $FREE);
        dictionary_contents.clear_dictionary_contents(prob_proof_bindings_index(problem));
        _csetf_prob_proof_bindings_index(problem, $FREE);
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_tactic.destroy_problem_tactic(tactic);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        _csetf_prob_tactics(problem, $FREE);
        set_contents.clear_set_contents(prob_dependent_links(problem));
        _csetf_prob_dependent_links(problem, $FREE);
        set_contents.clear_set_contents(prob_argument_links(problem));
        _csetf_prob_argument_links(problem, $FREE);
        _csetf_prob_query(problem, $FREE);
        _csetf_prob_free_hl_vars(problem, $FREE);
        _csetf_prob_store(problem, $FREE);
        _csetf_prob_memoization_state(problem, $FREE);
        return NIL;
    }

    public static SubLObject note_problem_invalid(final SubLObject problem) {
        _csetf_prob_status(problem, $FREE);
        return problem;
    }

    public static SubLObject problem_suid(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return prob_suid(problem);
    }

    public static SubLObject problem_store(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return prob_store(problem);
    }

    public static SubLObject problem_query(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return prob_query(problem);
    }

    public static SubLObject problem_free_hl_vars(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return prob_free_hl_vars(problem);
    }

    public static SubLObject problem_status(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return prob_status(problem);
    }

    public static SubLObject problem_dwimmed_status(final SubLObject problem) {
        final SubLObject status = problem_status(problem);
        if (NIL != inference_worker.problem_goodP(problem)) {
            final SubLObject dwimmed_status = inference_worker.good_version_of_problem_status(status);
            return dwimmed_status;
        }
        return status;
    }

    public static SubLObject set_problem_free_hl_vars(final SubLObject problem, final SubLObject free_hl_vars) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        _csetf_prob_free_hl_vars(problem, free_hl_vars);
        return problem;
    }

    public static SubLObject set_problem_status(final SubLObject problem, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_enumerated_types.problem_status_p(status) : "inference_datastructures_enumerated_types.problem_status_p(status) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_status_p(status) " + status;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != inference_datastructures_enumerated_types.good_problem_status_p(status))) {
            Errors.error($str176$poking_good_status__s_into_proble, status, problem);
        }
        _csetf_prob_status(problem, status);
        return problem;
    }

    public static SubLObject problem_formula(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return inference_czer.problem_query_formula(problem_query(problem));
    }

    public static SubLObject problem_el_formula(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return inference_czer.problem_query_el_formula(problem_query(problem));
    }

    public static SubLObject closed_problem_p(final SubLObject problem) {
        return closed_problem_query_p(problem_query(problem));
    }

    public static SubLObject open_problem_p(final SubLObject problem) {
        return open_problem_query_p(problem_query(problem));
    }

    public static SubLObject closed_problem_query_p(final SubLObject query) {
        return hl_ground_tree_p(query);
    }

    public static SubLObject open_problem_query_p(final SubLObject query) {
        return makeBoolean(NIL == hl_ground_tree_p(query));
    }

    public static SubLObject closed_single_literal_problem_query_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_query.single_literal_problem_query_p(v_object)) && (NIL != closed_problem_query_p(v_object)));
    }

    public static SubLObject open_single_literal_problem_query_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_query.single_literal_problem_query_p(v_object)) && (NIL == closed_problem_query_p(v_object)));
    }

    public static SubLObject problem_variables(final SubLObject problem) {
        return inference_datastructures_problem_query.problem_query_variables(problem_query(problem));
    }

    public static SubLObject problem_literal_count(final SubLObject problem, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject query = problem_query(problem);
        return problem_query_literal_count(query, sense);
    }

    public static SubLObject problem_query_literal_count(final SubLObject query, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = query;
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject literal_sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$12 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == sense) || sense.eql(literal_sense)) {
                        count = add(count, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list178);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                contextualized_asent = cdolist_list_var_$12.first();
            } 
            literal_sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$13 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == sense) || sense.eql(literal_sense)) {
                        count = add(count, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list178);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                contextualized_asent = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject single_literal_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != problem_p(v_object)) && (NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(problem_query(v_object))));
    }

    public static SubLObject single_literal_problem_predicate(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_predicate(problem_query(problem));
    }

    public static SubLObject single_literal_problem_atomic_sentence(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(problem_query(problem));
    }

    public static SubLObject single_literal_problem_mt(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_mt(problem_query(problem));
    }

    public static SubLObject problem_mt(final SubLObject problem) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = problem_query(problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$14 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != result) {
                        if (!mt.equal(result)) {
                            return NIL;
                        }
                    } else {
                        result = mt;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list178);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                contextualized_asent = cdolist_list_var_$14.first();
            } 
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$15 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != result) {
                        if (!mt.equal(result)) {
                            return NIL;
                        }
                    } else {
                        result = mt;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list178);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                contextualized_asent = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject problem_mts(final SubLObject problem) {
        final SubLObject one_mt = problem_mt(problem);
        if (NIL != one_mt) {
            return list(one_mt);
        }
        final SubLObject mt_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = problem_query(problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$16 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(mt, mt_set);
                } else {
                    cdestructuring_bind_error(datum, $list178);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                contextualized_asent = cdolist_list_var_$16.first();
            } 
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$17 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(mt, mt_set);
                } else {
                    cdestructuring_bind_error(datum, $list178);
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                contextualized_asent = cdolist_list_var_$17.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        return set.set_element_list(mt_set);
    }

    public static SubLObject single_literal_problem_sense(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_sense(problem_query(problem));
    }

    public static SubLObject mt_asent_sense_from_single_literal_problem(final SubLObject problem) {
        return inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(problem_query(problem));
    }

    public static SubLObject single_literal_problem_with_predicate_p(final SubLObject v_object, final SubLObject predicate) {
        if (NIL != single_literal_problem_p(v_object)) {
            return eql(predicate, single_literal_problem_predicate(v_object));
        }
        return NIL;
    }

    public static SubLObject single_clause_problem_p(final SubLObject v_object) {
        if (NIL != problem_p(v_object)) {
            final SubLObject query = problem_query(v_object);
            return inference_datastructures_problem_query.single_clause_problem_query_p(query);
        }
        return NIL;
    }

    public static SubLObject conjunctive_problem_p(final SubLObject v_object) {
        return multi_literal_problem_p(v_object);
    }

    public static SubLObject ist_problem_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != single_literal_problem_p(v_object)) && ($$ist.eql(single_literal_problem_predicate(v_object)) || ((NIL != within_normal_forward_inferenceP()) && (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql($$InferencePSC)))));
    }

    public static SubLObject join_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != conjunctive_problem_p(v_object)) && (NIL != inference_worker_split.all_literals_connected_by_shared_varsP(problem_query(v_object).first())));
    }

    public static SubLObject split_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != conjunctive_problem_p(v_object)) && (NIL == inference_worker_split.all_literals_connected_by_shared_varsP(problem_query(v_object).first())));
    }

    public static SubLObject multi_literal_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != single_clause_problem_p(v_object)) && (NIL == single_literal_problem_p(v_object)));
    }

    public static SubLObject disjunctive_problem_p(final SubLObject v_object) {
        return multi_clause_problem_p(v_object);
    }

    public static SubLObject multi_clause_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != problem_p(v_object)) && (NIL == single_clause_problem_p(v_object)));
    }

    public static SubLObject multi_clause_problem_query_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_query.problem_query_p(v_object)) && (NIL == inference_datastructures_problem_query.single_clause_problem_query_p(v_object)));
    }

    public static SubLObject problem_sole_clause(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = problem_query(problem);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(query))) {
            Errors.error($str182$The_problem__S_did_not_have_a_sin, problem);
        }
        return problem_query_sole_clause(query);
    }

    public static SubLObject problem_query_sole_clause(final SubLObject query) {
        SubLObject dnf_clause = NIL;
        destructuring_bind_must_consp(query, query, $list183);
        dnf_clause = query.first();
        final SubLObject current = query.rest();
        if (NIL == current) {
            return dnf_clause;
        }
        cdestructuring_bind_error(query, $list183);
        return NIL;
    }

    public static SubLObject problem_in_equality_reasoning_domainP(final SubLObject problem) {
        final SubLObject query = problem_query(problem);
        final SubLObject store = problem_store(problem);
        final SubLObject equality_reasoning_domain = inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
        return inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, equality_reasoning_domain);
    }

    public static SubLObject problem_relevant_to_some_inferenceP(final SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_relevant_inference(problem));
    }

    public static SubLObject first_problem_relevant_inference(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$18 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$18);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != problem_relevant_to_inferenceP(problem, inference)) {
                            return inference;
                        }
                    }
                }
            }
            final SubLObject idx_$19 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$19)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$19);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            return inference2;
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_relevant_to_only_one_inferenceP(final SubLObject problem) {
        SubLObject inference1 = NIL;
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$20 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$20);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference2;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference2 = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference2)) {
                            inference2 = $SKIP;
                        }
                        if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            if (NIL != inference1) {
                                return NIL;
                            }
                            inference1 = inference2;
                        }
                    }
                }
            }
            final SubLObject idx_$21 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$21)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$21);
                SubLObject id2 = NIL;
                SubLObject inference3 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference3 = getEntryValue(cdohash_entry);
                        if (NIL != problem_relevant_to_inferenceP(problem, inference3)) {
                            if (NIL != inference1) {
                                return NIL;
                            }
                            inference1 = inference3;
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return list_utilities.sublisp_boolean(inference1);
    }

    public static SubLObject problem_relevant_to_inferenceP(final SubLObject problem, final SubLObject inference) {
        return NIL != inference_datastructures_inference.valid_inference_p(inference) ? set.set_memberP(problem, inference_datastructures_inference.inference_relevant_problems(inference)) : NIL;
    }

    public static SubLObject problem_relevant_to_strategyP(final SubLObject problem, final SubLObject strategy) {
        return problem_relevant_to_inferenceP(problem, inference_datastructures_strategy.strategy_inference(strategy));
    }

    public static SubLObject problem_relevant_strategies(final SubLObject problem) {
        SubLObject result = NIL;
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$22 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$22);
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
                        if (NIL != problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    result = cons(strategy, result);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$23 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$23)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$23);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    result = cons(strategy2, result);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return nreverse(result);
    }

    public static SubLObject problem_active_in_some_strategyP(final SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_active_strategy(problem));
    }

    public static SubLObject first_problem_active_strategy(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$24 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$24);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    strategy = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(strategy)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(strategy)) {
                            strategy = $SKIP;
                        }
                        if (NIL != inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy)) {
                            return strategy;
                        }
                    }
                }
            }
            final SubLObject idx_$25 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$25)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$25);
                SubLObject id2 = NIL;
                SubLObject strategy2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        strategy2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy2)) {
                            return strategy2;
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_argument_link_count(final SubLObject problem) {
        return set_contents.set_contents_size(prob_argument_links(problem));
    }

    public static SubLObject problem_argument_link_of_type_count(final SubLObject problem, final SubLObject type) {
        SubLObject count = ZERO_INTEGER;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject problem_has_argument_link_p(final SubLObject problem) {
        return makeBoolean(NIL == set_contents.set_contents_emptyP(prob_argument_links(problem)));
    }

    public static SubLObject problem_has_argument_link_of_typeP(final SubLObject problem, final SubLObject type) {
        return list_utilities.sublisp_boolean(problem_first_argument_link_of_type(problem, type));
    }

    public static SubLObject problem_first_argument_link_of_type(final SubLObject problem, final SubLObject type) {
        SubLObject first_link = NIL;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type))) && (NIL == first_link)) {
                first_link = link;
            }
        }
        return first_link;
    }

    public static SubLObject problem_sole_argument_link_of_type(final SubLObject problem, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_link = NIL;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type))) {
                if (NIL != first_link) {
                    Errors.error($str184$Found_more_than_one__a_argument_l, type, problem);
                } else {
                    first_link = link;
                }
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == first_link)) {
            Errors.error($str185$Expected__a_to_have_a__a_argument, problem, type);
        }
        return first_link;
    }

    public static SubLObject problem_all_argument_links_have_typeP(final SubLObject problem, final SubLObject link_type) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_enumerated_types.problem_link_type_p(link_type) : "inference_datastructures_enumerated_types.problem_link_type_p(link_type) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_link_type_p(link_type) " + link_type;
        SubLObject failedP = NIL;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == failedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link)) && (!link_type.eql(inference_datastructures_problem_link.problem_link_type(link)))) {
                failedP = T;
            }
        }
        return makeBoolean(NIL == failedP);
    }

    public static SubLObject problem_has_supporting_problem_p(final SubLObject problem) {
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link)) && (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(argument_link))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject all_problem_argument_problems(final SubLObject problem) {
        SubLObject problem_set = set_contents.new_set_contents(problem_argument_link_count(problem), symbol_function(EQ));
        problem_set = all_problem_argument_problems_recursive(problem, problem_set);
        return Sort.sort(set_contents.set_contents_element_list(problem_set), $sym187$_, PROBLEM_SUID);
    }

    public static SubLObject all_problem_argument_problems_recursive(final SubLObject problem, SubLObject problem_set) {
        if (NIL == set_contents.set_contents_memberP(problem, problem_set, symbol_function(EQ))) {
            problem_set = set_contents.set_contents_add(problem, problem_set, symbol_function(EQ));
            final SubLObject set_contents_var = problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject argument_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            argument_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            problem_set = all_problem_argument_problems_recursive(argument_problem, problem_set);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    } 
                }
            }
        }
        return problem_set;
    }

    public static SubLObject problem_dependent_link_count(final SubLObject problem) {
        return set_contents.set_contents_size(prob_dependent_links(problem));
    }

    public static SubLObject problem_sole_dependent_link(final SubLObject problem) {
        SubLObject result = NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                if (NIL != result) {
                    return Errors.error($str189$_a_had_more_than_one_dependent_li, problem);
                }
                result = dependent_link;
            }
        }
        if (NIL != result) {
            return result;
        }
        return Errors.error($str190$_a_had_no_dependent_links, problem);
    }

    public static SubLObject problem_has_dependent_link_p(final SubLObject problem) {
        return makeBoolean(NIL == set_contents.set_contents_emptyP(prob_dependent_links(problem)));
    }

    public static SubLObject problem_has_dependent_link_of_typeP(final SubLObject problem, final SubLObject type) {
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, type))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject problem_has_answer_link_p(final SubLObject problem) {
        return problem_has_dependent_link_of_typeP(problem, $ANSWER);
    }

    public static SubLObject problem_has_non_answer_dependent_link_p(final SubLObject problem) {
        if (NIL == problem_has_dependent_link_p(problem)) {
            return NIL;
        }
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) && (NIL == inference_worker_answer.answer_link_p(dependent_link))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject problem_has_only_non_abducible_rule_transformation_dependent_linksP(final SubLObject problem) {
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $TRANSFORMATION)) {
                    if (NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link))) {
                        result = T;
                    } else {
                        result = NIL;
                        doneP = T;
                    }
                } else {
                    doneP = T;
                    result = NIL;
                }
            }
        }
        return result;
    }

    public static SubLObject problem_supported_problems(final SubLObject problem) {
        SubLObject result = NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem) {
                    result = cons(supported_problem, result);
                }
            }
        }
        return nreverse(result);
    }

    public static SubLObject problem_supported_problem_count(final SubLObject problem) {
        final SubLObject result = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem) {
                    set.set_add(supported_problem, result);
                }
            }
        }
        return set.set_size(result);
    }

    public static SubLObject problem_has_more_than_one_supported_problemP(final SubLObject problem) {
        SubLObject first_supported_problem = NIL;
        SubLObject more_than_oneP = NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem) {
                    if (NIL == first_supported_problem) {
                        first_supported_problem = supported_problem;
                    } else
                        if (!supported_problem.eql(first_supported_problem)) {
                            more_than_oneP = T;
                        }

                }
            }
        }
        return more_than_oneP;
    }

    public static SubLObject problem_next_tactic_suid(final SubLObject problem) {
        return problem_tactic_count(problem);
    }

    public static SubLObject problem_tactic_count(final SubLObject problem) {
        final SubLObject tactics = problem_tactics(problem);
        if (NIL != tactics) {
            return number_utilities.f_1X(inference_datastructures_tactic.tactic_suid(tactics.first()));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject problem_has_no_tacticsP(final SubLObject problem) {
        return sublisp_null(problem_tactics(problem));
    }

    public static SubLObject problem_tactic_count_with_hl_module(final SubLObject problem, final SubLObject tactic_hl_module) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_hl_module_match(tactic, tactic_hl_module)) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject problem_tactic_count_with_hl_module_and_status(final SubLObject problem, final SubLObject tactic_hl_module, final SubLObject tactic_status) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != do_problem_tactics_status_match(tactic, tactic_status)) && (NIL != do_problem_tactics_hl_module_match(tactic, tactic_hl_module))) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject problem_possible_tactics(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return list_utilities.remove_if_not($sym193$TACTIC_POSSIBLE_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_has_possible_tacticsP(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return list_utilities.sublisp_boolean(find_if($sym193$TACTIC_POSSIBLE_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject problem_no_tactics_possibleP(final SubLObject problem) {
        return makeBoolean(NIL == problem_has_possible_tacticsP(problem));
    }

    public static SubLObject problem_executed_tactics(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return list_utilities.remove_if_not($sym194$TACTIC_EXECUTED_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_discarded_tactics(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return list_utilities.remove_if_not($sym195$TACTIC_DISCARDED_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_possible_tactic_count(final SubLObject problem) {
        return problem_tactic_with_status_count(problem, $POSSIBLE);
    }

    public static SubLObject problem_executed_tactic_count(final SubLObject problem) {
        return problem_tactic_with_status_count(problem, $EXECUTED);
    }

    public static SubLObject problem_discarded_tactic_count(final SubLObject problem) {
        return problem_tactic_with_status_count(problem, $DISCARDED);
    }

    public static SubLObject problem_tactic_of_type_with_status_count(final SubLObject problem, SubLObject type, SubLObject status) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (status == UNPROVIDED) {
            status = NIL;
        }
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        if (((NIL != type) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == generalized_tactic_type_p(type))) {
            throw new AssertionError(type);
        }
        if (((NIL != status) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_enumerated_types.tactic_status_p(status))) {
            throw new AssertionError(status);
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != do_problem_tactics_type_match(tactic, type)) && (NIL != do_problem_tactics_status_match(tactic, status))) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject problem_tactic_with_status_count(final SubLObject problem, SubLObject status) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        return problem_tactic_of_type_with_status_count(problem, NIL, status);
    }

    public static SubLObject problem_has_tactic_of_type_with_statusP(final SubLObject problem, final SubLObject type, SubLObject status) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        SubLObject foundP;
        SubLObject rest;
        SubLObject tactic;
        for (foundP = NIL, rest = NIL, rest = problem_tactics(problem); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
            tactic = rest.first();
            if ((NIL != do_problem_tactics_type_match(tactic, type)) && (NIL != do_problem_tactics_status_match(tactic, status))) {
                foundP = T;
            }
        }
        return foundP;
    }

    public static SubLObject problem_has_tactic_of_typeP(final SubLObject problem, final SubLObject type) {
        return problem_has_tactic_of_type_with_statusP(problem, type, UNPROVIDED);
    }

    public static SubLObject problem_has_removal_tacticsP(final SubLObject problem) {
        return problem_has_tactic_of_typeP(problem, $GENERALIZED_REMOVAL);
    }

    public static SubLObject problem_has_transformation_tacticsP(final SubLObject problem) {
        return problem_has_tactic_of_typeP(problem, $TRANSFORMATION);
    }

    public static SubLObject problem_has_possible_transformation_tacticsP(final SubLObject problem) {
        return problem_has_tactic_of_type_with_statusP(problem, $TRANSFORMATION, $POSSIBLE);
    }

    public static SubLObject problem_has_possible_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        return problem_has_tactic_of_type_with_statusP(problem, $REMOVAL, $POSSIBLE);
    }

    public static SubLObject problem_has_complete_possible_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL != do_problem_tactics_status_match(tactic, $POSSIBLE))) && (NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject problem_has_split_tacticsP(final SubLObject problem) {
        SubLObject foundP;
        SubLObject rest;
        SubLObject tactic;
        for (foundP = NIL, rest = NIL, rest = problem_tactics(problem); (NIL == foundP) && (NIL != rest); foundP = inference_worker_split.split_tactic_p(tactic) , rest = rest.rest()) {
            tactic = rest.first();
        }
        return foundP;
    }

    public static SubLObject problem_has_an_in_progress_tacticP(final SubLObject problem) {
        SubLObject has_oneP;
        SubLObject rest;
        SubLObject tactic;
        for (has_oneP = NIL, rest = NIL, rest = problem_tactics(problem); (NIL == has_oneP) && (NIL != rest); rest = rest.rest()) {
            tactic = rest.first();
            if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                has_oneP = T;
            }
        }
        return has_oneP;
    }

    public static SubLObject problem_has_an_in_progress_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject has_oneP;
        SubLObject rest;
        SubLObject tactic;
        for (has_oneP = NIL, rest = NIL, rest = problem_tactics(problem); (NIL == has_oneP) && (NIL != rest); rest = rest.rest()) {
            tactic = rest.first();
            if (((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context))) && (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic))) {
                has_oneP = T;
            }
        }
        return has_oneP;
    }

    public static SubLObject any_problem_has_an_in_progress_tacticP(final SubLObject problems) {
        return list_utilities.any_in_list($sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_, problems, UNPROVIDED);
    }

    public static SubLObject problem_has_no_logical_tacticsP(final SubLObject problem) {
        return makeBoolean(NIL == problem_has_tactic_of_typeP(problem, $LOGICAL));
    }

    public static SubLObject problem_total_removal_productivity(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL != do_problem_tactics_status_match(tactic, $POSSIBLE))) {
                final SubLObject tactic_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return total_productivity;
    }

    public static SubLObject problem_total_deductive_removal_productivity(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL != do_problem_tactics_status_match(tactic, $POSSIBLE))) && (NIL == inference_datastructures_tactic.abductive_tacticP(tactic))) {
                final SubLObject tactic_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return total_productivity;
    }

    public static SubLObject problem_total_actual_removal_productivity(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL == inference_datastructures_tactic.tactic_discardedP(tactic))) {
                final SubLObject tactic_productivity = inference_worker.content_tactic_actual_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return total_productivity;
    }

    public static SubLObject problem_possible_removal_tactics(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        SubLObject tactics = NIL;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL != do_problem_tactics_status_match(tactic, $POSSIBLE))) {
                tactics = cons(tactic, tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return tactics;
    }

    public static SubLObject problem_executed_removal_tactic_productivities(final SubLObject problem) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != do_problem_tactics_type_match(tactic, $REMOVAL)) && (NIL != do_problem_tactics_status_match(tactic, $EXECUTED))) {
                final SubLObject removal_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                final SubLObject module_name = inference_modules.hl_module_name(removal_module);
                final SubLObject original_productivity = inference_datastructures_tactic.tactic_original_productivity(tactic);
                final SubLObject actual_productivity = inference_worker.content_tactic_actual_productivity(tactic);
                tuples = cons(list(module_name, original_productivity, actual_productivity), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    public static SubLObject all_problem_proofs(final SubLObject problem, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_proofs = NIL;
        final SubLObject status_var = proof_status;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = proof_list;
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != proof_has_statusP(proof, status_var)) {
                    all_proofs = cons(proof, all_proofs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return all_proofs;
    }

    public static SubLObject problem_proof_count(final SubLObject problem, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = problem_store(problem);
        if ((NIL != proof_status) && (NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store))) {
            SubLObject count = ZERO_INTEGER;
            final SubLObject status_var = proof_status;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != proof_has_statusP(proof, status_var)) {
                        count = add(count, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return count;
        }
        if (proof_status == $REJECTED) {
            return ZERO_INTEGER;
        }
        return dictionary_contents.dictionary_contents_size(prob_proof_bindings_index(problem));
    }

    public static SubLObject problem_proven_proof_count(final SubLObject problem) {
        return problem_proof_count(problem, $PROVEN);
    }

    public static SubLObject problem_has_some_proofP(final SubLObject problem, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = problem_store(problem);
        if ((NIL != proof_status) && (NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store))) {
            final SubLObject status_var = proof_status;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != proof_has_statusP(proof, status_var)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return NIL;
        }
        if (proof_status == $REJECTED) {
            return NIL;
        }
        return makeBoolean(NIL == dictionary_contents.dictionary_contents_empty_p(prob_proof_bindings_index(problem)));
    }

    public static SubLObject problem_has_some_proven_proofP(final SubLObject problem) {
        return problem_has_some_proofP(problem, $PROVEN);
    }

    public static SubLObject problem_has_some_rejected_proofP(final SubLObject problem) {
        return problem_has_some_proofP(problem, $REJECTED);
    }

    public static SubLObject problem_proofs_lookup(final SubLObject problem, final SubLObject v_bindings) {
        final SubLObject index = prob_proof_bindings_index(problem);
        final SubLObject proofs = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, symbol_function(EQUAL), UNPROVIDED);
        return proofs;
    }

    public static SubLObject problem_argument_links_lookup(final SubLObject problem, final SubLObject v_bindings) {
        final SubLObject index = prob_argument_link_bindings_index(problem);
        final SubLObject links = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, symbol_function(EQUAL), UNPROVIDED);
        return links;
    }

    public static SubLObject problem_potentially_processedP(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject potentially_processed_problems = inference_datastructures_problem_store.problem_store_potentially_processed_problems(store);
        return set.set_memberP(problem, potentially_processed_problems);
    }

    public static SubLObject note_problem_potentially_processed(final SubLObject problem) {
        return inference_datastructures_problem_store.problem_store_note_problem_potentially_processed(problem_store(problem), problem);
    }

    public static SubLObject problem_indestructibleP(final SubLObject problem) {
        final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
        final SubLObject indestructible_problems = inference_datastructures_problem_store.problem_store_janitor_indestructible_problems(janitor);
        return set.set_memberP(problem, indestructible_problems);
    }

    public static SubLObject problem_destructibleP(final SubLObject problem) {
        final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
        return makeBoolean((NIL == inference_datastructures_problem_store.problem_store_janitor_staleP(janitor)) && (NIL == problem_indestructibleP(problem)));
    }

    public static SubLObject problem_destructibility_status(final SubLObject problem) {
        if (NIL != problem_indestructibleP(problem)) {
            return $INDESTRUCTIBLE;
        }
        if (NIL != problem_destructibleP(problem)) {
            return $DESTRUCTIBLE;
        }
        return $UNKNOWN;
    }

    public static SubLObject problem_min_depth(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject hash = inference_datastructures_problem_store.problem_store_min_depth_index(store);
        final SubLObject depth = gethash_without_values(problem, hash, $UNDETERMINED);
        return depth;
    }

    public static SubLObject problem_min_proof_depth(final SubLObject problem, final SubLObject inference) {
        final SubLObject store = problem_store(problem);
        final SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, UNPROVIDED);
        if (NIL != hash) {
            final SubLObject depth = gethash_without_values(problem, hash, UNPROVIDED);
            if (NIL != subl_promotions.non_negative_integer_p(depth)) {
                return depth;
            }
        }
        return $UNDETERMINED;
    }

    public static SubLObject problem_intuitive_min_transformation_depth(final SubLObject problem, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $transformation_depth_computation$.currentBinding(thread);
        try {
            $transformation_depth_computation$.bind($INTUITIVE, thread);
            return problem_min_transformation_depth(problem, inference);
        } finally {
            $transformation_depth_computation$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject problem_min_transformation_depth(final SubLObject problem, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return inference_min_transformation_depth.problem_min_transformation_depth_from_signature(problem, inference);
        }
        final SubLObject store = problem_store(problem);
        final SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, UNPROVIDED);
        if (NIL != hash) {
            final SubLObject depth = gethash_without_values(problem, hash, UNPROVIDED);
            if (NIL != subl_promotions.non_negative_integer_p(depth)) {
                return depth;
            }
        }
        return $UNDETERMINED;
    }

    public static SubLObject problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference) {
        final SubLObject store = problem_store(problem);
        final SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, UNPROVIDED);
        if (NIL != hash) {
            final SubLObject depth = gethash_without_values(problem, hash, UNPROVIDED);
            if (NIL != depth) {
                return depth;
            }
        }
        return $UNDETERMINED;
    }

    public static SubLObject problem_backchain_requiredP(final SubLObject problem) {
        final SubLObject cache_value = prob_backchain_required(problem);
        if (NIL != booleanp(cache_value)) {
            return cache_value;
        }
        final SubLObject backchain_requiredP = inference_trampolines.compute_problem_backchain_requiredP(problem);
        _csetf_prob_backchain_required(problem, backchain_requiredP);
        return backchain_requiredP;
    }

    public static SubLObject add_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(argument_link) : "inference_datastructures_problem_link.problem_link_p(argument_link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(argument_link) " + argument_link;
        _csetf_prob_argument_links(problem, set_contents.set_contents_add(argument_link, prob_argument_links(problem), symbol_function(EQ)));
        return problem;
    }

    public static SubLObject remove_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(argument_link) : "inference_datastructures_problem_link.problem_link_p(argument_link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(argument_link) " + argument_link;
        _csetf_prob_argument_links(problem, set_contents.set_contents_delete(argument_link, prob_argument_links(problem), symbol_function(EQ)));
        return problem;
    }

    public static SubLObject index_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        final SubLObject index = prob_argument_link_bindings_index(problem);
        final SubLObject v_bindings = (NIL != inference_worker_removal.removal_link_p(argument_link)) ? inference_worker_removal.removal_link_bindings(argument_link) : NIL != inference_worker_restriction.restriction_link_p(argument_link) ? inference_worker_restriction.restriction_link_bindings(argument_link) : NIL;
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, symbol_function(EQUAL), UNPROVIDED);
        existing = cons(argument_link, existing);
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, symbol_function(EQUAL)));
        return problem;
    }

    public static SubLObject deindex_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        final SubLObject index = prob_argument_link_bindings_index(problem);
        final SubLObject v_bindings = (NIL != inference_worker_removal.removal_link_p(argument_link)) ? inference_worker_removal.removal_link_bindings(argument_link) : NIL != inference_worker_restriction.restriction_link_p(argument_link) ? inference_worker_restriction.restriction_link_bindings(argument_link) : NIL;
        final SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject updated = list_utilities.delete_first(argument_link, existing, symbol_function(EQ));
        if (!existing.eql(updated)) {
            if (NIL == updated) {
                _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_delete(index, v_bindings, symbol_function(EQUAL)));
            } else {
                _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, symbol_function(EQUAL)));
            }
        }
        return problem;
    }

    public static SubLObject add_problem_dependent_link(final SubLObject problem, final SubLObject dependent_link) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) : "inference_datastructures_problem_link.problem_link_p(dependent_link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) " + dependent_link;
        _csetf_prob_dependent_links(problem, set_contents.set_contents_add(dependent_link, prob_dependent_links(problem), symbol_function(EQ)));
        inference_metrics.increment_dependent_link_historical_count();
        if (NIL != single_literal_problem_p(problem)) {
            inference_metrics.increment_single_literal_problem_dependent_link_historical_count();
        }
        return problem;
    }

    public static SubLObject remove_problem_dependent_link(final SubLObject problem, final SubLObject dependent_link) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) : "inference_datastructures_problem_link.problem_link_p(dependent_link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) " + dependent_link;
        _csetf_prob_dependent_links(problem, set_contents.set_contents_delete(dependent_link, prob_dependent_links(problem), symbol_function(EQ)));
        return problem;
    }

    public static SubLObject add_problem_tactic(final SubLObject problem, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!problem_tactic_count(problem).numLE($max_problem_tactics$.getGlobalValue()))) {
            Errors.error($str214$Tried_to_add__s_to__s__which_woul, new SubLObject[]{ tactic, problem, $max_problem_tactics$.getGlobalValue(), problem });
        }
        _csetf_prob_tactics(problem, cons(tactic, prob_tactics(problem)));
        return problem;
    }

    public static SubLObject remove_problem_tactic(final SubLObject problem, final SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
        _csetf_prob_tactics(problem, delete(tactic, prob_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return problem;
    }

    public static SubLObject add_problem_proof(final SubLObject problem, final SubLObject proof) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        final SubLObject index = prob_proof_bindings_index(problem);
        final SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, symbol_function(EQUAL), UNPROVIDED);
        existing = cons(proof, existing);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, symbol_function(EQUAL)));
        return problem;
    }

    public static SubLObject remove_problem_proof(final SubLObject problem, final SubLObject proof) {
        final SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
        return remove_problem_proof_with_bindings(problem, proof, v_bindings);
    }

    public static SubLObject remove_problem_proof_with_bindings(final SubLObject problem, final SubLObject proof, final SubLObject v_bindings) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        assert NIL != bindings.bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) {
                inference_worker_join_ordered.remove_join_ordered_link_proof_both_ways(join_ordered_link, proof, v_bindings);
            }
        }
        set_contents_var = problem_dependent_links(problem);
        SubLObject join_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, join_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_link, $JOIN))) {
                inference_worker_join.remove_join_link_proof_both_ways(join_link, proof, v_bindings);
            }
        }
        final SubLObject index = prob_proof_bindings_index(problem);
        final SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject updated = list_utilities.delete_first(proof, existing, symbol_function(EQ));
        if (!existing.eql(updated)) {
            if (NIL == updated) {
                _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_delete(index, v_bindings, symbol_function(EQUAL)));
            } else {
                _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, symbol_function(EQUAL)));
            }
        }
        return problem;
    }

    public static SubLObject set_problem_min_depth(final SubLObject problem, final SubLObject depth) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : "subl_promotions.non_negative_integer_p(depth) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(depth) " + depth;
        final SubLObject store = problem_store(problem);
        final SubLObject hash = inference_datastructures_problem_store.problem_store_min_depth_index(store);
        sethash(problem, hash, depth);
        return problem;
    }

    public static SubLObject set_problem_min_proof_depth(final SubLObject problem, final SubLObject inference, final SubLObject depth) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : "subl_promotions.non_negative_integer_p(depth) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(depth) " + depth;
        final SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, UNPROVIDED);
        if (NIL == hash) {
            hash = make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, hash);
        }
        sethash(problem, hash, depth);
        return problem;
    }

    public static SubLObject set_problem_min_transformation_depth(final SubLObject problem, final SubLObject inference, final SubLObject depth) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : "subl_promotions.non_negative_integer_p(depth) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(depth) " + depth;
        final SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, UNPROVIDED);
        if (NIL == hash) {
            hash = make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, hash);
        }
        sethash(problem, hash, depth);
        inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
        return problem;
    }

    public static SubLObject set_problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference, final SubLObject pqds) {
        assert NIL != problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != inference_min_transformation_depth.problem_query_depth_signature_p(pqds) : "inference_min_transformation_depth.problem_query_depth_signature_p(pqds) " + "CommonSymbols.NIL != inference_min_transformation_depth.problem_query_depth_signature_p(pqds) " + pqds;
        final SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, UNPROVIDED);
        if (NIL == hash) {
            hash = make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, hash);
        }
        sethash(problem, hash, pqds);
        final SubLObject depth = inference_min_transformation_depth.min_transformation_depth_from_signature(pqds);
        inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
        return problem;
    }

    public static SubLObject set_root_problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference) {
        final SubLObject problem_query = problem_query(problem);
        final SubLObject initial_pqds = inference_min_transformation_depth.new_initial_pqds(problem_query, UNPROVIDED);
        return set_problem_min_transformation_depth_signature(problem, inference, initial_pqds);
    }

    public static SubLObject note_problem_indestructible(final SubLObject problem) {
        if (NIL == problem_indestructibleP(problem)) {
            final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
            inference_datastructures_problem_store.problem_store_janitor_note_problem_indestructible(janitor, problem);
        }
        return problem;
    }

    public static SubLObject note_problem_destructible(final SubLObject problem) {
        if (NIL == problem_destructibleP(problem)) {
            final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
            inference_datastructures_problem_store.problem_store_janitor_note_problem_destructible(janitor, problem);
        }
        return problem;
    }

    public static SubLObject note_problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference, final SubLObject new_pqds) {
        final SubLObject old_pqds = problem_min_transformation_depth_signature(problem, inference);
        final SubLObject updated_pqds = ($UNDETERMINED == old_pqds) ? new_pqds : inference_min_transformation_depth.pqds_merge(old_pqds, new_pqds);
        if (!old_pqds.equal(updated_pqds)) {
            set_problem_min_transformation_depth_signature(problem, inference, updated_pqds);
            return T;
        }
        return NIL;
    }

    public static SubLObject problem_tactical_provability_status(final SubLObject problem) {
        final SubLObject status = problem_dwimmed_status(problem);
        return inference_datastructures_enumerated_types.provability_status_from_problem_status(status);
    }

    public static SubLObject tactically_good_problem_p(final SubLObject problem) {
        return inference_worker.problem_goodP(problem);
    }

    public static SubLObject tactically_no_good_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.no_good_problem_status_p(problem_status(problem));
    }

    public static SubLObject tactically_neutral_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.neutral_problem_status_p(problem_status(problem));
    }

    public static SubLObject problem_tactical_status(final SubLObject problem) {
        final SubLObject status = problem_status(problem);
        return inference_datastructures_enumerated_types.tactical_status_from_problem_status(status);
    }

    public static SubLObject tactically_new_problem_p(final SubLObject problem) {
        return eq($NEW, inference_datastructures_enumerated_types.tactical_status_from_problem_status(problem_status(problem)));
    }

    public static SubLObject tactically_unexamined_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.unexamined_problem_status_p(problem_status(problem));
    }

    public static SubLObject tactically_examined_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.examined_problem_status_p(problem_status(problem));
    }

    public static SubLObject tactically_possible_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.possible_problem_status_p(problem_status(problem));
    }

    public static SubLObject tactically_pending_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.pending_problem_status_p(problem_status(problem));
    }

    public static SubLObject tactically_finished_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.finished_problem_status_p(problem_status(problem));
    }

    public static SubLObject tactical_problem_p(final SubLObject problem) {
        return makeBoolean(((NIL != tactically_possible_problem_p(problem)) || (NIL != tactically_pending_problem_p(problem))) || (NIL != tactically_finished_problem_p(problem)));
    }

    public static SubLObject tactically_potentially_possible_problem_p(final SubLObject problem) {
        return makeBoolean((NIL != tactically_possible_problem_p(problem)) || (NIL != tactically_unexamined_problem_p(problem)));
    }

    public static SubLObject tactically_not_potentially_possible_problem_p(final SubLObject problem) {
        return makeBoolean(((NIL != tactically_examined_problem_p(problem)) || (NIL != tactically_pending_problem_p(problem))) || (NIL != tactically_finished_problem_p(problem)));
    }

    public static SubLObject problem_store_all_modules(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        final SubLObject module_counts = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$26 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                SubLObject module;
                SubLObject module_name;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        cdolist_list_var = problem_tactics(problem);
                        tactic = NIL;
                        tactic = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            module = inference_datastructures_tactic.tactic_hl_module(tactic);
                            module_name = inference_modules.hl_module_name(module);
                            dictionary_utilities.dictionary_increment(module_counts, module_name, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            tactic = cdolist_list_var.first();
                        } 
                    }
                }
            }
            final SubLObject idx_$27 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$27)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$27);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = problem_tactics(problem2);
                        SubLObject tactic2 = NIL;
                        tactic2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject module2 = inference_datastructures_tactic.tactic_hl_module(tactic2);
                            final SubLObject module_name2 = inference_modules.hl_module_name(module2);
                            dictionary_utilities.dictionary_increment(module_counts, module_name2, UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            tactic2 = cdolist_list_var2.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sort.sort(dictionary_utilities.dictionary_to_alist(module_counts), symbol_function($sym220$_), symbol_function(CDR));
    }

    public static SubLObject declare_inference_datastructures_problem_file() {
        declareFunction(me, "problem_print_function_trampoline", "PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "problem_p", "PROBLEM-P", 1, 0, false);
        new inference_datastructures_problem.$problem_p$UnaryFunction();
        declareFunction(me, "prob_suid", "PROB-SUID", 1, 0, false);
        declareFunction(me, "prob_store", "PROB-STORE", 1, 0, false);
        declareFunction(me, "prob_query", "PROB-QUERY", 1, 0, false);
        declareFunction(me, "prob_free_hl_vars", "PROB-FREE-HL-VARS", 1, 0, false);
        declareFunction(me, "prob_status", "PROB-STATUS", 1, 0, false);
        declareFunction(me, "prob_dependent_links", "PROB-DEPENDENT-LINKS", 1, 0, false);
        declareFunction(me, "prob_argument_links", "PROB-ARGUMENT-LINKS", 1, 0, false);
        declareFunction(me, "prob_tactics", "PROB-TACTICS", 1, 0, false);
        declareFunction(me, "prob_proof_bindings_index", "PROB-PROOF-BINDINGS-INDEX", 1, 0, false);
        declareFunction(me, "prob_argument_link_bindings_index", "PROB-ARGUMENT-LINK-BINDINGS-INDEX", 1, 0, false);
        declareFunction(me, "prob_backchain_required", "PROB-BACKCHAIN-REQUIRED", 1, 0, false);
        declareFunction(me, "prob_memoization_state", "PROB-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "_csetf_prob_suid", "_CSETF-PROB-SUID", 2, 0, false);
        declareFunction(me, "_csetf_prob_store", "_CSETF-PROB-STORE", 2, 0, false);
        declareFunction(me, "_csetf_prob_query", "_CSETF-PROB-QUERY", 2, 0, false);
        declareFunction(me, "_csetf_prob_free_hl_vars", "_CSETF-PROB-FREE-HL-VARS", 2, 0, false);
        declareFunction(me, "_csetf_prob_status", "_CSETF-PROB-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_prob_dependent_links", "_CSETF-PROB-DEPENDENT-LINKS", 2, 0, false);
        declareFunction(me, "_csetf_prob_argument_links", "_CSETF-PROB-ARGUMENT-LINKS", 2, 0, false);
        declareFunction(me, "_csetf_prob_tactics", "_CSETF-PROB-TACTICS", 2, 0, false);
        declareFunction(me, "_csetf_prob_proof_bindings_index", "_CSETF-PROB-PROOF-BINDINGS-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_prob_argument_link_bindings_index", "_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_prob_backchain_required", "_CSETF-PROB-BACKCHAIN-REQUIRED", 2, 0, false);
        declareFunction(me, "_csetf_prob_memoization_state", "_CSETF-PROB-MEMOIZATION-STATE", 2, 0, false);
        declareFunction(me, "make_problem", "MAKE-PROBLEM", 0, 1, false);
        declareFunction(me, "visit_defstruct_problem", "VISIT-DEFSTRUCT-PROBLEM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_problem_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-METHOD", 2, 0, false);
        declareFunction(me, "valid_problem_p", "VALID-PROBLEM-P", 1, 0, false);
        declareFunction(me, "problem_invalid_p", "PROBLEM-INVALID-P", 1, 0, false);
        declareFunction(me, "print_problem", "PRINT-PROBLEM", 3, 0, false);
        declareFunction(me, "sxhash_problem_method", "SXHASH-PROBLEM-METHOD", 1, 0, false);
        new inference_datastructures_problem.$sxhash_problem_method$UnaryFunction();
        declareFunction(me, "new_problem", "NEW-PROBLEM", 3, 0, false);
        declareMacro(me, "with_problem_memoization_state", "WITH-PROBLEM-MEMOIZATION-STATE");
        declareFunction(me, "problem_memoization_state", "PROBLEM-MEMOIZATION-STATE", 1, 0, false);
        declareMacro(me, "do_problem_literals", "DO-PROBLEM-LITERALS");
        declareMacro(me, "do_problem_tactics", "DO-PROBLEM-TACTICS");
        declareFunction(me, "problem_tactics", "PROBLEM-TACTICS", 1, 0, false);
        declareFunction(me, "do_problem_tactics_status_match", "DO-PROBLEM-TACTICS-STATUS-MATCH", 2, 0, false);
        declareFunction(me, "do_problem_tactics_completeness_match", "DO-PROBLEM-TACTICS-COMPLETENESS-MATCH", 2, 0, false);
        declareFunction(me, "do_problem_tactics_preference_level_match", "DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH", 2, 0, false);
        declareFunction(me, "do_problem_tactics_productivity_match", "DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH", 2, 0, false);
        declareFunction(me, "do_problem_tactics_hl_module_match", "DO-PROBLEM-TACTICS-HL-MODULE-MATCH", 2, 0, false);
        declareFunction(me, "generalized_tactic_type_p", "GENERALIZED-TACTIC-TYPE-P", 1, 0, false);
        declareFunction(me, "do_problem_tactics_type_match", "DO-PROBLEM-TACTICS-TYPE-MATCH", 2, 0, false);
        declareFunction(me, "tactic_matches_type_specP", "TACTIC-MATCHES-TYPE-SPEC?", 2, 0, false);
        declareFunction(me, "tactic_matches_any_of_type_specsP", "TACTIC-MATCHES-ANY-OF-TYPE-SPECS?", 2, 0, false);
        declareFunction(me, "problem_argument_links", "PROBLEM-ARGUMENT-LINKS", 1, 0, false);
        declareFunction(me, "problem_all_argument_links", "PROBLEM-ALL-ARGUMENT-LINKS", 1, 0, false);
        declareMacro(me, "do_problem_dependent_links", "DO-PROBLEM-DEPENDENT-LINKS");
        declareFunction(me, "problem_dependent_links", "PROBLEM-DEPENDENT-LINKS", 1, 0, false);
        declareFunction(me, "problem_all_dependent_links", "PROBLEM-ALL-DEPENDENT-LINKS", 1, 0, false);
        declareMacro(me, "do_problem_dependent_link_interpretations", "DO-PROBLEM-DEPENDENT-LINK-INTERPRETATIONS");
        declareMacro(me, "do_problem_supported_problems", "DO-PROBLEM-SUPPORTED-PROBLEMS");
        declareMacro(me, "do_problem_supported_inferences", "DO-PROBLEM-SUPPORTED-INFERENCES");
        declareMacro(me, "do_problem_supporting_problems", "DO-PROBLEM-SUPPORTING-PROBLEMS");
        declareMacro(me, "do_problem_proofs", "DO-PROBLEM-PROOFS");
        declareFunction(me, "problem_proof_bindings_index", "PROBLEM-PROOF-BINDINGS-INDEX", 1, 0, false);
        declareFunction(me, "proof_has_statusP", "PROOF-HAS-STATUS?", 2, 0, false);
        declareMacro(me, "do_problem_active_inferences", "DO-PROBLEM-ACTIVE-INFERENCES");
        declareMacro(me, "do_problem_relevant_inferences", "DO-PROBLEM-RELEVANT-INFERENCES");
        declareMacro(me, "do_problem_active_strategies", "DO-PROBLEM-ACTIVE-STRATEGIES");
        declareMacro(me, "do_problem_relevant_strategies", "DO-PROBLEM-RELEVANT-STRATEGIES");
        declareMacro(me, "do_problem_relevant_strategic_contexts", "DO-PROBLEM-RELEVANT-STRATEGIC-CONTEXTS");
        declareFunction(me, "destroy_problem", "DESTROY-PROBLEM", 1, 0, false);
        declareFunction(me, "destroy_problem_store_problem", "DESTROY-PROBLEM-STORE-PROBLEM", 1, 0, false);
        declareFunction(me, "destroy_problem_int", "DESTROY-PROBLEM-INT", 1, 0, false);
        declareFunction(me, "note_problem_invalid", "NOTE-PROBLEM-INVALID", 1, 0, false);
        declareFunction(me, "problem_suid", "PROBLEM-SUID", 1, 0, false);
        declareFunction(me, "problem_store", "PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "problem_query", "PROBLEM-QUERY", 1, 0, false);
        declareFunction(me, "problem_free_hl_vars", "PROBLEM-FREE-HL-VARS", 1, 0, false);
        declareFunction(me, "problem_status", "PROBLEM-STATUS", 1, 0, false);
        declareFunction(me, "problem_dwimmed_status", "PROBLEM-DWIMMED-STATUS", 1, 0, false);
        declareFunction(me, "set_problem_free_hl_vars", "SET-PROBLEM-FREE-HL-VARS", 2, 0, false);
        declareFunction(me, "set_problem_status", "SET-PROBLEM-STATUS", 2, 0, false);
        declareFunction(me, "problem_formula", "PROBLEM-FORMULA", 1, 0, false);
        declareFunction(me, "problem_el_formula", "PROBLEM-EL-FORMULA", 1, 0, false);
        declareFunction(me, "closed_problem_p", "CLOSED-PROBLEM-P", 1, 0, false);
        declareFunction(me, "open_problem_p", "OPEN-PROBLEM-P", 1, 0, false);
        declareFunction(me, "closed_problem_query_p", "CLOSED-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(me, "open_problem_query_p", "OPEN-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(me, "closed_single_literal_problem_query_p", "CLOSED-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(me, "open_single_literal_problem_query_p", "OPEN-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(me, "problem_variables", "PROBLEM-VARIABLES", 1, 0, false);
        declareFunction(me, "problem_literal_count", "PROBLEM-LITERAL-COUNT", 1, 1, false);
        declareFunction(me, "problem_query_literal_count", "PROBLEM-QUERY-LITERAL-COUNT", 1, 1, false);
        declareFunction(me, "single_literal_problem_p", "SINGLE-LITERAL-PROBLEM-P", 1, 0, false);
        declareFunction(me, "single_literal_problem_predicate", "SINGLE-LITERAL-PROBLEM-PREDICATE", 1, 0, false);
        declareFunction(me, "single_literal_problem_atomic_sentence", "SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE", 1, 0, false);
        declareFunction(me, "single_literal_problem_mt", "SINGLE-LITERAL-PROBLEM-MT", 1, 0, false);
        declareFunction(me, "problem_mt", "PROBLEM-MT", 1, 0, false);
        declareFunction(me, "problem_mts", "PROBLEM-MTS", 1, 0, false);
        declareFunction(me, "single_literal_problem_sense", "SINGLE-LITERAL-PROBLEM-SENSE", 1, 0, false);
        declareFunction(me, "mt_asent_sense_from_single_literal_problem", "MT-ASENT-SENSE-FROM-SINGLE-LITERAL-PROBLEM", 1, 0, false);
        declareFunction(me, "single_literal_problem_with_predicate_p", "SINGLE-LITERAL-PROBLEM-WITH-PREDICATE-P", 2, 0, false);
        declareFunction(me, "single_clause_problem_p", "SINGLE-CLAUSE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "conjunctive_problem_p", "CONJUNCTIVE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "ist_problem_p", "IST-PROBLEM-P", 1, 0, false);
        declareFunction(me, "join_problem_p", "JOIN-PROBLEM-P", 1, 0, false);
        declareFunction(me, "split_problem_p", "SPLIT-PROBLEM-P", 1, 0, false);
        declareFunction(me, "multi_literal_problem_p", "MULTI-LITERAL-PROBLEM-P", 1, 0, false);
        declareFunction(me, "disjunctive_problem_p", "DISJUNCTIVE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "multi_clause_problem_p", "MULTI-CLAUSE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "multi_clause_problem_query_p", "MULTI-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(me, "problem_sole_clause", "PROBLEM-SOLE-CLAUSE", 1, 0, false);
        declareFunction(me, "problem_query_sole_clause", "PROBLEM-QUERY-SOLE-CLAUSE", 1, 0, false);
        declareFunction(me, "problem_in_equality_reasoning_domainP", "PROBLEM-IN-EQUALITY-REASONING-DOMAIN?", 1, 0, false);
        declareFunction(me, "problem_relevant_to_some_inferenceP", "PROBLEM-RELEVANT-TO-SOME-INFERENCE?", 1, 0, false);
        declareFunction(me, "first_problem_relevant_inference", "FIRST-PROBLEM-RELEVANT-INFERENCE", 1, 0, false);
        declareFunction(me, "problem_relevant_to_only_one_inferenceP", "PROBLEM-RELEVANT-TO-ONLY-ONE-INFERENCE?", 1, 0, false);
        declareFunction(me, "problem_relevant_to_inferenceP", "PROBLEM-RELEVANT-TO-INFERENCE?", 2, 0, false);
        declareFunction(me, "problem_relevant_to_strategyP", "PROBLEM-RELEVANT-TO-STRATEGY?", 2, 0, false);
        declareFunction(me, "problem_relevant_strategies", "PROBLEM-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "problem_active_in_some_strategyP", "PROBLEM-ACTIVE-IN-SOME-STRATEGY?", 1, 0, false);
        declareFunction(me, "first_problem_active_strategy", "FIRST-PROBLEM-ACTIVE-STRATEGY", 1, 0, false);
        declareFunction(me, "problem_argument_link_count", "PROBLEM-ARGUMENT-LINK-COUNT", 1, 0, false);
        declareFunction(me, "problem_argument_link_of_type_count", "PROBLEM-ARGUMENT-LINK-OF-TYPE-COUNT", 2, 0, false);
        declareFunction(me, "problem_has_argument_link_p", "PROBLEM-HAS-ARGUMENT-LINK-P", 1, 0, false);
        declareFunction(me, "problem_has_argument_link_of_typeP", "PROBLEM-HAS-ARGUMENT-LINK-OF-TYPE?", 2, 0, false);
        declareFunction(me, "problem_first_argument_link_of_type", "PROBLEM-FIRST-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
        declareFunction(me, "problem_sole_argument_link_of_type", "PROBLEM-SOLE-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
        declareFunction(me, "problem_all_argument_links_have_typeP", "PROBLEM-ALL-ARGUMENT-LINKS-HAVE-TYPE?", 2, 0, false);
        declareFunction(me, "problem_has_supporting_problem_p", "PROBLEM-HAS-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction(me, "all_problem_argument_problems", "ALL-PROBLEM-ARGUMENT-PROBLEMS", 1, 0, false);
        declareFunction(me, "all_problem_argument_problems_recursive", "ALL-PROBLEM-ARGUMENT-PROBLEMS-RECURSIVE", 2, 0, false);
        declareFunction(me, "problem_dependent_link_count", "PROBLEM-DEPENDENT-LINK-COUNT", 1, 0, false);
        declareFunction(me, "problem_sole_dependent_link", "PROBLEM-SOLE-DEPENDENT-LINK", 1, 0, false);
        declareFunction(me, "problem_has_dependent_link_p", "PROBLEM-HAS-DEPENDENT-LINK-P", 1, 0, false);
        declareFunction(me, "problem_has_dependent_link_of_typeP", "PROBLEM-HAS-DEPENDENT-LINK-OF-TYPE?", 2, 0, false);
        declareFunction(me, "problem_has_answer_link_p", "PROBLEM-HAS-ANSWER-LINK-P", 1, 0, false);
        declareFunction(me, "problem_has_non_answer_dependent_link_p", "PROBLEM-HAS-NON-ANSWER-DEPENDENT-LINK-P", 1, 0, false);
        declareFunction(me, "problem_has_only_non_abducible_rule_transformation_dependent_linksP", "PROBLEM-HAS-ONLY-NON-ABDUCIBLE-RULE-TRANSFORMATION-DEPENDENT-LINKS?", 1, 0, false);
        declareFunction(me, "problem_supported_problems", "PROBLEM-SUPPORTED-PROBLEMS", 1, 0, false);
        declareFunction(me, "problem_supported_problem_count", "PROBLEM-SUPPORTED-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "problem_has_more_than_one_supported_problemP", "PROBLEM-HAS-MORE-THAN-ONE-SUPPORTED-PROBLEM?", 1, 0, false);
        declareFunction(me, "problem_next_tactic_suid", "PROBLEM-NEXT-TACTIC-SUID", 1, 0, false);
        declareFunction(me, "problem_tactic_count", "PROBLEM-TACTIC-COUNT", 1, 0, false);
        declareFunction(me, "problem_has_no_tacticsP", "PROBLEM-HAS-NO-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_tactic_count_with_hl_module", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE", 2, 0, false);
        declareFunction(me, "problem_tactic_count_with_hl_module_and_status", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE-AND-STATUS", 3, 0, false);
        declareFunction(me, "problem_possible_tactics", "PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction(me, "problem_has_possible_tacticsP", "PROBLEM-HAS-POSSIBLE-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_no_tactics_possibleP", "PROBLEM-NO-TACTICS-POSSIBLE?", 1, 0, false);
        declareFunction(me, "problem_executed_tactics", "PROBLEM-EXECUTED-TACTICS", 1, 0, false);
        declareFunction(me, "problem_discarded_tactics", "PROBLEM-DISCARDED-TACTICS", 1, 0, false);
        declareFunction(me, "problem_possible_tactic_count", "PROBLEM-POSSIBLE-TACTIC-COUNT", 1, 0, false);
        declareFunction(me, "problem_executed_tactic_count", "PROBLEM-EXECUTED-TACTIC-COUNT", 1, 0, false);
        declareFunction(me, "problem_discarded_tactic_count", "PROBLEM-DISCARDED-TACTIC-COUNT", 1, 0, false);
        declareFunction(me, "problem_tactic_of_type_with_status_count", "PROBLEM-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
        declareFunction(me, "problem_tactic_with_status_count", "PROBLEM-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
        declareFunction(me, "problem_has_tactic_of_type_with_statusP", "PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?", 2, 1, false);
        declareFunction(me, "problem_has_tactic_of_typeP", "PROBLEM-HAS-TACTIC-OF-TYPE?", 2, 0, false);
        declareFunction(me, "problem_has_removal_tacticsP", "PROBLEM-HAS-REMOVAL-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_has_transformation_tacticsP", "PROBLEM-HAS-TRANSFORMATION-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_has_possible_transformation_tacticsP", "PROBLEM-HAS-POSSIBLE-TRANSFORMATION-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_has_possible_removal_tacticP", "PROBLEM-HAS-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(me, "problem_has_complete_possible_removal_tacticP", "PROBLEM-HAS-COMPLETE-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(me, "problem_has_split_tacticsP", "PROBLEM-HAS-SPLIT-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_has_an_in_progress_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
        declareFunction(me, "problem_has_an_in_progress_complete_removal_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(me, "any_problem_has_an_in_progress_tacticP", "ANY-PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
        declareFunction(me, "problem_has_no_logical_tacticsP", "PROBLEM-HAS-NO-LOGICAL-TACTICS?", 1, 0, false);
        declareFunction(me, "problem_total_removal_productivity", "PROBLEM-TOTAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "problem_total_deductive_removal_productivity", "PROBLEM-TOTAL-DEDUCTIVE-REMOVAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "problem_total_actual_removal_productivity", "PROBLEM-TOTAL-ACTUAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "problem_possible_removal_tactics", "PROBLEM-POSSIBLE-REMOVAL-TACTICS", 1, 0, false);
        declareFunction(me, "problem_executed_removal_tactic_productivities", "PROBLEM-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
        declareFunction(me, "all_problem_proofs", "ALL-PROBLEM-PROOFS", 1, 1, false);
        declareFunction(me, "problem_proof_count", "PROBLEM-PROOF-COUNT", 1, 1, false);
        declareFunction(me, "problem_proven_proof_count", "PROBLEM-PROVEN-PROOF-COUNT", 1, 0, false);
        declareFunction(me, "problem_has_some_proofP", "PROBLEM-HAS-SOME-PROOF?", 1, 1, false);
        declareFunction(me, "problem_has_some_proven_proofP", "PROBLEM-HAS-SOME-PROVEN-PROOF?", 1, 0, false);
        declareFunction(me, "problem_has_some_rejected_proofP", "PROBLEM-HAS-SOME-REJECTED-PROOF?", 1, 0, false);
        declareFunction(me, "problem_proofs_lookup", "PROBLEM-PROOFS-LOOKUP", 2, 0, false);
        declareFunction(me, "problem_argument_links_lookup", "PROBLEM-ARGUMENT-LINKS-LOOKUP", 2, 0, false);
        declareFunction(me, "problem_potentially_processedP", "PROBLEM-POTENTIALLY-PROCESSED?", 1, 0, false);
        declareFunction(me, "note_problem_potentially_processed", "NOTE-PROBLEM-POTENTIALLY-PROCESSED", 1, 0, false);
        declareFunction(me, "problem_indestructibleP", "PROBLEM-INDESTRUCTIBLE?", 1, 0, false);
        declareFunction(me, "problem_destructibleP", "PROBLEM-DESTRUCTIBLE?", 1, 0, false);
        declareFunction(me, "problem_destructibility_status", "PROBLEM-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction(me, "problem_min_depth", "PROBLEM-MIN-DEPTH", 1, 0, false);
        declareFunction(me, "problem_min_proof_depth", "PROBLEM-MIN-PROOF-DEPTH", 2, 0, false);
        declareFunction(me, "problem_intuitive_min_transformation_depth", "PROBLEM-INTUITIVE-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(me, "problem_min_transformation_depth", "PROBLEM-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(me, "problem_min_transformation_depth_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
        declareFunction(me, "problem_backchain_requiredP", "PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction(me, "add_problem_argument_link", "ADD-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(me, "remove_problem_argument_link", "REMOVE-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(me, "index_problem_argument_link", "INDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(me, "deindex_problem_argument_link", "DEINDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(me, "add_problem_dependent_link", "ADD-PROBLEM-DEPENDENT-LINK", 2, 0, false);
        declareFunction(me, "remove_problem_dependent_link", "REMOVE-PROBLEM-DEPENDENT-LINK", 2, 0, false);
        declareFunction(me, "add_problem_tactic", "ADD-PROBLEM-TACTIC", 2, 0, false);
        declareFunction(me, "remove_problem_tactic", "REMOVE-PROBLEM-TACTIC", 2, 0, false);
        declareFunction(me, "add_problem_proof", "ADD-PROBLEM-PROOF", 2, 0, false);
        declareFunction(me, "remove_problem_proof", "REMOVE-PROBLEM-PROOF", 2, 0, false);
        declareFunction(me, "remove_problem_proof_with_bindings", "REMOVE-PROBLEM-PROOF-WITH-BINDINGS", 3, 0, false);
        declareFunction(me, "set_problem_min_depth", "SET-PROBLEM-MIN-DEPTH", 2, 0, false);
        declareFunction(me, "set_problem_min_proof_depth", "SET-PROBLEM-MIN-PROOF-DEPTH", 3, 0, false);
        declareFunction(me, "set_problem_min_transformation_depth", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH", 3, 0, false);
        declareFunction(me, "set_problem_min_transformation_depth_signature", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction(me, "set_root_problem_min_transformation_depth_signature", "SET-ROOT-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
        declareFunction(me, "note_problem_indestructible", "NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        declareFunction(me, "note_problem_destructible", "NOTE-PROBLEM-DESTRUCTIBLE", 1, 0, false);
        declareFunction(me, "note_problem_min_transformation_depth_signature", "NOTE-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction(me, "problem_tactical_provability_status", "PROBLEM-TACTICAL-PROVABILITY-STATUS", 1, 0, false);
        declareFunction(me, "tactically_good_problem_p", "TACTICALLY-GOOD-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_no_good_problem_p", "TACTICALLY-NO-GOOD-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_neutral_problem_p", "TACTICALLY-NEUTRAL-PROBLEM-P", 1, 0, false);
        declareFunction(me, "problem_tactical_status", "PROBLEM-TACTICAL-STATUS", 1, 0, false);
        declareFunction(me, "tactically_new_problem_p", "TACTICALLY-NEW-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_unexamined_problem_p", "TACTICALLY-UNEXAMINED-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_examined_problem_p", "TACTICALLY-EXAMINED-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_possible_problem_p", "TACTICALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_pending_problem_p", "TACTICALLY-PENDING-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_finished_problem_p", "TACTICALLY-FINISHED-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactical_problem_p", "TACTICAL-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_potentially_possible_problem_p", "TACTICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "tactically_not_potentially_possible_problem_p", "TACTICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        declareFunction(me, "problem_store_all_modules", "PROBLEM-STORE-ALL-MODULES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_file() {
        defconstant("*DTP-PROBLEM*", PROBLEM);
        deflexical("*EMPTY-CLAUSES*", SubLTrampolineFile.maybeDefault($empty_clauses$, $empty_clauses$, () -> list(clauses.empty_clause())));
        deflexical("*GENERALIZED-TACTIC-TYPES*", $list99);
        defvar("*TRANSFORMATION-DEPTH-COMPUTATION*", $COUNTERINTUITIVE);
        defparameter("*PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE-ENABLED?*", T);
        deflexical("*MAX-PROBLEM-TACTICS*", $int$10000);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), symbol_function(PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(PROB_SUID, _CSETF_PROB_SUID);
        def_csetf(PROB_STORE, _CSETF_PROB_STORE);
        def_csetf(PROB_QUERY, _CSETF_PROB_QUERY);
        def_csetf(PROB_FREE_HL_VARS, _CSETF_PROB_FREE_HL_VARS);
        def_csetf(PROB_STATUS, _CSETF_PROB_STATUS);
        def_csetf(PROB_DEPENDENT_LINKS, _CSETF_PROB_DEPENDENT_LINKS);
        def_csetf(PROB_ARGUMENT_LINKS, _CSETF_PROB_ARGUMENT_LINKS);
        def_csetf(PROB_TACTICS, _CSETF_PROB_TACTICS);
        def_csetf(PROB_PROOF_BINDINGS_INDEX, _CSETF_PROB_PROOF_BINDINGS_INDEX);
        def_csetf(PROB_ARGUMENT_LINK_BINDINGS_INDEX, _CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX);
        def_csetf(PROB_BACKCHAIN_REQUIRED, _CSETF_PROB_BACKCHAIN_REQUIRED);
        def_csetf(PROB_MEMOIZATION_STATE, _CSETF_PROB_MEMOIZATION_STATE);
        identity(PROBLEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), symbol_function(SXHASH_PROBLEM_METHOD));
        declare_defglobal($empty_clauses$);
        register_macro_helper(PROBLEM_MEMOIZATION_STATE, WITH_PROBLEM_MEMOIZATION_STATE);
        register_macro_helper(PROBLEM_TACTICS, DO_PROBLEM_TACTICS);
        register_macro_helper(DO_PROBLEM_TACTICS_STATUS_MATCH, DO_PROBLEM_TACTICS);
        register_macro_helper(DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, DO_PROBLEM_TACTICS);
        register_macro_helper(DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, DO_PROBLEM_TACTICS);
        register_macro_helper(DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, DO_PROBLEM_TACTICS);
        register_macro_helper(DO_PROBLEM_TACTICS_HL_MODULE_MATCH, DO_PROBLEM_TACTICS);
        register_macro_helper(DO_PROBLEM_TACTICS_TYPE_MATCH, DO_PROBLEM_TACTICS);
        register_macro_helper(PROBLEM_ARGUMENT_LINKS, DO_PROBLEM_ARGUMENT_LINKS);
        register_macro_helper(PROBLEM_DEPENDENT_LINKS, DO_PROBLEM_DEPENDENT_LINKS);
        register_macro_helper(PROBLEM_PROOF_BINDINGS_INDEX, DO_PROBLEM_PROOFS);
        register_macro_helper($sym150$PROOF_HAS_STATUS_, DO_PROBLEM_PROOFS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_problem_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_problem_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_problem_file();
    }

    static {





































































































































































































































    }

    public static final class $problem_native extends SubLStructNative {
        public SubLObject $suid;

        public SubLObject $store;

        public SubLObject $query;

        public SubLObject $free_hl_vars;

        public SubLObject $status;

        public SubLObject $dependent_links;

        public SubLObject $argument_links;

        public SubLObject $tactics;

        public SubLObject $proof_bindings_index;

        public SubLObject $argument_link_bindings_index;

        public SubLObject $backchain_required;

        public SubLObject $memoization_state;

        private static final SubLStructDeclNative structDecl;

        public $problem_native() {
            this.$suid = Lisp.NIL;
            this.$store = Lisp.NIL;
            this.$query = Lisp.NIL;
            this.$free_hl_vars = Lisp.NIL;
            this.$status = Lisp.NIL;
            this.$dependent_links = Lisp.NIL;
            this.$argument_links = Lisp.NIL;
            this.$tactics = Lisp.NIL;
            this.$proof_bindings_index = Lisp.NIL;
            this.$argument_link_bindings_index = Lisp.NIL;
            this.$backchain_required = Lisp.NIL;
            this.$memoization_state = Lisp.NIL;
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
            return this.$store;
        }

        @Override
        public SubLObject getField4() {
            return this.$query;
        }

        @Override
        public SubLObject getField5() {
            return this.$free_hl_vars;
        }

        @Override
        public SubLObject getField6() {
            return this.$status;
        }

        @Override
        public SubLObject getField7() {
            return this.$dependent_links;
        }

        @Override
        public SubLObject getField8() {
            return this.$argument_links;
        }

        @Override
        public SubLObject getField9() {
            return this.$tactics;
        }

        @Override
        public SubLObject getField10() {
            return this.$proof_bindings_index;
        }

        @Override
        public SubLObject getField11() {
            return this.$argument_link_bindings_index;
        }

        @Override
        public SubLObject getField12() {
            return this.$backchain_required;
        }

        @Override
        public SubLObject getField13() {
            return this.$memoization_state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$store = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$query = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$free_hl_vars = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$dependent_links = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$argument_links = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$tactics = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$proof_bindings_index = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$argument_link_bindings_index = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$backchain_required = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$memoization_state = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_problem.$problem_native.class, PROBLEM, PROBLEM_P, $list3, $list4, new String[]{ "$suid", "$store", "$query", "$free_hl_vars", "$status", "$dependent_links", "$argument_links", "$tactics", "$proof_bindings_index", "$argument_link_bindings_index", "$backchain_required", "$memoization_state" }, $list5, $list6, PRINT_PROBLEM);
        }
    }

    public static final class $problem_p$UnaryFunction extends UnaryFunction {
        public $problem_p$UnaryFunction() {
            super(extractFunctionNamed("PROBLEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return problem_p(arg1);
        }
    }

    public static final class $sxhash_problem_method$UnaryFunction extends UnaryFunction {
        public $sxhash_problem_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-PROBLEM-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_problem_method(arg1);
        }
    }
}

/**
 * Total time: 1074 ms synthetic
 */
