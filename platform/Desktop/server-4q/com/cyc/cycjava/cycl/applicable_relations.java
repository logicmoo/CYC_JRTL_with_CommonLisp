package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class applicable_relations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.applicable_relations";
    public static final String myFingerPrint = "57d94bed5c205b8c13c1a589b5401ffebe74aecc181ea7ec6f6572f9a8173bdd";
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15068L)
    private static SubLSymbol $predicate_usage_estimate_cached_caching_state$;
    private static final SubLSymbol $kw0$DOMAIN;
    private static final SubLSymbol $kw1$ISA_HORIZON;
    private static final SubLSymbol $kw2$GENLS_HORIZON;
    private static final SubLSymbol $kw3$USAGE_THRESHOLD;
    private static final SubLObject $const4$argIsa;
    private static final SubLSymbol $kw5$GAF;
    private static final SubLSymbol $kw6$TRUE;
    private static final SubLObject $const7$argGenl;
    private static final SubLSymbol $kw8$ARG_GENL;
    private static final SubLObject $const9$argQuotedIsa;
    private static final SubLSymbol $kw10$ARG_QUOTED_ISA;
    private static final SubLSymbol $kw11$ARG_GENL_HORIZON;
    private static final SubLObject $const12$Predicate;
    private static final SubLObject $const13$Function_Denotational;
    private static final SubLSymbol $kw14$ASCENDING;
    private static final SubLSymbol $sym15$CONSP;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$NOT_KEYHASH_KEY_P;
    private static final SubLSymbol $kw18$MAX_NUMBER;
    private static final SubLString $str19$Considering_predicates;
    private static final SubLString $str20$cdolist;
    private static final SubLSymbol $sym21$SUGGESTED_GAFS_FOR_TERMS_ITERATOR_DONE_P;
    private static final SubLSymbol $sym22$SUGGESTED_GAFS_FOR_TERMS_ITERATOR_NEXT;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const26$EverythingPSC;
    private static final SubLSymbol $sym27$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const28$InferencePSC;
    private static final SubLSymbol $sym29$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym30$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym31$PREDICATE_BETTER_FOR_GAF_SUGGESTION_;
    private static final SubLSymbol $sym32$PREDICATE_USAGE_ESTIMATE_CACHED;
    private static final SubLInteger $int33$1000;
    private static final SubLSymbol $sym34$_PREDICATE_USAGE_ESTIMATE_CACHED_CACHING_STATE_;
    private static final SubLInteger $int35$100;
    private static final SubLSymbol $sym36$KEYHASH_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 1718L)
    public static SubLObject applicable_relations(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject domain_tail = cdestructuring_bind.property_list_member((SubLObject)applicable_relations.$kw0$DOMAIN, current);
        final SubLObject domain = (SubLObject)((applicable_relations.NIL != domain_tail) ? conses_high.cadr(domain_tail) : applicable_relations.NIL);
        final SubLObject isa_horizon_tail = cdestructuring_bind.property_list_member((SubLObject)applicable_relations.$kw1$ISA_HORIZON, current);
        final SubLObject isa_horizon = (SubLObject)((applicable_relations.NIL != isa_horizon_tail) ? conses_high.cadr(isa_horizon_tail) : applicable_relations.NIL);
        final SubLObject genls_horizon_tail = cdestructuring_bind.property_list_member((SubLObject)applicable_relations.$kw2$GENLS_HORIZON, current);
        final SubLObject genls_horizon = (SubLObject)((applicable_relations.NIL != genls_horizon_tail) ? conses_high.cadr(genls_horizon_tail) : applicable_relations.NIL);
        final SubLObject usage_threshold_tail = cdestructuring_bind.property_list_member((SubLObject)applicable_relations.$kw3$USAGE_THRESHOLD, current);
        final SubLObject usage_threshold = (SubLObject)((applicable_relations.NIL != usage_threshold_tail) ? conses_high.cadr(usage_threshold_tail) : applicable_relations.NIL);
        final SubLObject all_isa = applicable_relations_all_isa(v_term, mt);
        final SubLObject all_genls_set = applicable_relations_all_genls_set(v_term, mt);
        final SubLObject all_quoted_isa_set = applicable_relations_all_quoted_isa_set(v_term, mt);
        SubLObject relations = (SubLObject)applicable_relations.NIL;
        final SubLObject relation_set = set.new_set(Symbols.symbol_function((SubLObject)applicable_relations.EQL), (SubLObject)applicable_relations.ZERO_INTEGER);
        SubLObject cdolist_list_var = all_isa;
        SubLObject arg_isa = (SubLObject)applicable_relations.NIL;
        arg_isa = cdolist_list_var.first();
        while (applicable_relations.NIL != cdolist_list_var) {
            if (applicable_relations.NIL != ar_below_horizonP(arg_isa, isa_horizon)) {
                final SubLObject pred_var = applicable_relations.$const4$argIsa;
                if (applicable_relations.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg_isa, (SubLObject)applicable_relations.THREE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg_isa, (SubLObject)applicable_relations.THREE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)applicable_relations.NIL;
                    final SubLObject token_var = (SubLObject)applicable_relations.NIL;
                    while (applicable_relations.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (applicable_relations.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)applicable_relations.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)applicable_relations.$kw5$GAF, (SubLObject)applicable_relations.$kw6$TRUE, (SubLObject)applicable_relations.NIL);
                                SubLObject done_var_$1 = (SubLObject)applicable_relations.NIL;
                                final SubLObject token_var_$2 = (SubLObject)applicable_relations.NIL;
                                while (applicable_relations.NIL == done_var_$1) {
                                    final SubLObject arg_isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(arg_isa_gaf));
                                    if (applicable_relations.NIL != valid_$3) {
                                        final SubLObject relation = assertions_high.gaf_arg1(arg_isa_gaf);
                                        if (applicable_relations.NIL != ar_within_domainP(relation, domain, mt) && applicable_relations.NIL != ar_within_usage_thresholdP(relation, usage_threshold)) {
                                            final SubLObject argnum = assertions_high.gaf_arg2(arg_isa_gaf);
                                            SubLObject some_arg_genlP = (SubLObject)applicable_relations.NIL;
                                            SubLObject some_arg_genl_within_horizonP = (SubLObject)applicable_relations.NIL;
                                            SubLObject rejectedP = (SubLObject)applicable_relations.NIL;
                                            final SubLObject pred_var_$4 = applicable_relations.$const7$argGenl;
                                            if (applicable_relations.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)applicable_relations.ONE_INTEGER, pred_var_$4)) {
                                                final SubLObject iterator_var_$5 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)applicable_relations.ONE_INTEGER, pred_var_$4);
                                                SubLObject done_var_$2 = rejectedP;
                                                final SubLObject token_var_$3 = (SubLObject)applicable_relations.NIL;
                                                while (applicable_relations.NIL == done_var_$2) {
                                                    final SubLObject final_index_spec_$8 = iteration.iteration_next_without_values_macro_helper(iterator_var_$5, token_var_$3);
                                                    final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(final_index_spec_$8));
                                                    if (applicable_relations.NIL != valid_$4) {
                                                        SubLObject final_index_iterator_$10 = (SubLObject)applicable_relations.NIL;
                                                        try {
                                                            final_index_iterator_$10 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$8, (SubLObject)applicable_relations.$kw5$GAF, (SubLObject)applicable_relations.$kw6$TRUE, (SubLObject)applicable_relations.NIL);
                                                            SubLObject done_var_$3 = rejectedP;
                                                            final SubLObject token_var_$4 = (SubLObject)applicable_relations.NIL;
                                                            while (applicable_relations.NIL == done_var_$3) {
                                                                final SubLObject arg_genl_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$10, token_var_$4);
                                                                final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(arg_genl_gaf));
                                                                if (applicable_relations.NIL != valid_$5 && argnum.numE(assertions_high.gaf_arg2(arg_genl_gaf))) {
                                                                    some_arg_genlP = (SubLObject)applicable_relations.T;
                                                                    final SubLObject arg_genl = assertions_high.gaf_arg3(arg_genl_gaf);
                                                                    if (applicable_relations.NIL != ar_below_horizonP(arg_genl, genls_horizon)) {
                                                                        some_arg_genl_within_horizonP = (SubLObject)applicable_relations.T;
                                                                    }
                                                                    if (applicable_relations.NIL == set.set_memberP(arg_genl, all_genls_set)) {
                                                                        rejectedP = (SubLObject)applicable_relations.$kw8$ARG_GENL;
                                                                    }
                                                                }
                                                                done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == valid_$5 || applicable_relations.NIL != rejectedP);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                                            try {
                                                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)applicable_relations.T);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                if (applicable_relations.NIL != final_index_iterator_$10) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$10);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                                            }
                                                        }
                                                    }
                                                    done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == valid_$4 || applicable_relations.NIL != rejectedP);
                                                }
                                            }
                                            final SubLObject pred_var_$5 = applicable_relations.$const9$argQuotedIsa;
                                            if (applicable_relations.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)applicable_relations.ONE_INTEGER, pred_var_$5)) {
                                                final SubLObject iterator_var_$6 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)applicable_relations.ONE_INTEGER, pred_var_$5);
                                                SubLObject done_var_$4 = rejectedP;
                                                final SubLObject token_var_$5 = (SubLObject)applicable_relations.NIL;
                                                while (applicable_relations.NIL == done_var_$4) {
                                                    final SubLObject final_index_spec_$9 = iteration.iteration_next_without_values_macro_helper(iterator_var_$6, token_var_$5);
                                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(final_index_spec_$9));
                                                    if (applicable_relations.NIL != valid_$6) {
                                                        SubLObject final_index_iterator_$11 = (SubLObject)applicable_relations.NIL;
                                                        try {
                                                            final_index_iterator_$11 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$9, (SubLObject)applicable_relations.$kw5$GAF, (SubLObject)applicable_relations.$kw6$TRUE, (SubLObject)applicable_relations.NIL);
                                                            SubLObject done_var_$5 = rejectedP;
                                                            final SubLObject token_var_$6 = (SubLObject)applicable_relations.NIL;
                                                            while (applicable_relations.NIL == done_var_$5) {
                                                                final SubLObject arg_quoted_isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$11, token_var_$6);
                                                                final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(arg_quoted_isa_gaf));
                                                                if (applicable_relations.NIL != valid_$7 && argnum.numE(assertions_high.gaf_arg2(arg_quoted_isa_gaf))) {
                                                                    final SubLObject arg_quoted_isa = assertions_high.gaf_arg3(arg_quoted_isa_gaf);
                                                                    if (applicable_relations.NIL == set.set_memberP(arg_quoted_isa, all_quoted_isa_set)) {
                                                                        rejectedP = (SubLObject)applicable_relations.$kw10$ARG_QUOTED_ISA;
                                                                    }
                                                                }
                                                                done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == valid_$7 || applicable_relations.NIL != rejectedP);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                                            try {
                                                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)applicable_relations.T);
                                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                                if (applicable_relations.NIL != final_index_iterator_$11) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$11);
                                                                }
                                                                Values.restoreValuesFromVector(_values2);
                                                            }
                                                            finally {
                                                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                                            }
                                                        }
                                                    }
                                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == valid_$6 || applicable_relations.NIL != rejectedP);
                                                }
                                            }
                                            if (applicable_relations.NIL != some_arg_genlP && applicable_relations.NIL == some_arg_genl_within_horizonP) {
                                                rejectedP = (SubLObject)applicable_relations.$kw11$ARG_GENL_HORIZON;
                                            }
                                            if (applicable_relations.NIL == rejectedP && applicable_relations.NIL != set.set_add(relation, relation_set)) {
                                                relations = (SubLObject)ConsesLow.cons(relation, relations);
                                            }
                                        }
                                    }
                                    done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == valid_$3);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)applicable_relations.T);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (applicable_relations.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == valid);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa = cdolist_list_var.first();
        }
        return Sequences.nreverse(relations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 4603L)
    public static SubLObject applicable_predicates(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        v_properties = conses_high.copy_list(v_properties);
        v_properties = conses_high.putf(v_properties, (SubLObject)applicable_relations.$kw0$DOMAIN, applicable_relations.$const12$Predicate);
        return applicable_relations(v_term, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 5366L)
    public static SubLObject applicable_functions(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        v_properties = conses_high.copy_list(v_properties);
        v_properties = conses_high.putf(v_properties, (SubLObject)applicable_relations.$kw0$DOMAIN, applicable_relations.$const13$Function_Denotational);
        return applicable_relations(v_term, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 6136L)
    public static SubLObject ar_below_horizonP(final SubLObject constraint_col, final SubLObject horizon) {
        if (applicable_relations.NIL == horizon) {
            return (SubLObject)applicable_relations.T;
        }
        return cardinality_estimates.generality_estimateL(constraint_col, horizon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 6293L)
    public static SubLObject ar_within_domainP(final SubLObject relation, final SubLObject domain, final SubLObject mt) {
        if (applicable_relations.NIL == domain) {
            return (SubLObject)applicable_relations.T;
        }
        if (domain.eql(applicable_relations.$const12$Predicate)) {
            return fort_types_interface.predicateP(relation);
        }
        if (domain.eql(applicable_relations.$const13$Function_Denotational)) {
            return fort_types_interface.functionP(relation);
        }
        return isa.isaP(relation, domain, mt, (SubLObject)applicable_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 6566L)
    public static SubLObject ar_within_usage_thresholdP(final SubLObject relation, final SubLObject threshold) {
        if (applicable_relations.NIL == threshold) {
            return (SubLObject)applicable_relations.T;
        }
        if (applicable_relations.NIL != fort_types_interface.predicateP(relation)) {
            return Numbers.numGE(kb_indexing.num_predicate_extent_index(relation, (SubLObject)applicable_relations.UNPROVIDED), threshold);
        }
        return Numbers.numGE(kb_indexing.num_index(relation), threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 6815L)
    public static SubLObject applicable_relations_all_isa(final SubLObject v_term, final SubLObject mt) {
        SubLObject collections = (SubLObject)applicable_relations.NIL;
        if (applicable_relations.NIL != forts.fort_p(v_term)) {
            collections = isa.all_isa(v_term, mt, (SubLObject)applicable_relations.UNPROVIDED);
        }
        else if (applicable_relations.NIL != cycl_grammar.cycl_nat_p(v_term)) {
            collections = isa.all_isa(v_term, mt, (SubLObject)applicable_relations.UNPROVIDED);
        }
        else {
            collections = defns.all_defn_admits(v_term, mt);
        }
        return cardinality_estimates.sort_by_generality_estimate(collections, (SubLObject)applicable_relations.$kw14$ASCENDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 7166L)
    public static SubLObject applicable_relations_all_genls_set(final SubLObject v_term, final SubLObject mt) {
        SubLObject collections = (SubLObject)applicable_relations.NIL;
        if (applicable_relations.NIL != fort_types_interface.isa_collectionP(v_term, mt)) {
            collections = genls.all_genls(v_term, mt, (SubLObject)applicable_relations.UNPROVIDED);
        }
        return set_utilities.construct_set_from_list(collections, Symbols.symbol_function((SubLObject)applicable_relations.EQ), (SubLObject)applicable_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 7397L)
    public static SubLObject applicable_relations_all_quoted_isa_set(final SubLObject v_term, final SubLObject mt) {
        SubLObject collections = (SubLObject)applicable_relations.NIL;
        if (applicable_relations.NIL != forts.fort_p(v_term)) {
            collections = isa.all_quoted_isa(v_term, mt, (SubLObject)applicable_relations.UNPROVIDED);
        }
        else if (applicable_relations.NIL != cycl_grammar.cycl_nat_p(v_term)) {
            collections = isa.all_quoted_isa(v_term, mt, (SubLObject)applicable_relations.UNPROVIDED);
        }
        else {
            collections = defns.all_quoted_defn_admits(v_term, mt);
        }
        return set_utilities.construct_set_from_list(collections, Symbols.symbol_function((SubLObject)applicable_relations.EQ), (SubLObject)applicable_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 7769L)
    public static SubLObject applicable_predicates_for_terms(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        assert applicable_relations.NIL != Types.consp(terms) : terms;
        SubLObject v_term = (SubLObject)applicable_relations.NIL;
        SubLObject other_terms = (SubLObject)applicable_relations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(terms, terms, (SubLObject)applicable_relations.$list16);
        v_term = terms.first();
        final SubLObject current = other_terms = terms.rest();
        SubLObject result = applicable_predicates(v_term, mt, v_properties);
        SubLObject v_keyhash = keyhash.new_keyhash(Sequences.length(result), Symbols.symbol_function((SubLObject)applicable_relations.EQ));
        SubLObject cdolist_list_var = other_terms;
        SubLObject other_term = (SubLObject)applicable_relations.NIL;
        other_term = cdolist_list_var.first();
        while (applicable_relations.NIL != cdolist_list_var) {
            final SubLObject predicates = applicable_predicates(other_term, mt, v_properties);
            v_keyhash = keyhash_refill(v_keyhash, predicates);
            result = Sequences.delete(v_keyhash, result, Symbols.symbol_function((SubLObject)applicable_relations.$sym17$NOT_KEYHASH_KEY_P), (SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            other_term = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 8560L)
    public static SubLObject suggest_gafs_for_terms(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        final SubLObject candidate_predicates = possible_gaf_predicates_for_terms(terms, mt, v_properties);
        final SubLObject max_number = conses_high.getf(v_properties, (SubLObject)applicable_relations.$kw18$MAX_NUMBER, (SubLObject)applicable_relations.NIL);
        return suggest_gafs_for_terms_using_predicates(terms, candidate_predicates, mt, max_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 9212L)
    public static SubLObject suggest_gafs_for_terms_using_predicates(final SubLObject terms, final SubLObject predicates, SubLObject mt, SubLObject max_number) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (max_number == applicable_relations.UNPROVIDED) {
            max_number = (SubLObject)applicable_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_candidate_gafs = (SubLObject)applicable_relations.NIL;
        SubLObject total = (SubLObject)applicable_relations.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)applicable_relations.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$24 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (applicable_relations.NIL == wff_macros.within_wffP()) {
                        wff.reset_wff_state();
                    }
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$25 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)applicable_relations.TWELVE_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)applicable_relations.T, thread);
                        final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$27 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$28 = utilities_macros.$progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_note$.bind((SubLObject)applicable_relations.$str19$Considering_predicates, thread);
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_total$.bind(Sequences.length(predicates), thread);
                            utilities_macros.$progress_sofar$.bind((SubLObject)applicable_relations.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_index$.bind((SubLObject)applicable_relations.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)applicable_relations.NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)applicable_relations.T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                            try {
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                SubLObject csome_list_var = predicates;
                                SubLObject predicate = (SubLObject)applicable_relations.NIL;
                                predicate = csome_list_var.first();
                                while (applicable_relations.NIL != csome_list_var) {
                                    if (applicable_relations.NIL == doneP) {
                                        final SubLObject candidate_gafs = suggest_gafs_for_terms_using_predicate(terms, predicate, mt);
                                        total = Numbers.add(total, Sequences.length(candidate_gafs));
                                        if (applicable_relations.NIL != max_number) {
                                            doneP = (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL != max_number && total.numGE(max_number));
                                        }
                                        all_candidate_gafs = conses_high.nreconc(candidate_gafs, all_candidate_gafs);
                                    }
                                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)applicable_relations.ONE_INTEGER), thread);
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    predicate = csome_list_var.first();
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)applicable_relations.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    utilities_macros.noting_percent_progress_postamble();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                }
                            }
                        }
                        finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_total$.rebind(_prev_bind_2_$28, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$27, thread);
                            utilities_macros.$progress_note$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)applicable_relations.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$24, thread);
            }
        }
        finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
        }
        all_candidate_gafs = Sequences.nreverse(all_candidate_gafs);
        if (applicable_relations.NIL != max_number) {
            all_candidate_gafs = list_utilities.first_n(max_number, all_candidate_gafs);
        }
        return all_candidate_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 10174L)
    public static SubLObject suggest_gafs_for_terms_using_predicate(final SubLObject terms, final SubLObject predicate, SubLObject mt) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        SubLObject candidate_gafs = (SubLObject)applicable_relations.NIL;
        SubLObject cdolist_list_var = list_utilities.permute_list(terms, (SubLObject)applicable_relations.UNPROVIDED);
        SubLObject candidate_args = (SubLObject)applicable_relations.NIL;
        candidate_args = cdolist_list_var.first();
        while (applicable_relations.NIL != cdolist_list_var) {
            final SubLObject candidate_gaf = el_utilities.make_formula(predicate, candidate_args, (SubLObject)applicable_relations.UNPROVIDED);
            if (applicable_relations.NIL != wff.el_wffP(candidate_gaf, mt, (SubLObject)applicable_relations.UNPROVIDED)) {
                candidate_gafs = (SubLObject)ConsesLow.cons(candidate_gaf, candidate_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_args = cdolist_list_var.first();
        }
        return Sequences.nreverse(candidate_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 10628L)
    public static SubLObject possible_gaf_predicates_for_terms(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        final SubLObject candidate_predicates = applicable_predicates_for_terms(terms, mt, v_properties);
        final SubLObject call_arity = Sequences.length(terms);
        SubLObject predicates = (SubLObject)applicable_relations.NIL;
        SubLObject cdolist_list_var = candidate_predicates;
        SubLObject predicate = (SubLObject)applicable_relations.NIL;
        predicate = cdolist_list_var.first();
        while (applicable_relations.NIL != cdolist_list_var) {
            if (arity.arity(predicate).eql(call_arity)) {
                predicates = (SubLObject)ConsesLow.cons(predicate, predicates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        predicates = sort_predicates_for_gaf_suggestion(predicates);
        return predicates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 11160L)
    public static SubLObject new_possible_gaf_predicates_iterator(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        final SubLObject candidate_predicates = possible_gaf_predicates_for_terms(terms, mt, v_properties);
        return iteration.new_list_iterator(candidate_predicates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 11603L)
    public static SubLObject new_suggested_gafs_for_terms_iterator(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == applicable_relations.UNPROVIDED) {
            mt = (SubLObject)applicable_relations.NIL;
        }
        if (v_properties == applicable_relations.UNPROVIDED) {
            v_properties = (SubLObject)applicable_relations.NIL;
        }
        return iteration.new_iterator(make_suggested_gafs_for_terms_iterator_state(terms, mt, v_properties), (SubLObject)applicable_relations.$sym21$SUGGESTED_GAFS_FOR_TERMS_ITERATOR_DONE_P, (SubLObject)applicable_relations.$sym22$SUGGESTED_GAFS_FOR_TERMS_ITERATOR_NEXT, (SubLObject)applicable_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 11876L)
    public static SubLObject make_suggested_gafs_for_terms_iterator_state(final SubLObject terms, final SubLObject mt, final SubLObject v_properties) {
        final SubLObject candidate_gafs = queues.create_queue((SubLObject)applicable_relations.UNPROVIDED);
        final SubLObject candidate_predicate_iterator = new_possible_gaf_predicates_iterator(terms, mt, v_properties);
        final SubLObject total = (SubLObject)applicable_relations.ZERO_INTEGER;
        final SubLObject max_number = conses_high.getf(v_properties, (SubLObject)applicable_relations.$kw18$MAX_NUMBER, (SubLObject)applicable_relations.NIL);
        final SubLObject v_memoization_state = memoization_state.new_memoization_state((SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED);
        final SubLObject sbhl_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)applicable_relations.TWELVE_INTEGER);
        final SubLObject mt_info = mt_relevance_macros.mt_info(mt);
        final SubLObject state = (SubLObject)ConsesLow.list(candidate_gafs, candidate_predicate_iterator, total, max_number, v_memoization_state, sbhl_resource, terms, mt_info);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 12474L)
    public static SubLObject suggested_gafs_for_terms_iterator_done_p(final SubLObject state) {
        SubLObject candidate_gafs = (SubLObject)applicable_relations.NIL;
        SubLObject candidate_predicate_iterator = (SubLObject)applicable_relations.NIL;
        SubLObject total = (SubLObject)applicable_relations.NIL;
        SubLObject max_number = (SubLObject)applicable_relations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)applicable_relations.$list23);
        candidate_gafs = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list23);
        candidate_predicate_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list23);
        total = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list23);
        max_number = current.first();
        final SubLObject resources;
        current = (resources = current.rest());
        return (SubLObject)SubLObjectFactory.makeBoolean((applicable_relations.NIL != queues.queue_empty_p(candidate_gafs) && applicable_relations.NIL != iteration.iteration_done(candidate_predicate_iterator)) || (applicable_relations.NIL != max_number && total.numGE(max_number)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 12826L)
    public static SubLObject suggested_gafs_for_terms_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidate_gafs = (SubLObject)applicable_relations.NIL;
        SubLObject candidate_predicate_iterator = (SubLObject)applicable_relations.NIL;
        SubLObject total = (SubLObject)applicable_relations.NIL;
        SubLObject max_number = (SubLObject)applicable_relations.NIL;
        SubLObject v_memoization_state = (SubLObject)applicable_relations.NIL;
        SubLObject sbhl_resource = (SubLObject)applicable_relations.NIL;
        SubLObject terms = (SubLObject)applicable_relations.NIL;
        SubLObject mt_info = (SubLObject)applicable_relations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)applicable_relations.$list24);
        candidate_gafs = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        candidate_predicate_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        total = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        max_number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        v_memoization_state = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        sbhl_resource = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        terms = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)applicable_relations.$list24);
        mt_info = current.first();
        current = current.rest();
        if (applicable_relations.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)applicable_relations.$list24);
            return (SubLObject)applicable_relations.NIL;
        }
        while (applicable_relations.NIL != queues.queue_empty_p(candidate_gafs) && applicable_relations.NIL == iteration.iteration_done(candidate_predicate_iterator)) {
            final SubLObject predicate = iteration.iteration_next(candidate_predicate_iterator);
            final SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
            try {
                wff_vars.$wff_memoization_state$.bind(v_memoization_state, thread);
                final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$31 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        if (applicable_relations.NIL == wff_macros.within_wffP()) {
                            wff.reset_wff_state();
                        }
                        final SubLObject _prev_bind_0_$32 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)applicable_relations.T, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                            try {
                                if (applicable_relations.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)applicable_relations.$sym25$RELEVANT_MT_IS_EVERYTHING)) {
                                    final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$34 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)applicable_relations.$sym25$RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind(applicable_relations.$const26$EverythingPSC, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, (SubLObject)applicable_relations.UNPROVIDED);
                                        SubLObject gaf = (SubLObject)applicable_relations.NIL;
                                        gaf = cdolist_list_var.first();
                                        while (applicable_relations.NIL != cdolist_list_var) {
                                            queues.enqueue(gaf, candidate_gafs);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$34, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$33, thread);
                                    }
                                }
                                else if (applicable_relations.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)applicable_relations.$sym27$RELEVANT_MT_IS_ANY_MT)) {
                                    final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)applicable_relations.$sym27$RELEVANT_MT_IS_ANY_MT, thread);
                                        mt_relevance_macros.$mt$.bind(applicable_relations.$const28$InferencePSC, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, (SubLObject)applicable_relations.UNPROVIDED);
                                        SubLObject gaf = (SubLObject)applicable_relations.NIL;
                                        gaf = cdolist_list_var.first();
                                        while (applicable_relations.NIL != cdolist_list_var) {
                                            queues.enqueue(gaf, candidate_gafs);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                                else if (applicable_relations.NIL != hlmt.mt_union_naut_p(mt_info)) {
                                    final SubLObject _prev_bind_0_$35 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$36 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)applicable_relations.$sym29$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, (SubLObject)applicable_relations.UNPROVIDED);
                                        SubLObject gaf = (SubLObject)applicable_relations.NIL;
                                        gaf = cdolist_list_var.first();
                                        while (applicable_relations.NIL != cdolist_list_var) {
                                            queues.enqueue(gaf, candidate_gafs);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$36, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$35, thread);
                                    }
                                }
                                else {
                                    final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$37 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)applicable_relations.$sym30$RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, (SubLObject)applicable_relations.UNPROVIDED);
                                        SubLObject gaf = (SubLObject)applicable_relations.NIL;
                                        gaf = cdolist_list_var.first();
                                        while (applicable_relations.NIL != cdolist_list_var) {
                                            queues.enqueue(gaf, candidate_gafs);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$37, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)applicable_relations.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)applicable_relations.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$31, thread);
                }
            }
            finally {
                wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        if (applicable_relations.NIL == queues.queue_empty_p(candidate_gafs)) {
            final SubLObject next = queues.dequeue(candidate_gafs);
            ConsesLow.set_nth((SubLObject)applicable_relations.TWO_INTEGER, state, Numbers.add(ConsesLow.nth((SubLObject)applicable_relations.TWO_INTEGER, state), (SubLObject)applicable_relations.ONE_INTEGER));
            return Values.values(next, state, (SubLObject)applicable_relations.NIL);
        }
        return Values.values((SubLObject)applicable_relations.NIL, state, (SubLObject)applicable_relations.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 13718L)
    public static SubLObject sort_predicates_for_gaf_suggestion(final SubLObject predicates) {
        return Sort.sort(predicates, Symbols.symbol_function((SubLObject)applicable_relations.$sym31$PREDICATE_BETTER_FOR_GAF_SUGGESTION_), (SubLObject)applicable_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 14124L)
    public static SubLObject predicate_better_for_gaf_suggestionP(final SubLObject pred1, final SubLObject pred2) {
        return Numbers.numL(relationship_generality_estimates.relation_generality_estimate(pred1), relationship_generality_estimates.relation_generality_estimate(pred2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 14372L)
    public static SubLObject predicate_gaf_suggestion_heuristic(final SubLObject predicate) {
        return Numbers.subtract(relationship_generality_estimates.relation_generality_estimate(predicate), predicate_usage_estimate(predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 14704L)
    public static SubLObject predicate_usage_estimate(final SubLObject predicate) {
        if (applicable_relations.NIL == forts.fort_p(predicate)) {
            return (SubLObject)applicable_relations.ZERO_INTEGER;
        }
        return predicate_usage_estimate_cached(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15068L)
    public static SubLObject clear_predicate_usage_estimate_cached() {
        final SubLObject cs = applicable_relations.$predicate_usage_estimate_cached_caching_state$.getGlobalValue();
        if (applicable_relations.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)applicable_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15068L)
    public static SubLObject remove_predicate_usage_estimate_cached(final SubLObject predicate) {
        return memoization_state.caching_state_remove_function_results_with_args(applicable_relations.$predicate_usage_estimate_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate), (SubLObject)applicable_relations.UNPROVIDED, (SubLObject)applicable_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15068L)
    public static SubLObject predicate_usage_estimate_cached_internal(final SubLObject predicate) {
        final SubLObject count = kb_indexing.num_predicate_extent_index(predicate, (SubLObject)applicable_relations.UNPROVIDED);
        if (!count.isPositive()) {
            return (SubLObject)applicable_relations.ZERO_INTEGER;
        }
        return Values.values(Numbers.truncate(Numbers.multiply((SubLObject)applicable_relations.$int33$1000, Numbers.log(count, (SubLObject)applicable_relations.TWO_INTEGER)), (SubLObject)applicable_relations.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15068L)
    public static SubLObject predicate_usage_estimate_cached(final SubLObject predicate) {
        SubLObject caching_state = applicable_relations.$predicate_usage_estimate_cached_caching_state$.getGlobalValue();
        if (applicable_relations.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)applicable_relations.$sym32$PREDICATE_USAGE_ESTIMATE_CACHED, (SubLObject)applicable_relations.$sym34$_PREDICATE_USAGE_ESTIMATE_CACHED_CACHING_STATE_, (SubLObject)applicable_relations.NIL, (SubLObject)applicable_relations.EQ, (SubLObject)applicable_relations.ONE_INTEGER, (SubLObject)applicable_relations.$int35$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predicate_usage_estimate_cached_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)applicable_relations.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15328L)
    public static SubLObject keyhash_refill(final SubLObject v_keyhash, final SubLObject objects) {
        assert applicable_relations.NIL != keyhash.keyhash_p(v_keyhash) : v_keyhash;
        keyhash.clrkeyhash(v_keyhash);
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)applicable_relations.NIL;
        v_object = cdolist_list_var.first();
        while (applicable_relations.NIL != cdolist_list_var) {
            keyhash.setkeyhash(v_object, v_keyhash);
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return v_keyhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/applicable-relations.lisp", position = 15737L)
    public static SubLObject not_keyhash_key_p(final SubLObject v_keyhash, final SubLObject key) {
        return (SubLObject)SubLObjectFactory.makeBoolean(applicable_relations.NIL == keyhash.getkeyhash(key, v_keyhash));
    }
    
    public static SubLObject declare_applicable_relations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_relations", "APPLICABLE-RELATIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_predicates", "APPLICABLE-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_functions", "APPLICABLE-FUNCTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "ar_below_horizonP", "AR-BELOW-HORIZON?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "ar_within_domainP", "AR-WITHIN-DOMAIN?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "ar_within_usage_thresholdP", "AR-WITHIN-USAGE-THRESHOLD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_relations_all_isa", "APPLICABLE-RELATIONS-ALL-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_relations_all_genls_set", "APPLICABLE-RELATIONS-ALL-GENLS-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_relations_all_quoted_isa_set", "APPLICABLE-RELATIONS-ALL-QUOTED-ISA-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "applicable_predicates_for_terms", "APPLICABLE-PREDICATES-FOR-TERMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "suggest_gafs_for_terms", "SUGGEST-GAFS-FOR-TERMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "suggest_gafs_for_terms_using_predicates", "SUGGEST-GAFS-FOR-TERMS-USING-PREDICATES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "suggest_gafs_for_terms_using_predicate", "SUGGEST-GAFS-FOR-TERMS-USING-PREDICATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "possible_gaf_predicates_for_terms", "POSSIBLE-GAF-PREDICATES-FOR-TERMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "new_possible_gaf_predicates_iterator", "NEW-POSSIBLE-GAF-PREDICATES-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "new_suggested_gafs_for_terms_iterator", "NEW-SUGGESTED-GAFS-FOR-TERMS-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "make_suggested_gafs_for_terms_iterator_state", "MAKE-SUGGESTED-GAFS-FOR-TERMS-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "suggested_gafs_for_terms_iterator_done_p", "SUGGESTED-GAFS-FOR-TERMS-ITERATOR-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "suggested_gafs_for_terms_iterator_next", "SUGGESTED-GAFS-FOR-TERMS-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "sort_predicates_for_gaf_suggestion", "SORT-PREDICATES-FOR-GAF-SUGGESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "predicate_better_for_gaf_suggestionP", "PREDICATE-BETTER-FOR-GAF-SUGGESTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "predicate_gaf_suggestion_heuristic", "PREDICATE-GAF-SUGGESTION-HEURISTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "predicate_usage_estimate", "PREDICATE-USAGE-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "clear_predicate_usage_estimate_cached", "CLEAR-PREDICATE-USAGE-ESTIMATE-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "remove_predicate_usage_estimate_cached", "REMOVE-PREDICATE-USAGE-ESTIMATE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "predicate_usage_estimate_cached_internal", "PREDICATE-USAGE-ESTIMATE-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "predicate_usage_estimate_cached", "PREDICATE-USAGE-ESTIMATE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "keyhash_refill", "KEYHASH-REFILL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.applicable_relations", "not_keyhash_key_p", "NOT-KEYHASH-KEY-P", 2, 0, false);
        return (SubLObject)applicable_relations.NIL;
    }
    
    public static SubLObject init_applicable_relations_file() {
        applicable_relations.$predicate_usage_estimate_cached_caching_state$ = SubLFiles.deflexical("*PREDICATE-USAGE-ESTIMATE-CACHED-CACHING-STATE*", (SubLObject)applicable_relations.NIL);
        return (SubLObject)applicable_relations.NIL;
    }
    
    public static SubLObject setup_applicable_relations_file() {
        memoization_state.note_globally_cached_function((SubLObject)applicable_relations.$sym32$PREDICATE_USAGE_ESTIMATE_CACHED);
        return (SubLObject)applicable_relations.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_applicable_relations_file();
    }
    
    @Override
	public void initializeVariables() {
        init_applicable_relations_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_applicable_relations_file();
    }
    
    static {
        me = (SubLFile)new applicable_relations();
        applicable_relations.$predicate_usage_estimate_cached_caching_state$ = null;
        $kw0$DOMAIN = SubLObjectFactory.makeKeyword("DOMAIN");
        $kw1$ISA_HORIZON = SubLObjectFactory.makeKeyword("ISA-HORIZON");
        $kw2$GENLS_HORIZON = SubLObjectFactory.makeKeyword("GENLS-HORIZON");
        $kw3$USAGE_THRESHOLD = SubLObjectFactory.makeKeyword("USAGE-THRESHOLD");
        $const4$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $kw5$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw6$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const7$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $kw8$ARG_GENL = SubLObjectFactory.makeKeyword("ARG-GENL");
        $const9$argQuotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argQuotedIsa"));
        $kw10$ARG_QUOTED_ISA = SubLObjectFactory.makeKeyword("ARG-QUOTED-ISA");
        $kw11$ARG_GENL_HORIZON = SubLObjectFactory.makeKeyword("ARG-GENL-HORIZON");
        $const12$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $const13$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $kw14$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $sym15$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $list16 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-TERMS"));
        $sym17$NOT_KEYHASH_KEY_P = SubLObjectFactory.makeSymbol("NOT-KEYHASH-KEY-P");
        $kw18$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $str19$Considering_predicates = SubLObjectFactory.makeString("Considering predicates");
        $str20$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym21$SUGGESTED_GAFS_FOR_TERMS_ITERATOR_DONE_P = SubLObjectFactory.makeSymbol("SUGGESTED-GAFS-FOR-TERMS-ITERATOR-DONE-P");
        $sym22$SUGGESTED_GAFS_FOR_TERMS_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SUGGESTED-GAFS-FOR-TERMS-ITERATOR-NEXT");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-PREDICATE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("RESOURCES"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-PREDICATE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-RESOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("MT-INFO"));
        $sym25$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const26$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym27$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const28$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym29$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym30$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym31$PREDICATE_BETTER_FOR_GAF_SUGGESTION_ = SubLObjectFactory.makeSymbol("PREDICATE-BETTER-FOR-GAF-SUGGESTION?");
        $sym32$PREDICATE_USAGE_ESTIMATE_CACHED = SubLObjectFactory.makeSymbol("PREDICATE-USAGE-ESTIMATE-CACHED");
        $int33$1000 = SubLObjectFactory.makeInteger(1000);
        $sym34$_PREDICATE_USAGE_ESTIMATE_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDICATE-USAGE-ESTIMATE-CACHED-CACHING-STATE*");
        $int35$100 = SubLObjectFactory.makeInteger(100);
        $sym36$KEYHASH_P = SubLObjectFactory.makeSymbol("KEYHASH-P");
    }
}

/*

	Total time: 708 ms
	
*/