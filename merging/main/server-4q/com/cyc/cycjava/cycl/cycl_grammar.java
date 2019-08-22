/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.butlast_of_sequence;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_binary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_bounded_existential_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_generalized_tense_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_multi_quantifier_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quantifier_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quaternary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quintary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_regular_quantifier_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_tense_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_ternary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_unary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_variable_arity_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_sequence_p;
import static com.cyc.cycjava.cycl.el_utilities.epsilon_p;
import static com.cyc.cycjava.cycl.el_utilities.every_in_sequence;
import static com.cyc.cycjava.cycl.el_utilities.first_in_sequence;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.function_specP;
import static com.cyc.cycjava.cycl.el_utilities.last_of_sequence;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.predicate_specP;
import static com.cyc.cycjava.cycl.el_utilities.rest_of_sequence;
import static com.cyc.cycjava.cycl.el_utilities.sequence_non_var;
import static com.cyc.cycjava.cycl.el_utilities.user_defined_bounded_existential_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.user_defined_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.wf_wrt_sequence_varsP;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.list_utilities.tree_find;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYCL-GRAMMAR
 * source file: /cyc/top/cycl/cycl-grammar.lisp
 * created:     2019/07/03 17:37:23
 */
public final class cycl_grammar extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_cycl_nart_p_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_NART_P_TEST_CASE, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cycl_nart_p_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_cycl_nart_p_test_case_p_queue(SubLObject cycl_nart_p_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_nart_p_test_case, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_cycl_nart_p_test_case_p_queue(SubLObject cycl_nart_p_test_case) {
        return classes.subloop_get_access_protected_instance_slot(cycl_nart_p_test_case, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject cycl_nart_p_test_case_p(SubLObject cycl_nart_p_test_case) {
        return classes.subloop_instanceof_class(cycl_nart_p_test_case, CYCL_NART_P_TEST_CASE);
    }

    public static final SubLFile me = new cycl_grammar();

 public static final String myName = "com.cyc.cycjava.cycl.cycl_grammar";


    // defvar
    @LispMethod(comment = "dynamic variable to control whether the CycL grammar functions permit HL constructs\ndefvar")
    public static final SubLSymbol $grammar_permits_hlP$ = makeSymbol("*GRAMMAR-PERMITS-HL?*");

    // defvar
    @LispMethod(comment = "do we check the KB to see if terms are of the correct types, e.g. #$Predicate (t)\r\nor do we ignore the KB and only use syntactic information to check syntactic well-formedness (nil)\ndefvar\ndo we check the KB to see if terms are of the correct types, e.g. #$Predicate (t)\nor do we ignore the KB and only use syntactic information to check syntactic well-formedness (nil)")
    public static final SubLSymbol $grammar_uses_kbP$ = makeSymbol("*GRAMMAR-USES-KB?*");

    // defparameter
    // do we permit a SubLList as a terminal in the grammar?
    /**
     * do we permit a SubLList as a terminal in the grammar?
     */
    @LispMethod(comment = "do we permit a SubLList as a terminal in the grammar?\ndefparameter")
    public static final SubLSymbol $grammar_permits_list_as_terminalP$ = makeSymbol("*GRAMMAR-PERMITS-LIST-AS-TERMINAL?*");

    // defparameter
    /**
     * do we permit a SubLNonVariableNonKeyWordSymbol as a terminal in the grammar?
     */
    @LispMethod(comment = "do we permit a SubLNonVariableNonKeyWordSymbol as a terminal in the grammar?\ndefparameter")
    public static final SubLSymbol $grammar_permits_symbol_as_terminalP$ = makeSymbol("*GRAMMAR-PERMITS-SYMBOL-AS-TERMINAL?*");

    // defparameter
    // do we permit strings that contain non-ASCII characters?
    /**
     * do we permit strings that contain non-ASCII characters?
     */
    @LispMethod(comment = "do we permit strings that contain non-ASCII characters?\ndefparameter")
    public static final SubLSymbol $grammar_permits_non_ascii_stringsP$ = makeSymbol("*GRAMMAR-PERMITS-NON-ASCII-STRINGS?*");

    // defparameter
    /**
     * do we permit a variable to denote anything permitted by the CycL grammar (t)
     * or do we treat variables as syntactic, opaque objects, and disallow sentences
     * and formulas to be denoted by variables (nil) ?
     */
    @LispMethod(comment = "do we permit a variable to denote anything permitted by the CycL grammar (t)\r\nor do we treat variables as syntactic, opaque objects, and disallow sentences\r\nand formulas to be denoted by variables (nil) ?\ndefparameter\ndo we permit a variable to denote anything permitted by the CycL grammar (t)\nor do we treat variables as syntactic, opaque objects, and disallow sentences\nand formulas to be denoted by variables (nil) ?")
    private static final SubLSymbol $grammar_permissive_wrt_variablesP$ = makeSymbol("*GRAMMAR-PERMISSIVE-WRT-VARIABLES?*");

    // defparameter
    // do we permit quoted forms in the grammar?
    /**
     * do we permit quoted forms in the grammar?
     */
    @LispMethod(comment = "do we permit quoted forms in the grammar?\ndefparameter")
    private static final SubLSymbol $grammar_permits_quoted_forms$ = makeSymbol("*GRAMMAR-PERMITS-QUOTED-FORMS*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $within_quote_form$ = makeSymbol("*WITHIN-QUOTE-FORM*");

    static private final SubLList $list1 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), NIL));

    static private final SubLList $list2 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), T));

    static private final SubLList $list3 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), NIL));

    static private final SubLList $list4 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), T));

    static private final SubLList $list5 = list(list(makeSymbol("*WFF-VIOLATIONS*"), NIL), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));

    static private final SubLList $list6 = list(list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), NIL), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), NIL));

    static private final SubLList $list7 = list(makeSymbol("VIOLATION"));

    static private final SubLList $list9 = list(makeSymbol("NOTE-WFF-VIOLATION?"));

    private static final SubLSymbol NOTE_WFF_VIOLATION = makeSymbol("NOTE-WFF-VIOLATION");

    static private final SubLList $list11 = list(list(makeSymbol("*WITHIN-QUOTE-FORM*"), T));

    static private final SubLList $list12 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list14 = list(reader_make_constant_shell("Quote"));

    private static final SubLSymbol WITHIN_QUOTE_FORM = makeSymbol("WITHIN-QUOTE-FORM");

    private static final SubLSymbol $NOT_A_TRUTH_FUNCTION = makeKeyword("NOT-A-TRUTH-FUNCTION");

    private static final SubLSymbol $NOT_AN_EL_FORMULA = makeKeyword("NOT-AN-EL-FORMULA");







    private static final SubLString $$$unary_operator = makeString("unary operator");

    private static final SubLString $$$binary_operator = makeString("binary operator");

    private static final SubLString $$$ternary_operator = makeString("ternary operator");

    private static final SubLString $$$quaternary_operator = makeString("quaternary operator");

    private static final SubLString $$$quintary_operator = makeString("quintary operator");

    private static final SubLString $$$regular_quantifier = makeString("regular quantifier");

    private static final SubLSymbol $NOT_AN_EL_VARIABLE = makeKeyword("NOT-AN-EL-VARIABLE");

    private static final SubLString $$$bounded_existential = makeString("bounded existential");

    private static final SubLSymbol $NOT_A_DENOTATIONAL_TERM = makeKeyword("NOT-A-DENOTATIONAL-TERM");

    private static final SubLString $$$multiple_quantifier = makeString("multiple quantifier");

    private static final SubLSymbol CYCL_VARIABLE_P = makeSymbol("CYCL-VARIABLE-P");

    private static final SubLSymbol $NOT_A_LIST_OF_VARIABLES = makeKeyword("NOT-A-LIST-OF-VARIABLES");

    private static final SubLSymbol $SEQUENCE_NON_VAR = makeKeyword("SEQUENCE-NON-VAR");

    private static final SubLString $$$predicate = makeString("predicate");

















    private static final SubLString $$$functor = makeString("functor");

    private static final SubLString $str49$__ExpandSubLFn_expression = makeString("#$ExpandSubLFn expression");

    private static final SubLString $$$reserved_constant = makeString("reserved constant");

    private static final SubLSymbol $sym51$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLList $list52 = list(NIL);

    private static final SubLSymbol $EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1 = makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");

    private static final SubLString $str54$__SubLQuoteFn_expression = makeString("#$SubLQuoteFn expression");

    private static final SubLString $str55$__Kappa_expression = makeString("#$Kappa expression");

    private static final SubLString $str56$__Lambda_expression = makeString("#$Lambda expression");

    private static final SubLString $str57$__SkolemFunctionFn_expression = makeString("#$SkolemFunctionFn expression");

    private static final SubLString $str58$__SkolemFuncNFn_expression = makeString("#$SkolemFuncNFn expression");

    private static final SubLString $$$unary_expression = makeString("unary expression");



    private static final SubLSymbol CYCL_BOOLEAN_SENTENCE_P = makeSymbol("CYCL-BOOLEAN-SENTENCE-P");

    private static final SubLSymbol $NOT_AN_ASCII_STRING = makeKeyword("NOT-AN-ASCII-STRING");

    private static final SubLSymbol SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");

    private static final SubLString $str66$CycL_Grammar_Module_Supercategory = makeString("CycL-Grammar Module Supercategory");

    private static final SubLString $$$CycL_Grammar_Subcategory = makeString("CycL Grammar Subcategory");

    private static final SubLString $$$CycL_Grammar_Testing_Suite = makeString("CycL Grammar Testing Suite");

    private static final SubLSymbol CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");

    private static final SubLList $list76 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("and"), makeKeyword("ARG1"), makeKeyword("ARG2"))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?VAR")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(reader_make_constant_shell("isa")), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), NIL), list(list(list(makeInteger(212), reader_make_constant_shell("isa"))), NIL), list(list(list(reader_make_constant_shell("Dog"), reader_make_constant_shell("JuvenileFn"))), NIL), list(list(list(reader_make_constant_shell("forAll"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("foo")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), makeSymbol("?ARG"), list(reader_make_constant_shell("isa"), makeSymbol("?ARG"), reader_make_constant_shell("Thing"))))), NIL) });

    private static final SubLList $list77 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), T), list(list(list(reader_make_constant_shell("and"), makeKeyword("ARG1"), makeKeyword("ARG2"))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?VAR")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(list(makeSymbol("??Y"), makeSymbol("?X"))), T), list(list(list(makeSymbol("?X"), makeSymbol("??Y"))), T), list(list(list(makeSymbol("?X"), makeKeyword("ARG1"))), T), list(list(list(makeKeyword("ARG1"), makeSymbol("?X"))), T), list(list(list(reader_make_constant_shell("isa"), list(makeKeyword("ARG1"), makeSymbol("?X")), reader_make_constant_shell("Thing"))), T), list(list(reader_make_constant_shell("isa")), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), NIL), list(list(list(makeInteger(212), reader_make_constant_shell("isa"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), NIL), list(list(list(reader_make_constant_shell("Dog"), reader_make_constant_shell("JuvenileFn"))), NIL), list(list(list(reader_make_constant_shell("forAll"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("foo")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), makeSymbol("?ARG"), list(reader_make_constant_shell("isa"), makeSymbol("?ARG"), reader_make_constant_shell("Thing"))))), NIL), list(list(list(reader_make_constant_shell("forAllVars"), list(makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), T), list(list(list(reader_make_constant_shell("forAllVars"), list(makeSymbol("?X"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), makeSymbol("?Y")))), NIL) });

    private static final SubLList $list80 = list(list(list(list(reader_make_constant_shell("SkolemFunctionFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), makeSymbol("?Y"))), T), list(list(list(reader_make_constant_shell("SkolemFunctionFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), NIL)), T), list(list(list(reader_make_constant_shell("SkolemFuncNFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), makeSymbol("?Y"), makeInteger(212))), T), list(list(list(reader_make_constant_shell("SkolemFuncNFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), NIL, makeInteger(212))), T));

    public static final SubLObject grammar_permits_hlP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $grammar_permits_hlP$.getDynamicValue(thread);
        }
    }

    public static SubLObject grammar_permits_hlP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permits_hlP$.getDynamicValue(thread);
    }

    public static final SubLObject grammar_permits_list_as_terminalP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $grammar_permits_list_as_terminalP$.getDynamicValue(thread);
        }
    }

    public static SubLObject grammar_permits_list_as_terminalP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permits_list_as_terminalP$.getDynamicValue(thread);
    }

    public static final SubLObject grammar_permits_non_ascii_stringsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $grammar_permits_non_ascii_stringsP$.getDynamicValue(thread);
        }
    }

    public static SubLObject grammar_permits_non_ascii_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permits_non_ascii_stringsP$.getDynamicValue(thread);
    }

    public static final SubLObject grammar_permissive_wrt_variablesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $grammar_permissive_wrt_variablesP$.getDynamicValue(thread);
        }
    }

    public static SubLObject grammar_permissive_wrt_variablesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permissive_wrt_variablesP$.getDynamicValue(thread);
    }

    public static final SubLObject grammar_uses_kbP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $grammar_uses_kbP$.getDynamicValue(thread)) && (NIL != kb_loaded()));
        }
    }

    public static SubLObject grammar_uses_kbP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $grammar_uses_kbP$.getDynamicValue(thread)) && (NIL != kb_loaded()));
    }

    public static final SubLObject within_quote_formP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $within_quote_form$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_quote_formP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_quote_form$.getDynamicValue(thread);
    }

    /**
     * Sets private variables so that HL constructs will not be permitted in the CycL syntax.
     * This is effectively the EL syntax.
     */
    @LispMethod(comment = "Sets private variables so that HL constructs will not be permitted in the CycL syntax.\r\nThis is effectively the EL syntax.\nSets private variables so that HL constructs will not be permitted in the CycL syntax.\nThis is effectively the EL syntax.")
    public static final SubLObject without_grammar_admitting_hl_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    /**
     * Sets private variables so that HL constructs will not be permitted in the CycL syntax.
     * This is effectively the EL syntax.
     */
    @LispMethod(comment = "Sets private variables so that HL constructs will not be permitted in the CycL syntax.\r\nThis is effectively the EL syntax.\nSets private variables so that HL constructs will not be permitted in the CycL syntax.\nThis is effectively the EL syntax.")
    public static SubLObject without_grammar_admitting_hl(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    /**
     * Sets private variables so that HL constructs will be permitted in the CycL syntax.
     * This is the CycL syntax.
     */
    @LispMethod(comment = "Sets private variables so that HL constructs will be permitted in the CycL syntax.\r\nThis is the CycL syntax.\nSets private variables so that HL constructs will be permitted in the CycL syntax.\nThis is the CycL syntax.")
    public static final SubLObject with_grammar_admitting_hl_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt2, append(body, NIL));
        }
    }

    /**
     * Sets private variables so that HL constructs will be permitted in the CycL syntax.
     * This is the CycL syntax.
     */
    @LispMethod(comment = "Sets private variables so that HL constructs will be permitted in the CycL syntax.\r\nThis is the CycL syntax.\nSets private variables so that HL constructs will be permitted in the CycL syntax.\nThis is the CycL syntax.")
    public static SubLObject with_grammar_admitting_hl(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    /**
     * Sets private variables so that the CycL grammar will not check the KB, and will give
     * the benefit of the doubt.
     */
    @LispMethod(comment = "Sets private variables so that the CycL grammar will not check the KB, and will give\r\nthe benefit of the doubt.\nSets private variables so that the CycL grammar will not check the KB, and will give\nthe benefit of the doubt.")
    public static final SubLObject without_grammar_using_kb_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt3, append(body, NIL));
        }
    }

    /**
     * Sets private variables so that the CycL grammar will not check the KB, and will give
     * the benefit of the doubt.
     */
    @LispMethod(comment = "Sets private variables so that the CycL grammar will not check the KB, and will give\r\nthe benefit of the doubt.\nSets private variables so that the CycL grammar will not check the KB, and will give\nthe benefit of the doubt.")
    public static SubLObject without_grammar_using_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    /**
     * Sets private variables so that the CycL grammar will check the KB, and enforce,
     * for instance, that predicates are really instances of #$Predicate.
     */
    @LispMethod(comment = "Sets private variables so that the CycL grammar will check the KB, and enforce,\r\nfor instance, that predicates are really instances of #$Predicate.\nSets private variables so that the CycL grammar will check the KB, and enforce,\nfor instance, that predicates are really instances of #$Predicate.")
    public static final SubLObject with_grammar_using_kb_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt4, append(body, NIL));
        }
    }

    /**
     * Sets private variables so that the CycL grammar will check the KB, and enforce,
     * for instance, that predicates are really instances of #$Predicate.
     */
    @LispMethod(comment = "Sets private variables so that the CycL grammar will check the KB, and enforce,\r\nfor instance, that predicates are really instances of #$Predicate.\nSets private variables so that the CycL grammar will check the KB, and enforce,\nfor instance, that predicates are really instances of #$Predicate.")
    public static SubLObject with_grammar_using_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    /**
     * Sets private variables so that all syntax-violations in BODY will be recorded.
     * If you want to access the violations, you must do so within the scope of this macro.
     * You cannot return from a function while you are still inside the scope of this macro.
     */
    @LispMethod(comment = "Sets private variables so that all syntax-violations in BODY will be recorded.\r\nIf you want to access the violations, you must do so within the scope of this macro.\r\nYou cannot return from a function while you are still inside the scope of this macro.\nSets private variables so that all syntax-violations in BODY will be recorded.\nIf you want to access the violations, you must do so within the scope of this macro.\nYou cannot return from a function while you are still inside the scope of this macro.")
    public static final SubLObject gather_syntax_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt5, append(body, NIL));
        }
    }

    /**
     * Sets private variables so that all syntax-violations in BODY will be recorded.
     * If you want to access the violations, you must do so within the scope of this macro.
     * You cannot return from a function while you are still inside the scope of this macro.
     */
    @LispMethod(comment = "Sets private variables so that all syntax-violations in BODY will be recorded.\r\nIf you want to access the violations, you must do so within the scope of this macro.\r\nYou cannot return from a function while you are still inside the scope of this macro.\nSets private variables so that all syntax-violations in BODY will be recorded.\nIf you want to access the violations, you must do so within the scope of this macro.\nYou cannot return from a function while you are still inside the scope of this macro.")
    public static SubLObject gather_syntax_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    /**
     * Sets private variables so that all syntax-violations in BODY will be not recorded.
     * You cannot return from a function while you are still inside the scope of this macro.
     */
    @LispMethod(comment = "Sets private variables so that all syntax-violations in BODY will be not recorded.\r\nYou cannot return from a function while you are still inside the scope of this macro.\nSets private variables so that all syntax-violations in BODY will be not recorded.\nYou cannot return from a function while you are still inside the scope of this macro.")
    public static final SubLObject dont_gather_syntax_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt6, append(body, NIL));
        }
    }

    /**
     * Sets private variables so that all syntax-violations in BODY will be not recorded.
     * You cannot return from a function while you are still inside the scope of this macro.
     */
    @LispMethod(comment = "Sets private variables so that all syntax-violations in BODY will be not recorded.\r\nYou cannot return from a function while you are still inside the scope of this macro.\nSets private variables so that all syntax-violations in BODY will be not recorded.\nYou cannot return from a function while you are still inside the scope of this macro.")
    public static SubLObject dont_gather_syntax_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    /**
     * Calls note-syntax-violation only if we are gathering syntax-violations.
     */
    @LispMethod(comment = "Calls note-syntax-violation only if we are gathering syntax-violations.")
    public static final SubLObject handle_syntax_violation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject violation = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            violation = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, $list_alt9, list(NOTE_WFF_VIOLATION, violation));
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    /**
     * Calls note-syntax-violation only if we are gathering syntax-violations.
     */
    @LispMethod(comment = "Calls note-syntax-violation only if we are gathering syntax-violations.")
    public static SubLObject handle_syntax_violation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject violation = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        violation = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, $list9, list(NOTE_WFF_VIOLATION, violation));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject within_quote_form_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt11, append(body, NIL));
        }
    }

    public static SubLObject within_quote_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list11, append(body, NIL));
    }

    public static final SubLObject allow_escape_quote_when_quote_predicate_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            pred = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PIF, listS(EQ, pred, $list_alt14), bq_cons(WITHIN_QUOTE_FORM, append(body, NIL)), append(body, NIL));
            }
        }
    }

    public static SubLObject allow_escape_quote_when_quote_predicate(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        pred = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PIF, listS(EQL, pred, $list14), bq_cons(WITHIN_QUOTE_FORM, append(body, NIL)), append(body, NIL));
    }

    /**
     * returns t iff OBJECT is a well-formed sentence according to the CycL grammar.
     * To meet this specification, OBJECT must be of the form #$True
     * or #$False
     * or <variable>
     * or <HL assertion> (if HL constructs are permitted)
     * or <atomic sentence>
     * or <unary sentence>
     * or <binary sentence>
     * or <ternary sentence>
     * or <quaternary sentence>
     * or <quintary sentence>
     * or <user-defined logical operator sentence>
     * or <variable-arity sentence>
     * or <quantified sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is a well-formed sentence according to the CycL grammar.\r\nTo meet this specification, OBJECT must be of the form #$True\r\nor #$False\r\nor <variable>\r\nor <HL assertion> (if HL constructs are permitted)\r\nor <atomic sentence>\r\nor <unary sentence>\r\nor <binary sentence>\r\nor <ternary sentence>\r\nor <quaternary sentence>\r\nor <quintary sentence>\r\nor <user-defined logical operator sentence>\r\nor <variable-arity sentence>\r\nor <quantified sentence>\nreturns t iff OBJECT is a well-formed sentence according to the CycL grammar.\nTo meet this specification, OBJECT must be of the form #$True\nor #$False\nor <variable>\nor <HL assertion> (if HL constructs are permitted)\nor <atomic sentence>\nor <unary sentence>\nor <binary sentence>\nor <ternary sentence>\nor <quaternary sentence>\nor <quintary sentence>\nor <user-defined logical operator sentence>\nor <variable-arity sentence>\nor <quantified sentence>")
    public static final SubLObject cycl_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                wffP = makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_formulaic_sentence_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_truth_value_p(v_object)));
                if ((NIL == wffP) && (NIL == wff_vars.$wff_violations$.getDynamicValue(thread))) {
                    if (NIL != el_formula_p(v_object)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($NOT_A_TRUTH_FUNCTION, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object)));
                        }
                    } else {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($NOT_AN_EL_FORMULA, v_object));
                        }
                    }
                }
                return wffP;
            }
        }
    }

    /**
     * returns t iff OBJECT is a well-formed sentence according to the CycL grammar.
     * To meet this specification, OBJECT must be of the form #$True
     * or #$False
     * or <variable>
     * or <HL assertion> (if HL constructs are permitted)
     * or <atomic sentence>
     * or <unary sentence>
     * or <binary sentence>
     * or <ternary sentence>
     * or <quaternary sentence>
     * or <quintary sentence>
     * or <user-defined logical operator sentence>
     * or <variable-arity sentence>
     * or <quantified sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is a well-formed sentence according to the CycL grammar.\r\nTo meet this specification, OBJECT must be of the form #$True\r\nor #$False\r\nor <variable>\r\nor <HL assertion> (if HL constructs are permitted)\r\nor <atomic sentence>\r\nor <unary sentence>\r\nor <binary sentence>\r\nor <ternary sentence>\r\nor <quaternary sentence>\r\nor <quintary sentence>\r\nor <user-defined logical operator sentence>\r\nor <variable-arity sentence>\r\nor <quantified sentence>\nreturns t iff OBJECT is a well-formed sentence according to the CycL grammar.\nTo meet this specification, OBJECT must be of the form #$True\nor #$False\nor <variable>\nor <HL assertion> (if HL constructs are permitted)\nor <atomic sentence>\nor <unary sentence>\nor <binary sentence>\nor <ternary sentence>\nor <quaternary sentence>\nor <quintary sentence>\nor <user-defined logical operator sentence>\nor <variable-arity sentence>\nor <quantified sentence>")
    public static SubLObject cycl_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        wffP = makeBoolean((NIL != cycl_formulaic_sentence_p(v_object)) || (NIL != cycl_truth_value_p(v_object)));
        if ((NIL == wffP) && (NIL == wff_vars.$wff_violations$.getDynamicValue(thread))) {
            if (NIL != el_formula_p(v_object)) {
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($NOT_A_TRUTH_FUNCTION, cycl_formula_predicate(v_object)));
                }
            } else
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($NOT_AN_EL_FORMULA, v_object));
                }

        }
        return wffP;
    }

    public static final SubLObject cycl_formulaic_sentence_p_alt(SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            return makeBoolean(((((((((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_unary_sentence_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_binary_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_quantified_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_arity_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_atomic_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_ternary_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_quaternary_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_quintary_sentence_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_user_defined_logical_operator_sentence_p(v_object)));
        } else {
            return makeBoolean(((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != collection_defns.hl_assertion_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(v_object)));
        }
    }

    public static SubLObject cycl_formulaic_sentence_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            return makeBoolean(((((((((NIL != cycl_unary_sentence_p(v_object)) || (NIL != cycl_binary_sentence_p(v_object))) || (NIL != cycl_quantified_sentence_p(v_object))) || (NIL != cycl_variable_arity_sentence_p(v_object))) || (NIL != cycl_atomic_sentence_p(v_object))) || (NIL != cycl_ternary_sentence_p(v_object))) || (NIL != cycl_quaternary_sentence_p(v_object))) || (NIL != cycl_quintary_sentence_p(v_object))) || (NIL != cycl_user_defined_logical_operator_sentence_p(v_object)));
        }
        return makeBoolean(((NIL != grammar_permits_hlP()) && (NIL != collection_defns.hl_assertion_p(v_object))) || (NIL != cycl_variable_p(v_object)));
    }

    public static SubLObject cycl_sequence_of_test_p(final SubLObject v_object, final SubLObject test) {
        if (NIL != el_sequence_p(v_object)) {
            final SubLObject last = last_of_sequence(v_object).rest();
            if (NIL == last) {
                return every_in_sequence(test, v_object);
            }
            if (NIL != cycl_variable_p(last)) {
                return every_in_sequence(test, butlast_of_sequence(v_object));
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <epsilon>
     * or . <variable>
     * or <sentence> <sentence sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor . <variable>\r\nor <sentence> <sentence sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor . <variable>\nor <sentence> <sentence sequence>")
    public static final SubLObject cycl_sentence_sequence_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != epsilon_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(v_object))) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(first_in_sequence(v_object))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_sequence_p(rest_of_sequence(v_object)))));
    }

    /**
     * returns t iff OBJECT is of the form <epsilon>
     * or . <variable>
     * or <sentence> <sentence sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor . <variable>\r\nor <sentence> <sentence sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor . <variable>\nor <sentence> <sentence sequence>")
    public static SubLObject cycl_sentence_sequence_p(final SubLObject v_object) {
        return makeBoolean(((NIL != epsilon_p(v_object)) || (NIL != cycl_variable_p(v_object))) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_SENTENCE_P)));
    }

    public static final SubLObject cycl_truth_value_p_alt(SubLObject v_object) {
        return makeBoolean(($$True == v_object) || ($$False == v_object));
    }

    public static SubLObject cycl_truth_value_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_true_p(v_object)) || (NIL != cycl_false_p(v_object)));
    }

    public static SubLObject cycl_true_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $$True);
    }

    public static SubLObject cycl_false_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $$False);
    }

    public static final SubLObject cycl_formula_predicate_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg0 = cycl_utilities.formula_arg0(v_object);
                if (((NIL != $within_quote_form$.getDynamicValue(thread)) && (NIL != el_formula_p(v_object))) && ($$EscapeQuote == cycl_utilities.formula_arg0(arg0))) {
                    return cycl_utilities.formula_arg1(arg0, UNPROVIDED);
                } else {
                    return arg0;
                }
            }
        }
    }

    public static SubLObject cycl_formula_predicate(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(v_object);
        if (((NIL != $within_quote_form$.getDynamicValue(thread)) && (NIL != el_formula_p(v_object))) && $$EscapeQuote.eql(cycl_utilities.formula_arg0(arg0))) {
            return cycl_utilities.formula_arg1(arg0, UNPROVIDED);
        }
        return arg0;
    }

    /**
     * returns t iff OBJECT is of the form <unary-operator> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <unary-operator> <sentence>")
    public static final SubLObject cycl_unary_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_unary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == cyc_const_unary_logical_op_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(ONE_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$unary_operator, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        return com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <unary-operator> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <unary-operator> <sentence>")
    public static SubLObject cycl_unary_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_unary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cyc_const_unary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (formula_arity(v_object, UNPROVIDED).numE(ONE_INTEGER)) {
                    return cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                }
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$unary_operator, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <binary operator> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <binary operator> <sentence> <sentence>")
    public static final SubLObject cycl_binary_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_binary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == cyc_const_binary_logical_op_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(TWO_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$binary_operator, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <binary operator> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <binary operator> <sentence> <sentence>")
    public static SubLObject cycl_binary_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_binary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cyc_const_binary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (formula_arity(v_object, UNPROVIDED).numE(TWO_INTEGER)) {
                    return makeBoolean((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))));
                }
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$binary_operator, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <ternary operator> <sentence> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <ternary operator> <sentence> <sentence> <sentence>")
    public static final SubLObject cycl_ternary_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_ternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == cyc_const_ternary_logical_op_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(THREE_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$ternary_operator, THREE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        return makeBoolean(((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED))));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <ternary operator> <sentence> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <ternary operator> <sentence> <sentence> <sentence>")
    public static SubLObject cycl_ternary_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_ternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cyc_const_ternary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (formula_arity(v_object, UNPROVIDED).numE(THREE_INTEGER)) {
                    return makeBoolean(((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED))));
                }
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$ternary_operator, THREE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <quaternary operator> <sentence> <sentence> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <quaternary operator> <sentence> <sentence> <sentence> <sentence>")
    public static final SubLObject cycl_quaternary_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_quaternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == cyc_const_quaternary_logical_op_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(FOUR_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$quaternary_operator, FOUR_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        return makeBoolean((((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg4(v_object, UNPROVIDED))));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <quaternary operator> <sentence> <sentence> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <quaternary operator> <sentence> <sentence> <sentence> <sentence>")
    public static SubLObject cycl_quaternary_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_quaternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cyc_const_quaternary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (formula_arity(v_object, UNPROVIDED).numE(FOUR_INTEGER)) {
                    return makeBoolean((((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED)))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg4(v_object, UNPROVIDED))));
                }
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$quaternary_operator, FOUR_INTEGER, formula_arity(v_object, UNPROVIDED)));
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <quintary operator> <sentence> <sentence> <sentence> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <quintary operator> <sentence> <sentence> <sentence> <sentence> <sentence>")
    public static final SubLObject cycl_quintary_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_quintary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == cyc_const_quintary_logical_op_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(FIVE_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$quintary_operator, FIVE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        return makeBoolean(((((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg4(v_object, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg5(v_object, UNPROVIDED))));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <quintary operator> <sentence> <sentence> <sentence> <sentence> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <quintary operator> <sentence> <sentence> <sentence> <sentence> <sentence>")
    public static SubLObject cycl_quintary_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_quintary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cyc_const_quintary_logical_op_p(cycl_formula_predicate(v_object))) {
                if (formula_arity(v_object, UNPROVIDED).numE(FIVE_INTEGER)) {
                    return makeBoolean(((((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED)))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg4(v_object, UNPROVIDED)))) && (NIL != cycl_sentence_p(cycl_utilities.formula_arg5(v_object, UNPROVIDED))));
                }
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$quintary_operator, FIVE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <variable-arity operator> <sentence sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <variable-arity operator> <sentence sequence>")
    public static final SubLObject cycl_variable_arity_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_arity_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            return makeBoolean((((NIL != el_formula_p(v_object)) && (NIL != cyc_const_variable_arity_logical_op_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object)))) && (NIL != wf_wrt_sequence_varsP(v_object))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))));
        }
    }

    /**
     * returns t iff OBJECT is of the form <variable-arity operator> <sentence sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <variable-arity operator> <sentence sequence>")
    public static SubLObject cycl_variable_arity_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_variable_arity_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return makeBoolean((((NIL != el_formula_p(v_object)) && (NIL != cyc_const_variable_arity_logical_op_p(cycl_formula_predicate(v_object)))) && (NIL != wf_wrt_sequence_varsP(v_object))) && (NIL != cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))));
    }

    /**
     * returns t iff OBJECT is of the form <user-defined logical operator> <sentence sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <user-defined logical operator> <sentence sequence>")
    public static final SubLObject cycl_user_defined_logical_operator_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_user_defined_logical_operator_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == user_defined_logical_operator_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    return com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE));
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <user-defined logical operator> <sentence sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <user-defined logical operator> <sentence sequence>")
    public static SubLObject cycl_user_defined_logical_operator_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_user_defined_logical_operator_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != user_defined_logical_operator_p(cycl_formula_predicate(v_object))) {
                return cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE));
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <regular quantifier> <variable> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <regular quantifier> <variable> <sentence>")
    public static final SubLObject cycl_regularly_quantified_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_regularly_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_regular_quantifier_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(TWO_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$regular_quantifier, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($NOT_AN_EL_VARIABLE, cycl_utilities.formula_arg1(v_object, UNPROVIDED)));
                            }
                        } else {
                            return com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <regular quantifier> <variable> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <regular quantifier> <variable> <sentence>")
    public static SubLObject cycl_regularly_quantified_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_regularly_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cycl_regular_quantifier_p(cycl_formula_predicate(v_object))) {
                if (!formula_arity(v_object, UNPROVIDED).numE(TWO_INTEGER)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$regular_quantifier, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL != cycl_variable_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        return cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED));
                    }
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($NOT_AN_EL_VARIABLE, cycl_utilities.formula_arg1(v_object, UNPROVIDED)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <bounded existential> <denotational term> <variable> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <bounded existential> <denotational term> <variable> <sentence>")
    public static final SubLObject cycl_bounded_existential_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_bounded_existential_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_bounded_existential_quantifier_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (!formula_arity(v_object, UNPROVIDED).numE(THREE_INTEGER)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($ARITY_MISMATCH, v_object, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), $$$bounded_existential, THREE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($NOT_A_DENOTATIONAL_TERM, cycl_utilities.formula_arg1(v_object, UNPROVIDED)));
                            }
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                                if (NIL != wff.note_wff_violationP()) {
                                    wff.note_wff_violation(list($NOT_AN_EL_VARIABLE, cycl_utilities.formula_arg2(v_object, UNPROVIDED)));
                                }
                            } else {
                                return com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED));
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <bounded existential> <denotational term> <variable> <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <bounded existential> <denotational term> <variable> <sentence>")
    public static SubLObject cycl_bounded_existential_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_bounded_existential_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cycl_bounded_existential_quantifier_p(cycl_formula_predicate(v_object))) {
                if (!formula_arity(v_object, UNPROVIDED).numE(THREE_INTEGER)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$bounded_existential, THREE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_denotational_term_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($NOT_A_DENOTATIONAL_TERM, cycl_utilities.formula_arg1(v_object, UNPROVIDED)));
                        }
                    } else {
                        if (NIL != cycl_variable_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            return cycl_sentence_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED));
                        }
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($NOT_AN_EL_VARIABLE, cycl_utilities.formula_arg2(v_object, UNPROVIDED)));
                        }
                    }

            }
        }
        return NIL;
    }

    public static SubLObject cycl_multiply_quantified_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_multiply_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cycl_multi_quantifier_p(cycl_formula_predicate(v_object))) {
                if (!formula_arity(v_object, UNPROVIDED).numE(TWO_INTEGER)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_formula_predicate(v_object), $$$multiple_quantifier, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (cycl_utilities.formula_arg1(v_object, UNPROVIDED).isList() && (NIL != list_utilities.every_in_list(CYCL_VARIABLE_P, cycl_utilities.formula_arg1(v_object, UNPROVIDED), UNPROVIDED))) {
                        return cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED));
                    }
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($NOT_A_LIST_OF_VARIABLES, cycl_utilities.formula_arg1(v_object, UNPROVIDED)));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cycl_logical_operator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cyc_const_logical_operator_p(v_object)) || (NIL != user_defined_logical_operator_p(v_object)));
    }

    public static SubLObject cycl_logical_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != cyc_const_logical_operator_p(v_object)) || (NIL != user_defined_logical_operator_p(v_object)));
    }

    public static final SubLObject cycl_quantifier_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cyc_const_quantifier_p(v_object)) || (NIL != user_defined_bounded_existential_operator_p(v_object)));
    }

    public static SubLObject cycl_quantifier_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cyc_const_quantifier_p(v_object)) || (NIL != cycl_multi_quantifier_p(v_object))) || (NIL != user_defined_bounded_existential_operator_p(v_object)));
    }

    public static final SubLObject cycl_regular_quantifier_p_alt(SubLObject v_object) {
        return cyc_const_regular_quantifier_p(v_object);
    }

    public static SubLObject cycl_regular_quantifier_p(final SubLObject v_object) {
        return cyc_const_regular_quantifier_p(v_object);
    }

    public static SubLObject cycl_multi_quantifier_p(final SubLObject v_object) {
        return cyc_const_multi_quantifier_p(v_object);
    }

    public static final SubLObject cycl_bounded_existential_quantifier_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cyc_const_bounded_existential_operator_p(v_object)) || (NIL != user_defined_bounded_existential_operator_p(v_object)));
    }

    public static SubLObject cycl_bounded_existential_quantifier_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != cyc_const_bounded_existential_operator_p(v_object)) || (NIL != (NIL != $bootstrapping_kbP$.getDynamicValue(thread) ? NIL : user_defined_bounded_existential_operator_p(v_object))));
    }

    /**
     * returns t iff OBJECT is of the form <predicate> <argument sequence>.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <predicate> <argument sequence>.")
    public static final SubLObject cycl_atomic_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_atomic_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_predicate_p(com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object))) {
                } else {
                    if (NIL == wf_wrt_sequence_varsP(v_object)) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($SEQUENCE_NON_VAR, v_object, sequence_non_var(v_object, UNPROVIDED)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_argument_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$predicate, com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_predicate(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_has_valid_arityP(v_object)) {
                            } else {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <predicate> <argument sequence>.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <predicate> <argument sequence>.")
    public static SubLObject cycl_atomic_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_atomic_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        if (NIL != el_formula_p(v_object)) {
            if (NIL != cycl_predicate_p(cycl_formula_predicate(v_object))) {
                if (NIL == wf_wrt_sequence_varsP(v_object)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($SEQUENCE_NON_VAR, v_object, sequence_non_var(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_argument_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$predicate, cycl_formula_predicate(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else
                        if (NIL != cycl_formula_has_valid_arityP(v_object)) {
                            return T;
                        }


            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <epsilon>
     * or . <variable>
     * or <term> <argument sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor . <variable>\r\nor <term> <argument sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor . <variable>\nor <term> <argument sequence>")
    public static final SubLObject cycl_argument_sequence_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != epsilon_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(v_object))) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_term_p(first_in_sequence(v_object))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_argument_sequence_p(rest_of_sequence(v_object)))));
    }

    /**
     * returns t iff OBJECT is of the form <epsilon>
     * or . <variable>
     * or <term> <argument sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor . <variable>\r\nor <term> <argument sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor . <variable>\nor <term> <argument sequence>")
    public static SubLObject cycl_argument_sequence_p(final SubLObject v_object) {
        return makeBoolean(((NIL != epsilon_p(v_object)) || (NIL != cycl_variable_p(v_object))) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_TERM_P)));
    }

    /**
     * returns t iff OBJECT is of the form <represented term>
     * and not of the form <logical operator> or <quantifier>,
     * because predicates are disjoint with logical operators and quantifiers.
     * Ensures that OBJECT is a predicate if the grammar uses the KB.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nand not of the form <logical operator> or <quantifier>,\r\nbecause predicates are disjoint with logical operators and quantifiers.\r\nEnsures that OBJECT is a predicate if the grammar uses the KB.\nreturns t iff OBJECT is of the form <represented term>\nand not of the form <logical operator> or <quantifier>,\nbecause predicates are disjoint with logical operators and quantifiers.\nEnsures that OBJECT is a predicate if the grammar uses the KB.")
    public static final SubLObject cycl_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_represented_term_p(v_object)) && (NIL == cyc_const_logical_operator_p(v_object))) && (NIL == cyc_const_quantifier_p(v_object))) && ((NIL == com.cyc.cycjava.cycl.cycl_grammar.grammar_uses_kbP()) || (NIL != predicate_specP(v_object, CYCL_VARIABLE_P))));
    }

    /**
     * returns t iff OBJECT is of the form <represented term>
     * and not of the form <logical operator> or <quantifier>,
     * because predicates are disjoint with logical operators and quantifiers.
     * Ensures that OBJECT is a predicate if the grammar uses the KB.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nand not of the form <logical operator> or <quantifier>,\r\nbecause predicates are disjoint with logical operators and quantifiers.\r\nEnsures that OBJECT is a predicate if the grammar uses the KB.\nreturns t iff OBJECT is of the form <represented term>\nand not of the form <logical operator> or <quantifier>,\nbecause predicates are disjoint with logical operators and quantifiers.\nEnsures that OBJECT is a predicate if the grammar uses the KB.")
    public static SubLObject cycl_predicate_p(final SubLObject v_object) {
        return makeBoolean((((NIL != cycl_represented_term_p(v_object)) && (NIL == cyc_const_logical_operator_p(v_object))) && (NIL == cyc_const_quantifier_p(v_object))) && ((NIL == grammar_uses_kbP()) || (NIL != predicate_specP(v_object, CYCL_VARIABLE_P))));
    }

    /**
     * returns t iff OBJECT is of the form <represented term>
     * and not of the form <logical operator> or <quantifier>,
     * because denotational functions are disjoint with logical operators and quantifiers.
     * Ensures that OBJECT is a denotational function if the grammar uses the KB.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nand not of the form <logical operator> or <quantifier>,\r\nbecause denotational functions are disjoint with logical operators and quantifiers.\r\nEnsures that OBJECT is a denotational function if the grammar uses the KB.\nreturns t iff OBJECT is of the form <represented term>\nand not of the form <logical operator> or <quantifier>,\nbecause denotational functions are disjoint with logical operators and quantifiers.\nEnsures that OBJECT is a denotational function if the grammar uses the KB.")
    public static final SubLObject cycl_function_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_represented_term_p(v_object)) && (NIL == cyc_const_logical_operator_p(v_object))) && (NIL == cyc_const_quantifier_p(v_object))) && ((NIL == com.cyc.cycjava.cycl.cycl_grammar.grammar_uses_kbP()) || (NIL != function_specP(v_object, CYCL_VARIABLE_P))));
    }

    /**
     * returns t iff OBJECT is of the form <represented term>
     * and not of the form <logical operator> or <quantifier>,
     * because denotational functions are disjoint with logical operators and quantifiers.
     * Ensures that OBJECT is a denotational function if the grammar uses the KB.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nand not of the form <logical operator> or <quantifier>,\r\nbecause denotational functions are disjoint with logical operators and quantifiers.\r\nEnsures that OBJECT is a denotational function if the grammar uses the KB.\nreturns t iff OBJECT is of the form <represented term>\nand not of the form <logical operator> or <quantifier>,\nbecause denotational functions are disjoint with logical operators and quantifiers.\nEnsures that OBJECT is a denotational function if the grammar uses the KB.")
    public static SubLObject cycl_function_p(final SubLObject v_object) {
        return makeBoolean((((NIL != cycl_represented_term_p(v_object)) && (NIL == cyc_const_logical_operator_p(v_object))) && (NIL == cyc_const_quantifier_p(v_object))) && ((NIL == grammar_uses_kbP()) || (NIL != function_specP(v_object, CYCL_VARIABLE_P))));
    }

    /**
     * returns t iff OBJECT is of the form <function> <argument sequence>, or an <HL Non-AtomicTerm> (if HL constructs are permitted)
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <function> <argument sequence>, or an <HL Non-AtomicTerm> (if HL constructs are permitted)")
    public static final SubLObject cycl_nat_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != nart_handles.nart_p(v_object))) {
            return T;
        } else {
            if (NIL == el_formula_p(v_object)) {
            } else {
                if ((($$Quote == cycl_utilities.formula_arg0(v_object)) || ($$QuasiQuote == cycl_utilities.formula_arg0(v_object))) || ($$EscapeQuote == cycl_utilities.formula_arg0(v_object))) {
                } else {
                    if ($$ExpandSubLFn == cycl_utilities.formula_arg0(v_object)) {
                        return com.cyc.cycjava.cycl.cycl_grammar.expand_subl_fn_syntax_p(v_object);
                    } else {
                        if ($$SubLQuoteFn == cycl_utilities.formula_arg0(v_object)) {
                            return com.cyc.cycjava.cycl.cycl_grammar.subl_quote_fn_syntax_p(v_object);
                        } else {
                            if ($$Kappa == cycl_utilities.formula_arg0(v_object)) {
                                return com.cyc.cycjava.cycl.cycl_grammar.kappa_syntax_p(v_object);
                            } else {
                                if ($$Lambda == cycl_utilities.formula_arg0(v_object)) {
                                    return com.cyc.cycjava.cycl.cycl_grammar.lambda_syntax_p(v_object);
                                } else {
                                    if ($$SkolemFunctionFn == cycl_utilities.formula_arg0(v_object)) {
                                        return com.cyc.cycjava.cycl.cycl_grammar.skolem_function_fn_syntax_p(v_object);
                                    } else {
                                        if ($$SkolemFuncNFn == cycl_utilities.formula_arg0(v_object)) {
                                            return com.cyc.cycjava.cycl.cycl_grammar.skolem_func_n_fn_syntax_p(v_object);
                                        } else {
                                            if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_function_p(cycl_utilities.formula_arg0(v_object))) {
                                            } else {
                                                if (NIL == wf_wrt_sequence_varsP(v_object)) {
                                                    if (NIL != wff.note_wff_violationP()) {
                                                        wff.note_wff_violation(list($SEQUENCE_NON_VAR, v_object, sequence_non_var(v_object, UNPROVIDED)));
                                                    }
                                                } else {
                                                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_argument_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))) {
                                                        if (NIL != wff.note_wff_violationP()) {
                                                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$functor, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                                        }
                                                    } else {
                                                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_has_valid_arityP(v_object)) {
                                                        } else {
                                                            return T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <function> <argument sequence>, or an <HL Non-AtomicTerm> (if HL constructs are permitted)
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <function> <argument sequence>, or an <HL Non-AtomicTerm> (if HL constructs are permitted)")
    public static SubLObject cycl_nat_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != nart_handles.nart_p(v_object))) {
            return T;
        }
        if (NIL != el_formula_p(v_object)) {
            if ((!$$Quote.eql(cycl_utilities.formula_arg0(v_object))) && (!$$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object)))) {
                if (!$$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                    if ($$ExpandSubLFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return expand_subl_fn_syntax_p(v_object);
                    }
                    if ($$SubLQuoteFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return subl_quote_fn_syntax_p(v_object);
                    }
                    if ($$Kappa.eql(cycl_utilities.formula_arg0(v_object))) {
                        return kappa_syntax_p(v_object);
                    }
                    if ($$Lambda.eql(cycl_utilities.formula_arg0(v_object))) {
                        return lambda_syntax_p(v_object);
                    }
                    if ($$SkolemFunctionFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return skolem_function_fn_syntax_p(v_object);
                    }
                    if ($$SkolemFuncNFn.eql(cycl_utilities.formula_arg0(v_object))) {
                        return skolem_func_n_fn_syntax_p(v_object);
                    }
                    if (NIL != cycl_function_p(cycl_utilities.formula_arg0(v_object))) {
                        if (NIL == wf_wrt_sequence_varsP(v_object)) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($SEQUENCE_NON_VAR, v_object, sequence_non_var(v_object, UNPROVIDED)));
                            }
                        } else
                            if (NIL == cycl_argument_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))) {
                                if (NIL != wff.note_wff_violationP()) {
                                    wff.note_wff_violation(list($MALFORMED_ARGS, $$$functor, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                }
                            } else
                                if (NIL != cycl_formula_has_valid_arityP(v_object)) {
                                    return T;
                                }


                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cycl_formula_has_valid_arityP_alt(SubLObject formula) {
        {
            SubLObject validP = T;
            if (NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_uses_kbP()) {
                if (NIL != wff.mal_arityP(formula)) {
                    validP = NIL;
                }
            }
            return validP;
        }
    }

    public static SubLObject cycl_formula_has_valid_arityP(final SubLObject formula) {
        SubLObject validP = T;
        if ((NIL != grammar_uses_kbP()) && (NIL != wff.mal_arityP(formula))) {
            validP = NIL;
        }
        return validP;
    }

    /**
     * returns t iff OBJECT is of the form #$ExpandSubLFn <cycl term sequence> <SubL expression>
     * Assumes that ExpandSubLFn is not reifiable.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$ExpandSubLFn <cycl term sequence> <SubL expression>\r\nAssumes that ExpandSubLFn is not reifiable.\nreturns t iff OBJECT is of the form #$ExpandSubLFn <cycl term sequence> <SubL expression>\nAssumes that ExpandSubLFn is not reifiable.")
    public static final SubLObject expand_subl_fn_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$ExpandSubLFn != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt45$__ExpandSubLFn_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_term_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.subl_expression_syntax_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            return com.cyc.cycjava.cycl.cycl_grammar.expand_subl_fn_syntax_p_int(v_object);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form #$ExpandSubLFn <cycl term sequence> <SubL expression>
     * Assumes that ExpandSubLFn is not reifiable.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$ExpandSubLFn <cycl term sequence> <SubL expression>\r\nAssumes that ExpandSubLFn is not reifiable.\nreturns t iff OBJECT is of the form #$ExpandSubLFn <cycl term sequence> <SubL expression>\nAssumes that ExpandSubLFn is not reifiable.")
    public static SubLObject expand_subl_fn_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$ExpandSubLFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str49$__ExpandSubLFn_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_term_sequence_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL != subl_expression_syntax_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            return expand_subl_fn_syntax_p_int(v_object);
                        }
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject expand_subl_fn_syntax_p_int_alt(SubLObject expand_subl_fn) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(expand_subl_fn, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(expand_subl_fn, UNPROVIDED);
            SubLObject non_variables = remove_if($sym47$CYC_VAR_, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject wfP = T;
            SubLObject violating_non_variables = NIL;
            if (NIL == non_variables) {
                return T;
            }
            if (non_variables.equal($list_alt48)) {
                return T;
            }
            {
                SubLObject cdolist_list_var = non_variables;
                SubLObject non_variable = NIL;
                for (non_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , non_variable = cdolist_list_var.first()) {
                    if (NIL == tree_find(non_variable, arg2, EQUAL, UNPROVIDED)) {
                        violating_non_variables = cons(non_variable, violating_non_variables);
                        wfP = NIL;
                    }
                }
            }
            if (NIL != violating_non_variables) {
                if (NIL != wff.note_wff_violationP()) {
                    wff.note_wff_violation(list($EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, expand_subl_fn, violating_non_variables, cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED)));
                }
            }
            return wfP;
        }
    }

    public static SubLObject expand_subl_fn_syntax_p_int(final SubLObject expand_subl_fn) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(expand_subl_fn, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(expand_subl_fn, UNPROVIDED);
        final SubLObject non_variables = remove_if($sym51$CYC_VAR_, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject wfP = T;
        SubLObject violating_non_variables = NIL;
        if (NIL == non_variables) {
            return T;
        }
        if (non_variables.equal($list52)) {
            return T;
        }
        SubLObject cdolist_list_var = non_variables;
        SubLObject non_variable = NIL;
        non_variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == list_utilities.tree_find(non_variable, arg2, EQUAL, UNPROVIDED)) {
                violating_non_variables = cons(non_variable, violating_non_variables);
                wfP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            non_variable = cdolist_list_var.first();
        } 
        if ((NIL != violating_non_variables) && (NIL != wff.note_wff_violationP())) {
            wff.note_wff_violation(list($EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1, expand_subl_fn, violating_non_variables, cycl_utilities.formula_arg2(expand_subl_fn, UNPROVIDED)));
        }
        return wfP;
    }

    /**
     * returns t iff OBJECT is of the form #$SubLQuoteFn <SubL expression>
     * Assumes that SubLQuoteFn is not reifiable.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$SubLQuoteFn <SubL expression>\r\nAssumes that SubLQuoteFn is not reifiable.\nreturns t iff OBJECT is of the form #$SubLQuoteFn <SubL expression>\nAssumes that SubLQuoteFn is not reifiable.")
    public static final SubLObject subl_quote_fn_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$SubLQuoteFn != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt50$__SubLQuoteFn_expression, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.subl_expression_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form #$SubLQuoteFn <SubL expression>\r\nAssumes that SubLQuoteFn is not reifiable.\nreturns t iff OBJECT is of the form #$SubLQuoteFn <SubL expression>\nAssumes that SubLQuoteFn is not reifiable.")
    public static SubLObject subl_quote_fn_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$SubLQuoteFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str54$__SubLQuoteFn_expression, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL != subl_expression_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        return T;
                    }
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form #$Kappa <cycl variable sequence> <cycl sentence>
     * Assumes that #$Kappa is not reifiable.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$Kappa <cycl variable sequence> <cycl sentence>\r\nAssumes that #$Kappa is not reifiable.\nreturns t iff OBJECT is of the form #$Kappa <cycl variable sequence> <cycl sentence>\nAssumes that #$Kappa is not reifiable.")
    public static final SubLObject kappa_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$Kappa != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt51$__Kappa_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form #$Kappa <cycl variable sequence> <cycl sentence>\r\nAssumes that #$Kappa is not reifiable.\nreturns t iff OBJECT is of the form #$Kappa <cycl variable sequence> <cycl sentence>\nAssumes that #$Kappa is not reifiable.")
    public static SubLObject kappa_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$Kappa.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str55$__Kappa_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            return T;
                        }
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    }

            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form #$Lambda <cycl variable sequence> <cycl denotational term>
     * Assumes that #$Lambda is not reifiable.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$Lambda <cycl variable sequence> <cycl denotational term>\r\nAssumes that #$Lambda is not reifiable.\nreturns t iff OBJECT is of the form #$Lambda <cycl variable sequence> <cycl denotational term>\nAssumes that #$Lambda is not reifiable.")
    public static final SubLObject lambda_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$Lambda != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt52$__Lambda_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form #$Lambda <cycl variable sequence> <cycl denotational term>\r\nAssumes that #$Lambda is not reifiable.\nreturns t iff OBJECT is of the form #$Lambda <cycl variable sequence> <cycl denotational term>\nAssumes that #$Lambda is not reifiable.")
    public static SubLObject lambda_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$Lambda.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str56$__Lambda_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL != cycl_denotational_term_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            return T;
                        }
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    }

            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form #$SkolemFunctionFn <cycl variable sequence> <cycl variable> <nil or cycl variable>
     * This syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$SkolemFunctionFn <cycl variable sequence> <cycl variable> <nil or cycl variable>\r\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.\nreturns t iff OBJECT is of the form #$SkolemFunctionFn <cycl variable sequence> <cycl variable> <nil or cycl variable>\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.")
    public static final SubLObject skolem_function_fn_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$SkolemFunctionFn != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, THREE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt53$__SkolemFunctionFn_expression, THREE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            if (!((NIL == cycl_utilities.formula_arg3(v_object, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED))))) {
                                if (NIL != wff.note_wff_violationP()) {
                                    wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                }
                            } else {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form #$SkolemFunctionFn <cycl variable sequence> <cycl variable> <nil or cycl variable>\r\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.\nreturns t iff OBJECT is of the form #$SkolemFunctionFn <cycl variable sequence> <cycl variable> <nil or cycl variable>\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.")
    public static SubLObject skolem_function_fn_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$SkolemFunctionFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, THREE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str57$__SkolemFunctionFn_expression, THREE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else
                        if (NIL == cycl_variable_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            if ((NIL == cycl_utilities.formula_arg3(v_object, UNPROVIDED)) || (NIL != cycl_variable_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED)))) {
                                return T;
                            }
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        }


            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form #$SkolemFuncNFn <cycl variable sequence> <cycl variable> <nil or cycl variable> <cycl denotational term>
     * This syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form #$SkolemFuncNFn <cycl variable sequence> <cycl variable> <nil or cycl variable> <cycl denotational term>\r\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.\nreturns t iff OBJECT is of the form #$SkolemFuncNFn <cycl variable sequence> <cycl variable> <nil or cycl variable> <cycl denotational term>\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.")
    public static final SubLObject skolem_func_n_fn_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$SkolemFuncNFn != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, FOUR_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt54$__SkolemFuncNFn_expression, FOUR_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else {
                            if (!((NIL == cycl_utilities.formula_arg3(v_object, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED))))) {
                                if (NIL != wff.note_wff_violationP()) {
                                    wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                }
                            } else {
                                if (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p(cycl_utilities.formula_arg4(v_object, UNPROVIDED))) {
                                    if (NIL != wff.note_wff_violationP()) {
                                        wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                    }
                                } else {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form #$SkolemFuncNFn <cycl variable sequence> <cycl variable> <nil or cycl variable> <cycl denotational term>\r\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.\nreturns t iff OBJECT is of the form #$SkolemFuncNFn <cycl variable sequence> <cycl variable> <nil or cycl variable> <cycl denotational term>\nThis syntax is only used internally by the canonicalizer and is not part of the public CycL grammar.")
    public static SubLObject skolem_func_n_fn_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$SkolemFuncNFn.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, FOUR_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str58$__SkolemFuncNFn_expression, FOUR_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else
                    if (NIL == cycl_variable_sequence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else
                        if (NIL == cycl_variable_p(cycl_utilities.formula_arg2(v_object, UNPROVIDED))) {
                            if (NIL != wff.note_wff_violationP()) {
                                wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                            }
                        } else
                            if ((NIL != cycl_utilities.formula_arg3(v_object, UNPROVIDED)) && (NIL == cycl_variable_p(cycl_utilities.formula_arg3(v_object, UNPROVIDED)))) {
                                if (NIL != wff.note_wff_violationP()) {
                                    wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                }
                            } else {
                                if (NIL != cycl_denotational_term_p(cycl_utilities.formula_arg4(v_object, UNPROVIDED))) {
                                    return T;
                                }
                                if (NIL != wff.note_wff_violationP()) {
                                    wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                                }
                            }



            }
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <epsilon>
     * or <variable> <variable sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor <variable> <variable sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor <variable> <variable sequence>")
    public static final SubLObject cycl_variable_sequence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != epsilon_p(v_object)) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(first_in_sequence(v_object))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_sequence_p(rest_of_sequence(v_object)))));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor <variable> <variable sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor <variable> <variable sequence>")
    public static SubLObject cycl_variable_sequence_p(final SubLObject v_object) {
        return makeBoolean((NIL != epsilon_p(v_object)) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_VARIABLE_P)));
    }

    /**
     * returns t iff OBJECT is of the form <epsilon>
     * or <cycl term> <cycl term sequence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor <cycl term> <cycl term sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor <cycl term> <cycl term sequence>")
    public static final SubLObject cycl_term_sequence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != epsilon_p(v_object)) || (((NIL != el_sequence_p(v_object)) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_term_p(first_in_sequence(v_object)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_term_sequence_p(rest_of_sequence(v_object)))));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <epsilon>\r\nor <cycl term> <cycl term sequence>\nreturns t iff OBJECT is of the form <epsilon>\nor <cycl term> <cycl term sequence>")
    public static SubLObject cycl_term_sequence_p(final SubLObject v_object) {
        return makeBoolean((NIL != epsilon_p(v_object)) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_TERM_P)));
    }

    public static SubLObject cycl_term_sequence_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $grammar_uses_kbP$.currentBinding(thread);
        try {
            $grammar_uses_kbP$.bind(NIL, thread);
            result = cycl_term_sequence_p(v_object);
        } finally {
            $grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * returns t iff OBJECT is a syntactically well-formed SubL expression.
     */
    @LispMethod(comment = "returns t iff OBJECT is a syntactically well-formed SubL expression.")
    public static final SubLObject subl_expression_syntax_p_alt(SubLObject v_object) {
        return T;
    }

    @LispMethod(comment = "returns t iff OBJECT is a syntactically well-formed SubL expression.")
    public static SubLObject subl_expression_syntax_p(final SubLObject v_object) {
        return T;
    }

    /**
     * returns t iff OBJECT is of the form <denotational term>
     * or <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <denotational term>\r\nor <sentence>\nreturns t iff OBJECT is of the form <denotational term>\nor <sentence>")
    public static final SubLObject cycl_expression_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p(v_object)) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.within_quote_formP()) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.escape_quote_syntax_p(v_object)))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <denotational term>\r\nor <sentence>\nreturns t iff OBJECT is of the form <denotational term>\nor <sentence>")
    public static SubLObject cycl_expression_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_denotational_term_p(v_object)) || ((NIL != within_quote_formP()) && (NIL != escape_quote_syntax_p(v_object)))) || (NIL != cycl_sentence_p(v_object)));
    }

    public static final SubLObject cycl_term_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.cycl_grammar.cycl_expression_p(v_object);
    }

    public static SubLObject cycl_term_p(final SubLObject v_object) {
        return cycl_expression_p(v_object);
    }

    /**
     * returns t iff OBJECT is of the form <represented term>
     * or <SubL atomic term>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nor <SubL atomic term>\nreturns t iff OBJECT is of the form <represented term>\nor <SubL atomic term>")
    public static final SubLObject cycl_denotational_term_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_represented_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_atomic_term_p(v_object))) || (NIL != (NIL != $grammar_permits_quoted_forms$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_grammar.cycl_quoted_term_p(v_object))) : NIL)));
        }
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nor <SubL atomic term>\nreturns t iff OBJECT is of the form <represented term>\nor <SubL atomic term>")
    public static SubLObject cycl_denotational_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != cycl_represented_term_p(v_object)) || (NIL != subl_atomic_term_p(v_object))) || (NIL != (NIL != $grammar_permits_quoted_forms$.getDynamicValue(thread) ? cycl_quoted_term_p(v_object) : NIL)));
    }

    /**
     * returns t iff OBJECT is of the form <quote form>
     * or <quasiquote form>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <quote form>\r\nor <quasiquote form>\nreturns t iff OBJECT is of the form <quote form>\nor <quasiquote form>")
    public static final SubLObject cycl_quoted_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.quote_syntax_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.quasi_quote_syntax_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <quote form>\r\nor <quasiquote form>\nreturns t iff OBJECT is of the form <quote form>\nor <quasiquote form>")
    public static SubLObject cycl_quoted_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != quote_syntax_p(v_object)) || (NIL != quasi_quote_syntax_p(v_object)));
    }

    /**
     * returns t if OBJECT is of form (#$Quote <something>) or (#$QuasiQuote <something>).
     * Use this when we know object is syntactically well formed
     */
    @LispMethod(comment = "returns t if OBJECT is of form (#$Quote <something>) or (#$QuasiQuote <something>).\r\nUse this when we know object is syntactically well formed\nreturns t if OBJECT is of form (#$Quote <something>) or (#$QuasiQuote <something>).\nUse this when we know object is syntactically well formed")
    public static final SubLObject fast_cycl_quoted_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (($$Quote == cycl_utilities.formula_arg0(v_object)) || ($$QuasiQuote == cycl_utilities.formula_arg0(v_object)))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    @LispMethod(comment = "returns t if OBJECT is of form (#$Quote <something>) or (#$QuasiQuote <something>).\r\nUse this when we know object is syntactically well formed\nreturns t if OBJECT is of form (#$Quote <something>) or (#$QuasiQuote <something>).\nUse this when we know object is syntactically well formed")
    public static SubLObject fast_cycl_quoted_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && ($$Quote.eql(cycl_utilities.formula_arg0(v_object)) || $$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object)))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject fast_quasi_quote_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && ($$QuasiQuote == cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject fast_quasi_quote_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && $$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject fast_quote_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && ($$Quote == cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject fast_quote_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && $$Quote.eql(cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject fast_escape_quote_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && ($$EscapeQuote == cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject fast_escape_quote_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && $$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject quiet_quote_syntax_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.cycl_grammar.quote_syntax_p(v_object);
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_1, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject quiet_quote_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = quote_syntax_p(v_object);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_2, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject quote_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$Quote != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt55$__Quote_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.quote_arg1_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quote_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$Quote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $$$unary_expression, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL != quote_arg1_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        return T;
                    }
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject quasi_quote_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$QuasiQuote != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt56$__QuasiQuote_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL == com.cyc.cycjava.cycl.cycl_grammar.quote_arg1_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quasi_quote_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $$$unary_expression, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (NIL != quote_arg1_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) {
                        return T;
                    }
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject quote_arg1_syntax_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_quote_form$.currentBinding(thread);
                    try {
                        $within_quote_form$.bind(T, thread);
                        if (((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_expression_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_quoted_term_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.escape_quote_syntax_p(v_object))) {
                            result = T;
                        }
                    } finally {
                        $within_quote_form$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject quote_arg1_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_quote_form$.currentBinding(thread);
        try {
            $within_quote_form$.bind(T, thread);
            if (((NIL != cycl_expression_p(v_object)) || (NIL != cycl_quoted_term_p(v_object))) || (NIL != escape_quote_syntax_p(v_object))) {
                result = T;
            }
        } finally {
            $within_quote_form$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject escape_quote_syntax_p_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
        } else {
            if ($$EscapeQuote != cycl_utilities.formula_arg0(v_object)) {
            } else {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $str_alt57$__EscapeQuote_expression, TWO_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (!(((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_expression_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_quoted_term_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.escape_quote_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))))) {
                        if (NIL != wff.note_wff_violationP()) {
                            wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                        }
                    } else {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject escape_quote_syntax_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            if ($$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object))) {
                if (NIL == formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($ARITY_MISMATCH, v_object, cycl_utilities.formula_arg0(v_object), $$$unary_expression, ONE_INTEGER, formula_arity(v_object, UNPROVIDED)));
                    }
                } else {
                    if (((NIL != cycl_expression_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED))) || (NIL != cycl_quoted_term_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))) || (NIL != escape_quote_syntax_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))) {
                        return T;
                    }
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($MALFORMED_ARGS, $$$reserved_constant, cycl_utilities.formula_arg0(v_object), cycl_utilities.formula_args(v_object, $INCLUDE)));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cycl_constant_or_nat_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_constant_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p(v_object)));
    }

    public static SubLObject cycl_constant_or_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_constant_p(v_object)) || (NIL != cycl_nat_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <constant>
     * or <nat>
     * or <variable>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <constant>\r\nor <nat>\r\nor <variable>\nreturns t iff OBJECT is of the form <constant>\nor <nat>\nor <variable>")
    public static final SubLObject cycl_represented_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_constant_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p(v_object))) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <constant>\r\nor <nat>\r\nor <variable>\nreturns t iff OBJECT is of the form <constant>\nor <nat>\nor <variable>")
    public static SubLObject cycl_represented_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_constant_p(v_object)) || (NIL != cycl_nat_p(v_object))) || (NIL != cycl_variable_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <string>
     * or <number>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <string>\r\nor <number>\nreturns t iff OBJECT is of the form <string>\nor <number>")
    public static final SubLObject cycl_unrepresented_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_string_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_real_number_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <string>\r\nor <number>\nreturns t iff OBJECT is of the form <string>\nor <number>")
    public static SubLObject cycl_unrepresented_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_string_p(v_object)) || (NIL != subl_real_number_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <SubL strict atomic term>
     * or <list> if lists are permitted as a terminal
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <SubL strict atomic term>\r\nor <list> if lists are permitted as a terminal\nreturns t iff OBJECT is of the form <SubL strict atomic term>\nor <list> if lists are permitted as a terminal")
    public static final SubLObject subl_atomic_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_strict_atomic_term_p(v_object)) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_list_as_terminalP()) && v_object.isCons()));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <SubL strict atomic term>\r\nor <list> if lists are permitted as a terminal\nreturns t iff OBJECT is of the form <SubL strict atomic term>\nor <list> if lists are permitted as a terminal")
    public static SubLObject subl_atomic_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_strict_atomic_term_p(v_object)) || ((NIL != grammar_permits_list_as_terminalP()) && v_object.isCons()));
    }

    /**
     * returns t iff OBJECT is of the form <string>
     * or <number>
     * or <symbol>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <string>\r\nor <number>\r\nor <symbol>\nreturns t iff OBJECT is of the form <string>\nor <number>\nor <symbol>")
    public static final SubLObject subl_strict_atomic_term_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_unrepresented_term_p(v_object)) || (NIL != (NIL != $grammar_permits_symbol_as_terminalP$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_grammar.subl_non_variable_symbol_p(v_object))) : NIL)));
        }
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <string>\r\nor <number>\r\nor <symbol>\nreturns t iff OBJECT is of the form <string>\nor <number>\nor <symbol>")
    public static SubLObject subl_strict_atomic_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != cycl_unrepresented_term_p(v_object)) || (NIL != (NIL != $grammar_permits_symbol_as_terminalP$.getDynamicValue(thread) ? subl_non_variable_symbol_p(v_object) : NIL)));
    }

    /**
     * returns t iff OBJECT is of the form <constant>
     * or <nat> in EL or HL representation
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <constant>\r\nor <nat> in EL or HL representation\nreturns t iff OBJECT is of the form <constant>\nor <nat> in EL or HL representation")
    public static final SubLObject cycl_fort_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_constant_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <constant>\r\nor <nat> in EL or HL representation\nreturns t iff OBJECT is of the form <constant>\nor <nat> in EL or HL representation")
    public static SubLObject cycl_fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_constant_p(v_object)) || (NIL != cycl_nat_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <nart> in EL or HL representation
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <nart> in EL or HL representation")
    public static final SubLObject cycl_nart_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nart_handles.nart_p(v_object)) {
                return T;
            } else {
                if (v_object.isCons() && (NIL != narts_high.find_nart(v_object))) {
                    return T;
                } else {
                    if (v_object.isCons()) {
                        {
                            SubLObject v_answer = NIL;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    v_answer = czer_utilities.reifiable_termP(v_object);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return v_answer;
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <nart> in EL or HL representation")
    public static SubLObject cycl_nart_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(v_object)) {
            return T;
        }
        if (v_object.isCons() && (NIL != narts_high.find_nart(v_object))) {
            return T;
        }
        if (v_object.isCons()) {
            SubLObject v_answer = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                v_answer = czer_utilities.reifiable_termP(v_object);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return v_answer;
        }
        return NIL;
    }

    /**
     * returns t iff OBJECT is of the form <nat> but not <nart> in EL or HL representation
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <nat> but not <nart> in EL or HL representation")
    public static final SubLObject cycl_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p(v_object)) && (NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_nart_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <nat> but not <nart> in EL or HL representation")
    public static SubLObject cycl_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_nat_p(v_object)) && (NIL == cycl_nart_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <regularly quantified sentence>
     * or <bounded existential sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <regularly quantified sentence>\r\nor <bounded existential sentence>\nreturns t iff OBJECT is of the form <regularly quantified sentence>\nor <bounded existential sentence>")
    public static final SubLObject cycl_quantified_sentence_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_regularly_quantified_sentence_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_bounded_existential_sentence_p(v_object)));
        }
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <regularly quantified sentence>\r\nor <bounded existential sentence>\nreturns t iff OBJECT is of the form <regularly quantified sentence>\nor <bounded existential sentence>")
    public static SubLObject cycl_quantified_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return makeBoolean(((NIL != cycl_regularly_quantified_sentence_p(v_object)) || (NIL != cycl_multiply_quantified_sentence_p(v_object))) || (NIL != cycl_bounded_existential_sentence_p(v_object)));
    }

    public static final SubLObject cycl_formula_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_formulaic_sentence_p(v_object)));
    }

    public static SubLObject cycl_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_nat_p(v_object)) || (NIL != cycl_formulaic_sentence_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <atomic sentence>
     * or <not> <atomic sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <atomic sentence>\r\nor <not> <atomic sentence>\nreturns t iff OBJECT is of the form <atomic sentence>\nor <not> <atomic sentence>")
    public static final SubLObject cycl_literal_p_alt(SubLObject v_object) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return com.cyc.cycjava.cycl.cycl_grammar.cycl_literal_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        } else {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_atomic_sentence_p(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != el_negation_p(v_object))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_atomic_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))));
        }
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <atomic sentence>\r\nor <not> <atomic sentence>\nreturns t iff OBJECT is of the form <atomic sentence>\nor <not> <atomic sentence>")
    public static SubLObject cycl_literal_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_literal_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return makeBoolean((NIL != cycl_atomic_sentence_p(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != el_negation_p(v_object))) && (NIL != cycl_atomic_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))));
    }

    /**
     * returns t iff OBJ is of the form (<tense operator> <atomic sentence>) or is a negated tensed literal.
     */
    @LispMethod(comment = "returns t iff OBJ is of the form (<tense operator> <atomic sentence>) or is a negated tensed literal.")
    public static final SubLObject cycl_tensed_literal_p_alt(SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != cyc_const_tense_operator_p(literal_predicate(obj, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_literal_p(obj)));
    }

    @LispMethod(comment = "returns t iff OBJ is of the form (<tense operator> <atomic sentence>) or is a negated tensed literal.")
    public static SubLObject cycl_tensed_literal_p(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != cyc_const_tense_operator_p(literal_predicate(obj, UNPROVIDED)))) && (NIL != cycl_literal_p(obj)));
    }

    /**
     * returns t iff OBJ is of the form (<generalized tense operator> <atomic sentence>) or is a negated generalized tensed literal.
     */
    @LispMethod(comment = "returns t iff OBJ is of the form (<generalized tense operator> <atomic sentence>) or is a negated generalized tensed literal.")
    public static final SubLObject cycl_generalized_tensed_literal_p_alt(SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != cyc_const_generalized_tense_operator_p(literal_predicate(obj, UNPROVIDED)))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_literal_p(obj)));
    }

    @LispMethod(comment = "returns t iff OBJ is of the form (<generalized tense operator> <atomic sentence>) or is a negated generalized tensed literal.")
    public static SubLObject cycl_generalized_tensed_literal_p(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != cyc_const_generalized_tense_operator_p(literal_predicate(obj, UNPROVIDED)))) && (NIL != cycl_literal_p(obj)));
    }

    /**
     * returns t iff OBJECT is of the form <strict denotational term>
     * or <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <strict denotational term>\r\nor <sentence>\nreturns t iff OBJECT is of the form <strict denotational term>\nor <sentence>")
    public static final SubLObject cycl_strict_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_strict_denotational_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <strict denotational term>
     * or <sentence>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <strict denotational term>\r\nor <sentence>\nreturns t iff OBJECT is of the form <strict denotational term>\nor <sentence>")
    public static SubLObject cycl_strict_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_strict_denotational_term_p(v_object)) || (NIL != cycl_sentence_p(v_object)));
    }

    /**
     * returns t iff OBJECT is of the form <represented term>
     * or <SubL strict atomic term>
     */
    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nor <SubL strict atomic term>\nreturns t iff OBJECT is of the form <represented term>\nor <SubL strict atomic term>")
    public static final SubLObject cycl_strict_denotational_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_represented_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_strict_atomic_term_p(v_object)));
    }

    @LispMethod(comment = "returns t iff OBJECT is of the form <represented term>\r\nor <SubL strict atomic term>\nreturns t iff OBJECT is of the form <represented term>\nor <SubL strict atomic term>")
    public static SubLObject cycl_strict_denotational_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_represented_term_p(v_object)) || (NIL != subl_strict_atomic_term_p(v_object)));
    }

    public static final SubLObject proposed_el_formula_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $grammar_uses_kbP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $grammar_permits_hlP$.currentBinding(thread);
                    try {
                        $grammar_uses_kbP$.bind(NIL, thread);
                        $grammar_permits_hlP$.bind(NIL, thread);
                        result = makeBoolean((NIL != el_formula_p(v_object)) && (((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(v_object))) || (NIL != collection_defns.cycl_unbound_relation_formula_p(v_object))));
                    } finally {
                        $grammar_permits_hlP$.rebind(_prev_bind_1, thread);
                        $grammar_uses_kbP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject proposed_el_formula_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $grammar_uses_kbP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $grammar_permits_hlP$.currentBinding(thread);
        try {
            $grammar_uses_kbP$.bind(NIL, thread);
            $grammar_permits_hlP$.bind(NIL, thread);
            result = makeBoolean((NIL != el_formula_p(v_object)) && (((NIL != cycl_nat_p(v_object)) || (NIL != cycl_sentence_p(v_object))) || (NIL != collection_defns.cycl_unbound_relation_formula_p(v_object))));
        } finally {
            $grammar_permits_hlP$.rebind(_prev_bind_2, thread);
            $grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject cycl_boolean_sentence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_truth_value_p(v_object)) || ((NIL != el_formula_p(v_object)) && ((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_atomic_sentence_p(v_object)) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_logical_operator_p(cycl_utilities.formula_operator(v_object))) && (NIL != every_in_list(CYCL_BOOLEAN_SENTENCE_P, cycl_utilities.formula_args(v_object, $REGULARIZE), UNPROVIDED))))));
    }

    public static SubLObject cycl_boolean_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_truth_value_p(v_object)) || ((NIL != el_formula_p(v_object)) && ((NIL != cycl_atomic_sentence_p(v_object)) || ((NIL != cycl_logical_operator_p(cycl_utilities.formula_operator(v_object))) && (NIL != list_utilities.every_in_list(CYCL_BOOLEAN_SENTENCE_P, cycl_utilities.formula_args(v_object, $REGULARIZE), UNPROVIDED))))));
    }

    public static final SubLObject cycl_boolean_combination_of_type_alt(SubLObject test, SubLObject v_object) {
        {
            SubLObject result = makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_truth_value_p(v_object)) || (NIL != funcall(test, v_object)));
            if (((NIL == result) && (NIL != el_formula_p(v_object))) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.cycl_logical_operator_p(cycl_utilities.formula_operator(v_object)))) {
                {
                    SubLObject anti_result = NIL;
                    SubLObject args = cycl_utilities.formula_args(v_object, $REGULARIZE);
                    SubLObject rest = NIL;
                    for (rest = args; !((NIL != anti_result) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject item = rest.first();
                            anti_result = makeBoolean(NIL == com.cyc.cycjava.cycl.cycl_grammar.cycl_boolean_combination_of_type(test, item));
                        }
                    }
                    result = makeBoolean(NIL == anti_result);
                }
            }
            return result;
        }
    }

    public static SubLObject cycl_boolean_combination_of_type(final SubLObject test, final SubLObject v_object) {
        SubLObject result = makeBoolean((NIL != cycl_truth_value_p(v_object)) || (NIL != funcall(test, v_object)));
        if (((NIL == result) && (NIL != el_formula_p(v_object))) && (NIL != cycl_logical_operator_p(cycl_utilities.formula_operator(v_object)))) {
            SubLObject anti_result = NIL;
            final SubLObject args = cycl_utilities.formula_args(v_object, $REGULARIZE);
            SubLObject rest;
            SubLObject item;
            for (rest = NIL, rest = args; (NIL == anti_result) && (NIL != rest); anti_result = makeBoolean(NIL == cycl_boolean_combination_of_type(test, item)) , rest = rest.rest()) {
                item = rest.first();
            }
            result = makeBoolean(NIL == anti_result);
        }
        return result;
    }

    public static final SubLObject cycl_constant_p_alt(SubLObject v_object) {
        return constant_p(v_object);
    }

    public static SubLObject cycl_constant_p(final SubLObject v_object) {
        return constant_p(v_object);
    }

    public static final SubLObject subl_string_p_alt(SubLObject v_object) {
        if (!v_object.isString()) {
        } else {
            if (NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_non_ascii_stringsP()) {
                return T;
            } else {
                if (NIL == unicode_strings.ascii_string_p(v_object)) {
                    if (NIL != wff.note_wff_violationP()) {
                        wff.note_wff_violation(list($NOT_AN_ASCII_STRING, v_object));
                    }
                } else {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject subl_string_p(final SubLObject v_object) {
        if (v_object.isString()) {
            if (NIL != grammar_permits_non_ascii_stringsP()) {
                return T;
            }
            if (NIL != unicode_strings.ascii_string_p(v_object)) {
                return T;
            }
            if (NIL != wff.note_wff_violationP()) {
                wff.note_wff_violation(list($NOT_AN_ASCII_STRING, v_object));
            }
        }
        return NIL;
    }

    public static final SubLObject subl_real_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_integer_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_float_p(v_object)));
    }

    public static SubLObject subl_real_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_integer_p(v_object)) || (NIL != subl_float_p(v_object)));
    }

    public static final SubLObject subl_float_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL == com.cyc.cycjava.cycl.cycl_grammar.subl_integer_p(v_object)));
    }

    public static SubLObject subl_float_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL == subl_integer_p(v_object)));
    }

    public static final SubLObject subl_integer_p_alt(SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject subl_integer_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static final SubLObject subl_non_variable_symbol_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL == com.cyc.cycjava.cycl.cycl_grammar.el_variable_p(v_object)));
    }

    public static SubLObject subl_non_variable_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL == el_variable_p(v_object)));
    }

    public static final SubLObject subl_non_variable_non_keyword_symbol_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_grammar.subl_non_variable_symbol_p(v_object)) && (!v_object.isKeyword()));
    }

    public static SubLObject subl_non_variable_non_keyword_symbol_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_non_variable_symbol_p(v_object)) && (!v_object.isKeyword()));
    }

    public static final SubLObject cycl_variable_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.cycl_grammar.el_variable_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_grammar.meta_variable_p(v_object))) || ((NIL != com.cyc.cycjava.cycl.cycl_grammar.grammar_permits_hlP()) && (NIL != com.cyc.cycjava.cycl.cycl_grammar.hl_variable_p(v_object))));
    }

    public static SubLObject cycl_variable_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_variable_p(v_object)) || (NIL != meta_variable_p(v_object))) || ((NIL != grammar_permits_hlP()) && (NIL != hl_variable_p(v_object))));
    }

    public static final SubLObject meta_variable_p_alt(SubLObject v_object) {
        return cycl_variables.keyword_varP(v_object);
    }

    public static SubLObject meta_variable_p(final SubLObject v_object) {
        return cycl_variables.keyword_varP(v_object);
    }

    public static final SubLObject el_variable_p_alt(SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }

    public static SubLObject el_variable_p(final SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }

    public static final SubLObject hl_variable_p_alt(SubLObject v_object) {
        return variables.variable_p(v_object);
    }

    public static SubLObject hl_variable_p(final SubLObject v_object) {
        return variables.variable_p(v_object);
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is an operator that takes a naked list of EL variables as its arg1.
    As of Jan 2009, the only such operators are #$Kappa and #$Lambda.
     */
    @LispMethod(comment = "@return booleanp; t iff OBJECT is an operator that takes a naked list of EL variables as its arg1.\r\nAs of Jan 2009, the only such operators are #$Kappa and #$Lambda.")
    public static final SubLObject el_var_list_operator_p_alt(SubLObject v_object) {
        return makeBoolean((v_object == $$Kappa) || (v_object == $$Lambda));
    }

    /**
     *
     *
     * @return booleanp; t iff OBJECT is an operator that takes a naked list of EL variables as its arg1.
    As of Jan 2009, the only such operators are #$Kappa and #$Lambda.
     */
    @LispMethod(comment = "@return booleanp; t iff OBJECT is an operator that takes a naked list of EL variables as its arg1.\r\nAs of Jan 2009, the only such operators are #$Kappa and #$Lambda.")
    public static SubLObject el_var_list_operator_p(final SubLObject v_object) {
        return makeBoolean(v_object.eql($$Kappa) || v_object.eql($$Lambda));
    }

    /**
     *
     *
     * @return 0 string; the violations explaining why OBJECT is not a sentence.
     * @return 1 boolean; t iff OBJECT is a well formed sentence according to the CycL syntax.
     */
    @LispMethod(comment = "@return 0 string; the violations explaining why OBJECT is not a sentence.\r\n@return 1 boolean; t iff OBJECT is a well formed sentence according to the CycL syntax.")
    public static final SubLObject why_not_cycl_sentence_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                SubLObject violation_string = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wffP = com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p(v_object);
                        violation_string = wff.explain_wff_violations(nreverse(wff_vars.$wff_violations$.getDynamicValue(thread)));
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_2, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_1, thread);
                        wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(violation_string, wffP);
            }
        }
    }

    /**
     *
     *
     * @return 0 string; the violations explaining why OBJECT is not a sentence.
     * @return 1 boolean; t iff OBJECT is a well formed sentence according to the CycL syntax.
     */
    @LispMethod(comment = "@return 0 string; the violations explaining why OBJECT is not a sentence.\r\n@return 1 boolean; t iff OBJECT is a well formed sentence according to the CycL syntax.")
    public static SubLObject why_not_cycl_sentence(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        SubLObject violation_string = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wffP = cycl_sentence_p(v_object);
            violation_string = wff.explain_wff_violations(nreverse(wff_vars.$wff_violations$.getDynamicValue(thread)));
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return values(violation_string, wffP);
    }

    /**
     *
     *
     * @return 0 string; the violations explaining why OBJECT is not a expression.
     * @return 1 boolean; t iff OBJECT is a well formed expression according to the CycL syntax.
     */
    @LispMethod(comment = "@return 0 string; the violations explaining why OBJECT is not a expression.\r\n@return 1 boolean; t iff OBJECT is a well formed expression according to the CycL syntax.")
    public static final SubLObject why_not_cycl_expression_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                SubLObject violation_string = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(T, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                        wffP = com.cyc.cycjava.cycl.cycl_grammar.cycl_expression_p(v_object);
                        violation_string = wff.explain_wff_violations(nreverse(wff_vars.$wff_violations$.getDynamicValue(thread)));
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_2, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_1, thread);
                        wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(violation_string, wffP);
            }
        }
    }

    /**
     *
     *
     * @return 0 string; the violations explaining why OBJECT is not a expression.
     * @return 1 boolean; t iff OBJECT is a well formed expression according to the CycL syntax.
     */
    @LispMethod(comment = "@return 0 string; the violations explaining why OBJECT is not a expression.\r\n@return 1 boolean; t iff OBJECT is a well formed expression according to the CycL syntax.")
    public static SubLObject why_not_cycl_expression(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        SubLObject violation_string = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wffP = cycl_expression_p(v_object);
            violation_string = wff.explain_wff_violations(nreverse(wff_vars.$wff_violations$.getDynamicValue(thread)));
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return values(violation_string, wffP);
    }

    /**
     *
     *
     * @return 0 string; the violations explaining why OBJECT is not a term
     * @return 1 boolean; t iff OBJECT is a well formed term according to the CycL syntax.
     */
    @LispMethod(comment = "@return 0 string; the violations explaining why OBJECT is not a term\r\n@return 1 boolean; t iff OBJECT is a well formed term according to the CycL syntax.")
    public static final SubLObject why_not_cycl_term_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.cycl_grammar.why_not_cycl_expression(v_object);
    }

    /**
     *
     *
     * @return 0 string; the violations explaining why OBJECT is not a term
     * @return 1 boolean; t iff OBJECT is a well formed term according to the CycL syntax.
     */
    @LispMethod(comment = "@return 0 string; the violations explaining why OBJECT is not a term\r\n@return 1 boolean; t iff OBJECT is a well formed term according to the CycL syntax.")
    public static SubLObject why_not_cycl_term(final SubLObject v_object) {
        return why_not_cycl_expression(v_object);
    }

    public static final SubLObject declare_cycl_grammar_file_alt() {
        declareFunction("grammar_permits_hlP", "GRAMMAR-PERMITS-HL?", 0, 0, false);
        declareFunction("grammar_permits_list_as_terminalP", "GRAMMAR-PERMITS-LIST-AS-TERMINAL?", 0, 0, false);
        declareFunction("grammar_permits_non_ascii_stringsP", "GRAMMAR-PERMITS-NON-ASCII-STRINGS?", 0, 0, false);
        declareFunction("grammar_permissive_wrt_variablesP", "GRAMMAR-PERMISSIVE-WRT-VARIABLES?", 0, 0, false);
        declareFunction("grammar_uses_kbP", "GRAMMAR-USES-KB?", 0, 0, false);
        declareFunction("within_quote_formP", "WITHIN-QUOTE-FORM?", 0, 0, false);
        declareMacro("without_grammar_admitting_hl", "WITHOUT-GRAMMAR-ADMITTING-HL");
        declareMacro("with_grammar_admitting_hl", "WITH-GRAMMAR-ADMITTING-HL");
        declareMacro("without_grammar_using_kb", "WITHOUT-GRAMMAR-USING-KB");
        declareMacro("with_grammar_using_kb", "WITH-GRAMMAR-USING-KB");
        declareMacro("gather_syntax_violations", "GATHER-SYNTAX-VIOLATIONS");
        declareMacro("dont_gather_syntax_violations", "DONT-GATHER-SYNTAX-VIOLATIONS");
        declareMacro("handle_syntax_violation", "HANDLE-SYNTAX-VIOLATION");
        declareMacro("within_quote_form", "WITHIN-QUOTE-FORM");
        declareMacro("allow_escape_quote_when_quote_predicate", "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
        declareFunction("cycl_sentence_p", "CYCL-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_formulaic_sentence_p", "CYCL-FORMULAIC-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_sentence_sequence_p", "CYCL-SENTENCE-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_truth_value_p", "CYCL-TRUTH-VALUE-P", 1, 0, false);
        declareFunction("cycl_formula_predicate", "CYCL-FORMULA-PREDICATE", 1, 0, false);
        declareFunction("cycl_unary_sentence_p", "CYCL-UNARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_binary_sentence_p", "CYCL-BINARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_ternary_sentence_p", "CYCL-TERNARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_quaternary_sentence_p", "CYCL-QUATERNARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_quintary_sentence_p", "CYCL-QUINTARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_variable_arity_sentence_p", "CYCL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_user_defined_logical_operator_sentence_p", "CYCL-USER-DEFINED-LOGICAL-OPERATOR-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_regularly_quantified_sentence_p", "CYCL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_bounded_existential_sentence_p", "CYCL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_logical_operator_p", "CYCL-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("cycl_quantifier_p", "CYCL-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_regular_quantifier_p", "CYCL-REGULAR-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_bounded_existential_quantifier_p", "CYCL-BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_atomic_sentence_p", "CYCL-ATOMIC-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_argument_sequence_p", "CYCL-ARGUMENT-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_predicate_p", "CYCL-PREDICATE-P", 1, 0, false);
        declareFunction("cycl_function_p", "CYCL-FUNCTION-P", 1, 0, false);
        declareFunction("cycl_nat_p", "CYCL-NAT-P", 1, 0, false);
        declareFunction("cycl_formula_has_valid_arityP", "CYCL-FORMULA-HAS-VALID-ARITY?", 1, 0, false);
        declareFunction("expand_subl_fn_syntax_p", "EXPAND-SUBL-FN-SYNTAX-P", 1, 0, false);
        declareFunction("expand_subl_fn_syntax_p_int", "EXPAND-SUBL-FN-SYNTAX-P-INT", 1, 0, false);
        declareFunction("subl_quote_fn_syntax_p", "SUBL-QUOTE-FN-SYNTAX-P", 1, 0, false);
        declareFunction("kappa_syntax_p", "KAPPA-SYNTAX-P", 1, 0, false);
        declareFunction("lambda_syntax_p", "LAMBDA-SYNTAX-P", 1, 0, false);
        declareFunction("skolem_function_fn_syntax_p", "SKOLEM-FUNCTION-FN-SYNTAX-P", 1, 0, false);
        declareFunction("skolem_func_n_fn_syntax_p", "SKOLEM-FUNC-N-FN-SYNTAX-P", 1, 0, false);
        declareFunction("cycl_variable_sequence_p", "CYCL-VARIABLE-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_term_sequence_p", "CYCL-TERM-SEQUENCE-P", 1, 0, false);
        declareFunction("subl_expression_syntax_p", "SUBL-EXPRESSION-SYNTAX-P", 1, 0, false);
        declareFunction("cycl_expression_p", "CYCL-EXPRESSION-P", 1, 0, false);
        declareFunction("cycl_term_p", "CYCL-TERM-P", 1, 0, false);
        declareFunction("cycl_denotational_term_p", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction("cycl_quoted_term_p", "CYCL-QUOTED-TERM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$cycl_quoted_term_p$UnaryFunction();
        declareFunction("fast_cycl_quoted_term_p", "FAST-CYCL-QUOTED-TERM-P", 1, 0, false);
        declareFunction("fast_quasi_quote_term_p", "FAST-QUASI-QUOTE-TERM-P", 1, 0, false);
        declareFunction("fast_quote_term_p", "FAST-QUOTE-TERM-P", 1, 0, false);
        declareFunction("fast_escape_quote_term_p", "FAST-ESCAPE-QUOTE-TERM-P", 1, 0, false);
        declareFunction("quiet_quote_syntax_p", "QUIET-QUOTE-SYNTAX-P", 1, 0, false);
        declareFunction("quote_syntax_p", "QUOTE-SYNTAX-P", 1, 0, false);
        declareFunction("quasi_quote_syntax_p", "QUASI-QUOTE-SYNTAX-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$quasi_quote_syntax_p$UnaryFunction();
        declareFunction("quote_arg1_syntax_p", "QUOTE-ARG1-SYNTAX-P", 1, 0, false);
        declareFunction("escape_quote_syntax_p", "ESCAPE-QUOTE-SYNTAX-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$escape_quote_syntax_p$UnaryFunction();
        declareFunction("cycl_constant_or_nat_p", "CYCL-CONSTANT-OR-NAT-P", 1, 0, false);
        declareFunction("cycl_represented_term_p", "CYCL-REPRESENTED-TERM-P", 1, 0, false);
        declareFunction("cycl_unrepresented_term_p", "CYCL-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction("subl_atomic_term_p", "SUBL-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("subl_strict_atomic_term_p", "SUBL-STRICT-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("cycl_fort_p", "CYCL-FORT-P", 1, 0, false);
        declareFunction("cycl_nart_p", "CYCL-NART-P", 1, 0, false);
        declareFunction("cycl_naut_p", "CYCL-NAUT-P", 1, 0, false);
        declareFunction("cycl_quantified_sentence_p", "CYCL-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_formula_p", "CYCL-FORMULA-P", 1, 0, false);
        declareFunction("cycl_literal_p", "CYCL-LITERAL-P", 1, 0, false);
        declareFunction("cycl_tensed_literal_p", "CYCL-TENSED-LITERAL-P", 1, 0, false);
        declareFunction("cycl_generalized_tensed_literal_p", "CYCL-GENERALIZED-TENSED-LITERAL-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$cycl_generalized_tensed_literal_p$UnaryFunction();
        declareFunction("cycl_strict_term_p", "CYCL-STRICT-TERM-P", 1, 0, false);
        declareFunction("cycl_strict_denotational_term_p", "CYCL-STRICT-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction("proposed_el_formula_p", "PROPOSED-EL-FORMULA-P", 1, 0, false);
        declareFunction("cycl_boolean_sentence_p", "CYCL-BOOLEAN-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_boolean_combination_of_type", "CYCL-BOOLEAN-COMBINATION-OF-TYPE", 2, 0, false);
        declareFunction("cycl_constant_p", "CYCL-CONSTANT-P", 1, 0, false);
        declareFunction("subl_string_p", "SUBL-STRING-P", 1, 0, false);
        declareFunction("subl_real_number_p", "SUBL-REAL-NUMBER-P", 1, 0, false);
        declareFunction("subl_float_p", "SUBL-FLOAT-P", 1, 0, false);
        declareFunction("subl_integer_p", "SUBL-INTEGER-P", 1, 0, false);
        declareFunction("subl_non_variable_symbol_p", "SUBL-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        declareFunction("subl_non_variable_non_keyword_symbol_p", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
        declareFunction("cycl_variable_p", "CYCL-VARIABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$cycl_variable_p$UnaryFunction();
        declareFunction("meta_variable_p", "META-VARIABLE-P", 1, 0, false);
        declareFunction("el_variable_p", "EL-VARIABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$el_variable_p$UnaryFunction();
        declareFunction("hl_variable_p", "HL-VARIABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_grammar.$hl_variable_p$UnaryFunction();
        declareFunction("el_var_list_operator_p", "EL-VAR-LIST-OPERATOR-P", 1, 0, false);
        declareFunction("why_not_cycl_sentence", "WHY-NOT-CYCL-SENTENCE", 1, 0, false);
        declareFunction("why_not_cycl_expression", "WHY-NOT-CYCL-EXPRESSION", 1, 0, false);
        declareFunction("why_not_cycl_term", "WHY-NOT-CYCL-TERM", 1, 0, false);
        declareFunction("get_cycl_nart_p_test_case_p_queue", "GET-CYCL-NART-P-TEST-CASE-P-QUEUE", 1, 0, false);
        declareFunction("set_cycl_nart_p_test_case_p_queue", "SET-CYCL-NART-P-TEST-CASE-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_nart_p_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-NART-P-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_nart_p_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-NART-P-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("cycl_nart_p_test_case_p", "CYCL-NART-P-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cycl_grammar_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("grammar_permits_hlP", "GRAMMAR-PERMITS-HL?", 0, 0, false);
            declareFunction("grammar_permits_list_as_terminalP", "GRAMMAR-PERMITS-LIST-AS-TERMINAL?", 0, 0, false);
            declareFunction("grammar_permits_non_ascii_stringsP", "GRAMMAR-PERMITS-NON-ASCII-STRINGS?", 0, 0, false);
            declareFunction("grammar_permissive_wrt_variablesP", "GRAMMAR-PERMISSIVE-WRT-VARIABLES?", 0, 0, false);
            declareFunction("grammar_uses_kbP", "GRAMMAR-USES-KB?", 0, 0, false);
            declareFunction("within_quote_formP", "WITHIN-QUOTE-FORM?", 0, 0, false);
            declareMacro("without_grammar_admitting_hl", "WITHOUT-GRAMMAR-ADMITTING-HL");
            declareMacro("with_grammar_admitting_hl", "WITH-GRAMMAR-ADMITTING-HL");
            declareMacro("without_grammar_using_kb", "WITHOUT-GRAMMAR-USING-KB");
            declareMacro("with_grammar_using_kb", "WITH-GRAMMAR-USING-KB");
            declareMacro("gather_syntax_violations", "GATHER-SYNTAX-VIOLATIONS");
            declareMacro("dont_gather_syntax_violations", "DONT-GATHER-SYNTAX-VIOLATIONS");
            declareMacro("handle_syntax_violation", "HANDLE-SYNTAX-VIOLATION");
            declareMacro("within_quote_form", "WITHIN-QUOTE-FORM");
            declareMacro("allow_escape_quote_when_quote_predicate", "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
            declareFunction("cycl_sentence_p", "CYCL-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_formulaic_sentence_p", "CYCL-FORMULAIC-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_sequence_of_test_p", "CYCL-SEQUENCE-OF-TEST-P", 2, 0, false);
            declareFunction("cycl_sentence_sequence_p", "CYCL-SENTENCE-SEQUENCE-P", 1, 0, false);
            declareFunction("cycl_truth_value_p", "CYCL-TRUTH-VALUE-P", 1, 0, false);
            declareFunction("cycl_true_p", "CYCL-TRUE-P", 1, 0, false);
            declareFunction("cycl_false_p", "CYCL-FALSE-P", 1, 0, false);
            declareFunction("cycl_formula_predicate", "CYCL-FORMULA-PREDICATE", 1, 0, false);
            declareFunction("cycl_unary_sentence_p", "CYCL-UNARY-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_binary_sentence_p", "CYCL-BINARY-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_ternary_sentence_p", "CYCL-TERNARY-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_quaternary_sentence_p", "CYCL-QUATERNARY-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_quintary_sentence_p", "CYCL-QUINTARY-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_variable_arity_sentence_p", "CYCL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_user_defined_logical_operator_sentence_p", "CYCL-USER-DEFINED-LOGICAL-OPERATOR-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_regularly_quantified_sentence_p", "CYCL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_bounded_existential_sentence_p", "CYCL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_multiply_quantified_sentence_p", "CYCL-MULTIPLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_logical_operator_p", "CYCL-LOGICAL-OPERATOR-P", 1, 0, false);
            declareFunction("cycl_quantifier_p", "CYCL-QUANTIFIER-P", 1, 0, false);
            declareFunction("cycl_regular_quantifier_p", "CYCL-REGULAR-QUANTIFIER-P", 1, 0, false);
            declareFunction("cycl_multi_quantifier_p", "CYCL-MULTI-QUANTIFIER-P", 1, 0, false);
            declareFunction("cycl_bounded_existential_quantifier_p", "CYCL-BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
            declareFunction("cycl_atomic_sentence_p", "CYCL-ATOMIC-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_argument_sequence_p", "CYCL-ARGUMENT-SEQUENCE-P", 1, 0, false);
            declareFunction("cycl_predicate_p", "CYCL-PREDICATE-P", 1, 0, false);
            declareFunction("cycl_function_p", "CYCL-FUNCTION-P", 1, 0, false);
            declareFunction("cycl_nat_p", "CYCL-NAT-P", 1, 0, false);
            declareFunction("cycl_formula_has_valid_arityP", "CYCL-FORMULA-HAS-VALID-ARITY?", 1, 0, false);
            declareFunction("expand_subl_fn_syntax_p", "EXPAND-SUBL-FN-SYNTAX-P", 1, 0, false);
            declareFunction("expand_subl_fn_syntax_p_int", "EXPAND-SUBL-FN-SYNTAX-P-INT", 1, 0, false);
            declareFunction("subl_quote_fn_syntax_p", "SUBL-QUOTE-FN-SYNTAX-P", 1, 0, false);
            declareFunction("kappa_syntax_p", "KAPPA-SYNTAX-P", 1, 0, false);
            declareFunction("lambda_syntax_p", "LAMBDA-SYNTAX-P", 1, 0, false);
            declareFunction("skolem_function_fn_syntax_p", "SKOLEM-FUNCTION-FN-SYNTAX-P", 1, 0, false);
            declareFunction("skolem_func_n_fn_syntax_p", "SKOLEM-FUNC-N-FN-SYNTAX-P", 1, 0, false);
            declareFunction("cycl_variable_sequence_p", "CYCL-VARIABLE-SEQUENCE-P", 1, 0, false);
            declareFunction("cycl_term_sequence_p", "CYCL-TERM-SEQUENCE-P", 1, 0, false);
            declareFunction("cycl_term_sequence_syntax_p", "CYCL-TERM-SEQUENCE-SYNTAX-P", 1, 0, false);
            declareFunction("subl_expression_syntax_p", "SUBL-EXPRESSION-SYNTAX-P", 1, 0, false);
            declareFunction("cycl_expression_p", "CYCL-EXPRESSION-P", 1, 0, false);
            declareFunction("cycl_term_p", "CYCL-TERM-P", 1, 0, false);
            declareFunction("cycl_denotational_term_p", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
            declareFunction("cycl_quoted_term_p", "CYCL-QUOTED-TERM-P", 1, 0, false);
            new cycl_grammar.$cycl_quoted_term_p$UnaryFunction();
            declareFunction("fast_cycl_quoted_term_p", "FAST-CYCL-QUOTED-TERM-P", 1, 0, false);
            declareFunction("fast_quasi_quote_term_p", "FAST-QUASI-QUOTE-TERM-P", 1, 0, false);
            declareFunction("fast_quote_term_p", "FAST-QUOTE-TERM-P", 1, 0, false);
            declareFunction("fast_escape_quote_term_p", "FAST-ESCAPE-QUOTE-TERM-P", 1, 0, false);
            declareFunction("quiet_quote_syntax_p", "QUIET-QUOTE-SYNTAX-P", 1, 0, false);
            declareFunction("quote_syntax_p", "QUOTE-SYNTAX-P", 1, 0, false);
            declareFunction("quasi_quote_syntax_p", "QUASI-QUOTE-SYNTAX-P", 1, 0, false);
            new cycl_grammar.$quasi_quote_syntax_p$UnaryFunction();
            declareFunction("quote_arg1_syntax_p", "QUOTE-ARG1-SYNTAX-P", 1, 0, false);
            declareFunction("escape_quote_syntax_p", "ESCAPE-QUOTE-SYNTAX-P", 1, 0, false);
            new cycl_grammar.$escape_quote_syntax_p$UnaryFunction();
            declareFunction("cycl_constant_or_nat_p", "CYCL-CONSTANT-OR-NAT-P", 1, 0, false);
            declareFunction("cycl_represented_term_p", "CYCL-REPRESENTED-TERM-P", 1, 0, false);
            declareFunction("cycl_unrepresented_term_p", "CYCL-UNREPRESENTED-TERM-P", 1, 0, false);
            declareFunction("subl_atomic_term_p", "SUBL-ATOMIC-TERM-P", 1, 0, false);
            declareFunction("subl_strict_atomic_term_p", "SUBL-STRICT-ATOMIC-TERM-P", 1, 0, false);
            declareFunction("cycl_fort_p", "CYCL-FORT-P", 1, 0, false);
            declareFunction("cycl_nart_p", "CYCL-NART-P", 1, 0, false);
            declareFunction("cycl_naut_p", "CYCL-NAUT-P", 1, 0, false);
            declareFunction("cycl_quantified_sentence_p", "CYCL-QUANTIFIED-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_formula_p", "CYCL-FORMULA-P", 1, 0, false);
            declareFunction("cycl_literal_p", "CYCL-LITERAL-P", 1, 0, false);
            declareFunction("cycl_tensed_literal_p", "CYCL-TENSED-LITERAL-P", 1, 0, false);
            declareFunction("cycl_generalized_tensed_literal_p", "CYCL-GENERALIZED-TENSED-LITERAL-P", 1, 0, false);
            new cycl_grammar.$cycl_generalized_tensed_literal_p$UnaryFunction();
            declareFunction("cycl_strict_term_p", "CYCL-STRICT-TERM-P", 1, 0, false);
            declareFunction("cycl_strict_denotational_term_p", "CYCL-STRICT-DENOTATIONAL-TERM-P", 1, 0, false);
            declareFunction("proposed_el_formula_p", "PROPOSED-EL-FORMULA-P", 1, 0, false);
            declareFunction("cycl_boolean_sentence_p", "CYCL-BOOLEAN-SENTENCE-P", 1, 0, false);
            declareFunction("cycl_boolean_combination_of_type", "CYCL-BOOLEAN-COMBINATION-OF-TYPE", 2, 0, false);
            declareFunction("cycl_constant_p", "CYCL-CONSTANT-P", 1, 0, false);
            declareFunction("subl_string_p", "SUBL-STRING-P", 1, 0, false);
            declareFunction("subl_real_number_p", "SUBL-REAL-NUMBER-P", 1, 0, false);
            declareFunction("subl_float_p", "SUBL-FLOAT-P", 1, 0, false);
            declareFunction("subl_integer_p", "SUBL-INTEGER-P", 1, 0, false);
            declareFunction("subl_non_variable_symbol_p", "SUBL-NON-VARIABLE-SYMBOL-P", 1, 0, false);
            declareFunction("subl_non_variable_non_keyword_symbol_p", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
            declareFunction("cycl_variable_p", "CYCL-VARIABLE-P", 1, 0, false);
            new cycl_grammar.$cycl_variable_p$UnaryFunction();
            declareFunction("meta_variable_p", "META-VARIABLE-P", 1, 0, false);
            declareFunction("el_variable_p", "EL-VARIABLE-P", 1, 0, false);
            new cycl_grammar.$el_variable_p$UnaryFunction();
            declareFunction("hl_variable_p", "HL-VARIABLE-P", 1, 0, false);
            new cycl_grammar.$hl_variable_p$UnaryFunction();
            declareFunction("el_var_list_operator_p", "EL-VAR-LIST-OPERATOR-P", 1, 0, false);
            declareFunction("why_not_cycl_sentence", "WHY-NOT-CYCL-SENTENCE", 1, 0, false);
            declareFunction("why_not_cycl_expression", "WHY-NOT-CYCL-EXPRESSION", 1, 0, false);
            declareFunction("why_not_cycl_term", "WHY-NOT-CYCL-TERM", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_cycl_nart_p_test_case_p_queue", "GET-CYCL-NART-P-TEST-CASE-P-QUEUE", 1, 0, false);
            declareFunction("set_cycl_nart_p_test_case_p_queue", "SET-CYCL-NART-P-TEST-CASE-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_nart_p_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-NART-P-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_nart_p_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-NART-P-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("cycl_nart_p_test_case_p", "CYCL-NART-P-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cycl_grammar_file_Previous() {
        declareFunction("grammar_permits_hlP", "GRAMMAR-PERMITS-HL?", 0, 0, false);
        declareFunction("grammar_permits_list_as_terminalP", "GRAMMAR-PERMITS-LIST-AS-TERMINAL?", 0, 0, false);
        declareFunction("grammar_permits_non_ascii_stringsP", "GRAMMAR-PERMITS-NON-ASCII-STRINGS?", 0, 0, false);
        declareFunction("grammar_permissive_wrt_variablesP", "GRAMMAR-PERMISSIVE-WRT-VARIABLES?", 0, 0, false);
        declareFunction("grammar_uses_kbP", "GRAMMAR-USES-KB?", 0, 0, false);
        declareFunction("within_quote_formP", "WITHIN-QUOTE-FORM?", 0, 0, false);
        declareMacro("without_grammar_admitting_hl", "WITHOUT-GRAMMAR-ADMITTING-HL");
        declareMacro("with_grammar_admitting_hl", "WITH-GRAMMAR-ADMITTING-HL");
        declareMacro("without_grammar_using_kb", "WITHOUT-GRAMMAR-USING-KB");
        declareMacro("with_grammar_using_kb", "WITH-GRAMMAR-USING-KB");
        declareMacro("gather_syntax_violations", "GATHER-SYNTAX-VIOLATIONS");
        declareMacro("dont_gather_syntax_violations", "DONT-GATHER-SYNTAX-VIOLATIONS");
        declareMacro("handle_syntax_violation", "HANDLE-SYNTAX-VIOLATION");
        declareMacro("within_quote_form", "WITHIN-QUOTE-FORM");
        declareMacro("allow_escape_quote_when_quote_predicate", "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
        declareFunction("cycl_sentence_p", "CYCL-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_formulaic_sentence_p", "CYCL-FORMULAIC-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_sequence_of_test_p", "CYCL-SEQUENCE-OF-TEST-P", 2, 0, false);
        declareFunction("cycl_sentence_sequence_p", "CYCL-SENTENCE-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_truth_value_p", "CYCL-TRUTH-VALUE-P", 1, 0, false);
        declareFunction("cycl_true_p", "CYCL-TRUE-P", 1, 0, false);
        declareFunction("cycl_false_p", "CYCL-FALSE-P", 1, 0, false);
        declareFunction("cycl_formula_predicate", "CYCL-FORMULA-PREDICATE", 1, 0, false);
        declareFunction("cycl_unary_sentence_p", "CYCL-UNARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_binary_sentence_p", "CYCL-BINARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_ternary_sentence_p", "CYCL-TERNARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_quaternary_sentence_p", "CYCL-QUATERNARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_quintary_sentence_p", "CYCL-QUINTARY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_variable_arity_sentence_p", "CYCL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_user_defined_logical_operator_sentence_p", "CYCL-USER-DEFINED-LOGICAL-OPERATOR-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_regularly_quantified_sentence_p", "CYCL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_bounded_existential_sentence_p", "CYCL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_multiply_quantified_sentence_p", "CYCL-MULTIPLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_logical_operator_p", "CYCL-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("cycl_quantifier_p", "CYCL-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_regular_quantifier_p", "CYCL-REGULAR-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_multi_quantifier_p", "CYCL-MULTI-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_bounded_existential_quantifier_p", "CYCL-BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction("cycl_atomic_sentence_p", "CYCL-ATOMIC-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_argument_sequence_p", "CYCL-ARGUMENT-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_predicate_p", "CYCL-PREDICATE-P", 1, 0, false);
        declareFunction("cycl_function_p", "CYCL-FUNCTION-P", 1, 0, false);
        declareFunction("cycl_nat_p", "CYCL-NAT-P", 1, 0, false);
        declareFunction("cycl_formula_has_valid_arityP", "CYCL-FORMULA-HAS-VALID-ARITY?", 1, 0, false);
        declareFunction("expand_subl_fn_syntax_p", "EXPAND-SUBL-FN-SYNTAX-P", 1, 0, false);
        declareFunction("expand_subl_fn_syntax_p_int", "EXPAND-SUBL-FN-SYNTAX-P-INT", 1, 0, false);
        declareFunction("subl_quote_fn_syntax_p", "SUBL-QUOTE-FN-SYNTAX-P", 1, 0, false);
        declareFunction("kappa_syntax_p", "KAPPA-SYNTAX-P", 1, 0, false);
        declareFunction("lambda_syntax_p", "LAMBDA-SYNTAX-P", 1, 0, false);
        declareFunction("skolem_function_fn_syntax_p", "SKOLEM-FUNCTION-FN-SYNTAX-P", 1, 0, false);
        declareFunction("skolem_func_n_fn_syntax_p", "SKOLEM-FUNC-N-FN-SYNTAX-P", 1, 0, false);
        declareFunction("cycl_variable_sequence_p", "CYCL-VARIABLE-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_term_sequence_p", "CYCL-TERM-SEQUENCE-P", 1, 0, false);
        declareFunction("cycl_term_sequence_syntax_p", "CYCL-TERM-SEQUENCE-SYNTAX-P", 1, 0, false);
        declareFunction("subl_expression_syntax_p", "SUBL-EXPRESSION-SYNTAX-P", 1, 0, false);
        declareFunction("cycl_expression_p", "CYCL-EXPRESSION-P", 1, 0, false);
        declareFunction("cycl_term_p", "CYCL-TERM-P", 1, 0, false);
        declareFunction("cycl_denotational_term_p", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction("cycl_quoted_term_p", "CYCL-QUOTED-TERM-P", 1, 0, false);
        new cycl_grammar.$cycl_quoted_term_p$UnaryFunction();
        declareFunction("fast_cycl_quoted_term_p", "FAST-CYCL-QUOTED-TERM-P", 1, 0, false);
        declareFunction("fast_quasi_quote_term_p", "FAST-QUASI-QUOTE-TERM-P", 1, 0, false);
        declareFunction("fast_quote_term_p", "FAST-QUOTE-TERM-P", 1, 0, false);
        declareFunction("fast_escape_quote_term_p", "FAST-ESCAPE-QUOTE-TERM-P", 1, 0, false);
        declareFunction("quiet_quote_syntax_p", "QUIET-QUOTE-SYNTAX-P", 1, 0, false);
        declareFunction("quote_syntax_p", "QUOTE-SYNTAX-P", 1, 0, false);
        declareFunction("quasi_quote_syntax_p", "QUASI-QUOTE-SYNTAX-P", 1, 0, false);
        new cycl_grammar.$quasi_quote_syntax_p$UnaryFunction();
        declareFunction("quote_arg1_syntax_p", "QUOTE-ARG1-SYNTAX-P", 1, 0, false);
        declareFunction("escape_quote_syntax_p", "ESCAPE-QUOTE-SYNTAX-P", 1, 0, false);
        new cycl_grammar.$escape_quote_syntax_p$UnaryFunction();
        declareFunction("cycl_constant_or_nat_p", "CYCL-CONSTANT-OR-NAT-P", 1, 0, false);
        declareFunction("cycl_represented_term_p", "CYCL-REPRESENTED-TERM-P", 1, 0, false);
        declareFunction("cycl_unrepresented_term_p", "CYCL-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction("subl_atomic_term_p", "SUBL-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("subl_strict_atomic_term_p", "SUBL-STRICT-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("cycl_fort_p", "CYCL-FORT-P", 1, 0, false);
        declareFunction("cycl_nart_p", "CYCL-NART-P", 1, 0, false);
        declareFunction("cycl_naut_p", "CYCL-NAUT-P", 1, 0, false);
        declareFunction("cycl_quantified_sentence_p", "CYCL-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_formula_p", "CYCL-FORMULA-P", 1, 0, false);
        declareFunction("cycl_literal_p", "CYCL-LITERAL-P", 1, 0, false);
        declareFunction("cycl_tensed_literal_p", "CYCL-TENSED-LITERAL-P", 1, 0, false);
        declareFunction("cycl_generalized_tensed_literal_p", "CYCL-GENERALIZED-TENSED-LITERAL-P", 1, 0, false);
        new cycl_grammar.$cycl_generalized_tensed_literal_p$UnaryFunction();
        declareFunction("cycl_strict_term_p", "CYCL-STRICT-TERM-P", 1, 0, false);
        declareFunction("cycl_strict_denotational_term_p", "CYCL-STRICT-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction("proposed_el_formula_p", "PROPOSED-EL-FORMULA-P", 1, 0, false);
        declareFunction("cycl_boolean_sentence_p", "CYCL-BOOLEAN-SENTENCE-P", 1, 0, false);
        declareFunction("cycl_boolean_combination_of_type", "CYCL-BOOLEAN-COMBINATION-OF-TYPE", 2, 0, false);
        declareFunction("cycl_constant_p", "CYCL-CONSTANT-P", 1, 0, false);
        declareFunction("subl_string_p", "SUBL-STRING-P", 1, 0, false);
        declareFunction("subl_real_number_p", "SUBL-REAL-NUMBER-P", 1, 0, false);
        declareFunction("subl_float_p", "SUBL-FLOAT-P", 1, 0, false);
        declareFunction("subl_integer_p", "SUBL-INTEGER-P", 1, 0, false);
        declareFunction("subl_non_variable_symbol_p", "SUBL-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        declareFunction("subl_non_variable_non_keyword_symbol_p", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
        declareFunction("cycl_variable_p", "CYCL-VARIABLE-P", 1, 0, false);
        new cycl_grammar.$cycl_variable_p$UnaryFunction();
        declareFunction("meta_variable_p", "META-VARIABLE-P", 1, 0, false);
        declareFunction("el_variable_p", "EL-VARIABLE-P", 1, 0, false);
        new cycl_grammar.$el_variable_p$UnaryFunction();
        declareFunction("hl_variable_p", "HL-VARIABLE-P", 1, 0, false);
        new cycl_grammar.$hl_variable_p$UnaryFunction();
        declareFunction("el_var_list_operator_p", "EL-VAR-LIST-OPERATOR-P", 1, 0, false);
        declareFunction("why_not_cycl_sentence", "WHY-NOT-CYCL-SENTENCE", 1, 0, false);
        declareFunction("why_not_cycl_expression", "WHY-NOT-CYCL-EXPRESSION", 1, 0, false);
        declareFunction("why_not_cycl_term", "WHY-NOT-CYCL-TERM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cycl_grammar_file() {
        defvar("*GRAMMAR-PERMITS-HL?*", T);
        defvar("*GRAMMAR-USES-KB?*", T);
        defparameter("*GRAMMAR-PERMITS-LIST-AS-TERMINAL?*", NIL);
        defparameter("*GRAMMAR-PERMITS-SYMBOL-AS-TERMINAL?*", NIL);
        defparameter("*GRAMMAR-PERMITS-NON-ASCII-STRINGS?*", NIL);
        defparameter("*GRAMMAR-PERMISSIVE-WRT-VARIABLES?*", T);
        defparameter("*GRAMMAR-PERMITS-QUOTED-FORMS*", T);
        defvar("*WITHIN-QUOTE-FORM*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cycl_grammar_file_alt() {
        register_kb_function(SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
        sunit_external.define_test_category($str_alt64$CycL_Grammar_Module_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($$$CycL_Grammar_Subcategory, list($str_alt64$CycL_Grammar_Module_Supercategory));
        sunit_external.define_test_suite($$$CycL_Grammar_Testing_Suite, list($str_alt64$CycL_Grammar_Module_Supercategory), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CYCL_NART_P_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(CYCL_NART_P_TEST_CASE);
        classes.subloop_new_class(CYCL_NART_P_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt69);
        classes.class_set_implements_slot_listeners(CYCL_NART_P_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(CYCL_NART_P_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CYCL_NART_P_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYCL_NART_P_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CYCL_NART_P_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.cycl_grammar.subloop_reserved_initialize_cycl_nart_p_test_case_class(CYCL_NART_P_TEST_CASE);
        sunit_macros.define_test_case_postamble(CYCL_NART_P_TEST_CASE, $str_alt85$cycl_grammar, $$$cycl, $list_alt87);
        sunit_macros.def_test_method_register(CYCL_NART_P_TEST_CASE, TEST);
        define_test_case_table_int(CYCL_FORMULA_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt97);
        define_test_case_table_int(CYCL_SENTENCE_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt99);
        define_test_case_table_int(CYCL_EXPRESSION_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt102);
        return NIL;
    }

    public static SubLObject setup_cycl_grammar_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
            sunit_external.define_test_category($str66$CycL_Grammar_Module_Supercategory, UNPROVIDED);
            sunit_external.define_test_category($$$CycL_Grammar_Subcategory, list($str66$CycL_Grammar_Module_Supercategory));
            sunit_external.define_test_suite($$$CycL_Grammar_Testing_Suite, list($str66$CycL_Grammar_Module_Supercategory), UNPROVIDED, UNPROVIDED);
            define_test_case_table_int(CYCL_FORMULA_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list76);
            define_test_case_table_int(CYCL_SENTENCE_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list77);
            define_test_case_table_int(CYCL_EXPRESSION_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list80);
        }
        if (SubLFiles.USE_V2) {
            sunit_external.define_test_category($str_alt64$CycL_Grammar_Module_Supercategory, UNPROVIDED);
            sunit_external.define_test_category($$$CycL_Grammar_Subcategory, list($str_alt64$CycL_Grammar_Module_Supercategory));
            sunit_external.define_test_suite($$$CycL_Grammar_Testing_Suite, list($str_alt64$CycL_Grammar_Module_Supercategory), UNPROVIDED, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CYCL_NART_P_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(CYCL_NART_P_TEST_CASE);
            classes.subloop_new_class(CYCL_NART_P_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt69);
            classes.class_set_implements_slot_listeners(CYCL_NART_P_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(CYCL_NART_P_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CYCL_NART_P_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(CYCL_NART_P_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CYCL_NART_P_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.cycl_grammar.subloop_reserved_initialize_cycl_nart_p_test_case_class(CYCL_NART_P_TEST_CASE);
            sunit_macros.define_test_case_postamble(CYCL_NART_P_TEST_CASE, $str_alt85$cycl_grammar, $$$cycl, $list_alt87);
            sunit_macros.def_test_method_register(CYCL_NART_P_TEST_CASE, TEST);
            define_test_case_table_int(CYCL_FORMULA_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt97);
            define_test_case_table_int(CYCL_SENTENCE_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt99);
            define_test_case_table_int(CYCL_EXPRESSION_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt102);
        }
        return NIL;
    }

    public static SubLObject setup_cycl_grammar_file_Previous() {
        register_kb_function(SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
        sunit_external.define_test_category($str66$CycL_Grammar_Module_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($$$CycL_Grammar_Subcategory, list($str66$CycL_Grammar_Module_Supercategory));
        sunit_external.define_test_suite($$$CycL_Grammar_Testing_Suite, list($str66$CycL_Grammar_Module_Supercategory), UNPROVIDED, UNPROVIDED);
        define_test_case_table_int(CYCL_FORMULA_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list76);
        define_test_case_table_int(CYCL_SENTENCE_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list77);
        define_test_case_table_int(CYCL_EXPRESSION_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list80);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycl_grammar_file();
    }

    @Override
    public void initializeVariables() {
        init_cycl_grammar_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycl_grammar_file();
    }

    

    public static final class $cycl_quoted_term_p$UnaryFunction extends UnaryFunction {
        public $cycl_quoted_term_p$UnaryFunction() {
            super(extractFunctionNamed("CYCL-QUOTED-TERM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_quoted_term_p(arg1);
        }
    }

    public static final class $quasi_quote_syntax_p$UnaryFunction extends UnaryFunction {
        public $quasi_quote_syntax_p$UnaryFunction() {
            super(extractFunctionNamed("QUASI-QUOTE-SYNTAX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return quasi_quote_syntax_p(arg1);
        }
    }

    public static final class $escape_quote_syntax_p$UnaryFunction extends UnaryFunction {
        public $escape_quote_syntax_p$UnaryFunction() {
            super(extractFunctionNamed("ESCAPE-QUOTE-SYNTAX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return escape_quote_syntax_p(arg1);
        }
    }

    public static final class $cycl_generalized_tensed_literal_p$UnaryFunction extends UnaryFunction {
        public $cycl_generalized_tensed_literal_p$UnaryFunction() {
            super(extractFunctionNamed("CYCL-GENERALIZED-TENSED-LITERAL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_generalized_tensed_literal_p(arg1);
        }
    }

    public static final class $cycl_variable_p$UnaryFunction extends UnaryFunction {
        public $cycl_variable_p$UnaryFunction() {
            super(extractFunctionNamed("CYCL-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_variable_p(arg1);
        }
    }

    public static final class $el_variable_p$UnaryFunction extends UnaryFunction {
        public $el_variable_p$UnaryFunction() {
            super(extractFunctionNamed("EL-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return el_variable_p(arg1);
        }
    }

    public static final class $hl_variable_p$UnaryFunction extends UnaryFunction {
        public $hl_variable_p$UnaryFunction() {
            super(extractFunctionNamed("HL-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_variable_p(arg1);
        }
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), NIL));

    static private final SubLList $list_alt2 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), T));

    static private final SubLList $list_alt3 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), NIL));

    static private final SubLList $list_alt4 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), T));

    static private final SubLList $list_alt5 = list(list(makeSymbol("*WFF-VIOLATIONS*"), NIL), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));

    static private final SubLList $list_alt6 = list(list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), NIL), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), NIL));

    static private final SubLList $list_alt7 = list(makeSymbol("VIOLATION"));

    static private final SubLList $list_alt9 = list(makeSymbol("NOTE-WFF-VIOLATION?"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("*WITHIN-QUOTE-FORM*"), T));

    static private final SubLList $list_alt12 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt14 = list(reader_make_constant_shell("Quote"));

    static private final SubLString $str_alt45$__ExpandSubLFn_expression = makeString("#$ExpandSubLFn expression");

    static private final SubLSymbol $sym47$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLList $list_alt48 = list(NIL);

    static private final SubLString $str_alt50$__SubLQuoteFn_expression = makeString("#$SubLQuoteFn expression");

    static private final SubLString $str_alt51$__Kappa_expression = makeString("#$Kappa expression");

    static private final SubLString $str_alt52$__Lambda_expression = makeString("#$Lambda expression");

    static private final SubLString $str_alt53$__SkolemFunctionFn_expression = makeString("#$SkolemFunctionFn expression");

    static private final SubLString $str_alt54$__SkolemFuncNFn_expression = makeString("#$SkolemFuncNFn expression");

    static private final SubLString $str_alt55$__Quote_expression = makeString("#$Quote expression");

    static private final SubLString $str_alt56$__QuasiQuote_expression = makeString("#$QuasiQuote expression");

    static private final SubLString $str_alt57$__EscapeQuote_expression = makeString("#$EscapeQuote expression");

    static private final SubLString $str_alt64$CycL_Grammar_Module_Supercategory = makeString("CycL-Grammar Module Supercategory");

    private static final SubLSymbol CYCL_NART_P_TEST_CASE = makeSymbol("CYCL-NART-P-TEST-CASE");

    static private final SubLList $list_alt69 = list(list(makeSymbol("P-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_NART_P_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-NART-P-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_NART_P_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-NART-P-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt85$cycl_grammar = makeString("cycl-grammar");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt87 = list(makeString("CycL Grammar Subcategory"));

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt97 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("and"), makeKeyword("ARG1"), makeKeyword("ARG2"))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?VAR")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(reader_make_constant_shell("isa")), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), NIL), list(list(list(makeInteger(212), reader_make_constant_shell("isa"))), NIL), list(list(list(reader_make_constant_shell("Dog"), reader_make_constant_shell("JuvenileFn"))), NIL), list(list(list(reader_make_constant_shell("forAll"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("foo")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), makeSymbol("?ARG"), list(reader_make_constant_shell("isa"), makeSymbol("?ARG"), reader_make_constant_shell("Thing"))))), NIL) });

    static private final SubLList $list_alt99 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), T), list(list(list(reader_make_constant_shell("and"), makeKeyword("ARG1"), makeKeyword("ARG2"))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?VAR")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), T), list(list(list(makeSymbol("??Y"), makeSymbol("?X"))), T), list(list(list(makeSymbol("?X"), makeSymbol("??Y"))), T), list(list(list(makeSymbol("?X"), makeKeyword("ARG1"))), T), list(list(list(makeKeyword("ARG1"), makeSymbol("?X"))), T), list(list(list(reader_make_constant_shell("isa"), list(makeKeyword("ARG1"), makeSymbol("?X")), reader_make_constant_shell("Thing"))), T), list(list(reader_make_constant_shell("isa")), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("isa"))), NIL), list(list(list(makeInteger(212), reader_make_constant_shell("isa"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), NIL), list(list(list(reader_make_constant_shell("Dog"), reader_make_constant_shell("JuvenileFn"))), NIL), list(list(list(reader_make_constant_shell("forAll"), list(reader_make_constant_shell("TLVariableFn"), ZERO_INTEGER, makeString("foo")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Thing"))))), NIL), list(list(list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), makeSymbol("?ARG"), list(reader_make_constant_shell("isa"), makeSymbol("?ARG"), reader_make_constant_shell("Thing"))))), NIL) });

    static private final SubLList $list_alt102 = list(list(list(list(reader_make_constant_shell("SkolemFunctionFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), makeSymbol("?Y"))), T), list(list(list(reader_make_constant_shell("SkolemFunctionFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), NIL)), T), list(list(list(reader_make_constant_shell("SkolemFuncNFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), makeSymbol("?Y"), makeInteger(212))), T), list(list(list(reader_make_constant_shell("SkolemFuncNFn"), list(makeSymbol("?WHERE")), makeSymbol("?X"), NIL, makeInteger(212))), T));
}

/**
 * Total time: 440 ms
 */
