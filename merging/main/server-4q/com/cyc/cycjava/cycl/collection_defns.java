/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.at_vars.$at_collection_specific_defns$;
import static com.cyc.cycjava.cycl.at_vars.defn_collection;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.el_empty_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_empty_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.el_var_listP;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.formula_length;
import static com.cyc.cycjava.cycl.el_utilities.formula_with_sequence_varP;
import static com.cyc.cycjava.cycl.el_utilities.gafP;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_arity;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_p;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_subl;
import static com.cyc.cycjava.cycl.el_utilities.subl_quote_p;
import static com.cyc.cycjava.cycl.extended_numbers.extended_number_p;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_clear;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_remove_function_results_with_args;
import static com.cyc.cycjava.cycl.memoization_state.create_global_caching_state_for_name;
import static com.cyc.cycjava.cycl.memoization_state.note_globally_cached_function;
import static com.cyc.cycjava.cycl.memoization_state.register_hl_store_cache_clear_callback;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.characterp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.cyc_testing.ctest_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.rtp.rtp_type_checkers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      COLLECTION-DEFNS
 * source file: /cyc/top/cycl/collection-defns.lisp
 * created:     2019/07/03 17:37:49
 */
public final class collection_defns extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new collection_defns();

 public static final String myName = "com.cyc.cycjava.cycl.collection_defns";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $subl_functions_used_as_collection_defns$ = makeSymbol("*SUBL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cycl_functions_used_as_collection_defns$ = makeSymbol("*CYCL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $extensional_setP_caching_state$ = makeSymbol("*EXTENSIONAL-SET?-CACHING-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $8byteinteger_lower_bound$ = makeSymbol("*8BYTEINTEGER-LOWER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $8byteinteger_upper_bound$ = makeSymbol("*8BYTEINTEGER-UPPER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $4byteinteger_lower_bound$ = makeSymbol("*4BYTEINTEGER-LOWER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $4byteinteger_upper_bound$ = makeSymbol("*4BYTEINTEGER-UPPER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $2byteinteger_lower_bound$ = makeSymbol("*2BYTEINTEGER-LOWER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $2byteinteger_upper_bound$ = makeSymbol("*2BYTEINTEGER-UPPER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $1byteinteger_lower_bound$ = makeSymbol("*1BYTEINTEGER-LOWER-BOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $1byteinteger_upper_bound$ = makeSymbol("*1BYTEINTEGER-UPPER-BOUND*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("STRINGP"), makeSymbol("INTEGERP"), makeSymbol("KEYWORDP"), makeSymbol("LISTP"), makeSymbol("SYMBOLP"), makeSymbol("TRUE"), makeSymbol("FALSE"));

    static private final SubLList $list1 = list(new SubLObject[]{ makeSymbol("CYCL-CONSTANT-P"), makeSymbol("CYCL-VARIABLE-P"), makeSymbol("EL-VARIABLE-P"), makeSymbol("HL-VARIABLE-P"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("EL-RELATION-EXPRESSION?"), makeSymbol("GAF?"), makeSymbol("STRING-W/O-CONTROL-CHARS?"), makeSymbol("URL-P") });

    private static final SubLSymbol CYC_INDIVIDUAL_NECESSARY = makeSymbol("CYC-INDIVIDUAL-NECESSARY");

    private static final SubLSymbol CYC_KAPPA_PREDICATE_BY_ARITY = makeSymbol("CYC-KAPPA-PREDICATE-BY-ARITY");

    private static final SubLSymbol CACHED_RELATION_TYPE_ARITY = makeSymbol("CACHED-RELATION-TYPE-ARITY");





    private static final SubLList $list7 = list(makeKeyword("ARITY"));



    private static final SubLSymbol $cached_relation_type_arity_caching_state$ = makeSymbol("*CACHED-RELATION-TYPE-ARITY-CACHING-STATE*");

    private static final SubLSymbol $sym11$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");

    private static final SubLSymbol $sym12$EL_EXPRESSION_ = makeSymbol("EL-EXPRESSION?");

    private static final SubLSymbol HL_EXPRESSION_P = makeSymbol("HL-EXPRESSION-P");

    private static final SubLSymbol $sym14$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");

    private static final SubLSymbol $sym15$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");

    private static final SubLSymbol $sym16$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");

    private static final SubLSymbol $sym17$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");

    private static final SubLSymbol HL_CLOSED_DENOTATIONAL_TERM_P = makeSymbol("HL-CLOSED-DENOTATIONAL-TERM-P");

    private static final SubLSymbol CYCL_REPRESENTED_ATOMIC_TERM_P = makeSymbol("CYCL-REPRESENTED-ATOMIC-TERM-P");

    private static final SubLSymbol $sym20$CYCL_REPRESENTED_TERM_ = makeSymbol("CYCL-REPRESENTED-TERM?");

    private static final SubLSymbol CYC_SYSTEM_TERM_P = makeSymbol("CYC-SYSTEM-TERM-P");

    private static final SubLSymbol CYC_SYSTEM_CHARACTER_P = makeSymbol("CYC-SYSTEM-CHARACTER-P");

    private static final SubLSymbol CYC_SYSTEM_STRING_P = makeSymbol("CYC-SYSTEM-STRING-P");

    private static final SubLSymbol CYC_SYSTEM_REAL_NUMBER_P = makeSymbol("CYC-SYSTEM-REAL-NUMBER-P");

    private static final SubLSymbol CYC_SYSTEM_NON_VARIABLE_SYMBOL_P = makeSymbol("CYC-SYSTEM-NON-VARIABLE-SYMBOL-P");

    private static final SubLSymbol CYCL_SUBL_SYMBOL_P = makeSymbol("CYCL-SUBL-SYMBOL-P");

    private static final SubLSymbol CYCL_ATOMIC_TERM_P = makeSymbol("CYCL-ATOMIC-TERM-P");

    private static final SubLSymbol CYCL_CLOSED_ATOMIC_TERM_P = makeSymbol("CYCL-CLOSED-ATOMIC-TERM-P");

    private static final SubLSymbol HL_NON_ATOMIC_TERM_P = makeSymbol("HL-NON-ATOMIC-TERM-P");

    private static final SubLSymbol $sym30$CYCL_NON_ATOMIC_TERM_ = makeSymbol("CYCL-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym31$EL_NON_ATOMIC_TERM_ = makeSymbol("EL-NON-ATOMIC-TERM?");

    private static final SubLSymbol HL_INDEXED_TERM_P = makeSymbol("HL-INDEXED-TERM-P");

    private static final SubLSymbol $sym33$CYCL_INDEXED_TERM_ = makeSymbol("CYCL-INDEXED-TERM?");

    private static final SubLSymbol $sym34$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym35$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym36$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym37$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");

    private static final SubLSymbol $sym38$EL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("EL-REIFIABLE-NON-ATOMIC-TERM?");

    private static final SubLSymbol $sym39$CYCL_CLOSED_EXPRESSION_ = makeSymbol("CYCL-CLOSED-EXPRESSION?");

    private static final SubLSymbol $sym40$CYCL_OPEN_EXPRESSION_ = makeSymbol("CYCL-OPEN-EXPRESSION?");

    private static final SubLSymbol $sym41$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");

    private static final SubLSymbol $sym42$CYCL_OPEN_FORMULA_ = makeSymbol("CYCL-OPEN-FORMULA?");

    private static final SubLSymbol $sym43$CYCL_CLOSED_FORMULA_ = makeSymbol("CYCL-CLOSED-FORMULA?");

    private static final SubLSymbol HL_FORMULA_P = makeSymbol("HL-FORMULA-P");

    private static final SubLSymbol CYCL_UNBOUND_RELATION_FORMULA_P = makeSymbol("CYCL-UNBOUND-RELATION-FORMULA-P");

    private static final SubLSymbol $sym46$CYCL_SENTENCE_ = makeSymbol("CYCL-SENTENCE?");

    private static final SubLSymbol $sym47$CYCL_OPEN_SENTENCE_ = makeSymbol("CYCL-OPEN-SENTENCE?");

    private static final SubLSymbol $sym48$CYCL_CLOSED_SENTENCE_ = makeSymbol("CYCL-CLOSED-SENTENCE?");

    private static final SubLSymbol $sym50$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_ = makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?");

    private static final SubLSymbol $sym51$EL_SENTENCE_ = makeSymbol("EL-SENTENCE?");

    private static final SubLSymbol $sym52$CYCL_ATOMIC_SENTENCE_ = makeSymbol("CYCL-ATOMIC-SENTENCE?");

    private static final SubLSymbol $sym53$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");

    private static final SubLSymbol $sym54$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");

    private static final SubLSymbol $sym55$CYCL_SENTENCE_ASKABLE_ = makeSymbol("CYCL-SENTENCE-ASKABLE?");

    private static final SubLSymbol $sym56$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");

    private static final SubLSymbol $sym57$EL_SENTENCE_ASKABLE_ = makeSymbol("EL-SENTENCE-ASKABLE?");

    private static final SubLSymbol $sym58$EL_SENTENCE_ASSERTIBLE_ = makeSymbol("EL-SENTENCE-ASSERTIBLE?");

    private static final SubLSymbol $sym59$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");

    private static final SubLSymbol $sym60$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");

    private static final SubLSymbol $sym61$EL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("EL-NON-ATOMIC-TERM-ASKABLE?");

    private static final SubLSymbol $sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("EL-NON-ATOMIC-TERM-ASSERTIBLE?");

    private static final SubLSymbol $sym63$CYCL_EXPRESSION_ASKABLE_ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");

    private static final SubLSymbol $sym64$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");

    private static final SubLSymbol $sym65$EL_EXPRESSION_ASKABLE_ = makeSymbol("EL-EXPRESSION-ASKABLE?");

    private static final SubLSymbol $sym66$EL_EXPRESSION_ASSERTIBLE_ = makeSymbol("EL-EXPRESSION-ASSERTIBLE?");

    private static final SubLSymbol $sym67$CYCL_QUERY_ = makeSymbol("CYCL-QUERY?");

    private static final SubLSymbol $sym68$CYCL_ASSERTION_ = makeSymbol("CYCL-ASSERTION?");

    private static final SubLSymbol $sym69$CYCL_ATOMIC_ASSERTION_ = makeSymbol("CYCL-ATOMIC-ASSERTION?");

    private static final SubLSymbol $sym70$CYCL_GAF_ASSERTION_ = makeSymbol("CYCL-GAF-ASSERTION?");

    private static final SubLSymbol $sym71$CYCL_RULE_ASSERTION_ = makeSymbol("CYCL-RULE-ASSERTION?");

    private static final SubLSymbol $sym72$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");

    private static final SubLSymbol $sym73$CYCL_DEDUCED_ASSERTION_ = makeSymbol("CYCL-DEDUCED-ASSERTION?");

    private static final SubLSymbol $sym74$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");



    private static final SubLSymbol $sym76$CYCL_CANONICALIZER_DIRECTIVE_ = makeSymbol("CYCL-CANONICALIZER-DIRECTIVE?");



    private static final SubLSymbol $sym78$CYCL_REFORMULATOR_DIRECTIVE_ = makeSymbol("CYCL-REFORMULATOR-DIRECTIVE?");





    private static final SubLSymbol $sym81$CYCL_REFORMULATOR_RULE_ = makeSymbol("CYCL-REFORMULATOR-RULE?");



    private static final SubLSymbol $sym83$CYCL_SIMPLIFIER_DIRECTIVE_ = makeSymbol("CYCL-SIMPLIFIER-DIRECTIVE?");

    private static final SubLSymbol HL_ASSERTION_P = makeSymbol("HL-ASSERTION-P");

    private static final SubLSymbol $sym85$EL_ASSERTION_ = makeSymbol("EL-ASSERTION?");

    private static final SubLSymbol CYC_GROUND_TERM = makeSymbol("CYC-GROUND-TERM");

    private static final SubLSymbol CYC_REAL_NUMBER = makeSymbol("CYC-REAL-NUMBER");

    private static final SubLSymbol CYC_SYSTEM_REAL_NUMBER = makeSymbol("CYC-SYSTEM-REAL-NUMBER");

    private static final SubLSymbol CYC_POSITIVE_NUMBER = makeSymbol("CYC-POSITIVE-NUMBER");

    private static final SubLSymbol CYC_NEGATIVE_NUMBER = makeSymbol("CYC-NEGATIVE-NUMBER");

    private static final SubLSymbol CYC_NON_POSITIVE_NUMBER = makeSymbol("CYC-NON-POSITIVE-NUMBER");

    private static final SubLSymbol CYC_NON_NEGATIVE_NUMBER = makeSymbol("CYC-NON-NEGATIVE-NUMBER");

    private static final SubLSymbol CYC_RATIONAL_NUMBER = makeSymbol("CYC-RATIONAL-NUMBER");

    private static final SubLFloat $float$100_0 = makeDouble(100.0);

    private static final SubLSymbol CYC_REAL_0_100 = makeSymbol("CYC-REAL-0-100");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol CYC_REAL_0_1 = makeSymbol("CYC-REAL-0-1");

    private static final SubLFloat $float$_1_0 = makeDouble(-1.0);

    private static final SubLSymbol CYC_REAL_MINUS_1_TO_PLUS_1 = makeSymbol("CYC-REAL-MINUS-1-TO-PLUS-1");

    private static final SubLSymbol CYC_REAL_1_INFINITY = makeSymbol("CYC-REAL-1-INFINITY");

    private static final SubLSymbol CYC_NONZERO_NUMBER = makeSymbol("CYC-NONZERO-NUMBER");

    private static final SubLSymbol CYC_SYSTEM_FLOAT = makeSymbol("CYC-SYSTEM-FLOAT");

    private static final SubLSymbol CYC_INTEGER = makeSymbol("CYC-INTEGER");

    private static final SubLSymbol CYC_SYSTEM_INTEGER = makeSymbol("CYC-SYSTEM-INTEGER");

    private static final SubLSymbol CYC_POSITIVE_INTEGER = makeSymbol("CYC-POSITIVE-INTEGER");

    private static final SubLSymbol $sym106$CYC_PRIME_NUMBER_ = makeSymbol("CYC-PRIME-NUMBER?");

    private static final SubLSymbol $sym108$CYC_MAYBE_PRIME_NUMBER_ = makeSymbol("CYC-MAYBE-PRIME-NUMBER?");

    private static final SubLSymbol CYC_NEGATIVE_INTEGER = makeSymbol("CYC-NEGATIVE-INTEGER");

    private static final SubLSymbol CYC_NON_POSITIVE_INTEGER = makeSymbol("CYC-NON-POSITIVE-INTEGER");

    private static final SubLSymbol CYC_NON_NEGATIVE_INTEGER = makeSymbol("CYC-NON-NEGATIVE-INTEGER");

    private static final SubLSymbol CYC_EVEN_NUMBER = makeSymbol("CYC-EVEN-NUMBER");

    private static final SubLSymbol CYC_ODD_NUMBER = makeSymbol("CYC-ODD-NUMBER");

    private static final SubLSymbol CYC_UNIVERSAL_DATE = makeSymbol("CYC-UNIVERSAL-DATE");

    private static final SubLSymbol CYC_UNIVERSAL_SECOND = makeSymbol("CYC-UNIVERSAL-SECOND");

    private static final SubLSymbol CYC_SET_OF_TYPE_NECESSARY = makeSymbol("CYC-SET-OF-TYPE-NECESSARY");

    private static final SubLSymbol CYC_SET_OF_TYPE_SUFFICIENT = makeSymbol("CYC-SET-OF-TYPE-SUFFICIENT");

    private static final SubLSymbol CYC_LIST_OF_TYPE_NECESSARY = makeSymbol("CYC-LIST-OF-TYPE-NECESSARY");

    private static final SubLSymbol CYC_LIST_OF_TYPE_SUFFICIENT = makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT");



    private static final SubLSymbol $sym122$EXTENSIONAL_SET_ = makeSymbol("EXTENSIONAL-SET?");

    private static final SubLObject $$Set_Extensional = reader_make_constant_shell("Set-Extensional");

    private static final SubLSymbol $sym124$_EXTENSIONAL_SET__CACHING_STATE_ = makeSymbol("*EXTENSIONAL-SET?-CACHING-STATE*");

    private static final SubLSymbol $sym126$CLEAR_EXTENSIONAL_SET_ = makeSymbol("CLEAR-EXTENSIONAL-SET?");



    private static final SubLObject $$List_Extensional = reader_make_constant_shell("List-Extensional");





    private static final SubLSymbol CYC_LIST_WITHOUT_REPETITION = makeSymbol("CYC-LIST-WITHOUT-REPETITION");

    private static final SubLSymbol CYC_NUMERIC_STRING_NECESSARY = makeSymbol("CYC-NUMERIC-STRING-NECESSARY");

    private static final SubLSymbol CYC_NUMERAL_STRING = makeSymbol("CYC-NUMERAL-STRING");

    private static final SubLSymbol CYC_NUMERIC_STRING = makeSymbol("CYC-NUMERIC-STRING");

    private static final SubLSymbol CYC_NUMBER_STRING = makeSymbol("CYC-NUMBER-STRING");

    private static final SubLSymbol CYC_ZIP_CODE_FIVE_DIGIT = makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT");

    private static final SubLList $list137 = list(makeString("-"));

    private static final SubLSymbol CYC_ZIP_CODE_NINE_DIGIT = makeSymbol("CYC-ZIP-CODE-NINE-DIGIT");

    private static final SubLSymbol CYC_GUID_STRING_P = makeSymbol("CYC-GUID-STRING-P");

    private static final SubLSymbol CYC_NAICS_CODE = makeSymbol("CYC-NAICS-CODE");

    private static final SubLSymbol CYC_UNICODE_DENOTING_ASCII_STRING_P = makeSymbol("CYC-UNICODE-DENOTING-ASCII-STRING-P");

    private static final SubLSymbol CYC_ASCII_STRING_P = makeSymbol("CYC-ASCII-STRING-P");

    private static final SubLSymbol CYC_CONTROL_CHARACTER_FREE_STRING_NECESSARY = makeSymbol("CYC-CONTROL-CHARACTER-FREE-STRING-NECESSARY");

    private static final SubLSymbol CYC_URL = makeSymbol("CYC-URL");

    private static final SubLSymbol $sym145$DOCTOR_ME_ID_ = makeSymbol("DOCTOR-ME-ID?");

    private static final SubLSymbol $sym146$CLPE_ = makeSymbol("CLPE?");

    private static final SubLSymbol $sym147$CYC_QUERY_ = makeSymbol("CYC-QUERY?");

    private static final SubLSymbol CYC_SYNTACTIC_FORMULA_ARITY_OK = makeSymbol("CYC-SYNTACTIC-FORMULA-ARITY-OK");

    private static final SubLSymbol CYC_SYNTACTIC_FORMULA = makeSymbol("CYC-SYNTACTIC-FORMULA");

    private static final SubLSymbol $sym150$FUNCTION_EXPRESSION_ = makeSymbol("FUNCTION-EXPRESSION?");

    private static final SubLSymbol $sym151$CYC_RELATION_EXPRESSION_ = makeSymbol("CYC-RELATION-EXPRESSION?");

    private static final SubLSymbol $sym152$EL_VARIABLE_ = makeSymbol("EL-VARIABLE?");

    private static final SubLSymbol CYC_SUBL_EXPRESSION = makeSymbol("CYC-SUBL-EXPRESSION");

    private static final SubLSymbol CYC_SUBL_ESCAPE = makeSymbol("CYC-SUBL-ESCAPE");

    private static final SubLSymbol CYC_SUBL_TEMPLATE = makeSymbol("CYC-SUBL-TEMPLATE");

    private static final SubLSymbol $sym156$IBQE_ = makeSymbol("IBQE?");

    private static final SubLSymbol $sym157$SCALAR_POINT_VALUE_ = makeSymbol("SCALAR-POINT-VALUE?");



    private static final SubLSymbol $sym159$SCALAR_INTEGRAL_VALUE_ = makeSymbol("SCALAR-INTEGRAL-VALUE?");

    private static final SubLSymbol $sym160$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");

    private static final SubLSymbol $sym161$POSITIVE_SCALAR_INTERVAL_ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");

    private static final SubLSymbol $sym162$NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NEGATIVE-SCALAR-INTERVAL?");

    private static final SubLSymbol CYC_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P = makeSymbol("CYC-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P");



    private static final SubLSymbol CYC_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P = makeSymbol("CYC-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P");

    private static final SubLList $list166 = cons(reader_make_constant_shell("MixedFractionFn"), makeKeyword("ANYTHING"));

    private static final SubLList $list167 = cons(reader_make_constant_shell("NegativeMixedFractionFn"), makeKeyword("ANYTHING"));

    private static final SubLSymbol CYC_FRACTIONAL_MEASURABLE_QUANTITY_DECIMAL_P = makeSymbol("CYC-FRACTIONAL-MEASURABLE-QUANTITY-DECIMAL-P");





    private static final SubLSymbol CYCL_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P = makeSymbol("CYCL-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P");

    private static final SubLList $list178 = list(list(list(list(list(reader_make_constant_shell("The"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("MixedFractionFn"), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), THREE_INTEGER), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), FOUR_INTEGER), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), TWO_INTEGER)))), NIL), list(list(list(list(reader_make_constant_shell("The"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("SimpleFractionFn"), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), THREE_INTEGER), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), FOUR_INTEGER)))), T), list(list(list(reader_make_constant_shell("Mile"), list(reader_make_constant_shell("SimpleFractionFn"), ONE_INTEGER, TWO_INTEGER))), T), list(list(list(reader_make_constant_shell("Meter"), list(reader_make_constant_shell("MixedFractionFn"), THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER))), NIL));

    private static final SubLSymbol CYCL_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P = makeSymbol("CYCL-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P");

    private static final SubLList $list180 = list(list(list(list(list(reader_make_constant_shell("The"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("MixedFractionFn"), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), THREE_INTEGER), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), FOUR_INTEGER), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), TWO_INTEGER)))), T), list(list(list(list(reader_make_constant_shell("The"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("SimpleFractionFn"), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), THREE_INTEGER), list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("Integer"), FOUR_INTEGER)))), NIL), list(list(list(reader_make_constant_shell("Mile"), list(reader_make_constant_shell("SimpleFractionFn"), ONE_INTEGER, TWO_INTEGER))), NIL), list(list(list(reader_make_constant_shell("Meter"), list(reader_make_constant_shell("MixedFractionFn"), THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER))), T));

    private static final SubLSymbol $sym181$TERM_SET_ = makeSymbol("TERM-SET?");

    private static final SubLSymbol $sym182$CYCL_VAR_LIST_ = makeSymbol("CYCL-VAR-LIST?");

    private static final SubLSymbol $sym183$CYC_EL_VAR_LIST_ = makeSymbol("CYC-EL-VAR-LIST?");

    private static final SubLSymbol CYC_SYSTEM_ATOM = makeSymbol("CYC-SYSTEM-ATOM");

    private static final SubLSymbol CYC_LIST_OF_LISTS = makeSymbol("CYC-LIST-OF-LISTS");

    private static final SubLSymbol CYC_STRING_IS_LENGTH = makeSymbol("CYC-STRING-IS-LENGTH");



    private static final SubLSymbol CYC_STRING_IS_MINIMUM_LENGTH = makeSymbol("CYC-STRING-IS-MINIMUM-LENGTH");



    private static final SubLSymbol CYC_STRING_IS_MAXIMUM_LENGTH = makeSymbol("CYC-STRING-IS-MAXIMUM-LENGTH");



    private static final SubLSymbol CYC_LIST_IS_LENGTH = makeSymbol("CYC-LIST-IS-LENGTH");

    private static final SubLSymbol RTP_SYNTACTIC_CONSTRAINT = makeSymbol("RTP-SYNTACTIC-CONSTRAINT");

    private static final SubLSymbol CYC_SUBL_QUERY_PROPERTY_P = makeSymbol("CYC-SUBL-QUERY-PROPERTY-P");

    private static final SubLSymbol CYC_SUBL_TV_P = makeSymbol("CYC-SUBL-TV-P");

    private static final SubLSymbol CYC_SUBL_HL_SUPPORT_MODULE_P = makeSymbol("CYC-SUBL-HL-SUPPORT-MODULE-P");

    private static final SubLSymbol CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P = makeSymbol("CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P");

    private static final SubLSymbol CYC_SUBL_KCT_METRIC_IDENTIFIER_P = makeSymbol("CYC-SUBL-KCT-METRIC-IDENTIFIER-P");

    private static final SubLInteger $int$63 = makeInteger(63);

    private static final SubLSymbol CYC_8_BYTE_INTEGER = makeSymbol("CYC-8-BYTE-INTEGER");



    private static final SubLSymbol CYC_4_BYTE_INTEGER = makeSymbol("CYC-4-BYTE-INTEGER");

    private static final SubLSymbol CYC_2_BYTE_INTEGER = makeSymbol("CYC-2-BYTE-INTEGER");

    private static final SubLSymbol CYC_1_BYTE_INTEGER = makeSymbol("CYC-1-BYTE-INTEGER");



    private static final SubLSymbol CYC_BIT_DATATYPE = makeSymbol("CYC-BIT-DATATYPE");

    private static final SubLSymbol CYC_BIT_STRING = makeSymbol("CYC-BIT-STRING");

    private static final SubLList $list209 = list(CHAR_period);

    private static final SubLSymbol CYC_IP4_ADDRESS = makeSymbol("CYC-IP4-ADDRESS");

    private static final SubLList $list212 = list(CHAR_slash);



    private static final SubLSymbol CYC_IP4_NETWORK_ADDRESS = makeSymbol("CYC-IP4-NETWORK-ADDRESS");

    private static final SubLSymbol CYC_LIST_IS_MINIMUM_LENGTH = makeSymbol("CYC-LIST-IS-MINIMUM-LENGTH");

    private static final SubLSymbol CYC_LIST_IS_MAXIMUM_LENGTH = makeSymbol("CYC-LIST-IS-MAXIMUM-LENGTH");

    private static final SubLSymbol CYC_ADDITION_EXPRESSION = makeSymbol("CYC-ADDITION-EXPRESSION");

    private static final SubLSymbol CYC_SUBTRACTION_EXPRESSION = makeSymbol("CYC-SUBTRACTION-EXPRESSION");

    private static final SubLSymbol CYC_MULTIPLICATION_EXPRESSION = makeSymbol("CYC-MULTIPLICATION-EXPRESSION");

    private static final SubLSymbol CYC_DIVISION_EXPRESSION = makeSymbol("CYC-DIVISION-EXPRESSION");

    private static final SubLSymbol CYC_EXPONENTIATION_EXPRESSION = makeSymbol("CYC-EXPONENTIATION-EXPRESSION");

    private static final SubLSymbol CYC_NTH_ROOT_EXPRESSION = makeSymbol("CYC-NTH-ROOT-EXPRESSION");

    private static final SubLSymbol CYC_ENCLOSED_MATH_EXPRESSION = makeSymbol("CYC-ENCLOSED-MATH-EXPRESSION");

    private static final SubLSymbol CYC_UNIVARIATE_LINEAR_EQUATION = makeSymbol("CYC-UNIVARIATE-LINEAR-EQUATION");



    private static final SubLSymbol TEST_MATH_EXPRESSION_FN_COLLECTION_DEFNS = makeSymbol("TEST-MATH-EXPRESSION-FN-COLLECTION-DEFNS");

    private static final SubLList $list227 = list(makeSymbol("MATH-EXPRESSION-TEST-CASE-TABLES"));

    private static final SubLList $list228 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER)), reader_make_constant_shell("AdditionExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER), reader_make_constant_shell("InfixMinusFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER)), reader_make_constant_shell("SubtractionExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER)), reader_make_constant_shell("MultiplicationExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER), reader_make_constant_shell("InfixDivideFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER)), reader_make_constant_shell("DivisionExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER), reader_make_constant_shell("PowerExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER)), reader_make_constant_shell("ExponentiationExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER), reader_make_constant_shell("NthRootExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ONE_INTEGER)), reader_make_constant_shell("NthRootExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER))), reader_make_constant_shell("MultiplicationExpression")), T), list(list(list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER)))), reader_make_constant_shell("MultiplicationExpression")), NIL), list(list(list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER))))), reader_make_constant_shell("MultiplicationExpression")), NIL), list(list(list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER))))), reader_make_constant_shell("EnclosedMathExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER)), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("MathQuantFn"), TWO_INTEGER)), reader_make_constant_shell("MultiplicationExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER)), reader_make_constant_shell("InfixTimesFn"), list(reader_make_constant_shell("MathQuantFn"), TWO_INTEGER)), reader_make_constant_shell("MultiplicationExpression")), T), list(list(list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), ELEVEN_INTEGER), reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("MathQuantFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER)), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), TWO_INTEGER)), reader_make_constant_shell("MultiplicationExpression")), NIL), list(list(list(reader_make_constant_shell("InfixDottedTimesFn"), list(reader_make_constant_shell("Volt"), TWENTY_INTEGER), list(reader_make_constant_shell("MathQuantFn"), TWO_INTEGER)), reader_make_constant_shell("MultiplicationExpression")), T), list(list(list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), THREE_INTEGER), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), FOUR_INTEGER))), reader_make_constant_shell("AdditionExpression-Generic")), T), list(list(list(reader_make_constant_shell("ParenthesizedMathFn"), list(reader_make_constant_shell("MathExpressionFn"), list(reader_make_constant_shell("MathQuantFn"), THREE_INTEGER), reader_make_constant_shell("InfixPlusFn"), list(reader_make_constant_shell("MathQuantFn"), FOUR_INTEGER))), reader_make_constant_shell("AdditionExpression")), NIL) });

    private static final SubLList $list229 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    private static final SubLList $list230 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    private static final SubLList $list231 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Cat"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    private static final SubLList $list232 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"))), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Cat"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    private static final SubLList $list234 = list(list(list(makeString("192.168.0.1/32")), T));

    /**
     * #$defnNecessary for #$Individual
     */
    @LispMethod(comment = "#$defnNecessary for #$Individual")
    public static final SubLObject cyc_individual_necessary_alt(SubLObject v_object) {
        if ((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collectionP(v_object))) {
            return NIL;
        }
        return T;
    }

    /**
     * #$defnNecessary for #$Individual
     */
    @LispMethod(comment = "#$defnNecessary for #$Individual")
    public static SubLObject cyc_individual_necessary(final SubLObject v_object) {
        if ((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collectionP(v_object))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject cyc_kappa_predicate_by_arity(final SubLObject v_object) {
        if (NIL != kappa_predicate_p(v_object)) {
            final SubLObject actual_arity = kappa_predicate_arity(v_object);
            final SubLObject relation_type = at_vars.defn_collection();
            final SubLObject expected_arity = cached_relation_type_arity(relation_type);
            return eql(actual_arity, expected_arity);
        }
        return NIL;
    }

    public static SubLObject clear_cached_relation_type_arity() {
        final SubLObject cs = $cached_relation_type_arity_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_relation_type_arity(final SubLObject relation_type) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_relation_type_arity_caching_state$.getGlobalValue(), list(relation_type), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_relation_type_arity_internal(final SubLObject relation_type) {
        final SubLObject template = listS($$relationAllInstance, $$arity, relation_type, $list7);
        final SubLObject v_arity = backward.removal_ask_variable($ARITY, template, $$BaseKB, UNPROVIDED, UNPROVIDED).first();
        return v_arity;
    }

    public static SubLObject cached_relation_type_arity(final SubLObject relation_type) {
        SubLObject caching_state = $cached_relation_type_arity_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_RELATION_TYPE_ARITY, $cached_relation_type_arity_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation_type, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_relation_type_arity_internal(relation_type)));
            memoization_state.caching_state_put(caching_state, relation_type, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject cycl_expressionP_alt(SubLObject v_object) {
        return cycl_grammar.cycl_expression_p(v_object);
    }

    public static SubLObject cycl_expressionP(final SubLObject v_object) {
        return cycl_grammar.cycl_expression_p(v_object);
    }

    public static final SubLObject el_expressionP_alt(SubLObject v_object) {
        return el_grammar.el_expression_p(v_object);
    }

    public static SubLObject el_expressionP(final SubLObject v_object) {
        return el_grammar.el_expression_p(v_object);
    }

    public static final SubLObject hl_expression_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != cycl_grammar.hl_variable_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.hl_indexed_term_p(v_object))) || (NIL != cycl_grammar.subl_atomic_term_p(v_object))) || (NIL != cycl_grammar.cycl_constant_p(v_object)));
    }

    public static SubLObject hl_expression_p(final SubLObject v_object) {
        return makeBoolean((((NIL != cycl_grammar.hl_variable_p(v_object)) || (NIL != hl_indexed_term_p(v_object))) || (NIL != cycl_grammar.subl_atomic_term_p(v_object))) || (NIL != cycl_grammar.cycl_constant_p(v_object)));
    }

    public static final SubLObject cycl_open_denotational_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_denotational_term_p(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_open_denotational_termP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_denotational_term_p(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_closed_denotational_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_denotational_term_p(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_closed_denotational_termP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_denotational_term_p(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_reifiable_denotational_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_closed_denotational_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_reifiable_non_atomic_termP(v_object)));
    }

    public static SubLObject cycl_reifiable_denotational_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_closed_denotational_term_p(v_object)) || (NIL != el_reifiable_non_atomic_termP(v_object)));
    }

    public static final SubLObject cycl_reified_denotational_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_closed_denotational_term_p(v_object)) || (NIL != czer_utilities.naut_with_corresponding_nartP(v_object)));
    }

    public static SubLObject cycl_reified_denotational_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_closed_denotational_term_p(v_object)) || (NIL != czer_utilities.naut_with_corresponding_nartP(v_object)));
    }

    public static final SubLObject hl_closed_denotational_term_p_alt(SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    public static SubLObject hl_closed_denotational_term_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }

    public static final SubLObject cycl_represented_atomic_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_variable_p(v_object)) || (NIL != cycl_grammar.cycl_constant_p(v_object)));
    }

    public static SubLObject cycl_represented_atomic_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_variable_p(v_object)) || (NIL != cycl_grammar.cycl_constant_p(v_object)));
    }

    public static final SubLObject cycl_represented_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_represented_atomic_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_non_atomic_termP(v_object)));
    }

    public static SubLObject cycl_represented_termP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_represented_atomic_term_p(v_object)) || (NIL != cycl_non_atomic_termP(v_object)));
    }

    public static final SubLObject cyc_system_term_p_alt(SubLObject v_object) {
        return cycl_grammar.subl_atomic_term_p(v_object);
    }

    public static SubLObject cyc_system_term_p(final SubLObject v_object) {
        return cycl_grammar.subl_atomic_term_p(v_object);
    }

    public static final SubLObject cyc_system_character_p_alt(SubLObject v_object) {
        return characterp(v_object);
    }

    public static SubLObject cyc_system_character_p(final SubLObject v_object) {
        return characterp(v_object);
    }

    public static final SubLObject cyc_system_string_p_alt(SubLObject v_object) {
        return cycl_grammar.subl_string_p(v_object);
    }

    public static SubLObject cyc_system_string_p(final SubLObject v_object) {
        return cycl_grammar.subl_string_p(v_object);
    }

    public static final SubLObject cyc_system_real_number_p_alt(SubLObject v_object) {
        return cycl_grammar.subl_real_number_p(v_object);
    }

    public static SubLObject cyc_system_real_number_p(final SubLObject v_object) {
        return cycl_grammar.subl_real_number_p(v_object);
    }

    public static final SubLObject cyc_system_non_variable_symbol_p_alt(SubLObject v_object) {
        return cycl_grammar.subl_non_variable_symbol_p(v_object);
    }

    public static SubLObject cyc_system_non_variable_symbol_p(final SubLObject v_object) {
        return cycl_grammar.subl_non_variable_symbol_p(v_object);
    }

    public static final SubLObject cycl_subl_symbol_p_alt(SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            return makeBoolean((NIL != subl_quote_p(v_object)) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).isSymbol());
        }
        return NIL;
    }

    public static SubLObject cycl_subl_symbol_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            return makeBoolean((NIL != subl_quote_p(v_object)) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).isSymbol());
        }
        return NIL;
    }

    public static final SubLObject cycl_atomic_term_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != cycl_grammar.cycl_constant_p(v_object)) || (NIL != cycl_grammar.cycl_variable_p(v_object))) || (NIL != cycl_grammar.subl_atomic_term_p(v_object)));
    }

    public static SubLObject cycl_atomic_term_p(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_grammar.cycl_constant_p(v_object)) || (NIL != cycl_grammar.cycl_variable_p(v_object))) || (NIL != cycl_grammar.subl_atomic_term_p(v_object)));
    }

    public static final SubLObject cycl_closed_atomic_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.subl_atomic_term_p(v_object)) || (NIL != cycl_grammar.cycl_constant_p(v_object)));
    }

    public static SubLObject cycl_closed_atomic_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.subl_atomic_term_p(v_object)) || (NIL != cycl_grammar.cycl_constant_p(v_object)));
    }

    public static final SubLObject hl_non_atomic_term_p_alt(SubLObject v_object) {
        return nart_handles.nart_p(v_object);
    }

    public static SubLObject hl_non_atomic_term_p(final SubLObject v_object) {
        return nart_handles.nart_p(v_object);
    }

    public static final SubLObject cycl_non_atomic_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_non_atomic_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_non_atomic_termP(v_object)));
    }

    public static SubLObject cycl_non_atomic_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_non_atomic_term_p(v_object)) || (NIL != el_non_atomic_termP(v_object)));
    }

    public static final SubLObject el_non_atomic_termP_alt(SubLObject v_object) {
        return el_grammar.el_nat_p(v_object);
    }

    public static SubLObject el_non_atomic_termP(final SubLObject v_object) {
        return el_grammar.el_nat_p(v_object);
    }

    public static final SubLObject hl_indexed_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_closed_denotational_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.hl_assertion_p(v_object)));
    }

    public static SubLObject hl_indexed_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != hl_closed_denotational_term_p(v_object)) || (NIL != hl_assertion_p(v_object)));
    }

    public static final SubLObject cycl_indexed_termP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.hl_indexed_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_reifiable_non_atomic_termP(v_object))) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_assertionP(v_object)));
    }

    public static SubLObject cycl_indexed_termP(final SubLObject v_object) {
        return makeBoolean(((NIL != hl_indexed_term_p(v_object)) || (NIL != el_reifiable_non_atomic_termP(v_object))) || (NIL != el_assertionP(v_object)));
    }

    public static final SubLObject cycl_open_non_atomic_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_non_atomic_term_p(v_object)) || ((NIL != com.cyc.cycjava.cycl.collection_defns.el_non_atomic_termP(v_object)) && (NIL == closedP(v_object, UNPROVIDED))));
    }

    public static SubLObject cycl_open_non_atomic_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_non_atomic_term_p(v_object)) || ((NIL != el_non_atomic_termP(v_object)) && (NIL == closedP(v_object, UNPROVIDED))));
    }

    public static final SubLObject cycl_closed_non_atomic_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_non_atomic_term_p(v_object)) || ((NIL != com.cyc.cycjava.cycl.collection_defns.el_non_atomic_termP(v_object)) && (NIL != closedP(v_object, UNPROVIDED))));
    }

    public static SubLObject cycl_closed_non_atomic_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_non_atomic_term_p(v_object)) || ((NIL != el_non_atomic_termP(v_object)) && (NIL != closedP(v_object, UNPROVIDED))));
    }

    public static final SubLObject cycl_reifiable_non_atomic_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_non_atomic_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_reifiable_non_atomic_termP(v_object)));
    }

    public static SubLObject cycl_reifiable_non_atomic_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_non_atomic_term_p(v_object)) || (NIL != el_reifiable_non_atomic_termP(v_object)));
    }

    public static final SubLObject cycl_non_atomic_reified_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_non_atomic_term_p(v_object)) || (NIL != czer_utilities.naut_with_corresponding_nartP(v_object)));
    }

    public static SubLObject cycl_non_atomic_reified_termP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_non_atomic_term_p(v_object)) || (NIL != czer_utilities.naut_with_corresponding_nartP(v_object)));
    }

    public static final SubLObject el_reifiable_non_atomic_termP_alt(SubLObject v_object) {
        return obsolete.reifiable_natP(v_object, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject el_reifiable_non_atomic_termP(final SubLObject v_object) {
        return obsolete.reifiable_natP(v_object, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cycl_closed_expressionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_expressionP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_closed_expressionP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_expressionP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_open_expressionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_expressionP(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_open_expressionP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_expressionP(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_formulaP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_formula_p(v_object)) || (NIL != el_relation_expressionP(v_object)));
    }

    public static SubLObject cycl_formulaP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_formula_p(v_object)) || (NIL != el_relation_expressionP(v_object)));
    }

    public static final SubLObject cycl_open_formulaP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_formulaP(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_open_formulaP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_formulaP(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_closed_formulaP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_formulaP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_closed_formulaP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_formulaP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject hl_formula_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object)));
    }

    public static SubLObject hl_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object)));
    }

    public static final SubLObject cycl_unbound_relation_formula_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg0(v_object)))) && (NIL != term.relation_syntaxP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_unbound_relation_formula_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg0(v_object)))) && (NIL != term.relation_syntaxP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_sentenceP_alt(SubLObject v_object) {
        return cycl_grammar.cycl_sentence_p(v_object);
    }

    public static SubLObject cycl_sentenceP(final SubLObject v_object) {
        return cycl_grammar.cycl_sentence_p(v_object);
    }

    public static final SubLObject cycl_open_sentenceP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_sentenceP(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_open_sentenceP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_sentenceP(v_object)) && (NIL == closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_closed_sentenceP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_sentenceP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_closed_sentenceP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_sentenceP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    /**
     * #$defnIff for #$TypicalityReferenceSetProperty.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$defnIff for #$TypicalityReferenceSetProperty.\r\n\r\n@unknown baxter")
    public static final SubLObject cyc_typicality_reference_set_propertyP_alt(SubLObject v_object) {
        {
            SubLObject dummy = $TERM;
            return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_sentenceP(v_object)) && (NIL != cycl_utilities.expression_find(dummy, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    /**
     * #$defnIff for #$TypicalityReferenceSetProperty.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$defnIff for #$TypicalityReferenceSetProperty.\r\n\r\n@unknown baxter")
    public static SubLObject cyc_typicality_reference_set_propertyP(final SubLObject v_object) {
        final SubLObject dummy = $TERM;
        return makeBoolean((NIL != cycl_sentenceP(v_object)) && (NIL != cycl_utilities.expression_find(dummy, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject el_sentenceP_alt(SubLObject v_object) {
        return el_grammar.el_sentence_p(v_object);
    }

    public static SubLObject el_sentenceP(final SubLObject v_object) {
        return el_grammar.el_sentence_p(v_object);
    }

    public static final SubLObject cycl_atomic_sentenceP_alt(SubLObject v_object) {
        return cycl_grammar.cycl_atomic_sentence_p(v_object);
    }

    public static SubLObject cycl_atomic_sentenceP(final SubLObject v_object) {
        return cycl_grammar.cycl_atomic_sentence_p(v_object);
    }

    public static final SubLObject cycl_closed_atomic_sentenceP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_atomic_sentenceP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_closed_atomic_sentenceP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_atomic_sentenceP(v_object)) && (NIL != closedP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_propositional_sentenceP_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.collection_defns.cycl_sentence_assertibleP(v_object);
    }

    public static SubLObject cycl_propositional_sentenceP(final SubLObject v_object) {
        return makeBoolean((NIL != closedP(v_object, UNPROVIDED)) && (NIL != cycl_sentence_askableP(v_object)));
    }

    public static final SubLObject cycl_sentence_askableP_alt(SubLObject v_object) {
        return wff.el_wff_syntaxP(v_object, UNPROVIDED);
    }

    public static SubLObject cycl_sentence_askableP(final SubLObject v_object) {
        return wff.el_wff_syntaxP(v_object, UNPROVIDED);
    }

    public static final SubLObject cycl_sentence_assertibleP_alt(SubLObject v_object) {
        return wff.el_wffP(v_object, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cycl_sentence_assertibleP(final SubLObject v_object) {
        return wff.el_wffP(v_object, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject el_sentence_askableP_alt(SubLObject v_object) {
        return wff.el_wff_syntaxP(v_object, UNPROVIDED);
    }

    public static SubLObject el_sentence_askableP(final SubLObject v_object) {
        return wff.el_wff_syntaxP(v_object, UNPROVIDED);
    }

    public static final SubLObject el_sentence_assertibleP_alt(SubLObject v_object) {
        return wff.el_wffP(v_object, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject el_sentence_assertibleP(final SubLObject v_object) {
        return wff.el_wffP(v_object, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cycl_non_atomic_term_askableP_alt(SubLObject v_object) {
        return cycl_grammar.cycl_nat_p(v_object);
    }

    public static SubLObject cycl_non_atomic_term_askableP(final SubLObject v_object) {
        return cycl_grammar.cycl_nat_p(v_object);
    }

    public static final SubLObject cycl_non_atomic_term_assertibleP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.hl_non_atomic_term_p(v_object)) && (NIL != wff.el_wftP(cycl_utilities.careful_hl_term_to_el_term(v_object), UNPROVIDED, UNPROVIDED))) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_non_atomic_term_assertibleP(v_object)));
    }

    public static SubLObject cycl_non_atomic_term_assertibleP(final SubLObject v_object) {
        return makeBoolean(((NIL != hl_non_atomic_term_p(v_object)) && (NIL != wff.el_wftP(cycl_utilities.careful_hl_term_to_el_term(v_object), UNPROVIDED, UNPROVIDED))) || (NIL != el_non_atomic_term_assertibleP(v_object)));
    }

    /**
     *
     *
     * @unknown (el-non-atomic-term-askable? '(#$isa #$Muffet #$Dog))     NIL
     * @unknown (el-non-atomic-term-askable? '(#$JuvenileFn #$Dog))        T
     * @unknown (el-non-atomic-term-askable? '(#$JuvenileFn #$Muffet))     T
     * @unknown (el-non-atomic-term-askable? '(#$JuvenileFn #$Dog #$Cat)) NIL
     */
    @LispMethod(comment = "@unknown (el-non-atomic-term-askable? \'(#$isa #$Muffet #$Dog))     NIL\r\n@unknown (el-non-atomic-term-askable? \'(#$JuvenileFn #$Dog))        T\r\n@unknown (el-non-atomic-term-askable? \'(#$JuvenileFn #$Muffet))     T\r\n@unknown (el-non-atomic-term-askable? \'(#$JuvenileFn #$Dog #$Cat)) NIL")
    public static final SubLObject el_non_atomic_term_askableP_alt(SubLObject v_object) {
        return el_grammar.el_nat_p(v_object);
    }

    /**
     *
     *
     * @unknown (el-non-atomic-term-askable? '(#$isa #$Muffet #$Dog))     NIL
     * @unknown (el-non-atomic-term-askable? '(#$JuvenileFn #$Dog))        T
     * @unknown (el-non-atomic-term-askable? '(#$JuvenileFn #$Muffet))     T
     * @unknown (el-non-atomic-term-askable? '(#$JuvenileFn #$Dog #$Cat)) NIL
     */
    @LispMethod(comment = "@unknown (el-non-atomic-term-askable? \'(#$isa #$Muffet #$Dog))     NIL\r\n@unknown (el-non-atomic-term-askable? \'(#$JuvenileFn #$Dog))        T\r\n@unknown (el-non-atomic-term-askable? \'(#$JuvenileFn #$Muffet))     T\r\n@unknown (el-non-atomic-term-askable? \'(#$JuvenileFn #$Dog #$Cat)) NIL")
    public static SubLObject el_non_atomic_term_askableP(final SubLObject v_object) {
        return el_grammar.el_nat_p(v_object);
    }

    /**
     *
     *
     * @unknown (el-non-atomic-term-assertible? '(#$isa #$Muffet #$Dog))     NIL
     * @unknown (el-non-atomic-term-assertible? '(#$JuvenileFn #$Dog))        T
     * @unknown (el-non-atomic-term-assertible? '(#$JuvenileFn #$Muffet))    NIL
     * @unknown (el-non-atomic-term-assertible? '(#$JuvenileFn #$Dog #$Cat)) NIL
     */
    @LispMethod(comment = "@unknown (el-non-atomic-term-assertible? \'(#$isa #$Muffet #$Dog))     NIL\r\n@unknown (el-non-atomic-term-assertible? \'(#$JuvenileFn #$Dog))        T\r\n@unknown (el-non-atomic-term-assertible? \'(#$JuvenileFn #$Muffet))    NIL\r\n@unknown (el-non-atomic-term-assertible? \'(#$JuvenileFn #$Dog #$Cat)) NIL")
    public static final SubLObject el_non_atomic_term_assertibleP_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_grammar.el_nat_p(v_object)) && (NIL != wff.el_wftP(v_object, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown (el-non-atomic-term-assertible? '(#$isa #$Muffet #$Dog))     NIL
     * @unknown (el-non-atomic-term-assertible? '(#$JuvenileFn #$Dog))        T
     * @unknown (el-non-atomic-term-assertible? '(#$JuvenileFn #$Muffet))    NIL
     * @unknown (el-non-atomic-term-assertible? '(#$JuvenileFn #$Dog #$Cat)) NIL
     */
    @LispMethod(comment = "@unknown (el-non-atomic-term-assertible? \'(#$isa #$Muffet #$Dog))     NIL\r\n@unknown (el-non-atomic-term-assertible? \'(#$JuvenileFn #$Dog))        T\r\n@unknown (el-non-atomic-term-assertible? \'(#$JuvenileFn #$Muffet))    NIL\r\n@unknown (el-non-atomic-term-assertible? \'(#$JuvenileFn #$Dog #$Cat)) NIL")
    public static SubLObject el_non_atomic_term_assertibleP(final SubLObject v_object) {
        return makeBoolean((NIL != el_grammar.el_nat_p(v_object)) && (NIL != wff.el_wftP(v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject cycl_expression_askableP_alt(SubLObject v_object) {
        return cycl_grammar.cycl_expression_p(v_object);
    }

    public static SubLObject cycl_expression_askableP(final SubLObject v_object) {
        return cycl_grammar.cycl_expression_p(v_object);
    }

    public static final SubLObject cycl_expression_assertibleP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.hl_expression_p(v_object)) && (NIL != wff.el_wfeP(cycl_utilities.careful_hl_term_to_el_term(v_object), UNPROVIDED, UNPROVIDED))) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_expression_assertibleP(v_object)));
    }

    public static SubLObject cycl_expression_assertibleP(final SubLObject v_object) {
        return makeBoolean(((NIL != hl_expression_p(v_object)) && (NIL != wff.el_wfeP(cycl_utilities.careful_hl_term_to_el_term(v_object), UNPROVIDED, UNPROVIDED))) || (NIL != el_expression_assertibleP(v_object)));
    }

    /**
     *
     *
     * @unknown (el-expression-askable? '(#$isa #$Muffet #$Dog))        T
     * @unknown (el-expression-askable? '(#$isa #$Dog #$Muffet))        T
     * @unknown (el-expression-askable? '(#$isa #$Dog #$Muffet #$Cat)) NIL
     * @unknown (el-expression-askable? '(#$JuvenileFn #$Dog))          T
     * @unknown (el-expression-askable? '(#$JuvenileFn #$Muffet))       T
     * @unknown (el-expression-askable? '(#$JuvenileFn #$Dog #$Cat))   NIL
     */
    @LispMethod(comment = "@unknown (el-expression-askable? \'(#$isa #$Muffet #$Dog))        T\r\n@unknown (el-expression-askable? \'(#$isa #$Dog #$Muffet))        T\r\n@unknown (el-expression-askable? \'(#$isa #$Dog #$Muffet #$Cat)) NIL\r\n@unknown (el-expression-askable? \'(#$JuvenileFn #$Dog))          T\r\n@unknown (el-expression-askable? \'(#$JuvenileFn #$Muffet))       T\r\n@unknown (el-expression-askable? \'(#$JuvenileFn #$Dog #$Cat))   NIL")
    public static final SubLObject el_expression_askableP_alt(SubLObject v_object) {
        return el_grammar.el_expression_p(v_object);
    }

    /**
     *
     *
     * @unknown (el-expression-askable? '(#$isa #$Muffet #$Dog))        T
     * @unknown (el-expression-askable? '(#$isa #$Dog #$Muffet))        T
     * @unknown (el-expression-askable? '(#$isa #$Dog #$Muffet #$Cat)) NIL
     * @unknown (el-expression-askable? '(#$JuvenileFn #$Dog))          T
     * @unknown (el-expression-askable? '(#$JuvenileFn #$Muffet))       T
     * @unknown (el-expression-askable? '(#$JuvenileFn #$Dog #$Cat))   NIL
     */
    @LispMethod(comment = "@unknown (el-expression-askable? \'(#$isa #$Muffet #$Dog))        T\r\n@unknown (el-expression-askable? \'(#$isa #$Dog #$Muffet))        T\r\n@unknown (el-expression-askable? \'(#$isa #$Dog #$Muffet #$Cat)) NIL\r\n@unknown (el-expression-askable? \'(#$JuvenileFn #$Dog))          T\r\n@unknown (el-expression-askable? \'(#$JuvenileFn #$Muffet))       T\r\n@unknown (el-expression-askable? \'(#$JuvenileFn #$Dog #$Cat))   NIL")
    public static SubLObject el_expression_askableP(final SubLObject v_object) {
        return el_grammar.el_expression_p(v_object);
    }

    /**
     *
     *
     * @unknown (el-expression-assertible? '(#$isa #$Muffet #$Dog))        T
     * @unknown (el-expression-assertible? '(#$isa #$Dog #$Muffet))       NIL
     * @unknown (el-expression-assertible? '(#$isa #$Dog #$Muffet #$Cat)) NIL
     * @unknown (el-expression-assertible? '(#$JuvenileFn #$Dog))          T
     * @unknown (el-expression-assertible? '(#$JuvenileFn #$Muffet))      NIL
     * @unknown (el-expression-assertible? '(#$JuvenileFn #$Dog #$Cat))   NIL
     */
    @LispMethod(comment = "@unknown (el-expression-assertible? \'(#$isa #$Muffet #$Dog))        T\r\n@unknown (el-expression-assertible? \'(#$isa #$Dog #$Muffet))       NIL\r\n@unknown (el-expression-assertible? \'(#$isa #$Dog #$Muffet #$Cat)) NIL\r\n@unknown (el-expression-assertible? \'(#$JuvenileFn #$Dog))          T\r\n@unknown (el-expression-assertible? \'(#$JuvenileFn #$Muffet))      NIL\r\n@unknown (el-expression-assertible? \'(#$JuvenileFn #$Dog #$Cat))   NIL")
    public static final SubLObject el_expression_assertibleP_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_grammar.el_expression_p(v_object)) && (NIL != wff.el_wfeP(v_object, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown (el-expression-assertible? '(#$isa #$Muffet #$Dog))        T
     * @unknown (el-expression-assertible? '(#$isa #$Dog #$Muffet))       NIL
     * @unknown (el-expression-assertible? '(#$isa #$Dog #$Muffet #$Cat)) NIL
     * @unknown (el-expression-assertible? '(#$JuvenileFn #$Dog))          T
     * @unknown (el-expression-assertible? '(#$JuvenileFn #$Muffet))      NIL
     * @unknown (el-expression-assertible? '(#$JuvenileFn #$Dog #$Cat))   NIL
     */
    @LispMethod(comment = "@unknown (el-expression-assertible? \'(#$isa #$Muffet #$Dog))        T\r\n@unknown (el-expression-assertible? \'(#$isa #$Dog #$Muffet))       NIL\r\n@unknown (el-expression-assertible? \'(#$isa #$Dog #$Muffet #$Cat)) NIL\r\n@unknown (el-expression-assertible? \'(#$JuvenileFn #$Dog))          T\r\n@unknown (el-expression-assertible? \'(#$JuvenileFn #$Muffet))      NIL\r\n@unknown (el-expression-assertible? \'(#$JuvenileFn #$Dog #$Cat))   NIL")
    public static SubLObject el_expression_assertibleP(final SubLObject v_object) {
        return makeBoolean((NIL != el_grammar.el_expression_p(v_object)) && (NIL != wff.el_wfeP(v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject cycl_queryP_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.collection_defns.cycl_sentence_askableP(v_object);
    }

    public static SubLObject cycl_queryP(final SubLObject v_object) {
        return cycl_sentence_askableP(v_object);
    }

    public static final SubLObject cycl_assertionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.hl_assertion_p(v_object)) || (NIL != com.cyc.cycjava.cycl.collection_defns.el_assertionP(v_object)));
    }

    public static SubLObject cycl_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != hl_assertion_p(v_object)) || (NIL != el_assertionP(v_object)));
    }

    public static final SubLObject cycl_atomic_assertionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cycl_assertionP(v_object)) && (((NIL != com.cyc.cycjava.cycl.collection_defns.hl_assertion_p(v_object)) && (NIL != atomic_sentenceP(assertions_high.assertion_formula(v_object)))) || (NIL != atomic_sentenceP(v_object))));
    }

    public static SubLObject cycl_atomic_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_assertionP(v_object)) && (((NIL != hl_assertion_p(v_object)) && (NIL != atomic_sentenceP(assertions_high.assertion_formula(v_object)))) || (NIL != atomic_sentenceP(v_object))));
    }

    public static final SubLObject cycl_gaf_assertionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) || (NIL != czer_meta.el_gaf_assertion_specP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_gaf_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) || (NIL != czer_meta.el_gaf_assertion_specP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_rule_assertionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(v_object)) || (NIL != czer_meta.el_rule_assertion_specP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_rule_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(v_object)) || (NIL != czer_meta.el_rule_assertion_specP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_asserted_assertionP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.hl_assertion_p(v_object)) && (NIL != assertions_high.asserted_assertionP(v_object))) || (NIL != czer_meta.el_asserted_assertion_specP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_asserted_assertionP(final SubLObject v_object) {
        return makeBoolean(((NIL != hl_assertion_p(v_object)) && (NIL != assertions_high.asserted_assertionP(v_object))) || (NIL != czer_meta.el_asserted_assertion_specP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_deduced_assertionP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.hl_assertion_p(v_object)) && (NIL != assertions_high.deduced_assertionP(v_object))) || (NIL != czer_meta.el_deduced_assertion_specP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_deduced_assertionP(final SubLObject v_object) {
        return makeBoolean(((NIL != hl_assertion_p(v_object)) && (NIL != assertions_high.deduced_assertionP(v_object))) || (NIL != czer_meta.el_deduced_assertion_specP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_nl_semantic_assertionP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.hl_assertion_p(v_object)) && (NIL != assertion_utilities.nl_semantic_assertionP(v_object))) || (NIL != czer_meta.el_nl_semantic_assertion_specP(v_object, UNPROVIDED)));
    }

    public static SubLObject cycl_nl_semantic_assertionP(final SubLObject v_object) {
        return makeBoolean(((NIL != hl_assertion_p(v_object)) && (NIL != assertion_utilities.nl_semantic_assertionP(v_object))) || (NIL != czer_meta.el_nl_semantic_assertion_specP(v_object, UNPROVIDED)));
    }

    public static final SubLObject cycl_canonicalizer_directiveP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_canonicalizer_directiveP(assertions_high.gaf_formula(v_object)))) || (((NIL != el_formula_p(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_atomic_sentenceP(v_object))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), $$CanonicalizerDirectivePredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject cycl_canonicalizer_directiveP(final SubLObject v_object) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != cycl_canonicalizer_directiveP(assertions_high.gaf_formula(v_object)))) || (((NIL != el_formula_p(v_object)) && (NIL != cycl_atomic_sentenceP(v_object))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), $$CanonicalizerDirectivePredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject cycl_reformulator_directiveP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_reformulator_directiveP(assertions_high.gaf_formula(v_object)))) || (((NIL != el_formula_p(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_atomic_sentenceP(v_object))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), $$ReformulatorDirectivePredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject cycl_reformulator_directiveP(final SubLObject v_object) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != cycl_reformulator_directiveP(assertions_high.gaf_formula(v_object)))) || (((NIL != el_formula_p(v_object)) && (NIL != cycl_atomic_sentenceP(v_object))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), $$ReformulatorDirectivePredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject cycl_reformulator_ruleP_alt(SubLObject v_object) {
        {
            SubLObject pred_term = cycl_utilities.formula_arg0(v_object);
            SubLObject assertion = czer_meta.find_assertion_cycl(v_object, UNPROVIDED);
            return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_reformulator_directiveP(assertions_high.gaf_formula(v_object)))) || ((((NIL != el_formula_p(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_atomic_sentenceP(v_object))) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_reformulator_ruleP(assertion))) && ((NIL != isa.isaP(pred_term, $$CycLReformulationRulePredicate, UNPROVIDED, UNPROVIDED)) || ($$ist == pred_term))));
        }
    }

    public static SubLObject cycl_reformulator_ruleP(final SubLObject v_object) {
        final SubLObject pred_term = cycl_utilities.formula_arg0(v_object);
        final SubLObject assertion = czer_meta.find_assertion_cycl(v_object, UNPROVIDED);
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != cycl_reformulator_directiveP(assertions_high.gaf_formula(v_object)))) || ((((NIL != el_formula_p(v_object)) && (NIL != cycl_atomic_sentenceP(v_object))) && (NIL != cycl_reformulator_ruleP(assertion))) && ((NIL != isa.isaP(pred_term, $$CycLReformulationRulePredicate, UNPROVIDED, UNPROVIDED)) || $$ist.eql(pred_term))));
    }

    public static final SubLObject cycl_simplifier_directiveP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_simplifier_directiveP(assertions_high.gaf_formula(v_object)))) || (((NIL != el_formula_p(v_object)) && (NIL != com.cyc.cycjava.cycl.collection_defns.cycl_atomic_sentenceP(v_object))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), $$SimplifierDirectivePredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject cycl_simplifier_directiveP(final SubLObject v_object) {
        return makeBoolean(((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != cycl_simplifier_directiveP(assertions_high.gaf_formula(v_object)))) || (((NIL != el_formula_p(v_object)) && (NIL != cycl_atomic_sentenceP(v_object))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), $$SimplifierDirectivePredicate, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject hl_assertion_p_alt(SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static SubLObject hl_assertion_p(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }

    public static final SubLObject el_assertionP_alt(SubLObject v_object) {
        return czer_meta.el_assertion_specP(v_object, UNPROVIDED);
    }

    public static SubLObject el_assertionP(final SubLObject v_object) {
        return czer_meta.el_assertion_specP(v_object, UNPROVIDED);
    }

    /**
     * defnIff for #$CycLIndexedTerm
     */
    @LispMethod(comment = "defnIff for #$CycLIndexedTerm")
    public static final SubLObject cyc_indexed_term_alt(SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != com.cyc.cycjava.cycl.collection_defns.cyc_reifiable_nat(v_term))) || (NIL != com.cyc.cycjava.cycl.collection_defns.cyc_assertion(v_term)));
    }

    /**
     * defnIff for #$CycLIndexedTerm
     */
    @LispMethod(comment = "defnIff for #$CycLIndexedTerm")
    public static SubLObject cyc_indexed_term(final SubLObject v_term) {
        return makeBoolean(((NIL != forts.fort_p(v_term)) || (NIL != cyc_reifiable_nat(v_term))) || (NIL != cyc_assertion(v_term)));
    }

    /**
     * defnIff for #$CycLAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLAssertion")
    public static final SubLObject cyc_assertion_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) || (NIL != czer_meta.el_assertion_specP(assertion, UNPROVIDED)));
    }

    /**
     * defnIff for #$CycLAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLAssertion")
    public static SubLObject cyc_assertion(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) || (NIL != czer_meta.el_assertion_specP(assertion, UNPROVIDED)));
    }

    /**
     * defnIff for #$CycLGAFAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLGAFAssertion")
    public static final SubLObject cyc_gaf_assertion_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) || (NIL != czer_meta.el_gaf_assertion_specP(assertion, UNPROVIDED)));
    }

    /**
     * defnIff for #$CycLGAFAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLGAFAssertion")
    public static SubLObject cyc_gaf_assertion(final SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) || (NIL != czer_meta.el_gaf_assertion_specP(assertion, UNPROVIDED)));
    }

    /**
     * defnIff for #$CycLRuleAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLRuleAssertion")
    public static final SubLObject cyc_rule_assertion_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(assertion)) || (NIL != czer_meta.el_rule_assertion_specP(assertion, UNPROVIDED)));
    }

    /**
     * defnIff for #$CycLRuleAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLRuleAssertion")
    public static SubLObject cyc_rule_assertion(final SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(assertion)) || (NIL != czer_meta.el_rule_assertion_specP(assertion, UNPROVIDED)));
    }

    /**
     * defnIff for #$CycLNLSemanticAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLNLSemanticAssertion")
    public static final SubLObject cyc_nl_semantic_assertion_alt(SubLObject assertion) {
        return assertion_utilities.nl_semantic_assertionP(assertion);
    }

    /**
     * defnIff for #$CycLNLSemanticAssertion
     */
    @LispMethod(comment = "defnIff for #$CycLNLSemanticAssertion")
    public static SubLObject cyc_nl_semantic_assertion(final SubLObject assertion) {
        return assertion_utilities.nl_semantic_assertionP(assertion);
    }

    /**
     * defnIff for #$CycLReifiableDenotationalTerm
     */
    @LispMethod(comment = "defnIff for #$CycLReifiableDenotationalTerm")
    public static final SubLObject cyc_reifiable_term_alt(SubLObject v_term) {
        return czer_utilities.reifiable_termP(v_term);
    }

    /**
     * defnIff for #$CycLReifiableDenotationalTerm
     */
    @LispMethod(comment = "defnIff for #$CycLReifiableDenotationalTerm")
    public static SubLObject cyc_reifiable_term(final SubLObject v_term) {
        return czer_utilities.reifiable_termP(v_term);
    }

    /**
     * defnIff for #$CycLConstant
     */
    @LispMethod(comment = "defnIff for #$CycLConstant")
    public static final SubLObject cyc_constant_alt(SubLObject constant) {
        return constant_p(constant);
    }

    /**
     * defnIff for #$CycLConstant
     */
    @LispMethod(comment = "defnIff for #$CycLConstant")
    public static SubLObject cyc_constant(final SubLObject constant) {
        return constant_p(constant);
    }

    /**
     * defnIff for #$CycLReifiableNonAtomicTerm
     */
    @LispMethod(comment = "defnIff for #$CycLReifiableNonAtomicTerm")
    public static final SubLObject cyc_reifiable_nat_alt(SubLObject nat) {
        return czer_utilities.reifiable_nat_termP(nat);
    }

    /**
     * defnIff for #$CycLReifiableNonAtomicTerm
     */
    @LispMethod(comment = "defnIff for #$CycLReifiableNonAtomicTerm")
    public static SubLObject cyc_reifiable_nat(final SubLObject nat) {
        return czer_utilities.reifiable_nat_termP(nat);
    }

    /**
     * defnIff for #$CycGroundAtomicFormula
     */
    @LispMethod(comment = "defnIff for #$CycGroundAtomicFormula")
    public static final SubLObject cyc_gaf_alt(SubLObject gaf) {
        return gafP(gaf);
    }

    /**
     * defnIff for #$CycGroundAtomicFormula
     */
    @LispMethod(comment = "defnIff for #$CycGroundAtomicFormula")
    public static SubLObject cyc_gaf(final SubLObject gaf) {
        return gafP(gaf);
    }

    /**
     * defnIff for #$CycLAtomicSentence
     */
    @LispMethod(comment = "defnIff for #$CycLAtomicSentence")
    public static final SubLObject cyc_atomic_sentence_alt(SubLObject sentence) {
        return atomic_sentenceP(sentence);
    }

    /**
     * defnIff for #$CycLAtomicSentence
     */
    @LispMethod(comment = "defnIff for #$CycLAtomicSentence")
    public static SubLObject cyc_atomic_sentence(final SubLObject sentence) {
        return atomic_sentenceP(sentence);
    }

    /**
     * defnIff for #$FirstOrderNonAtomicUnreifiedTerm
     */
    @LispMethod(comment = "defnIff for #$FirstOrderNonAtomicUnreifiedTerm")
    public static final SubLObject cyc_first_order_naut_alt(SubLObject naut) {
        return term.first_order_nautP(naut);
    }

    /**
     * defnIff for #$FirstOrderNonAtomicUnreifiedTerm
     */
    @LispMethod(comment = "defnIff for #$FirstOrderNonAtomicUnreifiedTerm")
    public static SubLObject cyc_first_order_naut(final SubLObject naut) {
        return term.first_order_nautP(naut);
    }

    /**
     * defnIff for #$CycLExpression
     */
    @LispMethod(comment = "defnIff for #$CycLExpression")
    public static final SubLObject cyc_term_alt(SubLObject v_term) {
        return term.termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycLExpression
     */
    @LispMethod(comment = "defnIff for #$CycLExpression")
    public static SubLObject cyc_term(final SubLObject v_term) {
        return term.termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycGroundTerm
     */
    @LispMethod(comment = "defnIff for #$CycGroundTerm")
    public static final SubLObject cyc_ground_term_alt(SubLObject v_term) {
        return term.ground_termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycGroundTerm
     */
    @LispMethod(comment = "defnIff for #$CycGroundTerm")
    public static SubLObject cyc_ground_term(final SubLObject v_term) {
        return term.ground_termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycLClosedExpression
     */
    @LispMethod(comment = "defnIff for #$CycLClosedExpression")
    public static final SubLObject cyc_closed_term_alt(SubLObject v_term) {
        return term.closed_termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycLClosedExpression
     */
    @LispMethod(comment = "defnIff for #$CycLClosedExpression")
    public static SubLObject cyc_closed_term(final SubLObject v_term) {
        return term.closed_termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycLOpenExpression
     */
    @LispMethod(comment = "defnIff for #$CycLOpenExpression")
    public static final SubLObject cyc_open_term_alt(SubLObject v_term) {
        return term.open_termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$CycLOpenExpression
     */
    @LispMethod(comment = "defnIff for #$CycLOpenExpression")
    public static SubLObject cyc_open_term(final SubLObject v_term) {
        return term.open_termP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$RealNumber
     */
    @LispMethod(comment = "defnIff for #$RealNumber")
    public static final SubLObject cyc_real_number_alt(SubLObject number) {
        return cycl_grammar.subl_real_number_p(number);
    }

    /**
     * defnIff for #$RealNumber
     */
    @LispMethod(comment = "defnIff for #$RealNumber")
    public static SubLObject cyc_real_number(final SubLObject number) {
        return extended_numbers.extended_number_p(number);
    }

    /**
     * defnIff for #$SubLRealNumber
     */
    @LispMethod(comment = "defnIff for #$SubLRealNumber")
    public static final SubLObject cyc_system_real_number_alt(SubLObject number) {
        return numberp(number);
    }

    /**
     * defnIff for #$SubLRealNumber
     */
    @LispMethod(comment = "defnIff for #$SubLRealNumber")
    public static SubLObject cyc_system_real_number(final SubLObject number) {
        return numberp(number);
    }

    /**
     * defnIff for #$PositiveNumber
     */
    @LispMethod(comment = "defnIff for #$PositiveNumber")
    public static final SubLObject cyc_positive_number_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_real_number(number)) && number.isPositive());
    }

    /**
     * defnIff for #$PositiveNumber
     */
    @LispMethod(comment = "defnIff for #$PositiveNumber")
    public static SubLObject cyc_positive_number(final SubLObject number) {
        return makeBoolean((NIL != cyc_real_number(number)) && (NIL != extended_numbers.extended_number_plus_p(number)));
    }

    /**
     * defnIff for #$NegativeNumber
     */
    @LispMethod(comment = "defnIff for #$NegativeNumber")
    public static final SubLObject cyc_negative_number_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_real_number(number)) && number.isNegative());
    }

    /**
     * defnIff for #$NegativeNumber
     */
    @LispMethod(comment = "defnIff for #$NegativeNumber")
    public static SubLObject cyc_negative_number(final SubLObject number) {
        return makeBoolean((NIL != cyc_real_number(number)) && (NIL != extended_numbers.extended_number_minus_p(number)));
    }

    /**
     * defnIff for #$NonPositiveNumber
     */
    @LispMethod(comment = "defnIff for #$NonPositiveNumber")
    public static final SubLObject cyc_non_positive_number_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_real_number(number)) && (NIL == com.cyc.cycjava.cycl.collection_defns.cyc_positive_number(number)));
    }

    /**
     * defnIff for #$NonPositiveNumber
     */
    @LispMethod(comment = "defnIff for #$NonPositiveNumber")
    public static SubLObject cyc_non_positive_number(final SubLObject number) {
        return makeBoolean((NIL != cyc_real_number(number)) && (NIL == cyc_positive_number(number)));
    }

    /**
     * defnIff for #$NonNegativeNumber
     */
    @LispMethod(comment = "defnIff for #$NonNegativeNumber")
    public static final SubLObject cyc_non_negative_number_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_real_number(number)) && (NIL == com.cyc.cycjava.cycl.collection_defns.cyc_negative_number(number)));
    }

    /**
     * defnIff for #$NonNegativeNumber
     */
    @LispMethod(comment = "defnIff for #$NonNegativeNumber")
    public static SubLObject cyc_non_negative_number(final SubLObject number) {
        return makeBoolean((NIL != cyc_real_number(number)) && (NIL == cyc_negative_number(number)));
    }

    /**
     * defnIff for #$RationalNumber
     */
    @LispMethod(comment = "defnIff for #$RationalNumber")
    public static final SubLObject cyc_rational_number_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.collection_defns.cyc_real_number(number);
    }

    /**
     * defnIff for #$RationalNumber
     */
    @LispMethod(comment = "defnIff for #$RationalNumber")
    public static SubLObject cyc_rational_number(final SubLObject number) {
        return cyc_real_number(number);
    }

    /**
     * defnIff for #$Real0-100
     */
    @LispMethod(comment = "defnIff for #$Real0-100")
    public static final SubLObject cyc_real_0_100_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_non_negative_number(number)) && number.numLE($float$100_0));
    }

    /**
     * defnIff for #$Real0-100
     */
    @LispMethod(comment = "defnIff for #$Real0-100")
    public static SubLObject cyc_real_0_100(final SubLObject number) {
        return makeBoolean((NIL != cyc_non_negative_number(number)) && (NIL != extended_numbers.extended_numberLE(number, $float$100_0, UNPROVIDED)));
    }

    /**
     * defnIff for #$Real0-1
     */
    @LispMethod(comment = "defnIff for #$Real0-1")
    public static final SubLObject cyc_real_0_1_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_non_negative_number(number)) && number.numLE($float$1_0));
    }

    /**
     * defnIff for #$Real0-1
     */
    @LispMethod(comment = "defnIff for #$Real0-1")
    public static SubLObject cyc_real_0_1(final SubLObject number) {
        return makeBoolean((NIL != cyc_non_negative_number(number)) && (NIL != extended_numbers.extended_numberLE(number, $float$1_0, UNPROVIDED)));
    }

    /**
     * defnIff for #$Real-Minus1ToPlus1
     */
    @LispMethod(comment = "defnIff for #$Real-Minus1ToPlus1")
    public static final SubLObject cyc_real_minus_1_to_plus_1_alt(SubLObject number) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_real_number(number)) && number.numLE($float$1_0)) && number.numGE($float$_1_0));
    }

    /**
     * defnIff for #$Real-Minus1ToPlus1
     */
    @LispMethod(comment = "defnIff for #$Real-Minus1ToPlus1")
    public static SubLObject cyc_real_minus_1_to_plus_1(final SubLObject number) {
        return makeBoolean(((NIL != cyc_real_number(number)) && (NIL != extended_numbers.extended_numberLE(number, $float$1_0, UNPROVIDED))) && (NIL != extended_numbers.extended_numberGE(number, $float$_1_0, UNPROVIDED)));
    }

    /**
     * defnIff for #$Real1-Infinity
     */
    @LispMethod(comment = "defnIff for #$Real1-Infinity")
    public static final SubLObject cyc_real_1_infinity_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_non_negative_number(number)) && number.numGE($float$1_0));
    }

    /**
     * defnIff for #$Real1-Infinity
     */
    @LispMethod(comment = "defnIff for #$Real1-Infinity")
    public static SubLObject cyc_real_1_infinity(final SubLObject number) {
        return makeBoolean((NIL != cyc_non_negative_number(number)) && (NIL != extended_numbers.extended_numberGE(number, $float$1_0, UNPROVIDED)));
    }

    /**
     * defnIff for #$NonZeroNumber
     */
    @LispMethod(comment = "defnIff for #$NonZeroNumber")
    public static final SubLObject cyc_nonzero_number_alt(SubLObject number) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_negative_number(number)) || (NIL != com.cyc.cycjava.cycl.collection_defns.cyc_positive_number(number)));
    }

    /**
     * defnIff for #$NonZeroNumber
     */
    @LispMethod(comment = "defnIff for #$NonZeroNumber")
    public static SubLObject cyc_nonzero_number(final SubLObject number) {
        return makeBoolean((NIL != cyc_negative_number(number)) || (NIL != cyc_positive_number(number)));
    }

    public static SubLObject cyc_system_float(final SubLObject v_float) {
        return floatp(v_float);
    }

    /**
     * defnIff for #$Integer
     */
    @LispMethod(comment = "defnIff for #$Integer")
    public static final SubLObject cyc_integer_alt(SubLObject integer) {
        return com.cyc.cycjava.cycl.collection_defns.cyc_system_integer(integer);
    }

    /**
     * defnIff for #$Integer
     */
    @LispMethod(comment = "defnIff for #$Integer")
    public static SubLObject cyc_integer(final SubLObject integer) {
        return extended_numbers.extended_number_integer_p(integer);
    }

    /**
     * defnIff for #$SubLInteger
     */
    @LispMethod(comment = "defnIff for #$SubLInteger")
    public static final SubLObject cyc_system_integer_alt(SubLObject integer) {
        return integerp(integer);
    }

    /**
     * defnIff for #$SubLInteger
     */
    @LispMethod(comment = "defnIff for #$SubLInteger")
    public static SubLObject cyc_system_integer(final SubLObject integer) {
        return integerp(integer);
    }

    /**
     * defnIff for #$PositiveInteger
     */
    @LispMethod(comment = "defnIff for #$PositiveInteger")
    public static final SubLObject cyc_positive_integer_alt(SubLObject integer) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_integer(integer)) && integer.isPositive());
    }

    /**
     * defnIff for #$PositiveInteger
     */
    @LispMethod(comment = "defnIff for #$PositiveInteger")
    public static SubLObject cyc_positive_integer(final SubLObject integer) {
        return makeBoolean((NIL != cyc_integer(integer)) && (NIL != extended_numbers.extended_number_plus_p(integer)));
    }

    /**
     * defnIff for #$PrimeNumber
     */
    @LispMethod(comment = "defnIff for #$PrimeNumber")
    public static final SubLObject cyc_prime_numberP_alt(SubLObject v_object) {
        return number_utilities.prime_numberP(v_object);
    }

    /**
     * defnIff for #$PrimeNumber
     */
    @LispMethod(comment = "defnIff for #$PrimeNumber")
    public static SubLObject cyc_prime_numberP(final SubLObject v_object) {
        return number_utilities.prime_numberP(extended_numbers.extended_number_to_subl_real(v_object));
    }

    /**
     * former defnNecessary for #$PrimeNumber
     */
    @LispMethod(comment = "former defnNecessary for #$PrimeNumber")
    public static final SubLObject cyc_maybe_prime_numberP_alt(SubLObject v_object) {
        if (v_object.eql(ONE_INTEGER)) {
            return T;
        } else {
            if (NIL != cycl_utilities.expression_find_if(symbol_function(CONSTANT_P), v_object, UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                return number_utilities.prime_numberP(v_object);
            }
        }
    }

    /**
     * former defnNecessary for #$PrimeNumber
     */
    @LispMethod(comment = "former defnNecessary for #$PrimeNumber")
    public static SubLObject cyc_maybe_prime_numberP(final SubLObject v_object) {
        if (v_object.eql(ONE_INTEGER)) {
            return T;
        }
        if (NIL != cycl_utilities.expression_find_if(symbol_function(CONSTANT_P), v_object, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return number_utilities.prime_numberP(v_object);
    }

    /**
     * defnIff for #$NegativeInteger
     */
    @LispMethod(comment = "defnIff for #$NegativeInteger")
    public static final SubLObject cyc_negative_integer_alt(SubLObject integer) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_integer(integer)) && integer.isNegative());
    }

    /**
     * defnIff for #$NegativeInteger
     */
    @LispMethod(comment = "defnIff for #$NegativeInteger")
    public static SubLObject cyc_negative_integer(final SubLObject integer) {
        return makeBoolean((NIL != cyc_integer(integer)) && integer.isNegative());
    }

    /**
     * defnIff for #$NonPositiveInteger
     */
    @LispMethod(comment = "defnIff for #$NonPositiveInteger")
    public static final SubLObject cyc_non_positive_integer_alt(SubLObject integer) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_integer(integer)) && (NIL == com.cyc.cycjava.cycl.collection_defns.cyc_positive_integer(integer)));
    }

    /**
     * defnIff for #$NonPositiveInteger
     */
    @LispMethod(comment = "defnIff for #$NonPositiveInteger")
    public static SubLObject cyc_non_positive_integer(final SubLObject integer) {
        return makeBoolean((NIL != cyc_integer(integer)) && (NIL == cyc_positive_integer(integer)));
    }

    /**
     * defnIff for #$NonNegativeInteger
     */
    @LispMethod(comment = "defnIff for #$NonNegativeInteger")
    public static final SubLObject cyc_non_negative_integer_alt(SubLObject integer) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_integer(integer)) && (NIL == com.cyc.cycjava.cycl.collection_defns.cyc_negative_integer(integer)));
    }

    /**
     * defnIff for #$NonNegativeInteger
     */
    @LispMethod(comment = "defnIff for #$NonNegativeInteger")
    public static SubLObject cyc_non_negative_integer(final SubLObject integer) {
        return makeBoolean((NIL != cyc_integer(integer)) && (NIL == cyc_negative_integer(integer)));
    }

    /**
     * defnIff for #$EvenNumber
     */
    @LispMethod(comment = "defnIff for #$EvenNumber")
    public static final SubLObject cyc_even_number_alt(SubLObject integer) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_integer(integer)) && (NIL != evenp(integer)));
    }

    /**
     * defnIff for #$EvenNumber
     */
    @LispMethod(comment = "defnIff for #$EvenNumber")
    public static SubLObject cyc_even_number(final SubLObject integer) {
        return makeBoolean((NIL != cyc_integer(integer)) && (NIL != evenp(integer)));
    }

    /**
     * defnIff for #$OddNumber
     */
    @LispMethod(comment = "defnIff for #$OddNumber")
    public static final SubLObject cyc_odd_number_alt(SubLObject integer) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.collection_defns.cyc_integer(integer)) && (NIL != oddp(integer)));
    }

    /**
     * defnIff for #$OddNumber
     */
    @LispMethod(comment = "defnIff for #$OddNumber")
    public static SubLObject cyc_odd_number(final SubLObject integer) {
        return makeBoolean((NIL != cyc_integer(integer)) && (NIL != oddp(integer)));
    }

    /**
     * defnIff for #$CycUniversalDate
     */
    @LispMethod(comment = "defnIff for #$CycUniversalDate")
    public static final SubLObject cyc_universal_date_alt(SubLObject universal_date) {
        return numeric_date_utilities.universal_date_p(universal_date);
    }

    /**
     * defnIff for #$CycUniversalDate
     */
    @LispMethod(comment = "defnIff for #$CycUniversalDate")
    public static SubLObject cyc_universal_date(final SubLObject universal_date) {
        return numeric_date_utilities.universal_date_p(universal_date);
    }

    /**
     * defnIff for #$CycUniversalSecond
     */
    @LispMethod(comment = "defnIff for #$CycUniversalSecond")
    public static final SubLObject cyc_universal_second_alt(SubLObject universal_second) {
        return numeric_date_utilities.universal_second_p(universal_second);
    }

    /**
     * defnIff for #$CycUniversalSecond
     */
    @LispMethod(comment = "defnIff for #$CycUniversalSecond")
    public static SubLObject cyc_universal_second(final SubLObject universal_second) {
        return numeric_date_utilities.universal_second_p(universal_second);
    }

    /**
     * #$defnNecessary for #$Set-Mathematical
     */
    @LispMethod(comment = "#$defnNecessary for #$Set-Mathematical")
    public static final SubLObject cyc_set_of_type_necessary_alt(SubLObject v_set) {
        {
            SubLObject result = com.cyc.cycjava.cycl.collection_defns.cyc_set_of_type_guts(v_set);
            if ($AGNOSTIC == result) {
                return T;
            } else {
                return result;
            }
        }
    }

    /**
     * #$defnNecessary for #$Set-Mathematical
     */
    @LispMethod(comment = "#$defnNecessary for #$Set-Mathematical")
    public static SubLObject cyc_set_of_type_necessary(final SubLObject v_set) {
        final SubLObject result = cyc_set_of_type_guts(v_set);
        if ($AGNOSTIC == result) {
            return T;
        }
        return result;
    }

    /**
     * #$defnSufficient for uses of #$instanceElementType
     */
    @LispMethod(comment = "#$defnSufficient for uses of #$instanceElementType")
    public static final SubLObject cyc_set_of_type_sufficient_alt(SubLObject v_set) {
        {
            SubLObject result = com.cyc.cycjava.cycl.collection_defns.cyc_set_of_type_guts(v_set);
            if ($AGNOSTIC == result) {
                return NIL;
            } else {
                return result;
            }
        }
    }

    /**
     * #$defnSufficient for uses of #$instanceElementType
     */
    @LispMethod(comment = "#$defnSufficient for uses of #$instanceElementType")
    public static SubLObject cyc_set_of_type_sufficient(final SubLObject v_set) {
        final SubLObject result = cyc_set_of_type_guts(v_set);
        if ($AGNOSTIC == result) {
            return NIL;
        }
        return result;
    }

    /**
     * #$defnNecessary for #$List
     */
    @LispMethod(comment = "#$defnNecessary for #$List")
    public static final SubLObject cyc_list_of_type_necessary_alt(SubLObject list) {
        {
            SubLObject result = com.cyc.cycjava.cycl.collection_defns.cyc_list_of_type_guts(list);
            if ($AGNOSTIC == result) {
                return T;
            } else {
                return result;
            }
        }
    }

    /**
     * #$defnNecessary for #$List
     */
    @LispMethod(comment = "#$defnNecessary for #$List")
    public static SubLObject cyc_list_of_type_necessary(final SubLObject list) {
        final SubLObject result = cyc_list_of_type_guts(list);
        if ($AGNOSTIC == result) {
            return T;
        }
        return result;
    }

    /**
     * #$defnSufficient for uses of #$instanceListMemberType
     */
    @LispMethod(comment = "#$defnSufficient for uses of #$instanceListMemberType")
    public static final SubLObject cyc_list_of_type_sufficient_alt(SubLObject list) {
        {
            SubLObject result = com.cyc.cycjava.cycl.collection_defns.cyc_list_of_type_guts(list);
            if ($AGNOSTIC == result) {
                return NIL;
            } else {
                return result;
            }
        }
    }

    /**
     * #$defnSufficient for uses of #$instanceListMemberType
     */
    @LispMethod(comment = "#$defnSufficient for uses of #$instanceListMemberType")
    public static SubLObject cyc_list_of_type_sufficient(final SubLObject list) {
        final SubLObject result = cyc_list_of_type_guts(list);
        if ($AGNOSTIC == result) {
            return NIL;
        }
        return result;
    }

    /**
     *
     *
     * @return t, nil, or :agnostic
     */
    @LispMethod(comment = "@return t, nil, or :agnostic")
    public static final SubLObject cyc_set_of_type_guts_alt(SubLObject v_set) {
        if (NIL != el_empty_set_p(v_set)) {
            return T;
        }
        if (NIL != com.cyc.cycjava.cycl.collection_defns.extensional_setP(v_set)) {
            {
                SubLObject set_type = defn_collection();
                if (NIL != forts.fort_p(set_type)) {
                    {
                        SubLObject element_type = kb_mapping_utilities.fpred_value(set_type, $$instanceElementType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != forts.fort_p(element_type)) {
                            return com.cyc.cycjava.cycl.collection_defns.cyc_set_of_type_internal(v_set, element_type);
                        }
                    }
                }
            }
        }
        return $AGNOSTIC;
    }

    /**
     *
     *
     * @return t, nil, or :agnostic
     */
    @LispMethod(comment = "@return t, nil, or :agnostic")
    public static SubLObject cyc_set_of_type_guts(final SubLObject v_set) {
        if (NIL != el_empty_set_p(v_set)) {
            return T;
        }
        if (NIL != extensional_setP(v_set)) {
            final SubLObject set_type = at_vars.defn_collection();
            if (NIL != forts.fort_p(set_type)) {
                final SubLObject element_type = kb_mapping_utilities.fpred_value(set_type, $$instanceElementType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != forts.fort_p(element_type)) {
                    return cyc_set_of_type_internal(v_set, element_type);
                }
            }
        }
        return $AGNOSTIC;
    }

    public static final SubLObject clear_extensional_setP_alt() {
        {
            SubLObject cs = $extensional_setP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_extensional_setP() {
        final SubLObject cs = $extensional_setP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_extensional_setP_alt(SubLObject v_object) {
        return caching_state_remove_function_results_with_args($extensional_setP_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_extensional_setP(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($extensional_setP_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject extensional_setP_internal_alt(SubLObject v_object) {
        return isa.quoted_isaP(v_object, $$Set_Extensional, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject extensional_setP_internal(final SubLObject v_object) {
        return isa.quoted_isaP(v_object, $$Set_Extensional, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject extensional_setP_alt(SubLObject v_object) {
        {
            SubLObject caching_state = $extensional_setP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = create_global_caching_state_for_name($sym113$EXTENSIONAL_SET_, $sym115$_EXTENSIONAL_SET__CACHING_STATE_, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
                register_hl_store_cache_clear_callback($sym117$CLEAR_EXTENSIONAL_SET_);
            }
            {
                SubLObject results = caching_state_lookup(caching_state, v_object, $kw118$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw118$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.collection_defns.extensional_setP_internal(v_object)));
                    caching_state_put(caching_state, v_object, results, UNPROVIDED);
                }
                return caching_results(results);
            }
        }
    }

    public static SubLObject extensional_setP(final SubLObject v_object) {
        SubLObject caching_state = $extensional_setP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym122$EXTENSIONAL_SET_, $sym124$_EXTENSIONAL_SET__CACHING_STATE_, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym126$CLEAR_EXTENSIONAL_SET_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(extensional_setP_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject cyc_set_of_type_internal_alt(SubLObject v_set, SubLObject element_type) {
        if (NIL != el_formula_p(v_set)) {
            {
                SubLObject functor = cycl_utilities.nat_functor(v_set);
                if ($$TheSet == functor) {
                    {
                        SubLObject args = cycl_utilities.nat_args(v_set, UNPROVIDED);
                        return com.cyc.cycjava.cycl.collection_defns.every_in_list_has_type_within_collection_defn(args, element_type);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject cyc_set_of_type_internal(final SubLObject v_set, final SubLObject element_type) {
        if (NIL != el_formula_p(v_set)) {
            final SubLObject functor = cycl_utilities.nat_functor(v_set);
            if ($$TheSet.eql(functor)) {
                final SubLObject args = cycl_utilities.nat_args(v_set, UNPROVIDED);
                return every_in_list_has_type_within_collection_defn(args, element_type);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return t, nil, or :agnostic
     */
    @LispMethod(comment = "@return t, nil, or :agnostic")
    public static final SubLObject cyc_list_of_type_guts_alt(SubLObject list) {
        if (NIL != el_empty_list_p(list)) {
            return T;
        }
        if (NIL != isa.quoted_isaP(list, $$List_Extensional, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject list_type = defn_collection();
                if (NIL != forts.fort_p(list_type)) {
                    {
                        SubLObject element_type = kb_mapping_utilities.fpred_value(list_type, $$instanceListMemberType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != forts.fort_p(element_type)) {
                            return com.cyc.cycjava.cycl.collection_defns.cyc_list_of_type_internal(list, element_type);
                        }
                    }
                }
            }
        }
        return $AGNOSTIC;
    }

    /**
     *
     *
     * @return t, nil, or :agnostic
     */
    @LispMethod(comment = "@return t, nil, or :agnostic")
    public static SubLObject cyc_list_of_type_guts(final SubLObject list) {
        if (NIL != el_empty_list_p(list)) {
            return T;
        }
        if (NIL != isa.quoted_isaP(list, $$List_Extensional, UNPROVIDED, UNPROVIDED)) {
            final SubLObject list_type = at_vars.defn_collection();
            if (NIL != forts.fort_p(list_type)) {
                final SubLObject element_type = kb_mapping_utilities.fpred_value(list_type, $$instanceListMemberType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != forts.fort_p(element_type)) {
                    return cyc_list_of_type_internal(list, element_type);
                }
            }
        }
        return $AGNOSTIC;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject cyc_list_of_type_internal_alt(SubLObject list, SubLObject element_type) {
        if (NIL != el_formula_p(list)) {
            {
                SubLObject functor = cycl_utilities.nat_functor(list);
                if ($$TheList == functor) {
                    {
                        SubLObject args = cycl_utilities.nat_args(list, UNPROVIDED);
                        return com.cyc.cycjava.cycl.collection_defns.every_in_list_has_type_within_collection_defn(args, element_type);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject cyc_list_of_type_internal(final SubLObject list, final SubLObject element_type) {
        if (NIL != el_formula_p(list)) {
            final SubLObject functor = cycl_utilities.nat_functor(list);
            if ($$TheList.eql(functor)) {
                final SubLObject args = cycl_utilities.nat_args(list, UNPROVIDED);
                return every_in_list_has_type_within_collection_defn(args, element_type);
            }
        }
        return NIL;
    }

    public static final SubLObject every_in_list_has_type_within_collection_defn_alt(SubLObject list, SubLObject collection) {
        {
            SubLObject failedP = NIL;
            if (NIL == failedP) {
                {
                    SubLObject csome_list_var = list;
                    SubLObject v_object = NIL;
                    for (v_object = csome_list_var.first(); !((NIL != failedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_object = csome_list_var.first()) {
                        at_defns.clear_defn_space();
                        failedP = makeBoolean(!((NIL != at_defns.quiet_has_typeP(v_object, collection, UNPROVIDED)) || ((NIL != wff_macros.within_wffP()) && (NIL != arg_type.variable_wrt_arg_typeP(v_object)))));
                    }
                }
            }
            return makeBoolean(NIL == failedP);
        }
    }

    public static SubLObject every_in_list_has_type_within_collection_defn(final SubLObject list, final SubLObject collection) {
        SubLObject failedP = NIL;
        if (NIL == failedP) {
            SubLObject csome_list_var;
            SubLObject v_object;
            for (csome_list_var = list, v_object = NIL, v_object = csome_list_var.first(); (NIL == failedP) && (NIL != csome_list_var); failedP = makeBoolean((NIL == at_defns.quiet_has_typeP(v_object, collection, UNPROVIDED)) && ((NIL == wff_macros.within_wffP()) || (NIL == arg_type.variable_wrt_arg_typeP(v_object)))) , csome_list_var = csome_list_var.rest() , v_object = csome_list_var.first()) {
                at_defns.clear_defn_space();
            }
        }
        return makeBoolean(NIL == failedP);
    }

    /**
     * #$defnSufficient for #$ListWithoutRepetition
     */
    @LispMethod(comment = "#$defnSufficient for #$ListWithoutRepetition")
    public static final SubLObject cyc_list_without_repetition_alt(SubLObject list) {
        if (NIL != el_list_p(list)) {
            return list_utilities.list_without_repetition_p(el_list_items(list), symbol_function(EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * #$defnSufficient for #$ListWithoutRepetition
     */
    @LispMethod(comment = "#$defnSufficient for #$ListWithoutRepetition")
    public static SubLObject cyc_list_without_repetition(final SubLObject list) {
        if (NIL != el_list_p(list)) {
            return list_utilities.list_without_repetition_p(el_list_items(list), symbol_function(EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * #$defnNecessary for #$NumericString
     */
    @LispMethod(comment = "#$defnNecessary for #$NumericString")
    public static final SubLObject cyc_numeric_string_necessary_alt(SubLObject string) {
        return string_utilities.partially_numeric_stringP(string);
    }

    /**
     * #$defnNecessary for #$NumericString
     */
    @LispMethod(comment = "#$defnNecessary for #$NumericString")
    public static SubLObject cyc_numeric_string_necessary(final SubLObject string) {
        return string_utilities.partially_numeric_stringP(string);
    }

    /**
     * #$defnIff for #$NumeralString
     */
    @LispMethod(comment = "#$defnIff for #$NumeralString")
    public static final SubLObject cyc_numeral_string_alt(SubLObject string) {
        return string_utilities.digit_stringP(string);
    }

    /**
     * #$defnIff for #$NumeralString
     */
    @LispMethod(comment = "#$defnIff for #$NumeralString")
    public static SubLObject cyc_numeral_string(final SubLObject string) {
        return string_utilities.digit_stringP(string);
    }

    public static final SubLObject cyc_numeric_string_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.collection_defns.cyc_numeral_string(string);
    }

    public static SubLObject cyc_numeric_string(final SubLObject string) {
        return cyc_numeral_string(string);
    }

    /**
     * #$defnIff for #$NumberString
     */
    @LispMethod(comment = "#$defnIff for #$NumberString")
    public static final SubLObject cyc_number_string_alt(SubLObject string) {
        return number_utilities.extended_number_string_p(string);
    }

    /**
     * #$defnIff for #$NumberString
     */
    @LispMethod(comment = "#$defnIff for #$NumberString")
    public static SubLObject cyc_number_string(final SubLObject string) {
        return number_utilities.extended_number_string_p(string);
    }

    /**
     * #$defnIff for #$ZipCode-FiveDigit
     */
    @LispMethod(comment = "#$defnIff for #$ZipCode-FiveDigit")
    public static final SubLObject cyc_zip_code_five_digit_alt(SubLObject string) {
        return makeBoolean((NIL != string_utilities.digit_stringP(string)) && (NIL != list_utilities.lengthE(string, FIVE_INTEGER, UNPROVIDED)));
    }

    /**
     * #$defnIff for #$ZipCode-FiveDigit
     */
    @LispMethod(comment = "#$defnIff for #$ZipCode-FiveDigit")
    public static SubLObject cyc_zip_code_five_digit(final SubLObject string) {
        return makeBoolean((NIL != string_utilities.digit_stringP(string)) && (NIL != list_utilities.lengthE(string, FIVE_INTEGER, UNPROVIDED)));
    }

    /**
     * #$defnIff for #$ZipCode-NineDigit
     */
    @LispMethod(comment = "#$defnIff for #$ZipCode-NineDigit")
    public static final SubLObject cyc_zip_code_nine_digit_alt(SubLObject string) {
        {
            SubLObject nine_digit_zip_codeP = NIL;
            if (string.isString() && (NIL != list_utilities.lengthE(string, TEN_INTEGER, UNPROVIDED))) {
                {
                    SubLObject tokens = string_utilities.string_tokenize(string, $list_alt129, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.lengthE(tokens, TWO_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject zip = tokens.first();
                            SubLObject ext = second(tokens);
                            nine_digit_zip_codeP = makeBoolean((((NIL != list_utilities.lengthE(zip, FIVE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthE(ext, FOUR_INTEGER, UNPROVIDED))) && (NIL != string_utilities.digit_stringP(zip))) && (NIL != string_utilities.digit_stringP(ext)));
                        }
                    }
                }
            }
            return nine_digit_zip_codeP;
        }
    }

    /**
     * #$defnIff for #$ZipCode-NineDigit
     */
    @LispMethod(comment = "#$defnIff for #$ZipCode-NineDigit")
    public static SubLObject cyc_zip_code_nine_digit(final SubLObject string) {
        SubLObject nine_digit_zip_codeP = NIL;
        if (string.isString() && (NIL != list_utilities.lengthE(string, TEN_INTEGER, UNPROVIDED))) {
            final SubLObject tokens = string_utilities.string_tokenize(string, $list137, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.lengthE(tokens, TWO_INTEGER, UNPROVIDED)) {
                final SubLObject zip = tokens.first();
                final SubLObject ext = second(tokens);
                nine_digit_zip_codeP = makeBoolean((((NIL != list_utilities.lengthE(zip, FIVE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthE(ext, FOUR_INTEGER, UNPROVIDED))) && (NIL != string_utilities.digit_stringP(zip))) && (NIL != string_utilities.digit_stringP(ext)));
            }
        }
        return nine_digit_zip_codeP;
    }

    /**
     * #$defnIff for #$GUIDString
     */
    @LispMethod(comment = "#$defnIff for #$GUIDString")
    public static final SubLObject cyc_guid_string_p_alt(SubLObject string) {
        return Guids.guid_string_p(string);
    }

    /**
     * #$defnIff for #$GUIDString
     */
    @LispMethod(comment = "#$defnIff for #$GUIDString")
    public static SubLObject cyc_guid_string_p(final SubLObject string) {
        return Guids.guid_string_p(string);
    }

    public static SubLObject cyc_naics_code(final SubLObject string) {
        return makeBoolean(((NIL != string_utilities.digit_stringP(string)) && (NIL != list_utilities.lengthLE(string, SIX_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthGE(string, TWO_INTEGER, UNPROVIDED)));
    }

    /**
     * #$defnIff for #UnicodeString
     */
    @LispMethod(comment = "#$defnIff for #UnicodeString")
    public static final SubLObject cyc_unicode_denoting_ascii_string_p_alt(SubLObject string) {
        return unicode_strings.display_vector_string_p(string);
    }

    /**
     * #$defnIff for #UnicodeString
     */
    @LispMethod(comment = "#$defnIff for #UnicodeString")
    public static SubLObject cyc_unicode_denoting_ascii_string_p(final SubLObject string) {
        return unicode_strings.display_vector_string_p(string);
    }

    /**
     * #$defnIff for #AsciiString
     */
    @LispMethod(comment = "#$defnIff for #AsciiString")
    public static final SubLObject cyc_ascii_string_p_alt(SubLObject string) {
        return unicode_strings.ascii_string_p(string);
    }

    /**
     * #$defnIff for #AsciiString
     */
    @LispMethod(comment = "#$defnIff for #AsciiString")
    public static SubLObject cyc_ascii_string_p(final SubLObject string) {
        return unicode_strings.ascii_string_p(string);
    }

    public static SubLObject cyc_control_character_free_string_necessary(final SubLObject string) {
        return makeBoolean((NIL == cycl_string.cycl_string_p(string)) || (NIL != cycl_string.cycl_string_wXo_control_charsP(string)));
    }

    /**
     * #$defnIff for #$UniformResourceLocator
     */
    @LispMethod(comment = "#$defnIff for #$UniformResourceLocator")
    public static final SubLObject cyc_url_alt(SubLObject v_object) {
        return web_utilities.url_p(v_object);
    }

    /**
     * #$defnIff for #$UniformResourceLocator
     */
    @LispMethod(comment = "#$defnIff for #$UniformResourceLocator")
    public static SubLObject cyc_url(final SubLObject v_object) {
        return web_utilities.url_p(v_object);
    }

    public static final SubLObject doctor_me_idP_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.collection_defns.numeric_string_of_lengthP(v_object, ELEVEN_INTEGER);
    }

    public static SubLObject doctor_me_idP(final SubLObject v_object) {
        return numeric_string_of_lengthP(v_object, ELEVEN_INTEGER);
    }

    public static final SubLObject numeric_string_of_lengthP_alt(SubLObject string, SubLObject length) {
        return makeBoolean(((length.isNumber() && string.isString()) && length.numE(length(string))) && (NIL != com.cyc.cycjava.cycl.collection_defns.cyc_numeric_string(string)));
    }

    public static SubLObject numeric_string_of_lengthP(final SubLObject string, final SubLObject length) {
        return makeBoolean(((length.isNumber() && string.isString()) && length.numE(length(string))) && (NIL != cyc_numeric_string(string)));
    }

    public static final SubLObject clpeP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject clpeP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    try {
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        clpeP = (NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) ? ((SubLObject) (wff.kwt_wffP(formula, UNPROVIDED))) : wff.el_wffP(formula, UNPROVIDED, UNPROVIDED);
                    } finally {
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return clpeP;
            }
        }
    }

    public static SubLObject clpeP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject clpeP = NIL;
        final SubLObject _prev_bind_0 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        try {
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            clpeP = (NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) ? wff.kwt_wffP(formula, UNPROVIDED) : wff.el_wffP(formula, UNPROVIDED, UNPROVIDED);
        } finally {
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_0, thread);
        }
        return clpeP;
    }

    public static final SubLObject cyc_queryP_alt(SubLObject formula) {
        return wff.query_okP(formula, UNPROVIDED);
    }

    public static SubLObject cyc_queryP(final SubLObject formula) {
        return wff.query_okP(formula, UNPROVIDED);
    }

    public static final SubLObject cyc_syntactic_formula_arity_ok_alt(SubLObject formula) {
        return wff.el_wff_syntaxP(formula, UNPROVIDED);
    }

    public static SubLObject cyc_syntactic_formula_arity_ok(final SubLObject formula) {
        return wff.el_wff_syntaxP(formula, UNPROVIDED);
    }

    public static final SubLObject cyc_syntactic_formula_alt(SubLObject formula) {
        return cycl_grammar.cycl_sentence_p(formula);
    }

    public static SubLObject cyc_syntactic_formula(final SubLObject formula) {
        return cycl_grammar.cycl_sentence_p(formula);
    }

    public static final SubLObject function_expressionP_alt(SubLObject v_object) {
        return term.function_termP(v_object);
    }

    public static SubLObject function_expressionP(final SubLObject v_object) {
        return term.function_termP(v_object);
    }

    public static final SubLObject cyc_relation_expressionP_alt(SubLObject v_object) {
        return relation_expressionP(v_object);
    }

    public static SubLObject cyc_relation_expressionP(final SubLObject v_object) {
        return relation_expressionP(v_object);
    }

    public static final SubLObject el_variableP_alt(SubLObject symbol) {
        return cycl_variables.el_varP(symbol);
    }

    public static SubLObject el_variableP(final SubLObject symbol) {
        return cycl_variables.el_varP(symbol);
    }

    /**
     * defnIff for #$SubLExpression
     */
    @LispMethod(comment = "defnIff for #$SubLExpression")
    public static final SubLObject cyc_subl_expression_alt(SubLObject obj) {
        return T;
    }

    /**
     * defnIff for #$SubLExpression
     */
    @LispMethod(comment = "defnIff for #$SubLExpression")
    public static SubLObject cyc_subl_expression(final SubLObject obj) {
        return T;
    }

    /**
     * defnIff for #$SubLEscape.
     */
    @LispMethod(comment = "defnIff for #$SubLEscape.")
    public static final SubLObject cyc_subl_escape_alt(SubLObject obj) {
        return subl_escape_p(obj);
    }

    /**
     * defnIff for #$SubLEscape.
     */
    @LispMethod(comment = "defnIff for #$SubLEscape.")
    public static SubLObject cyc_subl_escape(final SubLObject obj) {
        return subl_escape_p(obj);
    }

    /**
     * defnIff for #$SubLTemplate
     */
    @LispMethod(comment = "defnIff for #$SubLTemplate")
    public static final SubLObject cyc_subl_template_alt(SubLObject obj) {
        return T;
    }

    /**
     * defnIff for #$SubLTemplate
     */
    @LispMethod(comment = "defnIff for #$SubLTemplate")
    public static SubLObject cyc_subl_template(final SubLObject obj) {
        return T;
    }

    /**
     *
     *
     * @return boolean; t iff TERM is of one of the following two forms:
    1. (<uom> <num1>) where <uom> is an instance of #$UnitOfMeasure in MT
    and <num1> is a SubLRealNumber
    2. (<uom> <num1> <num2>)  where <uom> is an instance of #$UnitOfMeasure in MT
    and <num1> is a SubLRealNumber
    and <num2> is a SubLRealNumber
    and <num2> >= <num1>
     */
    @LispMethod(comment = "@return boolean; t iff TERM is of one of the following two forms:\r\n1. (<uom> <num1>) where <uom> is an instance of #$UnitOfMeasure in MT\r\nand <num1> is a SubLRealNumber\r\n2. (<uom> <num1> <num2>)  where <uom> is an instance of #$UnitOfMeasure in MT\r\nand <num1> is a SubLRealNumber\r\nand <num2> is a SubLRealNumber\r\nand <num2> >= <num1>")
    public static final SubLObject ibqeP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_number_p(v_term)) {
            return T;
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            if (NIL != el_formula_p(v_term)) {
                if (NIL != formula_arityE(v_term, ONE_INTEGER, UNPROVIDED)) {
                    return makeBoolean(cycl_utilities.formula_arg1(v_term, UNPROVIDED).isNumber() && (NIL != com.cyc.cycjava.cycl.collection_defns.unit_of_measureP(cycl_utilities.formula_operator(v_term), mt)));
                } else {
                    if (NIL != formula_arityE(v_term, TWO_INTEGER, UNPROVIDED)) {
                        return makeBoolean((cycl_utilities.formula_arg1(v_term, UNPROVIDED).isNumber() && (NIL != com.cyc.cycjava.cycl.collection_defns.unit_of_measureP(cycl_utilities.formula_operator(v_term), mt))) && cycl_utilities.formula_arg2(v_term, UNPROVIDED).numGE(cycl_utilities.formula_arg1(v_term, UNPROVIDED)));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff TERM is of one of the following two forms:
    1. (<uom> <num1>) where <uom> is an instance of #$UnitOfMeasure in MT
    and <num1> is a SubLRealNumber
    2. (<uom> <num1> <num2>)  where <uom> is an instance of #$UnitOfMeasure in MT
    and <num1> is a SubLRealNumber
    and <num2> is a SubLRealNumber
    and <num2> >= <num1>
     */
    @LispMethod(comment = "@return boolean; t iff TERM is of one of the following two forms:\r\n1. (<uom> <num1>) where <uom> is an instance of #$UnitOfMeasure in MT\r\nand <num1> is a SubLRealNumber\r\n2. (<uom> <num1> <num2>)  where <uom> is an instance of #$UnitOfMeasure in MT\r\nand <num1> is a SubLRealNumber\r\nand <num2> is a SubLRealNumber\r\nand <num2> >= <num1>")
    public static SubLObject ibqeP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_numbers.extended_number_p(v_term)) {
            return T;
        }
        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_formula_p(v_term))) {
            if (NIL != formula_arityE(v_term, ONE_INTEGER, UNPROVIDED)) {
                return makeBoolean((NIL != extended_numbers.possibly_infinite_or_extended_number_p(cycl_utilities.formula_arg1(v_term, UNPROVIDED))) && (NIL != unit_of_measureP(cycl_utilities.formula_operator(v_term), mt)));
            }
            if (NIL != formula_arityE(v_term, TWO_INTEGER, UNPROVIDED)) {
                return makeBoolean(((NIL != extended_numbers.possibly_infinite_or_extended_number_p(cycl_utilities.formula_arg1(v_term, UNPROVIDED))) && (NIL != unit_of_measureP(cycl_utilities.formula_operator(v_term), mt))) && (NIL != extended_numbers.possibly_infinite_or_extended_numberLE(cycl_utilities.formula_arg1(v_term, UNPROVIDED), cycl_utilities.formula_arg2(v_term, UNPROVIDED))));
            }
        }
        return NIL;
    }

    /**
     * defnIff for #$IBQE
     */
    @LispMethod(comment = "defnIff for #$IBQE")
    public static final SubLObject cyc_ibqe_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.collection_defns.ibqeP(v_term, UNPROVIDED);
    }

    /**
     * defnIff for #$IBQE
     */
    @LispMethod(comment = "defnIff for #$IBQE")
    public static SubLObject cyc_ibqe(final SubLObject v_term) {
        return ibqeP(v_term, UNPROVIDED);
    }

    public static final SubLObject scalar_point_valueP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_number_p(v_term)) {
            return T;
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            if ((NIL != el_formula_p(v_term)) && (NIL == formula_with_sequence_varP(v_term))) {
                {
                    SubLObject length = formula_length(v_term, UNPROVIDED);
                    return makeBoolean(((length.numGE(TWO_INTEGER) && second(v_term).isNumber()) && (NIL != com.cyc.cycjava.cycl.collection_defns.unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && third(v_term).isNumber()) && third(v_term).numE(second(v_term)))));
                }
            }
        }
        return NIL;
    }

    public static SubLObject scalar_point_valueP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_numbers.extended_number_p(v_term)) {
            return T;
        }
        if (((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_formula_p(v_term))) && (NIL == formula_with_sequence_varP(v_term))) {
            final SubLObject length = formula_length(v_term, UNPROVIDED);
            return makeBoolean(((length.numGE(TWO_INTEGER) && (NIL != extended_numbers.extended_number_p(second(v_term)))) && (NIL != unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && (NIL != extended_numbers.extended_number_p(third(v_term)))) && (NIL != extended_numbers.extended_numberE(third(v_term), second(v_term), UNPROVIDED)))));
        }
        return NIL;
    }

    public static SubLObject scalar_integral_valueP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_numbers.extended_number_integer_p(v_term)) {
            return T;
        }
        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != formula_p_function_isa_instance_of(v_term, $$UnitOfMeasure, mt))) {
            final SubLObject length = formula_length(v_term, UNPROVIDED);
            return makeBoolean((length.numGE(TWO_INTEGER) && (NIL != extended_numbers.extended_number_integer_p(second(v_term)))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && (NIL != extended_numbers.extended_number_integer_p(third(v_term)))) && (NIL != extended_numbers.extended_numberE(third(v_term), second(v_term), UNPROVIDED)))));
        }
        return NIL;
    }

    public static final SubLObject non_negative_scalar_intervalP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_term.isNumber()) {
            return numGE(v_term, ZERO_INTEGER);
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            if ((NIL != el_formula_p(v_term)) && (NIL == formula_with_sequence_varP(v_term))) {
                {
                    SubLObject length = formula_length(v_term, UNPROVIDED);
                    return makeBoolean((((length.numGE(TWO_INTEGER) && second(v_term).isNumber()) && second(v_term).numGE(ZERO_INTEGER)) && (NIL != com.cyc.cycjava.cycl.collection_defns.unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && third(v_term).isNumber()) && third(v_term).numGE(second(v_term)))));
                }
            }
        }
        return NIL;
    }

    public static SubLObject non_negative_scalar_intervalP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_numbers.extended_number_p(v_term)) {
            return extended_numbers.extended_numberGE(v_term, ZERO_INTEGER, UNPROVIDED);
        }
        if (((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_formula_p(v_term))) && (NIL == formula_with_sequence_varP(v_term))) {
            final SubLObject length = formula_length(v_term, UNPROVIDED);
            return makeBoolean((((length.numGE(TWO_INTEGER) && (NIL != extended_numbers.extended_number_p(second(v_term)))) && (NIL != extended_numbers.extended_numberGE(second(v_term), ZERO_INTEGER, UNPROVIDED))) && (NIL != unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && (NIL != extended_numbers.extended_number_p(third(v_term)))) && (NIL != extended_numbers.extended_numberGE(third(v_term), second(v_term), UNPROVIDED)))));
        }
        return NIL;
    }

    public static final SubLObject positive_scalar_intervalP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_term.isNumber()) {
            return numG(v_term, ZERO_INTEGER);
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            if ((NIL != el_formula_p(v_term)) && (NIL == formula_with_sequence_varP(v_term))) {
                {
                    SubLObject length = formula_length(v_term, UNPROVIDED);
                    return makeBoolean((((length.numGE(TWO_INTEGER) && second(v_term).isNumber()) && second(v_term).numG(ZERO_INTEGER)) && (NIL != com.cyc.cycjava.cycl.collection_defns.unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && third(v_term).isNumber()) && third(v_term).numGE(second(v_term)))));
                }
            }
        }
        return NIL;
    }

    public static SubLObject positive_scalar_intervalP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_numbers.extended_number_p(v_term)) {
            return extended_numbers.extended_numberG(v_term, ZERO_INTEGER, UNPROVIDED);
        }
        if (((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_formula_p(v_term))) && (NIL == formula_with_sequence_varP(v_term))) {
            final SubLObject length = formula_length(v_term, UNPROVIDED);
            return makeBoolean((((length.numGE(TWO_INTEGER) && (NIL != extended_numbers.extended_number_p(second(v_term)))) && (NIL != extended_numbers.extended_numberG(second(v_term), ZERO_INTEGER, UNPROVIDED))) && (NIL != unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || ((length.numE(THREE_INTEGER) && (NIL != extended_numbers.extended_number_p(third(v_term)))) && (NIL != extended_numbers.extended_numberGE(third(v_term), second(v_term), UNPROVIDED)))));
        }
        return NIL;
    }

    public static SubLObject negative_scalar_intervalP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != extended_numbers.extended_number_p(v_term)) {
            return extended_numbers.extended_numberL(v_term, ZERO_INTEGER, UNPROVIDED);
        }
        if (((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != el_formula_p(v_term))) && (NIL == formula_with_sequence_varP(v_term))) {
            final SubLObject length = formula_length(v_term, UNPROVIDED);
            return makeBoolean((((length.numGE(TWO_INTEGER) && (NIL != extended_numbers.extended_number_p(second(v_term)))) && (NIL != extended_numbers.extended_numberL(second(v_term), ZERO_INTEGER, UNPROVIDED))) && (NIL != unit_of_measureP(v_term.first(), mt))) && (length.numE(TWO_INTEGER) || (((length.numE(THREE_INTEGER) && (NIL != extended_numbers.extended_number_p(third(v_term)))) && (NIL != extended_numbers.extended_numberL(third(v_term), ZERO_INTEGER, UNPROVIDED))) && (NIL != extended_numbers.extended_numberGE(third(v_term), second(v_term), UNPROVIDED)))));
        }
        return NIL;
    }

    public static SubLObject formula_p_function_isa_instance_of(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            return makeBoolean(((NIL != el_formula_p(v_term)) && (NIL == formula_with_sequence_varP(v_term))) && (NIL != isa.isaP(v_term.first(), col, mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject unit_of_measureP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            return isa.isaP(v_term, $$UnitOfMeasure, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject unit_of_measureP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != kb_control_vars.quant_kb_loaded_p()) {
            return isa.isaP(v_term, $$UnitOfMeasure, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cyc_fractional_measurable_quantity_simple_p(final SubLObject v_term) {
        return cycl_fractional_measurable_quantity_simple_p(v_term, UNPROVIDED);
    }

    public static SubLObject cycl_fractional_measurable_quantity_simple_p(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean(((NIL != possibly_naut_p(v_term)) && (NIL != unit_of_measureP(cycl_utilities.naut_functor(v_term), mt))) && ((NIL != simple_fractionP(cycl_utilities.naut_arg1(v_term, UNPROVIDED), mt)) || (NIL != simple_fractionP(cycl_utilities.naut_arg2(v_term, UNPROVIDED), mt))));
    }

    public static SubLObject simple_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$SimpleFraction, mt, UNPROVIDED);
    }

    public static SubLObject cyc_fractional_measurable_quantity_mixed_p(final SubLObject v_term) {
        return cycl_fractional_measurable_quantity_mixed_p(v_term, UNPROVIDED);
    }

    public static SubLObject cycl_fractional_measurable_quantity_mixed_p(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean(((NIL != possibly_naut_p(v_term)) && (NIL != unit_of_measureP(cycl_utilities.naut_functor(v_term), mt))) && ((NIL != mixed_fractionP(cycl_utilities.naut_arg1(v_term, UNPROVIDED), mt)) || (NIL != mixed_fractionP(cycl_utilities.naut_arg2(v_term, UNPROVIDED), mt))));
    }

    public static SubLObject mixed_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return formula_pattern_match.formula_matches_pattern(v_term, $list166);
    }

    public static SubLObject negative_mixed_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return formula_pattern_match.formula_matches_pattern(v_term, $list167);
    }

    public static SubLObject cyc_fractional_measurable_quantity_decimal_p(final SubLObject v_term) {
        return cycl_fractional_measurable_quantity_decimal_p(v_term, UNPROVIDED);
    }

    public static SubLObject cycl_fractional_measurable_quantity_decimal_p(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean(((NIL != possibly_naut_p(v_term)) && (NIL != unit_of_measureP(cycl_utilities.naut_functor(v_term), mt))) && ((NIL != decimal_fractionP(cycl_utilities.naut_arg1(v_term, UNPROVIDED), mt)) || (NIL != decimal_fractionP(cycl_utilities.naut_arg2(v_term, UNPROVIDED), mt))));
    }

    public static SubLObject decimal_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$DecimalFraction, mt, UNPROVIDED);
    }

    public static SubLObject fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != possibly_naut_p(v_term)) && (NIL != genls.any_specP($$Fraction, kb_accessors.result_isa(cycl_utilities.naut_functor(v_term), mt), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject fraction_strong(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$Fraction, mt, UNPROVIDED);
    }

    public static final SubLObject term_setP_alt(SubLObject terms) {
        if ((NIL != el_formula_p(terms)) && (NIL == formula_with_sequence_varP(terms))) {
            if (NIL == list_utilities.duplicatesP(terms, symbol_function(EQUAL), UNPROVIDED)) {
                {
                    SubLObject not_a_termP = NIL;
                    if (NIL == not_a_termP) {
                        {
                            SubLObject csome_list_var = terms;
                            SubLObject v_term = NIL;
                            for (v_term = csome_list_var.first(); !((NIL != not_a_termP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                if (NIL == term.first_order_termP(v_term)) {
                                    not_a_termP = T;
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == not_a_termP);
                }
            }
        }
        return NIL;
    }

    public static SubLObject term_setP(final SubLObject terms) {
        if (((NIL != el_formula_p(terms)) && (NIL == formula_with_sequence_varP(terms))) && (NIL == list_utilities.duplicatesP(terms, symbol_function(EQUAL), UNPROVIDED))) {
            SubLObject not_a_termP = NIL;
            if (NIL == not_a_termP) {
                SubLObject csome_list_var = terms;
                SubLObject v_term = NIL;
                v_term = csome_list_var.first();
                while ((NIL == not_a_termP) && (NIL != csome_list_var)) {
                    if (NIL == term.first_order_termP(v_term)) {
                        not_a_termP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == not_a_termP);
        }
        return NIL;
    }

    /**
     * Does not admit sequence variables, but does admit NIL
     */
    @LispMethod(comment = "Does not admit sequence variables, but does admit NIL")
    public static final SubLObject cycl_var_listP_alt(SubLObject v_object) {
        if ((NIL == v_object) || (NIL != list_utilities.proper_list_p(v_object))) {
            {
                SubLObject not_cycl_var_listP = NIL;
                if (NIL == not_cycl_var_listP) {
                    {
                        SubLObject csome_list_var = v_object;
                        SubLObject element = NIL;
                        for (element = csome_list_var.first(); !((NIL != not_cycl_var_listP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , element = csome_list_var.first()) {
                            if (!((NIL != cycl_variables.el_varP(element)) || (NIL != cycl_variables.kb_varP(element)))) {
                                not_cycl_var_listP = T;
                            }
                        }
                    }
                }
                return makeBoolean(NIL == not_cycl_var_listP);
            }
        }
        return NIL;
    }

    /**
     * Does not admit sequence variables, but does admit NIL
     */
    @LispMethod(comment = "Does not admit sequence variables, but does admit NIL")
    public static SubLObject cycl_var_listP(final SubLObject v_object) {
        if ((NIL == v_object) || (NIL != list_utilities.proper_list_p(v_object))) {
            SubLObject not_cycl_var_listP = NIL;
            if (NIL == not_cycl_var_listP) {
                SubLObject csome_list_var = v_object;
                SubLObject element = NIL;
                element = csome_list_var.first();
                while ((NIL == not_cycl_var_listP) && (NIL != csome_list_var)) {
                    if ((NIL == cycl_variables.el_varP(element)) && (NIL == cycl_variables.kb_varP(element))) {
                        not_cycl_var_listP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    element = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == not_cycl_var_listP);
        }
        return NIL;
    }

    public static final SubLObject cyc_el_var_listP_alt(SubLObject v_object) {
        return el_var_listP(v_object);
    }

    public static SubLObject cyc_el_var_listP(final SubLObject v_object) {
        return el_var_listP(v_object);
    }

    public static final SubLObject cyc_system_atom_alt(SubLObject v_object) {
        return makeBoolean((!v_object.isCons()) && (NIL == forts.fort_p(v_object)));
    }

    public static SubLObject cyc_system_atom(final SubLObject v_object) {
        return makeBoolean((!v_object.isCons()) && (NIL == forts.fort_p(v_object)));
    }

    public static final SubLObject cyc_list_of_lists_alt(SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
            return NIL;
        }
        {
            SubLObject failedP = NIL;
            SubLObject terms = cycl_utilities.formula_terms(v_object, $IGNORE);
            SubLObject rest = NIL;
            for (rest = terms; !((NIL != failedP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject item = rest.first();
                    if (!item.isList()) {
                        failedP = T;
                    }
                }
            }
            return makeBoolean(NIL == failedP);
        }
    }

    public static SubLObject cyc_list_of_lists(final SubLObject v_object) {
        if (NIL == el_formula_p(v_object)) {
            return NIL;
        }
        SubLObject failedP = NIL;
        final SubLObject terms = cycl_utilities.formula_terms(v_object, $IGNORE);
        SubLObject rest;
        SubLObject item;
        for (rest = NIL, rest = terms; (NIL == failedP) && (NIL != rest); rest = rest.rest()) {
            item = rest.first();
            if (!item.isList()) {
                failedP = T;
            }
        }
        return makeBoolean(NIL == failedP);
    }

    /**
     * #$defnIff for uses of #$StringOfLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$StringOfLengthFn")
    public static final SubLObject cyc_string_is_length_alt(SubLObject string) {
        if (string.isString()) {
            {
                SubLObject defn_collection = defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (length.isInteger()) {
                            return numE(length, length(string));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$StringOfLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$StringOfLengthFn")
    public static SubLObject cyc_string_is_length(final SubLObject string) {
        if (string.isString()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (length.isInteger()) {
                    return numE(length, length(string));
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$StringOfMinimumLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$StringOfMinimumLengthFn")
    public static final SubLObject cyc_string_is_minimum_length_alt(SubLObject string) {
        if (string.isString()) {
            {
                SubLObject defn_collection = defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMinLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (length.isInteger()) {
                            return numLE(length, length(string));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$StringOfMinimumLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$StringOfMinimumLengthFn")
    public static SubLObject cyc_string_is_minimum_length(final SubLObject string) {
        if (string.isString()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMinLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (length.isInteger()) {
                    return numLE(length, length(string));
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$StringOfMinimumLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$StringOfMinimumLengthFn")
    public static final SubLObject cyc_string_is_maximum_length_alt(SubLObject string) {
        if (string.isString()) {
            {
                SubLObject defn_collection = defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMaxLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (length.isInteger()) {
                            return numGE(length, length(string));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$StringOfMinimumLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$StringOfMinimumLengthFn")
    public static SubLObject cyc_string_is_maximum_length(final SubLObject string) {
        if (string.isString()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMaxLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (length.isInteger()) {
                    return numGE(length, length(string));
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$ListOfLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$ListOfLengthFn")
    public static final SubLObject cyc_list_is_length_alt(SubLObject list) {
        if (list.isList()) {
            {
                SubLObject defn_collection = defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (length.isInteger()) {
                            return com.cyc.cycjava.cycl.collection_defns.cyc_list_is_length_internal(list, length);
                        }
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$ListOfLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$ListOfLengthFn")
    public static SubLObject cyc_list_is_length(final SubLObject list) {
        if (list.isList()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (length.isInteger()) {
                    return cyc_list_is_length_internal(list, length);
                }
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject cyc_list_is_length_internal_alt(SubLObject list, SubLObject length) {
        if (!list.isCons()) {
            return NIL;
        }
        {
            SubLObject functor = cycl_utilities.nat_functor(list);
            if (functor != $$TheList) {
                return NIL;
            }
            {
                SubLObject v_arity = cycl_utilities.nat_arity(list, UNPROVIDED);
                return numE(v_arity, length);
            }
        }
    }

    public static SubLObject cyc_list_is_length_internal(final SubLObject list, final SubLObject length) {
        if (!list.isCons()) {
            return NIL;
        }
        final SubLObject functor = cycl_utilities.nat_functor(list);
        if (!functor.eql($$TheList)) {
            return NIL;
        }
        final SubLObject v_arity = cycl_utilities.nat_arity(list, UNPROVIDED);
        return numE(v_arity, length);
    }

    public static final SubLObject rtp_syntactic_constraint_alt(SubLObject v_term) {
        return rtp_type_checkers.valid_rtp_syntactic_constraintP(v_term);
    }

    public static SubLObject rtp_syntactic_constraint(final SubLObject v_term) {
        return rtp_type_checkers.valid_rtp_syntactic_constraintP(v_term);
    }

    public static final SubLObject cyc_subl_query_property_p_alt(SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return inference_datastructures_enumerated_types.query_property_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static SubLObject cyc_subl_query_property_p(final SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return inference_datastructures_enumerated_types.query_property_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static final SubLObject cyc_subl_tv_p_alt(SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return enumeration_types.tv_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static SubLObject cyc_subl_tv_p(final SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return enumeration_types.tv_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static final SubLObject cyc_subl_hl_support_module_p_alt(SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return hl_supports.hl_support_module_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static SubLObject cyc_subl_hl_support_module_p(final SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return hl_supports.hl_support_module_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static final SubLObject cyc_subl_asserted_argument_token_p_alt(SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return arguments.asserted_argument_token_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static SubLObject cyc_subl_asserted_argument_token_p(final SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return arguments.asserted_argument_token_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static final SubLObject cyc_subl_kct_metric_identifier_p_alt(SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return ctest_macros.ctest_metric_identifier_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static SubLObject cyc_subl_kct_metric_identifier_p(final SubLObject v_object) {
        if (NIL != subl_escape_p(v_object)) {
            return ctest_macros.ctest_metric_identifier_p(subl_escape_subl(v_object));
        }
        return NIL;
    }

    public static final SubLObject cyc_8_byte_integer_alt(SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($8byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($8byteinteger_upper_bound$.getGlobalValue()));
    }

    public static SubLObject cyc_8_byte_integer(final SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($8byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($8byteinteger_upper_bound$.getGlobalValue()));
    }

    public static final SubLObject cyc_4_byte_integer_alt(SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($4byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($4byteinteger_upper_bound$.getGlobalValue()));
    }

    public static SubLObject cyc_4_byte_integer(final SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($4byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($4byteinteger_upper_bound$.getGlobalValue()));
    }

    public static final SubLObject cyc_2_byte_integer_alt(SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($2byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($2byteinteger_upper_bound$.getGlobalValue()));
    }

    public static SubLObject cyc_2_byte_integer(final SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($2byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($2byteinteger_upper_bound$.getGlobalValue()));
    }

    public static final SubLObject cyc_1_byte_integer_alt(SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($1byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($1byteinteger_upper_bound$.getGlobalValue()));
    }

    public static SubLObject cyc_1_byte_integer(final SubLObject v_term) {
        return makeBoolean((v_term.isInteger() && v_term.numG($1byteinteger_lower_bound$.getGlobalValue())) && v_term.numL($1byteinteger_upper_bound$.getGlobalValue()));
    }

    public static final SubLObject cyc_bit_datatype_alt(SubLObject v_term) {
        return isa.isaP(v_term, $$BitData, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_bit_datatype(final SubLObject v_term) {
        return isa.isaP(v_term, $$BitData, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_bit_string_alt(SubLObject v_term) {
        return makeBoolean(v_term.isList() && (NIL != list_utilities.every_in_list(CYC_BIT_DATATYPE, v_term, UNPROVIDED)));
    }

    public static SubLObject cyc_bit_string(final SubLObject v_term) {
        return makeBoolean(v_term.isList() && (NIL != list_utilities.every_in_list(CYC_BIT_DATATYPE, v_term, UNPROVIDED)));
    }

    public static final SubLObject cyc_ip4_address_alt(SubLObject v_term) {
        if (!v_term.isString()) {
            return NIL;
        }
        {
            SubLObject parts = string_utilities.string_tokenize(v_term, $list_alt179, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == list_utilities.lengthE(parts, FOUR_INTEGER, UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = parts;
                SubLObject part = NIL;
                for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                    if (NIL != string_utilities.empty_string_p(part)) {
                        return NIL;
                    } else {
                        {
                            SubLObject num = string_utilities.string_to_integer(part);
                            if (!((num.isInteger() && num.numL($int$256)) && num.numGE(ZERO_INTEGER))) {
                                return NIL;
                            }
                        }
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject cyc_ip4_address(final SubLObject v_term) {
        if (!v_term.isString()) {
            return NIL;
        }
        final SubLObject parts = string_utilities.string_tokenize(v_term, $list209, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == list_utilities.lengthE(parts, FOUR_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var = parts;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.empty_string_p(part)) {
                return NIL;
            }
            final SubLObject num = string_utilities.string_to_integer(part);
            if (((!num.isInteger()) || (!num.numL($int$256))) || (!num.numGE(ZERO_INTEGER))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @unknown (cyc-IP4-network-address "192.168.0.1/32")
    T
     */
    @LispMethod(comment = "@unknown (cyc-IP4-network-address \"192.168.0.1/32\")\r\nT")
    public static final SubLObject cyc_ip4_network_address_alt(SubLObject v_term) {
        if (!v_term.isString()) {
            return NIL;
        }
        {
            SubLObject split_subnet = string_utilities.string_tokenize(v_term, $list_alt182, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!((NIL != list_utilities.lengthLE(split_subnet, TWO_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthG(split_subnet, ZERO_INTEGER, UNPROVIDED)))) {
                return NIL;
            }
            if (NIL == list_utilities.singletonP(split_subnet)) {
                {
                    SubLObject subnet_part = second(split_subnet);
                    if (NIL != string_utilities.empty_string_p(subnet_part)) {
                        return NIL;
                    } else {
                        {
                            SubLObject subnetmask = string_utilities.string_to_integer(subnet_part);
                            if (!subnetmask.isInteger()) {
                                return NIL;
                            }
                            if (subnetmask.numGE(ZERO_INTEGER) && subnetmask.numL($int$33)) {
                                {
                                    SubLObject address = split_subnet.first();
                                    return com.cyc.cycjava.cycl.collection_defns.cyc_ip4_address(address);
                                }
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
            {
                SubLObject address = split_subnet.first();
                return com.cyc.cycjava.cycl.collection_defns.cyc_ip4_address(address);
            }
        }
    }

    /**
     *
     *
     * @unknown (cyc-IP4-network-address "192.168.0.1/32")
    T
     */
    @LispMethod(comment = "@unknown (cyc-IP4-network-address \"192.168.0.1/32\")\r\nT")
    public static SubLObject cyc_ip4_network_address(final SubLObject v_term) {
        if (!v_term.isString()) {
            return NIL;
        }
        final SubLObject split_subnet = string_utilities.string_tokenize(v_term, $list212, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == list_utilities.lengthLE(split_subnet, TWO_INTEGER, UNPROVIDED)) || (NIL == list_utilities.lengthG(split_subnet, ZERO_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(split_subnet)) {
            final SubLObject address = split_subnet.first();
            return cyc_ip4_address(address);
        }
        final SubLObject subnet_part = second(split_subnet);
        if (NIL != string_utilities.empty_string_p(subnet_part)) {
            return NIL;
        }
        final SubLObject subnetmask = string_utilities.string_to_integer(subnet_part);
        if (!subnetmask.isInteger()) {
            return NIL;
        }
        if (subnetmask.numGE(ZERO_INTEGER) && subnetmask.numL($int$33)) {
            final SubLObject address2 = split_subnet.first();
            return cyc_ip4_address(address2);
        }
        return NIL;
    }

    /**
     * #$defnIff for uses of #$ListOfMinimumLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$ListOfMinimumLengthFn")
    public static final SubLObject cyc_list_is_minimum_length_alt(SubLObject list) {
        if (list.isList()) {
            {
                SubLObject defn_collection = defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMinLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (length.isInteger()) {
                            return com.cyc.cycjava.cycl.collection_defns.cyc_list_is_minimum_length_internal(list, length);
                        }
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#$defnIff for uses of #$ListOfMinimumLengthFn")
    public static SubLObject cyc_list_is_minimum_length(final SubLObject list) {
        if (list.isList()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMinLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (length.isInteger()) {
                    return cyc_list_is_minimum_length_internal(list, length);
                }
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject cyc_list_is_minimum_length_internal_alt(SubLObject list, SubLObject length) {
        if (!list.isCons()) {
            return NIL;
        }
        {
            SubLObject functor = cycl_utilities.nat_functor(list);
            if (functor != $$TheList) {
                return NIL;
            }
            {
                SubLObject v_arity = cycl_utilities.nat_arity(list, UNPROVIDED);
                return numGE(v_arity, length);
            }
        }
    }

    public static SubLObject cyc_list_is_minimum_length_internal(final SubLObject list, final SubLObject length) {
        if (!list.isCons()) {
            return NIL;
        }
        final SubLObject functor = cycl_utilities.nat_functor(list);
        if (!functor.eql($$TheList)) {
            return NIL;
        }
        final SubLObject v_arity = cycl_utilities.nat_arity(list, UNPROVIDED);
        return numGE(v_arity, length);
    }

    /**
     * #$defnIff for uses of #$ListOfMinimumLengthFn
     */
    @LispMethod(comment = "#$defnIff for uses of #$ListOfMinimumLengthFn")
    public static final SubLObject cyc_list_is_maximum_length_alt(SubLObject list) {
        if (list.isList()) {
            {
                SubLObject defn_collection = defn_collection();
                if (NIL != forts.fort_p(defn_collection)) {
                    {
                        SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMaxLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (length.isInteger()) {
                            return com.cyc.cycjava.cycl.collection_defns.cyc_list_is_maximum_length_internal(list, length);
                        }
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#$defnIff for uses of #$ListOfMinimumLengthFn")
    public static SubLObject cyc_list_is_maximum_length(final SubLObject list) {
        if (list.isList()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, $$instanceListMaxLength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (length.isInteger()) {
                    return cyc_list_is_maximum_length_internal(list, length);
                }
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject cyc_list_is_maximum_length_internal_alt(SubLObject list, SubLObject length) {
        if (!list.isCons()) {
            return NIL;
        }
        {
            SubLObject functor = cycl_utilities.nat_functor(list);
            if (functor != $$TheList) {
                return NIL;
            }
            {
                SubLObject v_arity = cycl_utilities.nat_arity(list, UNPROVIDED);
                return numLE(v_arity, length);
            }
        }
    }

    public static SubLObject cyc_list_is_maximum_length_internal(final SubLObject list, final SubLObject length) {
        if (!list.isCons()) {
            return NIL;
        }
        final SubLObject functor = cycl_utilities.nat_functor(list);
        if (!functor.eql($$TheList)) {
            return NIL;
        }
        final SubLObject v_arity = cycl_utilities.nat_arity(list, UNPROVIDED);
        return numLE(v_arity, length);
    }

    public static SubLObject cyc_addition_expression(final SubLObject expression) {
        return math_expression_utilities.math_addition_expressionP(expression);
    }

    public static SubLObject cyc_subtraction_expression(final SubLObject expression) {
        return math_expression_utilities.math_subtraction_expressionP(expression);
    }

    public static SubLObject cyc_multiplication_expression(final SubLObject expression) {
        return math_expression_utilities.math_multiplication_expressionP(expression);
    }

    public static SubLObject cyc_division_expression(final SubLObject expression) {
        return math_expression_utilities.math_division_expressionP(expression);
    }

    public static SubLObject cyc_exponentiation_expression(final SubLObject expression) {
        return math_expression_utilities.math_exponentiation_expressionP(expression);
    }

    public static SubLObject cyc_nth_root_expression(final SubLObject expression) {
        return math_expression_utilities.math_nth_root_expressionP(expression);
    }

    public static SubLObject cyc_enclosed_math_expression(final SubLObject expression) {
        return math_expression_utilities.math_enclosed_math_expressionP(expression);
    }

    public static SubLObject cyc_univariate_linear_equation(final SubLObject expression) {
        return math_expression_utilities.math_equation_univariate_linearP(expression);
    }

    public static SubLObject test_math_expression_fn_collection_defns(final SubLObject v_term, final SubLObject col) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(list($$isa, v_term, col), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject declare_collection_defns_file() {
        declareFunction("cyc_individual_necessary", "CYC-INDIVIDUAL-NECESSARY", 1, 0, false);
        new collection_defns.$cyc_individual_necessary$UnaryFunction();
        declareFunction("cyc_kappa_predicate_by_arity", "CYC-KAPPA-PREDICATE-BY-ARITY", 1, 0, false);
        declareFunction("clear_cached_relation_type_arity", "CLEAR-CACHED-RELATION-TYPE-ARITY", 0, 0, false);
        declareFunction("remove_cached_relation_type_arity", "REMOVE-CACHED-RELATION-TYPE-ARITY", 1, 0, false);
        declareFunction("cached_relation_type_arity_internal", "CACHED-RELATION-TYPE-ARITY-INTERNAL", 1, 0, false);
        declareFunction("cached_relation_type_arity", "CACHED-RELATION-TYPE-ARITY", 1, 0, false);
        declareFunction("cycl_expressionP", "CYCL-EXPRESSION?", 1, 0, false);
        declareFunction("el_expressionP", "EL-EXPRESSION?", 1, 0, false);
        declareFunction("hl_expression_p", "HL-EXPRESSION-P", 1, 0, false);
        declareFunction("cycl_open_denotational_termP", "CYCL-OPEN-DENOTATIONAL-TERM?", 1, 0, false);
        declareFunction("cycl_closed_denotational_termP", "CYCL-CLOSED-DENOTATIONAL-TERM?", 1, 0, false);
        declareFunction("cycl_reifiable_denotational_termP", "CYCL-REIFIABLE-DENOTATIONAL-TERM?", 1, 0, false);
        declareFunction("cycl_reified_denotational_termP", "CYCL-REIFIED-DENOTATIONAL-TERM?", 1, 0, false);
        declareFunction("hl_closed_denotational_term_p", "HL-CLOSED-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction("cycl_represented_atomic_term_p", "CYCL-REPRESENTED-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("cycl_represented_termP", "CYCL-REPRESENTED-TERM?", 1, 0, false);
        declareFunction("cyc_system_term_p", "CYC-SYSTEM-TERM-P", 1, 0, false);
        declareFunction("cyc_system_character_p", "CYC-SYSTEM-CHARACTER-P", 1, 0, false);
        declareFunction("cyc_system_string_p", "CYC-SYSTEM-STRING-P", 1, 0, false);
        declareFunction("cyc_system_real_number_p", "CYC-SYSTEM-REAL-NUMBER-P", 1, 0, false);
        declareFunction("cyc_system_non_variable_symbol_p", "CYC-SYSTEM-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        declareFunction("cycl_subl_symbol_p", "CYCL-SUBL-SYMBOL-P", 1, 0, false);
        declareFunction("cycl_atomic_term_p", "CYCL-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("cycl_closed_atomic_term_p", "CYCL-CLOSED-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("hl_non_atomic_term_p", "HL-NON-ATOMIC-TERM-P", 1, 0, false);
        declareFunction("cycl_non_atomic_termP", "CYCL-NON-ATOMIC-TERM?", 1, 0, false);
        declareFunction("el_non_atomic_termP", "EL-NON-ATOMIC-TERM?", 1, 0, false);
        declareFunction("hl_indexed_term_p", "HL-INDEXED-TERM-P", 1, 0, false);
        declareFunction("cycl_indexed_termP", "CYCL-INDEXED-TERM?", 1, 0, false);
        declareFunction("cycl_open_non_atomic_termP", "CYCL-OPEN-NON-ATOMIC-TERM?", 1, 0, false);
        declareFunction("cycl_closed_non_atomic_termP", "CYCL-CLOSED-NON-ATOMIC-TERM?", 1, 0, false);
        declareFunction("cycl_reifiable_non_atomic_termP", "CYCL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
        declareFunction("cycl_non_atomic_reified_termP", "CYCL-NON-ATOMIC-REIFIED-TERM?", 1, 0, false);
        declareFunction("el_reifiable_non_atomic_termP", "EL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
        declareFunction("cycl_closed_expressionP", "CYCL-CLOSED-EXPRESSION?", 1, 0, false);
        declareFunction("cycl_open_expressionP", "CYCL-OPEN-EXPRESSION?", 1, 0, false);
        declareFunction("cycl_formulaP", "CYCL-FORMULA?", 1, 0, false);
        declareFunction("cycl_open_formulaP", "CYCL-OPEN-FORMULA?", 1, 0, false);
        declareFunction("cycl_closed_formulaP", "CYCL-CLOSED-FORMULA?", 1, 0, false);
        declareFunction("hl_formula_p", "HL-FORMULA-P", 1, 0, false);
        declareFunction("cycl_unbound_relation_formula_p", "CYCL-UNBOUND-RELATION-FORMULA-P", 1, 0, false);
        declareFunction("cycl_sentenceP", "CYCL-SENTENCE?", 1, 0, false);
        declareFunction("cycl_open_sentenceP", "CYCL-OPEN-SENTENCE?", 1, 0, false);
        declareFunction("cycl_closed_sentenceP", "CYCL-CLOSED-SENTENCE?", 1, 0, false);
        declareFunction("cyc_typicality_reference_set_propertyP", "CYC-TYPICALITY-REFERENCE-SET-PROPERTY?", 1, 0, false);
        new collection_defns.$cyc_typicality_reference_set_propertyP$UnaryFunction();
        declareFunction("el_sentenceP", "EL-SENTENCE?", 1, 0, false);
        declareFunction("cycl_atomic_sentenceP", "CYCL-ATOMIC-SENTENCE?", 1, 0, false);
        declareFunction("cycl_closed_atomic_sentenceP", "CYCL-CLOSED-ATOMIC-SENTENCE?", 1, 0, false);
        declareFunction("cycl_propositional_sentenceP", "CYCL-PROPOSITIONAL-SENTENCE?", 1, 0, false);
        declareFunction("cycl_sentence_askableP", "CYCL-SENTENCE-ASKABLE?", 1, 0, false);
        declareFunction("cycl_sentence_assertibleP", "CYCL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        new collection_defns.$cycl_sentence_assertibleP$UnaryFunction();
        declareFunction("el_sentence_askableP", "EL-SENTENCE-ASKABLE?", 1, 0, false);
        declareFunction("el_sentence_assertibleP", "EL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        declareFunction("cycl_non_atomic_term_askableP", "CYCL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
        declareFunction("cycl_non_atomic_term_assertibleP", "CYCL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
        declareFunction("el_non_atomic_term_askableP", "EL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
        declareFunction("el_non_atomic_term_assertibleP", "EL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
        declareFunction("cycl_expression_askableP", "CYCL-EXPRESSION-ASKABLE?", 1, 0, false);
        declareFunction("cycl_expression_assertibleP", "CYCL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
        declareFunction("el_expression_askableP", "EL-EXPRESSION-ASKABLE?", 1, 0, false);
        declareFunction("el_expression_assertibleP", "EL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
        declareFunction("cycl_queryP", "CYCL-QUERY?", 1, 0, false);
        declareFunction("cycl_assertionP", "CYCL-ASSERTION?", 1, 0, false);
        declareFunction("cycl_atomic_assertionP", "CYCL-ATOMIC-ASSERTION?", 1, 0, false);
        declareFunction("cycl_gaf_assertionP", "CYCL-GAF-ASSERTION?", 1, 0, false);
        declareFunction("cycl_rule_assertionP", "CYCL-RULE-ASSERTION?", 1, 0, false);
        declareFunction("cycl_asserted_assertionP", "CYCL-ASSERTED-ASSERTION?", 1, 0, false);
        declareFunction("cycl_deduced_assertionP", "CYCL-DEDUCED-ASSERTION?", 1, 0, false);
        declareFunction("cycl_nl_semantic_assertionP", "CYCL-NL-SEMANTIC-ASSERTION?", 1, 0, false);
        declareFunction("cycl_canonicalizer_directiveP", "CYCL-CANONICALIZER-DIRECTIVE?", 1, 0, false);
        new collection_defns.$cycl_canonicalizer_directiveP$UnaryFunction();
        declareFunction("cycl_reformulator_directiveP", "CYCL-REFORMULATOR-DIRECTIVE?", 1, 0, false);
        declareFunction("cycl_reformulator_ruleP", "CYCL-REFORMULATOR-RULE?", 1, 0, false);
        declareFunction("cycl_simplifier_directiveP", "CYCL-SIMPLIFIER-DIRECTIVE?", 1, 0, false);
        declareFunction("hl_assertion_p", "HL-ASSERTION-P", 1, 0, false);
        declareFunction("el_assertionP", "EL-ASSERTION?", 1, 0, false);
        declareFunction("cyc_indexed_term", "CYC-INDEXED-TERM", 1, 0, false);
        declareFunction("cyc_assertion", "CYC-ASSERTION", 1, 0, false);
        declareFunction("cyc_gaf_assertion", "CYC-GAF-ASSERTION", 1, 0, false);
        declareFunction("cyc_rule_assertion", "CYC-RULE-ASSERTION", 1, 0, false);
        declareFunction("cyc_nl_semantic_assertion", "CYC-NL-SEMANTIC-ASSERTION", 1, 0, false);
        declareFunction("cyc_reifiable_term", "CYC-REIFIABLE-TERM", 1, 0, false);
        declareFunction("cyc_constant", "CYC-CONSTANT", 1, 0, false);
        declareFunction("cyc_reifiable_nat", "CYC-REIFIABLE-NAT", 1, 0, false);
        declareFunction("cyc_gaf", "CYC-GAF", 1, 0, false);
        declareFunction("cyc_atomic_sentence", "CYC-ATOMIC-SENTENCE", 1, 0, false);
        declareFunction("cyc_first_order_naut", "CYC-FIRST-ORDER-NAUT", 1, 0, false);
        declareFunction("cyc_term", "CYC-TERM", 1, 0, false);
        declareFunction("cyc_ground_term", "CYC-GROUND-TERM", 1, 0, false);
        declareFunction("cyc_closed_term", "CYC-CLOSED-TERM", 1, 0, false);
        declareFunction("cyc_open_term", "CYC-OPEN-TERM", 1, 0, false);
        declareFunction("cyc_real_number", "CYC-REAL-NUMBER", 1, 0, false);
        declareFunction("cyc_system_real_number", "CYC-SYSTEM-REAL-NUMBER", 1, 0, false);
        declareFunction("cyc_positive_number", "CYC-POSITIVE-NUMBER", 1, 0, false);
        declareFunction("cyc_negative_number", "CYC-NEGATIVE-NUMBER", 1, 0, false);
        declareFunction("cyc_non_positive_number", "CYC-NON-POSITIVE-NUMBER", 1, 0, false);
        declareFunction("cyc_non_negative_number", "CYC-NON-NEGATIVE-NUMBER", 1, 0, false);
        declareFunction("cyc_rational_number", "CYC-RATIONAL-NUMBER", 1, 0, false);
        declareFunction("cyc_real_0_100", "CYC-REAL-0-100", 1, 0, false);
        declareFunction("cyc_real_0_1", "CYC-REAL-0-1", 1, 0, false);
        declareFunction("cyc_real_minus_1_to_plus_1", "CYC-REAL-MINUS-1-TO-PLUS-1", 1, 0, false);
        declareFunction("cyc_real_1_infinity", "CYC-REAL-1-INFINITY", 1, 0, false);
        declareFunction("cyc_nonzero_number", "CYC-NONZERO-NUMBER", 1, 0, false);
        declareFunction("cyc_system_float", "CYC-SYSTEM-FLOAT", 1, 0, false);
        declareFunction("cyc_integer", "CYC-INTEGER", 1, 0, false);
        declareFunction("cyc_system_integer", "CYC-SYSTEM-INTEGER", 1, 0, false);
        declareFunction("cyc_positive_integer", "CYC-POSITIVE-INTEGER", 1, 0, false);
        declareFunction("cyc_prime_numberP", "CYC-PRIME-NUMBER?", 1, 0, false);
        declareFunction("cyc_maybe_prime_numberP", "CYC-MAYBE-PRIME-NUMBER?", 1, 0, false);
        declareFunction("cyc_negative_integer", "CYC-NEGATIVE-INTEGER", 1, 0, false);
        declareFunction("cyc_non_positive_integer", "CYC-NON-POSITIVE-INTEGER", 1, 0, false);
        declareFunction("cyc_non_negative_integer", "CYC-NON-NEGATIVE-INTEGER", 1, 0, false);
        declareFunction("cyc_even_number", "CYC-EVEN-NUMBER", 1, 0, false);
        declareFunction("cyc_odd_number", "CYC-ODD-NUMBER", 1, 0, false);
        declareFunction("cyc_universal_date", "CYC-UNIVERSAL-DATE", 1, 0, false);
        declareFunction("cyc_universal_second", "CYC-UNIVERSAL-SECOND", 1, 0, false);
        declareFunction("cyc_set_of_type_necessary", "CYC-SET-OF-TYPE-NECESSARY", 1, 0, false);
        declareFunction("cyc_set_of_type_sufficient", "CYC-SET-OF-TYPE-SUFFICIENT", 1, 0, false);
        declareFunction("cyc_list_of_type_necessary", "CYC-LIST-OF-TYPE-NECESSARY", 1, 0, false);
        new collection_defns.$cyc_list_of_type_necessary$UnaryFunction();
        declareFunction("cyc_list_of_type_sufficient", "CYC-LIST-OF-TYPE-SUFFICIENT", 1, 0, false);
        new collection_defns.$cyc_list_of_type_sufficient$UnaryFunction();
        declareFunction("cyc_set_of_type_guts", "CYC-SET-OF-TYPE-GUTS", 1, 0, false);
        declareFunction("clear_extensional_setP", "CLEAR-EXTENSIONAL-SET?", 0, 0, false);
        new collection_defns.$clear_extensional_setP$ZeroArityFunction();
        declareFunction("remove_extensional_setP", "REMOVE-EXTENSIONAL-SET?", 1, 0, false);
        declareFunction("extensional_setP_internal", "EXTENSIONAL-SET?-INTERNAL", 1, 0, false);
        declareFunction("extensional_setP", "EXTENSIONAL-SET?", 1, 0, false);
        declareFunction("cyc_set_of_type_internal", "CYC-SET-OF-TYPE-INTERNAL", 2, 0, false);
        declareFunction("cyc_list_of_type_guts", "CYC-LIST-OF-TYPE-GUTS", 1, 0, false);
        declareFunction("cyc_list_of_type_internal", "CYC-LIST-OF-TYPE-INTERNAL", 2, 0, false);
        declareFunction("every_in_list_has_type_within_collection_defn", "EVERY-IN-LIST-HAS-TYPE-WITHIN-COLLECTION-DEFN", 2, 0, false);
        declareFunction("cyc_list_without_repetition", "CYC-LIST-WITHOUT-REPETITION", 1, 0, false);
        declareFunction("cyc_numeric_string_necessary", "CYC-NUMERIC-STRING-NECESSARY", 1, 0, false);
        new collection_defns.$cyc_numeric_string_necessary$UnaryFunction();
        declareFunction("cyc_numeral_string", "CYC-NUMERAL-STRING", 1, 0, false);
        declareFunction("cyc_numeric_string", "CYC-NUMERIC-STRING", 1, 0, false);
        declareFunction("cyc_number_string", "CYC-NUMBER-STRING", 1, 0, false);
        declareFunction("cyc_zip_code_five_digit", "CYC-ZIP-CODE-FIVE-DIGIT", 1, 0, false);
        new collection_defns.$cyc_zip_code_five_digit$UnaryFunction();
        declareFunction("cyc_zip_code_nine_digit", "CYC-ZIP-CODE-NINE-DIGIT", 1, 0, false);
        new collection_defns.$cyc_zip_code_nine_digit$UnaryFunction();
        declareFunction("cyc_guid_string_p", "CYC-GUID-STRING-P", 1, 0, false);
        new collection_defns.$cyc_guid_string_p$UnaryFunction();
        declareFunction("cyc_naics_code", "CYC-NAICS-CODE", 1, 0, false);
        declareFunction("cyc_unicode_denoting_ascii_string_p", "CYC-UNICODE-DENOTING-ASCII-STRING-P", 1, 0, false);
        declareFunction("cyc_ascii_string_p", "CYC-ASCII-STRING-P", 1, 0, false);
        new collection_defns.$cyc_ascii_string_p$UnaryFunction();
        declareFunction("cyc_control_character_free_string_necessary", "CYC-CONTROL-CHARACTER-FREE-STRING-NECESSARY", 1, 0, false);
        declareFunction("cyc_url", "CYC-URL", 1, 0, false);
        declareFunction("doctor_me_idP", "DOCTOR-ME-ID?", 1, 0, false);
        declareFunction("numeric_string_of_lengthP", "NUMERIC-STRING-OF-LENGTH?", 2, 0, false);
        declareFunction("clpeP", "CLPE?", 1, 0, false);
        declareFunction("cyc_queryP", "CYC-QUERY?", 1, 0, false);
        declareFunction("cyc_syntactic_formula_arity_ok", "CYC-SYNTACTIC-FORMULA-ARITY-OK", 1, 0, false);
        declareFunction("cyc_syntactic_formula", "CYC-SYNTACTIC-FORMULA", 1, 0, false);
        declareFunction("function_expressionP", "FUNCTION-EXPRESSION?", 1, 0, false);
        declareFunction("cyc_relation_expressionP", "CYC-RELATION-EXPRESSION?", 1, 0, false);
        declareFunction("el_variableP", "EL-VARIABLE?", 1, 0, false);
        declareFunction("cyc_subl_expression", "CYC-SUBL-EXPRESSION", 1, 0, false);
        declareFunction("cyc_subl_escape", "CYC-SUBL-ESCAPE", 1, 0, false);
        declareFunction("cyc_subl_template", "CYC-SUBL-TEMPLATE", 1, 0, false);
        declareFunction("ibqeP", "IBQE?", 1, 1, false);
        declareFunction("cyc_ibqe", "CYC-IBQE", 1, 0, false);
        declareFunction("scalar_point_valueP", "SCALAR-POINT-VALUE?", 1, 1, false);
        declareFunction("scalar_integral_valueP", "SCALAR-INTEGRAL-VALUE?", 1, 1, false);
        declareFunction("non_negative_scalar_intervalP", "NON-NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
        declareFunction("positive_scalar_intervalP", "POSITIVE-SCALAR-INTERVAL?", 1, 1, false);
        declareFunction("negative_scalar_intervalP", "NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
        declareFunction("formula_p_function_isa_instance_of", "FORMULA-P-FUNCTION-ISA-INSTANCE-OF", 2, 1, false);
        declareFunction("unit_of_measureP", "UNIT-OF-MEASURE?", 1, 1, false);
        declareFunction("cyc_fractional_measurable_quantity_simple_p", "CYC-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P", 1, 0, false);
        declareFunction("cycl_fractional_measurable_quantity_simple_p", "CYCL-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P", 1, 1, false);
        declareFunction("simple_fractionP", "SIMPLE-FRACTION?", 1, 1, false);
        declareFunction("cyc_fractional_measurable_quantity_mixed_p", "CYC-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P", 1, 0, false);
        declareFunction("cycl_fractional_measurable_quantity_mixed_p", "CYCL-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P", 1, 1, false);
        declareFunction("mixed_fractionP", "MIXED-FRACTION?", 1, 1, false);
        declareFunction("negative_mixed_fractionP", "NEGATIVE-MIXED-FRACTION?", 1, 1, false);
        declareFunction("cyc_fractional_measurable_quantity_decimal_p", "CYC-FRACTIONAL-MEASURABLE-QUANTITY-DECIMAL-P", 1, 0, false);
        declareFunction("cycl_fractional_measurable_quantity_decimal_p", "CYCL-FRACTIONAL-MEASURABLE-QUANTITY-DECIMAL-P", 1, 1, false);
        declareFunction("decimal_fractionP", "DECIMAL-FRACTION?", 1, 1, false);
        declareFunction("fractionP", "FRACTION?", 1, 1, false);
        declareFunction("fraction_strong", "FRACTION-STRONG", 1, 1, false);
        declareFunction("term_setP", "TERM-SET?", 1, 0, false);
        declareFunction("cycl_var_listP", "CYCL-VAR-LIST?", 1, 0, false);
        declareFunction("cyc_el_var_listP", "CYC-EL-VAR-LIST?", 1, 0, false);
        declareFunction("cyc_system_atom", "CYC-SYSTEM-ATOM", 1, 0, false);
        declareFunction("cyc_list_of_lists", "CYC-LIST-OF-LISTS", 1, 0, false);
        new collection_defns.$cyc_list_of_lists$UnaryFunction();
        declareFunction("cyc_string_is_length", "CYC-STRING-IS-LENGTH", 1, 0, false);
        new collection_defns.$cyc_string_is_length$UnaryFunction();
        declareFunction("cyc_string_is_minimum_length", "CYC-STRING-IS-MINIMUM-LENGTH", 1, 0, false);
        new collection_defns.$cyc_string_is_minimum_length$UnaryFunction();
        declareFunction("cyc_string_is_maximum_length", "CYC-STRING-IS-MAXIMUM-LENGTH", 1, 0, false);
        new collection_defns.$cyc_string_is_maximum_length$UnaryFunction();
        declareFunction("cyc_list_is_length", "CYC-LIST-IS-LENGTH", 1, 0, false);
        declareFunction("cyc_list_is_length_internal", "CYC-LIST-IS-LENGTH-INTERNAL", 2, 0, false);
        declareFunction("rtp_syntactic_constraint", "RTP-SYNTACTIC-CONSTRAINT", 1, 0, false);
        declareFunction("cyc_subl_query_property_p", "CYC-SUBL-QUERY-PROPERTY-P", 1, 0, false);
        new collection_defns.$cyc_subl_query_property_p$UnaryFunction();
        declareFunction("cyc_subl_tv_p", "CYC-SUBL-TV-P", 1, 0, false);
        new collection_defns.$cyc_subl_tv_p$UnaryFunction();
        declareFunction("cyc_subl_hl_support_module_p", "CYC-SUBL-HL-SUPPORT-MODULE-P", 1, 0, false);
        new collection_defns.$cyc_subl_hl_support_module_p$UnaryFunction();
        declareFunction("cyc_subl_asserted_argument_token_p", "CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        declareFunction("cyc_subl_kct_metric_identifier_p", "CYC-SUBL-KCT-METRIC-IDENTIFIER-P", 1, 0, false);
        declareFunction("cyc_8_byte_integer", "CYC-8-BYTE-INTEGER", 1, 0, false);
        new collection_defns.$cyc_8_byte_integer$UnaryFunction();
        declareFunction("cyc_4_byte_integer", "CYC-4-BYTE-INTEGER", 1, 0, false);
        new collection_defns.$cyc_4_byte_integer$UnaryFunction();
        declareFunction("cyc_2_byte_integer", "CYC-2-BYTE-INTEGER", 1, 0, false);
        new collection_defns.$cyc_2_byte_integer$UnaryFunction();
        declareFunction("cyc_1_byte_integer", "CYC-1-BYTE-INTEGER", 1, 0, false);
        new collection_defns.$cyc_1_byte_integer$UnaryFunction();
        declareFunction("cyc_bit_datatype", "CYC-BIT-DATATYPE", 1, 0, false);
        new collection_defns.$cyc_bit_datatype$UnaryFunction();
        declareFunction("cyc_bit_string", "CYC-BIT-STRING", 1, 0, false);
        declareFunction("cyc_ip4_address", "CYC-IP4-ADDRESS", 1, 0, false);
        new collection_defns.$cyc_ip4_address$UnaryFunction();
        declareFunction("cyc_ip4_network_address", "CYC-IP4-NETWORK-ADDRESS", 1, 0, false);
        new collection_defns.$cyc_ip4_network_address$UnaryFunction();
        declareFunction("cyc_list_is_minimum_length", "CYC-LIST-IS-MINIMUM-LENGTH", 1, 0, false);
        new collection_defns.$cyc_list_is_minimum_length$UnaryFunction();
        declareFunction("cyc_list_is_minimum_length_internal", "CYC-LIST-IS-MINIMUM-LENGTH-INTERNAL", 2, 0, false);
        declareFunction("cyc_list_is_maximum_length", "CYC-LIST-IS-MAXIMUM-LENGTH", 1, 0, false);
        declareFunction("cyc_list_is_maximum_length_internal", "CYC-LIST-IS-MAXIMUM-LENGTH-INTERNAL", 2, 0, false);
        declareFunction("cyc_addition_expression", "CYC-ADDITION-EXPRESSION", 1, 0, false);
        declareFunction("cyc_subtraction_expression", "CYC-SUBTRACTION-EXPRESSION", 1, 0, false);
        declareFunction("cyc_multiplication_expression", "CYC-MULTIPLICATION-EXPRESSION", 1, 0, false);
        declareFunction("cyc_division_expression", "CYC-DIVISION-EXPRESSION", 1, 0, false);
        declareFunction("cyc_exponentiation_expression", "CYC-EXPONENTIATION-EXPRESSION", 1, 0, false);
        declareFunction("cyc_nth_root_expression", "CYC-NTH-ROOT-EXPRESSION", 1, 0, false);
        declareFunction("cyc_enclosed_math_expression", "CYC-ENCLOSED-MATH-EXPRESSION", 1, 0, false);
        declareFunction("cyc_univariate_linear_equation", "CYC-UNIVARIATE-LINEAR-EQUATION", 1, 0, false);
        declareFunction("test_math_expression_fn_collection_defns", "TEST-MATH-EXPRESSION-FN-COLLECTION-DEFNS", 2, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("STRINGP"), makeSymbol("INTEGERP"), makeSymbol("KEYWORDP"), makeSymbol("LISTP"), makeSymbol("SYMBOLP"), makeSymbol("TRUE"), makeSymbol("FALSE"));

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeSymbol("CYCL-CONSTANT-P"), makeSymbol("CYCL-VARIABLE-P"), makeSymbol("EL-VARIABLE-P"), makeSymbol("HL-VARIABLE-P"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("EL-RELATION-EXPRESSION?"), makeSymbol("GAF?"), makeSymbol("STRING-W/O-CONTROL-CHARS?"), makeSymbol("URL-P") });

    static private final SubLSymbol $sym3$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");

    static private final SubLSymbol $sym4$EL_EXPRESSION_ = makeSymbol("EL-EXPRESSION?");

    static private final SubLSymbol $sym6$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym7$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym8$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym9$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");

    static private final SubLSymbol $sym12$CYCL_REPRESENTED_TERM_ = makeSymbol("CYCL-REPRESENTED-TERM?");

    static private final SubLSymbol $sym22$CYCL_NON_ATOMIC_TERM_ = makeSymbol("CYCL-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym23$EL_NON_ATOMIC_TERM_ = makeSymbol("EL-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym25$CYCL_INDEXED_TERM_ = makeSymbol("CYCL-INDEXED-TERM?");

    static private final SubLSymbol $sym26$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym27$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym28$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym29$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");

    static private final SubLSymbol $sym30$EL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("EL-REIFIABLE-NON-ATOMIC-TERM?");

    static private final SubLSymbol $sym31$CYCL_CLOSED_EXPRESSION_ = makeSymbol("CYCL-CLOSED-EXPRESSION?");

    static private final SubLSymbol $sym32$CYCL_OPEN_EXPRESSION_ = makeSymbol("CYCL-OPEN-EXPRESSION?");

    static private final SubLSymbol $sym33$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");

    static private final SubLSymbol $sym34$CYCL_OPEN_FORMULA_ = makeSymbol("CYCL-OPEN-FORMULA?");

    static private final SubLSymbol $sym35$CYCL_CLOSED_FORMULA_ = makeSymbol("CYCL-CLOSED-FORMULA?");

    static private final SubLSymbol $sym38$CYCL_SENTENCE_ = makeSymbol("CYCL-SENTENCE?");

    static private final SubLSymbol $sym39$CYCL_OPEN_SENTENCE_ = makeSymbol("CYCL-OPEN-SENTENCE?");

    static private final SubLSymbol $sym40$CYCL_CLOSED_SENTENCE_ = makeSymbol("CYCL-CLOSED-SENTENCE?");

    static private final SubLSymbol $sym42$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_ = makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?");

    static private final SubLSymbol $sym43$EL_SENTENCE_ = makeSymbol("EL-SENTENCE?");

    static private final SubLSymbol $sym44$CYCL_ATOMIC_SENTENCE_ = makeSymbol("CYCL-ATOMIC-SENTENCE?");

    static private final SubLSymbol $sym45$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");

    static private final SubLSymbol $sym46$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");

    static private final SubLSymbol $sym47$CYCL_SENTENCE_ASKABLE_ = makeSymbol("CYCL-SENTENCE-ASKABLE?");

    static private final SubLSymbol $sym48$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");

    static private final SubLSymbol $sym49$EL_SENTENCE_ASKABLE_ = makeSymbol("EL-SENTENCE-ASKABLE?");

    static private final SubLSymbol $sym50$EL_SENTENCE_ASSERTIBLE_ = makeSymbol("EL-SENTENCE-ASSERTIBLE?");

    static private final SubLSymbol $sym51$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");

    static private final SubLSymbol $sym52$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");

    static private final SubLSymbol $sym53$EL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("EL-NON-ATOMIC-TERM-ASKABLE?");

    static private final SubLSymbol $sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("EL-NON-ATOMIC-TERM-ASSERTIBLE?");

    static private final SubLSymbol $sym55$CYCL_EXPRESSION_ASKABLE_ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");

    static private final SubLSymbol $sym56$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");

    static private final SubLSymbol $sym57$EL_EXPRESSION_ASKABLE_ = makeSymbol("EL-EXPRESSION-ASKABLE?");

    static private final SubLSymbol $sym58$EL_EXPRESSION_ASSERTIBLE_ = makeSymbol("EL-EXPRESSION-ASSERTIBLE?");

    static private final SubLSymbol $sym59$CYCL_QUERY_ = makeSymbol("CYCL-QUERY?");

    static private final SubLSymbol $sym60$CYCL_ASSERTION_ = makeSymbol("CYCL-ASSERTION?");

    static private final SubLSymbol $sym61$CYCL_ATOMIC_ASSERTION_ = makeSymbol("CYCL-ATOMIC-ASSERTION?");

    static private final SubLSymbol $sym62$CYCL_GAF_ASSERTION_ = makeSymbol("CYCL-GAF-ASSERTION?");

    static private final SubLSymbol $sym63$CYCL_RULE_ASSERTION_ = makeSymbol("CYCL-RULE-ASSERTION?");

    static private final SubLSymbol $sym64$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");

    static private final SubLSymbol $sym65$CYCL_DEDUCED_ASSERTION_ = makeSymbol("CYCL-DEDUCED-ASSERTION?");

    static private final SubLSymbol $sym66$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");

    static private final SubLSymbol $sym68$CYCL_CANONICALIZER_DIRECTIVE_ = makeSymbol("CYCL-CANONICALIZER-DIRECTIVE?");

    static private final SubLSymbol $sym70$CYCL_REFORMULATOR_DIRECTIVE_ = makeSymbol("CYCL-REFORMULATOR-DIRECTIVE?");

    static private final SubLSymbol $sym73$CYCL_REFORMULATOR_RULE_ = makeSymbol("CYCL-REFORMULATOR-RULE?");

    static private final SubLSymbol $sym75$CYCL_SIMPLIFIER_DIRECTIVE_ = makeSymbol("CYCL-SIMPLIFIER-DIRECTIVE?");

    static private final SubLSymbol $sym77$EL_ASSERTION_ = makeSymbol("EL-ASSERTION?");

    public static SubLObject init_collection_defns_file() {
        deflexical("*SUBL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*", $list0);
        deflexical("*CYCL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*", $list1);
        deflexical("*CACHED-RELATION-TYPE-ARITY-CACHING-STATE*", NIL);
        deflexical("*EXTENSIONAL-SET?-CACHING-STATE*", NIL);
        defconstant("*8BYTEINTEGER-LOWER-BOUND*", subtract(minus(expt(TWO_INTEGER, $int$63)), ONE_INTEGER));
        defconstant("*8BYTEINTEGER-UPPER-BOUND*", expt(TWO_INTEGER, $int$63));
        defconstant("*4BYTEINTEGER-LOWER-BOUND*", subtract(minus(expt(TWO_INTEGER, $int$31)), ONE_INTEGER));
        defconstant("*4BYTEINTEGER-UPPER-BOUND*", expt(TWO_INTEGER, $int$31));
        defconstant("*2BYTEINTEGER-LOWER-BOUND*", subtract(minus(expt(TWO_INTEGER, FIFTEEN_INTEGER)), ONE_INTEGER));
        defconstant("*2BYTEINTEGER-UPPER-BOUND*", expt(TWO_INTEGER, FIFTEEN_INTEGER));
        defconstant("*1BYTEINTEGER-LOWER-BOUND*", subtract(minus(expt(TWO_INTEGER, SEVEN_INTEGER)), ONE_INTEGER));
        defconstant("*1BYTEINTEGER-UPPER-BOUND*", expt(TWO_INTEGER, SEVEN_INTEGER));
        return NIL;
    }

    static private final SubLSymbol $sym97$CYC_PRIME_NUMBER_ = makeSymbol("CYC-PRIME-NUMBER?");

    static private final SubLSymbol $sym99$CYC_MAYBE_PRIME_NUMBER_ = makeSymbol("CYC-MAYBE-PRIME-NUMBER?");

    public static final SubLObject setup_collection_defns_file_alt() {
        {
            SubLObject cdolist_list_var = $subl_functions_used_as_collection_defns$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_kb_function(symbol);
            }
        }
        {
            SubLObject cdolist_list_var = $cycl_functions_used_as_collection_defns$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_kb_function(symbol);
            }
        }
        register_kb_function(CYC_INDIVIDUAL_NECESSARY);
        register_kb_function($sym3$CYCL_EXPRESSION_);
        register_kb_function($sym4$EL_EXPRESSION_);
        register_kb_function(HL_EXPRESSION_P);
        register_kb_function($sym6$CYCL_OPEN_DENOTATIONAL_TERM_);
        register_kb_function($sym7$CYCL_CLOSED_DENOTATIONAL_TERM_);
        register_kb_function($sym8$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
        register_kb_function($sym9$CYCL_REIFIED_DENOTATIONAL_TERM_);
        register_kb_function(HL_CLOSED_DENOTATIONAL_TERM_P);
        register_kb_function(CYCL_REPRESENTED_ATOMIC_TERM_P);
        register_kb_function($sym12$CYCL_REPRESENTED_TERM_);
        register_kb_function(CYC_SYSTEM_TERM_P);
        register_kb_function(CYC_SYSTEM_CHARACTER_P);
        register_kb_function(CYC_SYSTEM_STRING_P);
        register_kb_function(CYC_SYSTEM_REAL_NUMBER_P);
        register_kb_function(CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
        register_kb_function(CYCL_SUBL_SYMBOL_P);
        register_kb_function(CYCL_ATOMIC_TERM_P);
        register_kb_function(CYCL_CLOSED_ATOMIC_TERM_P);
        register_kb_function(HL_NON_ATOMIC_TERM_P);
        register_kb_function($sym22$CYCL_NON_ATOMIC_TERM_);
        register_kb_function($sym23$EL_NON_ATOMIC_TERM_);
        register_kb_function(HL_INDEXED_TERM_P);
        register_kb_function($sym25$CYCL_INDEXED_TERM_);
        register_kb_function($sym26$CYCL_OPEN_NON_ATOMIC_TERM_);
        register_kb_function($sym27$CYCL_CLOSED_NON_ATOMIC_TERM_);
        register_kb_function($sym28$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
        register_kb_function($sym29$CYCL_NON_ATOMIC_REIFIED_TERM_);
        register_kb_function($sym30$EL_REIFIABLE_NON_ATOMIC_TERM_);
        register_kb_function($sym31$CYCL_CLOSED_EXPRESSION_);
        register_kb_function($sym32$CYCL_OPEN_EXPRESSION_);
        register_kb_function($sym33$CYCL_FORMULA_);
        register_kb_function($sym34$CYCL_OPEN_FORMULA_);
        register_kb_function($sym35$CYCL_CLOSED_FORMULA_);
        register_kb_function(HL_FORMULA_P);
        register_kb_function(CYCL_UNBOUND_RELATION_FORMULA_P);
        register_kb_function($sym38$CYCL_SENTENCE_);
        register_kb_function($sym39$CYCL_OPEN_SENTENCE_);
        register_kb_function($sym40$CYCL_CLOSED_SENTENCE_);
        register_kb_function($sym42$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
        register_kb_function($sym43$EL_SENTENCE_);
        register_kb_function($sym44$CYCL_ATOMIC_SENTENCE_);
        register_kb_function($sym45$CYCL_CLOSED_ATOMIC_SENTENCE_);
        register_kb_function($sym46$CYCL_PROPOSITIONAL_SENTENCE_);
        register_kb_function($sym47$CYCL_SENTENCE_ASKABLE_);
        register_kb_function($sym48$CYCL_SENTENCE_ASSERTIBLE_);
        register_kb_function($sym49$EL_SENTENCE_ASKABLE_);
        register_kb_function($sym50$EL_SENTENCE_ASSERTIBLE_);
        register_kb_function($sym51$CYCL_NON_ATOMIC_TERM_ASKABLE_);
        register_kb_function($sym52$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
        register_kb_function($sym53$EL_NON_ATOMIC_TERM_ASKABLE_);
        register_kb_function($sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_);
        register_kb_function($sym55$CYCL_EXPRESSION_ASKABLE_);
        register_kb_function($sym56$CYCL_EXPRESSION_ASSERTIBLE_);
        register_kb_function($sym57$EL_EXPRESSION_ASKABLE_);
        register_kb_function($sym58$EL_EXPRESSION_ASSERTIBLE_);
        register_kb_function($sym59$CYCL_QUERY_);
        register_kb_function($sym60$CYCL_ASSERTION_);
        register_kb_function($sym61$CYCL_ATOMIC_ASSERTION_);
        register_kb_function($sym62$CYCL_GAF_ASSERTION_);
        register_kb_function($sym63$CYCL_RULE_ASSERTION_);
        register_kb_function($sym64$CYCL_ASSERTED_ASSERTION_);
        register_kb_function($sym65$CYCL_DEDUCED_ASSERTION_);
        register_kb_function($sym66$CYCL_NL_SEMANTIC_ASSERTION_);
        register_kb_function($sym68$CYCL_CANONICALIZER_DIRECTIVE_);
        register_kb_function($sym70$CYCL_REFORMULATOR_DIRECTIVE_);
        register_kb_function($sym73$CYCL_REFORMULATOR_RULE_);
        register_kb_function($sym75$CYCL_SIMPLIFIER_DIRECTIVE_);
        register_kb_function(HL_ASSERTION_P);
        register_kb_function($sym77$EL_ASSERTION_);
        register_kb_function(CYC_GROUND_TERM);
        register_kb_function(CYC_REAL_NUMBER);
        register_kb_function(CYC_SYSTEM_REAL_NUMBER);
        register_kb_function(CYC_POSITIVE_NUMBER);
        register_kb_function(CYC_NEGATIVE_NUMBER);
        register_kb_function(CYC_NON_POSITIVE_NUMBER);
        register_kb_function(CYC_NON_NEGATIVE_NUMBER);
        register_kb_function(CYC_RATIONAL_NUMBER);
        register_kb_function(CYC_REAL_0_100);
        register_kb_function(CYC_REAL_0_1);
        register_kb_function(CYC_REAL_MINUS_1_TO_PLUS_1);
        register_kb_function(CYC_REAL_1_INFINITY);
        register_kb_function(CYC_NONZERO_NUMBER);
        register_kb_function(CYC_INTEGER);
        register_kb_function(CYC_SYSTEM_INTEGER);
        register_kb_function(CYC_POSITIVE_INTEGER);
        register_kb_function($sym97$CYC_PRIME_NUMBER_);
        register_kb_function($sym99$CYC_MAYBE_PRIME_NUMBER_);
        register_kb_function(CYC_NEGATIVE_INTEGER);
        register_kb_function(CYC_NON_POSITIVE_INTEGER);
        register_kb_function(CYC_NON_NEGATIVE_INTEGER);
        register_kb_function(CYC_EVEN_NUMBER);
        register_kb_function(CYC_ODD_NUMBER);
        register_kb_function(CYC_UNIVERSAL_DATE);
        register_kb_function(CYC_UNIVERSAL_SECOND);
        if (CYC_SET_OF_TYPE_NECESSARY.isSymbol()) {
            {
                SubLObject item_var = CYC_SET_OF_TYPE_NECESSARY;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_SET_OF_TYPE_NECESSARY);
        if (CYC_SET_OF_TYPE_SUFFICIENT.isSymbol()) {
            {
                SubLObject item_var = CYC_SET_OF_TYPE_SUFFICIENT;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_SET_OF_TYPE_SUFFICIENT);
        if (CYC_LIST_OF_TYPE_NECESSARY.isSymbol()) {
            {
                SubLObject item_var = CYC_LIST_OF_TYPE_NECESSARY;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_LIST_OF_TYPE_NECESSARY);
        if (CYC_LIST_OF_TYPE_SUFFICIENT.isSymbol()) {
            {
                SubLObject item_var = CYC_LIST_OF_TYPE_SUFFICIENT;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_LIST_OF_TYPE_SUFFICIENT);
        note_globally_cached_function($sym113$EXTENSIONAL_SET_);
        register_kb_function(CYC_LIST_WITHOUT_REPETITION);
        register_kb_function(CYC_NUMERIC_STRING_NECESSARY);
        register_kb_function(CYC_NUMERAL_STRING);
        register_kb_function(CYC_NUMERIC_STRING);
        register_kb_function(CYC_NUMBER_STRING);
        register_kb_function(CYC_ZIP_CODE_FIVE_DIGIT);
        register_kb_function(CYC_ZIP_CODE_NINE_DIGIT);
        register_kb_function(CYC_GUID_STRING_P);
        register_kb_function(CYC_UNICODE_DENOTING_ASCII_STRING_P);
        register_kb_function(CYC_ASCII_STRING_P);
        register_kb_function(CYC_URL);
        register_kb_function($sym135$DOCTOR_ME_ID_);
        register_kb_function($sym136$CLPE_);
        register_kb_function($sym137$CYC_QUERY_);
        register_kb_function(CYC_SYNTACTIC_FORMULA_ARITY_OK);
        register_kb_function(CYC_SYNTACTIC_FORMULA);
        register_kb_function($sym140$FUNCTION_EXPRESSION_);
        register_kb_function($sym141$CYC_RELATION_EXPRESSION_);
        register_kb_function($sym142$EL_VARIABLE_);
        register_kb_function(CYC_SUBL_EXPRESSION);
        register_kb_function(CYC_SUBL_ESCAPE);
        register_kb_function(CYC_SUBL_TEMPLATE);
        register_kb_function($sym146$IBQE_);
        register_kb_function($sym147$SCALAR_POINT_VALUE_);
        register_kb_function($sym148$NON_NEGATIVE_SCALAR_INTERVAL_);
        register_kb_function($sym149$POSITIVE_SCALAR_INTERVAL_);
        register_kb_function($sym151$TERM_SET_);
        register_kb_function($sym152$CYCL_VAR_LIST_);
        register_kb_function($sym153$CYC_EL_VAR_LIST_);
        register_kb_function(CYC_SYSTEM_ATOM);
        register_kb_function(CYC_LIST_OF_LISTS);
        if (CYC_STRING_IS_LENGTH.isSymbol()) {
            {
                SubLObject item_var = CYC_STRING_IS_LENGTH;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_STRING_IS_LENGTH);
        if (CYC_STRING_IS_MINIMUM_LENGTH.isSymbol()) {
            {
                SubLObject item_var = CYC_STRING_IS_MINIMUM_LENGTH;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_STRING_IS_MINIMUM_LENGTH);
        if (CYC_STRING_IS_MAXIMUM_LENGTH.isSymbol()) {
            {
                SubLObject item_var = CYC_STRING_IS_MAXIMUM_LENGTH;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_STRING_IS_MAXIMUM_LENGTH);
        if (CYC_LIST_IS_LENGTH.isSymbol()) {
            {
                SubLObject item_var = CYC_LIST_IS_LENGTH;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_LIST_IS_LENGTH);
        register_kb_function(RTP_SYNTACTIC_CONSTRAINT);
        register_kb_function(CYC_SUBL_QUERY_PROPERTY_P);
        register_kb_function(CYC_SUBL_TV_P);
        register_kb_function(CYC_SUBL_HL_SUPPORT_MODULE_P);
        register_kb_function(CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P);
        register_kb_function(CYC_SUBL_KCT_METRIC_IDENTIFIER_P);
        register_kb_function(CYC_8_BYTE_INTEGER);
        register_kb_function(CYC_4_BYTE_INTEGER);
        register_kb_function(CYC_2_BYTE_INTEGER);
        register_kb_function(CYC_1_BYTE_INTEGER);
        register_kb_function(CYC_BIT_STRING);
        register_kb_function(CYC_IP4_ADDRESS);
        register_kb_function(CYC_IP4_NETWORK_ADDRESS);
        if (CYC_LIST_IS_MINIMUM_LENGTH.isSymbol()) {
            {
                SubLObject item_var = CYC_LIST_IS_MINIMUM_LENGTH;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_LIST_IS_MINIMUM_LENGTH);
        if (CYC_LIST_IS_MAXIMUM_LENGTH.isSymbol()) {
            {
                SubLObject item_var = CYC_LIST_IS_MAXIMUM_LENGTH;
                if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_LIST_IS_MAXIMUM_LENGTH);
        define_test_case_table_int($sym53$EL_NON_ATOMIC_TERM_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt194);
        define_test_case_table_int($sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt195);
        define_test_case_table_int($sym57$EL_EXPRESSION_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt196);
        define_test_case_table_int($sym58$EL_EXPRESSION_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt197);
        define_test_case_table_int(CYC_IP4_NETWORK_ADDRESS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt200);
        return NIL;
    }

    public static SubLObject setup_collection_defns_file() {
        if (SubLFiles.USE_V1) {
            SubLObject cdolist_list_var = $subl_functions_used_as_collection_defns$.getGlobalValue();
            SubLObject symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_kb_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            cdolist_list_var = $cycl_functions_used_as_collection_defns$.getGlobalValue();
            symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_kb_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            register_kb_function(CYC_INDIVIDUAL_NECESSARY);
            register_kb_function(CYC_KAPPA_PREDICATE_BY_ARITY);
            memoization_state.note_globally_cached_function(CACHED_RELATION_TYPE_ARITY);
            register_kb_function($sym11$CYCL_EXPRESSION_);
            register_kb_function($sym12$EL_EXPRESSION_);
            register_kb_function(HL_EXPRESSION_P);
            register_kb_function($sym14$CYCL_OPEN_DENOTATIONAL_TERM_);
            register_kb_function($sym15$CYCL_CLOSED_DENOTATIONAL_TERM_);
            register_kb_function($sym16$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
            register_kb_function($sym17$CYCL_REIFIED_DENOTATIONAL_TERM_);
            register_kb_function(HL_CLOSED_DENOTATIONAL_TERM_P);
            register_kb_function(CYCL_REPRESENTED_ATOMIC_TERM_P);
            register_kb_function($sym20$CYCL_REPRESENTED_TERM_);
            register_kb_function(CYC_SYSTEM_TERM_P);
            register_kb_function(CYC_SYSTEM_CHARACTER_P);
            register_kb_function(CYC_SYSTEM_STRING_P);
            register_kb_function(CYC_SYSTEM_REAL_NUMBER_P);
            register_kb_function(CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
            register_kb_function(CYCL_SUBL_SYMBOL_P);
            register_kb_function(CYCL_ATOMIC_TERM_P);
            register_kb_function(CYCL_CLOSED_ATOMIC_TERM_P);
            register_kb_function(HL_NON_ATOMIC_TERM_P);
            register_kb_function($sym30$CYCL_NON_ATOMIC_TERM_);
            register_kb_function($sym31$EL_NON_ATOMIC_TERM_);
            register_kb_function(HL_INDEXED_TERM_P);
            register_kb_function($sym33$CYCL_INDEXED_TERM_);
            register_kb_function($sym34$CYCL_OPEN_NON_ATOMIC_TERM_);
            register_kb_function($sym35$CYCL_CLOSED_NON_ATOMIC_TERM_);
            register_kb_function($sym36$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
            register_kb_function($sym37$CYCL_NON_ATOMIC_REIFIED_TERM_);
            register_kb_function($sym38$EL_REIFIABLE_NON_ATOMIC_TERM_);
            register_kb_function($sym39$CYCL_CLOSED_EXPRESSION_);
            register_kb_function($sym40$CYCL_OPEN_EXPRESSION_);
            register_kb_function($sym41$CYCL_FORMULA_);
            register_kb_function($sym42$CYCL_OPEN_FORMULA_);
            register_kb_function($sym43$CYCL_CLOSED_FORMULA_);
            register_kb_function(HL_FORMULA_P);
            register_kb_function(CYCL_UNBOUND_RELATION_FORMULA_P);
            register_kb_function($sym46$CYCL_SENTENCE_);
            register_kb_function($sym47$CYCL_OPEN_SENTENCE_);
            register_kb_function($sym48$CYCL_CLOSED_SENTENCE_);
            register_kb_function($sym50$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
            register_kb_function($sym51$EL_SENTENCE_);
            register_kb_function($sym52$CYCL_ATOMIC_SENTENCE_);
            register_kb_function($sym53$CYCL_CLOSED_ATOMIC_SENTENCE_);
            register_kb_function($sym54$CYCL_PROPOSITIONAL_SENTENCE_);
            register_kb_function($sym55$CYCL_SENTENCE_ASKABLE_);
            register_kb_function($sym56$CYCL_SENTENCE_ASSERTIBLE_);
            register_kb_function($sym57$EL_SENTENCE_ASKABLE_);
            register_kb_function($sym58$EL_SENTENCE_ASSERTIBLE_);
            register_kb_function($sym59$CYCL_NON_ATOMIC_TERM_ASKABLE_);
            register_kb_function($sym60$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
            register_kb_function($sym61$EL_NON_ATOMIC_TERM_ASKABLE_);
            register_kb_function($sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_);
            register_kb_function($sym63$CYCL_EXPRESSION_ASKABLE_);
            register_kb_function($sym64$CYCL_EXPRESSION_ASSERTIBLE_);
            register_kb_function($sym65$EL_EXPRESSION_ASKABLE_);
            register_kb_function($sym66$EL_EXPRESSION_ASSERTIBLE_);
            register_kb_function($sym67$CYCL_QUERY_);
            register_kb_function($sym68$CYCL_ASSERTION_);
            register_kb_function($sym69$CYCL_ATOMIC_ASSERTION_);
            register_kb_function($sym70$CYCL_GAF_ASSERTION_);
            register_kb_function($sym71$CYCL_RULE_ASSERTION_);
            register_kb_function($sym72$CYCL_ASSERTED_ASSERTION_);
            register_kb_function($sym73$CYCL_DEDUCED_ASSERTION_);
            register_kb_function($sym74$CYCL_NL_SEMANTIC_ASSERTION_);
            register_kb_function($sym76$CYCL_CANONICALIZER_DIRECTIVE_);
            register_kb_function($sym78$CYCL_REFORMULATOR_DIRECTIVE_);
            register_kb_function($sym81$CYCL_REFORMULATOR_RULE_);
            register_kb_function($sym83$CYCL_SIMPLIFIER_DIRECTIVE_);
            register_kb_function(HL_ASSERTION_P);
            register_kb_function($sym85$EL_ASSERTION_);
            register_kb_function(CYC_GROUND_TERM);
            register_kb_function(CYC_REAL_NUMBER);
            register_kb_function(CYC_SYSTEM_REAL_NUMBER);
            register_kb_function(CYC_POSITIVE_NUMBER);
            register_kb_function(CYC_NEGATIVE_NUMBER);
            register_kb_function(CYC_NON_POSITIVE_NUMBER);
            register_kb_function(CYC_NON_NEGATIVE_NUMBER);
            register_kb_function(CYC_RATIONAL_NUMBER);
            register_kb_function(CYC_REAL_0_100);
            register_kb_function(CYC_REAL_0_1);
            register_kb_function(CYC_REAL_MINUS_1_TO_PLUS_1);
            register_kb_function(CYC_REAL_1_INFINITY);
            register_kb_function(CYC_NONZERO_NUMBER);
            register_kb_function(CYC_SYSTEM_FLOAT);
            register_kb_function(CYC_INTEGER);
            register_kb_function(CYC_SYSTEM_INTEGER);
            register_kb_function(CYC_POSITIVE_INTEGER);
            register_kb_function($sym106$CYC_PRIME_NUMBER_);
            register_kb_function($sym108$CYC_MAYBE_PRIME_NUMBER_);
            register_kb_function(CYC_NEGATIVE_INTEGER);
            register_kb_function(CYC_NON_POSITIVE_INTEGER);
            register_kb_function(CYC_NON_NEGATIVE_INTEGER);
            register_kb_function(CYC_EVEN_NUMBER);
            register_kb_function(CYC_ODD_NUMBER);
            register_kb_function(CYC_UNIVERSAL_DATE);
            register_kb_function(CYC_UNIVERSAL_SECOND);
            if (CYC_SET_OF_TYPE_NECESSARY.isSymbol()) {
                final SubLObject item_var = CYC_SET_OF_TYPE_NECESSARY;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_SET_OF_TYPE_NECESSARY);
            if (CYC_SET_OF_TYPE_SUFFICIENT.isSymbol()) {
                final SubLObject item_var = CYC_SET_OF_TYPE_SUFFICIENT;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_SET_OF_TYPE_SUFFICIENT);
            if (CYC_LIST_OF_TYPE_NECESSARY.isSymbol()) {
                final SubLObject item_var = CYC_LIST_OF_TYPE_NECESSARY;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_LIST_OF_TYPE_NECESSARY);
            if (CYC_LIST_OF_TYPE_SUFFICIENT.isSymbol()) {
                final SubLObject item_var = CYC_LIST_OF_TYPE_SUFFICIENT;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_LIST_OF_TYPE_SUFFICIENT);
            memoization_state.note_globally_cached_function($sym122$EXTENSIONAL_SET_);
            register_kb_function(CYC_LIST_WITHOUT_REPETITION);
            register_kb_function(CYC_NUMERIC_STRING_NECESSARY);
            register_kb_function(CYC_NUMERAL_STRING);
            register_kb_function(CYC_NUMERIC_STRING);
            register_kb_function(CYC_NUMBER_STRING);
            register_kb_function(CYC_ZIP_CODE_FIVE_DIGIT);
            register_kb_function(CYC_ZIP_CODE_NINE_DIGIT);
            register_kb_function(CYC_GUID_STRING_P);
            register_kb_function(CYC_NAICS_CODE);
            register_kb_function(CYC_UNICODE_DENOTING_ASCII_STRING_P);
            register_kb_function(CYC_ASCII_STRING_P);
            register_kb_function(CYC_CONTROL_CHARACTER_FREE_STRING_NECESSARY);
            register_kb_function(CYC_URL);
            register_kb_function($sym145$DOCTOR_ME_ID_);
            register_kb_function($sym146$CLPE_);
            register_kb_function($sym147$CYC_QUERY_);
            register_kb_function(CYC_SYNTACTIC_FORMULA_ARITY_OK);
            register_kb_function(CYC_SYNTACTIC_FORMULA);
            register_kb_function($sym150$FUNCTION_EXPRESSION_);
            register_kb_function($sym151$CYC_RELATION_EXPRESSION_);
            register_kb_function($sym152$EL_VARIABLE_);
            register_kb_function(CYC_SUBL_EXPRESSION);
            register_kb_function(CYC_SUBL_ESCAPE);
            register_kb_function(CYC_SUBL_TEMPLATE);
            register_kb_function($sym156$IBQE_);
            register_kb_function($sym157$SCALAR_POINT_VALUE_);
            register_kb_function($sym159$SCALAR_INTEGRAL_VALUE_);
            register_kb_function($sym160$NON_NEGATIVE_SCALAR_INTERVAL_);
            register_kb_function($sym161$POSITIVE_SCALAR_INTERVAL_);
            register_kb_function($sym162$NEGATIVE_SCALAR_INTERVAL_);
            register_kb_function(CYC_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P);
            register_kb_function(CYC_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P);
            register_kb_function(CYC_FRACTIONAL_MEASURABLE_QUANTITY_DECIMAL_P);
            define_test_case_table_int(CYCL_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list178);
            define_test_case_table_int(CYCL_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list180);
            register_kb_function($sym181$TERM_SET_);
            register_kb_function($sym182$CYCL_VAR_LIST_);
            register_kb_function($sym183$CYC_EL_VAR_LIST_);
            register_kb_function(CYC_SYSTEM_ATOM);
            register_kb_function(CYC_LIST_OF_LISTS);
            if (CYC_STRING_IS_LENGTH.isSymbol()) {
                final SubLObject item_var = CYC_STRING_IS_LENGTH;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_STRING_IS_LENGTH);
            if (CYC_STRING_IS_MINIMUM_LENGTH.isSymbol()) {
                final SubLObject item_var = CYC_STRING_IS_MINIMUM_LENGTH;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_STRING_IS_MINIMUM_LENGTH);
            if (CYC_STRING_IS_MAXIMUM_LENGTH.isSymbol()) {
                final SubLObject item_var = CYC_STRING_IS_MAXIMUM_LENGTH;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_STRING_IS_MAXIMUM_LENGTH);
            if (CYC_LIST_IS_LENGTH.isSymbol()) {
                final SubLObject item_var = CYC_LIST_IS_LENGTH;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_LIST_IS_LENGTH);
            register_kb_function(RTP_SYNTACTIC_CONSTRAINT);
            register_kb_function(CYC_SUBL_QUERY_PROPERTY_P);
            register_kb_function(CYC_SUBL_TV_P);
            register_kb_function(CYC_SUBL_HL_SUPPORT_MODULE_P);
            register_kb_function(CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P);
            register_kb_function(CYC_SUBL_KCT_METRIC_IDENTIFIER_P);
            register_kb_function(CYC_8_BYTE_INTEGER);
            register_kb_function(CYC_4_BYTE_INTEGER);
            register_kb_function(CYC_2_BYTE_INTEGER);
            register_kb_function(CYC_1_BYTE_INTEGER);
            register_kb_function(CYC_BIT_STRING);
            register_kb_function(CYC_IP4_ADDRESS);
            register_kb_function(CYC_IP4_NETWORK_ADDRESS);
            if (CYC_LIST_IS_MINIMUM_LENGTH.isSymbol()) {
                final SubLObject item_var = CYC_LIST_IS_MINIMUM_LENGTH;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_LIST_IS_MINIMUM_LENGTH);
            if (CYC_LIST_IS_MAXIMUM_LENGTH.isSymbol()) {
                final SubLObject item_var = CYC_LIST_IS_MAXIMUM_LENGTH;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_LIST_IS_MAXIMUM_LENGTH);
            register_kb_function(CYC_ADDITION_EXPRESSION);
            register_kb_function(CYC_SUBTRACTION_EXPRESSION);
            register_kb_function(CYC_MULTIPLICATION_EXPRESSION);
            register_kb_function(CYC_DIVISION_EXPRESSION);
            register_kb_function(CYC_EXPONENTIATION_EXPRESSION);
            register_kb_function(CYC_NTH_ROOT_EXPRESSION);
            register_kb_function(CYC_ENCLOSED_MATH_EXPRESSION);
            register_kb_function(CYC_UNIVARIATE_LINEAR_EQUATION);
            define_test_case_table_int(TEST_MATH_EXPRESSION_FN_COLLECTION_DEFNS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list227, $KB, $FULL, $WORKING_, T }), $list228);
            define_test_case_table_int($sym61$EL_NON_ATOMIC_TERM_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list229);
            define_test_case_table_int($sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list230);
            define_test_case_table_int($sym65$EL_EXPRESSION_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list231);
            define_test_case_table_int($sym66$EL_EXPRESSION_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list232);
            define_test_case_table_int(CYC_IP4_NETWORK_ADDRESS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list234);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject cdolist_list_var = $subl_functions_used_as_collection_defns$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_kb_function(symbol);
                }
            }
            {
                SubLObject cdolist_list_var = $cycl_functions_used_as_collection_defns$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_kb_function(symbol);
                }
            }
            register_kb_function($sym3$CYCL_EXPRESSION_);
            register_kb_function($sym4$EL_EXPRESSION_);
            register_kb_function($sym6$CYCL_OPEN_DENOTATIONAL_TERM_);
            register_kb_function($sym7$CYCL_CLOSED_DENOTATIONAL_TERM_);
            register_kb_function($sym8$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
            register_kb_function($sym9$CYCL_REIFIED_DENOTATIONAL_TERM_);
            register_kb_function($sym12$CYCL_REPRESENTED_TERM_);
            register_kb_function($sym22$CYCL_NON_ATOMIC_TERM_);
            register_kb_function($sym23$EL_NON_ATOMIC_TERM_);
            register_kb_function($sym25$CYCL_INDEXED_TERM_);
            register_kb_function($sym26$CYCL_OPEN_NON_ATOMIC_TERM_);
            register_kb_function($sym27$CYCL_CLOSED_NON_ATOMIC_TERM_);
            register_kb_function($sym28$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
            register_kb_function($sym29$CYCL_NON_ATOMIC_REIFIED_TERM_);
            register_kb_function($sym30$EL_REIFIABLE_NON_ATOMIC_TERM_);
            register_kb_function($sym31$CYCL_CLOSED_EXPRESSION_);
            register_kb_function($sym32$CYCL_OPEN_EXPRESSION_);
            register_kb_function($sym33$CYCL_FORMULA_);
            register_kb_function($sym34$CYCL_OPEN_FORMULA_);
            register_kb_function($sym35$CYCL_CLOSED_FORMULA_);
            register_kb_function($sym38$CYCL_SENTENCE_);
            register_kb_function($sym39$CYCL_OPEN_SENTENCE_);
            register_kb_function($sym40$CYCL_CLOSED_SENTENCE_);
            register_kb_function($sym42$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
            register_kb_function($sym43$EL_SENTENCE_);
            register_kb_function($sym44$CYCL_ATOMIC_SENTENCE_);
            register_kb_function($sym45$CYCL_CLOSED_ATOMIC_SENTENCE_);
            register_kb_function($sym46$CYCL_PROPOSITIONAL_SENTENCE_);
            register_kb_function($sym47$CYCL_SENTENCE_ASKABLE_);
            register_kb_function($sym48$CYCL_SENTENCE_ASSERTIBLE_);
            register_kb_function($sym49$EL_SENTENCE_ASKABLE_);
            register_kb_function($sym50$EL_SENTENCE_ASSERTIBLE_);
            register_kb_function($sym51$CYCL_NON_ATOMIC_TERM_ASKABLE_);
            register_kb_function($sym52$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
            register_kb_function($sym53$EL_NON_ATOMIC_TERM_ASKABLE_);
            register_kb_function($sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_);
            register_kb_function($sym55$CYCL_EXPRESSION_ASKABLE_);
            register_kb_function($sym56$CYCL_EXPRESSION_ASSERTIBLE_);
            register_kb_function($sym57$EL_EXPRESSION_ASKABLE_);
            register_kb_function($sym58$EL_EXPRESSION_ASSERTIBLE_);
            register_kb_function($sym59$CYCL_QUERY_);
            register_kb_function($sym60$CYCL_ASSERTION_);
            register_kb_function($sym61$CYCL_ATOMIC_ASSERTION_);
            register_kb_function($sym62$CYCL_GAF_ASSERTION_);
            register_kb_function($sym63$CYCL_RULE_ASSERTION_);
            register_kb_function($sym64$CYCL_ASSERTED_ASSERTION_);
            register_kb_function($sym65$CYCL_DEDUCED_ASSERTION_);
            register_kb_function($sym66$CYCL_NL_SEMANTIC_ASSERTION_);
            register_kb_function($sym68$CYCL_CANONICALIZER_DIRECTIVE_);
            register_kb_function($sym70$CYCL_REFORMULATOR_DIRECTIVE_);
            register_kb_function($sym73$CYCL_REFORMULATOR_RULE_);
            register_kb_function($sym75$CYCL_SIMPLIFIER_DIRECTIVE_);
            register_kb_function($sym77$EL_ASSERTION_);
            register_kb_function($sym97$CYC_PRIME_NUMBER_);
            register_kb_function($sym99$CYC_MAYBE_PRIME_NUMBER_);
            if (CYC_SET_OF_TYPE_NECESSARY.isSymbol()) {
                {
                    SubLObject item_var = CYC_SET_OF_TYPE_NECESSARY;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_SET_OF_TYPE_SUFFICIENT.isSymbol()) {
                {
                    SubLObject item_var = CYC_SET_OF_TYPE_SUFFICIENT;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_LIST_OF_TYPE_NECESSARY.isSymbol()) {
                {
                    SubLObject item_var = CYC_LIST_OF_TYPE_NECESSARY;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_LIST_OF_TYPE_SUFFICIENT.isSymbol()) {
                {
                    SubLObject item_var = CYC_LIST_OF_TYPE_SUFFICIENT;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            note_globally_cached_function($sym113$EXTENSIONAL_SET_);
            register_kb_function($sym135$DOCTOR_ME_ID_);
            register_kb_function($sym136$CLPE_);
            register_kb_function($sym137$CYC_QUERY_);
            register_kb_function($sym140$FUNCTION_EXPRESSION_);
            register_kb_function($sym141$CYC_RELATION_EXPRESSION_);
            register_kb_function($sym142$EL_VARIABLE_);
            register_kb_function($sym146$IBQE_);
            register_kb_function($sym147$SCALAR_POINT_VALUE_);
            register_kb_function($sym148$NON_NEGATIVE_SCALAR_INTERVAL_);
            register_kb_function($sym149$POSITIVE_SCALAR_INTERVAL_);
            register_kb_function($sym151$TERM_SET_);
            register_kb_function($sym152$CYCL_VAR_LIST_);
            register_kb_function($sym153$CYC_EL_VAR_LIST_);
            if (CYC_STRING_IS_LENGTH.isSymbol()) {
                {
                    SubLObject item_var = CYC_STRING_IS_LENGTH;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_STRING_IS_MINIMUM_LENGTH.isSymbol()) {
                {
                    SubLObject item_var = CYC_STRING_IS_MINIMUM_LENGTH;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_STRING_IS_MAXIMUM_LENGTH.isSymbol()) {
                {
                    SubLObject item_var = CYC_STRING_IS_MAXIMUM_LENGTH;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_LIST_IS_LENGTH.isSymbol()) {
                {
                    SubLObject item_var = CYC_LIST_IS_LENGTH;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_LIST_IS_MINIMUM_LENGTH.isSymbol()) {
                {
                    SubLObject item_var = CYC_LIST_IS_MINIMUM_LENGTH;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            if (CYC_LIST_IS_MAXIMUM_LENGTH.isSymbol()) {
                {
                    SubLObject item_var = CYC_LIST_IS_MAXIMUM_LENGTH;
                    if (NIL == member(item_var, $at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $at_collection_specific_defns$.setDynamicValue(cons(item_var, $at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
            define_test_case_table_int($sym53$EL_NON_ATOMIC_TERM_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt194);
            define_test_case_table_int($sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt195);
            define_test_case_table_int($sym57$EL_EXPRESSION_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt196);
            define_test_case_table_int($sym58$EL_EXPRESSION_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt197);
            define_test_case_table_int(CYC_IP4_NETWORK_ADDRESS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt200);
        }
        return NIL;
    }

    public static SubLObject setup_collection_defns_file_Previous() {
        SubLObject cdolist_list_var = $subl_functions_used_as_collection_defns$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        cdolist_list_var = $cycl_functions_used_as_collection_defns$.getGlobalValue();
        symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        register_kb_function(CYC_INDIVIDUAL_NECESSARY);
        register_kb_function(CYC_KAPPA_PREDICATE_BY_ARITY);
        memoization_state.note_globally_cached_function(CACHED_RELATION_TYPE_ARITY);
        register_kb_function($sym11$CYCL_EXPRESSION_);
        register_kb_function($sym12$EL_EXPRESSION_);
        register_kb_function(HL_EXPRESSION_P);
        register_kb_function($sym14$CYCL_OPEN_DENOTATIONAL_TERM_);
        register_kb_function($sym15$CYCL_CLOSED_DENOTATIONAL_TERM_);
        register_kb_function($sym16$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
        register_kb_function($sym17$CYCL_REIFIED_DENOTATIONAL_TERM_);
        register_kb_function(HL_CLOSED_DENOTATIONAL_TERM_P);
        register_kb_function(CYCL_REPRESENTED_ATOMIC_TERM_P);
        register_kb_function($sym20$CYCL_REPRESENTED_TERM_);
        register_kb_function(CYC_SYSTEM_TERM_P);
        register_kb_function(CYC_SYSTEM_CHARACTER_P);
        register_kb_function(CYC_SYSTEM_STRING_P);
        register_kb_function(CYC_SYSTEM_REAL_NUMBER_P);
        register_kb_function(CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
        register_kb_function(CYCL_SUBL_SYMBOL_P);
        register_kb_function(CYCL_ATOMIC_TERM_P);
        register_kb_function(CYCL_CLOSED_ATOMIC_TERM_P);
        register_kb_function(HL_NON_ATOMIC_TERM_P);
        register_kb_function($sym30$CYCL_NON_ATOMIC_TERM_);
        register_kb_function($sym31$EL_NON_ATOMIC_TERM_);
        register_kb_function(HL_INDEXED_TERM_P);
        register_kb_function($sym33$CYCL_INDEXED_TERM_);
        register_kb_function($sym34$CYCL_OPEN_NON_ATOMIC_TERM_);
        register_kb_function($sym35$CYCL_CLOSED_NON_ATOMIC_TERM_);
        register_kb_function($sym36$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
        register_kb_function($sym37$CYCL_NON_ATOMIC_REIFIED_TERM_);
        register_kb_function($sym38$EL_REIFIABLE_NON_ATOMIC_TERM_);
        register_kb_function($sym39$CYCL_CLOSED_EXPRESSION_);
        register_kb_function($sym40$CYCL_OPEN_EXPRESSION_);
        register_kb_function($sym41$CYCL_FORMULA_);
        register_kb_function($sym42$CYCL_OPEN_FORMULA_);
        register_kb_function($sym43$CYCL_CLOSED_FORMULA_);
        register_kb_function(HL_FORMULA_P);
        register_kb_function(CYCL_UNBOUND_RELATION_FORMULA_P);
        register_kb_function($sym46$CYCL_SENTENCE_);
        register_kb_function($sym47$CYCL_OPEN_SENTENCE_);
        register_kb_function($sym48$CYCL_CLOSED_SENTENCE_);
        register_kb_function($sym50$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
        register_kb_function($sym51$EL_SENTENCE_);
        register_kb_function($sym52$CYCL_ATOMIC_SENTENCE_);
        register_kb_function($sym53$CYCL_CLOSED_ATOMIC_SENTENCE_);
        register_kb_function($sym54$CYCL_PROPOSITIONAL_SENTENCE_);
        register_kb_function($sym55$CYCL_SENTENCE_ASKABLE_);
        register_kb_function($sym56$CYCL_SENTENCE_ASSERTIBLE_);
        register_kb_function($sym57$EL_SENTENCE_ASKABLE_);
        register_kb_function($sym58$EL_SENTENCE_ASSERTIBLE_);
        register_kb_function($sym59$CYCL_NON_ATOMIC_TERM_ASKABLE_);
        register_kb_function($sym60$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
        register_kb_function($sym61$EL_NON_ATOMIC_TERM_ASKABLE_);
        register_kb_function($sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_);
        register_kb_function($sym63$CYCL_EXPRESSION_ASKABLE_);
        register_kb_function($sym64$CYCL_EXPRESSION_ASSERTIBLE_);
        register_kb_function($sym65$EL_EXPRESSION_ASKABLE_);
        register_kb_function($sym66$EL_EXPRESSION_ASSERTIBLE_);
        register_kb_function($sym67$CYCL_QUERY_);
        register_kb_function($sym68$CYCL_ASSERTION_);
        register_kb_function($sym69$CYCL_ATOMIC_ASSERTION_);
        register_kb_function($sym70$CYCL_GAF_ASSERTION_);
        register_kb_function($sym71$CYCL_RULE_ASSERTION_);
        register_kb_function($sym72$CYCL_ASSERTED_ASSERTION_);
        register_kb_function($sym73$CYCL_DEDUCED_ASSERTION_);
        register_kb_function($sym74$CYCL_NL_SEMANTIC_ASSERTION_);
        register_kb_function($sym76$CYCL_CANONICALIZER_DIRECTIVE_);
        register_kb_function($sym78$CYCL_REFORMULATOR_DIRECTIVE_);
        register_kb_function($sym81$CYCL_REFORMULATOR_RULE_);
        register_kb_function($sym83$CYCL_SIMPLIFIER_DIRECTIVE_);
        register_kb_function(HL_ASSERTION_P);
        register_kb_function($sym85$EL_ASSERTION_);
        register_kb_function(CYC_GROUND_TERM);
        register_kb_function(CYC_REAL_NUMBER);
        register_kb_function(CYC_SYSTEM_REAL_NUMBER);
        register_kb_function(CYC_POSITIVE_NUMBER);
        register_kb_function(CYC_NEGATIVE_NUMBER);
        register_kb_function(CYC_NON_POSITIVE_NUMBER);
        register_kb_function(CYC_NON_NEGATIVE_NUMBER);
        register_kb_function(CYC_RATIONAL_NUMBER);
        register_kb_function(CYC_REAL_0_100);
        register_kb_function(CYC_REAL_0_1);
        register_kb_function(CYC_REAL_MINUS_1_TO_PLUS_1);
        register_kb_function(CYC_REAL_1_INFINITY);
        register_kb_function(CYC_NONZERO_NUMBER);
        register_kb_function(CYC_SYSTEM_FLOAT);
        register_kb_function(CYC_INTEGER);
        register_kb_function(CYC_SYSTEM_INTEGER);
        register_kb_function(CYC_POSITIVE_INTEGER);
        register_kb_function($sym106$CYC_PRIME_NUMBER_);
        register_kb_function($sym108$CYC_MAYBE_PRIME_NUMBER_);
        register_kb_function(CYC_NEGATIVE_INTEGER);
        register_kb_function(CYC_NON_POSITIVE_INTEGER);
        register_kb_function(CYC_NON_NEGATIVE_INTEGER);
        register_kb_function(CYC_EVEN_NUMBER);
        register_kb_function(CYC_ODD_NUMBER);
        register_kb_function(CYC_UNIVERSAL_DATE);
        register_kb_function(CYC_UNIVERSAL_SECOND);
        if (CYC_SET_OF_TYPE_NECESSARY.isSymbol()) {
            final SubLObject item_var = CYC_SET_OF_TYPE_NECESSARY;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_SET_OF_TYPE_NECESSARY);
        if (CYC_SET_OF_TYPE_SUFFICIENT.isSymbol()) {
            final SubLObject item_var = CYC_SET_OF_TYPE_SUFFICIENT;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_SET_OF_TYPE_SUFFICIENT);
        if (CYC_LIST_OF_TYPE_NECESSARY.isSymbol()) {
            final SubLObject item_var = CYC_LIST_OF_TYPE_NECESSARY;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_LIST_OF_TYPE_NECESSARY);
        if (CYC_LIST_OF_TYPE_SUFFICIENT.isSymbol()) {
            final SubLObject item_var = CYC_LIST_OF_TYPE_SUFFICIENT;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_LIST_OF_TYPE_SUFFICIENT);
        memoization_state.note_globally_cached_function($sym122$EXTENSIONAL_SET_);
        register_kb_function(CYC_LIST_WITHOUT_REPETITION);
        register_kb_function(CYC_NUMERIC_STRING_NECESSARY);
        register_kb_function(CYC_NUMERAL_STRING);
        register_kb_function(CYC_NUMERIC_STRING);
        register_kb_function(CYC_NUMBER_STRING);
        register_kb_function(CYC_ZIP_CODE_FIVE_DIGIT);
        register_kb_function(CYC_ZIP_CODE_NINE_DIGIT);
        register_kb_function(CYC_GUID_STRING_P);
        register_kb_function(CYC_NAICS_CODE);
        register_kb_function(CYC_UNICODE_DENOTING_ASCII_STRING_P);
        register_kb_function(CYC_ASCII_STRING_P);
        register_kb_function(CYC_CONTROL_CHARACTER_FREE_STRING_NECESSARY);
        register_kb_function(CYC_URL);
        register_kb_function($sym145$DOCTOR_ME_ID_);
        register_kb_function($sym146$CLPE_);
        register_kb_function($sym147$CYC_QUERY_);
        register_kb_function(CYC_SYNTACTIC_FORMULA_ARITY_OK);
        register_kb_function(CYC_SYNTACTIC_FORMULA);
        register_kb_function($sym150$FUNCTION_EXPRESSION_);
        register_kb_function($sym151$CYC_RELATION_EXPRESSION_);
        register_kb_function($sym152$EL_VARIABLE_);
        register_kb_function(CYC_SUBL_EXPRESSION);
        register_kb_function(CYC_SUBL_ESCAPE);
        register_kb_function(CYC_SUBL_TEMPLATE);
        register_kb_function($sym156$IBQE_);
        register_kb_function($sym157$SCALAR_POINT_VALUE_);
        register_kb_function($sym159$SCALAR_INTEGRAL_VALUE_);
        register_kb_function($sym160$NON_NEGATIVE_SCALAR_INTERVAL_);
        register_kb_function($sym161$POSITIVE_SCALAR_INTERVAL_);
        register_kb_function($sym162$NEGATIVE_SCALAR_INTERVAL_);
        register_kb_function(CYC_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P);
        register_kb_function(CYC_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P);
        register_kb_function(CYC_FRACTIONAL_MEASURABLE_QUANTITY_DECIMAL_P);
        define_test_case_table_int(CYCL_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list178);
        define_test_case_table_int(CYCL_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list180);
        register_kb_function($sym181$TERM_SET_);
        register_kb_function($sym182$CYCL_VAR_LIST_);
        register_kb_function($sym183$CYC_EL_VAR_LIST_);
        register_kb_function(CYC_SYSTEM_ATOM);
        register_kb_function(CYC_LIST_OF_LISTS);
        if (CYC_STRING_IS_LENGTH.isSymbol()) {
            final SubLObject item_var = CYC_STRING_IS_LENGTH;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_STRING_IS_LENGTH);
        if (CYC_STRING_IS_MINIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = CYC_STRING_IS_MINIMUM_LENGTH;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_STRING_IS_MINIMUM_LENGTH);
        if (CYC_STRING_IS_MAXIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = CYC_STRING_IS_MAXIMUM_LENGTH;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_STRING_IS_MAXIMUM_LENGTH);
        if (CYC_LIST_IS_LENGTH.isSymbol()) {
            final SubLObject item_var = CYC_LIST_IS_LENGTH;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_LIST_IS_LENGTH);
        register_kb_function(RTP_SYNTACTIC_CONSTRAINT);
        register_kb_function(CYC_SUBL_QUERY_PROPERTY_P);
        register_kb_function(CYC_SUBL_TV_P);
        register_kb_function(CYC_SUBL_HL_SUPPORT_MODULE_P);
        register_kb_function(CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P);
        register_kb_function(CYC_SUBL_KCT_METRIC_IDENTIFIER_P);
        register_kb_function(CYC_8_BYTE_INTEGER);
        register_kb_function(CYC_4_BYTE_INTEGER);
        register_kb_function(CYC_2_BYTE_INTEGER);
        register_kb_function(CYC_1_BYTE_INTEGER);
        register_kb_function(CYC_BIT_STRING);
        register_kb_function(CYC_IP4_ADDRESS);
        register_kb_function(CYC_IP4_NETWORK_ADDRESS);
        if (CYC_LIST_IS_MINIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = CYC_LIST_IS_MINIMUM_LENGTH;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_LIST_IS_MINIMUM_LENGTH);
        if (CYC_LIST_IS_MAXIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = CYC_LIST_IS_MAXIMUM_LENGTH;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_LIST_IS_MAXIMUM_LENGTH);
        register_kb_function(CYC_ADDITION_EXPRESSION);
        register_kb_function(CYC_SUBTRACTION_EXPRESSION);
        register_kb_function(CYC_MULTIPLICATION_EXPRESSION);
        register_kb_function(CYC_DIVISION_EXPRESSION);
        register_kb_function(CYC_EXPONENTIATION_EXPRESSION);
        register_kb_function(CYC_NTH_ROOT_EXPRESSION);
        register_kb_function(CYC_ENCLOSED_MATH_EXPRESSION);
        register_kb_function(CYC_UNIVARIATE_LINEAR_EQUATION);
        define_test_case_table_int(TEST_MATH_EXPRESSION_FN_COLLECTION_DEFNS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list227, $KB, $FULL, $WORKING_, T }), $list228);
        define_test_case_table_int($sym61$EL_NON_ATOMIC_TERM_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list229);
        define_test_case_table_int($sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list230);
        define_test_case_table_int($sym65$EL_EXPRESSION_ASKABLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list231);
        define_test_case_table_int($sym66$EL_EXPRESSION_ASSERTIBLE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list232);
        define_test_case_table_int(CYC_IP4_NETWORK_ADDRESS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list234);
        return NIL;
    }

    static private final SubLSymbol $sym113$EXTENSIONAL_SET_ = makeSymbol("EXTENSIONAL-SET?");

    static private final SubLSymbol $sym115$_EXTENSIONAL_SET__CACHING_STATE_ = makeSymbol("*EXTENSIONAL-SET?-CACHING-STATE*");

    static private final SubLSymbol $sym117$CLEAR_EXTENSIONAL_SET_ = makeSymbol("CLEAR-EXTENSIONAL-SET?");

    public static final SubLSymbol $kw118$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt129 = list(makeString("-"));

    static private final SubLSymbol $sym135$DOCTOR_ME_ID_ = makeSymbol("DOCTOR-ME-ID?");

    static private final SubLSymbol $sym136$CLPE_ = makeSymbol("CLPE?");

    static private final SubLSymbol $sym137$CYC_QUERY_ = makeSymbol("CYC-QUERY?");

    static private final SubLSymbol $sym140$FUNCTION_EXPRESSION_ = makeSymbol("FUNCTION-EXPRESSION?");

    static private final SubLSymbol $sym141$CYC_RELATION_EXPRESSION_ = makeSymbol("CYC-RELATION-EXPRESSION?");

    static private final SubLSymbol $sym142$EL_VARIABLE_ = makeSymbol("EL-VARIABLE?");

    static private final SubLSymbol $sym146$IBQE_ = makeSymbol("IBQE?");

    static private final SubLSymbol $sym147$SCALAR_POINT_VALUE_ = makeSymbol("SCALAR-POINT-VALUE?");

    static private final SubLSymbol $sym148$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");

    static private final SubLSymbol $sym149$POSITIVE_SCALAR_INTERVAL_ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");

    static private final SubLSymbol $sym151$TERM_SET_ = makeSymbol("TERM-SET?");

    static private final SubLSymbol $sym152$CYCL_VAR_LIST_ = makeSymbol("CYCL-VAR-LIST?");

    static private final SubLSymbol $sym153$CYC_EL_VAR_LIST_ = makeSymbol("CYC-EL-VAR-LIST?");

    static private final SubLList $list_alt179 = list(CHAR_period);

    static private final SubLList $list_alt182 = list(CHAR_slash);

    static private final SubLString $$$ashenoy = makeString("ashenoy");

    static private final SubLList $list_alt194 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    static private final SubLList $list_alt195 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    static private final SubLList $list_alt196 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Cat"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    static private final SubLList $list_alt197 = list(list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"))), NIL), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Muffet"), reader_make_constant_shell("Cat"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"))), T), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Muffet"))), NIL), list(list(list(reader_make_constant_shell("JuvenileFn"), reader_make_constant_shell("Dog"), reader_make_constant_shell("Cat"))), NIL));

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt200 = list(list(list(makeString("192.168.0.1/32")), T));

    @Override
    public void declareFunctions() {
        declare_collection_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_collection_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_collection_defns_file();
    }

    

    public static final class $cyc_individual_necessary$UnaryFunction extends UnaryFunction {
        public $cyc_individual_necessary$UnaryFunction() {
            super(extractFunctionNamed("CYC-INDIVIDUAL-NECESSARY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_individual_necessary(arg1);
        }
    }

    public static final class $cyc_typicality_reference_set_propertyP$UnaryFunction extends UnaryFunction {
        public $cyc_typicality_reference_set_propertyP$UnaryFunction() {
            super(extractFunctionNamed("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_typicality_reference_set_propertyP(arg1);
        }
    }

    public static final class $cycl_sentence_assertibleP$UnaryFunction extends UnaryFunction {
        public $cycl_sentence_assertibleP$UnaryFunction() {
            super(extractFunctionNamed("CYCL-SENTENCE-ASSERTIBLE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_sentence_assertibleP(arg1);
        }
    }

    public static final class $cycl_canonicalizer_directiveP$UnaryFunction extends UnaryFunction {
        public $cycl_canonicalizer_directiveP$UnaryFunction() {
            super(extractFunctionNamed("CYCL-CANONICALIZER-DIRECTIVE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_canonicalizer_directiveP(arg1);
        }
    }

    public static final class $cyc_list_of_type_necessary$UnaryFunction extends UnaryFunction {
        public $cyc_list_of_type_necessary$UnaryFunction() {
            super(extractFunctionNamed("CYC-LIST-OF-TYPE-NECESSARY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_list_of_type_necessary(arg1);
        }
    }

    public static final class $cyc_list_of_type_sufficient$UnaryFunction extends UnaryFunction {
        public $cyc_list_of_type_sufficient$UnaryFunction() {
            super(extractFunctionNamed("CYC-LIST-OF-TYPE-SUFFICIENT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_list_of_type_sufficient(arg1);
        }
    }

    public static final class $clear_extensional_setP$ZeroArityFunction extends ZeroArityFunction {
        public $clear_extensional_setP$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-EXTENSIONAL-SET?"));
        }

        @Override
        public SubLObject processItem() {
            return clear_extensional_setP();
        }
    }

    public static final class $cyc_numeric_string_necessary$UnaryFunction extends UnaryFunction {
        public $cyc_numeric_string_necessary$UnaryFunction() {
            super(extractFunctionNamed("CYC-NUMERIC-STRING-NECESSARY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_numeric_string_necessary(arg1);
        }
    }

    public static final class $cyc_zip_code_five_digit$UnaryFunction extends UnaryFunction {
        public $cyc_zip_code_five_digit$UnaryFunction() {
            super(extractFunctionNamed("CYC-ZIP-CODE-FIVE-DIGIT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_zip_code_five_digit(arg1);
        }
    }

    public static final class $cyc_zip_code_nine_digit$UnaryFunction extends UnaryFunction {
        public $cyc_zip_code_nine_digit$UnaryFunction() {
            super(extractFunctionNamed("CYC-ZIP-CODE-NINE-DIGIT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_zip_code_nine_digit(arg1);
        }
    }

    public static final class $cyc_guid_string_p$UnaryFunction extends UnaryFunction {
        public $cyc_guid_string_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-GUID-STRING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_guid_string_p(arg1);
        }
    }

    public static final class $cyc_ascii_string_p$UnaryFunction extends UnaryFunction {
        public $cyc_ascii_string_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-ASCII-STRING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_ascii_string_p(arg1);
        }
    }

    public static final class $cyc_list_of_lists$UnaryFunction extends UnaryFunction {
        public $cyc_list_of_lists$UnaryFunction() {
            super(extractFunctionNamed("CYC-LIST-OF-LISTS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_list_of_lists(arg1);
        }
    }

    public static final class $cyc_string_is_length$UnaryFunction extends UnaryFunction {
        public $cyc_string_is_length$UnaryFunction() {
            super(extractFunctionNamed("CYC-STRING-IS-LENGTH"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_string_is_length(arg1);
        }
    }

    public static final class $cyc_string_is_minimum_length$UnaryFunction extends UnaryFunction {
        public $cyc_string_is_minimum_length$UnaryFunction() {
            super(extractFunctionNamed("CYC-STRING-IS-MINIMUM-LENGTH"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_string_is_minimum_length(arg1);
        }
    }

    public static final class $cyc_string_is_maximum_length$UnaryFunction extends UnaryFunction {
        public $cyc_string_is_maximum_length$UnaryFunction() {
            super(extractFunctionNamed("CYC-STRING-IS-MAXIMUM-LENGTH"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_string_is_maximum_length(arg1);
        }
    }

    public static final class $cyc_subl_query_property_p$UnaryFunction extends UnaryFunction {
        public $cyc_subl_query_property_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-SUBL-QUERY-PROPERTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_subl_query_property_p(arg1);
        }
    }

    public static final class $cyc_subl_tv_p$UnaryFunction extends UnaryFunction {
        public $cyc_subl_tv_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-SUBL-TV-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_subl_tv_p(arg1);
        }
    }

    public static final class $cyc_subl_hl_support_module_p$UnaryFunction extends UnaryFunction {
        public $cyc_subl_hl_support_module_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-SUBL-HL-SUPPORT-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_subl_hl_support_module_p(arg1);
        }
    }

    public static final class $cyc_8_byte_integer$UnaryFunction extends UnaryFunction {
        public $cyc_8_byte_integer$UnaryFunction() {
            super(extractFunctionNamed("CYC-8-BYTE-INTEGER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_8_byte_integer(arg1);
        }
    }

    public static final class $cyc_4_byte_integer$UnaryFunction extends UnaryFunction {
        public $cyc_4_byte_integer$UnaryFunction() {
            super(extractFunctionNamed("CYC-4-BYTE-INTEGER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_4_byte_integer(arg1);
        }
    }

    public static final class $cyc_2_byte_integer$UnaryFunction extends UnaryFunction {
        public $cyc_2_byte_integer$UnaryFunction() {
            super(extractFunctionNamed("CYC-2-BYTE-INTEGER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_2_byte_integer(arg1);
        }
    }

    public static final class $cyc_1_byte_integer$UnaryFunction extends UnaryFunction {
        public $cyc_1_byte_integer$UnaryFunction() {
            super(extractFunctionNamed("CYC-1-BYTE-INTEGER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_1_byte_integer(arg1);
        }
    }

    public static final class $cyc_bit_datatype$UnaryFunction extends UnaryFunction {
        public $cyc_bit_datatype$UnaryFunction() {
            super(extractFunctionNamed("CYC-BIT-DATATYPE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_bit_datatype(arg1);
        }
    }

    public static final class $cyc_ip4_address$UnaryFunction extends UnaryFunction {
        public $cyc_ip4_address$UnaryFunction() {
            super(extractFunctionNamed("CYC-IP4-ADDRESS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_ip4_address(arg1);
        }
    }

    public static final class $cyc_ip4_network_address$UnaryFunction extends UnaryFunction {
        public $cyc_ip4_network_address$UnaryFunction() {
            super(extractFunctionNamed("CYC-IP4-NETWORK-ADDRESS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_ip4_network_address(arg1);
        }
    }

    public static final class $cyc_list_is_minimum_length$UnaryFunction extends UnaryFunction {
        public $cyc_list_is_minimum_length$UnaryFunction() {
            super(extractFunctionNamed("CYC-LIST-IS-MINIMUM-LENGTH"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_list_is_minimum_length(arg1);
        }
    }
}

/**
 * Total time: 946 ms
 */
