package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.cyc_testing.ctest_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.rtp.rtp_type_checkers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class collection_defns extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.collection_defns";
    public static final String myFingerPrint = "6b57bd9b2589039a4c49a90a329fd8f324646b73ba4ec29cfea1834c4754864b";
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 1200L)
    private static SubLSymbol $subl_functions_used_as_collection_defns$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 1570L)
    private static SubLSymbol $cycl_functions_used_as_collection_defns$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2845L)
    private static SubLSymbol $cached_relation_type_arity_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 23296L)
    private static SubLSymbol $extensional_setP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44361L)
    private static SubLSymbol $8byteinteger_lower_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44503L)
    private static SubLSymbol $8byteinteger_upper_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44738L)
    private static SubLSymbol $4byteinteger_lower_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44812L)
    private static SubLSymbol $4byteinteger_upper_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45047L)
    private static SubLSymbol $2byteinteger_lower_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45120L)
    private static SubLSymbol $2byteinteger_upper_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45355L)
    private static SubLSymbol $1byteinteger_lower_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45427L)
    private static SubLSymbol $1byteinteger_upper_bound$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CYC_INDIVIDUAL_NECESSARY;
    private static final SubLSymbol $sym3$CYC_KAPPA_PREDICATE_BY_ARITY;
    private static final SubLSymbol $sym4$CACHED_RELATION_TYPE_ARITY;
    private static final SubLObject $const5$relationAllInstance;
    private static final SubLObject $const6$arity;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$ARITY;
    private static final SubLObject $const9$BaseKB;
    private static final SubLSymbol $sym10$_CACHED_RELATION_TYPE_ARITY_CACHING_STATE_;
    private static final SubLSymbol $sym11$CYCL_EXPRESSION_;
    private static final SubLSymbol $sym12$EL_EXPRESSION_;
    private static final SubLSymbol $sym13$HL_EXPRESSION_P;
    private static final SubLSymbol $sym14$CYCL_OPEN_DENOTATIONAL_TERM_;
    private static final SubLSymbol $sym15$CYCL_CLOSED_DENOTATIONAL_TERM_;
    private static final SubLSymbol $sym16$CYCL_REIFIABLE_DENOTATIONAL_TERM_;
    private static final SubLSymbol $sym17$CYCL_REIFIED_DENOTATIONAL_TERM_;
    private static final SubLSymbol $sym18$HL_CLOSED_DENOTATIONAL_TERM_P;
    private static final SubLSymbol $sym19$CYCL_REPRESENTED_ATOMIC_TERM_P;
    private static final SubLSymbol $sym20$CYCL_REPRESENTED_TERM_;
    private static final SubLSymbol $sym21$CYC_SYSTEM_TERM_P;
    private static final SubLSymbol $sym22$CYC_SYSTEM_CHARACTER_P;
    private static final SubLSymbol $sym23$CYC_SYSTEM_STRING_P;
    private static final SubLSymbol $sym24$CYC_SYSTEM_REAL_NUMBER_P;
    private static final SubLSymbol $sym25$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P;
    private static final SubLSymbol $sym26$CYCL_SUBL_SYMBOL_P;
    private static final SubLSymbol $sym27$CYCL_ATOMIC_TERM_P;
    private static final SubLSymbol $sym28$CYCL_CLOSED_ATOMIC_TERM_P;
    private static final SubLSymbol $sym29$HL_NON_ATOMIC_TERM_P;
    private static final SubLSymbol $sym30$CYCL_NON_ATOMIC_TERM_;
    private static final SubLSymbol $sym31$EL_NON_ATOMIC_TERM_;
    private static final SubLSymbol $sym32$HL_INDEXED_TERM_P;
    private static final SubLSymbol $sym33$CYCL_INDEXED_TERM_;
    private static final SubLSymbol $sym34$CYCL_OPEN_NON_ATOMIC_TERM_;
    private static final SubLSymbol $sym35$CYCL_CLOSED_NON_ATOMIC_TERM_;
    private static final SubLSymbol $sym36$CYCL_REIFIABLE_NON_ATOMIC_TERM_;
    private static final SubLSymbol $sym37$CYCL_NON_ATOMIC_REIFIED_TERM_;
    private static final SubLSymbol $sym38$EL_REIFIABLE_NON_ATOMIC_TERM_;
    private static final SubLSymbol $sym39$CYCL_CLOSED_EXPRESSION_;
    private static final SubLSymbol $sym40$CYCL_OPEN_EXPRESSION_;
    private static final SubLSymbol $sym41$CYCL_FORMULA_;
    private static final SubLSymbol $sym42$CYCL_OPEN_FORMULA_;
    private static final SubLSymbol $sym43$CYCL_CLOSED_FORMULA_;
    private static final SubLSymbol $sym44$HL_FORMULA_P;
    private static final SubLSymbol $sym45$CYCL_UNBOUND_RELATION_FORMULA_P;
    private static final SubLSymbol $sym46$CYCL_SENTENCE_;
    private static final SubLSymbol $sym47$CYCL_OPEN_SENTENCE_;
    private static final SubLSymbol $sym48$CYCL_CLOSED_SENTENCE_;
    private static final SubLSymbol $kw49$TERM;
    private static final SubLSymbol $sym50$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_;
    private static final SubLSymbol $sym51$EL_SENTENCE_;
    private static final SubLSymbol $sym52$CYCL_ATOMIC_SENTENCE_;
    private static final SubLSymbol $sym53$CYCL_CLOSED_ATOMIC_SENTENCE_;
    private static final SubLSymbol $sym54$CYCL_PROPOSITIONAL_SENTENCE_;
    private static final SubLSymbol $sym55$CYCL_SENTENCE_ASKABLE_;
    private static final SubLSymbol $sym56$CYCL_SENTENCE_ASSERTIBLE_;
    private static final SubLSymbol $sym57$EL_SENTENCE_ASKABLE_;
    private static final SubLSymbol $sym58$EL_SENTENCE_ASSERTIBLE_;
    private static final SubLSymbol $sym59$CYCL_NON_ATOMIC_TERM_ASKABLE_;
    private static final SubLSymbol $sym60$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_;
    private static final SubLSymbol $sym61$EL_NON_ATOMIC_TERM_ASKABLE_;
    private static final SubLSymbol $sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_;
    private static final SubLSymbol $sym63$CYCL_EXPRESSION_ASKABLE_;
    private static final SubLSymbol $sym64$CYCL_EXPRESSION_ASSERTIBLE_;
    private static final SubLSymbol $sym65$EL_EXPRESSION_ASKABLE_;
    private static final SubLSymbol $sym66$EL_EXPRESSION_ASSERTIBLE_;
    private static final SubLSymbol $sym67$CYCL_QUERY_;
    private static final SubLSymbol $sym68$CYCL_ASSERTION_;
    private static final SubLSymbol $sym69$CYCL_ATOMIC_ASSERTION_;
    private static final SubLSymbol $sym70$CYCL_GAF_ASSERTION_;
    private static final SubLSymbol $sym71$CYCL_RULE_ASSERTION_;
    private static final SubLSymbol $sym72$CYCL_ASSERTED_ASSERTION_;
    private static final SubLSymbol $sym73$CYCL_DEDUCED_ASSERTION_;
    private static final SubLSymbol $sym74$CYCL_NL_SEMANTIC_ASSERTION_;
    private static final SubLObject $const75$CanonicalizerDirectivePredicate;
    private static final SubLSymbol $sym76$CYCL_CANONICALIZER_DIRECTIVE_;
    private static final SubLObject $const77$ReformulatorDirectivePredicate;
    private static final SubLSymbol $sym78$CYCL_REFORMULATOR_DIRECTIVE_;
    private static final SubLObject $const79$CycLReformulationRulePredicate;
    private static final SubLObject $const80$ist;
    private static final SubLSymbol $sym81$CYCL_REFORMULATOR_RULE_;
    private static final SubLObject $const82$SimplifierDirectivePredicate;
    private static final SubLSymbol $sym83$CYCL_SIMPLIFIER_DIRECTIVE_;
    private static final SubLSymbol $sym84$HL_ASSERTION_P;
    private static final SubLSymbol $sym85$EL_ASSERTION_;
    private static final SubLSymbol $sym86$CYC_GROUND_TERM;
    private static final SubLSymbol $sym87$CYC_REAL_NUMBER;
    private static final SubLSymbol $sym88$CYC_SYSTEM_REAL_NUMBER;
    private static final SubLSymbol $sym89$CYC_POSITIVE_NUMBER;
    private static final SubLSymbol $sym90$CYC_NEGATIVE_NUMBER;
    private static final SubLSymbol $sym91$CYC_NON_POSITIVE_NUMBER;
    private static final SubLSymbol $sym92$CYC_NON_NEGATIVE_NUMBER;
    private static final SubLSymbol $sym93$CYC_RATIONAL_NUMBER;
    private static final SubLFloat $float94$100_0;
    private static final SubLSymbol $sym95$CYC_REAL_0_100;
    private static final SubLFloat $float96$1_0;
    private static final SubLSymbol $sym97$CYC_REAL_0_1;
    private static final SubLFloat $float98$_1_0;
    private static final SubLSymbol $sym99$CYC_REAL_MINUS_1_TO_PLUS_1;
    private static final SubLSymbol $sym100$CYC_REAL_1_INFINITY;
    private static final SubLSymbol $sym101$CYC_NONZERO_NUMBER;
    private static final SubLSymbol $sym102$CYC_SYSTEM_FLOAT;
    private static final SubLSymbol $sym103$CYC_INTEGER;
    private static final SubLSymbol $sym104$CYC_SYSTEM_INTEGER;
    private static final SubLSymbol $sym105$CYC_POSITIVE_INTEGER;
    private static final SubLSymbol $sym106$CYC_PRIME_NUMBER_;
    private static final SubLSymbol $sym107$CONSTANT_P;
    private static final SubLSymbol $sym108$CYC_MAYBE_PRIME_NUMBER_;
    private static final SubLSymbol $sym109$CYC_NEGATIVE_INTEGER;
    private static final SubLSymbol $sym110$CYC_NON_POSITIVE_INTEGER;
    private static final SubLSymbol $sym111$CYC_NON_NEGATIVE_INTEGER;
    private static final SubLSymbol $sym112$CYC_EVEN_NUMBER;
    private static final SubLSymbol $sym113$CYC_ODD_NUMBER;
    private static final SubLSymbol $sym114$CYC_UNIVERSAL_DATE;
    private static final SubLSymbol $sym115$CYC_UNIVERSAL_SECOND;
    private static final SubLSymbol $sym116$CYC_SET_OF_TYPE_NECESSARY;
    private static final SubLSymbol $kw117$AGNOSTIC;
    private static final SubLSymbol $sym118$CYC_SET_OF_TYPE_SUFFICIENT;
    private static final SubLSymbol $sym119$CYC_LIST_OF_TYPE_NECESSARY;
    private static final SubLSymbol $sym120$CYC_LIST_OF_TYPE_SUFFICIENT;
    private static final SubLObject $const121$instanceElementType;
    private static final SubLSymbol $sym122$EXTENSIONAL_SET_;
    private static final SubLObject $const123$Set_Extensional;
    private static final SubLSymbol $sym124$_EXTENSIONAL_SET__CACHING_STATE_;
    private static final SubLInteger $int125$32;
    private static final SubLSymbol $sym126$CLEAR_EXTENSIONAL_SET_;
    private static final SubLObject $const127$TheSet;
    private static final SubLObject $const128$List_Extensional;
    private static final SubLObject $const129$instanceListMemberType;
    private static final SubLObject $const130$TheList;
    private static final SubLSymbol $sym131$CYC_LIST_WITHOUT_REPETITION;
    private static final SubLSymbol $sym132$CYC_NUMERIC_STRING_NECESSARY;
    private static final SubLSymbol $sym133$CYC_NUMERAL_STRING;
    private static final SubLSymbol $sym134$CYC_NUMERIC_STRING;
    private static final SubLSymbol $sym135$CYC_NUMBER_STRING;
    private static final SubLSymbol $sym136$CYC_ZIP_CODE_FIVE_DIGIT;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$CYC_ZIP_CODE_NINE_DIGIT;
    private static final SubLSymbol $sym139$CYC_GUID_STRING_P;
    private static final SubLSymbol $sym140$CYC_NAICS_CODE;
    private static final SubLSymbol $sym141$CYC_UNICODE_DENOTING_ASCII_STRING_P;
    private static final SubLSymbol $sym142$CYC_ASCII_STRING_P;
    private static final SubLSymbol $sym143$CYC_CONTROL_CHARACTER_FREE_STRING_NECESSARY;
    private static final SubLSymbol $sym144$CYC_URL;
    private static final SubLSymbol $sym145$DOCTOR_ME_ID_;
    private static final SubLSymbol $sym146$CLPE_;
    private static final SubLSymbol $sym147$CYC_QUERY_;
    private static final SubLSymbol $sym148$CYC_SYNTACTIC_FORMULA_ARITY_OK;
    private static final SubLSymbol $sym149$CYC_SYNTACTIC_FORMULA;
    private static final SubLSymbol $sym150$FUNCTION_EXPRESSION_;
    private static final SubLSymbol $sym151$CYC_RELATION_EXPRESSION_;
    private static final SubLSymbol $sym152$EL_VARIABLE_;
    private static final SubLSymbol $sym153$CYC_SUBL_EXPRESSION;
    private static final SubLSymbol $sym154$CYC_SUBL_ESCAPE;
    private static final SubLSymbol $sym155$CYC_SUBL_TEMPLATE;
    private static final SubLSymbol $sym156$IBQE_;
    private static final SubLSymbol $sym157$SCALAR_POINT_VALUE_;
    private static final SubLObject $const158$UnitOfMeasure;
    private static final SubLSymbol $sym159$SCALAR_INTEGRAL_VALUE_;
    private static final SubLSymbol $sym160$NON_NEGATIVE_SCALAR_INTERVAL_;
    private static final SubLSymbol $sym161$POSITIVE_SCALAR_INTERVAL_;
    private static final SubLSymbol $sym162$NEGATIVE_SCALAR_INTERVAL_;
    private static final SubLSymbol $sym163$CYC_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P;
    private static final SubLObject $const164$SimpleFraction;
    private static final SubLSymbol $sym165$CYC_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$CYC_FRACTIONAL_MEASURABLE_QUANTITY_DECIMAL_P;
    private static final SubLObject $const169$DecimalFraction;
    private static final SubLObject $const170$Fraction;
    private static final SubLSymbol $sym171$CYCL_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P;
    private static final SubLSymbol $kw172$TEST;
    private static final SubLSymbol $kw173$OWNER;
    private static final SubLSymbol $kw174$CLASSES;
    private static final SubLSymbol $kw175$KB;
    private static final SubLSymbol $kw176$FULL;
    private static final SubLSymbol $kw177$WORKING_;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$CYCL_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P;
    private static final SubLList $list180;
    private static final SubLSymbol $sym181$TERM_SET_;
    private static final SubLSymbol $sym182$CYCL_VAR_LIST_;
    private static final SubLSymbol $sym183$CYC_EL_VAR_LIST_;
    private static final SubLSymbol $sym184$CYC_SYSTEM_ATOM;
    private static final SubLSymbol $kw185$IGNORE;
    private static final SubLSymbol $sym186$CYC_LIST_OF_LISTS;
    private static final SubLSymbol $sym187$CYC_STRING_IS_LENGTH;
    private static final SubLObject $const188$instanceListLength;
    private static final SubLSymbol $sym189$CYC_STRING_IS_MINIMUM_LENGTH;
    private static final SubLObject $const190$instanceListMinLength;
    private static final SubLSymbol $sym191$CYC_STRING_IS_MAXIMUM_LENGTH;
    private static final SubLObject $const192$instanceListMaxLength;
    private static final SubLSymbol $sym193$CYC_LIST_IS_LENGTH;
    private static final SubLSymbol $sym194$RTP_SYNTACTIC_CONSTRAINT;
    private static final SubLSymbol $sym195$CYC_SUBL_QUERY_PROPERTY_P;
    private static final SubLSymbol $sym196$CYC_SUBL_TV_P;
    private static final SubLSymbol $sym197$CYC_SUBL_HL_SUPPORT_MODULE_P;
    private static final SubLSymbol $sym198$CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P;
    private static final SubLSymbol $sym199$CYC_SUBL_KCT_METRIC_IDENTIFIER_P;
    private static final SubLInteger $int200$63;
    private static final SubLSymbol $sym201$CYC_8_BYTE_INTEGER;
    private static final SubLInteger $int202$31;
    private static final SubLSymbol $sym203$CYC_4_BYTE_INTEGER;
    private static final SubLSymbol $sym204$CYC_2_BYTE_INTEGER;
    private static final SubLSymbol $sym205$CYC_1_BYTE_INTEGER;
    private static final SubLObject $const206$BitData;
    private static final SubLSymbol $sym207$CYC_BIT_DATATYPE;
    private static final SubLSymbol $sym208$CYC_BIT_STRING;
    private static final SubLList $list209;
    private static final SubLInteger $int210$256;
    private static final SubLSymbol $sym211$CYC_IP4_ADDRESS;
    private static final SubLList $list212;
    private static final SubLInteger $int213$33;
    private static final SubLSymbol $sym214$CYC_IP4_NETWORK_ADDRESS;
    private static final SubLSymbol $sym215$CYC_LIST_IS_MINIMUM_LENGTH;
    private static final SubLSymbol $sym216$CYC_LIST_IS_MAXIMUM_LENGTH;
    private static final SubLSymbol $sym217$CYC_ADDITION_EXPRESSION;
    private static final SubLSymbol $sym218$CYC_SUBTRACTION_EXPRESSION;
    private static final SubLSymbol $sym219$CYC_MULTIPLICATION_EXPRESSION;
    private static final SubLSymbol $sym220$CYC_DIVISION_EXPRESSION;
    private static final SubLSymbol $sym221$CYC_EXPONENTIATION_EXPRESSION;
    private static final SubLSymbol $sym222$CYC_NTH_ROOT_EXPRESSION;
    private static final SubLSymbol $sym223$CYC_ENCLOSED_MATH_EXPRESSION;
    private static final SubLSymbol $sym224$CYC_UNIVARIATE_LINEAR_EQUATION;
    private static final SubLObject $const225$isa;
    private static final SubLSymbol $sym226$TEST_MATH_EXPRESSION_FN_COLLECTION_DEFNS;
    private static final SubLList $list227;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLList $list231;
    private static final SubLList $list232;
    private static final SubLSymbol $kw233$TINY;
    private static final SubLList $list234;
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2025L)
    public static SubLObject cyc_individual_necessary(final SubLObject v_object) {
        if (collection_defns.NIL != forts.fort_p(v_object) && collection_defns.NIL != fort_types_interface.collectionP(v_object)) {
            return (SubLObject)collection_defns.NIL;
        }
        return (SubLObject)collection_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2472L)
    public static SubLObject cyc_kappa_predicate_by_arity(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.kappa_predicate_p(v_object)) {
            final SubLObject actual_arity = el_utilities.kappa_predicate_arity(v_object);
            final SubLObject relation_type = at_vars.defn_collection();
            final SubLObject expected_arity = cached_relation_type_arity(relation_type);
            return Equality.eql(actual_arity, expected_arity);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2845L)
    public static SubLObject clear_cached_relation_type_arity() {
        final SubLObject cs = collection_defns.$cached_relation_type_arity_caching_state$.getGlobalValue();
        if (collection_defns.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2845L)
    public static SubLObject remove_cached_relation_type_arity(final SubLObject relation_type) {
        return memoization_state.caching_state_remove_function_results_with_args(collection_defns.$cached_relation_type_arity_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation_type), (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2845L)
    public static SubLObject cached_relation_type_arity_internal(final SubLObject relation_type) {
        final SubLObject template = (SubLObject)ConsesLow.listS(collection_defns.$const5$relationAllInstance, collection_defns.$const6$arity, relation_type, (SubLObject)collection_defns.$list7);
        final SubLObject v_arity = backward.removal_ask_variable((SubLObject)collection_defns.$kw8$ARITY, template, collection_defns.$const9$BaseKB, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED).first();
        return v_arity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 2845L)
    public static SubLObject cached_relation_type_arity(final SubLObject relation_type) {
        SubLObject caching_state = collection_defns.$cached_relation_type_arity_caching_state$.getGlobalValue();
        if (collection_defns.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)collection_defns.$sym4$CACHED_RELATION_TYPE_ARITY, (SubLObject)collection_defns.$sym10$_CACHED_RELATION_TYPE_ARITY_CACHING_STATE_, (SubLObject)collection_defns.NIL, (SubLObject)collection_defns.EQL, (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation_type, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_relation_type_arity_internal(relation_type)));
            memoization_state.caching_state_put(caching_state, relation_type, results, (SubLObject)collection_defns.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 3089L)
    public static SubLObject cycl_expressionP(final SubLObject v_object) {
        return cycl_grammar.cycl_expression_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 3329L)
    public static SubLObject el_expressionP(final SubLObject v_object) {
        return el_grammar.el_expression_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 3412L)
    public static SubLObject hl_expression_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_grammar.hl_variable_p(v_object) || collection_defns.NIL != hl_indexed_term_p(v_object) || collection_defns.NIL != cycl_grammar.subl_atomic_term_p(v_object) || collection_defns.NIL != cycl_grammar.cycl_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 3595L)
    public static SubLObject cycl_open_denotational_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_grammar.cycl_denotational_term_p(v_object) && collection_defns.NIL == el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 3738L)
    public static SubLObject cycl_closed_denotational_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_grammar.cycl_denotational_term_p(v_object) && collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 3876L)
    public static SubLObject cycl_reifiable_denotational_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_closed_denotational_term_p(v_object) || collection_defns.NIL != el_reifiable_non_atomic_termP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4042L)
    public static SubLObject cycl_reified_denotational_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_closed_denotational_term_p(v_object) || collection_defns.NIL != czer_utilities.naut_with_corresponding_nartP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4206L)
    public static SubLObject hl_closed_denotational_term_p(final SubLObject v_object) {
        return forts.fort_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4295L)
    public static SubLObject cycl_represented_atomic_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_grammar.cycl_variable_p(v_object) || collection_defns.NIL != cycl_grammar.cycl_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4430L)
    public static SubLObject cycl_represented_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_represented_atomic_term_p(v_object) || collection_defns.NIL != cycl_non_atomic_termP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4578L)
    public static SubLObject cyc_system_term_p(final SubLObject v_object) {
        return cycl_grammar.subl_atomic_term_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4723L)
    public static SubLObject cyc_system_character_p(final SubLObject v_object) {
        return Types.characterp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 4865L)
    public static SubLObject cyc_system_string_p(final SubLObject v_object) {
        return cycl_grammar.subl_string_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5007L)
    public static SubLObject cyc_system_real_number_p(final SubLObject v_object) {
        return cycl_grammar.subl_real_number_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5159L)
    public static SubLObject cyc_system_non_variable_symbol_p(final SubLObject v_object) {
        return cycl_grammar.subl_non_variable_symbol_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5327L)
    public static SubLObject cycl_subl_symbol_p(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.el_formula_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.subl_quote_p(v_object) && cycl_utilities.formula_arg1(v_object, (SubLObject)collection_defns.UNPROVIDED).isSymbol());
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5492L)
    public static SubLObject cycl_atomic_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_grammar.cycl_constant_p(v_object) || collection_defns.NIL != cycl_grammar.cycl_variable_p(v_object) || collection_defns.NIL != cycl_grammar.subl_atomic_term_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5693L)
    public static SubLObject cycl_closed_atomic_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_grammar.subl_atomic_term_p(v_object) || collection_defns.NIL != cycl_grammar.cycl_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5826L)
    public static SubLObject hl_non_atomic_term_p(final SubLObject v_object) {
        return nart_handles.nart_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 5906L)
    public static SubLObject cycl_non_atomic_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_non_atomic_term_p(v_object) || collection_defns.NIL != el_non_atomic_termP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6041L)
    public static SubLObject el_non_atomic_termP(final SubLObject v_object) {
        return el_grammar.el_nat_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6122L)
    public static SubLObject hl_indexed_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_closed_denotational_term_p(v_object) || collection_defns.NIL != hl_assertion_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6261L)
    public static SubLObject cycl_indexed_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_indexed_term_p(v_object) || collection_defns.NIL != el_reifiable_non_atomic_termP(v_object) || collection_defns.NIL != el_assertionP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6428L)
    public static SubLObject cycl_open_non_atomic_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_non_atomic_term_p(v_object) || (collection_defns.NIL != el_non_atomic_termP(v_object) && collection_defns.NIL == el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6603L)
    public static SubLObject cycl_closed_non_atomic_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_non_atomic_term_p(v_object) || (collection_defns.NIL != el_non_atomic_termP(v_object) && collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6773L)
    public static SubLObject cycl_reifiable_non_atomic_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_non_atomic_term_p(v_object) || collection_defns.NIL != el_reifiable_non_atomic_termP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 6928L)
    public static SubLObject cycl_non_atomic_reified_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_non_atomic_term_p(v_object) || collection_defns.NIL != czer_utilities.naut_with_corresponding_nartP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7081L)
    public static SubLObject el_reifiable_non_atomic_termP(final SubLObject v_object) {
        return obsolete.reifiable_natP(v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7178L)
    public static SubLObject cycl_closed_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_expressionP(v_object) && collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7301L)
    public static SubLObject cycl_open_expressionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_expressionP(v_object) && collection_defns.NIL == el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7429L)
    public static SubLObject cycl_formulaP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_formula_p(v_object) || collection_defns.NIL != el_utilities.el_relation_expressionP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7593L)
    public static SubLObject cycl_open_formulaP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_formulaP(v_object) && collection_defns.NIL == el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7715L)
    public static SubLObject cycl_closed_formulaP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_formulaP(v_object) && collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7832L)
    public static SubLObject hl_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != nart_handles.nart_p(v_object) || collection_defns.NIL != assertion_handles.assertion_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 7936L)
    public static SubLObject cycl_unbound_relation_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.el_formula_p(v_object) && collection_defns.NIL != cycl_grammar.cycl_variable_p(cycl_utilities.formula_arg0(v_object)) && collection_defns.NIL != term.relation_syntaxP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 8184L)
    public static SubLObject cycl_sentenceP(final SubLObject v_object) {
        return cycl_grammar.cycl_sentence_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 8323L)
    public static SubLObject cycl_open_sentenceP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_sentenceP(v_object) && collection_defns.NIL == el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 8447L)
    public static SubLObject cycl_closed_sentenceP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_sentenceP(v_object) && collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 8566L)
    public static SubLObject cyc_typicality_reference_set_propertyP(final SubLObject v_object) {
        final SubLObject dummy = (SubLObject)collection_defns.$kw49$TERM;
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_sentenceP(v_object) && collection_defns.NIL != cycl_utilities.expression_find(dummy, v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 8810L)
    public static SubLObject el_sentenceP(final SubLObject v_object) {
        return el_grammar.el_sentence_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 8945L)
    public static SubLObject cycl_atomic_sentenceP(final SubLObject v_object) {
        return cycl_grammar.cycl_atomic_sentence_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9098L)
    public static SubLObject cycl_closed_atomic_sentenceP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_atomic_sentenceP(v_object) && collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9231L)
    public static SubLObject cycl_propositional_sentenceP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.closedP(v_object, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != cycl_sentence_askableP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9365L)
    public static SubLObject cycl_sentence_askableP(final SubLObject v_object) {
        return wff.el_wff_syntaxP(v_object, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9455L)
    public static SubLObject cycl_sentence_assertibleP(final SubLObject v_object) {
        return wff.el_wffP(v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9541L)
    public static SubLObject el_sentence_askableP(final SubLObject v_object) {
        return wff.el_wff_syntaxP(v_object, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9629L)
    public static SubLObject el_sentence_assertibleP(final SubLObject v_object) {
        return wff.el_wffP(v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9713L)
    public static SubLObject cycl_non_atomic_term_askableP(final SubLObject v_object) {
        return cycl_grammar.cycl_nat_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 9806L)
    public static SubLObject cycl_non_atomic_term_assertibleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != hl_non_atomic_term_p(v_object) && collection_defns.NIL != wff.el_wftP(cycl_utilities.careful_hl_term_to_el_term(v_object), (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)) || collection_defns.NIL != el_non_atomic_term_assertibleP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 10020L)
    public static SubLObject el_non_atomic_term_askableP(final SubLObject v_object) {
        return el_grammar.el_nat_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 10404L)
    public static SubLObject el_non_atomic_term_assertibleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_grammar.el_nat_p(v_object) && collection_defns.NIL != wff.el_wftP(v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 10834L)
    public static SubLObject cycl_expression_askableP(final SubLObject v_object) {
        return cycl_grammar.cycl_expression_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 10929L)
    public static SubLObject cycl_expression_assertibleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != hl_expression_p(v_object) && collection_defns.NIL != wff.el_wfeP(cycl_utilities.careful_hl_term_to_el_term(v_object), (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)) || collection_defns.NIL != el_expression_assertibleP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 11128L)
    public static SubLObject el_expression_askableP(final SubLObject v_object) {
        return el_grammar.el_expression_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 11642L)
    public static SubLObject el_expression_assertibleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_grammar.el_expression_p(v_object) && collection_defns.NIL != wff.el_wfeP(v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 12209L)
    public static SubLObject cycl_queryP(final SubLObject v_object) {
        return cycl_sentence_askableP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 12296L)
    public static SubLObject cycl_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != hl_assertion_p(v_object) || collection_defns.NIL != el_assertionP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 12470L)
    public static SubLObject cycl_atomic_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cycl_assertionP(v_object) && ((collection_defns.NIL != hl_assertion_p(v_object) && collection_defns.NIL != el_utilities.atomic_sentenceP(assertions_high.assertion_formula(v_object))) || collection_defns.NIL != el_utilities.atomic_sentenceP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 12690L)
    public static SubLObject cycl_gaf_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != assertions_high.gaf_assertionP(v_object) || collection_defns.NIL != czer_meta.el_gaf_assertion_specP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 12820L)
    public static SubLObject cycl_rule_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != assertions_high.rule_assertionP(v_object) || collection_defns.NIL != czer_meta.el_rule_assertion_specP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 12953L)
    public static SubLObject cycl_asserted_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != hl_assertion_p(v_object) && collection_defns.NIL != assertions_high.asserted_assertionP(v_object)) || collection_defns.NIL != czer_meta.el_asserted_assertion_specP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 13133L)
    public static SubLObject cycl_deduced_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != hl_assertion_p(v_object) && collection_defns.NIL != assertions_high.deduced_assertionP(v_object)) || collection_defns.NIL != czer_meta.el_deduced_assertion_specP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 13310L)
    public static SubLObject cycl_nl_semantic_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != hl_assertion_p(v_object) && collection_defns.NIL != assertion_utilities.nl_semantic_assertionP(v_object)) || collection_defns.NIL != czer_meta.el_nl_semantic_assertion_specP(v_object, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 13499L)
    public static SubLObject cycl_canonicalizer_directiveP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != assertions_high.gaf_assertionP(v_object) && collection_defns.NIL != cycl_canonicalizer_directiveP(assertions_high.gaf_formula(v_object))) || (collection_defns.NIL != el_utilities.el_formula_p(v_object) && collection_defns.NIL != cycl_atomic_sentenceP(v_object) && collection_defns.NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), collection_defns.$const75$CanonicalizerDirectivePredicate, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 13802L)
    public static SubLObject cycl_reformulator_directiveP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != assertions_high.gaf_assertionP(v_object) && collection_defns.NIL != cycl_reformulator_directiveP(assertions_high.gaf_formula(v_object))) || (collection_defns.NIL != el_utilities.el_formula_p(v_object) && collection_defns.NIL != cycl_atomic_sentenceP(v_object) && collection_defns.NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), collection_defns.$const77$ReformulatorDirectivePredicate, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 14102L)
    public static SubLObject cycl_reformulator_ruleP(final SubLObject v_object) {
        final SubLObject pred_term = cycl_utilities.formula_arg0(v_object);
        final SubLObject assertion = czer_meta.find_assertion_cycl(v_object, (SubLObject)collection_defns.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != assertions_high.gaf_assertionP(v_object) && collection_defns.NIL != cycl_reformulator_directiveP(assertions_high.gaf_formula(v_object))) || (collection_defns.NIL != el_utilities.el_formula_p(v_object) && collection_defns.NIL != cycl_atomic_sentenceP(v_object) && collection_defns.NIL != cycl_reformulator_ruleP(assertion) && (collection_defns.NIL != isa.isaP(pred_term, collection_defns.$const79$CycLReformulationRulePredicate, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED) || collection_defns.$const80$ist.eql(pred_term))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 14642L)
    public static SubLObject cycl_simplifier_directiveP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((collection_defns.NIL != assertions_high.gaf_assertionP(v_object) && collection_defns.NIL != cycl_simplifier_directiveP(assertions_high.gaf_formula(v_object))) || (collection_defns.NIL != el_utilities.el_formula_p(v_object) && collection_defns.NIL != cycl_atomic_sentenceP(v_object) && collection_defns.NIL != isa.isaP(cycl_utilities.formula_arg0(v_object), collection_defns.$const82$SimplifierDirectivePredicate, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 14936L)
    public static SubLObject hl_assertion_p(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 15015L)
    public static SubLObject el_assertionP(final SubLObject v_object) {
        return czer_meta.el_assertion_specP(v_object, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 15100L)
    public static SubLObject cyc_indexed_term(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != forts.fort_p(v_term) || collection_defns.NIL != cyc_reifiable_nat(v_term) || collection_defns.NIL != cyc_assertion(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 15432L)
    public static SubLObject cyc_assertion(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != assertion_handles.assertion_p(assertion) || collection_defns.NIL != czer_meta.el_assertion_specP(assertion, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 15582L)
    public static SubLObject cyc_gaf_assertion(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != assertions_high.gaf_assertionP(assertion) || collection_defns.NIL != czer_meta.el_gaf_assertion_specP(assertion, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 15746L)
    public static SubLObject cyc_rule_assertion(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != assertions_high.rule_assertionP(assertion) || collection_defns.NIL != czer_meta.el_rule_assertion_specP(assertion, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 15914L)
    public static SubLObject cyc_nl_semantic_assertion(final SubLObject assertion) {
        return assertion_utilities.nl_semantic_assertionP(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16055L)
    public static SubLObject cyc_reifiable_term(final SubLObject v_term) {
        return czer_utilities.reifiable_termP(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16178L)
    public static SubLObject cyc_constant(final SubLObject constant) {
        return constant_handles.constant_p(constant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16281L)
    public static SubLObject cyc_reifiable_nat(final SubLObject nat) {
        return czer_utilities.reifiable_nat_termP(nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16402L)
    public static SubLObject cyc_gaf(final SubLObject gaf) {
        return el_utilities.gafP(gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16494L)
    public static SubLObject cyc_atomic_sentence(final SubLObject sentence) {
        return el_utilities.atomic_sentenceP(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16616L)
    public static SubLObject cyc_first_order_naut(final SubLObject naut) {
        return term.first_order_nautP(naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16746L)
    public static SubLObject cyc_term(final SubLObject v_term) {
        return term.termP(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16834L)
    public static SubLObject cyc_ground_term(final SubLObject v_term) {
        return term.ground_termP(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 16943L)
    public static SubLObject cyc_closed_term(final SubLObject v_term) {
        return term.closed_termP(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17051L)
    public static SubLObject cyc_open_term(final SubLObject v_term) {
        return term.open_termP(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17153L)
    public static SubLObject cyc_real_number(final SubLObject number) {
        return extended_numbers.extended_number_p(number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17344L)
    public static SubLObject cyc_system_real_number(final SubLObject number) {
        return Types.numberp(number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17460L)
    public static SubLObject cyc_positive_number(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_real_number(number) && collection_defns.NIL != extended_numbers.extended_number_plus_p(number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17626L)
    public static SubLObject cyc_negative_number(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_real_number(number) && collection_defns.NIL != extended_numbers.extended_number_minus_p(number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17793L)
    public static SubLObject cyc_non_positive_number(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_real_number(number) && collection_defns.NIL == cyc_positive_number(number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 17970L)
    public static SubLObject cyc_non_negative_number(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_real_number(number) && collection_defns.NIL == cyc_negative_number(number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 18147L)
    public static SubLObject cyc_rational_number(final SubLObject number) {
        return cyc_real_number(number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 18268L)
    public static SubLObject cyc_real_0_100(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_non_negative_number(number) && collection_defns.NIL != extended_numbers.extended_numberLE(number, (SubLObject)collection_defns.$float94$100_0, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 18433L)
    public static SubLObject cyc_real_0_1(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_non_negative_number(number) && collection_defns.NIL != extended_numbers.extended_numberLE(number, (SubLObject)collection_defns.$float96$1_0, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 18592L)
    public static SubLObject cyc_real_minus_1_to_plus_1(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_real_number(number) && collection_defns.NIL != extended_numbers.extended_numberLE(number, (SubLObject)collection_defns.$float96$1_0, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != extended_numbers.extended_numberGE(number, (SubLObject)collection_defns.$float98$_1_0, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 18806L)
    public static SubLObject cyc_real_1_infinity(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_non_negative_number(number) && collection_defns.NIL != extended_numbers.extended_numberGE(number, (SubLObject)collection_defns.$float96$1_0, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 18979L)
    public static SubLObject cyc_nonzero_number(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_negative_number(number) || collection_defns.NIL != cyc_positive_number(number));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 19142L)
    public static SubLObject cyc_system_float(final SubLObject v_float) {
        return Types.floatp(v_float);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 19244L)
    public static SubLObject cyc_integer(final SubLObject integer) {
        return extended_numbers.extended_number_integer_p(integer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 19429L)
    public static SubLObject cyc_system_integer(final SubLObject integer) {
        return Types.integerp(integer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 19541L)
    public static SubLObject cyc_positive_integer(final SubLObject integer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_integer(integer) && collection_defns.NIL != extended_numbers.extended_number_plus_p(integer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 19708L)
    public static SubLObject cyc_prime_numberP(final SubLObject v_object) {
        return number_utilities.prime_numberP(extended_numbers.extended_number_to_subl_real(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 19853L)
    public static SubLObject cyc_maybe_prime_numberP(final SubLObject v_object) {
        if (v_object.eql((SubLObject)collection_defns.ONE_INTEGER)) {
            return (SubLObject)collection_defns.T;
        }
        if (collection_defns.NIL != cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)collection_defns.$sym107$CONSTANT_P), v_object, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)) {
            return (SubLObject)collection_defns.T;
        }
        return number_utilities.prime_numberP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 20232L)
    public static SubLObject cyc_negative_integer(final SubLObject integer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_integer(integer) && integer.isNegative());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 20383L)
    public static SubLObject cyc_non_positive_integer(final SubLObject integer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_integer(integer) && collection_defns.NIL == cyc_positive_integer(integer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 20562L)
    public static SubLObject cyc_non_negative_integer(final SubLObject integer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_integer(integer) && collection_defns.NIL == cyc_negative_integer(integer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 20741L)
    public static SubLObject cyc_even_number(final SubLObject integer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_integer(integer) && collection_defns.NIL != Numbers.evenp(integer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 20881L)
    public static SubLObject cyc_odd_number(final SubLObject integer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != cyc_integer(integer) && collection_defns.NIL != Numbers.oddp(integer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 21018L)
    public static SubLObject cyc_universal_date(final SubLObject universal_date) {
        return numeric_date_utilities.universal_date_p(universal_date);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 21157L)
    public static SubLObject cyc_universal_second(final SubLObject universal_second) {
        return numeric_date_utilities.universal_second_p(universal_second);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 21509L)
    public static SubLObject cyc_set_of_type_necessary(final SubLObject v_set) {
        final SubLObject result = cyc_set_of_type_guts(v_set);
        if (collection_defns.$kw117$AGNOSTIC == result) {
            return (SubLObject)collection_defns.T;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 21861L)
    public static SubLObject cyc_set_of_type_sufficient(final SubLObject v_set) {
        final SubLObject result = cyc_set_of_type_guts(v_set);
        if (collection_defns.$kw117$AGNOSTIC == result) {
            return (SubLObject)collection_defns.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 22225L)
    public static SubLObject cyc_list_of_type_necessary(final SubLObject list) {
        final SubLObject result = cyc_list_of_type_guts(list);
        if (collection_defns.$kw117$AGNOSTIC == result) {
            return (SubLObject)collection_defns.T;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 22570L)
    public static SubLObject cyc_list_of_type_sufficient(final SubLObject list) {
        final SubLObject result = cyc_list_of_type_guts(list);
        if (collection_defns.$kw117$AGNOSTIC == result) {
            return (SubLObject)collection_defns.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 22878L)
    public static SubLObject cyc_set_of_type_guts(final SubLObject v_set) {
        if (collection_defns.NIL != el_utilities.el_empty_set_p(v_set)) {
            return (SubLObject)collection_defns.T;
        }
        if (collection_defns.NIL != extensional_setP(v_set)) {
            final SubLObject set_type = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(set_type)) {
                final SubLObject element_type = kb_mapping_utilities.fpred_value(set_type, collection_defns.$const121$instanceElementType, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (collection_defns.NIL != forts.fort_p(element_type)) {
                    return cyc_set_of_type_internal(v_set, element_type);
                }
            }
        }
        return (SubLObject)collection_defns.$kw117$AGNOSTIC;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 23296L)
    public static SubLObject clear_extensional_setP() {
        final SubLObject cs = collection_defns.$extensional_setP_caching_state$.getGlobalValue();
        if (collection_defns.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 23296L)
    public static SubLObject remove_extensional_setP(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args(collection_defns.$extensional_setP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_object), (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 23296L)
    public static SubLObject extensional_setP_internal(final SubLObject v_object) {
        return isa.quoted_isaP(v_object, collection_defns.$const123$Set_Extensional, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 23296L)
    public static SubLObject extensional_setP(final SubLObject v_object) {
        SubLObject caching_state = collection_defns.$extensional_setP_caching_state$.getGlobalValue();
        if (collection_defns.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)collection_defns.$sym122$EXTENSIONAL_SET_, (SubLObject)collection_defns.$sym124$_EXTENSIONAL_SET__CACHING_STATE_, (SubLObject)collection_defns.$int125$32, (SubLObject)collection_defns.EQUAL, (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)collection_defns.$sym126$CLEAR_EXTENSIONAL_SET_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(extensional_setP_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)collection_defns.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 23694L)
    public static SubLObject cyc_set_of_type_internal(final SubLObject v_set, final SubLObject element_type) {
        if (collection_defns.NIL != el_utilities.el_formula_p(v_set)) {
            final SubLObject functor = cycl_utilities.nat_functor(v_set);
            if (collection_defns.$const127$TheSet.eql(functor)) {
                final SubLObject args = cycl_utilities.nat_args(v_set, (SubLObject)collection_defns.UNPROVIDED);
                return every_in_list_has_type_within_collection_defn(args, element_type);
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 24058L)
    public static SubLObject cyc_list_of_type_guts(final SubLObject list) {
        if (collection_defns.NIL != el_utilities.el_empty_list_p(list)) {
            return (SubLObject)collection_defns.T;
        }
        if (collection_defns.NIL != isa.quoted_isaP(list, collection_defns.$const128$List_Extensional, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED)) {
            final SubLObject list_type = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(list_type)) {
                final SubLObject element_type = kb_mapping_utilities.fpred_value(list_type, collection_defns.$const129$instanceListMemberType, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (collection_defns.NIL != forts.fort_p(element_type)) {
                    return cyc_list_of_type_internal(list, element_type);
                }
            }
        }
        return (SubLObject)collection_defns.$kw117$AGNOSTIC;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 24489L)
    public static SubLObject cyc_list_of_type_internal(final SubLObject list, final SubLObject element_type) {
        if (collection_defns.NIL != el_utilities.el_formula_p(list)) {
            final SubLObject functor = cycl_utilities.nat_functor(list);
            if (collection_defns.$const130$TheList.eql(functor)) {
                final SubLObject args = cycl_utilities.nat_args(list, (SubLObject)collection_defns.UNPROVIDED);
                return every_in_list_has_type_within_collection_defn(args, element_type);
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 24861L)
    public static SubLObject every_in_list_has_type_within_collection_defn(final SubLObject list, final SubLObject collection) {
        SubLObject failedP = (SubLObject)collection_defns.NIL;
        if (collection_defns.NIL == failedP) {
            SubLObject csome_list_var;
            SubLObject v_object;
            for (csome_list_var = list, v_object = (SubLObject)collection_defns.NIL, v_object = csome_list_var.first(); collection_defns.NIL == failedP && collection_defns.NIL != csome_list_var; failedP = (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL == at_defns.quiet_has_typeP(v_object, collection, (SubLObject)collection_defns.UNPROVIDED) && (collection_defns.NIL == wff_macros.within_wffP() || collection_defns.NIL == arg_type.variable_wrt_arg_typeP(v_object))), csome_list_var = csome_list_var.rest(), v_object = csome_list_var.first()) {
                at_defns.clear_defn_space();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL == failedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 25376L)
    public static SubLObject cyc_list_without_repetition(final SubLObject list) {
        if (collection_defns.NIL != el_utilities.el_list_p(list)) {
            return list_utilities.list_without_repetition_p(el_utilities.el_list_items(list), Symbols.symbol_function((SubLObject)collection_defns.EQUAL), (SubLObject)collection_defns.UNPROVIDED);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 25659L)
    public static SubLObject cyc_numeric_string_necessary(final SubLObject string) {
        return string_utilities.partially_numeric_stringP(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 25864L)
    public static SubLObject cyc_numeral_string(final SubLObject string) {
        return string_utilities.digit_stringP(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 26042L)
    public static SubLObject cyc_numeric_string(final SubLObject string) {
        return cyc_numeral_string(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 26150L)
    public static SubLObject cyc_number_string(final SubLObject string) {
        return number_utilities.extended_number_string_p(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 26334L)
    public static SubLObject cyc_zip_code_five_digit(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != string_utilities.digit_stringP(string) && collection_defns.NIL != list_utilities.lengthE(string, (SubLObject)collection_defns.FIVE_INTEGER, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 26565L)
    public static SubLObject cyc_zip_code_nine_digit(final SubLObject string) {
        SubLObject nine_digit_zip_codeP = (SubLObject)collection_defns.NIL;
        if (string.isString() && collection_defns.NIL != list_utilities.lengthE(string, (SubLObject)collection_defns.TEN_INTEGER, (SubLObject)collection_defns.UNPROVIDED)) {
            final SubLObject tokens = string_utilities.string_tokenize(string, (SubLObject)collection_defns.$list137, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
            if (collection_defns.NIL != list_utilities.lengthE(tokens, (SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.UNPROVIDED)) {
                final SubLObject zip = tokens.first();
                final SubLObject ext = conses_high.second(tokens);
                nine_digit_zip_codeP = (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != list_utilities.lengthE(zip, (SubLObject)collection_defns.FIVE_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != list_utilities.lengthE(ext, (SubLObject)collection_defns.FOUR_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != string_utilities.digit_stringP(zip) && collection_defns.NIL != string_utilities.digit_stringP(ext));
            }
        }
        return nine_digit_zip_codeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 27143L)
    public static SubLObject cyc_guid_string_p(final SubLObject string) {
        return Guids.guid_string_p(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 27308L)
    public static SubLObject cyc_naics_code(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != string_utilities.digit_stringP(string) && collection_defns.NIL != list_utilities.lengthLE(string, (SubLObject)collection_defns.SIX_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != list_utilities.lengthGE(string, (SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 27527L)
    public static SubLObject cyc_unicode_denoting_ascii_string_p(final SubLObject string) {
        return unicode_strings.display_vector_string_p(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 27732L)
    public static SubLObject cyc_ascii_string_p(final SubLObject string) {
        return unicode_strings.ascii_string_p(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 27902L)
    public static SubLObject cyc_control_character_free_string_necessary(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL == cycl_string.cycl_string_p(string) || collection_defns.NIL != cycl_string.cycl_string_wXo_control_charsP(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 28220L)
    public static SubLObject cyc_url(final SubLObject v_object) {
        return web_utilities.url_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 28416L)
    public static SubLObject doctor_me_idP(final SubLObject v_object) {
        return numeric_string_of_lengthP(v_object, (SubLObject)collection_defns.ELEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 28554L)
    public static SubLObject numeric_string_of_lengthP(final SubLObject string, final SubLObject length) {
        return (SubLObject)SubLObjectFactory.makeBoolean(length.isNumber() && string.isString() && length.numE(Sequences.length(string)) && collection_defns.NIL != cyc_numeric_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 28728L)
    public static SubLObject clpeP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject clpeP = (SubLObject)collection_defns.NIL;
        final SubLObject _prev_bind_0 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        try {
            wff_utilities.$check_var_typesP$.bind((SubLObject)collection_defns.NIL, thread);
            clpeP = ((collection_defns.NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) ? wff.kwt_wffP(formula, (SubLObject)collection_defns.UNPROVIDED) : wff.el_wffP(formula, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED));
        }
        finally {
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_0, thread);
        }
        return clpeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 29611L)
    public static SubLObject cyc_queryP(final SubLObject formula) {
        return wff.query_okP(formula, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 29686L)
    public static SubLObject cyc_syntactic_formula_arity_ok(final SubLObject formula) {
        return wff.el_wff_syntaxP(formula, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 29881L)
    public static SubLObject cyc_syntactic_formula(final SubLObject formula) {
        return cycl_grammar.cycl_sentence_p(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 30044L)
    public static SubLObject function_expressionP(final SubLObject v_object) {
        return term.function_termP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 30207L)
    public static SubLObject cyc_relation_expressionP(final SubLObject v_object) {
        return el_utilities.relation_expressionP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 30373L)
    public static SubLObject el_variableP(final SubLObject symbol) {
        return cycl_variables.el_varP(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 30501L)
    public static SubLObject cyc_subl_expression(final SubLObject obj) {
        return (SubLObject)collection_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 30765L)
    public static SubLObject cyc_subl_escape(final SubLObject obj) {
        return el_utilities.subl_escape_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 30928L)
    public static SubLObject cyc_subl_template(final SubLObject obj) {
        return (SubLObject)collection_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 31152L)
    public static SubLObject ibqeP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != extended_numbers.extended_number_p(v_term)) {
            return (SubLObject)collection_defns.T;
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p() && collection_defns.NIL != el_utilities.el_formula_p(v_term)) {
            if (collection_defns.NIL != el_utilities.formula_arityE(v_term, (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.UNPROVIDED)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != extended_numbers.possibly_infinite_or_extended_number_p(cycl_utilities.formula_arg1(v_term, (SubLObject)collection_defns.UNPROVIDED)) && collection_defns.NIL != unit_of_measureP(cycl_utilities.formula_operator(v_term), mt));
            }
            if (collection_defns.NIL != el_utilities.formula_arityE(v_term, (SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.UNPROVIDED)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != extended_numbers.possibly_infinite_or_extended_number_p(cycl_utilities.formula_arg1(v_term, (SubLObject)collection_defns.UNPROVIDED)) && collection_defns.NIL != unit_of_measureP(cycl_utilities.formula_operator(v_term), mt) && collection_defns.NIL != extended_numbers.possibly_infinite_or_extended_numberLE(cycl_utilities.formula_arg1(v_term, (SubLObject)collection_defns.UNPROVIDED), cycl_utilities.formula_arg2(v_term, (SubLObject)collection_defns.UNPROVIDED)));
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 32245L)
    public static SubLObject cyc_ibqe(final SubLObject v_term) {
        return ibqeP(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 32323L)
    public static SubLObject scalar_point_valueP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != extended_numbers.extended_number_p(v_term)) {
            return (SubLObject)collection_defns.T;
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p() && collection_defns.NIL != el_utilities.el_formula_p(v_term) && collection_defns.NIL == el_utilities.formula_with_sequence_varP(v_term)) {
            final SubLObject length = el_utilities.formula_length(v_term, (SubLObject)collection_defns.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(length.numGE((SubLObject)collection_defns.TWO_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.second(v_term)) && collection_defns.NIL != unit_of_measureP(v_term.first(), mt) && (length.numE((SubLObject)collection_defns.TWO_INTEGER) || (length.numE((SubLObject)collection_defns.THREE_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.third(v_term)) && collection_defns.NIL != extended_numbers.extended_numberE(conses_high.third(v_term), conses_high.second(v_term), (SubLObject)collection_defns.UNPROVIDED))));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 32849L)
    public static SubLObject scalar_integral_valueP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != extended_numbers.extended_number_integer_p(v_term)) {
            return (SubLObject)collection_defns.T;
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p() && collection_defns.NIL != formula_p_function_isa_instance_of(v_term, collection_defns.$const158$UnitOfMeasure, mt)) {
            final SubLObject length = el_utilities.formula_length(v_term, (SubLObject)collection_defns.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(length.numGE((SubLObject)collection_defns.TWO_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_integer_p(conses_high.second(v_term)) && (length.numE((SubLObject)collection_defns.TWO_INTEGER) || (length.numE((SubLObject)collection_defns.THREE_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_integer_p(conses_high.third(v_term)) && collection_defns.NIL != extended_numbers.extended_numberE(conses_high.third(v_term), conses_high.second(v_term), (SubLObject)collection_defns.UNPROVIDED))));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 33354L)
    public static SubLObject non_negative_scalar_intervalP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != extended_numbers.extended_number_p(v_term)) {
            return extended_numbers.extended_numberGE(v_term, (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED);
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p() && collection_defns.NIL != el_utilities.el_formula_p(v_term) && collection_defns.NIL == el_utilities.formula_with_sequence_varP(v_term)) {
            final SubLObject length = el_utilities.formula_length(v_term, (SubLObject)collection_defns.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(length.numGE((SubLObject)collection_defns.TWO_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.second(v_term)) && collection_defns.NIL != extended_numbers.extended_numberGE(conses_high.second(v_term), (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != unit_of_measureP(v_term.first(), mt) && (length.numE((SubLObject)collection_defns.TWO_INTEGER) || (length.numE((SubLObject)collection_defns.THREE_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.third(v_term)) && collection_defns.NIL != extended_numbers.extended_numberGE(conses_high.third(v_term), conses_high.second(v_term), (SubLObject)collection_defns.UNPROVIDED))));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 33957L)
    public static SubLObject positive_scalar_intervalP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != extended_numbers.extended_number_p(v_term)) {
            return extended_numbers.extended_numberG(v_term, (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED);
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p() && collection_defns.NIL != el_utilities.el_formula_p(v_term) && collection_defns.NIL == el_utilities.formula_with_sequence_varP(v_term)) {
            final SubLObject length = el_utilities.formula_length(v_term, (SubLObject)collection_defns.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(length.numGE((SubLObject)collection_defns.TWO_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.second(v_term)) && collection_defns.NIL != extended_numbers.extended_numberG(conses_high.second(v_term), (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != unit_of_measureP(v_term.first(), mt) && (length.numE((SubLObject)collection_defns.TWO_INTEGER) || (length.numE((SubLObject)collection_defns.THREE_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.third(v_term)) && collection_defns.NIL != extended_numbers.extended_numberGE(conses_high.third(v_term), conses_high.second(v_term), (SubLObject)collection_defns.UNPROVIDED))));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 34554L)
    public static SubLObject negative_scalar_intervalP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != extended_numbers.extended_number_p(v_term)) {
            return extended_numbers.extended_numberL(v_term, (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED);
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p() && collection_defns.NIL != el_utilities.el_formula_p(v_term) && collection_defns.NIL == el_utilities.formula_with_sequence_varP(v_term)) {
            final SubLObject length = el_utilities.formula_length(v_term, (SubLObject)collection_defns.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(length.numGE((SubLObject)collection_defns.TWO_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.second(v_term)) && collection_defns.NIL != extended_numbers.extended_numberL(conses_high.second(v_term), (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != unit_of_measureP(v_term.first(), mt) && (length.numE((SubLObject)collection_defns.TWO_INTEGER) || (length.numE((SubLObject)collection_defns.THREE_INTEGER) && collection_defns.NIL != extended_numbers.extended_number_p(conses_high.third(v_term)) && collection_defns.NIL != extended_numbers.extended_numberL(conses_high.third(v_term), (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED) && collection_defns.NIL != extended_numbers.extended_numberGE(conses_high.third(v_term), conses_high.second(v_term), (SubLObject)collection_defns.UNPROVIDED))));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 35194L)
    public static SubLObject formula_p_function_isa_instance_of(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.el_formula_p(v_term) && collection_defns.NIL == el_utilities.formula_with_sequence_varP(v_term) && collection_defns.NIL != isa.isaP(v_term.first(), col, mt, (SubLObject)collection_defns.UNPROVIDED));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 35502L)
    public static SubLObject unit_of_measureP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (collection_defns.NIL != kb_control_vars.quant_kb_loaded_p()) {
            return isa.isaP(v_term, collection_defns.$const158$UnitOfMeasure, mt, (SubLObject)collection_defns.UNPROVIDED);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 35637L)
    public static SubLObject cyc_fractional_measurable_quantity_simple_p(final SubLObject v_term) {
        return cycl_fractional_measurable_quantity_simple_p(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 35898L)
    public static SubLObject cycl_fractional_measurable_quantity_simple_p(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.possibly_naut_p(v_term) && collection_defns.NIL != unit_of_measureP(cycl_utilities.naut_functor(v_term), mt) && (collection_defns.NIL != simple_fractionP(cycl_utilities.naut_arg1(v_term, (SubLObject)collection_defns.UNPROVIDED), mt) || collection_defns.NIL != simple_fractionP(cycl_utilities.naut_arg2(v_term, (SubLObject)collection_defns.UNPROVIDED), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 36170L)
    public static SubLObject simple_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, collection_defns.$const164$SimpleFraction, mt, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 36274L)
    public static SubLObject cyc_fractional_measurable_quantity_mixed_p(final SubLObject v_term) {
        return cycl_fractional_measurable_quantity_mixed_p(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 36530L)
    public static SubLObject cycl_fractional_measurable_quantity_mixed_p(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.possibly_naut_p(v_term) && collection_defns.NIL != unit_of_measureP(cycl_utilities.naut_functor(v_term), mt) && (collection_defns.NIL != mixed_fractionP(cycl_utilities.naut_arg1(v_term, (SubLObject)collection_defns.UNPROVIDED), mt) || collection_defns.NIL != mixed_fractionP(cycl_utilities.naut_arg2(v_term, (SubLObject)collection_defns.UNPROVIDED), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 36799L)
    public static SubLObject mixed_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return formula_pattern_match.formula_matches_pattern(v_term, (SubLObject)collection_defns.$list166);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 36948L)
    public static SubLObject negative_mixed_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return formula_pattern_match.formula_matches_pattern(v_term, (SubLObject)collection_defns.$list167);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 37114L)
    public static SubLObject cyc_fractional_measurable_quantity_decimal_p(final SubLObject v_term) {
        return cycl_fractional_measurable_quantity_decimal_p(v_term, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 37384L)
    public static SubLObject cycl_fractional_measurable_quantity_decimal_p(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.possibly_naut_p(v_term) && collection_defns.NIL != unit_of_measureP(cycl_utilities.naut_functor(v_term), mt) && (collection_defns.NIL != decimal_fractionP(cycl_utilities.naut_arg1(v_term, (SubLObject)collection_defns.UNPROVIDED), mt) || collection_defns.NIL != decimal_fractionP(cycl_utilities.naut_arg2(v_term, (SubLObject)collection_defns.UNPROVIDED), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 37659L)
    public static SubLObject decimal_fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, collection_defns.$const169$DecimalFraction, mt, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 37765L)
    public static SubLObject fractionP(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL != el_utilities.possibly_naut_p(v_term) && collection_defns.NIL != genls.any_specP(collection_defns.$const170$Fraction, kb_accessors.result_isa(cycl_utilities.naut_functor(v_term), mt), (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 37959L)
    public static SubLObject fraction_strong(final SubLObject v_term, SubLObject mt) {
        if (mt == collection_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, collection_defns.$const170$Fraction, mt, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 39098L)
    public static SubLObject term_setP(final SubLObject terms) {
        if (collection_defns.NIL != el_utilities.el_formula_p(terms) && collection_defns.NIL == el_utilities.formula_with_sequence_varP(terms) && collection_defns.NIL == list_utilities.duplicatesP(terms, Symbols.symbol_function((SubLObject)collection_defns.EQUAL), (SubLObject)collection_defns.UNPROVIDED)) {
            SubLObject not_a_termP = (SubLObject)collection_defns.NIL;
            if (collection_defns.NIL == not_a_termP) {
                SubLObject csome_list_var = terms;
                SubLObject v_term = (SubLObject)collection_defns.NIL;
                v_term = csome_list_var.first();
                while (collection_defns.NIL == not_a_termP && collection_defns.NIL != csome_list_var) {
                    if (collection_defns.NIL == term.first_order_termP(v_term)) {
                        not_a_termP = (SubLObject)collection_defns.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL == not_a_termP);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 39505L)
    public static SubLObject cycl_var_listP(final SubLObject v_object) {
        if (collection_defns.NIL == v_object || collection_defns.NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject not_cycl_var_listP = (SubLObject)collection_defns.NIL;
            if (collection_defns.NIL == not_cycl_var_listP) {
                SubLObject csome_list_var = v_object;
                SubLObject element = (SubLObject)collection_defns.NIL;
                element = csome_list_var.first();
                while (collection_defns.NIL == not_cycl_var_listP && collection_defns.NIL != csome_list_var) {
                    if (collection_defns.NIL == cycl_variables.el_varP(element) && collection_defns.NIL == cycl_variables.kb_varP(element)) {
                        not_cycl_var_listP = (SubLObject)collection_defns.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    element = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL == not_cycl_var_listP);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 39955L)
    public static SubLObject cyc_el_var_listP(final SubLObject v_object) {
        return el_utilities.el_var_listP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 40107L)
    public static SubLObject cyc_system_atom(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!v_object.isCons() && collection_defns.NIL == forts.fort_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 40339L)
    public static SubLObject cyc_list_of_lists(final SubLObject v_object) {
        if (collection_defns.NIL == el_utilities.el_formula_p(v_object)) {
            return (SubLObject)collection_defns.NIL;
        }
        SubLObject failedP = (SubLObject)collection_defns.NIL;
        final SubLObject terms = cycl_utilities.formula_terms(v_object, (SubLObject)collection_defns.$kw185$IGNORE);
        SubLObject rest;
        SubLObject item;
        for (rest = (SubLObject)collection_defns.NIL, rest = terms; collection_defns.NIL == failedP && collection_defns.NIL != rest; rest = rest.rest()) {
            item = rest.first();
            if (!item.isList()) {
                failedP = (SubLObject)collection_defns.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(collection_defns.NIL == failedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 41135L)
    public static SubLObject cyc_string_is_length(final SubLObject string) {
        if (string.isString()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, collection_defns.$const188$instanceListLength, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (length.isInteger()) {
                    return Numbers.numE(length, Sequences.length(string));
                }
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 41627L)
    public static SubLObject cyc_string_is_minimum_length(final SubLObject string) {
        if (string.isString()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, collection_defns.$const190$instanceListMinLength, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (length.isInteger()) {
                    return Numbers.numLE(length, Sequences.length(string));
                }
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 42139L)
    public static SubLObject cyc_string_is_maximum_length(final SubLObject string) {
        if (string.isString()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, collection_defns.$const192$instanceListMaxLength, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (length.isInteger()) {
                    return Numbers.numGE(length, Sequences.length(string));
                }
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 42628L)
    public static SubLObject cyc_list_is_length(final SubLObject list) {
        if (list.isList()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, collection_defns.$const188$instanceListLength, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (length.isInteger()) {
                    return cyc_list_is_length_internal(list, length);
                }
                return (SubLObject)collection_defns.T;
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 43008L)
    public static SubLObject cyc_list_is_length_internal(final SubLObject list, final SubLObject length) {
        if (!list.isCons()) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject functor = cycl_utilities.nat_functor(list);
        if (!functor.eql(collection_defns.$const130$TheList)) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject v_arity = cycl_utilities.nat_arity(list, (SubLObject)collection_defns.UNPROVIDED);
        return Numbers.numE(v_arity, length);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 43316L)
    public static SubLObject rtp_syntactic_constraint(final SubLObject v_term) {
        return rtp_type_checkers.valid_rtp_syntactic_constraintP(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 43516L)
    public static SubLObject cyc_subl_query_property_p(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.subl_escape_p(v_object)) {
            return inference_datastructures_enumerated_types.query_property_p(el_utilities.subl_escape_subl(v_object));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 43786L)
    public static SubLObject cyc_subl_tv_p(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.subl_escape_p(v_object)) {
            return enumeration_types.tv_p(el_utilities.subl_escape_subl(v_object));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 43888L)
    public static SubLObject cyc_subl_hl_support_module_p(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.subl_escape_p(v_object)) {
            return hl_supports.hl_support_module_p(el_utilities.subl_escape_subl(v_object));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44035L)
    public static SubLObject cyc_subl_asserted_argument_token_p(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.subl_escape_p(v_object)) {
            return arguments.asserted_argument_token_p(el_utilities.subl_escape_subl(v_object));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44200L)
    public static SubLObject cyc_subl_kct_metric_identifier_p(final SubLObject v_object) {
        if (collection_defns.NIL != el_utilities.subl_escape_p(v_object)) {
            return ctest_macros.ctest_metric_identifier_p(el_utilities.subl_escape_subl(v_object));
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44564L)
    public static SubLObject cyc_8_byte_integer(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isInteger() && v_term.numG(collection_defns.$8byteinteger_lower_bound$.getGlobalValue()) && v_term.numL(collection_defns.$8byteinteger_upper_bound$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 44873L)
    public static SubLObject cyc_4_byte_integer(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isInteger() && v_term.numG(collection_defns.$4byteinteger_lower_bound$.getGlobalValue()) && v_term.numL(collection_defns.$4byteinteger_upper_bound$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45181L)
    public static SubLObject cyc_2_byte_integer(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isInteger() && v_term.numG(collection_defns.$2byteinteger_lower_bound$.getGlobalValue()) && v_term.numL(collection_defns.$2byteinteger_upper_bound$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45487L)
    public static SubLObject cyc_1_byte_integer(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isInteger() && v_term.numG(collection_defns.$1byteinteger_lower_bound$.getGlobalValue()) && v_term.numL(collection_defns.$1byteinteger_upper_bound$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45661L)
    public static SubLObject cyc_bit_datatype(final SubLObject v_term) {
        return isa.isaP(v_term, collection_defns.$const206$BitData, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45738L)
    public static SubLObject cyc_bit_string(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isList() && collection_defns.NIL != list_utilities.every_in_list((SubLObject)collection_defns.$sym207$CYC_BIT_DATATYPE, v_term, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 45868L)
    public static SubLObject cyc_ip4_address(final SubLObject v_term) {
        if (!v_term.isString()) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject parts = string_utilities.string_tokenize(v_term, (SubLObject)collection_defns.$list209, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
        if (collection_defns.NIL == list_utilities.lengthE(parts, (SubLObject)collection_defns.FOUR_INTEGER, (SubLObject)collection_defns.UNPROVIDED)) {
            return (SubLObject)collection_defns.NIL;
        }
        SubLObject cdolist_list_var = parts;
        SubLObject part = (SubLObject)collection_defns.NIL;
        part = cdolist_list_var.first();
        while (collection_defns.NIL != cdolist_list_var) {
            if (collection_defns.NIL != string_utilities.empty_string_p(part)) {
                return (SubLObject)collection_defns.NIL;
            }
            final SubLObject num = string_utilities.string_to_integer(part);
            if (!num.isInteger() || !num.numL((SubLObject)collection_defns.$int210$256) || !num.numGE((SubLObject)collection_defns.ZERO_INTEGER)) {
                return (SubLObject)collection_defns.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return (SubLObject)collection_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 46360L)
    public static SubLObject cyc_ip4_network_address(final SubLObject v_term) {
        if (!v_term.isString()) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject split_subnet = string_utilities.string_tokenize(v_term, (SubLObject)collection_defns.$list212, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
        if (collection_defns.NIL == list_utilities.lengthLE(split_subnet, (SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.UNPROVIDED) || collection_defns.NIL == list_utilities.lengthG(split_subnet, (SubLObject)collection_defns.ZERO_INTEGER, (SubLObject)collection_defns.UNPROVIDED)) {
            return (SubLObject)collection_defns.NIL;
        }
        if (collection_defns.NIL != list_utilities.singletonP(split_subnet)) {
            final SubLObject address = split_subnet.first();
            return cyc_ip4_address(address);
        }
        final SubLObject subnet_part = conses_high.second(split_subnet);
        if (collection_defns.NIL != string_utilities.empty_string_p(subnet_part)) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject subnetmask = string_utilities.string_to_integer(subnet_part);
        if (!subnetmask.isInteger()) {
            return (SubLObject)collection_defns.NIL;
        }
        if (subnetmask.numGE((SubLObject)collection_defns.ZERO_INTEGER) && subnetmask.numL((SubLObject)collection_defns.$int213$33)) {
            final SubLObject address2 = split_subnet.first();
            return cyc_ip4_address(address2);
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 47400L)
    public static SubLObject cyc_list_is_minimum_length(final SubLObject list) {
        if (list.isList()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, collection_defns.$const190$instanceListMinLength, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (length.isInteger()) {
                    return cyc_list_is_minimum_length_internal(list, length);
                }
                return (SubLObject)collection_defns.T;
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 47806L)
    public static SubLObject cyc_list_is_minimum_length_internal(final SubLObject list, final SubLObject length) {
        if (!list.isCons()) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject functor = cycl_utilities.nat_functor(list);
        if (!functor.eql(collection_defns.$const130$TheList)) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject v_arity = cycl_utilities.nat_arity(list, (SubLObject)collection_defns.UNPROVIDED);
        return Numbers.numGE(v_arity, length);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 48189L)
    public static SubLObject cyc_list_is_maximum_length(final SubLObject list) {
        if (list.isList()) {
            final SubLObject defn_collection = at_vars.defn_collection();
            if (collection_defns.NIL != forts.fort_p(defn_collection)) {
                final SubLObject length = kb_mapping_utilities.fpred_value(defn_collection, collection_defns.$const192$instanceListMaxLength, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED);
                if (length.isInteger()) {
                    return cyc_list_is_maximum_length_internal(list, length);
                }
                return (SubLObject)collection_defns.T;
            }
        }
        return (SubLObject)collection_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 48595L)
    public static SubLObject cyc_list_is_maximum_length_internal(final SubLObject list, final SubLObject length) {
        if (!list.isCons()) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject functor = cycl_utilities.nat_functor(list);
        if (!functor.eql(collection_defns.$const130$TheList)) {
            return (SubLObject)collection_defns.NIL;
        }
        final SubLObject v_arity = cycl_utilities.nat_arity(list, (SubLObject)collection_defns.UNPROVIDED);
        return Numbers.numLE(v_arity, length);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 48912L)
    public static SubLObject cyc_addition_expression(final SubLObject expression) {
        return math_expression_utilities.math_addition_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 49149L)
    public static SubLObject cyc_subtraction_expression(final SubLObject expression) {
        return math_expression_utilities.math_subtraction_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 49314L)
    public static SubLObject cyc_multiplication_expression(final SubLObject expression) {
        return math_expression_utilities.math_multiplication_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 49488L)
    public static SubLObject cyc_division_expression(final SubLObject expression) {
        return math_expression_utilities.math_division_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 49644L)
    public static SubLObject cyc_exponentiation_expression(final SubLObject expression) {
        return math_expression_utilities.math_exponentiation_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 49818L)
    public static SubLObject cyc_nth_root_expression(final SubLObject expression) {
        return math_expression_utilities.math_nth_root_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 49973L)
    public static SubLObject cyc_enclosed_math_expression(final SubLObject expression) {
        return math_expression_utilities.math_enclosed_math_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 50144L)
    public static SubLObject cyc_univariate_linear_equation(final SubLObject expression) {
        return math_expression_utilities.math_equation_univariate_linearP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/collection-defns.lisp", position = 50320L)
    public static SubLObject test_math_expression_fn_collection_defns(final SubLObject v_term, final SubLObject col) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(collection_defns.$const225$isa, v_term, col), (SubLObject)collection_defns.UNPROVIDED, (SubLObject)collection_defns.UNPROVIDED));
    }
    
    public static SubLObject declare_collection_defns_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_individual_necessary", "CYC-INDIVIDUAL-NECESSARY", 1, 0, false);
        new $cyc_individual_necessary$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_kappa_predicate_by_arity", "CYC-KAPPA-PREDICATE-BY-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "clear_cached_relation_type_arity", "CLEAR-CACHED-RELATION-TYPE-ARITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "remove_cached_relation_type_arity", "REMOVE-CACHED-RELATION-TYPE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cached_relation_type_arity_internal", "CACHED-RELATION-TYPE-ARITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cached_relation_type_arity", "CACHED-RELATION-TYPE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_expressionP", "CYCL-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_expressionP", "EL-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "hl_expression_p", "HL-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_open_denotational_termP", "CYCL-OPEN-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_denotational_termP", "CYCL-CLOSED-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_reifiable_denotational_termP", "CYCL-REIFIABLE-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_reified_denotational_termP", "CYCL-REIFIED-DENOTATIONAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "hl_closed_denotational_term_p", "HL-CLOSED-DENOTATIONAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_represented_atomic_term_p", "CYCL-REPRESENTED-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_represented_termP", "CYCL-REPRESENTED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_term_p", "CYC-SYSTEM-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_character_p", "CYC-SYSTEM-CHARACTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_string_p", "CYC-SYSTEM-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_real_number_p", "CYC-SYSTEM-REAL-NUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_non_variable_symbol_p", "CYC-SYSTEM-NON-VARIABLE-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_subl_symbol_p", "CYCL-SUBL-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_atomic_term_p", "CYCL-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_atomic_term_p", "CYCL-CLOSED-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "hl_non_atomic_term_p", "HL-NON-ATOMIC-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_non_atomic_termP", "CYCL-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_non_atomic_termP", "EL-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "hl_indexed_term_p", "HL-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_indexed_termP", "CYCL-INDEXED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_open_non_atomic_termP", "CYCL-OPEN-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_non_atomic_termP", "CYCL-CLOSED-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_reifiable_non_atomic_termP", "CYCL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_non_atomic_reified_termP", "CYCL-NON-ATOMIC-REIFIED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_reifiable_non_atomic_termP", "EL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_expressionP", "CYCL-CLOSED-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_open_expressionP", "CYCL-OPEN-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_formulaP", "CYCL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_open_formulaP", "CYCL-OPEN-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_formulaP", "CYCL-CLOSED-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "hl_formula_p", "HL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_unbound_relation_formula_p", "CYCL-UNBOUND-RELATION-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_sentenceP", "CYCL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_open_sentenceP", "CYCL-OPEN-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_sentenceP", "CYCL-CLOSED-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_typicality_reference_set_propertyP", "CYC-TYPICALITY-REFERENCE-SET-PROPERTY?", 1, 0, false);
        new $cyc_typicality_reference_set_propertyP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_sentenceP", "EL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_atomic_sentenceP", "CYCL-ATOMIC-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_closed_atomic_sentenceP", "CYCL-CLOSED-ATOMIC-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_propositional_sentenceP", "CYCL-PROPOSITIONAL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_sentence_askableP", "CYCL-SENTENCE-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_sentence_assertibleP", "CYCL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        new $cycl_sentence_assertibleP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_sentence_askableP", "EL-SENTENCE-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_sentence_assertibleP", "EL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_non_atomic_term_askableP", "CYCL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_non_atomic_term_assertibleP", "CYCL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_non_atomic_term_askableP", "EL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_non_atomic_term_assertibleP", "EL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_expression_askableP", "CYCL-EXPRESSION-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_expression_assertibleP", "CYCL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_expression_askableP", "EL-EXPRESSION-ASKABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_expression_assertibleP", "EL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_queryP", "CYCL-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_assertionP", "CYCL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_atomic_assertionP", "CYCL-ATOMIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_gaf_assertionP", "CYCL-GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_rule_assertionP", "CYCL-RULE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_asserted_assertionP", "CYCL-ASSERTED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_deduced_assertionP", "CYCL-DEDUCED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_nl_semantic_assertionP", "CYCL-NL-SEMANTIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_canonicalizer_directiveP", "CYCL-CANONICALIZER-DIRECTIVE?", 1, 0, false);
        new $cycl_canonicalizer_directiveP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_reformulator_directiveP", "CYCL-REFORMULATOR-DIRECTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_reformulator_ruleP", "CYCL-REFORMULATOR-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_simplifier_directiveP", "CYCL-SIMPLIFIER-DIRECTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "hl_assertion_p", "HL-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_assertionP", "EL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_indexed_term", "CYC-INDEXED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_assertion", "CYC-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_gaf_assertion", "CYC-GAF-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_rule_assertion", "CYC-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_nl_semantic_assertion", "CYC-NL-SEMANTIC-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_reifiable_term", "CYC-REIFIABLE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_constant", "CYC-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_reifiable_nat", "CYC-REIFIABLE-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_gaf", "CYC-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_atomic_sentence", "CYC-ATOMIC-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_first_order_naut", "CYC-FIRST-ORDER-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_term", "CYC-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_ground_term", "CYC-GROUND-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_closed_term", "CYC-CLOSED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_open_term", "CYC-OPEN-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_real_number", "CYC-REAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_real_number", "CYC-SYSTEM-REAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_positive_number", "CYC-POSITIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_negative_number", "CYC-NEGATIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_non_positive_number", "CYC-NON-POSITIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_non_negative_number", "CYC-NON-NEGATIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_rational_number", "CYC-RATIONAL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_real_0_100", "CYC-REAL-0-100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_real_0_1", "CYC-REAL-0-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_real_minus_1_to_plus_1", "CYC-REAL-MINUS-1-TO-PLUS-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_real_1_infinity", "CYC-REAL-1-INFINITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_nonzero_number", "CYC-NONZERO-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_float", "CYC-SYSTEM-FLOAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_integer", "CYC-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_integer", "CYC-SYSTEM-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_positive_integer", "CYC-POSITIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_prime_numberP", "CYC-PRIME-NUMBER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_maybe_prime_numberP", "CYC-MAYBE-PRIME-NUMBER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_negative_integer", "CYC-NEGATIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_non_positive_integer", "CYC-NON-POSITIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_non_negative_integer", "CYC-NON-NEGATIVE-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_even_number", "CYC-EVEN-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_odd_number", "CYC-ODD-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_universal_date", "CYC-UNIVERSAL-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_universal_second", "CYC-UNIVERSAL-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_set_of_type_necessary", "CYC-SET-OF-TYPE-NECESSARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_set_of_type_sufficient", "CYC-SET-OF-TYPE-SUFFICIENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_of_type_necessary", "CYC-LIST-OF-TYPE-NECESSARY", 1, 0, false);
        new $cyc_list_of_type_necessary$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_of_type_sufficient", "CYC-LIST-OF-TYPE-SUFFICIENT", 1, 0, false);
        new $cyc_list_of_type_sufficient$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_set_of_type_guts", "CYC-SET-OF-TYPE-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "clear_extensional_setP", "CLEAR-EXTENSIONAL-SET?", 0, 0, false);
        new $clear_extensional_setP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "remove_extensional_setP", "REMOVE-EXTENSIONAL-SET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "extensional_setP_internal", "EXTENSIONAL-SET?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "extensional_setP", "EXTENSIONAL-SET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_set_of_type_internal", "CYC-SET-OF-TYPE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_of_type_guts", "CYC-LIST-OF-TYPE-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_of_type_internal", "CYC-LIST-OF-TYPE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "every_in_list_has_type_within_collection_defn", "EVERY-IN-LIST-HAS-TYPE-WITHIN-COLLECTION-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_without_repetition", "CYC-LIST-WITHOUT-REPETITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_numeric_string_necessary", "CYC-NUMERIC-STRING-NECESSARY", 1, 0, false);
        new $cyc_numeric_string_necessary$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_numeral_string", "CYC-NUMERAL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_numeric_string", "CYC-NUMERIC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_number_string", "CYC-NUMBER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_zip_code_five_digit", "CYC-ZIP-CODE-FIVE-DIGIT", 1, 0, false);
        new $cyc_zip_code_five_digit$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_zip_code_nine_digit", "CYC-ZIP-CODE-NINE-DIGIT", 1, 0, false);
        new $cyc_zip_code_nine_digit$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_guid_string_p", "CYC-GUID-STRING-P", 1, 0, false);
        new $cyc_guid_string_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_naics_code", "CYC-NAICS-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_unicode_denoting_ascii_string_p", "CYC-UNICODE-DENOTING-ASCII-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_ascii_string_p", "CYC-ASCII-STRING-P", 1, 0, false);
        new $cyc_ascii_string_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_control_character_free_string_necessary", "CYC-CONTROL-CHARACTER-FREE-STRING-NECESSARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_url", "CYC-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "doctor_me_idP", "DOCTOR-ME-ID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "numeric_string_of_lengthP", "NUMERIC-STRING-OF-LENGTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "clpeP", "CLPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_queryP", "CYC-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_syntactic_formula_arity_ok", "CYC-SYNTACTIC-FORMULA-ARITY-OK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_syntactic_formula", "CYC-SYNTACTIC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "function_expressionP", "FUNCTION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_relation_expressionP", "CYC-RELATION-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "el_variableP", "EL-VARIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_expression", "CYC-SUBL-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_escape", "CYC-SUBL-ESCAPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_template", "CYC-SUBL-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "ibqeP", "IBQE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_ibqe", "CYC-IBQE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "scalar_point_valueP", "SCALAR-POINT-VALUE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "scalar_integral_valueP", "SCALAR-INTEGRAL-VALUE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "non_negative_scalar_intervalP", "NON-NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "positive_scalar_intervalP", "POSITIVE-SCALAR-INTERVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "negative_scalar_intervalP", "NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "formula_p_function_isa_instance_of", "FORMULA-P-FUNCTION-ISA-INSTANCE-OF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "unit_of_measureP", "UNIT-OF-MEASURE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_fractional_measurable_quantity_simple_p", "CYC-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_fractional_measurable_quantity_simple_p", "CYCL-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "simple_fractionP", "SIMPLE-FRACTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_fractional_measurable_quantity_mixed_p", "CYC-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_fractional_measurable_quantity_mixed_p", "CYCL-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "mixed_fractionP", "MIXED-FRACTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "negative_mixed_fractionP", "NEGATIVE-MIXED-FRACTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_fractional_measurable_quantity_decimal_p", "CYC-FRACTIONAL-MEASURABLE-QUANTITY-DECIMAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_fractional_measurable_quantity_decimal_p", "CYCL-FRACTIONAL-MEASURABLE-QUANTITY-DECIMAL-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "decimal_fractionP", "DECIMAL-FRACTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "fractionP", "FRACTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "fraction_strong", "FRACTION-STRONG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "term_setP", "TERM-SET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cycl_var_listP", "CYCL-VAR-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_el_var_listP", "CYC-EL-VAR-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_system_atom", "CYC-SYSTEM-ATOM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_of_lists", "CYC-LIST-OF-LISTS", 1, 0, false);
        new $cyc_list_of_lists$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_string_is_length", "CYC-STRING-IS-LENGTH", 1, 0, false);
        new $cyc_string_is_length$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_string_is_minimum_length", "CYC-STRING-IS-MINIMUM-LENGTH", 1, 0, false);
        new $cyc_string_is_minimum_length$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_string_is_maximum_length", "CYC-STRING-IS-MAXIMUM-LENGTH", 1, 0, false);
        new $cyc_string_is_maximum_length$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_is_length", "CYC-LIST-IS-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_is_length_internal", "CYC-LIST-IS-LENGTH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "rtp_syntactic_constraint", "RTP-SYNTACTIC-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_query_property_p", "CYC-SUBL-QUERY-PROPERTY-P", 1, 0, false);
        new $cyc_subl_query_property_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_tv_p", "CYC-SUBL-TV-P", 1, 0, false);
        new $cyc_subl_tv_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_hl_support_module_p", "CYC-SUBL-HL-SUPPORT-MODULE-P", 1, 0, false);
        new $cyc_subl_hl_support_module_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_asserted_argument_token_p", "CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subl_kct_metric_identifier_p", "CYC-SUBL-KCT-METRIC-IDENTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_8_byte_integer", "CYC-8-BYTE-INTEGER", 1, 0, false);
        new $cyc_8_byte_integer$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_4_byte_integer", "CYC-4-BYTE-INTEGER", 1, 0, false);
        new $cyc_4_byte_integer$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_2_byte_integer", "CYC-2-BYTE-INTEGER", 1, 0, false);
        new $cyc_2_byte_integer$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_1_byte_integer", "CYC-1-BYTE-INTEGER", 1, 0, false);
        new $cyc_1_byte_integer$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_bit_datatype", "CYC-BIT-DATATYPE", 1, 0, false);
        new $cyc_bit_datatype$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_bit_string", "CYC-BIT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_ip4_address", "CYC-IP4-ADDRESS", 1, 0, false);
        new $cyc_ip4_address$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_ip4_network_address", "CYC-IP4-NETWORK-ADDRESS", 1, 0, false);
        new $cyc_ip4_network_address$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_is_minimum_length", "CYC-LIST-IS-MINIMUM-LENGTH", 1, 0, false);
        new $cyc_list_is_minimum_length$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_is_minimum_length_internal", "CYC-LIST-IS-MINIMUM-LENGTH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_is_maximum_length", "CYC-LIST-IS-MAXIMUM-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_list_is_maximum_length_internal", "CYC-LIST-IS-MAXIMUM-LENGTH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_addition_expression", "CYC-ADDITION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_subtraction_expression", "CYC-SUBTRACTION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_multiplication_expression", "CYC-MULTIPLICATION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_division_expression", "CYC-DIVISION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_exponentiation_expression", "CYC-EXPONENTIATION-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_nth_root_expression", "CYC-NTH-ROOT-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_enclosed_math_expression", "CYC-ENCLOSED-MATH-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "cyc_univariate_linear_equation", "CYC-UNIVARIATE-LINEAR-EQUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.collection_defns", "test_math_expression_fn_collection_defns", "TEST-MATH-EXPRESSION-FN-COLLECTION-DEFNS", 2, 0, false);
        return (SubLObject)collection_defns.NIL;
    }
    
    public static SubLObject init_collection_defns_file() {
        collection_defns.$subl_functions_used_as_collection_defns$ = SubLFiles.deflexical("*SUBL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*", (SubLObject)collection_defns.$list0);
        collection_defns.$cycl_functions_used_as_collection_defns$ = SubLFiles.deflexical("*CYCL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*", (SubLObject)collection_defns.$list1);
        collection_defns.$cached_relation_type_arity_caching_state$ = SubLFiles.deflexical("*CACHED-RELATION-TYPE-ARITY-CACHING-STATE*", (SubLObject)collection_defns.NIL);
        collection_defns.$extensional_setP_caching_state$ = SubLFiles.deflexical("*EXTENSIONAL-SET?-CACHING-STATE*", (SubLObject)collection_defns.NIL);
        collection_defns.$8byteinteger_lower_bound$ = SubLFiles.defconstant("*8BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.$int200$63)), (SubLObject)collection_defns.ONE_INTEGER));
        collection_defns.$8byteinteger_upper_bound$ = SubLFiles.defconstant("*8BYTEINTEGER-UPPER-BOUND*", Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.$int200$63));
        collection_defns.$4byteinteger_lower_bound$ = SubLFiles.defconstant("*4BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.$int202$31)), (SubLObject)collection_defns.ONE_INTEGER));
        collection_defns.$4byteinteger_upper_bound$ = SubLFiles.defconstant("*4BYTEINTEGER-UPPER-BOUND*", Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.$int202$31));
        collection_defns.$2byteinteger_lower_bound$ = SubLFiles.defconstant("*2BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.FIFTEEN_INTEGER)), (SubLObject)collection_defns.ONE_INTEGER));
        collection_defns.$2byteinteger_upper_bound$ = SubLFiles.defconstant("*2BYTEINTEGER-UPPER-BOUND*", Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.FIFTEEN_INTEGER));
        collection_defns.$1byteinteger_lower_bound$ = SubLFiles.defconstant("*1BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.SEVEN_INTEGER)), (SubLObject)collection_defns.ONE_INTEGER));
        collection_defns.$1byteinteger_upper_bound$ = SubLFiles.defconstant("*1BYTEINTEGER-UPPER-BOUND*", Numbers.expt((SubLObject)collection_defns.TWO_INTEGER, (SubLObject)collection_defns.SEVEN_INTEGER));
        return (SubLObject)collection_defns.NIL;
    }
    
    public static SubLObject setup_collection_defns_file() {
        SubLObject cdolist_list_var = collection_defns.$subl_functions_used_as_collection_defns$.getGlobalValue();
        SubLObject symbol = (SubLObject)collection_defns.NIL;
        symbol = cdolist_list_var.first();
        while (collection_defns.NIL != cdolist_list_var) {
            utilities_macros.register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        cdolist_list_var = collection_defns.$cycl_functions_used_as_collection_defns$.getGlobalValue();
        symbol = (SubLObject)collection_defns.NIL;
        symbol = cdolist_list_var.first();
        while (collection_defns.NIL != cdolist_list_var) {
            utilities_macros.register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym2$CYC_INDIVIDUAL_NECESSARY);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym3$CYC_KAPPA_PREDICATE_BY_ARITY);
        memoization_state.note_globally_cached_function((SubLObject)collection_defns.$sym4$CACHED_RELATION_TYPE_ARITY);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym11$CYCL_EXPRESSION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym12$EL_EXPRESSION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym13$HL_EXPRESSION_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym14$CYCL_OPEN_DENOTATIONAL_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym15$CYCL_CLOSED_DENOTATIONAL_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym16$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym17$CYCL_REIFIED_DENOTATIONAL_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym18$HL_CLOSED_DENOTATIONAL_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym19$CYCL_REPRESENTED_ATOMIC_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym20$CYCL_REPRESENTED_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym21$CYC_SYSTEM_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym22$CYC_SYSTEM_CHARACTER_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym23$CYC_SYSTEM_STRING_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym24$CYC_SYSTEM_REAL_NUMBER_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym25$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym26$CYCL_SUBL_SYMBOL_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym27$CYCL_ATOMIC_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym28$CYCL_CLOSED_ATOMIC_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym29$HL_NON_ATOMIC_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym30$CYCL_NON_ATOMIC_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym31$EL_NON_ATOMIC_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym32$HL_INDEXED_TERM_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym33$CYCL_INDEXED_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym34$CYCL_OPEN_NON_ATOMIC_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym35$CYCL_CLOSED_NON_ATOMIC_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym36$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym37$CYCL_NON_ATOMIC_REIFIED_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym38$EL_REIFIABLE_NON_ATOMIC_TERM_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym39$CYCL_CLOSED_EXPRESSION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym40$CYCL_OPEN_EXPRESSION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym41$CYCL_FORMULA_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym42$CYCL_OPEN_FORMULA_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym43$CYCL_CLOSED_FORMULA_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym44$HL_FORMULA_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym45$CYCL_UNBOUND_RELATION_FORMULA_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym46$CYCL_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym47$CYCL_OPEN_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym48$CYCL_CLOSED_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym50$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym51$EL_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym52$CYCL_ATOMIC_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym53$CYCL_CLOSED_ATOMIC_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym54$CYCL_PROPOSITIONAL_SENTENCE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym55$CYCL_SENTENCE_ASKABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym56$CYCL_SENTENCE_ASSERTIBLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym57$EL_SENTENCE_ASKABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym58$EL_SENTENCE_ASSERTIBLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym59$CYCL_NON_ATOMIC_TERM_ASKABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym60$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym61$EL_NON_ATOMIC_TERM_ASKABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym63$CYCL_EXPRESSION_ASKABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym64$CYCL_EXPRESSION_ASSERTIBLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym65$EL_EXPRESSION_ASKABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym66$EL_EXPRESSION_ASSERTIBLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym67$CYCL_QUERY_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym68$CYCL_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym69$CYCL_ATOMIC_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym70$CYCL_GAF_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym71$CYCL_RULE_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym72$CYCL_ASSERTED_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym73$CYCL_DEDUCED_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym74$CYCL_NL_SEMANTIC_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym76$CYCL_CANONICALIZER_DIRECTIVE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym78$CYCL_REFORMULATOR_DIRECTIVE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym81$CYCL_REFORMULATOR_RULE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym83$CYCL_SIMPLIFIER_DIRECTIVE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym84$HL_ASSERTION_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym85$EL_ASSERTION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym86$CYC_GROUND_TERM);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym87$CYC_REAL_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym88$CYC_SYSTEM_REAL_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym89$CYC_POSITIVE_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym90$CYC_NEGATIVE_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym91$CYC_NON_POSITIVE_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym92$CYC_NON_NEGATIVE_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym93$CYC_RATIONAL_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym95$CYC_REAL_0_100);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym97$CYC_REAL_0_1);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym99$CYC_REAL_MINUS_1_TO_PLUS_1);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym100$CYC_REAL_1_INFINITY);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym101$CYC_NONZERO_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym102$CYC_SYSTEM_FLOAT);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym103$CYC_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym104$CYC_SYSTEM_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym105$CYC_POSITIVE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym106$CYC_PRIME_NUMBER_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym108$CYC_MAYBE_PRIME_NUMBER_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym109$CYC_NEGATIVE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym110$CYC_NON_POSITIVE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym111$CYC_NON_NEGATIVE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym112$CYC_EVEN_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym113$CYC_ODD_NUMBER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym114$CYC_UNIVERSAL_DATE);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym115$CYC_UNIVERSAL_SECOND);
        if (collection_defns.$sym116$CYC_SET_OF_TYPE_NECESSARY.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym116$CYC_SET_OF_TYPE_NECESSARY;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym116$CYC_SET_OF_TYPE_NECESSARY);
        if (collection_defns.$sym118$CYC_SET_OF_TYPE_SUFFICIENT.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym118$CYC_SET_OF_TYPE_SUFFICIENT;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym118$CYC_SET_OF_TYPE_SUFFICIENT);
        if (collection_defns.$sym119$CYC_LIST_OF_TYPE_NECESSARY.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym119$CYC_LIST_OF_TYPE_NECESSARY;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym119$CYC_LIST_OF_TYPE_NECESSARY);
        if (collection_defns.$sym120$CYC_LIST_OF_TYPE_SUFFICIENT.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym120$CYC_LIST_OF_TYPE_SUFFICIENT;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym120$CYC_LIST_OF_TYPE_SUFFICIENT);
        memoization_state.note_globally_cached_function((SubLObject)collection_defns.$sym122$EXTENSIONAL_SET_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym131$CYC_LIST_WITHOUT_REPETITION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym132$CYC_NUMERIC_STRING_NECESSARY);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym133$CYC_NUMERAL_STRING);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym134$CYC_NUMERIC_STRING);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym135$CYC_NUMBER_STRING);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym136$CYC_ZIP_CODE_FIVE_DIGIT);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym138$CYC_ZIP_CODE_NINE_DIGIT);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym139$CYC_GUID_STRING_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym140$CYC_NAICS_CODE);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym141$CYC_UNICODE_DENOTING_ASCII_STRING_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym142$CYC_ASCII_STRING_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym143$CYC_CONTROL_CHARACTER_FREE_STRING_NECESSARY);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym144$CYC_URL);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym145$DOCTOR_ME_ID_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym146$CLPE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym147$CYC_QUERY_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym148$CYC_SYNTACTIC_FORMULA_ARITY_OK);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym149$CYC_SYNTACTIC_FORMULA);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym150$FUNCTION_EXPRESSION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym151$CYC_RELATION_EXPRESSION_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym152$EL_VARIABLE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym153$CYC_SUBL_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym154$CYC_SUBL_ESCAPE);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym155$CYC_SUBL_TEMPLATE);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym156$IBQE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym157$SCALAR_POINT_VALUE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym159$SCALAR_INTEGRAL_VALUE_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym160$NON_NEGATIVE_SCALAR_INTERVAL_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym161$POSITIVE_SCALAR_INTERVAL_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym162$NEGATIVE_SCALAR_INTERVAL_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym163$CYC_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym165$CYC_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym168$CYC_FRACTIONAL_MEASURABLE_QUANTITY_DECIMAL_P);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym171$CYCL_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list178);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym179$CYCL_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list180);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym181$TERM_SET_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym182$CYCL_VAR_LIST_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym183$CYC_EL_VAR_LIST_);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym184$CYC_SYSTEM_ATOM);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym186$CYC_LIST_OF_LISTS);
        if (collection_defns.$sym187$CYC_STRING_IS_LENGTH.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym187$CYC_STRING_IS_LENGTH;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym187$CYC_STRING_IS_LENGTH);
        if (collection_defns.$sym189$CYC_STRING_IS_MINIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym189$CYC_STRING_IS_MINIMUM_LENGTH;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym189$CYC_STRING_IS_MINIMUM_LENGTH);
        if (collection_defns.$sym191$CYC_STRING_IS_MAXIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym191$CYC_STRING_IS_MAXIMUM_LENGTH;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym191$CYC_STRING_IS_MAXIMUM_LENGTH);
        if (collection_defns.$sym193$CYC_LIST_IS_LENGTH.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym193$CYC_LIST_IS_LENGTH;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym193$CYC_LIST_IS_LENGTH);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym194$RTP_SYNTACTIC_CONSTRAINT);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym195$CYC_SUBL_QUERY_PROPERTY_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym196$CYC_SUBL_TV_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym197$CYC_SUBL_HL_SUPPORT_MODULE_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym198$CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym199$CYC_SUBL_KCT_METRIC_IDENTIFIER_P);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym201$CYC_8_BYTE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym203$CYC_4_BYTE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym204$CYC_2_BYTE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym205$CYC_1_BYTE_INTEGER);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym208$CYC_BIT_STRING);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym211$CYC_IP4_ADDRESS);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym214$CYC_IP4_NETWORK_ADDRESS);
        if (collection_defns.$sym215$CYC_LIST_IS_MINIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym215$CYC_LIST_IS_MINIMUM_LENGTH;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym215$CYC_LIST_IS_MINIMUM_LENGTH);
        if (collection_defns.$sym216$CYC_LIST_IS_MAXIMUM_LENGTH.isSymbol()) {
            final SubLObject item_var = (SubLObject)collection_defns.$sym216$CYC_LIST_IS_MAXIMUM_LENGTH;
            if (collection_defns.NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function((SubLObject)collection_defns.EQL), Symbols.symbol_function((SubLObject)collection_defns.IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym216$CYC_LIST_IS_MAXIMUM_LENGTH);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym217$CYC_ADDITION_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym218$CYC_SUBTRACTION_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym219$CYC_MULTIPLICATION_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym220$CYC_DIVISION_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym221$CYC_EXPONENTIATION_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym222$CYC_NTH_ROOT_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym223$CYC_ENCLOSED_MATH_EXPRESSION);
        utilities_macros.register_kb_function((SubLObject)collection_defns.$sym224$CYC_UNIVARIATE_LINEAR_EQUATION);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym226$TEST_MATH_EXPRESSION_FN_COLLECTION_DEFNS, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, Symbols.symbol_function((SubLObject)collection_defns.EQUAL), collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.$list227, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list228);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym61$EL_NON_ATOMIC_TERM_ASKABLE_, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list229);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list230);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym65$EL_EXPRESSION_ASKABLE_, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list231);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym66$EL_EXPRESSION_ASSERTIBLE_, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw176$FULL, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list232);
        generic_testing.define_test_case_table_int((SubLObject)collection_defns.$sym214$CYC_IP4_NETWORK_ADDRESS, (SubLObject)ConsesLow.list(new SubLObject[] { collection_defns.$kw172$TEST, collection_defns.NIL, collection_defns.$kw173$OWNER, collection_defns.NIL, collection_defns.$kw174$CLASSES, collection_defns.NIL, collection_defns.$kw175$KB, collection_defns.$kw233$TINY, collection_defns.$kw177$WORKING_, collection_defns.T }), (SubLObject)collection_defns.$list234);
        return (SubLObject)collection_defns.NIL;
    }
    
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
    
    static {
        me = (SubLFile)new collection_defns();
        collection_defns.$subl_functions_used_as_collection_defns$ = null;
        collection_defns.$cycl_functions_used_as_collection_defns$ = null;
        collection_defns.$cached_relation_type_arity_caching_state$ = null;
        collection_defns.$extensional_setP_caching_state$ = null;
        collection_defns.$8byteinteger_lower_bound$ = null;
        collection_defns.$8byteinteger_upper_bound$ = null;
        collection_defns.$4byteinteger_lower_bound$ = null;
        collection_defns.$4byteinteger_upper_bound$ = null;
        collection_defns.$2byteinteger_lower_bound$ = null;
        collection_defns.$2byteinteger_upper_bound$ = null;
        collection_defns.$1byteinteger_lower_bound$ = null;
        collection_defns.$1byteinteger_upper_bound$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CYCL-CONSTANT-P"), SubLObjectFactory.makeSymbol("CYCL-VARIABLE-P"), SubLObjectFactory.makeSymbol("EL-VARIABLE-P"), SubLObjectFactory.makeSymbol("HL-VARIABLE-P"), SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P"), SubLObjectFactory.makeSymbol("EL-RELATION-EXPRESSION?"), SubLObjectFactory.makeSymbol("GAF?"), SubLObjectFactory.makeSymbol("STRING-W/O-CONTROL-CHARS?"), SubLObjectFactory.makeSymbol("URL-P") });
        $sym2$CYC_INDIVIDUAL_NECESSARY = SubLObjectFactory.makeSymbol("CYC-INDIVIDUAL-NECESSARY");
        $sym3$CYC_KAPPA_PREDICATE_BY_ARITY = SubLObjectFactory.makeSymbol("CYC-KAPPA-PREDICATE-BY-ARITY");
        $sym4$CACHED_RELATION_TYPE_ARITY = SubLObjectFactory.makeSymbol("CACHED-RELATION-TYPE-ARITY");
        $const5$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $const6$arity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY"));
        $kw8$ARITY = SubLObjectFactory.makeKeyword("ARITY");
        $const9$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym10$_CACHED_RELATION_TYPE_ARITY_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-RELATION-TYPE-ARITY-CACHING-STATE*");
        $sym11$CYCL_EXPRESSION_ = SubLObjectFactory.makeSymbol("CYCL-EXPRESSION?");
        $sym12$EL_EXPRESSION_ = SubLObjectFactory.makeSymbol("EL-EXPRESSION?");
        $sym13$HL_EXPRESSION_P = SubLObjectFactory.makeSymbol("HL-EXPRESSION-P");
        $sym14$CYCL_OPEN_DENOTATIONAL_TERM_ = SubLObjectFactory.makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");
        $sym15$CYCL_CLOSED_DENOTATIONAL_TERM_ = SubLObjectFactory.makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");
        $sym16$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = SubLObjectFactory.makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");
        $sym17$CYCL_REIFIED_DENOTATIONAL_TERM_ = SubLObjectFactory.makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");
        $sym18$HL_CLOSED_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("HL-CLOSED-DENOTATIONAL-TERM-P");
        $sym19$CYCL_REPRESENTED_ATOMIC_TERM_P = SubLObjectFactory.makeSymbol("CYCL-REPRESENTED-ATOMIC-TERM-P");
        $sym20$CYCL_REPRESENTED_TERM_ = SubLObjectFactory.makeSymbol("CYCL-REPRESENTED-TERM?");
        $sym21$CYC_SYSTEM_TERM_P = SubLObjectFactory.makeSymbol("CYC-SYSTEM-TERM-P");
        $sym22$CYC_SYSTEM_CHARACTER_P = SubLObjectFactory.makeSymbol("CYC-SYSTEM-CHARACTER-P");
        $sym23$CYC_SYSTEM_STRING_P = SubLObjectFactory.makeSymbol("CYC-SYSTEM-STRING-P");
        $sym24$CYC_SYSTEM_REAL_NUMBER_P = SubLObjectFactory.makeSymbol("CYC-SYSTEM-REAL-NUMBER-P");
        $sym25$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P = SubLObjectFactory.makeSymbol("CYC-SYSTEM-NON-VARIABLE-SYMBOL-P");
        $sym26$CYCL_SUBL_SYMBOL_P = SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-P");
        $sym27$CYCL_ATOMIC_TERM_P = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-TERM-P");
        $sym28$CYCL_CLOSED_ATOMIC_TERM_P = SubLObjectFactory.makeSymbol("CYCL-CLOSED-ATOMIC-TERM-P");
        $sym29$HL_NON_ATOMIC_TERM_P = SubLObjectFactory.makeSymbol("HL-NON-ATOMIC-TERM-P");
        $sym30$CYCL_NON_ATOMIC_TERM_ = SubLObjectFactory.makeSymbol("CYCL-NON-ATOMIC-TERM?");
        $sym31$EL_NON_ATOMIC_TERM_ = SubLObjectFactory.makeSymbol("EL-NON-ATOMIC-TERM?");
        $sym32$HL_INDEXED_TERM_P = SubLObjectFactory.makeSymbol("HL-INDEXED-TERM-P");
        $sym33$CYCL_INDEXED_TERM_ = SubLObjectFactory.makeSymbol("CYCL-INDEXED-TERM?");
        $sym34$CYCL_OPEN_NON_ATOMIC_TERM_ = SubLObjectFactory.makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");
        $sym35$CYCL_CLOSED_NON_ATOMIC_TERM_ = SubLObjectFactory.makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");
        $sym36$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = SubLObjectFactory.makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");
        $sym37$CYCL_NON_ATOMIC_REIFIED_TERM_ = SubLObjectFactory.makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");
        $sym38$EL_REIFIABLE_NON_ATOMIC_TERM_ = SubLObjectFactory.makeSymbol("EL-REIFIABLE-NON-ATOMIC-TERM?");
        $sym39$CYCL_CLOSED_EXPRESSION_ = SubLObjectFactory.makeSymbol("CYCL-CLOSED-EXPRESSION?");
        $sym40$CYCL_OPEN_EXPRESSION_ = SubLObjectFactory.makeSymbol("CYCL-OPEN-EXPRESSION?");
        $sym41$CYCL_FORMULA_ = SubLObjectFactory.makeSymbol("CYCL-FORMULA?");
        $sym42$CYCL_OPEN_FORMULA_ = SubLObjectFactory.makeSymbol("CYCL-OPEN-FORMULA?");
        $sym43$CYCL_CLOSED_FORMULA_ = SubLObjectFactory.makeSymbol("CYCL-CLOSED-FORMULA?");
        $sym44$HL_FORMULA_P = SubLObjectFactory.makeSymbol("HL-FORMULA-P");
        $sym45$CYCL_UNBOUND_RELATION_FORMULA_P = SubLObjectFactory.makeSymbol("CYCL-UNBOUND-RELATION-FORMULA-P");
        $sym46$CYCL_SENTENCE_ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE?");
        $sym47$CYCL_OPEN_SENTENCE_ = SubLObjectFactory.makeSymbol("CYCL-OPEN-SENTENCE?");
        $sym48$CYCL_CLOSED_SENTENCE_ = SubLObjectFactory.makeSymbol("CYCL-CLOSED-SENTENCE?");
        $kw49$TERM = SubLObjectFactory.makeKeyword("TERM");
        $sym50$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_ = SubLObjectFactory.makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?");
        $sym51$EL_SENTENCE_ = SubLObjectFactory.makeSymbol("EL-SENTENCE?");
        $sym52$CYCL_ATOMIC_SENTENCE_ = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-SENTENCE?");
        $sym53$CYCL_CLOSED_ATOMIC_SENTENCE_ = SubLObjectFactory.makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");
        $sym54$CYCL_PROPOSITIONAL_SENTENCE_ = SubLObjectFactory.makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");
        $sym55$CYCL_SENTENCE_ASKABLE_ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-ASKABLE?");
        $sym56$CYCL_SENTENCE_ASSERTIBLE_ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");
        $sym57$EL_SENTENCE_ASKABLE_ = SubLObjectFactory.makeSymbol("EL-SENTENCE-ASKABLE?");
        $sym58$EL_SENTENCE_ASSERTIBLE_ = SubLObjectFactory.makeSymbol("EL-SENTENCE-ASSERTIBLE?");
        $sym59$CYCL_NON_ATOMIC_TERM_ASKABLE_ = SubLObjectFactory.makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");
        $sym60$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = SubLObjectFactory.makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");
        $sym61$EL_NON_ATOMIC_TERM_ASKABLE_ = SubLObjectFactory.makeSymbol("EL-NON-ATOMIC-TERM-ASKABLE?");
        $sym62$EL_NON_ATOMIC_TERM_ASSERTIBLE_ = SubLObjectFactory.makeSymbol("EL-NON-ATOMIC-TERM-ASSERTIBLE?");
        $sym63$CYCL_EXPRESSION_ASKABLE_ = SubLObjectFactory.makeSymbol("CYCL-EXPRESSION-ASKABLE?");
        $sym64$CYCL_EXPRESSION_ASSERTIBLE_ = SubLObjectFactory.makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");
        $sym65$EL_EXPRESSION_ASKABLE_ = SubLObjectFactory.makeSymbol("EL-EXPRESSION-ASKABLE?");
        $sym66$EL_EXPRESSION_ASSERTIBLE_ = SubLObjectFactory.makeSymbol("EL-EXPRESSION-ASSERTIBLE?");
        $sym67$CYCL_QUERY_ = SubLObjectFactory.makeSymbol("CYCL-QUERY?");
        $sym68$CYCL_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-ASSERTION?");
        $sym69$CYCL_ATOMIC_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-ASSERTION?");
        $sym70$CYCL_GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-GAF-ASSERTION?");
        $sym71$CYCL_RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-RULE-ASSERTION?");
        $sym72$CYCL_ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-ASSERTED-ASSERTION?");
        $sym73$CYCL_DEDUCED_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-DEDUCED-ASSERTION?");
        $sym74$CYCL_NL_SEMANTIC_ASSERTION_ = SubLObjectFactory.makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");
        $const75$CanonicalizerDirectivePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CanonicalizerDirectivePredicate"));
        $sym76$CYCL_CANONICALIZER_DIRECTIVE_ = SubLObjectFactory.makeSymbol("CYCL-CANONICALIZER-DIRECTIVE?");
        $const77$ReformulatorDirectivePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorDirectivePredicate"));
        $sym78$CYCL_REFORMULATOR_DIRECTIVE_ = SubLObjectFactory.makeSymbol("CYCL-REFORMULATOR-DIRECTIVE?");
        $const79$CycLReformulationRulePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLReformulationRulePredicate"));
        $const80$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym81$CYCL_REFORMULATOR_RULE_ = SubLObjectFactory.makeSymbol("CYCL-REFORMULATOR-RULE?");
        $const82$SimplifierDirectivePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimplifierDirectivePredicate"));
        $sym83$CYCL_SIMPLIFIER_DIRECTIVE_ = SubLObjectFactory.makeSymbol("CYCL-SIMPLIFIER-DIRECTIVE?");
        $sym84$HL_ASSERTION_P = SubLObjectFactory.makeSymbol("HL-ASSERTION-P");
        $sym85$EL_ASSERTION_ = SubLObjectFactory.makeSymbol("EL-ASSERTION?");
        $sym86$CYC_GROUND_TERM = SubLObjectFactory.makeSymbol("CYC-GROUND-TERM");
        $sym87$CYC_REAL_NUMBER = SubLObjectFactory.makeSymbol("CYC-REAL-NUMBER");
        $sym88$CYC_SYSTEM_REAL_NUMBER = SubLObjectFactory.makeSymbol("CYC-SYSTEM-REAL-NUMBER");
        $sym89$CYC_POSITIVE_NUMBER = SubLObjectFactory.makeSymbol("CYC-POSITIVE-NUMBER");
        $sym90$CYC_NEGATIVE_NUMBER = SubLObjectFactory.makeSymbol("CYC-NEGATIVE-NUMBER");
        $sym91$CYC_NON_POSITIVE_NUMBER = SubLObjectFactory.makeSymbol("CYC-NON-POSITIVE-NUMBER");
        $sym92$CYC_NON_NEGATIVE_NUMBER = SubLObjectFactory.makeSymbol("CYC-NON-NEGATIVE-NUMBER");
        $sym93$CYC_RATIONAL_NUMBER = SubLObjectFactory.makeSymbol("CYC-RATIONAL-NUMBER");
        $float94$100_0 = (SubLFloat)SubLObjectFactory.makeDouble(100.0);
        $sym95$CYC_REAL_0_100 = SubLObjectFactory.makeSymbol("CYC-REAL-0-100");
        $float96$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $sym97$CYC_REAL_0_1 = SubLObjectFactory.makeSymbol("CYC-REAL-0-1");
        $float98$_1_0 = (SubLFloat)SubLObjectFactory.makeDouble(-1.0);
        $sym99$CYC_REAL_MINUS_1_TO_PLUS_1 = SubLObjectFactory.makeSymbol("CYC-REAL-MINUS-1-TO-PLUS-1");
        $sym100$CYC_REAL_1_INFINITY = SubLObjectFactory.makeSymbol("CYC-REAL-1-INFINITY");
        $sym101$CYC_NONZERO_NUMBER = SubLObjectFactory.makeSymbol("CYC-NONZERO-NUMBER");
        $sym102$CYC_SYSTEM_FLOAT = SubLObjectFactory.makeSymbol("CYC-SYSTEM-FLOAT");
        $sym103$CYC_INTEGER = SubLObjectFactory.makeSymbol("CYC-INTEGER");
        $sym104$CYC_SYSTEM_INTEGER = SubLObjectFactory.makeSymbol("CYC-SYSTEM-INTEGER");
        $sym105$CYC_POSITIVE_INTEGER = SubLObjectFactory.makeSymbol("CYC-POSITIVE-INTEGER");
        $sym106$CYC_PRIME_NUMBER_ = SubLObjectFactory.makeSymbol("CYC-PRIME-NUMBER?");
        $sym107$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym108$CYC_MAYBE_PRIME_NUMBER_ = SubLObjectFactory.makeSymbol("CYC-MAYBE-PRIME-NUMBER?");
        $sym109$CYC_NEGATIVE_INTEGER = SubLObjectFactory.makeSymbol("CYC-NEGATIVE-INTEGER");
        $sym110$CYC_NON_POSITIVE_INTEGER = SubLObjectFactory.makeSymbol("CYC-NON-POSITIVE-INTEGER");
        $sym111$CYC_NON_NEGATIVE_INTEGER = SubLObjectFactory.makeSymbol("CYC-NON-NEGATIVE-INTEGER");
        $sym112$CYC_EVEN_NUMBER = SubLObjectFactory.makeSymbol("CYC-EVEN-NUMBER");
        $sym113$CYC_ODD_NUMBER = SubLObjectFactory.makeSymbol("CYC-ODD-NUMBER");
        $sym114$CYC_UNIVERSAL_DATE = SubLObjectFactory.makeSymbol("CYC-UNIVERSAL-DATE");
        $sym115$CYC_UNIVERSAL_SECOND = SubLObjectFactory.makeSymbol("CYC-UNIVERSAL-SECOND");
        $sym116$CYC_SET_OF_TYPE_NECESSARY = SubLObjectFactory.makeSymbol("CYC-SET-OF-TYPE-NECESSARY");
        $kw117$AGNOSTIC = SubLObjectFactory.makeKeyword("AGNOSTIC");
        $sym118$CYC_SET_OF_TYPE_SUFFICIENT = SubLObjectFactory.makeSymbol("CYC-SET-OF-TYPE-SUFFICIENT");
        $sym119$CYC_LIST_OF_TYPE_NECESSARY = SubLObjectFactory.makeSymbol("CYC-LIST-OF-TYPE-NECESSARY");
        $sym120$CYC_LIST_OF_TYPE_SUFFICIENT = SubLObjectFactory.makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT");
        $const121$instanceElementType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceElementType"));
        $sym122$EXTENSIONAL_SET_ = SubLObjectFactory.makeSymbol("EXTENSIONAL-SET?");
        $const123$Set_Extensional = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Set-Extensional"));
        $sym124$_EXTENSIONAL_SET__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*EXTENSIONAL-SET?-CACHING-STATE*");
        $int125$32 = SubLObjectFactory.makeInteger(32);
        $sym126$CLEAR_EXTENSIONAL_SET_ = SubLObjectFactory.makeSymbol("CLEAR-EXTENSIONAL-SET?");
        $const127$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const128$List_Extensional = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("List-Extensional"));
        $const129$instanceListMemberType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceListMemberType"));
        $const130$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $sym131$CYC_LIST_WITHOUT_REPETITION = SubLObjectFactory.makeSymbol("CYC-LIST-WITHOUT-REPETITION");
        $sym132$CYC_NUMERIC_STRING_NECESSARY = SubLObjectFactory.makeSymbol("CYC-NUMERIC-STRING-NECESSARY");
        $sym133$CYC_NUMERAL_STRING = SubLObjectFactory.makeSymbol("CYC-NUMERAL-STRING");
        $sym134$CYC_NUMERIC_STRING = SubLObjectFactory.makeSymbol("CYC-NUMERIC-STRING");
        $sym135$CYC_NUMBER_STRING = SubLObjectFactory.makeSymbol("CYC-NUMBER-STRING");
        $sym136$CYC_ZIP_CODE_FIVE_DIGIT = SubLObjectFactory.makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"));
        $sym138$CYC_ZIP_CODE_NINE_DIGIT = SubLObjectFactory.makeSymbol("CYC-ZIP-CODE-NINE-DIGIT");
        $sym139$CYC_GUID_STRING_P = SubLObjectFactory.makeSymbol("CYC-GUID-STRING-P");
        $sym140$CYC_NAICS_CODE = SubLObjectFactory.makeSymbol("CYC-NAICS-CODE");
        $sym141$CYC_UNICODE_DENOTING_ASCII_STRING_P = SubLObjectFactory.makeSymbol("CYC-UNICODE-DENOTING-ASCII-STRING-P");
        $sym142$CYC_ASCII_STRING_P = SubLObjectFactory.makeSymbol("CYC-ASCII-STRING-P");
        $sym143$CYC_CONTROL_CHARACTER_FREE_STRING_NECESSARY = SubLObjectFactory.makeSymbol("CYC-CONTROL-CHARACTER-FREE-STRING-NECESSARY");
        $sym144$CYC_URL = SubLObjectFactory.makeSymbol("CYC-URL");
        $sym145$DOCTOR_ME_ID_ = SubLObjectFactory.makeSymbol("DOCTOR-ME-ID?");
        $sym146$CLPE_ = SubLObjectFactory.makeSymbol("CLPE?");
        $sym147$CYC_QUERY_ = SubLObjectFactory.makeSymbol("CYC-QUERY?");
        $sym148$CYC_SYNTACTIC_FORMULA_ARITY_OK = SubLObjectFactory.makeSymbol("CYC-SYNTACTIC-FORMULA-ARITY-OK");
        $sym149$CYC_SYNTACTIC_FORMULA = SubLObjectFactory.makeSymbol("CYC-SYNTACTIC-FORMULA");
        $sym150$FUNCTION_EXPRESSION_ = SubLObjectFactory.makeSymbol("FUNCTION-EXPRESSION?");
        $sym151$CYC_RELATION_EXPRESSION_ = SubLObjectFactory.makeSymbol("CYC-RELATION-EXPRESSION?");
        $sym152$EL_VARIABLE_ = SubLObjectFactory.makeSymbol("EL-VARIABLE?");
        $sym153$CYC_SUBL_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-SUBL-EXPRESSION");
        $sym154$CYC_SUBL_ESCAPE = SubLObjectFactory.makeSymbol("CYC-SUBL-ESCAPE");
        $sym155$CYC_SUBL_TEMPLATE = SubLObjectFactory.makeSymbol("CYC-SUBL-TEMPLATE");
        $sym156$IBQE_ = SubLObjectFactory.makeSymbol("IBQE?");
        $sym157$SCALAR_POINT_VALUE_ = SubLObjectFactory.makeSymbol("SCALAR-POINT-VALUE?");
        $const158$UnitOfMeasure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"));
        $sym159$SCALAR_INTEGRAL_VALUE_ = SubLObjectFactory.makeSymbol("SCALAR-INTEGRAL-VALUE?");
        $sym160$NON_NEGATIVE_SCALAR_INTERVAL_ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");
        $sym161$POSITIVE_SCALAR_INTERVAL_ = SubLObjectFactory.makeSymbol("POSITIVE-SCALAR-INTERVAL?");
        $sym162$NEGATIVE_SCALAR_INTERVAL_ = SubLObjectFactory.makeSymbol("NEGATIVE-SCALAR-INTERVAL?");
        $sym163$CYC_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P = SubLObjectFactory.makeSymbol("CYC-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P");
        $const164$SimpleFraction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFraction"));
        $sym165$CYC_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P = SubLObjectFactory.makeSymbol("CYC-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P");
        $list166 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list167 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NegativeMixedFractionFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym168$CYC_FRACTIONAL_MEASURABLE_QUANTITY_DECIMAL_P = SubLObjectFactory.makeSymbol("CYC-FRACTIONAL-MEASURABLE-QUANTITY-DECIMAL-P");
        $const169$DecimalFraction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecimalFraction"));
        $const170$Fraction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fraction"));
        $sym171$CYCL_FRACTIONAL_MEASURABLE_QUANTITY_SIMPLE_P = SubLObjectFactory.makeSymbol("CYCL-FRACTIONAL-MEASURABLE-QUANTITY-SIMPLE-P");
        $kw172$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw173$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw174$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw175$KB = SubLObjectFactory.makeKeyword("KB");
        $kw176$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw177$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.THREE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.FOUR_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.TWO_INTEGER)))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.THREE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.FOUR_INTEGER)))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mile")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.TWO_INTEGER))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)collection_defns.THREE_INTEGER, (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.FOUR_INTEGER))), (SubLObject)collection_defns.NIL));
        $sym179$CYCL_FRACTIONAL_MEASURABLE_QUANTITY_MIXED_P = SubLObjectFactory.makeSymbol("CYCL-FRACTIONAL-MEASURABLE-QUANTITY-MIXED-P");
        $list180 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.THREE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.FOUR_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.TWO_INTEGER)))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.THREE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")), (SubLObject)collection_defns.FOUR_INTEGER)))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mile")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleFractionFn")), (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.TWO_INTEGER))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Meter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MixedFractionFn")), (SubLObject)collection_defns.THREE_INTEGER, (SubLObject)collection_defns.ONE_INTEGER, (SubLObject)collection_defns.FOUR_INTEGER))), (SubLObject)collection_defns.T));
        $sym181$TERM_SET_ = SubLObjectFactory.makeSymbol("TERM-SET?");
        $sym182$CYCL_VAR_LIST_ = SubLObjectFactory.makeSymbol("CYCL-VAR-LIST?");
        $sym183$CYC_EL_VAR_LIST_ = SubLObjectFactory.makeSymbol("CYC-EL-VAR-LIST?");
        $sym184$CYC_SYSTEM_ATOM = SubLObjectFactory.makeSymbol("CYC-SYSTEM-ATOM");
        $kw185$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym186$CYC_LIST_OF_LISTS = SubLObjectFactory.makeSymbol("CYC-LIST-OF-LISTS");
        $sym187$CYC_STRING_IS_LENGTH = SubLObjectFactory.makeSymbol("CYC-STRING-IS-LENGTH");
        $const188$instanceListLength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceListLength"));
        $sym189$CYC_STRING_IS_MINIMUM_LENGTH = SubLObjectFactory.makeSymbol("CYC-STRING-IS-MINIMUM-LENGTH");
        $const190$instanceListMinLength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceListMinLength"));
        $sym191$CYC_STRING_IS_MAXIMUM_LENGTH = SubLObjectFactory.makeSymbol("CYC-STRING-IS-MAXIMUM-LENGTH");
        $const192$instanceListMaxLength = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instanceListMaxLength"));
        $sym193$CYC_LIST_IS_LENGTH = SubLObjectFactory.makeSymbol("CYC-LIST-IS-LENGTH");
        $sym194$RTP_SYNTACTIC_CONSTRAINT = SubLObjectFactory.makeSymbol("RTP-SYNTACTIC-CONSTRAINT");
        $sym195$CYC_SUBL_QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("CYC-SUBL-QUERY-PROPERTY-P");
        $sym196$CYC_SUBL_TV_P = SubLObjectFactory.makeSymbol("CYC-SUBL-TV-P");
        $sym197$CYC_SUBL_HL_SUPPORT_MODULE_P = SubLObjectFactory.makeSymbol("CYC-SUBL-HL-SUPPORT-MODULE-P");
        $sym198$CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P = SubLObjectFactory.makeSymbol("CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P");
        $sym199$CYC_SUBL_KCT_METRIC_IDENTIFIER_P = SubLObjectFactory.makeSymbol("CYC-SUBL-KCT-METRIC-IDENTIFIER-P");
        $int200$63 = SubLObjectFactory.makeInteger(63);
        $sym201$CYC_8_BYTE_INTEGER = SubLObjectFactory.makeSymbol("CYC-8-BYTE-INTEGER");
        $int202$31 = SubLObjectFactory.makeInteger(31);
        $sym203$CYC_4_BYTE_INTEGER = SubLObjectFactory.makeSymbol("CYC-4-BYTE-INTEGER");
        $sym204$CYC_2_BYTE_INTEGER = SubLObjectFactory.makeSymbol("CYC-2-BYTE-INTEGER");
        $sym205$CYC_1_BYTE_INTEGER = SubLObjectFactory.makeSymbol("CYC-1-BYTE-INTEGER");
        $const206$BitData = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BitData"));
        $sym207$CYC_BIT_DATATYPE = SubLObjectFactory.makeSymbol("CYC-BIT-DATATYPE");
        $sym208$CYC_BIT_STRING = SubLObjectFactory.makeSymbol("CYC-BIT-STRING");
        $list209 = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $int210$256 = SubLObjectFactory.makeInteger(256);
        $sym211$CYC_IP4_ADDRESS = SubLObjectFactory.makeSymbol("CYC-IP4-ADDRESS");
        $list212 = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $int213$33 = SubLObjectFactory.makeInteger(33);
        $sym214$CYC_IP4_NETWORK_ADDRESS = SubLObjectFactory.makeSymbol("CYC-IP4-NETWORK-ADDRESS");
        $sym215$CYC_LIST_IS_MINIMUM_LENGTH = SubLObjectFactory.makeSymbol("CYC-LIST-IS-MINIMUM-LENGTH");
        $sym216$CYC_LIST_IS_MAXIMUM_LENGTH = SubLObjectFactory.makeSymbol("CYC-LIST-IS-MAXIMUM-LENGTH");
        $sym217$CYC_ADDITION_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-ADDITION-EXPRESSION");
        $sym218$CYC_SUBTRACTION_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-SUBTRACTION-EXPRESSION");
        $sym219$CYC_MULTIPLICATION_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-MULTIPLICATION-EXPRESSION");
        $sym220$CYC_DIVISION_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-DIVISION-EXPRESSION");
        $sym221$CYC_EXPONENTIATION_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-EXPONENTIATION-EXPRESSION");
        $sym222$CYC_NTH_ROOT_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-NTH-ROOT-EXPRESSION");
        $sym223$CYC_ENCLOSED_MATH_EXPRESSION = SubLObjectFactory.makeSymbol("CYC-ENCLOSED-MATH-EXPRESSION");
        $sym224$CYC_UNIVARIATE_LINEAR_EQUATION = SubLObjectFactory.makeSymbol("CYC-UNIVARIATE-LINEAR-EQUATION");
        $const225$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym226$TEST_MATH_EXPRESSION_FN_COLLECTION_DEFNS = SubLObjectFactory.makeSymbol("TEST-MATH-EXPRESSION-FN-COLLECTION-DEFNS");
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATH-EXPRESSION-TEST-CASE-TABLES"));
        $list228 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdditionExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixMinusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubtractionExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDivideFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DivisionExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PowerExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentiationExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ONE_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthRootExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER)))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnclosedMathExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.TWO_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.TWO_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.ELEVEN_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.TWO_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixDottedTimesFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Volt")), (SubLObject)collection_defns.TWENTY_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.TWO_INTEGER)), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiplicationExpression"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.THREE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.FOUR_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdditionExpression-Generic"))), (SubLObject)collection_defns.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParenthesizedMathFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathExpressionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.THREE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfixPlusFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MathQuantFn")), (SubLObject)collection_defns.FOUR_INTEGER))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdditionExpression"))), (SubLObject)collection_defns.NIL) });
        $list229 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat")))), (SubLObject)collection_defns.NIL));
        $list230 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat")))), (SubLObject)collection_defns.NIL));
        $list231 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat")))), (SubLObject)collection_defns.NIL));
        $list232 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))), (SubLObject)collection_defns.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Muffet")))), (SubLObject)collection_defns.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JuvenileFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat")))), (SubLObject)collection_defns.NIL));
        $kw233$TINY = SubLObjectFactory.makeKeyword("TINY");
        $list234 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("192.168.0.1/32")), (SubLObject)collection_defns.T));
    }
    
    public static final class $cyc_individual_necessary$UnaryFunction extends UnaryFunction
    {
        public $cyc_individual_necessary$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-INDIVIDUAL-NECESSARY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_individual_necessary(arg1);
        }
    }
    
    public static final class $cyc_typicality_reference_set_propertyP$UnaryFunction extends UnaryFunction
    {
        public $cyc_typicality_reference_set_propertyP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_typicality_reference_set_propertyP(arg1);
        }
    }
    
    public static final class $cycl_sentence_assertibleP$UnaryFunction extends UnaryFunction
    {
        public $cycl_sentence_assertibleP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-SENTENCE-ASSERTIBLE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cycl_sentence_assertibleP(arg1);
        }
    }
    
    public static final class $cycl_canonicalizer_directiveP$UnaryFunction extends UnaryFunction
    {
        public $cycl_canonicalizer_directiveP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-CANONICALIZER-DIRECTIVE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cycl_canonicalizer_directiveP(arg1);
        }
    }
    
    public static final class $cyc_list_of_type_necessary$UnaryFunction extends UnaryFunction
    {
        public $cyc_list_of_type_necessary$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-OF-TYPE-NECESSARY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_list_of_type_necessary(arg1);
        }
    }
    
    public static final class $cyc_list_of_type_sufficient$UnaryFunction extends UnaryFunction
    {
        public $cyc_list_of_type_sufficient$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-OF-TYPE-SUFFICIENT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_list_of_type_sufficient(arg1);
        }
    }
    
    public static final class $clear_extensional_setP$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_extensional_setP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-EXTENSIONAL-SET?"));
        }
        
        @Override
		public SubLObject processItem() {
            return collection_defns.clear_extensional_setP();
        }
    }
    
    public static final class $cyc_numeric_string_necessary$UnaryFunction extends UnaryFunction
    {
        public $cyc_numeric_string_necessary$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-NUMERIC-STRING-NECESSARY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_numeric_string_necessary(arg1);
        }
    }
    
    public static final class $cyc_zip_code_five_digit$UnaryFunction extends UnaryFunction
    {
        public $cyc_zip_code_five_digit$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-ZIP-CODE-FIVE-DIGIT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_zip_code_five_digit(arg1);
        }
    }
    
    public static final class $cyc_zip_code_nine_digit$UnaryFunction extends UnaryFunction
    {
        public $cyc_zip_code_nine_digit$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-ZIP-CODE-NINE-DIGIT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_zip_code_nine_digit(arg1);
        }
    }
    
    public static final class $cyc_guid_string_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_guid_string_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-GUID-STRING-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_guid_string_p(arg1);
        }
    }
    
    public static final class $cyc_ascii_string_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_ascii_string_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-ASCII-STRING-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_ascii_string_p(arg1);
        }
    }
    
    public static final class $cyc_list_of_lists$UnaryFunction extends UnaryFunction
    {
        public $cyc_list_of_lists$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-OF-LISTS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_list_of_lists(arg1);
        }
    }
    
    public static final class $cyc_string_is_length$UnaryFunction extends UnaryFunction
    {
        public $cyc_string_is_length$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-STRING-IS-LENGTH"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_string_is_length(arg1);
        }
    }
    
    public static final class $cyc_string_is_minimum_length$UnaryFunction extends UnaryFunction
    {
        public $cyc_string_is_minimum_length$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-STRING-IS-MINIMUM-LENGTH"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_string_is_minimum_length(arg1);
        }
    }
    
    public static final class $cyc_string_is_maximum_length$UnaryFunction extends UnaryFunction
    {
        public $cyc_string_is_maximum_length$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-STRING-IS-MAXIMUM-LENGTH"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_string_is_maximum_length(arg1);
        }
    }
    
    public static final class $cyc_subl_query_property_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_subl_query_property_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-SUBL-QUERY-PROPERTY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_subl_query_property_p(arg1);
        }
    }
    
    public static final class $cyc_subl_tv_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_subl_tv_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-SUBL-TV-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_subl_tv_p(arg1);
        }
    }
    
    public static final class $cyc_subl_hl_support_module_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_subl_hl_support_module_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-SUBL-HL-SUPPORT-MODULE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_subl_hl_support_module_p(arg1);
        }
    }
    
    public static final class $cyc_8_byte_integer$UnaryFunction extends UnaryFunction
    {
        public $cyc_8_byte_integer$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-8-BYTE-INTEGER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_8_byte_integer(arg1);
        }
    }
    
    public static final class $cyc_4_byte_integer$UnaryFunction extends UnaryFunction
    {
        public $cyc_4_byte_integer$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-4-BYTE-INTEGER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_4_byte_integer(arg1);
        }
    }
    
    public static final class $cyc_2_byte_integer$UnaryFunction extends UnaryFunction
    {
        public $cyc_2_byte_integer$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-2-BYTE-INTEGER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_2_byte_integer(arg1);
        }
    }
    
    public static final class $cyc_1_byte_integer$UnaryFunction extends UnaryFunction
    {
        public $cyc_1_byte_integer$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-1-BYTE-INTEGER"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_1_byte_integer(arg1);
        }
    }
    
    public static final class $cyc_bit_datatype$UnaryFunction extends UnaryFunction
    {
        public $cyc_bit_datatype$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-BIT-DATATYPE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_bit_datatype(arg1);
        }
    }
    
    public static final class $cyc_ip4_address$UnaryFunction extends UnaryFunction
    {
        public $cyc_ip4_address$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-IP4-ADDRESS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_ip4_address(arg1);
        }
    }
    
    public static final class $cyc_ip4_network_address$UnaryFunction extends UnaryFunction
    {
        public $cyc_ip4_network_address$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-IP4-NETWORK-ADDRESS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_ip4_network_address(arg1);
        }
    }
    
    public static final class $cyc_list_is_minimum_length$UnaryFunction extends UnaryFunction
    {
        public $cyc_list_is_minimum_length$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-LIST-IS-MINIMUM-LENGTH"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return collection_defns.cyc_list_is_minimum_length(arg1);
        }
    }
}

/*

	Total time: 946 ms
	
*/