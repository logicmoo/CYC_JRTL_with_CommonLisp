package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tva_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tva_utilities";
    public static final String myFingerPrint = "7211186f5b1f0586d5d92db8ebfd56e3f7ac929e2943915eb3e84d6e5665835a";
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 891L)
    private static SubLSymbol $tva_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1363L)
    private static SubLSymbol $tva_precomputes_sksi_closuresP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1545L)
    private static SubLSymbol $tva_iterates_kb_predicate_extentP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1788L)
    private static SubLSymbol $tva_iterates_sksi_predicate_extentP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 2754L)
    private static SubLSymbol $tva_force_arg_admittance_checkingP$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 3741L)
    public static SubLSymbol $tva_precompute_closure_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6241L)
    private static SubLSymbol $cached_some_tva_for_predicate_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6650L)
    private static SubLSymbol $cached_some_cva_for_predicate_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 8242L)
    private static SubLSymbol $cached_tva_spec_preds_and_inverses_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 9802L)
    private static SubLSymbol $tva_pred_arg_values_for_tva_pred_cached_caching_state$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$CSOME;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__;
    private static final SubLSymbol $sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__;
    private static final SubLSymbol $sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__;
    private static final SubLObject $const10$argAdmittanceTestedDuringTransiti;
    private static final SubLInteger $int11$1500;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$PROGN;
    private static final SubLSymbol $sym14$CHECK_TYPE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CLET;
    private static final SubLSymbol $sym17$_TVA_PRECOMPUTE_CLOSURE_THRESHOLD_;
    private static final SubLObject $const18$transitiveViaArg;
    private static final SubLSymbol $sym19$TVA_ASSERTION_P;
    private static final SubLObject $const20$transitiveViaArgInverse;
    private static final SubLObject $const21$conservativeViaArg;
    private static final SubLSymbol $sym22$CVA_ASSERTION_P;
    private static final SubLObject $const23$conservativeViaArgInverse;
    private static final SubLSymbol $sym24$CACHED_SOME_TVA_FOR_PREDICATE;
    private static final SubLSymbol $sym25$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const26$EverythingPSC;
    private static final SubLSymbol $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_;
    private static final SubLSymbol $sym28$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const29$InferencePSC;
    private static final SubLSymbol $sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym31$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym32$_CACHED_SOME_TVA_FOR_PREDICATE_CACHING_STATE_;
    private static final SubLInteger $int33$100;
    private static final SubLSymbol $sym34$CLEAR_CACHED_SOME_TVA_FOR_PREDICATE;
    private static final SubLSymbol $sym35$CACHED_SOME_CVA_FOR_PREDICATE;
    private static final SubLSymbol $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_;
    private static final SubLSymbol $sym37$_CACHED_SOME_CVA_FOR_PREDICATE_CACHING_STATE_;
    private static final SubLSymbol $sym38$CLEAR_CACHED_SOME_CVA_FOR_PREDICATE;
    private static final SubLSymbol $sym39$CACHED_TVA_SPEC_PREDS_AND_INVERSES;
    private static final SubLSymbol $kw40$DEPTH;
    private static final SubLSymbol $kw41$STACK;
    private static final SubLSymbol $kw42$QUEUE;
    private static final SubLSymbol $sym43$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw44$ERROR;
    private static final SubLString $str45$_A_is_not_a__A;
    private static final SubLSymbol $sym46$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw47$CERROR;
    private static final SubLString $str48$continue_anyway;
    private static final SubLSymbol $kw49$WARN;
    private static final SubLString $str50$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const51$genlPreds;
    private static final SubLString $str52$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str53$attempting_to_bind_direction_link;
    private static final SubLString $str54$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym55$_CACHED_TVA_SPEC_PREDS_AND_INVERSES_CACHING_STATE_;
    private static final SubLSymbol $sym56$CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES;
    private static final SubLSymbol $sym57$TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED;
    private static final SubLSymbol $sym58$_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED_CACHING_STATE_;
    private static final SubLInteger $int59$2048;
    private static final SubLSymbol $sym60$CLEAR_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$CDOLIST;
    private static final SubLSymbol $sym63$TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG;
    private static final SubLSymbol $sym64$CACHED_ANY_TVA_FOR_ARG_;
    private static final SubLSymbol $kw65$TVAI;
    private static final SubLSymbol $kw66$TVA;
    private static final SubLSymbol $sym67$BEST_INVERSE_BINARY_PREDICATE;
    private static final SubLSymbol $kw68$BACKWARD;
    private static final SubLSymbol $kw69$FORWARD;
    private static final SubLString $str70$Continue;
    private static final SubLString $str71$Error_in_tva_pred____a;
    private static final SubLSymbol $kw72$PREDICATE;
    private static final SubLSymbol $kw73$INVERSE;
    private static final SubLString $str74$Error_in_direction____a;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $kw78$TRANSITIVITY;
    private static final SubLSymbol $kw79$CONTEXTUAL_TRANSITIVITY;
    private static final SubLObject $const80$negationInverse;
    private static final SubLObject $const81$negationPreds;
    private static final SubLObject $const82$genlInverse;
    private static final SubLSymbol $kw83$GENLPREDS;
    private static final SubLSymbol $kw84$CODE;
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1164L)
    public static SubLObject get_tva_predicates() {
        return tva_utilities.$tva_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1231L)
    public static SubLObject do_tva_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = (SubLObject)tva_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list1);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)tva_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)tva_utilities.NIL;
        SubLObject current_$1 = (SubLObject)tva_utilities.NIL;
        while (tva_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_utilities.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tva_utilities.$list1);
            if (tva_utilities.NIL == conses_high.member(current_$1, (SubLObject)tva_utilities.$list2, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED)) {
                bad = (SubLObject)tva_utilities.T;
            }
            if (current_$1 == tva_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (tva_utilities.NIL != bad && tva_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_utilities.$list1);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)tva_utilities.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((tva_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : tva_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)tva_utilities.$sym5$CSOME, (SubLObject)ConsesLow.list(pred, (SubLObject)tva_utilities.$list6, done), ConsesLow.append(body, (SubLObject)tva_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1450L)
    public static SubLObject tva_precomputes_sksi_closuresP() {
        return tva_utilities.$tva_precomputes_sksi_closuresP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1687L)
    public static SubLObject tva_iterates_kb_predicate_extentP() {
        return tva_utilities.$tva_iterates_kb_predicate_extentP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 1938L)
    public static SubLObject tva_iterates_sksi_predicate_extentP() {
        return tva_utilities.$tva_iterates_sksi_predicate_extentP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 2043L)
    public static SubLObject tva_arg_admittance_okP(final SubLObject trans_pred, final SubLObject tva_pred, final SubLObject pred, final SubLObject argnum, final SubLObject inverseP) {
        if (tva_utilities.NIL != el_utilities.kappa_predicate_p(trans_pred)) {
            return (SubLObject)tva_utilities.NIL;
        }
        final SubLObject gather_argnum = determine_tva_gather_argnum(argnum, inverseP);
        if (tva_utilities.NIL != tva_relation_checks_arg_admittance_p(tva_pred, pred, trans_pred, gather_argnum) && tva_utilities.NIL == tva_argument_admitted_p(gather_argnum)) {
            return (SubLObject)tva_utilities.NIL;
        }
        return (SubLObject)tva_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 2819L)
    public static SubLObject tva_relation_checks_arg_admittance_p(final SubLObject tva_pred, final SubLObject index_pred, final SubLObject trans_pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_utilities.NIL != tva_utilities.$tva_force_arg_admittance_checkingP$.getDynamicValue(thread) || tva_utilities.NIL != list_utilities.sublisp_boolean(kb_indexing.find_gaf_in_relevant_mt(el_utilities.make_el_formula(tva_utilities.$const10$argAdmittanceTestedDuringTransiti, (SubLObject)ConsesLow.list(tva_pred, index_pred, trans_pred, argnum), (SubLObject)tva_utilities.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 3274L)
    public static SubLObject tva_argument_admitted_p(final SubLObject argnum) {
        final SubLObject checkedP = tva_inference.tva_asent_arg_admitted(argnum);
        if (tva_utilities.NIL != checkedP) {
            return Equality.eq(checkedP, (SubLObject)tva_utilities.T);
        }
        final SubLObject admittedP = at_admitted.admitted_argumentP(tva_inference.tva_asent_arg(argnum), argnum, tva_inference.tva_asent_pred(), (SubLObject)tva_utilities.UNPROVIDED);
        if (tva_utilities.NIL != admittedP) {
            tva_inference.set_tva_asent_arg_admitted(argnum);
        }
        else {
            tva_inference.set_tva_asent_arg_failed(argnum);
        }
        return Equality.eq(admittedP, (SubLObject)tva_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 3919L)
    public static SubLObject with_tva_precompute_closure_threshold(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = (SubLObject)tva_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list12);
        num = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)tva_utilities.$sym13$PROGN, (SubLObject)ConsesLow.listS((SubLObject)tva_utilities.$sym14$CHECK_TYPE, num, (SubLObject)tva_utilities.$list15), (SubLObject)ConsesLow.listS((SubLObject)tva_utilities.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)tva_utilities.$sym17$_TVA_PRECOMPUTE_CLOSURE_THRESHOLD_, num)), ConsesLow.append(body, (SubLObject)tva_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 4161L)
    public static SubLObject less_than_precompute_closure_thresholdP(final SubLObject cardinality) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numL(cardinality, tva_utilities.$tva_precompute_closure_threshold$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 4294L)
    public static SubLObject tva_predicate_p(final SubLObject pred) {
        return fort_types_interface.transitive_binary_predicate_p(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 4579L)
    public static SubLObject cva_predicate_p(final SubLObject pred) {
        return kb_accessors.binary_predicateP(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 4788L)
    public static SubLObject tva_assertion_p(final SubLObject assertion) {
        return fort_types_interface.transitive_binary_predicate_p(assertions_high.gaf_arg2(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 4968L)
    public static SubLObject cva_assertion_p(final SubLObject assertion) {
        return kb_accessors.binary_predicateP(assertions_high.gaf_arg2(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 5136L)
    public static SubLObject some_transitive_via_arg_assertionP(final SubLObject predicate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_utilities.NIL != kb_mapping_utilities.some_pred_value_if(predicate, tva_utilities.$const18$transitiveViaArg, (SubLObject)tva_utilities.$sym19$TVA_ASSERTION_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED) || tva_utilities.NIL != kb_mapping_utilities.some_pred_value_if(predicate, tva_utilities.$const20$transitiveViaArgInverse, (SubLObject)tva_utilities.$sym19$TVA_ASSERTION_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 5454L)
    public static SubLObject some_conservative_via_arg_assertionP(final SubLObject predicate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_utilities.NIL != kb_mapping_utilities.some_pred_value_if(predicate, tva_utilities.$const21$conservativeViaArg, (SubLObject)tva_utilities.$sym22$CVA_ASSERTION_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED) || tva_utilities.NIL != kb_mapping_utilities.some_pred_value_if(predicate, tva_utilities.$const23$conservativeViaArgInverse, (SubLObject)tva_utilities.$sym22$CVA_ASSERTION_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 5778L)
    public static SubLObject some_tva_for_predicate(final SubLObject predicate) {
        return cached_some_tva_for_predicate(predicate, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6011L)
    public static SubLObject some_cva_for_predicate(final SubLObject predicate) {
        return cached_some_cva_for_predicate(predicate, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6241L)
    public static SubLObject clear_cached_some_tva_for_predicate() {
        final SubLObject cs = tva_utilities.$cached_some_tva_for_predicate_caching_state$.getGlobalValue();
        if (tva_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6241L)
    public static SubLObject remove_cached_some_tva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)tva_utilities.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(tva_utilities.$cached_some_tva_for_predicate_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, mt_info), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6241L)
    public static SubLObject cached_some_tva_for_predicate_internal(final SubLObject predicate, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)tva_utilities.NIL;
        if (tva_utilities.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)tva_utilities.$sym25$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym25$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(tva_utilities.$const26$EverythingPSC, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_utilities.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)tva_utilities.$sym28$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym28$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(tva_utilities.$const29$InferencePSC, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_utilities.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym31$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6241L)
    public static SubLObject cached_some_tva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)tva_utilities.UNPROVIDED);
        }
        SubLObject caching_state = tva_utilities.$cached_some_tva_for_predicate_caching_state$.getGlobalValue();
        if (tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_utilities.$sym24$CACHED_SOME_TVA_FOR_PREDICATE, (SubLObject)tva_utilities.$sym32$_CACHED_SOME_TVA_FOR_PREDICATE_CACHING_STATE_, (SubLObject)tva_utilities.NIL, (SubLObject)tva_utilities.EQUAL, (SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.$int33$100);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)tva_utilities.$sym34$CLEAR_CACHED_SOME_TVA_FOR_PREDICATE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (tva_utilities.NIL != cached_args && tva_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_some_tva_for_predicate_internal(predicate, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6650L)
    public static SubLObject clear_cached_some_cva_for_predicate() {
        final SubLObject cs = tva_utilities.$cached_some_cva_for_predicate_caching_state$.getGlobalValue();
        if (tva_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6650L)
    public static SubLObject remove_cached_some_cva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)tva_utilities.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(tva_utilities.$cached_some_cva_for_predicate_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, mt_info), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6650L)
    public static SubLObject cached_some_cva_for_predicate_internal(final SubLObject predicate, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)tva_utilities.NIL;
        if (tva_utilities.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)tva_utilities.$sym25$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym25$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(tva_utilities.$const26$EverythingPSC, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_utilities.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)tva_utilities.$sym28$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym28$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(tva_utilities.$const29$InferencePSC, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (tva_utilities.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym31$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, (SubLObject)tva_utilities.$sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 6650L)
    public static SubLObject cached_some_cva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)tva_utilities.UNPROVIDED);
        }
        SubLObject caching_state = tva_utilities.$cached_some_cva_for_predicate_caching_state$.getGlobalValue();
        if (tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_utilities.$sym35$CACHED_SOME_CVA_FOR_PREDICATE, (SubLObject)tva_utilities.$sym37$_CACHED_SOME_CVA_FOR_PREDICATE_CACHING_STATE_, (SubLObject)tva_utilities.NIL, (SubLObject)tva_utilities.EQUAL, (SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.$int33$100);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)tva_utilities.$sym38$CLEAR_CACHED_SOME_CVA_FOR_PREDICATE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (tva_utilities.NIL != cached_args && tva_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_some_cva_for_predicate_internal(predicate, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 7063L)
    public static SubLObject tva_spec_preds_and_inverses(final SubLObject predicate, SubLObject prove_negationP) {
        if (prove_negationP == tva_utilities.UNPROVIDED) {
            prove_negationP = (SubLObject)tva_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_utilities.NIL == prove_negationP) {
            return cached_tva_spec_preds_and_inverses(predicate, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), (SubLObject)tva_utilities.UNPROVIDED);
        }
        SubLObject spec_preds = (SubLObject)tva_utilities.NIL;
        SubLObject spec_inverses = (SubLObject)tva_utilities.NIL;
        SubLObject cdolist_list_var = negation_predicate.local_negation_predicates(predicate, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
        SubLObject negpred = (SubLObject)tva_utilities.NIL;
        negpred = cdolist_list_var.first();
        while (tva_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_spec_preds = cached_tva_spec_preds_and_inverses(negpred, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), (SubLObject)tva_utilities.UNPROVIDED);
            final SubLObject this_spec_inverses = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$2 = this_spec_preds;
            SubLObject this_spec_pred = (SubLObject)tva_utilities.NIL;
            this_spec_pred = cdolist_list_var_$2.first();
            while (tva_utilities.NIL != cdolist_list_var_$2) {
                final SubLObject item_var = this_spec_pred;
                if (tva_utilities.NIL == conses_high.member(item_var, spec_preds, Symbols.symbol_function((SubLObject)tva_utilities.EQL), Symbols.symbol_function((SubLObject)tva_utilities.IDENTITY))) {
                    spec_preds = (SubLObject)ConsesLow.cons(item_var, spec_preds);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                this_spec_pred = cdolist_list_var_$2.first();
            }
            SubLObject cdolist_list_var_$3 = this_spec_inverses;
            SubLObject this_spec_inverse = (SubLObject)tva_utilities.NIL;
            this_spec_inverse = cdolist_list_var_$3.first();
            while (tva_utilities.NIL != cdolist_list_var_$3) {
                final SubLObject item_var = this_spec_inverse;
                if (tva_utilities.NIL == conses_high.member(item_var, spec_inverses, Symbols.symbol_function((SubLObject)tva_utilities.EQL), Symbols.symbol_function((SubLObject)tva_utilities.IDENTITY))) {
                    spec_inverses = (SubLObject)ConsesLow.cons(item_var, spec_inverses);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                this_spec_inverse = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            negpred = cdolist_list_var.first();
        }
        cdolist_list_var = negation_predicate.local_negation_inverses(predicate, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
        SubLObject neginversepred = (SubLObject)tva_utilities.NIL;
        neginversepred = cdolist_list_var.first();
        while (tva_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_spec_inverses2 = cached_tva_spec_preds_and_inverses(neginversepred, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), (SubLObject)tva_utilities.T);
            final SubLObject this_spec_preds2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$4 = this_spec_preds2;
            SubLObject this_spec_pred = (SubLObject)tva_utilities.NIL;
            this_spec_pred = cdolist_list_var_$4.first();
            while (tva_utilities.NIL != cdolist_list_var_$4) {
                final SubLObject item_var = this_spec_pred;
                if (tva_utilities.NIL == conses_high.member(item_var, spec_preds, Symbols.symbol_function((SubLObject)tva_utilities.EQL), Symbols.symbol_function((SubLObject)tva_utilities.IDENTITY))) {
                    spec_preds = (SubLObject)ConsesLow.cons(item_var, spec_preds);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                this_spec_pred = cdolist_list_var_$4.first();
            }
            SubLObject cdolist_list_var_$5 = this_spec_inverses2;
            SubLObject this_spec_inverse = (SubLObject)tva_utilities.NIL;
            this_spec_inverse = cdolist_list_var_$5.first();
            while (tva_utilities.NIL != cdolist_list_var_$5) {
                final SubLObject item_var = this_spec_inverse;
                if (tva_utilities.NIL == conses_high.member(item_var, spec_inverses, Symbols.symbol_function((SubLObject)tva_utilities.EQL), Symbols.symbol_function((SubLObject)tva_utilities.IDENTITY))) {
                    spec_inverses = (SubLObject)ConsesLow.cons(item_var, spec_inverses);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                this_spec_inverse = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            neginversepred = cdolist_list_var.first();
        }
        return Values.values(genl_predicates.max_predicates(spec_preds, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), genl_predicates.max_predicates(spec_inverses, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 8242L)
    public static SubLObject clear_cached_tva_spec_preds_and_inverses() {
        final SubLObject cs = tva_utilities.$cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue();
        if (tva_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 8242L)
    public static SubLObject remove_cached_tva_spec_preds_and_inverses(final SubLObject predicate, final SubLObject mt, final SubLObject relevant_mt_function, SubLObject predicate_already_inverseP) {
        if (predicate_already_inverseP == tva_utilities.UNPROVIDED) {
            predicate_already_inverseP = (SubLObject)tva_utilities.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(tva_utilities.$cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, mt, relevant_mt_function, predicate_already_inverseP), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 8242L)
    public static SubLObject cached_tva_spec_preds_and_inverses_internal(final SubLObject predicate, final SubLObject mt, final SubLObject relevant_mt_function, final SubLObject predicate_already_inverseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tva_utilities.NIL != some_transitive_via_arg_assertionP(predicate) || tva_utilities.NIL != some_conservative_via_arg_assertionP(predicate)) {
            return Values.values((SubLObject)ConsesLow.list(predicate), (SubLObject)tva_utilities.NIL);
        }
        SubLObject spec_preds = (SubLObject)tva_utilities.NIL;
        SubLObject spec_inverses = (SubLObject)tva_utilities.NIL;
        final SubLObject deck_type = (SubLObject)tva_utilities.$kw42$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)tva_utilities.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)tva_utilities.NIL;
                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((tva_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_utilities.NIL != tv_var) ? tva_utilities.$sym43$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (tva_utilities.NIL != tv_var && tva_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)tva_utilities.$kw44$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)tva_utilities.$kw47$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$str48$continue_anyway, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)tva_utilities.$kw49$WARN)) {
                            Errors.warn((SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)tva_utilities.$str50$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)tva_utilities.$str48$continue_anyway, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_utilities.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds), thread);
                        if (tva_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_utilities.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(predicate, (SubLObject)tva_utilities.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(predicate, sbhl_search_vars.genl_inverse_mode_p()); tva_utilities.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$12 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject spec = node_var_$12;
                                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverse_mode_p = predicate_mode;
                                        if (tva_utilities.NIL != some_transitive_via_arg_assertionP(spec) || tva_utilities.NIL != some_conservative_via_arg_assertionP(spec)) {
                                            if (!SubLObjectFactory.makeBoolean(tva_utilities.NIL == inverse_mode_p).eql((SubLObject)SubLObjectFactory.makeBoolean(tva_utilities.NIL == predicate_already_inverseP))) {
                                                spec_inverses = (SubLObject)ConsesLow.cons(spec, spec_inverses);
                                            }
                                            else {
                                                spec_preds = (SubLObject)ConsesLow.cons(spec, spec_preds);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds));
                                        SubLObject module_var = (SubLObject)tva_utilities.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (tva_utilities.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$12);
                                                if (tva_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED));
                                                    if (tva_utilities.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED));
                                                        if (tva_utilities.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (tva_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_$16)) {
                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$16, thread);
                                                                        SubLObject iteration_state_$18;
                                                                        for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (tva_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (tva_utilities.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (tva_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)tva_utilities.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (tva_utilities.NIL != csome_list_var) {
                                                                                            if (tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)tva_utilities.$str52$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$12, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$11, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)tva_utilities.FIVE_INTEGER, (SubLObject)tva_utilities.$str53$attempting_to_bind_direction_link, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                                                    }
                                                }
                                                else if (tva_utilities.NIL != obsolete.cnat_p(node, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$20;
                                                    final SubLObject new_list = cdolist_list_var_$20 = ((tva_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)tva_utilities.NIL;
                                                    generating_fn = cdolist_list_var_$20.first();
                                                    while (tva_utilities.NIL != cdolist_list_var_$20) {
                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (tva_utilities.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (tva_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_utilities.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)tva_utilities.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (tva_utilities.NIL != csome_list_var2) {
                                                                    if (tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_utilities.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)tva_utilities.$str52$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                                        generating_fn = cdolist_list_var_$20.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$10, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.$str54$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED)), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Values.values(genl_predicates.max_predicates(spec_preds, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), genl_predicates.max_predicates(spec_inverses, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 8242L)
    public static SubLObject cached_tva_spec_preds_and_inverses(final SubLObject predicate, final SubLObject mt, final SubLObject relevant_mt_function, SubLObject predicate_already_inverseP) {
        if (predicate_already_inverseP == tva_utilities.UNPROVIDED) {
            predicate_already_inverseP = (SubLObject)tva_utilities.NIL;
        }
        SubLObject caching_state = tva_utilities.$cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue();
        if (tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_utilities.$sym39$CACHED_TVA_SPEC_PREDS_AND_INVERSES, (SubLObject)tva_utilities.$sym55$_CACHED_TVA_SPEC_PREDS_AND_INVERSES_CACHING_STATE_, (SubLObject)tva_utilities.NIL, (SubLObject)tva_utilities.EQUAL, (SubLObject)tva_utilities.FOUR_INTEGER, (SubLObject)tva_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)tva_utilities.$sym56$CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, mt, relevant_mt_function, predicate_already_inverseP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (relevant_mt_function.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (tva_utilities.NIL != cached_args && tva_utilities.NIL == cached_args.rest() && predicate_already_inverseP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_tva_spec_preds_and_inverses_internal(predicate, mt, relevant_mt_function, predicate_already_inverseP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt, relevant_mt_function, predicate_already_inverseP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 9151L)
    public static SubLObject tva_gather_transitive_predicates_for_arg(final SubLObject tva_pred, final SubLObject index_pred, final SubLObject argnum, final SubLObject inverseP, SubLObject just_oneP) {
        if (just_oneP == tva_utilities.UNPROVIDED) {
            just_oneP = (SubLObject)tva_utilities.NIL;
        }
        return (SubLObject)((tva_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(tva_pred, index_pred, (SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.UNPROVIDED)) ? ((tva_utilities.NIL != just_oneP) ? kb_mapping_utilities.fpred_arg_value(index_pred, tva_pred, determine_tva_gather_argnum(argnum, inverseP), (SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.THREE_INTEGER, (SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.UNPROVIDED) : kb_mapping_utilities.pred_arg_values(index_pred, tva_pred, determine_tva_gather_argnum(argnum, inverseP), (SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.THREE_INTEGER, (SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED)) : tva_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 9802L)
    public static SubLObject clear_tva_pred_arg_values_for_tva_pred_cached() {
        final SubLObject cs = tva_utilities.$tva_pred_arg_values_for_tva_pred_cached_caching_state$.getGlobalValue();
        if (tva_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 9802L)
    public static SubLObject remove_tva_pred_arg_values_for_tva_pred_cached(final SubLObject index_pred, final SubLObject tva_pred, final SubLObject arg, final SubLObject mt, final SubLObject term_psn, final SubLObject arg_psn, final SubLObject gather_psn) {
        return memoization_state.caching_state_remove_function_results_with_args(tva_utilities.$tva_pred_arg_values_for_tva_pred_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 9802L)
    public static SubLObject tva_pred_arg_values_for_tva_pred_cached_internal(final SubLObject index_pred, final SubLObject tva_pred, final SubLObject arg, final SubLObject mt, final SubLObject term_psn, final SubLObject arg_psn, final SubLObject gather_psn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)tva_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)tva_utilities.$sym31$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = kb_mapping_utilities.pred_arg_values(index_pred, tva_pred, arg, term_psn, arg_psn, gather_psn, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 9802L)
    public static SubLObject tva_pred_arg_values_for_tva_pred_cached(final SubLObject index_pred, final SubLObject tva_pred, final SubLObject arg, final SubLObject mt, final SubLObject term_psn, final SubLObject arg_psn, final SubLObject gather_psn) {
        SubLObject caching_state = tva_utilities.$tva_pred_arg_values_for_tva_pred_cached_caching_state$.getGlobalValue();
        if (tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)tva_utilities.$sym57$TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED, (SubLObject)tva_utilities.$sym58$_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED_CACHING_STATE_, (SubLObject)tva_utilities.$int59$2048, (SubLObject)tva_utilities.EQL, (SubLObject)tva_utilities.SEVEN_INTEGER, (SubLObject)tva_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)tva_utilities.$sym60$CLEAR_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (index_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (tva_pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (arg.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (term_psn.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (arg_psn.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (tva_utilities.NIL != cached_args && tva_utilities.NIL == cached_args.rest() && gather_psn.eql(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_pred_arg_values_for_tva_pred_cached_internal(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 10149L)
    public static SubLObject do_trans_preds_for_arg_with_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject trans_pred_var = (SubLObject)tva_utilities.NIL;
        SubLObject tva_pred = (SubLObject)tva_utilities.NIL;
        SubLObject pred = (SubLObject)tva_utilities.NIL;
        SubLObject argnum = (SubLObject)tva_utilities.NIL;
        SubLObject inverseP = (SubLObject)tva_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list61);
        trans_pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list61);
        tva_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list61);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list61);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list61);
        inverseP = current.first();
        current = current.rest();
        if (tva_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)tva_utilities.$sym62$CDOLIST, (SubLObject)ConsesLow.list(trans_pred_var, (SubLObject)ConsesLow.list((SubLObject)tva_utilities.$sym63$TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG, tva_pred, pred, argnum, inverseP)), ConsesLow.append(body, (SubLObject)tva_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_utilities.$list61);
        return (SubLObject)tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 10390L)
    public static SubLObject any_tva_for_argP(final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cached_any_tva_for_argP(pred, argnum, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 10584L)
    public static SubLObject cached_any_tva_for_argP_internal(final SubLObject pred, final SubLObject argnum, final SubLObject mt, final SubLObject relevant_mt_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)tva_utilities.NIL;
        if (tva_utilities.NIL == foundP) {
            final SubLObject deck_type = (SubLObject)tva_utilities.$kw42$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)tva_utilities.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)tva_utilities.NIL;
                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((tva_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_utilities.NIL != tv_var) ? tva_utilities.$sym43$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (tva_utilities.NIL != tv_var && tva_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)tva_utilities.$kw44$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)tva_utilities.$kw47$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$str48$continue_anyway, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)tva_utilities.$kw49$WARN)) {
                                Errors.warn((SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)tva_utilities.$str50$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)tva_utilities.$str48$continue_anyway, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_utilities.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds), thread);
                            if (tva_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_utilities.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)tva_utilities.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); tva_utilities.NIL != node_and_predicate_mode && tva_utilities.NIL == foundP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$29 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$29;
                                        final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverse_modeP = predicate_mode;
                                            if (tva_utilities.NIL == foundP) {
                                                SubLObject csome_list_var = get_tva_predicates();
                                                SubLObject tva_pred = (SubLObject)tva_utilities.NIL;
                                                tva_pred = csome_list_var.first();
                                                while (tva_utilities.NIL == foundP && tva_utilities.NIL != csome_list_var) {
                                                    if (tva_utilities.NIL != tva_gather_transitive_predicates_for_arg(tva_pred, spec_pred, argnum, inverse_modeP, (SubLObject)tva_utilities.T)) {
                                                        foundP = (SubLObject)tva_utilities.T;
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    tva_pred = csome_list_var.first();
                                                }
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$27;
                                            SubLObject _prev_bind_1_$27;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$33;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$28;
                                            SubLObject iteration_state_$35;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$29;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$37;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$30;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)tva_utilities.NIL, rest = accessible_modules; tva_utilities.NIL == foundP && tva_utilities.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var_$29);
                                                    if (tva_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED));
                                                        if (tva_utilities.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED));
                                                            if (tva_utilities.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_utilities.NIL == foundP && tva_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$33 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (tva_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_$33)) {
                                                                        _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$33, thread);
                                                                            for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_utilities.NIL == foundP && tva_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (tva_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (tva_utilities.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_utilities.NIL == foundP && tva_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (tva_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (tva_utilities.NIL == foundP) {
                                                                                                csome_list_var2 = sol;
                                                                                                node_vars_link_node2 = (SubLObject)tva_utilities.NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (tva_utilities.NIL == foundP && tva_utilities.NIL != csome_list_var2) {
                                                                                                    if (tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)tva_utilities.$str52$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)tva_utilities.FIVE_INTEGER, (SubLObject)tva_utilities.$str53$attempting_to_bind_direction_link, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (tva_utilities.NIL != obsolete.cnat_p(node, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                        new_list = ((tva_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED)));
                                                        for (rest_$37 = (SubLObject)tva_utilities.NIL, rest_$37 = new_list; tva_utilities.NIL == foundP && tva_utilities.NIL != rest_$37; rest_$37 = rest_$37.rest()) {
                                                            generating_fn = rest_$37.first();
                                                            _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (tva_utilities.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_utilities.NIL == foundP && tva_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (tva_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_utilities.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (tva_utilities.NIL == foundP) {
                                                                        csome_list_var3 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)tva_utilities.NIL;
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                        while (tva_utilities.NIL == foundP && tva_utilities.NIL != csome_list_var3) {
                                                                            if (tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)tva_utilities.$str52$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$27, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$25, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.$str54$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED)), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$23, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 10584L)
    public static SubLObject cached_any_tva_for_argP(final SubLObject pred, final SubLObject argnum, final SubLObject mt, final SubLObject relevant_mt_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)tva_utilities.NIL;
        if (tva_utilities.NIL == v_memoization_state) {
            return cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)tva_utilities.$sym64$CACHED_ANY_TVA_FOR_ARG_, (SubLObject)tva_utilities.UNPROVIDED);
        if (tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)tva_utilities.$sym64$CACHED_ANY_TVA_FOR_ARG_, (SubLObject)tva_utilities.FOUR_INTEGER, (SubLObject)tva_utilities.NIL, (SubLObject)tva_utilities.EQUAL, (SubLObject)tva_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)tva_utilities.$sym64$CACHED_ANY_TVA_FOR_ARG_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred, argnum, mt, relevant_mt_function);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (tva_utilities.NIL != cached_args && tva_utilities.NIL == cached_args.rest() && relevant_mt_function.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, argnum, mt, relevant_mt_function));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 11022L)
    public static SubLObject tva_pred_signature(final SubLObject asent_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject raw_result = (SubLObject)tva_utilities.NIL;
        if (tva_utilities.NIL != fort_types_interface.transitive_binary_predicate_p(asent_pred)) {
            raw_result = list_utilities.alist_push(raw_result, (SubLObject)ConsesLow.list((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$kw65$TVAI), asent_pred, Symbols.symbol_function((SubLObject)tva_utilities.EQUAL));
            raw_result = list_utilities.alist_push(raw_result, (SubLObject)ConsesLow.list((SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.$kw66$TVA), asent_pred, Symbols.symbol_function((SubLObject)tva_utilities.EQUAL));
        }
        if (tva_utilities.NIL != fort_types_interface.predicate_p(asent_pred)) {
            final SubLObject deck_type = (SubLObject)tva_utilities.$kw42$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)tva_utilities.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)tva_utilities.NIL;
                    final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((tva_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((tva_utilities.NIL != tv_var) ? tva_utilities.$sym43$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (tva_utilities.NIL != tv_var && tva_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && tva_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)tva_utilities.$kw44$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)tva_utilities.$kw47$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)tva_utilities.ONE_INTEGER, (SubLObject)tva_utilities.$str48$continue_anyway, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)tva_utilities.$kw49$WARN)) {
                                Errors.warn((SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)tva_utilities.$str50$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)tva_utilities.$str48$continue_anyway, (SubLObject)tva_utilities.$str45$_A_is_not_a__A, tv_var, (SubLObject)tva_utilities.$sym46$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_utilities.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds), thread);
                            if (tva_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || tva_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(asent_pred, sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)tva_utilities.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(asent_pred, (SubLObject)tva_utilities.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(asent_pred, sbhl_search_vars.genl_inverse_mode_p()); tva_utilities.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$46 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject pred = node_var_$46;
                                        final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverse_modeP = predicate_mode;
                                            SubLObject csome_list_var = get_tva_predicates();
                                            SubLObject tva_pred = (SubLObject)tva_utilities.NIL;
                                            tva_pred = csome_list_var.first();
                                            while (tva_utilities.NIL != csome_list_var) {
                                                SubLObject cdotimes_end_var;
                                                SubLObject num;
                                                SubLObject argnum;
                                                SubLObject cdolist_list_var;
                                                SubLObject preds;
                                                SubLObject pred_$48;
                                                SubLObject pcase_var2;
                                                for (cdotimes_end_var = arity.arity(asent_pred), num = (SubLObject)tva_utilities.NIL, num = (SubLObject)tva_utilities.ZERO_INTEGER; num.numL(cdotimes_end_var); num = Numbers.add(num, (SubLObject)tva_utilities.ONE_INTEGER)) {
                                                    argnum = Numbers.add((SubLObject)tva_utilities.ONE_INTEGER, num);
                                                    if (tva_utilities.NIL == inverse_modeP || tva_utilities.NIL != misc_utilities.other_binary_arg(argnum)) {
                                                        preds = (cdolist_list_var = tva_gather_transitive_predicates_for_arg(tva_pred, pred, argnum, (SubLObject)tva_utilities.NIL, (SubLObject)tva_utilities.UNPROVIDED));
                                                        pred_$48 = (SubLObject)tva_utilities.NIL;
                                                        pred_$48 = cdolist_list_var.first();
                                                        while (tva_utilities.NIL != cdolist_list_var) {
                                                            pcase_var2 = tva_pred;
                                                            if (pcase_var2.eql(tva_utilities.$const18$transitiveViaArg) || pcase_var2.eql(tva_utilities.$const21$conservativeViaArg)) {
                                                                if (tva_utilities.NIL != inverse_modeP) {
                                                                    raw_result = list_utilities.alist_push(raw_result, (SubLObject)ConsesLow.list(misc_utilities.other_binary_arg(argnum), (SubLObject)tva_utilities.$kw66$TVA), pred_$48, Symbols.symbol_function((SubLObject)tva_utilities.EQUAL));
                                                                }
                                                                else {
                                                                    raw_result = list_utilities.alist_push(raw_result, (SubLObject)ConsesLow.list(argnum, (SubLObject)tva_utilities.$kw66$TVA), pred_$48, Symbols.symbol_function((SubLObject)tva_utilities.EQUAL));
                                                                }
                                                            }
                                                            else if (pcase_var2.eql(tva_utilities.$const20$transitiveViaArgInverse) || pcase_var2.eql(tva_utilities.$const23$conservativeViaArgInverse)) {
                                                                if (tva_utilities.NIL != inverse_modeP) {
                                                                    raw_result = list_utilities.alist_push(raw_result, (SubLObject)ConsesLow.list(misc_utilities.other_binary_arg(argnum), (SubLObject)tva_utilities.$kw65$TVAI), pred_$48, Symbols.symbol_function((SubLObject)tva_utilities.EQUAL));
                                                                }
                                                                else {
                                                                    raw_result = list_utilities.alist_push(raw_result, (SubLObject)ConsesLow.list(argnum, (SubLObject)tva_utilities.$kw65$TVAI), pred_$48, Symbols.symbol_function((SubLObject)tva_utilities.EQUAL));
                                                                }
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            pred_$48 = cdolist_list_var.first();
                                                        }
                                                    }
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                tva_pred = csome_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(tva_utilities.$const51$genlPreds));
                                            SubLObject module_var = (SubLObject)tva_utilities.NIL;
                                            module_var = cdolist_list_var2.first();
                                            while (tva_utilities.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((tva_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(tva_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$46);
                                                    if (tva_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED));
                                                        if (tva_utilities.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED));
                                                            if (tva_utilities.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); tva_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (tva_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$52;
                                                                            for (iteration_state_$52 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); tva_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$52); iteration_state_$52 = dictionary_contents.do_dictionary_contents_next(iteration_state_$52)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$52);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (tva_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (tva_utilities.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)tva_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); tva_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (tva_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var2 = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)tva_utilities.NIL;
                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                            while (tva_utilities.NIL != csome_list_var2) {
                                                                                                if (tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)tva_utilities.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)tva_utilities.$str52$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$46, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$52);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$45, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)tva_utilities.FIVE_INTEGER, (SubLObject)tva_utilities.$str53$attempting_to_bind_direction_link, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (tva_utilities.NIL != obsolete.cnat_p(node, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$54;
                                                        final SubLObject new_list = cdolist_list_var_$54 = ((tva_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)tva_utilities.NIL;
                                                        generating_fn = cdolist_list_var_$54.first();
                                                        while (tva_utilities.NIL != cdolist_list_var_$54) {
                                                            final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (tva_utilities.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)tva_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); tva_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (tva_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)tva_utilities.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)tva_utilities.NIL;
                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                    while (tva_utilities.NIL != csome_list_var3) {
                                                                        if (tva_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)tva_utilities.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)tva_utilities.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)tva_utilities.$str52$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$47, thread);
                                                            }
                                                            cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                                                            generating_fn = cdolist_list_var_$54.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$44, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$44, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var = cdolist_list_var2.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$43, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$45, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$43, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$42, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)tva_utilities.TWO_INTEGER, (SubLObject)tva_utilities.$str54$Node__a_does_not_pass_sbhl_type_t, asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)tva_utilities.UNPROVIDED)), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$42, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$41, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$40, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)tva_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject result = (SubLObject)tva_utilities.NIL;
        if (tva_utilities.NIL != raw_result) {
            SubLObject cdotimes_end_var2;
            SubLObject num2;
            SubLObject argnum2;
            SubLObject tva;
            SubLObject tvai;
            SubLObject tva_to_tvai;
            SubLObject tvai_to_tva;
            for (cdotimes_end_var2 = arity.arity(asent_pred), num2 = (SubLObject)tva_utilities.NIL, num2 = (SubLObject)tva_utilities.ZERO_INTEGER; num2.numL(cdotimes_end_var2); num2 = Numbers.add(num2, (SubLObject)tva_utilities.ONE_INTEGER)) {
                argnum2 = Numbers.add((SubLObject)tva_utilities.ONE_INTEGER, num2);
                tva = list_utilities.alist_lookup(raw_result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw66$TVA), Symbols.symbol_function((SubLObject)tva_utilities.EQUAL), (SubLObject)tva_utilities.UNPROVIDED);
                tvai = list_utilities.alist_lookup(raw_result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw65$TVAI), Symbols.symbol_function((SubLObject)tva_utilities.EQUAL), (SubLObject)tva_utilities.UNPROVIDED);
                if (tva_utilities.NIL != tva && tva_utilities.NIL != tvai) {
                    tva_to_tvai = Mapping.mapcar((SubLObject)tva_utilities.$sym67$BEST_INVERSE_BINARY_PREDICATE, tva);
                    tvai_to_tva = Mapping.mapcar((SubLObject)tva_utilities.$sym67$BEST_INVERSE_BINARY_PREDICATE, tvai);
                    if (tva_utilities.NIL == list_utilities.member_eqP((SubLObject)tva_utilities.NIL, tvai_to_tva)) {
                        result = list_utilities.alist_enter(result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw66$TVA), genl_predicates.min_predicates(ConsesLow.append(tva, tvai_to_tva), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), (SubLObject)tva_utilities.UNPROVIDED);
                    }
                    else if (tva_utilities.NIL == list_utilities.member_eqP((SubLObject)tva_utilities.NIL, tva_to_tvai)) {
                        result = list_utilities.alist_enter(result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw65$TVAI), genl_predicates.min_predicates(ConsesLow.append(tvai, tva_to_tvai), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), (SubLObject)tva_utilities.UNPROVIDED);
                    }
                    else {
                        result = list_utilities.alist_enter(result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw66$TVA), genl_predicates.min_predicates(tva, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), (SubLObject)tva_utilities.UNPROVIDED);
                        result = list_utilities.alist_enter(result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw65$TVAI), genl_predicates.min_predicates(tvai, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), (SubLObject)tva_utilities.UNPROVIDED);
                    }
                }
                else if (tva_utilities.NIL != tva) {
                    result = list_utilities.alist_enter(result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw66$TVA), genl_predicates.min_predicates(tva, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), (SubLObject)tva_utilities.UNPROVIDED);
                }
                else if (tva_utilities.NIL != tvai) {
                    result = list_utilities.alist_enter(result, (SubLObject)ConsesLow.list(argnum2, (SubLObject)tva_utilities.$kw65$TVAI), genl_predicates.min_predicates(tvai, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED), (SubLObject)tva_utilities.UNPROVIDED);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 13464L)
    public static SubLObject tva_direction_for_tva_pred(final SubLObject tva_pred) {
        if (tva_pred.eql(tva_utilities.$const18$transitiveViaArg) || tva_pred.eql(tva_utilities.$const21$conservativeViaArg)) {
            return (SubLObject)tva_utilities.$kw68$BACKWARD;
        }
        if (tva_pred.eql(tva_utilities.$const20$transitiveViaArgInverse) || tva_pred.eql(tva_utilities.$const23$conservativeViaArgInverse)) {
            return (SubLObject)tva_utilities.$kw69$FORWARD;
        }
        return Errors.cerror((SubLObject)tva_utilities.$str70$Continue, (SubLObject)tva_utilities.$str71$Error_in_tva_pred____a, tva_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 13797L)
    public static SubLObject tva_direction_to_sbhl_direction(final SubLObject direction) {
        if (direction.eql((SubLObject)tva_utilities.$kw69$FORWARD)) {
            return (SubLObject)tva_utilities.$kw72$PREDICATE;
        }
        if (direction.eql((SubLObject)tva_utilities.$kw68$BACKWARD)) {
            return (SubLObject)tva_utilities.$kw73$INVERSE;
        }
        return Errors.cerror((SubLObject)tva_utilities.$str70$Continue, (SubLObject)tva_utilities.$str74$Error_in_direction____a, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 14037L)
    public static SubLObject tva_direction_to_ghl_direction(final SubLObject direction) {
        return direction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 14118L)
    public static SubLObject tva_direction_to_ghl_closure_direction(final SubLObject direction) {
        if (direction.eql((SubLObject)tva_utilities.$kw69$FORWARD)) {
            return (SubLObject)tva_utilities.$kw68$BACKWARD;
        }
        if (direction.eql((SubLObject)tva_utilities.$kw68$BACKWARD)) {
            return (SubLObject)tva_utilities.$kw69$FORWARD;
        }
        return Errors.cerror((SubLObject)tva_utilities.$str70$Continue, (SubLObject)tva_utilities.$str74$Error_in_direction____a, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 14364L)
    public static SubLObject determine_tva_gather_argnum(final SubLObject argnum, final SubLObject inverseP) {
        if (tva_utilities.NIL != inverseP) {
            return misc_utilities.other_binary_arg(argnum);
        }
        return argnum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 14525L)
    public static SubLObject do_tva_term_argnums(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum_var = (SubLObject)tva_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list75);
        argnum_var = current.first();
        current = current.rest();
        if (tva_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)tva_utilities.$sym62$CDOLIST, reader.bq_cons(argnum_var, (SubLObject)tva_utilities.$list76), ConsesLow.append(body, (SubLObject)tva_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_utilities.$list75);
        return (SubLObject)tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 14655L)
    public static SubLObject tva_precomputation_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tva_utilities.NIL != sbhl_marking_vars.sbhl_table_p(obj) || tva_utilities.NIL != ghl_search_utilities.ghl_table_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 14778L)
    public static SubLObject tva_unify_vars(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)tva_utilities.NIL;
        SubLObject cdolist_list_var = tva_inference.tva_var_argnums();
        SubLObject pair = (SubLObject)tva_utilities.NIL;
        pair = cdolist_list_var.first();
        while (tva_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject var = (SubLObject)tva_utilities.NIL;
            SubLObject argnum = (SubLObject)tva_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list77);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tva_utilities.$list77);
            argnum = current.first();
            current = current.rest();
            if (tva_utilities.NIL == current) {
                final SubLObject gather_argnum = determine_tva_gather_argnum(argnum, sbhl_search_vars.genl_inverse_mode_p());
                final SubLObject sentence_arg = cycl_utilities.atomic_sentence_arg(sentence, gather_argnum, (SubLObject)tva_utilities.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(var, sentence_arg, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = ConsesLow.nconc(v_bindings, result);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tva_utilities.$list77);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 15369L)
    public static SubLObject tva_support_module_for_pred(final SubLObject pred) {
        if (tva_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            return sbhl_module_utilities.sbhl_pred_get_hl_module(pred);
        }
        if (tva_utilities.NIL != fort_types_interface.transitive_binary_predicate_p(pred)) {
            return (SubLObject)tva_utilities.$kw78$TRANSITIVITY;
        }
        return (SubLObject)tva_utilities.$kw79$CONTEXTUAL_TRANSITIVITY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 15692L)
    public static SubLObject genl_preds_support_from_pred_to_pred(final SubLObject from_pred, final SubLObject to_pred, final SubLObject inverseP) {
        final SubLObject negationP = (SubLObject)SubLObjectFactory.makeBoolean((tva_utilities.NIL == inverseP && tva_utilities.NIL != negation_predicate.negation_predP(from_pred, to_pred, (SubLObject)tva_utilities.UNPROVIDED)) || (tva_utilities.NIL != inverseP && tva_utilities.NIL != negation_predicate.negation_inverseP(from_pred, to_pred, (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED)));
        final SubLObject pred = (tva_utilities.NIL != negationP) ? ((tva_utilities.NIL != inverseP) ? tva_utilities.$const80$negationInverse : tva_utilities.$const81$negationPreds) : ((tva_utilities.NIL != inverseP) ? tva_utilities.$const82$genlInverse : tva_utilities.$const51$genlPreds);
        return arguments.make_hl_support((SubLObject)tva_utilities.$kw83$GENLPREDS, (SubLObject)ConsesLow.list(pred, from_pred, to_pred), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 16157L)
    public static SubLObject genl_preds_support_from_pred_to_tva_pred(final SubLObject pred, final SubLObject inverseP) {
        return genl_preds_support_from_pred_to_pred(pred, tva_inference.tva_asent_pred(), inverseP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tva-utilities.lisp", position = 16310L)
    public static SubLObject tva_assertion_support(final SubLObject tva_pred, final SubLObject pred, final SubLObject trans_pred, final SubLObject argnum) {
        if (pred.eql(trans_pred)) {
            return arguments.make_hl_support((SubLObject)tva_utilities.$kw84$CODE, (SubLObject)ConsesLow.list(tva_pred, pred, trans_pred, argnum), (SubLObject)tva_utilities.UNPROVIDED, (SubLObject)tva_utilities.UNPROVIDED);
        }
        return kb_indexing.find_gaf_in_relevant_mt((SubLObject)ConsesLow.list(tva_pred, pred, trans_pred, argnum));
    }
    
    public static SubLObject declare_tva_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "get_tva_predicates", "GET-TVA-PREDICATES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_utilities", "do_tva_predicates", "DO-TVA-PREDICATES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_precomputes_sksi_closuresP", "TVA-PRECOMPUTES-SKSI-CLOSURES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_iterates_kb_predicate_extentP", "TVA-ITERATES-KB-PREDICATE-EXTENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_iterates_sksi_predicate_extentP", "TVA-ITERATES-SKSI-PREDICATE-EXTENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_arg_admittance_okP", "TVA-ARG-ADMITTANCE-OK?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_relation_checks_arg_admittance_p", "TVA-RELATION-CHECKS-ARG-ADMITTANCE-P", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_argument_admitted_p", "TVA-ARGUMENT-ADMITTED-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_utilities", "with_tva_precompute_closure_threshold", "WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "less_than_precompute_closure_thresholdP", "LESS-THAN-PRECOMPUTE-CLOSURE-THRESHOLD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_predicate_p", "TVA-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cva_predicate_p", "CVA-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_assertion_p", "TVA-ASSERTION-P", 1, 0, false);
        new $tva_assertion_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cva_assertion_p", "CVA-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "some_transitive_via_arg_assertionP", "SOME-TRANSITIVE-VIA-ARG-ASSERTION?", 1, 0, false);
        new $some_transitive_via_arg_assertionP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "some_conservative_via_arg_assertionP", "SOME-CONSERVATIVE-VIA-ARG-ASSERTION?", 1, 0, false);
        new $some_conservative_via_arg_assertionP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "some_tva_for_predicate", "SOME-TVA-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "some_cva_for_predicate", "SOME-CVA-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "clear_cached_some_tva_for_predicate", "CLEAR-CACHED-SOME-TVA-FOR-PREDICATE", 0, 0, false);
        new $clear_cached_some_tva_for_predicate$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "remove_cached_some_tva_for_predicate", "REMOVE-CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_some_tva_for_predicate_internal", "CACHED-SOME-TVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_some_tva_for_predicate", "CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "clear_cached_some_cva_for_predicate", "CLEAR-CACHED-SOME-CVA-FOR-PREDICATE", 0, 0, false);
        new $clear_cached_some_cva_for_predicate$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "remove_cached_some_cva_for_predicate", "REMOVE-CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_some_cva_for_predicate_internal", "CACHED-SOME-CVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_some_cva_for_predicate", "CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_spec_preds_and_inverses", "TVA-SPEC-PREDS-AND-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "clear_cached_tva_spec_preds_and_inverses", "CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 0, 0, false);
        new $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "remove_cached_tva_spec_preds_and_inverses", "REMOVE-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_tva_spec_preds_and_inverses_internal", "CACHED-TVA-SPEC-PREDS-AND-INVERSES-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_tva_spec_preds_and_inverses", "CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_gather_transitive_predicates_for_arg", "TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "clear_tva_pred_arg_values_for_tva_pred_cached", "CLEAR-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "remove_tva_pred_arg_values_for_tva_pred_cached", "REMOVE-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_pred_arg_values_for_tva_pred_cached_internal", "TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-INTERNAL", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_pred_arg_values_for_tva_pred_cached", "TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 7, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_utilities", "do_trans_preds_for_arg_with_mode", "DO-TRANS-PREDS-FOR-ARG-WITH-MODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "any_tva_for_argP", "ANY-TVA-FOR-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_any_tva_for_argP_internal", "CACHED-ANY-TVA-FOR-ARG?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "cached_any_tva_for_argP", "CACHED-ANY-TVA-FOR-ARG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_pred_signature", "TVA-PRED-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_direction_for_tva_pred", "TVA-DIRECTION-FOR-TVA-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_direction_to_sbhl_direction", "TVA-DIRECTION-TO-SBHL-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_direction_to_ghl_direction", "TVA-DIRECTION-TO-GHL-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_direction_to_ghl_closure_direction", "TVA-DIRECTION-TO-GHL-CLOSURE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "determine_tva_gather_argnum", "DETERMINE-TVA-GATHER-ARGNUM", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tva_utilities", "do_tva_term_argnums", "DO-TVA-TERM-ARGNUMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_precomputation_p", "TVA-PRECOMPUTATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_unify_vars", "TVA-UNIFY-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_support_module_for_pred", "TVA-SUPPORT-MODULE-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "genl_preds_support_from_pred_to_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "genl_preds_support_from_pred_to_tva_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-TVA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tva_utilities", "tva_assertion_support", "TVA-ASSERTION-SUPPORT", 4, 0, false);
        return (SubLObject)tva_utilities.NIL;
    }
    
    public static SubLObject init_tva_utilities_file() {
        tva_utilities.$tva_predicates$ = SubLFiles.deflexical("*TVA-PREDICATES*", (SubLObject)tva_utilities.$list0);
        tva_utilities.$tva_precomputes_sksi_closuresP$ = SubLFiles.deflexical("*TVA-PRECOMPUTES-SKSI-CLOSURES?*", (SubLObject)((tva_utilities.NIL != Symbols.boundp((SubLObject)tva_utilities.$sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__)) ? tva_utilities.$tva_precomputes_sksi_closuresP$.getGlobalValue() : tva_utilities.NIL));
        tva_utilities.$tva_iterates_kb_predicate_extentP$ = SubLFiles.deflexical("*TVA-ITERATES-KB-PREDICATE-EXTENT?*", (SubLObject)((tva_utilities.NIL != Symbols.boundp((SubLObject)tva_utilities.$sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__)) ? tva_utilities.$tva_iterates_kb_predicate_extentP$.getGlobalValue() : tva_utilities.T));
        tva_utilities.$tva_iterates_sksi_predicate_extentP$ = SubLFiles.deflexical("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*", (SubLObject)((tva_utilities.NIL != Symbols.boundp((SubLObject)tva_utilities.$sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__)) ? tva_utilities.$tva_iterates_sksi_predicate_extentP$.getGlobalValue() : tva_utilities.NIL));
        tva_utilities.$tva_force_arg_admittance_checkingP$ = SubLFiles.defparameter("*TVA-FORCE-ARG-ADMITTANCE-CHECKING?*", (SubLObject)tva_utilities.NIL);
        tva_utilities.$tva_precompute_closure_threshold$ = SubLFiles.defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", (SubLObject)tva_utilities.$int11$1500);
        tva_utilities.$cached_some_tva_for_predicate_caching_state$ = SubLFiles.deflexical("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*", (SubLObject)tva_utilities.NIL);
        tva_utilities.$cached_some_cva_for_predicate_caching_state$ = SubLFiles.deflexical("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*", (SubLObject)tva_utilities.NIL);
        tva_utilities.$cached_tva_spec_preds_and_inverses_caching_state$ = SubLFiles.deflexical("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*", (SubLObject)tva_utilities.NIL);
        tva_utilities.$tva_pred_arg_values_for_tva_pred_cached_caching_state$ = SubLFiles.deflexical("*TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-CACHING-STATE*", (SubLObject)tva_utilities.NIL);
        return (SubLObject)tva_utilities.NIL;
    }
    
    public static SubLObject setup_tva_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)tva_utilities.$sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__);
        subl_macro_promotions.declare_defglobal((SubLObject)tva_utilities.$sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__);
        subl_macro_promotions.declare_defglobal((SubLObject)tva_utilities.$sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__);
        memoization_state.note_globally_cached_function((SubLObject)tva_utilities.$sym24$CACHED_SOME_TVA_FOR_PREDICATE);
        memoization_state.note_globally_cached_function((SubLObject)tva_utilities.$sym35$CACHED_SOME_CVA_FOR_PREDICATE);
        memoization_state.note_globally_cached_function((SubLObject)tva_utilities.$sym39$CACHED_TVA_SPEC_PREDS_AND_INVERSES);
        memoization_state.note_globally_cached_function((SubLObject)tva_utilities.$sym57$TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED);
        memoization_state.note_memoized_function((SubLObject)tva_utilities.$sym64$CACHED_ANY_TVA_FOR_ARG_);
        return (SubLObject)tva_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_tva_utilities_file();
    }
    
    public void initializeVariables() {
        init_tva_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_tva_utilities_file();
    }
    
    static {
        me = (SubLFile)new tva_utilities();
        tva_utilities.$tva_predicates$ = null;
        tva_utilities.$tva_precomputes_sksi_closuresP$ = null;
        tva_utilities.$tva_iterates_kb_predicate_extentP$ = null;
        tva_utilities.$tva_iterates_sksi_predicate_extentP$ = null;
        tva_utilities.$tva_force_arg_admittance_checkingP$ = null;
        tva_utilities.$tva_precompute_closure_threshold$ = null;
        tva_utilities.$cached_some_tva_for_predicate_caching_state$ = null;
        tva_utilities.$cached_some_cva_for_predicate_caching_state$ = null;
        tva_utilities.$cached_tva_spec_preds_and_inverses_caching_state$ = null;
        tva_utilities.$tva_pred_arg_values_for_tva_pred_cached_caching_state$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse")));
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TVA-PREDICATES"));
        $sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__ = SubLObjectFactory.makeSymbol("*TVA-PRECOMPUTES-SKSI-CLOSURES?*");
        $sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__ = SubLObjectFactory.makeSymbol("*TVA-ITERATES-KB-PREDICATE-EXTENT?*");
        $sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__ = SubLObjectFactory.makeSymbol("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*");
        $const10$argAdmittanceTestedDuringTransiti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAdmittanceTestedDuringTransitiveViaInference"));
        $int11$1500 = SubLObjectFactory.makeInteger(1500);
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym14$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym17$_TVA_PRECOMPUTE_CLOSURE_THRESHOLD_ = SubLObjectFactory.makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*");
        $const18$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $sym19$TVA_ASSERTION_P = SubLObjectFactory.makeSymbol("TVA-ASSERTION-P");
        $const20$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $const21$conservativeViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArg"));
        $sym22$CVA_ASSERTION_P = SubLObjectFactory.makeSymbol("CVA-ASSERTION-P");
        $const23$conservativeViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse"));
        $sym24$CACHED_SOME_TVA_FOR_PREDICATE = SubLObjectFactory.makeSymbol("CACHED-SOME-TVA-FOR-PREDICATE");
        $sym25$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const26$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_ = SubLObjectFactory.makeSymbol("SOME-TRANSITIVE-VIA-ARG-ASSERTION?");
        $sym28$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const29$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym31$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym32$_CACHED_SOME_TVA_FOR_PREDICATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*");
        $int33$100 = SubLObjectFactory.makeInteger(100);
        $sym34$CLEAR_CACHED_SOME_TVA_FOR_PREDICATE = SubLObjectFactory.makeSymbol("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE");
        $sym35$CACHED_SOME_CVA_FOR_PREDICATE = SubLObjectFactory.makeSymbol("CACHED-SOME-CVA-FOR-PREDICATE");
        $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_ = SubLObjectFactory.makeSymbol("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?");
        $sym37$_CACHED_SOME_CVA_FOR_PREDICATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*");
        $sym38$CLEAR_CACHED_SOME_CVA_FOR_PREDICATE = SubLObjectFactory.makeSymbol("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE");
        $sym39$CACHED_TVA_SPEC_PREDS_AND_INVERSES = SubLObjectFactory.makeSymbol("CACHED-TVA-SPEC-PREDS-AND-INVERSES");
        $kw40$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw41$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw42$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym43$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw44$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str45$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym46$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw47$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str48$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw49$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str50$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const51$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str52$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str53$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str54$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym55$_CACHED_TVA_SPEC_PREDS_AND_INVERSES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*");
        $sym56$CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES = SubLObjectFactory.makeSymbol("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES");
        $sym57$TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED = SubLObjectFactory.makeSymbol("TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED");
        $sym58$_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-CACHING-STATE*");
        $int59$2048 = SubLObjectFactory.makeInteger(2048);
        $sym60$CLEAR_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED = SubLObjectFactory.makeSymbol("CLEAR-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANS-PRED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TVA-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym62$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym63$TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG = SubLObjectFactory.makeSymbol("TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG");
        $sym64$CACHED_ANY_TVA_FOR_ARG_ = SubLObjectFactory.makeSymbol("CACHED-ANY-TVA-FOR-ARG?");
        $kw65$TVAI = SubLObjectFactory.makeKeyword("TVAI");
        $kw66$TVA = SubLObjectFactory.makeKeyword("TVA");
        $sym67$BEST_INVERSE_BINARY_PREDICATE = SubLObjectFactory.makeSymbol("BEST-INVERSE-BINARY-PREDICATE");
        $kw68$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw69$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str70$Continue = SubLObjectFactory.makeString("Continue");
        $str71$Error_in_tva_pred____a = SubLObjectFactory.makeString("Error in tva-pred : ~a");
        $kw72$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw73$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $str74$Error_in_direction____a = SubLObjectFactory.makeString("Error in direction : ~a");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TVA-TERM-ARGNUMS")));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $kw78$TRANSITIVITY = SubLObjectFactory.makeKeyword("TRANSITIVITY");
        $kw79$CONTEXTUAL_TRANSITIVITY = SubLObjectFactory.makeKeyword("CONTEXTUAL-TRANSITIVITY");
        $const80$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $const81$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $const82$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw83$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $kw84$CODE = SubLObjectFactory.makeKeyword("CODE");
    }
    
    public static final class $tva_assertion_p$UnaryFunction extends UnaryFunction
    {
        public $tva_assertion_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TVA-ASSERTION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return tva_utilities.tva_assertion_p(arg1);
        }
    }
    
    public static final class $some_transitive_via_arg_assertionP$UnaryFunction extends UnaryFunction
    {
        public $some_transitive_via_arg_assertionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SOME-TRANSITIVE-VIA-ARG-ASSERTION?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return tva_utilities.some_transitive_via_arg_assertionP(arg1);
        }
    }
    
    public static final class $some_conservative_via_arg_assertionP$UnaryFunction extends UnaryFunction
    {
        public $some_conservative_via_arg_assertionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return tva_utilities.some_conservative_via_arg_assertionP(arg1);
        }
    }
    
    public static final class $clear_cached_some_tva_for_predicate$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cached_some_tva_for_predicate$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE"));
        }
        
        public SubLObject processItem() {
            return tva_utilities.clear_cached_some_tva_for_predicate();
        }
    }
    
    public static final class $clear_cached_some_cva_for_predicate$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cached_some_cva_for_predicate$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE"));
        }
        
        public SubLObject processItem() {
            return tva_utilities.clear_cached_some_cva_for_predicate();
        }
    }
    
    public static final class $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES"));
        }
        
        public SubLObject processItem() {
            return tva_utilities.clear_cached_tva_spec_preds_and_inverses();
        }
    }
}

/*

	Total time: 1299 ms
	
*/