package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_macros";
    public static final String myFingerPrint = "55aece63e0105bd6f3e1aa4e4b8677e58df21100db93bdd27b005c9f8158ae47";
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$ID;
    private static final SubLSymbol $sym6$DO_ID_INDEX;
    private static final SubLSymbol $kw7$ORDERED;
    private static final SubLSymbol $sym8$IGNORE;
    private static final SubLSymbol $sym9$ID;
    private static final SubLSymbol $sym10$DO_ID_INDEX_DENSE_OBJECTS;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$ID;
    private static final SubLSymbol $sym14$DO_ID_INDEX_SPARSE_OBJECTS;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$ID;
    private static final SubLSymbol $sym17$PAST_IDS;
    private static final SubLSymbol $sym18$MY_DONE;
    private static final SubLSymbol $sym19$CLET;
    private static final SubLSymbol $sym20$_;
    private static final SubLSymbol $sym21$PUNLESS;
    private static final SubLSymbol $sym22$CSETQ;
    private static final SubLSymbol $sym23$COR;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$TABLE_VAR;
    private static final SubLSymbol $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID;
    private static final SubLSymbol $sym27$FIRST_ID_VAR;
    private static final SubLSymbol $sym28$PROGRESS_MESSAGE_VAR;
    private static final SubLSymbol $sym29$SOFAR;
    private static final SubLSymbol $sym30$TOTAL;
    private static final SubLSymbol $sym31$_;
    private static final SubLSymbol $sym32$ID_INDEX_NEXT_ID;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym35$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym36$CINC;
    private static final SubLSymbol $sym37$END;
    private static final SubLSymbol $sym38$ID;
    private static final SubLSymbol $sym39$DO_NUMBERS;
    private static final SubLSymbol $kw40$START;
    private static final SubLSymbol $kw41$END;
    private static final SubLSymbol $kw42$DELTA;
    private static final SubLSymbol $sym43$ID_INDEX_LOOKUP;
    private static final SubLSymbol $sym44$PWHEN;
    private static final SubLList $list45;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 745L)
    public static SubLObject do_kb_suid_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_macros.NIL;
        SubLObject table = (SubLObject)kb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list0);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list0);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_macros.NIL;
        SubLObject current_$1 = (SubLObject)kb_macros.NIL;
        while (kb_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list0);
            if (kb_macros.NIL == conses_high.member(current_$1, (SubLObject)kb_macros.$list1, (SubLObject)kb_macros.UNPROVIDED, (SubLObject)kb_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_macros.T;
            }
            if (current_$1 == kb_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_macros.NIL != bad && kb_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_macros.$list0);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((kb_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)kb_macros.$sym5$ID;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym6$DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, var, table, kb_macros.$kw7$ORDERED, kb_macros.T, kb_macros.$kw3$PROGRESS_MESSAGE, progress_message, kb_macros.$kw4$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym8$IGNORE, id), ConsesLow.append(body, (SubLObject)kb_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 1081L)
    public static SubLObject do_kb_suid_table_dense_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_macros.NIL;
        SubLObject table = (SubLObject)kb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list0);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list0);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_macros.NIL;
        SubLObject current_$2 = (SubLObject)kb_macros.NIL;
        while (kb_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list0);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list0);
            if (kb_macros.NIL == conses_high.member(current_$2, (SubLObject)kb_macros.$list1, (SubLObject)kb_macros.UNPROVIDED, (SubLObject)kb_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_macros.T;
            }
            if (current_$2 == kb_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_macros.NIL != bad && kb_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_macros.$list0);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((kb_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)kb_macros.$sym9$ID;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym10$DO_ID_INDEX_DENSE_OBJECTS, (SubLObject)ConsesLow.list(id, var, table, (SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)kb_macros.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym8$IGNORE, id), ConsesLow.append(body, (SubLObject)kb_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 1345L)
    public static SubLObject do_kb_suid_table_sparse_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_macros.NIL;
        SubLObject table = (SubLObject)kb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list11);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list11);
        table = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_macros.NIL;
        SubLObject current_$3 = (SubLObject)kb_macros.NIL;
        while (kb_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list11);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list11);
            if (kb_macros.NIL == conses_high.member(current_$3, (SubLObject)kb_macros.$list12, (SubLObject)kb_macros.UNPROVIDED, (SubLObject)kb_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_macros.T;
            }
            if (current_$3 == kb_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_macros.NIL != bad && kb_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_macros.$list11);
        }
        final SubLObject ordered_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw7$ORDERED, current);
        final SubLObject ordered = (SubLObject)((kb_macros.NIL != ordered_tail) ? conses_high.cadr(ordered_tail) : kb_macros.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((kb_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)kb_macros.$sym13$ID;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym14$DO_ID_INDEX_SPARSE_OBJECTS, (SubLObject)ConsesLow.list(new SubLObject[] { id, var, table, kb_macros.$kw7$ORDERED, ordered, kb_macros.$kw3$PROGRESS_MESSAGE, progress_message, kb_macros.$kw4$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym8$IGNORE, id), ConsesLow.append(body, (SubLObject)kb_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 1637L)
    public static SubLObject do_kb_suid_table_upto_excluding_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_macros.NIL;
        SubLObject table = (SubLObject)kb_macros.NIL;
        SubLObject threshold_id = (SubLObject)kb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list15);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list15);
        table = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list15);
        threshold_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_macros.NIL;
        SubLObject current_$4 = (SubLObject)kb_macros.NIL;
        while (kb_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list15);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list15);
            if (kb_macros.NIL == conses_high.member(current_$4, (SubLObject)kb_macros.$list1, (SubLObject)kb_macros.UNPROVIDED, (SubLObject)kb_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_macros.T;
            }
            if (current_$4 == kb_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_macros.NIL != bad && kb_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_macros.$list15);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((kb_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)kb_macros.$sym16$ID;
        final SubLObject past_ids = (SubLObject)kb_macros.$sym17$PAST_IDS;
        final SubLObject my_done = (SubLObject)kb_macros.$sym18$MY_DONE;
        return (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list(past_ids, my_done), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym6$DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, var, table, kb_macros.$kw7$ORDERED, kb_macros.T, kb_macros.$kw3$PROGRESS_MESSAGE, progress_message, kb_macros.$kw4$DONE, my_done }), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(past_ids, (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym20$_, threshold_id, id))), (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym21$PUNLESS, past_ids, ConsesLow.append(body, (SubLObject)kb_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym22$CSETQ, my_done, (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym23$COR, done, past_ids)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 2153L)
    public static SubLObject do_kb_suid_table_starting_at_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_macros.NIL;
        SubLObject table = (SubLObject)kb_macros.NIL;
        SubLObject first_id = (SubLObject)kb_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list24);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list24);
        table = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_macros.$list24);
        first_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_macros.NIL;
        SubLObject current_$5 = (SubLObject)kb_macros.NIL;
        while (kb_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list24);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_macros.$list24);
            if (kb_macros.NIL == conses_high.member(current_$5, (SubLObject)kb_macros.$list1, (SubLObject)kb_macros.UNPROVIDED, (SubLObject)kb_macros.UNPROVIDED)) {
                bad = (SubLObject)kb_macros.T;
            }
            if (current_$5 == kb_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_macros.NIL != bad && kb_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_macros.$list24);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_macros.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_macros.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((kb_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!table.isAtom()) {
            final SubLObject table_var = (SubLObject)kb_macros.$sym25$TABLE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(table_var, table)), (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(var, table_var, first_id, (SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)kb_macros.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)kb_macros.NIL)));
        }
        if (!first_id.isAtom()) {
            final SubLObject first_id_var = (SubLObject)kb_macros.$sym27$FIRST_ID_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(first_id_var, first_id)), (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(var, table, first_id_var, (SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)kb_macros.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)kb_macros.NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = (SubLObject)kb_macros.$sym28$PROGRESS_MESSAGE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_message_var, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(var, table, first_id, (SubLObject)kb_macros.$kw3$PROGRESS_MESSAGE, progress_message_var, (SubLObject)kb_macros.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)kb_macros.NIL)));
        }
        if (kb_macros.NIL != progress_message) {
            final SubLObject sofar = (SubLObject)kb_macros.$sym29$SOFAR;
            final SubLObject total = (SubLObject)kb_macros.$sym30$TOTAL;
            return (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym31$_, (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym32$ID_INDEX_NEXT_ID, table), first_id)), reader.bq_cons(sofar, (SubLObject)kb_macros.$list33)), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym34$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym26$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(var, table, first_id, (SubLObject)kb_macros.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym35$NOTE_PERCENT_PROGRESS, sofar, total), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym36$CINC, sofar), ConsesLow.append(body, (SubLObject)kb_macros.NIL))));
        }
        final SubLObject end = (SubLObject)kb_macros.$sym37$END;
        final SubLObject id = (SubLObject)kb_macros.$sym38$ID;
        return (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(end, (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym32$ID_INDEX_NEXT_ID, table))), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym39$DO_NUMBERS, (SubLObject)ConsesLow.list(new SubLObject[] { id, kb_macros.$kw40$START, first_id, kb_macros.$kw41$END, end, kb_macros.$kw42$DELTA, kb_macros.ONE_INTEGER, kb_macros.$kw4$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym19$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_macros.$sym43$ID_INDEX_LOOKUP, table, id))), (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym44$PWHEN, var, ConsesLow.append(body, (SubLObject)kb_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-macros.lisp", position = 3988L)
    public static SubLObject with_normal_kb_object_lookup_assumptions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_macros.$sym19$CLET, (SubLObject)kb_macros.$list45, ConsesLow.append(body, (SubLObject)kb_macros.NIL));
    }
    
    public static SubLObject declare_kb_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_macros", "do_kb_suid_table", "DO-KB-SUID-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_macros", "do_kb_suid_table_dense_objects", "DO-KB-SUID-TABLE-DENSE-OBJECTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_macros", "do_kb_suid_table_sparse_objects", "DO-KB-SUID-TABLE-SPARSE-OBJECTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_macros", "do_kb_suid_table_upto_excluding_id", "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_macros", "do_kb_suid_table_starting_at_id", "DO-KB-SUID-TABLE-STARTING-AT-ID");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_macros", "with_normal_kb_object_lookup_assumptions", "WITH-NORMAL-KB-OBJECT-LOOKUP-ASSUMPTIONS");
        return (SubLObject)kb_macros.NIL;
    }
    
    public static SubLObject init_kb_macros_file() {
        return (SubLObject)kb_macros.NIL;
    }
    
    public static SubLObject setup_kb_macros_file() {
        return (SubLObject)kb_macros.NIL;
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
        me = (SubLFile)new kb_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym6$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $kw7$ORDERED = SubLObjectFactory.makeKeyword("ORDERED");
        $sym8$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym9$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym10$DO_ID_INDEX_DENSE_OBJECTS = SubLObjectFactory.makeSymbol("DO-ID-INDEX-DENSE-OBJECTS");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERED"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERED"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym13$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym14$DO_ID_INDEX_SPARSE_OBJECTS = SubLObjectFactory.makeSymbol("DO-ID-INDEX-SPARSE-OBJECTS");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("THRESHOLD-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym17$PAST_IDS = SubLObjectFactory.makeUninternedSymbol("PAST-IDS");
        $sym18$MY_DONE = SubLObjectFactory.makeUninternedSymbol("MY-DONE");
        $sym19$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym20$_ = SubLObjectFactory.makeSymbol("<");
        $sym21$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym22$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym23$COR = SubLObjectFactory.makeSymbol("COR");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym25$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
        $sym26$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");
        $sym27$FIRST_ID_VAR = SubLObjectFactory.makeUninternedSymbol("FIRST-ID-VAR");
        $sym28$PROGRESS_MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
        $sym29$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym30$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym31$_ = SubLObjectFactory.makeSymbol("-");
        $sym32$ID_INDEX_NEXT_ID = SubLObjectFactory.makeSymbol("ID-INDEX-NEXT-ID");
        $list33 = ConsesLow.list((SubLObject)kb_macros.ZERO_INTEGER);
        $sym34$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym35$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym36$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym37$END = SubLObjectFactory.makeUninternedSymbol("END");
        $sym38$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym39$DO_NUMBERS = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $kw40$START = SubLObjectFactory.makeKeyword("START");
        $kw41$END = SubLObjectFactory.makeKeyword("END");
        $kw42$DELTA = SubLObjectFactory.makeKeyword("DELTA");
        $sym43$ID_INDEX_LOOKUP = SubLObjectFactory.makeSymbol("ID-INDEX-LOOKUP");
        $sym44$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-NART-HANDLE-LOOKUP-FUNC*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*")));
    }
}

/*

	Total time: 137 ms
	
*/