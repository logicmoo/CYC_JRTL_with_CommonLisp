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
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.function_specP;
import static com.cyc.cycjava.cycl.el_utilities.last_of_sequence;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.predicate_specP;
import static com.cyc.cycjava.cycl.el_utilities.sequence_non_var;
import static com.cyc.cycjava.cycl.el_utilities.user_defined_bounded_existential_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.user_defined_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.wf_wrt_sequence_varsP;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cycl_grammar extends SubLTranslatedFile {
    public static final SubLFile me = new cycl_grammar();

    public static final String myName = "com.cyc.cycjava.cycl.cycl_grammar";

    public static final String myFingerPrint = "ae0e14be6f5769db13aaeaad6e123a22b2600e890f7d81fba9c8903013b54986";

    // defvar
    public static final SubLSymbol $grammar_permits_hlP$ = makeSymbol("*GRAMMAR-PERMITS-HL?*");

    // defvar
    public static final SubLSymbol $grammar_uses_kbP$ = makeSymbol("*GRAMMAR-USES-KB?*");

    // defparameter
    // do we permit a SubLList as a terminal in the grammar?
    public static final SubLSymbol $grammar_permits_list_as_terminalP$ = makeSymbol("*GRAMMAR-PERMITS-LIST-AS-TERMINAL?*");

    // defparameter
    /**
     * do we permit a SubLNonVariableNonKeyWordSymbol as a terminal in the grammar?
     */
    public static final SubLSymbol $grammar_permits_symbol_as_terminalP$ = makeSymbol("*GRAMMAR-PERMITS-SYMBOL-AS-TERMINAL?*");

    // defparameter
    // do we permit strings that contain non-ASCII characters?
    public static final SubLSymbol $grammar_permits_non_ascii_stringsP$ = makeSymbol("*GRAMMAR-PERMITS-NON-ASCII-STRINGS?*");

    // defparameter
    /**
     * do we permit a variable to denote anything permitted by the CycL grammar (t)
     * or do we treat variables as syntactic, opaque objects, and disallow sentences
     * and formulas to be denoted by variables (nil) ?
     */
    private static final SubLSymbol $grammar_permissive_wrt_variablesP$ = makeSymbol("*GRAMMAR-PERMISSIVE-WRT-VARIABLES?*");

    // defparameter
    // do we permit quoted forms in the grammar?
    private static final SubLSymbol $grammar_permits_quoted_forms$ = makeSymbol("*GRAMMAR-PERMITS-QUOTED-FORMS*");

    // defvar
    public static final SubLSymbol $within_quote_form$ = makeSymbol("*WITHIN-QUOTE-FORM*");



    public static final SubLList $list1 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), NIL));

    public static final SubLList $list2 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), T));

    public static final SubLList $list3 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), NIL));

    public static final SubLList $list4 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), T));

    public static final SubLList $list5 = list(list(makeSymbol("*WFF-VIOLATIONS*"), NIL), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));

    public static final SubLList $list6 = list(list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), NIL), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), NIL));

    public static final SubLList $list7 = list(makeSymbol("VIOLATION"));



    public static final SubLList $list9 = list(makeSymbol("NOTE-WFF-VIOLATION?"));

    public static final SubLSymbol NOTE_WFF_VIOLATION = makeSymbol("NOTE-WFF-VIOLATION");

    public static final SubLList $list11 = list(list(makeSymbol("*WITHIN-QUOTE-FORM*"), T));

    public static final SubLList $list12 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list14 = list(reader_make_constant_shell(makeString("Quote")));

    public static final SubLSymbol WITHIN_QUOTE_FORM = makeSymbol("WITHIN-QUOTE-FORM");

    private static final SubLSymbol $NOT_A_TRUTH_FUNCTION = makeKeyword("NOT-A-TRUTH-FUNCTION");

    private static final SubLSymbol $NOT_AN_EL_FORMULA = makeKeyword("NOT-AN-EL-FORMULA");



    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$EscapeQuote = reader_make_constant_shell(makeString("EscapeQuote"));



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



    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $$QuasiQuote = reader_make_constant_shell(makeString("QuasiQuote"));

    private static final SubLObject $$ExpandSubLFn = reader_make_constant_shell(makeString("ExpandSubLFn"));

    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

    private static final SubLObject $$Kappa = reader_make_constant_shell(makeString("Kappa"));

    private static final SubLObject $$Lambda = reader_make_constant_shell(makeString("Lambda"));

    private static final SubLObject $$SkolemFunctionFn = reader_make_constant_shell(makeString("SkolemFunctionFn"));

    private static final SubLObject $$SkolemFuncNFn = reader_make_constant_shell(makeString("SkolemFuncNFn"));

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



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol CYCL_BOOLEAN_SENTENCE_P = makeSymbol("CYCL-BOOLEAN-SENTENCE-P");



    private static final SubLSymbol $NOT_AN_ASCII_STRING = makeKeyword("NOT-AN-ASCII-STRING");

    private static final SubLSymbol SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");

    private static final SubLString $str66$CycL_Grammar_Module_Supercategory = makeString("CycL-Grammar Module Supercategory");

    private static final SubLString $$$CycL_Grammar_Subcategory = makeString("CycL Grammar Subcategory");

    private static final SubLString $$$CycL_Grammar_Testing_Suite = makeString("CycL Grammar Testing Suite");

    private static final SubLSymbol CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");













    private static final SubLList $list76 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")))), T), list(list(list(reader_make_constant_shell(makeString("JuvenileFn")), reader_make_constant_shell(makeString("Dog")))), T), list(list(list(reader_make_constant_shell(makeString("and")), makeKeyword("ARG1"), makeKeyword("ARG2"))), T), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(makeSymbol("?VAR")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Thing")))))), T), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(reader_make_constant_shell(makeString("Dog"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Thing")))))), T), list(list(reader_make_constant_shell(makeString("isa"))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")))), NIL), list(list(list(makeInteger(212), reader_make_constant_shell(makeString("isa")))), NIL), list(list(list(reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("JuvenileFn")))), NIL), list(list(list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("TLVariableFn")), ZERO_INTEGER, makeString("foo")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Thing"))))), NIL), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Thing")))))), NIL), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), makeSymbol("?ARG"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ARG"), reader_make_constant_shell(makeString("Thing")))))), NIL) });

    private static final SubLList $list77 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")))), T), list(list(list(reader_make_constant_shell(makeString("and")), makeKeyword("ARG1"), makeKeyword("ARG2"))), T), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(makeSymbol("?VAR")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Thing")))))), T), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(reader_make_constant_shell(makeString("Dog"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Thing")))))), T), list(list(list(makeSymbol("??Y"), makeSymbol("?X"))), T), list(list(list(makeSymbol("?X"), makeSymbol("??Y"))), T), list(list(list(makeSymbol("?X"), makeKeyword("ARG1"))), T), list(list(list(makeKeyword("ARG1"), makeSymbol("?X"))), T), list(list(list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("ARG1"), makeSymbol("?X")), reader_make_constant_shell(makeString("Thing")))), T), list(list(reader_make_constant_shell(makeString("isa"))), NIL), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")))), NIL), list(list(list(makeInteger(212), reader_make_constant_shell(makeString("isa")))), NIL), list(list(list(reader_make_constant_shell(makeString("JuvenileFn")), reader_make_constant_shell(makeString("Dog")))), NIL), list(list(list(reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("JuvenileFn")))), NIL), list(list(list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("TLVariableFn")), ZERO_INTEGER, makeString("foo")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Thing"))))), NIL), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), list(reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Thing")))))), NIL), list(list(list(reader_make_constant_shell(makeString("trueSubL")), list(reader_make_constant_shell(makeString("ExpandSubLFn")), makeSymbol("?ARG"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ARG"), reader_make_constant_shell(makeString("Thing")))))), NIL), list(list(list(reader_make_constant_shell(makeString("forAllVars")), list(makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")))), T), list(list(list(reader_make_constant_shell(makeString("forAllVars")), list(makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")))), NIL) });





    private static final SubLList $list80 = list(list(list(list(reader_make_constant_shell(makeString("SkolemFunctionFn")), list(makeSymbol("?WHERE")), makeSymbol("?X"), makeSymbol("?Y"))), T), list(list(list(reader_make_constant_shell(makeString("SkolemFunctionFn")), list(makeSymbol("?WHERE")), makeSymbol("?X"), NIL)), T), list(list(list(reader_make_constant_shell(makeString("SkolemFuncNFn")), list(makeSymbol("?WHERE")), makeSymbol("?X"), makeSymbol("?Y"), makeInteger(212))), T), list(list(list(reader_make_constant_shell(makeString("SkolemFuncNFn")), list(makeSymbol("?WHERE")), makeSymbol("?X"), NIL, makeInteger(212))), T));

    public static SubLObject grammar_permits_hlP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permits_hlP$.getDynamicValue(thread);
    }

    public static SubLObject grammar_permits_list_as_terminalP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permits_list_as_terminalP$.getDynamicValue(thread);
    }

    public static SubLObject grammar_permits_non_ascii_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permits_non_ascii_stringsP$.getDynamicValue(thread);
    }

    public static SubLObject grammar_permissive_wrt_variablesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grammar_permissive_wrt_variablesP$.getDynamicValue(thread);
    }

    public static SubLObject grammar_uses_kbP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $grammar_uses_kbP$.getDynamicValue(thread)) && (NIL != kb_loaded()));
    }

    public static SubLObject within_quote_formP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_quote_form$.getDynamicValue(thread);
    }

    public static SubLObject without_grammar_admitting_hl(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject with_grammar_admitting_hl(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static SubLObject without_grammar_using_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    public static SubLObject with_grammar_using_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static SubLObject gather_syntax_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static SubLObject dont_gather_syntax_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

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

    public static SubLObject within_quote_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list11, append(body, NIL));
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

    public static SubLObject cycl_sentence_sequence_p(final SubLObject v_object) {
        return makeBoolean(((NIL != epsilon_p(v_object)) || (NIL != cycl_variable_p(v_object))) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_SENTENCE_P)));
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

    public static SubLObject cycl_formula_predicate(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(v_object);
        if (((NIL != $within_quote_form$.getDynamicValue(thread)) && (NIL != el_formula_p(v_object))) && $$EscapeQuote.eql(cycl_utilities.formula_arg0(arg0))) {
            return cycl_utilities.formula_arg1(arg0, UNPROVIDED);
        }
        return arg0;
    }

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

    public static SubLObject cycl_variable_arity_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_variable_arity_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return makeBoolean((((NIL != el_formula_p(v_object)) && (NIL != cyc_const_variable_arity_logical_op_p(cycl_formula_predicate(v_object)))) && (NIL != wf_wrt_sequence_varsP(v_object))) && (NIL != cycl_sentence_sequence_p(cycl_utilities.formula_args(v_object, $INCLUDE))));
    }

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

    public static SubLObject cycl_logical_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != cyc_const_logical_operator_p(v_object)) || (NIL != user_defined_logical_operator_p(v_object)));
    }

    public static SubLObject cycl_quantifier_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cyc_const_quantifier_p(v_object)) || (NIL != cycl_multi_quantifier_p(v_object))) || (NIL != user_defined_bounded_existential_operator_p(v_object)));
    }

    public static SubLObject cycl_regular_quantifier_p(final SubLObject v_object) {
        return cyc_const_regular_quantifier_p(v_object);
    }

    public static SubLObject cycl_multi_quantifier_p(final SubLObject v_object) {
        return cyc_const_multi_quantifier_p(v_object);
    }

    public static SubLObject cycl_bounded_existential_quantifier_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != cyc_const_bounded_existential_operator_p(v_object)) || (NIL != (NIL != $bootstrapping_kbP$.getDynamicValue(thread) ? NIL : user_defined_bounded_existential_operator_p(v_object))));
    }

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

    public static SubLObject cycl_argument_sequence_p(final SubLObject v_object) {
        return makeBoolean(((NIL != epsilon_p(v_object)) || (NIL != cycl_variable_p(v_object))) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_TERM_P)));
    }

    public static SubLObject cycl_predicate_p(final SubLObject v_object) {
        return makeBoolean((((NIL != cycl_represented_term_p(v_object)) && (NIL == cyc_const_logical_operator_p(v_object))) && (NIL == cyc_const_quantifier_p(v_object))) && ((NIL == grammar_uses_kbP()) || (NIL != predicate_specP(v_object, CYCL_VARIABLE_P))));
    }

    public static SubLObject cycl_function_p(final SubLObject v_object) {
        return makeBoolean((((NIL != cycl_represented_term_p(v_object)) && (NIL == cyc_const_logical_operator_p(v_object))) && (NIL == cyc_const_quantifier_p(v_object))) && ((NIL == grammar_uses_kbP()) || (NIL != function_specP(v_object, CYCL_VARIABLE_P))));
    }

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

    public static SubLObject cycl_formula_has_valid_arityP(final SubLObject formula) {
        SubLObject validP = T;
        if ((NIL != grammar_uses_kbP()) && (NIL != wff.mal_arityP(formula))) {
            validP = NIL;
        }
        return validP;
    }

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

    public static SubLObject cycl_variable_sequence_p(final SubLObject v_object) {
        return makeBoolean((NIL != epsilon_p(v_object)) || (NIL != cycl_sequence_of_test_p(v_object, CYCL_VARIABLE_P)));
    }

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

    public static SubLObject subl_expression_syntax_p(final SubLObject v_object) {
        return T;
    }

    public static SubLObject cycl_expression_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_denotational_term_p(v_object)) || ((NIL != within_quote_formP()) && (NIL != escape_quote_syntax_p(v_object)))) || (NIL != cycl_sentence_p(v_object)));
    }

    public static SubLObject cycl_term_p(final SubLObject v_object) {
        return cycl_expression_p(v_object);
    }

    public static SubLObject cycl_denotational_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != cycl_represented_term_p(v_object)) || (NIL != subl_atomic_term_p(v_object))) || (NIL != (NIL != $grammar_permits_quoted_forms$.getDynamicValue(thread) ? cycl_quoted_term_p(v_object) : NIL)));
    }

    public static SubLObject cycl_quoted_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != quote_syntax_p(v_object)) || (NIL != quasi_quote_syntax_p(v_object)));
    }

    public static SubLObject fast_cycl_quoted_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && ($$Quote.eql(cycl_utilities.formula_arg0(v_object)) || $$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object)))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject fast_quasi_quote_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && $$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject fast_quote_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && $$Quote.eql(cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject fast_escape_quote_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && $$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object))) && (NIL != formula_arityE(v_object, ONE_INTEGER, UNPROVIDED)));
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

    public static SubLObject cycl_constant_or_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_constant_p(v_object)) || (NIL != cycl_nat_p(v_object)));
    }

    public static SubLObject cycl_represented_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_constant_p(v_object)) || (NIL != cycl_nat_p(v_object))) || (NIL != cycl_variable_p(v_object)));
    }

    public static SubLObject cycl_unrepresented_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_string_p(v_object)) || (NIL != subl_real_number_p(v_object)));
    }

    public static SubLObject subl_atomic_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_strict_atomic_term_p(v_object)) || ((NIL != grammar_permits_list_as_terminalP()) && v_object.isCons()));
    }

    public static SubLObject subl_strict_atomic_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != cycl_unrepresented_term_p(v_object)) || (NIL != (NIL != $grammar_permits_symbol_as_terminalP$.getDynamicValue(thread) ? subl_non_variable_symbol_p(v_object) : NIL)));
    }

    public static SubLObject cycl_fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_constant_p(v_object)) || (NIL != cycl_nat_p(v_object)));
    }

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

    public static SubLObject cycl_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_nat_p(v_object)) && (NIL == cycl_nart_p(v_object)));
    }

    public static SubLObject cycl_quantified_sentence_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return makeBoolean(((NIL != cycl_regularly_quantified_sentence_p(v_object)) || (NIL != cycl_multiply_quantified_sentence_p(v_object))) || (NIL != cycl_bounded_existential_sentence_p(v_object)));
    }

    public static SubLObject cycl_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_nat_p(v_object)) || (NIL != cycl_formulaic_sentence_p(v_object)));
    }

    public static SubLObject cycl_literal_p(final SubLObject v_object) {
        if ((NIL != grammar_permits_hlP()) && (NIL != assertion_handles.assertion_p(v_object))) {
            return cycl_literal_p(cycl_utilities.careful_hl_term_to_el_term(v_object));
        }
        return makeBoolean((NIL != cycl_atomic_sentence_p(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != el_negation_p(v_object))) && (NIL != cycl_atomic_sentence_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))));
    }

    public static SubLObject cycl_tensed_literal_p(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != cyc_const_tense_operator_p(literal_predicate(obj, UNPROVIDED)))) && (NIL != cycl_literal_p(obj)));
    }

    public static SubLObject cycl_generalized_tensed_literal_p(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != cyc_const_generalized_tense_operator_p(literal_predicate(obj, UNPROVIDED)))) && (NIL != cycl_literal_p(obj)));
    }

    public static SubLObject cycl_strict_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_strict_denotational_term_p(v_object)) || (NIL != cycl_sentence_p(v_object)));
    }

    public static SubLObject cycl_strict_denotational_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_represented_term_p(v_object)) || (NIL != subl_strict_atomic_term_p(v_object)));
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

    public static SubLObject cycl_boolean_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_truth_value_p(v_object)) || ((NIL != el_formula_p(v_object)) && ((NIL != cycl_atomic_sentence_p(v_object)) || ((NIL != cycl_logical_operator_p(cycl_utilities.formula_operator(v_object))) && (NIL != list_utilities.every_in_list(CYCL_BOOLEAN_SENTENCE_P, cycl_utilities.formula_args(v_object, $REGULARIZE), UNPROVIDED))))));
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

    public static SubLObject cycl_constant_p(final SubLObject v_object) {
        return constant_p(v_object);
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

    public static SubLObject subl_real_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_integer_p(v_object)) || (NIL != subl_float_p(v_object)));
    }

    public static SubLObject subl_float_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL == subl_integer_p(v_object)));
    }

    public static SubLObject subl_integer_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject subl_non_variable_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL == el_variable_p(v_object)));
    }

    public static SubLObject subl_non_variable_non_keyword_symbol_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_non_variable_symbol_p(v_object)) && (!v_object.isKeyword()));
    }

    public static SubLObject cycl_variable_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_variable_p(v_object)) || (NIL != meta_variable_p(v_object))) || ((NIL != grammar_permits_hlP()) && (NIL != hl_variable_p(v_object))));
    }

    public static SubLObject meta_variable_p(final SubLObject v_object) {
        return cycl_variables.keyword_varP(v_object);
    }

    public static SubLObject el_variable_p(final SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }

    public static SubLObject hl_variable_p(final SubLObject v_object) {
        return variables.variable_p(v_object);
    }

    public static SubLObject el_var_list_operator_p(final SubLObject v_object) {
        return makeBoolean(v_object.eql($$Kappa) || v_object.eql($$Lambda));
    }

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

    public static SubLObject why_not_cycl_term(final SubLObject v_object) {
        return why_not_cycl_expression(v_object);
    }

    public static SubLObject declare_cycl_grammar_file() {
        declareFunction(me, "grammar_permits_hlP", "GRAMMAR-PERMITS-HL?", 0, 0, false);
        declareFunction(me, "grammar_permits_list_as_terminalP", "GRAMMAR-PERMITS-LIST-AS-TERMINAL?", 0, 0, false);
        declareFunction(me, "grammar_permits_non_ascii_stringsP", "GRAMMAR-PERMITS-NON-ASCII-STRINGS?", 0, 0, false);
        declareFunction(me, "grammar_permissive_wrt_variablesP", "GRAMMAR-PERMISSIVE-WRT-VARIABLES?", 0, 0, false);
        declareFunction(me, "grammar_uses_kbP", "GRAMMAR-USES-KB?", 0, 0, false);
        declareFunction(me, "within_quote_formP", "WITHIN-QUOTE-FORM?", 0, 0, false);
        declareMacro(me, "without_grammar_admitting_hl", "WITHOUT-GRAMMAR-ADMITTING-HL");
        declareMacro(me, "with_grammar_admitting_hl", "WITH-GRAMMAR-ADMITTING-HL");
        declareMacro(me, "without_grammar_using_kb", "WITHOUT-GRAMMAR-USING-KB");
        declareMacro(me, "with_grammar_using_kb", "WITH-GRAMMAR-USING-KB");
        declareMacro(me, "gather_syntax_violations", "GATHER-SYNTAX-VIOLATIONS");
        declareMacro(me, "dont_gather_syntax_violations", "DONT-GATHER-SYNTAX-VIOLATIONS");
        declareMacro(me, "handle_syntax_violation", "HANDLE-SYNTAX-VIOLATION");
        declareMacro(me, "within_quote_form", "WITHIN-QUOTE-FORM");
        declareMacro(me, "allow_escape_quote_when_quote_predicate", "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
        declareFunction(me, "cycl_sentence_p", "CYCL-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_formulaic_sentence_p", "CYCL-FORMULAIC-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_sequence_of_test_p", "CYCL-SEQUENCE-OF-TEST-P", 2, 0, false);
        declareFunction(me, "cycl_sentence_sequence_p", "CYCL-SENTENCE-SEQUENCE-P", 1, 0, false);
        declareFunction(me, "cycl_truth_value_p", "CYCL-TRUTH-VALUE-P", 1, 0, false);
        declareFunction(me, "cycl_true_p", "CYCL-TRUE-P", 1, 0, false);
        declareFunction(me, "cycl_false_p", "CYCL-FALSE-P", 1, 0, false);
        declareFunction(me, "cycl_formula_predicate", "CYCL-FORMULA-PREDICATE", 1, 0, false);
        declareFunction(me, "cycl_unary_sentence_p", "CYCL-UNARY-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_binary_sentence_p", "CYCL-BINARY-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_ternary_sentence_p", "CYCL-TERNARY-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_quaternary_sentence_p", "CYCL-QUATERNARY-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_quintary_sentence_p", "CYCL-QUINTARY-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_variable_arity_sentence_p", "CYCL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_user_defined_logical_operator_sentence_p", "CYCL-USER-DEFINED-LOGICAL-OPERATOR-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_regularly_quantified_sentence_p", "CYCL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_bounded_existential_sentence_p", "CYCL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_multiply_quantified_sentence_p", "CYCL-MULTIPLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_logical_operator_p", "CYCL-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction(me, "cycl_quantifier_p", "CYCL-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "cycl_regular_quantifier_p", "CYCL-REGULAR-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "cycl_multi_quantifier_p", "CYCL-MULTI-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "cycl_bounded_existential_quantifier_p", "CYCL-BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
        declareFunction(me, "cycl_atomic_sentence_p", "CYCL-ATOMIC-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_argument_sequence_p", "CYCL-ARGUMENT-SEQUENCE-P", 1, 0, false);
        declareFunction(me, "cycl_predicate_p", "CYCL-PREDICATE-P", 1, 0, false);
        declareFunction(me, "cycl_function_p", "CYCL-FUNCTION-P", 1, 0, false);
        declareFunction(me, "cycl_nat_p", "CYCL-NAT-P", 1, 0, false);
        declareFunction(me, "cycl_formula_has_valid_arityP", "CYCL-FORMULA-HAS-VALID-ARITY?", 1, 0, false);
        declareFunction(me, "expand_subl_fn_syntax_p", "EXPAND-SUBL-FN-SYNTAX-P", 1, 0, false);
        declareFunction(me, "expand_subl_fn_syntax_p_int", "EXPAND-SUBL-FN-SYNTAX-P-INT", 1, 0, false);
        declareFunction(me, "subl_quote_fn_syntax_p", "SUBL-QUOTE-FN-SYNTAX-P", 1, 0, false);
        declareFunction(me, "kappa_syntax_p", "KAPPA-SYNTAX-P", 1, 0, false);
        declareFunction(me, "lambda_syntax_p", "LAMBDA-SYNTAX-P", 1, 0, false);
        declareFunction(me, "skolem_function_fn_syntax_p", "SKOLEM-FUNCTION-FN-SYNTAX-P", 1, 0, false);
        declareFunction(me, "skolem_func_n_fn_syntax_p", "SKOLEM-FUNC-N-FN-SYNTAX-P", 1, 0, false);
        declareFunction(me, "cycl_variable_sequence_p", "CYCL-VARIABLE-SEQUENCE-P", 1, 0, false);
        declareFunction(me, "cycl_term_sequence_p", "CYCL-TERM-SEQUENCE-P", 1, 0, false);
        declareFunction(me, "cycl_term_sequence_syntax_p", "CYCL-TERM-SEQUENCE-SYNTAX-P", 1, 0, false);
        declareFunction(me, "subl_expression_syntax_p", "SUBL-EXPRESSION-SYNTAX-P", 1, 0, false);
        declareFunction(me, "cycl_expression_p", "CYCL-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "cycl_term_p", "CYCL-TERM-P", 1, 0, false);
        declareFunction(me, "cycl_denotational_term_p", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction(me, "cycl_quoted_term_p", "CYCL-QUOTED-TERM-P", 1, 0, false);
        new cycl_grammar.$cycl_quoted_term_p$UnaryFunction();
        declareFunction(me, "fast_cycl_quoted_term_p", "FAST-CYCL-QUOTED-TERM-P", 1, 0, false);
        declareFunction(me, "fast_quasi_quote_term_p", "FAST-QUASI-QUOTE-TERM-P", 1, 0, false);
        declareFunction(me, "fast_quote_term_p", "FAST-QUOTE-TERM-P", 1, 0, false);
        declareFunction(me, "fast_escape_quote_term_p", "FAST-ESCAPE-QUOTE-TERM-P", 1, 0, false);
        declareFunction(me, "quiet_quote_syntax_p", "QUIET-QUOTE-SYNTAX-P", 1, 0, false);
        declareFunction(me, "quote_syntax_p", "QUOTE-SYNTAX-P", 1, 0, false);
        declareFunction(me, "quasi_quote_syntax_p", "QUASI-QUOTE-SYNTAX-P", 1, 0, false);
        new cycl_grammar.$quasi_quote_syntax_p$UnaryFunction();
        declareFunction(me, "quote_arg1_syntax_p", "QUOTE-ARG1-SYNTAX-P", 1, 0, false);
        declareFunction(me, "escape_quote_syntax_p", "ESCAPE-QUOTE-SYNTAX-P", 1, 0, false);
        new cycl_grammar.$escape_quote_syntax_p$UnaryFunction();
        declareFunction(me, "cycl_constant_or_nat_p", "CYCL-CONSTANT-OR-NAT-P", 1, 0, false);
        declareFunction(me, "cycl_represented_term_p", "CYCL-REPRESENTED-TERM-P", 1, 0, false);
        declareFunction(me, "cycl_unrepresented_term_p", "CYCL-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction(me, "subl_atomic_term_p", "SUBL-ATOMIC-TERM-P", 1, 0, false);
        declareFunction(me, "subl_strict_atomic_term_p", "SUBL-STRICT-ATOMIC-TERM-P", 1, 0, false);
        declareFunction(me, "cycl_fort_p", "CYCL-FORT-P", 1, 0, false);
        declareFunction(me, "cycl_nart_p", "CYCL-NART-P", 1, 0, false);
        declareFunction(me, "cycl_naut_p", "CYCL-NAUT-P", 1, 0, false);
        declareFunction(me, "cycl_quantified_sentence_p", "CYCL-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_formula_p", "CYCL-FORMULA-P", 1, 0, false);
        declareFunction(me, "cycl_literal_p", "CYCL-LITERAL-P", 1, 0, false);
        declareFunction(me, "cycl_tensed_literal_p", "CYCL-TENSED-LITERAL-P", 1, 0, false);
        declareFunction(me, "cycl_generalized_tensed_literal_p", "CYCL-GENERALIZED-TENSED-LITERAL-P", 1, 0, false);
        new cycl_grammar.$cycl_generalized_tensed_literal_p$UnaryFunction();
        declareFunction(me, "cycl_strict_term_p", "CYCL-STRICT-TERM-P", 1, 0, false);
        declareFunction(me, "cycl_strict_denotational_term_p", "CYCL-STRICT-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction(me, "proposed_el_formula_p", "PROPOSED-EL-FORMULA-P", 1, 0, false);
        declareFunction(me, "cycl_boolean_sentence_p", "CYCL-BOOLEAN-SENTENCE-P", 1, 0, false);
        declareFunction(me, "cycl_boolean_combination_of_type", "CYCL-BOOLEAN-COMBINATION-OF-TYPE", 2, 0, false);
        declareFunction(me, "cycl_constant_p", "CYCL-CONSTANT-P", 1, 0, false);
        declareFunction(me, "subl_string_p", "SUBL-STRING-P", 1, 0, false);
        declareFunction(me, "subl_real_number_p", "SUBL-REAL-NUMBER-P", 1, 0, false);
        declareFunction(me, "subl_float_p", "SUBL-FLOAT-P", 1, 0, false);
        declareFunction(me, "subl_integer_p", "SUBL-INTEGER-P", 1, 0, false);
        declareFunction(me, "subl_non_variable_symbol_p", "SUBL-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        declareFunction(me, "subl_non_variable_non_keyword_symbol_p", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
        declareFunction(me, "cycl_variable_p", "CYCL-VARIABLE-P", 1, 0, false);
        new cycl_grammar.$cycl_variable_p$UnaryFunction();
        declareFunction(me, "meta_variable_p", "META-VARIABLE-P", 1, 0, false);
        declareFunction(me, "el_variable_p", "EL-VARIABLE-P", 1, 0, false);
        new cycl_grammar.$el_variable_p$UnaryFunction();
        declareFunction(me, "hl_variable_p", "HL-VARIABLE-P", 1, 0, false);
        new cycl_grammar.$hl_variable_p$UnaryFunction();
        declareFunction(me, "el_var_list_operator_p", "EL-VAR-LIST-OPERATOR-P", 1, 0, false);
        declareFunction(me, "why_not_cycl_sentence", "WHY-NOT-CYCL-SENTENCE", 1, 0, false);
        declareFunction(me, "why_not_cycl_expression", "WHY-NOT-CYCL-EXPRESSION", 1, 0, false);
        declareFunction(me, "why_not_cycl_term", "WHY-NOT-CYCL-TERM", 1, 0, false);
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

    public static SubLObject setup_cycl_grammar_file() {
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
}

/**
 * Total time: 440 ms
 */
