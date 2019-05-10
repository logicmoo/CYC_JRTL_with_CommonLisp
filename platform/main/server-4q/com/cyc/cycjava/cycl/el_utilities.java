package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.el_utilities";
  public static final String myFingerPrint = "7b2f04e03166c02341f1529546add927fb012468655c6255aca69ee428542076";
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 7751L)
  public static SubLSymbol $cyc_const_unary_logical_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 8077L)
  public static SubLSymbol $cyc_const_binary_logical_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 8485L)
  public static SubLSymbol $cyc_const_ternary_logical_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 8813L)
  public static SubLSymbol $cyc_const_quaternary_logical_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 9153L)
  public static SubLSymbol $cyc_const_quintary_logical_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 9485L)
  public static SubLSymbol $cyc_const_variable_arity_logical_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 10143L)
  public static SubLSymbol $cyc_const_regular_quantifiers$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 11223L)
  public static SubLSymbol $cyc_const_bounded_existentials$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 14263L)
  public static SubLSymbol $cyc_const_tense_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 14362L)
  public static SubLSymbol $cyc_const_metric_tense_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 20526L)
  public static SubLSymbol $cyc_const_exception_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 21507L)
  public static SubLSymbol $cyc_const_pragmatic_requirement_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 37534L)
  private static SubLSymbol $standard_single_letter_el_var_names$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 58796L)
  private static SubLSymbol $dont_enforce_subl_escape_in_symbols$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 86824L)
  private static SubLSymbol $replace_arg_of_pred_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 86899L)
  private static SubLSymbol $replace_arg_of_pred_argnum$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 86975L)
  private static SubLSymbol $replace_arg_of_pred_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 87048L)
  private static SubLSymbol $replace_arg_of_pred_new_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101918L)
  private static SubLSymbol $default_forward_non_trigger_literal_predicateP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 149580L)
  private static SubLSymbol $arg1_subl_list_relations$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 149816L)
  private static SubLSymbol $arg2_subl_list_relations$;
  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 162763L)
  private static SubLSymbol $bound_arg_position_preferences$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLObject $const3$not;
  private static final SubLList $list4;
  private static final SubLObject $const5$or;
  private static final SubLList $list6;
  private static final SubLObject $const7$and;
  private static final SubLObject $const8$implies;
  private static final SubLObject $const9$equiv;
  private static final SubLObject $const10$xor;
  private static final SubLObject $const11$forAll;
  private static final SubLObject $const12$forAllVars;
  private static final SubLSymbol $sym13$EL_VAR_;
  private static final SubLObject $const14$thereExists;
  private static final SubLObject $const15$thereExistVars;
  private static final SubLObject $const16$thereExistAtLeast;
  private static final SubLObject $const17$thereExistAtMost;
  private static final SubLObject $const18$thereExistExactly;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLObject $const21$was;
  private static final SubLObject $const22$hasAlwaysBeen;
  private static final SubLObject $const23$willBe;
  private static final SubLObject $const24$willAlwaysBe;
  private static final SubLObject $const25$was_Metric;
  private static final SubLObject $const26$willBe_Metric;
  private static final SubLObject $const27$ExpandSubLFn;
  private static final SubLObject $const28$SubLQuoteFn;
  private static final SubLObject $const29$Quote;
  private static final SubLSymbol $sym30$REIFIABLE_FUNCTION_TERM_;
  private static final SubLSymbol $sym31$ASSERTION_P;
  private static final SubLSymbol $sym32$ASSERTION_EL_IST_FORMULA;
  private static final SubLSymbol $sym33$NART_P;
  private static final SubLSymbol $sym34$NART_EL_FORMULA;
  private static final SubLSymbol $sym35$VARIABLE_P;
  private static final SubLSymbol $sym36$DEFAULT_EL_VAR_FOR_HL_VAR;
  private static final SubLSymbol $sym37$IST_SENTENCE_DESIGNATING_ASSERTION_;
  private static final SubLSymbol $sym38$FIND_ASSERTION_CYCL;
  private static final SubLSymbol $sym39$HLIFY;
  private static final SubLSymbol $sym40$QUOTE;
  private static final SubLList $list41;
  private static final SubLObject $const42$exceptFor;
  private static final SubLObject $const43$exceptWhen;
  private static final SubLObject $const44$abnormal;
  private static final SubLObject $const45$pragmaticRequirement;
  private static final SubLObject $const46$meetsPragmaticRequirement;
  private static final SubLObject $const47$querySentence;
  private static final SubLSymbol $kw48$IGNORE;
  private static final SubLSymbol $sym49$EL_RELATION_EXPRESSION_;
  private static final SubLObject $const50$TheList;
  private static final SubLSymbol $kw51$INCLUDE;
  private static final SubLObject $const52$TheEmptyList;
  private static final SubLObject $const53$TheEmptySet;
  private static final SubLObject $const54$TheSet;
  private static final SubLObject $const55$TheSetOf;
  private static final SubLSymbol $sym56$LISTP;
  private static final SubLString $str57$A_KB_dependent_numerical_quantifi;
  private static final SubLObject $const58$SpecsFn;
  private static final SubLSymbol $sym59$CYC_VAR_;
  private static final SubLSymbol $sym60$GROUND_;
  private static final SubLList $list61;
  private static final SubLString $str62$Returns_whether_EXPRESSION_is_fre;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$EL_FORMULA_P;
  private static final SubLSymbol $sym65$OPTIMIZE_EL_FORMULA_VARIABLE_NAME;
  private static final SubLSymbol $sym66$EL_SENTENCE_P;
  private static final SubLList $list67;
  private static final SubLString $str68$_1;
  private static final SubLSymbol $sym69$INVALID_VARIABLE_NAME_CHAR;
  private static final SubLObject $const70$ExistentialQuantifier;
  private static final SubLSymbol $sym71$SUBL_ESCAPE_P;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLString $str74$unexpected_subl_escape_type__s;
  private static final SubLSymbol $sym75$OPAQUIFY_SUBL_ESCAPE;
  private static final SubLString $str76$not_a_known_quantifier___s;
  private static final SubLString $str77$not_quantified_sentence___s;
  private static final SubLSymbol $sym78$EL_LIST_P;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$CDOLIST;
  private static final SubLSymbol $sym81$EL_LIST_ITEMS;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$CDOLIST_NUMBERED;
  private static final SubLSymbol $sym84$EL_SET_P;
  private static final SubLSymbol $sym85$CONSP;
  private static final SubLSymbol $sym86$ELF_P;
  private static final SubLSymbol $sym87$MAKE_EL_FORMULA;
  private static final SubLObject $const88$ist;
  private static final SubLSymbol $sym89$LIST_WITHOUT_REPETITION_P;
  private static final SubLObject $const90$InstanceNamedFn;
  private static final SubLSymbol $kw91$HELLO_YOU_SILLY_COMPILER;
  private static final SubLSymbol $kw92$UNINITIALIZED;
  private static final SubLSymbol $sym93$REPLACE_ARG_OF_PRED_LAMBDA_TEST;
  private static final SubLSymbol $sym94$REPLACE_ARG_OF_PRED_LAMBDA_TRANSFORM;
  private static final SubLSymbol $kw95$REGULARIZE;
  private static final SubLSymbol $kw96$FALSE;
  private static final SubLSymbol $kw97$TRUE;
  private static final SubLSymbol $sym98$EL_NEGATION_P;
  private static final SubLSymbol $sym99$ISA_LIT_;
  private static final SubLSymbol $sym100$TOU_LIT_;
  private static final SubLSymbol $sym101$EQUALS_LIT_;
  private static final SubLSymbol $sym102$EVALUATE_LIT_;
  private static final SubLSymbol $sym103$AB_LIT_;
  private static final SubLSymbol $sym104$EL_MEETS_PRAGMATIC_REQUIREMENT_P;
  private static final SubLObject $const105$isa;
  private static final SubLObject $const106$Thing;
  private static final SubLObject $const107$quotedIsa;
  private static final SubLObject $const108$genls;
  private static final SubLObject $const109$genlPreds;
  private static final SubLObject $const110$genlInverse;
  private static final SubLObject $const111$genlMt;
  private static final SubLObject $const112$resultIsa;
  private static final SubLObject $const113$resultGenl;
  private static final SubLObject $const114$termOfUnit;
  private static final SubLObject $const115$equals;
  private static final SubLObject $const116$holdsIn;
  private static final SubLObject $const117$trueSentence;
  private static final SubLObject $const118$forwardNonTriggerLiteral;
  private static final SubLObject $const119$forwardTriggerLiteral;
  private static final SubLSymbol $sym120$DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_;
  private static final SubLObject $const121$defaultForwardNonTriggerPredicate;
  private static final SubLSymbol $sym122$_DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE__CACHING_STATE_;
  private static final SubLSymbol $sym123$CLEAR_DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_;
  private static final SubLObject $const124$evaluate;
  private static final SubLSymbol $sym125$CYCL_LITERAL_P;
  private static final SubLObject $const126$Kappa;
  private static final SubLObject $const127$Lambda;
  private static final SubLSymbol $sym128$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const129$EverythingPSC;
  private static final SubLObject $const130$microtheoryDesignationArgnum;
  private static final SubLObject $const131$sentenceDesignationArgnum;
  private static final SubLSymbol $sym132$BIND_ALL_FREE_VARS;
  private static final SubLSymbol $sym133$EL_RULE_FORMULA_P;
  private static final SubLString $str134$Tried_to_recursively_determine_th;
  private static final SubLSymbol $sym135$VAR_SPEC_;
  private static final SubLObject $const136$Predicate;
  private static final SubLObject $const137$Function_Denotational;
  private static final SubLSymbol $sym138$EXPAND_JOIN_LEFT;
  private static final SubLSymbol $sym139$EXPAND_THERE_EXIST_VARS;
  private static final SubLSymbol $sym140$EXPAND_FOR_ALL_VARS;
  private static final SubLSymbol $sym141$TRUE_SENTENCE_CASE_INSENSITIVE_EXPANSION;
  private static final SubLString $str142$termPhrases_CaseInsensitive;
  private static final SubLObject $const143$termPhrases;
  private static final SubLSymbol $sym144$ALPHABETIC_STRING_;
  private static final SubLObject $const145$regexStringMatch;
  private static final SubLString $str146$regexStringMatch_CaseInsensitive;
  private static final SubLObject $const147$trueSentence_CaseInsensitive;
  private static final SubLSymbol $sym148$GAF_;
  private static final SubLString $str149$_S_is_not_well_formed_;
  private static final SubLSymbol $sym150$DOTTED_LIST_P;
  private static final SubLSymbol $sym151$SCOPING_RELATION_EXPRESSION_;
  private static final SubLSymbol $sym152$FORMULA_WITH_SEQUENCE_NON_VAR_;
  private static final SubLSymbol $sym153$EL_IMPLICATION_P;
  private static final SubLSymbol $sym154$SCOPING_RELATION_P;
  private static final SubLSymbol $sym155$CYCL_QUOTED_TERM_P;
  private static final SubLSymbol $sym156$EXPAND_SUBL_FN_P;
  private static final SubLSymbol $sym157$FAST_ESCAPE_QUOTE_TERM_P;
  private static final SubLSymbol $sym158$FORMULA_QUANTIFIED_VARS_INT;
  private static final SubLObject $const159$CycLFormula;
  private static final SubLObject $const160$CycLSentence;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLString $str163$You_re_calling_the_function___A__;
  private static final SubLString $str164$__Replace_all_calls_to_it_with___;
  private static final SubLString $str165$__Notify__A_if_you_receive_this_w;
  private static final SubLString $str166$continue_anyway;
  private static final SubLSymbol $sym167$EL_VARIABLE_;
  private static final SubLSymbol $kw168$POS;
  private static final SubLObject $const169$True;
  private static final SubLObject $const170$False;
  private static final SubLSymbol $sym171$EQUALS_EL_MEMOIZED_;
  private static final SubLList $list172;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$HL_VAR_;
  private static final SubLSymbol $sym175$EL_VARIABLE_P;
  private static final SubLSymbol $kw176$UNBOUND_SEQ;
  private static final SubLSymbol $sym177$FORMULA_QUERY_SIGNATURE_TERM_P;
  private static final SubLSymbol $kw178$BOUND;
  private static final SubLSymbol $kw179$UNBOUND;
  private static final SubLSymbol $kw180$TERM;
  private static final SubLSymbol $sym181$BOUND_ARG_POSITION_BETTER_FOR_INDEXING_;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$FORMULA_WITH_NESTED_VARIABLE_;
  private static final SubLSymbol $kw184$TEST;
  private static final SubLSymbol $kw185$OWNER;
  private static final SubLSymbol $kw186$CLASSES;
  private static final SubLSymbol $kw187$KB;
  private static final SubLSymbol $kw188$TINY;
  private static final SubLSymbol $kw189$WORKING_;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$SORTED_SENTENCE_FREE_VARIABLES;
  private static final SubLList $list192;
  private static final SubLSymbol $sym193$SORTED_CONDITIONAL_SENTENCE_FREE_VARIABLES;
  private static final SubLList $list194;
  private static final SubLSymbol $sym195$STRING_TO_EL_VAR_NAME;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$OPTIMIZE_EL_FORMULA_VARIABLE_NAMES;
  private static final SubLSymbol $sym198$OPTIMIZED_EL_FORMULA_MATCHES_PATTERN;
  private static final SubLSymbol $kw199$FULL;
  private static final SubLObject $list200;

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 1632L)
  public static SubLObject el_formula_with_operator_p(final SubLObject formula, final SubLObject operator)
  {
    return makeBoolean( NIL != el_formula_p( formula ) && operator.equal( cycl_utilities.el_formula_operator( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 1917L)
  public static SubLObject el_formula_with_any_of_operators_p(final SubLObject formula, final SubLObject operators)
  {
    return makeBoolean( NIL != el_formula_p( formula ) && NIL != subl_promotions.memberP( cycl_utilities.el_formula_operator( formula ), operators, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 2209L)
  public static SubLObject el_negation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const3$not ) && NIL != el_unary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 2513L)
  public static SubLObject el_disjunction_p(final SubLObject v_object)
  {
    return el_formula_with_operator_p( v_object, $const5$or );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 2771L)
  public static SubLObject el_conjunction_p(final SubLObject v_object)
  {
    return el_formula_with_operator_p( v_object, $const7$and );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 2994L)
  public static SubLObject el_junction_p(final SubLObject formula)
  {
    return makeBoolean( NIL != el_conjunction_p( formula ) || NIL != el_disjunction_p( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 3260L)
  public static SubLObject el_implication_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const8$implies ) && NIL != el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 3552L)
  public static SubLObject el_equivalence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const9$equiv ) && NIL != el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 3840L)
  public static SubLObject el_xor_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const10$xor ) && NIL != el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 4116L)
  public static SubLObject cyc_const_general_implication_operator_p(final SubLObject v_object)
  {
    return makeBoolean( $const8$implies.eql( v_object ) || $const9$equiv.eql( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 4327L)
  public static SubLObject el_general_implication_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != cyc_const_general_implication_operator_p( cycl_utilities.el_formula_operator( v_object ) ) && NIL != el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 4707L)
  public static SubLObject el_conditional_sentence_p(final SubLObject v_object)
  {
    return el_implication_p( czer_utilities.unwrap_if_ist_permissive( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 4975L)
  public static SubLObject el_universal_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const11$forAll ) && NIL != el_binary_formula_p( v_object ) && NIL != cycl_variables.el_varP( cycl_utilities.el_formula_arg1( v_object,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 5309L)
  public static SubLObject el_multi_universal_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const12$forAllVars ) && NIL != el_binary_formula_p( v_object ) && NIL != list_utilities.list_of_type_p( $sym13$EL_VAR_, cycl_utilities
        .el_formula_arg1( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 5745L)
  public static SubLObject cycl_universal_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const11$forAll ) && NIL != el_binary_formula_p( v_object ) && NIL != cycl_variables.cyc_varP( cycl_utilities.el_formula_arg1( v_object,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 6010L)
  public static SubLObject el_existential_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const14$thereExists ) && NIL != el_binary_formula_p( v_object ) && NIL != cycl_variables.el_varP( cycl_utilities.el_formula_arg1( v_object,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 6412L)
  public static SubLObject el_multi_existential_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const15$thereExistVars ) && NIL != el_binary_formula_p( v_object ) && NIL != list_utilities.list_of_type_p( $sym13$EL_VAR_, cycl_utilities
        .el_formula_arg1( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 6860L)
  public static SubLObject el_existential_min_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const16$thereExistAtLeast ) && NIL != el_ternary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 7157L)
  public static SubLObject el_existential_max_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const17$thereExistAtMost ) && NIL != el_ternary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 7452L)
  public static SubLObject el_existential_exact_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const18$thereExistExactly ) && NIL != el_ternary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 7846L)
  public static SubLObject cyc_const_unary_logical_op_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $const3$not );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 8191L)
  public static SubLObject cyc_const_binary_logical_op_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const8$implies ) || v_object.eql( $const10$xor ) || v_object.eql( $const9$equiv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 8573L)
  public static SubLObject cyc_const_ternary_logical_op_p(final SubLObject v_object)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 8904L)
  public static SubLObject cyc_const_quaternary_logical_op_p(final SubLObject v_object)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 9242L)
  public static SubLObject cyc_const_quintary_logical_op_p(final SubLObject v_object)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 9594L)
  public static SubLObject cyc_const_variable_arity_logical_op_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const7$and ) || v_object.eql( $const5$or ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 9881L)
  public static SubLObject cyc_const_existential_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $const14$thereExists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 10018L)
  public static SubLObject cyc_const_universal_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $const11$forAll );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 10227L)
  public static SubLObject cyc_const_regular_quantifier_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cyc_const_existential_p( v_object ) || NIL != cyc_const_universal_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 10524L)
  public static SubLObject cyc_const_multi_quantifier_p(final SubLObject v_object)
  {
    return makeBoolean( $const15$thereExistVars.eql( v_object ) || $const12$forAllVars.eql( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 10732L)
  public static SubLObject possibly_el_regularly_quantified_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_binary_formula_p( v_object ) && NIL != cyc_const_regular_quantifier_p( cycl_utilities.sentence_arg0( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 11048L)
  public static SubLObject possibly_el_multiply_quantified_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_binary_formula_p( v_object ) && NIL != cyc_const_multi_quantifier_p( cycl_utilities.sentence_arg0( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 11344L)
  public static SubLObject cyc_const_bounded_existential_operator_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const18$thereExistExactly ) || v_object.eql( $const17$thereExistAtMost ) || v_object.eql( $const16$thereExistAtLeast ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 11690L)
  public static SubLObject user_defined_bounded_existential_operator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL == cyc_const_bounded_existential_operator_p( v_object ) && NIL != fort_types_interface.bounded_existential_quantifier_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 11996L)
  public static SubLObject el_bounded_existential_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != cyc_const_bounded_existential_operator_p( cycl_utilities.el_formula_operator( v_object ) ) && NIL != el_ternary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 12322L)
  public static SubLObject cyc_const_general_existential_operator_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const14$thereExists ) || NIL != cyc_const_bounded_existential_operator_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 12585L)
  public static SubLObject el_general_existential_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_existential_p( v_object ) || NIL != el_bounded_existential_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 12816L)
  public static SubLObject cyc_const_quantifier_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cyc_const_regular_quantifier_p( v_object ) || NIL != cyc_const_bounded_existential_operator_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 13073L)
  public static SubLObject possibly_el_quantified_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != possibly_el_regularly_quantified_sentence_p( v_object ) || NIL != possibly_el_multiply_quantified_sentence_p( v_object ) || NIL != el_bounded_existential_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 13405L)
  public static SubLObject cyc_const_logical_operator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cyc_const_unary_logical_op_p( v_object ) || NIL != cyc_const_binary_logical_op_p( v_object ) || NIL != cyc_const_ternary_logical_op_p( v_object )
        || NIL != cyc_const_quaternary_logical_op_p( v_object ) || NIL != cyc_const_quintary_logical_op_p( v_object ) || NIL != cyc_const_variable_arity_logical_op_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 13825L)
  public static SubLObject user_defined_logical_operator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL == cyc_const_logical_operator_p( v_object ) && NIL != fort_types_interface.logical_connective_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 14089L)
  public static SubLObject user_defined_sentential_relation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != user_defined_bounded_existential_operator_p( v_object ) || NIL != user_defined_logical_operator_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 14450L)
  public static SubLObject cyc_const_tense_operator_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const21$was ) || v_object.eql( $const22$hasAlwaysBeen ) || v_object.eql( $const23$willBe ) || v_object.eql( $const24$willAlwaysBe ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 14701L)
  public static SubLObject cyc_const_metric_tense_operator_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const25$was_Metric ) || v_object.eql( $const26$willBe_Metric ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 14913L)
  public static SubLObject cyc_const_generalized_tense_operator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cyc_const_tense_operator_p( v_object ) || NIL != cyc_const_metric_tense_operator_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 15076L)
  public static SubLObject cyc_const_sentential_relation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cyc_const_logical_operator_p( v_object ) || NIL != cyc_const_quantifier_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 15343L)
  public static SubLObject el_logical_operator_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != cyc_const_logical_operator_p( cycl_utilities.el_formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 15590L)
  public static SubLObject el_zero_arity_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != el_formula_arityE( v_object, ZERO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 15853L)
  public static SubLObject el_unary_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != el_formula_arityE( v_object, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 16074L)
  public static SubLObject el_binary_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != el_formula_arityE( v_object, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 16296L)
  public static SubLObject el_ternary_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != el_formula_arityE( v_object, THREE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 16519L)
  public static SubLObject el_quaternary_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != el_formula_arityE( v_object, FOUR_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 16745L)
  public static SubLObject subl_escape_p(final SubLObject v_object)
  {
    if( NIL != el_formula_p( v_object ) )
    {
      return makeBoolean( NIL != expand_subl_fn_p( v_object ) || NIL != subl_quote_p( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 17115L)
  public static SubLObject expand_subl_fn_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const27$ExpandSubLFn ) && NIL != el_formula_arityE( v_object, TWO_INTEGER, UNPROVIDED ) && cycl_utilities.el_formula_arg1( v_object, UNPROVIDED )
        .isList() && NIL != collection_defns.cyc_subl_template( cycl_utilities.el_formula_arg2( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 17428L)
  public static SubLObject subl_quote_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const28$SubLQuoteFn ) && NIL != el_formula_arityE( v_object, ONE_INTEGER, UNPROVIDED ) && NIL != collection_defns.cyc_subl_template( cycl_utilities
        .el_formula_arg1( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 17696L)
  public static SubLObject quotify_cycl_term(final SubLObject v_term)
  {
    return make_unary_formula( $const29$Quote, v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 17780L)
  public static SubLObject possibly_unquote(final SubLObject formula)
  {
    if( NIL != el_formula_with_operator_p( formula, $const29$Quote ) )
    {
      return cycl_utilities.el_formula_arg1( formula, UNPROVIDED );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 17934L)
  public static SubLObject possibly_unquote_closed_formula(final SubLObject formula)
  {
    if( NIL != el_formula_with_operator_p( formula, $const29$Quote ) && NIL != closedP( cycl_utilities.el_formula_arg1( formula, UNPROVIDED ), UNPROVIDED ) )
    {
      return subl_promotions.values2( cycl_utilities.el_formula_arg1( formula, UNPROVIDED ), T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 18180L)
  public static SubLObject possibly_quote(final SubLObject formula)
  {
    if( NIL == el_formula_with_operator_p( formula, $const29$Quote ) )
    {
      return quotify_cycl_term( formula );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 18336L)
  public static SubLObject possibly_quote_open_formula(final SubLObject formula, SubLObject quoteP)
  {
    if( quoteP == UNPROVIDED )
    {
      quoteP = T;
    }
    if( NIL == el_formula_with_operator_p( formula, $const29$Quote ) && ( NIL == closedP( formula, UNPROVIDED ) || NIL != quoteP ) )
    {
      return quotify_cycl_term( formula );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 18590L)
  public static SubLObject possibly_quote_reifiable_naut(final SubLObject v_object)
  {
    return ( NIL == forts.fort_p( v_object ) && NIL == cycl_grammar.cycl_quoted_term_p( v_object ) && NIL != cycl_utilities.expression_find_if( $sym30$REIFIABLE_FUNCTION_TERM_, v_object, NIL, UNPROVIDED ) )
        ? quotify_cycl_term( v_object )
        : v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 18838L)
  public static SubLObject elify(SubLObject v_object)
  {
    v_object = cycl_utilities.expression_transform( v_object, $sym31$ASSERTION_P, $sym32$ASSERTION_EL_IST_FORMULA, UNPROVIDED, UNPROVIDED );
    v_object = cycl_utilities.expression_transform( v_object, $sym33$NART_P, $sym34$NART_EL_FORMULA, UNPROVIDED, UNPROVIDED );
    v_object = cycl_utilities.expression_transform( v_object, $sym35$VARIABLE_P, $sym36$DEFAULT_EL_VAR_FOR_HL_VAR, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 19356L)
  public static SubLObject ist_sentence_designating_assertionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != ist_sentence_p( v_object, UNPROVIDED ) && NIL != czer_meta.find_assertion_cycl( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 19493L)
  public static SubLObject hlify(SubLObject v_object)
  {
    v_object = cycl_utilities.expression_transform( v_object, $sym37$IST_SENTENCE_DESIGNATING_ASSERTION_, $sym38$FIND_ASSERTION_CYCL, UNPROVIDED, UNPROVIDED );
    v_object = narts_high.nart_substitute( v_object );
    v_object = variables.canonicalize_default_el_vars( v_object );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 20007L)
  public static SubLObject sefify(final SubLObject v_object)
  {
    final SubLObject el = elify( v_object );
    final SubLObject hlifyP = makeBoolean( !v_object.equal( el ) );
    final SubLObject quotifyP = makeBoolean( NIL == list_utilities.self_evaluating_form_p( el ) );
    if( NIL != hlifyP && NIL != quotifyP )
    {
      return ConsesLow.list( $sym39$HLIFY, ConsesLow.list( $sym40$QUOTE, el ) );
    }
    if( NIL != hlifyP )
    {
      return $list41;
    }
    if( NIL != quotifyP )
    {
      return list_utilities.quotify( el );
    }
    return el;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 20417L)
  public static SubLObject epsilon_p(final SubLObject v_object)
  {
    return Types.sublisp_null( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 20643L)
  public static SubLObject cyc_const_exception_operator_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const42$exceptFor ) || v_object.eql( $const43$exceptWhen ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 20925L)
  public static SubLObject el_exception_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_binary_formula_p( v_object ) && NIL != cyc_const_exception_operator_p( cycl_utilities.el_formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 21241L)
  public static SubLObject el_abnormal_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const44$abnormal ) && NIL != el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 21634L)
  public static SubLObject cyc_const_pragmatic_requirement_operator_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $const45$pragmaticRequirement );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 21914L)
  public static SubLObject el_pragmatic_requirement_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_binary_formula_p( v_object ) && NIL != cyc_const_pragmatic_requirement_operator_p( cycl_utilities.el_formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 22091L)
  public static SubLObject el_meets_pragmatic_requirement_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const46$meetsPragmaticRequirement ) && NIL != el_binary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 22427L)
  public static SubLObject el_query_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const47$querySentence ) && NIL != el_unary_formula_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 22710L)
  public static SubLObject el_implicit_meta_literal_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_exception_p( v_object ) || NIL != el_pragmatic_requirement_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 23118L)
  public static SubLObject elf_p(final SubLObject v_object)
  {
    return Types.consp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 23586L)
  public static SubLObject el_formula_p(final SubLObject v_object)
  {
    return elf_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 24063L)
  public static SubLObject possibly_fo_naut_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != forts.fort_p( cycl_utilities.el_formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 24390L)
  public static SubLObject possibly_fo_represented_term_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) || NIL != possibly_fo_naut_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 24714L)
  public static SubLObject possibly_nat_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) || NIL != possibly_naut_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 25009L)
  public static SubLObject possibly_naut_p(final SubLObject v_object)
  {
    return el_formula_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 25237L)
  public static SubLObject possibly_sentence_p(final SubLObject v_object)
  {
    return el_formula_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 25589L)
  public static SubLObject possibly_cycl_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != possibly_sentence_p( v_object ) || NIL != cycl_grammar.cycl_truth_value_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 26040L)
  public static SubLObject possibly_sentence_or_variable_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != possibly_sentence_p( v_object ) || NIL != cycl_grammar.cycl_variable_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 26256L)
  public static SubLObject possibly_inference_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != possibly_cycl_sentence_p( v_object ) || NIL != cycl_grammar.el_variable_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 26467L)
  public static SubLObject possibly_atomic_sentence_p(final SubLObject v_object)
  {
    return el_formula_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 26740L)
  public static SubLObject contains_subformula_p(final SubLObject v_object)
  {
    if( NIL != el_formula_p( v_object ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( v_object, $kw48$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_formula_p( v_term ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 27001L)
  public static SubLObject el_subformulas(final SubLObject formula)
  {
    return cycl_utilities.formula_gather( formula, $sym49$EL_RELATION_EXPRESSION_, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 27185L)
  public static SubLObject el_general_existential_negation_p(final SubLObject formula)
  {
    return makeBoolean( NIL != el_general_existential_p( formula ) && NIL != el_negation_p( quantified_sub_sentence( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 27559L)
  public static SubLObject el_universal_negation_p(final SubLObject formula)
  {
    return makeBoolean( NIL != el_universal_p( formula ) && NIL != el_negation_p( quantified_sub_sentence( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 27890L)
  public static SubLObject el_quantified_negation_p(final SubLObject formula)
  {
    if( NIL != possibly_el_quantified_sentence_p( formula ) )
    {
      final SubLObject sub_formula = quantified_sub_sentence( formula );
      if( NIL != el_negation_p( sub_formula ) )
      {
        return T;
      }
      if( NIL != el_conjunction_p( sub_formula ) || NIL != el_disjunction_p( sub_formula ) )
      {
        SubLObject non_negationP = NIL;
        final SubLObject args = cycl_utilities.formula_args( cycl_utilities.formula_args( sub_formula, UNPROVIDED ), $kw48$IGNORE );
        SubLObject rest;
        SubLObject junct;
        for( rest = NIL, rest = args; NIL == non_negationP && NIL != rest; non_negationP = makeBoolean( NIL == el_negation_p( junct ) ), rest = rest.rest() )
        {
          junct = rest.first();
        }
        return makeBoolean( NIL == non_negationP );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29052L)
  public static SubLObject el_non_empty_list_p(final SubLObject obj)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( obj, $const50$TheList ) && NIL != cycl_utilities.el_formula_args( obj, $kw51$INCLUDE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29203L)
  public static SubLObject el_empty_list_p(final SubLObject obj)
  {
    return makeBoolean( obj.eql( $const52$TheEmptyList ) || ( NIL != el_formula_with_operator_p( obj, $const50$TheList ) && NIL == formula_with_sequence_varP( obj ) && NIL == cycl_utilities.el_formula_args( obj,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29413L)
  public static SubLObject el_list_p(final SubLObject obj)
  {
    return makeBoolean( NIL != el_non_empty_list_p( obj ) || NIL != el_empty_list_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29513L)
  public static SubLObject el_set_or_collection_p(final SubLObject v_object)
  {
    return makeBoolean( ( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.collectionP( v_object ) ) || NIL != el_set_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29659L)
  public static SubLObject el_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_extensional_set_p( v_object ) || NIL != el_intensional_set_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29773L)
  public static SubLObject el_extensional_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_empty_set_p( v_object ) || NIL != el_non_empty_set_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 29891L)
  public static SubLObject el_empty_set_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const53$TheEmptySet ) || ( NIL != el_formula_with_operator_p( v_object, $const54$TheSet ) && NIL == formula_with_sequence_varP( v_object ) && NIL == cycl_utilities.el_formula_args(
        v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 30140L)
  public static SubLObject el_non_empty_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const54$TheSet ) && NIL != cycl_utilities.el_formula_args( v_object, $kw51$INCLUDE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 30285L)
  public static SubLObject el_intensional_set_p(final SubLObject v_object)
  {
    return el_formula_with_operator_p( v_object, $const55$TheSetOf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 30427L)
  public static SubLObject canonicalize_extensional_set(final SubLObject el_set)
  {
    return make_el_extensional_set( extensional_set_elements( el_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 30543L)
  public static SubLObject canonical_extensional_set_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_extensional_set_p( v_object ) && v_object.equal( canonicalize_extensional_set( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 30694L)
  public static SubLObject make_el_extensional_set(final SubLObject objects)
  {
    assert NIL != Types.listp( objects ) : objects;
    if( NIL == objects )
    {
      return $const53$TheEmptySet;
    }
    return make_el_non_empty_set( objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 30870L)
  public static SubLObject make_el_non_empty_set(final SubLObject objects)
  {
    if( NIL == kb_control_vars.quant_kb_loaded_p() )
    {
      Errors.error( $str57$A_KB_dependent_numerical_quantifi );
    }
    final SubLObject elements = czer_main.order_commutative_terms( Sequences.remove_duplicates( objects, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return make_el_formula( $const54$TheSet, elements, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 31241L)
  public static SubLObject extensional_set_elements(final SubLObject el_set)
  {
    if( el_set.eql( $const53$TheEmptySet ) )
    {
      return NIL;
    }
    if( cycl_utilities.nat_functor( el_set ).eql( $const54$TheSet ) )
    {
      return Sequences.remove_duplicates( cycl_utilities.nat_args( el_set, UNPROVIDED ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 31498L)
  public static SubLObject specs_fn_naut_p(final SubLObject obj)
  {
    return makeBoolean( NIL != possibly_naut_p( obj ) && cycl_utilities.nat_functor( obj ).eql( $const58$SpecsFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 31636L)
  public static SubLObject specs_fn_arg(final SubLObject specs_fn_naut)
  {
    return cycl_utilities.nat_arg1( specs_fn_naut, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 31715L)
  public static SubLObject el_sequence_p(final SubLObject v_object)
  {
    return Types.consp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 32017L)
  public static SubLObject el_proper_sequence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_sequence_p( v_object ) && NIL == conses_high.last( v_object, UNPROVIDED ).rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 32328L)
  public static SubLObject groundP(final SubLObject expression, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return Types.sublisp_null( cycl_utilities.expression_find_if( varP, expression, NIL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 32557L)
  public static SubLObject hl_ground_tree_p(final SubLObject tree)
  {
    return variables.fully_bound_p( tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 32627L)
  public static SubLObject closedP(final SubLObject expression, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return makeBoolean( NIL != groundP( expression, varP ) || NIL != no_free_variablesP( expression, varP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 32861L)
  public static SubLObject no_free_variablesP(final SubLObject expression, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return Types.sublisp_null( literal_free_variables( expression, NIL, varP, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 33084L)
  public static SubLObject string_to_el_var_name(final SubLObject string)
  {
    if( NIL != cycl_variables.valid_el_var_nameP( string ) )
    {
      return string_utilities.copy_string( string );
    }
    final SubLObject result_length = string_to_el_var_name_int( string, NIL );
    return string_to_el_var_name_int( string, result_length );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 33445L)
  public static SubLObject string_to_el_var_name_int(final SubLObject string, final SubLObject result_length)
  {
    SubLObject previous_char = Characters.CHAR_hyphen;
    SubLObject i = ZERO_INTEGER;
    final SubLObject result_string = ( NIL != result_length ) ? Strings.make_string( result_length, UNPROVIDED ) : NIL;
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$1 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$1 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string, char_num );
      if( NIL != Characters.lower_case_p( v_char ) )
      {
        if( NIL != result_length )
        {
          Vectors.set_aref( result_string, i, Characters.char_upcase( v_char ) );
        }
        i = Numbers.add( i, ONE_INTEGER );
      }
      else if( NIL != Characters.alphanumericp( v_char ) )
      {
        if( NIL != result_length )
        {
          Vectors.set_aref( result_string, i, v_char );
        }
        i = Numbers.add( i, ONE_INTEGER );
      }
      else if( ( v_char.eql( Characters.CHAR_space ) || v_char.eql( Characters.CHAR_hyphen ) ) && !previous_char.eql( Characters.CHAR_hyphen ) && !previous_char.eql( Characters.CHAR_space ) )
      {
        if( NIL != result_length )
        {
          Vectors.set_aref( result_string, i, Characters.CHAR_hyphen );
        }
        i = Numbers.add( i, ONE_INTEGER );
      }
      previous_char = v_char;
    }
    if( NIL != result_length )
    {
      return result_string;
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 34431L)
  public static SubLObject optimize_el_formula_variable_names(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject minimize_change_from_formula)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    if( minimize_change_from_formula == UNPROVIDED )
    {
      minimize_change_from_formula = NIL;
    }
    assert NIL != el_formula_p( formula ) : formula;
    if( NIL == language_mt )
    {
      language_mt = pph_vars.pph_language_mt();
    }
    if( NIL == domain_mt )
    {
      domain_mt = pph_vars.pph_domain_mt();
    }
    return pph_utilities.pph_optimize_formula_variable_names( formula, language_mt, domain_mt, minimize_change_from_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 35113L)
  public static SubLObject noptimize_el_formula_variable_names(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject minimize_change_from_formula)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    if( minimize_change_from_formula == UNPROVIDED )
    {
      minimize_change_from_formula = NIL;
    }
    assert NIL != el_formula_p( formula ) : formula;
    if( NIL == language_mt )
    {
      language_mt = pph_vars.pph_language_mt();
    }
    if( NIL == domain_mt )
    {
      domain_mt = pph_vars.pph_domain_mt();
    }
    return pph_utilities.pph_noptimize_formula_variable_names( formula, language_mt, domain_mt, minimize_change_from_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 35840L)
  public static SubLObject optimize_el_formula_variable_name(final SubLObject var, final SubLObject formula, SubLObject language_mt, SubLObject domain_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    assert NIL != cycl_variables.el_varP( var ) : var;
    assert NIL != el_formula_p( formula ) : formula;
    if( NIL == language_mt )
    {
      language_mt = pph_vars.pph_language_mt();
    }
    if( NIL == domain_mt )
    {
      domain_mt = pph_vars.pph_domain_mt();
    }
    return cycl_variables.el_var_name( correct_variable( cycl_variables.make_el_var( Sequences.substitute( Characters.CHAR_hyphen, Characters.CHAR_space, pph_utilities.pph_optimize_formula_variable_name( var, formula,
        language_mt, domain_mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 36460L)
  public static SubLObject correct_variables(final SubLObject v_variables)
  {
    SubLObject correction_pair_alist = NIL;
    SubLObject cdolist_list_var = v_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject validated_variable = correct_variable( variable );
      if( NIL != validated_variable )
      {
        correction_pair_alist = list_utilities.alist_enter( correction_pair_alist, variable, validated_variable, EQL );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return correction_pair_alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 36899L)
  public static SubLObject xyz_ify_el_formula_variable_names(final SubLObject el_sentence)
  {
    assert NIL != el_grammar.el_sentence_p( el_sentence ) : el_sentence;
    SubLObject new_sentence = copy_expression( el_sentence );
    final SubLObject query_vars = obsolete.formula_variables( el_sentence, $sym13$EL_VAR_, UNPROVIDED );
    SubLObject all_query_vars = conses_high.copy_list( query_vars );
    SubLObject cdolist_list_var = query_vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject other_query_vars = Sequences.delete( var, all_query_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject new_var = next_named_var( other_query_vars, var );
      new_sentence = cycl_utilities.expression_nsubst( new_var, var, new_sentence, UNPROVIDED, UNPROVIDED );
      all_query_vars = ConsesLow.cons( new_var, other_query_vars );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return new_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 37679L)
  public static SubLObject next_named_var(final SubLObject known_vars, final SubLObject original_var)
  {
    SubLObject cdolist_list_var = $standard_single_letter_el_var_names$.getGlobalValue();
    SubLObject possible_var = NIL;
    possible_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == conses_high.member( possible_var, known_vars, UNPROVIDED, UNPROVIDED ) )
      {
        return possible_var;
      }
      cdolist_list_var = cdolist_list_var.rest();
      possible_var = cdolist_list_var.first();
    }
    return cycl_variables.make_el_var( Sequences.cconcatenate( string_utilities.str( original_var ), $str68$_1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 38085L)
  public static SubLObject correct_variable(final SubLObject variable)
  {
    SubLObject validated_variable = NIL;
    validated_variable = Sequences.substitute( Characters.CHAR_hyphen, Characters.CHAR_underbar, Strings.string_upcase( cycl_variables.el_var_name( variable ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != Characters.charE( Strings.sublisp_char( validated_variable, ONE_INTEGER ), Characters.CHAR_question ) )
    {
      validated_variable = Sequences.cconcatenate( Sequences.subseq( validated_variable, ZERO_INTEGER, TWO_INTEGER ), Sequences.remove_if( $sym69$INVALID_VARIABLE_NAME_CHAR, Sequences.subseq( validated_variable,
          TWO_INTEGER, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      validated_variable = Sequences.cconcatenate( Sequences.subseq( validated_variable, ZERO_INTEGER, ONE_INTEGER ), Sequences.remove_if( $sym69$INVALID_VARIABLE_NAME_CHAR, Sequences.subseq( validated_variable,
          ONE_INTEGER, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    validated_variable = cycl_variables.make_el_var( validated_variable );
    if( NIL == cycl_variables.valid_el_varP( validated_variable ) )
    {
      return NIL;
    }
    return validated_variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 38999L)
  public static SubLObject simple_variable_rename_impossibleP(final SubLObject assertion, final SubLObject rename_variable_alist)
  {
    final SubLObject el_formula = uncanonicalizer.assertion_el_formula( assertion );
    final SubLObject assertion_el_variables = assertions_high.assertion_el_variables( assertion );
    final SubLObject v_variables = list_utilities.alist_keys( rename_variable_alist );
    if( NIL != contains_polycanonicalized_existential_quantifier( el_formula, assertions_high.assertion_mt( assertion ) ) )
    {
      return T;
    }
    if( NIL != list_utilities.duplicatesP( v_variables, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    final SubLObject full_alist = list_utilities.alist_extend( rename_variable_alist, assertion_el_variables );
    final SubLObject renamed_variables = list_utilities.alist_values( full_alist );
    return list_utilities.duplicatesP( renamed_variables, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 40415L)
  public static SubLObject contains_polycanonicalized_existential_quantifier(final SubLObject formula, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject existential_quantifiers = cdolist_list_var = isa.all_fort_instances( $const70$ExistentialQuantifier, UNPROVIDED, UNPROVIDED );
    SubLObject existential_quantifier = NIL;
    existential_quantifier = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.tree_find( existential_quantifier, formula, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject assertions = czer_meta.find_assertions_cycl( formula, mt );
        if( NIL == list_utilities.singletonP( assertions ) )
        {
          return T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      existential_quantifier = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 41040L)
  public static SubLObject sequence_term(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$el_supports_dot_syntaxP$.getDynamicValue( thread ) )
    {
      if( NIL != el_formula_p( formula ) )
      {
        return conses_high.last( formula, UNPROVIDED ).rest();
      }
      if( NIL != nart_handles.nart_p( formula ) )
      {
        return NIL;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 41620L)
  public static SubLObject sequence_var(final SubLObject relation, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    final SubLObject seqterm = sequence_term( relation );
    if( NIL == seqterm )
    {
      return NIL;
    }
    if( varP.eql( $sym59$CYC_VAR_ ) )
    {
      if( NIL != cycl_variables.cyc_varP( seqterm ) )
      {
        return seqterm;
      }
      return NIL;
    }
    else
    {
      if( NIL != Functions.funcall( varP, seqterm ) )
      {
        return seqterm;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 42329L)
  public static SubLObject sequence_non_var(final SubLObject relation, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    final SubLObject seqterm = sequence_term( relation );
    if( NIL == seqterm )
    {
      return NIL;
    }
    if( NIL != Functions.funcall( varP, seqterm ) )
    {
      return NIL;
    }
    return seqterm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 42745L)
  public static SubLObject maybe_add_sequence_var_to_end(final SubLObject seqvar, final SubLObject formula)
  {
    return ( NIL != seqvar ) ? list_utilities.add_to_dotted_end( seqvar, formula ) : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 43226L)
  public static SubLObject add_sequence_var_to_end(final SubLObject seqvar, final SubLObject formula)
  {
    return list_utilities.add_to_dotted_end( seqvar, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 43492L)
  public static SubLObject nadd_sequence_var_to_end(final SubLObject seqvar, final SubLObject formula)
  {
    return list_utilities.nadd_to_dotted_end( seqvar, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 43655L)
  public static SubLObject strip_sequence_var(final SubLObject formula)
  {
    return list_utilities.dotted_butlast( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 43854L)
  public static SubLObject safe_strip_sequence_var(final SubLObject formula)
  {
    return ( NIL != sequence_var( formula, UNPROVIDED ) ) ? strip_sequence_var( formula ) : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 44064L)
  public static SubLObject formula_with_sequence_termP(final SubLObject formula)
  {
    return list_utilities.sublisp_boolean( sequence_term( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 44177L)
  public static SubLObject el_formula_without_sequence_termP(final SubLObject formula)
  {
    return list_utilities.proper_list_p( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 44391L)
  public static SubLObject formula_with_sequence_varP(final SubLObject formula)
  {
    return list_utilities.sublisp_boolean( sequence_var( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 44502L)
  public static SubLObject formula_with_sequence_non_varP(final SubLObject formula)
  {
    return list_utilities.sublisp_boolean( sequence_non_var( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 44733L)
  public static SubLObject ignore_sequence_vars(final SubLObject formula)
  {
    return ( NIL != sequence_var( formula, UNPROVIDED ) ) ? strip_sequence_var( formula ) : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 44930L)
  public static SubLObject regularize_sequence_vars(final SubLObject formula)
  {
    final SubLObject seqvar = sequence_var( formula, UNPROVIDED );
    return ( NIL != seqvar ) ? ConsesLow.append( strip_sequence_var( formula ), ConsesLow.list( seqvar ) ) : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 45186L)
  public static SubLObject opaquify_subl_escape(final SubLObject subl_escape)
  {
    assert NIL != subl_escape_p( subl_escape ) : subl_escape;
    final SubLObject pcase_var = cycl_utilities.el_formula_operator( subl_escape );
    if( pcase_var.eql( $const27$ExpandSubLFn ) )
    {
      return make_formula( $const27$ExpandSubLFn, $list72, UNPROVIDED );
    }
    if( pcase_var.eql( $const28$SubLQuoteFn ) )
    {
      return make_formula( $const28$SubLQuoteFn, $list73, UNPROVIDED );
    }
    Errors.error( $str74$unexpected_subl_escape_type__s, subl_escape );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 45623L)
  public static SubLObject opaquify_subl_escapes(final SubLObject expression)
  {
    return ( NIL != el_formula_p( expression ) && NIL != list_utilities.tree_find_if( $sym71$SUBL_ESCAPE_P, expression, UNPROVIDED ) ) ? cycl_utilities.formula_transform( expression, $sym71$SUBL_ESCAPE_P,
        $sym75$OPAQUIFY_SUBL_ESCAPE, UNPROVIDED, UNPROVIDED ) : expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 45926L)
  public static SubLObject nopaquify_subl_escapes(final SubLObject formula)
  {
    return cycl_utilities.formula_ntransform( formula, $sym71$SUBL_ESCAPE_P, $sym75$OPAQUIFY_SUBL_ESCAPE, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 46050L)
  public static SubLObject term_is_one_of_argsP(final SubLObject v_term, final SubLObject formula)
  {
    SubLObject resultP = NIL;
    final SubLObject args = cycl_utilities.formula_args( formula, $kw48$IGNORE );
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = args; NIL == resultP && NIL != rest; rest = rest.rest() )
    {
      arg = rest.first();
      if( v_term.equal( arg ) )
      {
        resultP = T;
      }
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 46245L)
  public static SubLObject formula_position(final SubLObject v_term, final SubLObject formula, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return Sequences.position( v_term, cycl_utilities.formula_terms( formula, UNPROVIDED ), test, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 46370L)
  public static SubLObject formula_arity(final SubLObject formula, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    if( NIL != cycl_utilities.possibly_cycl_formula_p( formula ) )
    {
      return Sequences.length( cycl_utilities.formula_args( formula, seqvar_handling ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 47324L)
  public static SubLObject arglist_arity(final SubLObject arglist, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    if( NIL != el_formula_p( arglist ) )
    {
      return Sequences.length( cycl_utilities.formula_terms( arglist, seqvar_handling ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 47932L)
  public static SubLObject expression_arity(final SubLObject relational_expression, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return formula_arity( relational_expression, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 48088L)
  public static SubLObject formula_length(final SubLObject formula, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return Sequences.length( cycl_utilities.formula_terms( formula, seqvar_handling ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 48516L)
  public static SubLObject formula_arityL(final SubLObject formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula ) && NIL != subl_promotions.positive_integer_p( v_arity ) && NIL != list_utilities.lengthL( cycl_utilities.formula_args( formula,
        seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 48810L)
  public static SubLObject formula_arityLE(final SubLObject formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula ) && v_arity.isInteger() && NIL != list_utilities.lengthLE( cycl_utilities.formula_args( formula, seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 49108L)
  public static SubLObject formula_arityG(final SubLObject formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula ) && v_arity.isInteger() && NIL != list_utilities.lengthG( cycl_utilities.formula_args( formula, seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 49395L)
  public static SubLObject formula_arityGE(final SubLObject formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula ) && v_arity.isInteger() && NIL != list_utilities.lengthGE( cycl_utilities.formula_args( formula, seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 49696L)
  public static SubLObject el_formula_arityGE(final SubLObject el_formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != el_formula_p( el_formula ) && v_arity.isInteger() && NIL != list_utilities.lengthGE( cycl_utilities.el_formula_args( el_formula, seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 50004L)
  public static SubLObject formula_arityE(final SubLObject formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula ) && v_arity.isInteger() && NIL != list_utilities.lengthE( cycl_utilities.formula_args( formula, seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 50287L)
  public static SubLObject el_formula_arityE(final SubLObject el_formula, final SubLObject v_arity, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != el_formula_p( el_formula ) && v_arity.isInteger() && NIL != list_utilities.lengthE( cycl_utilities.el_formula_args( el_formula, seqvar_handling ), v_arity, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 50577L)
  public static SubLObject greater_formula_arity_p(final SubLObject formula1, final SubLObject formula2, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula1 ) && NIL != cycl_utilities.possibly_cycl_formula_p( formula2 ) && NIL != list_utilities.greater_length_p( cycl_utilities.formula_args(
        formula1, seqvar_handling ), cycl_utilities.formula_args( formula2, seqvar_handling ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 50958L)
  public static SubLObject same_formula_arity_p(final SubLObject formula1, final SubLObject formula2, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula1 ) && NIL != cycl_utilities.possibly_cycl_formula_p( formula2 ) && NIL != list_utilities.same_length_p( cycl_utilities.formula_args(
        formula1, seqvar_handling ), cycl_utilities.formula_args( formula2, seqvar_handling ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 51326L)
  public static SubLObject greater_or_same_formula_arity_p(final SubLObject formula1, final SubLObject formula2, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula1 ) && NIL != cycl_utilities.possibly_cycl_formula_p( formula2 ) && NIL != list_utilities.greater_or_same_length_p( cycl_utilities
        .formula_args( formula1, seqvar_handling ), cycl_utilities.formula_args( formula2, seqvar_handling ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 51736L)
  public static SubLObject lesser_formula_arity_p(final SubLObject formula1, final SubLObject formula2, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula1 ) && NIL != cycl_utilities.possibly_cycl_formula_p( formula2 ) && NIL != list_utilities.lesser_length_p( cycl_utilities.formula_args(
        formula1, seqvar_handling ), cycl_utilities.formula_args( formula2, seqvar_handling ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 52113L)
  public static SubLObject lesser_or_same_formula_arity_p(final SubLObject formula1, final SubLObject formula2, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return makeBoolean( NIL != cycl_utilities.possibly_cycl_formula_p( formula1 ) && NIL != cycl_utilities.possibly_cycl_formula_p( formula2 ) && NIL != list_utilities.lesser_or_same_length_p( cycl_utilities
        .formula_args( formula1, seqvar_handling ), cycl_utilities.formula_args( formula2, seqvar_handling ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 52519L)
  public static SubLObject compatible_formula_arity_p(final SubLObject formula1, final SubLObject formula2)
  {
    final SubLObject seqvar1P = formula_with_sequence_varP( formula1 );
    final SubLObject seqvar2P = formula_with_sequence_varP( formula2 );
    if( NIL == seqvar1P && NIL == seqvar2P )
    {
      return same_formula_arity_p( formula1, formula2, UNPROVIDED );
    }
    if( NIL != seqvar1P && NIL != seqvar2P )
    {
      return T;
    }
    final SubLObject seqvar_formula = ( NIL != seqvar1P ) ? formula1 : formula2;
    final SubLObject seqvar_formula_min_arity = formula_arity( seqvar_formula, $kw48$IGNORE );
    final SubLObject fixed_formula = ( NIL != seqvar1P ) ? formula2 : formula1;
    return formula_arityGE( fixed_formula, seqvar_formula_min_arity, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 53333L)
  public static SubLObject first_in_sequence(final SubLObject sequence)
  {
    if( NIL != el_sequence_p( sequence ) )
    {
      return sequence.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 53719L)
  public static SubLObject rest_of_sequence(final SubLObject sequence)
  {
    if( NIL != el_sequence_p( sequence ) )
    {
      return sequence.rest();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 53902L)
  public static SubLObject last_of_sequence(final SubLObject sequence)
  {
    if( NIL != el_sequence_p( sequence ) )
    {
      return conses_high.last( sequence, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 54049L)
  public static SubLObject butlast_of_sequence(final SubLObject sequence)
  {
    if( NIL != el_sequence_p( sequence ) )
    {
      return list_utilities.dotted_butlast( sequence );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 54229L)
  public static SubLObject every_in_sequence(final SubLObject test, final SubLObject sequence)
  {
    if( NIL != el_sequence_p( sequence ) )
    {
      return list_utilities.every_in_list( test, sequence, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 54416L)
  public static SubLObject sentence_quantifier(final SubLObject sentence)
  {
    if( NIL != possibly_el_quantified_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg0( sentence );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 54646L)
  public static SubLObject quantified_var_list(final SubLObject sentence)
  {
    if( NIL != cycl_grammar.cycl_multiply_quantified_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 55027L)
  public static SubLObject quantified_var(final SubLObject sentence)
  {
    if( NIL != cycl_grammar.cycl_bounded_existential_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg2( sentence, UNPROVIDED );
    }
    if( NIL != possibly_el_regularly_quantified_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 55533L)
  public static SubLObject quantified_var_argnum(final SubLObject sentence)
  {
    return quantified_var_argnum_for_operator( cycl_utilities.sentence_arg0( sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 55653L)
  public static SubLObject quantified_var_argnum_for_operator(final SubLObject operator)
  {
    if( NIL != cycl_grammar.cycl_regular_quantifier_p( operator ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != cycl_grammar.cycl_bounded_existential_quantifier_p( operator ) )
    {
      return TWO_INTEGER;
    }
    el_error( FOUR_INTEGER, $str76$not_a_known_quantifier___s, operator, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 55912L)
  public static SubLObject existential_bound(final SubLObject sentence)
  {
    if( NIL != cycl_grammar.cycl_bounded_existential_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 56278L)
  public static SubLObject quantified_sub_sentence(final SubLObject sentence)
  {
    if( NIL != possibly_el_regularly_quantified_sentence_p( sentence ) || NIL != possibly_el_multiply_quantified_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg2( sentence, UNPROVIDED );
    }
    if( NIL != cycl_grammar.cycl_bounded_existential_sentence_p( sentence ) )
    {
      return cycl_utilities.sentence_arg3( sentence, UNPROVIDED );
    }
    el_error( FOUR_INTEGER, $str77$not_quantified_sentence___s, sentence, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 56940L)
  public static SubLObject quantified_sub_sentence_argnum(final SubLObject sentence)
  {
    return quantified_sub_sentence_argnum_for_operator( cycl_utilities.sentence_arg0( sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 57249L)
  public static SubLObject quantified_sub_sentence_argnum_for_operator(final SubLObject operator)
  {
    if( NIL != cycl_grammar.cycl_regular_quantifier_p( operator ) || NIL != cycl_grammar.cycl_multi_quantifier_p( operator ) )
    {
      return TWO_INTEGER;
    }
    if( NIL != cycl_grammar.cycl_bounded_existential_quantifier_p( operator ) )
    {
      return THREE_INTEGER;
    }
    el_error( FOUR_INTEGER, $str76$not_a_known_quantifier___s, operator, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 57566L)
  public static SubLObject el_list_items(final SubLObject el_list)
  {
    assert NIL != el_list_p( el_list ) : el_list;
    if( el_list.eql( $const52$TheEmptyList ) )
    {
      return NIL;
    }
    return cycl_utilities.el_formula_args( el_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 57733L)
  public static SubLObject el_list_length(final SubLObject el_list)
  {
    assert NIL != el_list_p( el_list ) : el_list;
    if( el_list.eql( $const52$TheEmptyList ) )
    {
      return ZERO_INTEGER;
    }
    return formula_arity( el_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 57897L)
  public static SubLObject do_el_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    SubLObject el_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    element_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    el_list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym80$CDOLIST, ConsesLow.list( element_var, ConsesLow.list( $sym81$EL_LIST_ITEMS, el_list ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 58093L)
  public static SubLObject do_el_list_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    SubLObject number_var = NIL;
    SubLObject el_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    element_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    number_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    el_list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym83$CDOLIST_NUMBERED, ConsesLow.list( element_var, number_var, ConsesLow.list( $sym81$EL_LIST_ITEMS, el_list ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 58339L)
  public static SubLObject el_list_to_subl_list_recursively(final SubLObject el_list)
  {
    assert NIL != el_list_p( el_list ) : el_list;
    return el_list_to_subl_list_recursively_int( el_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 58487L)
  public static SubLObject el_list_to_subl_list_recursively_int(final SubLObject el_list)
  {
    SubLObject subl_list = NIL;
    SubLObject cdolist_list_var = el_list_items( el_list );
    SubLObject list_element = NIL;
    list_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_list_p( list_element ) )
      {
        subl_list = ConsesLow.cons( el_list_to_subl_list_recursively_int( list_element ), subl_list );
      }
      else
      {
        subl_list = ConsesLow.cons( list_element, subl_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      list_element = cdolist_list_var.first();
    }
    return Sequences.nreverse( subl_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 58860L)
  public static SubLObject cycl_subl_symbol_symbol(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != collection_defns.cycl_subl_symbol_p( v_object ) )
    {
      return cycl_utilities.formula_arg1( v_object, UNPROVIDED );
    }
    if( NIL != $dont_enforce_subl_escape_in_symbols$.getDynamicValue( thread ) )
    {
      return v_object;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 59121L)
  public static SubLObject cycl_subl_symbol_symbol_list(final SubLObject object_list)
  {
    if( !object_list.isList() )
    {
      return NIL;
    }
    SubLObject symbol_list = NIL;
    SubLObject cdolist_list_var = object_list;
    SubLObject v_object = NIL;
    v_object = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      symbol_list = ConsesLow.cons( cycl_subl_symbol_symbol( v_object ), symbol_list );
      cdolist_list_var = cdolist_list_var.rest();
      v_object = cdolist_list_var.first();
    }
    return Sequences.nreverse( symbol_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 59497L)
  public static SubLObject subl_escape_subl(final SubLObject subl_escape)
  {
    if( NIL != subl_escape_p( subl_escape ) )
    {
      final SubLObject pcase_var = cycl_utilities.formula_operator( subl_escape );
      if( pcase_var.eql( $const27$ExpandSubLFn ) )
      {
        return cycl_utilities.formula_arg2( subl_escape, UNPROVIDED );
      }
      if( pcase_var.eql( $const28$SubLQuoteFn ) )
      {
        return cycl_utilities.formula_arg1( subl_escape, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 59815L)
  public static SubLObject el_extensional_set_elements(final SubLObject el_set)
  {
    assert NIL != el_set_p( el_set ) : el_set;
    if( el_set.eql( $const53$TheEmptySet ) )
    {
      return NIL;
    }
    return cycl_utilities.el_formula_args( el_set, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 59991L)
  public static SubLObject el_set_size(final SubLObject el_set)
  {
    assert NIL != el_set_p( el_set ) : el_set;
    if( el_set.eql( $const53$TheEmptySet ) )
    {
      return ZERO_INTEGER;
    }
    return formula_arity( el_set, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 60146L)
  public static SubLObject list_to_elf(final SubLObject list)
  {
    assert NIL != Types.consp( list ) : list;
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 60514L)
  public static SubLObject elf_to_list(final SubLObject formula)
  {
    assert NIL != elf_p( formula ) : formula;
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 60833L)
  public static SubLObject make_el_formula(final SubLObject operator, final SubLObject args, SubLObject sequence_var)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    return ( NIL != sequence_var ) ? ConsesLow.append( ConsesLow.cons( operator, conses_high.copy_list( args ) ), sequence_var ) : ConsesLow.cons( operator, conses_high.copy_list( args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 61211L)
  public static SubLObject make_formula(final SubLObject operator, final SubLObject args, SubLObject sequence_var)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    return make_el_formula( operator, args, sequence_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 61512L)
  public static SubLObject copy_formula(final SubLObject formula)
  {
    return conses_high.copy_tree( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 61626L)
  public static SubLObject copy_sentence(final SubLObject sentence)
  {
    return conses_high.copy_tree( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 61744L)
  public static SubLObject copy_clause(final SubLObject clause)
  {
    return conses_high.copy_tree( clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 61839L)
  public static SubLObject copy_clauses(final SubLObject v_clauses)
  {
    return conses_high.copy_tree( v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 61938L)
  public static SubLObject copy_expression(final SubLObject expression)
  {
    return conses_high.copy_tree( expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 62049L)
  public static SubLObject make_el_literal(final SubLObject predicate, final SubLObject args, SubLObject sequence_var)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    return make_el_formula( predicate, args, sequence_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 62309L)
  public static SubLObject make_unary_formula(final SubLObject operator, final SubLObject arg)
  {
    return ConsesLow.list( operator, arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 62476L)
  public static SubLObject make_binary_formula(final SubLObject operator, final SubLObject arg1, final SubLObject arg2)
  {
    return ConsesLow.list( operator, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 62665L)
  public static SubLObject make_ternary_formula(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    return ConsesLow.list( operator, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 62875L)
  public static SubLObject make_quaternary_formula(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    return ConsesLow.list( operator, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 63106L)
  public static SubLObject make_negation(final SubLObject sentence)
  {
    return make_unary_formula( $const3$not, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 63309L)
  public static SubLObject make_disjunction(final SubLObject args)
  {
    return make_formula( $const5$or, args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 63575L)
  public static SubLObject make_conjunction(final SubLObject args)
  {
    return make_formula( $const7$and, args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 63843L)
  public static SubLObject make_implication(final SubLObject antecedent, final SubLObject consequent)
  {
    return make_binary_formula( $const8$implies, antecedent, consequent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 64044L)
  public static SubLObject make_universal(final SubLObject var, final SubLObject sentence)
  {
    return make_binary_formula( $const11$forAll, var, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 64234L)
  public static SubLObject make_existential(final SubLObject var, final SubLObject sentence)
  {
    return make_binary_formula( $const14$thereExists, var, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 64438L)
  public static SubLObject make_regularly_quantified_sentence(final SubLObject quantifier, final SubLObject var, final SubLObject subsent)
  {
    return make_binary_formula( quantifier, var, subsent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 64568L)
  public static SubLObject make_multiply_quantified_sentence(final SubLObject quantifier, final SubLObject vars, final SubLObject subsent)
  {
    return make_binary_formula( quantifier, vars, subsent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 64699L)
  public static SubLObject make_bounded_existential(final SubLObject quantifier, final SubLObject bound, final SubLObject var, final SubLObject subsent)
  {
    return make_ternary_formula( quantifier, bound, var, subsent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 64987L)
  public static SubLObject make_existential_min(final SubLObject num, final SubLObject var, final SubLObject sentence)
  {
    return make_bounded_existential( $const16$thereExistAtLeast, num, var, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 65200L)
  public static SubLObject make_existential_max(final SubLObject num, final SubLObject var, final SubLObject sentence)
  {
    return make_bounded_existential( $const17$thereExistAtMost, num, var, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 65411L)
  public static SubLObject make_existential_exact(final SubLObject num, final SubLObject var, final SubLObject sentence)
  {
    return make_bounded_existential( $const18$thereExistExactly, num, var, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 65677L)
  public static SubLObject make_ist_sentence(final SubLObject mt, final SubLObject sentence)
  {
    return make_binary_formula( $const88$ist, mt, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 65854L)
  public static SubLObject make_ist_sentence_from_mt_asent_sense(final SubLObject mt, final SubLObject asent, final SubLObject sense)
  {
    final SubLObject literal = clause_utilities.asent_sense_to_literal( asent, sense );
    return make_ist_sentence( mt, literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 66025L)
  public static SubLObject make_unary_nat_formula(final SubLObject functor, final SubLObject arg)
  {
    return make_unary_formula( functor, arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 66254L)
  public static SubLObject make_binary_nat_formula(final SubLObject functor, final SubLObject arg1, final SubLObject arg2)
  {
    return make_binary_formula( functor, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 66497L)
  public static SubLObject make_nat_formula(final SubLObject functor, final SubLObject args)
  {
    return make_formula( functor, args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 66711L)
  public static SubLObject make_el_list(final SubLObject list, SubLObject sequence_var)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    assert NIL != Types.listp( list ) : list;
    if( NIL != list )
    {
      return make_el_formula( $const50$TheList, list, sequence_var );
    }
    if( NIL != sequence_var )
    {
      return make_el_formula( $const50$TheList, NIL, sequence_var );
    }
    return $const52$TheEmptyList;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 66984L)
  public static SubLObject make_el_list_recursively(final SubLObject list, SubLObject sequence_var, SubLObject depth)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != Types.listp( list ) : list;
    if( NIL != list )
    {
      return make_el_list_recursively_int( list, sequence_var, depth );
    }
    if( NIL != sequence_var )
    {
      return make_el_formula( $const50$TheList, NIL, sequence_var );
    }
    return $const52$TheEmptyList;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 67284L)
  public static SubLObject make_el_list_recursively_int(final SubLObject v_object, SubLObject sequence_var, SubLObject depth)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( depth.eql( ZERO_INTEGER ) )
    {
      return v_object;
    }
    SubLObject el_list_elements = NIL;
    if( v_object.isList() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject list_element = NIL;
      list_element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        el_list_elements = ConsesLow.cons( make_el_list_recursively_int( list_element, NIL, ( NIL != subl_promotions.positive_integer_p( depth ) ) ? Numbers.subtract( depth, ONE_INTEGER ) : NIL ), el_list_elements );
        cdolist_list_var = cdolist_list_var.rest();
        list_element = cdolist_list_var.first();
      }
      return make_el_list( Sequences.nreverse( el_list_elements ), sequence_var );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 67721L)
  public static SubLObject make_cycl_subl_symbol(final SubLObject symbol)
  {
    if( symbol.isSymbol() )
    {
      return make_unary_formula( $const28$SubLQuoteFn, symbol );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 67851L)
  public static SubLObject make_el_set(final SubLObject v_set, SubLObject sequence_var)
  {
    if( sequence_var == UNPROVIDED )
    {
      sequence_var = NIL;
    }
    assert NIL != list_utilities.list_without_repetition_p( v_set, UNPROVIDED, UNPROVIDED ) : v_set;
    if( NIL != v_set )
    {
      return make_el_formula( $const54$TheSet, v_set, sequence_var );
    }
    if( NIL != sequence_var )
    {
      return make_el_formula( $const54$TheSet, NIL, sequence_var );
    }
    return $const53$TheEmptySet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 68140L)
  public static SubLObject el_set_items(final SubLObject el_set)
  {
    assert NIL != el_set_p( el_set ) : el_set;
    if( el_set.eql( $const53$TheEmptySet ) )
    {
      return NIL;
    }
    return cycl_utilities.el_formula_args( el_set, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 68300L)
  public static SubLObject make_instance_named(final SubLObject name, final SubLObject collection)
  {
    return make_binary_formula( $const90$InstanceNamedFn, name, collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 68458L)
  public static SubLObject make_specs_fn(final SubLObject collection)
  {
    return make_unary_formula( $const58$SpecsFn, collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 68626L)
  public static SubLObject unmake_unary_formula(final SubLObject formula)
  {
    return subl_promotions.values2( cycl_utilities.formula_arg0( formula ), cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 68916L)
  public static SubLObject unmake_binary_formula(final SubLObject formula)
  {
    return subl_promotions.values3( cycl_utilities.formula_arg0( formula ), cycl_utilities.formula_arg1( formula, UNPROVIDED ), cycl_utilities.formula_arg2( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 69176L)
  public static SubLObject unmake_ternary_formula(final SubLObject formula)
  {
    return subl_promotions.values4( cycl_utilities.formula_arg0( formula ), cycl_utilities.formula_arg1( formula, UNPROVIDED ), cycl_utilities.formula_arg2( formula, UNPROVIDED ), cycl_utilities.formula_arg3( formula,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 69472L)
  public static SubLObject unmake_quaternary_formula(final SubLObject formula)
  {
    return Values.values( cycl_utilities.formula_arg0( formula ), cycl_utilities.formula_arg1( formula, UNPROVIDED ), cycl_utilities.formula_arg2( formula, UNPROVIDED ), cycl_utilities.formula_arg3( formula,
        UNPROVIDED ), cycl_utilities.formula_arg4( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 69832L)
  public static SubLObject map_formula_args(final SubLObject func, final SubLObject formula, SubLObject map_seqvarP)
  {
    if( map_seqvarP == UNPROVIDED )
    {
      map_seqvarP = NIL;
    }
    if( NIL == el_formula_p( formula ) )
    {
      return NIL;
    }
    final SubLObject args = cycl_utilities.formula_args( formula, $kw51$INCLUDE );
    if( !args.isCons() )
    {
      return formula;
    }
    SubLObject new_args = NIL;
    SubLObject arg = NIL;
    SubLObject remaining_args = NIL;
    SubLObject argnum = NIL;
    arg = args.first();
    for( remaining_args = args.rest(), argnum = ONE_INTEGER; NIL != remaining_args && !remaining_args.isAtom(); remaining_args = remaining_args.rest(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
    {
      new_args = ConsesLow.cons( ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? arg : Functions.funcall( func, arg ), new_args );
      arg = remaining_args.first();
    }
    new_args = ConsesLow.cons( ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? arg : Functions.funcall( func, arg ), new_args );
    if( NIL != remaining_args )
    {
      SubLObject final_args = ( NIL != map_seqvarP && NIL == cycl_utilities.opaque_seqvarP( formula ) ) ? Functions.funcall( func, remaining_args ) : remaining_args;
      SubLObject cdolist_list_var = new_args;
      SubLObject new_arg = NIL;
      new_arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final_args = ConsesLow.cons( new_arg, final_args );
        cdolist_list_var = cdolist_list_var.rest();
        new_arg = cdolist_list_var.first();
      }
      return make_formula( cycl_utilities.formula_arg0( formula ), final_args, UNPROVIDED );
    }
    return make_formula( cycl_utilities.formula_arg0( formula ), Sequences.nreverse( new_args ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 71753L)
  public static SubLObject nmap_formula_args(final SubLObject func, final SubLObject formula, SubLObject map_seqvarP)
  {
    if( map_seqvarP == UNPROVIDED )
    {
      map_seqvarP = NIL;
    }
    if( NIL != el_formula_p( formula ) )
    {
      final SubLObject args = cycl_utilities.formula_args( formula, $kw51$INCLUDE );
      if( args.isCons() )
      {
        SubLObject curr_args = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        SubLObject remaining_args = NIL;
        curr_args = args;
        arg = curr_args.first();
        argnum = ONE_INTEGER;
        for( remaining_args = curr_args.rest(); NIL != remaining_args && !remaining_args.isAtom(); remaining_args = curr_args.rest() )
        {
          ConsesLow.rplaca( curr_args, ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? arg : Functions.funcall( func, arg ) );
          curr_args = curr_args.rest();
          arg = curr_args.first();
          argnum = Numbers.add( ONE_INTEGER, argnum );
        }
        ConsesLow.rplaca( curr_args, ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? arg : Functions.funcall( func, arg ) );
        if( NIL != remaining_args && NIL != map_seqvarP && NIL == cycl_utilities.opaque_seqvarP( formula ) )
        {
          ConsesLow.rplacd( curr_args, Functions.funcall( func, remaining_args ) );
        }
      }
      return formula;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 72552L)
  public static SubLObject map_formula_terms(final SubLObject func, final SubLObject formula, SubLObject map_seqvarP)
  {
    if( map_seqvarP == UNPROVIDED )
    {
      map_seqvarP = NIL;
    }
    if( NIL == el_formula_p( formula ) )
    {
      return NIL;
    }
    final SubLObject terms = cycl_utilities.formula_terms( formula, $kw51$INCLUDE );
    if( !terms.isCons() )
    {
      return formula;
    }
    SubLObject new_terms = NIL;
    SubLObject v_term = NIL;
    SubLObject remaining_terms = NIL;
    SubLObject argnum = NIL;
    v_term = terms.first();
    for( remaining_terms = terms.rest(), argnum = ZERO_INTEGER; NIL != remaining_terms && !remaining_terms.isAtom(); remaining_terms = remaining_terms.rest(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
    {
      new_terms = ConsesLow.cons( ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? v_term : Functions.funcall( func, v_term ), new_terms );
      v_term = remaining_terms.first();
    }
    new_terms = ConsesLow.cons( ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? v_term : Functions.funcall( func, v_term ), new_terms );
    if( NIL != remaining_terms )
    {
      SubLObject final_terms = ( NIL != map_seqvarP && NIL == cycl_utilities.opaque_seqvarP( formula ) ) ? Functions.funcall( func, remaining_terms ) : remaining_terms;
      SubLObject cdolist_list_var = new_terms;
      SubLObject new_term = NIL;
      new_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final_terms = ConsesLow.cons( new_term, final_terms );
        cdolist_list_var = cdolist_list_var.rest();
        new_term = cdolist_list_var.first();
      }
      return list_to_elf( final_terms );
    }
    return list_to_elf( Sequences.nreverse( new_terms ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 74281L)
  public static SubLObject nmap_formula_terms(final SubLObject func, final SubLObject formula, SubLObject map_seqvarP)
  {
    if( map_seqvarP == UNPROVIDED )
    {
      map_seqvarP = NIL;
    }
    if( NIL != el_formula_p( formula ) )
    {
      final SubLObject terms = cycl_utilities.formula_terms( formula, $kw51$INCLUDE );
      if( terms.isCons() )
      {
        SubLObject curr_terms = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        SubLObject remaining_terms = NIL;
        curr_terms = terms;
        v_term = curr_terms.first();
        argnum = ZERO_INTEGER;
        for( remaining_terms = curr_terms.rest(); NIL != remaining_terms && !remaining_terms.isAtom(); remaining_terms = curr_terms.rest() )
        {
          ConsesLow.rplaca( curr_terms, ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? v_term : Functions.funcall( func, v_term ) );
          curr_terms = curr_terms.rest();
          v_term = curr_terms.first();
          argnum = Numbers.add( ONE_INTEGER, argnum );
        }
        ConsesLow.rplaca( curr_terms, ( NIL != cycl_utilities.opaque_argP( formula, argnum ) ) ? v_term : Functions.funcall( func, v_term ) );
        if( NIL != remaining_terms && NIL != map_seqvarP && NIL == cycl_utilities.opaque_seqvarP( formula ) )
        {
          ConsesLow.rplacd( curr_terms, Functions.funcall( func, remaining_terms ) );
        }
      }
      return formula;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 75108L)
  public static SubLObject map_formula_terms_if(final SubLObject func, final SubLObject formula, final SubLObject test, SubLObject map_seqvarP)
  {
    if( map_seqvarP == UNPROVIDED )
    {
      map_seqvarP = NIL;
    }
    if( NIL == el_formula_p( formula ) )
    {
      return NIL;
    }
    final SubLObject terms = cycl_utilities.formula_terms( formula, $kw51$INCLUDE );
    if( !terms.isCons() )
    {
      return formula;
    }
    SubLObject new_terms = NIL;
    SubLObject v_term = NIL;
    SubLObject remaining_terms = NIL;
    SubLObject argnum = NIL;
    v_term = terms.first();
    for( remaining_terms = terms.rest(), argnum = ZERO_INTEGER; NIL != remaining_terms && !remaining_terms.isAtom(); remaining_terms = remaining_terms.rest(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
    {
      new_terms = ConsesLow.cons( ( NIL == cycl_utilities.opaque_argP( formula, argnum ) && NIL != Functions.funcall( test, v_term ) ) ? Functions.funcall( func, v_term ) : v_term, new_terms );
      v_term = remaining_terms.first();
    }
    new_terms = ConsesLow.cons( ( NIL == cycl_utilities.opaque_argP( formula, argnum ) && NIL != Functions.funcall( test, v_term ) ) ? Functions.funcall( func, v_term ) : v_term, new_terms );
    if( NIL != remaining_terms )
    {
      SubLObject final_terms = ( NIL != map_seqvarP && NIL == cycl_utilities.opaque_seqvarP( formula ) && NIL != Functions.funcall( test, remaining_terms ) ) ? Functions.funcall( func, remaining_terms )
          : remaining_terms;
      SubLObject cdolist_list_var = new_terms;
      SubLObject new_term = NIL;
      new_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final_terms = ConsesLow.cons( new_term, final_terms );
        cdolist_list_var = cdolist_list_var.rest();
        new_term = cdolist_list_var.first();
      }
      return list_to_elf( final_terms );
    }
    return list_to_elf( new_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 76863L)
  public static SubLObject map_formula_terms_if_not(final SubLObject func, final SubLObject formula, final SubLObject test, SubLObject map_seqvarP)
  {
    if( map_seqvarP == UNPROVIDED )
    {
      map_seqvarP = NIL;
    }
    if( NIL == el_formula_p( formula ) )
    {
      return NIL;
    }
    final SubLObject terms = cycl_utilities.formula_terms( formula, $kw51$INCLUDE );
    if( !terms.isCons() )
    {
      return formula;
    }
    SubLObject new_terms = NIL;
    SubLObject v_term = NIL;
    SubLObject argnum = NIL;
    SubLObject remaining_terms = NIL;
    v_term = terms.first();
    argnum = ZERO_INTEGER;
    for( remaining_terms = terms.rest(); NIL != remaining_terms && !remaining_terms.isAtom(); remaining_terms = remaining_terms.rest() )
    {
      new_terms = ConsesLow.cons( ( NIL != cycl_utilities.opaque_argP( formula, argnum ) || NIL != Functions.funcall( test, v_term ) ) ? v_term : Functions.funcall( func, v_term ), new_terms );
      v_term = remaining_terms.first();
      argnum = Numbers.add( ONE_INTEGER, argnum );
    }
    new_terms = ConsesLow.cons( ( NIL != cycl_utilities.opaque_argP( formula, argnum ) || NIL != Functions.funcall( test, v_term ) ) ? v_term : Functions.funcall( func, v_term ), new_terms );
    if( NIL != remaining_terms )
    {
      SubLObject final_terms = ( NIL == map_seqvarP || NIL != cycl_utilities.opaque_seqvarP( formula ) || NIL != Functions.funcall( test, remaining_terms ) ) ? remaining_terms
          : Functions.funcall( func, remaining_terms );
      SubLObject cdolist_list_var = new_terms;
      SubLObject new_term = NIL;
      new_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final_terms = ConsesLow.cons( new_term, final_terms );
        cdolist_list_var = cdolist_list_var.rest();
        new_term = cdolist_list_var.first();
      }
      return list_to_elf( final_terms );
    }
    return list_to_elf( new_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 78629L)
  public static SubLObject pass_through_if_negation(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_negation_p( formula ) && NIL == cycl_utilities.opaque_argP( formula, ONE_INTEGER ) )
    {
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding( thread );
      try
      {
        czer_vars.$within_negationP$.bind( makeBoolean( NIL == czer_vars.$within_negationP$.getDynamicValue( thread ) ), thread );
        result = make_negation( Functions.funcall( function, cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) );
      }
      finally
      {
        czer_vars.$within_negationP$.rebind( _prev_bind_0, thread );
      }
      return subl_promotions.values2( result, T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 79176L)
  public static SubLObject pass_through_if_disjunction(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_disjunction_p( formula ) )
    {
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = at_vars.$within_negated_disjunctionP$.currentBinding( thread );
      try
      {
        at_vars.$within_disjunctionP$.bind( T, thread );
        at_vars.$within_negated_disjunctionP$.bind( czer_vars.$within_negationP$.getDynamicValue( thread ), thread );
        result = nmap_formula_args( function, formula, UNPROVIDED );
      }
      finally
      {
        at_vars.$within_negated_disjunctionP$.rebind( _prev_bind_2, thread );
        at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
      }
      return subl_promotions.values2( result, T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 79612L)
  public static SubLObject pass_through_if_conjunction(final SubLObject function, final SubLObject formula)
  {
    if( NIL != el_conjunction_p( formula ) )
    {
      return subl_promotions.values2( nmap_formula_args( function, formula, UNPROVIDED ), T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 79985L)
  public static SubLObject pass_through_if_regularly_quantified(final SubLObject function, final SubLObject formula)
  {
    if( NIL != possibly_el_regularly_quantified_sentence_p( formula ) && NIL == cycl_utilities.opaque_argP( formula, quantified_sub_sentence_argnum( formula ) ) )
    {
      return subl_promotions.values2( make_regularly_quantified_sentence( sentence_quantifier( formula ), quantified_var( formula ), Functions.funcall( function, quantified_sub_sentence( formula ) ) ), T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 80635L)
  public static SubLObject pass_through_if_bounded_existential(final SubLObject function, final SubLObject formula)
  {
    if( NIL != el_bounded_existential_p( formula ) && NIL == cycl_utilities.opaque_argP( formula, quantified_sub_sentence_argnum( formula ) ) )
    {
      return subl_promotions.values2( make_bounded_existential( sentence_quantifier( formula ), existential_bound( formula ), quantified_var( formula ), Functions.funcall( function, quantified_sub_sentence(
          formula ) ) ), T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 81282L)
  public static SubLObject pass_through_if_junction(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = pass_through_if_disjunction( function, formula );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != changedP )
    {
      return subl_promotions.values2( result, changedP );
    }
    return pass_through_if_conjunction( function, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 81738L)
  public static SubLObject pass_through_if_logical_op(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_logical_operator_formula_p( formula ) )
    {
      return subl_promotions.values2( formula, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject result = pass_through_if_negation( function, formula );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != changedP )
    {
      return subl_promotions.values2( result, T );
    }
    thread.resetMultipleValues();
    final SubLObject result_2 = pass_through_if_junction( function, formula );
    final SubLObject changed_2P = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != changed_2P )
    {
      return subl_promotions.values2( result_2, T );
    }
    return subl_promotions.values2( nmap_formula_args( function, formula, UNPROVIDED ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 82449L)
  public static SubLObject pass_through_if_quantified(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = pass_through_if_regularly_quantified( function, formula );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != changedP )
    {
      return subl_promotions.values2( result, T );
    }
    return pass_through_if_bounded_existential( function, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 82937L)
  public static SubLObject pass_through_if_logical_op_or_quantified(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = pass_through_if_logical_op( function, formula );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != changedP )
    {
      return subl_promotions.values2( result, T );
    }
    return pass_through_if_quantified( function, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 83450L)
  public static SubLObject pass_through_if_relation_syntax(final SubLObject function, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = pass_through_if_logical_op_or_quantified( function, formula );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != changedP )
    {
      return subl_promotions.values2( result, T );
    }
    if( NIL != term.relation_syntaxP( formula, UNPROVIDED ) )
    {
      return subl_promotions.values2( nmap_formula_terms( function, formula, UNPROVIDED ), T );
    }
    return subl_promotions.values2( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 84048L)
  public static SubLObject funcall_formula_arg(final SubLObject function, final SubLObject formula, final SubLObject argnum)
  {
    final SubLObject arg = cycl_utilities.formula_arg( formula, argnum, UNPROVIDED );
    if( NIL != cycl_utilities.opaque_argP( formula, argnum ) )
    {
      return arg;
    }
    return Functions.funcall( function, arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 84331L)
  public static SubLObject funcall_formula_arg_binary(final SubLObject function, final SubLObject formula, final SubLObject argnum, final SubLObject arg2_to_function)
  {
    final SubLObject arg = cycl_utilities.formula_arg( formula, argnum, UNPROVIDED );
    if( NIL != cycl_utilities.opaque_argP( formula, argnum ) )
    {
      return arg;
    }
    return Functions.funcall( function, arg, arg2_to_function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 84692L)
  public static SubLObject replace_formula_arg(final SubLObject argnum, final SubLObject new_arg, final SubLObject formula)
  {
    SubLObject new_terms = NIL;
    final SubLObject seqvar = sequence_var( formula, UNPROVIDED );
    final SubLObject terms = cycl_utilities.formula_terms( formula, $kw48$IGNORE );
    SubLObject list_var = NIL;
    SubLObject arg = NIL;
    SubLObject n = NIL;
    list_var = terms;
    arg = list_var.first();
    for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), n = number_utilities.f_1X( n ) )
    {
      if( n.numE( argnum ) )
      {
        new_terms = ConsesLow.cons( new_arg, new_terms );
      }
      else
      {
        new_terms = ConsesLow.cons( arg, new_terms );
      }
    }
    final SubLObject new_formula = Sequences.nreverse( new_terms );
    final SubLObject new_operator = cycl_utilities.formula_operator( new_formula );
    final SubLObject new_args = cycl_utilities.formula_args( new_formula, UNPROVIDED );
    return make_formula( new_operator, new_args, seqvar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 85242L)
  public static SubLObject nreplace_formula_arg(final SubLObject argnum, final SubLObject new_arg, final SubLObject formula)
  {
    final SubLObject seqvar = sequence_var( formula, UNPROVIDED );
    final SubLObject formula_$2 = ( NIL != seqvar ) ? strip_sequence_var( formula ) : formula;
    SubLObject result = NIL;
    result = list_utilities.nreplace_nth( argnum, new_arg, formula_$2 );
    if( NIL != seqvar )
    {
      return nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 85537L)
  public static SubLObject remove_formula_arg(final SubLObject argnum, final SubLObject formula)
  {
    SubLObject new_terms = NIL;
    final SubLObject seqvar = sequence_var( formula, UNPROVIDED );
    final SubLObject terms = cycl_utilities.formula_terms( formula, $kw48$IGNORE );
    SubLObject list_var = NIL;
    SubLObject arg = NIL;
    SubLObject n = NIL;
    list_var = terms;
    arg = list_var.first();
    for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), n = number_utilities.f_1X( n ) )
    {
      if( !n.numE( argnum ) )
      {
        new_terms = ConsesLow.cons( arg, new_terms );
      }
    }
    final SubLObject new_formula = Sequences.nreverse( new_terms );
    final SubLObject new_operator = cycl_utilities.formula_operator( new_formula );
    final SubLObject new_args = cycl_utilities.formula_args( new_formula, UNPROVIDED );
    return make_formula( new_operator, new_args, seqvar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 85992L)
  public static SubLObject replace_formula_arg_position(final SubLObject arg_position, final SubLObject new_arg, final SubLObject formula)
  {
    final SubLObject list = elf_to_list( formula );
    final SubLObject new_list = list_utilities.replace_nested_nth( list, arg_position, new_arg );
    final SubLObject new_formula = list_to_elf( new_list );
    return new_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 86343L)
  public static SubLObject nreplace_formula_arg_position(final SubLObject arg_position, final SubLObject new_arg, final SubLObject formula)
  {
    final SubLObject list = elf_to_list( formula );
    final SubLObject new_list = list_utilities.nreplace_nested_nth( list, arg_position, new_arg );
    final SubLObject new_formula = list_to_elf( new_list );
    return new_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 86695L)
  public static SubLObject formula_has_arg_position_p(final SubLObject formula, final SubLObject arg_position)
  {
    return list_utilities.has_nested_nth_p( elf_to_list( formula ), arg_position );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 87125L)
  public static SubLObject replace_arg_of_pred_lambda_test(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $replace_arg_of_pred_pred$.getDynamicValue( thread ) ) && $replace_arg_of_pred_arg$.getDynamicValue( thread ).equal( cycl_utilities.formula_arg(
        v_object, $replace_arg_of_pred_argnum$.getDynamicValue( thread ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 87351L)
  public static SubLObject replace_arg_of_pred_lambda_transform(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return replace_formula_arg( $replace_arg_of_pred_argnum$.getDynamicValue( thread ), $replace_arg_of_pred_new_arg$.getDynamicValue( thread ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 87510L)
  public static SubLObject replace_arg_of_pred(final SubLObject tree, final SubLObject pred, final SubLObject argnum, final SubLObject arg, final SubLObject new_arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $replace_arg_of_pred_pred$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $replace_arg_of_pred_argnum$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $replace_arg_of_pred_arg$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $replace_arg_of_pred_new_arg$.currentBinding( thread );
    try
    {
      $replace_arg_of_pred_pred$.bind( pred, thread );
      $replace_arg_of_pred_argnum$.bind( argnum, thread );
      $replace_arg_of_pred_arg$.bind( arg, thread );
      $replace_arg_of_pred_new_arg$.bind( new_arg, thread );
      result = transform_list_utilities.transform( tree, $sym93$REPLACE_ARG_OF_PRED_LAMBDA_TEST, $sym94$REPLACE_ARG_OF_PRED_LAMBDA_TRANSFORM, UNPROVIDED );
    }
    finally
    {
      $replace_arg_of_pred_new_arg$.rebind( _prev_bind_4, thread );
      $replace_arg_of_pred_arg$.rebind( _prev_bind_3, thread );
      $replace_arg_of_pred_argnum$.rebind( _prev_bind_2, thread );
      $replace_arg_of_pred_pred$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 88051L)
  public static SubLObject literal_atomic_sentence(final SubLObject literal)
  {
    if( NIL == el_formula_p( literal ) )
    {
      return NIL;
    }
    if( NIL != el_negation_p( literal ) )
    {
      return cycl_utilities.formula_arg1( literal, $kw95$REGULARIZE );
    }
    return literal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 88724L)
  public static SubLObject literal_truth(final SubLObject literal)
  {
    if( NIL != el_negation_p( literal ) )
    {
      return $kw96$FALSE;
    }
    return $kw97$TRUE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 88836L)
  public static SubLObject literal_sense(final SubLObject literal)
  {
    return enumeration_types.truth_sense( literal_truth( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 88923L)
  public static SubLObject literal_args(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return cycl_utilities.formula_args( literal_atomic_sentence( literal ), seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 89417L)
  public static SubLObject literal_terms(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return cycl_utilities.formula_terms( literal_atomic_sentence( literal ), seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 89949L)
  public static SubLObject literal_arg(final SubLObject literal, final SubLObject argnum, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return cycl_utilities.formula_arg( literal_atomic_sentence( literal ), argnum, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 90712L)
  public static SubLObject literal_predicate(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return literal_arg0( literal, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 91046L)
  public static SubLObject literal_arg0(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return cycl_utilities.formula_arg0( literal_atomic_sentence( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 91440L)
  public static SubLObject literal_arg1(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return literal_arg( literal, ONE_INTEGER, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 91752L)
  public static SubLObject literal_arg2(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return literal_arg( literal, TWO_INTEGER, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 92061L)
  public static SubLObject literal_arg3(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return literal_arg( literal, THREE_INTEGER, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 92296L)
  public static SubLObject literal_arg4(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return literal_arg( literal, FOUR_INTEGER, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 92531L)
  public static SubLObject literal_arg5(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return literal_arg( literal, FIVE_INTEGER, seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 92766L)
  public static SubLObject literal_arity(final SubLObject literal, SubLObject seqvar_handling)
  {
    if( seqvar_handling == UNPROVIDED )
    {
      seqvar_handling = $kw48$IGNORE;
    }
    return formula_arity( literal_atomic_sentence( literal ), seqvar_handling );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 93641L)
  public static SubLObject asent_and_sense_to_literal(final SubLObject asent, final SubLObject sense)
  {
    return asent_and_truth_to_literal( asent, enumeration_types.sense_truth( sense ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 93762L)
  public static SubLObject asent_and_truth_to_literal(final SubLObject asent, final SubLObject truth)
  {
    return ( $kw96$FALSE == truth ) ? cycl_utilities.negate( asent ) : asent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 93883L)
  public static SubLObject el_negative_sentences(final SubLObject sentences)
  {
    return list_utilities.remove_if_not( $sym98$EL_NEGATION_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 94248L)
  public static SubLObject el_positive_sentences(final SubLObject sentences)
  {
    return Sequences.remove_if( $sym98$EL_NEGATION_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 94519L)
  public static SubLObject isa_lits(final SubLObject literals)
  {
    return list_utilities.remove_if_not( $sym99$ISA_LIT_, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 94700L)
  public static SubLObject tou_lits(final SubLObject literals)
  {
    return list_utilities.remove_if_not( $sym100$TOU_LIT_, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 94888L)
  public static SubLObject equals_lits(final SubLObject literals)
  {
    return list_utilities.remove_if_not( $sym101$EQUALS_LIT_, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 95078L)
  public static SubLObject evaluate_lits(final SubLObject literals)
  {
    return list_utilities.remove_if_not( $sym102$EVALUATE_LIT_, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 95274L)
  public static SubLObject ab_lits(final SubLObject literals)
  {
    return list_utilities.remove_if_not( $sym103$AB_LIT_, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 95458L)
  public static SubLObject meets_pragmatic_requirement_asents(final SubLObject asents)
  {
    return list_utilities.remove_if_not( $sym104$EL_MEETS_PRAGMATIC_REQUIREMENT_P, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 95705L)
  public static SubLObject pred_lits(final SubLObject literals, final SubLObject pred)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pred_litP( literal, pred ) )
      {
        result = ConsesLow.cons( literal, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 95974L)
  public static SubLObject reflexive_lits(final SubLObject literals)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != reflexive_litP( lit ) )
      {
        ans = ConsesLow.cons( lit, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 96238L)
  public static SubLObject remove_tou_lits(final SubLObject lits)
  {
    return Sequences.remove_if( $sym100$TOU_LIT_, lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 96403L)
  public static SubLObject el_negated_literal_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_negation_p( v_object ) && NIL != el_grammar.el_literal_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 96545L)
  public static SubLObject unary_lit_p(final SubLObject literal)
  {
    return el_unary_formula_p( literal_atomic_sentence( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 96746L)
  public static SubLObject binary_lit_p(final SubLObject literal)
  {
    return el_binary_formula_p( literal_atomic_sentence( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 96950L)
  public static SubLObject pred_litP(final SubLObject literal, final SubLObject pred)
  {
    if( NIL != el_formula_p( literal ) && NIL == el_negation_p( literal ) )
    {
      return Equality.eql( literal_arg0( literal, UNPROVIDED ), pred );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 97245L)
  public static SubLObject ab_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const44$abnormal ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 97434L)
  public static SubLObject isa_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const105$isa ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 97614L)
  public static SubLObject isa_var_fort_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const105$isa ) && NIL != binary_lit_p( lit ) && NIL != cycl_variables.cyc_varP( cycl_utilities.formula_arg1( lit, UNPROVIDED ) ) && NIL != forts.fort_p( cycl_utilities
        .formula_arg2( lit, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 97928L)
  public static SubLObject isa_var_var_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const105$isa ) && NIL != binary_lit_p( lit ) && NIL != cycl_variables.cyc_varP( cycl_utilities.formula_arg1( lit, UNPROVIDED ) ) && NIL != cycl_variables.cyc_varP(
        cycl_utilities.formula_arg2( lit, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 98102L)
  public static SubLObject isa_hl_var_hl_var_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const105$isa ) && NIL != binary_lit_p( lit ) && NIL != cycl_grammar.hl_variable_p( cycl_utilities.formula_arg1( lit, UNPROVIDED ) ) && NIL != cycl_grammar.hl_variable_p(
        cycl_utilities.formula_arg2( lit, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 98292L)
  public static SubLObject isa_hl_var_thing_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const105$isa ) && NIL != binary_lit_p( lit ) && NIL != variables.variable_p( cycl_utilities.formula_arg1( lit, UNPROVIDED ) ) && $const106$Thing.eql( cycl_utilities
        .formula_arg2( lit, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 98622L)
  public static SubLObject quoted_isa_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const107$quotedIsa ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 98822L)
  public static SubLObject genls_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const108$genls ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 99008L)
  public static SubLObject genl_preds_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const109$genlPreds ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 99207L)
  public static SubLObject genl_inverse_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const110$genlInverse ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 99412L)
  public static SubLObject genl_mt_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const111$genlMt ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 99602L)
  public static SubLObject result_isa_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const112$resultIsa ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 99801L)
  public static SubLObject result_genl_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const113$resultGenl ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 100003L)
  public static SubLObject tou_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const114$termOfUnit ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 100197L)
  public static SubLObject tou_asentP(final SubLObject asent)
  {
    return makeBoolean( NIL != el_binary_formula_p( asent ) && NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const114$termOfUnit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 100425L)
  public static SubLObject equals_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != pred_litP( lit, $const115$equals ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 100614L)
  public static SubLObject holds_in_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != pred_litP( literal, $const116$holdsIn ) && NIL != binary_lit_p( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 100823L)
  public static SubLObject true_sentence_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != pred_litP( literal, $const117$trueSentence ) && NIL != unary_lit_p( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101045L)
  public static SubLObject forward_non_trigger_literal_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != pred_litP( literal, $const118$forwardNonTriggerLiteral ) && NIL != unary_lit_p( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101305L)
  public static SubLObject forward_trigger_literal_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != pred_litP( literal, $const119$forwardTriggerLiteral ) && NIL != unary_lit_p( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101558L)
  public static SubLObject forward_pragmatic_trigger_literal_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != forward_non_trigger_literal_litP( literal ) || NIL != forward_trigger_literal_litP( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101725L)
  public static SubLObject default_forward_non_trigger_literal_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != forts.fort_p( literal_arg0( literal, UNPROVIDED ) ) && NIL != default_forward_non_trigger_literal_predicateP( literal_arg0( literal, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101918L)
  public static SubLObject clear_default_forward_non_trigger_literal_predicateP()
  {
    final SubLObject cs = $default_forward_non_trigger_literal_predicateP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101918L)
  public static SubLObject remove_default_forward_non_trigger_literal_predicateP(final SubLObject v_object)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $default_forward_non_trigger_literal_predicateP_caching_state$.getGlobalValue(), ConsesLow.list( v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101918L)
  public static SubLObject default_forward_non_trigger_literal_predicateP_internal(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != kb_mapping_utilities.fpred_value_in_any_mt( v_object, $const121$defaultForwardNonTriggerPredicate, ONE_INTEGER, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 101918L)
  public static SubLObject default_forward_non_trigger_literal_predicateP(final SubLObject v_object)
  {
    SubLObject caching_state = $default_forward_non_trigger_literal_predicateP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym120$DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_, $sym122$_DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE__CACHING_STATE_, NIL, EQL,
          ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym123$CLEAR_DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_ );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( default_forward_non_trigger_literal_predicateP_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 102154L)
  public static SubLObject evaluate_litP(final SubLObject literal, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return makeBoolean( NIL != pred_litP( literal, $const124$evaluate ) && NIL != binary_lit_p( literal ) && NIL != term.nautP( literal_arg2( literal, UNPROVIDED ), varP ) && ( NIL != Functions.funcall( varP,
        literal_arg1( literal, UNPROVIDED ) ) || NIL != datum_constantP( literal_arg1( literal, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 102606L)
  public static SubLObject potentially_solvable_evaluate_asentP(final SubLObject asent)
  {
    return makeBoolean( $const124$evaluate.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 102877L)
  public static SubLObject evaluatable_el_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != relation_evaluation.evaluatable_functionP( cycl_utilities.formula_arg0( v_object ) ) && NIL != closedP( v_object, Symbols.symbol_function(
        $sym13$EL_VAR_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 103116L)
  public static SubLObject datum_constantP(final SubLObject symbol)
  {
    return makeBoolean( symbol.isString() || symbol.isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 103207L)
  public static SubLObject arg_isa_binary_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != subl_promotions.memberP( literal_arg0( lit, UNPROVIDED ), czer_vars.$arg_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != binary_lit_p( lit ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 103441L)
  public static SubLObject reflexive_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != binary_lit_p( lit ) && literal_arg1( lit, UNPROVIDED ).equal( literal_arg2( lit, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 103647L)
  public static SubLObject naut_equals_litP(final SubLObject lit)
  {
    return makeBoolean( NIL != equals_litP( lit ) && NIL != term.nautP( literal_arg2( lit, UNPROVIDED ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 103867L)
  public static SubLObject ist_sentence_p(final SubLObject sentence, SubLObject allow_spec_predsP)
  {
    if( allow_spec_predsP == UNPROVIDED )
    {
      allow_spec_predsP = NIL;
    }
    return makeBoolean( NIL != possibly_sentence_p( sentence ) && ( $const88$ist.eql( cycl_utilities.sentence_arg0( sentence ) ) || ( NIL != allow_spec_predsP && NIL != forts.fort_p( cycl_utilities.sentence_arg0(
        sentence ) ) && NIL != genl_predicates.genl_predP( cycl_utilities.sentence_arg0( sentence ), $const88$ist, UNPROVIDED, UNPROVIDED ) ) ) && NIL != el_binary_formula_p( sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 104324L)
  public static SubLObject ist_predicateP(final SubLObject predicate, SubLObject allow_spec_predsP)
  {
    if( allow_spec_predsP == UNPROVIDED )
    {
      allow_spec_predsP = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( predicate ) && ( $const88$ist.eql( predicate ) || ( NIL != allow_spec_predsP && NIL != genl_predicates.genl_predP( predicate, $const88$ist, UNPROVIDED, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 104525L)
  public static SubLObject ist_of_atomic_sentence_p(final SubLObject sentence)
  {
    return ist_of_atomic_sentence_int( sentence, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 104730L)
  public static SubLObject ist_of_atomic_sentence_with_pred_p(final SubLObject sentence, final SubLObject pred)
  {
    return ist_of_atomic_sentence_int( sentence, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 104943L)
  public static SubLObject ist_of_atomic_sentence_int(final SubLObject sentence, final SubLObject pred)
  {
    if( NIL != ist_sentence_p( sentence, UNPROVIDED ) )
    {
      final SubLObject subsentence = designated_sentence( sentence );
      if( NIL != possibly_atomic_sentence_p( subsentence ) )
      {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( subsentence );
        if( NIL != pred )
        {
          return Equality.eql( pred, predicate );
        }
        return makeBoolean( NIL != forts.fort_p( predicate ) && NIL != fort_types_interface.predicateP( predicate ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 105332L)
  public static SubLObject ist_sentence_with_chlmt_p(final SubLObject sentence)
  {
    return makeBoolean( NIL != ist_sentence_p( sentence, UNPROVIDED ) && NIL != hlmt.chlmt_p( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 105468L)
  public static SubLObject true_sentence_p(final SubLObject sentence)
  {
    return makeBoolean( NIL != possibly_sentence_p( sentence ) && $const117$trueSentence.eql( cycl_utilities.sentence_arg0( sentence ) ) && NIL != el_unary_formula_p( sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 105646L)
  public static SubLObject true_sentence_of_atomic_sentence_p(final SubLObject sentence)
  {
    if( NIL != true_sentence_p( sentence ) )
    {
      final SubLObject subsentence = cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
      if( NIL != possibly_sentence_p( subsentence ) )
      {
        final SubLObject predicate = cycl_utilities.sentence_arg0( subsentence );
        return makeBoolean( NIL != forts.fort_p( predicate ) && NIL != fort_types_interface.predicateP( predicate ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 106071L)
  public static SubLObject negated_true_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_negation_p( v_object ) && NIL != true_sentence_p( cycl_utilities.formula_arg1( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 106206L)
  public static SubLObject max_literal_count(final SubLObject cycls)
  {
    SubLObject max_count = ZERO_INTEGER;
    SubLObject max_cycl = NIL;
    SubLObject cdolist_list_var = cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject literal_count = literal_count( cycl );
      if( literal_count.numG( max_count ) )
      {
        max_count = literal_count;
        max_cycl = cycl;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return subl_promotions.values2( max_count, max_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 106866L)
  public static SubLObject literal_count(final SubLObject cycl)
  {
    return list_utilities.tree_count_if( $sym125$CYCL_LITERAL_P, cycl, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107045L)
  public static SubLObject kappa_asent_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != possibly_atomic_sentence_p( v_object ) && NIL != kappa_predicate_p( cycl_utilities.atomic_sentence_predicate( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107229L)
  public static SubLObject kappa_predicate_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const126$Kappa ) && NIL != el_binary_formula_p( v_object ) && NIL != list_utilities.list_of_type_p( $sym13$EL_VAR_, cycl_utilities.nat_arg1( v_object,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107420L)
  public static SubLObject kappa_predicate_formal_args(final SubLObject nat)
  {
    return cycl_utilities.nat_arg1( nat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107497L)
  public static SubLObject kappa_predicate_arity(final SubLObject nat)
  {
    return Sequences.length( kappa_predicate_formal_args( nat ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107596L)
  public static SubLObject kappa_predicate_query(final SubLObject nat)
  {
    return cycl_utilities.nat_arg2( nat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107667L)
  public static SubLObject lambda_function_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_with_operator_p( v_object, $const127$Lambda ) && NIL != el_binary_formula_p( v_object ) && NIL != list_utilities.list_of_type_p( $sym13$EL_VAR_, cycl_utilities.nat_arg1(
        v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107887L)
  public static SubLObject lambda_function_formal_args(final SubLObject nat)
  {
    return cycl_utilities.nat_arg1( nat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 107964L)
  public static SubLObject lambda_function_arity(final SubLObject nat)
  {
    return Sequences.length( lambda_function_formal_args( nat ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 108063L)
  public static SubLObject lambda_function_expression(final SubLObject nat)
  {
    return cycl_utilities.nat_arg2( nat, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 108139L)
  public static SubLObject mt_designating_literalP(final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym128$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const129$EverythingPSC, thread );
      result = makeBoolean( NIL != el_formula_p( literal ) && NIL != term.mt_designating_relationP( literal_arg0( literal, UNPROVIDED ) ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 108486L)
  public static SubLObject mt_designating_formulaP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym128$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const129$EverythingPSC, thread );
      result = makeBoolean( NIL != el_formula_p( v_object ) && NIL != term.mt_designating_relationP( cycl_utilities.formula_arg0( v_object ) ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 108795L)
  public static SubLObject mt_designation_argnum(final SubLObject literal)
  {
    final SubLObject pred = literal_predicate( literal, UNPROVIDED );
    if( $const88$ist.eql( pred ) )
    {
      return ONE_INTEGER;
    }
    return kb_mapping_utilities.fpred_value_in_any_mt( pred, $const130$microtheoryDesignationArgnum, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 109142L)
  public static SubLObject designated_mt(final SubLObject literal)
  {
    return literal_arg( literal, mt_designation_argnum( literal ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 109362L)
  public static SubLObject sentence_designation_argnum(final SubLObject literal)
  {
    final SubLObject pred = literal_predicate( literal, UNPROVIDED );
    if( $const88$ist.eql( pred ) )
    {
      return TWO_INTEGER;
    }
    return kb_mapping_utilities.fpred_value_in_any_mt( pred, $const131$sentenceDesignationArgnum, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 109714L)
  public static SubLObject designated_sentence(final SubLObject literal)
  {
    return literal_arg( literal, sentence_designation_argnum( literal ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 109954L)
  public static SubLObject valid_argnum_p(final SubLObject arg)
  {
    return valid_arity_p( arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 110234L)
  public static SubLObject valid_arity_p(final SubLObject v_arity)
  {
    return makeBoolean( v_arity.isInteger() && v_arity.numGE( ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 110398L)
  public static SubLObject explicitify_implicit_universal_quantifiers(SubLObject sentence)
  {
    SubLObject cdolist_list_var;
    final SubLObject free_vars = cdolist_list_var = sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentence = make_universal( var, sentence );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 110807L)
  public static SubLObject implicitify_explicit_universal_quantifiers(SubLObject sentence)
  {
    while ( NIL != el_universal_p( sentence ))
    {
      sentence = quantified_sub_sentence( sentence );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 111079L)
  public static SubLObject explicitify_implicit_existential_quantifiers(SubLObject sentence)
  {
    SubLObject cdolist_list_var;
    final SubLObject free_vars = cdolist_list_var = sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentence = make_existential( var, sentence );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 111423L)
  public static SubLObject implicitify_explicit_existential_quantifiers(SubLObject sentence)
  {
    while ( NIL != el_existential_p( sentence ))
    {
      sentence = quantified_sub_sentence( sentence );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 111699L)
  public static SubLObject bind_all_free_vars(final SubLObject formula)
  {
    return existentially_bind_vars( formula, sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 111914L)
  public static SubLObject existentially_bind_vars(final SubLObject formula, SubLObject var_list)
  {
    if( var_list == UNPROVIDED )
    {
      var_list = sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject new_formula = formula;
    SubLObject cdolist_list_var = var_list;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_formula = make_existential( var, new_formula );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return new_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 112249L)
  public static SubLObject rule_formula_has_unlabelled_dont_care_variableP(final SubLObject formula)
  {
    assert NIL != el_rule_formula_p( formula ) : formula;
    final SubLObject v_variables = sentence_term_variables( formula, UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject var = NIL;
    SubLObject id = NIL;
    list_var = v_variables;
    var = list_var.first();
    for( id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), var = list_var.first(), id = Numbers.add( ONE_INTEGER, id ) )
    {
      if( ONE_INTEGER.numE( list_utilities.simple_tree_count( var, formula ) ) && NIL == cycl_variables.dont_care_varP( var ) )
      {
        return var;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 112721L)
  public static SubLObject rule_formula_unlabelled_dont_care_variables(final SubLObject formula)
  {
    assert NIL != el_rule_formula_p( formula ) : formula;
    final SubLObject v_variables = sentence_term_variables( formula, UNPROVIDED );
    SubLObject unlabelled_dont_care_variables = NIL;
    SubLObject list_var = NIL;
    SubLObject var = NIL;
    SubLObject id = NIL;
    list_var = v_variables;
    var = list_var.first();
    for( id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), var = list_var.first(), id = Numbers.add( ONE_INTEGER, id ) )
    {
      if( ONE_INTEGER.numE( list_utilities.simple_tree_count( var, formula ) ) && NIL == cycl_variables.dont_care_varP( var ) )
      {
        unlabelled_dont_care_variables = ConsesLow.cons( var, unlabelled_dont_care_variables );
      }
    }
    return Sequences.nreverse( unlabelled_dont_care_variables );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 113325L)
  public static SubLObject recursive_nat_functor(final SubLObject nat)
  {
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    if( NIL != forts.fort_p( functor ) )
    {
      return functor;
    }
    if( NIL != el_formula_p( functor ) )
    {
      return recursive_nat_functor( nat );
    }
    el_error( THREE_INTEGER, $str134$Tried_to_recursively_determine_th, nat, UNPROVIDED, UNPROVIDED );
    return functor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 113807L)
  public static SubLObject predicate_specP(final SubLObject v_term, SubLObject var_func)
  {
    if( var_func == UNPROVIDED )
    {
      var_func = Symbols.symbol_function( $sym135$VAR_SPEC_ );
    }
    if( NIL != fort_types_interface.predicateP( v_term ) )
    {
      return T;
    }
    if( NIL != Functions.funcall( var_func, v_term ) )
    {
      return T;
    }
    if( NIL != term.unreified_skolem_termP( v_term ) )
    {
      return T;
    }
    if( NIL == term.function_termP( v_term ) )
    {
      return NIL;
    }
    final SubLObject nat = cycl_utilities.reify_when_closed_naut( v_term );
    if( NIL != forts.fort_p( nat ) )
    {
      return fort_types_interface.predicateP( nat );
    }
    return isa.nat_isaP( nat, $const136$Predicate, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 114401L)
  public static SubLObject function_specP(final SubLObject v_term, SubLObject var_func)
  {
    if( var_func == UNPROVIDED )
    {
      var_func = Symbols.symbol_function( $sym135$VAR_SPEC_ );
    }
    if( NIL != fort_types_interface.functorP( v_term ) )
    {
      return T;
    }
    if( NIL != Functions.funcall( var_func, v_term ) )
    {
      return T;
    }
    if( NIL != term.unreified_skolem_termP( v_term ) )
    {
      return T;
    }
    if( NIL == term.function_termP( v_term ) )
    {
      return NIL;
    }
    final SubLObject nat = cycl_utilities.reify_when_closed_naut( v_term );
    if( NIL != forts.fort_p( nat ) )
    {
      return fort_types_interface.functorP( nat );
    }
    return genls.any_specP( $const137$Function_Denotational, kb_accessors.result_isa( cycl_utilities.nat_functor( v_term ), mt_vars.$anect_mt$.getGlobalValue() ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 115089L)
  public static SubLObject expand_join_left(final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject reverse_args = Sequences.reverse( cycl_utilities.formula_args( literal, UNPROVIDED ) );
    SubLObject disjuncts = NIL;
    SubLObject expansion = NIL;
    SubLObject reverse_initial_segment;
    SubLObject initial_segment;
    for( reverse_initial_segment = NIL, reverse_initial_segment = reverse_args; !reverse_initial_segment.isAtom(); reverse_initial_segment = reverse_initial_segment.rest() )
    {
      initial_segment = Sequences.reverse( reverse_initial_segment );
      if( NIL != list_utilities.lengthG( initial_segment, ONE_INTEGER, UNPROVIDED ) )
      {
        disjuncts = ConsesLow.cons( simplifier.conjoin( initial_segment, UNPROVIDED ), disjuncts );
      }
      else
      {
        disjuncts = ConsesLow.cons( initial_segment.first(), disjuncts );
      }
    }
    if( NIL != disjuncts )
    {
      expansion = simplifier.disjoin( disjuncts, UNPROVIDED );
    }
    return subl_promotions.values2( expansion, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 115614L)
  public static SubLObject expand_there_exist_vars(final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vars = cycl_utilities.formula_arg1( literal, UNPROVIDED );
    SubLObject expansion = cycl_utilities.formula_arg2( literal, UNPROVIDED );
    SubLObject cdolist_list_var = Sequences.nreverse( vars );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      expansion = make_formula( $const14$thereExists, ConsesLow.list( var, expansion ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return subl_promotions.values2( expansion, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 115943L)
  public static SubLObject expand_for_all_vars(final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vars = cycl_utilities.formula_arg1( literal, UNPROVIDED );
    SubLObject expansion = cycl_utilities.formula_arg2( literal, UNPROVIDED );
    SubLObject cdolist_list_var = Sequences.nreverse( vars );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      expansion = make_formula( $const11$forAll, ConsesLow.list( var, expansion ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return subl_promotions.values2( expansion, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 116259L)
  public static SubLObject true_sentence_case_insensitive_expansion(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == atomic_sentenceP( asent ) || NIL == formula_arityE( asent, ONE_INTEGER, UNPROVIDED ) )
    {
      return subl_promotions.values2( asent, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    final SubLObject arg_sentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return true_sentence_case_insensitive_expansion_int( arg_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 116638L)
  public static SubLObject true_sentence_case_insensitive_expansion_int(final SubLObject arg_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject tpci_pred = constants_high.find_constant( $str142$termPhrases_CaseInsensitive );
    final SubLObject tp_pred = $const143$termPhrases;
    SubLObject new_asent = NIL;
    if( NIL != el_conjunction_p( arg_sentence ) )
    {
      SubLObject new_conjuncts = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( arg_sentence, $kw48$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_conjuncts = ConsesLow.cons( true_sentence_case_insensitive_expansion_int( conjunct ), new_conjuncts );
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      new_asent = make_conjunction( Sequences.nreverse( new_conjuncts ) );
    }
    else if( NIL != el_disjunction_p( arg_sentence ) )
    {
      SubLObject new_disjuncts = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( arg_sentence, $kw48$IGNORE );
      SubLObject disjunct = NIL;
      disjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_disjuncts = ConsesLow.cons( true_sentence_case_insensitive_expansion_int( disjunct ), new_disjuncts );
        cdolist_list_var = cdolist_list_var.rest();
        disjunct = cdolist_list_var.first();
      }
      new_asent = make_disjunction( Sequences.nreverse( new_disjuncts ) );
    }
    else if( NIL == Sequences.find_if( $sym144$ALPHABETIC_STRING_, cycl_utilities.formula_args( arg_sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      new_asent = make_unary_formula( $const117$trueSentence, arg_sentence );
    }
    else if( NIL != cycl_utilities.atomic_sentence_with_pred_p( arg_sentence, tp_pred ) )
    {
      new_asent = replace_formula_arg( ZERO_INTEGER, tpci_pred, arg_sentence );
    }
    else if( NIL != cycl_utilities.atomic_sentence_with_pred_p( arg_sentence, tpci_pred ) )
    {
      new_asent = arg_sentence;
    }
    else if( NIL != formula_arityE( arg_sentence, TWO_INTEGER, UNPROVIDED ) && NIL != lexicon_vars.name_or_term_strings_predP( cycl_utilities.atomic_sentence_predicate( arg_sentence ) ) )
    {
      new_asent = make_ternary_formula( tpci_pred, cycl_utilities.atomic_sentence_arg1( arg_sentence, UNPROVIDED ), cycl_utilities.atomic_sentence_predicate( arg_sentence ), cycl_utilities.atomic_sentence_arg2(
          arg_sentence, UNPROVIDED ) );
    }
    else if( NIL != cycl_utilities.atomic_sentence_with_pred_p( arg_sentence, $const145$regexStringMatch ) )
    {
      final SubLObject iregex_pred = constants_high.find_constant( $str146$regexStringMatch_CaseInsensitive );
      if( NIL != constant_handles.valid_constant( iregex_pred, UNPROVIDED ) )
      {
        new_asent = replace_formula_arg( ZERO_INTEGER, iregex_pred, arg_sentence );
      }
      else
      {
        new_asent = arg_sentence;
      }
    }
    else
    {
      new_asent = make_unary_formula( $const147$trueSentence_CaseInsensitive, arg_sentence );
    }
    return subl_promotions.values2( new_asent, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 118879L)
  public static SubLObject sentence_has_true_sentence_case_insensitive_supportP(final SubLObject sentence)
  {
    final SubLObject expanded = true_sentence_case_insensitive_expansion_int( sentence );
    return makeBoolean( NIL == cycl_utilities.expression_find( $const147$trueSentence_CaseInsensitive, expanded, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 119218L)
  public static SubLObject sentence_has_nontrivial_true_sentence_case_insensitive_supportP(final SubLObject sentence)
  {
    final SubLObject expanded = true_sentence_case_insensitive_expansion_int( sentence );
    return makeBoolean( NIL == cycl_utilities.expression_find( $const147$trueSentence_CaseInsensitive, expanded, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && !expanded.equal( make_unary_formula( $const117$trueSentence,
        sentence ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 119697L)
  public static SubLObject el_relation_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formulaP( v_object ) || NIL != term.function_termP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 120426L)
  public static SubLObject hl_relation_expressionP(final SubLObject v_object)
  {
    return nart_handles.nart_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 120546L)
  public static SubLObject relation_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_relation_expressionP( v_object ) || NIL != hl_relation_expressionP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 120806L)
  public static SubLObject el_formulaP(final SubLObject formula)
  {
    return makeBoolean( NIL != wf_wrt_sequence_varsP( formula ) && ( NIL != el_atomic_sentenceP( formula ) || NIL != el_non_atomic_sentenceP( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 121131L)
  public static SubLObject el_atomic_sentenceP(final SubLObject formula)
  {
    return atomic_sentenceP( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 121309L)
  public static SubLObject el_non_atomic_sentenceP(final SubLObject formula)
  {
    return makeBoolean( NIL != el_formula_p( formula ) && NIL != at_utilities.logical_opP( cycl_utilities.formula_arg0( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 121524L)
  public static SubLObject el_gaf_formula_p(final SubLObject formula)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_atomic_sentence_p( formula ) && NIL != closedP( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 121697L)
  public static SubLObject el_rule_formula_p(final SubLObject formula)
  {
    return makeBoolean( NIL == el_gaf_formula_p( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 121823L)
  public static SubLObject literalP(final SubLObject formula)
  {
    if( formula.isAtom() )
    {
      return NIL;
    }
    if( NIL != atomic_sentenceP( formula ) )
    {
      return T;
    }
    if( NIL != el_negation_p( formula ) && NIL != atomic_sentenceP( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 122050L)
  public static SubLObject atomic_sentenceP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_formula_p( v_object ) && NIL != predicate_specP( cycl_utilities.formula_arg0( v_object ), UNPROVIDED ) && NIL != term.relation_syntaxP( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 122361L)
  public static SubLObject gafP(final SubLObject formula)
  {
    return makeBoolean( NIL != atomic_sentenceP( formula ) && NIL != groundP( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 122468L)
  public static SubLObject cafP(final SubLObject formula)
  {
    return makeBoolean( NIL != atomic_sentenceP( formula ) && NIL != closedP( formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 122566L)
  public static SubLObject el_var_listP(final SubLObject v_object)
  {
    if( NIL == v_object || NIL != list_utilities.proper_list_p( v_object ) )
    {
      SubLObject not_el_var_listP = NIL;
      if( NIL == not_el_var_listP )
      {
        SubLObject csome_list_var = v_object;
        SubLObject element = NIL;
        element = csome_list_var.first();
        while ( NIL == not_el_var_listP && NIL != csome_list_var)
        {
          if( NIL == cycl_variables.el_varP( element ) )
          {
            not_el_var_listP = T;
          }
          csome_list_var = csome_list_var.rest();
          element = csome_list_var.first();
        }
      }
      return makeBoolean( NIL == not_el_var_listP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 122896L)
  public static SubLObject formula_non_var_symbols(final SubLObject formula, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return Sequences.remove_if( varP, list_utilities.flatten( formula ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 123034L)
  public static SubLObject referenced_variables(final SubLObject formula, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return cycl_utilities.formula_gather( formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 123322L)
  public static SubLObject sentence_variables(final SubLObject sentence, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Functions.funcall( varP, sentence ) )
    {
      return ConsesLow.list( sentence );
    }
    if( !sentence.isAtom() )
    {
      if( NIL != el_negation_p( sentence ) )
      {
        return sentence_variables( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), varP, include_sequence_varsP );
      }
      if( NIL != el_conjunction_p( sentence ) || NIL != el_disjunction_p( sentence ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycl_utilities.sentence_args( sentence, ( NIL != include_sequence_varsP ) ? $kw95$REGULARIZE : $kw48$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$3 = sentence_variables( arg, varP, include_sequence_varsP );
          SubLObject var = NIL;
          var = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            final SubLObject item_var = var;
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            var = cdolist_list_var_$3.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return result;
      }
      if( NIL != el_implication_p( sentence ) || NIL != el_exception_p( sentence ) )
      {
        return list_utilities.ordered_union( sentence_variables( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), varP, include_sequence_varsP ), sentence_variables( cycl_utilities.sentence_arg2( sentence,
            UNPROVIDED ), varP, include_sequence_varsP ), UNPROVIDED, UNPROVIDED );
      }
      if( NIL != el_universal_p( sentence ) || NIL != el_existential_p( sentence ) )
      {
        return conses_high.adjoin( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), sentence_variables( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), varP, include_sequence_varsP ), UNPROVIDED, UNPROVIDED );
      }
      if( NIL != el_bounded_existential_p( sentence ) )
      {
        return conses_high.adjoin( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), sentence_variables( cycl_utilities.sentence_arg3( sentence, UNPROVIDED ), varP, include_sequence_varsP ), UNPROVIDED, UNPROVIDED );
      }
      if( NIL != mt_designating_literalP( sentence ) )
      {
        final SubLObject mt = designated_mt( sentence );
        final SubLObject mtP = fort_types_interface.mtP( mt );
        final SubLObject subsentence = designated_sentence( sentence );
        SubLObject result2 = NIL;
        final SubLObject mt_var = ( NIL != mtP ) ? mt : NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          result2 = sentence_variables( subsentence, varP, include_sequence_varsP );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        if( NIL == mtP )
        {
          result2 = ConsesLow.append( result2, naut_variables( mt, varP, include_sequence_varsP ) );
        }
        return result2;
      }
      if( NIL != atomic_sentenceP( sentence ) )
      {
        return literal_variables( sentence, varP, include_sequence_varsP );
      }
      el_error( FOUR_INTEGER, $str149$_S_is_not_well_formed_, sentence, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 125264L)
  public static SubLObject literal_variables(final SubLObject relation, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return relation_variables( relation, varP, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 125430L)
  public static SubLObject naut_variables(final SubLObject naut, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return relation_variables( naut, varP, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 125585L)
  public static SubLObject relation_variables(final SubLObject literal, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    if( NIL != Functions.funcall( varP, literal ) )
    {
      return ConsesLow.list( literal );
    }
    if( NIL != el_negation_p( literal ) )
    {
      return literal_variables( cycl_utilities.formula_arg1( literal, UNPROVIDED ), varP, UNPROVIDED );
    }
    SubLObject arg = ZERO_INTEGER;
    SubLObject vars = NIL;
    SubLObject cdolist_list_var;
    final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( literal, ( NIL != include_sequence_varsP ) ? $kw95$REGULARIZE : $kw48$IGNORE );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( v_term, vars, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != Functions.funcall( varP, v_term ) )
        {
          vars = ConsesLow.cons( v_term, vars );
        }
        else if( NIL != term.unreified_skolem_termP( v_term ) )
        {
          vars = ConsesLow.cons( v_term, vars );
        }
        else if( NIL != term.nautP( v_term, varP ) )
        {
          SubLObject cdolist_list_var_$4 = naut_variables( v_term, varP, include_sequence_varsP );
          SubLObject var = NIL;
          var = cdolist_list_var_$4.first();
          while ( NIL != cdolist_list_var_$4)
          {
            if( NIL == subl_promotions.memberP( var, vars, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
            {
              vars = ConsesLow.cons( var, vars );
            }
            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
            var = cdolist_list_var_$4.first();
          }
        }
        else if( NIL != term.sentenceP( v_term, varP ) )
        {
          SubLObject cdolist_list_var_$5 = sentence_variables( v_term, varP, include_sequence_varsP );
          SubLObject var = NIL;
          var = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            if( NIL == subl_promotions.memberP( var, vars, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
            {
              vars = ConsesLow.cons( var, vars );
            }
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            var = cdolist_list_var_$5.first();
          }
        }
      }
      arg = Numbers.add( arg, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.reverse( vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 126498L)
  public static SubLObject scoped_vars(final SubLObject formula, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    final SubLObject relation = cycl_utilities.formula_operator( formula );
    SubLObject scoped_vars = NIL;
    if( NIL != forts.fort_p( relation ) )
    {
      SubLObject cdolist_list_var = kb_accessors.scoping_args( relation, UNPROVIDED );
      SubLObject position = NIL;
      position = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject arg = cycl_utilities.formula_arg( formula, position, UNPROVIDED );
        if( NIL != Functions.funcall( varP, arg ) )
        {
          scoped_vars = ConsesLow.cons( arg, scoped_vars );
        }
        else if( arg.isCons() )
        {
          SubLObject cdolist_list_var_$6 = cycl_utilities.formula_terms( arg, UNPROVIDED );
          SubLObject sub_arg = NIL;
          sub_arg = cdolist_list_var_$6.first();
          while ( NIL != cdolist_list_var_$6)
          {
            if( NIL != Functions.funcall( varP, sub_arg ) )
            {
              scoped_vars = ConsesLow.cons( sub_arg, scoped_vars );
            }
            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
            sub_arg = cdolist_list_var_$6.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        position = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( scoped_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 126970L)
  public static SubLObject literals_variables(final SubLObject literals, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    SubLObject v_variables = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_variables = list_utilities.ordered_union( v_variables, literal_variables( literal, varP, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return v_variables;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 127201L)
  public static SubLObject literals_free_sequence_variables(final SubLObject literals, SubLObject bound_vars, SubLObject varP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    SubLObject v_variables = NIL;
    if( literals.isCons() )
    {
      SubLObject cdolist_list_var = literals;
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_variables = list_utilities.ordered_union( v_variables, literal_free_sequence_variables( literal, bound_vars, varP ), UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
    }
    else if( NIL == subl_promotions.memberP( literals, bound_vars, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != Functions.funcall( varP, literals ) )
      {
        v_variables = ConsesLow.cons( literals, v_variables );
      }
    }
    return v_variables;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 127613L)
  public static SubLObject literal_free_sequence_variables(final SubLObject literal, SubLObject old_bound_vars, SubLObject varP)
  {
    if( old_bound_vars == UNPROVIDED )
    {
      old_bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return relation_free_sequence_variables( literal, old_bound_vars, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 127785L)
  public static SubLObject naut_free_sequence_variables(final SubLObject naut, SubLObject old_bound_vars, SubLObject varP)
  {
    if( old_bound_vars == UNPROVIDED )
    {
      old_bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return relation_free_sequence_variables( naut, old_bound_vars, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 127948L)
  public static SubLObject possibly_formula_with_sequence_variablesP(final SubLObject formula)
  {
    return list_utilities.tree_find_if( $sym150$DOTTED_LIST_P, formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 128156L)
  public static SubLObject relation_free_sequence_variables(final SubLObject relation, SubLObject old_bound_vars, SubLObject varP)
  {
    if( old_bound_vars == UNPROVIDED )
    {
      old_bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( NIL == possibly_formula_with_sequence_variablesP( relation ) )
    {
      return NIL;
    }
    if( NIL == subl_promotions.memberP( relation, old_bound_vars, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != Functions.funcall( varP, relation ) )
      {
        return NIL;
      }
      if( NIL != el_negation_p( relation ) )
      {
        return relation_free_sequence_variables( cycl_utilities.formula_arg1( relation, UNPROVIDED ), old_bound_vars, varP );
      }
      if( NIL != el_formula_p( relation ) )
      {
        final SubLObject reln = cycl_utilities.formula_arg0( relation );
        final SubLObject new_bound_vars = scoped_vars( relation, varP );
        final SubLObject bound_vars = conses_high.union( old_bound_vars, new_bound_vars, UNPROVIDED, UNPROVIDED );
        SubLObject psn = ZERO_INTEGER;
        final SubLObject sequence_var = sequence_var( relation, varP );
        SubLObject ans = NIL;
        if( NIL != sequence_var && NIL == subl_promotions.memberP( sequence_var, bound_vars, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject item_var = sequence_var;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( relation, $kw48$IGNORE );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == subl_promotions.memberP( v_term, bound_vars, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == list_utilities.proper_list_p( v_term ) || NIL == conses_high.subsetp( v_term, bound_vars, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == czer_utilities.leave_variables_at_el_for_argP( reln, psn, UNPROVIDED ) )
              {
                if( NIL == Functions.funcall( varP, v_term ) )
                {
                  if( NIL == at_vars.within_tou_gafP() || !psn.eql( TWO_INTEGER ) )
                  {
                    if( NIL != term.unreified_skolem_termP( v_term ) )
                    {
                      final SubLObject seqvar = sequence_var( conses_high.second( v_term ), UNPROVIDED );
                      if( NIL == subl_promotions.memberP( seqvar, bound_vars, UNPROVIDED, UNPROVIDED ) && NIL != Functions.funcall( varP, seqvar ) )
                      {
                        final SubLObject item_var2 = seqvar;
                        if( NIL == conses_high.member( item_var2, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          ans = ConsesLow.cons( item_var2, ans );
                        }
                      }
                    }
                    else if( NIL != term.nautP( v_term, varP ) )
                    {
                      SubLObject cdolist_list_var_$7 = naut_free_sequence_variables( v_term, bound_vars, varP );
                      SubLObject var = NIL;
                      var = cdolist_list_var_$7.first();
                      while ( NIL != cdolist_list_var_$7)
                      {
                        final SubLObject item_var3 = var;
                        if( NIL == conses_high.member( item_var3, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          ans = ConsesLow.cons( item_var3, ans );
                        }
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        var = cdolist_list_var_$7.first();
                      }
                    }
                    else if( NIL != term.sentenceP( v_term, varP ) || NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym151$SCOPING_RELATION_EXPRESSION_ ), v_term, NIL, UNPROVIDED ) )
                    {
                      SubLObject cdolist_list_var_$8 = sentence_free_sequence_variables( v_term, bound_vars, varP );
                      SubLObject var = NIL;
                      var = cdolist_list_var_$8.first();
                      while ( NIL != cdolist_list_var_$8)
                      {
                        final SubLObject item_var3 = var;
                        if( NIL == conses_high.member( item_var3, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          ans = ConsesLow.cons( item_var3, ans );
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        var = cdolist_list_var_$8.first();
                      }
                    }
                  }
                }
              }
            }
          }
          psn = Numbers.add( psn, ONE_INTEGER );
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse( ans );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 130772L)
  public static SubLObject sentence_free_term_variables(final SubLObject formula, SubLObject bound_vars, SubLObject varP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return sentence_free_variables( formula, bound_vars, varP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 131040L)
  public static SubLObject sentence_free_sequence_variables(final SubLObject sentence, SubLObject bound_vars, SubLObject varP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == possibly_formula_with_sequence_variablesP( sentence ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject seqvar = sequence_var( sentence, UNPROVIDED );
    if( NIL != seqvar && NIL == subl_promotions.memberP( seqvar, bound_vars, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject item_var = seqvar;
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
    }
    if( NIL == subl_promotions.memberP( sentence, bound_vars, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != Functions.funcall( varP, sentence ) )
      {
        return result;
      }
      if( !sentence.isAtom() )
      {
        if( NIL != el_negation_p( sentence ) )
        {
          return ConsesLow.append( result, sentence_free_sequence_variables( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), bound_vars, varP ) );
        }
        if( NIL != el_conjunction_p( sentence ) || NIL != el_disjunction_p( sentence ) )
        {
          SubLObject cdolist_list_var = cycl_utilities.sentence_args( sentence, $kw48$IGNORE );
          SubLObject arg = NIL;
          arg = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$9 = sentence_free_sequence_variables( arg, bound_vars, varP );
            SubLObject var = NIL;
            var = cdolist_list_var_$9.first();
            while ( NIL != cdolist_list_var_$9)
            {
              final SubLObject item_var2 = var;
              if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                result = ConsesLow.cons( item_var2, result );
              }
              cdolist_list_var_$9 = cdolist_list_var_$9.rest();
              var = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
          }
          return result;
        }
        if( NIL != el_implication_p( sentence ) || NIL != el_exception_p( sentence ) )
        {
          result = ConsesLow.append( result, Sequences.nreverse( sentence_free_sequence_variables( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), bound_vars, varP ) ) );
          SubLObject cdolist_list_var = sentence_free_sequence_variables( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), bound_vars, varP );
          SubLObject var2 = NIL;
          var2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var3 = var2;
            if( NIL == conses_high.member( item_var3, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var3, result );
            }
            cdolist_list_var = cdolist_list_var.rest();
            var2 = cdolist_list_var.first();
          }
          return Sequences.nreverse( result );
        }
        if( NIL != possibly_el_quantified_sentence_p( sentence ) )
        {
          return ConsesLow.append( result, sentence_free_sequence_variables( quantified_sub_sentence( sentence ), ConsesLow.cons( quantified_var( sentence ), bound_vars ), varP ) );
        }
        if( NIL != mt_designating_literalP( sentence ) )
        {
          final SubLObject mt = designated_mt( sentence );
          final SubLObject mtP = fort_types_interface.mtP( mt );
          final SubLObject subsentence = designated_sentence( sentence );
          SubLObject result_$10 = NIL;
          final SubLObject mt_var = ( NIL != mtP ) ? mt : NIL;
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
            result_$10 = sentence_free_sequence_variables( subsentence, bound_vars, varP );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
          if( NIL == mtP )
          {
            result_$10 = ConsesLow.append( result_$10, naut_free_sequence_variables( mt, bound_vars, varP ) );
          }
          return result_$10;
        }
        if( NIL != atomic_sentenceP( sentence ) )
        {
          return ConsesLow.append( result, literal_free_sequence_variables( sentence, bound_vars, varP ) );
        }
        if( NIL != el_formula_p( sentence ) && NIL != Functions.funcall( varP, cycl_utilities.sentence_arg0( sentence ) ) )
        {
          return ConsesLow.append( result, literal_free_sequence_variables( sentence, bound_vars, varP ) );
        }
        if( NIL != relation_expressionP( sentence ) )
        {
          return ConsesLow.append( result, relation_free_sequence_variables( sentence, bound_vars, varP ) );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 133626L)
  public static SubLObject occurs_as_sequence_variableP(final SubLObject var, final SubLObject sentence)
  {
    return subl_promotions.memberP( var, sentence_sequence_variables( sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 133822L)
  public static SubLObject occurs_as_term_variableP(final SubLObject var, final SubLObject sentence)
  {
    return subl_promotions.memberP( var, sentence_term_variables( sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 134006L)
  public static SubLObject occurs_as_sequence_variable_in_clauseP(final SubLObject var, final SubLObject clause)
  {
    SubLObject cdolist_list_var = clauses.neg_lits( clause );
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( var, sentence_sequence_variables( asent, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.pos_lits( clause );
    asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( var, sentence_sequence_variables( asent, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 134264L)
  public static SubLObject occurs_as_term_variable_in_clauseP(final SubLObject var, final SubLObject clause)
  {
    SubLObject cdolist_list_var = clauses.neg_lits( clause );
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( var, sentence_term_variables( asent, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.pos_lits( clause );
    asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( var, sentence_term_variables( asent, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 134510L)
  public static SubLObject formula_has_term_in_argnumP(final SubLObject formula, final SubLObject v_term, final SubLObject argnum)
  {
    final SubLObject arg = cycl_utilities.formula_arg( formula, argnum, UNPROVIDED );
    return Equality.equal( v_term, arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 134650L)
  public static SubLObject term_occurs_as_formula_argument(final SubLObject v_term, final SubLObject formula)
  {
    SubLObject argnum = NIL;
    SubLObject argnum_var = ZERO_INTEGER;
    final SubLObject args = cycl_utilities.formula_args( formula, $kw48$IGNORE );
    SubLObject rest;
    SubLObject arg_var;
    for( rest = NIL, rest = args; NIL == argnum && NIL != rest; rest = rest.rest() )
    {
      arg_var = rest.first();
      argnum_var = Numbers.add( argnum_var, ONE_INTEGER );
      if( v_term.equal( arg_var ) )
      {
        argnum = argnum_var;
      }
    }
    return argnum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 135043L)
  public static SubLObject appearing_as_both_sequence_and_term_variables(final SubLObject formula)
  {
    final SubLObject all_free_variables = sentence_free_variables( formula, NIL, $sym59$CYC_VAR_, T );
    final SubLObject free_term_variables = sentence_free_variables( formula, NIL, $sym59$CYC_VAR_, NIL );
    final SubLObject free_sequence_variables = conses_high.nset_difference( all_free_variables, free_term_variables, UNPROVIDED, UNPROVIDED );
    return conses_high.nintersection( free_sequence_variables, free_term_variables, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 135465L)
  public static SubLObject formula_with_variable_appearing_as_both_sequence_and_term_variableP(final SubLObject formula)
  {
    final SubLObject seqvar = sequence_var( formula, UNPROVIDED );
    if( NIL != seqvar )
    {
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw48$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( v_term.eql( seqvar ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 135813L)
  public static SubLObject sentence_term_variables(final SubLObject formula, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    return sentence_variables( formula, varP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 136006L)
  public static SubLObject sentence_sequence_variables(final SubLObject formula, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    final SubLObject seqvar = sequence_var( formula, varP );
    SubLObject seqvars = ( NIL != seqvar ) ? ConsesLow.list( seqvar ) : NIL;
    if( NIL != el_formula_p( formula ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( formula, $kw48$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        seqvars = ConsesLow.append( seqvars, sentence_sequence_variables( v_term, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return list_utilities.fast_delete_duplicates( seqvars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 136450L)
  public static SubLObject wf_wrt_sequence_varsP(final SubLObject formula)
  {
    return makeBoolean( NIL == formula_with_sequence_non_varP( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 136651L)
  public static SubLObject subformulas_wf_wrt_sequence_varsP(final SubLObject formula)
  {
    return makeBoolean( NIL == cycl_utilities.formula_find_if( $sym152$FORMULA_WITH_SEQUENCE_NON_VAR_, formula, NIL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 136918L)
  public static SubLObject conditional_sentence_free_variables(final SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( var_func == UNPROVIDED )
    {
      var_func = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    assert NIL != el_implication_p( sentence ) : sentence;
    final SubLObject antecedent = cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
    final SubLObject antecedent_free_vars = sentence_free_variables( antecedent, bound_vars, var_func, include_sequence_varsP );
    final SubLObject consequent = cycl_utilities.sentence_arg2( sentence, UNPROVIDED );
    final SubLObject consequent_free_vars = sentence_free_variables( consequent, bound_vars, var_func, include_sequence_varsP );
    return conses_high.set_difference( consequent_free_vars, antecedent_free_vars, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 137625L)
  public static SubLObject sentence_free_variables(final SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( var_func == UNPROVIDED )
    {
      var_func = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    if( NIL != include_sequence_varsP && NIL == list_utilities.tree_find_if( $sym154$SCOPING_RELATION_P, sentence, UNPROVIDED ) && NIL == list_utilities.tree_find_if( $sym155$CYCL_QUOTED_TERM_P, sentence, UNPROVIDED )
        && NIL == list_utilities.tree_find_if( $sym156$EXPAND_SUBL_FN_P, sentence, UNPROVIDED ) )
    {
      return conses_high.set_difference( cycl_utilities.expression_gather( sentence, var_func, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), bound_vars, UNPROVIDED, UNPROVIDED );
    }
    return sentence_free_variables_int( sentence, bound_vars, var_func, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 138175L)
  public static SubLObject sentence_free_variables_int(final SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( var_func == UNPROVIDED )
    {
      var_func = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) || NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym157$FAST_ESCAPE_QUOTE_TERM_P ), sentence, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL == subl_promotions.memberP( sentence, bound_vars, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != Functions.funcall( var_func, sentence ) )
        {
          return ConsesLow.list( sentence );
        }
        if( !sentence.isAtom() )
        {
          if( NIL != list_utilities.tree_find_if( var_func, sentence, UNPROVIDED ) )
          {
            if( NIL != el_negation_p( sentence ) )
            {
              return sentence_free_variables_int( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), bound_vars, var_func, include_sequence_varsP );
            }
            if( NIL != el_conjunction_p( sentence ) || NIL != el_disjunction_p( sentence ) )
            {
              SubLObject result = NIL;
              SubLObject cdolist_list_var = cycl_utilities.sentence_args( sentence, ( NIL != include_sequence_varsP ) ? $kw95$REGULARIZE : $kw48$IGNORE );
              SubLObject arg = NIL;
              arg = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject cdolist_list_var_$11 = sentence_free_variables_int( arg, bound_vars, var_func, include_sequence_varsP );
                SubLObject var = NIL;
                var = cdolist_list_var_$11.first();
                while ( NIL != cdolist_list_var_$11)
                {
                  final SubLObject item_var = var;
                  if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var, result );
                  }
                  cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                  var = cdolist_list_var_$11.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
              }
              return result;
            }
            if( NIL != el_general_implication_p( sentence ) || NIL != el_exception_p( sentence ) )
            {
              SubLObject result = Sequences.nreverse( sentence_free_variables_int( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), bound_vars, var_func, include_sequence_varsP ) );
              SubLObject cdolist_list_var = sentence_free_variables_int( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), bound_vars, var_func, include_sequence_varsP );
              SubLObject var2 = NIL;
              var2 = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject item_var2 = var2;
                if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  result = ConsesLow.cons( item_var2, result );
                }
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
              }
              return Sequences.nreverse( result );
            }
            if( NIL != possibly_el_regularly_quantified_sentence_p( sentence ) )
            {
              return sentence_free_variables_int( quantified_sub_sentence( sentence ), ConsesLow.cons( quantified_var( sentence ), bound_vars ), var_func, include_sequence_varsP );
            }
            if( NIL != cycl_grammar.cycl_bounded_existential_sentence_p( sentence ) )
            {
              SubLObject result = Sequences.nreverse( sentence_free_variables_int( quantified_sub_sentence( sentence ), ConsesLow.cons( quantified_var( sentence ), bound_vars ), var_func, include_sequence_varsP ) );
              final SubLObject possible_var = existential_bound( sentence );
              if( NIL != cycl_variables.cyc_varP( possible_var ) )
              {
                result = ConsesLow.cons( possible_var, result );
              }
              return Sequences.nreverse( result );
            }
            if( NIL != mt_designating_literalP( sentence ) )
            {
              final SubLObject mt = designated_mt( sentence );
              final SubLObject mtP = fort_types_interface.mtP( mt );
              final SubLObject subsentence = designated_sentence( sentence );
              SubLObject result2 = NIL;
              final SubLObject mt_var = ( NIL != mtP ) ? mt : NIL;
              final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
                result2 = sentence_free_variables_int( subsentence, bound_vars, var_func, include_sequence_varsP );
              }
              finally
              {
                mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
              }
              if( NIL == mtP )
              {
                result2 = ConsesLow.append( result2, naut_free_variables( mt, bound_vars, var_func, include_sequence_varsP ) );
              }
              return result2;
            }
            if( NIL != atomic_sentenceP( sentence ) )
            {
              return literal_free_variables( sentence, bound_vars, var_func, include_sequence_varsP );
            }
            if( NIL != el_formula_p( sentence ) && NIL != Functions.funcall( var_func, cycl_utilities.sentence_arg0( sentence ) ) )
            {
              return literal_free_variables( sentence, bound_vars, var_func, include_sequence_varsP );
            }
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_gather( sentence, var_func, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject var2 = NIL;
            var2 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == subl_promotions.memberP( var2, bound_vars, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject item_var2 = var2;
                if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  result = ConsesLow.cons( item_var2, result );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              var2 = cdolist_list_var.first();
            }
            return result;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 141172L)
  public static SubLObject literals_free_variables(final SubLObject literals, SubLObject bound_vars, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    SubLObject v_variables = NIL;
    if( literals.isCons() )
    {
      SubLObject cdolist_list_var = literals;
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_variables = list_utilities.ordered_union( v_variables, literal_free_variables( literal, bound_vars, varP, include_sequence_varsP ), UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
    }
    else if( NIL == subl_promotions.memberP( literals, bound_vars, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != Functions.funcall( varP, literals ) )
      {
        v_variables = ConsesLow.cons( literals, v_variables );
      }
    }
    return v_variables;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 141697L)
  public static SubLObject literal_free_variables(final SubLObject literal, SubLObject old_bound_vars, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( old_bound_vars == UNPROVIDED )
    {
      old_bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return relation_free_variables( literal, old_bound_vars, varP, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 141901L)
  public static SubLObject naut_free_variables(final SubLObject naut, SubLObject old_bound_vars, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( old_bound_vars == UNPROVIDED )
    {
      old_bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return relation_free_variables( naut, old_bound_vars, varP, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 142096L)
  public static SubLObject relation_free_variables(final SubLObject relation, SubLObject old_bound_vars, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( old_bound_vars == UNPROVIDED )
    {
      old_bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == subl_quote_p( relation ) )
    {
      if( NIL != expand_subl_fn_p( relation ) )
      {
        return relation_free_variables( cycl_utilities.formula_arg1( relation, UNPROVIDED ), old_bound_vars, varP, include_sequence_varsP );
      }
      if( NIL != cycl_grammar.fast_escape_quote_term_p( relation ) )
      {
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding( thread );
        try
        {
          czer_vars.$inside_quote$.bind( NIL, thread );
          ans = relation_free_variables( cycl_utilities.formula_arg1( relation, UNPROVIDED ), old_bound_vars, varP, include_sequence_varsP );
        }
        finally
        {
          czer_vars.$inside_quote$.rebind( _prev_bind_0, thread );
        }
        return ans;
      }
      if( NIL == subl_promotions.memberP( relation, old_bound_vars, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) && NIL != Functions.funcall( varP, relation ) )
        {
          return ConsesLow.list( relation );
        }
        if( NIL != cycl_grammar.fast_quote_term_p( relation ) )
        {
          SubLObject ans = NIL;
          final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding( thread );
          try
          {
            czer_vars.$inside_quote$.bind( T, thread );
            ans = relation_free_variables( cycl_utilities.formula_arg1( relation, UNPROVIDED ), old_bound_vars, varP, include_sequence_varsP );
          }
          finally
          {
            czer_vars.$inside_quote$.rebind( _prev_bind_0, thread );
          }
          return ans;
        }
        if( NIL != el_negation_p( relation ) )
        {
          return relation_free_variables( cycl_utilities.formula_arg1( relation, UNPROVIDED ), old_bound_vars, varP, include_sequence_varsP );
        }
        if( NIL != el_formula_p( relation ) )
        {
          final SubLObject reln = cycl_utilities.formula_arg0( relation );
          final SubLObject new_bound_vars = scoped_vars( relation, varP );
          final SubLObject bound_vars = conses_high.union( old_bound_vars, new_bound_vars, UNPROVIDED, UNPROVIDED );
          SubLObject ans2 = NIL;
          final SubLObject terms = cycl_utilities.formula_terms( relation, ( NIL != include_sequence_varsP ) ? $kw95$REGULARIZE : $kw48$IGNORE );
          SubLObject list_var = NIL;
          SubLObject v_term = NIL;
          SubLObject psn = NIL;
          list_var = terms;
          v_term = list_var.first();
          for( psn = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), psn = number_utilities.f_1X( psn ) )
          {
            if( NIL == subl_promotions.memberP( v_term, bound_vars, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == list_utilities.proper_list_p( v_term ) || NIL == conses_high.subsetp( v_term, bound_vars, UNPROVIDED, UNPROVIDED ) )
              {
                if( ( NIL != control_vars.$within_query$.getDynamicValue( thread ) && NIL != czer_vars.$canonicalize_el_template_vars_during_queriesP$.getDynamicValue( thread ) ) || NIL == czer_utilities
                    .leave_variables_at_el_for_argP( reln, psn, UNPROVIDED ) )
                {
                  if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) && NIL != Functions.funcall( varP, v_term ) )
                  {
                    final SubLObject item_var = v_term;
                    if( NIL == conses_high.member( item_var, ans2, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans2 = ConsesLow.cons( item_var, ans2 );
                    }
                  }
                  else if( NIL == at_vars.within_tou_gafP() || !psn.eql( TWO_INTEGER ) )
                  {
                    if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) && NIL != term.unreified_skolem_termP( v_term ) )
                    {
                      SubLObject cdolist_list_var = conses_high.second( v_term );
                      SubLObject var = NIL;
                      var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        if( NIL == subl_promotions.memberP( var, bound_vars, UNPROVIDED, UNPROVIDED ) && NIL != Functions.funcall( varP, var ) )
                        {
                          final SubLObject item_var2 = var;
                          if( NIL == conses_high.member( item_var2, ans2, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                          {
                            ans2 = ConsesLow.cons( item_var2, ans2 );
                          }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        var = cdolist_list_var.first();
                      }
                    }
                    else if( NIL != term.nautP( v_term, varP ) )
                    {
                      SubLObject cdolist_list_var = naut_free_variables( v_term, bound_vars, varP, include_sequence_varsP );
                      SubLObject var = NIL;
                      var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject item_var2 = var;
                        if( NIL == conses_high.member( item_var2, ans2, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          ans2 = ConsesLow.cons( item_var2, ans2 );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        var = cdolist_list_var.first();
                      }
                    }
                    else if( NIL != term.sentenceP( v_term, varP ) || NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym151$SCOPING_RELATION_EXPRESSION_ ), v_term, NIL, UNPROVIDED ) )
                    {
                      SubLObject cdolist_list_var = sentence_free_variables_int( v_term, bound_vars, varP, include_sequence_varsP );
                      SubLObject var = NIL;
                      var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject item_var2 = var;
                        if( NIL == conses_high.member( item_var2, ans2, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          ans2 = ConsesLow.cons( item_var2, ans2 );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        var = cdolist_list_var.first();
                      }
                    }
                    else if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) )
                    {
                      SubLObject cdolist_list_var = cycl_utilities.expression_gather( v_term, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      SubLObject var = NIL;
                      var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        if( NIL == subl_promotions.memberP( var, bound_vars, UNPROVIDED, UNPROVIDED ) )
                        {
                          final SubLObject item_var2 = var;
                          if( NIL == conses_high.member( item_var2, ans2, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                          {
                            ans2 = ConsesLow.cons( item_var2, ans2 );
                          }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        var = cdolist_list_var.first();
                      }
                    }
                  }
                }
              }
            }
          }
          return Sequences.nreverse( ans2 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 145379L)
  public static SubLObject relation_closed_variables(final SubLObject relation, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    final SubLObject vars = relation_variables( relation, varP, UNPROVIDED );
    final SubLObject free = ( NIL != vars ) ? relation_free_variables( relation, NIL, varP, UNPROVIDED ) : NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( var, free, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 145696L)
  public static SubLObject expression_free_variables(final SubLObject expression, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( NIL != el_formula_p( expression ) )
    {
      return relation_free_variables( expression, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != Functions.funcall( varP, expression ) )
    {
      return ConsesLow.list( expression );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 146037L)
  public static SubLObject expression_shared_free_variables(final SubLObject expr1, final SubLObject expr2, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym13$EL_VAR_ );
    }
    return conses_high.nintersection( expression_free_variables( expr1, varP ), expression_free_variables( expr2, varP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 146295L)
  public static SubLObject formula_quantified_vars(final SubLObject formula)
  {
    return Sequences.remove_duplicates( formula_quantified_vars_int( formula ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 146412L)
  public static SubLObject formula_quantified_vars_int(final SubLObject formula)
  {
    if( !formula.isAtom() )
    {
      if( NIL != el_negation_p( formula ) )
      {
        return formula_quantified_vars_int( cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
      }
      if( NIL != el_conjunction_p( formula ) || NIL != el_disjunction_p( formula ) )
      {
        return list_utilities.mapappend( $sym158$FORMULA_QUANTIFIED_VARS_INT, cycl_utilities.formula_args( formula, $kw95$REGULARIZE ) );
      }
      if( NIL != el_implication_p( formula ) )
      {
        return ConsesLow.nconc( formula_quantified_vars_int( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ), formula_quantified_vars_int( cycl_utilities.formula_arg2( formula, UNPROVIDED ) ) );
      }
      if( NIL != el_existential_p( formula ) || NIL != el_universal_p( formula ) )
      {
        return ConsesLow.cons( cycl_utilities.formula_arg1( formula, UNPROVIDED ), formula_quantified_vars_int( cycl_utilities.formula_arg2( formula, UNPROVIDED ) ) );
      }
      if( NIL != el_bounded_existential_p( formula ) )
      {
        return ConsesLow.cons( cycl_utilities.formula_arg2( formula, UNPROVIDED ), formula_quantified_vars_int( cycl_utilities.formula_arg3( formula, UNPROVIDED ) ) );
      }
      if( NIL != el_formula_p( formula ) )
      {
        return list_utilities.mapappend( $sym158$FORMULA_QUANTIFIED_VARS_INT, formula );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 147266L)
  public static SubLObject variable_subst(final SubLObject new_var, final SubLObject var, final SubLObject formula)
  {
    if( formula.eql( var ) )
    {
      return new_var;
    }
    if( NIL != scoping_relation_expressionP( formula ) && NIL != conses_high.member( var, scoped_vars( formula, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
    {
      return formula;
    }
    if( NIL != el_formula_p( formula ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var;
      final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( formula, $kw48$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( variable_subst( new_var, var, v_term ), result );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      result = Sequences.nreverse( result );
      return make_formula( result.first(), result.rest(), variable_subst( new_var, var, sequence_var( formula, UNPROVIDED ) ) );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 148041L)
  public static SubLObject formula_denoting_collectionP(final SubLObject collection)
  {
    return genls.genlP( collection, $const159$CycLFormula, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 148334L)
  public static SubLObject sentence_denoting_collectionP(final SubLObject collection)
  {
    return genls.genlP( collection, $const160$CycLSentence, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 148540L)
  public static SubLObject scoping_relation_expressionP(final SubLObject expression)
  {
    if( NIL != relation_expressionP( expression ) )
    {
      final SubLObject relation = cycl_utilities.formula_operator( expression );
      return fort_types_interface.scoping_relation_p( relation );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 148739L)
  public static SubLObject arg_types_of_expression_prescribe_unreifiedP(final SubLObject formula, final SubLObject pos)
  {
    return arg_types_prescribe_unreifiedP( cycl_utilities.formula_operator( formula ), pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 149002L)
  public static SubLObject arg_types_prescribe_unreifiedP(final SubLObject rel, final SubLObject pos)
  {
    if( rel.eql( $const114$termOfUnit ) && pos.eql( TWO_INTEGER ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 150012L)
  public static SubLObject arg_types_prescribe_tacit_term_listP(final SubLObject rel, final SubLObject pos)
  {
    if( pos.eql( ONE_INTEGER ) )
    {
      return subl_promotions.memberP( rel, $arg1_subl_list_relations$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    if( pos.eql( TWO_INTEGER ) )
    {
      return subl_promotions.memberP( rel, $arg2_subl_list_relations$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 150416L)
  public static SubLObject to_be_killed_warning(final SubLObject function_name, SubLObject replace_with, SubLObject maintainer)
  {
    if( replace_with == UNPROVIDED )
    {
      replace_with = NIL;
    }
    if( maintainer == UNPROVIDED )
    {
      maintainer = NIL;
    }
    SubLObject format_string = $str163$You_re_calling_the_function___A__;
    if( NIL != replace_with )
    {
      format_string = Sequences.cconcatenate( format_string, $str164$__Replace_all_calls_to_it_with___ );
    }
    if( NIL != maintainer )
    {
      format_string = Sequences.cconcatenate( format_string, $str165$__Notify__A_if_you_receive_this_w );
    }
    if( NIL != maintainer && NIL == replace_with )
    {
      Errors.warn( format_string, function_name, maintainer );
    }
    else
    {
      Errors.warn( format_string, function_name, replace_with, maintainer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 151340L)
  public static SubLObject el_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( czer_vars.$el_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      Errors.cerror( $str166$continue_anyway, format_str, arg1, arg2, arg3 );
    }
    else if( Numbers.add( TWO_INTEGER, czer_vars.$el_trace_level$.getDynamicValue( thread ) ).numGE( level ) )
    {
      Errors.warn( format_str, arg1, arg2, arg3 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 151592L)
  public static SubLObject el_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( NIL != el_tracing_p( level ) )
    {
      Errors.warn( format_str, arg1, arg2, arg3 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 151741L)
  public static SubLObject el_tracing_p(SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numGE( czer_vars.$el_trace_level$.getDynamicValue( thread ), level );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 151829L)
  public static SubLObject el_remove_outermost_existentials(SubLObject expression)
  {
    while ( NIL != el_existential_p( expression ))
    {
      expression = quantified_sub_sentence( expression );
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 152167L)
  public static SubLObject el_remove_unnecessary_existentials(SubLObject expression)
  {
    expression = clausifier.standardize_sentence_variables( expression );
    expression = el_remove_unnecessary_existentials_1( expression, sentence_free_variables( expression, NIL, $sym167$EL_VARIABLE_, UNPROVIDED ) );
    expression = el_remove_unnecessary_existentials_2( expression );
    expression = el_remove_unnecessary_equality( expression );
    expression = el_remove_unnecessary_conjunctions( expression );
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 152748L)
  public static SubLObject el_remove_unnecessary_existentials_1(final SubLObject expression, final SubLObject quantified_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_existential_p( expression ) )
    {
      final SubLObject var = quantified_var( expression );
      SubLObject sub_exp = quantified_sub_sentence( expression );
      SubLObject replacement_var = NIL;
      if( NIL == replacement_var )
      {
        SubLObject csome_list_var = quantified_vars;
        SubLObject quant_var = NIL;
        quant_var = csome_list_var.first();
        while ( NIL == replacement_var && NIL != csome_list_var)
        {
          if( NIL != el_vars_unifiedP( sub_exp, var, quant_var ) )
          {
            replacement_var = quant_var;
          }
          csome_list_var = csome_list_var.rest();
          quant_var = csome_list_var.first();
        }
      }
      if( NIL != replacement_var )
      {
        sub_exp = conses_high.sublis( conses_high.acons( var, replacement_var, NIL ), sub_exp, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject new_expression = el_remove_unnecessary_existentials_1( sub_exp, quantified_vars );
        final SubLObject var_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2( new_expression, conses_high.acons( var, replacement_var, var_map ) );
      }
      thread.resetMultipleValues();
      final SubLObject new_expression = el_remove_unnecessary_existentials_1( sub_exp, ConsesLow.cons( var, quantified_vars ) );
      final SubLObject var_map = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return subl_promotions.values2( make_existential( var, new_expression ), var_map );
    }
    else
    {
      if( NIL != el_universal_p( expression ) )
      {
        final SubLObject var = quantified_var( expression );
        final SubLObject sub_exp = quantified_sub_sentence( expression );
        thread.resetMultipleValues();
        final SubLObject new_expression2 = el_remove_unnecessary_existentials_1( sub_exp, ConsesLow.cons( var, quantified_vars ) );
        final SubLObject var_map2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2( make_universal( var, new_expression2 ), var_map2 );
      }
      if( NIL != el_formula_p( expression ) )
      {
        final SubLObject formula_operator = cycl_utilities.formula_operator( expression );
        SubLObject new_args = NIL;
        SubLObject var_map3 = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw48$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject new_arg = el_remove_unnecessary_existentials_1( arg, quantified_vars );
          final SubLObject new_var_map = thread.secondMultipleValue();
          thread.resetMultipleValues();
          new_args = ConsesLow.cons( new_arg, new_args );
          var_map3 = ConsesLow.append( var_map3, new_var_map );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        new_args = Sequences.nreverse( new_args );
        return subl_promotions.values2( ConsesLow.cons( formula_operator, new_args ), var_map3 );
      }
      return subl_promotions.values2( expression, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 154471L)
  public static SubLObject el_remove_unnecessary_existentials_2(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_existential_p( expression ) )
    {
      final SubLObject var = quantified_var( expression );
      SubLObject sub_exp = quantified_sub_sentence( expression );
      final SubLObject replacement = el_var_unification_in_expression( sub_exp, var );
      if( NIL != replacement )
      {
        sub_exp = conses_high.sublis( conses_high.acons( var, replacement, NIL ), sub_exp, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject new_expression = el_remove_unnecessary_existentials_2( sub_exp );
        final SubLObject var_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2( new_expression, conses_high.acons( var, replacement, var_map ) );
      }
      thread.resetMultipleValues();
      final SubLObject new_expression = el_remove_unnecessary_existentials_2( sub_exp );
      final SubLObject var_map = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return subl_promotions.values2( make_existential( var, new_expression ), var_map );
    }
    else
    {
      if( NIL != el_universal_p( expression ) )
      {
        final SubLObject var = quantified_var( expression );
        final SubLObject sub_exp = quantified_sub_sentence( expression );
        thread.resetMultipleValues();
        final SubLObject new_expression2 = el_remove_unnecessary_existentials_2( sub_exp );
        final SubLObject var_map2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2( make_universal( var, new_expression2 ), var_map2 );
      }
      if( NIL != el_formula_p( expression ) )
      {
        final SubLObject formula_operator = cycl_utilities.formula_operator( expression );
        SubLObject new_args = NIL;
        SubLObject var_map3 = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw48$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject new_arg = el_remove_unnecessary_existentials_2( arg );
          final SubLObject new_var_map = thread.secondMultipleValue();
          thread.resetMultipleValues();
          new_args = ConsesLow.cons( new_arg, new_args );
          var_map3 = ConsesLow.append( var_map3, new_var_map );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        new_args = Sequences.nreverse( new_args );
        return subl_promotions.values2( ConsesLow.cons( formula_operator, new_args ), var_map3 );
      }
      return subl_promotions.values2( expression, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 155984L)
  public static SubLObject el_remove_unnecessary_equality(final SubLObject expression)
  {
    if( NIL != equals_litP( expression ) )
    {
      return literal_arg1( expression, UNPROVIDED ).equal( literal_arg2( expression, UNPROVIDED ) ) ? ( literal_sense( expression ).eql( $kw168$POS ) ? $const169$True : $const170$False ) : expression;
    }
    if( NIL != el_formula_p( expression ) )
    {
      final SubLObject operator = cycl_utilities.formula_operator( expression );
      SubLObject new_args = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw48$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_args = ConsesLow.cons( el_remove_unnecessary_equality( arg ), new_args );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      new_args = Sequences.nreverse( new_args );
      return ConsesLow.cons( operator, new_args );
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 156540L)
  public static SubLObject el_remove_unnecessary_conjunctions(final SubLObject expression)
  {
    if( NIL != el_conjunction_p( expression ) )
    {
      SubLObject new_conjuncts = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw48$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject new_conjunct = el_remove_unnecessary_conjunctions( conjunct );
        if( NIL != el_conjunction_p( new_conjunct ) )
        {
          SubLObject cdolist_list_var_$13;
          final SubLObject args_$12 = cdolist_list_var_$13 = cycl_utilities.formula_args( new_conjunct, $kw48$IGNORE );
          SubLObject arg = NIL;
          arg = cdolist_list_var_$13.first();
          while ( NIL != cdolist_list_var_$13)
          {
            if( !arg.eql( $const169$True ) )
            {
              new_conjuncts = ConsesLow.cons( arg, new_conjuncts );
            }
            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
            arg = cdolist_list_var_$13.first();
          }
        }
        else if( !new_conjunct.eql( $const169$True ) )
        {
          new_conjuncts = ConsesLow.cons( new_conjunct, new_conjuncts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      new_conjuncts = Sequences.nreverse( new_conjuncts );
      if( NIL == new_conjuncts )
      {
        return $const169$True;
      }
      if( NIL != list_utilities.singletonP( new_conjuncts ) )
      {
        return new_conjuncts.first();
      }
      if( NIL != subl_promotions.memberP( $const170$False, new_conjuncts, UNPROVIDED, UNPROVIDED ) )
      {
        return $const170$False;
      }
      return make_conjunction( new_conjuncts );
    }
    else
    {
      if( NIL != el_formula_p( expression ) )
      {
        final SubLObject operator = cycl_utilities.formula_operator( expression );
        SubLObject new_args = NIL;
        SubLObject cdolist_list_var2;
        final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args( expression, $kw48$IGNORE );
        SubLObject arg2 = NIL;
        arg2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          new_args = ConsesLow.cons( el_remove_unnecessary_conjunctions( arg2 ), new_args );
          cdolist_list_var2 = cdolist_list_var2.rest();
          arg2 = cdolist_list_var2.first();
        }
        new_args = Sequences.nreverse( new_args );
        return ConsesLow.cons( operator, new_args );
      }
      return expression;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 157625L)
  public static SubLObject el_vars_unifiedP(final SubLObject expression, final SubLObject var0, final SubLObject var1)
  {
    return makeBoolean( var0.equal( var1 ) || NIL != el_vars_unifiedP_int( expression, var0, var1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 157764L)
  public static SubLObject el_vars_unifiedP_int(final SubLObject expression, final SubLObject var0, final SubLObject var1)
  {
    if( NIL != equals_litP( expression ) )
    {
      final SubLObject arg1 = literal_arg1( expression, UNPROVIDED );
      final SubLObject arg2 = literal_arg2( expression, UNPROVIDED );
      return makeBoolean( ( var0.equal( arg1 ) && var1.equal( arg2 ) ) || ( var0.equal( arg2 ) && var1.equal( arg1 ) ) );
    }
    if( NIL != el_conjunction_p( expression ) )
    {
      SubLObject successP = NIL;
      final SubLObject args = cycl_utilities.formula_args( expression, $kw48$IGNORE );
      SubLObject rest;
      SubLObject conjunct;
      for( rest = NIL, rest = args; NIL == successP && NIL != rest; rest = rest.rest() )
      {
        conjunct = rest.first();
        if( NIL != el_vars_unifiedP_int( conjunct, var0, var1 ) )
        {
          successP = T;
        }
      }
      return successP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 158301L)
  public static SubLObject el_var_unification_in_expression(final SubLObject expression, final SubLObject var)
  {
    if( NIL != equals_litP( expression ) )
    {
      final SubLObject arg1 = literal_arg1( expression, UNPROVIDED );
      final SubLObject arg2 = literal_arg2( expression, UNPROVIDED );
      if( var.equal( arg1 ) && !var.equal( arg2 ) )
      {
        return arg2;
      }
      if( !var.equal( arg1 ) && var.equal( arg2 ) )
      {
        return arg1;
      }
      return NIL;
    }
    else
    {
      if( NIL != el_conjunction_p( expression ) )
      {
        SubLObject result = NIL;
        final SubLObject args = cycl_utilities.formula_args( expression, $kw48$IGNORE );
        SubLObject rest;
        SubLObject conjunct;
        for( rest = NIL, rest = args; NIL == result && NIL != rest; result = el_var_unification_in_expression( conjunct, var ), rest = rest.rest() )
        {
          conjunct = rest.first();
        }
        return result;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 158892L)
  public static SubLObject remove_el_duplicates(final SubLObject sequence, SubLObject key, SubLObject start, SubLObject end)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          result = Sequences.remove_duplicates( sequence, $sym171$EQUALS_EL_MEMOIZED_, key, start, end );
        }
        finally
        {
          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$14, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 159239L)
  public static SubLObject binding_lists_to_expression(final SubLObject binding_lists)
  {
    SubLObject cycl_binding_lists = NIL;
    SubLObject cdolist_list_var = binding_lists;
    SubLObject binding_list = NIL;
    binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cycl_binding_list = NIL;
      SubLObject cdolist_list_var_$16 = binding_list;
      SubLObject binding = NIL;
      binding = cdolist_list_var_$16.first();
      while ( NIL != cdolist_list_var_$16)
      {
        SubLObject current;
        final SubLObject datum = current = binding;
        SubLObject variable = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
        variable = current.first();
        current = ( value = current.rest() );
        cycl_binding_list = ConsesLow.cons( ConsesLow.list( variable, value ), cycl_binding_list );
        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
        binding = cdolist_list_var_$16.first();
      }
      cycl_binding_lists = ConsesLow.cons( Sequences.nreverse( cycl_binding_list ), cycl_binding_lists );
      cdolist_list_var = cdolist_list_var.rest();
      binding_list = cdolist_list_var.first();
    }
    return Sequences.nreverse( cycl_binding_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 159985L)
  public static SubLObject expression_to_binding_lists(final SubLObject cycl_binding_lists)
  {
    SubLObject binding_lists = NIL;
    SubLObject cdolist_list_var = cycl_binding_lists;
    SubLObject cycl_binding_list = NIL;
    cycl_binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject binding_list = NIL;
      SubLObject cdolist_list_var_$17 = cycl_binding_list;
      SubLObject cycl_binding = NIL;
      cycl_binding = cdolist_list_var_$17.first();
      while ( NIL != cdolist_list_var_$17)
      {
        SubLObject current;
        final SubLObject datum = current = cycl_binding;
        SubLObject variable = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
        value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          binding_list = ConsesLow.cons( bindings.make_variable_binding( variable, value ), binding_list );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list173 );
        }
        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
        cycl_binding = cdolist_list_var_$17.first();
      }
      binding_lists = ConsesLow.cons( Sequences.nreverse( binding_list ), binding_lists );
      cdolist_list_var = cdolist_list_var.rest();
      cycl_binding_list = cdolist_list_var.first();
    }
    return Sequences.nreverse( binding_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 160491L)
  public static SubLObject constant_with_name_p(final SubLObject v_object, final SubLObject name)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && constants_high.constant_name( v_object ).equal( name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 160620L)
  public static SubLObject constant_with_any_of_names_p(final SubLObject v_object, final SubLObject names)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL != list_utilities.member_equalP( constants_high.constant_name( v_object ), names ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 160767L)
  public static SubLObject formula_with_el_variableP(final SubLObject formula)
  {
    if( NIL == el_formula_p( formula ) )
    {
      return NIL;
    }
    return cycl_utilities.expression_find_if( $sym13$EL_VAR_, formula, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 160918L)
  public static SubLObject formula_with_nested_variableP(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym59$CYC_VAR_;
    }
    if( NIL != el_formula_p( v_object ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( v_object, $kw48$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_formula_p( arg ) )
        {
          SubLObject cdolist_list_var_$19;
          final SubLObject terms_$18 = cdolist_list_var_$19 = cycl_utilities.formula_terms( arg, $kw48$IGNORE );
          SubLObject nested_arg = NIL;
          nested_arg = cdolist_list_var_$19.first();
          while ( NIL != cdolist_list_var_$19)
          {
            if( NIL != cycl_utilities.expression_find_if( varP, nested_arg, UNPROVIDED, UNPROVIDED ) )
            {
              return T;
            }
            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
            nested_arg = cdolist_list_var_$19.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 161215L)
  public static SubLObject formula_with_hl_variableP(final SubLObject formula)
  {
    if( NIL == el_formula_p( formula ) )
    {
      return NIL;
    }
    return cycl_utilities.expression_find_if( $sym174$HL_VAR_, formula, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 161366L)
  public static SubLObject formula_with_nested_hl_variableP(final SubLObject v_object)
  {
    return formula_with_nested_variableP( v_object, $sym174$HL_VAR_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 161484L)
  public static SubLObject hl_formula_query_signature(final SubLObject formula)
  {
    return formula_query_signature_int( formula, $sym174$HL_VAR_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 161596L)
  public static SubLObject formula_query_signature(final SubLObject el_formula)
  {
    return formula_query_signature_int( el_formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 161692L)
  public static SubLObject formula_query_signature_int(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym175$EL_VARIABLE_P;
    }
    if( v_object.isCons() )
    {
      SubLObject head = v_object.first();
      SubLObject tail = v_object.rest();
      SubLObject result = NIL;
      while ( tail.isCons())
      {
        result = ConsesLow.cons( formula_query_signature_int( head, varP ), result );
        head = tail.first();
        tail = tail.rest();
      }
      result = ConsesLow.cons( formula_query_signature_int( head, varP ), result );
      if( NIL != list_utilities.sublisp_boolean( tail ) )
      {
        result = ConsesLow.cons( $kw176$UNBOUND_SEQ, result );
      }
      if( NIL != list_utilities.every_in_list( $sym177$FORMULA_QUERY_SIGNATURE_TERM_P, result, UNPROVIDED ) )
      {
        return $kw178$BOUND;
      }
      return Sequences.nreverse( result );
    }
    else
    {
      if( NIL != Functions.funcall( varP, v_object ) )
      {
        return $kw179$UNBOUND;
      }
      return $kw178$BOUND;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 162389L)
  public static SubLObject formula_query_signature_term_p(final SubLObject v_object)
  {
    return Equality.eq( $kw180$TERM, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 162472L)
  public static SubLObject formula_query_signature_ordered_bound_arg_positions(final SubLObject query_signature)
  {
    final SubLObject bound_arg_positions = list_utilities.tree_positions( $kw178$BOUND, query_signature, UNPROVIDED, UNPROVIDED );
    if( NIL == bound_arg_positions )
    {
      return NIL;
    }
    return Sort.sort( bound_arg_positions, $sym181$BOUND_ARG_POSITION_BETTER_FOR_INDEXING_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 162844L)
  public static SubLObject bound_arg_position_better_for_indexingL(final SubLObject bound_arg_pos1, final SubLObject bound_arg_pos2)
  {
    if( bound_arg_pos1.isInteger() && bound_arg_pos2.isInteger() )
    {
      final SubLObject pos1_pref = Sequences.position( bound_arg_pos1, $bound_arg_position_preferences$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject pos2_pref = Sequences.position( bound_arg_pos2, $bound_arg_position_preferences$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return Numbers.numL( pos1_pref, pos2_pref );
    }
    if( bound_arg_pos1.isInteger() )
    {
      return T;
    }
    if( bound_arg_pos2.isInteger() )
    {
      return NIL;
    }
    if( NIL != list_utilities.lesser_length_p( bound_arg_pos1, bound_arg_pos2 ) )
    {
      return T;
    }
    if( NIL != list_utilities.greater_length_p( bound_arg_pos1, bound_arg_pos2 ) )
    {
      return NIL;
    }
    final SubLObject pos1_initial = bound_arg_pos1.first();
    final SubLObject pos2_initial = bound_arg_pos2.first();
    final SubLObject pos1_pref2 = Sequences.position( pos1_initial, $bound_arg_position_preferences$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pos2_pref2 = Sequences.position( pos2_initial, $bound_arg_position_preferences$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( pos1_initial.eql( pos2_initial ) )
    {
      return bound_arg_position_better_for_indexingL( bound_arg_pos1.rest(), bound_arg_pos2.rest() );
    }
    return Numbers.numL( pos1_pref2, pos2_pref2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 163860L)
  public static SubLObject formula_query_ordered_terms_and_bound_arg_positions(final SubLObject v_object)
  {
    final SubLObject formula_query_signature = hl_formula_query_signature( v_object );
    final SubLObject ordered_bound_arg_positions = formula_query_signature_ordered_bound_arg_positions( formula_query_signature );
    final SubLObject ordered_term_list = list_utilities.tree_nths( ordered_bound_arg_positions, v_object );
    return subl_promotions.values2( ordered_term_list, ordered_bound_arg_positions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 164257L)
  public static SubLObject sorted_sentence_free_variables(final SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( var_func == UNPROVIDED )
    {
      var_func = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return kb_utilities.sort_terms( sentence_free_variables( sentence, bound_vars, var_func, include_sequence_varsP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 164257L)
  public static SubLObject sorted_conditional_sentence_free_variables(final SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( var_func == UNPROVIDED )
    {
      var_func = $sym59$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return kb_utilities.sort_terms( conditional_sentence_free_variables( sentence, bound_vars, var_func, include_sequence_varsP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-utilities.lisp", position = 164257L)
  public static SubLObject optimized_el_formula_matches_pattern(final SubLObject formula, final SubLObject pattern)
  {
    return formula_pattern_match.formula_matches_pattern( formula, pattern );
  }

  public static SubLObject declare_el_utilities_file()
  {
    SubLFiles.declareFunction( me, "el_formula_with_operator_p", "EL-FORMULA-WITH-OPERATOR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "el_formula_with_any_of_operators_p", "EL-FORMULA-WITH-ANY-OF-OPERATORS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "el_negation_p", "EL-NEGATION-P", 1, 0, false );
    new $el_negation_p$UnaryFunction();
    SubLFiles.declareFunction( me, "el_disjunction_p", "EL-DISJUNCTION-P", 1, 0, false );
    new $el_disjunction_p$UnaryFunction();
    SubLFiles.declareFunction( me, "el_conjunction_p", "EL-CONJUNCTION-P", 1, 0, false );
    new $el_conjunction_p$UnaryFunction();
    SubLFiles.declareFunction( me, "el_junction_p", "EL-JUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_implication_p", "EL-IMPLICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_equivalence_p", "EL-EQUIVALENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_xor_p", "EL-XOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_general_implication_operator_p", "CYC-CONST-GENERAL-IMPLICATION-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_general_implication_p", "EL-GENERAL-IMPLICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_conditional_sentence_p", "EL-CONDITIONAL-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_universal_p", "EL-UNIVERSAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_multi_universal_p", "EL-MULTI-UNIVERSAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_universal_p", "CYCL-UNIVERSAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_existential_p", "EL-EXISTENTIAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_multi_existential_p", "EL-MULTI-EXISTENTIAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_existential_min_p", "EL-EXISTENTIAL-MIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_existential_max_p", "EL-EXISTENTIAL-MAX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_existential_exact_p", "EL-EXISTENTIAL-EXACT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_unary_logical_op_p", "CYC-CONST-UNARY-LOGICAL-OP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_binary_logical_op_p", "CYC-CONST-BINARY-LOGICAL-OP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_ternary_logical_op_p", "CYC-CONST-TERNARY-LOGICAL-OP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_quaternary_logical_op_p", "CYC-CONST-QUATERNARY-LOGICAL-OP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_quintary_logical_op_p", "CYC-CONST-QUINTARY-LOGICAL-OP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_variable_arity_logical_op_p", "CYC-CONST-VARIABLE-ARITY-LOGICAL-OP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_existential_p", "CYC-CONST-EXISTENTIAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_universal_p", "CYC-CONST-UNIVERSAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_regular_quantifier_p", "CYC-CONST-REGULAR-QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_multi_quantifier_p", "CYC-CONST-MULTI-QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_el_regularly_quantified_sentence_p", "POSSIBLY-EL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_el_multiply_quantified_sentence_p", "POSSIBLY-EL-MULTIPLY-QUANTIFIED-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_bounded_existential_operator_p", "CYC-CONST-BOUNDED-EXISTENTIAL-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "user_defined_bounded_existential_operator_p", "USER-DEFINED-BOUNDED-EXISTENTIAL-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_bounded_existential_p", "EL-BOUNDED-EXISTENTIAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_general_existential_operator_p", "CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P", 1, 0, false );
    new $cyc_const_general_existential_operator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "el_general_existential_p", "EL-GENERAL-EXISTENTIAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_quantifier_p", "CYC-CONST-QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_el_quantified_sentence_p", "POSSIBLY-EL-QUANTIFIED-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_logical_operator_p", "CYC-CONST-LOGICAL-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "user_defined_logical_operator_p", "USER-DEFINED-LOGICAL-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "user_defined_sentential_relation_p", "USER-DEFINED-SENTENTIAL-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_tense_operator_p", "CYC-CONST-TENSE-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_metric_tense_operator_p", "CYC-CONST-METRIC-TENSE-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_generalized_tense_operator_p", "CYC-CONST-GENERALIZED-TENSE-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_sentential_relation_p", "CYC-CONST-SENTENTIAL-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_logical_operator_formula_p", "EL-LOGICAL-OPERATOR-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_zero_arity_formula_p", "EL-ZERO-ARITY-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_unary_formula_p", "EL-UNARY-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_binary_formula_p", "EL-BINARY-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_ternary_formula_p", "EL-TERNARY-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_quaternary_formula_p", "EL-QUATERNARY-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_escape_p", "SUBL-ESCAPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_subl_fn_p", "EXPAND-SUBL-FN-P", 1, 0, false );
    new $expand_subl_fn_p$UnaryFunction();
    SubLFiles.declareFunction( me, "subl_quote_p", "SUBL-QUOTE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quotify_cycl_term", "QUOTIFY-CYCL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_unquote", "POSSIBLY-UNQUOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_unquote_closed_formula", "POSSIBLY-UNQUOTE-CLOSED-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_quote", "POSSIBLY-QUOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_quote_open_formula", "POSSIBLY-QUOTE-OPEN-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_quote_reifiable_naut", "POSSIBLY-QUOTE-REIFIABLE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "elify", "ELIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "ist_sentence_designating_assertionP", "IST-SENTENCE-DESIGNATING-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "hlify", "HLIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "sefify", "SEFIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "epsilon_p", "EPSILON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_exception_operator_p", "CYC-CONST-EXCEPTION-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_exception_p", "EL-EXCEPTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_abnormal_p", "EL-ABNORMAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_const_pragmatic_requirement_operator_p", "CYC-CONST-PRAGMATIC-REQUIREMENT-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_pragmatic_requirement_p", "EL-PRAGMATIC-REQUIREMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_meets_pragmatic_requirement_p", "EL-MEETS-PRAGMATIC-REQUIREMENT-P", 1, 0, false );
    new $el_meets_pragmatic_requirement_p$UnaryFunction();
    SubLFiles.declareFunction( me, "el_query_sentence_p", "EL-QUERY-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_implicit_meta_literal_sentence_p", "EL-IMPLICIT-META-LITERAL-SENTENCE-P", 1, 0, false );
    new $el_implicit_meta_literal_sentence_p$UnaryFunction();
    SubLFiles.declareFunction( me, "elf_p", "ELF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_formula_p", "EL-FORMULA-P", 1, 0, false );
    new $el_formula_p$UnaryFunction();
    SubLFiles.declareFunction( me, "possibly_fo_naut_p", "POSSIBLY-FO-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_fo_represented_term_p", "POSSIBLY-FO-REPRESENTED-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_nat_p", "POSSIBLY-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_naut_p", "POSSIBLY-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_sentence_p", "POSSIBLY-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_cycl_sentence_p", "POSSIBLY-CYCL-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_sentence_or_variable_p", "POSSIBLY-SENTENCE-OR-VARIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_inference_sentence_p", "POSSIBLY-INFERENCE-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_atomic_sentence_p", "POSSIBLY-ATOMIC-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "contains_subformula_p", "CONTAINS-SUBFORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_subformulas", "EL-SUBFORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_general_existential_negation_p", "EL-GENERAL-EXISTENTIAL-NEGATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_universal_negation_p", "EL-UNIVERSAL-NEGATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_quantified_negation_p", "EL-QUANTIFIED-NEGATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_non_empty_list_p", "EL-NON-EMPTY-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_empty_list_p", "EL-EMPTY-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_list_p", "EL-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_set_or_collection_p", "EL-SET-OR-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_set_p", "EL-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_extensional_set_p", "EL-EXTENSIONAL-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_empty_set_p", "EL-EMPTY-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_non_empty_set_p", "EL-NON-EMPTY-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_intensional_set_p", "EL-INTENSIONAL-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_extensional_set", "CANONICALIZE-EXTENSIONAL-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "canonical_extensional_set_p", "CANONICAL-EXTENSIONAL-SET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_extensional_set", "MAKE-EL-EXTENSIONAL-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_non_empty_set", "MAKE-EL-NON-EMPTY-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "extensional_set_elements", "EXTENSIONAL-SET-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "specs_fn_naut_p", "SPECS-FN-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "specs_fn_arg", "SPECS-FN-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "el_sequence_p", "EL-SEQUENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_proper_sequence_p", "EL-PROPER-SEQUENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "groundP", "GROUND?", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_ground_tree_p", "HL-GROUND-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closedP", "CLOSED?", 1, 1, false );
    SubLFiles.declareFunction( me, "no_free_variablesP", "NO-FREE-VARIABLES?", 1, 1, false );
    SubLFiles.declareFunction( me, "string_to_el_var_name", "STRING-TO-EL-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_el_var_name_int", "STRING-TO-EL-VAR-NAME-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "optimize_el_formula_variable_names", "OPTIMIZE-EL-FORMULA-VARIABLE-NAMES", 1, 3, false );
    SubLFiles.declareFunction( me, "noptimize_el_formula_variable_names", "NOPTIMIZE-EL-FORMULA-VARIABLE-NAMES", 1, 3, false );
    SubLFiles.declareFunction( me, "optimize_el_formula_variable_name", "OPTIMIZE-EL-FORMULA-VARIABLE-NAME", 2, 2, false );
    SubLFiles.declareFunction( me, "correct_variables", "CORRECT-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "xyz_ify_el_formula_variable_names", "XYZ-IFY-EL-FORMULA-VARIABLE-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "next_named_var", "NEXT-NAMED-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "correct_variable", "CORRECT-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_variable_rename_impossibleP", "SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "contains_polycanonicalized_existential_quantifier", "CONTAINS-POLYCANONICALIZED-EXISTENTIAL-QUANTIFIER", 2, 0, false );
    SubLFiles.declareFunction( me, "sequence_term", "SEQUENCE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "sequence_var", "SEQUENCE-VAR", 1, 1, false );
    SubLFiles.declareFunction( me, "sequence_non_var", "SEQUENCE-NON-VAR", 1, 1, false );
    SubLFiles.declareFunction( me, "maybe_add_sequence_var_to_end", "MAYBE-ADD-SEQUENCE-VAR-TO-END", 2, 0, false );
    SubLFiles.declareFunction( me, "add_sequence_var_to_end", "ADD-SEQUENCE-VAR-TO-END", 2, 0, false );
    SubLFiles.declareFunction( me, "nadd_sequence_var_to_end", "NADD-SEQUENCE-VAR-TO-END", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_sequence_var", "STRIP-SEQUENCE-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "safe_strip_sequence_var", "SAFE-STRIP-SEQUENCE-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_with_sequence_termP", "FORMULA-WITH-SEQUENCE-TERM?", 1, 0, false );
    new $formula_with_sequence_termP$UnaryFunction();
    SubLFiles.declareFunction( me, "el_formula_without_sequence_termP", "EL-FORMULA-WITHOUT-SEQUENCE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_with_sequence_varP", "FORMULA-WITH-SEQUENCE-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_with_sequence_non_varP", "FORMULA-WITH-SEQUENCE-NON-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "ignore_sequence_vars", "IGNORE-SEQUENCE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "regularize_sequence_vars", "REGULARIZE-SEQUENCE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "opaquify_subl_escape", "OPAQUIFY-SUBL-ESCAPE", 1, 0, false );
    SubLFiles.declareFunction( me, "opaquify_subl_escapes", "OPAQUIFY-SUBL-ESCAPES", 1, 0, false );
    SubLFiles.declareFunction( me, "nopaquify_subl_escapes", "NOPAQUIFY-SUBL-ESCAPES", 1, 0, false );
    SubLFiles.declareFunction( me, "term_is_one_of_argsP", "TERM-IS-ONE-OF-ARGS?", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_position", "FORMULA-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_arity", "FORMULA-ARITY", 1, 1, false );
    SubLFiles.declareFunction( me, "arglist_arity", "ARGLIST-ARITY", 1, 1, false );
    SubLFiles.declareFunction( me, "expression_arity", "EXPRESSION-ARITY", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_length", "FORMULA-LENGTH", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_arityL", "FORMULA-ARITY<", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_arityLE", "FORMULA-ARITY<=", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_arityG", "FORMULA-ARITY>", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_arityGE", "FORMULA-ARITY>=", 2, 1, false );
    SubLFiles.declareFunction( me, "el_formula_arityGE", "EL-FORMULA-ARITY>=", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_arityE", "FORMULA-ARITY=", 2, 1, false );
    SubLFiles.declareFunction( me, "el_formula_arityE", "EL-FORMULA-ARITY=", 2, 1, false );
    SubLFiles.declareFunction( me, "greater_formula_arity_p", "GREATER-FORMULA-ARITY-P", 2, 1, false );
    SubLFiles.declareFunction( me, "same_formula_arity_p", "SAME-FORMULA-ARITY-P", 2, 1, false );
    SubLFiles.declareFunction( me, "greater_or_same_formula_arity_p", "GREATER-OR-SAME-FORMULA-ARITY-P", 2, 1, false );
    SubLFiles.declareFunction( me, "lesser_formula_arity_p", "LESSER-FORMULA-ARITY-P", 2, 1, false );
    SubLFiles.declareFunction( me, "lesser_or_same_formula_arity_p", "LESSER-OR-SAME-FORMULA-ARITY-P", 2, 1, false );
    SubLFiles.declareFunction( me, "compatible_formula_arity_p", "COMPATIBLE-FORMULA-ARITY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "first_in_sequence", "FIRST-IN-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rest_of_sequence", "REST-OF-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "last_of_sequence", "LAST-OF-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "butlast_of_sequence", "BUTLAST-OF-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "every_in_sequence", "EVERY-IN-SEQUENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_quantifier", "SENTENCE-QUANTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_var_list", "QUANTIFIED-VAR-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_var", "QUANTIFIED-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_var_argnum", "QUANTIFIED-VAR-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_var_argnum_for_operator", "QUANTIFIED-VAR-ARGNUM-FOR-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "existential_bound", "EXISTENTIAL-BOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_sub_sentence", "QUANTIFIED-SUB-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_sub_sentence_argnum", "QUANTIFIED-SUB-SENTENCE-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_sub_sentence_argnum_for_operator", "QUANTIFIED-SUB-SENTENCE-ARGNUM-FOR-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "el_list_items", "EL-LIST-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_list_length", "EL-LIST-LENGTH", 1, 0, false );
    SubLFiles.declareMacro( me, "do_el_list", "DO-EL-LIST" );
    SubLFiles.declareMacro( me, "do_el_list_numbered", "DO-EL-LIST-NUMBERED" );
    SubLFiles.declareFunction( me, "el_list_to_subl_list_recursively", "EL-LIST-TO-SUBL-LIST-RECURSIVELY", 1, 0, false );
    SubLFiles.declareFunction( me, "el_list_to_subl_list_recursively_int", "EL-LIST-TO-SUBL-LIST-RECURSIVELY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_subl_symbol_symbol", "CYCL-SUBL-SYMBOL-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_subl_symbol_symbol_list", "CYCL-SUBL-SYMBOL-SYMBOL-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_escape_subl", "SUBL-ESCAPE-SUBL", 1, 0, false );
    SubLFiles.declareFunction( me, "el_extensional_set_elements", "EL-EXTENSIONAL-SET-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_set_size", "EL-SET-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "list_to_elf", "LIST-TO-ELF", 1, 0, false );
    SubLFiles.declareFunction( me, "elf_to_list", "ELF-TO-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_formula", "MAKE-EL-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "make_formula", "MAKE-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "copy_formula", "COPY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_sentence", "COPY-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_clause", "COPY-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_clauses", "COPY-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_expression", "COPY-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_literal", "MAKE-EL-LITERAL", 2, 1, false );
    SubLFiles.declareFunction( me, "make_unary_formula", "MAKE-UNARY-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_binary_formula", "MAKE-BINARY-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "make_ternary_formula", "MAKE-TERNARY-FORMULA", 4, 0, false );
    SubLFiles.declareFunction( me, "make_quaternary_formula", "MAKE-QUATERNARY-FORMULA", 5, 0, false );
    SubLFiles.declareFunction( me, "make_negation", "MAKE-NEGATION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_disjunction", "MAKE-DISJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_conjunction", "MAKE-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_implication", "MAKE-IMPLICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_universal", "MAKE-UNIVERSAL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_existential", "MAKE-EXISTENTIAL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_regularly_quantified_sentence", "MAKE-REGULARLY-QUANTIFIED-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_multiply_quantified_sentence", "MAKE-MULTIPLY-QUANTIFIED-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_bounded_existential", "MAKE-BOUNDED-EXISTENTIAL", 4, 0, false );
    SubLFiles.declareFunction( me, "make_existential_min", "MAKE-EXISTENTIAL-MIN", 3, 0, false );
    SubLFiles.declareFunction( me, "make_existential_max", "MAKE-EXISTENTIAL-MAX", 3, 0, false );
    SubLFiles.declareFunction( me, "make_existential_exact", "MAKE-EXISTENTIAL-EXACT", 3, 0, false );
    SubLFiles.declareFunction( me, "make_ist_sentence", "MAKE-IST-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ist_sentence_from_mt_asent_sense", "MAKE-IST-SENTENCE-FROM-MT-ASENT-SENSE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_unary_nat_formula", "MAKE-UNARY-NAT-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_binary_nat_formula", "MAKE-BINARY-NAT-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "make_nat_formula", "MAKE-NAT-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_el_list", "MAKE-EL-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "make_el_list_recursively", "MAKE-EL-LIST-RECURSIVELY", 1, 2, false );
    SubLFiles.declareFunction( me, "make_el_list_recursively_int", "MAKE-EL-LIST-RECURSIVELY-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "make_cycl_subl_symbol", "MAKE-CYCL-SUBL-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_set", "MAKE-EL-SET", 1, 1, false );
    SubLFiles.declareFunction( me, "el_set_items", "EL-SET-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_instance_named", "MAKE-INSTANCE-NAMED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_specs_fn", "MAKE-SPECS-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "unmake_unary_formula", "UNMAKE-UNARY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "unmake_binary_formula", "UNMAKE-BINARY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "unmake_ternary_formula", "UNMAKE-TERNARY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "unmake_quaternary_formula", "UNMAKE-QUATERNARY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "map_formula_args", "MAP-FORMULA-ARGS", 2, 1, false );
    SubLFiles.declareFunction( me, "nmap_formula_args", "NMAP-FORMULA-ARGS", 2, 1, false );
    SubLFiles.declareFunction( me, "map_formula_terms", "MAP-FORMULA-TERMS", 2, 1, false );
    SubLFiles.declareFunction( me, "nmap_formula_terms", "NMAP-FORMULA-TERMS", 2, 1, false );
    SubLFiles.declareFunction( me, "map_formula_terms_if", "MAP-FORMULA-TERMS-IF", 3, 1, false );
    SubLFiles.declareFunction( me, "map_formula_terms_if_not", "MAP-FORMULA-TERMS-IF-NOT", 3, 1, false );
    SubLFiles.declareFunction( me, "pass_through_if_negation", "PASS-THROUGH-IF-NEGATION", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_disjunction", "PASS-THROUGH-IF-DISJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_conjunction", "PASS-THROUGH-IF-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_regularly_quantified", "PASS-THROUGH-IF-REGULARLY-QUANTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_bounded_existential", "PASS-THROUGH-IF-BOUNDED-EXISTENTIAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_junction", "PASS-THROUGH-IF-JUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_logical_op", "PASS-THROUGH-IF-LOGICAL-OP", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_quantified", "PASS-THROUGH-IF-QUANTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_logical_op_or_quantified", "PASS-THROUGH-IF-LOGICAL-OP-OR-QUANTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "pass_through_if_relation_syntax", "PASS-THROUGH-IF-RELATION-SYNTAX", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_formula_arg", "FUNCALL-FORMULA-ARG", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_formula_arg_binary", "FUNCALL-FORMULA-ARG-BINARY", 4, 0, false );
    SubLFiles.declareFunction( me, "replace_formula_arg", "REPLACE-FORMULA-ARG", 3, 0, false );
    SubLFiles.declareFunction( me, "nreplace_formula_arg", "NREPLACE-FORMULA-ARG", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_formula_arg", "REMOVE-FORMULA-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "replace_formula_arg_position", "REPLACE-FORMULA-ARG-POSITION", 3, 0, false );
    SubLFiles.declareFunction( me, "nreplace_formula_arg_position", "NREPLACE-FORMULA-ARG-POSITION", 3, 0, false );
    SubLFiles.declareFunction( me, "formula_has_arg_position_p", "FORMULA-HAS-ARG-POSITION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "replace_arg_of_pred_lambda_test", "REPLACE-ARG-OF-PRED-LAMBDA-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_arg_of_pred_lambda_transform", "REPLACE-ARG-OF-PRED-LAMBDA-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_arg_of_pred", "REPLACE-ARG-OF-PRED", 5, 0, false );
    SubLFiles.declareFunction( me, "literal_atomic_sentence", "LITERAL-ATOMIC-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_truth", "LITERAL-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_sense", "LITERAL-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_args", "LITERAL-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_terms", "LITERAL-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg", "LITERAL-ARG", 2, 1, false );
    SubLFiles.declareFunction( me, "literal_predicate", "LITERAL-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg0", "LITERAL-ARG0", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg1", "LITERAL-ARG1", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg2", "LITERAL-ARG2", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg3", "LITERAL-ARG3", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg4", "LITERAL-ARG4", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arg5", "LITERAL-ARG5", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_arity", "LITERAL-ARITY", 1, 1, false );
    SubLFiles.declareFunction( me, "asent_and_sense_to_literal", "ASENT-AND-SENSE-TO-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "asent_and_truth_to_literal", "ASENT-AND-TRUTH-TO-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "el_negative_sentences", "EL-NEGATIVE-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "el_positive_sentences", "EL-POSITIVE-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_lits", "ISA-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "tou_lits", "TOU-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "equals_lits", "EQUALS-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_lits", "EVALUATE-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "ab_lits", "AB-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "meets_pragmatic_requirement_asents", "MEETS-PRAGMATIC-REQUIREMENT-ASENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_lits", "PRED-LITS", 2, 0, false );
    SubLFiles.declareFunction( me, "reflexive_lits", "REFLEXIVE-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_tou_lits", "REMOVE-TOU-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_negated_literal_p", "EL-NEGATED-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "unary_lit_p", "UNARY-LIT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "binary_lit_p", "BINARY-LIT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_litP", "PRED-LIT?", 2, 0, false );
    SubLFiles.declareFunction( me, "ab_litP", "AB-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_litP", "ISA-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_var_fort_litP", "ISA-VAR-FORT-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_var_var_litP", "ISA-VAR-VAR-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_hl_var_hl_var_litP", "ISA-HL-VAR-HL-VAR-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_hl_var_thing_litP", "ISA-HL-VAR-THING-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "quoted_isa_litP", "QUOTED-ISA-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "genls_litP", "GENLS-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_preds_litP", "GENL-PREDS-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_inverse_litP", "GENL-INVERSE-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_litP", "GENL-MT-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "result_isa_litP", "RESULT-ISA-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "result_genl_litP", "RESULT-GENL-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "tou_litP", "TOU-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "tou_asentP", "TOU-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "equals_litP", "EQUALS-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "holds_in_litP", "HOLDS-IN-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "true_sentence_litP", "TRUE-SENTENCE-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_non_trigger_literal_litP", "FORWARD-NON-TRIGGER-LITERAL-LIT?", 1, 0, false );
    new $forward_non_trigger_literal_litP$UnaryFunction();
    SubLFiles.declareFunction( me, "forward_trigger_literal_litP", "FORWARD-TRIGGER-LITERAL-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_pragmatic_trigger_literal_litP", "FORWARD-PRAGMATIC-TRIGGER-LITERAL-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "default_forward_non_trigger_literal_litP", "DEFAULT-FORWARD-NON-TRIGGER-LITERAL-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_default_forward_non_trigger_literal_predicateP", "CLEAR-DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_default_forward_non_trigger_literal_predicateP", "REMOVE-DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "default_forward_non_trigger_literal_predicateP_internal", "DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "default_forward_non_trigger_literal_predicateP", "DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_litP", "EVALUATE-LIT?", 1, 1, false );
    SubLFiles.declareFunction( me, "potentially_solvable_evaluate_asentP", "POTENTIALLY-SOLVABLE-EVALUATE-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_el_expressionP", "EVALUATABLE-EL-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "datum_constantP", "DATUM-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_binary_litP", "ARG-ISA-BINARY-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "reflexive_litP", "REFLEXIVE-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_equals_litP", "NAUT-EQUALS-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "ist_sentence_p", "IST-SENTENCE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "ist_predicateP", "IST-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "ist_of_atomic_sentence_p", "IST-OF-ATOMIC-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ist_of_atomic_sentence_with_pred_p", "IST-OF-ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "ist_of_atomic_sentence_int", "IST-OF-ATOMIC-SENTENCE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "ist_sentence_with_chlmt_p", "IST-SENTENCE-WITH-CHLMT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "true_sentence_p", "TRUE-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "true_sentence_of_atomic_sentence_p", "TRUE-SENTENCE-OF-ATOMIC-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negated_true_sentence_p", "NEGATED-TRUE-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "max_literal_count", "MAX-LITERAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_count", "LITERAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "kappa_asent_p", "KAPPA-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kappa_predicate_p", "KAPPA-PREDICATE-P", 1, 0, false );
    new $kappa_predicate_p$UnaryFunction();
    SubLFiles.declareFunction( me, "kappa_predicate_formal_args", "KAPPA-PREDICATE-FORMAL-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "kappa_predicate_arity", "KAPPA-PREDICATE-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "kappa_predicate_query", "KAPPA-PREDICATE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lambda_function_p", "LAMBDA-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lambda_function_formal_args", "LAMBDA-FUNCTION-FORMAL-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "lambda_function_arity", "LAMBDA-FUNCTION-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "lambda_function_expression", "LAMBDA-FUNCTION-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_designating_literalP", "MT-DESIGNATING-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_designating_formulaP", "MT-DESIGNATING-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_designation_argnum", "MT-DESIGNATION-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "designated_mt", "DESIGNATED-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_designation_argnum", "SENTENCE-DESIGNATION-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "designated_sentence", "DESIGNATED-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_argnum_p", "VALID-ARGNUM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_arity_p", "VALID-ARITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "explicitify_implicit_universal_quantifiers", "EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "implicitify_explicit_universal_quantifiers", "IMPLICITIFY-EXPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "explicitify_implicit_existential_quantifiers", "EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "implicitify_explicit_existential_quantifiers", "IMPLICITIFY-EXPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "bind_all_free_vars", "BIND-ALL-FREE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "existentially_bind_vars", "EXISTENTIALLY-BIND-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "rule_formula_has_unlabelled_dont_care_variableP", "RULE-FORMULA-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_formula_unlabelled_dont_care_variables", "RULE-FORMULA-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "recursive_nat_functor", "RECURSIVE-NAT-FUNCTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_specP", "PREDICATE-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "function_specP", "FUNCTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "expand_join_left", "EXPAND-JOIN-LEFT", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_there_exist_vars", "EXPAND-THERE-EXIST-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_for_all_vars", "EXPAND-FOR-ALL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "true_sentence_case_insensitive_expansion", "TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION", 1, 0, false );
    SubLFiles.declareFunction( me, "true_sentence_case_insensitive_expansion_int", "TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_has_true_sentence_case_insensitive_supportP", "SENTENCE-HAS-TRUE-SENTENCE-CASE-INSENSITIVE-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_has_nontrivial_true_sentence_case_insensitive_supportP", "SENTENCE-HAS-NONTRIVIAL-TRUE-SENTENCE-CASE-INSENSITIVE-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_relation_expressionP", "EL-RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_relation_expressionP", "HL-RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_expressionP", "RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_formulaP", "EL-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_atomic_sentenceP", "EL-ATOMIC-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_non_atomic_sentenceP", "EL-NON-ATOMIC-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_gaf_formula_p", "EL-GAF-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "el_rule_formula_p", "EL-RULE-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "literalP", "LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "atomic_sentenceP", "ATOMIC-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "gafP", "GAF?", 1, 0, false );
    new $gafP$UnaryFunction();
    SubLFiles.declareFunction( me, "cafP", "CAF?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_var_listP", "EL-VAR-LIST?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_non_var_symbols", "FORMULA-NON-VAR-SYMBOLS", 1, 1, false );
    SubLFiles.declareFunction( me, "referenced_variables", "REFERENCED-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_variables", "SENTENCE-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "literal_variables", "LITERAL-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "naut_variables", "NAUT-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "relation_variables", "RELATION-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "scoped_vars", "SCOPED-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "literals_variables", "LITERALS-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "literals_free_sequence_variables", "LITERALS-FREE-SEQUENCE-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "literal_free_sequence_variables", "LITERAL-FREE-SEQUENCE-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "naut_free_sequence_variables", "NAUT-FREE-SEQUENCE-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "possibly_formula_with_sequence_variablesP", "POSSIBLY-FORMULA-WITH-SEQUENCE-VARIABLES?", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_free_sequence_variables", "RELATION-FREE-SEQUENCE-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "sentence_free_term_variables", "SENTENCE-FREE-TERM-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "sentence_free_sequence_variables", "SENTENCE-FREE-SEQUENCE-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "occurs_as_sequence_variableP", "OCCURS-AS-SEQUENCE-VARIABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "occurs_as_term_variableP", "OCCURS-AS-TERM-VARIABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "occurs_as_sequence_variable_in_clauseP", "OCCURS-AS-SEQUENCE-VARIABLE-IN-CLAUSE?", 2, 0, false );
    SubLFiles.declareFunction( me, "occurs_as_term_variable_in_clauseP", "OCCURS-AS-TERM-VARIABLE-IN-CLAUSE?", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_has_term_in_argnumP", "FORMULA-HAS-TERM-IN-ARGNUM?", 3, 0, false );
    SubLFiles.declareFunction( me, "term_occurs_as_formula_argument", "TERM-OCCURS-AS-FORMULA-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "appearing_as_both_sequence_and_term_variables", "APPEARING-AS-BOTH-SEQUENCE-AND-TERM-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_with_variable_appearing_as_both_sequence_and_term_variableP", "FORMULA-WITH-VARIABLE-APPEARING-AS-BOTH-SEQUENCE-AND-TERM-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_term_variables", "SENTENCE-TERM-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_sequence_variables", "SENTENCE-SEQUENCE-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "wf_wrt_sequence_varsP", "WF-WRT-SEQUENCE-VARS?", 1, 0, false );
    SubLFiles.declareFunction( me, "subformulas_wf_wrt_sequence_varsP", "SUBFORMULAS-WF-WRT-SEQUENCE-VARS?", 1, 0, false );
    SubLFiles.declareFunction( me, "conditional_sentence_free_variables", "CONDITIONAL-SENTENCE-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "sentence_free_variables", "SENTENCE-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "sentence_free_variables_int", "SENTENCE-FREE-VARIABLES-INT", 1, 3, false );
    SubLFiles.declareFunction( me, "literals_free_variables", "LITERALS-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "literal_free_variables", "LITERAL-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "naut_free_variables", "NAUT-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "relation_free_variables", "RELATION-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "relation_closed_variables", "RELATION-CLOSED-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "expression_free_variables", "EXPRESSION-FREE-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "expression_shared_free_variables", "EXPRESSION-SHARED-FREE-VARIABLES", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_quantified_vars", "FORMULA-QUANTIFIED-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_quantified_vars_int", "FORMULA-QUANTIFIED-VARS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_subst", "VARIABLE-SUBST", 3, 0, false );
    SubLFiles.declareFunction( me, "formula_denoting_collectionP", "FORMULA-DENOTING-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_denoting_collectionP", "SENTENCE-DENOTING-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "scoping_relation_expressionP", "SCOPING-RELATION-EXPRESSION?", 1, 0, false );
    new $scoping_relation_expressionP$UnaryFunction();
    SubLFiles.declareFunction( me, "arg_types_of_expression_prescribe_unreifiedP", "ARG-TYPES-OF-EXPRESSION-PRESCRIBE-UNREIFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_types_prescribe_unreifiedP", "ARG-TYPES-PRESCRIBE-UNREIFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_types_prescribe_tacit_term_listP", "ARG-TYPES-PRESCRIBE-TACIT-TERM-LIST?", 2, 0, false );
    SubLFiles.declareFunction( me, "to_be_killed_warning", "TO-BE-KILLED-WARNING", 1, 2, false );
    SubLFiles.declareFunction( me, "el_error", "EL-ERROR", 2, 3, false );
    SubLFiles.declareFunction( me, "el_warn", "EL-WARN", 2, 3, false );
    SubLFiles.declareFunction( me, "el_tracing_p", "EL-TRACING-P", 0, 1, false );
    SubLFiles.declareFunction( me, "el_remove_outermost_existentials", "EL-REMOVE-OUTERMOST-EXISTENTIALS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_remove_unnecessary_existentials", "EL-REMOVE-UNNECESSARY-EXISTENTIALS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_remove_unnecessary_existentials_1", "EL-REMOVE-UNNECESSARY-EXISTENTIALS-1", 2, 0, false );
    SubLFiles.declareFunction( me, "el_remove_unnecessary_existentials_2", "EL-REMOVE-UNNECESSARY-EXISTENTIALS-2", 1, 0, false );
    SubLFiles.declareFunction( me, "el_remove_unnecessary_equality", "EL-REMOVE-UNNECESSARY-EQUALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "el_remove_unnecessary_conjunctions", "EL-REMOVE-UNNECESSARY-CONJUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_vars_unifiedP", "EL-VARS-UNIFIED?", 3, 0, false );
    SubLFiles.declareFunction( me, "el_vars_unifiedP_int", "EL-VARS-UNIFIED?-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "el_var_unification_in_expression", "EL-VAR-UNIFICATION-IN-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_el_duplicates", "REMOVE-EL-DUPLICATES", 1, 3, false );
    SubLFiles.declareFunction( me, "binding_lists_to_expression", "BINDING-LISTS-TO-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "expression_to_binding_lists", "EXPRESSION-TO-BINDING-LISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_with_name_p", "CONSTANT-WITH-NAME-P", 2, 0, false );
    SubLFiles.declareFunction( me, "constant_with_any_of_names_p", "CONSTANT-WITH-ANY-OF-NAMES-P", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_with_el_variableP", "FORMULA-WITH-EL-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_with_nested_variableP", "FORMULA-WITH-NESTED-VARIABLE?", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_with_hl_variableP", "FORMULA-WITH-HL-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_with_nested_hl_variableP", "FORMULA-WITH-NESTED-HL-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_formula_query_signature", "HL-FORMULA-QUERY-SIGNATURE", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_query_signature", "FORMULA-QUERY-SIGNATURE", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_query_signature_int", "FORMULA-QUERY-SIGNATURE-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_query_signature_term_p", "FORMULA-QUERY-SIGNATURE-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_query_signature_ordered_bound_arg_positions", "FORMULA-QUERY-SIGNATURE-ORDERED-BOUND-ARG-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "bound_arg_position_better_for_indexingL", "BOUND-ARG-POSITION-BETTER-FOR-INDEXING<", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_query_ordered_terms_and_bound_arg_positions", "FORMULA-QUERY-ORDERED-TERMS-AND-BOUND-ARG-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sorted_sentence_free_variables", "SORTED-SENTENCE-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "sorted_conditional_sentence_free_variables", "SORTED-CONDITIONAL-SENTENCE-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "optimized_el_formula_matches_pattern", "OPTIMIZED-EL-FORMULA-MATCHES-PATTERN", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_el_utilities_file()
  {
    $cyc_const_unary_logical_ops$ = SubLFiles.defconstant( "*CYC-CONST-UNARY-LOGICAL-OPS*", ConsesLow.list( $const3$not ) );
    $cyc_const_binary_logical_ops$ = SubLFiles.defconstant( "*CYC-CONST-BINARY-LOGICAL-OPS*", ConsesLow.list( $const8$implies, $const10$xor, $const9$equiv ) );
    $cyc_const_ternary_logical_ops$ = SubLFiles.defconstant( "*CYC-CONST-TERNARY-LOGICAL-OPS*", NIL );
    $cyc_const_quaternary_logical_ops$ = SubLFiles.defconstant( "*CYC-CONST-QUATERNARY-LOGICAL-OPS*", NIL );
    $cyc_const_quintary_logical_ops$ = SubLFiles.defconstant( "*CYC-CONST-QUINTARY-LOGICAL-OPS*", NIL );
    $cyc_const_variable_arity_logical_ops$ = SubLFiles.defconstant( "*CYC-CONST-VARIABLE-ARITY-LOGICAL-OPS*", ConsesLow.list( $const7$and, $const5$or ) );
    $cyc_const_regular_quantifiers$ = SubLFiles.defconstant( "*CYC-CONST-REGULAR-QUANTIFIERS*", ConsesLow.list( $const14$thereExists, $const11$forAll ) );
    $cyc_const_bounded_existentials$ = SubLFiles.defconstant( "*CYC-CONST-BOUNDED-EXISTENTIALS*", ConsesLow.list( $const18$thereExistExactly, $const17$thereExistAtMost, $const16$thereExistAtLeast ) );
    $cyc_const_tense_operators$ = SubLFiles.defconstant( "*CYC-CONST-TENSE-OPERATORS*", $list19 );
    $cyc_const_metric_tense_operators$ = SubLFiles.defconstant( "*CYC-CONST-METRIC-TENSE-OPERATORS*", $list20 );
    $cyc_const_exception_operators$ = SubLFiles.defconstant( "*CYC-CONST-EXCEPTION-OPERATORS*", ConsesLow.list( $const42$exceptFor, $const43$exceptWhen ) );
    $cyc_const_pragmatic_requirement_operators$ = SubLFiles.defconstant( "*CYC-CONST-PRAGMATIC-REQUIREMENT-OPERATORS*", ConsesLow.list( $const45$pragmaticRequirement ) );
    $standard_single_letter_el_var_names$ = SubLFiles.deflexical( "*STANDARD-SINGLE-LETTER-EL-VAR-NAMES*", $list67 );
    $dont_enforce_subl_escape_in_symbols$ = SubLFiles.defparameter( "*DONT-ENFORCE-SUBL-ESCAPE-IN-SYMBOLS*", T );
    $replace_arg_of_pred_pred$ = SubLFiles.defparameter( "*REPLACE-ARG-OF-PRED-PRED*", $kw92$UNINITIALIZED );
    $replace_arg_of_pred_argnum$ = SubLFiles.defparameter( "*REPLACE-ARG-OF-PRED-ARGNUM*", $kw92$UNINITIALIZED );
    $replace_arg_of_pred_arg$ = SubLFiles.defparameter( "*REPLACE-ARG-OF-PRED-ARG*", $kw92$UNINITIALIZED );
    $replace_arg_of_pred_new_arg$ = SubLFiles.defparameter( "*REPLACE-ARG-OF-PRED-NEW-ARG*", $kw92$UNINITIALIZED );
    $default_forward_non_trigger_literal_predicateP_caching_state$ = SubLFiles.deflexical( "*DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?-CACHING-STATE*", NIL );
    $arg1_subl_list_relations$ = SubLFiles.deflexical( "*ARG1-SUBL-LIST-RELATIONS*", $list161 );
    $arg2_subl_list_relations$ = SubLFiles.deflexical( "*ARG2-SUBL-LIST-RELATIONS*", $list162 );
    $bound_arg_position_preferences$ = SubLFiles.deflexical( "*BOUND-ARG-POSITION-PREFERENCES*", $list182 );
    return NIL;
  }

  public static SubLObject setup_el_utilities_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list0 );
    SubLSpecialOperatorDeclarations.proclaim( $list1 );
    SubLSpecialOperatorDeclarations.proclaim( $list2 );
    SubLSpecialOperatorDeclarations.proclaim( $list4 );
    SubLSpecialOperatorDeclarations.proclaim( $list6 );
    utilities_macros.register_cyc_api_function( $sym60$GROUND_, $list61, $str62$Returns_whether_EXPRESSION_is_fre, NIL, $list63 );
    access_macros.register_external_symbol( $sym65$OPTIMIZE_EL_FORMULA_VARIABLE_NAME );
    access_macros.register_external_symbol( $sym87$MAKE_EL_FORMULA );
    memoization_state.note_globally_cached_function( $sym120$DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_ );
    access_macros.register_external_symbol( $sym132$BIND_ALL_FREE_VARS );
    utilities_macros.register_kb_function( $sym138$EXPAND_JOIN_LEFT );
    utilities_macros.register_kb_function( $sym139$EXPAND_THERE_EXIST_VARS );
    utilities_macros.register_kb_function( $sym140$EXPAND_FOR_ALL_VARS );
    utilities_macros.register_kb_function( $sym141$TRUE_SENTENCE_CASE_INSENSITIVE_EXPANSION );
    utilities_macros.register_kb_function( $sym148$GAF_ );
    generic_testing.define_test_case_table_int( $sym183$FORMULA_WITH_NESTED_VARIABLE_, ConsesLow.list( new SubLObject[] { $kw184$TEST, NIL, $kw185$OWNER, NIL, $kw186$CLASSES, NIL, $kw187$KB, $kw188$TINY, $kw189$WORKING_,
      T
    } ), $list190 );
    generic_testing.define_test_case_table_int( $sym191$SORTED_SENTENCE_FREE_VARIABLES, ConsesLow.list( new SubLObject[] { $kw184$TEST, NIL, $kw185$OWNER, NIL, $kw186$CLASSES, NIL, $kw187$KB, $kw188$TINY,
      $kw189$WORKING_, T
    } ), $list192 );
    generic_testing.define_test_case_table_int( $sym193$SORTED_CONDITIONAL_SENTENCE_FREE_VARIABLES, ConsesLow.list( new SubLObject[] { $kw184$TEST, NIL, $kw185$OWNER, NIL, $kw186$CLASSES, NIL, $kw187$KB, $kw188$TINY,
      $kw189$WORKING_, T
    } ), $list194 );
    generic_testing.define_test_case_table_int( $sym195$STRING_TO_EL_VAR_NAME, ConsesLow.list( new SubLObject[] { $kw184$TEST, NIL, $kw185$OWNER, NIL, $kw186$CLASSES, NIL, $kw187$KB, $kw188$TINY, $kw189$WORKING_, T
    } ), $list196 );
    generic_testing.define_test_case_table_int( $sym197$OPTIMIZE_EL_FORMULA_VARIABLE_NAMES, ConsesLow.list( new SubLObject[] { $kw184$TEST, $sym198$OPTIMIZED_EL_FORMULA_MATCHES_PATTERN, $kw185$OWNER, NIL, $kw186$CLASSES,
      NIL, $kw187$KB, $kw199$FULL, $kw189$WORKING_, T
    } ), $list200 );
    return NIL;
  }

  private static SubLObject _constant_200_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
        .reader_make_constant_shell( makeString( "Person" ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
                    .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), constant_handles
                        .reader_make_constant_shell( makeString( "Tiger" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString(
                            "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                    "?Y" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list(
                                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "EL-VARIABLE" ), constant_handles.reader_make_constant_shell( makeString( "Tiger" ) ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ),
          constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles
                          .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?Y" ), constant_handles
                              .reader_make_constant_shell( makeString( "Tiger" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                      makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "genls" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ) ) ), ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles
                                                  .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
                                                      "EL-VARIABLE" ), constant_handles.reader_make_constant_shell( makeString( "Tiger" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                          .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "Person" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NOT" ),
                                                                          makeSymbol( "?X" ) ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                              constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                  "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                          "Tiger" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ),
                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeSymbol( "?X" ) ), constant_handles
                                                                                      .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "isa" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeSymbol( "?X" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                              "Tiger" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ), constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
                                                                                                              makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list(
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword(
                                                                                                                      "NOT" ), makeSymbol( "?X" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "Mammal" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list(
                                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol(
                                                                                                                                              "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "Tiger" ) ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "InferencePSC" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "InferencePSC" ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "genls" ) ),
                                                                                                                                                              makeSymbol( "?X" ), constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "Person" ) ) ) ),
                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow
                                                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow
                                                                                                                                      .list( makeKeyword( "NOT" ), makeSymbol( "?X" ) ), constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list(
                                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
                                                                                                                                              ConsesLow.list( makeKeyword( "NOT" ), makeSymbol( "?X" ) ), constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "Tiger" ) ) ) ) ), ConsesLow
                                                                                                                                                      .list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                                                                                                                                              "?X" ), constant_handles.reader_make_constant_shell(
                                                                                                                                                                  makeString( "Person" ) ) ), constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "InferencePSC" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "InferencePSC" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "isa" ) ),
                                                                                                                                                                                      makeSymbol( "?X" ), constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "Mammal" ) ) ) ),
                                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "Person" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
          "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
              .reader_make_constant_shell( makeString( "MaleAnimal" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
              .reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                  makeString( "MaleAnimal" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles
                      .reader_make_constant_shell( makeString( "Person" ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                              "Mammal" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                  "Person" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "MaleAnimal" ) ) ) ), constant_handles
                                              .reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ) ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol(
                                                          "?X" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "MaleAnimal" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                      "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString( "Tiger" ) ) ) ),
                                                                  constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ),
                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                                                      makeString( "Mammal" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ),
                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeSymbol( "?Y" ) ),
                                                                              constant_handles.reader_make_constant_shell( makeString( "Tiger" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
                                                                                      makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ), ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                              "Tiger" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "genls" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "Mammal" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow
                                                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?X" ),
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "Mammal" ) ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword( "NOT" ),
                                                                                                                          makeSymbol( "?Y" ) ), constant_handles.reader_make_constant_shell( makeString( "Tiger" ) ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_el_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_el_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_el_utilities_file();
  }
  static
  {
    me = new el_utilities();
    $cyc_const_unary_logical_ops$ = null;
    $cyc_const_binary_logical_ops$ = null;
    $cyc_const_ternary_logical_ops$ = null;
    $cyc_const_quaternary_logical_ops$ = null;
    $cyc_const_quintary_logical_ops$ = null;
    $cyc_const_variable_arity_logical_ops$ = null;
    $cyc_const_regular_quantifiers$ = null;
    $cyc_const_bounded_existentials$ = null;
    $cyc_const_tense_operators$ = null;
    $cyc_const_metric_tense_operators$ = null;
    $cyc_const_exception_operators$ = null;
    $cyc_const_pragmatic_requirement_operators$ = null;
    $standard_single_letter_el_var_names$ = null;
    $dont_enforce_subl_escape_in_symbols$ = null;
    $replace_arg_of_pred_pred$ = null;
    $replace_arg_of_pred_argnum$ = null;
    $replace_arg_of_pred_arg$ = null;
    $replace_arg_of_pred_new_arg$ = null;
    $default_forward_non_trigger_literal_predicateP_caching_state$ = null;
    $arg1_subl_list_relations$ = null;
    $arg2_subl_list_relations$ = null;
    $bound_arg_position_preferences$ = null;
    $list0 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "EL-FORMULA-WITH-OPERATOR-P" ) );
    $list1 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "EL-FORMULA-WITH-ANY-OF-OPERATORS-P" ) );
    $list2 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "EL-NEGATION-P" ) );
    $const3$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $list4 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "EL-DISJUNCTION-P" ) );
    $const5$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $list6 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "EL-CONJUNCTION-P" ) );
    $const7$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const8$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const9$equiv = constant_handles.reader_make_constant_shell( makeString( "equiv" ) );
    $const10$xor = constant_handles.reader_make_constant_shell( makeString( "xor" ) );
    $const11$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $const12$forAllVars = constant_handles.reader_make_constant_shell( makeString( "forAllVars" ) );
    $sym13$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $const14$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const15$thereExistVars = constant_handles.reader_make_constant_shell( makeString( "thereExistVars" ) );
    $const16$thereExistAtLeast = constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) );
    $const17$thereExistAtMost = constant_handles.reader_make_constant_shell( makeString( "thereExistAtMost" ) );
    $const18$thereExistExactly = constant_handles.reader_make_constant_shell( makeString( "thereExistExactly" ) );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "was" ) ), constant_handles.reader_make_constant_shell( makeString( "hasAlwaysBeen" ) ), constant_handles.reader_make_constant_shell(
        makeString( "willBe" ) ), constant_handles.reader_make_constant_shell( makeString( "willAlwaysBe" ) ) );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "was-Metric" ) ), constant_handles.reader_make_constant_shell( makeString( "willBe-Metric" ) ) );
    $const21$was = constant_handles.reader_make_constant_shell( makeString( "was" ) );
    $const22$hasAlwaysBeen = constant_handles.reader_make_constant_shell( makeString( "hasAlwaysBeen" ) );
    $const23$willBe = constant_handles.reader_make_constant_shell( makeString( "willBe" ) );
    $const24$willAlwaysBe = constant_handles.reader_make_constant_shell( makeString( "willAlwaysBe" ) );
    $const25$was_Metric = constant_handles.reader_make_constant_shell( makeString( "was-Metric" ) );
    $const26$willBe_Metric = constant_handles.reader_make_constant_shell( makeString( "willBe-Metric" ) );
    $const27$ExpandSubLFn = constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) );
    $const28$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $const29$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $sym30$REIFIABLE_FUNCTION_TERM_ = makeSymbol( "REIFIABLE-FUNCTION-TERM?" );
    $sym31$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym32$ASSERTION_EL_IST_FORMULA = makeSymbol( "ASSERTION-EL-IST-FORMULA" );
    $sym33$NART_P = makeSymbol( "NART-P" );
    $sym34$NART_EL_FORMULA = makeSymbol( "NART-EL-FORMULA" );
    $sym35$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym36$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol( "DEFAULT-EL-VAR-FOR-HL-VAR" );
    $sym37$IST_SENTENCE_DESIGNATING_ASSERTION_ = makeSymbol( "IST-SENTENCE-DESIGNATING-ASSERTION?" );
    $sym38$FIND_ASSERTION_CYCL = makeSymbol( "FIND-ASSERTION-CYCL" );
    $sym39$HLIFY = makeSymbol( "HLIFY" );
    $sym40$QUOTE = makeSymbol( "QUOTE" );
    $list41 = ConsesLow.list( makeSymbol( "HLIFY?" ), makeSymbol( "EL" ) );
    $const42$exceptFor = constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) );
    $const43$exceptWhen = constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) );
    $const44$abnormal = constant_handles.reader_make_constant_shell( makeString( "abnormal" ) );
    $const45$pragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "pragmaticRequirement" ) );
    $const46$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "meetsPragmaticRequirement" ) );
    $const47$querySentence = constant_handles.reader_make_constant_shell( makeString( "querySentence" ) );
    $kw48$IGNORE = makeKeyword( "IGNORE" );
    $sym49$EL_RELATION_EXPRESSION_ = makeSymbol( "EL-RELATION-EXPRESSION?" );
    $const50$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $kw51$INCLUDE = makeKeyword( "INCLUDE" );
    $const52$TheEmptyList = constant_handles.reader_make_constant_shell( makeString( "TheEmptyList" ) );
    $const53$TheEmptySet = constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) );
    $const54$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $const55$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $sym56$LISTP = makeSymbol( "LISTP" );
    $str57$A_KB_dependent_numerical_quantifi = makeString( "A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification." );
    $const58$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $sym59$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $sym60$GROUND_ = makeSymbol( "GROUND?" );
    $list61 = ConsesLow.list( makeSymbol( "EXPRESSION" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "VAR?" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYC-VAR?" ) ) ) );
    $str62$Returns_whether_EXPRESSION_is_fre = makeString( "Returns whether EXPRESSION is free of any variables?" );
    $list63 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym64$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym65$OPTIMIZE_EL_FORMULA_VARIABLE_NAME = makeSymbol( "OPTIMIZE-EL-FORMULA-VARIABLE-NAME" );
    $sym66$EL_SENTENCE_P = makeSymbol( "EL-SENTENCE-P" );
    $list67 = ConsesLow.list( new SubLObject[] { makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z" ), makeSymbol( "?W" ), makeSymbol( "?V" ), makeSymbol( "?U" ), makeSymbol( "?A" ), makeSymbol( "?B" ), makeSymbol(
        "?C" ), makeSymbol( "?D" ), makeSymbol( "?E" ), makeSymbol( "?F" ), makeSymbol( "?G" ), makeSymbol( "?H" ), makeSymbol( "?I" ), makeSymbol( "?J" ), makeSymbol( "?K" ), makeSymbol( "?L" ), makeSymbol( "?M" ),
      makeSymbol( "?N" ), makeSymbol( "?O" ), makeSymbol( "?P" ), makeSymbol( "?Q" ), makeSymbol( "?R" ), makeSymbol( "?S" ), makeSymbol( "?T" )
    } );
    $str68$_1 = makeString( "-1" );
    $sym69$INVALID_VARIABLE_NAME_CHAR = makeSymbol( "INVALID-VARIABLE-NAME-CHAR" );
    $const70$ExistentialQuantifier = constant_handles.reader_make_constant_shell( makeString( "ExistentialQuantifier" ) );
    $sym71$SUBL_ESCAPE_P = makeSymbol( "SUBL-ESCAPE-P" );
    $list72 = ConsesLow.list( makeKeyword( "OPAQUE-EL-VARIABLE-LIST" ), makeKeyword( "OPAQUE-SUBL-TEMPLATE" ) );
    $list73 = ConsesLow.list( makeKeyword( "OPAQUE-SUBL-TEMPLATE" ) );
    $str74$unexpected_subl_escape_type__s = makeString( "unexpected subl escape type ~s" );
    $sym75$OPAQUIFY_SUBL_ESCAPE = makeSymbol( "OPAQUIFY-SUBL-ESCAPE" );
    $str76$not_a_known_quantifier___s = makeString( "not a known quantifier: ~s" );
    $str77$not_quantified_sentence___s = makeString( "not quantified sentence: ~s" );
    $sym78$EL_LIST_P = makeSymbol( "EL-LIST-P" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT-VAR" ), makeSymbol( "EL-LIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym80$CDOLIST = makeSymbol( "CDOLIST" );
    $sym81$EL_LIST_ITEMS = makeSymbol( "EL-LIST-ITEMS" );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT-VAR" ), makeSymbol( "NUMBER-VAR" ), makeSymbol( "EL-LIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym83$CDOLIST_NUMBERED = makeSymbol( "CDOLIST-NUMBERED" );
    $sym84$EL_SET_P = makeSymbol( "EL-SET-P" );
    $sym85$CONSP = makeSymbol( "CONSP" );
    $sym86$ELF_P = makeSymbol( "ELF-P" );
    $sym87$MAKE_EL_FORMULA = makeSymbol( "MAKE-EL-FORMULA" );
    $const88$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym89$LIST_WITHOUT_REPETITION_P = makeSymbol( "LIST-WITHOUT-REPETITION-P" );
    $const90$InstanceNamedFn = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) );
    $kw91$HELLO_YOU_SILLY_COMPILER = makeKeyword( "HELLO-YOU-SILLY-COMPILER" );
    $kw92$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym93$REPLACE_ARG_OF_PRED_LAMBDA_TEST = makeSymbol( "REPLACE-ARG-OF-PRED-LAMBDA-TEST" );
    $sym94$REPLACE_ARG_OF_PRED_LAMBDA_TRANSFORM = makeSymbol( "REPLACE-ARG-OF-PRED-LAMBDA-TRANSFORM" );
    $kw95$REGULARIZE = makeKeyword( "REGULARIZE" );
    $kw96$FALSE = makeKeyword( "FALSE" );
    $kw97$TRUE = makeKeyword( "TRUE" );
    $sym98$EL_NEGATION_P = makeSymbol( "EL-NEGATION-P" );
    $sym99$ISA_LIT_ = makeSymbol( "ISA-LIT?" );
    $sym100$TOU_LIT_ = makeSymbol( "TOU-LIT?" );
    $sym101$EQUALS_LIT_ = makeSymbol( "EQUALS-LIT?" );
    $sym102$EVALUATE_LIT_ = makeSymbol( "EVALUATE-LIT?" );
    $sym103$AB_LIT_ = makeSymbol( "AB-LIT?" );
    $sym104$EL_MEETS_PRAGMATIC_REQUIREMENT_P = makeSymbol( "EL-MEETS-PRAGMATIC-REQUIREMENT-P" );
    $const105$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const106$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const107$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const108$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const109$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const110$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $const111$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const112$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $const113$resultGenl = constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) );
    $const114$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const115$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const116$holdsIn = constant_handles.reader_make_constant_shell( makeString( "holdsIn" ) );
    $const117$trueSentence = constant_handles.reader_make_constant_shell( makeString( "trueSentence" ) );
    $const118$forwardNonTriggerLiteral = constant_handles.reader_make_constant_shell( makeString( "forwardNonTriggerLiteral" ) );
    $const119$forwardTriggerLiteral = constant_handles.reader_make_constant_shell( makeString( "forwardTriggerLiteral" ) );
    $sym120$DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_ = makeSymbol( "DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?" );
    $const121$defaultForwardNonTriggerPredicate = constant_handles.reader_make_constant_shell( makeString( "defaultForwardNonTriggerPredicate" ) );
    $sym122$_DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE__CACHING_STATE_ = makeSymbol( "*DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?-CACHING-STATE*" );
    $sym123$CLEAR_DEFAULT_FORWARD_NON_TRIGGER_LITERAL_PREDICATE_ = makeSymbol( "CLEAR-DEFAULT-FORWARD-NON-TRIGGER-LITERAL-PREDICATE?" );
    $const124$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $sym125$CYCL_LITERAL_P = makeSymbol( "CYCL-LITERAL-P" );
    $const126$Kappa = constant_handles.reader_make_constant_shell( makeString( "Kappa" ) );
    $const127$Lambda = constant_handles.reader_make_constant_shell( makeString( "Lambda" ) );
    $sym128$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const129$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const130$microtheoryDesignationArgnum = constant_handles.reader_make_constant_shell( makeString( "microtheoryDesignationArgnum" ) );
    $const131$sentenceDesignationArgnum = constant_handles.reader_make_constant_shell( makeString( "sentenceDesignationArgnum" ) );
    $sym132$BIND_ALL_FREE_VARS = makeSymbol( "BIND-ALL-FREE-VARS" );
    $sym133$EL_RULE_FORMULA_P = makeSymbol( "EL-RULE-FORMULA-P" );
    $str134$Tried_to_recursively_determine_th = makeString( "Tried to recursively determine the functor of ~A, but it was not either a fort or an EL formula." );
    $sym135$VAR_SPEC_ = makeSymbol( "VAR-SPEC?" );
    $const136$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $const137$Function_Denotational = constant_handles.reader_make_constant_shell( makeString( "Function-Denotational" ) );
    $sym138$EXPAND_JOIN_LEFT = makeSymbol( "EXPAND-JOIN-LEFT" );
    $sym139$EXPAND_THERE_EXIST_VARS = makeSymbol( "EXPAND-THERE-EXIST-VARS" );
    $sym140$EXPAND_FOR_ALL_VARS = makeSymbol( "EXPAND-FOR-ALL-VARS" );
    $sym141$TRUE_SENTENCE_CASE_INSENSITIVE_EXPANSION = makeSymbol( "TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION" );
    $str142$termPhrases_CaseInsensitive = makeString( "termPhrases-CaseInsensitive" );
    $const143$termPhrases = constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) );
    $sym144$ALPHABETIC_STRING_ = makeSymbol( "ALPHABETIC-STRING?" );
    $const145$regexStringMatch = constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) );
    $str146$regexStringMatch_CaseInsensitive = makeString( "regexStringMatch-CaseInsensitive" );
    $const147$trueSentence_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "trueSentence-CaseInsensitive" ) );
    $sym148$GAF_ = makeSymbol( "GAF?" );
    $str149$_S_is_not_well_formed_ = makeString( "~S is not well formed." );
    $sym150$DOTTED_LIST_P = makeSymbol( "DOTTED-LIST-P" );
    $sym151$SCOPING_RELATION_EXPRESSION_ = makeSymbol( "SCOPING-RELATION-EXPRESSION?" );
    $sym152$FORMULA_WITH_SEQUENCE_NON_VAR_ = makeSymbol( "FORMULA-WITH-SEQUENCE-NON-VAR?" );
    $sym153$EL_IMPLICATION_P = makeSymbol( "EL-IMPLICATION-P" );
    $sym154$SCOPING_RELATION_P = makeSymbol( "SCOPING-RELATION-P" );
    $sym155$CYCL_QUOTED_TERM_P = makeSymbol( "CYCL-QUOTED-TERM-P" );
    $sym156$EXPAND_SUBL_FN_P = makeSymbol( "EXPAND-SUBL-FN-P" );
    $sym157$FAST_ESCAPE_QUOTE_TERM_P = makeSymbol( "FAST-ESCAPE-QUOTE-TERM-P" );
    $sym158$FORMULA_QUANTIFIED_VARS_INT = makeSymbol( "FORMULA-QUANTIFIED-VARS-INT" );
    $const159$CycLFormula = constant_handles.reader_make_constant_shell( makeString( "CycLFormula" ) );
    $const160$CycLSentence = constant_handles.reader_make_constant_shell( makeString( "CycLSentence" ) );
    $list161 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SkolemFunctionFn" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SkolemFuncNFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Lambda" ) ), constant_handles.reader_make_constant_shell( makeString(
          "Kappa" ) ), constant_handles.reader_make_constant_shell( makeString( "initialSublists" ) ), constant_handles.reader_make_constant_shell( makeString( "NestedDagFn" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SubDagFn" ) ), constant_handles.reader_make_constant_shell( makeString( "UnifyFn" ) ), constant_handles.reader_make_constant_shell( makeString( "DagFn" ) )
    } );
    $list162 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "initialSublists" ) ), constant_handles.reader_make_constant_shell( makeString( "accessSlotForType" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ksImportationTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "NestedDagFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "SubDagFn" ) ), constant_handles.reader_make_constant_shell( makeString( "UnifyFn" ) ) );
    $str163$You_re_calling_the_function___A__ = makeString( "You're calling the function '~A' which is going to be killed!" );
    $str164$__Replace_all_calls_to_it_with___ = makeString( "  Replace all calls to it with '~A' instead!" );
    $str165$__Notify__A_if_you_receive_this_w = makeString( "  Notify ~A if you receive this warning and do not know how to fix it." );
    $str166$continue_anyway = makeString( "continue anyway" );
    $sym167$EL_VARIABLE_ = makeSymbol( "EL-VARIABLE?" );
    $kw168$POS = makeKeyword( "POS" );
    $const169$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const170$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $sym171$EQUALS_EL_MEMOIZED_ = makeSymbol( "EQUALS-EL-MEMOIZED?" );
    $list172 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $list173 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $sym174$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $sym175$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $kw176$UNBOUND_SEQ = makeKeyword( "UNBOUND-SEQ" );
    $sym177$FORMULA_QUERY_SIGNATURE_TERM_P = makeSymbol( "FORMULA-QUERY-SIGNATURE-TERM-P" );
    $kw178$BOUND = makeKeyword( "BOUND" );
    $kw179$UNBOUND = makeKeyword( "UNBOUND" );
    $kw180$TERM = makeKeyword( "TERM" );
    $sym181$BOUND_ARG_POSITION_BETTER_FOR_INDEXING_ = makeSymbol( "BOUND-ARG-POSITION-BETTER-FOR-INDEXING<" );
    $list182 = ConsesLow.list( new SubLObject[] { ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, ZERO_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER
    } );
    $sym183$FORMULA_WITH_NESTED_VARIABLE_ = makeSymbol( "FORMULA-WITH-NESTED-VARIABLE?" );
    $kw184$TEST = makeKeyword( "TEST" );
    $kw185$OWNER = makeKeyword( "OWNER" );
    $kw186$CLASSES = makeKeyword( "CLASSES" );
    $kw187$KB = makeKeyword( "KB" );
    $kw188$TINY = makeKeyword( "TINY" );
    $kw189$WORKING_ = makeKeyword( "WORKING?" );
    $list190 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ),
        constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
            "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), constant_handles
                    .reader_make_constant_shell( makeString( "Thing" ) ) ) ), T ) );
    $sym191$SORTED_SENTENCE_FREE_VARIABLES = makeSymbol( "SORTED-SENTENCE-FREE-VARIABLES" );
    $list192 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
        .reader_make_constant_shell( makeString( "Thing" ) ) ) ), ConsesLow.list( makeSymbol( "?X" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "forAll" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forAll" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
                                    .reader_make_constant_shell( makeString( "Thing" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                            "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forAll" ) ), makeSymbol( "?X" ), ConsesLow
                                                    .list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                        makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                            makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list(
                                                                constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                    "Thing" ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ),
                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forAll" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles
                                                                            .reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ), ConsesLow.list( constant_handles
                                                                                    .reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                        "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                            makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ) ), NIL ), ConsesLow.list(
                                                                                                ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list(
                                                                                                    constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), makeSymbol( "?X" ) ), constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "EscapeQuote" ) ), makeSymbol( "?X" ) ) ), constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "Thing" ) ) ) ), ConsesLow.list( makeSymbol( "?X" ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EscapeQuote" ) ), makeSymbol(
              "?Y" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), ConsesLow.list( makeSymbol( "?Y" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "EscapeQuote" ) ), makeSymbol( "?Y" ) ), makeSymbol( "?Z" ) ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "Thing" ) ) ) ), ConsesLow.list( makeSymbol( "?Y" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ),
                                          makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), ConsesLow.list( makeSymbol( "?X" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                              .list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                  makeSymbol( "?X" ), makeSymbol( "?Y" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), ConsesLow.list( makeSymbol( "?X" ), makeSymbol(
                                                      "?Y" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equiv" ) ), ConsesLow.list( constant_handles
                                                          .reader_make_constant_shell( makeString( "forAll" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ),
                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                                                  makeString( "Thing" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles
                                                                      .reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                          makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ) ), NIL ), ConsesLow.list(
                                                                              ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?X" ), ConsesLow.list(
                                                                                  constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) ) ) ), ConsesLow.list(
                                                                                      makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "EvaluateSubLFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "SubLQuoteFn" ) ), makeSymbol( "?Z" ) ) ) ) ), ConsesLow.list( makeSymbol( "?X" ) ) ), ConsesLow.list(
                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol(
                                                                                                          "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EvaluateSubLFn" ) ), ConsesLow
                                                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) ), ConsesLow.list(
                                                                                                                  makeSymbol( "?Z" ) ), makeSymbol( "?Z" ) ) ) ) ), ConsesLow.list( makeSymbol( "?X" ), makeSymbol(
                                                                                                                      "?Z" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?X" ), ConsesLow.list(
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "EvaluateSubLFn" ) ), ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) ), ConsesLow
                                                                                                                                      .list( makeSymbol( "?Z" ) ), ConsesLow.list( constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "PlusFn" ) ), makeSymbol( "?Y" ),
                                                                                                                                          makeSymbol( "?Z" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "?X" ), makeSymbol(
                                                                                                                                              "?Z" ) ) )
    } );
    $sym193$SORTED_CONDITIONAL_SENTENCE_FREE_VARIABLES = makeSymbol( "SORTED-CONDITIONAL-SENTENCE-FREE-VARIABLES" );
    $list194 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
            makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?WHAT" ) ) ) ), ConsesLow.list( makeSymbol( "?WHAT" ) ) ), ConsesLow.list( ConsesLow
                    .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                        constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                            .reader_make_constant_shell( makeString( "CycAdministrator" ) ), constant_handles.reader_make_constant_shell( makeString( "Cyclist" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
                                .list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                        makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow
                                            .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeSymbol(
                                                "?Y" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString(
                                                    "Thing" ) ) ) ), makeSymbol( "?X" ) ) ) ), ConsesLow.list( makeSymbol( "?X" ) ) ) );
    $sym195$STRING_TO_EL_VAR_NAME = makeSymbol( "STRING-TO-EL-VAR-NAME" );
    $list196 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( " xaksj glk-5.e9-- - ijg0" ) ), makeString( "XAKSJ-GLK-5E9-IJG0" ) ) );
    $sym197$OPTIMIZE_EL_FORMULA_VARIABLE_NAMES = makeSymbol( "OPTIMIZE-EL-FORMULA-VARIABLE-NAMES" );
    $sym198$OPTIMIZED_EL_FORMULA_MATCHES_PATTERN = makeSymbol( "OPTIMIZED-EL-FORMULA-MATCHES-PATTERN" );
    $kw199$FULL = makeKeyword( "FULL" );
    $list200 = _constant_200_initializer();
  }

  public static final class $el_negation_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_negation_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-NEGATION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_negation_p( arg1 );
    }
  }

  public static final class $el_disjunction_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_disjunction_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-DISJUNCTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_disjunction_p( arg1 );
    }
  }

  public static final class $el_conjunction_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_conjunction_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-CONJUNCTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_conjunction_p( arg1 );
    }
  }

  public static final class $cyc_const_general_existential_operator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cyc_const_general_existential_operator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cyc_const_general_existential_operator_p( arg1 );
    }
  }

  public static final class $expand_subl_fn_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $expand_subl_fn_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EXPAND-SUBL-FN-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return expand_subl_fn_p( arg1 );
    }
  }

  public static final class $el_meets_pragmatic_requirement_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_meets_pragmatic_requirement_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-MEETS-PRAGMATIC-REQUIREMENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_meets_pragmatic_requirement_p( arg1 );
    }
  }

  public static final class $el_implicit_meta_literal_sentence_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_implicit_meta_literal_sentence_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-IMPLICIT-META-LITERAL-SENTENCE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_implicit_meta_literal_sentence_p( arg1 );
    }
  }

  public static final class $el_formula_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_formula_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-FORMULA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_formula_p( arg1 );
    }
  }

  public static final class $formula_with_sequence_termP$UnaryFunction
      extends
        UnaryFunction
  {
    public $formula_with_sequence_termP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORMULA-WITH-SEQUENCE-TERM?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return formula_with_sequence_termP( arg1 );
    }
  }

  public static final class $forward_non_trigger_literal_litP$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_non_trigger_literal_litP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-NON-TRIGGER-LITERAL-LIT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_non_trigger_literal_litP( arg1 );
    }
  }

  public static final class $kappa_predicate_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $kappa_predicate_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KAPPA-PREDICATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return kappa_predicate_p( arg1 );
    }
  }

  public static final class $gafP$UnaryFunction
      extends
        UnaryFunction
  {
    public $gafP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GAF?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gafP( arg1 );
    }
  }

  public static final class $scoping_relation_expressionP$UnaryFunction
      extends
        UnaryFunction
  {
    public $scoping_relation_expressionP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SCOPING-RELATION-EXPRESSION?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return scoping_relation_expressionP( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2696 ms
 * 
 */