package com.cyc.cycjava.cycl.sksi.store_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_sksi_hl_storage_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules";
    public static final String myFingerPrint = "b06071bdd7f8ae483ea3e96acc788c615416ac1b37b0dd6bc4dfcb19ce8b75c8";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 966L)
    private static SubLSymbol $simple_sksi_hl_storage_predicates$;
    private static final SubLSymbol $sym0$_SIMPLE_SKSI_HL_STORAGE_PREDICATES_;
    private static final SubLSymbol $kw1$PRETTY_NAME;
    private static final SubLSymbol $kw2$ARGUMENT_TYPE;
    private static final SubLSymbol $kw3$ARGUMENT;
    private static final SubLSymbol $kw4$PREDICATE;
    private static final SubLSymbol $kw5$APPLICABILITY;
    private static final SubLSymbol $sym6$SIMPLE_SKSI_APPLICABILITY_FUNC;
    private static final SubLSymbol $kw7$INCOMPLETENESS;
    private static final SubLSymbol $sym8$SIMPLE_SKSI_INCOMPLETENESS_FUNC;
    private static final SubLSymbol $kw9$ADD;
    private static final SubLSymbol $sym10$SIMPLE_SKSI_ASSERT_FUNC;
    private static final SubLSymbol $kw11$REMOVE;
    private static final SubLSymbol $sym12$SIMPLE_SKSI_UNASSERT_FUNC;
    private static final SubLSymbol $kw13$REMOVE_ALL;
    private static final SubLSymbol $sym14$SIMPLE_SKSI_UNASSERT_ALL_FUNC;
    private static final SubLSymbol $kw15$POS;
    private static final SubLSymbol $sym16$_EXIT;
    private static final SubLList $list17;
    private static final SubLString $str18$Negation_not_supported_for__s;
    private static final SubLString $str19$Unassert_not_supported_for__s;
    private static final SubLObject $const20$LogicalSchemaForKSWithNameFn;
    private static final SubLObject $const21$PhysicalSchemaForKSFn;
    private static final SubLObject $const22$InferencePSC;
    private static final SubLSymbol $sym23$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const24$SKSIMt;
    private static final SubLString $str25$Could_not_find_the_mappingMt_for_;
    private static final SubLSymbol $kw26$TABLE;
    private static final SubLObject $const27$dBTablePredicate;
    private static final SubLString $str28$Could_not_find_the_DB_table_for__;
    private static final SubLSymbol $kw29$MT;
    private static final SubLObject $const30$schemaTranslation;
    private static final SubLList $list31;
    private static final SubLString $str32$Could_not_find_the_schemaTranslat;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 1311L)
    public static SubLObject register_simple_sksi_hl_storage_predicate(final SubLObject predicate, final SubLObject hl_storage_module_name) {
        return dictionary.dictionary_enter(simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate, hl_storage_module_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 1502L)
    public static SubLObject deregister_simple_sksi_hl_storage_predicate(final SubLObject predicate) {
        return dictionary.dictionary_remove(simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 1650L)
    public static SubLObject simple_sksi_hl_storage_predicateP(final SubLObject predicate) {
        return dictionary_utilities.dictionary_has_keyP(simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 1790L)
    public static SubLObject simple_sksi_hl_storage_module_name(final SubLObject predicate) {
        return dictionary.dictionary_lookup_without_values(simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate, (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 1944L)
    public static SubLObject register_simple_sksi_hl_storage_module_for_predicate(final SubLObject predicate) {
        final SubLObject name = compute_hl_storage_module_name(predicate);
        final SubLObject plist = (SubLObject)ConsesLow.list(new SubLObject[] { simple_sksi_hl_storage_modules.$kw1$PRETTY_NAME, string_utilities.str(predicate), simple_sksi_hl_storage_modules.$kw2$ARGUMENT_TYPE, simple_sksi_hl_storage_modules.$kw3$ARGUMENT, simple_sksi_hl_storage_modules.$kw4$PREDICATE, predicate, simple_sksi_hl_storage_modules.$kw5$APPLICABILITY, simple_sksi_hl_storage_modules.$sym6$SIMPLE_SKSI_APPLICABILITY_FUNC, simple_sksi_hl_storage_modules.$kw7$INCOMPLETENESS, simple_sksi_hl_storage_modules.$sym8$SIMPLE_SKSI_INCOMPLETENESS_FUNC, simple_sksi_hl_storage_modules.$kw9$ADD, simple_sksi_hl_storage_modules.$sym10$SIMPLE_SKSI_ASSERT_FUNC, simple_sksi_hl_storage_modules.$kw11$REMOVE, simple_sksi_hl_storage_modules.$sym12$SIMPLE_SKSI_UNASSERT_FUNC, simple_sksi_hl_storage_modules.$kw13$REMOVE_ALL, simple_sksi_hl_storage_modules.$sym14$SIMPLE_SKSI_UNASSERT_ALL_FUNC });
        register_simple_sksi_hl_storage_predicate(predicate, name);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(predicate);
        return hl_storage_modules.hl_storage_module(name, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 2805L)
    public static SubLObject deregister_simple_sksi_hl_storage_module_for_predicate(final SubLObject predicate) {
        deregister_simple_sksi_hl_storage_predicate(predicate);
        hl_storage_modules.deregister_solely_specific_hl_storage_module_predicate(predicate);
        final SubLObject name = simple_sksi_hl_storage_module_name(predicate);
        return hl_storage_modules.undeclare_hl_storage_module(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 3129L)
    public static SubLObject compute_hl_storage_module_name(final SubLObject predicate) {
        return Symbols.make_keyword(removal_module_utilities.determine_hl_module_name(string_utilities.str(predicate), (SubLObject)simple_sksi_hl_storage_modules.$kw15$POS));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 3275L)
    public static SubLObject simple_sksi_applicability_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (simple_sksi_hl_storage_modules.NIL != clauses.atomic_clause_p(cnf) && simple_sksi_hl_storage_modules.NIL != variables.fully_bound_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (simple_sksi_hl_storage_modules.NIL != simple_sksi_hl_storage_predicateP(predicate)) {
                final SubLObject mapping_mt = simple_sksi_mapping_mt_for_predicate(predicate);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject content_mt = simple_sksi_schema_translation_mt_for_predicate(predicate);
                    if (simple_sksi_hl_storage_modules.NIL != hlmt.hlmt_equal(mt, content_mt)) {
                        return (SubLObject)simple_sksi_hl_storage_modules.T;
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)simple_sksi_hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 3897L)
    public static SubLObject simple_sksi_incompleteness_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return (SubLObject)simple_sksi_hl_storage_modules.$list17;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 4084L)
    public static SubLObject simple_sksi_assert_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (simple_sksi_hl_storage_modules.NIL != clause_utilities.neg_atomic_clause_p(cnf)) {
            return Errors.error((SubLObject)simple_sksi_hl_storage_modules.$str18$Negation_not_supported_for__s, predicate);
        }
        simple_sksi_store_asent_in_db_table(asent);
        return (SubLObject)simple_sksi_hl_storage_modules.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 4613L)
    public static SubLObject simple_sksi_unassert_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return Errors.error((SubLObject)simple_sksi_hl_storage_modules.$str19$Unassert_not_supported_for__s, predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 4917L)
    public static SubLObject simple_sksi_unassert_all_func(final SubLObject cnf, final SubLObject mt) {
        return simple_sksi_unassert_func((SubLObject)simple_sksi_hl_storage_modules.NIL, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 5021L)
    public static SubLObject simple_sksi_store_asent_in_db_table(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject mapping_mt = simple_sksi_mapping_mt_for_predicate(predicate);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject table = simple_sksi_db_table_for_asent(asent);
            final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
            final SubLObject ls = czer_main.canonicalize_term((SubLObject)ConsesLow.list(simple_sksi_hl_storage_modules.$const20$LogicalSchemaForKSWithNameFn, table, table_name), (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED);
            final SubLObject ps = czer_main.canonicalize_term((SubLObject)ConsesLow.list(simple_sksi_hl_storage_modules.$const21$PhysicalSchemaForKSFn, table, table_name), (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED);
            return sksi_batch_store.sksi_store_logical_sentences_in_sk_source((SubLObject)ConsesLow.list(asent), table, ls, ps, mapping_mt, (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 5639L)
    public static SubLObject simple_sksi_mapping_mt_for_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = simple_sksi_db_table_for_predicate_in_mt(predicate, simple_sksi_hl_storage_modules.$const22$InferencePSC);
        final SubLObject db = sksi_kb_accessors.max_genl_ks(table);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)simple_sksi_hl_storage_modules.$sym23$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(simple_sksi_hl_storage_modules.$const24$SKSIMt, thread);
            final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(db);
            if (simple_sksi_hl_storage_modules.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && simple_sksi_hl_storage_modules.NIL == mapping_mt) {
                Errors.error((SubLObject)simple_sksi_hl_storage_modules.$str25$Could_not_find_the_mappingMt_for_, predicate);
            }
            return mapping_mt;
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 6027L)
    public static SubLObject simple_sksi_mapping_mt_for_asent(final SubLObject asent) {
        return simple_sksi_mapping_mt_for_predicate(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 6169L)
    public static SubLObject simple_sksi_db_table_for_predicate(final SubLObject predicate) {
        final SubLObject mapping_mt = simple_sksi_mapping_mt_for_predicate(predicate);
        return simple_sksi_db_table_for_predicate_in_mt(predicate, mapping_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 6383L)
    public static SubLObject simple_sksi_db_table_for_predicate_in_mt(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tables = ask_utilities.query_variable((SubLObject)simple_sksi_hl_storage_modules.$kw26$TABLE, (SubLObject)ConsesLow.list(simple_sksi_hl_storage_modules.$const27$dBTablePredicate, (SubLObject)simple_sksi_hl_storage_modules.$kw26$TABLE, predicate), mt, (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED);
        if (simple_sksi_hl_storage_modules.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && simple_sksi_hl_storage_modules.NIL == list_utilities.singletonP(tables)) {
            Errors.error((SubLObject)simple_sksi_hl_storage_modules.$str28$Could_not_find_the_DB_table_for__, predicate);
        }
        return list_utilities.only_one(tables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 6699L)
    public static SubLObject simple_sksi_db_table_for_asent(final SubLObject asent) {
        return simple_sksi_db_table_for_predicate(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 6837L)
    public static SubLObject simple_sksi_schema_translation_mt_for_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = simple_sksi_mapping_mt_for_predicate(predicate);
        final SubLObject table = simple_sksi_db_table_for_predicate(predicate);
        final SubLObject content_mts = ask_utilities.query_variable((SubLObject)simple_sksi_hl_storage_modules.$kw29$MT, (SubLObject)ConsesLow.listS(simple_sksi_hl_storage_modules.$const30$schemaTranslation, table, (SubLObject)simple_sksi_hl_storage_modules.$list31), mapping_mt, (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED);
        if (simple_sksi_hl_storage_modules.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && simple_sksi_hl_storage_modules.NIL == list_utilities.singletonP(content_mts)) {
            Errors.error((SubLObject)simple_sksi_hl_storage_modules.$str32$Could_not_find_the_schemaTranslat, predicate);
        }
        return list_utilities.only_one(content_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/store-sks/simple-sksi-hl-storage-modules.lisp", position = 7257L)
    public static SubLObject simple_sksi_schema_translation_mt_for_asent(final SubLObject asent) {
        return simple_sksi_schema_translation_mt_for_predicate(cycl_utilities.atomic_sentence_predicate(asent));
    }
    
    public static SubLObject declare_simple_sksi_hl_storage_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "register_simple_sksi_hl_storage_predicate", "REGISTER-SIMPLE-SKSI-HL-STORAGE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "deregister_simple_sksi_hl_storage_predicate", "DEREGISTER-SIMPLE-SKSI-HL-STORAGE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_hl_storage_predicateP", "SIMPLE-SKSI-HL-STORAGE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_hl_storage_module_name", "SIMPLE-SKSI-HL-STORAGE-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "register_simple_sksi_hl_storage_module_for_predicate", "REGISTER-SIMPLE-SKSI-HL-STORAGE-MODULE-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "deregister_simple_sksi_hl_storage_module_for_predicate", "DEREGISTER-SIMPLE-SKSI-HL-STORAGE-MODULE-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "compute_hl_storage_module_name", "COMPUTE-HL-STORAGE-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_applicability_func", "SIMPLE-SKSI-APPLICABILITY-FUNC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_incompleteness_func", "SIMPLE-SKSI-INCOMPLETENESS-FUNC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_assert_func", "SIMPLE-SKSI-ASSERT-FUNC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_unassert_func", "SIMPLE-SKSI-UNASSERT-FUNC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_unassert_all_func", "SIMPLE-SKSI-UNASSERT-ALL-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_store_asent_in_db_table", "SIMPLE-SKSI-STORE-ASENT-IN-DB-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_mapping_mt_for_predicate", "SIMPLE-SKSI-MAPPING-MT-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_mapping_mt_for_asent", "SIMPLE-SKSI-MAPPING-MT-FOR-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_db_table_for_predicate", "SIMPLE-SKSI-DB-TABLE-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_db_table_for_predicate_in_mt", "SIMPLE-SKSI-DB-TABLE-FOR-PREDICATE-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_db_table_for_asent", "SIMPLE-SKSI-DB-TABLE-FOR-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_schema_translation_mt_for_predicate", "SIMPLE-SKSI-SCHEMA-TRANSLATION-MT-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.store_sks.simple_sksi_hl_storage_modules", "simple_sksi_schema_translation_mt_for_asent", "SIMPLE-SKSI-SCHEMA-TRANSLATION-MT-FOR-ASENT", 1, 0, false);
        return (SubLObject)simple_sksi_hl_storage_modules.NIL;
    }
    
    public static SubLObject init_simple_sksi_hl_storage_modules_file() {
        simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$ = SubLFiles.deflexical("*SIMPLE-SKSI-HL-STORAGE-PREDICATES*", (simple_sksi_hl_storage_modules.NIL != Symbols.boundp((SubLObject)simple_sksi_hl_storage_modules.$sym0$_SIMPLE_SKSI_HL_STORAGE_PREDICATES_)) ? simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)simple_sksi_hl_storage_modules.EQ), (SubLObject)simple_sksi_hl_storage_modules.UNPROVIDED));
        return (SubLObject)simple_sksi_hl_storage_modules.NIL;
    }
    
    public static SubLObject setup_simple_sksi_hl_storage_modules_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)simple_sksi_hl_storage_modules.$sym0$_SIMPLE_SKSI_HL_STORAGE_PREDICATES_);
        return (SubLObject)simple_sksi_hl_storage_modules.NIL;
    }
    
    public void declareFunctions() {
        declare_simple_sksi_hl_storage_modules_file();
    }
    
    public void initializeVariables() {
        init_simple_sksi_hl_storage_modules_file();
    }
    
    public void runTopLevelForms() {
        setup_simple_sksi_hl_storage_modules_file();
    }
    
    static {
        me = (SubLFile)new simple_sksi_hl_storage_modules();
        simple_sksi_hl_storage_modules.$simple_sksi_hl_storage_predicates$ = null;
        $sym0$_SIMPLE_SKSI_HL_STORAGE_PREDICATES_ = SubLObjectFactory.makeSymbol("*SIMPLE-SKSI-HL-STORAGE-PREDICATES*");
        $kw1$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $kw2$ARGUMENT_TYPE = SubLObjectFactory.makeKeyword("ARGUMENT-TYPE");
        $kw3$ARGUMENT = SubLObjectFactory.makeKeyword("ARGUMENT");
        $kw4$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw5$APPLICABILITY = SubLObjectFactory.makeKeyword("APPLICABILITY");
        $sym6$SIMPLE_SKSI_APPLICABILITY_FUNC = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-APPLICABILITY-FUNC");
        $kw7$INCOMPLETENESS = SubLObjectFactory.makeKeyword("INCOMPLETENESS");
        $sym8$SIMPLE_SKSI_INCOMPLETENESS_FUNC = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-INCOMPLETENESS-FUNC");
        $kw9$ADD = SubLObjectFactory.makeKeyword("ADD");
        $sym10$SIMPLE_SKSI_ASSERT_FUNC = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-ASSERT-FUNC");
        $kw11$REMOVE = SubLObjectFactory.makeKeyword("REMOVE");
        $sym12$SIMPLE_SKSI_UNASSERT_FUNC = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-UNASSERT-FUNC");
        $kw13$REMOVE_ALL = SubLObjectFactory.makeKeyword("REMOVE-ALL");
        $sym14$SIMPLE_SKSI_UNASSERT_ALL_FUNC = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-UNASSERT-ALL-FUNC");
        $kw15$POS = SubLObjectFactory.makeKeyword("POS");
        $sym16$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"));
        $str18$Negation_not_supported_for__s = SubLObjectFactory.makeString("Negation not supported for ~s");
        $str19$Unassert_not_supported_for__s = SubLObjectFactory.makeString("Unassert not supported for ~s");
        $const20$LogicalSchemaForKSWithNameFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalSchemaForKSWithNameFn"));
        $const21$PhysicalSchemaForKSFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalSchemaForKSFn"));
        $const22$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym23$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const24$SKSIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt"));
        $str25$Could_not_find_the_mappingMt_for_ = SubLObjectFactory.makeString("Could not find the mappingMt for ~s");
        $kw26$TABLE = SubLObjectFactory.makeKeyword("TABLE");
        $const27$dBTablePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTablePredicate"));
        $str28$Could_not_find_the_DB_table_for__ = SubLObjectFactory.makeString("Could not find the DB table for ~s");
        $kw29$MT = SubLObjectFactory.makeKeyword("MT");
        $const30$schemaTranslation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaTranslation"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $str32$Could_not_find_the_schemaTranslat = SubLObjectFactory.makeString("Could not find the schemaTranslation mt for ~s");
    }
}

/*

	Total time: 104 ms
	
*/