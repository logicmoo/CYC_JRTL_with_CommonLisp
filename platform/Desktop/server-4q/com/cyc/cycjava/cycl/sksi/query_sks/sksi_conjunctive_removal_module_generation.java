package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_module_generation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation";
    public static final String myFingerPrint = "26501e8bce1f7e301b747df9db69913846555a6c3887c2f0f3f9b0739a4c14a3";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1096L)
    private static SubLSymbol $sksi_conjunctive_removal_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 12781L)
    private static SubLSymbol $removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$;
    private static final SubLSymbol $sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$HL_MODULES;
    private static final SubLSymbol $sym3$DO_DICTIONARY;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CDOLIST;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$SKS;
    private static final SubLSymbol $sym8$DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS;
    private static final SubLSymbol $sym9$IGNORE;
    private static final SubLObject $const10$sksDoesNotAllowConjunctiveRemoval;
    private static final SubLString $str11$SKSI_conjunctive_removal_module_f;
    private static final SubLString $str12$_;
    private static final SubLSymbol $kw13$MODULE_SUBTYPE;
    private static final SubLSymbol $kw14$SKSI;
    private static final SubLSymbol $kw15$MODULE_SOURCE;
    private static final SubLSymbol $kw16$DIRECTION;
    private static final SubLSymbol $kw17$APPLICABILITY_PATTERN;
    private static final SubLSymbol $kw18$CALL;
    private static final SubLSymbol $sym19$REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY;
    private static final SubLSymbol $kw20$INPUT;
    private static final SubLSymbol $kw21$COST_PATTERN;
    private static final SubLSymbol $sym22$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST;
    private static final SubLSymbol $kw23$COMPLETENESS_PATTERN;
    private static final SubLSymbol $sym24$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS;
    private static final SubLSymbol $kw25$EXPAND_ITERATIVE_PATTERN;
    private static final SubLSymbol $sym26$REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE;
    private static final SubLSymbol $kw27$DOCUMENTATION;
    private static final SubLSymbol $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME;
    private static final SubLString $str29$_;
    private static final SubLString $str30$_;
    private static final SubLString $str31$REMOVAL_SKSI_;
    private static final SubLString $str32$_CONJUNCTION_POS_LITS;
    private static final SubLSymbol $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI;
    private static final SubLSymbol $sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST;
    private static final SubLSymbol $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN;
    private static final SubLSymbol $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE;
    private static final SubLSymbol $kw37$EXCLUSIVE;
    private static final SubLSymbol $sym38$TRUE;
    private static final SubLSymbol $kw39$SUPPLANTS;
    private static final SubLString $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC;
    private static final SubLSymbol $kw41$NEG;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$POS;
    private static final SubLObject $const44$unknownSentence;
    private static final SubLSymbol $sym45$NEW_POS_SUBCLAUSE_SPEC;
    private static final SubLSymbol $kw46$INCOMPLETE;
    private static final SubLSymbol $kw47$ABORT;
    private static final SubLSymbol $sym48$BINDINGS_EQUAL_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1295L)
    public static SubLObject note_sksi_conjunctive_removal_module(final SubLObject hl_module, final SubLObject sks) {
        return dictionary_utilities.dictionary_push(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue(), sks, hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1441L)
    public static SubLObject un_note_sksi_conjunctive_removal_module(final SubLObject sks) {
        return dictionary_utilities.dictionary_pop(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue(), sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1569L)
    public static SubLObject clear_sksi_conjunctive_removal_modules() {
        return dictionary.clear_dictionary(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1691L)
    public static SubLObject look_up_sksi_conjunctive_removal_modules(final SubLObject sks) {
        return dictionary.dictionary_lookup(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue(), sks, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 1823L)
    public static SubLObject sksi_conjunctive_removal_modules_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue())); sksi_conjunctive_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_modules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            count = Numbers.add(count, Sequences.length(hl_modules));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2052L)
    public static SubLObject some_sksi_conjunctive_removal_module_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_generation.NIL == dictionary.dictionary_empty_p(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2195L)
    public static SubLObject do_sksi_conjunctive_removal_modules_by_sks(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject hl_module = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list1);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list1);
        hl_module = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject hl_modules = (SubLObject)sksi_conjunctive_removal_module_generation.$sym2$HL_MODULES;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$sym3$DO_DICTIONARY, (SubLObject)ConsesLow.listS(sks, hl_modules, (SubLObject)sksi_conjunctive_removal_module_generation.$list4), (SubLObject)ConsesLow.listS((SubLObject)sksi_conjunctive_removal_module_generation.$sym5$CDOLIST, (SubLObject)ConsesLow.list(hl_module, hl_modules), ConsesLow.append(body, (SubLObject)sksi_conjunctive_removal_module_generation.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list1);
        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2454L)
    public static SubLObject do_sksi_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list6);
        hl_module = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sks = (SubLObject)sksi_conjunctive_removal_module_generation.$sym7$SKS;
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_conjunctive_removal_module_generation.$sym8$DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS, (SubLObject)ConsesLow.list(sks, hl_module), (SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$sym9$IGNORE, sks), ConsesLow.append(body, (SubLObject)sksi_conjunctive_removal_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list6);
        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 2665L)
    public static SubLObject register_sksi_conjunctive_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_conjunctive_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_conjunctive_removal_module_generation.NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    SubLObject ks = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                    ks = cdolist_list_var.first();
                    while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
                        count = Numbers.add(count, register_sksi_conjunctive_removal_module_for_just_sks(ks, mapping_mt, (SubLObject)sksi_conjunctive_removal_module_generation.NIL));
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_conjunctive_removal_module_generation.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (sksi_conjunctive_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 3339L)
    public static SubLObject register_sksi_conjunctive_removal_module_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_conjunctive_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        if (sksi_conjunctive_removal_module_generation.NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        deregister_sksi_conjunctive_removal_module_for_just_sks(sks, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_conjunctive_removal_module_generation.NIL != register_sksi_conjunctive_removal_module_for_just_sks_int(sks, mapping_mt)) {
                    count = (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER;
                }
                if (sksi_conjunctive_removal_module_generation.NIL != register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int(sks, mapping_mt)) {
                    count = (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER;
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_conjunctive_removal_module_generation.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (sksi_conjunctive_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 4151L)
    public static SubLObject deregister_sksi_conjunctive_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        if (reclassifyP == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_conjunctive_removal_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        if (sksi_conjunctive_removal_module_generation.NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            ks = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
                count = Numbers.add(count, deregister_sksi_conjunctive_removal_module_for_just_sks(ks, (SubLObject)sksi_conjunctive_removal_module_generation.NIL));
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_conjunctive_removal_module_generation.NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 4784L)
    public static SubLObject deregister_sksi_conjunctive_removal_module_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == sksi_conjunctive_removal_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_conjunctive_removal_module_generation.T;
        }
        SubLObject hl_modules = look_up_sksi_conjunctive_removal_modules(sks);
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        if (sksi_conjunctive_removal_module_generation.NIL != hl_modules) {
            if (!hl_modules.isCons()) {
                hl_modules = (SubLObject)ConsesLow.list(hl_modules);
            }
            SubLObject cdolist_list_var = hl_modules;
            SubLObject hl_module = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            hl_module = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                un_note_sksi_conjunctive_removal_module(sks);
                inference_modules.undeclare_inference_conjunctive_removal_module(name);
                if (sksi_conjunctive_removal_module_generation.NIL != reclassifyP) {
                    inference_modules.reclassify_removal_modules();
                }
                count = (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER;
                cdolist_list_var = cdolist_list_var.rest();
                hl_module = cdolist_list_var.first();
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 5514L)
    public static SubLObject deregister_all_sksi_conjunctive_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$.getGlobalValue())); sksi_conjunctive_removal_module_generation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject hl_modules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = hl_modules;
            SubLObject hl_module = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            hl_module = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                inference_modules.undeclare_inference_conjunctive_removal_module(name);
                count = Numbers.add(count, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                hl_module = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        clear_sksi_conjunctive_removal_modules();
        inference_modules.reclassify_removal_modules();
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 5970L)
    public static SubLObject sks_does_not_allow_conjunctive_removalP(final SubLObject sks) {
        return list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value_gaf(sks, sksi_conjunctive_removal_module_generation.$const10$sksDoesNotAllowConjunctiveRemoval, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 6151L)
    public static SubLObject register_sksi_conjunctive_removal_module_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, (SubLObject)sksi_conjunctive_removal_module_generation.T);
        SubLObject hl_module = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        if (sksi_conjunctive_removal_module_generation.NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile) && sksi_conjunctive_removal_module_generation.NIL == sks_does_not_allow_conjunctive_removalP(sks)) {
            SubLObject direction = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mapping_mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mapping_mt), thread);
                direction = sksi_kb_accessors.get_sks_multi_literal_lookup_direction_from_kb(sks);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            final SubLObject name = determine_sksi_conjunctive_removal_module_name(sks);
            final SubLObject doc_string = Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_module_generation.$str11$SKSI_conjunctive_removal_module_f, new SubLObject[] { format_nil.format_nil_s_no_copy(sks), sksi_conjunctive_removal_module_generation.$str12$_ });
            final SubLObject plist = (SubLObject)ConsesLow.list(new SubLObject[] { sksi_conjunctive_removal_module_generation.$kw13$MODULE_SUBTYPE, sksi_conjunctive_removal_module_generation.$kw14$SKSI, sksi_conjunctive_removal_module_generation.$kw15$MODULE_SOURCE, sks, sksi_conjunctive_removal_module_generation.$kw16$DIRECTION, direction, sksi_conjunctive_removal_module_generation.$kw17$APPLICABILITY_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym19$REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw21$COST_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym22$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw23$COMPLETENESS_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym24$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw25$EXPAND_ITERATIVE_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym26$REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw27$DOCUMENTATION, doc_string });
            hl_module = inference_modules.inference_conjunctive_removal_module(name, plist);
            note_sksi_conjunctive_removal_module(hl_module, sks);
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 7526L)
    public static SubLObject determine_sksi_conjunctive_removal_module_name_internal(final SubLObject sks) {
        if (sksi_conjunctive_removal_module_generation.NIL == sks) {
            return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
        final SubLObject core_name_string = (SubLObject)((sksi_conjunctive_removal_module_generation.NIL != sks_name) ? string_utilities.string_substitute((SubLObject)sksi_conjunctive_removal_module_generation.$str29$_, (SubLObject)sksi_conjunctive_removal_module_generation.$str30$_, Strings.string_upcase(sks_name, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED) : sksi_conjunctive_removal_module_generation.NIL);
        final SubLObject core_name_symbol = Symbols.gensym(core_name_string);
        final SubLObject name_string = Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_module_generation.$str31$REMOVAL_SKSI_, new SubLObject[] { format_nil.format_nil_a_no_copy(core_name_symbol), sksi_conjunctive_removal_module_generation.$str32$_CONJUNCTION_POS_LITS });
        final SubLObject name = Symbols.make_keyword(name_string);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 7526L)
    public static SubLObject determine_sksi_conjunctive_removal_module_name(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        if (sksi_conjunctive_removal_module_generation.NIL == v_memoization_state) {
            return determine_sksi_conjunctive_removal_module_name_internal(sks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_generation.$sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
        if (sksi_conjunctive_removal_module_generation.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_generation.$sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_generation.NIL, (SubLObject)sksi_conjunctive_removal_module_generation.EQL, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_generation.$sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sks, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(determine_sksi_conjunctive_removal_module_name_internal(sks)));
            memoization_state.caching_state_put(caching_state, sks, results, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 8176L)
    public static SubLObject register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int(final SubLObject sks, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_profile = sksi_query_datastructures.new_sks_profile(sks, mapping_mt, (SubLObject)sksi_conjunctive_removal_module_generation.T);
        SubLObject hl_module = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        if (sksi_conjunctive_removal_module_generation.NIL != sksi_query_datastructures.valid_and_supported_sks_profile(sks_profile) && sksi_conjunctive_removal_module_generation.NIL == sks_does_not_allow_conjunctive_removalP(sks)) {
            SubLObject direction = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mapping_mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mapping_mt), thread);
                direction = sksi_kb_accessors.get_sks_multi_literal_lookup_direction_from_kb(sks);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            final SubLObject name = determine_sksi_conjunctive_removal_with_unknown_sentence_module_name(sks);
            final SubLObject supplants_name = determine_sksi_conjunctive_removal_module_name(sks);
            final SubLObject doc_string = Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_module_generation.$str11$SKSI_conjunctive_removal_module_f, new SubLObject[] { format_nil.format_nil_s_no_copy(sks), sksi_conjunctive_removal_module_generation.$str12$_ });
            final SubLObject plist = (SubLObject)ConsesLow.list(new SubLObject[] { sksi_conjunctive_removal_module_generation.$kw13$MODULE_SUBTYPE, sksi_conjunctive_removal_module_generation.$kw14$SKSI, sksi_conjunctive_removal_module_generation.$kw15$MODULE_SOURCE, sks, sksi_conjunctive_removal_module_generation.$kw16$DIRECTION, direction, sksi_conjunctive_removal_module_generation.$kw17$APPLICABILITY_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw21$COST_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw23$COMPLETENESS_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw25$EXPAND_ITERATIVE_PATTERN, ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_generation.$kw18$CALL, (SubLObject)sksi_conjunctive_removal_module_generation.$sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE, (SubLObject)sksi_conjunctive_removal_module_generation.$kw20$INPUT, sks_profile), sksi_conjunctive_removal_module_generation.$kw37$EXCLUSIVE, sksi_conjunctive_removal_module_generation.$sym38$TRUE, sksi_conjunctive_removal_module_generation.$kw39$SUPPLANTS, ConsesLow.list(supplants_name), sksi_conjunctive_removal_module_generation.$kw27$DOCUMENTATION, doc_string });
            hl_module = inference_modules.inference_conjunctive_removal_module(name, plist);
            note_sksi_conjunctive_removal_module(hl_module, sks);
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 9855L)
    public static SubLObject determine_sksi_conjunctive_removal_with_unknown_sentence_module_name(final SubLObject sks) {
        if (sksi_conjunctive_removal_module_generation.NIL == sks) {
            return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sks);
        final SubLObject core_name_string = (SubLObject)((sksi_conjunctive_removal_module_generation.NIL != sks_name) ? string_utilities.string_substitute((SubLObject)sksi_conjunctive_removal_module_generation.$str29$_, (SubLObject)sksi_conjunctive_removal_module_generation.$str30$_, Strings.string_upcase(sks_name, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED) : sksi_conjunctive_removal_module_generation.NIL);
        final SubLObject core_name_symbol = Symbols.gensym(core_name_string);
        final SubLObject name_string = Sequences.cconcatenate((SubLObject)sksi_conjunctive_removal_module_generation.$str31$REMOVAL_SKSI_, new SubLObject[] { format_nil.format_nil_a_no_copy(core_name_symbol), sksi_conjunctive_removal_module_generation.$str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC });
        final SubLObject name = Symbols.make_keyword(name_string);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 10441L)
    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_applicability(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_generation.NIL != inference_macros.current_controlling_inference() && sksi_conjunctive_removal_module_generation.NIL == sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread)) {
            return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        if (sksi_conjunctive_removal_module_generation.NIL == inference_worker_split.all_literals_connected_by_shared_varsP(contextualized_dnf_clause)) {
            return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        SubLObject result = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject sense = (SubLObject)sksi_conjunctive_removal_module_generation.$kw41$NEG;
        SubLObject index_var = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            this_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_generation.NIL == current) {
                if (sksi_conjunctive_removal_module_generation.NIL != mt) {
                    if (!this_mt.equal(mt)) {
                        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                    }
                }
                else {
                    mt = this_mt;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            }
            index_var = Numbers.add(index_var, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        sense = (SubLObject)sksi_conjunctive_removal_module_generation.$kw43$POS;
        index_var = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            this_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_generation.NIL == current) {
                if (sksi_conjunctive_removal_module_generation.NIL != mt) {
                    if (!this_mt.equal(mt)) {
                        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                    }
                }
                else {
                    mt = this_mt;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            }
            index_var = Numbers.add(index_var, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        SubLObject unknown_sentence_literals = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject other_literals = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject sense2 = (SubLObject)sksi_conjunctive_removal_module_generation.$kw41$NEG;
        SubLObject index_var2 = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        contextualized_asent2 = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = contextualized_asent2;
            SubLObject this_mt2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            SubLObject asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            this_mt2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            asent2 = current2.first();
            current2 = current2.rest();
            if (sksi_conjunctive_removal_module_generation.NIL == current2) {
                if (sksi_conjunctive_removal_module_generation.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent2, sksi_conjunctive_removal_module_generation.$const44$unknownSentence)) {
                    unknown_sentence_literals = (SubLObject)ConsesLow.cons(asent2, unknown_sentence_literals);
                }
                else {
                    other_literals = (SubLObject)ConsesLow.cons(asent2, other_literals);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            }
            index_var2 = Numbers.add(index_var2, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            contextualized_asent2 = cdolist_list_var2.first();
        }
        sense2 = (SubLObject)sksi_conjunctive_removal_module_generation.$kw43$POS;
        index_var2 = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        cdolist_list_var2 = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        contextualized_asent2 = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = contextualized_asent2;
            SubLObject this_mt2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            SubLObject asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            this_mt2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            asent2 = current2.first();
            current2 = current2.rest();
            if (sksi_conjunctive_removal_module_generation.NIL == current2) {
                if (sksi_conjunctive_removal_module_generation.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent2, sksi_conjunctive_removal_module_generation.$const44$unknownSentence)) {
                    unknown_sentence_literals = (SubLObject)ConsesLow.cons(asent2, unknown_sentence_literals);
                }
                else {
                    other_literals = (SubLObject)ConsesLow.cons(asent2, other_literals);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            }
            index_var2 = Numbers.add(index_var2, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            contextualized_asent2 = cdolist_list_var2.first();
        }
        if (sksi_conjunctive_removal_module_generation.NIL == unknown_sentence_literals) {
            return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        }
        final SubLObject other_literals_free_vars = el_utilities.sentence_free_variables(el_utilities.make_conjunction(other_literals), (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
        SubLObject cdolist_list_var3 = unknown_sentence_literals;
        SubLObject unknown_sentence_literal = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        unknown_sentence_literal = cdolist_list_var3.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var3) {
            if (sksi_conjunctive_removal_module_generation.NIL != conses_high.set_difference(el_utilities.sentence_free_variables(unknown_sentence_literal, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED), other_literals_free_vars, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED)) {
                return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            unknown_sentence_literal = cdolist_list_var3.first();
        }
        final SubLObject _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.currentBinding(thread);
        try {
            sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind((SubLObject)sksi_conjunctive_removal_module_generation.NIL, thread);
            sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.bind((SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER, thread);
            if (sksi_conjunctive_removal_module_generation.NIL != sksi_conjunctive_removal_modules_applicability.removal_sksi_conjunction_pos_lits_applicability(contextualized_dnf_clause, sks_profile)) {
                SubLObject num = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
                cdolist_list_var3 = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject lit = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                lit = cdolist_list_var3.first();
                while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var3) {
                    result = (SubLObject)ConsesLow.cons(num, result);
                    num = Numbers.add(num, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    lit = cdolist_list_var3.first();
                }
                result = Mapping.mapcar((SubLObject)sksi_conjunctive_removal_module_generation.$sym45$NEW_POS_SUBCLAUSE_SPEC, (SubLObject)ConsesLow.list(result));
            }
        }
        finally {
            sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.rebind(_prev_bind_2, thread);
            sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 13006L)
    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        return sksi_conjunctive_removal_module_generation.$removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 13398L)
    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_completeness(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        return (SubLObject)sksi_conjunctive_removal_module_generation.$kw46$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-generation.lisp", position = 13870L)
    public static SubLObject removal_sksi_conjunction_with_unknown_sentence_pos_lits_output_generate(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject non_unknown_sentence_query_lits = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject unknown_sentence_asents_made_known_lits = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject sense = (SubLObject)sksi_conjunctive_removal_module_generation.$kw41$NEG;
        SubLObject index_var = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            this_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_generation.NIL == current) {
                if (sksi_conjunctive_removal_module_generation.NIL == mt) {
                    mt = this_mt;
                }
                if (sksi_conjunctive_removal_module_generation.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, sksi_conjunctive_removal_module_generation.$const44$unknownSentence)) {
                    unknown_sentence_asents_made_known_lits = (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg1(asent, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED), unknown_sentence_asents_made_known_lits);
                }
                else {
                    non_unknown_sentence_query_lits = (SubLObject)ConsesLow.cons(asent, non_unknown_sentence_query_lits);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            }
            index_var = Numbers.add(index_var, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        sense = (SubLObject)sksi_conjunctive_removal_module_generation.$kw43$POS;
        index_var = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject this_mt = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            this_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_generation.NIL == current) {
                if (sksi_conjunctive_removal_module_generation.NIL == mt) {
                    mt = this_mt;
                }
                if (sksi_conjunctive_removal_module_generation.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, sksi_conjunctive_removal_module_generation.$const44$unknownSentence)) {
                    unknown_sentence_asents_made_known_lits = (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg1(asent, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED), unknown_sentence_asents_made_known_lits);
                }
                else {
                    non_unknown_sentence_query_lits = (SubLObject)ConsesLow.cons(asent, non_unknown_sentence_query_lits);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
            }
            index_var = Numbers.add(index_var, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        final SubLObject non_unknown_sentence_query = el_utilities.make_conjunction(non_unknown_sentence_query_lits);
        final SubLObject non_unknown_sentence_query_properties = inference_trampolines.determine_sentence_recursive_query_properties(non_unknown_sentence_query, mt);
        SubLObject raw_results = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        final SubLObject _prev_bind_0 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
        try {
            inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind((SubLObject)sksi_conjunctive_removal_module_generation.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject non_unknown_sentence_query_results = ask_utilities.inference_recursive_query_unique_bindings(non_unknown_sentence_query, mt, non_unknown_sentence_query_properties);
            final SubLObject non_unknown_sentence_query_halt_reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (non_unknown_sentence_query_halt_reason == sksi_conjunctive_removal_module_generation.$kw47$ABORT) {
                inference_strategist.query_abort();
            }
            raw_results = non_unknown_sentence_query_results;
            if (sksi_conjunctive_removal_module_generation.NIL != raw_results) {
                SubLObject cdolist_list_var2 = unknown_sentence_asents_made_known_lits;
                SubLObject unknown_sentence_asents_made_known_lit = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                unknown_sentence_asents_made_known_lit = cdolist_list_var2.first();
                while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var2) {
                    final SubLObject unknown_sentence_asents_made_known_query = el_utilities.make_conjunction((SubLObject)ConsesLow.cons(unknown_sentence_asents_made_known_lit, non_unknown_sentence_query_lits));
                    final SubLObject unknown_sentence_asents_made_known_query_properties = inference_trampolines.determine_sentence_recursive_query_properties(unknown_sentence_asents_made_known_query, mt);
                    thread.resetMultipleValues();
                    final SubLObject unknown_sentence_asents_made_known_results = ask_utilities.inference_recursive_query_unique_bindings(unknown_sentence_asents_made_known_query, mt, unknown_sentence_asents_made_known_query_properties);
                    final SubLObject unknown_sentence_asents_made_known_halt_reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (unknown_sentence_asents_made_known_halt_reason == sksi_conjunctive_removal_module_generation.$kw47$ABORT) {
                        inference_strategist.query_abort();
                    }
                    raw_results = conses_high.set_difference(raw_results, unknown_sentence_asents_made_known_results, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_generation.$sym48$BINDINGS_EQUAL_), (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    unknown_sentence_asents_made_known_lit = cdolist_list_var2.first();
                }
            }
        }
        finally {
            inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_0, thread);
        }
        SubLObject results = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        SubLObject cdolist_list_var3 = raw_results;
        SubLObject v_bindings = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
        v_bindings = cdolist_list_var3.first();
        while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var3) {
            SubLObject supports = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            final SubLObject bound_clause = bindings.apply_bindings(v_bindings, contextualized_dnf_clause);
            SubLObject sense2 = (SubLObject)sksi_conjunctive_removal_module_generation.$kw41$NEG;
            SubLObject index_var2 = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
            SubLObject cdolist_list_var_$4 = clauses.neg_lits(bound_clause);
            SubLObject contextualized_asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            contextualized_asent2 = cdolist_list_var_$4.first();
            while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var_$4) {
                SubLObject current2;
                final SubLObject datum2 = current2 = contextualized_asent2;
                SubLObject this_mt2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                SubLObject asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
                this_mt2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
                asent2 = current2.first();
                current2 = current2.rest();
                if (sksi_conjunctive_removal_module_generation.NIL == current2) {
                    supports = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_module_generation.$kw14$SKSI, asent2, mt, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED)), supports);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
                }
                index_var2 = Numbers.add(index_var2, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                contextualized_asent2 = cdolist_list_var_$4.first();
            }
            sense2 = (SubLObject)sksi_conjunctive_removal_module_generation.$kw43$POS;
            index_var2 = (SubLObject)sksi_conjunctive_removal_module_generation.ZERO_INTEGER;
            SubLObject cdolist_list_var_$5 = clauses.pos_lits(bound_clause);
            contextualized_asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
            contextualized_asent2 = cdolist_list_var_$5.first();
            while (sksi_conjunctive_removal_module_generation.NIL != cdolist_list_var_$5) {
                SubLObject current2;
                final SubLObject datum2 = current2 = contextualized_asent2;
                SubLObject this_mt2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                SubLObject asent2 = (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
                this_mt2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
                asent2 = current2.first();
                current2 = current2.rest();
                if (sksi_conjunctive_removal_module_generation.NIL == current2) {
                    supports = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sksi_conjunctive_removal_module_generation.$kw14$SKSI, asent2, mt, (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED)), supports);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_conjunctive_removal_module_generation.$list42);
                }
                index_var2 = Numbers.add(index_var2, (SubLObject)sksi_conjunctive_removal_module_generation.ONE_INTEGER);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                contextualized_asent2 = cdolist_list_var_$5.first();
            }
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, supports), results);
            cdolist_list_var3 = cdolist_list_var3.rest();
            v_bindings = cdolist_list_var3.first();
        }
        return iteration.new_list_iterator(results);
    }
    
    public static SubLObject declare_sksi_conjunctive_removal_module_generation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "note_sksi_conjunctive_removal_module", "NOTE-SKSI-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "un_note_sksi_conjunctive_removal_module", "UN-NOTE-SKSI-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "clear_sksi_conjunctive_removal_modules", "CLEAR-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "look_up_sksi_conjunctive_removal_modules", "LOOK-UP-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "sksi_conjunctive_removal_modules_count", "SKSI-CONJUNCTIVE-REMOVAL-MODULES-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "some_sksi_conjunctive_removal_module_registeredP", "SOME-SKSI-CONJUNCTIVE-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "do_sksi_conjunctive_removal_modules_by_sks", "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES-BY-SKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "do_sksi_conjunctive_removal_modules", "DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "register_sksi_conjunctive_removal_modules_for_sks", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "register_sksi_conjunctive_removal_module_for_just_sks", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "deregister_sksi_conjunctive_removal_modules_for_sks", "DEREGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "deregister_sksi_conjunctive_removal_module_for_just_sks", "DEREGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "deregister_all_sksi_conjunctive_removal_modules", "DEREGISTER-ALL-SKSI-CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "sks_does_not_allow_conjunctive_removalP", "SKS-DOES-NOT-ALLOW-CONJUNCTIVE-REMOVAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "register_sksi_conjunctive_removal_module_for_just_sks_int", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-MODULE-FOR-JUST-SKS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "determine_sksi_conjunctive_removal_module_name_internal", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "determine_sksi_conjunctive_removal_module_name", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "register_sksi_conjunctive_removal_with_unknown_sentence_module_for_just_sks_int", "REGISTER-SKSI-CONJUNCTIVE-REMOVAL-WITH-UNKNOWN-SENTENCE-MODULE-FOR-JUST-SKS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "determine_sksi_conjunctive_removal_with_unknown_sentence_module_name", "DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-WITH-UNKNOWN-SENTENCE-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "removal_sksi_conjunction_with_unknown_sentence_pos_lits_applicability", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-APPLICABILITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "removal_sksi_conjunction_with_unknown_sentence_pos_lits_completeness", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_generation", "removal_sksi_conjunction_with_unknown_sentence_pos_lits_output_generate", "REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-OUTPUT-GENERATE", 2, 0, false);
        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
    }
    
    public static SubLObject init_sksi_conjunctive_removal_module_generation_file() {
        sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$ = SubLFiles.deflexical("*SKSI-CONJUNCTIVE-REMOVAL-MODULES*", maybeDefault((SubLObject)sksi_conjunctive_removal_module_generation.$sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_, sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_generation.EQ), (SubLObject)sksi_conjunctive_removal_module_generation.UNPROVIDED))));
        sksi_conjunctive_removal_module_generation.$removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$ = SubLFiles.deflexical("*REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST*", (SubLObject)sksi_conjunctive_removal_module_generation.THREE_INTEGER);
        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
    }
    
    public static SubLObject setup_sksi_conjunctive_removal_module_generation_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_conjunctive_removal_module_generation.$sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_generation.$sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_generation.$sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_generation.$sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_generation.$sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_generation.$sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE);
        return (SubLObject)sksi_conjunctive_removal_module_generation.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_conjunctive_removal_module_generation_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_conjunctive_removal_module_generation_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_module_generation_file();
    }
    
    static {
        me = (SubLFile)new sksi_conjunctive_removal_module_generation();
        sksi_conjunctive_removal_module_generation.$sksi_conjunctive_removal_modules$ = null;
        sksi_conjunctive_removal_module_generation.$removal_sksi_conjunction_with_unknown_sentence_pos_lits_cost$ = null;
        $sym0$_SKSI_CONJUNCTIVE_REMOVAL_MODULES_ = SubLObjectFactory.makeSymbol("*SKSI-CONJUNCTIVE-REMOVAL-MODULES*");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$HL_MODULES = SubLObjectFactory.makeUninternedSymbol("HL-MODULES");
        $sym3$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-CONJUNCTIVE-REMOVAL-MODULES*"));
        $sym5$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$SKS = SubLObjectFactory.makeUninternedSymbol("SKS");
        $sym8$DO_SKSI_CONJUNCTIVE_REMOVAL_MODULES_BY_SKS = SubLObjectFactory.makeSymbol("DO-SKSI-CONJUNCTIVE-REMOVAL-MODULES-BY-SKS");
        $sym9$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $const10$sksDoesNotAllowConjunctiveRemoval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksDoesNotAllowConjunctiveRemoval"));
        $str11$SKSI_conjunctive_removal_module_f = SubLObjectFactory.makeString("SKSI conjunctive removal module for ");
        $str12$_ = SubLObjectFactory.makeString(".");
        $kw13$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $kw14$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $kw15$MODULE_SOURCE = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $kw16$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw17$APPLICABILITY_PATTERN = SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN");
        $kw18$CALL = SubLObjectFactory.makeKeyword("CALL");
        $sym19$REMOVAL_SKSI_CONJUNCTION_POS_LITS_APPLICABILITY = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY");
        $kw20$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw21$COST_PATTERN = SubLObjectFactory.makeKeyword("COST-PATTERN");
        $sym22$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COST = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-COST");
        $kw23$COMPLETENESS_PATTERN = SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN");
        $sym24$REMOVAL_SKSI_CONJUNCTION_POS_LITS_COMPLETENESS = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS");
        $kw25$EXPAND_ITERATIVE_PATTERN = SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN");
        $sym26$REMOVAL_SKSI_CONJUNCTION_POS_LITS_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-POS-LITS-OUTPUT-GENERATE");
        $kw27$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $sym28$DETERMINE_SKSI_CONJUNCTIVE_REMOVAL_MODULE_NAME = SubLObjectFactory.makeSymbol("DETERMINE-SKSI-CONJUNCTIVE-REMOVAL-MODULE-NAME");
        $str29$_ = SubLObjectFactory.makeString("-");
        $str30$_ = SubLObjectFactory.makeString("_");
        $str31$REMOVAL_SKSI_ = SubLObjectFactory.makeString("REMOVAL-SKSI-");
        $str32$_CONJUNCTION_POS_LITS = SubLObjectFactory.makeString("-CONJUNCTION-POS-LITS");
        $sym33$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_APPLICABI = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-APPLICABILITY");
        $sym34$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COST = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COST");
        $sym35$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_COMPLETEN = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-COMPLETENESS");
        $sym36$REMOVAL_SKSI_CONJUNCTION_WITH_UNKNOWN_SENTENCE_POS_LITS_OUTPUT_GE = SubLObjectFactory.makeSymbol("REMOVAL-SKSI-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS-OUTPUT-GENERATE");
        $kw37$EXCLUSIVE = SubLObjectFactory.makeKeyword("EXCLUSIVE");
        $sym38$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $kw39$SUPPLANTS = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $str40$_CONJUNCTION_WITH_UNKNOWN_SENTENC = SubLObjectFactory.makeString("-CONJUNCTION-WITH-UNKNOWN-SENTENCE-POS-LITS");
        $kw41$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw43$POS = SubLObjectFactory.makeKeyword("POS");
        $const44$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $sym45$NEW_POS_SUBCLAUSE_SPEC = SubLObjectFactory.makeSymbol("NEW-POS-SUBCLAUSE-SPEC");
        $kw46$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw47$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $sym48$BINDINGS_EQUAL_ = SubLObjectFactory.makeSymbol("BINDINGS-EQUAL?");
    }
}

/*

	Total time: 258 ms
	
*/