package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mathml extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new mathml();

    public static final String myName = "com.cyc.cycjava_2.cycl.mathml";


    // deflexical
    public static final SubLSymbol $mathml_namespace$ = makeSymbol("*MATHML-NAMESPACE*");



    // defparameter
    public static final SubLSymbol $mathml_heavy_operatorsP$ = makeSymbol("*MATHML-HEAVY-OPERATORS?*");

    // deflexical
    private static final SubLSymbol $mathml_atom_map$ = makeSymbol("*MATHML-ATOM-MAP*");





    // defparameter
    private static final SubLSymbol $strike_and_replace_mathml_numerator_with$ = makeSymbol("*STRIKE-AND-REPLACE-MATHML-NUMERATOR-WITH*");

    // defparameter
    private static final SubLSymbol $strike_and_replace_mathml_denominator_with$ = makeSymbol("*STRIKE-AND-REPLACE-MATHML-DENOMINATOR-WITH*");

    // deflexical
    private static final SubLSymbol $mathml_demo_items$ = makeSymbol("*MATHML-DEMO-ITEMS*");

    private static final SubLString $str0$http___www_w3_org_1998_Math_MathM = makeString("http://www.w3.org/1998/Math/MathML");



    private static final SubLList $list2 = list(makeString("math"), list(QUOTE, list(makeString("overflow"), makeString("linebreak"))), NIL, NIL, NIL, makeSymbol("*MATHML-NAMESPACE*"));

    private static final SubLSymbol XML_ELEMENT = makeSymbol("XML-ELEMENT");

    private static final SubLString $$$mrow = makeString("mrow");



    private static final SubLSymbol $mathml_stacked$ = makeSymbol("*MATHML-STACKED*");





    private static final SubLList $list9 = list(list(makeSymbol("*MATHML-STACKED*"), T));

    private static final SubLList $list10 = list(makeString("mstack"));

    private static final SubLString $$$math = makeString("math");

    private static final SubLList $list12 = list(makeString("overflow"), makeString("linebreak"));

    private static final SubLList $list13 = list(new SubLObject[]{ list(reader_make_constant_shell(makeString("InfixPlusFn")), makeString("+")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), makeString("&#x2212;"), makeString("MINUS")), list(reader_make_constant_shell(makeString("InfixMinusFn")), makeString("&#x2212;"), makeString("MINUS")), list(reader_make_constant_shell(makeString("InfixPlusMinusFn")), makeString("&#xB1;"), makeString("PLUS/MINUS")), list(reader_make_constant_shell(makeString("InfixTimesFn")), makeString("&#xD7;"), makeString("MULT SIGN")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), makeString("&#x2062;"), makeString("INVISIBLE TIMES")), list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), makeString("&#x22C5;"), makeString("DOT PRODUCT SIGN")), list(reader_make_constant_shell(makeString("InfixDivideFn")), makeString("&#x00F7;"), makeString("OBELUS")), list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), makeString("=")), list(reader_make_constant_shell(makeString("MathGreaterThanOrEqualStatementFn")), makeString("&#x2265;"), makeString("GREATER THAN OR EQUAL")), list(reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), makeString("&#x3E;"), makeString("GREATER THAN")), list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), makeString("&#x2264;"), makeString("LESS THAN OR EQUAL")), list(reader_make_constant_shell(makeString("MathLessThanStatementFn")), makeString("&#x3C;"), makeString("LESS THAN")), list(reader_make_constant_shell(makeString("MathNotEqualsStatementFn")), makeString("&#x2260;"), makeString("NOT EQUAL")), list(reader_make_constant_shell(makeString("MathUnknownStatementFn")), makeString("&#x2A8B;"), makeString("UNKNOWN STATEMENT")), list(reader_make_constant_shell(makeString("FunctionOfVarsFn")), makeString("&#x2061;"), makeString("FUNCTION APPLICATION")) });

    private static final SubLList $list14 = list(makeSymbol("MARKUP"), makeSymbol("&OPTIONAL"), makeSymbol("COMMENT"));

    private static final SubLString $$$mo = makeString("mo");

    private static final SubLString $$$largeop = makeString("largeop");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $$$mathvariant = makeString("mathvariant");

    private static final SubLString $$$bold = makeString("bold");

    private static final SubLString $$$normal = makeString("normal");



    private static final SubLObject $$Pi_Number = reader_make_constant_shell(makeString("Pi-Number"));

    private static final SubLString $$$mi = makeString("mi");

    private static final SubLString $str25$_pi_ = makeString("&pi;");

    private static final SubLObject $$TimeOfDay_PM = reader_make_constant_shell(makeString("TimeOfDay-PM"));

    private static final SubLString $$$PM = makeString("PM");

    private static final SubLObject $$TimeOfDay_AM = reader_make_constant_shell(makeString("TimeOfDay-AM"));

    private static final SubLString $$$AM = makeString("AM");



    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str32$_A = makeString("~A");

    private static final SubLSymbol HTML_GLYPH_CODE_FOR_DENOT = makeSymbol("HTML-GLYPH-CODE-FOR-DENOT");

    private static final SubLObject $$htmlGlyphCode = reader_make_constant_shell(makeString("htmlGlyphCode"));

    private static final SubLObject $$symbolDenotes = reader_make_constant_shell(makeString("symbolDenotes"));

    private static final SubLSymbol $html_glyph_code_for_denot_caching_state$ = makeSymbol("*HTML-GLYPH-CODE-FOR-DENOT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_HTML_GLYPH_CODE_FOR_DENOT = makeSymbol("CLEAR-HTML-GLYPH-CODE-FOR-DENOT");

    private static final SubLSymbol SERIALIZABLE_UNITS_OF_MEASURE_MATHML = makeSymbol("SERIALIZABLE-UNITS-OF-MEASURE-MATHML");

    private static final SubLObject $$CompoundDurationFn = reader_make_constant_shell(makeString("CompoundDurationFn"));

    private static final SubLObject $$UnitOfMeasure = reader_make_constant_shell(makeString("UnitOfMeasure"));

    private static final SubLSymbol $serializable_units_of_measure_mathml_caching_state$ = makeSymbol("*SERIALIZABLE-UNITS-OF-MEASURE-MATHML-CACHING-STATE*");

    private static final SubLList $list42 = list(reader_make_constant_shell(makeString("MathNotEqualsStatementFn")), reader_make_constant_shell(makeString("MathLessThanStatementFn")), reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), reader_make_constant_shell(makeString("MathGreaterThanOrEqualStatementFn")), reader_make_constant_shell(makeString("MathEqualsStatementFn")), reader_make_constant_shell(makeString("MathUnknownStatementFn")), reader_make_constant_shell(makeString("InfixDivideFn")));

    private static final SubLList $list43 = list(reader_make_constant_shell(makeString("ImplicitTimesFn")), reader_make_constant_shell(makeString("InfixDottedTimesFn")), reader_make_constant_shell(makeString("InfixTimesFn")), reader_make_constant_shell(makeString("InfixMinusFn")), reader_make_constant_shell(makeString("InfixPlusFn")), reader_make_constant_shell(makeString("InfixPlusMinusFn")));

    private static final SubLList $list44 = list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), reader_make_constant_shell(makeString("StackedSubtractionExpressionFn")), reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn")));

    private static final SubLObject $$singular = reader_make_constant_shell(makeString("singular"));

    private static final SubLObject $$plural = reader_make_constant_shell(makeString("plural"));

    private static final SubLString $$$mspace = makeString("mspace");

    private static final SubLString $$$width = makeString("width");

    private static final SubLString $str49$_5em = makeString(".5em");

    private static final SubLList $list50 = list(makeString("mathvariant"), makeString("normal"), makeString("class"), makeString("MathML-Unit"));

    private static final SubLObject $$MathQuantFn = reader_make_constant_shell(makeString("MathQuantFn"));

    private static final SubLObject $$MathLongDivisionStatementFn = reader_make_constant_shell(makeString("MathLongDivisionStatementFn"));

    private static final SubLObject $$MathVarFn = reader_make_constant_shell(makeString("MathVarFn"));

    private static final SubLObject $$ParenthesizedMathFn = reader_make_constant_shell(makeString("ParenthesizedMathFn"));

    private static final SubLString $$$mfenced = makeString("mfenced");

    private static final SubLObject $$BracketedMathFn = reader_make_constant_shell(makeString("BracketedMathFn"));

    private static final SubLList $list57 = list(makeString("open"), makeString("["), makeString("close"), makeString("]"));

    private static final SubLObject $$PowerExpressionFn = reader_make_constant_shell(makeString("PowerExpressionFn"));

    private static final SubLString $$$msup = makeString("msup");

    private static final SubLObject $$PrefixMinusFn = reader_make_constant_shell(makeString("PrefixMinusFn"));

    private static final SubLObject $$AbsoluteValueExpressionFn = reader_make_constant_shell(makeString("AbsoluteValueExpressionFn"));

    private static final SubLString $str62$_ = makeString("|");

    private static final SubLObject $$PaddedExpressionFn = reader_make_constant_shell(makeString("PaddedExpressionFn"));

    private static final SubLString $$$msgroup = makeString("msgroup");

    private static final SubLString $$$position = makeString("position");

    private static final SubLObject $$MathExpressionFn = reader_make_constant_shell(makeString("MathExpressionFn"));

    private static final SubLObject $$HorizontalDivideFn = reader_make_constant_shell(makeString("HorizontalDivideFn"));

    private static final SubLString $$$mfrac = makeString("mfrac");

    private static final SubLObject $$NthRootExpressionFn = reader_make_constant_shell(makeString("NthRootExpressionFn"));

    private static final SubLList $list70 = list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER);

    private static final SubLString $$$msqrt = makeString("msqrt");

    private static final SubLString $$$mroot = makeString("mroot");

    private static final SubLObject $$MixedFractionFn = reader_make_constant_shell(makeString("MixedFractionFn"));

    private static final SubLString $$$mn = makeString("mn");

    private static final SubLObject $$NegativeMixedFractionFn = reader_make_constant_shell(makeString("NegativeMixedFractionFn"));

    private static final SubLObject $$SimpleFractionFn = reader_make_constant_shell(makeString("SimpleFractionFn"));

    private static final SubLObject $$DecimalFractionFn = reader_make_constant_shell(makeString("DecimalFractionFn"));

    private static final SubLObject $$StrikeNumeratorAndReplaceWithFn = reader_make_constant_shell(makeString("StrikeNumeratorAndReplaceWithFn"));

    private static final SubLObject $$StrikeDenominatorAndReplaceWithFn = reader_make_constant_shell(makeString("StrikeDenominatorAndReplaceWithFn"));

    private static final SubLObject $$InfixSlashDivideFn = reader_make_constant_shell(makeString("InfixSlashDivideFn"));

    private static final SubLList $list81 = list(makeString("bevelled"), makeString("true"));

    private static final SubLObject $$FunctionOfVarsFn = reader_make_constant_shell(makeString("FunctionOfVarsFn"));

    private static final SubLString $str83$_ = makeString("(");

    private static final SubLString $str84$_ = makeString(",");

    private static final SubLString $str85$_ = makeString(")");

    private static final SubLObject $$TimeExpressionFn = reader_make_constant_shell(makeString("TimeExpressionFn"));

    private static final SubLString $str87$_ = makeString(":");

    private static final SubLString $str88$_2__0d = makeString("~2,'0d");



    private static final SubLObject $$MathStackedEqualsStatementFn = reader_make_constant_shell(makeString("MathStackedEqualsStatementFn"));



    private static final SubLString $$$msline = makeString("msline");

    private static final SubLString $$$mstack = makeString("mstack");

    private static final SubLObject $$InsertNumberAtDigitsFn = reader_make_constant_shell(makeString("InsertNumberAtDigitsFn"));

    private static final SubLObject $$StrikeAndReplaceDigitsFn = reader_make_constant_shell(makeString("StrikeAndReplaceDigitsFn"));

    private static final SubLString $str96$Can_t_serialize__S_expressions_ = makeString("Can't serialize ~S expressions.");

    private static final SubLList $list97 = list(reader_make_constant_shell(makeString("StackedSubtractionExpressionFn")), reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn")));

    private static final SubLString $str98$Can_t_compute_digit_count_of__A = makeString("Can't compute digit-count of ~A");

    private static final SubLList $list99 = list(makeSymbol("INTEGER"), makeSymbol("BACKWARD-DECIMAL-LOCATION"), makeSymbol("&OPTIONAL"), makeSymbol("REPEATING-COUNT"));

    private static final SubLString $$$menclose = makeString("menclose");

    private static final SubLList $list101 = list(makeString("notation"), makeString("top"));

    private static final SubLList $list102 = list(reader_make_constant_shell(makeString("MinusFn")), makeKeyword("ANYTHING"));

    private static final SubLString $$$notation = makeString("notation");

    private static final SubLString $$$updiagonalstrike = makeString("updiagonalstrike");

    private static final SubLObject $$StackedAdditionExpressionFn = reader_make_constant_shell(makeString("StackedAdditionExpressionFn"));

    private static final SubLObject $$InfixPlusFn = reader_make_constant_shell(makeString("InfixPlusFn"));

    private static final SubLObject $$StackedMultiplicationExpressionFn = reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn"));

    private static final SubLObject $$InfixTimesFn = reader_make_constant_shell(makeString("InfixTimesFn"));

    private static final SubLObject $$StackedSubtractionExpressionFn = reader_make_constant_shell(makeString("StackedSubtractionExpressionFn"));

    private static final SubLObject $$InfixMinusFn = reader_make_constant_shell(makeString("InfixMinusFn"));

    private static final SubLString $str111$Unable_to_serialize_simple_stacke = makeString("Unable to serialize simple stacked math expression: ~S");

    private static final SubLString $$$msrow = makeString("msrow");

    private static final SubLList $list113 = list(makeSymbol("L"), makeSymbol("POSITION"), makeSymbol("VALUE"));

    private static final SubLString $$$mscarries = makeString("mscarries");

    private static final SubLString $$$none = makeString("none");

    private static final SubLList $list116 = list(makeString("crossout"), makeString("updiagonalstrike"));

    private static final SubLString $$$mscarry = makeString("mscarry");

    private static final SubLList $list118 = list(makeString("crossout"), makeString("none"));

    private static final SubLString $$$mlongdiv = makeString("mlongdiv");

    private static final SubLList $list120 = list(makeString("longdivstyle"), makeString("lefttop"));

    private static final SubLList $list121 = list(makeKeyword("SPACE"));

    private static final SubLList $list122 = list(makeString("position"), makeString("0"), makeString("shift"), makeString("-1"));

    private static final SubLString $$$length = makeString("length");

    private static final SubLObject $list124 = _constant_124_initializer();



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$mathExpressionNATRenderAs = reader_make_constant_shell(makeString("mathExpressionNATRenderAs"));



    private static final SubLList $list129 = list(makeSymbol("MATH-EXPRESSION"), makeSymbol("HTML"));

    private static final SubLString $str130$background_color__ = makeString("background-color: ");

    private static final SubLString $$$CycL = makeString("CycL");

    private static final SubLString $$$HTML = makeString("HTML");

    private static final SubLString $$$MathML = makeString("MathML");





    private static final SubLSymbol SERIALIZE_MATHML_TO_STRING = makeSymbol("SERIALIZE-MATHML-TO-STRING");













    private static final SubLList $list143 = list(list(list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(60))))), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mrow><mrow><mn>3</mn>\n <mo largeop=\"false\" mathvariant=\"normal\">&#x2062;<!--INVISIBLE TIMES-->\n </mo><mi>x\n </mi></mrow><mo largeop=\"false\" mathvariant=\"normal\">=\n </mo><mrow><mn>60</mn>\n <mspace width=\".5em\"/><mi mathvariant=\"normal\" class=\"MathML-Unit\">volts\n </mi></mrow></mrow>\n</math>")), list(list(list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER)))), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mfrac><mrow><mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2212;<!--MINUS-->\n  </mo><mn>6</mn>\n  </mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2062;<!--INVISIBLE TIMES-->\n  </mo><mi>y\n  </mi></mrow><mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2212;<!--MINUS-->\n  </mo><mn>6</mn>\n  </mrow>\n </mfrac>\n</math>")), list(list(list(reader_make_constant_shell(makeString("MathStackedEqualsStatementFn")), list(reader_make_constant_shell(makeString("StackedMultiplicationExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(123)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(321))), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(123)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(2460)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(36900))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(39483)))), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mstack><mn>123</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">&#xD7;<!--MULT SIGN-->\n   </mo><mn>321</mn>\n   \n  </msrow><msline>\n  </msline><mn>123</mn>\n  <mn>2460</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">+\n   </mo><mn>36900</mn>\n   \n  </msrow><msline>\n  </msline><mn>39483</mn>\n  \n </mstack>\n</math>")), list(list(list(reader_make_constant_shell(makeString("MathStackedEqualsStatementFn")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("InsertNumberAtDigitsFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(6969)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, ONE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), FOUR_INTEGER, ONE_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(23230)), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(464600))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(4799)))), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mstack><mscarries><mn>1</mn>\n   <mn>1</mn>\n   <none>\n   </none><none>\n   </none><none>\n   </none>\n  </mscarries><mn>6969</mn>\n  <mn>23230</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">+\n   </mo><mn>464600</mn>\n   \n  </msrow><msline>\n  </msline><mn>4799</mn>\n  \n </mstack>\n</math>")), list(list(list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), EIGHT_INTEGER, FIVE_INTEGER)), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n 8:05PM\n</math>")), list(list(list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), EIGHT_INTEGER, FIVE_INTEGER, THREE_INTEGER)), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n 8:05:03PM\n</math>")), list(list(list(reader_make_constant_shell(makeString("CompoundDurationFn")), list(reader_make_constant_shell(makeString("HoursDuration")), EIGHT_INTEGER), list(reader_make_constant_shell(makeString("MinutesDuration")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("SecondsDuration")), FOUR_INTEGER))), makeString("<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mn>8 hours, 5 minutes, 4 seconds\n </mn>\n</math>")));

    public static SubLObject serializing_mathml(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(XML_TAG, $list2, append(body, NIL));
    }

    public static SubLObject mathml_row(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(XML_ELEMENT, $$$mrow, NIL, append(body, NIL));
    }

    public static SubLObject with_stacked_math(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PIF, $mathml_stacked$, bq_cons(PROGN, append(body, NIL)), list(CLET, $list9, list(XML_TAG, $list10, bq_cons(PROGN, append(body, NIL)))));
    }

    public static SubLObject serialize_mathml(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$math, $list12, NIL, NIL, $mathml_namespace$.getGlobalValue());
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($mathml_namespace$.getGlobalValue(), thread);
                    xml_utilities.xml_terpri();
                    serialize_mathml_int(obj);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$math);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject lookup_mathml_atom(final SubLObject obj) {
        return list_utilities.alist_lookup($mathml_atom_map$.getGlobalValue(), obj, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject serialize_mathml_atom(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = lookup_mathml_atom(obj);
        if (NIL != data) {
            SubLObject current;
            final SubLObject datum = current = data;
            SubLObject markup = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            markup = current.first();
            current = current.rest();
            final SubLObject comment = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list14);
            current = current.rest();
            if (NIL == current) {
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$mo, list($$$largeop, NIL != $mathml_heavy_operatorsP$.getDynamicValue(thread) ? $$$true : $$$false, $$$mathvariant, NIL != $mathml_heavy_operatorsP$.getDynamicValue(thread) ? $$$bold : $$$normal), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.xml_markup(markup);
                            if (NIL != comment) {
                                xml_utilities.xml_comment(comment);
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$mo);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list14);
            }
        } else
            if ($$Pi_Number.eql(obj)) {
                try {
                    final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$mi, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.xml_markup($str25$_pi_);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_end_tag_internal($$$mi);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                    }
                }
            } else
                if ($$TimeOfDay_PM.eql(obj)) {
                    xml_utilities.xml_print($$$PM, UNPROVIDED);
                } else
                    if ($$TimeOfDay_AM.eql(obj)) {
                        xml_utilities.xml_print($$$AM, UNPROVIDED);
                    } else
                        if ($SPACE == obj) {
                            xml_utilities.xml_print($$$_, UNPROVIDED);
                        } else {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str32$_A, obj);
                        }




        return NIL;
    }

    public static SubLObject clear_html_glyph_code_for_denot() {
        final SubLObject cs = $html_glyph_code_for_denot_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_html_glyph_code_for_denot(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args($html_glyph_code_for_denot_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_glyph_code_for_denot_internal(final SubLObject obj) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(obj, $$symbolDenotes, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject glyph_code = kb_mapping_utilities.fpred_value_in_any_mt(symbol, $$htmlGlyphCode, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != glyph_code) {
                return glyph_code;
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject html_glyph_code_for_denot(final SubLObject obj) {
        SubLObject caching_state = $html_glyph_code_for_denot_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HTML_GLYPH_CODE_FOR_DENOT, $html_glyph_code_for_denot_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_HTML_GLYPH_CODE_FOR_DENOT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(html_glyph_code_for_denot_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_serializable_units_of_measure_mathml() {
        final SubLObject cs = $serializable_units_of_measure_mathml_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_serializable_units_of_measure_mathml() {
        return memoization_state.caching_state_remove_function_results_with_args($serializable_units_of_measure_mathml_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject serializable_units_of_measure_mathml_internal() {
        return remove($$CompoundDurationFn, isa.all_instances_in_all_mts($$UnitOfMeasure), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject serializable_units_of_measure_mathml() {
        SubLObject caching_state = $serializable_units_of_measure_mathml_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SERIALIZABLE_UNITS_OF_MEASURE_MATHML, $serializable_units_of_measure_mathml_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(serializable_units_of_measure_mathml_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject serialize_mathml_int(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != collection_defns.cycl_atomic_term_p(obj)) {
            serialize_mathml_atom(obj);
        } else {
            final SubLObject arg0 = cycl_utilities.formula_arg0(obj);
            if (NIL != subl_promotions.memberP(arg0, $list42, UNPROVIDED, UNPROVIDED)) {
                final SubLObject name_var = $$$mrow;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
                serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
                serialize_mathml_int(arg0);
                serialize_mathml_int(cycl_utilities.formula_arg2(obj, UNPROVIDED));
                xml_utilities.xml_end_tag_internal(name_var);
            } else
                if (NIL != subl_promotions.memberP(arg0, $list43, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject name_var = $$$mrow;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
                    serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(obj, UNPROVIDED).rest();
                    SubLObject arg2 = NIL;
                    arg2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        serialize_mathml_int(arg0);
                        serialize_mathml_int(arg2);
                        cdolist_list_var = cdolist_list_var.rest();
                        arg2 = cdolist_list_var.first();
                    } 
                    xml_utilities.xml_end_tag_internal(name_var);
                } else
                    if (NIL != member(arg0, $list44, UNPROVIDED, UNPROVIDED)) {
                        serialize_mathml_simple_stacked_math_expression(obj);
                    } else
                        if (NIL != subl_promotions.memberP(narts_high.nart_substitute(arg0), serializable_units_of_measure_mathml(), symbol_function(EQUAL), UNPROVIDED)) {
                            final SubLObject name_var = $$$mrow;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
                            serialize_mathml_quantity(list(cycl_utilities.formula_arg1(obj, UNPROVIDED)));
                            final SubLObject number = cycl_utilities.formula_arg1(obj, UNPROVIDED);
                            final SubLObject agr = (number.eql(ONE_INTEGER)) ? $$singular : $$plural;
                            final SubLObject unit_string = pph_main.generate_phrase(arg0, list(agr), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            xml_utilities.xml_start_tag_internal($$$mspace, list($$$width, $str49$_5em), T, UNPROVIDED, UNPROVIDED);
                            try {
                                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$mi, $list50, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), unit_string);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$mi);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        } else {
                            final SubLObject pcase_var = arg0;
                            if (pcase_var.eql($$MathQuantFn)) {
                                serialize_mathml_quantity(cycl_utilities.nat_args(obj, UNPROVIDED));
                            } else
                                if (pcase_var.eql($$MathLongDivisionStatementFn)) {
                                    serialize_mathml_long_division(obj);
                                } else
                                    if (pcase_var.eql($$MathVarFn)) {
                                        try {
                                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$mi, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$mi);
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($$ParenthesizedMathFn)) {
                                            try {
                                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$mfenced, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        final SubLObject name_var2 = $$$mrow;
                                                        xml_utilities.xml_start_tag_internal(name_var2, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                        serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                        xml_utilities.xml_end_tag_internal(name_var2);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$mfenced);
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
                                                }
                                            }
                                        } else
                                            if (pcase_var.eql($$BracketedMathFn)) {
                                                try {
                                                    final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$mfenced, $list57, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            final SubLObject name_var2 = $$$mrow;
                                                            xml_utilities.xml_start_tag_internal(name_var2, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                            serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                            xml_utilities.xml_end_tag_internal(name_var2);
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values4 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$mfenced);
                                                        restoreValuesFromVector(_values4);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_8, thread);
                                                    }
                                                }
                                            } else
                                                if (pcase_var.eql($$PowerExpressionFn)) {
                                                    try {
                                                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$msup, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                serialize_mathml_int(cycl_utilities.nat_arg2(obj, UNPROVIDED));
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values5 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$msup);
                                                            restoreValuesFromVector(_values5);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
                                                        }
                                                    }
                                                } else
                                                    if (pcase_var.eql($$PrefixMinusFn)) {
                                                        final SubLObject name_var3 = $$$mrow;
                                                        xml_utilities.xml_start_tag_internal(name_var3, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                        serialize_mathml_int(arg0);
                                                        serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                        xml_utilities.xml_end_tag_internal(name_var3);
                                                    } else
                                                        if (pcase_var.eql($$AbsoluteValueExpressionFn)) {
                                                            try {
                                                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$mo, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str62$_);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values6 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$mo);
                                                                    restoreValuesFromVector(_values6);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
                                                                }
                                                            }
                                                            serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                            try {
                                                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$mo, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str62$_);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values7 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$mo);
                                                                    restoreValuesFromVector(_values7);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_11, thread);
                                                                }
                                                            }
                                                        } else
                                                            if (pcase_var.eql($$PaddedExpressionFn)) {
                                                                final SubLObject position = cycl_utilities.nat_arg2(obj, UNPROVIDED);
                                                                try {
                                                                    final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$msgroup, list($$$position, position), NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_12, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values8 = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$msgroup);
                                                                        restoreValuesFromVector(_values8);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_14, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                if (pcase_var.eql($$MathExpressionFn)) {
                                                                    return serialize_mathml_int(math_expression_utilities.infix_math_expression_to_prefix_format(obj));
                                                                }
                                                                if (pcase_var.eql($$HorizontalDivideFn)) {
                                                                    try {
                                                                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal($$$mfrac, NIL, NIL, NIL, $UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                serialize_mathml_int(cycl_utilities.nat_arg2(obj, UNPROVIDED));
                                                                            } finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                                                            }
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                        }
                                                                    } finally {
                                                                        final SubLObject _prev_bind_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values9 = getValuesAsVector();
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$mfrac);
                                                                            restoreValuesFromVector(_values9);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_15, thread);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (pcase_var.eql($$NthRootExpressionFn)) {
                                                                        if (cycl_utilities.nat_arg1(obj, UNPROVIDED).equal($list70)) {
                                                                            try {
                                                                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$msqrt, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                    final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                        serialize_mathml_int(cycl_utilities.nat_arg2(obj, UNPROVIDED));
                                                                                    } finally {
                                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                                                                    }
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                                }
                                                                            } finally {
                                                                                final SubLObject _prev_bind_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values10 = getValuesAsVector();
                                                                                    xml_utilities.xml_terpri();
                                                                                    xml_utilities.xml_end_tag_internal($$$msqrt);
                                                                                    restoreValuesFromVector(_values10);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$mroot, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                    final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                        serialize_mathml_int(cycl_utilities.nat_arg2(obj, UNPROVIDED));
                                                                                        serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                    } finally {
                                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                                }
                                                                            } finally {
                                                                                final SubLObject _prev_bind_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values11 = getValuesAsVector();
                                                                                    xml_utilities.xml_terpri();
                                                                                    xml_utilities.xml_end_tag_internal($$$mroot);
                                                                                    restoreValuesFromVector(_values11);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_17, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (pcase_var.eql($$MixedFractionFn)) {
                                                                            final SubLObject name_var3 = $$$mrow;
                                                                            xml_utilities.xml_start_tag_internal(name_var3, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                                                            try {
                                                                                final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                    final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                        serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                    } finally {
                                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                                                                    }
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_12, thread);
                                                                                }
                                                                            } finally {
                                                                                final SubLObject _prev_bind_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values12 = getValuesAsVector();
                                                                                    xml_utilities.xml_terpri();
                                                                                    xml_utilities.xml_end_tag_internal($$$mn);
                                                                                    restoreValuesFromVector(_values12);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_18, thread);
                                                                                }
                                                                            }
                                                                            serialize_mathml_simple_fraction(cycl_utilities.nat_arg2(obj, UNPROVIDED), cycl_utilities.nat_arg3(obj, UNPROVIDED));
                                                                            xml_utilities.xml_end_tag_internal(name_var3);
                                                                        } else
                                                                            if (pcase_var.eql($$NegativeMixedFractionFn)) {
                                                                                serialize_mathml_int(make_unary_formula($$MathQuantFn, make_unary_formula($$PrefixMinusFn, make_el_formula($$MixedFractionFn, cycl_utilities.nat_args(obj, UNPROVIDED), UNPROVIDED))));
                                                                            } else
                                                                                if (pcase_var.eql($$SimpleFractionFn)) {
                                                                                    serialize_mathml_simple_fraction(cycl_utilities.nat_arg1(obj, UNPROVIDED), cycl_utilities.nat_arg2(obj, UNPROVIDED));
                                                                                } else
                                                                                    if (pcase_var.eql($$DecimalFractionFn)) {
                                                                                        serialize_mathml_decimal(obj);
                                                                                    } else
                                                                                        if (pcase_var.eql($$StrikeNumeratorAndReplaceWithFn)) {
                                                                                            final SubLObject _prev_bind_4 = $strike_and_replace_mathml_numerator_with$.currentBinding(thread);
                                                                                            try {
                                                                                                $strike_and_replace_mathml_numerator_with$.bind(cycl_utilities.nat_arg2(obj, UNPROVIDED), thread);
                                                                                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                            } finally {
                                                                                                $strike_and_replace_mathml_numerator_with$.rebind(_prev_bind_4, thread);
                                                                                            }
                                                                                        } else
                                                                                            if (pcase_var.eql($$StrikeDenominatorAndReplaceWithFn)) {
                                                                                                final SubLObject _prev_bind_4 = $strike_and_replace_mathml_denominator_with$.currentBinding(thread);
                                                                                                try {
                                                                                                    $strike_and_replace_mathml_denominator_with$.bind(cycl_utilities.nat_arg2(obj, UNPROVIDED), thread);
                                                                                                    serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                                } finally {
                                                                                                    $strike_and_replace_mathml_denominator_with$.rebind(_prev_bind_4, thread);
                                                                                                }
                                                                                            } else
                                                                                                if (pcase_var.eql($$InfixSlashDivideFn)) {
                                                                                                    try {
                                                                                                        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal($$$mfrac, $list81, NIL, NIL, $UNINITIALIZED);
                                                                                                            final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                serialize_mathml_int(cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                                                serialize_mathml_int(cycl_utilities.nat_arg2(obj, UNPROVIDED));
                                                                                                            } finally {
                                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        final SubLObject _prev_bind_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values13 = getValuesAsVector();
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            xml_utilities.xml_end_tag_internal($$$mfrac);
                                                                                                            restoreValuesFromVector(_values13);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_19, thread);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (pcase_var.eql($$FunctionOfVarsFn)) {
                                                                                                        try {
                                                                                                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                xml_utilities.xml_start_tag_internal($$$mi, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str32$_A, cycl_utilities.nat_arg1(obj, UNPROVIDED));
                                                                                                                } finally {
                                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$17, thread);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            final SubLObject _prev_bind_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values14 = getValuesAsVector();
                                                                                                                xml_utilities.xml_terpri();
                                                                                                                xml_utilities.xml_end_tag_internal($$$mi);
                                                                                                                restoreValuesFromVector(_values14);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_20, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        serialize_mathml_int(arg0);
                                                                                                        try {
                                                                                                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                xml_utilities.xml_start_tag_internal($$$mo, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                    xml_utilities.xml_markup($str83$_);
                                                                                                                } finally {
                                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            final SubLObject _prev_bind_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values15 = getValuesAsVector();
                                                                                                                xml_utilities.xml_terpri();
                                                                                                                xml_utilities.xml_end_tag_internal($$$mo);
                                                                                                                restoreValuesFromVector(_values15);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_21, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        SubLObject list_var = NIL;
                                                                                                        SubLObject arg2 = NIL;
                                                                                                        SubLObject num = NIL;
                                                                                                        list_var = cycl_utilities.nat_args(obj, UNPROVIDED).rest();
                                                                                                        arg2 = list_var.first();
                                                                                                        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg2 = list_var.first() , num = add(ONE_INTEGER, num)) {
                                                                                                            if (!num.numE(ZERO_INTEGER)) {
                                                                                                                xml_utilities.xml_markup($str84$_);
                                                                                                            }
                                                                                                            serialize_mathml_int(arg2);
                                                                                                        }
                                                                                                        try {
                                                                                                            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                xml_utilities.xml_start_tag_internal($$$mo, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                    xml_utilities.xml_markup($str85$_);
                                                                                                                } finally {
                                                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                                                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            final SubLObject _prev_bind_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values16 = getValuesAsVector();
                                                                                                                xml_utilities.xml_terpri();
                                                                                                                xml_utilities.xml_end_tag_internal($$$mo);
                                                                                                                restoreValuesFromVector(_values16);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_22, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (pcase_var.eql($$TimeExpressionFn)) {
                                                                                                            serialize_mathml_int(cycl_utilities.formula_arg2(obj, UNPROVIDED));
                                                                                                            xml_utilities.xml_print($str87$_, UNPROVIDED);
                                                                                                            serialize_mathml_int(format(NIL, $str88$_2__0d, cycl_utilities.formula_arg3(obj, UNPROVIDED)));
                                                                                                            if (NIL != cycl_utilities.formula_arg4(obj, UNPROVIDED)) {
                                                                                                                xml_utilities.xml_print($str87$_, UNPROVIDED);
                                                                                                                serialize_mathml_int(format(NIL, $str88$_2__0d, cycl_utilities.formula_arg4(obj, UNPROVIDED)));
                                                                                                            }
                                                                                                            serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
                                                                                                        } else
                                                                                                            if (pcase_var.eql($$CompoundDurationFn)) {
                                                                                                                final SubLObject strings = Mapping.mapcar(GENERATE_PHRASE, cycl_utilities.formula_args(obj, UNPROVIDED));
                                                                                                                try {
                                                                                                                    final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                    final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                        xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                        final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                            xml_utilities.xml_markup(string_utilities.join_strings(strings, UNPROVIDED));
                                                                                                                        } finally {
                                                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_12, thread);
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    final SubLObject _prev_bind_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        final SubLObject _values17 = getValuesAsVector();
                                                                                                                        xml_utilities.xml_terpri();
                                                                                                                        xml_utilities.xml_end_tag_internal($$$mn);
                                                                                                                        restoreValuesFromVector(_values17);
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_23, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else
                                                                                                                if (pcase_var.eql($$MathStackedEqualsStatementFn)) {
                                                                                                                    if (NIL != $mathml_stacked$.getDynamicValue(thread)) {
                                                                                                                        SubLObject arg_num = ZERO_INTEGER;
                                                                                                                        SubLObject cdolist_list_var2;
                                                                                                                        final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args(obj, $IGNORE);
                                                                                                                        SubLObject arg3 = NIL;
                                                                                                                        arg3 = cdolist_list_var2.first();
                                                                                                                        while (NIL != cdolist_list_var2) {
                                                                                                                            arg_num = add(arg_num, ONE_INTEGER);
                                                                                                                            if (!arg_num.eql(ONE_INTEGER)) {
                                                                                                                                try {
                                                                                                                                    final SubLObject _prev_bind_24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                                    final SubLObject _prev_bind_25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                                        xml_utilities.xml_start_tag_internal($$$msline, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                                        final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                                        } finally {
                                                                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_25, thread);
                                                                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_24, thread);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    final SubLObject _prev_bind_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                        final SubLObject _values18 = getValuesAsVector();
                                                                                                                                        xml_utilities.xml_terpri();
                                                                                                                                        xml_utilities.xml_end_tag_internal($$$msline);
                                                                                                                                        restoreValuesFromVector(_values18);
                                                                                                                                    } finally {
                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_26, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            serialize_mathml_int(arg3);
                                                                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                                                            arg3 = cdolist_list_var2.first();
                                                                                                                        } 
                                                                                                                    } else {
                                                                                                                        final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $mathml_stacked$.bind(T, thread);
                                                                                                                            try {
                                                                                                                                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                                final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                                    xml_utilities.xml_start_tag_internal($$$mstack, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                                        SubLObject arg_num2 = ZERO_INTEGER;
                                                                                                                                        SubLObject cdolist_list_var3;
                                                                                                                                        final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args(obj, $IGNORE);
                                                                                                                                        SubLObject arg4 = NIL;
                                                                                                                                        arg4 = cdolist_list_var3.first();
                                                                                                                                        while (NIL != cdolist_list_var3) {
                                                                                                                                            arg_num2 = add(arg_num2, ONE_INTEGER);
                                                                                                                                            if (!arg_num2.eql(ONE_INTEGER)) {
                                                                                                                                                try {
                                                                                                                                                    final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                                                                    final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                                                                        xml_utilities.xml_start_tag_internal($$$msline, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                                                                        final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                                                        } finally {
                                                                                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                                                                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                        final SubLObject _values19 = getValuesAsVector();
                                                                                                                                                        xml_utilities.xml_terpri();
                                                                                                                                                        xml_utilities.xml_end_tag_internal($$$msline);
                                                                                                                                                        restoreValuesFromVector(_values19);
                                                                                                                                                    } finally {
                                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            serialize_mathml_int(arg4);
                                                                                                                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                                                                                                                            arg4 = cdolist_list_var3.first();
                                                                                                                                        } 
                                                                                                                                    } finally {
                                                                                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_13, thread);
                                                                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                    final SubLObject _values20 = getValuesAsVector();
                                                                                                                                    xml_utilities.xml_terpri();
                                                                                                                                    xml_utilities.xml_end_tag_internal($$$mstack);
                                                                                                                                    restoreValuesFromVector(_values20);
                                                                                                                                } finally {
                                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            $mathml_stacked$.rebind(_prev_bind_4, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else
                                                                                                                    if (pcase_var.eql($$InsertNumberAtDigitsFn)) {
                                                                                                                        serialize_mathml_carries(obj);
                                                                                                                    } else
                                                                                                                        if (pcase_var.eql($$StrikeAndReplaceDigitsFn)) {
                                                                                                                            serialize_mathml_strikethrough(obj);
                                                                                                                        } else {
                                                                                                                            Errors.error($str96$Can_t_serialize__S_expressions_, arg0);
                                                                                                                        }














                                                            }








                        }



        }
        return NIL;
    }

    public static SubLObject math_expr_digit_count(final SubLObject obj) {
        if (obj.isNumber()) {
            return length(format_nil.format_nil_a(obj));
        }
        if (cycl_utilities.formula_arg0(obj).eql($$MathQuantFn) && cycl_utilities.formula_arg1(obj, UNPROVIDED).isNumber()) {
            return length(format_nil.format_nil_a(cycl_utilities.formula_arg1(obj, UNPROVIDED)));
        }
        if (cycl_utilities.formula_arg0(obj).eql($$PaddedExpressionFn)) {
            return add(abs(cycl_utilities.nat_arg2(obj, UNPROVIDED)), math_expr_digit_count(cycl_utilities.nat_arg1(obj, UNPROVIDED)));
        }
        if (cycl_utilities.formula_arg0(obj).eql($$MathQuantFn) && cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(obj, UNPROVIDED)).eql($$DecimalFractionFn)) {
            if ((NIL != cycl_utilities.formula_arg(TWO_INTEGER, cycl_utilities.formula_arg1(obj, UNPROVIDED), UNPROVIDED)) && cycl_utilities.formula_arg(TWO_INTEGER, cycl_utilities.formula_arg1(obj, UNPROVIDED), UNPROVIDED).numG(ZERO_INTEGER)) {
                return add(ONE_INTEGER, math_expr_digit_count(cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(obj, UNPROVIDED), UNPROVIDED)));
            }
            return math_expr_digit_count(cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(obj, UNPROVIDED), UNPROVIDED));
        } else {
            if (cycl_utilities.formula_arg0(obj).eql($$InsertNumberAtDigitsFn)) {
                return math_expr_digit_count(cycl_utilities.formula_arg1(obj, UNPROVIDED));
            }
            if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(obj), $list97, EQUAL, UNPROVIDED)) {
                SubLObject max = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(obj, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject digit_count = math_expr_digit_count(arg);
                    max = max(max, digit_count);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                return max;
            }
            Errors.error($str98$Can_t_compute_digit_count_of__A, obj);
            return NIL;
        }
    }

    public static SubLObject serialize_mathml_decimal(final SubLObject obj) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(obj, UNPROVIDED);
        SubLObject integer = NIL;
        SubLObject backward_decimal_location = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        integer = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        backward_decimal_location = current.first();
        current = current.rest();
        final SubLObject repeating_count = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list99);
        current = current.rest();
        if (NIL == current) {
            final SubLObject integer_string = princ_to_string(integer);
            return NIL != repeating_count ? serialize_mathml_repeating_decimal(integer_string, backward_decimal_location, repeating_count) : serialize_mathml_non_repeating_decimal(integer_string, backward_decimal_location);
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    public static SubLObject serialize_mathml_repeating_decimal(final SubLObject integer_string, final SubLObject backward_decimal_location, final SubLObject repeating_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject repeat_start = subtract(length(integer_string), repeating_count);
        final SubLObject repeating_string = string_utilities.substring(integer_string, repeat_start, UNPROVIDED);
        final SubLObject name_var = $$$mrow;
        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
        serialize_mathml_non_repeating_decimal(string_utilities.substring(integer_string, ZERO_INTEGER, repeat_start), backward_decimal_location);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$menclose, $list101, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                xml_utilities.xml_print(repeating_string, UNPROVIDED);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$mn);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$menclose);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal(name_var);
        return NIL;
    }

    public static SubLObject serialize_mathml_non_repeating_decimal(final SubLObject integer_string, final SubLObject backward_decimal_location) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject decimal_location = subtract(length(integer_string), backward_decimal_location);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject end_var_$35;
                    SubLObject end_var;
                    SubLObject char_num;
                    SubLObject v_char;
                    for (end_var = end_var_$35 = length(integer_string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$35); char_num = number_utilities.f_1X(char_num)) {
                        v_char = Strings.sublisp_char(integer_string, char_num);
                        if (char_num.eql(decimal_location)) {
                            xml_utilities.xml_print(CHAR_period, UNPROVIDED);
                        }
                        xml_utilities.xml_print(v_char, UNPROVIDED);
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$mn);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        return NIL;
    }

    public static SubLObject serialize_mathml_quantity(final SubLObject quantity_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyword_free_arg = (quantity_args.isList()) ? remove($SPACE, quantity_args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first() : quantity_args;
        if (keyword_free_arg.isNumber()) {
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        SubLObject cdolist_list_var = quantity_args;
                        SubLObject arg = NIL;
                        arg = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            serialize_mathml_int(arg);
                            cdolist_list_var = cdolist_list_var.rest();
                            arg = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$36, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_end_tag_internal($$$mn);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            xml_utilities.xml_terpri();
        } else
            if (NIL != formula_pattern_match.formula_matches_pattern(keyword_free_arg, $list102)) {
                serialize_mathml_int(list($$PrefixMinusFn, list($$MathQuantFn, cycl_utilities.nat_arg1(keyword_free_arg, UNPROVIDED))));
            } else {
                SubLObject cdolist_list_var2 = quantity_args;
                SubLObject arg2 = NIL;
                arg2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    serialize_mathml_int(arg2);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    arg2 = cdolist_list_var2.first();
                } 
            }

        return quantity_args;
    }

    public static SubLObject serialize_mathml_simple_fraction(final SubLObject numerator, final SubLObject denominator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$mfrac, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != $strike_and_replace_mathml_numerator_with$.getDynamicValue(thread)) {
                        final SubLObject name_var = $$$mrow;
                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
                        final SubLObject name_var_$38 = $$$menclose;
                        xml_utilities.xml_start_tag_internal(name_var_$38, list($$$notation, $$$updiagonalstrike), NIL, UNPROVIDED, UNPROVIDED);
                        try {
                            final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int(numerator);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$40, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$mn);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$38);
                        try {
                            final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int($strike_and_replace_mathml_numerator_with$.getDynamicValue(thread));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$42, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$41, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$41, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$mn);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    } else {
                        try {
                            final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int(numerator);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$42, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$mn);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                            }
                        }
                    }
                    if (NIL != $strike_and_replace_mathml_denominator_with$.getDynamicValue(thread)) {
                        final SubLObject name_var = $$$mrow;
                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
                        final SubLObject name_var_$39 = $$$menclose;
                        xml_utilities.xml_start_tag_internal(name_var_$39, list($$$notation, $$$updiagonalstrike), NIL, UNPROVIDED, UNPROVIDED);
                        try {
                            final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int(denominator);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$43, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$mn);
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$39);
                        try {
                            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int($strike_and_replace_mathml_denominator_with$.getDynamicValue(thread));
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$44, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$mn);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    } else {
                        try {
                            final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$mn, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int(denominator);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$45, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$53, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$mn);
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values7 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$mfrac);
                restoreValuesFromVector(_values7);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_mathml_simple_stacked_math_expression(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        final SubLObject pcase_var = cycl_utilities.formula_arg0(obj);
        if (pcase_var.eql($$StackedAdditionExpressionFn)) {
            operator = $$InfixPlusFn;
        } else
            if (pcase_var.eql($$StackedMultiplicationExpressionFn)) {
                operator = $$InfixTimesFn;
            } else
                if (pcase_var.eql($$StackedSubtractionExpressionFn)) {
                    operator = $$InfixMinusFn;
                } else {
                    Errors.error($str111$Unable_to_serialize_simple_stacke, obj);
                }


        if (NIL != $mathml_stacked$.getDynamicValue(thread)) {
            final SubLObject v_arity = formula_arity(obj, UNPROVIDED);
            SubLObject arg_num = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(obj, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                arg_num = add(arg_num, ONE_INTEGER);
                if (arg_num.eql(ONE_INTEGER)) {
                    if (arg_num.eql(v_arity)) {
                        serialize_mathml_int(operator);
                    }
                    serialize_mathml_int(arg);
                } else
                    if (arg_num.eql(v_arity) && (NIL == padded_expression_p(arg))) {
                        try {
                            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$msrow, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$64 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    serialize_mathml_int(operator);
                                    serialize_mathml_int(arg);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$64, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$msrow);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                            }
                        }
                    } else {
                        serialize_mathml_int(arg);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } else {
            final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding(thread);
            try {
                $mathml_stacked$.bind(T, thread);
                try {
                    final SubLObject _prev_bind_0_$65 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$mstack, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$66 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            final SubLObject v_arity2 = formula_arity(obj, UNPROVIDED);
                            SubLObject arg_num2 = ZERO_INTEGER;
                            SubLObject cdolist_list_var2;
                            final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args(obj, $IGNORE);
                            SubLObject arg2 = NIL;
                            arg2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                arg_num2 = add(arg_num2, ONE_INTEGER);
                                if (arg_num2.eql(ONE_INTEGER)) {
                                    if (arg_num2.eql(v_arity2)) {
                                        serialize_mathml_int(operator);
                                    }
                                    serialize_mathml_int(arg2);
                                } else
                                    if (arg_num2.eql(v_arity2) && (NIL == padded_expression_p(arg2))) {
                                        try {
                                            final SubLObject _prev_bind_0_$67 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$68 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$msrow, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$68 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    serialize_mathml_int(operator);
                                                    serialize_mathml_int(arg2);
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$68, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$68, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$67, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$msrow);
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                            }
                                        }
                                    } else {
                                        serialize_mathml_int(arg2);
                                    }

                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg2 = cdolist_list_var2.first();
                            } 
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$66, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$65, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$mstack);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            } finally {
                $mathml_stacked$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject padded_expression_p(final SubLObject arg) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(arg)) && cycl_utilities.formula_operator(arg).eql($$PaddedExpressionFn));
    }

    public static SubLObject serialize_mathml_carries(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $mathml_stacked$.getDynamicValue(thread)) {
            final SubLObject carries = make_list(add(ONE_INTEGER, max_carry_index(cycl_utilities.nat_arg2(obj, UNPROVIDED))), NIL);
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, UNPROVIDED), $IGNORE);
            SubLObject carry_list = NIL;
            carry_list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = carry_list;
                SubLObject l = NIL;
                SubLObject position = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list113);
                l = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list113);
                position = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list113);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    set_nth(position, carries, value);
                } else {
                    cdestructuring_bind_error(datum, $list113);
                }
                cdolist_list_var = cdolist_list_var.rest();
                carry_list = cdolist_list_var.first();
            } 
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$mscarries, NIL, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$72 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        SubLObject cdolist_list_var2 = nreverse(carries);
                        SubLObject carry_value = NIL;
                        carry_value = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != carry_value) {
                                serialize_mathml_int(list($$MathQuantFn, carry_value));
                            } else {
                                try {
                                    final SubLObject _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$74 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$none, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$74, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$74, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$73, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$none);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            carry_value = cdolist_list_var2.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$72, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$mscarries);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
        } else {
            final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding(thread);
            try {
                $mathml_stacked$.bind(T, thread);
                try {
                    final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$mstack, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            final SubLObject carries2 = make_list(add(ONE_INTEGER, max_carry_index(cycl_utilities.nat_arg2(obj, UNPROVIDED))), NIL);
                            SubLObject cdolist_list_var3;
                            final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, UNPROVIDED), $IGNORE);
                            SubLObject carry_list2 = NIL;
                            carry_list2 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = carry_list2;
                                SubLObject i = NIL;
                                SubLObject position2 = NIL;
                                SubLObject value2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list113);
                                i = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list113);
                                position2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list113);
                                value2 = current2.first();
                                current2 = current2.rest();
                                if (NIL == current2) {
                                    set_nth(position2, carries2, value2);
                                } else {
                                    cdestructuring_bind_error(datum2, $list113);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                carry_list2 = cdolist_list_var3.first();
                            } 
                            try {
                                final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$75 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$mscarries, NIL, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var4 = nreverse(carries2);
                                        SubLObject carry_value2 = NIL;
                                        carry_value2 = cdolist_list_var4.first();
                                        while (NIL != cdolist_list_var4) {
                                            if (NIL != carry_value2) {
                                                serialize_mathml_int(list($$MathQuantFn, carry_value2));
                                            } else {
                                                try {
                                                    final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$76 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$none, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$81, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$76, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$80, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values3 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$none);
                                                        restoreValuesFromVector(_values3);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                                                    }
                                                }
                                            }
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            carry_value2 = cdolist_list_var4.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$79, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$75, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$78, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$mscarries);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                            serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$77, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$76, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$mstack);
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                    }
                }
            } finally {
                $mathml_stacked$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject max_carry_index(final SubLObject carry_list) {
        SubLObject max_index = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(carry_list, $IGNORE);
        SubLObject carry = NIL;
        carry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.nat_arg1(carry, UNPROVIDED).numG(max_index)) {
                max_index = cycl_utilities.nat_arg1(carry, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            carry = cdolist_list_var.first();
        } 
        return max_index;
    }

    public static SubLObject serialize_mathml_strikethrough(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $mathml_stacked$.getDynamicValue(thread)) {
            final SubLObject replacements = make_list(math_expr_digit_count(cycl_utilities.formula_arg1(obj, UNPROVIDED)), NIL);
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, UNPROVIDED), $IGNORE);
            SubLObject replacement_list = NIL;
            replacement_list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = replacement_list;
                SubLObject l = NIL;
                SubLObject position = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list113);
                l = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list113);
                position = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list113);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    set_nth(position, replacements, value);
                } else {
                    cdestructuring_bind_error(datum, $list113);
                }
                cdolist_list_var = cdolist_list_var.rest();
                replacement_list = cdolist_list_var.first();
            } 
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$mscarries, $list116, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        SubLObject cdolist_list_var2 = nreverse(replacements);
                        SubLObject replacement_value = NIL;
                        replacement_value = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != replacement_value) {
                                serialize_mathml_int(list($$MathQuantFn, replacement_value));
                            } else {
                                try {
                                    final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$mscarry, $list118, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$none, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$91, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$none);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                                                }
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$90, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$mscarry);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                    }
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            replacement_value = cdolist_list_var2.first();
                        } 
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$mscarries);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
        } else {
            final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding(thread);
            try {
                $mathml_stacked$.bind(T, thread);
                try {
                    final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$mstack, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            final SubLObject replacements2 = make_list(math_expr_digit_count(cycl_utilities.formula_arg1(obj, UNPROVIDED)), NIL);
                            SubLObject cdolist_list_var3;
                            final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args(cycl_utilities.formula_arg2(obj, UNPROVIDED), $IGNORE);
                            SubLObject replacement_list2 = NIL;
                            replacement_list2 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = replacement_list2;
                                SubLObject i = NIL;
                                SubLObject position2 = NIL;
                                SubLObject value2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list113);
                                i = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list113);
                                position2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list113);
                                value2 = current2.first();
                                current2 = current2.rest();
                                if (NIL == current2) {
                                    set_nth(position2, replacements2, value2);
                                } else {
                                    cdestructuring_bind_error(datum2, $list113);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                replacement_list2 = cdolist_list_var3.first();
                            } 
                            try {
                                final SubLObject _prev_bind_0_$97 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$mscarries, $list116, NIL, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$98 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var4 = nreverse(replacements2);
                                        SubLObject replacement_value2 = NIL;
                                        replacement_value2 = cdolist_list_var4.first();
                                        while (NIL != cdolist_list_var4) {
                                            if (NIL != replacement_value2) {
                                                serialize_mathml_int(list($$MathQuantFn, replacement_value2));
                                            } else {
                                                try {
                                                    final SubLObject _prev_bind_0_$99 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$mscarry, $list118, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$100 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            try {
                                                                final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$none, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$102, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$101, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values4 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$none);
                                                                    restoreValuesFromVector(_values4);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$100, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$99, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values5 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$mscarry);
                                                        restoreValuesFromVector(_values5);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                                    }
                                                }
                                            }
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            replacement_value2 = cdolist_list_var4.first();
                                        } 
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$98, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$97, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values6 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$mscarries);
                                    restoreValuesFromVector(_values6);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                }
                            }
                            serialize_mathml_int(cycl_utilities.formula_arg1(obj, UNPROVIDED));
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$96, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$95, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values7 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$mstack);
                        restoreValuesFromVector(_values7);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                    }
                }
            } finally {
                $mathml_stacked$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject serialize_mathml_long_division(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject divisor = cycl_utilities.nat_arg2(obj, UNPROVIDED);
        final SubLObject v_answer = cycl_utilities.nat_arg3(obj, UNPROVIDED);
        final SubLObject dividend = cycl_utilities.nat_arg1(obj, UNPROVIDED);
        final SubLObject long_args = subseq(cycl_utilities.nat_args(obj, UNPROVIDED), THREE_INTEGER, UNPROVIDED);
        final SubLObject long_arg_count = length(long_args);
        SubLObject current_addend_count = ONE_INTEGER;
        SubLObject current_max_addend_digit_count = ZERO_INTEGER;
        SubLObject within_addend_group = NIL;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$mlongdiv, $list120, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    serialize_mathml_int(divisor);
                    if (NIL != v_answer) {
                        serialize_mathml_int(v_answer);
                    } else {
                        final SubLObject _prev_bind_0_$113 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$114 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$mn, NIL, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$114 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$114, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$114, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$113, thread);
                        }
                    }
                    if (((NIL != cycl_grammar.cycl_nat_p(dividend)) && cycl_utilities.nat_arg0(dividend).eql($$MathQuantFn)) && cycl_utilities.nat_arg1(dividend, UNPROVIDED).isInteger()) {
                        serialize_mathml_int(listS($$MathQuantFn, cycl_utilities.nat_arg1(dividend, UNPROVIDED), $list121));
                    } else {
                        serialize_mathml_int(dividend);
                    }
                    try {
                        final SubLObject _prev_bind_0_$115 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$115 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$msgroup, $list122, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$116 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                xml_utilities.xml_terpri();
                                SubLObject list_var = NIL;
                                SubLObject arg = NIL;
                                SubLObject arg_num = NIL;
                                list_var = long_args;
                                arg = list_var.first();
                                for (arg_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , arg_num = add(ONE_INTEGER, arg_num)) {
                                    if (NIL == within_addend_group) {
                                        xml_utilities.xml_start_tag_internal($$$msgroup, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.$xml_indentation_level$.setDynamicValue(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.xml_terpri();
                                        within_addend_group = T;
                                    }
                                    serialize_mathml_int(arg);
                                    current_addend_count = add(current_addend_count, ONE_INTEGER);
                                    current_max_addend_digit_count = max(current_max_addend_digit_count, math_expr_digit_count(arg));
                                    if (current_addend_count.numGE(TWO_INTEGER)) {
                                        if (!add(arg_num, ONE_INTEGER).eql(long_arg_count)) {
                                            final SubLObject _prev_bind_0_$117 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$msline, list($$$length, current_max_addend_digit_count), T, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$118 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$118, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            xml_utilities.xml_terpri();
                                        }
                                        if (!add(arg_num, TWO_INTEGER).eql(long_arg_count)) {
                                            current_max_addend_digit_count = ZERO_INTEGER;
                                            current_addend_count = ZERO_INTEGER;
                                            xml_utilities.xml_end_tag_internal($$$msgroup);
                                            xml_utilities.$xml_indentation_level$.setDynamicValue(subtract(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), xml_utilities.$xml_indentation_amount$.getDynamicValue(thread)), thread);
                                            xml_utilities.xml_terpri();
                                            within_addend_group = NIL;
                                        }
                                    }
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$116, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$115, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$115, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$msgroup);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                        }
                    }
                    if (NIL != within_addend_group) {
                        xml_utilities.xml_end_tag_internal($$$msgroup);
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$mlongdiv);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject mathml_demo() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject color = NIL;
        SubLObject test_items = $mathml_demo_items$.getGlobalValue();
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$mathExpressionNATRenderAs;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$123 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$124 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                SubLObject done_var_$125 = NIL;
                                final SubLObject token_var_$126 = NIL;
                                while (NIL == done_var_$125) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$126);
                                    final SubLObject valid_$127 = makeBoolean(!token_var_$126.eql(gaf));
                                    if (NIL != valid_$127) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(gaf);
                                        SubLObject math_expression = NIL;
                                        SubLObject html = NIL;
                                        destructuring_bind_must_consp(current, datum, $list129);
                                        math_expression = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list129);
                                        html = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            test_items = cons(list(math_expression, html), test_items);
                                        } else {
                                            cdestructuring_bind_error(datum, $list129);
                                        }
                                    }
                                    done_var_$125 = makeBoolean(NIL == valid_$127);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
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
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$124, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$123, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject style = cconcatenate($str130$background_color__, format_nil.format_nil_a_no_copy(html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue()));
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != style) {
                html_markup(html_macros.$html_attribute_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(style));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$CycL);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$HTML);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$MathML);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject color_toggle = NIL;
            SubLObject list_var = NIL;
            SubLObject item = NIL;
            SubLObject ignore_me = NIL;
            list_var = test_items;
            item = list_var.first();
            for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                if (NIL != color_toggle) {
                    color_toggle = NIL;
                } else {
                    color_toggle = T;
                }
                color = (NIL != color_toggle) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue();
                SubLObject current2;
                final SubLObject datum2 = current2 = item;
                SubLObject math_expression2 = NIL;
                SubLObject html2 = NIL;
                destructuring_bind_must_consp(current2, datum2, $list129);
                math_expression2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list129);
                html2 = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject style2 = cconcatenate($str130$background_color__, format_nil.format_nil_a_no_copy(color));
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != style2) {
                        html_markup(html_macros.$html_attribute_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align(style2));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_form(math_expression2, ZERO_INTEGER, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != list_utilities.lengthL(html2, $int$32, UNPROVIDED)) {
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_markup(html2);
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            } else {
                                html_markup(html2);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$133 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
                                SubLObject err_msg = NIL;
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$134 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            serialize_mathml(item.first());
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$134, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != err_msg) {
                                    html_princ_strong(err_msg);
                                }
                            } finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0_$133, thread);
                            }
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum2, $list129);
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject serialize_mathml_to_string(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject str = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                serialize_mathml(obj);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            str = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return str;
    }

    public static SubLObject declare_mathml_file() {
        declareMacro("serializing_mathml", "SERIALIZING-MATHML");
        declareMacro("mathml_row", "MATHML-ROW");
        declareMacro("with_stacked_math", "WITH-STACKED-MATH");
        declareFunction("serialize_mathml", "SERIALIZE-MATHML", 1, 0, false);
        declareFunction("lookup_mathml_atom", "LOOKUP-MATHML-ATOM", 1, 0, false);
        declareFunction("serialize_mathml_atom", "SERIALIZE-MATHML-ATOM", 1, 0, false);
        declareFunction("clear_html_glyph_code_for_denot", "CLEAR-HTML-GLYPH-CODE-FOR-DENOT", 0, 0, false);
        declareFunction("remove_html_glyph_code_for_denot", "REMOVE-HTML-GLYPH-CODE-FOR-DENOT", 1, 0, false);
        declareFunction("html_glyph_code_for_denot_internal", "HTML-GLYPH-CODE-FOR-DENOT-INTERNAL", 1, 0, false);
        declareFunction("html_glyph_code_for_denot", "HTML-GLYPH-CODE-FOR-DENOT", 1, 0, false);
        declareFunction("clear_serializable_units_of_measure_mathml", "CLEAR-SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false);
        declareFunction("remove_serializable_units_of_measure_mathml", "REMOVE-SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false);
        declareFunction("serializable_units_of_measure_mathml_internal", "SERIALIZABLE-UNITS-OF-MEASURE-MATHML-INTERNAL", 0, 0, false);
        declareFunction("serializable_units_of_measure_mathml", "SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false);
        declareFunction("serialize_mathml_int", "SERIALIZE-MATHML-INT", 1, 0, false);
        declareFunction("math_expr_digit_count", "MATH-EXPR-DIGIT-COUNT", 1, 0, false);
        declareFunction("serialize_mathml_decimal", "SERIALIZE-MATHML-DECIMAL", 1, 0, false);
        declareFunction("serialize_mathml_repeating_decimal", "SERIALIZE-MATHML-REPEATING-DECIMAL", 3, 0, false);
        declareFunction("serialize_mathml_non_repeating_decimal", "SERIALIZE-MATHML-NON-REPEATING-DECIMAL", 2, 0, false);
        declareFunction("serialize_mathml_quantity", "SERIALIZE-MATHML-QUANTITY", 1, 0, false);
        declareFunction("serialize_mathml_simple_fraction", "SERIALIZE-MATHML-SIMPLE-FRACTION", 2, 0, false);
        declareFunction("serialize_mathml_simple_stacked_math_expression", "SERIALIZE-MATHML-SIMPLE-STACKED-MATH-EXPRESSION", 1, 0, false);
        declareFunction("padded_expression_p", "PADDED-EXPRESSION-P", 1, 0, false);
        declareFunction("serialize_mathml_carries", "SERIALIZE-MATHML-CARRIES", 1, 0, false);
        declareFunction("max_carry_index", "MAX-CARRY-INDEX", 1, 0, false);
        declareFunction("serialize_mathml_strikethrough", "SERIALIZE-MATHML-STRIKETHROUGH", 1, 0, false);
        declareFunction("serialize_mathml_long_division", "SERIALIZE-MATHML-LONG-DIVISION", 1, 0, false);
        declareFunction("mathml_demo", "MATHML-DEMO", 0, 0, false);
        declareFunction("serialize_mathml_to_string", "SERIALIZE-MATHML-TO-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_mathml_file() {
        deflexical("*MATHML-NAMESPACE*", $str0$http___www_w3_org_1998_Math_MathM);
        defparameter("*MATHML-STACKED*", NIL);
        defparameter("*MATHML-HEAVY-OPERATORS?*", NIL);
        deflexical("*MATHML-ATOM-MAP*", $list13);
        deflexical("*HTML-GLYPH-CODE-FOR-DENOT-CACHING-STATE*", NIL);
        deflexical("*SERIALIZABLE-UNITS-OF-MEASURE-MATHML-CACHING-STATE*", NIL);
        defparameter("*STRIKE-AND-REPLACE-MATHML-NUMERATOR-WITH*", NIL);
        defparameter("*STRIKE-AND-REPLACE-MATHML-DENOMINATOR-WITH*", NIL);
        deflexical("*MATHML-DEMO-ITEMS*", $list124);
        return NIL;
    }

    public static SubLObject setup_mathml_file() {
        memoization_state.note_globally_cached_function(HTML_GLYPH_CODE_FOR_DENOT);
        memoization_state.note_globally_cached_function(SERIALIZABLE_UNITS_OF_MEASURE_MATHML);
        define_test_case_table_int(SERIALIZE_MATHML_TO_STRING, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list143);
        return NIL;
    }

    private static SubLObject _constant_124_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), TWO_INTEGER, ONE_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Foot-UnitOfMeasure")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeInteger(656), TWO_INTEGER)))), makeString(".2 + 6.56 feet")), list(list(reader_make_constant_shell(makeString("MathStackedEqualsStatementFn")), list(reader_make_constant_shell(makeString("StackedAdditionExpressionFn")), list(reader_make_constant_shell(makeString("InsertNumberAtDigitsFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeInteger(1094), ONE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ZERO_INTEGER, ONE_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(45)), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeInteger(77745), THREE_INTEGER))), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeInteger(145), THREE_INTEGER))), makeString("Stacked version of 109.4 + 45 + 77.745, where .145 has been done so far in the stacked addition, and a 1 has been carried over the 9")), list(list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeInteger(314), TWO_INTEGER)), makeString("3.14")), list(list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeInteger(8675309), FOUR_INTEGER, TWO_INTEGER)), makeString("867.5309 (with bar over 09)")), list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("A")), list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), reader_make_constant_shell(makeString("Pi-Number"))), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("r")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)))), makeString("A = pi r^2")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("StrikeNumeratorAndReplaceWithFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), EIGHT_INTEGER, SEVEN_INTEGER), ONE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("StrikeDenominatorAndReplaceWithFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(35), EIGHT_INTEGER), ONE_INTEGER)), makeString("<del>8</del>1/7 x 35/<del>8</del>1")), list(list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), TWELVE_INTEGER, FIVE_INTEGER), makeString("12:05PM")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), TWELVE_INTEGER, makeInteger(45)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("TimeExpressionFn")), reader_make_constant_shell(makeString("TimeOfDay-PM")), FOUR_INTEGER, makeInteger(40))), makeString("12:45PM - 4:40PM")), list(list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 + z")), list(list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER), makeString("2 1/3")), list(list(reader_make_constant_shell(makeString("NegativeMixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER), makeString("-2 1/3")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER))), makeString("1 2/3 x 2 1/2")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, FIVE_INTEGER)), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER))), makeString("3/5 / 1/2")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 + z")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeString("9 + 8 + z + y")), list(list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeString("9 + 8 + z + y")), list(list(reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 - z")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 - z")), list(list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 x z")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, FOUR_INTEGER))), makeString("1/2 x 1/4")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 x z")), list(list(reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 . z")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixDottedTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 . z")), list(list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9z")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9z")), list(list(reader_make_constant_shell(makeString("AbsoluteValueExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("abs(9)")), list(list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), makeString("-3")), list(list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), makeString("X^2")), list(list(reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(3.14)), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER))), makeString("3.14 x 8^2")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeDouble(3.14)), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), EIGHT_INTEGER), reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), makeString("3.14 x 8^2")), list(list(reader_make_constant_shell(makeString("BracketedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("[9]")), list(list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("(9)")), list(list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), makeString("var x")), list(list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), makeString("9")), list(list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeString("9/x")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeString("9/x")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeString("9/x with obelus")), list(list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeString("9/x with obelus")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixSlashDivideFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeString("9/x with slash")), list(list(reader_make_constant_shell(makeString("InfixSlashDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeString("9/x with slash")), list(list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("cube root of 9")), list(list(reader_make_constant_shell(makeString("FunctionOfVarsFn")), makeString("f"), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))), makeString("f(x,y)")), list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("7 + 2 = 9")), list(list(reader_make_constant_shell(makeString("MathGreaterThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("7 + 3 >= 9")), list(list(reader_make_constant_shell(makeString("MathLessThanOrEqualStatementFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("7 + 1 <= 9")), list(list(reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("7 + 3 > 9")), list(list(reader_make_constant_shell(makeString("MathLessThanStatementFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), ONE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("7 + 1 < 9")), list(list(reader_make_constant_shell(makeString("MathNotEqualsStatementFn")), list(reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER)), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), makeString("7 + 3 != 9")), list(list(reader_make_constant_shell(makeString("MathGreaterThanStatementFn")), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 / (square-root of Y) > z")), list(list(reader_make_constant_shell(makeString("MathUnknownStatementFn")), list(reader_make_constant_shell(makeString("InfixDivideFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("z"))), makeString("9 / (square-root of Y) ?>=<? z")), list(list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), makeString("220V")), list(list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Mole-ChemicalCountUnit")), makeInteger(1320))), makeString("1320 moles")), list(list(reader_make_constant_shell(makeString("MathQuantFn")), list(list(reader_make_constant_shell(makeString("UnitOfCountFn")), reader_make_constant_shell(makeString("Battery"))), TWELVE_INTEGER)), makeString("12 batteries")), list(list(reader_make_constant_shell(makeString("Volt")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER)), makeString("2 1/3 volts")), list(list(reader_make_constant_shell(makeString("SimpleFractionFn")), list(reader_make_constant_shell(makeString("Volt")), SEVEN_INTEGER), THREE_INTEGER), makeString("(7 volts) / 3")), list(list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER)))), makeString("(-2 1/3)")), list(list(reader_make_constant_shell(makeString("BracketedMathFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER))))), makeString("[-(2 1/3)]")), list(list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), ZERO_INTEGER), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MinusFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER)))), makeString("0 - (-2 1/3)")), list(list(reader_make_constant_shell(makeString("MathEqualsStatementFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")), list(reader_make_constant_shell(makeString("HorizontalDivideFn")), list(reader_make_constant_shell(makeString("InfixPlusMinusFn")), list(reader_make_constant_shell(makeString("PrefixMinusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("b"))), list(reader_make_constant_shell(makeString("NthRootExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("PowerExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("b")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER)), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("a")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("c")))))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("a"))))), makeString("x = (-b +/- (square root of (b^2 - 4ac))) / 2a")) });
    }

    @Override
    public void declareFunctions() {
        declare_mathml_file();
    }

    @Override
    public void initializeVariables() {
        init_mathml_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mathml_file();
    }

    
}

/**
 * Total time: 5339 ms
 */
