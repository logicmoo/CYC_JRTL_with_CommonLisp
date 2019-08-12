package com.cyc.cycjava.cycl.sksi.store_sks;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class simple_sksi_hl_storage_modules extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new simple_sksi_hl_storage_modules();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.store_sks.simple_sksi_hl_storage_modules";




    private static final SubLSymbol $simple_sksi_hl_storage_predicates$ = makeSymbol("*SIMPLE-SKSI-HL-STORAGE-PREDICATES*");











    private static final SubLSymbol SIMPLE_SKSI_APPLICABILITY_FUNC = makeSymbol("SIMPLE-SKSI-APPLICABILITY-FUNC");



    private static final SubLSymbol SIMPLE_SKSI_INCOMPLETENESS_FUNC = makeSymbol("SIMPLE-SKSI-INCOMPLETENESS-FUNC");



    private static final SubLSymbol SIMPLE_SKSI_ASSERT_FUNC = makeSymbol("SIMPLE-SKSI-ASSERT-FUNC");



    private static final SubLSymbol SIMPLE_SKSI_UNASSERT_FUNC = makeSymbol("SIMPLE-SKSI-UNASSERT-FUNC");



    private static final SubLSymbol SIMPLE_SKSI_UNASSERT_ALL_FUNC = makeSymbol("SIMPLE-SKSI-UNASSERT-ALL-FUNC");



    private static final SubLSymbol $sym16$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list17 = list(makeKeyword("MT"), makeKeyword("DIRECTION"), makeKeyword("STRENGTH"));

    private static final SubLString $str18$Negation_not_supported_for__s = makeString("Negation not supported for ~s");

    private static final SubLString $str19$Unassert_not_supported_for__s = makeString("Unassert not supported for ~s");

    private static final SubLObject $$LogicalSchemaForKSWithNameFn = reader_make_constant_shell(makeString("LogicalSchemaForKSWithNameFn"));

    private static final SubLObject $$PhysicalSchemaForKSFn = reader_make_constant_shell(makeString("PhysicalSchemaForKSFn"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));

    private static final SubLString $str25$Could_not_find_the_mappingMt_for_ = makeString("Could not find the mappingMt for ~s");



    private static final SubLObject $$dBTablePredicate = reader_make_constant_shell(makeString("dBTablePredicate"));

    private static final SubLString $str28$Could_not_find_the_DB_table_for__ = makeString("Could not find the DB table for ~s");



    private static final SubLObject $$schemaTranslation = reader_make_constant_shell(makeString("schemaTranslation"));

    private static final SubLList $list31 = list(makeKeyword("MT"));

    private static final SubLString $str32$Could_not_find_the_schemaTranslat = makeString("Could not find the schemaTranslation mt for ~s");

    public static SubLObject register_simple_sksi_hl_storage_predicate(final SubLObject predicate, final SubLObject hl_storage_module_name) {
        return dictionary.dictionary_enter($simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate, hl_storage_module_name);
    }

    public static SubLObject deregister_simple_sksi_hl_storage_predicate(final SubLObject predicate) {
        return dictionary.dictionary_remove($simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate);
    }

    public static SubLObject simple_sksi_hl_storage_predicateP(final SubLObject predicate) {
        return dictionary_utilities.dictionary_has_keyP($simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate);
    }

    public static SubLObject simple_sksi_hl_storage_module_name(final SubLObject predicate) {
        return dictionary.dictionary_lookup_without_values($simple_sksi_hl_storage_predicates$.getGlobalValue(), predicate, UNPROVIDED);
    }

    public static SubLObject register_simple_sksi_hl_storage_module_for_predicate(final SubLObject predicate) {
        final SubLObject name = compute_hl_storage_module_name(predicate);
        final SubLObject plist = list(new SubLObject[]{ $PRETTY_NAME, string_utilities.str(predicate), $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, predicate, $APPLICABILITY, SIMPLE_SKSI_APPLICABILITY_FUNC, $INCOMPLETENESS, SIMPLE_SKSI_INCOMPLETENESS_FUNC, $ADD, SIMPLE_SKSI_ASSERT_FUNC, $REMOVE, SIMPLE_SKSI_UNASSERT_FUNC, $REMOVE_ALL, SIMPLE_SKSI_UNASSERT_ALL_FUNC });
        register_simple_sksi_hl_storage_predicate(predicate, name);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate(predicate);
        return hl_storage_modules.hl_storage_module(name, plist);
    }

    public static SubLObject deregister_simple_sksi_hl_storage_module_for_predicate(final SubLObject predicate) {
        deregister_simple_sksi_hl_storage_predicate(predicate);
        hl_storage_modules.deregister_solely_specific_hl_storage_module_predicate(predicate);
        final SubLObject name = simple_sksi_hl_storage_module_name(predicate);
        return hl_storage_modules.undeclare_hl_storage_module(name);
    }

    public static SubLObject compute_hl_storage_module_name(final SubLObject predicate) {
        return make_keyword(removal_module_utilities.determine_hl_module_name(string_utilities.str(predicate), $POS));
    }

    public static SubLObject simple_sksi_applicability_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != clauses.atomic_clause_p(cnf)) && (NIL != variables.fully_bound_p(cnf))) {
            final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            if (NIL != simple_sksi_hl_storage_predicateP(predicate)) {
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
                    if (NIL != hlmt.hlmt_equal(mt, content_mt)) {
                        return T;
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject simple_sksi_incompleteness_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return $list17;
    }

    public static SubLObject simple_sksi_assert_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != clause_utilities.neg_atomic_clause_p(cnf)) {
            return Errors.error($str18$Negation_not_supported_for__s, predicate);
        }
        simple_sksi_store_asent_in_db_table(asent);
        return T;
    }

    public static SubLObject simple_sksi_unassert_func(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return Errors.error($str19$Unassert_not_supported_for__s, predicate);
    }

    public static SubLObject simple_sksi_unassert_all_func(final SubLObject cnf, final SubLObject mt) {
        return simple_sksi_unassert_func(NIL, cnf, mt);
    }

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
            final SubLObject ls = czer_main.canonicalize_term(list($$LogicalSchemaForKSWithNameFn, table, table_name), UNPROVIDED);
            final SubLObject ps = czer_main.canonicalize_term(list($$PhysicalSchemaForKSFn, table, table_name), UNPROVIDED);
            return sksi_batch_store.sksi_store_logical_sentences_in_sk_source(list(asent), table, ls, ps, mapping_mt, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject simple_sksi_mapping_mt_for_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = simple_sksi_db_table_for_predicate_in_mt(predicate, $$InferencePSC);
        final SubLObject db = sksi_kb_accessors.max_genl_ks(table);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($$SKSIMt, thread);
            final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(db);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == mapping_mt)) {
                Errors.error($str25$Could_not_find_the_mappingMt_for_, predicate);
            }
            return mapping_mt;
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject simple_sksi_mapping_mt_for_asent(final SubLObject asent) {
        return simple_sksi_mapping_mt_for_predicate(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject simple_sksi_db_table_for_predicate(final SubLObject predicate) {
        final SubLObject mapping_mt = simple_sksi_mapping_mt_for_predicate(predicate);
        return simple_sksi_db_table_for_predicate_in_mt(predicate, mapping_mt);
    }

    public static SubLObject simple_sksi_db_table_for_predicate_in_mt(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tables = ask_utilities.query_variable($TABLE, list($$dBTablePredicate, $TABLE, predicate), mt, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(tables))) {
            Errors.error($str28$Could_not_find_the_DB_table_for__, predicate);
        }
        return list_utilities.only_one(tables);
    }

    public static SubLObject simple_sksi_db_table_for_asent(final SubLObject asent) {
        return simple_sksi_db_table_for_predicate(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject simple_sksi_schema_translation_mt_for_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = simple_sksi_mapping_mt_for_predicate(predicate);
        final SubLObject table = simple_sksi_db_table_for_predicate(predicate);
        final SubLObject content_mts = ask_utilities.query_variable($MT, listS($$schemaTranslation, table, $list31), mapping_mt, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(content_mts))) {
            Errors.error($str32$Could_not_find_the_schemaTranslat, predicate);
        }
        return list_utilities.only_one(content_mts);
    }

    public static SubLObject simple_sksi_schema_translation_mt_for_asent(final SubLObject asent) {
        return simple_sksi_schema_translation_mt_for_predicate(cycl_utilities.atomic_sentence_predicate(asent));
    }

    public static SubLObject declare_simple_sksi_hl_storage_modules_file() {
        declareFunction("register_simple_sksi_hl_storage_predicate", "REGISTER-SIMPLE-SKSI-HL-STORAGE-PREDICATE", 2, 0, false);
        declareFunction("deregister_simple_sksi_hl_storage_predicate", "DEREGISTER-SIMPLE-SKSI-HL-STORAGE-PREDICATE", 1, 0, false);
        declareFunction("simple_sksi_hl_storage_predicateP", "SIMPLE-SKSI-HL-STORAGE-PREDICATE?", 1, 0, false);
        declareFunction("simple_sksi_hl_storage_module_name", "SIMPLE-SKSI-HL-STORAGE-MODULE-NAME", 1, 0, false);
        declareFunction("register_simple_sksi_hl_storage_module_for_predicate", "REGISTER-SIMPLE-SKSI-HL-STORAGE-MODULE-FOR-PREDICATE", 1, 0, false);
        declareFunction("deregister_simple_sksi_hl_storage_module_for_predicate", "DEREGISTER-SIMPLE-SKSI-HL-STORAGE-MODULE-FOR-PREDICATE", 1, 0, false);
        declareFunction("compute_hl_storage_module_name", "COMPUTE-HL-STORAGE-MODULE-NAME", 1, 0, false);
        declareFunction("simple_sksi_applicability_func", "SIMPLE-SKSI-APPLICABILITY-FUNC", 5, 0, false);
        declareFunction("simple_sksi_incompleteness_func", "SIMPLE-SKSI-INCOMPLETENESS-FUNC", 5, 0, false);
        declareFunction("simple_sksi_assert_func", "SIMPLE-SKSI-ASSERT-FUNC", 5, 0, false);
        declareFunction("simple_sksi_unassert_func", "SIMPLE-SKSI-UNASSERT-FUNC", 3, 0, false);
        declareFunction("simple_sksi_unassert_all_func", "SIMPLE-SKSI-UNASSERT-ALL-FUNC", 2, 0, false);
        declareFunction("simple_sksi_store_asent_in_db_table", "SIMPLE-SKSI-STORE-ASENT-IN-DB-TABLE", 1, 0, false);
        declareFunction("simple_sksi_mapping_mt_for_predicate", "SIMPLE-SKSI-MAPPING-MT-FOR-PREDICATE", 1, 0, false);
        declareFunction("simple_sksi_mapping_mt_for_asent", "SIMPLE-SKSI-MAPPING-MT-FOR-ASENT", 1, 0, false);
        declareFunction("simple_sksi_db_table_for_predicate", "SIMPLE-SKSI-DB-TABLE-FOR-PREDICATE", 1, 0, false);
        declareFunction("simple_sksi_db_table_for_predicate_in_mt", "SIMPLE-SKSI-DB-TABLE-FOR-PREDICATE-IN-MT", 2, 0, false);
        declareFunction("simple_sksi_db_table_for_asent", "SIMPLE-SKSI-DB-TABLE-FOR-ASENT", 1, 0, false);
        declareFunction("simple_sksi_schema_translation_mt_for_predicate", "SIMPLE-SKSI-SCHEMA-TRANSLATION-MT-FOR-PREDICATE", 1, 0, false);
        declareFunction("simple_sksi_schema_translation_mt_for_asent", "SIMPLE-SKSI-SCHEMA-TRANSLATION-MT-FOR-ASENT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_simple_sksi_hl_storage_modules_file() {
        deflexical("*SIMPLE-SKSI-HL-STORAGE-PREDICATES*", SubLTrampolineFile.maybeDefault($simple_sksi_hl_storage_predicates$, $simple_sksi_hl_storage_predicates$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_simple_sksi_hl_storage_modules_file() {
        declare_defglobal($simple_sksi_hl_storage_predicates$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_simple_sksi_hl_storage_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_simple_sksi_hl_storage_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_simple_sksi_hl_storage_modules_file();
    }

    static {



































    }
}

/**
 * Total time: 104 ms
 */
