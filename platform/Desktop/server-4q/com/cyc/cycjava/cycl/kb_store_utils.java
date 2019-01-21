package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_store_utils extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_store_utils";
    public static final String myFingerPrint = "83c7eb429f8e71ff80a80579226455fc1f848b8a07ff8a5fc9d40460238255ab";
    private static final SubLSymbol $sym0$PROGN;
    private static final SubLSymbol $sym1$POSSIBLY_START_KB_STORE_TRANSACTION;
    private static final SubLSymbol $sym2$WITH_KB_STORE_EPHEMERAL_TRANSACTION;
    private static final SubLSymbol $sym3$POSSIBLY_ROLLBACK_KB_STORE_TRANSACTION;
    private static final SubLSymbol $sym4$POSSIBLY_COMMIT_KB_STORE_TRANSACTION;
    private static final SubLSymbol $sym5$WITH_KB_STORE_TRANSACTION;
    private static final SubLSymbol $sym6$POSSIBLY_ROLLBACK_OR_COMMIT_KB_STORE_TRANSACTION;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 891L)
    public static SubLObject clear_kb_store_entity_manager() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 1174L)
    public static SubLObject start_kb_store_transaction() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 1396L)
    public static SubLObject commit_kb_store_transaction() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 1620L)
    public static SubLObject rollback_kb_store_transaction() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 1848L)
    public static SubLObject flush_kb_store_transaction() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 2070L)
    public static SubLObject is_inside_kb_store_transactionP() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 2302L)
    public static SubLObject with_kb_store_ephemeral_transaction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)kb_store_utils.$sym0$PROGN, ConsesLow.append(body, (SubLObject)kb_store_utils.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 2890L)
    public static SubLObject with_kb_store_transaction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)kb_store_utils.$sym0$PROGN, ConsesLow.append(body, (SubLObject)kb_store_utils.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 3595L)
    public static SubLObject possibly_start_kb_store_transaction(final SubLObject needs_transactionP) {
        if (kb_store_utils.NIL != needs_transactionP) {
            start_kb_store_transaction();
            return (SubLObject)kb_store_utils.T;
        }
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 3808L)
    public static SubLObject possibly_rollback_kb_store_transaction(final SubLObject needs_transactionP) {
        if (kb_store_utils.NIL != needs_transactionP && kb_store_utils.NIL != is_inside_kb_store_transactionP()) {
            rollback_kb_store_transaction();
            return (SubLObject)kb_store_utils.T;
        }
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4068L)
    public static SubLObject possibly_commit_kb_store_transaction(final SubLObject needs_transactionP) {
        if (kb_store_utils.NIL != needs_transactionP && kb_store_utils.NIL != is_inside_kb_store_transactionP()) {
            commit_kb_store_transaction();
            return (SubLObject)kb_store_utils.T;
        }
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4314L)
    public static SubLObject possibly_rollback_or_commit_kb_store_transaction(final SubLObject needs_transactionP, final SubLObject encountered_errorP) {
        if (kb_store_utils.NIL != encountered_errorP) {
            return possibly_rollback_kb_store_transaction(needs_transactionP);
        }
        return possibly_commit_kb_store_transaction(needs_transactionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4634L)
    public static SubLObject alexandria_prefetch_kb_content() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4697L)
    public static SubLObject alexandria_initialize_after_cardinality() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4769L)
    public static SubLObject is_pragmatic_mtP(final SubLObject v_term) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4838L)
    public static SubLObject backup_db(final SubLObject to_dir) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4905L)
    public static SubLObject avoid_using_kb_status_bits(final SubLObject val) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 4983L)
    public static SubLObject avoid_using_simple_indexing(final SubLObject val) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5062L)
    public static SubLObject get_alexandria_kb_num() {
        return (SubLObject)kb_store_utils.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5114L)
    public static SubLObject set_alexandria_kb_num(final SubLObject kbnum) {
        return (SubLObject)kb_store_utils.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5188L)
    public static SubLObject get_alexandria_kb_op_num() {
        return (SubLObject)kb_store_utils.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5243L)
    public static SubLObject set_alexandria_kb_op_num(final SubLObject opnum) {
        return (SubLObject)kb_store_utils.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5320L)
    public static SubLObject load_alexandria_special_objects() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5384L)
    public static SubLObject persist_alexandria_special_objects(final SubLObject special_objects) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5493L)
    public static SubLObject alexandria_defns_make_hash_table(final SubLObject v_cache, final SubLObject size) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5590L)
    public static SubLObject alexandria_defns_cache_definedP(final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5676L)
    public static SubLObject alexandria_defns_cache_hash_table_p(final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5766L)
    public static SubLObject alexandria_defns_cache_hash_table_empty_p(final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5862L)
    public static SubLObject alexandria_defns_cache_clrhash(final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 5947L)
    public static SubLObject alexandria_defns_cache_gethash(final SubLObject key, final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6040L)
    public static SubLObject alexandria_defns_cache_sethash(final SubLObject key, final SubLObject v_cache, final SubLObject value) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6145L)
    public static SubLObject alexandria_defns_cache_remhash(final SubLObject key, final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6238L)
    public static SubLObject alexandria_defns_cache_remove_value_from_hash(final SubLObject key, final SubLObject value, final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6358L)
    public static SubLObject alexandria_defns_cache_push_hash(final SubLObject key, final SubLObject value, final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6465L)
    public static SubLObject alexandria_defns_cache_gethash_without_values(final SubLObject key, final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6573L)
    public static SubLObject alexandria_defns_cache_hash_table_to_alist(final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-store-utils.lisp", position = 6670L)
    public static SubLObject alexandria_defns_cache_hash_table_count(final SubLObject v_cache) {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    public static SubLObject declare_kb_store_utils_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "clear_kb_store_entity_manager", "CLEAR-KB-STORE-ENTITY-MANAGER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "start_kb_store_transaction", "START-KB-STORE-TRANSACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "commit_kb_store_transaction", "COMMIT-KB-STORE-TRANSACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "rollback_kb_store_transaction", "ROLLBACK-KB-STORE-TRANSACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "flush_kb_store_transaction", "FLUSH-KB-STORE-TRANSACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "is_inside_kb_store_transactionP", "IS-INSIDE-KB-STORE-TRANSACTION?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_store_utils", "with_kb_store_ephemeral_transaction", "WITH-KB-STORE-EPHEMERAL-TRANSACTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_store_utils", "with_kb_store_transaction", "WITH-KB-STORE-TRANSACTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "possibly_start_kb_store_transaction", "POSSIBLY-START-KB-STORE-TRANSACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "possibly_rollback_kb_store_transaction", "POSSIBLY-ROLLBACK-KB-STORE-TRANSACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "possibly_commit_kb_store_transaction", "POSSIBLY-COMMIT-KB-STORE-TRANSACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "possibly_rollback_or_commit_kb_store_transaction", "POSSIBLY-ROLLBACK-OR-COMMIT-KB-STORE-TRANSACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_prefetch_kb_content", "ALEXANDRIA-PREFETCH-KB-CONTENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_initialize_after_cardinality", "ALEXANDRIA-INITIALIZE-AFTER-CARDINALITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "is_pragmatic_mtP", "IS-PRAGMATIC-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "backup_db", "BACKUP-DB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "avoid_using_kb_status_bits", "AVOID-USING-KB-STATUS-BITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "avoid_using_simple_indexing", "AVOID-USING-SIMPLE-INDEXING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "get_alexandria_kb_num", "GET-ALEXANDRIA-KB-NUM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "set_alexandria_kb_num", "SET-ALEXANDRIA-KB-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "get_alexandria_kb_op_num", "GET-ALEXANDRIA-KB-OP-NUM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "set_alexandria_kb_op_num", "SET-ALEXANDRIA-KB-OP-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "load_alexandria_special_objects", "LOAD-ALEXANDRIA-SPECIAL-OBJECTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "persist_alexandria_special_objects", "PERSIST-ALEXANDRIA-SPECIAL-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_make_hash_table", "ALEXANDRIA-DEFNS-MAKE-HASH-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_definedP", "ALEXANDRIA-DEFNS-CACHE-DEFINED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_hash_table_p", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_hash_table_empty_p", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_clrhash", "ALEXANDRIA-DEFNS-CACHE-CLRHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_gethash", "ALEXANDRIA-DEFNS-CACHE-GETHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_sethash", "ALEXANDRIA-DEFNS-CACHE-SETHASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_remhash", "ALEXANDRIA-DEFNS-CACHE-REMHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_remove_value_from_hash", "ALEXANDRIA-DEFNS-CACHE-REMOVE-VALUE-FROM-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_push_hash", "ALEXANDRIA-DEFNS-CACHE-PUSH-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_gethash_without_values", "ALEXANDRIA-DEFNS-CACHE-GETHASH-WITHOUT-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_hash_table_to_alist", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_store_utils", "alexandria_defns_cache_hash_table_count", "ALEXANDRIA-DEFNS-CACHE-HASH-TABLE-COUNT", 1, 0, false);
        return (SubLObject)kb_store_utils.NIL;
    }
    
    public static SubLObject init_kb_store_utils_file() {
        return (SubLObject)kb_store_utils.NIL;
    }
    
    public static SubLObject setup_kb_store_utils_file() {
        access_macros.register_macro_helper((SubLObject)kb_store_utils.$sym1$POSSIBLY_START_KB_STORE_TRANSACTION, (SubLObject)kb_store_utils.$sym2$WITH_KB_STORE_EPHEMERAL_TRANSACTION);
        access_macros.register_macro_helper((SubLObject)kb_store_utils.$sym3$POSSIBLY_ROLLBACK_KB_STORE_TRANSACTION, (SubLObject)kb_store_utils.$sym2$WITH_KB_STORE_EPHEMERAL_TRANSACTION);
        access_macros.register_macro_helper((SubLObject)kb_store_utils.$sym4$POSSIBLY_COMMIT_KB_STORE_TRANSACTION, (SubLObject)kb_store_utils.$sym5$WITH_KB_STORE_TRANSACTION);
        access_macros.register_macro_helper((SubLObject)kb_store_utils.$sym6$POSSIBLY_ROLLBACK_OR_COMMIT_KB_STORE_TRANSACTION, (SubLObject)kb_store_utils.$sym5$WITH_KB_STORE_TRANSACTION);
        return (SubLObject)kb_store_utils.NIL;
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
        me = (SubLFile)new kb_store_utils();
        $sym0$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym1$POSSIBLY_START_KB_STORE_TRANSACTION = SubLObjectFactory.makeSymbol("POSSIBLY-START-KB-STORE-TRANSACTION");
        $sym2$WITH_KB_STORE_EPHEMERAL_TRANSACTION = SubLObjectFactory.makeSymbol("WITH-KB-STORE-EPHEMERAL-TRANSACTION");
        $sym3$POSSIBLY_ROLLBACK_KB_STORE_TRANSACTION = SubLObjectFactory.makeSymbol("POSSIBLY-ROLLBACK-KB-STORE-TRANSACTION");
        $sym4$POSSIBLY_COMMIT_KB_STORE_TRANSACTION = SubLObjectFactory.makeSymbol("POSSIBLY-COMMIT-KB-STORE-TRANSACTION");
        $sym5$WITH_KB_STORE_TRANSACTION = SubLObjectFactory.makeSymbol("WITH-KB-STORE-TRANSACTION");
        $sym6$POSSIBLY_ROLLBACK_OR_COMMIT_KB_STORE_TRANSACTION = SubLObjectFactory.makeSymbol("POSSIBLY-ROLLBACK-OR-COMMIT-KB-STORE-TRANSACTION");
    }
}

/*

	Total time: 90 ms
	
*/