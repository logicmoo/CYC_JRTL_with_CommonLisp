/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
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

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class at_var_types extends SubLTranslatedFile implements V12 {
    public static final SubLObject pos_lit_variable_isa_constraints_memoized_internal(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                SubLObject result = NIL;
                if (NIL != list_utilities.tree_find(var, literal, symbol_function(EQUAL), UNPROVIDED)) {
                    if (NIL == forts.fort_p(predicate)) {
                        predicate = cycl_utilities.find_when_closed_naut(predicate);
                    }
                    {
                        SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (kb_accessors.scoping_args(predicate, mt))) : NIL;
                        SubLObject argnum = ZERO_INTEGER;
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                {
                                    SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL;
                                    {
                                        SubLObject _prev_bind_0_63 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_64 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(predicate, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            if (var.eql(com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(predicate))) {
                                                {
                                                    SubLObject doneP = NIL;
                                                    SubLObject has_sentence_argP = NIL;
                                                    SubLObject args = cycl_utilities.formula_args(literal, $IGNORE);
                                                    SubLObject rest = NIL;
                                                    for (rest = args; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                        {
                                                            SubLObject arg = rest.first();
                                                            if (NIL != term.sentenceP(arg, UNPROVIDED)) {
                                                                doneP = T;
                                                                has_sentence_argP = T;
                                                            }
                                                        }
                                                    }
                                                    if (NIL != has_sentence_argP) {
                                                        result = cons($$TruthFunction, result);
                                                    } else {
                                                        result = cons($$Predicate, result);
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    argnum = add(argnum, ONE_INTEGER);
                                                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                    } else {
                                                        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                                                        } else {
                                                            if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                                            } else {
                                                                if (var.equal(arg)) {
                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_isa(predicate, argnum));
                                                                } else {
                                                                    if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(predicate, argnum, mt)) {
                                                                    } else {
                                                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                                                            if (var.eql(cycl_utilities.nat_arg2(arg, UNPROVIDED))) {
                                                                                result = com.cyc.cycjava.cycl.at_var_types.at_argn_isa(predicate, argnum);
                                                                            }
                                                                            {
                                                                                SubLObject skolem_number = skolems.skolem_number(arg);
                                                                                if (NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_isa_constraints(var, skolem_number, mt));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                                                if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                                                    if (NIL != mt_designating_literalP(literal)) {
                                                                                        {
                                                                                            SubLObject mt_arg = designated_mt(literal);
                                                                                            SubLObject subformula = designated_sentence(literal);
                                                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_isa_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, argnum, mt)));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (NIL != arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                                                } else {
                                                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject items_var = com.cyc.cycjava.cycl.at_var_types.relation_variable_isa_constraints(var, arg, mt);
                                                                                            if (items_var.isVector()) {
                                                                                                {
                                                                                                    SubLObject vector_var = com.cyc.cycjava.cycl.at_var_types.relation_variable_isa_constraints(var, arg, mt);
                                                                                                    SubLObject backwardP_var = NIL;
                                                                                                    SubLObject length = length(vector_var);
                                                                                                    SubLObject v_iteration = NIL;
                                                                                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                                                        {
                                                                                                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                                                            SubLObject item = aref(vector_var, element_num);
                                                                                                            result = cons(item, result);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                {
                                                                                                    SubLObject cdolist_list_var_65 = com.cyc.cycjava.cycl.at_var_types.relation_variable_isa_constraints(var, arg, mt);
                                                                                                    SubLObject item = NIL;
                                                                                                    for (item = cdolist_list_var_65.first(); NIL != cdolist_list_var_65; cdolist_list_var_65 = cdolist_list_var_65.rest() , item = cdolist_list_var_65.first()) {
                                                                                                        result = cons(item, result);
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
                                                }
                                            }
                                            result = list_utilities.delete_duplicate_forts(result);
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_64, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_63, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject pos_lit_variable_isa_constraints_memoized(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_isa_constraints_memoized_internal(var, literal, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(var, literal, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (var.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (literal.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_isa_constraints_memoized_internal(var, literal, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, literal, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLFile me = new at_var_types();

 public static final String myName = "com.cyc.cycjava.cycl.at_var_types";


    // defparameter
    /**
     * Optimization to avoid checking whether something is a negationPred of
     * #$trueSentence over and over again
     */
    @LispMethod(comment = "Optimization to avoid checking whether something is a negationPred of\r\n#$trueSentence over and over again\ndefparameter\nOptimization to avoid checking whether something is a negationPred of\n#$trueSentence over and over again")
    private static final SubLSymbol $at_true_sentence_negation_preds$ = makeSymbol("*AT-TRUE-SENTENCE-NEGATION-PREDS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$__PRED_MUFFET_212 = makeSymbol("??PRED-MUFFET-212");

    static private final SubLSymbol $sym1$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLSymbol $sym2$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym3$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");

    private static final SubLSymbol $BAD_EXPONENTIAL_CONJUNCTION = makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");

    private static final SubLSymbol AT_VAR_TYPE_DNFS_INT_CACHED = makeSymbol("AT-VAR-TYPE-DNFS-INT-CACHED");

    private static final SubLSymbol SKOLEM_FUNCTION_VAR = makeSymbol("SKOLEM-FUNCTION-VAR");

    public static final SubLSymbol $at_var_type_dnfs_int_cached_caching_state$ = makeSymbol("*AT-VAR-TYPE-DNFS-INT-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol $BAD_EXPONENTIAL_DISJUNCTION = makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");

    private static final SubLSymbol AT_VAR_TYPES_CNFS_CLAUSIFY_INT = makeSymbol("AT-VAR-TYPES-CNFS-CLAUSIFY-INT");





    private static final SubLSymbol $sym15$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_ = makeSymbol("OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?");

    private static final SubLSymbol $sym16$AT_NEGATED_ = makeSymbol("AT-NEGATED?");

    private static final SubLSymbol AT_NEGATE = makeSymbol("AT-NEGATE");





    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");







    private static final SubLSymbol $sym25$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol CNF_VARIABLE_ISA_CONSTRAINTS_INT = makeSymbol("CNF-VARIABLE-ISA-CONSTRAINTS-INT");

    private static final SubLSymbol CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT = makeSymbol("CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT");

    private static final SubLSymbol CNF_VARIABLE_GENL_CONSTRAINTS_INT = makeSymbol("CNF-VARIABLE-GENL-CONSTRAINTS-INT");

    private static final SubLSymbol CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2 = makeSymbol("CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2");

    private static final SubLSymbol CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2 = makeSymbol("CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2");

    private static final SubLSymbol $DISJOINT_ARG_ISA = makeKeyword("DISJOINT-ARG-ISA");

    private static final SubLSymbol DNF_VARIABLE_ISA_CONSTRAINTS_INT = makeSymbol("DNF-VARIABLE-ISA-CONSTRAINTS-INT");

    private static final SubLSymbol $sym38$ISA_VAR_VAR_LIT_ = makeSymbol("ISA-VAR-VAR-LIT?");

    private static final SubLList $list39 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLSymbol $sym40$CONTEXTUALIZED_ISA_X_Y_LIT_ = makeSymbol("CONTEXTUALIZED-ISA-X-Y-LIT?");

    private static final SubLList $list41 = list(makeSymbol("ISA-MT"), makeSymbol("ISA-X-Y-ASENT"));

    private static final SubLList $list42 = list(makeSymbol("GENLS-MT"), makeSymbol("GENLS-ASENT"));





    private static final SubLSymbol $sym45$_DUMMY = makeSymbol("?DUMMY");











    private static final SubLSymbol AT_MIN_COLS_MEMOIZED = makeSymbol("AT-MIN-COLS-MEMOIZED");

    private static final SubLSymbol $sym55$CYC_QUERY_ = makeSymbol("CYC-QUERY?");

    private static final SubLSymbol GATHER_AT_DATA_ASSERTION = makeSymbol("GATHER-AT-DATA-ASSERTION");

    private static final SubLSymbol ARGN_ISA = makeSymbol("ARGN-ISA");

    private static final SubLSymbol ARGN_QUOTED_ISA = makeSymbol("ARGN-QUOTED-ISA");

    private static final SubLSymbol ARGN_GENL = makeSymbol("ARGN-GENL");

    private static final SubLSymbol INTER_ARG_ISA_INT = makeSymbol("INTER-ARG-ISA-INT");

    private static final SubLSymbol INTER_ARG_GENL_INT = makeSymbol("INTER-ARG-GENL-INT");

    private static final SubLSymbol INTER_ARG_ISA_FROM_TYPE_INT = makeSymbol("INTER-ARG-ISA-FROM-TYPE-INT");

    private static final SubLSymbol INTER_ARG_GENL_FROM_TYPE_INT = makeSymbol("INTER-ARG-GENL-FROM-TYPE-INT");

    private static final SubLSymbol AT_ARGN_INT_CACHED = makeSymbol("AT-ARGN-INT-CACHED");

    private static final SubLSymbol $at_argn_int_cached_caching_state$ = makeSymbol("*AT-ARGN-INT-CACHED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_AT_ARGN_INT_CACHED = makeSymbol("CLEAR-AT-ARGN-INT-CACHED");

    private static final SubLString $str67$got_an_unexpected_function__s_wit = makeString("got an unexpected function ~s with arity ~s~%");

    private static final SubLList $list71 = list(makeSymbol("IND-COL"), makeSymbol("DEP-COL"), makeSymbol("ASSERTION"));

    private static final SubLString $str72$__at_var__a_test__arg__s__s__cons = makeString("~%at var ~a test: arg ~s ~s; constraint ~s");

    private static final SubLSymbol $NEGLITS_SUBSUME_POSLITS = makeKeyword("NEGLITS-SUBSUME-POSLITS");

    private static final SubLSymbol $DISJOINT_ARG_QUOTED_ISA = makeKeyword("DISJOINT-ARG-QUOTED-ISA");

    private static final SubLSymbol $DISJOINT_ARG_GENL = makeKeyword("DISJOINT-ARG-GENL");



    // Definitions
    /**
     *
     *
     * @return boolean; t iff the constraints applicable to variables referenced in TERM are ok
     */
    @LispMethod(comment = "@return boolean; t iff the constraints applicable to variables referenced in TERM are ok")
    public static final SubLObject term_var_types_ok_intP_alt(SubLObject v_term, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.formula_var_types_ok_intP(make_unary_formula($sym0$__PRED_MUFFET_212, v_term), mt);
    }

    // Definitions
    /**
     *
     *
     * @return boolean; t iff the constraints applicable to variables referenced in TERM are ok
     */
    @LispMethod(comment = "@return boolean; t iff the constraints applicable to variables referenced in TERM are ok")
    public static SubLObject term_var_types_ok_intP(final SubLObject v_term, final SubLObject mt) {
        return formula_var_types_ok_intP(make_unary_formula($sym0$__PRED_MUFFET_212, v_term), mt);
    }

    public static final SubLObject formula_var_types_ok_intP_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs_int(formula, mt, T, T);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((NIL != cnfs) && (NIL != com.cyc.cycjava.cycl.at_var_types.independent_cnfs_variables_arg_constraints_okP(cnfs, new_mt, $sym1$EL_VAR_)));
            }
        }
    }

    public static SubLObject formula_var_types_ok_intP(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = at_var_type_cnfs_int(formula, mt, T, T);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != cnfs) && (NIL != independent_cnfs_variables_arg_constraints_okP(cnfs, new_mt, $sym1$EL_VAR_)));
    }

    public static final SubLObject inter_formula_var_types_okP_alt(SubLObject formula, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.inter_formula_var_types_ok_intP(formula, mt, NIL, NIL);
    }

    public static SubLObject inter_formula_var_types_okP(final SubLObject formula, final SubLObject mt) {
        return inter_formula_var_types_ok_intP(formula, mt, NIL, NIL);
    }

    /**
     * A sibling for @xref formula-var-types-ok? which assumes that if FORMULA is a conjunction,
     * that it should intersect the arg constraints rather than assume they are independent.
     */
    @LispMethod(comment = "A sibling for @xref formula-var-types-ok? which assumes that if FORMULA is a conjunction,\r\nthat it should intersect the arg constraints rather than assume they are independent.\nA sibling for @xref formula-var-types-ok? which assumes that if FORMULA is a conjunction,\nthat it should intersect the arg constraints rather than assume they are independent.")
    public static final SubLObject inter_formula_var_types_ok_intP_alt(SubLObject formula, SubLObject mt, SubLObject assume_syntax_okP, SubLObject catch_czer_errorsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs_int(formula, mt, assume_syntax_okP, catch_czer_errorsP);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((NIL != cnfs) && (NIL != com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints_okP(cnfs, new_mt, $sym1$EL_VAR_)));
            }
        }
    }

    /**
     * A sibling for @xref formula-var-types-ok? which assumes that if FORMULA is a conjunction,
     * that it should intersect the arg constraints rather than assume they are independent.
     */
    @LispMethod(comment = "A sibling for @xref formula-var-types-ok? which assumes that if FORMULA is a conjunction,\r\nthat it should intersect the arg constraints rather than assume they are independent.\nA sibling for @xref formula-var-types-ok? which assumes that if FORMULA is a conjunction,\nthat it should intersect the arg constraints rather than assume they are independent.")
    public static SubLObject inter_formula_var_types_ok_intP(final SubLObject formula, final SubLObject mt, final SubLObject assume_syntax_okP, final SubLObject catch_czer_errorsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = at_var_type_cnfs_int(formula, mt, assume_syntax_okP, catch_czer_errorsP);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != cnfs) && (NIL != inter_cnfs_variables_arg_constraints_okP(cnfs, new_mt, $sym1$EL_VAR_)));
    }

    public static final SubLObject independent_cnfs_variables_arg_constraints_okP_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject formula = wff_vars.unexpanded_formula();
                if (((NIL != wff_vars.$validating_expansionP$.getDynamicValue(thread)) && (NIL != genls_litP(formula))) && (NIL != sdc.sdcP(cycl_utilities.formula_arg1(formula, UNPROVIDED), cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED))) {
                    {
                        SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
                        try {
                            sdc.$ignoring_sdcP$.bind(T, thread);
                            ans = com.cyc.cycjava.cycl.at_var_types.independent_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
                        } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    ans = com.cyc.cycjava.cycl.at_var_types.independent_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
                }
                return ans;
            }
        }
    }

    public static SubLObject independent_cnfs_variables_arg_constraints_okP(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject formula = wff_vars.unexpanded_formula();
        if (((NIL != wff_vars.$validating_expansionP$.getDynamicValue(thread)) && (NIL != genls_litP(formula))) && (NIL != sdc.sdcP(cycl_utilities.formula_arg1(formula, UNPROVIDED), cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED))) {
            final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                sdc.$ignoring_sdcP$.bind(T, thread);
                ans = independent_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
            } finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
            }
        } else {
            ans = independent_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
        }
        return ans;
    }

    public static final SubLObject independent_cnfs_variables_arg_constraints_okP_int_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject okP = T;
            SubLObject skolem_cnfs = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = cnfs;
                    SubLObject cnf = NIL;
                    for (cnf = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
                        if (NIL != list_utilities.tree_find_if($sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED)) {
                            skolem_cnfs = cons(cnf, skolem_cnfs);
                        } else {
                            okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.cnf_variables_arg_constraints_okP(cnf, mt, varP)) && (NIL != okP));
                            doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                        }
                    }
                }
            }
            if (NIL == doneP) {
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = list_utilities.tree_gather(skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL);
                        SubLObject skolem = NIL;
                        for (skolem = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , skolem = csome_list_var.first()) {
                            {
                                SubLObject cnfs_of_skolem = NIL;
                                SubLObject cdolist_list_var = skolem_cnfs;
                                SubLObject cnf = NIL;
                                for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                                    if (NIL != list_utilities.tree_find(skolem, cnf, EQUAL, UNPROVIDED)) {
                                        cnfs_of_skolem = cons(cnf, cnfs_of_skolem);
                                    }
                                }
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var_1 = clause_utilities.group_clauses_having_common_neg_lits(cnfs_of_skolem, UNPROVIDED);
                                        SubLObject dependent_cnfs_of_skolem = NIL;
                                        for (dependent_cnfs_of_skolem = csome_list_var_1.first(); !((NIL != doneP) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , dependent_cnfs_of_skolem = csome_list_var_1.first()) {
                                            okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints_okP(dependent_cnfs_of_skolem, mt, varP)) && (NIL != okP));
                                            doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return okP;
        }
    }

    public static SubLObject independent_cnfs_variables_arg_constraints_okP_int(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject okP = T;
        SubLObject skolem_cnfs = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = cnfs;
            SubLObject cnf = NIL;
            cnf = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != list_utilities.tree_find_if($sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED)) {
                    skolem_cnfs = cons(cnf, skolem_cnfs);
                } else {
                    okP = makeBoolean((NIL != cnf_variables_arg_constraints_okP(cnf, mt, varP)) && (NIL != okP));
                    doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                }
                csome_list_var = csome_list_var.rest();
                cnf = csome_list_var.first();
            } 
        }
        if ((NIL == doneP) && (NIL == doneP)) {
            SubLObject csome_list_var = list_utilities.tree_gather(skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL);
            SubLObject skolem = NIL;
            skolem = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                SubLObject cnfs_of_skolem = NIL;
                SubLObject cdolist_list_var = skolem_cnfs;
                SubLObject cnf2 = NIL;
                cnf2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != list_utilities.tree_find(skolem, cnf2, EQUAL, UNPROVIDED)) {
                        cnfs_of_skolem = cons(cnf2, cnfs_of_skolem);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cnf2 = cdolist_list_var.first();
                } 
                if (NIL == doneP) {
                    SubLObject csome_list_var_$1 = clause_utilities.group_clauses_having_common_neg_lits(cnfs_of_skolem, UNPROVIDED);
                    SubLObject dependent_cnfs_of_skolem = NIL;
                    dependent_cnfs_of_skolem = csome_list_var_$1.first();
                    while ((NIL == doneP) && (NIL != csome_list_var_$1)) {
                        okP = makeBoolean((NIL != cnfs_variables_arg_constraints_okP(dependent_cnfs_of_skolem, mt, varP)) && (NIL != okP));
                        doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        dependent_cnfs_of_skolem = csome_list_var_$1.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                skolem = csome_list_var.first();
            } 
        }
        return okP;
    }

    /**
     *
     *
     * @unknown may return NIL if there was a czer problem
     */
    @LispMethod(comment = "@unknown may return NIL if there was a czer problem")
    public static final SubLObject at_var_type_dnfs_alt(SubLObject sentence, SubLObject mt, SubLObject catch_czer_errorsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dnfs = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
                        czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                        {
                            SubLObject error = NIL;
                            if (NIL != catch_czer_errorsP) {
                                try {
                                    {
                                        SubLObject _prev_bind_0_2 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                                        try {
                                            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                                            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject dnfs_4 = com.cyc.cycjava.cycl.at_var_types.at_var_type_dnfs_int_cached(sentence, mt);
                                                SubLObject mt_5 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                dnfs = dnfs_4;
                                                mt = mt_5;
                                            }
                                        } finally {
                                            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_3, thread);
                                            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_CONJUNCTION);
                                }
                            } else {
                                {
                                    SubLObject _prev_bind_0_6 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                                    SubLObject _prev_bind_1_7 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                                    try {
                                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject dnfs_8 = com.cyc.cycjava.cycl.at_var_types.at_var_type_dnfs_int_cached(sentence, mt);
                                            SubLObject mt_9 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            dnfs = dnfs_8;
                                            mt = mt_9;
                                        }
                                    } finally {
                                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_7, thread);
                                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                            if (NIL != error) {
                                at_utilities.note_at_violation(list($BAD_EXPONENTIAL_CONJUNCTION, sentence));
                                dnfs = NIL;
                            }
                        }
                    } finally {
                        czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_5, thread);
                        czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_4, thread);
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_3, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(dnfs, mt);
            }
        }
    }

    /**
     *
     *
     * @unknown may return NIL if there was a czer problem
     */
    @LispMethod(comment = "@unknown may return NIL if there was a czer problem")
    public static SubLObject at_var_type_dnfs(final SubLObject sentence, SubLObject mt, final SubLObject catch_czer_errorsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dnfs = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            SubLObject error = NIL;
            if (NIL != catch_czer_errorsP) {
                try {
                    thread.throwStack.push($BAD_EXPONENTIAL_CONJUNCTION);
                    final SubLObject _prev_bind_0_$2 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject dnfs_$4 = at_var_type_dnfs_int_cached(sentence, mt);
                        final SubLObject mt_$5 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dnfs = dnfs_$4;
                        mt = mt_$5;
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_$3, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_$2, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_CONJUNCTION);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                final SubLObject _prev_bind_0_$3 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                try {
                    czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                    czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject dnfs_$5 = at_var_type_dnfs_int_cached(sentence, mt);
                    final SubLObject mt_$6 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    dnfs = dnfs_$5;
                    mt = mt_$6;
                } finally {
                    czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_$4, thread);
                    czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_$3, thread);
                }
            }
            if (NIL != error) {
                at_utilities.note_at_violation(list($BAD_EXPONENTIAL_CONJUNCTION, sentence));
                dnfs = NIL;
            }
        } finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_6, thread);
            czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_5, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_4, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return values(dnfs, mt);
    }

    public static final SubLObject clear_at_var_type_dnfs_int_cached_alt() {
        {
            SubLObject cs = $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_at_var_type_dnfs_int_cached() {
        final SubLObject cs = $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_at_var_type_dnfs_int_cached_alt(SubLObject sentence, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($at_var_type_dnfs_int_cached_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_at_var_type_dnfs_int_cached(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($at_var_type_dnfs_int_cached_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject at_var_type_dnfs_int_cached_internal_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != wff.el_wff_syntaxP(sentence, UNPROVIDED)) {
                thread.resetMultipleValues();
                {
                    SubLObject dnfs = clausifier.dnf_clausal_form(sentence, mt);
                    SubLObject new_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(transform_list_utilities.transform(dnfs, $sym3$UNREIFIED_SKOLEM_TERM_, SKOLEM_FUNCTION_VAR, UNPROVIDED), new_mt);
                }
            }
            return NIL;
        }
    }

    public static SubLObject at_var_type_dnfs_int_cached_internal(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != wff.el_wff_syntaxP(sentence, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject dnfs = clausifier.dnf_clausal_form(sentence, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(transform_list_utilities.transform(dnfs, $sym3$UNREIFIED_SKOLEM_TERM_, SKOLEM_FUNCTION_VAR, UNPROVIDED), new_mt);
        }
        return NIL;
    }

    public static final SubLObject at_var_type_dnfs_int_cached_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject caching_state = $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(AT_VAR_TYPE_DNFS_INT_CACHED, $at_var_type_dnfs_int_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$1024);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (sentence.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.at_var_types.at_var_type_dnfs_int_cached_internal(sentence, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject at_var_type_dnfs_int_cached(final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(AT_VAR_TYPE_DNFS_INT_CACHED, $at_var_type_dnfs_int_cached_caching_state$, $int$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(at_var_type_dnfs_int_cached_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject at_var_type_cnfs_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs_int(sentence, mt, NIL, NIL);
    }

    public static SubLObject at_var_type_cnfs(final SubLObject sentence, final SubLObject mt) {
        return at_var_type_cnfs_int(sentence, mt, NIL, NIL);
    }

    /**
     *
     *
     * @unknown may return NIL if there was a czer problem
     */
    @LispMethod(comment = "@unknown may return NIL if there was a czer problem")
    public static final SubLObject at_var_type_cnfs_int_alt(SubLObject sentence, SubLObject mt, SubLObject assume_syntax_okP, SubLObject catch_czer_errorsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnfs = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                    try {
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
                        czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                        if ((NIL != assume_syntax_okP) || (NIL != wff.el_wff_syntaxP(sentence, UNPROVIDED))) {
                            {
                                SubLObject _prev_bind_0_10 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_11 = clausifier.$use_cnf_cacheP$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                                    clausifier.$use_cnf_cacheP$.bind(NIL, thread);
                                    {
                                        SubLObject error = NIL;
                                        if (NIL != catch_czer_errorsP) {
                                            try {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject cnfs_12 = com.cyc.cycjava.cycl.at_var_types.at_var_types_cnfs_clausify(sentence);
                                                    SubLObject mt_13 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    cnfs = cnfs_12;
                                                    mt = mt_13;
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_DISJUNCTION);
                                            }
                                        } else {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject cnfs_14 = com.cyc.cycjava.cycl.at_var_types.at_var_types_cnfs_clausify(sentence);
                                                SubLObject mt_15 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                cnfs = cnfs_14;
                                                mt = mt_15;
                                            }
                                        }
                                        if (NIL != error) {
                                            at_utilities.note_at_violation(list($BAD_EXPONENTIAL_DISJUNCTION, sentence));
                                            cnfs = NIL;
                                        }
                                    }
                                } finally {
                                    clausifier.$use_cnf_cacheP$.rebind(_prev_bind_1_11, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                        }
                    } finally {
                        czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_3, thread);
                        czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_2, thread);
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_1, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
                    }
                }
                cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_repackage_cnfs(cnfs);
                return values(cnfs, mt);
            }
        }
    }

    /**
     *
     *
     * @unknown may return NIL if there was a czer problem
     */
    @LispMethod(comment = "@unknown may return NIL if there was a czer problem")
    public static SubLObject at_var_type_cnfs_int(final SubLObject sentence, SubLObject mt, final SubLObject assume_syntax_okP, final SubLObject catch_czer_errorsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnfs = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        try {
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            if ((NIL != assume_syntax_okP) || (NIL != wff.el_wff_syntaxP(sentence, UNPROVIDED))) {
                final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$11 = clausifier.$use_cnf_cacheP$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                    clausifier.$use_cnf_cacheP$.bind(NIL, thread);
                    SubLObject error = NIL;
                    if (NIL != catch_czer_errorsP) {
                        try {
                            thread.throwStack.push($BAD_EXPONENTIAL_DISJUNCTION);
                            thread.resetMultipleValues();
                            final SubLObject cnfs_$12 = at_var_types_cnfs_clausify(sentence);
                            final SubLObject mt_$13 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            cnfs = cnfs_$12;
                            mt = mt_$13;
                        } catch (final Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_DISJUNCTION);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject cnfs_$13 = at_var_types_cnfs_clausify(sentence);
                        final SubLObject mt_$14 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cnfs = cnfs_$13;
                        mt = mt_$14;
                    }
                    if (NIL != error) {
                        at_utilities.note_at_violation(list($BAD_EXPONENTIAL_DISJUNCTION, sentence));
                        cnfs = NIL;
                    }
                } finally {
                    clausifier.$use_cnf_cacheP$.rebind(_prev_bind_1_$11, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_4, thread);
            czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_3, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
        }
        cnfs = at_var_type_repackage_cnfs(cnfs);
        return values(cnfs, mt);
    }

    public static final SubLObject at_var_types_cnfs_clausify_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnfs = NIL;
                SubLObject mt = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject cnfs_16 = clausifier.cnf_clausal_form(simplifier.simplify_cycl_sentence(simplifier.simplify_sequence_variables(com.cyc.cycjava.cycl.at_var_types.at_transform_true_sentence_negation_preds(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread))), UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread));
                            SubLObject mt_17 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            cnfs = cnfs_16;
                            mt = mt_17;
                        }
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(cnfs, mt);
            }
        }
    }

    public static SubLObject at_var_types_cnfs_clausify(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = at_var_types_cnfs_clausify_int(sentence);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(copy_tree(cnfs), mt);
    }

    public static SubLObject at_var_types_cnfs_clausify_int_internal(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnfs = NIL;
        SubLObject mt = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject cnfs_$16 = clausifier.cnf_clausal_form(simplifier.simplify_cycl_sentence(simplifier.simplify_sequence_variables(at_transform_true_sentence_negation_preds(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread))), UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread));
            final SubLObject mt_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cnfs = cnfs_$16;
            mt = mt_$17;
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return values(cnfs, mt);
    }

    public static SubLObject at_var_types_cnfs_clausify_int(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return at_var_types_cnfs_clausify_int_internal(sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, AT_VAR_TYPES_CNFS_CLAUSIFY_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), AT_VAR_TYPES_CNFS_CLAUSIFY_INT, ONE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, AT_VAR_TYPES_CNFS_CLAUSIFY_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sentence, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(at_var_types_cnfs_clausify_int_internal(sentence)));
            memoization_state.caching_state_put(caching_state, sentence, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is opaque by the
    default criteria, or the arg1 of #$pragmaticRequirement.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is opaque by the\r\ndefault criteria, or the arg1 of #$pragmaticRequirement.")
    public static final SubLObject opaque_arg_wrt_pragmatic_requirementP_alt(SubLObject formula, SubLObject argnum) {
        return makeBoolean((NIL != cycl_utilities.default_opaque_argP(formula, argnum)) || (ONE_INTEGER.numE(argnum) && ($$pragmaticRequirement == cycl_utilities.formula_operator(formula))));
    }

    /**
     *
     *
     * @return boolean; t iff arg number ARGNUM of FORMULA is opaque by the
    default criteria, or the arg1 of #$pragmaticRequirement.
     */
    @LispMethod(comment = "@return boolean; t iff arg number ARGNUM of FORMULA is opaque by the\r\ndefault criteria, or the arg1 of #$pragmaticRequirement.")
    public static SubLObject opaque_arg_wrt_pragmatic_requirementP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != cycl_utilities.default_opaque_argP(formula, argnum)) || (ONE_INTEGER.numE(argnum) && (NIL != el_formula_with_operator_p(formula, $$pragmaticRequirement))));
    }

    public static final SubLObject at_transform_true_sentence_negation_preds_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $at_true_sentence_negation_preds$.currentBinding(thread);
                    try {
                        $at_true_sentence_negation_preds$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        {
                            SubLObject cdolist_list_var = negation_predicate.all_negation_predicates($$trueSentence, mt, NIL);
                            SubLObject negation_pred = NIL;
                            for (negation_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , negation_pred = cdolist_list_var.first()) {
                                set.set_add(negation_pred, $at_true_sentence_negation_preds$.getDynamicValue(thread));
                            }
                            {
                                SubLObject _prev_bind_0_18 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                                try {
                                    cycl_utilities.$opaque_arg_function$.bind($sym14$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_, thread);
                                    result = cycl_utilities.expression_transform(sentence, $sym15$AT_NEGATED_, AT_NEGATE, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0_18, thread);
                                }
                            }
                        }
                    } finally {
                        $at_true_sentence_negation_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject at_transform_true_sentence_negation_preds(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $at_true_sentence_negation_preds$.currentBinding(thread);
        try {
            $at_true_sentence_negation_preds$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            SubLObject cdolist_list_var = negation_predicate.all_negation_predicates_memoized($$trueSentence, mt, UNPROVIDED);
            SubLObject negation_pred = NIL;
            negation_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(negation_pred, $at_true_sentence_negation_preds$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                negation_pred = cdolist_list_var.first();
            } 
            final SubLObject _prev_bind_0_$18 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                cycl_utilities.$opaque_arg_function$.bind($sym15$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_, thread);
                result = cycl_utilities.expression_transform(sentence, $sym16$AT_NEGATED_, AT_NEGATE, UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0_$18, thread);
            }
        } finally {
            $at_true_sentence_negation_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject at_negatedP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject operator = cycl_utilities.formula_arg0(formula);
                if (NIL != forts.fort_p(operator)) {
                    return set.set_memberP(operator, $at_true_sentence_negation_preds$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
    }

    public static SubLObject at_negatedP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(formula);
        if (NIL != forts.fort_p(operator)) {
            return set.set_memberP(operator, $at_true_sentence_negation_preds$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject at_negate_alt(SubLObject formula) {
        return simplifier.el_negate(cycl_utilities.formula_arg1(formula, UNPROVIDED));
    }

    public static SubLObject at_negate(final SubLObject formula) {
        return simplifier.el_negate(implicitify_explicit_existential_quantifiers(cycl_utilities.formula_arg1(formula, UNPROVIDED)));
    }

    public static final SubLObject at_var_type_repackage_cnfs_alt(SubLObject cnfs) {
        {
            SubLObject result = NIL;
            if (cnfs.isCons()) {
                {
                    SubLObject cdolist_list_var = cnfs;
                    SubLObject cnf = NIL;
                    for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                        {
                            SubLObject neg_lits = clauses.neg_lits(cnf);
                            SubLObject pos_lits = clauses.pos_lits(cnf);
                            if (NIL != list_utilities.singletonP(pos_lits)) {
                                {
                                    SubLObject item_var = cnf;
                                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            } else {
                                if (NIL != pos_lits) {
                                    {
                                        SubLObject cdolist_list_var_19 = pos_lits;
                                        SubLObject pos_lit = NIL;
                                        for (pos_lit = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , pos_lit = cdolist_list_var_19.first()) {
                                            {
                                                SubLObject item_var = clauses.make_cnf(neg_lits, list(transform_list_utilities.transform(pos_lit, $sym3$UNREIFIED_SKOLEM_TERM_, SKOLEM_FUNCTION_VAR, UNPROVIDED)));
                                                if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                                    result = cons(item_var, result);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject item_var = clauses.make_cnf(neg_lits, NIL);
                                        if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                            result = cons(item_var, result);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject at_var_type_repackage_cnfs(final SubLObject cnfs) {
        SubLObject result = NIL;
        if (cnfs.isCons()) {
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            cnf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject neg_lits = clauses.neg_lits(cnf);
                final SubLObject pos_lits = clauses.pos_lits(cnf);
                if (NIL != list_utilities.singletonP(pos_lits)) {
                    final SubLObject item_var = cnf;
                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                } else
                    if (NIL != pos_lits) {
                        SubLObject cdolist_list_var_$19 = pos_lits;
                        SubLObject pos_lit = NIL;
                        pos_lit = cdolist_list_var_$19.first();
                        while (NIL != cdolist_list_var_$19) {
                            final SubLObject item_var2 = clauses.make_cnf(neg_lits, list(transform_list_utilities.transform(pos_lit, $sym3$UNREIFIED_SKOLEM_TERM_, SKOLEM_FUNCTION_VAR, UNPROVIDED)));
                            if (NIL == member(item_var2, result, EQUAL, symbol_function(IDENTITY))) {
                                result = cons(item_var2, result);
                            }
                            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                            pos_lit = cdolist_list_var_$19.first();
                        } 
                    } else {
                        final SubLObject item_var = clauses.make_cnf(neg_lits, NIL);
                        if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                    }

                cdolist_list_var = cdolist_list_var.rest();
                cnf = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject cnf_var_types_okP_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject okP = T;
            SubLObject doneP = NIL;
            if (NIL != pos_lits) {
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = pos_lits;
                        SubLObject pos_lit = NIL;
                        for (pos_lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos_lit = csome_list_var.first()) {
                            okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(pos_lit))), mt, varP)) && (NIL != okP));
                            doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                        }
                    }
                }
            } else {
                okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(NIL))), mt, varP)) && (NIL != okP));
            }
            return okP;
        }
    }

    public static SubLObject cnf_var_types_okP(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject okP = T;
        SubLObject doneP = NIL;
        if (NIL != pos_lits) {
            if (NIL == doneP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject pos_lit = NIL;
                pos_lit = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    okP = makeBoolean((NIL != cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(pos_lit))), mt, varP)) && (NIL != okP));
                    doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                    csome_list_var = csome_list_var.rest();
                    pos_lit = csome_list_var.first();
                } 
            }
        } else {
            okP = makeBoolean((NIL != cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(NIL))), mt, varP)) && (NIL != okP));
        }
        return okP;
    }

    public static final SubLObject inter_cnf_var_types_okP_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject okP = T;
            SubLObject doneP = NIL;
            if (NIL != pos_lits) {
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = pos_lits;
                        SubLObject pos_lit = NIL;
                        for (pos_lit = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos_lit = csome_list_var.first()) {
                            okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(pos_lit))), mt, varP)) && (NIL != okP));
                            doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                        }
                    }
                }
            } else {
                okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(NIL))), mt, varP)) && (NIL != okP));
            }
            return okP;
        }
    }

    public static SubLObject inter_cnf_var_types_okP(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject okP = T;
        SubLObject doneP = NIL;
        if (NIL != pos_lits) {
            if (NIL == doneP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject pos_lit = NIL;
                pos_lit = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    okP = makeBoolean((NIL != inter_cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(pos_lit))), mt, varP)) && (NIL != okP));
                    doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                    csome_list_var = csome_list_var.rest();
                    pos_lit = csome_list_var.first();
                } 
            }
        } else {
            okP = makeBoolean((NIL != inter_cnfs_variables_arg_constraints_okP(list(clauses.make_cnf(neg_lits, list(NIL))), mt, varP)) && (NIL != okP));
        }
        return okP;
    }

    public static final SubLObject query_var_types_okP_alt(SubLObject query, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = T;
                SubLObject dnfs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        {
                            SubLObject error = NIL;
                            if (NIL != wff.el_wff_syntaxP(query, UNPROVIDED)) {
                                try {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject dnfs_20 = clausifier.dnf_clausal_form(query, mt);
                                        SubLObject mt_21 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        dnfs = dnfs_20;
                                        mt = mt_21;
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_CONJUNCTION);
                                }
                                if (NIL != error) {
                                    okP = NIL;
                                    at_utilities.note_at_violation(list($BAD_EXPONENTIAL_CONJUNCTION, query));
                                }
                            }
                        }
                    } finally {
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == wff_vars.$wff_violations$.getDynamicValue(thread)) {
                    if (dnfs.isCons()) {
                        {
                            SubLObject cdolist_list_var = dnfs;
                            SubLObject dnf = NIL;
                            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                                okP = makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.dnfs_variables_arg_constraints_okP(list(dnf), mt, varP)) && (NIL != okP));
                            }
                        }
                    }
                    return okP;
                }
            }
            return NIL;
        }
    }

    public static SubLObject query_var_types_okP(final SubLObject query, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        SubLObject dnfs = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            SubLObject error = NIL;
            if (NIL != wff.el_wff_syntaxP(query, UNPROVIDED)) {
                try {
                    thread.throwStack.push($BAD_EXPONENTIAL_CONJUNCTION);
                    thread.resetMultipleValues();
                    final SubLObject dnfs_$20 = clausifier.dnf_clausal_form(query, mt);
                    final SubLObject mt_$21 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    dnfs = dnfs_$20;
                    mt = mt_$21;
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_CONJUNCTION);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    okP = NIL;
                    at_utilities.note_at_violation(list($BAD_EXPONENTIAL_CONJUNCTION, query));
                }
            }
        } finally {
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == wff_vars.$wff_violations$.getDynamicValue(thread)) {
            if (dnfs.isCons()) {
                SubLObject cdolist_list_var = dnfs;
                SubLObject dnf = NIL;
                dnf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    okP = makeBoolean((NIL != dnfs_variables_arg_constraints_okP(list(dnf), mt, varP)) && (NIL != okP));
                    cdolist_list_var = cdolist_list_var.rest();
                    dnf = cdolist_list_var.first();
                } 
            }
            return okP;
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within TERM.
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within TERM.")
    public static final SubLObject term_variables_arg_constraints_alt(SubLObject v_term, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return com.cyc.cycjava.cycl.at_var_types.formula_variables_arg_constraints(make_unary_formula($$termChosen, v_term), mt, varP);
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within TERM.
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within TERM.")
    public static SubLObject term_variables_arg_constraints(final SubLObject v_term, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return formula_variables_arg_constraints(make_unary_formula($$termChosen, v_term), mt, varP);
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within FORMULA. @see inter-formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within FORMULA. @see inter-formula-variables-arg-constraints")
    public static final SubLObject formula_variables_arg_constraints_alt(SubLObject formula, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != wff.check_wff_expansionP(formula)) {
                thread.resetMultipleValues();
                {
                    SubLObject expansion = com.cyc.cycjava.cycl.at_var_types.at_el_expand_all(formula, mt);
                    SubLObject mt_22 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == expansion) || formula.equal(expansion)) {
                        return com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints(com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(formula, mt_22), mt_22, varP);
                    } else {
                        {
                            SubLObject result = NIL;
                            {
                                SubLObject _prev_bind_0 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                SubLObject _prev_bind_1 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                SubLObject _prev_bind_2 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                try {
                                    wff_vars.$unexpanded_formula$.bind(formula, thread);
                                    wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                    wff_vars.$validating_expansionP$.bind(T, thread);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(make_binary_formula($$and, formula, expansion), mt_22);
                                        SubLObject new_mt = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        result = com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints(cnfs, new_mt, UNPROVIDED);
                                    }
                                } finally {
                                    wff_vars.$validating_expansionP$.rebind(_prev_bind_2, thread);
                                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_1, thread);
                                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return result;
                        }
                    }
                }
            } else {
                return com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints(com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(formula, mt), mt, varP);
            }
        }
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within FORMULA. @see inter-formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within FORMULA. @see inter-formula-variables-arg-constraints")
    public static SubLObject formula_variables_arg_constraints(final SubLObject formula, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == wff.check_wff_expansionP(formula)) {
            return cnfs_variables_arg_constraints(at_var_type_cnfs(formula, mt), mt, varP);
        }
        thread.resetMultipleValues();
        final SubLObject expansion = at_el_expand_all(formula, mt);
        final SubLObject mt_$22 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == expansion) || formula.equal(expansion)) {
            return cnfs_variables_arg_constraints(at_var_type_cnfs(formula, mt_$22), mt_$22, varP);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$unexpanded_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$validating_expansionP$.currentBinding(thread);
        try {
            wff_vars.$unexpanded_formula$.bind(formula, thread);
            wff_vars.$validate_expansionsP$.bind(NIL, thread);
            wff_vars.$validating_expansionP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject cnfs = at_var_type_cnfs(make_binary_formula($$and, formula, expansion), mt_$22);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = inter_cnfs_variables_arg_constraints(cnfs, new_mt, UNPROVIDED);
        } finally {
            wff_vars.$validating_expansionP$.rebind(_prev_bind_3, thread);
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_2, thread);
            wff_vars.$unexpanded_formula$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject at_el_expand_all_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expansion = NIL;
                SubLObject new_mt = NIL;
                SubLObject error = NIL;
                try {
                    try {
                        thread.resetMultipleValues();
                        {
                            SubLObject expansion_23 = verbosifier.el_expand_all(formula, mt);
                            SubLObject new_mt_24 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            expansion = expansion_23;
                            new_mt = new_mt_24;
                        }
                    } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $INVALID_EXPANSION);
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $RECURSION_LIMIT_EXCEEDED);
                }
                if (NIL != error) {
                    return NIL;
                }
                return values(expansion, new_mt);
            }
        }
    }

    public static SubLObject at_el_expand_all(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expansion = NIL;
        SubLObject new_mt = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($RECURSION_LIMIT_EXCEEDED);
            try {
                thread.throwStack.push($INVALID_EXPANSION);
                thread.resetMultipleValues();
                final SubLObject expansion_$23 = verbosifier.el_expand_all(formula, mt);
                final SubLObject new_mt_$24 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                expansion = expansion_$23;
                new_mt = new_mt_$24;
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $INVALID_EXPANSION);
            } finally {
                thread.throwStack.pop();
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $RECURSION_LIMIT_EXCEEDED);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            return NIL;
        }
        return values(expansion, new_mt);
    }

    /**
     *
     *
     * @return list of constraints where the list is a pair. The firt item is the list of all the isa constraints and the second item is the list of all genls constraints. cur-constraints = the current list of constraints so far for which the new el constraint should be parsed and added to. new-constraint is either (#$genls ?x #$<some genls constraint>) or (#$isa ?x #$<some isa constraint>). All other values for new-constraint are ignored.
     */
    @LispMethod(comment = "@return list of constraints where the list is a pair. The firt item is the list of all the isa constraints and the second item is the list of all genls constraints. cur-constraints = the current list of constraints so far for which the new el constraint should be parsed and added to. new-constraint is either (#$genls ?x #$<some genls constraint>) or (#$isa ?x #$<some isa constraint>). All other values for new-constraint are ignored.")
    public static final SubLObject parse_constraint_alt(SubLObject cur_constraints, SubLObject new_constraint) {
        {
            SubLObject isa_constraints = NIL;
            SubLObject genls_constraints = NIL;
            SubLObject quoted_isa_constraints = NIL;
            if (NIL != cur_constraints) {
                {
                    SubLObject datum_evaluated_var = cur_constraints;
                    isa_constraints = datum_evaluated_var.first();
                    genls_constraints = cadr(datum_evaluated_var);
                    quoted_isa_constraints = cddr(datum_evaluated_var).first();
                }
            }
            {
                SubLObject pcase_var = new_constraint.first();
                if (pcase_var.eql($$isa)) {
                    return list(cardinality_estimates.sort_by_generality_estimate(union(list(cycl_utilities.formula_arg2(new_constraint, UNPROVIDED)), isa_constraints, UNPROVIDED, UNPROVIDED), UNPROVIDED), genls_constraints, quoted_isa_constraints);
                } else {
                    if (pcase_var.eql($$genls)) {
                        return list(isa_constraints, cardinality_estimates.sort_by_generality_estimate(union(list(third(new_constraint)), genls_constraints, UNPROVIDED, UNPROVIDED), UNPROVIDED), quoted_isa_constraints);
                    } else {
                        if (pcase_var.eql($$quotedIsa)) {
                            return list(isa_constraints, genls_constraints, cardinality_estimates.sort_by_generality_estimate(union(list(cycl_utilities.formula_arg2(new_constraint, UNPROVIDED)), quoted_isa_constraints, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                        }
                    }
                }
            }
        }
        return cur_constraints;
    }

    /**
     *
     *
     * @return list of constraints where the list is a pair. The firt item is the list of all the isa constraints and the second item is the list of all genls constraints. cur-constraints = the current list of constraints so far for which the new el constraint should be parsed and added to. new-constraint is either (#$genls ?x #$<some genls constraint>) or (#$isa ?x #$<some isa constraint>). All other values for new-constraint are ignored.
     */
    @LispMethod(comment = "@return list of constraints where the list is a pair. The firt item is the list of all the isa constraints and the second item is the list of all genls constraints. cur-constraints = the current list of constraints so far for which the new el constraint should be parsed and added to. new-constraint is either (#$genls ?x #$<some genls constraint>) or (#$isa ?x #$<some isa constraint>). All other values for new-constraint are ignored.")
    public static SubLObject parse_constraint(final SubLObject cur_constraints, final SubLObject new_constraint) {
        SubLObject isa_constraints = NIL;
        SubLObject genls_constraints = NIL;
        SubLObject quoted_isa_constraints = NIL;
        if (NIL != cur_constraints) {
            isa_constraints = cur_constraints.first();
            genls_constraints = cadr(cur_constraints);
            quoted_isa_constraints = cddr(cur_constraints).first();
        }
        final SubLObject pcase_var = new_constraint.first();
        if (pcase_var.eql($$isa)) {
            return list(cardinality_estimates.sort_by_generality_estimate(union(list(cycl_utilities.formula_arg2(new_constraint, UNPROVIDED)), isa_constraints, UNPROVIDED, UNPROVIDED), UNPROVIDED), genls_constraints, quoted_isa_constraints);
        }
        if (pcase_var.eql($$genls)) {
            return list(isa_constraints, cardinality_estimates.sort_by_generality_estimate(union(list(third(new_constraint)), genls_constraints, UNPROVIDED, UNPROVIDED), UNPROVIDED), quoted_isa_constraints);
        }
        if (pcase_var.eql($$quotedIsa)) {
            return list(isa_constraints, genls_constraints, cardinality_estimates.sort_by_generality_estimate(union(list(cycl_utilities.formula_arg2(new_constraint, UNPROVIDED)), quoted_isa_constraints, UNPROVIDED, UNPROVIDED), UNPROVIDED));
        }
        return cur_constraints;
    }

    /**
     *
     *
     * @return dictionary; returns a dictionary containing arg constraint information for the variables listed in the given formula. The key of the dictionary is the variable name, the value is a list where the first item is the list of required isas for that variable name, the second item is the list of required genls for that variable name, and the third item is the list of required quoted-isas for that variable name. By default only free variables are listed, if you need all the variables listed set free-variables-only? to NIL.
     */
    @LispMethod(comment = "@return dictionary; returns a dictionary containing arg constraint information for the variables listed in the given formula. The key of the dictionary is the variable name, the value is a list where the first item is the list of required isas for that variable name, the second item is the list of required genls for that variable name, and the third item is the list of required quoted-isas for that variable name. By default only free variables are listed, if you need all the variables listed set free-variables-only? to NIL.")
    public static final SubLObject formula_variables_arg_constraints_dict_alt(SubLObject formula, SubLObject mt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        {
            SubLObject free_variables = literal_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cur_variable = NIL;
            SubLObject cur_constraints = NIL;
            SubLObject all_constraints = com.cyc.cycjava.cycl.at_var_types.formula_variables_arg_constraints(formula, mt, varP);
            SubLObject cur_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            if (all_constraints.first().eql($$and)) {
                {
                    SubLObject cdolist_list_var = all_constraints;
                    SubLObject constraint = NIL;
                    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                        if (constraint.isList()) {
                            cur_variable = cycl_utilities.formula_arg1(constraint, UNPROVIDED);
                            if ((NIL == free_variables_onlyP) || ((NIL != free_variables_onlyP) && (NIL != subl_promotions.memberP(cur_variable, free_variables, EQUAL, UNPROVIDED)))) {
                                cur_constraints = dictionary.dictionary_lookup(cur_dictionary, cur_variable, UNPROVIDED);
                                cur_constraints = com.cyc.cycjava.cycl.at_var_types.parse_constraint(cur_constraints, constraint);
                                dictionary.dictionary_enter(cur_dictionary, cur_variable, cur_constraints);
                            }
                        }
                    }
                }
            } else {
                if (NIL != all_constraints) {
                    cur_variable = second(all_constraints);
                    cur_constraints = dictionary.dictionary_lookup(cur_dictionary, cur_variable, UNPROVIDED);
                    cur_constraints = com.cyc.cycjava.cycl.at_var_types.parse_constraint(cur_constraints, all_constraints);
                    dictionary.dictionary_enter(cur_dictionary, cur_variable, cur_constraints);
                }
            }
            return cur_dictionary;
        }
    }

    /**
     *
     *
     * @return dictionary; returns a dictionary containing arg constraint information for the variables listed in the given formula. The key of the dictionary is the variable name, the value is a list where the first item is the list of required isas for that variable name, the second item is the list of required genls for that variable name, and the third item is the list of required quoted-isas for that variable name. By default only free variables are listed, if you need all the variables listed set free-variables-only? to NIL.
     */
    @LispMethod(comment = "@return dictionary; returns a dictionary containing arg constraint information for the variables listed in the given formula. The key of the dictionary is the variable name, the value is a list where the first item is the list of required isas for that variable name, the second item is the list of required genls for that variable name, and the third item is the list of required quoted-isas for that variable name. By default only free variables are listed, if you need all the variables listed set free-variables-only? to NIL.")
    public static SubLObject formula_variables_arg_constraints_dict(final SubLObject formula, final SubLObject mt, SubLObject varP, SubLObject free_variables_onlyP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        if (free_variables_onlyP == UNPROVIDED) {
            free_variables_onlyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$25 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        wff.reset_wff_state();
                    }
                    final SubLObject free_variables = literal_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cur_variable = NIL;
                    SubLObject cur_constraints = NIL;
                    final SubLObject all_constraints = formula_variables_arg_constraints(formula, mt, varP);
                    final SubLObject cur_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    if (all_constraints.first().eql($$and)) {
                        SubLObject cdolist_list_var = all_constraints;
                        SubLObject constraint = NIL;
                        constraint = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (constraint.isList()) {
                                cur_variable = cycl_utilities.formula_arg1(constraint, UNPROVIDED);
                                if ((NIL == free_variables_onlyP) || ((NIL != free_variables_onlyP) && (NIL != subl_promotions.memberP(cur_variable, free_variables, EQUAL, UNPROVIDED)))) {
                                    cur_constraints = dictionary.dictionary_lookup(cur_dictionary, cur_variable, UNPROVIDED);
                                    cur_constraints = parse_constraint(cur_constraints, constraint);
                                    dictionary.dictionary_enter(cur_dictionary, cur_variable, cur_constraints);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint = cdolist_list_var.first();
                        } 
                    } else
                        if (NIL != all_constraints) {
                            cur_variable = second(all_constraints);
                            cur_constraints = dictionary.dictionary_lookup(cur_dictionary, cur_variable, UNPROVIDED);
                            cur_constraints = parse_constraint(cur_constraints, all_constraints);
                            dictionary.dictionary_enter(cur_dictionary, cur_variable, cur_constraints);
                        }

                    return cur_dictionary;
                } finally {
                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$25, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within FORMULA where different cnf clauses are not considered independent.
     * @see formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within FORMULA where different cnf clauses are not considered independent.\r\n@see formula-variables-arg-constraints")
    public static final SubLObject inter_formula_variables_arg_constraints_alt(SubLObject formula, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(formula, mt);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints(cnfs, new_mt, varP);
            }
        }
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within FORMULA where different cnf clauses are not considered independent.
     * @see formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within FORMULA where different cnf clauses are not considered independent.\r\n@see formula-variables-arg-constraints")
    public static SubLObject inter_formula_variables_arg_constraints(final SubLObject formula, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = at_var_type_cnfs(formula, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inter_cnfs_variables_arg_constraints(cnfs, new_mt, varP);
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within FORMULA where different cnf clauses are not considered independent.
     * @see formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within FORMULA where different cnf clauses are not considered independent.\r\n@see formula-variables-arg-constraints")
    public static final SubLObject independent_formula_variables_arg_constraints_alt(SubLObject formula, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(formula, mt);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.at_var_types.independent_cnfs_variables_arg_constraints(cnfs, new_mt, varP);
            }
        }
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within FORMULA where different cnf clauses are not considered independent.
     * @see formula-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within FORMULA where different cnf clauses are not considered independent.\r\n@see formula-variables-arg-constraints")
    public static SubLObject independent_formula_variables_arg_constraints(final SubLObject formula, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnfs = at_var_type_cnfs(formula, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return independent_cnfs_variables_arg_constraints(cnfs, new_mt, varP);
    }

    public static final SubLObject old_formula_variables_arg_constraints_alt(SubLObject formula, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnfs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        if (NIL != wff.el_wff_syntaxP(formula, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject cnfs_25 = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                SubLObject mt_26 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cnfs = cnfs_25;
                                mt = mt_26;
                            }
                        }
                    } finally {
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints(cnfs, mt, varP);
            }
        }
    }

    public static SubLObject old_formula_variables_arg_constraints(final SubLObject formula, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnfs = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            if (NIL != wff.el_wff_syntaxP(formula, UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject cnfs_$27 = clausifier.cnf_clausal_form(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                final SubLObject mt_$28 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                cnfs = cnfs_$27;
                mt = mt_$28;
            }
        } finally {
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cnfs_variables_arg_constraints(cnfs, mt, varP);
    }

    public static final SubLObject query_variables_arg_constraints_alt(SubLObject query, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dnfs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        if (NIL != wff.el_wff_syntaxP(query, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject dnfs_27 = clausifier.dnf_clausal_form(query, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                SubLObject mt_28 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                dnfs = dnfs_27;
                                mt = mt_28;
                            }
                        }
                    } finally {
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_2, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.at_var_types.dnfs_variables_arg_constraints(dnfs, mt, varP);
            }
        }
    }

    public static SubLObject query_variables_arg_constraints(final SubLObject query, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dnfs = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(NIL != fort_types_interface.mtP(mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            if (NIL != wff.el_wff_syntaxP(query, UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject dnfs_$29 = clausifier.dnf_clausal_form(query, mt_relevance_macros.$mt$.getDynamicValue(thread));
                final SubLObject mt_$30 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dnfs = dnfs_$29;
                mt = mt_$30;
            }
        } finally {
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return dnfs_variables_arg_constraints(dnfs, mt, varP);
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within QUERY where different dnf clauses are not considered independent.
     * @see query-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within QUERY where different dnf clauses are not considered independent.\r\n@see query-variables-arg-constraints")
    public static final SubLObject inter_query_variables_arg_constraints_alt(SubLObject query, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject dnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_dnfs(query, mt, NIL);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.at_var_types.inter_dnfs_variables_arg_constraints(dnfs, new_mt, varP);
            }
        }
    }

    /**
     *
     *
     * @return el-formula; returns an EL formula describing the arg-type constraints applicable
    to variables within QUERY where different dnf clauses are not considered independent.
     * @see query-variables-arg-constraints
     */
    @LispMethod(comment = "@return el-formula; returns an EL formula describing the arg-type constraints applicable\r\nto variables within QUERY where different dnf clauses are not considered independent.\r\n@see query-variables-arg-constraints")
    public static SubLObject inter_query_variables_arg_constraints(final SubLObject query, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject dnfs = at_var_type_dnfs(query, mt, NIL);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inter_dnfs_variables_arg_constraints(dnfs, new_mt, varP);
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNFS")
    public static final SubLObject cnfs_variables_arg_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                {
                    SubLObject var = com.cyc.cycjava.cycl.at_var_types.cnf_variables_arg_constraints(cnf, mt, varP);
                    if (NIL != var) {
                        result = cons(var, result);
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(result), UNPROVIDED), varP);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNFS")
    public static SubLObject cnfs_variables_arg_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = cnf_variables_arg_constraints(cnf, mt, varP);
            if (NIL != var) {
                result = cons(var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        final SubLObject conjoined = simplifier.conjoin(nreverse(result), UNPROVIDED);
        try {
            return simplifier.simplify_cycl_conjunction(conjoined, varP);
        } catch (final Throwable t) {
            return conjoined;
        }
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNFS")
    public static final SubLObject independent_cnfs_variables_arg_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject result = NIL;
            SubLObject skolem_cnfs = NIL;
            {
                SubLObject cdolist_list_var = cnfs;
                SubLObject cnf = NIL;
                for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                    if (NIL != list_utilities.tree_find_if($sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED)) {
                        skolem_cnfs = cons(cnf, skolem_cnfs);
                    } else {
                        {
                            SubLObject var = com.cyc.cycjava.cycl.at_var_types.cnf_variables_arg_constraints(cnf, mt, varP);
                            if (NIL != var) {
                                result = cons(var, result);
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = list_utilities.tree_gather(skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL);
                SubLObject skolem = NIL;
                for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                    {
                        SubLObject cnfs_of_skolem = NIL;
                        {
                            SubLObject cdolist_list_var_29 = skolem_cnfs;
                            SubLObject cnf = NIL;
                            for (cnf = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , cnf = cdolist_list_var_29.first()) {
                                if (NIL != list_utilities.tree_find(skolem, cnf, EQUAL, UNPROVIDED)) {
                                    cnfs_of_skolem = cons(cnf, cnfs_of_skolem);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var_30 = clause_utilities.group_clauses_having_common_neg_lits(cnfs_of_skolem, UNPROVIDED);
                            SubLObject dependent_cnfs_of_skolem = NIL;
                            for (dependent_cnfs_of_skolem = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , dependent_cnfs_of_skolem = cdolist_list_var_30.first()) {
                                {
                                    SubLObject var = com.cyc.cycjava.cycl.at_var_types.cnfs_variables_arg_constraints(dependent_cnfs_of_skolem, mt, varP);
                                    if (NIL != var) {
                                        result = cons(var, result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.simplify_cycl_disjunction(simplifier.disjoin(nreverse(result), UNPROVIDED), varP);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNFS")
    public static SubLObject independent_cnfs_variables_arg_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject result = NIL;
        SubLObject skolem_cnfs = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.tree_find_if($sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED)) {
                skolem_cnfs = cons(cnf, skolem_cnfs);
            } else {
                final SubLObject var = cnf_variables_arg_constraints(cnf, mt, varP);
                if (NIL != var) {
                    result = cons(var, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.tree_gather(skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL);
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cnfs_of_skolem = NIL;
            SubLObject cdolist_list_var_$31 = skolem_cnfs;
            SubLObject cnf2 = NIL;
            cnf2 = cdolist_list_var_$31.first();
            while (NIL != cdolist_list_var_$31) {
                if (NIL != list_utilities.tree_find(skolem, cnf2, EQUAL, UNPROVIDED)) {
                    cnfs_of_skolem = cons(cnf2, cnfs_of_skolem);
                }
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                cnf2 = cdolist_list_var_$31.first();
            } 
            SubLObject cdolist_list_var_$32 = clause_utilities.group_clauses_having_common_neg_lits(cnfs_of_skolem, UNPROVIDED);
            SubLObject dependent_cnfs_of_skolem = NIL;
            dependent_cnfs_of_skolem = cdolist_list_var_$32.first();
            while (NIL != cdolist_list_var_$32) {
                final SubLObject var2 = cnfs_variables_arg_constraints(dependent_cnfs_of_skolem, mt, varP);
                if (NIL != var2) {
                    result = cons(var2, result);
                }
                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                dependent_cnfs_of_skolem = cdolist_list_var_$32.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.simplify_cycl_disjunction(simplifier.disjoin(nreverse(result), UNPROVIDED), varP);
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNFS")
    public static final SubLObject inter_cnfs_variables_arg_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject isa_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
            SubLObject genls_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = cnfs;
                SubLObject cnf = NIL;
                for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_31 = com.cyc.cycjava.cycl.at_var_types.cnf_variables_isa_constraints(cnf, mt, varP);
                        SubLObject var_isa_constraints = NIL;
                        for (var_isa_constraints = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , var_isa_constraints = cdolist_list_var_31.first()) {
                            {
                                SubLObject var = var_isa_constraints.first();
                                SubLObject isa_constraints = var_isa_constraints.rest();
                                sethash(var, isa_table, append(isa_constraints, gethash(var, isa_table, UNPROVIDED)));
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var_32 = com.cyc.cycjava.cycl.at_var_types.cnf_variables_genl_constraints(cnf, mt, varP);
                        SubLObject var_genl_constraints = NIL;
                        for (var_genl_constraints = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , var_genl_constraints = cdolist_list_var_32.first()) {
                            {
                                SubLObject var = var_genl_constraints.first();
                                SubLObject genls_constraints = var_genl_constraints.rest();
                                sethash(var, genls_table, append(genls_constraints, gethash(var, genls_table, UNPROVIDED)));
                            }
                        }
                    }
                }
            }
            {
                SubLObject var = NIL;
                SubLObject isa_constraints = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(isa_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            var = getEntryKey(cdohash_entry);
                            isa_constraints = getEntryValue(cdohash_entry);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.at_min_cols(remove_duplicates(isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt);
                                SubLObject v_isa = NIL;
                                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                    result = cons(make_binary_formula($$isa, var, v_isa), result);
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            {
                SubLObject var = NIL;
                SubLObject genls_constraints = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(genls_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            var = getEntryKey(cdohash_entry);
                            genls_constraints = getEntryValue(cdohash_entry);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.at_min_cols(remove_duplicates(genls_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt);
                                SubLObject genl = NIL;
                                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                    result = cons(make_binary_formula($$genls, var, genl), result);
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(result), UNPROVIDED), varP);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNFS")
    public static SubLObject inter_cnfs_variables_arg_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject isa_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
        final SubLObject genls_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$33 = cnf_variables_isa_constraints(cnf, mt, varP);
            SubLObject var_isa_constraints = NIL;
            var_isa_constraints = cdolist_list_var_$33.first();
            while (NIL != cdolist_list_var_$33) {
                final SubLObject var = var_isa_constraints.first();
                final SubLObject isa_constraints = var_isa_constraints.rest();
                sethash(var, isa_table, append(isa_constraints, gethash(var, isa_table, UNPROVIDED)));
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                var_isa_constraints = cdolist_list_var_$33.first();
            } 
            SubLObject cdolist_list_var_$34 = cnf_variables_genl_constraints(cnf, mt, varP);
            SubLObject var_genl_constraints = NIL;
            var_genl_constraints = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                final SubLObject var = var_genl_constraints.first();
                final SubLObject genls_constraints = var_genl_constraints.rest();
                sethash(var, genls_table, append(genls_constraints, gethash(var, genls_table, UNPROVIDED)));
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                var_genl_constraints = cdolist_list_var_$34.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        SubLObject var2 = NIL;
        SubLObject isa_constraints2 = NIL;
        Iterator cdohash_iterator = getEntrySetIterator(isa_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                var2 = getEntryKey(cdohash_entry);
                isa_constraints2 = getEntryValue(cdohash_entry);
                SubLObject cdolist_list_var2 = at_min_cols(remove_duplicates(isa_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt);
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    result = cons(make_binary_formula($$isa, var2, v_isa), result);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    v_isa = cdolist_list_var2.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        var2 = NIL;
        SubLObject genls_constraints2 = NIL;
        cdohash_iterator = getEntrySetIterator(genls_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                var2 = getEntryKey(cdohash_entry);
                genls_constraints2 = getEntryValue(cdohash_entry);
                SubLObject cdolist_list_var2 = at_min_cols(remove_duplicates(genls_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt);
                SubLObject genl = NIL;
                genl = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    result = cons(make_binary_formula($$genls, var2, genl), result);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    genl = cdolist_list_var2.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(result), UNPROVIDED), varP);
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the isa constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe isa constraints imposed on variables in CNFS")
    public static final SubLObject inter_cnfs_variables_isa_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject isa_table = dictionary.new_dictionary(symbol_function(EQ), length(vars));
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = cnfs;
                    SubLObject cnf = NIL;
                    for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_33 = com.cyc.cycjava.cycl.at_var_types.cnf_variables_isa_constraints(cnf, mt, varP);
                            SubLObject var_isa_constraints = NIL;
                            for (var_isa_constraints = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , var_isa_constraints = cdolist_list_var_33.first()) {
                                {
                                    SubLObject var = var_isa_constraints.first();
                                    SubLObject isa_constraints = var_isa_constraints.rest();
                                    dictionary_utilities.dictionary_append(isa_table, var, isa_constraints);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(isa_table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject isa_constraints = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject var_result = NIL;
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.at_min_cols(isa_constraints, mt);
                                SubLObject v_isa = NIL;
                                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                    var_result = cons(v_isa, var_result);
                                }
                                var_result = cons(var, var_result);
                                result = cons(var_result, result);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the isa constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe isa constraints imposed on variables in CNFS")
    public static SubLObject inter_cnfs_variables_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject isa_table = dictionary.new_dictionary(symbol_function(EQL), length(vars));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$35 = cnf_variables_isa_constraints(cnf, mt, varP);
            SubLObject var_isa_constraints = NIL;
            var_isa_constraints = cdolist_list_var_$35.first();
            while (NIL != cdolist_list_var_$35) {
                final SubLObject var = var_isa_constraints.first();
                final SubLObject isa_constraints = var_isa_constraints.rest();
                dictionary_utilities.dictionary_append(isa_table, var, isa_constraints);
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                var_isa_constraints = cdolist_list_var_$35.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(isa_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject isa_constraints2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject var_result = NIL;
            SubLObject cdolist_list_var2 = at_min_cols(isa_constraints2, mt);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                var_result = cons(v_isa, var_result);
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_isa = cdolist_list_var2.first();
            } 
            var_result = cons(var2, var_result);
            result = cons(var_result, result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the quotedIsa constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe quotedIsa constraints imposed on variables in CNFS")
    public static final SubLObject inter_cnfs_variables_quoted_isa_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject quoted_isa_table = dictionary.new_dictionary(symbol_function(EQ), length(vars));
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = cnfs;
                    SubLObject cnf = NIL;
                    for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_34 = com.cyc.cycjava.cycl.at_var_types.cnf_variables_quoted_isa_constraints(cnf, mt, varP);
                            SubLObject var_quoted_isa_constraints = NIL;
                            for (var_quoted_isa_constraints = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , var_quoted_isa_constraints = cdolist_list_var_34.first()) {
                                {
                                    SubLObject var = var_quoted_isa_constraints.first();
                                    SubLObject quoted_isa_constraints = var_quoted_isa_constraints.rest();
                                    dictionary_utilities.dictionary_append(quoted_isa_table, var, quoted_isa_constraints);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(quoted_isa_table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject quoted_isa_constraints = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject var_result = NIL;
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.at_min_cols(quoted_isa_constraints, mt);
                                SubLObject quoted_isa = NIL;
                                for (quoted_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quoted_isa = cdolist_list_var.first()) {
                                    var_result = cons(quoted_isa, var_result);
                                }
                                var_result = cons(var, var_result);
                                result = cons(var_result, result);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the quotedIsa constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe quotedIsa constraints imposed on variables in CNFS")
    public static SubLObject inter_cnfs_variables_quoted_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject quoted_isa_table = dictionary.new_dictionary(symbol_function(EQL), length(vars));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$36 = cnf_variables_quoted_isa_constraints(cnf, mt, varP);
            SubLObject var_quoted_isa_constraints = NIL;
            var_quoted_isa_constraints = cdolist_list_var_$36.first();
            while (NIL != cdolist_list_var_$36) {
                final SubLObject var = var_quoted_isa_constraints.first();
                final SubLObject quoted_isa_constraints = var_quoted_isa_constraints.rest();
                dictionary_utilities.dictionary_append(quoted_isa_table, var, quoted_isa_constraints);
                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                var_quoted_isa_constraints = cdolist_list_var_$36.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(quoted_isa_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject quoted_isa_constraints2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject var_result = NIL;
            SubLObject cdolist_list_var2 = at_min_cols(quoted_isa_constraints2, mt);
            SubLObject quoted_isa = NIL;
            quoted_isa = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                var_result = cons(quoted_isa, var_result);
                cdolist_list_var2 = cdolist_list_var2.rest();
                quoted_isa = cdolist_list_var2.first();
            } 
            var_result = cons(var2, var_result);
            result = cons(var_result, result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the genls constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe genls constraints imposed on variables in CNFS")
    public static final SubLObject inter_cnfs_variables_genl_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject genl_table = dictionary.new_dictionary(symbol_function(EQ), length(vars));
                SubLObject result = NIL;
                {
                    SubLObject cdolist_list_var = cnfs;
                    SubLObject cnf = NIL;
                    for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_35 = com.cyc.cycjava.cycl.at_var_types.cnf_variables_genl_constraints(cnf, mt, varP);
                            SubLObject var_genl_constraints = NIL;
                            for (var_genl_constraints = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , var_genl_constraints = cdolist_list_var_35.first()) {
                                {
                                    SubLObject var = var_genl_constraints.first();
                                    SubLObject genl_constraints = var_genl_constraints.rest();
                                    dictionary_utilities.dictionary_append(genl_table, var, genl_constraints);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(genl_table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject genl_constraints = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject var_result = NIL;
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.at_min_cols(genl_constraints, mt);
                                SubLObject genl = NIL;
                                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                    var_result = cons(genl, var_result);
                                }
                                var_result = cons(var, var_result);
                                result = cons(var_result, result);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the genls constraints imposed on variables in CNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe genls constraints imposed on variables in CNFS")
    public static SubLObject inter_cnfs_variables_genl_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject genl_table = dictionary.new_dictionary(symbol_function(EQL), length(vars));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$37 = cnf_variables_genl_constraints(cnf, mt, varP);
            SubLObject var_genl_constraints = NIL;
            var_genl_constraints = cdolist_list_var_$37.first();
            while (NIL != cdolist_list_var_$37) {
                final SubLObject var = var_genl_constraints.first();
                final SubLObject genl_constraints = var_genl_constraints.rest();
                dictionary_utilities.dictionary_append(genl_table, var, genl_constraints);
                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                var_genl_constraints = cdolist_list_var_$37.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(genl_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject genl_constraints2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject var_result = NIL;
            SubLObject cdolist_list_var2 = at_min_cols(genl_constraints2, mt);
            SubLObject genl = NIL;
            genl = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                var_result = cons(genl, var_result);
                cdolist_list_var2 = cdolist_list_var2.rest();
                genl = cdolist_list_var2.first();
            } 
            var_result = cons(var2, var_result);
            result = cons(var_result, result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static final SubLObject hl_cnf_variables_arg_constraints_alt(SubLObject cnf, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.cnf_variables_arg_constraints(cnf, mt, VARIABLE_P);
    }

    public static SubLObject hl_cnf_variables_arg_constraints(final SubLObject cnf, final SubLObject mt) {
        return cnf_variables_arg_constraints(cnf, mt, VARIABLE_P);
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNF
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNF")
    public static final SubLObject cnf_variables_arg_constraints_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.cnf_variables_isa_constraints(cnf, mt, varP);
                SubLObject var_isa_constraints = NIL;
                for (var_isa_constraints = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_isa_constraints = cdolist_list_var.first()) {
                    {
                        SubLObject var = var_isa_constraints.first();
                        SubLObject isa_constraints = var_isa_constraints.rest();
                        SubLObject cdolist_list_var_36 = reverse(isa_constraints);
                        SubLObject v_isa = NIL;
                        for (v_isa = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , v_isa = cdolist_list_var_36.first()) {
                            result = cons(make_binary_formula($$isa, var, v_isa), result);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.cnf_variables_quoted_isa_constraints(cnf, mt, varP);
                SubLObject var_quoted_isa_constraints = NIL;
                for (var_quoted_isa_constraints = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_quoted_isa_constraints = cdolist_list_var.first()) {
                    {
                        SubLObject var = var_quoted_isa_constraints.first();
                        SubLObject quoted_isa_constraints = var_quoted_isa_constraints.rest();
                        SubLObject cdolist_list_var_37 = reverse(quoted_isa_constraints);
                        SubLObject quoted_isa = NIL;
                        for (quoted_isa = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest() , quoted_isa = cdolist_list_var_37.first()) {
                            result = cons(make_binary_formula($$quotedIsa, var, quoted_isa), result);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.cnf_variables_genl_constraints(cnf, mt, varP);
                SubLObject var_genl_constraints = NIL;
                for (var_genl_constraints = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_genl_constraints = cdolist_list_var.first()) {
                    {
                        SubLObject var = var_genl_constraints.first();
                        SubLObject genl_constraints = var_genl_constraints.rest();
                        SubLObject cdolist_list_var_38 = reverse(genl_constraints);
                        SubLObject genl = NIL;
                        for (genl = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , genl = cdolist_list_var_38.first()) {
                            result = cons(make_binary_formula($$genls, var, genl), result);
                        }
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.conjoin(nreverse(result), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in CNF
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in CNF")
    public static SubLObject cnf_variables_arg_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnf_variables_isa_constraints(cnf, mt, varP);
        SubLObject var_isa_constraints = NIL;
        var_isa_constraints = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = var_isa_constraints.first();
            final SubLObject isa_constraints = var_isa_constraints.rest();
            SubLObject cdolist_list_var_$38 = reverse(isa_constraints);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var_$38.first();
            while (NIL != cdolist_list_var_$38) {
                result = cons(make_binary_formula($$isa, var, v_isa), result);
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                v_isa = cdolist_list_var_$38.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var_isa_constraints = cdolist_list_var.first();
        } 
        cdolist_list_var = cnf_variables_quoted_isa_constraints(cnf, mt, varP);
        SubLObject var_quoted_isa_constraints = NIL;
        var_quoted_isa_constraints = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = var_quoted_isa_constraints.first();
            final SubLObject quoted_isa_constraints = var_quoted_isa_constraints.rest();
            SubLObject cdolist_list_var_$39 = reverse(quoted_isa_constraints);
            SubLObject quoted_isa = NIL;
            quoted_isa = cdolist_list_var_$39.first();
            while (NIL != cdolist_list_var_$39) {
                result = cons(make_binary_formula($$quotedIsa, var, quoted_isa), result);
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                quoted_isa = cdolist_list_var_$39.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var_quoted_isa_constraints = cdolist_list_var.first();
        } 
        cdolist_list_var = cnf_variables_genl_constraints(cnf, mt, varP);
        SubLObject var_genl_constraints = NIL;
        var_genl_constraints = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = var_genl_constraints.first();
            final SubLObject genl_constraints = var_genl_constraints.rest();
            SubLObject cdolist_list_var_$40 = reverse(genl_constraints);
            SubLObject genl = NIL;
            genl = cdolist_list_var_$40.first();
            while (NIL != cdolist_list_var_$40) {
                result = cons(make_binary_formula($$genls, var, genl), result);
                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                genl = cdolist_list_var_$40.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var_genl_constraints = cdolist_list_var.first();
        } 
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.conjoin(nreverse(result), UNPROVIDED);
    }

    public static final SubLObject inter_cnfs_variables_arg_constraints_okP_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject formula = wff_vars.unexpanded_formula();
                if (((NIL != wff_vars.$validating_expansionP$.getDynamicValue(thread)) && (NIL != genls_litP(formula))) && (NIL != sdc.sdcP(cycl_utilities.formula_arg1(formula, UNPROVIDED), cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED))) {
                    {
                        SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
                        try {
                            sdc.$ignoring_sdcP$.bind(T, thread);
                            ans = com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
                        } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    ans = com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
                }
                return ans;
            }
        }
    }

    public static SubLObject inter_cnfs_variables_arg_constraints_okP(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject formula = wff_vars.unexpanded_formula();
        if (((NIL != wff_vars.$validating_expansionP$.getDynamicValue(thread)) && (NIL != genls_litP(formula))) && (NIL != sdc.sdcP(cycl_utilities.formula_arg1(formula, UNPROVIDED), cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED))) {
            final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                sdc.$ignoring_sdcP$.bind(T, thread);
                ans = inter_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
            } finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
            }
        } else {
            ans = inter_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
        }
        return ans;
    }

    public static final SubLObject inter_cnfs_variables_arg_constraints_okP_int_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject isa_constraints = com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_isa_constraints(cnfs, mt, varP);
            return makeBoolean((((NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(isa_constraints, $ISA, mt)) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_quoted_isa_constraints(cnfs, mt, varP), $QUOTED_ISA, mt))) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.inter_cnfs_variables_genl_constraints(cnfs, mt, varP), $GENLS, mt))) && (NIL != com.cyc.cycjava.cycl.at_var_types.cnfs_var_constraint_implications_okP(cnfs, isa_constraints, mt, varP)));
        }
    }

    public static SubLObject inter_cnfs_variables_arg_constraints_okP_int(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject isa_constraints = inter_cnfs_variables_isa_constraints(cnfs, mt, varP);
        return makeBoolean((((NIL != var_types_okP(isa_constraints, $ISA, mt)) && (NIL != var_types_okP(inter_cnfs_variables_quoted_isa_constraints(cnfs, mt, varP), $QUOTED_ISA, mt))) && (NIL != var_types_okP(inter_cnfs_variables_genl_constraints(cnfs, mt, varP), $GENLS, mt))) && (NIL != cnfs_var_constraint_implications_okP(cnfs, isa_constraints, mt, varP)));
    }

    public static final SubLObject cnfs_variables_arg_constraints_okP_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject isa_constraints = com.cyc.cycjava.cycl.at_var_types.cnfs_variables_isa_constraints(cnfs, mt, varP);
            return makeBoolean((((NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(isa_constraints, $ISA, mt)) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.cnfs_variables_quoted_isa_constraints(cnfs, mt, varP), $QUOTED_ISA, mt))) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.cnfs_variables_genl_constraints(cnfs, mt, varP), $GENLS, mt))) && (NIL != com.cyc.cycjava.cycl.at_var_types.cnfs_var_constraint_implications_okP(cnfs, isa_constraints, mt, varP)));
        }
    }

    public static SubLObject cnfs_variables_arg_constraints_okP(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject isa_constraints = cnfs_variables_isa_constraints(cnfs, mt, varP);
        return makeBoolean((((NIL != var_types_okP(isa_constraints, $ISA, mt)) && (NIL != var_types_okP(cnfs_variables_quoted_isa_constraints(cnfs, mt, varP), $QUOTED_ISA, mt))) && (NIL != var_types_okP(cnfs_variables_genl_constraints(cnfs, mt, varP), $GENLS, mt))) && (NIL != cnfs_var_constraint_implications_okP(cnfs, isa_constraints, mt, varP)));
    }

    public static final SubLObject cnf_variables_arg_constraints_okP_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject isa_constraints = com.cyc.cycjava.cycl.at_var_types.cnf_variables_isa_constraints(cnf, mt, varP);
            return makeBoolean((((NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(isa_constraints, $ISA, mt)) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.cnf_variables_quoted_isa_constraints(cnf, mt, varP), $QUOTED_ISA, mt))) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.cnf_variables_genl_constraints(cnf, mt, varP), $GENLS, mt))) && (NIL != com.cyc.cycjava.cycl.at_var_types.cnf_var_constraint_implications_okP(cnf, isa_constraints, mt, varP)));
        }
    }

    public static SubLObject cnf_variables_arg_constraints_okP(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject isa_constraints = cnf_variables_isa_constraints(cnf, mt, varP);
        return makeBoolean((((NIL != var_types_okP(isa_constraints, $ISA, mt)) && (NIL != var_types_okP(cnf_variables_quoted_isa_constraints(cnf, mt, varP), $QUOTED_ISA, mt))) && (NIL != var_types_okP(cnf_variables_genl_constraints(cnf, mt, varP), $GENLS, mt))) && (NIL != cnf_var_constraint_implications_okP(cnf, isa_constraints, mt, varP)));
    }

    public static final SubLObject var_isa_constraints_wrt_cnfs_alt(SubLObject var, SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, com.cyc.cycjava.cycl.at_var_types.cnfs_variables_isa_constraints(cnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject var_isa_constraints_wrt_cnfs(final SubLObject var, final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, cnfs_variables_isa_constraints(cnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject var_genl_constraints_wrt_cnfs_alt(SubLObject var, SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, com.cyc.cycjava.cycl.at_var_types.cnfs_variables_genl_constraints(cnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject var_genl_constraints_wrt_cnfs(final SubLObject var, final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, cnfs_variables_genl_constraints(cnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject cnfs_variables_isa_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject constraints = NIL;
                SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_isa_constraints(var, cnfs, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                }
                if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_inter_arg_isa_constraints(var, cnfs, constraints, mt), mt);
                                result = cons(cons(var, cols), result);
                            }
                        }
                    }
                } else {
                    result = constraints;
                }
                return result;
            }
        }
    }

    public static SubLObject cnfs_variables_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(cnfs_variable_isa_constraints(var, cnfs, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
            cdolist_list_var = vars;
            var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cols = at_min_cols(cnfs_variable_inter_arg_isa_constraints(var, cnfs, constraints, mt), mt);
                result = cons(cons(var, cols), result);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            result = constraints;
        }
        return result;
    }

    public static final SubLObject cnfs_variables_quoted_isa_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                {
                    SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_quoted_isa_constraints(var, cnfs, mt), mt);
                    constraints = cons(cons(var, cols), constraints);
                }
            }
            result = constraints;
            return result;
        }
    }

    public static SubLObject cnfs_variables_quoted_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(cnfs_variable_quoted_isa_constraints(var, cnfs, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        result = constraints;
        return result;
    }

    public static final SubLObject cnfs_variables_genl_constraints_alt(SubLObject cnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject constraints = NIL;
                SubLObject vars = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_genl_constraints(var, cnfs, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                }
                if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_inter_arg_genl_constraints(var, cnfs, constraints, mt), mt);
                                result = cons(cons(var, cols), result);
                            }
                        }
                    }
                } else {
                    result = constraints;
                }
                return result;
            }
        }
    }

    public static SubLObject cnfs_variables_genl_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(cnfs_variable_genl_constraints(var, cnfs, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
            cdolist_list_var = vars;
            var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cols = at_min_cols(cnfs_variable_inter_arg_genl_constraints(var, cnfs, constraints, mt), mt);
                result = cons(cons(var, cols), result);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            result = constraints;
        }
        return result;
    }

    public static final SubLObject cnfs_variable_isa_constraints_alt(SubLObject var, SubLObject cnfs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_isa_constraints(var, cnf, mt));
            }
            result = list_utilities.delete_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject cnfs_variable_isa_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, cnf_variable_isa_constraints(var, cnf, mt));
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject cnfs_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject cnfs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_quoted_isa_constraints(var, cnf, mt));
            }
            result = list_utilities.delete_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject cnfs_variable_quoted_isa_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, cnf_variable_quoted_isa_constraints(var, cnf, mt));
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject cnfs_variable_genl_constraints_alt(SubLObject var, SubLObject cnfs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_genl_constraints(var, cnf, mt));
            }
            result = list_utilities.delete_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject cnfs_variable_genl_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, cnf_variable_genl_constraints(var, cnf, mt));
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject cnf_variables_isa_constraints_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                if (NIL != pos_lits) {
                    {
                        SubLObject vars = nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        SubLObject result = NIL;
                        SubLObject constraints = NIL;
                        {
                            SubLObject cdolist_list_var = vars;
                            SubLObject var = NIL;
                            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                if ((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED))) {
                                    {
                                        SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnf_variable_isa_constraints(var, cnf, mt), mt);
                                        constraints = cons(cons(var, cols), constraints);
                                    }
                                }
                            }
                        }
                        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                            {
                                SubLObject cdolist_list_var = vars;
                                SubLObject var = NIL;
                                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                    {
                                        SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnf_variable_inter_arg_isa_constraints(var, cnf, constraints, mt), mt);
                                        result = cons(cons(var, cols), result);
                                    }
                                }
                            }
                        } else {
                            result = constraints;
                        }
                        return result;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cnf_variables_isa_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        if (NIL != pos_lits) {
            final SubLObject vars = nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED))) {
                    final SubLObject cols = at_min_cols(cnf_variable_isa_constraints(var, cnf, mt), mt);
                    constraints = cons(cons(var, cols), constraints);
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                cdolist_list_var = vars;
                var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject cols = at_min_cols(cnf_variable_inter_arg_isa_constraints(var, cnf, constraints, mt), mt);
                    result = cons(cons(var, cols), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
            } else {
                result = constraints;
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject cnf_variables_quoted_isa_constraints_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            SubLObject pos_lits = clauses.pos_lits(cnf);
            if (NIL != pos_lits) {
                {
                    SubLObject vars = nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    SubLObject result = NIL;
                    SubLObject constraints = NIL;
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        if (NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) {
                        }
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnf_variable_quoted_isa_constraints(var, cnf, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                    result = constraints;
                    return result;
                }
            }
        }
        return NIL;
    }

    public static SubLObject cnf_variables_quoted_isa_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        if (NIL != pos_lits) {
            final SubLObject vars = nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) {
                }
                final SubLObject cols = at_min_cols(cnf_variable_quoted_isa_constraints(var, cnf, mt), mt);
                constraints = cons(cons(var, cols), constraints);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            result = constraints;
            return result;
        }
        return NIL;
    }

    public static final SubLObject cnf_variables_genl_constraints_alt(SubLObject cnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                if (NIL != pos_lits) {
                    {
                        SubLObject vars = nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        SubLObject result = NIL;
                        SubLObject constraints = NIL;
                        {
                            SubLObject cdolist_list_var = vars;
                            SubLObject var = NIL;
                            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                if ((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED))) {
                                    {
                                        SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnf_variable_genl_constraints(var, cnf, mt), mt);
                                        constraints = cons(cons(var, cols), constraints);
                                    }
                                }
                            }
                        }
                        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
                            {
                                SubLObject cdolist_list_var = vars;
                                SubLObject var = NIL;
                                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                    {
                                        SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnf_variable_inter_arg_genl_constraints(var, cnf, constraints, mt), mt);
                                        result = cons(cons(var, cols), result);
                                    }
                                }
                            }
                        } else {
                            result = constraints;
                        }
                        return result;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cnf_variables_genl_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        if (NIL != pos_lits) {
            final SubLObject vars = nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) || (NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED))) {
                    final SubLObject cols = at_min_cols(cnf_variable_genl_constraints(var, cnf, mt), mt);
                    constraints = cons(cons(var, cols), constraints);
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
                cdolist_list_var = vars;
                var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject cols = at_min_cols(cnf_variable_inter_arg_genl_constraints(var, cnf, constraints, mt), mt);
                    result = cons(cons(var, cols), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
            } else {
                result = constraints;
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject cnf_variable_isa_constraints_alt(SubLObject var, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(cnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_39 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_neg_lit_variable_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        {
                                                            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                            SubLObject mt_arg = designated_mt(literal);
                                                            SubLObject subformula = designated_sentence(literal);
                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                            }
                                                        }
                                                    }
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_pos_lit_variable_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_39, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cnf_variable_isa_constraints(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        if (NIL != cycl_utilities.expression_find(var, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return copy_list(cnf_variable_isa_constraints_int(var, cnf, mt));
        }
        return NIL;
    }

    public static SubLObject cnf_variable_isa_constraints_int_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(cnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = nconc(result, cnf_neg_lit_variable_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != mt_designating_literalP(literal)) {
                                final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                final SubLObject mt_arg = designated_mt(literal);
                                final SubLObject subformula = designated_sentence(literal);
                                final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                    result = nconc(result, formula_variable_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                }
                            }
                            result = nconc(result, cnf_pos_lit_variable_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        result = list_utilities.delete_duplicate_forts(result);
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$41, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject cnf_variable_isa_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cnf_variable_isa_constraints_int_internal(var, cnf, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CNF_VARIABLE_ISA_CONSTRAINTS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CNF_VARIABLE_ISA_CONSTRAINTS_INT, THREE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CNF_VARIABLE_ISA_CONSTRAINTS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(var, cnf, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cnf.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cnf_variable_isa_constraints_int_internal(var, cnf, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, cnf, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject cnf_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(cnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_40 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_neg_lit_variable_quoted_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        {
                                                            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                            SubLObject mt_arg = designated_mt(literal);
                                                            SubLObject subformula = designated_sentence(literal);
                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_quoted_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                            }
                                                        }
                                                    }
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_pos_lit_variable_quoted_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_40, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cnf_variable_quoted_isa_constraints(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        if (NIL != cycl_utilities.expression_find(var, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return copy_list(cnf_variable_quoted_isa_constraints_int(var, cnf, mt));
        }
        return NIL;
    }

    public static SubLObject cnf_variable_quoted_isa_constraints_int_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(cnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = nconc(result, cnf_neg_lit_variable_quoted_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != mt_designating_literalP(literal)) {
                                final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                final SubLObject mt_arg = designated_mt(literal);
                                final SubLObject subformula = designated_sentence(literal);
                                final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                    result = nconc(result, formula_variable_quoted_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                }
                            }
                            result = nconc(result, cnf_pos_lit_variable_quoted_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        result = list_utilities.delete_duplicate_forts(result);
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$42, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject cnf_variable_quoted_isa_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cnf_variable_quoted_isa_constraints_int_internal(var, cnf, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT, THREE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(var, cnf, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cnf.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cnf_variable_quoted_isa_constraints_int_internal(var, cnf, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, cnf, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject cnf_variable_genl_constraints_alt(SubLObject var, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(cnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_41 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_neg_lit_variable_genl_constraints(var, literal, mt));
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        {
                                                            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                            SubLObject mt_arg = designated_mt(literal);
                                                            SubLObject subformula = designated_sentence(literal);
                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_genl_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, mt)));
                                                            }
                                                        }
                                                    }
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_pos_lit_variable_genl_constraints(var, literal, mt));
                                                }
                                            }
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_41, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cnf_variable_genl_constraints(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        if (NIL != cycl_utilities.expression_find(var, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return copy_list(cnf_variable_genl_constraints_int(var, cnf, mt));
        }
        return NIL;
    }

    public static SubLObject cnf_variable_genl_constraints_int_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(cnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = nconc(result, cnf_neg_lit_variable_genl_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != mt_designating_literalP(literal)) {
                                final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                final SubLObject mt_arg = designated_mt(literal);
                                final SubLObject subformula = designated_sentence(literal);
                                final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                    result = nconc(result, formula_variable_genl_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, mt)));
                                }
                            }
                            result = nconc(result, cnf_pos_lit_variable_genl_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        result = list_utilities.delete_duplicate_forts(result);
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$43, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject cnf_variable_genl_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cnf_variable_genl_constraints_int_internal(var, cnf, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CNF_VARIABLE_GENL_CONSTRAINTS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CNF_VARIABLE_GENL_CONSTRAINTS_INT, THREE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CNF_VARIABLE_GENL_CONSTRAINTS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(var, cnf, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cnf.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cnf_variable_genl_constraints_int_internal(var, cnf, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, cnf, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static final SubLObject cnfs_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject cnfs, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL == constraints) && (NIL != list_utilities.singletonP(cnfs))) && (NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnfs.first()))) {
                return NIL;
            }
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_isa$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_isa$.bind(constraints, thread);
                        {
                            SubLObject cdolist_list_var = cnfs;
                            SubLObject cnf = NIL;
                            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_inter_arg_isa_constraints_int(var, cnf, mt));
                            }
                        }
                    } finally {
                        at_vars.$at_var_isa$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static SubLObject cnfs_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == constraints) && (NIL != list_utilities.singletonP(cnfs))) && (NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnfs.first()))) {
            return NIL;
        }
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_isa$.bind(constraints, thread);
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            cnf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nconc(result, cnf_variable_inter_arg_isa_constraints_int(var, cnf, mt));
                cdolist_list_var = cdolist_list_var.rest();
                cnf = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$at_var_isa$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static final SubLObject cnfs_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject cnfs, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL == constraints) && (NIL != list_utilities.singletonP(cnfs))) && (NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnfs.first()))) {
                return NIL;
            }
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_genl$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_genl$.bind(constraints, thread);
                        {
                            SubLObject cdolist_list_var = cnfs;
                            SubLObject cnf = NIL;
                            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_inter_arg_genl_constraints_int(var, cnf, mt));
                            }
                        }
                    } finally {
                        at_vars.$at_var_genl$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static SubLObject cnfs_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == constraints) && (NIL != list_utilities.singletonP(cnfs))) && (NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnfs.first()))) {
            return NIL;
        }
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_genl$.bind(constraints, thread);
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            cnf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nconc(result, cnf_variable_inter_arg_genl_constraints_int(var, cnf, mt));
                cdolist_list_var = cdolist_list_var.rest();
                cnf = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$at_var_genl$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static final SubLObject cnf_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject cnf, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_isa$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_isa$.bind(constraints, thread);
                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_inter_arg_isa_constraints_int(var, cnf, mt));
                    } finally {
                        at_vars.$at_var_isa$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static SubLObject cnf_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject cnf, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_isa$.bind(constraints, thread);
            result = nconc(result, cnf_variable_inter_arg_isa_constraints_int(var, cnf, mt));
        } finally {
            at_vars.$at_var_isa$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static final SubLObject cnf_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject cnf, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_genl$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_genl$.bind(constraints, thread);
                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.cnf_variable_inter_arg_genl_constraints_int(var, cnf, mt));
                    } finally {
                        at_vars.$at_var_genl$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown destroys CONSTRAINTS
     */
    @LispMethod(comment = "@unknown destroys CONSTRAINTS")
    public static SubLObject cnf_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject cnf, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_genl$.bind(constraints, thread);
            result = nconc(result, cnf_variable_inter_arg_genl_constraints_int(var, cnf, mt));
        } finally {
            at_vars.$at_var_genl$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject cnf_variable_inter_arg_isa_constraints_int_alt(SubLObject var, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnf)) && (NIL == at_vars.$at_var_isa$.getDynamicValue(thread))) {
                return NIL;
            }
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject neg_lits = clauses.neg_lits(cnf);
                        SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                            try {
                                at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                    {
                                        SubLObject cdolist_list_var = neg_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = pos_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            if (NIL != mt_designating_literalP(literal)) {
                                                {
                                                    SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                    SubLObject mt_arg = designated_mt(literal);
                                                    SubLObject subformula = designated_sentence(literal);
                                                    SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                    if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                    }
                                                }
                                            }
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                                        }
                                    }
                                    result = list_utilities.delete_duplicate_forts(result);
                                }
                            } finally {
                                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cnf_variable_inter_arg_isa_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        if (NIL != list_utilities.tree_find(var, cnf, symbol_function(EQUAL), UNPROVIDED)) {
            return copy_list(cnf_variable_inter_arg_isa_constraints_int_2(var, cnf, mt));
        }
        return NIL;
    }

    public static SubLObject cnf_variable_inter_arg_isa_constraints_int_2_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnf)) && (NIL == at_vars.$at_var_isa$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject neg_lits = clauses.neg_lits(cnf);
            final SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
            final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
            try {
                at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = nconc(result, neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    cdolist_list_var = pos_lits;
                    literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != mt_designating_literalP(literal)) {
                            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                            final SubLObject mt_arg = designated_mt(literal);
                            final SubLObject subformula = designated_sentence(literal);
                            final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                result = nconc(result, formula_variable_inter_arg_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                            }
                        }
                        result = nconc(result, pos_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    result = list_utilities.delete_duplicate_forts(result);
                }
            } finally {
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject cnf_variable_inter_arg_isa_constraints_int_2(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cnf_variable_inter_arg_isa_constraints_int_2_internal(var, cnf, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2, THREE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(var, cnf, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cnf.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cnf_variable_inter_arg_isa_constraints_int_2_internal(var, cnf, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, cnf, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject cnf_variable_inter_arg_genl_constraints_int_alt(SubLObject var, SubLObject cnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnf)) && (NIL == at_vars.$at_var_genl$.getDynamicValue(thread))) {
                return NIL;
            }
            {
                SubLObject pos_lits = clauses.pos_lits(cnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject neg_lits = clauses.neg_lits(cnf);
                        SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                            try {
                                at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                    {
                                        SubLObject cdolist_list_var = neg_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = pos_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            if (NIL != mt_designating_literalP(literal)) {
                                                {
                                                    SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                    SubLObject mt_arg = designated_mt(literal);
                                                    SubLObject subformula = designated_sentence(literal);
                                                    SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                    if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_genl_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                    }
                                                }
                                            }
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                                        }
                                    }
                                    result = list_utilities.delete_duplicate_forts(result);
                                }
                            } finally {
                                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cnf_variable_inter_arg_genl_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        if (NIL != list_utilities.tree_find(var, cnf, symbol_function(EQUAL), UNPROVIDED)) {
            return copy_list(cnf_variable_inter_arg_genl_constraints_int_2(var, cnf, mt));
        }
        return NIL;
    }

    public static SubLObject cnf_variable_inter_arg_genl_constraints_int_2_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnf)) && (NIL == at_vars.$at_var_genl$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject neg_lits = clauses.neg_lits(cnf);
            final SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
            final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
            try {
                at_vars.$within_disjunctionP$.bind(makeBoolean(((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))), thread);
                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = nconc(result, neg_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    cdolist_list_var = pos_lits;
                    literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != mt_designating_literalP(literal)) {
                            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                            final SubLObject mt_arg = designated_mt(literal);
                            final SubLObject subformula = designated_sentence(literal);
                            final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                result = nconc(result, formula_variable_inter_arg_genl_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                            }
                        }
                        result = nconc(result, pos_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    result = list_utilities.delete_duplicate_forts(result);
                }
            } finally {
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject cnf_variable_inter_arg_genl_constraints_int_2(final SubLObject var, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cnf_variable_inter_arg_genl_constraints_int_2_internal(var, cnf, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2, THREE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(var, cnf, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cnf.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cnf_variable_inter_arg_genl_constraints_int_2_internal(var, cnf, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, cnf, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject cnfs_var_constraint_implications_okP_alt(SubLObject cnfs, SubLObject isa_constraints, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.at_var_types.cnf_var_constraint_implications_okP(cnf, isa_constraints, mt, varP)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject cnfs_var_constraint_implications_okP(final SubLObject cnfs, final SubLObject isa_constraints, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cnf_var_constraint_implications_okP(cnf, isa_constraints, mt, varP)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * Whether the interArgIsa constraints FROM the cnfs' variables TO fully-bound collections are ok.
     * Returns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests
     *
     * @unknown var-types-ok? checks the constraints on the variables.  var-constraint-implications-ok? checks the
    constraints from the variables to the ground terms.
     */
    @LispMethod(comment = "Whether the interArgIsa constraints FROM the cnfs\' variables TO fully-bound collections are ok.\r\nReturns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests\r\n\r\n@unknown var-types-ok? checks the constraints on the variables.  var-constraint-implications-ok? checks the\r\nconstraints from the variables to the ground terms.\nWhether the interArgIsa constraints FROM the cnfs\' variables TO fully-bound collections are ok.\nReturns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests")
    public static final SubLObject cnf_var_constraint_implications_okP_alt(SubLObject cnf, SubLObject isa_constraints, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject badP = NIL;
                if (((NIL != isa_constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) && (NIL == clause_utilities.atomic_clause_with_all_var_argsP(cnf))) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject rest = NIL;
                                    for (rest = clauses.pos_lits(cnf); !((NIL != badP) || (NIL == rest)); rest = rest.rest()) {
                                        {
                                            SubLObject asent = rest.first();
                                            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                                            SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(pred)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(pred, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(pred, UNPROVIDED))))) : NIL;
                                            {
                                                SubLObject _prev_bind_0_42 = at_vars.$at_reln$.currentBinding(thread);
                                                SubLObject _prev_bind_1_43 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                SubLObject _prev_bind_2_44 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                try {
                                                    at_vars.$at_reln$.bind(pred, thread);
                                                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                                    {
                                                        SubLObject ind_argnum = ZERO_INTEGER;
                                                        SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                                                        SubLObject rest_45 = NIL;
                                                        for (rest_45 = args; !((NIL != badP) || (NIL == rest_45)); rest_45 = rest_45.rest()) {
                                                            {
                                                                SubLObject ind_arg = rest_45.first();
                                                                ind_argnum = add(ind_argnum, ONE_INTEGER);
                                                                {
                                                                    SubLObject ind_arg_isas = list_utilities.alist_lookup(isa_constraints, ind_arg, UNPROVIDED, UNPROVIDED);
                                                                    if (NIL != ind_arg_isas) {
                                                                        {
                                                                            SubLObject dep_argnum = ZERO_INTEGER;
                                                                            SubLObject args_46 = cycl_utilities.formula_args(asent, $IGNORE);
                                                                            SubLObject rest_47 = NIL;
                                                                            for (rest_47 = args_46; !((NIL != badP) || (NIL == rest_47)); rest_47 = rest_47.rest()) {
                                                                                {
                                                                                    SubLObject dep_arg = rest_47.first();
                                                                                    dep_argnum = add(dep_argnum, ONE_INTEGER);
                                                                                    if (!ind_argnum.numE(dep_argnum)) {
                                                                                        if (NIL != groundP(dep_arg, varP)) {
                                                                                            {
                                                                                                SubLObject dep_constraints = NIL;
                                                                                                if (NIL == badP) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = ind_arg_isas;
                                                                                                        SubLObject ind_arg_isa = NIL;
                                                                                                        for (ind_arg_isa = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ind_arg_isa = csome_list_var.first()) {
                                                                                                            {
                                                                                                                SubLObject items_var = com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                                                                                if (items_var.isVector()) {
                                                                                                                    {
                                                                                                                        SubLObject vector_var = com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                                                                                        SubLObject backwardP_var = NIL;
                                                                                                                        SubLObject length = length(vector_var);
                                                                                                                        SubLObject v_iteration = NIL;
                                                                                                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                                                                            {
                                                                                                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                                                                                SubLObject item = aref(vector_var, element_num);
                                                                                                                                dep_constraints = cons(item, dep_constraints);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                                                                                        SubLObject item = NIL;
                                                                                                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                                                                            dep_constraints = cons(item, dep_constraints);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != isa.not_isa_someP(dep_arg, dep_constraints, UNPROVIDED, UNPROVIDED)) {
                                                                                                    at_utilities.note_at_violation(list($DISJOINT_ARG_ISA, dep_arg, append(dep_constraints, isa.isa(dep_arg, UNPROVIDED, UNPROVIDED)), mt));
                                                                                                    badP = T;
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
                                                } finally {
                                                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_44, thread);
                                                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_43, thread);
                                                    at_vars.$at_reln$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return makeBoolean(NIL == badP);
            }
        }
    }

    /**
     * Whether the interArgIsa constraints FROM the cnfs' variables TO fully-bound collections are ok.
     * Returns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests
     *
     * @unknown var-types-ok? checks the constraints on the variables.  var-constraint-implications-ok? checks the
    constraints from the variables to the ground terms.
     */
    @LispMethod(comment = "Whether the interArgIsa constraints FROM the cnfs\' variables TO fully-bound collections are ok.\r\nReturns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests\r\n\r\n@unknown var-types-ok? checks the constraints on the variables.  var-constraint-implications-ok? checks the\r\nconstraints from the variables to the ground terms.\nWhether the interArgIsa constraints FROM the cnfs\' variables TO fully-bound collections are ok.\nReturns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests")
    public static SubLObject cnf_var_constraint_implications_okP(final SubLObject cnf, final SubLObject isa_constraints, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = NIL;
        if (((NIL != isa_constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) && (NIL == clause_utilities.atomic_clause_with_all_var_argsP(cnf))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject rest;
                SubLObject asent;
                SubLObject pred;
                SubLObject genl_somethingP;
                SubLObject _prev_bind_0_$44;
                SubLObject _prev_bind_1_$45;
                SubLObject _prev_bind_2_$46;
                SubLObject ind_argnum;
                SubLObject args;
                SubLObject rest_$47;
                SubLObject ind_arg;
                SubLObject ind_arg_isas;
                SubLObject dep_argnum;
                SubLObject args_$48;
                SubLObject rest_$48;
                SubLObject dep_arg;
                SubLObject dep_constraints;
                SubLObject csome_list_var;
                SubLObject ind_arg_isa;
                SubLObject items_var;
                SubLObject vector_var;
                SubLObject backwardP_var;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                SubLObject cdolist_list_var;
                SubLObject item2;
                for (rest = NIL, rest = clauses.pos_lits(cnf); (NIL == badP) && (NIL != rest); rest = rest.rest()) {
                    asent = rest.first();
                    pred = cycl_utilities.atomic_sentence_predicate(asent);
                    genl_somethingP = (NIL != forts.fort_p(pred)) ? makeBoolean((NIL != genl_predicates.genl_predicates(pred, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(pred, UNPROVIDED, UNPROVIDED))) : NIL;
                    _prev_bind_0_$44 = at_vars.$at_reln$.currentBinding(thread);
                    _prev_bind_1_$45 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                    _prev_bind_2_$46 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                    try {
                        at_vars.$at_reln$.bind(pred, thread);
                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                        ind_argnum = ZERO_INTEGER;
                        args = cycl_utilities.formula_args(asent, $IGNORE);
                        for (rest_$47 = NIL, rest_$47 = args; (NIL == badP) && (NIL != rest_$47); rest_$47 = rest_$47.rest()) {
                            ind_arg = rest_$47.first();
                            ind_argnum = add(ind_argnum, ONE_INTEGER);
                            ind_arg_isas = list_utilities.alist_lookup(isa_constraints, ind_arg, UNPROVIDED, UNPROVIDED);
                            if (NIL != ind_arg_isas) {
                                dep_argnum = ZERO_INTEGER;
                                args_$48 = cycl_utilities.formula_args(asent, $IGNORE);
                                for (rest_$48 = NIL, rest_$48 = args_$48; (NIL == badP) && (NIL != rest_$48); rest_$48 = rest_$48.rest()) {
                                    dep_arg = rest_$48.first();
                                    dep_argnum = add(dep_argnum, ONE_INTEGER);
                                    if ((!ind_argnum.numE(dep_argnum)) && (NIL != groundP(dep_arg, varP))) {
                                        dep_constraints = NIL;
                                        if (NIL == badP) {
                                            csome_list_var = ind_arg_isas;
                                            ind_arg_isa = NIL;
                                            ind_arg_isa = csome_list_var.first();
                                            while ((NIL == badP) && (NIL != csome_list_var)) {
                                                items_var = inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                if (items_var.isVector()) {
                                                    vector_var = items_var;
                                                    backwardP_var = NIL;
                                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                        item = aref(vector_var, element_num);
                                                        dep_constraints = cons(item, dep_constraints);
                                                    }
                                                } else {
                                                    cdolist_list_var = items_var;
                                                    item2 = NIL;
                                                    item2 = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        dep_constraints = cons(item2, dep_constraints);
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        item2 = cdolist_list_var.first();
                                                    } 
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                ind_arg_isa = csome_list_var.first();
                                            } 
                                        }
                                        if (NIL != isa.not_isa_someP(dep_arg, dep_constraints, UNPROVIDED, UNPROVIDED)) {
                                            at_utilities.note_at_violation(list($DISJOINT_ARG_ISA, dep_arg, append(dep_constraints, isa.isa(dep_arg, UNPROVIDED, UNPROVIDED)), mt));
                                            badP = T;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$46, thread);
                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$45, thread);
                        at_vars.$at_reln$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(NIL == badP);
    }

    /**
     *
     *
     * @return el-formula; a literal or a disjunction of formulas
    (e.g., literals or conjunctions of literals) that describe
    the arg constraints imposed on variables in DNF
     */
    @LispMethod(comment = "@return el-formula; a literal or a disjunction of formulas\r\n(e.g., literals or conjunctions of literals) that describe\r\nthe arg constraints imposed on variables in DNF")
    public static final SubLObject dnfs_variables_arg_constraints_alt(SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                {
                    SubLObject var = com.cyc.cycjava.cycl.at_var_types.dnf_variables_arg_constraints(dnf, mt, varP);
                    if (NIL != var) {
                        result = cons(var, result);
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.simplify_cycl_disjunction(simplifier.disjoin(nreverse(result), UNPROVIDED), varP);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a disjunction of formulas
    (e.g., literals or conjunctions of literals) that describe
    the arg constraints imposed on variables in DNF
     */
    @LispMethod(comment = "@return el-formula; a literal or a disjunction of formulas\r\n(e.g., literals or conjunctions of literals) that describe\r\nthe arg constraints imposed on variables in DNF")
    public static SubLObject dnfs_variables_arg_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = dnf_variables_arg_constraints(dnf, mt, varP);
            if (NIL != var) {
                result = cons(var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.simplify_cycl_disjunction(simplifier.disjoin(nreverse(result), UNPROVIDED), varP);
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in DNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in DNFS")
    public static final SubLObject inter_dnfs_variables_arg_constraints_alt(SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject vars = nreverse(list_utilities.tree_gather(dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject isa_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
            SubLObject genls_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = dnfs;
                SubLObject dnf = NIL;
                for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_48 = com.cyc.cycjava.cycl.at_var_types.dnf_variables_isa_constraints(dnf, mt, varP);
                        SubLObject var_isa_constraints = NIL;
                        for (var_isa_constraints = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest() , var_isa_constraints = cdolist_list_var_48.first()) {
                            {
                                SubLObject var = var_isa_constraints.first();
                                SubLObject isa_constraints = var_isa_constraints.rest();
                                sethash(var, isa_table, append(isa_constraints, gethash(var, isa_table, UNPROVIDED)));
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var_49 = com.cyc.cycjava.cycl.at_var_types.dnf_variables_genl_constraints(dnf, mt, varP);
                        SubLObject var_genl_constraints = NIL;
                        for (var_genl_constraints = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , var_genl_constraints = cdolist_list_var_49.first()) {
                            {
                                SubLObject var = var_genl_constraints.first();
                                SubLObject genls_constraints = var_genl_constraints.rest();
                                sethash(var, genls_table, append(genls_constraints, gethash(var, genls_table, UNPROVIDED)));
                            }
                        }
                    }
                }
            }
            {
                SubLObject var = NIL;
                SubLObject isa_constraints = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(isa_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            var = getEntryKey(cdohash_entry);
                            isa_constraints = getEntryValue(cdohash_entry);
                            {
                                SubLObject cdolist_list_var = genls.max_cols(remove_duplicates(isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
                                SubLObject v_isa = NIL;
                                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                    result = cons(make_binary_formula($$isa, var, v_isa), result);
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            {
                SubLObject var = NIL;
                SubLObject genls_constraints = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(genls_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            var = getEntryKey(cdohash_entry);
                            genls_constraints = getEntryValue(cdohash_entry);
                            {
                                SubLObject cdolist_list_var = genls.max_cols(remove_duplicates(genls_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
                                SubLObject genl = NIL;
                                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                    result = cons(make_binary_formula($$genls, var, genl), result);
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(result), UNPROVIDED), varP);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in DNFS
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in DNFS")
    public static SubLObject inter_dnfs_variables_arg_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        final SubLObject vars = nreverse(list_utilities.tree_gather(dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject isa_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
        final SubLObject genls_table = make_hash_table(length(vars), UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$50 = dnf_variables_isa_constraints(dnf, mt, varP);
            SubLObject var_isa_constraints = NIL;
            var_isa_constraints = cdolist_list_var_$50.first();
            while (NIL != cdolist_list_var_$50) {
                final SubLObject var = var_isa_constraints.first();
                final SubLObject isa_constraints = var_isa_constraints.rest();
                sethash(var, isa_table, append(isa_constraints, gethash(var, isa_table, UNPROVIDED)));
                cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                var_isa_constraints = cdolist_list_var_$50.first();
            } 
            SubLObject cdolist_list_var_$51 = dnf_variables_genl_constraints(dnf, mt, varP);
            SubLObject var_genl_constraints = NIL;
            var_genl_constraints = cdolist_list_var_$51.first();
            while (NIL != cdolist_list_var_$51) {
                final SubLObject var = var_genl_constraints.first();
                final SubLObject genls_constraints = var_genl_constraints.rest();
                sethash(var, genls_table, append(genls_constraints, gethash(var, genls_table, UNPROVIDED)));
                cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                var_genl_constraints = cdolist_list_var_$51.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        SubLObject var2 = NIL;
        SubLObject isa_constraints2 = NIL;
        Iterator cdohash_iterator = getEntrySetIterator(isa_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                var2 = getEntryKey(cdohash_entry);
                isa_constraints2 = getEntryValue(cdohash_entry);
                SubLObject cdolist_list_var2 = genls.max_cols(remove_duplicates(isa_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    result = cons(make_binary_formula($$isa, var2, v_isa), result);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    v_isa = cdolist_list_var2.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        var2 = NIL;
        SubLObject genls_constraints2 = NIL;
        cdohash_iterator = getEntrySetIterator(genls_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                var2 = getEntryKey(cdohash_entry);
                genls_constraints2 = getEntryValue(cdohash_entry);
                SubLObject cdolist_list_var2 = genls.max_cols(remove_duplicates(genls_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
                SubLObject genl = NIL;
                genl = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    result = cons(make_binary_formula($$genls, var2, genl), result);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    genl = cdolist_list_var2.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.simplify_cycl_conjunction(simplifier.conjoin(nreverse(result), UNPROVIDED), varP);
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in DNF
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in DNF")
    public static final SubLObject dnf_variables_arg_constraints_alt(SubLObject dnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.dnf_variables_isa_constraints(dnf, mt, varP);
                SubLObject var_isa_constraints = NIL;
                for (var_isa_constraints = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_isa_constraints = cdolist_list_var.first()) {
                    {
                        SubLObject var = var_isa_constraints.first();
                        SubLObject isa_constraints = var_isa_constraints.rest();
                        SubLObject cdolist_list_var_50 = reverse(isa_constraints);
                        SubLObject v_isa = NIL;
                        for (v_isa = cdolist_list_var_50.first(); NIL != cdolist_list_var_50; cdolist_list_var_50 = cdolist_list_var_50.rest() , v_isa = cdolist_list_var_50.first()) {
                            result = cons(make_binary_formula($$isa, var, v_isa), result);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.at_var_types.dnf_variables_genl_constraints(dnf, mt, varP);
                SubLObject var_genl_constraints = NIL;
                for (var_genl_constraints = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var_genl_constraints = cdolist_list_var.first()) {
                    {
                        SubLObject var = var_genl_constraints.first();
                        SubLObject genl_constraints = var_genl_constraints.rest();
                        SubLObject cdolist_list_var_51 = reverse(genl_constraints);
                        SubLObject genl = NIL;
                        for (genl = cdolist_list_var_51.first(); NIL != cdolist_list_var_51; cdolist_list_var_51 = cdolist_list_var_51.rest() , genl = cdolist_list_var_51.first()) {
                            result = cons(make_binary_formula($$genls, var, genl), result);
                        }
                    }
                }
            }
            if (NIL == result) {
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    return simplifier.conjoin(nreverse(result), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-formula; a literal or a conjunction of literals that describe
    the arg constraints imposed on variables in DNF
     */
    @LispMethod(comment = "@return el-formula; a literal or a conjunction of literals that describe\r\nthe arg constraints imposed on variables in DNF")
    public static SubLObject dnf_variables_arg_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dnf_variables_isa_constraints(dnf, mt, varP);
        SubLObject var_isa_constraints = NIL;
        var_isa_constraints = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = var_isa_constraints.first();
            final SubLObject isa_constraints = var_isa_constraints.rest();
            SubLObject cdolist_list_var_$52 = reverse(isa_constraints);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var_$52.first();
            while (NIL != cdolist_list_var_$52) {
                result = cons(make_binary_formula($$isa, var, v_isa), result);
                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                v_isa = cdolist_list_var_$52.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var_isa_constraints = cdolist_list_var.first();
        } 
        cdolist_list_var = dnf_variables_genl_constraints(dnf, mt, varP);
        SubLObject var_genl_constraints = NIL;
        var_genl_constraints = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = var_genl_constraints.first();
            final SubLObject genl_constraints = var_genl_constraints.rest();
            SubLObject cdolist_list_var_$53 = reverse(genl_constraints);
            SubLObject genl = NIL;
            genl = cdolist_list_var_$53.first();
            while (NIL != cdolist_list_var_$53) {
                result = cons(make_binary_formula($$genls, var, genl), result);
                cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                genl = cdolist_list_var_$53.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var_genl_constraints = cdolist_list_var.first();
        } 
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.conjoin(nreverse(result), UNPROVIDED);
    }

    public static final SubLObject dnfs_variables_arg_constraints_okP_alt(SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.dnfs_variables_isa_constraints(dnfs, mt, varP), $ISA, mt)) && (NIL != com.cyc.cycjava.cycl.at_var_types.var_types_okP(com.cyc.cycjava.cycl.at_var_types.dnfs_variables_genl_constraints(dnfs, mt, varP), $GENLS, mt)));
    }

    public static SubLObject dnfs_variables_arg_constraints_okP(final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return makeBoolean((NIL != var_types_okP(dnfs_variables_isa_constraints(dnfs, mt, varP), $ISA, mt)) && (NIL != var_types_okP(dnfs_variables_genl_constraints(dnfs, mt, varP), $GENLS, mt)));
    }

    public static final SubLObject dnfs_variables_isa_constraints_alt(SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject constraints = NIL;
                SubLObject vars = nreverse(list_utilities.tree_gather(dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_isa_constraints(var, dnfs, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                }
                if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_inter_arg_isa_constraints(var, dnfs, constraints, mt), mt);
                                result = cons(cons(var, cols), result);
                            }
                        }
                    }
                } else {
                    result = constraints;
                }
                return result;
            }
        }
    }

    public static SubLObject dnfs_variables_isa_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(dnfs_variable_isa_constraints(var, dnfs, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
            cdolist_list_var = vars;
            var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cols = at_min_cols(dnfs_variable_inter_arg_isa_constraints(var, dnfs, constraints, mt), mt);
                result = cons(cons(var, cols), result);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            result = constraints;
        }
        return result;
    }

    public static final SubLObject dnfs_variables_genl_constraints_alt(SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject constraints = NIL;
                SubLObject vars = nreverse(list_utilities.tree_gather(dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_genl_constraints(var, dnfs, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                }
                if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_inter_arg_genl_constraints(var, dnfs, constraints, mt), mt);
                                result = cons(cons(var, cols), result);
                            }
                        }
                    }
                } else {
                    result = constraints;
                }
                return result;
            }
        }
    }

    public static SubLObject dnfs_variables_genl_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(dnfs_variable_genl_constraints(var, dnfs, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
            cdolist_list_var = vars;
            var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cols = at_min_cols(dnfs_variable_inter_arg_genl_constraints(var, dnfs, constraints, mt), mt);
                result = cons(cons(var, cols), result);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            result = constraints;
        }
        return result;
    }

    /**
     *
     *
     * @return a list of tuples of the form (VAR MT COLLECTIONS), where VAR is constrained to be all of COLLECTIONS in MT.
     */
    @LispMethod(comment = "@return a list of tuples of the form (VAR MT COLLECTIONS), where VAR is constrained to be all of COLLECTIONS in MT.")
    public static final SubLObject contextualized_dnf_variables_isa_constraint_tuples_alt(SubLObject dnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        {
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            SubLObject vars = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                {
                    SubLObject tuples = com.cyc.cycjava.cycl.at_var_types.contextualized_dnf_variable_isa_constraint_tuples(var, dnf);
                    SubLObject items_var = tuples;
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var = tuples;
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject item = aref(vector_var, element_num);
                                    constraints = cons(item, constraints);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var_52 = tuples;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , item = cdolist_list_var_52.first()) {
                                constraints = cons(item, constraints);
                            }
                        }
                    }
                }
            }
            result = constraints;
            return result;
        }
    }

    /**
     *
     *
     * @return a list of tuples of the form (VAR MT COLLECTIONS), where VAR is constrained to be all of COLLECTIONS in MT.
     */
    @LispMethod(comment = "@return a list of tuples of the form (VAR MT COLLECTIONS), where VAR is constrained to be all of COLLECTIONS in MT.")
    public static SubLObject contextualized_dnf_variables_isa_constraint_tuples(final SubLObject dnf, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var;
            final SubLObject tuples = items_var = contextualized_dnf_variable_isa_constraint_tuples(var, dnf);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    constraints = cons(item, constraints);
                }
            } else {
                SubLObject cdolist_list_var_$54 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$54.first();
                while (NIL != cdolist_list_var_$54) {
                    constraints = cons(item2, constraints);
                    cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                    item2 = cdolist_list_var_$54.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        result = constraints;
        return result;
    }

    public static final SubLObject var_isa_constraints_wrt_dnfs_alt(SubLObject var, SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, com.cyc.cycjava.cycl.at_var_types.dnfs_variables_isa_constraints(dnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject var_isa_constraints_wrt_dnfs(final SubLObject var, final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, dnfs_variables_isa_constraints(dnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject var_genl_constraints_wrt_dnfs_alt(SubLObject var, SubLObject dnfs, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, com.cyc.cycjava.cycl.at_var_types.dnfs_variables_genl_constraints(dnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject var_genl_constraints_wrt_dnfs(final SubLObject var, final SubLObject dnfs, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym2$CYC_VAR_;
        }
        return assoc(var, dnfs_variables_genl_constraints(dnfs, mt, varP), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject dnfs_variable_isa_constraints_alt(SubLObject var, SubLObject dnfs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_isa_constraints(var, dnf, mt));
            }
            result = list_utilities.delete_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject dnfs_variable_isa_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, dnf_variable_isa_constraints(var, dnf, mt));
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnfs_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject dnfs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_quoted_isa_constraints(var, dnf, mt));
            }
            result = list_utilities.delete_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject dnfs_variable_quoted_isa_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, dnf_variable_quoted_isa_constraints(var, dnf, mt));
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnfs_variable_genl_constraints_alt(SubLObject var, SubLObject dnfs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_genl_constraints(var, dnf, mt));
            }
            result = list_utilities.delete_duplicate_forts(result);
            return result;
        }
    }

    public static SubLObject dnfs_variable_genl_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, dnf_variable_genl_constraints(var, dnf, mt));
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnf_variables_isa_constraints_alt(SubLObject dnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject constraints = NIL;
                SubLObject vars = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnf_variable_isa_constraints(var, dnf, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                }
                if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnf_variable_inter_arg_isa_constraints(var, dnf, constraints, mt), mt);
                                result = cons(cons(var, cols), result);
                            }
                        }
                    }
                } else {
                    result = constraints;
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variables_isa_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(dnf_variable_isa_constraints(var, dnf, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
            cdolist_list_var = vars;
            var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cols = at_min_cols(dnf_variable_inter_arg_isa_constraints(var, dnf, constraints, mt), mt);
                result = cons(cons(var, cols), result);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            result = constraints;
        }
        return result;
    }

    public static final SubLObject dnf_variables_quoted_isa_constraints_alt(SubLObject dnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            SubLObject vars = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                {
                    SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnf_variable_quoted_isa_constraints(var, dnf, mt), mt);
                    constraints = cons(cons(var, cols), constraints);
                }
            }
            result = constraints;
            return result;
        }
    }

    public static SubLObject dnf_variables_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(dnf_variable_quoted_isa_constraints(var, dnf, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        result = constraints;
        return result;
    }

    public static final SubLObject dnf_variables_genl_constraints_alt(SubLObject dnf, SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject constraints = NIL;
                SubLObject vars = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                        {
                            SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnf_variable_genl_constraints(var, dnf, mt), mt);
                            constraints = cons(cons(var, cols), constraints);
                        }
                    }
                }
                if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = vars;
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            {
                                SubLObject cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnf_variable_inter_arg_genl_constraints(var, dnf, constraints, mt), mt);
                                result = cons(cons(var, cols), result);
                            }
                        }
                    }
                } else {
                    result = constraints;
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variables_genl_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject vars = cdolist_list_var = nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cols = at_min_cols(dnf_variable_genl_constraints(var, dnf, mt), mt);
            constraints = cons(cons(var, cols), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if ((NIL != constraints) && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))) {
            cdolist_list_var = vars;
            var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cols = at_min_cols(dnf_variable_inter_arg_genl_constraints(var, dnf, constraints, mt), mt);
                result = cons(cons(var, cols), result);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            result = constraints;
        }
        return result;
    }

    public static final SubLObject dnf_variable_isa_constraints_alt(SubLObject var, SubLObject dnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(dnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(dnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_53 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_neg_lit_variable_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        {
                                                            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                            SubLObject mt_arg = designated_mt(literal);
                                                            SubLObject subformula = designated_sentence(literal);
                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                            }
                                                        }
                                                    }
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_pos_lit_variable_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            if (NIL != find_if($sym30$ISA_VAR_VAR_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                {
                                                    SubLObject cdolist_list_var = list_utilities.remove_if_not($sym30$ISA_VAR_VAR_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject isa_x_y_asent = NIL;
                                                    for (isa_x_y_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_x_y_asent = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject ins_var = cycl_utilities.atomic_sentence_arg1(isa_x_y_asent, UNPROVIDED);
                                                            if (var == ins_var) {
                                                                {
                                                                    SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2(isa_x_y_asent, UNPROVIDED);
                                                                    SubLObject cdolist_list_var_54 = pos_lits;
                                                                    SubLObject genls_asent = NIL;
                                                                    for (genls_asent = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest() , genls_asent = cdolist_list_var_54.first()) {
                                                                        if (NIL != genls_litP(genls_asent)) {
                                                                            {
                                                                                SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1(genls_asent, UNPROVIDED);
                                                                                if (isa_col_var == genls_col_var) {
                                                                                    {
                                                                                        SubLObject col = cycl_utilities.atomic_sentence_arg2(genls_asent, UNPROVIDED);
                                                                                        if (NIL != forts.fort_p(col)) {
                                                                                            result = cons(col, result);
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
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_isa_constraints(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        if (NIL != cycl_utilities.expression_find(var, dnf, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return copy_list(dnf_variable_isa_constraints_int(var, dnf, mt));
        }
        return NIL;
    }

    public static SubLObject dnf_variable_isa_constraints_int_internal(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(dnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = nconc(result, dnf_neg_lit_variable_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != mt_designating_literalP(literal)) {
                                final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                final SubLObject mt_arg = designated_mt(literal);
                                final SubLObject subformula = designated_sentence(literal);
                                final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                    result = nconc(result, formula_variable_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                }
                            }
                            result = nconc(result, dnf_pos_lit_variable_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        if (NIL != find_if($sym38$ISA_VAR_VAR_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            cdolist_list_var = list_utilities.remove_if_not($sym38$ISA_VAR_VAR_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject isa_x_y_asent = NIL;
                            isa_x_y_asent = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject ins_var = cycl_utilities.atomic_sentence_arg1(isa_x_y_asent, UNPROVIDED);
                                if (var.eql(ins_var)) {
                                    final SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2(isa_x_y_asent, UNPROVIDED);
                                    SubLObject cdolist_list_var_$56 = pos_lits;
                                    SubLObject genls_asent = NIL;
                                    genls_asent = cdolist_list_var_$56.first();
                                    while (NIL != cdolist_list_var_$56) {
                                        if (NIL != genls_litP(genls_asent)) {
                                            final SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1(genls_asent, UNPROVIDED);
                                            if (isa_col_var.eql(genls_col_var)) {
                                                final SubLObject col = cycl_utilities.atomic_sentence_arg2(genls_asent, UNPROVIDED);
                                                if (NIL != forts.fort_p(col)) {
                                                    result = cons(col, result);
                                                }
                                            }
                                        }
                                        cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                                        genls_asent = cdolist_list_var_$56.first();
                                    } 
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                isa_x_y_asent = cdolist_list_var.first();
                            } 
                        }
                        result = list_utilities.delete_duplicate_forts(result);
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$55, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject dnf_variable_isa_constraints_int(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return dnf_variable_isa_constraints_int_internal(var, dnf, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DNF_VARIABLE_ISA_CONSTRAINTS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DNF_VARIABLE_ISA_CONSTRAINTS_INT, THREE_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DNF_VARIABLE_ISA_CONSTRAINTS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(var, dnf, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (dnf.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(dnf_variable_isa_constraints_int_internal(var, dnf, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, dnf, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Based on @xref dnf-variable-isa-constraints
     */
    @LispMethod(comment = "Based on @xref dnf-variable-isa-constraints")
    public static final SubLObject contextualized_dnf_variable_isa_constraint_tuples_alt(SubLObject var, SubLObject contextualized_dnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(contextualized_dnf);
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(contextualized_dnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(contextualized_dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject contextualized_literal = NIL;
                                                for (contextualized_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_literal = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = contextualized_literal;
                                                        SubLObject current = datum;
                                                        SubLObject mt = NIL;
                                                        SubLObject asent = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt31);
                                                        mt = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt31);
                                                        asent = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            {
                                                                SubLObject cdolist_list_var_56 = com.cyc.cycjava.cycl.at_var_types.dnf_neg_lit_variable_isa_constraints(var, asent, mt);
                                                                SubLObject col = NIL;
                                                                for (col = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , col = cdolist_list_var_56.first()) {
                                                                    dictionary_utilities.dictionary_push(dict, mt, col);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt31);
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject contextualized_literal = NIL;
                                                for (contextualized_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_literal = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject datum = contextualized_literal;
                                                        SubLObject current = datum;
                                                        SubLObject mt = NIL;
                                                        SubLObject asent = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt31);
                                                        mt = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list_alt31);
                                                        asent = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            {
                                                                SubLObject cdolist_list_var_57 = com.cyc.cycjava.cycl.at_var_types.dnf_pos_lit_variable_isa_constraints(var, asent, mt);
                                                                SubLObject col = NIL;
                                                                for (col = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , col = cdolist_list_var_57.first()) {
                                                                    dictionary_utilities.dictionary_push(dict, mt, col);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list_alt31);
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL != find_if($sym32$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                {
                                                    SubLObject cdolist_list_var = list_utilities.remove_if_not($sym32$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject isa_x_y_contextualized_asent = NIL;
                                                    for (isa_x_y_contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_x_y_contextualized_asent = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject datum = isa_x_y_contextualized_asent;
                                                            SubLObject current = datum;
                                                            SubLObject isa_mt = NIL;
                                                            SubLObject isa_x_y_asent = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt33);
                                                            isa_mt = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt33);
                                                            isa_x_y_asent = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject ins_var = cycl_utilities.atomic_sentence_arg1(isa_x_y_asent, UNPROVIDED);
                                                                    if (var == ins_var) {
                                                                        {
                                                                            SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2(isa_x_y_asent, UNPROVIDED);
                                                                            SubLObject cdolist_list_var_58 = pos_lits;
                                                                            SubLObject contextualized_literal = NIL;
                                                                            for (contextualized_literal = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , contextualized_literal = cdolist_list_var_58.first()) {
                                                                                {
                                                                                    SubLObject datum_59 = contextualized_literal;
                                                                                    SubLObject current_60 = datum_59;
                                                                                    SubLObject genls_mt = NIL;
                                                                                    SubLObject genls_asent = NIL;
                                                                                    destructuring_bind_must_consp(current_60, datum_59, $list_alt34);
                                                                                    genls_mt = current_60.first();
                                                                                    current_60 = current_60.rest();
                                                                                    destructuring_bind_must_consp(current_60, datum_59, $list_alt34);
                                                                                    genls_asent = current_60.first();
                                                                                    current_60 = current_60.rest();
                                                                                    if (NIL == current_60) {
                                                                                        if (NIL != genls_litP(genls_asent)) {
                                                                                            {
                                                                                                SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1(genls_asent, UNPROVIDED);
                                                                                                if (isa_col_var == genls_col_var) {
                                                                                                    if (NIL != hlmt.hlmt_equalP(isa_mt, genls_mt)) {
                                                                                                        {
                                                                                                            SubLObject col = cycl_utilities.atomic_sentence_arg2(genls_asent, UNPROVIDED);
                                                                                                            if (NIL != forts.fort_p(col)) {
                                                                                                                dictionary_utilities.dictionary_push(dict, isa_mt, col);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum_59, $list_alt34);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt33);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject result = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject cols = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject minimized_cols = com.cyc.cycjava.cycl.at_var_types.at_min_cols(cols, mt);
                                result = cons(list(var, mt, minimized_cols), result);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return result;
                }
            }
        }
    }

    /**
     * Based on @xref dnf-variable-isa-constraints
     */
    @LispMethod(comment = "Based on @xref dnf-variable-isa-constraints")
    public static SubLObject contextualized_dnf_variable_isa_constraint_tuples(final SubLObject var, final SubLObject contextualized_dnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(contextualized_dnf);
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(contextualized_dnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(contextualized_dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$57 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject contextualized_literal = NIL;
                        contextualized_literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_literal;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list39);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list39);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                SubLObject cdolist_list_var_$58 = dnf_neg_lit_variable_isa_constraints(var, asent, mt);
                                SubLObject col = NIL;
                                col = cdolist_list_var_$58.first();
                                while (NIL != cdolist_list_var_$58) {
                                    dictionary_utilities.dictionary_push(dict, mt, col);
                                    cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                    col = cdolist_list_var_$58.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum, $list39);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            contextualized_literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        contextualized_literal = NIL;
                        contextualized_literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = contextualized_literal;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list39);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list39);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                SubLObject cdolist_list_var_$59 = dnf_pos_lit_variable_isa_constraints(var, asent, mt);
                                SubLObject col = NIL;
                                col = cdolist_list_var_$59.first();
                                while (NIL != cdolist_list_var_$59) {
                                    dictionary_utilities.dictionary_push(dict, mt, col);
                                    cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                                    col = cdolist_list_var_$59.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum, $list39);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            contextualized_literal = cdolist_list_var.first();
                        } 
                        if (NIL != find_if($sym40$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            cdolist_list_var = list_utilities.remove_if_not($sym40$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject isa_x_y_contextualized_asent = NIL;
                            isa_x_y_contextualized_asent = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = isa_x_y_contextualized_asent;
                                SubLObject isa_mt = NIL;
                                SubLObject isa_x_y_asent = NIL;
                                destructuring_bind_must_consp(current, datum, $list41);
                                isa_mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list41);
                                isa_x_y_asent = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject ins_var = cycl_utilities.atomic_sentence_arg1(isa_x_y_asent, UNPROVIDED);
                                    if (var.eql(ins_var)) {
                                        final SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2(isa_x_y_asent, UNPROVIDED);
                                        SubLObject cdolist_list_var_$60 = pos_lits;
                                        SubLObject contextualized_literal2 = NIL;
                                        contextualized_literal2 = cdolist_list_var_$60.first();
                                        while (NIL != cdolist_list_var_$60) {
                                            SubLObject current_$62;
                                            final SubLObject datum_$61 = current_$62 = contextualized_literal2;
                                            SubLObject genls_mt = NIL;
                                            SubLObject genls_asent = NIL;
                                            destructuring_bind_must_consp(current_$62, datum_$61, $list42);
                                            genls_mt = current_$62.first();
                                            current_$62 = current_$62.rest();
                                            destructuring_bind_must_consp(current_$62, datum_$61, $list42);
                                            genls_asent = current_$62.first();
                                            current_$62 = current_$62.rest();
                                            if (NIL == current_$62) {
                                                if (NIL != genls_litP(genls_asent)) {
                                                    final SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1(genls_asent, UNPROVIDED);
                                                    if (isa_col_var.eql(genls_col_var) && (NIL != hlmt.hlmt_equalP(isa_mt, genls_mt))) {
                                                        final SubLObject col2 = cycl_utilities.atomic_sentence_arg2(genls_asent, UNPROVIDED);
                                                        if (NIL != forts.fort_p(col2)) {
                                                            dictionary_utilities.dictionary_push(dict, isa_mt, col2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum_$61, $list42);
                                            }
                                            cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                                            contextualized_literal2 = cdolist_list_var_$60.first();
                                        } 
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list41);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                isa_x_y_contextualized_asent = cdolist_list_var.first();
                            } 
                        }
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$57, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cols = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject minimized_cols = at_min_cols(cols, mt2);
            result = cons(list(var, mt2, minimized_cols), result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static final SubLObject contextualized_isa_x_y_litP_alt(SubLObject v_object) {
        if (NIL != inference_datastructures_problem_query.hl_contextualized_asent_p(v_object)) {
            {
                SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(v_object);
                return isa_hl_var_hl_var_litP(asent);
            }
        }
        return NIL;
    }

    public static SubLObject contextualized_isa_x_y_litP(final SubLObject v_object) {
        if (NIL != inference_datastructures_problem_query.hl_contextualized_asent_p(v_object)) {
            final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(v_object);
            return isa_hl_var_hl_var_litP(asent);
        }
        return NIL;
    }

    public static final SubLObject dnf_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject dnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(dnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(dnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_61 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_neg_lit_variable_quoted_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        {
                                                            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                            SubLObject mt_arg = designated_mt(literal);
                                                            SubLObject subformula = designated_sentence(literal);
                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_quoted_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                            }
                                                        }
                                                    }
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_pos_lit_variable_quoted_isa_constraints(var, literal, mt));
                                                }
                                            }
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_61, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_quoted_isa_constraints(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(dnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = nconc(result, dnf_neg_lit_variable_quoted_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != mt_designating_literalP(literal)) {
                                final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                final SubLObject mt_arg = designated_mt(literal);
                                final SubLObject subformula = designated_sentence(literal);
                                final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                    result = nconc(result, formula_variable_quoted_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                }
                            }
                            result = nconc(result, dnf_pos_lit_variable_quoted_isa_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        result = list_utilities.delete_duplicate_forts(result);
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$63, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject dnf_variable_genl_constraints_alt(SubLObject var, SubLObject dnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(dnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind(var, thread);
                            {
                                SubLObject neg_lits = clauses.neg_lits(dnf);
                                SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_62 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                    try {
                                        at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                                        if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                            {
                                                SubLObject cdolist_list_var = neg_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_neg_lit_variable_genl_constraints(var, literal, mt));
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = pos_lits;
                                                SubLObject literal = NIL;
                                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        {
                                                            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                            SubLObject mt_arg = designated_mt(literal);
                                                            SubLObject subformula = designated_sentence(literal);
                                                            SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_genl_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, mt)));
                                                            }
                                                        }
                                                    }
                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_pos_lit_variable_genl_constraints(var, literal, mt));
                                                }
                                            }
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$within_disjunctionP$.rebind(_prev_bind_0_62, thread);
                                    }
                                }
                            }
                        } finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_genl_constraints(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
                at_vars.$at_arg$.bind(var, thread);
                final SubLObject neg_lits = clauses.neg_lits(dnf);
                final SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = at_vars.$within_disjunctionP$.currentBinding(thread);
                try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                    if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = nconc(result, dnf_neg_lit_variable_genl_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        cdolist_list_var = pos_lits;
                        literal = NIL;
                        literal = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != mt_designating_literalP(literal)) {
                                final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                final SubLObject mt_arg = designated_mt(literal);
                                final SubLObject subformula = designated_sentence(literal);
                                final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                    result = nconc(result, formula_variable_genl_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, mt)));
                                }
                            }
                            result = nconc(result, dnf_pos_lit_variable_genl_constraints(var, literal, mt));
                            cdolist_list_var = cdolist_list_var.rest();
                            literal = cdolist_list_var.first();
                        } 
                        result = list_utilities.delete_duplicate_forts(result);
                    }
                } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$64, thread);
                }
            } finally {
                at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject dnfs_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject dnfs, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_isa$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_isa$.bind(constraints, thread);
                        {
                            SubLObject cdolist_list_var = dnfs;
                            SubLObject dnf = NIL;
                            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_inter_arg_isa_constraints_int(var, dnf, mt));
                            }
                        }
                    } finally {
                        at_vars.$at_var_isa$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject dnfs_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_isa$.bind(constraints, thread);
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            dnf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nconc(result, dnf_variable_inter_arg_isa_constraints_int(var, dnf, mt));
                cdolist_list_var = cdolist_list_var.rest();
                dnf = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$at_var_isa$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnfs_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject dnfs, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_genl$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_genl$.bind(constraints, thread);
                        {
                            SubLObject cdolist_list_var = dnfs;
                            SubLObject dnf = NIL;
                            for (dnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf = cdolist_list_var.first()) {
                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_inter_arg_genl_constraints_int(var, dnf, mt));
                            }
                        }
                    } finally {
                        at_vars.$at_var_genl$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject dnfs_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_genl$.bind(constraints, thread);
            SubLObject cdolist_list_var = dnfs;
            SubLObject dnf = NIL;
            dnf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = nconc(result, dnf_variable_inter_arg_genl_constraints_int(var, dnf, mt));
                cdolist_list_var = cdolist_list_var.rest();
                dnf = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$at_var_genl$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnf_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject dnf, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_isa$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_isa$.bind(constraints, thread);
                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_inter_arg_isa_constraints_int(var, dnf, mt));
                    } finally {
                        at_vars.$at_var_isa$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject dnf, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_isa$.bind(constraints, thread);
            result = nconc(result, dnf_variable_inter_arg_isa_constraints_int(var, dnf, mt));
        } finally {
            at_vars.$at_var_isa$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnf_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject dnf, SubLObject constraints, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
                {
                    SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_var_genl$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(var, thread);
                        at_vars.$at_var_genl$.bind(constraints, thread);
                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.dnf_variable_inter_arg_genl_constraints_int(var, dnf, mt));
                    } finally {
                        at_vars.$at_var_genl$.rebind(_prev_bind_1, thread);
                        at_vars.$at_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject dnf, final SubLObject constraints, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding(thread);
        try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_genl$.bind(constraints, thread);
            result = nconc(result, dnf_variable_inter_arg_genl_constraints_int(var, dnf, mt));
        } finally {
            at_vars.$at_var_genl$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject dnf_variable_inter_arg_isa_constraints_int_alt(SubLObject var, SubLObject dnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(dnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject neg_lits = clauses.neg_lits(dnf);
                        SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                            try {
                                at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                    {
                                        SubLObject cdolist_list_var = neg_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = pos_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            if (NIL != mt_designating_literalP(literal)) {
                                                {
                                                    SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                    SubLObject mt_arg = designated_mt(literal);
                                                    SubLObject subformula = designated_sentence(literal);
                                                    SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                    if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                    }
                                                }
                                            }
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                                        }
                                    }
                                    result = list_utilities.delete_duplicate_forts(result);
                                }
                            } finally {
                                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_inter_arg_isa_constraints_int(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject neg_lits = clauses.neg_lits(dnf);
            final SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
            final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
            try {
                at_vars.$within_disjunctionP$.bind(makeBoolean(((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))) || (NIL != at_vars.$within_disjunctionP$.getDynamicValue(thread))), thread);
                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = nconc(result, neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    cdolist_list_var = pos_lits;
                    literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != mt_designating_literalP(literal)) {
                            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                            final SubLObject mt_arg = designated_mt(literal);
                            final SubLObject subformula = designated_sentence(literal);
                            final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                result = nconc(result, formula_variable_inter_arg_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                            }
                        }
                        result = nconc(result, neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    result = list_utilities.delete_duplicate_forts(result);
                }
            } finally {
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject dnf_variable_inter_arg_genl_constraints_int_alt(SubLObject var, SubLObject dnf, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lits = clauses.pos_lits(dnf);
                SubLObject result = NIL;
                if (NIL != pos_lits) {
                    {
                        SubLObject neg_lits = clauses.neg_lits(dnf);
                        SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
                            try {
                                at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                                    {
                                        SubLObject cdolist_list_var = neg_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = pos_lits;
                                        SubLObject literal = NIL;
                                        for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                            if (NIL != mt_designating_literalP(literal)) {
                                                {
                                                    SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                                                    SubLObject mt_arg = designated_mt(literal);
                                                    SubLObject subformula = designated_sentence(literal);
                                                    SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                    if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                        result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_genl_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                    }
                                                }
                                            }
                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                                        }
                                    }
                                    result = list_utilities.delete_duplicate_forts(result);
                                }
                            } finally {
                                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject dnf_variable_inter_arg_genl_constraints_int(final SubLObject var, final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(dnf);
        SubLObject result = NIL;
        if (NIL != pos_lits) {
            final SubLObject neg_lits = clauses.neg_lits(dnf);
            final SubLObject free_vars = clause_utilities.clause_free_variables(dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
            final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
            try {
                at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits) && (NIL != pos_lits)) || (NIL != second(neg_lits))) || (NIL != second(pos_lits))), thread);
                if ((NIL != list_utilities.tree_find(var, pos_lits, symbol_function(EQUAL), UNPROVIDED)) || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED))) {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = nconc(result, neg_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    cdolist_list_var = pos_lits;
                    literal = NIL;
                    literal = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != mt_designating_literalP(literal)) {
                            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                            final SubLObject mt_arg = designated_mt(literal);
                            final SubLObject subformula = designated_sentence(literal);
                            final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                            if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                result = nconc(result, formula_variable_inter_arg_genl_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                            }
                        }
                        result = nconc(result, neg_lit_variable_inter_arg_genl_constraints(var, literal, mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        literal = cdolist_list_var.first();
                    } 
                    result = list_utilities.delete_duplicate_forts(result);
                }
            } finally {
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject cnf_neg_lit_variable_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject cnf_neg_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return neg_lit_variable_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject cnf_neg_lit_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_quoted_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject cnf_neg_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return neg_lit_variable_quoted_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject cnf_neg_lit_variable_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_genl_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject cnf_neg_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return neg_lit_variable_genl_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject cnf_pos_lit_variable_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_isa_constraints(var, literal, mt);
    }

    public static SubLObject cnf_pos_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        return neg_lit_variable_isa_constraints(var, literal, mt);
    }

    public static final SubLObject cnf_pos_lit_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_quoted_isa_constraints(var, literal, mt);
    }

    public static SubLObject cnf_pos_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        return neg_lit_variable_quoted_isa_constraints(var, literal, mt);
    }

    public static final SubLObject cnf_pos_lit_variable_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_genl_constraints(var, literal, mt);
    }

    public static SubLObject cnf_pos_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        return neg_lit_variable_genl_constraints(var, literal, mt);
    }

    public static final SubLObject dnf_neg_lit_variable_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject dnf_neg_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return pos_lit_variable_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject dnf_neg_lit_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_quoted_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject dnf_neg_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return pos_lit_variable_quoted_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject dnf_neg_lit_variable_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_genl_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject dnf_neg_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return pos_lit_variable_genl_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject dnf_pos_lit_variable_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_isa_constraints(var, literal, mt);
    }

    public static SubLObject dnf_pos_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        return neg_lit_variable_isa_constraints(var, literal, mt);
    }

    public static final SubLObject dnf_pos_lit_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_quoted_isa_constraints(var, literal, mt);
    }

    public static SubLObject dnf_pos_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        return neg_lit_variable_quoted_isa_constraints(var, literal, mt);
    }

    public static final SubLObject dnf_pos_lit_variable_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return com.cyc.cycjava.cycl.at_var_types.neg_lit_variable_genl_constraints(var, literal, mt);
    }

    public static SubLObject dnf_pos_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        return neg_lit_variable_genl_constraints(var, literal, mt);
    }

    public static final SubLObject vt_unskolemize_term_alt(SubLObject v_term) {
        if (NIL != term.unreified_skolem_termP(v_term)) {
            return skolems.skolem_function_var(v_term);
        } else {
            return v_term;
        }
    }

    public static SubLObject vt_unskolemize_term(final SubLObject v_term) {
        if (NIL != term.unreified_skolem_termP(v_term)) {
            return skolems.skolem_function_var(v_term);
        }
        return v_term;
    }

    public static final SubLObject neg_lit_variable_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_isa_constraints(var, literal, mt);
                if ((NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue(thread)) && (NIL != isa_litP(literal))) {
                    {
                        SubLObject arg1 = com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                        SubLObject arg2 = cycl_utilities.reify_when_closed_naut(literal_arg2(literal, UNPROVIDED));
                        if (var != arg1) {
                        } else {
                            if (NIL != fort_types_interface.collectionP(arg2)) {
                                result = cons(arg2, result);
                            } else {
                                if (NIL != term.first_order_nautP(arg2)) {
                                    if (NIL != groundP(arg2, UNPROVIDED)) {
                                        result = nconc(result, kb_accessors.result_genl_args(arg2, mt));
                                    } else {
                                        result = nconc(result, kb_accessors.result_genl_via_arg_arg_genl(arg2, mt));
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if ((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED))) {
                        {
                            SubLObject arg1 = com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                            if (var == arg1) {
                                result = nconc(result, kb_accessors.result_isa(cycl_utilities.nat_functor(literal_arg2(literal, UNPROVIDED)), mt));
                            }
                        }
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject neg_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = pos_lit_variable_isa_constraints(var, literal, mt);
        if ((NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue(thread)) && (NIL != isa_litP(literal))) {
            final SubLObject arg1 = vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
            final SubLObject arg2 = cycl_utilities.reify_when_closed_naut(literal_arg2(literal, UNPROVIDED));
            if (var.eql(arg1)) {
                if (NIL != fort_types_interface.collectionP(arg2)) {
                    result = cons(arg2, result);
                } else
                    if (NIL != term.first_order_nautP(arg2)) {
                        if (NIL != groundP(arg2, UNPROVIDED)) {
                            result = nconc(result, kb_accessors.result_genl_args(arg2, mt));
                        } else {
                            result = nconc(result, kb_accessors.result_genl_via_arg_arg_genl(arg2, mt));
                        }
                    }

            }
        } else
            if ((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED))) {
                final SubLObject arg1 = vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                if (var.eql(arg1)) {
                    result = nconc(result, kb_accessors.result_isa(cycl_utilities.nat_functor(literal_arg2(literal, UNPROVIDED)), mt));
                }
            }

        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject neg_lit_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_quoted_isa_constraints(var, literal, mt);
                if ((NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue(thread)) && (NIL != quoted_isa_litP(literal))) {
                    {
                        SubLObject arg1 = com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                        SubLObject arg2 = cycl_utilities.reify_when_closed_naut(literal_arg2(literal, UNPROVIDED));
                        if (var != arg1) {
                        } else {
                            if (NIL != fort_types_interface.collectionP(arg2)) {
                                result = cons(arg2, result);
                            }
                        }
                    }
                } else {
                    if ((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED))) {
                        {
                            SubLObject arg1 = com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                            if (var == arg1) {
                                {
                                    SubLObject nat_functor = cycl_utilities.nat_functor(literal_arg2(literal, UNPROVIDED));
                                    SubLObject evaluation_quoted_isas = kb_accessors.evaluation_result_quoted_isa(nat_functor, mt);
                                    SubLObject quoted_isas = kb_accessors.result_quoted_isa(nat_functor, mt);
                                    result = nconc(result, evaluation_quoted_isas, quoted_isas);
                                }
                            }
                        }
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject neg_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = pos_lit_variable_quoted_isa_constraints(var, literal, mt);
        if ((NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue(thread)) && (NIL != quoted_isa_litP(literal))) {
            final SubLObject arg1 = vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
            final SubLObject arg2 = cycl_utilities.reify_when_closed_naut(literal_arg2(literal, UNPROVIDED));
            if (var.eql(arg1)) {
                if (NIL != fort_types_interface.collectionP(arg2)) {
                    result = cons(arg2, result);
                }
            }
        } else
            if ((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED))) {
                final SubLObject arg1 = vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                if (var.eql(arg1)) {
                    final SubLObject nat_functor = cycl_utilities.nat_functor(literal_arg2(literal, UNPROVIDED));
                    final SubLObject evaluation_quoted_isas = kb_accessors.evaluation_result_quoted_isa(nat_functor, mt);
                    final SubLObject quoted_isas = kb_accessors.result_quoted_isa(nat_functor, mt);
                    result = nconc(result, evaluation_quoted_isas, quoted_isas);
                }
            }

        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject neg_lit_variable_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_genl_constraints(var, literal, mt);
                if ((NIL != at_vars.$at_include_genl_literal_constraints$.getDynamicValue(thread)) && (NIL != genls_litP(literal))) {
                    {
                        SubLObject arg1 = com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                        SubLObject arg2 = cycl_utilities.reify_when_closed_naut(literal_arg2(literal, UNPROVIDED));
                        if (var != arg1) {
                        } else {
                            if (NIL != fort_types_interface.collectionP(arg2)) {
                                result = cons(arg2, result);
                            } else {
                                if (NIL != term.first_order_nautP(arg2)) {
                                    result = nconc(result, kb_accessors.result_genl(cycl_utilities.nat_functor(arg2), mt, UNPROVIDED));
                                }
                            }
                        }
                    }
                } else {
                    if ((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED))) {
                        {
                            SubLObject arg1 = com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                            if (var == arg1) {
                                result = nconc(result, kb_accessors.result_genl(cycl_utilities.nat_functor(literal_arg2(literal, UNPROVIDED)), mt, UNPROVIDED));
                            }
                        }
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
                return result;
            }
        }
    }

    public static SubLObject neg_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = pos_lit_variable_genl_constraints(var, literal, mt);
        if ((NIL != at_vars.$at_include_genl_literal_constraints$.getDynamicValue(thread)) && (NIL != genls_litP(literal))) {
            final SubLObject arg1 = vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
            final SubLObject arg2 = cycl_utilities.reify_when_closed_naut(literal_arg2(literal, UNPROVIDED));
            if (var.eql(arg1)) {
                if (NIL != fort_types_interface.collectionP(arg2)) {
                    result = cons(arg2, result);
                } else
                    if (NIL != term.first_order_nautP(arg2)) {
                        result = nconc(result, kb_accessors.result_genl(cycl_utilities.nat_functor(arg2), mt, UNPROVIDED));
                    }

            }
        } else
            if ((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED))) {
                final SubLObject arg1 = vt_unskolemize_term(literal_arg1(literal, UNPROVIDED));
                if (var.eql(arg1)) {
                    result = nconc(result, kb_accessors.result_genl(cycl_utilities.nat_functor(literal_arg2(literal, UNPROVIDED)), mt, UNPROVIDED));
                }
            }

        result = list_utilities.delete_duplicate_forts(result);
        return result;
    }

    public static final SubLObject pos_lit_variable_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        return copy_list(com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_isa_constraints_memoized(var, literal, mt));
    }

    public static SubLObject pos_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == forts.fort_p(predicate)) {
            predicate = cycl_utilities.find_when_closed_naut(predicate);
        }
        final SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? kb_accessors.scoping_args(predicate, mt) : NIL;
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            final SubLObject genl_somethingP = (NIL != forts.fort_p(predicate)) ? makeBoolean((NIL != genl_predicates.genl_predicates(predicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            final SubLObject _prev_bind_0_$65 = at_vars.$at_reln$.currentBinding(thread);
            final SubLObject _prev_bind_1_$66 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
            try {
                at_vars.$at_reln$.bind(predicate, thread);
                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                if (var.eql(vt_unskolemize_term(predicate))) {
                    SubLObject doneP = NIL;
                    SubLObject has_sentence_argP = NIL;
                    final SubLObject args = cycl_utilities.formula_args(literal, $IGNORE);
                    SubLObject rest;
                    SubLObject arg;
                    for (rest = NIL, rest = args; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                        arg = rest.first();
                        if (NIL != term.sentenceP(arg, UNPROVIDED)) {
                            doneP = T;
                            has_sentence_argP = T;
                        }
                    }
                    if (NIL != has_sentence_argP) {
                        result = cons($$TruthFunction, result);
                    } else {
                        result = cons($$Predicate, result);
                    }
                }
                SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                SubLObject arg2 = NIL;
                arg2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(arg2)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                if (var.equal(arg2)) {
                                    result = nconc(result, at_argn_isa(predicate, argnum));
                                } else
                                    if (NIL == modal_in_argP(predicate, argnum, mt)) {
                                        if (NIL != term.unreified_skolem_termP(arg2)) {
                                            if (var.eql(cycl_utilities.nat_arg2(arg2, UNPROVIDED))) {
                                                result = at_argn_isa(predicate, argnum);
                                            }
                                            final SubLObject skolem_number = skolems.skolem_number(arg2);
                                            if (NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED)) {
                                                result = nconc(result, relation_variable_isa_constraints(var, skolem_number, mt));
                                            }
                                        } else
                                            if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        final SubLObject mt_arg = designated_mt(literal);
                                                        final SubLObject subformula = designated_sentence(literal);
                                                        final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                            result = nconc(result, formula_variable_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                        }
                                                    } else {
                                                        result = nconc(result, formula_variable_isa_constraints(var, arg2, mt, at_arg_formula_type(predicate, argnum, mt)));
                                                    }
                                                }
                                            } else
                                                if (NIL == arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                    if (((NIL != el_list_p(arg2)) && (NIL != el_formula_without_sequence_termP(arg2))) && (NIL != list_utilities.member_eqP(var, arg2))) {
                                                        final SubLObject list_arg_replaced_literal = substitute($sym45$_DUMMY, arg2, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject cdolist_list_var_$67;
                                                        final SubLObject arg_isa_constraints = cdolist_list_var_$67 = formula_variable_isa_constraints($sym45$_DUMMY, list_arg_replaced_literal, mt, UNPROVIDED);
                                                        SubLObject arg_isa_constraint = NIL;
                                                        arg_isa_constraint = cdolist_list_var_$67.first();
                                                        while (NIL != cdolist_list_var_$67) {
                                                            if (NIL != cycl_grammar.cycl_nat_p(arg_isa_constraint)) {
                                                                final SubLObject func = cycl_utilities.nat_functor(arg_isa_constraint);
                                                                final SubLObject arg3 = cycl_utilities.nat_arg1(arg_isa_constraint, UNPROVIDED);
                                                                if ($$ListOfTypeFn.eql(func) && (NIL != forts.fort_p(arg3))) {
                                                                    result = cons(arg3, result);
                                                                }
                                                            }
                                                            cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                                                            arg_isa_constraint = cdolist_list_var_$67.first();
                                                        } 
                                                        if (NIL == result) {
                                                            result = list($$Thing);
                                                        }
                                                    } else
                                                        if (NIL != list_utilities.tree_find(var, arg2, EQUAL, UNPROVIDED)) {
                                                            final SubLObject items_var = relation_variable_isa_constraints(var, arg2, mt);
                                                            if (items_var.isVector()) {
                                                                final SubLObject vector_var = items_var;
                                                                final SubLObject backwardP_var = NIL;
                                                                SubLObject length;
                                                                SubLObject v_iteration;
                                                                SubLObject element_num;
                                                                SubLObject item;
                                                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                                    item = aref(vector_var, element_num);
                                                                    result = cons(item, result);
                                                                }
                                                            } else {
                                                                SubLObject cdolist_list_var_$68 = items_var;
                                                                SubLObject item2 = NIL;
                                                                item2 = cdolist_list_var_$68.first();
                                                                while (NIL != cdolist_list_var_$68) {
                                                                    result = cons(item2, result);
                                                                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                                                                    item2 = cdolist_list_var_$68.first();
                                                                } 
                                                            }
                                                        }

                                                }


                                    }

                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg2 = cdolist_list_var.first();
                } 
                result = list_utilities.delete_duplicate_forts(result);
            } finally {
                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$66, thread);
                at_vars.$at_reln$.rebind(_prev_bind_0_$65, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject pos_lit_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                SubLObject result = NIL;
                if (NIL == forts.fort_p(predicate)) {
                    predicate = cycl_utilities.find_when_closed_naut(predicate);
                }
                {
                    SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (kb_accessors.scoping_args(predicate, mt))) : NIL;
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL;
                                {
                                    SubLObject _prev_bind_0_66 = at_vars.$at_reln$.currentBinding(thread);
                                    SubLObject _prev_bind_1_67 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                    try {
                                        at_vars.$at_reln$.bind(predicate, thread);
                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        {
                                            SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                                            SubLObject arg = NIL;
                                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                argnum = add(argnum, ONE_INTEGER);
                                                if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                } else {
                                                    if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_quoted_isa(predicate, argnum));
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(predicate, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        if (var.eql(cycl_utilities.nat_arg2(arg, UNPROVIDED))) {
                                                                            result = com.cyc.cycjava.cycl.at_var_types.at_argn_quoted_isa(predicate, argnum);
                                                                        }
                                                                        {
                                                                            SubLObject skolem_number = skolems.skolem_number(arg);
                                                                            if (NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED)) {
                                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_quoted_isa_constraints(var, skolem_number, mt));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                                            if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                                                if (NIL != mt_designating_literalP(literal)) {
                                                                                    {
                                                                                        SubLObject mt_arg = designated_mt(literal);
                                                                                        SubLObject subformula = designated_sentence(literal);
                                                                                        SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_quoted_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_quoted_isa_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, argnum, mt)));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_quoted_isa_constraints(var, arg, mt));
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
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_67, thread);
                                        at_vars.$at_reln$.rebind(_prev_bind_0_66, thread);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject pos_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == forts.fort_p(predicate)) {
            predicate = cycl_utilities.find_when_closed_naut(predicate);
        }
        final SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? kb_accessors.scoping_args(predicate, mt) : NIL;
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            final SubLObject genl_somethingP = (NIL != forts.fort_p(predicate)) ? makeBoolean((NIL != genl_predicates.genl_predicates(predicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            final SubLObject _prev_bind_0_$69 = at_vars.$at_reln$.currentBinding(thread);
            final SubLObject _prev_bind_1_$70 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
            try {
                at_vars.$at_reln$.bind(predicate, thread);
                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                if (var.equal(arg)) {
                                    result = nconc(result, at_argn_quoted_isa(predicate, argnum));
                                } else
                                    if (NIL == modal_in_argP(predicate, argnum, mt)) {
                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                            if (var.eql(cycl_utilities.nat_arg2(arg, UNPROVIDED))) {
                                                result = at_argn_quoted_isa(predicate, argnum);
                                            }
                                            final SubLObject skolem_number = skolems.skolem_number(arg);
                                            if (NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED)) {
                                                result = nconc(result, relation_variable_quoted_isa_constraints(var, skolem_number, mt));
                                            }
                                        } else
                                            if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        final SubLObject mt_arg = designated_mt(literal);
                                                        final SubLObject subformula = designated_sentence(literal);
                                                        final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                            result = nconc(result, formula_variable_quoted_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                        }
                                                    } else {
                                                        result = nconc(result, formula_variable_quoted_isa_constraints(var, arg, mt, at_arg_formula_type(predicate, argnum, mt)));
                                                    }
                                                }
                                            } else
                                                if (NIL == arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_quoted_isa_constraints(var, arg, mt));
                                                    }
                                                }


                                    }

                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                result = list_utilities.delete_duplicate_forts(result);
            } finally {
                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$70, thread);
                at_vars.$at_reln$.rebind(_prev_bind_0_$69, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject pos_lit_variable_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                SubLObject result = NIL;
                if (NIL == forts.fort_p(predicate)) {
                    if (NIL != term.closed_nautP(predicate, UNPROVIDED)) {
                        predicate = cycl_utilities.find_closed_naut(predicate);
                    }
                }
                {
                    SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (kb_accessors.scoping_args(predicate, mt))) : NIL;
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL;
                                {
                                    SubLObject _prev_bind_0_68 = at_vars.$at_reln$.currentBinding(thread);
                                    SubLObject _prev_bind_1_69 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                    try {
                                        at_vars.$at_reln$.bind(predicate, thread);
                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        {
                                            SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                                            SubLObject arg = NIL;
                                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                argnum = add(argnum, ONE_INTEGER);
                                                if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                } else {
                                                    if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_genl(predicate, argnum));
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(predicate, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        if (var.eql(cycl_utilities.nat_arg2(arg, UNPROVIDED))) {
                                                                            result = com.cyc.cycjava.cycl.at_var_types.at_argn_genl(predicate, argnum);
                                                                        }
                                                                        {
                                                                            SubLObject skolem_number = skolems.skolem_number(arg);
                                                                            if (NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED)) {
                                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_genl_constraints(var, skolem_number, mt));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                                            if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                                                if (NIL != mt_designating_literalP(literal)) {
                                                                                    {
                                                                                        SubLObject mt_arg = designated_mt(literal);
                                                                                        SubLObject subformula = designated_sentence(literal);
                                                                                        SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_genl_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, argnum, mt)));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_genl_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, argnum, mt)));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_genl_constraints(var, arg, mt));
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
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_69, thread);
                                        at_vars.$at_reln$.rebind(_prev_bind_0_68, thread);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject pos_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if ((NIL == forts.fort_p(predicate)) && (NIL != term.closed_nautP(predicate, UNPROVIDED))) {
            predicate = cycl_utilities.find_closed_naut(predicate);
        }
        final SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? kb_accessors.scoping_args(predicate, mt) : NIL;
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            final SubLObject genl_somethingP = (NIL != forts.fort_p(predicate)) ? makeBoolean((NIL != genl_predicates.genl_predicates(predicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            final SubLObject _prev_bind_0_$71 = at_vars.$at_reln$.currentBinding(thread);
            final SubLObject _prev_bind_1_$72 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
            try {
                at_vars.$at_reln$.bind(predicate, thread);
                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                if (var.equal(arg)) {
                                    result = nconc(result, at_argn_genl(predicate, argnum));
                                } else
                                    if (NIL == modal_in_argP(predicate, argnum, mt)) {
                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                            if (var.eql(cycl_utilities.nat_arg2(arg, UNPROVIDED))) {
                                                result = at_argn_genl(predicate, argnum);
                                            }
                                            final SubLObject skolem_number = skolems.skolem_number(arg);
                                            if (NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED)) {
                                                result = nconc(result, relation_variable_genl_constraints(var, skolem_number, mt));
                                            }
                                        } else
                                            if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        final SubLObject mt_arg = designated_mt(literal);
                                                        final SubLObject subformula = designated_sentence(literal);
                                                        final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                            result = nconc(result, formula_variable_genl_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, argnum, mt)));
                                                        }
                                                    } else {
                                                        result = nconc(result, formula_variable_genl_constraints(var, arg, mt, at_arg_formula_type(predicate, argnum, mt)));
                                                    }
                                                }
                                            } else
                                                if (NIL == arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                    if (((NIL != el_list_p(arg)) && (NIL != el_formula_without_sequence_termP(arg))) && (NIL != list_utilities.member_eqP(var, arg))) {
                                                        final SubLObject list_arg_replaced_literal = substitute($sym45$_DUMMY, arg, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject cdolist_list_var_$73;
                                                        final SubLObject arg_isa_constraints = cdolist_list_var_$73 = formula_variable_isa_constraints($sym45$_DUMMY, list_arg_replaced_literal, mt, UNPROVIDED);
                                                        SubLObject arg_isa_constraint = NIL;
                                                        arg_isa_constraint = cdolist_list_var_$73.first();
                                                        while (NIL != cdolist_list_var_$73) {
                                                            if (NIL != cycl_grammar.cycl_nat_p(arg_isa_constraint)) {
                                                                final SubLObject func = cycl_utilities.nat_functor(arg_isa_constraint);
                                                                final SubLObject arg2 = cycl_utilities.nat_arg1(arg_isa_constraint, UNPROVIDED);
                                                                if ($$ListOfSpecsFn.eql(func) && (NIL != forts.fort_p(arg2))) {
                                                                    result = cons(arg2, result);
                                                                } else
                                                                    if (($$ListOfTypeFn.eql(func) && $$SpecsFn.eql(cycl_utilities.nat_functor(arg2))) && (NIL != forts.fort_p(cycl_utilities.nat_arg1(arg2, UNPROVIDED)))) {
                                                                        result = cons(cycl_utilities.nat_arg1(arg2, UNPROVIDED), result);
                                                                    }

                                                            }
                                                            cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                                            arg_isa_constraint = cdolist_list_var_$73.first();
                                                        } 
                                                    } else
                                                        if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                            result = nconc(result, relation_variable_genl_constraints(var, arg, mt));
                                                        }

                                                }


                                    }

                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                result = list_utilities.delete_duplicate_forts(result);
            } finally {
                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$72, thread);
                at_vars.$at_reln$.rebind(_prev_bind_0_$71, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject neg_lit_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_inter_arg_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject neg_lit_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return pos_lit_variable_inter_arg_isa_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject neg_lit_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return com.cyc.cycjava.cycl.at_var_types.pos_lit_variable_inter_arg_genl_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static SubLObject neg_lit_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        if (NIL != czer_utilities.within_disjunctionP()) {
            return pos_lit_variable_inter_arg_genl_constraints(var, literal, mt);
        }
        return NIL;
    }

    public static final SubLObject pos_lit_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                SubLObject result = NIL;
                if (NIL == forts.fort_p(predicate)) {
                    predicate = cycl_utilities.find_when_closed_naut(predicate);
                }
                {
                    SubLObject v_arity = literal_arity(literal, UNPROVIDED);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (kb_accessors.scoping_args(predicate, mt))) : NIL;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL;
                                {
                                    SubLObject _prev_bind_0_70 = at_vars.$at_reln$.currentBinding(thread);
                                    SubLObject _prev_bind_1_71 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                    try {
                                        at_vars.$at_reln$.bind(predicate, thread);
                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        {
                                            SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                                            SubLObject arg = NIL;
                                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                argnum = add(argnum, ONE_INTEGER);
                                                if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                } else {
                                                    if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(arg))) {
                                                                {
                                                                    SubLObject _prev_bind_0_72 = at_vars.$at_profile_term$.currentBinding(thread);
                                                                    try {
                                                                        at_vars.$at_profile_term$.bind(var.equal(at_vars.$at_profile_term$.getDynamicValue(thread)) ? ((SubLObject) (at_vars.$at_profile_term$.getDynamicValue(thread))) : NIL, thread);
                                                                        {
                                                                            SubLObject index = NIL;
                                                                            for (index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                                                                {
                                                                                    SubLObject ind_argnum = add(index, ONE_INTEGER);
                                                                                    if (!argnum.numE(ind_argnum)) {
                                                                                        {
                                                                                            SubLObject ind_arg = literal_arg(literal, ind_argnum, UNPROVIDED);
                                                                                            if (NIL == ind_arg) {
                                                                                            } else {
                                                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.at_inter_arg_checkable_objectP(ind_arg)) {
                                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_isa(predicate, argnum, ind_arg, ind_argnum));
                                                                                                } else {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_73 = list_utilities.alist_lookup(at_vars.$at_var_isa$.getDynamicValue(thread), ind_arg, UNPROVIDED, UNPROVIDED);
                                                                                                        SubLObject ind_type = NIL;
                                                                                                        for (ind_type = cdolist_list_var_73.first(); NIL != cdolist_list_var_73; cdolist_list_var_73 = cdolist_list_var_73.rest() , ind_type = cdolist_list_var_73.first()) {
                                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_from_type(predicate, argnum, ind_type, ind_argnum));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        at_vars.$at_profile_term$.rebind(_prev_bind_0_72, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(predicate, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != term.unreified_skolem_termP(arg)) {
                                                                    } else {
                                                                        if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                                            if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                                                if (NIL != mt_designating_literalP(literal)) {
                                                                                    {
                                                                                        SubLObject mt_arg = designated_mt(literal);
                                                                                        SubLObject subformula = designated_sentence(literal);
                                                                                        SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_isa_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_isa_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, argnum, mt)));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_inter_arg_isa_constraints(var, arg, mt));
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
                                    } finally {
                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_71, thread);
                                        at_vars.$at_reln$.rebind(_prev_bind_0_70, thread);
                                    }
                                }
                                result = list_utilities.delete_duplicate_forts(result);
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject pos_lit_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == forts.fort_p(predicate)) {
            predicate = cycl_utilities.find_when_closed_naut(predicate);
        }
        final SubLObject v_arity = literal_arity(literal, UNPROVIDED);
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject scoping_args = (NIL != forts.fort_p(predicate)) ? kb_accessors.scoping_args(predicate, mt) : NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            final SubLObject genl_somethingP = (NIL != forts.fort_p(predicate)) ? makeBoolean((NIL != genl_predicates.genl_predicates(predicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            final SubLObject _prev_bind_0_$74 = at_vars.$at_reln$.currentBinding(thread);
            final SubLObject _prev_bind_1_$75 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
            try {
                at_vars.$at_reln$.bind(predicate, thread);
                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                if (var.equal(vt_unskolemize_term(arg))) {
                                    final SubLObject _prev_bind_0_$75 = at_vars.$at_profile_term$.currentBinding(thread);
                                    try {
                                        at_vars.$at_profile_term$.bind(var.equal(at_vars.$at_profile_term$.getDynamicValue(thread)) ? at_vars.$at_profile_term$.getDynamicValue(thread) : NIL, thread);
                                        SubLObject index;
                                        SubLObject ind_argnum;
                                        SubLObject ind_arg;
                                        SubLObject cdolist_list_var_$77;
                                        SubLObject ind_type;
                                        for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                            ind_argnum = add(index, ONE_INTEGER);
                                            if (!argnum.numE(ind_argnum)) {
                                                ind_arg = literal_arg(literal, ind_argnum, UNPROVIDED);
                                                if (NIL != ind_arg) {
                                                    if (NIL != at_inter_arg_checkable_objectP(ind_arg)) {
                                                        result = nconc(result, inter_arg_isa(predicate, argnum, ind_arg, ind_argnum));
                                                    } else {
                                                        cdolist_list_var_$77 = list_utilities.alist_lookup(at_vars.$at_var_isa$.getDynamicValue(thread), ind_arg, UNPROVIDED, UNPROVIDED);
                                                        ind_type = NIL;
                                                        ind_type = cdolist_list_var_$77.first();
                                                        while (NIL != cdolist_list_var_$77) {
                                                            result = nconc(result, inter_arg_isa_from_type(predicate, argnum, ind_type, ind_argnum));
                                                            cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                                                            ind_type = cdolist_list_var_$77.first();
                                                        } 
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        at_vars.$at_profile_term$.rebind(_prev_bind_0_$75, thread);
                                    }
                                } else
                                    if (NIL == modal_in_argP(predicate, argnum, mt)) {
                                        if (NIL == term.unreified_skolem_termP(arg)) {
                                            if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        final SubLObject mt_arg = designated_mt(literal);
                                                        final SubLObject subformula = designated_sentence(literal);
                                                        final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                            result = nconc(result, formula_variable_inter_arg_isa_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                        }
                                                    } else {
                                                        result = nconc(result, formula_variable_inter_arg_isa_constraints(var, arg, mt, at_arg_formula_type(predicate, argnum, mt)));
                                                    }
                                                }
                                            } else
                                                if (NIL == arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_inter_arg_isa_constraints(var, arg, mt));
                                                    }
                                                }

                                        }
                                    }

                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } finally {
                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$75, thread);
                at_vars.$at_reln$.rebind(_prev_bind_0_$74, thread);
            }
            result = list_utilities.delete_duplicate_forts(result);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject at_inter_arg_checkable_objectP_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != term.first_order_nautP(v_object)));
    }

    public static SubLObject at_inter_arg_checkable_objectP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != term.first_order_nautP(v_object)));
    }

    public static final SubLObject pos_lit_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                SubLObject v_arity = literal_arity(literal, UNPROVIDED);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject scoping_args = NIL;
                SubLObject result = NIL;
                if (NIL == forts.fort_p(predicate)) {
                    predicate = cycl_utilities.find_when_closed_naut(predicate);
                }
                scoping_args = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (kb_accessors.scoping_args(predicate, mt))) : NIL;
                {
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(predicate)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL;
                                {
                                    SubLObject _prev_bind_0_74 = at_vars.$at_reln$.currentBinding(thread);
                                    SubLObject _prev_bind_1_75 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                    try {
                                        at_vars.$at_reln$.bind(predicate, thread);
                                        at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                        {
                                            SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                                            SubLObject arg = NIL;
                                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                argnum = add(argnum, ONE_INTEGER);
                                                if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                } else {
                                                    if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(com.cyc.cycjava.cycl.at_var_types.vt_unskolemize_term(arg))) {
                                                                {
                                                                    SubLObject _prev_bind_0_76 = at_vars.$at_profile_term$.currentBinding(thread);
                                                                    try {
                                                                        at_vars.$at_profile_term$.bind(var.equal(at_vars.$at_profile_term$.getDynamicValue(thread)) ? ((SubLObject) (at_vars.$at_profile_term$.getDynamicValue(thread))) : NIL, thread);
                                                                        {
                                                                            SubLObject index = NIL;
                                                                            for (index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                                                                {
                                                                                    SubLObject ind_argnum = add(index, ONE_INTEGER);
                                                                                    if (!argnum.numE(ind_argnum)) {
                                                                                        {
                                                                                            SubLObject ind_arg = literal_arg(literal, ind_argnum, UNPROVIDED);
                                                                                            if (NIL == ind_arg) {
                                                                                            } else {
                                                                                                if ((NIL != forts.fort_p(ind_arg)) || (NIL != term.first_order_nautP(ind_arg))) {
                                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_genl(predicate, argnum, ind_arg, ind_argnum));
                                                                                                } else {
                                                                                                    {
                                                                                                        SubLObject cdolist_list_var_77 = assoc(ind_arg, at_vars.$at_var_genl$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                                                        SubLObject ind_type = NIL;
                                                                                                        for (ind_type = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest() , ind_type = cdolist_list_var_77.first()) {
                                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_genl_from_type(predicate, argnum, ind_type, ind_argnum));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        at_vars.$at_profile_term$.rebind(_prev_bind_0_76, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(predicate, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != term.unreified_skolem_termP(arg)) {
                                                                    } else {
                                                                        if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                                            if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                                                if (NIL != mt_designating_literalP(literal)) {
                                                                                    {
                                                                                        SubLObject mt_arg = designated_mt(literal);
                                                                                        SubLObject subformula = designated_sentence(literal);
                                                                                        SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) (mt_arg)) : mt;
                                                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_genl_constraints(var, subformula, lit_mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_genl_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(predicate, argnum, mt)));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_inter_arg_genl_constraints(var, arg, mt));
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
                                            result = list_utilities.delete_duplicate_forts(result);
                                        }
                                    } finally {
                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_75, thread);
                                        at_vars.$at_reln$.rebind(_prev_bind_0_74, thread);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject pos_lit_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        final SubLObject v_arity = literal_arity(literal, UNPROVIDED);
        SubLObject argnum = ZERO_INTEGER;
        SubLObject scoping_args = NIL;
        SubLObject result = NIL;
        if (NIL == forts.fort_p(predicate)) {
            predicate = cycl_utilities.find_when_closed_naut(predicate);
        }
        scoping_args = (NIL != forts.fort_p(predicate)) ? kb_accessors.scoping_args(predicate, mt) : NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            final SubLObject genl_somethingP = (NIL != forts.fort_p(predicate)) ? makeBoolean((NIL != genl_predicates.genl_predicates(predicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            final SubLObject _prev_bind_0_$78 = at_vars.$at_reln$.currentBinding(thread);
            final SubLObject _prev_bind_1_$79 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
            try {
                at_vars.$at_reln$.bind(predicate, thread);
                at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                SubLObject cdolist_list_var = literal_args(literal, $REGULARIZE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(arg)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt)) {
                                if (var.equal(vt_unskolemize_term(arg))) {
                                    final SubLObject _prev_bind_0_$79 = at_vars.$at_profile_term$.currentBinding(thread);
                                    try {
                                        at_vars.$at_profile_term$.bind(var.equal(at_vars.$at_profile_term$.getDynamicValue(thread)) ? at_vars.$at_profile_term$.getDynamicValue(thread) : NIL, thread);
                                        SubLObject index;
                                        SubLObject ind_argnum;
                                        SubLObject ind_arg;
                                        SubLObject cdolist_list_var_$81;
                                        SubLObject ind_type;
                                        for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                            ind_argnum = add(index, ONE_INTEGER);
                                            if (!argnum.numE(ind_argnum)) {
                                                ind_arg = literal_arg(literal, ind_argnum, UNPROVIDED);
                                                if (NIL != ind_arg) {
                                                    if ((NIL != forts.fort_p(ind_arg)) || (NIL != term.first_order_nautP(ind_arg))) {
                                                        result = nconc(result, inter_arg_genl(predicate, argnum, ind_arg, ind_argnum));
                                                    } else {
                                                        cdolist_list_var_$81 = assoc(ind_arg, at_vars.$at_var_genl$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        ind_type = NIL;
                                                        ind_type = cdolist_list_var_$81.first();
                                                        while (NIL != cdolist_list_var_$81) {
                                                            result = nconc(result, inter_arg_genl_from_type(predicate, argnum, ind_type, ind_argnum));
                                                            cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                                            ind_type = cdolist_list_var_$81.first();
                                                        } 
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        at_vars.$at_profile_term$.rebind(_prev_bind_0_$79, thread);
                                    }
                                } else
                                    if (NIL == modal_in_argP(predicate, argnum, mt)) {
                                        if (NIL == term.unreified_skolem_termP(arg)) {
                                            if (NIL != czer_utilities.sentence_argP(predicate, argnum, mt)) {
                                                if (NIL != czer_utilities.assertable_sentence_argP(predicate, argnum, mt)) {
                                                    if (NIL != mt_designating_literalP(literal)) {
                                                        final SubLObject mt_arg = designated_mt(literal);
                                                        final SubLObject subformula = designated_sentence(literal);
                                                        final SubLObject lit_mt = (NIL != fort_types_interface.mtP(mt_arg)) ? mt_arg : mt;
                                                        if ((NIL == within_askP()) || (NIL != fort_types_interface.mtP(mt_arg))) {
                                                            result = nconc(result, formula_variable_inter_arg_genl_constraints(var, subformula, lit_mt, at_arg_formula_type(predicate, TWO_INTEGER, lit_mt)));
                                                        }
                                                    } else {
                                                        result = nconc(result, formula_variable_inter_arg_genl_constraints(var, arg, mt, at_arg_formula_type(predicate, argnum, mt)));
                                                    }
                                                }
                                            } else
                                                if (NIL == arg_types_prescribe_tacit_term_listP(predicate, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_inter_arg_genl_constraints(var, arg, mt));
                                                    }
                                                }

                                        }
                                    }

                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                result = list_utilities.delete_duplicate_forts(result);
            } finally {
                at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$79, thread);
                at_vars.$at_reln$.rebind(_prev_bind_0_$78, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject formula_variable_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return com.cyc.cycjava.cycl.at_var_types.formula_variable_arg_constraints(var, formula, $ISA, mt, formula_type);
    }

    public static SubLObject formula_variable_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return formula_variable_arg_constraints(var, formula, $ISA, mt, formula_type);
    }

    public static final SubLObject formula_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return com.cyc.cycjava.cycl.at_var_types.formula_variable_arg_constraints(var, formula, $QUOTED_ISA, mt, formula_type);
    }

    public static SubLObject formula_variable_quoted_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return formula_variable_arg_constraints(var, formula, $QUOTED_ISA, mt, formula_type);
    }

    public static final SubLObject formula_variable_genl_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return com.cyc.cycjava.cycl.at_var_types.formula_variable_arg_constraints(var, formula, $GENLS, mt, formula_type);
    }

    public static SubLObject formula_variable_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return formula_variable_arg_constraints(var, formula, $GENLS, mt, formula_type);
    }

    public static final SubLObject formula_variable_arg_constraints_alt(SubLObject var, SubLObject formula, SubLObject constraint_type, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        {
            SubLObject pcase_var = formula_type;
            if (pcase_var.eql($CNF)) {
                return com.cyc.cycjava.cycl.at_var_types.cnf_formula_variable_arg_constraints(var, formula, constraint_type, mt);
            } else {
                if (pcase_var.eql($DNF)) {
                    return com.cyc.cycjava.cycl.at_var_types.dnf_formula_variable_arg_constraints(var, formula, constraint_type, mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject formula_variable_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject constraint_type, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        final SubLObject pcase_var = formula_type;
        if (pcase_var.eql($CNF)) {
            return cnf_formula_variable_arg_constraints(var, formula, constraint_type, mt);
        }
        if (pcase_var.eql($DNF)) {
            return dnf_formula_variable_arg_constraints(var, formula, constraint_type, mt);
        }
        return NIL;
    }

    public static final SubLObject cnf_formula_variable_arg_constraints_alt(SubLObject var, SubLObject formula, SubLObject type, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!formula.isAtom()) {
                thread.resetMultipleValues();
                {
                    SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(formula, mt);
                    SubLObject new_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject constraints = NIL;
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($ISA)) {
                            constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_isa_constraints(var, cnfs, new_mt), new_mt);
                        } else {
                            if (pcase_var.eql($QUOTED_ISA)) {
                                constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_quoted_isa_constraints(var, cnfs, new_mt), new_mt);
                            } else {
                                if (pcase_var.eql($GENLS)) {
                                    constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_genl_constraints(var, cnfs, new_mt), new_mt);
                                }
                            }
                        }
                        return constraints;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cnf_formula_variable_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isAtom()) {
            thread.resetMultipleValues();
            final SubLObject cnfs = at_var_type_cnfs(formula, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject constraints = NIL;
            if (type.eql($ISA)) {
                constraints = at_min_cols(cnfs_variable_isa_constraints(var, cnfs, new_mt), new_mt);
            } else
                if (type.eql($QUOTED_ISA)) {
                    constraints = at_min_cols(cnfs_variable_quoted_isa_constraints(var, cnfs, new_mt), new_mt);
                } else
                    if (type.eql($GENLS)) {
                        constraints = at_min_cols(cnfs_variable_genl_constraints(var, cnfs, new_mt), new_mt);
                    }


            return constraints;
        }
        return NIL;
    }

    public static final SubLObject dnf_formula_variable_arg_constraints_alt(SubLObject var, SubLObject formula, SubLObject type, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!formula.isAtom()) {
                thread.resetMultipleValues();
                {
                    SubLObject dnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_dnfs(formula, mt, NIL);
                    SubLObject new_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject constraints = NIL;
                        if (dnfs.isCons()) {
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($ISA)) {
                                    constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_isa_constraints(var, dnfs, new_mt), new_mt);
                                } else {
                                    if (pcase_var.eql($QUOTED_ISA)) {
                                        constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_quoted_isa_constraints(var, dnfs, new_mt), new_mt);
                                    } else {
                                        if (pcase_var.eql($GENLS)) {
                                            constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_genl_constraints(var, dnfs, new_mt), new_mt);
                                        }
                                    }
                                }
                            }
                            if (NIL != constraints) {
                                if (NIL != list_utilities.singletonP(dnfs)) {
                                    return constraints;
                                } else {
                                    return genls.min_ceiling_cols(constraints, NIL, mt, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dnf_formula_variable_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isAtom()) {
            thread.resetMultipleValues();
            final SubLObject dnfs = at_var_type_dnfs(formula, mt, NIL);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject constraints = NIL;
            if (dnfs.isCons()) {
                if (type.eql($ISA)) {
                    constraints = at_min_cols(dnfs_variable_isa_constraints(var, dnfs, new_mt), new_mt);
                } else
                    if (type.eql($QUOTED_ISA)) {
                        constraints = at_min_cols(dnfs_variable_quoted_isa_constraints(var, dnfs, new_mt), new_mt);
                    } else
                        if (type.eql($GENLS)) {
                            constraints = at_min_cols(dnfs_variable_genl_constraints(var, dnfs, new_mt), new_mt);
                        }


                if (NIL != constraints) {
                    if (NIL != list_utilities.singletonP(dnfs)) {
                        return constraints;
                    }
                    return genls.min_ceiling_cols(constraints, NIL, mt, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject formula_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_constraints(var, formula, $ISA, mt, formula_type);
    }

    public static SubLObject formula_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return formula_variable_inter_arg_constraints(var, formula, $ISA, mt, formula_type);
    }

    public static final SubLObject formula_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_constraints(var, formula, $GENLS, mt, formula_type);
    }

    public static SubLObject formula_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        return formula_variable_inter_arg_constraints(var, formula, $GENLS, mt, formula_type);
    }

    public static final SubLObject formula_variable_inter_arg_constraints_alt(SubLObject var, SubLObject formula, SubLObject constraint_type, SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        {
            SubLObject pcase_var = formula_type;
            if (pcase_var.eql($CNF)) {
                return com.cyc.cycjava.cycl.at_var_types.cnf_formula_variable_inter_arg_constraints(var, formula, constraint_type, mt);
            } else {
                if (pcase_var.eql($DNF)) {
                    return com.cyc.cycjava.cycl.at_var_types.dnf_formula_variable_inter_arg_constraints(var, formula, constraint_type, mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject formula_variable_inter_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject constraint_type, final SubLObject mt, SubLObject formula_type) {
        if (formula_type == UNPROVIDED) {
            formula_type = $DNF;
        }
        final SubLObject pcase_var = formula_type;
        if (pcase_var.eql($CNF)) {
            return cnf_formula_variable_inter_arg_constraints(var, formula, constraint_type, mt);
        }
        if (pcase_var.eql($DNF)) {
            return dnf_formula_variable_inter_arg_constraints(var, formula, constraint_type, mt);
        }
        return NIL;
    }

    public static final SubLObject cnf_formula_variable_inter_arg_constraints_alt(SubLObject var, SubLObject formula, SubLObject type, SubLObject formula_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!formula.isAtom()) {
                thread.resetMultipleValues();
                {
                    SubLObject cnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_cnfs(formula, formula_mt);
                    SubLObject mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject var_constraints = NIL;
                        SubLObject inter_arg_constraints = NIL;
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($ISA)) {
                            {
                                SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                                try {
                                    at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
                                    var_constraints = com.cyc.cycjava.cycl.at_var_types.cnfs_variables_isa_constraints(cnfs, mt, $sym2$CYC_VAR_);
                                    inter_arg_constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_inter_arg_isa_constraints(var, cnfs, var_constraints, mt), mt);
                                } finally {
                                    at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (pcase_var.eql($GENLS)) {
                                {
                                    SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
                                    try {
                                        at_vars.$at_check_inter_arg_genlP$.bind(NIL, thread);
                                        var_constraints = com.cyc.cycjava.cycl.at_var_types.cnfs_variables_genl_constraints(cnfs, mt, $sym2$CYC_VAR_);
                                        inter_arg_constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.cnfs_variable_inter_arg_genl_constraints(var, cnfs, var_constraints, mt), mt);
                                    } finally {
                                        at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                        return inter_arg_constraints;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cnf_formula_variable_inter_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject formula_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isAtom()) {
            thread.resetMultipleValues();
            final SubLObject cnfs = at_var_type_cnfs(formula, formula_mt);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject var_constraints = NIL;
            SubLObject inter_arg_constraints = NIL;
            if (type.eql($ISA)) {
                final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                try {
                    at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
                    var_constraints = cnfs_variables_isa_constraints(cnfs, mt, $sym2$CYC_VAR_);
                    inter_arg_constraints = at_min_cols(cnfs_variable_inter_arg_isa_constraints(var, cnfs, var_constraints, mt), mt);
                } finally {
                    at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
                }
            } else
                if (type.eql($GENLS)) {
                    final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
                    try {
                        at_vars.$at_check_inter_arg_genlP$.bind(NIL, thread);
                        var_constraints = cnfs_variables_genl_constraints(cnfs, mt, $sym2$CYC_VAR_);
                        inter_arg_constraints = at_min_cols(cnfs_variable_inter_arg_genl_constraints(var, cnfs, var_constraints, mt), mt);
                    } finally {
                        at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_0, thread);
                    }
                }

            return inter_arg_constraints;
        }
        return NIL;
    }

    public static final SubLObject dnf_formula_variable_inter_arg_constraints_alt(SubLObject var, SubLObject formula, SubLObject type, SubLObject formula_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!formula.isAtom()) {
                thread.resetMultipleValues();
                {
                    SubLObject dnfs = com.cyc.cycjava.cycl.at_var_types.at_var_type_dnfs(formula, formula_mt, NIL);
                    SubLObject mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject var_constraints = NIL;
                        SubLObject inter_arg_constraints = NIL;
                        if (dnfs.isCons()) {
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($ISA)) {
                                    {
                                        SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
                                            var_constraints = com.cyc.cycjava.cycl.at_var_types.dnfs_variables_isa_constraints(dnfs, mt, $sym2$CYC_VAR_);
                                            inter_arg_constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_inter_arg_isa_constraints(var, dnfs, var_constraints, mt), mt);
                                        } finally {
                                            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($GENLS)) {
                                        {
                                            SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
                                            try {
                                                at_vars.$at_check_inter_arg_genlP$.bind(NIL, thread);
                                                var_constraints = com.cyc.cycjava.cycl.at_var_types.dnfs_variables_genl_constraints(dnfs, mt, $sym2$CYC_VAR_);
                                                inter_arg_constraints = com.cyc.cycjava.cycl.at_var_types.at_min_cols(com.cyc.cycjava.cycl.at_var_types.dnfs_variable_inter_arg_genl_constraints(var, dnfs, var_constraints, mt), mt);
                                            } finally {
                                                at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != inter_arg_constraints) {
                                if (NIL != list_utilities.singletonP(dnfs)) {
                                    return inter_arg_constraints;
                                } else {
                                    return genls.min_ceiling_cols(inter_arg_constraints, NIL, mt, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject dnf_formula_variable_inter_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject formula_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isAtom()) {
            thread.resetMultipleValues();
            final SubLObject dnfs = at_var_type_dnfs(formula, formula_mt, NIL);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject var_constraints = NIL;
            SubLObject inter_arg_constraints = NIL;
            if (dnfs.isCons()) {
                if (type.eql($ISA)) {
                    final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                    try {
                        at_vars.$at_check_inter_arg_isaP$.bind(NIL, thread);
                        var_constraints = dnfs_variables_isa_constraints(dnfs, mt, $sym2$CYC_VAR_);
                        inter_arg_constraints = at_min_cols(dnfs_variable_inter_arg_isa_constraints(var, dnfs, var_constraints, mt), mt);
                    } finally {
                        at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (type.eql($GENLS)) {
                        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_inter_arg_genlP$.bind(NIL, thread);
                            var_constraints = dnfs_variables_genl_constraints(dnfs, mt, $sym2$CYC_VAR_);
                            inter_arg_constraints = at_min_cols(dnfs_variable_inter_arg_genl_constraints(var, dnfs, var_constraints, mt), mt);
                        } finally {
                            at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_0, thread);
                        }
                    }

                if (NIL != inter_arg_constraints) {
                    if (NIL != list_utilities.singletonP(dnfs)) {
                        return inter_arg_constraints;
                    }
                    return genls.min_ceiling_cols(inter_arg_constraints, NIL, mt, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject relation_variable_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != relation_expressionP(formula)) {
                {
                    SubLObject relation = cycl_utilities.formula_operator(formula);
                    SubLObject scoping_args = NIL;
                    SubLObject result = NIL;
                    if (var.eql(relation)) {
                        result = cons($$Relation, result);
                    } else {
                        if (!relation.isAtom()) {
                            relation = narts_high.nart_substitute(relation);
                        }
                    }
                    scoping_args = (NIL != forts.fort_p(relation)) ? ((SubLObject) (kb_accessors.scoping_args(relation, mt))) : NIL;
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                {
                                    SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(relation)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(relation, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(relation, UNPROVIDED))))) : NIL;
                                    {
                                        SubLObject _prev_bind_0_78 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_79 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            {
                                                SubLObject argnum = ZERO_INTEGER;
                                                SubLObject args = cycl_utilities.formula_args(formula, $REGULARIZE);
                                                SubLObject cdolist_list_var = args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    argnum = add(argnum, ONE_INTEGER);
                                                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_isa(relation, argnum));
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(relation, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                                                        if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_isa_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(relation, argnum, mt)));
                                                                        }
                                                                    } else {
                                                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_isa_constraints(var, arg, mt));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.at_var_types.at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                                            }
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_79, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_78, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject relation_variable_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != relation_expressionP(formula)) {
            SubLObject relation = cycl_utilities.formula_operator(formula);
            SubLObject scoping_args = NIL;
            SubLObject result = NIL;
            if (var.eql(relation)) {
                result = cons($$Relation, result);
            } else
                if (!relation.isAtom()) {
                    relation = narts_high.nart_substitute(relation);
                }

            scoping_args = (NIL != forts.fort_p(relation)) ? kb_accessors.scoping_args(relation, mt) : NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                final SubLObject genl_somethingP = (NIL != forts.fort_p(relation)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation, UNPROVIDED, UNPROVIDED))) : NIL;
                final SubLObject _prev_bind_0_$82 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(relation, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $REGULARIZE);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                if (var.equal(arg)) {
                                    result = nconc(result, at_argn_isa(relation, argnum));
                                } else
                                    if (NIL == modal_in_argP(relation, argnum, mt)) {
                                        if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                            if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                result = nconc(result, formula_variable_isa_constraints(var, arg, mt, at_arg_formula_type(relation, argnum, mt)));
                                            }
                                        } else
                                            if (NIL == term.unreified_skolem_termP(arg)) {
                                                if (NIL == arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_isa_constraints(var, arg, mt));
                                                    }
                                                }
                                            }

                                    }

                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                    result = at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$83, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$82, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject relation_variable_quoted_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != relation_expressionP(formula)) {
                {
                    SubLObject relation = cycl_utilities.formula_operator(formula);
                    SubLObject scoping_args = NIL;
                    SubLObject result = NIL;
                    if (!relation.isAtom()) {
                        relation = narts_high.nart_substitute(relation);
                    }
                    scoping_args = (NIL != forts.fort_p(relation)) ? ((SubLObject) (kb_accessors.scoping_args(relation, mt))) : NIL;
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                {
                                    SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(relation)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(relation, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(relation, UNPROVIDED))))) : NIL;
                                    {
                                        SubLObject _prev_bind_0_80 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_81 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            {
                                                SubLObject argnum = ZERO_INTEGER;
                                                SubLObject args = cycl_utilities.formula_args(formula, $REGULARIZE);
                                                SubLObject cdolist_list_var = args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    argnum = add(argnum, ONE_INTEGER);
                                                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_quoted_isa(relation, argnum));
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(relation, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                                                        if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_quoted_isa_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(relation, argnum, mt)));
                                                                        }
                                                                    } else {
                                                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_quoted_isa_constraints(var, arg, mt));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.at_var_types.at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                                            }
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_81, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_80, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject relation_variable_quoted_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != relation_expressionP(formula)) {
            SubLObject relation = cycl_utilities.formula_operator(formula);
            SubLObject scoping_args = NIL;
            SubLObject result = NIL;
            if (!relation.isAtom()) {
                relation = narts_high.nart_substitute(relation);
            }
            scoping_args = (NIL != forts.fort_p(relation)) ? kb_accessors.scoping_args(relation, mt) : NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                final SubLObject genl_somethingP = (NIL != forts.fort_p(relation)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation, UNPROVIDED, UNPROVIDED))) : NIL;
                final SubLObject _prev_bind_0_$84 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$85 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(relation, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $REGULARIZE);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                if (var.equal(arg)) {
                                    result = nconc(result, at_argn_quoted_isa(relation, argnum));
                                } else
                                    if (NIL == modal_in_argP(relation, argnum, mt)) {
                                        if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                            if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                result = nconc(result, formula_variable_quoted_isa_constraints(var, arg, mt, at_arg_formula_type(relation, argnum, mt)));
                                            }
                                        } else
                                            if (NIL == term.unreified_skolem_termP(arg)) {
                                                if (NIL == arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_quoted_isa_constraints(var, arg, mt));
                                                    }
                                                }
                                            }

                                    }

                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                    result = at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$85, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$84, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject relation_variable_genl_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != relation_expressionP(formula)) {
                {
                    SubLObject relation = cycl_utilities.formula_operator(formula);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject scoping_args = NIL;
                    SubLObject result = NIL;
                    if (!relation.isAtom()) {
                        relation = narts_high.nart_substitute(relation);
                    }
                    scoping_args = (NIL != forts.fort_p(relation)) ? ((SubLObject) (kb_accessors.scoping_args(relation, mt))) : NIL;
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                {
                                    SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(relation)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(relation, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(relation, UNPROVIDED))))) : NIL;
                                    {
                                        SubLObject _prev_bind_0_82 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_83 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            {
                                                SubLObject args = cycl_utilities.formula_args(formula, $REGULARIZE);
                                                SubLObject cdolist_list_var = args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    argnum = add(argnum, ONE_INTEGER);
                                                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_genl(relation, argnum));
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(relation, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                                                        if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_genl_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(relation, argnum, mt)));
                                                                        }
                                                                    } else {
                                                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_genl_constraints(var, arg, mt));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.at_var_types.at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                                            }
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_83, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_82, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject relation_variable_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != relation_expressionP(formula)) {
            SubLObject relation = cycl_utilities.formula_operator(formula);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject scoping_args = NIL;
            SubLObject result = NIL;
            if (!relation.isAtom()) {
                relation = narts_high.nart_substitute(relation);
            }
            scoping_args = (NIL != forts.fort_p(relation)) ? kb_accessors.scoping_args(relation, mt) : NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                final SubLObject genl_somethingP = (NIL != forts.fort_p(relation)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation, UNPROVIDED, UNPROVIDED))) : NIL;
                final SubLObject _prev_bind_0_$86 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$87 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(relation, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $REGULARIZE);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                if (var.equal(arg)) {
                                    result = nconc(result, at_argn_genl(relation, argnum));
                                } else
                                    if (NIL == modal_in_argP(relation, argnum, mt)) {
                                        if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                            if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                result = nconc(result, formula_variable_genl_constraints(var, arg, mt, at_arg_formula_type(relation, argnum, mt)));
                                            }
                                        } else
                                            if (NIL == term.unreified_skolem_termP(arg)) {
                                                if (NIL == arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_genl_constraints(var, arg, mt));
                                                    }
                                                }
                                            }

                                    }

                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                    result = at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$87, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$86, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject relation_variable_inter_arg_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != term.function_termP(formula)) {
                {
                    SubLObject relation = cycl_utilities.formula_operator(formula);
                    SubLObject v_arity = formula_arity(formula, UNPROVIDED);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject scoping_args = NIL;
                    SubLObject result = NIL;
                    if (!relation.isAtom()) {
                        relation = narts_high.nart_substitute(relation);
                    }
                    scoping_args = (NIL != forts.fort_p(relation)) ? ((SubLObject) (kb_accessors.scoping_args(relation, mt))) : NIL;
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                {
                                    SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(relation)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(relation, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(relation, UNPROVIDED))))) : NIL;
                                    {
                                        SubLObject _prev_bind_0_84 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_85 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            {
                                                SubLObject args = cycl_utilities.formula_args(formula, $REGULARIZE);
                                                SubLObject cdolist_list_var = args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    argnum = add(argnum, ONE_INTEGER);
                                                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                {
                                                                    SubLObject index = NIL;
                                                                    for (index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                                                        {
                                                                            SubLObject ind_argnum = add(index, ONE_INTEGER);
                                                                            if (!argnum.numE(ind_argnum)) {
                                                                                {
                                                                                    SubLObject ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
                                                                                    if (NIL == ind_arg) {
                                                                                    } else {
                                                                                        if ((NIL != forts.fort_p(ind_arg)) || (NIL != term.first_order_nautP(ind_arg))) {
                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_isa(relation, argnum, ind_arg, ind_argnum));
                                                                                        } else {
                                                                                            {
                                                                                                SubLObject cdolist_list_var_86 = assoc(ind_arg, at_vars.$at_var_isa$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject ind_type = NIL;
                                                                                                for (ind_type = cdolist_list_var_86.first(); NIL != cdolist_list_var_86; cdolist_list_var_86 = cdolist_list_var_86.rest() , ind_type = cdolist_list_var_86.first()) {
                                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_from_type(relation, argnum, ind_type, ind_argnum));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(relation, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                                                        if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_isa_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(relation, argnum, mt)));
                                                                        }
                                                                    } else {
                                                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_inter_arg_isa_constraints(var, arg, mt));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.at_var_types.at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                                            }
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_85, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_84, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject relation_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != term.function_termP(formula)) {
            SubLObject relation = cycl_utilities.formula_operator(formula);
            final SubLObject v_arity = formula_arity(formula, UNPROVIDED);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject scoping_args = NIL;
            SubLObject result = NIL;
            if (!relation.isAtom()) {
                relation = narts_high.nart_substitute(relation);
            }
            scoping_args = (NIL != forts.fort_p(relation)) ? kb_accessors.scoping_args(relation, mt) : NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                final SubLObject genl_somethingP = (NIL != forts.fort_p(relation)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation, UNPROVIDED, UNPROVIDED))) : NIL;
                final SubLObject _prev_bind_0_$88 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$89 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(relation, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $REGULARIZE);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                if (var.equal(arg)) {
                                    SubLObject index;
                                    SubLObject ind_argnum;
                                    SubLObject ind_arg;
                                    SubLObject cdolist_list_var_$90;
                                    SubLObject ind_type;
                                    for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                        ind_argnum = add(index, ONE_INTEGER);
                                        if (!argnum.numE(ind_argnum)) {
                                            ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
                                            if (NIL != ind_arg) {
                                                if ((NIL != forts.fort_p(ind_arg)) || (NIL != term.first_order_nautP(ind_arg))) {
                                                    result = nconc(result, inter_arg_isa(relation, argnum, ind_arg, ind_argnum));
                                                } else {
                                                    cdolist_list_var_$90 = assoc(ind_arg, at_vars.$at_var_isa$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    ind_type = NIL;
                                                    ind_type = cdolist_list_var_$90.first();
                                                    while (NIL != cdolist_list_var_$90) {
                                                        result = nconc(result, inter_arg_isa_from_type(relation, argnum, ind_type, ind_argnum));
                                                        cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                                                        ind_type = cdolist_list_var_$90.first();
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                } else
                                    if (NIL == modal_in_argP(relation, argnum, mt)) {
                                        if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                            if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                result = nconc(result, formula_variable_inter_arg_isa_constraints(var, arg, mt, at_arg_formula_type(relation, argnum, mt)));
                                            }
                                        } else
                                            if (NIL == term.unreified_skolem_termP(arg)) {
                                                if (NIL == arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_inter_arg_isa_constraints(var, arg, mt));
                                                    }
                                                }
                                            }

                                    }

                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                    result = at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$89, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$88, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject relation_variable_inter_arg_genl_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != term.function_termP(formula)) {
                {
                    SubLObject relation = cycl_utilities.formula_operator(formula);
                    SubLObject v_arity = formula_arity(formula, UNPROVIDED);
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject scoping_args = NIL;
                    SubLObject result = NIL;
                    if (!relation.isAtom()) {
                        relation = narts_high.nart_substitute(relation);
                    }
                    scoping_args = (NIL != forts.fort_p(relation)) ? ((SubLObject) (kb_accessors.scoping_args(relation, mt))) : NIL;
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                {
                                    SubLObject asserted_genl_somethingP = (NIL != forts.fort_p(relation)) ? ((SubLObject) (makeBoolean((NIL != genl_predicates.asserted_genl_predicatesP(relation, UNPROVIDED)) || (NIL != genl_predicates.asserted_genl_inversesP(relation, UNPROVIDED))))) : NIL;
                                    {
                                        SubLObject _prev_bind_0_87 = at_vars.$at_reln$.currentBinding(thread);
                                        SubLObject _prev_bind_1_88 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                        try {
                                            at_vars.$at_reln$.bind(relation, thread);
                                            at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != asserted_genl_somethingP)), thread);
                                            {
                                                SubLObject args = cycl_utilities.formula_args(formula, $REGULARIZE);
                                                SubLObject cdolist_list_var = args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    argnum = add(argnum, ONE_INTEGER);
                                                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                    } else {
                                                        if (NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                                        } else {
                                                            if (var.equal(arg)) {
                                                                {
                                                                    SubLObject index = NIL;
                                                                    for (index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                                                        {
                                                                            SubLObject ind_argnum = add(index, ONE_INTEGER);
                                                                            if (!argnum.numE(ind_argnum)) {
                                                                                {
                                                                                    SubLObject ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
                                                                                    if (NIL == ind_arg) {
                                                                                    } else {
                                                                                        if ((NIL != forts.fort_p(ind_arg)) || (NIL != term.first_order_nautP(ind_arg))) {
                                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_genl(relation, argnum, ind_arg, ind_argnum));
                                                                                        } else {
                                                                                            {
                                                                                                SubLObject cdolist_list_var_89 = assoc(ind_arg, at_vars.$at_var_genl$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject ind_type = NIL;
                                                                                                for (ind_type = cdolist_list_var_89.first(); NIL != cdolist_list_var_89; cdolist_list_var_89 = cdolist_list_var_89.rest() , ind_type = cdolist_list_var_89.first()) {
                                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.inter_arg_genl_from_type(relation, argnum, ind_type, ind_argnum));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.at_var_types.modal_in_argP(relation, argnum, mt)) {
                                                                } else {
                                                                    if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                                                        if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.formula_variable_inter_arg_genl_constraints(var, arg, mt, com.cyc.cycjava.cycl.at_var_types.at_arg_formula_type(relation, argnum, mt)));
                                                                        }
                                                                    } else {
                                                                        if (NIL != term.unreified_skolem_termP(arg)) {
                                                                        } else {
                                                                            if (NIL != arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                                            } else {
                                                                                if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                                                    result = nconc(result, com.cyc.cycjava.cycl.at_var_types.relation_variable_inter_arg_genl_constraints(var, arg, mt));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                result = com.cyc.cycjava.cycl.at_var_types.at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                                            }
                                        } finally {
                                            at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                                            at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_88, thread);
                                            at_vars.$at_reln$.rebind(_prev_bind_0_87, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject relation_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != term.function_termP(formula)) {
            SubLObject relation = cycl_utilities.formula_operator(formula);
            final SubLObject v_arity = formula_arity(formula, UNPROVIDED);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject scoping_args = NIL;
            SubLObject result = NIL;
            if (!relation.isAtom()) {
                relation = narts_high.nart_substitute(relation);
            }
            scoping_args = (NIL != forts.fort_p(relation)) ? kb_accessors.scoping_args(relation, mt) : NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                final SubLObject genl_somethingP = (NIL != forts.fort_p(relation)) ? makeBoolean((NIL != genl_predicates.genl_predicates(relation, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(relation, UNPROVIDED, UNPROVIDED))) : NIL;
                final SubLObject _prev_bind_0_$91 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$92 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(relation, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $REGULARIZE);
                    SubLObject arg = NIL;
                    arg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        argnum = add(argnum, ONE_INTEGER);
                        if (NIL == subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP(relation, argnum, mt)) {
                                if (var.equal(arg)) {
                                    SubLObject index;
                                    SubLObject ind_argnum;
                                    SubLObject ind_arg;
                                    SubLObject cdolist_list_var_$93;
                                    SubLObject ind_type;
                                    for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                        ind_argnum = add(index, ONE_INTEGER);
                                        if (!argnum.numE(ind_argnum)) {
                                            ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
                                            if (NIL != ind_arg) {
                                                if ((NIL != forts.fort_p(ind_arg)) || (NIL != term.first_order_nautP(ind_arg))) {
                                                    result = nconc(result, inter_arg_genl(relation, argnum, ind_arg, ind_argnum));
                                                } else {
                                                    cdolist_list_var_$93 = assoc(ind_arg, at_vars.$at_var_genl$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    ind_type = NIL;
                                                    ind_type = cdolist_list_var_$93.first();
                                                    while (NIL != cdolist_list_var_$93) {
                                                        result = nconc(result, inter_arg_genl_from_type(relation, argnum, ind_type, ind_argnum));
                                                        cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                                                        ind_type = cdolist_list_var_$93.first();
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                } else
                                    if (NIL == modal_in_argP(relation, argnum, mt)) {
                                        if (NIL != czer_utilities.sentence_argP(relation, argnum, mt)) {
                                            if (NIL != czer_utilities.assertable_sentence_argP(relation, argnum, mt)) {
                                                result = nconc(result, formula_variable_inter_arg_genl_constraints(var, arg, mt, at_arg_formula_type(relation, argnum, mt)));
                                            }
                                        } else
                                            if (NIL == term.unreified_skolem_termP(arg)) {
                                                if (NIL == arg_types_prescribe_tacit_term_listP(relation, argnum)) {
                                                    if (NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED)) {
                                                        result = nconc(result, relation_variable_inter_arg_genl_constraints(var, arg, mt));
                                                    }
                                                }
                                            }

                                    }

                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        arg = cdolist_list_var.first();
                    } 
                    result = at_min_cols(list_utilities.delete_duplicate_forts(result), mt);
                } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$92, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$91, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject at_min_cols_alt(SubLObject cols, SubLObject mt) {
        return copy_list(com.cyc.cycjava.cycl.at_var_types.at_min_cols_memoized(kb_utilities.sort_terms(cols, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt));
    }

    public static SubLObject at_min_cols(final SubLObject cols, final SubLObject mt) {
        if (NIL == cols) {
            return NIL;
        }
        return copy_list(at_min_cols_memoized(kb_utilities.sort_terms(cols, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt));
    }

    public static final SubLObject at_min_cols_memoized_internal_alt(SubLObject cols, SubLObject mt) {
        return genls.min_cols(cols, mt, UNPROVIDED);
    }

    public static SubLObject at_min_cols_memoized_internal(final SubLObject cols, final SubLObject mt) {
        return genls.min_cols(cols, mt, UNPROVIDED);
    }

    public static final SubLObject at_min_cols_memoized_alt(SubLObject cols, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.at_var_types.at_min_cols_memoized_internal(cols, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, AT_MIN_COLS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), AT_MIN_COLS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, AT_MIN_COLS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(cols, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (cols.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.at_var_types.at_min_cols_memoized_internal(cols, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cols, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject at_min_cols_memoized(final SubLObject cols, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return at_min_cols_memoized_internal(cols, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, AT_MIN_COLS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), AT_MIN_COLS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, AT_MIN_COLS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cols, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cols.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(at_min_cols_memoized_internal(cols, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cols, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return boolean; t iff RELN's ARGNUMth arg arg is to be interpreted as a query (vs an assertion).
     */
    @LispMethod(comment = "@return boolean; t iff RELN\'s ARGNUMth arg arg is to be interpreted as a query (vs an assertion).")
    public static final SubLObject query_argP_alt(SubLObject reln, SubLObject argnum, SubLObject mt) {
        if (argnum.isInteger() && argnum.numG(ZERO_INTEGER)) {
            {
                SubLObject queryP = NIL;
                if (NIL == queryP) {
                    {
                        SubLObject csome_list_var = kb_accessors.argn_isa(reln, argnum, mt);
                        SubLObject collection = NIL;
                        for (collection = csome_list_var.first(); !((NIL != queryP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                            queryP = com.cyc.cycjava.cycl.at_var_types.query_denoting_collectionP(collection, mt);
                        }
                    }
                }
                if (NIL == queryP) {
                    {
                        SubLObject csome_list_var = kb_accessors.argn_quoted_isa(reln, argnum, mt);
                        SubLObject collection = NIL;
                        for (collection = csome_list_var.first(); !((NIL != queryP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                            queryP = com.cyc.cycjava.cycl.at_var_types.query_denoting_collectionP(collection, mt);
                        }
                    }
                }
                return queryP;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff RELN's ARGNUMth arg arg is to be interpreted as a query (vs an assertion).
     */
    @LispMethod(comment = "@return boolean; t iff RELN\'s ARGNUMth arg arg is to be interpreted as a query (vs an assertion).")
    public static SubLObject query_argP(final SubLObject reln, final SubLObject argnum, final SubLObject mt) {
        if (argnum.isInteger() && argnum.numG(ZERO_INTEGER)) {
            SubLObject queryP = NIL;
            if (NIL == queryP) {
                SubLObject csome_list_var;
                SubLObject collection;
                for (csome_list_var = kb_accessors.argn_isa(reln, argnum, mt), collection = NIL, collection = csome_list_var.first(); (NIL == queryP) && (NIL != csome_list_var); queryP = query_denoting_collectionP(collection, mt) , csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                }
            }
            if (NIL == queryP) {
                SubLObject csome_list_var;
                SubLObject collection;
                for (csome_list_var = kb_accessors.argn_quoted_isa(reln, argnum, mt), collection = NIL, collection = csome_list_var.first(); (NIL == queryP) && (NIL != csome_list_var); queryP = query_denoting_collectionP(collection, mt) , csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                }
            }
            return queryP;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff the instances of COLLECTION are constrained to be a query
     */
    @LispMethod(comment = "@return boolean; t iff the instances of COLLECTION are constrained to be a query")
    public static final SubLObject query_denoting_collectionP_alt(SubLObject collection, SubLObject mt) {
        return subl_promotions.memberP($sym43$CYC_QUERY_, kb_accessors.admitting_defns(collection, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff the instances of COLLECTION are constrained to be a query
     */
    @LispMethod(comment = "@return boolean; t iff the instances of COLLECTION are constrained to be a query")
    public static SubLObject query_denoting_collectionP(final SubLObject collection, final SubLObject mt) {
        return subl_promotions.memberP($sym55$CYC_QUERY_, kb_accessors.admitting_defns(collection, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject at_arg_formula_type_alt(SubLObject reln, SubLObject argnum, SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.at_var_types.query_argP(reln, argnum, mt)) {
            return $DNF;
        } else {
            if (NIL != term.mt_designating_relationP(reln)) {
                return $CNF;
            } else {
                if (NIL != czer_utilities.sentence_argP(reln, argnum, mt)) {
                    return $DNF;
                }
            }
        }
        return NIL;
    }

    public static SubLObject at_arg_formula_type(final SubLObject reln, final SubLObject argnum, final SubLObject mt) {
        if (NIL != query_argP(reln, argnum, mt)) {
            return $DNF;
        }
        if (NIL != term.mt_designating_relationP(reln)) {
            return $CNF;
        }
        if (NIL != czer_utilities.sentence_argP(reln, argnum, mt)) {
            return $DNF;
        }
        return NIL;
    }

    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject at_argn_isa_alt(SubLObject relation, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mapping_assertion_bookkeeping_fn$.currentBinding(thread);
                    try {
                        at_vars.$at_constraint_type$.bind($ISA, thread);
                        $mapping_assertion_bookkeeping_fn$.bind(GATHER_AT_DATA_ASSERTION, thread);
                        result = com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, NIL, NIL, ARGN_ISA, TWO_INTEGER);
                    } finally {
                        $mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_1, thread);
                        at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject at_argn_isa(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mapping_assertion_bookkeeping_fn$.currentBinding(thread);
        try {
            at_vars.$at_constraint_type$.bind($ISA, thread);
            $mapping_assertion_bookkeeping_fn$.bind(GATHER_AT_DATA_ASSERTION, thread);
            result = at_argn_int(relation, argnum, NIL, NIL, ARGN_ISA, TWO_INTEGER);
        } finally {
            $mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_2, thread);
            at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject at_argn_quoted_isa_alt(SubLObject relation, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mapping_assertion_bookkeeping_fn$.currentBinding(thread);
                    try {
                        at_vars.$at_constraint_type$.bind($ISA, thread);
                        $mapping_assertion_bookkeeping_fn$.bind(GATHER_AT_DATA_ASSERTION, thread);
                        result = com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, NIL, NIL, ARGN_QUOTED_ISA, TWO_INTEGER);
                    } finally {
                        $mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_1, thread);
                        at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject at_argn_quoted_isa(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mapping_assertion_bookkeeping_fn$.currentBinding(thread);
        try {
            at_vars.$at_constraint_type$.bind($ISA, thread);
            $mapping_assertion_bookkeeping_fn$.bind(GATHER_AT_DATA_ASSERTION, thread);
            result = at_argn_int(relation, argnum, NIL, NIL, ARGN_QUOTED_ISA, TWO_INTEGER);
        } finally {
            $mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_2, thread);
            at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject at_argn_genl_alt(SubLObject relation, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mapping_assertion_bookkeeping_fn$.currentBinding(thread);
                    try {
                        at_vars.$at_constraint_type$.bind($GENLS, thread);
                        $mapping_assertion_bookkeeping_fn$.bind(GATHER_AT_DATA_ASSERTION, thread);
                        result = com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, NIL, NIL, ARGN_GENL, TWO_INTEGER);
                    } finally {
                        $mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_1, thread);
                        at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject at_argn_genl(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mapping_assertion_bookkeeping_fn$.currentBinding(thread);
        try {
            at_vars.$at_constraint_type$.bind($GENLS, thread);
            $mapping_assertion_bookkeeping_fn$.bind(GATHER_AT_DATA_ASSERTION, thread);
            result = at_argn_int(relation, argnum, NIL, NIL, ARGN_GENL, TWO_INTEGER);
        } finally {
            $mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_2, thread);
            at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject inter_arg_isa_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum) {
        return com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, ind_arg, ind_argnum, INTER_ARG_ISA_INT, FOUR_INTEGER);
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject inter_arg_isa(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum) {
        return at_argn_int(relation, argnum, ind_arg, ind_argnum, INTER_ARG_ISA_INT, FOUR_INTEGER);
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject inter_arg_genl_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum) {
        return com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, ind_arg, ind_argnum, INTER_ARG_GENL_INT, FOUR_INTEGER);
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject inter_arg_genl(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum) {
        return at_argn_int(relation, argnum, ind_arg, ind_argnum, INTER_ARG_GENL_INT, FOUR_INTEGER);
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject inter_arg_isa_from_type_alt(SubLObject relation, SubLObject argnum, SubLObject ind_type, SubLObject ind_argnum) {
        {
            SubLObject result = NIL;
            if (NIL != term.el_fort_p(ind_type)) {
                result = com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, ind_type, ind_argnum, INTER_ARG_ISA_FROM_TYPE_INT, FOUR_INTEGER);
            } else {
                result = NIL;
            }
            return result;
        }
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject inter_arg_isa_from_type(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum) {
        SubLObject result = NIL;
        if (NIL != term.el_fort_p(ind_type)) {
            result = at_argn_int(relation, argnum, ind_type, ind_argnum, INTER_ARG_ISA_FROM_TYPE_INT, FOUR_INTEGER);
        } else {
            result = NIL;
        }
        return result;
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    /**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */
    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static final SubLObject inter_arg_genl_from_type_alt(SubLObject relation, SubLObject argnum, SubLObject ind_type, SubLObject ind_argnum) {
        {
            SubLObject result = NIL;
            if (NIL != term.el_fort_p(ind_type)) {
                result = com.cyc.cycjava.cycl.at_var_types.at_argn_int(relation, argnum, ind_type, ind_argnum, INTER_ARG_GENL_FROM_TYPE_INT, FOUR_INTEGER);
            } else {
                result = NIL;
            }
            return result;
        }
    }

    @LispMethod(comment = "assumes mt relevance established from outside,\r\nand that we are within a with-at-reln macro.\nassumes mt relevance established from outside,\nand that we are within a with-at-reln macro.")
    public static SubLObject inter_arg_genl_from_type(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum) {
        SubLObject result = NIL;
        if (NIL != term.el_fort_p(ind_type)) {
            result = at_argn_int(relation, argnum, ind_type, ind_argnum, INTER_ARG_GENL_FROM_TYPE_INT, FOUR_INTEGER);
        } else {
            result = NIL;
        }
        return result;
    }/**
     * assumes mt relevance established from outside,
     * and that we are within a with-at-reln macro.
     */


    public static final SubLObject at_argn_int_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity) {
        return copy_list(com.cyc.cycjava.cycl.at_var_types.at_argn_int_cached(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_relevance_macros.mt_info(UNPROVIDED)));
    }

    public static SubLObject at_argn_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity) {
        return copy_list(at_argn_int_cached(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_relevance_macros.mt_info(UNPROVIDED)));
    }

    public static final SubLObject clear_at_argn_int_cached_alt() {
        {
            SubLObject cs = $at_argn_int_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_at_argn_int_cached() {
        final SubLObject cs = $at_argn_int_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_at_argn_int_cached_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity, SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args($at_argn_int_cached_caching_state$.getGlobalValue(), list(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_at_argn_int_cached(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity, final SubLObject mt_info) {
        return memoization_state.caching_state_remove_function_results_with_args($at_argn_int_cached_caching_state$.getGlobalValue(), list(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject at_argn_int_cached_internal_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity, SubLObject mt_info) {
        {
            SubLObject result = NIL;
            if ((NIL != at_vars.at_searching_genl_predsP()) || (NIL != at_vars.at_searching_genl_inversesP())) {
                result = com.cyc.cycjava.cycl.at_var_types.at_argn_int_funcall(at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum);
                if (NIL != at_vars.at_searching_genl_predsP()) {
                    {
                        SubLObject csome_list_var = genl_predicates.all_proper_genl_predicates(relation, NIL, NIL);
                        SubLObject pred = NIL;
                        for (pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_int_funcall(at_func, at_func_arity, pred, argnum, ind_arg, ind_argnum));
                        }
                    }
                }
                if (NIL != at_vars.at_searching_genl_inversesP()) {
                    {
                        SubLObject csome_list_var = genl_predicates.all_proper_genl_inverses(relation, NIL, NIL);
                        SubLObject inverse = NIL;
                        for (inverse = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , inverse = csome_list_var.first()) {
                            result = nconc(result, com.cyc.cycjava.cycl.at_var_types.at_argn_int_funcall(at_func, at_func_arity, inverse, kb_accessors.inverse_argnum(argnum), ind_arg, ind_argnum));
                        }
                    }
                }
                result = list_utilities.delete_duplicate_forts(result);
            } else {
                if (NIL != term.kb_relationP(relation)) {
                    result = com.cyc.cycjava.cycl.at_var_types.at_argn_int_funcall(at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum);
                }
            }
            return result;
        }
    }

    public static SubLObject at_argn_int_cached_internal(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity, final SubLObject mt_info) {
        if (NIL == arity.valid_relation_argnumP(relation, argnum)) {
            return NIL;
        }
        SubLObject result = NIL;
        if ((NIL != at_vars.at_searching_genl_predsP()) || (NIL != at_vars.at_searching_genl_inversesP())) {
            result = at_argn_int_funcall(at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum);
            if (NIL != at_vars.at_searching_genl_predsP()) {
                SubLObject csome_list_var = genl_predicates.all_proper_genl_predicates(relation, NIL, NIL);
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while (NIL != csome_list_var) {
                    result = nconc(result, at_argn_int_funcall(at_func, at_func_arity, pred, argnum, ind_arg, ind_argnum));
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            }
            if (NIL != at_vars.at_searching_genl_inversesP()) {
                SubLObject csome_list_var = genl_predicates.all_proper_genl_inverses(relation, NIL, NIL);
                SubLObject inverse = NIL;
                inverse = csome_list_var.first();
                while (NIL != csome_list_var) {
                    result = nconc(result, at_argn_int_funcall(at_func, at_func_arity, inverse, kb_accessors.inverse_argnum(argnum), ind_arg, ind_argnum));
                    csome_list_var = csome_list_var.rest();
                    inverse = csome_list_var.first();
                } 
            }
            result = list_utilities.delete_duplicate_forts(result);
        } else
            if (NIL != term.kb_relationP(relation)) {
                result = at_argn_int_funcall(at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum);
            }

        return result;
    }

    public static final SubLObject at_argn_int_cached_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity, SubLObject mt_info) {
        {
            SubLObject caching_state = $at_argn_int_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(AT_ARGN_INT_CACHED, $at_argn_int_cached_caching_state$, $int$1024, EQ, SEVEN_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_AT_ARGN_INT_CACHED);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_7(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (argnum == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (ind_arg == cached_args.first()) {
                                            cached_args = cached_args.rest();
                                            if (ind_argnum == cached_args.first()) {
                                                cached_args = cached_args.rest();
                                                if (at_func == cached_args.first()) {
                                                    cached_args = cached_args.rest();
                                                    if (at_func_arity == cached_args.first()) {
                                                        cached_args = cached_args.rest();
                                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                                            return memoization_state.caching_results(results2);
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
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.at_var_types.at_argn_int_cached_internal(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject at_argn_int_cached(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity, final SubLObject mt_info) {
        SubLObject caching_state = $at_argn_int_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(AT_ARGN_INT_CACHED, $at_argn_int_cached_caching_state$, $int$1024, EQL, SEVEN_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_AT_ARGN_INT_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ind_arg.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (ind_argnum.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (at_func.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (at_func_arity.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(at_argn_int_cached_internal(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject at_argn_int_funcall_alt(SubLObject at_func, SubLObject at_func_arity, SubLObject relation, SubLObject arg, SubLObject ind_arg, SubLObject ind_argnum) {
        {
            SubLObject result = NIL;
            SubLObject pcase_var = at_func_arity;
            if (pcase_var.eql(TWO_INTEGER)) {
                {
                    SubLObject pcase_var_90 = at_func;
                    if (pcase_var_90.eql(ARGN_ISA)) {
                        result = kb_accessors.argn_isa(relation, arg, UNPROVIDED);
                    } else {
                        if (pcase_var_90.eql(ARGN_GENL)) {
                            result = kb_accessors.argn_genl(relation, arg, UNPROVIDED);
                        } else {
                            result = funcall(at_func, relation, arg);
                        }
                    }
                }
            } else {
                if (pcase_var.eql(FOUR_INTEGER)) {
                    {
                        SubLObject pcase_var_91 = at_func;
                        if (pcase_var_91.eql(INTER_ARG_ISA_INT)) {
                            result = com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_int(relation, arg, ind_arg, ind_argnum);
                        } else {
                            if (pcase_var_91.eql(INTER_ARG_GENL_INT)) {
                                result = com.cyc.cycjava.cycl.at_var_types.inter_arg_genl_int(relation, arg, ind_arg, ind_argnum);
                            } else {
                                if (pcase_var_91.eql(INTER_ARG_ISA_FROM_TYPE_INT)) {
                                    result = com.cyc.cycjava.cycl.at_var_types.inter_arg_isa_from_type_int(relation, arg, ind_arg, ind_argnum);
                                } else {
                                    if (pcase_var_91.eql(INTER_ARG_GENL_FROM_TYPE_INT)) {
                                        result = com.cyc.cycjava.cycl.at_var_types.inter_arg_genl_from_type_int(relation, arg, ind_arg, ind_argnum);
                                    } else {
                                        result = funcall(at_func, relation, arg, ind_arg, ind_argnum);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    at_utilities.at_error($str_alt55$got_an_unexpected_function__s_wit, at_func, at_func_arity, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return result;
        }
    }

    public static SubLObject at_argn_int_funcall(final SubLObject at_func, final SubLObject at_func_arity, final SubLObject relation, final SubLObject arg, final SubLObject ind_arg, final SubLObject ind_argnum) {
        SubLObject result = NIL;
        if (at_func_arity.eql(TWO_INTEGER)) {
            if (at_func.eql(ARGN_ISA)) {
                result = kb_accessors.argn_isa(relation, arg, UNPROVIDED);
            } else
                if (at_func.eql(ARGN_GENL)) {
                    result = kb_accessors.argn_genl(relation, arg, UNPROVIDED);
                } else {
                    result = funcall(at_func, relation, arg);
                }

        } else
            if (at_func_arity.eql(FOUR_INTEGER)) {
                if (at_func.eql(INTER_ARG_ISA_INT)) {
                    result = inter_arg_isa_int(relation, arg, ind_arg, ind_argnum);
                } else
                    if (at_func.eql(INTER_ARG_GENL_INT)) {
                        result = inter_arg_genl_int(relation, arg, ind_arg, ind_argnum);
                    } else
                        if (at_func.eql(INTER_ARG_ISA_FROM_TYPE_INT)) {
                            result = inter_arg_isa_from_type_int(relation, arg, ind_arg, ind_argnum);
                        } else
                            if (at_func.eql(INTER_ARG_GENL_FROM_TYPE_INT)) {
                                result = inter_arg_genl_from_type_int(relation, arg, ind_arg, ind_argnum);
                            } else {
                                result = funcall(at_func, relation, arg, ind_arg, ind_argnum);
                            }



            } else {
                at_utilities.at_error($str67$got_an_unexpected_function__s_wit, at_func, at_func_arity, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return result;
    }

    public static final SubLObject inter_arg_isa_int_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum) {
        {
            SubLObject at_pred = at_utilities.inter_arg_isa_pred(ind_argnum, argnum);
            if (NIL != at_pred) {
                return com.cyc.cycjava.cycl.at_var_types.inter_arg_type_int($ISA, relation, argnum, ind_arg, at_pred);
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum) {
        final SubLObject at_pred = at_utilities.inter_arg_isa_pred(ind_argnum, argnum);
        if (NIL != at_pred) {
            return inter_arg_type_int($ISA, relation, argnum, ind_arg, at_pred);
        }
        return NIL;
    }

    public static final SubLObject inter_arg_genl_int_alt(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum) {
        {
            SubLObject at_pred = at_utilities.inter_arg_genl_pred(ind_argnum, argnum);
            if (NIL != at_pred) {
                return com.cyc.cycjava.cycl.at_var_types.inter_arg_type_int($GENLS, relation, argnum, ind_arg, at_pred);
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_genl_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum) {
        final SubLObject at_pred = at_utilities.inter_arg_genl_pred(ind_argnum, argnum);
        if (NIL != at_pred) {
            return inter_arg_type_int($GENLS, relation, argnum, ind_arg, at_pred);
        }
        return NIL;
    }

    /**
     * param TYPE; :isa or :genls
     */
    @LispMethod(comment = "param TYPE; :isa or :genls")
    public static final SubLObject inter_arg_type_int_alt(SubLObject type, SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject at_pred) {
        {
            SubLObject candidates = NIL;
            SubLObject pred_var = at_pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        {
                                            SubLObject done_var_92 = NIL;
                                            SubLObject token_var_93 = NIL;
                                            while (NIL == done_var_92) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_93);
                                                    SubLObject valid_94 = makeBoolean(token_var_93 != assertion);
                                                    if (NIL != valid_94) {
                                                        {
                                                            SubLObject ind_col = assertions_high.gaf_arg2(assertion);
                                                            SubLObject dep_col = assertions_high.gaf_arg3(assertion);
                                                            candidates = cons(list(ind_col, dep_col, assertion), candidates);
                                                        }
                                                    }
                                                    done_var_92 = makeBoolean(NIL == valid_94);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
            if (NIL != candidates) {
                return com.cyc.cycjava.cycl.at_var_types.inter_arg_type_verify_candidates(candidates, ind_arg, argnum, type);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "param TYPE; :isa or :genls")
    public static SubLObject inter_arg_type_int(final SubLObject type, final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject at_pred) {
        SubLObject candidates = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, at_pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, at_pred);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$96 = NIL;
                        final SubLObject token_var_$97 = NIL;
                        while (NIL == done_var_$96) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                            final SubLObject valid_$98 = makeBoolean(!token_var_$97.eql(assertion));
                            if (NIL != valid_$98) {
                                final SubLObject ind_col = assertions_high.gaf_arg2(assertion);
                                final SubLObject dep_col = assertions_high.gaf_arg3(assertion);
                                candidates = cons(list(ind_col, dep_col, assertion), candidates);
                            }
                            done_var_$96 = makeBoolean(NIL == valid_$98);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        if (NIL != candidates) {
            return inter_arg_type_verify_candidates(candidates, ind_arg, argnum, type);
        }
        return NIL;
    }/**
     * param TYPE; :isa or :genls
     */


    /**
     *
     *
     * @param CANDIDATES;
     * 		a list of triples of the form (ind-col dep-col assertion)
     * @param TYPE;
     * 		:isa or :genls
     */
    @LispMethod(comment = "@param CANDIDATES;\r\n\t\ta list of triples of the form (ind-col dep-col assertion)\r\n@param TYPE;\r\n\t\t:isa or :genls")
    public static final SubLObject inter_arg_type_verify_candidates_alt(SubLObject candidates, SubLObject ind_arg, SubLObject argnum, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject candidate_collections = Mapping.mapcar(symbol_function(FIRST), candidates);
                SubLObject actual_collections = (type == $ISA) ? ((SubLObject) (isa.all_isa_among(ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED))) : genls.all_genls_among(ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED);
                if (NIL != actual_collections) {
                    {
                        SubLObject cdolist_list_var = candidates;
                        SubLObject candidate = NIL;
                        for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                            {
                                SubLObject datum = candidate;
                                SubLObject current = datum;
                                SubLObject ind_col = NIL;
                                SubLObject dep_col = NIL;
                                SubLObject assertion = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt59);
                                ind_col = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt59);
                                dep_col = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt59);
                                assertion = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != subl_promotions.memberP(ind_col, actual_collections, UNPROVIDED, UNPROVIDED)) {
                                        at_utilities.at_note(FIVE_INTEGER, $str_alt60$__at_var__a_test__arg__s__s__cons, type, argnum, at_vars.$at_arg$.getDynamicValue(thread), assertion, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = at_vars.$at_constraint_gaf$.currentBinding(thread);
                                            try {
                                                at_vars.$at_constraint_gaf$.bind(assertion, thread);
                                                at_utilities.gather_at_data(assertion, dep_col, type, at_vars.$at_profile_term$.getDynamicValue(thread));
                                                result = cons(dep_col, result);
                                            } finally {
                                                at_vars.$at_constraint_gaf$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt59);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param CANDIDATES;
     * 		a list of triples of the form (ind-col dep-col assertion)
     * @param TYPE;
     * 		:isa or :genls
     */
    @LispMethod(comment = "@param CANDIDATES;\r\n\t\ta list of triples of the form (ind-col dep-col assertion)\r\n@param TYPE;\r\n\t\t:isa or :genls")
    public static SubLObject inter_arg_type_verify_candidates(final SubLObject candidates, final SubLObject ind_arg, final SubLObject argnum, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject candidate_collections = Mapping.mapcar(symbol_function(FIRST), candidates);
        final SubLObject actual_collections = (type == $ISA) ? isa.all_isa_among(ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED) : genls.all_genls_among(ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED);
        if (NIL != actual_collections) {
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = NIL;
            candidate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = candidate;
                SubLObject ind_col = NIL;
                SubLObject dep_col = NIL;
                SubLObject assertion = NIL;
                destructuring_bind_must_consp(current, datum, $list71);
                ind_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list71);
                dep_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list71);
                assertion = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != subl_promotions.memberP(ind_col, actual_collections, UNPROVIDED, UNPROVIDED)) {
                        at_utilities.at_note(FIVE_INTEGER, $str72$__at_var__a_test__arg__s__s__cons, type, argnum, at_vars.$at_arg$.getDynamicValue(thread), assertion, UNPROVIDED);
                        final SubLObject _prev_bind_0 = at_vars.$at_constraint_gaf$.currentBinding(thread);
                        try {
                            at_vars.$at_constraint_gaf$.bind(assertion, thread);
                            at_utilities.gather_at_data(assertion, dep_col, type, at_vars.$at_profile_term$.getDynamicValue(thread));
                            result = cons(dep_col, result);
                        } finally {
                            at_vars.$at_constraint_gaf$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list71);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject inter_arg_isa_from_type_int_alt(SubLObject relation, SubLObject argnum, SubLObject ind_type, SubLObject ind_argnum) {
        {
            SubLObject at_pred = at_utilities.inter_arg_isa_pred(ind_argnum, argnum);
            if (NIL != at_pred) {
                return com.cyc.cycjava.cycl.at_var_types.inter_arg_type_int($GENLS, relation, argnum, ind_type, at_pred);
            }
        }
        return NIL;
    }

    public static SubLObject inter_arg_isa_from_type_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum) {
        final SubLObject at_pred = at_utilities.inter_arg_isa_pred(ind_argnum, argnum);
        if (NIL != at_pred) {
            return inter_arg_type_int($GENLS, relation, argnum, ind_type, at_pred);
        }
        return NIL;
    }

    public static final SubLObject inter_arg_genl_from_type_int_alt(SubLObject relation, SubLObject argnum, SubLObject ind_type, SubLObject ind_argnum) {
        return com.cyc.cycjava.cycl.at_var_types.inter_arg_genl_int(relation, argnum, ind_type, ind_argnum);
    }

    public static SubLObject inter_arg_genl_from_type_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum) {
        return inter_arg_genl_int(relation, argnum, ind_type, ind_argnum);
    }

    public static final SubLObject constraint_var_types_okP_alt(SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.at_var_types.var_types_okP(var_types_pairs, type, mt);
    }

    public static SubLObject constraint_var_types_okP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return var_types_okP(var_types_pairs, type, mt);
    }

    public static final SubLObject var_types_okP_alt(SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = at_vars.$at_var_types_standard$.getDynamicValue(thread);
                if (pcase_var.eql($NOT_DISJOINT)) {
                    return com.cyc.cycjava.cycl.at_var_types.var_types_not_disjointP(var_types_pairs, type, mt);
                } else {
                    if (pcase_var.eql($NEGLITS_SUBSUME_POSLITS)) {
                        return com.cyc.cycjava.cycl.at_var_types.var_types_neglits_subsume_poslitsP(var_types_pairs, type, mt);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject var_types_okP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = at_vars.$at_var_types_standard$.getDynamicValue(thread);
        if (pcase_var.eql($NOT_DISJOINT)) {
            return var_types_not_disjointP(var_types_pairs, type, mt);
        }
        if (pcase_var.eql($NEGLITS_SUBSUME_POSLITS)) {
            return var_types_neglits_subsume_poslitsP(var_types_pairs, type, mt);
        }
        return NIL;
    }

    public static final SubLObject var_types_not_disjointP_alt(SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject doneP = NIL;
            SubLObject disjointP = NIL;
            SubLObject disjoint = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = var_types_pairs;
                    SubLObject var_types = NIL;
                    for (var_types = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var_types = csome_list_var.first()) {
                        disjoint = disjoint_with.any_disjoint_collection_pair(var_types.rest(), mt);
                        if (NIL != disjoint) {
                            disjointP = T;
                            doneP = at_utilities.at_finishedP(T);
                            at_utilities.note_at_violation(com.cyc.cycjava.cycl.at_var_types.var_type_disjoint_violation(type, var_types.first(), disjoint, mt));
                        }
                    }
                }
            }
            return makeBoolean(NIL == disjointP);
        }
    }

    public static SubLObject var_types_not_disjointP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject doneP = NIL;
        SubLObject disjointP = NIL;
        SubLObject disjoint = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = var_types_pairs;
            SubLObject var_types = NIL;
            var_types = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                disjoint = disjoint_with.any_disjoint_collection_pair(var_types.rest(), mt);
                if (NIL != disjoint) {
                    disjointP = T;
                    doneP = at_utilities.at_finishedP(T);
                    at_utilities.note_at_violation(var_type_disjoint_violation(type, var_types.first(), disjoint, mt));
                }
                csome_list_var = csome_list_var.rest();
                var_types = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == disjointP);
    }

    public static final SubLObject var_type_disjoint_violation_alt(SubLObject type, SubLObject col1, SubLObject col2, SubLObject mt) {
        {
            SubLObject data = NIL;
            SubLObject module = NIL;
            SubLObject pcase_var = type;
            if (pcase_var.eql($ISA)) {
                module = $DISJOINT_ARG_ISA;
            } else {
                if (pcase_var.eql($QUOTED_ISA)) {
                    module = $DISJOINT_ARG_QUOTED_ISA;
                } else {
                    if (pcase_var.eql($GENLS)) {
                        module = $DISJOINT_ARG_GENL;
                    }
                }
            }
            if (NIL == wff_vars.wff_violation_data_terseP()) {
                data = at_routines.wff_violation_verbose_data();
            }
            return listS(module, col1, col2, mt, append(data, NIL));
        }
    }

    public static SubLObject var_type_disjoint_violation(final SubLObject type, final SubLObject col1, final SubLObject col2, final SubLObject mt) {
        SubLObject data = NIL;
        SubLObject module = NIL;
        if (type.eql($ISA)) {
            module = $DISJOINT_ARG_ISA;
        } else
            if (type.eql($QUOTED_ISA)) {
                module = $DISJOINT_ARG_QUOTED_ISA;
            } else
                if (type.eql($GENLS)) {
                    module = $DISJOINT_ARG_GENL;
                }


        if (NIL == wff_vars.wff_violation_data_terseP()) {
            data = at_routines.wff_violation_verbose_data();
        }
        return listS(module, col1, col2, mt, append(data, NIL));
    }

    public static final SubLObject var_types_neglits_subsume_poslitsP_alt(SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject doneP = NIL;
            SubLObject not_subsumedP = NIL;
            SubLObject not_subsumed = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = var_types_pairs;
                    SubLObject var_types = NIL;
                    for (var_types = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var_types = csome_list_var.first()) {
                        not_subsumed = disjoint_with.any_disjoint_collection_pair(var_types.rest(), mt);
                        if (NIL != not_subsumed) {
                            not_subsumedP = T;
                            doneP = at_utilities.at_finishedP(T);
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($ISA)) {
                                    at_utilities.note_at_violation(list($DISJOINT_ARG_ISA, var_types.first(), not_subsumed, mt));
                                } else {
                                    if (pcase_var.eql($QUOTED_ISA)) {
                                        at_utilities.note_at_violation(list($DISJOINT_ARG_QUOTED_ISA, var_types.first(), not_subsumed, mt));
                                    } else {
                                        if (pcase_var.eql($GENLS)) {
                                            at_utilities.note_at_violation(list($DISJOINT_ARG_GENL, var_types.first(), not_subsumed, mt));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == not_subsumedP);
        }
    }

    public static SubLObject var_types_neglits_subsume_poslitsP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject doneP = NIL;
        SubLObject not_subsumedP = NIL;
        SubLObject not_subsumed = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = var_types_pairs;
            SubLObject var_types = NIL;
            var_types = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                not_subsumed = disjoint_with.any_disjoint_collection_pair(var_types.rest(), mt);
                if (NIL != not_subsumed) {
                    not_subsumedP = T;
                    doneP = at_utilities.at_finishedP(T);
                    final SubLObject pcase_var = type;
                    if (pcase_var.eql($ISA)) {
                        at_utilities.note_at_violation(list($DISJOINT_ARG_ISA, var_types.first(), not_subsumed, mt));
                    } else
                        if (pcase_var.eql($QUOTED_ISA)) {
                            at_utilities.note_at_violation(list($DISJOINT_ARG_QUOTED_ISA, var_types.first(), not_subsumed, mt));
                        } else
                            if (pcase_var.eql($GENLS)) {
                                at_utilities.note_at_violation(list($DISJOINT_ARG_GENL, var_types.first(), not_subsumed, mt));
                            }


                }
                csome_list_var = csome_list_var.rest();
                var_types = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == not_subsumedP);
    }

    public static final SubLObject modal_in_argP_alt(SubLObject relation, SubLObject index, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(relation)) {
            return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$modalInArg, relation, ONE_INTEGER, UNPROVIDED)) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$modalInArg, relation, index, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject modal_in_argP(final SubLObject relation, final SubLObject index, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(relation)) {
            return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$modalInArg, relation, ONE_INTEGER, UNPROVIDED)) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$modalInArg, relation, index, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject declare_at_var_types_file_alt() {
        declareFunction("term_var_types_ok_intP", "TERM-VAR-TYPES-OK-INT?", 2, 0, false);
        declareFunction("formula_var_types_ok_intP", "FORMULA-VAR-TYPES-OK-INT?", 2, 0, false);
        declareFunction("inter_formula_var_types_okP", "INTER-FORMULA-VAR-TYPES-OK?", 2, 0, false);
        declareFunction("inter_formula_var_types_ok_intP", "INTER-FORMULA-VAR-TYPES-OK-INT?", 4, 0, false);
        declareFunction("independent_cnfs_variables_arg_constraints_okP", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("independent_cnfs_variables_arg_constraints_okP_int", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
        declareFunction("at_var_type_dnfs", "AT-VAR-TYPE-DNFS", 3, 0, false);
        declareFunction("clear_at_var_type_dnfs_int_cached", "CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED", 0, 0, false);
        declareFunction("remove_at_var_type_dnfs_int_cached", "REMOVE-AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
        declareFunction("at_var_type_dnfs_int_cached_internal", "AT-VAR-TYPE-DNFS-INT-CACHED-INTERNAL", 2, 0, false);
        declareFunction("at_var_type_dnfs_int_cached", "AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
        declareFunction("at_var_type_cnfs", "AT-VAR-TYPE-CNFS", 2, 0, false);
        declareFunction("at_var_type_cnfs_int", "AT-VAR-TYPE-CNFS-INT", 4, 0, false);
        declareFunction("at_var_types_cnfs_clausify", "AT-VAR-TYPES-CNFS-CLAUSIFY", 1, 0, false);
        declareFunction("opaque_arg_wrt_pragmatic_requirementP", "OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?", 2, 0, false);
        declareFunction("at_transform_true_sentence_negation_preds", "AT-TRANSFORM-TRUE-SENTENCE-NEGATION-PREDS", 2, 0, false);
        declareFunction("at_negatedP", "AT-NEGATED?", 1, 0, false);
        declareFunction("at_negate", "AT-NEGATE", 1, 0, false);
        declareFunction("at_var_type_repackage_cnfs", "AT-VAR-TYPE-REPACKAGE-CNFS", 1, 0, false);
        declareFunction("cnf_var_types_okP", "CNF-VAR-TYPES-OK?", 2, 1, false);
        declareFunction("inter_cnf_var_types_okP", "INTER-CNF-VAR-TYPES-OK?", 2, 1, false);
        declareFunction("query_var_types_okP", "QUERY-VAR-TYPES-OK?", 2, 1, false);
        declareFunction("term_variables_arg_constraints", "TERM-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("formula_variables_arg_constraints", "FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("at_el_expand_all", "AT-EL-EXPAND-ALL", 2, 0, false);
        declareFunction("parse_constraint", "PARSE-CONSTRAINT", 2, 0, false);
        declareFunction("formula_variables_arg_constraints_dict", "FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT", 2, 2, false);
        declareFunction("inter_formula_variables_arg_constraints", "INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("independent_formula_variables_arg_constraints", "INDEPENDENT-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("old_formula_variables_arg_constraints", "OLD-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("query_variables_arg_constraints", "QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_query_variables_arg_constraints", "INTER-QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variables_arg_constraints", "CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("independent_cnfs_variables_arg_constraints", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_arg_constraints", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_isa_constraints", "INTER-CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_quoted_isa_constraints", "INTER-CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_genl_constraints", "INTER-CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("hl_cnf_variables_arg_constraints", "HL-CNF-VARIABLES-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction("cnf_variables_arg_constraints", "CNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_arg_constraints_okP", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("inter_cnfs_variables_arg_constraints_okP_int", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
        declareFunction("cnfs_variables_arg_constraints_okP", "CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("cnf_variables_arg_constraints_okP", "CNF-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("var_isa_constraints_wrt_cnfs", "VAR-ISA-CONSTRAINTS-WRT-CNFS", 3, 1, false);
        declareFunction("var_genl_constraints_wrt_cnfs", "VAR-GENL-CONSTRAINTS-WRT-CNFS", 3, 1, false);
        declareFunction("cnfs_variables_isa_constraints", "CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variables_quoted_isa_constraints", "CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variables_genl_constraints", "CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variable_isa_constraints", "CNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnfs_variable_quoted_isa_constraints", "CNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnfs_variable_genl_constraints", "CNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variables_isa_constraints", "CNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnf_variables_quoted_isa_constraints", "CNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnf_variables_genl_constraints", "CNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("cnf_variable_isa_constraints", "CNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variable_quoted_isa_constraints", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variable_genl_constraints", "CNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("cnfs_variable_inter_arg_isa_constraints", "CNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("cnfs_variable_inter_arg_genl_constraints", "CNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("cnf_variable_inter_arg_isa_constraints", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("cnf_variable_inter_arg_genl_constraints", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("cnf_variable_inter_arg_isa_constraints_int", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_variable_inter_arg_genl_constraints_int", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnfs_var_constraint_implications_okP", "CNFS-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
        declareFunction("cnf_var_constraint_implications_okP", "CNF-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
        declareFunction("dnfs_variables_arg_constraints", "DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_dnfs_variables_arg_constraints", "INTER-DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variables_arg_constraints", "DNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("dnfs_variables_arg_constraints_okP", "DNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("dnfs_variables_isa_constraints", "DNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("dnfs_variables_genl_constraints", "DNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("contextualized_dnf_variables_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLES-ISA-CONSTRAINT-TUPLES", 1, 1, false);
        declareFunction("var_isa_constraints_wrt_dnfs", "VAR-ISA-CONSTRAINTS-WRT-DNFS", 3, 1, false);
        declareFunction("var_genl_constraints_wrt_dnfs", "VAR-GENL-CONSTRAINTS-WRT-DNFS", 3, 1, false);
        declareFunction("dnfs_variable_isa_constraints", "DNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnfs_variable_quoted_isa_constraints", "DNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnfs_variable_genl_constraints", "DNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_variables_isa_constraints", "DNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variables_quoted_isa_constraints", "DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variables_genl_constraints", "DNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variable_isa_constraints", "DNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("contextualized_dnf_variable_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLE-ISA-CONSTRAINT-TUPLES", 2, 0, false);
        declareFunction("contextualized_isa_x_y_litP", "CONTEXTUALIZED-ISA-X-Y-LIT?", 1, 0, false);
        new com.cyc.cycjava.cycl.at_var_types.$contextualized_isa_x_y_litP$UnaryFunction();
        declareFunction("dnf_variable_quoted_isa_constraints", "DNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_variable_genl_constraints", "DNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnfs_variable_inter_arg_isa_constraints", "DNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("dnfs_variable_inter_arg_genl_constraints", "DNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_variable_inter_arg_isa_constraints", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_variable_inter_arg_genl_constraints", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_variable_inter_arg_isa_constraints_int", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("dnf_variable_inter_arg_genl_constraints_int", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_neg_lit_variable_isa_constraints", "CNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_neg_lit_variable_quoted_isa_constraints", "CNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_neg_lit_variable_genl_constraints", "CNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_pos_lit_variable_isa_constraints", "CNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_pos_lit_variable_quoted_isa_constraints", "CNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_pos_lit_variable_genl_constraints", "CNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_neg_lit_variable_isa_constraints", "DNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_neg_lit_variable_quoted_isa_constraints", "DNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_neg_lit_variable_genl_constraints", "DNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_pos_lit_variable_isa_constraints", "DNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_pos_lit_variable_quoted_isa_constraints", "DNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_pos_lit_variable_genl_constraints", "DNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("vt_unskolemize_term", "VT-UNSKOLEMIZE-TERM", 1, 0, false);
        declareFunction("neg_lit_variable_isa_constraints", "NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_quoted_isa_constraints", "NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_genl_constraints", "NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_isa_constraints", "POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_isa_constraints_memoized_internal", "POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("pos_lit_variable_isa_constraints_memoized", "POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED", 3, 0, false);
        declareFunction("pos_lit_variable_quoted_isa_constraints", "POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_genl_constraints", "POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_inter_arg_isa_constraints", "NEG-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_inter_arg_genl_constraints", "NEG-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_inter_arg_isa_constraints", "POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("at_inter_arg_checkable_objectP", "AT-INTER-ARG-CHECKABLE-OBJECT?", 1, 0, false);
        declareFunction("pos_lit_variable_inter_arg_genl_constraints", "POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("formula_variable_isa_constraints", "FORMULA-VARIABLE-ISA-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_quoted_isa_constraints", "FORMULA-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_genl_constraints", "FORMULA-VARIABLE-GENL-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_arg_constraints", "FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 1, false);
        declareFunction("cnf_formula_variable_arg_constraints", "CNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_formula_variable_arg_constraints", "DNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("formula_variable_inter_arg_isa_constraints", "FORMULA-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_inter_arg_genl_constraints", "FORMULA-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_inter_arg_constraints", "FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 1, false);
        declareFunction("cnf_formula_variable_inter_arg_constraints", "CNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_formula_variable_inter_arg_constraints", "DNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("relation_variable_isa_constraints", "RELATION-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_quoted_isa_constraints", "RELATION-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_genl_constraints", "RELATION-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_inter_arg_isa_constraints", "RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_inter_arg_genl_constraints", "RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("at_min_cols", "AT-MIN-COLS", 2, 0, false);
        declareFunction("at_min_cols_memoized_internal", "AT-MIN-COLS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("at_min_cols_memoized", "AT-MIN-COLS-MEMOIZED", 2, 0, false);
        declareFunction("query_argP", "QUERY-ARG?", 3, 0, false);
        declareFunction("query_denoting_collectionP", "QUERY-DENOTING-COLLECTION?", 2, 0, false);
        declareFunction("at_arg_formula_type", "AT-ARG-FORMULA-TYPE", 3, 0, false);
        declareFunction("at_argn_isa", "AT-ARGN-ISA", 2, 0, false);
        declareFunction("at_argn_quoted_isa", "AT-ARGN-QUOTED-ISA", 2, 0, false);
        declareFunction("at_argn_genl", "AT-ARGN-GENL", 2, 0, false);
        declareFunction("inter_arg_isa", "INTER-ARG-ISA", 4, 0, false);
        declareFunction("inter_arg_genl", "INTER-ARG-GENL", 4, 0, false);
        declareFunction("inter_arg_isa_from_type", "INTER-ARG-ISA-FROM-TYPE", 4, 0, false);
        declareFunction("inter_arg_genl_from_type", "INTER-ARG-GENL-FROM-TYPE", 4, 0, false);
        declareFunction("at_argn_int", "AT-ARGN-INT", 6, 0, false);
        declareFunction("clear_at_argn_int_cached", "CLEAR-AT-ARGN-INT-CACHED", 0, 0, false);
        new com.cyc.cycjava.cycl.at_var_types.$clear_at_argn_int_cached$ZeroArityFunction();
        declareFunction("remove_at_argn_int_cached", "REMOVE-AT-ARGN-INT-CACHED", 7, 0, false);
        declareFunction("at_argn_int_cached_internal", "AT-ARGN-INT-CACHED-INTERNAL", 7, 0, false);
        declareFunction("at_argn_int_cached", "AT-ARGN-INT-CACHED", 7, 0, false);
        declareFunction("at_argn_int_funcall", "AT-ARGN-INT-FUNCALL", 6, 0, false);
        declareFunction("inter_arg_isa_int", "INTER-ARG-ISA-INT", 4, 0, false);
        declareFunction("inter_arg_genl_int", "INTER-ARG-GENL-INT", 4, 0, false);
        declareFunction("inter_arg_type_int", "INTER-ARG-TYPE-INT", 5, 0, false);
        declareFunction("inter_arg_type_verify_candidates", "INTER-ARG-TYPE-VERIFY-CANDIDATES", 4, 0, false);
        declareFunction("inter_arg_isa_from_type_int", "INTER-ARG-ISA-FROM-TYPE-INT", 4, 0, false);
        declareFunction("inter_arg_genl_from_type_int", "INTER-ARG-GENL-FROM-TYPE-INT", 4, 0, false);
        declareFunction("constraint_var_types_okP", "CONSTRAINT-VAR-TYPES-OK?", 1, 2, false);
        declareFunction("var_types_okP", "VAR-TYPES-OK?", 1, 2, false);
        declareFunction("var_types_not_disjointP", "VAR-TYPES-NOT-DISJOINT?", 1, 2, false);
        declareFunction("var_type_disjoint_violation", "VAR-TYPE-DISJOINT-VIOLATION", 4, 0, false);
        declareFunction("var_types_neglits_subsume_poslitsP", "VAR-TYPES-NEGLITS-SUBSUME-POSLITS?", 1, 2, false);
        declareFunction("modal_in_argP", "MODAL-IN-ARG?", 2, 1, false);
        return NIL;
    }

    public static SubLObject declare_at_var_types_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("term_var_types_ok_intP", "TERM-VAR-TYPES-OK-INT?", 2, 0, false);
            declareFunction("formula_var_types_ok_intP", "FORMULA-VAR-TYPES-OK-INT?", 2, 0, false);
            declareFunction("inter_formula_var_types_okP", "INTER-FORMULA-VAR-TYPES-OK?", 2, 0, false);
            declareFunction("inter_formula_var_types_ok_intP", "INTER-FORMULA-VAR-TYPES-OK-INT?", 4, 0, false);
            declareFunction("independent_cnfs_variables_arg_constraints_okP", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
            declareFunction("independent_cnfs_variables_arg_constraints_okP_int", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
            declareFunction("at_var_type_dnfs", "AT-VAR-TYPE-DNFS", 3, 0, false);
            declareFunction("clear_at_var_type_dnfs_int_cached", "CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED", 0, 0, false);
            declareFunction("remove_at_var_type_dnfs_int_cached", "REMOVE-AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
            declareFunction("at_var_type_dnfs_int_cached_internal", "AT-VAR-TYPE-DNFS-INT-CACHED-INTERNAL", 2, 0, false);
            declareFunction("at_var_type_dnfs_int_cached", "AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
            declareFunction("at_var_type_cnfs", "AT-VAR-TYPE-CNFS", 2, 0, false);
            declareFunction("at_var_type_cnfs_int", "AT-VAR-TYPE-CNFS-INT", 4, 0, false);
            declareFunction("at_var_types_cnfs_clausify", "AT-VAR-TYPES-CNFS-CLAUSIFY", 1, 0, false);
            declareFunction("at_var_types_cnfs_clausify_int_internal", "AT-VAR-TYPES-CNFS-CLAUSIFY-INT-INTERNAL", 1, 0, false);
            declareFunction("at_var_types_cnfs_clausify_int", "AT-VAR-TYPES-CNFS-CLAUSIFY-INT", 1, 0, false);
            declareFunction("opaque_arg_wrt_pragmatic_requirementP", "OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?", 2, 0, false);
            declareFunction("at_transform_true_sentence_negation_preds", "AT-TRANSFORM-TRUE-SENTENCE-NEGATION-PREDS", 2, 0, false);
            declareFunction("at_negatedP", "AT-NEGATED?", 1, 0, false);
            declareFunction("at_negate", "AT-NEGATE", 1, 0, false);
            declareFunction("at_var_type_repackage_cnfs", "AT-VAR-TYPE-REPACKAGE-CNFS", 1, 0, false);
            declareFunction("cnf_var_types_okP", "CNF-VAR-TYPES-OK?", 2, 1, false);
            declareFunction("inter_cnf_var_types_okP", "INTER-CNF-VAR-TYPES-OK?", 2, 1, false);
            declareFunction("query_var_types_okP", "QUERY-VAR-TYPES-OK?", 2, 1, false);
            declareFunction("term_variables_arg_constraints", "TERM-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("formula_variables_arg_constraints", "FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("at_el_expand_all", "AT-EL-EXPAND-ALL", 2, 0, false);
            declareFunction("parse_constraint", "PARSE-CONSTRAINT", 2, 0, false);
            declareFunction("formula_variables_arg_constraints_dict", "FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT", 2, 2, false);
            declareFunction("inter_formula_variables_arg_constraints", "INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("independent_formula_variables_arg_constraints", "INDEPENDENT-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("old_formula_variables_arg_constraints", "OLD-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("query_variables_arg_constraints", "QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_query_variables_arg_constraints", "INTER-QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("cnfs_variables_arg_constraints", "CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("independent_cnfs_variables_arg_constraints", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_cnfs_variables_arg_constraints", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_cnfs_variables_isa_constraints", "INTER-CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_cnfs_variables_quoted_isa_constraints", "INTER-CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_cnfs_variables_genl_constraints", "INTER-CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
            declareFunction("hl_cnf_variables_arg_constraints", "HL-CNF-VARIABLES-ARG-CONSTRAINTS", 2, 0, false);
            declareFunction("cnf_variables_arg_constraints", "CNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_cnfs_variables_arg_constraints_okP", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
            declareFunction("inter_cnfs_variables_arg_constraints_okP_int", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
            declareFunction("cnfs_variables_arg_constraints_okP", "CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
            declareFunction("cnf_variables_arg_constraints_okP", "CNF-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
            declareFunction("var_isa_constraints_wrt_cnfs", "VAR-ISA-CONSTRAINTS-WRT-CNFS", 3, 1, false);
            declareFunction("var_genl_constraints_wrt_cnfs", "VAR-GENL-CONSTRAINTS-WRT-CNFS", 3, 1, false);
            declareFunction("cnfs_variables_isa_constraints", "CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("cnfs_variables_quoted_isa_constraints", "CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("cnfs_variables_genl_constraints", "CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
            declareFunction("cnfs_variable_isa_constraints", "CNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnfs_variable_quoted_isa_constraints", "CNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnfs_variable_genl_constraints", "CNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_variables_isa_constraints", "CNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("cnf_variables_quoted_isa_constraints", "CNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("cnf_variables_genl_constraints", "CNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
            declareFunction("cnf_variable_isa_constraints", "CNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_variable_isa_constraints_int_internal", "CNF-VARIABLE-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
            declareFunction("cnf_variable_isa_constraints_int", "CNF-VARIABLE-ISA-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("cnf_variable_quoted_isa_constraints", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_variable_quoted_isa_constraints_int_internal", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
            declareFunction("cnf_variable_quoted_isa_constraints_int", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("cnf_variable_genl_constraints", "CNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_variable_genl_constraints_int_internal", "CNF-VARIABLE-GENL-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
            declareFunction("cnf_variable_genl_constraints_int", "CNF-VARIABLE-GENL-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("cnfs_variable_inter_arg_isa_constraints", "CNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
            declareFunction("cnfs_variable_inter_arg_genl_constraints", "CNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
            declareFunction("cnf_variable_inter_arg_isa_constraints", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
            declareFunction("cnf_variable_inter_arg_genl_constraints", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
            declareFunction("cnf_variable_inter_arg_isa_constraints_int", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("cnf_variable_inter_arg_isa_constraints_int_2_internal", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2-INTERNAL", 3, 0, false);
            declareFunction("cnf_variable_inter_arg_isa_constraints_int_2", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2", 3, 0, false);
            declareFunction("cnf_variable_inter_arg_genl_constraints_int", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("cnf_variable_inter_arg_genl_constraints_int_2_internal", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2-INTERNAL", 3, 0, false);
            declareFunction("cnf_variable_inter_arg_genl_constraints_int_2", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2", 3, 0, false);
            declareFunction("cnfs_var_constraint_implications_okP", "CNFS-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
            declareFunction("cnf_var_constraint_implications_okP", "CNF-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
            declareFunction("dnfs_variables_arg_constraints", "DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("inter_dnfs_variables_arg_constraints", "INTER-DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("dnf_variables_arg_constraints", "DNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
            declareFunction("dnfs_variables_arg_constraints_okP", "DNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
            declareFunction("dnfs_variables_isa_constraints", "DNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("dnfs_variables_genl_constraints", "DNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
            declareFunction("contextualized_dnf_variables_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLES-ISA-CONSTRAINT-TUPLES", 1, 1, false);
            declareFunction("var_isa_constraints_wrt_dnfs", "VAR-ISA-CONSTRAINTS-WRT-DNFS", 3, 1, false);
            declareFunction("var_genl_constraints_wrt_dnfs", "VAR-GENL-CONSTRAINTS-WRT-DNFS", 3, 1, false);
            declareFunction("dnfs_variable_isa_constraints", "DNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnfs_variable_quoted_isa_constraints", "DNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnfs_variable_genl_constraints", "DNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_variables_isa_constraints", "DNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("dnf_variables_quoted_isa_constraints", "DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("dnf_variables_genl_constraints", "DNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
            declareFunction("dnf_variable_isa_constraints", "DNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_variable_isa_constraints_int_internal", "DNF-VARIABLE-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
            declareFunction("dnf_variable_isa_constraints_int", "DNF-VARIABLE-ISA-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("contextualized_dnf_variable_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLE-ISA-CONSTRAINT-TUPLES", 2, 0, false);
            declareFunction("contextualized_isa_x_y_litP", "CONTEXTUALIZED-ISA-X-Y-LIT?", 1, 0, false);
            new at_var_types.$contextualized_isa_x_y_litP$UnaryFunction();
            declareFunction("dnf_variable_quoted_isa_constraints", "DNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_variable_genl_constraints", "DNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("dnfs_variable_inter_arg_isa_constraints", "DNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
            declareFunction("dnfs_variable_inter_arg_genl_constraints", "DNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
            declareFunction("dnf_variable_inter_arg_isa_constraints", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
            declareFunction("dnf_variable_inter_arg_genl_constraints", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
            declareFunction("dnf_variable_inter_arg_isa_constraints_int", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("dnf_variable_inter_arg_genl_constraints_int", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
            declareFunction("cnf_neg_lit_variable_isa_constraints", "CNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_neg_lit_variable_quoted_isa_constraints", "CNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_neg_lit_variable_genl_constraints", "CNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_pos_lit_variable_isa_constraints", "CNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_pos_lit_variable_quoted_isa_constraints", "CNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("cnf_pos_lit_variable_genl_constraints", "CNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_neg_lit_variable_isa_constraints", "DNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_neg_lit_variable_quoted_isa_constraints", "DNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_neg_lit_variable_genl_constraints", "DNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_pos_lit_variable_isa_constraints", "DNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_pos_lit_variable_quoted_isa_constraints", "DNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("dnf_pos_lit_variable_genl_constraints", "DNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("vt_unskolemize_term", "VT-UNSKOLEMIZE-TERM", 1, 0, false);
            declareFunction("neg_lit_variable_isa_constraints", "NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("neg_lit_variable_quoted_isa_constraints", "NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("neg_lit_variable_genl_constraints", "NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("pos_lit_variable_isa_constraints", "POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("pos_lit_variable_quoted_isa_constraints", "POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("pos_lit_variable_genl_constraints", "POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("neg_lit_variable_inter_arg_isa_constraints", "NEG-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("neg_lit_variable_inter_arg_genl_constraints", "NEG-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("pos_lit_variable_inter_arg_isa_constraints", "POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("at_inter_arg_checkable_objectP", "AT-INTER-ARG-CHECKABLE-OBJECT?", 1, 0, false);
            declareFunction("pos_lit_variable_inter_arg_genl_constraints", "POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("formula_variable_isa_constraints", "FORMULA-VARIABLE-ISA-CONSTRAINTS", 3, 1, false);
            declareFunction("formula_variable_quoted_isa_constraints", "FORMULA-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 1, false);
            declareFunction("formula_variable_genl_constraints", "FORMULA-VARIABLE-GENL-CONSTRAINTS", 3, 1, false);
            declareFunction("formula_variable_arg_constraints", "FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 1, false);
            declareFunction("cnf_formula_variable_arg_constraints", "CNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
            declareFunction("dnf_formula_variable_arg_constraints", "DNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
            declareFunction("formula_variable_inter_arg_isa_constraints", "FORMULA-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 1, false);
            declareFunction("formula_variable_inter_arg_genl_constraints", "FORMULA-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 1, false);
            declareFunction("formula_variable_inter_arg_constraints", "FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 1, false);
            declareFunction("cnf_formula_variable_inter_arg_constraints", "CNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
            declareFunction("dnf_formula_variable_inter_arg_constraints", "DNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
            declareFunction("relation_variable_isa_constraints", "RELATION-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("relation_variable_quoted_isa_constraints", "RELATION-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("relation_variable_genl_constraints", "RELATION-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("relation_variable_inter_arg_isa_constraints", "RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
            declareFunction("relation_variable_inter_arg_genl_constraints", "RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
            declareFunction("at_min_cols", "AT-MIN-COLS", 2, 0, false);
            declareFunction("at_min_cols_memoized_internal", "AT-MIN-COLS-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("at_min_cols_memoized", "AT-MIN-COLS-MEMOIZED", 2, 0, false);
            declareFunction("query_argP", "QUERY-ARG?", 3, 0, false);
            declareFunction("query_denoting_collectionP", "QUERY-DENOTING-COLLECTION?", 2, 0, false);
            declareFunction("at_arg_formula_type", "AT-ARG-FORMULA-TYPE", 3, 0, false);
            declareFunction("at_argn_isa", "AT-ARGN-ISA", 2, 0, false);
            declareFunction("at_argn_quoted_isa", "AT-ARGN-QUOTED-ISA", 2, 0, false);
            declareFunction("at_argn_genl", "AT-ARGN-GENL", 2, 0, false);
            declareFunction("inter_arg_isa", "INTER-ARG-ISA", 4, 0, false);
            declareFunction("inter_arg_genl", "INTER-ARG-GENL", 4, 0, false);
            declareFunction("inter_arg_isa_from_type", "INTER-ARG-ISA-FROM-TYPE", 4, 0, false);
            declareFunction("inter_arg_genl_from_type", "INTER-ARG-GENL-FROM-TYPE", 4, 0, false);
            declareFunction("at_argn_int", "AT-ARGN-INT", 6, 0, false);
            declareFunction("clear_at_argn_int_cached", "CLEAR-AT-ARGN-INT-CACHED", 0, 0, false);
            new at_var_types.$clear_at_argn_int_cached$ZeroArityFunction();
            declareFunction("remove_at_argn_int_cached", "REMOVE-AT-ARGN-INT-CACHED", 7, 0, false);
            declareFunction("at_argn_int_cached_internal", "AT-ARGN-INT-CACHED-INTERNAL", 7, 0, false);
            declareFunction("at_argn_int_cached", "AT-ARGN-INT-CACHED", 7, 0, false);
            declareFunction("at_argn_int_funcall", "AT-ARGN-INT-FUNCALL", 6, 0, false);
            declareFunction("inter_arg_isa_int", "INTER-ARG-ISA-INT", 4, 0, false);
            declareFunction("inter_arg_genl_int", "INTER-ARG-GENL-INT", 4, 0, false);
            declareFunction("inter_arg_type_int", "INTER-ARG-TYPE-INT", 5, 0, false);
            declareFunction("inter_arg_type_verify_candidates", "INTER-ARG-TYPE-VERIFY-CANDIDATES", 4, 0, false);
            declareFunction("inter_arg_isa_from_type_int", "INTER-ARG-ISA-FROM-TYPE-INT", 4, 0, false);
            declareFunction("inter_arg_genl_from_type_int", "INTER-ARG-GENL-FROM-TYPE-INT", 4, 0, false);
            declareFunction("constraint_var_types_okP", "CONSTRAINT-VAR-TYPES-OK?", 1, 2, false);
            declareFunction("var_types_okP", "VAR-TYPES-OK?", 1, 2, false);
            declareFunction("var_types_not_disjointP", "VAR-TYPES-NOT-DISJOINT?", 1, 2, false);
            declareFunction("var_type_disjoint_violation", "VAR-TYPE-DISJOINT-VIOLATION", 4, 0, false);
            declareFunction("var_types_neglits_subsume_poslitsP", "VAR-TYPES-NEGLITS-SUBSUME-POSLITS?", 1, 2, false);
            declareFunction("modal_in_argP", "MODAL-IN-ARG?", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("pos_lit_variable_isa_constraints_memoized_internal", "POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED-INTERNAL", 3, 0, false);
            declareFunction("pos_lit_variable_isa_constraints_memoized", "POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_at_var_types_file_Previous() {
        declareFunction("term_var_types_ok_intP", "TERM-VAR-TYPES-OK-INT?", 2, 0, false);
        declareFunction("formula_var_types_ok_intP", "FORMULA-VAR-TYPES-OK-INT?", 2, 0, false);
        declareFunction("inter_formula_var_types_okP", "INTER-FORMULA-VAR-TYPES-OK?", 2, 0, false);
        declareFunction("inter_formula_var_types_ok_intP", "INTER-FORMULA-VAR-TYPES-OK-INT?", 4, 0, false);
        declareFunction("independent_cnfs_variables_arg_constraints_okP", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("independent_cnfs_variables_arg_constraints_okP_int", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
        declareFunction("at_var_type_dnfs", "AT-VAR-TYPE-DNFS", 3, 0, false);
        declareFunction("clear_at_var_type_dnfs_int_cached", "CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED", 0, 0, false);
        declareFunction("remove_at_var_type_dnfs_int_cached", "REMOVE-AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
        declareFunction("at_var_type_dnfs_int_cached_internal", "AT-VAR-TYPE-DNFS-INT-CACHED-INTERNAL", 2, 0, false);
        declareFunction("at_var_type_dnfs_int_cached", "AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
        declareFunction("at_var_type_cnfs", "AT-VAR-TYPE-CNFS", 2, 0, false);
        declareFunction("at_var_type_cnfs_int", "AT-VAR-TYPE-CNFS-INT", 4, 0, false);
        declareFunction("at_var_types_cnfs_clausify", "AT-VAR-TYPES-CNFS-CLAUSIFY", 1, 0, false);
        declareFunction("at_var_types_cnfs_clausify_int_internal", "AT-VAR-TYPES-CNFS-CLAUSIFY-INT-INTERNAL", 1, 0, false);
        declareFunction("at_var_types_cnfs_clausify_int", "AT-VAR-TYPES-CNFS-CLAUSIFY-INT", 1, 0, false);
        declareFunction("opaque_arg_wrt_pragmatic_requirementP", "OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?", 2, 0, false);
        declareFunction("at_transform_true_sentence_negation_preds", "AT-TRANSFORM-TRUE-SENTENCE-NEGATION-PREDS", 2, 0, false);
        declareFunction("at_negatedP", "AT-NEGATED?", 1, 0, false);
        declareFunction("at_negate", "AT-NEGATE", 1, 0, false);
        declareFunction("at_var_type_repackage_cnfs", "AT-VAR-TYPE-REPACKAGE-CNFS", 1, 0, false);
        declareFunction("cnf_var_types_okP", "CNF-VAR-TYPES-OK?", 2, 1, false);
        declareFunction("inter_cnf_var_types_okP", "INTER-CNF-VAR-TYPES-OK?", 2, 1, false);
        declareFunction("query_var_types_okP", "QUERY-VAR-TYPES-OK?", 2, 1, false);
        declareFunction("term_variables_arg_constraints", "TERM-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("formula_variables_arg_constraints", "FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("at_el_expand_all", "AT-EL-EXPAND-ALL", 2, 0, false);
        declareFunction("parse_constraint", "PARSE-CONSTRAINT", 2, 0, false);
        declareFunction("formula_variables_arg_constraints_dict", "FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT", 2, 2, false);
        declareFunction("inter_formula_variables_arg_constraints", "INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("independent_formula_variables_arg_constraints", "INDEPENDENT-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("old_formula_variables_arg_constraints", "OLD-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("query_variables_arg_constraints", "QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_query_variables_arg_constraints", "INTER-QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variables_arg_constraints", "CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("independent_cnfs_variables_arg_constraints", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_arg_constraints", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_isa_constraints", "INTER-CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_quoted_isa_constraints", "INTER-CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_genl_constraints", "INTER-CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("hl_cnf_variables_arg_constraints", "HL-CNF-VARIABLES-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction("cnf_variables_arg_constraints", "CNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_cnfs_variables_arg_constraints_okP", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("inter_cnfs_variables_arg_constraints_okP_int", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
        declareFunction("cnfs_variables_arg_constraints_okP", "CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("cnf_variables_arg_constraints_okP", "CNF-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("var_isa_constraints_wrt_cnfs", "VAR-ISA-CONSTRAINTS-WRT-CNFS", 3, 1, false);
        declareFunction("var_genl_constraints_wrt_cnfs", "VAR-GENL-CONSTRAINTS-WRT-CNFS", 3, 1, false);
        declareFunction("cnfs_variables_isa_constraints", "CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variables_quoted_isa_constraints", "CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variables_genl_constraints", "CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("cnfs_variable_isa_constraints", "CNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnfs_variable_quoted_isa_constraints", "CNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnfs_variable_genl_constraints", "CNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variables_isa_constraints", "CNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnf_variables_quoted_isa_constraints", "CNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("cnf_variables_genl_constraints", "CNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("cnf_variable_isa_constraints", "CNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variable_isa_constraints_int_internal", "CNF-VARIABLE-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
        declareFunction("cnf_variable_isa_constraints_int", "CNF-VARIABLE-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_variable_quoted_isa_constraints", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variable_quoted_isa_constraints_int_internal", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
        declareFunction("cnf_variable_quoted_isa_constraints_int", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_variable_genl_constraints", "CNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_variable_genl_constraints_int_internal", "CNF-VARIABLE-GENL-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
        declareFunction("cnf_variable_genl_constraints_int", "CNF-VARIABLE-GENL-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnfs_variable_inter_arg_isa_constraints", "CNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("cnfs_variable_inter_arg_genl_constraints", "CNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("cnf_variable_inter_arg_isa_constraints", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("cnf_variable_inter_arg_genl_constraints", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("cnf_variable_inter_arg_isa_constraints_int", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_variable_inter_arg_isa_constraints_int_2_internal", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2-INTERNAL", 3, 0, false);
        declareFunction("cnf_variable_inter_arg_isa_constraints_int_2", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2", 3, 0, false);
        declareFunction("cnf_variable_inter_arg_genl_constraints_int", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_variable_inter_arg_genl_constraints_int_2_internal", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2-INTERNAL", 3, 0, false);
        declareFunction("cnf_variable_inter_arg_genl_constraints_int_2", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2", 3, 0, false);
        declareFunction("cnfs_var_constraint_implications_okP", "CNFS-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
        declareFunction("cnf_var_constraint_implications_okP", "CNF-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
        declareFunction("dnfs_variables_arg_constraints", "DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("inter_dnfs_variables_arg_constraints", "INTER-DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variables_arg_constraints", "DNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
        declareFunction("dnfs_variables_arg_constraints_okP", "DNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("dnfs_variables_isa_constraints", "DNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("dnfs_variables_genl_constraints", "DNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("contextualized_dnf_variables_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLES-ISA-CONSTRAINT-TUPLES", 1, 1, false);
        declareFunction("var_isa_constraints_wrt_dnfs", "VAR-ISA-CONSTRAINTS-WRT-DNFS", 3, 1, false);
        declareFunction("var_genl_constraints_wrt_dnfs", "VAR-GENL-CONSTRAINTS-WRT-DNFS", 3, 1, false);
        declareFunction("dnfs_variable_isa_constraints", "DNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnfs_variable_quoted_isa_constraints", "DNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnfs_variable_genl_constraints", "DNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_variables_isa_constraints", "DNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variables_quoted_isa_constraints", "DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variables_genl_constraints", "DNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
        declareFunction("dnf_variable_isa_constraints", "DNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_variable_isa_constraints_int_internal", "DNF-VARIABLE-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false);
        declareFunction("dnf_variable_isa_constraints_int", "DNF-VARIABLE-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("contextualized_dnf_variable_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLE-ISA-CONSTRAINT-TUPLES", 2, 0, false);
        declareFunction("contextualized_isa_x_y_litP", "CONTEXTUALIZED-ISA-X-Y-LIT?", 1, 0, false);
        new at_var_types.$contextualized_isa_x_y_litP$UnaryFunction();
        declareFunction("dnf_variable_quoted_isa_constraints", "DNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_variable_genl_constraints", "DNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnfs_variable_inter_arg_isa_constraints", "DNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("dnfs_variable_inter_arg_genl_constraints", "DNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_variable_inter_arg_isa_constraints", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_variable_inter_arg_genl_constraints", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_variable_inter_arg_isa_constraints_int", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("dnf_variable_inter_arg_genl_constraints_int", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
        declareFunction("cnf_neg_lit_variable_isa_constraints", "CNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_neg_lit_variable_quoted_isa_constraints", "CNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_neg_lit_variable_genl_constraints", "CNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_pos_lit_variable_isa_constraints", "CNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_pos_lit_variable_quoted_isa_constraints", "CNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("cnf_pos_lit_variable_genl_constraints", "CNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_neg_lit_variable_isa_constraints", "DNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_neg_lit_variable_quoted_isa_constraints", "DNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_neg_lit_variable_genl_constraints", "DNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_pos_lit_variable_isa_constraints", "DNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_pos_lit_variable_quoted_isa_constraints", "DNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("dnf_pos_lit_variable_genl_constraints", "DNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("vt_unskolemize_term", "VT-UNSKOLEMIZE-TERM", 1, 0, false);
        declareFunction("neg_lit_variable_isa_constraints", "NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_quoted_isa_constraints", "NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_genl_constraints", "NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_isa_constraints", "POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_quoted_isa_constraints", "POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_genl_constraints", "POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_inter_arg_isa_constraints", "NEG-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("neg_lit_variable_inter_arg_genl_constraints", "NEG-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("pos_lit_variable_inter_arg_isa_constraints", "POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("at_inter_arg_checkable_objectP", "AT-INTER-ARG-CHECKABLE-OBJECT?", 1, 0, false);
        declareFunction("pos_lit_variable_inter_arg_genl_constraints", "POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("formula_variable_isa_constraints", "FORMULA-VARIABLE-ISA-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_quoted_isa_constraints", "FORMULA-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_genl_constraints", "FORMULA-VARIABLE-GENL-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_arg_constraints", "FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 1, false);
        declareFunction("cnf_formula_variable_arg_constraints", "CNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_formula_variable_arg_constraints", "DNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("formula_variable_inter_arg_isa_constraints", "FORMULA-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_inter_arg_genl_constraints", "FORMULA-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 1, false);
        declareFunction("formula_variable_inter_arg_constraints", "FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 1, false);
        declareFunction("cnf_formula_variable_inter_arg_constraints", "CNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("dnf_formula_variable_inter_arg_constraints", "DNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("relation_variable_isa_constraints", "RELATION-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_quoted_isa_constraints", "RELATION-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_genl_constraints", "RELATION-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_inter_arg_isa_constraints", "RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("relation_variable_inter_arg_genl_constraints", "RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("at_min_cols", "AT-MIN-COLS", 2, 0, false);
        declareFunction("at_min_cols_memoized_internal", "AT-MIN-COLS-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("at_min_cols_memoized", "AT-MIN-COLS-MEMOIZED", 2, 0, false);
        declareFunction("query_argP", "QUERY-ARG?", 3, 0, false);
        declareFunction("query_denoting_collectionP", "QUERY-DENOTING-COLLECTION?", 2, 0, false);
        declareFunction("at_arg_formula_type", "AT-ARG-FORMULA-TYPE", 3, 0, false);
        declareFunction("at_argn_isa", "AT-ARGN-ISA", 2, 0, false);
        declareFunction("at_argn_quoted_isa", "AT-ARGN-QUOTED-ISA", 2, 0, false);
        declareFunction("at_argn_genl", "AT-ARGN-GENL", 2, 0, false);
        declareFunction("inter_arg_isa", "INTER-ARG-ISA", 4, 0, false);
        declareFunction("inter_arg_genl", "INTER-ARG-GENL", 4, 0, false);
        declareFunction("inter_arg_isa_from_type", "INTER-ARG-ISA-FROM-TYPE", 4, 0, false);
        declareFunction("inter_arg_genl_from_type", "INTER-ARG-GENL-FROM-TYPE", 4, 0, false);
        declareFunction("at_argn_int", "AT-ARGN-INT", 6, 0, false);
        declareFunction("clear_at_argn_int_cached", "CLEAR-AT-ARGN-INT-CACHED", 0, 0, false);
        new at_var_types.$clear_at_argn_int_cached$ZeroArityFunction();
        declareFunction("remove_at_argn_int_cached", "REMOVE-AT-ARGN-INT-CACHED", 7, 0, false);
        declareFunction("at_argn_int_cached_internal", "AT-ARGN-INT-CACHED-INTERNAL", 7, 0, false);
        declareFunction("at_argn_int_cached", "AT-ARGN-INT-CACHED", 7, 0, false);
        declareFunction("at_argn_int_funcall", "AT-ARGN-INT-FUNCALL", 6, 0, false);
        declareFunction("inter_arg_isa_int", "INTER-ARG-ISA-INT", 4, 0, false);
        declareFunction("inter_arg_genl_int", "INTER-ARG-GENL-INT", 4, 0, false);
        declareFunction("inter_arg_type_int", "INTER-ARG-TYPE-INT", 5, 0, false);
        declareFunction("inter_arg_type_verify_candidates", "INTER-ARG-TYPE-VERIFY-CANDIDATES", 4, 0, false);
        declareFunction("inter_arg_isa_from_type_int", "INTER-ARG-ISA-FROM-TYPE-INT", 4, 0, false);
        declareFunction("inter_arg_genl_from_type_int", "INTER-ARG-GENL-FROM-TYPE-INT", 4, 0, false);
        declareFunction("constraint_var_types_okP", "CONSTRAINT-VAR-TYPES-OK?", 1, 2, false);
        declareFunction("var_types_okP", "VAR-TYPES-OK?", 1, 2, false);
        declareFunction("var_types_not_disjointP", "VAR-TYPES-NOT-DISJOINT?", 1, 2, false);
        declareFunction("var_type_disjoint_violation", "VAR-TYPE-DISJOINT-VIOLATION", 4, 0, false);
        declareFunction("var_types_neglits_subsume_poslitsP", "VAR-TYPES-NEGLITS-SUBSUME-POSLITS?", 1, 2, false);
        declareFunction("modal_in_argP", "MODAL-IN-ARG?", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_at_var_types_file() {
        deflexical("*AT-VAR-TYPE-DNFS-INT-CACHED-CACHING-STATE*", NIL);
        defparameter("*AT-TRUE-SENTENCE-NEGATION-PREDS*", $UNINITIALIZED);
        deflexical("*AT-ARGN-INT-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_at_var_types_file_alt() {
        memoization_state.note_globally_cached_function(AT_VAR_TYPE_DNFS_INT_CACHED);
        memoization_state.note_memoized_function(POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED);
        memoization_state.note_memoized_function(AT_MIN_COLS_MEMOIZED);
        memoization_state.note_globally_cached_function(AT_ARGN_INT_CACHED);
        return NIL;
    }

    public static SubLObject setup_at_var_types_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(AT_VAR_TYPE_DNFS_INT_CACHED);
            memoization_state.note_memoized_function(AT_VAR_TYPES_CNFS_CLAUSIFY_INT);
            memoization_state.note_memoized_function(CNF_VARIABLE_ISA_CONSTRAINTS_INT);
            memoization_state.note_memoized_function(CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT);
            memoization_state.note_memoized_function(CNF_VARIABLE_GENL_CONSTRAINTS_INT);
            memoization_state.note_memoized_function(CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2);
            memoization_state.note_memoized_function(CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2);
            memoization_state.note_memoized_function(DNF_VARIABLE_ISA_CONSTRAINTS_INT);
            memoization_state.note_memoized_function(AT_MIN_COLS_MEMOIZED);
            memoization_state.note_globally_cached_function(AT_ARGN_INT_CACHED);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function(POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED);
        }
        return NIL;
    }

    public static SubLObject setup_at_var_types_file_Previous() {
        memoization_state.note_globally_cached_function(AT_VAR_TYPE_DNFS_INT_CACHED);
        memoization_state.note_memoized_function(AT_VAR_TYPES_CNFS_CLAUSIFY_INT);
        memoization_state.note_memoized_function(CNF_VARIABLE_ISA_CONSTRAINTS_INT);
        memoization_state.note_memoized_function(CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT);
        memoization_state.note_memoized_function(CNF_VARIABLE_GENL_CONSTRAINTS_INT);
        memoization_state.note_memoized_function(CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2);
        memoization_state.note_memoized_function(CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2);
        memoization_state.note_memoized_function(DNF_VARIABLE_ISA_CONSTRAINTS_INT);
        memoization_state.note_memoized_function(AT_MIN_COLS_MEMOIZED);
        memoization_state.note_globally_cached_function(AT_ARGN_INT_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_var_types_file();
    }

    @Override
    public void initializeVariables() {
        init_at_var_types_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_var_types_file();
    }

    static {
    }

    public static final class $contextualized_isa_x_y_litP$UnaryFunction extends UnaryFunction {
        public $contextualized_isa_x_y_litP$UnaryFunction() {
            super(extractFunctionNamed("CONTEXTUALIZED-ISA-X-Y-LIT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return contextualized_isa_x_y_litP(arg1);
        }
    }

    public static final class $clear_at_argn_int_cached$ZeroArityFunction extends ZeroArityFunction {
        public $clear_at_argn_int_cached$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-AT-ARGN-INT-CACHED"));
        }

        @Override
        public SubLObject processItem() {
            return clear_at_argn_int_cached();
        }
    }

    public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym14$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_ = makeSymbol("OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?");

    static private final SubLSymbol $sym15$AT_NEGATED_ = makeSymbol("AT-NEGATED?");

    static private final SubLSymbol $sym30$ISA_VAR_VAR_LIT_ = makeSymbol("ISA-VAR-VAR-LIT?");

    static private final SubLList $list_alt31 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLSymbol $sym32$CONTEXTUALIZED_ISA_X_Y_LIT_ = makeSymbol("CONTEXTUALIZED-ISA-X-Y-LIT?");

    static private final SubLList $list_alt33 = list(makeSymbol("ISA-MT"), makeSymbol("ISA-X-Y-ASENT"));

    static private final SubLList $list_alt34 = list(makeSymbol("GENLS-MT"), makeSymbol("GENLS-ASENT"));

    private static final SubLSymbol POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED = makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED");

    static private final SubLSymbol $sym43$CYC_QUERY_ = makeSymbol("CYC-QUERY?");

    static private final SubLString $str_alt55$got_an_unexpected_function__s_wit = makeString("got an unexpected function ~s with arity ~s~%");

    static private final SubLList $list_alt59 = list(makeSymbol("IND-COL"), makeSymbol("DEP-COL"), makeSymbol("ASSERTION"));

    static private final SubLString $str_alt60$__at_var__a_test__arg__s__s__cons = makeString("~%at var ~a test: arg ~s ~s; constraint ~s");
}

/**
 * Total time: 1940 ms
 */
