package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_search extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gt_search";
    public static final String myFingerPrint = "edce8518294fd815a938a5274913fb8d16e3b7567fb95ef8ad8cf51866ed6ed3";
    private static final SubLSymbol $kw0$DIRECTED;
    private static final SubLSymbol $kw1$SUPERIOR;
    private static final SubLSymbol $kw2$INFERIOR;
    private static final SubLSymbol $kw3$INVERSE;
    private static final SubLString $str4$illegal_value_of__gt_mode____s;
    private static final SubLSymbol $sym5$GT_GATHER_LINK_NODE;
    private static final SubLSymbol $sym6$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym7$GT_GATHER_SIBLING_NODE;
    private static final SubLString $str8$invalid_gt_mode___a;
    private static final SubLString $str9$illegal_value_of__gt_mode_;
    private static final SubLSymbol $sym10$GT_MAP_LINKS;
    private static final SubLSymbol $sym11$GT_GATHER_EXTREMAL_NODE;
    private static final SubLSymbol $sym12$GT_TEST_LINK_NODE;
    private static final SubLString $str13$_a_is_not_a_function;
    private static final SubLSymbol $sym14$GT_GATHER_NODE;
    private static final SubLInteger $int15$128;
    private static final SubLSymbol $sym16$GT_COMPOSE_FN_LINK_NODE;
    private static final SubLSymbol $sym17$CONS;
    private static final SubLSymbol $sym18$GT_SELECT_LINK_NODE;
    private static final SubLSymbol $sym19$GT_MARK_AS_SEARCHED_AND_STEP;
    private static final SubLSymbol $sym20$GT_MARK_AS_UNSEARCHED_AND_STEP;
    private static final SubLSymbol $sym21$GT_GATHER_MARKED_LINK_NODE;
    private static final SubLSymbol $sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED;
    private static final SubLSymbol $sym23$GT_ALL_PREDECESSORS_SEARCHED_;
    private static final SubLSymbol $sym24$GT_COMPOSE_PRED_LINK_NODE;
    private static final SubLSymbol $sym25$FORT_P;
    private static final SubLObject $const26$equals;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GT_GATHER_ACCESS_JUST;
    private static final SubLSymbol $sym29$GT_GATHER_ACCESS_PATH;
    private static final SubLSymbol $sym30$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const31$EverythingPSC;
    private static final SubLObject $const32$ReflexiveBinaryPredicate;
    private static final SubLObject $const33$genlMt;
    private static final SubLSymbol $kw34$TRUE;
    private static final SubLSymbol $sym35$TRUTH_P;
    private static final SubLSymbol $sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS;
    private static final SubLSymbol $sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS;
    private static final SubLSymbol $sym38$QUOTE;
    private static final SubLSymbol $sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES;
    private static final SubLSymbol $sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS;
    private static final SubLSymbol $sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS;
    private static final SubLSymbol $sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY;
    private static final SubLSymbol $kw43$ASSERTION;
    private static final SubLString $str44$illegal_value_of__gt_link_type___;
    private static final SubLSymbol $sym45$HLMT_EQUAL;
    private static final SubLInteger $int46$512;
    private static final SubLString $str47$GT_recursion_limit_reached_;
    private static final SubLSymbol $kw48$ACCESSORS;
    private static final SubLSymbol $kw49$ACCESSIBLE;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$MAPPING_DONE;
    private static final SubLSymbol $sym52$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLSymbol $kw53$GAF;
    private static final SubLSymbol $sym54$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLSymbol $kw55$DEPTH;
    private static final SubLSymbol $kw56$STACK;
    private static final SubLSymbol $kw57$QUEUE;
    private static final SubLSymbol $sym58$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw59$ERROR;
    private static final SubLString $str60$_A_is_not_a__A;
    private static final SubLSymbol $sym61$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw62$CERROR;
    private static final SubLString $str63$continue_anyway;
    private static final SubLSymbol $kw64$WARN;
    private static final SubLString $str65$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const66$genlPreds;
    private static final SubLList $list67;
    private static final SubLString $str68$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str69$attempting_to_bind_direction_link;
    private static final SubLString $str70$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym71$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 388L)
    public static SubLObject gt_search_index_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
            return arity.binary_arg_swap(gt_vars.$gt_index_arg$.getDynamicValue(thread));
        }
        return gt_vars.$gt_index_arg$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 767L)
    public static SubLObject gt_search_gather_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
            return arity.binary_arg_swap(gt_vars.$gt_gather_arg$.getDynamicValue(thread));
        }
        return gt_vars.$gt_gather_arg$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 1009L)
    public static SubLObject gt_link_node(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_search.$kw0$DIRECTED)) {
            return assertions_high.gaf_arg(assertion, gt_search_gather_arg());
        }
        if (pcase_var.eql((SubLObject)gt_search.$kw1$SUPERIOR)) {
            return assertions_high.gaf_arg(assertion, gt_search_gather_arg());
        }
        if (pcase_var.eql((SubLObject)gt_search.$kw2$INFERIOR)) {
            return assertions_high.gaf_arg(assertion, gt_search_index_arg());
        }
        if (pcase_var.eql((SubLObject)gt_search.$kw3$INVERSE)) {
            return assertions_high.gaf_arg(assertion, gt_search_index_arg());
        }
        gt_utilities.gt_error((SubLObject)gt_search.THREE_INTEGER, (SubLObject)gt_search.$str4$illegal_value_of__gt_mode____s, gt_vars.$gt_mode$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 1420L)
    public static SubLObject gt_link_node_and_mt(final SubLObject assertion) {
        return Values.values(gt_link_node(assertion), assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 1596L)
    public static SubLObject gt_link_values(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            try {
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE) : gt_search.$sym5$GT_GATHER_LINK_NODE;
                final SubLObject _prev_bind_0_$1 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE, thread);
                    gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 1914L)
    public static SubLObject gt_add_to_result(final SubLObject result_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cutoff_reached = (SubLObject)gt_search.NIL;
        if (gt_search.NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread) && gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
            utilities_macros.mapping_finished();
            cutoff_reached = (SubLObject)gt_search.T;
        }
        if (gt_search.NIL == cutoff_reached) {
            gt_vars.$gt_answers_so_far$.setDynamicValue(Numbers.add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), (SubLObject)gt_search.ONE_INTEGER), thread);
            gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(result_item, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 2045L)
    public static SubLObject gt_gather_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            if (gt_search.NIL == gt_searchedP(node)) {
                gt_add_to_result(node);
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        else if (gt_search.NIL != gt_vars.$gt_equality_fn$.getDynamicValue(thread)) {
            if (gt_search.NIL == conses_high.member(node, gt_vars.$gt_result$.getDynamicValue(thread), gt_vars.$gt_equality_fn$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)gt_search.IDENTITY))) {
                gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
        }
        else {
            gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 2377L)
    public static SubLObject gt_gather_link_node_and_mt(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = gt_link_node(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            if (gt_search.NIL != gt_vars.$gt_edge_list_returnP$.getDynamicValue(thread)) {
                gt_vars.$gt_edge_list$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.gaf_arg1(assertion), assertions_high.gaf_arg2(assertion)), gt_vars.$gt_edge_list$.getDynamicValue(thread)), thread);
            }
            gt_add_to_result((SubLObject)ConsesLow.cons(node, mt));
        }
        else if (gt_search.NIL != gt_vars.$gt_equality_fn$.getDynamicValue(thread)) {
            final SubLObject item_var = (SubLObject)ConsesLow.cons(node, mt);
            if (gt_search.NIL == conses_high.member(item_var, gt_vars.$gt_result$.getDynamicValue(thread), gt_vars.$gt_equality_fn$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)gt_search.IDENTITY))) {
                gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
        }
        else {
            gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(node, mt), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 2855L)
    public static SubLObject gt_siblings(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            try {
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym7$GT_GATHER_SIBLING_NODE) : gt_search.$sym7$GT_GATHER_SIBLING_NODE;
                final SubLObject _prev_bind_0_$3 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym7$GT_GATHER_SIBLING_NODE, thread);
                    gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 3150L)
    public static SubLObject gt_gather_sibling_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)gt_search.$kw1$SUPERIOR)) {
                if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw2$INFERIOR)) {
                    Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw2$INFERIOR);
                }
                final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw2$INFERIOR, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE) : gt_search.$sym5$GT_GATHER_LINK_NODE;
                    final SubLObject _prev_bind_0_$5 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE, thread);
                        gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            else if (pcase_var.eql((SubLObject)gt_search.$kw2$INFERIOR)) {
                if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw1$SUPERIOR)) {
                    Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw1$SUPERIOR);
                }
                final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw1$SUPERIOR, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE) : gt_search.$sym5$GT_GATHER_LINK_NODE;
                    final SubLObject _prev_bind_0_$6 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE, thread);
                        gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                gt_utilities.gt_error((SubLObject)gt_search.FIVE_INTEGER, (SubLObject)gt_search.$str9$illegal_value_of__gt_mode_, gt_vars.$gt_mode$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 3609L)
    public static SubLObject gt_all_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$7 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                if (gt_search.NIL != gt_utilities.gt_reflexiveP()) {
                    gt_add_to_result(constant);
                }
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE) : gt_search.$sym5$GT_GATHER_LINK_NODE;
                final SubLObject _prev_bind_0_$8 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE, thread);
                    gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$8, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$7, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 3975L)
    public static SubLObject tts_all_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            SubLObject direct = (SubLObject)gt_search.NIL;
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE) : gt_search.$sym5$GT_GATHER_LINK_NODE;
            final SubLObject _prev_bind_0_$9 = gt_vars.$gt_base_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE, thread);
                try {
                    final SubLObject _prev_bind_0_$10 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = gt_vars.$gt_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
                        gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
                        gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                        direct = gt_vars.$gt_result$.getDynamicValue(thread);
                    }
                    finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_5, thread);
                        gt_vars.$gt_truth$.rebind(_prev_bind_4, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_0_$10, thread);
                    }
                    if (gt_search.NIL != ((gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL) && !gt_search.assertionsDisabledInClass && gt_search.NIL == Types.function_spec_p((SubLObject)((gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL))) {
                        throw new AssertionError((gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL);
                    }
                    final SubLObject _prev_bind_0_$11 = gt_vars.$gt_step_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_step_fn$.bind((SubLObject)((gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL), thread);
                        SubLObject cdolist_list_var = direct;
                        SubLObject node = (SubLObject)gt_search.NIL;
                        node = cdolist_list_var.first();
                        while (gt_search.NIL != cdolist_list_var) {
                            if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
                                gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            node = cdolist_list_var.first();
                        }
                    }
                    finally {
                        gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$11, thread);
                    }
                    gt_vars.$gt_result$.setDynamicValue(ConsesLow.nconc(direct, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$9, thread);
            }
            if (gt_search.NIL != kb_accessors.reflexive_predicateP(gt_vars.$tt_pred$.getDynamicValue(thread))) {
                gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 4771L)
    public static SubLObject gt_extremal_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$13 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                try {
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym11$GT_GATHER_EXTREMAL_NODE) : gt_search.$sym11$GT_GATHER_EXTREMAL_NODE;
                    final SubLObject _prev_bind_0_$14 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym11$GT_GATHER_EXTREMAL_NODE, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$14, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$13, thread);
            }
            if (gt_search.NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            }
            else if (gt_search.NIL != gt_utilities.gt_reflexiveP()) {
                result = (SubLObject)ConsesLow.cons(constant, result);
            }
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 5189L)
    public static SubLObject gt_gather_extremal_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extremals = (SubLObject)gt_search.NIL;
        SubLObject gt_searchedP = (SubLObject)gt_search.NIL;
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            if (gt_search.NIL != gt_searchedP(node)) {
                gt_vars.$gt_searchedP$.setDynamicValue((SubLObject)gt_search.T, thread);
            }
            else {
                gt_mark_as_searched(node);
                final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_searchedP$.currentBinding(thread);
                try {
                    gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
                    gt_vars.$gt_searchedP$.bind((SubLObject)gt_search.NIL, thread);
                    gt_utilities.gt_step_fn_funcall(node);
                    gt_searchedP = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL != gt_searchedP || gt_search.NIL != gt_vars.$gt_searchedP$.getDynamicValue(thread));
                    extremals = gt_vars.$gt_result$.getDynamicValue(thread);
                }
                finally {
                    gt_vars.$gt_searchedP$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                }
                if (gt_search.NIL != extremals) {
                    gt_vars.$gt_result$.setDynamicValue(ConsesLow.nconc(extremals, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
                else if (gt_search.NIL != gt_searchedP) {
                    gt_vars.$gt_searchedP$.setDynamicValue(gt_searchedP, thread);
                }
                else {
                    gt_add_to_result(node);
                }
            }
        }
        return gt_vars.$gt_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 5806L)
    public static SubLObject gt_accessesP(final SubLObject constant, final SubLObject target, SubLObject compare_fn) {
        if (compare_fn == gt_search.UNPROVIDED) {
            compare_fn = (SubLObject)gt_search.EQL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != sksi_infrastructure_utilities.sksi_external_term_p(constant) || gt_search.NIL != sksi_infrastructure_utilities.sksi_external_term_p(target)) {
            compare_fn = (SubLObject)gt_search.EQUAL;
        }
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_doneP$.bind((SubLObject)gt_search.NIL, thread);
            final SubLObject _prev_bind_0_$16 = gt_vars.$gt_target$.currentBinding(thread);
            try {
                gt_vars.$gt_target$.bind(target, thread);
                assert gt_search.NIL != Types.function_spec_p(compare_fn) : compare_fn;
                final SubLObject _prev_bind_0_$17 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
                    final SubLObject _prev_bind_0_$18 = gt_vars.$gt_step_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                        try {
                            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym12$GT_TEST_LINK_NODE) : gt_search.$sym12$GT_TEST_LINK_NODE;
                            final SubLObject _prev_bind_0_$19 = gt_vars.$gt_base_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym12$GT_TEST_LINK_NODE, thread);
                                gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                            }
                            finally {
                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    finally {
                        gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                finally {
                    gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                gt_vars.$gt_target$.rebind(_prev_bind_0_$16, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 6643L)
    public static SubLObject gt_test_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
            gt_finished((SubLObject)gt_search.T);
        }
        else if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return gt_vars.$gt_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 6895L)
    public static SubLObject gt_gather(final SubLObject v_term, final SubLObject gather_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_doneP$.bind((SubLObject)gt_search.NIL, thread);
            if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !gather_fn.isFunctionSpec()) {
                Errors.error((SubLObject)gt_search.$str13$_a_is_not_a_function, gather_fn);
            }
            final SubLObject _prev_bind_0_$21 = gt_vars.$gt_gather_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_gather_fn$.bind(gather_fn, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
                final SubLObject _prev_bind_0_$22 = gt_vars.$gt_step_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                    try {
                        assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym14$GT_GATHER_NODE) : gt_search.$sym14$GT_GATHER_NODE;
                        final SubLObject _prev_bind_0_$23 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym14$GT_GATHER_NODE, thread);
                            gt_map_links(v_term, (SubLObject)gt_search.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$23, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                }
                finally {
                    gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$22, thread);
                }
            }
            finally {
                gt_vars.$gt_gather_fn$.rebind(_prev_bind_0_$21, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 7290L)
    public static SubLObject gt_gather_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gatheredP = Functions.funcall(gt_vars.$gt_gather_fn$.getDynamicValue(thread), node);
        if (gt_search.NIL != gatheredP) {
            gt_finished(gatheredP);
        }
        else if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return gt_vars.$gt_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 7567L)
    public static SubLObject gt_common_horizon(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_search.UNPROVIDED) {
            candidates = (SubLObject)gt_search.NIL;
        }
        if (mt == gt_search.UNPROVIDED) {
            mt = (SubLObject)gt_search.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject horizon = (SubLObject)gt_search.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject accessed_nodes = (SubLObject)gt_search.NIL;
            final SubLObject _prev_bind_0_$25 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
            final SubLObject _prev_bind_1_$26 = gt_vars.$gt_marking_table$.currentBinding(thread);
            try {
                gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                gt_vars.$gt_marking_table$.bind((SubLObject)gt_search.NIL, thread);
                gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_search.$int15$128, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED), thread);
                accessed_nodes = gt_all_accessed(nodes.first());
            }
            finally {
                gt_vars.$gt_marking_table$.rebind(_prev_bind_1_$26, thread);
                gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$25, thread);
            }
            SubLObject cdolist_list_var = nodes;
            SubLObject node = (SubLObject)gt_search.NIL;
            node = cdolist_list_var.first();
            while (gt_search.NIL != cdolist_list_var) {
                gt_mark_all_accessed_as_searched_by(node, node);
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            }
            cdolist_list_var = accessed_nodes;
            SubLObject accessed_node = (SubLObject)gt_search.NIL;
            accessed_node = cdolist_list_var.first();
            while (gt_search.NIL != cdolist_list_var) {
                if (gt_search.NIL != gt_searched_by_allP(accessed_node, nodes, (SubLObject)gt_search.UNPROVIDED)) {
                    if (gt_search.NIL == candidates) {
                        horizon = (SubLObject)ConsesLow.cons(accessed_node, horizon);
                    }
                    else if (gt_search.NIL != subl_promotions.memberP(accessed_node, candidates, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) {
                        horizon = (SubLObject)ConsesLow.cons(accessed_node, horizon);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                accessed_node = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return horizon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 8335L)
    public static SubLObject gt_compose_fn_all_accessed(final SubLObject constant, final SubLObject compose_fn, SubLObject combine_fn) {
        if (combine_fn == gt_search.UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$27 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                if (gt_search.NIL != gt_utilities.gt_reflexiveP()) {
                    SubLObject cutoff_reached = (SubLObject)gt_search.NIL;
                    if (gt_search.NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread) && gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                        utilities_macros.mapping_finished();
                        cutoff_reached = (SubLObject)gt_search.T;
                    }
                    if (gt_search.NIL == cutoff_reached) {
                        gt_vars.$gt_answers_so_far$.setDynamicValue(Numbers.add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), (SubLObject)gt_search.ONE_INTEGER), thread);
                        gt_vars.$gt_result$.setDynamicValue(Functions.funcall(combine_fn, Functions.funcall(compose_fn, constant), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                }
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym16$GT_COMPOSE_FN_LINK_NODE) : gt_search.$sym16$GT_COMPOSE_FN_LINK_NODE;
                final SubLObject _prev_bind_0_$28 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym16$GT_COMPOSE_FN_LINK_NODE, thread);
                    assert gt_search.NIL != Types.function_spec_p(combine_fn) : combine_fn;
                    final SubLObject _prev_bind_0_$29 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_combine_fn$.bind(combine_fn, thread);
                        assert gt_search.NIL != Types.function_spec_p(compose_fn) : compose_fn;
                        final SubLObject _prev_bind_0_$30 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_fn$.bind(compose_fn, thread);
                            gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_$29, thread);
                    }
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$28, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$27, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 9121L)
    public static SubLObject gt_compose_fn_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            SubLObject cutoff_reached = (SubLObject)gt_search.NIL;
            if (gt_search.NIL != gt_vars.$gt_answers_cutoffP$.getDynamicValue(thread) && gt_vars.$gt_answers_so_far$.getDynamicValue(thread).numGE(gt_vars.$gt_answers_cutoff$.getDynamicValue(thread))) {
                utilities_macros.mapping_finished();
                cutoff_reached = (SubLObject)gt_search.T;
            }
            if (gt_search.NIL == cutoff_reached) {
                gt_vars.$gt_answers_so_far$.setDynamicValue(Numbers.add(gt_vars.$gt_answers_so_far$.getDynamicValue(thread), (SubLObject)gt_search.ONE_INTEGER), thread);
                if (gt_search.NIL == gt_searchedP(node)) {
                    gt_mark_as_searched(node);
                    gt_utilities.gt_step_fn_funcall(node);
                    gt_vars.$gt_result$.setDynamicValue(Functions.funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), Functions.funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                }
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 9436L)
    public static SubLObject gt_select_all_accessed(final SubLObject constant, final SubLObject select_fn, SubLObject combine_fn) {
        if (combine_fn == gt_search.UNPROVIDED) {
            combine_fn = (SubLObject)gt_search.$sym17$CONS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$31 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                try {
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym18$GT_SELECT_LINK_NODE) : gt_search.$sym18$GT_SELECT_LINK_NODE;
                    final SubLObject _prev_bind_0_$32 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym18$GT_SELECT_LINK_NODE, thread);
                        assert gt_search.NIL != Types.function_spec_p(combine_fn) : combine_fn;
                        final SubLObject _prev_bind_0_$33 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_combine_fn$.bind(combine_fn, thread);
                            assert gt_search.NIL != Types.function_spec_p(select_fn) : select_fn;
                            final SubLObject _prev_bind_0_$34 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_fn$.bind(select_fn, thread);
                                gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                            }
                            finally {
                                gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                        finally {
                            gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$32, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$31, thread);
            }
            if (gt_search.NIL != gt_utilities.gt_reflexiveP() && gt_search.NIL != Functions.funcall(select_fn, constant)) {
                gt_vars.$gt_result$.setDynamicValue(Functions.funcall(combine_fn, constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 10024L)
    public static SubLObject gt_select_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
            if (gt_search.NIL != Functions.funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node)) {
                gt_vars.$gt_result$.setDynamicValue(Functions.funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 10308L)
    public static SubLObject gt_all_dependent_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject reflexiveP = gt_utilities.gt_reflexiveP();
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$36 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                try {
                    gt_mark_as_searched(constant);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP) : gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP;
                    final SubLObject _prev_bind_0_$37 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$37, thread);
                    }
                    gt_mark_unselect_all_accessed_as_unsearched(constant);
                    gt_gather_marked_accessed(constant);
                    if (gt_search.NIL != reflexiveP && gt_search.NIL != gt_utilities.gt_all_predecessors_searchedP(constant)) {
                        gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(constant, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        gt_mark_as_unsearched(constant);
                        assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) : gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP;
                        final SubLObject _prev_bind_0_$39 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                            gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$39, thread);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                    }
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$36, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 11044L)
    public static SubLObject gt_gather_marked_accessed(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_search.$int15$128, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED), thread);
            try {
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym21$GT_GATHER_MARKED_LINK_NODE) : gt_search.$sym21$GT_GATHER_MARKED_LINK_NODE;
                final SubLObject _prev_bind_0_$40 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym21$GT_GATHER_MARKED_LINK_NODE, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym17$CONS) : gt_search.$sym17$CONS;
                    final SubLObject _prev_bind_0_$41 = gt_vars.$gt_combine_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_combine_fn$.bind((SubLObject)gt_search.$sym17$CONS, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_combine_fn$.rebind(_prev_bind_0_$41, thread);
                    }
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$40, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) : gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP;
                    final SubLObject _prev_bind_0_$43 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$43, thread);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        }
        finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 11379L)
    public static SubLObject gt_gather_marked_link_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            if (gt_search.NIL != gt_searched_in_target_spaceP(node, (SubLObject)gt_search.UNPROVIDED)) {
                gt_utilities.gt_step_fn_funcall(node);
                gt_vars.$gt_result$.setDynamicValue(Functions.funcall(gt_vars.$gt_combine_fn$.getDynamicValue(thread), node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                gt_mark_as_unsearched_in_space(node, gt_vars.$gt_target_marking_table$.getDynamicValue(thread));
            }
        }
        return gt_vars.$gt_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 11745L)
    public static SubLObject gt_mark_unselect_all_accessed_as_unsearched(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_search.$int15$128, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED), thread);
            try {
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED) : gt_search.$sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED;
                final SubLObject _prev_bind_0_$44 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym23$GT_ALL_PREDECESSORS_SEARCHED_) : gt_search.$sym23$GT_ALL_PREDECESSORS_SEARCHED_;
                    final SubLObject _prev_bind_0_$45 = gt_vars.$gt_compose_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_compose_fn$.bind((SubLObject)gt_search.$sym23$GT_ALL_PREDECESSORS_SEARCHED_, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_compose_fn$.rebind(_prev_bind_0_$45, thread);
                    }
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$44, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) : gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP;
                    final SubLObject _prev_bind_0_$47 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                        gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$47, thread);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        }
        finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 12129L)
    public static SubLObject gt_mark_unselect_link_node_all_accessed_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            if (gt_search.NIL != gt_searched_in_target_spaceP(node, (SubLObject)gt_search.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_marking_table$.bind(gt_vars.$gt_target_marking_table$.getDynamicValue(thread), thread);
                    if (gt_search.NIL == Functions.funcall(gt_vars.$gt_compose_fn$.getDynamicValue(thread), node)) {
                        gt_mark_as_unsearched(node);
                        assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) : gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP;
                        final SubLObject _prev_bind_0_$48 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                            gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                }
                finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_0, thread);
                }
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 12601L)
    public static SubLObject gt_compose_pred_all_accessed(final SubLObject constant, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject reflexiveP = gt_utilities.gt_reflexiveP();
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            if (gt_search.NIL != ((gt_search.NIL == gt_vars.$tt_pred$.getDynamicValue(thread) || gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL) && !gt_search.assertionsDisabledInClass && gt_search.NIL == Types.function_spec_p((SubLObject)((gt_search.NIL == gt_vars.$tt_pred$.getDynamicValue(thread) || gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL))) {
                throw new AssertionError((gt_search.NIL == gt_vars.$tt_pred$.getDynamicValue(thread) || gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL);
            }
            final SubLObject _prev_bind_0_$49 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)((gt_search.NIL == gt_vars.$tt_pred$.getDynamicValue(thread) || gt_search.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? gt_search.$sym10$GT_MAP_LINKS : gt_search.NIL), thread);
                try {
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym24$GT_COMPOSE_PRED_LINK_NODE) : gt_search.$sym24$GT_COMPOSE_PRED_LINK_NODE;
                    final SubLObject _prev_bind_0_$50 = gt_vars.$gt_base_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym24$GT_COMPOSE_PRED_LINK_NODE, thread);
                        assert gt_search.NIL != forts.fort_p(pred) : pred;
                        final SubLObject _prev_bind_0_$51 = gt_vars.$gt_compose_pred$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_pred$.bind(pred, thread);
                            gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                            if (gt_search.NIL != reflexiveP) {
                                gt_compose_pred_link_node_int(constant);
                            }
                        }
                        finally {
                            gt_vars.$gt_compose_pred$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$50, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                    }
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$49, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 13154L)
    public static SubLObject gt_compose_pred_link_node(final SubLObject node) {
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            try {
                gt_utilities.gt_step_fn_funcall(node);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)gt_search.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    gt_compose_pred_link_node_int(node);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 13394L)
    public static SubLObject gt_compose_pred_link_node_int(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_step_fn$.currentBinding(thread);
        try {
            gt_vars.$gt_pred$.bind(gt_vars.$gt_compose_pred$.getDynamicValue(thread), thread);
            gt_vars.$gt_index_arg$.bind(gt_vars.$gt_compose_index_arg$.getDynamicValue(thread), thread);
            gt_vars.$gt_gather_arg$.bind(gt_vars.$gt_compose_gather_arg$.getDynamicValue(thread), thread);
            gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.NIL, thread);
            if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw0$DIRECTED)) {
                Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw0$DIRECTED);
            }
            final SubLObject _prev_bind_0_$53 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw0$DIRECTED, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE) : gt_search.$sym5$GT_GATHER_LINK_NODE;
                final SubLObject _prev_bind_0_$54 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym5$GT_GATHER_LINK_NODE, thread);
                    gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$54, thread);
                }
            }
            finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$53, thread);
            }
        }
        finally {
            gt_vars.$gt_step_fn$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 13697L)
    public static SubLObject gt_why_accessesP(final SubLObject constant, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        if (target.equal(constant)) {
            if (gt_search.NIL != gt_utilities.gt_reflexiveP()) {
                result = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list(gt_search.$const26$equals, target, constant), (SubLObject)gt_search.$list27));
            }
        }
        else {
            final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
            final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
            try {
                gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
                gt_vars.$gt_doneP$.bind((SubLObject)gt_search.NIL, thread);
                final SubLObject _prev_bind_0_$55 = gt_vars.$gt_target$.currentBinding(thread);
                try {
                    gt_vars.$gt_target$.bind(target, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.EQL) : gt_search.EQL;
                    final SubLObject _prev_bind_0_$56 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_compare_fn$.bind((SubLObject)gt_search.EQL, thread);
                        assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
                        final SubLObject _prev_bind_0_$57 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                            try {
                                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym28$GT_GATHER_ACCESS_JUST) : gt_search.$sym28$GT_GATHER_ACCESS_JUST;
                                final SubLObject _prev_bind_0_$58 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym28$GT_GATHER_ACCESS_JUST, thread);
                                    gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                                }
                                finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$58, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                }
                            }
                        }
                        finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$57, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$56, thread);
                    }
                }
                finally {
                    gt_vars.$gt_target$.rebind(_prev_bind_0_$55, thread);
                }
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            }
            finally {
                gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 14260L)
    public static SubLObject gt_gather_access_just(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sup = gt_vars.gt_link_support();
        if (gt_search.NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
            gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(sup, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            gt_finished((SubLObject)gt_search.UNPROVIDED);
        }
        else if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_vars.$gt_result$.getDynamicValue(thread) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
            if (gt_search.NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(sup, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 14700L)
    public static SubLObject gt_any_access_path(final SubLObject constant, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        if (target.equal(constant)) {
            if (gt_search.NIL != gt_utilities.gt_reflexiveP()) {
                result = (SubLObject)ConsesLow.list(constant);
            }
        }
        else {
            final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
            final SubLObject _prev_bind_2 = gt_vars.$gt_doneP$.currentBinding(thread);
            try {
                gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
                gt_vars.$gt_doneP$.bind((SubLObject)gt_search.NIL, thread);
                final SubLObject _prev_bind_0_$60 = gt_vars.$gt_target$.currentBinding(thread);
                try {
                    gt_vars.$gt_target$.bind(target, thread);
                    assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.EQL) : gt_search.EQL;
                    final SubLObject _prev_bind_0_$61 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                    try {
                        gt_vars.$gt_compare_fn$.bind((SubLObject)gt_search.EQL, thread);
                        assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
                        final SubLObject _prev_bind_0_$62 = gt_vars.$gt_step_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                            try {
                                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym29$GT_GATHER_ACCESS_PATH) : gt_search.$sym29$GT_GATHER_ACCESS_PATH;
                                final SubLObject _prev_bind_0_$63 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym29$GT_GATHER_ACCESS_PATH, thread);
                                    gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                                }
                                finally {
                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$63, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                }
                            }
                        }
                        finally {
                            gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$62, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$61, thread);
                    }
                }
                finally {
                    gt_vars.$gt_target$.rebind(_prev_bind_0_$60, thread);
                }
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            }
            finally {
                gt_vars.$gt_doneP$.rebind(_prev_bind_2, thread);
                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 15244L)
    public static SubLObject gt_gather_access_path(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_compare_fn_funcall(node, gt_vars.$gt_target$.getDynamicValue(thread))) {
            gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            gt_finished((SubLObject)gt_search.UNPROVIDED);
        }
        else if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_vars.$gt_result$.getDynamicValue(thread) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
            if (gt_search.NIL != gt_vars.$gt_result$.getDynamicValue(thread)) {
                gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(node, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 15603L)
    public static SubLObject gt_min_mts_of_paths(final SubLObject inferior, final SubLObject superior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject path = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)gt_search.$sym30$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(gt_search.$const31$EverythingPSC, thread);
            path = gt_methods.gtm_why_superiorP(superior, inferior, (SubLObject)gt_search.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (path.equal((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list(gt_search.$const26$equals, superior, inferior), (SubLObject)gt_search.$list27)))) {
            return isa.min_mts_of_isa_paths(gt_vars.$gt_pred$.getDynamicValue(thread), gt_search.$const32$ReflexiveBinaryPredicate, (SubLObject)gt_search.UNPROVIDED);
        }
        SubLObject mts = (SubLObject)gt_search.NIL;
        SubLObject cdolist_list_var = path;
        SubLObject assertion = (SubLObject)gt_search.NIL;
        assertion = cdolist_list_var.first();
        while (gt_search.NIL != cdolist_list_var) {
            if (gt_search.NIL != term.kb_assertionP(assertion)) {
                mts = (SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        if (gt_search.NIL != mts) {
            mts = genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), (SubLObject)gt_search.UNPROVIDED);
            return (SubLObject)ConsesLow.list(mts);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 16218L)
    public static SubLObject gt_maximin_mts_among_lists(final SubLObject old_marking, final SubLObject assertion_mt) {
        SubLObject old_mark = old_marking;
        SubLObject check_list = (SubLObject)gt_search.NIL;
        SubLObject result = (SubLObject)gt_search.NIL;
        if (gt_search.NIL != old_mark) {
            if (old_mark.isAtom()) {
                old_mark = (SubLObject)ConsesLow.list(old_mark);
            }
            SubLObject cdolist_list_var = old_mark;
            SubLObject mark_mt = (SubLObject)gt_search.NIL;
            mark_mt = cdolist_list_var.first();
            while (gt_search.NIL != cdolist_list_var) {
                check_list = (SubLObject)ConsesLow.list(mark_mt, assertion_mt);
                result = (SubLObject)ConsesLow.cons(gt_methods.gt_max_floors(gt_search.$const33$genlMt, gt_methods.gt_min_nodes(gt_search.$const33$genlMt, check_list, (SubLObject)gt_search.UNPROVIDED), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED), result);
                cdolist_list_var = cdolist_list_var.rest();
                mark_mt = cdolist_list_var.first();
            }
        }
        else {
            result = assertion_mt;
        }
        return list_utilities.flatten(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 16774L)
    public static SubLObject gt_gather_link_node_and_max_mts(final SubLObject to_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject from_node = gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread).first();
        final SubLObject to_searchedP = gt_searchedP(to_node);
        final SubLObject from_searchedP = gt_searchedP(from_node);
        final SubLObject mt = gt_vars.gt_link_mt();
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
            SubLObject maximized_mt = (SubLObject)gt_search.NIL;
            if (gt_search.NIL == subl_promotions.memberP(to_node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) {
                gt_vars.$gt_path_list_of_nodes$.setDynamicValue((SubLObject)ConsesLow.cons(to_node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                final SubLObject _prev_bind_0_$65 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind((SubLObject)gt_search.NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_search.$int15$128, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED), thread);
                    maximized_mt = gt_maximin_mts_among_lists(from_searchedP, mt);
                }
                finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$65, thread);
                }
                if (gt_search.NIL != to_searchedP) {
                    final SubLObject _prev_bind_0_$66 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                    _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                    try {
                        gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                        gt_vars.$gt_marking_table$.bind((SubLObject)gt_search.NIL, thread);
                        gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_search.$int15$128, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED), thread);
                        maximized_mt = gt_methods.gt_max_nodes(gt_search.$const33$genlMt, ConsesLow.append(to_searchedP, maximized_mt), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$66, thread);
                    }
                    if (gt_search.NIL == list_utilities.sets_equalP(to_searchedP, maximized_mt, (SubLObject)gt_search.UNPROVIDED)) {
                        gt_mark_as_searched_with(to_node, maximized_mt);
                        gt_utilities.gt_step_fn_funcall(to_node);
                    }
                }
                else {
                    gt_mark_as_searched_with(to_node, maximized_mt);
                    gt_utilities.gt_step_fn_funcall(to_node);
                }
            }
        }
        finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 17682L)
    public static SubLObject gt_mark_link_node_as_unsearched_and_collect_mts(final SubLObject node) {
        final SubLObject mts = gt_searchedP(node);
        if (gt_search.NIL != mts) {
            gt_add_to_result((SubLObject)ConsesLow.cons(node, mts));
            gt_mark_as_unsearched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 17920L)
    public static SubLObject gt_mark_as_unsearched_and_collect_all_accessed(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gt_search.NIL != enumeration_types.truth_p((SubLObject)gt_search.$kw34$TRUE) : gt_search.$kw34$TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind((SubLObject)gt_search.$kw34$TRUE, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$67 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS) : gt_search.$sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS;
                final SubLObject _prev_bind_0_$68 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS, thread);
                    gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$68, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$67, thread);
            }
        }
        finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 18152L)
    public static SubLObject gt_all_accessed_with_mts(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_path_list_of_nodes$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_path_list_of_nodes$.setDynamicValue((SubLObject)ConsesLow.cons(constant, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$69 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS) : gt_search.$sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS;
                final SubLObject _prev_bind_0_$70 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS, thread);
                    gt_map_links(constant, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$70, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$69, thread);
            }
            gt_mark_as_unsearched_and_collect_all_accessed(constant);
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 18547L)
    public static SubLObject gt_gather_link_node_and_store_edges(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = gt_vars.gt_link_support();
        final SubLObject edge = (SubLObject)ConsesLow.list(assertions_high.gaf_arg1(assertion), assertions_high.gaf_arg2(assertion));
        final SubLObject marking = gt_searchedP(node);
        final SubLObject _prev_bind_0 = gt_vars.$gt_edge_list$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_edge_list$.bind((SubLObject)ConsesLow.cons(edge, gt_vars.$gt_edge_list$.getDynamicValue(thread)), thread);
            gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
            if (node.equalp(gt_vars.$gt_goal_node$.getDynamicValue(thread))) {
                gt_vars.$gt_result$.setDynamicValue(ConsesLow.append(gt_vars.$gt_edge_list$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                SubLObject cdolist_list_var = gt_vars.$gt_edge_list$.getDynamicValue(thread);
                SubLObject edge_$71 = (SubLObject)gt_search.NIL;
                edge_$71 = cdolist_list_var.first();
                while (gt_search.NIL != cdolist_list_var) {
                    gt_mark_as_searched_with(edge_$71.first(), (SubLObject)gt_search.TWO_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    edge_$71 = cdolist_list_var.first();
                }
                gt_vars.$gt_edge_list$.setDynamicValue((SubLObject)gt_search.NIL, thread);
            }
            else {
                final SubLObject pcase_var = marking;
                if (pcase_var.eql((SubLObject)gt_search.$sym38$QUOTE) || pcase_var.eql((SubLObject)gt_search.NIL)) {
                    gt_mark_as_searched_with(node, (SubLObject)gt_search.ONE_INTEGER);
                    gt_vars.$gt_path_list_of_nodes$.setDynamicValue((SubLObject)ConsesLow.cons(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                    gt_utilities.gt_step_fn_funcall(node);
                }
                else if (pcase_var.eql((SubLObject)gt_search.ONE_INTEGER)) {
                    if (gt_search.NIL != subl_promotions.memberP(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) {
                        gt_vars.$gt_cyclical_edges$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node, gt_vars.$gt_edge_list$.getDynamicValue(thread)), gt_vars.$gt_cyclical_edges$.getDynamicValue(thread)), thread);
                    }
                }
                else if (pcase_var.eql((SubLObject)gt_search.TWO_INTEGER)) {
                    gt_vars.$gt_result$.setDynamicValue(ConsesLow.append(gt_vars.$gt_edge_list$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var2 = gt_vars.$gt_edge_list$.getDynamicValue(thread);
                    SubLObject edge_$72 = (SubLObject)gt_search.NIL;
                    edge_$72 = cdolist_list_var2.first();
                    while (gt_search.NIL != cdolist_list_var2) {
                        gt_mark_as_searched_with(edge_$72.first(), (SubLObject)gt_search.TWO_INTEGER);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        edge_$72 = cdolist_list_var2.first();
                    }
                    gt_vars.$gt_edge_list$.setDynamicValue((SubLObject)gt_search.NIL, thread);
                }
            }
        }
        finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_edge_list$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 19764L)
    public static SubLObject gt_check_for_cycle_edges_to_add() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$gt_cyclical_edges$.getDynamicValue(thread);
        SubLObject cycle = (SubLObject)gt_search.NIL;
        cycle = cdolist_list_var.first();
        while (gt_search.NIL != cdolist_list_var) {
            if (gt_searchedP(cycle.first()).eql((SubLObject)gt_search.TWO_INTEGER)) {
                gt_vars.$gt_result$.setDynamicValue(ConsesLow.append(conses_high.cadr(cycle), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycle = cdolist_list_var.first();
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 19969L)
    public static SubLObject gt_all_edges_to_goal(final SubLObject start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_cyclical_edges$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            gt_vars.$gt_cyclical_edges$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$73 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES) : gt_search.$sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES;
                final SubLObject _prev_bind_0_$74 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES, thread);
                    gt_map_links(start, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$74, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$73, thread);
            }
            gt_check_for_cycle_edges_to_add();
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_cyclical_edges$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 20283L)
    public static SubLObject gt_access_all_while_storing_paths(final SubLObject start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) : gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS;
            final SubLObject _prev_bind_0_$75 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS) : gt_search.$sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS;
                final SubLObject _prev_bind_0_$76 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS, thread);
                    gt_map_links_rebinding_candidate_mts(start, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$76, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$75, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 20603L)
    public static SubLObject gt_gather_link_nodes_and_store_all_paths(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = gt_vars.gt_link_support();
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_list_of_assertions$.currentBinding(thread);
        try {
            gt_vars.$gt_path_list_of_assertions$.bind((SubLObject)ConsesLow.cons(assertion, gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread)), thread);
            if (node.equalp(gt_vars.$gt_goal_node$.getDynamicValue(thread))) {
                SubLObject cdolist_list_var = gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread);
                SubLObject assertion_$77 = (SubLObject)gt_search.NIL;
                assertion_$77 = cdolist_list_var.first();
                while (gt_search.NIL != cdolist_list_var) {
                    gt_mark_as_unsearched(assertions_high.gaf_arg2(assertion_$77));
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_$77 = cdolist_list_var.first();
                }
                gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(gt_vars.$gt_path_list_of_assertions$.getDynamicValue(thread), gt_vars.$gt_result$.getDynamicValue(thread)), thread);
            }
            else if (gt_search.NIL == gt_searchedP(node)) {
                gt_mark_as_searched(node);
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        finally {
            gt_vars.$gt_path_list_of_assertions$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 21110L)
    public static SubLObject gt_access_all_while_unifying_mts(final SubLObject start) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_search.NIL, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS) : gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS;
            final SubLObject _prev_bind_0_$78 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY) : gt_search.$sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY;
                final SubLObject _prev_bind_0_$79 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY, thread);
                    gt_map_links_rebinding_candidate_mts(start, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$79, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$78, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 21501L)
    public static SubLObject gt_map_links_rebinding_candidate_mts(final SubLObject constant, SubLObject fn) {
        if (fn == gt_search.UNPROVIDED) {
            fn = gt_vars.$gt_base_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_search.$kw43$ASSERTION)) {
            gt_map_assertion_links(constant, fn);
        }
        else {
            gt_utilities.gt_error((SubLObject)gt_search.THREE_INTEGER, (SubLObject)gt_search.$str44$illegal_value_of__gt_link_type___, gt_vars.$gt_link_type$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 21860L)
    public static SubLObject gt_gather_link_nodes_and_unify_mts_along_the_way(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_mt = gt_vars.gt_link_mt();
        final SubLObject link_pred = gt_vars.gt_link_pred();
        SubLObject gp_mt = (SubLObject)gt_search.NIL;
        SubLObject searched_by_lists = (SubLObject)gt_search.NIL;
        SubLObject path_mts = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_path_length$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_list_of_path_lengths$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_path_list_of_mts$.currentBinding(thread);
        try {
            gt_vars.$gt_path_length$.bind(gt_vars.$gt_path_length$.getDynamicValue(thread), thread);
            gt_vars.$gt_list_of_path_lengths$.bind(gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread), thread);
            gt_vars.$gt_path_list_of_nodes$.bind(gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), thread);
            gt_vars.$gt_path_list_of_mts$.bind(gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread), thread);
            if (!link_pred.eql(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                gp_mt = ((gt_search.NIL != genl_predicates.genl_predicateP(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) ? genl_predicates.max_floor_mts_of_genl_pred_paths(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread)).first() : genl_predicates.max_floor_mts_of_genl_inverse_paths(link_pred, gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED).first());
            }
            adjudiciate_adding_mt(link_mt);
            if (gt_search.NIL != gp_mt) {
                adjudiciate_adding_mt(gp_mt);
            }
            searched_by_lists = gt_searchedP(node);
            path_mts = gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread);
            if (node.equalp(gt_vars.$gt_what_mts_goal_node$.getDynamicValue(thread))) {
                gt_maxs_of_mt_list(gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread));
            }
            else if (gt_search.NIL == subl_promotions.memberP(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread), (SubLObject)gt_search.$sym45$HLMT_EQUAL, (SubLObject)gt_search.UNPROVIDED) && gt_search.NIL == is_x_a_path_list_in_yP(path_mts, searched_by_lists)) {
                gt_mark_as_searched_by(node, path_mts);
                gt_vars.$gt_path_list_of_nodes$.setDynamicValue((SubLObject)ConsesLow.cons(node, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
                gt_vars.$gt_list_of_path_lengths$.setDynamicValue((SubLObject)ConsesLow.cons(gt_vars.$gt_path_length$.getDynamicValue(thread), gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread)), thread);
                gt_utilities.gt_step_fn_funcall(node);
            }
        }
        finally {
            gt_vars.$gt_path_list_of_mts$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_list_of_path_lengths$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_path_length$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 23449L)
    public static SubLObject gt_maxs_of_mt_list(final SubLObject mt_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mt_list, (SubLObject)gt_search.UNPROVIDED);
        if (gt_search.NIL != result) {
            gt_vars.$gt_what_mts_result$.setDynamicValue(ConsesLow.append(gt_vars.$gt_what_mts_result$.getDynamicValue(thread), result), thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 23754L)
    public static SubLObject is_x_a_path_list_in_yP(final SubLObject x, final SubLObject y) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject flag = (SubLObject)gt_search.NIL;
        SubLObject result = (SubLObject)gt_search.NIL;
        SubLObject y_lyst = y;
        if (gt_search.NIL == flag) {
            SubLObject csome_list_var = gt_vars.$gt_list_of_path_lengths$.getDynamicValue(thread);
            SubLObject check_number = (SubLObject)gt_search.NIL;
            check_number = csome_list_var.first();
            while (gt_search.NIL == flag && gt_search.NIL != csome_list_var) {
                if (check_number.eql(gt_vars.$gt_path_length$.getDynamicValue(thread)) && gt_search.NIL != fort_sets_equal(x, y_lyst.first())) {
                    result = (SubLObject)gt_search.T;
                    flag = (SubLObject)gt_search.T;
                }
                else {
                    y_lyst = y_lyst.rest();
                }
                csome_list_var = csome_list_var.rest();
                check_number = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 24070L)
    public static SubLObject fort_sets_equal(final SubLObject set_a, final SubLObject set_b) {
        SubLObject flag = (SubLObject)gt_search.NIL;
        final SubLObject temporary_marking_space = Hashtables.make_hash_table((SubLObject)gt_search.$int46$512, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
        SubLObject result = (SubLObject)gt_search.T;
        if (gt_search.NIL == set_b && gt_search.NIL != set_a) {
            result = (SubLObject)gt_search.NIL;
        }
        SubLObject cdolist_list_var = set_a;
        SubLObject node = (SubLObject)gt_search.NIL;
        node = cdolist_list_var.first();
        while (gt_search.NIL != cdolist_list_var) {
            gt_mark_as_searched_in_target_space(node, (SubLObject)gt_search.T, temporary_marking_space);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        if (gt_search.NIL == flag) {
            SubLObject csome_list_var = set_b;
            node = (SubLObject)gt_search.NIL;
            node = csome_list_var.first();
            while (gt_search.NIL == flag && gt_search.NIL != csome_list_var) {
                if (gt_search.NIL == gt_searched_in_target_spaceP(node, temporary_marking_space)) {
                    result = (SubLObject)gt_search.NIL;
                    flag = (SubLObject)gt_search.T;
                }
                csome_list_var = csome_list_var.rest();
                node = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 24530L)
    public static SubLObject adjudiciate_adding_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject memberP = subl_promotions.memberP(mt, gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread), (SubLObject)gt_search.$sym45$HLMT_EQUAL, (SubLObject)gt_search.UNPROVIDED);
        if (gt_search.NIL == memberP) {
            gt_vars.$gt_path_list_of_mts$.setDynamicValue((SubLObject)ConsesLow.cons(mt, gt_vars.$gt_path_list_of_mts$.getDynamicValue(thread)), thread);
            gt_vars.$gt_path_length$.setDynamicValue(Numbers.add(gt_vars.$gt_path_length$.getDynamicValue(thread), (SubLObject)gt_search.ONE_INTEGER), thread);
        }
        return memberP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 24744L)
    public static SubLObject gt_finished(SubLObject result) {
        if (result == gt_search.UNPROVIDED) {
            result = (SubLObject)gt_search.NIL;
        }
        if (gt_search.NIL != result) {
            gt_vars.$gt_result$.setDynamicValue(result);
        }
        utilities_macros.mapping_finished();
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 24902L)
    public static SubLObject gt_map_links(final SubLObject constant, SubLObject fn) {
        if (fn == gt_search.UNPROVIDED) {
            fn = gt_vars.$gt_base_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cutoff_reached = (SubLObject)gt_search.NIL;
        final SubLObject _prev_bind_0 = gt_macros.$gt_recursion_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_depth_cutoff$.currentBinding(thread);
        try {
            gt_macros.$gt_recursion_cutoff$.bind((SubLObject)(gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).isInteger() ? Numbers.subtract(gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread), (SubLObject)gt_search.ONE_INTEGER) : gt_search.NIL), thread);
            gt_vars.$gt_depth_cutoff$.bind(Numbers.subtract(gt_vars.$gt_depth_cutoff$.getDynamicValue(thread), (SubLObject)gt_search.ONE_INTEGER), thread);
            if (gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).isInteger() && gt_macros.$gt_recursion_cutoff$.getDynamicValue(thread).numL((SubLObject)gt_search.ZERO_INTEGER)) {
                Errors.error((SubLObject)gt_search.$str47$GT_recursion_limit_reached_);
            }
            if (gt_search.NIL != gt_vars.$gt_depth_cutoffP$.getDynamicValue(thread) && gt_vars.$gt_depth_cutoff$.getDynamicValue(thread).numL((SubLObject)gt_search.ZERO_INTEGER)) {
                cutoff_reached = (SubLObject)gt_search.T;
            }
            if (gt_search.NIL != gt_vars.$gt_time_cutoffP$.getDynamicValue(thread) && gt_vars.$gt_time_cutoff$.getDynamicValue(thread).numL(Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), gt_vars.$gt_initial_time$.getDynamicValue(thread)), time_high.$internal_time_units_per_second$.getGlobalValue()))) {
                cutoff_reached = (SubLObject)gt_search.T;
            }
            if (gt_search.NIL == cutoff_reached) {
                final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql((SubLObject)gt_search.$kw43$ASSERTION)) {
                    gt_map_assertion_links(constant, fn);
                }
                else if (pcase_var.eql((SubLObject)gt_search.$kw48$ACCESSORS)) {
                    gt_map_accessors_links(constant, fn);
                }
                else {
                    gt_utilities.gt_error((SubLObject)gt_search.THREE_INTEGER, (SubLObject)gt_search.$str44$illegal_value_of__gt_link_type___, gt_vars.$gt_link_type$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
                }
            }
        }
        finally {
            gt_vars.$gt_depth_cutoff$.rebind(_prev_bind_2, thread);
            gt_macros.$gt_recursion_cutoff$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 25353L)
    public static SubLObject gt_map_assertion_links(final SubLObject constant, final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
        try {
            kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)gt_search.NIL, thread);
            final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)gt_search.$kw0$DIRECTED)) {
                gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)gt_search.$kw3$INVERSE)) {
                gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)gt_search.$kw1$SUPERIOR)) {
                gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)gt_search.$kw2$INFERIOR)) {
                gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)gt_search.$kw49$ACCESSIBLE)) {
                if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw1$SUPERIOR)) {
                    Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw1$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$80 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw1$SUPERIOR, thread);
                    gt_map_arg_index(fn, constant, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$80, thread);
                }
                Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw2$INFERIOR)) {
                    Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw2$INFERIOR);
                }
                final SubLObject _prev_bind_0_$81 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw2$INFERIOR, thread);
                    gt_map_arg_index(fn, constant, gt_vars.$gt_gather_arg$.getDynamicValue(thread), gt_vars.$gt_pred$.getDynamicValue(thread), gt_vars.$gt_truth$.getDynamicValue(thread));
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$81, thread);
                }
            }
            else {
                gt_utilities.gt_error((SubLObject)gt_search.FIVE_INTEGER, (SubLObject)gt_search.$str4$illegal_value_of__gt_mode____s, gt_vars.$gt_mode$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
            }
        }
        finally {
            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 26575L)
    public static SubLObject gt_map_accessors_links(final SubLObject constant, final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
        SubLObject accessor = (SubLObject)gt_search.NIL;
        accessor = cdolist_list_var.first();
        while (gt_search.NIL != cdolist_list_var) {
            if (accessor.isCons()) {
                SubLObject current;
                final SubLObject datum = current = accessor;
                final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                try {
                    gt_vars.$gt_pred$.bind((SubLObject)gt_search.NIL, thread);
                    gt_vars.$gt_index_arg$.bind((SubLObject)gt_search.NIL, thread);
                    gt_vars.$gt_gather_arg$.bind((SubLObject)gt_search.NIL, thread);
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list50);
                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list50);
                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list50);
                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    if (gt_search.NIL == current) {
                        gt_map_assertion_links(constant, fn);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_search.$list50);
                    }
                }
                finally {
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            accessor = cdolist_list_var.first();
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 26819L)
    public static SubLObject gt_map_arg_index(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject pred, SubLObject truth) {
        if (truth == gt_search.UNPROVIDED) {
            truth = (SubLObject)gt_search.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)gt_search.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)gt_search.T, thread);
            if (gt_search.NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                gt_gp_mapper(function, v_term, arg, pred);
            }
            else {
                gt_mapper(function, v_term, arg, pred, truth);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 27054L)
    public static SubLObject gt_gp_mapper(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = (SubLObject)gt_search.NIL;
        try {
            thread.throwStack.push(gt_search.$kw51$MAPPING_DONE);
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)gt_search.$sym52$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                final SubLObject pred_var = (SubLObject)gt_search.NIL;
                if (gt_search.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                    SubLObject done_var = (SubLObject)gt_search.NIL;
                    final SubLObject token_var = (SubLObject)gt_search.NIL;
                    while (gt_search.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (gt_search.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)gt_search.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gt_search.$kw53$GAF, (SubLObject)gt_search.$kw34$TRUE, (SubLObject)gt_search.NIL);
                                SubLObject done_var_$82 = (SubLObject)gt_search.NIL;
                                final SubLObject token_var_$83 = (SubLObject)gt_search.NIL;
                                while (gt_search.NIL == done_var_$82) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                    final SubLObject valid_$84 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$83.eql(assertion));
                                    if (gt_search.NIL != valid_$84 && gt_search.NIL == assertion_utilities.excepted_assertionP(assertion, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) {
                                        final SubLObject _prev_bind_0_$85 = gt_vars.$gt_link_support$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_link_support$.bind(assertion, thread);
                                            final SubLObject node = gt_link_node(assertion);
                                            gt_utilities.gt_gp_mapper_funcall(function, node);
                                        }
                                        finally {
                                            gt_vars.$gt_link_support$.rebind(_prev_bind_0_$85, thread);
                                        }
                                    }
                                    done_var_$82 = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid_$84);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (gt_search.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (gt_search.NIL != kb_gp_mapping.dgaigp_binaryP(pred)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)gt_search.$sym54$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(pred, thread);
                    final SubLObject pred_var = (SubLObject)gt_search.NIL;
                    if (gt_search.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
                        SubLObject done_var = (SubLObject)gt_search.NIL;
                        final SubLObject token_var = (SubLObject)gt_search.NIL;
                        while (gt_search.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (gt_search.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)gt_search.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gt_search.$kw53$GAF, (SubLObject)gt_search.$kw34$TRUE, (SubLObject)gt_search.NIL);
                                    SubLObject done_var_$83 = (SubLObject)gt_search.NIL;
                                    final SubLObject token_var_$84 = (SubLObject)gt_search.NIL;
                                    while (gt_search.NIL == done_var_$83) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                        final SubLObject valid_$85 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$84.eql(assertion));
                                        if (gt_search.NIL != valid_$85) {
                                            final SubLObject _prev_bind_0_$87 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (gt_search.NIL == assertion_utilities.excepted_assertionP(assertion, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) {
                                                    final SubLObject _prev_bind_0_$88 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_link_support$.bind(assertion, thread);
                                                        final SubLObject node2 = gt_link_node(assertion);
                                                        gt_utilities.gt_gp_mapper_funcall(function, node2);
                                                    }
                                                    finally {
                                                        gt_vars.$gt_link_support$.rebind(_prev_bind_0_$88, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$87, thread);
                                            }
                                        }
                                        done_var_$83 = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid_$85);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (gt_search.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (gt_search.NIL != gt_vars.gt_use_sksiP()) {
                final SubLObject deck_type = (SubLObject)gt_search.$kw57$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)gt_search.NIL;
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)gt_search.NIL;
                        final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((gt_search.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((gt_search.NIL != tv_var) ? gt_search.$sym58$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (gt_search.NIL != tv_var && gt_search.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && gt_search.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)gt_search.$kw59$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)gt_search.ONE_INTEGER, (SubLObject)gt_search.$str60$_A_is_not_a__A, tv_var, (SubLObject)gt_search.$sym61$SBHL_TRUE_TV_P, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)gt_search.$kw62$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)gt_search.ONE_INTEGER, (SubLObject)gt_search.$str63$continue_anyway, (SubLObject)gt_search.$str60$_A_is_not_a__A, tv_var, (SubLObject)gt_search.$sym61$SBHL_TRUE_TV_P, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)gt_search.$kw64$WARN)) {
                                    Errors.warn((SubLObject)gt_search.$str60$_A_is_not_a__A, tv_var, (SubLObject)gt_search.$sym61$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)gt_search.$str65$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)gt_search.$str63$continue_anyway, (SubLObject)gt_search.$str60$_A_is_not_a__A, tv_var, (SubLObject)gt_search.$sym61$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(gt_search.$const66$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(gt_search.$const66$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(gt_search.$const66$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)gt_search.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(gt_search.$const66$genlPreds), thread);
                                if (gt_search.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || gt_search.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)gt_search.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$96 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(gt_search.$const66$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)gt_search.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)gt_search.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); gt_search.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$99 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$99;
                                            final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_modeP = predicate_mode;
                                                final SubLObject new_gather_argnum = (gt_search.NIL != inverse_modeP) ? gt_vars.$gt_index_arg$.getDynamicValue(thread) : gt_vars.$gt_gather_arg$.getDynamicValue(thread);
                                                final SubLObject new_index_argnum = (gt_search.NIL != inverse_modeP) ? gt_vars.$gt_gather_arg$.getDynamicValue(thread) : gt_vars.$gt_index_arg$.getDynamicValue(thread);
                                                SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(v_term, new_index_argnum, new_gather_argnum, spec_pred, (SubLObject)gt_search.$kw34$TRUE);
                                                SubLObject gather_arg_mt_pair = (SubLObject)gt_search.NIL;
                                                gather_arg_mt_pair = cdolist_list_var.first();
                                                while (gt_search.NIL != cdolist_list_var) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = gather_arg_mt_pair;
                                                    SubLObject link_node = (SubLObject)gt_search.NIL;
                                                    SubLObject link_mt = (SubLObject)gt_search.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list67);
                                                    link_node = current.first();
                                                    current = current.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list67);
                                                    link_mt = current.first();
                                                    current = current.rest();
                                                    if (gt_search.NIL == current) {
                                                        final SubLObject link_formula = el_utilities.make_el_formula(pred, (SubLObject)(gt_vars.$gt_index_arg$.getDynamicValue(thread).numE((SubLObject)gt_search.ONE_INTEGER) ? ConsesLow.list(v_term, link_node) : ConsesLow.list(link_node, v_term)), (SubLObject)gt_search.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$94 = gt_vars.$gt_link_support$.currentBinding(thread);
                                                        try {
                                                            gt_vars.$gt_link_support$.bind(sksi_sks_mapping_utilities.make_sksi_link_support(link_formula, link_mt), thread);
                                                            gt_utilities.gt_gp_mapper_funcall(function, link_node);
                                                        }
                                                        finally {
                                                            gt_vars.$gt_link_support$.rebind(_prev_bind_0_$94, thread);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_search.$list67);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    gather_arg_mt_pair = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(gt_search.$const66$genlPreds));
                                                SubLObject module_var = (SubLObject)gt_search.NIL;
                                                module_var = cdolist_list_var2.first();
                                                while (gt_search.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$95 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((gt_search.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(gt_search.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node3 = function_terms.naut_to_nart(node_var_$99);
                                                        if (gt_search.NIL != sbhl_link_vars.sbhl_node_object_p(node3)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node3, sbhl_module_vars.get_sbhl_module((SubLObject)gt_search.UNPROVIDED));
                                                            if (gt_search.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)gt_search.UNPROVIDED));
                                                                if (gt_search.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); gt_search.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (gt_search.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$105;
                                                                                for (iteration_state_$105 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); gt_search.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$105); iteration_state_$105 = dictionary_contents.do_dictionary_contents_next(iteration_state_$105)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$105);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (gt_search.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (gt_search.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)gt_search.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); gt_search.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (gt_search.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && gt_search.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)gt_search.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)gt_search.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)gt_search.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (gt_search.NIL != csome_list_var) {
                                                                                                    if (gt_search.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)gt_search.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)gt_search.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)gt_search.$str68$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$97, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$105);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$96, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)gt_search.FIVE_INTEGER, (SubLObject)gt_search.$str69$attempting_to_bind_direction_link, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (gt_search.NIL != obsolete.cnat_p(node3, (SubLObject)gt_search.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$107;
                                                            final SubLObject new_list = cdolist_list_var_$107 = ((gt_search.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)gt_search.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)gt_search.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)gt_search.NIL;
                                                            generating_fn = cdolist_list_var_$107.first();
                                                            while (gt_search.NIL != cdolist_list_var_$107) {
                                                                final SubLObject _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node3);
                                                                    if (gt_search.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)gt_search.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); gt_search.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (gt_search.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && gt_search.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)gt_search.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)gt_search.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)gt_search.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (gt_search.NIL != csome_list_var2) {
                                                                            if (gt_search.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)gt_search.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)gt_search.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)gt_search.$str68$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$98, thread);
                                                                }
                                                                cdolist_list_var_$107 = cdolist_list_var_$107.rest();
                                                                generating_fn = cdolist_list_var_$107.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$97, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$95, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var = cdolist_list_var2.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$93, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$98, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$96, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)gt_search.TWO_INTEGER, (SubLObject)gt_search.$str70$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)gt_search.UNPROVIDED)), (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$95, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$91, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$90, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_search.$kw51$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 27875L)
    public static SubLObject gt_mapper(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject pred, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = (SubLObject)gt_search.NIL;
        try {
            thread.throwStack.push(gt_search.$kw51$MAPPING_DONE);
            gt_map_gaf_arg_index_link_nodes(function, v_term, arg, pred, truth, (SubLObject)gt_search.UNPROVIDED);
            SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(v_term, gt_vars.$gt_index_arg$.getDynamicValue(thread), gt_vars.$gt_gather_arg$.getDynamicValue(thread), pred, (SubLObject)gt_search.$kw34$TRUE);
            SubLObject gather_arg_mt_pair = (SubLObject)gt_search.NIL;
            gather_arg_mt_pair = cdolist_list_var.first();
            while (gt_search.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = gather_arg_mt_pair;
                SubLObject link_node = (SubLObject)gt_search.NIL;
                SubLObject link_mt = (SubLObject)gt_search.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list67);
                link_node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_search.$list67);
                link_mt = current.first();
                current = current.rest();
                if (gt_search.NIL == current) {
                    final SubLObject link_formula = el_utilities.make_el_formula(pred, (SubLObject)(gt_vars.$gt_index_arg$.getDynamicValue(thread).numE((SubLObject)gt_search.ONE_INTEGER) ? ConsesLow.list(v_term, link_node) : ConsesLow.list(link_node, v_term)), (SubLObject)gt_search.UNPROVIDED);
                    final SubLObject _prev_bind_0 = gt_vars.$gt_link_support$.currentBinding(thread);
                    try {
                        gt_vars.$gt_link_support$.bind(sksi_sks_mapping_utilities.make_sksi_link_support(link_formula, link_mt), thread);
                        Functions.funcall(function, link_node);
                    }
                    finally {
                        gt_vars.$gt_link_support$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_search.$list67);
                }
                cdolist_list_var = cdolist_list_var.rest();
                gather_arg_mt_pair = cdolist_list_var.first();
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_search.$kw51$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 28491L)
    public static SubLObject gt_map_gaf_arg_index_link_nodes(final SubLObject function, final SubLObject v_term, final SubLObject argnum, SubLObject pred, SubLObject truth, SubLObject mt) {
        if (pred == gt_search.UNPROVIDED) {
            pred = (SubLObject)gt_search.NIL;
        }
        if (truth == gt_search.UNPROVIDED) {
            truth = (SubLObject)gt_search.NIL;
        }
        if (mt == gt_search.UNPROVIDED) {
            mt = (SubLObject)gt_search.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gt_search.NIL != Types.function_spec_p(function) : function;
        assert gt_search.NIL != subl_promotions.positive_integer_p(argnum) : argnum;
        SubLObject catch_var = (SubLObject)gt_search.NIL;
        try {
            thread.throwStack.push(gt_search.$kw51$MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if (gt_search.NIL != pred && gt_search.NIL != truth) {
                    final SubLObject pred_var = pred;
                    if (gt_search.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)gt_search.NIL;
                        final SubLObject token_var = (SubLObject)gt_search.NIL;
                        while (gt_search.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (gt_search.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)gt_search.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gt_search.$kw53$GAF, truth, (SubLObject)gt_search.NIL);
                                    SubLObject done_var_$110 = (SubLObject)gt_search.NIL;
                                    final SubLObject token_var_$111 = (SubLObject)gt_search.NIL;
                                    while (gt_search.NIL == done_var_$110) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$111);
                                        final SubLObject valid_$112 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$111.eql(ass));
                                        if (gt_search.NIL != valid_$112) {
                                            final SubLObject _prev_bind_0_$113 = gt_vars.$gt_link_support$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_link_support$.bind(ass, thread);
                                                final SubLObject node = gt_link_node(ass);
                                                Functions.funcall(function, node);
                                            }
                                            finally {
                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_$113, thread);
                                            }
                                        }
                                        done_var_$110 = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid_$112);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (gt_search.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid);
                        }
                    }
                }
                else if (gt_search.NIL != pred && gt_search.NIL == truth) {
                    final SubLObject pred_var = pred;
                    if (gt_search.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)gt_search.NIL;
                        final SubLObject token_var = (SubLObject)gt_search.NIL;
                        while (gt_search.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (gt_search.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)gt_search.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gt_search.$kw53$GAF, (SubLObject)gt_search.NIL, (SubLObject)gt_search.NIL);
                                    SubLObject done_var_$111 = (SubLObject)gt_search.NIL;
                                    final SubLObject token_var_$112 = (SubLObject)gt_search.NIL;
                                    while (gt_search.NIL == done_var_$111) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$112);
                                        final SubLObject valid_$113 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$112.eql(ass));
                                        if (gt_search.NIL != valid_$113) {
                                            final SubLObject _prev_bind_0_$115 = gt_vars.$gt_link_support$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_link_support$.bind(ass, thread);
                                                final SubLObject node = gt_link_node(ass);
                                                Functions.funcall(function, node);
                                            }
                                            finally {
                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_$115, thread);
                                            }
                                        }
                                        done_var_$111 = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid_$113);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (gt_search.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid);
                        }
                    }
                }
                else if (gt_search.NIL == pred && gt_search.NIL != truth) {
                    final SubLObject pred_var = (SubLObject)gt_search.NIL;
                    if (gt_search.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)gt_search.NIL;
                        final SubLObject token_var = (SubLObject)gt_search.NIL;
                        while (gt_search.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (gt_search.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)gt_search.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gt_search.$kw53$GAF, truth, (SubLObject)gt_search.NIL);
                                    SubLObject done_var_$112 = (SubLObject)gt_search.NIL;
                                    final SubLObject token_var_$113 = (SubLObject)gt_search.NIL;
                                    while (gt_search.NIL == done_var_$112) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$113);
                                        final SubLObject valid_$114 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$113.eql(ass));
                                        if (gt_search.NIL != valid_$114) {
                                            final SubLObject _prev_bind_0_$117 = gt_vars.$gt_link_support$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_link_support$.bind(ass, thread);
                                                final SubLObject node = gt_link_node(ass);
                                                Functions.funcall(function, node);
                                            }
                                            finally {
                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_$117, thread);
                                            }
                                        }
                                        done_var_$112 = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid_$114);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (gt_search.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid);
                        }
                    }
                }
                else if (gt_search.NIL == pred && gt_search.NIL == truth) {
                    final SubLObject pred_var = (SubLObject)gt_search.NIL;
                    if (gt_search.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)gt_search.NIL;
                        final SubLObject token_var = (SubLObject)gt_search.NIL;
                        while (gt_search.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (gt_search.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)gt_search.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gt_search.$kw53$GAF, (SubLObject)gt_search.NIL, (SubLObject)gt_search.NIL);
                                    SubLObject done_var_$113 = (SubLObject)gt_search.NIL;
                                    final SubLObject token_var_$114 = (SubLObject)gt_search.NIL;
                                    while (gt_search.NIL == done_var_$113) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$114);
                                        final SubLObject valid_$115 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$114.eql(ass));
                                        if (gt_search.NIL != valid_$115) {
                                            final SubLObject _prev_bind_0_$119 = gt_vars.$gt_link_support$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_link_support$.bind(ass, thread);
                                                final SubLObject node = gt_link_node(ass);
                                                Functions.funcall(function, node);
                                            }
                                            finally {
                                                gt_vars.$gt_link_support$.rebind(_prev_bind_0_$119, thread);
                                            }
                                        }
                                        done_var_$113 = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid_$115);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_search.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (gt_search.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == valid);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_search.$kw51$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 29886L)
    public static SubLObject gt_mark_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            Hashtables.sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), (SubLObject)gt_search.T);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 30275L)
    public static SubLObject gt_mark_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            Hashtables.sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), (SubLObject)gt_search.NIL);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 30489L)
    public static SubLObject gt_searchedP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            return Hashtables.gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 30609L)
    public static SubLObject gt_mark_as_searched_by(final SubLObject node, final SubLObject searcher) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            SubLObject list_in_there = (SubLObject)gt_search.NIL;
            list_in_there = Hashtables.gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED);
            Hashtables.sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), conses_high.adjoin(searcher, list_in_there, (SubLObject)gt_search.UNPROVIDED, (SubLObject)gt_search.UNPROVIDED));
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 30997L)
    public static SubLObject gt_mark_as_searched_with(final SubLObject node, final SubLObject marking) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            Hashtables.sethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), marking);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 31245L)
    public static SubLObject gt_searched_byP(final SubLObject node, final SubLObject searcher, SubLObject test) {
        if (test == gt_search.UNPROVIDED) {
            test = (SubLObject)gt_search.EQL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            return subl_promotions.memberP(searcher, Hashtables.gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED), test, (SubLObject)gt_search.UNPROVIDED);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 31424L)
    public static SubLObject gt_searched_by_allP(final SubLObject fort, final SubLObject searchers, SubLObject test) {
        if (test == gt_search.UNPROVIDED) {
            test = (SubLObject)gt_search.EQL;
        }
        SubLObject failP = (SubLObject)gt_search.NIL;
        if (gt_search.NIL == failP) {
            SubLObject csome_list_var;
            SubLObject searcher;
            for (csome_list_var = searchers, searcher = (SubLObject)gt_search.NIL, searcher = csome_list_var.first(); gt_search.NIL == failP && gt_search.NIL != csome_list_var; failP = (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == gt_searched_byP(fort, searcher, test)), csome_list_var = csome_list_var.rest(), searcher = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(gt_search.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 31659L)
    public static SubLObject gt_searched_in_target_spaceP(final SubLObject node, SubLObject target_space) {
        if (target_space == gt_search.UNPROVIDED) {
            target_space = gt_vars.$gt_target_marking_table$.getDynamicValue();
        }
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            return Hashtables.gethash(node, target_space, (SubLObject)gt_search.UNPROVIDED);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 31854L)
    public static SubLObject gt_mark_as_unsearched_in_space(final SubLObject node, SubLObject space) {
        if (space == gt_search.UNPROVIDED) {
            space = gt_vars.$gt_marking_table$.getDynamicValue();
        }
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            Hashtables.remhash(node, space);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 32004L)
    public static SubLObject gt_mark_as_searched_in_target_space(final SubLObject node, final SubLObject value, final SubLObject target_space) {
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            Hashtables.sethash(node, target_space, value);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 32157L)
    public static SubLObject gt_mark_link_node_as_searched(final SubLObject assertion) {
        final SubLObject node = gt_link_node(assertion);
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 32542L)
    public static SubLObject gt_mark_as_searched_and_step(final SubLObject node) {
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searchedP(node)) {
            gt_mark_as_searched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 32726L)
    public static SubLObject gt_mark_link_node_as_unsearched(final SubLObject assertion) {
        final SubLObject node = gt_link_node(assertion);
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL != gt_searchedP(node)) {
            gt_mark_as_unsearched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 33013L)
    public static SubLObject gt_mark_as_unsearched_and_step(final SubLObject node) {
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL != gt_searchedP(node)) {
            gt_mark_as_unsearched(node);
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 33199L)
    public static SubLObject gt_mark_link_node_as_searched_by(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = gt_link_node(assertion);
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searched_byP(node, gt_vars.$gt_searcher$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED)) {
            gt_mark_as_searched_by(node, gt_vars.$gt_searcher$.getDynamicValue(thread));
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 33522L)
    public static SubLObject gt_mark_as_searched_by_and_step(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL != gt_utilities.gt_term_p(node) && gt_search.NIL == gt_searched_byP(node, gt_vars.$gt_searcher$.getDynamicValue(thread), (SubLObject)gt_search.UNPROVIDED)) {
            gt_mark_as_searched_by(node, gt_vars.$gt_searcher$.getDynamicValue(thread));
            gt_utilities.gt_step_fn_funcall(node);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 33743L)
    public static SubLObject gt_mark_all_superiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw1$SUPERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw1$SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw1$SUPERIOR, thread);
            gt_mark_all_accessed_as_searched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 33930L)
    public static SubLObject gt_mark_proper_all_superiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw1$SUPERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw1$SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw1$SUPERIOR, thread);
            gt_mark_proper_all_accessed_as_searched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 34078L)
    public static SubLObject gt_mark_all_inferiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw2$INFERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw2$INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw2$INFERIOR, thread);
            gt_mark_all_accessed_as_searched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 34212L)
    public static SubLObject gt_mark_proper_all_inferiors_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw2$INFERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw2$INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw2$INFERIOR, thread);
            gt_mark_proper_all_accessed_as_searched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 34360L)
    public static SubLObject gt_mark_all_accessed_as_searched(final SubLObject node) {
        gt_mark_as_searched(node);
        gt_mark_proper_all_accessed_as_searched(node);
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 34500L)
    public static SubLObject gt_mark_proper_all_accessed_as_searched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gt_search.NIL != enumeration_types.truth_p((SubLObject)gt_search.$kw34$TRUE) : gt_search.$kw34$TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind((SubLObject)gt_search.$kw34$TRUE, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$130 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP) : gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP;
                final SubLObject _prev_bind_0_$131 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym19$GT_MARK_AS_SEARCHED_AND_STEP, thread);
                    gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$131, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$130, thread);
            }
        }
        finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 34705L)
    public static SubLObject gt_mark_all_superiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw1$SUPERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw1$SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw1$SUPERIOR, thread);
            gt_mark_all_accessed_as_unsearched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 34898L)
    public static SubLObject gt_mark_proper_all_superiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw1$SUPERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw1$SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw1$SUPERIOR, thread);
            gt_mark_proper_all_accessed_as_unsearched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 35050L)
    public static SubLObject gt_mark_all_inferiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw2$INFERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw2$INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw2$INFERIOR, thread);
            gt_mark_all_accessed_as_unsearched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 35188L)
    public static SubLObject gt_mark_proper_all_inferiors_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_search.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_search.NIL == gt_utilities.gt_modeP((SubLObject)gt_search.$kw2$INFERIOR)) {
            Errors.error((SubLObject)gt_search.$str8$invalid_gt_mode___a, (SubLObject)gt_search.$kw2$INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_search.$kw2$INFERIOR, thread);
            gt_mark_proper_all_accessed_as_unsearched(node);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 35340L)
    public static SubLObject gt_mark_all_accessed_as_unsearched(final SubLObject node) {
        gt_mark_as_unsearched(node);
        gt_mark_proper_all_accessed_as_unsearched(node);
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 35486L)
    public static SubLObject gt_mark_proper_all_accessed_as_unsearched(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gt_search.NIL != enumeration_types.truth_p((SubLObject)gt_search.$kw34$TRUE) : gt_search.$kw34$TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind((SubLObject)gt_search.$kw34$TRUE, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$132 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP) : gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP;
                final SubLObject _prev_bind_0_$133 = gt_vars.$gt_base_fn$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym20$GT_MARK_AS_UNSEARCHED_AND_STEP, thread);
                    gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$133, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$132, thread);
            }
        }
        finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 35695L)
    public static SubLObject gt_mark_all_accessed_as_searched_by(final SubLObject node, final SubLObject searcher) {
        if (gt_search.NIL != gt_utilities.gt_term_p(node)) {
            gt_mark_as_searched_by(node, searcher);
            gt_mark_proper_all_accessed_as_searched_by(node, searcher);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-search.lisp", position = 35951L)
    public static SubLObject gt_mark_proper_all_accessed_as_searched_by(final SubLObject node, final SubLObject searcher) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gt_search.NIL != enumeration_types.truth_p((SubLObject)gt_search.$kw34$TRUE) : gt_search.$kw34$TRUE;
        final SubLObject _prev_bind_0 = gt_vars.$gt_truth$.currentBinding(thread);
        try {
            gt_vars.$gt_truth$.bind((SubLObject)gt_search.$kw34$TRUE, thread);
            assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym10$GT_MAP_LINKS) : gt_search.$sym10$GT_MAP_LINKS;
            final SubLObject _prev_bind_0_$134 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind((SubLObject)gt_search.$sym10$GT_MAP_LINKS, thread);
                assert gt_search.NIL != Types.function_spec_p((SubLObject)gt_search.$sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP) : gt_search.$sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP;
                final SubLObject _prev_bind_0_$135 = gt_vars.$gt_base_fn$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_searcher$.currentBinding(thread);
                try {
                    gt_vars.$gt_base_fn$.bind((SubLObject)gt_search.$sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP, thread);
                    gt_vars.$gt_searcher$.bind(searcher, thread);
                    gt_map_links(node, (SubLObject)gt_search.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_searcher$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$135, thread);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$134, thread);
            }
        }
        finally {
            gt_vars.$gt_truth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)gt_search.NIL;
    }
    
    public static SubLObject declare_gt_search_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_search_index_arg", "GT-SEARCH-INDEX-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_search_gather_arg", "GT-SEARCH-GATHER-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_link_node", "GT-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_link_node_and_mt", "GT-LINK-NODE-AND-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_link_values", "GT-LINK-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_add_to_result", "GT-ADD-TO-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_link_node", "GT-GATHER-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_link_node_and_mt", "GT-GATHER-LINK-NODE-AND-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_siblings", "GT-SIBLINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_sibling_node", "GT-GATHER-SIBLING-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_all_accessed", "GT-ALL-ACCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "tts_all_accessed", "TTS-ALL-ACCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_extremal_accessed", "GT-EXTREMAL-ACCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_extremal_node", "GT-GATHER-EXTREMAL-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_accessesP", "GT-ACCESSES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_test_link_node", "GT-TEST-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather", "GT-GATHER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_node", "GT-GATHER-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_common_horizon", "GT-COMMON-HORIZON", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_compose_fn_all_accessed", "GT-COMPOSE-FN-ALL-ACCESSED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_compose_fn_link_node", "GT-COMPOSE-FN-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_select_all_accessed", "GT-SELECT-ALL-ACCESSED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_select_link_node", "GT-SELECT-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_all_dependent_accessed", "GT-ALL-DEPENDENT-ACCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_marked_accessed", "GT-GATHER-MARKED-ACCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_marked_link_node", "GT-GATHER-MARKED-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_unselect_all_accessed_as_unsearched", "GT-MARK-UNSELECT-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_unselect_link_node_all_accessed_as_unsearched", "GT-MARK-UNSELECT-LINK-NODE-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_compose_pred_all_accessed", "GT-COMPOSE-PRED-ALL-ACCESSED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_compose_pred_link_node", "GT-COMPOSE-PRED-LINK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_compose_pred_link_node_int", "GT-COMPOSE-PRED-LINK-NODE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_why_accessesP", "GT-WHY-ACCESSES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_access_just", "GT-GATHER-ACCESS-JUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_any_access_path", "GT-ANY-ACCESS-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_access_path", "GT-GATHER-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_min_mts_of_paths", "GT-MIN-MTS-OF-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_maximin_mts_among_lists", "GT-MAXIMIN-MTS-AMONG-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_link_node_and_max_mts", "GT-GATHER-LINK-NODE-AND-MAX-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_link_node_as_unsearched_and_collect_mts", "GT-MARK-LINK-NODE-AS-UNSEARCHED-AND-COLLECT-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_unsearched_and_collect_all_accessed", "GT-MARK-AS-UNSEARCHED-AND-COLLECT-ALL-ACCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_all_accessed_with_mts", "GT-ALL-ACCESSED-WITH-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_link_node_and_store_edges", "GT-GATHER-LINK-NODE-AND-STORE-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_check_for_cycle_edges_to_add", "GT-CHECK-FOR-CYCLE-EDGES-TO-ADD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_all_edges_to_goal", "GT-ALL-EDGES-TO-GOAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_access_all_while_storing_paths", "GT-ACCESS-ALL-WHILE-STORING-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_link_nodes_and_store_all_paths", "GT-GATHER-LINK-NODES-AND-STORE-ALL-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_access_all_while_unifying_mts", "GT-ACCESS-ALL-WHILE-UNIFYING-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_map_links_rebinding_candidate_mts", "GT-MAP-LINKS-REBINDING-CANDIDATE-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gather_link_nodes_and_unify_mts_along_the_way", "GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_maxs_of_mt_list", "GT-MAXS-OF-MT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "is_x_a_path_list_in_yP", "IS-X-A-PATH-LIST-IN-Y?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "fort_sets_equal", "FORT-SETS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "adjudiciate_adding_mt", "ADJUDICIATE-ADDING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_finished", "GT-FINISHED", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_map_links", "GT-MAP-LINKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_map_assertion_links", "GT-MAP-ASSERTION-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_map_accessors_links", "GT-MAP-ACCESSORS-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_map_arg_index", "GT-MAP-ARG-INDEX", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_gp_mapper", "GT-GP-MAPPER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mapper", "GT-MAPPER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_map_gaf_arg_index_link_nodes", "GT-MAP-GAF-ARG-INDEX-LINK-NODES", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_searched", "GT-MARK-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_unsearched", "GT-MARK-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_searchedP", "GT-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_searched_by", "GT-MARK-AS-SEARCHED-BY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_searched_with", "GT-MARK-AS-SEARCHED-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_searched_byP", "GT-SEARCHED-BY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_searched_by_allP", "GT-SEARCHED-BY-ALL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_searched_in_target_spaceP", "GT-SEARCHED-IN-TARGET-SPACE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_unsearched_in_space", "GT-MARK-AS-UNSEARCHED-IN-SPACE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_searched_in_target_space", "GT-MARK-AS-SEARCHED-IN-TARGET-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_link_node_as_searched", "GT-MARK-LINK-NODE-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_searched_and_step", "GT-MARK-AS-SEARCHED-AND-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_link_node_as_unsearched", "GT-MARK-LINK-NODE-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_unsearched_and_step", "GT-MARK-AS-UNSEARCHED-AND-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_link_node_as_searched_by", "GT-MARK-LINK-NODE-AS-SEARCHED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_as_searched_by_and_step", "GT-MARK-AS-SEARCHED-BY-AND-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_superiors_as_searched", "GT-MARK-ALL-SUPERIORS-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_superiors_as_searched", "GT-MARK-PROPER-ALL-SUPERIORS-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_inferiors_as_searched", "GT-MARK-ALL-INFERIORS-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_inferiors_as_searched", "GT-MARK-PROPER-ALL-INFERIORS-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_accessed_as_searched", "GT-MARK-ALL-ACCESSED-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_accessed_as_searched", "GT-MARK-PROPER-ALL-ACCESSED-AS-SEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_superiors_as_unsearched", "GT-MARK-ALL-SUPERIORS-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_superiors_as_unsearched", "GT-MARK-PROPER-ALL-SUPERIORS-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_inferiors_as_unsearched", "GT-MARK-ALL-INFERIORS-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_inferiors_as_unsearched", "GT-MARK-PROPER-ALL-INFERIORS-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_accessed_as_unsearched", "GT-MARK-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_accessed_as_unsearched", "GT-MARK-PROPER-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_all_accessed_as_searched_by", "GT-MARK-ALL-ACCESSED-AS-SEARCHED-BY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_search", "gt_mark_proper_all_accessed_as_searched_by", "GT-MARK-PROPER-ALL-ACCESSED-AS-SEARCHED-BY", 2, 0, false);
        return (SubLObject)gt_search.NIL;
    }
    
    public static SubLObject init_gt_search_file() {
        return (SubLObject)gt_search.NIL;
    }
    
    public static SubLObject setup_gt_search_file() {
        return (SubLObject)gt_search.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_gt_search_file();
    }
    
    @Override
	public void initializeVariables() {
        init_gt_search_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_gt_search_file();
    }
    
    static {
        me = (SubLFile)new gt_search();
        $kw0$DIRECTED = SubLObjectFactory.makeKeyword("DIRECTED");
        $kw1$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $kw2$INFERIOR = SubLObjectFactory.makeKeyword("INFERIOR");
        $kw3$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $str4$illegal_value_of__gt_mode____s = SubLObjectFactory.makeString("illegal value of *gt-mode*: ~s");
        $sym5$GT_GATHER_LINK_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODE");
        $sym6$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym7$GT_GATHER_SIBLING_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-SIBLING-NODE");
        $str8$invalid_gt_mode___a = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $str9$illegal_value_of__gt_mode_ = SubLObjectFactory.makeString("illegal value of *gt-mode*");
        $sym10$GT_MAP_LINKS = SubLObjectFactory.makeSymbol("GT-MAP-LINKS");
        $sym11$GT_GATHER_EXTREMAL_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-EXTREMAL-NODE");
        $sym12$GT_TEST_LINK_NODE = SubLObjectFactory.makeSymbol("GT-TEST-LINK-NODE");
        $str13$_a_is_not_a_function = SubLObjectFactory.makeString("~a is not a function");
        $sym14$GT_GATHER_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-NODE");
        $int15$128 = SubLObjectFactory.makeInteger(128);
        $sym16$GT_COMPOSE_FN_LINK_NODE = SubLObjectFactory.makeSymbol("GT-COMPOSE-FN-LINK-NODE");
        $sym17$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym18$GT_SELECT_LINK_NODE = SubLObjectFactory.makeSymbol("GT-SELECT-LINK-NODE");
        $sym19$GT_MARK_AS_SEARCHED_AND_STEP = SubLObjectFactory.makeSymbol("GT-MARK-AS-SEARCHED-AND-STEP");
        $sym20$GT_MARK_AS_UNSEARCHED_AND_STEP = SubLObjectFactory.makeSymbol("GT-MARK-AS-UNSEARCHED-AND-STEP");
        $sym21$GT_GATHER_MARKED_LINK_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-MARKED-LINK-NODE");
        $sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED = SubLObjectFactory.makeSymbol("GT-MARK-UNSELECT-LINK-NODE-ALL-ACCESSED-AS-UNSEARCHED");
        $sym23$GT_ALL_PREDECESSORS_SEARCHED_ = SubLObjectFactory.makeSymbol("GT-ALL-PREDECESSORS-SEARCHED?");
        $sym24$GT_COMPOSE_PRED_LINK_NODE = SubLObjectFactory.makeSymbol("GT-COMPOSE-PRED-LINK-NODE");
        $sym25$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const26$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $sym28$GT_GATHER_ACCESS_JUST = SubLObjectFactory.makeSymbol("GT-GATHER-ACCESS-JUST");
        $sym29$GT_GATHER_ACCESS_PATH = SubLObjectFactory.makeSymbol("GT-GATHER-ACCESS-PATH");
        $sym30$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const31$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const32$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate"));
        $const33$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw34$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym35$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS = SubLObjectFactory.makeSymbol("GT-MARK-LINK-NODE-AS-UNSEARCHED-AND-COLLECT-MTS");
        $sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODE-AND-MAX-MTS");
        $sym38$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODE-AND-STORE-EDGES");
        $sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS = SubLObjectFactory.makeSymbol("GT-MAP-LINKS-REBINDING-CANDIDATE-MTS");
        $sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODES-AND-STORE-ALL-PATHS");
        $sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY");
        $kw43$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $str44$illegal_value_of__gt_link_type___ = SubLObjectFactory.makeString("illegal value of *gt-link-type*: ~s");
        $sym45$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $int46$512 = SubLObjectFactory.makeInteger(512);
        $str47$GT_recursion_limit_reached_ = SubLObjectFactory.makeString("GT recursion limit reached.");
        $kw48$ACCESSORS = SubLObjectFactory.makeKeyword("ACCESSORS");
        $kw49$ACCESSIBLE = SubLObjectFactory.makeKeyword("ACCESSIBLE");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-PRED*"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-INDEX-ARG*"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-GATHER-ARG*"));
        $kw51$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $sym52$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $kw53$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym54$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $kw55$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw56$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw57$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym58$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw59$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str60$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym61$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw62$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str63$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw64$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str65$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const66$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-MT"));
        $str68$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str69$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str70$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym71$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym72$GT_MARK_AS_SEARCHED_BY_AND_STEP = SubLObjectFactory.makeSymbol("GT-MARK-AS-SEARCHED-BY-AND-STEP");
    }
}

/*

	Total time: 1727 ms
	 synthetic 
*/