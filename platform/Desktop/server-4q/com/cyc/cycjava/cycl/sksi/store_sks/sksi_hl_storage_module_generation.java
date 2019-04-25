package com.cyc.cycjava.cycl.sksi.store_sks;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_hl_storage_module_generation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation";
    public static final String myFingerPrint = "5d929168ef9a2ae342d618aa3642ddc4bd57e32ec9bfc1bfeea16790d9559795";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 3411L)
    private static SubLSymbol $sksi_hl_storage_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5154L)
    private static SubLSymbol $sksi_hl_storage_modules_by_sks$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 22557L)
    private static SubLSymbol $sksi_hl_storage_modules_only_preferred_over_kb_storageP$;
    private static final SubLSymbol $sym0$_SKSI_HL_STORAGE_MODULES_;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$DO_SET;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CDOLIST;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$_SKSI_HL_STORAGE_MODULES_BY_SKS_;
    private static final SubLString $str7$_S_was_not_a_valid_HL_storage_mod;
    private static final SubLSymbol $kw8$PRETTY_NAME;
    private static final SubLSymbol $kw9$APPLICABILITY_PATTERN;
    private static final SubLSymbol $kw10$SENSE;
    private static final SubLSymbol $kw11$IGNORE;
    private static final SubLString $str12$sksi;
    private static final SubLString $str13$complex_non_atomic_meaning_senten;
    private static final SubLSymbol $kw14$POS;
    private static final SubLSymbol $kw15$ANY_PREDICATES;
    private static final SubLSymbol $kw16$PREDICATE;
    private static final SubLSymbol $kw17$REQUIRED_MT;
    private static final SubLSymbol $kw18$NEG;
    private static final SubLSymbol $kw19$FULLY_BOUND;
    private static final SubLSymbol $kw20$MODULE_SUBTYPE;
    private static final SubLSymbol $kw21$SKSI;
    private static final SubLSymbol $kw22$MODULE_SOURCE;
    private static final SubLSymbol $kw23$ARGUMENT_TYPE;
    private static final SubLSymbol $kw24$ARGUMENT;
    private static final SubLSymbol $kw25$DIRECTION;
    private static final SubLSymbol $kw26$INCOMPLETENESS;
    private static final SubLSymbol $sym27$SKSI_SENTENCE_HL_STORAGE_MODULE_INCOMPLETENESS;
    private static final SubLSymbol $kw28$ADD;
    private static final SubLSymbol $sym29$SKSI_SENTENCE_HL_STORAGE_MODULE_ASSERT;
    private static final SubLSymbol $kw30$REMOVE;
    private static final SubLSymbol $sym31$SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT;
    private static final SubLSymbol $kw32$REMOVE_ALL;
    private static final SubLSymbol $kw33$PREFERRED_OVER;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$EXCLUSIVE;
    private static final SubLSymbol $sym36$TRUE;
    private static final SubLSymbol $kw37$SUPPLANTS;
    private static final SubLSymbol $kw38$DOCUMENTATION;
    private static final SubLString $str39$___not_;
    private static final SubLString $str40$_;
    private static final SubLString $str41$_FULLY_BOUND;
    private static final SubLString $str42$__FULLY_BOUND_;
    private static final SubLString $str43$_FULLY_BOUND;
    private static final SubLString $str44$__FULLY_BOUND_;
    private static final SubLString $str45$NOT_FULLY_BOUND;
    private static final SubLString $str46$_NOT_FULLY_BOUND_;
    private static final SubLSymbol $sym47$ASSERTED_ARGUMENT_SPEC_P;
    private static final SubLSymbol $kw48$MONOTONIC;
    private static final SubLSymbol $kw49$STRENGTH;
    private static final SubLString $str50$__SKSI__A_;
    private static final SubLString $str51$_sksi_sentence_hl_storage_module_;
    private static final SubLString $str52$sksi_sentence_hl_storage_module_a;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 3608L)
    public static SubLObject sksi_hl_storage_module_p(final SubLObject hl_module) {
        return set.set_memberP(hl_module, sksi_hl_storage_module_generation.$sksi_hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 3816L)
    public static SubLObject do_sksi_hl_storage_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_hl_storage_module_generation.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)sksi_hl_storage_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_hl_storage_module_generation.$list1);
        hl_module = current.first();
        current = current.rest();
        if (sksi_hl_storage_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_hl_storage_module_generation.$sym2$DO_SET, reader.bq_cons(hl_module, (SubLObject)sksi_hl_storage_module_generation.$list3), ConsesLow.append(body, (SubLObject)sksi_hl_storage_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_hl_storage_module_generation.$list1);
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 4251L)
    public static SubLObject do_sksi_hl_storage_modules_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_hl_storage_module_generation.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)sksi_hl_storage_module_generation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_hl_storage_module_generation.$list1);
        hl_module = current.first();
        current = current.rest();
        if (sksi_hl_storage_module_generation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_hl_storage_module_generation.$sym4$CDOLIST, reader.bq_cons(hl_module, (SubLObject)sksi_hl_storage_module_generation.$list5), ConsesLow.append(body, (SubLObject)sksi_hl_storage_module_generation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_hl_storage_module_generation.$list1);
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 4723L)
    public static SubLObject sksi_hl_storage_modules_count() {
        return set.set_size(sksi_hl_storage_module_generation.$sksi_hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 4821L)
    public static SubLObject note_sksi_hl_storage_module(final SubLObject hl_module) {
        return set.set_add(hl_module, sksi_hl_storage_module_generation.$sksi_hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 4933L)
    public static SubLObject un_note_sksi_hl_storage_module(final SubLObject hl_module) {
        return set.set_remove(hl_module, sksi_hl_storage_module_generation.$sksi_hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5051L)
    public static SubLObject un_note_all_sksi_hl_storage_modules() {
        return set.clear_set(sksi_hl_storage_module_generation.$sksi_hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5261L)
    public static SubLObject note_sksi_hl_storage_module_by_sks(final SubLObject sks, final SubLObject hl_module) {
        return dictionary_utilities.dictionary_pushnew(sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, hl_module, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5408L)
    public static SubLObject un_note_sksi_hl_storage_modules_by_sks(final SubLObject sks) {
        return dictionary.dictionary_remove(sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5538L)
    public static SubLObject clear_sksi_hl_storage_modules_by_sks_cache() {
        return dictionary.clear_dictionary(sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5664L)
    public static SubLObject un_note_sksi_hl_storage_modules_by_sks_for_module(final SubLObject hl_module) {
        SubLObject cdolist_list_var = dictionary.dictionary_keys(sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$.getGlobalValue());
        SubLObject sks = (SubLObject)sksi_hl_storage_module_generation.NIL;
        sks = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_delete_from_value(sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, hl_module, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 5930L)
    public static SubLObject sksi_hl_storage_modules_by_sks_find_modules(final SubLObject sks) {
        return dictionary.dictionary_lookup_without_values(sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$.getGlobalValue(), sks, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 6080L)
    public static SubLObject register_sksi_hl_storage_modules_for_sks(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == sksi_hl_storage_module_generation.UNPROVIDED) {
            meta_mt = (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        return Sequences.length(register_sksi_hl_storage_modules_for_sks_int(sks, meta_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 6886L)
    public static SubLObject register_sksi_hl_storage_modules_for_sks_int(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == sksi_hl_storage_module_generation.UNPROVIDED) {
            meta_mt = (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_modules = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_hl_storage_module_generation.NIL == meta_mt) {
                    meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                final SubLObject mt_var = meta_mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    deregister_sksi_hl_storage_modules_for_sks(sks, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
                    SubLObject cdolist_list_var;
                    final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    SubLObject sub_ks = (SubLObject)sksi_hl_storage_module_generation.NIL;
                    sub_ks = cdolist_list_var.first();
                    while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
                        final SubLObject new_hl_modules = register_sksi_hl_storage_modules_for_just_sks(sub_ks, meta_mt);
                        hl_modules = ConsesLow.append(new_hl_modules, hl_modules);
                        cdolist_list_var = cdolist_list_var.rest();
                        sub_ks = cdolist_list_var.first();
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_hl_storage_module_generation.T, thread);
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
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 7625L)
    public static SubLObject register_sksi_hl_storage_modules_for_just_sks(final SubLObject sk_source, SubLObject meta_mt) {
        if (meta_mt == sksi_hl_storage_module_generation.UNPROVIDED) {
            meta_mt = (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module_infos = (SubLObject)sksi_hl_storage_module_generation.NIL;
        SubLObject modifiableP = (SubLObject)sksi_hl_storage_module_generation.NIL;
        if (sksi_hl_storage_module_generation.NIL == meta_mt) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            modifiableP = sksi_kb_accessors.modifiable_sk_source_p(sk_source);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_hl_storage_module_generation.NIL == modifiableP) {
            return (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_hl_storage_module_generation.NIL, meta_mt);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_3 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var;
                hl_module_infos = (cdolist_list_var = sks_hl_storage_module_infos(sk_source, meta_mt));
                SubLObject hl_module_info = (SubLObject)sksi_hl_storage_module_generation.NIL;
                hl_module_info = cdolist_list_var.first();
                while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
                    final SubLObject hl_module = declare_hl_storage_module_with_module_info(hl_module_info);
                    note_sksi_hl_storage_module(hl_module);
                    note_sksi_hl_storage_module_by_sks(sk_source, hl_module);
                    cdolist_list_var = cdolist_list_var.rest();
                    hl_module_info = cdolist_list_var.first();
                }
                hl_storage_modules.reclassify_hl_storage_modules();
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_hl_storage_module_generation.T, thread);
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
            memoization_state.$memoization_state$.rebind(_prev_bind_3, thread);
        }
        return hl_module_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 8934L)
    public static SubLObject deregister_all_sksi_hl_storage_modules() {
        SubLObject cdolist_list_var = set.set_element_list(sksi_hl_storage_module_generation.$sksi_hl_storage_modules$.getGlobalValue());
        SubLObject hl_module = (SubLObject)sksi_hl_storage_module_generation.NIL;
        hl_module = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            final SubLObject name = hl_storage_modules.hl_storage_module_name(hl_module);
            hl_storage_modules.undeclare_hl_storage_module(name);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        hl_storage_modules.reclassify_hl_storage_modules();
        un_note_all_sksi_hl_storage_modules();
        clear_sksi_hl_storage_modules_by_sks_cache();
        return sksi_hl_storage_modules_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 9358L)
    public static SubLObject deregister_sksi_hl_storage_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP) {
        if (mapping_mt == sksi_hl_storage_module_generation.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        if (reclassifyP == sksi_hl_storage_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_hl_storage_module_generation.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject removed_count = (SubLObject)sksi_hl_storage_module_generation.ZERO_INTEGER;
        if (sksi_hl_storage_module_generation.NIL == mapping_mt) {
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
            SubLObject sub_ks = (SubLObject)sksi_hl_storage_module_generation.NIL;
            sub_ks = cdolist_list_var.first();
            while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
                removed_count = Numbers.add(removed_count, deregister_sksi_hl_storage_modules_for_just_sks(sub_ks, (SubLObject)sksi_hl_storage_module_generation.NIL));
                cdolist_list_var = cdolist_list_var.rest();
                sub_ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_hl_storage_module_generation.NIL != reclassifyP) {
            hl_storage_modules.reclassify_hl_storage_modules();
        }
        return Values.values(removed_count, sksi_hl_storage_modules_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 10018L)
    public static SubLObject deregister_sksi_hl_storage_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP) {
        if (reclassifyP == sksi_hl_storage_module_generation.UNPROVIDED) {
            reclassifyP = (SubLObject)sksi_hl_storage_module_generation.T;
        }
        final SubLObject hl_modules = sksi_hl_storage_modules_by_sks_find_modules(sks);
        SubLObject removed_count = (SubLObject)sksi_hl_storage_module_generation.ZERO_INTEGER;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = (SubLObject)sksi_hl_storage_module_generation.NIL;
        hl_module = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            if (sksi_hl_storage_module_generation.NIL != deregister_sksi_hl_storage_module(hl_module, (SubLObject)sksi_hl_storage_module_generation.NIL)) {
                removed_count = Numbers.add(removed_count, (SubLObject)sksi_hl_storage_module_generation.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        un_note_sksi_hl_storage_modules_by_sks(sks);
        if (sksi_hl_storage_module_generation.NIL != reclassifyP) {
            hl_storage_modules.reclassify_hl_storage_modules();
        }
        return Values.values(removed_count, sksi_hl_storage_modules_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 10609L)
    public static SubLObject deregister_sksi_hl_storage_module(final SubLObject hl_module, SubLObject reclassify_hl_storage_modulesP) {
        if (reclassify_hl_storage_modulesP == sksi_hl_storage_module_generation.UNPROVIDED) {
            reclassify_hl_storage_modulesP = (SubLObject)sksi_hl_storage_module_generation.T;
        }
        if (sksi_hl_storage_module_generation.NIL == sksi_hl_storage_module_p(hl_module)) {
            return (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        hl_storage_modules.undeclare_hl_storage_module(inference_modules.hl_module_name(hl_module));
        un_note_sksi_hl_storage_module(hl_module);
        if (sksi_hl_storage_module_generation.NIL != reclassify_hl_storage_modulesP) {
            hl_storage_modules.reclassify_hl_storage_modules();
            un_note_sksi_hl_storage_modules_by_sks_for_module(hl_module);
        }
        return (SubLObject)sksi_hl_storage_module_generation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 11177L)
    public static SubLObject hl_storage_module_info_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 11719L)
    public static SubLObject new_hl_storage_module_info() {
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 11779L)
    public static SubLObject hl_storage_module_info_add(final SubLObject module_info, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_hl_storage_module_generation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_hl_storage_module_generation.NIL == conses_high.member(property, hl_storage_modules.hl_storage_module_properties(), (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED)) {
            Errors.error((SubLObject)sksi_hl_storage_module_generation.$str7$_S_was_not_a_valid_HL_storage_mod, property);
        }
        return conses_high.putf(module_info, property, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 12015L)
    public static SubLObject hl_storage_module_info_get(final SubLObject module_info, final SubLObject property, SubLObject v_default) {
        if (v_default == sksi_hl_storage_module_generation.UNPROVIDED) {
            v_default = (SubLObject)sksi_hl_storage_module_generation.NIL;
        }
        return conses_high.getf(module_info, property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 12145L)
    public static SubLObject hl_storage_module_info_remove(final SubLObject module_info, final SubLObject property) {
        return conses_high.remf(module_info, property);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 12252L)
    public static SubLObject declare_hl_storage_module_with_module_info(SubLObject module_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject module_name = determine_hl_storage_module_info_name(module_info);
        final SubLObject pretty_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw8$PRETTY_NAME, pretty_name);
        return hl_storage_modules.hl_storage_module(module_name, module_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 12811L)
    public static SubLObject determine_hl_storage_module_info_name(final SubLObject module_info) {
        final SubLObject applicability_pattern = hl_storage_module_info_get(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw9$APPLICABILITY_PATTERN, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
        final SubLObject sense = hl_storage_module_info_get(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw10$SENSE, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
        SubLObject substrings = (SubLObject)sksi_hl_storage_module_generation.NIL;
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(applicability_pattern, (SubLObject)sksi_hl_storage_module_generation.$kw11$IGNORE);
        SubLObject v_term = (SubLObject)sksi_hl_storage_module_generation.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            final SubLObject string_term = (sksi_hl_storage_module_generation.NIL != constant_handles.constant_p(v_term)) ? string_utilities.str(v_term) : Strings.string_downcase(string_utilities.str(v_term), (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
            final SubLObject term_strings = string_utilities.relevant_substrings(string_term);
            substrings = ConsesLow.nconc(Sequences.nreverse(term_strings), substrings);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        substrings = (SubLObject)ConsesLow.cons(Strings.string_downcase(string_utilities.str(sense), (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED), substrings);
        substrings = Sequences.nreverse(substrings);
        substrings = (SubLObject)ConsesLow.cons((SubLObject)sksi_hl_storage_module_generation.$str12$sksi, substrings);
        return make_sksi_hl_storage_module_name(substrings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 13610L)
    public static SubLObject make_sksi_hl_storage_module_name(final SubLObject substrings) {
        final SubLObject name = string_utilities.bunge(substrings, (SubLObject)Characters.CHAR_hyphen);
        final SubLObject symbol = Symbols.gensym(Strings.string_upcase(name, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED));
        final SubLObject keyword = Symbols.make_keyword(symbol);
        return Values.values(keyword, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 13916L)
    public static SubLObject sks_hl_storage_module_infos(final SubLObject sk_source, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(meta_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(meta_mt), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
            if (sksi_hl_storage_module_generation.NIL != content_mt) {
                result = sk_source_hl_storage_module_infos(sk_source, content_mt);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 14594L)
    public static SubLObject sk_source_hl_storage_module_infos(final SubLObject sk_source, final SubLObject content_mt) {
        final SubLObject physical_schemas = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
        SubLObject result = (SubLObject)sksi_hl_storage_module_generation.NIL;
        SubLObject cdolist_list_var = physical_schemas;
        SubLObject ps = (SubLObject)sksi_hl_storage_module_generation.NIL;
        ps = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            final SubLObject module_infos = physical_schema_hl_storage_module_infos(ps, sk_source, content_mt);
            result = ConsesLow.nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            ps = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 15282L)
    public static SubLObject physical_schema_hl_storage_module_infos(final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLObject logical_schemas = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
        SubLObject result = (SubLObject)sksi_hl_storage_module_generation.NIL;
        SubLObject cdolist_list_var = logical_schemas;
        SubLObject ls = (SubLObject)sksi_hl_storage_module_generation.NIL;
        ls = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            final SubLObject module_infos = logical_schema_hl_storage_module_infos(ls, physical_schema, sk_source, content_mt);
            result = ConsesLow.nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            ls = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 16123L)
    public static SubLObject logical_schema_hl_storage_module_infos(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        SubLObject result = (SubLObject)sksi_hl_storage_module_generation.NIL;
        SubLObject cdolist_list_var;
        final SubLObject meaning_sentences = cdolist_list_var = ConsesLow.append(sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED), sksi_meaning_sentence_utilities.logical_schema_consequent_meaning_sentences(logical_schema, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED));
        SubLObject sentence = (SubLObject)sksi_hl_storage_module_generation.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(sentence);
            if (sksi_hl_storage_module_generation.NIL != sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_for_storage_p(pred, content_mt)) {
                final SubLObject module_infos = meaning_sentence_hl_storage_module_infos(sentence, logical_schema, physical_schema, sk_source, content_mt);
                result = ConsesLow.nconc(result, module_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 17232L)
    public static SubLObject meaning_sentence_hl_storage_module_infos(final SubLObject sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLObject rev_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(sentence);
        if (sksi_hl_storage_module_generation.NIL != el_utilities.atomic_sentenceP(rev_sentence)) {
            return pos_atomic_meaning_sentence_hl_storage_module_infos(rev_sentence, logical_schema, physical_schema, sk_source, content_mt);
        }
        if (sksi_hl_storage_module_generation.NIL != el_utilities.el_negation_p(rev_sentence) && sksi_hl_storage_module_generation.NIL != el_utilities.atomic_sentenceP(cycl_utilities.sentence_arg1(rev_sentence, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED))) {
            final SubLObject subsentence = cycl_utilities.sentence_arg1(rev_sentence, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
            return negated_atomic_meaning_sentence_hl_storage_module_infos(subsentence, logical_schema, physical_schema, sk_source, content_mt);
        }
        Errors.error((SubLObject)sksi_hl_storage_module_generation.$str13$complex_non_atomic_meaning_senten);
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 18376L)
    public static SubLObject negated_atomic_meaning_sentence_hl_storage_module_infos(final SubLObject pos_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 18619L)
    public static SubLObject pos_atomic_meaning_sentence_hl_storage_module_infos(final SubLObject sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        SubLObject module_infos = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject logical_field_indexical_termnums = sksi_removal_module_generation.sentence_termnums_containing_logical_field_indexicals(sentence);
        SubLObject cdolist_list_var;
        final SubLObject required_module_infos = cdolist_list_var = pos_atomic_meaning_sentence_applicability_pattern_infos(sentence, logical_schema, physical_schema, sk_source, content_mt, logical_field_indexical_termnums);
        SubLObject required_info = (SubLObject)sksi_hl_storage_module_generation.NIL;
        required_info = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            final SubLObject module_info = required_info_hl_storage_module_info(required_info, sentence, logical_schema, physical_schema, sk_source, content_mt);
            module_infos = (SubLObject)ConsesLow.cons(module_info, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            required_info = cdolist_list_var.first();
        }
        return Sequences.nreverse(module_infos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 19513L)
    public static SubLObject pos_atomic_meaning_sentence_applicability_pattern_infos(final SubLObject meaning_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject logical_field_indexical_termnums) {
        SubLObject module_infos = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject meaning_sentence_predicate_is_logical_fieldP = sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(meaning_sentence);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
        final SubLObject pred_list = (SubLObject)((sksi_hl_storage_module_generation.NIL != meaning_sentence_predicate_is_logical_fieldP) ? sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED) : sksi_hl_storage_module_generation.NIL);
        SubLObject cdolist_list_var;
        SubLObject applicability_patterns = cdolist_list_var = compute_meaning_sentence_applicability_patterns(meaning_sentence, logical_field_indexical_termnums, (SubLObject)sksi_hl_storage_module_generation.$kw14$POS);
        SubLObject applicability_pattern = (SubLObject)sksi_hl_storage_module_generation.NIL;
        applicability_pattern = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            SubLObject module_info = new_hl_storage_module_info();
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw10$SENSE, (SubLObject)sksi_hl_storage_module_generation.$kw14$POS);
            if (sksi_hl_storage_module_generation.NIL != meaning_sentence_predicate_is_logical_fieldP) {
                module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw15$ANY_PREDICATES, pred_list);
            }
            else {
                module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw16$PREDICATE, pred);
            }
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw9$APPLICABILITY_PATTERN, applicability_pattern);
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw17$REQUIRED_MT, content_mt);
            module_infos = (SubLObject)ConsesLow.cons(module_info, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            applicability_pattern = cdolist_list_var.first();
        }
        applicability_patterns = (cdolist_list_var = compute_meaning_sentence_applicability_patterns(meaning_sentence, logical_field_indexical_termnums, (SubLObject)sksi_hl_storage_module_generation.$kw18$NEG));
        applicability_pattern = (SubLObject)sksi_hl_storage_module_generation.NIL;
        applicability_pattern = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            SubLObject module_info = new_hl_storage_module_info();
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw10$SENSE, (SubLObject)sksi_hl_storage_module_generation.$kw18$NEG);
            if (sksi_hl_storage_module_generation.NIL != meaning_sentence_predicate_is_logical_fieldP) {
                module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw15$ANY_PREDICATES, pred_list);
            }
            else {
                module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw16$PREDICATE, pred);
            }
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw9$APPLICABILITY_PATTERN, applicability_pattern);
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw17$REQUIRED_MT, content_mt);
            module_infos = (SubLObject)ConsesLow.cons(module_info, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            applicability_pattern = cdolist_list_var.first();
        }
        return Sequences.nreverse(module_infos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 22158L)
    public static SubLObject compute_meaning_sentence_applicability_patterns(final SubLObject meaning_sentence, final SubLObject logical_field_indexical_termnums, final SubLObject sense) {
        SubLObject pattern = el_utilities.copy_expression(meaning_sentence);
        SubLObject cdolist_list_var = logical_field_indexical_termnums;
        SubLObject arg_pos_list = (SubLObject)sksi_hl_storage_module_generation.NIL;
        arg_pos_list = cdolist_list_var.first();
        while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = arg_pos_list;
            SubLObject arg_pos = (SubLObject)sksi_hl_storage_module_generation.NIL;
            arg_pos = cdolist_list_var_$4.first();
            while (sksi_hl_storage_module_generation.NIL != cdolist_list_var_$4) {
                pattern = cycl_utilities.formula_arg_position_nsubst((SubLObject)sksi_hl_storage_module_generation.$kw19$FULLY_BOUND, arg_pos, pattern);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                arg_pos = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_list = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 22859L)
    public static SubLObject required_info_hl_storage_module_info(SubLObject module_info, final SubLObject sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject applicability_pattern = hl_storage_module_info_get(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw9$APPLICABILITY_PATTERN, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
        final SubLObject sense = hl_storage_module_info_get(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw10$SENSE, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED);
        final SubLObject direction = sksi_kb_accessors.get_sks_storage_direction_from_kb(sk_source);
        final SubLObject documentation = sksi_make_documentation_string_from_applicability_pattern_and_sense(applicability_pattern, sense);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw17$REQUIRED_MT, content_mt);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw20$MODULE_SUBTYPE, (SubLObject)sksi_hl_storage_module_generation.$kw21$SKSI);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw22$MODULE_SOURCE, sk_source);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw23$ARGUMENT_TYPE, (SubLObject)sksi_hl_storage_module_generation.$kw24$ARGUMENT);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw25$DIRECTION, direction);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw26$INCOMPLETENESS, (SubLObject)sksi_hl_storage_module_generation.$sym27$SKSI_SENTENCE_HL_STORAGE_MODULE_INCOMPLETENESS);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw28$ADD, (SubLObject)sksi_hl_storage_module_generation.$sym29$SKSI_SENTENCE_HL_STORAGE_MODULE_ASSERT);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw30$REMOVE, (SubLObject)sksi_hl_storage_module_generation.$sym31$SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT);
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw32$REMOVE_ALL, (SubLObject)sksi_hl_storage_module_generation.$sym31$SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT);
        if (sksi_hl_storage_module_generation.NIL != sksi_hl_storage_module_generation.$sksi_hl_storage_modules_only_preferred_over_kb_storageP$.getDynamicValue(thread)) {
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw33$PREFERRED_OVER, (SubLObject)sksi_hl_storage_module_generation.$list34);
        }
        else {
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw35$EXCLUSIVE, (SubLObject)sksi_hl_storage_module_generation.$sym36$TRUE);
            module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw37$SUPPLANTS, (SubLObject)sksi_hl_storage_module_generation.$list34);
        }
        module_info = hl_storage_module_info_add(module_info, (SubLObject)sksi_hl_storage_module_generation.$kw38$DOCUMENTATION, documentation);
        return module_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 25234L)
    public static SubLObject sksi_make_documentation_string_from_applicability_pattern_and_sense(final SubLObject applicability_pattern, final SubLObject sense) {
        SubLObject string = format_nil.format_nil_a(applicability_pattern);
        if (sense == sksi_hl_storage_module_generation.$kw18$NEG) {
            string = Sequences.cconcatenate((SubLObject)sksi_hl_storage_module_generation.$str39$___not_, new SubLObject[] { string, sksi_hl_storage_module_generation.$str40$_ });
        }
        string = string_utilities.replace_substring(string, (SubLObject)sksi_hl_storage_module_generation.$str41$_FULLY_BOUND, (SubLObject)sksi_hl_storage_module_generation.$str42$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, (SubLObject)sksi_hl_storage_module_generation.$str43$_FULLY_BOUND, (SubLObject)sksi_hl_storage_module_generation.$str44$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, (SubLObject)sksi_hl_storage_module_generation.$str45$NOT_FULLY_BOUND, (SubLObject)sksi_hl_storage_module_generation.$str46$_NOT_FULLY_BOUND_);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 25806L)
    public static SubLObject sksi_sentence_hl_storage_module_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        assert sksi_hl_storage_module_generation.NIL != arguments.asserted_argument_spec_p(argument_spec) : argument_spec;
        SubLObject incompleteness = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
        if (sksi_hl_storage_module_generation.$kw48$MONOTONIC != strength_spec) {
            incompleteness = (SubLObject)ConsesLow.cons((SubLObject)sksi_hl_storage_module_generation.$kw49$STRENGTH, incompleteness);
        }
        return incompleteness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 26225L)
    public static SubLObject sksi_sentence_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_hl_storage_module_generation.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_hl_storage_module_generation.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_hl_storage_module_generation.$str50$__SKSI__A_, (SubLObject)sksi_hl_storage_module_generation.$str51$_sksi_sentence_hl_storage_module_), new SubLObject[] { sksi_hl_storage_module_generation.NINE_INTEGER, argument_spec, cnf, mt, direction, variable_map });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject hl_storage_module = hl_storage_modules.currently_executing_hl_storage_module();
        final SubLObject sk_source = inference_modules.hl_module_source(hl_storage_module);
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_hl_storage_module_generation.NIL, mapping_mt);
        SubLObject successP = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject physical_schemas = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
            SubLObject ps = (SubLObject)sksi_hl_storage_module_generation.NIL;
            ps = cdolist_list_var.first();
            while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$5;
                final SubLObject logical_schemas = cdolist_list_var_$5 = sksi_kb_accessors.physical_schema_logical_schemata(ps);
                SubLObject ls = (SubLObject)sksi_hl_storage_module_generation.NIL;
                ls = cdolist_list_var_$5.first();
                while (sksi_hl_storage_module_generation.NIL != cdolist_list_var_$5) {
                    final SubLObject partial_successP = sksi_incremental_edit.sksi_store_logical_sentence(asent, sk_source, ls, ps, mapping_mt, access_path);
                    if (sksi_hl_storage_module_generation.NIL != partial_successP) {
                        successP = partial_successP;
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    ls = cdolist_list_var_$5.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                ps = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_hl_storage_module_generation.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_hl_storage_module_generation.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_hl_storage_module_generation.$str50$__SKSI__A_, (SubLObject)sksi_hl_storage_module_generation.$str52$sksi_sentence_hl_storage_module_a), (SubLObject)sksi_hl_storage_module_generation.NINE_INTEGER, successP);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/sksi-hl-storage-module-generation.lisp", position = 27303L)
    public static SubLObject sksi_sentence_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject hl_storage_module = hl_storage_modules.currently_executing_hl_storage_module();
        final SubLObject sk_source = inference_modules.hl_module_source(hl_storage_module);
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_hl_storage_module_generation.NIL, mapping_mt);
        SubLObject successP = (SubLObject)sksi_hl_storage_module_generation.NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject physical_schemas = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(sk_source);
            SubLObject ps = (SubLObject)sksi_hl_storage_module_generation.NIL;
            ps = cdolist_list_var.first();
            while (sksi_hl_storage_module_generation.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$6;
                final SubLObject logical_schemas = cdolist_list_var_$6 = sksi_kb_accessors.physical_schema_logical_schemata(ps);
                SubLObject ls = (SubLObject)sksi_hl_storage_module_generation.NIL;
                ls = cdolist_list_var_$6.first();
                while (sksi_hl_storage_module_generation.NIL != cdolist_list_var_$6) {
                    final SubLObject partial_successP = sksi_incremental_edit.sksi_delete_logical_sentence(asent, sk_source, ls, ps, mapping_mt, access_path);
                    if (sksi_hl_storage_module_generation.NIL != partial_successP) {
                        successP = partial_successP;
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    ls = cdolist_list_var_$6.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                ps = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    public static SubLObject declare_sksi_hl_storage_module_generation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_hl_storage_module_p", "SKSI-HL-STORAGE-MODULE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "do_sksi_hl_storage_modules", "DO-SKSI-HL-STORAGE-MODULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "do_sksi_hl_storage_modules_list", "DO-SKSI-HL-STORAGE-MODULES-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_hl_storage_modules_count", "SKSI-HL-STORAGE-MODULES-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "note_sksi_hl_storage_module", "NOTE-SKSI-HL-STORAGE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "un_note_sksi_hl_storage_module", "UN-NOTE-SKSI-HL-STORAGE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "un_note_all_sksi_hl_storage_modules", "UN-NOTE-ALL-SKSI-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "note_sksi_hl_storage_module_by_sks", "NOTE-SKSI-HL-STORAGE-MODULE-BY-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "un_note_sksi_hl_storage_modules_by_sks", "UN-NOTE-SKSI-HL-STORAGE-MODULES-BY-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "clear_sksi_hl_storage_modules_by_sks_cache", "CLEAR-SKSI-HL-STORAGE-MODULES-BY-SKS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "un_note_sksi_hl_storage_modules_by_sks_for_module", "UN-NOTE-SKSI-HL-STORAGE-MODULES-BY-SKS-FOR-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_hl_storage_modules_by_sks_find_modules", "SKSI-HL-STORAGE-MODULES-BY-SKS-FIND-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "register_sksi_hl_storage_modules_for_sks", "REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "register_sksi_hl_storage_modules_for_sks_int", "REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "register_sksi_hl_storage_modules_for_just_sks", "REGISTER-SKSI-HL-STORAGE-MODULES-FOR-JUST-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "deregister_all_sksi_hl_storage_modules", "DEREGISTER-ALL-SKSI-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "deregister_sksi_hl_storage_modules_for_sks", "DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "deregister_sksi_hl_storage_modules_for_just_sks", "DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-JUST-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "deregister_sksi_hl_storage_module", "DEREGISTER-SKSI-HL-STORAGE-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "hl_storage_module_info_p", "HL-STORAGE-MODULE-INFO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "new_hl_storage_module_info", "NEW-HL-STORAGE-MODULE-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "hl_storage_module_info_add", "HL-STORAGE-MODULE-INFO-ADD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "hl_storage_module_info_get", "HL-STORAGE-MODULE-INFO-GET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "hl_storage_module_info_remove", "HL-STORAGE-MODULE-INFO-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "declare_hl_storage_module_with_module_info", "DECLARE-HL-STORAGE-MODULE-WITH-MODULE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "determine_hl_storage_module_info_name", "DETERMINE-HL-STORAGE-MODULE-INFO-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "make_sksi_hl_storage_module_name", "MAKE-SKSI-HL-STORAGE-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sks_hl_storage_module_infos", "SKS-HL-STORAGE-MODULE-INFOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sk_source_hl_storage_module_infos", "SK-SOURCE-HL-STORAGE-MODULE-INFOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "physical_schema_hl_storage_module_infos", "PHYSICAL-SCHEMA-HL-STORAGE-MODULE-INFOS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "logical_schema_hl_storage_module_infos", "LOGICAL-SCHEMA-HL-STORAGE-MODULE-INFOS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "meaning_sentence_hl_storage_module_infos", "MEANING-SENTENCE-HL-STORAGE-MODULE-INFOS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "negated_atomic_meaning_sentence_hl_storage_module_infos", "NEGATED-ATOMIC-MEANING-SENTENCE-HL-STORAGE-MODULE-INFOS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "pos_atomic_meaning_sentence_hl_storage_module_infos", "POS-ATOMIC-MEANING-SENTENCE-HL-STORAGE-MODULE-INFOS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "pos_atomic_meaning_sentence_applicability_pattern_infos", "POS-ATOMIC-MEANING-SENTENCE-APPLICABILITY-PATTERN-INFOS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "compute_meaning_sentence_applicability_patterns", "COMPUTE-MEANING-SENTENCE-APPLICABILITY-PATTERNS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "required_info_hl_storage_module_info", "REQUIRED-INFO-HL-STORAGE-MODULE-INFO", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_make_documentation_string_from_applicability_pattern_and_sense", "SKSI-MAKE-DOCUMENTATION-STRING-FROM-APPLICABILITY-PATTERN-AND-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_sentence_hl_storage_module_incompleteness", "SKSI-SENTENCE-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_sentence_hl_storage_module_assert", "SKSI-SENTENCE-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.sksi_hl_storage_module_generation", "sksi_sentence_hl_storage_module_unassert", "SKSI-SENTENCE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    public static SubLObject init_sksi_hl_storage_module_generation_file() {
        sksi_hl_storage_module_generation.$sksi_hl_storage_modules$ = SubLFiles.deflexical("*SKSI-HL-STORAGE-MODULES*", maybeDefault((SubLObject)sksi_hl_storage_module_generation.$sym0$_SKSI_HL_STORAGE_MODULES_, sksi_hl_storage_module_generation.$sksi_hl_storage_modules$, ()->(set.new_set((SubLObject)sksi_hl_storage_module_generation.UNPROVIDED, (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED))));
        sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$ = SubLFiles.deflexical("*SKSI-HL-STORAGE-MODULES-BY-SKS*", maybeDefault((SubLObject)sksi_hl_storage_module_generation.$sym6$_SKSI_HL_STORAGE_MODULES_BY_SKS_, sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_hl_storage_module_generation.EQ), (SubLObject)sksi_hl_storage_module_generation.UNPROVIDED))));
        sksi_hl_storage_module_generation.$sksi_hl_storage_modules_only_preferred_over_kb_storageP$ = SubLFiles.defparameter("*SKSI-HL-STORAGE-MODULES-ONLY-PREFERRED-OVER-KB-STORAGE?*", (SubLObject)sksi_hl_storage_module_generation.NIL);
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    public static SubLObject setup_sksi_hl_storage_module_generation_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_hl_storage_module_generation.$sym0$_SKSI_HL_STORAGE_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_hl_storage_module_generation.$sym6$_SKSI_HL_STORAGE_MODULES_BY_SKS_);
        return (SubLObject)sksi_hl_storage_module_generation.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_hl_storage_module_generation_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_hl_storage_module_generation_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_hl_storage_module_generation_file();
    }
    
    static {
        me = (SubLFile)new sksi_hl_storage_module_generation();
        sksi_hl_storage_module_generation.$sksi_hl_storage_modules$ = null;
        sksi_hl_storage_module_generation.$sksi_hl_storage_modules_by_sks$ = null;
        sksi_hl_storage_module_generation.$sksi_hl_storage_modules_only_preferred_over_kb_storageP$ = null;
        $sym0$_SKSI_HL_STORAGE_MODULES_ = SubLObjectFactory.makeSymbol("*SKSI-HL-STORAGE-MODULES*");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-HL-STORAGE-MODULES*"));
        $sym4$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-HL-STORAGE-MODULES*")));
        $sym6$_SKSI_HL_STORAGE_MODULES_BY_SKS_ = SubLObjectFactory.makeSymbol("*SKSI-HL-STORAGE-MODULES-BY-SKS*");
        $str7$_S_was_not_a_valid_HL_storage_mod = SubLObjectFactory.makeString("~S was not a valid HL storage module parameter");
        $kw8$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $kw9$APPLICABILITY_PATTERN = SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN");
        $kw10$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw11$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str12$sksi = SubLObjectFactory.makeString("sksi");
        $str13$complex_non_atomic_meaning_senten = SubLObjectFactory.makeString("complex non-atomic meaning sentences not handled yet");
        $kw14$POS = SubLObjectFactory.makeKeyword("POS");
        $kw15$ANY_PREDICATES = SubLObjectFactory.makeKeyword("ANY-PREDICATES");
        $kw16$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw17$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $kw18$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw19$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $kw20$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $kw21$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $kw22$MODULE_SOURCE = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $kw23$ARGUMENT_TYPE = SubLObjectFactory.makeKeyword("ARGUMENT-TYPE");
        $kw24$ARGUMENT = SubLObjectFactory.makeKeyword("ARGUMENT");
        $kw25$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw26$INCOMPLETENESS = SubLObjectFactory.makeKeyword("INCOMPLETENESS");
        $sym27$SKSI_SENTENCE_HL_STORAGE_MODULE_INCOMPLETENESS = SubLObjectFactory.makeSymbol("SKSI-SENTENCE-HL-STORAGE-MODULE-INCOMPLETENESS");
        $kw28$ADD = SubLObjectFactory.makeKeyword("ADD");
        $sym29$SKSI_SENTENCE_HL_STORAGE_MODULE_ASSERT = SubLObjectFactory.makeSymbol("SKSI-SENTENCE-HL-STORAGE-MODULE-ASSERT");
        $kw30$REMOVE = SubLObjectFactory.makeKeyword("REMOVE");
        $sym31$SKSI_SENTENCE_HL_STORAGE_MODULE_UNASSERT = SubLObjectFactory.makeSymbol("SKSI-SENTENCE-HL-STORAGE-MODULE-UNASSERT");
        $kw32$REMOVE_ALL = SubLObjectFactory.makeKeyword("REMOVE-ALL");
        $kw33$PREFERRED_OVER = SubLObjectFactory.makeKeyword("PREFERRED-OVER");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REGULAR-KB-ASSERTION"));
        $kw35$EXCLUSIVE = SubLObjectFactory.makeKeyword("EXCLUSIVE");
        $sym36$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $kw37$SUPPLANTS = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $kw38$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $str39$___not_ = SubLObjectFactory.makeString("(#$not ");
        $str40$_ = SubLObjectFactory.makeString(")");
        $str41$_FULLY_BOUND = SubLObjectFactory.makeString(" FULLY-BOUND");
        $str42$__FULLY_BOUND_ = SubLObjectFactory.makeString(" <FULLY-BOUND>");
        $str43$_FULLY_BOUND = SubLObjectFactory.makeString("(FULLY-BOUND");
        $str44$__FULLY_BOUND_ = SubLObjectFactory.makeString("(<FULLY-BOUND>");
        $str45$NOT_FULLY_BOUND = SubLObjectFactory.makeString("NOT-FULLY-BOUND");
        $str46$_NOT_FULLY_BOUND_ = SubLObjectFactory.makeString("<NOT-FULLY-BOUND>");
        $sym47$ASSERTED_ARGUMENT_SPEC_P = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-SPEC-P");
        $kw48$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw49$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $str50$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str51$_sksi_sentence_hl_storage_module_ = SubLObjectFactory.makeString("(sksi-sentence-hl-storage-module-assert ~S ~S ~S ~S ~S)~%");
        $str52$sksi_sentence_hl_storage_module_a = SubLObjectFactory.makeString("sksi-sentence-hl-storage-module-assert -> ~S~%");
    }
}

/*

	Total time: 233 ms
	
*/