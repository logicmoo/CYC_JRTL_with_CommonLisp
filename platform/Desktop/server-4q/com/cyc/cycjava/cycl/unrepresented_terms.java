package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unrepresented_terms extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.unrepresented_terms";
    public static final String myFingerPrint = "867599700c5e9ee2f2d417900edd54dd5a70296b8b4f3a9ad2e772c3caf59dd5";
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 6922L)
    public static SubLSymbol $unrepresented_term_to_suid$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 7297L)
    public static SubLSymbol $unrepresented_term_from_suid$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 10012L)
    private static SubLSymbol $use_fht_approach_to_unrepresented_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 10290L)
    public static SubLSymbol $unrepresented_term_fht$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 10483L)
    public static SubLSymbol $unrepresented_term_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 10651L)
    public static SubLSymbol $unrepresented_term_change_set$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 10805L)
    public static SubLSymbol $unrepresented_term_fht_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 10973L)
    private static SubLSymbol $unrepresented_terms_tombstone$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 13753L)
    private static SubLSymbol $new_unrepresented_term_id_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 21074L)
    public static SubLSymbol $unrepresented_term_dump_id_table$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$PIF;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$WITH_LOCK_HELD;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DO_PRISTINE_FILE_HASH_TABLE_KEYS;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$MESSAGE;
    private static final SubLSymbol $sym12$PWHEN;
    private static final SubLSymbol $sym13$FHT_TERM_ITEM_P;
    private static final SubLSymbol $sym14$PUNLESS;
    private static final SubLSymbol $sym15$DELETED_UNREPRESENTED_TERM_ITEM_;
    private static final SubLSymbol $sym16$CSETQ;
    private static final SubLSymbol $sym17$GET_FHT_TERM_ITEM_TERM;
    private static final SubLSymbol $sym18$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLString $str22$mapping_Cyc_unrepresented_terms;
    private static final SubLSymbol $sym23$SUID_ITEM;
    private static final SubLSymbol $sym24$PROGRESS_CDOLIST;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$CLET;
    private static final SubLSymbol $sym27$GET_FHT_SUID_ITEM_SUID;
    private static final SubLSymbol $sym28$FIND_UNREPRESENTED_TERM_BY_SUID;
    private static final SubLSymbol $sym29$DO_KB_SUID_TABLE_STARTING_AT_ID;
    private static final SubLSymbol $sym30$UNREPRESENTED_TERM_SUID;
    private static final SubLSymbol $sym31$KEY;
    private static final SubLSymbol $sym32$MSG;
    private static final SubLSymbol $sym33$CCONCATENATE;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$DO_PRISTINE_FILE_HASH_TABLE;
    private static final SubLSymbol $sym36$FHT_SUID_ITEM_P;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$DO_NEW_UNREPRESENTED_IDS_AND_TERMS;
    private static final SubLSymbol $sym39$DO_ID_INDEX;
    private static final SubLSymbol $kw40$ORDERED;
    private static final SubLSymbol $sym41$ID;
    private static final SubLSymbol $sym42$SUID_ITEM;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$ID;
    private static final SubLSymbol $sym45$DO_UNREPRESENTED_IDS_AND_TERMS;
    private static final SubLSymbol $sym46$IGNORE;
    private static final SubLList $list47;
    private static final SubLString $str48$mapping_Cyc_strings;
    private static final SubLSymbol $sym49$DO_KB_UNREPRESENTED_TERMS;
    private static final SubLSymbol $sym50$SUBL_STRING_P;
    private static final SubLList $list51;
    private static final SubLString $str52$mapping_Cyc_numbers;
    private static final SubLSymbol $sym53$SUBL_REAL_NUMBER_P;
    private static final SubLSymbol $sym54$_UNREPRESENTED_TERM_TO_SUID_;
    private static final SubLSymbol $sym55$_UNREPRESENTED_TERM_FROM_SUID_;
    private static final SubLString $str56$Determining_maximum_unrepresented;
    private static final SubLString $str57$____Old_Space;
    private static final SubLString $str58$____New_Space;
    private static final SubLString $str59$cdolist;
    private static final SubLSymbol $sym60$STRINGP;
    private static final SubLSymbol $kw61$SKIP;
    private static final SubLSymbol $sym62$_USE_FHT_APPROACH_TO_UNREPRESENTED_TERMS__;
    private static final SubLSymbol $sym63$_UNREPRESENTED_TERM_FHT_;
    private static final SubLSymbol $sym64$_UNREPRESENTED_TERM_ISG_;
    private static final SubLSymbol $sym65$_UNREPRESENTED_TERM_CHANGE_SET_;
    private static final SubLSymbol $sym66$_UNREPRESENTED_TERM_FHT_LOCK_;
    private static final SubLString $str67$Unrepresented_Terms_FHT_Lock;
    private static final SubLSymbol $kw68$DELETED;
    private static final SubLString $str69$Not_yet_implemented_;
    private static final SubLSymbol $sym70$DO_UNREPRESENTED_TERMS_TABLE;
    private static final SubLSymbol $sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_;
    private static final SubLSymbol $sym72$UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM;
    private static final SubLList $list73;
    private static final SubLSymbol $kw74$ALL;
    private static final SubLSymbol $sym75$_NEW_UNREPRESENTED_TERM_ID_THRESHOLD_;
    private static final SubLInteger $int76$10000;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE;
    private static final SubLSymbol $sym79$WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE;
    private static final SubLSymbol $kw80$MARKER;
    private static final SubLSymbol $sym81$CREATE_UNREPRESENTED_TERM_FHT;
    private static final SubLString $str82$Creating_unrepresented_term_FHT_;
    private static final SubLSymbol $kw83$IMAGE_INDEPENDENT_CFASL;
    private static final SubLString $str84$unrepresented_terms;
    private static final SubLString $str85$fht;
    private static final SubLSymbol $kw86$INITIALIZED;
    private static final SubLSymbol $kw87$UNINITIALIZED;
    private static final SubLSymbol $kw88$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym89$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym90$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 870L)
    public static SubLObject do_old_unrepresented_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject unrepresented_term = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list0);
        unrepresented_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$1 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list0);
            if (unrepresented_terms.NIL == conses_high.member(current_$1, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$1 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list0);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym5$PIF, (SubLObject)unrepresented_terms.$list6, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym7$WITH_LOCK_HELD, (SubLObject)unrepresented_terms.$list8, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym9$DO_PRISTINE_FILE_HASH_TABLE_KEYS, (SubLObject)ConsesLow.list(unrepresented_term, (SubLObject)unrepresented_terms.$list10, (SubLObject)unrepresented_terms.$kw11$MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym12$PWHEN, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym13$FHT_TERM_ITEM_P, unrepresented_term), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym14$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym15$DELETED_UNREPRESENTED_TERM_ITEM_, unrepresented_term), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym16$CSETQ, unrepresented_term, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym17$GET_FHT_TERM_ITEM_TERM, unrepresented_term)), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL))))), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym18$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, (SubLObject)ConsesLow.list(unrepresented_term, (SubLObject)unrepresented_terms.$list19, (SubLObject)unrepresented_terms.$list20, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 2010L)
    public static SubLObject do_new_unrepresented_ids_and_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)unrepresented_terms.NIL;
        SubLObject v_term = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list21);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list21);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$2 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list21);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list21);
            if (unrepresented_terms.NIL == conses_high.member(current_$2, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$2 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list21);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.$str22$mapping_Cyc_unrepresented_terms);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject suid_item = (SubLObject)unrepresented_terms.$sym23$SUID_ITEM;
        return (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym5$PIF, (SubLObject)unrepresented_terms.$list6, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym24$PROGRESS_CDOLIST, (SubLObject)ConsesLow.list(suid_item, (SubLObject)unrepresented_terms.$list25, progress_message), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym14$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym26$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(id, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym27$GET_FHT_SUID_ITEM_SUID, suid_item)), (SubLObject)ConsesLow.list(v_term, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym28$FIND_UNREPRESENTED_TERM_BY_SUID, id))), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)))), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym29$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(v_term, (SubLObject)unrepresented_terms.$list19, (SubLObject)unrepresented_terms.$list20, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym26$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(id, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym30$UNREPRESENTED_TERM_SUID, v_term))), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 3030L)
    public static SubLObject do_unrepresented_ids_and_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)unrepresented_terms.NIL;
        SubLObject v_term = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list21);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list21);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$3 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list21);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list21);
            if (unrepresented_terms.NIL == conses_high.member(current_$3, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$3 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list21);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.$str22$mapping_Cyc_unrepresented_terms);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject key = (SubLObject)unrepresented_terms.$sym31$KEY;
        final SubLObject msg = (SubLObject)unrepresented_terms.$sym32$MSG;
        return (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym5$PIF, (SubLObject)unrepresented_terms.$list6, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym26$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(msg, (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym33$CCONCATENATE, progress_message, (SubLObject)unrepresented_terms.$list34))), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym7$WITH_LOCK_HELD, (SubLObject)unrepresented_terms.$list8, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym35$DO_PRISTINE_FILE_HASH_TABLE, (SubLObject)ConsesLow.list(key, v_term, (SubLObject)unrepresented_terms.$list10, (SubLObject)unrepresented_terms.$kw11$MESSAGE, msg, (SubLObject)unrepresented_terms.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym14$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym15$DELETED_UNREPRESENTED_TERM_ITEM_, key), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym12$PWHEN, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym36$FHT_SUID_ITEM_P, key), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym26$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(id, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym27$GET_FHT_SUID_ITEM_SUID, key))), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)))))), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym14$PUNLESS, done, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym16$CSETQ, msg, (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym33$CCONCATENATE, progress_message, (SubLObject)unrepresented_terms.$list37)), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym38$DO_NEW_UNREPRESENTED_IDS_AND_TERMS, (SubLObject)ConsesLow.list(id, v_term, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, msg, (SubLObject)unrepresented_terms.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym39$DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { id, v_term, unrepresented_terms.$list19, unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, unrepresented_terms.$kw40$ORDERED, unrepresented_terms.T, unrepresented_terms.$kw4$DONE, done }), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 4372L)
    public static SubLObject do_new_unrepresented_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject unrepresented_term = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list0);
        unrepresented_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$4 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list0);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list0);
            if (unrepresented_terms.NIL == conses_high.member(current_$4, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$4 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list0);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)unrepresented_terms.$sym41$ID;
        final SubLObject suid_item = (SubLObject)unrepresented_terms.$sym42$SUID_ITEM;
        return (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym5$PIF, (SubLObject)unrepresented_terms.$list6, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym24$PROGRESS_CDOLIST, (SubLObject)ConsesLow.list(suid_item, (SubLObject)unrepresented_terms.$list25, progress_message), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym14$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym26$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(id, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym27$GET_FHT_SUID_ITEM_SUID, suid_item)), (SubLObject)ConsesLow.list(unrepresented_term, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym28$FIND_UNREPRESENTED_TERM_BY_SUID, id))), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym29$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(unrepresented_term, (SubLObject)unrepresented_terms.$list19, (SubLObject)unrepresented_terms.$list20, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 5202L)
    public static SubLObject do_kb_unrepresented_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list43);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$5 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list43);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list43);
            if (unrepresented_terms.NIL == conses_high.member(current_$5, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$5 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list43);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.$str22$mapping_Cyc_unrepresented_terms);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)unrepresented_terms.$sym44$ID;
        return (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym45$DO_UNREPRESENTED_IDS_AND_TERMS, (SubLObject)ConsesLow.list(id, var, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym46$IGNORE, id), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 6013L)
    public static SubLObject do_kb_strings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list47);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$6 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list47);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list47);
            if (unrepresented_terms.NIL == conses_high.member(current_$6, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$6 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list47);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.$str48$mapping_Cyc_strings);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym49$DO_KB_UNREPRESENTED_TERMS, (SubLObject)ConsesLow.list(var, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym12$PWHEN, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym50$SUBL_STRING_P, var), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 6465L)
    public static SubLObject do_kb_numbers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)unrepresented_terms.$list51);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)unrepresented_terms.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)unrepresented_terms.NIL;
        SubLObject current_$7 = (SubLObject)unrepresented_terms.NIL;
        while (unrepresented_terms.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list51);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)unrepresented_terms.$list51);
            if (unrepresented_terms.NIL == conses_high.member(current_$7, (SubLObject)unrepresented_terms.$list1, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED)) {
                bad = (SubLObject)unrepresented_terms.T;
            }
            if (current_$7 == unrepresented_terms.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (unrepresented_terms.NIL != bad && unrepresented_terms.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)unrepresented_terms.$list51);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((unrepresented_terms.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : unrepresented_terms.$str52$mapping_Cyc_numbers);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)unrepresented_terms.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((unrepresented_terms.NIL != done_tail) ? conses_high.cadr(done_tail) : unrepresented_terms.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym49$DO_KB_UNREPRESENTED_TERMS, (SubLObject)ConsesLow.list(var, (SubLObject)unrepresented_terms.$kw3$PROGRESS_MESSAGE, progress_message, (SubLObject)unrepresented_terms.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym12$PWHEN, (SubLObject)ConsesLow.list((SubLObject)unrepresented_terms.$sym53$SUBL_REAL_NUMBER_P, var), ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 7404L)
    public static SubLObject setup_unrepresented_term_suid_table(final SubLObject size, final SubLObject exactP) {
        SubLObject setupP = (SubLObject)unrepresented_terms.NIL;
        if (unrepresented_terms.NIL == unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue()) {
            unrepresented_terms.$unrepresented_term_from_suid$.setGlobalValue(id_index.new_id_index(size, (SubLObject)unrepresented_terms.ZERO_INTEGER));
            setupP = (SubLObject)unrepresented_terms.T;
        }
        if (unrepresented_terms.NIL == unrepresented_terms.$unrepresented_term_to_suid$.getGlobalValue()) {
            unrepresented_terms.$unrepresented_term_to_suid$.setGlobalValue(Hashtables.make_hash_table(size, Symbols.symbol_function((SubLObject)unrepresented_terms.EQUAL), (SubLObject)unrepresented_terms.UNPROVIDED));
            setupP = (SubLObject)unrepresented_terms.T;
        }
        return setupP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 7872L)
    public static SubLObject finalize_unrepresented_term_suid_table(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == unrepresented_terms.UNPROVIDED) {
            max_unrepresented_term_id = (SubLObject)unrepresented_terms.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_next_unrepresented_term_suid(max_unrepresented_term_id);
        set_new_unrepresented_term_id_threshold(next_unrepresented_term_suid());
        if (unrepresented_terms.NIL == max_unrepresented_term_id) {
            final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), thread);
                id_index.optimize_id_index(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue(), (SubLObject)unrepresented_terms.UNPROVIDED);
            }
            finally {
                Storage.$current_area$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 8356L)
    public static SubLObject clear_unrepresented_term_suid_table() {
        id_index.clear_id_index(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue());
        Hashtables.clrhash(unrepresented_terms.$unrepresented_term_to_suid$.getGlobalValue());
        set_next_unrepresented_term_suid((SubLObject)unrepresented_terms.UNPROVIDED);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 8602L)
    public static SubLObject set_next_unrepresented_term_suid(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == unrepresented_terms.UNPROVIDED) {
            max_unrepresented_term_id = (SubLObject)unrepresented_terms.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = (SubLObject)unrepresented_terms.MINUS_ONE_INTEGER;
        if (unrepresented_terms.NIL != max_unrepresented_term_id) {
            max = max_unrepresented_term_id;
        }
        else if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            SubLObject msg = Sequences.cconcatenate((SubLObject)unrepresented_terms.$str56$Determining_maximum_unrepresented, (SubLObject)unrepresented_terms.$str57$____Old_Space);
            SubLObject release = (SubLObject)unrepresented_terms.NIL;
            try {
                release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = get_unrepresented_term_fht();
                utilities_macros.$progress_note$.setDynamicValue(msg, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject continuation = (SubLObject)unrepresented_terms.NIL;
                        SubLObject next;
                        for (SubLObject completeP = (SubLObject)unrepresented_terms.NIL; unrepresented_terms.NIL == completeP; completeP = Types.sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)unrepresented_terms.NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (unrepresented_terms.NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject unrepresented_term = the_value;
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)unrepresented_terms.ONE_INTEGER), thread);
                                if (unrepresented_terms.NIL == deleted_unrepresented_term_itemP(key) && unrepresented_terms.NIL != fht_suid_item_p(key)) {
                                    final SubLObject id = get_fht_suid_item_suid(key);
                                    final SubLObject suid = unrepresented_term_suid(unrepresented_term);
                                    max = Numbers.max(max, suid);
                                }
                            }
                            continuation = next;
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (unrepresented_terms.NIL != release) {
                    Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = Sequences.cconcatenate((SubLObject)unrepresented_terms.$str56$Determining_maximum_unrepresented, (SubLObject)unrepresented_terms.$str58$____New_Space);
            if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
                final SubLObject list_var = get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((unrepresented_terms.NIL != msg) ? msg : unrepresented_terms.$str59$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject suid_item = (SubLObject)unrepresented_terms.NIL;
                        suid_item = csome_list_var.first();
                        while (unrepresented_terms.NIL != csome_list_var) {
                            final SubLObject id2 = get_fht_suid_item_suid(suid_item);
                            final SubLObject unrepresented_term2 = find_unrepresented_term_by_suid(id2);
                            final SubLObject suid = unrepresented_term_suid(unrepresented_term2);
                            max = Numbers.max(max, suid);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)unrepresented_terms.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject table_var = do_unrepresented_terms_table();
                final SubLObject first_id_var = new_unrepresented_term_id_threshold();
                final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), first_id_var);
                SubLObject sofar = (SubLObject)unrepresented_terms.ZERO_INTEGER;
                final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(msg);
                        SubLObject unrepresented_term;
                        SubLObject suid;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id3;
                        SubLObject id_$10;
                        for (end = (end_var = id_index.id_index_next_id(table_var)), id3 = (SubLObject)unrepresented_terms.NIL, id3 = first_id_var; !id3.numGE(end_var); id3 = number_utilities.f_1X(id3)) {
                            unrepresented_term = id_index.id_index_lookup(table_var, id3, (SubLObject)unrepresented_terms.UNPROVIDED);
                            if (unrepresented_terms.NIL != unrepresented_term) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                id_$10 = unrepresented_term_suid(unrepresented_term);
                                suid = unrepresented_term_suid(unrepresented_term);
                                max = Numbers.max(max, suid);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        }
        else {
            final SubLObject idx = do_unrepresented_terms_table();
            final SubLObject mess = (SubLObject)unrepresented_terms.$str56$Determining_maximum_unrepresented;
            final SubLObject total2 = id_index.id_index_count(idx);
            SubLObject sofar2 = (SubLObject)unrepresented_terms.ZERO_INTEGER;
            assert unrepresented_terms.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$12 = idx;
                    if (unrepresented_terms.NIL == id_index.id_index_objects_empty_p(idx_$12, (SubLObject)unrepresented_terms.$kw61$SKIP)) {
                        final SubLObject idx_$13 = idx_$12;
                        if (unrepresented_terms.NIL == id_index.id_index_dense_objects_empty_p(idx_$13, (SubLObject)unrepresented_terms.$kw61$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                            final SubLObject backwardP_var = (SubLObject)unrepresented_terms.NIL;
                            SubLObject id;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject unrepresented_term3;
                            SubLObject suid2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)unrepresented_terms.NIL, v_iteration = (SubLObject)unrepresented_terms.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unrepresented_terms.ONE_INTEGER)) {
                                id = ((unrepresented_terms.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unrepresented_terms.ONE_INTEGER) : v_iteration);
                                unrepresented_term3 = Vectors.aref(vector_var, id);
                                if (unrepresented_terms.NIL == id_index.id_index_tombstone_p(unrepresented_term3) || unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) {
                                    if (unrepresented_terms.NIL != id_index.id_index_tombstone_p(unrepresented_term3)) {
                                        unrepresented_term3 = (SubLObject)unrepresented_terms.$kw61$SKIP;
                                    }
                                    suid2 = unrepresented_term_suid(unrepresented_term3);
                                    max = Numbers.max(max, suid2);
                                    sofar2 = Numbers.add(sofar2, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$14 = idx_$12;
                        if (unrepresented_terms.NIL == id_index.id_index_sparse_objects_empty_p(idx_$14) || unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$14);
                            SubLObject id4 = id_index.id_index_sparse_id_threshold(idx_$14);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$14);
                            final SubLObject v_default = (SubLObject)((unrepresented_terms.NIL != id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) ? unrepresented_terms.NIL : unrepresented_terms.$kw61$SKIP);
                            while (id4.numL(end_id)) {
                                final SubLObject unrepresented_term2 = Hashtables.gethash_without_values(id4, sparse, v_default);
                                if (unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP) || unrepresented_terms.NIL == id_index.id_index_tombstone_p(unrepresented_term2)) {
                                    final SubLObject suid = unrepresented_term_suid(unrepresented_term2);
                                    max = Numbers.max(max, suid);
                                    sofar2 = Numbers.add(sofar2, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                                id4 = Numbers.add(id4, (SubLObject)unrepresented_terms.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        final SubLObject next_suid = Numbers.add(max, (SubLObject)unrepresented_terms.ONE_INTEGER);
        id_index.set_id_index_next_id(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue(), next_suid);
        return next_suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 9127L)
    public static SubLObject lookup_unrepresented_term_by_suid_table(final SubLObject suid) {
        return id_index.id_index_lookup(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue(), suid, (SubLObject)unrepresented_terms.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 9273L)
    public static SubLObject lookup_unrepresented_term_suid_map(final SubLObject v_term) {
        return Hashtables.gethash_without_values(v_term, unrepresented_terms.$unrepresented_term_to_suid$.getGlobalValue(), (SubLObject)unrepresented_terms.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 9404L)
    public static SubLObject register_unrepresented_term_suid_table(final SubLObject v_term, final SubLObject suid) {
        id_index.id_index_enter(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue(), suid, v_term);
        Hashtables.sethash(v_term, unrepresented_terms.$unrepresented_term_to_suid$.getGlobalValue(), suid);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 9666L)
    public static SubLObject deregister_unrepresented_term_suid_table(final SubLObject suid) {
        final SubLObject v_term = lookup_unrepresented_term_by_suid_table(suid);
        if (unrepresented_terms.NIL != v_term) {
            id_index.id_index_remove(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue(), suid);
            Hashtables.remhash(v_term, unrepresented_terms.$unrepresented_term_to_suid$.getGlobalValue());
        }
        return list_utilities.sublisp_boolean(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 11072L)
    public static SubLObject use_unrepresented_term_fhtP() {
        return unrepresented_terms.$use_fht_approach_to_unrepresented_termsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 11174L)
    public static SubLObject get_unrepresented_term_fht() {
        return unrepresented_terms.$unrepresented_term_fht$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 11257L)
    public static SubLObject get_unrepresented_term_change_set() {
        return unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 11355L)
    public static SubLObject new_unrepresented_terms_iterator() {
        return (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) ? construct_unrepresented_terms_fht_based_iterator() : id_index.new_id_index_values_iterator(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 11681L)
    public static SubLObject construct_unrepresented_terms_fht_based_iterator() {
        return Errors.error((SubLObject)unrepresented_terms.$str69$Not_yet_implemented_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 11888L)
    public static SubLObject do_unrepresented_terms_table() {
        return unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 12021L)
    public static SubLObject map_unrepresented_terms(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            SubLObject msg = Sequences.cconcatenate((SubLObject)unrepresented_terms.$str22$mapping_Cyc_unrepresented_terms, (SubLObject)unrepresented_terms.$str57$____Old_Space);
            SubLObject release = (SubLObject)unrepresented_terms.NIL;
            try {
                release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = get_unrepresented_term_fht();
                utilities_macros.$progress_note$.setDynamicValue(msg, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject continuation = (SubLObject)unrepresented_terms.NIL;
                        SubLObject next;
                        for (SubLObject completeP = (SubLObject)unrepresented_terms.NIL; unrepresented_terms.NIL == completeP; completeP = Types.sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)unrepresented_terms.NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (unrepresented_terms.NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject v_term = the_value;
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)unrepresented_terms.ONE_INTEGER), thread);
                                if (unrepresented_terms.NIL == deleted_unrepresented_term_itemP(key) && unrepresented_terms.NIL != fht_suid_item_p(key)) {
                                    final SubLObject id = get_fht_suid_item_suid(key);
                                    Functions.funcall(function, v_term);
                                }
                            }
                            continuation = next;
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (unrepresented_terms.NIL != release) {
                    Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = Sequences.cconcatenate((SubLObject)unrepresented_terms.$str22$mapping_Cyc_unrepresented_terms, (SubLObject)unrepresented_terms.$str58$____New_Space);
            if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
                final SubLObject list_var = get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((unrepresented_terms.NIL != msg) ? msg : unrepresented_terms.$str59$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject suid_item = (SubLObject)unrepresented_terms.NIL;
                        suid_item = csome_list_var.first();
                        while (unrepresented_terms.NIL != csome_list_var) {
                            final SubLObject id2 = get_fht_suid_item_suid(suid_item);
                            final SubLObject v_term2 = find_unrepresented_term_by_suid(id2);
                            Functions.funcall(function, v_term2);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)unrepresented_terms.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject table_var = do_unrepresented_terms_table();
                final SubLObject first_id_var = new_unrepresented_term_id_threshold();
                final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), first_id_var);
                SubLObject sofar = (SubLObject)unrepresented_terms.ZERO_INTEGER;
                final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(msg);
                        SubLObject v_term;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id3;
                        SubLObject id_$18;
                        for (end = (end_var = id_index.id_index_next_id(table_var)), id3 = (SubLObject)unrepresented_terms.NIL, id3 = first_id_var; !id3.numGE(end_var); id3 = number_utilities.f_1X(id3)) {
                            v_term = id_index.id_index_lookup(table_var, id3, (SubLObject)unrepresented_terms.UNPROVIDED);
                            if (unrepresented_terms.NIL != v_term) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                id_$18 = unrepresented_term_suid(v_term);
                                Functions.funcall(function, v_term);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        }
        else {
            final SubLObject idx = do_unrepresented_terms_table();
            final SubLObject mess = (SubLObject)unrepresented_terms.$str22$mapping_Cyc_unrepresented_terms;
            final SubLObject total2 = id_index.id_index_count(idx);
            SubLObject sofar2 = (SubLObject)unrepresented_terms.ZERO_INTEGER;
            assert unrepresented_terms.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$20 = idx;
                    if (unrepresented_terms.NIL == id_index.id_index_objects_empty_p(idx_$20, (SubLObject)unrepresented_terms.$kw61$SKIP)) {
                        final SubLObject idx_$21 = idx_$20;
                        if (unrepresented_terms.NIL == id_index.id_index_dense_objects_empty_p(idx_$21, (SubLObject)unrepresented_terms.$kw61$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$21);
                            final SubLObject backwardP_var = (SubLObject)unrepresented_terms.NIL;
                            SubLObject id;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject v_term3;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)unrepresented_terms.NIL, v_iteration = (SubLObject)unrepresented_terms.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unrepresented_terms.ONE_INTEGER)) {
                                id = ((unrepresented_terms.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unrepresented_terms.ONE_INTEGER) : v_iteration);
                                v_term3 = Vectors.aref(vector_var, id);
                                if (unrepresented_terms.NIL == id_index.id_index_tombstone_p(v_term3) || unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) {
                                    if (unrepresented_terms.NIL != id_index.id_index_tombstone_p(v_term3)) {
                                        v_term3 = (SubLObject)unrepresented_terms.$kw61$SKIP;
                                    }
                                    Functions.funcall(function, v_term3);
                                    sofar2 = Numbers.add(sofar2, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$22 = idx_$20;
                        if (unrepresented_terms.NIL == id_index.id_index_sparse_objects_empty_p(idx_$22) || unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$22);
                            SubLObject id4 = id_index.id_index_sparse_id_threshold(idx_$22);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$22);
                            final SubLObject v_default = (SubLObject)((unrepresented_terms.NIL != id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) ? unrepresented_terms.NIL : unrepresented_terms.$kw61$SKIP);
                            while (id4.numL(end_id)) {
                                final SubLObject v_term2 = Hashtables.gethash_without_values(id4, sparse, v_default);
                                if (unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP) || unrepresented_terms.NIL == id_index.id_index_tombstone_p(v_term2)) {
                                    Functions.funcall(function, v_term2);
                                    sofar2 = Numbers.add(sofar2, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                                id4 = Numbers.add(id4, (SubLObject)unrepresented_terms.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 12150L)
    public static SubLObject new_new_unrepresented_terms_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(id_index.new_id_index_ordered_iterator(do_unrepresented_terms_table()), (SubLObject)unrepresented_terms.$sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_, (SubLObject)ConsesLow.list(new_unrepresented_term_id_threshold())), (SubLObject)unrepresented_terms.$sym72$UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM, (SubLObject)unrepresented_terms.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 12510L)
    public static SubLObject new_unrepresented_terms_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = (SubLObject)unrepresented_terms.NIL;
        SubLObject payload = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)unrepresented_terms.$list73);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)unrepresented_terms.$list73);
        payload = current.first();
        current = current.rest();
        if (unrepresented_terms.NIL == current) {
            return Numbers.numGE(id, id_threshold);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)unrepresented_terms.$list73);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 12689L)
    public static SubLObject unrepresented_terms_table_tuple_to_unrepresented_term(final SubLObject tuple) {
        SubLObject id = (SubLObject)unrepresented_terms.NIL;
        SubLObject payload = (SubLObject)unrepresented_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)unrepresented_terms.$list73);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)unrepresented_terms.$list73);
        payload = current.first();
        current = current.rest();
        if (unrepresented_terms.NIL == current) {
            return find_unrepresented_term_by_suid(id);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)unrepresented_terms.$list73);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 12888L)
    public static SubLObject deleted_unrepresented_term_id_iterator() {
        return iteration.new_list_iterator(id_index.id_index_missing_ids(do_unrepresented_terms_table(), (SubLObject)unrepresented_terms.$kw74$ALL, (SubLObject)unrepresented_terms.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 13090L)
    public static SubLObject has_new_unrepresented_termsP() {
        return Numbers.numG(next_unrepresented_term_suid(), new_unrepresented_term_id_threshold());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 13223L)
    public static SubLObject kb_unrepresented_term_count() {
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            return compute_kb_unrepresented_term_count_fht((SubLObject)unrepresented_terms.UNPROVIDED);
        }
        if (unrepresented_terms.NIL != list_utilities.sublisp_boolean(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue())) {
            return id_index.id_index_count(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue());
        }
        return (SubLObject)unrepresented_terms.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 13918L)
    public static SubLObject new_unrepresented_term_id_threshold() {
        return (unrepresented_terms.NIL != unrepresented_terms.$new_unrepresented_term_id_threshold$.getGlobalValue()) ? unrepresented_terms.$new_unrepresented_term_id_threshold$.getGlobalValue() : unrepresented_term_index_manager.get_file_backed_unrepresented_term_internal_id_threshold();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 14157L)
    public static SubLObject set_new_unrepresented_term_id_threshold(final SubLObject id) {
        unrepresented_terms.$new_unrepresented_term_id_threshold$.setGlobalValue(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 14282L)
    public static SubLObject old_unrepresented_term_count() {
        if (unrepresented_terms.NIL != do_unrepresented_terms_table()) {
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)unrepresented_terms.ZERO_INTEGER), id_index.id_index_old_and_new_object_counts(do_unrepresented_terms_table(), new_unrepresented_term_id_threshold()));
        }
        return kb_unrepresented_term_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 14546L)
    public static SubLObject new_unrepresented_term_count() {
        if (unrepresented_terms.NIL != do_unrepresented_terms_table()) {
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)unrepresented_terms.ONE_INTEGER), id_index.id_index_old_and_new_object_counts(do_unrepresented_terms_table(), new_unrepresented_term_id_threshold()));
        }
        return (SubLObject)unrepresented_terms.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 14782L)
    public static SubLObject compute_kb_unrepresented_term_count_fht(SubLObject valid_suid_keys) {
        if (valid_suid_keys == unrepresented_terms.UNPROVIDED) {
            valid_suid_keys = (SubLObject)unrepresented_terms.NIL;
        }
        if (unrepresented_terms.NIL == list_utilities.sublisp_boolean(valid_suid_keys)) {
            valid_suid_keys = get_unrepresented_term_new_space_suid_keys();
        }
        return Numbers.add(Numbers.subtract(get_kb_unrepresented_term_old_space_size(), get_kb_unrepresented_term_raw_new_space_size()), Sequences.length(valid_suid_keys));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 15380L)
    public static SubLObject get_kb_unrepresented_term_old_space_size() {
        final SubLObject fht_size = file_hash_table.file_hash_table_count(get_unrepresented_term_fht());
        final SubLObject old_space_size = Numbers.integerDivide(fht_size, (SubLObject)unrepresented_terms.TWO_INTEGER);
        return old_space_size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 15586L)
    public static SubLObject get_kb_unrepresented_term_raw_new_space_size() {
        final SubLObject change_set_size = Hashtables.hash_table_count(get_unrepresented_term_change_set());
        final SubLObject raw_new_space_size = Numbers.integerDivide(change_set_size, (SubLObject)unrepresented_terms.TWO_INTEGER);
        return raw_new_space_size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 15820L)
    public static SubLObject get_kb_unrepresented_term_max_suid() {
        return integer_sequence_generator.get_integer_sequence_generator_recent(unrepresented_terms.$unrepresented_term_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 15952L)
    public static SubLObject lookup_unrepresented_term_by_suid(final SubLObject suid) {
        return (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) ? lookup_unrepresented_term_by_suid_fht(suid) : lookup_unrepresented_term_by_suid_table(suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 16171L)
    public static SubLObject lookup_unrepresented_term_suid(final SubLObject v_term) {
        return (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) ? lookup_unrepresented_term_suid_fht(v_term) : lookup_unrepresented_term_suid_map(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 16379L)
    public static SubLObject find_unrepresented_term_by_suid(final SubLObject suid) {
        return lookup_unrepresented_term_by_suid(suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 16499L)
    public static SubLObject unrepresented_term_suid(final SubLObject v_term) {
        return lookup_unrepresented_term_suid(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 16593L)
    public static SubLObject kb_unrepresented_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(unrepresented_terms.NIL != kb_indexing_datastructures.indexed_unrepresented_term_p(v_object) && unrepresented_terms.NIL != unrepresented_term_suid(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 16735L)
    public static SubLObject register_unrepresented_term_suid(final SubLObject v_term, final SubLObject suid) {
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            register_unrepresented_term_suid_fht(v_term, suid);
        }
        else {
            register_unrepresented_term_suid_table(v_term, suid);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 17047L)
    public static SubLObject register_unrepresented_term_suid_new(final SubLObject v_term, final SubLObject suid, final SubLObject term_from_suid_id_index, final SubLObject term_to_suid_hashtable) {
        if (unrepresented_terms.NIL == use_unrepresented_term_fhtP()) {
            id_index.id_index_enter_unlocked(term_from_suid_id_index, suid, v_term);
            Hashtables.sethash(v_term, term_to_suid_hashtable, suid);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 17397L)
    public static SubLObject deregister_unrepresented_term_suid(final SubLObject suid) {
        return (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) ? deregister_unrepresented_term_suid_fht(suid) : deregister_unrepresented_term_suid_table(suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 17684L)
    public static SubLObject make_unrepresented_term_suid() {
        return (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) ? integer_sequence_generator.integer_sequence_generator_next(unrepresented_terms.$unrepresented_term_isg$.getGlobalValue()) : id_index.id_index_reserve(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 17969L)
    public static SubLObject next_unrepresented_term_suid() {
        return (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) ? get_kb_unrepresented_term_max_suid() : id_index.id_index_next_id(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 18265L)
    public static SubLObject find_or_create_unrepresented_term_suid(final SubLObject v_term) {
        SubLObject suid = unrepresented_term_suid(v_term);
        if (unrepresented_terms.NIL == suid) {
            suid = make_unrepresented_term_suid();
            register_unrepresented_term_suid(v_term, suid);
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 18529L)
    public static SubLObject finalize_unrepresented_terms(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == unrepresented_terms.UNPROVIDED) {
            max_unrepresented_term_id = (SubLObject)unrepresented_terms.NIL;
        }
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            setup_unrepresented_term_fht_new_space(max_unrepresented_term_id);
        }
        else {
            finalize_unrepresented_term_suid_table(max_unrepresented_term_id);
        }
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 18814L)
    public static SubLObject unrepresented_term_index(final SubLObject v_term) {
        final SubLObject suid = unrepresented_term_suid(v_term);
        return (SubLObject)((unrepresented_terms.NIL != suid) ? unrepresented_term_index_manager.lookup_unrepresented_term_index(suid) : unrepresented_terms.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 19039L)
    public static SubLObject unrepresented_term_index_swapped_inP(final SubLObject v_term) {
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 19311L)
    public static SubLObject setup_unrepresented_term_table(final SubLObject size, final SubLObject exactP) {
        if (size.numLE((SubLObject)unrepresented_terms.$int76$10000)) {
            unrepresented_terms.$use_fht_approach_to_unrepresented_termsP$.setGlobalValue((SubLObject)unrepresented_terms.NIL);
        }
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            setup_unrepresented_term_fht_new_space(size);
        }
        else {
            setup_unrepresented_term_suid_table(size, exactP);
        }
        unrepresented_term_index_manager.setup_unrepresented_term_index_table(size, exactP);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 19820L)
    public static SubLObject clear_unrepresented_term_table() {
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            clear_unrepresented_term_fht();
        }
        else {
            clear_unrepresented_term_suid_table();
        }
        unrepresented_term_index_manager.clear_unrepresented_term_index_table();
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 20048L)
    public static SubLObject reset_unrepresented_term_index(final SubLObject v_term, final SubLObject new_index, SubLObject bootstrapP) {
        if (bootstrapP == unrepresented_terms.UNPROVIDED) {
            bootstrapP = (SubLObject)unrepresented_terms.NIL;
        }
        if (unrepresented_terms.NIL == new_index) {
            final SubLObject suid = unrepresented_term_suid(v_term);
            if (unrepresented_terms.NIL != suid) {
                unrepresented_term_index_manager.deregister_unrepresented_term_index(suid);
                deregister_unrepresented_term_suid(suid);
            }
            return v_term;
        }
        final SubLObject suid = (unrepresented_terms.NIL != bootstrapP) ? find_or_create_unrepresented_term_suid(v_term) : unrepresented_term_suid(v_term);
        if (unrepresented_terms.NIL != suid) {
            unrepresented_term_index_manager.register_unrepresented_term_index(suid, new_index);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 20737L)
    public static SubLObject clear_unrepresented_term_index(final SubLObject v_term) {
        return reset_unrepresented_term_index(v_term, kb_indexing_datastructures.new_simple_index(), (SubLObject)unrepresented_terms.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 20912L)
    public static SubLObject remove_unrepresented_term_index(final SubLObject v_term) {
        return reset_unrepresented_term_index(v_term, (SubLObject)unrepresented_terms.NIL, (SubLObject)unrepresented_terms.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 21194L)
    public static SubLObject unrepresented_term_dump_id(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = unrepresented_term_suid(v_term);
        final SubLObject dump_table = unrepresented_terms.$unrepresented_term_dump_id_table$.getDynamicValue(thread);
        if (unrepresented_terms.NIL != dump_table) {
            id = id_index.id_index_lookup(dump_table, id, (SubLObject)unrepresented_terms.UNPROVIDED);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 21435L)
    public static SubLObject find_unrepresented_term_by_dump_id(final SubLObject dump_id) {
        return find_unrepresented_term_by_suid(dump_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 21547L)
    public static SubLObject with_unrepresented_term_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)unrepresented_terms.$sym26$CLET, (SubLObject)unrepresented_terms.$list77, ConsesLow.append(body, (SubLObject)unrepresented_terms.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 21727L)
    public static SubLObject create_unrepresented_term_dump_id_table() {
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            return create_unrepresented_term_dump_id_table_fht();
        }
        return id_index.new_indirect_compact_id_index(unrepresented_terms.$unrepresented_term_from_suid$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 22015L)
    public static SubLObject create_unrepresented_term_dump_id_table_fht() {
        final SubLObject valid_suid_keys = get_unrepresented_term_new_space_ascending_suid_keys();
        final SubLObject compact_id_space_size = compute_kb_unrepresented_term_count_fht(valid_suid_keys);
        final SubLObject v_id_index = id_index.new_id_index(compact_id_space_size, (SubLObject)unrepresented_terms.UNPROVIDED);
        final SubLObject suid_item = new_fht_suid_item();
        SubLObject compact_id = (SubLObject)unrepresented_terms.ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject suid;
        for (cdotimes_end_var = get_kb_unrepresented_term_old_space_size(), suid = (SubLObject)unrepresented_terms.NIL, suid = (SubLObject)unrepresented_terms.ZERO_INTEGER; suid.numL(cdotimes_end_var); suid = Numbers.add(suid, (SubLObject)unrepresented_terms.ONE_INTEGER)) {
            set_fht_suid_item(suid_item, suid);
            if (unrepresented_terms.NIL == deleted_unrepresented_term_itemP(suid_item)) {
                id_index.id_index_enter_unlocked(v_id_index, suid, compact_id);
                compact_id = Numbers.add(compact_id, (SubLObject)unrepresented_terms.ONE_INTEGER);
            }
        }
        SubLObject cdolist_list_var = valid_suid_keys;
        SubLObject suid_item_$24 = (SubLObject)unrepresented_terms.NIL;
        suid_item_$24 = cdolist_list_var.first();
        while (unrepresented_terms.NIL != cdolist_list_var) {
            final SubLObject suid2 = get_fht_suid_item_suid(suid_item_$24);
            id_index.id_index_enter_unlocked(v_id_index, suid2, compact_id);
            compact_id = Numbers.add(compact_id, (SubLObject)unrepresented_terms.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            suid_item_$24 = cdolist_list_var.first();
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23068L)
    public static SubLObject new_fht_term_item() {
        return (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_T, (SubLObject)unrepresented_terms.$kw80$MARKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23234L)
    public static SubLObject new_fht_suid_item() {
        return (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_S, (SubLObject)unrepresented_terms.$kw80$MARKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23302L)
    public static SubLObject fht_term_item_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && Characters.CHAR_T.eql(v_object.first()) && unrepresented_terms.NIL != cycl_grammar.cycl_unrepresented_term_p(v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23466L)
    public static SubLObject fht_suid_item_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && Characters.CHAR_S.eql(v_object.first()) && unrepresented_terms.NIL != subl_promotions.non_negative_integer_p(v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23627L)
    public static SubLObject get_fht_term_item_term(final SubLObject item) {
        return item.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23696L)
    public static SubLObject get_fht_suid_item_suid(final SubLObject item) {
        return item.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23765L)
    public static SubLObject set_fht_term_item(final SubLObject item, final SubLObject v_term) {
        ConsesLow.rplacd(item, v_term);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23850L)
    public static SubLObject set_fht_suid_item(final SubLObject item, final SubLObject suid) {
        ConsesLow.rplacd(item, suid);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 23934L)
    public static SubLObject deleted_unrepresented_term_itemP(final SubLObject item) {
        return is_unrepresented_term_tombstoneP(Hashtables.gethash_without_values(item, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), (SubLObject)unrepresented_terms.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 24108L)
    public static SubLObject is_unrepresented_term_tombstoneP(final SubLObject v_object) {
        return Equality.eq(unrepresented_terms.$unrepresented_terms_tombstone$.getGlobalValue(), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 24222L)
    public static SubLObject create_unrepresented_term_fht(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_item = new_fht_term_item();
        final SubLObject suid_item = new_fht_suid_item();
        final SubLObject message = Sequences.cconcatenate((SubLObject)unrepresented_terms.$str82$Creating_unrepresented_term_FHT_, format_nil.format_nil_a_no_copy(filename));
        SubLObject f_fht = (SubLObject)unrepresented_terms.NIL;
        f_fht = file_hash_table.fast_create_file_hash_table(filename, file_utilities.temp_directory(), (SubLObject)unrepresented_terms.EQUAL, (SubLObject)unrepresented_terms.$kw83$IMAGE_INDEPENDENT_CFASL);
        if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
            SubLObject msg = Sequences.cconcatenate(message, (SubLObject)unrepresented_terms.$str57$____Old_Space);
            SubLObject release = (SubLObject)unrepresented_terms.NIL;
            try {
                release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = get_unrepresented_term_fht();
                utilities_macros.$progress_note$.setDynamicValue(msg, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject continuation = (SubLObject)unrepresented_terms.NIL;
                        SubLObject next;
                        for (SubLObject completeP = (SubLObject)unrepresented_terms.NIL; unrepresented_terms.NIL == completeP; completeP = Types.sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)unrepresented_terms.NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (unrepresented_terms.NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject v_term = the_value;
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)unrepresented_terms.ONE_INTEGER), thread);
                                if (unrepresented_terms.NIL == deleted_unrepresented_term_itemP(key) && unrepresented_terms.NIL != fht_suid_item_p(key)) {
                                    final SubLObject suid = get_fht_suid_item_suid(key);
                                    set_fht_suid_item(suid_item, suid);
                                    file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term);
                                    set_fht_term_item(term_item, v_term);
                                    file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid);
                                }
                            }
                            continuation = next;
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (unrepresented_terms.NIL != release) {
                    Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = Sequences.cconcatenate(message, (SubLObject)unrepresented_terms.$str58$____New_Space);
            if (unrepresented_terms.NIL != use_unrepresented_term_fhtP()) {
                final SubLObject list_var = get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((unrepresented_terms.NIL != msg) ? msg : unrepresented_terms.$str59$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject suid_item_$26 = (SubLObject)unrepresented_terms.NIL;
                        suid_item_$26 = csome_list_var.first();
                        while (unrepresented_terms.NIL != csome_list_var) {
                            final SubLObject suid2 = get_fht_suid_item_suid(suid_item_$26);
                            final SubLObject v_term2 = find_unrepresented_term_by_suid(suid2);
                            set_fht_suid_item(suid_item, suid2);
                            file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term2);
                            set_fht_term_item(term_item, v_term2);
                            file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid2);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)unrepresented_terms.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item_$26 = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject table_var = do_unrepresented_terms_table();
                final SubLObject first_id_var = new_unrepresented_term_id_threshold();
                final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), first_id_var);
                SubLObject sofar = (SubLObject)unrepresented_terms.ZERO_INTEGER;
                final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(msg);
                        SubLObject v_term;
                        SubLObject suid;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id;
                        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)unrepresented_terms.NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                            v_term = id_index.id_index_lookup(table_var, id, (SubLObject)unrepresented_terms.UNPROVIDED);
                            if (unrepresented_terms.NIL != v_term) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                suid = unrepresented_term_suid(v_term);
                                set_fht_suid_item(suid_item, suid);
                                file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term);
                                set_fht_term_item(term_item, v_term);
                                file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        }
        else {
            final SubLObject idx = do_unrepresented_terms_table();
            final SubLObject mess = message;
            final SubLObject total2 = id_index.id_index_count(idx);
            SubLObject sofar2 = (SubLObject)unrepresented_terms.ZERO_INTEGER;
            assert unrepresented_terms.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)unrepresented_terms.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)unrepresented_terms.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)unrepresented_terms.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$29 = idx;
                    if (unrepresented_terms.NIL == id_index.id_index_objects_empty_p(idx_$29, (SubLObject)unrepresented_terms.$kw61$SKIP)) {
                        final SubLObject idx_$30 = idx_$29;
                        if (unrepresented_terms.NIL == id_index.id_index_dense_objects_empty_p(idx_$30, (SubLObject)unrepresented_terms.$kw61$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$30);
                            final SubLObject backwardP_var = (SubLObject)unrepresented_terms.NIL;
                            SubLObject suid;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject v_term3;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)unrepresented_terms.NIL, v_iteration = (SubLObject)unrepresented_terms.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unrepresented_terms.ONE_INTEGER)) {
                                suid = ((unrepresented_terms.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unrepresented_terms.ONE_INTEGER) : v_iteration);
                                v_term3 = Vectors.aref(vector_var, suid);
                                if (unrepresented_terms.NIL == id_index.id_index_tombstone_p(v_term3) || unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) {
                                    if (unrepresented_terms.NIL != id_index.id_index_tombstone_p(v_term3)) {
                                        v_term3 = (SubLObject)unrepresented_terms.$kw61$SKIP;
                                    }
                                    set_fht_suid_item(suid_item, suid);
                                    file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term3);
                                    set_fht_term_item(term_item, v_term3);
                                    file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid);
                                    sofar2 = Numbers.add(sofar2, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$31 = idx_$29;
                        if (unrepresented_terms.NIL == id_index.id_index_sparse_objects_empty_p(idx_$31) || unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$31);
                            SubLObject suid3 = id_index.id_index_sparse_id_threshold(idx_$31);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$31);
                            final SubLObject v_default = (SubLObject)((unrepresented_terms.NIL != id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP)) ? unrepresented_terms.NIL : unrepresented_terms.$kw61$SKIP);
                            while (suid3.numL(end_id)) {
                                final SubLObject v_term2 = Hashtables.gethash_without_values(suid3, sparse, v_default);
                                if (unrepresented_terms.NIL == id_index.id_index_skip_tombstones_p((SubLObject)unrepresented_terms.$kw61$SKIP) || unrepresented_terms.NIL == id_index.id_index_tombstone_p(v_term2)) {
                                    set_fht_suid_item(suid_item, suid3);
                                    file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term2);
                                    set_fht_term_item(term_item, v_term2);
                                    file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid3);
                                    sofar2 = Numbers.add(sofar2, (SubLObject)unrepresented_terms.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                                suid3 = Numbers.add(suid3, (SubLObject)unrepresented_terms.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)unrepresented_terms.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        file_hash_table.finalize_fast_create_file_hash_table(f_fht, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED);
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 24962L)
    public static SubLObject initialize_unrepresented_term_caches() {
        final SubLObject fht_file = misc_utilities.get_hl_store_cache_filename((SubLObject)unrepresented_terms.$str84$unrepresented_terms, (SubLObject)unrepresented_terms.$str85$fht);
        if (unrepresented_terms.NIL != Filesys.probe_file(fht_file)) {
            initialize_unrepresented_term_cache_fht(fht_file);
            return (SubLObject)unrepresented_terms.$kw86$INITIALIZED;
        }
        return (SubLObject)unrepresented_terms.$kw87$UNINITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 25250L)
    public static SubLObject initialize_unrepresented_term_cache_fht(final SubLObject fht_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)unrepresented_terms.NIL;
        try {
            release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
            if (unrepresented_terms.NIL != file_hash_table.file_hash_table_p(unrepresented_terms.$unrepresented_term_fht$.getGlobalValue())) {
                SubLObject ignore_errors_tag = (SubLObject)unrepresented_terms.NIL;
                try {
                    thread.throwStack.push(unrepresented_terms.$kw88$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)unrepresented_terms.$sym89$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            file_hash_table.finalize_file_hash_table(unrepresented_terms.$unrepresented_term_fht$.getGlobalValue());
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)unrepresented_terms.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)unrepresented_terms.$kw88$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            reconnect_unrepresented_term_fht(fht_file);
        }
        finally {
            if (unrepresented_terms.NIL != release) {
                Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
            }
        }
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 25569L)
    public static SubLObject reconnect_unrepresented_term_fht(final SubLObject filename) {
        unrepresented_terms.$unrepresented_term_fht$.setGlobalValue(file_hash_table.open_file_hash_table_read_only(filename, (SubLObject)unrepresented_terms.EQUAL, (SubLObject)unrepresented_terms.$kw83$IMAGE_INDEPENDENT_CFASL));
        return file_hash_table.file_hash_table_p(unrepresented_terms.$unrepresented_term_fht$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 25994L)
    public static SubLObject setup_unrepresented_term_fht_new_space(final SubLObject max_suid) {
        unrepresented_terms.$unrepresented_term_isg$.setGlobalValue(integer_sequence_generator.new_integer_sequence_generator(max_suid, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED));
        return max_suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 26158L)
    public static SubLObject clear_unrepresented_term_fht() {
        unrepresented_terms.$unrepresented_term_fht$.setGlobalValue((SubLObject)unrepresented_terms.NIL);
        unrepresented_terms.$unrepresented_term_change_set$.setGlobalValue(Hashtables.make_hash_table((SubLObject)unrepresented_terms.TEN_INTEGER, (SubLObject)unrepresented_terms.EQUAL, (SubLObject)unrepresented_terms.UNPROVIDED));
        unrepresented_terms.$unrepresented_term_isg$.setGlobalValue(integer_sequence_generator.new_integer_sequence_generator((SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED, (SubLObject)unrepresented_terms.UNPROVIDED));
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 26398L)
    public static SubLObject lookup_unrepresented_term_by_suid_fht(final SubLObject suid) {
        final SubLObject suid_key = set_fht_suid_item(new_fht_suid_item(), suid);
        SubLObject v_term = Hashtables.gethash_without_values(suid_key, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), (SubLObject)unrepresented_terms.UNPROVIDED);
        if (v_term.eql(unrepresented_terms.$unrepresented_terms_tombstone$.getGlobalValue())) {
            return (SubLObject)unrepresented_terms.NIL;
        }
        if (unrepresented_terms.NIL == v_term && unrepresented_terms.NIL != is_unrepresented_term_suid_old_spaceP(suid) && unrepresented_terms.NIL != file_hash_table.file_hash_table_p(unrepresented_terms.$unrepresented_term_fht$.getGlobalValue())) {
            SubLObject release = (SubLObject)unrepresented_terms.NIL;
            try {
                release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                v_term = file_hash_table.get_file_hash_table(suid_key, unrepresented_terms.$unrepresented_term_fht$.getGlobalValue(), (SubLObject)unrepresented_terms.UNPROVIDED);
            }
            finally {
                if (unrepresented_terms.NIL != release) {
                    Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 27190L)
    public static SubLObject lookup_unrepresented_term_suid_fht(final SubLObject v_term) {
        final SubLObject term_key = set_fht_term_item(new_fht_term_item(), v_term);
        SubLObject suid = Hashtables.gethash_without_values(term_key, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), (SubLObject)unrepresented_terms.UNPROVIDED);
        if (suid.eql(unrepresented_terms.$unrepresented_terms_tombstone$.getGlobalValue())) {
            return (SubLObject)unrepresented_terms.NIL;
        }
        if (unrepresented_terms.NIL == suid && unrepresented_terms.NIL != file_hash_table.file_hash_table_p(unrepresented_terms.$unrepresented_term_fht$.getGlobalValue())) {
            SubLObject release = (SubLObject)unrepresented_terms.NIL;
            try {
                release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                suid = file_hash_table.get_file_hash_table(term_key, unrepresented_terms.$unrepresented_term_fht$.getGlobalValue(), (SubLObject)unrepresented_terms.UNPROVIDED);
            }
            finally {
                if (unrepresented_terms.NIL != release) {
                    Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 27902L)
    public static SubLObject get_unrepresented_term_min_new_suid() {
        return integer_sequence_generator.get_integer_sequence_generator_start(unrepresented_terms.$unrepresented_term_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 28034L)
    public static SubLObject is_unrepresented_term_suid_old_spaceP(final SubLObject suid) {
        return Numbers.numL(suid, get_unrepresented_term_min_new_suid());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 28242L)
    public static SubLObject register_unrepresented_term_suid_fht(final SubLObject v_term, final SubLObject suid) {
        Hashtables.sethash(set_fht_suid_item(new_fht_suid_item(), suid), unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), v_term);
        Hashtables.sethash(set_fht_term_item(new_fht_term_item(), v_term), unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), suid);
        return (SubLObject)unrepresented_terms.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 28507L)
    public static SubLObject deregister_unrepresented_term_suid_fht(final SubLObject suid) {
        final SubLObject v_term = lookup_unrepresented_term_by_suid_fht(suid);
        if (unrepresented_terms.NIL != v_term) {
            final SubLObject suid_key = set_fht_suid_item(new_fht_suid_item(), suid);
            final SubLObject term_key = set_fht_term_item(new_fht_term_item(), v_term);
            if (unrepresented_terms.NIL != is_unrepresented_term_suid_old_spaceP(suid)) {
                Hashtables.sethash(suid_key, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), unrepresented_terms.$unrepresented_terms_tombstone$.getGlobalValue());
                Hashtables.sethash(term_key, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue(), unrepresented_terms.$unrepresented_terms_tombstone$.getGlobalValue());
            }
            else {
                Hashtables.remhash(suid_key, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue());
                Hashtables.remhash(term_key, unrepresented_terms.$unrepresented_term_change_set$.getGlobalValue());
            }
        }
        return list_utilities.sublisp_boolean(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 29335L)
    public static SubLObject get_unrepresented_term_new_space_suid_keys() {
        final SubLObject change_set = get_unrepresented_term_change_set();
        SubLObject keys = (SubLObject)unrepresented_terms.NIL;
        if (unrepresented_terms.NIL != change_set) {
            SubLObject key = (SubLObject)unrepresented_terms.NIL;
            SubLObject value = (SubLObject)unrepresented_terms.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(change_set);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    if (unrepresented_terms.NIL != fht_suid_item_p(key) && unrepresented_terms.NIL == is_unrepresented_term_tombstoneP(value)) {
                        keys = (SubLObject)ConsesLow.cons(key, keys);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unrepresented-terms.lisp", position = 29658L)
    public static SubLObject get_unrepresented_term_new_space_ascending_suid_keys() {
        return Sort.sort(get_unrepresented_term_new_space_suid_keys(), (SubLObject)unrepresented_terms.$sym90$_, (SubLObject)unrepresented_terms.$sym27$GET_FHT_SUID_ITEM_SUID);
    }
    
    public static SubLObject declare_unrepresented_terms_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_old_unrepresented_terms", "DO-OLD-UNREPRESENTED-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_new_unrepresented_ids_and_terms", "DO-NEW-UNREPRESENTED-IDS-AND-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_unrepresented_ids_and_terms", "DO-UNREPRESENTED-IDS-AND-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_new_unrepresented_terms", "DO-NEW-UNREPRESENTED-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_kb_unrepresented_terms", "DO-KB-UNREPRESENTED-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_kb_strings", "DO-KB-STRINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "do_kb_numbers", "DO-KB-NUMBERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "setup_unrepresented_term_suid_table", "SETUP-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "finalize_unrepresented_term_suid_table", "FINALIZE-UNREPRESENTED-TERM-SUID-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "clear_unrepresented_term_suid_table", "CLEAR-UNREPRESENTED-TERM-SUID-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "set_next_unrepresented_term_suid", "SET-NEXT-UNREPRESENTED-TERM-SUID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "lookup_unrepresented_term_by_suid_table", "LOOKUP-UNREPRESENTED-TERM-BY-SUID-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "lookup_unrepresented_term_suid_map", "LOOKUP-UNREPRESENTED-TERM-SUID-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "register_unrepresented_term_suid_table", "REGISTER-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "deregister_unrepresented_term_suid_table", "DEREGISTER-UNREPRESENTED-TERM-SUID-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "use_unrepresented_term_fhtP", "USE-UNREPRESENTED-TERM-FHT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_unrepresented_term_fht", "GET-UNREPRESENTED-TERM-FHT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_unrepresented_term_change_set", "GET-UNREPRESENTED-TERM-CHANGE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_unrepresented_terms_iterator", "NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "construct_unrepresented_terms_fht_based_iterator", "CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "do_unrepresented_terms_table", "DO-UNREPRESENTED-TERMS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "map_unrepresented_terms", "MAP-UNREPRESENTED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_new_unrepresented_terms_iterator", "NEW-NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_unrepresented_terms_table_entryP", "NEW-UNREPRESENTED-TERMS-TABLE-ENTRY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "unrepresented_terms_table_tuple_to_unrepresented_term", "UNREPRESENTED-TERMS-TABLE-TUPLE-TO-UNREPRESENTED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "deleted_unrepresented_term_id_iterator", "DELETED-UNREPRESENTED-TERM-ID-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "has_new_unrepresented_termsP", "HAS-NEW-UNREPRESENTED-TERMS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "kb_unrepresented_term_count", "KB-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_unrepresented_term_id_threshold", "NEW-UNREPRESENTED-TERM-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "set_new_unrepresented_term_id_threshold", "SET-NEW-UNREPRESENTED-TERM-ID-THRESHOLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "old_unrepresented_term_count", "OLD-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_unrepresented_term_count", "NEW-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "compute_kb_unrepresented_term_count_fht", "COMPUTE-KB-UNREPRESENTED-TERM-COUNT-FHT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_kb_unrepresented_term_old_space_size", "GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_kb_unrepresented_term_raw_new_space_size", "GET-KB-UNREPRESENTED-TERM-RAW-NEW-SPACE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_kb_unrepresented_term_max_suid", "GET-KB-UNREPRESENTED-TERM-MAX-SUID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "lookup_unrepresented_term_by_suid", "LOOKUP-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "lookup_unrepresented_term_suid", "LOOKUP-UNREPRESENTED-TERM-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "find_unrepresented_term_by_suid", "FIND-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "unrepresented_term_suid", "UNREPRESENTED-TERM-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "kb_unrepresented_term_p", "KB-UNREPRESENTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "register_unrepresented_term_suid", "REGISTER-UNREPRESENTED-TERM-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "register_unrepresented_term_suid_new", "REGISTER-UNREPRESENTED-TERM-SUID-NEW", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "deregister_unrepresented_term_suid", "DEREGISTER-UNREPRESENTED-TERM-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "make_unrepresented_term_suid", "MAKE-UNREPRESENTED-TERM-SUID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "next_unrepresented_term_suid", "NEXT-UNREPRESENTED-TERM-SUID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "find_or_create_unrepresented_term_suid", "FIND-OR-CREATE-UNREPRESENTED-TERM-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "finalize_unrepresented_terms", "FINALIZE-UNREPRESENTED-TERMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "unrepresented_term_index", "UNREPRESENTED-TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "unrepresented_term_index_swapped_inP", "UNREPRESENTED-TERM-INDEX-SWAPPED-IN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "setup_unrepresented_term_table", "SETUP-UNREPRESENTED-TERM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "clear_unrepresented_term_table", "CLEAR-UNREPRESENTED-TERM-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "reset_unrepresented_term_index", "RESET-UNREPRESENTED-TERM-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "clear_unrepresented_term_index", "CLEAR-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "remove_unrepresented_term_index", "REMOVE-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "unrepresented_term_dump_id", "UNREPRESENTED-TERM-DUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "find_unrepresented_term_by_dump_id", "FIND-UNREPRESENTED-TERM-BY-DUMP-ID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unrepresented_terms", "with_unrepresented_term_dump_id_table", "WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "create_unrepresented_term_dump_id_table", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "create_unrepresented_term_dump_id_table_fht", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE-FHT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_fht_term_item", "NEW-FHT-TERM-ITEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "new_fht_suid_item", "NEW-FHT-SUID-ITEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "fht_term_item_p", "FHT-TERM-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "fht_suid_item_p", "FHT-SUID-ITEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_fht_term_item_term", "GET-FHT-TERM-ITEM-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_fht_suid_item_suid", "GET-FHT-SUID-ITEM-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "set_fht_term_item", "SET-FHT-TERM-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "set_fht_suid_item", "SET-FHT-SUID-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "deleted_unrepresented_term_itemP", "DELETED-UNREPRESENTED-TERM-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "is_unrepresented_term_tombstoneP", "IS-UNREPRESENTED-TERM-TOMBSTONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "create_unrepresented_term_fht", "CREATE-UNREPRESENTED-TERM-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "initialize_unrepresented_term_caches", "INITIALIZE-UNREPRESENTED-TERM-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "initialize_unrepresented_term_cache_fht", "INITIALIZE-UNREPRESENTED-TERM-CACHE-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "reconnect_unrepresented_term_fht", "RECONNECT-UNREPRESENTED-TERM-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "setup_unrepresented_term_fht_new_space", "SETUP-UNREPRESENTED-TERM-FHT-NEW-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "clear_unrepresented_term_fht", "CLEAR-UNREPRESENTED-TERM-FHT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "lookup_unrepresented_term_by_suid_fht", "LOOKUP-UNREPRESENTED-TERM-BY-SUID-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "lookup_unrepresented_term_suid_fht", "LOOKUP-UNREPRESENTED-TERM-SUID-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_unrepresented_term_min_new_suid", "GET-UNREPRESENTED-TERM-MIN-NEW-SUID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "is_unrepresented_term_suid_old_spaceP", "IS-UNREPRESENTED-TERM-SUID-OLD-SPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "register_unrepresented_term_suid_fht", "REGISTER-UNREPRESENTED-TERM-SUID-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "deregister_unrepresented_term_suid_fht", "DEREGISTER-UNREPRESENTED-TERM-SUID-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_unrepresented_term_new_space_suid_keys", "GET-UNREPRESENTED-TERM-NEW-SPACE-SUID-KEYS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unrepresented_terms", "get_unrepresented_term_new_space_ascending_suid_keys", "GET-UNREPRESENTED-TERM-NEW-SPACE-ASCENDING-SUID-KEYS", 0, 0, false);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    public static SubLObject init_unrepresented_terms_file() {
        unrepresented_terms.$unrepresented_term_to_suid$ = SubLFiles.deflexical("*UNREPRESENTED-TERM-TO-SUID*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym54$_UNREPRESENTED_TERM_TO_SUID_, unrepresented_terms.$unrepresented_term_to_suid$, unrepresented_terms.NIL)));
        unrepresented_terms.$unrepresented_term_from_suid$ = SubLFiles.deflexical("*UNREPRESENTED-TERM-FROM-SUID*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym55$_UNREPRESENTED_TERM_FROM_SUID_, unrepresented_terms.$unrepresented_term_from_suid$, unrepresented_terms.NIL)));
        unrepresented_terms.$use_fht_approach_to_unrepresented_termsP$ = SubLFiles.deflexical("*USE-FHT-APPROACH-TO-UNREPRESENTED-TERMS?*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym62$_USE_FHT_APPROACH_TO_UNREPRESENTED_TERMS__, unrepresented_terms.$use_fht_approach_to_unrepresented_termsP$, unrepresented_terms.NIL)));
        unrepresented_terms.$unrepresented_term_fht$ = SubLFiles.deflexical("*UNREPRESENTED-TERM-FHT*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym63$_UNREPRESENTED_TERM_FHT_, unrepresented_terms.$unrepresented_term_fht$, unrepresented_terms.NIL)));
        unrepresented_terms.$unrepresented_term_isg$ = SubLFiles.deflexical("*UNREPRESENTED-TERM-ISG*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym64$_UNREPRESENTED_TERM_ISG_, unrepresented_terms.$unrepresented_term_isg$, unrepresented_terms.NIL)));
        unrepresented_terms.$unrepresented_term_change_set$ = SubLFiles.deflexical("*UNREPRESENTED-TERM-CHANGE-SET*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym65$_UNREPRESENTED_TERM_CHANGE_SET_, unrepresented_terms.$unrepresented_term_change_set$, unrepresented_terms.NIL)));
        unrepresented_terms.$unrepresented_term_fht_lock$ = SubLFiles.deflexical("*UNREPRESENTED-TERM-FHT-LOCK*", maybeDefault((SubLObject)unrepresented_terms.$sym66$_UNREPRESENTED_TERM_FHT_LOCK_, unrepresented_terms.$unrepresented_term_fht_lock$, ()->(Locks.make_lock((SubLObject)unrepresented_terms.$str67$Unrepresented_Terms_FHT_Lock))));
        unrepresented_terms.$unrepresented_terms_tombstone$ = SubLFiles.deflexical("*UNREPRESENTED-TERMS-TOMBSTONE*", (SubLObject)unrepresented_terms.$kw68$DELETED);
        unrepresented_terms.$new_unrepresented_term_id_threshold$ = SubLFiles.deflexical("*NEW-UNREPRESENTED-TERM-ID-THRESHOLD*", (SubLObject)(maybeDefault((SubLObject)unrepresented_terms.$sym75$_NEW_UNREPRESENTED_TERM_ID_THRESHOLD_, unrepresented_terms.$new_unrepresented_term_id_threshold$, unrepresented_terms.NIL)));
        unrepresented_terms.$unrepresented_term_dump_id_table$ = SubLFiles.defparameter("*UNREPRESENTED-TERM-DUMP-ID-TABLE*", (SubLObject)unrepresented_terms.NIL);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    public static SubLObject setup_unrepresented_terms_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym54$_UNREPRESENTED_TERM_TO_SUID_);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym55$_UNREPRESENTED_TERM_FROM_SUID_);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym62$_USE_FHT_APPROACH_TO_UNREPRESENTED_TERMS__);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym63$_UNREPRESENTED_TERM_FHT_);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym64$_UNREPRESENTED_TERM_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym65$_UNREPRESENTED_TERM_CHANGE_SET_);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym66$_UNREPRESENTED_TERM_FHT_LOCK_);
        access_macros.register_macro_helper((SubLObject)unrepresented_terms.$sym70$DO_UNREPRESENTED_TERMS_TABLE, (SubLObject)unrepresented_terms.$sym49$DO_KB_UNREPRESENTED_TERMS);
        utilities_macros.note_funcall_helper_function((SubLObject)unrepresented_terms.$sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_);
        utilities_macros.note_funcall_helper_function((SubLObject)unrepresented_terms.$sym72$UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM);
        subl_macro_promotions.declare_defglobal((SubLObject)unrepresented_terms.$sym75$_NEW_UNREPRESENTED_TERM_ID_THRESHOLD_);
        access_macros.register_macro_helper((SubLObject)unrepresented_terms.$sym78$CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE, (SubLObject)unrepresented_terms.$sym79$WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE);
        access_macros.register_external_symbol((SubLObject)unrepresented_terms.$sym81$CREATE_UNREPRESENTED_TERM_FHT);
        return (SubLObject)unrepresented_terms.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_unrepresented_terms_file();
    }
    
    @Override
	public void initializeVariables() {
        init_unrepresented_terms_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_unrepresented_terms_file();
    }
    
    static {
        me = (SubLFile)new unrepresented_terms();
        unrepresented_terms.$unrepresented_term_to_suid$ = null;
        unrepresented_terms.$unrepresented_term_from_suid$ = null;
        unrepresented_terms.$use_fht_approach_to_unrepresented_termsP$ = null;
        unrepresented_terms.$unrepresented_term_fht$ = null;
        unrepresented_terms.$unrepresented_term_isg$ = null;
        unrepresented_terms.$unrepresented_term_change_set$ = null;
        unrepresented_terms.$unrepresented_term_fht_lock$ = null;
        unrepresented_terms.$unrepresented_terms_tombstone$ = null;
        unrepresented_terms.$new_unrepresented_term_id_threshold$ = null;
        unrepresented_terms.$unrepresented_term_dump_id_table$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNREPRESENTED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-UNREPRESENTED-TERM-FHT?"));
        $sym7$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-FHT-LOCK*"));
        $sym9$DO_PRISTINE_FILE_HASH_TABLE_KEYS = SubLObjectFactory.makeSymbol("DO-PRISTINE-FILE-HASH-TABLE-KEYS");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNREPRESENTED-TERM-FHT"));
        $kw11$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym12$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym13$FHT_TERM_ITEM_P = SubLObjectFactory.makeSymbol("FHT-TERM-ITEM-P");
        $sym14$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym15$DELETED_UNREPRESENTED_TERM_ITEM_ = SubLObjectFactory.makeSymbol("DELETED-UNREPRESENTED-TERM-ITEM?");
        $sym16$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym17$GET_FHT_TERM_ITEM_TERM = SubLObjectFactory.makeSymbol("GET-FHT-TERM-ITEM-TERM");
        $sym18$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-UNREPRESENTED-TERMS-TABLE"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-UNREPRESENTED-TERM-ID-THRESHOLD"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc unrepresented terms")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str22$mapping_Cyc_unrepresented_terms = SubLObjectFactory.makeString("mapping Cyc unrepresented terms");
        $sym23$SUID_ITEM = SubLObjectFactory.makeUninternedSymbol("SUID-ITEM");
        $sym24$PROGRESS_CDOLIST = SubLObjectFactory.makeSymbol("PROGRESS-CDOLIST");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNREPRESENTED-TERM-NEW-SPACE-ASCENDING-SUID-KEYS"));
        $sym26$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym27$GET_FHT_SUID_ITEM_SUID = SubLObjectFactory.makeSymbol("GET-FHT-SUID-ITEM-SUID");
        $sym28$FIND_UNREPRESENTED_TERM_BY_SUID = SubLObjectFactory.makeSymbol("FIND-UNREPRESENTED-TERM-BY-SUID");
        $sym29$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");
        $sym30$UNREPRESENTED_TERM_SUID = SubLObjectFactory.makeSymbol("UNREPRESENTED-TERM-SUID");
        $sym31$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym32$MSG = SubLObjectFactory.makeUninternedSymbol("MSG");
        $sym33$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" -- Old Space"));
        $sym35$DO_PRISTINE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-PRISTINE-FILE-HASH-TABLE");
        $sym36$FHT_SUID_ITEM_P = SubLObjectFactory.makeSymbol("FHT-SUID-ITEM-P");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" -- New Space"));
        $sym38$DO_NEW_UNREPRESENTED_IDS_AND_TERMS = SubLObjectFactory.makeSymbol("DO-NEW-UNREPRESENTED-IDS-AND-TERMS");
        $sym39$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $kw40$ORDERED = SubLObjectFactory.makeKeyword("ORDERED");
        $sym41$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym42$SUID_ITEM = SubLObjectFactory.makeUninternedSymbol("SUID-ITEM");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc unrepresented terms")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym45$DO_UNREPRESENTED_IDS_AND_TERMS = SubLObjectFactory.makeSymbol("DO-UNREPRESENTED-IDS-AND-TERMS");
        $sym46$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc strings")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str48$mapping_Cyc_strings = SubLObjectFactory.makeString("mapping Cyc strings");
        $sym49$DO_KB_UNREPRESENTED_TERMS = SubLObjectFactory.makeSymbol("DO-KB-UNREPRESENTED-TERMS");
        $sym50$SUBL_STRING_P = SubLObjectFactory.makeSymbol("SUBL-STRING-P");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc numbers")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str52$mapping_Cyc_numbers = SubLObjectFactory.makeString("mapping Cyc numbers");
        $sym53$SUBL_REAL_NUMBER_P = SubLObjectFactory.makeSymbol("SUBL-REAL-NUMBER-P");
        $sym54$_UNREPRESENTED_TERM_TO_SUID_ = SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-TO-SUID*");
        $sym55$_UNREPRESENTED_TERM_FROM_SUID_ = SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-FROM-SUID*");
        $str56$Determining_maximum_unrepresented = SubLObjectFactory.makeString("Determining maximum unrepresented-term SUID");
        $str57$____Old_Space = SubLObjectFactory.makeString(" -- Old Space");
        $str58$____New_Space = SubLObjectFactory.makeString(" -- New Space");
        $str59$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym60$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw61$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym62$_USE_FHT_APPROACH_TO_UNREPRESENTED_TERMS__ = SubLObjectFactory.makeSymbol("*USE-FHT-APPROACH-TO-UNREPRESENTED-TERMS?*");
        $sym63$_UNREPRESENTED_TERM_FHT_ = SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-FHT*");
        $sym64$_UNREPRESENTED_TERM_ISG_ = SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-ISG*");
        $sym65$_UNREPRESENTED_TERM_CHANGE_SET_ = SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-CHANGE-SET*");
        $sym66$_UNREPRESENTED_TERM_FHT_LOCK_ = SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-FHT-LOCK*");
        $str67$Unrepresented_Terms_FHT_Lock = SubLObjectFactory.makeString("Unrepresented Terms FHT Lock");
        $kw68$DELETED = SubLObjectFactory.makeKeyword("DELETED");
        $str69$Not_yet_implemented_ = SubLObjectFactory.makeString("Not yet implemented.");
        $sym70$DO_UNREPRESENTED_TERMS_TABLE = SubLObjectFactory.makeSymbol("DO-UNREPRESENTED-TERMS-TABLE");
        $sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_ = SubLObjectFactory.makeSymbol("NEW-UNREPRESENTED-TERMS-TABLE-ENTRY?");
        $sym72$UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM = SubLObjectFactory.makeSymbol("UNREPRESENTED-TERMS-TABLE-TUPLE-TO-UNREPRESENTED-TERM");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $kw74$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym75$_NEW_UNREPRESENTED_TERM_ID_THRESHOLD_ = SubLObjectFactory.makeSymbol("*NEW-UNREPRESENTED-TERM-ID-THRESHOLD*");
        $int76$10000 = SubLObjectFactory.makeInteger(10000);
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNREPRESENTED-TERM-DUMP-ID-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE"))));
        $sym78$CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE");
        $sym79$WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");
        $kw80$MARKER = SubLObjectFactory.makeKeyword("MARKER");
        $sym81$CREATE_UNREPRESENTED_TERM_FHT = SubLObjectFactory.makeSymbol("CREATE-UNREPRESENTED-TERM-FHT");
        $str82$Creating_unrepresented_term_FHT_ = SubLObjectFactory.makeString("Creating unrepresented term FHT ");
        $kw83$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $str84$unrepresented_terms = SubLObjectFactory.makeString("unrepresented-terms");
        $str85$fht = SubLObjectFactory.makeString("fht");
        $kw86$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $kw87$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw88$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym89$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym90$_ = SubLObjectFactory.makeSymbol("<");
    }
}

/*

	Total time: 999 ms
	
*/