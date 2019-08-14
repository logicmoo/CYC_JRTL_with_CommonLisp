package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class subcollection_unwindings_wff extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new subcollection_unwindings_wff();

    public static final String myName = "com.cyc.cycjava_2.cycl.subcollection_unwindings_wff";


    // defparameter
    public static final SubLSymbol $scg_wff_mt$ = makeSymbol("*SCG-WFF-MT*");

    // defparameter
    private static final SubLSymbol $scg_sentence_variable_type_constraints$ = makeSymbol("*SCG-SENTENCE-VARIABLE-TYPE-CONSTRAINTS*");

    // defparameter
    private static final SubLSymbol $scg_sentence_variable_genl_constraints$ = makeSymbol("*SCG-SENTENCE-VARIABLE-GENL-CONSTRAINTS*");

    // defvar
    private static final SubLSymbol $scg_wff_memoization_state$ = makeSymbol("*SCG-WFF-MEMOIZATION-STATE*");

    private static final SubLList $list0 = list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("PlausibilityQueryMt")), reader_make_constant_shell(makeString("AnytimePSC")));



    private static final SubLSymbol $sym2$_EXIT = makeSymbol("%EXIT");

    private static final SubLFloat $float$0_99 = makeDouble(0.99);

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLSymbol SCG_WFF_SORT_TYPE_CONSTRAINTS = makeSymbol("SCG-WFF-SORT-TYPE-CONSTRAINTS");

    private static final SubLInteger $int$8192 = makeInteger(8192);



    private static final SubLSymbol $sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_ = makeSymbol("SCG-WFF-TYPE-CONSTRAINTS-DISJOINT?");

    private static final SubLSymbol $sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_ = makeSymbol("SCG-WFF-TERM-ISA-CONSTRAINTS-OK?");

    private static final SubLSymbol $sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_ = makeSymbol("SCG-WFF-TERM-GENL-CONSTRAINTS-OK?");

    private static final SubLSymbol SCG_WFF_TERM_ISA_CONSTRAINTS = makeSymbol("SCG-WFF-TERM-ISA-CONSTRAINTS");

    private static final SubLSymbol SCG_WFF_TERM_GENL_CONSTRAINTS = makeSymbol("SCG-WFF-TERM-GENL-CONSTRAINTS");

    private static final SubLSymbol $sym13$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLString $$$VAR = makeString("VAR");

    public static SubLObject scg_sentence_wffP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $scg_sentence_variable_type_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $scg_sentence_variable_genl_constraints$.currentBinding(thread);
        try {
            $scg_sentence_variable_type_constraints$.bind(NIL, thread);
            $scg_sentence_variable_genl_constraints$.bind(NIL, thread);
            return scg_sentence_unwinding_wffP(sentence, mt);
        } finally {
            $scg_sentence_variable_genl_constraints$.rebind(_prev_bind_2, thread);
            $scg_sentence_variable_type_constraints$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject implausible_scg_unwindingP(final SubLObject unwinding, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        return makeBoolean(NIL == scg_sentence_wffP(unwinding, mt));
    }

    public static SubLObject scg_sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = $scg_wff_memoization_state$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject unwound_sentence = subcollection_unwinder.scg_subcol_expand_signature(sentence);
                final SubLObject fast_wff_result = scg_sentence_wffP(unwound_sentence, mt);
                result = (NIL != fast_wff_result) ? $float$0_99 : $float$0_01;
                $scg_wff_memoization_state$.setDynamicValue(memoization_state.current_memoization_state(), thread);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject scg_sentence_unwinding_wffP(final SubLObject unwound_sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        if (NIL != el_existential_p(unwound_sentence)) {
            return scg_sentence_unwinding_wffP(cycl_utilities.formula_arg2(unwound_sentence, UNPROVIDED), mt);
        }
        if (NIL != el_conjunction_p(unwound_sentence)) {
            return scg_wff_check_sentence_constraints(unwound_sentence.rest(), mt);
        }
        return scg_wff_check_sentence_constraints(list(unwound_sentence), mt);
    }

    public static SubLObject scg_wff_note_var_isa_constraints(final SubLObject variable, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_cell = assoc(variable, $scg_sentence_variable_type_constraints$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
        if (NIL != var_cell) {
            rplacd(var_cell, union(constraints, var_cell.rest(), symbol_function(EQUAL), UNPROVIDED));
        } else {
            $scg_sentence_variable_type_constraints$.setDynamicValue(acons(variable, constraints, $scg_sentence_variable_type_constraints$.getDynamicValue(thread)), thread);
        }
        return T;
    }

    public static SubLObject scg_wff_note_var_genl_constraints(final SubLObject variable, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_cell = assoc(variable, $scg_sentence_variable_genl_constraints$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
        if (NIL != var_cell) {
            rplacd(var_cell, union(constraints, var_cell.rest(), symbol_function(EQUAL), UNPROVIDED));
        } else {
            $scg_sentence_variable_genl_constraints$.setDynamicValue(acons(variable, constraints, $scg_sentence_variable_genl_constraints$.getDynamicValue(thread)), thread);
        }
        return T;
    }

    public static SubLObject scg_wff_sort_type_constraints_internal(final SubLObject constraints) {
        return kb_utilities.sort_terms(constraints, T, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject scg_wff_sort_type_constraints(final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scg_wff_sort_type_constraints_internal(constraints);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SCG_WFF_SORT_TYPE_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SCG_WFF_SORT_TYPE_CONSTRAINTS, ONE_INTEGER, $int$8192, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SCG_WFF_SORT_TYPE_CONSTRAINTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constraints, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(scg_wff_sort_type_constraints_internal(constraints)));
            memoization_state.caching_state_put(caching_state, constraints, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject scg_wff_check_sentence_constraints(final SubLObject literals, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == scg_wff_literal_type_constraints_okP(literal, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        SubLObject constraints = Mapping.mapcar(symbol_function(CDR), $scg_sentence_variable_type_constraints$.getDynamicValue(thread));
        SubLObject cdolist_list_var2;
        constraints = cdolist_list_var2 = Mapping.mapcar(symbol_function(SCG_WFF_SORT_TYPE_CONSTRAINTS), constraints);
        SubLObject constraint_list = NIL;
        constraint_list = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != scg_wff_type_constraints_disjointP(genls.min_cols(constraint_list, mt, UNPROVIDED), UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint_list = cdolist_list_var2.first();
        } 
        constraints = Mapping.mapcar(symbol_function(CDR), $scg_sentence_variable_genl_constraints$.getDynamicValue(thread));
        constraints = cdolist_list_var2 = Mapping.mapcar(symbol_function(SCG_WFF_SORT_TYPE_CONSTRAINTS), constraints);
        constraint_list = NIL;
        constraint_list = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != scg_wff_type_constraints_disjointP(genls.min_cols(constraint_list, mt, UNPROVIDED), UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint_list = cdolist_list_var2.first();
        } 
        return T;
    }

    public static SubLObject scg_wff_type_constraints_disjointP_internal(final SubLObject constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        return NIL != disjoint_with.any_disjoint_collection_pair(constraints, mt) ? T : NIL;
    }

    public static SubLObject scg_wff_type_constraints_disjointP(final SubLObject constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scg_wff_type_constraints_disjointP_internal(constraints, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_, TWO_INTEGER, $int$8192, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(constraints, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(scg_wff_type_constraints_disjointP_internal(constraints, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(constraints, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject scg_wff_term_isa_constraints_okP_internal(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        SubLObject cdolist_list_var = constraints;
        SubLObject argn_constraint = NIL;
        argn_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == isa.isaP(v_term, argn_constraint, mt, UNPROVIDED)) && ((NIL == cycl_grammar.cycl_unrepresented_term_p(v_term)) || (NIL == at_defns.isa_via_defnsP(v_term, argn_constraint, mt)))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argn_constraint = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject scg_wff_term_isa_constraints_okP(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scg_wff_term_isa_constraints_okP_internal(v_term, constraints, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_, THREE_INTEGER, $int$8192, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, constraints, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraints.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(scg_wff_term_isa_constraints_okP_internal(v_term, constraints, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, constraints, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject scg_wff_term_genl_constraints_okP_internal(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        SubLObject cdolist_list_var = constraints;
        SubLObject argn_constraint = NIL;
        argn_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != cycl_grammar.cycl_unrepresented_term_p(v_term)) || (NIL == genls.genlP(v_term, argn_constraint, mt, UNPROVIDED))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argn_constraint = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject scg_wff_term_genl_constraints_okP(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scg_wff_term_genl_constraints_okP_internal(v_term, constraints, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_, THREE_INTEGER, $int$8192, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, constraints, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraints.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(scg_wff_term_genl_constraints_okP_internal(v_term, constraints, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, constraints, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject scg_wff_term_isa_constraints_internal(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        return genls.min_cols(at_var_types.neg_lit_variable_isa_constraints(v_term, literal, mt), mt, UNPROVIDED);
    }

    public static SubLObject scg_wff_term_isa_constraints(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scg_wff_term_isa_constraints_internal(v_term, literal, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SCG_WFF_TERM_ISA_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SCG_WFF_TERM_ISA_CONSTRAINTS, THREE_INTEGER, $int$8192, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SCG_WFF_TERM_ISA_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, literal, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(scg_wff_term_isa_constraints_internal(v_term, literal, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, literal, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject scg_wff_term_genl_constraints_internal(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        return genls.min_cols(at_var_types.neg_lit_variable_genl_constraints(v_term, literal, mt), mt, UNPROVIDED);
    }

    public static SubLObject scg_wff_term_genl_constraints(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scg_wff_term_genl_constraints_internal(v_term, literal, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SCG_WFF_TERM_GENL_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SCG_WFF_TERM_GENL_CONSTRAINTS, THREE_INTEGER, $int$8192, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SCG_WFF_TERM_GENL_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, literal, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(scg_wff_term_genl_constraints_internal(v_term, literal, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, literal, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject scg_wff_canonicalize_variables(final SubLObject v_term, final SubLObject literal) {
        final SubLObject vars = list_utilities.tree_gather(literal, symbol_function($sym13$EL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject canon_vars = NIL;
        SubLObject list_var = NIL;
        SubLObject var = NIL;
        SubLObject counter = NIL;
        list_var = vars;
        var = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , var = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            canon_vars = cons(bq_cons(var, cycl_variables.make_el_var(cconcatenate($$$VAR, format_nil.format_nil_d_no_copy(counter)))), canon_vars);
        }
        return bq_cons(sublis(canon_vars, v_term, UNPROVIDED, UNPROVIDED), sublis(canon_vars, literal, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject scg_wff_literal_type_constraints_okP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $scg_wff_mt$.getDynamicValue();
        }
        if (NIL != wff_utilities.non_wf_fort_p(literal)) {
            return NIL;
        }
        final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        final SubLObject args = literal_args(literal, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        SubLObject argn;
        SubLObject canon_term_and_literal;
        SubLObject argn_isa_constraints;
        SubLObject argn_genl_constraints;
        for (cdotimes_end_var = length(args), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            argn = literal_arg(literal, argnum, UNPROVIDED);
            canon_term_and_literal = scg_wff_canonicalize_variables(argn, literal);
            argn_isa_constraints = scg_wff_term_isa_constraints(canon_term_and_literal.first(), canon_term_and_literal.rest(), mt);
            argn_genl_constraints = scg_wff_term_genl_constraints(canon_term_and_literal.first(), canon_term_and_literal.rest(), mt);
            if (NIL != kb_accessors.function_to_arg_termP(predicate)) {
                argn_isa_constraints = nconc(argn_isa_constraints, kb_accessors.result_isa(predicate, mt));
            }
            if (((NIL == cycl_variables.el_varP(argn)) && (NIL == cycl_grammar.cycl_unrepresented_term_p(argn))) && (NIL == scg_wff_literal_type_constraints_okP(argn, mt))) {
                return NIL;
            }
            if (NIL != cycl_variables.el_varP(argn)) {
                if (NIL != argn_isa_constraints) {
                    scg_wff_note_var_isa_constraints(argn, argn_isa_constraints);
                }
                if (NIL != argn_genl_constraints) {
                    scg_wff_note_var_genl_constraints(argn, argn_genl_constraints);
                }
            } else {
                if ((NIL != argn_isa_constraints) && (NIL == scg_wff_term_isa_constraints_okP(argn, argn_isa_constraints, mt))) {
                    if (NIL != cycl_grammar.cycl_unrepresented_term_p(argn)) {
                        return NIL;
                    }
                    if (NIL != scg_wff_type_constraints_disjointP(genls.min_cols(union(argn_isa_constraints, isa.isa(argn, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt)) {
                        return NIL;
                    }
                }
                if ((NIL != argn_genl_constraints) && (NIL == scg_wff_term_genl_constraints_okP(argn, argn_genl_constraints, mt))) {
                    if (NIL != cycl_grammar.cycl_unrepresented_term_p(argn)) {
                        return NIL;
                    }
                    if (NIL != scg_wff_type_constraints_disjointP(genls.min_cols(union(argn_genl_constraints, genls.genls(argn, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject declare_subcollection_unwindings_wff_file() {
        declareFunction("scg_sentence_wffP", "SCG-SENTENCE-WFF?", 1, 1, false);
        declareFunction("implausible_scg_unwindingP", "IMPLAUSIBLE-SCG-UNWINDING?", 1, 1, false);
        declareFunction("scg_sentence_plausibility_factor", "SCG-SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false);
        declareFunction("scg_sentence_unwinding_wffP", "SCG-SENTENCE-UNWINDING-WFF?", 1, 1, false);
        declareFunction("scg_wff_note_var_isa_constraints", "SCG-WFF-NOTE-VAR-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("scg_wff_note_var_genl_constraints", "SCG-WFF-NOTE-VAR-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction("scg_wff_sort_type_constraints_internal", "SCG-WFF-SORT-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
        declareFunction("scg_wff_sort_type_constraints", "SCG-WFF-SORT-TYPE-CONSTRAINTS", 1, 0, false);
        declareFunction("scg_wff_check_sentence_constraints", "SCG-WFF-CHECK-SENTENCE-CONSTRAINTS", 1, 1, false);
        declareFunction("scg_wff_type_constraints_disjointP_internal", "SCG-WFF-TYPE-CONSTRAINTS-DISJOINT?-INTERNAL", 1, 1, false);
        declareFunction("scg_wff_type_constraints_disjointP", "SCG-WFF-TYPE-CONSTRAINTS-DISJOINT?", 1, 1, false);
        declareFunction("scg_wff_term_isa_constraints_okP_internal", "SCG-WFF-TERM-ISA-CONSTRAINTS-OK?-INTERNAL", 2, 1, false);
        declareFunction("scg_wff_term_isa_constraints_okP", "SCG-WFF-TERM-ISA-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("scg_wff_term_genl_constraints_okP_internal", "SCG-WFF-TERM-GENL-CONSTRAINTS-OK?-INTERNAL", 2, 1, false);
        declareFunction("scg_wff_term_genl_constraints_okP", "SCG-WFF-TERM-GENL-CONSTRAINTS-OK?", 2, 1, false);
        declareFunction("scg_wff_term_isa_constraints_internal", "SCG-WFF-TERM-ISA-CONSTRAINTS-INTERNAL", 3, 0, false);
        declareFunction("scg_wff_term_isa_constraints", "SCG-WFF-TERM-ISA-CONSTRAINTS", 3, 0, false);
        declareFunction("scg_wff_term_genl_constraints_internal", "SCG-WFF-TERM-GENL-CONSTRAINTS-INTERNAL", 3, 0, false);
        declareFunction("scg_wff_term_genl_constraints", "SCG-WFF-TERM-GENL-CONSTRAINTS", 3, 0, false);
        declareFunction("scg_wff_canonicalize_variables", "SCG-WFF-CANONICALIZE-VARIABLES", 2, 0, false);
        declareFunction("scg_wff_literal_type_constraints_okP", "SCG-WFF-LITERAL-TYPE-CONSTRAINTS-OK?", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_subcollection_unwindings_wff_file() {
        defparameter("*SCG-WFF-MT*", $list0);
        defparameter("*SCG-SENTENCE-VARIABLE-TYPE-CONSTRAINTS*", $UNINITIALIZED);
        defparameter("*SCG-SENTENCE-VARIABLE-GENL-CONSTRAINTS*", $UNINITIALIZED);
        defvar("*SCG-WFF-MEMOIZATION-STATE*", memoization_state.create_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_subcollection_unwindings_wff_file() {
        memoization_state.note_memoized_function(SCG_WFF_SORT_TYPE_CONSTRAINTS);
        memoization_state.note_memoized_function($sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_);
        memoization_state.note_memoized_function($sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_);
        memoization_state.note_memoized_function($sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_);
        memoization_state.note_memoized_function(SCG_WFF_TERM_ISA_CONSTRAINTS);
        memoization_state.note_memoized_function(SCG_WFF_TERM_GENL_CONSTRAINTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subcollection_unwindings_wff_file();
    }

    @Override
    public void initializeVariables() {
        init_subcollection_unwindings_wff_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subcollection_unwindings_wff_file();
    }

    static {




















    }
}

/**
 * Total time: 157 ms
 */
