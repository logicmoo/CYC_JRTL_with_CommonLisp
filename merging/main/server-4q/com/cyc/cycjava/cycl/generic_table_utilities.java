/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_size;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GENERIC-TABLE-UTILITIES
 * source file: /cyc/top/cycl/generic-table-utilities.lisp
 * created:     2019/07/03 17:37:16
 */
public final class generic_table_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new generic_table_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.generic_table_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_S_is_not_a_GENERIC_TABLE_P_ = makeString("~S is not a GENERIC-TABLE-P.");

    static private final SubLList $list1 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym5$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLSymbol $sym6$SILENT_ = makeUninternedSymbol("SILENT?");

    static private final SubLSymbol $sym7$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    static private final SubLSymbol $sym8$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    static private final SubLSymbol $sym9$COUNT_VAR = makeUninternedSymbol("COUNT-VAR");

    static private final SubLList $list11 = list(makeSymbol("*SILENT-PROGRESS?*"));

    public static final SubLSymbol $silent_progressP$ = makeSymbol("*SILENT-PROGRESS?*");

    static private final SubLList $list17 = list(makeString(""));

    static private final SubLList $list18 = list(ZERO_INTEGER);

    private static final SubLSymbol GENERIC_TABLE_COUNT = makeSymbol("GENERIC-TABLE-COUNT");

    private static final SubLSymbol DO_GENERIC_TABLE = makeSymbol("DO-GENERIC-TABLE");

    static private final SubLSymbol $sym22$1_ = makeSymbol("1+");

    private static final SubLSymbol FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");

    private static final SubLSymbol DO_FILE_HASH_TABLE = makeSymbol("DO-FILE-HASH-TABLE");

    // Definitions
    public static final SubLObject generic_table_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isHashtable() || (NIL != file_hash_table.file_hash_table_p(v_object)));
    }

    // Definitions
    public static SubLObject generic_table_p(final SubLObject v_object) {
        return makeBoolean(v_object.isHashtable() || (NIL != file_hash_table.file_hash_table_p(v_object)));
    }

    public static final SubLObject put_generic_table_alt(SubLObject key, SubLObject table, SubLObject value) {
        if (table.isHashtable()) {
            return sethash(key, table, value);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.put_file_hash_table(key, table, value);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
        return NIL;
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

    public static final SubLObject get_generic_table_alt(SubLObject key, SubLObject table, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (table.isHashtable()) {
            return gethash(key, table, default_value);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.get_file_hash_table(key, table, default_value);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
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

    public static final SubLObject remove_generic_table_alt(SubLObject key, SubLObject table) {
        if (table.isHashtable()) {
            return remhash(key, table);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.remove_file_hash_table(key, table);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
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

    public static final SubLObject generic_table_keys_alt(SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_utilities.hash_table_keys(table);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.file_hash_table_keys(table);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
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

    public static final SubLObject generic_table_size_alt(SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_size(table);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.file_hash_table_capacity(table);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
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

    public static final SubLObject generic_table_count_alt(SubLObject table) {
        if (table.isHashtable()) {
            return hash_table_count(table);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.file_hash_table_count(table);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
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

    public static final SubLObject do_generic_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    table = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt1);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt1);
                            if (NIL == member(current_1, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt1);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != progress_message) {
                                    {
                                        SubLObject message_var = $sym5$MESSAGE_VAR;
                                        SubLObject silentP = $sym6$SILENT_;
                                        SubLObject table_var = $sym7$TABLE_VAR;
                                        SubLObject index_var = $sym8$INDEX_VAR;
                                        SubLObject count_var = $sym9$COUNT_VAR;
                                        return list(CLET, list(list(message_var, progress_message), bq_cons(silentP, $list_alt11), list($silent_progressP$, list(COR, silentP, list(NULL, message_var)))), list(NOTING_PERCENT_PROGRESS, listS(FIRST_OF, message_var, $list_alt17), list(CLET, list(list(table_var, table), bq_cons(index_var, $list_alt18), list(count_var, list(GENERIC_TABLE_COUNT, table_var))), list(DO_GENERIC_TABLE, list(key, value, table_var), listS(CLET, list(list($silent_progressP$, silentP)), append(body, NIL)), list(CSETQ, index_var, list($sym22$1_, index_var)), list(NOTE_PERCENT_PROGRESS, index_var, count_var)))));
                                    }
                                } else {
                                    return list(PCOND, list(list(HASH_TABLE_P, table), listS(DO_HASH_TABLE, list(key, value, table), append(body, NIL))), list(list(FILE_HASH_TABLE_P, table), listS(DO_FILE_HASH_TABLE, list(key, value, table), append(body, NIL))), list(T, list(ERROR, $str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table)));
                                }
                            }
                        }
                    }
                }
            }
        }
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
            return list(CLET, list(list(message_var, progress_message), bq_cons(silentP, $list11), list($silent_progressP$, list(COR, silentP, list(NULL, message_var)))), list(NOTING_PERCENT_PROGRESS, listS(FIRST_OF, message_var, $list17), list(CLET, list(list(table_var, table), bq_cons(index_var, $list18), list(count_var, list(GENERIC_TABLE_COUNT, table_var))), list(DO_GENERIC_TABLE, list(key, value, table_var), listS(CLET, list(list($silent_progressP$, silentP)), append(body, NIL)), list(CSETQ, index_var, list($sym22$1_, index_var)), list(NOTE_PERCENT_PROGRESS, index_var, count_var)))));
        }
        return list(PCOND, list(list(HASH_TABLE_P, table), listS(DO_HASH_TABLE, list(key, value, table), append(body, NIL))), list(list(FILE_HASH_TABLE_P, table), listS(DO_FILE_HASH_TABLE, list(key, value, table), append(body, NIL))), list(T, list(ERROR, $str0$_S_is_not_a_GENERIC_TABLE_P_, table)));
    }

    public static final SubLObject cinc_generic_table_alt(SubLObject key, SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        if (table.isHashtable()) {
            return hash_table_utilities.cinc_hash(key, table, increment, initial_val);
        } else {
            if (NIL != file_hash_table.file_hash_table_p(table)) {
                return file_hash_table.cinc_file_hash_table(key, table, increment, initial_val);
            } else {
                Errors.error($str_alt0$_S_is_not_a_GENERIC_TABLE_P_, table);
            }
        }
        return NIL;
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
        declareFunction("generic_table_p", "GENERIC-TABLE-P", 1, 0, false);
        declareFunction("put_generic_table", "PUT-GENERIC-TABLE", 3, 0, false);
        declareFunction("get_generic_table", "GET-GENERIC-TABLE", 2, 1, false);
        declareFunction("remove_generic_table", "REMOVE-GENERIC-TABLE", 2, 0, false);
        declareFunction("generic_table_keys", "GENERIC-TABLE-KEYS", 1, 0, false);
        declareFunction("generic_table_size", "GENERIC-TABLE-SIZE", 1, 0, false);
        declareFunction("generic_table_count", "GENERIC-TABLE-COUNT", 1, 0, false);
        declareMacro("do_generic_table", "DO-GENERIC-TABLE");
        declareFunction("cinc_generic_table", "CINC-GENERIC-TABLE", 2, 2, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_S_is_not_a_GENERIC_TABLE_P_ = makeString("~S is not a GENERIC-TABLE-P.");

    @Override
    public void initializeVariables() {
        init_generic_table_utilities_file();
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void runTopLevelForms() {
        setup_generic_table_utilities_file();
    }

    

    static private final SubLList $list_alt2 = list(makeKeyword("PROGRESS-MESSAGE"));

    static private final SubLList $list_alt11 = list(makeSymbol("*SILENT-PROGRESS?*"));

    static private final SubLList $list_alt17 = list(makeString(""));

    static private final SubLList $list_alt18 = list(ZERO_INTEGER);
}

/**
 * Total time: 169 ms
 */
