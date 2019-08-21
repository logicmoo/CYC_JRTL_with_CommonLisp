package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.generic_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.generic_table_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class generic_table_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new generic_table_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.generic_table_utilities";

    public static final String myFingerPrint = "713cc819dd36c6408bfa80ca38e71142d8e3b0cf0f60d1d73f63ecc4a03254bf";

    // Internal Constants
    public static final SubLString $str0$_S_is_not_a_GENERIC_TABLE_P_ = makeString("~S is not a GENERIC-TABLE-P.");

    public static final SubLList $list1 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list2 = list(makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym5$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    public static final SubLSymbol $sym6$SILENT_ = makeUninternedSymbol("SILENT?");

    public static final SubLSymbol $sym7$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    public static final SubLSymbol $sym8$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    public static final SubLSymbol $sym9$COUNT_VAR = makeUninternedSymbol("COUNT-VAR");



    public static final SubLList $list11 = list(makeSymbol("*SILENT-PROGRESS?*"));

    public static final SubLSymbol $sym12$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");









    public static final SubLList $list17 = list(makeString(""));

    public static final SubLList $list18 = list(ZERO_INTEGER);

    public static final SubLSymbol GENERIC_TABLE_COUNT = makeSymbol("GENERIC-TABLE-COUNT");

    public static final SubLSymbol DO_GENERIC_TABLE = makeSymbol("DO-GENERIC-TABLE");



    public static final SubLSymbol $sym22$1_ = makeSymbol("1+");









    public static final SubLSymbol FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");

    public static final SubLSymbol DO_FILE_HASH_TABLE = makeSymbol("DO-FILE-HASH-TABLE");



    public static SubLObject generic_table_p(final SubLObject v_object) {
        return makeBoolean(v_object.isHashtable() || (NIL != file_hash_table.file_hash_table_p(v_object)));
    }

    public static SubLObject put_generic_table(final SubLObject key, final SubLObject table, final SubLObject value) {
        if (table.isHashtable()) {
            return sethash(key, table, value);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.put_file_hash_table(key, table, value);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject get_generic_table(final SubLObject key, final SubLObject table, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (table.isHashtable()) {
            return gethash(key, table, default_value);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.get_file_hash_table(key, table, default_value);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject remove_generic_table(final SubLObject key, final SubLObject table) {
        if (table.isHashtable()) {
            return remhash(key, table);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.remove_file_hash_table(key, table);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject generic_table_keys(final SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_utilities.hash_table_keys(table);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.file_hash_table_keys(table);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject generic_table_size(final SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_size(table);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.file_hash_table_capacity(table);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject generic_table_count(final SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_count(table);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.file_hash_table_count(table);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject do_generic_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject message_var = $sym5$MESSAGE_VAR;
            final SubLObject silentP = $sym6$SILENT_;
            final SubLObject table_var = $sym7$TABLE_VAR;
            final SubLObject index_var = $sym8$INDEX_VAR;
            final SubLObject count_var = $sym9$COUNT_VAR;
            return list(CLET, list(list(message_var, progress_message), bq_cons(silentP, $list11), list($sym12$_SILENT_PROGRESS__, list(COR, silentP, list(NULL, message_var)))), list(NOTING_PERCENT_PROGRESS, listS(FIRST_OF, message_var, $list17), list(CLET, list(list(table_var, table), bq_cons(index_var, $list18), list(count_var, list(GENERIC_TABLE_COUNT, table_var))), list(DO_GENERIC_TABLE, list(key, value, table_var), listS(CLET, list(list($sym12$_SILENT_PROGRESS__, silentP)), append(body, NIL)), list(CSETQ, index_var, list($sym22$1_, index_var)), list(NOTE_PERCENT_PROGRESS, index_var, count_var)))));
        }
        return list(PCOND, list(list(HASH_TABLE_P, table), listS(DO_HASH_TABLE, list(key, value, table), append(body, NIL))), list(list(FILE_HASH_TABLE_P, table), listS(DO_FILE_HASH_TABLE, list(key, value, table), append(body, NIL))), list(T, list(ERROR, $str0$_S_is_not_a_GENERIC_TABLE_P_, table)));
    }

    public static SubLObject cinc_generic_table(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        if (table.isHashtable()) {
            return hash_table_utilities.cinc_hash(key, table, increment, initial_val);
        }
        if (NIL != file_hash_table.file_hash_table_p(table)) {
            return file_hash_table.cinc_file_hash_table(key, table, increment, initial_val);
        }
        Errors.error($str0$_S_is_not_a_GENERIC_TABLE_P_, table);
        return NIL;
    }

    public static SubLObject declare_generic_table_utilities_file() {
        declareFunction(me, "generic_table_p", "GENERIC-TABLE-P", 1, 0, false);
        declareFunction(me, "put_generic_table", "PUT-GENERIC-TABLE", 3, 0, false);
        declareFunction(me, "get_generic_table", "GET-GENERIC-TABLE", 2, 1, false);
        declareFunction(me, "remove_generic_table", "REMOVE-GENERIC-TABLE", 2, 0, false);
        declareFunction(me, "generic_table_keys", "GENERIC-TABLE-KEYS", 1, 0, false);
        declareFunction(me, "generic_table_size", "GENERIC-TABLE-SIZE", 1, 0, false);
        declareFunction(me, "generic_table_count", "GENERIC-TABLE-COUNT", 1, 0, false);
        declareMacro(me, "do_generic_table", "DO-GENERIC-TABLE");
        declareFunction(me, "cinc_generic_table", "CINC-GENERIC-TABLE", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_generic_table_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_generic_table_utilities_file() {
        return NIL;
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































    }
}

/**
 * Total time: 169 ms
 */
