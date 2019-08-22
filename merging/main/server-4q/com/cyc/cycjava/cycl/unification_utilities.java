/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class unification_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new unification_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.unification_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $monad_genl_mt_cachedP_caching_state$ = makeSymbol("*MONAD-GENL-MT-CACHED?-CACHING-STATE*");

    private static final SubLSymbol UNIFY_CLAUSE = makeSymbol("UNIFY-CLAUSE");

    private static final SubLSymbol CLAUSE_P = makeSymbol("CLAUSE-P");

    private static final SubLSymbol UNIFY_CLAUSE_LITERAL = makeSymbol("UNIFY-CLAUSE-LITERAL");

    private static final SubLSymbol CLAUSES_P = makeSymbol("CLAUSES-P");

    private static final SubLSymbol NON_BASE_VARIABLE_P = makeSymbol("NON-BASE-VARIABLE-P");

    private static final SubLSymbol VARIABLE_BASE_INVERSION_BINDING = makeSymbol("VARIABLE-BASE-INVERSION-BINDING");

    static private final SubLList $list7 = cons(makeSymbol("VAR1"), makeSymbol("VAR2"));

    private static final SubLSymbol UNIFY_ELEMENT = makeSymbol("UNIFY-ELEMENT");

    private static final SubLSymbol UNIFY_SET = makeSymbol("UNIFY-SET");

    private static final SubLSymbol UNIFY_SETS = makeSymbol("UNIFY-SETS");

    private static final SubLSymbol BASE_VARIABLE_P = makeSymbol("BASE-VARIABLE-P");

    static private final SubLSymbol $sym13$TERM__ = makeSymbol("TERM-<");

    static private final SubLList $list15 = cons(makeSymbol("PARENT-VAR"), makeSymbol("UNIFY-BINDING"));

    private static final SubLSymbol QUERY_DNF_FROM_FORMULA = makeSymbol("QUERY-DNF-FROM-FORMULA");

    public static final SubLSymbol $query_dnf_from_formula_caching_state$ = makeSymbol("*QUERY-DNF-FROM-FORMULA-CACHING-STATE*");

    private static final SubLSymbol $sym19$_EXIT = makeSymbol("%EXIT");



    private static final SubLList $list21 = list(makeSymbol("HL-CNF-1"), makeSymbol("EL-BINDINGS-1"));

    private static final SubLList $list22 = list(makeSymbol("HL-CNF-2"), makeSymbol("EL-BINDINGS-2"));

    private static final SubLSymbol OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");



    private static final SubLSymbol $sym26$MONAD_GENL_MT_CACHED_ = makeSymbol("MONAD-GENL-MT-CACHED?");

    private static final SubLSymbol $sym27$_MONAD_GENL_MT_CACHED__CACHING_STATE_ = makeSymbol("*MONAD-GENL-MT-CACHED?-CACHING-STATE*");

    private static final SubLSymbol $sym29$CLEAR_MONAD_GENL_MT_CACHED_ = makeSymbol("CLEAR-MONAD-GENL-MT-CACHED?");



    private static final SubLList $list31 = list(makeSymbol("UNBOUND-INDEX"), makeSymbol("UNBOUND-PARAM"));



    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");

    private static final SubLList $list34 = list(makeSymbol("UNBOUND-INDEX"));





    private static final SubLObject $$temporallySubsumes_InsType = reader_make_constant_shell("temporallySubsumes-InsType");

    private static final SubLObject $$temporallySubsumes_TypeType = reader_make_constant_shell("temporallySubsumes-TypeType");

    private static final SubLSymbol TERM_UNIFY = makeSymbol("TERM-UNIFY");

    private static final SubLList $list48 = list(list(list(list(reader_make_constant_shell("Unity"), ONE_INTEGER), list(reader_make_constant_shell("Unity"), makeDouble(0.9999999999999999))), list(cons(T, T))), list(list(list(reader_make_constant_shell("Unity"), makeDouble(30.0)), list(reader_make_constant_shell("Unity"), makeInteger(30))), list(cons(T, T))));

    // Definitions
    public static final SubLObject term_unify_alt(SubLObject term1, SubLObject term2, SubLObject share_vars, SubLObject justifyP) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        if ((NIL != variables.variable_p(term1)) && (NIL != forts.fort_p(term2))) {
            return values(list(bindings.make_variable_binding(term1, term2)), NIL);
        } else {
            return unification.unify(term1, term2, share_vars, justifyP);
        }
    }

    // Definitions
    public static SubLObject term_unify(final SubLObject term1, final SubLObject term2, SubLObject share_vars, SubLObject justifyP) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        if ((NIL != variables.variable_p(term1)) && (NIL != forts.fort_p(term2))) {
            return values(list(bindings.make_variable_binding(term1, term2)), NIL);
        }
        return unification.unify(term1, term2, share_vars, justifyP);
    }

    public static final SubLObject asent_unify_alt(SubLObject asent1, SubLObject asent2, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = NIL;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        return unification.unify(asent1, asent2, share_vars, justify);
    }

    public static SubLObject asent_unify(final SubLObject asent1, final SubLObject asent2, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = NIL;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        return unification.unify(asent1, asent2, share_vars, justify);
    }

    public static final SubLObject gaf_asent_unify_alt(SubLObject inference_asent, SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = unification.unify(inference_asent, gaf_asent, share_vars, justify);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(v_bindings, NIL != v_bindings ? ((SubLObject) (gaf_asent)) : NIL, justification);
            }
        }
    }

    public static SubLObject gaf_asent_unify(final SubLObject inference_asent, final SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification.unify(inference_asent, gaf_asent, share_vars, justify);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(v_bindings, NIL != v_bindings ? gaf_asent : NIL, justification);
    }

    public static final SubLObject gaf_asent_args_unify_alt(SubLObject inference_asent, SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_args = cycl_utilities.atomic_sentence_args(inference_asent, UNPROVIDED);
                SubLObject gaf_args = cycl_utilities.atomic_sentence_args(gaf_asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification.unify(inference_args, gaf_args, share_vars, justify);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        return values(v_bindings, bindings.subst_bindings(v_bindings, inference_asent), justification);
                    } else {
                        return values(NIL, NIL, NIL);
                    }
                }
            }
        }
    }

    public static SubLObject gaf_asent_args_unify(final SubLObject inference_asent, final SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_args = cycl_utilities.atomic_sentence_args(inference_asent, UNPROVIDED);
        final SubLObject gaf_args = cycl_utilities.atomic_sentence_args(gaf_asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification.unify(inference_args, gaf_args, share_vars, justify);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return values(v_bindings, bindings.subst_bindings(v_bindings, inference_asent), justification);
        }
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject gaf_asent_inverse_args_unify_alt(SubLObject inference_asent, SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_args = reverse(cycl_utilities.atomic_sentence_args(inference_asent, UNPROVIDED));
                SubLObject gaf_args = cycl_utilities.atomic_sentence_args(gaf_asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification.unify(inference_args, gaf_args, share_vars, justify);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        return values(v_bindings, bindings.subst_bindings(v_bindings, inference_asent), justification);
                    } else {
                        return values(NIL, NIL, NIL);
                    }
                }
            }
        }
    }

    public static SubLObject gaf_asent_inverse_args_unify(final SubLObject inference_asent, final SubLObject gaf_asent, SubLObject share_vars, SubLObject justify) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justify == UNPROVIDED) {
            justify = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_args = reverse(cycl_utilities.atomic_sentence_args(inference_asent, UNPROVIDED));
        final SubLObject gaf_args = cycl_utilities.atomic_sentence_args(gaf_asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification.unify(inference_args, gaf_args, share_vars, justify);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return values(v_bindings, bindings.subst_bindings(v_bindings, inference_asent), justification);
        }
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject transformation_asent_unify_alt(SubLObject inference_asent, SubLObject rule_asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.unification_utilities.asent_unify(inference_asent, rule_asent, NIL, NIL);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(v_bindings, NIL);
            }
        }
    }

    public static SubLObject transformation_asent_unify(final SubLObject inference_asent, final SubLObject rule_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = asent_unify(inference_asent, rule_asent, NIL, NIL);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(v_bindings, NIL);
    }

    public static final SubLObject rewrite_asent_unify_alt(SubLObject unrestricted_asent, SubLObject rewritten_asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.unification_utilities.asent_unify(unrestricted_asent, rewritten_asent, T, NIL);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(v_bindings, NIL);
            }
        }
    }

    public static SubLObject rewrite_asent_unify(final SubLObject unrestricted_asent, final SubLObject rewritten_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = asent_unify(unrestricted_asent, rewritten_asent, T, NIL);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(v_bindings, NIL);
    }

    /**
     * Search for unifiers for the two lists of clauses, CLAUSES1 and CLAUSES2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two lists of clauses, CLAUSES1 and CLAUSES2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two lists of clauses, CLAUSES1 and CLAUSES2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static final SubLObject unify_clauses_alt(SubLObject clauses1, SubLObject clauses2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        SubLTrampolineFile.checkType(clauses1, LISTP);
        SubLTrampolineFile.checkType(clauses2, LISTP);
        if (!length(clauses1).numE(length(clauses2))) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.unification_utilities.clean_up_unify_result(com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(clauses1, clauses2, symbol_function(UNIFY_CLAUSE), share_varsP, assume_bindings));
    }

    /**
     * Search for unifiers for the two lists of clauses, CLAUSES1 and CLAUSES2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two lists of clauses, CLAUSES1 and CLAUSES2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two lists of clauses, CLAUSES1 and CLAUSES2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static SubLObject unify_clauses(final SubLObject clauses1, final SubLObject clauses2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        assert NIL != listp(clauses1) : "! listp(clauses1) " + ("Types.listp(clauses1) " + "CommonSymbols.NIL != Types.listp(clauses1) ") + clauses1;
        assert NIL != listp(clauses2) : "! listp(clauses2) " + ("Types.listp(clauses2) " + "CommonSymbols.NIL != Types.listp(clauses2) ") + clauses2;
        if (!length(clauses1).numE(length(clauses2))) {
            return NIL;
        }
        return clean_up_unify_result(unify_set_recursive(clauses1, clauses2, symbol_function(UNIFY_CLAUSE), share_varsP, assume_bindings));
    }

    /**
     * Remove any non-singleton occurrences of *dummy-binding*
     */
    @LispMethod(comment = "Remove any non-singleton occurrences of *dummy-binding*")
    public static final SubLObject clean_up_unify_result_alt(SubLObject binding_lists) {
        if ((NIL == binding_lists) || (NIL == bindings.tree_find_dummy_bindingP(binding_lists))) {
            return binding_lists;
        }
        {
            SubLObject new_binding_lists = NIL;
            SubLObject cdolist_list_var = binding_lists;
            SubLObject binding_list = NIL;
            for (binding_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_list = cdolist_list_var.first()) {
                {
                    SubLObject new_binding_list = bindings.remove_dummy_binding(binding_list);
                    if (NIL == bindings.unification_success_token_p(new_binding_list)) {
                        new_binding_lists = cons(new_binding_list, new_binding_lists);
                    }
                }
            }
            if (NIL != new_binding_lists) {
                return nreverse(new_binding_lists);
            } else {
                return list(bindings.unification_success_token());
            }
        }
    }

    /**
     * Remove any non-singleton occurrences of *dummy-binding*
     */
    @LispMethod(comment = "Remove any non-singleton occurrences of *dummy-binding*")
    public static SubLObject clean_up_unify_result(final SubLObject binding_lists) {
        if ((NIL == binding_lists) || (NIL == bindings.tree_find_dummy_bindingP(binding_lists))) {
            return binding_lists;
        }
        SubLObject new_binding_lists = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject binding_list = NIL;
        binding_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_binding_list = bindings.remove_dummy_binding(binding_list);
            if (NIL == bindings.unification_success_token_p(new_binding_list)) {
                new_binding_lists = cons(new_binding_list, new_binding_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        } 
        if (NIL != new_binding_lists) {
            return nreverse(new_binding_lists);
        }
        return list(bindings.unification_success_token());
    }

    /**
     * Search for unifiers for the two clauses CLAUSE1 and CLAUSE2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two clauses CLAUSE1 and CLAUSE2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two clauses CLAUSE1 and CLAUSE2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static final SubLObject unify_clause_alt(SubLObject clause1, SubLObject clause2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        SubLTrampolineFile.checkType(clause1, CLAUSE_P);
        SubLTrampolineFile.checkType(clause2, CLAUSE_P);
        if (!length(clauses.neg_lits(clause1)).numE(length(clauses.neg_lits(clause2)))) {
            return NIL;
        }
        if (!length(clauses.pos_lits(clause1)).numE(length(clauses.pos_lits(clause2)))) {
            return NIL;
        }
        {
            SubLObject neg_lit_answers = com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(clauses.neg_lits(clause1), clauses.neg_lits(clause2), symbol_function(UNIFY_CLAUSE_LITERAL), share_varsP, assume_bindings);
            if (NIL == neg_lit_answers) {
                return NIL;
            }
            {
                SubLObject answers = NIL;
                SubLObject cdolist_list_var = neg_lit_answers;
                SubLObject neg_lit_answer = NIL;
                for (neg_lit_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit_answer = cdolist_list_var.first()) {
                    {
                        SubLObject pos_lit_answers = com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(clauses.pos_lits(clause1), clauses.pos_lits(clause2), symbol_function(UNIFY_CLAUSE_LITERAL), share_varsP, neg_lit_answer);
                        if (NIL != pos_lit_answers) {
                            {
                                SubLObject cdolist_list_var_1 = pos_lit_answers;
                                SubLObject pos_lit_answer = NIL;
                                for (pos_lit_answer = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , pos_lit_answer = cdolist_list_var_1.first()) {
                                    answers = cons(pos_lit_answer, answers);
                                }
                            }
                        }
                    }
                }
                return nreverse(answers);
            }
        }
    }

    /**
     * Search for unifiers for the two clauses CLAUSE1 and CLAUSE2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two clauses CLAUSE1 and CLAUSE2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two clauses CLAUSE1 and CLAUSE2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static SubLObject unify_clause(final SubLObject clause1, final SubLObject clause2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        assert NIL != clauses.clause_p(clause1) : "! clauses.clause_p(clause1) " + ("clauses.clause_p(clause1) " + "CommonSymbols.NIL != clauses.clause_p(clause1) ") + clause1;
        assert NIL != clauses.clause_p(clause2) : "! clauses.clause_p(clause2) " + ("clauses.clause_p(clause2) " + "CommonSymbols.NIL != clauses.clause_p(clause2) ") + clause2;
        if (!length(clauses.neg_lits(clause1)).numE(length(clauses.neg_lits(clause2)))) {
            return NIL;
        }
        if (!length(clauses.pos_lits(clause1)).numE(length(clauses.pos_lits(clause2)))) {
            return NIL;
        }
        final SubLObject neg_lit_answers = unify_set_recursive(clauses.neg_lits(clause1), clauses.neg_lits(clause2), symbol_function(UNIFY_CLAUSE_LITERAL), share_varsP, assume_bindings);
        if (NIL == neg_lit_answers) {
            return NIL;
        }
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = neg_lit_answers;
        SubLObject neg_lit_answer = NIL;
        neg_lit_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pos_lit_answers = unify_set_recursive(clauses.pos_lits(clause1), clauses.pos_lits(clause2), symbol_function(UNIFY_CLAUSE_LITERAL), share_varsP, neg_lit_answer);
            if (NIL != pos_lit_answers) {
                SubLObject cdolist_list_var_$1 = pos_lit_answers;
                SubLObject pos_lit_answer = NIL;
                pos_lit_answer = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    answers = cons(pos_lit_answer, answers);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    pos_lit_answer = cdolist_list_var_$1.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit_answer = cdolist_list_var.first();
        } 
        return nreverse(answers);
    }

    public static final SubLObject unify_clause_literal_alt(SubLObject literal1, SubLObject literal2, SubLObject share_varsP, SubLObject assume_bindings) {
        return com.cyc.cycjava.cycl.unification_utilities.unify_element(literal1, literal2, share_varsP, assume_bindings);
    }

    public static SubLObject unify_clause_literal(final SubLObject literal1, final SubLObject literal2, final SubLObject share_varsP, final SubLObject assume_bindings) {
        return unify_element(literal1, literal2, share_varsP, assume_bindings);
    }

    /**
     * Try to find a variable map that maps CLAUSES1's variables to CLAUSES2's variables.
     */
    @LispMethod(comment = "Try to find a variable map that maps CLAUSES1\'s variables to CLAUSES2\'s variables.")
    public static final SubLObject compute_variable_map_alt(SubLObject clauses1, SubLObject clauses2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(clauses1, CLAUSES_P);
            SubLTrampolineFile.checkType(clauses2, CLAUSES_P);
            if (clauses1.equal(clauses2)) {
                return inference_czer.identity_variable_map(variables.max_hl_variable_id(clauses1));
            }
            {
                SubLObject vars_to_sanitize = cycl_utilities.expression_gather(clauses2, NON_BASE_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject sanitizing_variable_map = Mapping.mapcar(VARIABLE_BASE_INVERSION_BINDING, vars_to_sanitize);
                clauses2 = bindings.apply_bindings(sanitizing_variable_map, clauses2);
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = unification.$computing_variable_mapP$.currentBinding(thread);
                        try {
                            unification.$computing_variable_mapP$.bind(T, thread);
                            result = com.cyc.cycjava.cycl.unification_utilities.unify_clauses(clauses1, clauses2, NIL, UNPROVIDED).first();
                        } finally {
                            unification.$computing_variable_mapP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject undwimmed_bindings = NIL;
                        SubLObject cdolist_list_var = result;
                        SubLObject binding = NIL;
                        for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                            {
                                SubLObject datum = binding;
                                SubLObject current = datum;
                                SubLObject var1 = NIL;
                                SubLObject var2 = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt7);
                                var1 = current.first();
                                current = current.rest();
                                var2 = current;
                                {
                                    SubLObject undwimmed_var1 = unification.variable_base_version(var1);
                                    SubLObject undwimmed_var2 = bindings.apply_bindings_backwards(sanitizing_variable_map, var2);
                                    undwimmed_bindings = cons(bindings.make_variable_binding(undwimmed_var1, undwimmed_var2), undwimmed_bindings);
                                }
                            }
                        }
                        return nreverse(undwimmed_bindings);
                    }
                }
            }
        }
    }

    /**
     * Try to find a variable map that maps CLAUSES1's variables to CLAUSES2's variables.
     */
    @LispMethod(comment = "Try to find a variable map that maps CLAUSES1\'s variables to CLAUSES2\'s variables.")
    public static SubLObject compute_variable_map(final SubLObject clauses1, SubLObject clauses2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clauses.clauses_p(clauses1) : "! clauses.clauses_p(clauses1) " + ("clauses.clauses_p(clauses1) " + "CommonSymbols.NIL != clauses.clauses_p(clauses1) ") + clauses1;
        assert NIL != clauses.clauses_p(clauses2) : "! clauses.clauses_p(clauses2) " + ("clauses.clauses_p(clauses2) " + "CommonSymbols.NIL != clauses.clauses_p(clauses2) ") + clauses2;
        if (clauses1.equal(clauses2)) {
            return inference_czer.identity_variable_map(variables.max_hl_variable_id(clauses1));
        }
        final SubLObject vars_to_sanitize = cycl_utilities.expression_gather(clauses2, NON_BASE_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sanitizing_variable_map = Mapping.mapcar(VARIABLE_BASE_INVERSION_BINDING, vars_to_sanitize);
        clauses2 = bindings.apply_bindings(sanitizing_variable_map, clauses2);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = unification.$computing_variable_mapP$.currentBinding(thread);
        try {
            unification.$computing_variable_mapP$.bind(T, thread);
            result = unify_clauses(clauses1, clauses2, NIL, UNPROVIDED).first();
        } finally {
            unification.$computing_variable_mapP$.rebind(_prev_bind_0, thread);
        }
        SubLObject undwimmed_bindings = NIL;
        SubLObject cdolist_list_var = result;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject var1 = NIL;
            SubLObject var2 = NIL;
            destructuring_bind_must_consp(current, datum, $list7);
            var1 = current.first();
            current = var2 = current.rest();
            final SubLObject undwimmed_var1 = unification.variable_base_version(var1);
            final SubLObject undwimmed_var2 = bindings.apply_bindings_backwards(sanitizing_variable_map, var2);
            undwimmed_bindings = cons(bindings.make_variable_binding(undwimmed_var1, undwimmed_var2), undwimmed_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(undwimmed_bindings);
    }

    public static final SubLObject variable_base_inversion_binding_alt(SubLObject variable) {
        return bindings.make_variable_binding(variable, unification.variable_base_inverted_version(variable));
    }

    public static SubLObject variable_base_inversion_binding(final SubLObject variable) {
        return bindings.make_variable_binding(variable, unification.variable_base_inverted_version(variable));
    }

    /**
     * Search for unifiers for the two sets, SET1 and SET2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two sets, SET1 and SET2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two sets, SET1 and SET2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static final SubLObject unify_set_alt(SubLObject set1, SubLObject set2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        SubLTrampolineFile.checkType(set1, LISTP);
        SubLTrampolineFile.checkType(set2, LISTP);
        if (!length(set1).numE(length(set2))) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(set1, set2, symbol_function(UNIFY_ELEMENT), share_varsP, assume_bindings);
    }

    /**
     * Search for unifiers for the two sets, SET1 and SET2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two sets, SET1 and SET2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two sets, SET1 and SET2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static SubLObject unify_set(final SubLObject set1, final SubLObject set2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        assert NIL != listp(set1) : "! listp(set1) " + ("Types.listp(set1) " + "CommonSymbols.NIL != Types.listp(set1) ") + set1;
        assert NIL != listp(set2) : "! listp(set2) " + ("Types.listp(set2) " + "CommonSymbols.NIL != Types.listp(set2) ") + set2;
        if (!length(set1).numE(length(set2))) {
            return NIL;
        }
        return unify_set_recursive(set1, set2, symbol_function(UNIFY_ELEMENT), share_varsP, assume_bindings);
    }

    /**
     * Search for unifiers for the two sets of sets, SETS1 and SETS2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two sets of sets, SETS1 and SETS2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two sets of sets, SETS1 and SETS2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static final SubLObject unify_sets_alt(SubLObject sets1, SubLObject sets2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        SubLTrampolineFile.checkType(sets1, LISTP);
        SubLTrampolineFile.checkType(sets2, LISTP);
        if (!length(sets1).numE(length(sets2))) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(sets1, sets2, symbol_function(UNIFY_SET), share_varsP, assume_bindings);
    }

    /**
     * Search for unifiers for the two sets of sets, SETS1 and SETS2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two sets of sets, SETS1 and SETS2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two sets of sets, SETS1 and SETS2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static SubLObject unify_sets(final SubLObject sets1, final SubLObject sets2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        assert NIL != listp(sets1) : "! listp(sets1) " + ("Types.listp(sets1) " + "CommonSymbols.NIL != Types.listp(sets1) ") + sets1;
        assert NIL != listp(sets2) : "! listp(sets2) " + ("Types.listp(sets2) " + "CommonSymbols.NIL != Types.listp(sets2) ") + sets2;
        if (!length(sets1).numE(length(sets2))) {
            return NIL;
        }
        return unify_set_recursive(sets1, sets2, symbol_function(UNIFY_SET), share_varsP, assume_bindings);
    }

    /**
     * Search for unifiers for the two sets of sets of sets, SETS-OF-SETS1 and SETS-OF-SETS2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two sets of sets of sets, SETS-OF-SETS1 and SETS-OF-SETS2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two sets of sets of sets, SETS-OF-SETS1 and SETS-OF-SETS2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static final SubLObject unify_sets_of_sets_alt(SubLObject sets_of_sets1, SubLObject sets_of_sets2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        SubLTrampolineFile.checkType(sets_of_sets1, LISTP);
        SubLTrampolineFile.checkType(sets_of_sets2, LISTP);
        if (!length(sets_of_sets1).numE(length(sets_of_sets2))) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(sets_of_sets1, sets_of_sets2, symbol_function(UNIFY_SETS), share_varsP, assume_bindings);
    }

    /**
     * Search for unifiers for the two sets of sets of sets, SETS-OF-SETS1 and SETS-OF-SETS2.
     * ASSUME-BINDINGS represent pre-existing bindings to assume.
     * Return a list of binding sets, each of which represents a valid unifier.
     */
    @LispMethod(comment = "Search for unifiers for the two sets of sets of sets, SETS-OF-SETS1 and SETS-OF-SETS2.\r\nASSUME-BINDINGS represent pre-existing bindings to assume.\r\nReturn a list of binding sets, each of which represents a valid unifier.\nSearch for unifiers for the two sets of sets of sets, SETS-OF-SETS1 and SETS-OF-SETS2.\nASSUME-BINDINGS represent pre-existing bindings to assume.\nReturn a list of binding sets, each of which represents a valid unifier.")
    public static SubLObject unify_sets_of_sets(final SubLObject sets_of_sets1, final SubLObject sets_of_sets2, SubLObject share_varsP, SubLObject assume_bindings) {
        if (share_varsP == UNPROVIDED) {
            share_varsP = NIL;
        }
        if (assume_bindings == UNPROVIDED) {
            assume_bindings = NIL;
        }
        assert NIL != listp(sets_of_sets1) : "! listp(sets_of_sets1) " + ("Types.listp(sets_of_sets1) " + "CommonSymbols.NIL != Types.listp(sets_of_sets1) ") + sets_of_sets1;
        assert NIL != listp(sets_of_sets2) : "! listp(sets_of_sets2) " + ("Types.listp(sets_of_sets2) " + "CommonSymbols.NIL != Types.listp(sets_of_sets2) ") + sets_of_sets2;
        if (!length(sets_of_sets1).numE(length(sets_of_sets2))) {
            return NIL;
        }
        return unify_set_recursive(sets_of_sets1, sets_of_sets2, symbol_function(UNIFY_SETS), share_varsP, assume_bindings);
    }

    public static final SubLObject unify_set_recursive_alt(SubLObject set1, SubLObject set2, SubLObject elem_answer_function, SubLObject share_varsP, SubLObject assume_bindings) {
        if (NIL == set1) {
            return list(assume_bindings);
        }
        {
            SubLObject elem1 = set1.first();
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = set2;
            SubLObject elem2 = NIL;
            for (elem2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem2 = cdolist_list_var.first()) {
                {
                    SubLObject single_elem_answers = funcall(elem_answer_function, elem1, elem2, share_varsP, assume_bindings);
                    if (NIL != single_elem_answers) {
                        {
                            SubLObject cdolist_list_var_2 = single_elem_answers;
                            SubLObject single_elem_answer = NIL;
                            for (single_elem_answer = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , single_elem_answer = cdolist_list_var_2.first()) {
                                {
                                    SubLObject recursive_answers = com.cyc.cycjava.cycl.unification_utilities.unify_set_recursive(set1.rest(), remove(elem2, set2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), elem_answer_function, share_varsP, list_utilities.fast_delete_duplicates(append(assume_bindings, single_elem_answer), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    if (NIL != recursive_answers) {
                                        {
                                            SubLObject cdolist_list_var_3 = recursive_answers;
                                            SubLObject recursive_answer = NIL;
                                            for (recursive_answer = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , recursive_answer = cdolist_list_var_3.first()) {
                                                {
                                                    SubLObject item_var = recursive_answer;
                                                    if (NIL == member(item_var, answers, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        answers = cons(item_var, answers);
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
            return nreverse(answers);
        }
    }

    public static SubLObject unify_set_recursive(final SubLObject set1, final SubLObject set2, final SubLObject elem_answer_function, final SubLObject share_varsP, final SubLObject assume_bindings) {
        if (NIL == set1) {
            return list(assume_bindings);
        }
        final SubLObject elem1 = set1.first();
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = set2;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject single_elem_answers = funcall(elem_answer_function, elem1, elem2, share_varsP, assume_bindings);
            if (NIL != single_elem_answers) {
                SubLObject cdolist_list_var_$2 = single_elem_answers;
                SubLObject single_elem_answer = NIL;
                single_elem_answer = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject recursive_answers = unify_set_recursive(set1.rest(), remove(elem2, set2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), elem_answer_function, share_varsP, list_utilities.fast_delete_duplicates(append(assume_bindings, single_elem_answer), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    if (NIL != recursive_answers) {
                        SubLObject cdolist_list_var_$3 = recursive_answers;
                        SubLObject recursive_answer = NIL;
                        recursive_answer = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            final SubLObject item_var = recursive_answer;
                            if (NIL == member(item_var, answers, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                answers = cons(item_var, answers);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            recursive_answer = cdolist_list_var_$3.first();
                        } 
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    single_elem_answer = cdolist_list_var_$2.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem2 = cdolist_list_var.first();
        } 
        return nreverse(answers);
    }

    public static final SubLObject unify_element_alt(SubLObject elem1, SubLObject elem2, SubLObject share_varsP, SubLObject assume_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = unification.unify_assuming_bindings(elem1, elem2, share_varsP, assume_bindings, UNPROVIDED);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return list(v_bindings);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject unify_element(final SubLObject elem1, final SubLObject elem2, final SubLObject share_varsP, final SubLObject assume_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification.unify_assuming_bindings(elem1, elem2, share_varsP, assume_bindings, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return list(v_bindings);
        }
        return NIL;
    }

    public static final SubLObject parent_to_unify_bindings_alt(SubLObject parent_dnf, SubLObject unify_bindings) {
        {
            SubLObject v_variables = list_utilities.tree_gather(parent_dnf, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result_bindings = NIL;
            SubLObject cdolist_list_var = v_variables;
            SubLObject variable = NIL;
            for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                {
                    SubLObject result_binding = NIL;
                    SubLTrampolineFile.checkType(variable, BASE_VARIABLE_P);
                    {
                        SubLObject high_variable = unification.variable_non_base_version(variable);
                        result_binding = bindings.subst_bindings(unify_bindings, high_variable);
                    }
                    result_bindings = cons(bindings.make_variable_binding(variable, result_binding), result_bindings);
                }
            }
            return nreverse(result_bindings);
        }
    }

    public static SubLObject parent_to_unify_bindings(final SubLObject parent_dnf, final SubLObject unify_bindings) {
        final SubLObject v_variables = list_utilities.tree_gather(parent_dnf, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result_bindings = NIL;
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject result_binding = NIL;
            assert NIL != unification.base_variable_p(variable) : "! unification.base_variable_p(variable) " + ("unification.base_variable_p(variable) " + "CommonSymbols.NIL != unification.base_variable_p(variable) ") + variable;
            final SubLObject high_variable = unification.variable_non_base_version(variable);
            result_binding = bindings.subst_bindings(unify_bindings, high_variable);
            result_bindings = cons(bindings.make_variable_binding(variable, result_binding), result_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return nreverse(result_bindings);
    }

    public static final SubLObject unify_to_child_bindings_alt(SubLObject unify_dnf) {
        {
            SubLObject v_variables = list_utilities.tree_gather(unify_dnf, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result_bindings = NIL;
            v_variables = Sort.sort(v_variables, symbol_function($sym13$TERM__), UNPROVIDED);
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = v_variables;
                SubLObject unify_variable = NIL;
                for (unify_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unify_variable = cdolist_list_var.first()) {
                    {
                        SubLObject child_variable = unify_variable;
                        child_variable = variables.find_variable_by_id(index);
                        index = add(index, ONE_INTEGER);
                        result_bindings = cons(bindings.make_variable_binding(unify_variable, child_variable), result_bindings);
                    }
                }
            }
            return nreverse(result_bindings);
        }
    }

    public static SubLObject unify_to_child_bindings(final SubLObject unify_dnf) {
        SubLObject v_variables = list_utilities.tree_gather(unify_dnf, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result_bindings = NIL;
        v_variables = Sort.sort(v_variables, symbol_function($sym13$TERM__), UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = v_variables;
        SubLObject unify_variable = NIL;
        unify_variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject child_variable = unify_variable;
            child_variable = variables.find_variable_by_id(index);
            index = add(index, ONE_INTEGER);
            result_bindings = cons(bindings.make_variable_binding(unify_variable, child_variable), result_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            unify_variable = cdolist_list_var.first();
        } 
        return nreverse(result_bindings);
    }

    public static final SubLObject unify_source_bindings_alt(SubLObject unify_bindings, SubLObject unify_child_bindings) {
        {
            SubLObject relevant_unify_bindings = remove_if(symbol_function(NON_BASE_VARIABLE_P), unify_bindings, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject relevant_unify_child_bindings = remove_if(symbol_function(NON_BASE_VARIABLE_P), unify_child_bindings, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject unify_source_bindings = nunion(relevant_unify_bindings, relevant_unify_child_bindings, symbol_function(EQL), symbol_function(CAR));
            return unify_source_bindings;
        }
    }

    public static SubLObject unify_source_bindings(final SubLObject unify_bindings, final SubLObject unify_child_bindings) {
        final SubLObject relevant_unify_bindings = remove_if(symbol_function(NON_BASE_VARIABLE_P), unify_bindings, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject relevant_unify_child_bindings = remove_if(symbol_function(NON_BASE_VARIABLE_P), unify_child_bindings, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject unify_source_bindings = nunion(relevant_unify_bindings, relevant_unify_child_bindings, symbol_function(EQL), symbol_function(CAR));
        return unify_source_bindings;
    }

    public static final SubLObject parent_to_child_bindings_alt(SubLObject parent_unify_bindings, SubLObject unify_child_bindings) {
        {
            SubLObject final_bindings = NIL;
            SubLObject cdolist_list_var = parent_unify_bindings;
            SubLObject parent_unify_binding = NIL;
            for (parent_unify_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_unify_binding = cdolist_list_var.first()) {
                {
                    SubLObject datum = parent_unify_binding;
                    SubLObject current = datum;
                    SubLObject parent_var = NIL;
                    SubLObject unify_binding = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    parent_var = current.first();
                    current = current.rest();
                    unify_binding = current;
                    final_bindings = cons(bindings.make_variable_binding(unification.variable_base_version(parent_var), sublis(unify_child_bindings, unify_binding, UNPROVIDED, UNPROVIDED)), final_bindings);
                }
            }
            return nreverse(final_bindings);
        }
    }

    public static SubLObject parent_to_child_bindings(final SubLObject parent_unify_bindings, final SubLObject unify_child_bindings) {
        SubLObject final_bindings = NIL;
        SubLObject cdolist_list_var = parent_unify_bindings;
        SubLObject parent_unify_binding = NIL;
        parent_unify_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = parent_unify_binding;
            SubLObject parent_var = NIL;
            SubLObject unify_binding = NIL;
            destructuring_bind_must_consp(current, datum, $list15);
            parent_var = current.first();
            current = unify_binding = current.rest();
            final_bindings = cons(bindings.make_variable_binding(unification.variable_base_version(parent_var), sublis(unify_child_bindings, unify_binding, UNPROVIDED, UNPROVIDED)), final_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            parent_unify_binding = cdolist_list_var.first();
        } 
        return nreverse(final_bindings);
    }

    public static final SubLObject clear_query_dnf_from_formula_alt() {
        {
            SubLObject cs = $query_dnf_from_formula_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_query_dnf_from_formula() {
        final SubLObject cs = $query_dnf_from_formula_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_query_dnf_from_formula_alt(SubLObject formula) {
        return memoization_state.caching_state_remove_function_results_with_args($query_dnf_from_formula_caching_state$.getGlobalValue(), list(formula), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_query_dnf_from_formula(final SubLObject formula) {
        return memoization_state.caching_state_remove_function_results_with_args($query_dnf_from_formula_caching_state$.getGlobalValue(), list(formula), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject query_dnf_from_formula_internal_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
                    try {
                        czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                        v_answer = Mapping.mapcar(symbol_function(CAR), czer_main.canonicalize_query(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } finally {
                        czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject query_dnf_from_formula_internal(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
        try {
            czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
            v_answer = Mapping.mapcar(symbol_function(CAR), czer_main.canonicalize_query(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static final SubLObject query_dnf_from_formula_alt(SubLObject formula) {
        {
            SubLObject caching_state = $query_dnf_from_formula_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QUERY_DNF_FROM_FORMULA, $query_dnf_from_formula_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, $kw18$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.unification_utilities.query_dnf_from_formula_internal(formula)));
                    memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject query_dnf_from_formula(final SubLObject formula) {
        SubLObject caching_state = $query_dnf_from_formula_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_DNF_FROM_FORMULA, $query_dnf_from_formula_caching_state$, $int$512, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_dnf_from_formula_internal(formula)));
            memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject remove_duplicate_formulas_alt(SubLObject formula_list, SubLObject validateP) {
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        if (NIL != validateP) {
            return com.cyc.cycjava.cycl.unification_utilities.remove_duplicate_or_invalid_formulas(formula_list);
        } else {
            com.cyc.cycjava.cycl.unification_utilities.clear_query_dnf_from_formula();
            return remove_duplicates(formula_list, symbol_function(EQUAL), symbol_function(QUERY_DNF_FROM_FORMULA), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject remove_duplicate_formulas(final SubLObject formula_list, SubLObject validateP) {
        if (validateP == UNPROVIDED) {
            validateP = NIL;
        }
        if (NIL != validateP) {
            return remove_duplicate_or_invalid_formulas(formula_list);
        }
        clear_query_dnf_from_formula();
        return remove_duplicates(formula_list, symbol_function(EQUAL), symbol_function(QUERY_DNF_FROM_FORMULA), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject remove_duplicate_or_invalid_formulas_alt(SubLObject formula_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.unification_utilities.clear_query_dnf_from_formula();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding(thread);
                    try {
                        czer_vars.$must_enforce_semanticsP$.bind(T, thread);
                        result = list_utilities.remove_from_end_duplicates_and_those_wXkey(formula_list, NIL, symbol_function(EQUAL), symbol_function(QUERY_DNF_FROM_FORMULA), UNPROVIDED, UNPROVIDED);
                    } finally {
                        czer_vars.$must_enforce_semanticsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject remove_duplicate_or_invalid_formulas(final SubLObject formula_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_query_dnf_from_formula();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding(thread);
        try {
            czer_vars.$must_enforce_semanticsP$.bind(T, thread);
            result = list_utilities.remove_from_end_duplicates_and_those_wXkey(formula_list, NIL, symbol_function(EQUAL), symbol_function(QUERY_DNF_FROM_FORMULA), UNPROVIDED, UNPROVIDED);
        } finally {
            czer_vars.$must_enforce_semanticsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject unify_el_alt(SubLObject object_1, SubLObject object_2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = NIL;
                SubLObject justification = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_supports_dot_syntaxP$.currentBinding(thread);
                    try {
                        czer_vars.$el_supports_dot_syntaxP$.bind(T, thread);
                        if ((NIL != clause_utilities.cnfP(object_1)) && (NIL != clause_utilities.cnfP(object_2))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_bindings_4 = com.cyc.cycjava.cycl.unification_utilities.unify_el_cnfs(object_1, object_2, justifyP);
                                SubLObject justification_5 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_4;
                                justification = justification_5;
                            }
                        }
                    } finally {
                        czer_vars.$el_supports_dot_syntaxP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject unify_el(final SubLObject object_1, final SubLObject object_2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_supports_dot_syntaxP$.currentBinding(thread);
        try {
            czer_vars.$el_supports_dot_syntaxP$.bind(T, thread);
            if ((NIL != clause_utilities.cnfP(object_1)) && (NIL != clause_utilities.cnfP(object_2))) {
                thread.resetMultipleValues();
                final SubLObject v_bindings_$4 = unify_el_cnfs(object_1, object_2, justifyP);
                final SubLObject justification_$5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_bindings = v_bindings_$4;
                justification = justification_$5;
            } else
                if ((NIL != cycl_grammar.cycl_denotational_term_p(object_1)) && (NIL != cycl_grammar.cycl_denotational_term_p(object_2))) {
                    return unify_el_terms(object_1, object_2, UNPROVIDED);
                }

        } finally {
            czer_vars.$el_supports_dot_syntaxP$.rebind(_prev_bind_0, thread);
        }
        return values(v_bindings, justification);
    }

    public static final SubLObject unify_el_cnfs_alt(SubLObject cnf_1, SubLObject cnf_2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_cnf_1 = czer_main.rename_clause_vars(cnf_1, UNPROVIDED).first();
                SubLObject hl_cnf_2 = (NIL != hl_cnf_1) ? ((SubLObject) (czer_main.rename_clause_vars(cnf_2, UNPROVIDED).first())) : NIL;
                SubLObject v_bindings = NIL;
                SubLObject justification = NIL;
                if (NIL != hl_cnf_2) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings_6 = unification.unify(hl_cnf_1, hl_cnf_2, NIL, justifyP);
                        SubLObject justification_7 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        v_bindings = v_bindings_6;
                        justification = justification_7;
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject unify_el_cnfs(final SubLObject cnf_1, final SubLObject cnf_2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_cnf_1 = czer_main.rename_clause_vars(cnf_1, UNPROVIDED).first();
        final SubLObject hl_cnf_2 = (NIL != hl_cnf_1) ? czer_main.rename_clause_vars(cnf_2, UNPROVIDED).first() : NIL;
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        if (NIL != hl_cnf_2) {
            thread.resetMultipleValues();
            final SubLObject v_bindings_$6 = unification.unify(hl_cnf_1, hl_cnf_2, NIL, justifyP);
            final SubLObject justification_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_bindings = v_bindings_$6;
            justification = justification_$7;
        }
        return values(v_bindings, justification);
    }

    public static SubLObject unify_el_terms(final SubLObject term_1, final SubLObject term_2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        return unify_el_terms_int(term_1, term_2, justifyP, T);
    }

    public static SubLObject unify_open_el_terms(final SubLObject term_1, final SubLObject term_2, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        return unify_el_terms_int(term_1, term_2, justifyP, NIL);
    }

    public static SubLObject unify_el_terms_int(final SubLObject term_1, final SubLObject term_2, final SubLObject justifyP, final SubLObject share_varsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = czer_main.rename_clause_vars(list($$retainTerm, term_1), UNPROVIDED);
        SubLObject hl_cnf_1 = NIL;
        SubLObject el_bindings_1 = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        hl_cnf_1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        el_bindings_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$9;
            final SubLObject datum_$8 = current_$9 = czer_main.rename_clause_vars(list($$retainTerm, term_2), UNPROVIDED);
            SubLObject hl_cnf_2 = NIL;
            SubLObject el_bindings_2 = NIL;
            destructuring_bind_must_consp(current_$9, datum_$8, $list22);
            hl_cnf_2 = current_$9.first();
            current_$9 = current_$9.rest();
            destructuring_bind_must_consp(current_$9, datum_$8, $list22);
            el_bindings_2 = current_$9.first();
            current_$9 = current_$9.rest();
            if (NIL == current_$9) {
                thread.resetMultipleValues();
                final SubLObject hl_bindings = unification.unify(hl_cnf_1, hl_cnf_2, share_varsP, justifyP);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject transformed_el_bindings_1 = (NIL != share_varsP) ? el_bindings_1 : unification.non_base_variable_transform(el_bindings_1);
                final SubLObject el_bindings = bindings.apply_bindings_backwards(el_bindings_2, bindings.apply_bindings_backwards(transformed_el_bindings_1, hl_bindings));
                return values(el_bindings, justification);
            }
            cdestructuring_bind_error(datum_$8, $list22);
        } else {
            cdestructuring_bind_error(datum, $list21);
        }
        return NIL;
    }

    public static final SubLObject unify_one_way_alt(SubLObject template, SubLObject v_object) {
        {
            SubLObject opaque_object = transform_list_utilities.transform(v_object, VARIABLE_P, OBJECT_TO_STRING, UNPROVIDED);
            return unification.unify(template, opaque_object, T, UNPROVIDED);
        }
    }

    public static SubLObject unify_one_way(final SubLObject template, final SubLObject v_object) {
        final SubLObject opaque_object = transform_list_utilities.transform(v_object, VARIABLE_P, OBJECT_TO_STRING, UNPROVIDED);
        return unification.unify(template, opaque_object, T, UNPROVIDED);
    }

    public static final SubLObject genl_mt_unify_alt(SubLObject unbound_mt, SubLObject bound_mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            bound_mt = date_utilities.possibly_bind_temporal_indexical_in_object(bound_mt);
            unbound_mt = date_utilities.possibly_bind_temporal_indexical_in_object(unbound_mt);
            {
                SubLObject v_bindings = NIL;
                SubLObject justification = NIL;
                {
                    SubLObject _prev_bind_0 = unification.$unify_return_justificationP$.currentBinding(thread);
                    try {
                        unification.$unify_return_justificationP$.bind(justifyP, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings_8 = com.cyc.cycjava.cycl.unification_utilities.term_unify(unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED);
                            SubLObject justification_9 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            v_bindings = v_bindings_8;
                            justification = justification_9;
                        }
                        if (NIL == v_bindings) {
                            if (NIL != variables.fully_bound_p(unbound_mt)) {
                                if (NIL != genl_mts.genl_mtP(unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED)) {
                                    v_bindings = bindings.unification_success_token();
                                    justification = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_genl_mt(unbound_mt, bound_mt);
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings_10 = (NIL != hlmt.monad_mtP(bound_mt)) ? ((SubLObject) (com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_int(unbound_mt, hlmt.new_hlmt(list(bound_mt, hlmt.new_time_dimension($$Always_TimeInterval, $$TimePoint)))))) : com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_int(unbound_mt, bound_mt);
                                    SubLObject justification_11 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    v_bindings = v_bindings_10;
                                    justification = justification_11;
                                }
                                if (NIL != v_bindings) {
                                    v_bindings = bindings.delete_dummy_binding(v_bindings);
                                    if (NIL != v_bindings) {
                                        v_bindings = list_utilities.fast_delete_duplicates(v_bindings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        v_bindings = bindings.unification_success_token();
                                    }
                                }
                            }
                        }
                    } finally {
                        unification.$unify_return_justificationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject genl_mt_unify(SubLObject unbound_mt, SubLObject bound_mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        bound_mt = date_utilities.possibly_bind_temporal_indexical_in_object(bound_mt);
        unbound_mt = date_utilities.possibly_bind_temporal_indexical_in_object(unbound_mt);
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        final SubLObject _prev_bind_0 = unification.$unify_return_justificationP$.currentBinding(thread);
        try {
            unification.$unify_return_justificationP$.bind(justifyP, thread);
            thread.resetMultipleValues();
            final SubLObject v_bindings_$10 = term_unify(unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED);
            final SubLObject justification_$11 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_bindings = v_bindings_$10;
            justification = justification_$11;
            if (NIL == v_bindings) {
                if (NIL != variables.fully_bound_p(unbound_mt)) {
                    if (NIL != genl_mts.genl_mtP(unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED)) {
                        v_bindings = bindings.unification_success_token();
                        justification = genl_mt_unify_possibly_justify_genl_mt(unbound_mt, bound_mt);
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings_$11 = (NIL != hlmt.monad_mtP(bound_mt)) ? genl_mt_unify_int(unbound_mt, hlmt.new_hlmt(list(bound_mt, hlmt.new_time_dimension($$Always_TimeInterval, $$TimePoint)))) : genl_mt_unify_int(unbound_mt, bound_mt);
                    final SubLObject justification_$12 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_bindings = v_bindings_$11;
                    justification = justification_$12;
                    if (NIL != v_bindings) {
                        v_bindings = bindings.delete_dummy_binding(v_bindings);
                        if (NIL != v_bindings) {
                            v_bindings = list_utilities.fast_delete_duplicates(v_bindings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            v_bindings = bindings.unification_success_token();
                        }
                    }
                }
            }
        } finally {
            unification.$unify_return_justificationP$.rebind(_prev_bind_0, thread);
        }
        return values(v_bindings, justification);
    }

    public static final SubLObject genl_mt_unify_int_alt(SubLObject unbound_mt, SubLObject bound_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_bindings = com.cyc.cycjava.cycl.unification_utilities.term_unify(unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED);
                SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == v_bindings) {
                    if (NIL != forts.fort_p(unbound_mt)) {
                        if ((NIL != hlmt.monad_mtP(bound_mt)) && (NIL != com.cyc.cycjava.cycl.unification_utilities.monad_genl_mt_cachedP(unbound_mt, bound_mt))) {
                            v_bindings = bindings.unification_success_token();
                            justification = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_genl_mt(unbound_mt, bound_mt);
                        }
                    } else {
                        if (NIL != forts.fort_p(bound_mt)) {
                        } else {
                            if (NIL != hlmt.temporal_dimension_mt_p(bound_mt)) {
                                if (NIL != variables.fully_bound_p(unbound_mt)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_bindings_12 = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_temporal_dimension_fully_bound(unbound_mt, bound_mt);
                                        SubLObject justification_13 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        v_bindings = v_bindings_12;
                                        justification = justification_13;
                                    }
                                } else {
                                    if (NIL != list_utilities.dotted_list_p(unbound_mt)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings_14 = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_temporal_dimension_dotted_list(unbound_mt, bound_mt);
                                            SubLObject justification_15 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            v_bindings = v_bindings_14;
                                            justification = justification_15;
                                        }
                                    } else {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_bindings_16 = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_temporal_dimension_undotted_list(unbound_mt, bound_mt);
                                            SubLObject justification_17 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            v_bindings = v_bindings_16;
                                            justification = justification_17;
                                        }
                                    }
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject car_bindings = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_int(unbound_mt.first(), bound_mt.first());
                                    SubLObject car_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != car_bindings) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject cdr_bindings = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_int(unbound_mt.rest(), bound_mt.rest());
                                            SubLObject cdr_justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != cdr_bindings) {
                                                if (NIL == bindings.some_variable_with_conflicting_bindings(car_bindings, cdr_bindings)) {
                                                    v_bindings = append(car_bindings, cdr_bindings);
                                                    justification = append(car_justification, cdr_justification);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject genl_mt_unify_int(final SubLObject unbound_mt, final SubLObject bound_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_bindings = term_unify(unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == v_bindings) {
            if (NIL != forts.fort_p(unbound_mt)) {
                if ((NIL != hlmt.monad_mtP(bound_mt)) && (NIL != monad_genl_mt_cachedP(unbound_mt, bound_mt))) {
                    v_bindings = bindings.unification_success_token();
                    justification = genl_mt_unify_possibly_justify_genl_mt(unbound_mt, bound_mt);
                }
            } else
                if (NIL == forts.fort_p(bound_mt)) {
                    if (NIL != hlmt.temporal_dimension_mt_p(bound_mt)) {
                        if (NIL != variables.fully_bound_p(unbound_mt)) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings_$14 = genl_mt_unify_temporal_dimension_fully_bound(unbound_mt, bound_mt);
                            final SubLObject justification_$15 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            v_bindings = v_bindings_$14;
                            justification = justification_$15;
                        } else
                            if (NIL != list_utilities.dotted_list_p(unbound_mt)) {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$15 = genl_mt_unify_temporal_dimension_dotted_list(unbound_mt, bound_mt);
                                final SubLObject justification_$16 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$15;
                                justification = justification_$16;
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$16 = genl_mt_unify_temporal_dimension_undotted_list(unbound_mt, bound_mt);
                                final SubLObject justification_$17 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$16;
                                justification = justification_$17;
                            }

                    } else {
                        thread.resetMultipleValues();
                        final SubLObject car_bindings = genl_mt_unify_int(unbound_mt.first(), bound_mt.first());
                        final SubLObject car_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != car_bindings) {
                            thread.resetMultipleValues();
                            final SubLObject cdr_bindings = genl_mt_unify_int(unbound_mt.rest(), bound_mt.rest());
                            final SubLObject cdr_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != cdr_bindings) && (NIL == bindings.some_variable_with_conflicting_bindings(car_bindings, cdr_bindings))) {
                                v_bindings = append(car_bindings, cdr_bindings);
                                justification = append(car_justification, cdr_justification);
                            }
                        }
                    }
                }

        }
        return values(v_bindings, justification);
    }

    public static final SubLObject clear_monad_genl_mt_cachedP_alt() {
        {
            SubLObject cs = $monad_genl_mt_cachedP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_monad_genl_mt_cachedP() {
        final SubLObject cs = $monad_genl_mt_cachedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_monad_genl_mt_cachedP_alt(SubLObject monad1, SubLObject monad2) {
        return memoization_state.caching_state_remove_function_results_with_args($monad_genl_mt_cachedP_caching_state$.getGlobalValue(), list(monad1, monad2), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_monad_genl_mt_cachedP(final SubLObject monad1, final SubLObject monad2) {
        return memoization_state.caching_state_remove_function_results_with_args($monad_genl_mt_cachedP_caching_state$.getGlobalValue(), list(monad1, monad2), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject monad_genl_mt_cachedP_internal_alt(SubLObject monad1, SubLObject monad2) {
        return genl_mts.monad_genl_mtP(monad1, monad2, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject monad_genl_mt_cachedP_internal(final SubLObject monad1, final SubLObject monad2) {
        return genl_mts.monad_genl_mtP(monad1, monad2, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject monad_genl_mt_cachedP_alt(SubLObject monad1, SubLObject monad2) {
        {
            SubLObject caching_state = $monad_genl_mt_cachedP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym22$MONAD_GENL_MT_CACHED_, $sym23$_MONAD_GENL_MT_CACHED__CACHING_STATE_, $int$256, EQ, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback($sym25$CLEAR_MONAD_GENL_MT_CACHED_);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(monad1, monad2);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw18$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (monad1 == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && (monad2 == cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.unification_utilities.monad_genl_mt_cachedP_internal(monad1, monad2)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(monad1, monad2));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject monad_genl_mt_cachedP(final SubLObject monad1, final SubLObject monad2) {
        SubLObject caching_state = $monad_genl_mt_cachedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym26$MONAD_GENL_MT_CACHED_, $sym27$_MONAD_GENL_MT_CACHED__CACHING_STATE_, $int$256, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym29$CLEAR_MONAD_GENL_MT_CACHED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(monad1, monad2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (monad1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && monad2.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(monad_genl_mt_cachedP_internal(monad1, monad2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(monad1, monad2));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject genl_mt_unify_temporal_dimension_fully_bound_alt(SubLObject unbound_mt, SubLObject bound_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = NIL;
                SubLObject justification = NIL;
                SubLObject bound_index = NIL;
                SubLObject bound_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject bound_index_18 = hlmt.mt_time_dim_nat_temporal_values(bound_mt);
                    SubLObject bound_param_19 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    bound_index = bound_index_18;
                    bound_param = bound_param_19;
                }
                {
                    SubLObject unbound_index = NIL;
                    SubLObject unbound_param = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject unbound_index_20 = hlmt.mt_time_dim_nat_temporal_values(unbound_mt);
                        SubLObject unbound_param_21 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        unbound_index = unbound_index_20;
                        unbound_param = unbound_param_21;
                    }
                    if (NIL != hlmt_relevance.mt_times_visible_p(unbound_index, bound_index, unbound_param, bound_param)) {
                        v_bindings = bindings.unification_success_token();
                        justification = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_genl_mt(unbound_mt, bound_mt);
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject genl_mt_unify_temporal_dimension_fully_bound(final SubLObject unbound_mt, final SubLObject bound_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        SubLObject bound_index = NIL;
        SubLObject bound_param = NIL;
        thread.resetMultipleValues();
        final SubLObject bound_index_$20 = hlmt.mt_time_dim_nat_temporal_values(bound_mt);
        final SubLObject bound_param_$21 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        bound_index = bound_index_$20;
        bound_param = bound_param_$21;
        SubLObject unbound_index = NIL;
        SubLObject unbound_param = NIL;
        thread.resetMultipleValues();
        final SubLObject unbound_index_$22 = hlmt.mt_time_dim_nat_temporal_values(unbound_mt);
        final SubLObject unbound_param_$23 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        unbound_index = unbound_index_$22;
        unbound_param = unbound_param_$23;
        if (NIL != hlmt_relevance.mt_times_visible_p(unbound_index, bound_index, unbound_param, bound_param)) {
            v_bindings = bindings.unification_success_token();
            justification = genl_mt_unify_possibly_justify_genl_mt(unbound_mt, bound_mt);
        }
        return values(v_bindings, justification);
    }

    public static final SubLObject genl_mt_unify_temporal_dimension_dotted_list_alt(SubLObject unbound_mt, SubLObject bound_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = NIL;
                SubLObject justification = NIL;
                SubLObject bound_index = NIL;
                SubLObject bound_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject bound_index_22 = hlmt.mt_time_dim_nat_temporal_values(bound_mt);
                    SubLObject bound_param_23 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    bound_index = bound_index_22;
                    bound_param = bound_param_23;
                }
                {
                    SubLObject pcase_var = unbound_mt.first();
                    if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
                        {
                            SubLObject pcase_var_24 = list_utilities.dotted_length(unbound_mt);
                            if (pcase_var_24.eql(ONE_INTEGER)) {
                                if (NIL != variables.variable_p(unbound_mt.rest())) {
                                    v_bindings = list(bindings.make_variable_binding(unbound_mt.rest(), list(bound_index, bound_param)));
                                }
                            } else {
                                if (pcase_var_24.eql(TWO_INTEGER)) {
                                    {
                                        SubLObject datum = unbound_mt.rest();
                                        SubLObject current = datum;
                                        SubLObject unbound_index = NIL;
                                        SubLObject unbound_param = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt27);
                                        unbound_index = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt27);
                                        unbound_param = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != variables.variable_p(unbound_param)) {
                                                {
                                                    SubLObject param_binding = bindings.make_variable_binding(unbound_param, bound_param);
                                                    if (NIL != variables.fully_bound_p(unbound_index)) {
                                                        if ((NIL != hlmt_relevance.subsumed_time_intervalP(unbound_index, bound_index)) && (NIL != hlmt_relevance.time_interval_subsumes_typeP(unbound_index, bound_param))) {
                                                            v_bindings = list(param_binding);
                                                        }
                                                    } else {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject index_bindings = com.cyc.cycjava.cycl.unification_utilities.term_unify(unbound_index, bound_index, UNPROVIDED, UNPROVIDED);
                                                            SubLObject index_justification = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != index_bindings) {
                                                                if (NIL == bindings.some_variable_with_conflicting_bindings(index_bindings, list(param_binding))) {
                                                                    v_bindings = cons(param_binding, index_bindings);
                                                                    justification = index_justification;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt27);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($$MtTimeDimFn)) {
                            {
                                SubLObject pcase_var_25 = list_utilities.dotted_length(unbound_mt);
                                if (pcase_var_25.eql(ONE_INTEGER)) {
                                    if ((NIL != variables.variable_p(unbound_mt.rest())) && ($$Null_TimeParameter == bound_param)) {
                                        v_bindings = list(bindings.make_variable_binding(unbound_mt.rest(), list(bound_index)));
                                    }
                                }
                            }
                        }
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject genl_mt_unify_temporal_dimension_dotted_list(final SubLObject unbound_mt, final SubLObject bound_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        SubLObject bound_index = NIL;
        SubLObject bound_param = NIL;
        thread.resetMultipleValues();
        final SubLObject bound_index_$24 = hlmt.mt_time_dim_nat_temporal_values(bound_mt);
        final SubLObject bound_param_$25 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        bound_index = bound_index_$24;
        bound_param = bound_param_$25;
        final SubLObject pcase_var = unbound_mt.first();
        if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
            final SubLObject pcase_var_$26 = list_utilities.dotted_length(unbound_mt);
            if (pcase_var_$26.eql(ONE_INTEGER)) {
                if (NIL != variables.variable_p(unbound_mt.rest())) {
                    v_bindings = list(bindings.make_variable_binding(unbound_mt.rest(), list(bound_index, bound_param)));
                }
            } else
                if (pcase_var_$26.eql(TWO_INTEGER)) {
                    SubLObject current;
                    final SubLObject datum = current = unbound_mt.rest();
                    SubLObject unbound_index = NIL;
                    SubLObject unbound_param = NIL;
                    destructuring_bind_must_consp(current, datum, $list31);
                    unbound_index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list31);
                    unbound_param = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != variables.variable_p(unbound_param)) {
                            final SubLObject param_binding = bindings.make_variable_binding(unbound_param, bound_param);
                            if (NIL != variables.fully_bound_p(unbound_index)) {
                                if ((NIL != hlmt_relevance.subsumed_time_intervalP(unbound_index, bound_index)) && (NIL != hlmt_relevance.time_interval_subsumes_typeP(unbound_index, bound_param))) {
                                    v_bindings = list(param_binding);
                                }
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject index_bindings = term_unify(unbound_index, bound_index, UNPROVIDED, UNPROVIDED);
                                final SubLObject index_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL != index_bindings) && (NIL == bindings.some_variable_with_conflicting_bindings(index_bindings, list(param_binding)))) {
                                    v_bindings = cons(param_binding, index_bindings);
                                    justification = index_justification;
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list31);
                    }
                }

        } else
            if (pcase_var.eql($$MtTimeDimFn)) {
                final SubLObject pcase_var_$27 = list_utilities.dotted_length(unbound_mt);
                if ((pcase_var_$27.eql(ONE_INTEGER) && (NIL != variables.variable_p(unbound_mt.rest()))) && $$Null_TimeParameter.eql(bound_param)) {
                    v_bindings = list(bindings.make_variable_binding(unbound_mt.rest(), list(bound_index)));
                }
            }

        return values(v_bindings, justification);
    }

    public static final SubLObject genl_mt_unify_temporal_dimension_undotted_list_alt(SubLObject unbound_mt, SubLObject bound_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = NIL;
                SubLObject justification = NIL;
                SubLObject bound_index = NIL;
                SubLObject bound_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject bound_index_26 = hlmt.mt_time_dim_nat_temporal_values(bound_mt);
                    SubLObject bound_param_27 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    bound_index = bound_index_26;
                    bound_param = bound_param_27;
                }
                {
                    SubLObject pcase_var = unbound_mt.first();
                    if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
                        {
                            SubLObject pcase_var_28 = length(unbound_mt.rest());
                            if (pcase_var_28.eql(TWO_INTEGER)) {
                                {
                                    SubLObject datum = unbound_mt.rest();
                                    SubLObject current = datum;
                                    SubLObject unbound_index = NIL;
                                    SubLObject unbound_param = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt27);
                                    unbound_index = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt27);
                                    unbound_param = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject index_bindings = NIL;
                                            SubLObject index_justification = NIL;
                                            SubLObject param_bindings = NIL;
                                            SubLObject param_justification = NIL;
                                            if (NIL != variables.fully_bound_p(unbound_index)) {
                                                if ((NIL != hlmt_relevance.subsumed_time_intervalP(unbound_index, bound_index)) && (NIL != hlmt_relevance.time_interval_subsumes_typeP(unbound_index, bound_param))) {
                                                    index_bindings = bindings.unification_success_token();
                                                    index_justification = append(com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_temporally_subsumes(bound_index, unbound_index), com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_temporally_subsumes_ins_type(unbound_index, bound_param));
                                                }
                                            } else {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject index_bindings_29 = com.cyc.cycjava.cycl.unification_utilities.term_unify(unbound_index, bound_index, UNPROVIDED, UNPROVIDED);
                                                    SubLObject index_justification_30 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    index_bindings = index_bindings_29;
                                                    index_justification = index_justification_30;
                                                }
                                            }
                                            if (NIL != variables.fully_bound_p(unbound_param)) {
                                                if (NIL != hlmt_relevance.bigger_time_typeP(unbound_param, bound_param)) {
                                                    param_bindings = bindings.unification_success_token();
                                                    param_justification = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_temporally_subsumes_type_type(unbound_param, bound_param);
                                                }
                                            } else {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject param_bindings_31 = com.cyc.cycjava.cycl.unification_utilities.term_unify(unbound_param, bound_param, UNPROVIDED, UNPROVIDED);
                                                    SubLObject param_justification_32 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    param_bindings = param_bindings_31;
                                                    param_justification = param_justification_32;
                                                }
                                            }
                                            if ((NIL != index_bindings) && (NIL != param_bindings)) {
                                                if (NIL == bindings.some_variable_with_conflicting_bindings(index_bindings, param_bindings)) {
                                                    v_bindings = append(index_bindings, param_bindings);
                                                    justification = append(index_justification, param_justification);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt27);
                                    }
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($$MtTimeDimFn)) {
                            {
                                SubLObject pcase_var_33 = length(unbound_mt.rest());
                                if (pcase_var_33.eql(ONE_INTEGER)) {
                                    {
                                        SubLObject datum = unbound_mt.rest();
                                        SubLObject current = datum;
                                        SubLObject unbound_index = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt30);
                                        unbound_index = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if ($$Null_TimeParameter == bound_param) {
                                                if (NIL != variables.fully_bound_p(unbound_index)) {
                                                    if (NIL != hlmt_relevance.subsumed_time_intervalP(unbound_index, bound_index)) {
                                                        v_bindings = bindings.unification_success_token();
                                                        justification = com.cyc.cycjava.cycl.unification_utilities.genl_mt_unify_possibly_justify_temporally_subsumes(bound_index, unbound_index);
                                                    }
                                                } else {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings_34 = com.cyc.cycjava.cycl.unification_utilities.term_unify(unbound_index, bound_index, UNPROVIDED, UNPROVIDED);
                                                        SubLObject justification_35 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        v_bindings = v_bindings_34;
                                                        justification = justification_35;
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt30);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(v_bindings, justification);
            }
        }
    }

    public static SubLObject genl_mt_unify_temporal_dimension_undotted_list(final SubLObject unbound_mt, final SubLObject bound_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        SubLObject bound_index = NIL;
        SubLObject bound_param = NIL;
        thread.resetMultipleValues();
        final SubLObject bound_index_$28 = hlmt.mt_time_dim_nat_temporal_values(bound_mt);
        final SubLObject bound_param_$29 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        bound_index = bound_index_$28;
        bound_param = bound_param_$29;
        final SubLObject pcase_var = unbound_mt.first();
        if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
            final SubLObject pcase_var_$30 = length(unbound_mt.rest());
            if (pcase_var_$30.eql(TWO_INTEGER)) {
                SubLObject current;
                final SubLObject datum = current = unbound_mt.rest();
                SubLObject unbound_index = NIL;
                SubLObject unbound_param = NIL;
                destructuring_bind_must_consp(current, datum, $list31);
                unbound_index = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list31);
                unbound_param = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject index_bindings = NIL;
                    SubLObject index_justification = NIL;
                    SubLObject param_bindings = NIL;
                    SubLObject param_justification = NIL;
                    if (NIL != variables.fully_bound_p(unbound_index)) {
                        if ((NIL != hlmt_relevance.subsumed_time_intervalP(unbound_index, bound_index)) && (NIL != hlmt_relevance.time_interval_subsumes_typeP(unbound_index, bound_param))) {
                            index_bindings = bindings.unification_success_token();
                            index_justification = append(genl_mt_unify_possibly_justify_temporally_subsumes(bound_index, unbound_index), genl_mt_unify_possibly_justify_temporally_subsumes_ins_type(unbound_index, bound_param));
                        }
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject index_bindings_$31 = term_unify(unbound_index, bound_index, UNPROVIDED, UNPROVIDED);
                        final SubLObject index_justification_$32 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        index_bindings = index_bindings_$31;
                        index_justification = index_justification_$32;
                    }
                    if (NIL != variables.fully_bound_p(unbound_param)) {
                        if (NIL != hlmt_relevance.bigger_time_typeP(unbound_param, bound_param)) {
                            param_bindings = bindings.unification_success_token();
                            param_justification = genl_mt_unify_possibly_justify_temporally_subsumes_type_type(unbound_param, bound_param);
                        }
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject param_bindings_$33 = term_unify(unbound_param, bound_param, UNPROVIDED, UNPROVIDED);
                        final SubLObject param_justification_$34 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        param_bindings = param_bindings_$33;
                        param_justification = param_justification_$34;
                    }
                    if (((NIL != index_bindings) && (NIL != param_bindings)) && (NIL == bindings.some_variable_with_conflicting_bindings(index_bindings, param_bindings))) {
                        v_bindings = append(index_bindings, param_bindings);
                        justification = append(index_justification, param_justification);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list31);
                }
            }
        } else
            if (pcase_var.eql($$MtTimeDimFn)) {
                final SubLObject pcase_var_$31 = length(unbound_mt.rest());
                if (pcase_var_$31.eql(ONE_INTEGER)) {
                    SubLObject current;
                    final SubLObject datum = current = unbound_mt.rest();
                    SubLObject unbound_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list34);
                    unbound_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ($$Null_TimeParameter.eql(bound_param)) {
                            if (NIL != variables.fully_bound_p(unbound_index)) {
                                if (NIL != hlmt_relevance.subsumed_time_intervalP(unbound_index, bound_index)) {
                                    v_bindings = bindings.unification_success_token();
                                    justification = genl_mt_unify_possibly_justify_temporally_subsumes(bound_index, unbound_index);
                                }
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$36 = term_unify(unbound_index, bound_index, UNPROVIDED, UNPROVIDED);
                                final SubLObject justification_$37 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$36;
                                justification = justification_$37;
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list34);
                    }
                }
            }

        return values(v_bindings, justification);
    }

    public static final SubLObject genl_mt_unify_possibly_justify_genl_mt_alt(SubLObject spec_mt, SubLObject genl_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? ((SubLObject) (list(arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, spec_mt, genl_mt), UNPROVIDED, UNPROVIDED)))) : NIL;
        }
    }

    public static SubLObject genl_mt_unify_possibly_justify_genl_mt(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? list(arguments.make_hl_support($GENLMT, make_binary_formula($$genlMt, spec_mt, genl_mt), UNPROVIDED, UNPROVIDED)) : NIL;
    }

    public static final SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_alt(SubLObject big_index, SubLObject small_index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? ((SubLObject) (list(arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes, big_index, small_index), UNPROVIDED, UNPROVIDED)))) : NIL;
        }
    }

    public static SubLObject genl_mt_unify_possibly_justify_temporally_subsumes(final SubLObject big_index, final SubLObject small_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? list(arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes, big_index, small_index), UNPROVIDED, UNPROVIDED)) : NIL;
    }

    public static final SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_ins_type_alt(SubLObject interval, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? ((SubLObject) (list(arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_InsType, interval, type), UNPROVIDED, UNPROVIDED)))) : NIL;
        }
    }

    public static SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_ins_type(final SubLObject interval, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? list(arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_InsType, interval, type), UNPROVIDED, UNPROVIDED)) : NIL;
    }

    public static final SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_type_type_alt(SubLObject long_type, SubLObject short_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? ((SubLObject) (list(arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_TypeType, long_type, short_type), UNPROVIDED, UNPROVIDED)))) : NIL;
        }
    }

    public static SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_type_type(final SubLObject long_type, final SubLObject short_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != unification.$unify_return_justificationP$.getDynamicValue(thread) ? list(arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_TypeType, long_type, short_type), UNPROVIDED, UNPROVIDED)) : NIL;
    }

    public static SubLObject declare_unification_utilities_file() {
        declareFunction("term_unify", "TERM-UNIFY", 2, 2, false);
        declareFunction("asent_unify", "ASENT-UNIFY", 2, 2, false);
        declareFunction("gaf_asent_unify", "GAF-ASENT-UNIFY", 2, 2, false);
        declareFunction("gaf_asent_args_unify", "GAF-ASENT-ARGS-UNIFY", 2, 2, false);
        declareFunction("gaf_asent_inverse_args_unify", "GAF-ASENT-INVERSE-ARGS-UNIFY", 2, 2, false);
        declareFunction("transformation_asent_unify", "TRANSFORMATION-ASENT-UNIFY", 2, 0, false);
        declareFunction("rewrite_asent_unify", "REWRITE-ASENT-UNIFY", 2, 0, false);
        declareFunction("unify_clauses", "UNIFY-CLAUSES", 2, 2, false);
        declareFunction("clean_up_unify_result", "CLEAN-UP-UNIFY-RESULT", 1, 0, false);
        declareFunction("unify_clause", "UNIFY-CLAUSE", 2, 2, false);
        new unification_utilities.$unify_clause$BinaryFunction();
        declareFunction("unify_clause_literal", "UNIFY-CLAUSE-LITERAL", 4, 0, false);
        declareFunction("compute_variable_map", "COMPUTE-VARIABLE-MAP", 2, 0, false);
        declareFunction("variable_base_inversion_binding", "VARIABLE-BASE-INVERSION-BINDING", 1, 0, false);
        declareFunction("unify_set", "UNIFY-SET", 2, 2, false);
        declareFunction("unify_sets", "UNIFY-SETS", 2, 2, false);
        declareFunction("unify_sets_of_sets", "UNIFY-SETS-OF-SETS", 2, 2, false);
        declareFunction("unify_set_recursive", "UNIFY-SET-RECURSIVE", 5, 0, false);
        declareFunction("unify_element", "UNIFY-ELEMENT", 4, 0, false);
        declareFunction("parent_to_unify_bindings", "PARENT-TO-UNIFY-BINDINGS", 2, 0, false);
        declareFunction("unify_to_child_bindings", "UNIFY-TO-CHILD-BINDINGS", 1, 0, false);
        declareFunction("unify_source_bindings", "UNIFY-SOURCE-BINDINGS", 2, 0, false);
        declareFunction("parent_to_child_bindings", "PARENT-TO-CHILD-BINDINGS", 2, 0, false);
        declareFunction("clear_query_dnf_from_formula", "CLEAR-QUERY-DNF-FROM-FORMULA", 0, 0, false);
        declareFunction("remove_query_dnf_from_formula", "REMOVE-QUERY-DNF-FROM-FORMULA", 1, 0, false);
        declareFunction("query_dnf_from_formula_internal", "QUERY-DNF-FROM-FORMULA-INTERNAL", 1, 0, false);
        declareFunction("query_dnf_from_formula", "QUERY-DNF-FROM-FORMULA", 1, 0, false);
        declareFunction("remove_duplicate_formulas", "REMOVE-DUPLICATE-FORMULAS", 1, 1, false);
        declareFunction("remove_duplicate_or_invalid_formulas", "REMOVE-DUPLICATE-OR-INVALID-FORMULAS", 1, 0, false);
        declareFunction("unify_el", "UNIFY-EL", 2, 1, false);
        declareFunction("unify_el_cnfs", "UNIFY-EL-CNFS", 2, 1, false);
        declareFunction("unify_el_terms", "UNIFY-EL-TERMS", 2, 1, false);
        declareFunction("unify_open_el_terms", "UNIFY-OPEN-EL-TERMS", 2, 1, false);
        declareFunction("unify_el_terms_int", "UNIFY-EL-TERMS-INT", 4, 0, false);
        declareFunction("unify_one_way", "UNIFY-ONE-WAY", 2, 0, false);
        declareFunction("genl_mt_unify", "GENL-MT-UNIFY", 2, 1, false);
        declareFunction("genl_mt_unify_int", "GENL-MT-UNIFY-INT", 2, 0, false);
        declareFunction("clear_monad_genl_mt_cachedP", "CLEAR-MONAD-GENL-MT-CACHED?", 0, 0, false);
        new unification_utilities.$clear_monad_genl_mt_cachedP$ZeroArityFunction();
        declareFunction("remove_monad_genl_mt_cachedP", "REMOVE-MONAD-GENL-MT-CACHED?", 2, 0, false);
        declareFunction("monad_genl_mt_cachedP_internal", "MONAD-GENL-MT-CACHED?-INTERNAL", 2, 0, false);
        declareFunction("monad_genl_mt_cachedP", "MONAD-GENL-MT-CACHED?", 2, 0, false);
        declareFunction("genl_mt_unify_temporal_dimension_fully_bound", "GENL-MT-UNIFY-TEMPORAL-DIMENSION-FULLY-BOUND", 2, 0, false);
        declareFunction("genl_mt_unify_temporal_dimension_dotted_list", "GENL-MT-UNIFY-TEMPORAL-DIMENSION-DOTTED-LIST", 2, 0, false);
        declareFunction("genl_mt_unify_temporal_dimension_undotted_list", "GENL-MT-UNIFY-TEMPORAL-DIMENSION-UNDOTTED-LIST", 2, 0, false);
        declareFunction("genl_mt_unify_possibly_justify_genl_mt", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-GENL-MT", 2, 0, false);
        declareFunction("genl_mt_unify_possibly_justify_temporally_subsumes", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES", 2, 0, false);
        declareFunction("genl_mt_unify_possibly_justify_temporally_subsumes_ins_type", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES-INS-TYPE", 2, 0, false);
        declareFunction("genl_mt_unify_possibly_justify_temporally_subsumes_type_type", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES-TYPE-TYPE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_unification_utilities_file() {
        deflexical("*QUERY-DNF-FROM-FORMULA-CACHING-STATE*", NIL);
        deflexical("*MONAD-GENL-MT-CACHED?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_unification_utilities_file_alt() {
        memoization_state.note_globally_cached_function(QUERY_DNF_FROM_FORMULA);
        memoization_state.note_globally_cached_function($sym22$MONAD_GENL_MT_CACHED_);
        return NIL;
    }

    public static SubLObject setup_unification_utilities_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(QUERY_DNF_FROM_FORMULA);
            memoization_state.note_globally_cached_function($sym26$MONAD_GENL_MT_CACHED_);
            define_test_case_table_int(TERM_UNIFY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list48);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym22$MONAD_GENL_MT_CACHED_);
        }
        return NIL;
    }

    public static SubLObject setup_unification_utilities_file_Previous() {
        memoization_state.note_globally_cached_function(QUERY_DNF_FROM_FORMULA);
        memoization_state.note_globally_cached_function($sym26$MONAD_GENL_MT_CACHED_);
        define_test_case_table_int(TERM_UNIFY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list48);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_unification_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_unification_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unification_utilities_file();
    }

    

    public static final class $unify_clause$BinaryFunction extends BinaryFunction {
        public $unify_clause$BinaryFunction() {
            super(extractFunctionNamed("UNIFY-CLAUSE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return unify_clause(arg1, arg2, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final class $clear_monad_genl_mt_cachedP$ZeroArityFunction extends ZeroArityFunction {
        public $clear_monad_genl_mt_cachedP$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-MONAD-GENL-MT-CACHED?"));
        }

        @Override
        public SubLObject processItem() {
            return clear_monad_genl_mt_cachedP();
        }
    }

    static private final SubLList $list_alt7 = cons(makeSymbol("VAR1"), makeSymbol("VAR2"));

    static private final SubLList $list_alt15 = cons(makeSymbol("PARENT-VAR"), makeSymbol("UNIFY-BINDING"));

    public static final SubLSymbol $kw18$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym22$MONAD_GENL_MT_CACHED_ = makeSymbol("MONAD-GENL-MT-CACHED?");

    static private final SubLSymbol $sym23$_MONAD_GENL_MT_CACHED__CACHING_STATE_ = makeSymbol("*MONAD-GENL-MT-CACHED?-CACHING-STATE*");

    static private final SubLSymbol $sym25$CLEAR_MONAD_GENL_MT_CACHED_ = makeSymbol("CLEAR-MONAD-GENL-MT-CACHED?");

    static private final SubLList $list_alt27 = list(makeSymbol("UNBOUND-INDEX"), makeSymbol("UNBOUND-PARAM"));

    static private final SubLList $list_alt30 = list(makeSymbol("UNBOUND-INDEX"));
}

/**
 * Total time: 336 ms
 */
