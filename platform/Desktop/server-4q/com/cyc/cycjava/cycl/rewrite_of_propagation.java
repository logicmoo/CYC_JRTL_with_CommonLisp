package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rewrite_of_propagation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rewrite_of_propagation";
    public static final String myFingerPrint = "ab5cf4a3c23bdb2a2a8a5cdb91b57033abce1b23bdb7796647fe449e6525e74d";
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1025L)
    public static SubLSymbol $enable_rewrite_of_propagationP$;
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2103L)
    private static SubLSymbol $propagate_rewrite_of_source_term$;
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2180L)
    private static SubLSymbol $propagate_rewrite_of_target_term$;
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2242L)
    private static SubLSymbol $propagate_rewrite_of_assertion$;
    private static final SubLObject $const0$rewriteOf;
    private static final SubLSymbol $kw1$TRUE;
    private static final SubLSymbol $sym2$REWRITE_OF_AFTER_ADDING;
    private static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const4$EverythingPSC;
    private static final SubLSymbol $sym5$PROPAGATE_REWRITE_OF_ASSERTION;
    private static final SubLSymbol $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS;
    private static final SubLSymbol $kw7$GAF;
    private static final SubLSymbol $sym8$ASSERTION_P;
    private static final SubLSymbol $sym9$FORT_P;
    private static final SubLSymbol $kw10$PROPAGATE_REWRITE_OF_CNF;
    private static final SubLSymbol $sym11$OPAQUE_ARG_WRT_QUOTING_;
    private static final SubLSymbol $sym12$_EXIT;
    private static final SubLObject $const13$isa;
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1306L)
    public static SubLObject rewrite_of_after_adding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        equality_store.decache_some_equality_assertions_somewhere(argument, assertion);
        if (rewrite_of_propagation.NIL != rewrite_of_propagation.$enable_rewrite_of_propagationP$.getDynamicValue(thread) && rewrite_of_propagation.NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, rewrite_of_propagation.$const0$rewriteOf) && rewrite_of_propagation.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)rewrite_of_propagation.$kw1$TRUE)) {
            final SubLObject asent = assertions_high.gaf_formula(assertion);
            if (rewrite_of_propagation.NIL != el_utilities.formula_arityE(asent, (SubLObject)rewrite_of_propagation.TWO_INTEGER, (SubLObject)rewrite_of_propagation.UNPROVIDED)) {
                final SubLObject source = cycl_utilities.sentence_arg2(asent, (SubLObject)rewrite_of_propagation.UNPROVIDED);
                final SubLObject target = cycl_utilities.sentence_arg1(asent, (SubLObject)rewrite_of_propagation.UNPROVIDED);
                if (rewrite_of_propagation.NIL != forts.fort_p(target) && rewrite_of_propagation.NIL != forts.fort_p(source) && !target.equal(source)) {
                    rewrite_of_after_adding_internal(source, target, assertion);
                }
            }
        }
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2304L)
    public static SubLObject rewrite_of_after_adding_internal(SubLObject source, final SubLObject target, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rewrite_of_propagation.$propagate_rewrite_of_source_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rewrite_of_propagation.$propagate_rewrite_of_target_term$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rewrite_of_propagation.$propagate_rewrite_of_assertion$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            rewrite_of_propagation.$propagate_rewrite_of_source_term$.bind(source, thread);
            rewrite_of_propagation.$propagate_rewrite_of_target_term$.bind(target, thread);
            rewrite_of_propagation.$propagate_rewrite_of_assertion$.bind(assertion, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rewrite_of_propagation.$sym3$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rewrite_of_propagation.$const4$EverythingPSC, thread);
            kb_mapping.map_term((SubLObject)rewrite_of_propagation.$sym5$PROPAGATE_REWRITE_OF_ASSERTION, source);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            rewrite_of_propagation.$propagate_rewrite_of_assertion$.rebind(_prev_bind_3, thread);
            rewrite_of_propagation.$propagate_rewrite_of_target_term$.rebind(_prev_bind_2, thread);
            rewrite_of_propagation.$propagate_rewrite_of_source_term$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2616L)
    public static SubLObject propagate_rewrite_of_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = rewrite_of_propagation.$propagate_rewrite_of_source_term$.getDynamicValue(thread);
        final SubLObject target = rewrite_of_propagation.$propagate_rewrite_of_target_term$.getDynamicValue(thread);
        final SubLObject rewrite_of_assertion = rewrite_of_propagation.$propagate_rewrite_of_assertion$.getDynamicValue(thread);
        if (!assertion.eql(rewrite_of_propagation.$propagate_rewrite_of_assertion$.getDynamicValue(thread))) {
            propagate_assertion_via_rewrite_of(assertion, source, target, rewrite_of_assertion);
        }
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 3032L)
    public static SubLObject perform_rewrite_of_propagation(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rewrite_of_propagation.NIL != rewrite_of_propagation.$enable_rewrite_of_propagationP$.getDynamicValue(thread)) {
            final SubLObject forts_with_rewrite_of = cycl_utilities.expression_gather(assertion, (SubLObject)rewrite_of_propagation.$sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS, (SubLObject)rewrite_of_propagation.T, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED);
            if (rewrite_of_propagation.NIL != forts_with_rewrite_of) {
                SubLObject cdolist_list_var = forts_with_rewrite_of;
                SubLObject fort = (SubLObject)rewrite_of_propagation.NIL;
                fort = cdolist_list_var.first();
                while (rewrite_of_propagation.NIL != cdolist_list_var) {
                    perform_rewrite_of_propagation_internal(fort, assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    fort = cdolist_list_var.first();
                }
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 3632L)
    public static SubLObject perform_rewrite_of_propagation_internal(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rewrite_of_propagation.$sym3$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rewrite_of_propagation.$const4$EverythingPSC, thread);
            final SubLObject pred_var = rewrite_of_propagation.$const0$rewriteOf;
            if (rewrite_of_propagation.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, (SubLObject)rewrite_of_propagation.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, (SubLObject)rewrite_of_propagation.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)rewrite_of_propagation.NIL;
                final SubLObject token_var = (SubLObject)rewrite_of_propagation.NIL;
                while (rewrite_of_propagation.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (rewrite_of_propagation.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)rewrite_of_propagation.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rewrite_of_propagation.$kw7$GAF, (SubLObject)rewrite_of_propagation.$kw1$TRUE, (SubLObject)rewrite_of_propagation.NIL);
                            SubLObject done_var_$1 = (SubLObject)rewrite_of_propagation.NIL;
                            final SubLObject token_var_$2 = (SubLObject)rewrite_of_propagation.NIL;
                            while (rewrite_of_propagation.NIL == done_var_$1) {
                                final SubLObject rewrite_of_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(rewrite_of_assertion));
                                if (rewrite_of_propagation.NIL != valid_$3) {
                                    final SubLObject target = assertions_high.gaf_arg1(rewrite_of_assertion);
                                    if (rewrite_of_propagation.NIL != forts.fort_p(target) && !source.equal(target) && !rewrite_of_assertion.eql(assertion)) {
                                        propagate_assertion_via_rewrite_of(assertion, source, target, rewrite_of_assertion);
                                    }
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(rewrite_of_propagation.NIL == valid_$3);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rewrite_of_propagation.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rewrite_of_propagation.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rewrite_of_propagation.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 4110L)
    public static SubLObject fort_with_some_source_rewrite_of_assertions(final SubLObject fort) {
        return equality_store.some_source_rewrite_of_assertions_somewhereP(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 4239L)
    public static SubLObject propagate_assertion_via_rewrite_of(final SubLObject assertion, SubLObject source, final SubLObject target, final SubLObject rewrite_of_assertion) {
        assert rewrite_of_propagation.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert rewrite_of_propagation.NIL != forts.fort_p(source) : source;
        assert rewrite_of_propagation.NIL != forts.fort_p(target) : target;
        assert rewrite_of_propagation.NIL != assertion_handles.assertion_p(rewrite_of_assertion) : rewrite_of_assertion;
        final SubLObject assertion_cnf = assertion_utilities.assertion_cnf_with_el_vars_only(assertion);
        if (rewrite_of_propagation.NIL != should_propagate_rewrite_of_cnf(assertion_cnf, source, target)) {
            final SubLObject new_assertion_cnf = propagate_rewrite_of_cnf(assertion_cnf, source, target);
            if (!new_assertion_cnf.equal(assertion_cnf)) {
                final SubLObject new_el_formula = clauses.cnf_formula(new_assertion_cnf, assertions_high.assertion_truth(assertion));
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                final SubLObject el_supports = (SubLObject)ConsesLow.list(assertion, rewrite_of_assertion);
                final SubLObject source_mt = assertions_high.assertion_mt(assertion);
                final SubLObject rewrite_of_mt = assertions_high.assertion_mt(rewrite_of_assertion);
                final SubLObject new_mt = determine_propagate_rewrite_of_mt(source_mt, rewrite_of_mt);
                if (rewrite_of_propagation.NIL != new_mt) {
                    fi.fi_add_argument_int(new_el_formula, new_mt, el_supports, direction, (SubLObject)rewrite_of_propagation.UNPROVIDED);
                }
            }
        }
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 5467L)
    public static SubLObject should_propagate_rewrite_of_cnf(final SubLObject assertion_cnf, SubLObject source, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject something_to_propagate = (SubLObject)rewrite_of_propagation.NIL;
        try {
            thread.throwStack.push(rewrite_of_propagation.$kw10$PROPAGATE_REWRITE_OF_CNF);
            propagate_rewrite_of_cnf_internal(assertion_cnf, source, target, (SubLObject)rewrite_of_propagation.T);
        }
        catch (Throwable ccatch_env_var) {
            something_to_propagate = Errors.handleThrowable(ccatch_env_var, (SubLObject)rewrite_of_propagation.$kw10$PROPAGATE_REWRITE_OF_CNF);
        }
        finally {
            thread.throwStack.pop();
        }
        return something_to_propagate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 5748L)
    public static SubLObject note_should_propagate_rewrite_of_cnf() {
        Dynamic.sublisp_throw((SubLObject)rewrite_of_propagation.$kw10$PROPAGATE_REWRITE_OF_CNF, (SubLObject)rewrite_of_propagation.T);
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 5856L)
    public static SubLObject propagate_rewrite_of_cnf(final SubLObject assertion_cnf, SubLObject source, final SubLObject target) {
        return propagate_rewrite_of_cnf_internal(assertion_cnf, source, target, (SubLObject)rewrite_of_propagation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 6005L)
    public static SubLObject propagate_rewrite_of_cnf_internal(final SubLObject assertion_cnf, SubLObject source, final SubLObject target, final SubLObject check) {
        final SubLObject neg_lits = clauses.neg_lits(assertion_cnf);
        final SubLObject pos_lits = clauses.pos_lits(assertion_cnf);
        SubLObject new_neg_lits = (SubLObject)rewrite_of_propagation.NIL;
        SubLObject new_pos_lits = (SubLObject)rewrite_of_propagation.NIL;
        if (rewrite_of_propagation.NIL != cycl_utilities.expression_list_find(source, neg_lits, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED)) {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject neg_lit = (SubLObject)rewrite_of_propagation.NIL;
            neg_lit = cdolist_list_var.first();
            while (rewrite_of_propagation.NIL != cdolist_list_var) {
                final SubLObject literal = propagate_rewrite_of_atomic_sentence(neg_lit, source, target, check);
                if (rewrite_of_propagation.NIL == check) {
                    new_neg_lits = (SubLObject)ConsesLow.cons(literal, new_neg_lits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            }
            if (rewrite_of_propagation.NIL == check) {
                new_neg_lits = Sequences.nreverse(new_neg_lits);
            }
        }
        else if (rewrite_of_propagation.NIL == check) {
            new_neg_lits = neg_lits;
        }
        if (rewrite_of_propagation.NIL != cycl_utilities.expression_list_find(source, pos_lits, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED)) {
            SubLObject cdolist_list_var = pos_lits;
            SubLObject pos_lit = (SubLObject)rewrite_of_propagation.NIL;
            pos_lit = cdolist_list_var.first();
            while (rewrite_of_propagation.NIL != cdolist_list_var) {
                final SubLObject literal = propagate_rewrite_of_atomic_sentence(pos_lit, source, target, check);
                if (rewrite_of_propagation.NIL == check) {
                    new_pos_lits = (SubLObject)ConsesLow.cons(literal, new_pos_lits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            }
            if (rewrite_of_propagation.NIL == check) {
                new_pos_lits = Sequences.nreverse(new_pos_lits);
            }
        }
        else if (rewrite_of_propagation.NIL == check) {
            new_pos_lits = pos_lits;
        }
        if (rewrite_of_propagation.NIL != check) {
            return (SubLObject)rewrite_of_propagation.NIL;
        }
        return clauses.make_cnf(new_neg_lits, new_pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 7025L)
    public static SubLObject propagate_rewrite_of_atomic_sentence(final SubLObject asent, SubLObject source, final SubLObject target, final SubLObject check) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)rewrite_of_propagation.$sym11$OPAQUE_ARG_WRT_QUOTING_, thread);
            if (rewrite_of_propagation.NIL == cycl_utilities.expression_find(source, asent, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED)) {
                return asent;
            }
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (rewrite_of_propagation.NIL == forts.fort_p(predicate)) {
                return asent;
            }
            if (predicate.eql(rewrite_of_propagation.$const13$isa) && rewrite_of_propagation.NIL != check) {
                note_should_propagate_rewrite_of_cnf();
                return cycl_utilities.expression_subst(target, source, asent, Symbols.symbol_function((SubLObject)rewrite_of_propagation.EQUAL), (SubLObject)rewrite_of_propagation.UNPROVIDED);
            }
            if (rewrite_of_propagation.NIL == kb_accessors.some_opaque_argumentP(predicate)) {
                if (rewrite_of_propagation.NIL != check) {
                    note_should_propagate_rewrite_of_cnf();
                }
                return cycl_utilities.expression_subst(target, source, asent, Symbols.symbol_function((SubLObject)rewrite_of_propagation.EQUAL), (SubLObject)rewrite_of_propagation.UNPROVIDED);
            }
            final SubLObject sentence_args = cycl_utilities.sentence_args(asent, (SubLObject)rewrite_of_propagation.UNPROVIDED);
            SubLObject arg_index = (SubLObject)rewrite_of_propagation.ZERO_INTEGER;
            SubLObject subst_args = (SubLObject)rewrite_of_propagation.NIL;
            SubLObject cdolist_list_var = sentence_args;
            SubLObject sentence_arg = (SubLObject)rewrite_of_propagation.NIL;
            sentence_arg = cdolist_list_var.first();
            while (rewrite_of_propagation.NIL != cdolist_list_var) {
                arg_index = Numbers.add(arg_index, (SubLObject)rewrite_of_propagation.ONE_INTEGER);
                if (rewrite_of_propagation.NIL != cycl_utilities.expression_find(source, sentence_arg, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED) && rewrite_of_propagation.NIL == kb_accessors.opaque_argumentP(predicate, arg_index)) {
                    if (rewrite_of_propagation.NIL != check) {
                        note_should_propagate_rewrite_of_cnf();
                    }
                    subst_args = (SubLObject)ConsesLow.cons(arg_index, subst_args);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence_arg = cdolist_list_var.first();
            }
            if (rewrite_of_propagation.NIL == subst_args) {
                return asent;
            }
            final SubLObject new_asent = el_utilities.copy_expression(asent);
            SubLObject cdolist_list_var2 = subst_args;
            SubLObject subst_arg = (SubLObject)rewrite_of_propagation.NIL;
            subst_arg = cdolist_list_var2.first();
            while (rewrite_of_propagation.NIL != cdolist_list_var2) {
                final SubLObject old_arg = cycl_utilities.sentence_arg(new_asent, subst_arg, (SubLObject)rewrite_of_propagation.UNPROVIDED);
                ConsesLow.set_nth(subst_arg, new_asent, cycl_utilities.expression_nsubst(target, source, old_arg, Symbols.symbol_function((SubLObject)rewrite_of_propagation.EQUAL), (SubLObject)rewrite_of_propagation.UNPROVIDED));
                cdolist_list_var2 = cdolist_list_var2.rest();
                subst_arg = cdolist_list_var2.first();
            }
            return new_asent;
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 9394L)
    public static SubLObject determine_propagate_rewrite_of_mt(final SubLObject source_mt, final SubLObject rewrite_of_mt) {
        if (rewrite_of_propagation.NIL != genl_mts.genl_mtP(source_mt, rewrite_of_mt, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED)) {
            return source_mt;
        }
        if (rewrite_of_propagation.NIL != genl_mts.genl_mtP(rewrite_of_mt, source_mt, (SubLObject)rewrite_of_propagation.UNPROVIDED, (SubLObject)rewrite_of_propagation.UNPROVIDED)) {
            return rewrite_of_mt;
        }
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    public static SubLObject declare_rewrite_of_propagation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "rewrite_of_after_adding", "REWRITE-OF-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "rewrite_of_after_adding_internal", "REWRITE-OF-AFTER-ADDING-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "propagate_rewrite_of_assertion", "PROPAGATE-REWRITE-OF-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "perform_rewrite_of_propagation", "PERFORM-REWRITE-OF-PROPAGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "perform_rewrite_of_propagation_internal", "PERFORM-REWRITE-OF-PROPAGATION-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "fort_with_some_source_rewrite_of_assertions", "FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS", 1, 0, false);
        new $fort_with_some_source_rewrite_of_assertions$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "propagate_assertion_via_rewrite_of", "PROPAGATE-ASSERTION-VIA-REWRITE-OF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "should_propagate_rewrite_of_cnf", "SHOULD-PROPAGATE-REWRITE-OF-CNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "note_should_propagate_rewrite_of_cnf", "NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "propagate_rewrite_of_cnf", "PROPAGATE-REWRITE-OF-CNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "propagate_rewrite_of_cnf_internal", "PROPAGATE-REWRITE-OF-CNF-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "propagate_rewrite_of_atomic_sentence", "PROPAGATE-REWRITE-OF-ATOMIC-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rewrite_of_propagation", "determine_propagate_rewrite_of_mt", "DETERMINE-PROPAGATE-REWRITE-OF-MT", 2, 0, false);
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    public static SubLObject init_rewrite_of_propagation_file() {
        rewrite_of_propagation.$enable_rewrite_of_propagationP$ = SubLFiles.defparameter("*ENABLE-REWRITE-OF-PROPAGATION?*", (SubLObject)rewrite_of_propagation.T);
        rewrite_of_propagation.$propagate_rewrite_of_source_term$ = SubLFiles.defparameter("*PROPAGATE-REWRITE-OF-SOURCE-TERM*", (SubLObject)rewrite_of_propagation.NIL);
        rewrite_of_propagation.$propagate_rewrite_of_target_term$ = SubLFiles.defparameter("*PROPAGATE-REWRITE-OF-TARGET-TERM*", (SubLObject)rewrite_of_propagation.NIL);
        rewrite_of_propagation.$propagate_rewrite_of_assertion$ = SubLFiles.defparameter("*PROPAGATE-REWRITE-OF-ASSERTION*", (SubLObject)rewrite_of_propagation.NIL);
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    public static SubLObject setup_rewrite_of_propagation_file() {
        utilities_macros.register_kb_function((SubLObject)rewrite_of_propagation.$sym2$REWRITE_OF_AFTER_ADDING);
        return (SubLObject)rewrite_of_propagation.NIL;
    }
    
    public void declareFunctions() {
        declare_rewrite_of_propagation_file();
    }
    
    public void initializeVariables() {
        init_rewrite_of_propagation_file();
    }
    
    public void runTopLevelForms() {
        setup_rewrite_of_propagation_file();
    }
    
    static {
        me = (SubLFile)new rewrite_of_propagation();
        rewrite_of_propagation.$enable_rewrite_of_propagationP$ = null;
        rewrite_of_propagation.$propagate_rewrite_of_source_term$ = null;
        rewrite_of_propagation.$propagate_rewrite_of_target_term$ = null;
        rewrite_of_propagation.$propagate_rewrite_of_assertion$ = null;
        $const0$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $kw1$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym2$REWRITE_OF_AFTER_ADDING = SubLObjectFactory.makeSymbol("REWRITE-OF-AFTER-ADDING");
        $sym3$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const4$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym5$PROPAGATE_REWRITE_OF_ASSERTION = SubLObjectFactory.makeSymbol("PROPAGATE-REWRITE-OF-ASSERTION");
        $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS = SubLObjectFactory.makeSymbol("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS");
        $kw7$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym8$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym9$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw10$PROPAGATE_REWRITE_OF_CNF = SubLObjectFactory.makeKeyword("PROPAGATE-REWRITE-OF-CNF");
        $sym11$OPAQUE_ARG_WRT_QUOTING_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-QUOTING?");
        $sym12$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const13$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
    }
    
    public static final class $fort_with_some_source_rewrite_of_assertions$UnaryFunction extends UnaryFunction
    {
        public $fort_with_some_source_rewrite_of_assertions$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rewrite_of_propagation.fort_with_some_source_rewrite_of_assertions(arg1);
        }
    }
}

/*

	Total time: 180 ms
	
*/