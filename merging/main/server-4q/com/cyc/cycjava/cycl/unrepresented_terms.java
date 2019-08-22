/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_enter_unlocked;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_missing_ids;
import static com.cyc.cycjava.cycl.id_index.id_index_new_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_old_and_new_object_counts;
import static com.cyc.cycjava.cycl.id_index.id_index_p;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.id_index.new_id_index_ordered_iterator;
import static com.cyc.cycjava.cycl.id_index.new_id_index_values_iterator;
import static com.cyc.cycjava.cycl.id_index.new_indirect_compact_id_index;
import static com.cyc.cycjava.cycl.id_index.optimize_id_index;
import static com.cyc.cycjava.cycl.id_index.set_id_index_next_id;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_unrepresented_term_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.new_simple_index;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.unrepresented_term_index_manager.clear_unrepresented_term_index_table;
import static com.cyc.cycjava.cycl.unrepresented_term_index_manager.deregister_unrepresented_term_index;
import static com.cyc.cycjava.cycl.unrepresented_term_index_manager.lookup_unrepresented_term_index;
import static com.cyc.cycjava.cycl.unrepresented_term_index_manager.register_unrepresented_term_index;
import static com.cyc.cycjava.cycl.unrepresented_term_index_manager.setup_unrepresented_term_index_table;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      UNREPRESENTED-TERMS
 * source file: /cyc/top/cycl/unrepresented-terms.lisp
 * created:     2019/07/03 17:37:21
 */
public final class unrepresented_terms extends SubLTranslatedFile implements V12 {
    public static final SubLObject unrepresented_term_tables_setupP() {
        return makeBoolean((NIL != id_index_p($unrepresented_term_from_suid$.getGlobalValue())) && $unrepresented_term_to_suid$.getGlobalValue().isHashtable());
    }

    public static final SubLObject new_unrepresented_term_suid_threshold() {
        return id_index_new_id_threshold($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static final SubLFile me = new unrepresented_terms();

 public static final String myName = "com.cyc.cycjava.cycl.unrepresented_terms";




    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unrepresented_terms_tombstone$ = makeSymbol("*UNREPRESENTED-TERMS-TOMBSTONE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $unrepresented_term_dump_id_table$ = makeSymbol("*UNREPRESENTED-TERM-DUMP-ID-TABLE*");

    private static final SubLList $list0 = list(list(makeSymbol("UNREPRESENTED-TERM"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLList $list6 = list(makeSymbol("USE-UNREPRESENTED-TERM-FHT?"));

    private static final SubLList $list8 = list(makeSymbol("*UNREPRESENTED-TERM-FHT-LOCK*"));

    private static final SubLSymbol DO_PRISTINE_FILE_HASH_TABLE_KEYS = makeSymbol("DO-PRISTINE-FILE-HASH-TABLE-KEYS");

    static private final SubLList $list10 = list(makeSymbol("GET-UNREPRESENTED-TERM-FHT"));

    private static final SubLSymbol FHT_TERM_ITEM_P = makeSymbol("FHT-TERM-ITEM-P");

    private static final SubLSymbol $sym15$DELETED_UNREPRESENTED_TERM_ITEM_ = makeSymbol("DELETED-UNREPRESENTED-TERM-ITEM?");

    private static final SubLSymbol GET_FHT_TERM_ITEM_TERM = makeSymbol("GET-FHT-TERM-ITEM-TERM");

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLList $list19 = list(makeSymbol("DO-UNREPRESENTED-TERMS-TABLE"));

    private static final SubLList $list20 = list(makeSymbol("NEW-UNREPRESENTED-TERM-ID-THRESHOLD"));

    static private final SubLList $list21 = list(list(makeSymbol("ID"), makeSymbol("TERM"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc unrepresented terms")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$mapping_Cyc_unrepresented_terms = makeString("mapping Cyc unrepresented terms");

    private static final SubLSymbol $sym23$SUID_ITEM = makeUninternedSymbol("SUID-ITEM");

    private static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

    private static final SubLList $list25 = list(makeSymbol("GET-UNREPRESENTED-TERM-NEW-SPACE-ASCENDING-SUID-KEYS"));

    private static final SubLSymbol GET_FHT_SUID_ITEM_SUID = makeSymbol("GET-FHT-SUID-ITEM-SUID");

    private static final SubLSymbol FIND_UNREPRESENTED_TERM_BY_SUID = makeSymbol("FIND-UNREPRESENTED-TERM-BY-SUID");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");

    private static final SubLSymbol UNREPRESENTED_TERM_SUID = makeSymbol("UNREPRESENTED-TERM-SUID");

    private static final SubLSymbol $sym31$KEY = makeUninternedSymbol("KEY");

    private static final SubLSymbol $sym32$MSG = makeUninternedSymbol("MSG");

    private static final SubLList $list34 = list(makeString(" -- Old Space"));

    private static final SubLSymbol DO_PRISTINE_FILE_HASH_TABLE = makeSymbol("DO-PRISTINE-FILE-HASH-TABLE");

    private static final SubLSymbol FHT_SUID_ITEM_P = makeSymbol("FHT-SUID-ITEM-P");

    private static final SubLList $list37 = list(makeString(" -- New Space"));

    private static final SubLSymbol DO_NEW_UNREPRESENTED_IDS_AND_TERMS = makeSymbol("DO-NEW-UNREPRESENTED-IDS-AND-TERMS");

    private static final SubLSymbol $sym41$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol $sym42$SUID_ITEM = makeUninternedSymbol("SUID-ITEM");

    private static final SubLList $list43 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc unrepresented terms")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym44$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_UNREPRESENTED_IDS_AND_TERMS = makeSymbol("DO-UNREPRESENTED-IDS-AND-TERMS");

    private static final SubLList $list47 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc strings")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$mapping_Cyc_strings = makeString("mapping Cyc strings");

    private static final SubLSymbol DO_KB_UNREPRESENTED_TERMS = makeSymbol("DO-KB-UNREPRESENTED-TERMS");

    private static final SubLSymbol SUBL_STRING_P = makeSymbol("SUBL-STRING-P");

    private static final SubLList $list51 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc numbers")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$mapping_Cyc_numbers = makeString("mapping Cyc numbers");

    private static final SubLSymbol SUBL_REAL_NUMBER_P = makeSymbol("SUBL-REAL-NUMBER-P");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    public static final SubLSymbol $unrepresented_term_to_suid$ = makeSymbol("*UNREPRESENTED-TERM-TO-SUID*");

    public static final SubLSymbol $unrepresented_term_from_suid$ = makeSymbol("*UNREPRESENTED-TERM-FROM-SUID*");

    private static final SubLString $str56$Determining_maximum_unrepresented = makeString("Determining maximum unrepresented-term SUID");

    private static final SubLString $str57$____Old_Space = makeString(" -- Old Space");

    private static final SubLString $str58$____New_Space = makeString(" -- New Space");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $use_fht_approach_to_unrepresented_termsP$ = makeSymbol("*USE-FHT-APPROACH-TO-UNREPRESENTED-TERMS?*");

    public static final SubLSymbol $unrepresented_term_fht$ = makeSymbol("*UNREPRESENTED-TERM-FHT*");

    public static final SubLSymbol $unrepresented_term_isg$ = makeSymbol("*UNREPRESENTED-TERM-ISG*");

    public static final SubLSymbol $unrepresented_term_change_set$ = makeSymbol("*UNREPRESENTED-TERM-CHANGE-SET*");

    public static final SubLSymbol $unrepresented_term_fht_lock$ = makeSymbol("*UNREPRESENTED-TERM-FHT-LOCK*");

    private static final SubLString $$$Unrepresented_Terms_FHT_Lock = makeString("Unrepresented Terms FHT Lock");

    private static final SubLString $str69$Not_yet_implemented_ = makeString("Not yet implemented.");

    private static final SubLSymbol DO_UNREPRESENTED_TERMS_TABLE = makeSymbol("DO-UNREPRESENTED-TERMS-TABLE");

    private static final SubLSymbol $sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_ = makeSymbol("NEW-UNREPRESENTED-TERMS-TABLE-ENTRY?");

    private static final SubLSymbol UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM = makeSymbol("UNREPRESENTED-TERMS-TABLE-TUPLE-TO-UNREPRESENTED-TERM");

    private static final SubLList $list73 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));

    private static final SubLSymbol $new_unrepresented_term_id_threshold$ = makeSymbol("*NEW-UNREPRESENTED-TERM-ID-THRESHOLD*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLList $list77 = list(list(makeSymbol("*UNREPRESENTED-TERM-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE"))));

    private static final SubLSymbol CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE = makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE = makeSymbol("WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");

    private static final SubLSymbol CREATE_UNREPRESENTED_TERM_FHT = makeSymbol("CREATE-UNREPRESENTED-TERM-FHT");

    private static final SubLString $$$Creating_unrepresented_term_FHT_ = makeString("Creating unrepresented term FHT ");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLString $str84$unrepresented_terms = makeString("unrepresented-terms");

    private static final SubLString $$$fht = makeString("fht");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym90$_ = makeSymbol("<");

    public static final SubLObject do_old_unrepresented_terms_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject unrepresented_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    unrepresented_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            if (NIL == member(current_2, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_KB_SUID_TABLE_OLD_OBJECTS, list(unrepresented_term, $list_alt9, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_old_unrepresented_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject unrepresented_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        unrepresented_term = current.first();
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
        return list(PIF, $list6, list(WITH_LOCK_HELD, $list8, list(DO_PRISTINE_FILE_HASH_TABLE_KEYS, list(unrepresented_term, $list10, $MESSAGE, progress_message, $DONE, done), list(PWHEN, list(FHT_TERM_ITEM_P, unrepresented_term), listS(PUNLESS, list($sym15$DELETED_UNREPRESENTED_TERM_ITEM_, unrepresented_term), list(CSETQ, unrepresented_term, list(GET_FHT_TERM_ITEM_TERM, unrepresented_term)), append(body, NIL))))), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(unrepresented_term, $list19, $list20, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_new_unrepresented_ids_and_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_unrepresented_terms;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject suid_item = $sym23$SUID_ITEM;
        return list(PIF, $list6, list(PROGRESS_CDOLIST, list(suid_item, $list25, progress_message), list(PUNLESS, done, listS(CLET, list(list(id, list(GET_FHT_SUID_ITEM_SUID, suid_item)), list(v_term, list(FIND_UNREPRESENTED_TERM_BY_SUID, id))), append(body, NIL)))), list(DO_KB_SUID_TABLE_STARTING_AT_ID, list(v_term, $list19, $list20, $PROGRESS_MESSAGE, progress_message, $DONE, done), listS(CLET, list(list(id, list(UNREPRESENTED_TERM_SUID, v_term))), append(body, NIL))));
    }

    public static SubLObject do_unrepresented_ids_and_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$3, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_unrepresented_terms;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key = $sym31$KEY;
        final SubLObject msg = $sym32$MSG;
        return list(PIF, $list6, list(CLET, list(list(msg, listS(CCONCATENATE, progress_message, $list34))), list(WITH_LOCK_HELD, $list8, list(DO_PRISTINE_FILE_HASH_TABLE, list(key, v_term, $list10, $MESSAGE, msg, $DONE, done), list(PUNLESS, list($sym15$DELETED_UNREPRESENTED_TERM_ITEM_, key), list(PWHEN, list(FHT_SUID_ITEM_P, key), listS(CLET, list(list(id, list(GET_FHT_SUID_ITEM_SUID, key))), append(body, NIL)))))), list(PUNLESS, done, list(CSETQ, msg, listS(CCONCATENATE, progress_message, $list37)), listS(DO_NEW_UNREPRESENTED_IDS_AND_TERMS, list(id, v_term, $PROGRESS_MESSAGE, msg, $DONE, done), append(body, NIL)))), listS(DO_ID_INDEX, list(new SubLObject[]{ id, v_term, $list19, $PROGRESS_MESSAGE, progress_message, $ORDERED, T, $DONE, done }), append(body, NIL)));
    }

    public static final SubLObject do_new_unrepresented_terms_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject unrepresented_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    unrepresented_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            if (NIL == member(current_3, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_KB_SUID_TABLE_NEW_OBJECTS, list(unrepresented_term, $list_alt9, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_new_unrepresented_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject unrepresented_term = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        unrepresented_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$4, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
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
        final SubLObject id = $sym41$ID;
        final SubLObject suid_item = $sym42$SUID_ITEM;
        return list(PIF, $list6, list(PROGRESS_CDOLIST, list(suid_item, $list25, progress_message), list(PUNLESS, done, listS(CLET, list(list(id, list(GET_FHT_SUID_ITEM_SUID, suid_item)), list(unrepresented_term, list(FIND_UNREPRESENTED_TERM_BY_SUID, id))), append(body, NIL)))), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(unrepresented_term, $list19, $list20, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    /**
     * Iterate over all indexed unrepresented terms, executing BODY within the scope of VAR.
     * VAR is bound to each unrepresented term in turn.
     * PROGRESS-MESSAGE is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all indexed unrepresented terms, executing BODY within the scope of VAR.\r\nVAR is bound to each unrepresented term in turn.\r\nPROGRESS-MESSAGE is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all indexed unrepresented terms, executing BODY within the scope of VAR.\nVAR is bound to each unrepresented term in turn.\nPROGRESS-MESSAGE is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static final SubLObject do_kb_unrepresented_terms_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt2);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt2);
                            if (NIL == member(current_1, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt2);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $$$mapping_Cyc_unrepresented_terms;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_KB_SUID_TABLE, list(var, $list_alt9, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all indexed unrepresented terms, executing BODY within the scope of VAR.
     * VAR is bound to each unrepresented term in turn.
     * PROGRESS-MESSAGE is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all indexed unrepresented terms, executing BODY within the scope of VAR.\r\nVAR is bound to each unrepresented term in turn.\r\nPROGRESS-MESSAGE is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all indexed unrepresented terms, executing BODY within the scope of VAR.\nVAR is bound to each unrepresented term in turn.\nPROGRESS-MESSAGE is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static SubLObject do_kb_unrepresented_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list43);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list43);
            if (NIL == member(current_$5, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list43);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_unrepresented_terms;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym44$ID;
        return listS(DO_UNREPRESENTED_IDS_AND_TERMS, list(id, var, $PROGRESS_MESSAGE, progress_message, $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject do_kb_strings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt17);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt17);
                            if (NIL == member(current_4, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt17);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $$$mapping_Cyc_strings;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_KB_UNREPRESENTED_TERMS, list(var, $PROGRESS_MESSAGE, progress_message, $DONE, done), listS(PWHEN, list(SUBL_STRING_P, var), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_strings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$6, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_strings;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_KB_UNREPRESENTED_TERMS, list(var, $PROGRESS_MESSAGE, progress_message, $DONE, done), listS(PWHEN, list(SUBL_STRING_P, var), append(body, NIL)));
    }

    public static final SubLObject do_kb_numbers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_5, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $$$mapping_Cyc_numbers;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_KB_UNREPRESENTED_TERMS, list(var, $PROGRESS_MESSAGE, progress_message, $DONE, done), listS(PWHEN, list(SUBL_REAL_NUMBER_P, var), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_numbers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list51);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list51);
            if (NIL == member(current_$7, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list51);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_numbers;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_KB_UNREPRESENTED_TERMS, list(var, $PROGRESS_MESSAGE, progress_message, $DONE, done), listS(PWHEN, list(SUBL_REAL_NUMBER_P, var), append(body, NIL)));
    }

    public static final SubLObject setup_unrepresented_term_suid_table_alt(SubLObject size, SubLObject exactP) {
        {
            SubLObject setupP = NIL;
            if (NIL == $unrepresented_term_from_suid$.getGlobalValue()) {
                $unrepresented_term_from_suid$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
                setupP = T;
            }
            if (NIL == $unrepresented_term_to_suid$.getGlobalValue()) {
                $unrepresented_term_to_suid$.setGlobalValue(make_hash_table(size, symbol_function(EQUAL), UNPROVIDED));
                setupP = T;
            }
            return setupP;
        }
    }

    public static SubLObject setup_unrepresented_term_suid_table(final SubLObject size, final SubLObject exactP) {
        SubLObject setupP = NIL;
        if (NIL == $unrepresented_term_from_suid$.getGlobalValue()) {
            $unrepresented_term_from_suid$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
            setupP = T;
        }
        if (NIL == $unrepresented_term_to_suid$.getGlobalValue()) {
            $unrepresented_term_to_suid$.setGlobalValue(make_hash_table(size, symbol_function(EQUAL), UNPROVIDED));
            setupP = T;
        }
        return setupP;
    }

    public static final SubLObject finalize_unrepresented_term_suid_table_alt(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == UNPROVIDED) {
            max_unrepresented_term_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.unrepresented_terms.set_next_unrepresented_term_suid(max_unrepresented_term_id);
            if (NIL == max_unrepresented_term_id) {
                {
                    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                    try {
                        Storage.$current_area$.bind(Storage.get_static_area(), thread);
                        optimize_id_index($unrepresented_term_from_suid$.getGlobalValue(), UNPROVIDED);
                    } finally {
                        Storage.$current_area$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject finalize_unrepresented_term_suid_table(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == UNPROVIDED) {
            max_unrepresented_term_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_next_unrepresented_term_suid(max_unrepresented_term_id);
        set_new_unrepresented_term_id_threshold(next_unrepresented_term_suid());
        if (NIL == max_unrepresented_term_id) {
            final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), thread);
                optimize_id_index($unrepresented_term_from_suid$.getGlobalValue(), UNPROVIDED);
            } finally {
                Storage.$current_area$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject clear_unrepresented_term_suid_table_alt() {
        clear_id_index($unrepresented_term_from_suid$.getGlobalValue());
        clrhash($unrepresented_term_to_suid$.getGlobalValue());
        com.cyc.cycjava.cycl.unrepresented_terms.set_next_unrepresented_term_suid(UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_unrepresented_term_suid_table() {
        clear_id_index($unrepresented_term_from_suid$.getGlobalValue());
        clrhash($unrepresented_term_to_suid$.getGlobalValue());
        set_next_unrepresented_term_suid(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject set_next_unrepresented_term_suid_alt(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == UNPROVIDED) {
            max_unrepresented_term_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max = MINUS_ONE_INTEGER;
                if (NIL != max_unrepresented_term_id) {
                    max = max_unrepresented_term_id;
                } else {
                    {
                        SubLObject idx = com.cyc.cycjava.cycl.unrepresented_terms.do_unrepresented_terms_table();
                        SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt24$Determining_maximum_unrepresented, STRINGP);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($str_alt24$Determining_maximum_unrepresented);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject unrepresented_term = NIL;
                                        while (NIL != id) {
                                            unrepresented_term = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, unrepresented_term, $SKIP)) {
                                                note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                {
                                                    SubLObject suid = com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(unrepresented_term);
                                                    max = max(max, suid);
                                                }
                                            }
                                            id = do_id_index_next_id(idx, T, id, state_var);
                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject next_suid = add(max, ONE_INTEGER);
                    set_id_index_next_id($unrepresented_term_from_suid$.getGlobalValue(), next_suid);
                    return next_suid;
                }
            }
        }
    }

    public static SubLObject set_next_unrepresented_term_suid(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == UNPROVIDED) {
            max_unrepresented_term_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        if (NIL != max_unrepresented_term_id) {
            max = max_unrepresented_term_id;
        } else
            if (NIL != use_unrepresented_term_fhtP()) {
                SubLObject msg = cconcatenate($str56$Determining_maximum_unrepresented, $str57$____Old_Space);
                SubLObject release = NIL;
                try {
                    release = seize_lock($unrepresented_term_fht_lock$.getGlobalValue());
                    final SubLObject table_var = get_unrepresented_term_fht();
                    $progress_note$.setDynamicValue(msg, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject continuation = NIL;
                            SubLObject next;
                            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                                thread.resetMultipleValues();
                                final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                                final SubLObject the_value = thread.secondMultipleValue();
                                next = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != next) {
                                    final SubLObject key = the_key;
                                    final SubLObject unrepresented_term = the_value;
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    if ((NIL == deleted_unrepresented_term_itemP(key)) && (NIL != fht_suid_item_p(key))) {
                                        final SubLObject id = get_fht_suid_item_suid(key);
                                        final SubLObject suid = unrepresented_term_suid(unrepresented_term);
                                        max = max(max, suid);
                                    }
                                }
                                continuation = next;
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock($unrepresented_term_fht_lock$.getGlobalValue());
                    }
                }
                msg = cconcatenate($str56$Determining_maximum_unrepresented, $str58$____New_Space);
                if (NIL != use_unrepresented_term_fhtP()) {
                    final SubLObject list_var = get_unrepresented_term_new_space_ascending_suid_keys();
                    final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject suid_item = NIL;
                            suid_item = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                final SubLObject id2 = get_fht_suid_item_suid(suid_item);
                                final SubLObject unrepresented_term2 = find_unrepresented_term_by_suid(id2);
                                final SubLObject suid = unrepresented_term_suid(unrepresented_term2);
                                max = max(max, suid);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                suid_item = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject table_var = do_unrepresented_terms_table();
                    final SubLObject first_id_var = new_unrepresented_term_id_threshold();
                    final SubLObject total = subtract(id_index_next_id(table_var), first_id_var);
                    SubLObject sofar = ZERO_INTEGER;
                    final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(msg);
                            SubLObject unrepresented_term;
                            SubLObject suid;
                            SubLObject end_var;
                            SubLObject end;
                            SubLObject id3;
                            SubLObject id_$10;
                            for (end = end_var = id_index_next_id(table_var), id3 = NIL, id3 = first_id_var; !id3.numGE(end_var); id3 = number_utilities.f_1X(id3)) {
                                unrepresented_term = id_index_lookup(table_var, id3, UNPROVIDED);
                                if (NIL != unrepresented_term) {
                                    note_percent_progress(sofar, total);
                                    sofar = add(sofar, ONE_INTEGER);
                                    id_$10 = unrepresented_term_suid(unrepresented_term);
                                    suid = unrepresented_term_suid(unrepresented_term);
                                    max = max(max, suid);
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                    }
                }
            } else {
                final SubLObject idx = do_unrepresented_terms_table();
                final SubLObject mess = $str56$Determining_maximum_unrepresented;
                final SubLObject total2 = id_index_count(idx);
                SubLObject sofar2 = ZERO_INTEGER;
                assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$12 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$12, $SKIP)) {
                            final SubLObject idx_$13 = idx_$12;
                            if (NIL == id_index_dense_objects_empty_p(idx_$13, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$13);
                                final SubLObject backwardP_var = NIL;
                                SubLObject id;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject unrepresented_term3;
                                SubLObject suid2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    unrepresented_term3 = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(unrepresented_term3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(unrepresented_term3)) {
                                            unrepresented_term3 = $SKIP;
                                        }
                                        suid2 = unrepresented_term_suid(unrepresented_term3);
                                        max = max(max, suid2);
                                        sofar2 = add(sofar2, ONE_INTEGER);
                                        note_percent_progress(sofar2, total2);
                                    }
                                }
                            }
                            final SubLObject idx_$14 = idx_$12;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$14)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$14);
                                SubLObject id4 = id_index_sparse_id_threshold(idx_$14);
                                final SubLObject end_id = id_index_next_id(idx_$14);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id4.numL(end_id)) {
                                    final SubLObject unrepresented_term2 = gethash_without_values(id4, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(unrepresented_term2))) {
                                        final SubLObject suid = unrepresented_term_suid(unrepresented_term2);
                                        max = max(max, suid);
                                        sofar2 = add(sofar2, ONE_INTEGER);
                                        note_percent_progress(sofar2, total2);
                                    }
                                    id4 = add(id4, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_16, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_13, thread);
                }
            }

        final SubLObject next_suid = add(max, ONE_INTEGER);
        set_id_index_next_id($unrepresented_term_from_suid$.getGlobalValue(), next_suid);
        return next_suid;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc unrepresented terms")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    static private final SubLList $list_alt9 = list(makeSymbol("DO-UNREPRESENTED-TERMS-TABLE"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("UNREPRESENTED-TERM"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");

    private static final SubLSymbol DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");

    static private final SubLList $list_alt17 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc strings")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc numbers")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt24$Determining_maximum_unrepresented = makeString("Determining maximum unrepresented-term SUID");

    static private final SubLList $list_alt26 = list(list(makeSymbol("*UNREPRESENTED-TERM-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE"))));

    public static SubLObject lookup_unrepresented_term_by_suid_table(final SubLObject suid) {
        return id_index_lookup($unrepresented_term_from_suid$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static SubLObject lookup_unrepresented_term_suid_map(final SubLObject v_term) {
        return gethash_without_values(v_term, $unrepresented_term_to_suid$.getGlobalValue(), NIL);
    }

    public static SubLObject register_unrepresented_term_suid_table(final SubLObject v_term, final SubLObject suid) {
        id_index_enter($unrepresented_term_from_suid$.getGlobalValue(), suid, v_term);
        sethash(v_term, $unrepresented_term_to_suid$.getGlobalValue(), suid);
        return v_term;
    }

    public static SubLObject deregister_unrepresented_term_suid_table(final SubLObject suid) {
        final SubLObject v_term = lookup_unrepresented_term_by_suid_table(suid);
        if (NIL != v_term) {
            id_index_remove($unrepresented_term_from_suid$.getGlobalValue(), suid);
            remhash(v_term, $unrepresented_term_to_suid$.getGlobalValue());
        }
        return list_utilities.sublisp_boolean(v_term);
    }

    public static SubLObject use_unrepresented_term_fhtP() {
        return $use_fht_approach_to_unrepresented_termsP$.getGlobalValue();
    }

    public static SubLObject get_unrepresented_term_fht() {
        return $unrepresented_term_fht$.getGlobalValue();
    }

    public static SubLObject get_unrepresented_term_change_set() {
        return $unrepresented_term_change_set$.getGlobalValue();
    }

    /**
     * Return a new ITERATOR for iterating over all indexed unrepresented terms.
     */
    @LispMethod(comment = "Return a new ITERATOR for iterating over all indexed unrepresented terms.")
    public static final SubLObject new_unrepresented_terms_iterator_alt() {
        return new_id_index_values_iterator($unrepresented_term_from_suid$.getGlobalValue());
    }

    /**
     * Return a new ITERATOR for iterating over all indexed unrepresented terms.
     */
    @LispMethod(comment = "Return a new ITERATOR for iterating over all indexed unrepresented terms.")
    public static SubLObject new_unrepresented_terms_iterator() {
        return NIL != use_unrepresented_term_fhtP() ? construct_unrepresented_terms_fht_based_iterator() : new_id_index_values_iterator($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static SubLObject construct_unrepresented_terms_fht_based_iterator() {
        return Errors.error($str69$Not_yet_implemented_);
    }

    public static final SubLObject do_unrepresented_terms_table_alt() {
        return $unrepresented_term_from_suid$.getGlobalValue();
    }

    public static SubLObject do_unrepresented_terms_table() {
        return $unrepresented_term_from_suid$.getGlobalValue();
    }

    public static final SubLObject map_unrepresented_terms_alt(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject idx = com.cyc.cycjava.cycl.unrepresented_terms.do_unrepresented_terms_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_unrepresented_terms, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_unrepresented_terms);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject v_term = NIL;
                                while (NIL != id) {
                                    v_term = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, v_term, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        funcall(function, v_term);
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject map_unrepresented_terms(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != use_unrepresented_term_fhtP()) {
            SubLObject msg = cconcatenate($$$mapping_Cyc_unrepresented_terms, $str57$____Old_Space);
            SubLObject release = NIL;
            try {
                release = seize_lock($unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = get_unrepresented_term_fht();
                $progress_note$.setDynamicValue(msg, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject continuation = NIL;
                        SubLObject next;
                        for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject v_term = the_value;
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if ((NIL == deleted_unrepresented_term_itemP(key)) && (NIL != fht_suid_item_p(key))) {
                                    final SubLObject id = get_fht_suid_item_suid(key);
                                    funcall(function, v_term);
                                }
                            }
                            continuation = next;
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = cconcatenate($$$mapping_Cyc_unrepresented_terms, $str58$____New_Space);
            if (NIL != use_unrepresented_term_fhtP()) {
                final SubLObject list_var = get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject suid_item = NIL;
                        suid_item = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            final SubLObject id2 = get_fht_suid_item_suid(suid_item);
                            final SubLObject v_term2 = find_unrepresented_term_by_suid(id2);
                            funcall(function, v_term2);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject table_var = do_unrepresented_terms_table();
                final SubLObject first_id_var = new_unrepresented_term_id_threshold();
                final SubLObject total = subtract(id_index_next_id(table_var), first_id_var);
                SubLObject sofar = ZERO_INTEGER;
                final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(msg);
                        SubLObject v_term;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id3;
                        SubLObject id_$18;
                        for (end = end_var = id_index_next_id(table_var), id3 = NIL, id3 = first_id_var; !id3.numGE(end_var); id3 = number_utilities.f_1X(id3)) {
                            v_term = id_index_lookup(table_var, id3, UNPROVIDED);
                            if (NIL != v_term) {
                                note_percent_progress(sofar, total);
                                sofar = add(sofar, ONE_INTEGER);
                                id_$18 = unrepresented_term_suid(v_term);
                                funcall(function, v_term);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        } else {
            final SubLObject idx = do_unrepresented_terms_table();
            final SubLObject mess = $$$mapping_Cyc_unrepresented_terms;
            final SubLObject total2 = id_index_count(idx);
            SubLObject sofar2 = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$20 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$20, $SKIP)) {
                        final SubLObject idx_$21 = idx_$20;
                        if (NIL == id_index_dense_objects_empty_p(idx_$21, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$21);
                            final SubLObject backwardP_var = NIL;
                            SubLObject id;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject v_term3;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                v_term3 = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(v_term3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(v_term3)) {
                                        v_term3 = $SKIP;
                                    }
                                    funcall(function, v_term3);
                                    sofar2 = add(sofar2, ONE_INTEGER);
                                    note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$22 = idx_$20;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$22)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$22);
                            SubLObject id4 = id_index_sparse_id_threshold(idx_$22);
                            final SubLObject end_id = id_index_next_id(idx_$22);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id4.numL(end_id)) {
                                final SubLObject v_term2 = gethash_without_values(id4, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                    funcall(function, v_term2);
                                    sofar2 = add(sofar2, ONE_INTEGER);
                                    note_percent_progress(sofar2, total2);
                                }
                                id4 = add(id4, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_16, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        return NIL;
    }

    public static SubLObject new_new_unrepresented_terms_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(new_id_index_ordered_iterator(do_unrepresented_terms_table()), $sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_, list(new_unrepresented_term_id_threshold())), UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM, UNPROVIDED);
    }

    public static SubLObject new_unrepresented_terms_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list73);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list73);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return numGE(id, id_threshold);
        }
        cdestructuring_bind_error(tuple, $list73);
        return NIL;
    }

    public static SubLObject unrepresented_terms_table_tuple_to_unrepresented_term(final SubLObject tuple) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list73);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list73);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return find_unrepresented_term_by_suid(id);
        }
        cdestructuring_bind_error(tuple, $list73);
        return NIL;
    }

    public static SubLObject deleted_unrepresented_term_id_iterator() {
        return iteration.new_list_iterator(id_index_missing_ids(do_unrepresented_terms_table(), $ALL, UNPROVIDED));
    }

    public static SubLObject has_new_unrepresented_termsP() {
        return numG(next_unrepresented_term_suid(), new_unrepresented_term_id_threshold());
    }

    /**
     * Return the total number of unrepresented-terms mentioned in the KB.
     */
    @LispMethod(comment = "Return the total number of unrepresented-terms mentioned in the KB.")
    public static final SubLObject kb_unrepresented_term_count_alt() {
        return NIL != $unrepresented_term_from_suid$.getGlobalValue() ? ((SubLObject) (id_index_count($unrepresented_term_from_suid$.getGlobalValue()))) : ZERO_INTEGER;
    }

    /**
     * Return the total number of unrepresented-terms mentioned in the KB.
     */
    @LispMethod(comment = "Return the total number of unrepresented-terms mentioned in the KB.")
    public static SubLObject kb_unrepresented_term_count() {
        if (NIL != use_unrepresented_term_fhtP()) {
            return compute_kb_unrepresented_term_count_fht(UNPROVIDED);
        }
        if (NIL != list_utilities.sublisp_boolean($unrepresented_term_from_suid$.getGlobalValue())) {
            return id_index_count($unrepresented_term_from_suid$.getGlobalValue());
        }
        return ZERO_INTEGER;
    }

    public static SubLObject new_unrepresented_term_id_threshold() {
        return NIL != $new_unrepresented_term_id_threshold$.getGlobalValue() ? $new_unrepresented_term_id_threshold$.getGlobalValue() : unrepresented_term_index_manager.get_file_backed_unrepresented_term_internal_id_threshold();
    }

    public static SubLObject set_new_unrepresented_term_id_threshold(final SubLObject id) {
        $new_unrepresented_term_id_threshold$.setGlobalValue(id);
        return id;
    }

    public static SubLObject old_unrepresented_term_count() {
        if (NIL != do_unrepresented_terms_table()) {
            return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_unrepresented_terms_table(), new_unrepresented_term_id_threshold()));
        }
        return kb_unrepresented_term_count();
    }

    public static SubLObject new_unrepresented_term_count() {
        if (NIL != do_unrepresented_terms_table()) {
            return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_unrepresented_terms_table(), new_unrepresented_term_id_threshold()));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject compute_kb_unrepresented_term_count_fht(SubLObject valid_suid_keys) {
        if (valid_suid_keys == UNPROVIDED) {
            valid_suid_keys = NIL;
        }
        if (NIL == list_utilities.sublisp_boolean(valid_suid_keys)) {
            valid_suid_keys = get_unrepresented_term_new_space_suid_keys();
        }
        return add(subtract(get_kb_unrepresented_term_old_space_size(), get_kb_unrepresented_term_raw_new_space_size()), length(valid_suid_keys));
    }

    public static SubLObject get_kb_unrepresented_term_old_space_size() {
        final SubLObject fht_size = file_hash_table.file_hash_table_count(get_unrepresented_term_fht());
        final SubLObject old_space_size = integerDivide(fht_size, TWO_INTEGER);
        return old_space_size;
    }

    public static SubLObject get_kb_unrepresented_term_raw_new_space_size() {
        final SubLObject change_set_size = hash_table_count(get_unrepresented_term_change_set());
        final SubLObject raw_new_space_size = integerDivide(change_set_size, TWO_INTEGER);
        return raw_new_space_size;
    }

    public static SubLObject get_kb_unrepresented_term_max_suid() {
        return integer_sequence_generator.get_integer_sequence_generator_recent($unrepresented_term_isg$.getGlobalValue());
    }

    public static final SubLObject lookup_unrepresented_term_by_suid_alt(SubLObject suid) {
        return id_index_lookup($unrepresented_term_from_suid$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static SubLObject lookup_unrepresented_term_by_suid(final SubLObject suid) {
        return NIL != use_unrepresented_term_fhtP() ? lookup_unrepresented_term_by_suid_fht(suid) : lookup_unrepresented_term_by_suid_table(suid);
    }

    public static final SubLObject lookup_unrepresented_term_suid_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = gethash(v_term, $unrepresented_term_to_suid$.getGlobalValue(), NIL);
                SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return result;
            }
        }
    }

    public static SubLObject lookup_unrepresented_term_suid(final SubLObject v_term) {
        return NIL != use_unrepresented_term_fhtP() ? lookup_unrepresented_term_suid_fht(v_term) : lookup_unrepresented_term_suid_map(v_term);
    }

    public static final SubLObject find_unrepresented_term_by_suid_alt(SubLObject suid) {
        return com.cyc.cycjava.cycl.unrepresented_terms.lookup_unrepresented_term_by_suid(suid);
    }

    public static SubLObject find_unrepresented_term_by_suid(final SubLObject suid) {
        return lookup_unrepresented_term_by_suid(suid);
    }

    public static final SubLObject unrepresented_term_suid_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.unrepresented_terms.lookup_unrepresented_term_suid(v_term);
    }

    public static SubLObject unrepresented_term_suid(final SubLObject v_term) {
        return lookup_unrepresented_term_suid(v_term);
    }

    public static final SubLObject kb_unrepresented_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != indexed_unrepresented_term_p(v_object)) && (NIL != com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(v_object)));
    }

    public static SubLObject kb_unrepresented_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_unrepresented_term_p(v_object)) && (NIL != unrepresented_term_suid(v_object)));
    }

    /**
     * Note that SUID will be used as the suid for UNREPRESENTED-TERM.
     */
    @LispMethod(comment = "Note that SUID will be used as the suid for UNREPRESENTED-TERM.")
    public static final SubLObject register_unrepresented_term_suid_alt(SubLObject v_term, SubLObject suid) {
        id_index_enter($unrepresented_term_from_suid$.getGlobalValue(), suid, v_term);
        sethash(v_term, $unrepresented_term_to_suid$.getGlobalValue(), suid);
        return v_term;
    }

    /**
     * Note that SUID will be used as the suid for UNREPRESENTED-TERM.
     */
    @LispMethod(comment = "Note that SUID will be used as the suid for UNREPRESENTED-TERM.")
    public static SubLObject register_unrepresented_term_suid(final SubLObject v_term, final SubLObject suid) {
        if (NIL != use_unrepresented_term_fhtP()) {
            register_unrepresented_term_suid_fht(v_term, suid);
        } else {
            register_unrepresented_term_suid_table(v_term, suid);
        }
        return v_term;
    }

    public static SubLObject register_unrepresented_term_suid_new(final SubLObject v_term, final SubLObject suid, final SubLObject term_from_suid_id_index, final SubLObject term_to_suid_hashtable) {
        if (NIL == use_unrepresented_term_fhtP()) {
            id_index_enter_unlocked(term_from_suid_id_index, suid, v_term);
            sethash(v_term, term_to_suid_hashtable, suid);
        }
        return v_term;
    }

    /**
     * Note that SUID is not in use as a unrepresented term suid.
     */
    @LispMethod(comment = "Note that SUID is not in use as a unrepresented term suid.")
    public static final SubLObject deregister_unrepresented_term_suid_alt(SubLObject suid) {
        {
            SubLObject v_term = com.cyc.cycjava.cycl.unrepresented_terms.lookup_unrepresented_term_by_suid(suid);
            if (NIL != v_term) {
                id_index_remove($unrepresented_term_from_suid$.getGlobalValue(), suid);
                remhash(v_term, $unrepresented_term_to_suid$.getGlobalValue());
            }
            return sublisp_boolean(v_term);
        }
    }

    /**
     * Note that SUID is not in use as a unrepresented term suid.
     */
    @LispMethod(comment = "Note that SUID is not in use as a unrepresented term suid.")
    public static SubLObject deregister_unrepresented_term_suid(final SubLObject suid) {
        return NIL != use_unrepresented_term_fhtP() ? deregister_unrepresented_term_suid_fht(suid) : deregister_unrepresented_term_suid_table(suid);
    }

    /**
     * Return a new integer suid for a unrepresented-term.
     */
    @LispMethod(comment = "Return a new integer suid for a unrepresented-term.")
    public static final SubLObject make_unrepresented_term_suid_alt() {
        return id_index_reserve($unrepresented_term_from_suid$.getGlobalValue());
    }

    /**
     * Return a new integer suid for a unrepresented-term.
     */
    @LispMethod(comment = "Return a new integer suid for a unrepresented-term.")
    public static SubLObject make_unrepresented_term_suid() {
        return NIL != use_unrepresented_term_fhtP() ? integer_sequence_generator.integer_sequence_generator_next($unrepresented_term_isg$.getGlobalValue()) : id_index_reserve($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static final SubLObject next_unrepresented_term_suid_alt() {
        return id_index_next_id($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static SubLObject next_unrepresented_term_suid() {
        return NIL != use_unrepresented_term_fhtP() ? get_kb_unrepresented_term_max_suid() : id_index_next_id($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static final SubLObject find_or_create_unrepresented_term_suid_alt(SubLObject v_term) {
        {
            SubLObject suid = com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(v_term);
            if (NIL == suid) {
                suid = com.cyc.cycjava.cycl.unrepresented_terms.make_unrepresented_term_suid();
                com.cyc.cycjava.cycl.unrepresented_terms.register_unrepresented_term_suid(v_term, suid);
            }
            return suid;
        }
    }

    public static SubLObject find_or_create_unrepresented_term_suid(final SubLObject v_term) {
        SubLObject suid = unrepresented_term_suid(v_term);
        if (NIL == suid) {
            suid = make_unrepresented_term_suid();
            register_unrepresented_term_suid(v_term, suid);
        }
        return suid;
    }

    public static final SubLObject finalize_unrepresented_terms_alt(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == UNPROVIDED) {
            max_unrepresented_term_id = NIL;
        }
        com.cyc.cycjava.cycl.unrepresented_terms.finalize_unrepresented_term_suid_table(max_unrepresented_term_id);
        return NIL;
    }

    public static SubLObject finalize_unrepresented_terms(SubLObject max_unrepresented_term_id) {
        if (max_unrepresented_term_id == UNPROVIDED) {
            max_unrepresented_term_id = NIL;
        }
        if (NIL != use_unrepresented_term_fhtP()) {
            setup_unrepresented_term_fht_new_space(max_unrepresented_term_id);
        } else {
            finalize_unrepresented_term_suid_table(max_unrepresented_term_id);
        }
        return NIL;
    }

    public static final SubLObject unrepresented_term_index_alt(SubLObject v_term) {
        {
            SubLObject suid = com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(v_term);
            return NIL != suid ? ((SubLObject) (lookup_unrepresented_term_index(suid))) : NIL;
        }
    }

    public static SubLObject unrepresented_term_index(final SubLObject v_term) {
        final SubLObject suid = unrepresented_term_suid(v_term);
        return NIL != suid ? unrepresented_term_index_manager.lookup_unrepresented_term_index(suid) : NIL;
    }

    public static SubLObject unrepresented_term_index_swapped_inP(final SubLObject v_term) {
        return NIL;
    }

    public static final SubLObject setup_unrepresented_term_table_alt(SubLObject size, SubLObject exactP) {
        com.cyc.cycjava.cycl.unrepresented_terms.setup_unrepresented_term_suid_table(size, exactP);
        setup_unrepresented_term_index_table(size, exactP);
        return NIL;
    }

    public static SubLObject setup_unrepresented_term_table(final SubLObject size, final SubLObject exactP) {
        if (size.numLE($int$10000)) {
            $use_fht_approach_to_unrepresented_termsP$.setGlobalValue(NIL);
        }
        if (NIL != use_unrepresented_term_fhtP()) {
            setup_unrepresented_term_fht_new_space(size);
        } else {
            setup_unrepresented_term_suid_table(size, exactP);
        }
        unrepresented_term_index_manager.setup_unrepresented_term_index_table(size, exactP);
        return NIL;
    }

    public static final SubLObject clear_unrepresented_term_table_alt() {
        com.cyc.cycjava.cycl.unrepresented_terms.clear_unrepresented_term_suid_table();
        clear_unrepresented_term_index_table();
        return NIL;
    }

    public static SubLObject clear_unrepresented_term_table() {
        if (NIL != use_unrepresented_term_fhtP()) {
            clear_unrepresented_term_fht();
        } else {
            clear_unrepresented_term_suid_table();
        }
        unrepresented_term_index_manager.clear_unrepresented_term_index_table();
        return NIL;
    }

    /**
     * Primitively change the assertion index for TERM to NEW-INDEX.
     * If BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist.
     */
    @LispMethod(comment = "Primitively change the assertion index for TERM to NEW-INDEX.\r\nIf BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist.\nPrimitively change the assertion index for TERM to NEW-INDEX.\nIf BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist.")
    public static final SubLObject reset_unrepresented_term_index_alt(SubLObject v_term, SubLObject new_index, SubLObject bootstrapP) {
        if (bootstrapP == UNPROVIDED) {
            bootstrapP = NIL;
        }
        if (NIL == new_index) {
            {
                SubLObject suid = com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(v_term);
                if (NIL != suid) {
                    deregister_unrepresented_term_index(suid);
                    com.cyc.cycjava.cycl.unrepresented_terms.deregister_unrepresented_term_suid(suid);
                }
            }
            return v_term;
        } else {
            {
                SubLObject suid = (NIL != bootstrapP) ? ((SubLObject) (com.cyc.cycjava.cycl.unrepresented_terms.find_or_create_unrepresented_term_suid(v_term))) : com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(v_term);
                if (NIL != suid) {
                    register_unrepresented_term_index(suid, new_index);
                }
            }
            return v_term;
        }
    }

    /**
     * Primitively change the assertion index for TERM to NEW-INDEX.
     * If BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist.
     */
    @LispMethod(comment = "Primitively change the assertion index for TERM to NEW-INDEX.\r\nIf BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist.\nPrimitively change the assertion index for TERM to NEW-INDEX.\nIf BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist.")
    public static SubLObject reset_unrepresented_term_index(final SubLObject v_term, final SubLObject new_index, SubLObject bootstrapP) {
        if (bootstrapP == UNPROVIDED) {
            bootstrapP = NIL;
        }
        if (NIL == new_index) {
            final SubLObject suid = unrepresented_term_suid(v_term);
            if (NIL != suid) {
                unrepresented_term_index_manager.deregister_unrepresented_term_index(suid);
                deregister_unrepresented_term_suid(suid);
            }
            return v_term;
        }
        final SubLObject suid = (NIL != bootstrapP) ? find_or_create_unrepresented_term_suid(v_term) : unrepresented_term_suid(v_term);
        if (NIL != suid) {
            unrepresented_term_index_manager.register_unrepresented_term_index(suid, new_index);
        }
        return v_term;
    }

    /**
     * Primitively clear the assertion index for TERM.
     */
    @LispMethod(comment = "Primitively clear the assertion index for TERM.")
    public static final SubLObject clear_unrepresented_term_index_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.unrepresented_terms.reset_unrepresented_term_index(v_term, new_simple_index(), UNPROVIDED);
    }

    /**
     * Primitively clear the assertion index for TERM.
     */
    @LispMethod(comment = "Primitively clear the assertion index for TERM.")
    public static SubLObject clear_unrepresented_term_index(final SubLObject v_term) {
        return reset_unrepresented_term_index(v_term, new_simple_index(), UNPROVIDED);
    }

    /**
     * Primitively remove the assertion index for TERM.
     */
    @LispMethod(comment = "Primitively remove the assertion index for TERM.")
    public static final SubLObject remove_unrepresented_term_index_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.unrepresented_terms.reset_unrepresented_term_index(v_term, NIL, UNPROVIDED);
    }

    /**
     * Primitively remove the assertion index for TERM.
     */
    @LispMethod(comment = "Primitively remove the assertion index for TERM.")
    public static SubLObject remove_unrepresented_term_index(final SubLObject v_term) {
        return reset_unrepresented_term_index(v_term, NIL, UNPROVIDED);
    }

    public static final SubLObject unrepresented_term_dump_id_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = com.cyc.cycjava.cycl.unrepresented_terms.unrepresented_term_suid(v_term);
                SubLObject dump_table = $unrepresented_term_dump_id_table$.getDynamicValue(thread);
                if (NIL != dump_table) {
                    id = id_index_lookup(dump_table, id, UNPROVIDED);
                }
                return id;
            }
        }
    }

    public static SubLObject unrepresented_term_dump_id(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = unrepresented_term_suid(v_term);
        final SubLObject dump_table = $unrepresented_term_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    public static final SubLObject find_unrepresented_term_by_dump_id_alt(SubLObject dump_id) {
        return com.cyc.cycjava.cycl.unrepresented_terms.find_unrepresented_term_by_suid(dump_id);
    }

    public static SubLObject find_unrepresented_term_by_dump_id(final SubLObject dump_id) {
        return find_unrepresented_term_by_suid(dump_id);
    }

    public static final SubLObject with_unrepresented_term_dump_id_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt26, append(body, NIL));
        }
    }

    public static SubLObject with_unrepresented_term_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list77, append(body, NIL));
    }

    public static final SubLObject create_unrepresented_term_dump_id_table_alt() {
        return new_indirect_compact_id_index($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static SubLObject create_unrepresented_term_dump_id_table() {
        if (NIL != use_unrepresented_term_fhtP()) {
            return create_unrepresented_term_dump_id_table_fht();
        }
        return new_indirect_compact_id_index($unrepresented_term_from_suid$.getGlobalValue());
    }

    public static SubLObject create_unrepresented_term_dump_id_table_fht() {
        final SubLObject valid_suid_keys = get_unrepresented_term_new_space_ascending_suid_keys();
        final SubLObject compact_id_space_size = compute_kb_unrepresented_term_count_fht(valid_suid_keys);
        final SubLObject v_id_index = new_id_index(compact_id_space_size, UNPROVIDED);
        final SubLObject suid_item = new_fht_suid_item();
        SubLObject compact_id = ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject suid;
        for (cdotimes_end_var = get_kb_unrepresented_term_old_space_size(), suid = NIL, suid = ZERO_INTEGER; suid.numL(cdotimes_end_var); suid = add(suid, ONE_INTEGER)) {
            set_fht_suid_item(suid_item, suid);
            if (NIL == deleted_unrepresented_term_itemP(suid_item)) {
                id_index_enter_unlocked(v_id_index, suid, compact_id);
                compact_id = add(compact_id, ONE_INTEGER);
            }
        }
        SubLObject cdolist_list_var = valid_suid_keys;
        SubLObject suid_item_$24 = NIL;
        suid_item_$24 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject suid2 = get_fht_suid_item_suid(suid_item_$24);
            id_index_enter_unlocked(v_id_index, suid2, compact_id);
            compact_id = add(compact_id, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            suid_item_$24 = cdolist_list_var.first();
        } 
        return v_id_index;
    }

    public static SubLObject new_fht_term_item() {
        return cons(CHAR_T, $MARKER);
    }

    public static SubLObject new_fht_suid_item() {
        return cons(CHAR_S, $MARKER);
    }

    public static SubLObject fht_term_item_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && CHAR_T.eql(v_object.first())) && (NIL != cycl_grammar.cycl_unrepresented_term_p(v_object.rest())));
    }

    public static SubLObject fht_suid_item_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && CHAR_S.eql(v_object.first())) && (NIL != subl_promotions.non_negative_integer_p(v_object.rest())));
    }

    public static SubLObject get_fht_term_item_term(final SubLObject item) {
        return item.rest();
    }

    public static SubLObject get_fht_suid_item_suid(final SubLObject item) {
        return item.rest();
    }

    public static SubLObject set_fht_term_item(final SubLObject item, final SubLObject v_term) {
        rplacd(item, v_term);
        return item;
    }

    public static SubLObject set_fht_suid_item(final SubLObject item, final SubLObject suid) {
        rplacd(item, suid);
        return item;
    }

    public static SubLObject deleted_unrepresented_term_itemP(final SubLObject item) {
        return is_unrepresented_term_tombstoneP(gethash_without_values(item, $unrepresented_term_change_set$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject is_unrepresented_term_tombstoneP(final SubLObject v_object) {
        return eq($unrepresented_terms_tombstone$.getGlobalValue(), v_object);
    }

    public static SubLObject create_unrepresented_term_fht(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_item = new_fht_term_item();
        final SubLObject suid_item = new_fht_suid_item();
        final SubLObject message = cconcatenate($$$Creating_unrepresented_term_FHT_, format_nil.format_nil_a_no_copy(filename));
        SubLObject f_fht = NIL;
        f_fht = file_hash_table.fast_create_file_hash_table(filename, file_utilities.temp_directory(), EQUAL, $IMAGE_INDEPENDENT_CFASL);
        if (NIL != use_unrepresented_term_fhtP()) {
            SubLObject msg = cconcatenate(message, $str57$____Old_Space);
            SubLObject release = NIL;
            try {
                release = seize_lock($unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = get_unrepresented_term_fht();
                $progress_note$.setDynamicValue(msg, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject continuation = NIL;
                        SubLObject next;
                        for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject v_term = the_value;
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if ((NIL == deleted_unrepresented_term_itemP(key)) && (NIL != fht_suid_item_p(key))) {
                                    final SubLObject suid = get_fht_suid_item_suid(key);
                                    set_fht_suid_item(suid_item, suid);
                                    file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term);
                                    set_fht_term_item(term_item, v_term);
                                    file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid);
                                }
                            }
                            continuation = next;
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = cconcatenate(message, $str58$____New_Space);
            if (NIL != use_unrepresented_term_fhtP()) {
                final SubLObject list_var = get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject suid_item_$26 = NIL;
                        suid_item_$26 = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            final SubLObject suid2 = get_fht_suid_item_suid(suid_item_$26);
                            final SubLObject v_term2 = find_unrepresented_term_by_suid(suid2);
                            set_fht_suid_item(suid_item, suid2);
                            file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term2);
                            set_fht_term_item(term_item, v_term2);
                            file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid2);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item_$26 = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject table_var = do_unrepresented_terms_table();
                final SubLObject first_id_var = new_unrepresented_term_id_threshold();
                final SubLObject total = subtract(id_index_next_id(table_var), first_id_var);
                SubLObject sofar = ZERO_INTEGER;
                final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(msg);
                        SubLObject v_term;
                        SubLObject suid;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id;
                        for (end = end_var = id_index_next_id(table_var), id = NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                            v_term = id_index_lookup(table_var, id, UNPROVIDED);
                            if (NIL != v_term) {
                                note_percent_progress(sofar, total);
                                sofar = add(sofar, ONE_INTEGER);
                                suid = unrepresented_term_suid(v_term);
                                set_fht_suid_item(suid_item, suid);
                                file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term);
                                set_fht_term_item(term_item, v_term);
                                file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        } else {
            final SubLObject idx = do_unrepresented_terms_table();
            final SubLObject mess = message;
            final SubLObject total2 = id_index_count(idx);
            SubLObject sofar2 = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$29 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$29, $SKIP)) {
                        final SubLObject idx_$30 = idx_$29;
                        if (NIL == id_index_dense_objects_empty_p(idx_$30, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$30);
                            final SubLObject backwardP_var = NIL;
                            SubLObject suid;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject v_term3;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                suid = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                v_term3 = aref(vector_var, suid);
                                if ((NIL == id_index_tombstone_p(v_term3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(v_term3)) {
                                        v_term3 = $SKIP;
                                    }
                                    set_fht_suid_item(suid_item, suid);
                                    file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term3);
                                    set_fht_term_item(term_item, v_term3);
                                    file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid);
                                    sofar2 = add(sofar2, ONE_INTEGER);
                                    note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$31 = idx_$29;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$31)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$31);
                            SubLObject suid3 = id_index_sparse_id_threshold(idx_$31);
                            final SubLObject end_id = id_index_next_id(idx_$31);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (suid3.numL(end_id)) {
                                final SubLObject v_term2 = gethash_without_values(suid3, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                    set_fht_suid_item(suid_item, suid3);
                                    file_hash_table.fast_put_file_hash_table(suid_item, f_fht, v_term2);
                                    set_fht_term_item(term_item, v_term2);
                                    file_hash_table.fast_put_file_hash_table(term_item, f_fht, suid3);
                                    sofar2 = add(sofar2, ONE_INTEGER);
                                    note_percent_progress(sofar2, total2);
                                }
                                suid3 = add(suid3, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_16, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        file_hash_table.finalize_fast_create_file_hash_table(f_fht, UNPROVIDED, UNPROVIDED);
        return filename;
    }

    public static SubLObject initialize_unrepresented_term_caches() {
        final SubLObject fht_file = misc_utilities.get_hl_store_cache_filename($str84$unrepresented_terms, $$$fht);
        if (NIL != Filesys.probe_file(fht_file)) {
            initialize_unrepresented_term_cache_fht(fht_file);
            return $INITIALIZED;
        }
        return $UNINITIALIZED;
    }

    public static SubLObject initialize_unrepresented_term_cache_fht(final SubLObject fht_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($unrepresented_term_fht_lock$.getGlobalValue());
            if (NIL != file_hash_table.file_hash_table_p($unrepresented_term_fht$.getGlobalValue())) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            file_hash_table.finalize_file_hash_table($unrepresented_term_fht$.getGlobalValue());
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
            }
            reconnect_unrepresented_term_fht(fht_file);
        } finally {
            if (NIL != release) {
                release_lock($unrepresented_term_fht_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject reconnect_unrepresented_term_fht(final SubLObject filename) {
        $unrepresented_term_fht$.setGlobalValue(file_hash_table.open_file_hash_table_read_only(filename, EQUAL, $IMAGE_INDEPENDENT_CFASL));
        return file_hash_table.file_hash_table_p($unrepresented_term_fht$.getGlobalValue());
    }

    public static SubLObject setup_unrepresented_term_fht_new_space(final SubLObject max_suid) {
        $unrepresented_term_isg$.setGlobalValue(integer_sequence_generator.new_integer_sequence_generator(max_suid, UNPROVIDED, UNPROVIDED));
        return max_suid;
    }

    public static SubLObject clear_unrepresented_term_fht() {
        $unrepresented_term_fht$.setGlobalValue(NIL);
        $unrepresented_term_change_set$.setGlobalValue(make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED));
        $unrepresented_term_isg$.setGlobalValue(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject lookup_unrepresented_term_by_suid_fht(final SubLObject suid) {
        final SubLObject suid_key = set_fht_suid_item(new_fht_suid_item(), suid);
        SubLObject v_term = gethash_without_values(suid_key, $unrepresented_term_change_set$.getGlobalValue(), UNPROVIDED);
        if (v_term.eql($unrepresented_terms_tombstone$.getGlobalValue())) {
            return NIL;
        }
        if (((NIL == v_term) && (NIL != is_unrepresented_term_suid_old_spaceP(suid))) && (NIL != file_hash_table.file_hash_table_p($unrepresented_term_fht$.getGlobalValue()))) {
            SubLObject release = NIL;
            try {
                release = seize_lock($unrepresented_term_fht_lock$.getGlobalValue());
                v_term = file_hash_table.get_file_hash_table(suid_key, $unrepresented_term_fht$.getGlobalValue(), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock($unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
        }
        return v_term;
    }

    public static SubLObject lookup_unrepresented_term_suid_fht(final SubLObject v_term) {
        final SubLObject term_key = set_fht_term_item(new_fht_term_item(), v_term);
        SubLObject suid = gethash_without_values(term_key, $unrepresented_term_change_set$.getGlobalValue(), UNPROVIDED);
        if (suid.eql($unrepresented_terms_tombstone$.getGlobalValue())) {
            return NIL;
        }
        if ((NIL == suid) && (NIL != file_hash_table.file_hash_table_p($unrepresented_term_fht$.getGlobalValue()))) {
            SubLObject release = NIL;
            try {
                release = seize_lock($unrepresented_term_fht_lock$.getGlobalValue());
                suid = file_hash_table.get_file_hash_table(term_key, $unrepresented_term_fht$.getGlobalValue(), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock($unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
        }
        return suid;
    }

    public static SubLObject get_unrepresented_term_min_new_suid() {
        return integer_sequence_generator.get_integer_sequence_generator_start($unrepresented_term_isg$.getGlobalValue());
    }

    public static SubLObject is_unrepresented_term_suid_old_spaceP(final SubLObject suid) {
        return numL(suid, get_unrepresented_term_min_new_suid());
    }

    public static SubLObject register_unrepresented_term_suid_fht(final SubLObject v_term, final SubLObject suid) {
        sethash(set_fht_suid_item(new_fht_suid_item(), suid), $unrepresented_term_change_set$.getGlobalValue(), v_term);
        sethash(set_fht_term_item(new_fht_term_item(), v_term), $unrepresented_term_change_set$.getGlobalValue(), suid);
        return T;
    }

    public static SubLObject deregister_unrepresented_term_suid_fht(final SubLObject suid) {
        final SubLObject v_term = lookup_unrepresented_term_by_suid_fht(suid);
        if (NIL != v_term) {
            final SubLObject suid_key = set_fht_suid_item(new_fht_suid_item(), suid);
            final SubLObject term_key = set_fht_term_item(new_fht_term_item(), v_term);
            if (NIL != is_unrepresented_term_suid_old_spaceP(suid)) {
                sethash(suid_key, $unrepresented_term_change_set$.getGlobalValue(), $unrepresented_terms_tombstone$.getGlobalValue());
                sethash(term_key, $unrepresented_term_change_set$.getGlobalValue(), $unrepresented_terms_tombstone$.getGlobalValue());
            } else {
                remhash(suid_key, $unrepresented_term_change_set$.getGlobalValue());
                remhash(term_key, $unrepresented_term_change_set$.getGlobalValue());
            }
        }
        return list_utilities.sublisp_boolean(v_term);
    }

    public static SubLObject get_unrepresented_term_new_space_suid_keys() {
        final SubLObject change_set = get_unrepresented_term_change_set();
        SubLObject keys = NIL;
        if (NIL != change_set) {
            SubLObject key = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(change_set);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    if ((NIL != fht_suid_item_p(key)) && (NIL == is_unrepresented_term_tombstoneP(value))) {
                        keys = cons(key, keys);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return keys;
    }

    public static SubLObject get_unrepresented_term_new_space_ascending_suid_keys() {
        return Sort.sort(get_unrepresented_term_new_space_suid_keys(), $sym90$_, GET_FHT_SUID_ITEM_SUID);
    }

    public static final SubLObject declare_unrepresented_terms_file_alt() {
        declareFunction("new_unrepresented_terms_iterator", "NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        declareMacro("do_kb_unrepresented_terms", "DO-KB-UNREPRESENTED-TERMS");
        declareMacro("do_old_unrepresented_terms", "DO-OLD-UNREPRESENTED-TERMS");
        declareMacro("do_new_unrepresented_terms", "DO-NEW-UNREPRESENTED-TERMS");
        declareFunction("do_unrepresented_terms_table", "DO-UNREPRESENTED-TERMS-TABLE", 0, 0, false);
        declareFunction("map_unrepresented_terms", "MAP-UNREPRESENTED-TERMS", 1, 0, false);
        declareMacro("do_kb_strings", "DO-KB-STRINGS");
        declareMacro("do_kb_numbers", "DO-KB-NUMBERS");
        declareFunction("setup_unrepresented_term_suid_table", "SETUP-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
        declareFunction("finalize_unrepresented_term_suid_table", "FINALIZE-UNREPRESENTED-TERM-SUID-TABLE", 0, 1, false);
        declareFunction("clear_unrepresented_term_suid_table", "CLEAR-UNREPRESENTED-TERM-SUID-TABLE", 0, 0, false);
        declareFunction("kb_unrepresented_term_count", "KB-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        declareFunction("lookup_unrepresented_term_by_suid", "LOOKUP-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
        declareFunction("lookup_unrepresented_term_suid", "LOOKUP-UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("next_unrepresented_term_suid", "NEXT-UNREPRESENTED-TERM-SUID", 0, 0, false);
        declareFunction("new_unrepresented_term_suid_threshold", "NEW-UNREPRESENTED-TERM-SUID-THRESHOLD", 0, 0, false);
        declareFunction("unrepresented_term_tables_setupP", "UNREPRESENTED-TERM-TABLES-SETUP?", 0, 0, false);
        declareFunction("find_unrepresented_term_by_suid", "FIND-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
        declareFunction("unrepresented_term_suid", "UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("kb_unrepresented_term_p", "KB-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction("set_next_unrepresented_term_suid", "SET-NEXT-UNREPRESENTED-TERM-SUID", 0, 1, false);
        declareFunction("register_unrepresented_term_suid", "REGISTER-UNREPRESENTED-TERM-SUID", 2, 0, false);
        declareFunction("deregister_unrepresented_term_suid", "DEREGISTER-UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("make_unrepresented_term_suid", "MAKE-UNREPRESENTED-TERM-SUID", 0, 0, false);
        declareFunction("find_or_create_unrepresented_term_suid", "FIND-OR-CREATE-UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("finalize_unrepresented_terms", "FINALIZE-UNREPRESENTED-TERMS", 0, 1, false);
        declareFunction("unrepresented_term_index", "UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("setup_unrepresented_term_table", "SETUP-UNREPRESENTED-TERM-TABLE", 2, 0, false);
        declareFunction("clear_unrepresented_term_table", "CLEAR-UNREPRESENTED-TERM-TABLE", 0, 0, false);
        declareFunction("reset_unrepresented_term_index", "RESET-UNREPRESENTED-TERM-INDEX", 2, 1, false);
        declareFunction("clear_unrepresented_term_index", "CLEAR-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("remove_unrepresented_term_index", "REMOVE-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("unrepresented_term_dump_id", "UNREPRESENTED-TERM-DUMP-ID", 1, 0, false);
        declareFunction("find_unrepresented_term_by_dump_id", "FIND-UNREPRESENTED-TERM-BY-DUMP-ID", 1, 0, false);
        declareMacro("with_unrepresented_term_dump_id_table", "WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");
        declareFunction("create_unrepresented_term_dump_id_table", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_unrepresented_terms_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_old_unrepresented_terms", "DO-OLD-UNREPRESENTED-TERMS");
            declareMacro("do_new_unrepresented_ids_and_terms", "DO-NEW-UNREPRESENTED-IDS-AND-TERMS");
            declareMacro("do_unrepresented_ids_and_terms", "DO-UNREPRESENTED-IDS-AND-TERMS");
            declareMacro("do_new_unrepresented_terms", "DO-NEW-UNREPRESENTED-TERMS");
            declareMacro("do_kb_unrepresented_terms", "DO-KB-UNREPRESENTED-TERMS");
            declareMacro("do_kb_strings", "DO-KB-STRINGS");
            declareMacro("do_kb_numbers", "DO-KB-NUMBERS");
            declareFunction("setup_unrepresented_term_suid_table", "SETUP-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
            declareFunction("finalize_unrepresented_term_suid_table", "FINALIZE-UNREPRESENTED-TERM-SUID-TABLE", 0, 1, false);
            declareFunction("clear_unrepresented_term_suid_table", "CLEAR-UNREPRESENTED-TERM-SUID-TABLE", 0, 0, false);
            declareFunction("set_next_unrepresented_term_suid", "SET-NEXT-UNREPRESENTED-TERM-SUID", 0, 1, false);
            declareFunction("lookup_unrepresented_term_by_suid_table", "LOOKUP-UNREPRESENTED-TERM-BY-SUID-TABLE", 1, 0, false);
            declareFunction("lookup_unrepresented_term_suid_map", "LOOKUP-UNREPRESENTED-TERM-SUID-MAP", 1, 0, false);
            declareFunction("register_unrepresented_term_suid_table", "REGISTER-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
            declareFunction("deregister_unrepresented_term_suid_table", "DEREGISTER-UNREPRESENTED-TERM-SUID-TABLE", 1, 0, false);
            declareFunction("use_unrepresented_term_fhtP", "USE-UNREPRESENTED-TERM-FHT?", 0, 0, false);
            declareFunction("get_unrepresented_term_fht", "GET-UNREPRESENTED-TERM-FHT", 0, 0, false);
            declareFunction("get_unrepresented_term_change_set", "GET-UNREPRESENTED-TERM-CHANGE-SET", 0, 0, false);
            declareFunction("new_unrepresented_terms_iterator", "NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
            declareFunction("construct_unrepresented_terms_fht_based_iterator", "CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR", 0, 0, false);
            declareFunction("do_unrepresented_terms_table", "DO-UNREPRESENTED-TERMS-TABLE", 0, 0, false);
            declareFunction("map_unrepresented_terms", "MAP-UNREPRESENTED-TERMS", 1, 0, false);
            declareFunction("new_new_unrepresented_terms_iterator", "NEW-NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
            declareFunction("new_unrepresented_terms_table_entryP", "NEW-UNREPRESENTED-TERMS-TABLE-ENTRY?", 2, 0, false);
            declareFunction("unrepresented_terms_table_tuple_to_unrepresented_term", "UNREPRESENTED-TERMS-TABLE-TUPLE-TO-UNREPRESENTED-TERM", 1, 0, false);
            declareFunction("deleted_unrepresented_term_id_iterator", "DELETED-UNREPRESENTED-TERM-ID-ITERATOR", 0, 0, false);
            declareFunction("has_new_unrepresented_termsP", "HAS-NEW-UNREPRESENTED-TERMS?", 0, 0, false);
            declareFunction("kb_unrepresented_term_count", "KB-UNREPRESENTED-TERM-COUNT", 0, 0, false);
            declareFunction("new_unrepresented_term_id_threshold", "NEW-UNREPRESENTED-TERM-ID-THRESHOLD", 0, 0, false);
            declareFunction("set_new_unrepresented_term_id_threshold", "SET-NEW-UNREPRESENTED-TERM-ID-THRESHOLD", 1, 0, false);
            declareFunction("old_unrepresented_term_count", "OLD-UNREPRESENTED-TERM-COUNT", 0, 0, false);
            declareFunction("new_unrepresented_term_count", "NEW-UNREPRESENTED-TERM-COUNT", 0, 0, false);
            declareFunction("compute_kb_unrepresented_term_count_fht", "COMPUTE-KB-UNREPRESENTED-TERM-COUNT-FHT", 0, 1, false);
            declareFunction("get_kb_unrepresented_term_old_space_size", "GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE", 0, 0, false);
            declareFunction("get_kb_unrepresented_term_raw_new_space_size", "GET-KB-UNREPRESENTED-TERM-RAW-NEW-SPACE-SIZE", 0, 0, false);
            declareFunction("get_kb_unrepresented_term_max_suid", "GET-KB-UNREPRESENTED-TERM-MAX-SUID", 0, 0, false);
            declareFunction("lookup_unrepresented_term_by_suid", "LOOKUP-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
            declareFunction("lookup_unrepresented_term_suid", "LOOKUP-UNREPRESENTED-TERM-SUID", 1, 0, false);
            declareFunction("find_unrepresented_term_by_suid", "FIND-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
            declareFunction("unrepresented_term_suid", "UNREPRESENTED-TERM-SUID", 1, 0, false);
            declareFunction("kb_unrepresented_term_p", "KB-UNREPRESENTED-TERM-P", 1, 0, false);
            declareFunction("register_unrepresented_term_suid", "REGISTER-UNREPRESENTED-TERM-SUID", 2, 0, false);
            declareFunction("register_unrepresented_term_suid_new", "REGISTER-UNREPRESENTED-TERM-SUID-NEW", 4, 0, false);
            declareFunction("deregister_unrepresented_term_suid", "DEREGISTER-UNREPRESENTED-TERM-SUID", 1, 0, false);
            declareFunction("make_unrepresented_term_suid", "MAKE-UNREPRESENTED-TERM-SUID", 0, 0, false);
            declareFunction("next_unrepresented_term_suid", "NEXT-UNREPRESENTED-TERM-SUID", 0, 0, false);
            declareFunction("find_or_create_unrepresented_term_suid", "FIND-OR-CREATE-UNREPRESENTED-TERM-SUID", 1, 0, false);
            declareFunction("finalize_unrepresented_terms", "FINALIZE-UNREPRESENTED-TERMS", 0, 1, false);
            declareFunction("unrepresented_term_index", "UNREPRESENTED-TERM-INDEX", 1, 0, false);
            declareFunction("unrepresented_term_index_swapped_inP", "UNREPRESENTED-TERM-INDEX-SWAPPED-IN?", 1, 0, false);
            declareFunction("setup_unrepresented_term_table", "SETUP-UNREPRESENTED-TERM-TABLE", 2, 0, false);
            declareFunction("clear_unrepresented_term_table", "CLEAR-UNREPRESENTED-TERM-TABLE", 0, 0, false);
            declareFunction("reset_unrepresented_term_index", "RESET-UNREPRESENTED-TERM-INDEX", 2, 1, false);
            declareFunction("clear_unrepresented_term_index", "CLEAR-UNREPRESENTED-TERM-INDEX", 1, 0, false);
            declareFunction("remove_unrepresented_term_index", "REMOVE-UNREPRESENTED-TERM-INDEX", 1, 0, false);
            declareFunction("unrepresented_term_dump_id", "UNREPRESENTED-TERM-DUMP-ID", 1, 0, false);
            declareFunction("find_unrepresented_term_by_dump_id", "FIND-UNREPRESENTED-TERM-BY-DUMP-ID", 1, 0, false);
            declareMacro("with_unrepresented_term_dump_id_table", "WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");
            declareFunction("create_unrepresented_term_dump_id_table", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE", 0, 0, false);
            declareFunction("create_unrepresented_term_dump_id_table_fht", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE-FHT", 0, 0, false);
            declareFunction("new_fht_term_item", "NEW-FHT-TERM-ITEM", 0, 0, false);
            declareFunction("new_fht_suid_item", "NEW-FHT-SUID-ITEM", 0, 0, false);
            declareFunction("fht_term_item_p", "FHT-TERM-ITEM-P", 1, 0, false);
            declareFunction("fht_suid_item_p", "FHT-SUID-ITEM-P", 1, 0, false);
            declareFunction("get_fht_term_item_term", "GET-FHT-TERM-ITEM-TERM", 1, 0, false);
            declareFunction("get_fht_suid_item_suid", "GET-FHT-SUID-ITEM-SUID", 1, 0, false);
            declareFunction("set_fht_term_item", "SET-FHT-TERM-ITEM", 2, 0, false);
            declareFunction("set_fht_suid_item", "SET-FHT-SUID-ITEM", 2, 0, false);
            declareFunction("deleted_unrepresented_term_itemP", "DELETED-UNREPRESENTED-TERM-ITEM?", 1, 0, false);
            declareFunction("is_unrepresented_term_tombstoneP", "IS-UNREPRESENTED-TERM-TOMBSTONE?", 1, 0, false);
            declareFunction("create_unrepresented_term_fht", "CREATE-UNREPRESENTED-TERM-FHT", 1, 0, false);
            declareFunction("initialize_unrepresented_term_caches", "INITIALIZE-UNREPRESENTED-TERM-CACHES", 0, 0, false);
            declareFunction("initialize_unrepresented_term_cache_fht", "INITIALIZE-UNREPRESENTED-TERM-CACHE-FHT", 1, 0, false);
            declareFunction("reconnect_unrepresented_term_fht", "RECONNECT-UNREPRESENTED-TERM-FHT", 1, 0, false);
            declareFunction("setup_unrepresented_term_fht_new_space", "SETUP-UNREPRESENTED-TERM-FHT-NEW-SPACE", 1, 0, false);
            declareFunction("clear_unrepresented_term_fht", "CLEAR-UNREPRESENTED-TERM-FHT", 0, 0, false);
            declareFunction("lookup_unrepresented_term_by_suid_fht", "LOOKUP-UNREPRESENTED-TERM-BY-SUID-FHT", 1, 0, false);
            declareFunction("lookup_unrepresented_term_suid_fht", "LOOKUP-UNREPRESENTED-TERM-SUID-FHT", 1, 0, false);
            declareFunction("get_unrepresented_term_min_new_suid", "GET-UNREPRESENTED-TERM-MIN-NEW-SUID", 0, 0, false);
            declareFunction("is_unrepresented_term_suid_old_spaceP", "IS-UNREPRESENTED-TERM-SUID-OLD-SPACE?", 1, 0, false);
            declareFunction("register_unrepresented_term_suid_fht", "REGISTER-UNREPRESENTED-TERM-SUID-FHT", 2, 0, false);
            declareFunction("deregister_unrepresented_term_suid_fht", "DEREGISTER-UNREPRESENTED-TERM-SUID-FHT", 1, 0, false);
            declareFunction("get_unrepresented_term_new_space_suid_keys", "GET-UNREPRESENTED-TERM-NEW-SPACE-SUID-KEYS", 0, 0, false);
            declareFunction("get_unrepresented_term_new_space_ascending_suid_keys", "GET-UNREPRESENTED-TERM-NEW-SPACE-ASCENDING-SUID-KEYS", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("new_unrepresented_term_suid_threshold", "NEW-UNREPRESENTED-TERM-SUID-THRESHOLD", 0, 0, false);
            declareFunction("unrepresented_term_tables_setupP", "UNREPRESENTED-TERM-TABLES-SETUP?", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_unrepresented_terms_file_Previous() {
        declareMacro("do_old_unrepresented_terms", "DO-OLD-UNREPRESENTED-TERMS");
        declareMacro("do_new_unrepresented_ids_and_terms", "DO-NEW-UNREPRESENTED-IDS-AND-TERMS");
        declareMacro("do_unrepresented_ids_and_terms", "DO-UNREPRESENTED-IDS-AND-TERMS");
        declareMacro("do_new_unrepresented_terms", "DO-NEW-UNREPRESENTED-TERMS");
        declareMacro("do_kb_unrepresented_terms", "DO-KB-UNREPRESENTED-TERMS");
        declareMacro("do_kb_strings", "DO-KB-STRINGS");
        declareMacro("do_kb_numbers", "DO-KB-NUMBERS");
        declareFunction("setup_unrepresented_term_suid_table", "SETUP-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
        declareFunction("finalize_unrepresented_term_suid_table", "FINALIZE-UNREPRESENTED-TERM-SUID-TABLE", 0, 1, false);
        declareFunction("clear_unrepresented_term_suid_table", "CLEAR-UNREPRESENTED-TERM-SUID-TABLE", 0, 0, false);
        declareFunction("set_next_unrepresented_term_suid", "SET-NEXT-UNREPRESENTED-TERM-SUID", 0, 1, false);
        declareFunction("lookup_unrepresented_term_by_suid_table", "LOOKUP-UNREPRESENTED-TERM-BY-SUID-TABLE", 1, 0, false);
        declareFunction("lookup_unrepresented_term_suid_map", "LOOKUP-UNREPRESENTED-TERM-SUID-MAP", 1, 0, false);
        declareFunction("register_unrepresented_term_suid_table", "REGISTER-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
        declareFunction("deregister_unrepresented_term_suid_table", "DEREGISTER-UNREPRESENTED-TERM-SUID-TABLE", 1, 0, false);
        declareFunction("use_unrepresented_term_fhtP", "USE-UNREPRESENTED-TERM-FHT?", 0, 0, false);
        declareFunction("get_unrepresented_term_fht", "GET-UNREPRESENTED-TERM-FHT", 0, 0, false);
        declareFunction("get_unrepresented_term_change_set", "GET-UNREPRESENTED-TERM-CHANGE-SET", 0, 0, false);
        declareFunction("new_unrepresented_terms_iterator", "NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        declareFunction("construct_unrepresented_terms_fht_based_iterator", "CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR", 0, 0, false);
        declareFunction("do_unrepresented_terms_table", "DO-UNREPRESENTED-TERMS-TABLE", 0, 0, false);
        declareFunction("map_unrepresented_terms", "MAP-UNREPRESENTED-TERMS", 1, 0, false);
        declareFunction("new_new_unrepresented_terms_iterator", "NEW-NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
        declareFunction("new_unrepresented_terms_table_entryP", "NEW-UNREPRESENTED-TERMS-TABLE-ENTRY?", 2, 0, false);
        declareFunction("unrepresented_terms_table_tuple_to_unrepresented_term", "UNREPRESENTED-TERMS-TABLE-TUPLE-TO-UNREPRESENTED-TERM", 1, 0, false);
        declareFunction("deleted_unrepresented_term_id_iterator", "DELETED-UNREPRESENTED-TERM-ID-ITERATOR", 0, 0, false);
        declareFunction("has_new_unrepresented_termsP", "HAS-NEW-UNREPRESENTED-TERMS?", 0, 0, false);
        declareFunction("kb_unrepresented_term_count", "KB-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        declareFunction("new_unrepresented_term_id_threshold", "NEW-UNREPRESENTED-TERM-ID-THRESHOLD", 0, 0, false);
        declareFunction("set_new_unrepresented_term_id_threshold", "SET-NEW-UNREPRESENTED-TERM-ID-THRESHOLD", 1, 0, false);
        declareFunction("old_unrepresented_term_count", "OLD-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        declareFunction("new_unrepresented_term_count", "NEW-UNREPRESENTED-TERM-COUNT", 0, 0, false);
        declareFunction("compute_kb_unrepresented_term_count_fht", "COMPUTE-KB-UNREPRESENTED-TERM-COUNT-FHT", 0, 1, false);
        declareFunction("get_kb_unrepresented_term_old_space_size", "GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE", 0, 0, false);
        declareFunction("get_kb_unrepresented_term_raw_new_space_size", "GET-KB-UNREPRESENTED-TERM-RAW-NEW-SPACE-SIZE", 0, 0, false);
        declareFunction("get_kb_unrepresented_term_max_suid", "GET-KB-UNREPRESENTED-TERM-MAX-SUID", 0, 0, false);
        declareFunction("lookup_unrepresented_term_by_suid", "LOOKUP-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
        declareFunction("lookup_unrepresented_term_suid", "LOOKUP-UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("find_unrepresented_term_by_suid", "FIND-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
        declareFunction("unrepresented_term_suid", "UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("kb_unrepresented_term_p", "KB-UNREPRESENTED-TERM-P", 1, 0, false);
        declareFunction("register_unrepresented_term_suid", "REGISTER-UNREPRESENTED-TERM-SUID", 2, 0, false);
        declareFunction("register_unrepresented_term_suid_new", "REGISTER-UNREPRESENTED-TERM-SUID-NEW", 4, 0, false);
        declareFunction("deregister_unrepresented_term_suid", "DEREGISTER-UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("make_unrepresented_term_suid", "MAKE-UNREPRESENTED-TERM-SUID", 0, 0, false);
        declareFunction("next_unrepresented_term_suid", "NEXT-UNREPRESENTED-TERM-SUID", 0, 0, false);
        declareFunction("find_or_create_unrepresented_term_suid", "FIND-OR-CREATE-UNREPRESENTED-TERM-SUID", 1, 0, false);
        declareFunction("finalize_unrepresented_terms", "FINALIZE-UNREPRESENTED-TERMS", 0, 1, false);
        declareFunction("unrepresented_term_index", "UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("unrepresented_term_index_swapped_inP", "UNREPRESENTED-TERM-INDEX-SWAPPED-IN?", 1, 0, false);
        declareFunction("setup_unrepresented_term_table", "SETUP-UNREPRESENTED-TERM-TABLE", 2, 0, false);
        declareFunction("clear_unrepresented_term_table", "CLEAR-UNREPRESENTED-TERM-TABLE", 0, 0, false);
        declareFunction("reset_unrepresented_term_index", "RESET-UNREPRESENTED-TERM-INDEX", 2, 1, false);
        declareFunction("clear_unrepresented_term_index", "CLEAR-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("remove_unrepresented_term_index", "REMOVE-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("unrepresented_term_dump_id", "UNREPRESENTED-TERM-DUMP-ID", 1, 0, false);
        declareFunction("find_unrepresented_term_by_dump_id", "FIND-UNREPRESENTED-TERM-BY-DUMP-ID", 1, 0, false);
        declareMacro("with_unrepresented_term_dump_id_table", "WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");
        declareFunction("create_unrepresented_term_dump_id_table", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE", 0, 0, false);
        declareFunction("create_unrepresented_term_dump_id_table_fht", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE-FHT", 0, 0, false);
        declareFunction("new_fht_term_item", "NEW-FHT-TERM-ITEM", 0, 0, false);
        declareFunction("new_fht_suid_item", "NEW-FHT-SUID-ITEM", 0, 0, false);
        declareFunction("fht_term_item_p", "FHT-TERM-ITEM-P", 1, 0, false);
        declareFunction("fht_suid_item_p", "FHT-SUID-ITEM-P", 1, 0, false);
        declareFunction("get_fht_term_item_term", "GET-FHT-TERM-ITEM-TERM", 1, 0, false);
        declareFunction("get_fht_suid_item_suid", "GET-FHT-SUID-ITEM-SUID", 1, 0, false);
        declareFunction("set_fht_term_item", "SET-FHT-TERM-ITEM", 2, 0, false);
        declareFunction("set_fht_suid_item", "SET-FHT-SUID-ITEM", 2, 0, false);
        declareFunction("deleted_unrepresented_term_itemP", "DELETED-UNREPRESENTED-TERM-ITEM?", 1, 0, false);
        declareFunction("is_unrepresented_term_tombstoneP", "IS-UNREPRESENTED-TERM-TOMBSTONE?", 1, 0, false);
        declareFunction("create_unrepresented_term_fht", "CREATE-UNREPRESENTED-TERM-FHT", 1, 0, false);
        declareFunction("initialize_unrepresented_term_caches", "INITIALIZE-UNREPRESENTED-TERM-CACHES", 0, 0, false);
        declareFunction("initialize_unrepresented_term_cache_fht", "INITIALIZE-UNREPRESENTED-TERM-CACHE-FHT", 1, 0, false);
        declareFunction("reconnect_unrepresented_term_fht", "RECONNECT-UNREPRESENTED-TERM-FHT", 1, 0, false);
        declareFunction("setup_unrepresented_term_fht_new_space", "SETUP-UNREPRESENTED-TERM-FHT-NEW-SPACE", 1, 0, false);
        declareFunction("clear_unrepresented_term_fht", "CLEAR-UNREPRESENTED-TERM-FHT", 0, 0, false);
        declareFunction("lookup_unrepresented_term_by_suid_fht", "LOOKUP-UNREPRESENTED-TERM-BY-SUID-FHT", 1, 0, false);
        declareFunction("lookup_unrepresented_term_suid_fht", "LOOKUP-UNREPRESENTED-TERM-SUID-FHT", 1, 0, false);
        declareFunction("get_unrepresented_term_min_new_suid", "GET-UNREPRESENTED-TERM-MIN-NEW-SUID", 0, 0, false);
        declareFunction("is_unrepresented_term_suid_old_spaceP", "IS-UNREPRESENTED-TERM-SUID-OLD-SPACE?", 1, 0, false);
        declareFunction("register_unrepresented_term_suid_fht", "REGISTER-UNREPRESENTED-TERM-SUID-FHT", 2, 0, false);
        declareFunction("deregister_unrepresented_term_suid_fht", "DEREGISTER-UNREPRESENTED-TERM-SUID-FHT", 1, 0, false);
        declareFunction("get_unrepresented_term_new_space_suid_keys", "GET-UNREPRESENTED-TERM-NEW-SPACE-SUID-KEYS", 0, 0, false);
        declareFunction("get_unrepresented_term_new_space_ascending_suid_keys", "GET-UNREPRESENTED-TERM-NEW-SPACE-ASCENDING-SUID-KEYS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_unrepresented_terms_file_alt() {
        deflexical("*UNREPRESENTED-TERM-TO-SUID*", NIL != boundp($unrepresented_term_to_suid$) ? ((SubLObject) ($unrepresented_term_to_suid$.getGlobalValue())) : NIL);
        deflexical("*UNREPRESENTED-TERM-FROM-SUID*", NIL != boundp($unrepresented_term_from_suid$) ? ((SubLObject) ($unrepresented_term_from_suid$.getGlobalValue())) : NIL);
        defparameter("*UNREPRESENTED-TERM-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject init_unrepresented_terms_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*UNREPRESENTED-TERM-TO-SUID*", SubLTrampolineFile.maybeDefault($unrepresented_term_to_suid$, $unrepresented_term_to_suid$, NIL));
            deflexical("*UNREPRESENTED-TERM-FROM-SUID*", SubLTrampolineFile.maybeDefault($unrepresented_term_from_suid$, $unrepresented_term_from_suid$, NIL));
            deflexical("*USE-FHT-APPROACH-TO-UNREPRESENTED-TERMS?*", SubLTrampolineFile.maybeDefault($use_fht_approach_to_unrepresented_termsP$, $use_fht_approach_to_unrepresented_termsP$, NIL));
            deflexical("*UNREPRESENTED-TERM-FHT*", SubLTrampolineFile.maybeDefault($unrepresented_term_fht$, $unrepresented_term_fht$, NIL));
            deflexical("*UNREPRESENTED-TERM-ISG*", SubLTrampolineFile.maybeDefault($unrepresented_term_isg$, $unrepresented_term_isg$, NIL));
            deflexical("*UNREPRESENTED-TERM-CHANGE-SET*", SubLTrampolineFile.maybeDefault($unrepresented_term_change_set$, $unrepresented_term_change_set$, NIL));
            deflexical("*UNREPRESENTED-TERM-FHT-LOCK*", SubLTrampolineFile.maybeDefault($unrepresented_term_fht_lock$, $unrepresented_term_fht_lock$, () -> make_lock($$$Unrepresented_Terms_FHT_Lock)));
            deflexical("*UNREPRESENTED-TERMS-TOMBSTONE*", $DELETED);
            deflexical("*NEW-UNREPRESENTED-TERM-ID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_unrepresented_term_id_threshold$, $new_unrepresented_term_id_threshold$, NIL));
            defparameter("*UNREPRESENTED-TERM-DUMP-ID-TABLE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*UNREPRESENTED-TERM-TO-SUID*", NIL != boundp($unrepresented_term_to_suid$) ? ((SubLObject) ($unrepresented_term_to_suid$.getGlobalValue())) : NIL);
            deflexical("*UNREPRESENTED-TERM-FROM-SUID*", NIL != boundp($unrepresented_term_from_suid$) ? ((SubLObject) ($unrepresented_term_from_suid$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_unrepresented_terms_file_Previous() {
        deflexical("*UNREPRESENTED-TERM-TO-SUID*", SubLTrampolineFile.maybeDefault($unrepresented_term_to_suid$, $unrepresented_term_to_suid$, NIL));
        deflexical("*UNREPRESENTED-TERM-FROM-SUID*", SubLTrampolineFile.maybeDefault($unrepresented_term_from_suid$, $unrepresented_term_from_suid$, NIL));
        deflexical("*USE-FHT-APPROACH-TO-UNREPRESENTED-TERMS?*", SubLTrampolineFile.maybeDefault($use_fht_approach_to_unrepresented_termsP$, $use_fht_approach_to_unrepresented_termsP$, NIL));
        deflexical("*UNREPRESENTED-TERM-FHT*", SubLTrampolineFile.maybeDefault($unrepresented_term_fht$, $unrepresented_term_fht$, NIL));
        deflexical("*UNREPRESENTED-TERM-ISG*", SubLTrampolineFile.maybeDefault($unrepresented_term_isg$, $unrepresented_term_isg$, NIL));
        deflexical("*UNREPRESENTED-TERM-CHANGE-SET*", SubLTrampolineFile.maybeDefault($unrepresented_term_change_set$, $unrepresented_term_change_set$, NIL));
        deflexical("*UNREPRESENTED-TERM-FHT-LOCK*", SubLTrampolineFile.maybeDefault($unrepresented_term_fht_lock$, $unrepresented_term_fht_lock$, () -> make_lock($$$Unrepresented_Terms_FHT_Lock)));
        deflexical("*UNREPRESENTED-TERMS-TOMBSTONE*", $DELETED);
        deflexical("*NEW-UNREPRESENTED-TERM-ID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_unrepresented_term_id_threshold$, $new_unrepresented_term_id_threshold$, NIL));
        defparameter("*UNREPRESENTED-TERM-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_unrepresented_terms_file() {
        declare_defglobal($unrepresented_term_to_suid$);
        declare_defglobal($unrepresented_term_from_suid$);
        declare_defglobal($use_fht_approach_to_unrepresented_termsP$);
        declare_defglobal($unrepresented_term_fht$);
        declare_defglobal($unrepresented_term_isg$);
        declare_defglobal($unrepresented_term_change_set$);
        declare_defglobal($unrepresented_term_fht_lock$);
        register_macro_helper(DO_UNREPRESENTED_TERMS_TABLE, DO_KB_UNREPRESENTED_TERMS);
        note_funcall_helper_function($sym71$NEW_UNREPRESENTED_TERMS_TABLE_ENTRY_);
        note_funcall_helper_function(UNREPRESENTED_TERMS_TABLE_TUPLE_TO_UNREPRESENTED_TERM);
        declare_defglobal($new_unrepresented_term_id_threshold$);
        register_macro_helper(CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE, WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE);
        register_external_symbol(CREATE_UNREPRESENTED_TERM_FHT);
        return NIL;
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

    
}

/**
 * Total time: 999 ms
 */
