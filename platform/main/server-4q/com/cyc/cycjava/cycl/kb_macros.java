/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
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
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_macros extends SubLTranslatedFile implements V12 {
    /**
     * Return T iff we are in the process of removing some fort.
     */
    @LispMethod(comment = "Return T iff we are in the process of removing some fort.")
    public static final SubLObject some_fort_being_removedP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($forts_being_removed$.getDynamicValue(thread));
        }
    }

    public static final SubLObject note_fort_being_removed(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    fort = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($forts_being_removed$, listS(CONS, fort, $list_alt4))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff we are in the process of removing FORT.
     */
    @LispMethod(comment = "Return T iff we are in the process of removing FORT.")
    public static final SubLObject fort_being_removedP(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(fort, $forts_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject do_kb_suid_table_old_objects(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    table = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt5);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt5);
                            if (NIL == member(current_2, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt5);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym14$ID;
                                return listS(DO_ID_INDEX_OLD_OBJECTS, list(id, var, table, $PROGRESS_MESSAGE, progress_message, $DONE, done), list(IGNORE, id), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject do_kb_suid_table_new_objects(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    table = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt16);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt16);
                            if (NIL == member(current_3, $list_alt17, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt16);
                        }
                        {
                            SubLObject ordered_tail = property_list_member($ORDERED, current);
                            SubLObject ordered = (NIL != ordered_tail) ? ((SubLObject) (cadr(ordered_tail))) : NIL;
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym18$ID;
                                return listS(DO_ID_INDEX_NEW_OBJECTS, list(new SubLObject[]{ id, var, table, $ORDERED, ordered, $PROGRESS_MESSAGE, progress_message, $DONE, done }), list(IGNORE, id), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLSymbol $forts_being_removed$ = makeSymbol("*FORTS-BEING-REMOVED*");

    public static final SubLFile me = new kb_macros();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym5$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol $sym9$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_ID_INDEX_DENSE_OBJECTS = makeSymbol("DO-ID-INDEX-DENSE-OBJECTS");

    private static final SubLList $list11 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list12 = list(makeKeyword("ORDERED"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $sym13$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_ID_INDEX_SPARSE_OBJECTS = makeSymbol("DO-ID-INDEX-SPARSE-OBJECTS");

    private static final SubLList $list15 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("THRESHOLD-ID"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym16$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol $sym17$PAST_IDS = makeUninternedSymbol("PAST-IDS");

    private static final SubLSymbol $sym18$MY_DONE = makeUninternedSymbol("MY-DONE");

    private static final SubLSymbol $sym20$_ = makeSymbol("<");

    private static final SubLList $list24 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("FIRST-ID"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym25$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");

    private static final SubLSymbol $sym27$FIRST_ID_VAR = makeUninternedSymbol("FIRST-ID-VAR");

    private static final SubLSymbol $sym28$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");

    private static final SubLSymbol $sym29$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym30$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym31$_ = makeSymbol("-");

    private static final SubLSymbol ID_INDEX_NEXT_ID = makeSymbol("ID-INDEX-NEXT-ID");

    private static final SubLList $list33 = list(ZERO_INTEGER);

    private static final SubLSymbol $sym37$END = makeUninternedSymbol("END");

    private static final SubLSymbol $sym38$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");

    private static final SubLSymbol ID_INDEX_LOOKUP = makeSymbol("ID-INDEX-LOOKUP");

    private static final SubLList $list45 = list(list(makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*")), list(makeSymbol("*CFASL-NART-HANDLE-LOOKUP-FUNC*")), list(makeSymbol("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*")), list(makeSymbol("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*")), list(makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*")), list(makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*")));

    public static final SubLObject do_kb_suid_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    table = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt5);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt5);
                            if (NIL == member(current_1, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt5);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym10$ID;
                                return listS(DO_ID_INDEX, list(new SubLObject[]{ id, var, table, $ORDERED, T, $PROGRESS_MESSAGE, progress_message, $DONE, done }), list(IGNORE, id), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_suid_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym5$ID;
        return listS(DO_ID_INDEX, list(new SubLObject[]{ id, var, table, $ORDERED, T, $PROGRESS_MESSAGE, progress_message, $DONE, done }), list(IGNORE, id), append(body, NIL));
    }

    public static SubLObject do_kb_suid_table_dense_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym9$ID;
        return listS(DO_ID_INDEX_DENSE_OBJECTS, list(id, var, table, $PROGRESS_MESSAGE, progress_message, $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static SubLObject do_kb_suid_table_sparse_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list11);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list11);
            if (NIL == member(current_$3, $list12, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list11);
        }
        final SubLObject ordered_tail = property_list_member($ORDERED, current);
        final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym13$ID;
        return listS(DO_ID_INDEX_SPARSE_OBJECTS, list(new SubLObject[]{ id, var, table, $ORDERED, ordered, $PROGRESS_MESSAGE, progress_message, $DONE, done }), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject do_kb_suid_table_upto_excluding_id_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject table = NIL;
                    SubLObject threshold_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    table = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    threshold_id = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            if (NIL == member(current_4, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt20);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym21$ID;
                                SubLObject past_ids = $sym22$PAST_IDS;
                                SubLObject my_done = $sym23$MY_DONE;
                                return list(CLET, list(past_ids, my_done), list(DO_ID_INDEX, list(new SubLObject[]{ id, var, table, $ORDERED, T, $PROGRESS_MESSAGE, progress_message, $DONE, my_done }), list(CLET, list(list(past_ids, list($sym24$_, threshold_id, id))), listS(PUNLESS, past_ids, append(body, NIL)), list(CSETQ, my_done, list(COR, done, past_ids)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_suid_table_upto_excluding_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject table = NIL;
        SubLObject threshold_id = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        table = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        threshold_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$4, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym16$ID;
        final SubLObject past_ids = $sym17$PAST_IDS;
        final SubLObject my_done = $sym18$MY_DONE;
        return list(CLET, list(past_ids, my_done), list(DO_ID_INDEX, list(new SubLObject[]{ id, var, table, $ORDERED, T, $PROGRESS_MESSAGE, progress_message, $DONE, my_done }), list(CLET, list(list(past_ids, list($sym20$_, threshold_id, id))), listS(PUNLESS, past_ids, append(body, NIL)), list(CSETQ, my_done, list(COR, done, past_ids)))));
    }

    public static final SubLObject do_kb_suid_table_starting_at_id_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject table = NIL;
                    SubLObject first_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    table = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    first_id = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt28);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt28);
                            if (NIL == member(current_5, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt28);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym29$ID;
                                return list(DO_ID_INDEX, list(new SubLObject[]{ id, var, table, $ORDERED, T, $PROGRESS_MESSAGE, progress_message, $DONE, done }), listS(PUNLESS, list($sym24$_, id, first_id), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_suid_table_starting_at_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject table = NIL;
        SubLObject first_id = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        table = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        first_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$5, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!table.isAtom()) {
            final SubLObject table_var = $sym25$TABLE_VAR;
            return list(CLET, list(list(table_var, table)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(var, table_var, first_id, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
        }
        if (!first_id.isAtom()) {
            final SubLObject first_id_var = $sym27$FIRST_ID_VAR;
            return list(CLET, list(list(first_id_var, first_id)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(var, table, first_id_var, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = $sym28$PROGRESS_MESSAGE_VAR;
            return list(CLET, list(list(progress_message_var, progress_message)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(var, table, first_id, $PROGRESS_MESSAGE, progress_message_var, $DONE, done), append(body, NIL)));
        }
        if (NIL != progress_message) {
            final SubLObject sofar = $sym29$SOFAR;
            final SubLObject total = $sym30$TOTAL;
            return list(CLET, list(list(total, list($sym31$_, list(ID_INDEX_NEXT_ID, table), first_id)), bq_cons(sofar, $list33)), list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(var, table, first_id, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, sofar), append(body, NIL))));
        }
        final SubLObject end = $sym37$END;
        final SubLObject id = $sym38$ID;
        return list(CLET, list(list(end, list(ID_INDEX_NEXT_ID, table))), list(DO_NUMBERS, list(new SubLObject[]{ id, $START, first_id, $END, end, $DELTA, ONE_INTEGER, $DONE, done }), list(CLET, list(list(var, list(ID_INDEX_LOOKUP, table, id))), listS(PWHEN, var, append(body, NIL)))));
    }

    public static SubLObject with_normal_kb_object_lookup_assumptions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list45, append(body, NIL));
    }

    public static final SubLObject declare_kb_macros_file_alt() {
        declareMacro("note_fort_being_removed", "NOTE-FORT-BEING-REMOVED");
        declareFunction("some_fort_being_removedP", "SOME-FORT-BEING-REMOVED?", 0, 0, false);
        declareFunction("fort_being_removedP", "FORT-BEING-REMOVED?", 1, 0, false);
        declareMacro("do_kb_suid_table", "DO-KB-SUID-TABLE");
        declareMacro("do_kb_suid_table_old_objects", "DO-KB-SUID-TABLE-OLD-OBJECTS");
        declareMacro("do_kb_suid_table_new_objects", "DO-KB-SUID-TABLE-NEW-OBJECTS");
        declareMacro("do_kb_suid_table_upto_excluding_id", "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        declareMacro("do_kb_suid_table_starting_at_id", "DO-KB-SUID-TABLE-STARTING-AT-ID");
        return NIL;
    }

    public static SubLObject declare_kb_macros_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_kb_suid_table", "DO-KB-SUID-TABLE");
            declareMacro("do_kb_suid_table_dense_objects", "DO-KB-SUID-TABLE-DENSE-OBJECTS");
            declareMacro("do_kb_suid_table_sparse_objects", "DO-KB-SUID-TABLE-SPARSE-OBJECTS");
            declareMacro("do_kb_suid_table_upto_excluding_id", "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
            declareMacro("do_kb_suid_table_starting_at_id", "DO-KB-SUID-TABLE-STARTING-AT-ID");
            declareMacro("with_normal_kb_object_lookup_assumptions", "WITH-NORMAL-KB-OBJECT-LOOKUP-ASSUMPTIONS");
        }
        if (SubLFiles.USE_V2) {
            declareMacro("note_fort_being_removed", "NOTE-FORT-BEING-REMOVED");
            declareFunction("some_fort_being_removedP", "SOME-FORT-BEING-REMOVED?", 0, 0, false);
            declareFunction("fort_being_removedP", "FORT-BEING-REMOVED?", 1, 0, false);
            declareMacro("do_kb_suid_table_old_objects", "DO-KB-SUID-TABLE-OLD-OBJECTS");
            declareMacro("do_kb_suid_table_new_objects", "DO-KB-SUID-TABLE-NEW-OBJECTS");
        }
        return NIL;
    }

    public static SubLObject declare_kb_macros_file_Previous() {
        declareMacro("do_kb_suid_table", "DO-KB-SUID-TABLE");
        declareMacro("do_kb_suid_table_dense_objects", "DO-KB-SUID-TABLE-DENSE-OBJECTS");
        declareMacro("do_kb_suid_table_sparse_objects", "DO-KB-SUID-TABLE-SPARSE-OBJECTS");
        declareMacro("do_kb_suid_table_upto_excluding_id", "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        declareMacro("do_kb_suid_table_starting_at_id", "DO-KB-SUID-TABLE-STARTING-AT-ID");
        declareMacro("with_normal_kb_object_lookup_assumptions", "WITH-NORMAL-KB-OBJECT-LOOKUP-ASSUMPTIONS");
        return NIL;
    }

    public static final SubLObject init_kb_macros_file_alt() {
        defparameter("*FORTS-BEING-REMOVED*", NIL);
        return NIL;
    }

    public static SubLObject init_kb_macros_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            defparameter("*FORTS-BEING-REMOVED*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_kb_macros_file_Previous() {
        return NIL;
    }

    public static SubLObject setup_kb_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(makeSymbol("*FORTS-BEING-REMOVED*"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    static private final SubLSymbol $sym10$ID = makeUninternedSymbol("ID");

    static private final SubLSymbol $sym14$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_ID_INDEX_OLD_OBJECTS = makeSymbol("DO-ID-INDEX-OLD-OBJECTS");

    static private final SubLList $list_alt16 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt17 = list(makeKeyword("ORDERED"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    static private final SubLSymbol $sym18$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_ID_INDEX_NEW_OBJECTS = makeSymbol("DO-ID-INDEX-NEW-OBJECTS");

    static private final SubLList $list_alt20 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("THRESHOLD-ID"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym21$ID = makeUninternedSymbol("ID");

    static private final SubLSymbol $sym22$PAST_IDS = makeUninternedSymbol("PAST-IDS");

    static private final SubLSymbol $sym23$MY_DONE = makeUninternedSymbol("MY-DONE");

    static private final SubLSymbol $sym24$_ = makeSymbol("<");

    static private final SubLList $list_alt28 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("FIRST-ID"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym29$ID = makeUninternedSymbol("ID");
}

/**
 * Total time: 137 ms
 */
