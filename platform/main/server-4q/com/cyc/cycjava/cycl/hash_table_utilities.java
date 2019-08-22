package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_bucket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nset_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hash_table_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new hash_table_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.hash_table_utilities";

    public static final String myFingerPrint = "830e9981bf605fbfcaf5f8d9b7ce0653b2e7d3614041f6e7d382de9c00347fdd";

    // defconstant
    private static final SubLSymbol $valid_hash_test_symbols$ = makeSymbol("*VALID-HASH-TEST-SYMBOLS*");

    // defconstant
    private static final SubLSymbol $valid_hash_test_functions$ = makeSymbol("*VALID-HASH-TEST-FUNCTIONS*");

    // Internal Constants
    public static final SubLList $list0 = list(EQ, EQL, EQUAL, EQUALP);





    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLString $str4$_S_cannot_be_coerced_into_a_valid = makeString("~S cannot be coerced into a valid SubL hash test");

    private static final SubLList $list5 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym6$STRING__ = makeSymbol("STRING<=");





    private static final SubLString $str9$Corrupted_hash_table__attempting_ = makeString("Corrupted hash table; attempting to add values on a non-listp ~a.~%");

    private static final SubLString $str10$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the hashtable ~A.");













    private static final SubLString $str17$_S_____S__ = makeString("~S -> ~S~%");

    public static SubLObject valid_hash_test_symbols() {
        return $valid_hash_test_symbols$.getGlobalValue();
    }

    public static SubLObject valid_hash_test_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.memberP(v_object, $valid_hash_test_symbols$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, $valid_hash_test_functions$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)));
    }

    public static SubLObject hash_test_to_symbol(final SubLObject test) {
        assert NIL != valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        if (test.isSymbol()) {
            return test;
        }
        return find(test, $valid_hash_test_symbols$.getGlobalValue(), symbol_function(EQL), symbol_function(SYMBOL_FUNCTION), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject to_hash_test(final SubLObject v_object) {
        if (NIL != valid_hash_test_p(v_object)) {
            return v_object;
        }
        if (v_object.eql(symbol_function(KBEQ))) {
            return symbol_function(EQ);
        }
        if (v_object == KBEQ) {
            return EQ;
        }
        return Errors.error($str4$_S_cannot_be_coerced_into_a_valid, v_object);
    }

    public static SubLObject hash_table_empty_p(final SubLObject table) {
        return numE(ZERO_INTEGER, hash_table_count(table));
    }

    public static SubLObject rehash(final SubLObject table) {
        SubLObject pairs = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                pairs = cons(cons(key, value), pairs);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        clrhash(table);
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject key2 = NIL;
            SubLObject value2 = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            key2 = current.first();
            current = value2 = current.rest();
            sethash(key2, table, value2);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject rehash_if_stale(final SubLObject table) {
        if (NIL != hash_table_staleP(table)) {
            return rehash(table);
        }
        return table;
    }

    public static SubLObject hash_table_staleP(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = hash_table_arbitrary_key(table);
        thread.resetMultipleValues();
        final SubLObject found_value = gethash(key, table, UNPROVIDED);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL == foundP);
    }

    public static SubLObject push_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, cons(item, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject pushnew_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, adjoin(item, gethash(key, table, UNPROVIDED), test, UNPROVIDED));
    }

    public static SubLObject push_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, list_utilities.nadd_to_end(item, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject hash_add_to_value_sorted(final SubLObject key, final SubLObject table, final SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == UNPROVIDED) {
            predicate = $sym6$STRING__;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(SYMBOL_NAME);
        }
        assert NIL != hash_table_p(table) : "Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) " + table;
        SubLObject current_val = gethash(key, table, UNPROVIDED);
        if (current_val.isList()) {
            current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
            return sethash(key, table, current_val);
        }
        Errors.error($str9$Corrupted_hash_table__attempting_, current_val);
        return NIL;
    }

    public static SubLObject pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, list_utilities.nadjoin_to_end(item, gethash(key, table, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject pop_hash(final SubLObject key, final SubLObject table) {
        final SubLObject value = gethash_without_values(key, table, UNPROVIDED);
        sethash(key, table, value.rest());
        return value.first();
    }

    public static SubLObject remove_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, remove(item, gethash(key, table, UNPROVIDED), test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject gethash_first(final SubLObject key, final SubLObject table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject raw_value = gethash(key, table, v_default);
        final SubLObject value_goodP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (raw_value.isList()) {
            return values(raw_value.first(), value_goodP);
        }
        return values(raw_value, value_goodP);
    }

    public static SubLObject sethash_first(final SubLObject key, final SubLObject table, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_value = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_value = gethash(key, table, UNPROVIDED);
        final SubLObject value_goodP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == value_goodP) {
            new_value = list(value);
        } else
            if (raw_value.isList()) {
                new_value = cons(value, raw_value.rest());
            } else {
                new_value = list(value, raw_value);
            }

        return sethash(key, table, new_value);
    }

    public static SubLObject nconc_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, nconc(item, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject nconc_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, nconc(gethash(key, table, UNPROVIDED), item));
    }

    public static SubLObject copy_hash_table_values_into(final SubLObject from, final SubLObject to) {
        SubLObject k = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(from);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                sethash(k, to, v);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return to;
    }

    public static SubLObject copy_hashtable(final SubLObject hash_table, SubLObject size) {
        if (size == UNPROVIDED) {
            size = hash_table_count(hash_table);
        }
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
        final SubLObject test = hash_table_test(hash_table);
        final SubLObject new_table = make_hash_table(size, test, UNPROVIDED);
        copy_hash_table_values_into(hash_table, new_table);
        return new_table;
    }

    public static SubLObject sort_hash_value(final SubLObject key, final SubLObject table, final SubLObject sort_fn) {
        return sethash(key, table, funcall(sort_fn, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject delete_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test, SubLObject test_key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (test_key == UNPROVIDED) {
            test_key = symbol_function(IDENTITY);
        }
        return sethash(key, table, delete(item, gethash(key, table, UNPROVIDED), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject prune_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test, SubLObject test_key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (test_key == UNPROVIDED) {
            test_key = symbol_function(IDENTITY);
        }
        final SubLObject new_value = delete(item, gethash(key, table, UNPROVIDED), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != new_value) {
            return sethash(key, table, new_value);
        }
        return remhash(key, table);
    }

    public static SubLObject cinc_hash(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hash_table_p(table) : "Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) " + table;
        final SubLObject val = gethash(key, table, UNPROVIDED);
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != val)) && (!val.isNumber())) {
            Errors.error($str10$The_key__S_maps_to_the_non_numeri, key, val, table);
        }
        return sethash(key, table, NIL != val ? add(val, increment) : initial_val);
    }

    public static SubLObject nunion_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, nunion(gethash(key, table, UNPROVIDED), items, test, UNPROVIDED));
    }

    public static SubLObject nset_difference_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, nset_difference(gethash(key, table, UNPROVIDED), items, test, UNPROVIDED));
    }

    public static SubLObject hash_difference(final SubLObject hash1, final SubLObject hash2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject result = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash1);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (NIL == funcall(test, val, gethash(key, hash2, UNPROVIDED))) {
                    result = cons(key, result);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }

    public static SubLObject hash_existence_difference(final SubLObject hash1, final SubLObject hash2) {
        SubLObject result = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash1);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if ($NOTHING == gethash(key, hash2, $NOTHING)) {
                    result = cons(key, result);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }

    public static SubLObject hash_memberP(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject member_test, SubLObject member_key) {
        if (member_test == UNPROVIDED) {
            member_test = symbol_function(EQL);
        }
        if (member_key == UNPROVIDED) {
            member_key = symbol_function(IDENTITY);
        }
        return subl_promotions.memberP(item, gethash(key, table, UNPROVIDED), member_test, member_key);
    }

    public static SubLObject all_elements_in_hashP(final SubLObject list, final SubLObject hash) {
        SubLObject missingP = NIL;
        if (NIL == missingP) {
            SubLObject csome_list_var = list;
            SubLObject key = NIL;
            key = csome_list_var.first();
            while ((NIL == missingP) && (NIL != csome_list_var)) {
                if (NIL == gethash(key, hash, UNPROVIDED)) {
                    missingP = T;
                }
                csome_list_var = csome_list_var.rest();
                key = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == missingP);
    }

    public static SubLObject sort_hash_table_data(final SubLObject hashtable, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != hash_table_p(hashtable) : "Types.hash_table_p(hashtable) " + "CommonSymbols.NIL != Types.hash_table_p(hashtable) " + hashtable;
        final SubLObject total = hash_table_count(hashtable);
        if (total.numG(ZERO_INTEGER)) {
            SubLObject sort_vec = make_vector(total, UNPROVIDED);
            SubLObject v_answer = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject hash_key = NIL;
            SubLObject val = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    hash_key = getEntryKey(cdohash_entry);
                    val = getEntryValue(cdohash_entry);
                    set_aref(sort_vec, index, val);
                    index = add(index, ONE_INTEGER);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            sort_vec = Sort.sort(sort_vec, predicate, key);
            SubLObject cdotimes_end_var;
            SubLObject index_$1;
            for (cdotimes_end_var = length(sort_vec), index_$1 = NIL, index_$1 = ZERO_INTEGER; index_$1.numL(cdotimes_end_var); index_$1 = add(index_$1, ONE_INTEGER)) {
                v_answer = cons(aref(sort_vec, index_$1), v_answer);
            }
            return nreverse(v_answer);
        }
        return NIL;
    }

    public static SubLObject hash_first_n(final SubLObject n, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject key = NIL;
            SubLObject val = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    val = getEntryValue(cdohash_entry);
                    if (count.numGE(n)) {
                        mapping_finished();
                    }
                    count = add(count, ONE_INTEGER);
                    result = cons(list(key, val), result);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return nreverse(result);
    }

    public static SubLObject list_table_keys(final SubLObject hash_table) {
        return hash_table_keys(hash_table);
    }

    public static SubLObject hash_table_arbitrary_key(final SubLObject hash_table) {
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            if (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                return key;
            }
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject hash_table_arbitrary_value(final SubLObject hash_table) {
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            if (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                return val;
            }
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject hash_table_random_key(final SubLObject hash_table) {
        SubLObject iterations = random.random(hash_table_count(hash_table));
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (!iterations.isPositive()) {
                    return key;
                }
                iterations = subtract(iterations, ONE_INTEGER);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return hash_table_arbitrary_key(hash_table);
    }

    public static SubLObject hash_table_random_value(final SubLObject hash_table) {
        SubLObject iterations = random.random(hash_table_count(hash_table));
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (!iterations.isPositive()) {
                    return value;
                }
                iterations = subtract(iterations, ONE_INTEGER);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return hash_table_arbitrary_value(hash_table);
    }

    public static SubLObject hash_table_keys(final SubLObject hash_table) {
        return hash_table_keys_or_values(hash_table, $KEYS);
    }

    public static SubLObject hash_table_values(final SubLObject hash_table) {
        return hash_table_keys_or_values(hash_table, $VALUES);
    }

    public static SubLObject hash_table_keys_or_values(final SubLObject hash_table, final SubLObject type) {
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
        if (NIL == hash_table_empty_p(hash_table)) {
            final SubLObject expected_size = hash_table_count(hash_table);
            SubLObject cursor;
            final SubLObject v_answer = cursor = make_list(max(ONE_INTEGER, expected_size), UNPROVIDED);
            SubLObject previous = $UNINTIALIZED;
            final SubLObject get_keysP = eq(type, $KEYS);
            SubLObject key = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    if (NIL != cursor) {
                        if (NIL != get_keysP) {
                            rplaca(cursor, key);
                        } else {
                            rplaca(cursor, value);
                        }
                        previous = cursor;
                        cursor = cursor.rest();
                    } else {
                        if (NIL != get_keysP) {
                            rplacd(previous, cons(key, NIL));
                        } else {
                            rplacd(previous, cons(value, NIL));
                        }
                        previous = previous.rest();
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            if (NIL != cursor) {
                rplacd(previous, NIL);
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject hash_table_keys_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject keys = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (NIL != funcall(test, value, target_value)) {
                    keys = cons(key, keys);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return nreverse(keys);
    }

    public static SubLObject random_hash_table_key_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.random_element(hash_table_keys_with_value(hash_table, target_value, test));
    }

    public static SubLObject hash_table_to_alist(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
        final SubLObject test = hash_table_test(hash_table);
        SubLObject alist = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                alist = cons(cons(key, value), alist);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return values(alist, test);
    }

    public static SubLObject new_hash_table_from_alist(final SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject hash = make_hash_table(length(alist), test, UNPROVIDED);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            key = current.first();
            current = value = current.rest();
            sethash(key, hash, value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return hash;
    }

    public static SubLObject get_table_values(final SubLObject hashtable) {
        SubLObject ans = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                ans = cons(list(key, val), ans);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return ans;
    }

    public static SubLObject hash_table_values_min_length(final SubLObject table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = ZERO_INTEGER;
        }
        SubLObject min_length = NIL;
        if (table.isHashtable()) {
            SubLObject key = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    if (!value.isCons()) {
                        continue;
                    }
                    if (NIL == min_length) {
                        min_length = length(value);
                    } else {
                        if (ZERO_INTEGER.numE(min_length)) {
                            continue;
                        }
                        final SubLObject length = length(value);
                        if (!min_length.numG(length)) {
                            continue;
                        }
                        min_length = length;
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return min_length.isNumber() ? min_length : v_default;
    }

    public static SubLObject hash_table_values_min_count(final SubLObject table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = ZERO_INTEGER;
        }
        SubLObject min_count = NIL;
        if (table.isHashtable()) {
            SubLObject key = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    if (!value.isHashtable()) {
                        continue;
                    }
                    if (NIL == min_count) {
                        min_count = hash_table_count(value);
                    } else {
                        if (ZERO_INTEGER.numE(min_count)) {
                            continue;
                        }
                        final SubLObject count = hash_table_count(value);
                        if (!min_count.numG(count)) {
                            continue;
                        }
                        min_count = count;
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return min_count.isNumber() ? min_count : v_default;
    }

    public static SubLObject hash_list_elements(final SubLObject list, SubLObject test, SubLObject size, SubLObject func) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        if (func == UNPROVIDED) {
            func = symbol_function(TRUE);
        }
        final SubLObject table = make_hash_table(size, test, UNPROVIDED);
        SubLObject cdolist_list_var = list;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(x, table, func.eql(symbol_function(TRUE)) ? T : funcall(func, x));
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject find_in_hash_if(final SubLObject hashtable, final SubLObject key_test, final SubLObject value_test) {
        SubLObject matched_keys = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if ((NIL != funcall(key_test, key)) && (NIL != funcall(value_test, value))) {
                    matched_keys = cons(key, matched_keys);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matched_keys;
    }

    public static SubLObject find_in_hash_if_not(final SubLObject hashtable, final SubLObject key_test, final SubLObject value_test) {
        SubLObject matched_keys = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (NIL != funcall(key_test, key)) {
                    if (NIL != funcall(value_test, value)) {
                        continue;
                    }
                    matched_keys = cons(key, matched_keys);
                } else {
                    matched_keys = cons(key, matched_keys);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return matched_keys;
    }

    public static SubLObject printhash(final SubLObject hashtable, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                format(stream, $str17$_S_____S__, key, val);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject hashtable_key_collision_count(final SubLObject hashtable) {
        assert NIL != hash_table_p(hashtable) : "Types.hash_table_p(hashtable) " + "CommonSymbols.NIL != Types.hash_table_p(hashtable) " + hashtable;
        final SubLObject key_count = hash_table_count(hashtable);
        final SubLObject collision_table = make_hash_table(key_count, symbol_function(EQL), UNPROVIDED);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                sethash(gethash_bucket(key, hashtable), collision_table, add(gethash(gethash_bucket(key, hashtable), collision_table, ZERO_INTEGER), ONE_INTEGER));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject sxhash_count = hash_table_count(collision_table);
        final SubLObject collision_count = subtract(key_count, sxhash_count);
        return collision_count;
    }

    public static SubLObject hashtable_key_collision_probability(final SubLObject hashtable) {
        return divide(hashtable_key_collision_count(hashtable), hash_table_count(hashtable));
    }

    public static SubLObject declare_hash_table_utilities_file() {
        declareFunction(me, "valid_hash_test_symbols", "VALID-HASH-TEST-SYMBOLS", 0, 0, false);
        declareFunction(me, "valid_hash_test_p", "VALID-HASH-TEST-P", 1, 0, false);
        declareFunction(me, "hash_test_to_symbol", "HASH-TEST-TO-SYMBOL", 1, 0, false);
        declareFunction(me, "to_hash_test", "TO-HASH-TEST", 1, 0, false);
        declareFunction(me, "hash_table_empty_p", "HASH-TABLE-EMPTY-P", 1, 0, false);
        declareFunction(me, "rehash", "REHASH", 1, 0, false);
        declareFunction(me, "rehash_if_stale", "REHASH-IF-STALE", 1, 0, false);
        declareFunction(me, "hash_table_staleP", "HASH-TABLE-STALE?", 1, 0, false);
        declareFunction(me, "push_hash", "PUSH-HASH", 3, 0, false);
        declareFunction(me, "pushnew_hash", "PUSHNEW-HASH", 3, 1, false);
        declareFunction(me, "push_to_end_hash", "PUSH-TO-END-HASH", 3, 0, false);
        declareFunction(me, "hash_add_to_value_sorted", "HASH-ADD-TO-VALUE-SORTED", 3, 2, false);
        declareFunction(me, "pushnew_to_end_hash", "PUSHNEW-TO-END-HASH", 3, 0, false);
        declareFunction(me, "pop_hash", "POP-HASH", 2, 0, false);
        declareFunction(me, "remove_value_from_hash", "REMOVE-VALUE-FROM-HASH", 3, 1, false);
        declareFunction(me, "gethash_first", "GETHASH-FIRST", 2, 1, false);
        declareFunction(me, "sethash_first", "SETHASH-FIRST", 3, 0, false);
        declareFunction(me, "nconc_hash", "NCONC-HASH", 3, 0, false);
        declareFunction(me, "nconc_to_end_hash", "NCONC-TO-END-HASH", 3, 0, false);
        declareFunction(me, "copy_hash_table_values_into", "COPY-HASH-TABLE-VALUES-INTO", 2, 0, false);
        declareFunction(me, "copy_hashtable", "COPY-HASHTABLE", 1, 1, false);
        declareFunction(me, "sort_hash_value", "SORT-HASH-VALUE", 3, 0, false);
        declareFunction(me, "delete_hash", "DELETE-HASH", 3, 2, false);
        declareFunction(me, "prune_hash", "PRUNE-HASH", 3, 2, false);
        declareFunction(me, "cinc_hash", "CINC-HASH", 2, 2, false);
        declareFunction(me, "nunion_hash", "NUNION-HASH", 3, 1, false);
        declareFunction(me, "nset_difference_hash", "NSET-DIFFERENCE-HASH", 3, 1, false);
        declareFunction(me, "hash_difference", "HASH-DIFFERENCE", 2, 1, false);
        declareFunction(me, "hash_existence_difference", "HASH-EXISTENCE-DIFFERENCE", 2, 0, false);
        declareFunction(me, "hash_memberP", "HASH-MEMBER?", 3, 2, false);
        declareFunction(me, "all_elements_in_hashP", "ALL-ELEMENTS-IN-HASH?", 2, 0, false);
        declareFunction(me, "sort_hash_table_data", "SORT-HASH-TABLE-DATA", 2, 1, false);
        declareFunction(me, "hash_first_n", "HASH-FIRST-N", 2, 0, false);
        declareFunction(me, "list_table_keys", "LIST-TABLE-KEYS", 1, 0, false);
        declareFunction(me, "hash_table_arbitrary_key", "HASH-TABLE-ARBITRARY-KEY", 1, 0, false);
        declareFunction(me, "hash_table_arbitrary_value", "HASH-TABLE-ARBITRARY-VALUE", 1, 0, false);
        declareFunction(me, "hash_table_random_key", "HASH-TABLE-RANDOM-KEY", 1, 0, false);
        declareFunction(me, "hash_table_random_value", "HASH-TABLE-RANDOM-VALUE", 1, 0, false);
        declareFunction(me, "hash_table_keys", "HASH-TABLE-KEYS", 1, 0, false);
        declareFunction(me, "hash_table_values", "HASH-TABLE-VALUES", 1, 0, false);
        declareFunction(me, "hash_table_keys_or_values", "HASH-TABLE-KEYS-OR-VALUES", 2, 0, false);
        declareFunction(me, "hash_table_keys_with_value", "HASH-TABLE-KEYS-WITH-VALUE", 2, 1, false);
        declareFunction(me, "random_hash_table_key_with_value", "RANDOM-HASH-TABLE-KEY-WITH-VALUE", 2, 1, false);
        declareFunction(me, "hash_table_to_alist", "HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction(me, "new_hash_table_from_alist", "NEW-HASH-TABLE-FROM-ALIST", 1, 1, false);
        declareFunction(me, "get_table_values", "GET-TABLE-VALUES", 1, 0, false);
        declareFunction(me, "hash_table_values_min_length", "HASH-TABLE-VALUES-MIN-LENGTH", 1, 1, false);
        declareFunction(me, "hash_table_values_min_count", "HASH-TABLE-VALUES-MIN-COUNT", 1, 1, false);
        declareFunction(me, "hash_list_elements", "HASH-LIST-ELEMENTS", 1, 3, false);
        declareFunction(me, "find_in_hash_if", "FIND-IN-HASH-IF", 3, 0, false);
        declareFunction(me, "find_in_hash_if_not", "FIND-IN-HASH-IF-NOT", 3, 0, false);
        declareFunction(me, "printhash", "PRINTHASH", 1, 1, false);
        declareFunction(me, "hashtable_key_collision_count", "HASHTABLE-KEY-COLLISION-COUNT", 1, 0, false);
        declareFunction(me, "hashtable_key_collision_probability", "HASHTABLE-KEY-COLLISION-PROBABILITY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_hash_table_utilities_file() {
        defconstant("*VALID-HASH-TEST-SYMBOLS*", $list0);
        defconstant("*VALID-HASH-TEST-FUNCTIONS*", list(symbol_function(EQ), symbol_function(EQL), symbol_function(EQUAL), symbol_function(EQUALP)));
        return NIL;
    }

    public static SubLObject setup_hash_table_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hash_table_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_hash_table_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hash_table_utilities_file();
    }

    
}

/**
 * Total time: 243 ms
 */
