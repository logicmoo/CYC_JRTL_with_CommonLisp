package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class rkf_scenario_manipulator extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_scenario_manipulator();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_scenario_manipulator";

    public static final String myFingerPrint = "3b16380b785db21b3a35e50275a64a20fb615d4442a29e8689abd808eba5524d";

    // deflexical
    // Definitions
    /**
     * Lock for controlling modifications to scenario manipulator datastructures.
     */
    private static final SubLSymbol $sm_lock$ = makeSymbol("*SM-LOCK*");





    // defconstant
    public static final SubLSymbol $dtp_sm_scenario$ = makeSymbol("*DTP-SM-SCENARIO*");

    // defconstant
    public static final SubLSymbol $dtp_sm_template$ = makeSymbol("*DTP-SM-TEMPLATE*");

    // defconstant
    public static final SubLSymbol $dtp_sm_indexical_record$ = makeSymbol("*DTP-SM-INDEXICAL-RECORD*");

    // defconstant
    public static final SubLSymbol $dtp_sm_constraint_record$ = makeSymbol("*DTP-SM-CONSTRAINT-RECORD*");

    // defconstant
    public static final SubLSymbol $dtp_sm_merge_info$ = makeSymbol("*DTP-SM-MERGE-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_sm_gen_point$ = makeSymbol("*DTP-SM-GEN-POINT*");

    // deflexical
    private static final SubLSymbol $sm_indexical_numbered_phrases$ = makeSymbol("*SM-INDEXICAL-NUMBERED-PHRASES*");

    // defparameter
    private static final SubLSymbol $sm_semantic_mt$ = makeSymbol("*SM-SEMANTIC-MT*");

    // Internal Constants
    public static final SubLString $$$Scenario_Manipulator_Lock = makeString("Scenario Manipulator Lock");



    public static final SubLList $list2 = list(makeSymbol("*SM-LOCK*"));

    public static final SubLSymbol $sm_isg$ = makeSymbol("*SM-ISG*");

    public static final SubLSymbol $sm_index$ = makeSymbol("*SM-INDEX*");

    public static final SubLSymbol SM_SCENARIO = makeSymbol("SM-SCENARIO");

    public static final SubLSymbol SM_SCENARIO_P = makeSymbol("SM-SCENARIO-P");

    public static final SubLList $list7 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("SESSIONS"), makeSymbol("PHRASE"), makeSymbol("CANDIDATE-TERMS"), makeSymbol("CANDIDATE-CONSTRAINTS"), makeSymbol("FORT"), makeSymbol("TERMS"), makeSymbol("CONSTRAINTS"), makeSymbol("TEMPLATES"), makeSymbol("STATE") });

    public static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("SESSIONS"), makeKeyword("PHRASE"), makeKeyword("CANDIDATE-TERMS"), makeKeyword("CANDIDATE-CONSTRAINTS"), makeKeyword("FORT"), makeKeyword("TERMS"), makeKeyword("CONSTRAINTS"), makeKeyword("TEMPLATES"), makeKeyword("STATE") });

    public static final SubLList $list9 = list(new SubLObject[]{ makeSymbol("SM-SCENARIO-ID"), makeSymbol("SM-SCENARIO-SESSIONS"), makeSymbol("SM-SCENARIO-PHRASE"), makeSymbol("SM-SCENARIO-CANDIDATE-TERMS"), makeSymbol("SM-SCENARIO-CANDIDATE-CONSTRAINTS"), makeSymbol("SM-SCENARIO-FORT"), makeSymbol("SM-SCENARIO-TERMS"), makeSymbol("SM-SCENARIO-CONSTRAINTS"), makeSymbol("SM-SCENARIO-TEMPLATES"), makeSymbol("SM-SCENARIO-STATE") });

    public static final SubLList $list10 = list(new SubLObject[]{ makeSymbol("_CSETF-SM-SCENARIO-ID"), makeSymbol("_CSETF-SM-SCENARIO-SESSIONS"), makeSymbol("_CSETF-SM-SCENARIO-PHRASE"), makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-TERMS"), makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS"), makeSymbol("_CSETF-SM-SCENARIO-FORT"), makeSymbol("_CSETF-SM-SCENARIO-TERMS"), makeSymbol("_CSETF-SM-SCENARIO-CONSTRAINTS"), makeSymbol("_CSETF-SM-SCENARIO-TEMPLATES"), makeSymbol("_CSETF-SM-SCENARIO-STATE") });



    public static final SubLSymbol SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SM-SCENARIO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list13 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SM-SCENARIO-P"));

    private static final SubLSymbol SM_SCENARIO_ID = makeSymbol("SM-SCENARIO-ID");

    private static final SubLSymbol _CSETF_SM_SCENARIO_ID = makeSymbol("_CSETF-SM-SCENARIO-ID");

    private static final SubLSymbol SM_SCENARIO_SESSIONS = makeSymbol("SM-SCENARIO-SESSIONS");

    private static final SubLSymbol _CSETF_SM_SCENARIO_SESSIONS = makeSymbol("_CSETF-SM-SCENARIO-SESSIONS");

    private static final SubLSymbol SM_SCENARIO_PHRASE = makeSymbol("SM-SCENARIO-PHRASE");

    private static final SubLSymbol _CSETF_SM_SCENARIO_PHRASE = makeSymbol("_CSETF-SM-SCENARIO-PHRASE");

    private static final SubLSymbol SM_SCENARIO_CANDIDATE_TERMS = makeSymbol("SM-SCENARIO-CANDIDATE-TERMS");

    private static final SubLSymbol _CSETF_SM_SCENARIO_CANDIDATE_TERMS = makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-TERMS");

    private static final SubLSymbol SM_SCENARIO_CANDIDATE_CONSTRAINTS = makeSymbol("SM-SCENARIO-CANDIDATE-CONSTRAINTS");

    private static final SubLSymbol _CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS = makeSymbol("_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS");

    private static final SubLSymbol SM_SCENARIO_FORT = makeSymbol("SM-SCENARIO-FORT");

    private static final SubLSymbol _CSETF_SM_SCENARIO_FORT = makeSymbol("_CSETF-SM-SCENARIO-FORT");

    private static final SubLSymbol SM_SCENARIO_TERMS = makeSymbol("SM-SCENARIO-TERMS");

    private static final SubLSymbol _CSETF_SM_SCENARIO_TERMS = makeSymbol("_CSETF-SM-SCENARIO-TERMS");

    private static final SubLSymbol SM_SCENARIO_CONSTRAINTS = makeSymbol("SM-SCENARIO-CONSTRAINTS");

    private static final SubLSymbol _CSETF_SM_SCENARIO_CONSTRAINTS = makeSymbol("_CSETF-SM-SCENARIO-CONSTRAINTS");

    private static final SubLSymbol SM_SCENARIO_TEMPLATES = makeSymbol("SM-SCENARIO-TEMPLATES");

    private static final SubLSymbol _CSETF_SM_SCENARIO_TEMPLATES = makeSymbol("_CSETF-SM-SCENARIO-TEMPLATES");

    private static final SubLSymbol SM_SCENARIO_STATE = makeSymbol("SM-SCENARIO-STATE");

    private static final SubLSymbol _CSETF_SM_SCENARIO_STATE = makeSymbol("_CSETF-SM-SCENARIO-STATE");





















    private static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SM_SCENARIO = makeSymbol("MAKE-SM-SCENARIO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-SCENARIO-METHOD");





    private static final SubLSymbol SM_INDEXICAL_RECORD_P = makeSymbol("SM-INDEXICAL-RECORD-P");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_P = makeSymbol("SM-CONSTRAINT-RECORD-P");

    private static final SubLSymbol SM_TEMPLATE_P = makeSymbol("SM-TEMPLATE-P");







    public static final SubLList $list58 = list(list(makeSymbol("SCENARIO")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym59$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");



    private static final SubLSymbol SM_SCENARIO_MEMOIZATION_STATE = makeSymbol("SM-SCENARIO-MEMOIZATION-STATE");



    private static final SubLSymbol SM_TEMPLATE = makeSymbol("SM-TEMPLATE");

    private static final SubLList $list64 = list(makeSymbol("ID"), makeSymbol("SCENARIO"), makeSymbol("PHRASE"), makeSymbol("EXPRESSION"), makeSymbol("PARAM-SUBS"), makeSymbol("PARAMETERS"), makeSymbol("CONSTRAINTS"), makeSymbol("STATE"));

    private static final SubLList $list65 = list(makeKeyword("ID"), makeKeyword("SCENARIO"), makeKeyword("PHRASE"), makeKeyword("EXPRESSION"), makeKeyword("PARAM-SUBS"), makeKeyword("PARAMETERS"), makeKeyword("CONSTRAINTS"), makeKeyword("STATE"));

    private static final SubLList $list66 = list(makeSymbol("SM-TEMPLATE-ID"), makeSymbol("SM-TEMPLATE-SCENARIO"), makeSymbol("SM-TEMPLATE-PHRASE"), makeSymbol("SM-TEMPLATE-EXPRESSION"), makeSymbol("SM-TEMPLATE-PARAM-SUBS"), makeSymbol("SM-TEMPLATE-PARAMETERS"), makeSymbol("SM-TEMPLATE-CONSTRAINTS"), makeSymbol("SM-TEMPLATE-STATE"));

    private static final SubLList $list67 = list(makeSymbol("_CSETF-SM-TEMPLATE-ID"), makeSymbol("_CSETF-SM-TEMPLATE-SCENARIO"), makeSymbol("_CSETF-SM-TEMPLATE-PHRASE"), makeSymbol("_CSETF-SM-TEMPLATE-EXPRESSION"), makeSymbol("_CSETF-SM-TEMPLATE-PARAM-SUBS"), makeSymbol("_CSETF-SM-TEMPLATE-PARAMETERS"), makeSymbol("_CSETF-SM-TEMPLATE-CONSTRAINTS"), makeSymbol("_CSETF-SM-TEMPLATE-STATE"));

    private static final SubLSymbol SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SM-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list69 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SM-TEMPLATE-P"));

    private static final SubLSymbol SM_TEMPLATE_ID = makeSymbol("SM-TEMPLATE-ID");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_ID = makeSymbol("_CSETF-SM-TEMPLATE-ID");

    private static final SubLSymbol SM_TEMPLATE_SCENARIO = makeSymbol("SM-TEMPLATE-SCENARIO");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_SCENARIO = makeSymbol("_CSETF-SM-TEMPLATE-SCENARIO");

    private static final SubLSymbol SM_TEMPLATE_PHRASE = makeSymbol("SM-TEMPLATE-PHRASE");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_PHRASE = makeSymbol("_CSETF-SM-TEMPLATE-PHRASE");

    private static final SubLSymbol SM_TEMPLATE_EXPRESSION = makeSymbol("SM-TEMPLATE-EXPRESSION");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_EXPRESSION = makeSymbol("_CSETF-SM-TEMPLATE-EXPRESSION");

    private static final SubLSymbol SM_TEMPLATE_PARAM_SUBS = makeSymbol("SM-TEMPLATE-PARAM-SUBS");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_PARAM_SUBS = makeSymbol("_CSETF-SM-TEMPLATE-PARAM-SUBS");

    private static final SubLSymbol SM_TEMPLATE_PARAMETERS = makeSymbol("SM-TEMPLATE-PARAMETERS");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_PARAMETERS = makeSymbol("_CSETF-SM-TEMPLATE-PARAMETERS");

    private static final SubLSymbol SM_TEMPLATE_CONSTRAINTS = makeSymbol("SM-TEMPLATE-CONSTRAINTS");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_CONSTRAINTS = makeSymbol("_CSETF-SM-TEMPLATE-CONSTRAINTS");

    private static final SubLSymbol SM_TEMPLATE_STATE = makeSymbol("SM-TEMPLATE-STATE");

    private static final SubLSymbol _CSETF_SM_TEMPLATE_STATE = makeSymbol("_CSETF-SM-TEMPLATE-STATE");









    private static final SubLSymbol MAKE_SM_TEMPLATE = makeSymbol("MAKE-SM-TEMPLATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-TEMPLATE-METHOD");



    private static final SubLObject $$ScenarioInstanceFn = reader_make_constant_shell(makeString("ScenarioInstanceFn"));

    private static final SubLSymbol $sym94$NAUT_ = makeSymbol("NAUT?");

    private static final SubLSymbol SM_SCENARIO_EXPRESSION_P = makeSymbol("SM-SCENARIO-EXPRESSION-P");

    private static final SubLSymbol SM_INDEXICAL_RECORD = makeSymbol("SM-INDEXICAL-RECORD");

    private static final SubLList $list97 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("INDEXICAL"), makeSymbol("PHRASES"), makeSymbol("VAR"), makeSymbol("EXPLICIT-ISAS"), makeSymbol("EXPLICIT-GENLS"), makeSymbol("ISAS"), makeSymbol("GENLS"), makeSymbol("STATE") });

    private static final SubLList $list98 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("INDEXICAL"), makeKeyword("PHRASES"), makeKeyword("VAR"), makeKeyword("EXPLICIT-ISAS"), makeKeyword("EXPLICIT-GENLS"), makeKeyword("ISAS"), makeKeyword("GENLS"), makeKeyword("STATE") });

    private static final SubLList $list99 = list(new SubLObject[]{ makeSymbol("SM-INDEXICAL-RECORD-ID"), makeSymbol("SM-INDEXICAL-RECORD-INDEXICAL"), makeSymbol("SM-INDEXICAL-RECORD-PHRASES"), makeSymbol("SM-INDEXICAL-RECORD-VAR"), makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-ISAS"), makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-GENLS"), makeSymbol("SM-INDEXICAL-RECORD-ISAS"), makeSymbol("SM-INDEXICAL-RECORD-GENLS"), makeSymbol("SM-INDEXICAL-RECORD-STATE") });

    private static final SubLList $list100 = list(new SubLObject[]{ makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ID"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-INDEXICAL"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-PHRASES"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-VAR"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ISAS"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-GENLS"), makeSymbol("_CSETF-SM-INDEXICAL-RECORD-STATE") });

    private static final SubLSymbol SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SM-INDEXICAL-RECORD-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list102 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SM-INDEXICAL-RECORD-P"));

    private static final SubLSymbol SM_INDEXICAL_RECORD_ID = makeSymbol("SM-INDEXICAL-RECORD-ID");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_ID = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ID");

    private static final SubLSymbol SM_INDEXICAL_RECORD_INDEXICAL = makeSymbol("SM-INDEXICAL-RECORD-INDEXICAL");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_INDEXICAL = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-INDEXICAL");

    private static final SubLSymbol SM_INDEXICAL_RECORD_PHRASES = makeSymbol("SM-INDEXICAL-RECORD-PHRASES");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_PHRASES = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-PHRASES");

    private static final SubLSymbol SM_INDEXICAL_RECORD_VAR = makeSymbol("SM-INDEXICAL-RECORD-VAR");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_VAR = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-VAR");

    private static final SubLSymbol SM_INDEXICAL_RECORD_EXPLICIT_ISAS = makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-ISAS");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS");

    private static final SubLSymbol SM_INDEXICAL_RECORD_EXPLICIT_GENLS = makeSymbol("SM-INDEXICAL-RECORD-EXPLICIT-GENLS");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS");

    private static final SubLSymbol SM_INDEXICAL_RECORD_ISAS = makeSymbol("SM-INDEXICAL-RECORD-ISAS");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_ISAS = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-ISAS");

    private static final SubLSymbol SM_INDEXICAL_RECORD_GENLS = makeSymbol("SM-INDEXICAL-RECORD-GENLS");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_GENLS = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-GENLS");

    private static final SubLSymbol SM_INDEXICAL_RECORD_STATE = makeSymbol("SM-INDEXICAL-RECORD-STATE");

    private static final SubLSymbol _CSETF_SM_INDEXICAL_RECORD_STATE = makeSymbol("_CSETF-SM-INDEXICAL-RECORD-STATE");















    private static final SubLSymbol MAKE_SM_INDEXICAL_RECORD = makeSymbol("MAKE-SM-INDEXICAL-RECORD");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-INDEXICAL-RECORD-METHOD");

    private static final SubLSymbol SM_INDEXICAL_P = makeSymbol("SM-INDEXICAL-P");

    private static final SubLSymbol $sym131$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLObject $$TheNthFn = reader_make_constant_shell(makeString("TheNthFn"));



    private static final SubLSymbol SM_CONSTRAINT_RECORD = makeSymbol("SM-CONSTRAINT-RECORD");

    private static final SubLList $list135 = list(makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("NL-SENTENCE"));

    private static final SubLList $list136 = list(makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("NL-SENTENCE"));

    private static final SubLList $list137 = list(makeSymbol("SM-CONSTRAINT-RECORD-ID"), makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE"), makeSymbol("SM-CONSTRAINT-RECORD-NL-SENTENCE"));

    private static final SubLList $list138 = list(makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-ID"), makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-SENTENCE"), makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE"));

    private static final SubLSymbol SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SM-CONSTRAINT-RECORD-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list140 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SM-CONSTRAINT-RECORD-P"));

    private static final SubLSymbol SM_CONSTRAINT_RECORD_ID = makeSymbol("SM-CONSTRAINT-RECORD-ID");

    private static final SubLSymbol _CSETF_SM_CONSTRAINT_RECORD_ID = makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-ID");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE");

    private static final SubLSymbol _CSETF_SM_CONSTRAINT_RECORD_SENTENCE = makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-SENTENCE");

    private static final SubLSymbol SM_CONSTRAINT_RECORD_NL_SENTENCE = makeSymbol("SM-CONSTRAINT-RECORD-NL-SENTENCE");

    private static final SubLSymbol _CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE = makeSymbol("_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE");





    private static final SubLSymbol MAKE_SM_CONSTRAINT_RECORD = makeSymbol("MAKE-SM-CONSTRAINT-RECORD");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-CONSTRAINT-RECORD-METHOD");



    private static final SubLSymbol SM_MERGE_INFO = makeSymbol("SM-MERGE-INFO");

    private static final SubLSymbol SM_MERGE_INFO_P = makeSymbol("SM-MERGE-INFO-P");

    private static final SubLList $list154 = list(makeSymbol("ID"), makeSymbol("FROM-SCENARIO"), makeSymbol("TO-SCENARIO"), makeSymbol("ALIGN-TO"), makeSymbol("ALIGN-FROM"), makeSymbol("INDEXICAL-EQUIVALENCES"));

    private static final SubLList $list155 = list(makeKeyword("ID"), makeKeyword("FROM-SCENARIO"), makeKeyword("TO-SCENARIO"), makeKeyword("ALIGN-TO"), makeKeyword("ALIGN-FROM"), makeKeyword("INDEXICAL-EQUIVALENCES"));

    private static final SubLList $list156 = list(makeSymbol("SM-MERGE-INFO-ID"), makeSymbol("SM-MERGE-INFO-FROM-SCENARIO"), makeSymbol("SM-MERGE-INFO-TO-SCENARIO"), makeSymbol("SM-MERGE-INFO-ALIGN-TO"), makeSymbol("SM-MERGE-INFO-ALIGN-FROM"), makeSymbol("SM-MERGE-INFO-INDEXICAL-EQUIVALENCES"));

    private static final SubLList $list157 = list(makeSymbol("_CSETF-SM-MERGE-INFO-ID"), makeSymbol("_CSETF-SM-MERGE-INFO-FROM-SCENARIO"), makeSymbol("_CSETF-SM-MERGE-INFO-TO-SCENARIO"), makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-TO"), makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-FROM"), makeSymbol("_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES"));

    private static final SubLSymbol SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SM-MERGE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list159 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SM-MERGE-INFO-P"));

    private static final SubLSymbol SM_MERGE_INFO_ID = makeSymbol("SM-MERGE-INFO-ID");

    private static final SubLSymbol _CSETF_SM_MERGE_INFO_ID = makeSymbol("_CSETF-SM-MERGE-INFO-ID");

    private static final SubLSymbol SM_MERGE_INFO_FROM_SCENARIO = makeSymbol("SM-MERGE-INFO-FROM-SCENARIO");

    private static final SubLSymbol _CSETF_SM_MERGE_INFO_FROM_SCENARIO = makeSymbol("_CSETF-SM-MERGE-INFO-FROM-SCENARIO");

    private static final SubLSymbol SM_MERGE_INFO_TO_SCENARIO = makeSymbol("SM-MERGE-INFO-TO-SCENARIO");

    private static final SubLSymbol _CSETF_SM_MERGE_INFO_TO_SCENARIO = makeSymbol("_CSETF-SM-MERGE-INFO-TO-SCENARIO");

    private static final SubLSymbol SM_MERGE_INFO_ALIGN_TO = makeSymbol("SM-MERGE-INFO-ALIGN-TO");

    private static final SubLSymbol _CSETF_SM_MERGE_INFO_ALIGN_TO = makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-TO");

    private static final SubLSymbol SM_MERGE_INFO_ALIGN_FROM = makeSymbol("SM-MERGE-INFO-ALIGN-FROM");

    private static final SubLSymbol _CSETF_SM_MERGE_INFO_ALIGN_FROM = makeSymbol("_CSETF-SM-MERGE-INFO-ALIGN-FROM");

    private static final SubLSymbol SM_MERGE_INFO_INDEXICAL_EQUIVALENCES = makeSymbol("SM-MERGE-INFO-INDEXICAL-EQUIVALENCES");

    private static final SubLSymbol _CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES = makeSymbol("_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES");











    private static final SubLSymbol MAKE_SM_MERGE_INFO = makeSymbol("MAKE-SM-MERGE-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-MERGE-INFO-METHOD");

    private static final SubLSymbol SM_GEN_POINT = makeSymbol("SM-GEN-POINT");

    private static final SubLSymbol SM_GEN_POINT_P = makeSymbol("SM-GEN-POINT-P");

    private static final SubLList $list181 = list(makeSymbol("ID"), makeSymbol("NON-INDEXICAL"), makeSymbol("ISAS"), makeSymbol("GENLS"), makeSymbol("POSITIONS"), makeSymbol("INDEXICAL-RECORD"), makeSymbol("KEYWORD"));

    private static final SubLList $list182 = list(makeKeyword("ID"), makeKeyword("NON-INDEXICAL"), makeKeyword("ISAS"), makeKeyword("GENLS"), makeKeyword("POSITIONS"), makeKeyword("INDEXICAL-RECORD"), makeKeyword("KEYWORD"));

    private static final SubLList $list183 = list(makeSymbol("SM-GEN-POINT-ID"), makeSymbol("SM-GEN-POINT-NON-INDEXICAL"), makeSymbol("SM-GEN-POINT-ISAS"), makeSymbol("SM-GEN-POINT-GENLS"), makeSymbol("SM-GEN-POINT-POSITIONS"), makeSymbol("SM-GEN-POINT-INDEXICAL-RECORD"), makeSymbol("SM-GEN-POINT-KEYWORD"));

    private static final SubLList $list184 = list(makeSymbol("_CSETF-SM-GEN-POINT-ID"), makeSymbol("_CSETF-SM-GEN-POINT-NON-INDEXICAL"), makeSymbol("_CSETF-SM-GEN-POINT-ISAS"), makeSymbol("_CSETF-SM-GEN-POINT-GENLS"), makeSymbol("_CSETF-SM-GEN-POINT-POSITIONS"), makeSymbol("_CSETF-SM-GEN-POINT-INDEXICAL-RECORD"), makeSymbol("_CSETF-SM-GEN-POINT-KEYWORD"));

    private static final SubLSymbol SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SM-GEN-POINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list186 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SM-GEN-POINT-P"));

    private static final SubLSymbol SM_GEN_POINT_ID = makeSymbol("SM-GEN-POINT-ID");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_ID = makeSymbol("_CSETF-SM-GEN-POINT-ID");

    private static final SubLSymbol SM_GEN_POINT_NON_INDEXICAL = makeSymbol("SM-GEN-POINT-NON-INDEXICAL");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_NON_INDEXICAL = makeSymbol("_CSETF-SM-GEN-POINT-NON-INDEXICAL");

    private static final SubLSymbol SM_GEN_POINT_ISAS = makeSymbol("SM-GEN-POINT-ISAS");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_ISAS = makeSymbol("_CSETF-SM-GEN-POINT-ISAS");

    private static final SubLSymbol SM_GEN_POINT_GENLS = makeSymbol("SM-GEN-POINT-GENLS");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_GENLS = makeSymbol("_CSETF-SM-GEN-POINT-GENLS");

    private static final SubLSymbol SM_GEN_POINT_POSITIONS = makeSymbol("SM-GEN-POINT-POSITIONS");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_POSITIONS = makeSymbol("_CSETF-SM-GEN-POINT-POSITIONS");

    private static final SubLSymbol SM_GEN_POINT_INDEXICAL_RECORD = makeSymbol("SM-GEN-POINT-INDEXICAL-RECORD");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_INDEXICAL_RECORD = makeSymbol("_CSETF-SM-GEN-POINT-INDEXICAL-RECORD");

    private static final SubLSymbol SM_GEN_POINT_KEYWORD = makeSymbol("SM-GEN-POINT-KEYWORD");

    private static final SubLSymbol _CSETF_SM_GEN_POINT_KEYWORD = makeSymbol("_CSETF-SM-GEN-POINT-KEYWORD");









    private static final SubLSymbol MAKE_SM_GEN_POINT = makeSymbol("MAKE-SM-GEN-POINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SM-GEN-POINT-METHOD");

    private static final SubLString $str207$_SC = makeString(":SC");

    private static final SubLString $$$the_kind_of_ = makeString("the kind of ");

    private static final SubLObject $$The = reader_make_constant_shell(makeString("The"));

    private static final SubLSymbol $sym210$_ = makeSymbol("<");





    private static final SubLList $list213 = list(makeString("first"), makeString("second"), makeString("third"), makeString("fourth"), makeString("fifth"), makeString("sixth"), makeString("seventh"));

    private static final SubLList $list214 = list(makeSymbol("FIRST-RECORD"), makeSymbol("SECOND-RECORD"));

    private static final SubLString $$$the_ = makeString("the ");

    private static final SubLString $$$the_other_ = makeString("the other ");

    private static final SubLString $$$the_other_kind_of_ = makeString("the other kind of ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$_kind_of_ = makeString(" kind of ");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol SM_INDEXICAL_RECORD_NUMBER = makeSymbol("SM-INDEXICAL-RECORD-NUMBER");



    private static final SubLObject $$scenarioTerms = reader_make_constant_shell(makeString("scenarioTerms"));

    private static final SubLObject $$scenarioReferent = reader_make_constant_shell(makeString("scenarioReferent"));

    private static final SubLObject $$scenarioConstraint = reader_make_constant_shell(makeString("scenarioConstraint"));



    private static final SubLSymbol SM_SCENARIO_EXPRESSION_OK = makeSymbol("SM-SCENARIO-EXPRESSION-OK");





    private static final SubLObject $$termTemplate = reader_make_constant_shell(makeString("termTemplate"));

    private static final SubLObject $$ScenarioTemplate = reader_make_constant_shell(makeString("ScenarioTemplate"));

    private static final SubLSymbol $sym232$_EXPR = makeSymbol("?EXPR");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str238$Cycl_formulas_containing__A_canno = makeString("Cycl formulas containing ~A cannot be used to initialize a scenario.");

    private static final SubLString $str239$_A_unexpected_ = makeString("~A unexpected.");

    private static final SubLSymbol $sym240$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol $sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_ = makeSymbol("UIA-IS-TERM-A-COLLECTION-IN-ANY-MT?");



    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLSymbol SM_INDEXICAL_RECORD_PREFERRED_PHRASE = makeSymbol("SM-INDEXICAL-RECORD-PREFERRED-PHRASE");

    private static final SubLSymbol SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED = makeSymbol("SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED");

    private static final SubLSymbol SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED = makeSymbol("SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED");





    private static final SubLSymbol SM_UNRESOLVED_ITEM_FOR_PHRASE = makeSymbol("SM-UNRESOLVED-ITEM-FOR-PHRASE");

    private static final SubLSymbol SM_UNRESOLVED_EQUAL = makeSymbol("SM-UNRESOLVED-EQUAL");

    private static final SubLObject $$TheResultOfParsing = reader_make_constant_shell(makeString("TheResultOfParsing"));

    private static final SubLList $list253 = list(makeSymbol("TOKEN-NUMBERS"), makeSymbol("PARSES"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list255 = list(makeSymbol("COL-ONE"), makeSymbol("COL-OTHER"));

    private static final SubLSymbol SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED = makeSymbol("SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED");





    public static final SubLList $list259 = list(makeSymbol("NEW-INDEXICAL-RECORD"), makeSymbol("OLD-INDEXICAL-RECORD"));

    private static final SubLSymbol SM_GEN_POINT_WITHOUT_POSITIONS_P = makeSymbol("SM-GEN-POINT-WITHOUT-POSITIONS-P");

    private static final SubLSymbol PUNCTUATION_P = makeSymbol("PUNCTUATION-P");

    private static final SubLObject $$OptionalSome = reader_make_constant_shell(makeString("OptionalSome"));

    private static final SubLObject $$StringTemplate = reader_make_constant_shell(makeString("StringTemplate"));

    private static final SubLObject $$NumberTemplate = reader_make_constant_shell(makeString("NumberTemplate"));

    private static final SubLObject $$SinkTemplate = reader_make_constant_shell(makeString("SinkTemplate"));



    private static final SubLObject $$PropositionalConceptualWork = reader_make_constant_shell(makeString("PropositionalConceptualWork"));

    private static final SubLObject $$MovieTitleTemplate = reader_make_constant_shell(makeString("MovieTitleTemplate"));

    private static final SubLObject $$Event = reader_make_constant_shell(makeString("Event"));

    private static final SubLObject $$NPTemplate = reader_make_constant_shell(makeString("NPTemplate"));

    private static final SubLObject $$SomethingExisting = reader_make_constant_shell(makeString("SomethingExisting"));

    private static final SubLObject $$RequireOne = reader_make_constant_shell(makeString("RequireOne"));

    private static final SubLObject $$OptionalOne = reader_make_constant_shell(makeString("OptionalOne"));

    private static final SubLObject $$ParsingTemplateCategory = reader_make_constant_shell(makeString("ParsingTemplateCategory"));

    private static final SubLObject $$TemplateParsingMt = reader_make_constant_shell(makeString("TemplateParsingMt"));

    private static final SubLString $str276$_ = makeString("[");

    private static final SubLString $str277$_ = makeString("]");

    private static final SubLString $$$Scenario = makeString("Scenario");

    private static final SubLList $list279 = list(reader_make_constant_shell(makeString("Scenario-Generalized")));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLList $list281 = list(reader_make_constant_shell(makeString("RKFConstant")));



    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    private static final SubLList $list284 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("SCENARIO"), reader_make_constant_shell(makeString("Scenario-Generalized")));

    private static final SubLList $list285 = list(reader_make_constant_shell(makeString("termTemplate")), reader_make_constant_shell(makeString("ScenarioTemplate")), makeSymbol("?EXPR"), makeSymbol("?INSTANCE"));



    private static final SubLSymbol SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED = makeSymbol("SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED");

    private static final SubLSymbol SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED = makeSymbol("SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED");

    private static final SubLSymbol SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED = makeSymbol("SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED");

    private static final SubLSymbol SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED = makeSymbol("SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED");

    public static SubLObject with_sm_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    public static SubLObject sm_find_scenario_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }

    public static SubLObject sm_find_scenario_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_scenario = sm_find_scenario_by_id(id);
        return v_scenario;
    }

    public static SubLObject sm_find_template_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }

    public static SubLObject sm_find_template_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject template = sm_find_template_by_id(id);
        return template;
    }

    public static SubLObject sm_find_indexical_record_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }

    public static SubLObject sm_find_indexical_record_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject indexical_record = sm_find_indexical_record_by_id(id);
        return indexical_record;
    }

    public static SubLObject sm_find_constraint_record_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }

    public static SubLObject sm_find_constraint_record_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject constraint_record = sm_find_constraint_record_by_id(id);
        return constraint_record;
    }

    public static SubLObject sm_find_merge_info_by_id(final SubLObject id) {
        return sm_find_object_by_id(id);
    }

    public static SubLObject sm_find_merge_info_by_id_string(final SubLObject id_string) {
        final SubLObject id = parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject merge_info = sm_find_merge_info_by_id(id);
        return merge_info;
    }

    public static SubLObject next_sm_id() {
        return integer_sequence_generator.integer_sequence_generator_next($sm_isg$.getGlobalValue());
    }

    public static SubLObject sm_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter($sm_index$.getGlobalValue(), id, v_object);
    }

    public static SubLObject sm_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove($sm_index$.getGlobalValue(), id);
    }

    public static SubLObject sm_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup($sm_index$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject sm_scenario_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sm_scenario_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sm_scenario_native.class ? T : NIL;
    }

    public static SubLObject sm_scenario_id(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sm_scenario_sessions(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sm_scenario_phrase(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sm_scenario_candidate_terms(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sm_scenario_candidate_constraints(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sm_scenario_fort(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sm_scenario_terms(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sm_scenario_constraints(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject sm_scenario_templates(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject sm_scenario_state(final SubLObject v_object) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_sm_scenario_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sm_scenario_sessions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sm_scenario_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sm_scenario_candidate_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sm_scenario_candidate_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sm_scenario_fort(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sm_scenario_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sm_scenario_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sm_scenario_templates(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sm_scenario_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_scenario_p(v_object) : "rkf_scenario_manipulator.sm_scenario_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_sm_scenario(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sm_scenario_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sm_scenario_id(v_new, current_value);
            } else
                if (pcase_var.eql($SESSIONS)) {
                    _csetf_sm_scenario_sessions(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASE)) {
                        _csetf_sm_scenario_phrase(v_new, current_value);
                    } else
                        if (pcase_var.eql($CANDIDATE_TERMS)) {
                            _csetf_sm_scenario_candidate_terms(v_new, current_value);
                        } else
                            if (pcase_var.eql($CANDIDATE_CONSTRAINTS)) {
                                _csetf_sm_scenario_candidate_constraints(v_new, current_value);
                            } else
                                if (pcase_var.eql($FORT)) {
                                    _csetf_sm_scenario_fort(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TERMS)) {
                                        _csetf_sm_scenario_terms(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CONSTRAINTS)) {
                                            _csetf_sm_scenario_constraints(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($TEMPLATES)) {
                                                _csetf_sm_scenario_templates(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($STATE)) {
                                                    _csetf_sm_scenario_state(v_new, current_value);
                                                } else {
                                                    Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sm_scenario(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SM_SCENARIO, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sm_scenario_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SESSIONS, sm_scenario_sessions(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASE, sm_scenario_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATE_TERMS, sm_scenario_candidate_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATE_CONSTRAINTS, sm_scenario_candidate_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $FORT, sm_scenario_fort(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMS, sm_scenario_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, sm_scenario_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATES, sm_scenario_templates(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, sm_scenario_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_SM_SCENARIO, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sm_scenario_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_scenario(obj, visitor_fn);
    }

    public static SubLObject sm_new_scenario(SubLObject phrase, SubLObject fort, SubLObject session) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (fort == UNPROVIDED) {
            fort = NIL;
        }
        if (session == UNPROVIDED) {
            session = NIL;
        }
        final SubLObject v_scenario = make_sm_scenario(UNPROVIDED);
        final SubLObject id = next_sm_id();
        if (NIL != phrase) {
            sm_set_scenario_phrase(v_scenario, phrase);
        }
        if (NIL != fort) {
            sm_set_scenario_fort(v_scenario, fort);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL != session) {
                final SubLObject item_var = session;
                if (NIL == member(item_var, sm_scenario_sessions(v_scenario), symbol_function(EQL), symbol_function(IDENTITY))) {
                    _csetf_sm_scenario_sessions(v_scenario, cons(item_var, sm_scenario_sessions(v_scenario)));
                }
            }
            _csetf_sm_scenario_id(v_scenario, id);
            sm_add_object(id, v_scenario);
            _csetf_sm_scenario_state(v_scenario, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_set_scenario_phrase(final SubLObject v_scenario, final SubLObject phrase) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != stringp(phrase) : "Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) " + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_phrase(v_scenario, phrase);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_set_scenario_fort(final SubLObject v_scenario, final SubLObject fort) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_fort(v_scenario, fort);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_candidate_terms(final SubLObject v_scenario, final SubLObject indexical_records) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_add_scenario_candidate_term(v_scenario, indexical_record);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_candidate_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == find(indexical_record, sm_scenario_candidate_terms(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_sm_scenario_candidate_terms(v_scenario, append(sm_scenario_candidate_terms(v_scenario), list(indexical_record)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_rem_scenario_candidate_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_candidate_terms(v_scenario, remove(indexical_record, sm_scenario_candidate_terms(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sm_cleanup_indexical_record(indexical_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_candidate_constraints(final SubLObject v_scenario, final SubLObject constraint_records) {
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_add_scenario_candidate_constraint(v_scenario, constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_candidate_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == find(constraint_record, sm_scenario_candidate_constraints(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_sm_scenario_candidate_constraints(v_scenario, append(sm_scenario_candidate_constraints(v_scenario), list(constraint_record)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_rem_scenario_candidate_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_candidate_constraints(v_scenario, remove(constraint_record, sm_scenario_candidate_constraints(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sm_cleanup_constraint_record(constraint_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == find(indexical_record, sm_scenario_terms(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_sm_scenario_terms(v_scenario, append(sm_scenario_terms(v_scenario), list(indexical_record)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_rem_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_terms(v_scenario, remove(indexical_record, sm_scenario_terms(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != sm_scenario_borrowed_indexical_p(v_scenario, indexical_record)) {
                sm_scenario_return_borrowed_indexical(v_scenario, indexical_record);
            } else {
                sm_cleanup_indexical_record(indexical_record);
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == find(constraint_record, sm_scenario_constraints(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_sm_scenario_constraints(v_scenario, append(sm_scenario_constraints(v_scenario), list(constraint_record)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_rem_scenario_constraint(final SubLObject v_scenario, final SubLObject constraint_record) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_constraints(v_scenario, remove(constraint_record, sm_scenario_constraints(v_scenario), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sm_cleanup_constraint_record(constraint_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_add_scenario_template(final SubLObject v_scenario, final SubLObject template) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == find(template, sm_scenario_templates(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_sm_scenario_templates(v_scenario, append(sm_scenario_templates(v_scenario), list(template)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_rem_scenario_template(final SubLObject v_scenario, final SubLObject template) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_scenario_templates(v_scenario, remove(template, sm_scenario_templates(v_scenario), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sm_cleanup_template(template);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return v_scenario;
    }

    public static SubLObject sm_cleanup_scenario(final SubLObject v_scenario) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        final SubLObject id = sm_scenario_id(v_scenario);
        final SubLObject candidate_terms = sm_scenario_candidate_terms(v_scenario);
        final SubLObject candidate_constraints = sm_scenario_candidate_constraints(v_scenario);
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        final SubLObject templates = sm_scenario_templates(v_scenario);
        SubLObject cdolist_list_var = candidate_terms;
        SubLObject candidate_term = NIL;
        candidate_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_cleanup_indexical_record(candidate_term);
            cdolist_list_var = cdolist_list_var.rest();
            candidate_term = cdolist_list_var.first();
        } 
        cdolist_list_var = candidate_constraints;
        SubLObject candidate_constraint = NIL;
        candidate_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_cleanup_constraint_record(candidate_constraint);
            cdolist_list_var = cdolist_list_var.rest();
            candidate_constraint = cdolist_list_var.first();
        } 
        cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_cleanup_indexical_record(indexical_record);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_cleanup_constraint_record(constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_cleanup_template(template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return sm_rem_object(id);
    }

    public static SubLObject sm_scenario_note_borrowed_indexical(final SubLObject v_scenario, final SubLObject indexical) {
        final SubLObject state = sm_scenario_state(v_scenario);
        dictionary_utilities.dictionary_push(state, $BORROWED_INDEXICALS, indexical);
        return v_scenario;
    }

    public static SubLObject sm_scenario_borrowed_indexical_p(final SubLObject v_scenario, final SubLObject indexical) {
        final SubLObject state = sm_scenario_state(v_scenario);
        final SubLObject borrowed_indexicals = dictionary.dictionary_lookup(state, $BORROWED_INDEXICALS, UNPROVIDED);
        return subl_promotions.memberP(indexical, borrowed_indexicals, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sm_scenario_return_borrowed_indexical(final SubLObject v_scenario, final SubLObject indexical) {
        final SubLObject state = sm_scenario_state(v_scenario);
        final SubLObject borrowed_indexicals = dictionary.dictionary_lookup(state, $BORROWED_INDEXICALS, UNPROVIDED);
        delete(indexical, borrowed_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        dictionary.dictionary_enter(state, $BORROWED_INDEXICALS, borrowed_indexicals);
        return v_scenario;
    }

    public static SubLObject sm_scenario_memoization_state(final SubLObject v_scenario) {
        final SubLObject state = sm_scenario_state(v_scenario);
        SubLObject v_memoization_state = dictionary.dictionary_lookup(state, $MEMOIZATION_STATE, $UNINITIALIZED);
        if (v_memoization_state == $UNINITIALIZED) {
            v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_enter(state, $MEMOIZATION_STATE, v_memoization_state);
        }
        return v_memoization_state;
    }

    public static SubLObject sm_scenario_clear_all_memoization_state(final SubLObject v_scenario) {
        memoization_state.clear_all_memoization(sm_scenario_memoization_state(v_scenario));
        return v_scenario;
    }

    public static SubLObject with_scenario_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_scenario = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        v_scenario = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_memoization_state = $sym59$MEMOIZATION_STATE;
            return list(CLET, list(list(v_memoization_state, list(SM_SCENARIO_MEMOIZATION_STATE, v_scenario))), listS(WITH_MEMOIZATION_STATE, list(v_memoization_state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static SubLObject sm_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sm_template_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sm_template_native.class ? T : NIL;
    }

    public static SubLObject sm_template_id(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sm_template_scenario(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sm_template_phrase(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sm_template_expression(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sm_template_param_subs(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sm_template_parameters(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sm_template_constraints(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sm_template_state(final SubLObject v_object) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_sm_template_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sm_template_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sm_template_phrase(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sm_template_expression(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sm_template_param_subs(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sm_template_parameters(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sm_template_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sm_template_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_template_p(v_object) : "rkf_scenario_manipulator.sm_template_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_sm_template(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sm_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sm_template_id(v_new, current_value);
            } else
                if (pcase_var.eql($SCENARIO)) {
                    _csetf_sm_template_scenario(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASE)) {
                        _csetf_sm_template_phrase(v_new, current_value);
                    } else
                        if (pcase_var.eql($EXPRESSION)) {
                            _csetf_sm_template_expression(v_new, current_value);
                        } else
                            if (pcase_var.eql($PARAM_SUBS)) {
                                _csetf_sm_template_param_subs(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARAMETERS)) {
                                    _csetf_sm_template_parameters(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CONSTRAINTS)) {
                                        _csetf_sm_template_constraints(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($STATE)) {
                                            _csetf_sm_template_state(v_new, current_value);
                                        } else {
                                            Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sm_template(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SM_TEMPLATE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sm_template_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SCENARIO, sm_template_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASE, sm_template_phrase(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPRESSION, sm_template_expression(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAM_SUBS, sm_template_param_subs(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAMETERS, sm_template_parameters(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, sm_template_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, sm_template_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_SM_TEMPLATE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sm_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_template(obj, visitor_fn);
    }

    public static SubLObject sm_new_template(final SubLObject v_scenario) {
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        final SubLObject template = make_sm_template(UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_template_scenario(template, v_scenario);
            _csetf_sm_template_id(template, id);
            _csetf_sm_template_state(template, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            sm_add_object(id, template);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static SubLObject sm_set_template_expression(final SubLObject template, final SubLObject template_expr) {
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        assert NIL != listp(template_expr) : "Types.listp(template_expr) " + "CommonSymbols.NIL != Types.listp(template_expr) " + template_expr;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_template_expression(template, template_expr);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static SubLObject sm_set_template_param_subs(final SubLObject template, final SubLObject param_subs) {
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        assert NIL != listp(param_subs) : "Types.listp(param_subs) " + "CommonSymbols.NIL != Types.listp(param_subs) " + param_subs;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_template_param_subs(template, param_subs);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static SubLObject sm_set_template_parameters(final SubLObject template, final SubLObject parameters) {
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        assert NIL != listp(parameters) : "Types.listp(parameters) " + "CommonSymbols.NIL != Types.listp(parameters) " + parameters;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_template_parameters(template, parameters);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static SubLObject sm_set_template_phrase(final SubLObject template, final SubLObject phrase) {
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        assert NIL != stringp(phrase) : "Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) " + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_template_phrase(template, phrase);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static SubLObject sm_add_template_constraint(final SubLObject template, final SubLObject constraint_record) {
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_template_constraints(template, cons(constraint_record, sm_template_constraints(template)));
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static SubLObject sm_cleanup_template(final SubLObject template) {
        assert NIL != sm_template_p(template) : "rkf_scenario_manipulator.sm_template_p(template) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_template_p(template) " + template;
        final SubLObject id = sm_template_id(template);
        final SubLObject success = sm_rem_object(id);
        return success;
    }

    public static SubLObject sm_scenario_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != forts.fort_p(v_object.first()))) && (NIL != sm_substitution_list_p(v_object.rest())));
    }

    public static SubLObject sm_new_scenario_spec(final SubLObject fort, final SubLObject substitutions) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return cons(fort, substitutions);
    }

    public static SubLObject sm_scenario_spec_fort(final SubLObject scenario_spec) {
        return scenario_spec.first();
    }

    public static SubLObject sm_scenario_spec_substitutions(final SubLObject scenario_spec) {
        return scenario_spec.rest();
    }

    public static SubLObject sm_substitution_list_p(final SubLObject v_object) {
        if (v_object.isCons() && (NIL != v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sm_substitution_p(elem)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject sm_substitution_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.doubletonP(v_object)) && (NIL != sm_indexical_p(v_object.first()))) && (NIL != sm_term_p(cadr(v_object))));
    }

    public static SubLObject sm_get_standin_for_indexical(final SubLObject substitution_list, final SubLObject indexical) {
        if ((NIL == sm_substitution_list_p(substitution_list)) || (NIL == sm_indexical_p(indexical))) {
            return indexical;
        }
        return second(assoc(indexical, substitution_list, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sm_scenario_expression_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && v_object.first().eql($$ScenarioInstanceFn)) && (NIL != forts.fort_p(second(v_object)))) && (NIL != el_list_p(third(v_object)))) && (NIL != el_list_p(fourth(v_object)))) && (NIL == list_utilities.find_if_not(symbol_function($sym94$NAUT_), el_list_items(fourth(v_object)), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject sm_scenario_expression_fort(final SubLObject scenario_expression) {
        assert NIL != sm_scenario_expression_p(scenario_expression) : "rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression) " + scenario_expression;
        return second(scenario_expression);
    }

    public static SubLObject sm_scenario_expression_cyc_terms(final SubLObject scenario_expression) {
        assert NIL != sm_scenario_expression_p(scenario_expression) : "rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression) " + scenario_expression;
        return el_list_items(third(scenario_expression));
    }

    public static SubLObject sm_scenario_expression_indexical_nauts(final SubLObject scenario_expression) {
        assert NIL != sm_scenario_expression_p(scenario_expression) : "rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_expression_p(scenario_expression) " + scenario_expression;
        return el_list_items(fourth(scenario_expression));
    }

    public static SubLObject sm_indexical_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sm_indexical_record_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sm_indexical_record_native.class ? T : NIL;
    }

    public static SubLObject sm_indexical_record_id(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sm_indexical_record_indexical(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sm_indexical_record_phrases(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sm_indexical_record_var(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sm_indexical_record_explicit_isas(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sm_indexical_record_explicit_genls(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sm_indexical_record_isas(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sm_indexical_record_genls(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject sm_indexical_record_state(final SubLObject v_object) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_sm_indexical_record_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sm_indexical_record_indexical(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sm_indexical_record_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sm_indexical_record_var(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sm_indexical_record_explicit_isas(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sm_indexical_record_explicit_genls(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sm_indexical_record_isas(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sm_indexical_record_genls(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sm_indexical_record_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_indexical_record_p(v_object) : "rkf_scenario_manipulator.sm_indexical_record_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_sm_indexical_record(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sm_indexical_record_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sm_indexical_record_id(v_new, current_value);
            } else
                if (pcase_var.eql($INDEXICAL)) {
                    _csetf_sm_indexical_record_indexical(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASES)) {
                        _csetf_sm_indexical_record_phrases(v_new, current_value);
                    } else
                        if (pcase_var.eql($VAR)) {
                            _csetf_sm_indexical_record_var(v_new, current_value);
                        } else
                            if (pcase_var.eql($EXPLICIT_ISAS)) {
                                _csetf_sm_indexical_record_explicit_isas(v_new, current_value);
                            } else
                                if (pcase_var.eql($EXPLICIT_GENLS)) {
                                    _csetf_sm_indexical_record_explicit_genls(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ISAS)) {
                                        _csetf_sm_indexical_record_isas(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($GENLS)) {
                                            _csetf_sm_indexical_record_genls(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($STATE)) {
                                                _csetf_sm_indexical_record_state(v_new, current_value);
                                            } else {
                                                Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sm_indexical_record(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SM_INDEXICAL_RECORD, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sm_indexical_record_id(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXICAL, sm_indexical_record_indexical(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASES, sm_indexical_record_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR, sm_indexical_record_var(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPLICIT_ISAS, sm_indexical_record_explicit_isas(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPLICIT_GENLS, sm_indexical_record_explicit_genls(obj));
        funcall(visitor_fn, obj, $SLOT, $ISAS, sm_indexical_record_isas(obj));
        funcall(visitor_fn, obj, $SLOT, $GENLS, sm_indexical_record_genls(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, sm_indexical_record_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_SM_INDEXICAL_RECORD, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sm_indexical_record_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_indexical_record(obj, visitor_fn);
    }

    public static SubLObject sm_new_indexical_record(SubLObject indexical, SubLObject phrases, SubLObject isas, SubLObject v_genls) {
        if (indexical == UNPROVIDED) {
            indexical = NIL;
        }
        if (phrases == UNPROVIDED) {
            phrases = NIL;
        }
        if (isas == UNPROVIDED) {
            isas = NIL;
        }
        if (v_genls == UNPROVIDED) {
            v_genls = NIL;
        }
        final SubLObject indexical_record = make_sm_indexical_record(UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_id(indexical_record, id);
            _csetf_sm_indexical_record_state(indexical_record, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            sm_add_object(id, indexical_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        if (NIL != indexical) {
            sm_set_indexical_record_indexical(indexical_record, indexical);
        }
        if (NIL != phrases) {
            sm_set_indexical_record_phrases(indexical_record, phrases);
        }
        if (NIL != isas) {
            sm_update_indexical_record_explicit_isas(indexical_record, isas);
        }
        if (NIL != v_genls) {
            sm_update_indexical_record_explicit_genls(indexical_record, v_genls);
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_indexical(final SubLObject indexical_record, final SubLObject indexical) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != sm_indexical_p(indexical) : "rkf_scenario_manipulator.sm_indexical_p(indexical) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_p(indexical) " + indexical;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_indexical(indexical_record, indexical);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_phrases(final SubLObject indexical_record, final SubLObject phrases) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(phrases) : "Types.listp(phrases) " + "CommonSymbols.NIL != Types.listp(phrases) " + phrases;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_phrases(indexical_record, phrases);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_add_indexical_phrase(final SubLObject indexical_record, final SubLObject phrase) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != stringp(phrase) : "Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) " + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == find(phrase, sm_indexical_record_phrases(indexical_record), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_sm_indexical_record_phrases(indexical_record, append(sm_indexical_record_phrases(indexical_record), list(phrase)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_rem_indexical_phrase(final SubLObject indexical_record, final SubLObject phrase) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != stringp(phrase) : "Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) " + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_phrases(indexical_record, remove(phrase, sm_indexical_record_phrases(indexical_record), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != cycl_variables.el_varP(var) : "cycl_variables.el_varP(var) " + "CommonSymbols.NIL != cycl_variables.el_varP(var) " + var;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_var(indexical_record, var);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_explicit_isas(final SubLObject indexical_record, final SubLObject isas) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(isas) : "Types.listp(isas) " + "CommonSymbols.NIL != Types.listp(isas) " + isas;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_explicit_isas(indexical_record, isas);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_explicit_genls(final SubLObject indexical_record, final SubLObject v_genls) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(v_genls) : "Types.listp(v_genls) " + "CommonSymbols.NIL != Types.listp(v_genls) " + v_genls;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_explicit_genls(indexical_record, v_genls);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_isas(final SubLObject indexical_record, final SubLObject isas) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(isas) : "Types.listp(isas) " + "CommonSymbols.NIL != Types.listp(isas) " + isas;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_isas(indexical_record, isas);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_set_indexical_record_genls(final SubLObject indexical_record, final SubLObject v_genls) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(v_genls) : "Types.listp(v_genls) " + "CommonSymbols.NIL != Types.listp(v_genls) " + v_genls;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_genls(indexical_record, v_genls);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return indexical_record;
    }

    public static SubLObject sm_cleanup_indexical_record(final SubLObject indexical_record) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        final SubLObject id = sm_indexical_record_id(indexical_record);
        final SubLObject success = sm_rem_object(id);
        return success;
    }

    public static SubLObject sm_indexical_record_preferred_phrase(final SubLObject indexical_record) {
        return sm_indexical_record_phrases(indexical_record).first();
    }

    public static SubLObject sm_copy_indexical_record_for_scenario(final SubLObject indexical_record, final SubLObject v_scenario) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        final SubLObject new_indexical_record = sm_new_indexical_record(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_indexical_record_id(new_indexical_record, id);
            _csetf_sm_indexical_record_indexical(new_indexical_record, sm_indexical_record_indexical(indexical_record));
            _csetf_sm_indexical_record_phrases(new_indexical_record, sm_indexical_record_phrases(indexical_record));
            _csetf_sm_indexical_record_explicit_isas(new_indexical_record, sm_indexical_record_explicit_isas(indexical_record));
            _csetf_sm_indexical_record_explicit_genls(new_indexical_record, sm_indexical_record_explicit_genls(indexical_record));
            _csetf_sm_indexical_record_isas(new_indexical_record, sm_indexical_record_isas(indexical_record));
            _csetf_sm_indexical_record_genls(new_indexical_record, sm_indexical_record_genls(indexical_record));
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return new_indexical_record;
    }

    public static SubLObject sm_indexical_record_type(final SubLObject indexical_record) {
        return sm_indexical_type(sm_indexical_record_indexical(indexical_record));
    }

    public static SubLObject sm_indexical_record_number(final SubLObject indexical_record) {
        return sm_indexical_number(sm_indexical_record_indexical(indexical_record));
    }

    public static SubLObject sm_update_indexical_record_explicit_isas(final SubLObject indexical_record, final SubLObject isas) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(isas) : "Types.listp(isas) " + "CommonSymbols.NIL != Types.listp(isas) " + isas;
        SubLObject current_explicit_isas = sm_indexical_record_explicit_isas(indexical_record);
        SubLObject current_isas = sm_indexical_record_isas(indexical_record);
        current_explicit_isas = remove_duplicates(nconc(isas, current_explicit_isas), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        current_isas = remove_duplicates(nconc(isas, current_isas), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sm_set_indexical_record_explicit_isas(indexical_record, current_explicit_isas);
        sm_set_indexical_record_isas(indexical_record, current_isas);
        return indexical_record;
    }

    public static SubLObject sm_update_indexical_record_explicit_genls(final SubLObject indexical_record, final SubLObject v_genls) {
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        assert NIL != listp(v_genls) : "Types.listp(v_genls) " + "CommonSymbols.NIL != Types.listp(v_genls) " + v_genls;
        SubLObject current_explicit_genls = sm_indexical_record_explicit_genls(indexical_record);
        SubLObject current_genls = sm_indexical_record_genls(indexical_record);
        current_explicit_genls = remove_duplicates(nconc(v_genls, current_explicit_genls), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        current_genls = remove_duplicates(nconc(v_genls, current_genls), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sm_set_indexical_record_explicit_genls(indexical_record, current_explicit_genls);
        sm_set_indexical_record_genls(indexical_record, current_genls);
        return indexical_record;
    }

    public static SubLObject sm_indexical_p(final SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$TheNthFn));
    }

    public static SubLObject sm_new_indexical(final SubLObject type, final SubLObject number) {
        assert NIL != forts.fort_p(type) : "forts.fort_p(type) " + "CommonSymbols.NIL != forts.fort_p(type) " + type;
        assert NIL != integerp(number) : "Types.integerp(number) " + "CommonSymbols.NIL != Types.integerp(number) " + number;
        return czer_main.cyc_find_or_create_nart(make_binary_formula($$TheNthFn, type, number), UNPROVIDED);
    }

    public static SubLObject sm_indexical_type(final SubLObject indexical) {
        assert NIL != sm_indexical_p(indexical) : "rkf_scenario_manipulator.sm_indexical_p(indexical) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_p(indexical) " + indexical;
        return cycl_utilities.nat_arg1(indexical, UNPROVIDED);
    }

    public static SubLObject sm_indexical_number(final SubLObject indexical) {
        assert NIL != sm_indexical_p(indexical) : "rkf_scenario_manipulator.sm_indexical_p(indexical) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_p(indexical) " + indexical;
        return cycl_utilities.nat_arg2(indexical, UNPROVIDED);
    }

    public static SubLObject sm_indexical_of_scenarioP(final SubLObject v_term, final SubLObject v_scenario) {
        if (NIL == sm_indexical_p(v_term)) {
            return NIL;
        }
        SubLObject cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (v_term.equal(sm_indexical_record_indexical(indexical_record))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sm_indexical_record_of_indexical(final SubLObject v_term, final SubLObject v_scenario) {
        assert NIL != sm_indexical_p(v_term) : "rkf_scenario_manipulator.sm_indexical_p(v_term) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_p(v_term) " + v_term;
        assert NIL != sm_scenario_p(v_scenario) : "rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) " + v_scenario;
        SubLObject cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (v_term.equal(sm_indexical_record_indexical(indexical_record))) {
                return indexical_record;
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sm_constraint_record_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sm_constraint_record_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sm_constraint_record_native.class ? T : NIL;
    }

    public static SubLObject sm_constraint_record_id(final SubLObject v_object) {
        assert NIL != sm_constraint_record_p(v_object) : "rkf_scenario_manipulator.sm_constraint_record_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sm_constraint_record_sentence(final SubLObject v_object) {
        assert NIL != sm_constraint_record_p(v_object) : "rkf_scenario_manipulator.sm_constraint_record_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sm_constraint_record_nl_sentence(final SubLObject v_object) {
        assert NIL != sm_constraint_record_p(v_object) : "rkf_scenario_manipulator.sm_constraint_record_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sm_constraint_record_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_constraint_record_p(v_object) : "rkf_scenario_manipulator.sm_constraint_record_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sm_constraint_record_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_constraint_record_p(v_object) : "rkf_scenario_manipulator.sm_constraint_record_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sm_constraint_record_nl_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_constraint_record_p(v_object) : "rkf_scenario_manipulator.sm_constraint_record_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sm_constraint_record(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sm_constraint_record_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sm_constraint_record_id(v_new, current_value);
            } else
                if (pcase_var.eql($SENTENCE)) {
                    _csetf_sm_constraint_record_sentence(v_new, current_value);
                } else
                    if (pcase_var.eql($NL_SENTENCE)) {
                        _csetf_sm_constraint_record_nl_sentence(v_new, current_value);
                    } else {
                        Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sm_constraint_record(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SM_CONSTRAINT_RECORD, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sm_constraint_record_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, sm_constraint_record_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $NL_SENTENCE, sm_constraint_record_nl_sentence(obj));
        funcall(visitor_fn, obj, $END, MAKE_SM_CONSTRAINT_RECORD, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sm_constraint_record_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_constraint_record(obj, visitor_fn);
    }

    public static SubLObject sm_new_constraint_record(SubLObject sentence) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        if (((NIL != sentence) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == el_formula_p(sentence))) {
            throw new AssertionError(sentence);
        }
        final SubLObject constraint_record = make_sm_constraint_record(UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_id(constraint_record, id);
            if (NIL != sentence) {
                _csetf_sm_constraint_record_sentence(constraint_record, sentence);
            }
            sm_add_object(id, constraint_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }

    public static SubLObject sm_set_constraint_record_sentence(final SubLObject constraint_record, final SubLObject sentence) {
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        assert NIL != listp(sentence) : "Types.listp(sentence) " + "CommonSymbols.NIL != Types.listp(sentence) " + sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_sentence(constraint_record, sentence);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }

    public static SubLObject sm_set_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject nl_sentence) {
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        assert NIL != stringp(nl_sentence) : "Types.stringp(nl_sentence) " + "CommonSymbols.NIL != Types.stringp(nl_sentence) " + nl_sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_nl_sentence(constraint_record, nl_sentence);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }

    public static SubLObject sm_rem_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject nl_sentence) {
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_constraint_record_nl_sentence(constraint_record, NIL);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return constraint_record;
    }

    public static SubLObject sm_cleanup_constraint_record(final SubLObject constraint_record) {
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        final SubLObject id = sm_constraint_record_id(constraint_record);
        final SubLObject success = sm_rem_object(id);
        return success;
    }

    public static SubLObject sm_term_p(final SubLObject v_object) {
        return makeBoolean((((NIL != forts.fort_p(v_object)) || (NIL != el_formula_p(v_object))) || v_object.isString()) || v_object.isNumber());
    }

    public static SubLObject sm_merge_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sm_merge_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sm_merge_info_native.class ? T : NIL;
    }

    public static SubLObject sm_merge_info_id(final SubLObject v_object) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sm_merge_info_from_scenario(final SubLObject v_object) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sm_merge_info_to_scenario(final SubLObject v_object) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sm_merge_info_align_to(final SubLObject v_object) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sm_merge_info_align_from(final SubLObject v_object) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sm_merge_info_indexical_equivalences(final SubLObject v_object) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_sm_merge_info_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sm_merge_info_from_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sm_merge_info_to_scenario(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sm_merge_info_align_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sm_merge_info_align_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sm_merge_info_indexical_equivalences(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_merge_info_p(v_object) : "rkf_scenario_manipulator.sm_merge_info_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_sm_merge_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sm_merge_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sm_merge_info_id(v_new, current_value);
            } else
                if (pcase_var.eql($FROM_SCENARIO)) {
                    _csetf_sm_merge_info_from_scenario(v_new, current_value);
                } else
                    if (pcase_var.eql($TO_SCENARIO)) {
                        _csetf_sm_merge_info_to_scenario(v_new, current_value);
                    } else
                        if (pcase_var.eql($ALIGN_TO)) {
                            _csetf_sm_merge_info_align_to(v_new, current_value);
                        } else
                            if (pcase_var.eql($ALIGN_FROM)) {
                                _csetf_sm_merge_info_align_from(v_new, current_value);
                            } else
                                if (pcase_var.eql($INDEXICAL_EQUIVALENCES)) {
                                    _csetf_sm_merge_info_indexical_equivalences(v_new, current_value);
                                } else {
                                    Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sm_merge_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SM_MERGE_INFO, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sm_merge_info_id(obj));
        funcall(visitor_fn, obj, $SLOT, $FROM_SCENARIO, sm_merge_info_from_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $TO_SCENARIO, sm_merge_info_to_scenario(obj));
        funcall(visitor_fn, obj, $SLOT, $ALIGN_TO, sm_merge_info_align_to(obj));
        funcall(visitor_fn, obj, $SLOT, $ALIGN_FROM, sm_merge_info_align_from(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXICAL_EQUIVALENCES, sm_merge_info_indexical_equivalences(obj));
        funcall(visitor_fn, obj, $END, MAKE_SM_MERGE_INFO, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sm_merge_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_merge_info(obj, visitor_fn);
    }

    public static SubLObject sm_new_merge_info() {
        final SubLObject merge_info = make_sm_merge_info(UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_id(merge_info, id);
            sm_add_object(id, merge_info);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }

    public static SubLObject sm_cleanup_merge_info(final SubLObject merge_info) {
        assert NIL != sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        final SubLObject id = sm_merge_info_id(merge_info);
        final SubLObject success = sm_rem_object(id);
        return success;
    }

    public static SubLObject sm_set_merge_info_from_scenario(final SubLObject merge_info, final SubLObject from_scenario) {
        assert NIL != sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        assert NIL != sm_scenario_p(from_scenario) : "rkf_scenario_manipulator.sm_scenario_p(from_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(from_scenario) " + from_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_from_scenario(merge_info, from_scenario);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }

    public static SubLObject sm_set_merge_info_to_scenario(final SubLObject merge_info, final SubLObject to_scenario) {
        assert NIL != sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        assert NIL != sm_scenario_p(to_scenario) : "rkf_scenario_manipulator.sm_scenario_p(to_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(to_scenario) " + to_scenario;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_to_scenario(merge_info, to_scenario);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }

    public static SubLObject sm_set_merge_info_align_to(final SubLObject merge_info, final SubLObject indexical_record) {
        assert NIL != sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_align_to(merge_info, indexical_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }

    public static SubLObject sm_set_merge_info_align_from(final SubLObject merge_info, final SubLObject indexical_record) {
        assert NIL != sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_merge_info_align_from(merge_info, indexical_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }

    public static SubLObject update_sm_merge_info_indexical_equivalences(final SubLObject merge_info) {
        assert NIL != sm_merge_info_p(merge_info) : "rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_merge_info_p(merge_info) " + merge_info;
        final SubLObject align_to = sm_merge_info_align_to(merge_info);
        final SubLObject align_from = sm_merge_info_align_from(merge_info);
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            final SubLObject item_var = list(align_to, align_from);
            if (NIL == member(item_var, sm_merge_info_indexical_equivalences(merge_info), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_sm_merge_info_indexical_equivalences(merge_info, cons(item_var, sm_merge_info_indexical_equivalences(merge_info)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return merge_info;
    }

    public static SubLObject sm_gen_point_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sm_gen_point_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sm_gen_point_native.class ? T : NIL;
    }

    public static SubLObject sm_gen_point_id(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sm_gen_point_non_indexical(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sm_gen_point_isas(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sm_gen_point_genls(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sm_gen_point_positions(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sm_gen_point_indexical_record(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sm_gen_point_keyword(final SubLObject v_object) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_sm_gen_point_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sm_gen_point_non_indexical(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sm_gen_point_isas(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sm_gen_point_genls(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sm_gen_point_positions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sm_gen_point_indexical_record(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sm_gen_point_keyword(final SubLObject v_object, final SubLObject value) {
        assert NIL != sm_gen_point_p(v_object) : "rkf_scenario_manipulator.sm_gen_point_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_sm_gen_point(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sm_gen_point_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_sm_gen_point_id(v_new, current_value);
            } else
                if (pcase_var.eql($NON_INDEXICAL)) {
                    _csetf_sm_gen_point_non_indexical(v_new, current_value);
                } else
                    if (pcase_var.eql($ISAS)) {
                        _csetf_sm_gen_point_isas(v_new, current_value);
                    } else
                        if (pcase_var.eql($GENLS)) {
                            _csetf_sm_gen_point_genls(v_new, current_value);
                        } else
                            if (pcase_var.eql($POSITIONS)) {
                                _csetf_sm_gen_point_positions(v_new, current_value);
                            } else
                                if (pcase_var.eql($INDEXICAL_RECORD)) {
                                    _csetf_sm_gen_point_indexical_record(v_new, current_value);
                                } else
                                    if (pcase_var.eql($KEYWORD)) {
                                        _csetf_sm_gen_point_keyword(v_new, current_value);
                                    } else {
                                        Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sm_gen_point(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SM_GEN_POINT, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, sm_gen_point_id(obj));
        funcall(visitor_fn, obj, $SLOT, $NON_INDEXICAL, sm_gen_point_non_indexical(obj));
        funcall(visitor_fn, obj, $SLOT, $ISAS, sm_gen_point_isas(obj));
        funcall(visitor_fn, obj, $SLOT, $GENLS, sm_gen_point_genls(obj));
        funcall(visitor_fn, obj, $SLOT, $POSITIONS, sm_gen_point_positions(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXICAL_RECORD, sm_gen_point_indexical_record(obj));
        funcall(visitor_fn, obj, $SLOT, $KEYWORD, sm_gen_point_keyword(obj));
        funcall(visitor_fn, obj, $END, MAKE_SM_GEN_POINT, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sm_gen_point_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sm_gen_point(obj, visitor_fn);
    }

    public static SubLObject sm_new_gen_point(final SubLObject non_indexical) {
        final SubLObject sm_gen_point = make_sm_gen_point(UNPROVIDED);
        final SubLObject id = next_sm_id();
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_id(sm_gen_point, id);
            _csetf_sm_gen_point_non_indexical(sm_gen_point, non_indexical);
            sm_add_object(id, sm_gen_point);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }

    public static SubLObject sm_add_gen_point_isas(final SubLObject sm_gen_point, final SubLObject isas) {
        assert NIL != sm_gen_point_p(sm_gen_point) : "rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + sm_gen_point;
        assert NIL != listp(isas) : "Types.listp(isas) " + "CommonSymbols.NIL != Types.listp(isas) " + isas;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_isas(sm_gen_point, isas);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }

    public static SubLObject sm_add_gen_point_genls(final SubLObject sm_gen_point, final SubLObject v_genls) {
        assert NIL != sm_gen_point_p(sm_gen_point) : "rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + sm_gen_point;
        assert NIL != listp(v_genls) : "Types.listp(v_genls) " + "CommonSymbols.NIL != Types.listp(v_genls) " + v_genls;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_genls(sm_gen_point, v_genls);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }

    public static SubLObject sm_add_gen_point_position(final SubLObject sm_gen_point, SubLObject position) {
        assert NIL != sm_gen_point_p(sm_gen_point) : "rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + sm_gen_point;
        assert NIL != listp(position) : "Types.listp(position) " + "CommonSymbols.NIL != Types.listp(position) " + position;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            if (NIL == member(position, sm_gen_point_positions(sm_gen_point), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                _csetf_sm_gen_point_positions(sm_gen_point, cons(position, sm_gen_point_positions(sm_gen_point)));
            }
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }

    public static SubLObject sm_set_gen_point_indexical_record(final SubLObject sm_gen_point, final SubLObject indexical_record) {
        assert NIL != sm_gen_point_p(sm_gen_point) : "rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_gen_point_p(sm_gen_point) " + sm_gen_point;
        assert NIL != sm_indexical_record_p(indexical_record) : "rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) " + indexical_record;
        SubLObject release = NIL;
        try {
            release = seize_lock($sm_lock$.getGlobalValue());
            _csetf_sm_gen_point_indexical_record(sm_gen_point, indexical_record);
        } finally {
            if (NIL != release) {
                release_lock($sm_lock$.getGlobalValue());
            }
        }
        return sm_gen_point;
    }

    public static SubLObject sm_grab_or_compute_gen_point_keyword(final SubLObject gen_point) {
        final SubLObject keyword = sm_gen_point_keyword(gen_point);
        if (NIL != keyword) {
            return keyword;
        }
        final SubLObject type = sm_best_gen_point_type(gen_point);
        _csetf_sm_gen_point_keyword(gen_point, NIL != constant_p(type) ? string_utilities.keyword_from_string(Strings.string_upcase(constants_high.constant_name(type), UNPROVIDED, UNPROVIDED)) : gentemp($str207$_SC));
        return sm_gen_point_keyword(gen_point);
    }

    public static SubLObject sm_best_gen_point_type(final SubLObject gen_point) {
        return sm_gen_point_isas(gen_point).first();
    }

    public static SubLObject sm_cleanup_gen_point(final SubLObject gen_point) {
        assert NIL != sm_gen_point_p(gen_point) : "rkf_scenario_manipulator.sm_gen_point_p(gen_point) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_gen_point_p(gen_point) " + gen_point;
        final SubLObject id = sm_gen_point_id(gen_point);
        final SubLObject success = sm_rem_object(id);
        return success;
    }

    public static SubLObject sm_simple_compute_and_set_indexical_phrase(final SubLObject indexical_record) {
        final SubLObject v_genls = sm_indexical_record_explicit_genls(indexical_record);
        final SubLObject isas = sm_indexical_record_explicit_isas(indexical_record);
        final SubLObject specific_genls = sm_choose_optimal_genls(v_genls);
        final SubLObject specific_isa = sm_choose_optimal_isa(isas);
        SubLObject phrase = NIL;
        if ((NIL != v_genls) && cardinality_estimates.generality_estimate(specific_genls).numL(cardinality_estimates.generality_estimate(specific_isa))) {
            phrase = cconcatenate($$$the_kind_of_, pph_main.generate_phrase(specific_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            phrase = pph_main.generate_phrase(make_unary_formula($$The, specific_isa), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        sm_add_indexical_phrase(indexical_record, phrase);
        return indexical_record;
    }

    public static SubLObject sm_choose_optimal_genls(final SubLObject v_genls) {
        return Sort.sort(v_genls, symbol_function($sym210$_), GENERALITY_ESTIMATE).first();
    }

    public static SubLObject sm_choose_optimal_isa(final SubLObject isas) {
        return Sort.sort(isas, symbol_function($sym210$_), GENERALITY_ESTIMATE).first();
    }

    public static SubLObject sm_scenario_indexical_records_of_type(final SubLObject v_scenario, final SubLObject collection, final SubLObject relation, SubLObject template) {
        if (template == UNPROVIDED) {
            template = NIL;
        }
        SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject result = NIL;
        if (NIL != template) {
            indexical_records = append(sm_template_parameters(template), indexical_records);
        }
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (relation.eql($ISA)) {
                if (collection.eql(sm_indexical_record_explicit_isas(indexical_record).first())) {
                    result = cons(indexical_record, result);
                }
            } else
                if (relation.eql($GENLS) && collection.eql(sm_indexical_record_explicit_genls(indexical_record).first())) {
                    result = cons(indexical_record, result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sm_number_indexical_phrases(final SubLObject indexical_records, final SubLObject collection, final SubLObject relation) {
        final SubLObject basic_phrase = pph_main.generate_phrase(collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.doubletonP(indexical_records)) {
            sm_uniquify_two_indexical_records(indexical_records, basic_phrase, relation);
            return NIL;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(indexical_records), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            sm_number_one_indexical_phrase(elt(indexical_records, i), elt($sm_indexical_numbered_phrases$.getGlobalValue(), i), basic_phrase, relation);
        }
        return NIL;
    }

    public static SubLObject sm_uniquify_two_indexical_records(final SubLObject indexical_records, final SubLObject basic_phrase, final SubLObject relation) {
        SubLObject first_record = NIL;
        SubLObject second_record = NIL;
        destructuring_bind_must_consp(indexical_records, indexical_records, $list214);
        first_record = indexical_records.first();
        SubLObject current = indexical_records.rest();
        destructuring_bind_must_consp(current, indexical_records, $list214);
        second_record = current.first();
        current = current.rest();
        if (NIL == current) {
            if (relation.eql($ISA)) {
                sm_add_indexical_phrase(first_record, cconcatenate($$$the_, basic_phrase));
                sm_add_indexical_phrase(second_record, cconcatenate($$$the_other_, basic_phrase));
            } else
                if (relation.eql($GENLS)) {
                    sm_add_indexical_phrase(first_record, cconcatenate($$$the_kind_of_, basic_phrase));
                    sm_add_indexical_phrase(second_record, cconcatenate($$$the_other_kind_of_, basic_phrase));
                }

        } else {
            cdestructuring_bind_error(indexical_records, $list214);
        }
        return NIL;
    }

    public static SubLObject sm_number_one_indexical_phrase(final SubLObject indexical_record, final SubLObject number_phrase, final SubLObject basic_phrase, final SubLObject relation) {
        SubLObject cdolist_list_var = sm_indexical_record_phrases(indexical_record);
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.substringP(basic_phrase, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                sm_rem_indexical_phrase(indexical_record, phrase);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        if (relation.eql($ISA)) {
            sm_add_indexical_phrase(indexical_record, cconcatenate($$$the_, new SubLObject[]{ number_phrase, $$$_, basic_phrase }));
        } else
            if (relation.eql($GENLS)) {
                sm_add_indexical_phrase(indexical_record, cconcatenate($$$the_, new SubLObject[]{ number_phrase, $$$_kind_of_, basic_phrase }));
            }

        return indexical_record;
    }

    public static SubLObject sm_generate_indexical_phrases_for_scenario(final SubLObject v_scenario, SubLObject template) {
        if (template == UNPROVIDED) {
            template = NIL;
        }
        SubLObject already_handled = NIL;
        SubLObject indexical_records = sm_scenario_terms(v_scenario);
        if (NIL != template) {
            indexical_records = append(sm_template_parameters(template), indexical_records);
        }
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == subl_promotions.memberP(indexical_record, already_handled, UNPROVIDED, UNPROVIDED)) && (NIL == sm_indexical_record_phrases(indexical_record))) {
                final SubLObject v_isa = sm_indexical_record_explicit_isas(indexical_record).first();
                final SubLObject genl = (v_isa.eql($$Collection)) ? sm_indexical_record_explicit_genls(indexical_record).first() : NIL;
                final SubLObject others_of_type = remove(indexical_record, NIL != genl ? sm_scenario_indexical_records_of_type(v_scenario, genl, $GENLS, template) : sm_scenario_indexical_records_of_type(v_scenario, v_isa, $ISA, template), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                already_handled = cons(indexical_record, already_handled);
                if (NIL == others_of_type) {
                    if (NIL == sm_indexical_record_phrases(indexical_record)) {
                        sm_simple_compute_and_set_indexical_phrase(indexical_record);
                    }
                } else {
                    already_handled = nconc(already_handled, others_of_type);
                    if (NIL != genl) {
                        sm_number_indexical_phrases(Sort.sort(cons(indexical_record, others_of_type), symbol_function($sym210$_), symbol_function(SM_INDEXICAL_RECORD_NUMBER)), genl, $GENLS);
                    } else {
                        sm_number_indexical_phrases(Sort.sort(cons(indexical_record, others_of_type), symbol_function($sym210$_), symbol_function(SM_INDEXICAL_RECORD_NUMBER)), v_isa, $ISA);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_act_read_scenario(final SubLObject scenario_spec, final SubLObject phrase, final SubLObject interaction_mt) {
        final SubLObject scenario_fort = sm_scenario_spec_fort(scenario_spec);
        final SubLObject v_scenario = sm_new_scenario(phrase, scenario_fort, UNPROVIDED);
        final SubLObject substitutions = sm_scenario_spec_substitutions(scenario_spec);
        final SubLObject indexical_records = sm_retrieve_scenario_fort_indexical_records(v_scenario, scenario_fort, interaction_mt);
        final SubLObject constraint_records = sm_retrieve_scenario_fort_constraint_records(v_scenario, scenario_fort, interaction_mt);
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(sm_indexical_record_indexical(indexical_record), substitutions, symbol_function(EQL), symbol_function(CAR))) {
                sm_add_scenario_term(v_scenario, indexical_record);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        sm_generate_indexical_phrases_for_scenario(v_scenario, UNPROVIDED);
        cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_add_scenario_constraint(v_scenario, sm_substitute_terms_for_indexicals(constraint_record, substitutions));
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_retrieve_scenario_fort_indexical_records(final SubLObject v_scenario, final SubLObject scenario_fort, final SubLObject mt) {
        final SubLObject indexicals = sm_retrieve_scenario_terms_for_scenario(scenario_fort, mt);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = indexicals;
        SubLObject indexical = NIL;
        indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject phrases = sm_retrieve_scenario_referents_for_scenario(scenario_fort, indexical, mt);
            result = cons(sm_new_indexical_record(indexical, phrases, UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sm_retrieve_scenario_terms_for_scenario(final SubLObject scenario_fort, final SubLObject mt) {
        return kb_mapping_utilities.pred_values_in_relevant_mts(scenario_fort, $$scenarioTerms, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sm_retrieve_scenario_referents_for_scenario(final SubLObject scenario_fort, final SubLObject indexical, final SubLObject mt) {
        return kb_mapping_utilities.pred_arg_values_in_relevant_mts(scenario_fort, $$scenarioReferent, indexical, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sm_retrieve_scenario_fort_constraint_records(final SubLObject v_scenario, final SubLObject scenario_fort, final SubLObject mt) {
        final SubLObject sentences = kb_mapping_utilities.pred_values_in_relevant_mts(scenario_fort, $$scenarioConstraint, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentence = narts_high.nart_substitute(sentence);
            result = cons(sm_new_constraint_record(sentence), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sm_substitute_terms_for_indexicals(final SubLObject constraint_record, final SubLObject substitutions) {
        final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
        SubLObject sentence_copy = copy_formula(sentence);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                v_term = narts_high.find_nart(v_term);
            }
            if (NIL != sm_indexical_p(v_term)) {
                final SubLObject new_term = (NIL != sm_substitution_list_p(substitutions)) ? sm_get_standin_for_indexical(substitutions, v_term) : v_term;
                if (NIL != new_term) {
                    sentence_copy = cycl_utilities.expression_subst(new_term, v_term, sentence_copy, symbol_function(EQUAL), UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        sm_set_constraint_record_sentence(constraint_record, sentence_copy);
        return constraint_record;
    }

    public static SubLObject sm_act_suggest_scenarios(final SubLObject phrase, final SubLObject interaction_mt, final SubLObject parsing_mt) {
        final SubLObject scenario_expressions = sm_extract_candidate_scenario_expressions(phrase, parsing_mt, interaction_mt);
        SubLObject candidate_scenarios = NIL;
        SubLObject cdolist_list_var = scenario_expressions;
        SubLObject scenario_expression = NIL;
        scenario_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_scenario = sm_act_initialize_scenario_from_expression(scenario_expression, phrase, interaction_mt, parsing_mt);
            candidate_scenarios = cons(v_scenario, candidate_scenarios);
            cdolist_list_var = cdolist_list_var.rest();
            scenario_expression = cdolist_list_var.first();
        } 
        return candidate_scenarios;
    }

    public static SubLObject sm_extract_candidate_scenario_expressions(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parse_results = NIL;
        parse_results = rkf_text_processors.rkf_scenario_reader(phrase, parsing_mt, interaction_mt);
        final SubLObject token_list = rkf_concept_harvester.rkf_ch_string_tokenize(phrase);
        final SubLObject top_result = parse_results.first();
        if (length(token_list).numE(length(top_result.first()))) {
            SubLObject result = second(top_result);
            result = list_utilities.remove_if_not(symbol_function(SM_SCENARIO_EXPRESSION_P), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = parse_results.rest();
            SubLObject parse_result = NIL;
            parse_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = sm_parse_result_substitute(parse_result, token_list, result);
                cdolist_list_var = cdolist_list_var.rest();
                parse_result = cdolist_list_var.first();
            } 
            final SubLObject _prev_bind_0 = $sm_semantic_mt$.currentBinding(thread);
            try {
                $sm_semantic_mt$.bind(interaction_mt, thread);
                result = list_utilities.remove_if_not(symbol_function(SM_SCENARIO_EXPRESSION_OK), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                $sm_semantic_mt$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject sm_act_initialize_scenario_from_expression(final SubLObject scenario_expression, final SubLObject phrase, final SubLObject storage_mt, final SubLObject parsing_mt) {
        final SubLObject scenario_fort = sm_scenario_expression_fort(scenario_expression);
        final SubLObject cyc_terms = sm_scenario_expression_cyc_terms(scenario_expression);
        final SubLObject indexical_nauts = sm_scenario_expression_indexical_nauts(scenario_expression);
        final SubLObject indexicals = Mapping.mapcar(symbol_function(FIND_NART), indexical_nauts);
        final SubLObject substitutions = Mapping.mapcar(symbol_function(LIST), indexicals, new SubLObject[]{ cyc_terms });
        final SubLObject scenario_spec = sm_new_scenario_spec(scenario_fort, substitutions);
        SubLObject scenario_phrase = NIL;
        SubLObject v_scenario = NIL;
        if (NIL == phrase) {
            scenario_phrase = sm_fetch_scenario_phrase(scenario_expression, parsing_mt);
        } else {
            scenario_phrase = phrase;
        }
        v_scenario = sm_act_read_scenario(scenario_spec, scenario_phrase, storage_mt);
        return v_scenario;
    }

    public static SubLObject sm_scenario_expression_ok(final SubLObject scenario_expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $sm_semantic_mt$.getDynamicValue();
        }
        if (NIL != list_utilities.lengthE(scenario_expression, FOUR_INTEGER, UNPROVIDED)) {
            final SubLObject cyc_terms = sm_scenario_expression_cyc_terms(scenario_expression);
            final SubLObject indexical_nauts = sm_scenario_expression_indexical_nauts(scenario_expression);
            final SubLObject length = length(cyc_terms);
            if (NIL != list_utilities.lengthE(indexical_nauts, length, UNPROVIDED)) {
                SubLObject i;
                SubLObject indexical_naut;
                SubLObject cyc_term;
                SubLObject naut_type;
                for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                    indexical_naut = cycl_utilities.formula_arg(indexical_nauts, i, UNPROVIDED);
                    cyc_term = cycl_utilities.formula_arg(cyc_terms, i, UNPROVIDED);
                    naut_type = cycl_utilities.nat_arg1(indexical_naut, UNPROVIDED);
                    if ((NIL == sm_el_wftP(cyc_term, mt)) || (NIL != isa.not_isaP(cyc_term, naut_type, mt, UNPROVIDED))) {
                        return NIL;
                    }
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject sm_el_wftP(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_list_as_terminalP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_list_as_terminalP$.bind(NIL, thread);
            result = wff.el_wftP(v_term, mt, UNPROVIDED);
        } finally {
            cycl_grammar.$grammar_permits_list_as_terminalP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sm_scenario_constraints_wffP(final SubLObject v_scenario, final SubLObject mt) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        SubLObject cdolist_list_var;
        final SubLObject constraint_sentences = cdolist_list_var = Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), constraint_records);
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == wff.el_wffP(sentence, mt, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject sm_fetch_scenario_phrase(final SubLObject scenario_expression, final SubLObject parsing_mt) {
        final SubLObject template_expression = ask_utilities.ask_variable(list($$termTemplate, $$ScenarioTemplate, $sym232$_EXPR, scenario_expression), parsing_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sm_enumerate_scenarios_unpack_template_expression(template_expression);
    }

    public static SubLObject sm_act_initialize_scenario_from_cycl(SubLObject cycl_sentence, final SubLObject domain_interaction_mt, final SubLObject generation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_conjunction_p(cycl_sentence)) {
            cycl_sentence = make_conjunction(list(cycl_sentence));
        }
        final SubLObject v_scenario = sm_new_scenario(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject vars = sm_extract_cycl_sentence_vars(cycl_sentence);
        SubLObject constraints = NIL;
        SubLObject var_map = NIL;
        final SubLObject literals = sm_extract_cycl_sentence_constraints(cycl_sentence);
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject isas = NIL;
            SubLObject v_genls = NIL;
            final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            try {
                at_vars.$accumulating_at_violationsP$.bind(T, thread);
                thread.resetMultipleValues();
                final SubLObject var_isas = sm_term_requires_types_in_relations(var, literals, domain_interaction_mt);
                final SubLObject var_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                isas = var_isas;
                v_genls = var_genls;
            } finally {
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
            }
            if (NIL == isas) {
                isas = list($$Thing);
            }
            final SubLObject indexical = sm_new_indexical($$Thing, sm_get_next_indexical_number_of_type(v_scenario, $$Thing));
            final SubLObject indexical_record = sm_new_indexical_record(indexical, NIL, isas, v_genls);
            var_map = cons(list(var, indexical_record), var_map);
            sm_set_indexical_record_var(indexical_record, var);
            sm_add_scenario_term(v_scenario, indexical_record);
            cycl_sentence = cycl_utilities.expression_subst(indexical, var, cycl_sentence, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        sm_generate_indexical_phrases_for_scenario(v_scenario, UNPROVIDED);
        constraints = nconc(constraints, sm_extract_cycl_sentence_constraints(cycl_sentence));
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject cdolist_list_var2 = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject constraint_record = sm_new_constraint_record(UNPROVIDED);
            sm_set_constraint_record_sentence(constraint_record, constraint);
            sm_add_scenario_constraint(v_scenario, constraint_record);
            sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_interaction_mt, generation_mt);
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint = cdolist_list_var2.first();
        } 
        return values(v_scenario, var_map);
    }

    public static SubLObject sm_extract_cycl_sentence_vars(final SubLObject cycl_sentence) {
        return cycl_utilities.expression_gather(cycl_sentence, $sym131$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sm_extract_types_for_var(final SubLObject formula, final SubLObject var) {
        if (NIL == formula) {
            return NIL;
        }
        if (formula.isAtom()) {
            return NIL;
        }
        if ((NIL != possibly_sentence_p(formula)) && cycl_utilities.sentence_arg0(formula).eql($$and)) {
            return sm_extract_types_for_var(cycl_utilities.sentence_args(formula, UNPROVIDED), var);
        }
        if (((NIL != possibly_sentence_p(formula)) && cycl_utilities.sentence_arg0(formula).eql($$isa)) && cycl_utilities.sentence_arg1(formula, UNPROVIDED).eql(var)) {
            return list(cycl_utilities.sentence_arg2(formula, UNPROVIDED));
        }
        if (NIL != possibly_sentence_p(formula)) {
            return append(sm_extract_types_for_var(formula.first(), var), sm_extract_types_for_var(formula.rest(), var));
        }
        return NIL;
    }

    public static SubLObject sm_extract_cycl_sentence_constraints(final SubLObject cycl_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == cycl_sentence) {
                result = NIL;
            } else
                if (NIL != el_existential_p(cycl_sentence)) {
                    result = sm_extract_cycl_sentence_constraints(cycl_utilities.sentence_arg2(cycl_sentence, UNPROVIDED));
                } else
                    if ((NIL != possibly_sentence_p(cycl_sentence)) && cycl_utilities.sentence_arg0(cycl_sentence).eql($$and)) {
                        result = sm_extract_cycl_sentence_constraints(cycl_utilities.sentence_args(cycl_sentence, UNPROVIDED));
                    } else
                        if (((NIL != el_general_implication_p(cycl_sentence)) || (NIL != el_disjunction_p(cycl_sentence))) || (NIL != el_universal_p(cycl_sentence))) {
                            Errors.error($str238$Cycl_formulas_containing__A_canno, cycl_utilities.sentence_arg0(cycl_sentence));
                        } else
                            if ((NIL != sm_atomic_sentenceP(cycl_sentence, UNPROVIDED)) || (NIL != sm_negated_atomic_sentenceP(cycl_sentence, UNPROVIDED))) {
                                result = list(cycl_sentence);
                            } else
                                if (cycl_sentence.isCons()) {
                                    result = append(sm_extract_cycl_sentence_constraints(cycl_sentence.first()), sm_extract_cycl_sentence_constraints(cycl_sentence.rest()));
                                } else {
                                    Errors.error($str239$_A_unexpected_, cycl_sentence);
                                }





        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sm_atomic_sentenceP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym240$CYC_VAR_;
        }
        return makeBoolean((NIL != atomic_sentenceP(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != term.relation_syntaxP(v_object, varP))) && (NIL != sm_indexical_p(cycl_utilities.formula_arg0(v_object)))));
    }

    public static SubLObject sm_negated_atomic_sentenceP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym240$CYC_VAR_;
        }
        return makeBoolean(((NIL != el_formula_p(v_object)) && cycl_utilities.sentence_arg0(v_object).eql($$not)) && (NIL != sm_atomic_sentenceP(cycl_utilities.sentence_arg1(v_object, UNPROVIDED), varP)));
    }

    public static SubLObject sm_act_suggest_new_indexical_type(final SubLObject indexical_phrase, final SubLObject parsing_mt, final SubLObject domain_mt) {
        SubLObject parse_results = NIL;
        parse_results = rkf_text_processors.rkf_term_reader(indexical_phrase, parsing_mt, domain_mt, UNPROVIDED);
        final SubLObject length = length(rkf_concept_harvester.rkf_ch_string_tokenize(indexical_phrase));
        final SubLObject collections = sm_extract_entire_parses_of_type(parse_results, length, $sym242$UIA_IS_TERM_A_COLLECTION_IN_ANY_MT_);
        return collections;
    }

    public static SubLObject sm_act_add_new_indexical(final SubLObject v_scenario, final SubLObject indexical_phrase, final SubLObject indexical_isa, final SubLObject indexical_genls) {
        final SubLObject indexical = sm_new_indexical($$Thing, sm_get_next_indexical_number_of_type(v_scenario, $$Thing));
        final SubLObject isas = (indexical_isa.isList()) ? indexical_isa : list(indexical_isa);
        final SubLObject v_genls = (indexical_genls.isList()) ? indexical_genls : list(indexical_genls);
        final SubLObject indexical_record = sm_new_indexical_record(indexical, list(indexical_phrase), isas, v_genls);
        sm_add_scenario_term(v_scenario, indexical_record);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_act_share_scenario_term(final SubLObject v_scenario, final SubLObject indexical_record) {
        sm_add_scenario_term(v_scenario, indexical_record);
        sm_scenario_note_borrowed_indexical(v_scenario, indexical_record);
        return v_scenario;
    }

    public static SubLObject sm_get_next_indexical_number_of_type(final SubLObject v_scenario, final SubLObject indexical_type) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject largest_seen = ZERO_INTEGER;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject existing_type = sm_indexical_type(indexical);
            if (existing_type.equal(indexical_type) && sm_indexical_number(indexical).numG(largest_seen)) {
                largest_seen = sm_indexical_number(indexical);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return number_utilities.f_1X(largest_seen);
    }

    public static SubLObject sm_extract_entire_parses_of_type(final SubLObject parse_results, final SubLObject length, final SubLObject test) {
        SubLObject concepts = NIL;
        SubLObject cdolist_list_var = parse_results;
        SubLObject parse_result = NIL;
        parse_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (length(parse_result.first()).numE(length)) {
                SubLObject cdolist_list_var_$1 = second(parse_result);
                SubLObject parse = NIL;
                parse = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (NIL != funcall(test, parse)) {
                        concepts = cons(parse, concepts);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    parse = cdolist_list_var_$1.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse_result = cdolist_list_var.first();
        } 
        return concepts;
    }

    public static SubLObject sm_act_find_indexical(final SubLObject v_scenario, final SubLObject indexical_phrase, SubLObject testfn) {
        if (testfn == UNPROVIDED) {
            testfn = STRING_EQUAL;
        }
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = sm_scenario_terms(v_scenario);
            SubLObject indexical_record = NIL;
            indexical_record = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != find(indexical_phrase, sm_indexical_record_phrases(indexical_record), testfn, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    foundP = indexical_record;
                }
                csome_list_var = csome_list_var.rest();
                indexical_record = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject sm_act_suggest_differences(final SubLObject v_scenario, final SubLObject new_indexical, final SubLObject domain_interaction_mt) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject new_constraints = sm_indexical_record_get_collections(new_indexical);
        SubLObject candidates = NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!indexical_record.eql(new_indexical)) {
                final SubLObject current_constraints = sm_indexical_record_get_collections(indexical_record);
                if (NIL == disjoint_with.any_disjoint_with_anyP(new_constraints, current_constraints, domain_interaction_mt, UNPROVIDED, UNPROVIDED)) {
                    candidates = cons(indexical_record, candidates);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return candidates;
    }

    public static SubLObject sm_indexical_record_get_collections(final SubLObject indexical) {
        return list_utilities.flatten(union(sm_indexical_record_genls(indexical), sm_indexical_record_isas(indexical), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sm_act_distinguish_indexicals(final SubLObject v_scenario, final SubLObject indexical_a, final SubLObject indexical_b, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_a = sm_indexical_record_indexical(indexical_a);
        final SubLObject term_b = sm_indexical_record_indexical(indexical_b);
        final SubLObject sentence = make_binary_formula($$different, term_a, term_b);
        thread.resetMultipleValues();
        final SubLObject temp = sm_act_add_scenario_constraint(v_scenario, sentence, domain_mt);
        final SubLObject status = thread.secondMultipleValue();
        final SubLObject irec = thread.thirdMultipleValue();
        final SubLObject predicate = thread.fourthMultipleValue();
        final SubLObject index_col = thread.fifthMultipleValue();
        final SubLObject rel_col = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return v_scenario;
    }

    public static SubLObject sm_act_remove_indexical(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject domain_interaction_mt) {
        sm_remove_dependent_constraints(v_scenario, indexical_record, domain_interaction_mt);
        sm_rem_scenario_term(v_scenario, indexical_record);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_remove_dependent_constraints(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject domain_interaction_mt) {
        final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
        SubLObject dependent_constraints = NIL;
        SubLObject cdolist_list_var = sm_scenario_constraints(v_scenario);
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = sm_constraint_record_sentence(constraint_record);
            if (NIL != cycl_utilities.formula_find(indexical, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                dependent_constraints = cons(constraint_record, dependent_constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        sm_act_remove_many_constraints(v_scenario, dependent_constraints, domain_interaction_mt);
        return v_scenario;
    }

    public static SubLObject sm_act_add_indexical_phrase(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        sm_add_indexical_phrase(indexical_record, indexical_phrase);
        return v_scenario;
    }

    public static SubLObject sm_act_remove_indexical_phrase(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject indexical_phrase) {
        sm_rem_indexical_phrase(indexical_record, indexical_phrase);
        return v_scenario;
    }

    public static SubLObject sm_act_gather_all_preferred_indexical_phrases(final SubLObject v_scenario) {
        return Mapping.mapcar(SM_INDEXICAL_RECORD_PREFERRED_PHRASE, sm_scenario_terms(v_scenario));
    }

    public static SubLObject sm_act_resolve_phrase_to_term(final SubLObject v_scenario, final SubLObject phrase) {
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = sm_scenario_terms(v_scenario);
            SubLObject indexical_record = NIL;
            indexical_record = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != subl_promotions.memberP(phrase, sm_indexical_record_phrases(indexical_record), STRING_EQUAL, UNPROVIDED)) {
                    doneP = T;
                    result = sm_indexical_record_indexical(indexical_record);
                }
                csome_list_var = csome_list_var.rest();
                indexical_record = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject sm_act_remove_isaXgenls_constraint(final SubLObject v_scenario, final SubLObject indexical_record, final SubLObject collection, final SubLObject domain_interaction_mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $$isa;
        }
        SubLObject explicit_known_cols = (type.eql($$isa)) ? sm_indexical_record_explicit_isas(indexical_record) : sm_indexical_record_explicit_genls(indexical_record);
        SubLObject all_known_cols = (type.eql($$isa)) ? sm_indexical_record_isas(indexical_record) : sm_indexical_record_genls(indexical_record);
        explicit_known_cols = delete(collection, explicit_known_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        all_known_cols = delete(collection, all_known_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (type.eql($$isa)) {
            sm_set_indexical_record_explicit_isas(indexical_record, explicit_known_cols);
            sm_set_indexical_record_isas(indexical_record, all_known_cols);
        } else {
            sm_set_indexical_record_explicit_genls(indexical_record, explicit_known_cols);
            sm_set_indexical_record_genls(indexical_record, all_known_cols);
        }
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_act_get_all_isas_for_indexicals(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_get_all_isas_for_indexicals_memoized(v_scenario);
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_get_all_isas_for_indexicals_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject isas = NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = sm_indexical_record_explicit_isas(indexical_record);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject item_var = v_isa;
                if (NIL == member(item_var, isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                    isas = cons(item_var, isas);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                v_isa = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return isas;
    }

    public static SubLObject sm_act_get_all_isas_for_indexicals_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_get_all_isas_for_indexicals_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_get_all_isas_for_indexicals_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sm_act_get_all_genls_for_indexicals(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_get_all_genls_for_indexicals_memoized(v_scenario);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_get_all_genls_for_indexicals_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject v_genls = NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = sm_indexical_record_explicit_genls(indexical_record);
            SubLObject genl = NIL;
            genl = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                final SubLObject item_var = genl;
                if (NIL == member(item_var, v_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                    v_genls = cons(item_var, v_genls);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                genl = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return v_genls;
    }

    public static SubLObject sm_act_get_all_genls_for_indexicals_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_get_all_genls_for_indexicals_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_get_all_genls_for_indexicals_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sm_act_suggest_constraint_cycl_from_text(final SubLObject nl_sentence, final SubLObject indexical_records, final SubLObject parsing_mt, SubLObject interaction_mt) {
        if (interaction_mt == UNPROVIDED) {
            interaction_mt = NIL;
        }
        SubLObject parse_results = NIL;
        parse_results = rkf_text_processors.rkf_assertion_reader(nl_sentence, parsing_mt, interaction_mt);
        final SubLObject token_list = rkf_concept_harvester.rkf_ch_string_tokenize(nl_sentence);
        final SubLObject length = length(token_list);
        final SubLObject first_result = parse_results.first();
        SubLObject sentences = (length.numE(length(first_result.first()))) ? second(first_result) : NIL;
        if (NIL != sentences) {
            SubLObject cdolist_list_var = parse_results.rest();
            SubLObject parse_result = NIL;
            parse_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sentences = sm_indexical_parse_substitute(indexical_records, sentences);
                sentences = sm_parse_result_substitute(parse_result, token_list, sentences);
                cdolist_list_var = cdolist_list_var.rest();
                parse_result = cdolist_list_var.first();
            } 
            return remove_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject sm_act_add_scenario_constraint(final SubLObject v_scenario, final SubLObject sentence, final SubLObject domain_interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sm_scenario_clear_all_memoization_state(v_scenario);
        thread.resetMultipleValues();
        final SubLObject okP = sm_sentence_ok_for_scenarioP(v_scenario, sentence, domain_interaction_mt);
        final SubLObject irec = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        final SubLObject index_col = thread.fourthMultipleValue();
        final SubLObject rel_col = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == okP) {
            return values(v_scenario, $NON_WFF, irec, predicate, index_col, rel_col);
        }
        final SubLObject constraint_record = sm_new_constraint_record(sentence);
        sm_add_scenario_constraint(v_scenario, constraint_record);
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        return values(v_scenario, $OK, NIL, NIL, NIL, NIL);
    }

    public static SubLObject sm_indexical_parse_substitute(final SubLObject indexical_records, SubLObject sentences) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical_phrases = sm_indexical_record_phrases(indexical_record);
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            SubLObject cdolist_list_var_$6 = indexical_phrases;
            SubLObject indexical_phrase = NIL;
            indexical_phrase = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                final SubLObject unresolved = cycl_utilities.expression_find(indexical_phrase, sentences, NIL, symbol_function(SM_UNRESOLVED_ITEM_FOR_PHRASE), UNPROVIDED);
                if (NIL != unresolved) {
                    sentences = cycl_utilities.expression_subst(indexical, unresolved, sentences, symbol_function(SM_UNRESOLVED_EQUAL), UNPROVIDED);
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                indexical_phrase = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return sentences;
    }

    public static SubLObject sm_unresolved_item_for_phrase(final SubLObject phrase, final SubLObject item) {
        return makeBoolean(((NIL != function_terms.nat_formula_p(item)) && cycl_utilities.nat_arg0(item).eql($$TheResultOfParsing)) && cycl_utilities.nat_arg1(item, UNPROVIDED).equalp(phrase));
    }

    public static SubLObject sm_unresolved_equal(final SubLObject obj1, final SubLObject obj2) {
        return makeBoolean(((((obj1.isCons() && obj2.isCons()) && obj1.first().equal($$TheResultOfParsing)) && obj2.first().equal($$TheResultOfParsing)) && second(obj1).equal(second(obj2))) && third(obj1).equal(third(obj2)));
    }

    public static SubLObject sm_subphrase(final SubLObject token_list, final SubLObject token_numbers) {
        SubLObject subphrase = NIL;
        SubLObject cdolist_list_var = token_numbers;
        SubLObject token_number = NIL;
        token_number = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subphrase = cons(nth(token_number, token_list), subphrase);
            cdolist_list_var = cdolist_list_var.rest();
            token_number = cdolist_list_var.first();
        } 
        return nreverse(subphrase);
    }

    public static SubLObject sm_parse_result_substitute(final SubLObject parse_result, final SubLObject token_list, final SubLObject sentences) {
        SubLObject result_sentences = NIL;
        SubLObject token_numbers = NIL;
        SubLObject parses = NIL;
        destructuring_bind_must_consp(parse_result, parse_result, $list253);
        token_numbers = parse_result.first();
        SubLObject current = parse_result.rest();
        destructuring_bind_must_consp(current, parse_result, $list253);
        parses = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject subphrase = string_utilities.bunge(sm_subphrase(token_list, token_numbers), UNPROVIDED);
            final SubLObject unresolved = cycl_utilities.expression_find(subphrase, sentences, NIL, symbol_function(SM_UNRESOLVED_ITEM_FOR_PHRASE), UNPROVIDED);
            if (NIL == unresolved) {
                return sentences;
            }
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.expression_find(unresolved, sentence, NIL, symbol_function(SM_UNRESOLVED_EQUAL), UNPROVIDED)) {
                    SubLObject cdolist_list_var_$7 = parses;
                    SubLObject parse = NIL;
                    parse = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        result_sentences = cons(cycl_utilities.expression_subst(parse, unresolved, sentence, symbol_function(SM_UNRESOLVED_EQUAL), UNPROVIDED), result_sentences);
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        parse = cdolist_list_var_$7.first();
                    } 
                } else {
                    result_sentences = cons(sentence, result_sentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(parse_result, $list253);
        }
        return nreverse(result_sentences);
    }

    public static SubLObject sm_sentence_ok_for_scenarioP(final SubLObject v_scenario, final SubLObject sentence, final SubLObject domain_interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject indexicals = cdolist_list_var = cycl_utilities.expression_gather(sentence, symbol_function(SM_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject indexical = NIL;
        indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject isas = NIL;
            SubLObject v_genls = NIL;
            final SubLObject indexical_record = sm_indexical_record_of_indexical(indexical, v_scenario);
            final SubLObject current_isas = sm_indexical_record_isas(indexical_record);
            final SubLObject current_genls = sm_indexical_record_genls(indexical_record);
            final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            try {
                at_vars.$accumulating_at_violationsP$.bind(T, thread);
                thread.resetMultipleValues();
                final SubLObject indexical_isas = sm_term_requires_types_in_relation(indexical, sentence, domain_interaction_mt);
                final SubLObject indexical_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                isas = indexical_isas;
                v_genls = indexical_genls;
            } finally {
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
            }
            thread.resetMultipleValues();
            SubLObject indexical_constraint = sm_identify_violating_collection_pair(current_isas, isas, domain_interaction_mt);
            SubLObject relation_constraint = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != indexical_constraint) {
                return values(NIL, indexical_record, $$isa, indexical_constraint, relation_constraint);
            }
            thread.resetMultipleValues();
            indexical_constraint = sm_identify_violating_collection_pair(current_genls, v_genls, domain_interaction_mt);
            relation_constraint = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != indexical_constraint) {
                return values(NIL, indexical_record, $$genls, indexical_constraint, relation_constraint);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        } 
        return values(T, NIL, NIL, NIL);
    }

    public static SubLObject sm_term_requires_types_in_relation(final SubLObject indexical, final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject isas = at_utilities.term_requires_types_in_relation(indexical, sentence, mt);
        SubLObject v_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        isas = rkf_relevance_utilities.rkf_filter_irrelevant_terms(isas, mt);
        v_genls = rkf_relevance_utilities.rkf_filter_irrelevant_terms(v_genls, mt);
        return values(genls.min_cols(isas, mt, UNPROVIDED), genls.min_cols(v_genls, mt, UNPROVIDED));
    }

    public static SubLObject sm_term_requires_types_in_relations(final SubLObject indexical, final SubLObject sentences, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject isas = at_utilities.term_requires_types_in_relations(indexical, sentences, mt, NIL);
        SubLObject v_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        isas = rkf_relevance_utilities.rkf_filter_irrelevant_terms(isas, mt);
        v_genls = rkf_relevance_utilities.rkf_filter_irrelevant_terms(v_genls, mt);
        return values(genls.min_cols(isas, mt, UNPROVIDED), genls.min_cols(v_genls, mt, UNPROVIDED));
    }

    public static SubLObject sm_identify_violating_collection_pair(final SubLObject indexical_cols, final SubLObject relation_cols, final SubLObject mt) {
        SubLObject disjoint_problem = NIL;
        SubLObject indexical_constraint = NIL;
        SubLObject relation_constraint = NIL;
        disjoint_problem = disjoint_with.any_disjoint_collection_pair(union(indexical_cols, relation_cols, UNPROVIDED, UNPROVIDED), mt);
        if (NIL != disjoint_problem) {
            SubLObject current;
            final SubLObject datum = current = disjoint_problem;
            SubLObject col_one = NIL;
            SubLObject col_other = NIL;
            destructuring_bind_must_consp(current, datum, $list255);
            col_one = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list255);
            col_other = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != subl_promotions.memberP(col_one, indexical_cols, UNPROVIDED, UNPROVIDED)) {
                    relation_constraint = col_other;
                    indexical_constraint = col_one;
                } else {
                    relation_constraint = col_one;
                    indexical_constraint = col_other;
                }
                return values(indexical_constraint, relation_constraint);
            }
            cdestructuring_bind_error(datum, $list255);
        }
        return values(NIL, NIL);
    }

    public static SubLObject sm_compute_current_indexical_isas_genls(final SubLObject v_scenario, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject indexical_records = cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject explicit_isas = sm_indexical_record_explicit_isas(indexical_record);
            final SubLObject explicit_genls = sm_indexical_record_explicit_genls(indexical_record);
            SubLObject isas = NIL;
            SubLObject v_genls = NIL;
            thread.resetMultipleValues();
            final SubLObject term_isas = sm_scenario_type_constraints_on_term(v_scenario, indexical, interaction_mt);
            final SubLObject term_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            isas = genls.min_cols(list(term_isas, explicit_isas), interaction_mt, UNPROVIDED);
            v_genls = genls.min_cols(list(term_genls, explicit_genls), interaction_mt, UNPROVIDED);
            sm_set_indexical_record_isas(indexical_record, isas);
            sm_set_indexical_record_genls(indexical_record, v_genls);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_scenario_type_constraints_on_term(final SubLObject v_scenario, final SubLObject v_term, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraint_sentences = Mapping.mapcar(symbol_function(SM_CONSTRAINT_RECORD_SENTENCE), sm_scenario_constraints(v_scenario));
        SubLObject isas = NIL;
        SubLObject v_genls = NIL;
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject relation_isas = sm_term_requires_types_in_relations(v_term, constraint_sentences, interaction_mt);
            final SubLObject relation_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            isas = relation_isas;
            v_genls = relation_genls;
        } finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return values(isas, v_genls);
    }

    public static SubLObject sm_act_remove_constraint(final SubLObject v_scenario, final SubLObject constraint_record, final SubLObject domain_interaction_mt) {
        sm_rem_scenario_constraint(v_scenario, constraint_record);
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_act_remove_all_constraints(final SubLObject v_scenario, final SubLObject domain_interaction_mt) {
        return sm_act_remove_many_constraints(v_scenario, sm_scenario_constraints(v_scenario), domain_interaction_mt);
    }

    public static SubLObject sm_act_remove_many_constraints(final SubLObject v_scenario, final SubLObject constraints, final SubLObject domain_interaction_mt) {
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_rem_scenario_constraint(v_scenario, constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_act_import_constraint(final SubLObject v_scenario, final SubLObject constraint, final SubLObject domain_interaction_mt) {
        sm_add_scenario_constraint(v_scenario, constraint);
        sm_add_object(sm_constraint_record_id(constraint), constraint);
        sm_compute_current_indexical_isas_genls(v_scenario, domain_interaction_mt);
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_act_gather_constraint_formulas(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_gather_constraint_formulas_memoized(v_scenario);
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_gather_constraint_formulas_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexicals = Mapping.mapcar(SM_INDEXICAL_RECORD_INDEXICAL, sm_scenario_terms(v_scenario));
        SubLObject formulas = NIL;
        SubLObject cdolist_list_var = sm_scenario_constraints(v_scenario);
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = copy_tree(sm_constraint_record_sentence(constraint_record));
            SubLObject cdolist_list_var_$9 = indexicals;
            SubLObject indexical = NIL;
            indexical = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                nsubst($INDEXICAL, indexical, formula, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                indexical = cdolist_list_var_$9.first();
            } 
            formulas = cons(formula, formulas);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return formulas;
    }

    public static SubLObject sm_act_gather_constraint_formulas_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_gather_constraint_formulas_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_gather_constraint_formulas_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sm_act_modify_phrase(final SubLObject v_scenario, final SubLObject new_phrase) {
        sm_set_scenario_phrase(v_scenario, new_phrase);
        return v_scenario;
    }

    public static SubLObject sm_act_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_records, final SubLObject domain_mt, final SubLObject generation_mt) {
        assert NIL != sm_constraint_record_p(constraint_record) : "rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) " + constraint_record;
        final SubLObject nl_sentence = sm_constraint_record_nl_sentence(constraint_record);
        if (NIL != nl_sentence) {
            return nl_sentence;
        }
        final SubLObject indexical_table = sm_act_construct_indexical_table_from_indexical_records(indexical_records);
        return sm_compute_one_constraint_record_nl_sentence(constraint_record, indexical_table, domain_mt, generation_mt);
    }

    public static SubLObject sm_compute_one_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_table, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_sentence = sm_constraint_record_sentence(constraint_record);
        SubLObject nl_sentence = NIL;
        SubLTrampolineFile.enforceType(indexical_table, ALIST_P);
        final SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
        try {
            pph_vars.$pph_term_paraphrase_map$.bind(indexical_table, thread);
            nl_sentence = rkf_sentence_communicator.rkf_sentence_phrase(cycl_sentence, generation_mt, domain_mt, UNPROVIDED);
        } finally {
            pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
        }
        sm_set_constraint_record_nl_sentence(constraint_record, nl_sentence);
        return nl_sentence;
    }

    public static SubLObject sm_compute_constraint_record_nl_sentence(final SubLObject constraint_record, final SubLObject indexical_records, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_sentence = sm_substitute_phrases_for_indexicals(sm_constraint_record_sentence(constraint_record), indexical_records);
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_language_mt$.bind(generation_mt, thread);
            sm_set_constraint_record_nl_sentence(constraint_record, pph_main.generate_text(cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return sm_constraint_record_nl_sentence(constraint_record);
    }

    public static SubLObject sm_substitute_phrases_for_indexicals(SubLObject cycl_sentence, final SubLObject indexical_records) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject preferred_phrase = sm_indexical_record_preferred_phrase(indexical_record);
            cycl_sentence = cycl_utilities.expression_subst(preferred_phrase, indexical, cycl_sentence, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return cycl_sentence;
    }

    public static SubLObject sm_act_merge_scenarios(final SubLObject to_scenario, final SubLObject from_scenario, final SubLObject indexical_equivalences) {
        assert NIL != sm_scenario_p(to_scenario) : "rkf_scenario_manipulator.sm_scenario_p(to_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(to_scenario) " + to_scenario;
        assert NIL != sm_scenario_p(from_scenario) : "rkf_scenario_manipulator.sm_scenario_p(from_scenario) " + "CommonSymbols.NIL != rkf_scenario_manipulator.sm_scenario_p(from_scenario) " + from_scenario;
        assert NIL != listp(indexical_equivalences) : "Types.listp(indexical_equivalences) " + "CommonSymbols.NIL != Types.listp(indexical_equivalences) " + indexical_equivalences;
        SubLObject cdolist_list_var = sm_scenario_constraints(from_scenario);
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_sentence = copy_formula(sm_constraint_record_sentence(constraint_record));
            new_sentence = sm_merge_replace_non_equivalent_indexical(new_sentence, from_scenario, to_scenario, indexical_equivalences);
            new_sentence = sm_merge_substitute_indexical_equivalences_in_sentence(new_sentence, indexical_equivalences);
            final SubLObject new_constraint_record = sm_new_constraint_record(new_sentence);
            sm_add_scenario_constraint(to_scenario, new_constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        cdolist_list_var = sm_scenario_terms(from_scenario);
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            if ((NIL == subl_promotions.memberP(indexical, indexical_equivalences, symbol_function(EQUAL), symbol_function(SECOND))) && (NIL == sm_indexical_of_scenarioP(indexical, to_scenario))) {
                final SubLObject new_indexical_record = sm_copy_indexical_record_for_scenario(indexical_record, to_scenario);
                sm_add_scenario_term(to_scenario, new_indexical_record);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        sm_generate_indexical_phrases_for_scenario(to_scenario, UNPROVIDED);
        sm_scenario_clear_all_memoization_state(to_scenario);
        return to_scenario;
    }

    public static SubLObject sm_merge_substitute_indexical_equivalences_in_sentence(final SubLObject sentence, final SubLObject indexical_equivalences) {
        SubLObject new_sentence = sentence;
        SubLObject cdolist_list_var = indexical_equivalences;
        SubLObject indexical_equivalence = NIL;
        indexical_equivalence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = indexical_equivalence;
            SubLObject new_indexical_record = NIL;
            SubLObject old_indexical_record = NIL;
            destructuring_bind_must_consp(current, datum, $list259);
            new_indexical_record = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list259);
            old_indexical_record = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject new_indexical = sm_indexical_record_indexical(new_indexical_record);
                final SubLObject old_indexical = sm_indexical_record_indexical(old_indexical_record);
                if (!new_indexical.equal(old_indexical)) {
                    new_sentence = cycl_utilities.expression_subst(new_indexical, old_indexical, new_sentence, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list259);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_equivalence = cdolist_list_var.first();
        } 
        return new_sentence;
    }

    public static SubLObject sm_merge_replace_non_equivalent_indexical(final SubLObject sentence, final SubLObject from_scenario, final SubLObject to_scenario, final SubLObject indexical_equivalences) {
        SubLObject new_sentence = sentence;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sm_indexical_of_scenarioP(arg, to_scenario)) {
                final SubLObject equivalence = assoc(arg, indexical_equivalences, symbol_function(EQUAL), symbol_function(SM_INDEXICAL_RECORD_INDEXICAL));
                if ((NIL == equivalence) || (!arg.equal(sm_indexical_record_indexical(second(equivalence))))) {
                    final SubLObject indexical_type = sm_indexical_type(arg);
                    SubLObject number = sm_get_next_indexical_number_of_type(to_scenario, indexical_type);
                    number = sm_ensure_new_indexical_number_of_type(from_scenario, indexical_type, number);
                    final SubLObject new_indexical = sm_new_indexical(indexical_type, number);
                    final SubLObject new_indexical_record = sm_new_indexical_record(new_indexical, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sm_add_scenario_term(to_scenario, new_indexical_record);
                    new_sentence = cycl_utilities.expression_subst(new_indexical, arg, new_sentence, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return new_sentence;
    }

    public static SubLObject sm_ensure_new_indexical_number_of_type(final SubLObject v_scenario, final SubLObject type, final SubLObject number) {
        final SubLObject next_number = sm_get_next_indexical_number_of_type(v_scenario, type);
        return max(number, next_number);
    }

    public static SubLObject sm_act_generalize_scenario(final SubLObject v_scenario, final SubLObject interaction_mt, final SubLObject generation_mt) {
        SubLObject gen_points = sm_act_compute_scenario_generalization_points(v_scenario, interaction_mt);
        gen_points = remove_if(symbol_function(SM_GEN_POINT_WITHOUT_POSITIONS_P), gen_points, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sm_act_generalize_scenario_with_gen_points(v_scenario, gen_points, interaction_mt, generation_mt);
    }

    public static SubLObject sm_act_generalize_scenario_with_gen_points(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject interaction_mt, final SubLObject generation_mt) {
        final SubLObject template_expr = sm_compute_template_expr_from_generalization_points(v_scenario, gen_points, interaction_mt);
        final SubLObject param_subs = sm_compute_template_param_subs_from_generalization_points(v_scenario, gen_points);
        final SubLObject parameter_indexical_records = Mapping.mapcar(symbol_function(SM_GEN_POINT_INDEXICAL_RECORD), gen_points);
        final SubLObject template = sm_new_template(v_scenario);
        sm_set_template_expression(template, template_expr);
        sm_set_template_param_subs(template, param_subs);
        sm_set_template_parameters(template, parameter_indexical_records);
        sm_add_scenario_template(v_scenario, template);
        sm_set_template_phrase(template, sm_generate_text_from_template_expr(sm_template_expression(template), sm_template_param_subs(template)));
        sm_generate_indexical_phrases_for_scenario(v_scenario, template);
        sm_generalize_scenario_constraints(v_scenario, gen_points, template, interaction_mt, generation_mt);
        return template;
    }

    public static SubLObject sm_act_compute_scenario_generalization_points(final SubLObject v_scenario, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject non_indexicals = sm_non_indexicals_of_constraints(v_scenario);
        SubLObject generalization_points = NIL;
        final SubLObject scenario_tokens = rkf_concept_harvester.rkf_ch_string_tokenize(sm_scenario_phrase(v_scenario));
        SubLObject cdolist_list_var = non_indexicals;
        SubLObject non_indexical = NIL;
        non_indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gen_point = sm_new_gen_point(non_indexical);
            thread.resetMultipleValues();
            final SubLObject isas = sm_scenario_type_constraints_on_term(v_scenario, non_indexical, interaction_mt);
            final SubLObject v_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sm_add_gen_point_isas(gen_point, isas);
            sm_add_gen_point_genls(gen_point, v_genls);
            SubLObject cdolist_list_var_$10;
            final SubLObject phrases = cdolist_list_var_$10 = sm_all_phrases_for_term(non_indexical);
            SubLObject phrase = NIL;
            phrase = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                final SubLObject phrase_tokens = rkf_concept_harvester.rkf_ch_string_tokenize(phrase);
                final SubLObject phrase_length = length(phrase_tokens);
                SubLObject cdolist_list_var_$11;
                final SubLObject starts = cdolist_list_var_$11 = string_utilities.search_all(phrase_tokens, scenario_tokens, symbol_function(EQUALP), UNPROVIDED);
                SubLObject start = NIL;
                start = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    sm_add_gen_point_position(gen_point, list_utilities.new_num_list(phrase_length, start));
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    start = cdolist_list_var_$11.first();
                } 
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                phrase = cdolist_list_var_$10.first();
            } 
            generalization_points = cons(gen_point, generalization_points);
            cdolist_list_var = cdolist_list_var.rest();
            non_indexical = cdolist_list_var.first();
        } 
        return generalization_points;
    }

    public static SubLObject sm_all_phrases_for_term(SubLObject v_term) {
        SubLObject result = NIL;
        if (NIL != term.nautP(v_term, UNPROVIDED)) {
            v_term = narts_high.find_nart(v_term);
        }
        result = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == result) {
            result = list(pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return result;
    }

    public static SubLObject sm_non_indexicals_of_constraints(final SubLObject v_scenario) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        SubLObject non_indexicals = NIL;
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            SubLObject cdolist_list_var_$12;
            final SubLObject args = cdolist_list_var_$12 = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                if (NIL == sm_indexical_p(arg)) {
                    final SubLObject item_var = arg;
                    if (NIL == member(item_var, non_indexicals, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        non_indexicals = cons(item_var, non_indexicals);
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                arg = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return non_indexicals;
    }

    public static SubLObject sm_gen_point_without_positions_p(final SubLObject gen_point) {
        return sublisp_null(sm_gen_point_positions(gen_point));
    }

    public static SubLObject sm_compute_template_expr_from_generalization_points(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject interaction_mt) {
        final SubLObject scenario_tokens = copy_list(rkf_concept_harvester.rkf_ch_string_tokenize(sm_scenario_phrase(v_scenario)));
        SubLObject result = NIL;
        SubLObject next = ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject gen_point;
        SubLObject sequence;
        SubLObject template_type;
        SubLObject keyword;
        SubLObject template_element;
        SubLObject token;
        for (cdotimes_end_var = length(scenario_tokens), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (i.numGE(next)) {
                gen_point = sm_gen_point_starting_at(i, gen_points);
                if (NIL != gen_point) {
                    sequence = sm_best_gen_point_sequence(sm_gen_point_positions(gen_point));
                    template_type = sm_template_type_for_gen_point(gen_point, interaction_mt);
                    keyword = sm_grab_or_compute_gen_point_keyword(gen_point);
                    template_element = list(template_type, keyword);
                    next = add(ONE_INTEGER, last(sequence, UNPROVIDED).first());
                    result = cons(template_element, result);
                } else {
                    token = elt(scenario_tokens, i);
                    if (NIL != find_if(symbol_function(PUNCTUATION_P), token, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        result = cons(list($$OptionalSome, token), result);
                    } else {
                        result = cons(token, result);
                    }
                }
            }
        }
        return nreverse(result);
    }

    public static SubLObject sm_gen_point_starting_at(final SubLObject n, final SubLObject gen_points) {
        SubLObject cdolist_list_var = gen_points;
        SubLObject gen_point = NIL;
        gen_point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(n, sm_gen_point_positions(gen_point), symbol_function(EQL), symbol_function(CAR))) {
                return gen_point;
            }
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sm_best_gen_point_sequence(final SubLObject positions) {
        SubLObject best = positions.first();
        SubLObject cdolist_list_var = positions.rest();
        SubLObject sequence = NIL;
        sequence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subsetp(best, sequence, UNPROVIDED, UNPROVIDED)) {
                best = sequence;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sequence = cdolist_list_var.first();
        } 
        return best;
    }

    public static SubLObject sm_template_type_for_gen_point(final SubLObject gen_point, final SubLObject mt) {
        final SubLObject non_indexical = sm_gen_point_non_indexical(gen_point);
        final SubLObject type = sm_best_gen_point_type(gen_point);
        if (non_indexical.isString()) {
            return $$StringTemplate;
        }
        if (non_indexical.isNumber()) {
            return $$NumberTemplate;
        }
        if (NIL != term.nautP(non_indexical, UNPROVIDED)) {
            return sm_template_type_for_collection(type, mt);
        }
        if (NIL != forts.fort_p(non_indexical)) {
            return sm_template_type_for_collection(type, mt);
        }
        return $$SinkTemplate;
    }

    public static SubLObject sm_template_type_for_collection(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (NIL != genls.genlP(col, $$PropositionalConceptualWork, UNPROVIDED, UNPROVIDED)) {
                result = $$MovieTitleTemplate;
            } else
                if (NIL != genls.genlP(col, $$Event, UNPROVIDED, UNPROVIDED)) {
                    result = $$NPTemplate;
                } else
                    if (NIL != genls.genlP(col, $$SomethingExisting, UNPROVIDED, UNPROVIDED)) {
                        result = $$NPTemplate;
                    } else {
                        result = $$SinkTemplate;
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sm_compute_template_param_subs_from_generalization_points(final SubLObject v_scenario, final SubLObject gen_points) {
        SubLObject param_subs = NIL;
        SubLObject cdolist_list_var = gen_points;
        SubLObject gen_point = NIL;
        gen_point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_set_gen_point_indexical_record(gen_point, sm_construct_gen_point_indexical_record(v_scenario, gen_point, gen_points));
            param_subs = cons(list(sm_gen_point_keyword(gen_point), sm_gen_point_indexical_record(gen_point)), param_subs);
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        } 
        return nreverse(param_subs);
    }

    public static SubLObject sm_construct_gen_point_indexical_record(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject gen_points) {
        final SubLObject type = sm_best_gen_point_type(gen_point);
        final SubLObject isas = sm_gen_point_isas(gen_point);
        final SubLObject v_genls = sm_gen_point_genls(gen_point);
        final SubLObject number = max(sm_get_next_indexical_number_of_type(v_scenario, type), sm_get_next_gen_point_indexical_number_of_type(gen_points, type));
        final SubLObject indexical = sm_new_indexical(type, number);
        return sm_new_indexical_record(indexical, NIL, isas, v_genls);
    }

    public static SubLObject sm_get_next_gen_point_indexical_number_of_type(final SubLObject gen_points, final SubLObject type) {
        SubLObject number = ZERO_INTEGER;
        SubLObject cdolist_list_var = gen_points;
        SubLObject gen_point = NIL;
        gen_point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical_record = sm_gen_point_indexical_record(gen_point);
            final SubLObject indexical = (NIL != indexical_record) ? sm_indexical_record_indexical(indexical_record) : NIL;
            if ((NIL != indexical) && sm_indexical_type(indexical).equal(type)) {
                number = max(number, sm_indexical_number(indexical));
            }
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        } 
        return add(number, ONE_INTEGER);
    }

    public static SubLObject sm_generalize_scenario_constraints(final SubLObject v_scenario, final SubLObject gen_points, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt) {
        SubLObject cdolist_list_var = sm_scenario_constraints(v_scenario);
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_constraint_record = sm_new_constraint_record(UNPROVIDED);
            final SubLObject sentence = copy_formula(sm_constraint_record_sentence(constraint_record));
            sm_set_constraint_record_sentence(new_constraint_record, sentence);
            sm_add_template_constraint(template, new_constraint_record);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        cdolist_list_var = gen_points;
        SubLObject gen_point = NIL;
        gen_point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sm_apply_gen_point_to_template_constraints(v_scenario, gen_point, template, domain_mt, generation_mt);
            cdolist_list_var = cdolist_list_var.rest();
            gen_point = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_apply_gen_point_to_template_constraints(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLObject non_indexical = sm_gen_point_non_indexical(gen_point);
        final SubLObject gen_point_ir = sm_gen_point_indexical_record(gen_point);
        final SubLObject indexical = sm_indexical_record_indexical(gen_point_ir);
        final SubLObject constraint_records = sm_template_constraints(template);
        final SubLObject indexical_records = append(sm_scenario_terms(v_scenario), sm_template_parameters(template));
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            cycl_utilities.expression_nsubst(indexical, non_indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
            sm_compute_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_de_apply_gen_point_to_template_constraints(final SubLObject v_scenario, final SubLObject gen_point, final SubLObject template, final SubLObject domain_mt, final SubLObject generation_mt) {
        final SubLObject non_indexical = sm_gen_point_non_indexical(gen_point);
        final SubLObject gen_point_ir = sm_gen_point_indexical_record(gen_point);
        final SubLObject indexical = sm_indexical_record_indexical(gen_point_ir);
        final SubLObject constraint_records = sm_template_constraints(template);
        final SubLObject indexical_records = append(sm_scenario_terms(v_scenario), sm_template_parameters(template));
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_sm_constraint_record_nl_sentence(constraint_record, NIL);
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            cycl_utilities.expression_nsubst(non_indexical, indexical, sentence, symbol_function(EQUAL), UNPROVIDED);
            sm_compute_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return v_scenario;
    }

    public static SubLObject sm_generate_text_from_template_expr(final SubLObject template_expr, final SubLObject substitutions) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = template_expr;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(sm_generate_text_from_template_element(element, substitutions), result);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        result = string_utilities.bunge(nreverse(result), UNPROVIDED);
        return result;
    }

    public static SubLObject sm_generate_text_from_template_element(final SubLObject element, final SubLObject substitutions) {
        if (element.isString()) {
            return element;
        }
        if (!element.isCons()) {
            return NIL;
        }
        if (element.first().eql($$RequireOne)) {
            return sm_generate_text_from_template_element(second(element), substitutions);
        }
        if (element.first().eql($$OptionalOne)) {
            return NIL;
        }
        if (NIL != genls.genlP(element.first(), $$ParsingTemplateCategory, $$TemplateParsingMt, UNPROVIDED)) {
            return sm_generate_blank_for_template_element(second(element), substitutions);
        }
        return NIL;
    }

    public static SubLObject sm_generate_blank_for_template_element(final SubLObject keyword, final SubLObject substitutions) {
        final SubLObject indexical_record = second(assoc(keyword, substitutions, UNPROVIDED, UNPROVIDED));
        final SubLObject type = sm_indexical_record_explicit_isas(indexical_record).first();
        final SubLObject phrase = pph_main.generate_phrase(type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cconcatenate($str276$_, new SubLObject[]{ phrase, $str277$_ });
    }

    public static SubLObject sm_act_save_scenario(final SubLObject v_scenario, final SubLObject template, final SubLObject storage_mt, final SubLObject parsing_mt) {
        final SubLObject constant = rkf_term_utilities.rkf_scenario_create($$$Scenario);
        rkf_assertion_utilities.rkf_scenario_assert(listS($$isa, constant, $list279), storage_mt);
        rkf_assertion_utilities.rkf_scenario_assert(listS($$quotedIsa, constant, $list281), storage_mt);
        sm_set_scenario_fort(v_scenario, constant);
        sm_save_scenario_terms_and_referents(v_scenario, template, storage_mt);
        sm_save_template_constraints(v_scenario, template, storage_mt);
        sm_save_scenario_term_template(v_scenario, template, parsing_mt);
        return v_scenario;
    }

    public static SubLObject sm_save_scenario_terms_and_referents(final SubLObject v_scenario, final SubLObject template, final SubLObject mt) {
        final SubLObject fort = sm_scenario_fort(v_scenario);
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject parameters = sm_template_parameters(template);
        sm_save_scenario_terms_and_referents_int(fort, indexical_records, mt);
        sm_save_scenario_terms_and_referents_int(fort, parameters, mt);
        return NIL;
    }

    public static SubLObject sm_save_scenario_terms_and_referents_int(final SubLObject fort, final SubLObject indexical_records, final SubLObject mt) {
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject phrases = sm_indexical_record_phrases(indexical_record);
            rkf_assertion_utilities.rkf_scenario_assert(list($$scenarioTerms, fort, indexical), mt);
            SubLObject cdolist_list_var_$13 = phrases;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                rkf_assertion_utilities.rkf_scenario_assert(list($$scenarioReferent, fort, indexical, phrase), mt);
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                phrase = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sm_save_template_constraints(final SubLObject v_scenario, final SubLObject template, final SubLObject mt) {
        final SubLObject fort = sm_scenario_fort(v_scenario);
        SubLObject cdolist_list_var;
        final SubLObject constraint_records = cdolist_list_var = sm_template_constraints(template);
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            rkf_assertion_utilities.rkf_scenario_assert(list($$scenarioConstraint, fort, sentence), mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sm_save_scenario_term_template(final SubLObject v_scenario, final SubLObject template, final SubLObject parsing_mt) {
        final SubLObject fort = sm_scenario_fort(v_scenario);
        final SubLObject template_expr = sm_template_expression(template);
        final SubLObject param_subs = sm_template_param_subs(template);
        final SubLObject keywords = make_el_list(Mapping.mapcar(symbol_function(FIRST), param_subs), UNPROVIDED);
        final SubLObject indexical_formulas = make_el_list(Mapping.mapcar(symbol_function(NART_EL_FORMULA), Mapping.mapcar(symbol_function(SM_INDEXICAL_RECORD_INDEXICAL), Mapping.mapcar(symbol_function(SECOND), param_subs))), UNPROVIDED);
        rkf_assertion_utilities.rkf_scenario_assert(list($$termTemplate, $$ScenarioTemplate, template_expr, list($$ScenarioInstanceFn, fort, keywords, indexical_formulas)), parsing_mt);
        return NIL;
    }

    public static SubLObject sm_act_enumerate_saved_scenarios(final SubLObject storage_mt, final SubLObject parsing_mt) {
        final SubLObject scenarios = ask_utilities.ask_variable($SCENARIO, $list284, storage_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_bindings = fi.fi_ask_int($list285, parsing_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = scenarios;
        SubLObject v_scenario = NIL;
        v_scenario = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject binding = sm_enumerate_scenarios_identify_term_template(v_scenario, v_bindings);
            if (NIL != binding) {
                final SubLObject template_expr = assoc($sym232$_EXPR, binding, UNPROVIDED, UNPROVIDED).rest();
                final SubLObject unpacked = sm_enumerate_scenarios_unpack_template_expression(template_expr);
                tuples = cons(list(v_scenario, unpacked), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_scenario = cdolist_list_var.first();
        } 
        return tuples;
    }

    public static SubLObject sm_enumerate_scenarios_identify_term_template(final SubLObject v_scenario, final SubLObject v_bindings) {
        SubLObject found = NIL;
        if (NIL == found) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == found) && (NIL != csome_list_var)) {
                if (NIL != list_utilities.tree_find(v_scenario, binding, UNPROVIDED, UNPROVIDED)) {
                    found = binding;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return found;
    }

    public static SubLObject sm_enumerate_scenarios_unpack_template_expression(final SubLObject template_expression) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = template_expression;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (part.isString()) {
                if (NIL != result) {
                    result = cons($$$_, result);
                }
                result = cons(part, result);
            } else
                if ((NIL != el_formula_p(part)) && cycl_utilities.formula_arg0(part).eql($$OptionalSome)) {
                    result = cons(cycl_utilities.formula_arg1(part, UNPROVIDED), result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return apply(symbol_function(CCONCATENATE), nreverse(result));
    }

    public static SubLObject sm_act_discard_template(final SubLObject v_scenario, final SubLObject template) {
        sm_rem_scenario_template(v_scenario, template);
        sm_cleanup_template(template);
        return v_scenario;
    }

    public static SubLObject sm_act_compute_unused_indexicals(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_compute_unused_indexicals_memoized(v_scenario);
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_compute_unused_indexicals_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        SubLObject unused_indexicals = NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            SubLObject found = NIL;
            if (NIL == found) {
                SubLObject csome_list_var = constraint_records;
                SubLObject constraint_record = NIL;
                constraint_record = csome_list_var.first();
                while ((NIL == found) && (NIL != csome_list_var)) {
                    final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
                    if (NIL != cycl_utilities.expression_find(indexical, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        found = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint_record = csome_list_var.first();
                } 
            }
            if (NIL == found) {
                unused_indexicals = cons(indexical_record, unused_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return nreverse(unused_indexicals);
    }

    public static SubLObject sm_act_compute_unused_indexicals_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_compute_unused_indexicals_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_compute_unused_indexicals_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sm_act_compute_explicit_type_constraints(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_compute_explicit_type_constraints_memoized(indexical_record);
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_compute_explicit_type_constraints_memoized_internal(final SubLObject indexical_record) {
        final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
        SubLObject sentences = NIL;
        SubLObject cdolist_list_var = sm_indexical_record_explicit_isas(indexical_record);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = make_binary_formula($$isa, indexical, v_isa);
            sentences = cons(sentence, sentences);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = sm_indexical_record_explicit_genls(indexical_record);
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = make_binary_formula($$genls, indexical, genl);
            sentences = cons(sentence, sentences);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return nreverse(sentences);
    }

    public static SubLObject sm_act_compute_explicit_type_constraints_memoized(final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_compute_explicit_type_constraints_memoized_internal(indexical_record);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical_record, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_compute_explicit_type_constraints_memoized_internal(indexical_record)));
            memoization_state.caching_state_put(caching_state, indexical_record, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sm_act_compute_indexical_constraints(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_compute_indexical_constraints_memoized(v_scenario, indexical_record);
            } finally {
                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_compute_indexical_constraints_memoized_internal(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
        SubLObject mentioned = NIL;
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = NIL;
        constraint_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence = sm_constraint_record_sentence(constraint_record);
            if (NIL != cycl_utilities.expression_find(indexical, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                mentioned = cons(constraint_record, mentioned);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        } 
        return nreverse(mentioned);
    }

    public static SubLObject sm_act_compute_indexical_constraints_memoized(final SubLObject v_scenario, final SubLObject indexical_record) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_compute_indexical_constraints_memoized_internal(v_scenario, indexical_record);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_scenario, indexical_record);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_scenario.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && indexical_record.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_compute_indexical_constraints_memoized_internal(v_scenario, indexical_record)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_scenario, indexical_record));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sm_act_set_indexical_record_var(final SubLObject indexical_record, final SubLObject var) {
        return sm_set_indexical_record_var(indexical_record, var);
    }

    public static SubLObject sm_act_add_explicit_constraints(final SubLObject v_scenario, final SubLObject domain_mt, final SubLObject generation_mt) {
        SubLObject cdolist_list_var;
        final SubLObject indexical_records = cdolist_list_var = sm_scenario_terms(v_scenario);
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject isas = sm_indexical_record_isas(indexical_record);
            final SubLObject v_genls = sm_indexical_record_genls(indexical_record);
            SubLObject sentences = NIL;
            SubLObject cdolist_list_var_$17 = isas;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                final SubLObject sentence = make_binary_formula($$isa, indexical, v_isa);
                sentences = cons(sentence, sentences);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                v_isa = cdolist_list_var_$17.first();
            } 
            SubLObject cdolist_list_var_$18 = v_genls;
            SubLObject genl = NIL;
            genl = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                final SubLObject sentence = make_binary_formula($$genls, indexical, genl);
                sentences = cons(sentence, sentences);
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                genl = cdolist_list_var_$18.first();
            } 
            SubLObject cdolist_list_var_$19 = sentences;
            SubLObject sentence2 = NIL;
            sentence2 = cdolist_list_var_$19.first();
            while (NIL != cdolist_list_var_$19) {
                if (NIL == sm_redundant_constraintP(v_scenario, sentence2)) {
                    final SubLObject constraint_record = sm_new_constraint_record(UNPROVIDED);
                    sm_set_constraint_record_sentence(constraint_record, sentence2);
                    final SubLObject nl_sentence = sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
                    sm_set_constraint_record_nl_sentence(constraint_record, nl_sentence);
                    sm_add_scenario_constraint(v_scenario, constraint_record);
                }
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                sentence2 = cdolist_list_var_$19.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        sm_scenario_clear_all_memoization_state(v_scenario);
        return v_scenario;
    }

    public static SubLObject sm_redundant_constraintP(final SubLObject v_scenario, final SubLObject sentence) {
        final SubLObject constraint_records = sm_scenario_constraints(v_scenario);
        return member(sentence, constraint_records, symbol_function(EQUAL), symbol_function(SM_CONSTRAINT_RECORD_SENTENCE));
    }

    public static SubLObject sm_act_propose_sentence_adjustments(final SubLObject v_scenario, final SubLObject cycl_sentence, final SubLObject domain_mt) {
        if (NIL != gafP(cycl_sentence)) {
            return sm_propose_gaf_sentence_adjustments(v_scenario, cycl_sentence, domain_mt);
        }
        return NIL;
    }

    public static SubLObject sm_propose_gaf_sentence_adjustments(final SubLObject v_scenario, final SubLObject cycl_sentence, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject arg_choices = NIL;
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            thread.resetMultipleValues();
            final SubLObject relation_isas = at_utilities.term_position_requires_types_in_relation(cons(argnum, NIL), cycl_sentence, domain_mt);
            final SubLObject relation_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject argnum_choices = list(arg);
            SubLObject cdolist_list_var_$20 = indexical_records;
            SubLObject indexical_record = NIL;
            indexical_record = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                final SubLObject isas = list_utilities.flatten(sm_indexical_record_isas(indexical_record));
                final SubLObject v_genls = list_utilities.flatten(sm_indexical_record_genls(indexical_record));
                if ((NIL == sm_identify_violating_collection_pair(isas, relation_isas, domain_mt)) && (NIL == sm_identify_violating_collection_pair(v_genls, relation_genls, domain_mt))) {
                    final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
                    argnum_choices = cons(indexical, argnum_choices);
                }
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                indexical_record = cdolist_list_var_$20.first();
            } 
            arg_choices = cons(cons(argnum, argnum_choices), arg_choices);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return arg_choices;
    }

    public static SubLObject sm_act_construct_indexical_table(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        return sm_act_construct_indexical_table_from_indexical_records(indexical_records);
    }

    public static SubLObject sm_act_construct_indexical_table_from_indexical_records(final SubLObject indexical_records) {
        SubLObject table = NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            SubLObject cdolist_list_var_$21;
            final SubLObject phrases = cdolist_list_var_$21 = sm_indexical_record_phrases(indexical_record);
            SubLObject phrase = NIL;
            phrase = cdolist_list_var_$21.first();
            while (NIL != cdolist_list_var_$21) {
                table = cons(cons(indexical, phrase), table);
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                phrase = cdolist_list_var_$21.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject sm_act_construct_indexical_constraint_table(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject v_memoization_state = local_state = sm_scenario_memoization_state(v_scenario);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                results = sm_act_construct_indexical_constraint_table_memoized(v_scenario);
            } finally {
                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject sm_act_construct_indexical_constraint_table_memoized_internal(final SubLObject v_scenario) {
        final SubLObject indexical_records = sm_scenario_terms(v_scenario);
        SubLObject table = NIL;
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = NIL;
        indexical_record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject indexical = sm_indexical_record_indexical(indexical_record);
            final SubLObject isas = sm_indexical_record_isas(indexical_record);
            final SubLObject v_genls = sm_indexical_record_genls(indexical_record);
            table = cons(list(indexical, isas, v_genls), table);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject sm_act_construct_indexical_constraint_table_memoized(final SubLObject v_scenario) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sm_act_construct_indexical_constraint_table_memoized_internal(v_scenario);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_scenario, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sm_act_construct_indexical_constraint_table_memoized_internal(v_scenario)));
            memoization_state.caching_state_put(caching_state, v_scenario, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_rkf_scenario_manipulator_file() {
        declareMacro(me, "with_sm_lock", "WITH-SM-LOCK");
        declareFunction(me, "sm_find_scenario_by_id", "SM-FIND-SCENARIO-BY-ID", 1, 0, false);
        declareFunction(me, "sm_find_scenario_by_id_string", "SM-FIND-SCENARIO-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sm_find_template_by_id", "SM-FIND-TEMPLATE-BY-ID", 1, 0, false);
        declareFunction(me, "sm_find_template_by_id_string", "SM-FIND-TEMPLATE-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sm_find_indexical_record_by_id", "SM-FIND-INDEXICAL-RECORD-BY-ID", 1, 0, false);
        declareFunction(me, "sm_find_indexical_record_by_id_string", "SM-FIND-INDEXICAL-RECORD-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sm_find_constraint_record_by_id", "SM-FIND-CONSTRAINT-RECORD-BY-ID", 1, 0, false);
        declareFunction(me, "sm_find_constraint_record_by_id_string", "SM-FIND-CONSTRAINT-RECORD-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "sm_find_merge_info_by_id", "SM-FIND-MERGE-INFO-BY-ID", 1, 0, false);
        declareFunction(me, "sm_find_merge_info_by_id_string", "SM-FIND-MERGE-INFO-BY-ID-STRING", 1, 0, false);
        declareFunction(me, "next_sm_id", "NEXT-SM-ID", 0, 0, false);
        declareFunction(me, "sm_add_object", "SM-ADD-OBJECT", 2, 0, false);
        declareFunction(me, "sm_rem_object", "SM-REM-OBJECT", 1, 0, false);
        declareFunction(me, "sm_find_object_by_id", "SM-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction(me, "sm_scenario_print_function_trampoline", "SM-SCENARIO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sm_scenario_p", "SM-SCENARIO-P", 1, 0, false);
        new rkf_scenario_manipulator.$sm_scenario_p$UnaryFunction();
        declareFunction(me, "sm_scenario_id", "SM-SCENARIO-ID", 1, 0, false);
        declareFunction(me, "sm_scenario_sessions", "SM-SCENARIO-SESSIONS", 1, 0, false);
        declareFunction(me, "sm_scenario_phrase", "SM-SCENARIO-PHRASE", 1, 0, false);
        declareFunction(me, "sm_scenario_candidate_terms", "SM-SCENARIO-CANDIDATE-TERMS", 1, 0, false);
        declareFunction(me, "sm_scenario_candidate_constraints", "SM-SCENARIO-CANDIDATE-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "sm_scenario_fort", "SM-SCENARIO-FORT", 1, 0, false);
        declareFunction(me, "sm_scenario_terms", "SM-SCENARIO-TERMS", 1, 0, false);
        declareFunction(me, "sm_scenario_constraints", "SM-SCENARIO-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "sm_scenario_templates", "SM-SCENARIO-TEMPLATES", 1, 0, false);
        declareFunction(me, "sm_scenario_state", "SM-SCENARIO-STATE", 1, 0, false);
        declareFunction(me, "_csetf_sm_scenario_id", "_CSETF-SM-SCENARIO-ID", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_sessions", "_CSETF-SM-SCENARIO-SESSIONS", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_phrase", "_CSETF-SM-SCENARIO-PHRASE", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_candidate_terms", "_CSETF-SM-SCENARIO-CANDIDATE-TERMS", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_candidate_constraints", "_CSETF-SM-SCENARIO-CANDIDATE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_fort", "_CSETF-SM-SCENARIO-FORT", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_terms", "_CSETF-SM-SCENARIO-TERMS", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_constraints", "_CSETF-SM-SCENARIO-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_templates", "_CSETF-SM-SCENARIO-TEMPLATES", 2, 0, false);
        declareFunction(me, "_csetf_sm_scenario_state", "_CSETF-SM-SCENARIO-STATE", 2, 0, false);
        declareFunction(me, "make_sm_scenario", "MAKE-SM-SCENARIO", 0, 1, false);
        declareFunction(me, "visit_defstruct_sm_scenario", "VISIT-DEFSTRUCT-SM-SCENARIO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sm_scenario_method", "VISIT-DEFSTRUCT-OBJECT-SM-SCENARIO-METHOD", 2, 0, false);
        declareFunction(me, "sm_new_scenario", "SM-NEW-SCENARIO", 0, 3, false);
        declareFunction(me, "sm_set_scenario_phrase", "SM-SET-SCENARIO-PHRASE", 2, 0, false);
        declareFunction(me, "sm_set_scenario_fort", "SM-SET-SCENARIO-FORT", 2, 0, false);
        declareFunction(me, "sm_add_scenario_candidate_terms", "SM-ADD-SCENARIO-CANDIDATE-TERMS", 2, 0, false);
        declareFunction(me, "sm_add_scenario_candidate_term", "SM-ADD-SCENARIO-CANDIDATE-TERM", 2, 0, false);
        declareFunction(me, "sm_rem_scenario_candidate_term", "SM-REM-SCENARIO-CANDIDATE-TERM", 2, 0, false);
        declareFunction(me, "sm_add_scenario_candidate_constraints", "SM-ADD-SCENARIO-CANDIDATE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "sm_add_scenario_candidate_constraint", "SM-ADD-SCENARIO-CANDIDATE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sm_rem_scenario_candidate_constraint", "SM-REM-SCENARIO-CANDIDATE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sm_add_scenario_term", "SM-ADD-SCENARIO-TERM", 2, 0, false);
        declareFunction(me, "sm_rem_scenario_term", "SM-REM-SCENARIO-TERM", 2, 0, false);
        declareFunction(me, "sm_add_scenario_constraint", "SM-ADD-SCENARIO-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sm_rem_scenario_constraint", "SM-REM-SCENARIO-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sm_add_scenario_template", "SM-ADD-SCENARIO-TEMPLATE", 2, 0, false);
        declareFunction(me, "sm_rem_scenario_template", "SM-REM-SCENARIO-TEMPLATE", 2, 0, false);
        declareFunction(me, "sm_cleanup_scenario", "SM-CLEANUP-SCENARIO", 1, 0, false);
        declareFunction(me, "sm_scenario_note_borrowed_indexical", "SM-SCENARIO-NOTE-BORROWED-INDEXICAL", 2, 0, false);
        declareFunction(me, "sm_scenario_borrowed_indexical_p", "SM-SCENARIO-BORROWED-INDEXICAL-P", 2, 0, false);
        declareFunction(me, "sm_scenario_return_borrowed_indexical", "SM-SCENARIO-RETURN-BORROWED-INDEXICAL", 2, 0, false);
        declareFunction(me, "sm_scenario_memoization_state", "SM-SCENARIO-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "sm_scenario_clear_all_memoization_state", "SM-SCENARIO-CLEAR-ALL-MEMOIZATION-STATE", 1, 0, false);
        declareMacro(me, "with_scenario_memoization_state", "WITH-SCENARIO-MEMOIZATION-STATE");
        declareFunction(me, "sm_template_print_function_trampoline", "SM-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sm_template_p", "SM-TEMPLATE-P", 1, 0, false);
        new rkf_scenario_manipulator.$sm_template_p$UnaryFunction();
        declareFunction(me, "sm_template_id", "SM-TEMPLATE-ID", 1, 0, false);
        declareFunction(me, "sm_template_scenario", "SM-TEMPLATE-SCENARIO", 1, 0, false);
        declareFunction(me, "sm_template_phrase", "SM-TEMPLATE-PHRASE", 1, 0, false);
        declareFunction(me, "sm_template_expression", "SM-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction(me, "sm_template_param_subs", "SM-TEMPLATE-PARAM-SUBS", 1, 0, false);
        declareFunction(me, "sm_template_parameters", "SM-TEMPLATE-PARAMETERS", 1, 0, false);
        declareFunction(me, "sm_template_constraints", "SM-TEMPLATE-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "sm_template_state", "SM-TEMPLATE-STATE", 1, 0, false);
        declareFunction(me, "_csetf_sm_template_id", "_CSETF-SM-TEMPLATE-ID", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_scenario", "_CSETF-SM-TEMPLATE-SCENARIO", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_phrase", "_CSETF-SM-TEMPLATE-PHRASE", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_expression", "_CSETF-SM-TEMPLATE-EXPRESSION", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_param_subs", "_CSETF-SM-TEMPLATE-PARAM-SUBS", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_parameters", "_CSETF-SM-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_constraints", "_CSETF-SM-TEMPLATE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "_csetf_sm_template_state", "_CSETF-SM-TEMPLATE-STATE", 2, 0, false);
        declareFunction(me, "make_sm_template", "MAKE-SM-TEMPLATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_sm_template", "VISIT-DEFSTRUCT-SM-TEMPLATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sm_template_method", "VISIT-DEFSTRUCT-OBJECT-SM-TEMPLATE-METHOD", 2, 0, false);
        declareFunction(me, "sm_new_template", "SM-NEW-TEMPLATE", 1, 0, false);
        declareFunction(me, "sm_set_template_expression", "SM-SET-TEMPLATE-EXPRESSION", 2, 0, false);
        declareFunction(me, "sm_set_template_param_subs", "SM-SET-TEMPLATE-PARAM-SUBS", 2, 0, false);
        declareFunction(me, "sm_set_template_parameters", "SM-SET-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction(me, "sm_set_template_phrase", "SM-SET-TEMPLATE-PHRASE", 2, 0, false);
        declareFunction(me, "sm_add_template_constraint", "SM-ADD-TEMPLATE-CONSTRAINT", 2, 0, false);
        declareFunction(me, "sm_cleanup_template", "SM-CLEANUP-TEMPLATE", 1, 0, false);
        declareFunction(me, "sm_scenario_spec_p", "SM-SCENARIO-SPEC-P", 1, 0, false);
        declareFunction(me, "sm_new_scenario_spec", "SM-NEW-SCENARIO-SPEC", 2, 0, false);
        declareFunction(me, "sm_scenario_spec_fort", "SM-SCENARIO-SPEC-FORT", 1, 0, false);
        declareFunction(me, "sm_scenario_spec_substitutions", "SM-SCENARIO-SPEC-SUBSTITUTIONS", 1, 0, false);
        declareFunction(me, "sm_substitution_list_p", "SM-SUBSTITUTION-LIST-P", 1, 0, false);
        declareFunction(me, "sm_substitution_p", "SM-SUBSTITUTION-P", 1, 0, false);
        declareFunction(me, "sm_get_standin_for_indexical", "SM-GET-STANDIN-FOR-INDEXICAL", 2, 0, false);
        declareFunction(me, "sm_scenario_expression_p", "SM-SCENARIO-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "sm_scenario_expression_fort", "SM-SCENARIO-EXPRESSION-FORT", 1, 0, false);
        declareFunction(me, "sm_scenario_expression_cyc_terms", "SM-SCENARIO-EXPRESSION-CYC-TERMS", 1, 0, false);
        declareFunction(me, "sm_scenario_expression_indexical_nauts", "SM-SCENARIO-EXPRESSION-INDEXICAL-NAUTS", 1, 0, false);
        declareFunction(me, "sm_indexical_record_print_function_trampoline", "SM-INDEXICAL-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sm_indexical_record_p", "SM-INDEXICAL-RECORD-P", 1, 0, false);
        new rkf_scenario_manipulator.$sm_indexical_record_p$UnaryFunction();
        declareFunction(me, "sm_indexical_record_id", "SM-INDEXICAL-RECORD-ID", 1, 0, false);
        declareFunction(me, "sm_indexical_record_indexical", "SM-INDEXICAL-RECORD-INDEXICAL", 1, 0, false);
        declareFunction(me, "sm_indexical_record_phrases", "SM-INDEXICAL-RECORD-PHRASES", 1, 0, false);
        declareFunction(me, "sm_indexical_record_var", "SM-INDEXICAL-RECORD-VAR", 1, 0, false);
        declareFunction(me, "sm_indexical_record_explicit_isas", "SM-INDEXICAL-RECORD-EXPLICIT-ISAS", 1, 0, false);
        declareFunction(me, "sm_indexical_record_explicit_genls", "SM-INDEXICAL-RECORD-EXPLICIT-GENLS", 1, 0, false);
        declareFunction(me, "sm_indexical_record_isas", "SM-INDEXICAL-RECORD-ISAS", 1, 0, false);
        declareFunction(me, "sm_indexical_record_genls", "SM-INDEXICAL-RECORD-GENLS", 1, 0, false);
        declareFunction(me, "sm_indexical_record_state", "SM-INDEXICAL-RECORD-STATE", 1, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_id", "_CSETF-SM-INDEXICAL-RECORD-ID", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_indexical", "_CSETF-SM-INDEXICAL-RECORD-INDEXICAL", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_phrases", "_CSETF-SM-INDEXICAL-RECORD-PHRASES", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_var", "_CSETF-SM-INDEXICAL-RECORD-VAR", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_explicit_isas", "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_explicit_genls", "_CSETF-SM-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_isas", "_CSETF-SM-INDEXICAL-RECORD-ISAS", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_genls", "_CSETF-SM-INDEXICAL-RECORD-GENLS", 2, 0, false);
        declareFunction(me, "_csetf_sm_indexical_record_state", "_CSETF-SM-INDEXICAL-RECORD-STATE", 2, 0, false);
        declareFunction(me, "make_sm_indexical_record", "MAKE-SM-INDEXICAL-RECORD", 0, 1, false);
        declareFunction(me, "visit_defstruct_sm_indexical_record", "VISIT-DEFSTRUCT-SM-INDEXICAL-RECORD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sm_indexical_record_method", "VISIT-DEFSTRUCT-OBJECT-SM-INDEXICAL-RECORD-METHOD", 2, 0, false);
        declareFunction(me, "sm_new_indexical_record", "SM-NEW-INDEXICAL-RECORD", 0, 4, false);
        declareFunction(me, "sm_set_indexical_record_indexical", "SM-SET-INDEXICAL-RECORD-INDEXICAL", 2, 0, false);
        declareFunction(me, "sm_set_indexical_record_phrases", "SM-SET-INDEXICAL-RECORD-PHRASES", 2, 0, false);
        declareFunction(me, "sm_add_indexical_phrase", "SM-ADD-INDEXICAL-PHRASE", 2, 0, false);
        declareFunction(me, "sm_rem_indexical_phrase", "SM-REM-INDEXICAL-PHRASE", 2, 0, false);
        declareFunction(me, "sm_set_indexical_record_var", "SM-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        declareFunction(me, "sm_set_indexical_record_explicit_isas", "SM-SET-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false);
        declareFunction(me, "sm_set_indexical_record_explicit_genls", "SM-SET-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false);
        declareFunction(me, "sm_set_indexical_record_isas", "SM-SET-INDEXICAL-RECORD-ISAS", 2, 0, false);
        declareFunction(me, "sm_set_indexical_record_genls", "SM-SET-INDEXICAL-RECORD-GENLS", 2, 0, false);
        declareFunction(me, "sm_cleanup_indexical_record", "SM-CLEANUP-INDEXICAL-RECORD", 1, 0, false);
        declareFunction(me, "sm_indexical_record_preferred_phrase", "SM-INDEXICAL-RECORD-PREFERRED-PHRASE", 1, 0, false);
        declareFunction(me, "sm_copy_indexical_record_for_scenario", "SM-COPY-INDEXICAL-RECORD-FOR-SCENARIO", 2, 0, false);
        declareFunction(me, "sm_indexical_record_type", "SM-INDEXICAL-RECORD-TYPE", 1, 0, false);
        declareFunction(me, "sm_indexical_record_number", "SM-INDEXICAL-RECORD-NUMBER", 1, 0, false);
        declareFunction(me, "sm_update_indexical_record_explicit_isas", "SM-UPDATE-INDEXICAL-RECORD-EXPLICIT-ISAS", 2, 0, false);
        declareFunction(me, "sm_update_indexical_record_explicit_genls", "SM-UPDATE-INDEXICAL-RECORD-EXPLICIT-GENLS", 2, 0, false);
        declareFunction(me, "sm_indexical_p", "SM-INDEXICAL-P", 1, 0, false);
        declareFunction(me, "sm_new_indexical", "SM-NEW-INDEXICAL", 2, 0, false);
        declareFunction(me, "sm_indexical_type", "SM-INDEXICAL-TYPE", 1, 0, false);
        declareFunction(me, "sm_indexical_number", "SM-INDEXICAL-NUMBER", 1, 0, false);
        declareFunction(me, "sm_indexical_of_scenarioP", "SM-INDEXICAL-OF-SCENARIO?", 2, 0, false);
        declareFunction(me, "sm_indexical_record_of_indexical", "SM-INDEXICAL-RECORD-OF-INDEXICAL", 2, 0, false);
        declareFunction(me, "sm_constraint_record_print_function_trampoline", "SM-CONSTRAINT-RECORD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sm_constraint_record_p", "SM-CONSTRAINT-RECORD-P", 1, 0, false);
        new rkf_scenario_manipulator.$sm_constraint_record_p$UnaryFunction();
        declareFunction(me, "sm_constraint_record_id", "SM-CONSTRAINT-RECORD-ID", 1, 0, false);
        declareFunction(me, "sm_constraint_record_sentence", "SM-CONSTRAINT-RECORD-SENTENCE", 1, 0, false);
        declareFunction(me, "sm_constraint_record_nl_sentence", "SM-CONSTRAINT-RECORD-NL-SENTENCE", 1, 0, false);
        declareFunction(me, "_csetf_sm_constraint_record_id", "_CSETF-SM-CONSTRAINT-RECORD-ID", 2, 0, false);
        declareFunction(me, "_csetf_sm_constraint_record_sentence", "_CSETF-SM-CONSTRAINT-RECORD-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_sm_constraint_record_nl_sentence", "_CSETF-SM-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false);
        declareFunction(me, "make_sm_constraint_record", "MAKE-SM-CONSTRAINT-RECORD", 0, 1, false);
        declareFunction(me, "visit_defstruct_sm_constraint_record", "VISIT-DEFSTRUCT-SM-CONSTRAINT-RECORD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sm_constraint_record_method", "VISIT-DEFSTRUCT-OBJECT-SM-CONSTRAINT-RECORD-METHOD", 2, 0, false);
        declareFunction(me, "sm_new_constraint_record", "SM-NEW-CONSTRAINT-RECORD", 0, 1, false);
        declareFunction(me, "sm_set_constraint_record_sentence", "SM-SET-CONSTRAINT-RECORD-SENTENCE", 2, 0, false);
        declareFunction(me, "sm_set_constraint_record_nl_sentence", "SM-SET-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false);
        declareFunction(me, "sm_rem_constraint_record_nl_sentence", "SM-REM-CONSTRAINT-RECORD-NL-SENTENCE", 2, 0, false);
        declareFunction(me, "sm_cleanup_constraint_record", "SM-CLEANUP-CONSTRAINT-RECORD", 1, 0, false);
        declareFunction(me, "sm_term_p", "SM-TERM-P", 1, 0, false);
        declareFunction(me, "sm_merge_info_print_function_trampoline", "SM-MERGE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sm_merge_info_p", "SM-MERGE-INFO-P", 1, 0, false);
        new rkf_scenario_manipulator.$sm_merge_info_p$UnaryFunction();
        declareFunction(me, "sm_merge_info_id", "SM-MERGE-INFO-ID", 1, 0, false);
        declareFunction(me, "sm_merge_info_from_scenario", "SM-MERGE-INFO-FROM-SCENARIO", 1, 0, false);
        declareFunction(me, "sm_merge_info_to_scenario", "SM-MERGE-INFO-TO-SCENARIO", 1, 0, false);
        declareFunction(me, "sm_merge_info_align_to", "SM-MERGE-INFO-ALIGN-TO", 1, 0, false);
        declareFunction(me, "sm_merge_info_align_from", "SM-MERGE-INFO-ALIGN-FROM", 1, 0, false);
        declareFunction(me, "sm_merge_info_indexical_equivalences", "SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 1, 0, false);
        declareFunction(me, "_csetf_sm_merge_info_id", "_CSETF-SM-MERGE-INFO-ID", 2, 0, false);
        declareFunction(me, "_csetf_sm_merge_info_from_scenario", "_CSETF-SM-MERGE-INFO-FROM-SCENARIO", 2, 0, false);
        declareFunction(me, "_csetf_sm_merge_info_to_scenario", "_CSETF-SM-MERGE-INFO-TO-SCENARIO", 2, 0, false);
        declareFunction(me, "_csetf_sm_merge_info_align_to", "_CSETF-SM-MERGE-INFO-ALIGN-TO", 2, 0, false);
        declareFunction(me, "_csetf_sm_merge_info_align_from", "_CSETF-SM-MERGE-INFO-ALIGN-FROM", 2, 0, false);
        declareFunction(me, "_csetf_sm_merge_info_indexical_equivalences", "_CSETF-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 2, 0, false);
        declareFunction(me, "make_sm_merge_info", "MAKE-SM-MERGE-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_sm_merge_info", "VISIT-DEFSTRUCT-SM-MERGE-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sm_merge_info_method", "VISIT-DEFSTRUCT-OBJECT-SM-MERGE-INFO-METHOD", 2, 0, false);
        declareFunction(me, "sm_new_merge_info", "SM-NEW-MERGE-INFO", 0, 0, false);
        declareFunction(me, "sm_cleanup_merge_info", "SM-CLEANUP-MERGE-INFO", 1, 0, false);
        declareFunction(me, "sm_set_merge_info_from_scenario", "SM-SET-MERGE-INFO-FROM-SCENARIO", 2, 0, false);
        declareFunction(me, "sm_set_merge_info_to_scenario", "SM-SET-MERGE-INFO-TO-SCENARIO", 2, 0, false);
        declareFunction(me, "sm_set_merge_info_align_to", "SM-SET-MERGE-INFO-ALIGN-TO", 2, 0, false);
        declareFunction(me, "sm_set_merge_info_align_from", "SM-SET-MERGE-INFO-ALIGN-FROM", 2, 0, false);
        declareFunction(me, "update_sm_merge_info_indexical_equivalences", "UPDATE-SM-MERGE-INFO-INDEXICAL-EQUIVALENCES", 1, 0, false);
        declareFunction(me, "sm_gen_point_print_function_trampoline", "SM-GEN-POINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sm_gen_point_p", "SM-GEN-POINT-P", 1, 0, false);
        new rkf_scenario_manipulator.$sm_gen_point_p$UnaryFunction();
        declareFunction(me, "sm_gen_point_id", "SM-GEN-POINT-ID", 1, 0, false);
        declareFunction(me, "sm_gen_point_non_indexical", "SM-GEN-POINT-NON-INDEXICAL", 1, 0, false);
        declareFunction(me, "sm_gen_point_isas", "SM-GEN-POINT-ISAS", 1, 0, false);
        declareFunction(me, "sm_gen_point_genls", "SM-GEN-POINT-GENLS", 1, 0, false);
        declareFunction(me, "sm_gen_point_positions", "SM-GEN-POINT-POSITIONS", 1, 0, false);
        declareFunction(me, "sm_gen_point_indexical_record", "SM-GEN-POINT-INDEXICAL-RECORD", 1, 0, false);
        declareFunction(me, "sm_gen_point_keyword", "SM-GEN-POINT-KEYWORD", 1, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_id", "_CSETF-SM-GEN-POINT-ID", 2, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_non_indexical", "_CSETF-SM-GEN-POINT-NON-INDEXICAL", 2, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_isas", "_CSETF-SM-GEN-POINT-ISAS", 2, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_genls", "_CSETF-SM-GEN-POINT-GENLS", 2, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_positions", "_CSETF-SM-GEN-POINT-POSITIONS", 2, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_indexical_record", "_CSETF-SM-GEN-POINT-INDEXICAL-RECORD", 2, 0, false);
        declareFunction(me, "_csetf_sm_gen_point_keyword", "_CSETF-SM-GEN-POINT-KEYWORD", 2, 0, false);
        declareFunction(me, "make_sm_gen_point", "MAKE-SM-GEN-POINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sm_gen_point", "VISIT-DEFSTRUCT-SM-GEN-POINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sm_gen_point_method", "VISIT-DEFSTRUCT-OBJECT-SM-GEN-POINT-METHOD", 2, 0, false);
        declareFunction(me, "sm_new_gen_point", "SM-NEW-GEN-POINT", 1, 0, false);
        declareFunction(me, "sm_add_gen_point_isas", "SM-ADD-GEN-POINT-ISAS", 2, 0, false);
        declareFunction(me, "sm_add_gen_point_genls", "SM-ADD-GEN-POINT-GENLS", 2, 0, false);
        declareFunction(me, "sm_add_gen_point_position", "SM-ADD-GEN-POINT-POSITION", 2, 0, false);
        declareFunction(me, "sm_set_gen_point_indexical_record", "SM-SET-GEN-POINT-INDEXICAL-RECORD", 2, 0, false);
        declareFunction(me, "sm_grab_or_compute_gen_point_keyword", "SM-GRAB-OR-COMPUTE-GEN-POINT-KEYWORD", 1, 0, false);
        declareFunction(me, "sm_best_gen_point_type", "SM-BEST-GEN-POINT-TYPE", 1, 0, false);
        declareFunction(me, "sm_cleanup_gen_point", "SM-CLEANUP-GEN-POINT", 1, 0, false);
        declareFunction(me, "sm_simple_compute_and_set_indexical_phrase", "SM-SIMPLE-COMPUTE-AND-SET-INDEXICAL-PHRASE", 1, 0, false);
        declareFunction(me, "sm_choose_optimal_genls", "SM-CHOOSE-OPTIMAL-GENLS", 1, 0, false);
        declareFunction(me, "sm_choose_optimal_isa", "SM-CHOOSE-OPTIMAL-ISA", 1, 0, false);
        declareFunction(me, "sm_scenario_indexical_records_of_type", "SM-SCENARIO-INDEXICAL-RECORDS-OF-TYPE", 3, 1, false);
        declareFunction(me, "sm_number_indexical_phrases", "SM-NUMBER-INDEXICAL-PHRASES", 3, 0, false);
        declareFunction(me, "sm_uniquify_two_indexical_records", "SM-UNIQUIFY-TWO-INDEXICAL-RECORDS", 3, 0, false);
        declareFunction(me, "sm_number_one_indexical_phrase", "SM-NUMBER-ONE-INDEXICAL-PHRASE", 4, 0, false);
        declareFunction(me, "sm_generate_indexical_phrases_for_scenario", "SM-GENERATE-INDEXICAL-PHRASES-FOR-SCENARIO", 1, 1, false);
        declareFunction(me, "sm_act_read_scenario", "SM-ACT-READ-SCENARIO", 3, 0, false);
        declareFunction(me, "sm_retrieve_scenario_fort_indexical_records", "SM-RETRIEVE-SCENARIO-FORT-INDEXICAL-RECORDS", 3, 0, false);
        declareFunction(me, "sm_retrieve_scenario_terms_for_scenario", "SM-RETRIEVE-SCENARIO-TERMS-FOR-SCENARIO", 2, 0, false);
        declareFunction(me, "sm_retrieve_scenario_referents_for_scenario", "SM-RETRIEVE-SCENARIO-REFERENTS-FOR-SCENARIO", 3, 0, false);
        declareFunction(me, "sm_retrieve_scenario_fort_constraint_records", "SM-RETRIEVE-SCENARIO-FORT-CONSTRAINT-RECORDS", 3, 0, false);
        declareFunction(me, "sm_substitute_terms_for_indexicals", "SM-SUBSTITUTE-TERMS-FOR-INDEXICALS", 2, 0, false);
        declareFunction(me, "sm_act_suggest_scenarios", "SM-ACT-SUGGEST-SCENARIOS", 3, 0, false);
        declareFunction(me, "sm_extract_candidate_scenario_expressions", "SM-EXTRACT-CANDIDATE-SCENARIO-EXPRESSIONS", 3, 0, false);
        declareFunction(me, "sm_act_initialize_scenario_from_expression", "SM-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 4, 0, false);
        declareFunction(me, "sm_scenario_expression_ok", "SM-SCENARIO-EXPRESSION-OK", 1, 1, false);
        declareFunction(me, "sm_el_wftP", "SM-EL-WFT?", 2, 0, false);
        declareFunction(me, "sm_scenario_constraints_wffP", "SM-SCENARIO-CONSTRAINTS-WFF?", 2, 0, false);
        declareFunction(me, "sm_fetch_scenario_phrase", "SM-FETCH-SCENARIO-PHRASE", 2, 0, false);
        declareFunction(me, "sm_act_initialize_scenario_from_cycl", "SM-ACT-INITIALIZE-SCENARIO-FROM-CYCL", 3, 0, false);
        declareFunction(me, "sm_extract_cycl_sentence_vars", "SM-EXTRACT-CYCL-SENTENCE-VARS", 1, 0, false);
        declareFunction(me, "sm_extract_types_for_var", "SM-EXTRACT-TYPES-FOR-VAR", 2, 0, false);
        declareFunction(me, "sm_extract_cycl_sentence_constraints", "SM-EXTRACT-CYCL-SENTENCE-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "sm_atomic_sentenceP", "SM-ATOMIC-SENTENCE?", 1, 1, false);
        declareFunction(me, "sm_negated_atomic_sentenceP", "SM-NEGATED-ATOMIC-SENTENCE?", 1, 1, false);
        declareFunction(me, "sm_act_suggest_new_indexical_type", "SM-ACT-SUGGEST-NEW-INDEXICAL-TYPE", 3, 0, false);
        declareFunction(me, "sm_act_add_new_indexical", "SM-ACT-ADD-NEW-INDEXICAL", 4, 0, false);
        declareFunction(me, "sm_act_share_scenario_term", "SM-ACT-SHARE-SCENARIO-TERM", 2, 0, false);
        declareFunction(me, "sm_get_next_indexical_number_of_type", "SM-GET-NEXT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false);
        declareFunction(me, "sm_extract_entire_parses_of_type", "SM-EXTRACT-ENTIRE-PARSES-OF-TYPE", 3, 0, false);
        declareFunction(me, "sm_act_find_indexical", "SM-ACT-FIND-INDEXICAL", 2, 1, false);
        declareFunction(me, "sm_act_suggest_differences", "SM-ACT-SUGGEST-DIFFERENCES", 3, 0, false);
        declareFunction(me, "sm_indexical_record_get_collections", "SM-INDEXICAL-RECORD-GET-COLLECTIONS", 1, 0, false);
        declareFunction(me, "sm_act_distinguish_indexicals", "SM-ACT-DISTINGUISH-INDEXICALS", 4, 0, false);
        declareFunction(me, "sm_act_remove_indexical", "SM-ACT-REMOVE-INDEXICAL", 3, 0, false);
        declareFunction(me, "sm_remove_dependent_constraints", "SM-REMOVE-DEPENDENT-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "sm_act_add_indexical_phrase", "SM-ACT-ADD-INDEXICAL-PHRASE", 3, 0, false);
        declareFunction(me, "sm_act_remove_indexical_phrase", "SM-ACT-REMOVE-INDEXICAL-PHRASE", 3, 0, false);
        declareFunction(me, "sm_act_gather_all_preferred_indexical_phrases", "SM-ACT-GATHER-ALL-PREFERRED-INDEXICAL-PHRASES", 1, 0, false);
        declareFunction(me, "sm_act_resolve_phrase_to_term", "SM-ACT-RESOLVE-PHRASE-TO-TERM", 2, 0, false);
        declareFunction(me, "sm_act_remove_isaXgenls_constraint", "SM-ACT-REMOVE-ISA/GENLS-CONSTRAINT", 4, 1, false);
        declareFunction(me, "sm_act_get_all_isas_for_indexicals", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS", 1, 0, false);
        declareFunction(me, "sm_act_get_all_isas_for_indexicals_memoized_internal", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "sm_act_get_all_isas_for_indexicals_memoized", "SM-ACT-GET-ALL-ISAS-FOR-INDEXICALS-MEMOIZED", 1, 0, false);
        declareFunction(me, "sm_act_get_all_genls_for_indexicals", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS", 1, 0, false);
        declareFunction(me, "sm_act_get_all_genls_for_indexicals_memoized_internal", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "sm_act_get_all_genls_for_indexicals_memoized", "SM-ACT-GET-ALL-GENLS-FOR-INDEXICALS-MEMOIZED", 1, 0, false);
        declareFunction(me, "sm_act_suggest_constraint_cycl_from_text", "SM-ACT-SUGGEST-CONSTRAINT-CYCL-FROM-TEXT", 3, 1, false);
        declareFunction(me, "sm_act_add_scenario_constraint", "SM-ACT-ADD-SCENARIO-CONSTRAINT", 3, 0, false);
        declareFunction(me, "sm_indexical_parse_substitute", "SM-INDEXICAL-PARSE-SUBSTITUTE", 2, 0, false);
        declareFunction(me, "sm_unresolved_item_for_phrase", "SM-UNRESOLVED-ITEM-FOR-PHRASE", 2, 0, false);
        declareFunction(me, "sm_unresolved_equal", "SM-UNRESOLVED-EQUAL", 2, 0, false);
        declareFunction(me, "sm_subphrase", "SM-SUBPHRASE", 2, 0, false);
        declareFunction(me, "sm_parse_result_substitute", "SM-PARSE-RESULT-SUBSTITUTE", 3, 0, false);
        declareFunction(me, "sm_sentence_ok_for_scenarioP", "SM-SENTENCE-OK-FOR-SCENARIO?", 3, 0, false);
        declareFunction(me, "sm_term_requires_types_in_relation", "SM-TERM-REQUIRES-TYPES-IN-RELATION", 3, 0, false);
        declareFunction(me, "sm_term_requires_types_in_relations", "SM-TERM-REQUIRES-TYPES-IN-RELATIONS", 3, 0, false);
        declareFunction(me, "sm_identify_violating_collection_pair", "SM-IDENTIFY-VIOLATING-COLLECTION-PAIR", 3, 0, false);
        declareFunction(me, "sm_compute_current_indexical_isas_genls", "SM-COMPUTE-CURRENT-INDEXICAL-ISAS-GENLS", 2, 0, false);
        declareFunction(me, "sm_scenario_type_constraints_on_term", "SM-SCENARIO-TYPE-CONSTRAINTS-ON-TERM", 3, 0, false);
        declareFunction(me, "sm_act_remove_constraint", "SM-ACT-REMOVE-CONSTRAINT", 3, 0, false);
        declareFunction(me, "sm_act_remove_all_constraints", "SM-ACT-REMOVE-ALL-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "sm_act_remove_many_constraints", "SM-ACT-REMOVE-MANY-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "sm_act_import_constraint", "SM-ACT-IMPORT-CONSTRAINT", 3, 0, false);
        declareFunction(me, "sm_act_gather_constraint_formulas", "SM-ACT-GATHER-CONSTRAINT-FORMULAS", 1, 0, false);
        declareFunction(me, "sm_act_gather_constraint_formulas_memoized_internal", "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "sm_act_gather_constraint_formulas_memoized", "SM-ACT-GATHER-CONSTRAINT-FORMULAS-MEMOIZED", 1, 0, false);
        declareFunction(me, "sm_act_modify_phrase", "SM-ACT-MODIFY-PHRASE", 2, 0, false);
        declareFunction(me, "sm_act_constraint_record_nl_sentence", "SM-ACT-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        declareFunction(me, "sm_compute_one_constraint_record_nl_sentence", "SM-COMPUTE-ONE-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        declareFunction(me, "sm_compute_constraint_record_nl_sentence", "SM-COMPUTE-CONSTRAINT-RECORD-NL-SENTENCE", 4, 0, false);
        declareFunction(me, "sm_substitute_phrases_for_indexicals", "SM-SUBSTITUTE-PHRASES-FOR-INDEXICALS", 2, 0, false);
        declareFunction(me, "sm_act_merge_scenarios", "SM-ACT-MERGE-SCENARIOS", 3, 0, false);
        declareFunction(me, "sm_merge_substitute_indexical_equivalences_in_sentence", "SM-MERGE-SUBSTITUTE-INDEXICAL-EQUIVALENCES-IN-SENTENCE", 2, 0, false);
        declareFunction(me, "sm_merge_replace_non_equivalent_indexical", "SM-MERGE-REPLACE-NON-EQUIVALENT-INDEXICAL", 4, 0, false);
        declareFunction(me, "sm_ensure_new_indexical_number_of_type", "SM-ENSURE-NEW-INDEXICAL-NUMBER-OF-TYPE", 3, 0, false);
        declareFunction(me, "sm_act_generalize_scenario", "SM-ACT-GENERALIZE-SCENARIO", 3, 0, false);
        declareFunction(me, "sm_act_generalize_scenario_with_gen_points", "SM-ACT-GENERALIZE-SCENARIO-WITH-GEN-POINTS", 4, 0, false);
        declareFunction(me, "sm_act_compute_scenario_generalization_points", "SM-ACT-COMPUTE-SCENARIO-GENERALIZATION-POINTS", 2, 0, false);
        declareFunction(me, "sm_all_phrases_for_term", "SM-ALL-PHRASES-FOR-TERM", 1, 0, false);
        declareFunction(me, "sm_non_indexicals_of_constraints", "SM-NON-INDEXICALS-OF-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "sm_gen_point_without_positions_p", "SM-GEN-POINT-WITHOUT-POSITIONS-P", 1, 0, false);
        declareFunction(me, "sm_compute_template_expr_from_generalization_points", "SM-COMPUTE-TEMPLATE-EXPR-FROM-GENERALIZATION-POINTS", 3, 0, false);
        declareFunction(me, "sm_gen_point_starting_at", "SM-GEN-POINT-STARTING-AT", 2, 0, false);
        declareFunction(me, "sm_best_gen_point_sequence", "SM-BEST-GEN-POINT-SEQUENCE", 1, 0, false);
        declareFunction(me, "sm_template_type_for_gen_point", "SM-TEMPLATE-TYPE-FOR-GEN-POINT", 2, 0, false);
        declareFunction(me, "sm_template_type_for_collection", "SM-TEMPLATE-TYPE-FOR-COLLECTION", 2, 0, false);
        declareFunction(me, "sm_compute_template_param_subs_from_generalization_points", "SM-COMPUTE-TEMPLATE-PARAM-SUBS-FROM-GENERALIZATION-POINTS", 2, 0, false);
        declareFunction(me, "sm_construct_gen_point_indexical_record", "SM-CONSTRUCT-GEN-POINT-INDEXICAL-RECORD", 3, 0, false);
        declareFunction(me, "sm_get_next_gen_point_indexical_number_of_type", "SM-GET-NEXT-GEN-POINT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false);
        declareFunction(me, "sm_generalize_scenario_constraints", "SM-GENERALIZE-SCENARIO-CONSTRAINTS", 5, 0, false);
        declareFunction(me, "sm_apply_gen_point_to_template_constraints", "SM-APPLY-GEN-POINT-TO-TEMPLATE-CONSTRAINTS", 5, 0, false);
        declareFunction(me, "sm_de_apply_gen_point_to_template_constraints", "SM-DE-APPLY-GEN-POINT-TO-TEMPLATE-CONSTRAINTS", 5, 0, false);
        declareFunction(me, "sm_generate_text_from_template_expr", "SM-GENERATE-TEXT-FROM-TEMPLATE-EXPR", 2, 0, false);
        declareFunction(me, "sm_generate_text_from_template_element", "SM-GENERATE-TEXT-FROM-TEMPLATE-ELEMENT", 2, 0, false);
        declareFunction(me, "sm_generate_blank_for_template_element", "SM-GENERATE-BLANK-FOR-TEMPLATE-ELEMENT", 2, 0, false);
        declareFunction(me, "sm_act_save_scenario", "SM-ACT-SAVE-SCENARIO", 4, 0, false);
        declareFunction(me, "sm_save_scenario_terms_and_referents", "SM-SAVE-SCENARIO-TERMS-AND-REFERENTS", 3, 0, false);
        declareFunction(me, "sm_save_scenario_terms_and_referents_int", "SM-SAVE-SCENARIO-TERMS-AND-REFERENTS-INT", 3, 0, false);
        declareFunction(me, "sm_save_template_constraints", "SM-SAVE-TEMPLATE-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "sm_save_scenario_term_template", "SM-SAVE-SCENARIO-TERM-TEMPLATE", 3, 0, false);
        declareFunction(me, "sm_act_enumerate_saved_scenarios", "SM-ACT-ENUMERATE-SAVED-SCENARIOS", 2, 0, false);
        declareFunction(me, "sm_enumerate_scenarios_identify_term_template", "SM-ENUMERATE-SCENARIOS-IDENTIFY-TERM-TEMPLATE", 2, 0, false);
        declareFunction(me, "sm_enumerate_scenarios_unpack_template_expression", "SM-ENUMERATE-SCENARIOS-UNPACK-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction(me, "sm_act_discard_template", "SM-ACT-DISCARD-TEMPLATE", 2, 0, false);
        declareFunction(me, "sm_act_compute_unused_indexicals", "SM-ACT-COMPUTE-UNUSED-INDEXICALS", 1, 0, false);
        declareFunction(me, "sm_act_compute_unused_indexicals_memoized_internal", "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "sm_act_compute_unused_indexicals_memoized", "SM-ACT-COMPUTE-UNUSED-INDEXICALS-MEMOIZED", 1, 0, false);
        declareFunction(me, "sm_act_compute_explicit_type_constraints", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "sm_act_compute_explicit_type_constraints_memoized_internal", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "sm_act_compute_explicit_type_constraints_memoized", "SM-ACT-COMPUTE-EXPLICIT-TYPE-CONSTRAINTS-MEMOIZED", 1, 0, false);
        declareFunction(me, "sm_act_compute_indexical_constraints", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "sm_act_compute_indexical_constraints_memoized_internal", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "sm_act_compute_indexical_constraints_memoized", "SM-ACT-COMPUTE-INDEXICAL-CONSTRAINTS-MEMOIZED", 2, 0, false);
        declareFunction(me, "sm_act_set_indexical_record_var", "SM-ACT-SET-INDEXICAL-RECORD-VAR", 2, 0, false);
        declareFunction(me, "sm_act_add_explicit_constraints", "SM-ACT-ADD-EXPLICIT-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "sm_redundant_constraintP", "SM-REDUNDANT-CONSTRAINT?", 2, 0, false);
        declareFunction(me, "sm_act_propose_sentence_adjustments", "SM-ACT-PROPOSE-SENTENCE-ADJUSTMENTS", 3, 0, false);
        declareFunction(me, "sm_propose_gaf_sentence_adjustments", "SM-PROPOSE-GAF-SENTENCE-ADJUSTMENTS", 3, 0, false);
        declareFunction(me, "sm_act_construct_indexical_table", "SM-ACT-CONSTRUCT-INDEXICAL-TABLE", 1, 0, false);
        declareFunction(me, "sm_act_construct_indexical_table_from_indexical_records", "SM-ACT-CONSTRUCT-INDEXICAL-TABLE-FROM-INDEXICAL-RECORDS", 1, 0, false);
        declareFunction(me, "sm_act_construct_indexical_constraint_table", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE", 1, 0, false);
        declareFunction(me, "sm_act_construct_indexical_constraint_table_memoized_internal", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "sm_act_construct_indexical_constraint_table_memoized", "SM-ACT-CONSTRUCT-INDEXICAL-CONSTRAINT-TABLE-MEMOIZED", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_scenario_manipulator_file() {
        deflexical("*SM-LOCK*", make_lock($$$Scenario_Manipulator_Lock));
        deflexical("*SM-ISG*", SubLTrampolineFile.maybeDefault($sm_isg$, $sm_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*SM-INDEX*", SubLTrampolineFile.maybeDefault($sm_index$, $sm_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-SM-SCENARIO*", SM_SCENARIO);
        defconstant("*DTP-SM-TEMPLATE*", SM_TEMPLATE);
        defconstant("*DTP-SM-INDEXICAL-RECORD*", SM_INDEXICAL_RECORD);
        defconstant("*DTP-SM-CONSTRAINT-RECORD*", SM_CONSTRAINT_RECORD);
        defconstant("*DTP-SM-MERGE-INFO*", SM_MERGE_INFO);
        defconstant("*DTP-SM-GEN-POINT*", SM_GEN_POINT);
        deflexical("*SM-INDEXICAL-NUMBERED-PHRASES*", $list213);
        defparameter("*SM-SEMANTIC-MT*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_scenario_manipulator_file() {
        declare_defglobal($sm_isg$);
        declare_defglobal($sm_index$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sm_scenario$.getGlobalValue(), symbol_function(SM_SCENARIO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list13);
        def_csetf(SM_SCENARIO_ID, _CSETF_SM_SCENARIO_ID);
        def_csetf(SM_SCENARIO_SESSIONS, _CSETF_SM_SCENARIO_SESSIONS);
        def_csetf(SM_SCENARIO_PHRASE, _CSETF_SM_SCENARIO_PHRASE);
        def_csetf(SM_SCENARIO_CANDIDATE_TERMS, _CSETF_SM_SCENARIO_CANDIDATE_TERMS);
        def_csetf(SM_SCENARIO_CANDIDATE_CONSTRAINTS, _CSETF_SM_SCENARIO_CANDIDATE_CONSTRAINTS);
        def_csetf(SM_SCENARIO_FORT, _CSETF_SM_SCENARIO_FORT);
        def_csetf(SM_SCENARIO_TERMS, _CSETF_SM_SCENARIO_TERMS);
        def_csetf(SM_SCENARIO_CONSTRAINTS, _CSETF_SM_SCENARIO_CONSTRAINTS);
        def_csetf(SM_SCENARIO_TEMPLATES, _CSETF_SM_SCENARIO_TEMPLATES);
        def_csetf(SM_SCENARIO_STATE, _CSETF_SM_SCENARIO_STATE);
        identity(SM_SCENARIO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_scenario$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SM_SCENARIO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sm_template$.getGlobalValue(), symbol_function(SM_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list69);
        def_csetf(SM_TEMPLATE_ID, _CSETF_SM_TEMPLATE_ID);
        def_csetf(SM_TEMPLATE_SCENARIO, _CSETF_SM_TEMPLATE_SCENARIO);
        def_csetf(SM_TEMPLATE_PHRASE, _CSETF_SM_TEMPLATE_PHRASE);
        def_csetf(SM_TEMPLATE_EXPRESSION, _CSETF_SM_TEMPLATE_EXPRESSION);
        def_csetf(SM_TEMPLATE_PARAM_SUBS, _CSETF_SM_TEMPLATE_PARAM_SUBS);
        def_csetf(SM_TEMPLATE_PARAMETERS, _CSETF_SM_TEMPLATE_PARAMETERS);
        def_csetf(SM_TEMPLATE_CONSTRAINTS, _CSETF_SM_TEMPLATE_CONSTRAINTS);
        def_csetf(SM_TEMPLATE_STATE, _CSETF_SM_TEMPLATE_STATE);
        identity(SM_TEMPLATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_template$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SM_TEMPLATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sm_indexical_record$.getGlobalValue(), symbol_function(SM_INDEXICAL_RECORD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list102);
        def_csetf(SM_INDEXICAL_RECORD_ID, _CSETF_SM_INDEXICAL_RECORD_ID);
        def_csetf(SM_INDEXICAL_RECORD_INDEXICAL, _CSETF_SM_INDEXICAL_RECORD_INDEXICAL);
        def_csetf(SM_INDEXICAL_RECORD_PHRASES, _CSETF_SM_INDEXICAL_RECORD_PHRASES);
        def_csetf(SM_INDEXICAL_RECORD_VAR, _CSETF_SM_INDEXICAL_RECORD_VAR);
        def_csetf(SM_INDEXICAL_RECORD_EXPLICIT_ISAS, _CSETF_SM_INDEXICAL_RECORD_EXPLICIT_ISAS);
        def_csetf(SM_INDEXICAL_RECORD_EXPLICIT_GENLS, _CSETF_SM_INDEXICAL_RECORD_EXPLICIT_GENLS);
        def_csetf(SM_INDEXICAL_RECORD_ISAS, _CSETF_SM_INDEXICAL_RECORD_ISAS);
        def_csetf(SM_INDEXICAL_RECORD_GENLS, _CSETF_SM_INDEXICAL_RECORD_GENLS);
        def_csetf(SM_INDEXICAL_RECORD_STATE, _CSETF_SM_INDEXICAL_RECORD_STATE);
        identity(SM_INDEXICAL_RECORD);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_indexical_record$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SM_INDEXICAL_RECORD_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sm_constraint_record$.getGlobalValue(), symbol_function(SM_CONSTRAINT_RECORD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list140);
        def_csetf(SM_CONSTRAINT_RECORD_ID, _CSETF_SM_CONSTRAINT_RECORD_ID);
        def_csetf(SM_CONSTRAINT_RECORD_SENTENCE, _CSETF_SM_CONSTRAINT_RECORD_SENTENCE);
        def_csetf(SM_CONSTRAINT_RECORD_NL_SENTENCE, _CSETF_SM_CONSTRAINT_RECORD_NL_SENTENCE);
        identity(SM_CONSTRAINT_RECORD);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_constraint_record$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SM_CONSTRAINT_RECORD_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sm_merge_info$.getGlobalValue(), symbol_function(SM_MERGE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list159);
        def_csetf(SM_MERGE_INFO_ID, _CSETF_SM_MERGE_INFO_ID);
        def_csetf(SM_MERGE_INFO_FROM_SCENARIO, _CSETF_SM_MERGE_INFO_FROM_SCENARIO);
        def_csetf(SM_MERGE_INFO_TO_SCENARIO, _CSETF_SM_MERGE_INFO_TO_SCENARIO);
        def_csetf(SM_MERGE_INFO_ALIGN_TO, _CSETF_SM_MERGE_INFO_ALIGN_TO);
        def_csetf(SM_MERGE_INFO_ALIGN_FROM, _CSETF_SM_MERGE_INFO_ALIGN_FROM);
        def_csetf(SM_MERGE_INFO_INDEXICAL_EQUIVALENCES, _CSETF_SM_MERGE_INFO_INDEXICAL_EQUIVALENCES);
        identity(SM_MERGE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_merge_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SM_MERGE_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sm_gen_point$.getGlobalValue(), symbol_function(SM_GEN_POINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list186);
        def_csetf(SM_GEN_POINT_ID, _CSETF_SM_GEN_POINT_ID);
        def_csetf(SM_GEN_POINT_NON_INDEXICAL, _CSETF_SM_GEN_POINT_NON_INDEXICAL);
        def_csetf(SM_GEN_POINT_ISAS, _CSETF_SM_GEN_POINT_ISAS);
        def_csetf(SM_GEN_POINT_GENLS, _CSETF_SM_GEN_POINT_GENLS);
        def_csetf(SM_GEN_POINT_POSITIONS, _CSETF_SM_GEN_POINT_POSITIONS);
        def_csetf(SM_GEN_POINT_INDEXICAL_RECORD, _CSETF_SM_GEN_POINT_INDEXICAL_RECORD);
        def_csetf(SM_GEN_POINT_KEYWORD, _CSETF_SM_GEN_POINT_KEYWORD);
        identity(SM_GEN_POINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sm_gen_point$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SM_GEN_POINT_METHOD));
        memoization_state.note_memoized_function(SM_ACT_GET_ALL_ISAS_FOR_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function(SM_ACT_GET_ALL_GENLS_FOR_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function(SM_ACT_GATHER_CONSTRAINT_FORMULAS_MEMOIZED);
        memoization_state.note_memoized_function(SM_ACT_COMPUTE_UNUSED_INDEXICALS_MEMOIZED);
        memoization_state.note_memoized_function(SM_ACT_COMPUTE_EXPLICIT_TYPE_CONSTRAINTS_MEMOIZED);
        memoization_state.note_memoized_function(SM_ACT_COMPUTE_INDEXICAL_CONSTRAINTS_MEMOIZED);
        memoization_state.note_memoized_function(SM_ACT_CONSTRUCT_INDEXICAL_CONSTRAINT_TABLE_MEMOIZED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_scenario_manipulator_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_scenario_manipulator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_scenario_manipulator_file();
    }

    

    public static final class $sm_scenario_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $sessions;

        public SubLObject $phrase;

        public SubLObject $candidate_terms;

        public SubLObject $candidate_constraints;

        public SubLObject $fort;

        public SubLObject $terms;

        public SubLObject $constraints;

        public SubLObject $templates;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        private $sm_scenario_native() {
            this.$id = Lisp.NIL;
            this.$sessions = Lisp.NIL;
            this.$phrase = Lisp.NIL;
            this.$candidate_terms = Lisp.NIL;
            this.$candidate_constraints = Lisp.NIL;
            this.$fort = Lisp.NIL;
            this.$terms = Lisp.NIL;
            this.$constraints = Lisp.NIL;
            this.$templates = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$sessions;
        }

        @Override
        public SubLObject getField4() {
            return this.$phrase;
        }

        @Override
        public SubLObject getField5() {
            return this.$candidate_terms;
        }

        @Override
        public SubLObject getField6() {
            return this.$candidate_constraints;
        }

        @Override
        public SubLObject getField7() {
            return this.$fort;
        }

        @Override
        public SubLObject getField8() {
            return this.$terms;
        }

        @Override
        public SubLObject getField9() {
            return this.$constraints;
        }

        @Override
        public SubLObject getField10() {
            return this.$templates;
        }

        @Override
        public SubLObject getField11() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$sessions = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$phrase = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$candidate_terms = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$candidate_constraints = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$fort = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$terms = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$constraints = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$templates = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative($sm_scenario_native.class, SM_SCENARIO, SM_SCENARIO_P, $list7, $list8, new String[]{ "$id", "$sessions", "$phrase", "$candidate_terms", "$candidate_constraints", "$fort", "$terms", "$constraints", "$templates", "$state" }, $list9, $list10, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sm_scenario_p$UnaryFunction extends UnaryFunction {
        public $sm_scenario_p$UnaryFunction() {
            super(extractFunctionNamed("SM-SCENARIO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sm_scenario_p(arg1);
        }
    }

    public static final class $sm_template_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $scenario;

        public SubLObject $phrase;

        public SubLObject $expression;

        public SubLObject $param_subs;

        public SubLObject $parameters;

        public SubLObject $constraints;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        private $sm_template_native() {
            this.$id = Lisp.NIL;
            this.$scenario = Lisp.NIL;
            this.$phrase = Lisp.NIL;
            this.$expression = Lisp.NIL;
            this.$param_subs = Lisp.NIL;
            this.$parameters = Lisp.NIL;
            this.$constraints = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$scenario;
        }

        @Override
        public SubLObject getField4() {
            return this.$phrase;
        }

        @Override
        public SubLObject getField5() {
            return this.$expression;
        }

        @Override
        public SubLObject getField6() {
            return this.$param_subs;
        }

        @Override
        public SubLObject getField7() {
            return this.$parameters;
        }

        @Override
        public SubLObject getField8() {
            return this.$constraints;
        }

        @Override
        public SubLObject getField9() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$scenario = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$phrase = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$expression = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$param_subs = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$parameters = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$constraints = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative($sm_template_native.class, SM_TEMPLATE, SM_TEMPLATE_P, $list64, $list65, new String[]{ "$id", "$scenario", "$phrase", "$expression", "$param_subs", "$parameters", "$constraints", "$state" }, $list66, $list67, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sm_template_p$UnaryFunction extends UnaryFunction {
        public $sm_template_p$UnaryFunction() {
            super(extractFunctionNamed("SM-TEMPLATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sm_template_p(arg1);
        }
    }

    public static final class $sm_indexical_record_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $indexical;

        public SubLObject $phrases;

        public SubLObject $var;

        public SubLObject $explicit_isas;

        public SubLObject $explicit_genls;

        public SubLObject $isas;

        public SubLObject $genls;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        private $sm_indexical_record_native() {
            this.$id = Lisp.NIL;
            this.$indexical = Lisp.NIL;
            this.$phrases = Lisp.NIL;
            this.$var = Lisp.NIL;
            this.$explicit_isas = Lisp.NIL;
            this.$explicit_genls = Lisp.NIL;
            this.$isas = Lisp.NIL;
            this.$genls = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$indexical;
        }

        @Override
        public SubLObject getField4() {
            return this.$phrases;
        }

        @Override
        public SubLObject getField5() {
            return this.$var;
        }

        @Override
        public SubLObject getField6() {
            return this.$explicit_isas;
        }

        @Override
        public SubLObject getField7() {
            return this.$explicit_genls;
        }

        @Override
        public SubLObject getField8() {
            return this.$isas;
        }

        @Override
        public SubLObject getField9() {
            return this.$genls;
        }

        @Override
        public SubLObject getField10() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$indexical = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$phrases = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$var = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$explicit_isas = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$explicit_genls = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$isas = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$genls = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative($sm_indexical_record_native.class, SM_INDEXICAL_RECORD, SM_INDEXICAL_RECORD_P, $list97, $list98, new String[]{ "$id", "$indexical", "$phrases", "$var", "$explicit_isas", "$explicit_genls", "$isas", "$genls", "$state" }, $list99, $list100, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sm_indexical_record_p$UnaryFunction extends UnaryFunction {
        public $sm_indexical_record_p$UnaryFunction() {
            super(extractFunctionNamed("SM-INDEXICAL-RECORD-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sm_indexical_record_p(arg1);
        }
    }

    public static final class $sm_constraint_record_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $sentence;

        public SubLObject $nl_sentence;

        private static final SubLStructDeclNative structDecl;

        private $sm_constraint_record_native() {
            this.$id = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$nl_sentence = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$sentence;
        }

        @Override
        public SubLObject getField4() {
            return this.$nl_sentence;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$sentence = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$nl_sentence = value;
        }

        static {
            structDecl = makeStructDeclNative($sm_constraint_record_native.class, SM_CONSTRAINT_RECORD, SM_CONSTRAINT_RECORD_P, $list135, $list136, new String[]{ "$id", "$sentence", "$nl_sentence" }, $list137, $list138, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sm_constraint_record_p$UnaryFunction extends UnaryFunction {
        public $sm_constraint_record_p$UnaryFunction() {
            super(extractFunctionNamed("SM-CONSTRAINT-RECORD-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sm_constraint_record_p(arg1);
        }
    }

    public static final class $sm_merge_info_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $from_scenario;

        public SubLObject $to_scenario;

        public SubLObject $align_to;

        public SubLObject $align_from;

        public SubLObject $indexical_equivalences;

        private static final SubLStructDeclNative structDecl;

        private $sm_merge_info_native() {
            this.$id = Lisp.NIL;
            this.$from_scenario = Lisp.NIL;
            this.$to_scenario = Lisp.NIL;
            this.$align_to = Lisp.NIL;
            this.$align_from = Lisp.NIL;
            this.$indexical_equivalences = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$from_scenario;
        }

        @Override
        public SubLObject getField4() {
            return this.$to_scenario;
        }

        @Override
        public SubLObject getField5() {
            return this.$align_to;
        }

        @Override
        public SubLObject getField6() {
            return this.$align_from;
        }

        @Override
        public SubLObject getField7() {
            return this.$indexical_equivalences;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$from_scenario = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$to_scenario = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$align_to = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$align_from = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$indexical_equivalences = value;
        }

        static {
            structDecl = makeStructDeclNative($sm_merge_info_native.class, SM_MERGE_INFO, SM_MERGE_INFO_P, $list154, $list155, new String[]{ "$id", "$from_scenario", "$to_scenario", "$align_to", "$align_from", "$indexical_equivalences" }, $list156, $list157, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sm_merge_info_p$UnaryFunction extends UnaryFunction {
        public $sm_merge_info_p$UnaryFunction() {
            super(extractFunctionNamed("SM-MERGE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sm_merge_info_p(arg1);
        }
    }

    public static final class $sm_gen_point_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $non_indexical;

        public SubLObject $isas;

        public SubLObject $genls;

        public SubLObject $positions;

        public SubLObject $indexical_record;

        public SubLObject $keyword;

        private static final SubLStructDeclNative structDecl;

        private $sm_gen_point_native() {
            this.$id = Lisp.NIL;
            this.$non_indexical = Lisp.NIL;
            this.$isas = Lisp.NIL;
            this.$genls = Lisp.NIL;
            this.$positions = Lisp.NIL;
            this.$indexical_record = Lisp.NIL;
            this.$keyword = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$non_indexical;
        }

        @Override
        public SubLObject getField4() {
            return this.$isas;
        }

        @Override
        public SubLObject getField5() {
            return this.$genls;
        }

        @Override
        public SubLObject getField6() {
            return this.$positions;
        }

        @Override
        public SubLObject getField7() {
            return this.$indexical_record;
        }

        @Override
        public SubLObject getField8() {
            return this.$keyword;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$non_indexical = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$isas = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$genls = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$positions = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$indexical_record = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$keyword = value;
        }

        static {
            structDecl = makeStructDeclNative($sm_gen_point_native.class, SM_GEN_POINT, SM_GEN_POINT_P, $list181, $list182, new String[]{ "$id", "$non_indexical", "$isas", "$genls", "$positions", "$indexical_record", "$keyword" }, $list183, $list184, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sm_gen_point_p$UnaryFunction extends UnaryFunction {
        public $sm_gen_point_p$UnaryFunction() {
            super(extractFunctionNamed("SM-GEN-POINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sm_gen_point_p(arg1);
        }
    }
}

/**
 * Total time: 1583 ms synthetic
 */
