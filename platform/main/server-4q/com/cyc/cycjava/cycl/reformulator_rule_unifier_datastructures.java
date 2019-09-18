package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quantifier_p;
import static com.cyc.cycjava.cycl.el_utilities.expression_shared_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class reformulator_rule_unifier_datastructures extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_rule_unifier_datastructures();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_rule_unifier_datastructures";

    public static final String myFingerPrint = "20e84ec9804c2a30f49e27ced1111d8eaad1b62abf113d90686f188feccae11c";

    // defconstant
    public static final SubLSymbol $dtp_reformulator_template$ = makeSymbol("*DTP-REFORMULATOR-TEMPLATE*");

    // defconstant
    public static final SubLSymbol $dtp_reformulator_rule$ = makeSymbol("*DTP-REFORMULATOR-RULE*");













    // defparameter
    // temp dynamic variable to store shared var bindings to hl vars
    private static final SubLSymbol $reformulator_shared_var_bindings$ = makeSymbol("*REFORMULATOR-SHARED-VAR-BINDINGS*");



    // defparameter
    public static final SubLSymbol $reformulator_skolem_dwimming_space$ = makeSymbol("*REFORMULATOR-SKOLEM-DWIMMING-SPACE*");

    // Internal Constants
    public static final SubLSymbol REFORMULATOR_TEMPLATE = makeSymbol("REFORMULATOR-TEMPLATE");

    public static final SubLSymbol REFORMULATOR_TEMPLATE_P = makeSymbol("REFORMULATOR-TEMPLATE-P");

    public static final SubLList $list2 = list(makeSymbol("EXPRESSION"), makeSymbol("SHARED-VAR-BINDINGS"), makeSymbol("MT"), makeSymbol("FORTS"));

    public static final SubLList $list3 = list(makeKeyword("EXPRESSION"), makeKeyword("SHARED-VAR-BINDINGS"), makeKeyword("MT"), makeKeyword("FORTS"));

    public static final SubLList $list4 = list(makeSymbol("RT-EXPRESSION"), makeSymbol("RT-SHARED-VAR-BINDINGS"), makeSymbol("RT-MT"), makeSymbol("RT-FORTS"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RT-EXPRESSION"), makeSymbol("_CSETF-RT-SHARED-VAR-BINDINGS"), makeSymbol("_CSETF-RT-MT"), makeSymbol("_CSETF-RT-FORTS"));

    public static final SubLSymbol PRINT_REFORMULATOR_TEMPLATE = makeSymbol("PRINT-REFORMULATOR-TEMPLATE");

    public static final SubLSymbol REFORMULATOR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REFORMULATOR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REFORMULATOR-TEMPLATE-P"));

    private static final SubLSymbol RT_EXPRESSION = makeSymbol("RT-EXPRESSION");

    private static final SubLSymbol _CSETF_RT_EXPRESSION = makeSymbol("_CSETF-RT-EXPRESSION");

    private static final SubLSymbol RT_SHARED_VAR_BINDINGS = makeSymbol("RT-SHARED-VAR-BINDINGS");

    private static final SubLSymbol _CSETF_RT_SHARED_VAR_BINDINGS = makeSymbol("_CSETF-RT-SHARED-VAR-BINDINGS");

    private static final SubLSymbol RT_MT = makeSymbol("RT-MT");

    private static final SubLSymbol _CSETF_RT_MT = makeSymbol("_CSETF-RT-MT");

    private static final SubLSymbol RT_FORTS = makeSymbol("RT-FORTS");

    private static final SubLSymbol _CSETF_RT_FORTS = makeSymbol("_CSETF-RT-FORTS");



    private static final SubLSymbol $SHARED_VAR_BINDINGS = makeKeyword("SHARED-VAR-BINDINGS");





    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_REFORMULATOR_TEMPLATE = makeSymbol("MAKE-REFORMULATOR-TEMPLATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_TEMPLATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-TEMPLATE-METHOD");

    private static final SubLSymbol REFORMULATOR_RULE = makeSymbol("REFORMULATOR-RULE");

    private static final SubLSymbol REFORMULATOR_RULE_P = makeSymbol("REFORMULATOR-RULE-P");

    private static final SubLList $list29 = list(new SubLObject[]{ makeSymbol("FIRST-RT"), makeSymbol("SECOND-RT"), makeSymbol("MT"), makeSymbol("WFF-DEGREE"), makeSymbol("DIRECTIONS"), makeSymbol("ASSERTION"), makeSymbol("RULE-PRED"), makeSymbol("PRECONDITIONS"), makeSymbol("PROPERTIES") });

    private static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("FIRST-RT"), makeKeyword("SECOND-RT"), makeKeyword("MT"), makeKeyword("WFF-DEGREE"), makeKeyword("DIRECTIONS"), makeKeyword("ASSERTION"), makeKeyword("RULE-PRED"), makeKeyword("PRECONDITIONS"), makeKeyword("PROPERTIES") });

    private static final SubLList $list31 = list(new SubLObject[]{ makeSymbol("REFR-FIRST-RT"), makeSymbol("REFR-SECOND-RT"), makeSymbol("REFR-MT"), makeSymbol("REFR-WFF-DEGREE"), makeSymbol("REFR-DIRECTIONS"), makeSymbol("REFR-ASSERTION"), makeSymbol("REFR-RULE-PRED"), makeSymbol("REFR-PRECONDITIONS"), makeSymbol("REFR-PROPERTIES") });

    private static final SubLList $list32 = list(new SubLObject[]{ makeSymbol("_CSETF-REFR-FIRST-RT"), makeSymbol("_CSETF-REFR-SECOND-RT"), makeSymbol("_CSETF-REFR-MT"), makeSymbol("_CSETF-REFR-WFF-DEGREE"), makeSymbol("_CSETF-REFR-DIRECTIONS"), makeSymbol("_CSETF-REFR-ASSERTION"), makeSymbol("_CSETF-REFR-RULE-PRED"), makeSymbol("_CSETF-REFR-PRECONDITIONS"), makeSymbol("_CSETF-REFR-PROPERTIES") });

    private static final SubLSymbol PRINT_REFORMULATOR_RULE = makeSymbol("PRINT-REFORMULATOR-RULE");

    private static final SubLSymbol REFORMULATOR_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REFORMULATOR-RULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list35 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REFORMULATOR-RULE-P"));

    private static final SubLSymbol REFR_FIRST_RT = makeSymbol("REFR-FIRST-RT");

    private static final SubLSymbol _CSETF_REFR_FIRST_RT = makeSymbol("_CSETF-REFR-FIRST-RT");

    private static final SubLSymbol REFR_SECOND_RT = makeSymbol("REFR-SECOND-RT");

    private static final SubLSymbol _CSETF_REFR_SECOND_RT = makeSymbol("_CSETF-REFR-SECOND-RT");

    private static final SubLSymbol REFR_MT = makeSymbol("REFR-MT");

    private static final SubLSymbol _CSETF_REFR_MT = makeSymbol("_CSETF-REFR-MT");

    private static final SubLSymbol REFR_WFF_DEGREE = makeSymbol("REFR-WFF-DEGREE");

    private static final SubLSymbol _CSETF_REFR_WFF_DEGREE = makeSymbol("_CSETF-REFR-WFF-DEGREE");

    private static final SubLSymbol REFR_DIRECTIONS = makeSymbol("REFR-DIRECTIONS");

    private static final SubLSymbol _CSETF_REFR_DIRECTIONS = makeSymbol("_CSETF-REFR-DIRECTIONS");

    private static final SubLSymbol REFR_ASSERTION = makeSymbol("REFR-ASSERTION");

    private static final SubLSymbol _CSETF_REFR_ASSERTION = makeSymbol("_CSETF-REFR-ASSERTION");

    private static final SubLSymbol REFR_RULE_PRED = makeSymbol("REFR-RULE-PRED");

    private static final SubLSymbol _CSETF_REFR_RULE_PRED = makeSymbol("_CSETF-REFR-RULE-PRED");

    private static final SubLSymbol REFR_PRECONDITIONS = makeSymbol("REFR-PRECONDITIONS");

    private static final SubLSymbol _CSETF_REFR_PRECONDITIONS = makeSymbol("_CSETF-REFR-PRECONDITIONS");

    private static final SubLSymbol REFR_PROPERTIES = makeSymbol("REFR-PROPERTIES");

    private static final SubLSymbol _CSETF_REFR_PROPERTIES = makeSymbol("_CSETF-REFR-PROPERTIES");

















    private static final SubLSymbol MAKE_REFORMULATOR_RULE = makeSymbol("MAKE-REFORMULATOR-RULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_RULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-RULE-METHOD");

    private static final SubLString $str64$__RT_ = makeString("#<RT>");

    private static final SubLString $str65$__RT__s_ = makeString("#<RT:~s>");

    private static final SubLString $str66$__RT__s__s__s_ = makeString("#<RT:~s:~s:~s>");

    private static final SubLString $str67$__RR__s_ = makeString("#<RR:~s>");

    private static final SubLString $str68$__REFORMULATOR_RULE__s__s__s_ = makeString("#<REFORMULATOR-RULE:~s:~s:~s>");

    private static final SubLString $str69$__REFORMULATOR_RULE__s__s__s__s__ = makeString("#<REFORMULATOR-RULE:~s:~s:~s:~s:~s:~s:~s>");

    private static final SubLString $str70$__REFORMULATOR_RULE__s__s__s__s__ = makeString("#<REFORMULATOR-RULE:~s:~s:~s:~s:~s:~s:~s:~s:~s>");

    private static final SubLObject $$ReformulationForwardDirection = reader_make_constant_shell(makeString("ReformulationForwardDirection"));

    private static final SubLObject $$ReformulationBackwardDirection = reader_make_constant_shell(makeString("ReformulationBackwardDirection"));

    private static final SubLSymbol $reformulator_rules$ = makeSymbol("*REFORMULATOR-RULES*");

    private static final SubLSymbol $fort_reformulator_rule_table$ = makeSymbol("*FORT-REFORMULATOR-RULE-TABLE*");

    private static final SubLSymbol $constant_reformulator_rule_table$ = makeSymbol("*CONSTANT-REFORMULATOR-RULE-TABLE*");

    private static final SubLSymbol $nart_reformulator_rule_table$ = makeSymbol("*NART-REFORMULATOR-RULE-TABLE*");

    private static final SubLSymbol $unassociated_reformulator_rules$ = makeSymbol("*UNASSOCIATED-REFORMULATOR-RULES*");

    private static final SubLString $str78$Found_an_ill_formed_reformulation = makeString("Found an ill-formed reformulation assertion: ~s - ignoring it~%");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol GATHER_PREDICATE_EXTENT_INDEX = makeSymbol("GATHER-PREDICATE-EXTENT-INDEX");

    private static final SubLString $$$Initializing_Reformulator_Rules = makeString("Initializing Reformulator Rules");

    private static final SubLSymbol $sym83$DEFAULT_EL_VAR_ = makeSymbol("DEFAULT-EL-VAR?");

    private static final SubLString $str84$expansion_rule__s_contains_a_defa = makeString("expansion rule ~s contains a default EL variable and cannot be used by the CycL reformulator.");



    private static final SubLSymbol GENERIC_ARG_TO_DEFAULT_EL_VAR = makeSymbol("GENERIC-ARG-TO-DEFAULT-EL-VAR");

    private static final SubLSymbol FIND_DEFAULT_EL_VAR_BY_ID = makeSymbol("FIND-DEFAULT-EL-VAR-BY-ID");

    private static final SubLSymbol CHLMT_P = makeSymbol("CHLMT-P");

    private static final SubLString $str89$Found_a_reformulator_rule_that_wo = makeString("Found a reformulator rule that would reformulate ~s to itself - ignoring rule~%");

    private static final SubLString $str90$Encountered__A_which_is_not_a_CYC = makeString("Encountered ~A which is not a CYCL-EXPRESSION.  Skipping the reformulator rule ~A.");









    private static final SubLList $list95 = list(list(makeSymbol("SHARED-VARS"), makeSymbol("EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym96$HIGHEST_VAR_NUM = makeUninternedSymbol("HIGHEST-VAR-NUM");



    private static final SubLSymbol $reformulator_shared_vars$ = makeSymbol("*REFORMULATOR-SHARED-VARS*");

    private static final SubLList $list99 = list(makeSymbol("*REFORMULATOR-SHARED-VAR-BINDINGS*"), NIL);

    private static final SubLSymbol SAFE_MAX = makeSymbol("SAFE-MAX");



    private static final SubLList $list102 = list(makeSymbol("QUOTE"), makeSymbol("VARIABLE-ID"));

    private static final SubLSymbol EXPRESSION_GATHER = makeSymbol("EXPRESSION-GATHER");

    private static final SubLList $list104 = list(list(makeSymbol("FUNCTION"), makeSymbol("VARIABLE-P")), NIL);

    private static final SubLSymbol $reformulator_next_available_hl_var_num$ = makeSymbol("*REFORMULATOR-NEXT-AVAILABLE-HL-VAR-NUM*");

    private static final SubLSymbol VARIABLE_ID = makeSymbol("VARIABLE-ID");



    private static final SubLSymbol $sym108$REFORMULATOR_SHARED_EL_VAR_OR_DONT_CARE_VAR_ = makeSymbol("REFORMULATOR-SHARED-EL-VAR-OR-DONT-CARE-VAR?");

    private static final SubLSymbol REFORMULATOR_APPROPRIATE_HL_VAR = makeSymbol("REFORMULATOR-APPROPRIATE-HL-VAR");

    private static final SubLSymbol $sym110$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");

    private static final SubLSymbol REFORMULATOR_DWIM_SKOLEM = makeSymbol("REFORMULATOR-DWIM-SKOLEM");



    private static final SubLSymbol $sym113$REFORMULATOR_SKOLEM_FUNCTION_FN_TO_CLEAN_UP_ = makeSymbol("REFORMULATOR-SKOLEM-FUNCTION-FN-TO-CLEAN-UP?");

    private static final SubLObject $$SkolemFunctionFn = reader_make_constant_shell(makeString("SkolemFunctionFn"));

    private static final SubLSymbol $sym115$EL_VARIABLE_ = makeSymbol("EL-VARIABLE?");

    private static final SubLObject $$reformulationPrecondition = reader_make_constant_shell(makeString("reformulationPrecondition"));

    private static final SubLObject $$reformulationDirectionInMode = reader_make_constant_shell(makeString("reformulationDirectionInMode"));

    private static final SubLObject $$reformulatorRuleProperties = reader_make_constant_shell(makeString("reformulatorRuleProperties"));

    private static final SubLSymbol $sym119$REFORMULATOR_RELEVANT_FORT_ = makeSymbol("REFORMULATOR-RELEVANT-FORT?");

    private static final SubLObject $$ReformulatorHighlyRelevantFORT = reader_make_constant_shell(makeString("ReformulatorHighlyRelevantFORT"));

    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));

    private static final SubLObject $$ELRelation = reader_make_constant_shell(makeString("ELRelation"));

    private static final SubLString $str124$This_code_can_only_handle_reformu = makeString("This code can only handle reformulator unit version 1.  Got version ~a, but will try anyway...");

    private static final SubLList $list125 = cons(makeUninternedSymbol("KEY"), makeSymbol("IDS"));

    public static SubLObject reformulator_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_reformulator_template(v_object, stream, ZERO_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static SubLObject reformulator_template_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$reformulator_template_native.class ? T : NIL;
    }

    public static SubLObject rt_expression(final SubLObject v_object) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rt_shared_var_bindings(final SubLObject v_object) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rt_mt(final SubLObject v_object) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rt_forts(final SubLObject v_object) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_rt_expression(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rt_shared_var_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rt_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rt_forts(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_template_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_template_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_reformulator_template(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $reformulator_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($EXPRESSION)) {
                _csetf_rt_expression(v_new, current_value);
            } else
                if (pcase_var.eql($SHARED_VAR_BINDINGS)) {
                    _csetf_rt_shared_var_bindings(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_rt_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($FORTS)) {
                            _csetf_rt_forts(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_reformulator_template(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REFORMULATOR_TEMPLATE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $EXPRESSION, rt_expression(obj));
        funcall(visitor_fn, obj, $SLOT, $SHARED_VAR_BINDINGS, rt_shared_var_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, rt_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $FORTS, rt_forts(obj));
        funcall(visitor_fn, obj, $END, MAKE_REFORMULATOR_TEMPLATE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_reformulator_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_reformulator_template(obj, visitor_fn);
    }

    public static SubLObject reformulator_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_reformulator_rule(v_object, stream, ZERO_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static SubLObject reformulator_rule_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$reformulator_rule_native.class ? T : NIL;
    }

    public static SubLObject refr_first_rt(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject refr_second_rt(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject refr_mt(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject refr_wff_degree(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject refr_directions(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject refr_assertion(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject refr_rule_pred(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject refr_preconditions(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject refr_properties(final SubLObject v_object) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_refr_first_rt(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_refr_second_rt(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_refr_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_refr_wff_degree(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_refr_directions(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_refr_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_refr_rule_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_refr_preconditions(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_refr_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != reformulator_rule_p(v_object) : "reformulator_rule_unifier_datastructures.reformulator_rule_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_reformulator_rule(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $reformulator_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FIRST_RT)) {
                _csetf_refr_first_rt(v_new, current_value);
            } else
                if (pcase_var.eql($SECOND_RT)) {
                    _csetf_refr_second_rt(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_refr_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($WFF_DEGREE)) {
                            _csetf_refr_wff_degree(v_new, current_value);
                        } else
                            if (pcase_var.eql($DIRECTIONS)) {
                                _csetf_refr_directions(v_new, current_value);
                            } else
                                if (pcase_var.eql($ASSERTION)) {
                                    _csetf_refr_assertion(v_new, current_value);
                                } else
                                    if (pcase_var.eql($RULE_PRED)) {
                                        _csetf_refr_rule_pred(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PRECONDITIONS)) {
                                            _csetf_refr_preconditions(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PROPERTIES)) {
                                                _csetf_refr_properties(v_new, current_value);
                                            } else {
                                                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_reformulator_rule(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REFORMULATOR_RULE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FIRST_RT, refr_first_rt(obj));
        funcall(visitor_fn, obj, $SLOT, $SECOND_RT, refr_second_rt(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, refr_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $WFF_DEGREE, refr_wff_degree(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTIONS, refr_directions(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION, refr_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $RULE_PRED, refr_rule_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $PRECONDITIONS, refr_preconditions(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, refr_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_REFORMULATOR_RULE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_reformulator_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_reformulator_rule(obj, visitor_fn);
    }

    public static SubLObject print_reformulator_template(final SubLObject v_object, final SubLObject stream, final SubLObject depth, SubLObject verbosity_level) {
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = reformulator_datastructures.reformulator_print_verbosity_level();
        }
        if (verbosity_level.isZero()) {
            format(stream, $str64$__RT_);
        } else
            if (ONE_INTEGER.numE(verbosity_level)) {
                format(stream, $str65$__RT__s_, reformulator_template_expression(v_object));
            } else
                if (verbosity_level.numGE(TWO_INTEGER)) {
                    format(stream, $str66$__RT__s__s__s_, new SubLObject[]{ reformulator_template_expression(v_object), reformulator_template_shared_var_bindings(v_object), reformulator_template_mt(v_object), reformulator_template_forts(v_object) });
                }


        return NIL;
    }

    public static SubLObject reformulator_template_expression(final SubLObject rt) {
        return rt_expression(rt);
    }

    public static SubLObject reformulator_template_el_var_expression(final SubLObject rt) {
        return subl_promotions.nrsublis(reformulator_template_shared_var_bindings(rt), copy_expression(reformulator_template_expression(rt)), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject reformulator_template_shared_var_bindings(final SubLObject rt) {
        return rt_shared_var_bindings(rt);
    }

    public static SubLObject reformulator_template_mt(final SubLObject rt) {
        return rt_mt(rt);
    }

    public static SubLObject reformulator_template_forts(final SubLObject rt) {
        return rt_forts(rt);
    }

    public static SubLObject reformulator_template_clausesP(final SubLObject rt) {
        return clauses.clauses_p(rt_expression(rt));
    }

    public static SubLObject print_reformulator_rule(final SubLObject v_object, final SubLObject stream, final SubLObject depth, SubLObject verbosity_level) {
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = reformulator_datastructures.reformulator_print_verbosity_level();
        }
        if (verbosity_level.isZero()) {
            format(stream, $str67$__RR__s_, reformulator_rule_assertion_id(v_object));
        } else
            if (ONE_INTEGER.numE(verbosity_level)) {
                format(stream, $str68$__REFORMULATOR_RULE__s__s__s_, new SubLObject[]{ reformulator_rule_first_rt(v_object), reformulator_rule_second_rt(v_object), reformulator_rule_mt(v_object) });
            } else
                if (TWO_INTEGER.numE(verbosity_level)) {
                    format(stream, $str69$__REFORMULATOR_RULE__s__s__s__s__, new SubLObject[]{ reformulator_rule_first_rt(v_object), reformulator_rule_second_rt(v_object), reformulator_rule_mt(v_object), reformulator_rule_wff_degree(v_object), reformulator_rule_directions(v_object), reformulator_rule_assertion_id(v_object), reformulator_rule_rule_pred(v_object) });
                } else
                    if (THREE_INTEGER.numGE(verbosity_level)) {
                        format(stream, $str70$__REFORMULATOR_RULE__s__s__s__s__, new SubLObject[]{ reformulator_rule_first_rt(v_object), reformulator_rule_second_rt(v_object), reformulator_rule_mt(v_object), reformulator_rule_wff_degree(v_object), reformulator_rule_directions(v_object), reformulator_rule_assertion_id(v_object), reformulator_rule_rule_pred(v_object), reformulator_rule_preconditions(v_object), reformulator_rule_properties(v_object) });
                    }



        return NIL;
    }

    public static SubLObject reformulator_rule_first_rt(final SubLObject rr) {
        return refr_first_rt(rr);
    }

    public static SubLObject reformulator_rule_second_rt(final SubLObject rr) {
        return refr_second_rt(rr);
    }

    public static SubLObject reformulator_rule_source_rt(final SubLObject rr, final SubLObject direction) {
        if (direction.eql($$ReformulationForwardDirection)) {
            return reformulator_rule_first_rt(rr);
        }
        if (direction.eql($$ReformulationBackwardDirection)) {
            return reformulator_rule_second_rt(rr);
        }
        return NIL;
    }

    public static SubLObject reformulator_rule_target_rt(final SubLObject rr, final SubLObject direction) {
        if (direction.eql($$ReformulationForwardDirection)) {
            return reformulator_rule_second_rt(rr);
        }
        if (direction.eql($$ReformulationBackwardDirection)) {
            return reformulator_rule_first_rt(rr);
        }
        return NIL;
    }

    public static SubLObject reformulator_rule_first_shared_var_bindings(final SubLObject rr) {
        return reformulator_template_shared_var_bindings(reformulator_rule_first_rt(rr));
    }

    public static SubLObject reformulator_rule_second_shared_var_bindings(final SubLObject rr) {
        return reformulator_template_shared_var_bindings(reformulator_rule_second_rt(rr));
    }

    public static SubLObject reformulator_rule_source_shared_var_bindings(final SubLObject rr, final SubLObject direction) {
        if (direction.eql($$ReformulationForwardDirection)) {
            return reformulator_rule_first_shared_var_bindings(rr);
        }
        if (direction.eql($$ReformulationBackwardDirection)) {
            return reformulator_rule_second_shared_var_bindings(rr);
        }
        return NIL;
    }

    public static SubLObject reformulator_rule_target_shared_var_bindings(final SubLObject rr, final SubLObject direction) {
        if (direction.eql($$ReformulationForwardDirection)) {
            return reformulator_rule_second_shared_var_bindings(rr);
        }
        if (direction.eql($$ReformulationBackwardDirection)) {
            return reformulator_rule_first_shared_var_bindings(rr);
        }
        return NIL;
    }

    public static SubLObject reformulator_rule_mt(final SubLObject rr) {
        return refr_mt(rr);
    }

    public static SubLObject reformulator_rule_wff_degree(final SubLObject rr) {
        return refr_wff_degree(rr);
    }

    public static SubLObject reformulator_rule_directions(final SubLObject rr) {
        return refr_directions(rr);
    }

    public static SubLObject reformulator_rule_assertion(final SubLObject rr) {
        return refr_assertion(rr);
    }

    public static SubLObject reformulator_rule_assertion_id(final SubLObject rr) {
        return assertion_handles.assertion_id(reformulator_rule_assertion(rr));
    }

    public static SubLObject reformulator_rule_rule_pred(final SubLObject rr) {
        return refr_rule_pred(rr);
    }

    public static SubLObject reformulator_rule_preconditions(final SubLObject rr) {
        return refr_preconditions(rr);
    }

    public static SubLObject reformulator_rule_properties(final SubLObject rr) {
        return refr_properties(rr);
    }

    public static SubLObject reformulator_rules() {
        return $reformulator_rules$.getGlobalValue();
    }

    public static SubLObject fort_reformulator_rule_table() {
        return $fort_reformulator_rule_table$.getGlobalValue();
    }

    public static SubLObject constant_reformulator_rule_table() {
        return $constant_reformulator_rule_table$.getGlobalValue();
    }

    public static SubLObject nart_reformulator_rule_table() {
        return $nart_reformulator_rule_table$.getGlobalValue();
    }

    public static SubLObject unassociated_reformulator_rules() {
        return $unassociated_reformulator_rules$.getGlobalValue();
    }

    public static SubLObject add_reformulator_rule_assertion(final SubLObject assertion, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        final SubLObject rr = reformulation_assertion_to_reformulator_rule(assertion);
        if (NIL != rr) {
            return add_reformulator_rule(rr, lock);
        }
        reformulator_hub.ref_warn(THREE_INTEGER, $str78$Found_an_ill_formed_reformulation, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject add_reformulator_precondition_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_assertion = precondition_assertion_rule_assertion_arg(assertion);
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion);
        final SubLObject precondition_struct = reformulation_precondition_struct(assertion);
        if (NIL != rr) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                _csetf_refr_preconditions(rr, cons(precondition_struct, refr_preconditions(rr)));
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject add_reformulation_direction_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = direction_in_mode_assertion_direction_arg(assertion);
        final SubLObject mode = direction_in_mode_assertion_mode_arg(assertion);
        final SubLObject rule_assertion = direction_in_mode_assertion_rule_assertion_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion);
        final SubLObject direction_struct = construct_reformulation_direction_struct(direction, mt);
        if (NIL != rr) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                _csetf_refr_directions(rr, add_direction_struct_for_mode(mode, direction_struct, refr_directions(rr)));
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject add_reformulator_rule_property_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property = reformulator_rule_property_assertion_property_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject property_struct = construct_rule_property_struct(property, mt);
        final SubLObject rule_assertion = reformulator_rule_property_assertion_rule_assertion_arg(assertion);
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion);
        if (NIL != rr) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                _csetf_refr_properties(rr, reformulator_datastructures.add_reformulator_info(property_struct, refr_properties(rr)));
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject remove_reformulator_rule_assertion(final SubLObject assertion) {
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(assertion);
        if (NIL != rr) {
            return remove_reformulator_rule(rr);
        }
        return NIL;
    }

    public static SubLObject remove_reformulator_precondition_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_assertion = precondition_assertion_rule_assertion_arg(assertion);
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion);
        final SubLObject precondition_struct = reformulation_precondition_struct(assertion);
        if (NIL != rr) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                _csetf_refr_preconditions(rr, delete(precondition_struct, refr_preconditions(rr), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject remove_reformulation_direction_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = direction_in_mode_assertion_direction_arg(assertion);
        final SubLObject mode = direction_in_mode_assertion_mode_arg(assertion);
        final SubLObject rule_assertion = direction_in_mode_assertion_rule_assertion_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion);
        final SubLObject direction_struct = construct_reformulation_direction_struct(direction, mt);
        if (NIL != rr) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                _csetf_refr_directions(rr, remove_direction_struct_for_mode(mode, direction_struct, refr_directions(rr)));
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject remove_reformulator_rule_property_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property = reformulator_rule_property_assertion_property_arg(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject property_struct = construct_rule_property_struct(property, mt);
        final SubLObject rule_assertion = reformulator_rule_property_assertion_rule_assertion_arg(assertion);
        final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(rule_assertion);
        if (NIL != rr) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                _csetf_refr_properties(rr, reformulator_datastructures.remove_reformulator_info(property_struct, refr_properties(rr)));
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject add_reformulator_rule(final SubLObject rr, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        final SubLObject assertion = reformulator_rule_assertion(rr);
        final SubLObject first_rt = reformulator_rule_first_rt(rr);
        final SubLObject second_rt = reformulator_rule_second_rt(rr);
        final SubLObject first_rt_expr = reformulator_template_expression(first_rt);
        final SubLObject second_rt_expr = reformulator_template_expression(second_rt);
        final SubLObject first_rt_forts = reformulator_template_forts(first_rt);
        final SubLObject second_rt_forts = reformulator_template_forts(second_rt);
        SubLObject indexed_first_rtP = NIL;
        SubLObject indexed_second_rtP = NIL;
        if (NIL != lock) {
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                sethash(assertion, $reformulator_rules$.getGlobalValue(), rr);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        } else {
            sethash(assertion, $reformulator_rules$.getGlobalValue(), rr);
        }
        indexed_first_rtP = index_reformulator_template_expression_if_possible(first_rt_expr, assertion, lock);
        indexed_second_rtP = index_reformulator_template_expression_if_possible(second_rt_expr, assertion, lock);
        if ((NIL == indexed_first_rtP) || (NIL == indexed_second_rtP)) {
            SubLObject v_forts = NIL;
            if (NIL != indexed_first_rtP) {
                v_forts = second_rt_forts;
            } else
                if (NIL != indexed_second_rtP) {
                    v_forts = first_rt_forts;
                } else {
                    v_forts = append(first_rt_forts, second_rt_forts);
                }

            SubLObject cdolist_list_var = v_forts;
            SubLObject fort = NIL;
            fort = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != lock) {
                    SubLObject release2 = NIL;
                    try {
                        release2 = seize_lock(lock);
                        hash_table_utilities.push_hash(fort, assertion, $fort_reformulator_rule_table$.getGlobalValue());
                    } finally {
                        if (NIL != release2) {
                            release_lock(lock);
                        }
                    }
                } else {
                    hash_table_utilities.push_hash(fort, assertion, $fort_reformulator_rule_table$.getGlobalValue());
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            } 
            if ((NIL == first_rt_forts) || (NIL == second_rt_forts)) {
                $unassociated_reformulator_rules$.setGlobalValue(cons(rr, $unassociated_reformulator_rules$.getGlobalValue()));
            }
        }
        return T;
    }

    public static SubLObject index_reformulator_template_expression_if_possible(final SubLObject rt_expr, final SubLObject assertion, final SubLObject lock) {
        SubLObject indexedP = NIL;
        if (NIL != constant_p(rt_expr)) {
            if (NIL != lock) {
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    hash_table_utilities.push_hash(rt_expr, assertion, $constant_reformulator_rule_table$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            } else {
                hash_table_utilities.push_hash(rt_expr, assertion, $constant_reformulator_rule_table$.getGlobalValue());
            }
            indexedP = T;
        } else
            if (NIL != nart_handles.nart_p(rt_expr)) {
                if (NIL != lock) {
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        hash_table_utilities.push_hash(rt_expr, assertion, $nart_reformulator_rule_table$.getGlobalValue());
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                } else {
                    hash_table_utilities.push_hash(rt_expr, assertion, $nart_reformulator_rule_table$.getGlobalValue());
                }
                indexedP = T;
            }

        return indexedP;
    }

    public static SubLObject remove_reformulator_rule(final SubLObject rr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = reformulator_rule_assertion(rr);
        final SubLObject first_rt_expr = reformulator_template_expression(reformulator_rule_first_rt(rr));
        final SubLObject second_rt_expr = reformulator_template_expression(reformulator_rule_second_rt(rr));
        final SubLObject rr_forts = reformulator_rule_forts(rr);
        SubLObject release = NIL;
        try {
            release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            remhash(assertion, $reformulator_rules$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            }
        }
        unindex_reformulator_template_expression_if_possible(first_rt_expr, assertion);
        unindex_reformulator_template_expression_if_possible(second_rt_expr, assertion);
        SubLObject cdolist_list_var = rr_forts;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject release_$1 = NIL;
            try {
                release_$1 = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                hash_table_utilities.prune_hash(fort, assertion, $fort_reformulator_rule_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            } finally {
                if (NIL != release_$1) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        SubLObject release_$2 = NIL;
        try {
            release_$2 = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            $unassociated_reformulator_rules$.setGlobalValue(delete(rr, $unassociated_reformulator_rules$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release_$2) {
                release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject unindex_reformulator_template_expression_if_possible(final SubLObject rt_expr, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(rt_expr)) {
            SubLObject release = NIL;
            try {
                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                hash_table_utilities.prune_hash(rt_expr, assertion, $constant_reformulator_rule_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                }
            }
        } else
            if (NIL != nart_handles.nart_p(rt_expr)) {
                SubLObject release = NIL;
                try {
                    release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                    hash_table_utilities.prune_hash(rt_expr, assertion, $nart_reformulator_rule_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } finally {
                    if (NIL != release) {
                        release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                    }
                }
            }

        return NIL;
    }

    public static SubLObject reformulator_rule_forts(final SubLObject rr) {
        return union(reformulator_template_forts(reformulator_rule_first_rt(rr)), reformulator_template_forts(reformulator_rule_second_rt(rr)), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject initialize_reformulator_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_num = ZERO_INTEGER;
        SubLObject all_rule_assertions = NIL;
        SubLObject total_num = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            all_rule_assertions = Mapping.mapcan(GATHER_PREDICATE_EXTENT_INDEX, reformulator_datastructures.reformulator_rule_predicates(), EMPTY_SUBL_OBJECT_ARRAY);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        total_num = length(all_rule_assertions);
        $reformulator_rules$.setGlobalValue(make_hash_table(total_num, symbol_function(EQL), UNPROVIDED));
        $fort_reformulator_rule_table$.setGlobalValue(make_hash_table(multiply(TWO_INTEGER, total_num), symbol_function(EQL), UNPROVIDED));
        $constant_reformulator_rule_table$.setGlobalValue(make_hash_table(integerDivide(total_num, FOUR_INTEGER), symbol_function(EQL), UNPROVIDED));
        $nart_reformulator_rule_table$.setGlobalValue(make_hash_table(integerDivide(total_num, FOUR_INTEGER), symbol_function(EQL), UNPROVIDED));
        $unassociated_reformulator_rules$.setGlobalValue(NIL);
        _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        wff.reset_wff_state();
                    }
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TWELVE_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($$$Initializing_Reformulator_Rules);
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                                SubLObject cdolist_list_var = all_rule_assertions;
                                SubLObject ass = NIL;
                                ass = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if ((NIL != assertions_high.code_assertionP(ass)) || (NIL != add_reformulator_rule_assertion(ass, UNPROVIDED))) {
                                        result_num = add(result_num, ONE_INTEGER);
                                        note_percent_progress(result_num, total_num);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    ass = cdolist_list_var.first();
                                } 
                            } finally {
                                if (NIL != release) {
                                    release_lock(reformulator_datastructures.$reformulator_lock$.getDynamicValue(thread));
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result_num;
    }

    public static SubLObject expected_reformulator_rule_count() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = reformulator_datastructures.reformulator_rule_predicates();
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, kb_indexing.num_predicate_extent_index(pred, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject reformulation_assertion_to_reformulator_rule(final SubLObject assertion) {
        if (NIL != expansion_ruleP(assertion)) {
            return expansion_rule_to_reformulator_rule(assertion);
        }
        if (NIL != rewrite_ruleP(assertion)) {
            return rewrite_rule_to_reformulator_rule(assertion);
        }
        if (NIL != cycl_reformulation_ruleP(assertion)) {
            return reformulation_rule_to_reformulator_rule(assertion);
        }
        return NIL;
    }

    public static SubLObject expansion_rule_to_reformulator_rule(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject relation = assertions_high.gaf_arg1(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject raw_expanded_expr = assertions_high.gaf_arg2(assertion);
        if (NIL != cycl_utilities.expression_find_if($sym83$DEFAULT_EL_VAR_, raw_expanded_expr, UNPROVIDED, UNPROVIDED)) {
            reformulator_hub.ref_warn(ONE_INTEGER, $str84$expansion_rule__s_contains_a_defa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject expanded_expr = cycl_utilities.expression_transform(raw_expanded_expr, GENERIC_ARG_P, GENERIC_ARG_TO_DEFAULT_EL_VAR, UNPROVIDED, UNPROVIDED);
        final SubLObject highest_generic_arg = tersifier.highest_generic_arg_num(raw_expanded_expr);
        final SubLObject concise_expr = make_el_formula(relation, Mapping.mapcar(FIND_DEFAULT_EL_VAR_BY_ID, list_utilities.numlist(highest_generic_arg, ONE_INTEGER)), UNPROVIDED);
        final SubLObject shared_vars = expression_shared_free_variables(expanded_expr, concise_expr, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject expanded_rt = new_reformulator_template(assertion, expanded_expr, mt, rule_pred, shared_vars);
        final SubLObject first_wff_degree = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject concise_rt = new_reformulator_template(assertion, concise_expr, mt, rule_pred, shared_vars);
        final SubLObject second_wff_degree = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rule_wff_degree = compute_wff_degree_for_reformulator_rule(list(first_wff_degree, second_wff_degree));
        final SubLObject rr = (NIL != el_relation_expansion_assertionP(assertion)) ? new_reformulator_rule(expanded_rt, concise_rt, mt, assertion, rule_wff_degree) : new_reformulator_rule(concise_rt, expanded_rt, mt, assertion, rule_wff_degree);
        return rr;
    }

    public static SubLObject rewrite_rule_to_reformulator_rule(final SubLObject assertion) {
        return reformulation_rule_to_reformulator_rule(assertion);
    }

    public static SubLObject reformulation_rule_to_reformulator_rule(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject first_expr = assertions_high.gaf_arg1(assertion);
        final SubLObject second_expr = assertions_high.gaf_arg2(assertion);
        if ((NIL != first_expr) && (NIL != second_expr)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject shared_vars = expression_shared_free_variables(first_expr, second_expr, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject first_rt = new_reformulator_template(assertion, first_expr, mt, rule_pred, shared_vars);
            final SubLObject first_wff_degree = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject second_rt = new_reformulator_template(assertion, second_expr, mt, rule_pred, shared_vars);
            final SubLObject second_wff_degree = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return new_reformulator_rule(first_rt, second_rt, mt, assertion, compute_wff_degree_for_reformulator_rule(list(first_wff_degree, second_wff_degree)));
        }
        return NIL;
    }

    public static SubLObject new_reformulator_rule(final SubLObject first_rt, final SubLObject second_rt, final SubLObject mt, final SubLObject assertion, final SubLObject wff_degree) {
        if (((NIL == first_rt) || (NIL == second_rt)) || (NIL == assertions_high.valid_assertion(assertion, UNPROVIDED))) {
            return NIL;
        }
        assert NIL != reformulator_template_p(first_rt) : "reformulator_rule_unifier_datastructures.reformulator_template_p(first_rt) " + "CommonSymbols.NIL != reformulator_rule_unifier_datastructures.reformulator_template_p(first_rt) " + first_rt;
        assert NIL != reformulator_template_p(second_rt) : "reformulator_rule_unifier_datastructures.reformulator_template_p(second_rt) " + "CommonSymbols.NIL != reformulator_rule_unifier_datastructures.reformulator_template_p(second_rt) " + second_rt;
        assert NIL != hlmt.chlmt_p(mt) : "hlmt.chlmt_p(mt) " + "CommonSymbols.NIL != hlmt.chlmt_p(mt) " + mt;
        if (first_rt.equalp(second_rt)) {
            reformulator_hub.ref_warn(THREE_INTEGER, $str89$Found_a_reformulator_rule_that_wo, reformulator_template_expression(first_rt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject rr = make_reformulator_rule(UNPROVIDED);
        final SubLObject fortified_mt = cycl_utilities.reify_when_closed_naut(mt);
        final SubLObject rr_rule_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject rr_preconditions = reformulation_precondition_assertions(assertion);
        final SubLObject rr_directions = gather_reformulator_rule_directions(assertion);
        final SubLObject rr_properties = gather_reformulator_rule_properties(assertion);
        _csetf_refr_first_rt(rr, first_rt);
        _csetf_refr_second_rt(rr, second_rt);
        _csetf_refr_mt(rr, fortified_mt);
        _csetf_refr_wff_degree(rr, wff_degree);
        _csetf_refr_directions(rr, rr_directions);
        _csetf_refr_assertion(rr, assertion);
        _csetf_refr_rule_pred(rr, rr_rule_pred);
        _csetf_refr_preconditions(rr, rr_preconditions);
        _csetf_refr_properties(rr, rr_properties);
        return rr;
    }

    public static SubLObject new_reformulator_template(final SubLObject assertion, final SubLObject expression, final SubLObject mt, final SubLObject rule_pred, final SubLObject shared_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == collection_defns.cycl_expressionP(expression)) {
                Errors.warn($str90$Encountered__A_which_is_not_a_CYC, expression, assertion);
                errorP = T;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != errorP) {
            return NIL;
        }
        assert NIL != hlmt.chlmt_p(mt) : "hlmt.chlmt_p(mt) " + "CommonSymbols.NIL != hlmt.chlmt_p(mt) " + mt;
        final SubLObject rt = make_reformulator_template(UNPROVIDED);
        final SubLObject fortified_mt = cycl_utilities.reify_when_closed_naut(mt);
        _csetf_rt_expression(rt, expression);
        _csetf_rt_mt(rt, fortified_mt);
        return canonicalize_reformulator_template(rt, rule_pred, shared_vars);
    }

    public static SubLObject canonicalize_reformulator_template(final SubLObject rt, final SubLObject rule_pred, final SubLObject shared_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canon_expression = reformulator_hub.canonicalize_reformulator_expression(reformulator_template_expression(rt), reformulator_template_mt(rt), T, NIL, rule_pred);
        final SubLObject wff_degree = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == canon_expression) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject hl_var_expr = reformulator_transform_shared_el_vars_to_hl_vars(canon_expression, shared_vars);
        final SubLObject shared_var_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        _csetf_rt_expression(rt, hl_var_expr);
        _csetf_rt_shared_var_bindings(rt, shared_var_bindings);
        _csetf_rt_forts(rt, reformulator_relevant_forts(canon_expression));
        return values(rt, wff_degree);
    }

    public static SubLObject compute_wff_degree_for_reformulator_rule(final SubLObject wff_degrees) {
        SubLObject result = NIL;
        if (NIL != member($NONE, wff_degrees, UNPROVIDED, UNPROVIDED)) {
            result = $NONE;
        } else
            if (NIL != member($KB, wff_degrees, UNPROVIDED, UNPROVIDED)) {
                result = $KB;
            } else
                if (NIL != member($ARITY, wff_degrees, UNPROVIDED, UNPROVIDED)) {
                    result = $ARITY;
                } else
                    if (NIL != member($ALL, wff_degrees, UNPROVIDED, UNPROVIDED)) {
                        result = $ALL;
                    }



        return result;
    }

    public static SubLObject with_reformulator_variable_variables(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject shared_vars = NIL;
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list95);
        shared_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list95);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject highest_var_num = $sym96$HIGHEST_VAR_NUM;
            return listS(CLET, list(list($reformulator_shared_vars$, shared_vars), $list99, list(highest_var_num, list(SAFE_MAX, list(MAPCAR, $list102, listS(EXPRESSION_GATHER, expression, $list104)))), list($reformulator_next_available_hl_var_num$, highest_var_num)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list95);
        return NIL;
    }

    public static SubLObject reformulator_transform_shared_el_vars_to_hl_vars(final SubLObject expression, final SubLObject shared_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject v_bindings = NIL;
        final SubLObject _prev_bind_0 = $reformulator_shared_vars$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $reformulator_shared_var_bindings$.currentBinding(thread);
        try {
            $reformulator_shared_vars$.bind(shared_vars, thread);
            $reformulator_shared_var_bindings$.bind(NIL, thread);
            final SubLObject highest_var_num = list_utilities.safe_max(Mapping.mapcar(VARIABLE_ID, cycl_utilities.expression_gather(expression, symbol_function(VARIABLE_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = $reformulator_next_available_hl_var_num$.currentBinding(thread);
            try {
                $reformulator_next_available_hl_var_num$.bind(highest_var_num, thread);
                result = cycl_utilities.expression_transform(expression, $sym108$REFORMULATOR_SHARED_EL_VAR_OR_DONT_CARE_VAR_, REFORMULATOR_APPROPRIATE_HL_VAR, T, UNPROVIDED);
                v_bindings = $reformulator_shared_var_bindings$.getDynamicValue(thread);
            } finally {
                $reformulator_next_available_hl_var_num$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            $reformulator_shared_var_bindings$.rebind(_prev_bind_2, thread);
            $reformulator_shared_vars$.rebind(_prev_bind_0, thread);
        }
        return values(result, v_bindings);
    }

    public static SubLObject reformulator_shared_el_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $reformulator_shared_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject reformulator_shared_el_var_or_dont_care_varP(final SubLObject v_object) {
        return makeBoolean((NIL != reformulator_shared_el_varP(v_object)) || (NIL != cycl_variables.dont_care_varP(v_object)));
    }

    public static SubLObject reformulator_appropriate_hl_var(final SubLObject el_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject binding = assoc(el_var, $reformulator_shared_var_bindings$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL != binding) {
            return binding.rest();
        }
        final SubLObject id = $reformulator_next_available_hl_var_num$.getDynamicValue(thread);
        final SubLObject hl_var = variables.find_variable_by_id(id);
        $reformulator_next_available_hl_var_num$.setDynamicValue(add($reformulator_next_available_hl_var_num$.getDynamicValue(thread), ONE_INTEGER), thread);
        $reformulator_shared_var_bindings$.setDynamicValue(cons(cons(el_var, hl_var), $reformulator_shared_var_bindings$.getDynamicValue(thread)), thread);
        return hl_var;
    }

    public static SubLObject reformulator_dwim_skolem(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_skolem = copy_tree(skolem);
        final SubLObject doomed_skolem_cons = new_skolem.rest();
        final SubLObject replacement_var = variables.find_variable_by_id($reformulator_next_available_hl_var_num$.getDynamicValue(thread));
        note_reformulator_skolem_dwimming(doomed_skolem_cons.first(), replacement_var);
        rplaca(doomed_skolem_cons, replacement_var);
        $reformulator_next_available_hl_var_num$.setDynamicValue(add($reformulator_next_available_hl_var_num$.getDynamicValue(thread), ONE_INTEGER), thread);
        return new_skolem;
    }

    public static SubLObject reformulator_dwim_skolems(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.expression_find_if($sym110$UNREIFIED_SKOLEM_TERM_, expression, UNPROVIDED, UNPROVIDED)) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = $reformulator_shared_vars$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $reformulator_shared_var_bindings$.currentBinding(thread);
            try {
                $reformulator_shared_vars$.bind(NIL, thread);
                $reformulator_shared_var_bindings$.bind(NIL, thread);
                final SubLObject highest_var_num = list_utilities.safe_max(Mapping.mapcar(VARIABLE_ID, cycl_utilities.expression_gather(expression, symbol_function(VARIABLE_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = $reformulator_next_available_hl_var_num$.currentBinding(thread);
                try {
                    $reformulator_next_available_hl_var_num$.bind(highest_var_num, thread);
                    result = transform_list_utilities.transform(expression, $sym110$UNREIFIED_SKOLEM_TERM_, REFORMULATOR_DWIM_SKOLEM, UNPROVIDED);
                } finally {
                    $reformulator_next_available_hl_var_num$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                $reformulator_shared_var_bindings$.rebind(_prev_bind_2, thread);
                $reformulator_shared_vars$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return expression;
    }

    public static SubLObject reformulator_undwim_skolems(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nsublis($reformulator_skolem_dwimming_space$.getDynamicValue(thread), expression, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject note_reformulator_skolem_dwimming(final SubLObject sane, final SubLObject crazy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject future_crazy = ((NIL != cycl_grammar.hl_variable_p(crazy)) && variables.variable_id(crazy).numL($int$100)) ? variables.get_variable(add(variables.variable_id(crazy), $int$100)) : crazy;
        $reformulator_skolem_dwimming_space$.setDynamicValue(cons(cons(future_crazy, sane), $reformulator_skolem_dwimming_space$.getDynamicValue(thread)), thread);
        return $reformulator_skolem_dwimming_space$.getDynamicValue(thread);
    }

    public static SubLObject rru_clean_up_skolem_function_fns(SubLObject target_expr) {
        SubLObject cdolist_list_var = list_utilities.tree_find_all_if($sym113$REFORMULATOR_SKOLEM_FUNCTION_FN_TO_CLEAN_UP_, target_expr, UNPROVIDED);
        SubLObject dirty_skolem_function_fn_expression = NIL;
        dirty_skolem_function_fn_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            target_expr = list_utilities.tree_substitute(target_expr, dirty_skolem_function_fn_expression, reformulator_skolem_function_fn_clean(dirty_skolem_function_fn_expression));
            cdolist_list_var = cdolist_list_var.rest();
            dirty_skolem_function_fn_expression = cdolist_list_var.first();
        } 
        return target_expr;
    }

    public static SubLObject reformulator_skolem_function_fn_to_clean_upP(final SubLObject expression) {
        return makeBoolean($$SkolemFunctionFn.eql(cycl_utilities.formula_arg0(expression)) && (NIL != list_utilities.find_if_not($sym115$EL_VARIABLE_, cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject reformulator_skolem_function_fn_clean(final SubLObject expression) {
        if ($$SkolemFunctionFn.eql(cycl_utilities.formula_arg0(expression))) {
            return make_ternary_formula($$SkolemFunctionFn, list_utilities.remove_if_not($sym115$EL_VARIABLE_, cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.formula_arg2(expression, UNPROVIDED), cycl_utilities.formula_arg3(expression, UNPROVIDED));
        }
        return expression;
    }

    public static SubLObject reformulation_precondition_assertions(final SubLObject rule_assertion) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions_low.assertion_index(rule_assertion);
        SubLObject meta_ass = NIL;
        meta_ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_utilities.gaf_assertion_with_pred_p(meta_ass, $$reformulationPrecondition)) && (NIL == assertions_high.code_assertionP(meta_ass))) {
                result = cons(reformulation_precondition_struct(meta_ass), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_ass = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject reformulation_precondition_struct(final SubLObject precondition_ass) {
        final SubLObject direction = precondition_assertion_direction_arg(precondition_ass);
        final SubLObject precondition = precondition_assertion_precondition_arg(precondition_ass);
        final SubLObject mt = assertions_high.assertion_mt(precondition_ass);
        return list(direction, precondition, mt);
    }

    public static SubLObject precondition_assertion_direction_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg1(assertion);
    }

    public static SubLObject precondition_assertion_precondition_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg2(assertion);
    }

    public static SubLObject precondition_assertion_rule_assertion_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg3(assertion);
    }

    public static SubLObject gather_reformulator_rule_directions(final SubLObject rule_assertion) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions_low.assertion_index(rule_assertion);
        SubLObject meta_ass = NIL;
        meta_ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_utilities.gaf_assertion_with_pred_p(meta_ass, $$reformulationDirectionInMode)) && (NIL == assertions_high.code_assertionP(meta_ass))) {
                final SubLObject direction = direction_in_mode_assertion_direction_arg(meta_ass);
                final SubLObject mode = direction_in_mode_assertion_mode_arg(meta_ass);
                final SubLObject mt = assertions_high.assertion_mt(meta_ass);
                final SubLObject direction_struct = construct_reformulation_direction_struct(direction, mt);
                result = add_direction_struct_for_mode(mode, direction_struct, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_ass = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject add_direction_struct_for_mode(final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list) {
        SubLObject current_pairs = directions_for_mode(mode, current_direction_list);
        current_pairs = reformulator_datastructures.add_reformulator_info(direction_struct, current_pairs);
        current_direction_list = substitute_directions_for_mode(mode, current_pairs, current_direction_list);
        return current_direction_list;
    }

    public static SubLObject remove_direction_struct_for_mode(final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list) {
        SubLObject current_pairs = directions_for_mode(mode, current_direction_list);
        if (NIL != current_pairs) {
            current_pairs = reformulator_datastructures.remove_reformulator_info(direction_struct, current_pairs);
            current_direction_list = substitute_directions_for_mode(mode, current_pairs, current_direction_list);
        }
        return current_direction_list;
    }

    public static SubLObject directions_for_mode(final SubLObject mode, final SubLObject directions) {
        return getf(directions, mode, UNPROVIDED);
    }

    public static SubLObject substitute_directions_for_mode(final SubLObject mode, final SubLObject new_directions_for_mode, final SubLObject direction_list) {
        return putf(remf(direction_list, mode), mode, new_directions_for_mode);
    }

    public static SubLObject construct_reformulation_direction_struct(final SubLObject direction, final SubLObject mt) {
        return list(direction, mt);
    }

    public static SubLObject direction_in_mode_assertion_direction_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg1(assertion);
    }

    public static SubLObject direction_in_mode_assertion_mode_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg2(assertion);
    }

    public static SubLObject direction_in_mode_assertion_rule_assertion_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg3(assertion);
    }

    public static SubLObject gather_reformulator_rule_properties(final SubLObject rule_assertion) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions_low.assertion_index(rule_assertion);
        SubLObject meta_ass = NIL;
        meta_ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_utilities.gaf_assertion_with_pred_p(meta_ass, $$reformulatorRuleProperties)) && (NIL == assertions_high.code_assertionP(meta_ass))) {
                final SubLObject property = reformulator_rule_property_assertion_property_arg(meta_ass);
                final SubLObject mt = assertions_high.assertion_mt(meta_ass);
                final SubLObject property_struct = construct_rule_property_struct(property, mt);
                result = reformulator_datastructures.add_reformulator_info(property_struct, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_ass = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject construct_rule_property_struct(final SubLObject property, final SubLObject mt) {
        return list(property, mt);
    }

    public static SubLObject reformulator_rule_property_assertion_property_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg1(assertion);
    }

    public static SubLObject reformulator_rule_property_assertion_rule_assertion_arg(final SubLObject assertion) {
        return assertions_high.gaf_arg2(assertion);
    }

    public static SubLObject kb_reformulator_relevant_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = reformulator_datastructures.reformulator_relevant_predicates();
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                total = add(total, kb_indexing.num_predicate_extent_index(pred, UNPROVIDED));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject kb_reformulator_rule_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = reformulator_datastructures.reformulator_rule_predicates();
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                total = add(total, kb_indexing.num_predicate_extent_index(pred, UNPROVIDED));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject reformulator_relevant_fortP(final SubLObject fort) {
        return makeBoolean(((NIL == subl_promotions.memberP(fort, reformulator_datastructures.reformulator_irrelevant_forts(), UNPROVIDED, UNPROVIDED)) && (NIL == cyc_const_logical_operator_p(fort))) && (NIL == cyc_const_quantifier_p(fort)));
    }

    public static SubLObject reformulator_relevant_forts(final SubLObject expression) {
        return kb_utilities.sort_forts(list_utilities.delete_if_not($sym119$REFORMULATOR_RELEVANT_FORT_, cycl_utilities.expression_constants(expression, T), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject reformulator_highly_relevant_fortP(final SubLObject fort, final SubLObject mt) {
        return isa.isaP(fort, $$ReformulatorHighlyRelevantFORT, mt, UNPROVIDED);
    }

    public static SubLObject expansion_ruleP(final SubLObject assertion) {
        return assertion_utilities.gaf_assertion_with_pred_p(assertion, $$expansion);
    }

    public static SubLObject rewrite_ruleP(final SubLObject assertion) {
        return assertion_utilities.gaf_assertion_with_pred_p(assertion, $$rewriteOf);
    }

    public static SubLObject cycl_reformulation_ruleP(final SubLObject assertion) {
        return assertion_utilities.gaf_assertion_with_any_of_preds_p(assertion, reformulator_datastructures.reformulator_rule_spec_preds());
    }

    public static SubLObject generic_arg_to_default_el_var(final SubLObject generic_arg) {
        return variables.default_el_var_for_hl_var(tersifier.generic_arg_to_hl_var(generic_arg));
    }

    public static SubLObject find_default_el_var_by_id(final SubLObject id) {
        return variables.default_el_var_for_hl_var(variables.find_variable_by_id(id));
    }

    public static SubLObject el_relation_expansion_assertionP(final SubLObject assertion) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(assertion)) && $$expansion.eql(assertions_high.gaf_arg0(assertion))) && (NIL != isa.isaP(assertions_high.gaf_arg1(assertion), $$ELRelation, assertions_high.assertion_mt(assertion), UNPROVIDED)));
    }

    public static SubLObject rebuild_reformulator_rules() {
        reformulator_datastructures.initialize_reformulator();
        return NIL;
    }

    public static SubLObject dump_reformulator_rules_to_stream(final SubLObject stream) {
        cfasl_output(ONE_INTEGER, stream);
        cfasl_output(reformulator_datastructures.reformulator_rule_count(), stream);
        final SubLObject cdohash_table = reformulator_rules();
        SubLObject key = NIL;
        SubLObject rr = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                rr = getEntryValue(cdohash_entry);
                output_reformulator_rule_to_stream(rr, stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        cfasl_output($fort_reformulator_rule_table$.getGlobalValue(), stream);
        cfasl_output($constant_reformulator_rule_table$.getGlobalValue(), stream);
        cfasl_output($nart_reformulator_rule_table$.getGlobalValue(), stream);
        cfasl_output(reformulator_datastructures.unassociated_reformulator_rule_count(), stream);
        SubLObject cdolist_list_var = unassociated_reformulator_rules();
        SubLObject rr2 = NIL;
        rr2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != gethash_without_values(refr_assertion(rr2), $reformulator_rules$.getGlobalValue(), UNPROVIDED)) {
                cfasl_output(refr_assertion(rr2), stream);
            } else {
                output_reformulator_rule_to_stream(rr2, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rr2 = cdolist_list_var.first();
        } 
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static SubLObject load_reformulator_rules_from_stream(final SubLObject stream) {
        final SubLObject version_number = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (!version_number.eql(ONE_INTEGER)) {
            Errors.warn($str124$This_code_can_only_handle_reformu, version_number);
        }
        final SubLObject rr_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        $reformulator_rules$.setGlobalValue(make_hash_table(rr_count, symbol_function(EQL), UNPROVIDED));
        SubLObject i;
        SubLObject rr;
        for (i = NIL, i = ZERO_INTEGER; i.numL(rr_count); i = add(i, ONE_INTEGER)) {
            rr = load_reformulator_rule_from_stream(stream);
            sethash(refr_assertion(rr), $reformulator_rules$.getGlobalValue(), rr);
        }
        $fort_reformulator_rule_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $constant_reformulator_rule_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        $nart_reformulator_rule_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        SubLObject unassociated_rr_count;
        SubLObject rr_spec;
        SubLObject rr2;
        for (unassociated_rr_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(unassociated_rr_count); i = add(i, ONE_INTEGER)) {
            rr_spec = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            rr2 = NIL;
            if (NIL != assertion_handles.assertion_p(rr_spec)) {
                rr2 = gethash_without_values(rr_spec, $reformulator_rules$.getGlobalValue(), UNPROVIDED);
            } else {
                rr2 = rr_spec;
            }
            $unassociated_reformulator_rules$.setGlobalValue(cons(rr2, $unassociated_reformulator_rules$.getGlobalValue()));
        }
        $unassociated_reformulator_rules$.setGlobalValue(nreverse($unassociated_reformulator_rules$.getGlobalValue()));
        cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject output_reformulator_rule_to_stream(final SubLObject rr, final SubLObject stream) {
        output_reformulator_template_to_stream(refr_first_rt(rr), stream);
        output_reformulator_template_to_stream(refr_second_rt(rr), stream);
        cfasl_output(refr_mt(rr), stream);
        cfasl_output(refr_wff_degree(rr), stream);
        cfasl_output(refr_directions(rr), stream);
        cfasl_output(refr_assertion(rr), stream);
        cfasl_output(refr_rule_pred(rr), stream);
        cfasl_output(refr_preconditions(rr), stream);
        cfasl_output(refr_properties(rr), stream);
        return rr;
    }

    public static SubLObject load_reformulator_rule_from_stream(final SubLObject stream) {
        final SubLObject first_rt = load_reformulator_template_from_stream(stream);
        final SubLObject second_rt = load_reformulator_template_from_stream(stream);
        final SubLObject rr = make_reformulator_rule(UNPROVIDED);
        _csetf_refr_first_rt(rr, first_rt);
        _csetf_refr_second_rt(rr, second_rt);
        _csetf_refr_mt(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_refr_wff_degree(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_refr_directions(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_refr_assertion(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_refr_rule_pred(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_refr_preconditions(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_refr_properties(rr, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return rr;
    }

    public static SubLObject output_reformulator_template_to_stream(final SubLObject rt, final SubLObject stream) {
        cfasl_output(rt_expression(rt), stream);
        cfasl_output(rt_shared_var_bindings(rt), stream);
        cfasl_output(rt_mt(rt), stream);
        cfasl_output(rt_forts(rt), stream);
        return rt;
    }

    public static SubLObject load_reformulator_template_from_stream(final SubLObject stream) {
        final SubLObject rt = make_reformulator_template(UNPROVIDED);
        _csetf_rt_expression(rt, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_rt_shared_var_bindings(rt, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_rt_mt(rt, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_rt_forts(rt, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return rt;
    }

    public static SubLObject possibly_convert_reformulator_datastructures_from_ids_to_assertions() {
        SubLObject did_somethingP = NIL;
        if (NIL != possibly_convert_reformulator_rules_table_from_ids_to_assertions()) {
            did_somethingP = T;
        }
        if (NIL != possibly_convert_fort_reformulator_rules_table_from_ids_to_assertions()) {
            did_somethingP = T;
        }
        if (NIL != possibly_convert_constant_reformulator_rules_table_from_ids_to_assertions()) {
            did_somethingP = T;
        }
        if (NIL != possibly_convert_nart_reformulator_rules_table_from_ids_to_assertions()) {
            did_somethingP = T;
        }
        return did_somethingP;
    }

    public static SubLObject possibly_convert_reformulator_rules_table_from_ids_to_assertions() {
        if ($reformulator_rules$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_key($reformulator_rules$.getGlobalValue()).isInteger()) {
            SubLObject cdolist_list_var;
            final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist($reformulator_rules$.getGlobalValue());
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject id = pair.first();
                final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                final SubLObject rr = pair.rest();
                convert_rr_from_id_to_assertion(rr);
                rplaca(pair, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
            $reformulator_rules$.setGlobalValue(hash_table_utilities.new_hash_table_from_alist(alist, symbol_function(EQL)));
            return T;
        }
        return NIL;
    }

    public static SubLObject convert_rr_from_id_to_assertion(final SubLObject rr) {
        final SubLObject id = refr_assertion(rr);
        if (id.isInteger()) {
            final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
            _csetf_refr_assertion(rr, assertion);
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_convert_fort_reformulator_rules_table_from_ids_to_assertions() {
        if ($fort_reformulator_rule_table$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_value($fort_reformulator_rule_table$.getGlobalValue()).first().isInteger()) {
            SubLObject cdolist_list_var;
            final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist($fort_reformulator_rule_table$.getGlobalValue());
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject ids = NIL;
                destructuring_bind_must_consp(current, datum, $list125);
                key = current.first();
                current = ids = current.rest();
                SubLObject cons_$9;
                for (cons_$9 = NIL, cons_$9 = ids; !cons_$9.isAtom(); cons_$9 = cons_$9.rest()) {
                    rplaca(cons_$9, assertion_handles.find_assertion_by_id(cons_$9.first()));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            $fort_reformulator_rule_table$.setGlobalValue(hash_table_utilities.new_hash_table_from_alist(alist, symbol_function(EQL)));
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_convert_constant_reformulator_rules_table_from_ids_to_assertions() {
        if ($constant_reformulator_rule_table$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_value($constant_reformulator_rule_table$.getGlobalValue()).first().isInteger()) {
            SubLObject cdolist_list_var;
            final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist($constant_reformulator_rule_table$.getGlobalValue());
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject ids = NIL;
                destructuring_bind_must_consp(current, datum, $list125);
                key = current.first();
                current = ids = current.rest();
                SubLObject cons_$10;
                for (cons_$10 = NIL, cons_$10 = ids; !cons_$10.isAtom(); cons_$10 = cons_$10.rest()) {
                    rplaca(cons_$10, assertion_handles.find_assertion_by_id(cons_$10.first()));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            $constant_reformulator_rule_table$.setGlobalValue(hash_table_utilities.new_hash_table_from_alist(alist, symbol_function(EQL)));
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_convert_nart_reformulator_rules_table_from_ids_to_assertions() {
        if ($nart_reformulator_rule_table$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_value($nart_reformulator_rule_table$.getGlobalValue()).first().isInteger()) {
            SubLObject cdolist_list_var;
            final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist($nart_reformulator_rule_table$.getGlobalValue());
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject ids = NIL;
                destructuring_bind_must_consp(current, datum, $list125);
                key = current.first();
                current = ids = current.rest();
                SubLObject cons_$11;
                for (cons_$11 = NIL, cons_$11 = ids; !cons_$11.isAtom(); cons_$11 = cons_$11.rest()) {
                    rplaca(cons_$11, assertion_handles.find_assertion_by_id(cons_$11.first()));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            $nart_reformulator_rule_table$.setGlobalValue(hash_table_utilities.new_hash_table_from_alist(alist, symbol_function(EQL)));
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_rule_unifier_datastructures_file() {
        declareFunction(me, "reformulator_template_print_function_trampoline", "REFORMULATOR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "reformulator_template_p", "REFORMULATOR-TEMPLATE-P", 1, 0, false);
        new reformulator_rule_unifier_datastructures.$reformulator_template_p$UnaryFunction();
        declareFunction(me, "rt_expression", "RT-EXPRESSION", 1, 0, false);
        declareFunction(me, "rt_shared_var_bindings", "RT-SHARED-VAR-BINDINGS", 1, 0, false);
        declareFunction(me, "rt_mt", "RT-MT", 1, 0, false);
        declareFunction(me, "rt_forts", "RT-FORTS", 1, 0, false);
        declareFunction(me, "_csetf_rt_expression", "_CSETF-RT-EXPRESSION", 2, 0, false);
        declareFunction(me, "_csetf_rt_shared_var_bindings", "_CSETF-RT-SHARED-VAR-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_rt_mt", "_CSETF-RT-MT", 2, 0, false);
        declareFunction(me, "_csetf_rt_forts", "_CSETF-RT-FORTS", 2, 0, false);
        declareFunction(me, "make_reformulator_template", "MAKE-REFORMULATOR-TEMPLATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_reformulator_template", "VISIT-DEFSTRUCT-REFORMULATOR-TEMPLATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_reformulator_template_method", "VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-TEMPLATE-METHOD", 2, 0, false);
        declareFunction(me, "reformulator_rule_print_function_trampoline", "REFORMULATOR-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "reformulator_rule_p", "REFORMULATOR-RULE-P", 1, 0, false);
        new reformulator_rule_unifier_datastructures.$reformulator_rule_p$UnaryFunction();
        declareFunction(me, "refr_first_rt", "REFR-FIRST-RT", 1, 0, false);
        declareFunction(me, "refr_second_rt", "REFR-SECOND-RT", 1, 0, false);
        declareFunction(me, "refr_mt", "REFR-MT", 1, 0, false);
        declareFunction(me, "refr_wff_degree", "REFR-WFF-DEGREE", 1, 0, false);
        declareFunction(me, "refr_directions", "REFR-DIRECTIONS", 1, 0, false);
        declareFunction(me, "refr_assertion", "REFR-ASSERTION", 1, 0, false);
        declareFunction(me, "refr_rule_pred", "REFR-RULE-PRED", 1, 0, false);
        declareFunction(me, "refr_preconditions", "REFR-PRECONDITIONS", 1, 0, false);
        declareFunction(me, "refr_properties", "REFR-PROPERTIES", 1, 0, false);
        declareFunction(me, "_csetf_refr_first_rt", "_CSETF-REFR-FIRST-RT", 2, 0, false);
        declareFunction(me, "_csetf_refr_second_rt", "_CSETF-REFR-SECOND-RT", 2, 0, false);
        declareFunction(me, "_csetf_refr_mt", "_CSETF-REFR-MT", 2, 0, false);
        declareFunction(me, "_csetf_refr_wff_degree", "_CSETF-REFR-WFF-DEGREE", 2, 0, false);
        declareFunction(me, "_csetf_refr_directions", "_CSETF-REFR-DIRECTIONS", 2, 0, false);
        declareFunction(me, "_csetf_refr_assertion", "_CSETF-REFR-ASSERTION", 2, 0, false);
        declareFunction(me, "_csetf_refr_rule_pred", "_CSETF-REFR-RULE-PRED", 2, 0, false);
        declareFunction(me, "_csetf_refr_preconditions", "_CSETF-REFR-PRECONDITIONS", 2, 0, false);
        declareFunction(me, "_csetf_refr_properties", "_CSETF-REFR-PROPERTIES", 2, 0, false);
        declareFunction(me, "make_reformulator_rule", "MAKE-REFORMULATOR-RULE", 0, 1, false);
        declareFunction(me, "visit_defstruct_reformulator_rule", "VISIT-DEFSTRUCT-REFORMULATOR-RULE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_reformulator_rule_method", "VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-RULE-METHOD", 2, 0, false);
        declareFunction(me, "print_reformulator_template", "PRINT-REFORMULATOR-TEMPLATE", 3, 1, false);
        declareFunction(me, "reformulator_template_expression", "REFORMULATOR-TEMPLATE-EXPRESSION", 1, 0, false);
        declareFunction(me, "reformulator_template_el_var_expression", "REFORMULATOR-TEMPLATE-EL-VAR-EXPRESSION", 1, 0, false);
        declareFunction(me, "reformulator_template_shared_var_bindings", "REFORMULATOR-TEMPLATE-SHARED-VAR-BINDINGS", 1, 0, false);
        declareFunction(me, "reformulator_template_mt", "REFORMULATOR-TEMPLATE-MT", 1, 0, false);
        declareFunction(me, "reformulator_template_forts", "REFORMULATOR-TEMPLATE-FORTS", 1, 0, false);
        declareFunction(me, "reformulator_template_clausesP", "REFORMULATOR-TEMPLATE-CLAUSES?", 1, 0, false);
        declareFunction(me, "print_reformulator_rule", "PRINT-REFORMULATOR-RULE", 3, 1, false);
        declareFunction(me, "reformulator_rule_first_rt", "REFORMULATOR-RULE-FIRST-RT", 1, 0, false);
        declareFunction(me, "reformulator_rule_second_rt", "REFORMULATOR-RULE-SECOND-RT", 1, 0, false);
        declareFunction(me, "reformulator_rule_source_rt", "REFORMULATOR-RULE-SOURCE-RT", 2, 0, false);
        declareFunction(me, "reformulator_rule_target_rt", "REFORMULATOR-RULE-TARGET-RT", 2, 0, false);
        declareFunction(me, "reformulator_rule_first_shared_var_bindings", "REFORMULATOR-RULE-FIRST-SHARED-VAR-BINDINGS", 1, 0, false);
        declareFunction(me, "reformulator_rule_second_shared_var_bindings", "REFORMULATOR-RULE-SECOND-SHARED-VAR-BINDINGS", 1, 0, false);
        declareFunction(me, "reformulator_rule_source_shared_var_bindings", "REFORMULATOR-RULE-SOURCE-SHARED-VAR-BINDINGS", 2, 0, false);
        declareFunction(me, "reformulator_rule_target_shared_var_bindings", "REFORMULATOR-RULE-TARGET-SHARED-VAR-BINDINGS", 2, 0, false);
        declareFunction(me, "reformulator_rule_mt", "REFORMULATOR-RULE-MT", 1, 0, false);
        declareFunction(me, "reformulator_rule_wff_degree", "REFORMULATOR-RULE-WFF-DEGREE", 1, 0, false);
        declareFunction(me, "reformulator_rule_directions", "REFORMULATOR-RULE-DIRECTIONS", 1, 0, false);
        declareFunction(me, "reformulator_rule_assertion", "REFORMULATOR-RULE-ASSERTION", 1, 0, false);
        declareFunction(me, "reformulator_rule_assertion_id", "REFORMULATOR-RULE-ASSERTION-ID", 1, 0, false);
        declareFunction(me, "reformulator_rule_rule_pred", "REFORMULATOR-RULE-RULE-PRED", 1, 0, false);
        declareFunction(me, "reformulator_rule_preconditions", "REFORMULATOR-RULE-PRECONDITIONS", 1, 0, false);
        declareFunction(me, "reformulator_rule_properties", "REFORMULATOR-RULE-PROPERTIES", 1, 0, false);
        declareFunction(me, "reformulator_rules", "REFORMULATOR-RULES", 0, 0, false);
        declareFunction(me, "fort_reformulator_rule_table", "FORT-REFORMULATOR-RULE-TABLE", 0, 0, false);
        declareFunction(me, "constant_reformulator_rule_table", "CONSTANT-REFORMULATOR-RULE-TABLE", 0, 0, false);
        declareFunction(me, "nart_reformulator_rule_table", "NART-REFORMULATOR-RULE-TABLE", 0, 0, false);
        declareFunction(me, "unassociated_reformulator_rules", "UNASSOCIATED-REFORMULATOR-RULES", 0, 0, false);
        declareFunction(me, "add_reformulator_rule_assertion", "ADD-REFORMULATOR-RULE-ASSERTION", 1, 1, false);
        declareFunction(me, "add_reformulator_precondition_assertion", "ADD-REFORMULATOR-PRECONDITION-ASSERTION", 1, 0, false);
        declareFunction(me, "add_reformulation_direction_assertion", "ADD-REFORMULATION-DIRECTION-ASSERTION", 1, 0, false);
        declareFunction(me, "add_reformulator_rule_property_assertion", "ADD-REFORMULATOR-RULE-PROPERTY-ASSERTION", 1, 0, false);
        declareFunction(me, "remove_reformulator_rule_assertion", "REMOVE-REFORMULATOR-RULE-ASSERTION", 1, 0, false);
        declareFunction(me, "remove_reformulator_precondition_assertion", "REMOVE-REFORMULATOR-PRECONDITION-ASSERTION", 1, 0, false);
        declareFunction(me, "remove_reformulation_direction_assertion", "REMOVE-REFORMULATION-DIRECTION-ASSERTION", 1, 0, false);
        declareFunction(me, "remove_reformulator_rule_property_assertion", "REMOVE-REFORMULATOR-RULE-PROPERTY-ASSERTION", 1, 0, false);
        declareFunction(me, "add_reformulator_rule", "ADD-REFORMULATOR-RULE", 1, 1, false);
        declareFunction(me, "index_reformulator_template_expression_if_possible", "INDEX-REFORMULATOR-TEMPLATE-EXPRESSION-IF-POSSIBLE", 3, 0, false);
        declareFunction(me, "remove_reformulator_rule", "REMOVE-REFORMULATOR-RULE", 1, 0, false);
        declareFunction(me, "unindex_reformulator_template_expression_if_possible", "UNINDEX-REFORMULATOR-TEMPLATE-EXPRESSION-IF-POSSIBLE", 2, 0, false);
        declareFunction(me, "reformulator_rule_forts", "REFORMULATOR-RULE-FORTS", 1, 0, false);
        declareFunction(me, "initialize_reformulator_rules", "INITIALIZE-REFORMULATOR-RULES", 0, 0, false);
        declareFunction(me, "expected_reformulator_rule_count", "EXPECTED-REFORMULATOR-RULE-COUNT", 0, 0, false);
        declareFunction(me, "reformulation_assertion_to_reformulator_rule", "REFORMULATION-ASSERTION-TO-REFORMULATOR-RULE", 1, 0, false);
        declareFunction(me, "expansion_rule_to_reformulator_rule", "EXPANSION-RULE-TO-REFORMULATOR-RULE", 1, 0, false);
        declareFunction(me, "rewrite_rule_to_reformulator_rule", "REWRITE-RULE-TO-REFORMULATOR-RULE", 1, 0, false);
        declareFunction(me, "reformulation_rule_to_reformulator_rule", "REFORMULATION-RULE-TO-REFORMULATOR-RULE", 1, 0, false);
        declareFunction(me, "new_reformulator_rule", "NEW-REFORMULATOR-RULE", 5, 0, false);
        declareFunction(me, "new_reformulator_template", "NEW-REFORMULATOR-TEMPLATE", 5, 0, false);
        declareFunction(me, "canonicalize_reformulator_template", "CANONICALIZE-REFORMULATOR-TEMPLATE", 3, 0, false);
        declareFunction(me, "compute_wff_degree_for_reformulator_rule", "COMPUTE-WFF-DEGREE-FOR-REFORMULATOR-RULE", 1, 0, false);
        declareMacro(me, "with_reformulator_variable_variables", "WITH-REFORMULATOR-VARIABLE-VARIABLES");
        declareFunction(me, "reformulator_transform_shared_el_vars_to_hl_vars", "REFORMULATOR-TRANSFORM-SHARED-EL-VARS-TO-HL-VARS", 2, 0, false);
        declareFunction(me, "reformulator_shared_el_varP", "REFORMULATOR-SHARED-EL-VAR?", 1, 0, false);
        declareFunction(me, "reformulator_shared_el_var_or_dont_care_varP", "REFORMULATOR-SHARED-EL-VAR-OR-DONT-CARE-VAR?", 1, 0, false);
        declareFunction(me, "reformulator_appropriate_hl_var", "REFORMULATOR-APPROPRIATE-HL-VAR", 1, 0, false);
        declareFunction(me, "reformulator_dwim_skolem", "REFORMULATOR-DWIM-SKOLEM", 1, 0, false);
        declareFunction(me, "reformulator_dwim_skolems", "REFORMULATOR-DWIM-SKOLEMS", 1, 0, false);
        declareFunction(me, "reformulator_undwim_skolems", "REFORMULATOR-UNDWIM-SKOLEMS", 1, 0, false);
        declareFunction(me, "note_reformulator_skolem_dwimming", "NOTE-REFORMULATOR-SKOLEM-DWIMMING", 2, 0, false);
        declareFunction(me, "rru_clean_up_skolem_function_fns", "RRU-CLEAN-UP-SKOLEM-FUNCTION-FNS", 1, 0, false);
        declareFunction(me, "reformulator_skolem_function_fn_to_clean_upP", "REFORMULATOR-SKOLEM-FUNCTION-FN-TO-CLEAN-UP?", 1, 0, false);
        declareFunction(me, "reformulator_skolem_function_fn_clean", "REFORMULATOR-SKOLEM-FUNCTION-FN-CLEAN", 1, 0, false);
        declareFunction(me, "reformulation_precondition_assertions", "REFORMULATION-PRECONDITION-ASSERTIONS", 1, 0, false);
        declareFunction(me, "reformulation_precondition_struct", "REFORMULATION-PRECONDITION-STRUCT", 1, 0, false);
        declareFunction(me, "precondition_assertion_direction_arg", "PRECONDITION-ASSERTION-DIRECTION-ARG", 1, 0, false);
        declareFunction(me, "precondition_assertion_precondition_arg", "PRECONDITION-ASSERTION-PRECONDITION-ARG", 1, 0, false);
        declareFunction(me, "precondition_assertion_rule_assertion_arg", "PRECONDITION-ASSERTION-RULE-ASSERTION-ARG", 1, 0, false);
        declareFunction(me, "gather_reformulator_rule_directions", "GATHER-REFORMULATOR-RULE-DIRECTIONS", 1, 0, false);
        declareFunction(me, "add_direction_struct_for_mode", "ADD-DIRECTION-STRUCT-FOR-MODE", 3, 0, false);
        declareFunction(me, "remove_direction_struct_for_mode", "REMOVE-DIRECTION-STRUCT-FOR-MODE", 3, 0, false);
        declareFunction(me, "directions_for_mode", "DIRECTIONS-FOR-MODE", 2, 0, false);
        declareFunction(me, "substitute_directions_for_mode", "SUBSTITUTE-DIRECTIONS-FOR-MODE", 3, 0, false);
        declareFunction(me, "construct_reformulation_direction_struct", "CONSTRUCT-REFORMULATION-DIRECTION-STRUCT", 2, 0, false);
        declareFunction(me, "direction_in_mode_assertion_direction_arg", "DIRECTION-IN-MODE-ASSERTION-DIRECTION-ARG", 1, 0, false);
        declareFunction(me, "direction_in_mode_assertion_mode_arg", "DIRECTION-IN-MODE-ASSERTION-MODE-ARG", 1, 0, false);
        declareFunction(me, "direction_in_mode_assertion_rule_assertion_arg", "DIRECTION-IN-MODE-ASSERTION-RULE-ASSERTION-ARG", 1, 0, false);
        declareFunction(me, "gather_reformulator_rule_properties", "GATHER-REFORMULATOR-RULE-PROPERTIES", 1, 0, false);
        declareFunction(me, "construct_rule_property_struct", "CONSTRUCT-RULE-PROPERTY-STRUCT", 2, 0, false);
        declareFunction(me, "reformulator_rule_property_assertion_property_arg", "REFORMULATOR-RULE-PROPERTY-ASSERTION-PROPERTY-ARG", 1, 0, false);
        declareFunction(me, "reformulator_rule_property_assertion_rule_assertion_arg", "REFORMULATOR-RULE-PROPERTY-ASSERTION-RULE-ASSERTION-ARG", 1, 0, false);
        declareFunction(me, "kb_reformulator_relevant_assertion_count", "KB-REFORMULATOR-RELEVANT-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "kb_reformulator_rule_assertion_count", "KB-REFORMULATOR-RULE-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "reformulator_relevant_fortP", "REFORMULATOR-RELEVANT-FORT?", 1, 0, false);
        declareFunction(me, "reformulator_relevant_forts", "REFORMULATOR-RELEVANT-FORTS", 1, 0, false);
        declareFunction(me, "reformulator_highly_relevant_fortP", "REFORMULATOR-HIGHLY-RELEVANT-FORT?", 2, 0, false);
        declareFunction(me, "expansion_ruleP", "EXPANSION-RULE?", 1, 0, false);
        declareFunction(me, "rewrite_ruleP", "REWRITE-RULE?", 1, 0, false);
        declareFunction(me, "cycl_reformulation_ruleP", "CYCL-REFORMULATION-RULE?", 1, 0, false);
        declareFunction(me, "generic_arg_to_default_el_var", "GENERIC-ARG-TO-DEFAULT-EL-VAR", 1, 0, false);
        declareFunction(me, "find_default_el_var_by_id", "FIND-DEFAULT-EL-VAR-BY-ID", 1, 0, false);
        declareFunction(me, "el_relation_expansion_assertionP", "EL-RELATION-EXPANSION-ASSERTION?", 1, 0, false);
        declareFunction(me, "rebuild_reformulator_rules", "REBUILD-REFORMULATOR-RULES", 0, 0, false);
        declareFunction(me, "dump_reformulator_rules_to_stream", "DUMP-REFORMULATOR-RULES-TO-STREAM", 1, 0, false);
        declareFunction(me, "load_reformulator_rules_from_stream", "LOAD-REFORMULATOR-RULES-FROM-STREAM", 1, 0, false);
        declareFunction(me, "output_reformulator_rule_to_stream", "OUTPUT-REFORMULATOR-RULE-TO-STREAM", 2, 0, false);
        declareFunction(me, "load_reformulator_rule_from_stream", "LOAD-REFORMULATOR-RULE-FROM-STREAM", 1, 0, false);
        declareFunction(me, "output_reformulator_template_to_stream", "OUTPUT-REFORMULATOR-TEMPLATE-TO-STREAM", 2, 0, false);
        declareFunction(me, "load_reformulator_template_from_stream", "LOAD-REFORMULATOR-TEMPLATE-FROM-STREAM", 1, 0, false);
        declareFunction(me, "possibly_convert_reformulator_datastructures_from_ids_to_assertions", "POSSIBLY-CONVERT-REFORMULATOR-DATASTRUCTURES-FROM-IDS-TO-ASSERTIONS", 0, 0, false);
        declareFunction(me, "possibly_convert_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false);
        declareFunction(me, "convert_rr_from_id_to_assertion", "CONVERT-RR-FROM-ID-TO-ASSERTION", 1, 0, false);
        declareFunction(me, "possibly_convert_fort_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-FORT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false);
        declareFunction(me, "possibly_convert_constant_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-CONSTANT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false);
        declareFunction(me, "possibly_convert_nart_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-NART-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_rule_unifier_datastructures_file() {
        defconstant("*DTP-REFORMULATOR-TEMPLATE*", REFORMULATOR_TEMPLATE);
        defconstant("*DTP-REFORMULATOR-RULE*", REFORMULATOR_RULE);
        deflexical("*REFORMULATOR-RULES*", SubLSystemTrampolineFile.maybeDefault($reformulator_rules$, $reformulator_rules$, NIL));
        deflexical("*FORT-REFORMULATOR-RULE-TABLE*", SubLSystemTrampolineFile.maybeDefault($fort_reformulator_rule_table$, $fort_reformulator_rule_table$, NIL));
        deflexical("*CONSTANT-REFORMULATOR-RULE-TABLE*", SubLSystemTrampolineFile.maybeDefault($constant_reformulator_rule_table$, $constant_reformulator_rule_table$, NIL));
        deflexical("*NART-REFORMULATOR-RULE-TABLE*", SubLSystemTrampolineFile.maybeDefault($nart_reformulator_rule_table$, $nart_reformulator_rule_table$, NIL));
        deflexical("*UNASSOCIATED-REFORMULATOR-RULES*", SubLSystemTrampolineFile.maybeDefault($unassociated_reformulator_rules$, $unassociated_reformulator_rules$, NIL));
        defparameter("*REFORMULATOR-SHARED-VARS*", NIL);
        defparameter("*REFORMULATOR-SHARED-VAR-BINDINGS*", NIL);
        defparameter("*REFORMULATOR-NEXT-AVAILABLE-HL-VAR-NUM*", ZERO_INTEGER);
        defparameter("*REFORMULATOR-SKOLEM-DWIMMING-SPACE*", NIL);
        return NIL;
    }

    public static SubLObject setup_reformulator_rule_unifier_datastructures_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_reformulator_template$.getGlobalValue(), symbol_function(REFORMULATOR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RT_EXPRESSION, _CSETF_RT_EXPRESSION);
        def_csetf(RT_SHARED_VAR_BINDINGS, _CSETF_RT_SHARED_VAR_BINDINGS);
        def_csetf(RT_MT, _CSETF_RT_MT);
        def_csetf(RT_FORTS, _CSETF_RT_FORTS);
        identity(REFORMULATOR_TEMPLATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_reformulator_template$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_TEMPLATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_reformulator_rule$.getGlobalValue(), symbol_function(REFORMULATOR_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list35);
        def_csetf(REFR_FIRST_RT, _CSETF_REFR_FIRST_RT);
        def_csetf(REFR_SECOND_RT, _CSETF_REFR_SECOND_RT);
        def_csetf(REFR_MT, _CSETF_REFR_MT);
        def_csetf(REFR_WFF_DEGREE, _CSETF_REFR_WFF_DEGREE);
        def_csetf(REFR_DIRECTIONS, _CSETF_REFR_DIRECTIONS);
        def_csetf(REFR_ASSERTION, _CSETF_REFR_ASSERTION);
        def_csetf(REFR_RULE_PRED, _CSETF_REFR_RULE_PRED);
        def_csetf(REFR_PRECONDITIONS, _CSETF_REFR_PRECONDITIONS);
        def_csetf(REFR_PROPERTIES, _CSETF_REFR_PROPERTIES);
        identity(REFORMULATOR_RULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_reformulator_rule$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_RULE_METHOD));
        declare_defglobal($reformulator_rules$);
        declare_defglobal($fort_reformulator_rule_table$);
        declare_defglobal($constant_reformulator_rule_table$);
        declare_defglobal($nart_reformulator_rule_table$);
        declare_defglobal($unassociated_reformulator_rules$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_rule_unifier_datastructures_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_rule_unifier_datastructures_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_rule_unifier_datastructures_file();
    }

    

    public static final class $reformulator_template_native extends SubLStructNative {
        public SubLObject $expression;

        public SubLObject $shared_var_bindings;

        public SubLObject $mt;

        public SubLObject $forts;

        private static final SubLStructDeclNative structDecl;

        private $reformulator_template_native() {
            this.$expression = Lisp.NIL;
            this.$shared_var_bindings = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$forts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$expression;
        }

        @Override
        public SubLObject getField3() {
            return this.$shared_var_bindings;
        }

        @Override
        public SubLObject getField4() {
            return this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$forts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$expression = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$shared_var_bindings = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$forts = value;
        }

        static {
            structDecl = makeStructDeclNative($reformulator_template_native.class, REFORMULATOR_TEMPLATE, REFORMULATOR_TEMPLATE_P, $list2, $list3, new String[]{ "$expression", "$shared_var_bindings", "$mt", "$forts" }, $list4, $list5, PRINT_REFORMULATOR_TEMPLATE);
        }
    }

    public static final class $reformulator_template_p$UnaryFunction extends UnaryFunction {
        public $reformulator_template_p$UnaryFunction() {
            super(extractFunctionNamed("REFORMULATOR-TEMPLATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reformulator_template_p(arg1);
        }
    }

    public static final class $reformulator_rule_native extends SubLStructNative {
        public SubLObject $first_rt;

        public SubLObject $second_rt;

        public SubLObject $mt;

        public SubLObject $wff_degree;

        public SubLObject $directions;

        public SubLObject $assertion;

        public SubLObject $rule_pred;

        public SubLObject $preconditions;

        public SubLObject $properties;

        private static final SubLStructDeclNative structDecl;

        private $reformulator_rule_native() {
            this.$first_rt = Lisp.NIL;
            this.$second_rt = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$wff_degree = Lisp.NIL;
            this.$directions = Lisp.NIL;
            this.$assertion = Lisp.NIL;
            this.$rule_pred = Lisp.NIL;
            this.$preconditions = Lisp.NIL;
            this.$properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$first_rt;
        }

        @Override
        public SubLObject getField3() {
            return this.$second_rt;
        }

        @Override
        public SubLObject getField4() {
            return this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$wff_degree;
        }

        @Override
        public SubLObject getField6() {
            return this.$directions;
        }

        @Override
        public SubLObject getField7() {
            return this.$assertion;
        }

        @Override
        public SubLObject getField8() {
            return this.$rule_pred;
        }

        @Override
        public SubLObject getField9() {
            return this.$preconditions;
        }

        @Override
        public SubLObject getField10() {
            return this.$properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$first_rt = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$second_rt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$wff_degree = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$directions = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$assertion = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$rule_pred = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$preconditions = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$properties = value;
        }

        static {
            structDecl = makeStructDeclNative($reformulator_rule_native.class, REFORMULATOR_RULE, REFORMULATOR_RULE_P, $list29, $list30, new String[]{ "$first_rt", "$second_rt", "$mt", "$wff_degree", "$directions", "$assertion", "$rule_pred", "$preconditions", "$properties" }, $list31, $list32, PRINT_REFORMULATOR_RULE);
        }
    }

    public static final class $reformulator_rule_p$UnaryFunction extends UnaryFunction {
        public $reformulator_rule_p$UnaryFunction() {
            super(extractFunctionNamed("REFORMULATOR-RULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reformulator_rule_p(arg1);
        }
    }
}

/**
 * Total time: 456 ms
 */
