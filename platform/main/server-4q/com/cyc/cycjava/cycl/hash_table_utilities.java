/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hash_table_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new hash_table_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.hash_table_utilities";


    // defconstant
    // Definitions
    @LispMethod(comment = "All function symbols which are permitted tests for hashtable-based algorithms.\ndefconstant")
    private static final SubLSymbol $valid_hash_test_symbols$ = makeSymbol("*VALID-HASH-TEST-SYMBOLS*");

    // defconstant
    @LispMethod(comment = "All functions which are permitted tests for hashtable-based algorithms.\ndefconstant")
    /**
     * All functions which are permitted tests for hashtable-based algorithms.
     */
    private static final SubLSymbol $valid_hash_test_functions$ = makeSymbol("*VALID-HASH-TEST-FUNCTIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(EQ, EQL, EQUAL, EQUALP);

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLString $str4$_S_cannot_be_coerced_into_a_valid = makeString("~S cannot be coerced into a valid SubL hash test");

    private static final SubLList $list5 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym6$STRING__ = makeSymbol("STRING<=");

    private static final SubLString $str9$Corrupted_hash_table__attempting_ = makeString("Corrupted hash table; attempting to add values on a non-listp ~a.~%");

    private static final SubLString $str10$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the hashtable ~A.");

    private static final SubLString $str17$_S_____S__ = makeString("~S -> ~S~%");

    public static final SubLObject valid_hash_test_symbols_alt() {
        return $valid_hash_test_symbols$.getGlobalValue();
    }

    public static SubLObject valid_hash_test_symbols() {
        return $valid_hash_test_symbols$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a valid test function for a hashtable-based algorithm.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid test function for a hashtable-based algorithm.")
    public static final SubLObject valid_hash_test_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.memberP(v_object, $valid_hash_test_symbols$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, $valid_hash_test_functions$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)));
    }

    /**
     * Return T iff OBJECT is a valid test function for a hashtable-based algorithm.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid test function for a hashtable-based algorithm.")
    public static SubLObject valid_hash_test_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.memberP(v_object, $valid_hash_test_symbols$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)) || (NIL != subl_promotions.memberP(v_object, $valid_hash_test_functions$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)));
    }

    /**
     * Return the symbol form of TEST, which is a valid hash-test function.
     */
    @LispMethod(comment = "Return the symbol form of TEST, which is a valid hash-test function.")
    public static final SubLObject hash_test_to_symbol_alt(SubLObject test) {
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        if (test.isSymbol()) {
            return test;
        } else {
            return find(test, $valid_hash_test_symbols$.getGlobalValue(), symbol_function(EQL), symbol_function(SYMBOL_FUNCTION), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Return the symbol form of TEST, which is a valid hash-test function.
     */
    @LispMethod(comment = "Return the symbol form of TEST, which is a valid hash-test function.")
    public static SubLObject hash_test_to_symbol(final SubLObject test) {
        assert NIL != valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
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

    /**
     * Return T iff TABLE is an empty hashtable
     */
    @LispMethod(comment = "Return T iff TABLE is an empty hashtable")
    public static final SubLObject hash_table_empty_p_alt(SubLObject table) {
        return numE(ZERO_INTEGER, hash_table_count(table));
    }

    /**
     * Return T iff TABLE is an empty hashtable
     */
    @LispMethod(comment = "Return T iff TABLE is an empty hashtable")
    public static SubLObject hash_table_empty_p(final SubLObject table) {
        return numE(ZERO_INTEGER, hash_table_count(table));
    }

    /**
     * Rehash every KEY VALUE pair in the hashtable TABLE.
     */
    @LispMethod(comment = "Rehash every KEY VALUE pair in the hashtable TABLE.")
    public static final SubLObject rehash_alt(SubLObject table) {
        {
            SubLObject pairs = NIL;
            {
                SubLObject key = NIL;
                SubLObject value = NIL;
                {
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
                }
            }
            clrhash(table);
            {
                SubLObject cdolist_list_var = pairs;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        key = current.first();
                        current = current.rest();
                        value = current;
                        sethash(key, table, value);
                    }
                }
            }
            return table;
        }
    }

    /**
     * Rehash every KEY VALUE pair in the hashtable TABLE.
     */
    @LispMethod(comment = "Rehash every KEY VALUE pair in the hashtable TABLE.")
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

    /**
     * If TABLE is stale, rehash it, otherwise leave it alone.
     *
     * @see hash-table-stale?
     */
    @LispMethod(comment = "If TABLE is stale, rehash it, otherwise leave it alone.\r\n\r\n@see hash-table-stale?")
    public static final SubLObject rehash_if_stale_alt(SubLObject table) {
        if (NIL != com.cyc.cycjava.cycl.hash_table_utilities.hash_table_staleP(table)) {
            return com.cyc.cycjava.cycl.hash_table_utilities.rehash(table);
        } else {
            return table;
        }
    }

    /**
     * If TABLE is stale, rehash it, otherwise leave it alone.
     *
     * @see hash-table-stale?
     */
    @LispMethod(comment = "If TABLE is stale, rehash it, otherwise leave it alone.\r\n\r\n@see hash-table-stale?")
    public static SubLObject rehash_if_stale(final SubLObject table) {
        if (NIL != hash_table_staleP(table)) {
            return rehash(table);
        }
        return table;
    }

    /**
     *
     *
     * @return booleanp; whether TABLE is stale,
    meaning that its @xref sxhash codes have changed.
    This is determined by choosing an arbitrary key
    and making sure it is still findable.
     */
    @LispMethod(comment = "@return booleanp; whether TABLE is stale,\r\nmeaning that its @xref sxhash codes have changed.\r\nThis is determined by choosing an arbitrary key\r\nand making sure it is still findable.")
    public static final SubLObject hash_table_staleP_alt(SubLObject table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject key = com.cyc.cycjava.cycl.hash_table_utilities.hash_table_arbitrary_key(table);
                thread.resetMultipleValues();
                {
                    SubLObject found_value = gethash(key, table, UNPROVIDED);
                    SubLObject foundP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return makeBoolean(NIL == foundP);
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether TABLE is stale,
    meaning that its @xref sxhash codes have changed.
    This is determined by choosing an arbitrary key
    and making sure it is still findable.
     */
    @LispMethod(comment = "@return booleanp; whether TABLE is stale,\r\nmeaning that its @xref sxhash codes have changed.\r\nThis is determined by choosing an arbitrary key\r\nand making sure it is still findable.")
    public static SubLObject hash_table_staleP(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = hash_table_arbitrary_key(table);
        thread.resetMultipleValues();
        final SubLObject found_value = gethash(key, table, UNPROVIDED);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL == foundP);
    }

    public static final SubLObject push_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, cons(item, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject push_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, cons(item, gethash(key, table, UNPROVIDED)));
    }

    public static final SubLObject pushnew_hash_alt(SubLObject key, SubLObject item, SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, adjoin(item, gethash(key, table, UNPROVIDED), test, UNPROVIDED));
    }

    public static SubLObject pushnew_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, adjoin(item, gethash(key, table, UNPROVIDED), test, UNPROVIDED));
    }

    public static final SubLObject push_to_end_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, list_utilities.nadd_to_end(item, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject push_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, list_utilities.nadd_to_end(item, gethash(key, table, UNPROVIDED)));
    }

    /**
     * Adds ITEM in the current value at KEY in TABLE in a way that preserves its ``sortedness''
     * according to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.
     *
     * @return key
     */
    @LispMethod(comment = "Adds ITEM in the current value at KEY in TABLE in a way that preserves its ``sortedness\'\'\r\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.\r\n\r\n@return key\nAdds ITEM in the current value at KEY in TABLE in a way that preserves its ``sortedness\'\'\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.")
    public static final SubLObject hash_add_to_value_sorted_alt(SubLObject key, SubLObject table, SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == UNPROVIDED) {
            predicate = $sym4$STRING__;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(SYMBOL_NAME);
        }
        SubLTrampolineFile.checkType(table, HASH_TABLE_P);
        {
            SubLObject current_val = gethash(key, table, UNPROVIDED);
            if (current_val.isList()) {
                current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
                return sethash(key, table, current_val);
            } else {
                Errors.error($str_alt7$Corrupted_hash_table__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Adds ITEM in the current value at KEY in TABLE in a way that preserves its ``sortedness''
     * according to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.
     *
     * @return key
     */
    @LispMethod(comment = "Adds ITEM in the current value at KEY in TABLE in a way that preserves its ``sortedness\'\'\r\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.\r\n\r\n@return key\nAdds ITEM in the current value at KEY in TABLE in a way that preserves its ``sortedness\'\'\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.")
    public static SubLObject hash_add_to_value_sorted(final SubLObject key, final SubLObject table, final SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == UNPROVIDED) {
            predicate = $sym6$STRING__;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(SYMBOL_NAME);
        }
        assert NIL != hash_table_p(table) : "! hash_table_p(table) " + ("Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) ") + table;
        SubLObject current_val = gethash(key, table, UNPROVIDED);
        if (current_val.isList()) {
            current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
            return sethash(key, table, current_val);
        }
        Errors.error($str9$Corrupted_hash_table__attempting_, current_val);
        return NIL;
    }

    public static final SubLObject pushnew_to_end_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, list_utilities.nadjoin_to_end(item, gethash(key, table, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, list_utilities.nadjoin_to_end(item, gethash(key, table, UNPROVIDED), UNPROVIDED));
    }

    /**
     * Pops off the first element of the value of KEY in TABLE.
     * More precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself.
     */
    @LispMethod(comment = "Pops off the first element of the value of KEY in TABLE.\r\nMore precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself.\nPops off the first element of the value of KEY in TABLE.\nMore precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself.")
    public static final SubLObject pop_hash_alt(SubLObject key, SubLObject table) {
        {
            SubLObject value = gethash_without_values(key, table, UNPROVIDED);
            sethash(key, table, value.rest());
            return value.first();
        }
    }

    @LispMethod(comment = "Pops off the first element of the value of KEY in TABLE.\r\nMore precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself.\nPops off the first element of the value of KEY in TABLE.\nMore precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself.")
    public static SubLObject pop_hash(final SubLObject key, final SubLObject table) {
        final SubLObject value = gethash_without_values(key, table, UNPROVIDED);
        sethash(key, table, value.rest());
        return value.first();
    }/**
     * Pops off the first element of the value of KEY in TABLE.
     * More precisely, returns the first element of the value of KEY in TABLE, and sets that value to be the rest of itself.
     */


    /**
     * Converse of push(new)-hash.  Removes ITEM from teh value associated with KEY in TABLE.
     */
    @LispMethod(comment = "Converse of push(new)-hash.  Removes ITEM from teh value associated with KEY in TABLE.")
    public static final SubLObject remove_value_from_hash_alt(SubLObject key, SubLObject item, SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, remove(item, gethash(key, table, UNPROVIDED), test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @LispMethod(comment = "Converse of push(new)-hash.  Removes ITEM from teh value associated with KEY in TABLE.")
    public static SubLObject remove_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, remove(item, gethash(key, table, UNPROVIDED), test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }/**
     * Converse of push(new)-hash.  Removes ITEM from teh value associated with KEY in TABLE.
     */


    /**
     * Like gethash but in the case where the KEY maps to a VALUE in TABLE, and VALUE is a list, then the first element of VALUE is returned.  Note that if DEFAULT is a list and it is used, only the first element of it will be returned.
     *
     * @param KEY
    anything
     * 		
     * @param TABLE
    hashtable
     * 		
     * @param DEFAULT
    anything
     * 		
     * @unknown 0 anything
     * @unknown 1 boolean
     * @unknown jantos
     * @unknown this should never have been put here in the first place.  kill at will.
     * @unknown done
     */
    @LispMethod(comment = "Like gethash but in the case where the KEY maps to a VALUE in TABLE, and VALUE is a list, then the first element of VALUE is returned.  Note that if DEFAULT is a list and it is used, only the first element of it will be returned.\r\n\r\n@param KEY\nanything\r\n\t\t\r\n@param TABLE\nhashtable\r\n\t\t\r\n@param DEFAULT\nanything\r\n\t\t\r\n@unknown 0 anything\r\n@unknown 1 boolean\r\n@unknown jantos\r\n@unknown this should never have been put here in the first place.  kill at will.\r\n@unknown done")
    public static final SubLObject gethash_first_alt(SubLObject key, SubLObject table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject raw_value = gethash(key, table, v_default);
                SubLObject value_goodP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (raw_value.isList()) {
                    return values(raw_value.first(), value_goodP);
                } else {
                    return values(raw_value, value_goodP);
                }
            }
        }
    }

    @LispMethod(comment = "Like gethash but in the case where the KEY maps to a VALUE in TABLE, and VALUE is a list, then the first element of VALUE is returned.  Note that if DEFAULT is a list and it is used, only the first element of it will be returned.\r\n\r\n@param KEY\n\t\tanything\r\n\t\t\r\n@param TABLE\n\t\thashtable\r\n\t\t\r\n@param DEFAULT\n\t\tanything\r\n\t\t\r\n@unknown 0 anything\r\n@unknown 1 boolean\r\n@unknown jantos\r\n@unknown this should never have been put here in the first place.  kill at will.\r\n@unknown done")
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
    }/**
     * Like gethash but in the case where the KEY maps to a VALUE in TABLE, and VALUE is a list, then the first element of VALUE is returned.  Note that if DEFAULT is a list and it is used, only the first element of it will be returned.
     *
     * @param KEY
    		anything
     * 		
     * @param TABLE
    		hashtable
     * 		
     * @param DEFAULT
    		anything
     * 		
     * @unknown 0 anything
     * @unknown 1 boolean
     * @unknown jantos
     * @unknown this should never have been put here in the first place.  kill at will.
     * @unknown done
     */


    /**
     * Like sethash but enforces KEY mapping to a list in TABLE.  In the case where the KEY maps to X in TABLE, and X is a list, then (car X) is replaced by VALUE.  If X is not a list, X is set to '(VALUE X).  If X is nil, then X is set to '(VALUE).  Returns the new X.
     *
     * @param KEY
    anything
     * 		
     * @param TABLE
    hashtable
     * 		
     * @param VALUE
    anything
     * 		
     * @unknown 0 anything
     * @unknown jantos
     * @unknown this should never have been put here in the first place.  kill at will.
     * @unknown done
     */
    @LispMethod(comment = "Like sethash but enforces KEY mapping to a list in TABLE.  In the case where the KEY maps to X in TABLE, and X is a list, then (car X) is replaced by VALUE.  If X is not a list, X is set to \'(VALUE X).  If X is nil, then X is set to \'(VALUE).  Returns the new X.\r\n\r\n@param KEY\nanything\r\n\t\t\r\n@param TABLE\nhashtable\r\n\t\t\r\n@param VALUE\nanything\r\n\t\t\r\n@unknown 0 anything\r\n@unknown jantos\r\n@unknown this should never have been put here in the first place.  kill at will.\r\n@unknown done")
    public static final SubLObject sethash_first_alt(SubLObject key, SubLObject table, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_value = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject raw_value = gethash(key, table, UNPROVIDED);
                    SubLObject value_goodP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == value_goodP) {
                        new_value = list(value);
                    } else {
                        if (raw_value.isList()) {
                            new_value = cons(value, raw_value.rest());
                        } else {
                            new_value = list(value, raw_value);
                        }
                    }
                }
                return sethash(key, table, new_value);
            }
        }
    }

    @LispMethod(comment = "Like sethash but enforces KEY mapping to a list in TABLE.  In the case where the KEY maps to X in TABLE, and X is a list, then (car X) is replaced by VALUE.  If X is not a list, X is set to \'(VALUE X).  If X is nil, then X is set to \'(VALUE).  Returns the new X.\r\n\r\n@param KEY\n\t\tanything\r\n\t\t\r\n@param TABLE\n\t\thashtable\r\n\t\t\r\n@param VALUE\n\t\tanything\r\n\t\t\r\n@unknown 0 anything\r\n@unknown jantos\r\n@unknown this should never have been put here in the first place.  kill at will.\r\n@unknown done")
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
    }/**
     * Like sethash but enforces KEY mapping to a list in TABLE.  In the case where the KEY maps to X in TABLE, and X is a list, then (car X) is replaced by VALUE.  If X is not a list, X is set to '(VALUE X).  If X is nil, then X is set to '(VALUE).  Returns the new X.
     *
     * @param KEY
    		anything
     * 		
     * @param TABLE
    		hashtable
     * 		
     * @param VALUE
    		anything
     * 		
     * @unknown 0 anything
     * @unknown jantos
     * @unknown this should never have been put here in the first place.  kill at will.
     * @unknown done
     */


    /**
     *
     *
     * @param key
     * 		A key of the hashtable TABLE.
     * @param item
    list
     * 		
     * @param table
    hashtable
     * 		
     * @unknown Concatenates (using @xref nconc) ITEM to the value of
    KEY in TABLE.  Sets the value of KEY to this list.  ITEM will
    be concatenated before the current value.  To add ITEM to the
    end, @see NCONC-TO-END-HASH.
     * @unknown An error will occur if (gethash KEY TABLE) is not listp.
     * @return list ; The new value of KEY in TABLE.
     */
    @LispMethod(comment = "@param key\r\n\t\tA key of the hashtable TABLE.\r\n@param item\nlist\r\n\t\t\r\n@param table\nhashtable\r\n\t\t\r\n@unknown Concatenates (using @xref nconc) ITEM to the value of\r\nKEY in TABLE.  Sets the value of KEY to this list.  ITEM will\r\nbe concatenated before the current value.  To add ITEM to the\r\nend, @see NCONC-TO-END-HASH.\r\n@unknown An error will occur if (gethash KEY TABLE) is not listp.\r\n@return list ; The new value of KEY in TABLE.")
    public static final SubLObject nconc_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, nconc(item, gethash(key, table, UNPROVIDED)));
    }

    /**
     *
     *
     * @param key
     * 		A key of the hashtable TABLE.
     * @param item
    list
     * 		
     * @param table
    hashtable
     * 		
     * @unknown Concatenates (using @xref nconc) ITEM to the value of
    KEY in TABLE.  Sets the value of KEY to this list.  ITEM will
    be concatenated before the current value.  To add ITEM to the
    end, @see NCONC-TO-END-HASH.
     * @unknown An error will occur if (gethash KEY TABLE) is not listp.
     * @return list ; The new value of KEY in TABLE.
     */
    @LispMethod(comment = "@param key\r\n\t\tA key of the hashtable TABLE.\r\n@param item\nlist\r\n\t\t\r\n@param table\nhashtable\r\n\t\t\r\n@unknown Concatenates (using @xref nconc) ITEM to the value of\r\nKEY in TABLE.  Sets the value of KEY to this list.  ITEM will\r\nbe concatenated before the current value.  To add ITEM to the\r\nend, @see NCONC-TO-END-HASH.\r\n@unknown An error will occur if (gethash KEY TABLE) is not listp.\r\n@return list ; The new value of KEY in TABLE.")
    public static SubLObject nconc_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, nconc(item, gethash(key, table, UNPROVIDED)));
    }

    /**
     *
     *
     * @param key
     * 		A key of the hashtable TABLE.
     * @param item
    list
     * 		
     * @param table
    hashtable
     * 		
     * @unknown Concatenates (using @xref NCONC) ITEM to the value of
    KEY in TABLE.  Sets the value of KEY to this list.  ITEM will
    be concatenated after the current value.  To add item to the
    front, @see NCONC-HASH.
     * @unknown An error will occur if (gethash KEY TABLE) is not listp.
     * @return list ; The new value of KEY in TABLE.
     */
    @LispMethod(comment = "@param key\r\n\t\tA key of the hashtable TABLE.\r\n@param item\nlist\r\n\t\t\r\n@param table\nhashtable\r\n\t\t\r\n@unknown Concatenates (using @xref NCONC) ITEM to the value of\r\nKEY in TABLE.  Sets the value of KEY to this list.  ITEM will\r\nbe concatenated after the current value.  To add item to the\r\nfront, @see NCONC-HASH.\r\n@unknown An error will occur if (gethash KEY TABLE) is not listp.\r\n@return list ; The new value of KEY in TABLE.")
    public static final SubLObject nconc_to_end_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, nconc(gethash(key, table, UNPROVIDED), item));
    }

    /**
     *
     *
     * @param key
     * 		A key of the hashtable TABLE.
     * @param item
    list
     * 		
     * @param table
    hashtable
     * 		
     * @unknown Concatenates (using @xref NCONC) ITEM to the value of
    KEY in TABLE.  Sets the value of KEY to this list.  ITEM will
    be concatenated after the current value.  To add item to the
    front, @see NCONC-HASH.
     * @unknown An error will occur if (gethash KEY TABLE) is not listp.
     * @return list ; The new value of KEY in TABLE.
     */
    @LispMethod(comment = "@param key\r\n\t\tA key of the hashtable TABLE.\r\n@param item\nlist\r\n\t\t\r\n@param table\nhashtable\r\n\t\t\r\n@unknown Concatenates (using @xref NCONC) ITEM to the value of\r\nKEY in TABLE.  Sets the value of KEY to this list.  ITEM will\r\nbe concatenated after the current value.  To add item to the\r\nfront, @see NCONC-HASH.\r\n@unknown An error will occur if (gethash KEY TABLE) is not listp.\r\n@return list ; The new value of KEY in TABLE.")
    public static SubLObject nconc_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, nconc(gethash(key, table, UNPROVIDED), item));
    }

    /**
     *
     *
     * @param from
     * 		hash table from which to copy all values
     * @param to
     * 		hash table into which all values of from will be copied.
     * @unknown to a hash table
     */
    @LispMethod(comment = "@param from\r\n\t\thash table from which to copy all values\r\n@param to\r\n\t\thash table into which all values of from will be copied.\r\n@unknown to a hash table")
    public static final SubLObject copy_hash_table_values_into_alt(SubLObject from, SubLObject to) {
        {
            SubLObject k = NIL;
            SubLObject v = NIL;
            {
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
            }
        }
        return to;
    }

    /**
     *
     *
     * @param from
     * 		hash table from which to copy all values
     * @param to
     * 		hash table into which all values of from will be copied.
     * @unknown to a hash table
     */
    @LispMethod(comment = "@param from\r\n\t\thash table from which to copy all values\r\n@param to\r\n\t\thash table into which all values of from will be copied.\r\n@unknown to a hash table")
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

    /**
     * Return a new hashtable with the same test and entries as HASH-TABLE.
     */
    @LispMethod(comment = "Return a new hashtable with the same test and entries as HASH-TABLE.")
    public static final SubLObject copy_hashtable_alt(SubLObject hash_table, SubLObject size) {
        if (size == UNPROVIDED) {
            size = hash_table_count(hash_table);
        }
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        {
            SubLObject test = hash_table_test(hash_table);
            SubLObject new_table = make_hash_table(size, test, UNPROVIDED);
            com.cyc.cycjava.cycl.hash_table_utilities.copy_hash_table_values_into(hash_table, new_table);
            return new_table;
        }
    }

    @LispMethod(comment = "Return a new hashtable with the same test and entries as HASH-TABLE.")
    public static SubLObject copy_hashtable(final SubLObject hash_table, SubLObject size) {
        if (size == UNPROVIDED) {
            size = hash_table_count(hash_table);
        }
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        final SubLObject test = hash_table_test(hash_table);
        final SubLObject new_table = make_hash_table(size, test, UNPROVIDED);
        copy_hash_table_values_into(hash_table, new_table);
        return new_table;
    }/**
     * Return a new hashtable with the same test and entries as HASH-TABLE.
     */


    public static final SubLObject sort_hash_value_alt(SubLObject key, SubLObject table, SubLObject sort_fn) {
        return sethash(key, table, funcall(sort_fn, gethash(key, table, UNPROVIDED)));
    }

    public static SubLObject sort_hash_value(final SubLObject key, final SubLObject table, final SubLObject sort_fn) {
        return sethash(key, table, funcall(sort_fn, gethash(key, table, UNPROVIDED)));
    }

    public static final SubLObject delete_hash_alt(SubLObject key, SubLObject item, SubLObject table, SubLObject test, SubLObject test_key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (test_key == UNPROVIDED) {
            test_key = symbol_function(IDENTITY);
        }
        return sethash(key, table, delete(item, gethash(key, table, UNPROVIDED), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED));
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

    /**
     * Deletes ITEM from the list of values for KEY in TABLE. If the new list of values thus computed is empty
     * then deletes the entry for KEY from TABLE.
     *
     * @unknown zelal
     */
    @LispMethod(comment = "Deletes ITEM from the list of values for KEY in TABLE. If the new list of values thus computed is empty\r\nthen deletes the entry for KEY from TABLE.\r\n\r\n@unknown zelal\nDeletes ITEM from the list of values for KEY in TABLE. If the new list of values thus computed is empty\nthen deletes the entry for KEY from TABLE.")
    public static final SubLObject prune_hash_alt(SubLObject key, SubLObject item, SubLObject table, SubLObject test, SubLObject test_key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (test_key == UNPROVIDED) {
            test_key = symbol_function(IDENTITY);
        }
        {
            SubLObject new_value = delete(item, gethash(key, table, UNPROVIDED), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != new_value) {
                return sethash(key, table, new_value);
            } else {
                return remhash(key, table);
            }
        }
    }

    @LispMethod(comment = "Deletes ITEM from the list of values for KEY in TABLE. If the new list of values thus computed is empty\r\nthen deletes the entry for KEY from TABLE.\r\n\r\n@unknown zelal\nDeletes ITEM from the list of values for KEY in TABLE. If the new list of values thus computed is empty\nthen deletes the entry for KEY from TABLE.")
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
    }/**
     * Deletes ITEM from the list of values for KEY in TABLE. If the new list of values thus computed is empty
     * then deletes the entry for KEY from TABLE.
     *
     * @unknown zelal
     */


    /**
     * TABLE is a hashtable that maps keys to numbers.
     * This method increments the count of KEY in TABLE by INCREMENT,
     * or initializes it to INITIAL-VAL if it doesn't yet have a value.
     */
    @LispMethod(comment = "TABLE is a hashtable that maps keys to numbers.\r\nThis method increments the count of KEY in TABLE by INCREMENT,\r\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.\nTABLE is a hashtable that maps keys to numbers.\nThis method increments the count of KEY in TABLE by INCREMENT,\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.")
    public static final SubLObject cinc_hash_alt(SubLObject key, SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(table, HASH_TABLE_P);
            {
                SubLObject val = gethash(key, table, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == val) || val.isNumber())) {
                        Errors.error($str_alt8$The_key__S_maps_to_the_non_numeri, key, val, table);
                    }
                }
                return sethash(key, table, NIL != val ? ((SubLObject) (add(val, increment))) : initial_val);
            }
        }
    }

    @LispMethod(comment = "TABLE is a hashtable that maps keys to numbers.\r\nThis method increments the count of KEY in TABLE by INCREMENT,\r\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.\nTABLE is a hashtable that maps keys to numbers.\nThis method increments the count of KEY in TABLE by INCREMENT,\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.")
    public static SubLObject cinc_hash(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hash_table_p(table) : "! hash_table_p(table) " + ("Types.hash_table_p(table) " + "CommonSymbols.NIL != Types.hash_table_p(table) ") + table;
        final SubLObject val = gethash(key, table, UNPROVIDED);
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != val)) && (!val.isNumber())) {
            Errors.error($str10$The_key__S_maps_to_the_non_numeri, key, val, table);
        }
        return sethash(key, table, NIL != val ? add(val, increment) : initial_val);
    }/**
     * TABLE is a hashtable that maps keys to numbers.
     * This method increments the count of KEY in TABLE by INCREMENT,
     * or initializes it to INITIAL-VAL if it doesn't yet have a value.
     */


    public static final SubLObject nunion_hash_alt(SubLObject key, SubLObject items, SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, nunion(gethash(key, table, UNPROVIDED), items, test, UNPROVIDED));
    }

    public static SubLObject nunion_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, nunion(gethash(key, table, UNPROVIDED), items, test, UNPROVIDED));
    }

    public static final SubLObject nset_difference_hash_alt(SubLObject key, SubLObject items, SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, nset_difference(gethash(key, table, UNPROVIDED), items, test, UNPROVIDED));
    }

    public static SubLObject nset_difference_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return sethash(key, table, nset_difference(gethash(key, table, UNPROVIDED), items, test, UNPROVIDED));
    }

    /**
     *
     *
     * @return list; the list of keys of HASH1 whose values in HASH1 are not equal to their values in HASH2.
     */
    @LispMethod(comment = "@return list; the list of keys of HASH1 whose values in HASH1 are not equal to their values in HASH2.")
    public static final SubLObject hash_difference_alt(SubLObject hash1, SubLObject hash2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject result = NIL;
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
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
            }
            return result;
        }
    }

    /**
     *
     *
     * @return list; the list of keys of HASH1 whose values in HASH1 are not equal to their values in HASH2.
     */
    @LispMethod(comment = "@return list; the list of keys of HASH1 whose values in HASH1 are not equal to their values in HASH2.")
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

    /**
     *
     *
     * @return list; the list of keys of HASH1 that are not in HASH2.
     */
    @LispMethod(comment = "@return list; the list of keys of HASH1 that are not in HASH2.")
    public static final SubLObject hash_existence_difference_alt(SubLObject hash1, SubLObject hash2) {
        {
            SubLObject result = NIL;
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
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
            }
            return result;
        }
    }

    /**
     *
     *
     * @return list; the list of keys of HASH1 that are not in HASH2.
     */
    @LispMethod(comment = "@return list; the list of keys of HASH1 that are not in HASH2.")
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

    public static final SubLObject hash_memberP_alt(SubLObject key, SubLObject item, SubLObject table, SubLObject member_test, SubLObject member_key) {
        if (member_test == UNPROVIDED) {
            member_test = symbol_function(EQL);
        }
        if (member_key == UNPROVIDED) {
            member_key = symbol_function(IDENTITY);
        }
        return subl_promotions.memberP(item, gethash(key, table, UNPROVIDED), member_test, member_key);
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

    /**
     *
     *
     * @return boolean; whether all elements of LIST, used as keys, have some non-nil value in HASH.
     */
    @LispMethod(comment = "@return boolean; whether all elements of LIST, used as keys, have some non-nil value in HASH.")
    public static final SubLObject all_elements_in_hashP_alt(SubLObject list, SubLObject hash) {
        {
            SubLObject missingP = NIL;
            if (NIL == missingP) {
                {
                    SubLObject csome_list_var = list;
                    SubLObject key = NIL;
                    for (key = csome_list_var.first(); !((NIL != missingP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , key = csome_list_var.first()) {
                        if (NIL == gethash(key, hash, UNPROVIDED)) {
                            missingP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == missingP);
        }
    }

    /**
     *
     *
     * @return boolean; whether all elements of LIST, used as keys, have some non-nil value in HASH.
     */
    @LispMethod(comment = "@return boolean; whether all elements of LIST, used as keys, have some non-nil value in HASH.")
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

    /**
     * Sort the values in HASHTABLE using PREDICATE and KEY into a list
     */
    @LispMethod(comment = "Sort the values in HASHTABLE using PREDICATE and KEY into a list")
    public static final SubLObject sort_hash_table_data_alt(SubLObject hashtable, SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(hashtable, HASH_TABLE_P);
        {
            SubLObject total = hash_table_count(hashtable);
            if (total.numG(ZERO_INTEGER)) {
                {
                    SubLObject sort_vec = make_vector(total, UNPROVIDED);
                    SubLObject v_answer = NIL;
                    SubLObject index = ZERO_INTEGER;
                    SubLObject hash_key = NIL;
                    SubLObject val = NIL;
                    {
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
                    }
                    sort_vec = Sort.sort(sort_vec, predicate, key);
                    {
                        SubLObject cdotimes_end_var = length(sort_vec);
                        SubLObject index_1 = NIL;
                        for (index_1 = ZERO_INTEGER; index_1.numL(cdotimes_end_var); index_1 = add(index_1, ONE_INTEGER)) {
                            v_answer = cons(aref(sort_vec, index_1), v_answer);
                        }
                    }
                    return nreverse(v_answer);
                }
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Sort the values in HASHTABLE using PREDICATE and KEY into a list")
    public static SubLObject sort_hash_table_data(final SubLObject hashtable, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != hash_table_p(hashtable) : "! hash_table_p(hashtable) " + ("Types.hash_table_p(hashtable) " + "CommonSymbols.NIL != Types.hash_table_p(hashtable) ") + hashtable;
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
    }/**
     * Sort the values in HASHTABLE using PREDICATE and KEY into a list
     */


    /**
     * returns N pairs corresponding to the first N entries
     * encountered in hashtable TABLE; the first element of
     * the pair is the key of the hashtable entry; the second
     * element of the pair is the value of the hashtable entry.
     */
    @LispMethod(comment = "returns N pairs corresponding to the first N entries\r\nencountered in hashtable TABLE; the first element of\r\nthe pair is the key of the hashtable entry; the second\r\nelement of the pair is the value of the hashtable entry.\nreturns N pairs corresponding to the first N entries\nencountered in hashtable TABLE; the first element of\nthe pair is the key of the hashtable entry; the second\nelement of the pair is the value of the hashtable entry.")
    public static final SubLObject hash_first_n_alt(SubLObject n, SubLObject table) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject result = NIL;
            SubLObject catch_var = NIL;
            try {
                {
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    {
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
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
            return nreverse(result);
        }
    }

    @LispMethod(comment = "returns N pairs corresponding to the first N entries\r\nencountered in hashtable TABLE; the first element of\r\nthe pair is the key of the hashtable entry; the second\r\nelement of the pair is the value of the hashtable entry.\nreturns N pairs corresponding to the first N entries\nencountered in hashtable TABLE; the first element of\nthe pair is the key of the hashtable entry; the second\nelement of the pair is the value of the hashtable entry.")
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
    }/**
     * returns N pairs corresponding to the first N entries
     * encountered in hashtable TABLE; the first element of
     * the pair is the key of the hashtable entry; the second
     * element of the pair is the value of the hashtable entry.
     */


    public static final SubLObject list_table_keys_alt(SubLObject hash_table) {
        return com.cyc.cycjava.cycl.hash_table_utilities.hash_table_keys(hash_table);
    }

    public static SubLObject list_table_keys(final SubLObject hash_table) {
        return hash_table_keys(hash_table);
    }

    /**
     * Returns an arbitrary key in HASH-TABLE.
     */
    @LispMethod(comment = "Returns an arbitrary key in HASH-TABLE.")
    public static final SubLObject hash_table_arbitrary_key_alt(SubLObject hash_table) {
        {
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        val = getEntryValue(cdohash_entry);
                        return key;
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns an arbitrary key in HASH-TABLE.")
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
    }/**
     * Returns an arbitrary key in HASH-TABLE.
     */


    /**
     * Returns an arbitrary value in HASH-TABLE.
     */
    @LispMethod(comment = "Returns an arbitrary value in HASH-TABLE.")
    public static final SubLObject hash_table_arbitrary_value_alt(SubLObject hash_table) {
        {
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        val = getEntryValue(cdohash_entry);
                        return val;
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns an arbitrary value in HASH-TABLE.")
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
    }/**
     * Returns an arbitrary value in HASH-TABLE.
     */


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

    /**
     * Return a list of all the keys of HASH-TABLE.
     */
    @LispMethod(comment = "Return a list of all the keys of HASH-TABLE.")
    public static final SubLObject hash_table_keys_alt(SubLObject hash_table) {
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        {
            SubLObject v_answer = make_list(hash_table_count(hash_table), UNPROVIDED);
            SubLObject cursor = v_answer;
            SubLObject key = NIL;
            SubLObject obj = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        obj = getEntryValue(cdohash_entry);
                        rplaca(cursor, key);
                        cursor = cursor.rest();
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return v_answer;
        }
    }

    @LispMethod(comment = "Return a list of all the keys of HASH-TABLE.")
    public static SubLObject hash_table_keys(final SubLObject hash_table) {
        return hash_table_keys_or_values(hash_table, $KEYS);
    }/**
     * Return a list of all the keys of HASH-TABLE.
     */


    /**
     * Return a list of all the values of HASH-TABLE.
     */
    @LispMethod(comment = "Return a list of all the values of HASH-TABLE.")
    public static final SubLObject hash_table_values_alt(SubLObject hash_table) {
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        {
            SubLObject v_answer = make_list(hash_table_count(hash_table), UNPROVIDED);
            SubLObject cursor = v_answer;
            SubLObject key = NIL;
            SubLObject obj = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        obj = getEntryValue(cdohash_entry);
                        rplaca(cursor, obj);
                        cursor = cursor.rest();
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return v_answer;
        }
    }

    @LispMethod(comment = "Return a list of all the values of HASH-TABLE.")
    public static SubLObject hash_table_values(final SubLObject hash_table) {
        return hash_table_keys_or_values(hash_table, $VALUES);
    }/**
     * Return a list of all the values of HASH-TABLE.
     */


    public static SubLObject hash_table_keys_or_values(final SubLObject hash_table, final SubLObject type) {
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
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

    /**
     *
     *
     * @return listp; a list of all keys of HASH-TABLE with value TARGET-VALUE, according to TEST.
     */
    @LispMethod(comment = "@return listp; a list of all keys of HASH-TABLE with value TARGET-VALUE, according to TEST.")
    public static final SubLObject hash_table_keys_with_value_alt(SubLObject hash_table, SubLObject target_value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject keys = NIL;
            SubLObject key = NIL;
            SubLObject value = NIL;
            {
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
            }
            return nreverse(keys);
        }
    }

    /**
     *
     *
     * @return listp; a list of all keys of HASH-TABLE with value TARGET-VALUE, according to TEST.
     */
    @LispMethod(comment = "@return listp; a list of all keys of HASH-TABLE with value TARGET-VALUE, according to TEST.")
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

    /**
     * Returns a random key from HASH-TABLE with value TARGET-VALUE, according to TEST.
     */
    @LispMethod(comment = "Returns a random key from HASH-TABLE with value TARGET-VALUE, according to TEST.")
    public static final SubLObject random_hash_table_key_with_value_alt(SubLObject hash_table, SubLObject target_value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.hash_table_utilities.hash_table_keys_with_value(hash_table, target_value, test));
    }

    @LispMethod(comment = "Returns a random key from HASH-TABLE with value TARGET-VALUE, according to TEST.")
    public static SubLObject random_hash_table_key_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.random_element(hash_table_keys_with_value(hash_table, target_value, test));
    }/**
     * Returns a random key from HASH-TABLE with value TARGET-VALUE, according to TEST.
     */


    /**
     * Return an alist of all the (key . value) entries in HASH-TABLE.
     * Second value returned is the equality test of HASH-TABLE.
     */
    @LispMethod(comment = "Return an alist of all the (key . value) entries in HASH-TABLE.\r\nSecond value returned is the equality test of HASH-TABLE.\nReturn an alist of all the (key . value) entries in HASH-TABLE.\nSecond value returned is the equality test of HASH-TABLE.")
    public static final SubLObject hash_table_to_alist_alt(SubLObject hash_table) {
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        {
            SubLObject test = hash_table_test(hash_table);
            SubLObject alist = NIL;
            SubLObject key = NIL;
            SubLObject value = NIL;
            {
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
            }
            return values(alist, test);
        }
    }

    @LispMethod(comment = "Return an alist of all the (key . value) entries in HASH-TABLE.\r\nSecond value returned is the equality test of HASH-TABLE.\nReturn an alist of all the (key . value) entries in HASH-TABLE.\nSecond value returned is the equality test of HASH-TABLE.")
    public static SubLObject hash_table_to_alist(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
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
    }/**
     * Return an alist of all the (key . value) entries in HASH-TABLE.
     * Second value returned is the equality test of HASH-TABLE.
     */


    public static final SubLObject new_hash_table_from_alist_alt(SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject hash = make_hash_table(length(alist), test, UNPROVIDED);
            SubLObject cdolist_list_var = alist;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    key = current.first();
                    current = current.rest();
                    value = current;
                    sethash(key, hash, value);
                }
            }
            return hash;
        }
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

    /**
     * Return a list of all key-value pairs in hashtable.
     */
    @LispMethod(comment = "Return a list of all key-value pairs in hashtable.")
    public static final SubLObject get_table_values_alt(SubLObject hashtable) {
        {
            SubLObject ans = NIL;
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
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
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return a list of all key-value pairs in hashtable.")
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
    }/**
     * Return a list of all key-value pairs in hashtable.
     */


    /**
     *
     *
     * @return non-negative integer; the length of the shortest list appearing as a value in hashtable TABLE
     */
    @LispMethod(comment = "@return non-negative integer; the length of the shortest list appearing as a value in hashtable TABLE")
    public static final SubLObject hash_table_values_min_length_alt(SubLObject table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = ZERO_INTEGER;
        }
        {
            SubLObject min_length = NIL;
            if (table.isHashtable()) {
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                value = getEntryValue(cdohash_entry);
                                if (!value.isCons()) {
                                } else {
                                    if (NIL == min_length) {
                                        min_length = length(value);
                                    } else {
                                        if (!ZERO_INTEGER.numE(min_length)) {
                                            {
                                                SubLObject length = length(value);
                                                if (min_length.numG(length)) {
                                                    min_length = length;
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            return min_length.isNumber() ? ((SubLObject) (min_length)) : v_default;
        }
    }

    /**
     *
     *
     * @return non-negative integer; the length of the shortest list appearing as a value in hashtable TABLE
     */
    @LispMethod(comment = "@return non-negative integer; the length of the shortest list appearing as a value in hashtable TABLE")
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

    /**
     *
     *
     * @return non-negative integer; the count of the smallest hash-table appearing as a value in hashtable TABLE
     */
    @LispMethod(comment = "@return non-negative integer; the count of the smallest hash-table appearing as a value in hashtable TABLE")
    public static final SubLObject hash_table_values_min_count_alt(SubLObject table, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = ZERO_INTEGER;
        }
        {
            SubLObject min_count = NIL;
            if (table.isHashtable()) {
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                value = getEntryValue(cdohash_entry);
                                if (!value.isHashtable()) {
                                } else {
                                    if (NIL == min_count) {
                                        min_count = hash_table_count(value);
                                    } else {
                                        if (!ZERO_INTEGER.numE(min_count)) {
                                            {
                                                SubLObject count = hash_table_count(value);
                                                if (min_count.numG(count)) {
                                                    min_count = count;
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            return min_count.isNumber() ? ((SubLObject) (min_count)) : v_default;
        }
    }

    /**
     *
     *
     * @return non-negative integer; the count of the smallest hash-table appearing as a value in hashtable TABLE
     */
    @LispMethod(comment = "@return non-negative integer; the count of the smallest hash-table appearing as a value in hashtable TABLE")
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

    /**
     * Return a hash table with the objects in list as the keys,
     * each key pointing to a value of FUNC applied to the key
     */
    @LispMethod(comment = "Return a hash table with the objects in list as the keys,\r\neach key pointing to a value of FUNC applied to the key\nReturn a hash table with the objects in list as the keys,\neach key pointing to a value of FUNC applied to the key")
    public static final SubLObject hash_list_elements_alt(SubLObject list, SubLObject test, SubLObject size, SubLObject func) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        if (func == UNPROVIDED) {
            func = symbol_function(TRUE);
        }
        {
            SubLObject table = make_hash_table(size, test, UNPROVIDED);
            SubLObject cdolist_list_var = list;
            SubLObject x = NIL;
            for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                sethash(x, table, func == symbol_function(TRUE) ? ((SubLObject) (T)) : funcall(func, x));
            }
            return table;
        }
    }

    @LispMethod(comment = "Return a hash table with the objects in list as the keys,\r\neach key pointing to a value of FUNC applied to the key\nReturn a hash table with the objects in list as the keys,\neach key pointing to a value of FUNC applied to the key")
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
    }/**
     * Return a hash table with the objects in list as the keys,
     * each key pointing to a value of FUNC applied to the key
     */


    /**
     * Returns a list of all keys in HASHTABLE such that both (a) the key meets
     * KEY-TEST and (b) the value meets VALUE-TEST.
     */
    @LispMethod(comment = "Returns a list of all keys in HASHTABLE such that both (a) the key meets\r\nKEY-TEST and (b) the value meets VALUE-TEST.\nReturns a list of all keys in HASHTABLE such that both (a) the key meets\nKEY-TEST and (b) the value meets VALUE-TEST.")
    public static final SubLObject find_in_hash_if_alt(SubLObject hashtable, SubLObject key_test, SubLObject value_test) {
        {
            SubLObject matched_keys = NIL;
            SubLObject key = NIL;
            SubLObject value = NIL;
            {
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
            }
            return matched_keys;
        }
    }

    @LispMethod(comment = "Returns a list of all keys in HASHTABLE such that both (a) the key meets\r\nKEY-TEST and (b) the value meets VALUE-TEST.\nReturns a list of all keys in HASHTABLE such that both (a) the key meets\nKEY-TEST and (b) the value meets VALUE-TEST.")
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
    }/**
     * Returns a list of all keys in HASHTABLE such that both (a) the key meets
     * KEY-TEST and (b) the value meets VALUE-TEST.
     */


    /**
     * Returns a list of all keys in HASHTABLE such that either (a) the key does not meet
     * KEY-TEST or (b) the value does not meet VALUE-TEST.
     */
    @LispMethod(comment = "Returns a list of all keys in HASHTABLE such that either (a) the key does not meet\r\nKEY-TEST or (b) the value does not meet VALUE-TEST.\nReturns a list of all keys in HASHTABLE such that either (a) the key does not meet\nKEY-TEST or (b) the value does not meet VALUE-TEST.")
    public static final SubLObject find_in_hash_if_not_alt(SubLObject hashtable, SubLObject key_test, SubLObject value_test) {
        {
            SubLObject matched_keys = NIL;
            SubLObject key = NIL;
            SubLObject value = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        if (NIL != funcall(key_test, key)) {
                            if (NIL == funcall(value_test, value)) {
                                matched_keys = cons(key, matched_keys);
                            }
                        } else {
                            matched_keys = cons(key, matched_keys);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return matched_keys;
        }
    }

    @LispMethod(comment = "Returns a list of all keys in HASHTABLE such that either (a) the key does not meet\r\nKEY-TEST or (b) the value does not meet VALUE-TEST.\nReturns a list of all keys in HASHTABLE such that either (a) the key does not meet\nKEY-TEST or (b) the value does not meet VALUE-TEST.")
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
    }/**
     * Returns a list of all keys in HASHTABLE such that either (a) the key does not meet
     * KEY-TEST or (b) the value does not meet VALUE-TEST.
     */


    public static final SubLObject printhash_alt(SubLObject hashtable, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        val = getEntryValue(cdohash_entry);
                        format(stream, $str_alt12$_S_____S__, key, val);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
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

    /**
     * Return a count of all the existing keys in HASHTABLE whose initial
     * hashing bucket collides with that of at least one other key.
     */
    @LispMethod(comment = "Return a count of all the existing keys in HASHTABLE whose initial\r\nhashing bucket collides with that of at least one other key.\nReturn a count of all the existing keys in HASHTABLE whose initial\nhashing bucket collides with that of at least one other key.")
    public static final SubLObject hashtable_key_collision_count_alt(SubLObject hashtable) {
        SubLTrampolineFile.checkType(hashtable, HASH_TABLE_P);
        {
            SubLObject key_count = hash_table_count(hashtable);
            SubLObject collision_table = make_hash_table(key_count, symbol_function(EQL), UNPROVIDED);
            SubLObject key = NIL;
            SubLObject value = NIL;
            {
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
            }
            {
                SubLObject sxhash_count = hash_table_count(collision_table);
                SubLObject collision_count = subtract(key_count, sxhash_count);
                return collision_count;
            }
        }
    }

    @LispMethod(comment = "Return a count of all the existing keys in HASHTABLE whose initial\r\nhashing bucket collides with that of at least one other key.\nReturn a count of all the existing keys in HASHTABLE whose initial\nhashing bucket collides with that of at least one other key.")
    public static SubLObject hashtable_key_collision_count(final SubLObject hashtable) {
        assert NIL != hash_table_p(hashtable) : "! hash_table_p(hashtable) " + ("Types.hash_table_p(hashtable) " + "CommonSymbols.NIL != Types.hash_table_p(hashtable) ") + hashtable;
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
    }/**
     * Return a count of all the existing keys in HASHTABLE whose initial
     * hashing bucket collides with that of at least one other key.
     */


    /**
     * Return the probability that an existing key in HASHTABLE will
     * hash to an initial bucket that is the same as some other key
     * in HASHTABLE.
     */
    @LispMethod(comment = "Return the probability that an existing key in HASHTABLE will\r\nhash to an initial bucket that is the same as some other key\r\nin HASHTABLE.\nReturn the probability that an existing key in HASHTABLE will\nhash to an initial bucket that is the same as some other key\nin HASHTABLE.")
    public static final SubLObject hashtable_key_collision_probability_alt(SubLObject hashtable) {
        return divide(com.cyc.cycjava.cycl.hash_table_utilities.hashtable_key_collision_count(hashtable), hash_table_count(hashtable));
    }

    @LispMethod(comment = "Return the probability that an existing key in HASHTABLE will\r\nhash to an initial bucket that is the same as some other key\r\nin HASHTABLE.\nReturn the probability that an existing key in HASHTABLE will\nhash to an initial bucket that is the same as some other key\nin HASHTABLE.")
    public static SubLObject hashtable_key_collision_probability(final SubLObject hashtable) {
        return divide(hashtable_key_collision_count(hashtable), hash_table_count(hashtable));
    }/**
     * Return the probability that an existing key in HASHTABLE will
     * hash to an initial bucket that is the same as some other key
     * in HASHTABLE.
     */


    public static SubLObject declare_hash_table_utilities_file() {
        declareFunction("valid_hash_test_symbols", "VALID-HASH-TEST-SYMBOLS", 0, 0, false);
        declareFunction("valid_hash_test_p", "VALID-HASH-TEST-P", 1, 0, false);
        declareFunction("hash_test_to_symbol", "HASH-TEST-TO-SYMBOL", 1, 0, false);
        declareFunction("to_hash_test", "TO-HASH-TEST", 1, 0, false);
        declareFunction("hash_table_empty_p", "HASH-TABLE-EMPTY-P", 1, 0, false);
        declareFunction("rehash", "REHASH", 1, 0, false);
        declareFunction("rehash_if_stale", "REHASH-IF-STALE", 1, 0, false);
        declareFunction("hash_table_staleP", "HASH-TABLE-STALE?", 1, 0, false);
        declareFunction("push_hash", "PUSH-HASH", 3, 0, false);
        declareFunction("pushnew_hash", "PUSHNEW-HASH", 3, 1, false);
        declareFunction("push_to_end_hash", "PUSH-TO-END-HASH", 3, 0, false);
        declareFunction("hash_add_to_value_sorted", "HASH-ADD-TO-VALUE-SORTED", 3, 2, false);
        declareFunction("pushnew_to_end_hash", "PUSHNEW-TO-END-HASH", 3, 0, false);
        declareFunction("pop_hash", "POP-HASH", 2, 0, false);
        declareFunction("remove_value_from_hash", "REMOVE-VALUE-FROM-HASH", 3, 1, false);
        declareFunction("gethash_first", "GETHASH-FIRST", 2, 1, false);
        declareFunction("sethash_first", "SETHASH-FIRST", 3, 0, false);
        declareFunction("nconc_hash", "NCONC-HASH", 3, 0, false);
        declareFunction("nconc_to_end_hash", "NCONC-TO-END-HASH", 3, 0, false);
        declareFunction("copy_hash_table_values_into", "COPY-HASH-TABLE-VALUES-INTO", 2, 0, false);
        declareFunction("copy_hashtable", "COPY-HASHTABLE", 1, 1, false);
        declareFunction("sort_hash_value", "SORT-HASH-VALUE", 3, 0, false);
        declareFunction("delete_hash", "DELETE-HASH", 3, 2, false);
        declareFunction("prune_hash", "PRUNE-HASH", 3, 2, false);
        declareFunction("cinc_hash", "CINC-HASH", 2, 2, false);
        declareFunction("nunion_hash", "NUNION-HASH", 3, 1, false);
        declareFunction("nset_difference_hash", "NSET-DIFFERENCE-HASH", 3, 1, false);
        declareFunction("hash_difference", "HASH-DIFFERENCE", 2, 1, false);
        declareFunction("hash_existence_difference", "HASH-EXISTENCE-DIFFERENCE", 2, 0, false);
        declareFunction("hash_memberP", "HASH-MEMBER?", 3, 2, false);
        declareFunction("all_elements_in_hashP", "ALL-ELEMENTS-IN-HASH?", 2, 0, false);
        declareFunction("sort_hash_table_data", "SORT-HASH-TABLE-DATA", 2, 1, false);
        declareFunction("hash_first_n", "HASH-FIRST-N", 2, 0, false);
        declareFunction("list_table_keys", "LIST-TABLE-KEYS", 1, 0, false);
        declareFunction("hash_table_arbitrary_key", "HASH-TABLE-ARBITRARY-KEY", 1, 0, false);
        declareFunction("hash_table_arbitrary_value", "HASH-TABLE-ARBITRARY-VALUE", 1, 0, false);
        declareFunction("hash_table_random_key", "HASH-TABLE-RANDOM-KEY", 1, 0, false);
        declareFunction("hash_table_random_value", "HASH-TABLE-RANDOM-VALUE", 1, 0, false);
        declareFunction("hash_table_keys", "HASH-TABLE-KEYS", 1, 0, false);
        declareFunction("hash_table_values", "HASH-TABLE-VALUES", 1, 0, false);
        declareFunction("hash_table_keys_or_values", "HASH-TABLE-KEYS-OR-VALUES", 2, 0, false);
        declareFunction("hash_table_keys_with_value", "HASH-TABLE-KEYS-WITH-VALUE", 2, 1, false);
        declareFunction("random_hash_table_key_with_value", "RANDOM-HASH-TABLE-KEY-WITH-VALUE", 2, 1, false);
        declareFunction("hash_table_to_alist", "HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction("new_hash_table_from_alist", "NEW-HASH-TABLE-FROM-ALIST", 1, 1, false);
        declareFunction("get_table_values", "GET-TABLE-VALUES", 1, 0, false);
        declareFunction("hash_table_values_min_length", "HASH-TABLE-VALUES-MIN-LENGTH", 1, 1, false);
        declareFunction("hash_table_values_min_count", "HASH-TABLE-VALUES-MIN-COUNT", 1, 1, false);
        declareFunction("hash_list_elements", "HASH-LIST-ELEMENTS", 1, 3, false);
        declareFunction("find_in_hash_if", "FIND-IN-HASH-IF", 3, 0, false);
        declareFunction("find_in_hash_if_not", "FIND-IN-HASH-IF-NOT", 3, 0, false);
        declareFunction("printhash", "PRINTHASH", 1, 1, false);
        declareFunction("hashtable_key_collision_count", "HASHTABLE-KEY-COLLISION-COUNT", 1, 0, false);
        declareFunction("hashtable_key_collision_probability", "HASHTABLE-KEY-COLLISION-PROBABILITY", 1, 0, false);
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

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(EQ, EQL, EQUAL, EQUALP);

    static private final SubLList $list_alt3 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLSymbol $sym4$STRING__ = makeSymbol("STRING<=");

    static private final SubLString $str_alt7$Corrupted_hash_table__attempting_ = makeString("Corrupted hash table; attempting to add values on a non-listp ~a.~%");

    static private final SubLString $str_alt8$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the hashtable ~A.");

    static private final SubLString $str_alt12$_S_____S__ = makeString("~S -> ~S~%");
}

/**
 * Total time: 243 ms
 */
