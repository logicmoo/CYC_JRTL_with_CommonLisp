package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_genls extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls";
    public static final String myFingerPrint = "5d2be9f0058338685071d2a13a2a9969d572416321d625912667306a205b8e4f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2844L)
    private static SubLSymbol $default_superset_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 5332L)
    private static SubLSymbol $default_nat_all_genls_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6406L)
    private static SubLSymbol $all_specs_lazy_iteration_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 7722L)
    private static SubLSymbol $default_not_superset_cost$;
    private static final SubLObject $const0$genls;
    private static final SubLSymbol $kw1$REMOVAL_BACKCHAIN_REQUIRED_PRUNE;
    private static final SubLSymbol $kw2$POS;
    private static final SubLSymbol $kw3$NEG;
    private static final SubLSymbol $kw4$ALL_SPECS_OF_FORT_POS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$ALL_SPECS_OF_NON_FORT_POS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$ALL_GENLS_POS;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $kw11$GENLS;
    private static final SubLSymbol $kw12$REMOVAL_SUPERSET;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$REMOVAL_NAT_GENLS;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$REMOVAL_ALL_GENLS;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_NAT_ALL_GENLS;
    private static final SubLList $list19;
    private static final SubLInteger $int20$550;
    private static final SubLSymbol $kw21$REMOVAL_ALL_SPECS;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$MINIMIZE;
    private static final SubLSymbol $kw24$REMOVAL_NOT_SUPERSET;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$REMOVAL_GENLS_BETWEEN;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$BINARY_CLAUSE_P;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$FORT_P;
    private static final SubLSymbol $kw31$COMPLETE;
    private static final SubLSymbol $kw32$INCOMPLETE;
    private static final SubLSymbol $sym33$REMOVAL_GENLS_BETWEEN_COMPLETENESS;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK;
    private static final SubLList $list39;
    private static final SubLSymbol $kw40$REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$QUERY;
    private static final SubLObject $const43$unknownSentence;
    private static final SubLObject $const44$and;
    private static final SubLObject $const45$subsetOf;
    private static final SubLObject $const46$genlsDown;
    private static final SubLSymbol $kw47$REMOVAL_GENLS_DOWN_ARG2_BOUND;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST;
    private static final SubLSymbol $sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS;
    private static final SubLSymbol $kw51$TRUE_DEF;
    private static final SubLSymbol $sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND;
    private static final SubLList $list53;
    private static final SubLSymbol $kw54$REMOVAL_GENLS_DOWN_ARG2_UNIFY;
    private static final SubLList $list55;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 1456L)
    public static SubLObject inference_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == removal_modules_genls.UNPROVIDED) {
            mt = (SubLObject)removal_modules_genls.NIL;
        }
        if (tv == removal_modules_genls.UNPROVIDED) {
            tv = (SubLObject)removal_modules_genls.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genls.NIL != inference_trampolines.inference_collectionP(spec, mt) && (removal_modules_genls.NIL != equals.equalsP(spec, genl, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED) || (removal_modules_genls.NIL != inference_trampolines.inference_collectionP(genl, mt) && removal_modules_genls.NIL != genls.genlP(spec, genl, mt, tv))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 1819L)
    public static SubLObject inference_not_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == removal_modules_genls.UNPROVIDED) {
            mt = (SubLObject)removal_modules_genls.NIL;
        }
        if (tv == removal_modules_genls.UNPROVIDED) {
            tv = (SubLObject)removal_modules_genls.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_genls.NIL == equals.equalsP(spec, genl, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED) && removal_modules_genls.NIL != inference_trampolines.inference_collectionP(spec, mt) && removal_modules_genls.NIL != inference_trampolines.inference_collectionP(genl, mt) && removal_modules_genls.NIL != genls.not_genlP(spec, genl, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2098L)
    public static SubLObject inference_all_genls(final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == removal_modules_genls.UNPROVIDED) {
            mt = (SubLObject)removal_modules_genls.NIL;
        }
        if (tv == removal_modules_genls.UNPROVIDED) {
            tv = (SubLObject)removal_modules_genls.NIL;
        }
        if (removal_modules_genls.NIL != inference_trampolines.inference_collectionP(spec, mt)) {
            return Sort.sort(genls.all_genls(spec, mt, tv), (SubLObject)removal_modules_genls.$sym10$GENERALITY_ESTIMATE_, (SubLObject)removal_modules_genls.UNPROVIDED);
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2263L)
    public static SubLObject inference_all_specs(final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == removal_modules_genls.UNPROVIDED) {
            mt = (SubLObject)removal_modules_genls.NIL;
        }
        if (tv == removal_modules_genls.UNPROVIDED) {
            tv = (SubLObject)removal_modules_genls.NIL;
        }
        if (removal_modules_genls.NIL != inference_trampolines.inference_collectionP(genl, mt)) {
            return genls.all_specs(genl, mt, tv);
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2513L)
    public static SubLObject inference_genls_between(final SubLObject lower_bound_col, final SubLObject upper_bound_col, SubLObject mt) {
        if (mt == removal_modules_genls.UNPROVIDED) {
            mt = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_genls.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (removal_modules_genls.NIL != inference_trampolines.inference_collectionP(lower_bound_col, (SubLObject)removal_modules_genls.UNPROVIDED) && removal_modules_genls.NIL != inference_trampolines.inference_collectionP(upper_bound_col, (SubLObject)removal_modules_genls.UNPROVIDED)) {
                result = genls.all_genls_wrt(lower_bound_col, upper_bound_col, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2987L)
    public static SubLObject removal_superset_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        if (removal_modules_genls.NIL != inference_genlP(spec, genl, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genls.$kw11$GENLS, asent, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED), (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 3593L)
    public static SubLObject removal_nat_genls_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        return removal_superset_expand(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 4217L)
    public static SubLObject removal_all_genls_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 4422L)
    public static SubLObject removal_all_genls_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject collections = cdolist_list_var = inference_all_genls(subset, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
        SubLObject collection = (SubLObject)removal_modules_genls.NIL;
        collection = cdolist_list_var.first();
        while (removal_modules_genls.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, (SubLObject)removal_modules_genls.T, (SubLObject)removal_modules_genls.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_genls.NIL != v_bindings) {
                final SubLObject unify_arg2 = bindings.subst_bindings(v_bindings, arg2);
                final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_genls.$const0$genls, subset, unify_arg2);
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genls.$kw11$GENLS, formula, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 5498L)
    public static SubLObject removal_nat_all_genls_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        return removal_all_genls_expand(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6078L)
    public static SubLObject removal_all_specs_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, (SubLObject)removal_modules_genls.TWO_INTEGER, removal_modules_genls.$const0$genls));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6564L)
    public static SubLObject removal_all_specs_iterator(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cardinality_estimates.spec_cardinality(collection).numG(removal_modules_genls.$all_specs_lazy_iteration_threshold$.getDynamicValue(thread))) {
            return kb_iterators.new_specs_iterator(collection);
        }
        return iteration.new_list_iterator(inference_all_specs(collection, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 7860L)
    public static SubLObject removal_not_superset_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
        if (removal_modules_genls.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_genls.NIL == inference_genlP(spec, genl, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genls.$kw23$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED), (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
        }
        else if (removal_modules_genls.NIL != inference_not_genlP(spec, genl, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_genls.$kw11$GENLS, cycl_utilities.negate(asent), (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED), (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 9651L)
    public static SubLObject removal_genls_between_applicability(final SubLObject contextualized_dnf_clause) {
        return removal_sbhl_between_applicability(contextualized_dnf_clause, removal_modules_genls.$const0$genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 10045L)
    public static SubLObject removal_genls_between_cost(final SubLObject contextualized_dnf_clause) {
        assert removal_modules_genls.NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) : contextualized_dnf_clause;
        SubLObject spec = (SubLObject)removal_modules_genls.NIL;
        SubLObject genl = (SubLObject)removal_modules_genls.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)removal_modules_genls.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (removal_modules_genls.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)removal_modules_genls.NIL;
            SubLObject asent = (SubLObject)removal_modules_genls.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list29);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list29);
            asent = current.first();
            current = current.rest();
            if (removal_modules_genls.NIL == current) {
                if (removal_modules_genls.NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED))) {
                    spec = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                }
                else {
                    genl = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genls.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        assert removal_modules_genls.NIL != forts.fort_p(spec) : spec;
        assert removal_modules_genls.NIL != forts.fort_p(genl) : genl;
        final SubLObject cardinality_diff = Numbers.subtract(cardinality_estimates.genl_cardinality(spec), cardinality_estimates.genl_cardinality(genl));
        return Numbers.max((SubLObject)removal_modules_genls.ZERO_INTEGER, number_utilities.f_1X(cardinality_diff));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 10680L)
    public static SubLObject removal_genls_between_completeness() {
        return (SubLObject)((removal_modules_genls.NIL != kb_accessors.complete_extent_enumerableP(removal_modules_genls.$const0$genls, (SubLObject)removal_modules_genls.UNPROVIDED)) ? removal_modules_genls.$kw31$COMPLETE : removal_modules_genls.$kw32$INCOMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 10818L)
    public static SubLObject removal_genls_between_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent0 = (SubLObject)removal_modules_genls.NIL;
        SubLObject contextualized_asent2 = (SubLObject)removal_modules_genls.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list34);
        contextualized_asent0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list34);
        contextualized_asent2 = current.first();
        current = current.rest();
        if (removal_modules_genls.NIL == current) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = contextualized_asent0;
            SubLObject mt0 = (SubLObject)removal_modules_genls.NIL;
            SubLObject asent0 = (SubLObject)removal_modules_genls.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_genls.$list35);
            mt0 = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_genls.$list35);
            asent0 = current_$2.first();
            current_$2 = current_$2.rest();
            if (removal_modules_genls.NIL == current_$2) {
                SubLObject current_$3;
                final SubLObject datum_$2 = current_$3 = contextualized_asent2;
                SubLObject mt2 = (SubLObject)removal_modules_genls.NIL;
                SubLObject asent2 = (SubLObject)removal_modules_genls.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)removal_modules_genls.$list36);
                mt2 = current_$3.first();
                current_$3 = current_$3.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)removal_modules_genls.$list36);
                asent2 = current_$3.first();
                current_$3 = current_$3.rest();
                if (removal_modules_genls.NIL == current_$3) {
                    if (mt0.equal(mt2)) {
                        thread.resetMultipleValues();
                        final SubLObject lower_bound_asent = removal_genls_between_categorize_asents(asent0, asent2);
                        final SubLObject upper_bound_asent = thread.secondMultipleValue();
                        final SubLObject lower_firstP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject lower_bound = cycl_utilities.atomic_sentence_arg1(lower_bound_asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                        final SubLObject variable = cycl_utilities.atomic_sentence_arg2(lower_bound_asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                        final SubLObject upper_bound = cycl_utilities.atomic_sentence_arg2(upper_bound_asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                        SubLObject cdolist_list_var = inference_genls_between(lower_bound, upper_bound, mt0);
                        SubLObject between_col = (SubLObject)removal_modules_genls.NIL;
                        between_col = cdolist_list_var.first();
                        while (removal_modules_genls.NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings = unification_utilities.term_unify(variable, between_col, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
                            final SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (removal_modules_genls.NIL != v_bindings) {
                                final SubLObject lower_support_formula = el_utilities.make_binary_formula(removal_modules_genls.$const0$genls, lower_bound, between_col);
                                final SubLObject upper_support_formula = el_utilities.make_binary_formula(removal_modules_genls.$const0$genls, between_col, upper_bound);
                                final SubLObject lower_support = arguments.make_hl_support((SubLObject)removal_modules_genls.$kw11$GENLS, lower_support_formula, mt0, (SubLObject)removal_modules_genls.UNPROVIDED);
                                final SubLObject upper_support = arguments.make_hl_support((SubLObject)removal_modules_genls.$kw11$GENLS, upper_support_formula, mt0, (SubLObject)removal_modules_genls.UNPROVIDED);
                                final SubLObject lower_supports = (SubLObject)ConsesLow.list(lower_support);
                                final SubLObject upper_supports = (SubLObject)ConsesLow.list(upper_support);
                                final SubLObject justifications = (SubLObject)((removal_modules_genls.NIL != lower_firstP) ? ConsesLow.list(lower_supports, upper_supports) : ConsesLow.list(upper_supports, lower_supports));
                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            between_col = cdolist_list_var.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$2, (SubLObject)removal_modules_genls.$list36);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)removal_modules_genls.$list35);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genls.$list34);
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 12378L)
    public static SubLObject removal_sbhl_between_applicability(final SubLObject contextualized_dnf_clause, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = (SubLObject)removal_modules_genls.NIL;
        thread.resetMultipleValues();
        final SubLObject pos_pred_indices_var_arg1 = find_pos_pred_indices_for_pred_between(contextualized_dnf_clause, predicate);
        final SubLObject pos_pred_indices_var_arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_genls.NIL != pos_pred_indices_var_arg1 && removal_modules_genls.NIL != pos_pred_indices_var_arg2) {
            final SubLObject var2_index = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)removal_modules_genls.EQL), (SubLObject)removal_modules_genls.UNPROVIDED);
            SubLObject cdolist_list_var = pos_pred_indices_var_arg2;
            SubLObject pair = (SubLObject)removal_modules_genls.NIL;
            pair = cdolist_list_var.first();
            while (removal_modules_genls.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject index = (SubLObject)removal_modules_genls.NIL;
                SubLObject variable = (SubLObject)removal_modules_genls.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list37);
                index = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list37);
                variable = current.first();
                current = current.rest();
                if (removal_modules_genls.NIL == current) {
                    dictionary_utilities.dictionary_push(var2_index, variable, index);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genls.$list37);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
            cdolist_list_var = pos_pred_indices_var_arg1;
            pair = (SubLObject)removal_modules_genls.NIL;
            pair = cdolist_list_var.first();
            while (removal_modules_genls.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject index = (SubLObject)removal_modules_genls.NIL;
                SubLObject variable = (SubLObject)removal_modules_genls.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list37);
                index = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list37);
                variable = current.first();
                current = current.rest();
                if (removal_modules_genls.NIL == current) {
                    SubLObject cdolist_list_var_$5;
                    final SubLObject paired_indices = cdolist_list_var_$5 = dictionary.dictionary_lookup(var2_index, variable, (SubLObject)removal_modules_genls.UNPROVIDED);
                    SubLObject paired_index = (SubLObject)removal_modules_genls.NIL;
                    paired_index = cdolist_list_var_$5.first();
                    while (removal_modules_genls.NIL != cdolist_list_var_$5) {
                        final SubLObject subclause_spec = clause_utilities.new_subclause_spec((SubLObject)removal_modules_genls.NIL, (SubLObject)ConsesLow.list(index, paired_index));
                        subclause_specs = (SubLObject)ConsesLow.cons(subclause_spec, subclause_specs);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        paired_index = cdolist_list_var_$5.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genls.$list37);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(subclause_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 13647L)
    public static SubLObject find_pos_pred_indices_for_pred_between(final SubLObject contextualized_dnf_clause, final SubLObject predicate) {
        SubLObject pos_pred_indices_var_arg1 = (SubLObject)removal_modules_genls.NIL;
        SubLObject pos_pred_indices_var_arg2 = (SubLObject)removal_modules_genls.NIL;
        SubLObject index = (SubLObject)removal_modules_genls.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)removal_modules_genls.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (removal_modules_genls.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)removal_modules_genls.NIL;
            SubLObject asent = (SubLObject)removal_modules_genls.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list29);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_genls.$list29);
            asent = current.first();
            current = current.rest();
            if (removal_modules_genls.NIL == current) {
                if (removal_modules_genls.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_genls.UNPROVIDED);
                    if (removal_modules_genls.NIL != variables.variable_p(arg1) && removal_modules_genls.NIL != forts.fort_p(arg2)) {
                        pos_pred_indices_var_arg1 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(index, arg1), pos_pred_indices_var_arg1);
                    }
                    else if (removal_modules_genls.NIL != forts.fort_p(arg1) && removal_modules_genls.NIL != variables.variable_p(arg2)) {
                        pos_pred_indices_var_arg2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(index, arg2), pos_pred_indices_var_arg2);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_genls.$list29);
            }
            index = Numbers.add(index, (SubLObject)removal_modules_genls.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        pos_pred_indices_var_arg1 = Sequences.nreverse(pos_pred_indices_var_arg1);
        pos_pred_indices_var_arg2 = Sequences.nreverse(pos_pred_indices_var_arg2);
        return Values.values(pos_pred_indices_var_arg1, pos_pred_indices_var_arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 14574L)
    public static SubLObject removal_genls_between_categorize_asents(final SubLObject asent0, final SubLObject asent1) {
        if (removal_modules_genls.NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent0, (SubLObject)removal_modules_genls.UNPROVIDED))) {
            return Values.values(asent0, asent1, (SubLObject)removal_modules_genls.T);
        }
        return Values.values(asent1, asent0, (SubLObject)removal_modules_genls.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 16763L)
    public static SubLObject removal_genls_collection_subset_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = removal_genls_collection_subset_construct_query(asent);
        final SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_genls.UNPROVIDED);
        if (removal_modules_genls.NIL != recursive_results) {
            final SubLObject query_support = arguments.make_hl_support((SubLObject)removal_modules_genls.$kw42$QUERY, query, (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
            if (removal_modules_genls.NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                backward.removal_add_node(query_support, (SubLObject)removal_modules_genls.NIL, (SubLObject)removal_modules_genls.NIL);
            }
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 17229L)
    public static SubLObject removal_genls_collection_subset_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = removal_genls_collection_subset_construct_query(asent);
        final SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_genls.UNPROVIDED);
        if (removal_modules_genls.NIL == recursive_results) {
            final SubLObject query_support = arguments.make_hl_support((SubLObject)removal_modules_genls.$kw42$QUERY, (SubLObject)ConsesLow.list(removal_modules_genls.$const43$unknownSentence, query), (SubLObject)removal_modules_genls.UNPROVIDED, (SubLObject)removal_modules_genls.UNPROVIDED);
            backward.removal_add_node(query_support, (SubLObject)removal_modules_genls.NIL, (SubLObject)removal_modules_genls.NIL);
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 17659L)
    public static SubLObject removal_genls_collection_subset_construct_query(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_genls = el_utilities.unmake_binary_formula(asent);
        final SubLObject colsub_nat1 = thread.secondMultipleValue();
        final SubLObject colsub_nat2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject colsub_func1 = el_utilities.unmake_binary_formula(colsub_nat1);
        final SubLObject col1 = thread.secondMultipleValue();
        final SubLObject set1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject colsub_func2 = el_utilities.unmake_binary_formula(colsub_nat2);
        final SubLObject col2 = thread.secondMultipleValue();
        final SubLObject set2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(removal_modules_genls.$const44$and, (SubLObject)ConsesLow.list(removal_modules_genls.$const0$genls, col1, col2), (SubLObject)ConsesLow.list(removal_modules_genls.$const45$subsetOf, set1, set2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 19094L)
    public static SubLObject removal_genls_down_arg2_bound_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_genls.NIL != variables.fully_bound_p(asent)) {
            return (SubLObject)removal_modules_genls.ONE_INTEGER;
        }
        thread.resetMultipleValues();
        final SubLObject genls_asent = destructure_genls_down_asent(asent);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_utilities.literal_removal_cost(genls_asent, (SubLObject)removal_modules_genls.$kw2$POS, mt, (SubLObject)removal_modules_genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 19398L)
    public static SubLObject removal_genls_down_arg2_bound_completeness(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_genls.NIL != variables.fully_bound_p(asent)) {
            return (SubLObject)removal_modules_genls.$kw31$COMPLETE;
        }
        thread.resetMultipleValues();
        final SubLObject genls_asent = destructure_genls_down_asent(asent);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_utilities.literal_removal_completeness(genls_asent, (SubLObject)removal_modules_genls.$kw2$POS, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 19693L)
    public static SubLObject removal_genls_down_arg2_bound_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_genls.UNPROVIDED) {
            sense = (SubLObject)removal_modules_genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject genls_asent = destructure_genls_down_asent(asent);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var;
        final SubLObject bindings_list = cdolist_list_var = ask_utilities.inference_recursive_query_unique_bindings(genls_asent, mt, (SubLObject)removal_modules_genls.UNPROVIDED);
        SubLObject v_bindings = (SubLObject)removal_modules_genls.NIL;
        v_bindings = cdolist_list_var.first();
        while (removal_modules_genls.NIL != cdolist_list_var) {
            final SubLObject support_asent = bindings.apply_bindings(v_bindings, genls_asent);
            final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_genls.$kw42$QUERY, support_asent, mt, (SubLObject)removal_modules_genls.$kw51$TRUE_DEF);
            backward.removal_add_node(support, v_bindings, (SubLObject)removal_modules_genls.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 20232L)
    public static SubLObject destructure_genls_down_asent(final SubLObject asent) {
        SubLObject genls_down = (SubLObject)removal_modules_genls.NIL;
        SubLObject arg1 = (SubLObject)removal_modules_genls.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_genls.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(asent, asent, (SubLObject)removal_modules_genls.$list53);
        genls_down = asent.first();
        SubLObject current = asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, (SubLObject)removal_modules_genls.$list53);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, (SubLObject)removal_modules_genls.$list53);
        arg2 = current.first();
        current = current.rest();
        if (removal_modules_genls.NIL == current) {
            return Values.values(el_utilities.make_binary_formula(removal_modules_genls.$const0$genls, arg1, arg2), mt_relevance_macros.current_mt_relevance_mt());
        }
        cdestructuring_bind.cdestructuring_bind_error(asent, (SubLObject)removal_modules_genls.$list53);
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    public static SubLObject declare_removal_modules_genls_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "inference_genlP", "INFERENCE-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "inference_not_genlP", "INFERENCE-NOT-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "inference_all_genls", "INFERENCE-ALL-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "inference_all_specs", "INFERENCE-ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "inference_genls_between", "INFERENCE-GENLS-BETWEEN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_superset_expand", "REMOVAL-SUPERSET-EXPAND", 1, 1, false);
        new $removal_superset_expand$UnaryFunction();
        new $removal_superset_expand$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_nat_genls_expand", "REMOVAL-NAT-GENLS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_all_genls_cost", "REMOVAL-ALL-GENLS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_all_genls_expand", "REMOVAL-ALL-GENLS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_nat_all_genls_expand", "REMOVAL-NAT-ALL-GENLS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_all_specs_cost", "REMOVAL-ALL-SPECS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_all_specs_iterator", "REMOVAL-ALL-SPECS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_not_superset_expand", "REMOVAL-NOT-SUPERSET-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_between_applicability", "REMOVAL-GENLS-BETWEEN-APPLICABILITY", 1, 0, false);
        new $removal_genls_between_applicability$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_between_cost", "REMOVAL-GENLS-BETWEEN-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_between_completeness", "REMOVAL-GENLS-BETWEEN-COMPLETENESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_between_expand", "REMOVAL-GENLS-BETWEEN-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_sbhl_between_applicability", "REMOVAL-SBHL-BETWEEN-APPLICABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "find_pos_pred_indices_for_pred_between", "FIND-POS-PRED-INDICES-FOR-PRED-BETWEEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_between_categorize_asents", "REMOVAL-GENLS-BETWEEN-CATEGORIZE-ASENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_collection_subset_check_pos_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_collection_subset_check_neg_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_collection_subset_construct_query", "REMOVAL-GENLS-COLLECTION-SUBSET-CONSTRUCT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_down_arg2_bound_cost", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_down_arg2_bound_completeness", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "removal_genls_down_arg2_bound_expand", "REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls", "destructure_genls_down_asent", "DESTRUCTURE-GENLS-DOWN-ASENT", 1, 0, false);
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    public static SubLObject init_removal_modules_genls_file() {
        removal_modules_genls.$default_superset_cost$ = SubLFiles.defparameter("*DEFAULT-SUPERSET-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_genls.$default_nat_all_genls_cost$ = SubLFiles.defparameter("*DEFAULT-NAT-ALL-GENLS-COST*", control_vars.$average_all_genls_count$.getDynamicValue());
        removal_modules_genls.$all_specs_lazy_iteration_threshold$ = SubLFiles.defparameter("*ALL-SPECS-LAZY-ITERATION-THRESHOLD*", (SubLObject)removal_modules_genls.$int20$550);
        removal_modules_genls.$default_not_superset_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-SUPERSET-COST*", (SubLObject)removal_modules_genls.ONE_INTEGER);
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    public static SubLObject setup_removal_modules_genls_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_genls.$const0$genls);
        inference_modules.inference_removal_module_use_generic(removal_modules_genls.$const0$genls, (SubLObject)removal_modules_genls.$kw1$REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_genls.$kw2$POS, removal_modules_genls.$const0$genls);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_genls.$kw3$NEG, removal_modules_genls.$const0$genls);
        preference_modules.inference_preference_module((SubLObject)removal_modules_genls.$kw4$ALL_SPECS_OF_FORT_POS, (SubLObject)removal_modules_genls.$list5);
        preference_modules.inference_preference_module((SubLObject)removal_modules_genls.$kw6$ALL_SPECS_OF_NON_FORT_POS, (SubLObject)removal_modules_genls.$list7);
        preference_modules.inference_preference_module((SubLObject)removal_modules_genls.$kw8$ALL_GENLS_POS, (SubLObject)removal_modules_genls.$list9);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw12$REMOVAL_SUPERSET, (SubLObject)removal_modules_genls.$list13);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw14$REMOVAL_NAT_GENLS, (SubLObject)removal_modules_genls.$list15);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw16$REMOVAL_ALL_GENLS, (SubLObject)removal_modules_genls.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw18$REMOVAL_NAT_ALL_GENLS, (SubLObject)removal_modules_genls.$list19);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw21$REMOVAL_ALL_SPECS, (SubLObject)removal_modules_genls.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw24$REMOVAL_NOT_SUPERSET, (SubLObject)removal_modules_genls.$list25);
        inference_modules.inference_conjunctive_removal_module((SubLObject)removal_modules_genls.$kw26$REMOVAL_GENLS_BETWEEN, (SubLObject)removal_modules_genls.$list27);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_genls.$sym33$REMOVAL_GENLS_BETWEEN_COMPLETENESS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw38$REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, (SubLObject)removal_modules_genls.$list39);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw40$REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, (SubLObject)removal_modules_genls.$list41);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_genls.$const46$genlsDown);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_genls.$kw2$POS, removal_modules_genls.$const46$genlsDown);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw47$REMOVAL_GENLS_DOWN_ARG2_BOUND, (SubLObject)removal_modules_genls.$list48);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_genls.$sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_genls.$sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_genls.$sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND);
        inference_modules.inference_removal_module((SubLObject)removal_modules_genls.$kw54$REMOVAL_GENLS_DOWN_ARG2_UNIFY, (SubLObject)removal_modules_genls.$list55);
        return (SubLObject)removal_modules_genls.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_genls_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_genls_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_genls_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_genls();
        removal_modules_genls.$default_superset_cost$ = null;
        removal_modules_genls.$default_nat_all_genls_cost$ = null;
        removal_modules_genls.$all_specs_lazy_iteration_threshold$ = null;
        removal_modules_genls.$default_not_superset_cost$ = null;
        $const0$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw1$REMOVAL_BACKCHAIN_REQUIRED_PRUNE = SubLObjectFactory.makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $kw2$POS = SubLObjectFactory.makeKeyword("POS");
        $kw3$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw4$ALL_SPECS_OF_FORT_POS = SubLObjectFactory.makeKeyword("ALL-SPECS-OF-FORT-POS");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw6$ALL_SPECS_OF_NON_FORT_POS = SubLObjectFactory.makeKeyword("ALL-SPECS-OF-NON-FORT-POS");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw8$ALL_GENLS_POS = SubLObjectFactory.makeKeyword("ALL-GENLS-POS");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $sym10$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $kw11$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw12$REMOVAL_SUPERSET = SubLObjectFactory.makeKeyword("REMOVAL-SUPERSET");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SUPERSET-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SUPERSET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <fort> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls #$Dog #$Animal)") });
        $kw14$REMOVAL_NAT_GENLS = SubLObjectFactory.makeKeyword("REMOVAL-NAT-GENLS");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-SUPERSET-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-GENLS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (<fully-bound> . <fully-bound>) <fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls (#$JuvenileFn #$Cougar) #$Animal)") });
        $kw16$REMOVAL_ALL_GENLS = SubLObjectFactory.makeKeyword("REMOVAL-ALL-GENLS");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENLS-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-GENLS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <fort> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls #$Dog ?WHAT)") });
        $kw18$REMOVAL_NAT_ALL_GENLS = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ALL-GENLS");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-NAT-ALL-GENLS-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NAT-ALL-GENLS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (<fully-bound> . <fully-bound>) <not fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls (#$JuvenileFn #$Cougar) ?WHAT)") });
        $int20$550 = SubLObjectFactory.makeInteger(550);
        $kw21$REMOVAL_ALL_SPECS = SubLObjectFactory.makeKeyword("REMOVAL-ALL-SPECS");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPECS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-ALL-SPECS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLS"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <not fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls ?WHAT #$Animal)") });
        $kw23$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw24$REMOVAL_NOT_SUPERSET = SubLObjectFactory.makeKeyword("REMOVAL-NOT-SUPERSET");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*NEGATION-BY-FAILURE*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-SUPERSET-COST*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-NOT-SUPERSET-COST*")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-SUPERSET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genls <fort> <fully-bound>))\n    (#$not (#$genls (<fully-bound> . <fully-bound>) <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$genls #$Collection #$Individual))\n    (#$not (#$genls (#$JuvenileFn #$Cougar) #$Individual))") });
        $kw26$REMOVAL_GENLS_BETWEEN = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-BETWEEN");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-BETWEEN-APPLICABILITY"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-BETWEEN-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-BETWEEN-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and (#$genls <fort1> <varN>)\n           (#$genls <varN> <fort2>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and (#$genls #$Dog ?COL)\n           (#$genls ?COL #$Animal))") });
        $sym28$BINARY_CLAUSE_P = SubLObjectFactory.makeSymbol("BINARY-CLAUSE-P");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $sym30$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw31$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw32$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $sym33$REMOVAL_GENLS_BETWEEN_COMPLETENESS = SubLObjectFactory.makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT0"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT1"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT0"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT0"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT1"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"));
        $kw38$REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-POS-CHECK");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>))") });
        $kw40$REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-NEG-CHECK");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>)))") });
        $kw42$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const43$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const44$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const45$subsetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsetOf"));
        $const46$genlsDown = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown"));
        $kw47$REMOVAL_GENLS_DOWN_ARG2_BOUND = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-DOWN-ARG2-BOUND");
        $list48 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlsDown <fully-bound> <fully-bound>)\n(#$genlsDown <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlsDown #$Dog #$Animal)\n(#$genlsDown ?WHAT #$Dog)") });
        $sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST = SubLObjectFactory.makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST");
        $sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS = SubLObjectFactory.makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS");
        $kw51$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS-DOWN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $kw54$REMOVAL_GENLS_DOWN_ARG2_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-DOWN-ARG2-UNIFY");
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_genls.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("REFLEXIVE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlsDown <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlsDown #$Dog ?WHAT)") });
    }
    
    public static final class $removal_superset_expand$UnaryFunction extends UnaryFunction
    {
        public $removal_superset_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-SUPERSET-EXPAND"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genls.removal_superset_expand(arg1, (SubLObject)$removal_superset_expand$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_superset_expand$BinaryFunction extends BinaryFunction
    {
        public $removal_superset_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-SUPERSET-EXPAND"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_genls.removal_superset_expand(arg1, arg2);
        }
    }
    
    public static final class $removal_genls_between_applicability$UnaryFunction extends UnaryFunction
    {
        public $removal_genls_between_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLS-BETWEEN-APPLICABILITY"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_genls.removal_genls_between_applicability(arg1);
        }
    }
}

/*

	Total time: 218 ms
	
*/