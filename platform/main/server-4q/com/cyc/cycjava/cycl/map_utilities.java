package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_hash_table$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class map_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new map_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.map_utilities";

    public static final String myFingerPrint = "6d12d99b3731176f6de0cfb2605867dc3df78230735b55359a9fbbb0ee04fffb";

    // deflexical
    private static final SubLSymbol $map_missing_key_token$ = makeSymbol("*MAP-MISSING-KEY-TOKEN*");

    // deflexical
    public static final SubLSymbol $is_map_object_p_method_table$ = makeSymbol("*IS-MAP-OBJECT-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_size_method_table$ = makeSymbol("*MAP-OBJECT-SIZE-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_test_method_table$ = makeSymbol("*MAP-OBJECT-TEST-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_put_method_table$ = makeSymbol("*MAP-OBJECT-PUT-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_put_unless_method_table$ = makeSymbol("*MAP-OBJECT-PUT-UNLESS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_get_method_table$ = makeSymbol("*MAP-OBJECT-GET-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_get_without_values_method_table$ = makeSymbol("*MAP-OBJECT-GET-WITHOUT-VALUES-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_remove_method_table$ = makeSymbol("*MAP-OBJECT-REMOVE-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_touch_method_table$ = makeSymbol("*MAP-OBJECT-TOUCH-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_change_set_method_table$ = makeSymbol("*MAP-OBJECT-CHANGE-SET-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $new_map_object_with_same_properties_method_table$ = makeSymbol("*NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_arbitrary_key_method_table$ = makeSymbol("*MAP-OBJECT-ARBITRARY-KEY-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $new_map_key_iterator_method_table$ = makeSymbol("*NEW-MAP-KEY-ITERATOR-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $new_map_object_iterator_method_table$ = makeSymbol("*NEW-MAP-OBJECT-ITERATOR-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_remove_all_method_table$ = makeSymbol("*MAP-OBJECT-REMOVE-ALL-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_keys_method_table$ = makeSymbol("*MAP-OBJECT-KEYS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_key_set_method_table$ = makeSymbol("*MAP-OBJECT-KEY-SET-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_object_values_method_table$ = makeSymbol("*MAP-OBJECT-VALUES-METHOD-TABLE*");



    public static final SubLList $list1 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MAP"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list2 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $sym6$VAR = makeUninternedSymbol("VAR");

    private static final SubLSymbol $sym7$ITERATOR = makeUninternedSymbol("ITERATOR");



    private static final SubLSymbol NEW_MAP_ITERATOR = makeSymbol("NEW-MAP-ITERATOR");





    private static final SubLSymbol $sym12$THE_MAP = makeUninternedSymbol("THE-MAP");

    private static final SubLSymbol $sym13$MESS = makeUninternedSymbol("MESS");

    private static final SubLSymbol $sym14$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym15$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLList $list16 = list(ZERO_INTEGER);

    private static final SubLSymbol MAP_SIZE = makeSymbol("MAP-SIZE");



    private static final SubLList $list19 = list(makeSymbol("STRINGP"));



    private static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");







    private static final SubLSymbol MAP_KEYS = makeSymbol("MAP-KEYS");

    private static final SubLSymbol MAP_GET_WITHOUT_VALUES = makeSymbol("MAP-GET-WITHOUT-VALUES");

    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLList $list28 = list(list(makeSymbol("KEY-VAR"), makeSymbol("MAP"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym29$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_MAP_KEY_ITERATOR = makeSymbol("NEW-MAP-KEY-ITERATOR");

    private static final SubLSymbol $sym31$THE_MAP = makeUninternedSymbol("THE-MAP");

    private static final SubLSymbol $sym32$MESS = makeUninternedSymbol("MESS");

    private static final SubLSymbol $sym33$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym34$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol DO_MAP_KEYS = makeSymbol("DO-MAP-KEYS");

    private static final SubLList $list36 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $$$MISSING = makeString("MISSING");

    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLString $str39$Invalid_map_format__Attempting_to = makeString("Invalid map format: Attempting to push values on a non listp ~a.~%");

    private static final SubLString $str40$Corrupted_map__attempting_to_remo = makeString("Corrupted map; attempting to remove a value from a non-LISTP ~a.~%");





    private static final SubLString $str43$Error__percentage__A_is_not_one_o = makeString("Error, percentage ~A is not one of 0-100 or 0-1.");

    private static final SubLString $str44$Cannot_compute_key_differences_in = makeString("Cannot compute key differences in the face of unclear key equality; ~A != ~A.");

    private static final SubLList $list45 = list(makeSymbol("KEY"), makeSymbol("OLD-VALUE"));

    private static final SubLList $list46 = list(makeSymbol("KEY"), makeSymbol("VAL"));



    private static final SubLSymbol IS_MAP_OBJECT_P_DICTIONARY_METHOD = makeSymbol("IS-MAP-OBJECT-P-DICTIONARY-METHOD");

    private static final SubLSymbol IS_MAP_OBJECT_P_HASH_TABLE_METHOD = makeSymbol("IS-MAP-OBJECT-P-HASH-TABLE-METHOD");

    private static final SubLSymbol IS_MAP_OBJECT_P_SET_METHOD = makeSymbol("IS-MAP-OBJECT-P-SET-METHOD");

    private static final SubLString $str51$_A_is_not_a_MAP_P_ = makeString("~A is not a MAP-P.");

    private static final SubLSymbol MAP_OBJECT_SIZE_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-SIZE-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_SIZE_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-SIZE-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_SIZE_SET_METHOD = makeSymbol("MAP-OBJECT-SIZE-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-TEST-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-TEST-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_SET_METHOD = makeSymbol("MAP-OBJECT-TEST-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-PUT-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-PUT-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_SET_METHOD = makeSymbol("MAP-OBJECT-PUT-SET-METHOD");



    private static final SubLSymbol MAP_OBJECT_PUT_UNLESS_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-PUT-UNLESS-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_UNLESS_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-PUT-UNLESS-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_UNLESS_SET_METHOD = makeSymbol("MAP-OBJECT-PUT-UNLESS-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-GET-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-GET-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_SET_METHOD = makeSymbol("MAP-OBJECT-GET-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_SET_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-REMOVE-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-REMOVE-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_SET_METHOD = makeSymbol("MAP-OBJECT-REMOVE-SET-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-DICTIONARY-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-HASH-TABLE-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SET_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_SET_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-SET-METHOD");



    private static final SubLSymbol NEW_MAP_KEY_ITERATOR_SET_METHOD = makeSymbol("NEW-MAP-KEY-ITERATOR-SET-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-DICTIONARY-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-HASH-TABLE-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_SET_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-SET-METHOD");



    private static final SubLSymbol ITERATOR_SET_QUA_MAP_DONE = makeSymbol("ITERATOR-SET-QUA-MAP-DONE");

    private static final SubLSymbol ITERATOR_SET_QUA_MAP_NEXT = makeSymbol("ITERATOR-SET-QUA-MAP-NEXT");

    private static final SubLSymbol ITERATOR_SET_QUA_MAP_FINALIZE = makeSymbol("ITERATOR-SET-QUA-MAP-FINALIZE");





    private static final SubLList $list91 = list(makeSymbol("SET-ITERATOR"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLList $list92 = list(makeSymbol("SET-ITERATOR"), makeSymbol("SET-QUA-MAP"), makeSymbol("KEY-VAL-TUPLE"));





    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_SET_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEYS_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-KEYS-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEYS_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-KEYS-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEYS_SET_METHOD = makeSymbol("MAP-OBJECT-KEYS-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEY_SET_SET_METHOD = makeSymbol("MAP-OBJECT-KEY-SET-SET-METHOD");

    private static final SubLSymbol MAP_OBJECT_VALUES_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-VALUES-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_VALUES_HASH_TABLE_METHOD = makeSymbol("MAP-OBJECT-VALUES-HASH-TABLE-METHOD");

    private static final SubLSymbol MAP_OBJECT_VALUES_SET_METHOD = makeSymbol("MAP-OBJECT-VALUES-SET-METHOD");

    private static final SubLSymbol TEST_HASH_TABLE_KEY_CONFLATION = makeSymbol("TEST-HASH-TABLE-KEY-CONFLATION");













    private static final SubLList $list112 = list(list(list(EQUALP, list(makeString("Sea"), makeString("sea"))), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("Sea"), makeString("sea") })), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("sea"), makeString("central") })), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("sea") })), makeKeyword("SUCCESS")));



    private static final SubLString $str114$Expected__A_entries__but_got__A_ = makeString("Expected ~A entries, but got ~A.");



    private static final SubLSymbol TEST_DO_MAP_OVER_SET_INTEGRITY = makeSymbol("TEST-DO-MAP-OVER-SET-INTEGRITY");

    private static final SubLList $list117 = list(list(list(ZERO_INTEGER), makeKeyword("SUCCESS")), list(list(FOUR_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(212)), makeKeyword("SUCCESS")));

    private static final SubLString $str118$Expected__S_and__S_to_be_identica = makeString("Expected ~S and ~S to be identical");

    private static final SubLString $str119$Expected__A_items__but_got__A_ = makeString("Expected ~A items, but got ~A.");

    public static SubLObject map_p(final SubLObject v_object) {
        return is_map_object_p(v_object);
    }

    public static SubLObject map_size(final SubLObject map) {
        return map_object_size(map);
    }

    public static SubLObject map_test(final SubLObject map) {
        return map_object_test(map);
    }

    public static SubLObject map_empty_p(final SubLObject map) {
        return zerop(map_size(map));
    }

    public static SubLObject map_test_symbol(final SubLObject map) {
        return hash_table_utilities.hash_test_to_symbol(map_test(map));
    }

    public static SubLObject map_put(final SubLObject map, final SubLObject key, final SubLObject value) {
        return map_object_put(map, key, value);
    }

    public static SubLObject map_put_unless(final SubLObject map, final SubLObject key, final SubLObject value, SubLObject test_func) {
        if (test_func == UNPROVIDED) {
            test_func = BOOLEAN;
        }
        return map_object_put_unless(map, key, value, test_func);
    }

    public static SubLObject map_get(final SubLObject map, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return map_object_get(map, key, not_found);
    }

    public static SubLObject map_get_without_values(final SubLObject map, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return map_object_get_without_values(map, key, not_found);
    }

    public static SubLObject map_remove(final SubLObject map, final SubLObject key) {
        return map_object_remove(map, key);
    }

    public static SubLObject map_remove_all(final SubLObject map) {
        return map_object_remove_all(map);
    }

    public static SubLObject map_touch(final SubLObject map, final SubLObject key) {
        return map_object_touch(map, key);
    }

    public static SubLObject map_change_set(final SubLObject map, SubLObject unchanged) {
        if (unchanged == UNPROVIDED) {
            unchanged = NIL;
        }
        return map_object_change_set(map, unchanged);
    }

    public static SubLObject new_map_iterator(final SubLObject map) {
        return new_map_object_iterator(map);
    }

    public static SubLObject do_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        map = current.first();
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
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            final SubLObject var = $sym6$VAR;
            final SubLObject iterator = $sym7$ITERATOR;
            return list(CLET, list(list(iterator, list(NEW_MAP_ITERATOR, map))), list(DO_ITERATOR, list(var, iterator, $DONE, done), listS(CDESTRUCTURING_BIND, list(key, value), var, append(body, NIL))));
        }
        final SubLObject the_map = $sym12$THE_MAP;
        final SubLObject mess = $sym13$MESS;
        final SubLObject sofar = $sym14$SOFAR;
        final SubLObject total = $sym15$TOTAL;
        return list(CLET, list(list(the_map, map), list(mess, progress_message), bq_cons(sofar, $list16), list(total, list(MAP_SIZE, the_map))), listS(CHECK_TYPE, mess, $list19), list(NOTING_PERCENT_PROGRESS, mess, listS(DO_MAP, list(key, value, the_map, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, sofar), append(body, NIL))));
    }

    public static SubLObject do_map_via_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$2, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            return list(CSOME, list(key, list(MAP_KEYS, map), done), listS(CLET, list(list(value, list(MAP_GET_WITHOUT_VALUES, map, key))), append(body, NIL)));
        }
        return list(PROGRESS_CSOME, list(key, list(MAP_KEYS, map), progress_message, done), listS(CLET, list(list(value, list(MAP_GET_WITHOUT_VALUES, map, key))), append(body, NIL)));
    }

    public static SubLObject do_map_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = NIL;
        SubLObject map = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        key_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        map = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list28);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list28);
            if (NIL == member(current_$3, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list28);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            final SubLObject iterator = $sym29$ITERATOR;
            return list(CLET, list(list(iterator, list(NEW_MAP_KEY_ITERATOR, map))), listS(DO_ITERATOR, list(key_var, iterator, $DONE, done), append(body, NIL)));
        }
        final SubLObject the_map = $sym31$THE_MAP;
        final SubLObject mess = $sym32$MESS;
        final SubLObject sofar = $sym33$SOFAR;
        final SubLObject total = $sym34$TOTAL;
        return list(CLET, list(list(the_map, map), list(mess, progress_message), bq_cons(sofar, $list16), list(total, list(MAP_SIZE, the_map))), listS(CHECK_TYPE, mess, $list19), list(NOTING_PERCENT_PROGRESS, mess, listS(DO_MAP_KEYS, list(key_var, the_map, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CINC, sofar), append(body, NIL))));
    }

    public static SubLObject new_map_with_same_properties(final SubLObject old_map) {
        final SubLObject test = map_test(old_map);
        final SubLObject size = map_size(old_map);
        return new_map_object_with_same_properties(old_map, test, size);
    }

    public static SubLObject clone_map(final SubLObject old_map, SubLObject copy_contentsP) {
        if (copy_contentsP == UNPROVIDED) {
            copy_contentsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_map = new_map_with_same_properties(old_map);
        if (NIL != copy_contentsP) {
            final SubLObject iterator = new_map_iterator(old_map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list36);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list36);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        map_put(new_map, key, value);
                    } else {
                        cdestructuring_bind_error(datum, $list36);
                    }
                }
            }
        }
        return new_map;
    }

    public static SubLObject map_arbitrary_key(final SubLObject map, SubLObject non_existent_key) {
        if (non_existent_key == UNPROVIDED) {
            non_existent_key = NIL;
        }
        if (NIL != map_empty_p(map)) {
            return non_existent_key;
        }
        return map_object_arbitrary_key(map);
    }

    public static SubLObject map_arbitrary_value(final SubLObject map, SubLObject non_existent_value) {
        if (non_existent_value == UNPROVIDED) {
            non_existent_value = NIL;
        }
        if (NIL != map_empty_p(map)) {
            return non_existent_value;
        }
        return map_get(map, map_arbitrary_key(map, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject map_keys(final SubLObject map) {
        if (NIL != map_empty_p(map)) {
            return NIL;
        }
        return map_object_keys(map);
    }

    public static SubLObject map_key_set(final SubLObject map) {
        if (NIL != map_empty_p(map)) {
            return set.new_set(map_test(map), ZERO_INTEGER);
        }
        return map_object_key_set(map);
    }

    public static SubLObject map_values(final SubLObject map) {
        if (NIL != map_empty_p(map)) {
            return NIL;
        }
        return map_object_values(map);
    }

    public static SubLObject map_has_keyP(final SubLObject map, final SubLObject key) {
        assert NIL != map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        return makeBoolean(!$map_missing_key_token$.getGlobalValue().eql(map_get_without_values(map, key, $map_missing_key_token$.getGlobalValue())));
    }

    public static SubLObject map_push(final SubLObject map, final SubLObject key, final SubLObject value) {
        assert NIL != map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        SubLObject current_val = map_get_without_values(map, key, UNPROVIDED);
        if (!current_val.isList()) {
            Errors.error($str39$Invalid_map_format__Attempting_to, current_val);
        }
        current_val = cons(value, current_val);
        return map_put(map, key, current_val);
    }

    public static SubLObject map_pushnew(final SubLObject map, final SubLObject key, final SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        SubLObject current_val = map_get_without_values(map, key, UNPROVIDED);
        if (!current_val.isList()) {
            Errors.error($str39$Invalid_map_format__Attempting_to, current_val);
        }
        if (NIL == member(value, current_val, test, key_accessor)) {
            current_val = cons(value, current_val);
        }
        return map_put(map, key, current_val);
    }

    public static SubLObject map_remove_from_value(final SubLObject map, final SubLObject key, final SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        SubLObject result = NIL;
        final SubLObject current_val = map_get_without_values(map, key, UNPROVIDED);
        if (current_val.isCons()) {
            final SubLObject spot = position(value, current_val, test, key_accessor, UNPROVIDED, UNPROVIDED);
            if (NIL != spot) {
                result = nth(spot, current_val);
                final SubLObject new_value = delete(value, current_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == new_value) {
                    map_remove(map, key);
                } else {
                    map_put(map, key, new_value);
                }
            }
        } else
            if (NIL == current_val) {
                result = NIL;
            } else {
                Errors.error($str40$Corrupted_map__attempting_to_remo, current_val);
            }

        return result;
    }

    public static SubLObject map_increment(final SubLObject map, final SubLObject key, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        SubLObject value = map_get(map, key, ZERO_INTEGER);
        if (value.isNumber()) {
            value = add(value, delta);
        } else {
            value = delta;
        }
        map_put(map, key, value);
        return value;
    }

    public static SubLObject map_decrement(final SubLObject map, final SubLObject key, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        if (!delta.isNegative()) {
            delta = minus(delta);
        }
        return map_increment(map, key, delta);
    }

    public static SubLObject reverse_index_map(final SubLObject map, final SubLObject ri_map, SubLObject collate_duplicatesP, SubLObject unpack_listsP) {
        if (collate_duplicatesP == UNPROVIDED) {
            collate_duplicatesP = NIL;
        }
        if (unpack_listsP == UNPROVIDED) {
            unpack_listsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != unpack_listsP) && value.isCons()) {
                        SubLObject cdolist_list_var = value;
                        SubLObject item = NIL;
                        item = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            store_in_reverse_index_map(ri_map, key, item, collate_duplicatesP);
                            cdolist_list_var = cdolist_list_var.rest();
                            item = cdolist_list_var.first();
                        } 
                    } else {
                        store_in_reverse_index_map(ri_map, key, value, collate_duplicatesP);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        return ri_map;
    }

    public static SubLObject store_in_reverse_index_map(final SubLObject ri_map, final SubLObject key, final SubLObject value, final SubLObject collate_duplicatesP) {
        return store_or_collate_in_map(ri_map, value, key, collate_duplicatesP);
    }

    public static SubLObject store_or_collate_in_map(final SubLObject map, final SubLObject key, final SubLObject value, final SubLObject collate_duplicatesP) {
        if (NIL != collate_duplicatesP) {
            map_push(map, key, value);
        } else {
            map_put(map, key, value);
        }
        return map;
    }

    public static SubLObject filter_map_values(final SubLObject map, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(IDENTITY);
        }
        return map_remove_if_not_value(clone_map(map, UNPROVIDED), test);
    }

    public static SubLObject map_remove_if_not_value(final SubLObject map, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(FALSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keys_to_remove = NIL;
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == funcall(test, value)) {
                        keys_to_remove = cons(key, keys_to_remove);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        return map_remove_keys(map, keys_to_remove);
    }

    public static SubLObject map_remove_keys(final SubLObject map, final SubLObject keys_to_remove) {
        SubLObject cdolist_list_var = keys_to_remove;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            map_remove(map, key);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return map;
    }

    public static SubLObject map_sample_from_map(final SubLObject old_map, SubLObject percentage, SubLObject new_map) {
        if (new_map == UNPROVIDED) {
            new_map = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!percentage.numLE($int$100))) {
            Errors.error($str43$Error__percentage__A_is_not_one_o);
        }
        if (ONE_INTEGER.numL(percentage)) {
            percentage = divide(percentage, $int$100);
        }
        final SubLObject new_size = floor(multiply(map_size(old_map), percentage), UNPROVIDED);
        SubLObject doneP = NIL;
        if (NIL == map_p(new_map)) {
            new_map = new_map_object_with_same_properties(old_map, map_test(old_map), new_size);
        }
        final SubLObject iterator = new_map_iterator(old_map);
        SubLObject valid;
        for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    map_put(new_map, key, value);
                    doneP = numG(map_size(new_map), new_size);
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        return new_map;
    }

    public static SubLObject maps_differ_in_keysP(final SubLObject map_a, final SubLObject map_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_a = map_test(map_a);
        final SubLObject test_b = map_test(map_b);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!hash_table_utilities.hash_test_to_symbol(test_a).eql(hash_table_utilities.hash_test_to_symbol(test_b)))) {
            Errors.error($str44$Cannot_compute_key_differences_in, test_a, test_b);
        }
        if (!map_size(map_a).numE(map_size(map_b))) {
            return T;
        }
        final SubLObject iterator = new_map_key_iterator(map_a);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL == map_has_keyP(map_b, key))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject maps_differ_in_keys(final SubLObject map_a, final SubLObject map_b, SubLObject skip_common_keys_computationP) {
        if (skip_common_keys_computationP == UNPROVIDED) {
            skip_common_keys_computationP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!hash_table_utilities.hash_test_to_symbol(map_test(map_a)).eql(hash_table_utilities.hash_test_to_symbol(map_test(map_b))))) {
            Errors.error($str44$Cannot_compute_key_differences_in, map_test(map_a), map_test(map_b));
        }
        if ((NIL != skip_common_keys_computationP) && (NIL == maps_differ_in_keysP(map_a, map_b))) {
            final SubLObject test = map_test(map_a);
            return values(set.new_set(test, UNPROVIDED), set.new_set(test, UNPROVIDED), NIL);
        }
        final SubLObject test = map_test(map_a);
        final SubLObject only_in_a = set.new_set(test, UNPROVIDED);
        final SubLObject only_in_b = set.new_set(test, UNPROVIDED);
        SubLObject common_keys = set.new_set(test, UNPROVIDED);
        SubLObject iterator = new_map_key_iterator(map_a);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL == map_has_keyP(map_b, key))) {
                set.set_add(key, only_in_a);
            }
        }
        if ((NIL != set.empty_set_p(only_in_a)) && map_size(map_a).numE(map_size(map_b))) {
            common_keys = map_key_set(map_a);
            return values(only_in_a, only_in_b, common_keys);
        }
        iterator = new_map_key_iterator(map_b);
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL == map_has_keyP(map_a, key))) {
                set.set_add(key, only_in_b);
            }
        }
        if (NIL == skip_common_keys_computationP) {
            iterator = new_map_key_iterator(map_a);
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject key = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid) && (NIL == map_has_keyP(only_in_a, key))) {
                    set.set_add(key, common_keys);
                }
            }
        }
        return values(only_in_a, only_in_b, common_keys);
    }

    public static SubLObject maps_differ_in_values(final SubLObject map_a, final SubLObject map_b, SubLObject value_test) {
        if (value_test == UNPROVIDED) {
            value_test = EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject different_keys = NIL;
        thread.resetMultipleValues();
        final SubLObject only_a = maps_differ_in_keys(map_a, map_b, UNPROVIDED);
        final SubLObject only_b = thread.secondMultipleValue();
        final SubLObject shared = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        different_keys = set.new_set(set.set_test(shared), UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(shared);
        SubLObject basis_object;
        SubLObject state;
        SubLObject shared_key;
        SubLObject value_a;
        SubLObject value_b;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            shared_key = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, shared_key)) {
                value_a = map_get(map_a, shared_key, UNPROVIDED);
                value_b = map_get(map_b, shared_key, UNPROVIDED);
                if (NIL == funcall(value_test, value_a, value_b)) {
                    set.set_add(shared_key, different_keys);
                }
            }
        }
        return values(only_a, only_b, different_keys);
    }

    public static SubLObject map_map_values(final SubLObject map, final SubLObject mapping_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_map = new_map_with_same_properties(map);
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject old_value = NIL;
                destructuring_bind_must_consp(current, datum, $list45);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list45);
                old_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject new_value = funcall(mapping_fn, old_value);
                    map_put(new_map, key, new_value);
                } else {
                    cdestructuring_bind_error(datum, $list45);
                }
            }
        }
        return new_map;
    }

    public static SubLObject map_change_values(final SubLObject map, final SubLObject apply_fn) {
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = map_keys(map);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject old_value = map_get(map, key, UNPROVIDED);
            final SubLObject new_value = funcall(apply_fn, old_value);
            map_put(map, key, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return map;
    }

    public static SubLObject map_to_dictionary(final SubLObject map) {
        assert NIL != map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        final SubLObject test = map_test(map);
        final SubLObject size = map_size(map);
        final SubLObject new_dictionary = dictionary.new_dictionary(test, size);
        return copy_map(map, new_dictionary, NIL);
    }

    public static SubLObject map_to_hash_table(final SubLObject map) {
        assert NIL != map_p(map) : "map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) " + map;
        final SubLObject test = map_test(map);
        final SubLObject size = map_size(map);
        final SubLObject new_hash = make_hash_table(size, test, UNPROVIDED);
        return copy_map(map, new_hash, NIL);
    }

    public static SubLObject copy_map(final SubLObject map_src, final SubLObject map_trg, SubLObject collate_duplicatesP) {
        if (collate_duplicatesP == UNPROVIDED) {
            collate_duplicatesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != map_p(map_src) : "map_utilities.map_p(map_src) " + "CommonSymbols.NIL != map_utilities.map_p(map_src) " + map_src;
        assert NIL != map_p(map_trg) : "map_utilities.map_p(map_trg) " + "CommonSymbols.NIL != map_utilities.map_p(map_trg) " + map_trg;
        final SubLObject iterator = new_map_iterator(map_src);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject val = NIL;
                destructuring_bind_must_consp(current, datum, $list46);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list46);
                val = current.first();
                current = current.rest();
                if (NIL == current) {
                    store_or_collate_in_map(map_trg, key, val, collate_duplicatesP);
                } else {
                    cdestructuring_bind_error(datum, $list46);
                }
            }
        }
        return map_trg;
    }

    public static SubLObject is_map_object_p(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $is_map_object_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return NIL;
    }

    public static SubLObject is_map_object_p_dictionary_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject is_map_object_p_hash_table_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject is_map_object_p_set_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject map_object_size(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $map_object_size_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_size_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_length(v_object);
    }

    public static SubLObject map_object_size_hash_table_method(final SubLObject v_object) {
        return hash_table_count(v_object);
    }

    public static SubLObject map_object_size_set_method(final SubLObject v_object) {
        return set.set_size(v_object);
    }

    public static SubLObject map_object_test(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $map_object_test_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_test_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_test(v_object);
    }

    public static SubLObject map_object_test_hash_table_method(final SubLObject v_object) {
        return hash_table_test(v_object);
    }

    public static SubLObject map_object_test_set_method(final SubLObject v_object) {
        return set.set_test(v_object);
    }

    public static SubLObject map_object_put(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        final SubLObject method_function = method_func(v_object, $map_object_put_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object, key, value);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_put_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(v_object, key, value);
    }

    public static SubLObject map_object_put_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return sethash(key, v_object, value);
    }

    public static SubLObject map_object_put_set_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return set.set_add(key, v_object);
    }

    public static SubLObject map_object_put_unless(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        final SubLObject method_function = method_func(v_object, $map_object_put_unless_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object, key, value, test_func);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_put_unless_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        if (NIL == funcall(test_func, dictionary.dictionary_lookup_without_values(v_object, key, UNPROVIDED))) {
            return dictionary.dictionary_enter(v_object, key, value);
        }
        return $NOT_SET;
    }

    public static SubLObject map_object_put_unless_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        if (NIL == funcall(test_func, gethash(key, v_object, UNPROVIDED))) {
            return sethash(key, v_object, value);
        }
        return $NOT_SET;
    }

    public static SubLObject map_object_put_unless_set_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        return set.set_add(key, v_object);
    }

    public static SubLObject map_object_get(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLObject method_function = method_func(v_object, $map_object_get_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object, key, not_found);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_get_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return dictionary.dictionary_lookup(v_object, key, not_found);
    }

    public static SubLObject map_object_get_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return gethash(key, v_object, not_found);
    }

    public static SubLObject map_object_get_set_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLObject foundP = set.set_memberP(key, v_object);
        return values(NIL != foundP ? key : not_found, foundP);
    }

    public static SubLObject map_object_get_without_values(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLObject method_function = method_func(v_object, $map_object_get_without_values_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object, key, not_found);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_get_without_values_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return dictionary.dictionary_lookup_without_values(v_object, key, not_found);
    }

    public static SubLObject map_object_get_without_values_hash_table_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return gethash_without_values(key, v_object, not_found);
    }

    public static SubLObject map_object_get_without_values_set_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return NIL != set.set_memberP(key, v_object) ? key : not_found;
    }

    public static SubLObject map_object_remove(final SubLObject map, final SubLObject key) {
        final SubLObject method_function = method_func(map, $map_object_remove_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, map, key);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, map);
    }

    public static SubLObject map_object_remove_dictionary_method(final SubLObject v_object, final SubLObject key) {
        return dictionary.dictionary_remove(v_object, key);
    }

    public static SubLObject map_object_remove_hash_table_method(final SubLObject v_object, final SubLObject key) {
        return remhash(key, v_object);
    }

    public static SubLObject map_object_remove_set_method(final SubLObject v_object, final SubLObject key) {
        return set.set_remove(key, v_object);
    }

    public static SubLObject map_object_touch(final SubLObject map, final SubLObject key) {
        final SubLObject method_function = method_func(map, $map_object_touch_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, map, key);
        }
        if (NIL != map_p(map)) {
            return NIL;
        }
        Errors.error($str51$_A_is_not_a_MAP_P_, map);
        return NIL;
    }

    public static SubLObject map_object_change_set(final SubLObject map, SubLObject unchanged) {
        if (unchanged == UNPROVIDED) {
            unchanged = NIL;
        }
        final SubLObject method_function = method_func(map, $map_object_change_set_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, map, unchanged);
        }
        return values(map_keys(map), NIL, NIL);
    }

    public static SubLObject new_map_object_with_same_properties(final SubLObject old_map, final SubLObject test, final SubLObject size) {
        final SubLObject method_function = method_func(old_map, $new_map_object_with_same_properties_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, old_map, test, size);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, old_map);
    }

    public static SubLObject new_map_object_with_same_properties_dictionary_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return dictionary.new_dictionary(test, size);
    }

    public static SubLObject new_map_object_with_same_properties_hash_table_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return make_hash_table(size, test, UNPROVIDED);
    }

    public static SubLObject new_map_object_with_same_properties_set_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return set.new_set(test, size);
    }

    public static SubLObject map_object_arbitrary_key(final SubLObject map) {
        final SubLObject method_function = method_func(map, $map_object_arbitrary_key_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, map);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, map);
    }

    public static SubLObject map_object_arbitrary_key_dictionary_method(final SubLObject v_object) {
        return dictionary_utilities.dictionary_arbitrary_key(v_object);
    }

    public static SubLObject map_object_arbitrary_key_hash_table_method(final SubLObject v_object) {
        return hash_table_utilities.hash_table_arbitrary_key(v_object);
    }

    public static SubLObject map_object_arbitrary_key_set_method(final SubLObject v_object) {
        return set_utilities.set_arbitrary_element(v_object);
    }

    public static SubLObject new_map_key_iterator(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $new_map_key_iterator_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return iteration.new_indirect_iterator(new_map_object_iterator(v_object), FIRST, UNPROVIDED);
    }

    public static SubLObject new_map_key_iterator_set_method(final SubLObject v_object) {
        return set.new_set_iterator(v_object);
    }

    public static SubLObject new_map_object_iterator(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $new_map_object_iterator_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject new_map_object_iterator_dictionary_method(final SubLObject v_object) {
        return dictionary.new_dictionary_iterator(v_object);
    }

    public static SubLObject new_map_object_iterator_hash_table_method(final SubLObject v_object) {
        return iteration.new_hash_table_iterator(v_object);
    }

    public static SubLObject new_map_object_iterator_set_method(final SubLObject v_object) {
        return new_set_qua_map_iterator(v_object);
    }

    public static SubLObject new_set_qua_map_iterator(final SubLObject set_qua_map) {
        assert NIL != set.set_p(set_qua_map) : "set.set_p(set_qua_map) " + "CommonSymbols.NIL != set.set_p(set_qua_map) " + set_qua_map;
        return iteration.new_iterator(make_iterator_set_qua_map_state(set_qua_map), ITERATOR_SET_QUA_MAP_DONE, ITERATOR_SET_QUA_MAP_NEXT, ITERATOR_SET_QUA_MAP_FINALIZE);
    }

    public static SubLObject make_iterator_set_qua_map_state(final SubLObject set_qua_map) {
        final SubLObject current = set.new_set_iterator(set_qua_map);
        final SubLObject key_val_tuple = list($KEY, $VALUE);
        return list(current, set_qua_map, key_val_tuple);
    }

    public static SubLObject iterator_set_qua_map_done(final SubLObject state) {
        SubLObject set_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list91);
        set_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return iteration.iteration_done(set_iterator);
    }

    public static SubLObject iterator_set_qua_map_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject set_iterator = NIL;
        SubLObject set_qua_map = NIL;
        SubLObject key_val_tuple = NIL;
        destructuring_bind_must_consp(state, state, $list92);
        set_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list92);
        set_qua_map = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list92);
        key_val_tuple = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list92);
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject next_key = iteration.iteration_next(set_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == validP) {
            iteration.iteration_finalize(set_iterator);
            set_nth(ZERO_INTEGER, state, $UNINITIALIZED);
            set_nth(ONE_INTEGER, state, $UNINITIALIZED);
            set_nth(ZERO_INTEGER, key_val_tuple, $INVALID);
            set_nth(ONE_INTEGER, key_val_tuple, $INVALID);
            return values(key_val_tuple, state, T);
        }
        final SubLObject next_value = next_key;
        set_nth(ZERO_INTEGER, key_val_tuple, next_key);
        set_nth(ONE_INTEGER, key_val_tuple, next_value);
        return values(key_val_tuple, state, NIL);
    }

    public static SubLObject iterator_set_qua_map_finalize(final SubLObject state) {
        SubLObject set_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list91);
        set_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (NIL != iteration.iterator_p(set_iterator)) {
            return iteration.iteration_finalize(set_iterator);
        }
        return NIL;
    }

    public static SubLObject map_object_remove_all(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $map_object_remove_all_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_object_remove_all_dictionary_method(final SubLObject v_object) {
        return dictionary.clear_dictionary(v_object);
    }

    public static SubLObject map_object_remove_all_hash_table_method(final SubLObject v_object) {
        return clrhash(v_object);
    }

    public static SubLObject map_object_remove_all_set_method(final SubLObject v_object) {
        return set.clear_set(v_object);
    }

    public static SubLObject map_object_keys(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $map_object_keys_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        if (NIL != map_p(v_object)) {
            return map_keys_via_do_map(v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_keys_via_do_map(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cursor;
        final SubLObject keys = cursor = make_list(map_size(map), UNPROVIDED);
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    rplaca(cursor, key);
                    cursor = cursor.rest();
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        return keys;
    }

    public static SubLObject map_object_keys_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_keys(v_object);
    }

    public static SubLObject map_object_keys_hash_table_method(final SubLObject v_object) {
        return hash_table_utilities.hash_table_keys(v_object);
    }

    public static SubLObject map_object_keys_set_method(final SubLObject v_object) {
        return set.set_element_list(v_object);
    }

    public static SubLObject map_object_key_set(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $map_object_key_set_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        if (NIL != map_p(v_object)) {
            return map_key_set_via_map_keys(v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_key_set_via_map_keys(final SubLObject v_object) {
        return set_utilities.make_set_from_list(map_keys(v_object), map_test(v_object));
    }

    public static SubLObject map_object_key_set_set_method(final SubLObject v_object) {
        return set.copy_set(v_object);
    }

    public static SubLObject map_object_values(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $map_object_values_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        if (NIL != map_p(v_object)) {
            return map_values_via_do_map(v_object);
        }
        return Errors.error($str51$_A_is_not_a_MAP_P_, v_object);
    }

    public static SubLObject map_values_via_do_map(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cursor;
        final SubLObject values = cursor = make_list(map_size(map), UNPROVIDED);
        final SubLObject iterator = new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    rplaca(cursor, value);
                    cursor = cursor.rest();
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        return values;
    }

    public static SubLObject map_object_values_dictionary_method(final SubLObject v_object) {
        return dictionary.dictionary_values(v_object);
    }

    public static SubLObject map_object_values_hash_table_method(final SubLObject v_object) {
        return hash_table_utilities.hash_table_values(v_object);
    }

    public static SubLObject map_object_values_set_method(final SubLObject v_object) {
        return set.set_element_list(v_object);
    }

    public static SubLObject test_hash_table_key_conflation(final SubLObject test, final SubLObject raw_items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hash_table = make_hash_table(length(raw_items), test, UNPROVIDED);
        final SubLObject unique_items = remove_duplicates(raw_items, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = raw_items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(item, hash_table, $PRESENT);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        final SubLObject expected = length(unique_items);
        final SubLObject actual = hash_table_count(hash_table);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected.numE(actual))) {
            Errors.error($str114$Expected__A_entries__but_got__A_, expected, actual);
        }
        return $SUCCESS;
    }

    public static SubLObject test_do_map_over_set_integrity(final SubLObject expected) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = (NIL != subl_promotions.positive_integer_p(expected)) ? number_utilities.non_negative_integers_less_than(expected) : NIL;
        SubLObject actual = ZERO_INTEGER;
        final SubLObject iterator = new_map_iterator(set_utilities.make_set_from_list(items, UNPROVIDED));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list36);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!key.eql(value))) {
                        Errors.error($str118$Expected__S_and__S_to_be_identica, key, value);
                    }
                    actual = add(actual, ONE_INTEGER);
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!actual.numE(expected))) {
            Errors.error($str119$Expected__A_items__but_got__A_, expected, actual);
        }
        return $SUCCESS;
    }

    public static SubLObject declare_map_utilities_file() {
        declareFunction(me, "map_p", "MAP-P", 1, 0, false);
        declareFunction(me, "map_size", "MAP-SIZE", 1, 0, false);
        declareFunction(me, "map_test", "MAP-TEST", 1, 0, false);
        declareFunction(me, "map_empty_p", "MAP-EMPTY-P", 1, 0, false);
        declareFunction(me, "map_test_symbol", "MAP-TEST-SYMBOL", 1, 0, false);
        declareFunction(me, "map_put", "MAP-PUT", 3, 0, false);
        declareFunction(me, "map_put_unless", "MAP-PUT-UNLESS", 3, 1, false);
        declareFunction(me, "map_get", "MAP-GET", 2, 1, false);
        declareFunction(me, "map_get_without_values", "MAP-GET-WITHOUT-VALUES", 2, 1, false);
        declareFunction(me, "map_remove", "MAP-REMOVE", 2, 0, false);
        declareFunction(me, "map_remove_all", "MAP-REMOVE-ALL", 1, 0, false);
        declareFunction(me, "map_touch", "MAP-TOUCH", 2, 0, false);
        declareFunction(me, "map_change_set", "MAP-CHANGE-SET", 1, 1, false);
        declareFunction(me, "new_map_iterator", "NEW-MAP-ITERATOR", 1, 0, false);
        declareMacro(me, "do_map", "DO-MAP");
        declareMacro(me, "do_map_via_keys", "DO-MAP-VIA-KEYS");
        declareMacro(me, "do_map_keys", "DO-MAP-KEYS");
        declareFunction(me, "new_map_with_same_properties", "NEW-MAP-WITH-SAME-PROPERTIES", 1, 0, false);
        declareFunction(me, "clone_map", "CLONE-MAP", 1, 1, false);
        declareFunction(me, "map_arbitrary_key", "MAP-ARBITRARY-KEY", 1, 1, false);
        declareFunction(me, "map_arbitrary_value", "MAP-ARBITRARY-VALUE", 1, 1, false);
        declareFunction(me, "map_keys", "MAP-KEYS", 1, 0, false);
        declareFunction(me, "map_key_set", "MAP-KEY-SET", 1, 0, false);
        declareFunction(me, "map_values", "MAP-VALUES", 1, 0, false);
        declareFunction(me, "map_has_keyP", "MAP-HAS-KEY?", 2, 0, false);
        declareFunction(me, "map_push", "MAP-PUSH", 3, 0, false);
        declareFunction(me, "map_pushnew", "MAP-PUSHNEW", 3, 2, false);
        declareFunction(me, "map_remove_from_value", "MAP-REMOVE-FROM-VALUE", 3, 2, false);
        declareFunction(me, "map_increment", "MAP-INCREMENT", 2, 1, false);
        declareFunction(me, "map_decrement", "MAP-DECREMENT", 2, 1, false);
        declareFunction(me, "reverse_index_map", "REVERSE-INDEX-MAP", 2, 2, false);
        declareFunction(me, "store_in_reverse_index_map", "STORE-IN-REVERSE-INDEX-MAP", 4, 0, false);
        declareFunction(me, "store_or_collate_in_map", "STORE-OR-COLLATE-IN-MAP", 4, 0, false);
        declareFunction(me, "filter_map_values", "FILTER-MAP-VALUES", 1, 1, false);
        declareFunction(me, "map_remove_if_not_value", "MAP-REMOVE-IF-NOT-VALUE", 1, 1, false);
        declareFunction(me, "map_remove_keys", "MAP-REMOVE-KEYS", 2, 0, false);
        declareFunction(me, "map_sample_from_map", "MAP-SAMPLE-FROM-MAP", 2, 1, false);
        declareFunction(me, "maps_differ_in_keysP", "MAPS-DIFFER-IN-KEYS?", 2, 0, false);
        declareFunction(me, "maps_differ_in_keys", "MAPS-DIFFER-IN-KEYS", 2, 1, false);
        declareFunction(me, "maps_differ_in_values", "MAPS-DIFFER-IN-VALUES", 2, 1, false);
        declareFunction(me, "map_map_values", "MAP-MAP-VALUES", 2, 0, false);
        declareFunction(me, "map_change_values", "MAP-CHANGE-VALUES", 2, 0, false);
        declareFunction(me, "map_to_dictionary", "MAP-TO-DICTIONARY", 1, 0, false);
        declareFunction(me, "map_to_hash_table", "MAP-TO-HASH-TABLE", 1, 0, false);
        declareFunction(me, "copy_map", "COPY-MAP", 2, 1, false);
        declareFunction(me, "is_map_object_p", "IS-MAP-OBJECT-P", 1, 0, false);
        declareFunction(me, "is_map_object_p_dictionary_method", "IS-MAP-OBJECT-P-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "is_map_object_p_hash_table_method", "IS-MAP-OBJECT-P-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "is_map_object_p_set_method", "IS-MAP-OBJECT-P-SET-METHOD", 1, 0, false);
        declareFunction(me, "map_object_size", "MAP-OBJECT-SIZE", 1, 0, false);
        declareFunction(me, "map_object_size_dictionary_method", "MAP-OBJECT-SIZE-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "map_object_size_hash_table_method", "MAP-OBJECT-SIZE-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "map_object_size_set_method", "MAP-OBJECT-SIZE-SET-METHOD", 1, 0, false);
        declareFunction(me, "map_object_test", "MAP-OBJECT-TEST", 1, 0, false);
        declareFunction(me, "map_object_test_dictionary_method", "MAP-OBJECT-TEST-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "map_object_test_hash_table_method", "MAP-OBJECT-TEST-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "map_object_test_set_method", "MAP-OBJECT-TEST-SET-METHOD", 1, 0, false);
        declareFunction(me, "map_object_put", "MAP-OBJECT-PUT", 3, 0, false);
        declareFunction(me, "map_object_put_dictionary_method", "MAP-OBJECT-PUT-DICTIONARY-METHOD", 3, 0, false);
        declareFunction(me, "map_object_put_hash_table_method", "MAP-OBJECT-PUT-HASH-TABLE-METHOD", 3, 0, false);
        declareFunction(me, "map_object_put_set_method", "MAP-OBJECT-PUT-SET-METHOD", 3, 0, false);
        declareFunction(me, "map_object_put_unless", "MAP-OBJECT-PUT-UNLESS", 4, 0, false);
        declareFunction(me, "map_object_put_unless_dictionary_method", "MAP-OBJECT-PUT-UNLESS-DICTIONARY-METHOD", 4, 0, false);
        declareFunction(me, "map_object_put_unless_hash_table_method", "MAP-OBJECT-PUT-UNLESS-HASH-TABLE-METHOD", 4, 0, false);
        declareFunction(me, "map_object_put_unless_set_method", "MAP-OBJECT-PUT-UNLESS-SET-METHOD", 4, 0, false);
        declareFunction(me, "map_object_get", "MAP-OBJECT-GET", 3, 0, false);
        declareFunction(me, "map_object_get_dictionary_method", "MAP-OBJECT-GET-DICTIONARY-METHOD", 3, 0, false);
        declareFunction(me, "map_object_get_hash_table_method", "MAP-OBJECT-GET-HASH-TABLE-METHOD", 3, 0, false);
        declareFunction(me, "map_object_get_set_method", "MAP-OBJECT-GET-SET-METHOD", 3, 0, false);
        declareFunction(me, "map_object_get_without_values", "MAP-OBJECT-GET-WITHOUT-VALUES", 3, 0, false);
        declareFunction(me, "map_object_get_without_values_dictionary_method", "MAP-OBJECT-GET-WITHOUT-VALUES-DICTIONARY-METHOD", 3, 0, false);
        declareFunction(me, "map_object_get_without_values_hash_table_method", "MAP-OBJECT-GET-WITHOUT-VALUES-HASH-TABLE-METHOD", 3, 0, false);
        declareFunction(me, "map_object_get_without_values_set_method", "MAP-OBJECT-GET-WITHOUT-VALUES-SET-METHOD", 3, 0, false);
        declareFunction(me, "map_object_remove", "MAP-OBJECT-REMOVE", 2, 0, false);
        declareFunction(me, "map_object_remove_dictionary_method", "MAP-OBJECT-REMOVE-DICTIONARY-METHOD", 2, 0, false);
        declareFunction(me, "map_object_remove_hash_table_method", "MAP-OBJECT-REMOVE-HASH-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "map_object_remove_set_method", "MAP-OBJECT-REMOVE-SET-METHOD", 2, 0, false);
        declareFunction(me, "map_object_touch", "MAP-OBJECT-TOUCH", 2, 0, false);
        declareFunction(me, "map_object_change_set", "MAP-OBJECT-CHANGE-SET", 1, 1, false);
        declareFunction(me, "new_map_object_with_same_properties", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES", 3, 0, false);
        declareFunction(me, "new_map_object_with_same_properties_dictionary_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-DICTIONARY-METHOD", 3, 0, false);
        declareFunction(me, "new_map_object_with_same_properties_hash_table_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-HASH-TABLE-METHOD", 3, 0, false);
        declareFunction(me, "new_map_object_with_same_properties_set_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SET-METHOD", 3, 0, false);
        declareFunction(me, "map_object_arbitrary_key", "MAP-OBJECT-ARBITRARY-KEY", 1, 0, false);
        declareFunction(me, "map_object_arbitrary_key_dictionary_method", "MAP-OBJECT-ARBITRARY-KEY-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "map_object_arbitrary_key_hash_table_method", "MAP-OBJECT-ARBITRARY-KEY-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "map_object_arbitrary_key_set_method", "MAP-OBJECT-ARBITRARY-KEY-SET-METHOD", 1, 0, false);
        declareFunction(me, "new_map_key_iterator", "NEW-MAP-KEY-ITERATOR", 1, 0, false);
        declareFunction(me, "new_map_key_iterator_set_method", "NEW-MAP-KEY-ITERATOR-SET-METHOD", 1, 0, false);
        declareFunction(me, "new_map_object_iterator", "NEW-MAP-OBJECT-ITERATOR", 1, 0, false);
        declareFunction(me, "new_map_object_iterator_dictionary_method", "NEW-MAP-OBJECT-ITERATOR-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "new_map_object_iterator_hash_table_method", "NEW-MAP-OBJECT-ITERATOR-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "new_map_object_iterator_set_method", "NEW-MAP-OBJECT-ITERATOR-SET-METHOD", 1, 0, false);
        declareFunction(me, "new_set_qua_map_iterator", "NEW-SET-QUA-MAP-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_set_qua_map_state", "MAKE-ITERATOR-SET-QUA-MAP-STATE", 1, 0, false);
        declareFunction(me, "iterator_set_qua_map_done", "ITERATOR-SET-QUA-MAP-DONE", 1, 0, false);
        declareFunction(me, "iterator_set_qua_map_next", "ITERATOR-SET-QUA-MAP-NEXT", 1, 0, false);
        declareFunction(me, "iterator_set_qua_map_finalize", "ITERATOR-SET-QUA-MAP-FINALIZE", 1, 0, false);
        declareFunction(me, "map_object_remove_all", "MAP-OBJECT-REMOVE-ALL", 1, 0, false);
        declareFunction(me, "map_object_remove_all_dictionary_method", "MAP-OBJECT-REMOVE-ALL-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "map_object_remove_all_hash_table_method", "MAP-OBJECT-REMOVE-ALL-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "map_object_remove_all_set_method", "MAP-OBJECT-REMOVE-ALL-SET-METHOD", 1, 0, false);
        declareFunction(me, "map_object_keys", "MAP-OBJECT-KEYS", 1, 0, false);
        declareFunction(me, "map_keys_via_do_map", "MAP-KEYS-VIA-DO-MAP", 1, 0, false);
        declareFunction(me, "map_object_keys_dictionary_method", "MAP-OBJECT-KEYS-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "map_object_keys_hash_table_method", "MAP-OBJECT-KEYS-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "map_object_keys_set_method", "MAP-OBJECT-KEYS-SET-METHOD", 1, 0, false);
        declareFunction(me, "map_object_key_set", "MAP-OBJECT-KEY-SET", 1, 0, false);
        declareFunction(me, "map_key_set_via_map_keys", "MAP-KEY-SET-VIA-MAP-KEYS", 1, 0, false);
        declareFunction(me, "map_object_key_set_set_method", "MAP-OBJECT-KEY-SET-SET-METHOD", 1, 0, false);
        declareFunction(me, "map_object_values", "MAP-OBJECT-VALUES", 1, 0, false);
        declareFunction(me, "map_values_via_do_map", "MAP-VALUES-VIA-DO-MAP", 1, 0, false);
        declareFunction(me, "map_object_values_dictionary_method", "MAP-OBJECT-VALUES-DICTIONARY-METHOD", 1, 0, false);
        declareFunction(me, "map_object_values_hash_table_method", "MAP-OBJECT-VALUES-HASH-TABLE-METHOD", 1, 0, false);
        declareFunction(me, "map_object_values_set_method", "MAP-OBJECT-VALUES-SET-METHOD", 1, 0, false);
        declareFunction(me, "test_hash_table_key_conflation", "TEST-HASH-TABLE-KEY-CONFLATION", 2, 0, false);
        declareFunction(me, "test_do_map_over_set_integrity", "TEST-DO-MAP-OVER-SET-INTEGRITY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_map_utilities_file() {
        deflexical("*MAP-MISSING-KEY-TOKEN*", make_symbol($$$MISSING));
        deflexical("*IS-MAP-OBJECT-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-SIZE-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-TEST-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-PUT-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-PUT-UNLESS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-GET-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-GET-WITHOUT-VALUES-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-REMOVE-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-TOUCH-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-CHANGE-SET-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-ARBITRARY-KEY-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*NEW-MAP-KEY-ITERATOR-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*NEW-MAP-OBJECT-ITERATOR-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-REMOVE-ALL-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-KEYS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-KEY-SET-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-OBJECT-VALUES-METHOD-TABLE*", make_vector($int$256, NIL));
        return NIL;
    }

    public static SubLObject setup_map_utilities_file() {
        register_method($is_map_object_p_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_DICTIONARY_METHOD));
        register_method($is_map_object_p_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_HASH_TABLE_METHOD));
        register_method($is_map_object_p_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_SET_METHOD));
        register_method($map_object_size_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_DICTIONARY_METHOD));
        register_method($map_object_size_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_HASH_TABLE_METHOD));
        register_method($map_object_size_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_SET_METHOD));
        register_method($map_object_test_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_DICTIONARY_METHOD));
        register_method($map_object_test_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_HASH_TABLE_METHOD));
        register_method($map_object_test_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_SET_METHOD));
        register_method($map_object_put_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_DICTIONARY_METHOD));
        register_method($map_object_put_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_HASH_TABLE_METHOD));
        register_method($map_object_put_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_SET_METHOD));
        register_method($map_object_put_unless_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_UNLESS_DICTIONARY_METHOD));
        register_method($map_object_put_unless_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_UNLESS_HASH_TABLE_METHOD));
        register_method($map_object_put_unless_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_UNLESS_SET_METHOD));
        register_method($map_object_get_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_DICTIONARY_METHOD));
        register_method($map_object_get_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_HASH_TABLE_METHOD));
        register_method($map_object_get_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_SET_METHOD));
        register_method($map_object_get_without_values_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_DICTIONARY_METHOD));
        register_method($map_object_get_without_values_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_HASH_TABLE_METHOD));
        register_method($map_object_get_without_values_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_SET_METHOD));
        register_method($map_object_remove_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_DICTIONARY_METHOD));
        register_method($map_object_remove_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_HASH_TABLE_METHOD));
        register_method($map_object_remove_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_SET_METHOD));
        register_method($new_map_object_with_same_properties_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_DICTIONARY_METHOD));
        register_method($new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_HASH_TABLE_METHOD));
        register_method($new_map_object_with_same_properties_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SET_METHOD));
        register_method($map_object_arbitrary_key_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_DICTIONARY_METHOD));
        register_method($map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_HASH_TABLE_METHOD));
        register_method($map_object_arbitrary_key_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_SET_METHOD));
        register_method($new_map_key_iterator_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(NEW_MAP_KEY_ITERATOR_SET_METHOD));
        register_method($new_map_object_iterator_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_DICTIONARY_METHOD));
        register_method($new_map_object_iterator_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_HASH_TABLE_METHOD));
        register_method($new_map_object_iterator_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_SET_METHOD));
        note_funcall_helper_function(ITERATOR_SET_QUA_MAP_DONE);
        note_funcall_helper_function(ITERATOR_SET_QUA_MAP_NEXT);
        note_funcall_helper_function(ITERATOR_SET_QUA_MAP_FINALIZE);
        register_method($map_object_remove_all_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_DICTIONARY_METHOD));
        register_method($map_object_remove_all_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_HASH_TABLE_METHOD));
        register_method($map_object_remove_all_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_SET_METHOD));
        register_method($map_object_keys_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_DICTIONARY_METHOD));
        register_method($map_object_keys_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_HASH_TABLE_METHOD));
        register_method($map_object_keys_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_SET_METHOD));
        register_method($map_object_key_set_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_KEY_SET_SET_METHOD));
        register_method($map_object_values_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_DICTIONARY_METHOD));
        register_method($map_object_values_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_HASH_TABLE_METHOD));
        register_method($map_object_values_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_SET_METHOD));
        define_test_case_table_int(TEST_HASH_TABLE_KEY_CONFLATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list112);
        define_test_case_table_int(TEST_DO_MAP_OVER_SET_INTEGRITY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list117);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_map_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_map_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_map_utilities_file();
    }

    
}

/**
 * Total time: 408 ms
 */
