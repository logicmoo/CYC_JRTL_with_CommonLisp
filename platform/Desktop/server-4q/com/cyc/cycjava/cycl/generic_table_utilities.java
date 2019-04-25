package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class generic_table_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.generic_table_utilities";
    public static final String myFingerPrint = "713cc819dd36c6408bfa80ca38e71142d8e3b0cf0f60d1d73f63ecc4a03254bf";
    private static final SubLString $str0$_S_is_not_a_GENERIC_TABLE_P_;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw4$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym5$MESSAGE_VAR;
    private static final SubLSymbol $sym6$SILENT_;
    private static final SubLSymbol $sym7$TABLE_VAR;
    private static final SubLSymbol $sym8$INDEX_VAR;
    private static final SubLSymbol $sym9$COUNT_VAR;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$_SILENT_PROGRESS__;
    private static final SubLSymbol $sym13$COR;
    private static final SubLSymbol $sym14$NULL;
    private static final SubLSymbol $sym15$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym16$FIRST_OF;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$GENERIC_TABLE_COUNT;
    private static final SubLSymbol $sym20$DO_GENERIC_TABLE;
    private static final SubLSymbol $sym21$CSETQ;
    private static final SubLSymbol $sym22$1_;
    private static final SubLSymbol $sym23$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym24$PCOND;
    private static final SubLSymbol $sym25$HASH_TABLE_P;
    private static final SubLSymbol $sym26$DO_HASH_TABLE;
    private static final SubLSymbol $sym27$FILE_HASH_TABLE_P;
    private static final SubLSymbol $sym28$DO_FILE_HASH_TABLE;
    private static final SubLSymbol $sym29$ERROR;
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1013L)
    public static SubLObject generic_table_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isHashtable() || generic_table_utilities.NIL != file_hash_table.file_hash_table_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1123L)
    public static SubLObject put_generic_table(final SubLObject key, final SubLObject table, final SubLObject value) {
        if (table.isHashtable()) {
            return Hashtables.sethash(key, table, value);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.put_file_hash_table(key, table, value);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1383L)
    public static SubLObject get_generic_table(final SubLObject key, final SubLObject table, SubLObject default_value) {
        if (default_value == generic_table_utilities.UNPROVIDED) {
            default_value = (SubLObject)generic_table_utilities.NIL;
        }
        if (table.isHashtable()) {
            return Hashtables.gethash(key, table, default_value);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.get_file_hash_table(key, table, default_value);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1677L)
    public static SubLObject remove_generic_table(final SubLObject key, final SubLObject table) {
        if (table.isHashtable()) {
            return Hashtables.remhash(key, table);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.remove_file_hash_table(key, table);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 1925L)
    public static SubLObject generic_table_keys(final SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_utilities.hash_table_keys(table);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.file_hash_table_keys(table);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 2165L)
    public static SubLObject generic_table_size(final SubLObject table) {
        if (table.isHashtable()) {
            return Hashtables.hash_table_size(table);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.file_hash_table_capacity(table);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 2409L)
    public static SubLObject generic_table_count(final SubLObject table) {
        if (table.isHashtable()) {
            return Hashtables.hash_table_count(table);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.file_hash_table_count(table);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 2652L)
    public static SubLObject do_generic_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)generic_table_utilities.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)generic_table_utilities.NIL;
        SubLObject value = (SubLObject)generic_table_utilities.NIL;
        SubLObject table = (SubLObject)generic_table_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)generic_table_utilities.$list1);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)generic_table_utilities.$list1);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)generic_table_utilities.$list1);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)generic_table_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)generic_table_utilities.NIL;
        SubLObject current_$1 = (SubLObject)generic_table_utilities.NIL;
        while (generic_table_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)generic_table_utilities.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)generic_table_utilities.$list1);
            if (generic_table_utilities.NIL == conses_high.member(current_$1, (SubLObject)generic_table_utilities.$list2, (SubLObject)generic_table_utilities.UNPROVIDED, (SubLObject)generic_table_utilities.UNPROVIDED)) {
                bad = (SubLObject)generic_table_utilities.T;
            }
            if (current_$1 == generic_table_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (generic_table_utilities.NIL != bad && generic_table_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)generic_table_utilities.$list1);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)generic_table_utilities.$kw4$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((generic_table_utilities.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : generic_table_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        if (generic_table_utilities.NIL != progress_message) {
            final SubLObject message_var = (SubLObject)generic_table_utilities.$sym5$MESSAGE_VAR;
            final SubLObject silentP = (SubLObject)generic_table_utilities.$sym6$SILENT_;
            final SubLObject table_var = (SubLObject)generic_table_utilities.$sym7$TABLE_VAR;
            final SubLObject index_var = (SubLObject)generic_table_utilities.$sym8$INDEX_VAR;
            final SubLObject count_var = (SubLObject)generic_table_utilities.$sym9$COUNT_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, progress_message), reader.bq_cons(silentP, (SubLObject)generic_table_utilities.$list11), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym12$_SILENT_PROGRESS__, (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym13$COR, silentP, (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym14$NULL, message_var)))), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym15$NOTING_PERCENT_PROGRESS, (SubLObject)ConsesLow.listS((SubLObject)generic_table_utilities.$sym16$FIRST_OF, message_var, (SubLObject)generic_table_utilities.$list17), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(table_var, table), reader.bq_cons(index_var, (SubLObject)generic_table_utilities.$list18), (SubLObject)ConsesLow.list(count_var, (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym19$GENERIC_TABLE_COUNT, table_var))), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym20$DO_GENERIC_TABLE, (SubLObject)ConsesLow.list(key, value, table_var), (SubLObject)ConsesLow.listS((SubLObject)generic_table_utilities.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym12$_SILENT_PROGRESS__, silentP)), ConsesLow.append(body, (SubLObject)generic_table_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym21$CSETQ, index_var, (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym22$1_, index_var)), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym23$NOTE_PERCENT_PROGRESS, index_var, count_var)))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym24$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym25$HASH_TABLE_P, table), (SubLObject)ConsesLow.listS((SubLObject)generic_table_utilities.$sym26$DO_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, table), ConsesLow.append(body, (SubLObject)generic_table_utilities.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym27$FILE_HASH_TABLE_P, table), (SubLObject)ConsesLow.listS((SubLObject)generic_table_utilities.$sym28$DO_FILE_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, table), ConsesLow.append(body, (SubLObject)generic_table_utilities.NIL))), (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.T, (SubLObject)ConsesLow.list((SubLObject)generic_table_utilities.$sym29$ERROR, (SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/generic-table-utilities.lisp", position = 3808L)
    public static SubLObject cinc_generic_table(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == generic_table_utilities.UNPROVIDED) {
            increment = (SubLObject)generic_table_utilities.ONE_INTEGER;
        }
        if (initial_val == generic_table_utilities.UNPROVIDED) {
            initial_val = increment;
        }
        if (table.isHashtable()) {
            return hash_table_utilities.cinc_hash(key, table, increment, initial_val);
        }
        if (generic_table_utilities.NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.cinc_file_hash_table(key, table, increment, initial_val);
        }
        Errors.error((SubLObject)generic_table_utilities.$str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    public static SubLObject declare_generic_table_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "generic_table_p", "GENERIC-TABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "put_generic_table", "PUT-GENERIC-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "get_generic_table", "GET-GENERIC-TABLE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "remove_generic_table", "REMOVE-GENERIC-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "generic_table_keys", "GENERIC-TABLE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "generic_table_size", "GENERIC-TABLE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "generic_table_count", "GENERIC-TABLE-COUNT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.generic_table_utilities", "do_generic_table", "DO-GENERIC-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.generic_table_utilities", "cinc_generic_table", "CINC-GENERIC-TABLE", 2, 2, false);
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    public static SubLObject init_generic_table_utilities_file() {
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    public static SubLObject setup_generic_table_utilities_file() {
        return (SubLObject)generic_table_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_generic_table_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_generic_table_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_generic_table_utilities_file();
    }
    
    static {
        me = (SubLFile)new generic_table_utilities();
        $str0$_S_is_not_a_GENERIC_TABLE_P_ = SubLObjectFactory.makeString("~S is not a GENERIC-TABLE-P.");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym5$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym6$SILENT_ = SubLObjectFactory.makeUninternedSymbol("SILENT?");
        $sym7$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
        $sym8$INDEX_VAR = SubLObjectFactory.makeUninternedSymbol("INDEX-VAR");
        $sym9$COUNT_VAR = SubLObjectFactory.makeUninternedSymbol("COUNT-VAR");
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"));
        $sym12$_SILENT_PROGRESS__ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $sym13$COR = SubLObjectFactory.makeSymbol("COR");
        $sym14$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym15$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym16$FIRST_OF = SubLObjectFactory.makeSymbol("FIRST-OF");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""));
        $list18 = ConsesLow.list((SubLObject)generic_table_utilities.ZERO_INTEGER);
        $sym19$GENERIC_TABLE_COUNT = SubLObjectFactory.makeSymbol("GENERIC-TABLE-COUNT");
        $sym20$DO_GENERIC_TABLE = SubLObjectFactory.makeSymbol("DO-GENERIC-TABLE");
        $sym21$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym22$1_ = SubLObjectFactory.makeSymbol("1+");
        $sym23$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym24$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym25$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $sym26$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $sym27$FILE_HASH_TABLE_P = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-P");
        $sym28$DO_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-FILE-HASH-TABLE");
        $sym29$ERROR = SubLObjectFactory.makeSymbol("ERROR");
    }
}

/*

	Total time: 169 ms
	
*/