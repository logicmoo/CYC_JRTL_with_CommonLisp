package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class relationship_generality_estimates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.relationship_generality_estimates";
    public static final String myFingerPrint = "7fce423eaab815f10c5d8eb98d97c268c0dbebe3e0714ec2761e0d5e064995e8";
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1984L)
    private static SubLSymbol $relation_generality_estimate_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 2439L)
    private static SubLSymbol $relation_most_restricted_arg_caching_state$;
    private static final SubLObject $const0$argIsa;
    private static final SubLObject $const1$argGenl;
    private static final SubLObject $const2$Thing;
    private static final SubLSymbol $sym3$RELATION_GENERALITY_ESTIMATE_CACHED;
    private static final SubLFloat $float4$1_0;
    private static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const6$EverythingPSC;
    private static final SubLInteger $int7$1000;
    private static final SubLSymbol $sym8$_RELATION_GENERALITY_ESTIMATE_CACHED_CACHING_STATE_;
    private static final SubLInteger $int9$100;
    private static final SubLSymbol $sym10$RELATION_MOST_RESTRICTED_ARG;
    private static final SubLSymbol $sym11$_RELATION_MOST_RESTRICTED_ARG_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1030L)
    public static SubLObject relation_arg_cardinality(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == relationship_generality_estimates.UNPROVIDED) {
            mt = (SubLObject)relationship_generality_estimates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject collection = relation_most_restricted_arg_constraint(relation, argnum, mt);
        final SubLObject constraint = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = constraint;
        if (pcase_var.eql(relationship_generality_estimates.$const0$argIsa)) {
            return cardinality_estimates.instance_cardinality(collection);
        }
        if (pcase_var.eql(relationship_generality_estimates.$const1$argGenl)) {
            return cardinality_estimates.spec_cardinality(collection);
        }
        return cardinality_estimates.instance_cardinality(relationship_generality_estimates.$const2$Thing);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1564L)
    public static SubLObject relation_generality_estimate(final SubLObject relation) {
        if (relationship_generality_estimates.NIL == forts.fort_p(relation)) {
            return (SubLObject)relationship_generality_estimates.ZERO_INTEGER;
        }
        return relation_generality_estimate_cached(relation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1984L)
    public static SubLObject clear_relation_generality_estimate_cached() {
        final SubLObject cs = relationship_generality_estimates.$relation_generality_estimate_cached_caching_state$.getGlobalValue();
        if (relationship_generality_estimates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)relationship_generality_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1984L)
    public static SubLObject remove_relation_generality_estimate_cached(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(relationship_generality_estimates.$relation_generality_estimate_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation), (SubLObject)relationship_generality_estimates.UNPROVIDED, (SubLObject)relationship_generality_estimates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1984L)
    public static SubLObject relation_generality_estimate_cached_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)relationship_generality_estimates.$float4$1_0;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)relationship_generality_estimates.$sym5$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(relationship_generality_estimates.$const6$EverythingPSC, thread);
            final SubLObject v_arity = arity.min_arity(relation);
            if (relationship_generality_estimates.NIL != v_arity) {
                SubLObject i;
                SubLObject argnum;
                SubLObject arg_cardinality;
                for (i = (SubLObject)relationship_generality_estimates.NIL, i = (SubLObject)relationship_generality_estimates.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)relationship_generality_estimates.ONE_INTEGER)) {
                    argnum = Numbers.add(i, (SubLObject)relationship_generality_estimates.ONE_INTEGER);
                    arg_cardinality = relation_arg_cardinality(relation, argnum, (SubLObject)relationship_generality_estimates.NIL);
                    total = Numbers.multiply(total, arg_cardinality);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (!total.isPositive()) {
            return (SubLObject)relationship_generality_estimates.ZERO_INTEGER;
        }
        return Values.values(Numbers.truncate(Numbers.multiply((SubLObject)relationship_generality_estimates.$int7$1000, Numbers.log(total, (SubLObject)relationship_generality_estimates.TWO_INTEGER)), (SubLObject)relationship_generality_estimates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 1984L)
    public static SubLObject relation_generality_estimate_cached(final SubLObject relation) {
        SubLObject caching_state = relationship_generality_estimates.$relation_generality_estimate_cached_caching_state$.getGlobalValue();
        if (relationship_generality_estimates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)relationship_generality_estimates.$sym3$RELATION_GENERALITY_ESTIMATE_CACHED, (SubLObject)relationship_generality_estimates.$sym8$_RELATION_GENERALITY_ESTIMATE_CACHED_CACHING_STATE_, (SubLObject)relationship_generality_estimates.NIL, (SubLObject)relationship_generality_estimates.EQL, (SubLObject)relationship_generality_estimates.ONE_INTEGER, (SubLObject)relationship_generality_estimates.$int9$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relation_generality_estimate_cached_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)relationship_generality_estimates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 2439L)
    public static SubLObject clear_relation_most_restricted_arg() {
        final SubLObject cs = relationship_generality_estimates.$relation_most_restricted_arg_caching_state$.getGlobalValue();
        if (relationship_generality_estimates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)relationship_generality_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 2439L)
    public static SubLObject remove_relation_most_restricted_arg(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(relationship_generality_estimates.$relation_most_restricted_arg_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation), (SubLObject)relationship_generality_estimates.UNPROVIDED, (SubLObject)relationship_generality_estimates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 2439L)
    public static SubLObject relation_most_restricted_arg_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_cardinality = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject best_argnum = (SubLObject)relationship_generality_estimates.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)relationship_generality_estimates.$sym5$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(relationship_generality_estimates.$const6$EverythingPSC, thread);
            final SubLObject v_arity = arity.min_arity(relation);
            if (relationship_generality_estimates.NIL != v_arity) {
                SubLObject i;
                SubLObject argnum;
                SubLObject arg_cardinality;
                for (i = (SubLObject)relationship_generality_estimates.NIL, i = (SubLObject)relationship_generality_estimates.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)relationship_generality_estimates.ONE_INTEGER)) {
                    argnum = Numbers.add(i, (SubLObject)relationship_generality_estimates.ONE_INTEGER);
                    arg_cardinality = relation_arg_cardinality(relation, argnum, (SubLObject)relationship_generality_estimates.NIL);
                    if (arg_cardinality.numL(best_cardinality)) {
                        best_cardinality = arg_cardinality;
                        best_argnum = argnum;
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return best_argnum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 2439L)
    public static SubLObject relation_most_restricted_arg(final SubLObject relation) {
        SubLObject caching_state = relationship_generality_estimates.$relation_most_restricted_arg_caching_state$.getGlobalValue();
        if (relationship_generality_estimates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)relationship_generality_estimates.$sym10$RELATION_MOST_RESTRICTED_ARG, (SubLObject)relationship_generality_estimates.$sym11$_RELATION_MOST_RESTRICTED_ARG_CACHING_STATE_, (SubLObject)relationship_generality_estimates.NIL, (SubLObject)relationship_generality_estimates.EQL, (SubLObject)relationship_generality_estimates.ONE_INTEGER, (SubLObject)relationship_generality_estimates.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relation_most_restricted_arg_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)relationship_generality_estimates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 3037L)
    public static SubLObject relation_most_restricted_arg_constraint(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == relationship_generality_estimates.UNPROVIDED) {
            mt = (SubLObject)relationship_generality_estimates.NIL;
        }
        SubLObject best_collection = relationship_generality_estimates.$const2$Thing;
        SubLObject best_constraint = relationship_generality_estimates.$const0$argIsa;
        SubLObject best_count = cardinality_estimates.instance_cardinality(best_collection);
        SubLObject cdolist_list_var;
        SubLObject candidates = cdolist_list_var = kb_accessors.min_argn_isa(relation, argnum, mt);
        SubLObject candidate = (SubLObject)relationship_generality_estimates.NIL;
        candidate = cdolist_list_var.first();
        while (relationship_generality_estimates.NIL != cdolist_list_var) {
            final SubLObject count = cardinality_estimates.instance_cardinality(candidate);
            if (count.numL(best_count)) {
                best_collection = candidate;
                best_constraint = relationship_generality_estimates.$const0$argIsa;
                best_count = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        candidates = (cdolist_list_var = kb_accessors.min_argn_genl(relation, argnum, mt));
        candidate = (SubLObject)relationship_generality_estimates.NIL;
        candidate = cdolist_list_var.first();
        while (relationship_generality_estimates.NIL != cdolist_list_var) {
            final SubLObject count = cardinality_estimates.spec_cardinality(candidate);
            if (count.numL(best_count)) {
                best_collection = candidate;
                best_constraint = relationship_generality_estimates.$const1$argGenl;
                best_count = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        return Values.values(best_collection, best_constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relationship-generality-estimates.lisp", position = 3984L)
    public static SubLObject relation_generality_estimateL(final SubLObject relation1, final SubLObject relation2) {
        return Numbers.numL(relation_generality_estimate(relation1), relation_generality_estimate(relation2));
    }
    
    public static SubLObject declare_relationship_generality_estimates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_arg_cardinality", "RELATION-ARG-CARDINALITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_generality_estimate", "RELATION-GENERALITY-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "clear_relation_generality_estimate_cached", "CLEAR-RELATION-GENERALITY-ESTIMATE-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "remove_relation_generality_estimate_cached", "REMOVE-RELATION-GENERALITY-ESTIMATE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_generality_estimate_cached_internal", "RELATION-GENERALITY-ESTIMATE-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_generality_estimate_cached", "RELATION-GENERALITY-ESTIMATE-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "clear_relation_most_restricted_arg", "CLEAR-RELATION-MOST-RESTRICTED-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "remove_relation_most_restricted_arg", "REMOVE-RELATION-MOST-RESTRICTED-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_most_restricted_arg_internal", "RELATION-MOST-RESTRICTED-ARG-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_most_restricted_arg", "RELATION-MOST-RESTRICTED-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_most_restricted_arg_constraint", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relationship_generality_estimates", "relation_generality_estimateL", "RELATION-GENERALITY-ESTIMATE<", 2, 0, false);
        return (SubLObject)relationship_generality_estimates.NIL;
    }
    
    public static SubLObject init_relationship_generality_estimates_file() {
        relationship_generality_estimates.$relation_generality_estimate_cached_caching_state$ = SubLFiles.deflexical("*RELATION-GENERALITY-ESTIMATE-CACHED-CACHING-STATE*", (SubLObject)relationship_generality_estimates.NIL);
        relationship_generality_estimates.$relation_most_restricted_arg_caching_state$ = SubLFiles.deflexical("*RELATION-MOST-RESTRICTED-ARG-CACHING-STATE*", (SubLObject)relationship_generality_estimates.NIL);
        return (SubLObject)relationship_generality_estimates.NIL;
    }
    
    public static SubLObject setup_relationship_generality_estimates_file() {
        memoization_state.note_globally_cached_function((SubLObject)relationship_generality_estimates.$sym3$RELATION_GENERALITY_ESTIMATE_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)relationship_generality_estimates.$sym10$RELATION_MOST_RESTRICTED_ARG);
        return (SubLObject)relationship_generality_estimates.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_relationship_generality_estimates_file();
    }
    
    @Override
	public void initializeVariables() {
        init_relationship_generality_estimates_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_relationship_generality_estimates_file();
    }
    
    static {
        me = (SubLFile)new relationship_generality_estimates();
        relationship_generality_estimates.$relation_generality_estimate_cached_caching_state$ = null;
        relationship_generality_estimates.$relation_most_restricted_arg_caching_state$ = null;
        $const0$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const1$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $const2$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym3$RELATION_GENERALITY_ESTIMATE_CACHED = SubLObjectFactory.makeSymbol("RELATION-GENERALITY-ESTIMATE-CACHED");
        $float4$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $sym5$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const6$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int7$1000 = SubLObjectFactory.makeInteger(1000);
        $sym8$_RELATION_GENERALITY_ESTIMATE_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RELATION-GENERALITY-ESTIMATE-CACHED-CACHING-STATE*");
        $int9$100 = SubLObjectFactory.makeInteger(100);
        $sym10$RELATION_MOST_RESTRICTED_ARG = SubLObjectFactory.makeSymbol("RELATION-MOST-RESTRICTED-ARG");
        $sym11$_RELATION_MOST_RESTRICTED_ARG_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RELATION-MOST-RESTRICTED-ARG-CACHING-STATE*");
    }
}

/*

	Total time: 166 ms
	
*/