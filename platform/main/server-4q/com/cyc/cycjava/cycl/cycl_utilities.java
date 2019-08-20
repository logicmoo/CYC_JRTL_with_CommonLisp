/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.assertions_high.assertion_cons;
import static com.cyc.cycjava.cycl.assertions_high.assertion_formula;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_binary_logical_ops$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_bounded_existentials$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_exception_operators$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_pragmatic_requirement_operators$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_quaternary_logical_ops$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_quintary_logical_ops$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_regular_quantifiers$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_ternary_logical_ops$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_unary_logical_ops$;
import static com.cyc.cycjava.cycl.el_utilities.$cyc_const_variable_arity_logical_ops$;
import static com.cyc.cycjava.cycl.el_utilities.arg_types_of_expression_prescribe_unreifiedP;
import static com.cyc.cycjava.cycl.el_utilities.arg_types_prescribe_unreifiedP;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.binding_lists_to_expression;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_logical_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quantifier_p;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_bounded_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_exception_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formulaP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_arityGE;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_any_of_operators_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.elf_to_list;
import static com.cyc.cycjava.cycl.el_utilities.expand_subl_fn_p;
import static com.cyc.cycjava.cycl.el_utilities.expression_to_binding_lists;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityL;
import static com.cyc.cycjava.cycl.el_utilities.formula_length;
import static com.cyc.cycjava.cycl.el_utilities.formula_with_sequence_termP;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_nat_formula;
import static com.cyc.cycjava.cycl.el_utilities.mt_designating_literalP;
import static com.cyc.cycjava.cycl.el_utilities.nreplace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.possibly_atomic_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_nat_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.sefify;
import static com.cyc.cycjava.cycl.el_utilities.sequence_term;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_p;
import static com.cyc.cycjava.cycl.el_utilities.subl_quote_p;
import static com.cyc.cycjava.cycl.el_utilities.tou_asentP;
import static com.cyc.cycjava.cycl.el_utilities.tou_litP;
import static com.cyc.cycjava.cycl.fi.assertion_fi_formula;
import static com.cyc.cycjava.cycl.fi.assertion_hl_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.narts_high.find_nart;
import static com.cyc.cycjava.cycl.narts_high.nart_hl_formula;
import static com.cyc.cycjava.cycl.narts_high.nart_substitute;
import static com.cyc.cycjava.cycl.term.closed_nautP;
import static com.cyc.cycjava.cycl.term.ground_nautP;
import static com.cyc.cycjava.cycl.term.nautP;
import static com.cyc.cycjava.cycl.term.sentenceP;
import static com.cyc.cycjava.cycl.term.unreified_skolem_termP;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYCL-UTILITIES
 * source file: /cyc/top/cycl/cycl-utilities.lisp
 * created:     2019/07/03 17:37:22
 */
public final class cycl_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_cycl_formula_arg_fns_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_FORMULA_ARG_FNS, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cycl_formula_arg_fns_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_cycl_formula_arg_fns_p_queue(SubLObject cycl_formula_arg_fns, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_formula_arg_fns, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_cycl_formula_arg_fns_p_queue(SubLObject cycl_formula_arg_fns) {
        return classes.subloop_get_access_protected_instance_slot(cycl_formula_arg_fns, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject cycl_formula_arg_fns_p(SubLObject cycl_formula_arg_fns) {
        return classes.subloop_instanceof_class(cycl_formula_arg_fns, CYCL_FORMULA_ARG_FNS);
    }

    public static final SubLFile me = new cycl_utilities();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $expression_count_item$ = makeSymbol("*EXPRESSION-COUNT-ITEM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $expression_count_test$ = makeSymbol("*EXPRESSION-COUNT-TEST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $containing_subexpressions_lambda_term$ = makeSymbol("*CONTAINING-SUBEXPRESSIONS-LAMBDA-TERM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_transformation_limit$ = makeSymbol("*DEFAULT-TRANSFORMATION-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $renamed_default_el_var_prefix$ = makeSymbol("*RENAMED-DEFAULT-EL-VAR-PREFIX*");

    // deflexical
    /**
     * Cyc constants that have no indexing maintained for them. All other constants
     * except instances of #$ELRelation are indexed (4/3/00)
     */
    @LispMethod(comment = "Cyc constants that have no indexing maintained for them. All other constants\r\nexcept instances of #$ELRelation are indexed (4/3/00)\ndeflexical\nCyc constants that have no indexing maintained for them. All other constants\nexcept instances of #$ELRelation are indexed (4/3/00)")
    private static final SubLSymbol $non_indexed_constants$ = makeSymbol("*NON-INDEXED-CONSTANTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$DEFAULT_OPAQUE_ARG_ = makeSymbol("DEFAULT-OPAQUE-ARG?");

    static private final SubLSymbol $sym1$DEFAULT_OPAQUE_SEQVAR_ = makeSymbol("DEFAULT-OPAQUE-SEQVAR?");

    static private final SubLList $list2 = list(makeSymbol("FUNC"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $opaque_arg_function$ = makeSymbol("*OPAQUE-ARG-FUNCTION*");

    public static final SubLSymbol $opaque_seqvar_function$ = makeSymbol("*OPAQUE-SEQVAR-FUNCTION*");

    static private final SubLSymbol $sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");





    private static final SubLSymbol HL_TERM_WITH_EL_COUNTERPART_P = makeSymbol("HL-TERM-WITH-EL-COUNTERPART-P");

    private static final SubLSymbol $TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");

    private static final SubLSymbol HL_TERM_TO_EL_TERM = makeSymbol("HL-TERM-TO-EL-TERM");

    private static final SubLString $str12$Recursion_limit_reached___el_to_h = makeString("Recursion limit reached: (el-to-hl ~S)");

    private static final SubLSymbol CAREFUL_HL_TERM_TO_EL_TERM = makeSymbol("CAREFUL-HL-TERM-TO-EL-TERM");

    private static final SubLSymbol RF_P = makeSymbol("RF-P");

    private static final SubLSymbol EXPRESSION_COUNT_HELPER = makeSymbol("EXPRESSION-COUNT-HELPER");

    private static final SubLString $str25$_S_is_not_well_formed_ = makeString("~S is not well formed.");

    private static final SubLSymbol CONTAINING_SUBEXPRESSIONS_LAMBDA_FN = makeSymbol("CONTAINING-SUBEXPRESSIONS-LAMBDA-FN");

    private static final SubLSymbol EXPRESSION_FIND_IF = makeSymbol("EXPRESSION-FIND-IF");

    private static final SubLInteger $int$212 = makeInteger(212);





    private static final SubLSymbol EXPRESSION_SUBST = makeSymbol("EXPRESSION-SUBST");

    private static final SubLSymbol FORMULA_SUBST = makeSymbol("FORMULA-SUBST");

    private static final SubLSymbol $sym35$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol $sym36$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol PERMUTE_LIST_CACHED = makeSymbol("PERMUTE-LIST-CACHED");

    private static final SubLSymbol $permute_list_cached_caching_state$ = makeSymbol("*PERMUTE-LIST-CACHED-CACHING-STATE*");

    private static final SubLList $list39 = list(NIL);

    private static final SubLList $list40 = list(makeSymbol("FRONT1"), makeSymbol("REST1"));

    private static final SubLList $list41 = list(makeSymbol("FRONT2"), makeSymbol("REST2"));

    private static final SubLSymbol $sym42$DEFAULT_EL_VAR_ = makeSymbol("DEFAULT-EL-VAR?");

    private static final SubLSymbol RENAMED_DEFAULT_EL_VAR_P = makeSymbol("RENAMED-DEFAULT-EL-VAR-P");

    private static final SubLString $str44$_RENAMED_VAR = makeString("?RENAMED-VAR");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");









    private static final SubLSymbol $sym51$COLLECTION_INTERSECTION_NAT_ = makeSymbol("COLLECTION-INTERSECTION-NAT?");

    private static final SubLSymbol $sym52$COLLECTION_UNION_NAT_ = makeSymbol("COLLECTION-UNION-NAT?");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLSymbol $sym54$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str55$ = makeString("");

    private static final SubLString $str56$__ = makeString("#$");

    private static final SubLList $list57 = list(cons(makeString("("), makeString("")), cons(makeString(")"), makeString("")));

    private static final SubLSymbol $sym58$CONSTANT_EXTERNAL_ID__ = makeSymbol("CONSTANT-EXTERNAL-ID-<");

    private static final SubLSymbol CONSTANT_EXTERNAL_ID = makeSymbol("CONSTANT-EXTERNAL-ID");

    private static final SubLSymbol $sym60$GUID_ = makeSymbol("GUID<");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol $sym62$_ = makeSymbol("<");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLSymbol FORT_INTERNAL_ID = makeSymbol("FORT-INTERNAL-ID");

    private static final SubLSymbol $sym65$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");





    private static final SubLSymbol FUNCTIONAL_IN_ARG_POSITIONS = makeSymbol("FUNCTIONAL-IN-ARG-POSITIONS");

    private static final SubLSymbol STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS = makeSymbol("STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS");

    private static final SubLSymbol $sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_ = makeSymbol("OPAQUE-ARG-WRT-NAT-REIFICATION?");

    private static final SubLSymbol NART_LOOKUP = makeSymbol("NART-LOOKUP");

    private static final SubLSymbol EL_FIND_IF_NART = makeSymbol("EL-FIND-IF-NART");





    private static final SubLSymbol $sym79$NEGATED_ = makeSymbol("NEGATED?");

    private static final SubLList $list80 = list(makeSymbol("OBJECT"));

    private static final SubLString $str81$Return_T_iff_OBJECT_is_a_negated_ = makeString("Return T iff OBJECT is a negated EL formula.");

    private static final SubLList $list82 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol POSSIBLY_SENTENCE_OR_VARIABLE_P = makeSymbol("POSSIBLY-SENTENCE-OR-VARIABLE-P");

    private static final SubLSymbol NEGATE = makeSymbol("NEGATE");

    private static final SubLList $list85 = list(makeSymbol("FORM"));

    private static final SubLString $str86$Assuming_FORM_is_a_valid_CycL_for = makeString("Assuming FORM is a valid CycL formula, return a negated version of it.");

    private static final SubLList $list87 = list(list(makeSymbol("FORM"), makeSymbol("POSSIBLY-SENTENCE-OR-VARIABLE-P")));

    private static final SubLList $list88 = list(makeSymbol("EL-FORMULA-P"));

    static private final SubLList $list92 = list(makeSymbol("INLINE"), makeSymbol("FORMULA-OPERATOR"));

    private static final SubLList $list94 = list(makeSymbol("INLINE"), makeSymbol("EL-FORMULA-OPERATOR"));

    private static final SubLString $str97$formula_terms_int_got_a_non_el_va = makeString("formula-terms-int got a non-el-variable or cons: ~A~%");

    private static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");

    private static final SubLList $list99 = list(makeSymbol("INLINE"), makeSymbol("NAT-FUNCTION"));

    private static final SubLList $list100 = list(makeSymbol("INLINE"), makeSymbol("NAT-FUNCTOR"));

    private static final SubLList $list101 = list(makeSymbol("INLINE"), makeSymbol("NAUT-FUNCTOR"));

    private static final SubLList $list102 = list(makeSymbol("INLINE"), makeSymbol("SENTENCE-TRUTH-FUNCTION"));

    private static final SubLList $list103 = list(makeSymbol("INLINE"), makeSymbol("SENTENCE-ARG0"));

    private static final SubLList $list104 = list(makeSymbol("INLINE"), makeSymbol("ATOMIC-SENTENCE-PREDICATE"));

    private static final SubLList $list105 = list(makeSymbol("INLINE"), makeSymbol("ATOMIC-SENTENCE-ARG0"));



    private static final SubLSymbol ARG_POSITION_P = makeSymbol("ARG-POSITION-P");

    private static final SubLSymbol CYCL_ARG_POSITION_P = makeSymbol("CYCL-ARG-POSITION-P");

    private static final SubLString $str111$CycL_Utilities_Module_Supercatego = makeString("CycL-Utilities Module Supercategory");

    private static final SubLString $$$CycL_Utilities_Subcategory = makeString("CycL Utilities Subcategory");

    private static final SubLString $$$CycL_Utilities_Testing_Suite = makeString("CycL Utilities Testing Suite");

    /**
     *
     *
     * @unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,
    or infinite recursion will result!
     */
    @LispMethod(comment = "@unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,\r\nor infinite recursion will result!")
    public static final SubLObject with_opaque_arg_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject func = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            func = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($opaque_arg_function$, func)), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,
    or infinite recursion will result!
     */
    @LispMethod(comment = "@unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,\r\nor infinite recursion will result!")
    public static SubLObject with_opaque_arg_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject func = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        func = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($opaque_arg_function$, func)), append(body, NIL));
    }

    /**
     *
     *
     * @unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,
    or infinite recursion will result!
     */
    @LispMethod(comment = "@unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,\r\nor infinite recursion will result!")
    public static final SubLObject with_opaque_seqvar_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject func = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            func = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($opaque_seqvar_function$, func)), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,
    or infinite recursion will result!
     */
    @LispMethod(comment = "@unknown WARNING!!!  Do not pass in a FUNC which transitively calls @xref opaque-arg?,\r\nor infinite recursion will result!")
    public static SubLObject with_opaque_seqvar_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject func = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        func = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($opaque_seqvar_function$, func)), append(body, NIL));
    }

    public static SubLObject maybe_some_opaque_argP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((($opaque_arg_function$.getDynamicValue(thread) != $sym0$DEFAULT_OPAQUE_ARG_) || (NIL != subl_escape_p(expression))) || (NIL != formula_with_sequence_termP(expression)));
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA is opaque in the argument position ARGNUM,
    meaning that it should not be recursed into in that arg position.
    By convention, if ARGNUM is greater than the arity of FORMULA,
    this denotes the sequence variable in FORMULA.
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA is opaque in the argument position ARGNUM,\r\nmeaning that it should not be recursed into in that arg position.\r\nBy convention, if ARGNUM is greater than the arity of FORMULA,\r\nthis denotes the sequence variable in FORMULA.")
    public static final SubLObject opaque_argP_alt(SubLObject formula, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.cycl_utilities.opaque_argP_int(formula, argnum, $opaque_arg_function$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA is opaque in the argument position ARGNUM,
    meaning that it should not be recursed into in that arg position.
    By convention, if ARGNUM is greater than the arity of FORMULA,
    this denotes the sequence variable in FORMULA.
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA is opaque in the argument position ARGNUM,\r\nmeaning that it should not be recursed into in that arg position.\r\nBy convention, if ARGNUM is greater than the arity of FORMULA,\r\nthis denotes the sequence variable in FORMULA.")
    public static SubLObject opaque_argP(final SubLObject formula, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return opaque_argP_int(formula, argnum, $opaque_arg_function$.getDynamicValue(thread));
    }

    public static final SubLObject opaque_argP_int_alt(SubLObject formula, SubLObject argnum, SubLObject opaque_arg_function) {
        {
            SubLObject result = NIL;
            SubLObject pcase_var = opaque_arg_function;
            if (pcase_var.eql($sym0$DEFAULT_OPAQUE_ARG_)) {
                result = com.cyc.cycjava.cycl.cycl_utilities.default_opaque_argP(formula, argnum);
            } else {
                if (pcase_var.eql($sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_)) {
                    result = com.cyc.cycjava.cycl.cycl_utilities.opaque_arg_wrt_el_templateP(formula, argnum);
                } else {
                    result = funcall(opaque_arg_function, formula, argnum);
                }
            }
            return result;
        }
    }

    public static SubLObject opaque_argP_int(final SubLObject formula, final SubLObject argnum, final SubLObject opaque_arg_function) {
        SubLObject result = NIL;
        if (opaque_arg_function.eql($sym0$DEFAULT_OPAQUE_ARG_)) {
            result = default_opaque_argP(formula, argnum);
        } else
            if (opaque_arg_function.eql($sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_)) {
                result = opaque_arg_wrt_el_templateP(formula, argnum);
            } else {
                result = funcall(opaque_arg_function, formula, argnum);
            }

        return result;
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA contains an opaque sequence variable,
    which should not be considered a proper part of the formula.
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA contains an opaque sequence variable,\r\nwhich should not be considered a proper part of the formula.")
    public static final SubLObject opaque_seqvarP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return funcall($opaque_seqvar_function$.getDynamicValue(thread), formula);
        }
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA contains an opaque sequence variable,
    which should not be considered a proper part of the formula.
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA contains an opaque sequence variable,\r\nwhich should not be considered a proper part of the formula.")
    public static SubLObject opaque_seqvarP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return funcall($opaque_seqvar_function$.getDynamicValue(thread), formula);
    }

    public static final SubLObject default_opaque_argP_alt(SubLObject formula, SubLObject argnum) {
        if (NIL != formula_arityL(formula, argnum, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(formula);
        }
        return subl_escape_p(formula);
    }

    public static SubLObject default_opaque_argP(final SubLObject formula, final SubLObject argnum) {
        if (NIL != formula_arityL(formula, argnum, UNPROVIDED)) {
            return opaque_seqvarP(formula);
        }
        return subl_escape_p(formula);
    }

    public static final SubLObject opaque_arg_wrt_free_varsP_alt(SubLObject formula, SubLObject argnum) {
        if (TWO_INTEGER.eql(argnum) && (NIL != el_formula_with_operator_p(formula, $$SkolemFunctionFn))) {
            return T;
        } else {
            if (NIL != formula_arityL(formula, argnum, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(formula);
            } else {
                return subl_quote_p(formula);
            }
        }
    }

    public static SubLObject opaque_arg_wrt_free_varsP(final SubLObject formula, final SubLObject argnum) {
        if (TWO_INTEGER.eql(argnum) && (NIL != el_formula_with_operator_p(formula, $$SkolemFunctionFn))) {
            return T;
        }
        if (NIL != formula_arityL(formula, argnum, UNPROVIDED)) {
            return opaque_seqvarP(formula);
        }
        return subl_quote_p(formula);
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is opaque by the
    default criteria, or an EL formula template.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is opaque by the\r\ndefault criteria, or an EL formula template.")
    public static final SubLObject opaque_arg_wrt_el_templateP_alt(SubLObject formula, SubLObject argnum) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_utilities.default_opaque_argP(formula, argnum)) || (NIL != czer_utilities.leave_some_terms_at_el_for_argP(com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(formula), argnum, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is opaque by the
    default criteria, or an EL formula template.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is opaque by the\r\ndefault criteria, or an EL formula template.")
    public static SubLObject opaque_arg_wrt_el_templateP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != default_opaque_argP(formula, argnum)) || (NIL != czer_utilities.leave_some_terms_at_el_for_argP(formula_arg0(formula), argnum, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.")
    public static final SubLObject opaque_arg_wrt_quotingP_alt(SubLObject formula, SubLObject argnum) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_utilities.default_opaque_argP(formula, argnum)) || ((NIL == tou_litP(formula)) && ((NIL != cycl_grammar.fast_quote_term_p(com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, argnum, UNPROVIDED))) || (NIL != kb_accessors.quoted_argumentP(com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(formula), argnum)))));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.")
    public static SubLObject opaque_arg_wrt_quotingP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != default_opaque_argP(formula, argnum)) || ((NIL == tou_litP(formula)) && ((NIL != cycl_grammar.fast_quote_term_p(formula_arg(formula, argnum, UNPROVIDED))) || (NIL != kb_accessors.quoted_argumentP(formula_arg0(formula), argnum)))));
    }

    /**
     * Like @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.
     * This is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence.
     */
    @LispMethod(comment = "Like @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.\r\nThis is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence.\nLike @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.\nThis is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence.")
    public static final SubLObject opaque_arg_wrt_quoting_not_counting_logical_opsP_alt(SubLObject formula, SubLObject argnum) {
        if (((NIL != el_formula_with_operator_p(formula, $$trueSentence)) || (NIL != cyc_const_logical_operator_p(com.cyc.cycjava.cycl.cycl_utilities.formula_operator(formula)))) || (NIL != cyc_const_quantifier_p(com.cyc.cycjava.cycl.cycl_utilities.formula_operator(formula)))) {
            return NIL;
        } else {
            return com.cyc.cycjava.cycl.cycl_utilities.opaque_arg_wrt_quotingP(formula, argnum);
        }
    }

    /**
     * Like @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.
     * This is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence.
     */
    @LispMethod(comment = "Like @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.\r\nThis is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence.\nLike @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.\nThis is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence.")
    public static SubLObject opaque_arg_wrt_quoting_not_counting_logical_opsP(final SubLObject formula, final SubLObject argnum) {
        if (((NIL != el_formula_with_operator_p(formula, $$trueSentence)) || (NIL != cyc_const_logical_operator_p(formula_operator(formula)))) || (NIL != cyc_const_quantifier_p(formula_operator(formula)))) {
            return NIL;
        }
        return opaque_arg_wrt_quotingP(formula, argnum);
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is explicitly quoted via #$Quote.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is explicitly quoted via #$Quote.")
    public static final SubLObject opaque_arg_wrt_quoteP_alt(SubLObject formula, SubLObject argnum) {
        return cycl_grammar.fast_quote_term_p(com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, argnum, UNPROVIDED));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is explicitly quoted via #$Quote.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is explicitly quoted via #$Quote.")
    public static SubLObject opaque_arg_wrt_quoteP(final SubLObject formula, final SubLObject argnum) {
        return cycl_grammar.fast_quote_term_p(formula_arg(formula, argnum, UNPROVIDED));
    }

    public static SubLObject opaque_arg_wrt_el_template_or_quoteP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != opaque_arg_wrt_el_templateP(formula, argnum)) || (NIL != opaque_arg_wrt_quoteP(formula, argnum)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.")
    public static final SubLObject opaque_arg_wrt_skolemP_alt(SubLObject formula, SubLObject argnum) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_utilities.default_opaque_argP(formula, argnum)) || (NIL != tou_asentP(formula)));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque.")
    public static SubLObject opaque_arg_wrt_skolemP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != default_opaque_argP(formula, argnum)) || (NIL != tou_asentP(formula)));
    }

    public static final SubLObject default_opaque_seqvarP_alt(SubLObject formula) {
        return subl_escape_p(formula);
    }

    public static SubLObject default_opaque_seqvarP(final SubLObject formula) {
        return subl_escape_p(formula);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an HL term with an EL counterpart.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an HL term with an EL counterpart.")
    public static final SubLObject hl_term_with_el_counterpart_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != nart_handles.valid_nart_handleP(v_object)) || (NIL != assertion_handles.valid_assertion_handleP(v_object))) || (NIL != variables.variable_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an HL term with an EL counterpart.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an HL term with an EL counterpart.")
    public static SubLObject hl_term_with_el_counterpart_p(final SubLObject v_object) {
        return makeBoolean(((NIL != nart_handles.valid_nart_handleP(v_object)) || (NIL != assertion_handles.valid_assertion_handleP(v_object))) || (NIL != variables.variable_p(v_object)));
    }

    /**
     * converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.
     * Not robust against invalid narts or assertions.
     */
    @LispMethod(comment = "converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\r\nNot robust against invalid narts or assertions.\nconverts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\nNot robust against invalid narts or assertions.")
    public static final SubLObject hl_term_to_el_term_alt(SubLObject hl_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nart_handles.nart_p(hl_term)) {
                return copy_expression(funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term));
            } else {
                if (NIL != assertion_handles.assertion_p(hl_term)) {
                    return copy_expression(funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term));
                } else {
                    if (NIL != variables.variable_p(hl_term)) {
                        return variables.default_el_var_for_hl_var(hl_term);
                    } else {
                        return hl_term;
                    }
                }
            }
        }
    }

    /**
     * converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.
     * Not robust against invalid narts or assertions.
     */
    @LispMethod(comment = "converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\r\nNot robust against invalid narts or assertions.\nconverts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\nNot robust against invalid narts or assertions.")
    public static SubLObject hl_term_to_el_term(final SubLObject hl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(hl_term)) {
            return copy_expression(funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term));
        }
        if (NIL != assertion_handles.assertion_p(hl_term)) {
            return copy_expression(funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term));
        }
        if (NIL != variables.variable_p(hl_term)) {
            return variables.default_el_var_for_hl_var(hl_term);
        }
        return hl_term;
    }

    /**
     * converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.
     * Not robust against invalid narts or assertions.
     *
     * @unknown Careful: the result is not destructible!
     */
    @LispMethod(comment = "converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\r\nNot robust against invalid narts or assertions.\r\n\r\n@unknown Careful: the result is not destructible!\nconverts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\nNot robust against invalid narts or assertions.")
    public static final SubLObject careful_hl_term_to_el_term_alt(SubLObject hl_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != nart_handles.nart_p(hl_term)) {
                return funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term);
            } else {
                if (NIL != assertion_handles.assertion_p(hl_term)) {
                    return funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term);
                } else {
                    if (NIL != variables.variable_p(hl_term)) {
                        return variables.default_el_var_for_hl_var(hl_term);
                    } else {
                        return hl_term;
                    }
                }
            }
        }
    }

    /**
     * converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.
     * Not robust against invalid narts or assertions.
     *
     * @unknown Careful: the result is not destructible!
     */
    @LispMethod(comment = "converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\r\nNot robust against invalid narts or assertions.\r\n\r\n@unknown Careful: the result is not destructible!\nconverts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.\nNot robust against invalid narts or assertions.")
    public static SubLObject careful_hl_term_to_el_term(final SubLObject hl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(hl_term)) {
            return funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term);
        }
        if (NIL != assertion_handles.assertion_p(hl_term)) {
            return funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term);
        }
        if (NIL != variables.variable_p(hl_term)) {
            return variables.default_el_var_for_hl_var(hl_term);
        }
        return hl_term;
    }

    /**
     * converts HL-TERM and all subterms to EL terms if HL-TERM has an EL counterpart,
     * or contains subterms with EL counterparts.  otherwise leaves HL-TERM unchanged,
     * except possibly for variable renaming.
     */
    @LispMethod(comment = "converts HL-TERM and all subterms to EL terms if HL-TERM has an EL counterpart,\r\nor contains subterms with EL counterparts.  otherwise leaves HL-TERM unchanged,\r\nexcept possibly for variable renaming.\nconverts HL-TERM and all subterms to EL terms if HL-TERM has an EL counterpart,\nor contains subterms with EL counterparts.  otherwise leaves HL-TERM unchanged,\nexcept possibly for variable renaming.")
    public static final SubLObject hl_to_el_alt(SubLObject hl_expression) {
        if (NIL == com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, NIL, UNPROVIDED)) {
            return hl_expression;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.unrename_default_el_vars(com.cyc.cycjava.cycl.cycl_utilities.expression_transform(com.cyc.cycjava.cycl.cycl_utilities.rename_default_el_vars(hl_expression), symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), symbol_function(HL_TERM_TO_EL_TERM), T, UNPROVIDED));
    }

    /**
     * converts HL-TERM and all subterms to EL terms if HL-TERM has an EL counterpart,
     * or contains subterms with EL counterparts.  otherwise leaves HL-TERM unchanged,
     * except possibly for variable renaming.
     */
    @LispMethod(comment = "converts HL-TERM and all subterms to EL terms if HL-TERM has an EL counterpart,\r\nor contains subterms with EL counterparts.  otherwise leaves HL-TERM unchanged,\r\nexcept possibly for variable renaming.\nconverts HL-TERM and all subterms to EL terms if HL-TERM has an EL counterpart,\nor contains subterms with EL counterparts.  otherwise leaves HL-TERM unchanged,\nexcept possibly for variable renaming.")
    public static SubLObject hl_to_el(final SubLObject hl_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == expression_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, NIL, UNPROVIDED)) {
            return hl_expression;
        }
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($TRANSFORMATION_LIMIT_EXCEEDED);
            result = unrename_default_el_vars(expression_transform(rename_default_el_vars(hl_expression), symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), symbol_function(HL_TERM_TO_EL_TERM), T, UNPROVIDED));
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $TRANSFORMATION_LIMIT_EXCEEDED);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.warn($str12$Recursion_limit_reached___el_to_h, sefify(hl_expression));
            result = hl_expression;
        }
        return result;
    }

    /**
     * A destructive version of @xref hl-to-el.
     */
    @LispMethod(comment = "A destructive version of @xref hl-to-el.")
    public static final SubLObject hl_to_el_destructive_alt(SubLObject hl_expression) {
        if (NIL == com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, NIL, UNPROVIDED)) {
            return hl_expression;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.unrename_default_el_vars_destructive(com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform(com.cyc.cycjava.cycl.cycl_utilities.rename_default_el_vars_destructive(hl_expression), symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), symbol_function(CAREFUL_HL_TERM_TO_EL_TERM), T, UNPROVIDED));
    }

    /**
     * A destructive version of @xref hl-to-el.
     */
    @LispMethod(comment = "A destructive version of @xref hl-to-el.")
    public static SubLObject hl_to_el_destructive(final SubLObject hl_expression) {
        if (NIL == expression_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, NIL, UNPROVIDED)) {
            return hl_expression;
        }
        return unrename_default_el_vars_destructive(expression_ntransform(rename_default_el_vars_destructive(hl_expression), symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), symbol_function(CAREFUL_HL_TERM_TO_EL_TERM), T, UNPROVIDED));
    }

    public static SubLObject hl_to_el_preserve_el_vars(final SubLObject hl_expression) {
        if (NIL == expression_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, NIL, UNPROVIDED)) {
            return hl_expression;
        }
        return expression_transform(hl_expression, symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), symbol_function(HL_TERM_TO_EL_TERM), T, UNPROVIDED);
    }

    /**
     * A version of @xref hl-to-el that works on binding lists.
     * hl-to-el won't work on binding lists because it expects a CycL expression.
     */
    @LispMethod(comment = "A version of @xref hl-to-el that works on binding lists.\r\nhl-to-el won\'t work on binding lists because it expects a CycL expression.\nA version of @xref hl-to-el that works on binding lists.\nhl-to-el won\'t work on binding lists because it expects a CycL expression.")
    public static final SubLObject binding_lists_hl_to_el_alt(SubLObject binding_lists) {
        if (NIL == list_utilities.tree_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), binding_lists, UNPROVIDED)) {
            return binding_lists;
        }
        return expression_to_binding_lists(com.cyc.cycjava.cycl.cycl_utilities.hl_to_el(binding_lists_to_expression(binding_lists)));
    }

    /**
     * A version of @xref hl-to-el that works on binding lists.
     * hl-to-el won't work on binding lists because it expects a CycL expression.
     */
    @LispMethod(comment = "A version of @xref hl-to-el that works on binding lists.\r\nhl-to-el won\'t work on binding lists because it expects a CycL expression.\nA version of @xref hl-to-el that works on binding lists.\nhl-to-el won\'t work on binding lists because it expects a CycL expression.")
    public static SubLObject binding_lists_hl_to_el(final SubLObject binding_lists) {
        if (NIL == list_utilities.tree_find_if(symbol_function(HL_TERM_WITH_EL_COUNTERPART_P), binding_lists, UNPROVIDED)) {
            return binding_lists;
        }
        return expression_to_binding_lists(hl_to_el_preserve_el_vars(binding_lists_to_expression(binding_lists)));
    }

    /**
     * Return a copy of FORM in which all HL objects are converted
     * to their EL counterparts (accepting the possible loss of information
     * such as identity).
     */
    @LispMethod(comment = "Return a copy of FORM in which all HL objects are converted\r\nto their EL counterparts (accepting the possible loss of information\r\nsuch as identity).\nReturn a copy of FORM in which all HL objects are converted\nto their EL counterparts (accepting the possible loss of information\nsuch as identity).")
    public static final SubLObject transform_hl_to_el_alt(SubLObject form) {
        if (NIL != constant_p(form)) {
            return form;
        } else {
            if (form.isString()) {
                return form;
            } else {
                if (form.isNumber()) {
                    return form;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(form)) {
                        return com.cyc.cycjava.cycl.cycl_utilities.hl_to_el(form);
                    } else {
                        if (form.isCons()) {
                            return list_utilities.recons(com.cyc.cycjava.cycl.cycl_utilities.transform_hl_to_el(form.first()), com.cyc.cycjava.cycl.cycl_utilities.transform_hl_to_el(form.rest()), form);
                        } else {
                            return form;
                        }
                    }
                }
            }
        }
    }

    /**
     * Return a copy of FORM in which all HL objects are converted
     * to their EL counterparts (accepting the possible loss of information
     * such as identity).
     */
    @LispMethod(comment = "Return a copy of FORM in which all HL objects are converted\r\nto their EL counterparts (accepting the possible loss of information\r\nsuch as identity).\nReturn a copy of FORM in which all HL objects are converted\nto their EL counterparts (accepting the possible loss of information\nsuch as identity).")
    public static SubLObject transform_hl_to_el(final SubLObject form) {
        if (NIL != constant_p(form)) {
            return form;
        }
        if (form.isString()) {
            return form;
        }
        if (form.isNumber()) {
            return form;
        }
        if (NIL != hl_term_with_el_counterpart_p(form)) {
            return hl_to_el(form);
        }
        if (form.isCons()) {
            return list_utilities.recons(transform_hl_to_el(form.first()), transform_hl_to_el(form.rest()), form);
        }
        return form;
    }

    public static final SubLObject reified_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_utilities.atomic_reified_term_p(v_object)) || (NIL != com.cyc.cycjava.cycl.cycl_utilities.reified_formula_p(v_object)));
    }

    public static SubLObject reified_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != atomic_reified_term_p(v_object)) || (NIL != reified_formula_p(v_object)));
    }

    public static final SubLObject atomic_reified_term_p_alt(SubLObject v_object) {
        return constant_p(v_object);
    }

    public static SubLObject atomic_reified_term_p(final SubLObject v_object) {
        return constant_p(v_object);
    }

    public static final SubLObject reified_formula_p_alt(SubLObject v_object) {
        return collection_defns.hl_formula_p(v_object);
    }

    public static SubLObject reified_formula_p(final SubLObject v_object) {
        return collection_defns.hl_formula_p(v_object);
    }

    public static SubLObject rf_p(final SubLObject v_object) {
        return reified_formula_p(v_object);
    }

    public static SubLObject rf_type(final SubLObject rf) {
        if (NIL != nart_handles.nart_p(rf)) {
            return $NART;
        }
        if (NIL != assertion_handles.assertion_p(rf)) {
            return $ASSERTION;
        }
        return NIL;
    }

    public static SubLObject rf_raw_id(final SubLObject rf) {
        if (NIL != nart_handles.nart_p(rf)) {
            return nart_handles.nart_id(rf);
        }
        if (NIL != assertion_handles.assertion_p(rf)) {
            return assertion_handles.assertion_id(rf);
        }
        return NIL;
    }

    public static SubLObject rf_id(final SubLObject rf) {
        return cons(rf_type(rf), rf_raw_id(rf));
    }

    public static SubLObject find_rf_by_id(final SubLObject rf_id) {
        final SubLObject type = rf_id.first();
        final SubLObject raw_id = rf_id.rest();
        if (raw_id.isInteger()) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql($NART)) {
                return nart_handles.find_nart_by_id(raw_id);
            }
            if (pcase_var.eql($ASSERTION)) {
                return assertion_handles.find_assertion_by_id(raw_id);
            }
        }
        return NIL;
    }

    public static SubLObject find_rf(final SubLObject formula) {
        final SubLObject nart = narts_high.find_nart(formula);
        return NIL != nart ? nart : czer_meta.find_assertion_cycl(formula, UNPROVIDED);
    }

    public static SubLObject robustly_find_rf(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
        try {
            czer_vars.$robust_assertion_lookup$.bind(T, thread);
            czer_vars.$robust_nart_lookup$.bind(T, thread);
            final SubLObject nart = czer_utilities.el_find_nart(formula);
            result = (NIL != nart) ? nart : czer_meta.find_assertion_cycl(formula, UNPROVIDED);
        } finally {
            czer_vars.$robust_nart_lookup$.rebind(_prev_bind_2, thread);
            czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rf_formula(final SubLObject rf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(rf)) {
            return funcall(czer_vars.$nart_key$.getDynamicValue(thread), rf);
        }
        if (NIL != assertion_handles.assertion_p(rf)) {
            return funcall(czer_vars.$assertion_key$.getDynamicValue(thread), rf);
        }
        return NIL;
    }

    public static SubLObject rf_expand(final SubLObject rf) {
        if (NIL != nart_handles.nart_p(rf)) {
            return narts_high.nart_expand(rf);
        }
        if (NIL != assertion_handles.assertion_p(rf)) {
            return fi.assertion_expand(rf);
        }
        return NIL;
    }

    public static SubLObject rf_narts(final SubLObject rf, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return formula_narts(funcall(czer_vars.$rf_key$.getDynamicValue(thread), rf), penetrate_hl_structuresP, UNPROVIDED);
    }

    public static SubLObject rf_assertions(final SubLObject rf, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fi.sentence_assertions(funcall(czer_vars.$rf_key$.getDynamicValue(thread), rf), penetrate_hl_structuresP);
    }

    public static SubLObject wf_rf_syntaxP(final SubLObject rf) {
        if (NIL != nart_handles.nart_p(rf)) {
            return term.first_order_termP(narts_high.nart_hl_formula(rf));
        }
        if (NIL != assertion_handles.assertion_p(rf)) {
            return el_grammar.el_sentence_p(fi.assertion_fi_formula(rf, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject valid_rfP(final SubLObject rf) {
        if (NIL != nart_handles.nart_p(rf)) {
            return nart_handles.valid_nartP(rf, UNPROVIDED);
        }
        if (NIL != assertion_handles.assertion_p(rf)) {
            return assertions_high.valid_assertion(rf, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject all_rfs() {
        return nconc(kb_utilities.all_narts(), kb_utilities.all_assertions());
    }

    public static SubLObject unreify_rfs(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return transform_list_utilities.transform(formula, symbol_function(RF_P), czer_vars.$rf_key$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject rf_count() {
        return add(nart_handles.nart_count(), assertion_handles.assertion_count());
    }

    public static SubLObject subrfs(final SubLObject rf, final SubLObject penetrate_hl_structuresP) {
        final SubLObject formula = rf_formula(rf);
        return nconc(formula_narts(formula, penetrate_hl_structuresP, UNPROVIDED), formula_sub_assertions(formula, penetrate_hl_structuresP, UNPROVIDED));
    }

    public static SubLObject super_rfs(final SubLObject rf) {
        return nconc(NIL != nart_handles.nart_p(rf) ? indexing_utilities.dependent_narts(rf) : NIL, kb_accessors.all_term_assertions(rf, T));
    }

    public static SubLObject inclusive_subrfs(final SubLObject rf) {
        return cons(rf, subrfs(rf, T));
    }

    public static final SubLObject expression_gather_int_2_alt(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject key, SubLObject subs_tooP) {
        {
            SubLObject result = (NIL != funcall(pred, funcall(key, expression))) ? ((SubLObject) (list(expression))) : NIL;
            if ((NIL != subs_tooP) || (NIL == result)) {
                if ((NIL != penetrate_hl_structuresP) && (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(expression))) {
                    result = nconc(com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(com.cyc.cycjava.cycl.cycl_utilities.careful_hl_term_to_el_term(expression), pred, T, key, subs_tooP), result);
                } else {
                    if (NIL == el_formula_p(expression)) {
                    } else {
                        {
                            SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(expression, $REGULARIZE);
                            SubLObject list_var = NIL;
                            SubLObject v_term = NIL;
                            SubLObject argnum = NIL;
                            for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                                if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                                    result = nconc(com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(v_term, pred, penetrate_hl_structuresP, key, subs_tooP), result);
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject expression_gather_int_2(final SubLObject expression, final SubLObject pred, final SubLObject penetrate_hl_structuresP, final SubLObject key, final SubLObject subs_tooP) {
        SubLObject result = (NIL != funcall(pred, funcall(key, expression))) ? list(expression) : NIL;
        if ((NIL != subs_tooP) || (NIL == result)) {
            if ((NIL != penetrate_hl_structuresP) && (NIL != hl_term_with_el_counterpart_p(expression))) {
                result = nconc(expression_gather_int_2(careful_hl_term_to_el_term(expression), pred, T, key, subs_tooP), result);
            } else
                if (NIL != el_formula_p(expression)) {
                    final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(expression);
                    final SubLObject terms = formula_terms(expression, $REGULARIZE);
                    SubLObject list_var = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if ((NIL == maybe_some_opaque_argP) || (NIL == opaque_argP(expression, argnum))) {
                            result = nconc(expression_gather_int_2(v_term, pred, penetrate_hl_structuresP, key, subs_tooP), result);
                        }
                    }
                }

        }
        return result;
    }

    public static final SubLObject expression_gather_int_alt(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        return list_utilities.fast_delete_duplicates(com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP), test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject expression_gather_int(final SubLObject expression, final SubLObject pred, final SubLObject penetrate_hl_structuresP, final SubLObject test, final SubLObject key, final SubLObject subs_tooP) {
        return list_utilities.fast_delete_duplicates(expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP), test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject expression_gather_with_duplicates_alt(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP);
    }

    public static SubLObject expression_gather_with_duplicates(final SubLObject expression, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of all objects within EXPRESSION which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION passes PRED.
     * @see tree-gather
     */
    @LispMethod(comment = "@return list; a list of all objects within EXPRESSION which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION passes PRED.\r\n@see tree-gather")
    public static final SubLObject expression_gather_alt(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(expression, pred, penetrate_hl_structuresP, test, key, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of all objects within EXPRESSION which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION passes PRED.
     * @see tree-gather
     */
    @LispMethod(comment = "@return list; a list of all objects within EXPRESSION which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION passes PRED.\r\n@see tree-gather")
    public static SubLObject expression_gather(final SubLObject expression, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_gather_int(expression, pred, penetrate_hl_structuresP, test, key, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of all objects within ASSERTION which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of all objects within ASSERTION which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject assertion_gather_alt(SubLObject pred, SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(assertion)) {
            {
                SubLObject mt_objects = com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(assertion_mt(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
                SubLObject formula_objects = com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(assertion_cons(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
                if (NIL == mt_objects) {
                    return formula_objects;
                } else {
                    if (NIL == formula_objects) {
                        return mt_objects;
                    } else {
                        return list_utilities.fast_delete_duplicates(nconc(mt_objects, formula_objects), test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; a list of all objects within ASSERTION which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of all objects within ASSERTION which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject assertion_gather(final SubLObject pred, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL == hl_term_with_el_counterpart_p(assertion)) {
            return NIL;
        }
        final SubLObject mt_objects = expression_gather_int(assertions_high.assertion_mt(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
        final SubLObject formula_objects = expression_gather_int(assertions_high.assertion_cons(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
        if (NIL == mt_objects) {
            return formula_objects;
        }
        if (NIL == formula_objects) {
            return mt_objects;
        }
        return list_utilities.fast_delete_duplicates(nconc(mt_objects, formula_objects), test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * how many times does ITEM occur (according to TEST) in LIST?
     *
     * @return integer
     */
    @LispMethod(comment = "how many times does ITEM occur (according to TEST) in LIST?\r\n\r\n@return integer")
    public static final SubLObject expression_count_alt(SubLObject item, SubLObject list, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $expression_count_item$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $expression_count_test$.currentBinding(thread);
                    try {
                        $expression_count_item$.bind(item, thread);
                        $expression_count_test$.bind(test, thread);
                        result = length(com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(list, EXPRESSION_COUNT_HELPER, penetrate_hl_structuresP, symbol_function(IDENTITY), subs_tooP));
                    } finally {
                        $expression_count_test$.rebind(_prev_bind_1, thread);
                        $expression_count_item$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * how many times does ITEM occur (according to TEST) in LIST?
     *
     * @return integer
     */
    @LispMethod(comment = "how many times does ITEM occur (according to TEST) in LIST?\r\n\r\n@return integer")
    public static SubLObject expression_count(final SubLObject item, final SubLObject list, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $expression_count_item$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $expression_count_test$.currentBinding(thread);
        try {
            $expression_count_item$.bind(item, thread);
            $expression_count_test$.bind(test, thread);
            result = length(expression_gather_int_2(list, EXPRESSION_COUNT_HELPER, penetrate_hl_structuresP, symbol_function(IDENTITY), subs_tooP));
        } finally {
            $expression_count_test$.rebind(_prev_bind_2, thread);
            $expression_count_item$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject expression_count_helper_alt(SubLObject list_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return funcall($expression_count_test$.getDynamicValue(thread), $expression_count_item$.getDynamicValue(thread), list_expression);
        }
    }

    public static SubLObject expression_count_helper(final SubLObject list_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return funcall($expression_count_test$.getDynamicValue(thread), $expression_count_item$.getDynamicValue(thread), list_expression);
    }

    /**
     *
     *
     * @return list; a list of all objects within EXPRESSION-LIST which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Will not return EXPRESSION-LIST itself.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     * @see tree-gather
     */
    @LispMethod(comment = "@return list; a list of all objects within EXPRESSION-LIST which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nWill not return EXPRESSION-LIST itself.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.\r\n@see tree-gather")
    public static final SubLObject expression_list_gather_alt(SubLObject expression_list, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = expression_list;
            SubLObject expression = NIL;
            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                {
                    SubLObject partial_result = com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP);
                    result = nconc(result, partial_result);
                }
            }
            return list_utilities.fast_delete_duplicates(result, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return list; a list of all objects within EXPRESSION-LIST which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Will not return EXPRESSION-LIST itself.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     * @see tree-gather
     */
    @LispMethod(comment = "@return list; a list of all objects within EXPRESSION-LIST which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nWill not return EXPRESSION-LIST itself.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.\r\n@see tree-gather")
    public static SubLObject expression_list_gather(final SubLObject expression_list, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = expression_list;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject partial_result = expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP);
            result = nconc(result, partial_result);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of all objects within the EL formula FORMULA which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-gather
     */
    @LispMethod(comment = "@return list; a list of all objects within the EL formula FORMULA which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-gather")
    public static final SubLObject formula_gather_alt(SubLObject formula, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather(formula, pred, penetrate_hl_structuresP, test, key, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of all objects within the EL formula FORMULA which pass the test PRED, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-gather
     */
    @LispMethod(comment = "@return list; a list of all objects within the EL formula FORMULA which pass the test PRED, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-gather")
    public static SubLObject formula_gather(final SubLObject formula, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_gather(formula, pred, penetrate_hl_structuresP, test, key, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in EXPRESSION, optionally without duplicates and in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is a fort.
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in EXPRESSION, optionally without duplicates and in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is a fort.")
    public static final SubLObject expression_forts_alt(SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (delete_duplicatesP == UNPROVIDED) {
            delete_duplicatesP = T;
        }
        return NIL != delete_duplicatesP ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(expression, symbol_function(FORT_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), subs_tooP))) : com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int_2(expression, symbol_function(FORT_P), penetrate_hl_structuresP, symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in EXPRESSION, optionally without duplicates and in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is a fort.
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in EXPRESSION, optionally without duplicates and in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is a fort.")
    public static SubLObject expression_forts(final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (delete_duplicatesP == UNPROVIDED) {
            delete_duplicatesP = T;
        }
        return NIL != delete_duplicatesP ? expression_gather_int(expression, symbol_function(FORT_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), subs_tooP) : expression_gather_int_2(expression, symbol_function(FORT_P), penetrate_hl_structuresP, symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static final SubLObject expression_list_forts_alt(SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_list_gather(expression_list, symbol_function(FORT_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static SubLObject expression_list_forts(final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_list_gather(expression_list, symbol_function(FORT_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in the EL formula FORMULA, optionally without duplicates and in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in the EL formula FORMULA, optionally without duplicates and in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject formula_forts_alt(SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (delete_duplicatesP == UNPROVIDED) {
            delete_duplicatesP = T;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_forts(formula, penetrate_hl_structuresP, subs_tooP, delete_duplicatesP);
    }

    /**
     *
     *
     * @return list; a list of the forts mentioned in the EL formula FORMULA, optionally without duplicates and in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the forts mentioned in the EL formula FORMULA, optionally without duplicates and in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject formula_forts(final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        if (delete_duplicatesP == UNPROVIDED) {
            delete_duplicatesP = T;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_forts(formula, penetrate_hl_structuresP, subs_tooP, delete_duplicatesP);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in EXPRESSION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is a constant.
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in EXPRESSION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is a constant.")
    public static final SubLObject expression_constants_alt(SubLObject expression, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(expression, symbol_function(CONSTANT_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), NIL);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in EXPRESSION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is a constant.
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in EXPRESSION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is a constant.")
    public static SubLObject expression_constants(final SubLObject expression, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return expression_gather_int(expression, symbol_function(CONSTANT_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), NIL);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static final SubLObject expression_list_constants_alt(SubLObject expression_list, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_list_gather(expression_list, symbol_function(CONSTANT_P), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static SubLObject expression_list_constants(final SubLObject expression_list, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return expression_list_gather(expression_list, symbol_function(CONSTANT_P), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in the EL formula FORMULA, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in the EL formula FORMULA, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject formula_constants_alt(SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_constants(formula, penetrate_hl_structuresP);
    }

    /**
     *
     *
     * @return list; a list of the constants mentioned in the EL formula FORMULA, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the constants mentioned in the EL formula FORMULA, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject formula_constants(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_constants(formula, penetrate_hl_structuresP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in EXPRESSION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is a nart.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in EXPRESSION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is a nart.")
    public static final SubLObject expression_narts_alt(SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(expression, symbol_function(NART_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in EXPRESSION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is a nart.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in EXPRESSION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is a nart.")
    public static SubLObject expression_narts(final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_gather_int(expression, symbol_function(NART_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static final SubLObject expression_list_narts_alt(SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_list_gather(expression_list, symbol_function(NART_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static SubLObject expression_list_narts(final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_list_gather(expression_list, symbol_function(NART_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in the EL formula FORMULA, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in the EL formula FORMULA, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject formula_narts_alt(SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_narts(formula, penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in the EL formula FORMULA, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in the EL formula FORMULA, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject formula_narts(final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_narts(formula, penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in EXPRESSION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is an assertion.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in EXPRESSION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is an assertion.")
    public static final SubLObject expression_sub_assertions_alt(SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather_int(expression, symbol_function(ASSERTION_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in EXPRESSION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns the singleton list containing EXPRESSION if EXPRESSION is an assertion.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in EXPRESSION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns the singleton list containing EXPRESSION if EXPRESSION is an assertion.")
    public static SubLObject expression_sub_assertions(final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_gather_int(expression, symbol_function(ASSERTION_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static final SubLObject expression_list_sub_assertions_alt(SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_list_gather(expression_list, symbol_function(ASSERTION_P), penetrate_hl_structuresP, symbol_function(EQ), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in EXPRESSION-LIST, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @param EXPRESSION-LIST;
     * 		a list of CycL expressions.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in EXPRESSION-LIST, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@param EXPRESSION-LIST;\r\n\t\ta list of CycL expressions.")
    public static SubLObject expression_list_sub_assertions(final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_list_gather(expression_list, symbol_function(ASSERTION_P), penetrate_hl_structuresP, symbol_function(EQL), symbol_function(IDENTITY), subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in the EL formula FORMULA without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in the EL formula FORMULA without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject formula_sub_assertions_alt(SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_sub_assertions(formula, penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in the EL formula FORMULA without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in the EL formula FORMULA without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject formula_sub_assertions(final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_sub_assertions(formula, penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in ASSERTION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Does not return ASSERTION itself; assumes that no assertion can reference itself.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in ASSERTION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nDoes not return ASSERTION itself; assumes that no assertion can reference itself.")
    public static final SubLObject assertion_sub_assertions_alt(SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_sub_assertions(assertion_hl_formula(assertion, UNPROVIDED), penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in ASSERTION, without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Does not return ASSERTION itself; assumes that no assertion can reference itself.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in ASSERTION, without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nDoes not return ASSERTION itself; assumes that no assertion can reference itself.")
    public static SubLObject assertion_sub_assertions(final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return expression_sub_assertions(fi.assertion_hl_formula(assertion, UNPROVIDED), penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in NART without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in NART without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject nart_sub_assertions_alt(SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        SubLTrampolineFile.checkType(nart, NART_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_sub_assertions(nart, penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the assertions mentioned in NART without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return list; a list of the assertions mentioned in NART without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject nart_sub_assertions(final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        return expression_sub_assertions(nart, penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in NART without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Does not return NART itself.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in NART without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nDoes not return NART itself.")
    public static final SubLObject subnarts_alt(SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_narts(nart_hl_formula(nart), penetrate_hl_structuresP, subs_tooP);
    }

    /**
     *
     *
     * @return list; a list of the narts mentioned in NART without duplicates but in no particular order.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Does not return NART itself.
     */
    @LispMethod(comment = "@return list; a list of the narts mentioned in NART without duplicates but in no particular order.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nDoes not return NART itself.")
    public static SubLObject subnarts(final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        return expression_narts(narts_high.nart_hl_formula(nart), penetrate_hl_structuresP, subs_tooP);
    }

    public static final SubLObject all_formula_terms_alt(SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (formula.isAtom()) {
            } else {
                if ((NIL != penetrate_hl_structuresP) && (NIL != nart_handles.nart_p(formula))) {
                    return com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(nart_hl_formula(formula), penetrate_hl_structuresP);
                } else {
                    if ((NIL != penetrate_hl_structuresP) && (NIL != assertion_handles.assertion_p(formula))) {
                        return com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(assertion_fi_formula(formula, UNPROVIDED), penetrate_hl_structuresP);
                    } else {
                        if (NIL != el_negation_p(formula)) {
                            return com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(formula, UNPROVIDED), penetrate_hl_structuresP);
                        } else {
                            if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                                {
                                    SubLObject result = NIL;
                                    SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(formula, $IGNORE);
                                    SubLObject cdolist_list_var = terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                        result = cons(com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(v_term, penetrate_hl_structuresP), result);
                                    }
                                    return result;
                                }
                            } else {
                                if (NIL != el_implication_p(formula)) {
                                    return union(com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(formula, UNPROVIDED), penetrate_hl_structuresP), com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
                                } else {
                                    if (NIL != el_exception_p(formula)) {
                                        return union(com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(formula, UNPROVIDED), penetrate_hl_structuresP), com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
                                    } else {
                                        if ((NIL != el_universal_p(formula)) || (NIL != el_existential_p(formula))) {
                                            return adjoin(com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(formula, UNPROVIDED), com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (NIL != el_bounded_existential_p(formula)) {
                                                return adjoin(com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(formula, UNPROVIDED), com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg3(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
                                            } else {
                                                if (NIL != mt_designating_literalP(formula)) {
                                                    {
                                                        SubLObject mt = designated_mt(formula);
                                                        SubLObject subformula = designated_sentence(formula);
                                                        SubLObject result = NIL;
                                                        SubLObject mt_var = (NIL != fort_types_interface.mtP(mt)) ? ((SubLObject) (mt)) : NIL;
                                                        {
                                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                                                result = com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(subformula, penetrate_hl_structuresP);
                                                            } finally {
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                        return adjoin(mt, result, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else {
                                                    if (NIL != atomic_sentenceP(formula)) {
                                                        return com.cyc.cycjava.cycl.cycl_utilities.all_literal_terms(formula, penetrate_hl_structuresP);
                                                    } else {
                                                        el_error(FOUR_INTEGER, $str_alt20$_S_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED);
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
    }

    public static SubLObject all_formula_terms(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isAtom()) {
            if ((NIL != penetrate_hl_structuresP) && (NIL != nart_handles.nart_p(formula))) {
                return all_formula_terms(narts_high.nart_hl_formula(formula), penetrate_hl_structuresP);
            }
            if ((NIL != penetrate_hl_structuresP) && (NIL != assertion_handles.assertion_p(formula))) {
                return all_formula_terms(fi.assertion_fi_formula(formula, UNPROVIDED), penetrate_hl_structuresP);
            }
            if (NIL != el_negation_p(formula)) {
                return all_formula_terms(formula_arg1(formula, UNPROVIDED), penetrate_hl_structuresP);
            }
            if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                SubLObject result = NIL;
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = formula_terms(formula, $IGNORE);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(all_formula_terms(v_term, penetrate_hl_structuresP), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
                return result;
            }
            if (NIL != el_implication_p(formula)) {
                return union(all_formula_terms(formula_arg1(formula, UNPROVIDED), penetrate_hl_structuresP), all_formula_terms(formula_arg2(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != el_exception_p(formula)) {
                return union(all_formula_terms(formula_arg1(formula, UNPROVIDED), penetrate_hl_structuresP), all_formula_terms(formula_arg2(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != el_universal_p(formula)) || (NIL != el_existential_p(formula))) {
                return adjoin(formula_arg1(formula, UNPROVIDED), all_formula_terms(formula_arg2(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != el_bounded_existential_p(formula)) {
                return adjoin(formula_arg2(formula, UNPROVIDED), all_formula_terms(formula_arg3(formula, UNPROVIDED), penetrate_hl_structuresP), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != mt_designating_literalP(formula)) {
                final SubLObject mt = designated_mt(formula);
                final SubLObject subformula = designated_sentence(formula);
                SubLObject result2 = NIL;
                final SubLObject mt_var = (NIL != fort_types_interface.mtP(mt)) ? mt : NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    result2 = all_formula_terms(subformula, penetrate_hl_structuresP);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                return adjoin(mt, result2, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != atomic_sentenceP(formula)) {
                return all_literal_terms(formula, penetrate_hl_structuresP);
            }
            el_error(FOUR_INTEGER, $str25$_S_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * descends into structured terms collecting the most
     * atomic (sub) arguments of relations
     */
    @LispMethod(comment = "descends into structured terms collecting the most\r\natomic (sub) arguments of relations\ndescends into structured terms collecting the most\natomic (sub) arguments of relations")
    public static final SubLObject all_literal_terms_alt(SubLObject literal, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_negation_p(literal)) {
                return com.cyc.cycjava.cycl.cycl_utilities.all_literal_terms(com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(literal, UNPROVIDED), penetrate_hl_structuresP);
            } else {
                {
                    SubLObject ans = NIL;
                    SubLObject psn = ONE_INTEGER;
                    SubLObject args = com.cyc.cycjava.cycl.cycl_utilities.formula_args(literal, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        if (NIL != forts.fort_p(v_term)) {
                            {
                                SubLObject item_var = v_term;
                                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    ans = cons(item_var, ans);
                                }
                            }
                            if ((NIL != penetrate_hl_structuresP) && (NIL != nart_handles.nart_p(v_term))) {
                                ans = list_utilities.fast_delete_duplicates(append(ans, com.cyc.cycjava.cycl.cycl_utilities.all_literal_terms(funcall(czer_vars.$nart_key$.getDynamicValue(thread), v_term), T)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            if ((NIL != penetrate_hl_structuresP) && (NIL != assertion_handles.assertion_p(v_term))) {
                                ans = list_utilities.fast_delete_duplicates(append(ans, com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(funcall(czer_vars.$assertion_key$.getDynamicValue(thread), v_term), T)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (NIL != cycl_variables.kb_variableP(v_term)) {
                                    {
                                        SubLObject item_var = v_term;
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                } else {
                                    if (NIL != collection_defns.el_variableP(v_term)) {
                                        {
                                            SubLObject item_var = v_term;
                                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var, ans);
                                            }
                                        }
                                    } else {
                                        if (NIL != unreified_skolem_termP(v_term)) {
                                            {
                                                SubLObject cdolist_list_var_1 = second(v_term);
                                                SubLObject sub_term = NIL;
                                                for (sub_term = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , sub_term = cdolist_list_var_1.first()) {
                                                    {
                                                        SubLObject item_var = sub_term;
                                                        if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                            ans = cons(item_var, ans);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != nautP(v_term, UNPROVIDED)) {
                                                {
                                                    SubLObject cdolist_list_var_2 = com.cyc.cycjava.cycl.cycl_utilities.all_literal_terms(v_term, penetrate_hl_structuresP);
                                                    SubLObject sub_term = NIL;
                                                    for (sub_term = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , sub_term = cdolist_list_var_2.first()) {
                                                        {
                                                            SubLObject item_var = sub_term;
                                                            if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                ans = cons(item_var, ans);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (NIL != sentenceP(v_term, UNPROVIDED)) {
                                                    {
                                                        SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.cycl_utilities.all_formula_terms(v_term, penetrate_hl_structuresP);
                                                        SubLObject sub_term = NIL;
                                                        for (sub_term = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , sub_term = cdolist_list_var_3.first()) {
                                                            {
                                                                SubLObject item_var = sub_term;
                                                                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    ans = cons(item_var, ans);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    el_error(FOUR_INTEGER, $str_alt20$_S_is_not_well_formed_, literal, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        psn = add(psn, ONE_INTEGER);
                    }
                    return reverse(ans);
                }
            }
        }
    }

    /**
     * descends into structured terms collecting the most
     * atomic (sub) arguments of relations
     */
    @LispMethod(comment = "descends into structured terms collecting the most\r\natomic (sub) arguments of relations\ndescends into structured terms collecting the most\natomic (sub) arguments of relations")
    public static SubLObject all_literal_terms(final SubLObject literal, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_negation_p(literal)) {
            return all_literal_terms(formula_arg1(literal, UNPROVIDED), penetrate_hl_structuresP);
        }
        SubLObject ans = NIL;
        SubLObject psn = ONE_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(literal, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(v_term)) {
                final SubLObject item_var = v_term;
                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
                if ((NIL != penetrate_hl_structuresP) && (NIL != nart_handles.nart_p(v_term))) {
                    ans = list_utilities.fast_delete_duplicates(append(ans, all_literal_terms(funcall(czer_vars.$nart_key$.getDynamicValue(thread), v_term), T)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if ((NIL != penetrate_hl_structuresP) && (NIL != assertion_handles.assertion_p(v_term))) {
                    ans = list_utilities.fast_delete_duplicates(append(ans, all_formula_terms(funcall(czer_vars.$assertion_key$.getDynamicValue(thread), v_term), T)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (NIL != cycl_variables.kb_variableP(v_term)) {
                        final SubLObject item_var = v_term;
                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                            ans = cons(item_var, ans);
                        }
                    } else
                        if (NIL != collection_defns.el_variableP(v_term)) {
                            final SubLObject item_var = v_term;
                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                ans = cons(item_var, ans);
                            }
                        } else
                            if (NIL != term.unreified_skolem_termP(v_term)) {
                                SubLObject cdolist_list_var_$1 = second(v_term);
                                SubLObject sub_term = NIL;
                                sub_term = cdolist_list_var_$1.first();
                                while (NIL != cdolist_list_var_$1) {
                                    final SubLObject item_var2 = sub_term;
                                    if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var2, ans);
                                    }
                                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                    sub_term = cdolist_list_var_$1.first();
                                } 
                            } else
                                if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                    SubLObject cdolist_list_var_$2 = all_literal_terms(v_term, penetrate_hl_structuresP);
                                    SubLObject sub_term = NIL;
                                    sub_term = cdolist_list_var_$2.first();
                                    while (NIL != cdolist_list_var_$2) {
                                        final SubLObject item_var2 = sub_term;
                                        if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var2, ans);
                                        }
                                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                        sub_term = cdolist_list_var_$2.first();
                                    } 
                                } else
                                    if (NIL != term.sentenceP(v_term, UNPROVIDED)) {
                                        SubLObject cdolist_list_var_$3 = all_formula_terms(v_term, penetrate_hl_structuresP);
                                        SubLObject sub_term = NIL;
                                        sub_term = cdolist_list_var_$3.first();
                                        while (NIL != cdolist_list_var_$3) {
                                            final SubLObject item_var2 = sub_term;
                                            if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var2, ans);
                                            }
                                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                            sub_term = cdolist_list_var_$3.first();
                                        } 
                                    } else {
                                        el_error(FOUR_INTEGER, $str25$_S_is_not_well_formed_, literal, UNPROVIDED, UNPROVIDED);
                                    }






            psn = add(psn, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    /**
     * If SENTENCE is atomic, returns a singleton list of its predicate.
     * If SENTENCE is non-atomic, returns the predicates of all its top-level
     * atomic sentences.  Order is arbitrary.
     */
    @LispMethod(comment = "If SENTENCE is atomic, returns a singleton list of its predicate.\r\nIf SENTENCE is non-atomic, returns the predicates of all its top-level\r\natomic sentences.  Order is arbitrary.\nIf SENTENCE is atomic, returns a singleton list of its predicate.\nIf SENTENCE is non-atomic, returns the predicates of all its top-level\natomic sentences.  Order is arbitrary.")
    public static final SubLObject top_level_predicates_alt(SubLObject sentence, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        {
            SubLObject predicates = com.cyc.cycjava.cycl.cycl_utilities.top_level_predicates_int(sentence);
            if (NIL != remove_duplicatesP) {
                predicates = list_utilities.fast_delete_duplicates(predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return predicates;
        }
    }

    /**
     * If SENTENCE is atomic, returns a singleton list of its predicate.
     * If SENTENCE is non-atomic, returns the predicates of all its top-level
     * atomic sentences.  Order is arbitrary.
     */
    @LispMethod(comment = "If SENTENCE is atomic, returns a singleton list of its predicate.\r\nIf SENTENCE is non-atomic, returns the predicates of all its top-level\r\natomic sentences.  Order is arbitrary.\nIf SENTENCE is atomic, returns a singleton list of its predicate.\nIf SENTENCE is non-atomic, returns the predicates of all its top-level\natomic sentences.  Order is arbitrary.")
    public static SubLObject top_level_predicates(final SubLObject sentence, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = NIL;
        }
        SubLObject predicates = top_level_predicates_int(sentence);
        if (NIL != remove_duplicatesP) {
            predicates = list_utilities.fast_delete_duplicates(predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return predicates;
    }

    public static final SubLObject top_level_predicates_int_alt(SubLObject sentence) {
        {
            SubLObject predicates = NIL;
            SubLObject truth_function = com.cyc.cycjava.cycl.cycl_utilities.sentence_truth_function(sentence);
            if (NIL != cyc_const_logical_operator_p(truth_function)) {
                {
                    SubLObject args = com.cyc.cycjava.cycl.cycl_utilities.formula_args(sentence, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject subsentence = NIL;
                    for (subsentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subsentence = cdolist_list_var.first()) {
                        {
                            SubLObject sub_predicates = com.cyc.cycjava.cycl.cycl_utilities.top_level_predicates_int(subsentence);
                            predicates = nconc(predicates, sub_predicates);
                        }
                    }
                }
            } else {
                if (NIL != fort_types_interface.predicateP(truth_function)) {
                    {
                        SubLObject predicate = truth_function;
                        predicates = cons(predicate, predicates);
                    }
                }
            }
            return predicates;
        }
    }

    public static SubLObject top_level_predicates_int(final SubLObject sentence) {
        SubLObject predicates = NIL;
        final SubLObject truth_function = sentence_truth_function(sentence);
        if (NIL != cyc_const_logical_operator_p(truth_function)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = formula_args(sentence, $IGNORE);
            SubLObject subsentence = NIL;
            subsentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sub_predicates = top_level_predicates_int(subsentence);
                predicates = nconc(predicates, sub_predicates);
                cdolist_list_var = cdolist_list_var.rest();
                subsentence = cdolist_list_var.first();
            } 
        } else
            if (NIL != fort_types_interface.predicateP(truth_function)) {
                final SubLObject predicate = truth_function;
                predicates = cons(predicate, predicates);
            }

        return predicates;
    }

    public static final SubLObject containing_subexpressions_alt(SubLObject v_term, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expressions = NIL;
                {
                    SubLObject _prev_bind_0 = $containing_subexpressions_lambda_term$.currentBinding(thread);
                    try {
                        $containing_subexpressions_lambda_term$.bind(v_term, thread);
                        expressions = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(formula, CONTAINING_SUBEXPRESSIONS_LAMBDA_FN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $containing_subexpressions_lambda_term$.rebind(_prev_bind_0, thread);
                    }
                }
                return expressions;
            }
        }
    }

    public static SubLObject containing_subexpressions(final SubLObject v_term, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expressions = NIL;
        final SubLObject _prev_bind_0 = $containing_subexpressions_lambda_term$.currentBinding(thread);
        try {
            $containing_subexpressions_lambda_term$.bind(v_term, thread);
            expressions = expression_gather(formula, CONTAINING_SUBEXPRESSIONS_LAMBDA_FN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $containing_subexpressions_lambda_term$.rebind(_prev_bind_0, thread);
        }
        return expressions;
    }

    public static final SubLObject containing_subexpressions_lambda_fn_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(formula, $IGNORE);
                SubLObject cdolist_list_var = terms;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if (arg.equal($containing_subexpressions_lambda_term$.getDynamicValue(thread))) {
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject containing_subexpressions_lambda_fn(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = formula_terms(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.equal($containing_subexpressions_lambda_term$.getDynamicValue(thread))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject expression_contains_keywordp_alt(SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(KEYWORDP, formula, penetrate_hl_structuresP, UNPROVIDED));
    }

    public static SubLObject expression_contains_keywordp(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return list_utilities.sublisp_boolean(expression_find_if(KEYWORDP, formula, penetrate_hl_structuresP, UNPROVIDED));
    }

    public static final SubLObject expression_find_if_int_alt(SubLObject test, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        {
            SubLObject transformed_expression = (symbol_function(IDENTITY) == key) ? ((SubLObject) (expression)) : funcall(key, expression);
            SubLObject test_succeededP = funcall(test, transformed_expression);
            if (NIL != test_succeededP) {
                return expression;
            } else {
                if ((NIL != penetrate_hl_structuresP) && (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(expression))) {
                    return com.cyc.cycjava.cycl.cycl_utilities.expression_find_if_int(test, com.cyc.cycjava.cycl.cycl_utilities.careful_hl_term_to_el_term(expression), T, key);
                } else {
                    if (NIL == el_formula_p(expression)) {
                        return NIL;
                    } else {
                        {
                            SubLObject result = NIL;
                            SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(expression, $REGULARIZE);
                            SubLObject list_var = NIL;
                            SubLObject v_term = NIL;
                            SubLObject argnum = NIL;
                            for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; !((NIL != result) || (NIL == list_var)); list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                                if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                                    result = com.cyc.cycjava.cycl.cycl_utilities.expression_find_if_int(test, v_term, penetrate_hl_structuresP, key);
                                }
                            }
                            return result;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject expression_find_if_int(final SubLObject test, final SubLObject expression, final SubLObject penetrate_hl_structuresP, final SubLObject key) {
        final SubLObject transformed_expression = (symbol_function(IDENTITY).eql(key)) ? expression : funcall(key, expression);
        final SubLObject test_succeededP = funcall(test, transformed_expression);
        if (NIL != test_succeededP) {
            return expression;
        }
        if ((NIL != penetrate_hl_structuresP) && (NIL != hl_term_with_el_counterpart_p(expression))) {
            return expression_find_if_int(test, careful_hl_term_to_el_term(expression), T, key);
        }
        if (NIL == el_formula_p(expression)) {
            return NIL;
        }
        final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(expression);
        SubLObject result = NIL;
        final SubLObject terms = formula_terms(expression, $REGULARIZE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; (NIL == result) && (NIL != list_var); list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if ((NIL == maybe_some_opaque_argP) || (NIL == opaque_argP(expression, argnum))) {
                result = expression_find_if_int(test, v_term, penetrate_hl_structuresP, key);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within the CycL expression EXPRESSION.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-find-if
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within the CycL expression EXPRESSION.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-find-if")
    public static final SubLObject expression_find_if_alt(SubLObject test, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if ((NIL == penetrate_hl_structuresP) && (NIL == list_utilities.tree_find_if(test, expression, key))) {
            return NIL;
        } else {
            return com.cyc.cycjava.cycl.cycl_utilities.expression_find_if_int(test, expression, penetrate_hl_structuresP, key);
        }
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within the CycL expression EXPRESSION.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-find-if
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within the CycL expression EXPRESSION.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-find-if")
    public static SubLObject expression_find_if(final SubLObject test, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if ((NIL == penetrate_hl_structuresP) && (NIL == list_utilities.tree_find_if(test, expression, key))) {
            return NIL;
        }
        return expression_find_if_int(test, expression, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within the EL formula FORMULA.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see expression-find-if
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within the EL formula FORMULA.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see expression-find-if")
    public static final SubLObject formula_find_if_alt(SubLObject test, SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(test, formula, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within the EL formula FORMULA.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see expression-find-if
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within the EL formula FORMULA.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see expression-find-if")
    public static SubLObject formula_find_if(final SubLObject test, final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_find_if(test, formula, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within ASSERTION.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within ASSERTION.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject assertion_find_if_alt(SubLObject test, SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(assertion)) {
            {
                SubLObject v_object = com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(test, assertion_cons(assertion), penetrate_hl_structuresP, key);
                if (NIL != v_object) {
                    return v_object;
                }
            }
            {
                SubLObject v_object = com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(test, assertion_mt(assertion), penetrate_hl_structuresP, key);
                if (NIL != v_object) {
                    return v_object;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within ASSERTION.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within ASSERTION.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject assertion_find_if(final SubLObject test, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != hl_term_with_el_counterpart_p(assertion)) {
            SubLObject v_object = expression_find_if(test, assertions_high.assertion_cons(assertion), penetrate_hl_structuresP, key);
            if (NIL != v_object) {
                return v_object;
            }
            v_object = expression_find_if(test, assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, key);
            if (NIL != v_object) {
                return v_object;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within NART.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within NART.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject nart_find_if_alt(SubLObject test, SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(nart, NART_P);
        if (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(nart)) {
            return com.cyc.cycjava.cycl.cycl_utilities.expression_find_if(test, com.cyc.cycjava.cycl.cycl_utilities.nart_cons(nart), penetrate_hl_structuresP, key);
        }
        return NIL;
    }

    /**
     *
     *
     * @return object; an object which passes the test TEST if such an object exists within NART.  Otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return object; an object which passes the test TEST if such an object exists within NART.  Otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject nart_find_if(final SubLObject test, final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        if (NIL != hl_term_with_el_counterpart_p(nart)) {
            return expression_find_if(test, nart_cons(nart), penetrate_hl_structuresP, key);
        }
        return NIL;
    }

    public static final SubLObject expression_find_int_alt(SubLObject v_object, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (NIL != funcall(test, v_object, funcall(key, expression))) {
            return expression;
        } else {
            if ((NIL != penetrate_hl_structuresP) && (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(expression))) {
                return com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, com.cyc.cycjava.cycl.cycl_utilities.careful_hl_term_to_el_term(expression), T, test, key);
            } else {
                if (NIL == el_formula_p(expression)) {
                    return NIL;
                } else {
                    {
                        SubLObject result = NIL;
                        SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(expression, $REGULARIZE);
                        SubLObject list_var = NIL;
                        SubLObject v_term = NIL;
                        SubLObject argnum = NIL;
                        for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; !((NIL != result) || (NIL == list_var)); list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                            if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                                result = com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, v_term, penetrate_hl_structuresP, test, key);
                            }
                        }
                        return result;
                    }
                }
            }
        }
    }

    public static SubLObject expression_find_int(final SubLObject v_object, final SubLObject expression, final SubLObject penetrate_hl_structuresP, final SubLObject test, final SubLObject key) {
        if (NIL != funcall(test, v_object, funcall(key, expression))) {
            return expression;
        }
        if ((NIL != penetrate_hl_structuresP) && (NIL != hl_term_with_el_counterpart_p(expression))) {
            return expression_find_int(v_object, careful_hl_term_to_el_term(expression), T, test, key);
        }
        if (NIL == el_formula_p(expression)) {
            return NIL;
        }
        final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(expression);
        SubLObject result = NIL;
        final SubLObject terms = formula_terms(expression, $REGULARIZE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; (NIL == result) && (NIL != list_var); list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if ((NIL == maybe_some_opaque_argP) || (NIL == opaque_argP(expression, argnum))) {
                result = expression_find_int(v_object, v_term, penetrate_hl_structuresP, test, key);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within the CycL expression EXPRESSION, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-find
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within the CycL expression EXPRESSION, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-find")
    public static final SubLObject expression_find_alt(SubLObject v_object, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, expression, penetrate_hl_structuresP, test, key);
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within the CycL expression EXPRESSION, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-find
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within the CycL expression EXPRESSION, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-find")
    public static SubLObject expression_find(final SubLObject v_object, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return expression_find_int(v_object, expression, penetrate_hl_structuresP, test, key);
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within the EL formula FORMULA, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see expression-find
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within the EL formula FORMULA, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see expression-find")
    public static final SubLObject formula_find_alt(SubLObject v_object, SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, formula, penetrate_hl_structuresP, test, key);
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within the EL formula FORMULA, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see expression-find
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within the EL formula FORMULA, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see expression-find")
    public static SubLObject formula_find(final SubLObject v_object, final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_find_int(v_object, formula, penetrate_hl_structuresP, test, key);
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within ASSERTION, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns ASSERTION itself if ASSERTION is equal to OBJECT.
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within ASSERTION, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns ASSERTION itself if ASSERTION is equal to OBJECT.")
    public static final SubLObject assertion_find_alt(SubLObject v_object, SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject result = com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, assertion_cons(assertion), penetrate_hl_structuresP, test, key);
            if (NIL != result) {
                return result;
            }
        }
        {
            SubLObject result = com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, assertion_mt(assertion), penetrate_hl_structuresP, test, key);
            if (NIL != result) {
                return result;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within ASSERTION, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns ASSERTION itself if ASSERTION is equal to OBJECT.
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within ASSERTION, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns ASSERTION itself if ASSERTION is equal to OBJECT.")
    public static SubLObject assertion_find(final SubLObject v_object, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject result = expression_find_int(v_object, assertions_high.assertion_cons(assertion), penetrate_hl_structuresP, test, key);
        if (NIL != result) {
            return result;
        }
        result = expression_find_int(v_object, assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, test, key);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within NART, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns NART itself if NART is equal to OBJECT.
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within NART, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns NART itself if NART is equal to OBJECT.")
    public static final SubLObject nart_find_alt(SubLObject v_object, SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(nart, NART_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_find_int(v_object, nart, penetrate_hl_structuresP, test, key);
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within NART, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
    Returns NART itself if NART is equal to OBJECT.
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within NART, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\nReturns NART itself if NART is equal to OBJECT.")
    public static SubLObject nart_find(final SubLObject v_object, final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        return expression_find_int(v_object, nart, penetrate_hl_structuresP, test, key);
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within any of the CycL expressions in EXPRESSION-LIST, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-find
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within any of the CycL expressions in EXPRESSION-LIST, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-find")
    public static final SubLObject expression_list_find_alt(SubLObject v_object, SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(expression_list, LISTP);
        {
            SubLObject cdolist_list_var = expression_list;
            SubLObject expression = NIL;
            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                {
                    SubLObject result = com.cyc.cycjava.cycl.cycl_utilities.expression_find(v_object, expression, penetrate_hl_structuresP, test, key);
                    if (NIL != result) {
                        return result;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return object; OBJECT if it is found within any of the CycL expressions in EXPRESSION-LIST, otherwise NIL.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-find
     */
    @LispMethod(comment = "@return object; OBJECT if it is found within any of the CycL expressions in EXPRESSION-LIST, otherwise NIL.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-find")
    public static SubLObject expression_list_find(final SubLObject v_object, final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != listp(expression_list) : "! listp(expression_list) " + ("Types.listp(expression_list) " + "CommonSymbols.NIL != Types.listp(expression_list) ") + expression_list;
        SubLObject cdolist_list_var = expression_list;
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = expression_find(v_object, expression, penetrate_hl_structuresP, test, key);
            if (NIL != result) {
                return result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return listp; A sublist of LIST containing only those objects in LIST which are found in EXPRESSION.
     * @unknown result is destructible
     */
    @LispMethod(comment = "@return listp; A sublist of LIST containing only those objects in LIST which are found in EXPRESSION.\r\n@unknown result is destructible")
    public static final SubLObject remove_if_not_in_expression_alt(SubLObject list, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.cycl_utilities.expression_find(elem, expression, penetrate_hl_structuresP, test, key)) {
                    result = cons(elem, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp; A sublist of LIST containing only those objects in LIST which are found in EXPRESSION.
     * @unknown result is destructible
     */
    @LispMethod(comment = "@return listp; A sublist of LIST containing only those objects in LIST which are found in EXPRESSION.\r\n@unknown result is destructible")
    public static SubLObject remove_if_not_in_expression(final SubLObject list, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != expression_find(elem, expression, penetrate_hl_structuresP, test, key)) {
                result = cons(elem, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject expression_find_any(final SubLObject objects, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = expression_find(v_object, expression, penetrate_hl_structuresP, test, key);
            if (NIL != result) {
                return result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject expression_map_int_alt(SubLObject func, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        funcall(func, funcall(key, expression));
        if ((NIL != penetrate_hl_structuresP) && (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(expression))) {
            return com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, com.cyc.cycjava.cycl.cycl_utilities.careful_hl_term_to_el_term(expression), T, key);
        } else {
            if (NIL == el_formula_p(expression)) {
                return NIL;
            } else {
                {
                    SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(expression, $REGULARIZE);
                    SubLObject list_var = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                            com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, v_term, penetrate_hl_structuresP, key);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject expression_map_int(final SubLObject func, final SubLObject expression, final SubLObject penetrate_hl_structuresP, final SubLObject key) {
        funcall(func, funcall(key, expression));
        if ((NIL != penetrate_hl_structuresP) && (NIL != hl_term_with_el_counterpart_p(expression))) {
            return expression_map_int(func, careful_hl_term_to_el_term(expression), T, key);
        }
        if (NIL == el_formula_p(expression)) {
            return NIL;
        }
        final SubLObject terms = formula_terms(expression, $REGULARIZE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if (NIL == opaque_argP(expression, argnum)) {
                expression_map_int(func, v_term, penetrate_hl_structuresP, key);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in EXPRESSION, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-map
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in EXPRESSION, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-map")
    public static final SubLObject expression_map_alt(SubLObject func, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, expression, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in EXPRESSION, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see tree-map
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in EXPRESSION, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see tree-map")
    public static SubLObject expression_map(final SubLObject func, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return expression_map_int(func, expression, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in FORMULA, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see expression-map
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in FORMULA, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see expression-map")
    public static final SubLObject formula_map_alt(SubLObject func, SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, formula, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in FORMULA, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     * @see expression-map
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in FORMULA, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.\r\n@see expression-map")
    public static SubLObject formula_map(final SubLObject func, final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_map_int(func, formula, penetrate_hl_structuresP, key);
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in ASSERTION, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in ASSERTION, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject assertion_map_alt(SubLObject func, SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(assertion)) {
            com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, assertion_mt(assertion), penetrate_hl_structuresP, key);
            com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, assertion_cons(assertion), penetrate_hl_structuresP, key);
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in ASSERTION, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in ASSERTION, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject assertion_map(final SubLObject func, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != hl_term_with_el_counterpart_p(assertion)) {
            expression_map_int(func, assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, key);
            expression_map_int(func, assertions_high.assertion_cons(assertion), penetrate_hl_structuresP, key);
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in NART, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in NART, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static final SubLObject nart_map_alt(SubLObject func, SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(nart, NART_P);
        if (NIL != com.cyc.cycjava.cycl.cycl_utilities.hl_term_with_el_counterpart_p(nart)) {
            return com.cyc.cycjava.cycl.cycl_utilities.expression_map_int(func, com.cyc.cycjava.cycl.cycl_utilities.nart_cons(nart), penetrate_hl_structuresP, key);
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil; after mapping over every term and subterm in NART, calling FUNC on each.
    See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
     */
    @LispMethod(comment = "@return nil; after mapping over every term and subterm in NART, calling FUNC on each.\r\nSee file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.")
    public static SubLObject nart_map(final SubLObject func, final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        if (NIL != hl_term_with_el_counterpart_p(nart)) {
            return expression_map_int(func, nart_cons(nart), penetrate_hl_structuresP, key);
        }
        return NIL;
    }

    /**
     * opacity can change during transformation - it's unclear what the desired behaviour is, though.
     * PRED has a different meaning based on test-pred-on-transformation-result? and negate-pred?
     */
    @LispMethod(comment = "opacity can change during transformation - it\'s unclear what the desired behaviour is, though.\r\nPRED has a different meaning based on test-pred-on-transformation-result? and negate-pred?\nopacity can change during transformation - it\'s unclear what the desired behaviour is, though.\nPRED has a different meaning based on test-pred-on-transformation-result? and negate-pred?")
    public static final SubLObject expression_ntransform_int_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit, SubLObject transformation_level, SubLObject test_pred_on_transformation_resultP, SubLObject negate_predP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (transformation_level.numG(transformation_limit)) {
                sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, transformation_limit);
            }
            {
                SubLObject transformed_expression = NIL;
                if (NIL != test_pred_on_transformation_resultP) {
                    {
                        SubLObject transform_result = funcall(transform, expression);
                        if (makeBoolean(NIL == negate_predP) != makeBoolean(NIL == funcall(pred, transform_result))) {
                            transformed_expression = com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
                        } else {
                            transformed_expression = expression;
                        }
                    }
                } else {
                    if (makeBoolean(NIL == negate_predP) != makeBoolean(NIL == funcall(pred, expression))) {
                        {
                            SubLObject transform_result = funcall(transform, expression);
                            if (expression != transform_result) {
                                transformed_expression = com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
                            } else {
                                transformed_expression = expression;
                            }
                        }
                    } else {
                        transformed_expression = expression;
                    }
                }
                if (NIL == el_formula_p(transformed_expression)) {
                    return transformed_expression;
                }
                {
                    SubLObject seqvar = sequence_var(transformed_expression, UNPROVIDED);
                    SubLObject transformed_seqvar = (((NIL != seqvar) && (NIL != transform_sequence_variablesP)) && (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(transformed_expression))) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(seqvar, pred, transform, T, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP))) : seqvar;
                    SubLObject ist_sentenceP = ist_sentence_p(transformed_expression);
                    SubLObject new_mt = NIL;
                    SubLObject rest_of_expression = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    for (rest_of_expression = transformed_expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                        {
                            SubLObject mt_var = new_mt;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(transformed_expression, argnum)) {
                                        rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
                                        if ((NIL != ist_sentenceP) && argnum.numE(ONE_INTEGER)) {
                                            new_mt = rest_of_expression.first();
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(transformed_expression, argnum)) {
                        rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
                    }
                    rplacd(rest_of_expression, transformed_seqvar);
                    return transformed_expression;
                }
            }
        }
    }

    @LispMethod(comment = "opacity can change during transformation - it\'s unclear what the desired behaviour is, though.\r\nPRED has a different meaning based on test-pred-on-transformation-result? and negate-pred?\nopacity can change during transformation - it\'s unclear what the desired behaviour is, though.\nPRED has a different meaning based on test-pred-on-transformation-result? and negate-pred?")
    public static SubLObject expression_ntransform_int(final SubLObject expression, final SubLObject pred, final SubLObject transform, final SubLObject transform_sequence_variablesP, final SubLObject transformation_limit, final SubLObject transformation_level, final SubLObject test_pred_on_transformation_resultP, final SubLObject negate_predP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_level.numG(transformation_limit)) {
            sublisp_throw($TRANSFORMATION_LIMIT_EXCEEDED, transformation_limit);
        }
        SubLObject transformed_expression = NIL;
        if (NIL != test_pred_on_transformation_resultP) {
            final SubLObject transform_result = funcall(transform, expression);
            if (!makeBoolean(NIL == negate_predP).eql(makeBoolean(NIL == funcall(pred, transform_result)))) {
                transformed_expression = expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
            } else {
                transformed_expression = expression;
            }
        } else
            if (!makeBoolean(NIL == negate_predP).eql(makeBoolean(NIL == funcall(pred, expression)))) {
                final SubLObject transform_result = funcall(transform, expression);
                if (!expression.eql(transform_result)) {
                    transformed_expression = expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
                } else {
                    transformed_expression = expression;
                }
            } else {
                transformed_expression = expression;
            }

        if (NIL == el_formula_p(transformed_expression)) {
            return transformed_expression;
        }
        final SubLObject possible_seqvar = sequence_term(transformed_expression);
        final SubLObject transformed_seqvar = ((((NIL != possible_seqvar) && (NIL != cycl_variables.cyc_varP(possible_seqvar))) && (NIL != transform_sequence_variablesP)) && (NIL == opaque_seqvarP(transformed_expression))) ? expression_ntransform_int(possible_seqvar, pred, transform, T, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP) : NIL;
        final SubLObject new_seq_term = (NIL != transformed_seqvar) ? transformed_seqvar : possible_seqvar;
        final SubLObject ist_sentenceP = ist_sentence_p(transformed_expression, UNPROVIDED);
        final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(transformed_expression);
        SubLObject new_mt = NIL;
        SubLObject rest_of_expression = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        rest_of_expression = transformed_expression;
        v_term = rest_of_expression.first();
        for (argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
            final SubLObject mt_var = new_mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                if ((NIL == maybe_some_opaque_argP) || (NIL == opaque_argP(transformed_expression, argnum))) {
                    rplaca(rest_of_expression, expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
                    if ((NIL != ist_sentenceP) && argnum.numE(ONE_INTEGER)) {
                        new_mt = rest_of_expression.first();
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if ((NIL == maybe_some_opaque_argP) || (NIL == opaque_argP(transformed_expression, argnum))) {
            rplaca(rest_of_expression, expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
        }
        rplacd(rest_of_expression, new_seq_term);
        return transformed_expression;
    }

    /**
     * Recursively tests PRED within the CycL expression EXPRESSION.  If PRED applies to EXPRESSION
     * or a subexpression/subterm of EXPRESSION, TRANSFORM is called on that term or expression.
     * If an expression is transformed into another expression, the result is itself subjected
     * to the transformation if PRED applies to the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively tests PRED within the CycL expression EXPRESSION.  If PRED applies to EXPRESSION\r\nor a subexpression/subterm of EXPRESSION, TRANSFORM is called on that term or expression.\r\nIf an expression is transformed into another expression, the result is itself subjected\r\nto the transformation if PRED applies to the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively tests PRED within the CycL expression EXPRESSION.  If PRED applies to EXPRESSION\nor a subexpression/subterm of EXPRESSION, TRANSFORM is called on that term or expression.\nIf an expression is transformed into another expression, the result is itself subjected\nto the transformation if PRED applies to the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static final SubLObject expression_transform_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }

    @LispMethod(comment = "Recursively tests PRED within the CycL expression EXPRESSION.  If PRED applies to EXPRESSION\r\nor a subexpression/subterm of EXPRESSION, TRANSFORM is called on that term or expression.\r\nIf an expression is transformed into another expression, the result is itself subjected\r\nto the transformation if PRED applies to the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively tests PRED within the CycL expression EXPRESSION.  If PRED applies to EXPRESSION\nor a subexpression/subterm of EXPRESSION, TRANSFORM is called on that term or expression.\nIf an expression is transformed into another expression, the result is itself subjected\nto the transformation if PRED applies to the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static SubLObject expression_transform(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }

    /**
     * A destructive version of @xref expression-transform.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "A destructive version of @xref expression-transform.\r\n\r\n@throws :transformation-limit-exceeded")
    public static final SubLObject expression_ntransform_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }

    @LispMethod(comment = "A destructive version of @xref expression-transform.\r\n\r\n@throws :transformation-limit-exceeded")
    public static SubLObject expression_ntransform(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }/**
     * A destructive version of @xref expression-transform.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA
     * or a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if PRED applies to the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\r\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if PRED applies to the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if PRED applies to the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.")
    public static final SubLObject formula_transform_alt(SubLObject formula, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }

    @LispMethod(comment = "Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\r\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if PRED applies to the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if PRED applies to the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.")
    public static SubLObject formula_transform(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_ntransform_int(copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }/**
     * Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA
     * or a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if PRED applies to the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * A destructive version of @xref formula-transform.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "A destructive version of @xref formula-transform.\r\n\r\n@throws :transformation-limit-exceeded")
    public static final SubLObject formula_ntransform_alt(SubLObject formula, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }

    @LispMethod(comment = "A destructive version of @xref formula-transform.\r\n\r\n@throws :transformation-limit-exceeded")
    public static SubLObject formula_ntransform(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
    }/**
     * A destructive version of @xref formula-transform.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION
     * or a subexpression/subterm of EXPRESSION passes PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If an expression is transformed into another expression, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\r\nor a subexpression/subterm of EXPRESSION passes PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf an expression is transformed into another expression, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\nor a subexpression/subterm of EXPRESSION passes PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf an expression is transformed into another expression, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static final SubLObject expression_transform_if_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }

    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\r\nor a subexpression/subterm of EXPRESSION passes PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf an expression is transformed into another expression, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\nor a subexpression/subterm of EXPRESSION passes PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf an expression is transformed into another expression, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static SubLObject expression_transform_if(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }/**
     * Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION
     * or a subexpression/subterm of EXPRESSION passes PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If an expression is transformed into another expression, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * A destructive version of @xref expression-transform-if.
     */
    @LispMethod(comment = "A destructive version of @xref expression-transform-if.")
    public static final SubLObject expression_ntransform_if_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }

    @LispMethod(comment = "A destructive version of @xref expression-transform-if.")
    public static SubLObject expression_ntransform_if(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }/**
     * A destructive version of @xref expression-transform-if.
     */


    /**
     * Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA
     * or a subformula/subterm of FORMULA passes PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\r\nor a subformula/subterm of FORMULA passes PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\nor a subformula/subterm of FORMULA passes PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static final SubLObject formula_transform_if_alt(SubLObject formula, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }

    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\r\nor a subformula/subterm of FORMULA passes PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\nor a subformula/subterm of FORMULA passes PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static SubLObject formula_transform_if(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_ntransform_int(copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }/**
     * Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA
     * or a subformula/subterm of FORMULA passes PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * A destructive version of @xref formula-transform-if.
     */
    @LispMethod(comment = "A destructive version of @xref formula-transform-if.")
    public static final SubLObject formula_ntransform_if_alt(SubLObject formula, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }

    @LispMethod(comment = "A destructive version of @xref formula-transform-if.")
    public static SubLObject formula_ntransform_if(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, NIL);
    }/**
     * A destructive version of @xref formula-transform-if.
     */


    /**
     * Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION
     * or a subexpression/subterm of EXPRESSION does not pass PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If an expression is transformed into another expression, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\r\nor a subexpression/subterm of EXPRESSION does not pass PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf an expression is transformed into another expression, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\nor a subexpression/subterm of EXPRESSION does not pass PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf an expression is transformed into another expression, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static final SubLObject expression_transform_if_not_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }

    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\r\nor a subexpression/subterm of EXPRESSION does not pass PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf an expression is transformed into another expression, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION\nor a subexpression/subterm of EXPRESSION does not pass PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf an expression is transformed into another expression, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static SubLObject expression_transform_if_not(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }/**
     * Recursively calls TRANSFORM within the CycL expression EXPRESSION.  If TRANSFORM applied to EXPRESSION
     * or a subexpression/subterm of EXPRESSION does not pass PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If an expression is transformed into another expression, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * A destructive version of @xref expression-transform-if-not.
     */
    @LispMethod(comment = "A destructive version of @xref expression-transform-if-not.")
    public static final SubLObject expression_ntransform_if_not_alt(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }

    @LispMethod(comment = "A destructive version of @xref expression-transform-if-not.")
    public static SubLObject expression_ntransform_if_not(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }/**
     * A destructive version of @xref expression-transform-if-not.
     */


    /**
     * Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA
     * or a subformula/subterm of FORMULA does not pass PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\r\nor a subformula/subterm of FORMULA does not pass PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\nor a subformula/subterm of FORMULA does not pass PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static final SubLObject formula_transform_if_not_alt(SubLObject formula, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }

    @LispMethod(comment = "Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\r\nor a subformula/subterm of FORMULA does not pass PRED,\r\nthat subterm is replaced by the result of TRANSFORM.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA\nor a subformula/subterm of FORMULA does not pass PRED,\nthat subterm is replaced by the result of TRANSFORM.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.  It does not penetrate into HL structures.")
    public static SubLObject formula_transform_if_not(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_ntransform_int(copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }/**
     * Recursively calls TRANSFORM within the CycL formula FORMULA.  If TRANSFORM applied to FORMULA
     * or a subformula/subterm of FORMULA does not pass PRED,
     * that subterm is replaced by the result of TRANSFORM.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if TRANSFORM returns non-failure on the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     * A destructive version of @xref formula-transform-if-not.
     */
    @LispMethod(comment = "A destructive version of @xref formula-transform-if-not.")
    public static final SubLObject formula_ntransform_if_not_alt(SubLObject formula, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }

    @LispMethod(comment = "A destructive version of @xref formula-transform-if-not.")
    public static SubLObject formula_ntransform_if_not(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, T, T);
    }/**
     * A destructive version of @xref formula-transform-if-not.
     */


    /**
     * Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA
     * or a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if PRED applies to the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.
     * If FORMULA is transformed into an #$ist sentence, then we return the possibly new mt
     * of the #$ist sentence.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */
    @LispMethod(comment = "Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\r\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if PRED applies to the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.\r\nIf FORMULA is transformed into an #$ist sentence, then we return the possibly new mt\r\nof the #$ist sentence.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if PRED applies to the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.\nIf FORMULA is transformed into an #$ist sentence, then we return the possibly new mt\nof the #$ist sentence.")
    public static final SubLObject formula_and_mt_transform_alt(SubLObject formula, SubLObject mt, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        formula = com.cyc.cycjava.cycl.cycl_utilities.formula_transform(formula, pred, transform, transform_sequence_variablesP, transformation_limit);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject formula_4 = czer_utilities.unwrap_if_ist(formula, mt);
                SubLObject mt_5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                formula = formula_4;
                mt = mt_5;
            }
            return values(formula, mt);
        }
    }

    @LispMethod(comment = "Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\r\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\r\nIf a formula is transformed into another formula, the result is itself subjected\r\nto the transformation if PRED applies to the result.  Thus one must take care when\r\ncalling this function, to avoid infinite recursion.\r\nIf FORMULA is transformed into an #$ist sentence, then we return the possibly new mt\r\nof the #$ist sentence.\r\n\r\n@throws :transformation-limit-exceeded\nRecursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA\nor a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.\nIf a formula is transformed into another formula, the result is itself subjected\nto the transformation if PRED applies to the result.  Thus one must take care when\ncalling this function, to avoid infinite recursion.\nIf FORMULA is transformed into an #$ist sentence, then we return the possibly new mt\nof the #$ist sentence.")
    public static SubLObject formula_and_mt_transform(SubLObject formula, SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            formula = formula_transform(formula, pred, transform, transform_sequence_variablesP, transformation_limit);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject formula_$4 = czer_utilities.unwrap_if_ist(formula, mt, UNPROVIDED);
        final SubLObject mt_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formula = formula_$4;
        mt = mt_$5;
        return values(formula, mt);
    }/**
     * Recursively tests PRED within the CycL formula FORMULA.  If PRED applies to FORMULA
     * or a subformula/subterm of FORMULA, TRANSFORM is called on that term or formula.
     * If a formula is transformed into another formula, the result is itself subjected
     * to the transformation if PRED applies to the result.  Thus one must take care when
     * calling this function, to avoid infinite recursion.
     * If FORMULA is transformed into an #$ist sentence, then we return the possibly new mt
     * of the #$ist sentence.
     *
     * @throws :transformation-limit-exceeded
     * 		
     */


    /**
     *
     *
     * @unknown formula-and-mt-transform
     */
    @LispMethod(comment = "@unknown formula-and-mt-transform")
    public static final SubLObject formula_and_mt_ntransform_alt(SubLObject formula, SubLObject mt, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        formula = com.cyc.cycjava.cycl.cycl_utilities.formula_ntransform(formula, pred, transform, transform_sequence_variablesP, transformation_limit);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject formula_6 = czer_utilities.unwrap_if_ist(formula, mt);
                SubLObject mt_7 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                formula = formula_6;
                mt = mt_7;
            }
            return values(formula, mt);
        }
    }

    /**
     *
     *
     * @unknown formula-and-mt-transform
     */
    @LispMethod(comment = "@unknown formula-and-mt-transform")
    public static SubLObject formula_and_mt_ntransform(SubLObject formula, SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            formula = formula_ntransform(formula, pred, transform, transform_sequence_variablesP, transformation_limit);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject formula_$6 = czer_utilities.unwrap_if_ist(formula, mt, UNPROVIDED);
        final SubLObject mt_$7 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formula = formula_$6;
        mt = mt_$7;
        return values(formula, mt);
    }

    public static final SubLObject sentence_and_mt_transform_alt(SubLObject sentence, SubLObject mt, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_and_mt_transform(sentence, mt, pred, transform, transform_sequence_variablesP, transformation_limit);
    }

    public static SubLObject sentence_and_mt_transform(final SubLObject sentence, final SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return formula_and_mt_transform(sentence, mt, pred, transform, transform_sequence_variablesP, transformation_limit);
    }

    public static final SubLObject sentence_and_mt_ntransform_alt(SubLObject sentence, SubLObject mt, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_and_mt_ntransform(sentence, mt, pred, transform, transform_sequence_variablesP, transformation_limit);
    }

    public static SubLObject sentence_and_mt_ntransform(final SubLObject sentence, final SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == UNPROVIDED) {
            transform_sequence_variablesP = NIL;
        }
        if (transformation_limit == UNPROVIDED) {
            transformation_limit = $default_transformation_limit$.getGlobalValue();
        }
        return formula_and_mt_ntransform(sentence, mt, pred, transform, transform_sequence_variablesP, transformation_limit);
    }

    /**
     * Replaces free var in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables
     */
    @LispMethod(comment = "Replaces free var in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables")
    public static final SubLObject expression_nsubst_free_vars_int_alt(SubLObject v_new, SubLObject old, SubLObject expression, SubLObject test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != funcall(test, expression, old)) {
                if (NIL != czer_vars.$inside_quote$.getDynamicValue(thread)) {
                    return expression;
                } else {
                    return v_new;
                }
            } else {
                if (NIL == el_formula_p(expression)) {
                    return expression;
                } else {
                    if ((NIL != cycl_grammar.fast_escape_quote_term_p(expression)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(expression))) {
                        {
                            SubLObject result = NIL;
                            {
                                SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                                try {
                                    czer_vars.$inside_quote$.bind(NIL, thread);
                                    if (NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                                        result = com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test);
                                    } else {
                                        result = make_unary_formula(com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(expression), com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test));
                                    }
                                } finally {
                                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return result;
                        }
                    } else {
                        if (NIL != cycl_grammar.fast_quote_term_p(expression)) {
                            {
                                SubLObject result = NIL;
                                {
                                    SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                                    try {
                                        czer_vars.$inside_quote$.bind(T, thread);
                                        result = make_unary_formula($$Quote, com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test));
                                    } finally {
                                        czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                return result;
                            }
                        } else {
                            if ((NIL != expand_subl_fn_p(expression)) && (NIL != subl_promotions.memberP(old, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test, UNPROVIDED))) {
                                return make_binary_formula($$ExpandSubLFn, subst(v_new, old, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test, UNPROVIDED), com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(expression, UNPROVIDED), test));
                            } else {
                                {
                                    SubLObject seqvar = sequence_var(expression, UNPROVIDED);
                                    SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(expression))) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, seqvar, test))) : seqvar;
                                    SubLObject rest_of_expression = NIL;
                                    SubLObject v_term = NIL;
                                    SubLObject argnum = NIL;
                                    for (rest_of_expression = expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                                        if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_arg_wrt_free_varsP(expression, argnum)) {
                                            rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, v_term, test));
                                        }
                                    }
                                    if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_arg_wrt_free_varsP(expression, argnum)) {
                                        rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, v_term, test));
                                    }
                                    rplacd(rest_of_expression, substituted_seqvar);
                                    return expression;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Replaces free var in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables")
    public static SubLObject expression_nsubst_free_vars_int(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall(test, expression, old)) {
            if (NIL != czer_vars.$inside_quote$.getDynamicValue(thread)) {
                return expression;
            }
            return v_new;
        } else {
            if (NIL == el_formula_p(expression)) {
                return expression;
            }
            if ((NIL != cycl_grammar.fast_escape_quote_term_p(expression)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(expression))) {
                SubLObject result = NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind(NIL, thread);
                    if (NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                        result = expression_nsubst_free_vars_int(v_new, old, formula_arg1(expression, UNPROVIDED), test);
                    } else {
                        result = make_unary_formula(formula_arg0(expression), expression_nsubst_free_vars_int(v_new, old, formula_arg1(expression, UNPROVIDED), test));
                    }
                } finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (NIL != cycl_grammar.fast_quote_term_p(expression)) {
                SubLObject result = NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind(T, thread);
                    result = make_unary_formula($$Quote, expression_nsubst_free_vars_int(v_new, old, formula_arg1(expression, UNPROVIDED), test));
                } finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if ((NIL != expand_subl_fn_p(expression)) && (NIL != subl_promotions.memberP(old, formula_arg1(expression, UNPROVIDED), test, UNPROVIDED))) {
                return make_binary_formula($$ExpandSubLFn, subst(v_new, old, formula_arg1(expression, UNPROVIDED), test, UNPROVIDED), expression_nsubst_free_vars_int(v_new, old, formula_arg2(expression, UNPROVIDED), test));
            }
            final SubLObject seqvar = sequence_var(expression, UNPROVIDED);
            final SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == opaque_seqvarP(expression))) ? expression_nsubst_free_vars_int(v_new, old, seqvar, test) : seqvar;
            SubLObject rest_of_expression = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            rest_of_expression = expression;
            v_term = rest_of_expression.first();
            for (argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                if (NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                    rplaca(rest_of_expression, expression_nsubst_free_vars_int(v_new, old, v_term, test));
                }
            }
            if (NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                rplaca(rest_of_expression, expression_nsubst_free_vars_int(v_new, old, v_term, test));
            }
            rplacd(rest_of_expression, substituted_seqvar);
            return expression;
        }
    }/**
     * Replaces free var in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables
     */


    public static final SubLObject expression_nsubst_free_vars_alt(SubLObject v_new, SubLObject old, SubLObject expression, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_free_vars_int(v_new, old, expression, test);
    }

    public static SubLObject expression_nsubst_free_vars(final SubLObject v_new, final SubLObject old, final SubLObject expression, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return expression_nsubst_free_vars_int(v_new, old, expression, test);
    }

    public static final SubLObject expression_nsubst_int_alt(SubLObject v_new, SubLObject old, SubLObject expression, SubLObject test, SubLObject key) {
        if (NIL != funcall(test, funcall(key, expression), old)) {
            return v_new;
        } else {
            if (NIL == el_formula_p(expression)) {
                return expression;
            } else {
                {
                    SubLObject seqvar = sequence_var(expression, UNPROVIDED);
                    SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(expression))) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, seqvar, test, key))) : seqvar;
                    SubLObject rest_of_expression = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    for (rest_of_expression = expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                        if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                            rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, v_term, test, key));
                        }
                    }
                    if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                        rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, v_term, test, key));
                    }
                    rplacd(rest_of_expression, substituted_seqvar);
                    return expression;
                }
            }
        }
    }

    public static SubLObject expression_nsubst_int(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject test, final SubLObject key) {
        if (NIL != funcall(test, funcall(key, expression), old)) {
            return v_new;
        }
        if (NIL == el_formula_p(expression)) {
            return expression;
        }
        final SubLObject seqvar = sequence_var(expression, UNPROVIDED);
        final SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == opaque_seqvarP(expression))) ? expression_nsubst_int(v_new, old, seqvar, test, key) : seqvar;
        SubLObject rest_of_expression = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        rest_of_expression = expression;
        v_term = rest_of_expression.first();
        for (argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
            if (NIL == opaque_argP(expression, argnum)) {
                rplaca(rest_of_expression, expression_nsubst_int(v_new, old, v_term, test, key));
            }
        }
        if (NIL == opaque_argP(expression, argnum)) {
            rplaca(rest_of_expression, expression_nsubst_int(v_new, old, v_term, test, key));
        }
        rplacd(rest_of_expression, substituted_seqvar);
        return expression;
    }

    /**
     * Recursively substitutes NEW for OLD in the CycL expression EXPRESSION.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     * Does not penetrate HL structures.
     */
    @LispMethod(comment = "Recursively substitutes NEW for OLD in the CycL expression EXPRESSION.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\r\nDoes not penetrate HL structures.\nRecursively substitutes NEW for OLD in the CycL expression EXPRESSION.\nSee file-level documentation for explanation of #$ExpandSubLFn.\nDoes not penetrate HL structures.")
    public static final SubLObject expression_subst_alt(SubLObject v_new, SubLObject old, SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, copy_expression(expression), test, key);
    }

    @LispMethod(comment = "Recursively substitutes NEW for OLD in the CycL expression EXPRESSION.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\r\nDoes not penetrate HL structures.\nRecursively substitutes NEW for OLD in the CycL expression EXPRESSION.\nSee file-level documentation for explanation of #$ExpandSubLFn.\nDoes not penetrate HL structures.")
    public static SubLObject expression_subst(final SubLObject v_new, final SubLObject old, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return expression_nsubst_int(v_new, old, copy_expression(expression), test, key);
    }/**
     * Recursively substitutes NEW for OLD in the CycL expression EXPRESSION.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     * Does not penetrate HL structures.
     */


    /**
     * A destructive version of @xref expression-subst.
     */
    @LispMethod(comment = "A destructive version of @xref expression-subst.")
    public static final SubLObject expression_nsubst_alt(SubLObject v_new, SubLObject old, SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, expression, test, key);
    }

    @LispMethod(comment = "A destructive version of @xref expression-subst.")
    public static SubLObject expression_nsubst(final SubLObject v_new, final SubLObject old, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return expression_nsubst_int(v_new, old, expression, test, key);
    }/**
     * A destructive version of @xref expression-subst.
     */


    /**
     * Recursively substitutes NEW for OLD in the EL formula FORMULA.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     * Does not penetrate HL structures.
     */
    @LispMethod(comment = "Recursively substitutes NEW for OLD in the EL formula FORMULA.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\r\nDoes not penetrate HL structures.\nRecursively substitutes NEW for OLD in the EL formula FORMULA.\nSee file-level documentation for explanation of #$ExpandSubLFn.\nDoes not penetrate HL structures.")
    public static final SubLObject formula_subst_alt(SubLObject v_new, SubLObject old, SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, copy_formula(formula), test, key);
    }

    @LispMethod(comment = "Recursively substitutes NEW for OLD in the EL formula FORMULA.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\r\nDoes not penetrate HL structures.\nRecursively substitutes NEW for OLD in the EL formula FORMULA.\nSee file-level documentation for explanation of #$ExpandSubLFn.\nDoes not penetrate HL structures.")
    public static SubLObject formula_subst(final SubLObject v_new, final SubLObject old, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_nsubst_int(v_new, old, copy_formula(formula), test, key);
    }/**
     * Recursively substitutes NEW for OLD in the EL formula FORMULA.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     * Does not penetrate HL structures.
     */


    /**
     * A destructive version of @xref formula-subst.
     */
    @LispMethod(comment = "A destructive version of @xref formula-subst.")
    public static final SubLObject formula_nsubst_alt(SubLObject v_new, SubLObject old, SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsubst_int(v_new, old, formula, test, key);
    }

    @LispMethod(comment = "A destructive version of @xref formula-subst.")
    public static SubLObject formula_nsubst(final SubLObject v_new, final SubLObject old, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_nsubst_int(v_new, old, formula, test, key);
    }/**
     * A destructive version of @xref formula-subst.
     */


    /**
     * Replaces free vars in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables
     */
    @LispMethod(comment = "Replaces free vars in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables")
    public static final SubLObject expression_nsublis_free_vars_int_alt(SubLObject alist, SubLObject expression, SubLObject test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject oldXnew = assoc(expression, alist, test, UNPROVIDED);
                if (NIL != oldXnew) {
                    if (NIL != czer_vars.$inside_quote$.getDynamicValue(thread)) {
                        return expression;
                    } else {
                        return oldXnew.rest();
                    }
                }
            }
            if (NIL == el_formula_p(expression)) {
                return expression;
            } else {
                if ((NIL != cycl_grammar.fast_escape_quote_term_p(expression)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(expression))) {
                    {
                        SubLObject result = NIL;
                        {
                            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                            try {
                                czer_vars.$inside_quote$.bind(NIL, thread);
                                if (NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                                    result = com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test);
                                } else {
                                    result = make_unary_formula(com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(expression), com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test));
                                }
                            } finally {
                                czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return result;
                    }
                } else {
                    if (NIL != cycl_grammar.fast_quote_term_p(expression)) {
                        {
                            SubLObject result = NIL;
                            {
                                SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                                try {
                                    czer_vars.$inside_quote$.bind(T, thread);
                                    result = make_unary_formula($$Quote, com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED), test));
                                } finally {
                                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return result;
                        }
                    } else {
                        if (NIL != expand_subl_fn_p(expression)) {
                            {
                                SubLObject arg1 = com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(expression, UNPROVIDED);
                                SubLObject vars = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(arg1, symbol_function($sym29$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject non_opaque_var_list = NIL;
                                if (NIL != vars) {
                                    {
                                        SubLObject cdolist_list_var = vars;
                                        SubLObject var = NIL;
                                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                            {
                                                SubLObject oldXnew = assoc(var, alist, test, UNPROVIDED);
                                                if (NIL != oldXnew) {
                                                    non_opaque_var_list = cons(oldXnew, non_opaque_var_list);
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != non_opaque_var_list) {
                                        expression = make_binary_formula($$ExpandSubLFn, com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, arg1, test), com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(non_opaque_var_list, com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(expression, UNPROVIDED), test));
                                    }
                                }
                                return expression;
                            }
                        } else {
                            {
                                SubLObject seqvar = sequence_var(expression, UNPROVIDED);
                                SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(expression))) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, seqvar, test))) : seqvar;
                                SubLObject rest_of_expression = NIL;
                                SubLObject v_term = NIL;
                                SubLObject argnum = NIL;
                                for (rest_of_expression = expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                                    if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_arg_wrt_free_varsP(expression, argnum)) {
                                        rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, v_term, test));
                                    }
                                }
                                if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_arg_wrt_free_varsP(expression, argnum)) {
                                    rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, v_term, test));
                                }
                                rplacd(rest_of_expression, substituted_seqvar);
                                return expression;
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Replaces free vars in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables")
    public static SubLObject expression_nsublis_free_vars_int(final SubLObject alist, SubLObject expression, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject oldXnew = assoc(expression, alist, test, UNPROVIDED);
        if (NIL != oldXnew) {
            if (NIL != czer_vars.$inside_quote$.getDynamicValue(thread)) {
                return expression;
            }
            return oldXnew.rest();
        } else {
            if (NIL == el_formula_p(expression)) {
                return expression;
            }
            if ((NIL != cycl_grammar.fast_escape_quote_term_p(expression)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(expression))) {
                SubLObject result = NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind(NIL, thread);
                    if (NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                        result = expression_nsublis_free_vars_int(alist, formula_arg1(expression, UNPROVIDED), test);
                    } else {
                        result = make_unary_formula(formula_arg0(expression), expression_nsublis_free_vars_int(alist, formula_arg1(expression, UNPROVIDED), test));
                    }
                } finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (NIL != cycl_grammar.fast_quote_term_p(expression)) {
                SubLObject result = NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind(T, thread);
                    result = make_unary_formula($$Quote, expression_nsublis_free_vars_int(alist, formula_arg1(expression, UNPROVIDED), test));
                } finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (NIL != expand_subl_fn_p(expression)) {
                final SubLObject arg1 = formula_arg1(expression, UNPROVIDED);
                final SubLObject vars = expression_gather(arg1, symbol_function($sym35$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject non_opaque_var_list = NIL;
                if (NIL != vars) {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject oldXnew2 = assoc(var, alist, test, UNPROVIDED);
                        if (NIL != oldXnew2) {
                            non_opaque_var_list = cons(oldXnew2, non_opaque_var_list);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        var = cdolist_list_var.first();
                    } 
                    if (NIL != non_opaque_var_list) {
                        expression = make_binary_formula($$ExpandSubLFn, expression_nsublis_free_vars_int(alist, arg1, test), expression_nsublis_free_vars_int(non_opaque_var_list, formula_arg2(expression, UNPROVIDED), test));
                    }
                }
                return expression;
            }
            final SubLObject seqvar = sequence_var(expression, UNPROVIDED);
            final SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == opaque_seqvarP(expression))) ? expression_nsublis_free_vars_int(alist, seqvar, test) : seqvar;
            SubLObject rest_of_expression = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            rest_of_expression = expression;
            v_term = rest_of_expression.first();
            for (argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                if (NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                    rplaca(rest_of_expression, expression_nsublis_free_vars_int(alist, v_term, test));
                }
            }
            if (NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                rplaca(rest_of_expression, expression_nsublis_free_vars_int(alist, v_term, test));
            }
            rplacd(rest_of_expression, substituted_seqvar);
            return expression;
        }
    }/**
     * Replaces free vars in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables
     */


    public static final SubLObject expression_nsublis_free_vars_alt(SubLObject alist, SubLObject expression, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_free_vars_int(alist, expression, test);
    }

    public static SubLObject expression_nsublis_free_vars(final SubLObject alist, final SubLObject expression, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return expression_nsublis_free_vars_int(alist, expression, test);
    }

    public static final SubLObject expression_nsublis_int_alt(SubLObject alist, SubLObject expression, SubLObject test, SubLObject key) {
        {
            SubLObject oldXnew = assoc(funcall(key, expression), alist, test, UNPROVIDED);
            if (NIL != oldXnew) {
                return oldXnew.rest();
            }
        }
        if (NIL == el_formula_p(expression)) {
            return expression;
        } else {
            {
                SubLObject seqvar = sequence_var(expression, UNPROVIDED);
                SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_seqvarP(expression))) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, seqvar, test, key))) : seqvar;
                SubLObject rest_of_expression = NIL;
                SubLObject v_term = NIL;
                SubLObject argnum = NIL;
                for (rest_of_expression = expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
                    if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                        rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, v_term, test, key));
                    }
                }
                if (NIL == com.cyc.cycjava.cycl.cycl_utilities.opaque_argP(expression, argnum)) {
                    rplaca(rest_of_expression, com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, v_term, test, key));
                }
                rplacd(rest_of_expression, substituted_seqvar);
                return expression;
            }
        }
    }

    public static SubLObject expression_nsublis_int(final SubLObject alist, final SubLObject expression, final SubLObject test, final SubLObject key) {
        final SubLObject oldXnew = assoc(funcall(key, expression), alist, test, UNPROVIDED);
        if (NIL != oldXnew) {
            return oldXnew.rest();
        }
        if (NIL == el_formula_p(expression)) {
            return expression;
        }
        final SubLObject seqvar = sequence_var(expression, UNPROVIDED);
        final SubLObject substituted_seqvar = ((NIL != seqvar) && (NIL == opaque_seqvarP(expression))) ? expression_nsublis_int(alist, seqvar, test, key) : seqvar;
        SubLObject rest_of_expression = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        rest_of_expression = expression;
        v_term = rest_of_expression.first();
        for (argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest() , v_term = rest_of_expression.first() , argnum = add(ONE_INTEGER, argnum)) {
            if (NIL == opaque_argP(expression, argnum)) {
                rplaca(rest_of_expression, expression_nsublis_int(alist, v_term, test, key));
            }
        }
        if (NIL == opaque_argP(expression, argnum)) {
            rplaca(rest_of_expression, expression_nsublis_int(alist, v_term, test, key));
        }
        rplacd(rest_of_expression, substituted_seqvar);
        return expression;
    }

    /**
     * Recursively substitutes the cars of ALIST for the cdrs of ALIST in the CycL expression EXPRESSION.
     * An object is either substituted once or recursed into, but not both.
     * Does not penetrate HL structures.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     */
    @LispMethod(comment = "Recursively substitutes the cars of ALIST for the cdrs of ALIST in the CycL expression EXPRESSION.\r\nAn object is either substituted once or recursed into, but not both.\r\nDoes not penetrate HL structures.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\nRecursively substitutes the cars of ALIST for the cdrs of ALIST in the CycL expression EXPRESSION.\nAn object is either substituted once or recursed into, but not both.\nDoes not penetrate HL structures.\nSee file-level documentation for explanation of #$ExpandSubLFn.")
    public static final SubLObject expression_sublis_alt(SubLObject alist, SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, copy_expression(expression), test, key);
    }

    @LispMethod(comment = "Recursively substitutes the cars of ALIST for the cdrs of ALIST in the CycL expression EXPRESSION.\r\nAn object is either substituted once or recursed into, but not both.\r\nDoes not penetrate HL structures.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\nRecursively substitutes the cars of ALIST for the cdrs of ALIST in the CycL expression EXPRESSION.\nAn object is either substituted once or recursed into, but not both.\nDoes not penetrate HL structures.\nSee file-level documentation for explanation of #$ExpandSubLFn.")
    public static SubLObject expression_sublis(final SubLObject alist, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return expression_nsublis_int(alist, copy_expression(expression), test, key);
    }/**
     * Recursively substitutes the cars of ALIST for the cdrs of ALIST in the CycL expression EXPRESSION.
     * An object is either substituted once or recursed into, but not both.
     * Does not penetrate HL structures.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     */


    /**
     * A destructive version of @xref expression-sublis.
     */
    @LispMethod(comment = "A destructive version of @xref expression-sublis.")
    public static final SubLObject expression_nsublis_alt(SubLObject alist, SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, expression, test, key);
    }

    @LispMethod(comment = "A destructive version of @xref expression-sublis.")
    public static SubLObject expression_nsublis(final SubLObject alist, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return expression_nsublis_int(alist, expression, test, key);
    }/**
     * A destructive version of @xref expression-sublis.
     */


    /**
     * Recursively substitutes the cars of ALIST for the cdrs of ALIST in the EL formula FORMULA.
     * An object is either substituted once or recursed into, but not both.
     * Does not penetrate HL structures.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     */
    @LispMethod(comment = "Recursively substitutes the cars of ALIST for the cdrs of ALIST in the EL formula FORMULA.\r\nAn object is either substituted once or recursed into, but not both.\r\nDoes not penetrate HL structures.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\nRecursively substitutes the cars of ALIST for the cdrs of ALIST in the EL formula FORMULA.\nAn object is either substituted once or recursed into, but not both.\nDoes not penetrate HL structures.\nSee file-level documentation for explanation of #$ExpandSubLFn.")
    public static final SubLObject formula_sublis_alt(SubLObject alist, SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, copy_formula(formula), test, key);
    }

    @LispMethod(comment = "Recursively substitutes the cars of ALIST for the cdrs of ALIST in the EL formula FORMULA.\r\nAn object is either substituted once or recursed into, but not both.\r\nDoes not penetrate HL structures.\r\nSee file-level documentation for explanation of #$ExpandSubLFn.\nRecursively substitutes the cars of ALIST for the cdrs of ALIST in the EL formula FORMULA.\nAn object is either substituted once or recursed into, but not both.\nDoes not penetrate HL structures.\nSee file-level documentation for explanation of #$ExpandSubLFn.")
    public static SubLObject formula_sublis(final SubLObject alist, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_nsublis_int(alist, copy_formula(formula), test, key);
    }/**
     * Recursively substitutes the cars of ALIST for the cdrs of ALIST in the EL formula FORMULA.
     * An object is either substituted once or recursed into, but not both.
     * Does not penetrate HL structures.
     * See file-level documentation for explanation of #$ExpandSubLFn.
     */


    /**
     * A destructive version of @xref formula-sublis.
     */
    @LispMethod(comment = "A destructive version of @xref formula-sublis.")
    public static final SubLObject formula_nsublis_alt(SubLObject alist, SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_int(alist, formula, test, key);
    }

    @LispMethod(comment = "A destructive version of @xref formula-sublis.")
    public static SubLObject formula_nsublis(final SubLObject alist, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return expression_nsublis_int(alist, formula, test, key);
    }/**
     * A destructive version of @xref formula-sublis.
     */


    /**
     * Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with
     * the variables in EL-VARIABLES, respectively.
     */
    @LispMethod(comment = "Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\r\nthe variables in EL-VARIABLES, respectively.\nSubstitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\nthe variables in EL-VARIABLES, respectively.")
    public static final SubLObject expression_nsublis_el_variables_alt(SubLObject expression, SubLObject el_variables) {
        {
            SubLObject alist = NIL;
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject n = NIL;
            for (list_var = el_variables, el_var = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , n = add(ONE_INTEGER, n)) {
                {
                    SubLObject variable = variables.find_variable_by_id(n);
                    alist = cons(cons(variable, el_var), alist);
                }
            }
            return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\r\nthe variables in EL-VARIABLES, respectively.\nSubstitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\nthe variables in EL-VARIABLES, respectively.")
    public static SubLObject expression_nsublis_el_variables(final SubLObject expression, final SubLObject el_variables) {
        SubLObject alist = NIL;
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject n = NIL;
        list_var = el_variables;
        el_var = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , n = add(ONE_INTEGER, n)) {
            final SubLObject variable = variables.find_variable_by_id(n);
            alist = cons(cons(variable, el_var), alist);
        }
        return expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED);
    }/**
     * Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with
     * the variables in EL-VARIABLES, respectively.
     */


    /**
     * Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with
     * the variables in EL-VARIABLES, respectively.
     */
    @LispMethod(comment = "Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\r\nthe variables in EL-VARIABLES, respectively.\nSubstitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\nthe variables in EL-VARIABLES, respectively.")
    public static final SubLObject expression_sublis_el_variables_alt(SubLObject expression, SubLObject el_variables) {
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_el_variables(copy_expression(expression), el_variables);
    }

    @LispMethod(comment = "Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\r\nthe variables in EL-VARIABLES, respectively.\nSubstitutes HL variables 0 through (- (length EL-VARIABLES) 1) with\nthe variables in EL-VARIABLES, respectively.")
    public static SubLObject expression_sublis_el_variables(final SubLObject expression, final SubLObject el_variables) {
        return expression_nsublis_el_variables(copy_expression(expression), el_variables);
    }/**
     * Substitutes HL variables 0 through (- (length EL-VARIABLES) 1) with
     * the variables in EL-VARIABLES, respectively.
     */


    /**
     * Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.
     *
     * @return 0 -- the modified version of EXPRESSION, with HL variables.
     * @return 1 -- an association list mapping the EL variables to the HL variables that replaced them.
     */
    @LispMethod(comment = "Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.\r\n\r\n@return 0 -- the modified version of EXPRESSION, with HL variables.\r\n@return 1 -- an association list mapping the EL variables to the HL variables that replaced them.")
    public static final SubLObject expression_nsublis_hl_variables_alt(SubLObject expression) {
        {
            SubLObject alist = NIL;
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject n = NIL;
            for (list_var = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, $sym30$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), el_var = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , n = add(ONE_INTEGER, n)) {
                {
                    SubLObject variable = variables.find_variable_by_id(n);
                    alist = list_utilities.alist_enter(alist, el_var, variable, UNPROVIDED);
                }
            }
            return values(com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED), alist);
        }
    }

    @LispMethod(comment = "Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.\r\n\r\n@return 0 -- the modified version of EXPRESSION, with HL variables.\r\n@return 1 -- an association list mapping the EL variables to the HL variables that replaced them.")
    public static SubLObject expression_nsublis_hl_variables(final SubLObject expression) {
        SubLObject alist = NIL;
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject n = NIL;
        list_var = expression_gather(expression, $sym36$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        el_var = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , n = add(ONE_INTEGER, n)) {
            final SubLObject variable = variables.find_variable_by_id(n);
            alist = list_utilities.alist_enter(alist, el_var, variable, UNPROVIDED);
        }
        return values(expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED), alist);
    }/**
     * Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.
     *
     * @return 0 -- the modified version of EXPRESSION, with HL variables.
     * @return 1 -- an association list mapping the EL variables to the HL variables that replaced them.
     */


    /**
     * Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.
     *
     * @return 0 -- the modified version of EXPRESSION, with HL variables.
     * @return 1 -- an association list mapping the EL variables to the HL variables that replaced them.
     */
    @LispMethod(comment = "Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.\r\n\r\n@return 0 -- the modified version of EXPRESSION, with HL variables.\r\n@return 1 -- an association list mapping the EL variables to the HL variables that replaced them.")
    public static final SubLObject expression_sublis_hl_variables_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_hl_variables(copy_expression(expression));
    }

    @LispMethod(comment = "Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.\r\n\r\n@return 0 -- the modified version of EXPRESSION, with HL variables.\r\n@return 1 -- an association list mapping the EL variables to the HL variables that replaced them.")
    public static SubLObject expression_sublis_hl_variables(final SubLObject expression) {
        return expression_nsublis_hl_variables(copy_expression(expression));
    }/**
     * Substitutes HL variables starting with 0 for the variables in EL-VARIABLES.
     *
     * @return 0 -- the modified version of EXPRESSION, with HL variables.
     * @return 1 -- an association list mapping the EL variables to the HL variables that replaced them.
     */


    public static final SubLObject cnf_nsublis_el_variables_alt(SubLObject cnf, SubLObject el_variables) {
        return com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis_el_variables(cnf, el_variables);
    }

    public static SubLObject cnf_nsublis_el_variables(final SubLObject cnf, final SubLObject el_variables) {
        return expression_nsublis_el_variables(cnf, el_variables);
    }

    public static final SubLObject cnf_sublis_el_variables_alt(SubLObject cnf, SubLObject el_variables) {
        return com.cyc.cycjava.cycl.cycl_utilities.expression_sublis_el_variables(cnf, el_variables);
    }

    public static SubLObject cnf_sublis_el_variables(final SubLObject cnf, final SubLObject el_variables) {
        return expression_sublis_el_variables(cnf, el_variables);
    }

    /**
     * Non-destructively substitute a term in a formula at a given arg-position.
     */
    @LispMethod(comment = "Non-destructively substitute a term in a formula at a given arg-position.")
    public static final SubLObject formula_arg_position_subst_alt(SubLObject new_term, SubLObject arg_position, SubLObject formula) {
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position_nsubst(new_term, arg_position, copy_expression(formula));
    }

    @LispMethod(comment = "Non-destructively substitute a term in a formula at a given arg-position.")
    public static SubLObject formula_arg_position_subst(final SubLObject new_term, final SubLObject arg_position, final SubLObject formula) {
        return formula_arg_position_nsubst(new_term, arg_position, copy_expression(formula));
    }/**
     * Non-destructively substitute a term in a formula at a given arg-position.
     */


    /**
     * Destructively substitute a term in a formula at a given arg-position.
     */
    @LispMethod(comment = "Destructively substitute a term in a formula at a given arg-position.")
    public static final SubLObject formula_arg_position_nsubst_alt(SubLObject new_term, SubLObject arg_position, SubLObject formula) {
        if (NIL == arg_position) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(arg_position)) {
                return nreplace_formula_arg(arg_position.first(), new_term, formula);
            } else {
                com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position_nsubst(new_term, arg_position.rest(), com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, arg_position.first(), UNPROVIDED));
                return formula;
            }
        }
    }

    @LispMethod(comment = "Destructively substitute a term in a formula at a given arg-position.")
    public static SubLObject formula_arg_position_nsubst(final SubLObject new_term, final SubLObject arg_position, final SubLObject formula) {
        if (NIL == arg_position) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(arg_position)) {
            return nreplace_formula_arg(arg_position.first(), new_term, formula);
        }
        formula_arg_position_nsubst(new_term, arg_position.rest(), formula_arg(formula, arg_position.first(), UNPROVIDED));
        return formula;
    }/**
     * Destructively substitute a term in a formula at a given arg-position.
     */


    /**
     * Result is destructible
     */
    @LispMethod(comment = "Result is destructible")
    public static final SubLObject permute_formula_alt(SubLObject source_formula, SubLObject argnums_to_permute, SubLObject argnum_permutation) {
        {
            SubLObject target_formula = copy_formula(source_formula);
            SubLObject list_var = NIL;
            SubLObject target_argnum = NIL;
            SubLObject index = NIL;
            for (list_var = argnum_permutation, target_argnum = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , target_argnum = list_var.first() , index = add(ONE_INTEGER, index)) {
                {
                    SubLObject source_argnum = nth(index, argnums_to_permute);
                    SubLObject target_term = com.cyc.cycjava.cycl.cycl_utilities.formula_arg(source_formula, source_argnum, UNPROVIDED);
                    target_formula = nreplace_formula_arg(target_argnum, target_term, target_formula);
                }
            }
            return target_formula;
        }
    }

    @LispMethod(comment = "Result is destructible")
    public static SubLObject permute_formula(final SubLObject source_formula, final SubLObject argnums_to_permute, final SubLObject argnum_permutation) {
        SubLObject target_formula = copy_formula(source_formula);
        SubLObject list_var = NIL;
        SubLObject target_argnum = NIL;
        SubLObject index = NIL;
        list_var = argnum_permutation;
        target_argnum = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , target_argnum = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject source_argnum = nth(index, argnums_to_permute);
            final SubLObject target_term = formula_arg(source_formula, source_argnum, UNPROVIDED);
            target_formula = nreplace_formula_arg(target_argnum, target_term, target_formula);
        }
        return target_formula;
    }/**
     * Result is destructible
     */


    /**
     * Result is destructible
     */
    @LispMethod(comment = "Result is destructible")
    public static final SubLObject formula_permutations_alt(SubLObject source_formula, SubLObject argnums_to_permute) {
        {
            SubLObject target_formulas = NIL;
            SubLObject argnum_permutations = com.cyc.cycjava.cycl.cycl_utilities.permute_list_cached(argnums_to_permute);
            SubLObject cdolist_list_var = argnum_permutations;
            SubLObject argnum_permutation = NIL;
            for (argnum_permutation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum_permutation = cdolist_list_var.first()) {
                {
                    SubLObject target_formula = com.cyc.cycjava.cycl.cycl_utilities.permute_formula(source_formula, argnums_to_permute, argnum_permutation);
                    target_formulas = cons(target_formula, target_formulas);
                }
            }
            return nreverse(target_formulas);
        }
    }

    @LispMethod(comment = "Result is destructible")
    public static SubLObject formula_permutations(final SubLObject source_formula, final SubLObject argnums_to_permute) {
        SubLObject target_formulas = NIL;
        SubLObject cdolist_list_var;
        final SubLObject argnum_permutations = cdolist_list_var = permute_list_cached(argnums_to_permute);
        SubLObject argnum_permutation = NIL;
        argnum_permutation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject target_formula = permute_formula(source_formula, argnums_to_permute, argnum_permutation);
            target_formulas = cons(target_formula, target_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            argnum_permutation = cdolist_list_var.first();
        } 
        return nreverse(target_formulas);
    }/**
     * Result is destructible
     */


    /**
     * Result is destructible
     */
    @LispMethod(comment = "Result is destructible")
    public static final SubLObject formulas_permutations_alt(SubLObject source_formulas, SubLObject argnums_to_permute) {
        {
            SubLObject target_formulas = NIL;
            SubLObject cdolist_list_var = source_formulas;
            SubLObject source_formula = NIL;
            for (source_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , source_formula = cdolist_list_var.first()) {
                target_formulas = nconc(com.cyc.cycjava.cycl.cycl_utilities.formula_permutations(source_formula, argnums_to_permute), target_formulas);
            }
            return delete_duplicates(target_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Result is destructible")
    public static SubLObject formulas_permutations(final SubLObject source_formulas, final SubLObject argnums_to_permute) {
        SubLObject target_formulas = NIL;
        SubLObject cdolist_list_var = source_formulas;
        SubLObject source_formula = NIL;
        source_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            target_formulas = nconc(formula_permutations(source_formula, argnums_to_permute), target_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            source_formula = cdolist_list_var.first();
        } 
        return delete_duplicates(target_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Result is destructible
     */


    /**
     * Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.
     */
    @LispMethod(comment = "Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.")
    public static final SubLObject formula_arg_permutations_alt(SubLObject source_formula) {
        {
            SubLObject target_formulas = list(copy_formula(source_formula));
            SubLObject argnum = ZERO_INTEGER;
            SubLObject args = com.cyc.cycjava.cycl.cycl_utilities.formula_args(source_formula, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL != subl_escape_p(arg)) {
                } else {
                    if (NIL != nautP(arg, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var_8 = com.cyc.cycjava.cycl.cycl_utilities.nat_commutative_permutations(arg);
                            SubLObject arg_permutation = NIL;
                            for (arg_permutation = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , arg_permutation = cdolist_list_var_8.first()) {
                                if (!arg_permutation.equal(arg)) {
                                    target_formulas = cons(nreplace_formula_arg(argnum, arg_permutation, copy_formula(source_formula)), target_formulas);
                                }
                            }
                        }
                    } else {
                        if (NIL != el_relation_expressionP(arg)) {
                            {
                                SubLObject cdolist_list_var_9 = com.cyc.cycjava.cycl.cycl_utilities.formula_commutative_permutations(arg, T);
                                SubLObject formula_permutation = NIL;
                                for (formula_permutation = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , formula_permutation = cdolist_list_var_9.first()) {
                                    if (!formula_permutation.equal(arg)) {
                                        target_formulas = cons(nreplace_formula_arg(argnum, formula_permutation, copy_formula(source_formula)), target_formulas);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return target_formulas;
        }
    }

    @LispMethod(comment = "Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.")
    public static SubLObject formula_arg_permutations(final SubLObject source_formula) {
        SubLObject target_formulas = list(copy_formula(source_formula));
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(source_formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (NIL == subl_escape_p(arg)) {
                if (NIL != term.nautP(arg, UNPROVIDED)) {
                    SubLObject cdolist_list_var_$8 = nat_commutative_permutations(arg);
                    SubLObject arg_permutation = NIL;
                    arg_permutation = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        if (!arg_permutation.equal(arg)) {
                            target_formulas = cons(nreplace_formula_arg(argnum, arg_permutation, copy_formula(source_formula)), target_formulas);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        arg_permutation = cdolist_list_var_$8.first();
                    } 
                } else
                    if (NIL != el_relation_expressionP(arg)) {
                        SubLObject cdolist_list_var_$9 = formula_commutative_permutations(arg, T);
                        SubLObject formula_permutation = NIL;
                        formula_permutation = cdolist_list_var_$9.first();
                        while (NIL != cdolist_list_var_$9) {
                            if (!formula_permutation.equal(arg)) {
                                target_formulas = cons(nreplace_formula_arg(argnum, formula_permutation, copy_formula(source_formula)), target_formulas);
                            }
                            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                            formula_permutation = cdolist_list_var_$9.first();
                        } 
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return target_formulas;
    }/**
     * Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.
     */


    public static final SubLObject nat_commutative_permutations_alt(SubLObject nat) {
        {
            SubLObject permutations = NIL;
            SubLObject function = com.cyc.cycjava.cycl.cycl_utilities.nat_functor(nat);
            if (NIL != czer_main.unary_function_commutes_with_its_argumentP(nat)) {
                {
                    SubLObject inner_func = com.cyc.cycjava.cycl.cycl_utilities.nat_functor(com.cyc.cycjava.cycl.cycl_utilities.nat_arg1(nat, UNPROVIDED));
                    SubLObject arg = com.cyc.cycjava.cycl.cycl_utilities.nat_arg1(com.cyc.cycjava.cycl.cycl_utilities.nat_arg1(nat, UNPROVIDED), UNPROVIDED);
                    permutations = cons(nat, permutations);
                    permutations = cons(make_unary_nat_formula(inner_func, make_unary_nat_formula(function, arg)), permutations);
                }
            } else {
                if ((NIL != kb_accessors.commutative_functionP(function)) || (NIL != fort_types_interface.partially_commutative_relation_p(function))) {
                    permutations = com.cyc.cycjava.cycl.cycl_utilities.formula_commutative_permutations(nat, T);
                }
            }
            return permutations;
        }
    }

    public static SubLObject nat_commutative_permutations(final SubLObject nat) {
        SubLObject permutations = NIL;
        final SubLObject function = nat_functor(nat);
        if (NIL != czer_main.unary_function_commutes_with_its_argumentP(nat)) {
            final SubLObject inner_func = nat_functor(nat_arg1(nat, UNPROVIDED));
            final SubLObject arg = nat_arg1(nat_arg1(nat, UNPROVIDED), UNPROVIDED);
            permutations = cons(nat, permutations);
            permutations = cons(make_unary_nat_formula(inner_func, make_unary_nat_formula(function, arg)), permutations);
        } else
            if ((NIL != kb_accessors.commutative_functionP(function)) || (NIL != fort_types_interface.partially_commutative_relation_p(function))) {
                permutations = formula_commutative_permutations(nat, T);
            }

        return permutations;
    }

    public static final SubLObject clear_permute_list_cached_alt() {
        {
            SubLObject cs = $permute_list_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_permute_list_cached() {
        final SubLObject cs = $permute_list_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_permute_list_cached_alt(SubLObject list) {
        return memoization_state.caching_state_remove_function_results_with_args($permute_list_cached_caching_state$.getGlobalValue(), list(list), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_permute_list_cached(final SubLObject list) {
        return memoization_state.caching_state_remove_function_results_with_args($permute_list_cached_caching_state$.getGlobalValue(), list(list), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject permute_list_cached_internal_alt(SubLObject list) {
        return list_utilities.permute_list(list, UNPROVIDED);
    }

    public static SubLObject permute_list_cached_internal(final SubLObject list) {
        return list_utilities.permute_list(list, UNPROVIDED);
    }

    public static final SubLObject permute_list_cached_alt(SubLObject list) {
        {
            SubLObject caching_state = $permute_list_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PERMUTE_LIST_CACHED, $permute_list_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, list, $kw33$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw33$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cycl_utilities.permute_list_cached_internal(list)));
                    memoization_state.caching_state_put(caching_state, list, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject permute_list_cached(final SubLObject list) {
        SubLObject caching_state = $permute_list_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PERMUTE_LIST_CACHED, $permute_list_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, list, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(permute_list_cached_internal(list)));
            memoization_state.caching_state_put(caching_state, list, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * It's done this way so it can handle all permutations of something like a
     * predicate which is commutative in args 1 and 2, and in args 3 and 4, but not
     * all four args.
     */
    @LispMethod(comment = "It\'s done this way so it can handle all permutations of something like a\r\npredicate which is commutative in args 1 and 2, and in args 3 and 4, but not\r\nall four args.\nIt\'s done this way so it can handle all permutations of something like a\npredicate which is commutative in args 1 and 2, and in args 3 and 4, but not\nall four args.")
    public static final SubLObject formula_commutative_permutations_alt(SubLObject formula, SubLObject penetrate_argsP) {
        if (penetrate_argsP == UNPROVIDED) {
            penetrate_argsP = NIL;
        }
        {
            SubLObject target_formulas = (NIL != penetrate_argsP) ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.formula_arg_permutations(formula))) : list(formula);
            SubLObject cdolist_list_var = czer_main.commutative_argnums(formula);
            SubLObject argnums_to_permute = NIL;
            for (argnums_to_permute = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnums_to_permute = cdolist_list_var.first()) {
                target_formulas = com.cyc.cycjava.cycl.cycl_utilities.formulas_permutations(target_formulas, argnums_to_permute);
            }
            return nreverse(target_formulas);
        }
    }

    @LispMethod(comment = "It\'s done this way so it can handle all permutations of something like a\r\npredicate which is commutative in args 1 and 2, and in args 3 and 4, but not\r\nall four args.\nIt\'s done this way so it can handle all permutations of something like a\npredicate which is commutative in args 1 and 2, and in args 3 and 4, but not\nall four args.")
    public static SubLObject formula_commutative_permutations(final SubLObject formula, SubLObject penetrate_argsP) {
        if (penetrate_argsP == UNPROVIDED) {
            penetrate_argsP = NIL;
        }
        SubLObject target_formulas = (NIL != penetrate_argsP) ? formula_arg_permutations(formula) : list(formula);
        SubLObject cdolist_list_var = czer_main.commutative_argnums(formula);
        SubLObject argnums_to_permute = NIL;
        argnums_to_permute = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            target_formulas = formulas_permutations(target_formulas, argnums_to_permute);
            cdolist_list_var = cdolist_list_var.rest();
            argnums_to_permute = cdolist_list_var.first();
        } 
        return nreverse(target_formulas);
    }/**
     * It's done this way so it can handle all permutations of something like a
     * predicate which is commutative in args 1 and 2, and in args 3 and 4, but not
     * all four args.
     */


    /**
     * Return the permutations of the formula that can be possibly canonical.  For fully bound formula, it returns the formula.  For non fully-bound formula, it return the permutations of the variable arg with the other args in canonical order. Doesn't permute sequence vars.
     */
    @LispMethod(comment = "Return the permutations of the formula that can be possibly canonical.  For fully bound formula, it returns the formula.  For non fully-bound formula, it return the permutations of the variable arg with the other args in canonical order. Doesn\'t permute sequence vars.")
    public static final SubLObject canonical_commutative_permutations_alt(SubLObject formula, SubLObject varP, SubLObject penetrate_argsP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym29$CYC_VAR_);
        }
        if (penetrate_argsP == UNPROVIDED) {
            penetrate_argsP = NIL;
        }
        if (NIL != groundP(formula, varP)) {
            return list(czer_main.canonicalize_literal_commutative_terms(formula));
        }
        {
            SubLObject variable_argnums = com.cyc.cycjava.cycl.cycl_utilities.variable_argnums(formula, varP);
            SubLObject target_formulas = NIL;
            if ((NIL == penetrate_argsP) && (NIL == variable_argnums)) {
                target_formulas = list(czer_main.canonicalize_literal_commutative_args(formula));
                return target_formulas;
            } else {
                if ((NIL != penetrate_argsP) && (NIL == variable_argnums)) {
                    target_formulas = com.cyc.cycjava.cycl.cycl_utilities.args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
                    return nreverse(target_formulas);
                } else {
                    if ((NIL != penetrate_argsP) && (NIL != variable_argnums)) {
                        target_formulas = com.cyc.cycjava.cycl.cycl_utilities.args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
                    } else {
                        target_formulas = list(czer_main.canonicalize_literal_commutative_args(formula));
                    }
                }
            }
            target_formulas = com.cyc.cycjava.cycl.cycl_utilities.formulas_canonical_permutations(target_formulas);
            return nreverse(target_formulas);
        }
    }

    @LispMethod(comment = "Return the permutations of the formula that can be possibly canonical.  For fully bound formula, it returns the formula.  For non fully-bound formula, it return the permutations of the variable arg with the other args in canonical order. Doesn\'t permute sequence vars.")
    public static SubLObject canonical_commutative_permutations(final SubLObject formula, SubLObject varP, SubLObject penetrate_argsP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym35$CYC_VAR_);
        }
        if (penetrate_argsP == UNPROVIDED) {
            penetrate_argsP = NIL;
        }
        if (NIL != groundP(formula, varP)) {
            return list(czer_main.canonicalize_literal_commutative_terms(formula));
        }
        final SubLObject variable_argnums = variable_argnums(formula, varP);
        SubLObject target_formulas = NIL;
        if ((NIL == penetrate_argsP) && (NIL == variable_argnums)) {
            target_formulas = list(czer_main.canonicalize_literal_commutative_args(formula));
            return target_formulas;
        }
        if ((NIL != penetrate_argsP) && (NIL == variable_argnums)) {
            target_formulas = args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
            return nreverse(target_formulas);
        }
        if ((NIL != penetrate_argsP) && (NIL != variable_argnums)) {
            target_formulas = args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
        } else {
            target_formulas = list(czer_main.canonicalize_literal_commutative_args(formula));
        }
        target_formulas = formulas_canonical_permutations(target_formulas);
        return nreverse(target_formulas);
    }/**
     * Return the permutations of the formula that can be possibly canonical.  For fully bound formula, it returns the formula.  For non fully-bound formula, it return the permutations of the variable arg with the other args in canonical order. Doesn't permute sequence vars.
     */


    public static final SubLObject variable_argnums_alt(SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym29$CYC_VAR_);
        }
        if (NIL != groundP(formula, varP)) {
            return NIL;
        }
        {
            SubLObject argnums = NIL;
            SubLObject argnum = ZERO_INTEGER;
            SubLObject args = com.cyc.cycjava.cycl.cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL != funcall(varP, arg)) {
                    argnums = cons(argnum, argnums);
                }
            }
            return argnums;
        }
    }

    public static SubLObject variable_argnums(final SubLObject formula, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym35$CYC_VAR_);
        }
        if (NIL != groundP(formula, varP)) {
            return NIL;
        }
        SubLObject argnums = NIL;
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (NIL != funcall(varP, arg)) {
                argnums = cons(argnum, argnums);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return argnums;
    }

    /**
     * Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.
     */
    @LispMethod(comment = "Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.")
    public static final SubLObject args_canonical_commutative_permutations_alt(SubLObject formula, SubLObject varP) {
        {
            SubLObject target_formulas = list(copy_formula(formula));
            SubLObject argnum = ZERO_INTEGER;
            SubLObject args = com.cyc.cycjava.cycl.cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL != subl_escape_p(arg)) {
                } else {
                    if (NIL != nautP(arg, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var_10 = com.cyc.cycjava.cycl.cycl_utilities.nat_canonical_commutative_permutations(arg, varP);
                            SubLObject arg_permutation = NIL;
                            for (arg_permutation = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , arg_permutation = cdolist_list_var_10.first()) {
                                if (!arg_permutation.equal(arg)) {
                                    target_formulas = cons(nreplace_formula_arg(argnum, arg_permutation, copy_formula(formula)), target_formulas);
                                }
                            }
                        }
                    } else {
                        if (NIL != el_relation_expressionP(arg)) {
                            {
                                SubLObject cdolist_list_var_11 = com.cyc.cycjava.cycl.cycl_utilities.canonical_commutative_permutations(arg, varP, T);
                                SubLObject formula_permutation = NIL;
                                for (formula_permutation = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , formula_permutation = cdolist_list_var_11.first()) {
                                    if (!formula_permutation.equal(arg)) {
                                        target_formulas = cons(nreplace_formula_arg(argnum, formula_permutation, copy_formula(formula)), target_formulas);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return target_formulas;
        }
    }

    @LispMethod(comment = "Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.")
    public static SubLObject args_canonical_commutative_permutations(final SubLObject formula, final SubLObject varP) {
        SubLObject target_formulas = list(copy_formula(formula));
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            if (NIL == subl_escape_p(arg)) {
                if (NIL != term.nautP(arg, varP)) {
                    SubLObject cdolist_list_var_$10 = nat_canonical_commutative_permutations(arg, varP);
                    SubLObject arg_permutation = NIL;
                    arg_permutation = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        if (!arg_permutation.equal(arg)) {
                            target_formulas = cons(nreplace_formula_arg(argnum, arg_permutation, copy_formula(formula)), target_formulas);
                        }
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        arg_permutation = cdolist_list_var_$10.first();
                    } 
                } else
                    if (NIL != el_relation_expressionP(arg)) {
                        SubLObject cdolist_list_var_$11 = canonical_commutative_permutations(arg, varP, T);
                        SubLObject formula_permutation = NIL;
                        formula_permutation = cdolist_list_var_$11.first();
                        while (NIL != cdolist_list_var_$11) {
                            if (!formula_permutation.equal(arg)) {
                                target_formulas = cons(nreplace_formula_arg(argnum, formula_permutation, copy_formula(formula)), target_formulas);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            formula_permutation = cdolist_list_var_$11.first();
                        } 
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return target_formulas;
    }/**
     * Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated.
     */


    public static final SubLObject formulas_canonical_permutations_alt(SubLObject source_formulas) {
        {
            SubLObject target_formulas = NIL;
            SubLObject permutedP = NIL;
            SubLObject cdolist_list_var = source_formulas;
            SubLObject source_formula = NIL;
            for (source_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , source_formula = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_12 = czer_main.commutative_argnums(source_formula);
                    SubLObject commutative_argnums = NIL;
                    for (commutative_argnums = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , commutative_argnums = cdolist_list_var_12.first()) {
                        {
                            SubLObject variable_argnums = com.cyc.cycjava.cycl.cycl_utilities.variable_argnums(source_formula, UNPROVIDED);
                            SubLObject argnums_to_permute = keyhash_utilities.fast_intersection(commutative_argnums, variable_argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject other_argnums = NIL;
                            SubLObject argnum_permutations = NIL;
                            if (NIL != argnums_to_permute) {
                                other_argnums = nreverse(set_difference(commutative_argnums, argnums_to_permute, UNPROVIDED, UNPROVIDED));
                                argnum_permutations = com.cyc.cycjava.cycl.cycl_utilities.permutations_merge(other_argnums, argnums_to_permute);
                                permutedP = T;
                                {
                                    SubLObject cdolist_list_var_13 = argnum_permutations;
                                    SubLObject argnum_permutation = NIL;
                                    for (argnum_permutation = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , argnum_permutation = cdolist_list_var_13.first()) {
                                        target_formulas = cons(com.cyc.cycjava.cycl.cycl_utilities.canonical_permute_formula(source_formula, commutative_argnums, argnum_permutation), target_formulas);
                                    }
                                }
                            } else {
                                target_formulas = cons(source_formula, target_formulas);
                            }
                        }
                    }
                }
            }
            if (NIL != permutedP) {
                return delete_duplicates(target_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                return source_formulas;
            }
        }
    }

    public static SubLObject formulas_canonical_permutations(final SubLObject source_formulas) {
        SubLObject target_formulas = NIL;
        SubLObject permutedP = NIL;
        SubLObject cdolist_list_var = source_formulas;
        SubLObject source_formula = NIL;
        source_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = czer_main.commutative_argnums(source_formula);
            SubLObject commutative_argnums = NIL;
            commutative_argnums = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                final SubLObject variable_argnums = variable_argnums(source_formula, UNPROVIDED);
                final SubLObject argnums_to_permute = keyhash_utilities.fast_intersection(commutative_argnums, variable_argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject other_argnums = NIL;
                SubLObject argnum_permutations = NIL;
                if (NIL != argnums_to_permute) {
                    other_argnums = nreverse(set_difference(commutative_argnums, argnums_to_permute, UNPROVIDED, UNPROVIDED));
                    argnum_permutations = permutations_merge(other_argnums, argnums_to_permute);
                    permutedP = T;
                    SubLObject cdolist_list_var_$13 = argnum_permutations;
                    SubLObject argnum_permutation = NIL;
                    argnum_permutation = cdolist_list_var_$13.first();
                    while (NIL != cdolist_list_var_$13) {
                        target_formulas = cons(canonical_permute_formula(source_formula, commutative_argnums, argnum_permutation), target_formulas);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        argnum_permutation = cdolist_list_var_$13.first();
                    } 
                } else {
                    target_formulas = cons(source_formula, target_formulas);
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                commutative_argnums = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            source_formula = cdolist_list_var.first();
        } 
        if (NIL != permutedP) {
            return delete_duplicates(target_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return source_formulas;
    }

    /**
     * Result is destructible
     */
    @LispMethod(comment = "Result is destructible")
    public static final SubLObject canonical_permute_formula_alt(SubLObject source_formula, SubLObject argnums_to_permute, SubLObject argnum_permutation) {
        {
            SubLObject target_formula = copy_formula(source_formula);
            SubLObject list_var = NIL;
            SubLObject source_argnum = NIL;
            SubLObject index = NIL;
            for (list_var = argnum_permutation, source_argnum = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , source_argnum = list_var.first() , index = add(ONE_INTEGER, index)) {
                {
                    SubLObject target_argnum = nth(index, argnums_to_permute);
                    if (target_argnum != source_argnum) {
                        {
                            SubLObject target_term = com.cyc.cycjava.cycl.cycl_utilities.formula_arg(source_formula, source_argnum, UNPROVIDED);
                            target_formula = nreplace_formula_arg(target_argnum, target_term, target_formula);
                        }
                    }
                }
            }
            return target_formula;
        }
    }

    @LispMethod(comment = "Result is destructible")
    public static SubLObject canonical_permute_formula(final SubLObject source_formula, final SubLObject argnums_to_permute, final SubLObject argnum_permutation) {
        SubLObject target_formula = copy_formula(source_formula);
        SubLObject list_var = NIL;
        SubLObject source_argnum = NIL;
        SubLObject index = NIL;
        list_var = argnum_permutation;
        source_argnum = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , source_argnum = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject target_argnum = nth(index, argnums_to_permute);
            if (!target_argnum.eql(source_argnum)) {
                final SubLObject target_term = formula_arg(source_formula, source_argnum, UNPROVIDED);
                target_formula = nreplace_formula_arg(target_argnum, target_term, target_formula);
            }
        }
        return target_formula;
    }/**
     * Result is destructible
     */


    public static final SubLObject nat_canonical_commutative_permutations_alt(SubLObject nat, SubLObject varP) {
        {
            SubLObject permutations = NIL;
            SubLObject function = com.cyc.cycjava.cycl.cycl_utilities.nat_functor(nat);
            if ((NIL != kb_accessors.commutative_functionP(function)) || (NIL != fort_types_interface.partially_commutative_relation_p(function))) {
                permutations = com.cyc.cycjava.cycl.cycl_utilities.canonical_commutative_permutations(nat, varP, UNPROVIDED);
            }
            return permutations;
        }
    }

    public static SubLObject nat_canonical_commutative_permutations(final SubLObject nat, final SubLObject varP) {
        SubLObject permutations = NIL;
        final SubLObject function = nat_functor(nat);
        if ((NIL != kb_accessors.commutative_functionP(function)) || (NIL != fort_types_interface.partially_commutative_relation_p(function))) {
            permutations = canonical_commutative_permutations(nat, varP, UNPROVIDED);
        }
        return permutations;
    }

    public static final SubLObject split_list_set_alt(SubLObject l) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject splits = list(bq_cons(l, $list_alt34));
                SubLObject length = length(l);
                SubLObject end_var = length;
                SubLObject i = NIL;
                for (i = ONE_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject list1 = list_utilities.split_list(l, i);
                        SubLObject list2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        splits = cons(list(list1, list2), splits);
                    }
                }
                return splits;
            }
        }
    }

    public static SubLObject split_list_set(final SubLObject l) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject splits = list(bq_cons(l, $list39));
        SubLObject end_var;
        SubLObject length;
        SubLObject i;
        SubLObject list1;
        SubLObject list2;
        for (length = end_var = length(l), i = NIL, i = ONE_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
            thread.resetMultipleValues();
            list1 = list_utilities.split_list(l, i);
            list2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            splits = cons(list(list1, list2), splits);
        }
        return splits;
    }

    public static final SubLObject permutations_merge_alt(SubLObject list1, SubLObject list2) {
        {
            SubLObject merged = NIL;
            SubLObject permutations = list_utilities.permute_list(list2, UNPROVIDED);
            SubLObject list1_splits = com.cyc.cycjava.cycl.cycl_utilities.split_list_set(list1);
            SubLObject cdolist_list_var = list1_splits;
            SubLObject list1_split = NIL;
            for (list1_split = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , list1_split = cdolist_list_var.first()) {
                {
                    SubLObject datum = list1_split;
                    SubLObject current = datum;
                    SubLObject front1 = NIL;
                    SubLObject rest1 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    front1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    rest1 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject cdolist_list_var_14 = permutations;
                            SubLObject permutation = NIL;
                            for (permutation = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , permutation = cdolist_list_var_14.first()) {
                                {
                                    SubLObject list2_splits = com.cyc.cycjava.cycl.cycl_utilities.split_list_set(permutation);
                                    SubLObject cdolist_list_var_15 = list2_splits;
                                    SubLObject list2_split = NIL;
                                    for (list2_split = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , list2_split = cdolist_list_var_15.first()) {
                                        {
                                            SubLObject datum_16 = list2_split;
                                            SubLObject current_17 = datum_16;
                                            SubLObject front2 = NIL;
                                            SubLObject rest2 = NIL;
                                            destructuring_bind_must_consp(current_17, datum_16, $list_alt36);
                                            front2 = current_17.first();
                                            current_17 = current_17.rest();
                                            destructuring_bind_must_consp(current_17, datum_16, $list_alt36);
                                            rest2 = current_17.first();
                                            current_17 = current_17.rest();
                                            if (NIL == current_17) {
                                                merged = cons(append(front1, front2, rest1, rest2), merged);
                                                merged = cons(append(front2, front1, rest2, rest1), merged);
                                            } else {
                                                cdestructuring_bind_error(datum_16, $list_alt36);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt35);
                    }
                }
            }
            return delete_duplicates(merged, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject permutations_merge(final SubLObject list1, final SubLObject list2) {
        SubLObject merged = NIL;
        final SubLObject permutations = list_utilities.permute_list(list2, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject list1_splits = cdolist_list_var = split_list_set(list1);
        SubLObject list1_split = NIL;
        list1_split = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = list1_split;
            SubLObject front1 = NIL;
            SubLObject rest1 = NIL;
            destructuring_bind_must_consp(current, datum, $list40);
            front1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list40);
            rest1 = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$14 = permutations;
                SubLObject permutation = NIL;
                permutation = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    SubLObject cdolist_list_var_$15;
                    final SubLObject list2_splits = cdolist_list_var_$15 = split_list_set(permutation);
                    SubLObject list2_split = NIL;
                    list2_split = cdolist_list_var_$15.first();
                    while (NIL != cdolist_list_var_$15) {
                        SubLObject current_$17;
                        final SubLObject datum_$16 = current_$17 = list2_split;
                        SubLObject front2 = NIL;
                        SubLObject rest2 = NIL;
                        destructuring_bind_must_consp(current_$17, datum_$16, $list41);
                        front2 = current_$17.first();
                        current_$17 = current_$17.rest();
                        destructuring_bind_must_consp(current_$17, datum_$16, $list41);
                        rest2 = current_$17.first();
                        current_$17 = current_$17.rest();
                        if (NIL == current_$17) {
                            merged = cons(append(front1, front2, rest1, rest2), merged);
                            merged = cons(append(front2, front1, rest2, rest1), merged);
                        } else {
                            cdestructuring_bind_error(datum_$16, $list41);
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        list2_split = cdolist_list_var_$15.first();
                    } 
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    permutation = cdolist_list_var_$14.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list40);
            }
            cdolist_list_var = cdolist_list_var.rest();
            list1_split = cdolist_list_var.first();
        } 
        return delete_duplicates(merged, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Finds the first reified term in the operator position in the EL formula FORMULA.
     */
    @LispMethod(comment = "Finds the first reified term in the operator position in the EL formula FORMULA.")
    public static final SubLObject formula_operator_recursive_alt(SubLObject formula) {
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        {
            SubLObject result = com.cyc.cycjava.cycl.cycl_utilities.formula_operator(formula);
            if (NIL != forts.fort_p(result)) {
                return result;
            } else {
                if (NIL != el_formula_p(result)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.formula_operator(result);
                } else {
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "Finds the first reified term in the operator position in the EL formula FORMULA.")
    public static SubLObject formula_operator_recursive(final SubLObject formula) {
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        final SubLObject result = formula_operator(formula);
        if (NIL != forts.fort_p(result)) {
            return result;
        }
        if (NIL != el_formula_p(result)) {
            return formula_operator(result);
        }
        return NIL;
    }/**
     * Finds the first reified term in the operator position in the EL formula FORMULA.
     */


    /**
     * renames all default EL variables in EXPRESSION.
     */
    @LispMethod(comment = "renames all default EL variables in EXPRESSION.")
    public static final SubLObject rename_default_el_vars_int_alt(SubLObject expression, SubLObject destructiveP) {
        {
            SubLObject default_el_vars = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function($sym37$DEFAULT_EL_VAR_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject already_renamed_default_el_vars = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function(RENAMED_DEFAULT_EL_VAR_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject max_renamed_default_el_var_num = list_utilities.safe_max(already_renamed_default_el_vars, MINUS_ONE_INTEGER);
            SubLObject curr_renamed_default_el_var_num = number_utilities.f_1X(max_renamed_default_el_var_num);
            SubLObject alist = NIL;
            SubLObject cdolist_list_var = default_el_vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                alist = cons(cons(var, com.cyc.cycjava.cycl.cycl_utilities.get_renamed_default_el_var(curr_renamed_default_el_var_num)), alist);
                curr_renamed_default_el_var_num = add(curr_renamed_default_el_var_num, ONE_INTEGER);
            }
            return NIL != destructiveP ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED))) : com.cyc.cycjava.cycl.cycl_utilities.expression_sublis(alist, expression, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "renames all default EL variables in EXPRESSION.")
    public static SubLObject rename_default_el_vars_int(final SubLObject expression, final SubLObject destructiveP) {
        final SubLObject default_el_vars = clausifier.sort_vars(expression_gather(expression, symbol_function($sym42$DEFAULT_EL_VAR_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject already_renamed_default_el_vars = clausifier.sort_vars(expression_gather(expression, symbol_function(RENAMED_DEFAULT_EL_VAR_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject max_renamed_default_el_var_num = list_utilities.safe_max(already_renamed_default_el_vars, MINUS_ONE_INTEGER);
        SubLObject curr_renamed_default_el_var_num = number_utilities.f_1X(max_renamed_default_el_var_num);
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = default_el_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            alist = cons(cons(var, get_renamed_default_el_var(curr_renamed_default_el_var_num)), alist);
            curr_renamed_default_el_var_num = add(curr_renamed_default_el_var_num, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return NIL != destructiveP ? expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED) : expression_sublis(alist, expression, UNPROVIDED, UNPROVIDED);
    }/**
     * renames all default EL variables in EXPRESSION.
     */


    /**
     * renames all default EL variables in EXPRESSION.
     */
    @LispMethod(comment = "renames all default EL variables in EXPRESSION.")
    public static final SubLObject rename_default_el_vars_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.rename_default_el_vars_int(expression, NIL);
    }

    @LispMethod(comment = "renames all default EL variables in EXPRESSION.")
    public static SubLObject rename_default_el_vars(final SubLObject expression) {
        return rename_default_el_vars_int(expression, NIL);
    }/**
     * renames all default EL variables in EXPRESSION.
     */


    /**
     * A destructive version of @xref rename-default-el-vars.
     */
    @LispMethod(comment = "A destructive version of @xref rename-default-el-vars.")
    public static final SubLObject rename_default_el_vars_destructive_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.rename_default_el_vars_int(expression, T);
    }

    @LispMethod(comment = "A destructive version of @xref rename-default-el-vars.")
    public static SubLObject rename_default_el_vars_destructive(final SubLObject expression) {
        return rename_default_el_vars_int(expression, T);
    }/**
     * A destructive version of @xref rename-default-el-vars.
     */


    /**
     * changes all renamed default EL variables in EXPRESSION back into regular default EL variables.
     */
    @LispMethod(comment = "changes all renamed default EL variables in EXPRESSION back into regular default EL variables.")
    public static final SubLObject unrename_default_el_vars_int_alt(SubLObject expression, SubLObject destructiveP) {
        {
            SubLObject renamed_default_el_vars = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function(RENAMED_DEFAULT_EL_VAR_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject default_el_vars = com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function($sym37$DEFAULT_EL_VAR_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject max_default_el_var_num = list_utilities.safe_max(default_el_vars, MINUS_ONE_INTEGER);
            SubLObject curr_default_el_var_num = number_utilities.f_1X(max_default_el_var_num);
            SubLObject alist = NIL;
            SubLObject cdolist_list_var = renamed_default_el_vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                alist = cons(cons(var, variables.get_default_el_var(curr_default_el_var_num)), alist);
                curr_default_el_var_num = add(curr_default_el_var_num, ONE_INTEGER);
            }
            return NIL != destructiveP ? ((SubLObject) (com.cyc.cycjava.cycl.cycl_utilities.expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED))) : com.cyc.cycjava.cycl.cycl_utilities.expression_sublis(alist, expression, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "changes all renamed default EL variables in EXPRESSION back into regular default EL variables.")
    public static SubLObject unrename_default_el_vars_int(final SubLObject expression, final SubLObject destructiveP) {
        final SubLObject renamed_default_el_vars = clausifier.sort_vars(expression_gather(expression, symbol_function(RENAMED_DEFAULT_EL_VAR_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject default_el_vars = clausifier.sort_vars(expression_gather(expression, symbol_function($sym42$DEFAULT_EL_VAR_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject max_default_el_var_num = list_utilities.safe_max(default_el_vars, MINUS_ONE_INTEGER);
        SubLObject curr_default_el_var_num = number_utilities.f_1X(max_default_el_var_num);
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = renamed_default_el_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            alist = cons(cons(var, variables.get_default_el_var(curr_default_el_var_num)), alist);
            curr_default_el_var_num = add(curr_default_el_var_num, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return NIL != destructiveP ? expression_nsublis(alist, expression, UNPROVIDED, UNPROVIDED) : expression_sublis(alist, expression, UNPROVIDED, UNPROVIDED);
    }/**
     * changes all renamed default EL variables in EXPRESSION back into regular default EL variables.
     */


    /**
     * changes all renamed default EL variables in EXPRESSION back into regular default EL variables.
     */
    @LispMethod(comment = "changes all renamed default EL variables in EXPRESSION back into regular default EL variables.")
    public static final SubLObject unrename_default_el_vars_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.unrename_default_el_vars_int(expression, NIL);
    }

    @LispMethod(comment = "changes all renamed default EL variables in EXPRESSION back into regular default EL variables.")
    public static SubLObject unrename_default_el_vars(final SubLObject expression) {
        return unrename_default_el_vars_int(expression, NIL);
    }/**
     * changes all renamed default EL variables in EXPRESSION back into regular default EL variables.
     */


    /**
     * A destructive version of @xref unrename-default-el-vars.
     */
    @LispMethod(comment = "A destructive version of @xref unrename-default-el-vars.")
    public static final SubLObject unrename_default_el_vars_destructive_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.unrename_default_el_vars_int(expression, T);
    }

    @LispMethod(comment = "A destructive version of @xref unrename-default-el-vars.")
    public static SubLObject unrename_default_el_vars_destructive(final SubLObject expression) {
        return unrename_default_el_vars_int(expression, T);
    }/**
     * A destructive version of @xref unrename-default-el-vars.
     */


    /**
     * returns nil if OBJECT is not a renamed default el var, otherwise an integer
     */
    @LispMethod(comment = "returns nil if OBJECT is not a renamed default el var, otherwise an integer")
    public static final SubLObject renamed_default_el_var_num_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycl_variables.el_varP(v_object)) {
                {
                    SubLObject name = cycl_variables.el_var_name(v_object);
                    if (name.isString() && (NIL != string_utilities.starts_with(name, $renamed_default_el_var_prefix$.getDynamicValue(thread)))) {
                        {
                            SubLObject tail = string_utilities.substring(name, length($renamed_default_el_var_prefix$.getDynamicValue(thread)), UNPROVIDED);
                            return string_utilities.string_to_integer(tail);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "returns nil if OBJECT is not a renamed default el var, otherwise an integer")
    public static SubLObject renamed_default_el_var_num(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_variables.el_varP(v_object)) {
            final SubLObject name = cycl_variables.el_var_name(v_object);
            if (name.isString() && (NIL != string_utilities.starts_with(name, $renamed_default_el_var_prefix$.getDynamicValue(thread)))) {
                final SubLObject tail = string_utilities.substring(name, length($renamed_default_el_var_prefix$.getDynamicValue(thread)), UNPROVIDED);
                return string_utilities.string_to_integer(tail);
            }
        }
        return NIL;
    }/**
     * returns nil if OBJECT is not a renamed default el var, otherwise an integer
     */


    /**
     *
     *
     * @return boolean; t iff OBJECT is a renamed default el var
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a renamed default el var")
    public static final SubLObject renamed_default_el_var_p_alt(SubLObject v_object) {
        return integerp(com.cyc.cycjava.cycl.cycl_utilities.renamed_default_el_var_num(v_object));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a renamed default el var
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a renamed default el var")
    public static SubLObject renamed_default_el_var_p(final SubLObject v_object) {
        return integerp(renamed_default_el_var_num(v_object));
    }

    public static final SubLObject get_renamed_default_el_var_alt(SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cycl_variables.make_el_var(cconcatenate($renamed_default_el_var_prefix$.getDynamicValue(thread), string_utilities.object_to_string(num)));
        }
    }

    public static SubLObject get_renamed_default_el_var(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_variables.make_el_var(cconcatenate($renamed_default_el_var_prefix$.getDynamicValue(thread), string_utilities.object_to_string(num)));
    }

    /**
     *
     *
     * @return boolean; t iff FORT has no indexing maintained for it.  Does not include EL Relations.
     */
    @LispMethod(comment = "@return boolean; t iff FORT has no indexing maintained for it.  Does not include EL Relations.")
    public static final SubLObject non_indexed_fort_p_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        return subl_promotions.memberP(fort, $non_indexed_constants$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff FORT has no indexing maintained for it.  Does not include EL Relations.
     */
    @LispMethod(comment = "@return boolean; t iff FORT has no indexing maintained for it.  Does not include EL Relations.")
    public static SubLObject non_indexed_fort_p(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return subl_promotions.memberP(fort, $non_indexed_constants$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED);
    }

    /**
     *
     *
     * @unknown does not admit second-order nauts.  @see naut?
     */
    @LispMethod(comment = "@unknown does not admit second-order nauts.  @see naut?")
    public static final SubLObject fort_or_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || ((NIL != possibly_naut_p(v_object)) && (NIL != fort_types_interface.functorP(com.cyc.cycjava.cycl.cycl_utilities.nat_functor(v_object)))));
    }

    /**
     *
     *
     * @unknown does not admit second-order nauts.  @see naut?
     */
    @LispMethod(comment = "@unknown does not admit second-order nauts.  @see naut?")
    public static SubLObject fort_or_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || ((NIL != possibly_naut_p(v_object)) && (NIL != fort_types_interface.functorP(nat_functor(v_object)))));
    }

    public static final SubLObject fort_or_possibly_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != possibly_naut_p(v_object)));
    }

    public static SubLObject fort_or_possibly_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != possibly_naut_p(v_object)));
    }

    public static SubLObject naut_substitute(final SubLObject v_object) {
        return expression_transform(v_object, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject collection_intersection_natP_alt(SubLObject v_object) {
        if (NIL != cycl_grammar.cycl_nat_p(v_object)) {
            {
                SubLObject functor = com.cyc.cycjava.cycl.cycl_utilities.nat_functor(v_object);
                return makeBoolean((functor == $$CollectionIntersectionFn) || (functor == $$CollectionIntersection2Fn));
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject collection_intersection_natP(final SubLObject v_object) {
        if (NIL != cycl_grammar.cycl_nat_p(v_object)) {
            final SubLObject functor = nat_functor(v_object);
            return makeBoolean(functor.eql($$CollectionIntersectionFn) || functor.eql($$CollectionIntersection2Fn));
        }
        return NIL;
    }

    public static final SubLObject collection_union_natP_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && (com.cyc.cycjava.cycl.cycl_utilities.nat_functor(v_object) == $$CollectionUnionFn));
    }

    public static SubLObject collection_union_natP(final SubLObject v_object) {
        return cycl_nat_with_functor_p(v_object, $$CollectionUnionFn);
    }

    /**
     * Returns a unique CycL collection which is the intersection of all
     * collections in COLLECTIONS, NIL if COLLECTIONS is the empty list.
     */
    @LispMethod(comment = "Returns a unique CycL collection which is the intersection of all\r\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.\nReturns a unique CycL collection which is the intersection of all\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.")
    public static final SubLObject collection_intersection_alt(SubLObject collections) {
        {
            SubLObject pcase_var = length(collections);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return NIL;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return collections.first();
                } else {
                    return list($$CollectionIntersectionFn, cons($$TheSet, collections));
                }
            }
        }
    }

    @LispMethod(comment = "Returns a unique CycL collection which is the intersection of all\r\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.\nReturns a unique CycL collection which is the intersection of all\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.")
    public static SubLObject collection_intersection(final SubLObject collections) {
        final SubLObject pcase_var = length(collections);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return collections.first();
        }
        return list($$CollectionIntersectionFn, cons($$TheSet, collections));
    }/**
     * Returns a unique CycL collection which is the intersection of all
     * collections in COLLECTIONS, NIL if COLLECTIONS is the empty list.
     */


    /**
     * Returns a unique CycL collection which is the union of all
     * collections in COLLECTIONS, NIL if COLLECTIONS is the empty list.
     */
    @LispMethod(comment = "Returns a unique CycL collection which is the union of all\r\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.\nReturns a unique CycL collection which is the union of all\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.")
    public static final SubLObject collection_union_alt(SubLObject collections) {
        {
            SubLObject pcase_var = length(collections);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return NIL;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return collections.first();
                } else {
                    return list($$CollectionUnionFn, cons($$TheSet, collections));
                }
            }
        }
    }

    @LispMethod(comment = "Returns a unique CycL collection which is the union of all\r\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.\nReturns a unique CycL collection which is the union of all\ncollections in COLLECTIONS, NIL if COLLECTIONS is the empty list.")
    public static SubLObject collection_union(final SubLObject collections) {
        final SubLObject pcase_var = length(collections);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return collections.first();
        }
        return list($$CollectionUnionFn, cons($$TheSet, collections));
    }/**
     * Returns a unique CycL collection which is the union of all
     * collections in COLLECTIONS, NIL if COLLECTIONS is the empty list.
     */


    /**
     *
     *
     * @return listp; the collections that are intersected to form COLLECTION-INTERSECTION-NAT
     */
    @LispMethod(comment = "@return listp; the collections that are intersected to form COLLECTION-INTERSECTION-NAT")
    public static final SubLObject collection_intersection_intersectees_alt(SubLObject collection_intersection_nat) {
        SubLTrampolineFile.checkType(collection_intersection_nat, $sym44$COLLECTION_INTERSECTION_NAT_);
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.cycl_utilities.nat_functor(collection_intersection_nat);
            if (pcase_var.eql($$CollectionIntersectionFn)) {
                return quantities.set_extent(com.cyc.cycjava.cycl.cycl_utilities.nat_arg1(collection_intersection_nat, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else {
                if (pcase_var.eql($$CollectionIntersection2Fn)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.nat_args(collection_intersection_nat, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the collections that are intersected to form COLLECTION-INTERSECTION-NAT
     */
    @LispMethod(comment = "@return listp; the collections that are intersected to form COLLECTION-INTERSECTION-NAT")
    public static SubLObject collection_intersection_intersectees(final SubLObject collection_intersection_nat) {
        assert NIL != collection_intersection_natP(collection_intersection_nat) : "! cycl_utilities.collection_intersection_natP(collection_intersection_nat) " + ("cycl_utilities.collection_intersection_natP(collection_intersection_nat) " + "CommonSymbols.NIL != cycl_utilities.collection_intersection_natP(collection_intersection_nat) ") + collection_intersection_nat;
        final SubLObject pcase_var = nat_functor(collection_intersection_nat);
        if (pcase_var.eql($$CollectionIntersectionFn)) {
            return quantities.set_extent(nat_arg1(collection_intersection_nat, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($$CollectionIntersection2Fn)) {
            return nat_args(collection_intersection_nat, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the collections that are united to form COLLECTION-UNION-NAT
     */
    @LispMethod(comment = "@return listp; the collections that are united to form COLLECTION-UNION-NAT")
    public static final SubLObject collection_union_united_collections_alt(SubLObject collection_union_nat) {
        SubLTrampolineFile.checkType(collection_union_nat, $sym45$COLLECTION_UNION_NAT_);
        return quantities.set_extent(com.cyc.cycjava.cycl.cycl_utilities.nat_arg1(collection_union_nat, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the collections that are united to form COLLECTION-UNION-NAT
     */
    @LispMethod(comment = "@return listp; the collections that are united to form COLLECTION-UNION-NAT")
    public static SubLObject collection_union_united_collections(final SubLObject collection_union_nat) {
        assert NIL != collection_union_natP(collection_union_nat) : "! cycl_utilities.collection_union_natP(collection_union_nat) " + ("cycl_utilities.collection_union_natP(collection_union_nat) " + "CommonSymbols.NIL != cycl_utilities.collection_union_natP(collection_union_nat) ") + collection_union_nat;
        return quantities.set_extent(nat_arg1(collection_union_nat, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_denotational_term(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return NIL;
        }
        if (NIL != constants_high.find_constant(string)) {
            return constants_high.find_constant(string);
        }
        final SubLObject _prev_bind_0 = $read_eval$.currentBinding(thread);
        try {
            $read_eval$.bind(NIL, thread);
            final SubLObject clipped_string = (NIL != list_utilities.lengthG(string, $int$5000, UNPROVIDED)) ? subseq(string, ZERO_INTEGER, $int$5000) : string;
            final SubLObject v_term = read_from_string_ignoring_errors(string_utilities.cyclify_string(clipped_string), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject denotational_term = (NIL != cycl_grammar.cycl_denotational_term_p(v_term)) ? czer_main.canonicalize_term(v_term, UNPROVIDED) : NIL;
            return denotational_term;
        } finally {
            $read_eval$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject denotational_term_name(final SubLObject cycl) {
        if (NIL != constant_p(cycl)) {
            return constants_high.constant_name(cycl);
        }
        if (NIL != nart_handles.nart_p(cycl)) {
            return string_utilities.string_substitute($str55$, $str56$__, string_utilities.object_to_string(narts_high.nart_el_formula(cycl)), UNPROVIDED);
        }
        if (NIL != narts_high.naut_p(cycl)) {
            return string_utilities.string_substitute($str55$, $str56$__, string_utilities.object_to_string(cycl), UNPROVIDED);
        }
        return string_utilities.object_to_string(cycl);
    }

    public static SubLObject denotational_term_name_for_alpha_sort(final SubLObject value) {
        return string_utilities.do_string_substitutions_robust(denotational_term_name(value), $list57, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the constants in EXPRESSION, sorted by constant id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the constants in EXPRESSION, sorted by constant id.")
    public static final SubLObject sorted_constant_list_alt(SubLObject expression) {
        return Sort.sort(com.cyc.cycjava.cycl.cycl_utilities.constant_list(expression, NIL), symbol_function($sym46$CONSTANT_EXTERNAL_ID__), UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the constants in EXPRESSION, sorted by constant id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the constants in EXPRESSION, sorted by constant id.")
    public static SubLObject sorted_constant_list(final SubLObject expression) {
        return Sort.sort(constant_list(expression, NIL), symbol_function($sym58$CONSTANT_EXTERNAL_ID__), UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the external constant ids in EXPRESSION, sorted by constant id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the external constant ids in EXPRESSION, sorted by constant id.")
    public static final SubLObject sorted_constant_external_id_list_alt(SubLObject expression) {
        return Sort.sort(Mapping.mapcar(symbol_function(CONSTANT_EXTERNAL_ID), com.cyc.cycjava.cycl.cycl_utilities.constant_list(expression, NIL)), symbol_function($sym48$_), UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the external constant ids in EXPRESSION, sorted by constant id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the external constant ids in EXPRESSION, sorted by constant id.")
    public static SubLObject sorted_constant_external_id_list(final SubLObject expression) {
        return Sort.sort(Mapping.mapcar(symbol_function(CONSTANT_EXTERNAL_ID), constant_list(expression, NIL)), symbol_function($sym60$GUID_), UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the internal constant ids in EXPRESSION, sorted by constant id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the internal constant ids in EXPRESSION, sorted by constant id.")
    public static final SubLObject sorted_constant_internal_id_list_alt(SubLObject expression) {
        return Sort.sort(Mapping.mapcar(symbol_function(CONSTANT_INTERNAL_ID), com.cyc.cycjava.cycl.cycl_utilities.constant_list(expression, NIL)), symbol_function($sym48$_), UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the internal constant ids in EXPRESSION, sorted by constant id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the internal constant ids in EXPRESSION, sorted by constant id.")
    public static SubLObject sorted_constant_internal_id_list(final SubLObject expression) {
        return Sort.sort(Mapping.mapcar(symbol_function(CONSTANT_INTERNAL_ID), constant_list(expression, NIL)), symbol_function($sym62$_), UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the constants in EXPRESSION.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the constants in EXPRESSION.")
    public static final SubLObject constant_list_alt(SubLObject expression, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function(CONSTANT_P), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the constants in EXPRESSION.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the constants in EXPRESSION.")
    public static SubLObject constant_list(final SubLObject expression, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = T;
        }
        return expression_gather(expression, symbol_function(CONSTANT_P), penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the nats in EXPRESSION, sorted by nat id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the nats in EXPRESSION, sorted by nat id.")
    public static final SubLObject sorted_nat_list_alt(SubLObject expression) {
        return Sort.sort(com.cyc.cycjava.cycl.cycl_utilities.nat_list(expression), symbol_function($sym48$_), symbol_function(NART_ID));
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the nats in EXPRESSION, sorted by nat id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the nats in EXPRESSION, sorted by nat id.")
    public static SubLObject sorted_nat_list(final SubLObject expression) {
        return Sort.sort(nat_list(expression), symbol_function($sym62$_), symbol_function(NART_ID));
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the nats in EXPRESSION.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the nats in EXPRESSION.")
    public static final SubLObject nat_list_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function(NART_P), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the nats in EXPRESSION.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the nats in EXPRESSION.")
    public static SubLObject nat_list(final SubLObject expression) {
        return expression_gather(expression, symbol_function(NART_P), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the assertions in EXPRESSION, sorted by assertion id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the assertions in EXPRESSION, sorted by assertion id.")
    public static final SubLObject sorted_assertion_list_alt(SubLObject expression) {
        return Sort.sort(com.cyc.cycjava.cycl.cycl_utilities.assertion_list(expression), symbol_function($sym48$_), symbol_function(ASSERTION_ID));
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the assertions in EXPRESSION, sorted by assertion id.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the assertions in EXPRESSION, sorted by assertion id.")
    public static SubLObject sorted_assertion_list(final SubLObject expression) {
        return assertion_utilities.sort_assertions(assertion_list(expression));
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the assertions in EXPRESSION.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the assertions in EXPRESSION.")
    public static final SubLObject assertion_list_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.cycl_utilities.expression_gather(expression, symbol_function(ASSERTION_P), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list (without duplicates) of all the assertions in EXPRESSION.
     */
    @LispMethod(comment = "@return list; a list (without duplicates) of all the assertions in EXPRESSION.")
    public static SubLObject assertion_list(final SubLObject expression) {
        return expression_gather(expression, symbol_function(ASSERTION_P), T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this does not penetrate HL structures like the above functions do.
     */
    @LispMethod(comment = "@unknown this does not penetrate HL structures like the above functions do.")
    public static final SubLObject sorted_fort_id_list_alt(SubLObject expression) {
        return Sort.sort(Mapping.mapcar(symbol_function(FORT_INTERNAL_ID), list_utilities.tree_gather(expression, symbol_function(FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED)), symbol_function($sym48$_), UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this does not penetrate HL structures like the above functions do.
     */
    @LispMethod(comment = "@unknown this does not penetrate HL structures like the above functions do.")
    public static SubLObject sorted_fort_id_list(final SubLObject expression) {
        return Sort.sort(Mapping.mapcar(symbol_function(FORT_INTERNAL_ID), list_utilities.tree_gather(expression, symbol_function(FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED)), symbol_function($sym62$_), UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEANP non-NIL iff PRED is functional in some argument.
     */
    @LispMethod(comment = "@return BOOLEANP non-NIL iff PRED is functional in some argument.")
    public static final SubLObject functional_in_some_argP_alt(SubLObject pred) {
        SubLTrampolineFile.checkType(pred, $sym53$VALID_SOMEWHERE_CACHE_ITEM_);
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$functionalInArgs, pred, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$strictlyFunctionalInArgs, pred, ONE_INTEGER, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP non-NIL iff PRED is functional in some argument.
     */
    @LispMethod(comment = "@return BOOLEANP non-NIL iff PRED is functional in some argument.")
    public static SubLObject functional_in_some_argP(final SubLObject pred) {
        assert NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) : "! somewhere_cache.valid_somewhere_cache_itemP(pred) " + ("somewhere_cache.valid_somewhere_cache_itemP(pred) " + "CommonSymbols.NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) ") + pred;
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$functionalInArgs, pred, ONE_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$strictlyFunctionalInArgs, pred, ONE_INTEGER, UNPROVIDED)));
    }

    /**
     *
     *
     * @return LISTP of POSITIVE-INTEGER-P args in which PRED is functional.
     */
    @LispMethod(comment = "@return LISTP of POSITIVE-INTEGER-P args in which PRED is functional.")
    public static final SubLObject functional_in_arg_positions_internal_alt(SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == UNPROVIDED) {
            assume_pred_has_functional_argsP = NIL;
        }
        SubLTrampolineFile.checkType(pred, INDEXED_TERM_P);
        if (((NIL == assume_pred_has_functional_argsP) && (NIL != somewhere_cache.valid_somewhere_cache_itemP(pred))) && (NIL == com.cyc.cycjava.cycl.cycl_utilities.functional_in_some_argP(pred))) {
            return NIL;
        } else {
            return list_utilities.fast_delete_duplicates(append(kb_mapping_utilities.pred_values_in_any_mt(pred, $$functionalInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED), kb_mapping_utilities.pred_values_in_any_mt(pred, $$strictlyFunctionalInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return LISTP of POSITIVE-INTEGER-P args in which PRED is functional.
     */
    @LispMethod(comment = "@return LISTP of POSITIVE-INTEGER-P args in which PRED is functional.")
    public static SubLObject functional_in_arg_positions_internal(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == UNPROVIDED) {
            assume_pred_has_functional_argsP = NIL;
        }
        assert NIL != indexed_term_p(pred) : "! kb_indexing_datastructures.indexed_term_p(pred) " + ("kb_indexing_datastructures.indexed_term_p(pred) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(pred) ") + pred;
        if (((NIL == assume_pred_has_functional_argsP) && (NIL != somewhere_cache.valid_somewhere_cache_itemP(pred))) && (NIL == functional_in_some_argP(pred))) {
            return NIL;
        }
        if (NIL != forts.fort_p(pred)) {
            return list_utilities.fast_delete_duplicates(append(kb_mapping_utilities.pred_values_in_any_mt(pred, $$functionalInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED), kb_mapping_utilities.pred_values_in_any_mt(pred, $$strictlyFunctionalInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject functional_in_arg_positions_alt(SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == UNPROVIDED) {
            assume_pred_has_functional_argsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.cycl_utilities.functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FUNCTIONAL_IN_ARG_POSITIONS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FUNCTIONAL_IN_ARG_POSITIONS, TWO_INTEGER, $int$100, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FUNCTIONAL_IN_ARG_POSITIONS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pred, assume_pred_has_functional_argsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw33$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && assume_pred_has_functional_argsP.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.cycl_utilities.functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, assume_pred_has_functional_argsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject functional_in_arg_positions(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == UNPROVIDED) {
            assume_pred_has_functional_argsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FUNCTIONAL_IN_ARG_POSITIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FUNCTIONAL_IN_ARG_POSITIONS, TWO_INTEGER, $int$100, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FUNCTIONAL_IN_ARG_POSITIONS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, assume_pred_has_functional_argsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && assume_pred_has_functional_argsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, assume_pred_has_functional_argsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject strictly_functional_in_some_argP(final SubLObject pred) {
        assert NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) : "! somewhere_cache.valid_somewhere_cache_itemP(pred) " + ("somewhere_cache.valid_somewhere_cache_itemP(pred) " + "CommonSymbols.NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) ") + pred;
        return somewhere_cache.some_pred_assertion_somewhereP($$strictlyFunctionalInArgs, pred, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject strictly_functional_in_arg_positions_internal(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == UNPROVIDED) {
            assume_pred_has_functional_argsP = NIL;
        }
        if (((NIL == assume_pred_has_functional_argsP) && (NIL != somewhere_cache.valid_somewhere_cache_itemP(pred))) && (NIL == strictly_functional_in_some_argP(pred))) {
            return NIL;
        }
        if (NIL != forts.fort_p(pred)) {
            return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_values_in_any_mt(pred, $$strictlyFunctionalInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject strictly_functional_in_arg_positions(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == UNPROVIDED) {
            assume_pred_has_functional_argsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return strictly_functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS, TWO_INTEGER, $int$100, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, assume_pred_has_functional_argsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && assume_pred_has_functional_argsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(strictly_functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, assume_pred_has_functional_argsP));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return listp; a cons representing NART's formula in some form,
    or NIL if it's invalid.
     * @unknown result is not destructible.
     */
    @LispMethod(comment = "@return listp; a cons representing NART\'s formula in some form,\r\nor NIL if it\'s invalid.\r\n@unknown result is not destructible.")
    public static final SubLObject nart_cons_alt(SubLObject nart) {
        return nart_hl_formula(nart);
    }

    /**
     *
     *
     * @return listp; a cons representing NART's formula in some form,
    or NIL if it's invalid.
     * @unknown result is not destructible.
     */
    @LispMethod(comment = "@return listp; a cons representing NART\'s formula in some form,\r\nor NIL if it\'s invalid.\r\n@unknown result is not destructible.")
    public static SubLObject nart_cons(final SubLObject nart) {
        return narts_high.nart_hl_formula(nart);
    }

    /**
     * Looks up all existing narts in EXPRESSION, and replaces them with
     * their reified versions, respecting special exceptions
     * like opacity and arg constraints that prescribe unreified nats.
     */
    @LispMethod(comment = "Looks up all existing narts in EXPRESSION, and replaces them with\r\ntheir reified versions, respecting special exceptions\r\nlike opacity and arg constraints that prescribe unreified nats.\nLooks up all existing narts in EXPRESSION, and replaces them with\ntheir reified versions, respecting special exceptions\nlike opacity and arg constraints that prescribe unreified nats.")
    public static final SubLObject lookup_all_narts_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $opaque_arg_function$.currentBinding(thread);
                    try {
                        $opaque_arg_function$.bind($sym59$OPAQUE_ARG_WRT_NAT_REIFICATION_, thread);
                        result = com.cyc.cycjava.cycl.cycl_utilities.expression_transform_if(expression, symbol_function(NART_P), NART_LOOKUP, NIL, UNPROVIDED);
                    } finally {
                        $opaque_arg_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Looks up all existing narts in EXPRESSION, and replaces them with\r\ntheir reified versions, respecting special exceptions\r\nlike opacity and arg constraints that prescribe unreified nats.\nLooks up all existing narts in EXPRESSION, and replaces them with\ntheir reified versions, respecting special exceptions\nlike opacity and arg constraints that prescribe unreified nats.")
    public static SubLObject lookup_all_narts(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $opaque_arg_function$.currentBinding(thread);
        try {
            $opaque_arg_function$.bind($sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_, thread);
            result = expression_transform_if(expression, symbol_function(NART_P), NART_LOOKUP, NIL, UNPROVIDED);
        } finally {
            $opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Looks up all existing narts in EXPRESSION, and replaces them with
     * their reified versions, respecting special exceptions
     * like opacity and arg constraints that prescribe unreified nats.
     */


    /**
     * Reifies all existing narts in EXPRESSION, respecting special exceptions
     * like opacity and arg constraints that prescribe unreified nats.
     * Also handles commutativity and other canonicalization properties of nats.
     */
    @LispMethod(comment = "Reifies all existing narts in EXPRESSION, respecting special exceptions\r\nlike opacity and arg constraints that prescribe unreified nats.\r\nAlso handles commutativity and other canonicalization properties of nats.\nReifies all existing narts in EXPRESSION, respecting special exceptions\nlike opacity and arg constraints that prescribe unreified nats.\nAlso handles commutativity and other canonicalization properties of nats.")
    public static final SubLObject reify_all_existing_narts_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $opaque_arg_function$.currentBinding(thread);
                    try {
                        $opaque_arg_function$.bind($sym59$OPAQUE_ARG_WRT_NAT_REIFICATION_, thread);
                        result = com.cyc.cycjava.cycl.cycl_utilities.expression_transform_if_not(expression, symbol_function(NULL), EL_FIND_IF_NART, NIL, UNPROVIDED);
                    } finally {
                        $opaque_arg_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Reifies all existing narts in EXPRESSION, respecting special exceptions\r\nlike opacity and arg constraints that prescribe unreified nats.\r\nAlso handles commutativity and other canonicalization properties of nats.\nReifies all existing narts in EXPRESSION, respecting special exceptions\nlike opacity and arg constraints that prescribe unreified nats.\nAlso handles commutativity and other canonicalization properties of nats.")
    public static SubLObject reify_all_existing_narts(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $opaque_arg_function$.currentBinding(thread);
        try {
            $opaque_arg_function$.bind($sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_, thread);
            result = expression_transform_if_not(expression, symbol_function(NULL), EL_FIND_IF_NART, NIL, UNPROVIDED);
        } finally {
            $opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Reifies all existing narts in EXPRESSION, respecting special exceptions
     * like opacity and arg constraints that prescribe unreified nats.
     * Also handles commutativity and other canonicalization properties of nats.
     */


    public static final SubLObject opaque_arg_wrt_nat_reificationP_alt(SubLObject formula, SubLObject argnum) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_utilities.default_opaque_argP(formula, argnum)) || (NIL != arg_types_of_expression_prescribe_unreifiedP(formula, argnum)));
    }

    public static SubLObject opaque_arg_wrt_nat_reificationP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != default_opaque_argP(formula, argnum)) || (NIL != arg_types_of_expression_prescribe_unreifiedP(formula, argnum)));
    }

    public static final SubLObject reify_arg_when_closed_naut_alt(SubLObject reln, SubLObject psn) {
        {
            SubLObject v_object = com.cyc.cycjava.cycl.cycl_utilities.formula_arg(reln, psn, UNPROVIDED);
            if (NIL != arg_types_prescribe_unreifiedP(reln, psn)) {
                return v_object;
            } else {
                return com.cyc.cycjava.cycl.cycl_utilities.reify_when_closed_naut(v_object);
            }
        }
    }

    public static SubLObject reify_arg_when_closed_naut(final SubLObject reln, final SubLObject psn) {
        final SubLObject v_object = formula_arg(reln, psn, UNPROVIDED);
        if (NIL != arg_types_prescribe_unreifiedP(reln, psn)) {
            return v_object;
        }
        return reify_when_closed_naut(v_object);
    }

    public static final SubLObject reify_when_closed_naut_alt(SubLObject v_object) {
        if (NIL == possibly_naut_p(v_object)) {
            return v_object;
        } else {
            if (NIL != closed_nautP(v_object, UNPROVIDED)) {
                {
                    SubLObject cnat = nart_substitute(v_object);
                    if (NIL != cnat) {
                        return cnat;
                    } else {
                        return v_object;
                    }
                }
            } else {
                if (NIL != el_formulaP(v_object)) {
                    {
                        SubLObject result = NIL;
                        SubLObject cdotimes_end_var = formula_length(v_object, $IGNORE);
                        SubLObject psn = NIL;
                        for (psn = ZERO_INTEGER; psn.numL(cdotimes_end_var); psn = add(psn, ONE_INTEGER)) {
                            result = cons(com.cyc.cycjava.cycl.cycl_utilities.reify_arg_when_closed_naut(v_object, psn), result);
                        }
                        return nreverse(result);
                    }
                } else {
                    return v_object;
                }
            }
        }
    }

    public static SubLObject reify_when_closed_naut(final SubLObject v_object) {
        if (NIL == possibly_naut_p(v_object)) {
            return v_object;
        }
        if (NIL != term.closed_nautP(v_object, UNPROVIDED)) {
            final SubLObject cnat = narts_high.nart_substitute(v_object);
            if (NIL != cnat) {
                return cnat;
            }
            return v_object;
        } else {
            if (NIL != el_formulaP(v_object)) {
                SubLObject result = NIL;
                SubLObject cdotimes_end_var;
                SubLObject psn;
                for (cdotimes_end_var = formula_length(v_object, $IGNORE), psn = NIL, psn = ZERO_INTEGER; psn.numL(cdotimes_end_var); psn = add(psn, ONE_INTEGER)) {
                    result = cons(reify_arg_when_closed_naut(v_object, psn), result);
                }
                return nreverse(result);
            }
            return v_object;
        }
    }

    /**
     * if OBJECT is a closed naut, find its corresponding nart, otherwise return OBJECT unmodified
     */
    @LispMethod(comment = "if OBJECT is a closed naut, find its corresponding nart, otherwise return OBJECT unmodified")
    public static final SubLObject find_when_closed_naut_alt(SubLObject v_object) {
        if (NIL != closed_nautP(v_object, UNPROVIDED)) {
            {
                SubLObject nart = find_nart(v_object);
                if (NIL != nart_handles.nart_p(nart)) {
                    return nart;
                }
            }
        }
        return v_object;
    }

    @LispMethod(comment = "if OBJECT is a closed naut, find its corresponding nart, otherwise return OBJECT unmodified")
    public static SubLObject find_when_closed_naut(final SubLObject v_object) {
        if (NIL != term.closed_nautP(v_object, UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(v_object);
            if (NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return v_object;
    }/**
     * if OBJECT is a closed naut, find its corresponding nart, otherwise return OBJECT unmodified
     */


    /**
     * if OBJECT is a closed, unreified, specification of a reified non-atomic term,
     * then return the NART implementing the reification; otherwise return nil.
     */
    @LispMethod(comment = "if OBJECT is a closed, unreified, specification of a reified non-atomic term,\r\nthen return the NART implementing the reification; otherwise return nil.\nif OBJECT is a closed, unreified, specification of a reified non-atomic term,\nthen return the NART implementing the reification; otherwise return nil.")
    public static final SubLObject find_closed_naut_alt(SubLObject v_object) {
        if (NIL != closed_nautP(v_object, UNPROVIDED)) {
            {
                SubLObject nart = find_nart(v_object);
                if (NIL != nart_handles.nart_p(nart)) {
                    return nart;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "if OBJECT is a closed, unreified, specification of a reified non-atomic term,\r\nthen return the NART implementing the reification; otherwise return nil.\nif OBJECT is a closed, unreified, specification of a reified non-atomic term,\nthen return the NART implementing the reification; otherwise return nil.")
    public static SubLObject find_closed_naut(final SubLObject v_object) {
        if (NIL != term.closed_nautP(v_object, UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(v_object);
            if (NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return NIL;
    }/**
     * if OBJECT is a closed, unreified, specification of a reified non-atomic term,
     * then return the NART implementing the reification; otherwise return nil.
     */


    public static SubLObject find_when_ground_naut(final SubLObject v_object) {
        if (NIL != term.ground_nautP(v_object, UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(v_object);
            if (NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return v_object;
    }

    /**
     * if OBJECT is a ground, unreified, specification of a reified non-atomic term,
     * then return the NART implementing the reification; otherwise return nil.
     */
    @LispMethod(comment = "if OBJECT is a ground, unreified, specification of a reified non-atomic term,\r\nthen return the NART implementing the reification; otherwise return nil.\nif OBJECT is a ground, unreified, specification of a reified non-atomic term,\nthen return the NART implementing the reification; otherwise return nil.")
    public static final SubLObject find_ground_naut_alt(SubLObject v_object) {
        if (NIL != ground_nautP(v_object, UNPROVIDED)) {
            {
                SubLObject nat = find_nart(v_object);
                return NIL != nart_handles.nart_p(nat) ? ((SubLObject) (nat)) : NIL;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "if OBJECT is a ground, unreified, specification of a reified non-atomic term,\r\nthen return the NART implementing the reification; otherwise return nil.\nif OBJECT is a ground, unreified, specification of a reified non-atomic term,\nthen return the NART implementing the reification; otherwise return nil.")
    public static SubLObject find_ground_naut(final SubLObject v_object) {
        if (NIL != term.ground_nautP(v_object, UNPROVIDED)) {
            final SubLObject nat = narts_high.find_nart(v_object);
            return NIL != nart_handles.nart_p(nat) ? nat : NIL;
        }
        return NIL;
    }/**
     * if OBJECT is a ground, unreified, specification of a reified non-atomic term,
     * then return the NART implementing the reification; otherwise return nil.
     */


    public static final SubLObject ground_hl_formulaP_alt(SubLObject hl_formula) {
        return groundP(hl_formula, symbol_function(VARIABLE_P));
    }

    public static SubLObject ground_hl_formulaP(final SubLObject hl_formula) {
        return groundP(hl_formula, symbol_function(VARIABLE_P));
    }

    /**
     *
     *
     * @return boolean; t iff ASENT is (possibly) an atomic sentence
    with predicate PRED.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASENT is (possibly) an atomic sentence\r\nwith predicate PRED.\r\nAssumes equality can be tested with #\'eq.")
    public static final SubLObject atomic_sentence_with_pred_p_alt(SubLObject asent, SubLObject pred) {
        return makeBoolean((NIL != possibly_atomic_sentence_p(asent)) && (pred == com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate(asent)));
    }

    /**
     *
     *
     * @return boolean; t iff ASENT is (possibly) an atomic sentence
    with predicate PRED.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASENT is (possibly) an atomic sentence\r\nwith predicate PRED.\r\nAssumes equality can be tested with #\'eq.")
    public static SubLObject atomic_sentence_with_pred_p(final SubLObject asent, final SubLObject pred) {
        return makeBoolean((NIL != possibly_atomic_sentence_p(asent)) && (NIL != kb_utilities.kbeq(pred, atomic_sentence_predicate(asent))));
    }

    /**
     *
     *
     * @return boolean; t iff ASENT is (possibly) an atomic sentence
    with a predicate in PREDS.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASENT is (possibly) an atomic sentence\r\nwith a predicate in PREDS.\r\nAssumes equality can be tested with #\'eq.")
    public static final SubLObject atomic_sentence_with_any_of_preds_p_alt(SubLObject asent, SubLObject preds) {
        return makeBoolean((NIL != possibly_atomic_sentence_p(asent)) && (NIL != list_utilities.member_eqP(com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate(asent), preds)));
    }

    /**
     *
     *
     * @return boolean; t iff ASENT is (possibly) an atomic sentence
    with a predicate in PREDS.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASENT is (possibly) an atomic sentence\r\nwith a predicate in PREDS.\r\nAssumes equality can be tested with #\'eq.")
    public static SubLObject atomic_sentence_with_any_of_preds_p(final SubLObject asent, final SubLObject preds) {
        return makeBoolean((NIL != possibly_atomic_sentence_p(asent)) && (NIL != list_utilities.member_kbeqP(atomic_sentence_predicate(asent), preds)));
    }

    public static final SubLObject null_or_falseP_alt(SubLObject v_object) {
        return makeBoolean((NIL == v_object) || ($$False == v_object));
    }

    public static SubLObject null_or_falseP(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != kb_utilities.kbeq($$False, v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an EL formula, a nart, or an assertion.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an EL formula, a nart, or an assertion.")
    public static final SubLObject possibly_cycl_formula_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) || (NIL != nart_handles.nart_p(v_object))) || (NIL != assertion_handles.assertion_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an EL formula, a nart, or an assertion.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an EL formula, a nart, or an assertion.")
    public static SubLObject possibly_cycl_formula_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) || (NIL != nart_handles.nart_p(v_object))) || (NIL != assertion_handles.assertion_p(v_object)));
    }

    /**
     * Assuming FORM is a valid CycL formula, return T IFF it is negated.
     */
    @LispMethod(comment = "Assuming FORM is a valid CycL formula, return T IFF it is negated.")
    public static final SubLObject negatedP_alt(SubLObject form) {
        SubLTrampolineFile.checkType(form, EL_FORMULA_P);
        return makeBoolean((form.isCons() && (form.first() == $$not)) && length(form).numE(TWO_INTEGER));
    }

    @LispMethod(comment = "Assuming FORM is a valid CycL formula, return T IFF it is negated.")
    public static SubLObject negatedP(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().eql($$not)) && length(v_object).numE(TWO_INTEGER));
    }/**
     * Assuming FORM is a valid CycL formula, return T IFF it is negated.
     */


    /**
     * Assuming FORM is a valid CycL formula, return a negated version of it.
     */
    @LispMethod(comment = "Assuming FORM is a valid CycL formula, return a negated version of it.")
    public static final SubLObject negate_alt(SubLObject form) {
        SubLTrampolineFile.checkType(form, EL_FORMULA_P);
        if (NIL != com.cyc.cycjava.cycl.cycl_utilities.negatedP(form)) {
            return com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(form, UNPROVIDED);
        } else {
            return list($$not, form);
        }
    }

    @LispMethod(comment = "Assuming FORM is a valid CycL formula, return a negated version of it.")
    public static SubLObject negate(final SubLObject form) {
        SubLTrampolineFile.enforceType(form, POSSIBLY_SENTENCE_OR_VARIABLE_P);
        if (NIL != negatedP(form)) {
            return formula_arg1(form, UNPROVIDED);
        }
        return list($$not, form);
    }/**
     * Assuming FORM is a valid CycL formula, return a negated version of it.
     */


    /**
     * Assuming SENTENCE is a CycL sentence, return a negated version of it if
     * TRUTH is :false
     */
    @LispMethod(comment = "Assuming SENTENCE is a CycL sentence, return a negated version of it if\r\nTRUTH is :false\nAssuming SENTENCE is a CycL sentence, return a negated version of it if\nTRUTH is :false")
    public static final SubLObject possibly_negate_alt(SubLObject sentence, SubLObject truth) {
        SubLTrampolineFile.checkType(truth, TRUTH_P);
        if (truth == $TRUE) {
            return sentence;
        } else {
            return com.cyc.cycjava.cycl.cycl_utilities.negate(sentence);
        }
    }

    @LispMethod(comment = "Assuming SENTENCE is a CycL sentence, return a negated version of it if\r\nTRUTH is :false\nAssuming SENTENCE is a CycL sentence, return a negated version of it if\nTRUTH is :false")
    public static SubLObject possibly_negate(final SubLObject sentence, final SubLObject truth) {
        assert NIL != enumeration_types.truth_p(truth) : "! enumeration_types.truth_p(truth) " + ("enumeration_types.truth_p(truth) " + "CommonSymbols.NIL != enumeration_types.truth_p(truth) ") + truth;
        if (truth == $TRUE) {
            return sentence;
        }
        return negate(sentence);
    }/**
     * Assuming SENTENCE is a CycL sentence, return a negated version of it if
     * TRUTH is :false
     */


    /**
     * returns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.
     * Works with forts and assertions.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */
    @LispMethod(comment = "returns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.\r\nWorks with forts and assertions.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.\nWorks with forts and assertions.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static final SubLObject formula_arg_alt(SubLObject formula, SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        if (NIL == subl_promotions.non_negative_integer_p(argnum)) {
            return NIL;
        } else {
            if (NIL != el_formula_p(formula)) {
                return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg(formula, argnum, seqvar_handling);
            } else {
                if (NIL != nart_handles.nart_p(formula)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg(nart_hl_formula(formula), argnum, UNPROVIDED);
                } else {
                    if (NIL != assertion_handles.assertion_p(formula)) {
                        return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg(assertion_hl_formula(formula, UNPROVIDED), argnum, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.\r\nWorks with forts and assertions.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.\nWorks with forts and assertions.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static SubLObject formula_arg(final SubLObject formula, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        if (NIL == subl_promotions.non_negative_integer_p(argnum)) {
            return NIL;
        }
        if (NIL != el_formula_p(formula)) {
            return el_formula_arg(formula, argnum, seqvar_handling);
        }
        if (NIL != nart_handles.nart_p(formula)) {
            return el_formula_arg(narts_high.nart_hl_formula(formula), argnum, UNPROVIDED);
        }
        if (NIL != assertions_high.gaf_assertionP(formula)) {
            return copy_tree(el_formula_arg(assertions_high.gaf_el_formula(formula), argnum, UNPROVIDED));
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_arg(fi.assertion_hl_formula(formula, UNPROVIDED), argnum, UNPROVIDED);
        }
        return NIL;
    }/**
     * returns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.
     * Works with forts and assertions.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */


    /**
     * returns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */
    @LispMethod(comment = "returns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static final SubLObject el_formula_arg_alt(SubLObject el_formula, SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        SubLTrampolineFile.checkType(el_formula, EL_FORMULA_P);
        SubLTrampolineFile.checkType(argnum, NON_NEGATIVE_INTEGER_P);
        if (NIL != el_formula_arityGE(el_formula, argnum, seqvar_handling)) {
            return nth(argnum, com.cyc.cycjava.cycl.cycl_utilities.el_formula_terms(el_formula, seqvar_handling));
        }
        return NIL;
    }

    @LispMethod(comment = "returns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static SubLObject el_formula_arg(final SubLObject el_formula, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        assert NIL != el_formula_p(el_formula) : "! el_utilities.el_formula_p(el_formula) " + ("el_utilities.el_formula_p(el_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(el_formula) ") + el_formula;
        assert NIL != subl_promotions.non_negative_integer_p(argnum) : "! subl_promotions.non_negative_integer_p(argnum) " + ("subl_promotions.non_negative_integer_p(argnum) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(argnum) ") + argnum;
        if (NIL != el_formula_arityGE(el_formula, argnum, seqvar_handling)) {
            return nth(argnum, el_formula_terms(el_formula, seqvar_handling));
        }
        return NIL;
    }/**
     * returns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */


    public static SubLObject el_formula_has_argP(final SubLObject el_formula, final SubLObject argnum, final SubLObject v_term) {
        return equal(v_term, el_formula_arg(el_formula, argnum, UNPROVIDED));
    }

    /**
     * returns the 0th argument of FORMULA, which is by convention the operator.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the 0th argument of FORMULA, which is by convention the operator.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 0th argument of FORMULA, which is by convention the operator.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_arg0_alt(SubLObject formula) {
        if (NIL != el_formula_p(formula)) {
            return com.cyc.cycjava.cycl.cycl_utilities.el_formula_operator(formula);
        } else {
            if (NIL != nart_handles.nart_p(formula)) {
                return com.cyc.cycjava.cycl.cycl_utilities.el_formula_operator(nart_hl_formula(formula));
            } else {
                if (NIL != assertion_handles.assertion_p(formula)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.el_formula_operator(assertion_hl_formula(formula, UNPROVIDED));
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns the 0th argument of FORMULA, which is by convention the operator.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 0th argument of FORMULA, which is by convention the operator.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_arg0(final SubLObject formula) {
        if (NIL != el_formula_p(formula)) {
            return el_formula_operator(formula);
        }
        if (NIL != nart_handles.nart_p(formula)) {
            return el_formula_operator(narts_high.nart_hl_formula(formula));
        }
        if (NIL != assertions_high.gaf_assertionP(formula)) {
            return copy_tree(el_formula_operator(assertions_high.gaf_el_formula(formula)));
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_operator(fi.assertion_hl_formula(formula, UNPROVIDED));
        }
        return NIL;
    }/**
     * returns the 0th argument of FORMULA, which is by convention the operator.
     * returns NIL if FORMULA is not a formula.
     */


    /**
     * returns the operator of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the operator of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the operator of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_operator_alt(SubLObject formula) {
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(formula);
    }

    @LispMethod(comment = "returns the operator of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the operator of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_operator(final SubLObject formula) {
        return formula_arg0(formula);
    }/**
     * returns the operator of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */


    /**
     * returns the operator of EL-FORMULA.
     */
    @LispMethod(comment = "returns the operator of EL-FORMULA.")
    public static final SubLObject el_formula_operator_alt(SubLObject el_formula) {
        SubLTrampolineFile.checkType(el_formula, EL_FORMULA_P);
        return el_formula.first();
    }

    @LispMethod(comment = "returns the operator of EL-FORMULA.")
    public static SubLObject el_formula_operator(final SubLObject el_formula) {
        assert NIL != el_formula_p(el_formula) : "! el_utilities.el_formula_p(el_formula) " + ("el_utilities.el_formula_p(el_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(el_formula) ") + el_formula;
        return el_formula.first();
    }/**
     * returns the operator of EL-FORMULA.
     */


    public static SubLObject el_formula_arg1(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return el_formula_arg(el_formula, ONE_INTEGER, seqvar_handling);
    }

    public static SubLObject el_formula_arg2(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return el_formula_arg(el_formula, TWO_INTEGER, seqvar_handling);
    }

    public static SubLObject el_formula_arg3(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return el_formula_arg(el_formula, THREE_INTEGER, seqvar_handling);
    }

    /**
     * returns the 1st argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the 1st argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 1st argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_arg1_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, ONE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 1st argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 1st argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_arg1(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(formula, ONE_INTEGER, seqvar_handling);
    }/**
     * returns the 1st argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */


    /**
     * returns the 2nd argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the 2nd argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 2nd argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_arg2_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, TWO_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 2nd argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 2nd argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_arg2(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(formula, TWO_INTEGER, seqvar_handling);
    }/**
     * returns the 2nd argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */


    /**
     * returns the 3rd argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the 3rd argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 3rd argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_arg3_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, THREE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 3rd argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 3rd argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_arg3(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(formula, THREE_INTEGER, seqvar_handling);
    }/**
     * returns the 3rd argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */


    /**
     * returns the 4th argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the 4th argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 4th argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_arg4_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, FOUR_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 4th argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 4th argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_arg4(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(formula, FOUR_INTEGER, seqvar_handling);
    }/**
     * returns the 4th argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */


    /**
     * returns the 5th argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */
    @LispMethod(comment = "returns the 5th argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 5th argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static final SubLObject formula_arg5_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(formula, FIVE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 5th argument of FORMULA.\r\nreturns NIL if FORMULA is not a formula.\nreturns the 5th argument of FORMULA.\nreturns NIL if FORMULA is not a formula.")
    public static SubLObject formula_arg5(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(formula, FIVE_INTEGER, seqvar_handling);
    }/**
     * returns the 5th argument of FORMULA.
     * returns NIL if FORMULA is not a formula.
     */


    public static SubLObject formula_arg6(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(formula, SIX_INTEGER, seqvar_handling);
    }

    /**
     *
     *
     * @return list; the arguments of FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
    Note that using the :include option may cause formula-args to return a variable instead of a list!
    e.g. (formula-args (#$different . ?X) :include) -> ?X
    Does the right thing for narts and assertions, but ignores the MT of the assertion.
    returns NIL if FORMULA is not a possibly-cycl-formula-p.
     */
    @LispMethod(comment = "@return list; the arguments of FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\r\nNote that using the :include option may cause formula-args to return a variable instead of a list!\r\ne.g. (formula-args (#$different . ?X) :include) -> ?X\r\nDoes the right thing for narts and assertions, but ignores the MT of the assertion.\r\nreturns NIL if FORMULA is not a possibly-cycl-formula-p.")
    public static final SubLObject formula_args_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        if (NIL != el_formula_p(formula)) {
            return com.cyc.cycjava.cycl.cycl_utilities.el_formula_args(formula, seqvar_handling);
        } else {
            if (NIL != nart_handles.nart_p(formula)) {
                return com.cyc.cycjava.cycl.cycl_utilities.el_formula_args(nart_hl_formula(formula), UNPROVIDED);
            } else {
                if (NIL != assertion_handles.assertion_p(formula)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.el_formula_args(assertion_hl_formula(formula, UNPROVIDED), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; the arguments of FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
    Note that using the :include option may cause formula-args to return a variable instead of a list!
    e.g. (formula-args (#$different . ?X) :include) -> ?X
    Does the right thing for narts and assertions, but ignores the MT of the assertion.
    returns NIL if FORMULA is not a possibly-cycl-formula-p.
     */
    @LispMethod(comment = "@return list; the arguments of FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\r\nNote that using the :include option may cause formula-args to return a variable instead of a list!\r\ne.g. (formula-args (#$different . ?X) :include) -> ?X\r\nDoes the right thing for narts and assertions, but ignores the MT of the assertion.\r\nreturns NIL if FORMULA is not a possibly-cycl-formula-p.")
    public static SubLObject formula_args(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        if (NIL != el_formula_p(formula)) {
            return el_formula_args(formula, seqvar_handling);
        }
        if (NIL != nart_handles.nart_p(formula)) {
            return el_formula_args(narts_high.nart_hl_formula(formula), UNPROVIDED);
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_args(fi.assertion_hl_formula(formula, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; the arguments of FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
    Note that using the :include option may cause el-formula-args to return a variable instead of a list!
    e.g. (el-formula-args (#$different . ?X) :include) -> ?X
     */
    @LispMethod(comment = "@return list; the arguments of FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\r\nNote that using the :include option may cause el-formula-args to return a variable instead of a list!\r\ne.g. (el-formula-args (#$different . ?X) :include) -> ?X")
    public static final SubLObject el_formula_args_alt(SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        SubLTrampolineFile.checkType(el_formula, EL_FORMULA_P);
        if (NIL != list_utilities.non_dotted_list_p(el_formula)) {
            return el_formula.rest();
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int(el_formula.rest(), seqvar_handling, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; the arguments of FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
    Note that using the :include option may cause el-formula-args to return a variable instead of a list!
    e.g. (el-formula-args (#$different . ?X) :include) -> ?X
     */
    @LispMethod(comment = "@return list; the arguments of FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\r\nNote that using the :include option may cause el-formula-args to return a variable instead of a list!\r\ne.g. (el-formula-args (#$different . ?X) :include) -> ?X")
    public static SubLObject el_formula_args(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        assert NIL != el_formula_p(el_formula) : "! el_utilities.el_formula_p(el_formula) " + ("el_utilities.el_formula_p(el_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(el_formula) ") + el_formula;
        if (NIL != list_utilities.non_dotted_list_p(el_formula)) {
            return el_formula.rest();
        }
        return formula_terms_int(el_formula.rest(), seqvar_handling, UNPROVIDED);
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns the list of arguments for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns the list of arguments for EL or HL CYCL-SENTENCE.")
    public static final SubLObject cycl_formula_args_alt(SubLObject cycl_sentence) {
        SubLTrampolineFile.checkType(cycl_sentence, CYCL_SENTENCE_P);
        {
            SubLObject formula = NIL;
            if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                formula = assertion_formula(cycl_sentence);
            } else {
                formula = cycl_sentence;
            }
            return com.cyc.cycjava.cycl.cycl_utilities.formula_args(formula, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns the list of arguments for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns the list of arguments for EL or HL CYCL-SENTENCE.")
    public static SubLObject cycl_formula_args(final SubLObject cycl_sentence) {
        assert NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : "! cycl_grammar.cycl_sentence_p(cycl_sentence) " + ("cycl_grammar.cycl_sentence_p(cycl_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) ") + cycl_sentence;
        SubLObject formula = NIL;
        if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        } else {
            formula = cycl_sentence;
        }
        return formula_args(formula, UNPROVIDED);
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument zero (the predicate) for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument zero (the predicate) for EL or HL CYCL-SENTENCE.")
    public static final SubLObject cycl_formula_arg0_alt(SubLObject cycl_sentence) {
        SubLTrampolineFile.checkType(cycl_sentence, CYCL_SENTENCE_P);
        {
            SubLObject formula = NIL;
            if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                formula = assertion_formula(cycl_sentence);
            } else {
                formula = cycl_sentence;
            }
            return com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(formula);
        }
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument zero (the predicate) for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument zero (the predicate) for EL or HL CYCL-SENTENCE.")
    public static SubLObject cycl_formula_arg0(final SubLObject cycl_sentence) {
        assert NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : "! cycl_grammar.cycl_sentence_p(cycl_sentence) " + ("cycl_grammar.cycl_sentence_p(cycl_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) ") + cycl_sentence;
        SubLObject formula = NIL;
        if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        } else {
            formula = cycl_sentence;
        }
        return formula_arg0(formula);
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument one for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument one for EL or HL CYCL-SENTENCE.")
    public static final SubLObject cycl_formula_arg1_alt(SubLObject cycl_sentence) {
        SubLTrampolineFile.checkType(cycl_sentence, CYCL_SENTENCE_P);
        {
            SubLObject formula = NIL;
            if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                formula = assertion_formula(cycl_sentence);
            } else {
                formula = cycl_sentence;
            }
            return com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument one for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument one for EL or HL CYCL-SENTENCE.")
    public static SubLObject cycl_formula_arg1(final SubLObject cycl_sentence) {
        assert NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : "! cycl_grammar.cycl_sentence_p(cycl_sentence) " + ("cycl_grammar.cycl_sentence_p(cycl_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) ") + cycl_sentence;
        SubLObject formula = NIL;
        if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        } else {
            formula = cycl_sentence;
        }
        return formula_arg1(formula, UNPROVIDED);
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument two for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument two for EL or HL CYCL-SENTENCE.")
    public static final SubLObject cycl_formula_arg2_alt(SubLObject cycl_sentence) {
        SubLTrampolineFile.checkType(cycl_sentence, CYCL_SENTENCE_P);
        {
            SubLObject formula = NIL;
            if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                formula = assertion_formula(cycl_sentence);
            } else {
                formula = cycl_sentence;
            }
            return com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(formula, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument two for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument two for EL or HL CYCL-SENTENCE.")
    public static SubLObject cycl_formula_arg2(final SubLObject cycl_sentence) {
        assert NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : "! cycl_grammar.cycl_sentence_p(cycl_sentence) " + ("cycl_grammar.cycl_sentence_p(cycl_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) ") + cycl_sentence;
        SubLObject formula = NIL;
        if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        } else {
            formula = cycl_sentence;
        }
        return formula_arg2(formula, UNPROVIDED);
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument three for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument three for EL or HL CYCL-SENTENCE.")
    public static final SubLObject cycl_formula_arg3_alt(SubLObject cycl_sentence) {
        SubLTrampolineFile.checkType(cycl_sentence, CYCL_SENTENCE_P);
        {
            SubLObject formula = NIL;
            if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                formula = assertion_formula(cycl_sentence);
            } else {
                formula = cycl_sentence;
            }
            return com.cyc.cycjava.cycl.cycl_utilities.formula_arg3(formula, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param cycl-sentence;
     * 		CYCL-SENTENCE-P
     * 		Returns argument three for EL or HL CYCL-SENTENCE.
     */
    @LispMethod(comment = "@param cycl-sentence;\r\n\t\tCYCL-SENTENCE-P\r\n\t\tReturns argument three for EL or HL CYCL-SENTENCE.")
    public static SubLObject cycl_formula_arg3(final SubLObject cycl_sentence) {
        assert NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : "! cycl_grammar.cycl_sentence_p(cycl_sentence) " + ("cycl_grammar.cycl_sentence_p(cycl_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) ") + cycl_sentence;
        SubLObject formula = NIL;
        if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        } else {
            formula = cycl_sentence;
        }
        return formula_arg3(formula, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of the terms in FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
    Does the right thing for narts and assertions, but ignores the MT of the assertion.
    returns NIL if FORMULA is not a possibly-cycl-formula-p.
     */
    @LispMethod(comment = "@return list; a list of the terms in FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\r\nDoes the right thing for narts and assertions, but ignores the MT of the assertion.\r\nreturns NIL if FORMULA is not a possibly-cycl-formula-p.")
    public static final SubLObject formula_terms_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        if (NIL != el_formula_p(formula)) {
            return com.cyc.cycjava.cycl.cycl_utilities.el_formula_terms(formula, seqvar_handling);
        } else {
            if (NIL != nart_handles.nart_p(formula)) {
                return com.cyc.cycjava.cycl.cycl_utilities.el_formula_terms(nart_hl_formula(formula), UNPROVIDED);
            } else {
                if (NIL != assertion_handles.assertion_p(formula)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.el_formula_terms(assertion_hl_formula(formula, UNPROVIDED), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; a list of the terms in FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
    Does the right thing for narts and assertions, but ignores the MT of the assertion.
    returns NIL if FORMULA is not a possibly-cycl-formula-p.
     */
    @LispMethod(comment = "@return list; a list of the terms in FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\r\nDoes the right thing for narts and assertions, but ignores the MT of the assertion.\r\nreturns NIL if FORMULA is not a possibly-cycl-formula-p.")
    public static SubLObject formula_terms(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        if (NIL != el_formula_p(formula)) {
            return el_formula_terms(formula, seqvar_handling);
        }
        if (NIL != nart_handles.nart_p(formula)) {
            return el_formula_terms(narts_high.nart_hl_formula(formula), UNPROVIDED);
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_terms(fi.assertion_hl_formula(formula, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; a list of the terms in EL-FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
     */
    @LispMethod(comment = "@return list; a list of the terms in EL-FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.")
    public static final SubLObject el_formula_terms_alt(SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        SubLTrampolineFile.checkType(el_formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int(el_formula, seqvar_handling, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; a list of the terms in EL-FORMULA.
    If seqvar-handling is :ignore, it chops off the sequence var if there is one.
    If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
    If seqvar-handling is :include, it returns it as a sequence var.
     */
    @LispMethod(comment = "@return list; a list of the terms in EL-FORMULA.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.")
    public static SubLObject el_formula_terms(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        assert NIL != el_formula_p(el_formula) : "! el_utilities.el_formula_p(el_formula) " + ("el_utilities.el_formula_p(el_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(el_formula) ") + el_formula;
        return formula_terms_int(el_formula, seqvar_handling, UNPROVIDED);
    }

    public static final SubLObject formula_terms_int_alt(SubLObject formula, SubLObject seqvar_handling, SubLObject force_one_passP) {
        if (force_one_passP == UNPROVIDED) {
            force_one_passP = NIL;
        }
        if (NIL != force_one_passP) {
            return com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int_one_pass(formula, seqvar_handling);
        } else {
            return com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int_two_pass(formula, seqvar_handling);
        }
    }

    public static SubLObject formula_terms_int(final SubLObject formula, final SubLObject seqvar_handling, SubLObject force_one_passP) {
        if (force_one_passP == UNPROVIDED) {
            force_one_passP = NIL;
        }
        if (NIL != force_one_passP) {
            return formula_terms_int_one_pass(formula, seqvar_handling);
        }
        return formula_terms_int_two_pass(formula, seqvar_handling);
    }

    /**
     *
     *
     * @return LISTP; the terms of FORMULA. This version makes two passes if FORMULA has
    a sequence variable, but it avoids the consing done by VALUES in Allegro for formulas
    without sequence variables.  Also it avoids cdr recursion.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP; the terms of FORMULA. This version makes two passes if FORMULA has\r\na sequence variable, but it avoids the consing done by VALUES in Allegro for formulas\r\nwithout sequence variables.  Also it avoids cdr recursion.\r\n@unknown baxter")
    public static final SubLObject formula_terms_int_two_pass_alt(SubLObject formula, SubLObject seqvar_handling) {
        if (NIL != formula_with_sequence_termP(formula)) {
            return com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int_one_pass(formula, seqvar_handling);
        } else {
            if (formula.isCons()) {
                return formula;
            } else {
                return com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int_one_pass(formula, seqvar_handling);
            }
        }
    }

    /**
     *
     *
     * @return LISTP; the terms of FORMULA. This version makes two passes if FORMULA has
    a sequence variable, but it avoids the consing done by VALUES in Allegro for formulas
    without sequence variables.  Also it avoids cdr recursion.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP; the terms of FORMULA. This version makes two passes if FORMULA has\r\na sequence variable, but it avoids the consing done by VALUES in Allegro for formulas\r\nwithout sequence variables.  Also it avoids cdr recursion.\r\n@unknown baxter")
    public static SubLObject formula_terms_int_two_pass(final SubLObject formula, final SubLObject seqvar_handling) {
        if (NIL != formula_with_sequence_termP(formula)) {
            return formula_terms_int_one_pass(formula, seqvar_handling);
        }
        if (formula.isCons()) {
            return formula;
        }
        return formula_terms_int_one_pass(formula, seqvar_handling);
    }

    /**
     *
     *
     * @return 0 list; the terms of FORMULA
     * @return 1 boolean; whether to cons
    in the case of formula-args having the
    optional sequence var argument be :include, we can simply use rest; in the
    case it is :ignore or :regularize, we could use a recursive internal function
    that recurses down the arg-list until a sequence var is encountered and,
    only if one is encountered conses the car (the arg) while unwinding; if no
    result is consed-up (e.g., no sequence var is found), it can simply return
    rest.  No separate call to proper-list-p would be made.  This would seem
    to minimize both consing and cdr'ing through the formula args. -ksm
     */
    @LispMethod(comment = "@return 0 list; the terms of FORMULA\r\n@return 1 boolean; whether to cons\r\nin the case of formula-args having the\r\noptional sequence var argument be :include, we can simply use rest; in the\r\ncase it is :ignore or :regularize, we could use a recursive internal function\r\nthat recurses down the arg-list until a sequence var is encountered and,\r\nonly if one is encountered conses the car (the arg) while unwinding; if no\r\nresult is consed-up (e.g., no sequence var is found), it can simply return\r\nrest.  No separate call to proper-list-p would be made.  This would seem\r\nto minimize both consing and cdr\'ing through the formula args. -ksm")
    public static final SubLObject formula_terms_int_one_pass_alt(SubLObject formula, SubLObject seqvar_handling) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == formula) {
                return values(NIL, NIL);
            } else {
                if (formula.isCons()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject subformula = com.cyc.cycjava.cycl.cycl_utilities.formula_terms_int(formula.rest(), seqvar_handling, T);
                        SubLObject consP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != consP) {
                            return values(cons(formula.first(), subformula), T);
                        } else {
                            return values(formula, NIL);
                        }
                    }
                } else {
                    if (NIL != cycl_variables.cyc_varP(formula)) {
                        {
                            SubLObject pcase_var = seqvar_handling;
                            if (pcase_var.eql($IGNORE)) {
                                return values(NIL, T);
                            } else {
                                if (pcase_var.eql($REGULARIZE)) {
                                    return values(list(formula), T);
                                } else {
                                    if (pcase_var.eql($INCLUDE)) {
                                        return values(formula, NIL);
                                    } else {
                                        return values(NIL, T);
                                    }
                                }
                            }
                        }
                    } else {
                        el_error(THREE_INTEGER, $str_alt80$formula_terms_int_got_a_non_el_va, formula, UNPROVIDED, UNPROVIDED);
                        return values(NIL, T);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 list; the terms of FORMULA
     * @return 1 boolean; whether to cons
    in the case of formula-args having the
    optional sequence var argument be :include, we can simply use rest; in the
    case it is :ignore or :regularize, we could use a recursive internal function
    that recurses down the arg-list until a sequence var is encountered and,
    only if one is encountered conses the car (the arg) while unwinding; if no
    result is consed-up (e.g., no sequence var is found), it can simply return
    rest.  No separate call to proper-list-p would be made.  This would seem
    to minimize both consing and cdr'ing through the formula args. -ksm
     */
    @LispMethod(comment = "@return 0 list; the terms of FORMULA\r\n@return 1 boolean; whether to cons\r\nin the case of formula-args having the\r\noptional sequence var argument be :include, we can simply use rest; in the\r\ncase it is :ignore or :regularize, we could use a recursive internal function\r\nthat recurses down the arg-list until a sequence var is encountered and,\r\nonly if one is encountered conses the car (the arg) while unwinding; if no\r\nresult is consed-up (e.g., no sequence var is found), it can simply return\r\nrest.  No separate call to proper-list-p would be made.  This would seem\r\nto minimize both consing and cdr\'ing through the formula args. -ksm")
    public static SubLObject formula_terms_int_one_pass(final SubLObject formula, final SubLObject seqvar_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == formula) {
            return subl_promotions.values2(NIL, NIL);
        }
        if (formula.isCons()) {
            thread.resetMultipleValues();
            final SubLObject subformula = formula_terms_int(formula.rest(), seqvar_handling, T);
            final SubLObject consP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != consP) {
                return subl_promotions.values2(cons(formula.first(), subformula), T);
            }
            return subl_promotions.values2(formula, NIL);
        } else {
            if (NIL == cycl_variables.cyc_varP(formula)) {
                el_error(THREE_INTEGER, $str97$formula_terms_int_got_a_non_el_va, formula, UNPROVIDED, UNPROVIDED);
                return subl_promotions.values2(NIL, T);
            }
            if (seqvar_handling.eql($IGNORE)) {
                return subl_promotions.values2(NIL, T);
            }
            if (seqvar_handling.eql($REGULARIZE)) {
                return subl_promotions.values2(list(formula), T);
            }
            if (seqvar_handling.eql($INCLUDE)) {
                return subl_promotions.values2(formula, NIL);
            }
            return subl_promotions.values2(NIL, T);
        }
    }

    /**
     *
     *
     * @return list; a list of positions (argnums) where ARG appears in FORMULA.
     */
    @LispMethod(comment = "@return list; a list of positions (argnums) where ARG appears in FORMULA.")
    public static final SubLObject formula_arg_positions_alt(SubLObject formula, SubLObject arg, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        if (NIL != el_formula_p(formula)) {
            return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg_positions(formula, arg, test);
        } else {
            if (NIL != nart_handles.nart_p(formula)) {
                return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg_positions(nart_hl_formula(formula), arg, test);
            } else {
                if (NIL != assertion_handles.assertion_p(formula)) {
                    return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg_positions(assertion_hl_formula(formula, UNPROVIDED), arg, test);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; a list of positions (argnums) where ARG appears in FORMULA.
     */
    @LispMethod(comment = "@return list; a list of positions (argnums) where ARG appears in FORMULA.")
    public static SubLObject formula_arg_positions(final SubLObject formula, final SubLObject arg, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        if (NIL != el_formula_p(formula)) {
            return el_formula_arg_positions(formula, arg, test);
        }
        if (NIL != nart_handles.nart_p(formula)) {
            return el_formula_arg_positions(narts_high.nart_hl_formula(formula), arg, test);
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_arg_positions(fi.assertion_hl_formula(formula, UNPROVIDED), arg, test);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; a list of positions (argnums) where ARG appears in EL-FORMULA.
     */
    @LispMethod(comment = "@return list; a list of positions (argnums) where ARG appears in EL-FORMULA.")
    public static final SubLObject el_formula_arg_positions_alt(SubLObject el_formula, SubLObject arg, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        SubLTrampolineFile.checkType(el_formula, EL_FORMULA_P);
        {
            SubLObject result = NIL;
            SubLObject terms = com.cyc.cycjava.cycl.cycl_utilities.formula_terms(el_formula, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != funcall(test, v_term, arg)) {
                    result = cons(argnum, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return list; a list of positions (argnums) where ARG appears in EL-FORMULA.
     */
    @LispMethod(comment = "@return list; a list of positions (argnums) where ARG appears in EL-FORMULA.")
    public static SubLObject el_formula_arg_positions(final SubLObject el_formula, final SubLObject arg, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        assert NIL != el_formula_p(el_formula) : "! el_utilities.el_formula_p(el_formula) " + ("el_utilities.el_formula_p(el_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(el_formula) ") + el_formula;
        SubLObject result = NIL;
        final SubLObject terms = formula_terms(el_formula, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if (NIL != funcall(test, v_term, arg)) {
                result = cons(argnum, result);
            }
        }
        return nreverse(result);
    }

    public static SubLObject possibly_conjuncts(final SubLObject el_formula) {
        if (NIL != el_conjunction_p(el_formula)) {
            return formula_args(el_formula, UNPROVIDED);
        }
        return list(el_formula);
    }

    /**
     * returns the arity of NAT (the number of arguments).
     * This will be an integer if NAT is a nat,
     * and NIL otherwise.
     * The operator itself does not count as an argument.
     * If seqvar-handling is :regularize, then sequence variables count as a single argument.
     * Hence, (SomethingFn <form1> <form2> <form3>) is a nat of arity 3,
     * and (SomethingFn <form1> <form2> <form3> . ?SEQ) is a nat of arity 4.
     * If seqvar-handling is :ignore, then sequence variables don't count, so both of those would be arity 3.
     * Don't pass it :include.
     */
    @LispMethod(comment = "returns the arity of NAT (the number of arguments).\r\nThis will be an integer if NAT is a nat,\r\nand NIL otherwise.\r\nThe operator itself does not count as an argument.\r\nIf seqvar-handling is :regularize, then sequence variables count as a single argument.\r\nHence, (SomethingFn <form1> <form2> <form3>) is a nat of arity 3,\r\nand (SomethingFn <form1> <form2> <form3> . ?SEQ) is a nat of arity 4.\r\nIf seqvar-handling is :ignore, then sequence variables don\'t count, so both of those would be arity 3.\r\nDon\'t pass it :include.\nreturns the arity of NAT (the number of arguments).\nThis will be an integer if NAT is a nat,\nand NIL otherwise.\nThe operator itself does not count as an argument.\nIf seqvar-handling is :regularize, then sequence variables count as a single argument.\nHence, (SomethingFn <form1> <form2> <form3>) is a nat of arity 3,\nand (SomethingFn <form1> <form2> <form3> . ?SEQ) is a nat of arity 4.\nIf seqvar-handling is :ignore, then sequence variables don\'t count, so both of those would be arity 3.\nDon\'t pass it :include.")
    public static final SubLObject nat_arity_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return length(com.cyc.cycjava.cycl.cycl_utilities.nat_args(nat, seqvar_handling));
    }

    @LispMethod(comment = "returns the arity of NAT (the number of arguments).\r\nThis will be an integer if NAT is a nat,\r\nand NIL otherwise.\r\nThe operator itself does not count as an argument.\r\nIf seqvar-handling is :regularize, then sequence variables count as a single argument.\r\nHence, (SomethingFn <form1> <form2> <form3>) is a nat of arity 3,\r\nand (SomethingFn <form1> <form2> <form3> . ?SEQ) is a nat of arity 4.\r\nIf seqvar-handling is :ignore, then sequence variables don\'t count, so both of those would be arity 3.\r\nDon\'t pass it :include.\nreturns the arity of NAT (the number of arguments).\nThis will be an integer if NAT is a nat,\nand NIL otherwise.\nThe operator itself does not count as an argument.\nIf seqvar-handling is :regularize, then sequence variables count as a single argument.\nHence, (SomethingFn <form1> <form2> <form3>) is a nat of arity 3,\nand (SomethingFn <form1> <form2> <form3> . ?SEQ) is a nat of arity 4.\nIf seqvar-handling is :ignore, then sequence variables don\'t count, so both of those would be arity 3.\nDon\'t pass it :include.")
    public static SubLObject nat_arity(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return length(nat_args(nat, seqvar_handling));
    }/**
     * returns the arity of NAT (the number of arguments).
     * This will be an integer if NAT is a nat,
     * and NIL otherwise.
     * The operator itself does not count as an argument.
     * If seqvar-handling is :regularize, then sequence variables count as a single argument.
     * Hence, (SomethingFn <form1> <form2> <form3>) is a nat of arity 3,
     * and (SomethingFn <form1> <form2> <form3> . ?SEQ) is a nat of arity 4.
     * If seqvar-handling is :ignore, then sequence variables don't count, so both of those would be arity 3.
     * Don't pass it :include.
     */


    /**
     * returns (as a list or a variable) the arguments of NAT.
     * returns NIL if NAT is not a nat.
     * If seqvar-handling is :ignore, it chops off the sequence var if there is one.
     * If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
     * If seqvar-handling is :include, it returns it as a sequence var.
     */
    @LispMethod(comment = "returns (as a list or a variable) the arguments of NAT.\r\nreturns NIL if NAT is not a nat.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\nreturns (as a list or a variable) the arguments of NAT.\nreturns NIL if NAT is not a nat.\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\nIf seqvar-handling is :include, it returns it as a sequence var.")
    public static final SubLObject nat_args_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_args(nat, seqvar_handling);
    }

    @LispMethod(comment = "returns (as a list or a variable) the arguments of NAT.\r\nreturns NIL if NAT is not a nat.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\nreturns (as a list or a variable) the arguments of NAT.\nreturns NIL if NAT is not a nat.\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\nIf seqvar-handling is :include, it returns it as a sequence var.")
    public static SubLObject nat_args(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_args(nat, seqvar_handling);
    }/**
     * returns (as a list or a variable) the arguments of NAT.
     * returns NIL if NAT is not a nat.
     * If seqvar-handling is :ignore, it chops off the sequence var if there is one.
     * If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
     * If seqvar-handling is :include, it returns it as a sequence var.
     */


    /**
     * returns (as a list or a variable) the arguments of NAUT.
     * If seqvar-handling is :ignore, it chops off the sequence var if there is one.
     * If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
     * If seqvar-handling is :include, it returns it as a sequence var.
     */
    @LispMethod(comment = "returns (as a list or a variable) the arguments of NAUT.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\nreturns (as a list or a variable) the arguments of NAUT.\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\nIf seqvar-handling is :include, it returns it as a sequence var.")
    public static final SubLObject naut_args_alt(SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        SubLTrampolineFile.checkType(naut, POSSIBLY_NAUT_P);
        return com.cyc.cycjava.cycl.cycl_utilities.el_formula_args(naut, seqvar_handling);
    }

    @LispMethod(comment = "returns (as a list or a variable) the arguments of NAUT.\r\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\r\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\r\nIf seqvar-handling is :include, it returns it as a sequence var.\nreturns (as a list or a variable) the arguments of NAUT.\nIf seqvar-handling is :ignore, it chops off the sequence var if there is one.\nIf seqvar-handling is :regularize, it treats the sequence var as a regular variable.\nIf seqvar-handling is :include, it returns it as a sequence var.")
    public static SubLObject naut_args(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        assert NIL != possibly_naut_p(naut) : "! el_utilities.possibly_naut_p(naut) " + ("el_utilities.possibly_naut_p(naut) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(naut) ") + naut;
        return el_formula_args(naut, seqvar_handling);
    }/**
     * returns (as a list or a variable) the arguments of NAUT.
     * If seqvar-handling is :ignore, it chops off the sequence var if there is one.
     * If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
     * If seqvar-handling is :include, it returns it as a sequence var.
     */


    /**
     * return the argument in position N of non-atomic term NAT.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */
    @LispMethod(comment = "return the argument in position N of non-atomic term NAT.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturn the argument in position N of non-atomic term NAT.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static final SubLObject nat_arg_alt(SubLObject nat, SubLObject n, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(nat, n, seqvar_handling);
    }

    @LispMethod(comment = "return the argument in position N of non-atomic term NAT.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturn the argument in position N of non-atomic term NAT.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static SubLObject nat_arg(final SubLObject nat, final SubLObject n, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(nat, n, seqvar_handling);
    }/**
     * return the argument in position N of non-atomic term NAT.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */


    /**
     * return the argument in position N of non-atomic unreified term NAUT.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (naut-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (naut-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */
    @LispMethod(comment = "return the argument in position N of non-atomic unreified term NAUT.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (naut-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (naut-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturn the argument in position N of non-atomic unreified term NAUT.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (naut-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (naut-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static final SubLObject naut_arg_alt(SubLObject naut, SubLObject n, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        SubLTrampolineFile.checkType(naut, POSSIBLY_NAUT_P);
        return com.cyc.cycjava.cycl.cycl_utilities.el_formula_arg(naut, n, seqvar_handling);
    }

    @LispMethod(comment = "return the argument in position N of non-atomic unreified term NAUT.\r\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\r\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\r\ne.g. (naut-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\r\nbut  (naut-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ\nreturn the argument in position N of non-atomic unreified term NAUT.\nIf seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.\nIf seqvar-handling is :regularize, it will return the sequence variable if asked for its position.\ne.g. (naut-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL\nbut  (naut-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ")
    public static SubLObject naut_arg(final SubLObject naut, final SubLObject n, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        assert NIL != possibly_naut_p(naut) : "! el_utilities.possibly_naut_p(naut) " + ("el_utilities.possibly_naut_p(naut) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(naut) ") + naut;
        return el_formula_arg(naut, n, seqvar_handling);
    }/**
     * return the argument in position N of non-atomic unreified term NAUT.
     * If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
     * If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
     * e.g. (naut-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL
     * but  (naut-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ
     */


    public static final SubLObject nat_function_alt(SubLObject nat) {
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg0(nat);
    }

    public static SubLObject nat_function(final SubLObject nat) {
        return nat_arg0(nat);
    }

    /**
     * returns the functor of NAT.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the functor of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the functor of NAT.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_functor_alt(SubLObject nat) {
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg0(nat);
    }

    @LispMethod(comment = "returns the functor of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the functor of NAT.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_functor(final SubLObject nat) {
        return nat_arg0(nat);
    }/**
     * returns the functor of NAT.
     * returns NIL if NAT is not a nat.
     */


    /**
     * returns the functor of NAUT.
     */
    @LispMethod(comment = "returns the functor of NAUT.")
    public static final SubLObject naut_functor_alt(SubLObject naut) {
        return com.cyc.cycjava.cycl.cycl_utilities.el_formula_operator(naut);
    }

    @LispMethod(comment = "returns the functor of NAUT.")
    public static SubLObject naut_functor(final SubLObject naut) {
        return el_formula_operator(naut);
    }/**
     * returns the functor of NAUT.
     */


    /**
     * returns the 0th argument of NAT, which is by convention the functor.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the 0th argument of NAT, which is by convention the functor.\r\nreturns NIL if NAT is not a nat.\nreturns the 0th argument of NAT, which is by convention the functor.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_arg0_alt(SubLObject nat) {
        if (NIL != el_formula_p(nat)) {
            return com.cyc.cycjava.cycl.cycl_utilities.naut_functor(nat);
        } else {
            if (NIL != nart_handles.nart_p(nat)) {
                return com.cyc.cycjava.cycl.cycl_utilities.naut_functor(nart_hl_formula(nat));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "returns the 0th argument of NAT, which is by convention the functor.\r\nreturns NIL if NAT is not a nat.\nreturns the 0th argument of NAT, which is by convention the functor.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_arg0(final SubLObject nat) {
        if (NIL != el_formula_p(nat)) {
            return naut_functor(nat);
        }
        if (NIL != nart_handles.nart_p(nat)) {
            return naut_functor(narts_high.nart_hl_formula(nat));
        }
        return NIL;
    }/**
     * returns the 0th argument of NAT, which is by convention the functor.
     * returns NIL if NAT is not a nat.
     */


    /**
     * returns the 1st argument of NAT.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the 1st argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 1st argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_arg1_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg(nat, ONE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 1st argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 1st argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_arg1(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return nat_arg(nat, ONE_INTEGER, seqvar_handling);
    }/**
     * returns the 1st argument of NAT.
     * returns NIL if NAT is not a nat.
     */


    /**
     * returns the 1st argument of NAUT.
     */
    @LispMethod(comment = "returns the 1st argument of NAUT.")
    public static final SubLObject naut_arg1_alt(SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.naut_arg(naut, ONE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 1st argument of NAUT.")
    public static SubLObject naut_arg1(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return naut_arg(naut, ONE_INTEGER, seqvar_handling);
    }/**
     * returns the 1st argument of NAUT.
     */


    /**
     * returns the 2nd argument of NAT.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the 2nd argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 2nd argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_arg2_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg(nat, TWO_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 2nd argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 2nd argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_arg2(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return nat_arg(nat, TWO_INTEGER, seqvar_handling);
    }/**
     * returns the 2nd argument of NAT.
     * returns NIL if NAT is not a nat.
     */


    /**
     * returns the 2nd argument of NAUT.
     */
    @LispMethod(comment = "returns the 2nd argument of NAUT.")
    public static final SubLObject naut_arg2_alt(SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.naut_arg(naut, TWO_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 2nd argument of NAUT.")
    public static SubLObject naut_arg2(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return naut_arg(naut, TWO_INTEGER, seqvar_handling);
    }/**
     * returns the 2nd argument of NAUT.
     */


    /**
     * returns the 3rd argument of NAT.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the 3rd argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 3rd argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_arg3_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg(nat, THREE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 3rd argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 3rd argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_arg3(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return nat_arg(nat, THREE_INTEGER, seqvar_handling);
    }/**
     * returns the 3rd argument of NAT.
     * returns NIL if NAT is not a nat.
     */


    public static SubLObject naut_arg3(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return naut_arg(naut, THREE_INTEGER, seqvar_handling);
    }

    /**
     * returns the 4th argument of NAT.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the 4th argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 4th argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_arg4_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg(nat, FOUR_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 4th argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 4th argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_arg4(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return nat_arg(nat, FOUR_INTEGER, seqvar_handling);
    }/**
     * returns the 4th argument of NAT.
     * returns NIL if NAT is not a nat.
     */


    /**
     * returns the 5th argument of NAT.
     * returns NIL if NAT is not a nat.
     */
    @LispMethod(comment = "returns the 5th argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 5th argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static final SubLObject nat_arg5_alt(SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.nat_arg(nat, FIVE_INTEGER, seqvar_handling);
    }

    @LispMethod(comment = "returns the 5th argument of NAT.\r\nreturns NIL if NAT is not a nat.\nreturns the 5th argument of NAT.\nreturns NIL if NAT is not a nat.")
    public static SubLObject nat_arg5(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return nat_arg(nat, FIVE_INTEGER, seqvar_handling);
    }/**
     * returns the 5th argument of NAT.
     * returns NIL if NAT is not a nat.
     */


    public static SubLObject nat_with_functor_p(final SubLObject v_object, final SubLObject functor) {
        return makeBoolean((NIL != possibly_nat_p(v_object)) && nat_functor(v_object).eql(functor));
    }

    public static SubLObject naut_with_functor_p(final SubLObject v_object, final SubLObject functor) {
        return el_formula_with_operator_p(v_object, functor);
    }

    public static SubLObject naut_with_any_of_functors_p(final SubLObject v_object, final SubLObject functors) {
        return el_formula_with_any_of_operators_p(v_object, functors);
    }

    public static final SubLObject cycl_nat_with_functor_p_alt(SubLObject v_object, SubLObject functor) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && (com.cyc.cycjava.cycl.cycl_utilities.nat_functor(v_object) == functor));
    }

    public static SubLObject cycl_nat_with_functor_p(final SubLObject v_object, final SubLObject functor) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && nat_functor(v_object).eql(functor));
    }

    public static final SubLObject sentence_arg_alt(SubLObject sentence, SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(sentence, argnum, seqvar_handling);
    }

    public static SubLObject sentence_arg(final SubLObject sentence, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(sentence, argnum, seqvar_handling);
    }

    public static final SubLObject sentence_args_alt(SubLObject sentence, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_args(sentence, seqvar_handling);
    }

    public static SubLObject sentence_args(final SubLObject sentence, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_args(sentence, seqvar_handling);
    }

    public static final SubLObject sentence_truth_function_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(sentence);
    }

    public static SubLObject sentence_truth_function(final SubLObject sentence) {
        return formula_arg0(sentence);
    }

    public static final SubLObject sentence_arg0_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(sentence);
    }

    public static SubLObject sentence_arg0(final SubLObject sentence) {
        return formula_arg0(sentence);
    }

    public static final SubLObject sentence_arg1_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(asent, seqvar_handling);
    }

    public static SubLObject sentence_arg1(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg1(asent, seqvar_handling);
    }

    public static final SubLObject sentence_arg2_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(asent, seqvar_handling);
    }

    public static SubLObject sentence_arg2(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg2(asent, seqvar_handling);
    }

    public static final SubLObject sentence_arg3_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg3(asent, seqvar_handling);
    }

    public static SubLObject sentence_arg3(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg3(asent, seqvar_handling);
    }

    public static final SubLObject sentence_arg4_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg4(asent, seqvar_handling);
    }

    public static SubLObject sentence_arg4(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg4(asent, seqvar_handling);
    }

    public static final SubLObject sentence_arg5_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg5(asent, seqvar_handling);
    }

    public static SubLObject sentence_arg5(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg5(asent, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_arg_alt(SubLObject asent, SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg(asent, argnum, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg(final SubLObject asent, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg(asent, argnum, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_args_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_args(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_args(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_args(asent, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_predicate_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(asent);
    }

    public static SubLObject atomic_sentence_predicate(final SubLObject asent) {
        return formula_arg0(asent);
    }

    public static final SubLObject atomic_sentence_arg0_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg0(asent);
    }

    public static SubLObject atomic_sentence_arg0(final SubLObject asent) {
        return formula_arg0(asent);
    }

    public static final SubLObject atomic_sentence_arg1_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg1(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg1(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg1(asent, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_arg2_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg2(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg2(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg2(asent, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_arg3_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg3(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg3(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg3(asent, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_arg4_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg4(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg4(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg4(asent, seqvar_handling);
    }

    public static final SubLObject atomic_sentence_arg5_alt(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg5(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg5(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg5(asent, seqvar_handling);
    }

    public static SubLObject atomic_sentence_arg6(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = $IGNORE;
        }
        return formula_arg6(asent, seqvar_handling);
    }

    public static final SubLObject arg_position_p_alt(SubLObject v_object) {
        return list_utilities.non_empty_list_of_type_p(symbol_function(FIXNUMP), v_object);
    }

    public static SubLObject arg_position_p(final SubLObject v_object) {
        return list_utilities.non_empty_list_of_type_p(symbol_function(FIXNUMP), v_object);
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p.
     * 		
     * @param ARG-POSITION
     * 		listp of integers, which when taken on FORMULA as Ns in (formula-arg N) in sequence, lead to the item to be returned.
     * @param DEFAULT;
     * 		What to return if FORMULA does not contain an argument at ARG-POSITION.
     * @unknown (formula-arg-position '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog) '(1 0)) #$GroupFn
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p.\r\n\t\t\r\n@param ARG-POSITION\r\n\t\tlistp of integers, which when taken on FORMULA as Ns in (formula-arg N) in sequence, lead to the item to be returned.\r\n@param DEFAULT;\r\n\t\tWhat to return if FORMULA does not contain an argument at ARG-POSITION.\r\n@unknown (formula-arg-position \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog) \'(1 0)) #$GroupFn")
    public static final SubLObject formula_arg_position_alt(SubLObject formula, SubLObject arg_position, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return list_utilities.get_nested_nth(elf_to_list(formula), arg_position, v_default);
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p.
     * 		
     * @param ARG-POSITION
     * 		listp of integers, which when taken on FORMULA as Ns in (formula-arg N) in sequence, lead to the item to be returned.
     * @param DEFAULT;
     * 		What to return if FORMULA does not contain an argument at ARG-POSITION.
     * @unknown (formula-arg-position '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog) '(1 0)) #$GroupFn
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p.\r\n\t\t\r\n@param ARG-POSITION\r\n\t\tlistp of integers, which when taken on FORMULA as Ns in (formula-arg N) in sequence, lead to the item to be returned.\r\n@param DEFAULT;\r\n\t\tWhat to return if FORMULA does not contain an argument at ARG-POSITION.\r\n@unknown (formula-arg-position \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog) \'(1 0)) #$GroupFn")
    public static SubLObject formula_arg_position(final SubLObject formula, final SubLObject arg_position, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return list_utilities.get_nested_nth(elf_to_list(formula), arg_position, v_default);
    }

    public static final SubLObject get_nested_nth_arg_alt(SubLObject formula, SubLObject where, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position(formula, where, v_default);
    }

    public static SubLObject get_nested_nth_arg(final SubLObject formula, final SubLObject where, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return formula_arg_position(formula, where, v_default);
    }

    /**
     * Returns a list of the positions of ITEM in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to ITEM.
     * It does a depth-first search, so if there is more than one occurrence of ITEM in FORMULA,
     * the ones nearest the top will be nearest the beginning.
     *
     * @unknown (arg-positions-dfs #$Dog '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))
     * @see arg-positions-bfs
     * @unknown pace
     */
    @LispMethod(comment = "Returns a list of the positions of ITEM in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\r\nIt does a depth-first search, so if there is more than one occurrence of ITEM in FORMULA,\r\nthe ones nearest the top will be nearest the beginning.\r\n\r\n@unknown (arg-positions-dfs #$Dog \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))\r\n@see arg-positions-bfs\r\n@unknown pace\nReturns a list of the positions of ITEM in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\nIt does a depth-first search, so if there is more than one occurrence of ITEM in FORMULA,\nthe ones nearest the top will be nearest the beginning.")
    public static final SubLObject arg_positions_dfs_alt(SubLObject item, SubLObject formula, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return list_utilities.tree_positions_dfs(item, elf_to_list(formula), test);
    }

    @LispMethod(comment = "Returns a list of the positions of ITEM in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\r\nIt does a depth-first search, so if there is more than one occurrence of ITEM in FORMULA,\r\nthe ones nearest the top will be nearest the beginning.\r\n\r\n@unknown (arg-positions-dfs #$Dog \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))\r\n@see arg-positions-bfs\r\n@unknown pace\nReturns a list of the positions of ITEM in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\nIt does a depth-first search, so if there is more than one occurrence of ITEM in FORMULA,\nthe ones nearest the top will be nearest the beginning.")
    public static SubLObject arg_positions_dfs(final SubLObject item, final SubLObject formula, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return list_utilities.tree_positions_dfs(item, elf_to_list(formula), test);
    }/**
     * Returns a list of the positions of ITEM in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to ITEM.
     * It does a depth-first search, so if there is more than one occurrence of ITEM in FORMULA,
     * the ones nearest the top will be nearest the beginning.
     *
     * @unknown (arg-positions-dfs #$Dog '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))
     * @see arg-positions-bfs
     * @unknown pace
     */


    /**
     * Returns a list of the positions of ITEM in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to ITEM.
     * It does a breadth-first search, so if there is more than one occurrence of ITEM in FORMULA,
     * the ones nearest the beginning will be nearest the beginning.
     *
     * @unknown (arg-positions-bfs #$Dog '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))
     * @see arg-positions-dfs
     * @unknown pace
     */
    @LispMethod(comment = "Returns a list of the positions of ITEM in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\r\nIt does a breadth-first search, so if there is more than one occurrence of ITEM in FORMULA,\r\nthe ones nearest the beginning will be nearest the beginning.\r\n\r\n@unknown (arg-positions-bfs #$Dog \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))\r\n@see arg-positions-dfs\r\n@unknown pace\nReturns a list of the positions of ITEM in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\nIt does a breadth-first search, so if there is more than one occurrence of ITEM in FORMULA,\nthe ones nearest the beginning will be nearest the beginning.")
    public static final SubLObject arg_positions_bfs_alt(SubLObject item, SubLObject formula, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.tree_positions_bfs(item, elf_to_list(formula), test);
    }

    @LispMethod(comment = "Returns a list of the positions of ITEM in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\r\nIt does a breadth-first search, so if there is more than one occurrence of ITEM in FORMULA,\r\nthe ones nearest the beginning will be nearest the beginning.\r\n\r\n@unknown (arg-positions-bfs #$Dog \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))\r\n@see arg-positions-dfs\r\n@unknown pace\nReturns a list of the positions of ITEM in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to ITEM.\nIt does a breadth-first search, so if there is more than one occurrence of ITEM in FORMULA,\nthe ones nearest the beginning will be nearest the beginning.")
    public static SubLObject arg_positions_bfs(final SubLObject item, final SubLObject formula, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.tree_positions_bfs(item, elf_to_list(formula), test);
    }/**
     * Returns a list of the positions of ITEM in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to ITEM.
     * It does a breadth-first search, so if there is more than one occurrence of ITEM in FORMULA,
     * the ones nearest the beginning will be nearest the beginning.
     *
     * @unknown (arg-positions-bfs #$Dog '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))
     * @see arg-positions-dfs
     * @unknown pace
     */


    /**
     * Returns a list of the positions of items passing TEST in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to TEST.
     * It does a depth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,
     * the ones nearest the beginning will be nearest the beginning.
     *
     * @unknown (arg-positions-if-dfs 'collection-p '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))
     * @see arg-positions-if-bfs
     * @unknown baxter
     */
    @LispMethod(comment = "Returns a list of the positions of items passing TEST in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\r\nIt does a depth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\r\nthe ones nearest the beginning will be nearest the beginning.\r\n\r\n@unknown (arg-positions-if-dfs \'collection-p \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))\r\n@see arg-positions-if-bfs\r\n@unknown baxter\nReturns a list of the positions of items passing TEST in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\nIt does a depth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\nthe ones nearest the beginning will be nearest the beginning.")
    public static final SubLObject arg_positions_if_dfs_alt(SubLObject test, SubLObject formula, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return list_utilities.tree_positions_if_dfs(test, elf_to_list(formula), key);
    }

    @LispMethod(comment = "Returns a list of the positions of items passing TEST in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\r\nIt does a depth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\r\nthe ones nearest the beginning will be nearest the beginning.\r\n\r\n@unknown (arg-positions-if-dfs \'collection-p \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))\r\n@see arg-positions-if-bfs\r\n@unknown baxter\nReturns a list of the positions of items passing TEST in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\nIt does a depth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\nthe ones nearest the beginning will be nearest the beginning.")
    public static SubLObject arg_positions_if_dfs(final SubLObject test, final SubLObject formula, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return list_utilities.tree_positions_if_dfs(test, elf_to_list(formula), key);
    }/**
     * Returns a list of the positions of items passing TEST in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to TEST.
     * It does a depth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,
     * the ones nearest the beginning will be nearest the beginning.
     *
     * @unknown (arg-positions-if-dfs 'collection-p '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((1 1) (2))
     * @see arg-positions-if-bfs
     * @unknown baxter
     */


    /**
     * Returns a list of the positions of items passing TEST in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to TEST.
     * It does a breadth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,
     * the ones nearest the top will be nearest the beginning.
     *
     * @unknown (arg-positions-if-bfs 'collection-p '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))
     * @see arg-positions-if-dfs
     * @unknown baxter
     */
    @LispMethod(comment = "Returns a list of the positions of items passing TEST in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\r\nIt does a breadth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\r\nthe ones nearest the top will be nearest the beginning.\r\n\r\n@unknown (arg-positions-if-bfs \'collection-p \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))\r\n@see arg-positions-if-dfs\r\n@unknown baxter\nReturns a list of the positions of items passing TEST in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\nIt does a breadth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\nthe ones nearest the top will be nearest the beginning.")
    public static final SubLObject arg_positions_if_bfs_alt(SubLObject test, SubLObject formula, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return list_utilities.tree_positions_if_bfs(test, elf_to_list(formula), key);
    }

    @LispMethod(comment = "Returns a list of the positions of items passing TEST in FORMULA as a list of lists.\r\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\r\nIt does a breadth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\r\nthe ones nearest the top will be nearest the beginning.\r\n\r\n@unknown (arg-positions-if-bfs \'collection-p \'(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))\r\n@see arg-positions-if-dfs\r\n@unknown baxter\nReturns a list of the positions of items passing TEST in FORMULA as a list of lists.\nTaking successive (formula-arg n)\'s of any element of this list on FORMULA will lead you back to TEST.\nIt does a breadth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,\nthe ones nearest the top will be nearest the beginning.")
    public static SubLObject arg_positions_if_bfs(final SubLObject test, final SubLObject formula, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return list_utilities.tree_positions_if_bfs(test, elf_to_list(formula), key);
    }/**
     * Returns a list of the positions of items passing TEST in FORMULA as a list of lists.
     * Taking successive (formula-arg n)'s of any element of this list on FORMULA will lead you back to TEST.
     * It does a breadth-first search, so if there is more than one occurrence of items passing TEST in FORMULA,
     * the ones nearest the top will be nearest the beginning.
     *
     * @unknown (arg-positions-if-bfs 'collection-p '(#$conceptuallyRelated (#$GroupFn #$Dog) #$Dog)) ((2) (1 1))
     * @see arg-positions-if-dfs
     * @unknown baxter
     */


    /**
     *
     *
     * @return nil or cycl-sentence-p; the smallest enclosing CycL sentence of the expression
    at ARG-POSITION of the EL formula FORMULA.
     */
    @LispMethod(comment = "@return nil or cycl-sentence-p; the smallest enclosing CycL sentence of the expression\r\nat ARG-POSITION of the EL formula FORMULA.")
    public static final SubLObject smallest_enclosing_cycl_sentence_alt(SubLObject formula, SubLObject arg_position) {
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        {
            SubLObject argpos = arg_position;
            while (NIL != argpos) {
                {
                    SubLObject subexpression = com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position(formula, argpos, UNPROVIDED);
                    if (NIL != cycl_grammar.cycl_sentence_p(subexpression)) {
                        return subexpression;
                    }
                }
                argpos = butlast(argpos, UNPROVIDED);
            } 
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or cycl-sentence-p; the smallest enclosing CycL sentence of the expression
    at ARG-POSITION of the EL formula FORMULA.
     */
    @LispMethod(comment = "@return nil or cycl-sentence-p; the smallest enclosing CycL sentence of the expression\r\nat ARG-POSITION of the EL formula FORMULA.")
    public static SubLObject smallest_enclosing_cycl_sentence(final SubLObject formula, final SubLObject arg_position) {
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        for (SubLObject argpos = arg_position; NIL != argpos; argpos = butlast(argpos, UNPROVIDED)) {
            final SubLObject subexpression = formula_arg_position(formula, argpos, UNPROVIDED);
            if (NIL != cycl_grammar.cycl_sentence_p(subexpression)) {
                return subexpression;
            }
        }
        return NIL;
    }

    public static final SubLObject cycl_arg_position_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$FormulaArgPositionFn)) && (NIL != com.cyc.cycjava.cycl.cycl_utilities.arg_position_p(com.cyc.cycjava.cycl.cycl_utilities.formula_args(v_object, UNPROVIDED))));
    }

    public static SubLObject cycl_arg_position_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$FormulaArgPositionFn)) && (NIL != arg_position_p(formula_args(v_object, UNPROVIDED))));
    }

    public static final SubLObject make_cycl_arg_position_alt(SubLObject arg_position) {
        SubLTrampolineFile.checkType(arg_position, ARG_POSITION_P);
        return make_el_formula($$FormulaArgPositionFn, arg_position, UNPROVIDED);
    }

    public static SubLObject make_cycl_arg_position(final SubLObject arg_position) {
        assert NIL != arg_position_p(arg_position) : "! cycl_utilities.arg_position_p(arg_position) " + ("cycl_utilities.arg_position_p(arg_position) " + "CommonSymbols.NIL != cycl_utilities.arg_position_p(arg_position) ") + arg_position;
        return make_el_formula($$FormulaArgPositionFn, arg_position, UNPROVIDED);
    }

    public static final SubLObject cycl_arg_position_to_arg_position_alt(SubLObject cycl_arg_position) {
        SubLTrampolineFile.checkType(cycl_arg_position, CYCL_ARG_POSITION_P);
        return com.cyc.cycjava.cycl.cycl_utilities.formula_args(cycl_arg_position, UNPROVIDED);
    }

    public static SubLObject cycl_arg_position_to_arg_position(final SubLObject cycl_arg_position) {
        assert NIL != cycl_arg_position_p(cycl_arg_position) : "! cycl_utilities.cycl_arg_position_p(cycl_arg_position) " + ("cycl_utilities.cycl_arg_position_p(cycl_arg_position) " + "CommonSymbols.NIL != cycl_utilities.cycl_arg_position_p(cycl_arg_position) ") + cycl_arg_position;
        return formula_args(cycl_arg_position, UNPROVIDED);
    }

    /**
     * Like @xref FORMULA-ARG-POSITION, except it takes a cycl-arg-position-p
     */
    @LispMethod(comment = "Like @xref FORMULA-ARG-POSITION, except it takes a cycl-arg-position-p")
    public static final SubLObject formula_cycl_arg_position_alt(SubLObject formula, SubLObject argpos, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        SubLTrampolineFile.checkType(argpos, CYCL_ARG_POSITION_P);
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position(formula, com.cyc.cycjava.cycl.cycl_utilities.cycl_arg_position_to_arg_position(argpos), v_default);
    }

    @LispMethod(comment = "Like @xref FORMULA-ARG-POSITION, except it takes a cycl-arg-position-p")
    public static SubLObject formula_cycl_arg_position(final SubLObject formula, final SubLObject argpos, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        assert NIL != cycl_arg_position_p(argpos) : "! cycl_utilities.cycl_arg_position_p(argpos) " + ("cycl_utilities.cycl_arg_position_p(argpos) " + "CommonSymbols.NIL != cycl_utilities.cycl_arg_position_p(argpos) ") + argpos;
        return formula_arg_position(formula, cycl_arg_position_to_arg_position(argpos), v_default);
    }/**
     * Like @xref FORMULA-ARG-POSITION, except it takes a cycl-arg-position-p
     */


    /**
     * Destructively substitute TERM into FORMULA at ARGPOS.
     */
    @LispMethod(comment = "Destructively substitute TERM into FORMULA at ARGPOS.")
    public static final SubLObject cycl_arg_position_nsubst_alt(SubLObject v_term, SubLObject argpos, SubLObject formula) {
        SubLTrampolineFile.checkType(argpos, CYCL_ARG_POSITION_P);
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.cycl_utilities.formula_arg_position_nsubst(v_term, com.cyc.cycjava.cycl.cycl_utilities.cycl_arg_position_to_arg_position(argpos), formula);
    }

    @LispMethod(comment = "Destructively substitute TERM into FORMULA at ARGPOS.")
    public static SubLObject cycl_arg_position_nsubst(final SubLObject v_term, final SubLObject argpos, final SubLObject formula) {
        assert NIL != cycl_arg_position_p(argpos) : "! cycl_utilities.cycl_arg_position_p(argpos) " + ("cycl_utilities.cycl_arg_position_p(argpos) " + "CommonSymbols.NIL != cycl_utilities.cycl_arg_position_p(argpos) ") + argpos;
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        return formula_arg_position_nsubst(v_term, cycl_arg_position_to_arg_position(argpos), formula);
    }/**
     * Destructively substitute TERM into FORMULA at ARGPOS.
     */


    /**
     * TERMS and ARG-POSITIONS are paired lists.
     * Non-destructively substitute each term in TERMS into FORMULA at its corresponding arg-position in ARG-POSITIONS.
     */
    @LispMethod(comment = "TERMS and ARG-POSITIONS are paired lists.\r\nNon-destructively substitute each term in TERMS into FORMULA at its corresponding arg-position in ARG-POSITIONS.\nTERMS and ARG-POSITIONS are paired lists.\nNon-destructively substitute each term in TERMS into FORMULA at its corresponding arg-position in ARG-POSITIONS.")
    public static final SubLObject substitute_terms_into_positions_alt(SubLObject terms, SubLObject arg_positions, SubLObject formula) {
        SubLTrampolineFile.checkType(terms, NON_DOTTED_LIST_P);
        {
            SubLObject list_var = arg_positions;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, CYCL_ARG_POSITION_P);
                }
            }
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        {
            SubLObject result = copy_tree(formula);
            SubLObject v_term = NIL;
            SubLObject v_term_18 = NIL;
            SubLObject argpos = NIL;
            SubLObject argpos_19 = NIL;
            for (v_term = terms, v_term_18 = v_term.first(), argpos = arg_positions, argpos_19 = argpos.first(); !((NIL == argpos) && (NIL == v_term)); v_term = v_term.rest() , v_term_18 = v_term.first() , argpos = argpos.rest() , argpos_19 = argpos.first()) {
                com.cyc.cycjava.cycl.cycl_utilities.cycl_arg_position_nsubst(v_term_18, argpos_19, result);
            }
            return result;
        }
    }

    @LispMethod(comment = "TERMS and ARG-POSITIONS are paired lists.\r\nNon-destructively substitute each term in TERMS into FORMULA at its corresponding arg-position in ARG-POSITIONS.\nTERMS and ARG-POSITIONS are paired lists.\nNon-destructively substitute each term in TERMS into FORMULA at its corresponding arg-position in ARG-POSITIONS.")
    public static SubLObject substitute_terms_into_positions(final SubLObject terms, final SubLObject arg_positions, final SubLObject formula) {
        assert NIL != list_utilities.non_dotted_list_p(terms) : "! list_utilities.non_dotted_list_p(terms) " + ("list_utilities.non_dotted_list_p(terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(terms) ") + terms;
        assert NIL != list_utilities.non_dotted_list_p(arg_positions) : "! list_utilities.non_dotted_list_p(arg_positions) " + ("list_utilities.non_dotted_list_p(arg_positions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(arg_positions) ") + arg_positions;
        SubLObject cdolist_list_var = arg_positions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != cycl_arg_position_p(elem) : "! cycl_utilities.cycl_arg_position_p(elem) " + ("cycl_utilities.cycl_arg_position_p(elem) " + "CommonSymbols.NIL != cycl_utilities.cycl_arg_position_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        final SubLObject result = copy_tree(formula);
        SubLObject v_term = NIL;
        SubLObject v_term_$18 = NIL;
        SubLObject argpos = NIL;
        SubLObject argpos_$19 = NIL;
        v_term = terms;
        v_term_$18 = v_term.first();
        argpos = arg_positions;
        argpos_$19 = argpos.first();
        while ((NIL != argpos) || (NIL != v_term)) {
            cycl_arg_position_nsubst(v_term_$18, argpos_$19, result);
            v_term = v_term.rest();
            v_term_$18 = v_term.first();
            argpos = argpos.rest();
            argpos_$19 = argpos.first();
        } 
        return result;
    }/**
     * TERMS and ARG-POSITIONS are paired lists.
     * Non-destructively substitute each term in TERMS into FORMULA at its corresponding arg-position in ARG-POSITIONS.
     */


    public static final SubLObject declare_cycl_utilities_file_alt() {
        declareMacro("with_opaque_arg_function", "WITH-OPAQUE-ARG-FUNCTION");
        declareMacro("with_opaque_seqvar_function", "WITH-OPAQUE-SEQVAR-FUNCTION");
        declareFunction("opaque_argP", "OPAQUE-ARG?", 2, 0, false);
        declareFunction("opaque_argP_int", "OPAQUE-ARG?-INT", 3, 0, false);
        declareFunction("opaque_seqvarP", "OPAQUE-SEQVAR?", 1, 0, false);
        declareFunction("default_opaque_argP", "DEFAULT-OPAQUE-ARG?", 2, 0, false);
        declareFunction("opaque_arg_wrt_free_varsP", "OPAQUE-ARG-WRT-FREE-VARS?", 2, 0, false);
        declareFunction("opaque_arg_wrt_el_templateP", "OPAQUE-ARG-WRT-EL-TEMPLATE?", 2, 0, false);
        declareFunction("opaque_arg_wrt_quotingP", "OPAQUE-ARG-WRT-QUOTING?", 2, 0, false);
        new com.cyc.cycjava.cycl.cycl_utilities.$opaque_arg_wrt_quotingP$BinaryFunction();
        declareFunction("opaque_arg_wrt_quoting_not_counting_logical_opsP", "OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?", 2, 0, false);
        declareFunction("opaque_arg_wrt_quoteP", "OPAQUE-ARG-WRT-QUOTE?", 2, 0, false);
        declareFunction("opaque_arg_wrt_skolemP", "OPAQUE-ARG-WRT-SKOLEM?", 2, 0, false);
        declareFunction("default_opaque_seqvarP", "DEFAULT-OPAQUE-SEQVAR?", 1, 0, false);
        declareFunction("hl_term_with_el_counterpart_p", "HL-TERM-WITH-EL-COUNTERPART-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_utilities.$hl_term_with_el_counterpart_p$UnaryFunction();
        declareFunction("hl_term_to_el_term", "HL-TERM-TO-EL-TERM", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_utilities.$hl_term_to_el_term$UnaryFunction();
        declareFunction("careful_hl_term_to_el_term", "CAREFUL-HL-TERM-TO-EL-TERM", 1, 0, false);
        declareFunction("hl_to_el", "HL-TO-EL", 1, 0, false);
        declareFunction("hl_to_el_destructive", "HL-TO-EL-DESTRUCTIVE", 1, 0, false);
        declareFunction("binding_lists_hl_to_el", "BINDING-LISTS-HL-TO-EL", 1, 0, false);
        declareFunction("transform_hl_to_el", "TRANSFORM-HL-TO-EL", 1, 0, false);
        declareFunction("reified_term_p", "REIFIED-TERM-P", 1, 0, false);
        declareFunction("atomic_reified_term_p", "ATOMIC-REIFIED-TERM-P", 1, 0, false);
        declareFunction("reified_formula_p", "REIFIED-FORMULA-P", 1, 0, false);
        declareFunction("expression_gather_int_2", "EXPRESSION-GATHER-INT-2", 5, 0, false);
        declareFunction("expression_gather_int", "EXPRESSION-GATHER-INT", 6, 0, false);
        declareFunction("expression_gather_with_duplicates", "EXPRESSION-GATHER-WITH-DUPLICATES", 2, 4, false);
        declareFunction("expression_gather", "EXPRESSION-GATHER", 2, 4, false);
        declareFunction("assertion_gather", "ASSERTION-GATHER", 2, 4, false);
        declareFunction("expression_count", "EXPRESSION-COUNT", 2, 3, false);
        declareFunction("expression_count_helper", "EXPRESSION-COUNT-HELPER", 1, 0, false);
        declareFunction("expression_list_gather", "EXPRESSION-LIST-GATHER", 2, 4, false);
        declareFunction("formula_gather", "FORMULA-GATHER", 2, 4, false);
        declareFunction("expression_forts", "EXPRESSION-FORTS", 1, 3, false);
        declareFunction("expression_list_forts", "EXPRESSION-LIST-FORTS", 1, 2, false);
        declareFunction("formula_forts", "FORMULA-FORTS", 1, 3, false);
        declareFunction("expression_constants", "EXPRESSION-CONSTANTS", 1, 1, false);
        declareFunction("expression_list_constants", "EXPRESSION-LIST-CONSTANTS", 1, 1, false);
        declareFunction("formula_constants", "FORMULA-CONSTANTS", 1, 1, false);
        declareFunction("expression_narts", "EXPRESSION-NARTS", 1, 2, false);
        declareFunction("expression_list_narts", "EXPRESSION-LIST-NARTS", 1, 2, false);
        declareFunction("formula_narts", "FORMULA-NARTS", 1, 2, false);
        declareFunction("expression_sub_assertions", "EXPRESSION-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("expression_list_sub_assertions", "EXPRESSION-LIST-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("formula_sub_assertions", "FORMULA-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("assertion_sub_assertions", "ASSERTION-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("nart_sub_assertions", "NART-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("subnarts", "SUBNARTS", 1, 2, false);
        declareFunction("all_formula_terms", "ALL-FORMULA-TERMS", 1, 1, false);
        declareFunction("all_literal_terms", "ALL-LITERAL-TERMS", 1, 1, false);
        declareFunction("top_level_predicates", "TOP-LEVEL-PREDICATES", 1, 1, false);
        declareFunction("top_level_predicates_int", "TOP-LEVEL-PREDICATES-INT", 1, 0, false);
        declareFunction("containing_subexpressions", "CONTAINING-SUBEXPRESSIONS", 2, 0, false);
        declareFunction("containing_subexpressions_lambda_fn", "CONTAINING-SUBEXPRESSIONS-LAMBDA-FN", 1, 0, false);
        declareFunction("expression_contains_keywordp", "EXPRESSION-CONTAINS-KEYWORDP", 1, 1, false);
        declareFunction("expression_find_if_int", "EXPRESSION-FIND-IF-INT", 4, 0, false);
        declareFunction("expression_find_if", "EXPRESSION-FIND-IF", 2, 2, false);
        declareFunction("formula_find_if", "FORMULA-FIND-IF", 2, 2, false);
        declareFunction("assertion_find_if", "ASSERTION-FIND-IF", 2, 2, false);
        declareFunction("nart_find_if", "NART-FIND-IF", 2, 2, false);
        declareFunction("expression_find_int", "EXPRESSION-FIND-INT", 5, 0, false);
        declareFunction("expression_find", "EXPRESSION-FIND", 2, 3, false);
        declareFunction("formula_find", "FORMULA-FIND", 2, 3, false);
        declareFunction("assertion_find", "ASSERTION-FIND", 2, 3, false);
        declareFunction("nart_find", "NART-FIND", 2, 3, false);
        declareFunction("expression_list_find", "EXPRESSION-LIST-FIND", 2, 3, false);
        declareFunction("remove_if_not_in_expression", "REMOVE-IF-NOT-IN-EXPRESSION", 2, 3, false);
        declareFunction("expression_map_int", "EXPRESSION-MAP-INT", 4, 0, false);
        declareFunction("expression_map", "EXPRESSION-MAP", 2, 2, false);
        declareFunction("formula_map", "FORMULA-MAP", 2, 2, false);
        declareFunction("assertion_map", "ASSERTION-MAP", 2, 2, false);
        declareFunction("nart_map", "NART-MAP", 2, 2, false);
        declareFunction("expression_ntransform_int", "EXPRESSION-NTRANSFORM-INT", 8, 0, false);
        declareFunction("expression_transform", "EXPRESSION-TRANSFORM", 3, 2, false);
        declareFunction("expression_ntransform", "EXPRESSION-NTRANSFORM", 3, 2, false);
        declareFunction("formula_transform", "FORMULA-TRANSFORM", 3, 2, false);
        declareFunction("formula_ntransform", "FORMULA-NTRANSFORM", 3, 2, false);
        declareFunction("expression_transform_if", "EXPRESSION-TRANSFORM-IF", 3, 2, false);
        declareFunction("expression_ntransform_if", "EXPRESSION-NTRANSFORM-IF", 3, 2, false);
        declareFunction("formula_transform_if", "FORMULA-TRANSFORM-IF", 3, 2, false);
        declareFunction("formula_ntransform_if", "FORMULA-NTRANSFORM-IF", 3, 2, false);
        declareFunction("expression_transform_if_not", "EXPRESSION-TRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("expression_ntransform_if_not", "EXPRESSION-NTRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("formula_transform_if_not", "FORMULA-TRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("formula_ntransform_if_not", "FORMULA-NTRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("formula_and_mt_transform", "FORMULA-AND-MT-TRANSFORM", 4, 2, false);
        declareFunction("formula_and_mt_ntransform", "FORMULA-AND-MT-NTRANSFORM", 4, 2, false);
        declareFunction("sentence_and_mt_transform", "SENTENCE-AND-MT-TRANSFORM", 4, 2, false);
        declareFunction("sentence_and_mt_ntransform", "SENTENCE-AND-MT-NTRANSFORM", 4, 2, false);
        declareFunction("expression_nsubst_free_vars_int", "EXPRESSION-NSUBST-FREE-VARS-INT", 4, 0, false);
        declareFunction("expression_nsubst_free_vars", "EXPRESSION-NSUBST-FREE-VARS", 3, 1, false);
        declareFunction("expression_nsubst_int", "EXPRESSION-NSUBST-INT", 5, 0, false);
        declareFunction("expression_subst", "EXPRESSION-SUBST", 3, 2, false);
        declareFunction("expression_nsubst", "EXPRESSION-NSUBST", 3, 2, false);
        declareFunction("formula_subst", "FORMULA-SUBST", 3, 2, false);
        declareFunction("formula_nsubst", "FORMULA-NSUBST", 3, 2, false);
        declareFunction("expression_nsublis_free_vars_int", "EXPRESSION-NSUBLIS-FREE-VARS-INT", 3, 0, false);
        declareFunction("expression_nsublis_free_vars", "EXPRESSION-NSUBLIS-FREE-VARS", 2, 1, false);
        declareFunction("expression_nsublis_int", "EXPRESSION-NSUBLIS-INT", 4, 0, false);
        declareFunction("expression_sublis", "EXPRESSION-SUBLIS", 2, 2, false);
        declareFunction("expression_nsublis", "EXPRESSION-NSUBLIS", 2, 2, false);
        declareFunction("formula_sublis", "FORMULA-SUBLIS", 2, 2, false);
        declareFunction("formula_nsublis", "FORMULA-NSUBLIS", 2, 2, false);
        declareFunction("expression_nsublis_el_variables", "EXPRESSION-NSUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("expression_sublis_el_variables", "EXPRESSION-SUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("expression_nsublis_hl_variables", "EXPRESSION-NSUBLIS-HL-VARIABLES", 1, 0, false);
        declareFunction("expression_sublis_hl_variables", "EXPRESSION-SUBLIS-HL-VARIABLES", 1, 0, false);
        declareFunction("cnf_nsublis_el_variables", "CNF-NSUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("cnf_sublis_el_variables", "CNF-SUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("formula_arg_position_subst", "FORMULA-ARG-POSITION-SUBST", 3, 0, false);
        declareFunction("formula_arg_position_nsubst", "FORMULA-ARG-POSITION-NSUBST", 3, 0, false);
        declareFunction("permute_formula", "PERMUTE-FORMULA", 3, 0, false);
        declareFunction("formula_permutations", "FORMULA-PERMUTATIONS", 2, 0, false);
        declareFunction("formulas_permutations", "FORMULAS-PERMUTATIONS", 2, 0, false);
        declareFunction("formula_arg_permutations", "FORMULA-ARG-PERMUTATIONS", 1, 0, false);
        declareFunction("nat_commutative_permutations", "NAT-COMMUTATIVE-PERMUTATIONS", 1, 0, false);
        declareFunction("clear_permute_list_cached", "CLEAR-PERMUTE-LIST-CACHED", 0, 0, false);
        declareFunction("remove_permute_list_cached", "REMOVE-PERMUTE-LIST-CACHED", 1, 0, false);
        declareFunction("permute_list_cached_internal", "PERMUTE-LIST-CACHED-INTERNAL", 1, 0, false);
        declareFunction("permute_list_cached", "PERMUTE-LIST-CACHED", 1, 0, false);
        declareFunction("formula_commutative_permutations", "FORMULA-COMMUTATIVE-PERMUTATIONS", 1, 1, false);
        declareFunction("canonical_commutative_permutations", "CANONICAL-COMMUTATIVE-PERMUTATIONS", 1, 2, false);
        declareFunction("variable_argnums", "VARIABLE-ARGNUMS", 1, 1, false);
        declareFunction("args_canonical_commutative_permutations", "ARGS-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
        declareFunction("formulas_canonical_permutations", "FORMULAS-CANONICAL-PERMUTATIONS", 1, 0, false);
        declareFunction("canonical_permute_formula", "CANONICAL-PERMUTE-FORMULA", 3, 0, false);
        declareFunction("nat_canonical_commutative_permutations", "NAT-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
        declareFunction("split_list_set", "SPLIT-LIST-SET", 1, 0, false);
        declareFunction("permutations_merge", "PERMUTATIONS-MERGE", 2, 0, false);
        declareFunction("formula_operator_recursive", "FORMULA-OPERATOR-RECURSIVE", 1, 0, false);
        declareFunction("rename_default_el_vars_int", "RENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
        declareFunction("rename_default_el_vars", "RENAME-DEFAULT-EL-VARS", 1, 0, false);
        declareFunction("rename_default_el_vars_destructive", "RENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
        declareFunction("unrename_default_el_vars_int", "UNRENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
        declareFunction("unrename_default_el_vars", "UNRENAME-DEFAULT-EL-VARS", 1, 0, false);
        declareFunction("unrename_default_el_vars_destructive", "UNRENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
        declareFunction("renamed_default_el_var_num", "RENAMED-DEFAULT-EL-VAR-NUM", 1, 0, false);
        declareFunction("renamed_default_el_var_p", "RENAMED-DEFAULT-EL-VAR-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_utilities.$renamed_default_el_var_p$UnaryFunction();
        declareFunction("get_renamed_default_el_var", "GET-RENAMED-DEFAULT-EL-VAR", 1, 0, false);
        declareFunction("non_indexed_fort_p", "NON-INDEXED-FORT-P", 1, 0, false);
        declareFunction("fort_or_naut_p", "FORT-OR-NAUT-P", 1, 0, false);
        declareFunction("fort_or_possibly_naut_p", "FORT-OR-POSSIBLY-NAUT-P", 1, 0, false);
        declareFunction("collection_intersection_natP", "COLLECTION-INTERSECTION-NAT?", 1, 0, false);
        declareFunction("collection_union_natP", "COLLECTION-UNION-NAT?", 1, 0, false);
        declareFunction("collection_intersection", "COLLECTION-INTERSECTION", 1, 0, false);
        declareFunction("collection_union", "COLLECTION-UNION", 1, 0, false);
        declareFunction("collection_intersection_intersectees", "COLLECTION-INTERSECTION-INTERSECTEES", 1, 0, false);
        declareFunction("collection_union_united_collections", "COLLECTION-UNION-UNITED-COLLECTIONS", 1, 0, false);
        declareFunction("sorted_constant_list", "SORTED-CONSTANT-LIST", 1, 0, false);
        declareFunction("sorted_constant_external_id_list", "SORTED-CONSTANT-EXTERNAL-ID-LIST", 1, 0, false);
        declareFunction("sorted_constant_internal_id_list", "SORTED-CONSTANT-INTERNAL-ID-LIST", 1, 0, false);
        declareFunction("constant_list", "CONSTANT-LIST", 1, 1, false);
        declareFunction("sorted_nat_list", "SORTED-NAT-LIST", 1, 0, false);
        declareFunction("nat_list", "NAT-LIST", 1, 0, false);
        declareFunction("sorted_assertion_list", "SORTED-ASSERTION-LIST", 1, 0, false);
        declareFunction("assertion_list", "ASSERTION-LIST", 1, 0, false);
        declareFunction("sorted_fort_id_list", "SORTED-FORT-ID-LIST", 1, 0, false);
        declareFunction("functional_in_some_argP", "FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
        declareFunction("functional_in_arg_positions_internal", "FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
        declareFunction("functional_in_arg_positions", "FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
        declareFunction("nart_cons", "NART-CONS", 1, 0, false);
        declareFunction("lookup_all_narts", "LOOKUP-ALL-NARTS", 1, 0, false);
        declareFunction("reify_all_existing_narts", "REIFY-ALL-EXISTING-NARTS", 1, 0, false);
        declareFunction("opaque_arg_wrt_nat_reificationP", "OPAQUE-ARG-WRT-NAT-REIFICATION?", 2, 0, false);
        declareFunction("reify_arg_when_closed_naut", "REIFY-ARG-WHEN-CLOSED-NAUT", 2, 0, false);
        declareFunction("reify_when_closed_naut", "REIFY-WHEN-CLOSED-NAUT", 1, 0, false);
        declareFunction("find_when_closed_naut", "FIND-WHEN-CLOSED-NAUT", 1, 0, false);
        declareFunction("find_closed_naut", "FIND-CLOSED-NAUT", 1, 0, false);
        declareFunction("find_ground_naut", "FIND-GROUND-NAUT", 1, 0, false);
        declareFunction("ground_hl_formulaP", "GROUND-HL-FORMULA?", 1, 0, false);
        declareFunction("atomic_sentence_with_pred_p", "ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false);
        declareFunction("atomic_sentence_with_any_of_preds_p", "ATOMIC-SENTENCE-WITH-ANY-OF-PREDS-P", 2, 0, false);
        declareFunction("null_or_falseP", "NULL-OR-FALSE?", 1, 0, false);
        declareFunction("possibly_cycl_formula_p", "POSSIBLY-CYCL-FORMULA-P", 1, 0, false);
        declareFunction("negatedP", "NEGATED?", 1, 0, false);
        declareFunction("negate", "NEGATE", 1, 0, false);
        declareFunction("possibly_negate", "POSSIBLY-NEGATE", 2, 0, false);
        declareFunction("formula_arg", "FORMULA-ARG", 2, 1, false);
        declareFunction("el_formula_arg", "EL-FORMULA-ARG", 2, 1, false);
        declareFunction("formula_arg0", "FORMULA-ARG0", 1, 0, false);
        declareFunction("formula_operator", "FORMULA-OPERATOR", 1, 0, false);
        declareFunction("el_formula_operator", "EL-FORMULA-OPERATOR", 1, 0, false);
        declareFunction("formula_arg1", "FORMULA-ARG1", 1, 1, false);
        declareFunction("formula_arg2", "FORMULA-ARG2", 1, 1, false);
        declareFunction("formula_arg3", "FORMULA-ARG3", 1, 1, false);
        declareFunction("formula_arg4", "FORMULA-ARG4", 1, 1, false);
        declareFunction("formula_arg5", "FORMULA-ARG5", 1, 1, false);
        declareFunction("formula_args", "FORMULA-ARGS", 1, 1, false);
        declareFunction("el_formula_args", "EL-FORMULA-ARGS", 1, 1, false);
        declareFunction("cycl_formula_args", "CYCL-FORMULA-ARGS", 1, 0, false);
        declareFunction("cycl_formula_arg0", "CYCL-FORMULA-ARG0", 1, 0, false);
        declareFunction("cycl_formula_arg1", "CYCL-FORMULA-ARG1", 1, 0, false);
        declareFunction("cycl_formula_arg2", "CYCL-FORMULA-ARG2", 1, 0, false);
        declareFunction("cycl_formula_arg3", "CYCL-FORMULA-ARG3", 1, 0, false);
        declareFunction("formula_terms", "FORMULA-TERMS", 1, 1, false);
        declareFunction("el_formula_terms", "EL-FORMULA-TERMS", 1, 1, false);
        declareFunction("formula_terms_int", "FORMULA-TERMS-INT", 2, 1, false);
        declareFunction("formula_terms_int_two_pass", "FORMULA-TERMS-INT-TWO-PASS", 2, 0, false);
        declareFunction("formula_terms_int_one_pass", "FORMULA-TERMS-INT-ONE-PASS", 2, 0, false);
        declareFunction("formula_arg_positions", "FORMULA-ARG-POSITIONS", 2, 1, false);
        declareFunction("el_formula_arg_positions", "EL-FORMULA-ARG-POSITIONS", 2, 1, false);
        declareFunction("nat_arity", "NAT-ARITY", 1, 1, false);
        declareFunction("nat_args", "NAT-ARGS", 1, 1, false);
        declareFunction("naut_args", "NAUT-ARGS", 1, 1, false);
        declareFunction("nat_arg", "NAT-ARG", 2, 1, false);
        declareFunction("naut_arg", "NAUT-ARG", 2, 1, false);
        declareFunction("nat_function", "NAT-FUNCTION", 1, 0, false);
        declareFunction("nat_functor", "NAT-FUNCTOR", 1, 0, false);
        declareFunction("naut_functor", "NAUT-FUNCTOR", 1, 0, false);
        declareFunction("nat_arg0", "NAT-ARG0", 1, 0, false);
        declareFunction("nat_arg1", "NAT-ARG1", 1, 1, false);
        declareFunction("naut_arg1", "NAUT-ARG1", 1, 1, false);
        declareFunction("nat_arg2", "NAT-ARG2", 1, 1, false);
        declareFunction("naut_arg2", "NAUT-ARG2", 1, 1, false);
        declareFunction("nat_arg3", "NAT-ARG3", 1, 1, false);
        declareFunction("nat_arg4", "NAT-ARG4", 1, 1, false);
        declareFunction("nat_arg5", "NAT-ARG5", 1, 1, false);
        declareFunction("cycl_nat_with_functor_p", "CYCL-NAT-WITH-FUNCTOR-P", 2, 0, false);
        declareFunction("sentence_arg", "SENTENCE-ARG", 2, 1, false);
        declareFunction("sentence_args", "SENTENCE-ARGS", 1, 1, false);
        declareFunction("sentence_truth_function", "SENTENCE-TRUTH-FUNCTION", 1, 0, false);
        declareFunction("sentence_arg0", "SENTENCE-ARG0", 1, 0, false);
        declareFunction("sentence_arg1", "SENTENCE-ARG1", 1, 1, false);
        declareFunction("sentence_arg2", "SENTENCE-ARG2", 1, 1, false);
        declareFunction("sentence_arg3", "SENTENCE-ARG3", 1, 1, false);
        declareFunction("sentence_arg4", "SENTENCE-ARG4", 1, 1, false);
        declareFunction("sentence_arg5", "SENTENCE-ARG5", 1, 1, false);
        declareFunction("atomic_sentence_arg", "ATOMIC-SENTENCE-ARG", 2, 1, false);
        declareFunction("atomic_sentence_args", "ATOMIC-SENTENCE-ARGS", 1, 1, false);
        declareFunction("atomic_sentence_predicate", "ATOMIC-SENTENCE-PREDICATE", 1, 0, false);
        new com.cyc.cycjava.cycl.cycl_utilities.$atomic_sentence_predicate$UnaryFunction();
        declareFunction("atomic_sentence_arg0", "ATOMIC-SENTENCE-ARG0", 1, 0, false);
        declareFunction("atomic_sentence_arg1", "ATOMIC-SENTENCE-ARG1", 1, 1, false);
        declareFunction("atomic_sentence_arg2", "ATOMIC-SENTENCE-ARG2", 1, 1, false);
        declareFunction("atomic_sentence_arg3", "ATOMIC-SENTENCE-ARG3", 1, 1, false);
        declareFunction("atomic_sentence_arg4", "ATOMIC-SENTENCE-ARG4", 1, 1, false);
        declareFunction("atomic_sentence_arg5", "ATOMIC-SENTENCE-ARG5", 1, 1, false);
        declareFunction("arg_position_p", "ARG-POSITION-P", 1, 0, false);
        declareFunction("formula_arg_position", "FORMULA-ARG-POSITION", 2, 1, false);
        declareFunction("get_nested_nth_arg", "GET-NESTED-NTH-ARG", 2, 1, false);
        declareFunction("arg_positions_dfs", "ARG-POSITIONS-DFS", 2, 1, false);
        declareFunction("arg_positions_bfs", "ARG-POSITIONS-BFS", 2, 1, false);
        declareFunction("arg_positions_if_dfs", "ARG-POSITIONS-IF-DFS", 2, 1, false);
        declareFunction("arg_positions_if_bfs", "ARG-POSITIONS-IF-BFS", 2, 1, false);
        declareFunction("smallest_enclosing_cycl_sentence", "SMALLEST-ENCLOSING-CYCL-SENTENCE", 2, 0, false);
        declareFunction("cycl_arg_position_p", "CYCL-ARG-POSITION-P", 1, 0, false);
        declareFunction("make_cycl_arg_position", "MAKE-CYCL-ARG-POSITION", 1, 0, false);
        declareFunction("cycl_arg_position_to_arg_position", "CYCL-ARG-POSITION-TO-ARG-POSITION", 1, 0, false);
        declareFunction("formula_cycl_arg_position", "FORMULA-CYCL-ARG-POSITION", 2, 1, false);
        declareFunction("cycl_arg_position_nsubst", "CYCL-ARG-POSITION-NSUBST", 3, 0, false);
        declareFunction("substitute_terms_into_positions", "SUBSTITUTE-TERMS-INTO-POSITIONS", 3, 0, false);
        declareFunction("get_cycl_formula_arg_fns_p_queue", "GET-CYCL-FORMULA-ARG-FNS-P-QUEUE", 1, 0, false);
        declareFunction("set_cycl_formula_arg_fns_p_queue", "SET-CYCL-FORMULA-ARG-FNS-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_formula_arg_fns_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-FORMULA-ARG-FNS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_formula_arg_fns_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-FORMULA-ARG-FNS-INSTANCE", 1, 0, false);
        declareFunction("cycl_formula_arg_fns_p", "CYCL-FORMULA-ARG-FNS-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_cycl_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_opaque_arg_function", "WITH-OPAQUE-ARG-FUNCTION");
            declareMacro("with_opaque_seqvar_function", "WITH-OPAQUE-SEQVAR-FUNCTION");
            declareFunction("maybe_some_opaque_argP", "MAYBE-SOME-OPAQUE-ARG?", 1, 0, false);
            declareFunction("opaque_argP", "OPAQUE-ARG?", 2, 0, false);
            declareFunction("opaque_argP_int", "OPAQUE-ARG?-INT", 3, 0, false);
            declareFunction("opaque_seqvarP", "OPAQUE-SEQVAR?", 1, 0, false);
            declareFunction("default_opaque_argP", "DEFAULT-OPAQUE-ARG?", 2, 0, false);
            declareFunction("opaque_arg_wrt_free_varsP", "OPAQUE-ARG-WRT-FREE-VARS?", 2, 0, false);
            declareFunction("opaque_arg_wrt_el_templateP", "OPAQUE-ARG-WRT-EL-TEMPLATE?", 2, 0, false);
            declareFunction("opaque_arg_wrt_quotingP", "OPAQUE-ARG-WRT-QUOTING?", 2, 0, false);
            new cycl_utilities.$opaque_arg_wrt_quotingP$BinaryFunction();
            declareFunction("opaque_arg_wrt_quoting_not_counting_logical_opsP", "OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?", 2, 0, false);
            declareFunction("opaque_arg_wrt_quoteP", "OPAQUE-ARG-WRT-QUOTE?", 2, 0, false);
            declareFunction("opaque_arg_wrt_el_template_or_quoteP", "OPAQUE-ARG-WRT-EL-TEMPLATE-OR-QUOTE?", 2, 0, false);
            declareFunction("opaque_arg_wrt_skolemP", "OPAQUE-ARG-WRT-SKOLEM?", 2, 0, false);
            declareFunction("default_opaque_seqvarP", "DEFAULT-OPAQUE-SEQVAR?", 1, 0, false);
            declareFunction("hl_term_with_el_counterpart_p", "HL-TERM-WITH-EL-COUNTERPART-P", 1, 0, false);
            new cycl_utilities.$hl_term_with_el_counterpart_p$UnaryFunction();
            declareFunction("hl_term_to_el_term", "HL-TERM-TO-EL-TERM", 1, 0, false);
            new cycl_utilities.$hl_term_to_el_term$UnaryFunction();
            declareFunction("careful_hl_term_to_el_term", "CAREFUL-HL-TERM-TO-EL-TERM", 1, 0, false);
            declareFunction("hl_to_el", "HL-TO-EL", 1, 0, false);
            declareFunction("hl_to_el_destructive", "HL-TO-EL-DESTRUCTIVE", 1, 0, false);
            declareFunction("hl_to_el_preserve_el_vars", "HL-TO-EL-PRESERVE-EL-VARS", 1, 0, false);
            declareFunction("binding_lists_hl_to_el", "BINDING-LISTS-HL-TO-EL", 1, 0, false);
            declareFunction("transform_hl_to_el", "TRANSFORM-HL-TO-EL", 1, 0, false);
            declareFunction("reified_term_p", "REIFIED-TERM-P", 1, 0, false);
            declareFunction("atomic_reified_term_p", "ATOMIC-REIFIED-TERM-P", 1, 0, false);
            declareFunction("reified_formula_p", "REIFIED-FORMULA-P", 1, 0, false);
            declareFunction("rf_p", "RF-P", 1, 0, false);
            declareFunction("rf_type", "RF-TYPE", 1, 0, false);
            declareFunction("rf_raw_id", "RF-RAW-ID", 1, 0, false);
            declareFunction("rf_id", "RF-ID", 1, 0, false);
            declareFunction("find_rf_by_id", "FIND-RF-BY-ID", 1, 0, false);
            declareFunction("find_rf", "FIND-RF", 1, 0, false);
            declareFunction("robustly_find_rf", "ROBUSTLY-FIND-RF", 1, 0, false);
            declareFunction("rf_formula", "RF-FORMULA", 1, 0, false);
            declareFunction("rf_expand", "RF-EXPAND", 1, 0, false);
            declareFunction("rf_narts", "RF-NARTS", 1, 1, false);
            declareFunction("rf_assertions", "RF-ASSERTIONS", 1, 1, false);
            declareFunction("wf_rf_syntaxP", "WF-RF-SYNTAX?", 1, 0, false);
            declareFunction("valid_rfP", "VALID-RF?", 1, 0, false);
            declareFunction("all_rfs", "ALL-RFS", 0, 0, false);
            declareFunction("unreify_rfs", "UNREIFY-RFS", 1, 0, false);
            declareFunction("rf_count", "RF-COUNT", 0, 0, false);
            declareFunction("subrfs", "SUBRFS", 2, 0, false);
            declareFunction("super_rfs", "SUPER-RFS", 1, 0, false);
            declareFunction("inclusive_subrfs", "INCLUSIVE-SUBRFS", 1, 0, false);
            declareFunction("expression_gather_int_2", "EXPRESSION-GATHER-INT-2", 5, 0, false);
            declareFunction("expression_gather_int", "EXPRESSION-GATHER-INT", 6, 0, false);
            declareFunction("expression_gather_with_duplicates", "EXPRESSION-GATHER-WITH-DUPLICATES", 2, 4, false);
            declareFunction("expression_gather", "EXPRESSION-GATHER", 2, 4, false);
            declareFunction("assertion_gather", "ASSERTION-GATHER", 2, 4, false);
            declareFunction("expression_count", "EXPRESSION-COUNT", 2, 3, false);
            declareFunction("expression_count_helper", "EXPRESSION-COUNT-HELPER", 1, 0, false);
            declareFunction("expression_list_gather", "EXPRESSION-LIST-GATHER", 2, 4, false);
            declareFunction("formula_gather", "FORMULA-GATHER", 2, 4, false);
            declareFunction("expression_forts", "EXPRESSION-FORTS", 1, 3, false);
            declareFunction("expression_list_forts", "EXPRESSION-LIST-FORTS", 1, 2, false);
            declareFunction("formula_forts", "FORMULA-FORTS", 1, 3, false);
            declareFunction("expression_constants", "EXPRESSION-CONSTANTS", 1, 1, false);
            declareFunction("expression_list_constants", "EXPRESSION-LIST-CONSTANTS", 1, 1, false);
            declareFunction("formula_constants", "FORMULA-CONSTANTS", 1, 1, false);
            declareFunction("expression_narts", "EXPRESSION-NARTS", 1, 2, false);
            declareFunction("expression_list_narts", "EXPRESSION-LIST-NARTS", 1, 2, false);
            declareFunction("formula_narts", "FORMULA-NARTS", 1, 2, false);
            declareFunction("expression_sub_assertions", "EXPRESSION-SUB-ASSERTIONS", 1, 2, false);
            declareFunction("expression_list_sub_assertions", "EXPRESSION-LIST-SUB-ASSERTIONS", 1, 2, false);
            declareFunction("formula_sub_assertions", "FORMULA-SUB-ASSERTIONS", 1, 2, false);
            declareFunction("assertion_sub_assertions", "ASSERTION-SUB-ASSERTIONS", 1, 2, false);
            declareFunction("nart_sub_assertions", "NART-SUB-ASSERTIONS", 1, 2, false);
            declareFunction("subnarts", "SUBNARTS", 1, 2, false);
            declareFunction("all_formula_terms", "ALL-FORMULA-TERMS", 1, 1, false);
            declareFunction("all_literal_terms", "ALL-LITERAL-TERMS", 1, 1, false);
            declareFunction("top_level_predicates", "TOP-LEVEL-PREDICATES", 1, 1, false);
            declareFunction("top_level_predicates_int", "TOP-LEVEL-PREDICATES-INT", 1, 0, false);
            declareFunction("containing_subexpressions", "CONTAINING-SUBEXPRESSIONS", 2, 0, false);
            declareFunction("containing_subexpressions_lambda_fn", "CONTAINING-SUBEXPRESSIONS-LAMBDA-FN", 1, 0, false);
            declareFunction("expression_contains_keywordp", "EXPRESSION-CONTAINS-KEYWORDP", 1, 1, false);
            declareFunction("expression_find_if_int", "EXPRESSION-FIND-IF-INT", 4, 0, false);
            declareFunction("expression_find_if", "EXPRESSION-FIND-IF", 2, 2, false);
            declareFunction("formula_find_if", "FORMULA-FIND-IF", 2, 2, false);
            declareFunction("assertion_find_if", "ASSERTION-FIND-IF", 2, 2, false);
            declareFunction("nart_find_if", "NART-FIND-IF", 2, 2, false);
            declareFunction("expression_find_int", "EXPRESSION-FIND-INT", 5, 0, false);
            declareFunction("expression_find", "EXPRESSION-FIND", 2, 3, false);
            declareFunction("formula_find", "FORMULA-FIND", 2, 3, false);
            declareFunction("assertion_find", "ASSERTION-FIND", 2, 3, false);
            declareFunction("nart_find", "NART-FIND", 2, 3, false);
            declareFunction("expression_list_find", "EXPRESSION-LIST-FIND", 2, 3, false);
            declareFunction("remove_if_not_in_expression", "REMOVE-IF-NOT-IN-EXPRESSION", 2, 3, false);
            declareFunction("expression_find_any", "EXPRESSION-FIND-ANY", 2, 3, false);
            declareFunction("expression_map_int", "EXPRESSION-MAP-INT", 4, 0, false);
            declareFunction("expression_map", "EXPRESSION-MAP", 2, 2, false);
            declareFunction("formula_map", "FORMULA-MAP", 2, 2, false);
            declareFunction("assertion_map", "ASSERTION-MAP", 2, 2, false);
            declareFunction("nart_map", "NART-MAP", 2, 2, false);
            declareFunction("expression_ntransform_int", "EXPRESSION-NTRANSFORM-INT", 8, 0, false);
            declareFunction("expression_transform", "EXPRESSION-TRANSFORM", 3, 2, false);
            declareFunction("expression_ntransform", "EXPRESSION-NTRANSFORM", 3, 2, false);
            declareFunction("formula_transform", "FORMULA-TRANSFORM", 3, 2, false);
            declareFunction("formula_ntransform", "FORMULA-NTRANSFORM", 3, 2, false);
            declareFunction("expression_transform_if", "EXPRESSION-TRANSFORM-IF", 3, 2, false);
            declareFunction("expression_ntransform_if", "EXPRESSION-NTRANSFORM-IF", 3, 2, false);
            declareFunction("formula_transform_if", "FORMULA-TRANSFORM-IF", 3, 2, false);
            declareFunction("formula_ntransform_if", "FORMULA-NTRANSFORM-IF", 3, 2, false);
            declareFunction("expression_transform_if_not", "EXPRESSION-TRANSFORM-IF-NOT", 3, 2, false);
            declareFunction("expression_ntransform_if_not", "EXPRESSION-NTRANSFORM-IF-NOT", 3, 2, false);
            declareFunction("formula_transform_if_not", "FORMULA-TRANSFORM-IF-NOT", 3, 2, false);
            declareFunction("formula_ntransform_if_not", "FORMULA-NTRANSFORM-IF-NOT", 3, 2, false);
            declareFunction("formula_and_mt_transform", "FORMULA-AND-MT-TRANSFORM", 4, 2, false);
            declareFunction("formula_and_mt_ntransform", "FORMULA-AND-MT-NTRANSFORM", 4, 2, false);
            declareFunction("sentence_and_mt_transform", "SENTENCE-AND-MT-TRANSFORM", 4, 2, false);
            declareFunction("sentence_and_mt_ntransform", "SENTENCE-AND-MT-NTRANSFORM", 4, 2, false);
            declareFunction("expression_nsubst_free_vars_int", "EXPRESSION-NSUBST-FREE-VARS-INT", 4, 0, false);
            declareFunction("expression_nsubst_free_vars", "EXPRESSION-NSUBST-FREE-VARS", 3, 1, false);
            declareFunction("expression_nsubst_int", "EXPRESSION-NSUBST-INT", 5, 0, false);
            declareFunction("expression_subst", "EXPRESSION-SUBST", 3, 2, false);
            declareFunction("expression_nsubst", "EXPRESSION-NSUBST", 3, 2, false);
            declareFunction("formula_subst", "FORMULA-SUBST", 3, 2, false);
            declareFunction("formula_nsubst", "FORMULA-NSUBST", 3, 2, false);
            declareFunction("expression_nsublis_free_vars_int", "EXPRESSION-NSUBLIS-FREE-VARS-INT", 3, 0, false);
            declareFunction("expression_nsublis_free_vars", "EXPRESSION-NSUBLIS-FREE-VARS", 2, 1, false);
            declareFunction("expression_nsublis_int", "EXPRESSION-NSUBLIS-INT", 4, 0, false);
            declareFunction("expression_sublis", "EXPRESSION-SUBLIS", 2, 2, false);
            declareFunction("expression_nsublis", "EXPRESSION-NSUBLIS", 2, 2, false);
            declareFunction("formula_sublis", "FORMULA-SUBLIS", 2, 2, false);
            declareFunction("formula_nsublis", "FORMULA-NSUBLIS", 2, 2, false);
            declareFunction("expression_nsublis_el_variables", "EXPRESSION-NSUBLIS-EL-VARIABLES", 2, 0, false);
            declareFunction("expression_sublis_el_variables", "EXPRESSION-SUBLIS-EL-VARIABLES", 2, 0, false);
            declareFunction("expression_nsublis_hl_variables", "EXPRESSION-NSUBLIS-HL-VARIABLES", 1, 0, false);
            declareFunction("expression_sublis_hl_variables", "EXPRESSION-SUBLIS-HL-VARIABLES", 1, 0, false);
            declareFunction("cnf_nsublis_el_variables", "CNF-NSUBLIS-EL-VARIABLES", 2, 0, false);
            declareFunction("cnf_sublis_el_variables", "CNF-SUBLIS-EL-VARIABLES", 2, 0, false);
            declareFunction("formula_arg_position_subst", "FORMULA-ARG-POSITION-SUBST", 3, 0, false);
            declareFunction("formula_arg_position_nsubst", "FORMULA-ARG-POSITION-NSUBST", 3, 0, false);
            declareFunction("permute_formula", "PERMUTE-FORMULA", 3, 0, false);
            declareFunction("formula_permutations", "FORMULA-PERMUTATIONS", 2, 0, false);
            declareFunction("formulas_permutations", "FORMULAS-PERMUTATIONS", 2, 0, false);
            declareFunction("formula_arg_permutations", "FORMULA-ARG-PERMUTATIONS", 1, 0, false);
            declareFunction("nat_commutative_permutations", "NAT-COMMUTATIVE-PERMUTATIONS", 1, 0, false);
            declareFunction("clear_permute_list_cached", "CLEAR-PERMUTE-LIST-CACHED", 0, 0, false);
            declareFunction("remove_permute_list_cached", "REMOVE-PERMUTE-LIST-CACHED", 1, 0, false);
            declareFunction("permute_list_cached_internal", "PERMUTE-LIST-CACHED-INTERNAL", 1, 0, false);
            declareFunction("permute_list_cached", "PERMUTE-LIST-CACHED", 1, 0, false);
            declareFunction("formula_commutative_permutations", "FORMULA-COMMUTATIVE-PERMUTATIONS", 1, 1, false);
            declareFunction("canonical_commutative_permutations", "CANONICAL-COMMUTATIVE-PERMUTATIONS", 1, 2, false);
            declareFunction("variable_argnums", "VARIABLE-ARGNUMS", 1, 1, false);
            declareFunction("args_canonical_commutative_permutations", "ARGS-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
            declareFunction("formulas_canonical_permutations", "FORMULAS-CANONICAL-PERMUTATIONS", 1, 0, false);
            declareFunction("canonical_permute_formula", "CANONICAL-PERMUTE-FORMULA", 3, 0, false);
            declareFunction("nat_canonical_commutative_permutations", "NAT-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
            declareFunction("split_list_set", "SPLIT-LIST-SET", 1, 0, false);
            declareFunction("permutations_merge", "PERMUTATIONS-MERGE", 2, 0, false);
            declareFunction("formula_operator_recursive", "FORMULA-OPERATOR-RECURSIVE", 1, 0, false);
            declareFunction("rename_default_el_vars_int", "RENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
            declareFunction("rename_default_el_vars", "RENAME-DEFAULT-EL-VARS", 1, 0, false);
            declareFunction("rename_default_el_vars_destructive", "RENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
            declareFunction("unrename_default_el_vars_int", "UNRENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
            declareFunction("unrename_default_el_vars", "UNRENAME-DEFAULT-EL-VARS", 1, 0, false);
            declareFunction("unrename_default_el_vars_destructive", "UNRENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
            declareFunction("renamed_default_el_var_num", "RENAMED-DEFAULT-EL-VAR-NUM", 1, 0, false);
            declareFunction("renamed_default_el_var_p", "RENAMED-DEFAULT-EL-VAR-P", 1, 0, false);
            new cycl_utilities.$renamed_default_el_var_p$UnaryFunction();
            declareFunction("get_renamed_default_el_var", "GET-RENAMED-DEFAULT-EL-VAR", 1, 0, false);
            declareFunction("non_indexed_fort_p", "NON-INDEXED-FORT-P", 1, 0, false);
            declareFunction("fort_or_naut_p", "FORT-OR-NAUT-P", 1, 0, false);
            declareFunction("fort_or_possibly_naut_p", "FORT-OR-POSSIBLY-NAUT-P", 1, 0, false);
            declareFunction("naut_substitute", "NAUT-SUBSTITUTE", 1, 0, false);
            declareFunction("collection_intersection_natP", "COLLECTION-INTERSECTION-NAT?", 1, 0, false);
            declareFunction("collection_union_natP", "COLLECTION-UNION-NAT?", 1, 0, false);
            declareFunction("collection_intersection", "COLLECTION-INTERSECTION", 1, 0, false);
            declareFunction("collection_union", "COLLECTION-UNION", 1, 0, false);
            declareFunction("collection_intersection_intersectees", "COLLECTION-INTERSECTION-INTERSECTEES", 1, 0, false);
            declareFunction("collection_union_united_collections", "COLLECTION-UNION-UNITED-COLLECTIONS", 1, 0, false);
            declareFunction("find_denotational_term", "FIND-DENOTATIONAL-TERM", 1, 0, false);
            declareFunction("denotational_term_name", "DENOTATIONAL-TERM-NAME", 1, 0, false);
            declareFunction("denotational_term_name_for_alpha_sort", "DENOTATIONAL-TERM-NAME-FOR-ALPHA-SORT", 1, 0, false);
            declareFunction("sorted_constant_list", "SORTED-CONSTANT-LIST", 1, 0, false);
            declareFunction("sorted_constant_external_id_list", "SORTED-CONSTANT-EXTERNAL-ID-LIST", 1, 0, false);
            declareFunction("sorted_constant_internal_id_list", "SORTED-CONSTANT-INTERNAL-ID-LIST", 1, 0, false);
            declareFunction("constant_list", "CONSTANT-LIST", 1, 1, false);
            declareFunction("sorted_nat_list", "SORTED-NAT-LIST", 1, 0, false);
            declareFunction("nat_list", "NAT-LIST", 1, 0, false);
            declareFunction("sorted_assertion_list", "SORTED-ASSERTION-LIST", 1, 0, false);
            declareFunction("assertion_list", "ASSERTION-LIST", 1, 0, false);
            declareFunction("sorted_fort_id_list", "SORTED-FORT-ID-LIST", 1, 0, false);
            declareFunction("functional_in_some_argP", "FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
            declareFunction("functional_in_arg_positions_internal", "FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
            declareFunction("functional_in_arg_positions", "FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
            declareFunction("strictly_functional_in_some_argP", "STRICTLY-FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
            declareFunction("strictly_functional_in_arg_positions_internal", "STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
            declareFunction("strictly_functional_in_arg_positions", "STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
            declareFunction("nart_cons", "NART-CONS", 1, 0, false);
            declareFunction("lookup_all_narts", "LOOKUP-ALL-NARTS", 1, 0, false);
            declareFunction("reify_all_existing_narts", "REIFY-ALL-EXISTING-NARTS", 1, 0, false);
            declareFunction("opaque_arg_wrt_nat_reificationP", "OPAQUE-ARG-WRT-NAT-REIFICATION?", 2, 0, false);
            declareFunction("reify_arg_when_closed_naut", "REIFY-ARG-WHEN-CLOSED-NAUT", 2, 0, false);
            declareFunction("reify_when_closed_naut", "REIFY-WHEN-CLOSED-NAUT", 1, 0, false);
            declareFunction("find_when_closed_naut", "FIND-WHEN-CLOSED-NAUT", 1, 0, false);
            declareFunction("find_closed_naut", "FIND-CLOSED-NAUT", 1, 0, false);
            declareFunction("find_when_ground_naut", "FIND-WHEN-GROUND-NAUT", 1, 0, false);
            declareFunction("find_ground_naut", "FIND-GROUND-NAUT", 1, 0, false);
            declareFunction("ground_hl_formulaP", "GROUND-HL-FORMULA?", 1, 0, false);
            declareFunction("atomic_sentence_with_pred_p", "ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false);
            declareFunction("atomic_sentence_with_any_of_preds_p", "ATOMIC-SENTENCE-WITH-ANY-OF-PREDS-P", 2, 0, false);
            declareFunction("null_or_falseP", "NULL-OR-FALSE?", 1, 0, false);
            declareFunction("possibly_cycl_formula_p", "POSSIBLY-CYCL-FORMULA-P", 1, 0, false);
            declareFunction("negatedP", "NEGATED?", 1, 0, false);
            declareFunction("negate", "NEGATE", 1, 0, false);
            declareFunction("possibly_negate", "POSSIBLY-NEGATE", 2, 0, false);
            declareFunction("formula_arg", "FORMULA-ARG", 2, 1, false);
            declareFunction("el_formula_arg", "EL-FORMULA-ARG", 2, 1, false);
            declareFunction("el_formula_has_argP", "EL-FORMULA-HAS-ARG?", 3, 0, false);
            declareFunction("formula_arg0", "FORMULA-ARG0", 1, 0, false);
            declareFunction("formula_operator", "FORMULA-OPERATOR", 1, 0, false);
            declareFunction("el_formula_operator", "EL-FORMULA-OPERATOR", 1, 0, false);
            declareFunction("el_formula_arg1", "EL-FORMULA-ARG1", 1, 1, false);
            declareFunction("el_formula_arg2", "EL-FORMULA-ARG2", 1, 1, false);
            declareFunction("el_formula_arg3", "EL-FORMULA-ARG3", 1, 1, false);
            declareFunction("formula_arg1", "FORMULA-ARG1", 1, 1, false);
            declareFunction("formula_arg2", "FORMULA-ARG2", 1, 1, false);
            declareFunction("formula_arg3", "FORMULA-ARG3", 1, 1, false);
            declareFunction("formula_arg4", "FORMULA-ARG4", 1, 1, false);
            declareFunction("formula_arg5", "FORMULA-ARG5", 1, 1, false);
            declareFunction("formula_arg6", "FORMULA-ARG6", 1, 1, false);
            declareFunction("formula_args", "FORMULA-ARGS", 1, 1, false);
            declareFunction("el_formula_args", "EL-FORMULA-ARGS", 1, 1, false);
            declareFunction("cycl_formula_args", "CYCL-FORMULA-ARGS", 1, 0, false);
            declareFunction("cycl_formula_arg0", "CYCL-FORMULA-ARG0", 1, 0, false);
            declareFunction("cycl_formula_arg1", "CYCL-FORMULA-ARG1", 1, 0, false);
            declareFunction("cycl_formula_arg2", "CYCL-FORMULA-ARG2", 1, 0, false);
            declareFunction("cycl_formula_arg3", "CYCL-FORMULA-ARG3", 1, 0, false);
            declareFunction("formula_terms", "FORMULA-TERMS", 1, 1, false);
            declareFunction("el_formula_terms", "EL-FORMULA-TERMS", 1, 1, false);
            declareFunction("formula_terms_int", "FORMULA-TERMS-INT", 2, 1, false);
            declareFunction("formula_terms_int_two_pass", "FORMULA-TERMS-INT-TWO-PASS", 2, 0, false);
            declareFunction("formula_terms_int_one_pass", "FORMULA-TERMS-INT-ONE-PASS", 2, 0, false);
            declareFunction("formula_arg_positions", "FORMULA-ARG-POSITIONS", 2, 1, false);
            declareFunction("el_formula_arg_positions", "EL-FORMULA-ARG-POSITIONS", 2, 1, false);
            declareFunction("possibly_conjuncts", "POSSIBLY-CONJUNCTS", 1, 0, false);
            declareFunction("nat_arity", "NAT-ARITY", 1, 1, false);
            declareFunction("nat_args", "NAT-ARGS", 1, 1, false);
            declareFunction("naut_args", "NAUT-ARGS", 1, 1, false);
            declareFunction("nat_arg", "NAT-ARG", 2, 1, false);
            declareFunction("naut_arg", "NAUT-ARG", 2, 1, false);
            declareFunction("nat_function", "NAT-FUNCTION", 1, 0, false);
            declareFunction("nat_functor", "NAT-FUNCTOR", 1, 0, false);
            declareFunction("naut_functor", "NAUT-FUNCTOR", 1, 0, false);
            declareFunction("nat_arg0", "NAT-ARG0", 1, 0, false);
            declareFunction("nat_arg1", "NAT-ARG1", 1, 1, false);
            declareFunction("naut_arg1", "NAUT-ARG1", 1, 1, false);
            declareFunction("nat_arg2", "NAT-ARG2", 1, 1, false);
            declareFunction("naut_arg2", "NAUT-ARG2", 1, 1, false);
            declareFunction("nat_arg3", "NAT-ARG3", 1, 1, false);
            declareFunction("naut_arg3", "NAUT-ARG3", 1, 1, false);
            declareFunction("nat_arg4", "NAT-ARG4", 1, 1, false);
            declareFunction("nat_arg5", "NAT-ARG5", 1, 1, false);
            declareFunction("nat_with_functor_p", "NAT-WITH-FUNCTOR-P", 2, 0, false);
            declareFunction("naut_with_functor_p", "NAUT-WITH-FUNCTOR-P", 2, 0, false);
            declareFunction("naut_with_any_of_functors_p", "NAUT-WITH-ANY-OF-FUNCTORS-P", 2, 0, false);
            declareFunction("cycl_nat_with_functor_p", "CYCL-NAT-WITH-FUNCTOR-P", 2, 0, false);
            declareFunction("sentence_arg", "SENTENCE-ARG", 2, 1, false);
            declareFunction("sentence_args", "SENTENCE-ARGS", 1, 1, false);
            declareFunction("sentence_truth_function", "SENTENCE-TRUTH-FUNCTION", 1, 0, false);
            declareFunction("sentence_arg0", "SENTENCE-ARG0", 1, 0, false);
            declareFunction("sentence_arg1", "SENTENCE-ARG1", 1, 1, false);
            declareFunction("sentence_arg2", "SENTENCE-ARG2", 1, 1, false);
            declareFunction("sentence_arg3", "SENTENCE-ARG3", 1, 1, false);
            declareFunction("sentence_arg4", "SENTENCE-ARG4", 1, 1, false);
            declareFunction("sentence_arg5", "SENTENCE-ARG5", 1, 1, false);
            declareFunction("atomic_sentence_arg", "ATOMIC-SENTENCE-ARG", 2, 1, false);
            declareFunction("atomic_sentence_args", "ATOMIC-SENTENCE-ARGS", 1, 1, false);
            declareFunction("atomic_sentence_predicate", "ATOMIC-SENTENCE-PREDICATE", 1, 0, false);
            new cycl_utilities.$atomic_sentence_predicate$UnaryFunction();
            declareFunction("atomic_sentence_arg0", "ATOMIC-SENTENCE-ARG0", 1, 0, false);
            declareFunction("atomic_sentence_arg1", "ATOMIC-SENTENCE-ARG1", 1, 1, false);
            declareFunction("atomic_sentence_arg2", "ATOMIC-SENTENCE-ARG2", 1, 1, false);
            declareFunction("atomic_sentence_arg3", "ATOMIC-SENTENCE-ARG3", 1, 1, false);
            declareFunction("atomic_sentence_arg4", "ATOMIC-SENTENCE-ARG4", 1, 1, false);
            declareFunction("atomic_sentence_arg5", "ATOMIC-SENTENCE-ARG5", 1, 1, false);
            declareFunction("atomic_sentence_arg6", "ATOMIC-SENTENCE-ARG6", 1, 1, false);
            declareFunction("arg_position_p", "ARG-POSITION-P", 1, 0, false);
            declareFunction("formula_arg_position", "FORMULA-ARG-POSITION", 2, 1, false);
            declareFunction("get_nested_nth_arg", "GET-NESTED-NTH-ARG", 2, 1, false);
            declareFunction("arg_positions_dfs", "ARG-POSITIONS-DFS", 2, 1, false);
            declareFunction("arg_positions_bfs", "ARG-POSITIONS-BFS", 2, 1, false);
            declareFunction("arg_positions_if_dfs", "ARG-POSITIONS-IF-DFS", 2, 1, false);
            declareFunction("arg_positions_if_bfs", "ARG-POSITIONS-IF-BFS", 2, 1, false);
            declareFunction("smallest_enclosing_cycl_sentence", "SMALLEST-ENCLOSING-CYCL-SENTENCE", 2, 0, false);
            declareFunction("cycl_arg_position_p", "CYCL-ARG-POSITION-P", 1, 0, false);
            declareFunction("make_cycl_arg_position", "MAKE-CYCL-ARG-POSITION", 1, 0, false);
            declareFunction("cycl_arg_position_to_arg_position", "CYCL-ARG-POSITION-TO-ARG-POSITION", 1, 0, false);
            declareFunction("formula_cycl_arg_position", "FORMULA-CYCL-ARG-POSITION", 2, 1, false);
            declareFunction("cycl_arg_position_nsubst", "CYCL-ARG-POSITION-NSUBST", 3, 0, false);
            declareFunction("substitute_terms_into_positions", "SUBSTITUTE-TERMS-INTO-POSITIONS", 3, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_cycl_formula_arg_fns_p_queue", "GET-CYCL-FORMULA-ARG-FNS-P-QUEUE", 1, 0, false);
            declareFunction("set_cycl_formula_arg_fns_p_queue", "SET-CYCL-FORMULA-ARG-FNS-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_formula_arg_fns_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-FORMULA-ARG-FNS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cycl_formula_arg_fns_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-FORMULA-ARG-FNS-INSTANCE", 1, 0, false);
            declareFunction("cycl_formula_arg_fns_p", "CYCL-FORMULA-ARG-FNS-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cycl_utilities_file_Previous() {
        declareMacro("with_opaque_arg_function", "WITH-OPAQUE-ARG-FUNCTION");
        declareMacro("with_opaque_seqvar_function", "WITH-OPAQUE-SEQVAR-FUNCTION");
        declareFunction("maybe_some_opaque_argP", "MAYBE-SOME-OPAQUE-ARG?", 1, 0, false);
        declareFunction("opaque_argP", "OPAQUE-ARG?", 2, 0, false);
        declareFunction("opaque_argP_int", "OPAQUE-ARG?-INT", 3, 0, false);
        declareFunction("opaque_seqvarP", "OPAQUE-SEQVAR?", 1, 0, false);
        declareFunction("default_opaque_argP", "DEFAULT-OPAQUE-ARG?", 2, 0, false);
        declareFunction("opaque_arg_wrt_free_varsP", "OPAQUE-ARG-WRT-FREE-VARS?", 2, 0, false);
        declareFunction("opaque_arg_wrt_el_templateP", "OPAQUE-ARG-WRT-EL-TEMPLATE?", 2, 0, false);
        declareFunction("opaque_arg_wrt_quotingP", "OPAQUE-ARG-WRT-QUOTING?", 2, 0, false);
        new cycl_utilities.$opaque_arg_wrt_quotingP$BinaryFunction();
        declareFunction("opaque_arg_wrt_quoting_not_counting_logical_opsP", "OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?", 2, 0, false);
        declareFunction("opaque_arg_wrt_quoteP", "OPAQUE-ARG-WRT-QUOTE?", 2, 0, false);
        declareFunction("opaque_arg_wrt_el_template_or_quoteP", "OPAQUE-ARG-WRT-EL-TEMPLATE-OR-QUOTE?", 2, 0, false);
        declareFunction("opaque_arg_wrt_skolemP", "OPAQUE-ARG-WRT-SKOLEM?", 2, 0, false);
        declareFunction("default_opaque_seqvarP", "DEFAULT-OPAQUE-SEQVAR?", 1, 0, false);
        declareFunction("hl_term_with_el_counterpart_p", "HL-TERM-WITH-EL-COUNTERPART-P", 1, 0, false);
        new cycl_utilities.$hl_term_with_el_counterpart_p$UnaryFunction();
        declareFunction("hl_term_to_el_term", "HL-TERM-TO-EL-TERM", 1, 0, false);
        new cycl_utilities.$hl_term_to_el_term$UnaryFunction();
        declareFunction("careful_hl_term_to_el_term", "CAREFUL-HL-TERM-TO-EL-TERM", 1, 0, false);
        declareFunction("hl_to_el", "HL-TO-EL", 1, 0, false);
        declareFunction("hl_to_el_destructive", "HL-TO-EL-DESTRUCTIVE", 1, 0, false);
        declareFunction("hl_to_el_preserve_el_vars", "HL-TO-EL-PRESERVE-EL-VARS", 1, 0, false);
        declareFunction("binding_lists_hl_to_el", "BINDING-LISTS-HL-TO-EL", 1, 0, false);
        declareFunction("transform_hl_to_el", "TRANSFORM-HL-TO-EL", 1, 0, false);
        declareFunction("reified_term_p", "REIFIED-TERM-P", 1, 0, false);
        declareFunction("atomic_reified_term_p", "ATOMIC-REIFIED-TERM-P", 1, 0, false);
        declareFunction("reified_formula_p", "REIFIED-FORMULA-P", 1, 0, false);
        declareFunction("rf_p", "RF-P", 1, 0, false);
        declareFunction("rf_type", "RF-TYPE", 1, 0, false);
        declareFunction("rf_raw_id", "RF-RAW-ID", 1, 0, false);
        declareFunction("rf_id", "RF-ID", 1, 0, false);
        declareFunction("find_rf_by_id", "FIND-RF-BY-ID", 1, 0, false);
        declareFunction("find_rf", "FIND-RF", 1, 0, false);
        declareFunction("robustly_find_rf", "ROBUSTLY-FIND-RF", 1, 0, false);
        declareFunction("rf_formula", "RF-FORMULA", 1, 0, false);
        declareFunction("rf_expand", "RF-EXPAND", 1, 0, false);
        declareFunction("rf_narts", "RF-NARTS", 1, 1, false);
        declareFunction("rf_assertions", "RF-ASSERTIONS", 1, 1, false);
        declareFunction("wf_rf_syntaxP", "WF-RF-SYNTAX?", 1, 0, false);
        declareFunction("valid_rfP", "VALID-RF?", 1, 0, false);
        declareFunction("all_rfs", "ALL-RFS", 0, 0, false);
        declareFunction("unreify_rfs", "UNREIFY-RFS", 1, 0, false);
        declareFunction("rf_count", "RF-COUNT", 0, 0, false);
        declareFunction("subrfs", "SUBRFS", 2, 0, false);
        declareFunction("super_rfs", "SUPER-RFS", 1, 0, false);
        declareFunction("inclusive_subrfs", "INCLUSIVE-SUBRFS", 1, 0, false);
        declareFunction("expression_gather_int_2", "EXPRESSION-GATHER-INT-2", 5, 0, false);
        declareFunction("expression_gather_int", "EXPRESSION-GATHER-INT", 6, 0, false);
        declareFunction("expression_gather_with_duplicates", "EXPRESSION-GATHER-WITH-DUPLICATES", 2, 4, false);
        declareFunction("expression_gather", "EXPRESSION-GATHER", 2, 4, false);
        declareFunction("assertion_gather", "ASSERTION-GATHER", 2, 4, false);
        declareFunction("expression_count", "EXPRESSION-COUNT", 2, 3, false);
        declareFunction("expression_count_helper", "EXPRESSION-COUNT-HELPER", 1, 0, false);
        declareFunction("expression_list_gather", "EXPRESSION-LIST-GATHER", 2, 4, false);
        declareFunction("formula_gather", "FORMULA-GATHER", 2, 4, false);
        declareFunction("expression_forts", "EXPRESSION-FORTS", 1, 3, false);
        declareFunction("expression_list_forts", "EXPRESSION-LIST-FORTS", 1, 2, false);
        declareFunction("formula_forts", "FORMULA-FORTS", 1, 3, false);
        declareFunction("expression_constants", "EXPRESSION-CONSTANTS", 1, 1, false);
        declareFunction("expression_list_constants", "EXPRESSION-LIST-CONSTANTS", 1, 1, false);
        declareFunction("formula_constants", "FORMULA-CONSTANTS", 1, 1, false);
        declareFunction("expression_narts", "EXPRESSION-NARTS", 1, 2, false);
        declareFunction("expression_list_narts", "EXPRESSION-LIST-NARTS", 1, 2, false);
        declareFunction("formula_narts", "FORMULA-NARTS", 1, 2, false);
        declareFunction("expression_sub_assertions", "EXPRESSION-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("expression_list_sub_assertions", "EXPRESSION-LIST-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("formula_sub_assertions", "FORMULA-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("assertion_sub_assertions", "ASSERTION-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("nart_sub_assertions", "NART-SUB-ASSERTIONS", 1, 2, false);
        declareFunction("subnarts", "SUBNARTS", 1, 2, false);
        declareFunction("all_formula_terms", "ALL-FORMULA-TERMS", 1, 1, false);
        declareFunction("all_literal_terms", "ALL-LITERAL-TERMS", 1, 1, false);
        declareFunction("top_level_predicates", "TOP-LEVEL-PREDICATES", 1, 1, false);
        declareFunction("top_level_predicates_int", "TOP-LEVEL-PREDICATES-INT", 1, 0, false);
        declareFunction("containing_subexpressions", "CONTAINING-SUBEXPRESSIONS", 2, 0, false);
        declareFunction("containing_subexpressions_lambda_fn", "CONTAINING-SUBEXPRESSIONS-LAMBDA-FN", 1, 0, false);
        declareFunction("expression_contains_keywordp", "EXPRESSION-CONTAINS-KEYWORDP", 1, 1, false);
        declareFunction("expression_find_if_int", "EXPRESSION-FIND-IF-INT", 4, 0, false);
        declareFunction("expression_find_if", "EXPRESSION-FIND-IF", 2, 2, false);
        declareFunction("formula_find_if", "FORMULA-FIND-IF", 2, 2, false);
        declareFunction("assertion_find_if", "ASSERTION-FIND-IF", 2, 2, false);
        declareFunction("nart_find_if", "NART-FIND-IF", 2, 2, false);
        declareFunction("expression_find_int", "EXPRESSION-FIND-INT", 5, 0, false);
        declareFunction("expression_find", "EXPRESSION-FIND", 2, 3, false);
        declareFunction("formula_find", "FORMULA-FIND", 2, 3, false);
        declareFunction("assertion_find", "ASSERTION-FIND", 2, 3, false);
        declareFunction("nart_find", "NART-FIND", 2, 3, false);
        declareFunction("expression_list_find", "EXPRESSION-LIST-FIND", 2, 3, false);
        declareFunction("remove_if_not_in_expression", "REMOVE-IF-NOT-IN-EXPRESSION", 2, 3, false);
        declareFunction("expression_find_any", "EXPRESSION-FIND-ANY", 2, 3, false);
        declareFunction("expression_map_int", "EXPRESSION-MAP-INT", 4, 0, false);
        declareFunction("expression_map", "EXPRESSION-MAP", 2, 2, false);
        declareFunction("formula_map", "FORMULA-MAP", 2, 2, false);
        declareFunction("assertion_map", "ASSERTION-MAP", 2, 2, false);
        declareFunction("nart_map", "NART-MAP", 2, 2, false);
        declareFunction("expression_ntransform_int", "EXPRESSION-NTRANSFORM-INT", 8, 0, false);
        declareFunction("expression_transform", "EXPRESSION-TRANSFORM", 3, 2, false);
        declareFunction("expression_ntransform", "EXPRESSION-NTRANSFORM", 3, 2, false);
        declareFunction("formula_transform", "FORMULA-TRANSFORM", 3, 2, false);
        declareFunction("formula_ntransform", "FORMULA-NTRANSFORM", 3, 2, false);
        declareFunction("expression_transform_if", "EXPRESSION-TRANSFORM-IF", 3, 2, false);
        declareFunction("expression_ntransform_if", "EXPRESSION-NTRANSFORM-IF", 3, 2, false);
        declareFunction("formula_transform_if", "FORMULA-TRANSFORM-IF", 3, 2, false);
        declareFunction("formula_ntransform_if", "FORMULA-NTRANSFORM-IF", 3, 2, false);
        declareFunction("expression_transform_if_not", "EXPRESSION-TRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("expression_ntransform_if_not", "EXPRESSION-NTRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("formula_transform_if_not", "FORMULA-TRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("formula_ntransform_if_not", "FORMULA-NTRANSFORM-IF-NOT", 3, 2, false);
        declareFunction("formula_and_mt_transform", "FORMULA-AND-MT-TRANSFORM", 4, 2, false);
        declareFunction("formula_and_mt_ntransform", "FORMULA-AND-MT-NTRANSFORM", 4, 2, false);
        declareFunction("sentence_and_mt_transform", "SENTENCE-AND-MT-TRANSFORM", 4, 2, false);
        declareFunction("sentence_and_mt_ntransform", "SENTENCE-AND-MT-NTRANSFORM", 4, 2, false);
        declareFunction("expression_nsubst_free_vars_int", "EXPRESSION-NSUBST-FREE-VARS-INT", 4, 0, false);
        declareFunction("expression_nsubst_free_vars", "EXPRESSION-NSUBST-FREE-VARS", 3, 1, false);
        declareFunction("expression_nsubst_int", "EXPRESSION-NSUBST-INT", 5, 0, false);
        declareFunction("expression_subst", "EXPRESSION-SUBST", 3, 2, false);
        declareFunction("expression_nsubst", "EXPRESSION-NSUBST", 3, 2, false);
        declareFunction("formula_subst", "FORMULA-SUBST", 3, 2, false);
        declareFunction("formula_nsubst", "FORMULA-NSUBST", 3, 2, false);
        declareFunction("expression_nsublis_free_vars_int", "EXPRESSION-NSUBLIS-FREE-VARS-INT", 3, 0, false);
        declareFunction("expression_nsublis_free_vars", "EXPRESSION-NSUBLIS-FREE-VARS", 2, 1, false);
        declareFunction("expression_nsublis_int", "EXPRESSION-NSUBLIS-INT", 4, 0, false);
        declareFunction("expression_sublis", "EXPRESSION-SUBLIS", 2, 2, false);
        declareFunction("expression_nsublis", "EXPRESSION-NSUBLIS", 2, 2, false);
        declareFunction("formula_sublis", "FORMULA-SUBLIS", 2, 2, false);
        declareFunction("formula_nsublis", "FORMULA-NSUBLIS", 2, 2, false);
        declareFunction("expression_nsublis_el_variables", "EXPRESSION-NSUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("expression_sublis_el_variables", "EXPRESSION-SUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("expression_nsublis_hl_variables", "EXPRESSION-NSUBLIS-HL-VARIABLES", 1, 0, false);
        declareFunction("expression_sublis_hl_variables", "EXPRESSION-SUBLIS-HL-VARIABLES", 1, 0, false);
        declareFunction("cnf_nsublis_el_variables", "CNF-NSUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("cnf_sublis_el_variables", "CNF-SUBLIS-EL-VARIABLES", 2, 0, false);
        declareFunction("formula_arg_position_subst", "FORMULA-ARG-POSITION-SUBST", 3, 0, false);
        declareFunction("formula_arg_position_nsubst", "FORMULA-ARG-POSITION-NSUBST", 3, 0, false);
        declareFunction("permute_formula", "PERMUTE-FORMULA", 3, 0, false);
        declareFunction("formula_permutations", "FORMULA-PERMUTATIONS", 2, 0, false);
        declareFunction("formulas_permutations", "FORMULAS-PERMUTATIONS", 2, 0, false);
        declareFunction("formula_arg_permutations", "FORMULA-ARG-PERMUTATIONS", 1, 0, false);
        declareFunction("nat_commutative_permutations", "NAT-COMMUTATIVE-PERMUTATIONS", 1, 0, false);
        declareFunction("clear_permute_list_cached", "CLEAR-PERMUTE-LIST-CACHED", 0, 0, false);
        declareFunction("remove_permute_list_cached", "REMOVE-PERMUTE-LIST-CACHED", 1, 0, false);
        declareFunction("permute_list_cached_internal", "PERMUTE-LIST-CACHED-INTERNAL", 1, 0, false);
        declareFunction("permute_list_cached", "PERMUTE-LIST-CACHED", 1, 0, false);
        declareFunction("formula_commutative_permutations", "FORMULA-COMMUTATIVE-PERMUTATIONS", 1, 1, false);
        declareFunction("canonical_commutative_permutations", "CANONICAL-COMMUTATIVE-PERMUTATIONS", 1, 2, false);
        declareFunction("variable_argnums", "VARIABLE-ARGNUMS", 1, 1, false);
        declareFunction("args_canonical_commutative_permutations", "ARGS-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
        declareFunction("formulas_canonical_permutations", "FORMULAS-CANONICAL-PERMUTATIONS", 1, 0, false);
        declareFunction("canonical_permute_formula", "CANONICAL-PERMUTE-FORMULA", 3, 0, false);
        declareFunction("nat_canonical_commutative_permutations", "NAT-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
        declareFunction("split_list_set", "SPLIT-LIST-SET", 1, 0, false);
        declareFunction("permutations_merge", "PERMUTATIONS-MERGE", 2, 0, false);
        declareFunction("formula_operator_recursive", "FORMULA-OPERATOR-RECURSIVE", 1, 0, false);
        declareFunction("rename_default_el_vars_int", "RENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
        declareFunction("rename_default_el_vars", "RENAME-DEFAULT-EL-VARS", 1, 0, false);
        declareFunction("rename_default_el_vars_destructive", "RENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
        declareFunction("unrename_default_el_vars_int", "UNRENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
        declareFunction("unrename_default_el_vars", "UNRENAME-DEFAULT-EL-VARS", 1, 0, false);
        declareFunction("unrename_default_el_vars_destructive", "UNRENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
        declareFunction("renamed_default_el_var_num", "RENAMED-DEFAULT-EL-VAR-NUM", 1, 0, false);
        declareFunction("renamed_default_el_var_p", "RENAMED-DEFAULT-EL-VAR-P", 1, 0, false);
        new cycl_utilities.$renamed_default_el_var_p$UnaryFunction();
        declareFunction("get_renamed_default_el_var", "GET-RENAMED-DEFAULT-EL-VAR", 1, 0, false);
        declareFunction("non_indexed_fort_p", "NON-INDEXED-FORT-P", 1, 0, false);
        declareFunction("fort_or_naut_p", "FORT-OR-NAUT-P", 1, 0, false);
        declareFunction("fort_or_possibly_naut_p", "FORT-OR-POSSIBLY-NAUT-P", 1, 0, false);
        declareFunction("naut_substitute", "NAUT-SUBSTITUTE", 1, 0, false);
        declareFunction("collection_intersection_natP", "COLLECTION-INTERSECTION-NAT?", 1, 0, false);
        declareFunction("collection_union_natP", "COLLECTION-UNION-NAT?", 1, 0, false);
        declareFunction("collection_intersection", "COLLECTION-INTERSECTION", 1, 0, false);
        declareFunction("collection_union", "COLLECTION-UNION", 1, 0, false);
        declareFunction("collection_intersection_intersectees", "COLLECTION-INTERSECTION-INTERSECTEES", 1, 0, false);
        declareFunction("collection_union_united_collections", "COLLECTION-UNION-UNITED-COLLECTIONS", 1, 0, false);
        declareFunction("find_denotational_term", "FIND-DENOTATIONAL-TERM", 1, 0, false);
        declareFunction("denotational_term_name", "DENOTATIONAL-TERM-NAME", 1, 0, false);
        declareFunction("denotational_term_name_for_alpha_sort", "DENOTATIONAL-TERM-NAME-FOR-ALPHA-SORT", 1, 0, false);
        declareFunction("sorted_constant_list", "SORTED-CONSTANT-LIST", 1, 0, false);
        declareFunction("sorted_constant_external_id_list", "SORTED-CONSTANT-EXTERNAL-ID-LIST", 1, 0, false);
        declareFunction("sorted_constant_internal_id_list", "SORTED-CONSTANT-INTERNAL-ID-LIST", 1, 0, false);
        declareFunction("constant_list", "CONSTANT-LIST", 1, 1, false);
        declareFunction("sorted_nat_list", "SORTED-NAT-LIST", 1, 0, false);
        declareFunction("nat_list", "NAT-LIST", 1, 0, false);
        declareFunction("sorted_assertion_list", "SORTED-ASSERTION-LIST", 1, 0, false);
        declareFunction("assertion_list", "ASSERTION-LIST", 1, 0, false);
        declareFunction("sorted_fort_id_list", "SORTED-FORT-ID-LIST", 1, 0, false);
        declareFunction("functional_in_some_argP", "FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
        declareFunction("functional_in_arg_positions_internal", "FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
        declareFunction("functional_in_arg_positions", "FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
        declareFunction("strictly_functional_in_some_argP", "STRICTLY-FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
        declareFunction("strictly_functional_in_arg_positions_internal", "STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
        declareFunction("strictly_functional_in_arg_positions", "STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
        declareFunction("nart_cons", "NART-CONS", 1, 0, false);
        declareFunction("lookup_all_narts", "LOOKUP-ALL-NARTS", 1, 0, false);
        declareFunction("reify_all_existing_narts", "REIFY-ALL-EXISTING-NARTS", 1, 0, false);
        declareFunction("opaque_arg_wrt_nat_reificationP", "OPAQUE-ARG-WRT-NAT-REIFICATION?", 2, 0, false);
        declareFunction("reify_arg_when_closed_naut", "REIFY-ARG-WHEN-CLOSED-NAUT", 2, 0, false);
        declareFunction("reify_when_closed_naut", "REIFY-WHEN-CLOSED-NAUT", 1, 0, false);
        declareFunction("find_when_closed_naut", "FIND-WHEN-CLOSED-NAUT", 1, 0, false);
        declareFunction("find_closed_naut", "FIND-CLOSED-NAUT", 1, 0, false);
        declareFunction("find_when_ground_naut", "FIND-WHEN-GROUND-NAUT", 1, 0, false);
        declareFunction("find_ground_naut", "FIND-GROUND-NAUT", 1, 0, false);
        declareFunction("ground_hl_formulaP", "GROUND-HL-FORMULA?", 1, 0, false);
        declareFunction("atomic_sentence_with_pred_p", "ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false);
        declareFunction("atomic_sentence_with_any_of_preds_p", "ATOMIC-SENTENCE-WITH-ANY-OF-PREDS-P", 2, 0, false);
        declareFunction("null_or_falseP", "NULL-OR-FALSE?", 1, 0, false);
        declareFunction("possibly_cycl_formula_p", "POSSIBLY-CYCL-FORMULA-P", 1, 0, false);
        declareFunction("negatedP", "NEGATED?", 1, 0, false);
        declareFunction("negate", "NEGATE", 1, 0, false);
        declareFunction("possibly_negate", "POSSIBLY-NEGATE", 2, 0, false);
        declareFunction("formula_arg", "FORMULA-ARG", 2, 1, false);
        declareFunction("el_formula_arg", "EL-FORMULA-ARG", 2, 1, false);
        declareFunction("el_formula_has_argP", "EL-FORMULA-HAS-ARG?", 3, 0, false);
        declareFunction("formula_arg0", "FORMULA-ARG0", 1, 0, false);
        declareFunction("formula_operator", "FORMULA-OPERATOR", 1, 0, false);
        declareFunction("el_formula_operator", "EL-FORMULA-OPERATOR", 1, 0, false);
        declareFunction("el_formula_arg1", "EL-FORMULA-ARG1", 1, 1, false);
        declareFunction("el_formula_arg2", "EL-FORMULA-ARG2", 1, 1, false);
        declareFunction("el_formula_arg3", "EL-FORMULA-ARG3", 1, 1, false);
        declareFunction("formula_arg1", "FORMULA-ARG1", 1, 1, false);
        declareFunction("formula_arg2", "FORMULA-ARG2", 1, 1, false);
        declareFunction("formula_arg3", "FORMULA-ARG3", 1, 1, false);
        declareFunction("formula_arg4", "FORMULA-ARG4", 1, 1, false);
        declareFunction("formula_arg5", "FORMULA-ARG5", 1, 1, false);
        declareFunction("formula_arg6", "FORMULA-ARG6", 1, 1, false);
        declareFunction("formula_args", "FORMULA-ARGS", 1, 1, false);
        declareFunction("el_formula_args", "EL-FORMULA-ARGS", 1, 1, false);
        declareFunction("cycl_formula_args", "CYCL-FORMULA-ARGS", 1, 0, false);
        declareFunction("cycl_formula_arg0", "CYCL-FORMULA-ARG0", 1, 0, false);
        declareFunction("cycl_formula_arg1", "CYCL-FORMULA-ARG1", 1, 0, false);
        declareFunction("cycl_formula_arg2", "CYCL-FORMULA-ARG2", 1, 0, false);
        declareFunction("cycl_formula_arg3", "CYCL-FORMULA-ARG3", 1, 0, false);
        declareFunction("formula_terms", "FORMULA-TERMS", 1, 1, false);
        declareFunction("el_formula_terms", "EL-FORMULA-TERMS", 1, 1, false);
        declareFunction("formula_terms_int", "FORMULA-TERMS-INT", 2, 1, false);
        declareFunction("formula_terms_int_two_pass", "FORMULA-TERMS-INT-TWO-PASS", 2, 0, false);
        declareFunction("formula_terms_int_one_pass", "FORMULA-TERMS-INT-ONE-PASS", 2, 0, false);
        declareFunction("formula_arg_positions", "FORMULA-ARG-POSITIONS", 2, 1, false);
        declareFunction("el_formula_arg_positions", "EL-FORMULA-ARG-POSITIONS", 2, 1, false);
        declareFunction("possibly_conjuncts", "POSSIBLY-CONJUNCTS", 1, 0, false);
        declareFunction("nat_arity", "NAT-ARITY", 1, 1, false);
        declareFunction("nat_args", "NAT-ARGS", 1, 1, false);
        declareFunction("naut_args", "NAUT-ARGS", 1, 1, false);
        declareFunction("nat_arg", "NAT-ARG", 2, 1, false);
        declareFunction("naut_arg", "NAUT-ARG", 2, 1, false);
        declareFunction("nat_function", "NAT-FUNCTION", 1, 0, false);
        declareFunction("nat_functor", "NAT-FUNCTOR", 1, 0, false);
        declareFunction("naut_functor", "NAUT-FUNCTOR", 1, 0, false);
        declareFunction("nat_arg0", "NAT-ARG0", 1, 0, false);
        declareFunction("nat_arg1", "NAT-ARG1", 1, 1, false);
        declareFunction("naut_arg1", "NAUT-ARG1", 1, 1, false);
        declareFunction("nat_arg2", "NAT-ARG2", 1, 1, false);
        declareFunction("naut_arg2", "NAUT-ARG2", 1, 1, false);
        declareFunction("nat_arg3", "NAT-ARG3", 1, 1, false);
        declareFunction("naut_arg3", "NAUT-ARG3", 1, 1, false);
        declareFunction("nat_arg4", "NAT-ARG4", 1, 1, false);
        declareFunction("nat_arg5", "NAT-ARG5", 1, 1, false);
        declareFunction("nat_with_functor_p", "NAT-WITH-FUNCTOR-P", 2, 0, false);
        declareFunction("naut_with_functor_p", "NAUT-WITH-FUNCTOR-P", 2, 0, false);
        declareFunction("naut_with_any_of_functors_p", "NAUT-WITH-ANY-OF-FUNCTORS-P", 2, 0, false);
        declareFunction("cycl_nat_with_functor_p", "CYCL-NAT-WITH-FUNCTOR-P", 2, 0, false);
        declareFunction("sentence_arg", "SENTENCE-ARG", 2, 1, false);
        declareFunction("sentence_args", "SENTENCE-ARGS", 1, 1, false);
        declareFunction("sentence_truth_function", "SENTENCE-TRUTH-FUNCTION", 1, 0, false);
        declareFunction("sentence_arg0", "SENTENCE-ARG0", 1, 0, false);
        declareFunction("sentence_arg1", "SENTENCE-ARG1", 1, 1, false);
        declareFunction("sentence_arg2", "SENTENCE-ARG2", 1, 1, false);
        declareFunction("sentence_arg3", "SENTENCE-ARG3", 1, 1, false);
        declareFunction("sentence_arg4", "SENTENCE-ARG4", 1, 1, false);
        declareFunction("sentence_arg5", "SENTENCE-ARG5", 1, 1, false);
        declareFunction("atomic_sentence_arg", "ATOMIC-SENTENCE-ARG", 2, 1, false);
        declareFunction("atomic_sentence_args", "ATOMIC-SENTENCE-ARGS", 1, 1, false);
        declareFunction("atomic_sentence_predicate", "ATOMIC-SENTENCE-PREDICATE", 1, 0, false);
        new cycl_utilities.$atomic_sentence_predicate$UnaryFunction();
        declareFunction("atomic_sentence_arg0", "ATOMIC-SENTENCE-ARG0", 1, 0, false);
        declareFunction("atomic_sentence_arg1", "ATOMIC-SENTENCE-ARG1", 1, 1, false);
        declareFunction("atomic_sentence_arg2", "ATOMIC-SENTENCE-ARG2", 1, 1, false);
        declareFunction("atomic_sentence_arg3", "ATOMIC-SENTENCE-ARG3", 1, 1, false);
        declareFunction("atomic_sentence_arg4", "ATOMIC-SENTENCE-ARG4", 1, 1, false);
        declareFunction("atomic_sentence_arg5", "ATOMIC-SENTENCE-ARG5", 1, 1, false);
        declareFunction("atomic_sentence_arg6", "ATOMIC-SENTENCE-ARG6", 1, 1, false);
        declareFunction("arg_position_p", "ARG-POSITION-P", 1, 0, false);
        declareFunction("formula_arg_position", "FORMULA-ARG-POSITION", 2, 1, false);
        declareFunction("get_nested_nth_arg", "GET-NESTED-NTH-ARG", 2, 1, false);
        declareFunction("arg_positions_dfs", "ARG-POSITIONS-DFS", 2, 1, false);
        declareFunction("arg_positions_bfs", "ARG-POSITIONS-BFS", 2, 1, false);
        declareFunction("arg_positions_if_dfs", "ARG-POSITIONS-IF-DFS", 2, 1, false);
        declareFunction("arg_positions_if_bfs", "ARG-POSITIONS-IF-BFS", 2, 1, false);
        declareFunction("smallest_enclosing_cycl_sentence", "SMALLEST-ENCLOSING-CYCL-SENTENCE", 2, 0, false);
        declareFunction("cycl_arg_position_p", "CYCL-ARG-POSITION-P", 1, 0, false);
        declareFunction("make_cycl_arg_position", "MAKE-CYCL-ARG-POSITION", 1, 0, false);
        declareFunction("cycl_arg_position_to_arg_position", "CYCL-ARG-POSITION-TO-ARG-POSITION", 1, 0, false);
        declareFunction("formula_cycl_arg_position", "FORMULA-CYCL-ARG-POSITION", 2, 1, false);
        declareFunction("cycl_arg_position_nsubst", "CYCL-ARG-POSITION-NSUBST", 3, 0, false);
        declareFunction("substitute_terms_into_positions", "SUBSTITUTE-TERMS-INTO-POSITIONS", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_cycl_utilities_file_alt() {
        defparameter("*OPAQUE-ARG-FUNCTION*", $sym0$DEFAULT_OPAQUE_ARG_);
        defparameter("*OPAQUE-SEQVAR-FUNCTION*", $sym1$DEFAULT_OPAQUE_SEQVAR_);
        defparameter("*EXPRESSION-COUNT-ITEM*", NIL);
        defparameter("*EXPRESSION-COUNT-TEST*", NIL);
        defparameter("*CONTAINING-SUBEXPRESSIONS-LAMBDA-TERM*", NIL);
        deflexical("*DEFAULT-TRANSFORMATION-LIMIT*", $int$212);
        deflexical("*PERMUTE-LIST-CACHED-CACHING-STATE*", NIL);
        defparameter("*RENAMED-DEFAULT-EL-VAR-PREFIX*", $str_alt39$_RENAMED_VAR);
        deflexical("*NON-INDEXED-CONSTANTS*", append(new SubLObject[]{ $cyc_const_unary_logical_ops$.getGlobalValue(), $cyc_const_binary_logical_ops$.getGlobalValue(), $cyc_const_ternary_logical_ops$.getGlobalValue(), $cyc_const_quaternary_logical_ops$.getGlobalValue(), $cyc_const_quintary_logical_ops$.getGlobalValue(), $cyc_const_variable_arity_logical_ops$.getGlobalValue(), $cyc_const_regular_quantifiers$.getGlobalValue(), $cyc_const_bounded_existentials$.getGlobalValue(), $cyc_const_exception_operators$.getGlobalValue(), $cyc_const_pragmatic_requirement_operators$.getGlobalValue() }));
        return NIL;
    }

    public static SubLObject init_cycl_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*OPAQUE-ARG-FUNCTION*", $sym0$DEFAULT_OPAQUE_ARG_);
            defparameter("*OPAQUE-SEQVAR-FUNCTION*", $sym1$DEFAULT_OPAQUE_SEQVAR_);
            defparameter("*EXPRESSION-COUNT-ITEM*", NIL);
            defparameter("*EXPRESSION-COUNT-TEST*", NIL);
            defparameter("*CONTAINING-SUBEXPRESSIONS-LAMBDA-TERM*", NIL);
            deflexical("*DEFAULT-TRANSFORMATION-LIMIT*", $int$212);
            deflexical("*PERMUTE-LIST-CACHED-CACHING-STATE*", NIL);
            defparameter("*RENAMED-DEFAULT-EL-VAR-PREFIX*", $str44$_RENAMED_VAR);
            deflexical("*NON-INDEXED-CONSTANTS*", append(new SubLObject[]{ $cyc_const_unary_logical_ops$.getGlobalValue(), $cyc_const_binary_logical_ops$.getGlobalValue(), $cyc_const_ternary_logical_ops$.getGlobalValue(), $cyc_const_quaternary_logical_ops$.getGlobalValue(), $cyc_const_quintary_logical_ops$.getGlobalValue(), $cyc_const_variable_arity_logical_ops$.getGlobalValue(), $cyc_const_regular_quantifiers$.getGlobalValue(), $cyc_const_bounded_existentials$.getGlobalValue(), $cyc_const_exception_operators$.getGlobalValue(), $cyc_const_pragmatic_requirement_operators$.getGlobalValue() }));
        }
        if (SubLFiles.USE_V2) {
            defparameter("*RENAMED-DEFAULT-EL-VAR-PREFIX*", $str_alt39$_RENAMED_VAR);
        }
        return NIL;
    }

    public static SubLObject init_cycl_utilities_file_Previous() {
        defparameter("*OPAQUE-ARG-FUNCTION*", $sym0$DEFAULT_OPAQUE_ARG_);
        defparameter("*OPAQUE-SEQVAR-FUNCTION*", $sym1$DEFAULT_OPAQUE_SEQVAR_);
        defparameter("*EXPRESSION-COUNT-ITEM*", NIL);
        defparameter("*EXPRESSION-COUNT-TEST*", NIL);
        defparameter("*CONTAINING-SUBEXPRESSIONS-LAMBDA-TERM*", NIL);
        deflexical("*DEFAULT-TRANSFORMATION-LIMIT*", $int$212);
        deflexical("*PERMUTE-LIST-CACHED-CACHING-STATE*", NIL);
        defparameter("*RENAMED-DEFAULT-EL-VAR-PREFIX*", $str44$_RENAMED_VAR);
        deflexical("*NON-INDEXED-CONSTANTS*", append(new SubLObject[]{ $cyc_const_unary_logical_ops$.getGlobalValue(), $cyc_const_binary_logical_ops$.getGlobalValue(), $cyc_const_ternary_logical_ops$.getGlobalValue(), $cyc_const_quaternary_logical_ops$.getGlobalValue(), $cyc_const_quintary_logical_ops$.getGlobalValue(), $cyc_const_variable_arity_logical_ops$.getGlobalValue(), $cyc_const_regular_quantifiers$.getGlobalValue(), $cyc_const_bounded_existentials$.getGlobalValue(), $cyc_const_exception_operators$.getGlobalValue(), $cyc_const_pragmatic_requirement_operators$.getGlobalValue() }));
        return NIL;
    }

    public static final SubLObject setup_cycl_utilities_file_alt() {
        register_external_symbol(EXPRESSION_FIND_IF);
        memoization_state.note_globally_cached_function(PERMUTE_LIST_CACHED);
        memoization_state.note_memoized_function(FUNCTIONAL_IN_ARG_POSITIONS);
        register_cyc_api_function($sym66$NEGATED_, $list_alt67, $str_alt68$Assuming_FORM_is_a_valid_CycL_for, $list_alt69, $list_alt70);
        register_cyc_api_function(NEGATE, $list_alt67, $str_alt72$Assuming_FORM_is_a_valid_CycL_for, $list_alt69, $list_alt73);
        register_external_symbol(FORMULA_OPERATOR);
        sunit_external.define_test_category($str_alt87$CycL_Utilities_Module_Supercatego, UNPROVIDED);
        sunit_external.define_test_category($$$CycL_Utilities_Subcategory, list($str_alt87$CycL_Utilities_Module_Supercatego));
        sunit_external.define_test_suite($$$CycL_Utilities_Testing_Suite, list($str_alt87$CycL_Utilities_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CYCL_FORMULA_ARG_FNS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(CYCL_FORMULA_ARG_FNS);
        classes.subloop_new_class(CYCL_FORMULA_ARG_FNS, TEST_CASE, NIL, NIL, $list_alt92);
        classes.class_set_implements_slot_listeners(CYCL_FORMULA_ARG_FNS, NIL);
        classes.subloop_note_class_initialization_function(CYCL_FORMULA_ARG_FNS, SUBLOOP_RESERVED_INITIALIZE_CYCL_FORMULA_ARG_FNS_CLASS);
        classes.subloop_note_instance_initialization_function(CYCL_FORMULA_ARG_FNS, SUBLOOP_RESERVED_INITIALIZE_CYCL_FORMULA_ARG_FNS_INSTANCE);
        com.cyc.cycjava.cycl.cycl_utilities.subloop_reserved_initialize_cycl_formula_arg_fns_class(CYCL_FORMULA_ARG_FNS);
        sunit_macros.define_test_case_postamble(CYCL_FORMULA_ARG_FNS, $str_alt108$cycl_utilities, $$$cycl, $list_alt110);
        sunit_macros.def_test_method_register(CYCL_FORMULA_ARG_FNS, TEST);
        return NIL;
    }

    public static SubLObject setup_cycl_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(EXPRESSION_FIND_IF);
            register_external_symbol(EXPRESSION_SUBST);
            register_external_symbol(FORMULA_SUBST);
            memoization_state.note_globally_cached_function(PERMUTE_LIST_CACHED);
            memoization_state.note_memoized_function(FUNCTIONAL_IN_ARG_POSITIONS);
            memoization_state.note_memoized_function(STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS);
            register_cyc_api_function($sym79$NEGATED_, $list80, $str81$Return_T_iff_OBJECT_is_a_negated_, NIL, $list82);
            register_cyc_api_function(NEGATE, $list85, $str86$Assuming_FORM_is_a_valid_CycL_for, $list87, $list88);
            SubLSpecialOperatorDeclarations.proclaim($list92);
            register_external_symbol(FORMULA_OPERATOR);
            SubLSpecialOperatorDeclarations.proclaim($list94);
            SubLSpecialOperatorDeclarations.proclaim($list99);
            SubLSpecialOperatorDeclarations.proclaim($list100);
            SubLSpecialOperatorDeclarations.proclaim($list101);
            SubLSpecialOperatorDeclarations.proclaim($list102);
            SubLSpecialOperatorDeclarations.proclaim($list103);
            SubLSpecialOperatorDeclarations.proclaim($list104);
            SubLSpecialOperatorDeclarations.proclaim($list105);
            sunit_external.define_test_category($str111$CycL_Utilities_Module_Supercatego, UNPROVIDED);
            sunit_external.define_test_category($$$CycL_Utilities_Subcategory, list($str111$CycL_Utilities_Module_Supercatego));
            sunit_external.define_test_suite($$$CycL_Utilities_Testing_Suite, list($str111$CycL_Utilities_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function($sym66$NEGATED_, $list_alt67, $str_alt68$Assuming_FORM_is_a_valid_CycL_for, $list_alt69, $list_alt70);
            register_cyc_api_function(NEGATE, $list_alt67, $str_alt72$Assuming_FORM_is_a_valid_CycL_for, $list_alt69, $list_alt73);
            sunit_external.define_test_category($str_alt87$CycL_Utilities_Module_Supercatego, UNPROVIDED);
            sunit_external.define_test_category($$$CycL_Utilities_Subcategory, list($str_alt87$CycL_Utilities_Module_Supercatego));
            sunit_external.define_test_suite($$$CycL_Utilities_Testing_Suite, list($str_alt87$CycL_Utilities_Module_Supercatego), UNPROVIDED, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CYCL_FORMULA_ARG_FNS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(CYCL_FORMULA_ARG_FNS);
            classes.subloop_new_class(CYCL_FORMULA_ARG_FNS, TEST_CASE, NIL, NIL, $list_alt92);
            classes.class_set_implements_slot_listeners(CYCL_FORMULA_ARG_FNS, NIL);
            classes.subloop_note_class_initialization_function(CYCL_FORMULA_ARG_FNS, SUBLOOP_RESERVED_INITIALIZE_CYCL_FORMULA_ARG_FNS_CLASS);
            classes.subloop_note_instance_initialization_function(CYCL_FORMULA_ARG_FNS, SUBLOOP_RESERVED_INITIALIZE_CYCL_FORMULA_ARG_FNS_INSTANCE);
            com.cyc.cycjava.cycl.cycl_utilities.subloop_reserved_initialize_cycl_formula_arg_fns_class(CYCL_FORMULA_ARG_FNS);
            sunit_macros.define_test_case_postamble(CYCL_FORMULA_ARG_FNS, $str_alt108$cycl_utilities, $$$cycl, $list_alt110);
            sunit_macros.def_test_method_register(CYCL_FORMULA_ARG_FNS, TEST);
        }
        return NIL;
    }

    public static SubLObject setup_cycl_utilities_file_Previous() {
        register_external_symbol(EXPRESSION_FIND_IF);
        register_external_symbol(EXPRESSION_SUBST);
        register_external_symbol(FORMULA_SUBST);
        memoization_state.note_globally_cached_function(PERMUTE_LIST_CACHED);
        memoization_state.note_memoized_function(FUNCTIONAL_IN_ARG_POSITIONS);
        memoization_state.note_memoized_function(STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS);
        register_cyc_api_function($sym79$NEGATED_, $list80, $str81$Return_T_iff_OBJECT_is_a_negated_, NIL, $list82);
        register_cyc_api_function(NEGATE, $list85, $str86$Assuming_FORM_is_a_valid_CycL_for, $list87, $list88);
        SubLSpecialOperatorDeclarations.proclaim($list92);
        register_external_symbol(FORMULA_OPERATOR);
        SubLSpecialOperatorDeclarations.proclaim($list94);
        SubLSpecialOperatorDeclarations.proclaim($list99);
        SubLSpecialOperatorDeclarations.proclaim($list100);
        SubLSpecialOperatorDeclarations.proclaim($list101);
        SubLSpecialOperatorDeclarations.proclaim($list102);
        SubLSpecialOperatorDeclarations.proclaim($list103);
        SubLSpecialOperatorDeclarations.proclaim($list104);
        SubLSpecialOperatorDeclarations.proclaim($list105);
        sunit_external.define_test_category($str111$CycL_Utilities_Module_Supercatego, UNPROVIDED);
        sunit_external.define_test_category($$$CycL_Utilities_Subcategory, list($str111$CycL_Utilities_Module_Supercatego));
        sunit_external.define_test_suite($$$CycL_Utilities_Testing_Suite, list($str111$CycL_Utilities_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycl_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cycl_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycl_utilities_file();
    }

    static {
    }

    public static final class $opaque_arg_wrt_quotingP$BinaryFunction extends BinaryFunction {
        public $opaque_arg_wrt_quotingP$BinaryFunction() {
            super(extractFunctionNamed("OPAQUE-ARG-WRT-QUOTING?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return opaque_arg_wrt_quotingP(arg1, arg2);
        }
    }

    public static final class $hl_term_with_el_counterpart_p$UnaryFunction extends UnaryFunction {
        public $hl_term_with_el_counterpart_p$UnaryFunction() {
            super(extractFunctionNamed("HL-TERM-WITH-EL-COUNTERPART-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_term_with_el_counterpart_p(arg1);
        }
    }

    public static final class $hl_term_to_el_term$UnaryFunction extends UnaryFunction {
        public $hl_term_to_el_term$UnaryFunction() {
            super(extractFunctionNamed("HL-TERM-TO-EL-TERM"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_term_to_el_term(arg1);
        }
    }

    public static final class $renamed_default_el_var_p$UnaryFunction extends UnaryFunction {
        public $renamed_default_el_var_p$UnaryFunction() {
            super(extractFunctionNamed("RENAMED-DEFAULT-EL-VAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return renamed_default_el_var_p(arg1);
        }
    }

    public static final class $atomic_sentence_predicate$UnaryFunction extends UnaryFunction {
        public $atomic_sentence_predicate$UnaryFunction() {
            super(extractFunctionNamed("ATOMIC-SENTENCE-PREDICATE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return atomic_sentence_predicate(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("FUNC"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt20$_S_is_not_well_formed_ = makeString("~S is not well formed.");

    static private final SubLSymbol $sym29$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym30$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLSymbol $kw33$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt34 = list(NIL);

    static private final SubLList $list_alt35 = list(makeSymbol("FRONT1"), makeSymbol("REST1"));

    static private final SubLList $list_alt36 = list(makeSymbol("FRONT2"), makeSymbol("REST2"));

    static private final SubLSymbol $sym37$DEFAULT_EL_VAR_ = makeSymbol("DEFAULT-EL-VAR?");

    static private final SubLString $str_alt39$_RENAMED_VAR = makeString("?RENAMED-VAR");

    static private final SubLSymbol $sym44$COLLECTION_INTERSECTION_NAT_ = makeSymbol("COLLECTION-INTERSECTION-NAT?");

    static private final SubLSymbol $sym45$COLLECTION_UNION_NAT_ = makeSymbol("COLLECTION-UNION-NAT?");

    static private final SubLSymbol $sym46$CONSTANT_EXTERNAL_ID__ = makeSymbol("CONSTANT-EXTERNAL-ID-<");

    static private final SubLSymbol $sym48$_ = makeSymbol("<");

    static private final SubLSymbol $sym53$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");

    static private final SubLSymbol $sym59$OPAQUE_ARG_WRT_NAT_REIFICATION_ = makeSymbol("OPAQUE-ARG-WRT-NAT-REIFICATION?");

    static private final SubLSymbol $sym66$NEGATED_ = makeSymbol("NEGATED?");

    static private final SubLList $list_alt67 = list(makeSymbol("FORM"));

    static private final SubLString $str_alt68$Assuming_FORM_is_a_valid_CycL_for = makeString("Assuming FORM is a valid CycL formula, return T IFF it is negated.");

    static private final SubLList $list_alt69 = list(list(makeSymbol("FORM"), makeSymbol("EL-FORMULA-P")));

    static private final SubLList $list_alt70 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt72$Assuming_FORM_is_a_valid_CycL_for = makeString("Assuming FORM is a valid CycL formula, return a negated version of it.");

    static private final SubLList $list_alt73 = list(makeSymbol("EL-FORMULA-P"));

    static private final SubLString $str_alt80$formula_terms_int_got_a_non_el_va = makeString("formula-terms-int got a non-el-variable or cons: ~A~%");

    static private final SubLString $str_alt87$CycL_Utilities_Module_Supercatego = makeString("CycL-Utilities Module Supercategory");

    private static final SubLSymbol CYCL_FORMULA_ARG_FNS = makeSymbol("CYCL-FORMULA-ARG-FNS");

    static private final SubLList $list_alt92 = list(list(makeSymbol("P-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_FORMULA_ARG_FNS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-FORMULA-ARG-FNS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_FORMULA_ARG_FNS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-FORMULA-ARG-FNS-INSTANCE");

    static private final SubLString $str_alt108$cycl_utilities = makeString("cycl-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt110 = list(makeString("CycL Utilities Subcategory"));
}

/**
 * Total time: 922 ms
 */
