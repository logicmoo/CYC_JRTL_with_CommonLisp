package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hash_table_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hash_table_utilities";
    public static final String myFingerPrint = "830e9981bf605fbfcaf5f8d9b7ce0653b2e7d3614041f6e7d382de9c00347fdd";
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 368L)
    private static SubLSymbol $valid_hash_test_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 584L)
    private static SubLSymbol $valid_hash_test_functions$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym2$SYMBOL_FUNCTION;
    private static final SubLSymbol $sym3$KBEQ;
    private static final SubLString $str4$_S_cannot_be_coerced_into_a_valid;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$STRING__;
    private static final SubLSymbol $sym7$SYMBOL_NAME;
    private static final SubLSymbol $sym8$HASH_TABLE_P;
    private static final SubLString $str9$Corrupted_hash_table__attempting_;
    private static final SubLString $str10$The_key__S_maps_to_the_non_numeri;
    private static final SubLSymbol $kw11$NOTHING;
    private static final SubLSymbol $kw12$MAPPING_DONE;
    private static final SubLSymbol $kw13$KEYS;
    private static final SubLSymbol $kw14$VALUES;
    private static final SubLSymbol $kw15$UNINTIALIZED;
    private static final SubLSymbol $sym16$TRUE;
    private static final SubLString $str17$_S_____S__;
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 754L)
    public static SubLObject valid_hash_test_symbols() {
        return hash_table_utilities.$valid_hash_test_symbols$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 832L)
    public static SubLObject valid_hash_test_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hash_table_utilities.NIL != subl_promotions.memberP(v_object, hash_table_utilities.$valid_hash_test_symbols$.getGlobalValue(), Symbols.symbol_function((SubLObject)hash_table_utilities.EQ), (SubLObject)hash_table_utilities.UNPROVIDED) || hash_table_utilities.NIL != subl_promotions.memberP(v_object, hash_table_utilities.$valid_hash_test_functions$.getGlobalValue(), Symbols.symbol_function((SubLObject)hash_table_utilities.EQ), (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1075L)
    public static SubLObject hash_test_to_symbol(final SubLObject test) {
        assert hash_table_utilities.NIL != valid_hash_test_p(test) : test;
        if (test.isSymbol()) {
            return test;
        }
        return Sequences.find(test, hash_table_utilities.$valid_hash_test_symbols$.getGlobalValue(), Symbols.symbol_function((SubLObject)hash_table_utilities.EQL), Symbols.symbol_function((SubLObject)hash_table_utilities.$sym2$SYMBOL_FUNCTION), (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1346L)
    public static SubLObject to_hash_test(final SubLObject v_object) {
        if (hash_table_utilities.NIL != valid_hash_test_p(v_object)) {
            return v_object;
        }
        if (v_object.eql(Symbols.symbol_function((SubLObject)hash_table_utilities.$sym3$KBEQ))) {
            return Symbols.symbol_function((SubLObject)hash_table_utilities.EQ);
        }
        if (v_object == hash_table_utilities.$sym3$KBEQ) {
            return (SubLObject)hash_table_utilities.EQ;
        }
        return Errors.error((SubLObject)hash_table_utilities.$str4$_S_cannot_be_coerced_into_a_valid, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1719L)
    public static SubLObject hash_table_empty_p(final SubLObject table) {
        return Numbers.numE((SubLObject)hash_table_utilities.ZERO_INTEGER, Hashtables.hash_table_count(table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1840L)
    public static SubLObject rehash(final SubLObject table) {
        SubLObject pairs = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, value), pairs);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        Hashtables.clrhash(table);
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = (SubLObject)hash_table_utilities.NIL;
        pair = cdolist_list_var.first();
        while (hash_table_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject key2 = (SubLObject)hash_table_utilities.NIL;
            SubLObject value2 = (SubLObject)hash_table_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hash_table_utilities.$list5);
            key2 = current.first();
            current = (value2 = current.rest());
            Hashtables.sethash(key2, table, value2);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2152L)
    public static SubLObject rehash_if_stale(final SubLObject table) {
        if (hash_table_utilities.NIL != hash_table_staleP(table)) {
            return rehash(table);
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2357L)
    public static SubLObject hash_table_staleP(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = hash_table_arbitrary_key(table);
        thread.resetMultipleValues();
        final SubLObject found_value = Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(hash_table_utilities.NIL == foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2753L)
    public static SubLObject push_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, (SubLObject)ConsesLow.cons(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2850L)
    public static SubLObject pushnew_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        return Hashtables.sethash(key, table, conses_high.adjoin(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), test, (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2980L)
    public static SubLObject push_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, list_utilities.nadd_to_end(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 3091L)
    public static SubLObject hash_add_to_value_sorted(final SubLObject key, final SubLObject table, final SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == hash_table_utilities.UNPROVIDED) {
            predicate = (SubLObject)hash_table_utilities.$sym6$STRING__;
        }
        if (key_accessor == hash_table_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)hash_table_utilities.$sym7$SYMBOL_NAME);
        }
        assert hash_table_utilities.NIL != Types.hash_table_p(table) : table;
        SubLObject current_val = Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED);
        if (current_val.isList()) {
            current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
            return Hashtables.sethash(key, table, current_val);
        }
        Errors.error((SubLObject)hash_table_utilities.$str9$Corrupted_hash_table__attempting_, current_val);
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 3765L)
    public static SubLObject pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, list_utilities.nadjoin_to_end(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 3882L)
    public static SubLObject pop_hash(final SubLObject key, final SubLObject table) {
        final SubLObject value = Hashtables.gethash_without_values(key, table, (SubLObject)hash_table_utilities.UNPROVIDED);
        Hashtables.sethash(key, table, value.rest());
        return value.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 4217L)
    public static SubLObject remove_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        return Hashtables.sethash(key, table, Sequences.remove(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), test, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 4448L)
    public static SubLObject gethash_first(final SubLObject key, final SubLObject table, SubLObject v_default) {
        if (v_default == hash_table_utilities.UNPROVIDED) {
            v_default = (SubLObject)hash_table_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject raw_value = Hashtables.gethash(key, table, v_default);
        final SubLObject value_goodP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (raw_value.isList()) {
            return Values.values(raw_value.first(), value_goodP);
        }
        return Values.values(raw_value, value_goodP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 5138L)
    public static SubLObject sethash_first(final SubLObject key, final SubLObject table, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_value = (SubLObject)hash_table_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_value = Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED);
        final SubLObject value_goodP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (hash_table_utilities.NIL == value_goodP) {
            new_value = (SubLObject)ConsesLow.list(value);
        }
        else if (raw_value.isList()) {
            new_value = (SubLObject)ConsesLow.cons(value, raw_value.rest());
        }
        else {
            new_value = (SubLObject)ConsesLow.list(value, raw_value);
        }
        return Hashtables.sethash(key, table, new_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 5973L)
    public static SubLObject nconc_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, ConsesLow.nconc(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 6541L)
    public static SubLObject nconc_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, ConsesLow.nconc(Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7103L)
    public static SubLObject copy_hash_table_values_into(final SubLObject from, final SubLObject to) {
        SubLObject k = (SubLObject)hash_table_utilities.NIL;
        SubLObject v = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(from);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                Hashtables.sethash(k, to, v);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return to;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7365L)
    public static SubLObject copy_hashtable(final SubLObject hash_table, SubLObject size) {
        if (size == hash_table_utilities.UNPROVIDED) {
            size = Hashtables.hash_table_count(hash_table);
        }
        assert hash_table_utilities.NIL != Types.hash_table_p(hash_table) : hash_table;
        final SubLObject test = Hashtables.hash_table_test(hash_table);
        final SubLObject new_table = Hashtables.make_hash_table(size, test, (SubLObject)hash_table_utilities.UNPROVIDED);
        copy_hash_table_values_into(hash_table, new_table);
        return new_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7732L)
    public static SubLObject sort_hash_value(final SubLObject key, final SubLObject table, final SubLObject sort_fn) {
        return Hashtables.sethash(key, table, Functions.funcall(sort_fn, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7845L)
    public static SubLObject delete_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test, SubLObject test_key) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        if (test_key == hash_table_utilities.UNPROVIDED) {
            test_key = Symbols.symbol_function((SubLObject)hash_table_utilities.IDENTITY);
        }
        return Hashtables.sethash(key, table, Sequences.delete(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), test, test_key, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 8005L)
    public static SubLObject prune_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test, SubLObject test_key) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        if (test_key == hash_table_utilities.UNPROVIDED) {
            test_key = Symbols.symbol_function((SubLObject)hash_table_utilities.IDENTITY);
        }
        final SubLObject new_value = Sequences.delete(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), test, test_key, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED, (SubLObject)hash_table_utilities.UNPROVIDED);
        if (hash_table_utilities.NIL != new_value) {
            return Hashtables.sethash(key, table, new_value);
        }
        return Hashtables.remhash(key, table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 8426L)
    public static SubLObject cinc_hash(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val) {
        if (increment == hash_table_utilities.UNPROVIDED) {
            increment = (SubLObject)hash_table_utilities.ONE_INTEGER;
        }
        if (initial_val == hash_table_utilities.UNPROVIDED) {
            initial_val = increment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hash_table_utilities.NIL != Types.hash_table_p(table) : table;
        final SubLObject val = Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED);
        if (hash_table_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && hash_table_utilities.NIL != val && !val.isNumber()) {
            Errors.error((SubLObject)hash_table_utilities.$str10$The_key__S_maps_to_the_non_numeri, key, val, table);
        }
        return Hashtables.sethash(key, table, (hash_table_utilities.NIL != val) ? Numbers.add(val, increment) : initial_val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 8988L)
    public static SubLObject nunion_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        return Hashtables.sethash(key, table, conses_high.nunion(Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), items, test, (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9119L)
    public static SubLObject nset_difference_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        return Hashtables.sethash(key, table, conses_high.nset_difference(Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), items, test, (SubLObject)hash_table_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9268L)
    public static SubLObject hash_difference(final SubLObject hash1, final SubLObject hash2, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        SubLObject result = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject val = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash1);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (hash_table_utilities.NIL == Functions.funcall(test, val, Hashtables.gethash(key, hash2, (SubLObject)hash_table_utilities.UNPROVIDED))) {
                    result = (SubLObject)ConsesLow.cons(key, result);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9577L)
    public static SubLObject hash_existence_difference(final SubLObject hash1, final SubLObject hash2) {
        SubLObject result = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject val = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash1);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (hash_table_utilities.$kw11$NOTHING == Hashtables.gethash(key, hash2, (SubLObject)hash_table_utilities.$kw11$NOTHING)) {
                    result = (SubLObject)ConsesLow.cons(key, result);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9855L)
    public static SubLObject hash_memberP(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject member_test, SubLObject member_key) {
        if (member_test == hash_table_utilities.UNPROVIDED) {
            member_test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        if (member_key == hash_table_utilities.UNPROVIDED) {
            member_key = Symbols.symbol_function((SubLObject)hash_table_utilities.IDENTITY);
        }
        return subl_promotions.memberP(item, Hashtables.gethash(key, table, (SubLObject)hash_table_utilities.UNPROVIDED), member_test, member_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 10015L)
    public static SubLObject all_elements_in_hashP(final SubLObject list, final SubLObject hash) {
        SubLObject missingP = (SubLObject)hash_table_utilities.NIL;
        if (hash_table_utilities.NIL == missingP) {
            SubLObject csome_list_var = list;
            SubLObject key = (SubLObject)hash_table_utilities.NIL;
            key = csome_list_var.first();
            while (hash_table_utilities.NIL == missingP && hash_table_utilities.NIL != csome_list_var) {
                if (hash_table_utilities.NIL == Hashtables.gethash(key, hash, (SubLObject)hash_table_utilities.UNPROVIDED)) {
                    missingP = (SubLObject)hash_table_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                key = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(hash_table_utilities.NIL == missingP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 10296L)
    public static SubLObject sort_hash_table_data(final SubLObject hashtable, final SubLObject predicate, SubLObject key) {
        if (key == hash_table_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)hash_table_utilities.IDENTITY);
        }
        assert hash_table_utilities.NIL != Types.hash_table_p(hashtable) : hashtable;
        final SubLObject total = Hashtables.hash_table_count(hashtable);
        if (total.numG((SubLObject)hash_table_utilities.ZERO_INTEGER)) {
            SubLObject sort_vec = Vectors.make_vector(total, (SubLObject)hash_table_utilities.UNPROVIDED);
            SubLObject v_answer = (SubLObject)hash_table_utilities.NIL;
            SubLObject index = (SubLObject)hash_table_utilities.ZERO_INTEGER;
            SubLObject hash_key = (SubLObject)hash_table_utilities.NIL;
            SubLObject val = (SubLObject)hash_table_utilities.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    hash_key = Hashtables.getEntryKey(cdohash_entry);
                    val = Hashtables.getEntryValue(cdohash_entry);
                    Vectors.set_aref(sort_vec, index, val);
                    index = Numbers.add(index, (SubLObject)hash_table_utilities.ONE_INTEGER);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            sort_vec = Sort.sort(sort_vec, predicate, key);
            SubLObject cdotimes_end_var;
            SubLObject index_$1;
            for (cdotimes_end_var = Sequences.length(sort_vec), index_$1 = (SubLObject)hash_table_utilities.NIL, index_$1 = (SubLObject)hash_table_utilities.ZERO_INTEGER; index_$1.numL(cdotimes_end_var); index_$1 = Numbers.add(index_$1, (SubLObject)hash_table_utilities.ONE_INTEGER)) {
                v_answer = (SubLObject)ConsesLow.cons(Vectors.aref(sort_vec, index_$1), v_answer);
            }
            return Sequences.nreverse(v_answer);
        }
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 10919L)
    public static SubLObject hash_first_n(final SubLObject n, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)hash_table_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)hash_table_utilities.NIL;
        SubLObject catch_var = (SubLObject)hash_table_utilities.NIL;
        try {
            thread.throwStack.push(hash_table_utilities.$kw12$MAPPING_DONE);
            SubLObject key = (SubLObject)hash_table_utilities.NIL;
            SubLObject val = (SubLObject)hash_table_utilities.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    val = Hashtables.getEntryValue(cdohash_entry);
                    if (count.numGE(n)) {
                        utilities_macros.mapping_finished();
                    }
                    count = Numbers.add(count, (SubLObject)hash_table_utilities.ONE_INTEGER);
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, val), result);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)hash_table_utilities.$kw12$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11393L)
    public static SubLObject list_table_keys(final SubLObject hash_table) {
        return hash_table_keys(hash_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11469L)
    public static SubLObject hash_table_arbitrary_key(final SubLObject hash_table) {
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject val = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            if (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                return key;
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11632L)
    public static SubLObject hash_table_arbitrary_value(final SubLObject hash_table) {
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject val = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            if (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                return val;
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11799L)
    public static SubLObject hash_table_random_key(final SubLObject hash_table) {
        SubLObject iterations = random.random(Hashtables.hash_table_count(hash_table));
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (!iterations.isPositive()) {
                    return key;
                }
                iterations = Numbers.subtract(iterations, (SubLObject)hash_table_utilities.ONE_INTEGER);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hash_table_arbitrary_key(hash_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12216L)
    public static SubLObject hash_table_random_value(final SubLObject hash_table) {
        SubLObject iterations = random.random(Hashtables.hash_table_count(hash_table));
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (!iterations.isPositive()) {
                    return value;
                }
                iterations = Numbers.subtract(iterations, (SubLObject)hash_table_utilities.ONE_INTEGER);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hash_table_arbitrary_value(hash_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12639L)
    public static SubLObject hash_table_keys(final SubLObject hash_table) {
        return hash_table_keys_or_values(hash_table, (SubLObject)hash_table_utilities.$kw13$KEYS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12780L)
    public static SubLObject hash_table_values(final SubLObject hash_table) {
        return hash_table_keys_or_values(hash_table, (SubLObject)hash_table_utilities.$kw14$VALUES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12927L)
    public static SubLObject hash_table_keys_or_values(final SubLObject hash_table, final SubLObject type) {
        assert hash_table_utilities.NIL != Types.hash_table_p(hash_table) : hash_table;
        if (hash_table_utilities.NIL == hash_table_empty_p(hash_table)) {
            final SubLObject expected_size = Hashtables.hash_table_count(hash_table);
            SubLObject cursor;
            final SubLObject v_answer = cursor = (SubLObject)ConsesLow.make_list(Numbers.max((SubLObject)hash_table_utilities.ONE_INTEGER, expected_size), (SubLObject)hash_table_utilities.UNPROVIDED);
            SubLObject previous = (SubLObject)hash_table_utilities.$kw15$UNINTIALIZED;
            final SubLObject get_keysP = Equality.eq(type, (SubLObject)hash_table_utilities.$kw13$KEYS);
            SubLObject key = (SubLObject)hash_table_utilities.NIL;
            SubLObject value = (SubLObject)hash_table_utilities.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    if (hash_table_utilities.NIL != cursor) {
                        if (hash_table_utilities.NIL != get_keysP) {
                            ConsesLow.rplaca(cursor, key);
                        }
                        else {
                            ConsesLow.rplaca(cursor, value);
                        }
                        previous = cursor;
                        cursor = cursor.rest();
                    }
                    else {
                        if (hash_table_utilities.NIL != get_keysP) {
                            ConsesLow.rplacd(previous, (SubLObject)ConsesLow.cons(key, (SubLObject)hash_table_utilities.NIL));
                        }
                        else {
                            ConsesLow.rplacd(previous, (SubLObject)ConsesLow.cons(value, (SubLObject)hash_table_utilities.NIL));
                        }
                        previous = previous.rest();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            if (hash_table_utilities.NIL != cursor) {
                ConsesLow.rplacd(previous, (SubLObject)hash_table_utilities.NIL);
            }
            return v_answer;
        }
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 13999L)
    public static SubLObject hash_table_keys_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        SubLObject keys = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (hash_table_utilities.NIL != Functions.funcall(test, value, target_value)) {
                    keys = (SubLObject)ConsesLow.cons(key, keys);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 14338L)
    public static SubLObject random_hash_table_key_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        return list_utilities.random_element(hash_table_keys_with_value(hash_table, target_value, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 14605L)
    public static SubLObject hash_table_to_alist(final SubLObject hash_table) {
        assert hash_table_utilities.NIL != Types.hash_table_p(hash_table) : hash_table;
        final SubLObject test = Hashtables.hash_table_test(hash_table);
        SubLObject alist = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, value), alist);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Values.values(alist, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 14987L)
    public static SubLObject new_hash_table_from_alist(final SubLObject alist, SubLObject test) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQL);
        }
        final SubLObject hash = Hashtables.make_hash_table(Sequences.length(alist), test, (SubLObject)hash_table_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)hash_table_utilities.NIL;
        cons = cdolist_list_var.first();
        while (hash_table_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)hash_table_utilities.NIL;
            SubLObject value = (SubLObject)hash_table_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hash_table_utilities.$list5);
            key = current.first();
            current = (value = current.rest());
            Hashtables.sethash(key, hash, value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return hash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 15196L)
    public static SubLObject get_table_values(final SubLObject hashtable) {
        SubLObject ans = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject val = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, val), ans);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 15384L)
    public static SubLObject hash_table_values_min_length(final SubLObject table, SubLObject v_default) {
        if (v_default == hash_table_utilities.UNPROVIDED) {
            v_default = (SubLObject)hash_table_utilities.ZERO_INTEGER;
        }
        SubLObject min_length = (SubLObject)hash_table_utilities.NIL;
        if (table.isHashtable()) {
            SubLObject key = (SubLObject)hash_table_utilities.NIL;
            SubLObject value = (SubLObject)hash_table_utilities.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    if (!value.isCons()) {
                        continue;
                    }
                    if (hash_table_utilities.NIL == min_length) {
                        min_length = Sequences.length(value);
                    }
                    else {
                        if (hash_table_utilities.ZERO_INTEGER.numE(min_length)) {
                            continue;
                        }
                        final SubLObject length = Sequences.length(value);
                        if (!min_length.numG(length)) {
                            continue;
                        }
                        min_length = length;
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return min_length.isNumber() ? min_length : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 15949L)
    public static SubLObject hash_table_values_min_count(final SubLObject table, SubLObject v_default) {
        if (v_default == hash_table_utilities.UNPROVIDED) {
            v_default = (SubLObject)hash_table_utilities.ZERO_INTEGER;
        }
        SubLObject min_count = (SubLObject)hash_table_utilities.NIL;
        if (table.isHashtable()) {
            SubLObject key = (SubLObject)hash_table_utilities.NIL;
            SubLObject value = (SubLObject)hash_table_utilities.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    if (!value.isHashtable()) {
                        continue;
                    }
                    if (hash_table_utilities.NIL == min_count) {
                        min_count = Hashtables.hash_table_count(value);
                    }
                    else {
                        if (hash_table_utilities.ZERO_INTEGER.numE(min_count)) {
                            continue;
                        }
                        final SubLObject count = Hashtables.hash_table_count(value);
                        if (!min_count.numG(count)) {
                            continue;
                        }
                        min_count = count;
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return min_count.isNumber() ? min_count : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 16534L)
    public static SubLObject hash_list_elements(final SubLObject list, SubLObject test, SubLObject size, SubLObject func) {
        if (test == hash_table_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hash_table_utilities.EQUAL);
        }
        if (size == hash_table_utilities.UNPROVIDED) {
            size = Sequences.length(list);
        }
        if (func == hash_table_utilities.UNPROVIDED) {
            func = Symbols.symbol_function((SubLObject)hash_table_utilities.$sym16$TRUE);
        }
        final SubLObject table = Hashtables.make_hash_table(size, test, (SubLObject)hash_table_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = list;
        SubLObject x = (SubLObject)hash_table_utilities.NIL;
        x = cdolist_list_var.first();
        while (hash_table_utilities.NIL != cdolist_list_var) {
            Hashtables.sethash(x, table, (SubLObject)(func.eql(Symbols.symbol_function((SubLObject)hash_table_utilities.$sym16$TRUE)) ? hash_table_utilities.T : Functions.funcall(func, x)));
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 16908L)
    public static SubLObject find_in_hash_if(final SubLObject hashtable, final SubLObject key_test, final SubLObject value_test) {
        SubLObject matched_keys = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (hash_table_utilities.NIL != Functions.funcall(key_test, key) && hash_table_utilities.NIL != Functions.funcall(value_test, value)) {
                    matched_keys = (SubLObject)ConsesLow.cons(key, matched_keys);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return matched_keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 17276L)
    public static SubLObject find_in_hash_if_not(final SubLObject hashtable, final SubLObject key_test, final SubLObject value_test) {
        SubLObject matched_keys = (SubLObject)hash_table_utilities.NIL;
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (hash_table_utilities.NIL != Functions.funcall(key_test, key)) {
                    if (hash_table_utilities.NIL != Functions.funcall(value_test, value)) {
                        continue;
                    }
                    matched_keys = (SubLObject)ConsesLow.cons(key, matched_keys);
                }
                else {
                    matched_keys = (SubLObject)ConsesLow.cons(key, matched_keys);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return matched_keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 17787L)
    public static SubLObject printhash(final SubLObject hashtable, SubLObject stream) {
        if (stream == hash_table_utilities.UNPROVIDED) {
            stream = (SubLObject)hash_table_utilities.T;
        }
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject val = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                PrintLow.format(stream, (SubLObject)hash_table_utilities.$str17$_S_____S__, key, val);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 17925L)
    public static SubLObject hashtable_key_collision_count(final SubLObject hashtable) {
        assert hash_table_utilities.NIL != Types.hash_table_p(hashtable) : hashtable;
        final SubLObject key_count = Hashtables.hash_table_count(hashtable);
        final SubLObject collision_table = Hashtables.make_hash_table(key_count, Symbols.symbol_function((SubLObject)hash_table_utilities.EQL), (SubLObject)hash_table_utilities.UNPROVIDED);
        SubLObject key = (SubLObject)hash_table_utilities.NIL;
        SubLObject value = (SubLObject)hash_table_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hashtable);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                Hashtables.sethash(Hashtables.gethash_bucket(key, hashtable), collision_table, Numbers.add(Hashtables.gethash(Hashtables.gethash_bucket(key, hashtable), collision_table, (SubLObject)hash_table_utilities.ZERO_INTEGER), (SubLObject)hash_table_utilities.ONE_INTEGER));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject sxhash_count = Hashtables.hash_table_count(collision_table);
        final SubLObject collision_count = Numbers.subtract(key_count, sxhash_count);
        return collision_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 18555L)
    public static SubLObject hashtable_key_collision_probability(final SubLObject hashtable) {
        return Numbers.divide(hashtable_key_collision_count(hashtable), Hashtables.hash_table_count(hashtable));
    }
    
    public static SubLObject declare_hash_table_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "valid_hash_test_symbols", "VALID-HASH-TEST-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "valid_hash_test_p", "VALID-HASH-TEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_test_to_symbol", "HASH-TEST-TO-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "to_hash_test", "TO-HASH-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_empty_p", "HASH-TABLE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "rehash", "REHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "rehash_if_stale", "REHASH-IF-STALE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_staleP", "HASH-TABLE-STALE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "push_hash", "PUSH-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "pushnew_hash", "PUSHNEW-HASH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "push_to_end_hash", "PUSH-TO-END-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_add_to_value_sorted", "HASH-ADD-TO-VALUE-SORTED", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "pushnew_to_end_hash", "PUSHNEW-TO-END-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "pop_hash", "POP-HASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "remove_value_from_hash", "REMOVE-VALUE-FROM-HASH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "gethash_first", "GETHASH-FIRST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "sethash_first", "SETHASH-FIRST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "nconc_hash", "NCONC-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "nconc_to_end_hash", "NCONC-TO-END-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "copy_hash_table_values_into", "COPY-HASH-TABLE-VALUES-INTO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "copy_hashtable", "COPY-HASHTABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "sort_hash_value", "SORT-HASH-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "delete_hash", "DELETE-HASH", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "prune_hash", "PRUNE-HASH", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "cinc_hash", "CINC-HASH", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "nunion_hash", "NUNION-HASH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "nset_difference_hash", "NSET-DIFFERENCE-HASH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_difference", "HASH-DIFFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_existence_difference", "HASH-EXISTENCE-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_memberP", "HASH-MEMBER?", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "all_elements_in_hashP", "ALL-ELEMENTS-IN-HASH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "sort_hash_table_data", "SORT-HASH-TABLE-DATA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_first_n", "HASH-FIRST-N", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "list_table_keys", "LIST-TABLE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_arbitrary_key", "HASH-TABLE-ARBITRARY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_arbitrary_value", "HASH-TABLE-ARBITRARY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_random_key", "HASH-TABLE-RANDOM-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_random_value", "HASH-TABLE-RANDOM-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_keys", "HASH-TABLE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_values", "HASH-TABLE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_keys_or_values", "HASH-TABLE-KEYS-OR-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_keys_with_value", "HASH-TABLE-KEYS-WITH-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "random_hash_table_key_with_value", "RANDOM-HASH-TABLE-KEY-WITH-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_to_alist", "HASH-TABLE-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "new_hash_table_from_alist", "NEW-HASH-TABLE-FROM-ALIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "get_table_values", "GET-TABLE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_values_min_length", "HASH-TABLE-VALUES-MIN-LENGTH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_table_values_min_count", "HASH-TABLE-VALUES-MIN-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hash_list_elements", "HASH-LIST-ELEMENTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "find_in_hash_if", "FIND-IN-HASH-IF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "find_in_hash_if_not", "FIND-IN-HASH-IF-NOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "printhash", "PRINTHASH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hashtable_key_collision_count", "HASHTABLE-KEY-COLLISION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hash_table_utilities", "hashtable_key_collision_probability", "HASHTABLE-KEY-COLLISION-PROBABILITY", 1, 0, false);
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    public static SubLObject init_hash_table_utilities_file() {
        hash_table_utilities.$valid_hash_test_symbols$ = SubLFiles.defconstant("*VALID-HASH-TEST-SYMBOLS*", (SubLObject)hash_table_utilities.$list0);
        hash_table_utilities.$valid_hash_test_functions$ = SubLFiles.defconstant("*VALID-HASH-TEST-FUNCTIONS*", (SubLObject)ConsesLow.list(Symbols.symbol_function((SubLObject)hash_table_utilities.EQ), Symbols.symbol_function((SubLObject)hash_table_utilities.EQL), Symbols.symbol_function((SubLObject)hash_table_utilities.EQUAL), Symbols.symbol_function((SubLObject)hash_table_utilities.EQUALP)));
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    public static SubLObject setup_hash_table_utilities_file() {
        return (SubLObject)hash_table_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_hash_table_utilities_file();
    }
    
    public void initializeVariables() {
        init_hash_table_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_hash_table_utilities_file();
    }
    
    static {
        me = (SubLFile)new hash_table_utilities();
        hash_table_utilities.$valid_hash_test_symbols$ = null;
        hash_table_utilities.$valid_hash_test_functions$ = null;
        $list0 = ConsesLow.list((SubLObject)hash_table_utilities.EQ, (SubLObject)hash_table_utilities.EQL, (SubLObject)hash_table_utilities.EQUAL, (SubLObject)hash_table_utilities.EQUALP);
        $sym1$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym2$SYMBOL_FUNCTION = SubLObjectFactory.makeSymbol("SYMBOL-FUNCTION");
        $sym3$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $str4$_S_cannot_be_coerced_into_a_valid = SubLObjectFactory.makeString("~S cannot be coerced into a valid SubL hash test");
        $list5 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym6$STRING__ = SubLObjectFactory.makeSymbol("STRING<=");
        $sym7$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym8$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $str9$Corrupted_hash_table__attempting_ = SubLObjectFactory.makeString("Corrupted hash table; attempting to add values on a non-listp ~a.~%");
        $str10$The_key__S_maps_to_the_non_numeri = SubLObjectFactory.makeString("The key ~S maps to the non-numeric value ~S in the hashtable ~A.");
        $kw11$NOTHING = SubLObjectFactory.makeKeyword("NOTHING");
        $kw12$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $kw13$KEYS = SubLObjectFactory.makeKeyword("KEYS");
        $kw14$VALUES = SubLObjectFactory.makeKeyword("VALUES");
        $kw15$UNINTIALIZED = SubLObjectFactory.makeKeyword("UNINTIALIZED");
        $sym16$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $str17$_S_____S__ = SubLObjectFactory.makeString("~S -> ~S~%");
    }
}

/*

	Total time: 243 ms
	
*/