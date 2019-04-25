package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_relevance_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_relevance_utilities";
    public static final String myFingerPrint = "b4f35e9a2c608501017b68b789c9ad4d95348a4f0937aa7f065917fd2aca1f2c";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1697L)
    private static SubLSymbol $cached_rkf_irrelevant_precision_suggestion_fort_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2704L)
    private static SubLSymbol $cached_rkf_irrelevant_arg_constraint_fort_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 4100L)
    private static SubLSymbol $rkf_irrelevant_term_lambda_domain_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7194L)
    private static SubLSymbol $cached_rkf_irrelevant_fort_caching_state$;
    private static final SubLSymbol $sym0$CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT;
    private static final SubLSymbol $sym1$_CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT_CACHING_STATE_;
    private static final SubLObject $const2$keIrrelevantPrecisionSuggestion;
    private static final SubLSymbol $sym3$CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT;
    private static final SubLSymbol $sym4$_CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT_CACHING_STATE_;
    private static final SubLObject $const5$keIrrelevantArgConstraint;
    private static final SubLSymbol $kw6$IRRELEVANT_EVERYWHERE;
    private static final SubLSymbol $kw7$IRRELEVANT_NOWHERE;
    private static final SubLSymbol $kw8$IRRELEVANT_SOMEWHERE;
    private static final SubLObject $const9$InferencePSC;
    private static final SubLSymbol $sym10$RKF_IRRELEVANT_TERM_LAMBDA_;
    private static final SubLList $list11;
    private static final SubLObject $const12$BaseKB;
    private static final SubLSymbol $sym13$CACHED_RKF_IRRELEVANT_FORT;
    private static final SubLSymbol $sym14$_CACHED_RKF_IRRELEVANT_FORT_CACHING_STATE_;
    private static final SubLSymbol $sym15$CLEAR_CACHED_RKF_IRRELEVANT_FORT;
    private static final SubLObject $const16$keIrrelevantTerm;
    private static final SubLSymbol $kw17$INFERENCE_MODE;
    private static final SubLSymbol $kw18$MINIMAL;
    private static final SubLSymbol $kw19$ALLOWED_MODULES;
    private static final SubLSymbol $kw20$NOT;
    private static final SubLSymbol $kw21$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS;
    private static final SubLSymbol $kw22$PROBLEM_STORE;
    private static final SubLObject $const23$termOfUnit;
    private static final SubLObject $const24$sourceOfTerm;
    private static final SubLObject $const25$quotedIsa;
    private static final SubLSymbol $kw26$IGNORE;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 944L)
    public static SubLObject rkf_irrelevant_precision_suggestion(final SubLObject to_term, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL != forts.fort_p(to_term) && (rkf_relevance_utilities.NIL != forts.invalid_fortP(to_term) || rkf_relevance_utilities.NIL != cached_rkf_irrelevant_precision_suggestion_fort(to_term, domain_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1224L)
    public static SubLObject rkf_irrelevant_precision_suggestion_from(final SubLObject to_term, final SubLObject from_term, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL != forts.fort_p(to_term) && rkf_relevance_utilities.NIL != forts.fort_p(from_term) && (rkf_relevance_utilities.NIL != forts.invalid_fortP(to_term) || rkf_relevance_utilities.NIL != forts.invalid_fortP(from_term) || rkf_relevance_utilities.NIL != cached_rkf_irrelevant_precision_suggestion_fort(to_term, domain_mt) || rkf_relevance_utilities.NIL != rkf_irrelevant_precision_suggestion_fort_pairP(to_term, from_term, domain_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1697L)
    public static SubLObject clear_cached_rkf_irrelevant_precision_suggestion_fort() {
        final SubLObject cs = rkf_relevance_utilities.$cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue();
        if (rkf_relevance_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1697L)
    public static SubLObject remove_cached_rkf_irrelevant_precision_suggestion_fort(final SubLObject fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_relevance_utilities.$cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fort, domain_mt), (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1697L)
    public static SubLObject cached_rkf_irrelevant_precision_suggestion_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return rkf_irrelevant_precision_suggestion_fort_internal(fort, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1697L)
    public static SubLObject cached_rkf_irrelevant_precision_suggestion_fort(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject caching_state = rkf_relevance_utilities.$cached_rkf_irrelevant_precision_suggestion_fort_caching_state$.getGlobalValue();
        if (rkf_relevance_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_relevance_utilities.$sym0$CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT, (SubLObject)rkf_relevance_utilities.$sym1$_CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT_CACHING_STATE_, (SubLObject)rkf_relevance_utilities.NIL, (SubLObject)rkf_relevance_utilities.EQL, (SubLObject)rkf_relevance_utilities.TWO_INTEGER, (SubLObject)rkf_relevance_utilities.TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_relevance_utilities.NIL;
            collision = cdolist_list_var.first();
            while (rkf_relevance_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_relevance_utilities.NIL != cached_args && rkf_relevance_utilities.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_rkf_irrelevant_precision_suggestion_fort_internal(fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fort, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 1871L)
    public static SubLObject rkf_irrelevant_precision_suggestion_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.list(rkf_relevance_utilities.$const2$keIrrelevantPrecisionSuggestion, fort), domain_mt, (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2042L)
    public static SubLObject rkf_irrelevant_precision_suggestion_fort_pairP(final SubLObject to_fort, final SubLObject from_fort, final SubLObject domain_mt) {
        return subl_promotions.memberP(to_fort, rkf_precision_suggestor.rkf_irrelevant_precision_suggestion_forts_from_fort(from_fort, domain_mt), (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2240L)
    public static SubLObject rkf_irrelevant_arg_constraint(final SubLObject v_term, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL != forts.fort_p(v_term) && (rkf_relevance_utilities.NIL != forts.invalid_fortP(v_term) || rkf_relevance_utilities.NIL != cached_rkf_irrelevant_arg_constraint_fort(v_term, domain_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2704L)
    public static SubLObject clear_cached_rkf_irrelevant_arg_constraint_fort() {
        final SubLObject cs = rkf_relevance_utilities.$cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue();
        if (rkf_relevance_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2704L)
    public static SubLObject remove_cached_rkf_irrelevant_arg_constraint_fort(final SubLObject fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_relevance_utilities.$cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fort, domain_mt), (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2704L)
    public static SubLObject cached_rkf_irrelevant_arg_constraint_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return rkf_irrelevant_arg_constraint_fort_internal(fort, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2704L)
    public static SubLObject cached_rkf_irrelevant_arg_constraint_fort(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject caching_state = rkf_relevance_utilities.$cached_rkf_irrelevant_arg_constraint_fort_caching_state$.getGlobalValue();
        if (rkf_relevance_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_relevance_utilities.$sym3$CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT, (SubLObject)rkf_relevance_utilities.$sym4$_CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT_CACHING_STATE_, (SubLObject)rkf_relevance_utilities.NIL, (SubLObject)rkf_relevance_utilities.EQL, (SubLObject)rkf_relevance_utilities.TWO_INTEGER, (SubLObject)rkf_relevance_utilities.TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_relevance_utilities.NIL;
            collision = cdolist_list_var.first();
            while (rkf_relevance_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_relevance_utilities.NIL != cached_args && rkf_relevance_utilities.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_rkf_irrelevant_arg_constraint_fort_internal(fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fort, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 2866L)
    public static SubLObject rkf_irrelevant_arg_constraint_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.list(rkf_relevance_utilities.$const5$keIrrelevantArgConstraint, fort), domain_mt, (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 3025L)
    public static SubLObject rkf_irrelevant_term(final SubLObject v_term, final SubLObject domain_mt) {
        if (rkf_relevance_utilities.NIL == forts.fort_p(v_term)) {
            return (SubLObject)rkf_relevance_utilities.NIL;
        }
        if (rkf_relevance_utilities.NIL != forts.invalid_fortP(v_term)) {
            return (SubLObject)rkf_relevance_utilities.T;
        }
        final SubLObject pcase_var;
        final SubLObject cached_result = pcase_var = rkf_irrelevant_fort_cache.rkf_irrelevant_cache_lookup(v_term);
        if (pcase_var.eql((SubLObject)rkf_relevance_utilities.$kw6$IRRELEVANT_EVERYWHERE)) {
            return (SubLObject)rkf_relevance_utilities.T;
        }
        if (pcase_var.eql((SubLObject)rkf_relevance_utilities.$kw7$IRRELEVANT_NOWHERE)) {
            return (SubLObject)rkf_relevance_utilities.NIL;
        }
        if (cached_result == rkf_relevance_utilities.$kw8$IRRELEVANT_SOMEWHERE && domain_mt.eql(rkf_relevance_utilities.$const9$InferencePSC)) {
            return (SubLObject)rkf_relevance_utilities.T;
        }
        return cached_rkf_irrelevant_fort(v_term, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 3822L)
    public static SubLObject rkf_filter_irrelevant_terms(final SubLObject terms, final SubLObject domain_mt) {
        SubLObject v_answer = (SubLObject)rkf_relevance_utilities.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)rkf_relevance_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_relevance_utilities.NIL != cdolist_list_var) {
            if (rkf_relevance_utilities.NIL == rkf_irrelevant_term(v_term, domain_mt)) {
                v_answer = (SubLObject)ConsesLow.cons(v_term, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 4181L)
    public static SubLObject rkf_irrelevant_term_lambdaP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_irrelevant_term(v_term, rkf_relevance_utilities.$rkf_irrelevant_term_lambda_domain_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 4308L)
    public static SubLObject rkf_irrelevant_formula(final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_relevance_utilities.NIL;
        final SubLObject _prev_bind_0 = rkf_relevance_utilities.$rkf_irrelevant_term_lambda_domain_mt$.currentBinding(thread);
        try {
            rkf_relevance_utilities.$rkf_irrelevant_term_lambda_domain_mt$.bind(domain_mt, thread);
            result = cycl_utilities.expression_find_if((SubLObject)rkf_relevance_utilities.$sym10$RKF_IRRELEVANT_TERM_LAMBDA_, formula, (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
        }
        finally {
            rkf_relevance_utilities.$rkf_irrelevant_term_lambda_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 4671L)
    public static SubLObject rkf_filter_irrelevant_formulas(final SubLObject formulas, final SubLObject domain_mt) {
        SubLObject v_answer = (SubLObject)rkf_relevance_utilities.NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = (SubLObject)rkf_relevance_utilities.NIL;
        formula = cdolist_list_var.first();
        while (rkf_relevance_utilities.NIL != cdolist_list_var) {
            if (rkf_relevance_utilities.NIL == rkf_irrelevant_formula(formula, domain_mt)) {
                v_answer = (SubLObject)ConsesLow.cons(formula, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 4973L)
    public static SubLObject rkf_remove_irrelevant_clauses(final SubLObject formula, final SubLObject mt) {
        final SubLObject dnfs = clausifier.dnf_clausal_form(formula, mt);
        SubLObject filtered_dnfs = (SubLObject)rkf_relevance_utilities.NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = (SubLObject)rkf_relevance_utilities.NIL;
        dnf = cdolist_list_var.first();
        while (rkf_relevance_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dnf;
            SubLObject neg_lits = (SubLObject)rkf_relevance_utilities.NIL;
            SubLObject pos_lits = (SubLObject)rkf_relevance_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_relevance_utilities.$list11);
            neg_lits = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_relevance_utilities.$list11);
            pos_lits = current.first();
            current = current.rest();
            if (rkf_relevance_utilities.NIL == current) {
                final SubLObject filtered_neg_lits = rkf_filter_irrelevant_formulas(neg_lits, mt);
                final SubLObject filtered_pos_lits = rkf_filter_irrelevant_formulas(pos_lits, mt);
                if (rkf_relevance_utilities.NIL != filtered_neg_lits || rkf_relevance_utilities.NIL != filtered_pos_lits) {
                    filtered_dnfs = (SubLObject)ConsesLow.cons(clauses.make_clause(filtered_neg_lits, filtered_pos_lits), filtered_dnfs);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_relevance_utilities.$list11);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        }
        return (rkf_relevance_utilities.NIL != filtered_dnfs) ? clauses.dnf_formula_from_clauses(filtered_dnfs) : formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 5814L)
    public static SubLObject rkf_irrelevant_term_formula(final SubLObject fort, final SubLObject formula, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL != rkf_irrelevant_formula(formula, domain_mt) || rkf_relevance_utilities.NIL != rkf_quoted_term_formula(fort, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 6052L)
    public static SubLObject compute_fort_irrelevant_everywhere_status(final SubLObject fort, SubLObject problem_store) {
        if (problem_store == rkf_relevance_utilities.UNPROVIDED) {
            problem_store = (SubLObject)rkf_relevance_utilities.NIL;
        }
        if (rkf_relevance_utilities.NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL != fort_has_pro_irrelevant_argumentP(fort, rkf_relevance_utilities.$const12$BaseKB, problem_store) && rkf_relevance_utilities.NIL == fort_has_con_irrelevant_argumentP(fort, rkf_relevance_utilities.$const9$InferencePSC, problem_store));
        }
        SubLObject ans = (SubLObject)rkf_relevance_utilities.NIL;
        SubLObject store = (SubLObject)rkf_relevance_utilities.NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store((SubLObject)rkf_relevance_utilities.NIL);
            ans = compute_fort_irrelevant_everywhere_status(fort, store);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)rkf_relevance_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 6631L)
    public static SubLObject compute_fort_irrelevant_nowhere_status(final SubLObject fort, SubLObject problem_store) {
        if (problem_store == rkf_relevance_utilities.UNPROVIDED) {
            problem_store = (SubLObject)rkf_relevance_utilities.NIL;
        }
        if (rkf_relevance_utilities.NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL == fort_has_pro_irrelevant_argumentP(fort, rkf_relevance_utilities.$const9$InferencePSC, problem_store));
        }
        SubLObject ans = (SubLObject)rkf_relevance_utilities.NIL;
        SubLObject store = (SubLObject)rkf_relevance_utilities.NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store((SubLObject)rkf_relevance_utilities.NIL);
            ans = compute_fort_irrelevant_nowhere_status(fort, store);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)rkf_relevance_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7194L)
    public static SubLObject clear_cached_rkf_irrelevant_fort() {
        final SubLObject cs = rkf_relevance_utilities.$cached_rkf_irrelevant_fort_caching_state$.getGlobalValue();
        if (rkf_relevance_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7194L)
    public static SubLObject remove_cached_rkf_irrelevant_fort(final SubLObject fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_relevance_utilities.$cached_rkf_irrelevant_fort_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(fort, domain_mt), (SubLObject)rkf_relevance_utilities.UNPROVIDED, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7194L)
    public static SubLObject cached_rkf_irrelevant_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_relevance_utilities.NIL != term.fast_reified_skolemP(fort) || rkf_relevance_utilities.NIL != rkf_irrelevant_fort_internal(fort, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7194L)
    public static SubLObject cached_rkf_irrelevant_fort(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject caching_state = rkf_relevance_utilities.$cached_rkf_irrelevant_fort_caching_state$.getGlobalValue();
        if (rkf_relevance_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_relevance_utilities.$sym13$CACHED_RKF_IRRELEVANT_FORT, (SubLObject)rkf_relevance_utilities.$sym14$_CACHED_RKF_IRRELEVANT_FORT_CACHING_STATE_, (SubLObject)rkf_relevance_utilities.NIL, (SubLObject)rkf_relevance_utilities.EQL, (SubLObject)rkf_relevance_utilities.TWO_INTEGER, (SubLObject)rkf_relevance_utilities.TEN_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)rkf_relevance_utilities.$sym15$CLEAR_CACHED_RKF_IRRELEVANT_FORT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rkf_relevance_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rkf_relevance_utilities.NIL;
            collision = cdolist_list_var.first();
            while (rkf_relevance_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rkf_relevance_utilities.NIL != cached_args && rkf_relevance_utilities.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_rkf_irrelevant_fort_internal(fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fort, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7396L)
    public static SubLObject rkf_irrelevant_fort_internal(final SubLObject fort, final SubLObject domain_mt) {
        SubLObject ans = (SubLObject)rkf_relevance_utilities.NIL;
        SubLObject store = (SubLObject)rkf_relevance_utilities.NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store((SubLObject)rkf_relevance_utilities.NIL);
            ans = (SubLObject)SubLObjectFactory.makeBoolean((rkf_relevance_utilities.NIL != fort_has_pro_irrelevant_argumentP(fort, domain_mt, store) && rkf_relevance_utilities.NIL == fort_has_con_irrelevant_argumentP(fort, domain_mt, store)) || (rkf_relevance_utilities.NIL != nart_handles.nart_p(fort) && rkf_relevance_utilities.NIL != rkf_irrelevant_formula(function_terms.nart_to_naut(fort), domain_mt)));
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)rkf_relevance_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7819L)
    public static SubLObject irrelevance_sentence_for_fort(final SubLObject fort) {
        return (SubLObject)ConsesLow.list(rkf_relevance_utilities.$const16$keIrrelevantTerm, fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 7910L)
    public static SubLObject irrelevance_query_properties(final SubLObject problem_store) {
        return (SubLObject)ConsesLow.list((SubLObject)rkf_relevance_utilities.$kw17$INFERENCE_MODE, (SubLObject)rkf_relevance_utilities.$kw18$MINIMAL, (SubLObject)rkf_relevance_utilities.$kw19$ALLOWED_MODULES, (SubLObject)ConsesLow.list((SubLObject)rkf_relevance_utilities.$kw20$NOT, (SubLObject)rkf_relevance_utilities.$kw21$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS), (SubLObject)rkf_relevance_utilities.$kw22$PROBLEM_STORE, problem_store);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 8122L)
    public static SubLObject fort_has_pro_irrelevant_argumentP(final SubLObject fort, final SubLObject domain_mt, final SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(irrelevance_sentence_for_fort(fort), domain_mt, irrelevance_query_properties(problem_store)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 8359L)
    public static SubLObject fort_has_con_irrelevant_argumentP(final SubLObject fort, final SubLObject domain_mt, final SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(cycl_utilities.negate(irrelevance_sentence_for_fort(fort)), domain_mt, irrelevance_query_properties(problem_store)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relevance-utilities.lisp", position = 8605L)
    public static SubLObject rkf_quoted_term_formula(final SubLObject fort, final SubLObject formula) {
        final SubLObject pcase_var;
        final SubLObject predicate = pcase_var = cycl_utilities.formula_operator(formula);
        if (pcase_var.eql(rkf_relevance_utilities.$const23$termOfUnit)) {
            return (SubLObject)rkf_relevance_utilities.T;
        }
        if (pcase_var.eql(rkf_relevance_utilities.$const24$sourceOfTerm)) {
            return (SubLObject)rkf_relevance_utilities.NIL;
        }
        if (pcase_var.eql(rkf_relevance_utilities.$const25$quotedIsa)) {
            return (SubLObject)rkf_relevance_utilities.T;
        }
        if (rkf_relevance_utilities.NIL != kb_accessors.some_quoted_argumentP(predicate)) {
            SubLObject index = (SubLObject)rkf_relevance_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)rkf_relevance_utilities.$kw26$IGNORE);
            SubLObject arg = (SubLObject)rkf_relevance_utilities.NIL;
            arg = cdolist_list_var.first();
            while (rkf_relevance_utilities.NIL != cdolist_list_var) {
                index = Numbers.add(index, (SubLObject)rkf_relevance_utilities.ONE_INTEGER);
                if (fort.eql(arg) && rkf_relevance_utilities.NIL != kb_accessors.quoted_argumentP(predicate, index)) {
                    return (SubLObject)rkf_relevance_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    public static SubLObject declare_rkf_relevance_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_precision_suggestion", "RKF-IRRELEVANT-PRECISION-SUGGESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_precision_suggestion_from", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FROM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "clear_cached_rkf_irrelevant_precision_suggestion_fort", "CLEAR-CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "remove_cached_rkf_irrelevant_precision_suggestion_fort", "REMOVE-CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "cached_rkf_irrelevant_precision_suggestion_fort_internal", "CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "cached_rkf_irrelevant_precision_suggestion_fort", "CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_precision_suggestion_fort_internal", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_precision_suggestion_fort_pairP", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-PAIR?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_arg_constraint", "RKF-IRRELEVANT-ARG-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "clear_cached_rkf_irrelevant_arg_constraint_fort", "CLEAR-CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "remove_cached_rkf_irrelevant_arg_constraint_fort", "REMOVE-CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "cached_rkf_irrelevant_arg_constraint_fort_internal", "CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "cached_rkf_irrelevant_arg_constraint_fort", "CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_arg_constraint_fort_internal", "RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_term", "RKF-IRRELEVANT-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_filter_irrelevant_terms", "RKF-FILTER-IRRELEVANT-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_term_lambdaP", "RKF-IRRELEVANT-TERM-LAMBDA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_formula", "RKF-IRRELEVANT-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_filter_irrelevant_formulas", "RKF-FILTER-IRRELEVANT-FORMULAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_remove_irrelevant_clauses", "RKF-REMOVE-IRRELEVANT-CLAUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_term_formula", "RKF-IRRELEVANT-TERM-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "compute_fort_irrelevant_everywhere_status", "COMPUTE-FORT-IRRELEVANT-EVERYWHERE-STATUS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "compute_fort_irrelevant_nowhere_status", "COMPUTE-FORT-IRRELEVANT-NOWHERE-STATUS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "clear_cached_rkf_irrelevant_fort", "CLEAR-CACHED-RKF-IRRELEVANT-FORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "remove_cached_rkf_irrelevant_fort", "REMOVE-CACHED-RKF-IRRELEVANT-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "cached_rkf_irrelevant_fort_internal", "CACHED-RKF-IRRELEVANT-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "cached_rkf_irrelevant_fort", "CACHED-RKF-IRRELEVANT-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_irrelevant_fort_internal", "RKF-IRRELEVANT-FORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "irrelevance_sentence_for_fort", "IRRELEVANCE-SENTENCE-FOR-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "irrelevance_query_properties", "IRRELEVANCE-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "fort_has_pro_irrelevant_argumentP", "FORT-HAS-PRO-IRRELEVANT-ARGUMENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "fort_has_con_irrelevant_argumentP", "FORT-HAS-CON-IRRELEVANT-ARGUMENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relevance_utilities", "rkf_quoted_term_formula", "RKF-QUOTED-TERM-FORMULA", 2, 0, false);
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    public static SubLObject init_rkf_relevance_utilities_file() {
        rkf_relevance_utilities.$cached_rkf_irrelevant_precision_suggestion_fort_caching_state$ = SubLFiles.deflexical("*CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-CACHING-STATE*", (SubLObject)rkf_relevance_utilities.NIL);
        rkf_relevance_utilities.$cached_rkf_irrelevant_arg_constraint_fort_caching_state$ = SubLFiles.deflexical("*CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-CACHING-STATE*", (SubLObject)rkf_relevance_utilities.NIL);
        rkf_relevance_utilities.$rkf_irrelevant_term_lambda_domain_mt$ = SubLFiles.defparameter("*RKF-IRRELEVANT-TERM-LAMBDA-DOMAIN-MT*", (SubLObject)rkf_relevance_utilities.NIL);
        rkf_relevance_utilities.$cached_rkf_irrelevant_fort_caching_state$ = SubLFiles.deflexical("*CACHED-RKF-IRRELEVANT-FORT-CACHING-STATE*", (SubLObject)rkf_relevance_utilities.NIL);
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    public static SubLObject setup_rkf_relevance_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)rkf_relevance_utilities.$sym0$CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT);
        memoization_state.note_globally_cached_function((SubLObject)rkf_relevance_utilities.$sym3$CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT);
        memoization_state.note_globally_cached_function((SubLObject)rkf_relevance_utilities.$sym13$CACHED_RKF_IRRELEVANT_FORT);
        return (SubLObject)rkf_relevance_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_relevance_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_relevance_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_relevance_utilities_file();
    }
    
    static {
        me = (SubLFile)new rkf_relevance_utilities();
        rkf_relevance_utilities.$cached_rkf_irrelevant_precision_suggestion_fort_caching_state$ = null;
        rkf_relevance_utilities.$cached_rkf_irrelevant_arg_constraint_fort_caching_state$ = null;
        rkf_relevance_utilities.$rkf_irrelevant_term_lambda_domain_mt$ = null;
        rkf_relevance_utilities.$cached_rkf_irrelevant_fort_caching_state$ = null;
        $sym0$CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT = SubLObjectFactory.makeSymbol("CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT");
        $sym1$_CACHED_RKF_IRRELEVANT_PRECISION_SUGGESTION_FORT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORT-CACHING-STATE*");
        $const2$keIrrelevantPrecisionSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantPrecisionSuggestion"));
        $sym3$CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT = SubLObjectFactory.makeSymbol("CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT");
        $sym4$_CACHED_RKF_IRRELEVANT_ARG_CONSTRAINT_FORT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-RKF-IRRELEVANT-ARG-CONSTRAINT-FORT-CACHING-STATE*");
        $const5$keIrrelevantArgConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantArgConstraint"));
        $kw6$IRRELEVANT_EVERYWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-EVERYWHERE");
        $kw7$IRRELEVANT_NOWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-NOWHERE");
        $kw8$IRRELEVANT_SOMEWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-SOMEWHERE");
        $const9$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym10$RKF_IRRELEVANT_TERM_LAMBDA_ = SubLObjectFactory.makeSymbol("RKF-IRRELEVANT-TERM-LAMBDA?");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $const12$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym13$CACHED_RKF_IRRELEVANT_FORT = SubLObjectFactory.makeSymbol("CACHED-RKF-IRRELEVANT-FORT");
        $sym14$_CACHED_RKF_IRRELEVANT_FORT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-RKF-IRRELEVANT-FORT-CACHING-STATE*");
        $sym15$CLEAR_CACHED_RKF_IRRELEVANT_FORT = SubLObjectFactory.makeSymbol("CLEAR-CACHED-RKF-IRRELEVANT-FORT");
        $const16$keIrrelevantTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm"));
        $kw17$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw18$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw19$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw20$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw21$REMOVAL_RKF_IRRELEVANT_FORT_CACHE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-RKF-IRRELEVANT-FORT-CACHE-CHECK-POS");
        $kw22$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $const23$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $const24$sourceOfTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceOfTerm"));
        $const25$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $kw26$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
    }
}

/*

	Total time: 140 ms
	
*/