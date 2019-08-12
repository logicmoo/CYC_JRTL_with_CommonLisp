package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_fractions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class math_expression_utilities extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new math_expression_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.math_expression_utilities";


    // deflexical
    private static final SubLSymbol $math_expression_multiplication_fns$ = makeSymbol("*MATH-EXPRESSION-MULTIPLICATION-FNS*");

    // deflexical
    private static final SubLSymbol $math_expression_division_fns$ = makeSymbol("*MATH-EXPRESSION-DIVISION-FNS*");

    // deflexical
    private static final SubLSymbol $math_expression_addition_fns$ = makeSymbol("*MATH-EXPRESSION-ADDITION-FNS*");

    // deflexical
    private static final SubLSymbol $math_expression_subtraction_fns$ = makeSymbol("*MATH-EXPRESSION-SUBTRACTION-FNS*");

    // deflexical
    private static final SubLSymbol $math_expression_infix_operators$ = makeSymbol("*MATH-EXPRESSION-INFIX-OPERATORS*");

    // deflexical
    private static final SubLSymbol $math_expression_infix_operator_precedence_rank$ = makeSymbol("*MATH-EXPRESSION-INFIX-OPERATOR-PRECEDENCE-RANK*");

    // deflexical
    private static final SubLSymbol $math_expression_unary_prefix_operators$ = makeSymbol("*MATH-EXPRESSION-UNARY-PREFIX-OPERATORS*");

    // deflexical
    private static final SubLSymbol $math_expression_unary_surround_operators$ = makeSymbol("*MATH-EXPRESSION-UNARY-SURROUND-OPERATORS*");



    // deflexical
    private static final SubLSymbol $math_expression_enclosure_fns$ = makeSymbol("*MATH-EXPRESSION-ENCLOSURE-FNS*");

    // defparameter
    private static final SubLSymbol $math_statement_fns$ = makeSymbol("*MATH-STATEMENT-FNS*");

    private static final SubLList $list0 = list(reader_make_constant_shell(makeString("InfixTimesFn")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), reader_make_constant_shell(makeString("ImplicitTimesFn")), reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn")));

    private static final SubLList $list1 = list(reader_make_constant_shell(makeString("InfixDivideFn")), reader_make_constant_shell(makeString("InfixSlashDivideFn")), reader_make_constant_shell(makeString("HorizontalDivideFn")), reader_make_constant_shell(makeString("MathLongDivisionStatementFn")));

    private static final SubLList $list2 = list(reader_make_constant_shell(makeString("InfixPlusFn")), reader_make_constant_shell(makeString("StackedAdditionExpressionFn")));

    private static final SubLList $list3 = list(reader_make_constant_shell(makeString("InfixMinusFn")), reader_make_constant_shell(makeString("StackedSubtractionExpressionFn")));

    private static final SubLList $list4 = list(new SubLObject[]{ reader_make_constant_shell(makeString("PowerExpressionFn")), reader_make_constant_shell(makeString("NthRootExpressionFn")), reader_make_constant_shell(makeString("InfixTimesFn")), reader_make_constant_shell(makeString("ImplicitTimesFn")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn")), reader_make_constant_shell(makeString("InfixDivideFn")), reader_make_constant_shell(makeString("HorizontalDivideFn")), reader_make_constant_shell(makeString("InfixSlashDivideFn")), reader_make_constant_shell(makeString("MathLongDivisionStatementFn")), reader_make_constant_shell(makeString("InfixPlusFn")), reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), reader_make_constant_shell(makeString("InfixMinusFn")), reader_make_constant_shell(makeString("StackedSubtractionExpressionFn")) });

    private static final SubLList $list5 = list(new SubLObject[]{ reader_make_constant_shell(makeString("PowerExpressionFn")), TWO_INTEGER, reader_make_constant_shell(makeString("NthRootExpressionFn")), TWO_INTEGER, reader_make_constant_shell(makeString("InfixTimesFn")), ONE_INTEGER, reader_make_constant_shell(makeString("ImplicitTimesFn")), ONE_INTEGER, reader_make_constant_shell(makeString("InfixDottedTimesFn")), ONE_INTEGER, reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn")), ONE_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), ONE_INTEGER, reader_make_constant_shell(makeString("HorizontalDivideFn")), ONE_INTEGER, reader_make_constant_shell(makeString("InfixSlashDivideFn")), ONE_INTEGER, reader_make_constant_shell(makeString("MathLongDivisionStatementFn")), ONE_INTEGER, reader_make_constant_shell(makeString("InfixPlusFn")), ZERO_INTEGER, reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), ZERO_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), ZERO_INTEGER, reader_make_constant_shell(makeString("StackedSubtractionExpressionFn")), ZERO_INTEGER });

    private static final SubLList $list6 = list(reader_make_constant_shell(makeString("PrefixMinusFn")));

    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("AbsoluteValueExpressionFn")));

    private static final SubLObject $$PowerExpressionFn = reader_make_constant_shell(makeString("PowerExpressionFn"));

    private static final SubLObject $$NthRootExpressionFn = reader_make_constant_shell(makeString("NthRootExpressionFn"));

    private static final SubLSymbol ALL_MATH_EXPRESSION_DENOTING_FUNCTIONS = makeSymbol("ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS");

    private static final SubLObject $const11$MathematicalExpressionDenotingFun = reader_make_constant_shell(makeString("MathematicalExpressionDenotingFunction"));

    private static final SubLSymbol $all_math_expression_denoting_functions_caching_state$ = makeSymbol("*ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_ALL_MATH_EXPRESSION_DENOTING_FUNCTIONS = makeSymbol("CLEAR-ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS");

    private static final SubLObject $$MathExpressionFn = reader_make_constant_shell(makeString("MathExpressionFn"));

    private static final SubLObject $$MathQuantFn = reader_make_constant_shell(makeString("MathQuantFn"));

    private static final SubLObject $$TimeExpressionFn = reader_make_constant_shell(makeString("TimeExpressionFn"));

    private static final SubLObject $$PrefixMinusFn = reader_make_constant_shell(makeString("PrefixMinusFn"));

    private static final SubLObject $$MathVarFn = reader_make_constant_shell(makeString("MathVarFn"));

    private static final SubLList $list19 = list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), reader_make_constant_shell(makeString("BracketedMathFn")));

    private static final SubLList $list20 = list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), reader_make_constant_shell(makeString("MathGreaterThanOrEqualStatementFn")), reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), reader_make_constant_shell(makeString("MathLessThanStatementFn")), reader_make_constant_shell(makeString("MathNotEqualsStatementFn")));

    private static final SubLSymbol MATH_EXPRESSION_ADDITION_OP_P = makeSymbol("MATH-EXPRESSION-ADDITION-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_SUBTRACTION_OP_P = makeSymbol("MATH-EXPRESSION-SUBTRACTION-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_MULTIPLICATION_OP_P = makeSymbol("MATH-EXPRESSION-MULTIPLICATION-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_DIVISION_OP_P = makeSymbol("MATH-EXPRESSION-DIVISION-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_EXPONENTIATION_OP_P = makeSymbol("MATH-EXPRESSION-EXPONENTIATION-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_NTH_ROOT_OP_P = makeSymbol("MATH-EXPRESSION-NTH-ROOT-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_ENCLOSURE_FN_P = makeSymbol("MATH-EXPRESSION-ENCLOSURE-FN-P");



    private static final SubLObject $$subMathExpressions_Direct = reader_make_constant_shell(makeString("subMathExpressions-Direct"));

    private static final SubLSymbol $REMOVAL_SUBMATHEXPRESSIONS_DIRECT = makeKeyword("REMOVAL-SUBMATHEXPRESSIONS-DIRECT");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBMATHEXPRESSIONS-DIRECT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subMathExpressions-Direct <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(subMathExpressions-Direct (#$MathExpressionFn (#$MathQuantFn 3) \n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 5)\n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 7)) ?WHAT)") });



    private static final SubLSymbol TEST_REMOVAL_SUBMATHEXPRESSIONS_DIRECT_EXPAND = makeSymbol("TEST-REMOVAL-SUBMATHEXPRESSIONS-DIRECT-EXPAND");







    private static final SubLList $list37 = list(makeSymbol("MATH-EXPRESSION-TEST-CASE-TABLES"));







    private static final SubLObject $list41 = _constant_41_initializer();

    private static final SubLObject $$subMathExpressions = reader_make_constant_shell(makeString("subMathExpressions"));

    private static final SubLSymbol $REMOVAL_SUBMATHEXPRESSIONS = makeKeyword("REMOVAL-SUBMATHEXPRESSIONS");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("subMathExpressions")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("subMathExpressions")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUBMATHEXPRESSIONS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$subMathExpressions <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(subMathExpressions (#$MathExpressionFn (#$MathQuantFn 3) \n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 5)\n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 7)) ?WHAT)") });

    private static final SubLSymbol MATH_EXPRESSION_P = makeSymbol("MATH-EXPRESSION-P");

    private static final SubLSymbol TEST_REMOVAL_SUBMATHEXPRESSIONS_EXPAND = makeSymbol("TEST-REMOVAL-SUBMATHEXPRESSIONS-EXPAND");

    private static final SubLObject $list47 = _constant_47_initializer();

    private static final SubLObject $$mathQuantValue = reader_make_constant_shell(makeString("mathQuantValue"));

    private static final SubLSymbol $REMOVAL_MATHQUANTVALUE = makeKeyword("REMOVAL-MATHQUANTVALUE");

    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathQuantValue")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathQuantValue")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHQUANTVALUE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathQuantValue <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (mathQuantValue (MathQuantFn FOO) ?WHAT) --> ?WHAT = FOO\n (mathQuantValue (MathQuantFn FOO) FOO) --> True") });

    private static final SubLList $list51 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("MathExpressionFn")), reader_make_constant_shell(makeString("ParenthesizedMathFn")), reader_make_constant_shell(makeString("BracketedMathFn"))), makeKeyword("ANYTHING"));

    private static final SubLList $list52 = list(reader_make_constant_shell(makeString("PrefixMinusFn")), makeKeyword("ANYTHING"));

    private static final SubLObject $$MinusFn = reader_make_constant_shell(makeString("MinusFn"));

    private static final SubLSymbol TEST_REMOVAL_MATHQUANTVALUE_EXPAND = makeSymbol("TEST-REMOVAL-MATHQUANTVALUE-EXPAND");

    private static final SubLList $list55 = list(list(list(list(reader_make_constant_shell(makeString("mathQuantValue")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathQuantValue")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathQuantValue")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathQuantValue")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeInteger(-5)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathQuantValue")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, EIGHT_INTEGER))), list(reader_make_constant_shell(makeString("MinusFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, EIGHT_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$additionArglist = reader_make_constant_shell(makeString("additionArglist"));

    private static final SubLSymbol $REMOVAL_ADDITIONARGLIST = makeKeyword("REMOVAL-ADDITIONARGLIST");

    private static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("additionArglist")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("additionArglist")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ADDITIONARGLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$additionArglist <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (additionArglist (InfixPlusFn . ARGS) [fully-bound]) \n (additionArglist (InfixPlusFn . ARGS) ?WHAT) ---> ?WHAT = list of values of the symbols in ARGS \n For example, \n (additionArglist (InfixPlusFn (MathQuantFn 3) (MathQuantFn 5)) ?WHAT) ---> ?WHAT = (TheList 3 5)\n (additionArglist (InfixPlusFn (MathQuantFn 3) (MathVarFn \"X\")) ?WHAT) ---> ?WHAT = no binding\n\n (additionArglist (MathExpressionFn OP1 InfixPlusFn .... InfixPlusFn OPN) [fully-bound]) \n (additionArglist (MathExpressionFn OP1 InfixPlusFn .... InfixPlusFn OPN) ?WHAT) ---> ?WHAT = list of values of all of the OPs\n All operators must be InfixPlusFn.  For example, \n (additionArglist \n  (MathExpressionFn (MathQuantFn 3) \n    InfixPlusFn (MathQuantFn 5)\n    InfixPlusFn (MathQuantFn 7))\n  (TheList 3 5 7))\n (additionArglist \n  (MathExpressionFn (MathQuantFn 3) \n    InfixPlusFn (MathQuantFn 5)\n    InfixTimesFn (MathQuantFn 7)) ?WHAT) ----> ?WHAT = no binding") });

    private static final SubLObject $$InfixPlusFn = reader_make_constant_shell(makeString("InfixPlusFn"));

    private static final SubLSymbol MATH_EXPRESSION_QUANT_FN_P = makeSymbol("MATH-EXPRESSION-QUANT-FN-P");

    private static final SubLSymbol MATH_EXPRESSION_QUANT_VALUE = makeSymbol("MATH-EXPRESSION-QUANT-VALUE");

    private static final SubLSymbol TEST_REMOVAL_ADDITIONARGLIST_EXPAND = makeSymbol("TEST-REMOVAL-ADDITIONARGLIST-EXPAND");

    private static final SubLList $list63 = list(list(list(list(reader_make_constant_shell(makeString("additionArglist")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("additionArglist")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("additionArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("additionArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("additionArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL));

    private static final SubLObject $$genericAdditionArglist = reader_make_constant_shell(makeString("genericAdditionArglist"));

    private static final SubLSymbol $REMOVAL_GENERICADDITIONARGLIST = makeKeyword("REMOVAL-GENERICADDITIONARGLIST");

    private static final SubLList $list66 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genericAdditionArglist")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genericAdditionArglist")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENERICADDITIONARGLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genericAdditionArglist <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(genericAdditionArglist (ParenthesizedMathFn (InfixPlusFn . ARGS)) [fully-bound])") });

    private static final SubLSymbol TEST_REMOVAL_GENERICADDITIONARGLIST_EXPAND = makeSymbol("TEST-REMOVAL-GENERICADDITIONARGLIST-EXPAND");

    private static final SubLList $list68 = list(list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericAdditionArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL));

    private static final SubLObject $$multiplicationArglist = reader_make_constant_shell(makeString("multiplicationArglist"));

    private static final SubLSymbol $REMOVAL_MULTIPLICATIONARGLIST = makeKeyword("REMOVAL-MULTIPLICATIONARGLIST");

    private static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("multiplicationArglist")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("multiplicationArglist")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MULTIPLICATIONARGLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$multiplicationArglist <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (multiplicationArglist (InfixTimesFn . ARGS) [fully-bound]) \n (multiplicationArglist (InfixTimesFn . ARGS) ?WHAT) ---> ?WHAT = list of values of the symbols in ARGS \n For example, \n (multiplicationArglist (InfixTimesFn (MathQuantFn 3) (MathQuantFn 5)) ?WHAT) ---> ?WHAT = (TheList 3 5)\n (multiplicationArglist (InfixTimesFn (MathQuantFn 3) (MathVarFn \"X\")) ?WHAT) ---> ?WHAT = no binding\n\n (multiplicationArglist (MathExpressionFn OP1 InfixTimesFn .... InfixTimesFn OPN) [fully-bound]) \n (multiplicationArglist (MathExpressionFn OP1 InfixTimesFn .... InfixTimesFn OPN) ?WHAT) ---> ?WHAT = list of values of all of the OPs\n All operators must be InfixTimesFn.  For example, \n (multiplicationArglist \n  (MathExpressionFn (MathQuantFn 3) \n    InfixTimesFn (MathQuantFn 5)\n    InfixTimesFn (MathQuantFn 7))\n  (TheList 3 5 7))\n (multiplicationArglist \n  (MathExpressionFn (MathQuantFn 3) \n    InfixTimesFn (MathQuantFn 5)\n    InfixTimesFn (MathQuantFn 7)) ?WHAT) ----> ?WHAT = no binding") });

    private static final SubLObject $$InfixTimesFn = reader_make_constant_shell(makeString("InfixTimesFn"));

    private static final SubLSymbol TEST_REMOVAL_MULTIPLICATIONARGLIST_EXPAND = makeSymbol("TEST-REMOVAL-MULTIPLICATIONARGLIST-EXPAND");

    private static final SubLList $list74 = list(list(list(list(reader_make_constant_shell(makeString("multiplicationArglist")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("multiplicationArglist")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("multiplicationArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("multiplicationArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("multiplicationArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL));

    private static final SubLObject $$genericMultiplicationArglist = reader_make_constant_shell(makeString("genericMultiplicationArglist"));

    private static final SubLSymbol $REMOVAL_GENERICMULTIPLICATIONARGLIST = makeKeyword("REMOVAL-GENERICMULTIPLICATIONARGLIST");

    private static final SubLList $list77 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genericMultiplicationArglist")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENERICMULTIPLICATIONARGLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genericMultiplicationArglist <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(genericMultiplicationArglist (ParenthesizedMathFn (InfixTimesFn . ARGS)) [fully-bound])") });

    private static final SubLSymbol TEST_REMOVAL_GENERICMULTIPLICATIONARGLIST_EXPAND = makeSymbol("TEST-REMOVAL-GENERICMULTIPLICATIONARGLIST-EXPAND");

    private static final SubLList $list79 = list(list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericMultiplicationArglist")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL));

    private static final SubLObject $$expressionNegated = reader_make_constant_shell(makeString("expressionNegated"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONNEGATED = makeKeyword("REMOVAL-EXPRESSIONNEGATED");

    private static final SubLList $list82 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionNegated")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionNegated")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONNEGATED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionNegated <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionNegated (PrefixMinusFn FOO) ?WHAT) --> ?WHAT = FOO\n (expressionNegated (PrefixMinusFn FOO) FOO) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONNEGATED_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONNEGATED-EXPAND");

    private static final SubLList $list84 = list(list(list(list(reader_make_constant_shell(makeString("expressionNegated")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionNegated")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionMinuend = reader_make_constant_shell(makeString("expressionMinuend"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONMINUEND = makeKeyword("REMOVAL-EXPRESSIONMINUEND");

    private static final SubLList $list87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionMinuend")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionMinuend")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-MINUEND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONMINUEND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionMinuend <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionMinuend (InfixMinusFn FOO [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionMinuend (InfixMinusFn FOO [anything]) FOO) --> True\n (expressionMinuend (MathExpressionFn FOO InfixMinusFn [anything]) ?WHAT)  --> ?WHAT = FOO\n (expressionMinuend (MathExpressionFn FOO InfixMinusFn [anything]) FOO)  --> True") });

    private static final SubLObject $$InfixMinusFn = reader_make_constant_shell(makeString("InfixMinusFn"));

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONMINUEND_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONMINUEND-EXPAND");

    private static final SubLList $list90 = list(list(list(list(reader_make_constant_shell(makeString("expressionMinuend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionMinuend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionMinuend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionMinuend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionMinuend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixPlusFn")), SIX_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$genericExpressionMinuend = reader_make_constant_shell(makeString("genericExpressionMinuend"));

    private static final SubLSymbol $REMOVAL_GENERICEXPRESSIONMINUEND = makeKeyword("REMOVAL-GENERICEXPRESSIONMINUEND");

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genericExpressionMinuend")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genericExpressionMinuend")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENERICEXPRESSIONMINUEND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genericExpressionMinuend <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(genericExpressionMinuend (ParenthesizedMathFn (InfixMinusFn FOO [anything])) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_GENERICEXPRESSIONMINUEND_EXPAND = makeSymbol("TEST-REMOVAL-GENERICEXPRESSIONMINUEND-EXPAND");

    private static final SubLList $list95 = list(list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionMinuend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixPlusFn")), SIX_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionSubtrahend = reader_make_constant_shell(makeString("expressionSubtrahend"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONSUBTRAHEND = makeKeyword("REMOVAL-EXPRESSIONSUBTRAHEND");

    private static final SubLList $list98 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionSubtrahend")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionSubtrahend")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-SUBTRAHEND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONSUBTRAHEND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionSubtrahend <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionSubtrahend (InfixMinusFn [anything] FOO) ?WHAT) --> ?WHAT = FOO\n (expressionSubtrahend (InfixMinusFn [anything] FOO) FOO) --> True\n (expressionSubtrahend (MathExpressionFn  [anything] InfixMinusFn FOO) ?WHAT)  --> ?WHAT = FOO\n (expressionSubtrahend (MathExpressionFn  [anything] InfixMinusFn FOO) FOO) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONSUBTRAHEND_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONSUBTRAHEND-EXPAND");

    private static final SubLList $list100 = list(list(list(list(reader_make_constant_shell(makeString("expressionSubtrahend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionSubtrahend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionSubtrahend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionSubtrahend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionSubtrahend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixPlusFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), SIX_INTEGER), SIX_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$genericExpressionSubtrahend = reader_make_constant_shell(makeString("genericExpressionSubtrahend"));

    private static final SubLSymbol $REMOVAL_GENERICEXPRESSIONSUBTRAHEND = makeKeyword("REMOVAL-GENERICEXPRESSIONSUBTRAHEND");

    private static final SubLList $list103 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genericExpressionSubtrahend")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENERICEXPRESSIONSUBTRAHEND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genericExpressionSubtrahend <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(genericExpressionSubtrahend (ParenthesizedMathFn (InfixMinusFn [anything] FOO)) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_GENERICEXPRESSIONSUBTRAHEND_EXPAND = makeSymbol("TEST-REMOVAL-GENERICEXPRESSIONSUBTRAHEND-EXPAND");

    private static final SubLList $list105 = list(list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("InfixMinusFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionSubtrahend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixPlusFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), SIX_INTEGER), SIX_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionDivisor = reader_make_constant_shell(makeString("expressionDivisor"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONDIVISOR = makeKeyword("REMOVAL-EXPRESSIONDIVISOR");

    private static final SubLList $list108 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionDivisor")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionDivisor")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-DIVISOR")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONDIVISOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionDivisor <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionDivisor (InfixDivideFn [anything] FOO) ?WHAT) --> ?WHAT = FOO\n (expressionDivisor (InfixSlashDivideFn [anything] FOO) ?WHAT) --> ?WHAT = FOO\n (expressionDivisor (HorizontalDivideFn [anything] FOO) ?WHAT) --> ?WHAT = FOO\n (expressionDivisor (InfixDivideFn [anything] FOO) FOO) --> True\n (expressionDivisor (InfixSlashDivideFn [anything] FOO) FOO) --> True\n (expressionDivisor (HorizontalDivideFn [anything] FOO) FOO) --> True\n (expressionDivisor (MathExpressionFn  [anything] InfixDivideFn FOO) ?WHAT) --> ?WHAT = FOO\n (expressionDivisor (MathExpressionFn  [anything] InfixSlashDivideFn FOO) ?WHAT) --> ?WHAT = FOO\n (expressionDivisor (MathExpressionFn  [anything] InfixDivideFn FOO) FOO) --> True\n (expressionDivisor (MathExpressionFn  [anything] InfixSlashDivideFn FOO) FOO) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONDIVISOR_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONDIVISOR-EXPAND");

    private static final SubLList $list110 = list(list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDivisor")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), SIX_INTEGER), SIX_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$genericExpressionDivisor = reader_make_constant_shell(makeString("genericExpressionDivisor"));

    private static final SubLSymbol $REMOVAL_GENERICEXPRESSIONDIVISOR = makeKeyword("REMOVAL-GENERICEXPRESSIONDIVISOR");

    private static final SubLList $list113 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genericExpressionDivisor")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genericExpressionDivisor")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENERICEXPRESSIONDIVISOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genericExpressionDivisor <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(genericExpressionDivisor (ParenthesizedMathFn (InfixDivideFn [anything] FOO)) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_GENERICEXPRESSIONDIVISOR_EXPAND = makeSymbol("TEST-REMOVAL-GENERICEXPRESSIONDIVISOR-EXPAND");

    private static final SubLList $list115 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDivisor")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), SIX_INTEGER), SIX_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T) });

    private static final SubLObject $$expressionDividend = reader_make_constant_shell(makeString("expressionDividend"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONDIVIDEND = makeKeyword("REMOVAL-EXPRESSIONDIVIDEND");

    private static final SubLList $list118 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionDividend")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionDividend")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-DIVIDEND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONDIVIDEND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionDividend <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionDividend (InfixDivideFn FOO  [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionDividend (InfixSlashDivideFn FOO [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionDividend (HorizontalDivideFn FOO [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionDividend (InfixDivideFn FOO) FOO [anything]) --> True\n (expressionDividend (InfixSlashDivideFn FOO [anything]) FOO) --> True\n (expressionDividend (HorizontalDivideFn FOO [anything]) FOO) --> True\n (expressionDividend (MathExpressionFn FOO InfixDivideFn [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionDividend (MathExpressionFn FOO InfixSlashDivideFn [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionDividend (MathExpressionFn FOO InfixDivideFn [anything]) FOO) --> True\n (expressionDividend (MathExpressionFn FOO InfixSlashDivideFn [anything]) FOO) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONDIVIDEND_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONDIVIDEND-EXPAND");

    private static final SubLList $list120 = list(list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionDividend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), SIX_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$genericExpressionDividend = reader_make_constant_shell(makeString("genericExpressionDividend"));

    private static final SubLSymbol $REMOVAL_GENERICEXPRESSIONDIVIDEND = makeKeyword("REMOVAL-GENERICEXPRESSIONDIVIDEND");

    private static final SubLList $list123 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genericExpressionDividend")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genericExpressionDividend")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENERICEXPRESSIONDIVIDEND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genericExpressionDividend <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(genericExpressionDividend (ParenthesizedMathFn (InfixDivideFn FOO  [anything])) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_GENERICEXPRESSIONDIVIDEND_EXPAND = makeSymbol("TEST-REMOVAL-GENERICEXPRESSIONDIVIDEND-EXPAND");

    private static final SubLList $list125 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("InfixDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("genericExpressionDividend")), list(reader_make_constant_shell(makeString("MathExpressionFn")), FOUR_INTEGER, reader_make_constant_shell(makeString("InfixDivideFn")), FIVE_INTEGER, reader_make_constant_shell(makeString("InfixMinusFn")), SIX_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T) });

    private static final SubLObject $$expressionExponent = reader_make_constant_shell(makeString("expressionExponent"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONEXPONENT = makeKeyword("REMOVAL-EXPRESSIONEXPONENT");

    private static final SubLList $list128 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionExponent")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionExponent")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONEXPONENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionExponent <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionExponent (PowerExpressionFn [anything] FOO) ?WHAT) --> ?WHAT = FOO\n (expressionExponent (PowerExpressionFn [anything] FOO) FOO) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONEXPONENT_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONEXPONENT-EXPAND");

    private static final SubLList $list130 = list(list(list(list(reader_make_constant_shell(makeString("expressionExponent")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionExponent")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionBase = reader_make_constant_shell(makeString("expressionBase"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONBASE = makeKeyword("REMOVAL-EXPRESSIONBASE");

    private static final SubLList $list133 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionBase")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionBase")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONBASE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionBase <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(expressionBase (PowerExpressionFn FOO [anything]) ?WHAT) --> ?WHAT = FOO\n (expressionBase (PowerExpressionFn FOO [anything]) FOO) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONBASE_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONBASE-EXPAND");

    private static final SubLList $list135 = list(list(list(list(reader_make_constant_shell(makeString("expressionBase")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionBase")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionRadicand = reader_make_constant_shell(makeString("expressionRadicand"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONRADICAND = makeKeyword("REMOVAL-EXPRESSIONRADICAND");

    private static final SubLList $list138 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionRadicand")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionRadicand")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONRADICAND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionRadicand <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionRadicand (NthRootExpressionFn INDEX RADICAND) ?WHAT) --> ?WHAT = RADICAND\n (expressionRadicand (NthRootExpressionFn INDEX RADICAND) RADICAND) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONRADICAND_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONRADICAND-EXPAND");

    private static final SubLList $list140 = list(list(list(list(reader_make_constant_shell(makeString("expressionRadicand")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionRadicand")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), FIVE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionIndex = reader_make_constant_shell(makeString("expressionIndex"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONINDEX = makeKeyword("REMOVAL-EXPRESSIONINDEX");

    private static final SubLList $list143 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionIndex")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionIndex")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONINDEX-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionIndex <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionIndex (NthRootExpressionFn INDEX RADICAND) ?WHAT) --> ?WHAT = INDEX\n (expressionIndex (NthRootExpressionFn INDEX RADICAND) INDEX) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONINDEX_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONINDEX-EXPAND");

    private static final SubLList $list145 = list(list(list(list(reader_make_constant_shell(makeString("expressionIndex")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIndex")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), FOUR_INTEGER, FIVE_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$absoluteValueOfExpression = reader_make_constant_shell(makeString("absoluteValueOfExpression"));

    private static final SubLSymbol $REMOVAL_ABSOLUTEVALUEOFEXPRESSION = makeKeyword("REMOVAL-ABSOLUTEVALUEOFEXPRESSION");

    private static final SubLList $list148 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("absoluteValueOfExpression")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("absoluteValueOfExpression")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("AbsoluteValueExpressionFn")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABSOLUTEVALUEOFEXPRESSION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$absoluteValueOfExpression <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (absoluteValueOfExpression (AbsoluteValueExpressionFn OP) ?WHAT) --> ?WHAT = OP\n (absoluteValueOfExpression (AbsoluteValueExpressionFn OP) OP) --> True") });

    private static final SubLObject $$AbsoluteValueExpressionFn = reader_make_constant_shell(makeString("AbsoluteValueExpressionFn"));

    private static final SubLSymbol TEST_REMOVAL_ABSOLUTEVALUEOFEXPRESSION_EXPAND = makeSymbol("TEST-REMOVAL-ABSOLUTEVALUEOFEXPRESSION-EXPAND");

    private static final SubLList $list151 = list(list(list(list(reader_make_constant_shell(makeString("absoluteValueOfExpression")), list(reader_make_constant_shell(makeString("AbsoluteValueExpressionFn")), FOUR_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("absoluteValueOfExpression")), list(reader_make_constant_shell(makeString("AbsoluteValueExpressionFn")), FOUR_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionEnclosed = reader_make_constant_shell(makeString("expressionEnclosed"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONENCLOSED = makeKeyword("REMOVAL-EXPRESSIONENCLOSED");

    private static final SubLList $list154 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionEnclosed")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionEnclosed")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-ENCLOSED-EXPRESSION")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONENCLOSED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionEnclosed <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionEnclosed (ParenthesizedMathFn OP) ?WHAT) --> ?WHAT = OP\n (expressionEnclosed (BracketedMathFn OP) ?WHAT) --> ?WHAT = OP\n (expressionEnclosed (ParenthesizedMathFn OP) OP) --> True\n (expressionEnclosed (BracketedMathFn OP) OP) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONENCLOSED_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONENCLOSED-EXPAND");

    private static final SubLList $list156 = list(list(list(list(reader_make_constant_shell(makeString("expressionEnclosed")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), FOUR_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionEnclosed")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), FOUR_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionEnclosed")), list(reader_make_constant_shell(makeString("BracketedMathFn")), FOUR_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionEnclosed")), list(reader_make_constant_shell(makeString("BracketedMathFn")), FOUR_INTEGER), FOUR_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$expressionAddends = reader_make_constant_shell(makeString("expressionAddends"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONADDENDS = makeKeyword("REMOVAL-EXPRESSIONADDENDS");

    private static final SubLList $list159 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionAddends")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionAddends")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-ADDENDS")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONADDENDS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionAddends <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(expressionAddends (InfixPlusFn A ... N) ?what) --> (((?what . A)) ... ((?what . N)))\n (expressionAddends (InfixPlusFn A ... N) A) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONADDENDS_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONADDENDS-EXPAND");

    private static final SubLList $list161 = list(list(list(list(reader_make_constant_shell(makeString("expressionAddends")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddends")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddends")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddends")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddends")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL));

    private static final SubLObject $$expressionFactors = reader_make_constant_shell(makeString("expressionFactors"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONFACTORS = makeKeyword("REMOVAL-EXPRESSIONFACTORS");

    private static final SubLList $list164 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell(makeString("expressionFactors")), reader_make_constant_shell(makeString("subMathExpressions-Direct"))), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("expressionFactors")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list($TEST, makeSymbol("MATH-EXPRESSION-FACTORS")), makeKeyword("ANYTHING")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONFACTORS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionFactors <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionFactors (InfixTimesFn A ... N) ?what) --> (((?what . A)) ... ((?what . N)))\n (expressionFactors (InfixTimesFn A ... N) A) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONFACTORS_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONFACTORS-EXPAND");

    private static final SubLList $list166 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), makeSymbol("?X"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactors")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), T) });

    private static final SubLObject $$expressionAddendList = reader_make_constant_shell(makeString("expressionAddendList"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONADDENDLIST = makeKeyword("REMOVAL-EXPRESSIONADDENDLIST");

    private static final SubLList $list169 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expressionAddendList")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expressionAddendList")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONADDENDLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionAddendList <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionAddendList (InfixPlusFn A ... N) ?what) --> (((?what . (TheList A ... N))))\n (expressionAddendList (InfixPlusFn A ... N) (TheList A ... N)) --> True") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONADDENDLIST_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONADDENDLIST-EXPAND");

    private static final SubLList $list171 = list(list(list(list(reader_make_constant_shell(makeString("expressionAddendList")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddendList")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddendList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddendList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionAddendList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL));

    private static final SubLObject $$expressionFactorList = reader_make_constant_shell(makeString("expressionFactorList"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONFACTORLIST = makeKeyword("REMOVAL-EXPRESSIONFACTORLIST");

    private static final SubLList $list174 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expressionFactorList")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expressionFactorList")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONFACTORLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionFactorList <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString(" (expressionFactorList (InfixTimesFn . ARGS) [fully-bound]) \n (expressionFactorList (InfixTimesFn . ARGS) ?WHAT) ---> ?WHAT = list of values of the symbols in ARGS \n For example, \n (expressionFactorList (InfixTimesFn (MathQuantFn 3) (MathQuantFn 5)) ?WHAT) ---> ?WHAT = (TheList 3 5)\n (expressionFactorList (InfixTimesFn (MathQuantFn 3) (MathVarFn \"X\")) ?WHAT) ---> ?WHAT = no binding\n\n (expressionFactorList (MathExpressionFn OP1 InfixTimesFn .... InfixTimesFn OPN) [fully-bound]) \n (expressionFactorList (MathExpressionFn OP1 InfixTimesFn .... InfixTimesFn OPN) ?WHAT) ---> ?WHAT = list of values of all of the OPs\n All operators must be InfixTimesFn.  For example, \n (expressionFactorList \n  (MathExpressionFn (MathQuantFn 3) \n    InfixTimesFn (MathQuantFn 5)\n    InfixTimesFn (MathQuantFn 7))\n  (TheList 3 5 7))\n (expressionFactorList \n  (MathExpressionFn (MathQuantFn 3) \n    InfixTimesFn (MathQuantFn 5)\n    InfixTimesFn (MathQuantFn 7)) ?WHAT) ----> ?WHAT = no binding") });

    private static final SubLSymbol MATH_EXPRESSION_UNENCLOSE = makeSymbol("MATH-EXPRESSION-UNENCLOSE");

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONFACTORLIST_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONFACTORLIST-EXPAND");

    private static final SubLList $list177 = list(list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), makeSymbol("?X"))), T), list(list(list(reader_make_constant_shell(makeString("expressionFactorList")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), MINUS_ONE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)))), T));

    private static final SubLObject $$expressionIsEvaluatable = reader_make_constant_shell(makeString("expressionIsEvaluatable"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONISEVALUATABLE = makeKeyword("REMOVAL-EXPRESSIONISEVALUATABLE");

    private static final SubLList $list180 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expressionIsEvaluatable")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONISEVALUATABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionIsEvaluatable <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString(" These are all not evaluatable:\n ;; contains a variable: \n (MathExpressionFn (MathVarFn \"x\") InfixPlusFn (MathQuantFn 2)) \n (InfixPlusFn (MathVarFn \"x\") (MathQuantFn 2))\n ;; incommensurate units: \n (MathExpressionFn (MathQuantFn (Inch 2)) InfixPlusFn (MathQuantFn (Mile 2)))\n (InfixPlusFn (MathQuantFn (Inch 2)) (MathQuantFn (Mile 2)))\n ;; operand is an expression with an operator and operands of its own:\n (MathExpressionFn (MathQuantFn (Inch 2)) InfixPlusFn (ParenthesizedMathFn (InfixTimesFn (MathQuantFn 2) (MathQuantFn (Inch 2)))))\n (InfixPlusFn (MathQuantFn (Inch 2)) (ParenthesizedMathFn (InfixTimesFn (MathQuantFn 2) (MathQuantFn (Inch 2)))))\n\n These are evaluatable: \n (MathExpressionFn (MathQuantFn 5.5) InfixPlusFn (MathQuantFn 2)) \n (InfixPlusFn (MathQuantFn 5.5) (MathQuantFn 2))") });

    private static final SubLSymbol $EXPRESSION_IS_A_MATH_QUANTITY = makeKeyword("EXPRESSION-IS-A-MATH-QUANTITY");

    private static final SubLSymbol $EXPRESSION_IS_A_NEGATED_UNEVALUATABLE_EXPRESSION = makeKeyword("EXPRESSION-IS-A-NEGATED-UNEVALUATABLE-EXPRESSION");

    private static final SubLSymbol MATH_EXPRESSION_VAR_P = makeSymbol("MATH-EXPRESSION-VAR-P");

    private static final SubLSymbol $SOME_OPERAND_IS_A_VARIABLE = makeKeyword("SOME-OPERAND-IS-A-VARIABLE");

    private static final SubLSymbol MATH_EXPRESSION_WITH_SOME_OPERATOR_P = makeSymbol("MATH-EXPRESSION-WITH-SOME-OPERATOR-P");

    private static final SubLSymbol MATH_EXPRESSION_QUANT_FN_OR_MINUS_QUANT_FN_P = makeSymbol("MATH-EXPRESSION-QUANT-FN-OR-MINUS-QUANT-FN-P");

    private static final SubLSymbol $SOME_OPERAND_IS_A_MATH_EXPRESSION = makeKeyword("SOME-OPERAND-IS-A-MATH-EXPRESSION");

    private static final SubLObject $$Unity = reader_make_constant_shell(makeString("Unity"));

    private static final SubLString $str189$_units_do_not_match__ = makeString(" units do not match: ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$Minuend_ = makeString("Minuend ");

    private static final SubLString $str192$_is_not_a_NUMBERP_ = makeString(" is not a NUMBERP.");

    private static final SubLString $$$Subtrahend_ = makeString("Subtrahend ");

    private static final SubLObject $$InfixSlashDivideFn = reader_make_constant_shell(makeString("InfixSlashDivideFn"));

    private static final SubLObject $$InfixDivideFn = reader_make_constant_shell(makeString("InfixDivideFn"));

    private static final SubLObject $$HorizontalDivideFn = reader_make_constant_shell(makeString("HorizontalDivideFn"));

    private static final SubLObject $$SimpleFractionFn = reader_make_constant_shell(makeString("SimpleFractionFn"));

    private static final SubLObject $$MixedFractionFn = reader_make_constant_shell(makeString("MixedFractionFn"));



    private static final SubLString $str200$__ = makeString(", ");

    private static final SubLString $str201$_has_mismatched_units__ = makeString(" has mismatched units: ");

    private static final SubLSymbol EXTENDED_NUMBER_P = makeSymbol("EXTENDED-NUMBER-P");



    private static final SubLObject $$ImplicitTimesFn = reader_make_constant_shell(makeString("ImplicitTimesFn"));

    private static final SubLObject $$InfixDottedTimesFn = reader_make_constant_shell(makeString("InfixDottedTimesFn"));



    private static final SubLSymbol $sym207$_ = makeSymbol("*");

    private static final SubLObject $$UnitProductFn = reader_make_constant_shell(makeString("UnitProductFn"));

    private static final SubLObject $$ParenthesizedMathFn = reader_make_constant_shell(makeString("ParenthesizedMathFn"));

    private static final SubLObject $$BracketedMathFn = reader_make_constant_shell(makeString("BracketedMathFn"));

    private static final SubLString $$$_exponent_has_units = makeString(" exponent has units");

    private static final SubLString $str212$_base_has_units_but_exponent_not_ = makeString(" base has units but exponent not an integer");

    private static final SubLString $$$_radicand_has_units = makeString(" radicand has units");

    private static final SubLString $$$_radicand_is_zero = makeString(" radicand is zero");

    private static final SubLString $str215$_index_has_units_but_nth_root_of_ = makeString(" index has units but nth root of units not yet supported");

    private static final SubLString $str216$_index_has_units_but_radicand_not = makeString(" index has units but radicand not an integer");

    private static final SubLString $str217$_could_not_find_any_operators_in_ = makeString(" could not find any operators in #$MathExpressionFn");

    private static final SubLString $str218$_invalid_due_to_operation_as_firs = makeString(" invalid due to operation as first or last item");

    private static final SubLString $str219$_S_was_not_solvable_by_sub_evalua = makeString("~S was not solvable by sub-evaluation");

    private static final SubLString $$$_was_not_a_math_expression = makeString(" was not a math expression");

    private static final SubLString $$$Unknown_reason = makeString("Unknown reason");

    private static final SubLSymbol MATH_EXPRESSION_EVALUATE = makeSymbol("MATH-EXPRESSION-EVALUATE");

    private static final SubLSymbol TERM_UNIFY = makeSymbol("TERM-UNIFY");

    private static final SubLList $list224 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER))), list(list(list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), SEVEN_INTEGER))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220)))))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), SEVEN_INTEGER))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(227)))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(227)))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220)))), list(list(list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(30)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(60))), list(list(list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(30)), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(60)))), list(list(list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(30))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(60)))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(3.5)))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)) });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONISEVALUATABLE_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONISEVALUATABLE-EXPAND");

    private static final SubLList $list226 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), TWO_INTEGER)))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), TWO_INTEGER)))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)), makeSymbol("INFIXPLUSFN"), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)))))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)))))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(5.5)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(5.5)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionIsEvaluatable")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), reader_make_constant_shell(makeString("BaseKB"))), NIL) });

    private static final SubLObject $$mathExpressionOperatorList = reader_make_constant_shell(makeString("mathExpressionOperatorList"));

    private static final SubLSymbol $REMOVAL_MATHEXPRESSIONOPERATORLIST = makeKeyword("REMOVAL-MATHEXPRESSIONOPERATORLIST");

    private static final SubLList $list229 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathExpressionOperatorList")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathExpressionOperatorList")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHEXPRESSIONOPERATORLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathExpressionOperatorList <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathExpressionOperatorList (#$MathExpressionFn (#$MathQuantFn 3) \n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 5)\n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 7)) ?WHAT)") });

    private static final SubLObject $$TheEmptyList = reader_make_constant_shell(makeString("TheEmptyList"));

    private static final SubLSymbol TEST_REMOVAL_MATHEXPRESSIONOPERATORLIST_EXPAND = makeSymbol("TEST-REMOVAL-MATHEXPRESSIONOPERATORLIST-EXPAND");

    private static final SubLList $list232 = list(list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("InfixPlusFn")), reader_make_constant_shell(makeString("InfixMinusFn")))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("TheEmptyList"))), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$mathExpressionOperatorCount = reader_make_constant_shell(makeString("mathExpressionOperatorCount"));

    private static final SubLSymbol $REMOVAL_MATHEXPRESSIONOPERATORCOUNT = makeKeyword("REMOVAL-MATHEXPRESSIONOPERATORCOUNT");

    private static final SubLList $list235 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathExpressionOperatorCount")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHEXPRESSIONOPERATORCOUNT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathExpressionOperatorCount <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathExpressionOperatorCount (#$MathExpressionFn (#$MathQuantFn 3) \n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 5)\n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 7)) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_MATHEXPRESSIONOPERATORCOUNT_EXPAND = makeSymbol("TEST-REMOVAL-MATHEXPRESSIONOPERATORCOUNT-EXPAND");

    private static final SubLList $list237 = list(list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), TWO_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), ZERO_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(47)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), ONE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperatorCount")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), ONE_INTEGER), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLSymbol MATH_EXPRESSION_INFIX_OP_P = makeSymbol("MATH-EXPRESSION-INFIX-OP-P");

    private static final SubLSymbol MATH_EXPRESSION_ELEMS_AND_OPS_FOR_ADDITIONS_AND_SUBTRACTIONS = makeSymbol("MATH-EXPRESSION-ELEMS-AND-OPS-FOR-ADDITIONS-AND-SUBTRACTIONS");

    private static final SubLList $list240 = list(list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)))), list(list(list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixSlashDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER) })), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixSlashDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))));

    private static final SubLObject $$mathExpressionOperator = reader_make_constant_shell(makeString("mathExpressionOperator"));

    private static final SubLSymbol $REMOVAL_MATHEXPRESSIONOPERATOR = makeKeyword("REMOVAL-MATHEXPRESSIONOPERATOR");

    private static final SubLList $list243 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathExpressionOperator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathExpressionOperator")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHEXPRESSIONOPERATOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathExpressionOperator <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathExpressionOperator (#$MathExpressionFn (#$MathQuantFn 3) \n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 5)\n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 7)) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_MATHEXPRESSIONOPERATOR_EXPAND = makeSymbol("TEST-REMOVAL-MATHEXPRESSIONOPERATOR-EXPAND");

    private static final SubLList $list245 = list(list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("AbsoluteValueExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), reader_make_constant_shell(makeString("AbsoluteValueExpressionFn"))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperator")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), reader_make_constant_shell(makeString("ParenthesizedMathFn"))), reader_make_constant_shell(makeString("BaseKB"))), T));

    private static final SubLObject $$leftSideOfMathematicalStatement = reader_make_constant_shell(makeString("leftSideOfMathematicalStatement"));

    private static final SubLSymbol $REMOVAL_LEFTSIDEOFMATHEMATICALSTATEMENT = makeKeyword("REMOVAL-LEFTSIDEOFMATHEMATICALSTATEMENT");

    private static final SubLList $list248 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("leftSideOfMathematicalStatement")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("leftSideOfMathematicalStatement")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LEFTSIDEOFMATHEMATICALSTATEMENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$leftSideOfMathematicalStatement <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(leftSideOfMathematicalStatement (#$MathEqualsStatementFn (#$MathVarFn \"x\") (#$MathQuantFn 2)) (#$MathVarFn \"x\")") });

    private static final SubLSymbol TEST_REMOVAL_LEFTSIDEOFMATHEMATICALSTATEMENT_EXPAND = makeSymbol("TEST-REMOVAL-LEFTSIDEOFMATHEMATICALSTATEMENT-EXPAND");

    private static final SubLList $list250 = list(list(list(list(reader_make_constant_shell(makeString("leftSideOfMathematicalStatement")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), T), list(list(list(reader_make_constant_shell(makeString("leftSideOfMathematicalStatement")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), makeSymbol("?WHAT"))), T));

    private static final SubLObject $$rightSideOfMathematicalStatement = reader_make_constant_shell(makeString("rightSideOfMathematicalStatement"));

    private static final SubLSymbol $REMOVAL_RIGHTSIDEOFMATHEMATICALSTATEMENT = makeKeyword("REMOVAL-RIGHTSIDEOFMATHEMATICALSTATEMENT");

    private static final SubLList $list253 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("rightSideOfMathematicalStatement")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("rightSideOfMathematicalStatement")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RIGHTSIDEOFMATHEMATICALSTATEMENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$rightSideOfMathematicalStatement <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(rightSideOfMathematicalStatement (#$MathEqualsStatementFn (#$MathVarFn \"x\") (#$MathQuantFn 2)) (#$MathVarFn \"x\")") });

    private static final SubLSymbol TEST_REMOVAL_RIGHTSIDEOFMATHEMATICALSTATEMENT_EXPAND = makeSymbol("TEST-REMOVAL-RIGHTSIDEOFMATHEMATICALSTATEMENT-EXPAND");

    private static final SubLList $list255 = list(list(list(list(reader_make_constant_shell(makeString("rightSideOfMathematicalStatement")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("rightSideOfMathematicalStatement")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), makeSymbol("?WHAT"))), T));

    private static final SubLObject $$likeMathTerms = reader_make_constant_shell(makeString("likeMathTerms"));

    private static final SubLSymbol $REMOVAL_LIKEMATHTERMS = makeKeyword("REMOVAL-LIKEMATHTERMS");

    private static final SubLList $list258 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("likeMathTerms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("likeMathTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKEMATHTERMS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$likeMathTerms <fully-bound-p> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(likeMathTerms (MathVarFn \"x\") (ImplicitTimes (MathQuantFn 98) (MathVarFn \"x\"))") });

    private static final SubLSymbol EXPLODE_INTERVAL_IGNORING_UNEVALUATABLE = makeSymbol("EXPLODE-INTERVAL-IGNORING-UNEVALUATABLE");

    private static final SubLSymbol TEST_REMOVAL_LIKEMATHTERMS_EXPAND = makeSymbol("TEST-REMOVAL-LIKEMATHTERMS-EXPAND");

    private static final SubLObject $list261 = _constant_261_initializer();

    private static final SubLObject $$unlikeMathTerms = reader_make_constant_shell(makeString("unlikeMathTerms"));

    private static final SubLSymbol $REMOVAL_UNLIKEMATHTERMS = makeKeyword("REMOVAL-UNLIKEMATHTERMS");

    private static final SubLList $list264 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("unlikeMathTerms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("unlikeMathTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNLIKEMATHTERMS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unlikeMathTerms <fully-bound-p> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(unlikeMathTerms (MathVarFn \"x\") (ImplicitTimes (MathQuantFn 98) (MathVarFn \"x\"))") });

    private static final SubLObject $$simplifiableMathExpression = reader_make_constant_shell(makeString("simplifiableMathExpression"));

    private static final SubLSymbol $REMOVAL_SIMPLIFIABLEMATHEXPRESSION = makeKeyword("REMOVAL-SIMPLIFIABLEMATHEXPRESSION");

    private static final SubLList $list267 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("simplifiableMathExpression")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("simplifiableMathExpression")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SIMPLIFIABLEMATHEXPRESSION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$simplifiableMathExpression <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(simplifiableMathExpression (#$MathQuantFn 4)") });

    private static final SubLObject $$unsimplifiableMathExpression = reader_make_constant_shell(makeString("unsimplifiableMathExpression"));

    private static final SubLSymbol $REMOVAL_UNSIMPLIFIABLEMATHEXPRESSION = makeKeyword("REMOVAL-UNSIMPLIFIABLEMATHEXPRESSION");

    private static final SubLList $list270 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("unsimplifiableMathExpression")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNSIMPLIFIABLEMATHEXPRESSION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$unsimplifiableMathExpression <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(unsimplifiableMathExpression (#$MathQuantFn 4)") });

    private static final SubLSymbol $EXPRESSION_IS_A_NEGATED_UNSIMPLIFIABLE_EXPRESSION = makeKeyword("EXPRESSION-IS-A-NEGATED-UNSIMPLIFIABLE-EXPRESSION");

    private static final SubLSymbol $sym272$UNSIMPLIFIABLE_MATH_EXPRESSION_ = makeSymbol("UNSIMPLIFIABLE-MATH-EXPRESSION?");

    private static final SubLSymbol $ALL_SUB_EXPRESSIONS_ARE_UNSIMPLIFIABLE = makeKeyword("ALL-SUB-EXPRESSIONS-ARE-UNSIMPLIFIABLE");

    private static final SubLSymbol $EXPRESSION_HAS_NO_DIRECT_SUB_MATH_EXPRESSION = makeKeyword("EXPRESSION-HAS-NO-DIRECT-SUB-MATH-EXPRESSION");

    private static final SubLSymbol TEST_REMOVAL_UNSIMPLIFIABLEMATHEXPRESSION_EXPAND = makeSymbol("TEST-REMOVAL-UNSIMPLIFIABLEMATHEXPRESSION-EXPAND");

    private static final SubLObject $list276 = _constant_276_initializer();

    private static final SubLSymbol TEST_REMOVAL_SIMPLIFIABLEMATHEXPRESSION_EXPAND = makeSymbol("TEST-REMOVAL-SIMPLIFIABLEMATHEXPRESSION-EXPAND");

    private static final SubLObject $list278 = _constant_278_initializer();

    private static final SubLObject $$MathEqualsStatementFn = reader_make_constant_shell(makeString("MathEqualsStatementFn"));

    private static final SubLList $list280 = list(makeSymbol("POSITIONS"), makeSymbol("ROOT-NODES"));

    private static final SubLSymbol $sym281$MATH_EQUATION_UNIVARIATE_LINEAR_ = makeSymbol("MATH-EQUATION-UNIVARIATE-LINEAR?");

    private static final SubLList $list282 = list(list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))))), T), list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))))), NIL), list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))))), NIL), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL));

    private static final SubLObject $$comparableMathTerms = reader_make_constant_shell(makeString("comparableMathTerms"));

    private static final SubLSymbol $REMOVAL_COMPARABLEMATHTERMS = makeKeyword("REMOVAL-COMPARABLEMATHTERMS");

    private static final SubLList $list285 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("comparableMathTerms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("comparableMathTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-COMPARABLEMATHTERMS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$comparableMathTerms <fully-bound-p> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(comparableMathTerms (MathVarFn \"x\") (ImplicitTimes (MathQuantFn 98) (MathVarFn \"x\"))") });

    private static final SubLSymbol TEST_REMOVAL_COMPARABLEMATHTERMS_EXPAND = makeSymbol("TEST-REMOVAL-COMPARABLEMATHTERMS-EXPAND");

    private static final SubLObject $list287 = _constant_287_initializer();

    private static final SubLObject $$likeMathTermsOnOppositeSides = reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides"));

    private static final SubLSymbol $REMOVAL_LIKEMATHTERMSONOPPOSITESIDES = makeKeyword("REMOVAL-LIKEMATHTERMSONOPPOSITESIDES");

    private static final SubLList $list290 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKEMATHTERMSONOPPOSITESIDES-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$likeMathTermsOnOppositeSides <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$likeMathTermsOnOppositeSides\n (#$MathEqualsStatementFn\n  (#$MathExpressionFn (#$MathQuantFn 5) #$InfixPlusFn (#$MathVarFn \"y\"))\n  (#$MathVarFn \"y\")))") });

    private static final SubLSymbol TEST_REMOVAL_LIKEMATHTERMSONOPPOSITESIDES_EXPAND = makeSymbol("TEST-REMOVAL-LIKEMATHTERMSONOPPOSITESIDES-EXPAND");

    private static final SubLObject $list292 = _constant_292_initializer();

    private static final SubLObject $const293$SingleOperationTypeMathTransforma = reader_make_constant_shell(makeString("SingleOperationTypeMathTransformationType"));

    private static final SubLObject $$AddTermToBothSidesOfMathStatement = reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement"));

    private static final SubLObject $const295$SubtractTermFromBothSidesOfMathSt = reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement"));

    private static final SubLObject $const296$DivideBothSidesOfMathStatementByT = reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm"));

    private static final SubLObject $const297$MultiplyBothSidesOfMathStatementB = reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm"));

    private static final SubLList $list298 = list(makeSymbol("FN"), makeSymbol("EXPRESSION"), makeSymbol("OPERATION"), makeSymbol("TERM"));

    private static final SubLSymbol TEST_APPLY_OPERATION_TO_MATH_STATEMENT = makeSymbol("TEST-APPLY-OPERATION-TO-MATH-STATEMENT");

    private static final SubLObject $list300 = _constant_300_initializer();

    private static final SubLObject $$bestTermToRemoveVia = reader_make_constant_shell(makeString("bestTermToRemoveVia"));

    private static final SubLSymbol $REMOVAL_BESTTERMTOREMOVEVIA = makeKeyword("REMOVAL-BESTTERMTOREMOVEVIA");

    private static final SubLList $list303 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("bestTermToRemoveVia")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-BESTTERMTOREMOVEVIA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$bestTermToRemoveVia <fully-bound-p> <anything> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(bestTermToRemoveVia\n  (MathEqualsStatementFn \n      (MathExpressionFn \n        (MathVarFn \"y\") InfixMinusFn (MathQuantFn 5))\n      (MathQuantFn 2))  ?REMOVE-TERM ?OPERATION ?OPERATION-TYPE)") });

    private static final SubLSymbol TEST_REMOVAL_BESTTERMTOREMOVEVIA_EXPAND = makeSymbol("TEST-REMOVAL-BESTTERMTOREMOVEVIA-EXPAND");

    private static final SubLObject $list305 = _constant_305_initializer();

    private static final SubLObject $$possibleTermsToRemoveVia = reader_make_constant_shell(makeString("possibleTermsToRemoveVia"));

    private static final SubLSymbol $REMOVAL_POSSIBLETERMSTOREMOVEVIA = makeKeyword("REMOVAL-POSSIBLETERMSTOREMOVEVIA");

    private static final SubLList $list308 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("possibleTermsToRemoveVia")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("possibleTermsToRemoveVia")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-POSSIBLETERMSTOREMOVEVIA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$possibleTermsToRemoveVia <fully-bound-p> <anything> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(possibleTermsToRemoveVia\n  (MathEqualsStatementFn \n      (MathExpressionFn \n        (MathVarFn \"y\") InfixMinusFn (MathQuantFn 5))\n      (MathQuantFn 2))  ?REMOVE-TERM ?OPERATION ?OPERATION-TYPE)") });

    private static final SubLList $list309 = list(makeSymbol("REMOVE-TERM"), makeSymbol("OPERATION"));

    private static final SubLSymbol TEST_REMOVAL_POSSIBLETERMSTOREMOVEVIA_EXPAND = makeSymbol("TEST-REMOVAL-POSSIBLETERMSTOREMOVEVIA-EXPAND");

    private static final SubLSymbol $sym311$HAS_MEMBER_EQUAL_ = makeSymbol("HAS-MEMBER-EQUAL?");

    private static final SubLList $list312 = list(list(list(list(reader_make_constant_shell(makeString("possibleTermsToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))), makeSymbol("?REMOVE-TERM"), makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementWithTheSameOperation")))), list(list(makeSymbol("?REMOVE-TERM"), reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), cons(makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement"))))), list(list(list(reader_make_constant_shell(makeString("possibleTermsToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))), makeSymbol("?REMOVE-TERM"), makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementWithTheSameOperation")))), list(list(makeSymbol("?REMOVE-TERM"), reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), cons(makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement"))))), list(list(list(reader_make_constant_shell(makeString("possibleTermsToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))), makeSymbol("?REMOVE-TERM"), makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementWithTheSameOperation")))), list(list(makeSymbol("?REMOVE-TERM"), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), cons(makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement"))))), list(list(list(reader_make_constant_shell(makeString("possibleTermsToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))), makeSymbol("?REMOVE-TERM"), makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementWithTheSameOperation")))), list(list(makeSymbol("?REMOVE-TERM"), reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), cons(makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm"))))));

    private static final SubLObject $$mathTermCoefficient = reader_make_constant_shell(makeString("mathTermCoefficient"));

    private static final SubLSymbol $REMOVAL_MATHTERMCOEFFICIENT = makeKeyword("REMOVAL-MATHTERMCOEFFICIENT");

    private static final SubLList $list315 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathTermCoefficient")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathTermCoefficient")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHTERMCOEFFICIENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathTermCoefficient <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathTermCoefficient (ImplicitTimesFn (MathQuantFn 3) (MathVarFn \"x\")) 3)") });

    private static final SubLSymbol TEST_REMOVAL_MATHTERMCOEFFICIENT_EXPAND = makeSymbol("TEST-REMOVAL-MATHTERMCOEFFICIENT-EXPAND");

    private static final SubLObject $list317 = _constant_317_initializer();

    private static final SubLObject $$mathTermVariableWithDegree = reader_make_constant_shell(makeString("mathTermVariableWithDegree"));

    private static final SubLSymbol $REMOVAL_MATHTERMVARIABLEWITHDEGREE = makeKeyword("REMOVAL-MATHTERMVARIABLEWITHDEGREE");

    private static final SubLList $list320 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathTermVariableWithDegree")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHTERMVARIABLEWITHDEGREE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathTermVariableWithDegree <fully-bound-p> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathTermVariableWithDegree (ImplicitTimesFn (MathQuantFn 3) (MathVarFn \"x\")) (MathVarFn \"x\") 1)") });

    private static final SubLList $list321 = list(makeSymbol("VAR"), makeSymbol("DEGREE"));

    private static final SubLSymbol TEST_REMOVAL_MATHTERMVARIABLEWITHDEGREE_EXPAND = makeSymbol("TEST-REMOVAL-MATHTERMVARIABLEWITHDEGREE-EXPAND");

    private static final SubLObject $list323 = _constant_323_initializer();

    private static final SubLObject $$mathTermDegree = reader_make_constant_shell(makeString("mathTermDegree"));

    private static final SubLSymbol $REMOVAL_MATHTERMDEGREE = makeKeyword("REMOVAL-MATHTERMDEGREE");

    private static final SubLList $list326 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathTermDegree")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathTermDegree")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHTERMDEGREE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathTermDegree <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathTermDegree (ImplicitTimesFn (MathQuantFn 3) (MathVarFn \"x\")) 1)") });

    private static final SubLSymbol MATH_EXPRESSION_ADDITION_OR_SUBTRACTION_OP_P = makeSymbol("MATH-EXPRESSION-ADDITION-OR-SUBTRACTION-OP-P");

    private static final SubLSymbol TEST_REMOVAL_MATHTERMDEGREE_EXPAND = makeSymbol("TEST-REMOVAL-MATHTERMDEGREE-EXPAND");

    private static final SubLObject $list329 = _constant_329_initializer();

    private static final SubLObject $$commonPrimeFactorList = reader_make_constant_shell(makeString("commonPrimeFactorList"));

    private static final SubLSymbol $REMOVAL_COMMONPRIMEFACTORLIST = makeKeyword("REMOVAL-COMMONPRIMEFACTORLIST");

    private static final SubLList $list332 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("commonPrimeFactorList")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-COMMONPRIMEFACTORLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$commonPrimeFactorList <fully-bound-p> <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(commonPrimeFactorList 20 30 (TheList 2 5))") });

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol TEST_REMOVAL_COMMONPRIMEFACTORLIST_EXPAND = makeSymbol("TEST-REMOVAL-COMMONPRIMEFACTORLIST-EXPAND");

    private static final SubLList $list336 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), TWENTY_INTEGER, makeInteger(30), makeSymbol("?LIST"))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), TWENTY_INTEGER, makeInteger(30), list(reader_make_constant_shell(makeString("TheList")), TWO_INTEGER, FIVE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), SEVEN_INTEGER, THREE_INTEGER, makeSymbol("?LIST"))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), SEVEN_INTEGER, THREE_INTEGER, reader_make_constant_shell(makeString("TheEmptyList")))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeInteger(40), makeInteger(60), makeSymbol("?LIST"))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeInteger(40), makeInteger(60), list(reader_make_constant_shell(makeString("TheList")), TWO_INTEGER, TWO_INTEGER, FIVE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeInteger(-40), makeInteger(60), makeSymbol("?LIST"))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeInteger(-40), makeInteger(60), list(reader_make_constant_shell(makeString("TheList")), TWO_INTEGER, TWO_INTEGER, FIVE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeInteger(-40), makeInteger(-60), makeSymbol("?LIST"))), T), list(list(list(reader_make_constant_shell(makeString("commonPrimeFactorList")), makeInteger(-40), makeInteger(-60), list(reader_make_constant_shell(makeString("TheList")), TWO_INTEGER, TWO_INTEGER, FIVE_INTEGER))), T) });

    private static final SubLObject $$simplifiableFraction = reader_make_constant_shell(makeString("simplifiableFraction"));

    private static final SubLSymbol $REMOVAL_SIMPLIFIABLEFRACTION = makeKeyword("REMOVAL-SIMPLIFIABLEFRACTION");

    private static final SubLList $list339 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("simplifiableFraction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("simplifiableFraction")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SIMPLIFIABLEFRACTION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$simplifiableFraction <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(simplifiableFraction (#$SimpleFractionFn 17 11))") });

    private static final SubLSymbol TEST_REMOVAL_SIMPLIFIABLEFRACTION_EXPAND = makeSymbol("TEST-REMOVAL-SIMPLIFIABLEFRACTION-EXPAND");

    private static final SubLList $list341 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ELEVEN_INTEGER, SEVENTEEN_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("Volt")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ELEVEN_INTEGER, SEVENTEEN_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("Inch")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), SEVENTEEN_INTEGER, ELEVEN_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("Volt")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THIRTEEN_INTEGER, SEVEN_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), SIX_INTEGER, NINE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("Volt")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIFTEEN_INTEGER, makeInteger(24))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, EIGHT_INTEGER, TWELVE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("Inch")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, NINE_INTEGER, THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, NINE_INTEGER, THREE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("MinusFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ZERO_INTEGER, TWO_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableFraction")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), MINUS_ONE_INTEGER, ZERO_INTEGER))), NIL) });

    private static final SubLObject $$mathExpressionOperandList = reader_make_constant_shell(makeString("mathExpressionOperandList"));

    private static final SubLSymbol $REMOVAL_MATHEXPRESSIONOPERANDLIST = makeKeyword("REMOVAL-MATHEXPRESSIONOPERANDLIST");

    private static final SubLList $list344 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathExpressionOperandList")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathExpressionOperandList")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHEXPRESSIONOPERANDLIST-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathExpressionOperandList <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathExpressionOperandList (#$MathExpressionFn (#$MathQuantFn 3) \n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 5)\n\t\t\t\t     #$InfixPlusFn (#$MathQuantFn 7)) ?WHAT)") });

    private static final SubLSymbol TEST_REMOVAL_MATHEXPRESSIONOPERANDLIST_EXPAND = makeSymbol("TEST-REMOVAL-MATHEXPRESSIONOPERANDLIST-EXPAND");

    private static final SubLObject $list346 = _constant_346_initializer();

    private static final SubLObject $$associateLikeTerms = reader_make_constant_shell(makeString("associateLikeTerms"));

    private static final SubLSymbol $REMOVAL_ASSOCIATELIKETERMS = makeKeyword("REMOVAL-ASSOCIATELIKETERMS");

    private static final SubLList $list349 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("associateLikeTerms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("associateLikeTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSOCIATELIKETERMS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$associateLikeTerms <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$associateLikeTerms (#$MathExpressionFn (#$MathQuantFn 5) #$InfixPlusFn\n\t\t\t   (#$MathQuantFn 12) #$InfixPlusFn\n\t\t\t   (#$MathQuantFn (#$SimpleFractionFn 3 7)) #$InfixPlusFn\n\t\t\t   (#$MathQuantFn (#$MixedFractionFn 3 5 7))) ?WHAT)") });

    private static final SubLSymbol $LIKE_TERMS = makeKeyword("LIKE-TERMS");

    private static final SubLSymbol TEST_REMOVAL_ASSOCIATELIKETERMS_EXPAND = makeSymbol("TEST-REMOVAL-ASSOCIATELIKETERMS-EXPAND");

    private static final SubLObject $list352 = _constant_352_initializer();

    private static final SubLObject $const353$expressionReorderedToGroupLikeTer = reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONREORDEREDTOGROUPLIKETERMS = makeKeyword("REMOVAL-EXPRESSIONREORDEREDTOGROUPLIKETERMS");

    private static final SubLList $list355 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONREORDEREDTOGROUPLIKETERMS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionReorderedToGroupLikeTerms <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$expressionReorderedToGroupLikeTerms (#$MathExpressionFn (#$MathQuantFn 5) #$InfixPlusFn\n\t\t\t   (#$MathQuantFn 12) #$InfixPlusFn\n\t\t\t   (#$MathQuantFn (#$SimpleFractionFn 3 7)) #$InfixPlusFn\n\t\t\t   (#$MathQuantFn (#$MixedFractionFn 3 5 7))) ?WHAT)") });

    private static final SubLObject $$Fraction = reader_make_constant_shell(makeString("Fraction"));

    private static final SubLSymbol $COMPARE_MATH_QUANT_FNS = makeKeyword("COMPARE-MATH-QUANT-FNS");

    private static final SubLSymbol $sym358$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol $sym359$MATH_TERM_TYPE_FRACTION_ = makeSymbol("MATH-TERM-TYPE-FRACTION?");

    private static final SubLSymbol MATH_TERM_TYPE = makeSymbol("MATH-TERM-TYPE");

    private static final SubLSymbol $sym361$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym362$MATH_TERM___COMPARE_VALUES = makeSymbol("MATH-TERM-<-COMPARE-VALUES");

    private static final SubLSymbol $sym363$MATH_TERM__ = makeSymbol("MATH-TERM-<");

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONREORDEREDTOGROUPLIKETERMS_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONREORDEREDTOGROUPLIKETERMS-EXPAND");

    private static final SubLObject $list365 = _constant_365_initializer();

    private static final SubLObject $const366$expressionHasNonAdjacentLikeTerms = reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS = makeKeyword("REMOVAL-EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS");

    private static final SubLList $list368 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionHasNonAdjacentLikeTermsAsOperands <fully-bound-p>>)"), makeKeyword("EXAMPLE"), makeString("(#$expressionHasNonAdjacentLikeTermsAsOperands   (#$MathExpressionFn (#$ImplicitTimesFn (#$MathQuantFn 7) (#$MathVarFn \"x\")) #$InfixPlusFn\n\t\t       (#$MathQuantFn (#$SimpleFractionFn 3 7)) #$InfixPlusFn\n\t\t       (#$ImplicitTimesFn (#$MathQuantFn 2) (#$MathVarFn \"x\")) #$InfixPlusFn\n\t\t       (#$MathVarFn \"x\")))") });

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS-EXPAND");

    private static final SubLObject $list370 = _constant_370_initializer();

    private static final SubLObject $const371$expressionReorderedInAscendingOrd = reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder"));

    private static final SubLSymbol $REMOVAL_EXPRESSIONREORDEREDINASCENDINGORDER = makeKeyword("REMOVAL-EXPRESSIONREORDEREDINASCENDINGORDER");

    private static final SubLList $list373 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSIONREORDEREDINASCENDINGORDER-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expressionReorderedInAscendingOrder <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$expressionReorderedInAscendingOrder\n  (MathExpressionFn\n   (MathQuantFn 4) InfixPlusFn\n   (MathQuantFn 2) InfixPlusFn\n   (MathQuantFn 5) InfixPlusFn\n   (MathQuantFn 1) InfixPlusFn\n   (MathQuantFn 3))\n  (MathExpressionFn\n   (MathQuantFn 1) InfixPlusFn\n   (MathQuantFn 2) InfixPlusFn\n   (MathQuantFn 3) InfixPlusFn\n   (MathQuantFn 4) InfixPlusFn\n   (MathQuantFn 5)))") });

    private static final SubLSymbol $sym374$STRONG_MATH_TERM__ = makeSymbol("STRONG-MATH-TERM-<");

    private static final SubLSymbol TEST_REMOVAL_EXPRESSIONREORDEREDINASCENDINGORDER_EXPAND = makeSymbol("TEST-REMOVAL-EXPRESSIONREORDEREDINASCENDINGORDER-EXPAND");

    private static final SubLList $list376 = list(list(list(list(reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER) }))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER) }))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER) }))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedInAscendingOrder")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FIVE_INTEGER)) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)) }))), T));

    private static final SubLObject $$bestSubExpressionToEvaluate = reader_make_constant_shell(makeString("bestSubExpressionToEvaluate"));

    private static final SubLSymbol $REMOVAL_BESTSUBEXPRESSIONTOEVALUATE = makeKeyword("REMOVAL-BESTSUBEXPRESSIONTOEVALUATE");

    private static final SubLList $list379 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-BESTSUBEXPRESSIONTOEVALUATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$bestSubExpressionToEvaluate <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$bestSubExpressionToEvaluate\n (#$MathExpressionFn\n  (#$MathQuantFn 3)\n  #$InfixPlusFn (#$MathQuantFn 5)\n  #$InfixMinusFn (#$MathQuantFn 7))\n (#$MathExpressionFn\n  (#$MathQuantFn 3)\n  #$InfixPlusFn (#$MathQuantFn 5)))") });

    private static final SubLSymbol TEST_REMOVAL_BESTSUBEXPRESSIONTOEVALUATE_EXPAND = makeSymbol("TEST-REMOVAL-BESTSUBEXPRESSIONTOEVALUATE-EXPAND");

    private static final SubLList $list381 = list(list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("bestSubExpressionToEvaluate")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))))), T));

    private static final SubLSymbol INFIX_MATH_EXPRESSION_P = makeSymbol("INFIX-MATH-EXPRESSION-P");

    private static final SubLSymbol MATH_EXPRESSION_TO_PREFIX_FORMAT = makeSymbol("MATH-EXPRESSION-TO-PREFIX-FORMAT");

    private static final SubLObject $list384 = _constant_384_initializer();

    private static final SubLSymbol FRACTION_P = makeSymbol("FRACTION-P");

    private static final SubLObject $$NegativeMixedFractionFn = reader_make_constant_shell(makeString("NegativeMixedFractionFn"));

    private static final SubLSymbol $sym387$FRACTION_ = makeSymbol("FRACTION?");

    private static final SubLObject $$mathExpressionNthOperand = reader_make_constant_shell(makeString("mathExpressionNthOperand"));

    private static final SubLSymbol $REMOVAL_MATHEXPRESSIONNTHOPERAND = makeKeyword("REMOVAL-MATHEXPRESSIONNTHOPERAND");

    private static final SubLList $list390 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mathExpressionNthOperand")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MATHEXPRESSIONNTHOPERAND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mathExpressionNthOperand <fully-bound-p> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(mathExpressionNthOperand (MathExpressionFn (MathQuantFn 5) InfixPlusFn\n(MathQuantFn 7)) 1 (MathQuantFn 5))\n(mathExpressionNthOperand (ImplicitTimesFn (MathQuantFn 5) (MathQuantFn 7)) 2\n(MathQuantFn 7))") });

    private static final SubLSymbol TEST_REMOVAL_MATHEXPRESSIONNTHOPERAND_EXPAND = makeSymbol("TEST-REMOVAL-MATHEXPRESSIONNTHOPERAND-EXPAND");

    private static final SubLObject $list392 = _constant_392_initializer();

    private static final SubLObject $const393$orderedListOfDirectSubExpressions = reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount"));

    private static final SubLSymbol $REMOVAL_ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT = makeKeyword("REMOVAL-ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT");

    private static final SubLList $list395 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$orderedListOfDirectSubExpressionsWithOperandCount <fully-bound-p> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(orderedListOfDirectSubExpressionsWithOperandCount (MathExpressionFn (MathQuantFn 5) InfixPlusFn\n(MathQuantFn 7)) 1 (MathQuantFn 5))\n(orderedListOfDirectSubExpressionsWithOperandCount (ImplicitTimesFn (MathQuantFn 5) (MathQuantFn 7)) 2\n(MathQuantFn 7))") });

    private static final SubLSymbol $sym396$TEST_REMOVAL_ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT_EX = makeSymbol("TEST-REMOVAL-ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT-EXPAND");

    private static final SubLObject $list397 = _constant_397_initializer();



    public static SubLObject math_expression_infix_operator_precedence_rank(final SubLObject op) {
        return getf($math_expression_infix_operator_precedence_rank$.getGlobalValue(), op, UNPROVIDED);
    }

    public static SubLObject math_expression_addition_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_addition_fns$.getGlobalValue());
    }

    public static SubLObject math_expression_subtraction_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_subtraction_fns$.getGlobalValue());
    }

    public static SubLObject math_expression_addition_or_subtraction_op_p(final SubLObject v_object) {
        return makeBoolean((NIL != math_expression_addition_op_p(v_object)) || (NIL != math_expression_subtraction_op_p(v_object)));
    }

    public static SubLObject math_expression_multiplication_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_multiplication_fns$.getGlobalValue());
    }

    public static SubLObject math_expression_division_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_division_fns$.getGlobalValue());
    }

    public static SubLObject math_expression_multiplication_or_divide_op_p(final SubLObject v_object) {
        return makeBoolean((NIL != math_expression_multiplication_op_p(v_object)) || (NIL != math_expression_division_op_p(v_object)));
    }

    public static SubLObject math_expression_exponentiation_op_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $$PowerExpressionFn);
    }

    public static SubLObject math_expression_nth_root_op_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $$NthRootExpressionFn);
    }

    public static SubLObject math_expression_infix_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_infix_operators$.getGlobalValue());
    }

    public static SubLObject math_expression_unary_prefix_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_unary_prefix_operators$.getGlobalValue());
    }

    public static SubLObject math_expression_unary_surround_op_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_unary_surround_operators$.getGlobalValue());
    }

    public static SubLObject math_expression_with_some_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != subl_promotions.memberP(v_object.first(), all_math_expression_denoting_functions(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject clear_all_math_expression_denoting_functions() {
        final SubLObject cs = $all_math_expression_denoting_functions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_all_math_expression_denoting_functions() {
        return memoization_state.caching_state_remove_function_results_with_args($all_math_expression_denoting_functions_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_math_expression_denoting_functions_internal() {
        return isa.all_instances_in_all_mts($const11$MathematicalExpressionDenotingFun);
    }

    public static SubLObject all_math_expression_denoting_functions() {
        SubLObject caching_state = $all_math_expression_denoting_functions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_MATH_EXPRESSION_DENOTING_FUNCTIONS, $all_math_expression_denoting_functions_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_ALL_MATH_EXPRESSION_DENOTING_FUNCTIONS);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_math_expression_denoting_functions_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject math_expression_p(final SubLObject v_object) {
        return makeBoolean((((NIL != math_expression_quant_fn_p(v_object)) || (NIL != time_expression_fn_p(v_object))) || (NIL != math_expression_var_p(v_object))) || (NIL != math_expression_with_some_operator_p(v_object)));
    }

    public static SubLObject infix_math_expression_p(final SubLObject obj) {
        return el_formula_with_operator_p(obj, $$MathExpressionFn);
    }

    public static SubLObject prefix_math_expression_p(final SubLObject obj) {
        return makeBoolean((NIL != math_expression_p(obj)) && (NIL == infix_math_expression_p(obj)));
    }

    public static SubLObject math_expression_quant_fn_p(final SubLObject expression) {
        return cycl_utilities.naut_with_functor_p(expression, $$MathQuantFn);
    }

    public static SubLObject time_expression_fn_p(final SubLObject expression) {
        return cycl_utilities.naut_with_functor_p(expression, $$TimeExpressionFn);
    }

    public static SubLObject math_expression_minus_quant_fn_p(final SubLObject expression) {
        return makeBoolean((NIL != cycl_utilities.naut_with_functor_p(expression, $$PrefixMinusFn)) && (NIL != math_expression_quant_fn_p(cycl_utilities.nat_arg1(expression, UNPROVIDED))));
    }

    public static SubLObject math_expression_quant_fn_or_minus_quant_fn_p(final SubLObject expression) {
        return makeBoolean((NIL != math_expression_minus_quant_fn_p(expression)) || (NIL != math_expression_quant_fn_p(expression)));
    }

    public static SubLObject math_expression_quant_value(final SubLObject expression) {
        SubLObject v_answer = expression;
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$MathQuantFn)) {
            v_answer = cycl_utilities.nat_arg1(expression, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject math_expression_zero_quant_value(final SubLObject expression) {
        return makeBoolean((NIL != math_expression_quant_fn_p(expression)) && ZERO_INTEGER.equal(nth_value_step_2(nth_value_step_1(ONE_INTEGER), quantities.explode_interval_ignoring_unevaluatable(cycl_utilities.nat_arg1(expression, UNPROVIDED)))));
    }

    public static SubLObject math_expression_var_p(final SubLObject expression) {
        return cycl_utilities.naut_with_functor_p(expression, $$MathVarFn);
    }

    public static SubLObject math_expression_enclosure_fn_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $math_expression_enclosure_fns$.getGlobalValue());
    }

    public static SubLObject math_statement_function_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.member_kbeqP(v_object, $math_statement_fns$.getDynamicValue(thread));
    }

    public static SubLObject math_statement_expressionP(final SubLObject expression) {
        return makeBoolean((NIL != math_statement_function_p(cycl_utilities.nat_functor(expression))) && (NIL != list_utilities.lengthE(expression, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject math_addition_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_ADDITION_OP_P);
    }

    public static SubLObject math_subtraction_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_SUBTRACTION_OP_P);
    }

    public static SubLObject math_addition_or_subtraction_expressionP(final SubLObject expression) {
        return makeBoolean((NIL != math_addition_expressionP(expression)) || (NIL != math_subtraction_expressionP(expression)));
    }

    public static SubLObject math_multiplication_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_MULTIPLICATION_OP_P);
    }

    public static SubLObject math_division_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_DIVISION_OP_P);
    }

    public static SubLObject math_multiplication_or_division_expressionP(final SubLObject expression) {
        return makeBoolean((NIL != math_multiplication_expressionP(expression)) || (NIL != math_division_expressionP(expression)));
    }

    public static SubLObject math_exponentiation_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_EXPONENTIATION_OP_P);
    }

    public static SubLObject math_nth_root_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_NTH_ROOT_OP_P);
    }

    public static SubLObject math_enclosed_math_expressionP(final SubLObject expression) {
        return math_expression_with_all_of_operator_test(expression, MATH_EXPRESSION_ENCLOSURE_FN_P);
    }

    public static SubLObject math_expression_unenclose(final SubLObject expression) {
        if (NIL != math_enclosed_math_expressionP(expression)) {
            return math_expression_unenclose(cycl_utilities.nat_arg1(expression, UNPROVIDED));
        }
        return expression;
    }

    public static SubLObject math_expression_with_all_of_operator_test(final SubLObject expression, final SubLObject operator_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops(expression);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != list_utilities.sublisp_boolean(ops)) && (NIL != list_utilities.every_in_list(operator_test, ops, UNPROVIDED)));
    }

    public static SubLObject math_expression_with_any_of_operator_test(final SubLObject expression, final SubLObject operator_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops(expression);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != list_utilities.sublisp_boolean(ops)) && (NIL != list_utilities.any_in_list(operator_test, ops, UNPROVIDED)));
    }

    public static SubLObject removal_submathexpressions_direct_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = sub_math_expressions_direct(arg1);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sub_math_expressions_direct(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        if (((NIL != math_expression_p(expression)) && (NIL == math_expression_quant_fn_p(expression))) && (NIL == math_expression_var_p(expression))) {
            thread.resetMultipleValues();
            final SubLObject elems = math_expression_elems_and_ops(expression);
            final SubLObject ops = thread.secondMultipleValue();
            thread.resetMultipleValues();
            answers = elems;
            final SubLObject expression_args = cycl_utilities.nat_args(expression, UNPROVIDED);
            if (NIL == list_utilities.singletonP(elems)) {
                SubLObject expression_args_length;
                SubLObject sub_seq_length;
                SubLObject sub_seq_start;
                for (expression_args_length = length(expression_args), sub_seq_length = NIL, sub_seq_length = THREE_INTEGER; !add(sub_seq_length, TWO_INTEGER).numG(expression_args_length); sub_seq_length = add(TWO_INTEGER, sub_seq_length)) {
                    for (sub_seq_start = NIL, sub_seq_start = ZERO_INTEGER; !sub_seq_start.numG(subtract(expression_args_length, sub_seq_length)); sub_seq_start = add(TWO_INTEGER, sub_seq_start)) {
                        answers = cons(cons($$MathExpressionFn, subseq(expression_args, sub_seq_start, add(sub_seq_start, sub_seq_length))), answers);
                    }
                }
            }
        }
        return answers;
    }

    public static SubLObject test_removal_submathexpressions_direct_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_submathexpressions_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject answers = sub_math_expressions(arg1);
        SubLObject cdolist_list_var;
        answers = cdolist_list_var = remove(arg1, answers, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sub_math_expressions(final SubLObject expression) {
        final SubLObject gathered_answers = cycl_utilities.expression_gather(expression, MATH_EXPRESSION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = gathered_answers;
        SubLObject gathered_answer = NIL;
        gathered_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = gathered_answer;
            if (NIL == member(item_var, answers, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                answers = cons(item_var, answers);
            }
            SubLObject cdolist_list_var_$1 = sub_math_expressions_direct(gathered_answer);
            SubLObject sub_gathered_answer = NIL;
            sub_gathered_answer = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject item_var2 = sub_gathered_answer;
                if (NIL == member(item_var2, answers, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    answers = cons(item_var2, answers);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                sub_gathered_answer = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            gathered_answer = cdolist_list_var.first();
        } 
        return answers;
    }

    public static SubLObject test_removal_submathexpressions_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_mathquantvalue_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = math_quant_value(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_quant_value(final SubLObject expr) {
        if (NIL != cycl_utilities.naut_with_functor_p(expr, $$MathQuantFn)) {
            return cycl_utilities.nat_arg1(expr, UNPROVIDED);
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(expr, $list51)) {
            return math_quant_value(cycl_utilities.nat_arg1(expr, UNPROVIDED));
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(expr, $list52)) {
            final SubLObject pos = math_quant_value(cycl_utilities.nat_arg1(expr, UNPROVIDED));
            return pos.isNumber() ? multiply(MINUS_ONE_INTEGER, pos) : make_unary_formula($$MinusFn, pos);
        }
        return NIL;
    }

    public static SubLObject test_removal_mathquantvalue_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_additionarglist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = math_expression_addition_arglist(arg1);
        if (NIL != v_answer) {
            v_answer = make_el_list(v_answer, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_addition_arglist(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$InfixPlusFn)) && (NIL != list_utilities.every_in_list(MATH_EXPRESSION_QUANT_FN_P, cycl_utilities.nat_args(expression, UNPROVIDED), UNPROVIDED))) {
            v_answer = Mapping.mapcar(MATH_EXPRESSION_QUANT_VALUE, cycl_utilities.nat_args(expression, UNPROVIDED));
        }
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = cycl_utilities.nat_args(expression, UNPROVIDED);
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if (NIL != oddp(elem_or_op_pos)) {
                    ops = cons(elem_or_op, ops);
                } else {
                    elems = cons(elem_or_op, elems);
                }
            }
            ops = list_utilities.fast_remove_duplicates(ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (((NIL != list_utilities.singletonP(ops)) && (NIL != kb_utilities.kbeq($$InfixPlusFn, ops.first()))) && (NIL != list_utilities.every_in_list(MATH_EXPRESSION_QUANT_FN_P, elems, UNPROVIDED))) {
                v_answer = nreverse(Mapping.mapcar(MATH_EXPRESSION_QUANT_VALUE, elems));
            }
        }
        return v_answer;
    }

    public static SubLObject test_removal_additionarglist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_genericadditionarglist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = generic_math_expression_addition_arglist(arg1);
        if (NIL != v_answer) {
            v_answer = make_el_list(v_answer, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject generic_math_expression_addition_arglist(final SubLObject expression) {
        return math_expression_addition_arglist(math_expression_unenclose(expression));
    }

    public static SubLObject test_removal_genericadditionarglist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_multiplicationarglist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = math_expression_multiplication_arglist(arg1);
        if (NIL != v_answer) {
            v_answer = make_el_list(v_answer, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_multiplication_arglist(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$InfixTimesFn)) && (NIL != list_utilities.every_in_list(MATH_EXPRESSION_QUANT_FN_P, cycl_utilities.nat_args(expression, UNPROVIDED), UNPROVIDED))) {
            v_answer = Mapping.mapcar(MATH_EXPRESSION_QUANT_VALUE, cycl_utilities.nat_args(expression, UNPROVIDED));
        }
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = cycl_utilities.nat_args(expression, UNPROVIDED);
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if (NIL != oddp(elem_or_op_pos)) {
                    ops = cons(elem_or_op, ops);
                } else {
                    elems = cons(elem_or_op, elems);
                }
            }
            ops = list_utilities.fast_remove_duplicates(ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != list_utilities.every_in_list(MATH_EXPRESSION_MULTIPLICATION_OP_P, ops, UNPROVIDED)) && (NIL != list_utilities.every_in_list(MATH_EXPRESSION_QUANT_FN_P, elems, UNPROVIDED))) {
                v_answer = nreverse(Mapping.mapcar(MATH_EXPRESSION_QUANT_VALUE, elems));
            }
        }
        return v_answer;
    }

    public static SubLObject test_removal_multiplicationarglist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_genericmultiplicationarglist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = generic_math_expression_multiplication_arglist(arg1);
        if (NIL != v_answer) {
            v_answer = make_el_list(v_answer, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject generic_math_expression_multiplication_arglist(final SubLObject expression) {
        return math_expression_multiplication_arglist(math_expression_unenclose(expression));
    }

    public static SubLObject test_removal_genericmultiplicationarglist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionnegated_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$PrefixMinusFn)) {
            v_answer = cycl_utilities.nat_arg1(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionnegated_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionminuend_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = math_expression_minuend(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_minuend(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$InfixMinusFn)) {
            v_answer = cycl_utilities.nat_arg1(expression, UNPROVIDED);
        }
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) && (NIL != kb_utilities.kbeq(third(expression), $$InfixMinusFn))) {
            v_answer = second(expression);
        }
        return v_answer;
    }

    public static SubLObject test_removal_expressionminuend_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_genericexpressionminuend_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = generic_math_expression_minuend(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject generic_math_expression_minuend(final SubLObject expression) {
        return math_expression_minuend(math_expression_unenclose(expression));
    }

    public static SubLObject test_removal_genericexpressionminuend_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionsubtrahend_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = math_expression_subtrahend(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_subtrahend(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$InfixMinusFn)) {
            v_answer = cycl_utilities.nat_arg2(expression, UNPROVIDED);
        }
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) && (NIL != kb_utilities.kbeq(list_utilities.penultimate_one(expression), $$InfixMinusFn))) {
            v_answer = list_utilities.last_one(expression);
        }
        return v_answer;
    }

    public static SubLObject test_removal_expressionsubtrahend_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_genericexpressionsubtrahend_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = generic_math_expression_subtrahend(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject generic_math_expression_subtrahend(final SubLObject expression) {
        return math_expression_subtrahend(math_expression_unenclose(expression));
    }

    public static SubLObject test_removal_genericexpressionsubtrahend_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressiondivisor_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = math_expression_divisor(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_divisor(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_any_of_functors_p(expression, $math_expression_division_fns$.getGlobalValue())) {
            v_answer = cycl_utilities.nat_arg2(expression, UNPROVIDED);
        }
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) && (NIL != list_utilities.member_kbeqP(list_utilities.penultimate_one(expression), $math_expression_division_fns$.getGlobalValue()))) {
            v_answer = list_utilities.last_one(expression);
        }
        return v_answer;
    }

    public static SubLObject test_removal_expressiondivisor_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_genericexpressiondivisor_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = generic_math_expression_divisor(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject generic_math_expression_divisor(final SubLObject expression) {
        return math_expression_divisor(math_expression_unenclose(expression));
    }

    public static SubLObject test_removal_genericexpressiondivisor_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressiondividend_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = math_expression_dividend(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_dividend(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_any_of_functors_p(expression, $math_expression_division_fns$.getGlobalValue())) {
            v_answer = cycl_utilities.nat_arg1(expression, UNPROVIDED);
        }
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) && (NIL != list_utilities.member_kbeqP(third(expression), $math_expression_division_fns$.getGlobalValue()))) {
            v_answer = second(expression);
        }
        return v_answer;
    }

    public static SubLObject test_removal_expressiondividend_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_genericexpressiondividend_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = generic_math_expression_dividend(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject generic_math_expression_dividend(final SubLObject expression) {
        return math_expression_dividend(math_expression_unenclose(expression));
    }

    public static SubLObject test_removal_genericexpressiondividend_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionexponent_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$PowerExpressionFn)) {
            v_answer = cycl_utilities.nat_arg2(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionexponent_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionbase_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$PowerExpressionFn)) {
            v_answer = cycl_utilities.nat_arg1(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionbase_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionradicand_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$NthRootExpressionFn)) {
            v_answer = cycl_utilities.nat_arg2(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionradicand_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionindex_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$NthRootExpressionFn)) {
            v_answer = cycl_utilities.nat_arg1(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionindex_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_absolutevalueofexpression_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$AbsoluteValueExpressionFn)) {
            v_answer = cycl_utilities.nat_arg1(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_absolutevalueofexpression_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionenclosed_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = math_expression_enclosed_expression(arg1);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_enclosed_expression(final SubLObject math_expression) {
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_any_of_functors_p(math_expression, $math_expression_enclosure_fns$.getGlobalValue())) {
            v_answer = cycl_utilities.nat_arg1(math_expression, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject test_removal_expressionenclosed_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionaddends_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = math_expression_addends(arg1);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject math_expression_addends(final SubLObject math_expression) {
        SubLObject answers = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(math_expression, $$InfixPlusFn)) {
            answers = copy_list(cycl_utilities.nat_args(math_expression, UNPROVIDED));
        }
        if (NIL != cycl_utilities.naut_with_functor_p(math_expression, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = cycl_utilities.nat_args(math_expression, UNPROVIDED);
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if (NIL != oddp(elem_or_op_pos)) {
                    ops = cons(elem_or_op, ops);
                } else {
                    elems = cons(elem_or_op, elems);
                }
            }
            ops = list_utilities.fast_remove_duplicates(ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != list_utilities.singletonP(ops)) && (NIL != kb_utilities.kbeq($$InfixPlusFn, ops.first()))) {
                answers = nreverse(elems);
            }
        }
        return answers;
    }

    public static SubLObject test_removal_expressionaddends_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionfactors_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = math_expression_factors(arg1);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(math_expression_unenclose(v_answer), arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject math_expression_factors(final SubLObject math_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops_for_multiplication_and_division(math_expression);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.every_in_list(MATH_EXPRESSION_MULTIPLICATION_OP_P, ops, UNPROVIDED)) {
            answers = nreverse(elems);
        }
        answers = remove(math_expression, answers, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return answers;
    }

    public static SubLObject test_removal_expressionfactors_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionaddendlist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$InfixPlusFn)) {
            v_answer = copy_list(cycl_utilities.nat_args(arg1, UNPROVIDED));
        }
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = cycl_utilities.nat_args(arg1, UNPROVIDED);
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if (NIL != oddp(elem_or_op_pos)) {
                    ops = cons(elem_or_op, ops);
                } else {
                    elems = cons(elem_or_op, elems);
                }
            }
            ops = list_utilities.fast_remove_duplicates(ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != list_utilities.singletonP(ops)) && (NIL != kb_utilities.kbeq($$InfixPlusFn, ops.first()))) {
                v_answer = nreverse(elems);
            }
        }
        if (NIL != v_answer) {
            v_answer = make_el_list(v_answer, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionaddendlist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionfactorlist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops(arg1);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.every_in_list(MATH_EXPRESSION_MULTIPLICATION_OP_P, ops, UNPROVIDED)) {
            v_answer = elems;
        }
        if (NIL != v_answer) {
            v_answer = make_el_list(Mapping.mapcar(MATH_EXPRESSION_UNENCLOSE, v_answer), UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionfactorlist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionisevaluatable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject evaluatableP = math_expression_is_evaluatableP(expression);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != evaluatableP) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return reason;
    }

    public static SubLObject math_expression_is_evaluatableP(SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != math_expression_enclosure_fn_p(cycl_utilities.nat_functor(expression))) {
            expression = cycl_utilities.nat_arg1(expression, UNPROVIDED);
        }
        if (NIL != math_expression_quant_fn_p(expression)) {
            return values(NIL, $EXPRESSION_IS_A_MATH_QUANTITY);
        }
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$PrefixMinusFn)) && (NIL == math_expression_is_evaluatableP(cycl_utilities.atomic_sentence_arg1(expression, UNPROVIDED)))) {
            return values(NIL, $EXPRESSION_IS_A_NEGATED_UNEVALUATABLE_EXPRESSION);
        }
        if (NIL != cycl_utilities.expression_find_if(MATH_EXPRESSION_VAR_P, expression, UNPROVIDED, UNPROVIDED)) {
            return values(NIL, $SOME_OPERAND_IS_A_VARIABLE);
        }
        if ((NIL != find_if(MATH_EXPRESSION_WITH_SOME_OPERATOR_P, cycl_utilities.nat_args(expression, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.find_if_not(MATH_EXPRESSION_QUANT_FN_OR_MINUS_QUANT_FN_P, math_expression_elems_and_ops(expression), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return values(NIL, $SOME_OPERAND_IS_A_MATH_EXPRESSION);
        }
        thread.resetMultipleValues();
        final SubLObject value = math_expression_evaluate_int(expression);
        final SubLObject type = thread.secondMultipleValue();
        final SubLObject reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == value) {
            return values(NIL, reason);
        }
        return values(T, NIL);
    }

    public static SubLObject math_expression_evaluate(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        SubLObject v_answer = math_expression_evaluate_int(expression);
        final SubLObject units = thread.secondMultipleValue();
        final SubLObject reason = thread.thirdMultipleValue();
        final SubLObject first_expression_to_evaluate = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != v_answer) && (NIL != units)) && (NIL == reason)) {
            v_answer = arithmetic.arithmetic_answer(v_answer);
            final SubLObject negateP = makeBoolean(v_answer.isNumber() && v_answer.isNegative());
            if (NIL != negateP) {
                v_answer = minus(v_answer);
            }
            if (NIL != kb_utilities.kbeq(units, $$Unity)) {
                result = make_unary_formula($$MathQuantFn, v_answer);
            } else {
                result = make_unary_formula($$MathQuantFn, make_unary_formula(units, v_answer));
            }
            if (NIL != negateP) {
                result = make_unary_formula($$PrefixMinusFn, result);
            }
        }
        return values(result, reason, first_expression_to_evaluate);
    }

    public static SubLObject math_expression_evaluate_int(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression_type = cycl_utilities.nat_functor(expression);
        SubLObject v_answer = NIL;
        SubLObject units = NIL;
        SubLObject reason = NIL;
        SubLObject first_expression_to_evaluate = NIL;
        if (NIL != kb_utilities.kbeq($$MathQuantFn, expression_type)) {
            final SubLObject interval = cycl_utilities.nat_arg1(expression, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject units_$2 = quantities.explode_interval_ignoring_unevaluatable(interval);
            final SubLObject v_answer_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            units = units_$2;
            v_answer = v_answer_$3;
        } else
            if (NIL != kb_utilities.kbeq($$InfixMinusFn, expression_type)) {
                thread.resetMultipleValues();
                final SubLObject minuend = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                final SubLObject minuend_units = thread.secondMultipleValue();
                final SubLObject minuend_reason = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject subtrahend = math_expression_evaluate_int(cycl_utilities.nat_arg2(expression, UNPROVIDED));
                final SubLObject subtrahend_units = thread.secondMultipleValue();
                final SubLObject subtrahend_reason = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != minuend_reason) || (NIL != subtrahend_reason)) {
                    reason = math_expression_failed_evaluation_reasons_merge(minuend_reason, subtrahend_reason);
                }
                if (NIL == reason) {
                    if (NIL == unification_utilities.term_unify(minuend_units, subtrahend_units, UNPROVIDED, UNPROVIDED)) {
                        reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), new SubLObject[]{ $str189$_units_do_not_match__, format_nil.format_nil_s_no_copy(minuend_units), $$$_, format_nil.format_nil_s_no_copy(subtrahend_units) });
                    } else
                        if (!minuend.isNumber()) {
                            reason = cconcatenate($$$Minuend_, new SubLObject[]{ format_nil.format_nil_s_no_copy(minuend), $str192$_is_not_a_NUMBERP_ });
                        } else
                            if (!subtrahend.isNumber()) {
                                reason = cconcatenate($$$Subtrahend_, new SubLObject[]{ format_nil.format_nil_s_no_copy(subtrahend), $str192$_is_not_a_NUMBERP_ });
                            } else {
                                v_answer = subtract(minuend, subtrahend);
                                units = minuend_units;
                            }


                }
            } else
                if (((NIL != kb_utilities.kbeq($$InfixSlashDivideFn, expression_type)) || (NIL != kb_utilities.kbeq($$InfixDivideFn, expression_type))) || (NIL != kb_utilities.kbeq($$HorizontalDivideFn, expression_type))) {
                    thread.resetMultipleValues();
                    final SubLObject numerator = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                    final SubLObject numerator_units = thread.secondMultipleValue();
                    final SubLObject numerator_reason = thread.thirdMultipleValue();
                    final SubLObject numerator_first_expression_to_evaluate = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    final SubLObject denominator = math_expression_evaluate_int(cycl_utilities.nat_arg2(expression, UNPROVIDED));
                    final SubLObject denominator_units = thread.secondMultipleValue();
                    final SubLObject denominator_reason = thread.thirdMultipleValue();
                    final SubLObject denominator_first_expression_to_evaluate = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != numerator_reason) || (NIL != denominator_reason)) {
                        reason = math_expression_failed_evaluation_reasons_merge(numerator_reason, denominator_reason);
                    }
                    if (NIL == reason) {
                        v_answer = ((!numerator.isNumber()) || (!denominator.isNumber())) ? NIL : mod(numerator, denominator).isZero() ? round(divide(numerator, denominator), UNPROVIDED) : divide(numerator, denominator).numL(ONE_INTEGER) ? make_binary_formula($$SimpleFractionFn, numerator, denominator) : make_ternary_formula($$MixedFractionFn, round(divide(numerator, denominator), UNPROVIDED), mod(numerator, denominator), denominator);
                        units = czer_main.canonicalize_term(quantities.unit_quotient(numerator_units, denominator_units), UNPROVIDED);
                        first_expression_to_evaluate = (NIL != numerator_first_expression_to_evaluate) ? numerator_first_expression_to_evaluate : NIL != denominator_first_expression_to_evaluate ? denominator_first_expression_to_evaluate : expression;
                    }
                } else
                    if (NIL != kb_utilities.kbeq($$InfixPlusFn, expression_type)) {
                        SubLObject sub_answers = NIL;
                        SubLObject sub_unitss = NIL;
                        SubLObject sub_reasons = NIL;
                        SubLObject cdolist_list_var = cycl_utilities.nat_args(expression, UNPROVIDED);
                        SubLObject sub_expression = NIL;
                        sub_expression = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject sub_answer = math_expression_evaluate_int(sub_expression);
                            final SubLObject sub_units = thread.secondMultipleValue();
                            final SubLObject sub_reason = thread.thirdMultipleValue();
                            final SubLObject sub_first_expression_to_evaluate = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            sub_answers = cons(sub_answer, sub_answers);
                            sub_unitss = cons(sub_units, sub_unitss);
                            sub_reasons = cons(sub_reason, sub_reasons);
                            if (NIL == first_expression_to_evaluate) {
                                first_expression_to_evaluate = sub_first_expression_to_evaluate;
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            sub_expression = cdolist_list_var.first();
                        } 
                        if (NIL != find_if(STRINGP, sub_reasons, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            reason = string_utilities.bunge_with_string(list_utilities.find_all_if(STRINGP, sub_reasons, UNPROVIDED), $str200$__);
                        }
                        if (NIL == list_utilities.singletonP(list_utilities.fast_remove_duplicates(sub_unitss, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            reason = cconcatenate(format_nil.format_nil_s_no_copy(list_utilities.fast_remove_duplicates(sub_unitss, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), new SubLObject[]{ $str201$_has_mismatched_units__, format_nil.format_nil_s_no_copy(NIL) });
                        }
                        if ((NIL == reason) && (NIL != list_utilities.every_in_list(EXTENDED_NUMBER_P, sub_answers, UNPROVIDED))) {
                            SubLObject catch_this = NIL;
                            try {
                                thread.throwStack.push($UNEVALUATABLE);
                                v_answer = arithmetic.cyc_plus(sub_answers);
                                units = sub_unitss.first();
                            } catch (final Throwable ccatch_env_var) {
                                catch_this = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } else
                        if (((NIL != kb_utilities.kbeq($$ImplicitTimesFn, expression_type)) || (NIL != kb_utilities.kbeq($$InfixTimesFn, expression_type))) || (NIL != kb_utilities.kbeq($$InfixDottedTimesFn, expression_type))) {
                            SubLObject sub_answers = NIL;
                            SubLObject sub_unitss = NIL;
                            SubLObject sub_reasons = NIL;
                            SubLObject cdolist_list_var = cycl_utilities.nat_args(expression, UNPROVIDED);
                            SubLObject sub_expression = NIL;
                            sub_expression = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                thread.resetMultipleValues();
                                final SubLObject sub_answer = math_expression_evaluate_int(sub_expression);
                                final SubLObject sub_units = thread.secondMultipleValue();
                                final SubLObject sub_reason = thread.thirdMultipleValue();
                                final SubLObject sub_first_expression_to_evaluate = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                sub_answers = cons(sub_answer, sub_answers);
                                sub_unitss = cons(sub_units, sub_unitss);
                                sub_reasons = cons(sub_reason, sub_reasons);
                                if (NIL == first_expression_to_evaluate) {
                                    first_expression_to_evaluate = sub_first_expression_to_evaluate;
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                sub_expression = cdolist_list_var.first();
                            } 
                            if (NIL != find_if(STRINGP, sub_reasons, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                reason = string_utilities.bunge_with_string(list_utilities.find_all_if(STRINGP, sub_reasons, UNPROVIDED), $str200$__);
                            }
                            if (NIL == reason) {
                                if (NIL != list_utilities.every_in_list(NUMBERP, sub_answers, UNPROVIDED)) {
                                    v_answer = apply($sym207$_, sub_answers);
                                }
                                final SubLObject useful_units = remove($$Unity, sub_unitss, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != useful_units) {
                                    if (NIL != list_utilities.singletonP(useful_units)) {
                                        units = useful_units.first();
                                    } else {
                                        units = cons($$UnitProductFn, useful_units);
                                    }
                                }
                                if (NIL == first_expression_to_evaluate) {
                                    first_expression_to_evaluate = make_ternary_formula($$MathExpressionFn, nth(ONE_INTEGER, expression), expression_type, nth(TWO_INTEGER, expression));
                                }
                            }
                        } else
                            if (NIL != kb_utilities.kbeq($$AbsoluteValueExpressionFn, expression_type)) {
                                thread.resetMultipleValues();
                                final SubLObject sub_answer2 = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                                final SubLObject sub_units2 = thread.secondMultipleValue();
                                final SubLObject sub_reason2 = thread.thirdMultipleValue();
                                final SubLObject sub_first_expression_to_evaluate2 = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                v_answer = (sub_answer2.isNumber()) ? abs(sub_answer2) : sub_answer2;
                                units = sub_units2;
                                reason = sub_reason2;
                                first_expression_to_evaluate = (NIL != sub_first_expression_to_evaluate2) ? sub_first_expression_to_evaluate2 : expression;
                            } else
                                if (NIL != kb_utilities.kbeq($$PrefixMinusFn, expression_type)) {
                                    thread.resetMultipleValues();
                                    final SubLObject sub_answer2 = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                                    final SubLObject sub_units2 = thread.secondMultipleValue();
                                    final SubLObject sub_reason2 = thread.thirdMultipleValue();
                                    final SubLObject sub_first_expression_to_evaluate2 = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (sub_answer2.isNumber()) {
                                        v_answer = minus(sub_answer2);
                                        units = sub_units2;
                                        first_expression_to_evaluate = (NIL != sub_first_expression_to_evaluate2) ? sub_first_expression_to_evaluate2 : expression;
                                    } else {
                                        reason = sub_reason2;
                                    }
                                } else
                                    if (NIL != kb_utilities.kbeq($$ParenthesizedMathFn, expression_type)) {
                                        thread.resetMultipleValues();
                                        final SubLObject v_answer_$4 = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                                        final SubLObject units_$3 = thread.secondMultipleValue();
                                        final SubLObject reason_$6 = thread.thirdMultipleValue();
                                        final SubLObject first_expression_to_evaluate_$7 = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        v_answer = v_answer_$4;
                                        units = units_$3;
                                        reason = reason_$6;
                                        first_expression_to_evaluate = first_expression_to_evaluate_$7;
                                        if (first_expression_to_evaluate.equal(cycl_utilities.nat_arg1(expression, UNPROVIDED))) {
                                            first_expression_to_evaluate = expression;
                                        }
                                    } else
                                        if (NIL != kb_utilities.kbeq($$BracketedMathFn, expression_type)) {
                                            thread.resetMultipleValues();
                                            final SubLObject v_answer_$5 = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                                            final SubLObject units_$4 = thread.secondMultipleValue();
                                            final SubLObject reason_$7 = thread.thirdMultipleValue();
                                            final SubLObject first_expression_to_evaluate_$8 = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            v_answer = v_answer_$5;
                                            units = units_$4;
                                            reason = reason_$7;
                                            first_expression_to_evaluate = first_expression_to_evaluate_$8;
                                            if (first_expression_to_evaluate.equal(cycl_utilities.nat_arg1(expression, UNPROVIDED))) {
                                                first_expression_to_evaluate = expression;
                                            }
                                        } else
                                            if (NIL != kb_utilities.kbeq($$PowerExpressionFn, expression_type)) {
                                                thread.resetMultipleValues();
                                                final SubLObject base = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                                                final SubLObject base_units = thread.secondMultipleValue();
                                                final SubLObject base_reason = thread.thirdMultipleValue();
                                                final SubLObject base_first_expression_to_evaluate = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                thread.resetMultipleValues();
                                                final SubLObject exponent = math_expression_evaluate_int(cycl_utilities.nat_arg2(expression, UNPROVIDED));
                                                final SubLObject exponent_units = thread.secondMultipleValue();
                                                final SubLObject exponent_reason = thread.thirdMultipleValue();
                                                final SubLObject exponent_first_expression_to_evaluate = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != base_reason) || (NIL != exponent_reason)) {
                                                    reason = math_expression_failed_evaluation_reasons_merge(base_reason, exponent_reason);
                                                }
                                                if (NIL == reason) {
                                                    first_expression_to_evaluate = (NIL != exponent_first_expression_to_evaluate) ? exponent_first_expression_to_evaluate : NIL != base_first_expression_to_evaluate ? base_first_expression_to_evaluate : expression;
                                                    if (NIL == kb_utilities.kbeq($$Unity, exponent_units)) {
                                                        reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $$$_exponent_has_units);
                                                    } else {
                                                        v_answer = expt(base, exponent);
                                                        if (NIL != kb_utilities.kbeq($$Unity, base_units)) {
                                                            units = base_units;
                                                        } else
                                                            if (NIL != number_utilities.zero_number_p(exponent)) {
                                                                units = $$Unity;
                                                            } else
                                                                if (NIL != number_utilities.onep(exponent)) {
                                                                    units = base_units;
                                                                } else
                                                                    if (exponent.isInteger()) {
                                                                        units = cons($$UnitProductFn, make_list(exponent, base_units));
                                                                    } else {
                                                                        v_answer = NIL;
                                                                        reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $str212$_base_has_units_but_exponent_not_);
                                                                        first_expression_to_evaluate = NIL;
                                                                    }



                                                    }
                                                }
                                            } else
                                                if (NIL != kb_utilities.kbeq($$NthRootExpressionFn, expression_type)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject index = math_expression_evaluate_int(cycl_utilities.nat_arg1(expression, UNPROVIDED));
                                                    final SubLObject index_units = thread.secondMultipleValue();
                                                    final SubLObject index_reason = thread.thirdMultipleValue();
                                                    final SubLObject index_first_expression_to_evaluate = thread.fourthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    thread.resetMultipleValues();
                                                    final SubLObject radicand = math_expression_evaluate_int(cycl_utilities.nat_arg2(expression, UNPROVIDED));
                                                    final SubLObject radicand_units = thread.secondMultipleValue();
                                                    final SubLObject radicand_reason = thread.thirdMultipleValue();
                                                    final SubLObject radicand_first_expression_to_evaluate = thread.fourthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != index_reason) || (NIL != radicand_reason)) {
                                                        reason = math_expression_failed_evaluation_reasons_merge(index_reason, radicand_reason);
                                                    }
                                                    if (NIL == reason) {
                                                        first_expression_to_evaluate = (NIL != radicand_first_expression_to_evaluate) ? radicand_first_expression_to_evaluate : NIL != index_first_expression_to_evaluate ? index_first_expression_to_evaluate : expression;
                                                        if (NIL == kb_utilities.kbeq($$Unity, radicand_units)) {
                                                            reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $$$_radicand_has_units);
                                                        } else
                                                            if (NIL != number_utilities.zero_number_p(radicand)) {
                                                                reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $$$_radicand_is_zero);
                                                            } else {
                                                                v_answer = expt(radicand, divide(ONE_INTEGER, index));
                                                                if (NIL != kb_utilities.kbeq($$Unity, index_units)) {
                                                                    units = index_units;
                                                                } else
                                                                    if (NIL != number_utilities.onep(radicand)) {
                                                                        units = index_units;
                                                                    } else
                                                                        if (radicand.isInteger()) {
                                                                            v_answer = NIL;
                                                                            reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $str215$_index_has_units_but_nth_root_of_);
                                                                        } else {
                                                                            v_answer = NIL;
                                                                            reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $str216$_index_has_units_but_radicand_not);
                                                                            first_expression_to_evaluate = NIL;
                                                                        }


                                                            }

                                                    }
                                                } else
                                                    if (NIL != kb_utilities.kbeq($$MathExpressionFn, expression_type)) {
                                                        final SubLObject args = cycl_utilities.nat_args(expression, UNPROVIDED);
                                                        if (NIL != list_utilities.tripleP(args)) {
                                                            final SubLObject operator = cycl_utilities.nat_arg2(expression, UNPROVIDED);
                                                            final SubLObject arg1 = cycl_utilities.nat_arg1(expression, UNPROVIDED);
                                                            final SubLObject arg2 = cycl_utilities.nat_arg3(expression, UNPROVIDED);
                                                            thread.resetMultipleValues();
                                                            final SubLObject v_answer_$6 = math_expression_evaluate_int(list(operator, arg1, arg2));
                                                            final SubLObject units_$5 = thread.secondMultipleValue();
                                                            final SubLObject reason_$8 = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            v_answer = v_answer_$6;
                                                            units = units_$5;
                                                            reason = reason_$8;
                                                            if (NIL == reason) {
                                                                first_expression_to_evaluate = expression;
                                                            }
                                                        } else {
                                                            SubLObject position_of_highest_precedent_operator = NIL;
                                                            SubLObject highest_precedence = MINUS_ONE_INTEGER;
                                                            thread.resetMultipleValues();
                                                            final SubLObject elems = math_expression_elems_and_ops(expression);
                                                            final SubLObject ops = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL == first_expression_to_evaluate) {
                                                                SubLObject csome_list_var = elems;
                                                                SubLObject elem = NIL;
                                                                elem = csome_list_var.first();
                                                                while ((NIL == first_expression_to_evaluate) && (NIL != csome_list_var)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject sub_answer3 = math_expression_evaluate_int(elem);
                                                                    final SubLObject sub_units3 = thread.secondMultipleValue();
                                                                    final SubLObject sub_reason3 = thread.thirdMultipleValue();
                                                                    final SubLObject sub_first_expression_to_evaluate3 = thread.fourthMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    first_expression_to_evaluate = sub_first_expression_to_evaluate3;
                                                                    csome_list_var = csome_list_var.rest();
                                                                    elem = csome_list_var.first();
                                                                } 
                                                            }
                                                            SubLObject cdolist_list_var2 = ops;
                                                            SubLObject op = NIL;
                                                            op = cdolist_list_var2.first();
                                                            while (NIL != cdolist_list_var2) {
                                                                final SubLObject op_precedence = math_expression_infix_operator_precedence_rank(op);
                                                                if (op_precedence.numG(highest_precedence)) {
                                                                    highest_precedence = op_precedence;
                                                                    position_of_highest_precedent_operator = position(op, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                op = cdolist_list_var2.first();
                                                            } 
                                                            if (NIL == position_of_highest_precedent_operator) {
                                                                reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $str217$_could_not_find_any_operators_in_);
                                                            } else
                                                                if (ZERO_INTEGER.numE(position_of_highest_precedent_operator) || subtract(length(args), ONE_INTEGER).numE(position_of_highest_precedent_operator)) {
                                                                    reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $str218$_invalid_due_to_operation_as_firs);
                                                                } else {
                                                                    final SubLObject operator2 = nth(position_of_highest_precedent_operator, args);
                                                                    final SubLObject arg3 = nth(subtract(position_of_highest_precedent_operator, ONE_INTEGER), args);
                                                                    final SubLObject arg4 = nth(add(position_of_highest_precedent_operator, ONE_INTEGER), args);
                                                                    final SubLObject sub_expression2 = list($$MathExpressionFn, arg3, operator2, arg4);
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject sub_answer3 = math_expression_evaluate_int(sub_expression2);
                                                                    final SubLObject sub_units3 = thread.secondMultipleValue();
                                                                    final SubLObject sub_reason3 = thread.thirdMultipleValue();
                                                                    final SubLObject sub_first_expression_to_evaluate3 = thread.fourthMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (((NIL == sub_answer3) || (NIL == sub_units3)) || (NIL != sub_reason3)) {
                                                                        v_answer = NIL;
                                                                        reason = sub_reason3;
                                                                    }
                                                                    if (NIL == reason) {
                                                                        if (NIL == first_expression_to_evaluate) {
                                                                            first_expression_to_evaluate = (NIL != sub_first_expression_to_evaluate3) ? sub_first_expression_to_evaluate3 : make_ternary_formula($$MathExpressionFn, arg3, operator2, arg4);
                                                                        }
                                                                        final SubLObject sub_quant_fn = (NIL != kb_utilities.kbeq($$Unity, sub_units3)) ? make_unary_formula($$MathQuantFn, sub_answer3) : make_unary_formula($$MathQuantFn, make_unary_formula(sub_units3, sub_answer3));
                                                                        final SubLObject new_expression = list_utilities.substitute_sequence(list(sub_quant_fn), list(arg3, operator2, arg4), copy_list(expression));
                                                                        if (expression.equal(new_expression)) {
                                                                            reason = $str219$_S_was_not_solvable_by_sub_evalua;
                                                                        }
                                                                        if (NIL == reason) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject v_answer_$7 = math_expression_evaluate_int(new_expression);
                                                                            final SubLObject units_$6 = thread.secondMultipleValue();
                                                                            final SubLObject reason_$9 = thread.thirdMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            v_answer = v_answer_$7;
                                                                            units = units_$6;
                                                                            reason = reason_$9;
                                                                        }
                                                                    }
                                                                }

                                                        }
                                                    } else {
                                                        v_answer = NIL;
                                                        reason = cconcatenate(format_nil.format_nil_s_no_copy(expression), $$$_was_not_a_math_expression);
                                                    }











        if (NIL != units) {
            units = czer_main.canonicalize_term(units, UNPROVIDED);
        } else {
            units = $$Unity;
        }
        return values(v_answer, units, reason, first_expression_to_evaluate);
    }

    public static SubLObject math_expression_failed_evaluation_reasons_merge(final SubLObject reason1, final SubLObject reason2) {
        if ((NIL != reason1) && (NIL != reason2)) {
            return cconcatenate(reason1, new SubLObject[]{ $str200$__, reason2 });
        }
        if (NIL != reason1) {
            return reason1;
        }
        if (NIL != reason2) {
            return reason2;
        }
        return $$$Unknown_reason;
    }

    public static SubLObject math_expression_operand_quantity_type(final SubLObject expression) {
        return math_quant_value_type(math_expression_quant_value(expression));
    }

    public static SubLObject math_quant_value_type(final SubLObject value) {
        if (value.isCons()) {
            return value.first();
        }
        return $$Unity;
    }

    public static SubLObject test_removal_expressionisevaluatable_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_mathexpressionoperatorlist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject answers = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$MathExpressionFn)) {
            thread.resetMultipleValues();
            final SubLObject elems = math_expression_elems_and_ops(arg1);
            final SubLObject ops = thread.secondMultipleValue();
            thread.resetMultipleValues();
            answers = ops;
        }
        final SubLObject v_bindings = unification_utilities.term_unify(NIL != answers ? make_el_list(answers, UNPROVIDED) : $$TheEmptyList, arg2, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_mathexpressionoperatorlist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_mathexpressionoperatorcount_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject answers = NIL;
        if (NIL != cycl_grammar.cycl_nat_p(arg1)) {
            final SubLObject operator = cycl_utilities.nat_functor(arg1);
            if (NIL != kb_utilities.kbeq(operator, $$MathExpressionFn)) {
                thread.resetMultipleValues();
                final SubLObject elems = math_expression_elems_and_ops(arg1);
                final SubLObject ops = thread.secondMultipleValue();
                thread.resetMultipleValues();
                answers = ops;
            } else
                if ((((NIL != math_expression_infix_op_p(operator)) || (NIL != math_expression_enclosure_fn_p(operator))) || (NIL != math_expression_unary_prefix_op_p(operator))) || (NIL != math_expression_unary_surround_op_p(operator))) {
                    answers = list(operator);
                }

        }
        final SubLObject v_bindings = unification_utilities.term_unify(length(answers), arg2, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_mathexpressionoperatorcount_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject math_expression_elems_and_ops(final SubLObject expression) {
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = cycl_utilities.nat_args(expression, UNPROVIDED);
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if (NIL != oddp(elem_or_op_pos)) {
                    ops = cons(elem_or_op, ops);
                } else {
                    elems = cons(elem_or_op, elems);
                }
            }
            if ((NIL != list_utilities.every_in_list(MATH_EXPRESSION_INFIX_OP_P, ops, UNPROVIDED)) && (NIL != list_utilities.not_any_in_list(MATH_EXPRESSION_INFIX_OP_P, elems, UNPROVIDED))) {
                return values(nreverse(elems), nreverse(ops));
            }
        }
        if (NIL != math_expression_p(expression)) {
            return values(copy_list(cycl_utilities.nat_args(expression, UNPROVIDED)), list(cycl_utilities.nat_functor(expression)));
        }
        return values(NIL, NIL);
    }

    public static SubLObject make_math_expression(final SubLObject elems, final SubLObject ops) {
        SubLObject result = NIL;
        SubLObject elem = NIL;
        SubLObject elem_$18 = NIL;
        SubLObject op = NIL;
        SubLObject op_$19 = NIL;
        elem = elems;
        elem_$18 = elem.first();
        op = ops;
        op_$19 = op.first();
        while ((NIL != op) || (NIL != elem)) {
            result = cons(elem_$18, result);
            if (NIL != op_$19) {
                result = cons(op_$19, result);
            }
            elem = elem.rest();
            elem_$18 = elem.first();
            op = op.rest();
            op_$19 = op.first();
        } 
        result = cons($$MathExpressionFn, nreverse(result));
        return result;
    }

    public static SubLObject math_expression_elems_and_ops_for_additions_and_subtractions(final SubLObject expression) {
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject add_subtract_op_nums = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = expression;
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if ((NIL != evenp(elem_or_op_pos)) && (NIL != math_expression_addition_or_subtraction_op_p(elem_or_op))) {
                    add_subtract_op_nums = cons(elem_or_op_pos, add_subtract_op_nums);
                }
            }
            add_subtract_op_nums = nreverse(add_subtract_op_nums);
            if (NIL == add_subtract_op_nums) {
                return values(list(expression), NIL);
            }
            SubLObject start_pos = ONE_INTEGER;
            SubLObject cdotimes_end_var;
            SubLObject n;
            SubLObject op_pos;
            SubLObject end_pos;
            SubLObject expression_args;
            for (cdotimes_end_var = add(ONE_INTEGER, length(add_subtract_op_nums)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                op_pos = nth(n, add_subtract_op_nums);
                end_pos = (NIL != op_pos) ? subtract(op_pos, ONE_INTEGER) : subtract(length(expression), ONE_INTEGER);
                expression_args = subseq(expression, start_pos, add(end_pos, ONE_INTEGER));
                if (NIL != list_utilities.singletonP(expression_args)) {
                    elems = cons(expression_args.first(), elems);
                } else {
                    elems = cons(cons($$MathExpressionFn, expression_args), elems);
                }
                if (NIL != op_pos) {
                    ops = cons(nth(op_pos, expression), ops);
                    start_pos = add(ONE_INTEGER, op_pos);
                }
            }
            return values(nreverse(elems), nreverse(ops));
        } else {
            if (NIL != math_addition_or_subtraction_expressionP(expression)) {
                return values(copy_list(cycl_utilities.nat_args(expression, UNPROVIDED)), list(cycl_utilities.nat_functor(expression)));
            }
            return values(list(expression), NIL);
        }
    }

    public static SubLObject math_expression_elems_and_ops_for_addition(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_elems = NIL;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops_for_additions_and_subtractions(expression);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_elems = cons(elems.first(), result_elems);
        SubLObject elem = NIL;
        SubLObject elem_$20 = NIL;
        SubLObject op = NIL;
        SubLObject op_$21 = NIL;
        elem = elems.rest();
        elem_$20 = elem.first();
        op = ops;
        op_$21 = op.first();
        while ((NIL != op) || (NIL != elem)) {
            if (NIL != math_expression_addition_op_p(op_$21)) {
                result_elems = cons(list($$PrefixMinusFn, elem_$20), result_elems);
            } else {
                result_elems = cons(elem_$20, result_elems);
            }
            elem = elem.rest();
            elem_$20 = elem.first();
            op = op.rest();
            op_$21 = op.first();
        } 
        return subl_promotions.values2(nreverse(result_elems), make_list(length(ops), $$InfixPlusFn));
    }

    public static SubLObject math_expression_elems_and_ops_for_multiplication_and_division(final SubLObject expression) {
        if (NIL != cycl_utilities.naut_with_functor_p(expression, $$MathExpressionFn)) {
            SubLObject elems = NIL;
            SubLObject ops = NIL;
            SubLObject add_subtract_op_nums = NIL;
            SubLObject multiply_or_divide_op_nums = NIL;
            SubLObject list_var = NIL;
            SubLObject elem_or_op = NIL;
            SubLObject elem_or_op_pos = NIL;
            list_var = expression;
            elem_or_op = list_var.first();
            for (elem_or_op_pos = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_or_op = list_var.first() , elem_or_op_pos = add(ONE_INTEGER, elem_or_op_pos)) {
                if (NIL != evenp(elem_or_op_pos)) {
                    if (NIL != math_expression_addition_or_subtraction_op_p(elem_or_op)) {
                        add_subtract_op_nums = cons(elem_or_op_pos, add_subtract_op_nums);
                    }
                    if (NIL != math_expression_multiplication_or_divide_op_p(elem_or_op)) {
                        multiply_or_divide_op_nums = cons(elem_or_op_pos, multiply_or_divide_op_nums);
                    }
                }
            }
            if (NIL != add_subtract_op_nums) {
                return values(list(expression), NIL);
            }
            multiply_or_divide_op_nums = nreverse(multiply_or_divide_op_nums);
            if (NIL == multiply_or_divide_op_nums) {
                return values(list(expression), NIL);
            }
            SubLObject start_pos = ONE_INTEGER;
            SubLObject cdotimes_end_var;
            SubLObject n;
            SubLObject op_pos;
            SubLObject end_pos;
            SubLObject expression_args;
            for (cdotimes_end_var = add(ONE_INTEGER, length(multiply_or_divide_op_nums)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                op_pos = nth(n, multiply_or_divide_op_nums);
                end_pos = (NIL != op_pos) ? subtract(op_pos, ONE_INTEGER) : subtract(length(expression), ONE_INTEGER);
                expression_args = subseq(expression, start_pos, add(end_pos, ONE_INTEGER));
                if (NIL != list_utilities.singletonP(expression_args)) {
                    elems = cons(expression_args.first(), elems);
                } else {
                    elems = cons(cons($$MathExpressionFn, expression_args), elems);
                }
                if (NIL != op_pos) {
                    ops = cons(nth(op_pos, expression), ops);
                    start_pos = add(ONE_INTEGER, op_pos);
                }
            }
            return values(nreverse(elems), nreverse(ops));
        } else {
            if (NIL != math_multiplication_or_division_expressionP(expression)) {
                return values(copy_list(cycl_utilities.nat_args(expression, UNPROVIDED)), list(cycl_utilities.nat_functor(expression)));
            }
            return values(list(expression), NIL);
        }
    }

    public static SubLObject math_expression_elems_and_ops_for_multiplication(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_elems = NIL;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops_for_multiplication_and_division(expression);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_elems = cons(elems.first(), result_elems);
        SubLObject elem = NIL;
        SubLObject elem_$22 = NIL;
        SubLObject op = NIL;
        SubLObject op_$23 = NIL;
        elem = elems.rest();
        elem_$22 = elem.first();
        op = ops;
        op_$23 = op.first();
        while ((NIL != op) || (NIL != elem)) {
            if (NIL != math_expression_division_op_p(op_$23)) {
                result_elems = cons(list($$InfixDivideFn, ONE_INTEGER, elem_$22), result_elems);
            } else {
                result_elems = cons(elem_$22, result_elems);
            }
            elem = elem.rest();
            elem_$22 = elem.first();
            op = op.rest();
            op_$23 = op.first();
        } 
        return subl_promotions.values2(nreverse(result_elems), make_list(length(ops), $$InfixTimesFn));
    }

    public static SubLObject removal_mathexpressionoperator_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != cycl_grammar.cycl_nat_p(arg1)) {
            v_answer = math_expression_operator(arg1);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_operator(final SubLObject expression) {
        SubLObject v_answer = NIL;
        final SubLObject operator = cycl_utilities.nat_functor(expression);
        if ((((NIL != math_expression_infix_op_p(operator)) || (NIL != math_expression_enclosure_fn_p(operator))) || (NIL != math_expression_unary_prefix_op_p(operator))) || (NIL != math_expression_unary_surround_op_p(operator))) {
            v_answer = operator;
        }
        if ((NIL != kb_utilities.kbeq(operator, $$MathExpressionFn)) && (NIL != formula_arityE(expression, THREE_INTEGER, UNPROVIDED))) {
            v_answer = cycl_utilities.formula_arg2(expression, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject test_removal_mathexpressionoperator_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_leftsideofmathematicalstatement_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if ((NIL != cycl_grammar.cycl_nat_p(arg1)) && (NIL != math_statement_expressionP(arg1))) {
            v_answer = cycl_utilities.formula_arg1(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_leftsideofmathematicalstatement_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_rightsideofmathematicalstatement_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if ((NIL != cycl_grammar.cycl_nat_p(arg1)) && (NIL != math_statement_expressionP(arg1))) {
            v_answer = cycl_utilities.formula_arg2(arg1, UNPROVIDED);
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_rightsideofmathematicalstatement_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_likemathterms_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = like_math_termsP(arg1, arg2, UNPROVIDED);
        if (NIL != v_answer) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject like_fractionsP(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject catch_this = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            result = arithmetic.cyc_numerically_equal(removal_modules_fractions.el_fraction_denominator(fraction1, UNPROVIDED), removal_modules_fractions.el_fraction_denominator(fraction2, UNPROVIDED));
        } catch (final Throwable ccatch_env_var) {
            catch_this = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static SubLObject like_math_termsP(final SubLObject term1, final SubLObject term2, SubLObject comparableP) {
        if (comparableP == UNPROVIDED) {
            comparableP = NIL;
        }
        return list_utilities.sublisp_boolean(why_like_math_termsP(term1, term2, comparableP));
    }

    public static SubLObject normalize_term_for_like_math_terms(final SubLObject v_term) {
        if (((NIL != math_expression_unary_surround_op_p(v_term)) || (NIL != math_enclosed_math_expressionP(v_term))) || (NIL != math_expression_minus_quant_fn_p(v_term))) {
            return cycl_utilities.nat_arg1(v_term, UNPROVIDED);
        }
        return v_term;
    }

    public static SubLObject why_like_math_termsP(SubLObject term1, SubLObject term2, SubLObject comparableP) {
        if (comparableP == UNPROVIDED) {
            comparableP = NIL;
        }
        term1 = normalize_term_for_like_math_terms(term1);
        term2 = normalize_term_for_like_math_terms(term2);
        SubLObject reason = NIL;
        if (NIL != cycl_utilities.naut_with_functor_p(term1, $$PrefixMinusFn)) {
            return why_like_math_termsP(second(term1), term2, UNPROVIDED);
        }
        if (NIL != cycl_utilities.naut_with_functor_p(term2, $$PrefixMinusFn)) {
            return why_like_math_termsP(term1, second(term2), UNPROVIDED);
        }
        if ((NIL != math_expression_var_p(term1)) && (NIL != math_expression_var_p(term2))) {
            if (term1.equal(term2)) {
                reason = list(term1);
            }
        } else
            if ((NIL != time_expression_fn_p(term1)) && (NIL != time_expression_fn_p(term2))) {
                reason = list($$TimeExpressionFn);
            } else
                if (((NIL == comparableP) && (NIL != math_expression_quant_fn_p(term1))) && (NIL != math_expression_quant_fn_p(term2))) {
                    final SubLObject units1 = quantities.explode_interval_ignoring_unevaluatable(cycl_utilities.nat_arg1(term1, UNPROVIDED));
                    final SubLObject units2 = quantities.explode_interval_ignoring_unevaluatable(cycl_utilities.nat_arg1(term2, UNPROVIDED));
                    if (units1.equal(units2)) {
                        reason = list(units1);
                    }
                } else
                    if (((NIL != comparableP) && (NIL != math_expression_quant_fn_p(term1))) && (NIL != math_expression_quant_fn_p(term2))) {
                        final SubLObject units1 = quantities.explode_interval_ignoring_unevaluatable(cycl_utilities.nat_arg1(term1, UNPROVIDED));
                        final SubLObject units2 = quantities.explode_interval_ignoring_unevaluatable(cycl_utilities.nat_arg1(term2, UNPROVIDED));
                        if (NIL != quantities.term_unify_with_units(make_unary_formula(units1, variables.get_variable(ZERO_INTEGER)), make_unary_formula(units2, ONE_INTEGER))) {
                            reason = (NIL != kb_utilities.term_L(units1, units2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? list(units1) : list(units2);
                        }
                    } else
                        if ((NIL != math_multiplication_expressionP(term1)) && (NIL != math_multiplication_expressionP(term2))) {
                            reason = why_like_math_terms_listsP(math_expression_elems_and_ops(term1), math_expression_elems_and_ops(term2), comparableP);
                        } else
                            if (NIL != math_multiplication_expressionP(term1)) {
                                final SubLObject term1_simplified = simplify_math_expression_multiplication_term_for_like_terms(term1);
                                if (!term1.equal(term1_simplified)) {
                                    reason = why_like_math_termsP(term1_simplified, term2, UNPROVIDED);
                                }
                            } else
                                if (NIL != math_multiplication_expressionP(term2)) {
                                    final SubLObject term2_simplified = simplify_math_expression_multiplication_term_for_like_terms(term2);
                                    if (!term2.equal(term2_simplified)) {
                                        reason = why_like_math_termsP(term1, term2_simplified, UNPROVIDED);
                                    }
                                } else
                                    if ((NIL != math_division_expressionP(term1)) && (NIL != math_division_expressionP(term2))) {
                                        final SubLObject term1_elems = math_expression_elems_and_ops(term1);
                                        final SubLObject term2_elems = math_expression_elems_and_ops(term2);
                                        final SubLObject numerator_reason = why_like_math_termsP(term1_elems.first(), term2_elems.first(), UNPROVIDED);
                                        final SubLObject denominator_reason = why_like_math_termsP(second(term1_elems), second(term2_elems), UNPROVIDED);
                                        if ((NIL != numerator_reason) && (NIL != denominator_reason)) {
                                            reason = quantities.unit_quotient(numerator_reason, denominator_reason);
                                        }
                                    } else
                                        if (NIL != math_division_expressionP(term1)) {
                                            if (NIL != math_expression_quant_fn_p(cycl_utilities.nat_arg2(term1, UNPROVIDED))) {
                                                reason = why_like_math_termsP(cycl_utilities.nat_arg1(term1, UNPROVIDED), term2, UNPROVIDED);
                                            }
                                        } else
                                            if (NIL != math_division_expressionP(term2)) {
                                                if (NIL != math_expression_quant_fn_p(cycl_utilities.nat_arg2(term2, UNPROVIDED))) {
                                                    reason = why_like_math_termsP(term1, cycl_utilities.nat_arg1(term2, UNPROVIDED), UNPROVIDED);
                                                }
                                            } else
                                                if ((NIL != math_exponentiation_expressionP(term1)) && (NIL != math_exponentiation_expressionP(term2))) {
                                                    final SubLObject term1_elems = math_expression_elems_and_ops(term1);
                                                    final SubLObject term2_elems = math_expression_elems_and_ops(term2);
                                                    final SubLObject possible_reason = why_like_math_termsP(term1_elems.first(), term2_elems.first(), UNPROVIDED);
                                                    if ((NIL != possible_reason) && second(term1_elems).equal(second(term2_elems))) {
                                                        reason = possible_reason;
                                                    }
                                                } else
                                                    if ((NIL != math_nth_root_expressionP(term1)) && (NIL != math_nth_root_expressionP(term2))) {
                                                        final SubLObject term1_elems = math_expression_elems_and_ops(term1);
                                                        final SubLObject term2_elems = math_expression_elems_and_ops(term2);
                                                        final SubLObject possible_reason = why_like_math_termsP(term1_elems.first(), term2_elems.first(), UNPROVIDED);
                                                        if ((NIL != possible_reason) && (NIL != why_like_math_termsP(second(term1_elems), second(term2_elems), UNPROVIDED))) {
                                                            reason = possible_reason;
                                                        }
                                                    }











        return reason;
    }

    public static SubLObject like_math_terms_listsP(final SubLObject term1_list, final SubLObject term2_list, SubLObject comparableP) {
        if (comparableP == UNPROVIDED) {
            comparableP = NIL;
        }
        return list_utilities.sublisp_boolean(why_like_math_terms_listsP(term1_list, term2_list, comparableP));
    }

    public static SubLObject why_like_math_terms_listsP(SubLObject term1_list, SubLObject term2_list, SubLObject comparableP) {
        if (comparableP == UNPROVIDED) {
            comparableP = NIL;
        }
        final SubLObject term1_list_quant_fns = list_utilities.find_all_if(MATH_EXPRESSION_QUANT_FN_P, term1_list, UNPROVIDED);
        final SubLObject term2_list_quant_fns = list_utilities.find_all_if(MATH_EXPRESSION_QUANT_FN_P, term2_list, UNPROVIDED);
        SubLObject reasons = NIL;
        term1_list = set_difference(term1_list, term1_list_quant_fns, symbol_function(EQUAL), UNPROVIDED);
        term2_list = set_difference(term2_list, term2_list_quant_fns, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject term1_list_units = Mapping.mapcar(EXPLODE_INTERVAL_IGNORING_UNEVALUATABLE, Mapping.mapcar(MATH_EXPRESSION_QUANT_VALUE, term1_list_quant_fns));
        final SubLObject term2_list_units = Mapping.mapcar(EXPLODE_INTERVAL_IGNORING_UNEVALUATABLE, Mapping.mapcar(MATH_EXPRESSION_QUANT_VALUE, term2_list_quant_fns));
        if ((NIL == comparableP) && (NIL == list_utilities.sets_equalP(remove($$Unity, term1_list_units, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), remove($$Unity, term2_list_units, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED))) {
            return NIL;
        }
        reasons = term1_list_units;
        if ((NIL != comparableP) && (NIL == quantities.convert_to_units(NIL == term1_list_units ? $$Unity : NIL != list_utilities.singletonP(term1_list_units) ? term1_list_units.first() : cons($$UnitProductFn, term1_list_units), NIL == term2_list_units ? $$Unity : NIL != list_utilities.singletonP(term2_list_units) ? term2_list_units.first() : cons($$UnitProductFn, term2_list_units), ONE_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == list_utilities.same_length_p(term1_list, term2_list)) {
            return NIL;
        }
        SubLObject matched_term1_nums = NIL;
        SubLObject matched_term2_nums = NIL;
        SubLObject list_var = NIL;
        SubLObject term1 = NIL;
        SubLObject term1_num = NIL;
        list_var = term1_list;
        term1 = list_var.first();
        for (term1_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , term1 = list_var.first() , term1_num = add(ONE_INTEGER, term1_num)) {
            SubLObject list_var_$24 = NIL;
            SubLObject term2 = NIL;
            SubLObject term2_num = NIL;
            list_var_$24 = term2_list;
            term2 = list_var_$24.first();
            for (term2_num = ZERO_INTEGER; NIL != list_var_$24; list_var_$24 = list_var_$24.rest() , term2 = list_var_$24.first() , term2_num = add(ONE_INTEGER, term2_num)) {
                final SubLObject this_reason = why_like_math_termsP(term1, term2, UNPROVIDED);
                if (NIL != this_reason) {
                    final SubLObject items_var = this_reason;
                    if (items_var.isVector()) {
                        final SubLObject vector_var = items_var;
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject item_var;
                        SubLObject item;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            item = item_var = aref(vector_var, element_num);
                            if (NIL == member(item_var, reasons, EQUAL, symbol_function(IDENTITY))) {
                                reasons = cons(item_var, reasons);
                            }
                        }
                    } else {
                        SubLObject cdolist_list_var = items_var;
                        SubLObject item2 = NIL;
                        item2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject item_var2 = item2;
                            if (NIL == member(item_var2, reasons, EQUAL, symbol_function(IDENTITY))) {
                                reasons = cons(item_var2, reasons);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            item2 = cdolist_list_var.first();
                        } 
                    }
                    SubLObject item_var3 = term1_num;
                    if (NIL == member(item_var3, matched_term1_nums, symbol_function(EQL), symbol_function(IDENTITY))) {
                        matched_term1_nums = cons(item_var3, matched_term1_nums);
                    }
                    item_var3 = term2_num;
                    if (NIL == member(item_var3, matched_term2_nums, symbol_function(EQL), symbol_function(IDENTITY))) {
                        matched_term2_nums = cons(item_var3, matched_term2_nums);
                    }
                }
            }
        }
        if ((NIL != list_utilities.same_length_p(term1_list, matched_term1_nums)) && (NIL != list_utilities.same_length_p(term2_list, matched_term2_nums))) {
            return reasons;
        }
        return NIL;
    }

    public static SubLObject simplify_math_expression_multiplication_term_for_like_terms(final SubLObject v_term) {
        if (NIL != math_multiplication_expressionP(v_term)) {
            final SubLObject args = remove_if(MATH_EXPRESSION_QUANT_FN_P, math_expression_elems_and_ops(v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.singletonP(args)) {
                return args.first();
            }
        }
        return v_term;
    }

    public static SubLObject test_removal_likemathterms_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_unlikemathterms_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = makeBoolean(NIL == like_math_termsP(arg1, arg2, UNPROVIDED));
        if (NIL != v_answer) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_simplifiablemathexpression_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = makeBoolean(NIL == unsimplifiable_math_expressionP(arg1));
        if (NIL != v_answer) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_unsimplifiablemathexpression_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = unsimplifiable_math_expressionP(arg1);
        if (NIL != v_answer) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject unsimplifiable_math_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != math_expression_is_evaluatableP(expression)) {
            return NIL;
        }
        if (NIL != math_expression_quant_fn_or_minus_quant_fn_p(expression)) {
            return $EXPRESSION_IS_A_MATH_QUANTITY;
        }
        thread.resetMultipleValues();
        SubLObject elems = math_expression_elems_and_ops_for_additions_and_subtractions(expression);
        SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject elem = NIL;
        SubLObject elem_$25 = NIL;
        SubLObject op = NIL;
        SubLObject op_$26 = NIL;
        elem = elems.rest();
        elem_$25 = elem.first();
        op = ops;
        op_$26 = op.first();
        while ((NIL != op) || (NIL != elem)) {
            if ((NIL != cycl_utilities.naut_with_functor_p(elem_$25, $$PrefixMinusFn)) || ((NIL != math_expression_quant_fn_p(elem_$25)) && (NIL != extended_numbers.extended_number_minus_p(math_expression_quant_value(elem_$25))))) {
                return NIL;
            }
            elem = elem.rest();
            elem_$25 = elem.first();
            op = op.rest();
            op_$26 = op.first();
        } 
        if ((NIL != cycl_utilities.naut_with_functor_p(expression, $$PrefixMinusFn)) && (NIL != unsimplifiable_math_expressionP(cycl_utilities.atomic_sentence_arg1(expression, UNPROVIDED)))) {
            return $EXPRESSION_IS_A_NEGATED_UNSIMPLIFIABLE_EXPRESSION;
        }
        thread.resetMultipleValues();
        elems = math_expression_elems_and_ops(expression);
        ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.singletonP(ops)) {
            final SubLObject operator = math_expression_operator(expression);
            ops = list(operator);
            if (NIL != math_expression_division_op_p(operator)) {
                final SubLObject numerator = elems.first();
                final SubLObject denominator = second(elems);
                thread.resetMultipleValues();
                final SubLObject numerator_elems = math_expression_elems_and_ops_for_multiplication_and_division(numerator);
                final SubLObject numerator_ops = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject denominator_elems = math_expression_elems_and_ops_for_multiplication_and_division(denominator);
                final SubLObject denominator_ops = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (((NIL != list_utilities.every_in_list(MATH_EXPRESSION_MULTIPLICATION_OP_P, numerator_ops, UNPROVIDED)) && (NIL != list_utilities.every_in_list(MATH_EXPRESSION_MULTIPLICATION_OP_P, denominator_ops, UNPROVIDED))) && (NIL != intersection(numerator_elems, denominator_elems, symbol_function(EQUAL), UNPROVIDED))) {
                    return NIL;
                }
            }
            if ((((NIL != math_expression_multiplication_op_p(operator)) || (NIL != math_expression_division_op_p(operator))) || (NIL != math_expression_exponentiation_op_p(operator))) || (NIL != math_expression_nth_root_op_p(operator))) {
                elems = copy_list(cycl_utilities.nat_args(expression, UNPROVIDED));
                if (ONE_INTEGER.numL(count_if(MATH_EXPRESSION_QUANT_FN_P, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    return NIL;
                }
            }
        }
        if (length(ops).numE(add(count_if(MATH_EXPRESSION_ADDITION_OP_P, ops, UNPROVIDED, UNPROVIDED, UNPROVIDED), count_if(MATH_EXPRESSION_SUBTRACTION_OP_P, ops, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            SubLObject some_like_term_pair_foundP = NIL;
            SubLObject list_var = NIL;
            SubLObject term1 = NIL;
            SubLObject term1_num = NIL;
            list_var = elems;
            term1 = list_var.first();
            for (term1_num = ZERO_INTEGER; (NIL == some_like_term_pair_foundP) && (NIL != list_var); list_var = list_var.rest() , term1 = list_var.first() , term1_num = add(ONE_INTEGER, term1_num)) {
                SubLObject list_var_$27 = NIL;
                SubLObject term2 = NIL;
                SubLObject term2_num = NIL;
                list_var_$27 = elems;
                term2 = list_var_$27.first();
                for (term2_num = ZERO_INTEGER; (NIL == some_like_term_pair_foundP) && (NIL != list_var_$27); list_var_$27 = list_var_$27.rest() , term2 = list_var_$27.first() , term2_num = add(ONE_INTEGER, term2_num)) {
                    if ((!term1_num.numE(term2_num)) && (NIL != like_math_terms_for_simplificationP(term1, term2))) {
                        some_like_term_pair_foundP = T;
                    }
                }
            }
            if (NIL != some_like_term_pair_foundP) {
                return NIL;
            }
        }
        if (NIL == list_utilities.find_if_not($sym272$UNSIMPLIFIABLE_MATH_EXPRESSION_, sub_math_expressions_direct(expression), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $ALL_SUB_EXPRESSIONS_ARE_UNSIMPLIFIABLE;
        }
        if (NIL == sub_math_expressions_direct(expression)) {
            return $EXPRESSION_HAS_NO_DIRECT_SUB_MATH_EXPRESSION;
        }
        return NIL;
    }

    public static SubLObject like_math_terms_for_simplificationP(final SubLObject term1, final SubLObject term2) {
        return makeBoolean(((NIL != math_expression_zero_quant_value(term1)) || (NIL != math_expression_zero_quant_value(term2))) || (NIL != like_math_termsP(term1, term2, UNPROVIDED)));
    }

    public static SubLObject test_removal_unsimplifiablemathexpression_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject test_removal_simplifiablemathexpression_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject math_equals_statementP(final SubLObject expression) {
        return cycl_utilities.nat_with_functor_p(expression, $$MathEqualsStatementFn);
    }

    public static SubLObject math_equation_univariate_linearP(final SubLObject expression) {
        if (NIL != math_equals_statementP(expression)) {
            final SubLObject lhs = cycl_utilities.nat_arg1(expression, UNPROVIDED);
            final SubLObject rhs = cycl_utilities.nat_arg2(expression, UNPROVIDED);
            final SubLObject lhs_vars = cycl_utilities.expression_gather(lhs, MATH_EXPRESSION_VAR_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject rhs_vars = cycl_utilities.expression_gather(rhs, MATH_EXPRESSION_VAR_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject lhs_univariate_linearP = math_expression_univariate_linearP(lhs);
            final SubLObject rhs_univariate_linearP = math_expression_univariate_linearP(rhs);
            if ((((((NIL == lhs_vars) || (NIL == rhs_vars)) || (NIL != list_utilities.sets_equalP(lhs_vars, rhs_vars, UNPROVIDED))) && ((NIL != lhs_univariate_linearP) || (NIL != rhs_univariate_linearP))) && ((NIL == lhs_vars) || (NIL != lhs_univariate_linearP))) && ((NIL == rhs_vars) || (NIL != rhs_univariate_linearP))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_univariate_linearP(final SubLObject expression) {
        final SubLObject v_variables = cycl_utilities.expression_gather(expression, MATH_EXPRESSION_VAR_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(v_variables)) {
            final SubLObject variable = v_variables.first();
            SubLObject current;
            final SubLObject datum = current = list_utilities.tree_positions_w_parents(variable, expression, symbol_function(EQUAL));
            SubLObject positions = NIL;
            SubLObject root_nodes = NIL;
            destructuring_bind_must_consp(current, datum, $list280);
            positions = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list280);
            root_nodes = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject n = NIL;
                SubLObject n_$28 = NIL;
                SubLObject op = NIL;
                SubLObject op_$29 = NIL;
                n = positions.first();
                n_$28 = n.first();
                op = root_nodes.first();
                op_$29 = op.first();
                while ((NIL != op) || (NIL != n)) {
                    if (n_$28.eql(ONE_INTEGER) && (NIL != math_expression_exponentiation_op_p(op_$29))) {
                        return NIL;
                    }
                    if (n_$28.eql(TWO_INTEGER) && (NIL != math_expression_division_op_p(op_$29))) {
                        return NIL;
                    }
                    n = n.rest();
                    n_$28 = n.first();
                    op = op.rest();
                    op_$29 = op.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list280);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject removal_comparablemathterms_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = like_math_termsP(arg1, arg2, T);
        if (NIL != v_answer) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_comparablemathterms_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_likemathtermsonoppositesides_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        if (NIL != math_statement_expressionP(arg1)) {
            final SubLObject lhs = cycl_utilities.nat_arg1(arg1, UNPROVIDED);
            final SubLObject rhs = cycl_utilities.nat_arg2(arg1, UNPROVIDED);
            if (NIL == v_answer) {
                SubLObject csome_list_var = math_expression_elems_and_ops_for_additions_and_subtractions(lhs);
                SubLObject lhs_term = NIL;
                lhs_term = csome_list_var.first();
                while ((NIL == v_answer) && (NIL != csome_list_var)) {
                    if (NIL == v_answer) {
                        SubLObject csome_list_var_$30;
                        SubLObject rhs_term;
                        for (csome_list_var_$30 = math_expression_elems_and_ops_for_additions_and_subtractions(rhs), rhs_term = NIL, rhs_term = csome_list_var_$30.first(); (NIL == v_answer) && (NIL != csome_list_var_$30); v_answer = like_math_termsP(lhs_term, rhs_term, UNPROVIDED) , csome_list_var_$30 = csome_list_var_$30.rest() , rhs_term = csome_list_var_$30.first()) {
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    lhs_term = csome_list_var.first();
                } 
            }
        }
        if (NIL != v_answer) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_likemathtermsonoppositesides_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject apply_operation_to_math_statement(final SubLObject statement, final SubLObject operation, final SubLObject v_term) {
        if ((NIL != isa.isa_in_any_mtP(operation, $const293$SingleOperationTypeMathTransforma)) && (NIL != math_statement_expressionP(statement))) {
            final SubLObject lhs = apply_operation_to_math_expression(cycl_utilities.nat_arg1(statement, UNPROVIDED), operation, v_term);
            final SubLObject rhs = apply_operation_to_math_expression(cycl_utilities.nat_arg2(statement, UNPROVIDED), operation, v_term);
            if ((NIL != lhs) && (NIL != rhs)) {
                return make_binary_formula(cycl_utilities.nat_functor(statement), lhs, rhs);
            }
        }
        return NIL;
    }

    public static SubLObject apply_operation_to_math_expression(final SubLObject expression, final SubLObject operation, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != math_expression_p(expression)) {
            if ((NIL != kb_utilities.kbeq(operation, $$AddTermToBothSidesOfMathStatement)) || (NIL != kb_utilities.kbeq(operation, $const295$SubtractTermFromBothSidesOfMathSt))) {
                final SubLObject op_to_add = (NIL != kb_utilities.kbeq(operation, $$AddTermToBothSidesOfMathStatement)) ? $$InfixPlusFn : $$InfixMinusFn;
                SubLObject elems = NIL;
                SubLObject ops = NIL;
                thread.resetMultipleValues();
                final SubLObject elems_$31 = math_expression_elems_and_ops_for_additions_and_subtractions(expression);
                final SubLObject ops_$32 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                elems = elems_$31;
                ops = ops_$32;
                SubLObject term_position = position(v_term, elems, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject minus_term_position = position(list($$PrefixMinusFn, v_term), elems, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != minus_term_position) {
                    term_position = minus_term_position;
                }
                if ((NIL == term_position) && (NIL != math_expression_quant_fn_p(v_term))) {
                    term_position = list_utilities.last_one(list_utilities.all_positions(T, elems, symbol_function(EQ), MATH_EXPRESSION_QUANT_FN_OR_MINUS_QUANT_FN_P, UNPROVIDED));
                }
                if ((NIL == term_position) || (NIL != list_utilities.singletonP(elems))) {
                    elems = list_utilities.add_to_end(v_term, elems);
                    ops = list_utilities.add_to_end(op_to_add, ops);
                } else
                    if ((NIL != kb_utilities.kbeq(operation, $const295$SubtractTermFromBothSidesOfMathSt)) || ((!v_term.equal(nth(term_position, elems))) && (!list($$PrefixMinusFn, v_term).equal(nth(term_position, elems))))) {
                        elems = list_utilities.ninsert_by_position(v_term, elems, add(term_position, ONE_INTEGER));
                        ops = list_utilities.ninsert_by_position(op_to_add, ops, term_position);
                    } else {
                        if (NIL == term_position) {
                            term_position = length(elems);
                        }
                        final SubLObject term_to_replace = nth(term_position, elems);
                        final SubLObject change_subtract_to_addP = makeBoolean(ZERO_INTEGER.numL(term_position) && (NIL != math_expression_subtraction_op_p(nth(subtract(term_position, ONE_INTEGER), ops))));
                        final SubLObject sub_elem1 = (NIL != change_subtract_to_addP) ? make_unary_formula($$PrefixMinusFn, term_to_replace) : term_to_replace;
                        final SubLObject new_elem = make_unary_formula($$ParenthesizedMathFn, make_ternary_formula($$MathExpressionFn, sub_elem1, op_to_add, v_term));
                        elems = list_utilities.replace_nth(term_position, new_elem, elems);
                        if (NIL != change_subtract_to_addP) {
                            ops = list_utilities.replace_nth(subtract(term_position, ONE_INTEGER), $$InfixPlusFn, ops);
                        }
                    }

                return make_math_expression(elems, ops);
            }
            if ((NIL != kb_utilities.kbeq(operation, $const296$DivideBothSidesOfMathStatementByT)) || (NIL != kb_utilities.kbeq(operation, $const297$MultiplyBothSidesOfMathStatementB))) {
                final SubLObject op_to_add = (NIL != kb_utilities.kbeq(operation, $const296$DivideBothSidesOfMathStatementByT)) ? $$InfixDivideFn : $$InfixTimesFn;
                SubLObject elems = NIL;
                SubLObject ops = NIL;
                thread.resetMultipleValues();
                final SubLObject elems_$32 = math_expression_elems_and_ops_for_multiplication_and_division(expression);
                final SubLObject ops_$33 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                elems = elems_$32;
                ops = ops_$33;
                if (NIL != kb_utilities.kbeq(operation, $const296$DivideBothSidesOfMathStatementByT)) {
                    if (NIL != list_utilities.singletonP(elems)) {
                        return make_binary_formula($$HorizontalDivideFn, elems.first(), v_term);
                    }
                    return make_binary_formula($$HorizontalDivideFn, expression, v_term);
                } else {
                    if (NIL != list_utilities.singletonP(elems)) {
                        return make_binary_formula($$ImplicitTimesFn, v_term, make_unary_formula($$ParenthesizedMathFn, elems.first()));
                    }
                    return make_binary_formula($$ImplicitTimesFn, v_term, make_unary_formula($$ParenthesizedMathFn, expression));
                }
            }
        }
        return NIL;
    }

    public static SubLObject test_apply_operation_to_math_statement(final SubLObject input) {
        SubLObject fn = NIL;
        SubLObject expression = NIL;
        SubLObject operation = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(input, input, $list298);
        fn = input.first();
        SubLObject current = input.rest();
        destructuring_bind_must_consp(current, input, $list298);
        expression = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, input, $list298);
        operation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, input, $list298);
        v_term = current.first();
        current = current.rest();
        if (NIL == current) {
            return apply_operation_to_math_statement(expression, operation, v_term);
        }
        cdestructuring_bind_error(input, $list298);
        return NIL;
    }

    public static SubLObject removal_besttermtoremovevia_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject statement = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject remove_term = math_statement_best_term_to_remove(statement);
        final SubLObject operation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != remove_term) && (NIL != operation)) {
            SubLObject cdolist_list_var = (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED))) ? cons(operation, genls.asserted_genls(operation, UNPROVIDED)) : genls.all_genls(operation, UNPROVIDED, UNPROVIDED);
            SubLObject operation_type = NIL;
            operation_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_bindings = unification_utilities.term_unify(asent, make_quaternary_formula(pred, statement, remove_term, operation, operation_type), UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                operation_type = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject math_statement_best_term_to_remove(final SubLObject math_statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject remove_term = math_statement_best_term_to_remove_int(math_statement);
        final SubLObject operation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != cycl_utilities.naut_with_functor_p(remove_term, $$PrefixMinusFn)) && (NIL != math_expression_quant_fn_or_minus_quant_fn_p(second(remove_term)))) {
            if (NIL != math_expression_minus_quant_fn_p(second(remove_term))) {
                remove_term = second(second(remove_term));
            } else {
                remove_term = list($$MathQuantFn, minus(second(second(remove_term))));
            }
        }
        return subl_promotions.values2(remove_term, operation);
    }

    public static SubLObject math_statement_best_term_to_remove_int(final SubLObject math_statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == math_statement_expressionP(math_statement)) {
            return subl_promotions.values2(NIL, NIL);
        }
        final SubLObject lhs = possibly_denegate_math_expression(cycl_utilities.nat_arg1(math_statement, UNPROVIDED), T);
        final SubLObject rhs = possibly_denegate_math_expression(cycl_utilities.nat_arg2(math_statement, UNPROVIDED), T);
        final SubLObject lhs_addition_terms = math_expression_elems_and_ops_for_addition(lhs);
        final SubLObject rhs_addition_terms = math_expression_elems_and_ops_for_addition(rhs);
        final SubLObject lhs_multiplication_terms = math_expression_elems_and_ops_for_multiplication(lhs);
        final SubLObject rhs_multiplication_terms = math_expression_elems_and_ops_for_multiplication(rhs);
        if ((NIL == list_utilities.singletonP(lhs_addition_terms)) && (NIL == list_utilities.singletonP(rhs_addition_terms))) {
            SubLObject cdolist_list_var = nreverse(group_and_sort_like_math_terms(lhs_addition_terms));
            SubLObject elem1 = NIL;
            elem1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$35 = nreverse(group_and_sort_like_math_terms(rhs_addition_terms));
                SubLObject elem2 = NIL;
                elem2 = cdolist_list_var_$35.first();
                while (NIL != cdolist_list_var_$35) {
                    if (NIL != like_math_termsP(elem1, elem2, UNPROVIDED)) {
                        if (NIL != math_term_L_compare_values(elem2, elem1)) {
                            final SubLObject swap_var = elem1;
                            elem1 = elem2;
                            elem2 = swap_var;
                        }
                        if (NIL != cycl_utilities.naut_with_functor_p(elem1, $$PrefixMinusFn)) {
                            return subl_promotions.values2(second(elem1), $const295$SubtractTermFromBothSidesOfMathSt);
                        }
                        return subl_promotions.values2(elem1, $const295$SubtractTermFromBothSidesOfMathSt);
                    } else {
                        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                        elem2 = cdolist_list_var_$35.first();
                    }
                } 
                cdolist_list_var = cdolist_list_var.rest();
                elem1 = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = lhs_multiplication_terms;
        SubLObject elem1 = NIL;
        elem1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != cycl_utilities.naut_with_functor_p(elem1, $$InfixDivideFn)) && ONE_INTEGER.eql(second(elem1))) {
                return subl_promotions.values2(third(elem1), $const297$MultiplyBothSidesOfMathStatementB);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem1 = cdolist_list_var.first();
        } 
        cdolist_list_var = rhs_multiplication_terms;
        SubLObject elem3 = NIL;
        elem3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != cycl_utilities.naut_with_functor_p(elem3, $$InfixDivideFn)) && ONE_INTEGER.eql(second(elem3))) {
                return subl_promotions.values2(third(elem3), $const297$MultiplyBothSidesOfMathStatementB);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem3 = cdolist_list_var.first();
        } 
        if ((((NIL != list_utilities.singletonP(lhs_addition_terms)) && (NIL != list_utilities.singletonP(rhs_addition_terms))) && (NIL != list_utilities.singletonP(lhs_multiplication_terms))) && (NIL != list_utilities.singletonP(rhs_multiplication_terms))) {
            cdolist_list_var = group_and_sort_like_math_terms(lhs_multiplication_terms);
            elem1 = NIL;
            elem1 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$36 = group_and_sort_like_math_terms(rhs_multiplication_terms);
                SubLObject elem2 = NIL;
                elem2 = cdolist_list_var_$36.first();
                while (NIL != cdolist_list_var_$36) {
                    if (NIL != like_math_termsP(elem1, elem2, UNPROVIDED)) {
                        if (NIL != math_term_L_compare_values(elem2, elem1)) {
                            final SubLObject swap_var = elem1;
                            elem1 = elem2;
                            elem2 = swap_var;
                        }
                        return subl_promotions.values2(elem1, $const296$DivideBothSidesOfMathStatementByT);
                    }
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    elem2 = cdolist_list_var_$36.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                elem1 = cdolist_list_var.first();
            } 
        }
        thread.resetMultipleValues();
        final SubLObject lhs_remove_term = math_expression_best_term_to_remove(lhs);
        final SubLObject lhs_operation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject rhs_remove_term = math_expression_best_term_to_remove(rhs);
        final SubLObject rhs_operation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == lhs_remove_term) {
            return subl_promotions.values2(rhs_remove_term, rhs_operation);
        }
        if (NIL == rhs_remove_term) {
            return subl_promotions.values2(lhs_remove_term, lhs_operation);
        }
        if (NIL != list_utilities.tree_find_if(MATH_EXPRESSION_VAR_P, lhs, UNPROVIDED)) {
            return subl_promotions.values2(rhs_remove_term, rhs_operation);
        }
        if (NIL != list_utilities.tree_find_if(MATH_EXPRESSION_VAR_P, rhs, UNPROVIDED)) {
            return subl_promotions.values2(lhs_remove_term, lhs_operation);
        }
        return subl_promotions.values2(lhs_remove_term, lhs_operation);
    }

    public static SubLObject math_expression_best_term_to_remove(final SubLObject expression) {
        final SubLObject remove_term_operation_pair = math_expression_terms_to_remove(expression, T);
        return values(remove_term_operation_pair.first(), second(remove_term_operation_pair));
    }

    public static SubLObject possibly_denegate_math_expression(SubLObject math_expression, SubLObject push_negation_deeperP) {
        if (push_negation_deeperP == UNPROVIDED) {
            push_negation_deeperP = NIL;
        }
        if ((NIL != list_utilities.singletonP(math_expression_elems_and_ops_for_additions_and_subtractions(math_expression))) && (NIL != cycl_utilities.naut_with_functor_p(math_expression, $$PrefixMinusFn))) {
            final SubLObject first_elem = second(second(math_expression));
            final SubLObject rest_elems = second(math_expression).rest().rest();
            math_expression = cons(second(math_expression).first(), cons(NIL != push_negation_deeperP ? list($$PrefixMinusFn, first_elem) : first_elem, rest_elems));
        }
        return math_expression;
    }

    public static SubLObject possibly_negate_math_quant_fn(final SubLObject math_quant_fn) {
        final SubLObject arg1 = cycl_utilities.naut_arg1(math_quant_fn, UNPROVIDED);
        if (arg1.isNumber()) {
            return list($$MathQuantFn, minus(arg1));
        }
        if (NIL != collection_defns.fractionP(arg1, UNPROVIDED)) {
            return list($$MathQuantFn, list_utilities.replace_nth(ONE_INTEGER, minus(nth(ONE_INTEGER, arg1)), copy_list(arg1)));
        }
        return math_quant_fn;
    }

    public static SubLObject test_removal_besttermtoremovevia_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject removal_possibletermstoremovevia_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject statement = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var = math_statement_terms_to_remove(statement);
        SubLObject remove_term_operation_pairs = NIL;
        remove_term_operation_pairs = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = remove_term_operation_pairs;
            SubLObject remove_term = NIL;
            SubLObject operation = NIL;
            destructuring_bind_must_consp(current, datum, $list309);
            remove_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list309);
            operation = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != remove_term) && (NIL != operation)) {
                    SubLObject cdolist_list_var_$37 = (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED))) ? cons(operation, genls.asserted_genls(operation, UNPROVIDED)) : genls.all_genls(operation, UNPROVIDED, UNPROVIDED);
                    SubLObject operation_type = NIL;
                    operation_type = cdolist_list_var_$37.first();
                    while (NIL != cdolist_list_var_$37) {
                        final SubLObject v_bindings = unification_utilities.term_unify(asent, make_quaternary_formula(pred, statement, remove_term, operation, operation_type), UNPROVIDED, UNPROVIDED);
                        if (NIL != v_bindings) {
                            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                        }
                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                        operation_type = cdolist_list_var_$37.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list309);
            }
            cdolist_list_var = cdolist_list_var.rest();
            remove_term_operation_pairs = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject math_statement_terms_to_remove(final SubLObject math_statement) {
        if (NIL != math_statement_expressionP(math_statement)) {
            final SubLObject lhs = cycl_utilities.nat_arg1(math_statement, UNPROVIDED);
            final SubLObject rhs = cycl_utilities.nat_arg2(math_statement, UNPROVIDED);
            return remove_duplicates(append(math_expression_terms_to_remove(lhs, UNPROVIDED), math_expression_terms_to_remove(rhs, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject math_expression_terms_to_remove(final SubLObject expression, SubLObject best_onlyP) {
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remove_term_operation_pairs_good = NIL;
        SubLObject remove_term_operation_pairs_ok = NIL;
        SubLObject remove_term_operation_pairs_bad = NIL;
        thread.resetMultipleValues();
        SubLObject elems = math_expression_elems_and_ops_for_additions_and_subtractions(expression);
        SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.singletonP(elems)) {
            final SubLObject item_var = list(elems.first(), $const295$SubtractTermFromBothSidesOfMathSt);
            if (NIL == member(item_var, remove_term_operation_pairs_bad, symbol_function(EQL), symbol_function(IDENTITY))) {
                remove_term_operation_pairs_bad = cons(item_var, remove_term_operation_pairs_bad);
            }
        } else {
            SubLObject cdolist_list_var = elems;
            SubLObject remove_term = NIL;
            remove_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject term_position = position(remove_term, elems, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject operation = NIL;
                if (term_position.isZero() || (NIL != math_expression_addition_op_p(nth(subtract(term_position, ONE_INTEGER), ops)))) {
                    operation = $const295$SubtractTermFromBothSidesOfMathSt;
                } else {
                    operation = $$AddTermToBothSidesOfMathStatement;
                }
                if (NIL != math_multiplication_or_division_expressionP(remove_term)) {
                    SubLObject cdolist_list_var_$38 = math_expression_terms_to_remove(remove_term, UNPROVIDED);
                    SubLObject sub_remove_term_operation_pair = NIL;
                    sub_remove_term_operation_pair = cdolist_list_var_$38.first();
                    while (NIL != cdolist_list_var_$38) {
                        final SubLObject item_var2 = sub_remove_term_operation_pair;
                        if (NIL == member(item_var2, remove_term_operation_pairs_bad, symbol_function(EQL), symbol_function(IDENTITY))) {
                            remove_term_operation_pairs_bad = cons(item_var2, remove_term_operation_pairs_bad);
                        }
                        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                        sub_remove_term_operation_pair = cdolist_list_var_$38.first();
                    } 
                }
                if (NIL != math_expression_quant_fn_or_minus_quant_fn_p(remove_term)) {
                    final SubLObject item_var3 = list(remove_term, operation);
                    if (NIL == member(item_var3, remove_term_operation_pairs_good, symbol_function(EQL), symbol_function(IDENTITY))) {
                        remove_term_operation_pairs_good = cons(item_var3, remove_term_operation_pairs_good);
                    }
                } else {
                    final SubLObject item_var3 = list(remove_term, operation);
                    if (NIL == member(item_var3, remove_term_operation_pairs_ok, symbol_function(EQL), symbol_function(IDENTITY))) {
                        remove_term_operation_pairs_ok = cons(item_var3, remove_term_operation_pairs_ok);
                    }
                }
                if (NIL != collection_defns.fractionP(remove_term, UNPROVIDED)) {
                    final SubLObject item_var4 = list(removal_modules_fractions.el_fraction_denominator(remove_term, UNPROVIDED), $const297$MultiplyBothSidesOfMathStatementB);
                    if (NIL == member(item_var4, remove_term_operation_pairs_bad, symbol_function(EQL), symbol_function(IDENTITY))) {
                        remove_term_operation_pairs_bad = cons(item_var4, remove_term_operation_pairs_bad);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                remove_term = cdolist_list_var.first();
            } 
        }
        thread.resetMultipleValues();
        elems = math_expression_elems_and_ops_for_multiplication_and_division(expression);
        ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == list_utilities.singletonP(elems)) {
            SubLObject cdolist_list_var = elems;
            SubLObject remove_term = NIL;
            remove_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject term_position = position(remove_term, elems, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject operation = NIL;
                if (term_position.isZero() || (NIL != math_expression_multiplication_op_p(nth(subtract(term_position, ONE_INTEGER), ops)))) {
                    operation = $const296$DivideBothSidesOfMathStatementByT;
                } else {
                    operation = $const297$MultiplyBothSidesOfMathStatementB;
                }
                if (NIL != math_expression_quant_fn_or_minus_quant_fn_p(remove_term)) {
                    final SubLObject item_var3 = list(remove_term, operation);
                    if (NIL == member(item_var3, remove_term_operation_pairs_good, symbol_function(EQL), symbol_function(IDENTITY))) {
                        remove_term_operation_pairs_good = cons(item_var3, remove_term_operation_pairs_good);
                    }
                } else {
                    final SubLObject item_var3 = list(remove_term, operation);
                    if (NIL == member(item_var3, remove_term_operation_pairs_ok, symbol_function(EQL), symbol_function(IDENTITY))) {
                        remove_term_operation_pairs_ok = cons(item_var3, remove_term_operation_pairs_ok);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                remove_term = cdolist_list_var.first();
            } 
        }
        return NIL != best_onlyP ? list_utilities.last_one(remove_term_operation_pairs_good) : nreverse(append(remove_term_operation_pairs_bad, remove_term_operation_pairs_ok, remove_term_operation_pairs_good));
    }

    public static SubLObject test_removal_possibletermstoremovevia_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject removal_mathtermcoefficient_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject expression = copy_list(arg1);
        SubLObject negate_result_factor = ONE_INTEGER;
        SubLObject v_answer = NIL;
        if (NIL != math_expression_quant_fn_or_minus_quant_fn_p(expression)) {
            v_answer = expression;
        }
        if ((NIL == v_answer) && (NIL != math_expression_var_p(expression))) {
            v_answer = list($$MathQuantFn, ONE_INTEGER);
        }
        if ((NIL == v_answer) && (NIL != cycl_utilities.naut_with_functor_p(expression, $$PrefixMinusFn))) {
            negate_result_factor = multiply(MINUS_ONE_INTEGER, negate_result_factor);
            expression = cycl_utilities.naut_arg1(expression, UNPROVIDED);
        }
        if (((NIL == v_answer) && (NIL != math_exponentiation_expressionP(expression))) && (NIL != math_expression_var_p(cycl_utilities.nat_arg1(expression, UNPROVIDED)))) {
            v_answer = list($$MathQuantFn, negate_result_factor);
        }
        if ((NIL == v_answer) && (NIL != math_multiplication_expressionP(expression))) {
            thread.resetMultipleValues();
            SubLObject elems = math_expression_elems_and_ops(expression);
            final SubLObject ops = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject new_elems = NIL;
            SubLObject cdolist_list_var = elems;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.naut_with_functor_p(elem, $$PrefixMinusFn)) {
                    negate_result_factor = multiply(MINUS_ONE_INTEGER, negate_result_factor);
                    new_elems = cons(cycl_utilities.naut_arg1(elem, UNPROVIDED), new_elems);
                } else {
                    new_elems = cons(elem, new_elems);
                }
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            elems = nreverse(new_elems);
            final SubLObject answers = list_utilities.find_all_if(MATH_EXPRESSION_QUANT_FN_P, elems, UNPROVIDED);
            if (negate_result_factor.isNegative()) {
                v_answer = possibly_negate_math_quant_fn(answers.first());
            } else {
                v_answer = answers.first();
            }
        }
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(asent, make_binary_formula(pred, arg1, v_answer), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_mathtermcoefficient_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_mathtermvariablewithdegree_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject expression = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject answers = math_expression_variables_and_degrees(expression);
        if (NIL != answers) {
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = v_answer;
                SubLObject var = NIL;
                SubLObject degree = NIL;
                destructuring_bind_must_consp(current, datum, $list321);
                var = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list321);
                degree = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject v_bindings = unification_utilities.term_unify(asent, make_ternary_formula(pred, expression, var, degree), UNPROVIDED, UNPROVIDED);
                    if (NIL != v_bindings) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list321);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject math_expression_variables_and_degrees(SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        expression = possibly_denegate_math_expression(expression, UNPROVIDED);
        SubLObject answers = NIL;
        if (NIL != math_expression_quant_fn_p(expression)) {
            return NIL;
        }
        if ((NIL == answers) && (NIL != math_expression_var_p(expression))) {
            answers = cons(list(expression, ONE_INTEGER), answers);
        }
        if ((NIL == answers) && (NIL != math_exponentiation_expressionP(expression))) {
            final SubLObject base = possibly_denegate_math_expression(cycl_utilities.nat_arg1(expression, UNPROVIDED), UNPROVIDED);
            if (NIL != math_expression_var_p(possibly_denegate_math_expression(base, UNPROVIDED))) {
            }
            answers = cons(list(base, math_expression_quant_value(cycl_utilities.nat_arg2(expression, UNPROVIDED))), answers);
        }
        if ((NIL == answers) && (NIL != math_multiplication_expressionP(expression))) {
            thread.resetMultipleValues();
            final SubLObject elems = math_expression_elems_and_ops(expression);
            final SubLObject ops = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = list_utilities.find_all_if_not(MATH_EXPRESSION_QUANT_FN_P, elems, UNPROVIDED);
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                elem = possibly_denegate_math_expression(elem, UNPROVIDED);
                answers = append(answers, math_expression_variables_and_degrees(elem));
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
        }
        return answers;
    }

    public static SubLObject test_removal_mathtermvariablewithdegree_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_mathtermdegree_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject expression = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_answer = math_expression_degree(expression);
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(asent, make_binary_formula(pred, expression, v_answer), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject math_expression_degree(final SubLObject expression) {
        SubLObject v_answer = NIL;
        if (NIL != math_expression_with_any_of_operator_test(expression, MATH_EXPRESSION_ADDITION_OR_SUBTRACTION_OP_P)) {
            return NIL;
        }
        if (NIL == v_answer) {
            v_answer = ZERO_INTEGER;
            SubLObject cdolist_list_var = math_expression_variables_and_degrees(expression);
            SubLObject var_and_degree = NIL;
            var_and_degree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = var_and_degree;
                SubLObject var = NIL;
                SubLObject degree = NIL;
                destructuring_bind_must_consp(current, datum, $list321);
                var = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list321);
                degree = current.first();
                current = current.rest();
                if (NIL == current) {
                    v_answer = add(v_answer, degree);
                } else {
                    cdestructuring_bind_error(datum, $list321);
                }
                cdolist_list_var = cdolist_list_var.rest();
                var_and_degree = cdolist_list_var.first();
            } 
        }
        return v_answer;
    }

    public static SubLObject test_removal_mathtermdegree_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_commonprimefactorlist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject num1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject num2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    v_answer = make_el_list(number_utilities.common_prime_factors(list(num1, num2)), UNPROVIDED);
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
        if (NIL != v_answer) {
            final SubLObject v_bindings = unification_utilities.term_unify(asent, make_ternary_formula(pred, num1, num2, v_answer), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_commonprimefactorlist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_simplifiablefraction_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (arg1.isCons()) {
            if (NIL != cycl_utilities.naut_with_functor_p(arg1, $$MinusFn)) {
                arg1 = cycl_utilities.naut_arg1(arg1, UNPROVIDED);
            }
            SubLObject units = NIL;
            SubLObject fraction = NIL;
            if (NIL != collection_defns.fractionP(arg1, UNPROVIDED)) {
                units = $$Unity;
                fraction = arg1;
            } else
                if (NIL != collection_defns.unit_of_measureP(arg1.first(), UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject units_$39 = quantities.explode_interval(arg1);
                    final SubLObject fraction_$40 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    units = units_$39;
                    fraction = fraction_$40;
                }

            final SubLObject mixed_fraction_whole = (NIL != collection_defns.mixed_fractionP(fraction, UNPROVIDED)) ? cycl_utilities.naut_arg1(fraction, UNPROVIDED) : NIL;
            final SubLObject numerator = removal_modules_fractions.el_fraction_numerator(fraction, UNPROVIDED);
            final SubLObject denominator = removal_modules_fractions.el_fraction_denominator(fraction, UNPROVIDED);
            SubLObject simplifiableP = NIL;
            simplifiableP = makeBoolean((((NIL != mixed_fraction_whole) && (NIL != number_utilities.zero_number_p(mixed_fraction_whole))) || (NIL != number_utilities.zero_number_p(numerator))) || ((((NIL != numerator) && (NIL != denominator)) && (NIL == number_utilities.zero_number_p(denominator))) && ((NIL != arithmetic.cyc_greater_than_or_equal_to(numerator, denominator)) || (NIL != number_utilities.common_prime_factors(list(numerator, denominator))))));
            if (NIL != simplifiableP) {
                final SubLObject v_bindings = unification_utilities.term_unify(asent, asent, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_simplifiablefraction_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_mathexpressionoperandlist_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = make_el_list(NIL != math_expression_with_some_operator_p(arg1) ? math_expression_elems_and_ops(arg1) : list(arg1), UNPROVIDED);
        final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_mathexpressionoperandlist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject like_fractions_or_non_fractional_math_termsP(final SubLObject term1, final SubLObject term2) {
        return makeBoolean(((((NIL == math_expression_quant_fn_p(term1)) || (NIL == collection_defns.fractionP(math_expression_quant_value(term1), UNPROVIDED))) && ((NIL == math_expression_quant_fn_p(term2)) || (NIL == collection_defns.fractionP(math_expression_quant_value(term2), UNPROVIDED)))) && (NIL != like_math_termsP(term1, term2, UNPROVIDED))) || (((((NIL != math_expression_quant_fn_p(term1)) && (NIL != collection_defns.fractionP(math_expression_quant_value(term1), UNPROVIDED))) && (NIL != math_expression_quant_fn_p(term2))) && (NIL != collection_defns.fractionP(math_expression_quant_value(term2), UNPROVIDED))) && (NIL != like_fractionsP(math_expression_quant_value(term1), math_expression_quant_value(term2)))));
    }

    public static SubLObject removal_associateliketerms_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = arg1;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops_for_additions_and_subtractions(arg1);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject op_bracket_types = NIL;
        SubLObject last_elem = NIL;
        SubLObject cdolist_list_var = elems;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != last_elem) {
                if (NIL != like_fractions_or_non_fractional_math_termsP(last_elem, elem)) {
                    op_bracket_types = cons($LIKE_TERMS, op_bracket_types);
                } else {
                    op_bracket_types = cons(NIL, op_bracket_types);
                }
            }
            last_elem = elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        op_bracket_types = nreverse(op_bracket_types);
        SubLObject bracket_positions = NIL;
        SubLObject last_bracket_type = NIL;
        SubLObject last_op = NIL;
        SubLObject list_var = NIL;
        SubLObject op = NIL;
        SubLObject op_num = NIL;
        list_var = ops;
        op = list_var.first();
        for (op_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , op = list_var.first() , op_num = add(ONE_INTEGER, op_num)) {
            final SubLObject bracket_type = nth(op_num, op_bracket_types);
            SubLObject bracket_start = NIL;
            SubLObject bracket_end = NIL;
            if (NIL == bracket_type) {
                last_bracket_type = NIL;
            } else
                if ((NIL != bracket_type) && (!bracket_type.eql(last_bracket_type))) {
                    bracket_start = op_num;
                    bracket_end = add(op_num, ONE_INTEGER);
                    for (SubLObject next_pos = add(op_num, ONE_INTEGER); bracket_type.eql(nth(next_pos, op_bracket_types)); next_pos = add(next_pos, ONE_INTEGER) , bracket_end = add(bracket_end, ONE_INTEGER)) {
                    }
                    bracket_positions = cons(list(multiply(TWO_INTEGER, bracket_start), add(ONE_INTEGER, multiply(TWO_INTEGER, bracket_end))), bracket_positions);
                }

            last_bracket_type = bracket_type;
            last_op = op;
        }
        SubLObject cdolist_list_var2 = bracket_positions;
        SubLObject bracket_position = NIL;
        bracket_position = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject start = add(ONE_INTEGER, bracket_position.first());
            final SubLObject end = add(ONE_INTEGER, second(bracket_position));
            final SubLObject sub_expr = list($$ParenthesizedMathFn, cons($$MathExpressionFn, subseq(v_answer, start, end)));
            if (NIL == math_expression_subtraction_op_p(nth(subtract(start, ONE_INTEGER), v_answer))) {
                v_answer = list_utilities.subseq_subst(list(sub_expr), v_answer, start, end);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            bracket_position = cdolist_list_var2.first();
        } 
        final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_associateliketerms_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject math_term_type_fractionP(final SubLObject type) {
        return makeBoolean(type.isCons() && (NIL != kb_utilities.kbeq($$Fraction, type.first())));
    }

    public static SubLObject math_term_type_L(final SubLObject type1, final SubLObject type2) {
        if (type1.equal(type2)) {
            return $COMPARE_MATH_QUANT_FNS;
        }
        final SubLObject type1_vars = Sort.sort(list_utilities.find_all_if(MATH_EXPRESSION_VAR_P, type1, UNPROVIDED), $sym358$TERM__, UNPROVIDED);
        final SubLObject type2_vars = Sort.sort(list_utilities.find_all_if(MATH_EXPRESSION_VAR_P, type2, UNPROVIDED), $sym358$TERM__, UNPROVIDED);
        final SubLObject type1_complexity = length(type1_vars);
        final SubLObject type2_complexity = length(type2_vars);
        if (type1_complexity.numL(type2_complexity)) {
            return T;
        }
        if (type1_complexity.numG(type2_complexity)) {
            return NIL;
        }
        if ((NIL != find_if($sym359$MATH_TERM_TYPE_FRACTION_, type1, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if($sym359$MATH_TERM_TYPE_FRACTION_, type2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != find_if($sym359$MATH_TERM_TYPE_FRACTION_, type2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if($sym359$MATH_TERM_TYPE_FRACTION_, type1, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (NIL != find_if($sym359$MATH_TERM_TYPE_FRACTION_, type1, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return kb_utilities.term_L(type1, type2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return kb_utilities.term_L(type1_vars, type2_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject math_term_type_internal(final SubLObject v_term) {
        SubLObject result = why_like_math_termsP(v_term, v_term, UNPROVIDED);
        final SubLObject math_quant_fn = list_utilities.tree_find_if(MATH_EXPRESSION_QUANT_FN_P, v_term, UNPROVIDED);
        if ((NIL != math_quant_fn) && (NIL != collection_defns.fractionP(math_expression_quant_value(math_quant_fn), UNPROVIDED))) {
            final SubLObject denominator = removal_modules_fractions.el_fraction_denominator(math_expression_quant_value(math_quant_fn), UNPROVIDED);
            result = cons(list($$Fraction, denominator), result);
        }
        if (NIL == list_utilities.singletonP(result)) {
            result = remove($$Unity, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        result = kb_utilities.sort_terms(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject math_term_type(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return math_term_type_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MATH_TERM_TYPE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MATH_TERM_TYPE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MATH_TERM_TYPE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(math_term_type_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject math_term_L_compare_values(final SubLObject term1, final SubLObject term2) {
        return math_term_L(term1, term2, T);
    }

    public static SubLObject math_term_L(final SubLObject term1, final SubLObject term2, SubLObject compare_valuesP) {
        if (compare_valuesP == UNPROVIDED) {
            compare_valuesP = NIL;
        }
        final SubLObject term1_type = math_term_type(term1);
        final SubLObject term2_type = math_term_type(term2);
        SubLObject result = math_term_type_L(term1_type, term2_type);
        if (result == $COMPARE_MATH_QUANT_FNS) {
            SubLObject value1 = math_expression_quant_value(NIL != math_expression_quant_fn_p(term1) ? term1 : list_utilities.tree_find_if(MATH_EXPRESSION_QUANT_FN_P, term1, UNPROVIDED));
            SubLObject value2 = math_expression_quant_value(NIL != math_expression_quant_fn_p(term2) ? term2 : list_utilities.tree_find_if(MATH_EXPRESSION_QUANT_FN_P, term2, UNPROVIDED));
            final SubLObject value1_fractionP = collection_defns.fractionP(value1, UNPROVIDED);
            final SubLObject value2_fractionP = collection_defns.fractionP(value2, UNPROVIDED);
            if (NIL == value1) {
                value1 = ONE_INTEGER;
            }
            if (NIL == value2) {
                value2 = ONE_INTEGER;
            }
            if ((NIL != compare_valuesP) && (NIL != list_utilities.safe_L(value1, value2))) {
                result = T;
            } else {
                if ((NIL == value1_fractionP) && (NIL == value2_fractionP)) {
                    return NIL;
                }
                if (NIL != value1_fractionP) {
                    result = NIL;
                } else
                    if (NIL != value2_fractionP) {
                        result = T;
                    }

            }
        }
        return result;
    }

    public static SubLObject group_and_sort_like_math_terms(final SubLObject math_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return Sort.stable_sort(math_terms, $sym362$MATH_TERM___COMPARE_VALUES, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject group_like_math_terms(final SubLObject math_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return Sort.stable_sort(math_terms, $sym363$MATH_TERM__, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject removal_expressionreorderedtogroupliketerms_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = arg1;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops(arg1);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != list_utilities.singletonP(remove_duplicates(ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL != math_expression_addition_op_p(ops.first())) || (NIL != math_expression_multiplication_op_p(ops.first())))) {
            final SubLObject sorted_elems = group_like_math_terms(elems);
            v_answer = make_math_expression(sorted_elems, ops);
        }
        final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionreorderedtogroupliketerms_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_expressionhasnonadjacentliketermsasoperands_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject non_adjacent_like_terms_foundP = NIL;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops(arg1);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject elem_types = Mapping.mapcar(MATH_TERM_TYPE, elems);
        final SubLObject unique_elem_types = list_utilities.fast_remove_duplicates(elem_types, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == non_adjacent_like_terms_foundP) {
            SubLObject csome_list_var = unique_elem_types;
            SubLObject unique_elem_type = NIL;
            unique_elem_type = csome_list_var.first();
            while ((NIL == non_adjacent_like_terms_foundP) && (NIL != csome_list_var)) {
                final SubLObject positions = list_utilities.all_positions(unique_elem_type, elem_types, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                SubLObject cur_position = positions.first();
                if (NIL == non_adjacent_like_terms_foundP) {
                    SubLObject csome_list_var_$43 = positions.rest();
                    SubLObject position = NIL;
                    position = csome_list_var_$43.first();
                    while ((NIL == non_adjacent_like_terms_foundP) && (NIL != csome_list_var_$43)) {
                        if (add(cur_position, ONE_INTEGER).numL(position)) {
                            non_adjacent_like_terms_foundP = T;
                        }
                        cur_position = position;
                        csome_list_var_$43 = csome_list_var_$43.rest();
                        position = csome_list_var_$43.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                unique_elem_type = csome_list_var.first();
            } 
        }
        if (NIL != non_adjacent_like_terms_foundP) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionhasnonadjacentliketermsasoperands_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject strong_math_term_L(final SubLObject term1, final SubLObject term2) {
        final SubLObject term1_type = math_term_type(term1);
        final SubLObject term2_type = math_term_type(term2);
        if (NIL != math_term_L(term1_type, term2_type, UNPROVIDED)) {
            return T;
        }
        if (NIL != math_term_L(term1_type, term2_type, UNPROVIDED)) {
            return NIL;
        }
        return kb_utilities.term_L(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sort_math_terms(final SubLObject math_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return Sort.stable_sort(math_terms, $sym374$STRONG_MATH_TERM__, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject removal_expressionreorderedinascendingorder_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_answer = arg1;
        thread.resetMultipleValues();
        final SubLObject elems = math_expression_elems_and_ops(arg1);
        final SubLObject ops = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != list_utilities.singletonP(remove_duplicates(ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (((NIL != math_expression_addition_op_p(ops.first())) || (NIL != math_expression_subtraction_op_p(ops.first()))) || (NIL != math_expression_multiplication_op_p(ops.first())))) {
            final SubLObject sorted_elems = sort_math_terms(elems);
            v_answer = make_math_expression(sorted_elems, ops);
        }
        final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg2, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject test_removal_expressionreorderedinascendingorder_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject removal_bestsubexpressiontoevaluate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = math_expression_evaluate(arg1);
        final SubLObject reason = thread.secondMultipleValue();
        final SubLObject first_expression_to_evaluate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != first_expression_to_evaluate) {
            final SubLObject v_bindings = unification_utilities.term_unify(first_expression_to_evaluate, arg2, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_bestsubexpressiontoevaluate_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(sentence, mt, query_properties));
    }

    public static SubLObject math_expression_to_prefix_format(final SubLObject math_expression) {
        assert NIL != math_expression_p(math_expression) : "math_expression_utilities.math_expression_p(math_expression) " + "CommonSymbols.NIL != math_expression_utilities.math_expression_p(math_expression) " + math_expression;
        return NIL != infix_math_expression_p(math_expression) ? infix_math_expression_to_prefix_format(math_expression) : math_expression;
    }

    public static SubLObject infix_math_expression_to_prefix_format(final SubLObject math_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != infix_math_expression_p(math_expression) : "math_expression_utilities.infix_math_expression_p(math_expression) " + "CommonSymbols.NIL != math_expression_utilities.infix_math_expression_p(math_expression) " + math_expression;
        if (NIL != formula_arityE(math_expression, ONE_INTEGER, UNPROVIDED)) {
            return math_expression_to_prefix_format(cycl_utilities.nat_arg1(math_expression, UNPROVIDED));
        }
        thread.resetMultipleValues();
        final SubLObject main_operator = infix_math_expression_main_operator(math_expression);
        final SubLObject main_operator_argnum = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject operand1 = math_expression_to_prefix_format(make_el_formula($$MathExpressionFn, subseq(cycl_utilities.nat_args(math_expression, UNPROVIDED), ZERO_INTEGER, number_utilities.f_1_(main_operator_argnum)), UNPROVIDED));
        final SubLObject operand2 = math_expression_to_prefix_format(make_el_formula($$MathExpressionFn, subseq(cycl_utilities.nat_args(math_expression, UNPROVIDED), main_operator_argnum, UNPROVIDED), UNPROVIDED));
        return make_binary_formula(main_operator, operand1, operand2);
    }

    public static SubLObject infix_math_expression_main_operator(final SubLObject math_expression) {
        SubLObject main_operator_argnum = TWO_INTEGER;
        SubLObject main_operator = cycl_utilities.nat_arg(math_expression, main_operator_argnum, UNPROVIDED);
        SubLObject main_operator_precedence_rank = math_expression_infix_operator_precedence_rank(main_operator);
        if (NIL != formula_arityG(math_expression, TWO_INTEGER, UNPROVIDED)) {
            SubLObject end_var;
            SubLObject n;
            SubLObject op;
            SubLObject precedence_rank;
            for (end_var = formula_arity(math_expression, UNPROVIDED), n = NIL, n = FOUR_INTEGER; !n.numGE(end_var); n = add(n, TWO_INTEGER)) {
                op = cycl_utilities.nat_arg(math_expression, n, UNPROVIDED);
                precedence_rank = math_expression_infix_operator_precedence_rank(op);
                if (precedence_rank.numL(main_operator_precedence_rank)) {
                    main_operator = op;
                    main_operator_argnum = n;
                    main_operator_precedence_rank = precedence_rank;
                }
            }
        }
        return values(main_operator, main_operator_argnum, main_operator_precedence_rank);
    }

    public static SubLObject really_big_number_for_fractionP(final SubLObject obj) {
        return makeBoolean((obj.isNumber() && (!obj.isZero())) && log(abs(obj), SIXTEEN_INTEGER).numGE(SIX_INTEGER));
    }

    public static SubLObject fraction_to_el(final SubLObject fraction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fraction_utilities.fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        if ((NIL != really_big_number_for_fractionP(fraction_utilities.numerator(fraction))) || (NIL != really_big_number_for_fractionP(fraction_utilities.denominator(fraction)))) {
            final SubLObject num = fraction_utilities.defractionify(fraction);
            final SubLObject numerator_digits = number_utilities.f_1X(truncate(log(abs(fraction_utilities.numerator(fraction)), TEN_INTEGER), UNPROVIDED));
            final SubLObject denominator_digits = number_utilities.f_1X(truncate(log(abs(fraction_utilities.denominator(fraction)), TEN_INTEGER), UNPROVIDED));
            return NIL != really_big_number_for_fractionP(num) ? scientific_numbers.scientific_number_from_subl_real(num, max(numerator_digits, denominator_digits)) : num;
        }
        if (abs(fraction_utilities.numerator(fraction)).numLE(abs(fraction_utilities.denominator(fraction)))) {
            return make_binary_formula($$SimpleFractionFn, fraction_utilities.numerator(fraction), fraction_utilities.denominator(fraction));
        }
        if (subl_promotions.positive_integer_p(fraction_utilities.numerator(fraction)).eql(subl_promotions.positive_integer_p(fraction_utilities.denominator(fraction)))) {
            thread.resetMultipleValues();
            final SubLObject whole = truncate(abs(fraction_utilities.numerator(fraction)), abs(fraction_utilities.denominator(fraction)));
            final SubLObject numerator = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return make_ternary_formula($$MixedFractionFn, whole, numerator, abs(fraction_utilities.denominator(fraction)));
        }
        thread.resetMultipleValues();
        final SubLObject whole = truncate(abs(fraction_utilities.numerator(fraction)), abs(fraction_utilities.denominator(fraction)));
        final SubLObject numerator = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return make_ternary_formula($$NegativeMixedFractionFn, whole, numerator, abs(fraction_utilities.denominator(fraction)));
    }

    public static SubLObject fraction_from_el(final SubLObject el_fraction) {
        assert NIL != collection_defns.fractionP(el_fraction, UNPROVIDED) : "collection_defns.fractionP(el_fraction, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != collection_defns.fractionP(el_fraction, CommonSymbols.UNPROVIDED) " + el_fraction;
        return quantities.convert_simple_fraction_to_fraction(quantities.convert_fraction_to_simple_fraction(el_fraction));
    }

    public static SubLObject removal_mathexpressionnthoperand_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject elem = NIL;
        SubLObject n = NIL;
        list_var = math_expression_elems_and_ops(arg1);
        elem = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem = list_var.first() , n = add(ONE_INTEGER, n)) {
            final SubLObject answer_asent = make_ternary_formula($$mathExpressionNthOperand, arg1, add(n, ONE_INTEGER), elem);
            final SubLObject v_bindings = unification_utilities.term_unify(answer_asent, asent, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_mathexpressionnthoperand_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        if (NIL != cyc_kernel.closed_query_success_token_p(v_answer)) {
            return T;
        }
        if (NIL != bindings.bindings_p(v_answer)) {
            return bindings.bindings_values(v_answer.first()).first();
        }
        return NIL;
    }

    public static SubLObject removal_orderedlistofdirectsubexpressionswithoperandcount_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject operand_count_to_answers_plist = NIL;
        if (NIL != subl_promotions.positive_integer_p(arg2)) {
            SubLObject cdolist_list_var = nreverse(sub_math_expressions_direct_ordered_by_appearance(arg1, arg2));
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                operand_count_to_answers_plist = putf(operand_count_to_answers_plist, arg2, cons(elem, list_utilities.plist_lookup(operand_count_to_answers_plist, arg2, NIL)));
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
        } else {
            SubLObject list_var = NIL;
            SubLObject elem_ignored = NIL;
            SubLObject num = NIL;
            list_var = math_expression_elems_and_ops(arg1);
            elem_ignored = list_var.first();
            for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem_ignored = list_var.first() , num = add(ONE_INTEGER, num)) {
                SubLObject cdolist_list_var2 = nreverse(sub_math_expressions_direct_ordered_by_appearance(arg1, num));
                SubLObject elem2 = NIL;
                elem2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    operand_count_to_answers_plist = putf(operand_count_to_answers_plist, num, cons(elem2, list_utilities.plist_lookup(operand_count_to_answers_plist, num, NIL)));
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    elem2 = cdolist_list_var2.first();
                } 
            }
        }
        SubLObject remainder;
        SubLObject operand_count;
        SubLObject elem_list;
        SubLObject answer_asent;
        SubLObject v_bindings;
        for (remainder = NIL, remainder = operand_count_to_answers_plist; NIL != remainder; remainder = cddr(remainder)) {
            operand_count = remainder.first();
            elem_list = cadr(remainder);
            answer_asent = make_ternary_formula($const393$orderedListOfDirectSubExpressions, arg1, operand_count, make_el_list(elem_list, UNPROVIDED));
            v_bindings = unification_utilities.term_unify(answer_asent, asent, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        if (arg2.isNumber() && (NIL == getf(operand_count_to_answers_plist, arg2, UNPROVIDED))) {
            final SubLObject answer_asent2 = make_ternary_formula($const393$orderedListOfDirectSubExpressions, arg1, arg2, $$TheEmptyList);
            final SubLObject v_bindings2 = unification_utilities.term_unify(answer_asent2, asent, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings2) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings2, asent), UNPROVIDED, UNPROVIDED), v_bindings2, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject sub_math_expressions_direct_ordered_by_appearance(final SubLObject expression, final SubLObject operand_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        if (((NIL != math_expression_p(expression)) && (NIL == math_expression_quant_fn_p(expression))) && (NIL == math_expression_var_p(expression))) {
            thread.resetMultipleValues();
            final SubLObject elems = math_expression_elems_and_ops(expression);
            final SubLObject ops = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == infix_math_expression_p(expression)) && operand_count.eql(TWO_INTEGER)) {
                return list(expression);
            }
            if ((NIL == infix_math_expression_p(expression)) && operand_count.eql(ONE_INTEGER)) {
                return elems;
            }
            if (length(elems).eql(operand_count)) {
                answers = cons(expression, answers);
            }
            final SubLObject expression_args = cycl_utilities.nat_args(expression, UNPROVIDED);
            SubLObject expression_args_length;
            SubLObject sub_seq_start;
            SubLObject sub_seq_length;
            SubLObject sub_expression;
            for (expression_args_length = length(expression_args), sub_seq_start = NIL, sub_seq_start = ZERO_INTEGER; !sub_seq_start.numG(expression_args_length); sub_seq_start = add(TWO_INTEGER, sub_seq_start)) {
                for (sub_seq_length = NIL, sub_seq_length = ONE_INTEGER; !sub_seq_length.numG(expression_args_length); sub_seq_length = add(TWO_INTEGER, sub_seq_length)) {
                    if (sub_seq_length.eql(subtract(multiply(TWO_INTEGER, operand_count), ONE_INTEGER))) {
                        if (operand_count.eql(TWO_INTEGER)) {
                            sub_expression = nth(sub_seq_start, expression_args);
                            if ((NIL != prefix_math_expression_p(sub_expression)) && TWO_INTEGER.eql(length(cycl_utilities.formula_args(sub_expression, UNPROVIDED)))) {
                                answers = cons(sub_expression, answers);
                            }
                        }
                        if (ONE_INTEGER.eql(sub_seq_length)) {
                            answers = cons(nth(sub_seq_start, expression_args), answers);
                        } else
                            if (add(sub_seq_start, sub_seq_length).numLE(expression_args_length)) {
                                answers = cons(cons($$MathExpressionFn, subseq(expression_args, sub_seq_start, add(sub_seq_start, sub_seq_length))), answers);
                            }

                    }
                }
            }
        }
        return nreverse(answers);
    }

    public static SubLObject test_removal_orderedlistofdirectsubexpressionswithoperandcount_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        if (NIL != cyc_kernel.closed_query_success_token_p(v_answer)) {
            return T;
        }
        if (NIL != bindings.bindings_p(v_answer)) {
            return bindings.bindings_values(v_answer.first()).first();
        }
        return NIL;
    }

    public static SubLObject math_expression_flatten(final SubLObject expression) {
        if (NIL != list_utilities.singletonP(expression)) {
            return expression;
        }
        return math_expression_flatten_int(expression, UNPROVIDED);
    }

    public static SubLObject math_expression_flatten_int(final SubLObject expression, SubLObject only_operator) {
        if (only_operator == UNPROVIDED) {
            only_operator = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == math_expression_p(expression)) || (NIL == narts_high.naut_p(expression))) {
            return expression;
        }
        final SubLObject operator = cycl_utilities.naut_functor(expression);
        SubLObject result = NIL;
        if ((NIL != only_operator) && (NIL == kb_utilities.kbeq(operator, only_operator))) {
            return math_expression_flatten_int(expression, UNPROVIDED);
        }
        if (NIL != kb_utilities.kbeq(operator, $$MathExpressionFn)) {
            thread.resetMultipleValues();
            final SubLObject elems = math_expression_elems_and_ops(expression);
            final SubLObject ops = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == elems) {
                return NIL;
            }
            SubLObject list_var = NIL;
            SubLObject elem = NIL;
            SubLObject num = NIL;
            list_var = elems;
            elem = list_var.first();
            for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem = list_var.first() , num = add(ONE_INTEGER, num)) {
                final SubLObject sub_flatten = math_expression_flatten_int(elem, operator);
                if (NIL != infix_math_expression_p(sub_flatten)) {
                    SubLObject cdolist_list_var = sub_flatten.rest();
                    SubLObject v_object = NIL;
                    v_object = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = cons(v_object, result);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_object = cdolist_list_var.first();
                    } 
                } else {
                    result = cons(sub_flatten, result);
                }
                final SubLObject op = nth(num, ops);
                if (NIL != op) {
                    result = cons(nth(num, ops), result);
                }
            }
        } else {
            if (NIL == math_expression_infix_op_p(operator)) {
                return expression;
            }
            if (NIL != list_utilities.doubletonP(expression)) {
                return cycl_utilities.naut_arg1(expression, UNPROVIDED);
            }
            SubLObject cdolist_list_var2;
            final SubLObject elems = cdolist_list_var2 = expression.rest();
            SubLObject elem2 = NIL;
            elem2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject sub_flatten2 = math_expression_flatten_int(elem2, operator);
                if (NIL != kb_utilities.kbeq(operator, math_expression_operator(sub_flatten2))) {
                    SubLObject cdolist_list_var_$45 = sub_flatten2.rest();
                    SubLObject v_object2 = NIL;
                    v_object2 = cdolist_list_var_$45.first();
                    while (NIL != cdolist_list_var_$45) {
                        result = cons(v_object2, result);
                        cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                        v_object2 = cdolist_list_var_$45.first();
                    } 
                } else {
                    result = cons(sub_flatten2, result);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                elem2 = cdolist_list_var2.first();
            } 
        }
        result = remove_if(NULL, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cons(operator, nreverse(result));
    }

    public static SubLObject declare_math_expression_utilities_file() {
        declareFunction("math_expression_infix_operator_precedence_rank", "MATH-EXPRESSION-INFIX-OPERATOR-PRECEDENCE-RANK", 1, 0, false);
        declareFunction("math_expression_addition_op_p", "MATH-EXPRESSION-ADDITION-OP-P", 1, 0, false);
        declareFunction("math_expression_subtraction_op_p", "MATH-EXPRESSION-SUBTRACTION-OP-P", 1, 0, false);
        declareFunction("math_expression_addition_or_subtraction_op_p", "MATH-EXPRESSION-ADDITION-OR-SUBTRACTION-OP-P", 1, 0, false);
        declareFunction("math_expression_multiplication_op_p", "MATH-EXPRESSION-MULTIPLICATION-OP-P", 1, 0, false);
        declareFunction("math_expression_division_op_p", "MATH-EXPRESSION-DIVISION-OP-P", 1, 0, false);
        declareFunction("math_expression_multiplication_or_divide_op_p", "MATH-EXPRESSION-MULTIPLICATION-OR-DIVIDE-OP-P", 1, 0, false);
        declareFunction("math_expression_exponentiation_op_p", "MATH-EXPRESSION-EXPONENTIATION-OP-P", 1, 0, false);
        declareFunction("math_expression_nth_root_op_p", "MATH-EXPRESSION-NTH-ROOT-OP-P", 1, 0, false);
        declareFunction("math_expression_infix_op_p", "MATH-EXPRESSION-INFIX-OP-P", 1, 0, false);
        declareFunction("math_expression_unary_prefix_op_p", "MATH-EXPRESSION-UNARY-PREFIX-OP-P", 1, 0, false);
        declareFunction("math_expression_unary_surround_op_p", "MATH-EXPRESSION-UNARY-SURROUND-OP-P", 1, 0, false);
        declareFunction("math_expression_with_some_operator_p", "MATH-EXPRESSION-WITH-SOME-OPERATOR-P", 1, 0, false);
        declareFunction("clear_all_math_expression_denoting_functions", "CLEAR-ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS", 0, 0, false);
        declareFunction("remove_all_math_expression_denoting_functions", "REMOVE-ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS", 0, 0, false);
        declareFunction("all_math_expression_denoting_functions_internal", "ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS-INTERNAL", 0, 0, false);
        declareFunction("all_math_expression_denoting_functions", "ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS", 0, 0, false);
        declareFunction("math_expression_p", "MATH-EXPRESSION-P", 1, 0, false);
        declareFunction("infix_math_expression_p", "INFIX-MATH-EXPRESSION-P", 1, 0, false);
        declareFunction("prefix_math_expression_p", "PREFIX-MATH-EXPRESSION-P", 1, 0, false);
        declareFunction("math_expression_quant_fn_p", "MATH-EXPRESSION-QUANT-FN-P", 1, 0, false);
        declareFunction("time_expression_fn_p", "TIME-EXPRESSION-FN-P", 1, 0, false);
        declareFunction("math_expression_minus_quant_fn_p", "MATH-EXPRESSION-MINUS-QUANT-FN-P", 1, 0, false);
        declareFunction("math_expression_quant_fn_or_minus_quant_fn_p", "MATH-EXPRESSION-QUANT-FN-OR-MINUS-QUANT-FN-P", 1, 0, false);
        declareFunction("math_expression_quant_value", "MATH-EXPRESSION-QUANT-VALUE", 1, 0, false);
        declareFunction("math_expression_zero_quant_value", "MATH-EXPRESSION-ZERO-QUANT-VALUE", 1, 0, false);
        declareFunction("math_expression_var_p", "MATH-EXPRESSION-VAR-P", 1, 0, false);
        declareFunction("math_expression_enclosure_fn_p", "MATH-EXPRESSION-ENCLOSURE-FN-P", 1, 0, false);
        declareFunction("math_statement_function_p", "MATH-STATEMENT-FUNCTION-P", 1, 0, false);
        declareFunction("math_statement_expressionP", "MATH-STATEMENT-EXPRESSION?", 1, 0, false);
        declareFunction("math_addition_expressionP", "MATH-ADDITION-EXPRESSION?", 1, 0, false);
        declareFunction("math_subtraction_expressionP", "MATH-SUBTRACTION-EXPRESSION?", 1, 0, false);
        declareFunction("math_addition_or_subtraction_expressionP", "MATH-ADDITION-OR-SUBTRACTION-EXPRESSION?", 1, 0, false);
        declareFunction("math_multiplication_expressionP", "MATH-MULTIPLICATION-EXPRESSION?", 1, 0, false);
        declareFunction("math_division_expressionP", "MATH-DIVISION-EXPRESSION?", 1, 0, false);
        declareFunction("math_multiplication_or_division_expressionP", "MATH-MULTIPLICATION-OR-DIVISION-EXPRESSION?", 1, 0, false);
        declareFunction("math_exponentiation_expressionP", "MATH-EXPONENTIATION-EXPRESSION?", 1, 0, false);
        declareFunction("math_nth_root_expressionP", "MATH-NTH-ROOT-EXPRESSION?", 1, 0, false);
        declareFunction("math_enclosed_math_expressionP", "MATH-ENCLOSED-MATH-EXPRESSION?", 1, 0, false);
        declareFunction("math_expression_unenclose", "MATH-EXPRESSION-UNENCLOSE", 1, 0, false);
        declareFunction("math_expression_with_all_of_operator_test", "MATH-EXPRESSION-WITH-ALL-OF-OPERATOR-TEST", 2, 0, false);
        declareFunction("math_expression_with_any_of_operator_test", "MATH-EXPRESSION-WITH-ANY-OF-OPERATOR-TEST", 2, 0, false);
        declareFunction("removal_submathexpressions_direct_expand", "REMOVAL-SUBMATHEXPRESSIONS-DIRECT-EXPAND", 1, 1, false);
        declareFunction("sub_math_expressions_direct", "SUB-MATH-EXPRESSIONS-DIRECT", 1, 0, false);
        declareFunction("test_removal_submathexpressions_direct_expand", "TEST-REMOVAL-SUBMATHEXPRESSIONS-DIRECT-EXPAND", 1, 2, false);
        declareFunction("removal_submathexpressions_expand", "REMOVAL-SUBMATHEXPRESSIONS-EXPAND", 1, 1, false);
        declareFunction("sub_math_expressions", "SUB-MATH-EXPRESSIONS", 1, 0, false);
        declareFunction("test_removal_submathexpressions_expand", "TEST-REMOVAL-SUBMATHEXPRESSIONS-EXPAND", 1, 2, false);
        declareFunction("removal_mathquantvalue_expand", "REMOVAL-MATHQUANTVALUE-EXPAND", 1, 1, false);
        declareFunction("math_quant_value", "MATH-QUANT-VALUE", 1, 0, false);
        declareFunction("test_removal_mathquantvalue_expand", "TEST-REMOVAL-MATHQUANTVALUE-EXPAND", 1, 2, false);
        declareFunction("removal_additionarglist_expand", "REMOVAL-ADDITIONARGLIST-EXPAND", 1, 1, false);
        declareFunction("math_expression_addition_arglist", "MATH-EXPRESSION-ADDITION-ARGLIST", 1, 0, false);
        declareFunction("test_removal_additionarglist_expand", "TEST-REMOVAL-ADDITIONARGLIST-EXPAND", 1, 2, false);
        declareFunction("removal_genericadditionarglist_expand", "REMOVAL-GENERICADDITIONARGLIST-EXPAND", 1, 1, false);
        declareFunction("generic_math_expression_addition_arglist", "GENERIC-MATH-EXPRESSION-ADDITION-ARGLIST", 1, 0, false);
        declareFunction("test_removal_genericadditionarglist_expand", "TEST-REMOVAL-GENERICADDITIONARGLIST-EXPAND", 1, 2, false);
        declareFunction("removal_multiplicationarglist_expand", "REMOVAL-MULTIPLICATIONARGLIST-EXPAND", 1, 1, false);
        declareFunction("math_expression_multiplication_arglist", "MATH-EXPRESSION-MULTIPLICATION-ARGLIST", 1, 0, false);
        declareFunction("test_removal_multiplicationarglist_expand", "TEST-REMOVAL-MULTIPLICATIONARGLIST-EXPAND", 1, 2, false);
        declareFunction("removal_genericmultiplicationarglist_expand", "REMOVAL-GENERICMULTIPLICATIONARGLIST-EXPAND", 1, 1, false);
        declareFunction("generic_math_expression_multiplication_arglist", "GENERIC-MATH-EXPRESSION-MULTIPLICATION-ARGLIST", 1, 0, false);
        declareFunction("test_removal_genericmultiplicationarglist_expand", "TEST-REMOVAL-GENERICMULTIPLICATIONARGLIST-EXPAND", 1, 2, false);
        declareFunction("removal_expressionnegated_expand", "REMOVAL-EXPRESSIONNEGATED-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionnegated_expand", "TEST-REMOVAL-EXPRESSIONNEGATED-EXPAND", 1, 2, false);
        declareFunction("removal_expressionminuend_expand", "REMOVAL-EXPRESSIONMINUEND-EXPAND", 1, 1, false);
        declareFunction("math_expression_minuend", "MATH-EXPRESSION-MINUEND", 1, 0, false);
        declareFunction("test_removal_expressionminuend_expand", "TEST-REMOVAL-EXPRESSIONMINUEND-EXPAND", 1, 2, false);
        declareFunction("removal_genericexpressionminuend_expand", "REMOVAL-GENERICEXPRESSIONMINUEND-EXPAND", 1, 1, false);
        declareFunction("generic_math_expression_minuend", "GENERIC-MATH-EXPRESSION-MINUEND", 1, 0, false);
        declareFunction("test_removal_genericexpressionminuend_expand", "TEST-REMOVAL-GENERICEXPRESSIONMINUEND-EXPAND", 1, 2, false);
        declareFunction("removal_expressionsubtrahend_expand", "REMOVAL-EXPRESSIONSUBTRAHEND-EXPAND", 1, 1, false);
        declareFunction("math_expression_subtrahend", "MATH-EXPRESSION-SUBTRAHEND", 1, 0, false);
        declareFunction("test_removal_expressionsubtrahend_expand", "TEST-REMOVAL-EXPRESSIONSUBTRAHEND-EXPAND", 1, 2, false);
        declareFunction("removal_genericexpressionsubtrahend_expand", "REMOVAL-GENERICEXPRESSIONSUBTRAHEND-EXPAND", 1, 1, false);
        declareFunction("generic_math_expression_subtrahend", "GENERIC-MATH-EXPRESSION-SUBTRAHEND", 1, 0, false);
        declareFunction("test_removal_genericexpressionsubtrahend_expand", "TEST-REMOVAL-GENERICEXPRESSIONSUBTRAHEND-EXPAND", 1, 2, false);
        declareFunction("removal_expressiondivisor_expand", "REMOVAL-EXPRESSIONDIVISOR-EXPAND", 1, 1, false);
        declareFunction("math_expression_divisor", "MATH-EXPRESSION-DIVISOR", 1, 0, false);
        declareFunction("test_removal_expressiondivisor_expand", "TEST-REMOVAL-EXPRESSIONDIVISOR-EXPAND", 1, 2, false);
        declareFunction("removal_genericexpressiondivisor_expand", "REMOVAL-GENERICEXPRESSIONDIVISOR-EXPAND", 1, 1, false);
        declareFunction("generic_math_expression_divisor", "GENERIC-MATH-EXPRESSION-DIVISOR", 1, 0, false);
        declareFunction("test_removal_genericexpressiondivisor_expand", "TEST-REMOVAL-GENERICEXPRESSIONDIVISOR-EXPAND", 1, 2, false);
        declareFunction("removal_expressiondividend_expand", "REMOVAL-EXPRESSIONDIVIDEND-EXPAND", 1, 1, false);
        declareFunction("math_expression_dividend", "MATH-EXPRESSION-DIVIDEND", 1, 0, false);
        declareFunction("test_removal_expressiondividend_expand", "TEST-REMOVAL-EXPRESSIONDIVIDEND-EXPAND", 1, 2, false);
        declareFunction("removal_genericexpressiondividend_expand", "REMOVAL-GENERICEXPRESSIONDIVIDEND-EXPAND", 1, 1, false);
        declareFunction("generic_math_expression_dividend", "GENERIC-MATH-EXPRESSION-DIVIDEND", 1, 0, false);
        declareFunction("test_removal_genericexpressiondividend_expand", "TEST-REMOVAL-GENERICEXPRESSIONDIVIDEND-EXPAND", 1, 2, false);
        declareFunction("removal_expressionexponent_expand", "REMOVAL-EXPRESSIONEXPONENT-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionexponent_expand", "TEST-REMOVAL-EXPRESSIONEXPONENT-EXPAND", 1, 2, false);
        declareFunction("removal_expressionbase_expand", "REMOVAL-EXPRESSIONBASE-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionbase_expand", "TEST-REMOVAL-EXPRESSIONBASE-EXPAND", 1, 2, false);
        declareFunction("removal_expressionradicand_expand", "REMOVAL-EXPRESSIONRADICAND-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionradicand_expand", "TEST-REMOVAL-EXPRESSIONRADICAND-EXPAND", 1, 2, false);
        declareFunction("removal_expressionindex_expand", "REMOVAL-EXPRESSIONINDEX-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionindex_expand", "TEST-REMOVAL-EXPRESSIONINDEX-EXPAND", 1, 2, false);
        declareFunction("removal_absolutevalueofexpression_expand", "REMOVAL-ABSOLUTEVALUEOFEXPRESSION-EXPAND", 1, 1, false);
        declareFunction("test_removal_absolutevalueofexpression_expand", "TEST-REMOVAL-ABSOLUTEVALUEOFEXPRESSION-EXPAND", 1, 2, false);
        declareFunction("removal_expressionenclosed_expand", "REMOVAL-EXPRESSIONENCLOSED-EXPAND", 1, 1, false);
        declareFunction("math_expression_enclosed_expression", "MATH-EXPRESSION-ENCLOSED-EXPRESSION", 1, 0, false);
        declareFunction("test_removal_expressionenclosed_expand", "TEST-REMOVAL-EXPRESSIONENCLOSED-EXPAND", 1, 2, false);
        declareFunction("removal_expressionaddends_expand", "REMOVAL-EXPRESSIONADDENDS-EXPAND", 1, 1, false);
        declareFunction("math_expression_addends", "MATH-EXPRESSION-ADDENDS", 1, 0, false);
        declareFunction("test_removal_expressionaddends_expand", "TEST-REMOVAL-EXPRESSIONADDENDS-EXPAND", 1, 2, false);
        declareFunction("removal_expressionfactors_expand", "REMOVAL-EXPRESSIONFACTORS-EXPAND", 1, 1, false);
        declareFunction("math_expression_factors", "MATH-EXPRESSION-FACTORS", 1, 0, false);
        declareFunction("test_removal_expressionfactors_expand", "TEST-REMOVAL-EXPRESSIONFACTORS-EXPAND", 1, 2, false);
        declareFunction("removal_expressionaddendlist_expand", "REMOVAL-EXPRESSIONADDENDLIST-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionaddendlist_expand", "TEST-REMOVAL-EXPRESSIONADDENDLIST-EXPAND", 1, 2, false);
        declareFunction("removal_expressionfactorlist_expand", "REMOVAL-EXPRESSIONFACTORLIST-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionfactorlist_expand", "TEST-REMOVAL-EXPRESSIONFACTORLIST-EXPAND", 1, 2, false);
        declareFunction("removal_expressionisevaluatable_expand", "REMOVAL-EXPRESSIONISEVALUATABLE-EXPAND", 1, 1, false);
        declareFunction("math_expression_is_evaluatableP", "MATH-EXPRESSION-IS-EVALUATABLE?", 1, 0, false);
        declareFunction("math_expression_evaluate", "MATH-EXPRESSION-EVALUATE", 1, 0, false);
        declareFunction("math_expression_evaluate_int", "MATH-EXPRESSION-EVALUATE-INT", 1, 0, false);
        declareFunction("math_expression_failed_evaluation_reasons_merge", "MATH-EXPRESSION-FAILED-EVALUATION-REASONS-MERGE", 2, 0, false);
        declareFunction("math_expression_operand_quantity_type", "MATH-EXPRESSION-OPERAND-QUANTITY-TYPE", 1, 0, false);
        declareFunction("math_quant_value_type", "MATH-QUANT-VALUE-TYPE", 1, 0, false);
        declareFunction("test_removal_expressionisevaluatable_expand", "TEST-REMOVAL-EXPRESSIONISEVALUATABLE-EXPAND", 1, 2, false);
        declareFunction("removal_mathexpressionoperatorlist_expand", "REMOVAL-MATHEXPRESSIONOPERATORLIST-EXPAND", 1, 1, false);
        declareFunction("test_removal_mathexpressionoperatorlist_expand", "TEST-REMOVAL-MATHEXPRESSIONOPERATORLIST-EXPAND", 1, 2, false);
        declareFunction("removal_mathexpressionoperatorcount_expand", "REMOVAL-MATHEXPRESSIONOPERATORCOUNT-EXPAND", 1, 1, false);
        declareFunction("test_removal_mathexpressionoperatorcount_expand", "TEST-REMOVAL-MATHEXPRESSIONOPERATORCOUNT-EXPAND", 1, 2, false);
        declareFunction("math_expression_elems_and_ops", "MATH-EXPRESSION-ELEMS-AND-OPS", 1, 0, false);
        declareFunction("make_math_expression", "MAKE-MATH-EXPRESSION", 2, 0, false);
        declareFunction("math_expression_elems_and_ops_for_additions_and_subtractions", "MATH-EXPRESSION-ELEMS-AND-OPS-FOR-ADDITIONS-AND-SUBTRACTIONS", 1, 0, false);
        declareFunction("math_expression_elems_and_ops_for_addition", "MATH-EXPRESSION-ELEMS-AND-OPS-FOR-ADDITION", 1, 0, false);
        declareFunction("math_expression_elems_and_ops_for_multiplication_and_division", "MATH-EXPRESSION-ELEMS-AND-OPS-FOR-MULTIPLICATION-AND-DIVISION", 1, 0, false);
        declareFunction("math_expression_elems_and_ops_for_multiplication", "MATH-EXPRESSION-ELEMS-AND-OPS-FOR-MULTIPLICATION", 1, 0, false);
        declareFunction("removal_mathexpressionoperator_expand", "REMOVAL-MATHEXPRESSIONOPERATOR-EXPAND", 1, 1, false);
        declareFunction("math_expression_operator", "MATH-EXPRESSION-OPERATOR", 1, 0, false);
        declareFunction("test_removal_mathexpressionoperator_expand", "TEST-REMOVAL-MATHEXPRESSIONOPERATOR-EXPAND", 1, 2, false);
        declareFunction("removal_leftsideofmathematicalstatement_expand", "REMOVAL-LEFTSIDEOFMATHEMATICALSTATEMENT-EXPAND", 1, 1, false);
        declareFunction("test_removal_leftsideofmathematicalstatement_expand", "TEST-REMOVAL-LEFTSIDEOFMATHEMATICALSTATEMENT-EXPAND", 1, 2, false);
        declareFunction("removal_rightsideofmathematicalstatement_expand", "REMOVAL-RIGHTSIDEOFMATHEMATICALSTATEMENT-EXPAND", 1, 1, false);
        declareFunction("test_removal_rightsideofmathematicalstatement_expand", "TEST-REMOVAL-RIGHTSIDEOFMATHEMATICALSTATEMENT-EXPAND", 1, 2, false);
        declareFunction("removal_likemathterms_expand", "REMOVAL-LIKEMATHTERMS-EXPAND", 1, 1, false);
        declareFunction("like_fractionsP", "LIKE-FRACTIONS?", 2, 0, false);
        declareFunction("like_math_termsP", "LIKE-MATH-TERMS?", 2, 1, false);
        declareFunction("normalize_term_for_like_math_terms", "NORMALIZE-TERM-FOR-LIKE-MATH-TERMS", 1, 0, false);
        declareFunction("why_like_math_termsP", "WHY-LIKE-MATH-TERMS?", 2, 1, false);
        declareFunction("like_math_terms_listsP", "LIKE-MATH-TERMS-LISTS?", 2, 1, false);
        declareFunction("why_like_math_terms_listsP", "WHY-LIKE-MATH-TERMS-LISTS?", 2, 1, false);
        declareFunction("simplify_math_expression_multiplication_term_for_like_terms", "SIMPLIFY-MATH-EXPRESSION-MULTIPLICATION-TERM-FOR-LIKE-TERMS", 1, 0, false);
        declareFunction("test_removal_likemathterms_expand", "TEST-REMOVAL-LIKEMATHTERMS-EXPAND", 1, 2, false);
        declareFunction("removal_unlikemathterms_expand", "REMOVAL-UNLIKEMATHTERMS-EXPAND", 1, 1, false);
        declareFunction("removal_simplifiablemathexpression_expand", "REMOVAL-SIMPLIFIABLEMATHEXPRESSION-EXPAND", 1, 1, false);
        declareFunction("removal_unsimplifiablemathexpression_expand", "REMOVAL-UNSIMPLIFIABLEMATHEXPRESSION-EXPAND", 1, 1, false);
        declareFunction("unsimplifiable_math_expressionP", "UNSIMPLIFIABLE-MATH-EXPRESSION?", 1, 0, false);
        declareFunction("like_math_terms_for_simplificationP", "LIKE-MATH-TERMS-FOR-SIMPLIFICATION?", 2, 0, false);
        declareFunction("test_removal_unsimplifiablemathexpression_expand", "TEST-REMOVAL-UNSIMPLIFIABLEMATHEXPRESSION-EXPAND", 1, 2, false);
        declareFunction("test_removal_simplifiablemathexpression_expand", "TEST-REMOVAL-SIMPLIFIABLEMATHEXPRESSION-EXPAND", 1, 2, false);
        declareFunction("math_equals_statementP", "MATH-EQUALS-STATEMENT?", 1, 0, false);
        declareFunction("math_equation_univariate_linearP", "MATH-EQUATION-UNIVARIATE-LINEAR?", 1, 0, false);
        declareFunction("math_expression_univariate_linearP", "MATH-EXPRESSION-UNIVARIATE-LINEAR?", 1, 0, false);
        declareFunction("removal_comparablemathterms_expand", "REMOVAL-COMPARABLEMATHTERMS-EXPAND", 1, 1, false);
        declareFunction("test_removal_comparablemathterms_expand", "TEST-REMOVAL-COMPARABLEMATHTERMS-EXPAND", 1, 2, false);
        declareFunction("removal_likemathtermsonoppositesides_expand", "REMOVAL-LIKEMATHTERMSONOPPOSITESIDES-EXPAND", 1, 1, false);
        declareFunction("test_removal_likemathtermsonoppositesides_expand", "TEST-REMOVAL-LIKEMATHTERMSONOPPOSITESIDES-EXPAND", 1, 2, false);
        declareFunction("apply_operation_to_math_statement", "APPLY-OPERATION-TO-MATH-STATEMENT", 3, 0, false);
        declareFunction("apply_operation_to_math_expression", "APPLY-OPERATION-TO-MATH-EXPRESSION", 3, 0, false);
        declareFunction("test_apply_operation_to_math_statement", "TEST-APPLY-OPERATION-TO-MATH-STATEMENT", 1, 0, false);
        declareFunction("removal_besttermtoremovevia_expand", "REMOVAL-BESTTERMTOREMOVEVIA-EXPAND", 1, 1, false);
        declareFunction("math_statement_best_term_to_remove", "MATH-STATEMENT-BEST-TERM-TO-REMOVE", 1, 0, false);
        declareFunction("math_statement_best_term_to_remove_int", "MATH-STATEMENT-BEST-TERM-TO-REMOVE-INT", 1, 0, false);
        declareFunction("math_expression_best_term_to_remove", "MATH-EXPRESSION-BEST-TERM-TO-REMOVE", 1, 0, false);
        declareFunction("possibly_denegate_math_expression", "POSSIBLY-DENEGATE-MATH-EXPRESSION", 1, 1, false);
        declareFunction("possibly_negate_math_quant_fn", "POSSIBLY-NEGATE-MATH-QUANT-FN", 1, 0, false);
        declareFunction("test_removal_besttermtoremovevia_expand", "TEST-REMOVAL-BESTTERMTOREMOVEVIA-EXPAND", 1, 2, false);
        declareFunction("removal_possibletermstoremovevia_expand", "REMOVAL-POSSIBLETERMSTOREMOVEVIA-EXPAND", 1, 1, false);
        declareFunction("math_statement_terms_to_remove", "MATH-STATEMENT-TERMS-TO-REMOVE", 1, 0, false);
        declareFunction("math_expression_terms_to_remove", "MATH-EXPRESSION-TERMS-TO-REMOVE", 1, 1, false);
        declareFunction("test_removal_possibletermstoremovevia_expand", "TEST-REMOVAL-POSSIBLETERMSTOREMOVEVIA-EXPAND", 1, 2, false);
        declareFunction("removal_mathtermcoefficient_expand", "REMOVAL-MATHTERMCOEFFICIENT-EXPAND", 1, 1, false);
        declareFunction("test_removal_mathtermcoefficient_expand", "TEST-REMOVAL-MATHTERMCOEFFICIENT-EXPAND", 1, 2, false);
        declareFunction("removal_mathtermvariablewithdegree_expand", "REMOVAL-MATHTERMVARIABLEWITHDEGREE-EXPAND", 1, 1, false);
        declareFunction("math_expression_variables_and_degrees", "MATH-EXPRESSION-VARIABLES-AND-DEGREES", 1, 0, false);
        declareFunction("test_removal_mathtermvariablewithdegree_expand", "TEST-REMOVAL-MATHTERMVARIABLEWITHDEGREE-EXPAND", 1, 2, false);
        declareFunction("removal_mathtermdegree_expand", "REMOVAL-MATHTERMDEGREE-EXPAND", 1, 1, false);
        declareFunction("math_expression_degree", "MATH-EXPRESSION-DEGREE", 1, 0, false);
        declareFunction("test_removal_mathtermdegree_expand", "TEST-REMOVAL-MATHTERMDEGREE-EXPAND", 1, 2, false);
        declareFunction("removal_commonprimefactorlist_expand", "REMOVAL-COMMONPRIMEFACTORLIST-EXPAND", 1, 1, false);
        declareFunction("test_removal_commonprimefactorlist_expand", "TEST-REMOVAL-COMMONPRIMEFACTORLIST-EXPAND", 1, 2, false);
        declareFunction("removal_simplifiablefraction_expand", "REMOVAL-SIMPLIFIABLEFRACTION-EXPAND", 1, 1, false);
        declareFunction("test_removal_simplifiablefraction_expand", "TEST-REMOVAL-SIMPLIFIABLEFRACTION-EXPAND", 1, 2, false);
        declareFunction("removal_mathexpressionoperandlist_expand", "REMOVAL-MATHEXPRESSIONOPERANDLIST-EXPAND", 1, 1, false);
        declareFunction("test_removal_mathexpressionoperandlist_expand", "TEST-REMOVAL-MATHEXPRESSIONOPERANDLIST-EXPAND", 1, 2, false);
        declareFunction("like_fractions_or_non_fractional_math_termsP", "LIKE-FRACTIONS-OR-NON-FRACTIONAL-MATH-TERMS?", 2, 0, false);
        declareFunction("removal_associateliketerms_expand", "REMOVAL-ASSOCIATELIKETERMS-EXPAND", 1, 1, false);
        declareFunction("test_removal_associateliketerms_expand", "TEST-REMOVAL-ASSOCIATELIKETERMS-EXPAND", 1, 2, false);
        declareFunction("math_term_type_fractionP", "MATH-TERM-TYPE-FRACTION?", 1, 0, false);
        declareFunction("math_term_type_L", "MATH-TERM-TYPE-<", 2, 0, false);
        declareFunction("math_term_type_internal", "MATH-TERM-TYPE-INTERNAL", 1, 0, false);
        declareFunction("math_term_type", "MATH-TERM-TYPE", 1, 0, false);
        declareFunction("math_term_L_compare_values", "MATH-TERM-<-COMPARE-VALUES", 2, 0, false);
        declareFunction("math_term_L", "MATH-TERM-<", 2, 1, false);
        declareFunction("group_and_sort_like_math_terms", "GROUP-AND-SORT-LIKE-MATH-TERMS", 1, 0, false);
        declareFunction("group_like_math_terms", "GROUP-LIKE-MATH-TERMS", 1, 0, false);
        declareFunction("removal_expressionreorderedtogroupliketerms_expand", "REMOVAL-EXPRESSIONREORDEREDTOGROUPLIKETERMS-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionreorderedtogroupliketerms_expand", "TEST-REMOVAL-EXPRESSIONREORDEREDTOGROUPLIKETERMS-EXPAND", 1, 2, false);
        declareFunction("removal_expressionhasnonadjacentliketermsasoperands_expand", "REMOVAL-EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionhasnonadjacentliketermsasoperands_expand", "TEST-REMOVAL-EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS-EXPAND", 1, 2, false);
        declareFunction("strong_math_term_L", "STRONG-MATH-TERM-<", 2, 0, false);
        declareFunction("sort_math_terms", "SORT-MATH-TERMS", 1, 0, false);
        declareFunction("removal_expressionreorderedinascendingorder_expand", "REMOVAL-EXPRESSIONREORDEREDINASCENDINGORDER-EXPAND", 1, 1, false);
        declareFunction("test_removal_expressionreorderedinascendingorder_expand", "TEST-REMOVAL-EXPRESSIONREORDEREDINASCENDINGORDER-EXPAND", 1, 2, false);
        declareFunction("removal_bestsubexpressiontoevaluate_expand", "REMOVAL-BESTSUBEXPRESSIONTOEVALUATE-EXPAND", 1, 1, false);
        declareFunction("test_removal_bestsubexpressiontoevaluate_expand", "TEST-REMOVAL-BESTSUBEXPRESSIONTOEVALUATE-EXPAND", 1, 2, false);
        declareFunction("math_expression_to_prefix_format", "MATH-EXPRESSION-TO-PREFIX-FORMAT", 1, 0, false);
        declareFunction("infix_math_expression_to_prefix_format", "INFIX-MATH-EXPRESSION-TO-PREFIX-FORMAT", 1, 0, false);
        declareFunction("infix_math_expression_main_operator", "INFIX-MATH-EXPRESSION-MAIN-OPERATOR", 1, 0, false);
        declareFunction("really_big_number_for_fractionP", "REALLY-BIG-NUMBER-FOR-FRACTION?", 1, 0, false);
        declareFunction("fraction_to_el", "FRACTION-TO-EL", 1, 0, false);
        declareFunction("fraction_from_el", "FRACTION-FROM-EL", 1, 0, false);
        declareFunction("removal_mathexpressionnthoperand_expand", "REMOVAL-MATHEXPRESSIONNTHOPERAND-EXPAND", 1, 1, false);
        declareFunction("test_removal_mathexpressionnthoperand_expand", "TEST-REMOVAL-MATHEXPRESSIONNTHOPERAND-EXPAND", 1, 2, false);
        declareFunction("removal_orderedlistofdirectsubexpressionswithoperandcount_expand", "REMOVAL-ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT-EXPAND", 1, 1, false);
        declareFunction("sub_math_expressions_direct_ordered_by_appearance", "SUB-MATH-EXPRESSIONS-DIRECT-ORDERED-BY-APPEARANCE", 2, 0, false);
        declareFunction("test_removal_orderedlistofdirectsubexpressionswithoperandcount_expand", "TEST-REMOVAL-ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT-EXPAND", 1, 2, false);
        declareFunction("math_expression_flatten", "MATH-EXPRESSION-FLATTEN", 1, 0, false);
        declareFunction("math_expression_flatten_int", "MATH-EXPRESSION-FLATTEN-INT", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_math_expression_utilities_file() {
        deflexical("*MATH-EXPRESSION-MULTIPLICATION-FNS*", $list0);
        deflexical("*MATH-EXPRESSION-DIVISION-FNS*", $list1);
        deflexical("*MATH-EXPRESSION-ADDITION-FNS*", $list2);
        deflexical("*MATH-EXPRESSION-SUBTRACTION-FNS*", $list3);
        deflexical("*MATH-EXPRESSION-INFIX-OPERATORS*", $list4);
        deflexical("*MATH-EXPRESSION-INFIX-OPERATOR-PRECEDENCE-RANK*", $list5);
        deflexical("*MATH-EXPRESSION-UNARY-PREFIX-OPERATORS*", $list6);
        deflexical("*MATH-EXPRESSION-UNARY-SURROUND-OPERATORS*", $list7);
        deflexical("*ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS-CACHING-STATE*", NIL);
        deflexical("*MATH-EXPRESSION-ENCLOSURE-FNS*", $list19);
        defparameter("*MATH-STATEMENT-FNS*", $list20);
        return NIL;
    }

    public static SubLObject setup_math_expression_utilities_file() {
        memoization_state.note_globally_cached_function(ALL_MATH_EXPRESSION_DENOTING_FUNCTIONS);
        preference_modules.doomed_unless_arg_bindable($POS, $$subMathExpressions_Direct, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SUBMATHEXPRESSIONS_DIRECT, $list31);
        define_test_case_table_int(TEST_REMOVAL_SUBMATHEXPRESSIONS_DIRECT_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list41);
        preference_modules.doomed_unless_arg_bindable($POS, $$subMathExpressions, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SUBMATHEXPRESSIONS, $list44);
        define_test_case_table_int(TEST_REMOVAL_SUBMATHEXPRESSIONS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list47);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathQuantValue, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHQUANTVALUE, $list50);
        define_test_case_table_int(TEST_REMOVAL_MATHQUANTVALUE_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list55);
        preference_modules.doomed_unless_arg_bindable($POS, $$additionArglist, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ADDITIONARGLIST, $list58);
        define_test_case_table_int(TEST_REMOVAL_ADDITIONARGLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list63);
        preference_modules.doomed_unless_arg_bindable($POS, $$genericAdditionArglist, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_GENERICADDITIONARGLIST, $list66);
        define_test_case_table_int(TEST_REMOVAL_GENERICADDITIONARGLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list68);
        preference_modules.doomed_unless_arg_bindable($POS, $$multiplicationArglist, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MULTIPLICATIONARGLIST, $list71);
        define_test_case_table_int(TEST_REMOVAL_MULTIPLICATIONARGLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list74);
        preference_modules.doomed_unless_arg_bindable($POS, $$genericMultiplicationArglist, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_GENERICMULTIPLICATIONARGLIST, $list77);
        define_test_case_table_int(TEST_REMOVAL_GENERICMULTIPLICATIONARGLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list79);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionNegated, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONNEGATED, $list82);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONNEGATED_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list84);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionMinuend, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONMINUEND, $list87);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONMINUEND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list90);
        preference_modules.doomed_unless_arg_bindable($POS, $$genericExpressionMinuend, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_GENERICEXPRESSIONMINUEND, $list93);
        define_test_case_table_int(TEST_REMOVAL_GENERICEXPRESSIONMINUEND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list95);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionSubtrahend, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONSUBTRAHEND, $list98);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONSUBTRAHEND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list100);
        preference_modules.doomed_unless_arg_bindable($POS, $$genericExpressionSubtrahend, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_GENERICEXPRESSIONSUBTRAHEND, $list103);
        define_test_case_table_int(TEST_REMOVAL_GENERICEXPRESSIONSUBTRAHEND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list105);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionDivisor, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONDIVISOR, $list108);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONDIVISOR_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list110);
        preference_modules.doomed_unless_arg_bindable($POS, $$genericExpressionDivisor, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_GENERICEXPRESSIONDIVISOR, $list113);
        define_test_case_table_int(TEST_REMOVAL_GENERICEXPRESSIONDIVISOR_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list115);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionDividend, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONDIVIDEND, $list118);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONDIVIDEND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list120);
        preference_modules.doomed_unless_arg_bindable($POS, $$genericExpressionDividend, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_GENERICEXPRESSIONDIVIDEND, $list123);
        define_test_case_table_int(TEST_REMOVAL_GENERICEXPRESSIONDIVIDEND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list125);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionExponent, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONEXPONENT, $list128);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONEXPONENT_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list130);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionBase, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONBASE, $list133);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONBASE_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list135);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionRadicand, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONRADICAND, $list138);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONRADICAND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list140);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionIndex, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONINDEX, $list143);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONINDEX_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list145);
        preference_modules.doomed_unless_arg_bindable($POS, $$absoluteValueOfExpression, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ABSOLUTEVALUEOFEXPRESSION, $list148);
        define_test_case_table_int(TEST_REMOVAL_ABSOLUTEVALUEOFEXPRESSION_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list151);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionEnclosed, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONENCLOSED, $list154);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONENCLOSED_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list156);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionAddends, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONADDENDS, $list159);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONADDENDS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list161);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionFactors, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONFACTORS, $list164);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONFACTORS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list166);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionAddendList, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONADDENDLIST, $list169);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONADDENDLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list171);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionFactorList, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONFACTORLIST, $list174);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONFACTORLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list177);
        preference_modules.doomed_unless_arg_bindable($POS, $$expressionIsEvaluatable, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONISEVALUATABLE, $list180);
        define_test_case_table_int(MATH_EXPRESSION_EVALUATE, list(new SubLObject[]{ $TEST, symbol_function(TERM_UNIFY), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list224);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONISEVALUATABLE_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list226);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathExpressionOperatorList, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHEXPRESSIONOPERATORLIST, $list229);
        define_test_case_table_int(TEST_REMOVAL_MATHEXPRESSIONOPERATORLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list232);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathExpressionOperatorCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHEXPRESSIONOPERATORCOUNT, $list235);
        define_test_case_table_int(TEST_REMOVAL_MATHEXPRESSIONOPERATORCOUNT_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list237);
        define_test_case_table_int(MATH_EXPRESSION_ELEMS_AND_OPS_FOR_ADDITIONS_AND_SUBTRACTIONS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list240);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathExpressionOperator, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHEXPRESSIONOPERATOR, $list243);
        define_test_case_table_int(TEST_REMOVAL_MATHEXPRESSIONOPERATOR_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list245);
        preference_modules.doomed_unless_arg_bindable($POS, $$leftSideOfMathematicalStatement, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LEFTSIDEOFMATHEMATICALSTATEMENT, $list248);
        define_test_case_table_int(TEST_REMOVAL_LEFTSIDEOFMATHEMATICALSTATEMENT_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list250);
        preference_modules.doomed_unless_arg_bindable($POS, $$rightSideOfMathematicalStatement, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_RIGHTSIDEOFMATHEMATICALSTATEMENT, $list253);
        define_test_case_table_int(TEST_REMOVAL_RIGHTSIDEOFMATHEMATICALSTATEMENT_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list255);
        preference_modules.doomed_unless_all_args_bindable($POS, $$likeMathTerms);
        inference_modules.inference_removal_module($REMOVAL_LIKEMATHTERMS, $list258);
        define_test_case_table_int(TEST_REMOVAL_LIKEMATHTERMS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list261);
        preference_modules.doomed_unless_all_args_bindable($POS, $$unlikeMathTerms);
        inference_modules.inference_removal_module($REMOVAL_UNLIKEMATHTERMS, $list264);
        preference_modules.doomed_unless_arg_bindable($POS, $$simplifiableMathExpression, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SIMPLIFIABLEMATHEXPRESSION, $list267);
        preference_modules.doomed_unless_arg_bindable($POS, $$unsimplifiableMathExpression, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_UNSIMPLIFIABLEMATHEXPRESSION, $list270);
        define_test_case_table_int(TEST_REMOVAL_UNSIMPLIFIABLEMATHEXPRESSION_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list276);
        define_test_case_table_int(TEST_REMOVAL_SIMPLIFIABLEMATHEXPRESSION_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list278);
        define_test_case_table_int($sym281$MATH_EQUATION_UNIVARIATE_LINEAR_, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list282);
        preference_modules.doomed_unless_all_args_bindable($POS, $$comparableMathTerms);
        inference_modules.inference_removal_module($REMOVAL_COMPARABLEMATHTERMS, $list285);
        define_test_case_table_int(TEST_REMOVAL_COMPARABLEMATHTERMS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list287);
        preference_modules.doomed_unless_all_args_bindable($POS, $$likeMathTermsOnOppositeSides);
        inference_modules.inference_removal_module($REMOVAL_LIKEMATHTERMSONOPPOSITESIDES, $list290);
        define_test_case_table_int(TEST_REMOVAL_LIKEMATHTERMSONOPPOSITESIDES_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list292);
        define_test_case_table_int(TEST_APPLY_OPERATION_TO_MATH_STATEMENT, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list300);
        preference_modules.doomed_unless_arg_bindable($POS, $$bestTermToRemoveVia, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_BESTTERMTOREMOVEVIA, $list303);
        define_test_case_table_int(TEST_REMOVAL_BESTTERMTOREMOVEVIA_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list305);
        preference_modules.doomed_unless_arg_bindable($POS, $$possibleTermsToRemoveVia, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_POSSIBLETERMSTOREMOVEVIA, $list308);
        define_test_case_table_int(TEST_REMOVAL_POSSIBLETERMSTOREMOVEVIA_EXPAND, list(new SubLObject[]{ $TEST, symbol_function($sym311$HAS_MEMBER_EQUAL_), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list312);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathTermCoefficient, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHTERMCOEFFICIENT, $list315);
        define_test_case_table_int(TEST_REMOVAL_MATHTERMCOEFFICIENT_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list317);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathTermVariableWithDegree, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHTERMVARIABLEWITHDEGREE, $list320);
        define_test_case_table_int(TEST_REMOVAL_MATHTERMVARIABLEWITHDEGREE_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list323);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathTermDegree, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHTERMDEGREE, $list326);
        define_test_case_table_int(TEST_REMOVAL_MATHTERMDEGREE_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list329);
        preference_modules.doomed_unless_arg_bindable($POS, $$commonPrimeFactorList, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$commonPrimeFactorList, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_COMMONPRIMEFACTORLIST, $list332);
        define_test_case_table_int(TEST_REMOVAL_COMMONPRIMEFACTORLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list336);
        preference_modules.doomed_unless_arg_bindable($POS, $$simplifiableFraction, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SIMPLIFIABLEFRACTION, $list339);
        define_test_case_table_int(TEST_REMOVAL_SIMPLIFIABLEFRACTION_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list341);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathExpressionOperandList, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHEXPRESSIONOPERANDLIST, $list344);
        define_test_case_table_int(TEST_REMOVAL_MATHEXPRESSIONOPERANDLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list346);
        preference_modules.doomed_unless_arg_bindable($POS, $$associateLikeTerms, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ASSOCIATELIKETERMS, $list349);
        define_test_case_table_int(TEST_REMOVAL_ASSOCIATELIKETERMS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list352);
        preference_modules.doomed_unless_arg_bindable($POS, $const353$expressionReorderedToGroupLikeTer, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONREORDEREDTOGROUPLIKETERMS, $list355);
        memoization_state.note_memoized_function(MATH_TERM_TYPE);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONREORDEREDTOGROUPLIKETERMS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list365);
        preference_modules.doomed_unless_arg_bindable($POS, $const366$expressionHasNonAdjacentLikeTerms, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS, $list368);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONHASNONADJACENTLIKETERMSASOPERANDS_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list370);
        preference_modules.doomed_unless_arg_bindable($POS, $const371$expressionReorderedInAscendingOrd, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSIONREORDEREDINASCENDINGORDER, $list373);
        define_test_case_table_int(TEST_REMOVAL_EXPRESSIONREORDEREDINASCENDINGORDER_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list376);
        preference_modules.doomed_unless_arg_bindable($POS, $$bestSubExpressionToEvaluate, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_BESTSUBEXPRESSIONTOEVALUATE, $list379);
        define_test_case_table_int(TEST_REMOVAL_BESTSUBEXPRESSIONTOEVALUATE_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list381);
        define_test_case_table_int(MATH_EXPRESSION_TO_PREFIX_FORMAT, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list384);
        preference_modules.doomed_unless_arg_bindable($POS, $$mathExpressionNthOperand, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MATHEXPRESSIONNTHOPERAND, $list390);
        define_test_case_table_int(TEST_REMOVAL_MATHEXPRESSIONNTHOPERAND_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list392);
        preference_modules.doomed_unless_arg_bindable($POS, $const393$orderedListOfDirectSubExpressions, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT, $list395);
        define_test_case_table_int($sym396$TEST_REMOVAL_ORDEREDLISTOFDIRECTSUBEXPRESSIONSWITHOPERANDCOUNT_EX, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list37, $KB, $FULL, $WORKING_, T }), $list397);
        return NIL;
    }

    private static SubLObject _constant_41_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions-Direct")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))), NIL), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), T) });
    }

    private static SubLObject _constant_47_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), NIL), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SIXTEEN_INTEGER)), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?VAR0"))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), T), list(list(list(reader_make_constant_shell(makeString("subMathExpressions")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), T) });
    }

    private static SubLObject _constant_261_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, THREE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(8.5)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(8.5)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(8.5)), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(8.5)), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), makeDouble(3.7))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), makeDouble(3.7))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T) });
    }

    private static SubLObject _constant_276_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), FOUR_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ZERO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), ZERO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), ZERO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), ZERO_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), FIVE_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FOUR_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, THREE_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(3.14)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER))))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWENTY_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWENTY_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWENTY_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MinusFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("NegativeMixedFractionFn")), ONE_INTEGER, FIVE_INTEGER, EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, FIVE_INTEGER, EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(-5), EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(-5), EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, FIVE_INTEGER, EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("unsimplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T) });
    }

    private static SubLObject _constant_278_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), FOUR_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), TWO_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), TWO_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), SEVEN_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), FIVE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FOUR_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, THREE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER))))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), TWENTY_INTEGER)))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWENTY_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWENTY_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWENTY_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MinusFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(123)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(2460)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(2460)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(2460)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(2460)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), TWELVE_INTEGER, makeInteger(45)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), FOUR_INTEGER, makeInteger(40))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), TWELVE_INTEGER, makeInteger(45)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), FOUR_INTEGER, makeInteger(40))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), TWELVE_INTEGER, makeInteger(45)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), FOUR_INTEGER, makeInteger(40))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), TWELVE_INTEGER, makeInteger(45)), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), FOUR_INTEGER, makeInteger(40))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("NegativeMixedFractionFn")), ONE_INTEGER, FIVE_INTEGER, EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, FIVE_INTEGER, EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(-5), EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(-5), EIGHT_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, FIVE_INTEGER, EIGHT_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), T), list(list(list(reader_make_constant_shell(makeString("simplifiableMathExpression")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL) });
    }

    private static SubLObject _constant_287_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("HoursDuration")), SIX_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Ohm")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mile")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, THREE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(8.5)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("q"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), makeDouble(3.7))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), makeDouble(3.7))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), NIL), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("comparableMathTerms")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T) });
    }

    private static SubLObject _constant_292_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathLessThanStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathGreaterThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("p"))))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FOUR_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Inch")), SIX_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathGreaterThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathLessThanStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), makeSymbol("INFIXPLUS"), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), makeSymbol("INFIXPLUS"), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(98)))))), NIL), list(list(list(reader_make_constant_shell(makeString("likeMathTermsOnOppositeSides")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), makeSymbol("INFIX"), reader_make_constant_shell(makeString("MinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))))), NIL) });
    }

    private static SubLObject _constant_300_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathLessThanStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathLessThanStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))), list(reader_make_constant_shell(makeString("MathQuantFn")), TEN_INTEGER)), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34)))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(34))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227)))), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(227))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220)))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(227))), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220)))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(227)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(220))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("ApplyOperationToMathStatementFn")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)))))) });
    }

    private static SubLObject _constant_305_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), makeSymbol("?REMOVE-TERM"), makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaAdditionOrSubtraction")))), list(list(list(makeSymbol("?REMOVE-TERM"), reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), cons(makeSymbol("?OPERATION"), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaAdditionOrSubtraction")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaAdditionOrSubtraction")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("AddTermToBothSidesOfMathStatement")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), NIL), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaAdditionOrSubtraction")))), NIL), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaAdditionOrSubtraction")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaAdditionOrSubtraction")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("SubtractTermFromBothSidesOfMathStatement")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36)))), makeSymbol("?TERM"), makeSymbol("?METHOD"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-6)), cons(makeSymbol("?METHOD"), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36)))), makeSymbol("?TERM"), makeSymbol("?METHOD"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-6)), cons(makeSymbol("?METHOD"), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-36))), makeSymbol("?TERM"), makeSymbol("?METHOD"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-6)), cons(makeSymbol("?METHOD"), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-6)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-36))), makeSymbol("?TERM"), makeSymbol("?METHOD"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-6)), cons(makeSymbol("?METHOD"), reader_make_constant_shell(makeString("DivideBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5)), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")))))), list(list(list(reader_make_constant_shell(makeString("bestTermToRemoveVia")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), makeSymbol("?TERM"), makeSymbol("?OP"), reader_make_constant_shell(makeString("ModifyingBothSidesOfAMathStatementViaMultiplicationOrDivision")))), list(list(list(makeSymbol("?TERM"), reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-5)), cons(makeSymbol("?OP"), reader_make_constant_shell(makeString("MultiplyBothSidesOfMathStatementByTerm")))))) });
    }

    private static SubLObject _constant_317_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), makeSymbol("?WHAT"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?WHAT"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("X"))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-2)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("X"))), makeSymbol("?WHAT"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-4)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-4)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-4)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-7)))), T), list(list(list(reader_make_constant_shell(makeString("mathTermCoefficient")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(-7)))), T) });
    }

    private static SubLObject _constant_323_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), makeSymbol("?DEGREE"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), FOUR_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("X"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("X")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("X"))), makeSymbol("?VAR"), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermVariableWithDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), TWO_INTEGER)), T) });
    }

    private static SubLObject _constant_329_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), SEVEN_INTEGER)), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), FOUR_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), THREE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), THREE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?DEGREE"))), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), THREE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), makeSymbol("?DEGREE"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), FOUR_INTEGER)), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeSymbol("?DEGREE"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), TWO_INTEGER)), NIL), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), TWO_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), THREE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("mathTermDegree")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), THREE_INTEGER)), T) });
    }

    private static SubLObject _constant_346_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionOperandList")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))), T) });
    }

    private static SubLObject _constant_352_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)))))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)) }), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)))))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)) }), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)))))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER))), makeSymbol("?WHAT")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER)), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))) }), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ELEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))) }), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), SEVEN_INTEGER, THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))) }), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), SEVEN_INTEGER, THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, FIVE_INTEGER)))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))))), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("associateLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), SEVEN_INTEGER, THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))) }), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T) });
    }

    private static SubLObject _constant_365_initializer() {
        return list(list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)) })), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))) })), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FOUR_INTEGER, TWO_INTEGER, NINE_INTEGER)) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FOUR_INTEGER, TWO_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))) })), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FOUR_INTEGER, TWO_INTEGER, NINE_INTEGER)) }), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)) })), reader_make_constant_shell(makeString("BaseKB"))), T), list(list(list(reader_make_constant_shell(makeString("expressionReorderedToGroupLikeTerms")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }), makeSymbol("?NEW")), reader_make_constant_shell(makeString("BaseKB"))), T));
    }

    private static SubLObject _constant_370_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), T), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, EIGHT_INTEGER, TWELVE_INTEGER))), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(37)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), SEVEN_INTEGER, TWELVE_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }))), T), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER) }))), T), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FOUR_INTEGER, TWO_INTEGER, NINE_INTEGER)) }))), T), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)) }))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FIVE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, ELEVEN_INTEGER)) }))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWELVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FOUR_INTEGER, TWO_INTEGER, NINE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))) }))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER))))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, EIGHT_INTEGER, TWELVE_INTEGER))), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), SEVEN_INTEGER, TWELVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, ONE_INTEGER, TWELVE_INTEGER))), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(37))))), NIL), list(list(list(reader_make_constant_shell(makeString("expressionHasNonAdjacentLikeTermsAsOperands")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), SEVEN_INTEGER, TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, THREE_INTEGER, FIVE_INTEGER))))), T) });
    }

    private static SubLObject _constant_384_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixSlashDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, FOUR_INTEGER)))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, FOUR_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)))), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FIVE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER)))), list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER)))) });
    }

    private static SubLObject _constant_392_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), ONE_INTEGER, makeSymbol("?X"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), TWO_INTEGER, makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), ONE_INTEGER, list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), T), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), ONE_INTEGER, makeSymbol("?X"))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), TWO_INTEGER, makeSymbol("?X"))), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(50)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER) }), SIX_INTEGER, makeSymbol("?X"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(50)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER) }), THREE_INTEGER, makeSymbol("?X"))), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER)), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), THREE_INTEGER, makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), TWO_INTEGER, makeSymbol("?X"))), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(list(list(reader_make_constant_shell(makeString("mathExpressionNthOperand")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), ONE_INTEGER, list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), T) });
    }

    private static SubLObject _constant_397_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), TWO_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), ONE_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), TWO_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), ONE_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), THREE_INTEGER, makeSymbol("?LIST"))), reader_make_constant_shell(makeString("TheEmptyList"))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), ONE_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), TWO_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), THREE_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), ONE_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))))), list(list(list(reader_make_constant_shell(makeString("orderedListOfDirectSubExpressionsWithOperandCount")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))))), ONE_INTEGER, makeSymbol("?LIST"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER))))), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)))))) });
    }

    @Override
    public void declareFunctions() {
        declare_math_expression_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_math_expression_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_math_expression_utilities_file();
    }

    static {



























































































































































































































































































































































































































    }
}

/**
 * Total time: 7594 ms
 */
