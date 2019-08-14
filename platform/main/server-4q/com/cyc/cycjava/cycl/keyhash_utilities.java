/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KEYHASH-UTILITIES
 * source file: /cyc/top/cycl/keyhash-utilities.lisp
 * created:     2019/07/03 17:37:14
 */
public final class keyhash_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new keyhash_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.keyhash_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $intersection_table$ = makeSymbol("*INTERSECTION-TABLE*");

    // defparameter
    // controls thread access to the hash-intersection keyhash
    /**
     * controls thread access to the hash-intersection keyhash
     */
    @LispMethod(comment = "controls thread access to the hash-intersection keyhash\ndefparameter")
    private static final SubLSymbol $intersection_table_lock$ = makeSymbol("*INTERSECTION-TABLE-LOCK*");

    private static final SubLSymbol KEYHASH_P = makeSymbol("KEYHASH-P");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $$$Intersection_table_Lock = makeString("Intersection table Lock");

    // Definitions
    public static final SubLObject keyhash_element_list_alt(SubLObject v_keyhash) {
        {
            SubLObject result = NIL;
            SubLObject vector_var = keyhash.do_keyhash_nodes(v_keyhash);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject key = aref(vector_var, element_num);
                    if (NIL != keyhash.do_keyhash_valid_key_p(key)) {
                        result = cons(key, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    // Definitions
    public static SubLObject keyhash_element_list(final SubLObject v_keyhash) {
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        SubLObject result = NIL;
        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(v_keyhash);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                result = cons(key, result);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return nreverse(result);
    }

    /**
     * Convert the list representation into a keyhash
     * representation by hashing all the values into the table.
     *
     * @return keyhash
     */
    @LispMethod(comment = "Convert the list representation into a keyhash\r\nrepresentation by hashing all the values into the table.\r\n\r\n@return keyhash\nConvert the list representation into a keyhash\nrepresentation by hashing all the values into the table.")
    public static final SubLObject keyhash_list_elements_alt(SubLObject list, SubLObject testfn, SubLObject size) {
        if (testfn == UNPROVIDED) {
            testfn = NIL;
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        {
            SubLObject v_keyhash = keyhash.new_keyhash(size, testfn);
            SubLObject cdolist_list_var = list;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                keyhash.setkeyhash(elem, v_keyhash);
            }
            return v_keyhash;
        }
    }

    /**
     * Convert the list representation into a keyhash
     * representation by hashing all the values into the table.
     *
     * @return keyhash
     */
    @LispMethod(comment = "Convert the list representation into a keyhash\r\nrepresentation by hashing all the values into the table.\r\n\r\n@return keyhash\nConvert the list representation into a keyhash\nrepresentation by hashing all the values into the table.")
    public static SubLObject keyhash_list_elements(final SubLObject list, SubLObject testfn, SubLObject size) {
        if (testfn == UNPROVIDED) {
            testfn = NIL;
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        final SubLObject v_keyhash = keyhash.new_keyhash(size, testfn);
        SubLObject cdolist_list_var = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            keyhash.setkeyhash(elem, v_keyhash);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return v_keyhash;
    }

    /**
     * Like rehash for keyhashes
     */
    @LispMethod(comment = "Like rehash for keyhashes")
    public static final SubLObject keyhash_rebuild_alt(SubLObject v_keyhash) {
        {
            SubLObject element_list = com.cyc.cycjava.cycl.keyhash_utilities.keyhash_element_list(v_keyhash);
            keyhash.clrkeyhash(v_keyhash);
            {
                SubLObject cdolist_list_var = element_list;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    keyhash.setkeyhash(elem, v_keyhash);
                }
            }
        }
        return v_keyhash;
    }

    /**
     * Like rehash for keyhashes
     */
    @LispMethod(comment = "Like rehash for keyhashes")
    public static SubLObject keyhash_rebuild(final SubLObject v_keyhash) {
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        final SubLObject element_list = keyhash_element_list(v_keyhash);
        keyhash.clrkeyhash(v_keyhash);
        SubLObject cdolist_list_var = element_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            keyhash.setkeyhash(elem, v_keyhash);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return v_keyhash;
    }

    public static SubLObject keyhash_to_hashtable(final SubLObject v_keyhash, SubLObject value, SubLObject area) {
        if (value == UNPROVIDED) {
            value = T;
        }
        if (area == UNPROVIDED) {
            area = NIL;
        }
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        final SubLObject size = keyhash.keyhash_count(v_keyhash);
        final SubLObject test = keyhash.keyhash_test(v_keyhash);
        final SubLObject table = make_hash_table(size, test, list($AREA, area));
        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(v_keyhash);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                sethash(key, table, value);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return table;
    }

    public static SubLObject hashtable_to_keyhash(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        final SubLObject size = hash_table_count(hash_table);
        final SubLObject test = hash_table_test(hash_table);
        final SubLObject v_keyhash = keyhash.new_keyhash(size, test);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                keyhash.setkeyhash(key, v_keyhash);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_keyhash;
    }

    /**
     *
     *
     * @unknown this implementation sometimes uses #'equal even when something else is specified.  @todo fix it.
     */
    @LispMethod(comment = "@unknown this implementation sometimes uses #\'equal even when something else is specified.  @todo fix it.")
    public static final SubLObject fast_intersection_alt(SubLObject list_1, SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
            if (NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) {
                return intersection(list_1, list_2, test, key);
            } else {
                if (NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) {
                    return intersection(list_1, list_2, test, key);
                } else {
                    if (NIL != v_keyhash) {
                        return com.cyc.cycjava.cycl.keyhash_utilities.hash_intersection(list_1, list_2, v_keyhash, key);
                    } else {
                        if (NIL != hash_table_utilities.valid_hash_test_p(test)) {
                            return com.cyc.cycjava.cycl.keyhash_utilities.hash_intersection(list_1, list_2, $intersection_table$.getDynamicValue(thread), key);
                        } else {
                            return intersection(list_1, list_2, test, key);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown this implementation sometimes uses #'equal even when something else is specified.  @todo fix it.
     */
    @LispMethod(comment = "@unknown this implementation sometimes uses #\'equal even when something else is specified.  @todo fix it.")
    public static SubLObject fast_intersection(final SubLObject list_1, final SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        if ((NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) || (NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))) {
            return intersection(list_1, list_2, test, key);
        }
        if (NIL != v_keyhash) {
            return hash_intersection(list_1, list_2, v_keyhash, key);
        }
        if (NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_intersection(list_1, list_2, $intersection_table$.getDynamicValue(thread), key);
        }
        return intersection(list_1, list_2, test, key);
    }

    public static SubLObject fast_union(final SubLObject list_1, final SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        if ((NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) && (NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))) {
            return union(list_1, list_2, test, key);
        }
        if (NIL != v_keyhash) {
            return hash_union(list_1, list_2, v_keyhash, key);
        }
        if (NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_union(list_1, list_2, $intersection_table$.getDynamicValue(thread), key);
        }
        return union(list_1, list_2, test, key);
    }

    /**
     *
     *
     * @return the list of forts that are in both FORTS-1 and FORTS-2
     */
    @LispMethod(comment = "@return the list of forts that are in both FORTS-1 and FORTS-2")
    public static final SubLObject intersect_forts_alt(SubLObject forts_1, SubLObject forts_2) {
        return com.cyc.cycjava.cycl.keyhash_utilities.fast_intersection(forts_1, forts_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return the list of forts that are in both FORTS-1 and FORTS-2
     */
    @LispMethod(comment = "@return the list of forts that are in both FORTS-1 and FORTS-2")
    public static SubLObject intersect_forts(final SubLObject forts_1, final SubLObject forts_2) {
        return fast_intersection(forts_1, forts_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject hash_intersection_alt(SubLObject list_1, SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_keyhash.eql($intersection_table$.getDynamicValue(thread))) {
                {
                    SubLObject result = NIL;
                    SubLObject lock = $intersection_table_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        result = com.cyc.cycjava.cycl.keyhash_utilities.hash_intersection_int(list_1, list_2, v_keyhash, key);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.keyhash_utilities.hash_intersection_int(list_1, list_2, v_keyhash, key);
            }
        }
    }

    public static SubLObject hash_intersection(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_keyhash.eql($intersection_table$.getDynamicValue(thread))) {
            SubLObject result = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($intersection_table_lock$.getDynamicValue(thread));
                result = hash_intersection_int(list_1, list_2, v_keyhash, key);
            } finally {
                if (NIL != release) {
                    release_lock($intersection_table_lock$.getDynamicValue(thread));
                }
            }
            return result;
        }
        return hash_intersection_int(list_1, list_2, v_keyhash, key);
    }

    public static final SubLObject hash_intersection_int_alt(SubLObject list_1, SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(list_1, LISTP);
        SubLTrampolineFile.checkType(list_2, LISTP);
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        if (list_1 == list_2) {
            return list_1;
        } else {
            {
                SubLObject result = NIL;
                keyhash.clrkeyhash(v_keyhash);
                if ((key == symbol_function(IDENTITY)) || (key == IDENTITY)) {
                    {
                        SubLObject cdolist_list_var = list_1;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            keyhash.setkeyhash(item, v_keyhash);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = list_2;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            if (NIL != keyhash.getkeyhash(item, v_keyhash)) {
                                result = cons(item, result);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = list_1;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            keyhash.setkeyhash(funcall(key, item), v_keyhash);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = list_2;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            if (NIL != keyhash.getkeyhash(funcall(key, item), v_keyhash)) {
                                result = cons(item, result);
                            }
                        }
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static SubLObject hash_intersection_int(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != listp(list_1) : "! listp(list_1) " + ("Types.listp(list_1) " + "CommonSymbols.NIL != Types.listp(list_1) ") + list_1;
        assert NIL != listp(list_2) : "! listp(list_2) " + ("Types.listp(list_2) " + "CommonSymbols.NIL != Types.listp(list_2) ") + list_2;
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        if (list_1.eql(list_2)) {
            return list_1;
        }
        SubLObject result = NIL;
        keyhash.clrkeyhash(v_keyhash);
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(item, v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            cdolist_list_var = list_2;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != keyhash.getkeyhash(item, v_keyhash)) {
                    result = cons(item, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(funcall(key, item), v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            cdolist_list_var = list_2;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != keyhash.getkeyhash(funcall(key, item), v_keyhash)) {
                    result = cons(item, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        return nreverse(result);
    }

    public static SubLObject hash_union(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_keyhash.eql($intersection_table$.getDynamicValue(thread))) {
            SubLObject result = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($intersection_table_lock$.getDynamicValue(thread));
                result = hash_union_int(list_1, list_2, v_keyhash, key);
            } finally {
                if (NIL != release) {
                    release_lock($intersection_table_lock$.getDynamicValue(thread));
                }
            }
            return result;
        }
        return hash_union_int(list_1, list_2, v_keyhash, key);
    }

    public static SubLObject hash_union_int(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != listp(list_1) : "! listp(list_1) " + ("Types.listp(list_1) " + "CommonSymbols.NIL != Types.listp(list_1) ") + list_1;
        assert NIL != listp(list_2) : "! listp(list_2) " + ("Types.listp(list_2) " + "CommonSymbols.NIL != Types.listp(list_2) ") + list_2;
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        if (list_1.eql(list_2)) {
            return list_1;
        }
        SubLObject result = NIL;
        keyhash.clrkeyhash(v_keyhash);
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == keyhash.getkeyhash(item, v_keyhash)) {
                    result = cons(item, result);
                    keyhash.setkeyhash(item, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            cdolist_list_var = list_2;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == keyhash.getkeyhash(item, v_keyhash)) {
                    result = cons(item, result);
                    keyhash.setkeyhash(item, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = list_1;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject value = funcall(key, item);
                if (NIL == keyhash.getkeyhash(value, v_keyhash)) {
                    result = cons(item, result);
                    keyhash.setkeyhash(value, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            cdolist_list_var = list_2;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject value = funcall(key, item);
                if (NIL == keyhash.getkeyhash(value, v_keyhash)) {
                    result = cons(item, result);
                    keyhash.setkeyhash(value, v_keyhash);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        return nreverse(result);
    }

    /**
     * Like @xref intersect? but not slow.
     *
     * @unknown this implementation sometimes uses #'equal even when something else is specified.  @todo fix it.
     */
    @LispMethod(comment = "Like @xref intersect? but not slow.\r\n\r\n@unknown this implementation sometimes uses #\'equal even when something else is specified.  @todo fix it.")
    public static final SubLObject fast_intersectP_alt(SubLObject list_1, SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
            if (NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) {
                return list_utilities.intersectP(list_1, list_2, test, key);
            } else {
                if (NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) {
                    return list_utilities.intersectP(list_1, list_2, test, key);
                } else {
                    if (NIL != v_keyhash) {
                        return com.cyc.cycjava.cycl.keyhash_utilities.hash_intersectP(list_1, list_2, v_keyhash, key);
                    } else {
                        if (NIL != hash_table_utilities.valid_hash_test_p(test)) {
                            return com.cyc.cycjava.cycl.keyhash_utilities.hash_intersectP(list_1, list_2, $intersection_table$.getDynamicValue(thread), key);
                        } else {
                            return list_utilities.intersectP(list_1, list_2, test, key);
                        }
                    }
                }
            }
        }
    }

    /**
     * Like @xref intersect? but not slow.
     *
     * @unknown this implementation sometimes uses #'equal even when something else is specified.  @todo fix it.
     */
    @LispMethod(comment = "Like @xref intersect? but not slow.\r\n\r\n@unknown this implementation sometimes uses #\'equal even when something else is specified.  @todo fix it.")
    public static SubLObject fast_intersectP(final SubLObject list_1, final SubLObject list_2, SubLObject test, SubLObject key, SubLObject v_keyhash) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        if (NIL != list_utilities.lengthLE(list_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) {
            return list_utilities.intersectP(list_1, list_2, test, key);
        }
        if (NIL != list_utilities.lengthLE(list_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) {
            return list_utilities.intersectP(list_1, list_2, test, key);
        }
        if (NIL != v_keyhash) {
            return hash_intersectP(list_1, list_2, v_keyhash, key);
        }
        if (NIL != hash_table_utilities.valid_hash_test_p(test)) {
            return hash_intersectP(list_1, list_2, $intersection_table$.getDynamicValue(thread), key);
        }
        return list_utilities.intersectP(list_1, list_2, test, key);
    }

    /**
     * Like @xref intersect? but not slow.
     */
    @LispMethod(comment = "Like @xref intersect? but not slow.")
    public static final SubLObject hash_intersectP_alt(SubLObject list_1, SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_keyhash.eql($intersection_table$.getDynamicValue(thread))) {
                {
                    SubLObject result = NIL;
                    SubLObject lock = $intersection_table_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        result = com.cyc.cycjava.cycl.keyhash_utilities.hash_intersect_intP(list_1, list_2, v_keyhash, key);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                    return result;
                }
            } else {
                return com.cyc.cycjava.cycl.keyhash_utilities.hash_intersect_intP(list_1, list_2, v_keyhash, key);
            }
        }
    }

    /**
     * Like @xref intersect? but not slow.
     */
    @LispMethod(comment = "Like @xref intersect? but not slow.")
    public static SubLObject hash_intersectP(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_keyhash.eql($intersection_table$.getDynamicValue(thread))) {
            SubLObject result = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($intersection_table_lock$.getDynamicValue(thread));
                result = hash_intersect_intP(list_1, list_2, v_keyhash, key);
            } finally {
                if (NIL != release) {
                    release_lock($intersection_table_lock$.getDynamicValue(thread));
                }
            }
            return result;
        }
        return hash_intersect_intP(list_1, list_2, v_keyhash, key);
    }

    public static final SubLObject hash_intersect_intP_alt(SubLObject list_1, SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(list_1, LISTP);
        SubLTrampolineFile.checkType(list_2, LISTP);
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        if (list_1 == list_2) {
            return T;
        } else {
            {
                SubLObject list_1_longerP = list_utilities.greater_length_p(list_1, list_2);
                SubLObject short_list = (NIL != list_1_longerP) ? ((SubLObject) (list_2)) : list_1;
                SubLObject long_list = (NIL != list_1_longerP) ? ((SubLObject) (list_1)) : list_2;
                keyhash.clrkeyhash(v_keyhash);
                if ((key == symbol_function(IDENTITY)) || (key == IDENTITY)) {
                    {
                        SubLObject cdolist_list_var = short_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            keyhash.setkeyhash(item, v_keyhash);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = long_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            if (NIL != keyhash.getkeyhash(item, v_keyhash)) {
                                return T;
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = short_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            keyhash.setkeyhash(funcall(key, item), v_keyhash);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = long_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            if (NIL != keyhash.getkeyhash(funcall(key, item), v_keyhash)) {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject hash_intersect_intP(final SubLObject list_1, final SubLObject list_2, SubLObject v_keyhash, SubLObject key) {
        if (v_keyhash == UNPROVIDED) {
            v_keyhash = $intersection_table$.getDynamicValue();
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != listp(list_1) : "! listp(list_1) " + ("Types.listp(list_1) " + "CommonSymbols.NIL != Types.listp(list_1) ") + list_1;
        assert NIL != listp(list_2) : "! listp(list_2) " + ("Types.listp(list_2) " + "CommonSymbols.NIL != Types.listp(list_2) ") + list_2;
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        if (list_1.eql(list_2)) {
            return T;
        }
        final SubLObject list_1_longerP = list_utilities.greater_length_p(list_1, list_2);
        final SubLObject short_list = (NIL != list_1_longerP) ? list_2 : list_1;
        final SubLObject long_list = (NIL != list_1_longerP) ? list_1 : list_2;
        keyhash.clrkeyhash(v_keyhash);
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            SubLObject cdolist_list_var = short_list;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(item, v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            cdolist_list_var = long_list;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != keyhash.getkeyhash(item, v_keyhash)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = short_list;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(funcall(key, item), v_keyhash);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            cdolist_list_var = long_list;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != keyhash.getkeyhash(funcall(key, item), v_keyhash)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject declare_keyhash_utilities_file() {
        declareFunction("keyhash_element_list", "KEYHASH-ELEMENT-LIST", 1, 0, false);
        declareFunction("keyhash_list_elements", "KEYHASH-LIST-ELEMENTS", 1, 2, false);
        declareFunction("keyhash_rebuild", "KEYHASH-REBUILD", 1, 0, false);
        declareFunction("keyhash_to_hashtable", "KEYHASH-TO-HASHTABLE", 1, 2, false);
        declareFunction("hashtable_to_keyhash", "HASHTABLE-TO-KEYHASH", 1, 0, false);
        declareFunction("fast_intersection", "FAST-INTERSECTION", 2, 3, false);
        declareFunction("fast_union", "FAST-UNION", 2, 3, false);
        declareFunction("intersect_forts", "INTERSECT-FORTS", 2, 0, false);
        declareFunction("hash_intersection", "HASH-INTERSECTION", 2, 2, false);
        declareFunction("hash_intersection_int", "HASH-INTERSECTION-INT", 2, 2, false);
        declareFunction("hash_union", "HASH-UNION", 2, 2, false);
        declareFunction("hash_union_int", "HASH-UNION-INT", 2, 2, false);
        declareFunction("fast_intersectP", "FAST-INTERSECT?", 2, 3, false);
        declareFunction("hash_intersectP", "HASH-INTERSECT?", 2, 2, false);
        declareFunction("hash_intersect_intP", "HASH-INTERSECT-INT?", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_keyhash_utilities_file() {
	defparameter("*INTERSECTION-TABLE*", () -> keyhash.new_keyhash($int$500, symbol_function(EQUAL)));
	defparameter("*INTERSECTION-TABLE-LOCK*", () -> make_lock($$$Intersection_table_Lock));
        return NIL;
    }

    public static SubLObject setup_keyhash_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_keyhash_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_keyhash_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_keyhash_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 173 ms
 */
