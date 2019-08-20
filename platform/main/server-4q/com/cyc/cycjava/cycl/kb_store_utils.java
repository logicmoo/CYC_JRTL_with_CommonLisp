package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_store_utils extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new kb_store_utils();





    private static final SubLSymbol POSSIBLY_START_KB_STORE_TRANSACTION = makeSymbol("POSSIBLY-START-KB-STORE-TRANSACTION");

    private static final SubLSymbol WITH_KB_STORE_EPHEMERAL_TRANSACTION = makeSymbol("WITH-KB-STORE-EPHEMERAL-TRANSACTION");

    private static final SubLSymbol POSSIBLY_ROLLBACK_KB_STORE_TRANSACTION = makeSymbol("POSSIBLY-ROLLBACK-KB-STORE-TRANSACTION");

    private static final SubLSymbol POSSIBLY_COMMIT_KB_STORE_TRANSACTION = makeSymbol("POSSIBLY-COMMIT-KB-STORE-TRANSACTION");

    private static final SubLSymbol WITH_KB_STORE_TRANSACTION = makeSymbol("WITH-KB-STORE-TRANSACTION");

    private static final SubLSymbol POSSIBLY_ROLLBACK_OR_COMMIT_KB_STORE_TRANSACTION = makeSymbol("POSSIBLY-ROLLBACK-OR-COMMIT-KB-STORE-TRANSACTION");

    public static SubLObject clear_kb_store_entity_manager() {
        return NIL;
    }

    public static SubLObject start_kb_store_transaction() {
        return NIL;
    }

    public static SubLObject commit_kb_store_transaction() {
        return NIL;
    }

    public static SubLObject rollback_kb_store_transaction() {
        return NIL;
    }

    public static SubLObject flush_kb_store_transaction() {
        return NIL;
    }

    public static SubLObject is_inside_kb_store_transactionP() {
        return NIL;
    }

    public static SubLObject with_kb_store_ephemeral_transaction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject with_kb_store_transaction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject possibly_start_kb_store_transaction(final SubLObject needs_transactionP) {
        if (NIL != needs_transactionP) {
            start_kb_store_transaction();
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_rollback_kb_store_transaction(final SubLObject needs_transactionP) {
        if ((NIL != needs_transactionP) && (NIL != is_inside_kb_store_transactionP())) {
            rollback_kb_store_transaction();
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_commit_kb_store_transaction(final SubLObject needs_transactionP) {
        if ((NIL != needs_transactionP) && (NIL != is_inside_kb_store_transactionP())) {
            commit_kb_store_transaction();
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_rollback_or_commit_kb_store_transaction(final SubLObject needs_transactionP, final SubLObject encountered_errorP) {
        if (NIL != encountered_errorP) {
            return possibly_rollback_kb_store_transaction(needs_transactionP);
        }
        return possibly_commit_kb_store_transaction(needs_transactionP);
    }

    public static SubLObject alexandria_prefetch_kb_content() {
        return NIL;
    }

    public static SubLObject alexandria_initialize_after_cardinality() {
        return NIL;
    }

    public static SubLObject is_pragmatic_mtP(final SubLObject v_term) {
        return NIL;
    }

    public static SubLObject backup_db(final SubLObject to_dir) {
        return NIL;
    }

    public static SubLObject avoid_using_kb_status_bits(final SubLObject val) {
        return NIL;
    }

    public static SubLObject avoid_using_simple_indexing(final SubLObject val) {
        return NIL;
    }

    public static SubLObject get_alexandria_kb_num() {
        return ZERO_INTEGER;
    }

    public static SubLObject set_alexandria_kb_num(final SubLObject kbnum) {
        return ZERO_INTEGER;
    }

    public static SubLObject get_alexandria_kb_op_num() {
        return ZERO_INTEGER;
    }

    public static SubLObject set_alexandria_kb_op_num(final SubLObject opnum) {
        return ZERO_INTEGER;
    }

    public static SubLObject load_alexandria_special_objects() {
        return NIL;
    }

    public static SubLObject persist_alexandria_special_objects(final SubLObject special_objects) {
        return NIL;
    }

    public static SubLObject alexandria_defns_make_hash_table(final SubLObject v_cache, final SubLObject size) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_definedP(final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_hash_table_p(final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_hash_table_empty_p(final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_clrhash(final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_gethash(final SubLObject key, final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_sethash(final SubLObject key, final SubLObject v_cache, final SubLObject value) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_remhash(final SubLObject key, final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_remove_value_from_hash(final SubLObject key, final SubLObject value, final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_push_hash(final SubLObject key, final SubLObject value, final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_gethash_without_values(final SubLObject key, final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_hash_table_to_alist(final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject alexandria_defns_cache_hash_table_count(final SubLObject v_cache) {
        return NIL;
    }

    public static SubLObject declare_kb_store_utils_file() {
        declareFunction("clear_kb_store_entity_manager", "CLEAR-KB-STORE-ENTITY-MANAGER", 0, 0, false);
        declareFunction("start_kb_store_transaction", "START-KB-STORE-TRANSACTION", 0, 0, false);
        declareFunction("commit_kb_store_transaction", "COMMIT-KB-STORE-TRANSACTION", 0, 0, false);
        declareFunction("rollback_kb_store_transaction", "ROLLBACK-KB-STORE-TRANSACTION", 0, 0, false);
        declareFunction("flush_kb_store_transaction", "FLUSH-KB-STORE-TRANSACTION", 0, 0, false);
        declareFunction("is_inside_kb_store_transactionP", "IS-INSIDE-KB-STORE-TRANSACTION?", 0, 0, false);
        declareMacro("with_kb_store_ephemeral_transaction", "WITH-KB-STORE-EPHEMERAL-TRANSACTION");
        declareMacro("with_kb_store_transaction", "WITH-KB-STORE-TRANSACTION");
        declareFunction("possibly_start_kb_store_transaction", "POSSIBLY-START-KB-STORE-TRANSACTION", 1, 0, false);
        declareFunction("possibly_rollback_kb_store_transaction", "POSSIBLY-ROLLBACK-KB-STORE-TRANSACTION", 1, 0, false);
        declareFunction("possibly_commit_kb_store_transaction", "POSSIBLY-COMMIT-KB-STORE-TRANSACTION", 1, 0, false);
        declareFunction("possibly_rollback_or_commit_kb_store_transaction", "POSSIBLY-ROLLBACK-OR-COMMIT-KB-STORE-TRANSACTION", 2, 0, false);
        declareFunction("alexandria_prefetch_kb_content", "ALEXANDRIA-PREFETCH-KB-CONTENT", 0, 0, false);
        declareFunction("alexandria_initialize_after_cardinality", "ALEXANDRIA-INITIALIZE-AFTER-CARDINALITY", 0, 0, false);
        declareFunction("is_pragmatic_mtP", "IS-PRAGMATIC-MT?", 1, 0, false);
        declareFunction("backup_db", "BACKUP-DB", 1, 0, false);
        declareFunction("avoid_using_kb_status_bits", "AVOID-USING-KB-STATUS-BITS", 1, 0, false);
        declareFunction("avoid_using_simple_indexing", "AVOID-USING-SIMPLE-INDEXING", 1, 0, false);
        declareFunction("get_alexandria_kb_num", "GET-ALEXANDRIA-KB-NUM", 0, 0, false);
        declareFunction("set_alexandria_kb_num", "SET-ALEXANDRIA-KB-NUM", 1, 0, false);
        declareFunction("get_alexandria_kb_op_num", "GET-ALEXANDRIA-KB-OP-NUM", 0, 0, false);
        declareFunction("set_alexandria_kb_op_num", "SET-ALEXANDRIA-KB-OP-NUM", 1, 0, false);
        declareFunction("load_alexandria_special_objects", "LOAD-ALEXANDRIA-SPECIAL-OBJECTS", 0, 0, false);
        declareFunction("persist_alexandria_special_objects", "PERSIST-ALEXANDRIA-SPECIAL-OBJECTS", 1, 0, false);
        declareFunction("alexandria_defns_make_hash_table", "ALEXANDRIA-DEFNS-MAKE-HASH-TABLE", 2, 0, false);
        declareFunction("alexandria_defns_cache_definedP", "ALEXANDRIA-DEFNS-CACHE-DEFINED?", 1, 0, false);
        declareFunction("alexandria_defns_cache_hash_table_p", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-P", 1, 0, false);
        declareFunction("alexandria_defns_cache_hash_table_empty_p", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-EMPTY-P", 1, 0, false);
        declareFunction("alexandria_defns_cache_clrhash", "ALEXANDRIA-DEFNS-CACHE-CLRHASH", 1, 0, false);
        declareFunction("alexandria_defns_cache_gethash", "ALEXANDRIA-DEFNS-CACHE-GETHASH", 2, 0, false);
        declareFunction("alexandria_defns_cache_sethash", "ALEXANDRIA-DEFNS-CACHE-SETHASH", 3, 0, false);
        declareFunction("alexandria_defns_cache_remhash", "ALEXANDRIA-DEFNS-CACHE-REMHASH", 2, 0, false);
        declareFunction("alexandria_defns_cache_remove_value_from_hash", "ALEXANDRIA-DEFNS-CACHE-REMOVE-VALUE-FROM-HASH", 3, 0, false);
        declareFunction("alexandria_defns_cache_push_hash", "ALEXANDRIA-DEFNS-CACHE-PUSH-HASH", 3, 0, false);
        declareFunction("alexandria_defns_cache_gethash_without_values", "ALEXANDRIA-DEFNS-CACHE-GETHASH-WITHOUT-VALUES", 2, 0, false);
        declareFunction("alexandria_defns_cache_hash_table_to_alist", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction("alexandria_defns_cache_hash_table_count", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-COUNT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_store_utils_file() {
        return NIL;
    }

    public static SubLObject setup_kb_store_utils_file() {
        register_macro_helper(POSSIBLY_START_KB_STORE_TRANSACTION, WITH_KB_STORE_EPHEMERAL_TRANSACTION);
        register_macro_helper(POSSIBLY_ROLLBACK_KB_STORE_TRANSACTION, WITH_KB_STORE_EPHEMERAL_TRANSACTION);
        register_macro_helper(POSSIBLY_COMMIT_KB_STORE_TRANSACTION, WITH_KB_STORE_TRANSACTION);
        register_macro_helper(POSSIBLY_ROLLBACK_OR_COMMIT_KB_STORE_TRANSACTION, WITH_KB_STORE_TRANSACTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_store_utils_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_store_utils_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_store_utils_file();
    }

    static {








    }
}

/**
 * Total time: 90 ms
 */
